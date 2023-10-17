/***********************************************************************
 * Copyright (c) 2013-2023 Commonwealth Computer Research, Inc.
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Apache License, Version 2.0
 * which accompanies this distribution and is available at
 * http://www.opensource.org/licenses/apache2.0.php.
 ***********************************************************************/

package org.locationtech.geomesa.index.view

import com.typesafe.scalalogging.LazyLogging
import org.geotools.data._
import org.geotools.data.simple.{SimpleFeatureCollection, SimpleFeatureSource}
import org.geotools.geometry.jts.ReferencedEnvelope
import org.locationtech.geomesa.index.geotools.GeoMesaFeatureCollection.GeoMesaFeatureVisitingCollection
import org.locationtech.geomesa.index.geotools.GeoMesaFeatureSource.DelegatingResourceInfo
import org.locationtech.geomesa.index.view.MergedFeatureSourceView.MergedQueryCapabilities
import org.locationtech.geomesa.utils.concurrent.CachedThreadPool
import org.opengis.feature.`type`.Name
import org.opengis.feature.simple.{SimpleFeature, SimpleFeatureType}
import org.opengis.filter.Filter
import org.opengis.filter.sort.SortBy

import java.awt.RenderingHints.Key
import java.util.Collections
import java.util.concurrent.CopyOnWriteArrayList

/**
  * Feature source for merged data store view
  *
  * @param ds data store
  * @param sources delegate feature sources
 *  @param parallel scan stores in parallel (vs sequentially)
  * @param sft simple feature type
  */
class MergedFeatureSourceView(
    ds: MergedDataStoreView,
    sources: Seq[(SimpleFeatureSource, Option[Filter])],
    parallel: Boolean,
    sft: SimpleFeatureType
  ) extends SimpleFeatureSource with LazyLogging {

  import scala.collection.JavaConverters._

  lazy private val hints = Collections.unmodifiableSet(Collections.emptySet[Key])

  lazy private val capabilities = new MergedQueryCapabilities(sources.map(_._1.getQueryCapabilities))

  override def getSchema: SimpleFeatureType = sft

  override def getCount(query: Query): Int = {
<<<<<<< HEAD
    val total =
      if (parallel) {
        def getSingle(sourceAndFilter: (SimpleFeatureSource, Option[Filter])): Int = {
          val (source, filter) = sourceAndFilter
          source.getCount(mergeFilter(sft, query, filter))
        }
        val results = new CopyOnWriteArrayList[Int]()
        sources.toList.map(s => CachedThreadPool.submit(() => results.add(getSingle(s)))).foreach(_.get)
        results.asScala.foldLeft(0)((sum, count) => if (sum < 0 || count < 0) { -1 } else { sum + count })
      } else {
        // if one of our sources can't get a count (i.e. is negative), give up and return -1
        sources.foldLeft(0) { case (sum, (source, filter)) =>
          lazy val count = source.getCount(mergeFilter(sft, query, filter))
          if (sum < 0 || count < 0) { -1 } else { sum + count }
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
=======
>>>>>>> 051bc58bcf (GEOMESA-3202 Check for disjoint date queries in merged view store)
=======
>>>>>>> b71311c31d (GEOMESA-3202 Check for disjoint date queries in merged view store)
=======
>>>>>>> 7933021402 (GEOMESA-3202 Check for disjoint date queries in merged view store)
=======
>>>>>>> e22e621f59 (GEOMESA-3202 Check for disjoint date queries in merged view store)
=======
>>>>>>> bdd2bd6424 (GEOMESA-3202 Check for disjoint date queries in merged view store)
=======
    // if one of our sources can't get a count (i.e. is negative), give up and return -1
    val total = sources.foldLeft(0) { case (sum, (source, filter)) =>
      lazy val count = source.getCount(mergeFilter(sft, query, filter))
      if (sum < 0 || count < 0) { -1 } else { sum + count }
    }
<<<<<<< HEAD
<<<<<<< HEAD
<<<<<<< HEAD
<<<<<<< HEAD
<<<<<<< HEAD
<<<<<<< HEAD
>>>>>>> 96cd783e70 (GEOMESA-3202 Check for disjoint date queries in merged view store)
=======
>>>>>>> 96cd783e7 (GEOMESA-3202 Check for disjoint date queries in merged view store)
>>>>>>> eea6a40faa (GEOMESA-3202 Check for disjoint date queries in merged view store)
=======
>>>>>>> 3be8d2a5a4 (Merge branch 'feature/postgis-fixes')
=======
>>>>>>> 96cd783e7 (GEOMESA-3202 Check for disjoint date queries in merged view store)
>>>>>>> 051bc58bcf (GEOMESA-3202 Check for disjoint date queries in merged view store)
=======
>>>>>>> db8d998aa2 (Merge branch 'feature/postgis-fixes')
=======
>>>>>>> 96cd783e7 (GEOMESA-3202 Check for disjoint date queries in merged view store)
>>>>>>> b71311c31d (GEOMESA-3202 Check for disjoint date queries in merged view store)
=======
>>>>>>> 1b25d7ddb4 (Merge branch 'feature/postgis-fixes')
=======
>>>>>>> 96cd783e7 (GEOMESA-3202 Check for disjoint date queries in merged view store)
>>>>>>> 7933021402 (GEOMESA-3202 Check for disjoint date queries in merged view store)
=======
>>>>>>> e944f1c88b (Merge branch 'feature/postgis-fixes')
=======
>>>>>>> 96cd783e7 (GEOMESA-3202 Check for disjoint date queries in merged view store)
>>>>>>> e22e621f59 (GEOMESA-3202 Check for disjoint date queries in merged view store)
=======
>>>>>>> 26e5afc4ea (Merge branch 'feature/postgis-fixes')
=======
>>>>>>> 96cd783e7 (GEOMESA-3202 Check for disjoint date queries in merged view store)
>>>>>>> bdd2bd6424 (GEOMESA-3202 Check for disjoint date queries in merged view store)
    if (query.isMaxFeaturesUnlimited) {
      total
    } else {
      math.min(total, query.getMaxFeatures)
    }
  }

  override def getBounds: ReferencedEnvelope = {
    def getSingle(sourceAndFilter: (SimpleFeatureSource, Option[Filter])): Option[ReferencedEnvelope] = {
      sourceAndFilter match {
        case (source, None)    => Option(source.getBounds)
        case (source, Some(f)) => Option(source.getBounds(new Query(sft.getTypeName, f)))
      }
    }

    val sourceBounds = if (parallel) {
      val results = new CopyOnWriteArrayList[ReferencedEnvelope]()
      sources.toList.map(s => CachedThreadPool.submit(() => getSingle(s).foreach(results.add))).foreach(_.get)
      results.asScala
    } else {
      sources.flatMap(getSingle)
    }

    val bounds = new ReferencedEnvelope(org.locationtech.geomesa.utils.geotools.CRS_EPSG_4326)
    sourceBounds.foreach(bounds.expandToInclude)
    bounds
  }

  override def getBounds(query: Query): ReferencedEnvelope = {
    def getSingle(sourceAndFilter: (SimpleFeatureSource, Option[Filter])): Option[ReferencedEnvelope] =
      Option(sourceAndFilter._1.getBounds(mergeFilter(sft, query, sourceAndFilter._2)))

    val sourceBounds = if (parallel) {
      val results = new CopyOnWriteArrayList[ReferencedEnvelope]()
      sources.toList.map(s => CachedThreadPool.submit(() => getSingle(s).foreach(results.add))).foreach(_.get)
      results.asScala
    } else {
      sources.flatMap(getSingle)
    }

    val bounds = new ReferencedEnvelope(org.locationtech.geomesa.utils.geotools.CRS_EPSG_4326)
<<<<<<< HEAD
    sourceBounds.foreach(bounds.expandToInclude)
<<<<<<< HEAD
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
>>>>>>> db8d998aa2 (Merge branch 'feature/postgis-fixes')
=======
>>>>>>> 1b25d7ddb4 (Merge branch 'feature/postgis-fixes')
=======
>>>>>>> 4c216bcec1 (GEOMESA-3153 Fix merged view to only expand bounds on non-null bounds (#2814))
=======
=======
>>>>>>> 63a045a753 (GEOMESA-3254 Add Bloop build support)
=======
>>>>>>> b78e3b07c2 (GEOMESA-3153 Fix merged view to only expand bounds on non-null bounds (#2814))
=======
>>>>>>> db8d998aa (Merge branch 'feature/postgis-fixes')
>>>>>>> 26e5afc4ea (Merge branch 'feature/postgis-fixes')
=======
    sources.foreach {
      case (source, filter) =>
<<<<<<< HEAD
<<<<<<< HEAD
<<<<<<< HEAD
<<<<<<< HEAD
<<<<<<< HEAD
<<<<<<< HEAD
<<<<<<< HEAD
<<<<<<< HEAD
<<<<<<< HEAD
<<<<<<< HEAD
<<<<<<< HEAD
<<<<<<< HEAD
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
>>>>>>> 17b5ca6708 (GEOMESA-3153 Fix merged view to only expand bounds on non-null bounds (#2814))
=======
>>>>>>> b3286af625 (GEOMESA-3153 Fix merged view to only expand bounds on non-null bounds (#2814))
=======
>>>>>>> b114c31d7b (GEOMESA-3153 Fix merged view to only expand bounds on non-null bounds (#2814))
=======
>>>>>>> d4f1ac3977 (GEOMESA-3202 Check for disjoint date queries in merged view store)
=======
=======
>>>>>>> 0a65fe97ef (GEOMESA-3153 Fix merged view to only expand bounds on non-null bounds (#2814))
=======
>>>>>>> bc92b610a0 (GEOMESA-3153 Fix merged view to only expand bounds on non-null bounds (#2814))
=======
>>>>>>> 7933021402 (GEOMESA-3202 Check for disjoint date queries in merged view store)
=======
>>>>>>> cf889fdf30 (GEOMESA-3153 Fix merged view to only expand bounds on non-null bounds (#2814))
=======
>>>>>>> 7221b07f1c (GEOMESA-3202 Check for disjoint date queries in merged view store)
=======
>>>>>>> aa95961d51 (GEOMESA-3153 Fix merged view to only expand bounds on non-null bounds (#2814))
=======
=======
>>>>>>> 9e2a070ec3 (GEOMESA-3153 Fix merged view to only expand bounds on non-null bounds (#2814))
=======
>>>>>>> 0a65fe97e (GEOMESA-3153 Fix merged view to only expand bounds on non-null bounds (#2814))
>>>>>>> d017c8b7bf (GEOMESA-3153 Fix merged view to only expand bounds on non-null bounds (#2814))
=======
>>>>>>> 17b5ca670 (GEOMESA-3153 Fix merged view to only expand bounds on non-null bounds (#2814))
<<<<<<< HEAD
>>>>>>> dbcb800c14 (GEOMESA-3153 Fix merged view to only expand bounds on non-null bounds (#2814))
=======
>>>>>>> b6e4df392e (GEOMESA-3153 Fix merged view to only expand bounds on non-null bounds (#2814))
=======
>>>>>>> d2549e87c7 (GEOMESA-3153 Fix merged view to only expand bounds on non-null bounds (#2814))
=======
>>>>>>> 19eba2a6c8 (GEOMESA-3202 Check for disjoint date queries in merged view store)
=======
=======
>>>>>>> 17b5ca670 (GEOMESA-3153 Fix merged view to only expand bounds on non-null bounds (#2814))
>>>>>>> e6cd678a41 (GEOMESA-3153 Fix merged view to only expand bounds on non-null bounds (#2814))
=======
=======
>>>>>>> b3286af62 (GEOMESA-3153 Fix merged view to only expand bounds on non-null bounds (#2814))
<<<<<<< HEAD
>>>>>>> b5f42c9078 (GEOMESA-3153 Fix merged view to only expand bounds on non-null bounds (#2814))
=======
=======
>>>>>>> b114c31d7 (GEOMESA-3153 Fix merged view to only expand bounds on non-null bounds (#2814))
<<<<<<< HEAD
>>>>>>> cf889fdf30 (GEOMESA-3153 Fix merged view to only expand bounds on non-null bounds (#2814))
=======
=======
>>>>>>> d4f1ac397 (GEOMESA-3202 Check for disjoint date queries in merged view store)
<<<<<<< HEAD
>>>>>>> 7221b07f1c (GEOMESA-3202 Check for disjoint date queries in merged view store)
=======
=======
=======
>>>>>>> 17b5ca670 (GEOMESA-3153 Fix merged view to only expand bounds on non-null bounds (#2814))
>>>>>>> dbcb800c1 (GEOMESA-3153 Fix merged view to only expand bounds on non-null bounds (#2814))
<<<<<<< HEAD
>>>>>>> aa95961d51 (GEOMESA-3153 Fix merged view to only expand bounds on non-null bounds (#2814))
=======
=======
>>>>>>> b6e4df392 (GEOMESA-3153 Fix merged view to only expand bounds on non-null bounds (#2814))
>>>>>>> 9e2a070ec3 (GEOMESA-3153 Fix merged view to only expand bounds on non-null bounds (#2814))
        val source_bounds = source.getBounds(mergeFilter(sft, query, filter))
=======
        val source_bounds = source.getBounds(mergeFilter(query, filter))
>>>>>>> 22da407b4 (GEOMESA-3153 Fix merged view to only expand bounds on non-null bounds (#2814))
<<<<<<< HEAD
<<<<<<< HEAD
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
        val source_bounds = source.getBounds(mergeFilter(query, filter))
>>>>>>> 0ab344f339 (GEOMESA-3153 Fix merged view to only expand bounds on non-null bounds (#2814))
=======
        val source_bounds = source.getBounds(mergeFilter(sft, query, filter))
>>>>>>> eea6a40faa (GEOMESA-3202 Check for disjoint date queries in merged view store)
=======
>>>>>>> 17b5ca6708 (GEOMESA-3153 Fix merged view to only expand bounds on non-null bounds (#2814))
=======
        val source_bounds = source.getBounds(mergeFilter(query, filter))
>>>>>>> 74d905136b (GEOMESA-3153 Fix merged view to only expand bounds on non-null bounds (#2814))
=======
=======
    sources.foreach {
      case (source, filter) =>
<<<<<<< HEAD
        val source_bounds = source.getBounds(mergeFilter(query, filter))
>>>>>>> 6a4564f895 (GEOMESA-3153 Fix merged view to only expand bounds on non-null bounds (#2814))
=======
        val source_bounds = source.getBounds(mergeFilter(sft, query, filter))
>>>>>>> 051bc58bcf (GEOMESA-3202 Check for disjoint date queries in merged view store)
=======
>>>>>>> b3286af625 (GEOMESA-3153 Fix merged view to only expand bounds on non-null bounds (#2814))
=======
=======
>>>>>>> dbcb800c14 (GEOMESA-3153 Fix merged view to only expand bounds on non-null bounds (#2814))
=======
>>>>>>> e6cd678a41 (GEOMESA-3153 Fix merged view to only expand bounds on non-null bounds (#2814))
=======
>>>>>>> b5f42c9078 (GEOMESA-3153 Fix merged view to only expand bounds on non-null bounds (#2814))
=======
>>>>>>> cf889fdf30 (GEOMESA-3153 Fix merged view to only expand bounds on non-null bounds (#2814))
=======
=======
>>>>>>> 9e2a070ec3 (GEOMESA-3153 Fix merged view to only expand bounds on non-null bounds (#2814))
=======
>>>>>>> dbcb800c1 (GEOMESA-3153 Fix merged view to only expand bounds on non-null bounds (#2814))
>>>>>>> aa95961d51 (GEOMESA-3153 Fix merged view to only expand bounds on non-null bounds (#2814))
=======
        val source_bounds = source.getBounds(mergeFilter(query, filter))
>>>>>>> 0ab344f33 (GEOMESA-3153 Fix merged view to only expand bounds on non-null bounds (#2814))
<<<<<<< HEAD
<<<<<<< HEAD
>>>>>>> b114c31d7b (GEOMESA-3153 Fix merged view to only expand bounds on non-null bounds (#2814))
=======
=======
        val source_bounds = source.getBounds(mergeFilter(sft, query, filter))
>>>>>>> eea6a40fa (GEOMESA-3202 Check for disjoint date queries in merged view store)
<<<<<<< HEAD
<<<<<<< HEAD
<<<<<<< HEAD
<<<<<<< HEAD
>>>>>>> d4f1ac3977 (GEOMESA-3202 Check for disjoint date queries in merged view store)
=======
=======
>>>>>>> 7221b07f1c (GEOMESA-3202 Check for disjoint date queries in merged view store)
=======
>>>>>>> aa95961d51 (GEOMESA-3153 Fix merged view to only expand bounds on non-null bounds (#2814))
=======
>>>>>>> 17b5ca670 (GEOMESA-3153 Fix merged view to only expand bounds on non-null bounds (#2814))
<<<<<<< HEAD
<<<<<<< HEAD
>>>>>>> dbcb800c14 (GEOMESA-3153 Fix merged view to only expand bounds on non-null bounds (#2814))
=======
=======
        val source_bounds = source.getBounds(mergeFilter(query, filter))
>>>>>>> 74d905136 (GEOMESA-3153 Fix merged view to only expand bounds on non-null bounds (#2814))
<<<<<<< HEAD
<<<<<<< HEAD
>>>>>>> 0a65fe97ef (GEOMESA-3153 Fix merged view to only expand bounds on non-null bounds (#2814))
=======
=======
    sources.foreach {
      case (source, filter) =>
<<<<<<< HEAD
        val source_bounds = source.getBounds(mergeFilter(query, filter))
>>>>>>> b6daad9ec3 (GEOMESA-3153 Fix merged view to only expand bounds on non-null bounds (#2814))
=======
        val source_bounds = source.getBounds(mergeFilter(sft, query, filter))
>>>>>>> b71311c31d (GEOMESA-3202 Check for disjoint date queries in merged view store)
=======
>>>>>>> b6e4df392e (GEOMESA-3153 Fix merged view to only expand bounds on non-null bounds (#2814))
=======
=======
        val source_bounds = source.getBounds(mergeFilter(query, filter))
>>>>>>> 0ab344f33 (GEOMESA-3153 Fix merged view to only expand bounds on non-null bounds (#2814))
>>>>>>> d2549e87c7 (GEOMESA-3153 Fix merged view to only expand bounds on non-null bounds (#2814))
=======
=======
        val source_bounds = source.getBounds(mergeFilter(sft, query, filter))
>>>>>>> eea6a40fa (GEOMESA-3202 Check for disjoint date queries in merged view store)
>>>>>>> 19eba2a6c8 (GEOMESA-3202 Check for disjoint date queries in merged view store)
=======
=======
>>>>>>> 17b5ca670 (GEOMESA-3153 Fix merged view to only expand bounds on non-null bounds (#2814))
>>>>>>> e6cd678a41 (GEOMESA-3153 Fix merged view to only expand bounds on non-null bounds (#2814))
=======
=======
        val source_bounds = source.getBounds(mergeFilter(query, filter))
>>>>>>> 74d905136 (GEOMESA-3153 Fix merged view to only expand bounds on non-null bounds (#2814))
>>>>>>> bc92b610a0 (GEOMESA-3153 Fix merged view to only expand bounds on non-null bounds (#2814))
=======
=======
>>>>>>> d017c8b7bf (GEOMESA-3153 Fix merged view to only expand bounds on non-null bounds (#2814))
=======
<<<<<<< HEAD
        val source_bounds = source.getBounds(mergeFilter(sft, query, filter))
>>>>>>> 2fc500c49 (GEOMESA-3202 Check for disjoint date queries in merged view store)
<<<<<<< HEAD
>>>>>>> 7933021402 (GEOMESA-3202 Check for disjoint date queries in merged view store)
=======
=======
=======
    sources.foreach {
      case (source, filter) =>
<<<<<<< HEAD
        val source_bounds = source.getBounds(mergeFilter(query, filter))
>>>>>>> 6a4564f89 (GEOMESA-3153 Fix merged view to only expand bounds on non-null bounds (#2814))
<<<<<<< HEAD
>>>>>>> 234114a499 (GEOMESA-3153 Fix merged view to only expand bounds on non-null bounds (#2814))
<<<<<<< HEAD
>>>>>>> 4c216bcec1 (GEOMESA-3153 Fix merged view to only expand bounds on non-null bounds (#2814))
=======
=======
=======
        val source_bounds = source.getBounds(mergeFilter(sft, query, filter))
>>>>>>> 051bc58bc (GEOMESA-3202 Check for disjoint date queries in merged view store)
<<<<<<< HEAD
>>>>>>> 63a7a37cdc (GEOMESA-3202 Check for disjoint date queries in merged view store)
<<<<<<< HEAD
>>>>>>> e22e621f59 (GEOMESA-3202 Check for disjoint date queries in merged view store)
=======
=======
=======
>>>>>>> b3286af62 (GEOMESA-3153 Fix merged view to only expand bounds on non-null bounds (#2814))
<<<<<<< HEAD
>>>>>>> ac3a703269 (GEOMESA-3153 Fix merged view to only expand bounds on non-null bounds (#2814))
<<<<<<< HEAD
>>>>>>> b5f42c9078 (GEOMESA-3153 Fix merged view to only expand bounds on non-null bounds (#2814))
=======
=======
=======
=======
        val source_bounds = source.getBounds(mergeFilter(query, filter))
>>>>>>> 0ab344f33 (GEOMESA-3153 Fix merged view to only expand bounds on non-null bounds (#2814))
>>>>>>> b114c31d7 (GEOMESA-3153 Fix merged view to only expand bounds on non-null bounds (#2814))
<<<<<<< HEAD
>>>>>>> 369ec0ce2b (GEOMESA-3153 Fix merged view to only expand bounds on non-null bounds (#2814))
<<<<<<< HEAD
>>>>>>> cf889fdf30 (GEOMESA-3153 Fix merged view to only expand bounds on non-null bounds (#2814))
=======
=======
=======
>>>>>>> d4f1ac397 (GEOMESA-3202 Check for disjoint date queries in merged view store)
<<<<<<< HEAD
>>>>>>> be2554eb71 (GEOMESA-3202 Check for disjoint date queries in merged view store)
<<<<<<< HEAD
>>>>>>> 7221b07f1c (GEOMESA-3202 Check for disjoint date queries in merged view store)
=======
=======
=======
=======
>>>>>>> 17b5ca670 (GEOMESA-3153 Fix merged view to only expand bounds on non-null bounds (#2814))
>>>>>>> dbcb800c1 (GEOMESA-3153 Fix merged view to only expand bounds on non-null bounds (#2814))
<<<<<<< HEAD
>>>>>>> 350ba6beb5 (GEOMESA-3153 Fix merged view to only expand bounds on non-null bounds (#2814))
<<<<<<< HEAD
>>>>>>> aa95961d51 (GEOMESA-3153 Fix merged view to only expand bounds on non-null bounds (#2814))
=======
=======
=======
>>>>>>> 0a65fe97e (GEOMESA-3153 Fix merged view to only expand bounds on non-null bounds (#2814))
<<<<<<< HEAD
>>>>>>> 1ba46ef3b6 (GEOMESA-3153 Fix merged view to only expand bounds on non-null bounds (#2814))
<<<<<<< HEAD
>>>>>>> d017c8b7bf (GEOMESA-3153 Fix merged view to only expand bounds on non-null bounds (#2814))
=======
=======
=======
=======
    sources.foreach {
      case (source, filter) =>
<<<<<<< HEAD
        val source_bounds = source.getBounds(mergeFilter(query, filter))
>>>>>>> b6daad9ec (GEOMESA-3153 Fix merged view to only expand bounds on non-null bounds (#2814))
<<<<<<< HEAD
>>>>>>> a7b9fb6032 (GEOMESA-3153 Fix merged view to only expand bounds on non-null bounds (#2814))
<<<<<<< HEAD
>>>>>>> b78e3b07c2 (GEOMESA-3153 Fix merged view to only expand bounds on non-null bounds (#2814))
=======
=======
=======
        val source_bounds = source.getBounds(mergeFilter(sft, query, filter))
>>>>>>> b71311c31 (GEOMESA-3202 Check for disjoint date queries in merged view store)
<<<<<<< HEAD
>>>>>>> ff221938ac (GEOMESA-3202 Check for disjoint date queries in merged view store)
<<<<<<< HEAD
>>>>>>> bdd2bd6424 (GEOMESA-3202 Check for disjoint date queries in merged view store)
=======
=======
=======
>>>>>>> b6e4df392 (GEOMESA-3153 Fix merged view to only expand bounds on non-null bounds (#2814))
>>>>>>> 824cbb85a8 (GEOMESA-3153 Fix merged view to only expand bounds on non-null bounds (#2814))
>>>>>>> 9e2a070ec3 (GEOMESA-3153 Fix merged view to only expand bounds on non-null bounds (#2814))
        if(source_bounds != null){
          bounds.expandToInclude(source_bounds)
        }
    }
<<<<<<< HEAD
<<<<<<< HEAD
<<<<<<< HEAD
<<<<<<< HEAD
>>>>>>> 22da407b47 (GEOMESA-3153 Fix merged view to only expand bounds on non-null bounds (#2814))
=======
>>>>>>> 22da407b4 (GEOMESA-3153 Fix merged view to only expand bounds on non-null bounds (#2814))
<<<<<<< HEAD
<<<<<<< HEAD
<<<<<<< HEAD
<<<<<<< HEAD
<<<<<<< HEAD
>>>>>>> 0ab344f339 (GEOMESA-3153 Fix merged view to only expand bounds on non-null bounds (#2814))
=======
>>>>>>> 22da407b4 (GEOMESA-3153 Fix merged view to only expand bounds on non-null bounds (#2814))
>>>>>>> 74d905136b (GEOMESA-3153 Fix merged view to only expand bounds on non-null bounds (#2814))
=======
>>>>>>> 3be8d2a5a4 (Merge branch 'feature/postgis-fixes')
=======
>>>>>>> 22da407b4 (GEOMESA-3153 Fix merged view to only expand bounds on non-null bounds (#2814))
>>>>>>> 6a4564f895 (GEOMESA-3153 Fix merged view to only expand bounds on non-null bounds (#2814))
=======
=======
>>>>>>> 3be8d2a5a (Merge branch 'feature/postgis-fixes')
>>>>>>> db8d998aa2 (Merge branch 'feature/postgis-fixes')
=======
>>>>>>> d845d7c1bd (GEOMESA-3254 Add Bloop build support)
=======
>>>>>>> 22da407b4 (GEOMESA-3153 Fix merged view to only expand bounds on non-null bounds (#2814))
>>>>>>> b6daad9ec3 (GEOMESA-3153 Fix merged view to only expand bounds on non-null bounds (#2814))
=======
=======
>>>>>>> 3be8d2a5a (Merge branch 'feature/postgis-fixes')
>>>>>>> 1b25d7ddb4 (Merge branch 'feature/postgis-fixes')
=======
=======
>>>>>>> 26e5afc4ea (Merge branch 'feature/postgis-fixes')
=======
>>>>>>> b78e3b07c2 (GEOMESA-3153 Fix merged view to only expand bounds on non-null bounds (#2814))
=======
>>>>>>> 3be8d2a5a (Merge branch 'feature/postgis-fixes')
=======
>>>>>>> 6a4564f89 (GEOMESA-3153 Fix merged view to only expand bounds on non-null bounds (#2814))
<<<<<<< HEAD
>>>>>>> 4c216bcec1 (GEOMESA-3153 Fix merged view to only expand bounds on non-null bounds (#2814))
=======
=======
=======
>>>>>>> 3be8d2a5a (Merge branch 'feature/postgis-fixes')
>>>>>>> db8d998aa (Merge branch 'feature/postgis-fixes')
<<<<<<< HEAD
>>>>>>> 26e5afc4ea (Merge branch 'feature/postgis-fixes')
=======
=======
>>>>>>> d845d7c1b (GEOMESA-3254 Add Bloop build support)
<<<<<<< HEAD
>>>>>>> 63a045a753 (GEOMESA-3254 Add Bloop build support)
=======
=======
>>>>>>> b6daad9ec (GEOMESA-3153 Fix merged view to only expand bounds on non-null bounds (#2814))
>>>>>>> b78e3b07c2 (GEOMESA-3153 Fix merged view to only expand bounds on non-null bounds (#2814))
    bounds
  }

  override def getQueryCapabilities: QueryCapabilities = capabilities

  override def getFeatures: SimpleFeatureCollection = getFeatures(Filter.INCLUDE)

  override def getFeatures(filter: Filter): SimpleFeatureCollection = getFeatures(new Query(sft.getTypeName, filter))

  override def getFeatures(query: Query): SimpleFeatureCollection = new MergedFeatureCollection(query)

  override def getName: Name = getSchema.getName

  override def getDataStore: DataStore = ds

  override def getSupportedHints: java.util.Set[Key] = hints

  override def getInfo: ResourceInfo = new DelegatingResourceInfo(this)

  override def addFeatureListener(listener: FeatureListener): Unit = throw new NotImplementedError()

  override def removeFeatureListener(listener: FeatureListener): Unit = throw new NotImplementedError()

  /**
    * Feature collection implementation
    *
    * @param query query
    */
  class MergedFeatureCollection(query: Query)
      extends GeoMesaFeatureVisitingCollection(MergedFeatureSourceView.this, ds.stats, query) {

    private lazy val featureReader = ds.getFeatureReader(sft, Transaction.AUTO_COMMIT, query)

    override def getSchema: SimpleFeatureType = featureReader.schema

    override def reader(): FeatureReader[SimpleFeatureType, SimpleFeature] = featureReader.reader()

    override def getBounds: ReferencedEnvelope = MergedFeatureSourceView.this.getBounds(query)

    override def getCount: Int = MergedFeatureSourceView.this.getCount(query)

    override def size: Int = {
      // note: we shouldn't return -1 here, but we don't return the actual value unless EXACT_COUNT is set
      val count = getCount
      if (count < 0) { 0 } else { count }
    }
  }
}

object MergedFeatureSourceView {

  /**
    * Query capabilities
    *
    * @param capabilities delegates
    */
  class MergedQueryCapabilities(capabilities: Seq[QueryCapabilities]) extends QueryCapabilities {
    override def isOffsetSupported: Boolean = capabilities.forall(_.isOffsetSupported)
    override def supportsSorting(sortAttributes: SortBy*): Boolean =
      capabilities.forall(_.supportsSorting(sortAttributes: _*))
    override def isReliableFIDSupported: Boolean = capabilities.forall(_.isReliableFIDSupported)
    override def isUseProvidedFIDSupported: Boolean = capabilities.forall(_.isUseProvidedFIDSupported)
    override def isJoiningSupported: Boolean = capabilities.forall(_.isJoiningSupported)
    override def isVersionSupported: Boolean = capabilities.forall(_.isVersionSupported)
  }
}
