/***********************************************************************
 * Copyright (c) 2013-2024 Commonwealth Computer Research, Inc.
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Apache License, Version 2.0
 * which accompanies this distribution and is available at
 * http://www.opensource.org/licenses/apache2.0.php.
 ***********************************************************************/

package org.locationtech.geomesa.index.planning

import com.typesafe.scalalogging.LazyLogging
import org.geotools.api.data.Query
import org.geotools.api.feature.simple.{SimpleFeature, SimpleFeatureType}
import org.geotools.api.filter.Filter
import org.geotools.api.filter.sort.SortOrder
import org.locationtech.geomesa.index.api.QueryPlan
import org.locationtech.geomesa.index.conf.QueryHints
import org.locationtech.geomesa.index.conf.QueryHints.RichHints
import org.locationtech.geomesa.index.geotools.GeoMesaDataStore
import org.locationtech.geomesa.index.iterators.{BinAggregatingScan, DensityScan}
import org.locationtech.geomesa.index.planning.QueryInterceptor.QueryInterceptorFactory
import org.locationtech.geomesa.index.planning.QueryRunner.QueryResult
import org.locationtech.geomesa.index.utils.Reprojection.QueryReferenceSystems
import org.locationtech.geomesa.index.utils.{ExplainLogging, Explainer, Reprojection, SortingSimpleFeatureIterator}
import org.locationtech.geomesa.utils.bin.BinaryOutputEncoder
import org.locationtech.geomesa.utils.cache.SoftThreadLocal
import org.locationtech.geomesa.utils.collection.{CloseableIterator, SelfClosingIterator}
import org.locationtech.geomesa.utils.geotools.Transform
import org.locationtech.geomesa.utils.geotools.Transform.Transforms
import org.locationtech.geomesa.utils.iterators.ExceptionalIterator
import org.locationtech.geomesa.utils.stats.{MethodProfiling, StatParser}

import scala.collection.JavaConverters._

/**
 * Plans and executes queries against geomesa
 */
class QueryPlanner[DS <: GeoMesaDataStore[DS]](ds: DS) extends QueryRunner with MethodProfiling with LazyLogging {

  override protected val interceptors: QueryInterceptorFactory = ds.interceptors

  /**
    * Plan the query, but don't execute it - used for m/r jobs and explain query
    *
    * @param sft simple feature type
    * @param query query to plan
    * @param index override index to use for executing the query
    * @param output planning explanation output
    * @return
    */
  def planQuery(
      sft: SimpleFeatureType,
      query: Query,
      index: Option[String] = None,
      output: Explainer = new ExplainLogging): Seq[QueryPlan[DS]] =
    getQueryPlans(sft, configureQuery(sft, query), query.getFilter, index, output).toList // toList forces evaluation of entire iterator

  override def runQuery(sft: SimpleFeatureType, original: Query, explain: Explainer): QueryResult = {
    val query = configureQuery(sft, original)
    val plans = getQueryPlans(sft, query, original.getFilter, None, explain)
    QueryResult(query.getHints.getReturnSft, query.getHints, run(query, plans))
  }

  private def run(query: Query, plans: Seq[QueryPlan[DS]])(): CloseableIterator[SimpleFeature] = {
    var iterator = SelfClosingIterator(plans.iterator).flatMap(p => p.scan(ds).map(p.resultsToFeatures.apply))

    if (!query.getHints.isSkipReduce) {
      plans.headOption.flatMap(_.reducer).foreach { reducer =>
        require(plans.tail.forall(_.reducer.contains(reducer)), "Reduce must be the same in all query plans")
        iterator = reducer.apply(iterator)
      }
    }

    plans.headOption.flatMap(_.sort).foreach { sort =>
      require(plans.tail.forall(_.sort.contains(sort)), "Sort must be the same in all query plans")
      iterator = new SortingSimpleFeatureIterator(iterator, sort)
    }

    plans.headOption.flatMap(_.maxFeatures).foreach { maxFeatures =>
      require(plans.tail.forall(_.maxFeatures.contains(maxFeatures)),
        "Max features must be the same in all query plans")
      if (query.getHints.getReturnSft == BinaryOutputEncoder.BinEncodedSft) {
        // bin queries pack multiple records into each feature
        // to count the records, we have to count the total bytes coming back, instead of the number of features
        val label = query.getHints.getBinLabelField.isDefined
        iterator = new BinaryOutputEncoder.FeatureLimitingIterator(iterator, maxFeatures, label)
      } else {
        iterator = iterator.take(maxFeatures)
      }
    }

    plans.headOption.flatMap(_.projection).foreach { projection =>
      require(plans.tail.forall(_.projection.contains(projection)), "Projection must be the same in all query plans")
      val project = Reprojection(query.getHints.getReturnSft, projection)
      iterator = iterator.map(project.apply)
    }

    // wrap in an exceptional iterator to prevent geoserver from suppressing any exceptions
    ExceptionalIterator(iterator)
  }

  /**
    * Set up the query plans and strategies used to execute them
    *
    * @param sft simple feature type
    * @param query query to plan - must have been run through `configureQuery` to set expected hints, etc
    * @param requested override index to use for executing the query
    * @param output planning explanation output
    * @return
    */
  private def getQueryPlans(
      sft: SimpleFeatureType,
      query: Query,
      original: Filter,
      requested: Option[String],
      output: Explainer): Seq[QueryPlan[DS]] = {
    import org.locationtech.geomesa.filter.filterToString

    profile(time => output(s"Query planning took ${time}ms")) {
      val hints = query.getHints

      output.pushLevel(s"Planning '${query.getTypeName}' ${filterToString(query.getFilter)}")
      output(s"Original filter: ${filterToString(original)}")
      output(s"Hints: bin[${hints.isBinQuery}] arrow[${hints.isArrowQuery}] density[${hints.isDensityQuery}] " +
          s"stats[${hints.isStatsQuery}] " +
          s"sampling[${hints.getSampling.map { case (s, f) => s"$s${f.map(":" + _).getOrElse("")}"}.getOrElse("none")}]")
      output(s"Sort: ${query.getHints.getSortFields.map(QueryHints.sortReadableString).getOrElse("none")}")
      output(s"Transforms: ${query.getHints.getTransformDefinition.map(t => if (t.isEmpty) { "empty" } else { t }).getOrElse("none")}")
      output(s"Max features: ${query.getHints.getMaxFeatures.getOrElse("none")}")
      hints.getFilterCompatibility.foreach(c => output(s"Filter compatibility: $c"))

      output.pushLevel("Strategy selection:")
      val requestedIndex = requested.orElse(hints.getRequestedIndex)
      val transform = query.getHints.getTransformSchema
      val evaluation = query.getHints.getCostEvaluation
      val strategies =
        StrategyDecider.getFilterPlan(ds, sft, query.getFilter, transform, evaluation, requestedIndex, output)
      output.popLevel()

      var strategyCount = 1
      strategies.map { strategy =>
        def complete(plan: QueryPlan[DS], time: Long): Unit = {
          plan.explain(output)
          output(s"Plan creation took ${time}ms").popLevel()
        }

        output.pushLevel(s"Strategy $strategyCount of ${strategies.length}: ${strategy.index}")
        strategyCount += 1
        output(s"Strategy filter: $strategy")
        profile(complete _) {
          val qs = strategy.getQueryStrategy(hints, output)
          // query guard hook
          interceptors(sft).foreach(_.guard(qs).foreach(e => throw e))
<<<<<<< HEAD
<<<<<<< HEAD
<<<<<<< HEAD
<<<<<<< HEAD
<<<<<<< HEAD
<<<<<<< HEAD
<<<<<<< HEAD
<<<<<<< HEAD
<<<<<<< HEAD
<<<<<<< HEAD
<<<<<<< HEAD
<<<<<<< HEAD
<<<<<<< HEAD
<<<<<<< HEAD
<<<<<<< HEAD
<<<<<<< HEAD
<<<<<<< HEAD
<<<<<<< HEAD
<<<<<<< HEAD
<<<<<<< HEAD
<<<<<<< HEAD
<<<<<<< HEAD
<<<<<<< HEAD
<<<<<<< HEAD
<<<<<<< HEAD
<<<<<<< HEAD
=======
>>>>>>> bad30768f2 (GEOMESA-3214 Fix warning about full table scan with Filter.EXCLUDE)
=======
>>>>>>> d022c4bef (GEOMESA-3203 Short-circuit disjoint filters in index scans (#2862))
=======
=======
<<<<<<< HEAD
=======
>>>>>>> locatelli-main
<<<<<<< HEAD
=======
>>>>>>> locatelli-main
<<<<<<< HEAD
=======
>>>>>>> locatelli-main
<<<<<<< HEAD
=======
>>>>>>> locatelli-main
<<<<<<< HEAD
=======
>>>>>>> locatelli-main
<<<<<<< HEAD
=======
>>>>>>> locatelli-main
<<<<<<< HEAD
=======
>>>>>>> locatelli-main
<<<<<<< HEAD
=======
>>>>>>> locatelli-main
<<<<<<< HEAD
=======
>>>>>>> locatelli-main
<<<<<<< HEAD
=======
>>>>>>> locatelli-main
<<<<<<< HEAD
=======
>>>>>>> locatelli-main
<<<<<<< HEAD
=======
>>>>>>> locatelli-main
<<<<<<< HEAD
<<<<<<< HEAD
<<<<<<< HEAD
<<<<<<< HEAD
<<<<<<< HEAD
<<<<<<< HEAD
<<<<<<< HEAD
<<<<<<< HEAD
<<<<<<< HEAD
<<<<<<< HEAD
<<<<<<< HEAD
<<<<<<< HEAD
<<<<<<< HEAD
<<<<<<< HEAD
<<<<<<< HEAD
<<<<<<< HEAD
<<<<<<< HEAD
<<<<<<< HEAD
<<<<<<< HEAD
<<<<<<< HEAD
<<<<<<< HEAD
<<<<<<< HEAD
<<<<<<< HEAD
<<<<<<< HEAD
<<<<<<< HEAD
<<<<<<< HEAD
<<<<<<< HEAD
<<<<<<< HEAD
<<<<<<< HEAD
=======
>>>>>>> bad30768f2 (GEOMESA-3214 Fix warning about full table scan with Filter.EXCLUDE)
=======
=======
=======
>>>>>>> bad30768f2 (GEOMESA-3214 Fix warning about full table scan with Filter.EXCLUDE)
>>>>>>> 089a9f3f18 (GEOMESA-3214 Fix warning about full table scan with Filter.EXCLUDE)
=======
>>>>>>> d022c4bef (GEOMESA-3203 Short-circuit disjoint filters in index scans (#2862))
=======
>>>>>>> e85778a06f (GEOMESA-3203 Short-circuit disjoint filters in index scans (#2862))
<<<<<<< HEAD
<<<<<<< HEAD
<<<<<<< HEAD
<<<<<<< HEAD
<<<<<<< HEAD
<<<<<<< HEAD
<<<<<<< HEAD
<<<<<<< HEAD
<<<<<<< HEAD
<<<<<<< HEAD
<<<<<<< HEAD
<<<<<<< HEAD
>>>>>>> locatelli-main
<<<<<<< HEAD
<<<<<<< HEAD
<<<<<<< HEAD
<<<<<<< HEAD
<<<<<<< HEAD
<<<<<<< HEAD
=======
<<<<<<< HEAD
<<<<<<< HEAD
<<<<<<< HEAD
<<<<<<< HEAD
<<<<<<< HEAD
<<<<<<< HEAD
<<<<<<< HEAD
<<<<<<< HEAD
<<<<<<< HEAD
<<<<<<< HEAD
<<<<<<< HEAD
<<<<<<< HEAD
<<<<<<< HEAD
<<<<<<< HEAD
=======
>>>>>>> locatelli-main
<<<<<<< HEAD
=======
>>>>>>> locatelli-main
<<<<<<< HEAD
=======
>>>>>>> locatelli-main
<<<<<<< HEAD
=======
>>>>>>> locatelli-main
<<<<<<< HEAD
=======
>>>>>>> locatelli-main
<<<<<<< HEAD
=======
>>>>>>> locatelli-main
<<<<<<< HEAD
=======
>>>>>>> locatelli-main
=======
>>>>>>> locatelli-main
=======
>>>>>>> locatelli-main
=======
>>>>>>> locatelli-main
=======
>>>>>>> locatelli-main
=======
>>>>>>> locatelli-main
=======
=======
>>>>>>> d022c4befe (GEOMESA-3203 Short-circuit disjoint filters in index scans (#2862))
>>>>>>> e1f7e73003 (GEOMESA-3203 Short-circuit disjoint filters in index scans (#2862))
=======
>>>>>>> 825515ce74 (GEOMESA-3214 Fix warning about full table scan with Filter.EXCLUDE)
=======
>>>>>>> c738f63bd9 (GEOMESA-3254 Add Bloop build support)
=======
>>>>>>> b76027496d (GEOMESA-3203 Short-circuit disjoint filters in index scans (#2862))
=======
>>>>>>> 8e01f6263e (GEOMESA-3214 Fix warning about full table scan with Filter.EXCLUDE)
=======
>>>>>>> c73145a433 (GEOMESA-3203 Short-circuit disjoint filters in index scans (#2862))
=======
>>>>>>> 19e80a7633 (GEOMESA-3214 Fix warning about full table scan with Filter.EXCLUDE)
=======
>>>>>>> 13656f5052 (GEOMESA-3254 Add Bloop build support)
=======
>>>>>>> 2582e9f50b (GEOMESA-3203 Short-circuit disjoint filters in index scans (#2862))
=======
>>>>>>> e14a4b4a14 (GEOMESA-3214 Fix warning about full table scan with Filter.EXCLUDE)
=======
>>>>>>> 00d9ed0bf2 (GEOMESA-3203 Short-circuit disjoint filters in index scans (#2862))
=======
>>>>>>> 029ad6f319 (GEOMESA-3214 Fix warning about full table scan with Filter.EXCLUDE)
<<<<<<< HEAD
<<<<<<< HEAD
<<<<<<< HEAD
<<<<<<< HEAD
<<<<<<< HEAD
<<<<<<< HEAD
<<<<<<< HEAD
<<<<<<< HEAD
<<<<<<< HEAD
<<<<<<< HEAD
<<<<<<< HEAD
<<<<<<< HEAD
>>>>>>> locatelli-main
=======
>>>>>>> locatelli-main
=======
>>>>>>> locatelli-main
=======
>>>>>>> locatelli-main
=======
>>>>>>> locatelli-main
=======
>>>>>>> locatelli-main
=======
>>>>>>> locatelli-main
=======
>>>>>>> locatelli-main
=======
>>>>>>> locatelli-main
=======
>>>>>>> locatelli-main
=======
>>>>>>> locatelli-main
=======
>>>>>>> locatelli-main
=======
>>>>>>> locatelli-main
=======
>>>>>>> c7527e3843 (GEOMESA-3214 Fix warning about full table scan with Filter.EXCLUDE)
=======
>>>>>>> f1532f2313 (GEOMESA-3254 Add Bloop build support)
=======
<<<<<<< HEAD
<<<<<<< HEAD
<<<<<<< HEAD
<<<<<<< HEAD
<<<<<<< HEAD
<<<<<<< HEAD
<<<<<<< HEAD
<<<<<<< HEAD
<<<<<<< HEAD
<<<<<<< HEAD
<<<<<<< HEAD
<<<<<<< HEAD
<<<<<<< HEAD
=======
<<<<<<< HEAD
<<<<<<< HEAD
>>>>>>> locatelli-main
=======
<<<<<<< HEAD
>>>>>>> locatelli-main
=======
>>>>>>> locatelli-main
=======
>>>>>>> locatelli-main
=======
>>>>>>> locatelli-main
=======
>>>>>>> locatelli-main
=======
>>>>>>> locatelli-main
=======
>>>>>>> locatelli-main
=======
>>>>>>> locatelli-main
=======
>>>>>>> locatelli-main
=======
>>>>>>> locatelli-main
=======
>>>>>>> locatelli-main
=======
>>>>>>> locatelli-main
>>>>>>> 7254911963 (GEOMESA-3203 Short-circuit disjoint filters in index scans (#2862))
=======
>>>>>>> a3651df0c4 (GEOMESA-3214 Fix warning about full table scan with Filter.EXCLUDE)
=======
<<<<<<< HEAD
<<<<<<< HEAD
<<<<<<< HEAD
<<<<<<< HEAD
<<<<<<< HEAD
<<<<<<< HEAD
<<<<<<< HEAD
<<<<<<< HEAD
<<<<<<< HEAD
<<<<<<< HEAD
<<<<<<< HEAD
<<<<<<< HEAD
<<<<<<< HEAD
=======
<<<<<<< HEAD
<<<<<<< HEAD
>>>>>>> locatelli-main
=======
<<<<<<< HEAD
>>>>>>> locatelli-main
=======
>>>>>>> locatelli-main
=======
>>>>>>> locatelli-main
=======
>>>>>>> locatelli-main
=======
>>>>>>> locatelli-main
=======
>>>>>>> locatelli-main
=======
>>>>>>> locatelli-main
=======
>>>>>>> locatelli-main
=======
>>>>>>> locatelli-main
=======
>>>>>>> locatelli-main
=======
>>>>>>> locatelli-main
=======
>>>>>>> locatelli-main
>>>>>>> b7410da0d3 (GEOMESA-3203 Short-circuit disjoint filters in index scans (#2862))
=======
>>>>>>> 3d9764749f (GEOMESA-3214 Fix warning about full table scan with Filter.EXCLUDE)
=======
<<<<<<< HEAD
<<<<<<< HEAD
<<<<<<< HEAD
<<<<<<< HEAD
<<<<<<< HEAD
<<<<<<< HEAD
<<<<<<< HEAD
<<<<<<< HEAD
<<<<<<< HEAD
<<<<<<< HEAD
<<<<<<< HEAD
<<<<<<< HEAD
<<<<<<< HEAD
=======
<<<<<<< HEAD
<<<<<<< HEAD
>>>>>>> locatelli-main
=======
<<<<<<< HEAD
>>>>>>> locatelli-main
=======
>>>>>>> locatelli-main
=======
>>>>>>> locatelli-main
=======
>>>>>>> locatelli-main
=======
>>>>>>> locatelli-main
=======
>>>>>>> locatelli-main
=======
>>>>>>> locatelli-main
=======
>>>>>>> locatelli-main
=======
>>>>>>> locatelli-main
=======
>>>>>>> locatelli-main
=======
>>>>>>> locatelli-main
=======
>>>>>>> locatelli-main
>>>>>>> 5a4c24e020 (GEOMESA-3254 Add Bloop build support)
=======
>>>>>>> b2a371f6ff (GEOMESA-3203 Short-circuit disjoint filters in index scans (#2862))
=======
<<<<<<< HEAD
<<<<<<< HEAD
<<<<<<< HEAD
<<<<<<< HEAD
<<<<<<< HEAD
<<<<<<< HEAD
<<<<<<< HEAD
<<<<<<< HEAD
<<<<<<< HEAD
<<<<<<< HEAD
<<<<<<< HEAD
<<<<<<< HEAD
<<<<<<< HEAD
=======
<<<<<<< HEAD
<<<<<<< HEAD
>>>>>>> locatelli-main
=======
<<<<<<< HEAD
>>>>>>> locatelli-main
=======
>>>>>>> locatelli-main
=======
>>>>>>> locatelli-main
=======
>>>>>>> locatelli-main
=======
>>>>>>> locatelli-main
=======
>>>>>>> locatelli-main
=======
>>>>>>> locatelli-main
=======
>>>>>>> locatelli-main
=======
>>>>>>> locatelli-main
=======
>>>>>>> locatelli-main
=======
>>>>>>> locatelli-main
=======
>>>>>>> locatelli-main
>>>>>>> 9ddab1e4ef (GEOMESA-3214 Fix warning about full table scan with Filter.EXCLUDE)
=======
>>>>>>> c973459fb6 (GEOMESA-3203 Short-circuit disjoint filters in index scans (#2862))
=======
<<<<<<< HEAD
<<<<<<< HEAD
>>>>>>> ee55e5ab74 (GEOMESA-3214 Fix warning about full table scan with Filter.EXCLUDE)
<<<<<<< HEAD
<<<<<<< HEAD
<<<<<<< HEAD
<<<<<<< HEAD
<<<<<<< HEAD
<<<<<<< HEAD
<<<<<<< HEAD
<<<<<<< HEAD
<<<<<<< HEAD
<<<<<<< HEAD
<<<<<<< HEAD
>>>>>>> locationtech-main
=======
=======
<<<<<<< HEAD
=======
>>>>>>> locatelli-main
<<<<<<< HEAD
>>>>>>> ee55e5ab74 (GEOMESA-3214 Fix warning about full table scan with Filter.EXCLUDE)
=======
>>>>>>> locatelli-main
=======
>>>>>>> locatelli-main
=======
>>>>>>> locatelli-main
=======
>>>>>>> locatelli-main
=======
>>>>>>> locatelli-main
=======
>>>>>>> locatelli-main
=======
>>>>>>> locatelli-main
=======
>>>>>>> locatelli-main
=======
>>>>>>> locatelli-main
=======
>>>>>>> locatelli-main
=======
>>>>>>> locatelli-main
=======
>>>>>>> 8c519079d0 (GEOMESA-3214 Fix warning about full table scan with Filter.EXCLUDE)
=======
>>>>>>> 7a84c9d22d (GEOMESA-3254 Add Bloop build support)
=======
>>>>>>> fc398c6949 (GEOMESA-3203 Short-circuit disjoint filters in index scans (#2862))
=======
>>>>>>> 34b2d6632f (GEOMESA-3214 Fix warning about full table scan with Filter.EXCLUDE)
=======
>>>>>>> 13fb1c6150 (GEOMESA-3203 Short-circuit disjoint filters in index scans (#2862))
=======
>>>>>>> 1d05eb986e (GEOMESA-3214 Fix warning about full table scan with Filter.EXCLUDE)
=======
>>>>>>> b298e017f1 (GEOMESA-3254 Add Bloop build support)
=======
>>>>>>> 64e79ba0b0 (GEOMESA-3203 Short-circuit disjoint filters in index scans (#2862))
=======
>>>>>>> 19265e7a87 (GEOMESA-3214 Fix warning about full table scan with Filter.EXCLUDE)
=======
>>>>>>> 9d271849b7 (GEOMESA-3203 Short-circuit disjoint filters in index scans (#2862))
=======
>>>>>>> 9f601af8cc (GEOMESA-3214 Fix warning about full table scan with Filter.EXCLUDE)
=======
>>>>>>> 6033751879 (GEOMESA-3203 Short-circuit disjoint filters in index scans (#2862))
=======
>>>>>>> bc58bb16eb (GEOMESA-3214 Fix warning about full table scan with Filter.EXCLUDE)
=======
>>>>>>> aae8270e82 (GEOMESA-3203 Short-circuit disjoint filters in index scans (#2862))
=======
=======
>>>>>>> c7527e3843 (GEOMESA-3214 Fix warning about full table scan with Filter.EXCLUDE)
>>>>>>> 6e41de2827 (GEOMESA-3214 Fix warning about full table scan with Filter.EXCLUDE)
=======
=======
>>>>>>> c738f63bd9 (GEOMESA-3254 Add Bloop build support)
=======
>>>>>>> 7254911963 (GEOMESA-3203 Short-circuit disjoint filters in index scans (#2862))
=======
>>>>>>> b76027496d (GEOMESA-3203 Short-circuit disjoint filters in index scans (#2862))
=======
>>>>>>> 8e01f6263e (GEOMESA-3214 Fix warning about full table scan with Filter.EXCLUDE)
=======
>>>>>>> b7410da0d3 (GEOMESA-3203 Short-circuit disjoint filters in index scans (#2862))
=======
>>>>>>> c73145a433 (GEOMESA-3203 Short-circuit disjoint filters in index scans (#2862))
=======
>>>>>>> 19e80a7633 (GEOMESA-3214 Fix warning about full table scan with Filter.EXCLUDE)
=======
>>>>>>> 5a4c24e020 (GEOMESA-3254 Add Bloop build support)
=======
>>>>>>> 13656f5052 (GEOMESA-3254 Add Bloop build support)
=======
>>>>>>> 2582e9f50b (GEOMESA-3203 Short-circuit disjoint filters in index scans (#2862))
=======
>>>>>>> 9ddab1e4ef (GEOMESA-3214 Fix warning about full table scan with Filter.EXCLUDE)
=======
>>>>>>> e14a4b4a14 (GEOMESA-3214 Fix warning about full table scan with Filter.EXCLUDE)
=======
>>>>>>> 00d9ed0bf2 (GEOMESA-3203 Short-circuit disjoint filters in index scans (#2862))
=======
>>>>>>> ee55e5ab74 (GEOMESA-3214 Fix warning about full table scan with Filter.EXCLUDE)
=======
>>>>>>> 029ad6f319 (GEOMESA-3214 Fix warning about full table scan with Filter.EXCLUDE)
<<<<<<< HEAD
<<<<<<< HEAD
<<<<<<< HEAD
<<<<<<< HEAD
<<<<<<< HEAD
<<<<<<< HEAD
<<<<<<< HEAD
<<<<<<< HEAD
<<<<<<< HEAD
<<<<<<< HEAD
<<<<<<< HEAD
<<<<<<< HEAD
>>>>>>> locatelli-main
=======
>>>>>>> locatelli-main
=======
>>>>>>> locatelli-main
=======
>>>>>>> locatelli-main
=======
>>>>>>> locatelli-main
=======
>>>>>>> locatelli-main
=======
>>>>>>> locatelli-main
=======
>>>>>>> locatelli-main
=======
>>>>>>> locatelli-main
=======
>>>>>>> locatelli-main
=======
>>>>>>> locatelli-main
=======
>>>>>>> locatelli-main
=======
>>>>>>> locatelli-main
>>>>>>> d022c4befe (GEOMESA-3203 Short-circuit disjoint filters in index scans (#2862))
=======
>>>>>>> 4c943341c0 (GEOMESA-3214 Fix warning about full table scan with Filter.EXCLUDE)
=======
<<<<<<< HEAD
<<<<<<< HEAD
<<<<<<< HEAD
<<<<<<< HEAD
<<<<<<< HEAD
<<<<<<< HEAD
=======
<<<<<<< HEAD
<<<<<<< HEAD
<<<<<<< HEAD
<<<<<<< HEAD
<<<<<<< HEAD
<<<<<<< HEAD
<<<<<<< HEAD
<<<<<<< HEAD
<<<<<<< HEAD
<<<<<<< HEAD
>>>>>>> locationtech-main
=======
<<<<<<< HEAD
=======
>>>>>>> locatelli-main
<<<<<<< HEAD
=======
>>>>>>> locatelli-main
<<<<<<< HEAD
=======
>>>>>>> locatelli-main
<<<<<<< HEAD
=======
>>>>>>> locatelli-main
<<<<<<< HEAD
=======
>>>>>>> 6e41de2827 (GEOMESA-3214 Fix warning about full table scan with Filter.EXCLUDE)
=======
>>>>>>> b76027496d (GEOMESA-3203 Short-circuit disjoint filters in index scans (#2862))
<<<<<<< HEAD
<<<<<<< HEAD
<<<<<<< HEAD
<<<<<<< HEAD
>>>>>>> locatelli-main
=======
>>>>>>> locatelli-main
=======
>>>>>>> locatelli-main
=======
>>>>>>> locatelli-main
=======
>>>>>>> locatelli-main
=======
>>>>>>> 6e41de2827 (GEOMESA-3214 Fix warning about full table scan with Filter.EXCLUDE)
=======
>>>>>>> b76027496d (GEOMESA-3203 Short-circuit disjoint filters in index scans (#2862))
>>>>>>> locatelli-main
=======
>>>>>>> 6e41de2827 (GEOMESA-3214 Fix warning about full table scan with Filter.EXCLUDE)
=======
>>>>>>> b76027496d (GEOMESA-3203 Short-circuit disjoint filters in index scans (#2862))
>>>>>>> locatelli-main
=======
>>>>>>> 6e41de2827 (GEOMESA-3214 Fix warning about full table scan with Filter.EXCLUDE)
=======
>>>>>>> b76027496d (GEOMESA-3203 Short-circuit disjoint filters in index scans (#2862))
>>>>>>> locatelli-main
=======
>>>>>>> 6e41de2827 (GEOMESA-3214 Fix warning about full table scan with Filter.EXCLUDE)
=======
>>>>>>> b76027496d (GEOMESA-3203 Short-circuit disjoint filters in index scans (#2862))
>>>>>>> locatelli-main
=======
>>>>>>> 6e41de2827 (GEOMESA-3214 Fix warning about full table scan with Filter.EXCLUDE)
=======
>>>>>>> b76027496d (GEOMESA-3203 Short-circuit disjoint filters in index scans (#2862))
>>>>>>> locatelli-main
=======
>>>>>>> 6e41de2827 (GEOMESA-3214 Fix warning about full table scan with Filter.EXCLUDE)
=======
>>>>>>> b76027496d (GEOMESA-3203 Short-circuit disjoint filters in index scans (#2862))
>>>>>>> locatelli-main
=======
>>>>>>> 6e41de2827 (GEOMESA-3214 Fix warning about full table scan with Filter.EXCLUDE)
=======
>>>>>>> b76027496d (GEOMESA-3203 Short-circuit disjoint filters in index scans (#2862))
>>>>>>> locatelli-main
=======
>>>>>>> 6e41de2827 (GEOMESA-3214 Fix warning about full table scan with Filter.EXCLUDE)
=======
>>>>>>> b76027496d (GEOMESA-3203 Short-circuit disjoint filters in index scans (#2862))
>>>>>>> locatelli-main
>>>>>>> 5b15f98fad (GEOMESA-3203 Short-circuit disjoint filters in index scans (#2862))
=======
>>>>>>> 1f18a80880 (GEOMESA-3214 Fix warning about full table scan with Filter.EXCLUDE)
=======
<<<<<<< HEAD
<<<<<<< HEAD
<<<<<<< HEAD
<<<<<<< HEAD
<<<<<<< HEAD
<<<<<<< HEAD
=======
<<<<<<< HEAD
<<<<<<< HEAD
<<<<<<< HEAD
<<<<<<< HEAD
<<<<<<< HEAD
<<<<<<< HEAD
<<<<<<< HEAD
<<<<<<< HEAD
=======
<<<<<<< HEAD
<<<<<<< HEAD
<<<<<<< HEAD
>>>>>>> locatelli-main
<<<<<<< HEAD
=======
<<<<<<< HEAD
<<<<<<< HEAD
<<<<<<< HEAD
>>>>>>> locatelli-main
<<<<<<< HEAD
=======
<<<<<<< HEAD
<<<<<<< HEAD
<<<<<<< HEAD
>>>>>>> locatelli-main
=======
<<<<<<< HEAD
<<<<<<< HEAD
>>>>>>> locatelli-main
=======
<<<<<<< HEAD
>>>>>>> locatelli-main
=======
=======
>>>>>>> locatelli-main
=======
>>>>>>> locatelli-main
=======
>>>>>>> locatelli-main
=======
>>>>>>> locatelli-main
=======
>>>>>>> locatelli-main
=======
>>>>>>> locatelli-main
=======
>>>>>>> locatelli-main
=======
>>>>>>> locatelli-main
>>>>>>> 37b4aef862 (GEOMESA-3214 Fix warning about full table scan with Filter.EXCLUDE)
=======
>>>>>>> 63a045a753 (GEOMESA-3254 Add Bloop build support)
=======
>>>>>>> 8caa458e72 (GEOMESA-3203 Short-circuit disjoint filters in index scans (#2862))
=======
>>>>>>> 83be617313 (GEOMESA-3214 Fix warning about full table scan with Filter.EXCLUDE)
=======
>>>>>>> b7410da0d3 (GEOMESA-3203 Short-circuit disjoint filters in index scans (#2862))
<<<<<<< HEAD
<<<<<<< HEAD
<<<<<<< HEAD
<<<<<<< HEAD
<<<<<<< HEAD
<<<<<<< HEAD
<<<<<<< HEAD
<<<<<<< HEAD
<<<<<<< HEAD
<<<<<<< HEAD
<<<<<<< HEAD
<<<<<<< HEAD
<<<<<<< HEAD
>>>>>>> locationtech-main
=======
=======
>>>>>>> locatelli-main
=======
>>>>>>> locatelli-main
=======
>>>>>>> locatelli-main
=======
>>>>>>> locatelli-main
=======
>>>>>>> locatelli-main
=======
>>>>>>> locatelli-main
=======
>>>>>>> locatelli-main
=======
>>>>>>> locatelli-main
=======
>>>>>>> locatelli-main
=======
>>>>>>> locatelli-main
=======
>>>>>>> locatelli-main
=======
>>>>>>> locatelli-main
=======
>>>>>>> 37b4aef862 (GEOMESA-3214 Fix warning about full table scan with Filter.EXCLUDE)
=======
>>>>>>> 63a045a753 (GEOMESA-3254 Add Bloop build support)
=======
>>>>>>> 8caa458e72 (GEOMESA-3203 Short-circuit disjoint filters in index scans (#2862))
=======
>>>>>>> 83be617313 (GEOMESA-3214 Fix warning about full table scan with Filter.EXCLUDE)
=======
>>>>>>> 13fb1c6150 (GEOMESA-3203 Short-circuit disjoint filters in index scans (#2862))
=======
>>>>>>> 8e01f6263e (GEOMESA-3214 Fix warning about full table scan with Filter.EXCLUDE)
=======
>>>>>>> c73145a433 (GEOMESA-3203 Short-circuit disjoint filters in index scans (#2862))
=======
>>>>>>> 37b4aef862 (GEOMESA-3214 Fix warning about full table scan with Filter.EXCLUDE)
=======
>>>>>>> 63a045a753 (GEOMESA-3254 Add Bloop build support)
=======
>>>>>>> 8caa458e72 (GEOMESA-3203 Short-circuit disjoint filters in index scans (#2862))
=======
>>>>>>> 83be617313 (GEOMESA-3214 Fix warning about full table scan with Filter.EXCLUDE)
=======
>>>>>>> b7410da0d3 (GEOMESA-3203 Short-circuit disjoint filters in index scans (#2862))
<<<<<<< HEAD
<<<<<<< HEAD
<<<<<<< HEAD
<<<<<<< HEAD
<<<<<<< HEAD
<<<<<<< HEAD
<<<<<<< HEAD
<<<<<<< HEAD
<<<<<<< HEAD
<<<<<<< HEAD
<<<<<<< HEAD
<<<<<<< HEAD
>>>>>>> locatelli-main
=======
>>>>>>> locatelli-main
=======
>>>>>>> locatelli-main
=======
>>>>>>> locatelli-main
=======
>>>>>>> locatelli-main
=======
>>>>>>> locatelli-main
=======
>>>>>>> locatelli-main
=======
>>>>>>> locatelli-main
=======
>>>>>>> locatelli-main
=======
>>>>>>> locatelli-main
=======
>>>>>>> locatelli-main
=======
>>>>>>> locatelli-main
=======
>>>>>>> locatelli-main
=======
>>>>>>> 37b4aef862 (GEOMESA-3214 Fix warning about full table scan with Filter.EXCLUDE)
=======
>>>>>>> 63a045a753 (GEOMESA-3254 Add Bloop build support)
=======
>>>>>>> 8caa458e72 (GEOMESA-3203 Short-circuit disjoint filters in index scans (#2862))
=======
>>>>>>> 83be617313 (GEOMESA-3214 Fix warning about full table scan with Filter.EXCLUDE)
=======
>>>>>>> d022c4bef (GEOMESA-3203 Short-circuit disjoint filters in index scans (#2862))
>>>>>>> 592e71a19e (GEOMESA-3203 Short-circuit disjoint filters in index scans (#2862))
<<<<<<< HEAD
<<<<<<< HEAD
<<<<<<< HEAD
<<<<<<< HEAD
<<<<<<< HEAD
<<<<<<< HEAD
<<<<<<< HEAD
<<<<<<< HEAD
<<<<<<< HEAD
<<<<<<< HEAD
<<<<<<< HEAD
<<<<<<< HEAD
<<<<<<< HEAD
<<<<<<< HEAD
>>>>>>> location-main
=======
=======
=======
<<<<<<< HEAD
<<<<<<< HEAD
>>>>>>> locationtech-main
=======
=======
>>>>>>> locatelli-main
=======
>>>>>>> locatelli-main
=======
>>>>>>> locatelli-main
=======
>>>>>>> locatelli-main
=======
>>>>>>> locatelli-main
=======
>>>>>>> locatelli-main
=======
>>>>>>> locatelli-main
=======
>>>>>>> locatelli-main
=======
>>>>>>> locatelli-main
=======
>>>>>>> locatelli-main
=======
>>>>>>> locatelli-main
=======
>>>>>>> locatelli-main
=======
<<<<<<< HEAD
<<<<<<< HEAD
<<<<<<< HEAD
<<<<<<< HEAD
<<<<<<< HEAD
<<<<<<< HEAD
=======
>>>>>>> c73145a433 (GEOMESA-3203 Short-circuit disjoint filters in index scans (#2862))
=======
>>>>>>> 19e80a7633 (GEOMESA-3214 Fix warning about full table scan with Filter.EXCLUDE)
<<<<<<< HEAD
<<<<<<< HEAD
<<<<<<< HEAD
<<<<<<< HEAD
<<<<<<< HEAD
<<<<<<< HEAD
<<<<<<< HEAD
<<<<<<< HEAD
<<<<<<< HEAD
<<<<<<< HEAD
<<<<<<< HEAD
<<<<<<< HEAD
>>>>>>> locatelli-main
=======
>>>>>>> locatelli-main
=======
>>>>>>> locatelli-main
=======
>>>>>>> locatelli-main
=======
>>>>>>> locatelli-main
=======
>>>>>>> locatelli-main
=======
>>>>>>> locatelli-main
=======
>>>>>>> locatelli-main
=======
>>>>>>> locatelli-main
=======
>>>>>>> locatelli-main
=======
>>>>>>> locatelli-main
=======
>>>>>>> locatelli-main
=======
>>>>>>> locatelli-main
>>>>>>> 4c943341c (GEOMESA-3214 Fix warning about full table scan with Filter.EXCLUDE)
=======
>>>>>>> 5b15f98fa (GEOMESA-3203 Short-circuit disjoint filters in index scans (#2862))
=======
<<<<<<< HEAD
<<<<<<< HEAD
<<<<<<< HEAD
<<<<<<< HEAD
<<<<<<< HEAD
<<<<<<< HEAD
<<<<<<< HEAD
<<<<<<< HEAD
<<<<<<< HEAD
<<<<<<< HEAD
<<<<<<< HEAD
<<<<<<< HEAD
<<<<<<< HEAD
<<<<<<< HEAD
>>>>>>> 1f18a8088 (GEOMESA-3214 Fix warning about full table scan with Filter.EXCLUDE)
=======
<<<<<<< HEAD
>>>>>>> locationtech-main
=======
>>>>>>> e53e7db1e2 (GEOMESA-3203 Short-circuit disjoint filters in index scans (#2862))
=======
>>>>>>> 2aefae6145 (GEOMESA-3214 Fix warning about full table scan with Filter.EXCLUDE)
>>>>>>> location-main
=======
=======
<<<<<<< HEAD
<<<<<<< HEAD
=======
<<<<<<< HEAD
=======
>>>>>>> locatelli-main
<<<<<<< HEAD
=======
>>>>>>> locatelli-main
<<<<<<< HEAD
=======
>>>>>>> locatelli-main
<<<<<<< HEAD
=======
>>>>>>> locatelli-main
<<<<<<< HEAD
=======
>>>>>>> locatelli-main
=======
>>>>>>> locatelli-main
=======
>>>>>>> locatelli-main
=======
>>>>>>> locatelli-main
=======
>>>>>>> locatelli-main
=======
>>>>>>> locatelli-main
=======
>>>>>>> locatelli-main
=======
>>>>>>> locatelli-main
=======
>>>>>>> 2582e9f50b (GEOMESA-3203 Short-circuit disjoint filters in index scans (#2862))
=======
>>>>>>> e14a4b4a14 (GEOMESA-3214 Fix warning about full table scan with Filter.EXCLUDE)
<<<<<<< HEAD
<<<<<<< HEAD
<<<<<<< HEAD
<<<<<<< HEAD
<<<<<<< HEAD
<<<<<<< HEAD
<<<<<<< HEAD
<<<<<<< HEAD
<<<<<<< HEAD
<<<<<<< HEAD
<<<<<<< HEAD
<<<<<<< HEAD
>>>>>>> locatelli-main
=======
>>>>>>> locatelli-main
=======
>>>>>>> locatelli-main
=======
>>>>>>> locatelli-main
=======
>>>>>>> locatelli-main
=======
>>>>>>> locatelli-main
=======
>>>>>>> locatelli-main
=======
>>>>>>> locatelli-main
=======
>>>>>>> locatelli-main
=======
>>>>>>> locatelli-main
=======
>>>>>>> locatelli-main
=======
>>>>>>> locatelli-main
=======
>>>>>>> locatelli-main
>>>>>>> 1f18a8088 (GEOMESA-3214 Fix warning about full table scan with Filter.EXCLUDE)
=======
>>>>>>> e53e7db1e2 (GEOMESA-3203 Short-circuit disjoint filters in index scans (#2862))
=======
<<<<<<< HEAD
<<<<<<< HEAD
<<<<<<< HEAD
<<<<<<< HEAD
<<<<<<< HEAD
<<<<<<< HEAD
=======
<<<<<<< HEAD
<<<<<<< HEAD
<<<<<<< HEAD
<<<<<<< HEAD
<<<<<<< HEAD
<<<<<<< HEAD
<<<<<<< HEAD
<<<<<<< HEAD
<<<<<<< HEAD
<<<<<<< HEAD
=======
>>>>>>> locatelli-main
<<<<<<< HEAD
=======
>>>>>>> locatelli-main
<<<<<<< HEAD
=======
>>>>>>> locatelli-main
<<<<<<< HEAD
=======
>>>>>>> 00d9ed0bf2 (GEOMESA-3203 Short-circuit disjoint filters in index scans (#2862))
=======
>>>>>>> 029ad6f319 (GEOMESA-3214 Fix warning about full table scan with Filter.EXCLUDE)
<<<<<<< HEAD
<<<<<<< HEAD
<<<<<<< HEAD
>>>>>>> locatelli-main
=======
>>>>>>> locatelli-main
=======
>>>>>>> locatelli-main
=======
>>>>>>> locatelli-main
=======
>>>>>>> 00d9ed0bf2 (GEOMESA-3203 Short-circuit disjoint filters in index scans (#2862))
=======
>>>>>>> 029ad6f319 (GEOMESA-3214 Fix warning about full table scan with Filter.EXCLUDE)
>>>>>>> locatelli-main
=======
>>>>>>> 00d9ed0bf2 (GEOMESA-3203 Short-circuit disjoint filters in index scans (#2862))
=======
>>>>>>> 029ad6f319 (GEOMESA-3214 Fix warning about full table scan with Filter.EXCLUDE)
>>>>>>> locatelli-main
=======
>>>>>>> 00d9ed0bf2 (GEOMESA-3203 Short-circuit disjoint filters in index scans (#2862))
=======
>>>>>>> 029ad6f319 (GEOMESA-3214 Fix warning about full table scan with Filter.EXCLUDE)
>>>>>>> locatelli-main
=======
>>>>>>> 00d9ed0bf2 (GEOMESA-3203 Short-circuit disjoint filters in index scans (#2862))
=======
>>>>>>> 029ad6f319 (GEOMESA-3214 Fix warning about full table scan with Filter.EXCLUDE)
>>>>>>> locatelli-main
=======
>>>>>>> 00d9ed0bf2 (GEOMESA-3203 Short-circuit disjoint filters in index scans (#2862))
=======
>>>>>>> 029ad6f319 (GEOMESA-3214 Fix warning about full table scan with Filter.EXCLUDE)
>>>>>>> locatelli-main
=======
>>>>>>> 00d9ed0bf2 (GEOMESA-3203 Short-circuit disjoint filters in index scans (#2862))
=======
>>>>>>> 029ad6f319 (GEOMESA-3214 Fix warning about full table scan with Filter.EXCLUDE)
>>>>>>> locatelli-main
=======
>>>>>>> 00d9ed0bf2 (GEOMESA-3203 Short-circuit disjoint filters in index scans (#2862))
=======
>>>>>>> 029ad6f319 (GEOMESA-3214 Fix warning about full table scan with Filter.EXCLUDE)
>>>>>>> locatelli-main
=======
>>>>>>> 00d9ed0bf2 (GEOMESA-3203 Short-circuit disjoint filters in index scans (#2862))
=======
>>>>>>> 029ad6f319 (GEOMESA-3214 Fix warning about full table scan with Filter.EXCLUDE)
>>>>>>> locatelli-main
=======
>>>>>>> 00d9ed0bf2 (GEOMESA-3203 Short-circuit disjoint filters in index scans (#2862))
=======
>>>>>>> 029ad6f319 (GEOMESA-3214 Fix warning about full table scan with Filter.EXCLUDE)
>>>>>>> locatelli-main
>>>>>>> 2aefae6145 (GEOMESA-3214 Fix warning about full table scan with Filter.EXCLUDE)
=======
>>>>>>> fd58203632 (GEOMESA-3203 Short-circuit disjoint filters in index scans (#2862))
=======
<<<<<<< HEAD
<<<<<<< HEAD
<<<<<<< HEAD
<<<<<<< HEAD
<<<<<<< HEAD
<<<<<<< HEAD
<<<<<<< HEAD
<<<<<<< HEAD
<<<<<<< HEAD
<<<<<<< HEAD
<<<<<<< HEAD
<<<<<<< HEAD
<<<<<<< HEAD
=======
<<<<<<< HEAD
<<<<<<< HEAD
>>>>>>> locatelli-main
=======
<<<<<<< HEAD
>>>>>>> locatelli-main
=======
>>>>>>> locatelli-main
=======
>>>>>>> locatelli-main
=======
>>>>>>> locatelli-main
=======
>>>>>>> locatelli-main
=======
>>>>>>> locatelli-main
=======
>>>>>>> locatelli-main
=======
>>>>>>> locatelli-main
=======
>>>>>>> locatelli-main
=======
>>>>>>> locatelli-main
=======
>>>>>>> locatelli-main
=======
>>>>>>> locatelli-main
>>>>>>> 05abd783e4 (GEOMESA-3214 Fix warning about full table scan with Filter.EXCLUDE)
=======
=======
>>>>>>> d022c4befe (GEOMESA-3203 Short-circuit disjoint filters in index scans (#2862))
>>>>>>> 29d406f66f (GEOMESA-3203 Short-circuit disjoint filters in index scans (#2862))
=======
<<<<<<< HEAD
<<<<<<< HEAD
=======
<<<<<<< HEAD
<<<<<<< HEAD
<<<<<<< HEAD
<<<<<<< HEAD
<<<<<<< HEAD
<<<<<<< HEAD
<<<<<<< HEAD
<<<<<<< HEAD
<<<<<<< HEAD
<<<<<<< HEAD
<<<<<<< HEAD
<<<<<<< HEAD
<<<<<<< HEAD
>>>>>>> locatelli-main
=======
<<<<<<< HEAD
>>>>>>> locatelli-main
=======
=======
>>>>>>> locatelli-main
=======
>>>>>>> locatelli-main
=======
>>>>>>> locatelli-main
=======
>>>>>>> locatelli-main
=======
>>>>>>> locatelli-main
=======
>>>>>>> locatelli-main
=======
>>>>>>> locatelli-main
=======
>>>>>>> locatelli-main
=======
>>>>>>> locatelli-main
=======
>>>>>>> locatelli-main
=======
>>>>>>> locatelli-main
>>>>>>> c7527e3843 (GEOMESA-3214 Fix warning about full table scan with Filter.EXCLUDE)
=======
>>>>>>> 5b15f98fad (GEOMESA-3203 Short-circuit disjoint filters in index scans (#2862))
=======
>>>>>>> 7254911963 (GEOMESA-3203 Short-circuit disjoint filters in index scans (#2862))
<<<<<<< HEAD
<<<<<<< HEAD
=======
<<<<<<< HEAD
<<<<<<< HEAD
<<<<<<< HEAD
<<<<<<< HEAD
<<<<<<< HEAD
<<<<<<< HEAD
<<<<<<< HEAD
<<<<<<< HEAD
<<<<<<< HEAD
<<<<<<< HEAD
<<<<<<< HEAD
<<<<<<< HEAD
<<<<<<< HEAD
>>>>>>> locatelli-main
=======
<<<<<<< HEAD
>>>>>>> locatelli-main
=======
=======
>>>>>>> locatelli-main
=======
>>>>>>> locatelli-main
=======
>>>>>>> locatelli-main
=======
>>>>>>> locatelli-main
=======
>>>>>>> locatelli-main
=======
>>>>>>> locatelli-main
=======
>>>>>>> locatelli-main
=======
>>>>>>> locatelli-main
=======
>>>>>>> locatelli-main
=======
>>>>>>> locatelli-main
=======
>>>>>>> locatelli-main
>>>>>>> a3651df0c4 (GEOMESA-3214 Fix warning about full table scan with Filter.EXCLUDE)
=======
>>>>>>> b7410da0d3 (GEOMESA-3203 Short-circuit disjoint filters in index scans (#2862))
<<<<<<< HEAD
<<<<<<< HEAD
=======
<<<<<<< HEAD
<<<<<<< HEAD
<<<<<<< HEAD
<<<<<<< HEAD
<<<<<<< HEAD
<<<<<<< HEAD
<<<<<<< HEAD
<<<<<<< HEAD
<<<<<<< HEAD
<<<<<<< HEAD
<<<<<<< HEAD
<<<<<<< HEAD
<<<<<<< HEAD
=======
>>>>>>> 19e80a7633 (GEOMESA-3214 Fix warning about full table scan with Filter.EXCLUDE)
>>>>>>> locatelli-main
=======
<<<<<<< HEAD
=======
>>>>>>> 19e80a7633 (GEOMESA-3214 Fix warning about full table scan with Filter.EXCLUDE)
>>>>>>> locatelli-main
=======
>>>>>>> 19e80a7633 (GEOMESA-3214 Fix warning about full table scan with Filter.EXCLUDE)
>>>>>>> locatelli-main
=======
>>>>>>> 19e80a7633 (GEOMESA-3214 Fix warning about full table scan with Filter.EXCLUDE)
>>>>>>> locatelli-main
=======
>>>>>>> 19e80a7633 (GEOMESA-3214 Fix warning about full table scan with Filter.EXCLUDE)
>>>>>>> locatelli-main
=======
>>>>>>> 19e80a7633 (GEOMESA-3214 Fix warning about full table scan with Filter.EXCLUDE)
>>>>>>> locatelli-main
=======
>>>>>>> 19e80a7633 (GEOMESA-3214 Fix warning about full table scan with Filter.EXCLUDE)
>>>>>>> locatelli-main
=======
>>>>>>> 19e80a7633 (GEOMESA-3214 Fix warning about full table scan with Filter.EXCLUDE)
>>>>>>> locatelli-main
=======
>>>>>>> 19e80a7633 (GEOMESA-3214 Fix warning about full table scan with Filter.EXCLUDE)
>>>>>>> locatelli-main
=======
>>>>>>> 19e80a7633 (GEOMESA-3214 Fix warning about full table scan with Filter.EXCLUDE)
>>>>>>> locatelli-main
=======
>>>>>>> 19e80a7633 (GEOMESA-3214 Fix warning about full table scan with Filter.EXCLUDE)
>>>>>>> locatelli-main
=======
>>>>>>> 19e80a7633 (GEOMESA-3214 Fix warning about full table scan with Filter.EXCLUDE)
>>>>>>> locatelli-main
=======
>>>>>>> 19e80a7633 (GEOMESA-3214 Fix warning about full table scan with Filter.EXCLUDE)
>>>>>>> locatelli-main
=======
>>>>>>> 4c943341c (GEOMESA-3214 Fix warning about full table scan with Filter.EXCLUDE)
=======
>>>>>>> 3d9764749f (GEOMESA-3214 Fix warning about full table scan with Filter.EXCLUDE)
<<<<<<< HEAD
<<<<<<< HEAD
=======
<<<<<<< HEAD
<<<<<<< HEAD
<<<<<<< HEAD
<<<<<<< HEAD
<<<<<<< HEAD
<<<<<<< HEAD
<<<<<<< HEAD
<<<<<<< HEAD
<<<<<<< HEAD
<<<<<<< HEAD
<<<<<<< HEAD
<<<<<<< HEAD
<<<<<<< HEAD
>>>>>>> locatelli-main
=======
<<<<<<< HEAD
>>>>>>> locatelli-main
=======
=======
>>>>>>> locatelli-main
=======
>>>>>>> locatelli-main
=======
>>>>>>> locatelli-main
=======
>>>>>>> locatelli-main
=======
>>>>>>> locatelli-main
=======
>>>>>>> locatelli-main
=======
>>>>>>> locatelli-main
=======
>>>>>>> locatelli-main
=======
>>>>>>> locatelli-main
=======
>>>>>>> locatelli-main
=======
>>>>>>> locatelli-main
>>>>>>> b2a371f6ff (GEOMESA-3203 Short-circuit disjoint filters in index scans (#2862))
=======
>>>>>>> 1f18a8088 (GEOMESA-3214 Fix warning about full table scan with Filter.EXCLUDE)
=======
>>>>>>> 9ddab1e4ef (GEOMESA-3214 Fix warning about full table scan with Filter.EXCLUDE)
<<<<<<< HEAD
<<<<<<< HEAD
=======
<<<<<<< HEAD
<<<<<<< HEAD
<<<<<<< HEAD
<<<<<<< HEAD
<<<<<<< HEAD
<<<<<<< HEAD
<<<<<<< HEAD
<<<<<<< HEAD
<<<<<<< HEAD
<<<<<<< HEAD
<<<<<<< HEAD
<<<<<<< HEAD
<<<<<<< HEAD
>>>>>>> locatelli-main
=======
<<<<<<< HEAD
>>>>>>> locatelli-main
=======
=======
>>>>>>> locatelli-main
=======
>>>>>>> locatelli-main
=======
>>>>>>> locatelli-main
=======
>>>>>>> locatelli-main
=======
>>>>>>> locatelli-main
=======
>>>>>>> locatelli-main
=======
>>>>>>> locatelli-main
=======
>>>>>>> locatelli-main
=======
>>>>>>> locatelli-main
=======
>>>>>>> locatelli-main
=======
>>>>>>> locatelli-main
>>>>>>> c973459fb6 (GEOMESA-3203 Short-circuit disjoint filters in index scans (#2862))
=======
>>>>>>> 2aefae6145 (GEOMESA-3214 Fix warning about full table scan with Filter.EXCLUDE)
=======
>>>>>>> ee55e5ab74 (GEOMESA-3214 Fix warning about full table scan with Filter.EXCLUDE)
<<<<<<< HEAD
<<<<<<< HEAD
=======
<<<<<<< HEAD
<<<<<<< HEAD
<<<<<<< HEAD
<<<<<<< HEAD
<<<<<<< HEAD
<<<<<<< HEAD
<<<<<<< HEAD
<<<<<<< HEAD
<<<<<<< HEAD
<<<<<<< HEAD
<<<<<<< HEAD
<<<<<<< HEAD
=======
>>>>>>> locatelli-main
<<<<<<< HEAD
=======
=======
>>>>>>> locatelli-main
=======
>>>>>>> locatelli-main
=======
>>>>>>> locatelli-main
=======
>>>>>>> locatelli-main
=======
>>>>>>> locatelli-main
=======
>>>>>>> locatelli-main
=======
>>>>>>> locatelli-main
=======
>>>>>>> locatelli-main
=======
>>>>>>> locatelli-main
=======
>>>>>>> locatelli-main
=======
>>>>>>> locatelli-main
=======
>>>>>>> 1846781d8e (GEOMESA-3203 Short-circuit disjoint filters in index scans (#2862))
=======
>>>>>>> 8c519079d0 (GEOMESA-3214 Fix warning about full table scan with Filter.EXCLUDE)
=======
>>>>>>> 5b15f98fad (GEOMESA-3203 Short-circuit disjoint filters in index scans (#2862))
=======
>>>>>>> fc398c6949 (GEOMESA-3203 Short-circuit disjoint filters in index scans (#2862))
=======
>>>>>>> 34b2d6632f (GEOMESA-3214 Fix warning about full table scan with Filter.EXCLUDE)
=======
>>>>>>> 13fb1c6150 (GEOMESA-3203 Short-circuit disjoint filters in index scans (#2862))
=======
>>>>>>> 4c943341c (GEOMESA-3214 Fix warning about full table scan with Filter.EXCLUDE)
=======
>>>>>>> 1d05eb986e (GEOMESA-3214 Fix warning about full table scan with Filter.EXCLUDE)
=======
>>>>>>> 64e79ba0b0 (GEOMESA-3203 Short-circuit disjoint filters in index scans (#2862))
=======
>>>>>>> 1f18a8088 (GEOMESA-3214 Fix warning about full table scan with Filter.EXCLUDE)
=======
>>>>>>> 19265e7a87 (GEOMESA-3214 Fix warning about full table scan with Filter.EXCLUDE)
=======
>>>>>>> 9d271849b7 (GEOMESA-3203 Short-circuit disjoint filters in index scans (#2862))
=======
>>>>>>> 2aefae6145 (GEOMESA-3214 Fix warning about full table scan with Filter.EXCLUDE)
=======
>>>>>>> 9f601af8cc (GEOMESA-3214 Fix warning about full table scan with Filter.EXCLUDE)
=======
>>>>>>> 6033751879 (GEOMESA-3203 Short-circuit disjoint filters in index scans (#2862))
=======
>>>>>>> 05abd783e4 (GEOMESA-3214 Fix warning about full table scan with Filter.EXCLUDE)
=======
>>>>>>> bc58bb16eb (GEOMESA-3214 Fix warning about full table scan with Filter.EXCLUDE)
=======
>>>>>>> aae8270e82 (GEOMESA-3203 Short-circuit disjoint filters in index scans (#2862))
=======
=======
>>>>>>> c7527e3843 (GEOMESA-3214 Fix warning about full table scan with Filter.EXCLUDE)
>>>>>>> 6e41de2827 (GEOMESA-3214 Fix warning about full table scan with Filter.EXCLUDE)
=======
>>>>>>> b76027496d (GEOMESA-3203 Short-circuit disjoint filters in index scans (#2862))
=======
=======
>>>>>>> a3651df0c4 (GEOMESA-3214 Fix warning about full table scan with Filter.EXCLUDE)
>>>>>>> 8e01f6263e (GEOMESA-3214 Fix warning about full table scan with Filter.EXCLUDE)
=======
>>>>>>> c73145a433 (GEOMESA-3203 Short-circuit disjoint filters in index scans (#2862))
=======
>>>>>>> 19e80a7633 (GEOMESA-3214 Fix warning about full table scan with Filter.EXCLUDE)
=======
=======
>>>>>>> b2a371f6ff (GEOMESA-3203 Short-circuit disjoint filters in index scans (#2862))
>>>>>>> 2582e9f50b (GEOMESA-3203 Short-circuit disjoint filters in index scans (#2862))
=======
>>>>>>> e14a4b4a14 (GEOMESA-3214 Fix warning about full table scan with Filter.EXCLUDE)
=======
=======
>>>>>>> c973459fb6 (GEOMESA-3203 Short-circuit disjoint filters in index scans (#2862))
>>>>>>> 00d9ed0bf2 (GEOMESA-3203 Short-circuit disjoint filters in index scans (#2862))
=======
>>>>>>> 029ad6f319 (GEOMESA-3214 Fix warning about full table scan with Filter.EXCLUDE)
=======
<<<<<<< HEAD
<<<<<<< HEAD
<<<<<<< HEAD
<<<<<<< HEAD
<<<<<<< HEAD
<<<<<<< HEAD
<<<<<<< HEAD
<<<<<<< HEAD
<<<<<<< HEAD
<<<<<<< HEAD
<<<<<<< HEAD
<<<<<<< HEAD
>>>>>>> locatelli-main
=======
>>>>>>> locatelli-main
=======
>>>>>>> locatelli-main
=======
>>>>>>> locatelli-main
=======
>>>>>>> locatelli-main
=======
>>>>>>> locatelli-main
=======
>>>>>>> locatelli-main
=======
>>>>>>> locatelli-main
=======
>>>>>>> locatelli-main
=======
>>>>>>> locatelli-main
=======
>>>>>>> locatelli-main
=======
>>>>>>> locatelli-main
=======
>>>>>>> locatelli-main
>>>>>>> locationtech-main
=======
=======
>>>>>>> 5666197b2a (GEOMESA-3203 Short-circuit disjoint filters in index scans (#2862))
<<<<<<< HEAD
<<<<<<< HEAD
<<<<<<< HEAD
<<<<<<< HEAD
<<<<<<< HEAD
<<<<<<< HEAD
<<<<<<< HEAD
<<<<<<< HEAD
<<<<<<< HEAD
<<<<<<< HEAD
<<<<<<< HEAD
<<<<<<< HEAD
<<<<<<< HEAD
=======
=======
>>>>>>> locationtech-main
=======
=======
>>>>>>> locatelli-main
=======
>>>>>>> locatelli-main
=======
>>>>>>> locatelli-main
=======
>>>>>>> locatelli-main
=======
>>>>>>> locatelli-main
=======
>>>>>>> locatelli-main
=======
>>>>>>> locatelli-main
=======
>>>>>>> locatelli-main
=======
>>>>>>> locatelli-main
=======
>>>>>>> locatelli-main
=======
>>>>>>> locatelli-main
=======
>>>>>>> locatelli-main
>>>>>>> e85778a06f (GEOMESA-3203 Short-circuit disjoint filters in index scans (#2862))
=======
=======
>>>>>>> 5666197b2a (GEOMESA-3203 Short-circuit disjoint filters in index scans (#2862))
<<<<<<< HEAD
<<<<<<< HEAD
<<<<<<< HEAD
<<<<<<< HEAD
<<<<<<< HEAD
<<<<<<< HEAD
<<<<<<< HEAD
<<<<<<< HEAD
<<<<<<< HEAD
<<<<<<< HEAD
<<<<<<< HEAD
<<<<<<< HEAD
>>>>>>> locatelli-main
=======
>>>>>>> locatelli-main
=======
>>>>>>> locatelli-main
=======
>>>>>>> locatelli-main
=======
>>>>>>> locatelli-main
=======
>>>>>>> locatelli-main
=======
>>>>>>> locatelli-main
=======
>>>>>>> locatelli-main
=======
>>>>>>> locatelli-main
=======
>>>>>>> locatelli-main
=======
>>>>>>> locatelli-main
=======
>>>>>>> locatelli-main
=======
>>>>>>> locatelli-main
          if (qs.values.isEmpty && qs.ranges.nonEmpty) {
            qs.filter.secondary.foreach { f =>
              logger.warn(
                s"Running full table scan on ${qs.index.name} index for schema " +
                  s"'${sft.getTypeName}' with filter: ${filterToString(f)}")
            }
          }
<<<<<<< HEAD
<<<<<<< HEAD
<<<<<<< HEAD
<<<<<<< HEAD
<<<<<<< HEAD
<<<<<<< HEAD
<<<<<<< HEAD
<<<<<<< HEAD
<<<<<<< HEAD
<<<<<<< HEAD
<<<<<<< HEAD
<<<<<<< HEAD
<<<<<<< HEAD
<<<<<<< HEAD
<<<<<<< HEAD
<<<<<<< HEAD
<<<<<<< HEAD
=======
<<<<<<< HEAD
<<<<<<< HEAD
<<<<<<< HEAD
>>>>>>> b26fc9b517 (GEOMESA-3203 Short-circuit disjoint filters in index scans (#2862))
=======
>>>>>>> 9e5293be2a (GEOMESA-3214 Fix warning about full table scan with Filter.EXCLUDE)
=======
>>>>>>> location-main
=======
<<<<<<< HEAD
<<<<<<< HEAD
<<<<<<< HEAD
<<<<<<< HEAD
<<<<<<< HEAD
<<<<<<< HEAD
=======
<<<<<<< HEAD
=======
>>>>>>> locatelli-main
<<<<<<< HEAD
=======
>>>>>>> locatelli-main
<<<<<<< HEAD
=======
>>>>>>> locatelli-main
<<<<<<< HEAD
=======
>>>>>>> locatelli-main
<<<<<<< HEAD
=======
>>>>>>> locatelli-main
<<<<<<< HEAD
=======
>>>>>>> locatelli-main
<<<<<<< HEAD
=======
>>>>>>> locatelli-main
<<<<<<< HEAD
=======
>>>>>>> locatelli-main
<<<<<<< HEAD
=======
>>>>>>> locatelli-main
<<<<<<< HEAD
=======
>>>>>>> locatelli-main
<<<<<<< HEAD
=======
>>>>>>> locatelli-main
<<<<<<< HEAD
=======
>>>>>>> locatelli-main
<<<<<<< HEAD
=======
>>>>>>> e85778a06f (GEOMESA-3203 Short-circuit disjoint filters in index scans (#2862))
=======
>>>>>>> 00d9ed0bf2 (GEOMESA-3203 Short-circuit disjoint filters in index scans (#2862))
<<<<<<< HEAD
<<<<<<< HEAD
<<<<<<< HEAD
<<<<<<< HEAD
<<<<<<< HEAD
<<<<<<< HEAD
<<<<<<< HEAD
<<<<<<< HEAD
<<<<<<< HEAD
<<<<<<< HEAD
<<<<<<< HEAD
<<<<<<< HEAD
>>>>>>> locatelli-main
=======
>>>>>>> locatelli-main
=======
>>>>>>> locatelli-main
=======
>>>>>>> locatelli-main
=======
>>>>>>> locatelli-main
=======
>>>>>>> locatelli-main
=======
>>>>>>> locatelli-main
=======
>>>>>>> locatelli-main
=======
>>>>>>> locatelli-main
=======
>>>>>>> locatelli-main
=======
>>>>>>> locatelli-main
=======
>>>>>>> locatelli-main
=======
>>>>>>> locatelli-main
=======
>>>>>>> 7254911963 (GEOMESA-3203 Short-circuit disjoint filters in index scans (#2862))
=======
>>>>>>> c973459fb6 (GEOMESA-3203 Short-circuit disjoint filters in index scans (#2862))
<<<<<<< HEAD
=======
<<<<<<< HEAD
<<<<<<< HEAD
<<<<<<< HEAD
<<<<<<< HEAD
<<<<<<< HEAD
<<<<<<< HEAD
<<<<<<< HEAD
<<<<<<< HEAD
<<<<<<< HEAD
<<<<<<< HEAD
<<<<<<< HEAD
<<<<<<< HEAD
<<<<<<< HEAD
=======
=======
>>>>>>> locatelli-main
=======
>>>>>>> locatelli-main
=======
>>>>>>> locatelli-main
=======
>>>>>>> locatelli-main
=======
>>>>>>> locatelli-main
=======
>>>>>>> locatelli-main
=======
>>>>>>> locatelli-main
=======
>>>>>>> locatelli-main
=======
>>>>>>> locatelli-main
=======
>>>>>>> locatelli-main
=======
>>>>>>> locatelli-main
=======
>>>>>>> locatelli-main
>>>>>>> fc398c6949 (GEOMESA-3203 Short-circuit disjoint filters in index scans (#2862))
=======
>>>>>>> 9d271849b7 (GEOMESA-3203 Short-circuit disjoint filters in index scans (#2862))
=======
>>>>>>> 6033751879 (GEOMESA-3203 Short-circuit disjoint filters in index scans (#2862))
=======
>>>>>>> aae8270e82 (GEOMESA-3203 Short-circuit disjoint filters in index scans (#2862))
=======
=======
>>>>>>> 7254911963 (GEOMESA-3203 Short-circuit disjoint filters in index scans (#2862))
>>>>>>> b76027496d (GEOMESA-3203 Short-circuit disjoint filters in index scans (#2862))
=======
>>>>>>> 00d9ed0bf2 (GEOMESA-3203 Short-circuit disjoint filters in index scans (#2862))
<<<<<<< HEAD
<<<<<<< HEAD
<<<<<<< HEAD
<<<<<<< HEAD
<<<<<<< HEAD
<<<<<<< HEAD
<<<<<<< HEAD
<<<<<<< HEAD
<<<<<<< HEAD
<<<<<<< HEAD
<<<<<<< HEAD
<<<<<<< HEAD
>>>>>>> locatelli-main
=======
>>>>>>> locatelli-main
=======
>>>>>>> locatelli-main
=======
>>>>>>> locatelli-main
=======
>>>>>>> locatelli-main
=======
>>>>>>> locatelli-main
=======
>>>>>>> locatelli-main
=======
>>>>>>> locatelli-main
=======
>>>>>>> locatelli-main
=======
>>>>>>> locatelli-main
=======
>>>>>>> locatelli-main
=======
>>>>>>> locatelli-main
=======
>>>>>>> locatelli-main
>>>>>>> b26fc9b517 (GEOMESA-3203 Short-circuit disjoint filters in index scans (#2862))
=======
>>>>>>> 9e5293be2a (GEOMESA-3214 Fix warning about full table scan with Filter.EXCLUDE)
<<<<<<< HEAD
<<<<<<< HEAD
<<<<<<< HEAD
=======
<<<<<<< HEAD
<<<<<<< HEAD
<<<<<<< HEAD
<<<<<<< HEAD
<<<<<<< HEAD
<<<<<<< HEAD
<<<<<<< HEAD
<<<<<<< HEAD
<<<<<<< HEAD
<<<<<<< HEAD
<<<<<<< HEAD
>>>>>>> locationtech-main
=======
<<<<<<< HEAD
=======
>>>>>>> locatelli-main
<<<<<<< HEAD
=======
>>>>>>> bc58bb16eb (GEOMESA-3214 Fix warning about full table scan with Filter.EXCLUDE)
=======
<<<<<<< HEAD
>>>>>>> locatelli-main
=======
>>>>>>> locatelli-main
=======
>>>>>>> bc58bb16eb (GEOMESA-3214 Fix warning about full table scan with Filter.EXCLUDE)
=======
>>>>>>> locatelli-main
=======
>>>>>>> bc58bb16eb (GEOMESA-3214 Fix warning about full table scan with Filter.EXCLUDE)
=======
>>>>>>> locatelli-main
=======
>>>>>>> bc58bb16eb (GEOMESA-3214 Fix warning about full table scan with Filter.EXCLUDE)
=======
>>>>>>> locatelli-main
=======
>>>>>>> bc58bb16eb (GEOMESA-3214 Fix warning about full table scan with Filter.EXCLUDE)
=======
>>>>>>> locatelli-main
=======
>>>>>>> bc58bb16eb (GEOMESA-3214 Fix warning about full table scan with Filter.EXCLUDE)
=======
>>>>>>> locatelli-main
=======
>>>>>>> bc58bb16eb (GEOMESA-3214 Fix warning about full table scan with Filter.EXCLUDE)
=======
>>>>>>> locatelli-main
=======
>>>>>>> bc58bb16eb (GEOMESA-3214 Fix warning about full table scan with Filter.EXCLUDE)
=======
>>>>>>> locatelli-main
=======
>>>>>>> bc58bb16eb (GEOMESA-3214 Fix warning about full table scan with Filter.EXCLUDE)
=======
>>>>>>> locatelli-main
=======
>>>>>>> bc58bb16eb (GEOMESA-3214 Fix warning about full table scan with Filter.EXCLUDE)
=======
>>>>>>> locatelli-main
=======
>>>>>>> bc58bb16eb (GEOMESA-3214 Fix warning about full table scan with Filter.EXCLUDE)
=======
>>>>>>> locatelli-main
=======
>>>>>>> bc58bb16eb (GEOMESA-3214 Fix warning about full table scan with Filter.EXCLUDE)
=======
>>>>>>> locatelli-main
>>>>>>> b26fc9b51 (GEOMESA-3203 Short-circuit disjoint filters in index scans (#2862))
<<<<<<< HEAD
<<<<<<< HEAD
<<<<<<< HEAD
<<<<<<< HEAD
<<<<<<< HEAD
<<<<<<< HEAD
<<<<<<< HEAD
<<<<<<< HEAD
<<<<<<< HEAD
<<<<<<< HEAD
<<<<<<< HEAD
<<<<<<< HEAD
<<<<<<< HEAD
<<<<<<< HEAD
<<<<<<< HEAD
<<<<<<< HEAD
<<<<<<< HEAD
<<<<<<< HEAD
<<<<<<< HEAD
<<<<<<< HEAD
<<<<<<< HEAD
=======
<<<<<<< HEAD
<<<<<<< HEAD
=======
<<<<<<< HEAD
<<<<<<< HEAD
<<<<<<< HEAD
<<<<<<< HEAD
<<<<<<< HEAD
<<<<<<< HEAD
<<<<<<< HEAD
=======
<<<<<<< HEAD
=======
>>>>>>> locatelli-main
<<<<<<< HEAD
=======
>>>>>>> locatelli-main
<<<<<<< HEAD
=======
>>>>>>> locatelli-main
<<<<<<< HEAD
=======
>>>>>>> locatelli-main
<<<<<<< HEAD
=======
>>>>>>> locatelli-main
<<<<<<< HEAD
=======
>>>>>>> locatelli-main
<<<<<<< HEAD
=======
>>>>>>> locatelli-main
<<<<<<< HEAD
=======
>>>>>>> locatelli-main
<<<<<<< HEAD
=======
>>>>>>> locatelli-main
<<<<<<< HEAD
=======
>>>>>>> locatelli-main
<<<<<<< HEAD
=======
>>>>>>> locatelli-main
<<<<<<< HEAD
=======
>>>>>>> locatelli-main
<<<<<<< HEAD
<<<<<<< HEAD
<<<<<<< HEAD
<<<<<<< HEAD
<<<<<<< HEAD
=======
=======
>>>>>>> 089a9f3f18 (GEOMESA-3214 Fix warning about full table scan with Filter.EXCLUDE)
<<<<<<< HEAD
<<<<<<< HEAD
=======
>>>>>>> c73145a433 (GEOMESA-3203 Short-circuit disjoint filters in index scans (#2862))
=======
>>>>>>> 19e80a7633 (GEOMESA-3214 Fix warning about full table scan with Filter.EXCLUDE)
=======
>>>>>>> 2582e9f50b (GEOMESA-3203 Short-circuit disjoint filters in index scans (#2862))
=======
>>>>>>> e14a4b4a14 (GEOMESA-3214 Fix warning about full table scan with Filter.EXCLUDE)
=======
>>>>>>> 029ad6f319 (GEOMESA-3214 Fix warning about full table scan with Filter.EXCLUDE)
<<<<<<< HEAD
<<<<<<< HEAD
<<<<<<< HEAD
<<<<<<< HEAD
<<<<<<< HEAD
<<<<<<< HEAD
<<<<<<< HEAD
<<<<<<< HEAD
<<<<<<< HEAD
<<<<<<< HEAD
<<<<<<< HEAD
<<<<<<< HEAD
>>>>>>> locatelli-main
=======
>>>>>>> locatelli-main
=======
>>>>>>> locatelli-main
=======
>>>>>>> locatelli-main
=======
>>>>>>> locatelli-main
=======
>>>>>>> locatelli-main
=======
>>>>>>> locatelli-main
=======
>>>>>>> locatelli-main
=======
>>>>>>> locatelli-main
=======
>>>>>>> locatelli-main
=======
>>>>>>> locatelli-main
=======
>>>>>>> locatelli-main
=======
>>>>>>> locatelli-main
=======
>>>>>>> a3651df0c4 (GEOMESA-3214 Fix warning about full table scan with Filter.EXCLUDE)
=======
>>>>>>> b7410da0d3 (GEOMESA-3203 Short-circuit disjoint filters in index scans (#2862))
<<<<<<< HEAD
<<<<<<< HEAD
=======
<<<<<<< HEAD
<<<<<<< HEAD
<<<<<<< HEAD
<<<<<<< HEAD
<<<<<<< HEAD
<<<<<<< HEAD
<<<<<<< HEAD
<<<<<<< HEAD
<<<<<<< HEAD
<<<<<<< HEAD
<<<<<<< HEAD
<<<<<<< HEAD
<<<<<<< HEAD
>>>>>>> locatelli-main
=======
<<<<<<< HEAD
>>>>>>> locatelli-main
=======
=======
>>>>>>> locatelli-main
=======
>>>>>>> locatelli-main
=======
>>>>>>> locatelli-main
=======
>>>>>>> locatelli-main
=======
>>>>>>> locatelli-main
=======
>>>>>>> locatelli-main
=======
>>>>>>> locatelli-main
=======
>>>>>>> locatelli-main
=======
>>>>>>> locatelli-main
=======
>>>>>>> locatelli-main
=======
>>>>>>> locatelli-main
>>>>>>> 3d9764749f (GEOMESA-3214 Fix warning about full table scan with Filter.EXCLUDE)
=======
>>>>>>> b2a371f6ff (GEOMESA-3203 Short-circuit disjoint filters in index scans (#2862))
<<<<<<< HEAD
<<<<<<< HEAD
=======
<<<<<<< HEAD
<<<<<<< HEAD
<<<<<<< HEAD
<<<<<<< HEAD
<<<<<<< HEAD
<<<<<<< HEAD
<<<<<<< HEAD
<<<<<<< HEAD
<<<<<<< HEAD
<<<<<<< HEAD
<<<<<<< HEAD
<<<<<<< HEAD
<<<<<<< HEAD
>>>>>>> locatelli-main
=======
<<<<<<< HEAD
>>>>>>> locatelli-main
=======
=======
>>>>>>> locatelli-main
=======
>>>>>>> locatelli-main
=======
>>>>>>> locatelli-main
=======
>>>>>>> locatelli-main
=======
>>>>>>> locatelli-main
=======
>>>>>>> locatelli-main
=======
>>>>>>> locatelli-main
=======
>>>>>>> locatelli-main
=======
>>>>>>> locatelli-main
=======
>>>>>>> locatelli-main
=======
>>>>>>> locatelli-main
>>>>>>> 9ddab1e4ef (GEOMESA-3214 Fix warning about full table scan with Filter.EXCLUDE)
=======
>>>>>>> ee55e5ab74 (GEOMESA-3214 Fix warning about full table scan with Filter.EXCLUDE)
<<<<<<< HEAD
<<<<<<< HEAD
<<<<<<< HEAD
<<<<<<< HEAD
<<<<<<< HEAD
<<<<<<< HEAD
<<<<<<< HEAD
<<<<<<< HEAD
<<<<<<< HEAD
<<<<<<< HEAD
<<<<<<< HEAD
<<<<<<< HEAD
<<<<<<< HEAD
>>>>>>> locationtech-main
=======
<<<<<<< HEAD
=======
>>>>>>> locatelli-main
=======
>>>>>>> locatelli-main
=======
>>>>>>> locatelli-main
=======
>>>>>>> locatelli-main
=======
>>>>>>> locatelli-main
=======
>>>>>>> locatelli-main
=======
>>>>>>> locatelli-main
=======
>>>>>>> locatelli-main
=======
>>>>>>> locatelli-main
=======
>>>>>>> locatelli-main
=======
>>>>>>> locatelli-main
=======
>>>>>>> locatelli-main
=======
>>>>>>> 34b2d6632f (GEOMESA-3214 Fix warning about full table scan with Filter.EXCLUDE)
=======
>>>>>>> 13fb1c6150 (GEOMESA-3203 Short-circuit disjoint filters in index scans (#2862))
=======
>>>>>>> 1d05eb986e (GEOMESA-3214 Fix warning about full table scan with Filter.EXCLUDE)
=======
>>>>>>> 64e79ba0b0 (GEOMESA-3203 Short-circuit disjoint filters in index scans (#2862))
=======
>>>>>>> 19265e7a87 (GEOMESA-3214 Fix warning about full table scan with Filter.EXCLUDE)
=======
>>>>>>> 9f601af8cc (GEOMESA-3214 Fix warning about full table scan with Filter.EXCLUDE)
=======
=======
>>>>>>> a3651df0c4 (GEOMESA-3214 Fix warning about full table scan with Filter.EXCLUDE)
>>>>>>> 8e01f6263e (GEOMESA-3214 Fix warning about full table scan with Filter.EXCLUDE)
=======
>>>>>>> c73145a433 (GEOMESA-3203 Short-circuit disjoint filters in index scans (#2862))
=======
=======
>>>>>>> 3d9764749f (GEOMESA-3214 Fix warning about full table scan with Filter.EXCLUDE)
>>>>>>> 19e80a7633 (GEOMESA-3214 Fix warning about full table scan with Filter.EXCLUDE)
=======
>>>>>>> 2582e9f50b (GEOMESA-3203 Short-circuit disjoint filters in index scans (#2862))
=======
=======
>>>>>>> 9ddab1e4ef (GEOMESA-3214 Fix warning about full table scan with Filter.EXCLUDE)
>>>>>>> e14a4b4a14 (GEOMESA-3214 Fix warning about full table scan with Filter.EXCLUDE)
=======
>>>>>>> 029ad6f319 (GEOMESA-3214 Fix warning about full table scan with Filter.EXCLUDE)
<<<<<<< HEAD
<<<<<<< HEAD
<<<<<<< HEAD
<<<<<<< HEAD
<<<<<<< HEAD
<<<<<<< HEAD
<<<<<<< HEAD
<<<<<<< HEAD
<<<<<<< HEAD
<<<<<<< HEAD
<<<<<<< HEAD
<<<<<<< HEAD
>>>>>>> locatelli-main
=======
>>>>>>> locatelli-main
=======
>>>>>>> locatelli-main
=======
>>>>>>> locatelli-main
=======
>>>>>>> locatelli-main
=======
>>>>>>> locatelli-main
=======
>>>>>>> locatelli-main
=======
>>>>>>> locatelli-main
=======
>>>>>>> locatelli-main
=======
>>>>>>> locatelli-main
=======
>>>>>>> locatelli-main
=======
>>>>>>> locatelli-main
=======
>>>>>>> locatelli-main
>>>>>>> d022c4befe (GEOMESA-3203 Short-circuit disjoint filters in index scans (#2862))
=======
=======
>>>>>>> 9e5293be2 (GEOMESA-3214 Fix warning about full table scan with Filter.EXCLUDE)
>>>>>>> 4c943341c0 (GEOMESA-3214 Fix warning about full table scan with Filter.EXCLUDE)
=======
>>>>>>> d845d7c1bd (GEOMESA-3254 Add Bloop build support)
=======
>>>>>>> b26fc9b51 (GEOMESA-3203 Short-circuit disjoint filters in index scans (#2862))
>>>>>>> 5b15f98fad (GEOMESA-3203 Short-circuit disjoint filters in index scans (#2862))
<<<<<<< HEAD
<<<<<<< HEAD
<<<<<<< HEAD
<<<<<<< HEAD
<<<<<<< HEAD
<<<<<<< HEAD
=======
<<<<<<< HEAD
<<<<<<< HEAD
<<<<<<< HEAD
<<<<<<< HEAD
<<<<<<< HEAD
<<<<<<< HEAD
<<<<<<< HEAD
<<<<<<< HEAD
=======
<<<<<<< HEAD
<<<<<<< HEAD
<<<<<<< HEAD
>>>>>>> locatelli-main
=======
>>>>>>> locatelli-main
<<<<<<< HEAD
<<<<<<< HEAD
=======
>>>>>>> a3651df0c4 (GEOMESA-3214 Fix warning about full table scan with Filter.EXCLUDE)
<<<<<<< HEAD
<<<<<<< HEAD
>>>>>>> locationtech-main
=======
=======
<<<<<<< HEAD
=======
>>>>>>> locatelli-main
<<<<<<< HEAD
<<<<<<< HEAD
<<<<<<< HEAD
=======
>>>>>>> a3651df0c4 (GEOMESA-3214 Fix warning about full table scan with Filter.EXCLUDE)
<<<<<<< HEAD
>>>>>>> locatelli-main
=======
>>>>>>> locatelli-main
=======
>>>>>>> locatelli-main
=======
<<<<<<< HEAD
=======
>>>>>>> a3651df0c4 (GEOMESA-3214 Fix warning about full table scan with Filter.EXCLUDE)
>>>>>>> locatelli-main
=======
>>>>>>> a3651df0c4 (GEOMESA-3214 Fix warning about full table scan with Filter.EXCLUDE)
>>>>>>> locatelli-main
=======
>>>>>>> a3651df0c4 (GEOMESA-3214 Fix warning about full table scan with Filter.EXCLUDE)
>>>>>>> locatelli-main
=======
>>>>>>> a3651df0c4 (GEOMESA-3214 Fix warning about full table scan with Filter.EXCLUDE)
>>>>>>> locatelli-main
=======
>>>>>>> a3651df0c4 (GEOMESA-3214 Fix warning about full table scan with Filter.EXCLUDE)
>>>>>>> locatelli-main
=======
>>>>>>> a3651df0c4 (GEOMESA-3214 Fix warning about full table scan with Filter.EXCLUDE)
>>>>>>> locatelli-main
=======
>>>>>>> a3651df0c4 (GEOMESA-3214 Fix warning about full table scan with Filter.EXCLUDE)
>>>>>>> locatelli-main
=======
>>>>>>> a3651df0c4 (GEOMESA-3214 Fix warning about full table scan with Filter.EXCLUDE)
>>>>>>> locatelli-main
=======
>>>>>>> a3651df0c4 (GEOMESA-3214 Fix warning about full table scan with Filter.EXCLUDE)
>>>>>>> locatelli-main
=======
>>>>>>> 34b2d6632f (GEOMESA-3214 Fix warning about full table scan with Filter.EXCLUDE)
=======
>>>>>>> b76027496d (GEOMESA-3203 Short-circuit disjoint filters in index scans (#2862))
=======
=======
>>>>>>> a3651df0c4 (GEOMESA-3214 Fix warning about full table scan with Filter.EXCLUDE)
>>>>>>> 8e01f6263e (GEOMESA-3214 Fix warning about full table scan with Filter.EXCLUDE)
<<<<<<< HEAD
<<<<<<< HEAD
<<<<<<< HEAD
<<<<<<< HEAD
<<<<<<< HEAD
<<<<<<< HEAD
<<<<<<< HEAD
<<<<<<< HEAD
<<<<<<< HEAD
<<<<<<< HEAD
<<<<<<< HEAD
<<<<<<< HEAD
>>>>>>> locatelli-main
=======
>>>>>>> locatelli-main
=======
>>>>>>> locatelli-main
=======
>>>>>>> locatelli-main
=======
>>>>>>> locatelli-main
=======
>>>>>>> locatelli-main
=======
>>>>>>> locatelli-main
=======
>>>>>>> locatelli-main
=======
>>>>>>> locatelli-main
=======
>>>>>>> locatelli-main
=======
>>>>>>> locatelli-main
=======
>>>>>>> locatelli-main
=======
>>>>>>> locatelli-main
=======
=======
>>>>>>> 9e5293be2 (GEOMESA-3214 Fix warning about full table scan with Filter.EXCLUDE)
>>>>>>> 1f18a80880 (GEOMESA-3214 Fix warning about full table scan with Filter.EXCLUDE)
<<<<<<< HEAD
<<<<<<< HEAD
<<<<<<< HEAD
<<<<<<< HEAD
<<<<<<< HEAD
<<<<<<< HEAD
=======
<<<<<<< HEAD
<<<<<<< HEAD
<<<<<<< HEAD
<<<<<<< HEAD
<<<<<<< HEAD
<<<<<<< HEAD
<<<<<<< HEAD
<<<<<<< HEAD
<<<<<<< HEAD
<<<<<<< HEAD
>>>>>>> locationtech-main
=======
<<<<<<< HEAD
=======
>>>>>>> locatelli-main
<<<<<<< HEAD
=======
>>>>>>> locatelli-main
<<<<<<< HEAD
=======
>>>>>>> locatelli-main
<<<<<<< HEAD
=======
>>>>>>> locatelli-main
<<<<<<< HEAD
=======
>>>>>>> 8e01f6263e (GEOMESA-3214 Fix warning about full table scan with Filter.EXCLUDE)
=======
>>>>>>> c73145a433 (GEOMESA-3203 Short-circuit disjoint filters in index scans (#2862))
<<<<<<< HEAD
<<<<<<< HEAD
<<<<<<< HEAD
<<<<<<< HEAD
>>>>>>> locatelli-main
=======
>>>>>>> locatelli-main
=======
>>>>>>> locatelli-main
=======
>>>>>>> locatelli-main
=======
>>>>>>> locatelli-main
=======
>>>>>>> 8e01f6263e (GEOMESA-3214 Fix warning about full table scan with Filter.EXCLUDE)
=======
>>>>>>> c73145a433 (GEOMESA-3203 Short-circuit disjoint filters in index scans (#2862))
>>>>>>> locatelli-main
=======
>>>>>>> 8e01f6263e (GEOMESA-3214 Fix warning about full table scan with Filter.EXCLUDE)
=======
>>>>>>> c73145a433 (GEOMESA-3203 Short-circuit disjoint filters in index scans (#2862))
>>>>>>> locatelli-main
=======
>>>>>>> 8e01f6263e (GEOMESA-3214 Fix warning about full table scan with Filter.EXCLUDE)
=======
>>>>>>> c73145a433 (GEOMESA-3203 Short-circuit disjoint filters in index scans (#2862))
>>>>>>> locatelli-main
=======
>>>>>>> 8e01f6263e (GEOMESA-3214 Fix warning about full table scan with Filter.EXCLUDE)
=======
>>>>>>> c73145a433 (GEOMESA-3203 Short-circuit disjoint filters in index scans (#2862))
>>>>>>> locatelli-main
=======
>>>>>>> 8e01f6263e (GEOMESA-3214 Fix warning about full table scan with Filter.EXCLUDE)
=======
>>>>>>> c73145a433 (GEOMESA-3203 Short-circuit disjoint filters in index scans (#2862))
>>>>>>> locatelli-main
=======
>>>>>>> 8e01f6263e (GEOMESA-3214 Fix warning about full table scan with Filter.EXCLUDE)
=======
>>>>>>> c73145a433 (GEOMESA-3203 Short-circuit disjoint filters in index scans (#2862))
>>>>>>> locatelli-main
=======
>>>>>>> 8e01f6263e (GEOMESA-3214 Fix warning about full table scan with Filter.EXCLUDE)
=======
>>>>>>> c73145a433 (GEOMESA-3203 Short-circuit disjoint filters in index scans (#2862))
>>>>>>> locatelli-main
=======
>>>>>>> 8e01f6263e (GEOMESA-3214 Fix warning about full table scan with Filter.EXCLUDE)
=======
>>>>>>> c73145a433 (GEOMESA-3203 Short-circuit disjoint filters in index scans (#2862))
>>>>>>> locatelli-main
=======
=======
>>>>>>> 37b4aef862 (GEOMESA-3214 Fix warning about full table scan with Filter.EXCLUDE)
=======
>>>>>>> 8caa458e72 (GEOMESA-3203 Short-circuit disjoint filters in index scans (#2862))
=======
<<<<<<< HEAD
<<<<<<< HEAD
<<<<<<< HEAD
<<<<<<< HEAD
<<<<<<< HEAD
<<<<<<< HEAD
<<<<<<< HEAD
<<<<<<< HEAD
<<<<<<< HEAD
<<<<<<< HEAD
<<<<<<< HEAD
<<<<<<< HEAD
<<<<<<< HEAD
<<<<<<< HEAD
>>>>>>> 83be617313 (GEOMESA-3214 Fix warning about full table scan with Filter.EXCLUDE)
>>>>>>> location-main
=======
=======
<<<<<<< HEAD
<<<<<<< HEAD
=======
<<<<<<< HEAD
=======
>>>>>>> locatelli-main
<<<<<<< HEAD
=======
>>>>>>> locatelli-main
<<<<<<< HEAD
=======
>>>>>>> locatelli-main
<<<<<<< HEAD
=======
>>>>>>> locatelli-main
<<<<<<< HEAD
=======
>>>>>>> locatelli-main
=======
>>>>>>> locatelli-main
=======
>>>>>>> locatelli-main
=======
>>>>>>> locatelli-main
=======
>>>>>>> locatelli-main
=======
>>>>>>> locatelli-main
=======
>>>>>>> locatelli-main
=======
>>>>>>> locatelli-main
=======
>>>>>>> 2582e9f50b (GEOMESA-3203 Short-circuit disjoint filters in index scans (#2862))
=======
>>>>>>> e14a4b4a14 (GEOMESA-3214 Fix warning about full table scan with Filter.EXCLUDE)
<<<<<<< HEAD
<<<<<<< HEAD
<<<<<<< HEAD
<<<<<<< HEAD
<<<<<<< HEAD
<<<<<<< HEAD
<<<<<<< HEAD
<<<<<<< HEAD
<<<<<<< HEAD
<<<<<<< HEAD
<<<<<<< HEAD
<<<<<<< HEAD
>>>>>>> locatelli-main
=======
>>>>>>> locatelli-main
=======
>>>>>>> locatelli-main
=======
>>>>>>> locatelli-main
=======
>>>>>>> locatelli-main
=======
>>>>>>> locatelli-main
=======
>>>>>>> locatelli-main
=======
>>>>>>> locatelli-main
=======
>>>>>>> locatelli-main
=======
>>>>>>> locatelli-main
=======
>>>>>>> locatelli-main
=======
>>>>>>> locatelli-main
=======
>>>>>>> locatelli-main
>>>>>>> 83be617313 (GEOMESA-3214 Fix warning about full table scan with Filter.EXCLUDE)
=======
=======
>>>>>>> b2a371f6ff (GEOMESA-3203 Short-circuit disjoint filters in index scans (#2862))
<<<<<<< HEAD
<<<<<<< HEAD
=======
<<<<<<< HEAD
<<<<<<< HEAD
<<<<<<< HEAD
<<<<<<< HEAD
<<<<<<< HEAD
<<<<<<< HEAD
<<<<<<< HEAD
<<<<<<< HEAD
<<<<<<< HEAD
<<<<<<< HEAD
<<<<<<< HEAD
<<<<<<< HEAD
<<<<<<< HEAD
=======
>>>>>>> e14a4b4a14 (GEOMESA-3214 Fix warning about full table scan with Filter.EXCLUDE)
>>>>>>> locatelli-main
=======
<<<<<<< HEAD
=======
>>>>>>> e14a4b4a14 (GEOMESA-3214 Fix warning about full table scan with Filter.EXCLUDE)
>>>>>>> locatelli-main
=======
>>>>>>> e14a4b4a14 (GEOMESA-3214 Fix warning about full table scan with Filter.EXCLUDE)
>>>>>>> locatelli-main
=======
>>>>>>> e14a4b4a14 (GEOMESA-3214 Fix warning about full table scan with Filter.EXCLUDE)
>>>>>>> locatelli-main
=======
>>>>>>> e14a4b4a14 (GEOMESA-3214 Fix warning about full table scan with Filter.EXCLUDE)
>>>>>>> locatelli-main
=======
>>>>>>> e14a4b4a14 (GEOMESA-3214 Fix warning about full table scan with Filter.EXCLUDE)
>>>>>>> locatelli-main
=======
>>>>>>> e14a4b4a14 (GEOMESA-3214 Fix warning about full table scan with Filter.EXCLUDE)
>>>>>>> locatelli-main
=======
>>>>>>> e14a4b4a14 (GEOMESA-3214 Fix warning about full table scan with Filter.EXCLUDE)
>>>>>>> locatelli-main
=======
>>>>>>> e14a4b4a14 (GEOMESA-3214 Fix warning about full table scan with Filter.EXCLUDE)
>>>>>>> locatelli-main
=======
>>>>>>> e14a4b4a14 (GEOMESA-3214 Fix warning about full table scan with Filter.EXCLUDE)
>>>>>>> locatelli-main
=======
>>>>>>> e14a4b4a14 (GEOMESA-3214 Fix warning about full table scan with Filter.EXCLUDE)
>>>>>>> locatelli-main
=======
>>>>>>> e14a4b4a14 (GEOMESA-3214 Fix warning about full table scan with Filter.EXCLUDE)
>>>>>>> locatelli-main
=======
>>>>>>> e14a4b4a14 (GEOMESA-3214 Fix warning about full table scan with Filter.EXCLUDE)
>>>>>>> locatelli-main
=======
>>>>>>> 83be617313 (GEOMESA-3214 Fix warning about full table scan with Filter.EXCLUDE)
=======
>>>>>>> 9ddab1e4ef (GEOMESA-3214 Fix warning about full table scan with Filter.EXCLUDE)
<<<<<<< HEAD
<<<<<<< HEAD
<<<<<<< HEAD
<<<<<<< HEAD
<<<<<<< HEAD
<<<<<<< HEAD
<<<<<<< HEAD
<<<<<<< HEAD
<<<<<<< HEAD
<<<<<<< HEAD
<<<<<<< HEAD
<<<<<<< HEAD
<<<<<<< HEAD
>>>>>>> locationtech-main
=======
<<<<<<< HEAD
=======
>>>>>>> locatelli-main
=======
>>>>>>> locatelli-main
=======
>>>>>>> locatelli-main
=======
>>>>>>> locatelli-main
=======
>>>>>>> locatelli-main
=======
>>>>>>> locatelli-main
=======
>>>>>>> locatelli-main
=======
>>>>>>> locatelli-main
=======
>>>>>>> locatelli-main
=======
>>>>>>> locatelli-main
=======
>>>>>>> locatelli-main
=======
>>>>>>> locatelli-main
=======
>>>>>>> 64e79ba0b0 (GEOMESA-3203 Short-circuit disjoint filters in index scans (#2862))
=======
>>>>>>> 83be617313 (GEOMESA-3214 Fix warning about full table scan with Filter.EXCLUDE)
=======
>>>>>>> 19265e7a87 (GEOMESA-3214 Fix warning about full table scan with Filter.EXCLUDE)
=======
>>>>>>> 2582e9f50b (GEOMESA-3203 Short-circuit disjoint filters in index scans (#2862))
=======
>>>>>>> e14a4b4a14 (GEOMESA-3214 Fix warning about full table scan with Filter.EXCLUDE)
<<<<<<< HEAD
<<<<<<< HEAD
<<<<<<< HEAD
<<<<<<< HEAD
<<<<<<< HEAD
<<<<<<< HEAD
<<<<<<< HEAD
<<<<<<< HEAD
<<<<<<< HEAD
<<<<<<< HEAD
<<<<<<< HEAD
<<<<<<< HEAD
>>>>>>> locatelli-main
=======
>>>>>>> locatelli-main
=======
>>>>>>> locatelli-main
=======
>>>>>>> locatelli-main
=======
>>>>>>> locatelli-main
=======
>>>>>>> locatelli-main
=======
>>>>>>> locatelli-main
=======
>>>>>>> locatelli-main
=======
>>>>>>> locatelli-main
=======
>>>>>>> locatelli-main
=======
>>>>>>> locatelli-main
=======
>>>>>>> locatelli-main
=======
>>>>>>> locatelli-main
>>>>>>> 9e5293be2 (GEOMESA-3214 Fix warning about full table scan with Filter.EXCLUDE)
=======
>>>>>>> d022c4bef (GEOMESA-3203 Short-circuit disjoint filters in index scans (#2862))
<<<<<<< HEAD
<<<<<<< HEAD
<<<<<<< HEAD
<<<<<<< HEAD
<<<<<<< HEAD
<<<<<<< HEAD
<<<<<<< HEAD
<<<<<<< HEAD
<<<<<<< HEAD
<<<<<<< HEAD
<<<<<<< HEAD
<<<<<<< HEAD
<<<<<<< HEAD
<<<<<<< HEAD
<<<<<<< HEAD
=======
<<<<<<< HEAD
>>>>>>> 592e71a19e (GEOMESA-3203 Short-circuit disjoint filters in index scans (#2862))
=======
>>>>>>> location-main
=======
>>>>>>> 592e71a19e (GEOMESA-3203 Short-circuit disjoint filters in index scans (#2862))
=======
>>>>>>> locationtech-main
=======
>>>>>>> 592e71a19e (GEOMESA-3203 Short-circuit disjoint filters in index scans (#2862))
=======
>>>>>>> locatelli-main
=======
>>>>>>> 592e71a19e (GEOMESA-3203 Short-circuit disjoint filters in index scans (#2862))
=======
>>>>>>> locatelli-main
=======
>>>>>>> 592e71a19e (GEOMESA-3203 Short-circuit disjoint filters in index scans (#2862))
=======
>>>>>>> locatelli-main
=======
>>>>>>> 592e71a19e (GEOMESA-3203 Short-circuit disjoint filters in index scans (#2862))
=======
>>>>>>> locatelli-main
=======
>>>>>>> 592e71a19e (GEOMESA-3203 Short-circuit disjoint filters in index scans (#2862))
=======
>>>>>>> locatelli-main
=======
>>>>>>> 592e71a19e (GEOMESA-3203 Short-circuit disjoint filters in index scans (#2862))
=======
>>>>>>> locatelli-main
=======
>>>>>>> 592e71a19e (GEOMESA-3203 Short-circuit disjoint filters in index scans (#2862))
=======
>>>>>>> locatelli-main
=======
>>>>>>> 592e71a19e (GEOMESA-3203 Short-circuit disjoint filters in index scans (#2862))
=======
>>>>>>> locatelli-main
=======
>>>>>>> 592e71a19e (GEOMESA-3203 Short-circuit disjoint filters in index scans (#2862))
=======
>>>>>>> locatelli-main
=======
>>>>>>> 592e71a19e (GEOMESA-3203 Short-circuit disjoint filters in index scans (#2862))
=======
>>>>>>> locatelli-main
=======
>>>>>>> 592e71a19e (GEOMESA-3203 Short-circuit disjoint filters in index scans (#2862))
=======
>>>>>>> locatelli-main
=======
>>>>>>> 592e71a19e (GEOMESA-3203 Short-circuit disjoint filters in index scans (#2862))
=======
>>>>>>> locatelli-main
=======
>>>>>>> 592e71a19e (GEOMESA-3203 Short-circuit disjoint filters in index scans (#2862))
=======
>>>>>>> locatelli-main
=======
=======
>>>>>>> 9e5293be2 (GEOMESA-3214 Fix warning about full table scan with Filter.EXCLUDE)
>>>>>>> 4c943341c (GEOMESA-3214 Fix warning about full table scan with Filter.EXCLUDE)
<<<<<<< HEAD
<<<<<<< HEAD
<<<<<<< HEAD
<<<<<<< HEAD
<<<<<<< HEAD
<<<<<<< HEAD
<<<<<<< HEAD
<<<<<<< HEAD
<<<<<<< HEAD
<<<<<<< HEAD
<<<<<<< HEAD
<<<<<<< HEAD
<<<<<<< HEAD
<<<<<<< HEAD
<<<<<<< HEAD
=======
>>>>>>> d845d7c1b (GEOMESA-3254 Add Bloop build support)
=======
>>>>>>> 5b15f98fa (GEOMESA-3203 Short-circuit disjoint filters in index scans (#2862))
=======
<<<<<<< HEAD
=======
>>>>>>> locationtech-main
=======
>>>>>>> locatelli-main
=======
>>>>>>> locatelli-main
=======
>>>>>>> locatelli-main
=======
>>>>>>> locatelli-main
=======
>>>>>>> locatelli-main
=======
>>>>>>> locatelli-main
=======
>>>>>>> locatelli-main
=======
>>>>>>> locatelli-main
=======
>>>>>>> locatelli-main
=======
>>>>>>> locatelli-main
=======
>>>>>>> locatelli-main
=======
>>>>>>> locatelli-main
=======
>>>>>>> locatelli-main
>>>>>>> 37b4aef862 (GEOMESA-3214 Fix warning about full table scan with Filter.EXCLUDE)
=======
=======
>>>>>>> d845d7c1b (GEOMESA-3254 Add Bloop build support)
<<<<<<< HEAD
<<<<<<< HEAD
<<<<<<< HEAD
<<<<<<< HEAD
<<<<<<< HEAD
<<<<<<< HEAD
<<<<<<< HEAD
=======
<<<<<<< HEAD
<<<<<<< HEAD
<<<<<<< HEAD
<<<<<<< HEAD
<<<<<<< HEAD
<<<<<<< HEAD
<<<<<<< HEAD
<<<<<<< HEAD
=======
<<<<<<< HEAD
<<<<<<< HEAD
<<<<<<< HEAD
>>>>>>> locatelli-main
=======
>>>>>>> locatelli-main
<<<<<<< HEAD
<<<<<<< HEAD
=======
>>>>>>> b2a371f6ff (GEOMESA-3203 Short-circuit disjoint filters in index scans (#2862))
<<<<<<< HEAD
<<<<<<< HEAD
>>>>>>> locationtech-main
=======
=======
<<<<<<< HEAD
=======
>>>>>>> locatelli-main
<<<<<<< HEAD
<<<<<<< HEAD
<<<<<<< HEAD
=======
>>>>>>> b2a371f6ff (GEOMESA-3203 Short-circuit disjoint filters in index scans (#2862))
<<<<<<< HEAD
>>>>>>> locatelli-main
=======
>>>>>>> locatelli-main
=======
>>>>>>> locatelli-main
=======
<<<<<<< HEAD
=======
>>>>>>> b2a371f6ff (GEOMESA-3203 Short-circuit disjoint filters in index scans (#2862))
>>>>>>> locatelli-main
=======
>>>>>>> b2a371f6ff (GEOMESA-3203 Short-circuit disjoint filters in index scans (#2862))
>>>>>>> locatelli-main
=======
>>>>>>> b2a371f6ff (GEOMESA-3203 Short-circuit disjoint filters in index scans (#2862))
>>>>>>> locatelli-main
=======
>>>>>>> b2a371f6ff (GEOMESA-3203 Short-circuit disjoint filters in index scans (#2862))
>>>>>>> locatelli-main
=======
>>>>>>> b2a371f6ff (GEOMESA-3203 Short-circuit disjoint filters in index scans (#2862))
>>>>>>> locatelli-main
=======
>>>>>>> b2a371f6ff (GEOMESA-3203 Short-circuit disjoint filters in index scans (#2862))
>>>>>>> locatelli-main
=======
>>>>>>> b2a371f6ff (GEOMESA-3203 Short-circuit disjoint filters in index scans (#2862))
>>>>>>> locatelli-main
=======
>>>>>>> b2a371f6ff (GEOMESA-3203 Short-circuit disjoint filters in index scans (#2862))
>>>>>>> locatelli-main
=======
>>>>>>> b2a371f6ff (GEOMESA-3203 Short-circuit disjoint filters in index scans (#2862))
>>>>>>> locatelli-main
=======
>>>>>>> 64e79ba0b0 (GEOMESA-3203 Short-circuit disjoint filters in index scans (#2862))
=======
>>>>>>> 13656f5052 (GEOMESA-3254 Add Bloop build support)
=======
=======
>>>>>>> b2a371f6ff (GEOMESA-3203 Short-circuit disjoint filters in index scans (#2862))
>>>>>>> 2582e9f50b (GEOMESA-3203 Short-circuit disjoint filters in index scans (#2862))
<<<<<<< HEAD
<<<<<<< HEAD
<<<<<<< HEAD
<<<<<<< HEAD
<<<<<<< HEAD
<<<<<<< HEAD
<<<<<<< HEAD
<<<<<<< HEAD
<<<<<<< HEAD
<<<<<<< HEAD
<<<<<<< HEAD
<<<<<<< HEAD
>>>>>>> locatelli-main
=======
>>>>>>> locatelli-main
=======
>>>>>>> locatelli-main
=======
>>>>>>> locatelli-main
=======
>>>>>>> locatelli-main
=======
>>>>>>> locatelli-main
=======
>>>>>>> locatelli-main
=======
>>>>>>> locatelli-main
=======
>>>>>>> locatelli-main
=======
>>>>>>> locatelli-main
=======
>>>>>>> locatelli-main
=======
>>>>>>> locatelli-main
=======
>>>>>>> locatelli-main
>>>>>>> 63a045a753 (GEOMESA-3254 Add Bloop build support)
=======
=======
>>>>>>> 5b15f98fa (GEOMESA-3203 Short-circuit disjoint filters in index scans (#2862))
<<<<<<< HEAD
<<<<<<< HEAD
<<<<<<< HEAD
<<<<<<< HEAD
<<<<<<< HEAD
<<<<<<< HEAD
<<<<<<< HEAD
<<<<<<< HEAD
<<<<<<< HEAD
<<<<<<< HEAD
<<<<<<< HEAD
<<<<<<< HEAD
<<<<<<< HEAD
<<<<<<< HEAD
<<<<<<< HEAD
>>>>>>> 8caa458e72 (GEOMESA-3203 Short-circuit disjoint filters in index scans (#2862))
=======
>>>>>>> location-main
=======
=======
<<<<<<< HEAD
<<<<<<< HEAD
<<<<<<< HEAD
>>>>>>> locatelli-main
=======
>>>>>>> locatelli-main
<<<<<<< HEAD
<<<<<<< HEAD
=======
>>>>>>> 9ddab1e4ef (GEOMESA-3214 Fix warning about full table scan with Filter.EXCLUDE)
<<<<<<< HEAD
<<<<<<< HEAD
>>>>>>> 8caa458e72 (GEOMESA-3203 Short-circuit disjoint filters in index scans (#2862))
=======
>>>>>>> locationtech-main
=======
=======
<<<<<<< HEAD
=======
>>>>>>> locatelli-main
<<<<<<< HEAD
<<<<<<< HEAD
<<<<<<< HEAD
=======
>>>>>>> 9ddab1e4ef (GEOMESA-3214 Fix warning about full table scan with Filter.EXCLUDE)
<<<<<<< HEAD
>>>>>>> locatelli-main
=======
>>>>>>> locatelli-main
=======
>>>>>>> locatelli-main
=======
<<<<<<< HEAD
=======
>>>>>>> 9ddab1e4ef (GEOMESA-3214 Fix warning about full table scan with Filter.EXCLUDE)
>>>>>>> locatelli-main
=======
=======
>>>>>>> 9ddab1e4ef (GEOMESA-3214 Fix warning about full table scan with Filter.EXCLUDE)
>>>>>>> locatelli-main
=======
=======
>>>>>>> 9ddab1e4ef (GEOMESA-3214 Fix warning about full table scan with Filter.EXCLUDE)
>>>>>>> locatelli-main
=======
=======
>>>>>>> 9ddab1e4ef (GEOMESA-3214 Fix warning about full table scan with Filter.EXCLUDE)
>>>>>>> locatelli-main
=======
=======
>>>>>>> 9ddab1e4ef (GEOMESA-3214 Fix warning about full table scan with Filter.EXCLUDE)
>>>>>>> locatelli-main
=======
=======
>>>>>>> 9ddab1e4ef (GEOMESA-3214 Fix warning about full table scan with Filter.EXCLUDE)
>>>>>>> locatelli-main
=======
=======
>>>>>>> 9ddab1e4ef (GEOMESA-3214 Fix warning about full table scan with Filter.EXCLUDE)
>>>>>>> locatelli-main
=======
=======
>>>>>>> 9ddab1e4ef (GEOMESA-3214 Fix warning about full table scan with Filter.EXCLUDE)
>>>>>>> locatelli-main
=======
=======
>>>>>>> 9ddab1e4ef (GEOMESA-3214 Fix warning about full table scan with Filter.EXCLUDE)
>>>>>>> locatelli-main
=======
>>>>>>> 19265e7a87 (GEOMESA-3214 Fix warning about full table scan with Filter.EXCLUDE)
=======
>>>>>>> 2582e9f50b (GEOMESA-3203 Short-circuit disjoint filters in index scans (#2862))
=======
=======
>>>>>>> 9ddab1e4ef (GEOMESA-3214 Fix warning about full table scan with Filter.EXCLUDE)
>>>>>>> e14a4b4a14 (GEOMESA-3214 Fix warning about full table scan with Filter.EXCLUDE)
>>>>>>> 8caa458e72 (GEOMESA-3203 Short-circuit disjoint filters in index scans (#2862))
=======
<<<<<<< HEAD
<<<<<<< HEAD
<<<<<<< HEAD
<<<<<<< HEAD
<<<<<<< HEAD
<<<<<<< HEAD
<<<<<<< HEAD
<<<<<<< HEAD
<<<<<<< HEAD
<<<<<<< HEAD
<<<<<<< HEAD
<<<<<<< HEAD
>>>>>>> locatelli-main
=======
>>>>>>> locatelli-main
=======
>>>>>>> locatelli-main
=======
>>>>>>> locatelli-main
=======
>>>>>>> locatelli-main
=======
>>>>>>> locatelli-main
=======
>>>>>>> locatelli-main
=======
>>>>>>> locatelli-main
=======
>>>>>>> locatelli-main
=======
>>>>>>> locatelli-main
=======
>>>>>>> locatelli-main
=======
>>>>>>> locatelli-main
=======
>>>>>>> locatelli-main
=======
=======
>>>>>>> 9e5293be2 (GEOMESA-3214 Fix warning about full table scan with Filter.EXCLUDE)
>>>>>>> 1f18a8088 (GEOMESA-3214 Fix warning about full table scan with Filter.EXCLUDE)
<<<<<<< HEAD
<<<<<<< HEAD
<<<<<<< HEAD
<<<<<<< HEAD
<<<<<<< HEAD
<<<<<<< HEAD
<<<<<<< HEAD
<<<<<<< HEAD
<<<<<<< HEAD
<<<<<<< HEAD
<<<<<<< HEAD
<<<<<<< HEAD
<<<<<<< HEAD
<<<<<<< HEAD
<<<<<<< HEAD
=======
=======
>>>>>>> 9e5293be2 (GEOMESA-3214 Fix warning about full table scan with Filter.EXCLUDE)
>>>>>>> locationtech-main
=======
>>>>>>> 83be617313 (GEOMESA-3214 Fix warning about full table scan with Filter.EXCLUDE)
=======
>>>>>>> 83be617313 (GEOMESA-3214 Fix warning about full table scan with Filter.EXCLUDE)
<<<<<<< HEAD
<<<<<<< HEAD
>>>>>>> locationtech-main
=======
=======
>>>>>>> locatelli-main
=======
>>>>>>> locatelli-main
=======
>>>>>>> locatelli-main
=======
>>>>>>> locatelli-main
=======
>>>>>>> locatelli-main
=======
>>>>>>> locatelli-main
=======
>>>>>>> locatelli-main
=======
>>>>>>> locatelli-main
=======
>>>>>>> locatelli-main
=======
>>>>>>> locatelli-main
=======
>>>>>>> locatelli-main
=======
>>>>>>> locatelli-main
>>>>>>> 83be617313 (GEOMESA-3214 Fix warning about full table scan with Filter.EXCLUDE)
<<<<<<< HEAD
<<<<<<< HEAD
<<<<<<< HEAD
<<<<<<< HEAD
<<<<<<< HEAD
<<<<<<< HEAD
=======
>>>>>>> e14a4b4a14 (GEOMESA-3214 Fix warning about full table scan with Filter.EXCLUDE)
=======
>>>>>>> 00d9ed0bf2 (GEOMESA-3203 Short-circuit disjoint filters in index scans (#2862))
<<<<<<< HEAD
<<<<<<< HEAD
<<<<<<< HEAD
<<<<<<< HEAD
<<<<<<< HEAD
<<<<<<< HEAD
<<<<<<< HEAD
<<<<<<< HEAD
<<<<<<< HEAD
<<<<<<< HEAD
<<<<<<< HEAD
<<<<<<< HEAD
>>>>>>> locatelli-main
=======
>>>>>>> locatelli-main
=======
>>>>>>> locatelli-main
=======
>>>>>>> locatelli-main
=======
>>>>>>> locatelli-main
=======
>>>>>>> locatelli-main
=======
>>>>>>> locatelli-main
=======
>>>>>>> locatelli-main
=======
>>>>>>> locatelli-main
=======
>>>>>>> locatelli-main
=======
>>>>>>> locatelli-main
=======
>>>>>>> locatelli-main
=======
>>>>>>> locatelli-main
=======
>>>>>>> b26fc9b51 (GEOMESA-3203 Short-circuit disjoint filters in index scans (#2862))
>>>>>>> e53e7db1e2 (GEOMESA-3203 Short-circuit disjoint filters in index scans (#2862))
=======
=======
>>>>>>> 9e5293be2 (GEOMESA-3214 Fix warning about full table scan with Filter.EXCLUDE)
>>>>>>> 2aefae6145 (GEOMESA-3214 Fix warning about full table scan with Filter.EXCLUDE)
<<<<<<< HEAD
<<<<<<< HEAD
<<<<<<< HEAD
<<<<<<< HEAD
<<<<<<< HEAD
<<<<<<< HEAD
<<<<<<< HEAD
<<<<<<< HEAD
<<<<<<< HEAD
<<<<<<< HEAD
<<<<<<< HEAD
<<<<<<< HEAD
<<<<<<< HEAD
<<<<<<< HEAD
>>>>>>> location-main
=======
<<<<<<< HEAD
=======
<<<<<<< HEAD
=======
>>>>>>> locatelli-main
<<<<<<< HEAD
<<<<<<< HEAD
=======
>>>>>>> 029ad6f319 (GEOMESA-3214 Fix warning about full table scan with Filter.EXCLUDE)
<<<<<<< HEAD
>>>>>>> locatelli-main
=======
>>>>>>> locatelli-main
=======
<<<<<<< HEAD
=======
>>>>>>> 029ad6f319 (GEOMESA-3214 Fix warning about full table scan with Filter.EXCLUDE)
>>>>>>> locatelli-main
=======
=======
>>>>>>> 029ad6f319 (GEOMESA-3214 Fix warning about full table scan with Filter.EXCLUDE)
>>>>>>> locatelli-main
=======
=======
>>>>>>> 029ad6f319 (GEOMESA-3214 Fix warning about full table scan with Filter.EXCLUDE)
>>>>>>> locatelli-main
=======
=======
>>>>>>> 029ad6f319 (GEOMESA-3214 Fix warning about full table scan with Filter.EXCLUDE)
>>>>>>> locatelli-main
=======
=======
>>>>>>> 029ad6f319 (GEOMESA-3214 Fix warning about full table scan with Filter.EXCLUDE)
>>>>>>> locatelli-main
=======
=======
>>>>>>> 029ad6f319 (GEOMESA-3214 Fix warning about full table scan with Filter.EXCLUDE)
>>>>>>> locatelli-main
=======
=======
>>>>>>> 029ad6f319 (GEOMESA-3214 Fix warning about full table scan with Filter.EXCLUDE)
>>>>>>> locatelli-main
=======
=======
>>>>>>> 029ad6f319 (GEOMESA-3214 Fix warning about full table scan with Filter.EXCLUDE)
>>>>>>> locatelli-main
=======
=======
>>>>>>> 029ad6f319 (GEOMESA-3214 Fix warning about full table scan with Filter.EXCLUDE)
>>>>>>> locatelli-main
=======
=======
>>>>>>> 029ad6f319 (GEOMESA-3214 Fix warning about full table scan with Filter.EXCLUDE)
>>>>>>> locatelli-main
=======
=======
>>>>>>> 029ad6f319 (GEOMESA-3214 Fix warning about full table scan with Filter.EXCLUDE)
>>>>>>> locatelli-main
=======
>>>>>>> b26fc9b517 (GEOMESA-3203 Short-circuit disjoint filters in index scans (#2862))
>>>>>>> fd58203632 (GEOMESA-3203 Short-circuit disjoint filters in index scans (#2862))
=======
>>>>>>> 05abd783e4 (GEOMESA-3214 Fix warning about full table scan with Filter.EXCLUDE)
<<<<<<< HEAD
<<<<<<< HEAD
=======
<<<<<<< HEAD
<<<<<<< HEAD
<<<<<<< HEAD
<<<<<<< HEAD
<<<<<<< HEAD
<<<<<<< HEAD
<<<<<<< HEAD
<<<<<<< HEAD
<<<<<<< HEAD
<<<<<<< HEAD
<<<<<<< HEAD
<<<<<<< HEAD
<<<<<<< HEAD
=======
>>>>>>> aae8270e82 (GEOMESA-3203 Short-circuit disjoint filters in index scans (#2862))
>>>>>>> locatelli-main
=======
<<<<<<< HEAD
=======
>>>>>>> aae8270e82 (GEOMESA-3203 Short-circuit disjoint filters in index scans (#2862))
>>>>>>> locatelli-main
=======
>>>>>>> aae8270e82 (GEOMESA-3203 Short-circuit disjoint filters in index scans (#2862))
>>>>>>> locatelli-main
=======
>>>>>>> aae8270e82 (GEOMESA-3203 Short-circuit disjoint filters in index scans (#2862))
>>>>>>> locatelli-main
=======
>>>>>>> aae8270e82 (GEOMESA-3203 Short-circuit disjoint filters in index scans (#2862))
>>>>>>> locatelli-main
=======
>>>>>>> aae8270e82 (GEOMESA-3203 Short-circuit disjoint filters in index scans (#2862))
>>>>>>> locatelli-main
=======
>>>>>>> aae8270e82 (GEOMESA-3203 Short-circuit disjoint filters in index scans (#2862))
>>>>>>> locatelli-main
=======
>>>>>>> aae8270e82 (GEOMESA-3203 Short-circuit disjoint filters in index scans (#2862))
>>>>>>> locatelli-main
=======
>>>>>>> aae8270e82 (GEOMESA-3203 Short-circuit disjoint filters in index scans (#2862))
>>>>>>> locatelli-main
=======
>>>>>>> aae8270e82 (GEOMESA-3203 Short-circuit disjoint filters in index scans (#2862))
>>>>>>> locatelli-main
=======
>>>>>>> aae8270e82 (GEOMESA-3203 Short-circuit disjoint filters in index scans (#2862))
>>>>>>> locatelli-main
=======
>>>>>>> aae8270e82 (GEOMESA-3203 Short-circuit disjoint filters in index scans (#2862))
>>>>>>> locatelli-main
=======
>>>>>>> aae8270e82 (GEOMESA-3203 Short-circuit disjoint filters in index scans (#2862))
>>>>>>> locatelli-main
=======
>>>>>>> b26fc9b517 (GEOMESA-3203 Short-circuit disjoint filters in index scans (#2862))
=======
>>>>>>> 9e5293be2a (GEOMESA-3214 Fix warning about full table scan with Filter.EXCLUDE)
=======
>>>>>>> b26fc9b51 (GEOMESA-3203 Short-circuit disjoint filters in index scans (#2862))
<<<<<<< HEAD
<<<<<<< HEAD
<<<<<<< HEAD
<<<<<<< HEAD
<<<<<<< HEAD
<<<<<<< HEAD
<<<<<<< HEAD
<<<<<<< HEAD
<<<<<<< HEAD
<<<<<<< HEAD
<<<<<<< HEAD
<<<<<<< HEAD
<<<<<<< HEAD
<<<<<<< HEAD
=======
<<<<<<< HEAD
<<<<<<< HEAD
>>>>>>> locatelli-main
=======
<<<<<<< HEAD
>>>>>>> locatelli-main
=======
>>>>>>> locatelli-main
=======
>>>>>>> locatelli-main
=======
>>>>>>> locatelli-main
=======
>>>>>>> locatelli-main
=======
>>>>>>> locatelli-main
=======
>>>>>>> locatelli-main
=======
>>>>>>> locatelli-main
=======
>>>>>>> locatelli-main
=======
>>>>>>> locatelli-main
=======
>>>>>>> locatelli-main
=======
>>>>>>> locatelli-main
>>>>>>> d022c4befe (GEOMESA-3203 Short-circuit disjoint filters in index scans (#2862))
<<<<<<< HEAD
>>>>>>> 29d406f66f (GEOMESA-3203 Short-circuit disjoint filters in index scans (#2862))
=======
=======
=======
>>>>>>> 9e5293be2 (GEOMESA-3214 Fix warning about full table scan with Filter.EXCLUDE)
>>>>>>> 4c943341c0 (GEOMESA-3214 Fix warning about full table scan with Filter.EXCLUDE)
<<<<<<< HEAD
<<<<<<< HEAD
<<<<<<< HEAD
=======
<<<<<<< HEAD
<<<<<<< HEAD
<<<<<<< HEAD
<<<<<<< HEAD
<<<<<<< HEAD
<<<<<<< HEAD
<<<<<<< HEAD
<<<<<<< HEAD
<<<<<<< HEAD
<<<<<<< HEAD
<<<<<<< HEAD
<<<<<<< HEAD
<<<<<<< HEAD
=======
>>>>>>> c738f63bd9 (GEOMESA-3254 Add Bloop build support)
>>>>>>> locatelli-main
=======
<<<<<<< HEAD
=======
>>>>>>> c738f63bd9 (GEOMESA-3254 Add Bloop build support)
>>>>>>> locatelli-main
=======
>>>>>>> c738f63bd9 (GEOMESA-3254 Add Bloop build support)
>>>>>>> locatelli-main
=======
>>>>>>> c738f63bd9 (GEOMESA-3254 Add Bloop build support)
>>>>>>> locatelli-main
=======
>>>>>>> c738f63bd9 (GEOMESA-3254 Add Bloop build support)
>>>>>>> locatelli-main
=======
>>>>>>> c738f63bd9 (GEOMESA-3254 Add Bloop build support)
>>>>>>> locatelli-main
=======
>>>>>>> c738f63bd9 (GEOMESA-3254 Add Bloop build support)
>>>>>>> locatelli-main
=======
>>>>>>> c738f63bd9 (GEOMESA-3254 Add Bloop build support)
>>>>>>> locatelli-main
=======
>>>>>>> c738f63bd9 (GEOMESA-3254 Add Bloop build support)
>>>>>>> locatelli-main
=======
>>>>>>> c738f63bd9 (GEOMESA-3254 Add Bloop build support)
>>>>>>> locatelli-main
=======
>>>>>>> c738f63bd9 (GEOMESA-3254 Add Bloop build support)
>>>>>>> locatelli-main
=======
>>>>>>> c738f63bd9 (GEOMESA-3254 Add Bloop build support)
>>>>>>> locatelli-main
=======
>>>>>>> c738f63bd9 (GEOMESA-3254 Add Bloop build support)
>>>>>>> locatelli-main
>>>>>>> c7527e3843 (GEOMESA-3214 Fix warning about full table scan with Filter.EXCLUDE)
=======
=======
>>>>>>> d845d7c1bd (GEOMESA-3254 Add Bloop build support)
>>>>>>> f1532f2313 (GEOMESA-3254 Add Bloop build support)
<<<<<<< HEAD
<<<<<<< HEAD
=======
<<<<<<< HEAD
<<<<<<< HEAD
<<<<<<< HEAD
<<<<<<< HEAD
<<<<<<< HEAD
<<<<<<< HEAD
<<<<<<< HEAD
<<<<<<< HEAD
<<<<<<< HEAD
<<<<<<< HEAD
<<<<<<< HEAD
<<<<<<< HEAD
<<<<<<< HEAD
>>>>>>> locatelli-main
=======
<<<<<<< HEAD
>>>>>>> locatelli-main
=======
=======
>>>>>>> locatelli-main
=======
>>>>>>> locatelli-main
=======
>>>>>>> locatelli-main
=======
>>>>>>> locatelli-main
=======
>>>>>>> locatelli-main
=======
>>>>>>> locatelli-main
=======
>>>>>>> locatelli-main
=======
>>>>>>> locatelli-main
=======
>>>>>>> locatelli-main
=======
>>>>>>> locatelli-main
=======
>>>>>>> locatelli-main
>>>>>>> 7254911963 (GEOMESA-3203 Short-circuit disjoint filters in index scans (#2862))
=======
>>>>>>> a3651df0c4 (GEOMESA-3214 Fix warning about full table scan with Filter.EXCLUDE)
<<<<<<< HEAD
<<<<<<< HEAD
=======
<<<<<<< HEAD
<<<<<<< HEAD
<<<<<<< HEAD
<<<<<<< HEAD
<<<<<<< HEAD
<<<<<<< HEAD
<<<<<<< HEAD
<<<<<<< HEAD
<<<<<<< HEAD
<<<<<<< HEAD
<<<<<<< HEAD
<<<<<<< HEAD
<<<<<<< HEAD
>>>>>>> locatelli-main
=======
<<<<<<< HEAD
>>>>>>> locatelli-main
=======
=======
>>>>>>> locatelli-main
=======
>>>>>>> locatelli-main
=======
>>>>>>> locatelli-main
=======
>>>>>>> locatelli-main
=======
>>>>>>> locatelli-main
=======
>>>>>>> locatelli-main
=======
>>>>>>> locatelli-main
=======
>>>>>>> locatelli-main
=======
>>>>>>> locatelli-main
=======
>>>>>>> locatelli-main
=======
>>>>>>> locatelli-main
=======
=======
>>>>>>> 37b4aef862 (GEOMESA-3214 Fix warning about full table scan with Filter.EXCLUDE)
=======
>>>>>>> 9e5293be2 (GEOMESA-3214 Fix warning about full table scan with Filter.EXCLUDE)
=======
>>>>>>> d022c4bef (GEOMESA-3203 Short-circuit disjoint filters in index scans (#2862))
<<<<<<< HEAD
>>>>>>> 592e71a19e (GEOMESA-3203 Short-circuit disjoint filters in index scans (#2862))
<<<<<<< HEAD
>>>>>>> b7410da0d3 (GEOMESA-3203 Short-circuit disjoint filters in index scans (#2862))
=======
=======
=======
=======
>>>>>>> 9e5293be2 (GEOMESA-3214 Fix warning about full table scan with Filter.EXCLUDE)
>>>>>>> 4c943341c (GEOMESA-3214 Fix warning about full table scan with Filter.EXCLUDE)
>>>>>>> 37b4aef862 (GEOMESA-3214 Fix warning about full table scan with Filter.EXCLUDE)
>>>>>>> 3d9764749f (GEOMESA-3214 Fix warning about full table scan with Filter.EXCLUDE)
=======
>>>>>>> 63a045a753 (GEOMESA-3254 Add Bloop build support)
>>>>>>> 5a4c24e020 (GEOMESA-3254 Add Bloop build support)
<<<<<<< HEAD
<<<<<<< HEAD
=======
<<<<<<< HEAD
<<<<<<< HEAD
<<<<<<< HEAD
<<<<<<< HEAD
<<<<<<< HEAD
<<<<<<< HEAD
<<<<<<< HEAD
<<<<<<< HEAD
<<<<<<< HEAD
<<<<<<< HEAD
<<<<<<< HEAD
<<<<<<< HEAD
<<<<<<< HEAD
>>>>>>> locatelli-main
=======
<<<<<<< HEAD
>>>>>>> locatelli-main
=======
=======
>>>>>>> locatelli-main
=======
>>>>>>> locatelli-main
=======
>>>>>>> locatelli-main
=======
>>>>>>> locatelli-main
=======
>>>>>>> locatelli-main
=======
>>>>>>> locatelli-main
=======
>>>>>>> locatelli-main
=======
>>>>>>> locatelli-main
=======
>>>>>>> locatelli-main
=======
>>>>>>> locatelli-main
=======
>>>>>>> locatelli-main
>>>>>>> 8caa458e72 (GEOMESA-3203 Short-circuit disjoint filters in index scans (#2862))
>>>>>>> b2a371f6ff (GEOMESA-3203 Short-circuit disjoint filters in index scans (#2862))
=======
>>>>>>> 9ddab1e4ef (GEOMESA-3214 Fix warning about full table scan with Filter.EXCLUDE)
<<<<<<< HEAD
<<<<<<< HEAD
=======
<<<<<<< HEAD
<<<<<<< HEAD
<<<<<<< HEAD
<<<<<<< HEAD
<<<<<<< HEAD
<<<<<<< HEAD
<<<<<<< HEAD
<<<<<<< HEAD
<<<<<<< HEAD
<<<<<<< HEAD
<<<<<<< HEAD
<<<<<<< HEAD
<<<<<<< HEAD
=======
>>>>>>> 00d9ed0bf2 (GEOMESA-3203 Short-circuit disjoint filters in index scans (#2862))
>>>>>>> locatelli-main
=======
<<<<<<< HEAD
=======
>>>>>>> 00d9ed0bf2 (GEOMESA-3203 Short-circuit disjoint filters in index scans (#2862))
>>>>>>> locatelli-main
=======
>>>>>>> 00d9ed0bf2 (GEOMESA-3203 Short-circuit disjoint filters in index scans (#2862))
>>>>>>> locatelli-main
=======
>>>>>>> 00d9ed0bf2 (GEOMESA-3203 Short-circuit disjoint filters in index scans (#2862))
>>>>>>> locatelli-main
=======
>>>>>>> 00d9ed0bf2 (GEOMESA-3203 Short-circuit disjoint filters in index scans (#2862))
>>>>>>> locatelli-main
=======
>>>>>>> 00d9ed0bf2 (GEOMESA-3203 Short-circuit disjoint filters in index scans (#2862))
>>>>>>> locatelli-main
=======
>>>>>>> 00d9ed0bf2 (GEOMESA-3203 Short-circuit disjoint filters in index scans (#2862))
>>>>>>> locatelli-main
=======
>>>>>>> 00d9ed0bf2 (GEOMESA-3203 Short-circuit disjoint filters in index scans (#2862))
>>>>>>> locatelli-main
=======
>>>>>>> 00d9ed0bf2 (GEOMESA-3203 Short-circuit disjoint filters in index scans (#2862))
>>>>>>> locatelli-main
=======
>>>>>>> 00d9ed0bf2 (GEOMESA-3203 Short-circuit disjoint filters in index scans (#2862))
>>>>>>> locatelli-main
=======
>>>>>>> 00d9ed0bf2 (GEOMESA-3203 Short-circuit disjoint filters in index scans (#2862))
>>>>>>> locatelli-main
=======
>>>>>>> 00d9ed0bf2 (GEOMESA-3203 Short-circuit disjoint filters in index scans (#2862))
>>>>>>> locatelli-main
=======
>>>>>>> 00d9ed0bf2 (GEOMESA-3203 Short-circuit disjoint filters in index scans (#2862))
>>>>>>> locatelli-main
=======
=======
>>>>>>> b26fc9b51 (GEOMESA-3203 Short-circuit disjoint filters in index scans (#2862))
>>>>>>> e53e7db1e2 (GEOMESA-3203 Short-circuit disjoint filters in index scans (#2862))
>>>>>>> c973459fb6 (GEOMESA-3203 Short-circuit disjoint filters in index scans (#2862))
<<<<<<< HEAD
<<<<<<< HEAD
=======
>>>>>>> ee55e5ab74 (GEOMESA-3214 Fix warning about full table scan with Filter.EXCLUDE)
<<<<<<< HEAD
=======
<<<<<<< HEAD
<<<<<<< HEAD
<<<<<<< HEAD
<<<<<<< HEAD
<<<<<<< HEAD
<<<<<<< HEAD
<<<<<<< HEAD
<<<<<<< HEAD
<<<<<<< HEAD
<<<<<<< HEAD
<<<<<<< HEAD
=======
>>>>>>> locatelli-main
<<<<<<< HEAD
=======
>>>>>>> ee55e5ab74 (GEOMESA-3214 Fix warning about full table scan with Filter.EXCLUDE)
=======
>>>>>>> locatelli-main
<<<<<<< HEAD
=======
=======
>>>>>>> locatelli-main
=======
>>>>>>> locatelli-main
=======
>>>>>>> locatelli-main
=======
>>>>>>> locatelli-main
=======
>>>>>>> locatelli-main
=======
>>>>>>> locatelli-main
=======
>>>>>>> locatelli-main
=======
>>>>>>> locatelli-main
=======
>>>>>>> locatelli-main
=======
>>>>>>> locatelli-main
>>>>>>> b26fc9b517 (GEOMESA-3203 Short-circuit disjoint filters in index scans (#2862))
>>>>>>> 1846781d8e (GEOMESA-3203 Short-circuit disjoint filters in index scans (#2862))
=======
>>>>>>> 825515ce74 (GEOMESA-3214 Fix warning about full table scan with Filter.EXCLUDE)
=======
>>>>>>> b26fc9b517 (GEOMESA-3203 Short-circuit disjoint filters in index scans (#2862))
=======
>>>>>>> 9e5293be2a (GEOMESA-3214 Fix warning about full table scan with Filter.EXCLUDE)
=======
>>>>>>> b26fc9b51 (GEOMESA-3203 Short-circuit disjoint filters in index scans (#2862))
<<<<<<< HEAD
>>>>>>> d022c4befe (GEOMESA-3203 Short-circuit disjoint filters in index scans (#2862))
<<<<<<< HEAD
>>>>>>> e1f7e73003 (GEOMESA-3203 Short-circuit disjoint filters in index scans (#2862))
=======
=======
=======
>>>>>>> 9e5293be2 (GEOMESA-3214 Fix warning about full table scan with Filter.EXCLUDE)
>>>>>>> 4c943341c0 (GEOMESA-3214 Fix warning about full table scan with Filter.EXCLUDE)
>>>>>>> 8c519079d0 (GEOMESA-3214 Fix warning about full table scan with Filter.EXCLUDE)
=======
=======
>>>>>>> d845d7c1bd (GEOMESA-3254 Add Bloop build support)
>>>>>>> 7a84c9d22d (GEOMESA-3254 Add Bloop build support)
=======
>>>>>>> fc398c6949 (GEOMESA-3203 Short-circuit disjoint filters in index scans (#2862))
=======
>>>>>>> 34b2d6632f (GEOMESA-3214 Fix warning about full table scan with Filter.EXCLUDE)
=======
=======
=======
>>>>>>> 37b4aef862 (GEOMESA-3214 Fix warning about full table scan with Filter.EXCLUDE)
=======
>>>>>>> 9e5293be2 (GEOMESA-3214 Fix warning about full table scan with Filter.EXCLUDE)
=======
>>>>>>> d022c4bef (GEOMESA-3203 Short-circuit disjoint filters in index scans (#2862))
<<<<<<< HEAD
>>>>>>> 592e71a19e (GEOMESA-3203 Short-circuit disjoint filters in index scans (#2862))
<<<<<<< HEAD
>>>>>>> 13fb1c6150 (GEOMESA-3203 Short-circuit disjoint filters in index scans (#2862))
=======
=======
=======
=======
>>>>>>> 9e5293be2 (GEOMESA-3214 Fix warning about full table scan with Filter.EXCLUDE)
>>>>>>> 4c943341c (GEOMESA-3214 Fix warning about full table scan with Filter.EXCLUDE)
>>>>>>> 37b4aef862 (GEOMESA-3214 Fix warning about full table scan with Filter.EXCLUDE)
>>>>>>> 1d05eb986e (GEOMESA-3214 Fix warning about full table scan with Filter.EXCLUDE)
=======
>>>>>>> 63a045a753 (GEOMESA-3254 Add Bloop build support)
>>>>>>> b298e017f1 (GEOMESA-3254 Add Bloop build support)
=======
>>>>>>> 8caa458e72 (GEOMESA-3203 Short-circuit disjoint filters in index scans (#2862))
>>>>>>> 64e79ba0b0 (GEOMESA-3203 Short-circuit disjoint filters in index scans (#2862))
=======
>>>>>>> 19265e7a87 (GEOMESA-3214 Fix warning about full table scan with Filter.EXCLUDE)
=======
=======
>>>>>>> b26fc9b51 (GEOMESA-3203 Short-circuit disjoint filters in index scans (#2862))
>>>>>>> e53e7db1e2 (GEOMESA-3203 Short-circuit disjoint filters in index scans (#2862))
>>>>>>> 9d271849b7 (GEOMESA-3203 Short-circuit disjoint filters in index scans (#2862))
=======
>>>>>>> 9f601af8cc (GEOMESA-3214 Fix warning about full table scan with Filter.EXCLUDE)
=======
=======
>>>>>>> b26fc9b517 (GEOMESA-3203 Short-circuit disjoint filters in index scans (#2862))
>>>>>>> fd58203632 (GEOMESA-3203 Short-circuit disjoint filters in index scans (#2862))
>>>>>>> 6033751879 (GEOMESA-3203 Short-circuit disjoint filters in index scans (#2862))
=======
>>>>>>> bc58bb16eb (GEOMESA-3214 Fix warning about full table scan with Filter.EXCLUDE)
=======
=======
>>>>>>> 6e41de2827 (GEOMESA-3214 Fix warning about full table scan with Filter.EXCLUDE)
>>>>>>> d022c4befe (GEOMESA-3203 Short-circuit disjoint filters in index scans (#2862))
<<<<<<< HEAD
>>>>>>> 29d406f66f (GEOMESA-3203 Short-circuit disjoint filters in index scans (#2862))
<<<<<<< HEAD
>>>>>>> aae8270e82 (GEOMESA-3203 Short-circuit disjoint filters in index scans (#2862))
=======
=======
=======
=======
>>>>>>> 9e5293be2 (GEOMESA-3214 Fix warning about full table scan with Filter.EXCLUDE)
>>>>>>> 4c943341c0 (GEOMESA-3214 Fix warning about full table scan with Filter.EXCLUDE)
>>>>>>> c7527e3843 (GEOMESA-3214 Fix warning about full table scan with Filter.EXCLUDE)
>>>>>>> 6e41de2827 (GEOMESA-3214 Fix warning about full table scan with Filter.EXCLUDE)
=======
>>>>>>> c738f63bd9 (GEOMESA-3254 Add Bloop build support)
=======
=======
>>>>>>> 7254911963 (GEOMESA-3203 Short-circuit disjoint filters in index scans (#2862))
>>>>>>> b76027496d (GEOMESA-3203 Short-circuit disjoint filters in index scans (#2862))
=======
>>>>>>> 8e01f6263e (GEOMESA-3214 Fix warning about full table scan with Filter.EXCLUDE)
=======
=======
=======
=======
>>>>>>> 37b4aef862 (GEOMESA-3214 Fix warning about full table scan with Filter.EXCLUDE)
=======
>>>>>>> 9e5293be2 (GEOMESA-3214 Fix warning about full table scan with Filter.EXCLUDE)
=======
>>>>>>> d022c4bef (GEOMESA-3203 Short-circuit disjoint filters in index scans (#2862))
<<<<<<< HEAD
>>>>>>> 592e71a19e (GEOMESA-3203 Short-circuit disjoint filters in index scans (#2862))
<<<<<<< HEAD
>>>>>>> b7410da0d3 (GEOMESA-3203 Short-circuit disjoint filters in index scans (#2862))
<<<<<<< HEAD
>>>>>>> c73145a433 (GEOMESA-3203 Short-circuit disjoint filters in index scans (#2862))
=======
=======
=======
=======
=======
>>>>>>> 9e5293be2 (GEOMESA-3214 Fix warning about full table scan with Filter.EXCLUDE)
>>>>>>> 4c943341c (GEOMESA-3214 Fix warning about full table scan with Filter.EXCLUDE)
>>>>>>> 37b4aef862 (GEOMESA-3214 Fix warning about full table scan with Filter.EXCLUDE)
>>>>>>> 3d9764749f (GEOMESA-3214 Fix warning about full table scan with Filter.EXCLUDE)
>>>>>>> 19e80a7633 (GEOMESA-3214 Fix warning about full table scan with Filter.EXCLUDE)
=======
>>>>>>> 13656f5052 (GEOMESA-3254 Add Bloop build support)
=======
=======
>>>>>>> 8caa458e72 (GEOMESA-3203 Short-circuit disjoint filters in index scans (#2862))
>>>>>>> b2a371f6ff (GEOMESA-3203 Short-circuit disjoint filters in index scans (#2862))
>>>>>>> 2582e9f50b (GEOMESA-3203 Short-circuit disjoint filters in index scans (#2862))
=======
>>>>>>> e14a4b4a14 (GEOMESA-3214 Fix warning about full table scan with Filter.EXCLUDE)
=======
>>>>>>> 00d9ed0bf2 (GEOMESA-3203 Short-circuit disjoint filters in index scans (#2862))
=======
=======
>>>>>>> ee55e5ab74 (GEOMESA-3214 Fix warning about full table scan with Filter.EXCLUDE)
>>>>>>> 029ad6f319 (GEOMESA-3214 Fix warning about full table scan with Filter.EXCLUDE)
=======
<<<<<<< HEAD
<<<<<<< HEAD
<<<<<<< HEAD
<<<<<<< HEAD
<<<<<<< HEAD
<<<<<<< HEAD
<<<<<<< HEAD
<<<<<<< HEAD
<<<<<<< HEAD
<<<<<<< HEAD
<<<<<<< HEAD
<<<<<<< HEAD
>>>>>>> locatelli-main
=======
>>>>>>> locatelli-main
=======
>>>>>>> locatelli-main
=======
>>>>>>> locatelli-main
=======
>>>>>>> locatelli-main
=======
>>>>>>> locatelli-main
=======
>>>>>>> locatelli-main
=======
>>>>>>> locatelli-main
=======
>>>>>>> locatelli-main
=======
>>>>>>> locatelli-main
=======
>>>>>>> locatelli-main
=======
>>>>>>> locatelli-main
=======
>>>>>>> locatelli-main
>>>>>>> locationtech-main
=======
>>>>>>> b26fc9b51 (GEOMESA-3203 Short-circuit disjoint filters in index scans (#2862))
>>>>>>> 5666197b2a (GEOMESA-3203 Short-circuit disjoint filters in index scans (#2862))
<<<<<<< HEAD
<<<<<<< HEAD
<<<<<<< HEAD
<<<<<<< HEAD
<<<<<<< HEAD
<<<<<<< HEAD
<<<<<<< HEAD
<<<<<<< HEAD
<<<<<<< HEAD
<<<<<<< HEAD
<<<<<<< HEAD
<<<<<<< HEAD
<<<<<<< HEAD
=======
<<<<<<< HEAD
=======
>>>>>>> locatelli-main
=======
>>>>>>> locatelli-main
=======
>>>>>>> locatelli-main
=======
>>>>>>> locatelli-main
=======
>>>>>>> locatelli-main
=======
>>>>>>> locatelli-main
=======
>>>>>>> locatelli-main
=======
>>>>>>> locatelli-main
=======
>>>>>>> locatelli-main
=======
>>>>>>> locatelli-main
=======
>>>>>>> locatelli-main
=======
>>>>>>> locatelli-main
>>>>>>> e85778a06f (GEOMESA-3203 Short-circuit disjoint filters in index scans (#2862))
=======
=======
=======
>>>>>>> 9e5293be2 (GEOMESA-3214 Fix warning about full table scan with Filter.EXCLUDE)
>>>>>>> bad30768f2 (GEOMESA-3214 Fix warning about full table scan with Filter.EXCLUDE)
>>>>>>> 089a9f3f18 (GEOMESA-3214 Fix warning about full table scan with Filter.EXCLUDE)
=======
>>>>>>> b26fc9b51 (GEOMESA-3203 Short-circuit disjoint filters in index scans (#2862))
>>>>>>> 5666197b2a (GEOMESA-3203 Short-circuit disjoint filters in index scans (#2862))
<<<<<<< HEAD
<<<<<<< HEAD
<<<<<<< HEAD
<<<<<<< HEAD
<<<<<<< HEAD
<<<<<<< HEAD
<<<<<<< HEAD
<<<<<<< HEAD
<<<<<<< HEAD
<<<<<<< HEAD
<<<<<<< HEAD
<<<<<<< HEAD
>>>>>>> locatelli-main
=======
>>>>>>> locatelli-main
=======
>>>>>>> locatelli-main
=======
>>>>>>> locatelli-main
=======
>>>>>>> locatelli-main
=======
>>>>>>> locatelli-main
=======
>>>>>>> locatelli-main
=======
>>>>>>> locatelli-main
=======
>>>>>>> locatelli-main
=======
>>>>>>> locatelli-main
=======
>>>>>>> locatelli-main
=======
>>>>>>> locatelli-main
=======
>>>>>>> locatelli-main
=======
=======
>>>>>>> 9e5293be2 (GEOMESA-3214 Fix warning about full table scan with Filter.EXCLUDE)
>>>>>>> bad30768f2 (GEOMESA-3214 Fix warning about full table scan with Filter.EXCLUDE)
<<<<<<< HEAD
<<<<<<< HEAD
<<<<<<< HEAD
<<<<<<< HEAD
<<<<<<< HEAD
<<<<<<< HEAD
<<<<<<< HEAD
<<<<<<< HEAD
<<<<<<< HEAD
<<<<<<< HEAD
<<<<<<< HEAD
<<<<<<< HEAD
<<<<<<< HEAD
=======
>>>>>>> b26fc9b51 (GEOMESA-3203 Short-circuit disjoint filters in index scans (#2862))
=======
>>>>>>> 9e5293be2 (GEOMESA-3214 Fix warning about full table scan with Filter.EXCLUDE)
>>>>>>> locationtech-main
=======
>>>>>>> locatelli-main
=======
>>>>>>> locatelli-main
=======
>>>>>>> locatelli-main
=======
>>>>>>> locatelli-main
=======
>>>>>>> locatelli-main
=======
>>>>>>> locatelli-main
=======
>>>>>>> locatelli-main
=======
>>>>>>> locatelli-main
=======
>>>>>>> locatelli-main
=======
>>>>>>> locatelli-main
=======
>>>>>>> locatelli-main
=======
>>>>>>> locatelli-main
=======
>>>>>>> locatelli-main
          ds.adapter.createQueryPlan(qs)
        }
      }
    }
  }
}

object QueryPlanner extends LazyLogging {

  import org.locationtech.geomesa.utils.geotools.RichSimpleFeatureType.RichSimpleFeatureType

  private[planning] val threadedHints = new SoftThreadLocal[Map[AnyRef, AnyRef]]

  object CostEvaluation extends Enumeration {
    type CostEvaluation = Value
    val Stats, Index = Value
  }

  // threaded hints were used as a work-around with wfs output formats, but now we use GetFeatureCallback instead
  @deprecated("Deprecated with no replacement")
  def setPerThreadQueryHints(hints: Map[AnyRef, AnyRef]): Unit = threadedHints.put(hints)
  @deprecated("Deprecated with no replacement")
  def getPerThreadQueryHints: Option[Map[AnyRef, AnyRef]] = threadedHints.get
  @deprecated("Deprecated with no replacement")
  def clearPerThreadQueryHints(): Unit = threadedHints.clear()

  /**
   * Checks for attribute transforms in the query and sets them as hints if found
   *
   * @param sft simple feature type
   * @param query query
   * @return
   */
  def setQueryTransforms(sft: SimpleFeatureType, query: Query): Unit = {
    extractQueryTransforms(sft, query).foreach { case (schema, _, transforms) =>
      query.getHints.put(QueryHints.Internal.TRANSFORMS, transforms)
      query.getHints.put(QueryHints.Internal.TRANSFORM_SCHEMA, schema)
    }
  }

  /**
   * Extract and parse transforms from the query
   *
   * @param sft simple feature type
   * @param query query
   * @return
   */
  def extractQueryTransforms(
      sft: SimpleFeatureType,
      query: Query): Option[(SimpleFeatureType, Seq[Transform], String)] = {
    // even if a transform is not specified, some queries only use a subset of attributes
    // specify them here so that it's easier to pick the best column group later
    def fromQueryType: Option[Seq[String]] = {
      val hints = query.getHints
      if (hints.isBinQuery) {
        Some(BinAggregatingScan.propertyNames(hints, sft))
      } else if (hints.isDensityQuery) {
        Some(DensityScan.propertyNames(hints, sft))
      } else if (hints.isStatsQuery) {
        Some(StatParser.propertyNames(sft, hints.getStatsQuery))
      } else {
        None
      }
    }

    // since we do sorting on the client, just add any sort-by attributes to the transform
    // TODO GEOMESA-2655 we should sort and then transform back to the requested props, but it's complicated...
    def withSort(props: Array[String]): Seq[String] = {
      val names = props.map(p => if (p.contains('=')) { p.substring(0, p.indexOf('=')) } else { p })
      props ++ Option(query.getSortBy).toSeq.flatMap { sort =>
        sort.flatMap(s => Option(s.getPropertyName).flatMap(p => Option(p.getPropertyName).filterNot(names.contains)))
      }
    }

    // ignore transforms that don't actually do anything
    def noop(props: Seq[String]): Boolean = props == sft.getAttributeDescriptors.asScala.map(_.getLocalName)

    Option(query.getPropertyNames).map(withSort).filterNot(noop).orElse(fromQueryType).map { props =>
      val transforms = Transforms(sft, props)
      val schema = Transforms.schema(sft, transforms)
      val definition = props.mkString(Transform.DefinitionDelimiter)
      (schema, transforms, definition)
    }
  }

  /**
    * Sets query hints for sorting
    *
    * @param sft sft
    * @param query query
    */
  def setQuerySort(sft: SimpleFeatureType, query: Query): Unit = {
    val sortBy = query.getSortBy
    if (sortBy != null && sortBy.nonEmpty) {
      val hints = query.getHints
      if (hints.isArrowQuery) {
        if (sortBy.lengthCompare(1) > 0) {
          throw new IllegalArgumentException("Arrow queries only support sort by a single field: " +
              sortBy.mkString(", "))
        } else if (sortBy.head.getPropertyName == null) {
          throw new IllegalArgumentException("Arrow queries only support sort by properties: " +
              sortBy.mkString(", "))
        }
        val field = sortBy.head.getPropertyName.getPropertyName
        val reverse = sortBy.head.getSortOrder == SortOrder.DESCENDING
        hints.getArrowSort.foreach { case (f, r) =>
          if (f != field || r != reverse) {
            throw new IllegalArgumentException(s"Query sort does not match Arrow hints sort: " +
                s"${sortBy.mkString(", ")} != $f:${if (r) "DESC" else "ASC"}")
          }
        }
        hints.put(QueryHints.ARROW_SORT_FIELD, field)
        hints.put(QueryHints.ARROW_SORT_REVERSE, reverse)
      } else if (hints.isBinQuery) {
        val dtg = hints.getBinDtgField.orElse(sft.getDtgField).orNull
        if (dtg == null ||
            sortBy.map(s => Option(s.getPropertyName).map(_.getPropertyName).orNull).toSeq != Seq(dtg)) {
          throw new IllegalArgumentException("BIN queries only support sort by a date-type field: " +
              sortBy.mkString(", "))
        }
        if (sortBy.head.getSortOrder == SortOrder.DESCENDING) {
          throw new IllegalArgumentException("BIN queries only support sort in ASCENDING order: " +
              sortBy.mkString(", "))
        }
        if (hints.get(QueryHints.BIN_SORT) != null && !hints.isBinSorting) {
          throw new IllegalArgumentException("Query sort order contradicts BIN sorting hint: " +
              sortBy.mkString(", "))
        }
        hints.put(QueryHints.BIN_SORT, java.lang.Boolean.TRUE)
      } else {
        hints.put(QueryHints.Internal.SORT_FIELDS, QueryHints.Internal.toSortHint(sortBy))
      }
    }
  }

  /**
    * Sets query hints for reprojection
    *
    * @param sft sft
    * @param query query
    */
  def setProjection(sft: SimpleFeatureType, query: Query): Unit = {
    QueryReferenceSystems(query).foreach { crs =>
      query.getHints.put(QueryHints.Internal.REPROJECTION, QueryHints.Internal.toProjectionHint(crs))
    }
  }

  /**
    * Sets the max features from a query into the query hints
    *
    * @param query query
    */
  def setMaxFeatures(query: Query): Unit = {
    if (!query.isMaxFeaturesUnlimited) {
      query.getHints.put(QueryHints.Internal.MAX_FEATURES, Int.box(query.getMaxFeatures))
    }
  }
}
