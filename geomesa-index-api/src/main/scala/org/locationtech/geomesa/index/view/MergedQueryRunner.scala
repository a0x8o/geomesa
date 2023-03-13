/***********************************************************************
 * Copyright (c) 2013-2023 Commonwealth Computer Research, Inc.
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Apache License, Version 2.0
 * which accompanies this distribution and is available at
 * http://www.opensource.org/licenses/apache2.0.php.
 ***********************************************************************/

package org.locationtech.geomesa.index.view

import com.typesafe.scalalogging.LazyLogging
import org.geotools.data.{DataStore, FeatureReader, Query, Transaction}
import org.geotools.util.factory.Hints
import org.locationtech.geomesa.arrow.ArrowEncodedSft
import org.locationtech.geomesa.arrow.io.FormatVersion
import org.locationtech.geomesa.arrow.vector.SimpleFeatureVector.SimpleFeatureEncoding
import org.locationtech.geomesa.index.conf.QueryHints
import org.locationtech.geomesa.index.geoserver.ViewParams
import org.locationtech.geomesa.index.iterators.{ArrowScan, DensityScan, StatsScan}
import org.locationtech.geomesa.index.planning.QueryInterceptor.QueryInterceptorFactory
import org.locationtech.geomesa.index.planning.QueryRunner.QueryResult
import org.locationtech.geomesa.index.planning.{LocalQueryRunner, QueryPlanner, QueryRunner}
import org.locationtech.geomesa.index.stats.HasGeoMesaStats
import org.locationtech.geomesa.index.utils.Explainer
import org.locationtech.geomesa.index.view.MergedQueryRunner.Queryable
import org.locationtech.geomesa.utils.bin.BinaryOutputEncoder
import org.locationtech.geomesa.utils.collection.{CloseableIterator, SelfClosingIterator}
import org.locationtech.geomesa.utils.geotools.{SimpleFeatureOrdering, SimpleFeatureTypes}
import org.locationtech.geomesa.utils.iterators.{DeduplicatingSimpleFeatureIterator, SortedMergeIterator}
<<<<<<< HEAD
=======
import org.locationtech.geomesa.utils.stats._
>>>>>>> 1a21a3c30 (GEOMESA-3113 Add system property to managing HBase deletes with visibilities (#2792))
import org.opengis.feature.simple.{SimpleFeature, SimpleFeatureType}
import org.opengis.filter.Filter

/**
 * Query runner for merging results from multiple stores
 *
 * @param ds merged data store
 * @param stores delegate stores
 * @param deduplicate deduplicate the results between stores
<<<<<<< HEAD
 * @param parallel run scans in parallel (vs sequentially)
 */
class MergedQueryRunner(
    ds: HasGeoMesaStats,
    stores: Seq[(Queryable, Option[Filter])],
    deduplicate: Boolean,
    parallel: Boolean
  ) extends QueryRunner with LazyLogging {
=======
 */
class MergedQueryRunner(ds: HasGeoMesaStats, stores: Seq[(Queryable, Option[Filter])], deduplicate: Boolean)
    extends QueryRunner with LazyLogging {
>>>>>>> 1a21a3c30 (GEOMESA-3113 Add system property to managing HBase deletes with visibilities (#2792))

  import org.locationtech.geomesa.index.conf.QueryHints.RichHints

  // query interceptors are handled by the individual data stores
  override protected val interceptors: QueryInterceptorFactory = QueryInterceptorFactory.empty()

<<<<<<< HEAD
  override def runQuery(sft: SimpleFeatureType, original: Query, explain: Explainer): QueryResult = {
    // TODO deduplicate arrow, bin, density queries...
    // get view params and threaded query hints
=======
  override def runQuery(
      sft: SimpleFeatureType,
      original: Query,
      explain: Explainer): CloseableIterator[SimpleFeature] = {

    // TODO deduplicate arrow, bin, density queries...

>>>>>>> 1a21a3c30 (GEOMESA-3113 Add system property to managing HBase deletes with visibilities (#2792))
    val query = configureQuery(sft, original)
    val hints = query.getHints
    val maxFeatures = if (query.isMaxFeaturesUnlimited) { None } else { Option(query.getMaxFeatures) }

    if (hints.isStatsQuery || hints.isArrowQuery) {
      // for stats and arrow queries, suppress the reduce step for gm stores so that we can do the merge here
      hints.put(QueryHints.Internal.SKIP_REDUCE, java.lang.Boolean.TRUE)
    }

    if (hints.isArrowQuery) {
      QueryResult(ArrowEncodedSft, hints, () => arrowQuery(sft, query))
    } else {
      // query each delegate store
      lazy val readers = stores.map { case (store, filter) =>
        // make sure to coy the hints so they aren't shared
<<<<<<< HEAD
        store.getFeatureReader(mergeFilter(sft, new Query(query), filter), Transaction.AUTO_COMMIT)
=======
        q.setHints(new Hints(hints))
        store.getFeatureReader(mergeFilter(sft, q, filter), Transaction.AUTO_COMMIT)
>>>>>>> 96cd783e7 (GEOMESA-3202 Check for disjoint date queries in merged view store)
      }

      if (hints.isDensityQuery) {
        QueryResult(DensityScan.DensitySft, hints, () => densityQuery(sft, readers, hints))
      } else if (hints.isStatsQuery) {
        QueryResult(StatsScan.StatsSft, hints, () => statsQuery(sft, readers, hints))
      } else if (hints.isBinQuery) {
        if (query.getSortBy != null && !query.getSortBy.isEmpty) {
          logger.warn("Ignoring sort for BIN query")
        }
        QueryResult(BinaryOutputEncoder.BinEncodedSft, hints, () => binQuery(sft, readers, hints))
      } else {
<<<<<<< HEAD
        val resultSft = QueryPlanner.extractQueryTransforms(sft, query).map(_._1).getOrElse(sft)
        def run(): CloseableIterator[SimpleFeature] = {
          val iters =
            if (deduplicate) {
              // we re-use the feature id cache across readers
              val cache = scala.collection.mutable.HashSet.empty[String]
              readers.map(r => new DeduplicatingSimpleFeatureIterator(SelfClosingIterator(r), cache))
            } else {
              readers.map(SelfClosingIterator(_))
            }

          val results = Option(query.getSortBy).filterNot(_.isEmpty) match {
            case None => SelfClosingIterator(iters.iterator).flatMap(i => i)
            // the delegate stores should sort their results, so we can sort merge them
            case Some(sort) => new SortedMergeIterator(iters)(SimpleFeatureOrdering(resultSft, sort))
<<<<<<< HEAD
          }

          maxFeatures match {
            case None => results
            case Some(m) => results.take(m)
          }
<<<<<<< HEAD
=======
        val iters =
          if (deduplicate) {
            // we re-use the feature id cache across readers
            val cache = scala.collection.mutable.HashSet.empty[String]
            readers.map(r => new DeduplicatingSimpleFeatureIterator(SelfClosingIterator(r), cache))
          } else {
            readers.map(SelfClosingIterator(_))
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
>>>>>>> 7ab33423d (GEOMESA-3113 Add system property to managing HBase deletes with visibilities (#2792))
=======
>>>>>>> 84634d919 (GEOMESA-3113 Add system property to managing HBase deletes with visibilities (#2792))
=======
>>>>>>> 4c9fb0f6e (GEOMESA-3113 Add system property to managing HBase deletes with visibilities (#2792))
=======
>>>>>>> e8cc4971c6 (Merge branch 'feature/postgis-fixes')
=======
>>>>>>> 6eb7e598f3 (GEOMESA-3113 Add system property to managing HBase deletes with visibilities (#2792))
=======
>>>>>>> a2c63a57a8 (GEOMESA-3113 Add system property to managing HBase deletes with visibilities (#2792))
=======
=======
>>>>>>> 7ea07a654 (GEOMESA-3113 Add system property to managing HBase deletes with visibilities (#2792))
>>>>>>> 0f2a67fb44 (GEOMESA-3113 Add system property to managing HBase deletes with visibilities (#2792))
=======
=======
>>>>>>> a0d6da1831 (GEOMESA-3113 Add system property to managing HBase deletes with visibilities (#2792))
=======
>>>>>>> cb6bda89b6 (Merge branch 'feature/postgis-fixes')
=======
>>>>>>> 7ea07a654 (GEOMESA-3113 Add system property to managing HBase deletes with visibilities (#2792))
=======
>>>>>>> 9814eb976 (GEOMESA-3113 Add system property to managing HBase deletes with visibilities (#2792))
<<<<<<< HEAD
>>>>>>> 26fc359a06 (GEOMESA-3113 Add system property to managing HBase deletes with visibilities (#2792))
=======
=======
>>>>>>> 4a47c538b (GEOMESA-3113 Add system property to managing HBase deletes with visibilities (#2792))
<<<<<<< HEAD
>>>>>>> a0d6da1831 (GEOMESA-3113 Add system property to managing HBase deletes with visibilities (#2792))
=======
=======
>>>>>>> db8d998aa (Merge branch 'feature/postgis-fixes')
>>>>>>> cb6bda89b6 (Merge branch 'feature/postgis-fixes')
        Option(query.getSortBy).filterNot(_.isEmpty) match {
=======
<<<<<<< HEAD
=======
>>>>>>> 45dca3e07 (GEOMESA-3113 Add system property to managing HBase deletes with visibilities (#2792))
<<<<<<< HEAD
<<<<<<< HEAD
<<<<<<< HEAD
<<<<<<< HEAD
=======
>>>>>>> 0f2a67fb44 (GEOMESA-3113 Add system property to managing HBase deletes with visibilities (#2792))
=======
>>>>>>> 26fc359a06 (GEOMESA-3113 Add system property to managing HBase deletes with visibilities (#2792))
=======
>>>>>>> 3cb02b7b0 (GEOMESA-3113 Add system property to managing HBase deletes with visibilities (#2792))
=======
>>>>>>> f8f49130b (GEOMESA-3113 Add system property to managing HBase deletes with visibilities (#2792))
<<<<<<< HEAD
<<<<<<< HEAD
<<<<<<< HEAD
=======
>>>>>>> a2c63a57a8 (GEOMESA-3113 Add system property to managing HBase deletes with visibilities (#2792))
=======
>>>>>>> a0d6da1831 (GEOMESA-3113 Add system property to managing HBase deletes with visibilities (#2792))
=======
        Option(query.getSortBy).filterNot(_.isEmpty) match {
=======
<<<<<<< HEAD
<<<<<<< HEAD
>>>>>>> ad8d1be45 (GEOMESA-3113 Add system property to managing HBase deletes with visibilities (#2792))
=======
>>>>>>> 7ab33423d (GEOMESA-3113 Add system property to managing HBase deletes with visibilities (#2792))
=======
=======
>>>>>>> 3cb02b7b0 (GEOMESA-3113 Add system property to managing HBase deletes with visibilities (#2792))
>>>>>>> 84634d919 (GEOMESA-3113 Add system property to managing HBase deletes with visibilities (#2792))
=======
>>>>>>> 4c9fb0f6e (GEOMESA-3113 Add system property to managing HBase deletes with visibilities (#2792))
=======
>>>>>>> f9397984e (GEOMESA-3113 Add system property to managing HBase deletes with visibilities (#2792))
<<<<<<< HEAD
>>>>>>> a2c63a57a8 (GEOMESA-3113 Add system property to managing HBase deletes with visibilities (#2792))
=======
=======
>>>>>>> 7ea07a654 (GEOMESA-3113 Add system property to managing HBase deletes with visibilities (#2792))
<<<<<<< HEAD
>>>>>>> 0f2a67fb44 (GEOMESA-3113 Add system property to managing HBase deletes with visibilities (#2792))
=======
=======
=======
>>>>>>> 3cb02b7b0 (GEOMESA-3113 Add system property to managing HBase deletes with visibilities (#2792))
>>>>>>> 9814eb976 (GEOMESA-3113 Add system property to managing HBase deletes with visibilities (#2792))
<<<<<<< HEAD
>>>>>>> 26fc359a06 (GEOMESA-3113 Add system property to managing HBase deletes with visibilities (#2792))
=======
=======
>>>>>>> 4a47c538b (GEOMESA-3113 Add system property to managing HBase deletes with visibilities (#2792))
>>>>>>> a0d6da1831 (GEOMESA-3113 Add system property to managing HBase deletes with visibilities (#2792))
        val results = Option(query.getSortBy).filterNot(_.isEmpty) match {
=======
        Option(query.getSortBy).filterNot(_.isEmpty) match {
>>>>>>> 1a21a3c30 (GEOMESA-3113 Add system property to managing HBase deletes with visibilities (#2792))
<<<<<<< HEAD
<<<<<<< HEAD
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
>>>>>>> 84634d919 (GEOMESA-3113 Add system property to managing HBase deletes with visibilities (#2792))
=======
>>>>>>> 4c9fb0f6e (GEOMESA-3113 Add system property to managing HBase deletes with visibilities (#2792))
=======
>>>>>>> a2c63a57a8 (GEOMESA-3113 Add system property to managing HBase deletes with visibilities (#2792))
=======
>>>>>>> 0f2a67fb44 (GEOMESA-3113 Add system property to managing HBase deletes with visibilities (#2792))
=======
=======
>>>>>>> 9814eb976 (GEOMESA-3113 Add system property to managing HBase deletes with visibilities (#2792))
>>>>>>> 26fc359a06 (GEOMESA-3113 Add system property to managing HBase deletes with visibilities (#2792))
=======
=======
>>>>>>> 9814eb976 (GEOMESA-3113 Add system property to managing HBase deletes with visibilities (#2792))
=======
>>>>>>> 4a47c538b (GEOMESA-3113 Add system property to managing HBase deletes with visibilities (#2792))
>>>>>>> a0d6da1831 (GEOMESA-3113 Add system property to managing HBase deletes with visibilities (#2792))
>>>>>>> 595c43086 (GEOMESA-3113 Add system property to managing HBase deletes with visibilities (#2792))
=======
>>>>>>> 45dca3e07 (GEOMESA-3113 Add system property to managing HBase deletes with visibilities (#2792))
=======
>>>>>>> 3cb02b7b0 (GEOMESA-3113 Add system property to managing HBase deletes with visibilities (#2792))
<<<<<<< HEAD
<<<<<<< HEAD
<<<<<<< HEAD
<<<<<<< HEAD
=======
>>>>>>> 26fc359a06 (GEOMESA-3113 Add system property to managing HBase deletes with visibilities (#2792))
=======
>>>>>>> a0d6da1831 (GEOMESA-3113 Add system property to managing HBase deletes with visibilities (#2792))
=======
>>>>>>> f8f49130b (GEOMESA-3113 Add system property to managing HBase deletes with visibilities (#2792))
=======
        val results = Option(query.getSortBy).filterNot(_.isEmpty) match {
>>>>>>> 3be8d2a5a (Merge branch 'feature/postgis-fixes')
<<<<<<< HEAD
<<<<<<< HEAD
<<<<<<< HEAD
=======
        Option(query.getSortBy).filterNot(_.isEmpty) match {
>>>>>>> c6103aab4 (GEOMESA-3113 Add system property to managing HBase deletes with visibilities (#2792))
=======
>>>>>>> 595c43086 (GEOMESA-3113 Add system property to managing HBase deletes with visibilities (#2792))
>>>>>>> ad8d1be45 (GEOMESA-3113 Add system property to managing HBase deletes with visibilities (#2792))
=======
>>>>>>> 595c43086 (GEOMESA-3113 Add system property to managing HBase deletes with visibilities (#2792))
=======
>>>>>>> 45dca3e07 (GEOMESA-3113 Add system property to managing HBase deletes with visibilities (#2792))
>>>>>>> 7ab33423d (GEOMESA-3113 Add system property to managing HBase deletes with visibilities (#2792))
=======
>>>>>>> 84634d919 (GEOMESA-3113 Add system property to managing HBase deletes with visibilities (#2792))
=======
=======
>>>>>>> f8f49130b (GEOMESA-3113 Add system property to managing HBase deletes with visibilities (#2792))
>>>>>>> 4c9fb0f6e (GEOMESA-3113 Add system property to managing HBase deletes with visibilities (#2792))
=======
>>>>>>> e8cc4971c6 (Merge branch 'feature/postgis-fixes')
=======
=======
>>>>>>> cb6bda89b6 (Merge branch 'feature/postgis-fixes')
=======
        Option(query.getSortBy).filterNot(_.isEmpty) match {
>>>>>>> 425a920af (GEOMESA-3113 Add system property to managing HBase deletes with visibilities (#2792))
<<<<<<< HEAD
>>>>>>> 6eb7e598f3 (GEOMESA-3113 Add system property to managing HBase deletes with visibilities (#2792))
=======
=======
>>>>>>> 595c43086 (GEOMESA-3113 Add system property to managing HBase deletes with visibilities (#2792))
>>>>>>> f9397984e (GEOMESA-3113 Add system property to managing HBase deletes with visibilities (#2792))
<<<<<<< HEAD
>>>>>>> a2c63a57a8 (GEOMESA-3113 Add system property to managing HBase deletes with visibilities (#2792))
=======
=======
>>>>>>> 595c43086 (GEOMESA-3113 Add system property to managing HBase deletes with visibilities (#2792))
=======
>>>>>>> 45dca3e07 (GEOMESA-3113 Add system property to managing HBase deletes with visibilities (#2792))
>>>>>>> 7ea07a654 (GEOMESA-3113 Add system property to managing HBase deletes with visibilities (#2792))
<<<<<<< HEAD
>>>>>>> 0f2a67fb44 (GEOMESA-3113 Add system property to managing HBase deletes with visibilities (#2792))
=======
=======
>>>>>>> 9814eb976 (GEOMESA-3113 Add system property to managing HBase deletes with visibilities (#2792))
<<<<<<< HEAD
>>>>>>> 26fc359a06 (GEOMESA-3113 Add system property to managing HBase deletes with visibilities (#2792))
=======
=======
=======
>>>>>>> f8f49130b (GEOMESA-3113 Add system property to managing HBase deletes with visibilities (#2792))
>>>>>>> 4a47c538b (GEOMESA-3113 Add system property to managing HBase deletes with visibilities (#2792))
<<<<<<< HEAD
>>>>>>> a0d6da1831 (GEOMESA-3113 Add system property to managing HBase deletes with visibilities (#2792))
=======
=======
>>>>>>> db8d998aa (Merge branch 'feature/postgis-fixes')
>>>>>>> cb6bda89b6 (Merge branch 'feature/postgis-fixes')
          case None => SelfClosingIterator(iters.iterator).flatMap(i => i)
          case Some(sort) =>
            val sortSft = QueryPlanner.extractQueryTransforms(sft, query).map(_._1).getOrElse(sft)
            // the delegate stores should sort their results, so we can sort merge them
            new SortedMergeIterator(iters)(SimpleFeatureOrdering(sortSft, sort))
<<<<<<< HEAD
<<<<<<< HEAD
<<<<<<< HEAD
<<<<<<< HEAD
<<<<<<< HEAD
<<<<<<< HEAD
<<<<<<< HEAD
<<<<<<< HEAD
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
>>>>>>> c6103aab4 (GEOMESA-3113 Add system property to managing HBase deletes with visibilities (#2792))
=======
>>>>>>> ad8d1be45 (GEOMESA-3113 Add system property to managing HBase deletes with visibilities (#2792))
=======
>>>>>>> 7ab33423d (GEOMESA-3113 Add system property to managing HBase deletes with visibilities (#2792))
=======
>>>>>>> 84634d919 (GEOMESA-3113 Add system property to managing HBase deletes with visibilities (#2792))
=======
>>>>>>> 4c9fb0f6e (GEOMESA-3113 Add system property to managing HBase deletes with visibilities (#2792))
=======
>>>>>>> e8cc4971c6 (Merge branch 'feature/postgis-fixes')
=======
=======
>>>>>>> 425a920af (GEOMESA-3113 Add system property to managing HBase deletes with visibilities (#2792))
>>>>>>> 6eb7e598f3 (GEOMESA-3113 Add system property to managing HBase deletes with visibilities (#2792))
=======
=======
>>>>>>> 0f2a67fb44 (GEOMESA-3113 Add system property to managing HBase deletes with visibilities (#2792))
=======
>>>>>>> 26fc359a06 (GEOMESA-3113 Add system property to managing HBase deletes with visibilities (#2792))
=======
>>>>>>> a0d6da1831 (GEOMESA-3113 Add system property to managing HBase deletes with visibilities (#2792))
=======
>>>>>>> cb6bda89b6 (Merge branch 'feature/postgis-fixes')
=======
>>>>>>> 425a920af (GEOMESA-3113 Add system property to managing HBase deletes with visibilities (#2792))
=======
>>>>>>> f9397984e (GEOMESA-3113 Add system property to managing HBase deletes with visibilities (#2792))
<<<<<<< HEAD
>>>>>>> a2c63a57a8 (GEOMESA-3113 Add system property to managing HBase deletes with visibilities (#2792))
=======
=======
>>>>>>> 7ea07a654 (GEOMESA-3113 Add system property to managing HBase deletes with visibilities (#2792))
<<<<<<< HEAD
>>>>>>> 0f2a67fb44 (GEOMESA-3113 Add system property to managing HBase deletes with visibilities (#2792))
=======
=======
>>>>>>> 9814eb976 (GEOMESA-3113 Add system property to managing HBase deletes with visibilities (#2792))
<<<<<<< HEAD
>>>>>>> 26fc359a06 (GEOMESA-3113 Add system property to managing HBase deletes with visibilities (#2792))
=======
=======
>>>>>>> 4a47c538b (GEOMESA-3113 Add system property to managing HBase deletes with visibilities (#2792))
<<<<<<< HEAD
>>>>>>> a0d6da1831 (GEOMESA-3113 Add system property to managing HBase deletes with visibilities (#2792))
=======
=======
>>>>>>> db8d998aa (Merge branch 'feature/postgis-fixes')
>>>>>>> cb6bda89b6 (Merge branch 'feature/postgis-fixes')
>>>>>>> 1a21a3c30 (GEOMESA-3113 Add system property to managing HBase deletes with visibilities (#2792))
        }
        QueryResult(resultSft, hints, run)
=======
<<<<<<< HEAD
<<<<<<< HEAD
<<<<<<< HEAD
<<<<<<< HEAD
<<<<<<< HEAD
=======
>>>>>>> a2c63a57a8 (GEOMESA-3113 Add system property to managing HBase deletes with visibilities (#2792))
=======
>>>>>>> 0f2a67fb44 (GEOMESA-3113 Add system property to managing HBase deletes with visibilities (#2792))
=======
>>>>>>> 45dca3e07 (GEOMESA-3113 Add system property to managing HBase deletes with visibilities (#2792))
=======
>>>>>>> 3cb02b7b0 (GEOMESA-3113 Add system property to managing HBase deletes with visibilities (#2792))
<<<<<<< HEAD
<<<<<<< HEAD
<<<<<<< HEAD
<<<<<<< HEAD
=======
>>>>>>> 26fc359a06 (GEOMESA-3113 Add system property to managing HBase deletes with visibilities (#2792))
=======
>>>>>>> a0d6da1831 (GEOMESA-3113 Add system property to managing HBase deletes with visibilities (#2792))
=======
>>>>>>> f8f49130b (GEOMESA-3113 Add system property to managing HBase deletes with visibilities (#2792))
=======
>>>>>>> 3be8d2a5a (Merge branch 'feature/postgis-fixes')
<<<<<<< HEAD
<<<<<<< HEAD
<<<<<<< HEAD
=======
>>>>>>> ad8d1be45 (GEOMESA-3113 Add system property to managing HBase deletes with visibilities (#2792))
=======
=======
>>>>>>> 45dca3e07 (GEOMESA-3113 Add system property to managing HBase deletes with visibilities (#2792))
>>>>>>> 7ab33423d (GEOMESA-3113 Add system property to managing HBase deletes with visibilities (#2792))
=======
>>>>>>> 84634d919 (GEOMESA-3113 Add system property to managing HBase deletes with visibilities (#2792))
=======
=======
>>>>>>> f8f49130b (GEOMESA-3113 Add system property to managing HBase deletes with visibilities (#2792))
>>>>>>> 4c9fb0f6e (GEOMESA-3113 Add system property to managing HBase deletes with visibilities (#2792))
=======
>>>>>>> e8cc4971c6 (Merge branch 'feature/postgis-fixes')
=======
=======
>>>>>>> cb6bda89b6 (Merge branch 'feature/postgis-fixes')
=======
>>>>>>> f9397984e (GEOMESA-3113 Add system property to managing HBase deletes with visibilities (#2792))
<<<<<<< HEAD
>>>>>>> a2c63a57a8 (GEOMESA-3113 Add system property to managing HBase deletes with visibilities (#2792))
=======
=======
=======
>>>>>>> 45dca3e07 (GEOMESA-3113 Add system property to managing HBase deletes with visibilities (#2792))
>>>>>>> 7ea07a654 (GEOMESA-3113 Add system property to managing HBase deletes with visibilities (#2792))
<<<<<<< HEAD
>>>>>>> 0f2a67fb44 (GEOMESA-3113 Add system property to managing HBase deletes with visibilities (#2792))
=======
=======
>>>>>>> 9814eb976 (GEOMESA-3113 Add system property to managing HBase deletes with visibilities (#2792))
<<<<<<< HEAD
>>>>>>> 26fc359a06 (GEOMESA-3113 Add system property to managing HBase deletes with visibilities (#2792))
=======
=======
=======
>>>>>>> f8f49130b (GEOMESA-3113 Add system property to managing HBase deletes with visibilities (#2792))
>>>>>>> 4a47c538b (GEOMESA-3113 Add system property to managing HBase deletes with visibilities (#2792))
<<<<<<< HEAD
>>>>>>> a0d6da1831 (GEOMESA-3113 Add system property to managing HBase deletes with visibilities (#2792))
=======
=======
>>>>>>> db8d998aa (Merge branch 'feature/postgis-fixes')
>>>>>>> cb6bda89b6 (Merge branch 'feature/postgis-fixes')
        }

        maxFeatures match {
          case None => results
          case Some(m) => results.take(m)
<<<<<<< HEAD
<<<<<<< HEAD
<<<<<<< HEAD
<<<<<<< HEAD
<<<<<<< HEAD
=======
>>>>>>> e8cc4971c6 (Merge branch 'feature/postgis-fixes')
=======
>>>>>>> a2c63a57a8 (GEOMESA-3113 Add system property to managing HBase deletes with visibilities (#2792))
=======
=======
>>>>>>> db8d998aa (Merge branch 'feature/postgis-fixes')
>>>>>>> cb6bda89b6 (Merge branch 'feature/postgis-fixes')
=======
>>>>>>> 1a21a3c30 (GEOMESA-3113 Add system property to managing HBase deletes with visibilities (#2792))
=======
>>>>>>> 3be8d2a5a (Merge branch 'feature/postgis-fixes')
<<<<<<< HEAD
<<<<<<< HEAD
<<<<<<< HEAD
=======
=======
>>>>>>> 1a21a3c30 (GEOMESA-3113 Add system property to managing HBase deletes with visibilities (#2792))
>>>>>>> ad8d1be45 (GEOMESA-3113 Add system property to managing HBase deletes with visibilities (#2792))
=======
>>>>>>> e8cc4971c6 (Merge branch 'feature/postgis-fixes')
=======
=======
>>>>>>> cb6bda89b6 (Merge branch 'feature/postgis-fixes')
=======
=======
>>>>>>> 1a21a3c30 (GEOMESA-3113 Add system property to managing HBase deletes with visibilities (#2792))
>>>>>>> f9397984e (GEOMESA-3113 Add system property to managing HBase deletes with visibilities (#2792))
<<<<<<< HEAD
>>>>>>> a2c63a57a8 (GEOMESA-3113 Add system property to managing HBase deletes with visibilities (#2792))
=======
=======
>>>>>>> db8d998aa (Merge branch 'feature/postgis-fixes')
>>>>>>> cb6bda89b6 (Merge branch 'feature/postgis-fixes')
        }
>>>>>>> 595c43086 (GEOMESA-3113 Add system property to managing HBase deletes with visibilities (#2792))
=======
        }
        QueryResult(resultSft, hints, run)
>>>>>>> d845d7c1b (GEOMESA-3254 Add Bloop build support)
=======
          }

          maxFeatures match {
            case None => results
            case Some(m) => results.take(m)
          }
=======
        val iters =
          if (deduplicate) {
            // we re-use the feature id cache across readers
            val cache = scala.collection.mutable.HashSet.empty[String]
            readers.map(r => new DeduplicatingSimpleFeatureIterator(SelfClosingIterator(r), cache))
          } else {
            readers.map(SelfClosingIterator(_))
          }

<<<<<<< HEAD
        Option(query.getSortBy).filterNot(_.isEmpty) match {
=======
<<<<<<< HEAD
        val results = Option(query.getSortBy).filterNot(_.isEmpty) match {
=======
        Option(query.getSortBy).filterNot(_.isEmpty) match {
>>>>>>> 1a21a3c30 (GEOMESA-3113 Add system property to managing HBase deletes with visibilities (#2792))
>>>>>>> 595c43086 (GEOMESA-3113 Add system property to managing HBase deletes with visibilities (#2792))
          case None => SelfClosingIterator(iters.iterator).flatMap(i => i)
          case Some(sort) =>
            val sortSft = QueryPlanner.extractQueryTransforms(sft, query).map(_._1).getOrElse(sft)
            // the delegate stores should sort their results, so we can sort merge them
            new SortedMergeIterator(iters)(SimpleFeatureOrdering(sortSft, sort))
<<<<<<< HEAD
>>>>>>> 1a21a3c30 (GEOMESA-3113 Add system property to managing HBase deletes with visibilities (#2792))
        }
        QueryResult(resultSft, hints, run)
<<<<<<< HEAD
>>>>>>> 58d14a257 (GEOMESA-3254 Add Bloop build support)
=======
=======
<<<<<<< HEAD
        }

        maxFeatures match {
          case None => results
          case Some(m) => results.take(m)
=======
>>>>>>> 1a21a3c30 (GEOMESA-3113 Add system property to managing HBase deletes with visibilities (#2792))
        }
>>>>>>> 595c43086 (GEOMESA-3113 Add system property to managing HBase deletes with visibilities (#2792))
>>>>>>> 0da1bb22c (GEOMESA-3113 Add system property to managing HBase deletes with visibilities (#2792))
      }
    }
  }

  /**
    * We pull out thread-local hints and view params, but don't handle transforms, etc as that
    * may interfere with non-gm delegate stores
    *
    * @param sft simple feature type associated with the query
    * @param original query to configure
    * @return
    */
  override protected [geomesa] def configureQuery(sft: SimpleFeatureType, original: Query): Query = {
    val query = new Query(original)

    // set the thread-local hints once, so that we have them for each data store that is being queried
    QueryPlanner.getPerThreadQueryHints.foreach { hints =>
      hints.foreach { case (k, v) => query.getHints.put(k, v) }
      // clear any configured hints so we don't process them again
      QueryPlanner.clearPerThreadQueryHints()
    }

    // handle view params if present
    ViewParams.setHints(query)

    query
  }

  private def arrowQuery(sft: SimpleFeatureType, query: Query): CloseableIterator[SimpleFeature] = {
    val hints = query.getHints

    // handle any sorting here
    QueryPlanner.setQuerySort(sft, query)

    val arrowSft = QueryPlanner.extractQueryTransforms(sft, query).map(_._1).getOrElse(sft)
    val sort = hints.getArrowSort
    val batchSize = ArrowScan.getBatchSize(hints)
    val encoding = SimpleFeatureEncoding.min(hints.isArrowIncludeFid, hints.isArrowProxyFid)
    val ipcOpts = FormatVersion.options(hints.getArrowFormatVersion.getOrElse(FormatVersion.ArrowFormatVersion.get))

    val dictionaryFields = hints.getArrowDictionaryFields
    // do the reduce here, as we can't merge finalized arrow results

    val process = hints.isArrowProcessDeltas
    val reduce = new ArrowScan.DeltaReducer(arrowSft, dictionaryFields, encoding, ipcOpts, batchSize, sort, sorted = false, process)

    // now that we have standardized dictionaries, we can query the delegate stores
    val readers = stores.map { case (store, filter) =>
<<<<<<< HEAD
      // copy the query so hints aren't shared
      store.getFeatureReader(mergeFilter(sft, new Query(query), filter), Transaction.AUTO_COMMIT)
=======
      val q = new Query(query)
      q.setHints(new Hints(hints))
      store.getFeatureReader(mergeFilter(sft, q, filter), Transaction.AUTO_COMMIT)
>>>>>>> 96cd783e7 (GEOMESA-3202 Check for disjoint date queries in merged view store)
    }

    def getSingle(reader: FeatureReader[SimpleFeatureType, SimpleFeature]): CloseableIterator[SimpleFeature] = {
      val schema = reader.getFeatureType
      if (schema == org.locationtech.geomesa.arrow.ArrowEncodedSft) {
        // arrow processing has been handled by the store already
        CloseableIterator(reader)
      } else {
        // the store just returned normal features, do the arrow processing here
        val copy = SimpleFeatureTypes.immutable(schema, sft.getUserData) // copy default dtg, etc if necessary
        // note: we don't need to pass in the transform or filter, as the transform should have already been
        // applied and the dictionaries calculated up front (if needed)
        LocalQueryRunner.transform(copy, CloseableIterator(reader), None, hints, None)
      }
    }

    reduce(doParallelScan(readers, getSingle))
  }

  private def densityQuery(sft: SimpleFeatureType,
                           readers: Seq[FeatureReader[SimpleFeatureType, SimpleFeature]],
                           hints: Hints): CloseableIterator[SimpleFeature] = {
    def getSingle(reader: FeatureReader[SimpleFeatureType, SimpleFeature]): CloseableIterator[SimpleFeature] = {
      val schema = reader.getFeatureType
      if (schema == DensityScan.DensitySft) {
        // density processing has been handled by the store already
        CloseableIterator(reader)
      } else {
        // the store just returned regular features, do the density processing here
        val copy = SimpleFeatureTypes.immutable(schema, sft.getUserData) // copy default dtg, etc if necessary
        LocalQueryRunner.transform(copy, CloseableIterator(reader), None, hints, None)
      }
    }

    doParallelScan(readers, getSingle)
  }

  private def statsQuery(sft: SimpleFeatureType,
                         readers: Seq[FeatureReader[SimpleFeatureType, SimpleFeature]],
                         hints: Hints): CloseableIterator[SimpleFeature] = {
    def getSingle(reader: FeatureReader[SimpleFeatureType, SimpleFeature]): CloseableIterator[SimpleFeature] = {
      val schema = reader.getFeatureType
      if (schema == StatsScan.StatsSft) {
        // stats processing has been handled by the store already
        CloseableIterator(reader)
      } else {
        // the store just returned regular features, do the stats processing here
        val copy = SimpleFeatureTypes.immutable(schema, sft.getUserData) // copy default dtg, etc if necessary
        LocalQueryRunner.transform(copy, CloseableIterator(reader), None, hints, None)
      }
    }

    val results = doParallelScan(readers, getSingle)

    // do the reduce here, as we can't merge json stats
    StatsScan.StatsReducer(sft, hints)(results)
  }

  private def binQuery(sft: SimpleFeatureType,
                       readers: Seq[FeatureReader[SimpleFeatureType, SimpleFeature]],
                       hints: Hints): CloseableIterator[SimpleFeature] = {
    def getSingle(reader: FeatureReader[SimpleFeatureType, SimpleFeature]): CloseableIterator[SimpleFeature] = {
      val schema = reader.getFeatureType
      if (schema == BinaryOutputEncoder.BinEncodedSft) {
        // bin processing has been handled by the store already
        CloseableIterator(reader)
      } else {
        // the store just returned regular features, do the bin processing here
        val copy = SimpleFeatureTypes.immutable(schema, sft.getUserData) // copy default dtg, etc if necessary
        LocalQueryRunner.transform(copy, CloseableIterator(reader), None, hints, None)
      }
    }

    doParallelScan(readers, getSingle)
  }

  override protected [geomesa] def getReturnSft(sft: SimpleFeatureType, hints: Hints): SimpleFeatureType = {
    if (hints.isBinQuery) {
      BinaryOutputEncoder.BinEncodedSft
    } else if (hints.isArrowQuery) {
      org.locationtech.geomesa.arrow.ArrowEncodedSft
    } else if (hints.isDensityQuery) {
      DensityScan.DensitySft
    } else if (hints.isStatsQuery) {
      StatsScan.StatsSft
    } else {
      super.getReturnSft(sft, hints)
    }
  }

  private def doParallelScan(
      readers: Seq[FeatureReader[SimpleFeatureType, SimpleFeature]],
      single: FeatureReader[SimpleFeatureType, SimpleFeature] => CloseableIterator[SimpleFeature]): CloseableIterator[SimpleFeature] = {
    if (parallel) {
      // not truly parallel but should kick them all off up front
      SelfClosingIterator(readers.toList.map(single).iterator).flatMap(i => i)
    } else {
      SelfClosingIterator(readers.iterator).flatMap(single)
    }
  }
}

object MergedQueryRunner {

  trait Queryable {
    def getFeatureReader(q: Query, t: Transaction): FeatureReader[SimpleFeatureType, SimpleFeature]
  }

  case class DataStoreQueryable(ds: DataStore) extends Queryable {
    override def getFeatureReader(q: Query, t: Transaction): FeatureReader[SimpleFeatureType, SimpleFeature] =
      ds.getFeatureReader(q, t)
  }
}
