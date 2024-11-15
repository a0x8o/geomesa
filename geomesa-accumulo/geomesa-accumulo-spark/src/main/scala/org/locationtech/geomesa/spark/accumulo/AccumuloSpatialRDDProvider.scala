/***********************************************************************
 * Copyright (c) 2013-2022 Commonwealth Computer Research, Inc.
 * Portions Crown Copyright (c) 2016-2022 Dstl
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Apache License, Version 2.0
 * which accompanies this distribution and is available at
 * http://www.opensource.org/licenses/apache2.0.php.
 ***********************************************************************/

package org.locationtech.geomesa.spark.accumulo

import com.typesafe.scalalogging.LazyLogging
import org.apache.hadoop.conf.Configuration
import org.apache.hadoop.io.Text
import org.apache.hadoop.mapred.JobConf
import org.apache.spark.SparkContext
import org.apache.spark.rdd.RDD
import org.geotools.data.{DataStoreFinder, Query, Transaction}
import org.locationtech.geomesa.accumulo.data.AccumuloQueryPlan.{BatchScanPlan, EmptyPlan}
import org.locationtech.geomesa.accumulo.data.{AccumuloDataStore, AccumuloDataStoreFactory, AccumuloQueryPlan}
import org.locationtech.geomesa.index.conf.QueryHints._
import org.locationtech.geomesa.jobs.accumulo.AccumuloJobUtils
import org.locationtech.geomesa.jobs.mapreduce._
import org.locationtech.geomesa.spark.{SpatialRDD, SpatialRDDProvider}
import org.locationtech.geomesa.utils.geotools.FeatureUtils
import org.locationtech.geomesa.utils.io.{WithClose, WithStore}
import org.opengis.feature.simple.{SimpleFeature, SimpleFeatureType}

class AccumuloSpatialRDDProvider extends SpatialRDDProvider with LazyLogging {

  import scala.collection.JavaConverters._

  override def canProcess(params: java.util.Map[String, _ <: java.io.Serializable]): Boolean =
    AccumuloDataStoreFactory.canProcess(params)

  override def rdd(conf: Configuration,
                   sc: SparkContext,
                   params: Map[String, String],
                   query: Query): SpatialRDD = {
    val paramsAsJava = params.asJava
    val ds = DataStoreFinder.getDataStore(paramsAsJava).asInstanceOf[AccumuloDataStore]

    lazy val transform = query.getHints.getTransformSchema

    def queryPlanToRDD(sft: SimpleFeatureType, qp: AccumuloQueryPlan): RDD[SimpleFeature] = {
      if (ds == null || sft == null || qp.isInstanceOf[EmptyPlan]) {
        sc.emptyRDD[SimpleFeature]
      } else {
<<<<<<< HEAD
<<<<<<< HEAD
<<<<<<< HEAD
<<<<<<< HEAD
<<<<<<< HEAD
<<<<<<< HEAD
<<<<<<< HEAD
<<<<<<< HEAD
<<<<<<< HEAD
<<<<<<< HEAD
<<<<<<< HEAD
<<<<<<< HEAD
<<<<<<< HEAD
<<<<<<< HEAD
<<<<<<< HEAD
<<<<<<< HEAD
<<<<<<< HEAD
<<<<<<< HEAD
<<<<<<< HEAD
<<<<<<< HEAD
<<<<<<< HEAD
<<<<<<< HEAD
<<<<<<< HEAD
<<<<<<< HEAD
<<<<<<< HEAD
<<<<<<< HEAD
<<<<<<< HEAD
<<<<<<< HEAD
<<<<<<< HEAD
<<<<<<< HEAD
<<<<<<< HEAD
<<<<<<< HEAD
<<<<<<< HEAD
<<<<<<< HEAD
<<<<<<< HEAD
<<<<<<< HEAD
<<<<<<< HEAD
<<<<<<< HEAD
<<<<<<< HEAD
<<<<<<< HEAD
<<<<<<< HEAD
<<<<<<< HEAD
<<<<<<< HEAD
<<<<<<< HEAD
<<<<<<< HEAD
<<<<<<< HEAD
<<<<<<< HEAD
<<<<<<< HEAD
<<<<<<< HEAD
<<<<<<< HEAD
<<<<<<< HEAD
<<<<<<< HEAD
<<<<<<< HEAD
<<<<<<< HEAD
<<<<<<< HEAD
<<<<<<< HEAD
<<<<<<< HEAD
<<<<<<< HEAD
<<<<<<< HEAD
<<<<<<< HEAD
<<<<<<< HEAD
<<<<<<< HEAD
<<<<<<< HEAD
<<<<<<< HEAD
<<<<<<< HEAD
<<<<<<< HEAD
<<<<<<< HEAD
<<<<<<< HEAD
<<<<<<< HEAD
<<<<<<< HEAD
<<<<<<< HEAD
<<<<<<< HEAD
<<<<<<< HEAD
<<<<<<< HEAD
<<<<<<< HEAD
<<<<<<< HEAD
<<<<<<< HEAD
<<<<<<< HEAD
<<<<<<< HEAD
<<<<<<< HEAD
<<<<<<< HEAD
<<<<<<< HEAD
<<<<<<< HEAD
<<<<<<< HEAD
<<<<<<< HEAD
<<<<<<< HEAD
<<<<<<< HEAD
<<<<<<< HEAD
<<<<<<< HEAD
<<<<<<< HEAD
<<<<<<< HEAD
<<<<<<< HEAD
<<<<<<< HEAD
<<<<<<< HEAD
<<<<<<< HEAD
<<<<<<< HEAD
<<<<<<< HEAD
<<<<<<< HEAD
<<<<<<< HEAD
<<<<<<< HEAD
<<<<<<< HEAD
<<<<<<< HEAD
<<<<<<< HEAD
<<<<<<< HEAD
<<<<<<< HEAD
<<<<<<< HEAD
<<<<<<< HEAD
<<<<<<< HEAD
<<<<<<< HEAD
<<<<<<< HEAD
<<<<<<< HEAD
<<<<<<< HEAD
<<<<<<< HEAD
<<<<<<< HEAD
<<<<<<< HEAD
<<<<<<< HEAD
<<<<<<< HEAD
<<<<<<< HEAD
<<<<<<< HEAD
<<<<<<< HEAD
<<<<<<< HEAD
<<<<<<< HEAD
<<<<<<< HEAD
<<<<<<< HEAD
<<<<<<< HEAD
<<<<<<< HEAD
<<<<<<< HEAD
<<<<<<< HEAD
<<<<<<< HEAD
<<<<<<< HEAD
<<<<<<< HEAD
<<<<<<< HEAD
<<<<<<< HEAD
<<<<<<< HEAD
<<<<<<< HEAD
<<<<<<< HEAD
<<<<<<< HEAD
<<<<<<< HEAD
<<<<<<< HEAD
<<<<<<< HEAD
<<<<<<< HEAD
<<<<<<< HEAD
<<<<<<< HEAD
<<<<<<< HEAD
<<<<<<< HEAD
<<<<<<< HEAD
<<<<<<< HEAD
<<<<<<< HEAD
<<<<<<< HEAD
<<<<<<< HEAD
<<<<<<< HEAD
<<<<<<< HEAD
<<<<<<< HEAD
<<<<<<< HEAD
<<<<<<< HEAD
<<<<<<< HEAD
<<<<<<< HEAD
<<<<<<< HEAD
<<<<<<< HEAD
<<<<<<< HEAD
<<<<<<< HEAD
<<<<<<< HEAD
<<<<<<< HEAD
<<<<<<< HEAD
<<<<<<< HEAD
<<<<<<< HEAD
<<<<<<< HEAD
<<<<<<< HEAD
<<<<<<< HEAD
<<<<<<< HEAD
<<<<<<< HEAD
<<<<<<< HEAD
<<<<<<< HEAD
<<<<<<< HEAD
<<<<<<< HEAD
<<<<<<< HEAD
<<<<<<< HEAD
<<<<<<< HEAD
<<<<<<< HEAD
<<<<<<< HEAD
<<<<<<< HEAD
<<<<<<< HEAD
<<<<<<< HEAD
<<<<<<< HEAD
<<<<<<< HEAD
<<<<<<< HEAD
<<<<<<< HEAD
<<<<<<< HEAD
<<<<<<< HEAD
<<<<<<< HEAD
<<<<<<< HEAD
<<<<<<< HEAD
<<<<<<< HEAD
<<<<<<< HEAD
<<<<<<< HEAD
<<<<<<< HEAD
<<<<<<< HEAD
<<<<<<< HEAD
<<<<<<< HEAD
<<<<<<< HEAD
<<<<<<< HEAD
<<<<<<< HEAD
<<<<<<< HEAD
<<<<<<< HEAD
<<<<<<< HEAD
<<<<<<< HEAD
<<<<<<< HEAD
<<<<<<< HEAD
<<<<<<< HEAD
<<<<<<< HEAD
<<<<<<< HEAD
<<<<<<< HEAD
<<<<<<< HEAD
<<<<<<< HEAD
<<<<<<< HEAD
<<<<<<< HEAD
<<<<<<< HEAD
<<<<<<< HEAD
<<<<<<< HEAD
<<<<<<< HEAD
<<<<<<< HEAD
<<<<<<< HEAD
<<<<<<< HEAD
<<<<<<< HEAD
<<<<<<< HEAD
<<<<<<< HEAD
<<<<<<< HEAD
<<<<<<< HEAD
<<<<<<< HEAD
<<<<<<< HEAD
<<<<<<< HEAD
<<<<<<< HEAD
<<<<<<< HEAD
<<<<<<< HEAD
<<<<<<< HEAD
<<<<<<< HEAD
<<<<<<< HEAD
<<<<<<< HEAD
<<<<<<< HEAD
<<<<<<< HEAD
<<<<<<< HEAD
<<<<<<< HEAD
<<<<<<< HEAD
<<<<<<< HEAD
<<<<<<< HEAD
<<<<<<< HEAD
<<<<<<< HEAD
<<<<<<< HEAD
<<<<<<< HEAD
<<<<<<< HEAD
<<<<<<< HEAD
<<<<<<< HEAD
<<<<<<< HEAD
<<<<<<< HEAD
<<<<<<< HEAD
<<<<<<< HEAD
<<<<<<< HEAD
<<<<<<< HEAD
<<<<<<< HEAD
<<<<<<< HEAD
<<<<<<< HEAD
<<<<<<< HEAD
<<<<<<< HEAD
<<<<<<< HEAD
<<<<<<< HEAD
<<<<<<< HEAD
<<<<<<< HEAD
<<<<<<< HEAD
<<<<<<< HEAD
<<<<<<< HEAD
<<<<<<< HEAD
<<<<<<< HEAD
<<<<<<< HEAD
<<<<<<< HEAD
<<<<<<< HEAD
<<<<<<< HEAD
<<<<<<< HEAD
<<<<<<< HEAD
<<<<<<< HEAD
<<<<<<< HEAD
<<<<<<< HEAD
<<<<<<< HEAD
<<<<<<< HEAD
<<<<<<< HEAD
<<<<<<< HEAD
<<<<<<< HEAD
<<<<<<< HEAD
<<<<<<< HEAD
<<<<<<< HEAD
<<<<<<< HEAD
<<<<<<< HEAD
<<<<<<< HEAD
<<<<<<< HEAD
<<<<<<< HEAD
<<<<<<< HEAD
<<<<<<< HEAD
<<<<<<< HEAD
<<<<<<< HEAD
<<<<<<< HEAD
<<<<<<< HEAD
<<<<<<< HEAD
<<<<<<< HEAD
<<<<<<< HEAD
<<<<<<< HEAD
<<<<<<< HEAD
<<<<<<< HEAD
<<<<<<< HEAD
<<<<<<< HEAD
<<<<<<< HEAD
<<<<<<< HEAD
<<<<<<< HEAD
<<<<<<< HEAD
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
>>>>>>> 7c98bab97e (GEOMESA-3113 Add system property to managing HBase deletes with visibilities (#2792))
=======
>>>>>>> c4ce510344 (GEOMESA-3102 Fix removal of user data in FileSystemDataStore.createSchema (#2787))
=======
>>>>>>> a1ccc017c6 (GEOMESA-3113 Add system property to managing HBase deletes with visibilities (#2792))
=======
>>>>>>> 582a3156f3 (GEOMESA-3102 Fix removal of user data in FileSystemDataStore.createSchema (#2787))
=======
=======
>>>>>>> 2d101f8da9 (GEOMESA-3113 Add system property to managing HBase deletes with visibilities (#2792))
=======
>>>>>>> d71c234711 (GEOMESA-3113 Add system property to managing HBase deletes with visibilities (#2792))
=======
=======
=======
=======
=======
=======
=======
=======
=======
>>>>>>> 64eaf6b132 (Merge branch 'feature/postgis-fixes')
>>>>>>> 79bf541ac8 (Merge branch 'feature/postgis-fixes')
=======
>>>>>>> 869683ad83 (GEOMESA-3113 Add system property to managing HBase deletes with visibilities (#2792))
>>>>>>> 3571a41838 (GEOMESA-3113 Add system property to managing HBase deletes with visibilities (#2792))
=======
>>>>>>> 8a2d3cfac9 (GEOMESA-3102 Fix removal of user data in FileSystemDataStore.createSchema (#2787))
>>>>>>> d073e4ceb3 (GEOMESA-3102 Fix removal of user data in FileSystemDataStore.createSchema (#2787))
=======
>>>>>>> 6ee72f98ac (GEOMESA-3113 Add system property to managing HBase deletes with visibilities (#2792))
>>>>>>> 10db10e107 (GEOMESA-3113 Add system property to managing HBase deletes with visibilities (#2792))
=======
>>>>>>> b23256999b (GEOMESA-3102 Fix removal of user data in FileSystemDataStore.createSchema (#2787))
>>>>>>> 474042e6d6 (GEOMESA-3102 Fix removal of user data in FileSystemDataStore.createSchema (#2787))
=======
>>>>>>> 7c98bab97e (GEOMESA-3113 Add system property to managing HBase deletes with visibilities (#2792))
>>>>>>> 1a0678c1b1 (GEOMESA-3113 Add system property to managing HBase deletes with visibilities (#2792))
=======
>>>>>>> a1ccc017c6 (GEOMESA-3113 Add system property to managing HBase deletes with visibilities (#2792))
>>>>>>> 40a526e8a3 (GEOMESA-3113 Add system property to managing HBase deletes with visibilities (#2792))
=======
>>>>>>> 582a3156f3 (GEOMESA-3102 Fix removal of user data in FileSystemDataStore.createSchema (#2787))
>>>>>>> 9d7ed88fa8 (GEOMESA-3102 Fix removal of user data in FileSystemDataStore.createSchema (#2787))
=======
>>>>>>> 113b056da (GEOMESA-3113 Add system property to managing HBase deletes with visibilities (#2792))
=======
>>>>>>> 36522ca6db (GEOMESA-3102 Fix removal of user data in FileSystemDataStore.createSchema (#2787))
<<<<<<< HEAD
<<<<<<< HEAD
<<<<<<< HEAD
<<<<<<< HEAD
<<<<<<< HEAD
<<<<<<< HEAD
<<<<<<< HEAD
<<<<<<< HEAD
<<<<<<< HEAD
<<<<<<< HEAD
<<<<<<< HEAD
<<<<<<< HEAD
<<<<<<< HEAD
<<<<<<< HEAD
<<<<<<< HEAD
<<<<<<< HEAD
<<<<<<< HEAD
<<<<<<< HEAD
<<<<<<< HEAD
<<<<<<< HEAD
<<<<<<< HEAD
<<<<<<< HEAD
<<<<<<< HEAD
<<<<<<< HEAD
<<<<<<< HEAD
<<<<<<< HEAD
<<<<<<< HEAD
<<<<<<< HEAD
<<<<<<< HEAD
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
>>>>>>> bd17bd131e (GEOMESA-3102 Fix removal of user data in FileSystemDataStore.createSchema (#2787))
>>>>>>> 682f10a0e9 (GEOMESA-3102 Fix removal of user data in FileSystemDataStore.createSchema (#2787))
=======
>>>>>>> 5d545f24ed (GEOMESA-3113 Add system property to managing HBase deletes with visibilities (#2792))
=======
>>>>>>> f794648fd0 (GEOMESA-3102 Fix removal of user data in FileSystemDataStore.createSchema (#2787))
=======
>>>>>>> c296484bff (GEOMESA-3113 Add system property to managing HBase deletes with visibilities (#2792))
=======
>>>>>>> 237bd3cb10 (GEOMESA-3102 Fix removal of user data in FileSystemDataStore.createSchema (#2787))
=======
>>>>>>> 4c41429da9 (Merge branch 'feature/postgis-fixes')
=======
>>>>>>> 7d705cac10 (GEOMESA-3113 Add system property to managing HBase deletes with visibilities (#2792))
=======
>>>>>>> 0ac8a757dd (GEOMESA-3102 Fix removal of user data in FileSystemDataStore.createSchema (#2787))
=======
>>>>>>> 307fc2b238 (GEOMESA-3113 Add system property to managing HBase deletes with visibilities (#2792))
=======
>>>>>>> a9cee10e0a (GEOMESA-3102 Fix removal of user data in FileSystemDataStore.createSchema (#2787))
=======
>>>>>>> 7cf935d373 (GEOMESA-3113 Add system property to managing HBase deletes with visibilities (#2792))
=======
>>>>>>> 9431689196 (GEOMESA-3102 Fix removal of user data in FileSystemDataStore.createSchema (#2787))
=======
>>>>>>> d83ac69cc5 (GEOMESA-3113 Add system property to managing HBase deletes with visibilities (#2792))
=======
>>>>>>> ce8500e632 (GEOMESA-3102 Fix removal of user data in FileSystemDataStore.createSchema (#2787))
=======
>>>>>>> f58f87b448 (GEOMESA-3102 Fix removal of user data in FileSystemDataStore.createSchema (#2787))
=======
>>>>>>> 7196beb2e1 (GEOMESA-3113 Add system property to managing HBase deletes with visibilities (#2792))
=======
>>>>>>> b4cc9497d5 (GEOMESA-3102 Fix removal of user data in FileSystemDataStore.createSchema (#2787))
=======
>>>>>>> df9cd4f22d (GEOMESA-3113 Add system property to managing HBase deletes with visibilities (#2792))
=======
>>>>>>> c0b0589a14 (GEOMESA-3102 Fix removal of user data in FileSystemDataStore.createSchema (#2787))
=======
>>>>>>> 2b9cd40059 (GEOMESA-3113 Add system property to managing HBase deletes with visibilities (#2792))
=======
>>>>>>> 264c9fa240 (Merge branch 'feature/postgis-fixes')
=======
>>>>>>> 12ae1c3224 (GEOMESA-3102 Fix removal of user data in FileSystemDataStore.createSchema (#2787))
=======
>>>>>>> 9f616db357 (GEOMESA-3113 Add system property to managing HBase deletes with visibilities (#2792))
=======
>>>>>>> e721efd628 (GEOMESA-3102 Fix removal of user data in FileSystemDataStore.createSchema (#2787))
=======
>>>>>>> ed36e40e7c (GEOMESA-3113 Add system property to managing HBase deletes with visibilities (#2792))
=======
>>>>>>> 8a07c6167f (GEOMESA-3102 Fix removal of user data in FileSystemDataStore.createSchema (#2787))
=======
>>>>>>> 1b0d520fde (GEOMESA-3113 Add system property to managing HBase deletes with visibilities (#2792))
=======
>>>>>>> 871350de06 (GEOMESA-3102 Fix removal of user data in FileSystemDataStore.createSchema (#2787))
=======
>>>>>>> 9bcc7591e5 (GEOMESA-3113 Add system property to managing HBase deletes with visibilities (#2792))
=======
>>>>>>> 2ec7d64046 (GEOMESA-3102 Fix removal of user data in FileSystemDataStore.createSchema (#2787))
=======
>>>>>>> 344200f1df (GEOMESA-3113 Add system property to managing HBase deletes with visibilities (#2792))
=======
>>>>>>> 8317120c9b (GEOMESA-3102 Fix removal of user data in FileSystemDataStore.createSchema (#2787))
=======
>>>>>>> 98e607d2fa (GEOMESA-3113 Add system property to managing HBase deletes with visibilities (#2792))
=======
>>>>>>> 217b7d1cb9 (Merge branch 'feature/postgis-fixes')
=======
>>>>>>> 5d46ff705f (GEOMESA-3113 Add system property to managing HBase deletes with visibilities (#2792))
=======
>>>>>>> 69016fbbb7 (GEOMESA-3113 Add system property to managing HBase deletes with visibilities (#2792))
=======
>>>>>>> d73ae82492 (GEOMESA-3113 Add system property to managing HBase deletes with visibilities (#2792))
=======
>>>>>>> d1d11691fd (GEOMESA-3113 Add system property to managing HBase deletes with visibilities (#2792))
=======
>>>>>>> eeb8ab478a (GEOMESA-3113 Add system property to managing HBase deletes with visibilities (#2792))
=======
>>>>>>> a8b2b56cbd (GEOMESA-3113 Add system property to managing HBase deletes with visibilities (#2792))
=======
>>>>>>> b6e56a9e80 (Merge branch 'feature/postgis-fixes')
=======
>>>>>>> 27eec0d076 (GEOMESA-3102 Fix removal of user data in FileSystemDataStore.createSchema (#2787))
=======
>>>>>>> afcf525d7d (GEOMESA-3113 Add system property to managing HBase deletes with visibilities (#2792))
=======
>>>>>>> e11c16ba5d (GEOMESA-3102 Fix removal of user data in FileSystemDataStore.createSchema (#2787))
=======
>>>>>>> 00494e0bcf (GEOMESA-3113 Add system property to managing HBase deletes with visibilities (#2792))
=======
>>>>>>> 5742320897 (GEOMESA-3102 Fix removal of user data in FileSystemDataStore.createSchema (#2787))
=======
>>>>>>> c43c29e91c (GEOMESA-3113 Add system property to managing HBase deletes with visibilities (#2792))
=======
>>>>>>> 78439fc2da (GEOMESA-3102 Fix removal of user data in FileSystemDataStore.createSchema (#2787))
=======
>>>>>>> 64c0e084b5 (GEOMESA-3113 Add system property to managing HBase deletes with visibilities (#2792))
=======
>>>>>>> 4b926d9ec6 (GEOMESA-3102 Fix removal of user data in FileSystemDataStore.createSchema (#2787))
=======
>>>>>>> cdb062d5e9 (GEOMESA-3113 Add system property to managing HBase deletes with visibilities (#2792))
=======
>>>>>>> a738799968 (GEOMESA-3102 Fix removal of user data in FileSystemDataStore.createSchema (#2787))
=======
>>>>>>> 3d40465720 (GEOMESA-3113 Add system property to managing HBase deletes with visibilities (#2792))
=======
>>>>>>> 0a5b74c946 (Merge branch 'feature/postgis-fixes')
=======
>>>>>>> 49e9f5cb35 (GEOMESA-3102 Fix removal of user data in FileSystemDataStore.createSchema (#2787))
=======
>>>>>>> 3867fd5b25 (GEOMESA-3113 Add system property to managing HBase deletes with visibilities (#2792))
=======
>>>>>>> 4d7289a2fe (GEOMESA-3102 Fix removal of user data in FileSystemDataStore.createSchema (#2787))
=======
>>>>>>> 5af1e798d5 (GEOMESA-3113 Add system property to managing HBase deletes with visibilities (#2792))
=======
>>>>>>> f22bf41646 (GEOMESA-3102 Fix removal of user data in FileSystemDataStore.createSchema (#2787))
=======
>>>>>>> ffcb7ff3ae (GEOMESA-3113 Add system property to managing HBase deletes with visibilities (#2792))
=======
>>>>>>> 4b0c56ce56 (GEOMESA-3102 Fix removal of user data in FileSystemDataStore.createSchema (#2787))
=======
>>>>>>> 9ac1262e54 (GEOMESA-3113 Add system property to managing HBase deletes with visibilities (#2792))
=======
>>>>>>> 1a90b3062a (GEOMESA-3102 Fix removal of user data in FileSystemDataStore.createSchema (#2787))
=======
>>>>>>> 043e029470 (GEOMESA-3113 Add system property to managing HBase deletes with visibilities (#2792))
=======
>>>>>>> c8431d18e4 (GEOMESA-3102 Fix removal of user data in FileSystemDataStore.createSchema (#2787))
=======
>>>>>>> 9dd4a005eb (GEOMESA-3113 Add system property to managing HBase deletes with visibilities (#2792))
=======
>>>>>>> a30a0c1a2a (Merge branch 'feature/postgis-fixes')
=======
>>>>>>> f148adeccd (GEOMESA-3102 Fix removal of user data in FileSystemDataStore.createSchema (#2787))
=======
>>>>>>> b448819e24 (GEOMESA-3113 Add system property to managing HBase deletes with visibilities (#2792))
=======
>>>>>>> d71800c037 (GEOMESA-3102 Fix removal of user data in FileSystemDataStore.createSchema (#2787))
=======
>>>>>>> f68b76f4b8 (GEOMESA-3113 Add system property to managing HBase deletes with visibilities (#2792))
=======
>>>>>>> 4d1cac1d60 (GEOMESA-3102 Fix removal of user data in FileSystemDataStore.createSchema (#2787))
=======
>>>>>>> cb8df4c76b (GEOMESA-3113 Add system property to managing HBase deletes with visibilities (#2792))
=======
>>>>>>> 265d436467 (GEOMESA-3102 Fix removal of user data in FileSystemDataStore.createSchema (#2787))
=======
>>>>>>> 7ce9817488 (GEOMESA-3113 Add system property to managing HBase deletes with visibilities (#2792))
=======
>>>>>>> 02465f5f58 (GEOMESA-3102 Fix removal of user data in FileSystemDataStore.createSchema (#2787))
=======
>>>>>>> 8eb59bcc3c (GEOMESA-3113 Add system property to managing HBase deletes with visibilities (#2792))
=======
>>>>>>> 6f245b0cc5 (GEOMESA-3102 Fix removal of user data in FileSystemDataStore.createSchema (#2787))
=======
>>>>>>> 07c698faf4 (GEOMESA-3113 Add system property to managing HBase deletes with visibilities (#2792))
=======
>>>>>>> cc93e0930d (Merge branch 'feature/postgis-fixes')
=======
>>>>>>> a773c6ef65 (GEOMESA-3113 Add system property to managing HBase deletes with visibilities (#2792))
=======
>>>>>>> 2d01ec0bc0 (GEOMESA-3102 Fix removal of user data in FileSystemDataStore.createSchema (#2787))
=======
<<<<<<< HEAD
<<<<<<< HEAD
>>>>>>> b586a90765 (GEOMESA-3113 Add system property to managing HBase deletes with visibilities (#2792))
=======
>>>>>>> 8a9d3df519 (GEOMESA-3102 Fix removal of user data in FileSystemDataStore.createSchema (#2787))
=======
<<<<<<< HEAD
<<<<<<< HEAD
>>>>>>> ba177f9f13 (GEOMESA-3113 Add system property to managing HBase deletes with visibilities (#2792))
=======
>>>>>>> 08ee2fed57 (GEOMESA-3102 Fix removal of user data in FileSystemDataStore.createSchema (#2787))
=======
<<<<<<< HEAD
<<<<<<< HEAD
>>>>>>> 813cf035d0 (GEOMESA-3113 Add system property to managing HBase deletes with visibilities (#2792))
=======
>>>>>>> 42e8565e9b (Merge branch 'feature/postgis-fixes')
=======
<<<<<<< HEAD
<<<<<<< HEAD
>>>>>>> 49337228be (GEOMESA-3102 Fix removal of user data in FileSystemDataStore.createSchema (#2787))
=======
>>>>>>> 54fb546133 (GEOMESA-3113 Add system property to managing HBase deletes with visibilities (#2792))
=======
<<<<<<< HEAD
<<<<<<< HEAD
>>>>>>> 8be42d246c (GEOMESA-3102 Fix removal of user data in FileSystemDataStore.createSchema (#2787))
=======
>>>>>>> 7ac82c3dce (GEOMESA-3113 Add system property to managing HBase deletes with visibilities (#2792))
=======
<<<<<<< HEAD
<<<<<<< HEAD
>>>>>>> 628458842d (GEOMESA-3102 Fix removal of user data in FileSystemDataStore.createSchema (#2787))
=======
>>>>>>> aca68ab685 (GEOMESA-3113 Add system property to managing HBase deletes with visibilities (#2792))
=======
<<<<<<< HEAD
<<<<<<< HEAD
>>>>>>> f7952edd5f (GEOMESA-3102 Fix removal of user data in FileSystemDataStore.createSchema (#2787))
=======
>>>>>>> fd0793971d (GEOMESA-3113 Add system property to managing HBase deletes with visibilities (#2792))
=======
<<<<<<< HEAD
<<<<<<< HEAD
>>>>>>> 853c43fc17 (GEOMESA-3102 Fix removal of user data in FileSystemDataStore.createSchema (#2787))
=======
>>>>>>> e0056031ea (GEOMESA-3113 Add system property to managing HBase deletes with visibilities (#2792))
=======
<<<<<<< HEAD
<<<<<<< HEAD
>>>>>>> 15429a51ce (GEOMESA-3102 Fix removal of user data in FileSystemDataStore.createSchema (#2787))
=======
>>>>>>> e41e9641d2 (GEOMESA-3113 Add system property to managing HBase deletes with visibilities (#2792))
=======
<<<<<<< HEAD
<<<<<<< HEAD
>>>>>>> 67de3c3202 (Merge branch 'feature/postgis-fixes')
=======
>>>>>>> c6079ecae5 (GEOMESA-3113 Add system property to managing HBase deletes with visibilities (#2792))
=======
<<<<<<< HEAD
<<<<<<< HEAD
>>>>>>> e0644f7991 (GEOMESA-3113 Add system property to managing HBase deletes with visibilities (#2792))
=======
>>>>>>> 9888cda97e (GEOMESA-3113 Add system property to managing HBase deletes with visibilities (#2792))
=======
<<<<<<< HEAD
<<<<<<< HEAD
>>>>>>> dba8cb28c4 (GEOMESA-3113 Add system property to managing HBase deletes with visibilities (#2792))
=======
>>>>>>> 5f0745e34b (GEOMESA-3113 Add system property to managing HBase deletes with visibilities (#2792))
=======
<<<<<<< HEAD
<<<<<<< HEAD
>>>>>>> e6162be24a (GEOMESA-3113 Add system property to managing HBase deletes with visibilities (#2792))
=======
>>>>>>> 638b68d081 (Merge branch 'feature/postgis-fixes')
=======
<<<<<<< HEAD
<<<<<<< HEAD
>>>>>>> f502df5b55 (GEOMESA-3102 Fix removal of user data in FileSystemDataStore.createSchema (#2787))
=======
>>>>>>> 29dcc37810 (GEOMESA-3113 Add system property to managing HBase deletes with visibilities (#2792))
=======
<<<<<<< HEAD
<<<<<<< HEAD
>>>>>>> f18f027f66 (GEOMESA-3102 Fix removal of user data in FileSystemDataStore.createSchema (#2787))
=======
>>>>>>> dbbcaa10d3 (GEOMESA-3113 Add system property to managing HBase deletes with visibilities (#2792))
=======
<<<<<<< HEAD
<<<<<<< HEAD
>>>>>>> 814abac33f (GEOMESA-3102 Fix removal of user data in FileSystemDataStore.createSchema (#2787))
=======
>>>>>>> f2b9fb3853 (GEOMESA-3113 Add system property to managing HBase deletes with visibilities (#2792))
=======
<<<<<<< HEAD
<<<<<<< HEAD
>>>>>>> 7f486255dd (GEOMESA-3102 Fix removal of user data in FileSystemDataStore.createSchema (#2787))
=======
>>>>>>> e639fc30a7 (GEOMESA-3113 Add system property to managing HBase deletes with visibilities (#2792))
=======
<<<<<<< HEAD
<<<<<<< HEAD
>>>>>>> 7e323ef52f (GEOMESA-3102 Fix removal of user data in FileSystemDataStore.createSchema (#2787))
=======
>>>>>>> 69a4e317d6 (GEOMESA-3113 Add system property to managing HBase deletes with visibilities (#2792))
=======
<<<<<<< HEAD
<<<<<<< HEAD
>>>>>>> e9395c1096 (GEOMESA-3102 Fix removal of user data in FileSystemDataStore.createSchema (#2787))
=======
>>>>>>> 65460df3e6 (GEOMESA-3113 Add system property to managing HBase deletes with visibilities (#2792))
=======
<<<<<<< HEAD
<<<<<<< HEAD
>>>>>>> 71adb695c5 (Merge branch 'feature/postgis-fixes')
=======
>>>>>>> 16bbecada1 (GEOMESA-3102 Fix removal of user data in FileSystemDataStore.createSchema (#2787))
=======
<<<<<<< HEAD
<<<<<<< HEAD
>>>>>>> be1167e028 (GEOMESA-3113 Add system property to managing HBase deletes with visibilities (#2792))
=======
>>>>>>> fa2938c568 (GEOMESA-3102 Fix removal of user data in FileSystemDataStore.createSchema (#2787))
=======
<<<<<<< HEAD
<<<<<<< HEAD
>>>>>>> 54da398207 (GEOMESA-3113 Add system property to managing HBase deletes with visibilities (#2792))
=======
>>>>>>> 1682b13d94 (GEOMESA-3102 Fix removal of user data in FileSystemDataStore.createSchema (#2787))
=======
<<<<<<< HEAD
<<<<<<< HEAD
>>>>>>> 8999b3f6b9 (GEOMESA-3113 Add system property to managing HBase deletes with visibilities (#2792))
=======
>>>>>>> abc395c346 (GEOMESA-3102 Fix removal of user data in FileSystemDataStore.createSchema (#2787))
=======
<<<<<<< HEAD
<<<<<<< HEAD
>>>>>>> 3c53246c9a (GEOMESA-3113 Add system property to managing HBase deletes with visibilities (#2792))
=======
>>>>>>> fd0ea5e670 (GEOMESA-3102 Fix removal of user data in FileSystemDataStore.createSchema (#2787))
=======
<<<<<<< HEAD
<<<<<<< HEAD
>>>>>>> fc179cb2d5 (GEOMESA-3113 Add system property to managing HBase deletes with visibilities (#2792))
=======
>>>>>>> d2e8dad373 (GEOMESA-3102 Fix removal of user data in FileSystemDataStore.createSchema (#2787))
=======
<<<<<<< HEAD
<<<<<<< HEAD
>>>>>>> 9e74e1d9b4 (GEOMESA-3113 Add system property to managing HBase deletes with visibilities (#2792))
=======
>>>>>>> 30559ea5c9 (Merge branch 'feature/postgis-fixes')
=======
<<<<<<< HEAD
<<<<<<< HEAD
>>>>>>> 8ddbf27f07 (GEOMESA-3102 Fix removal of user data in FileSystemDataStore.createSchema (#2787))
=======
>>>>>>> 1d4e479464 (GEOMESA-3113 Add system property to managing HBase deletes with visibilities (#2792))
=======
<<<<<<< HEAD
<<<<<<< HEAD
>>>>>>> 735f1fc092 (GEOMESA-3102 Fix removal of user data in FileSystemDataStore.createSchema (#2787))
=======
>>>>>>> a834a844c7 (GEOMESA-3113 Add system property to managing HBase deletes with visibilities (#2792))
=======
<<<<<<< HEAD
<<<<<<< HEAD
>>>>>>> 6d4f75bcbb (GEOMESA-3102 Fix removal of user data in FileSystemDataStore.createSchema (#2787))
=======
>>>>>>> 0d4496a2f2 (GEOMESA-3113 Add system property to managing HBase deletes with visibilities (#2792))
=======
<<<<<<< HEAD
<<<<<<< HEAD
>>>>>>> ee2741585f (GEOMESA-3102 Fix removal of user data in FileSystemDataStore.createSchema (#2787))
=======
>>>>>>> 1506607bc9 (GEOMESA-3113 Add system property to managing HBase deletes with visibilities (#2792))
=======
<<<<<<< HEAD
<<<<<<< HEAD
>>>>>>> abe07966f6 (GEOMESA-3102 Fix removal of user data in FileSystemDataStore.createSchema (#2787))
=======
>>>>>>> de00bd1943 (GEOMESA-3113 Add system property to managing HBase deletes with visibilities (#2792))
=======
<<<<<<< HEAD
<<<<<<< HEAD
>>>>>>> ffdb14e2a7 (GEOMESA-3102 Fix removal of user data in FileSystemDataStore.createSchema (#2787))
=======
>>>>>>> ea5f19f56b (GEOMESA-3113 Add system property to managing HBase deletes with visibilities (#2792))
=======
<<<<<<< HEAD
<<<<<<< HEAD
>>>>>>> ec6d06b576 (Merge branch 'feature/postgis-fixes')
=======
>>>>>>> 0fb40a8655 (GEOMESA-3113 Add system property to managing HBase deletes with visibilities (#2792))
=======
>>>>>>> 41631d23c9 (GEOMESA-3102 Fix removal of user data in FileSystemDataStore.createSchema (#2787))
=======
>>>>>>> bc833b1448 (GEOMESA-3113 Add system property to managing HBase deletes with visibilities (#2792))
=======
>>>>>>> 1e838e1657 (GEOMESA-3102 Fix removal of user data in FileSystemDataStore.createSchema (#2787))
=======
>>>>>>> a42015a87c (GEOMESA-3113 Add system property to managing HBase deletes with visibilities (#2792))
=======
>>>>>>> ffca94ce17 (GEOMESA-3102 Fix removal of user data in FileSystemDataStore.createSchema (#2787))
=======
>>>>>>> ec072ceda6 (GEOMESA-3113 Add system property to managing HBase deletes with visibilities (#2792))
=======
>>>>>>> 6e0709aba8 (Merge branch 'feature/postgis-fixes')
=======
>>>>>>> 8e486088f5 (GEOMESA-3102 Fix removal of user data in FileSystemDataStore.createSchema (#2787))
=======
>>>>>>> 94096ec6bd (GEOMESA-3113 Add system property to managing HBase deletes with visibilities (#2792))
=======
>>>>>>> 2d18554450 (GEOMESA-3102 Fix removal of user data in FileSystemDataStore.createSchema (#2787))
=======
>>>>>>> db696250b0 (GEOMESA-3113 Add system property to managing HBase deletes with visibilities (#2792))
=======
>>>>>>> 595d9061e3 (GEOMESA-3102 Fix removal of user data in FileSystemDataStore.createSchema (#2787))
=======
>>>>>>> 2d98e354b8 (GEOMESA-3113 Add system property to managing HBase deletes with visibilities (#2792))
=======
>>>>>>> 2f550bb2a7 (GEOMESA-3102 Fix removal of user data in FileSystemDataStore.createSchema (#2787))
=======
>>>>>>> 8781a5befd (GEOMESA-3113 Add system property to managing HBase deletes with visibilities (#2792))
=======
>>>>>>> dfae24c155 (GEOMESA-3102 Fix removal of user data in FileSystemDataStore.createSchema (#2787))
=======
>>>>>>> a52516cf49 (GEOMESA-3113 Add system property to managing HBase deletes with visibilities (#2792))
=======
>>>>>>> 7e8f76c0f9 (GEOMESA-3102 Fix removal of user data in FileSystemDataStore.createSchema (#2787))
=======
>>>>>>> 1351a5baa4 (GEOMESA-3113 Add system property to managing HBase deletes with visibilities (#2792))
=======
>>>>>>> ed25decdd5 (Merge branch 'feature/postgis-fixes')
=======
>>>>>>> 857489f8a0 (GEOMESA-3113 Add system property to managing HBase deletes with visibilities (#2792))
=======
>>>>>>> 083bb9617b (GEOMESA-3113 Add system property to managing HBase deletes with visibilities (#2792))
=======
>>>>>>> 32aba52002 (GEOMESA-3113 Add system property to managing HBase deletes with visibilities (#2792))
=======
>>>>>>> 2c630f9360 (GEOMESA-3113 Add system property to managing HBase deletes with visibilities (#2792))
=======
>>>>>>> b69b6b3ea1 (GEOMESA-3113 Add system property to managing HBase deletes with visibilities (#2792))
=======
>>>>>>> 665046a461 (GEOMESA-3113 Add system property to managing HBase deletes with visibilities (#2792))
=======
>>>>>>> f893d9a594 (Merge branch 'feature/postgis-fixes')
=======
>>>>>>> 1382ba7fd3 (GEOMESA-3102 Fix removal of user data in FileSystemDataStore.createSchema (#2787))
=======
>>>>>>> b1dea55b93 (GEOMESA-3113 Add system property to managing HBase deletes with visibilities (#2792))
=======
>>>>>>> 6157978769 (GEOMESA-3102 Fix removal of user data in FileSystemDataStore.createSchema (#2787))
=======
>>>>>>> 7d3ca180ff (GEOMESA-3113 Add system property to managing HBase deletes with visibilities (#2792))
=======
>>>>>>> f9996d127e (GEOMESA-3102 Fix removal of user data in FileSystemDataStore.createSchema (#2787))
=======
>>>>>>> 73d82b731c (GEOMESA-3113 Add system property to managing HBase deletes with visibilities (#2792))
=======
>>>>>>> 957de96206 (GEOMESA-3102 Fix removal of user data in FileSystemDataStore.createSchema (#2787))
=======
>>>>>>> 3c673847c5 (GEOMESA-3113 Add system property to managing HBase deletes with visibilities (#2792))
=======
>>>>>>> d03b76c630 (GEOMESA-3102 Fix removal of user data in FileSystemDataStore.createSchema (#2787))
=======
>>>>>>> ebbfa035a9 (GEOMESA-3113 Add system property to managing HBase deletes with visibilities (#2792))
=======
>>>>>>> 0cb32b7425 (GEOMESA-3102 Fix removal of user data in FileSystemDataStore.createSchema (#2787))
=======
>>>>>>> ad7a284ebe (GEOMESA-3113 Add system property to managing HBase deletes with visibilities (#2792))
=======
>>>>>>> 964e86145a (Merge branch 'feature/postgis-fixes')
=======
>>>>>>> be8a3bab90 (GEOMESA-3102 Fix removal of user data in FileSystemDataStore.createSchema (#2787))
=======
>>>>>>> b3fe983979 (GEOMESA-3113 Add system property to managing HBase deletes with visibilities (#2792))
=======
>>>>>>> af5b690d0b (GEOMESA-3102 Fix removal of user data in FileSystemDataStore.createSchema (#2787))
=======
>>>>>>> 02a91455d8 (GEOMESA-3113 Add system property to managing HBase deletes with visibilities (#2792))
=======
>>>>>>> b1b67a398d (GEOMESA-3102 Fix removal of user data in FileSystemDataStore.createSchema (#2787))
=======
>>>>>>> cbaecd4a0f (GEOMESA-3113 Add system property to managing HBase deletes with visibilities (#2792))
=======
>>>>>>> a23109e63b (GEOMESA-3102 Fix removal of user data in FileSystemDataStore.createSchema (#2787))
=======
>>>>>>> 9b169d0847 (GEOMESA-3113 Add system property to managing HBase deletes with visibilities (#2792))
=======
>>>>>>> eb98a9fb29 (GEOMESA-3102 Fix removal of user data in FileSystemDataStore.createSchema (#2787))
=======
>>>>>>> d539392ecd (GEOMESA-3113 Add system property to managing HBase deletes with visibilities (#2792))
=======
>>>>>>> ef0351a168 (GEOMESA-3102 Fix removal of user data in FileSystemDataStore.createSchema (#2787))
=======
>>>>>>> d9ec67b278 (GEOMESA-3113 Add system property to managing HBase deletes with visibilities (#2792))
=======
>>>>>>> bf6bde0830 (Merge branch 'feature/postgis-fixes')
=======
>>>>>>> 7053435184 (GEOMESA-3102 Fix removal of user data in FileSystemDataStore.createSchema (#2787))
=======
>>>>>>> 1417ba30dc (GEOMESA-3113 Add system property to managing HBase deletes with visibilities (#2792))
=======
>>>>>>> 0acf2e86fa (GEOMESA-3102 Fix removal of user data in FileSystemDataStore.createSchema (#2787))
=======
>>>>>>> 19e79eeeaa (GEOMESA-3113 Add system property to managing HBase deletes with visibilities (#2792))
=======
>>>>>>> d61b3bb194 (GEOMESA-3102 Fix removal of user data in FileSystemDataStore.createSchema (#2787))
=======
>>>>>>> 0121c0dbad (GEOMESA-3113 Add system property to managing HBase deletes with visibilities (#2792))
=======
>>>>>>> e518bfb9e2 (GEOMESA-3102 Fix removal of user data in FileSystemDataStore.createSchema (#2787))
=======
>>>>>>> 5a43551b62 (GEOMESA-3113 Add system property to managing HBase deletes with visibilities (#2792))
=======
>>>>>>> 93a4d60f28 (GEOMESA-3102 Fix removal of user data in FileSystemDataStore.createSchema (#2787))
=======
>>>>>>> 6bef55a1ea (GEOMESA-3113 Add system property to managing HBase deletes with visibilities (#2792))
=======
>>>>>>> 48bb106de6 (GEOMESA-3102 Fix removal of user data in FileSystemDataStore.createSchema (#2787))
=======
>>>>>>> ce7c794944 (GEOMESA-3113 Add system property to managing HBase deletes with visibilities (#2792))
=======
>>>>>>> 354b5e5ae5 (Merge branch 'feature/postgis-fixes')
=======
>>>>>>> 5b83f2d5c8 (GEOMESA-3102 Fix removal of user data in FileSystemDataStore.createSchema (#2787))
=======
>>>>>>> 5f8777dc16 (GEOMESA-3113 Add system property to managing HBase deletes with visibilities (#2792))
=======
>>>>>>> 8414c0cefb (GEOMESA-3102 Fix removal of user data in FileSystemDataStore.createSchema (#2787))
=======
>>>>>>> b81683f4bc (GEOMESA-3113 Add system property to managing HBase deletes with visibilities (#2792))
=======
>>>>>>> 6f9b076410 (GEOMESA-3102 Fix removal of user data in FileSystemDataStore.createSchema (#2787))
=======
>>>>>>> 39a2b37b5e (GEOMESA-3113 Add system property to managing HBase deletes with visibilities (#2792))
=======
>>>>>>> a0d25ffbaa (GEOMESA-3102 Fix removal of user data in FileSystemDataStore.createSchema (#2787))
=======
>>>>>>> 7f28e8e2e5 (GEOMESA-3113 Add system property to managing HBase deletes with visibilities (#2792))
=======
>>>>>>> 9171ff5334 (GEOMESA-3102 Fix removal of user data in FileSystemDataStore.createSchema (#2787))
=======
>>>>>>> f1f448d9e0 (GEOMESA-3113 Add system property to managing HBase deletes with visibilities (#2792))
=======
>>>>>>> abaa89e702 (GEOMESA-3102 Fix removal of user data in FileSystemDataStore.createSchema (#2787))
=======
>>>>>>> 8524ef3a47 (GEOMESA-3113 Add system property to managing HBase deletes with visibilities (#2792))
=======
>>>>>>> d581fa3e8f (Merge branch 'feature/postgis-fixes')
=======
>>>>>>> b5ef5f3ffb (GEOMESA-3102 Fix removal of user data in FileSystemDataStore.createSchema (#2787))
=======
>>>>>>> a0d7cc16ab (GEOMESA-3113 Add system property to managing HBase deletes with visibilities (#2792))
=======
>>>>>>> ae19085932 (GEOMESA-3102 Fix removal of user data in FileSystemDataStore.createSchema (#2787))
=======
>>>>>>> cdbed26e09 (GEOMESA-3113 Add system property to managing HBase deletes with visibilities (#2792))
=======
>>>>>>> 83a8ca6465 (GEOMESA-3102 Fix removal of user data in FileSystemDataStore.createSchema (#2787))
=======
=======
>>>>>>> a773c6ef65 (GEOMESA-3113 Add system property to managing HBase deletes with visibilities (#2792))
>>>>>>> 34fd077439 (GEOMESA-3113 Add system property to managing HBase deletes with visibilities (#2792))
=======
=======
>>>>>>> f58f87b448 (GEOMESA-3102 Fix removal of user data in FileSystemDataStore.createSchema (#2787))
=======
>>>>>>> b586a90765 (GEOMESA-3113 Add system property to managing HBase deletes with visibilities (#2792))
=======
>>>>>>> 7196beb2e1 (GEOMESA-3113 Add system property to managing HBase deletes with visibilities (#2792))
=======
>>>>>>> b4cc9497d5 (GEOMESA-3102 Fix removal of user data in FileSystemDataStore.createSchema (#2787))
=======
>>>>>>> ba177f9f13 (GEOMESA-3113 Add system property to managing HBase deletes with visibilities (#2792))
=======
>>>>>>> df9cd4f22d (GEOMESA-3113 Add system property to managing HBase deletes with visibilities (#2792))
=======
>>>>>>> c0b0589a14 (GEOMESA-3102 Fix removal of user data in FileSystemDataStore.createSchema (#2787))
=======
>>>>>>> 813cf035d0 (GEOMESA-3113 Add system property to managing HBase deletes with visibilities (#2792))
=======
>>>>>>> 2b9cd40059 (GEOMESA-3113 Add system property to managing HBase deletes with visibilities (#2792))
=======
>>>>>>> 264c9fa240 (Merge branch 'feature/postgis-fixes')
=======
>>>>>>> 49337228be (GEOMESA-3102 Fix removal of user data in FileSystemDataStore.createSchema (#2787))
=======
>>>>>>> 12ae1c3224 (GEOMESA-3102 Fix removal of user data in FileSystemDataStore.createSchema (#2787))
=======
>>>>>>> 9f616db357 (GEOMESA-3113 Add system property to managing HBase deletes with visibilities (#2792))
=======
>>>>>>> 8be42d246c (GEOMESA-3102 Fix removal of user data in FileSystemDataStore.createSchema (#2787))
=======
>>>>>>> e721efd628 (GEOMESA-3102 Fix removal of user data in FileSystemDataStore.createSchema (#2787))
=======
>>>>>>> ed36e40e7c (GEOMESA-3113 Add system property to managing HBase deletes with visibilities (#2792))
=======
>>>>>>> 628458842d (GEOMESA-3102 Fix removal of user data in FileSystemDataStore.createSchema (#2787))
=======
>>>>>>> 8a07c6167f (GEOMESA-3102 Fix removal of user data in FileSystemDataStore.createSchema (#2787))
=======
>>>>>>> 1b0d520fde (GEOMESA-3113 Add system property to managing HBase deletes with visibilities (#2792))
=======
>>>>>>> f7952edd5f (GEOMESA-3102 Fix removal of user data in FileSystemDataStore.createSchema (#2787))
=======
>>>>>>> 871350de06 (GEOMESA-3102 Fix removal of user data in FileSystemDataStore.createSchema (#2787))
=======
>>>>>>> 9bcc7591e5 (GEOMESA-3113 Add system property to managing HBase deletes with visibilities (#2792))
=======
>>>>>>> 853c43fc17 (GEOMESA-3102 Fix removal of user data in FileSystemDataStore.createSchema (#2787))
=======
>>>>>>> 2ec7d64046 (GEOMESA-3102 Fix removal of user data in FileSystemDataStore.createSchema (#2787))
=======
>>>>>>> 344200f1df (GEOMESA-3113 Add system property to managing HBase deletes with visibilities (#2792))
=======
>>>>>>> 15429a51ce (GEOMESA-3102 Fix removal of user data in FileSystemDataStore.createSchema (#2787))
=======
>>>>>>> 8317120c9b (GEOMESA-3102 Fix removal of user data in FileSystemDataStore.createSchema (#2787))
=======
>>>>>>> 98e607d2fa (GEOMESA-3113 Add system property to managing HBase deletes with visibilities (#2792))
=======
>>>>>>> 67de3c3202 (Merge branch 'feature/postgis-fixes')
=======
>>>>>>> 217b7d1cb9 (Merge branch 'feature/postgis-fixes')
=======
>>>>>>> 5d46ff705f (GEOMESA-3113 Add system property to managing HBase deletes with visibilities (#2792))
=======
>>>>>>> e0644f7991 (GEOMESA-3113 Add system property to managing HBase deletes with visibilities (#2792))
=======
>>>>>>> 69016fbbb7 (GEOMESA-3113 Add system property to managing HBase deletes with visibilities (#2792))
=======
>>>>>>> d73ae82492 (GEOMESA-3113 Add system property to managing HBase deletes with visibilities (#2792))
=======
>>>>>>> dba8cb28c4 (GEOMESA-3113 Add system property to managing HBase deletes with visibilities (#2792))
=======
>>>>>>> d1d11691fd (GEOMESA-3113 Add system property to managing HBase deletes with visibilities (#2792))
=======
>>>>>>> eeb8ab478a (GEOMESA-3113 Add system property to managing HBase deletes with visibilities (#2792))
=======
>>>>>>> e6162be24a (GEOMESA-3113 Add system property to managing HBase deletes with visibilities (#2792))
=======
>>>>>>> a8b2b56cbd (GEOMESA-3113 Add system property to managing HBase deletes with visibilities (#2792))
=======
>>>>>>> b6e56a9e80 (Merge branch 'feature/postgis-fixes')
=======
>>>>>>> f502df5b55 (GEOMESA-3102 Fix removal of user data in FileSystemDataStore.createSchema (#2787))
=======
>>>>>>> 27eec0d076 (GEOMESA-3102 Fix removal of user data in FileSystemDataStore.createSchema (#2787))
=======
>>>>>>> afcf525d7d (GEOMESA-3113 Add system property to managing HBase deletes with visibilities (#2792))
=======
>>>>>>> f18f027f66 (GEOMESA-3102 Fix removal of user data in FileSystemDataStore.createSchema (#2787))
=======
>>>>>>> e11c16ba5d (GEOMESA-3102 Fix removal of user data in FileSystemDataStore.createSchema (#2787))
=======
>>>>>>> 00494e0bcf (GEOMESA-3113 Add system property to managing HBase deletes with visibilities (#2792))
=======
>>>>>>> 814abac33f (GEOMESA-3102 Fix removal of user data in FileSystemDataStore.createSchema (#2787))
=======
>>>>>>> 5742320897 (GEOMESA-3102 Fix removal of user data in FileSystemDataStore.createSchema (#2787))
=======
>>>>>>> c43c29e91c (GEOMESA-3113 Add system property to managing HBase deletes with visibilities (#2792))
=======
>>>>>>> 7f486255dd (GEOMESA-3102 Fix removal of user data in FileSystemDataStore.createSchema (#2787))
=======
>>>>>>> 78439fc2da (GEOMESA-3102 Fix removal of user data in FileSystemDataStore.createSchema (#2787))
=======
>>>>>>> 64c0e084b5 (GEOMESA-3113 Add system property to managing HBase deletes with visibilities (#2792))
=======
>>>>>>> 7e323ef52f (GEOMESA-3102 Fix removal of user data in FileSystemDataStore.createSchema (#2787))
=======
>>>>>>> 4b926d9ec6 (GEOMESA-3102 Fix removal of user data in FileSystemDataStore.createSchema (#2787))
=======
>>>>>>> cdb062d5e9 (GEOMESA-3113 Add system property to managing HBase deletes with visibilities (#2792))
=======
>>>>>>> e9395c1096 (GEOMESA-3102 Fix removal of user data in FileSystemDataStore.createSchema (#2787))
=======
>>>>>>> a738799968 (GEOMESA-3102 Fix removal of user data in FileSystemDataStore.createSchema (#2787))
=======
>>>>>>> 3d40465720 (GEOMESA-3113 Add system property to managing HBase deletes with visibilities (#2792))
=======
>>>>>>> 71adb695c5 (Merge branch 'feature/postgis-fixes')
=======
>>>>>>> 0a5b74c946 (Merge branch 'feature/postgis-fixes')
=======
>>>>>>> 49e9f5cb35 (GEOMESA-3102 Fix removal of user data in FileSystemDataStore.createSchema (#2787))
=======
>>>>>>> be1167e028 (GEOMESA-3113 Add system property to managing HBase deletes with visibilities (#2792))
=======
>>>>>>> 3867fd5b25 (GEOMESA-3113 Add system property to managing HBase deletes with visibilities (#2792))
=======
>>>>>>> 4d7289a2fe (GEOMESA-3102 Fix removal of user data in FileSystemDataStore.createSchema (#2787))
=======
>>>>>>> 54da398207 (GEOMESA-3113 Add system property to managing HBase deletes with visibilities (#2792))
=======
>>>>>>> 5af1e798d5 (GEOMESA-3113 Add system property to managing HBase deletes with visibilities (#2792))
=======
>>>>>>> f22bf41646 (GEOMESA-3102 Fix removal of user data in FileSystemDataStore.createSchema (#2787))
=======
>>>>>>> 8999b3f6b9 (GEOMESA-3113 Add system property to managing HBase deletes with visibilities (#2792))
=======
>>>>>>> ffcb7ff3ae (GEOMESA-3113 Add system property to managing HBase deletes with visibilities (#2792))
=======
>>>>>>> 4b0c56ce56 (GEOMESA-3102 Fix removal of user data in FileSystemDataStore.createSchema (#2787))
=======
>>>>>>> 3c53246c9a (GEOMESA-3113 Add system property to managing HBase deletes with visibilities (#2792))
=======
>>>>>>> 9ac1262e54 (GEOMESA-3113 Add system property to managing HBase deletes with visibilities (#2792))
=======
>>>>>>> 1a90b3062a (GEOMESA-3102 Fix removal of user data in FileSystemDataStore.createSchema (#2787))
=======
>>>>>>> fc179cb2d5 (GEOMESA-3113 Add system property to managing HBase deletes with visibilities (#2792))
=======
>>>>>>> 043e029470 (GEOMESA-3113 Add system property to managing HBase deletes with visibilities (#2792))
=======
>>>>>>> c8431d18e4 (GEOMESA-3102 Fix removal of user data in FileSystemDataStore.createSchema (#2787))
=======
>>>>>>> 9e74e1d9b4 (GEOMESA-3113 Add system property to managing HBase deletes with visibilities (#2792))
=======
>>>>>>> 9dd4a005eb (GEOMESA-3113 Add system property to managing HBase deletes with visibilities (#2792))
=======
>>>>>>> a30a0c1a2a (Merge branch 'feature/postgis-fixes')
=======
>>>>>>> 8ddbf27f07 (GEOMESA-3102 Fix removal of user data in FileSystemDataStore.createSchema (#2787))
=======
>>>>>>> f148adeccd (GEOMESA-3102 Fix removal of user data in FileSystemDataStore.createSchema (#2787))
=======
>>>>>>> b448819e24 (GEOMESA-3113 Add system property to managing HBase deletes with visibilities (#2792))
=======
>>>>>>> 735f1fc092 (GEOMESA-3102 Fix removal of user data in FileSystemDataStore.createSchema (#2787))
=======
>>>>>>> d71800c037 (GEOMESA-3102 Fix removal of user data in FileSystemDataStore.createSchema (#2787))
=======
>>>>>>> f68b76f4b8 (GEOMESA-3113 Add system property to managing HBase deletes with visibilities (#2792))
=======
>>>>>>> 6d4f75bcbb (GEOMESA-3102 Fix removal of user data in FileSystemDataStore.createSchema (#2787))
=======
>>>>>>> 4d1cac1d60 (GEOMESA-3102 Fix removal of user data in FileSystemDataStore.createSchema (#2787))
=======
>>>>>>> cb8df4c76b (GEOMESA-3113 Add system property to managing HBase deletes with visibilities (#2792))
=======
>>>>>>> ee2741585f (GEOMESA-3102 Fix removal of user data in FileSystemDataStore.createSchema (#2787))
=======
>>>>>>> 265d436467 (GEOMESA-3102 Fix removal of user data in FileSystemDataStore.createSchema (#2787))
=======
>>>>>>> 7ce9817488 (GEOMESA-3113 Add system property to managing HBase deletes with visibilities (#2792))
=======
>>>>>>> abe07966f6 (GEOMESA-3102 Fix removal of user data in FileSystemDataStore.createSchema (#2787))
=======
>>>>>>> 02465f5f58 (GEOMESA-3102 Fix removal of user data in FileSystemDataStore.createSchema (#2787))
=======
>>>>>>> 8eb59bcc3c (GEOMESA-3113 Add system property to managing HBase deletes with visibilities (#2792))
=======
>>>>>>> ffdb14e2a7 (GEOMESA-3102 Fix removal of user data in FileSystemDataStore.createSchema (#2787))
=======
>>>>>>> 6f245b0cc5 (GEOMESA-3102 Fix removal of user data in FileSystemDataStore.createSchema (#2787))
=======
>>>>>>> 07c698faf4 (GEOMESA-3113 Add system property to managing HBase deletes with visibilities (#2792))
=======
>>>>>>> ec6d06b576 (Merge branch 'feature/postgis-fixes')
=======
>>>>>>> cc93e0930d (Merge branch 'feature/postgis-fixes')
>>>>>>> bd17bd131e (GEOMESA-3102 Fix removal of user data in FileSystemDataStore.createSchema (#2787))
=======
>>>>>>> ca22354dd7 (GEOMESA-3113 Add system property to managing HBase deletes with visibilities (#2792))
=======
>>>>>>> c385f79943 (GEOMESA-3102 Fix removal of user data in FileSystemDataStore.createSchema (#2787))
=======
>>>>>>> 2d758409cd (GEOMESA-3113 Add system property to managing HBase deletes with visibilities (#2792))
=======
>>>>>>> 5c68fb7d18 (GEOMESA-3102 Fix removal of user data in FileSystemDataStore.createSchema (#2787))
=======
>>>>>>> 4a47c538bc (GEOMESA-3113 Add system property to managing HBase deletes with visibilities (#2792))
=======
>>>>>>> a358de35a8 (GEOMESA-3102 Fix removal of user data in FileSystemDataStore.createSchema (#2787))
=======
>>>>>>> 44b15e96d9 (GEOMESA-3113 Add system property to managing HBase deletes with visibilities (#2792))
=======
>>>>>>> db8d998aa2 (Merge branch 'feature/postgis-fixes')
=======
>>>>>>> 2b62bcaeb4 (GEOMESA-3102 Fix removal of user data in FileSystemDataStore.createSchema (#2787))
=======
>>>>>>> afc081190b (GEOMESA-3113 Add system property to managing HBase deletes with visibilities (#2792))
=======
>>>>>>> 75f3f455ec (GEOMESA-3102 Fix removal of user data in FileSystemDataStore.createSchema (#2787))
=======
>>>>>>> 7a3d004ad1 (GEOMESA-3113 Add system property to managing HBase deletes with visibilities (#2792))
=======
>>>>>>> 8871b2b4bc (GEOMESA-3102 Fix removal of user data in FileSystemDataStore.createSchema (#2787))
=======
>>>>>>> 91b0d6a888 (GEOMESA-3113 Add system property to managing HBase deletes with visibilities (#2792))
=======
>>>>>>> 4f922d74c9 (GEOMESA-3102 Fix removal of user data in FileSystemDataStore.createSchema (#2787))
=======
>>>>>>> 1b5719bd33 (GEOMESA-3113 Add system property to managing HBase deletes with visibilities (#2792))
=======
>>>>>>> 1b25d7ddb4 (Merge branch 'feature/postgis-fixes')
=======
>>>>>>> 3c4fc5a828 (GEOMESA-3113 Add system property to managing HBase deletes with visibilities (#2792))
=======
>>>>>>> 92feb5d273 (GEOMESA-3113 Add system property to managing HBase deletes with visibilities (#2792))
=======
=======
>>>>>>> 8a234c7900 (GEOMESA-3113 Add system property to managing HBase deletes with visibilities (#2792))
=======
>>>>>>> b51d3046a2 (GEOMESA-3113 Add system property to managing HBase deletes with visibilities (#2792))
=======
>>>>>>> c14e106409 (GEOMESA-3113 Add system property to managing HBase deletes with visibilities (#2792))
=======
>>>>>>> e944f1c88b (Merge branch 'feature/postgis-fixes')
=======
>>>>>>> 0e67f36558 (GEOMESA-3102 Fix removal of user data in FileSystemDataStore.createSchema (#2787))
=======
>>>>>>> 56f97cd271 (GEOMESA-3113 Add system property to managing HBase deletes with visibilities (#2792))
=======
>>>>>>> 89ea8190e2 (GEOMESA-3102 Fix removal of user data in FileSystemDataStore.createSchema (#2787))
=======
>>>>>>> 3226e92d8e (GEOMESA-3113 Add system property to managing HBase deletes with visibilities (#2792))
=======
>>>>>>> 1230d64006 (GEOMESA-3102 Fix removal of user data in FileSystemDataStore.createSchema (#2787))
=======
>>>>>>> cd5564bac6 (GEOMESA-3113 Add system property to managing HBase deletes with visibilities (#2792))
=======
>>>>>>> 038b4ca087 (GEOMESA-3102 Fix removal of user data in FileSystemDataStore.createSchema (#2787))
=======
>>>>>>> d774dc1d12 (GEOMESA-3113 Add system property to managing HBase deletes with visibilities (#2792))
=======
>>>>>>> e8b1c389e3 (GEOMESA-3102 Fix removal of user data in FileSystemDataStore.createSchema (#2787))
=======
>>>>>>> 6abf5007af (GEOMESA-3113 Add system property to managing HBase deletes with visibilities (#2792))
=======
>>>>>>> 2212530e6b (GEOMESA-3102 Fix removal of user data in FileSystemDataStore.createSchema (#2787))
=======
>>>>>>> d38e17d229 (GEOMESA-3113 Add system property to managing HBase deletes with visibilities (#2792))
=======
>>>>>>> 26e5afc4ea (Merge branch 'feature/postgis-fixes')
=======
>>>>>>> aeb7c3ed76 (GEOMESA-3102 Fix removal of user data in FileSystemDataStore.createSchema (#2787))
=======
>>>>>>> 42bfd74c63 (GEOMESA-3113 Add system property to managing HBase deletes with visibilities (#2792))
=======
>>>>>>> bce9dc3e0e (GEOMESA-3102 Fix removal of user data in FileSystemDataStore.createSchema (#2787))
=======
>>>>>>> 9c750992ef (GEOMESA-3113 Add system property to managing HBase deletes with visibilities (#2792))
=======
>>>>>>> 687ba5655c (GEOMESA-3102 Fix removal of user data in FileSystemDataStore.createSchema (#2787))
=======
>>>>>>> 97a911d79c (GEOMESA-3113 Add system property to managing HBase deletes with visibilities (#2792))
=======
>>>>>>> 33d2777a8a (GEOMESA-3102 Fix removal of user data in FileSystemDataStore.createSchema (#2787))
=======
>>>>>>> cc5f917a7c (GEOMESA-3113 Add system property to managing HBase deletes with visibilities (#2792))
=======
>>>>>>> a49ee0e00a (GEOMESA-3102 Fix removal of user data in FileSystemDataStore.createSchema (#2787))
=======
>>>>>>> 3adb85864f (GEOMESA-3113 Add system property to managing HBase deletes with visibilities (#2792))
=======
>>>>>>> a1198ce095 (GEOMESA-3102 Fix removal of user data in FileSystemDataStore.createSchema (#2787))
=======
>>>>>>> 260d67442f (GEOMESA-3113 Add system property to managing HBase deletes with visibilities (#2792))
=======
>>>>>>> c69897d7bd (Merge branch 'feature/postgis-fixes')
=======
>>>>>>> 113b056da (GEOMESA-3113 Add system property to managing HBase deletes with visibilities (#2792))
>>>>>>> 6f73f22005 (GEOMESA-3113 Add system property to managing HBase deletes with visibilities (#2792))
=======
>>>>>>> 58f72e76c (GEOMESA-3113 Add system property to managing HBase deletes with visibilities (#2792))
=======
>>>>>>> 4c9fb0f6e (GEOMESA-3113 Add system property to managing HBase deletes with visibilities (#2792))
=======
>>>>>>> 72415e208a (GEOMESA-3113 Add system property to managing HBase deletes with visibilities (#2792))
=======
>>>>>>> e8cc4971c6 (Merge branch 'feature/postgis-fixes')
=======
>>>>>>> 5521d97d99 (GEOMESA-3102 Fix removal of user data in FileSystemDataStore.createSchema (#2787))
=======
>>>>>>> 26fc359a06 (GEOMESA-3113 Add system property to managing HBase deletes with visibilities (#2792))
=======
>>>>>>> adf2ac19a8 (GEOMESA-3102 Fix removal of user data in FileSystemDataStore.createSchema (#2787))
=======
>>>>>>> e62505d539 (GEOMESA-3113 Add system property to managing HBase deletes with visibilities (#2792))
=======
=======
>>>>>>> 797b02396b (GEOMESA-3113 Add system property to managing HBase deletes with visibilities (#2792))
=======
>>>>>>> 3171e7407d (GEOMESA-3102 Fix removal of user data in FileSystemDataStore.createSchema (#2787))
=======
>>>>>>> 237494b1cc (GEOMESA-3113 Add system property to managing HBase deletes with visibilities (#2792))
=======
>>>>>>> 9ec1f049a9 (GEOMESA-3102 Fix removal of user data in FileSystemDataStore.createSchema (#2787))
=======
>>>>>>> a0d6da1831 (GEOMESA-3113 Add system property to managing HBase deletes with visibilities (#2792))
=======
>>>>>>> 1faf0d16f2 (GEOMESA-3102 Fix removal of user data in FileSystemDataStore.createSchema (#2787))
=======
>>>>>>> e5413df04f (GEOMESA-3113 Add system property to managing HBase deletes with visibilities (#2792))
=======
>>>>>>> cb6bda89b6 (Merge branch 'feature/postgis-fixes')
=======
>>>>>>> 8aa4f55ef6 (GEOMESA-3102 Fix removal of user data in FileSystemDataStore.createSchema (#2787))
=======
>>>>>>> 11addb1ce7 (GEOMESA-3113 Add system property to managing HBase deletes with visibilities (#2792))
=======
>>>>>>> 90d85d9b4b (GEOMESA-3102 Fix removal of user data in FileSystemDataStore.createSchema (#2787))
=======
>>>>>>> 1468e59829 (GEOMESA-3113 Add system property to managing HBase deletes with visibilities (#2792))
=======
>>>>>>> a618e2ba0a (GEOMESA-3102 Fix removal of user data in FileSystemDataStore.createSchema (#2787))
=======
>>>>>>> 65360f96a0 (GEOMESA-3113 Add system property to managing HBase deletes with visibilities (#2792))
=======
>>>>>>> 20dc993a76 (GEOMESA-3102 Fix removal of user data in FileSystemDataStore.createSchema (#2787))
=======
>>>>>>> bd6dd934cc (GEOMESA-3113 Add system property to managing HBase deletes with visibilities (#2792))
=======
>>>>>>> 495c744326 (GEOMESA-3102 Fix removal of user data in FileSystemDataStore.createSchema (#2787))
=======
>>>>>>> 49d3846b23 (GEOMESA-3113 Add system property to managing HBase deletes with visibilities (#2792))
=======
>>>>>>> 155d6a9469 (GEOMESA-3102 Fix removal of user data in FileSystemDataStore.createSchema (#2787))
=======
>>>>>>> e4ee051914 (GEOMESA-3113 Add system property to managing HBase deletes with visibilities (#2792))
=======
>>>>>>> 699117eca9 (Merge branch 'feature/postgis-fixes')
=======
>>>>>>> bd17bd131 (GEOMESA-3102 Fix removal of user data in FileSystemDataStore.createSchema (#2787))
>>>>>>> c555446b8b (GEOMESA-3102 Fix removal of user data in FileSystemDataStore.createSchema (#2787))
=======
>>>>>>> ca22354dd (GEOMESA-3113 Add system property to managing HBase deletes with visibilities (#2792))
=======
>>>>>>> c385f7994 (GEOMESA-3102 Fix removal of user data in FileSystemDataStore.createSchema (#2787))
=======
>>>>>>> 2d758409c (GEOMESA-3113 Add system property to managing HBase deletes with visibilities (#2792))
=======
>>>>>>> 5c68fb7d1 (GEOMESA-3102 Fix removal of user data in FileSystemDataStore.createSchema (#2787))
=======
>>>>>>> 4a47c538b (GEOMESA-3113 Add system property to managing HBase deletes with visibilities (#2792))
=======
>>>>>>> a358de35a (GEOMESA-3102 Fix removal of user data in FileSystemDataStore.createSchema (#2787))
=======
>>>>>>> 44b15e96d (GEOMESA-3113 Add system property to managing HBase deletes with visibilities (#2792))
=======
>>>>>>> db8d998aa (Merge branch 'feature/postgis-fixes')
=======
>>>>>>> 2b62bcaeb (GEOMESA-3102 Fix removal of user data in FileSystemDataStore.createSchema (#2787))
=======
>>>>>>> afc081190 (GEOMESA-3113 Add system property to managing HBase deletes with visibilities (#2792))
=======
>>>>>>> 75f3f455e (GEOMESA-3102 Fix removal of user data in FileSystemDataStore.createSchema (#2787))
=======
>>>>>>> 7a3d004ad (GEOMESA-3113 Add system property to managing HBase deletes with visibilities (#2792))
=======
>>>>>>> 8871b2b4b (GEOMESA-3102 Fix removal of user data in FileSystemDataStore.createSchema (#2787))
=======
>>>>>>> 91b0d6a88 (GEOMESA-3113 Add system property to managing HBase deletes with visibilities (#2792))
=======
>>>>>>> 4f922d74c (GEOMESA-3102 Fix removal of user data in FileSystemDataStore.createSchema (#2787))
=======
>>>>>>> 1b5719bd3 (GEOMESA-3113 Add system property to managing HBase deletes with visibilities (#2792))
=======
>>>>>>> 1b25d7ddb (Merge branch 'feature/postgis-fixes')
=======
>>>>>>> 526e71304c (GEOMESA-3102 Fix removal of user data in FileSystemDataStore.createSchema (#2787))
=======
>>>>>>> 074e4b10b9 (GEOMESA-3113 Add system property to managing HBase deletes with visibilities (#2792))
=======
>>>>>>> 9c809610d5 (GEOMESA-3102 Fix removal of user data in FileSystemDataStore.createSchema (#2787))
=======
>>>>>>> 0b22bfaa87 (GEOMESA-3113 Add system property to managing HBase deletes with visibilities (#2792))
=======
>>>>>>> 9e842c2021 (GEOMESA-3102 Fix removal of user data in FileSystemDataStore.createSchema (#2787))
=======
>>>>>>> 0f0dd6560e (GEOMESA-3113 Add system property to managing HBase deletes with visibilities (#2792))
=======
>>>>>>> 98ce8bad96 (GEOMESA-3102 Fix removal of user data in FileSystemDataStore.createSchema (#2787))
=======
>>>>>>> a8e7273bb0 (GEOMESA-3113 Add system property to managing HBase deletes with visibilities (#2792))
=======
>>>>>>> da00c7bd68 (Merge branch 'feature/postgis-fixes')
=======
<<<<<<< HEAD
>>>>>>> c385f79943 (GEOMESA-3102 Fix removal of user data in FileSystemDataStore.createSchema (#2787))
=======
>>>>>>> 2d758409cd (GEOMESA-3113 Add system property to managing HBase deletes with visibilities (#2792))
=======
>>>>>>> 5c68fb7d18 (GEOMESA-3102 Fix removal of user data in FileSystemDataStore.createSchema (#2787))
=======
>>>>>>> 4a47c538bc (GEOMESA-3113 Add system property to managing HBase deletes with visibilities (#2792))
=======
>>>>>>> a358de35a8 (GEOMESA-3102 Fix removal of user data in FileSystemDataStore.createSchema (#2787))
=======
>>>>>>> 44b15e96d9 (GEOMESA-3113 Add system property to managing HBase deletes with visibilities (#2792))
=======
>>>>>>> db8d998aa2 (Merge branch 'feature/postgis-fixes')
=======
>>>>>>> 2b62bcaeb4 (GEOMESA-3102 Fix removal of user data in FileSystemDataStore.createSchema (#2787))
=======
>>>>>>> afc081190b (GEOMESA-3113 Add system property to managing HBase deletes with visibilities (#2792))
=======
>>>>>>> 75f3f455ec (GEOMESA-3102 Fix removal of user data in FileSystemDataStore.createSchema (#2787))
=======
>>>>>>> 7a3d004ad1 (GEOMESA-3113 Add system property to managing HBase deletes with visibilities (#2792))
=======
>>>>>>> 8871b2b4bc (GEOMESA-3102 Fix removal of user data in FileSystemDataStore.createSchema (#2787))
=======
>>>>>>> 91b0d6a888 (GEOMESA-3113 Add system property to managing HBase deletes with visibilities (#2792))
=======
>>>>>>> 4f922d74c9 (GEOMESA-3102 Fix removal of user data in FileSystemDataStore.createSchema (#2787))
=======
>>>>>>> 1b5719bd33 (GEOMESA-3113 Add system property to managing HBase deletes with visibilities (#2792))
=======
>>>>>>> 1b25d7ddb4 (Merge branch 'feature/postgis-fixes')
=======
>>>>>>> 3c4fc5a828 (GEOMESA-3113 Add system property to managing HBase deletes with visibilities (#2792))
=======
>>>>>>> 92feb5d273 (GEOMESA-3113 Add system property to managing HBase deletes with visibilities (#2792))
=======
=======
>>>>>>> 8a234c7900 (GEOMESA-3113 Add system property to managing HBase deletes with visibilities (#2792))
=======
>>>>>>> b51d3046a2 (GEOMESA-3113 Add system property to managing HBase deletes with visibilities (#2792))
=======
>>>>>>> c14e106409 (GEOMESA-3113 Add system property to managing HBase deletes with visibilities (#2792))
=======
>>>>>>> e944f1c88b (Merge branch 'feature/postgis-fixes')
=======
>>>>>>> 0e67f36558 (GEOMESA-3102 Fix removal of user data in FileSystemDataStore.createSchema (#2787))
=======
>>>>>>> 56f97cd271 (GEOMESA-3113 Add system property to managing HBase deletes with visibilities (#2792))
=======
>>>>>>> 89ea8190e2 (GEOMESA-3102 Fix removal of user data in FileSystemDataStore.createSchema (#2787))
=======
>>>>>>> 3226e92d8e (GEOMESA-3113 Add system property to managing HBase deletes with visibilities (#2792))
=======
>>>>>>> 1230d64006 (GEOMESA-3102 Fix removal of user data in FileSystemDataStore.createSchema (#2787))
=======
>>>>>>> cd5564bac6 (GEOMESA-3113 Add system property to managing HBase deletes with visibilities (#2792))
=======
>>>>>>> 038b4ca087 (GEOMESA-3102 Fix removal of user data in FileSystemDataStore.createSchema (#2787))
=======
>>>>>>> d774dc1d12 (GEOMESA-3113 Add system property to managing HBase deletes with visibilities (#2792))
=======
>>>>>>> e8b1c389e3 (GEOMESA-3102 Fix removal of user data in FileSystemDataStore.createSchema (#2787))
=======
>>>>>>> 6abf5007af (GEOMESA-3113 Add system property to managing HBase deletes with visibilities (#2792))
=======
>>>>>>> 2212530e6b (GEOMESA-3102 Fix removal of user data in FileSystemDataStore.createSchema (#2787))
=======
>>>>>>> d38e17d229 (GEOMESA-3113 Add system property to managing HBase deletes with visibilities (#2792))
=======
>>>>>>> 26e5afc4ea (Merge branch 'feature/postgis-fixes')
=======
>>>>>>> aeb7c3ed76 (GEOMESA-3102 Fix removal of user data in FileSystemDataStore.createSchema (#2787))
=======
>>>>>>> 42bfd74c63 (GEOMESA-3113 Add system property to managing HBase deletes with visibilities (#2792))
=======
>>>>>>> bce9dc3e0e (GEOMESA-3102 Fix removal of user data in FileSystemDataStore.createSchema (#2787))
=======
>>>>>>> 9c750992ef (GEOMESA-3113 Add system property to managing HBase deletes with visibilities (#2792))
=======
>>>>>>> 687ba5655c (GEOMESA-3102 Fix removal of user data in FileSystemDataStore.createSchema (#2787))
=======
>>>>>>> 97a911d79c (GEOMESA-3113 Add system property to managing HBase deletes with visibilities (#2792))
=======
>>>>>>> 33d2777a8a (GEOMESA-3102 Fix removal of user data in FileSystemDataStore.createSchema (#2787))
=======
>>>>>>> cc5f917a7c (GEOMESA-3113 Add system property to managing HBase deletes with visibilities (#2792))
=======
>>>>>>> a49ee0e00a (GEOMESA-3102 Fix removal of user data in FileSystemDataStore.createSchema (#2787))
=======
>>>>>>> 3adb85864f (GEOMESA-3113 Add system property to managing HBase deletes with visibilities (#2792))
=======
>>>>>>> a1198ce095 (GEOMESA-3102 Fix removal of user data in FileSystemDataStore.createSchema (#2787))
=======
>>>>>>> 260d67442f (GEOMESA-3113 Add system property to managing HBase deletes with visibilities (#2792))
=======
>>>>>>> c69897d7bd (Merge branch 'feature/postgis-fixes')
=======
>>>>>>> 113b056da (GEOMESA-3113 Add system property to managing HBase deletes with visibilities (#2792))
>>>>>>> 6f73f22005 (GEOMESA-3113 Add system property to managing HBase deletes with visibilities (#2792))
=======
>>>>>>> 58f72e76c (GEOMESA-3113 Add system property to managing HBase deletes with visibilities (#2792))
=======
>>>>>>> 4c9fb0f6e (GEOMESA-3113 Add system property to managing HBase deletes with visibilities (#2792))
=======
>>>>>>> 72415e208a (GEOMESA-3113 Add system property to managing HBase deletes with visibilities (#2792))
=======
>>>>>>> e8cc4971c6 (Merge branch 'feature/postgis-fixes')
=======
>>>>>>> 5521d97d99 (GEOMESA-3102 Fix removal of user data in FileSystemDataStore.createSchema (#2787))
=======
>>>>>>> 26fc359a06 (GEOMESA-3113 Add system property to managing HBase deletes with visibilities (#2792))
=======
>>>>>>> adf2ac19a8 (GEOMESA-3102 Fix removal of user data in FileSystemDataStore.createSchema (#2787))
=======
>>>>>>> e62505d539 (GEOMESA-3113 Add system property to managing HBase deletes with visibilities (#2792))
=======
=======
>>>>>>> 797b02396b (GEOMESA-3113 Add system property to managing HBase deletes with visibilities (#2792))
=======
>>>>>>> 3171e7407d (GEOMESA-3102 Fix removal of user data in FileSystemDataStore.createSchema (#2787))
=======
>>>>>>> 237494b1cc (GEOMESA-3113 Add system property to managing HBase deletes with visibilities (#2792))
=======
>>>>>>> 9ec1f049a9 (GEOMESA-3102 Fix removal of user data in FileSystemDataStore.createSchema (#2787))
=======
>>>>>>> a0d6da1831 (GEOMESA-3113 Add system property to managing HBase deletes with visibilities (#2792))
=======
>>>>>>> 1faf0d16f2 (GEOMESA-3102 Fix removal of user data in FileSystemDataStore.createSchema (#2787))
=======
>>>>>>> e5413df04f (GEOMESA-3113 Add system property to managing HBase deletes with visibilities (#2792))
=======
>>>>>>> cb6bda89b6 (Merge branch 'feature/postgis-fixes')
=======
>>>>>>> 8aa4f55ef6 (GEOMESA-3102 Fix removal of user data in FileSystemDataStore.createSchema (#2787))
=======
>>>>>>> 11addb1ce7 (GEOMESA-3113 Add system property to managing HBase deletes with visibilities (#2792))
=======
>>>>>>> 90d85d9b4b (GEOMESA-3102 Fix removal of user data in FileSystemDataStore.createSchema (#2787))
=======
>>>>>>> 1468e59829 (GEOMESA-3113 Add system property to managing HBase deletes with visibilities (#2792))
=======
>>>>>>> a618e2ba0a (GEOMESA-3102 Fix removal of user data in FileSystemDataStore.createSchema (#2787))
=======
>>>>>>> 65360f96a0 (GEOMESA-3113 Add system property to managing HBase deletes with visibilities (#2792))
=======
>>>>>>> 20dc993a76 (GEOMESA-3102 Fix removal of user data in FileSystemDataStore.createSchema (#2787))
=======
>>>>>>> bd6dd934cc (GEOMESA-3113 Add system property to managing HBase deletes with visibilities (#2792))
=======
>>>>>>> 495c744326 (GEOMESA-3102 Fix removal of user data in FileSystemDataStore.createSchema (#2787))
=======
>>>>>>> 49d3846b23 (GEOMESA-3113 Add system property to managing HBase deletes with visibilities (#2792))
=======
>>>>>>> 155d6a9469 (GEOMESA-3102 Fix removal of user data in FileSystemDataStore.createSchema (#2787))
=======
>>>>>>> e4ee051914 (GEOMESA-3113 Add system property to managing HBase deletes with visibilities (#2792))
=======
>>>>>>> 699117eca9 (Merge branch 'feature/postgis-fixes')
=======
>>>>>>> bd17bd131 (GEOMESA-3102 Fix removal of user data in FileSystemDataStore.createSchema (#2787))
>>>>>>> c555446b8b (GEOMESA-3102 Fix removal of user data in FileSystemDataStore.createSchema (#2787))
=======
>>>>>>> ca22354dd (GEOMESA-3113 Add system property to managing HBase deletes with visibilities (#2792))
=======
>>>>>>> c385f7994 (GEOMESA-3102 Fix removal of user data in FileSystemDataStore.createSchema (#2787))
=======
>>>>>>> 2d758409c (GEOMESA-3113 Add system property to managing HBase deletes with visibilities (#2792))
=======
>>>>>>> 5c68fb7d1 (GEOMESA-3102 Fix removal of user data in FileSystemDataStore.createSchema (#2787))
=======
>>>>>>> 4a47c538b (GEOMESA-3113 Add system property to managing HBase deletes with visibilities (#2792))
=======
>>>>>>> a358de35a (GEOMESA-3102 Fix removal of user data in FileSystemDataStore.createSchema (#2787))
=======
>>>>>>> 44b15e96d (GEOMESA-3113 Add system property to managing HBase deletes with visibilities (#2792))
=======
>>>>>>> db8d998aa (Merge branch 'feature/postgis-fixes')
=======
>>>>>>> 2b62bcaeb (GEOMESA-3102 Fix removal of user data in FileSystemDataStore.createSchema (#2787))
=======
>>>>>>> afc081190 (GEOMESA-3113 Add system property to managing HBase deletes with visibilities (#2792))
=======
>>>>>>> 75f3f455e (GEOMESA-3102 Fix removal of user data in FileSystemDataStore.createSchema (#2787))
=======
>>>>>>> 7a3d004ad (GEOMESA-3113 Add system property to managing HBase deletes with visibilities (#2792))
=======
>>>>>>> 8871b2b4b (GEOMESA-3102 Fix removal of user data in FileSystemDataStore.createSchema (#2787))
=======
>>>>>>> 91b0d6a88 (GEOMESA-3113 Add system property to managing HBase deletes with visibilities (#2792))
=======
>>>>>>> 4f922d74c (GEOMESA-3102 Fix removal of user data in FileSystemDataStore.createSchema (#2787))
=======
>>>>>>> 1b5719bd3 (GEOMESA-3113 Add system property to managing HBase deletes with visibilities (#2792))
=======
>>>>>>> 1b25d7ddb (Merge branch 'feature/postgis-fixes')
=======
>>>>>>> 526e71304c (GEOMESA-3102 Fix removal of user data in FileSystemDataStore.createSchema (#2787))
=======
>>>>>>> 074e4b10b9 (GEOMESA-3113 Add system property to managing HBase deletes with visibilities (#2792))
=======
>>>>>>> 9c809610d5 (GEOMESA-3102 Fix removal of user data in FileSystemDataStore.createSchema (#2787))
=======
>>>>>>> 0b22bfaa87 (GEOMESA-3113 Add system property to managing HBase deletes with visibilities (#2792))
=======
>>>>>>> 9e842c2021 (GEOMESA-3102 Fix removal of user data in FileSystemDataStore.createSchema (#2787))
=======
>>>>>>> 0f0dd6560e (GEOMESA-3113 Add system property to managing HBase deletes with visibilities (#2792))
=======
>>>>>>> 98ce8bad96 (GEOMESA-3102 Fix removal of user data in FileSystemDataStore.createSchema (#2787))
=======
>>>>>>> a8e7273bb0 (GEOMESA-3113 Add system property to managing HBase deletes with visibilities (#2792))
=======
>>>>>>> da00c7bd68 (Merge branch 'feature/postgis-fixes')
=======
>>>>>>> 39d46533eb (GEOMESA-3102 Fix removal of user data in FileSystemDataStore.createSchema (#2787))
=======
>>>>>>> 9da518fc54 (GEOMESA-3113 Add system property to managing HBase deletes with visibilities (#2792))
=======
>>>>>>> b52e5bb454 (GEOMESA-3102 Fix removal of user data in FileSystemDataStore.createSchema (#2787))
=======
>>>>>>> 4bd5ce922d (GEOMESA-3113 Add system property to managing HBase deletes with visibilities (#2792))
=======
>>>>>>> cfd537e7af (GEOMESA-3102 Fix removal of user data in FileSystemDataStore.createSchema (#2787))
=======
>>>>>>> e17f495391 (GEOMESA-3113 Add system property to managing HBase deletes with visibilities (#2792))
=======
>>>>>>> 54709e3b06 (GEOMESA-3102 Fix removal of user data in FileSystemDataStore.createSchema (#2787))
=======
>>>>>>> d857d34521 (GEOMESA-3113 Add system property to managing HBase deletes with visibilities (#2792))
=======
>>>>>>> 34472778d3 (Merge branch 'feature/postgis-fixes')
=======
>>>>>>> 4100fa1ce8 (GEOMESA-3102 Fix removal of user data in FileSystemDataStore.createSchema (#2787))
=======
>>>>>>> b515d530a4 (GEOMESA-3113 Add system property to managing HBase deletes with visibilities (#2792))
=======
>>>>>>> 7ee0f1d494 (GEOMESA-3102 Fix removal of user data in FileSystemDataStore.createSchema (#2787))
=======
>>>>>>> 02fea6930b (GEOMESA-3113 Add system property to managing HBase deletes with visibilities (#2792))
=======
=======
>>>>>>> bd17bd131e (GEOMESA-3102 Fix removal of user data in FileSystemDataStore.createSchema (#2787))
>>>>>>> a2a804586c (GEOMESA-3102 Fix removal of user data in FileSystemDataStore.createSchema (#2787))
=======
=======
>>>>>>> a773c6ef65 (GEOMESA-3113 Add system property to managing HBase deletes with visibilities (#2792))
<<<<<<< HEAD
>>>>>>> c385f79943 (GEOMESA-3102 Fix removal of user data in FileSystemDataStore.createSchema (#2787))
=======
>>>>>>> 2d758409cd (GEOMESA-3113 Add system property to managing HBase deletes with visibilities (#2792))
=======
>>>>>>> 5c68fb7d18 (GEOMESA-3102 Fix removal of user data in FileSystemDataStore.createSchema (#2787))
=======
>>>>>>> 4a47c538bc (GEOMESA-3113 Add system property to managing HBase deletes with visibilities (#2792))
=======
>>>>>>> a358de35a8 (GEOMESA-3102 Fix removal of user data in FileSystemDataStore.createSchema (#2787))
=======
>>>>>>> 44b15e96d9 (GEOMESA-3113 Add system property to managing HBase deletes with visibilities (#2792))
=======
>>>>>>> db8d998aa2 (Merge branch 'feature/postgis-fixes')
=======
>>>>>>> 2b62bcaeb4 (GEOMESA-3102 Fix removal of user data in FileSystemDataStore.createSchema (#2787))
=======
>>>>>>> afc081190b (GEOMESA-3113 Add system property to managing HBase deletes with visibilities (#2792))
=======
>>>>>>> 75f3f455ec (GEOMESA-3102 Fix removal of user data in FileSystemDataStore.createSchema (#2787))
=======
>>>>>>> 7a3d004ad1 (GEOMESA-3113 Add system property to managing HBase deletes with visibilities (#2792))
=======
>>>>>>> 8871b2b4bc (GEOMESA-3102 Fix removal of user data in FileSystemDataStore.createSchema (#2787))
=======
>>>>>>> 91b0d6a888 (GEOMESA-3113 Add system property to managing HBase deletes with visibilities (#2792))
=======
>>>>>>> 4f922d74c9 (GEOMESA-3102 Fix removal of user data in FileSystemDataStore.createSchema (#2787))
=======
>>>>>>> 1b5719bd33 (GEOMESA-3113 Add system property to managing HBase deletes with visibilities (#2792))
=======
>>>>>>> 1b25d7ddb4 (Merge branch 'feature/postgis-fixes')
=======
>>>>>>> 3c4fc5a828 (GEOMESA-3113 Add system property to managing HBase deletes with visibilities (#2792))
=======
>>>>>>> 92feb5d273 (GEOMESA-3113 Add system property to managing HBase deletes with visibilities (#2792))
=======
=======
>>>>>>> 8a234c7900 (GEOMESA-3113 Add system property to managing HBase deletes with visibilities (#2792))
=======
>>>>>>> b51d3046a2 (GEOMESA-3113 Add system property to managing HBase deletes with visibilities (#2792))
=======
>>>>>>> c14e106409 (GEOMESA-3113 Add system property to managing HBase deletes with visibilities (#2792))
=======
>>>>>>> e944f1c88b (Merge branch 'feature/postgis-fixes')
=======
>>>>>>> 0e67f36558 (GEOMESA-3102 Fix removal of user data in FileSystemDataStore.createSchema (#2787))
=======
>>>>>>> 56f97cd271 (GEOMESA-3113 Add system property to managing HBase deletes with visibilities (#2792))
=======
>>>>>>> 89ea8190e2 (GEOMESA-3102 Fix removal of user data in FileSystemDataStore.createSchema (#2787))
=======
>>>>>>> 3226e92d8e (GEOMESA-3113 Add system property to managing HBase deletes with visibilities (#2792))
=======
>>>>>>> 1230d64006 (GEOMESA-3102 Fix removal of user data in FileSystemDataStore.createSchema (#2787))
=======
>>>>>>> cd5564bac6 (GEOMESA-3113 Add system property to managing HBase deletes with visibilities (#2792))
=======
>>>>>>> 038b4ca087 (GEOMESA-3102 Fix removal of user data in FileSystemDataStore.createSchema (#2787))
=======
>>>>>>> d774dc1d12 (GEOMESA-3113 Add system property to managing HBase deletes with visibilities (#2792))
=======
>>>>>>> e8b1c389e3 (GEOMESA-3102 Fix removal of user data in FileSystemDataStore.createSchema (#2787))
=======
>>>>>>> 6abf5007af (GEOMESA-3113 Add system property to managing HBase deletes with visibilities (#2792))
=======
>>>>>>> 2212530e6b (GEOMESA-3102 Fix removal of user data in FileSystemDataStore.createSchema (#2787))
=======
>>>>>>> d38e17d229 (GEOMESA-3113 Add system property to managing HBase deletes with visibilities (#2792))
=======
>>>>>>> 26e5afc4ea (Merge branch 'feature/postgis-fixes')
=======
>>>>>>> aeb7c3ed76 (GEOMESA-3102 Fix removal of user data in FileSystemDataStore.createSchema (#2787))
=======
>>>>>>> 42bfd74c63 (GEOMESA-3113 Add system property to managing HBase deletes with visibilities (#2792))
=======
>>>>>>> bce9dc3e0e (GEOMESA-3102 Fix removal of user data in FileSystemDataStore.createSchema (#2787))
=======
>>>>>>> 9c750992ef (GEOMESA-3113 Add system property to managing HBase deletes with visibilities (#2792))
=======
>>>>>>> 687ba5655c (GEOMESA-3102 Fix removal of user data in FileSystemDataStore.createSchema (#2787))
=======
>>>>>>> 97a911d79c (GEOMESA-3113 Add system property to managing HBase deletes with visibilities (#2792))
=======
>>>>>>> 33d2777a8a (GEOMESA-3102 Fix removal of user data in FileSystemDataStore.createSchema (#2787))
=======
>>>>>>> cc5f917a7c (GEOMESA-3113 Add system property to managing HBase deletes with visibilities (#2792))
=======
>>>>>>> a49ee0e00a (GEOMESA-3102 Fix removal of user data in FileSystemDataStore.createSchema (#2787))
=======
>>>>>>> 3adb85864f (GEOMESA-3113 Add system property to managing HBase deletes with visibilities (#2792))
=======
>>>>>>> a1198ce095 (GEOMESA-3102 Fix removal of user data in FileSystemDataStore.createSchema (#2787))
=======
>>>>>>> 260d67442f (GEOMESA-3113 Add system property to managing HBase deletes with visibilities (#2792))
=======
>>>>>>> c69897d7bd (Merge branch 'feature/postgis-fixes')
=======
>>>>>>> 113b056da (GEOMESA-3113 Add system property to managing HBase deletes with visibilities (#2792))
>>>>>>> 6f73f22005 (GEOMESA-3113 Add system property to managing HBase deletes with visibilities (#2792))
=======
>>>>>>> 58f72e76c (GEOMESA-3113 Add system property to managing HBase deletes with visibilities (#2792))
=======
>>>>>>> 4c9fb0f6e (GEOMESA-3113 Add system property to managing HBase deletes with visibilities (#2792))
=======
>>>>>>> 72415e208a (GEOMESA-3113 Add system property to managing HBase deletes with visibilities (#2792))
=======
>>>>>>> e8cc4971c6 (Merge branch 'feature/postgis-fixes')
=======
>>>>>>> 5521d97d99 (GEOMESA-3102 Fix removal of user data in FileSystemDataStore.createSchema (#2787))
=======
>>>>>>> 26fc359a06 (GEOMESA-3113 Add system property to managing HBase deletes with visibilities (#2792))
=======
>>>>>>> adf2ac19a8 (GEOMESA-3102 Fix removal of user data in FileSystemDataStore.createSchema (#2787))
=======
>>>>>>> e62505d539 (GEOMESA-3113 Add system property to managing HBase deletes with visibilities (#2792))
=======
=======
>>>>>>> 797b02396b (GEOMESA-3113 Add system property to managing HBase deletes with visibilities (#2792))
=======
>>>>>>> 3171e7407d (GEOMESA-3102 Fix removal of user data in FileSystemDataStore.createSchema (#2787))
=======
>>>>>>> 237494b1cc (GEOMESA-3113 Add system property to managing HBase deletes with visibilities (#2792))
=======
>>>>>>> 9ec1f049a9 (GEOMESA-3102 Fix removal of user data in FileSystemDataStore.createSchema (#2787))
=======
>>>>>>> a0d6da1831 (GEOMESA-3113 Add system property to managing HBase deletes with visibilities (#2792))
=======
>>>>>>> 1faf0d16f2 (GEOMESA-3102 Fix removal of user data in FileSystemDataStore.createSchema (#2787))
=======
>>>>>>> e5413df04f (GEOMESA-3113 Add system property to managing HBase deletes with visibilities (#2792))
=======
>>>>>>> cb6bda89b6 (Merge branch 'feature/postgis-fixes')
=======
>>>>>>> 8aa4f55ef6 (GEOMESA-3102 Fix removal of user data in FileSystemDataStore.createSchema (#2787))
=======
>>>>>>> 11addb1ce7 (GEOMESA-3113 Add system property to managing HBase deletes with visibilities (#2792))
=======
>>>>>>> 90d85d9b4b (GEOMESA-3102 Fix removal of user data in FileSystemDataStore.createSchema (#2787))
=======
>>>>>>> 1468e59829 (GEOMESA-3113 Add system property to managing HBase deletes with visibilities (#2792))
=======
>>>>>>> a618e2ba0a (GEOMESA-3102 Fix removal of user data in FileSystemDataStore.createSchema (#2787))
=======
>>>>>>> 65360f96a0 (GEOMESA-3113 Add system property to managing HBase deletes with visibilities (#2792))
=======
>>>>>>> 20dc993a76 (GEOMESA-3102 Fix removal of user data in FileSystemDataStore.createSchema (#2787))
=======
>>>>>>> bd6dd934cc (GEOMESA-3113 Add system property to managing HBase deletes with visibilities (#2792))
=======
>>>>>>> 495c744326 (GEOMESA-3102 Fix removal of user data in FileSystemDataStore.createSchema (#2787))
=======
>>>>>>> 49d3846b23 (GEOMESA-3113 Add system property to managing HBase deletes with visibilities (#2792))
=======
>>>>>>> 155d6a9469 (GEOMESA-3102 Fix removal of user data in FileSystemDataStore.createSchema (#2787))
=======
>>>>>>> e4ee051914 (GEOMESA-3113 Add system property to managing HBase deletes with visibilities (#2792))
=======
>>>>>>> 699117eca9 (Merge branch 'feature/postgis-fixes')
=======
>>>>>>> bd17bd131 (GEOMESA-3102 Fix removal of user data in FileSystemDataStore.createSchema (#2787))
>>>>>>> c555446b8b (GEOMESA-3102 Fix removal of user data in FileSystemDataStore.createSchema (#2787))
=======
>>>>>>> ca22354dd (GEOMESA-3113 Add system property to managing HBase deletes with visibilities (#2792))
=======
>>>>>>> c385f7994 (GEOMESA-3102 Fix removal of user data in FileSystemDataStore.createSchema (#2787))
=======
>>>>>>> 2d758409c (GEOMESA-3113 Add system property to managing HBase deletes with visibilities (#2792))
=======
>>>>>>> 5c68fb7d1 (GEOMESA-3102 Fix removal of user data in FileSystemDataStore.createSchema (#2787))
=======
>>>>>>> 4a47c538b (GEOMESA-3113 Add system property to managing HBase deletes with visibilities (#2792))
=======
>>>>>>> a358de35a (GEOMESA-3102 Fix removal of user data in FileSystemDataStore.createSchema (#2787))
=======
>>>>>>> 44b15e96d (GEOMESA-3113 Add system property to managing HBase deletes with visibilities (#2792))
=======
>>>>>>> db8d998aa (Merge branch 'feature/postgis-fixes')
=======
>>>>>>> 2b62bcaeb (GEOMESA-3102 Fix removal of user data in FileSystemDataStore.createSchema (#2787))
=======
>>>>>>> afc081190 (GEOMESA-3113 Add system property to managing HBase deletes with visibilities (#2792))
=======
>>>>>>> 75f3f455e (GEOMESA-3102 Fix removal of user data in FileSystemDataStore.createSchema (#2787))
=======
>>>>>>> 7a3d004ad (GEOMESA-3113 Add system property to managing HBase deletes with visibilities (#2792))
=======
>>>>>>> 8871b2b4b (GEOMESA-3102 Fix removal of user data in FileSystemDataStore.createSchema (#2787))
=======
>>>>>>> 91b0d6a88 (GEOMESA-3113 Add system property to managing HBase deletes with visibilities (#2792))
=======
>>>>>>> 4f922d74c (GEOMESA-3102 Fix removal of user data in FileSystemDataStore.createSchema (#2787))
=======
>>>>>>> 1b5719bd3 (GEOMESA-3113 Add system property to managing HBase deletes with visibilities (#2792))
=======
>>>>>>> 1b25d7ddb (Merge branch 'feature/postgis-fixes')
=======
>>>>>>> 526e71304c (GEOMESA-3102 Fix removal of user data in FileSystemDataStore.createSchema (#2787))
=======
>>>>>>> 074e4b10b9 (GEOMESA-3113 Add system property to managing HBase deletes with visibilities (#2792))
=======
>>>>>>> 9c809610d5 (GEOMESA-3102 Fix removal of user data in FileSystemDataStore.createSchema (#2787))
=======
>>>>>>> 0b22bfaa87 (GEOMESA-3113 Add system property to managing HBase deletes with visibilities (#2792))
=======
>>>>>>> 9e842c2021 (GEOMESA-3102 Fix removal of user data in FileSystemDataStore.createSchema (#2787))
=======
>>>>>>> 0f0dd6560e (GEOMESA-3113 Add system property to managing HBase deletes with visibilities (#2792))
=======
>>>>>>> 98ce8bad96 (GEOMESA-3102 Fix removal of user data in FileSystemDataStore.createSchema (#2787))
=======
>>>>>>> a8e7273bb0 (GEOMESA-3113 Add system property to managing HBase deletes with visibilities (#2792))
=======
>>>>>>> da00c7bd68 (Merge branch 'feature/postgis-fixes')
=======
<<<<<<< HEAD
>>>>>>> c385f79943 (GEOMESA-3102 Fix removal of user data in FileSystemDataStore.createSchema (#2787))
=======
>>>>>>> 2d758409cd (GEOMESA-3113 Add system property to managing HBase deletes with visibilities (#2792))
=======
>>>>>>> 5c68fb7d18 (GEOMESA-3102 Fix removal of user data in FileSystemDataStore.createSchema (#2787))
=======
>>>>>>> 4a47c538bc (GEOMESA-3113 Add system property to managing HBase deletes with visibilities (#2792))
=======
>>>>>>> a358de35a8 (GEOMESA-3102 Fix removal of user data in FileSystemDataStore.createSchema (#2787))
=======
>>>>>>> 44b15e96d9 (GEOMESA-3113 Add system property to managing HBase deletes with visibilities (#2792))
=======
>>>>>>> db8d998aa2 (Merge branch 'feature/postgis-fixes')
=======
>>>>>>> 2b62bcaeb4 (GEOMESA-3102 Fix removal of user data in FileSystemDataStore.createSchema (#2787))
=======
>>>>>>> afc081190b (GEOMESA-3113 Add system property to managing HBase deletes with visibilities (#2792))
=======
>>>>>>> 75f3f455ec (GEOMESA-3102 Fix removal of user data in FileSystemDataStore.createSchema (#2787))
=======
>>>>>>> 7a3d004ad1 (GEOMESA-3113 Add system property to managing HBase deletes with visibilities (#2792))
=======
>>>>>>> 8871b2b4bc (GEOMESA-3102 Fix removal of user data in FileSystemDataStore.createSchema (#2787))
=======
>>>>>>> 91b0d6a888 (GEOMESA-3113 Add system property to managing HBase deletes with visibilities (#2792))
=======
>>>>>>> 4f922d74c9 (GEOMESA-3102 Fix removal of user data in FileSystemDataStore.createSchema (#2787))
=======
>>>>>>> 1b5719bd33 (GEOMESA-3113 Add system property to managing HBase deletes with visibilities (#2792))
=======
>>>>>>> 1b25d7ddb4 (Merge branch 'feature/postgis-fixes')
=======
>>>>>>> 3c4fc5a828 (GEOMESA-3113 Add system property to managing HBase deletes with visibilities (#2792))
=======
>>>>>>> 92feb5d273 (GEOMESA-3113 Add system property to managing HBase deletes with visibilities (#2792))
=======
=======
>>>>>>> 8a234c7900 (GEOMESA-3113 Add system property to managing HBase deletes with visibilities (#2792))
=======
>>>>>>> b51d3046a2 (GEOMESA-3113 Add system property to managing HBase deletes with visibilities (#2792))
=======
>>>>>>> c14e106409 (GEOMESA-3113 Add system property to managing HBase deletes with visibilities (#2792))
=======
>>>>>>> e944f1c88b (Merge branch 'feature/postgis-fixes')
=======
>>>>>>> 0e67f36558 (GEOMESA-3102 Fix removal of user data in FileSystemDataStore.createSchema (#2787))
=======
>>>>>>> 56f97cd271 (GEOMESA-3113 Add system property to managing HBase deletes with visibilities (#2792))
=======
>>>>>>> 89ea8190e2 (GEOMESA-3102 Fix removal of user data in FileSystemDataStore.createSchema (#2787))
=======
>>>>>>> 3226e92d8e (GEOMESA-3113 Add system property to managing HBase deletes with visibilities (#2792))
=======
>>>>>>> 1230d64006 (GEOMESA-3102 Fix removal of user data in FileSystemDataStore.createSchema (#2787))
=======
>>>>>>> cd5564bac6 (GEOMESA-3113 Add system property to managing HBase deletes with visibilities (#2792))
=======
>>>>>>> 038b4ca087 (GEOMESA-3102 Fix removal of user data in FileSystemDataStore.createSchema (#2787))
=======
>>>>>>> d774dc1d12 (GEOMESA-3113 Add system property to managing HBase deletes with visibilities (#2792))
=======
>>>>>>> e8b1c389e3 (GEOMESA-3102 Fix removal of user data in FileSystemDataStore.createSchema (#2787))
=======
>>>>>>> 6abf5007af (GEOMESA-3113 Add system property to managing HBase deletes with visibilities (#2792))
=======
>>>>>>> 2212530e6b (GEOMESA-3102 Fix removal of user data in FileSystemDataStore.createSchema (#2787))
=======
>>>>>>> d38e17d229 (GEOMESA-3113 Add system property to managing HBase deletes with visibilities (#2792))
=======
>>>>>>> 26e5afc4ea (Merge branch 'feature/postgis-fixes')
=======
>>>>>>> aeb7c3ed76 (GEOMESA-3102 Fix removal of user data in FileSystemDataStore.createSchema (#2787))
=======
>>>>>>> 42bfd74c63 (GEOMESA-3113 Add system property to managing HBase deletes with visibilities (#2792))
=======
>>>>>>> bce9dc3e0e (GEOMESA-3102 Fix removal of user data in FileSystemDataStore.createSchema (#2787))
=======
>>>>>>> 9c750992ef (GEOMESA-3113 Add system property to managing HBase deletes with visibilities (#2792))
=======
>>>>>>> 687ba5655c (GEOMESA-3102 Fix removal of user data in FileSystemDataStore.createSchema (#2787))
=======
>>>>>>> 97a911d79c (GEOMESA-3113 Add system property to managing HBase deletes with visibilities (#2792))
=======
>>>>>>> 33d2777a8a (GEOMESA-3102 Fix removal of user data in FileSystemDataStore.createSchema (#2787))
=======
>>>>>>> cc5f917a7c (GEOMESA-3113 Add system property to managing HBase deletes with visibilities (#2792))
=======
>>>>>>> a49ee0e00a (GEOMESA-3102 Fix removal of user data in FileSystemDataStore.createSchema (#2787))
=======
>>>>>>> 3adb85864f (GEOMESA-3113 Add system property to managing HBase deletes with visibilities (#2792))
=======
>>>>>>> a1198ce095 (GEOMESA-3102 Fix removal of user data in FileSystemDataStore.createSchema (#2787))
=======
>>>>>>> 260d67442f (GEOMESA-3113 Add system property to managing HBase deletes with visibilities (#2792))
=======
>>>>>>> c69897d7bd (Merge branch 'feature/postgis-fixes')
=======
>>>>>>> 113b056da (GEOMESA-3113 Add system property to managing HBase deletes with visibilities (#2792))
>>>>>>> 6f73f22005 (GEOMESA-3113 Add system property to managing HBase deletes with visibilities (#2792))
=======
>>>>>>> 58f72e76c (GEOMESA-3113 Add system property to managing HBase deletes with visibilities (#2792))
=======
>>>>>>> 4c9fb0f6e (GEOMESA-3113 Add system property to managing HBase deletes with visibilities (#2792))
=======
>>>>>>> 72415e208a (GEOMESA-3113 Add system property to managing HBase deletes with visibilities (#2792))
=======
>>>>>>> e8cc4971c6 (Merge branch 'feature/postgis-fixes')
=======
>>>>>>> 5521d97d99 (GEOMESA-3102 Fix removal of user data in FileSystemDataStore.createSchema (#2787))
=======
>>>>>>> 26fc359a06 (GEOMESA-3113 Add system property to managing HBase deletes with visibilities (#2792))
=======
>>>>>>> adf2ac19a8 (GEOMESA-3102 Fix removal of user data in FileSystemDataStore.createSchema (#2787))
=======
>>>>>>> e62505d539 (GEOMESA-3113 Add system property to managing HBase deletes with visibilities (#2792))
=======
=======
>>>>>>> 797b02396b (GEOMESA-3113 Add system property to managing HBase deletes with visibilities (#2792))
=======
>>>>>>> 3171e7407d (GEOMESA-3102 Fix removal of user data in FileSystemDataStore.createSchema (#2787))
=======
>>>>>>> 237494b1cc (GEOMESA-3113 Add system property to managing HBase deletes with visibilities (#2792))
=======
>>>>>>> 9ec1f049a9 (GEOMESA-3102 Fix removal of user data in FileSystemDataStore.createSchema (#2787))
=======
>>>>>>> a0d6da1831 (GEOMESA-3113 Add system property to managing HBase deletes with visibilities (#2792))
=======
>>>>>>> 1faf0d16f2 (GEOMESA-3102 Fix removal of user data in FileSystemDataStore.createSchema (#2787))
=======
>>>>>>> e5413df04f (GEOMESA-3113 Add system property to managing HBase deletes with visibilities (#2792))
=======
>>>>>>> cb6bda89b6 (Merge branch 'feature/postgis-fixes')
=======
>>>>>>> 8aa4f55ef6 (GEOMESA-3102 Fix removal of user data in FileSystemDataStore.createSchema (#2787))
=======
>>>>>>> 11addb1ce7 (GEOMESA-3113 Add system property to managing HBase deletes with visibilities (#2792))
=======
>>>>>>> 90d85d9b4b (GEOMESA-3102 Fix removal of user data in FileSystemDataStore.createSchema (#2787))
=======
>>>>>>> 1468e59829 (GEOMESA-3113 Add system property to managing HBase deletes with visibilities (#2792))
=======
>>>>>>> a618e2ba0a (GEOMESA-3102 Fix removal of user data in FileSystemDataStore.createSchema (#2787))
=======
>>>>>>> 65360f96a0 (GEOMESA-3113 Add system property to managing HBase deletes with visibilities (#2792))
=======
>>>>>>> 20dc993a76 (GEOMESA-3102 Fix removal of user data in FileSystemDataStore.createSchema (#2787))
=======
>>>>>>> bd6dd934cc (GEOMESA-3113 Add system property to managing HBase deletes with visibilities (#2792))
=======
>>>>>>> 495c744326 (GEOMESA-3102 Fix removal of user data in FileSystemDataStore.createSchema (#2787))
=======
>>>>>>> 49d3846b23 (GEOMESA-3113 Add system property to managing HBase deletes with visibilities (#2792))
=======
>>>>>>> 155d6a9469 (GEOMESA-3102 Fix removal of user data in FileSystemDataStore.createSchema (#2787))
=======
>>>>>>> e4ee051914 (GEOMESA-3113 Add system property to managing HBase deletes with visibilities (#2792))
=======
>>>>>>> 699117eca9 (Merge branch 'feature/postgis-fixes')
=======
>>>>>>> bd17bd131 (GEOMESA-3102 Fix removal of user data in FileSystemDataStore.createSchema (#2787))
>>>>>>> c555446b8b (GEOMESA-3102 Fix removal of user data in FileSystemDataStore.createSchema (#2787))
=======
>>>>>>> ca22354dd (GEOMESA-3113 Add system property to managing HBase deletes with visibilities (#2792))
=======
>>>>>>> c385f7994 (GEOMESA-3102 Fix removal of user data in FileSystemDataStore.createSchema (#2787))
=======
>>>>>>> 2d758409c (GEOMESA-3113 Add system property to managing HBase deletes with visibilities (#2792))
=======
>>>>>>> 5c68fb7d1 (GEOMESA-3102 Fix removal of user data in FileSystemDataStore.createSchema (#2787))
=======
>>>>>>> 4a47c538b (GEOMESA-3113 Add system property to managing HBase deletes with visibilities (#2792))
=======
>>>>>>> a358de35a (GEOMESA-3102 Fix removal of user data in FileSystemDataStore.createSchema (#2787))
=======
>>>>>>> 44b15e96d (GEOMESA-3113 Add system property to managing HBase deletes with visibilities (#2792))
=======
>>>>>>> db8d998aa (Merge branch 'feature/postgis-fixes')
=======
>>>>>>> 2b62bcaeb (GEOMESA-3102 Fix removal of user data in FileSystemDataStore.createSchema (#2787))
=======
>>>>>>> afc081190 (GEOMESA-3113 Add system property to managing HBase deletes with visibilities (#2792))
=======
>>>>>>> 75f3f455e (GEOMESA-3102 Fix removal of user data in FileSystemDataStore.createSchema (#2787))
=======
>>>>>>> 7a3d004ad (GEOMESA-3113 Add system property to managing HBase deletes with visibilities (#2792))
=======
>>>>>>> 8871b2b4b (GEOMESA-3102 Fix removal of user data in FileSystemDataStore.createSchema (#2787))
=======
>>>>>>> 91b0d6a88 (GEOMESA-3113 Add system property to managing HBase deletes with visibilities (#2792))
=======
>>>>>>> 4f922d74c (GEOMESA-3102 Fix removal of user data in FileSystemDataStore.createSchema (#2787))
=======
>>>>>>> 1b5719bd3 (GEOMESA-3113 Add system property to managing HBase deletes with visibilities (#2792))
=======
>>>>>>> 1b25d7ddb (Merge branch 'feature/postgis-fixes')
=======
>>>>>>> 526e71304c (GEOMESA-3102 Fix removal of user data in FileSystemDataStore.createSchema (#2787))
=======
>>>>>>> 074e4b10b9 (GEOMESA-3113 Add system property to managing HBase deletes with visibilities (#2792))
=======
>>>>>>> 9c809610d5 (GEOMESA-3102 Fix removal of user data in FileSystemDataStore.createSchema (#2787))
=======
>>>>>>> 0b22bfaa87 (GEOMESA-3113 Add system property to managing HBase deletes with visibilities (#2792))
=======
>>>>>>> 9e842c2021 (GEOMESA-3102 Fix removal of user data in FileSystemDataStore.createSchema (#2787))
=======
>>>>>>> 0f0dd6560e (GEOMESA-3113 Add system property to managing HBase deletes with visibilities (#2792))
=======
>>>>>>> 98ce8bad96 (GEOMESA-3102 Fix removal of user data in FileSystemDataStore.createSchema (#2787))
=======
>>>>>>> a8e7273bb0 (GEOMESA-3113 Add system property to managing HBase deletes with visibilities (#2792))
=======
>>>>>>> da00c7bd68 (Merge branch 'feature/postgis-fixes')
=======
>>>>>>> 39d46533eb (GEOMESA-3102 Fix removal of user data in FileSystemDataStore.createSchema (#2787))
=======
>>>>>>> 9da518fc54 (GEOMESA-3113 Add system property to managing HBase deletes with visibilities (#2792))
=======
>>>>>>> b52e5bb454 (GEOMESA-3102 Fix removal of user data in FileSystemDataStore.createSchema (#2787))
=======
>>>>>>> 4bd5ce922d (GEOMESA-3113 Add system property to managing HBase deletes with visibilities (#2792))
=======
>>>>>>> cfd537e7af (GEOMESA-3102 Fix removal of user data in FileSystemDataStore.createSchema (#2787))
=======
>>>>>>> e17f495391 (GEOMESA-3113 Add system property to managing HBase deletes with visibilities (#2792))
=======
>>>>>>> 54709e3b06 (GEOMESA-3102 Fix removal of user data in FileSystemDataStore.createSchema (#2787))
=======
>>>>>>> d857d34521 (GEOMESA-3113 Add system property to managing HBase deletes with visibilities (#2792))
=======
>>>>>>> 34472778d3 (Merge branch 'feature/postgis-fixes')
=======
>>>>>>> 4100fa1ce8 (GEOMESA-3102 Fix removal of user data in FileSystemDataStore.createSchema (#2787))
=======
>>>>>>> b515d530a4 (GEOMESA-3113 Add system property to managing HBase deletes with visibilities (#2792))
=======
>>>>>>> 7ee0f1d494 (GEOMESA-3102 Fix removal of user data in FileSystemDataStore.createSchema (#2787))
=======
>>>>>>> 02fea6930b (GEOMESA-3113 Add system property to managing HBase deletes with visibilities (#2792))
=======
=======
>>>>>>> bd17bd131e (GEOMESA-3102 Fix removal of user data in FileSystemDataStore.createSchema (#2787))
>>>>>>> a2a804586c (GEOMESA-3102 Fix removal of user data in FileSystemDataStore.createSchema (#2787))
=======
=======
>>>>>>> a773c6ef65 (GEOMESA-3113 Add system property to managing HBase deletes with visibilities (#2792))
=======
>>>>>>> 0fb40a8655 (GEOMESA-3113 Add system property to managing HBase deletes with visibilities (#2792))
<<<<<<< HEAD
>>>>>>> 85d211ca2 (GEOMESA-3102 Fix removal of user data in FileSystemDataStore.createSchema (#2787))
=======
>>>>>>> 595c43086 (GEOMESA-3113 Add system property to managing HBase deletes with visibilities (#2792))
=======
<<<<<<< HEAD
<<<<<<< HEAD
<<<<<<< HEAD
>>>>>>> 0d3cbc99a (GEOMESA-3102 Fix removal of user data in FileSystemDataStore.createSchema (#2787))
=======
>>>>>>> aa627812d (GEOMESA-3102 Fix removal of user data in FileSystemDataStore.createSchema (#2787))
<<<<<<< HEAD
<<<<<<< HEAD
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
>>>>>>> 45dca3e07 (GEOMESA-3113 Add system property to managing HBase deletes with visibilities (#2792))
<<<<<<< HEAD
>>>>>>> 9d7ed88fa8 (GEOMESA-3102 Fix removal of user data in FileSystemDataStore.createSchema (#2787))
<<<<<<< HEAD
<<<<<<< HEAD
<<<<<<< HEAD
<<<<<<< HEAD
<<<<<<< HEAD
<<<<<<< HEAD
<<<<<<< HEAD
<<<<<<< HEAD
<<<<<<< HEAD
<<<<<<< HEAD
<<<<<<< HEAD
<<<<<<< HEAD
<<<<<<< HEAD
<<<<<<< HEAD
<<<<<<< HEAD
<<<<<<< HEAD
<<<<<<< HEAD
<<<<<<< HEAD
<<<<<<< HEAD
<<<<<<< HEAD
<<<<<<< HEAD
<<<<<<< HEAD
<<<<<<< HEAD
<<<<<<< HEAD
<<<<<<< HEAD
<<<<<<< HEAD
<<<<<<< HEAD
<<<<<<< HEAD
<<<<<<< HEAD
<<<<<<< HEAD
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
>>>>>>> 1230d64006 (GEOMESA-3102 Fix removal of user data in FileSystemDataStore.createSchema (#2787))
>>>>>>> f9996d127e (GEOMESA-3102 Fix removal of user data in FileSystemDataStore.createSchema (#2787))
=======
>>>>>>> 2d98e354b8 (GEOMESA-3113 Add system property to managing HBase deletes with visibilities (#2792))
=======
>>>>>>> 595d9061e3 (GEOMESA-3102 Fix removal of user data in FileSystemDataStore.createSchema (#2787))
=======
>>>>>>> 0fb40a8655 (GEOMESA-3113 Add system property to managing HBase deletes with visibilities (#2792))
=======
>>>>>>> 682f10a0e9 (GEOMESA-3102 Fix removal of user data in FileSystemDataStore.createSchema (#2787))
=======
>>>>>>> f22bf41646 (GEOMESA-3102 Fix removal of user data in FileSystemDataStore.createSchema (#2787))
=======
>>>>>>> ffcb7ff3ae (GEOMESA-3113 Add system property to managing HBase deletes with visibilities (#2792))
=======
>>>>>>> 4d1cac1d60 (GEOMESA-3102 Fix removal of user data in FileSystemDataStore.createSchema (#2787))
=======
>>>>>>> cb8df4c76b (GEOMESA-3113 Add system property to managing HBase deletes with visibilities (#2792))
=======
>>>>>>> f2b9fb3853 (GEOMESA-3113 Add system property to managing HBase deletes with visibilities (#2792))
=======
>>>>>>> 1682b13d94 (GEOMESA-3102 Fix removal of user data in FileSystemDataStore.createSchema (#2787))
=======
<<<<<<< HEAD
<<<<<<< HEAD
>>>>>>> 8999b3f6b9 (GEOMESA-3113 Add system property to managing HBase deletes with visibilities (#2792))
=======
>>>>>>> 6d4f75bcbb (GEOMESA-3102 Fix removal of user data in FileSystemDataStore.createSchema (#2787))
=======
<<<<<<< HEAD
<<<<<<< HEAD
>>>>>>> 0d4496a2f2 (GEOMESA-3113 Add system property to managing HBase deletes with visibilities (#2792))
=======
>>>>>>> 73d82b731c (GEOMESA-3113 Add system property to managing HBase deletes with visibilities (#2792))
=======
>>>>>>> b1b67a398d (GEOMESA-3102 Fix removal of user data in FileSystemDataStore.createSchema (#2787))
=======
>>>>>>> cbaecd4a0f (GEOMESA-3113 Add system property to managing HBase deletes with visibilities (#2792))
=======
>>>>>>> d61b3bb194 (GEOMESA-3102 Fix removal of user data in FileSystemDataStore.createSchema (#2787))
=======
>>>>>>> 0121c0dbad (GEOMESA-3113 Add system property to managing HBase deletes with visibilities (#2792))
=======
>>>>>>> 6f9b076410 (GEOMESA-3102 Fix removal of user data in FileSystemDataStore.createSchema (#2787))
=======
>>>>>>> 39a2b37b5e (GEOMESA-3113 Add system property to managing HBase deletes with visibilities (#2792))
=======
>>>>>>> 83a8ca6465 (GEOMESA-3102 Fix removal of user data in FileSystemDataStore.createSchema (#2787))
=======
>>>>>>> 34fd077439 (GEOMESA-3113 Add system property to managing HBase deletes with visibilities (#2792))
=======
>>>>>>> 8a07c6167f (GEOMESA-3102 Fix removal of user data in FileSystemDataStore.createSchema (#2787))
=======
>>>>>>> 1b0d520fde (GEOMESA-3113 Add system property to managing HBase deletes with visibilities (#2792))
=======
>>>>>>> 5742320897 (GEOMESA-3102 Fix removal of user data in FileSystemDataStore.createSchema (#2787))
=======
=======
>>>>>>> f2b9fb3853 (GEOMESA-3113 Add system property to managing HBase deletes with visibilities (#2792))
>>>>>>> c43c29e91c (GEOMESA-3113 Add system property to managing HBase deletes with visibilities (#2792))
=======
=======
>>>>>>> f22bf41646 (GEOMESA-3102 Fix removal of user data in FileSystemDataStore.createSchema (#2787))
=======
>>>>>>> 8999b3f6b9 (GEOMESA-3113 Add system property to managing HBase deletes with visibilities (#2792))
=======
>>>>>>> ffcb7ff3ae (GEOMESA-3113 Add system property to managing HBase deletes with visibilities (#2792))
=======
>>>>>>> 4d1cac1d60 (GEOMESA-3102 Fix removal of user data in FileSystemDataStore.createSchema (#2787))
=======
>>>>>>> 0d4496a2f2 (GEOMESA-3113 Add system property to managing HBase deletes with visibilities (#2792))
=======
>>>>>>> cb8df4c76b (GEOMESA-3113 Add system property to managing HBase deletes with visibilities (#2792))
>>>>>>> 1230d64006 (GEOMESA-3102 Fix removal of user data in FileSystemDataStore.createSchema (#2787))
=======
>>>>>>> cd5564bac6 (GEOMESA-3113 Add system property to managing HBase deletes with visibilities (#2792))
=======
<<<<<<< HEAD
<<<<<<< HEAD
<<<<<<< HEAD
<<<<<<< HEAD
<<<<<<< HEAD
<<<<<<< HEAD
=======
>>>>>>> c43c29e91c (GEOMESA-3113 Add system property to managing HBase deletes with visibilities (#2792))
=======
>>>>>>> f22bf41646 (GEOMESA-3102 Fix removal of user data in FileSystemDataStore.createSchema (#2787))
>>>>>>> 687ba5655c (GEOMESA-3102 Fix removal of user data in FileSystemDataStore.createSchema (#2787))
=======
>>>>>>> 97a911d79c (GEOMESA-3113 Add system property to managing HBase deletes with visibilities (#2792))
=======
<<<<<<< HEAD
<<<<<<< HEAD
<<<<<<< HEAD
<<<<<<< HEAD
=======
>>>>>>> ffcb7ff3ae (GEOMESA-3113 Add system property to managing HBase deletes with visibilities (#2792))
>>>>>>> a2a804586c (GEOMESA-3102 Fix removal of user data in FileSystemDataStore.createSchema (#2787))
=======
>>>>>>> a773c6ef65 (GEOMESA-3113 Add system property to managing HBase deletes with visibilities (#2792))
=======
<<<<<<< HEAD
<<<<<<< HEAD
>>>>>>> 628458842d (GEOMESA-3102 Fix removal of user data in FileSystemDataStore.createSchema (#2787))
=======
>>>>>>> aca68ab685 (GEOMESA-3113 Add system property to managing HBase deletes with visibilities (#2792))
=======
<<<<<<< HEAD
<<<<<<< HEAD
=======
>>>>>>> 5742320897 (GEOMESA-3102 Fix removal of user data in FileSystemDataStore.createSchema (#2787))
=======
>>>>>>> 1230d64006 (GEOMESA-3102 Fix removal of user data in FileSystemDataStore.createSchema (#2787))
>>>>>>> 814abac33f (GEOMESA-3102 Fix removal of user data in FileSystemDataStore.createSchema (#2787))
=======
<<<<<<< HEAD
<<<<<<< HEAD
=======
>>>>>>> f2b9fb3853 (GEOMESA-3113 Add system property to managing HBase deletes with visibilities (#2792))
=======
>>>>>>> 687ba5655c (GEOMESA-3102 Fix removal of user data in FileSystemDataStore.createSchema (#2787))
=======
>>>>>>> 1682b13d94 (GEOMESA-3102 Fix removal of user data in FileSystemDataStore.createSchema (#2787))
<<<<<<< HEAD
<<<<<<< HEAD
=======
>>>>>>> 8999b3f6b9 (GEOMESA-3113 Add system property to managing HBase deletes with visibilities (#2792))
=======
>>>>>>> 73d82b731c (GEOMESA-3113 Add system property to managing HBase deletes with visibilities (#2792))
=======
>>>>>>> 687ba5655c (GEOMESA-3102 Fix removal of user data in FileSystemDataStore.createSchema (#2787))
=======
>>>>>>> b1b67a398d (GEOMESA-3102 Fix removal of user data in FileSystemDataStore.createSchema (#2787))
=======
>>>>>>> cbaecd4a0f (GEOMESA-3113 Add system property to managing HBase deletes with visibilities (#2792))
=======
>>>>>>> a2a804586c (GEOMESA-3102 Fix removal of user data in FileSystemDataStore.createSchema (#2787))
=======
>>>>>>> 83a8ca6465 (GEOMESA-3102 Fix removal of user data in FileSystemDataStore.createSchema (#2787))
=======
>>>>>>> 34fd077439 (GEOMESA-3113 Add system property to managing HBase deletes with visibilities (#2792))
=======
>>>>>>> 628458842d (GEOMESA-3102 Fix removal of user data in FileSystemDataStore.createSchema (#2787))
=======
>>>>>>> 8a07c6167f (GEOMESA-3102 Fix removal of user data in FileSystemDataStore.createSchema (#2787))
=======
>>>>>>> 1b0d520fde (GEOMESA-3113 Add system property to managing HBase deletes with visibilities (#2792))
=======
>>>>>>> 5742320897 (GEOMESA-3102 Fix removal of user data in FileSystemDataStore.createSchema (#2787))
=======
=======
>>>>>>> f2b9fb3853 (GEOMESA-3113 Add system property to managing HBase deletes with visibilities (#2792))
>>>>>>> c43c29e91c (GEOMESA-3113 Add system property to managing HBase deletes with visibilities (#2792))
=======
>>>>>>> f22bf41646 (GEOMESA-3102 Fix removal of user data in FileSystemDataStore.createSchema (#2787))
=======
=======
>>>>>>> 8999b3f6b9 (GEOMESA-3113 Add system property to managing HBase deletes with visibilities (#2792))
>>>>>>> ffcb7ff3ae (GEOMESA-3113 Add system property to managing HBase deletes with visibilities (#2792))
>>>>>>> 45dca3e07 (GEOMESA-3113 Add system property to managing HBase deletes with visibilities (#2792))
<<<<<<< HEAD
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
>>>>>>> a0d25ffbaa (GEOMESA-3102 Fix removal of user data in FileSystemDataStore.createSchema (#2787))
=======
>>>>>>> d73ae82492 (GEOMESA-3113 Add system property to managing HBase deletes with visibilities (#2792))
=======
>>>>>>> 265d436467 (GEOMESA-3102 Fix removal of user data in FileSystemDataStore.createSchema (#2787))
=======
>>>>>>> 9c809610d5 (GEOMESA-3102 Fix removal of user data in FileSystemDataStore.createSchema (#2787))
=======
>>>>>>> b52e5bb454 (GEOMESA-3102 Fix removal of user data in FileSystemDataStore.createSchema (#2787))
=======
<<<<<<< HEAD
<<<<<<< HEAD
>>>>>>> 9888cda97e (GEOMESA-3113 Add system property to managing HBase deletes with visibilities (#2792))
=======
=======
>>>>>>> 9c809610d5 (GEOMESA-3102 Fix removal of user data in FileSystemDataStore.createSchema (#2787))
>>>>>>> ee2741585f (GEOMESA-3102 Fix removal of user data in FileSystemDataStore.createSchema (#2787))
=======
<<<<<<< HEAD
>>>>>>> 32aba52002 (GEOMESA-3113 Add system property to managing HBase deletes with visibilities (#2792))
=======
=======
>>>>>>> 9c809610d5 (GEOMESA-3102 Fix removal of user data in FileSystemDataStore.createSchema (#2787))
>>>>>>> e518bfb9e2 (GEOMESA-3102 Fix removal of user data in FileSystemDataStore.createSchema (#2787))
=======
=======
>>>>>>> a0d25ffbaa (GEOMESA-3102 Fix removal of user data in FileSystemDataStore.createSchema (#2787))
=======
>>>>>>> 9888cda97e (GEOMESA-3113 Add system property to managing HBase deletes with visibilities (#2792))
=======
>>>>>>> d73ae82492 (GEOMESA-3113 Add system property to managing HBase deletes with visibilities (#2792))
=======
>>>>>>> 265d436467 (GEOMESA-3102 Fix removal of user data in FileSystemDataStore.createSchema (#2787))
=======
>>>>>>> 85d211ca2 (GEOMESA-3102 Fix removal of user data in FileSystemDataStore.createSchema (#2787))
>>>>>>> ea0c690e2 (GEOMESA-3102 Fix removal of user data in FileSystemDataStore.createSchema (#2787))
<<<<<<< HEAD
<<<<<<< HEAD
<<<<<<< HEAD
<<<<<<< HEAD
<<<<<<< HEAD
<<<<<<< HEAD
<<<<<<< HEAD
<<<<<<< HEAD
<<<<<<< HEAD
<<<<<<< HEAD
<<<<<<< HEAD
<<<<<<< HEAD
<<<<<<< HEAD
<<<<<<< HEAD
<<<<<<< HEAD
<<<<<<< HEAD
<<<<<<< HEAD
<<<<<<< HEAD
<<<<<<< HEAD
<<<<<<< HEAD
<<<<<<< HEAD
<<<<<<< HEAD
<<<<<<< HEAD
<<<<<<< HEAD
<<<<<<< HEAD
<<<<<<< HEAD
<<<<<<< HEAD
<<<<<<< HEAD
<<<<<<< HEAD
<<<<<<< HEAD
<<<<<<< HEAD
<<<<<<< HEAD
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
>>>>>>> 1a0678c1b1 (GEOMESA-3113 Add system property to managing HBase deletes with visibilities (#2792))
<<<<<<< HEAD
<<<<<<< HEAD
<<<<<<< HEAD
<<<<<<< HEAD
<<<<<<< HEAD
=======
>>>>>>> 4b0c56ce56 (GEOMESA-3102 Fix removal of user data in FileSystemDataStore.createSchema (#2787))
=======
>>>>>>> 9ac1262e54 (GEOMESA-3113 Add system property to managing HBase deletes with visibilities (#2792))
=======
>>>>>>> 265d436467 (GEOMESA-3102 Fix removal of user data in FileSystemDataStore.createSchema (#2787))
=======
>>>>>>> 7ce9817488 (GEOMESA-3113 Add system property to managing HBase deletes with visibilities (#2792))
=======
>>>>>>> e639fc30a7 (GEOMESA-3113 Add system property to managing HBase deletes with visibilities (#2792))
=======
>>>>>>> abc395c346 (GEOMESA-3102 Fix removal of user data in FileSystemDataStore.createSchema (#2787))
=======
<<<<<<< HEAD
<<<<<<< HEAD
>>>>>>> 3c53246c9a (GEOMESA-3113 Add system property to managing HBase deletes with visibilities (#2792))
=======
>>>>>>> ee2741585f (GEOMESA-3102 Fix removal of user data in FileSystemDataStore.createSchema (#2787))
=======
<<<<<<< HEAD
<<<<<<< HEAD
>>>>>>> 1506607bc9 (GEOMESA-3113 Add system property to managing HBase deletes with visibilities (#2792))
=======
>>>>>>> 3c673847c5 (GEOMESA-3113 Add system property to managing HBase deletes with visibilities (#2792))
=======
>>>>>>> a23109e63b (GEOMESA-3102 Fix removal of user data in FileSystemDataStore.createSchema (#2787))
=======
>>>>>>> 9b169d0847 (GEOMESA-3113 Add system property to managing HBase deletes with visibilities (#2792))
=======
>>>>>>> e518bfb9e2 (GEOMESA-3102 Fix removal of user data in FileSystemDataStore.createSchema (#2787))
=======
>>>>>>> 5a43551b62 (GEOMESA-3113 Add system property to managing HBase deletes with visibilities (#2792))
=======
>>>>>>> a0d25ffbaa (GEOMESA-3102 Fix removal of user data in FileSystemDataStore.createSchema (#2787))
=======
>>>>>>> 7f28e8e2e5 (GEOMESA-3113 Add system property to managing HBase deletes with visibilities (#2792))
=======
>>>>>>> f58f87b448 (GEOMESA-3102 Fix removal of user data in FileSystemDataStore.createSchema (#2787))
=======
>>>>>>> 7196beb2e1 (GEOMESA-3113 Add system property to managing HBase deletes with visibilities (#2792))
=======
>>>>>>> 871350de06 (GEOMESA-3102 Fix removal of user data in FileSystemDataStore.createSchema (#2787))
=======
>>>>>>> 9bcc7591e5 (GEOMESA-3113 Add system property to managing HBase deletes with visibilities (#2792))
=======
>>>>>>> 78439fc2da (GEOMESA-3102 Fix removal of user data in FileSystemDataStore.createSchema (#2787))
=======
=======
>>>>>>> e639fc30a7 (GEOMESA-3113 Add system property to managing HBase deletes with visibilities (#2792))
>>>>>>> 64c0e084b5 (GEOMESA-3113 Add system property to managing HBase deletes with visibilities (#2792))
=======
=======
>>>>>>> 4b0c56ce56 (GEOMESA-3102 Fix removal of user data in FileSystemDataStore.createSchema (#2787))
=======
>>>>>>> 3c53246c9a (GEOMESA-3113 Add system property to managing HBase deletes with visibilities (#2792))
=======
>>>>>>> 9ac1262e54 (GEOMESA-3113 Add system property to managing HBase deletes with visibilities (#2792))
=======
>>>>>>> 265d436467 (GEOMESA-3102 Fix removal of user data in FileSystemDataStore.createSchema (#2787))
=======
>>>>>>> 1506607bc9 (GEOMESA-3113 Add system property to managing HBase deletes with visibilities (#2792))
=======
>>>>>>> 7ce9817488 (GEOMESA-3113 Add system property to managing HBase deletes with visibilities (#2792))
>>>>>>> 038b4ca087 (GEOMESA-3102 Fix removal of user data in FileSystemDataStore.createSchema (#2787))
=======
>>>>>>> d774dc1d12 (GEOMESA-3113 Add system property to managing HBase deletes with visibilities (#2792))
<<<<<<< HEAD
=======
<<<<<<< HEAD
<<<<<<< HEAD
>>>>>>> 33d2777a8a (GEOMESA-3102 Fix removal of user data in FileSystemDataStore.createSchema (#2787))
=======
>>>>>>> cc5f917a7c (GEOMESA-3113 Add system property to managing HBase deletes with visibilities (#2792))
=======
<<<<<<< HEAD
>>>>>>> 2d01ec0bc0 (GEOMESA-3102 Fix removal of user data in FileSystemDataStore.createSchema (#2787))
=======
>>>>>>> b586a90765 (GEOMESA-3113 Add system property to managing HBase deletes with visibilities (#2792))
=======
>>>>>>> f7952edd5f (GEOMESA-3102 Fix removal of user data in FileSystemDataStore.createSchema (#2787))
=======
>>>>>>> fd0793971d (GEOMESA-3113 Add system property to managing HBase deletes with visibilities (#2792))
=======
=======
<<<<<<< HEAD
>>>>>>> 3c673847c5 (GEOMESA-3113 Add system property to managing HBase deletes with visibilities (#2792))
=======
<<<<<<< HEAD
<<<<<<< HEAD
>>>>>>> 33d2777a8a (GEOMESA-3102 Fix removal of user data in FileSystemDataStore.createSchema (#2787))
=======
>>>>>>> cc5f917a7c (GEOMESA-3113 Add system property to managing HBase deletes with visibilities (#2792))
=======
<<<<<<< HEAD
>>>>>>> 2d01ec0bc0 (GEOMESA-3102 Fix removal of user data in FileSystemDataStore.createSchema (#2787))
=======
>>>>>>> b586a90765 (GEOMESA-3113 Add system property to managing HBase deletes with visibilities (#2792))
=======
>>>>>>> f7952edd5f (GEOMESA-3102 Fix removal of user data in FileSystemDataStore.createSchema (#2787))
=======
>>>>>>> fd0793971d (GEOMESA-3113 Add system property to managing HBase deletes with visibilities (#2792))
=======
>>>>>>> 41631d23c9 (GEOMESA-3102 Fix removal of user data in FileSystemDataStore.createSchema (#2787))
=======
>>>>>>> bc833b1448 (GEOMESA-3113 Add system property to managing HBase deletes with visibilities (#2792))
=======
>>>>>>> 2f550bb2a7 (GEOMESA-3102 Fix removal of user data in FileSystemDataStore.createSchema (#2787))
=======
>>>>>>> 8781a5befd (GEOMESA-3113 Add system property to managing HBase deletes with visibilities (#2792))
=======
=======
>>>>>>> 038b4ca087 (GEOMESA-3102 Fix removal of user data in FileSystemDataStore.createSchema (#2787))
>>>>>>> 957de96206 (GEOMESA-3102 Fix removal of user data in FileSystemDataStore.createSchema (#2787))
=======
=======
=======
>>>>>>> 78439fc2da (GEOMESA-3102 Fix removal of user data in FileSystemDataStore.createSchema (#2787))
>>>>>>> 038b4ca087 (GEOMESA-3102 Fix removal of user data in FileSystemDataStore.createSchema (#2787))
>>>>>>> 7f486255dd (GEOMESA-3102 Fix removal of user data in FileSystemDataStore.createSchema (#2787))
=======
=======
>>>>>>> e639fc30a7 (GEOMESA-3113 Add system property to managing HBase deletes with visibilities (#2792))
=======
>>>>>>> 33d2777a8a (GEOMESA-3102 Fix removal of user data in FileSystemDataStore.createSchema (#2787))
=======
>>>>>>> abc395c346 (GEOMESA-3102 Fix removal of user data in FileSystemDataStore.createSchema (#2787))
=======
>>>>>>> 3c53246c9a (GEOMESA-3113 Add system property to managing HBase deletes with visibilities (#2792))
=======
<<<<<<< HEAD
>>>>>>> e639fc30a7 (GEOMESA-3113 Add system property to managing HBase deletes with visibilities (#2792))
=======
>>>>>>> 33d2777a8a (GEOMESA-3102 Fix removal of user data in FileSystemDataStore.createSchema (#2787))
=======
>>>>>>> abc395c346 (GEOMESA-3102 Fix removal of user data in FileSystemDataStore.createSchema (#2787))
=======
>>>>>>> 3c53246c9a (GEOMESA-3113 Add system property to managing HBase deletes with visibilities (#2792))
=======
<<<<<<< HEAD
=======
>>>>>>> 78439fc2da (GEOMESA-3102 Fix removal of user data in FileSystemDataStore.createSchema (#2787))
<<<<<<< HEAD
<<<<<<< HEAD
>>>>>>> 85d211ca2 (GEOMESA-3102 Fix removal of user data in FileSystemDataStore.createSchema (#2787))
=======
>>>>>>> 595c43086 (GEOMESA-3113 Add system property to managing HBase deletes with visibilities (#2792))
<<<<<<< HEAD
>>>>>>> dc17df6c0 (GEOMESA-3113 Add system property to managing HBase deletes with visibilities (#2792))
=======
=======
<<<<<<< HEAD
<<<<<<< HEAD
<<<<<<< HEAD
>>>>>>> 0d3cbc99a (GEOMESA-3102 Fix removal of user data in FileSystemDataStore.createSchema (#2787))
>>>>>>> 74c6b7f8d (GEOMESA-3102 Fix removal of user data in FileSystemDataStore.createSchema (#2787))
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
<<<<<<< HEAD
<<<<<<< HEAD
=======
>>>>>>> 474042e6d6 (GEOMESA-3102 Fix removal of user data in FileSystemDataStore.createSchema (#2787))
=======
>>>>>>> 2ec7d64046 (GEOMESA-3102 Fix removal of user data in FileSystemDataStore.createSchema (#2787))
=======
>>>>>>> 02465f5f58 (GEOMESA-3102 Fix removal of user data in FileSystemDataStore.createSchema (#2787))
=======
>>>>>>> 8a9d3df519 (GEOMESA-3102 Fix removal of user data in FileSystemDataStore.createSchema (#2787))
=======
>>>>>>> 853c43fc17 (GEOMESA-3102 Fix removal of user data in FileSystemDataStore.createSchema (#2787))
<<<<<<< HEAD
<<<<<<< HEAD
=======
>>>>>>> abe07966f6 (GEOMESA-3102 Fix removal of user data in FileSystemDataStore.createSchema (#2787))
=======
>>>>>>> 1e838e1657 (GEOMESA-3102 Fix removal of user data in FileSystemDataStore.createSchema (#2787))
=======
>>>>>>> dfae24c155 (GEOMESA-3102 Fix removal of user data in FileSystemDataStore.createSchema (#2787))
=======
>>>>>>> 93a4d60f28 (GEOMESA-3102 Fix removal of user data in FileSystemDataStore.createSchema (#2787))
=======
>>>>>>> 9171ff5334 (GEOMESA-3102 Fix removal of user data in FileSystemDataStore.createSchema (#2787))
=======
=======
>>>>>>> 8a9d3df519 (GEOMESA-3102 Fix removal of user data in FileSystemDataStore.createSchema (#2787))
>>>>>>> b4cc9497d5 (GEOMESA-3102 Fix removal of user data in FileSystemDataStore.createSchema (#2787))
=======
>>>>>>> 2ec7d64046 (GEOMESA-3102 Fix removal of user data in FileSystemDataStore.createSchema (#2787))
=======
=======
>>>>>>> abe07966f6 (GEOMESA-3102 Fix removal of user data in FileSystemDataStore.createSchema (#2787))
>>>>>>> 02465f5f58 (GEOMESA-3102 Fix removal of user data in FileSystemDataStore.createSchema (#2787))
>>>>>>> 76328bb492 (GEOMESA-3102 Fix removal of user data in FileSystemDataStore.createSchema (#2787))
=======
>>>>>>> f8f49130b1 (GEOMESA-3113 Add system property to managing HBase deletes with visibilities (#2792))
<<<<<<< HEAD
<<<<<<< HEAD
<<<<<<< HEAD
<<<<<<< HEAD
<<<<<<< HEAD
<<<<<<< HEAD
=======
>>>>>>> 54709e3b06 (GEOMESA-3102 Fix removal of user data in FileSystemDataStore.createSchema (#2787))
=======
>>>>>>> 0ac8a757dd (GEOMESA-3102 Fix removal of user data in FileSystemDataStore.createSchema (#2787))
=======
>>>>>>> f1f448d9e0 (GEOMESA-3113 Add system property to managing HBase deletes with visibilities (#2792))
=======
=======
>>>>>>> 54709e3b06 (GEOMESA-3102 Fix removal of user data in FileSystemDataStore.createSchema (#2787))
>>>>>>> abaa89e702 (GEOMESA-3102 Fix removal of user data in FileSystemDataStore.createSchema (#2787))
=======
=======
>>>>>>> 85d211ca2 (GEOMESA-3102 Fix removal of user data in FileSystemDataStore.createSchema (#2787))
>>>>>>> 02ddf6ca41 (GEOMESA-3102 Fix removal of user data in FileSystemDataStore.createSchema (#2787))
<<<<<<< HEAD
<<<<<<< HEAD
<<<<<<< HEAD
<<<<<<< HEAD
<<<<<<< HEAD
<<<<<<< HEAD
=======
>>>>>>> abaa89e702 (GEOMESA-3102 Fix removal of user data in FileSystemDataStore.createSchema (#2787))
=======
>>>>>>> 8524ef3a47 (GEOMESA-3113 Add system property to managing HBase deletes with visibilities (#2792))
=======
=======
<<<<<<< HEAD
>>>>>>> 85d211ca2 (GEOMESA-3102 Fix removal of user data in FileSystemDataStore.createSchema (#2787))
=======
>>>>>>> 595c43086 (GEOMESA-3113 Add system property to managing HBase deletes with visibilities (#2792))
<<<<<<< HEAD
>>>>>>> 0cdf3f2672 (GEOMESA-3113 Add system property to managing HBase deletes with visibilities (#2792))
=======
>>>>>>> 5e66748475 (GEOMESA-3102 Fix removal of user data in FileSystemDataStore.createSchema (#2787))
=======
>>>>>>> 9814eb9768 (GEOMESA-3113 Add system property to managing HBase deletes with visibilities (#2792))
=======
=======
>>>>>>> 85d211ca2 (GEOMESA-3102 Fix removal of user data in FileSystemDataStore.createSchema (#2787))
>>>>>>> 7119f2c52a (GEOMESA-3102 Fix removal of user data in FileSystemDataStore.createSchema (#2787))
=======
=======
<<<<<<< HEAD
<<<<<<< HEAD
<<<<<<< HEAD
<<<<<<< HEAD
<<<<<<< HEAD
<<<<<<< HEAD
<<<<<<< HEAD
=======
>>>>>>> 7fd052e7d2 (GEOMESA-3102 Fix removal of user data in FileSystemDataStore.createSchema (#2787))
=======
>>>>>>> a317af9cbb (GEOMESA-3102 Fix removal of user data in FileSystemDataStore.createSchema (#2787))
=======
>>>>>>> cdbed26e09 (GEOMESA-3113 Add system property to managing HBase deletes with visibilities (#2792))
=======
=======
>>>>>>> 7fd052e7d2 (GEOMESA-3102 Fix removal of user data in FileSystemDataStore.createSchema (#2787))
>>>>>>> a05bcef080 (GEOMESA-3102 Fix removal of user data in FileSystemDataStore.createSchema (#2787))
>>>>>>> 85d211ca2 (GEOMESA-3102 Fix removal of user data in FileSystemDataStore.createSchema (#2787))
=======
>>>>>>> 595c43086 (GEOMESA-3113 Add system property to managing HBase deletes with visibilities (#2792))
<<<<<<< HEAD
>>>>>>> 8037623548 (GEOMESA-3113 Add system property to managing HBase deletes with visibilities (#2792))
=======
=======
>>>>>>> 7ef22a4bb2 (GEOMESA-3102 Fix removal of user data in FileSystemDataStore.createSchema (#2787))
=======
<<<<<<< HEAD
<<<<<<< HEAD
<<<<<<< HEAD
>>>>>>> 0d3cbc99a (GEOMESA-3102 Fix removal of user data in FileSystemDataStore.createSchema (#2787))
<<<<<<< HEAD
>>>>>>> f0b61142b0 (GEOMESA-3102 Fix removal of user data in FileSystemDataStore.createSchema (#2787))
=======
>>>>>>> bd17bd131e (GEOMESA-3102 Fix removal of user data in FileSystemDataStore.createSchema (#2787))
=======
=======
>>>>>>> 45dca3e07 (GEOMESA-3113 Add system property to managing HBase deletes with visibilities (#2792))
<<<<<<< HEAD
>>>>>>> ca22354dd7 (GEOMESA-3113 Add system property to managing HBase deletes with visibilities (#2792))
=======
>>>>>>> c385f79943 (GEOMESA-3102 Fix removal of user data in FileSystemDataStore.createSchema (#2787))
<<<<<<< HEAD
<<<<<<< HEAD
<<<<<<< HEAD
<<<<<<< HEAD
=======
>>>>>>> f58f87b448 (GEOMESA-3102 Fix removal of user data in FileSystemDataStore.createSchema (#2787))
=======
>>>>>>> 7196beb2e1 (GEOMESA-3113 Add system property to managing HBase deletes with visibilities (#2792))
=======
=======
=======
<<<<<<< HEAD
>>>>>>> 85d211ca2 (GEOMESA-3102 Fix removal of user data in FileSystemDataStore.createSchema (#2787))
=======
>>>>>>> 595c43086 (GEOMESA-3113 Add system property to managing HBase deletes with visibilities (#2792))
<<<<<<< HEAD
>>>>>>> dc17df6c0 (GEOMESA-3113 Add system property to managing HBase deletes with visibilities (#2792))
<<<<<<< HEAD
>>>>>>> 2d758409cd (GEOMESA-3113 Add system property to managing HBase deletes with visibilities (#2792))
=======
=======
=======
<<<<<<< HEAD
<<<<<<< HEAD
<<<<<<< HEAD
>>>>>>> 0d3cbc99a (GEOMESA-3102 Fix removal of user data in FileSystemDataStore.createSchema (#2787))
>>>>>>> 74c6b7f8d (GEOMESA-3102 Fix removal of user data in FileSystemDataStore.createSchema (#2787))
>>>>>>> 5a7f445137 (GEOMESA-3102 Fix removal of user data in FileSystemDataStore.createSchema (#2787))
=======
>>>>>>> 76328bb49 (GEOMESA-3102 Fix removal of user data in FileSystemDataStore.createSchema (#2787))
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
>>>>>>> f8f49130b (GEOMESA-3113 Add system property to managing HBase deletes with visibilities (#2792))
>>>>>>> 10db10e107 (GEOMESA-3113 Add system property to managing HBase deletes with visibilities (#2792))
<<<<<<< HEAD
<<<<<<< HEAD
<<<<<<< HEAD
<<<<<<< HEAD
<<<<<<< HEAD
<<<<<<< HEAD
<<<<<<< HEAD
<<<<<<< HEAD
<<<<<<< HEAD
<<<<<<< HEAD
<<<<<<< HEAD
<<<<<<< HEAD
<<<<<<< HEAD
<<<<<<< HEAD
<<<<<<< HEAD
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
>>>>>>> 4b926d9ec6 (GEOMESA-3102 Fix removal of user data in FileSystemDataStore.createSchema (#2787))
=======
>>>>>>> cdb062d5e9 (GEOMESA-3113 Add system property to managing HBase deletes with visibilities (#2792))
=======
>>>>>>> 1a90b3062a (GEOMESA-3102 Fix removal of user data in FileSystemDataStore.createSchema (#2787))
=======
>>>>>>> 043e029470 (GEOMESA-3113 Add system property to managing HBase deletes with visibilities (#2792))
=======
>>>>>>> 8eb59bcc3c (GEOMESA-3113 Add system property to managing HBase deletes with visibilities (#2792))
=======
>>>>>>> e0056031ea (GEOMESA-3113 Add system property to managing HBase deletes with visibilities (#2792))
=======
>>>>>>> 7e323ef52f (GEOMESA-3102 Fix removal of user data in FileSystemDataStore.createSchema (#2787))
<<<<<<< HEAD
<<<<<<< HEAD
=======
>>>>>>> 69a4e317d6 (GEOMESA-3113 Add system property to managing HBase deletes with visibilities (#2792))
=======
>>>>>>> fd0ea5e670 (GEOMESA-3102 Fix removal of user data in FileSystemDataStore.createSchema (#2787))
<<<<<<< HEAD
<<<<<<< HEAD
=======
>>>>>>> fc179cb2d5 (GEOMESA-3113 Add system property to managing HBase deletes with visibilities (#2792))
=======
>>>>>>> de00bd1943 (GEOMESA-3113 Add system property to managing HBase deletes with visibilities (#2792))
<<<<<<< HEAD
=======
>>>>>>> a52516cf49 (GEOMESA-3113 Add system property to managing HBase deletes with visibilities (#2792))
=======
>>>>>>> d03b76c630 (GEOMESA-3102 Fix removal of user data in FileSystemDataStore.createSchema (#2787))
=======
>>>>>>> ebbfa035a9 (GEOMESA-3113 Add system property to managing HBase deletes with visibilities (#2792))
=======
>>>>>>> eb98a9fb29 (GEOMESA-3102 Fix removal of user data in FileSystemDataStore.createSchema (#2787))
=======
>>>>>>> d539392ecd (GEOMESA-3113 Add system property to managing HBase deletes with visibilities (#2792))
=======
>>>>>>> 6bef55a1ea (GEOMESA-3113 Add system property to managing HBase deletes with visibilities (#2792))
=======
>>>>>>> b4cc9497d5 (GEOMESA-3102 Fix removal of user data in FileSystemDataStore.createSchema (#2787))
=======
>>>>>>> df9cd4f22d (GEOMESA-3113 Add system property to managing HBase deletes with visibilities (#2792))
=======
=======
>>>>>>> e0056031ea (GEOMESA-3113 Add system property to managing HBase deletes with visibilities (#2792))
>>>>>>> 344200f1df (GEOMESA-3113 Add system property to managing HBase deletes with visibilities (#2792))
=======
>>>>>>> 4b926d9ec6 (GEOMESA-3102 Fix removal of user data in FileSystemDataStore.createSchema (#2787))
=======
=======
>>>>>>> 69a4e317d6 (GEOMESA-3113 Add system property to managing HBase deletes with visibilities (#2792))
>>>>>>> cdb062d5e9 (GEOMESA-3113 Add system property to managing HBase deletes with visibilities (#2792))
=======
>>>>>>> 1a90b3062a (GEOMESA-3102 Fix removal of user data in FileSystemDataStore.createSchema (#2787))
=======
=======
>>>>>>> fc179cb2d5 (GEOMESA-3113 Add system property to managing HBase deletes with visibilities (#2792))
>>>>>>> 043e029470 (GEOMESA-3113 Add system property to managing HBase deletes with visibilities (#2792))
=======
>>>>>>> 8eb59bcc3c (GEOMESA-3113 Add system property to managing HBase deletes with visibilities (#2792))
>>>>>>> 5c68fb7d18 (GEOMESA-3102 Fix removal of user data in FileSystemDataStore.createSchema (#2787))
=======
=======
>>>>>>> e8b1c389e3 (GEOMESA-3102 Fix removal of user data in FileSystemDataStore.createSchema (#2787))
=======
<<<<<<< HEAD
<<<<<<< HEAD
<<<<<<< HEAD
<<<<<<< HEAD
<<<<<<< HEAD
<<<<<<< HEAD
=======
>>>>>>> 4b926d9ec6 (GEOMESA-3102 Fix removal of user data in FileSystemDataStore.createSchema (#2787))
=======
>>>>>>> cdb062d5e9 (GEOMESA-3113 Add system property to managing HBase deletes with visibilities (#2792))
>>>>>>> 6abf5007af (GEOMESA-3113 Add system property to managing HBase deletes with visibilities (#2792))
=======
>>>>>>> a49ee0e00a (GEOMESA-3102 Fix removal of user data in FileSystemDataStore.createSchema (#2787))
=======
<<<<<<< HEAD
<<<<<<< HEAD
<<<<<<< HEAD
<<<<<<< HEAD
<<<<<<< HEAD
<<<<<<< HEAD
=======
>>>>>>> 1a90b3062a (GEOMESA-3102 Fix removal of user data in FileSystemDataStore.createSchema (#2787))
=======
>>>>>>> 043e029470 (GEOMESA-3113 Add system property to managing HBase deletes with visibilities (#2792))
>>>>>>> 3adb85864f (GEOMESA-3113 Add system property to managing HBase deletes with visibilities (#2792))
=======
=======
>>>>>>> 7e323ef52f (GEOMESA-3102 Fix removal of user data in FileSystemDataStore.createSchema (#2787))
<<<<<<< HEAD
<<<<<<< HEAD
=======
>>>>>>> cdb062d5e9 (GEOMESA-3113 Add system property to managing HBase deletes with visibilities (#2792))
=======
>>>>>>> 6abf5007af (GEOMESA-3113 Add system property to managing HBase deletes with visibilities (#2792))
=======
>>>>>>> 69a4e317d6 (GEOMESA-3113 Add system property to managing HBase deletes with visibilities (#2792))
<<<<<<< HEAD
<<<<<<< HEAD
=======
>>>>>>> fd0ea5e670 (GEOMESA-3102 Fix removal of user data in FileSystemDataStore.createSchema (#2787))
=======
>>>>>>> 3adb85864f (GEOMESA-3113 Add system property to managing HBase deletes with visibilities (#2792))
=======
>>>>>>> fc179cb2d5 (GEOMESA-3113 Add system property to managing HBase deletes with visibilities (#2792))
<<<<<<< HEAD
=======
>>>>>>> d03b76c630 (GEOMESA-3102 Fix removal of user data in FileSystemDataStore.createSchema (#2787))
=======
>>>>>>> 6abf5007af (GEOMESA-3113 Add system property to managing HBase deletes with visibilities (#2792))
=======
>>>>>>> ebbfa035a9 (GEOMESA-3113 Add system property to managing HBase deletes with visibilities (#2792))
=======
>>>>>>> eb98a9fb29 (GEOMESA-3102 Fix removal of user data in FileSystemDataStore.createSchema (#2787))
=======
>>>>>>> 3adb85864f (GEOMESA-3113 Add system property to managing HBase deletes with visibilities (#2792))
=======
>>>>>>> d539392ecd (GEOMESA-3113 Add system property to managing HBase deletes with visibilities (#2792))
=======
>>>>>>> 4b926d9ec6 (GEOMESA-3102 Fix removal of user data in FileSystemDataStore.createSchema (#2787))
=======
>>>>>>> cdb062d5e9 (GEOMESA-3113 Add system property to managing HBase deletes with visibilities (#2792))
=======
=======
>>>>>>> fd0ea5e670 (GEOMESA-3102 Fix removal of user data in FileSystemDataStore.createSchema (#2787))
>>>>>>> 1a90b3062a (GEOMESA-3102 Fix removal of user data in FileSystemDataStore.createSchema (#2787))
=======
>>>>>>> 043e029470 (GEOMESA-3113 Add system property to managing HBase deletes with visibilities (#2792))
>>>>>>> f8f49130b (GEOMESA-3113 Add system property to managing HBase deletes with visibilities (#2792))
<<<<<<< HEAD
<<<<<<< HEAD
<<<<<<< HEAD
<<<<<<< HEAD
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
>>>>>>> eeb8ab478a (GEOMESA-3113 Add system property to managing HBase deletes with visibilities (#2792))
=======
>>>>>>> 6f245b0cc5 (GEOMESA-3102 Fix removal of user data in FileSystemDataStore.createSchema (#2787))
=======
>>>>>>> 15429a51ce (GEOMESA-3102 Fix removal of user data in FileSystemDataStore.createSchema (#2787))
=======
>>>>>>> 5f0745e34b (GEOMESA-3113 Add system property to managing HBase deletes with visibilities (#2792))
<<<<<<< HEAD
<<<<<<< HEAD
=======
>>>>>>> ffdb14e2a7 (GEOMESA-3102 Fix removal of user data in FileSystemDataStore.createSchema (#2787))
=======
>>>>>>> 7e8f76c0f9 (GEOMESA-3102 Fix removal of user data in FileSystemDataStore.createSchema (#2787))
=======
>>>>>>> b69b6b3ea1 (GEOMESA-3113 Add system property to managing HBase deletes with visibilities (#2792))
=======
>>>>>>> 48bb106de6 (GEOMESA-3102 Fix removal of user data in FileSystemDataStore.createSchema (#2787))
=======
=======
>>>>>>> 15429a51ce (GEOMESA-3102 Fix removal of user data in FileSystemDataStore.createSchema (#2787))
>>>>>>> 8317120c9b (GEOMESA-3102 Fix removal of user data in FileSystemDataStore.createSchema (#2787))
=======
>>>>>>> eeb8ab478a (GEOMESA-3113 Add system property to managing HBase deletes with visibilities (#2792))
=======
=======
>>>>>>> ffdb14e2a7 (GEOMESA-3102 Fix removal of user data in FileSystemDataStore.createSchema (#2787))
>>>>>>> 6f245b0cc5 (GEOMESA-3102 Fix removal of user data in FileSystemDataStore.createSchema (#2787))
>>>>>>> 4a47c538bc (GEOMESA-3113 Add system property to managing HBase deletes with visibilities (#2792))
=======
=======
>>>>>>> 4f922d74c9 (GEOMESA-3102 Fix removal of user data in FileSystemDataStore.createSchema (#2787))
=======
<<<<<<< HEAD
<<<<<<< HEAD
<<<<<<< HEAD
<<<<<<< HEAD
<<<<<<< HEAD
<<<<<<< HEAD
=======
>>>>>>> 8317120c9b (GEOMESA-3102 Fix removal of user data in FileSystemDataStore.createSchema (#2787))
=======
>>>>>>> eeb8ab478a (GEOMESA-3113 Add system property to managing HBase deletes with visibilities (#2792))
>>>>>>> b51d3046a2 (GEOMESA-3113 Add system property to managing HBase deletes with visibilities (#2792))
=======
>>>>>>> 98ce8bad96 (GEOMESA-3102 Fix removal of user data in FileSystemDataStore.createSchema (#2787))
=======
<<<<<<< HEAD
<<<<<<< HEAD
<<<<<<< HEAD
=======
>>>>>>> 15429a51ce (GEOMESA-3102 Fix removal of user data in FileSystemDataStore.createSchema (#2787))
=======
>>>>>>> b51d3046a2 (GEOMESA-3113 Add system property to managing HBase deletes with visibilities (#2792))
=======
>>>>>>> 5f0745e34b (GEOMESA-3113 Add system property to managing HBase deletes with visibilities (#2792))
=======
>>>>>>> ffdb14e2a7 (GEOMESA-3102 Fix removal of user data in FileSystemDataStore.createSchema (#2787))
=======
>>>>>>> 7e8f76c0f9 (GEOMESA-3102 Fix removal of user data in FileSystemDataStore.createSchema (#2787))
=======
>>>>>>> b51d3046a2 (GEOMESA-3113 Add system property to managing HBase deletes with visibilities (#2792))
=======
>>>>>>> b69b6b3ea1 (GEOMESA-3113 Add system property to managing HBase deletes with visibilities (#2792))
=======
>>>>>>> 48bb106de6 (GEOMESA-3102 Fix removal of user data in FileSystemDataStore.createSchema (#2787))
=======
>>>>>>> 6f245b0cc5 (GEOMESA-3102 Fix removal of user data in FileSystemDataStore.createSchema (#2787))
=======
>>>>>>> 15429a51ce (GEOMESA-3102 Fix removal of user data in FileSystemDataStore.createSchema (#2787))
=======
>>>>>>> b51d3046a2 (GEOMESA-3113 Add system property to managing HBase deletes with visibilities (#2792))
=======
>>>>>>> 5f0745e34b (GEOMESA-3113 Add system property to managing HBase deletes with visibilities (#2792))
=======
>>>>>>> ffdb14e2a7 (GEOMESA-3102 Fix removal of user data in FileSystemDataStore.createSchema (#2787))
=======
>>>>>>> 85d211ca2 (GEOMESA-3102 Fix removal of user data in FileSystemDataStore.createSchema (#2787))
>>>>>>> 02ddf6ca4 (GEOMESA-3102 Fix removal of user data in FileSystemDataStore.createSchema (#2787))
<<<<<<< HEAD
<<<<<<< HEAD
<<<<<<< HEAD
<<<<<<< HEAD
<<<<<<< HEAD
<<<<<<< HEAD
<<<<<<< HEAD
<<<<<<< HEAD
<<<<<<< HEAD
<<<<<<< HEAD
<<<<<<< HEAD
<<<<<<< HEAD
<<<<<<< HEAD
<<<<<<< HEAD
<<<<<<< HEAD
<<<<<<< HEAD
<<<<<<< HEAD
<<<<<<< HEAD
<<<<<<< HEAD
<<<<<<< HEAD
<<<<<<< HEAD
<<<<<<< HEAD
<<<<<<< HEAD
<<<<<<< HEAD
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
>>>>>>> 98e607d2fa (GEOMESA-3113 Add system property to managing HBase deletes with visibilities (#2792))
=======
>>>>>>> a738799968 (GEOMESA-3102 Fix removal of user data in FileSystemDataStore.createSchema (#2787))
=======
>>>>>>> 3d40465720 (GEOMESA-3113 Add system property to managing HBase deletes with visibilities (#2792))
=======
>>>>>>> c8431d18e4 (GEOMESA-3102 Fix removal of user data in FileSystemDataStore.createSchema (#2787))
=======
>>>>>>> 9dd4a005eb (GEOMESA-3113 Add system property to managing HBase deletes with visibilities (#2792))
=======
>>>>>>> 6f245b0cc5 (GEOMESA-3102 Fix removal of user data in FileSystemDataStore.createSchema (#2787))
=======
>>>>>>> 07c698faf4 (GEOMESA-3113 Add system property to managing HBase deletes with visibilities (#2792))
=======
>>>>>>> 15429a51ce (GEOMESA-3102 Fix removal of user data in FileSystemDataStore.createSchema (#2787))
=======
>>>>>>> e41e9641d2 (GEOMESA-3113 Add system property to managing HBase deletes with visibilities (#2792))
<<<<<<< HEAD
<<<<<<< HEAD
=======
>>>>>>> e9395c1096 (GEOMESA-3102 Fix removal of user data in FileSystemDataStore.createSchema (#2787))
=======
>>>>>>> 65460df3e6 (GEOMESA-3113 Add system property to managing HBase deletes with visibilities (#2792))
<<<<<<< HEAD
<<<<<<< HEAD
=======
>>>>>>> d2e8dad373 (GEOMESA-3102 Fix removal of user data in FileSystemDataStore.createSchema (#2787))
=======
>>>>>>> 9e74e1d9b4 (GEOMESA-3113 Add system property to managing HBase deletes with visibilities (#2792))
<<<<<<< HEAD
<<<<<<< HEAD
=======
>>>>>>> ffdb14e2a7 (GEOMESA-3102 Fix removal of user data in FileSystemDataStore.createSchema (#2787))
=======
>>>>>>> ea5f19f56b (GEOMESA-3113 Add system property to managing HBase deletes with visibilities (#2792))
<<<<<<< HEAD
=======
>>>>>>> 7e8f76c0f9 (GEOMESA-3102 Fix removal of user data in FileSystemDataStore.createSchema (#2787))
=======
>>>>>>> 1351a5baa4 (GEOMESA-3113 Add system property to managing HBase deletes with visibilities (#2792))
=======
>>>>>>> 0cb32b7425 (GEOMESA-3102 Fix removal of user data in FileSystemDataStore.createSchema (#2787))
=======
>>>>>>> ad7a284ebe (GEOMESA-3113 Add system property to managing HBase deletes with visibilities (#2792))
=======
>>>>>>> ef0351a168 (GEOMESA-3102 Fix removal of user data in FileSystemDataStore.createSchema (#2787))
=======
>>>>>>> d9ec67b278 (GEOMESA-3113 Add system property to managing HBase deletes with visibilities (#2792))
=======
>>>>>>> 48bb106de6 (GEOMESA-3102 Fix removal of user data in FileSystemDataStore.createSchema (#2787))
=======
>>>>>>> ce7c794944 (GEOMESA-3113 Add system property to managing HBase deletes with visibilities (#2792))
=======
=======
>>>>>>> 15429a51ce (GEOMESA-3102 Fix removal of user data in FileSystemDataStore.createSchema (#2787))
>>>>>>> 8317120c9b (GEOMESA-3102 Fix removal of user data in FileSystemDataStore.createSchema (#2787))
=======
>>>>>>> 98e607d2fa (GEOMESA-3113 Add system property to managing HBase deletes with visibilities (#2792))
=======
=======
>>>>>>> e9395c1096 (GEOMESA-3102 Fix removal of user data in FileSystemDataStore.createSchema (#2787))
>>>>>>> a738799968 (GEOMESA-3102 Fix removal of user data in FileSystemDataStore.createSchema (#2787))
=======
>>>>>>> 3d40465720 (GEOMESA-3113 Add system property to managing HBase deletes with visibilities (#2792))
=======
=======
>>>>>>> d2e8dad373 (GEOMESA-3102 Fix removal of user data in FileSystemDataStore.createSchema (#2787))
>>>>>>> c8431d18e4 (GEOMESA-3102 Fix removal of user data in FileSystemDataStore.createSchema (#2787))
=======
>>>>>>> 9dd4a005eb (GEOMESA-3113 Add system property to managing HBase deletes with visibilities (#2792))
=======
=======
>>>>>>> ffdb14e2a7 (GEOMESA-3102 Fix removal of user data in FileSystemDataStore.createSchema (#2787))
>>>>>>> 6f245b0cc5 (GEOMESA-3102 Fix removal of user data in FileSystemDataStore.createSchema (#2787))
=======
>>>>>>> 07c698faf4 (GEOMESA-3113 Add system property to managing HBase deletes with visibilities (#2792))
>>>>>>> a358de35a8 (GEOMESA-3102 Fix removal of user data in FileSystemDataStore.createSchema (#2787))
=======
=======
>>>>>>> 1b5719bd33 (GEOMESA-3113 Add system property to managing HBase deletes with visibilities (#2792))
<<<<<<< HEAD
<<<<<<< HEAD
<<<<<<< HEAD
=======
>>>>>>> 2212530e6b (GEOMESA-3102 Fix removal of user data in FileSystemDataStore.createSchema (#2787))
=======
>>>>>>> d38e17d229 (GEOMESA-3113 Add system property to managing HBase deletes with visibilities (#2792))
=======
>>>>>>> a1198ce095 (GEOMESA-3102 Fix removal of user data in FileSystemDataStore.createSchema (#2787))
=======
>>>>>>> 260d67442f (GEOMESA-3113 Add system property to managing HBase deletes with visibilities (#2792))
=======
=======
<<<<<<< HEAD
=======
>>>>>>> e41e9641d2 (GEOMESA-3113 Add system property to managing HBase deletes with visibilities (#2792))
>>>>>>> 98e607d2fa (GEOMESA-3113 Add system property to managing HBase deletes with visibilities (#2792))
=======
>>>>>>> 2212530e6b (GEOMESA-3102 Fix removal of user data in FileSystemDataStore.createSchema (#2787))
=======
>>>>>>> d38e17d229 (GEOMESA-3113 Add system property to managing HBase deletes with visibilities (#2792))
=======
>>>>>>> a1198ce095 (GEOMESA-3102 Fix removal of user data in FileSystemDataStore.createSchema (#2787))
=======
>>>>>>> 260d67442f (GEOMESA-3113 Add system property to managing HBase deletes with visibilities (#2792))
=======
=======
<<<<<<< HEAD
>>>>>>> 1351a5baa4 (GEOMESA-3113 Add system property to managing HBase deletes with visibilities (#2792))
=======
>>>>>>> 2212530e6b (GEOMESA-3102 Fix removal of user data in FileSystemDataStore.createSchema (#2787))
=======
>>>>>>> d38e17d229 (GEOMESA-3113 Add system property to managing HBase deletes with visibilities (#2792))
=======
>>>>>>> a1198ce095 (GEOMESA-3102 Fix removal of user data in FileSystemDataStore.createSchema (#2787))
=======
>>>>>>> 260d67442f (GEOMESA-3113 Add system property to managing HBase deletes with visibilities (#2792))
=======
=======
=======
>>>>>>> 68098a00c3 (GEOMESA-3102 Fix removal of user data in FileSystemDataStore.createSchema (#2787))
<<<<<<< HEAD
>>>>>>> e41e9641d2 (GEOMESA-3113 Add system property to managing HBase deletes with visibilities (#2792))
=======
>>>>>>> 2212530e6b (GEOMESA-3102 Fix removal of user data in FileSystemDataStore.createSchema (#2787))
=======
>>>>>>> d38e17d229 (GEOMESA-3113 Add system property to managing HBase deletes with visibilities (#2792))
=======
>>>>>>> a1198ce095 (GEOMESA-3102 Fix removal of user data in FileSystemDataStore.createSchema (#2787))
=======
>>>>>>> 260d67442f (GEOMESA-3113 Add system property to managing HBase deletes with visibilities (#2792))
=======
=======
=======
>>>>>>> 28be12542f (GEOMESA-3102 Fix removal of user data in FileSystemDataStore.createSchema (#2787))
<<<<<<< HEAD
=======
>>>>>>> ddc69d17c8 (GEOMESA-3102 Fix removal of user data in FileSystemDataStore.createSchema (#2787))
=======
>>>>>>> 68098a00c3 (GEOMESA-3102 Fix removal of user data in FileSystemDataStore.createSchema (#2787))
<<<<<<< HEAD
>>>>>>> 85d211ca2 (GEOMESA-3102 Fix removal of user data in FileSystemDataStore.createSchema (#2787))
=======
>>>>>>> 595c43086 (GEOMESA-3113 Add system property to managing HBase deletes with visibilities (#2792))
<<<<<<< HEAD
>>>>>>> 0cdf3f267 (GEOMESA-3113 Add system property to managing HBase deletes with visibilities (#2792))
<<<<<<< HEAD
<<<<<<< HEAD
<<<<<<< HEAD
<<<<<<< HEAD
<<<<<<< HEAD
<<<<<<< HEAD
<<<<<<< HEAD
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
>>>>>>> 5d46ff705f (GEOMESA-3113 Add system property to managing HBase deletes with visibilities (#2792))
=======
>>>>>>> a8b2b56cbd (GEOMESA-3113 Add system property to managing HBase deletes with visibilities (#2792))
=======
>>>>>>> 27eec0d076 (GEOMESA-3102 Fix removal of user data in FileSystemDataStore.createSchema (#2787))
=======
>>>>>>> e41e9641d2 (GEOMESA-3113 Add system property to managing HBase deletes with visibilities (#2792))
=======
>>>>>>> c6079ecae5 (GEOMESA-3113 Add system property to managing HBase deletes with visibilities (#2792))
<<<<<<< HEAD
<<<<<<< HEAD
=======
>>>>>>> e6162be24a (GEOMESA-3113 Add system property to managing HBase deletes with visibilities (#2792))
=======
>>>>>>> f502df5b55 (GEOMESA-3102 Fix removal of user data in FileSystemDataStore.createSchema (#2787))
<<<<<<< HEAD
=======
>>>>>>> 1351a5baa4 (GEOMESA-3113 Add system property to managing HBase deletes with visibilities (#2792))
=======
>>>>>>> 857489f8a0 (GEOMESA-3113 Add system property to managing HBase deletes with visibilities (#2792))
=======
>>>>>>> 665046a461 (GEOMESA-3113 Add system property to managing HBase deletes with visibilities (#2792))
=======
>>>>>>> 1382ba7fd3 (GEOMESA-3102 Fix removal of user data in FileSystemDataStore.createSchema (#2787))
=======
=======
>>>>>>> e41e9641d2 (GEOMESA-3113 Add system property to managing HBase deletes with visibilities (#2792))
>>>>>>> 98e607d2fa (GEOMESA-3113 Add system property to managing HBase deletes with visibilities (#2792))
=======
>>>>>>> 5d46ff705f (GEOMESA-3113 Add system property to managing HBase deletes with visibilities (#2792))
=======
=======
>>>>>>> e6162be24a (GEOMESA-3113 Add system property to managing HBase deletes with visibilities (#2792))
>>>>>>> a8b2b56cbd (GEOMESA-3113 Add system property to managing HBase deletes with visibilities (#2792))
=======
>>>>>>> 27eec0d076 (GEOMESA-3102 Fix removal of user data in FileSystemDataStore.createSchema (#2787))
>>>>>>> 44b15e96d9 (GEOMESA-3113 Add system property to managing HBase deletes with visibilities (#2792))
=======
>>>>>>> d488f41800 (GEOMESA-3102 Fix removal of user data in FileSystemDataStore.createSchema (#2787))
=======
>>>>>>> ac2d5a925f (GEOMESA-3113 Add system property to managing HBase deletes with visibilities (#2792))
=======
=======
>>>>>>> 85d211ca2 (GEOMESA-3102 Fix removal of user data in FileSystemDataStore.createSchema (#2787))
>>>>>>> 9ce7ed900a (GEOMESA-3102 Fix removal of user data in FileSystemDataStore.createSchema (#2787))
=======
=======
<<<<<<< HEAD
<<<<<<< HEAD
<<<<<<< HEAD
<<<<<<< HEAD
<<<<<<< HEAD
<<<<<<< HEAD
<<<<<<< HEAD
=======
>>>>>>> 84f529c13e (GEOMESA-3102 Fix removal of user data in FileSystemDataStore.createSchema (#2787))
=======
>>>>>>> 9513a4f9a1 (GEOMESA-3102 Fix removal of user data in FileSystemDataStore.createSchema (#2787))
=======
>>>>>>> ed36e40e7c (GEOMESA-3113 Add system property to managing HBase deletes with visibilities (#2792))
=======
=======
>>>>>>> 84f529c13e (GEOMESA-3102 Fix removal of user data in FileSystemDataStore.createSchema (#2787))
>>>>>>> 027b4d7d58 (GEOMESA-3102 Fix removal of user data in FileSystemDataStore.createSchema (#2787))
>>>>>>> 85d211ca2 (GEOMESA-3102 Fix removal of user data in FileSystemDataStore.createSchema (#2787))
=======
>>>>>>> 595c43086 (GEOMESA-3113 Add system property to managing HBase deletes with visibilities (#2792))
<<<<<<< HEAD
>>>>>>> 7abafecb19 (GEOMESA-3113 Add system property to managing HBase deletes with visibilities (#2792))
=======
>>>>>>> 7ef22a4bb2 (GEOMESA-3102 Fix removal of user data in FileSystemDataStore.createSchema (#2787))
=======
>>>>>>> 2b62bcaeb4 (GEOMESA-3102 Fix removal of user data in FileSystemDataStore.createSchema (#2787))
=======
=======
>>>>>>> 45dca3e07 (GEOMESA-3113 Add system property to managing HBase deletes with visibilities (#2792))
>>>>>>> afc081190b (GEOMESA-3113 Add system property to managing HBase deletes with visibilities (#2792))
<<<<<<< HEAD
<<<<<<< HEAD
<<<<<<< HEAD
<<<<<<< HEAD
<<<<<<< HEAD
<<<<<<< HEAD
=======
>>>>>>> 1b0d520fde (GEOMESA-3113 Add system property to managing HBase deletes with visibilities (#2792))
=======
>>>>>>> 871350de06 (GEOMESA-3102 Fix removal of user data in FileSystemDataStore.createSchema (#2787))
=======
>>>>>>> 75f3f455ec (GEOMESA-3102 Fix removal of user data in FileSystemDataStore.createSchema (#2787))
=======
=======
=======
<<<<<<< HEAD
<<<<<<< HEAD
<<<<<<< HEAD
<<<<<<< HEAD
<<<<<<< HEAD
<<<<<<< HEAD
<<<<<<< HEAD
=======
>>>>>>> 9bcc7591e5 (GEOMESA-3113 Add system property to managing HBase deletes with visibilities (#2792))
=======
>>>>>>> 894b6a1a15 (GEOMESA-3102 Fix removal of user data in FileSystemDataStore.createSchema (#2787))
>>>>>>> 85d211ca2 (GEOMESA-3102 Fix removal of user data in FileSystemDataStore.createSchema (#2787))
=======
>>>>>>> 595c43086 (GEOMESA-3113 Add system property to managing HBase deletes with visibilities (#2792))
<<<<<<< HEAD
>>>>>>> dc17df6c0 (GEOMESA-3113 Add system property to managing HBase deletes with visibilities (#2792))
<<<<<<< HEAD
>>>>>>> 7a3d004ad1 (GEOMESA-3113 Add system property to managing HBase deletes with visibilities (#2792))
=======
=======
=======
>>>>>>> ba7f2715c5 (GEOMESA-3102 Fix removal of user data in FileSystemDataStore.createSchema (#2787))
=======
<<<<<<< HEAD
<<<<<<< HEAD
<<<<<<< HEAD
>>>>>>> 0d3cbc99a (GEOMESA-3102 Fix removal of user data in FileSystemDataStore.createSchema (#2787))
<<<<<<< HEAD
>>>>>>> 74c6b7f8d (GEOMESA-3102 Fix removal of user data in FileSystemDataStore.createSchema (#2787))
>>>>>>> ce07ef89fe (GEOMESA-3102 Fix removal of user data in FileSystemDataStore.createSchema (#2787))
=======
>>>>>>> 76328bb49 (GEOMESA-3102 Fix removal of user data in FileSystemDataStore.createSchema (#2787))
>>>>>>> 8871b2b4bc (GEOMESA-3102 Fix removal of user data in FileSystemDataStore.createSchema (#2787))
=======
=======
>>>>>>> f8f49130b (GEOMESA-3113 Add system property to managing HBase deletes with visibilities (#2792))
>>>>>>> 91b0d6a888 (GEOMESA-3113 Add system property to managing HBase deletes with visibilities (#2792))
=======
>>>>>>> 4f922d74c9 (GEOMESA-3102 Fix removal of user data in FileSystemDataStore.createSchema (#2787))
<<<<<<< HEAD
<<<<<<< HEAD
<<<<<<< HEAD
<<<<<<< HEAD
<<<<<<< HEAD
<<<<<<< HEAD
=======
>>>>>>> 8317120c9b (GEOMESA-3102 Fix removal of user data in FileSystemDataStore.createSchema (#2787))
=======
>>>>>>> 98e607d2fa (GEOMESA-3113 Add system property to managing HBase deletes with visibilities (#2792))
=======
>>>>>>> 1b5719bd33 (GEOMESA-3113 Add system property to managing HBase deletes with visibilities (#2792))
=======
=======
<<<<<<< HEAD
<<<<<<< HEAD
<<<<<<< HEAD
<<<<<<< HEAD
<<<<<<< HEAD
<<<<<<< HEAD
=======
>>>>>>> 5d46ff705f (GEOMESA-3113 Add system property to managing HBase deletes with visibilities (#2792))
=======
>>>>>>> a8b2b56cbd (GEOMESA-3113 Add system property to managing HBase deletes with visibilities (#2792))
>>>>>>> c14e106409 (GEOMESA-3113 Add system property to managing HBase deletes with visibilities (#2792))
=======
>>>>>>> 0e67f36558 (GEOMESA-3102 Fix removal of user data in FileSystemDataStore.createSchema (#2787))
=======
<<<<<<< HEAD
<<<<<<< HEAD
<<<<<<< HEAD
<<<<<<< HEAD
=======
>>>>>>> a8b2b56cbd (GEOMESA-3113 Add system property to managing HBase deletes with visibilities (#2792))
=======
>>>>>>> 27eec0d076 (GEOMESA-3102 Fix removal of user data in FileSystemDataStore.createSchema (#2787))
=======
>>>>>>> c14e106409 (GEOMESA-3113 Add system property to managing HBase deletes with visibilities (#2792))
=======
>>>>>>> e6162be24a (GEOMESA-3113 Add system property to managing HBase deletes with visibilities (#2792))
<<<<<<< HEAD
<<<<<<< HEAD
=======
>>>>>>> f502df5b55 (GEOMESA-3102 Fix removal of user data in FileSystemDataStore.createSchema (#2787))
=======
>>>>>>> c14e106409 (GEOMESA-3113 Add system property to managing HBase deletes with visibilities (#2792))
=======
>>>>>>> 665046a461 (GEOMESA-3113 Add system property to managing HBase deletes with visibilities (#2792))
=======
>>>>>>> 1382ba7fd3 (GEOMESA-3102 Fix removal of user data in FileSystemDataStore.createSchema (#2787))
=======
>>>>>>> a8b2b56cbd (GEOMESA-3113 Add system property to managing HBase deletes with visibilities (#2792))
=======
=======
>>>>>>> f502df5b55 (GEOMESA-3102 Fix removal of user data in FileSystemDataStore.createSchema (#2787))
>>>>>>> 27eec0d076 (GEOMESA-3102 Fix removal of user data in FileSystemDataStore.createSchema (#2787))
>>>>>>> 84634d919 (GEOMESA-3113 Add system property to managing HBase deletes with visibilities (#2792))
<<<<<<< HEAD
>>>>>>> 3c4fc5a828 (GEOMESA-3113 Add system property to managing HBase deletes with visibilities (#2792))
=======
<<<<<<< HEAD
=======
<<<<<<< HEAD
>>>>>>> location-main
=======
=======
<<<<<<< HEAD
>>>>>>> 85d211ca2 (GEOMESA-3102 Fix removal of user data in FileSystemDataStore.createSchema (#2787))
=======
>>>>>>> 595c43086 (GEOMESA-3113 Add system property to managing HBase deletes with visibilities (#2792))
<<<<<<< HEAD
>>>>>>> de3e57f03 (GEOMESA-3113 Add system property to managing HBase deletes with visibilities (#2792))
<<<<<<< HEAD
=======
>>>>>>> 113b056da (GEOMESA-3113 Add system property to managing HBase deletes with visibilities (#2792))
=======
<<<<<<< HEAD
>>>>>>> 85d211ca2 (GEOMESA-3102 Fix removal of user data in FileSystemDataStore.createSchema (#2787))
=======
>>>>>>> 595c43086 (GEOMESA-3113 Add system property to managing HBase deletes with visibilities (#2792))
<<<<<<< HEAD
>>>>>>> dc17df6c0 (GEOMESA-3113 Add system property to managing HBase deletes with visibilities (#2792))
>>>>>>> 58f72e76c (GEOMESA-3113 Add system property to managing HBase deletes with visibilities (#2792))
=======
>>>>>>> 4c9fb0f6e (GEOMESA-3113 Add system property to managing HBase deletes with visibilities (#2792))
=======
>>>>>>> 72415e208a (GEOMESA-3113 Add system property to managing HBase deletes with visibilities (#2792))
=======
=======
>>>>>>> cfbdafd9de (GEOMESA-3102 Fix removal of user data in FileSystemDataStore.createSchema (#2787))
=======
=======
<<<<<<< HEAD
>>>>>>> 85d211ca2 (GEOMESA-3102 Fix removal of user data in FileSystemDataStore.createSchema (#2787))
=======
>>>>>>> 595c43086 (GEOMESA-3113 Add system property to managing HBase deletes with visibilities (#2792))
<<<<<<< HEAD
>>>>>>> de3e57f03 (GEOMESA-3113 Add system property to managing HBase deletes with visibilities (#2792))
<<<<<<< HEAD
>>>>>>> 92feb5d273 (GEOMESA-3113 Add system property to managing HBase deletes with visibilities (#2792))
=======
=======
>>>>>>> 113b056da (GEOMESA-3113 Add system property to managing HBase deletes with visibilities (#2792))
<<<<<<< HEAD
>>>>>>> 6f73f22005 (GEOMESA-3113 Add system property to managing HBase deletes with visibilities (#2792))
=======
>>>>>>> 0b22bfaa87 (GEOMESA-3113 Add system property to managing HBase deletes with visibilities (#2792))
<<<<<<< HEAD
<<<<<<< HEAD
<<<<<<< HEAD
=======
=======
=======
<<<<<<< HEAD
>>>>>>> 1506607bc9 (GEOMESA-3113 Add system property to managing HBase deletes with visibilities (#2792))
>>>>>>> 7ce9817488 (GEOMESA-3113 Add system property to managing HBase deletes with visibilities (#2792))
=======
=======
=======
>>>>>>> 5d88c18b90 (GEOMESA-3102 Fix removal of user data in FileSystemDataStore.createSchema (#2787))
<<<<<<< HEAD
>>>>>>> 5a43551b62 (GEOMESA-3113 Add system property to managing HBase deletes with visibilities (#2792))
=======
=======
<<<<<<< HEAD
>>>>>>> 1506607bc9 (GEOMESA-3113 Add system property to managing HBase deletes with visibilities (#2792))
=======
=======
=======
>>>>>>> 5d88c18b90 (GEOMESA-3102 Fix removal of user data in FileSystemDataStore.createSchema (#2787))
=======
>>>>>>> a13c4c4fa7 (GEOMESA-3102 Fix removal of user data in FileSystemDataStore.createSchema (#2787))
<<<<<<< HEAD
>>>>>>> 85d211ca2 (GEOMESA-3102 Fix removal of user data in FileSystemDataStore.createSchema (#2787))
=======
>>>>>>> 595c43086 (GEOMESA-3113 Add system property to managing HBase deletes with visibilities (#2792))
<<<<<<< HEAD
>>>>>>> dc17df6c0 (GEOMESA-3113 Add system property to managing HBase deletes with visibilities (#2792))
<<<<<<< HEAD
<<<<<<< HEAD
<<<<<<< HEAD
<<<<<<< HEAD
<<<<<<< HEAD
<<<<<<< HEAD
<<<<<<< HEAD
<<<<<<< HEAD
=======
>>>>>>> 0c44f82169 (GEOMESA-3102 Fix removal of user data in FileSystemDataStore.createSchema (#2787))
=======
>>>>>>> 1506607bc9 (GEOMESA-3113 Add system property to managing HBase deletes with visibilities (#2792))
=======
>>>>>>> 5d88c18b90 (GEOMESA-3102 Fix removal of user data in FileSystemDataStore.createSchema (#2787))
<<<<<<< HEAD
=======
>>>>>>> 5a43551b62 (GEOMESA-3113 Add system property to managing HBase deletes with visibilities (#2792))
=======
>>>>>>> a13c4c4fa7 (GEOMESA-3102 Fix removal of user data in FileSystemDataStore.createSchema (#2787))
=======
=======
>>>>>>> 1506607bc9 (GEOMESA-3113 Add system property to managing HBase deletes with visibilities (#2792))
>>>>>>> 7ce9817488 (GEOMESA-3113 Add system property to managing HBase deletes with visibilities (#2792))
=======
>>>>>>> 0c44f82169 (GEOMESA-3102 Fix removal of user data in FileSystemDataStore.createSchema (#2787))
>>>>>>> 58f72e76c (GEOMESA-3113 Add system property to managing HBase deletes with visibilities (#2792))
<<<<<<< HEAD
>>>>>>> 8a234c7900 (GEOMESA-3113 Add system property to managing HBase deletes with visibilities (#2792))
=======
=======
>>>>>>> 4c9fb0f6e (GEOMESA-3113 Add system property to managing HBase deletes with visibilities (#2792))
<<<<<<< HEAD
>>>>>>> b51d3046a2 (GEOMESA-3113 Add system property to managing HBase deletes with visibilities (#2792))
=======
=======
>>>>>>> 72415e208a (GEOMESA-3113 Add system property to managing HBase deletes with visibilities (#2792))
<<<<<<< HEAD
>>>>>>> c14e106409 (GEOMESA-3113 Add system property to managing HBase deletes with visibilities (#2792))
=======
=======
=======
>>>>>>> 5e6674847 (GEOMESA-3102 Fix removal of user data in FileSystemDataStore.createSchema (#2787))
<<<<<<< HEAD
<<<<<<< HEAD
<<<<<<< HEAD
<<<<<<< HEAD
<<<<<<< HEAD
<<<<<<< HEAD
<<<<<<< HEAD
=======
>>>>>>> 27eec0d076 (GEOMESA-3102 Fix removal of user data in FileSystemDataStore.createSchema (#2787))
=======
>>>>>>> afcf525d7d (GEOMESA-3113 Add system property to managing HBase deletes with visibilities (#2792))
>>>>>>> 5521d97d99 (GEOMESA-3102 Fix removal of user data in FileSystemDataStore.createSchema (#2787))
<<<<<<< HEAD
>>>>>>> 0e67f36558 (GEOMESA-3102 Fix removal of user data in FileSystemDataStore.createSchema (#2787))
=======
=======
=======
>>>>>>> 9814eb976 (GEOMESA-3113 Add system property to managing HBase deletes with visibilities (#2792))
<<<<<<< HEAD
<<<<<<< HEAD
<<<<<<< HEAD
<<<<<<< HEAD
=======
>>>>>>> e11c16ba5d (GEOMESA-3102 Fix removal of user data in FileSystemDataStore.createSchema (#2787))
>>>>>>> 26fc359a06 (GEOMESA-3113 Add system property to managing HBase deletes with visibilities (#2792))
<<<<<<< HEAD
>>>>>>> 56f97cd271 (GEOMESA-3113 Add system property to managing HBase deletes with visibilities (#2792))
=======
=======
=======
=======
>>>>>>> 85d211ca2 (GEOMESA-3102 Fix removal of user data in FileSystemDataStore.createSchema (#2787))
>>>>>>> 7119f2c52 (GEOMESA-3102 Fix removal of user data in FileSystemDataStore.createSchema (#2787))
<<<<<<< HEAD
<<<<<<< HEAD
<<<<<<< HEAD
<<<<<<< HEAD
=======
>>>>>>> 00494e0bcf (GEOMESA-3113 Add system property to managing HBase deletes with visibilities (#2792))
>>>>>>> adf2ac19a8 (GEOMESA-3102 Fix removal of user data in FileSystemDataStore.createSchema (#2787))
<<<<<<< HEAD
>>>>>>> 89ea8190e2 (GEOMESA-3102 Fix removal of user data in FileSystemDataStore.createSchema (#2787))
=======
=======
=======
=======
<<<<<<< HEAD
>>>>>>> 85d211ca2 (GEOMESA-3102 Fix removal of user data in FileSystemDataStore.createSchema (#2787))
=======
>>>>>>> 595c43086 (GEOMESA-3113 Add system property to managing HBase deletes with visibilities (#2792))
<<<<<<< HEAD
>>>>>>> 803762354 (GEOMESA-3113 Add system property to managing HBase deletes with visibilities (#2792))
<<<<<<< HEAD
>>>>>>> e62505d539 (GEOMESA-3113 Add system property to managing HBase deletes with visibilities (#2792))
<<<<<<< HEAD
>>>>>>> 3226e92d8e (GEOMESA-3113 Add system property to managing HBase deletes with visibilities (#2792))
=======
=======
=======
=======
>>>>>>> 7ef22a4bb (GEOMESA-3102 Fix removal of user data in FileSystemDataStore.createSchema (#2787))
=======
<<<<<<< HEAD
>>>>>>> d24328f760 (GEOMESA-3102 Fix removal of user data in FileSystemDataStore.createSchema (#2787))
=======
=======
>>>>>>> e2aaf740bf (GEOMESA-3102 Fix removal of user data in FileSystemDataStore.createSchema (#2787))
<<<<<<< HEAD
<<<<<<< HEAD
>>>>>>> d24328f760 (GEOMESA-3102 Fix removal of user data in FileSystemDataStore.createSchema (#2787))
=======
=======
>>>>>>> e2aaf740bf (GEOMESA-3102 Fix removal of user data in FileSystemDataStore.createSchema (#2787))
=======
>>>>>>> 8c775c1126 (GEOMESA-3102 Fix removal of user data in FileSystemDataStore.createSchema (#2787))
<<<<<<< HEAD
<<<<<<< HEAD
<<<<<<< HEAD
>>>>>>> 0d3cbc99a (GEOMESA-3102 Fix removal of user data in FileSystemDataStore.createSchema (#2787))
<<<<<<< HEAD
<<<<<<< HEAD
<<<<<<< HEAD
<<<<<<< HEAD
<<<<<<< HEAD
<<<<<<< HEAD
=======
>>>>>>> e2aaf740bf (GEOMESA-3102 Fix removal of user data in FileSystemDataStore.createSchema (#2787))
=======
>>>>>>> 8c775c1126 (GEOMESA-3102 Fix removal of user data in FileSystemDataStore.createSchema (#2787))
=======
>>>>>>> 01ee16a4c0 (GEOMESA-3102 Fix removal of user data in FileSystemDataStore.createSchema (#2787))
=======
=======
>>>>>>> e2aaf740bf (GEOMESA-3102 Fix removal of user data in FileSystemDataStore.createSchema (#2787))
>>>>>>> eda8d4d014 (GEOMESA-3102 Fix removal of user data in FileSystemDataStore.createSchema (#2787))
>>>>>>> f0b61142b (GEOMESA-3102 Fix removal of user data in FileSystemDataStore.createSchema (#2787))
<<<<<<< HEAD
>>>>>>> 0a6aff78fb (GEOMESA-3102 Fix removal of user data in FileSystemDataStore.createSchema (#2787))
<<<<<<< HEAD
>>>>>>> d9cabf401c (GEOMESA-3102 Fix removal of user data in FileSystemDataStore.createSchema (#2787))
=======
=======
=======
>>>>>>> bd17bd131 (GEOMESA-3102 Fix removal of user data in FileSystemDataStore.createSchema (#2787))
<<<<<<< HEAD
>>>>>>> c555446b8b (GEOMESA-3102 Fix removal of user data in FileSystemDataStore.createSchema (#2787))
<<<<<<< HEAD
>>>>>>> 1230d64006 (GEOMESA-3102 Fix removal of user data in FileSystemDataStore.createSchema (#2787))
=======
=======
=======
=======
>>>>>>> 45dca3e07 (GEOMESA-3113 Add system property to managing HBase deletes with visibilities (#2792))
>>>>>>> ca22354dd (GEOMESA-3113 Add system property to managing HBase deletes with visibilities (#2792))
<<<<<<< HEAD
<<<<<<< HEAD
<<<<<<< HEAD
<<<<<<< HEAD
=======
>>>>>>> 78439fc2da (GEOMESA-3102 Fix removal of user data in FileSystemDataStore.createSchema (#2787))
>>>>>>> 797b02396b (GEOMESA-3113 Add system property to managing HBase deletes with visibilities (#2792))
<<<<<<< HEAD
>>>>>>> cd5564bac6 (GEOMESA-3113 Add system property to managing HBase deletes with visibilities (#2792))
=======
=======
=======
>>>>>>> c385f7994 (GEOMESA-3102 Fix removal of user data in FileSystemDataStore.createSchema (#2787))
<<<<<<< HEAD
<<<<<<< HEAD
<<<<<<< HEAD
<<<<<<< HEAD
=======
>>>>>>> 64c0e084b5 (GEOMESA-3113 Add system property to managing HBase deletes with visibilities (#2792))
>>>>>>> 3171e7407d (GEOMESA-3102 Fix removal of user data in FileSystemDataStore.createSchema (#2787))
<<<<<<< HEAD
>>>>>>> 038b4ca087 (GEOMESA-3102 Fix removal of user data in FileSystemDataStore.createSchema (#2787))
=======
=======
=======
=======
=======
<<<<<<< HEAD
<<<<<<< HEAD
<<<<<<< HEAD
<<<<<<< HEAD
=======
>>>>>>> 73cb7a0517 (GEOMESA-3102 Fix removal of user data in FileSystemDataStore.createSchema (#2787))
>>>>>>> 85d211ca2 (GEOMESA-3102 Fix removal of user data in FileSystemDataStore.createSchema (#2787))
=======
>>>>>>> 595c43086 (GEOMESA-3113 Add system property to managing HBase deletes with visibilities (#2792))
<<<<<<< HEAD
>>>>>>> dc17df6c0 (GEOMESA-3113 Add system property to managing HBase deletes with visibilities (#2792))
<<<<<<< HEAD
>>>>>>> 2d758409c (GEOMESA-3113 Add system property to managing HBase deletes with visibilities (#2792))
<<<<<<< HEAD
>>>>>>> 237494b1cc (GEOMESA-3113 Add system property to managing HBase deletes with visibilities (#2792))
<<<<<<< HEAD
>>>>>>> d774dc1d12 (GEOMESA-3113 Add system property to managing HBase deletes with visibilities (#2792))
=======
=======
=======
=======
>>>>>>> a030b80514 (GEOMESA-3102 Fix removal of user data in FileSystemDataStore.createSchema (#2787))
=======
=======
>>>>>>> f4402ff40c (GEOMESA-3102 Fix removal of user data in FileSystemDataStore.createSchema (#2787))
=======
<<<<<<< HEAD
<<<<<<< HEAD
<<<<<<< HEAD
>>>>>>> 0d3cbc99a (GEOMESA-3102 Fix removal of user data in FileSystemDataStore.createSchema (#2787))
<<<<<<< HEAD
>>>>>>> 74c6b7f8d (GEOMESA-3102 Fix removal of user data in FileSystemDataStore.createSchema (#2787))
<<<<<<< HEAD
>>>>>>> 5a7f44513 (GEOMESA-3102 Fix removal of user data in FileSystemDataStore.createSchema (#2787))
<<<<<<< HEAD
>>>>>>> c7eb576a40 (GEOMESA-3102 Fix removal of user data in FileSystemDataStore.createSchema (#2787))
<<<<<<< HEAD
>>>>>>> 0645a0bbaf (GEOMESA-3102 Fix removal of user data in FileSystemDataStore.createSchema (#2787))
=======
=======
=======
>>>>>>> 5c68fb7d1 (GEOMESA-3102 Fix removal of user data in FileSystemDataStore.createSchema (#2787))
<<<<<<< HEAD
>>>>>>> 9ec1f049a9 (GEOMESA-3102 Fix removal of user data in FileSystemDataStore.createSchema (#2787))
<<<<<<< HEAD
>>>>>>> e8b1c389e3 (GEOMESA-3102 Fix removal of user data in FileSystemDataStore.createSchema (#2787))
=======
=======
=======
=======
>>>>>>> f8f49130b (GEOMESA-3113 Add system property to managing HBase deletes with visibilities (#2792))
>>>>>>> 4a47c538b (GEOMESA-3113 Add system property to managing HBase deletes with visibilities (#2792))
<<<<<<< HEAD
<<<<<<< HEAD
<<<<<<< HEAD
<<<<<<< HEAD
=======
>>>>>>> a738799968 (GEOMESA-3102 Fix removal of user data in FileSystemDataStore.createSchema (#2787))
>>>>>>> a0d6da1831 (GEOMESA-3113 Add system property to managing HBase deletes with visibilities (#2792))
<<<<<<< HEAD
>>>>>>> 6abf5007af (GEOMESA-3113 Add system property to managing HBase deletes with visibilities (#2792))
=======
=======
=======
>>>>>>> a358de35a (GEOMESA-3102 Fix removal of user data in FileSystemDataStore.createSchema (#2787))
<<<<<<< HEAD
<<<<<<< HEAD
<<<<<<< HEAD
<<<<<<< HEAD
=======
>>>>>>> 3d40465720 (GEOMESA-3113 Add system property to managing HBase deletes with visibilities (#2792))
>>>>>>> 1faf0d16f2 (GEOMESA-3102 Fix removal of user data in FileSystemDataStore.createSchema (#2787))
<<<<<<< HEAD
>>>>>>> 2212530e6b (GEOMESA-3102 Fix removal of user data in FileSystemDataStore.createSchema (#2787))
=======
=======
=======
=======
>>>>>>> 1b5719bd3 (GEOMESA-3113 Add system property to managing HBase deletes with visibilities (#2792))
<<<<<<< HEAD
=======
<<<<<<< HEAD
<<<<<<< HEAD
>>>>>>> a8e7273bb0 (GEOMESA-3113 Add system property to managing HBase deletes with visibilities (#2792))
=======
=======
<<<<<<< HEAD
>>>>>>> d9ec67b278 (GEOMESA-3113 Add system property to managing HBase deletes with visibilities (#2792))
=======
<<<<<<< HEAD
<<<<<<< HEAD
>>>>>>> a8e7273bb0 (GEOMESA-3113 Add system property to managing HBase deletes with visibilities (#2792))
=======
=======
>>>>>>> 9e74e1d9b4 (GEOMESA-3113 Add system property to managing HBase deletes with visibilities (#2792))
=======
>>>>>>> a8e7273bb0 (GEOMESA-3113 Add system property to managing HBase deletes with visibilities (#2792))
=======
>>>>>>> ea5f19f56b (GEOMESA-3113 Add system property to managing HBase deletes with visibilities (#2792))
=======
<<<<<<< HEAD
<<<<<<< HEAD
=======
>>>>>>> 9e74e1d9b4 (GEOMESA-3113 Add system property to managing HBase deletes with visibilities (#2792))
=======
>>>>>>> 9dd4a005eb (GEOMESA-3113 Add system property to managing HBase deletes with visibilities (#2792))
=======
>>>>>>> 07c698faf4 (GEOMESA-3113 Add system property to managing HBase deletes with visibilities (#2792))
>>>>>>> 85d211ca2 (GEOMESA-3102 Fix removal of user data in FileSystemDataStore.createSchema (#2787))
=======
>>>>>>> 595c43086 (GEOMESA-3113 Add system property to managing HBase deletes with visibilities (#2792))
<<<<<<< HEAD
>>>>>>> 0cdf3f267 (GEOMESA-3113 Add system property to managing HBase deletes with visibilities (#2792))
<<<<<<< HEAD
<<<<<<< HEAD
<<<<<<< HEAD
<<<<<<< HEAD
<<<<<<< HEAD
<<<<<<< HEAD
<<<<<<< HEAD
<<<<<<< HEAD
=======
>>>>>>> 07c698faf4 (GEOMESA-3113 Add system property to managing HBase deletes with visibilities (#2792))
=======
>>>>>>> 9e74e1d9b4 (GEOMESA-3113 Add system property to managing HBase deletes with visibilities (#2792))
=======
>>>>>>> ea5f19f56b (GEOMESA-3113 Add system property to managing HBase deletes with visibilities (#2792))
<<<<<<< HEAD
=======
>>>>>>> d9ec67b278 (GEOMESA-3113 Add system property to managing HBase deletes with visibilities (#2792))
=======
>>>>>>> ce7c794944 (GEOMESA-3113 Add system property to managing HBase deletes with visibilities (#2792))
=======
=======
>>>>>>> 9e74e1d9b4 (GEOMESA-3113 Add system property to managing HBase deletes with visibilities (#2792))
>>>>>>> 9dd4a005eb (GEOMESA-3113 Add system property to managing HBase deletes with visibilities (#2792))
=======
>>>>>>> 07c698faf4 (GEOMESA-3113 Add system property to managing HBase deletes with visibilities (#2792))
>>>>>>> 44b15e96d (GEOMESA-3113 Add system property to managing HBase deletes with visibilities (#2792))
<<<<<<< HEAD
>>>>>>> e5413df04f (GEOMESA-3113 Add system property to managing HBase deletes with visibilities (#2792))
<<<<<<< HEAD
>>>>>>> d38e17d229 (GEOMESA-3113 Add system property to managing HBase deletes with visibilities (#2792))
=======
=======
=======
>>>>>>> d488f4180 (GEOMESA-3102 Fix removal of user data in FileSystemDataStore.createSchema (#2787))
<<<<<<< HEAD
>>>>>>> 8aa4f55ef6 (GEOMESA-3102 Fix removal of user data in FileSystemDataStore.createSchema (#2787))
<<<<<<< HEAD
>>>>>>> aeb7c3ed76 (GEOMESA-3102 Fix removal of user data in FileSystemDataStore.createSchema (#2787))
=======
=======
=======
>>>>>>> ac2d5a925 (GEOMESA-3113 Add system property to managing HBase deletes with visibilities (#2792))
<<<<<<< HEAD
<<<<<<< HEAD
<<<<<<< HEAD
<<<<<<< HEAD
=======
>>>>>>> 4d7289a2fe (GEOMESA-3102 Fix removal of user data in FileSystemDataStore.createSchema (#2787))
>>>>>>> 11addb1ce7 (GEOMESA-3113 Add system property to managing HBase deletes with visibilities (#2792))
<<<<<<< HEAD
>>>>>>> 42bfd74c63 (GEOMESA-3113 Add system property to managing HBase deletes with visibilities (#2792))
=======
=======
=======
=======
>>>>>>> 85d211ca2 (GEOMESA-3102 Fix removal of user data in FileSystemDataStore.createSchema (#2787))
>>>>>>> 9ce7ed900 (GEOMESA-3102 Fix removal of user data in FileSystemDataStore.createSchema (#2787))
<<<<<<< HEAD
<<<<<<< HEAD
<<<<<<< HEAD
<<<<<<< HEAD
=======
>>>>>>> 5af1e798d5 (GEOMESA-3113 Add system property to managing HBase deletes with visibilities (#2792))
>>>>>>> 90d85d9b4b (GEOMESA-3102 Fix removal of user data in FileSystemDataStore.createSchema (#2787))
<<<<<<< HEAD
>>>>>>> bce9dc3e0e (GEOMESA-3102 Fix removal of user data in FileSystemDataStore.createSchema (#2787))
=======
=======
=======
=======
>>>>>>> 85d211ca2 (GEOMESA-3102 Fix removal of user data in FileSystemDataStore.createSchema (#2787))
=======
>>>>>>> 595c43086 (GEOMESA-3113 Add system property to managing HBase deletes with visibilities (#2792))
>>>>>>> 7abafecb1 (GEOMESA-3113 Add system property to managing HBase deletes with visibilities (#2792))
<<<<<<< HEAD
<<<<<<< HEAD
<<<<<<< HEAD
<<<<<<< HEAD
=======
>>>>>>> eda8d4d014 (GEOMESA-3102 Fix removal of user data in FileSystemDataStore.createSchema (#2787))
>>>>>>> 1468e59829 (GEOMESA-3113 Add system property to managing HBase deletes with visibilities (#2792))
<<<<<<< HEAD
>>>>>>> 9c750992ef (GEOMESA-3113 Add system property to managing HBase deletes with visibilities (#2792))
=======
=======
=======
>>>>>>> 7ef22a4bb (GEOMESA-3102 Fix removal of user data in FileSystemDataStore.createSchema (#2787))
<<<<<<< HEAD
<<<<<<< HEAD
<<<<<<< HEAD
<<<<<<< HEAD
=======
>>>>>>> f22bf41646 (GEOMESA-3102 Fix removal of user data in FileSystemDataStore.createSchema (#2787))
>>>>>>> c8d3361f41 (GEOMESA-3102 Fix removal of user data in FileSystemDataStore.createSchema (#2787))
<<<<<<< HEAD
>>>>>>> 48dcb085fa (GEOMESA-3102 Fix removal of user data in FileSystemDataStore.createSchema (#2787))
=======
=======
=======
>>>>>>> 2b62bcaeb (GEOMESA-3102 Fix removal of user data in FileSystemDataStore.createSchema (#2787))
<<<<<<< HEAD
<<<<<<< HEAD
<<<<<<< HEAD
<<<<<<< HEAD
=======
>>>>>>> ffcb7ff3ae (GEOMESA-3113 Add system property to managing HBase deletes with visibilities (#2792))
>>>>>>> a618e2ba0a (GEOMESA-3102 Fix removal of user data in FileSystemDataStore.createSchema (#2787))
<<<<<<< HEAD
>>>>>>> 687ba5655c (GEOMESA-3102 Fix removal of user data in FileSystemDataStore.createSchema (#2787))
=======
=======
=======
=======
>>>>>>> 45dca3e07 (GEOMESA-3113 Add system property to managing HBase deletes with visibilities (#2792))
>>>>>>> afc081190 (GEOMESA-3113 Add system property to managing HBase deletes with visibilities (#2792))
<<<<<<< HEAD
<<<<<<< HEAD
<<<<<<< HEAD
<<<<<<< HEAD
=======
>>>>>>> 4b0c56ce56 (GEOMESA-3102 Fix removal of user data in FileSystemDataStore.createSchema (#2787))
>>>>>>> 65360f96a0 (GEOMESA-3113 Add system property to managing HBase deletes with visibilities (#2792))
<<<<<<< HEAD
>>>>>>> 97a911d79c (GEOMESA-3113 Add system property to managing HBase deletes with visibilities (#2792))
=======
=======
=======
>>>>>>> 75f3f455e (GEOMESA-3102 Fix removal of user data in FileSystemDataStore.createSchema (#2787))
<<<<<<< HEAD
<<<<<<< HEAD
<<<<<<< HEAD
<<<<<<< HEAD
=======
>>>>>>> 9ac1262e54 (GEOMESA-3113 Add system property to managing HBase deletes with visibilities (#2792))
>>>>>>> 20dc993a76 (GEOMESA-3102 Fix removal of user data in FileSystemDataStore.createSchema (#2787))
<<<<<<< HEAD
>>>>>>> 33d2777a8a (GEOMESA-3102 Fix removal of user data in FileSystemDataStore.createSchema (#2787))
=======
=======
=======
=======
=======
<<<<<<< HEAD
<<<<<<< HEAD
<<<<<<< HEAD
<<<<<<< HEAD
=======
>>>>>>> f1cbf28b81 (GEOMESA-3102 Fix removal of user data in FileSystemDataStore.createSchema (#2787))
>>>>>>> 85d211ca2 (GEOMESA-3102 Fix removal of user data in FileSystemDataStore.createSchema (#2787))
=======
>>>>>>> 595c43086 (GEOMESA-3113 Add system property to managing HBase deletes with visibilities (#2792))
<<<<<<< HEAD
>>>>>>> dc17df6c0 (GEOMESA-3113 Add system property to managing HBase deletes with visibilities (#2792))
<<<<<<< HEAD
>>>>>>> 7a3d004ad (GEOMESA-3113 Add system property to managing HBase deletes with visibilities (#2792))
<<<<<<< HEAD
>>>>>>> bd6dd934cc (GEOMESA-3113 Add system property to managing HBase deletes with visibilities (#2792))
<<<<<<< HEAD
>>>>>>> cc5f917a7c (GEOMESA-3113 Add system property to managing HBase deletes with visibilities (#2792))
=======
=======
=======
=======
=======
<<<<<<< HEAD
>>>>>>> fb62d8dca1 (GEOMESA-3102 Fix removal of user data in FileSystemDataStore.createSchema (#2787))
=======
>>>>>>> f4402ff40c (GEOMESA-3102 Fix removal of user data in FileSystemDataStore.createSchema (#2787))
>>>>>>> cfbdafd9de (GEOMESA-3102 Fix removal of user data in FileSystemDataStore.createSchema (#2787))
=======
<<<<<<< HEAD
<<<<<<< HEAD
<<<<<<< HEAD
>>>>>>> 0d3cbc99a (GEOMESA-3102 Fix removal of user data in FileSystemDataStore.createSchema (#2787))
<<<<<<< HEAD
>>>>>>> 74c6b7f8d (GEOMESA-3102 Fix removal of user data in FileSystemDataStore.createSchema (#2787))
>>>>>>> ce07ef89f (GEOMESA-3102 Fix removal of user data in FileSystemDataStore.createSchema (#2787))
<<<<<<< HEAD
<<<<<<< HEAD
>>>>>>> b6118ef7a5 (GEOMESA-3102 Fix removal of user data in FileSystemDataStore.createSchema (#2787))
<<<<<<< HEAD
>>>>>>> 8309b2b098 (GEOMESA-3102 Fix removal of user data in FileSystemDataStore.createSchema (#2787))
=======
=======
=======
>>>>>>> 8871b2b4b (GEOMESA-3102 Fix removal of user data in FileSystemDataStore.createSchema (#2787))
<<<<<<< HEAD
<<<<<<< HEAD
>>>>>>> 495c744326 (GEOMESA-3102 Fix removal of user data in FileSystemDataStore.createSchema (#2787))
<<<<<<< HEAD
>>>>>>> a49ee0e00a (GEOMESA-3102 Fix removal of user data in FileSystemDataStore.createSchema (#2787))
=======
=======
=======
=======
>>>>>>> f8f49130b (GEOMESA-3113 Add system property to managing HBase deletes with visibilities (#2792))
>>>>>>> 91b0d6a88 (GEOMESA-3113 Add system property to managing HBase deletes with visibilities (#2792))
<<<<<<< HEAD
<<<<<<< HEAD
<<<<<<< HEAD
<<<<<<< HEAD
=======
>>>>>>> c8431d18e4 (GEOMESA-3102 Fix removal of user data in FileSystemDataStore.createSchema (#2787))
>>>>>>> 49d3846b23 (GEOMESA-3113 Add system property to managing HBase deletes with visibilities (#2792))
<<<<<<< HEAD
>>>>>>> 3adb85864f (GEOMESA-3113 Add system property to managing HBase deletes with visibilities (#2792))
=======
=======
=======
>>>>>>> 4f922d74c (GEOMESA-3102 Fix removal of user data in FileSystemDataStore.createSchema (#2787))
<<<<<<< HEAD
<<<<<<< HEAD
<<<<<<< HEAD
<<<<<<< HEAD
=======
>>>>>>> 9dd4a005eb (GEOMESA-3113 Add system property to managing HBase deletes with visibilities (#2792))
>>>>>>> 155d6a9469 (GEOMESA-3102 Fix removal of user data in FileSystemDataStore.createSchema (#2787))
<<<<<<< HEAD
>>>>>>> a1198ce095 (GEOMESA-3102 Fix removal of user data in FileSystemDataStore.createSchema (#2787))
=======
=======
=======
>>>>>>> 1b5719bd3 (GEOMESA-3113 Add system property to managing HBase deletes with visibilities (#2792))
>>>>>>> e4ee051914 (GEOMESA-3113 Add system property to managing HBase deletes with visibilities (#2792))
>>>>>>> 260d67442f (GEOMESA-3113 Add system property to managing HBase deletes with visibilities (#2792))
=======
>>>>>>> 1c115a8f87 (GEOMESA-3102 Fix removal of user data in FileSystemDataStore.createSchema (#2787))
<<<<<<< HEAD
<<<<<<< HEAD
<<<<<<< HEAD
<<<<<<< HEAD
<<<<<<< HEAD
<<<<<<< HEAD
=======
>>>>>>> f148adeccd (GEOMESA-3102 Fix removal of user data in FileSystemDataStore.createSchema (#2787))
=======
>>>>>>> b448819e24 (GEOMESA-3113 Add system property to managing HBase deletes with visibilities (#2792))
=======
>>>>>>> bcf168a888 (GEOMESA-3113 Add system property to managing HBase deletes with visibilities (#2792))
=======
=======
>>>>>>> 85d211ca2 (GEOMESA-3102 Fix removal of user data in FileSystemDataStore.createSchema (#2787))
>>>>>>> ffca7b7bd4 (GEOMESA-3102 Fix removal of user data in FileSystemDataStore.createSchema (#2787))
<<<<<<< HEAD
<<<<<<< HEAD
<<<<<<< HEAD
<<<<<<< HEAD
<<<<<<< HEAD
<<<<<<< HEAD
=======
>>>>>>> a834a844c7 (GEOMESA-3113 Add system property to managing HBase deletes with visibilities (#2792))
=======
>>>>>>> 19e79eeeaa (GEOMESA-3113 Add system property to managing HBase deletes with visibilities (#2792))
=======
>>>>>>> d71800c037 (GEOMESA-3102 Fix removal of user data in FileSystemDataStore.createSchema (#2787))
=======
=======
>>>>>>> a834a844c7 (GEOMESA-3113 Add system property to managing HBase deletes with visibilities (#2792))
>>>>>>> f68b76f4b8 (GEOMESA-3113 Add system property to managing HBase deletes with visibilities (#2792))
=======
=======
>>>>>>> 85d211ca2 (GEOMESA-3102 Fix removal of user data in FileSystemDataStore.createSchema (#2787))
=======
>>>>>>> 595c43086 (GEOMESA-3113 Add system property to managing HBase deletes with visibilities (#2792))
>>>>>>> 0c12a2c53d (GEOMESA-3113 Add system property to managing HBase deletes with visibilities (#2792))
<<<<<<< HEAD
<<<<<<< HEAD
<<<<<<< HEAD
<<<<<<< HEAD
<<<<<<< HEAD
<<<<<<< HEAD
=======
>>>>>>> f68b76f4b8 (GEOMESA-3113 Add system property to managing HBase deletes with visibilities (#2792))
=======
>>>>>>> 027b4d7d58 (GEOMESA-3102 Fix removal of user data in FileSystemDataStore.createSchema (#2787))
=======
>>>>>>> ba7f2715c5 (GEOMESA-3102 Fix removal of user data in FileSystemDataStore.createSchema (#2787))
=======
>>>>>>> 526e71304c (GEOMESA-3102 Fix removal of user data in FileSystemDataStore.createSchema (#2787))
<<<<<<< HEAD
<<<<<<< HEAD
<<<<<<< HEAD
<<<<<<< HEAD
<<<<<<< HEAD
<<<<<<< HEAD
=======
>>>>>>> 0d4496a2f2 (GEOMESA-3113 Add system property to managing HBase deletes with visibilities (#2792))
=======
>>>>>>> 0121c0dbad (GEOMESA-3113 Add system property to managing HBase deletes with visibilities (#2792))
=======
>>>>>>> 4d1cac1d60 (GEOMESA-3102 Fix removal of user data in FileSystemDataStore.createSchema (#2787))
=======
=======
>>>>>>> 0d4496a2f2 (GEOMESA-3113 Add system property to managing HBase deletes with visibilities (#2792))
>>>>>>> cb8df4c76b (GEOMESA-3113 Add system property to managing HBase deletes with visibilities (#2792))
=======
=======
>>>>>>> 45dca3e07 (GEOMESA-3113 Add system property to managing HBase deletes with visibilities (#2792))
>>>>>>> 074e4b10b9 (GEOMESA-3113 Add system property to managing HBase deletes with visibilities (#2792))
<<<<<<< HEAD
<<<<<<< HEAD
<<<<<<< HEAD
<<<<<<< HEAD
<<<<<<< HEAD
<<<<<<< HEAD
=======
>>>>>>> cb8df4c76b (GEOMESA-3113 Add system property to managing HBase deletes with visibilities (#2792))
=======
>>>>>>> 265d436467 (GEOMESA-3102 Fix removal of user data in FileSystemDataStore.createSchema (#2787))
=======
>>>>>>> 9c809610d5 (GEOMESA-3102 Fix removal of user data in FileSystemDataStore.createSchema (#2787))
=======
>>>>>>> 0b22bfaa87 (GEOMESA-3113 Add system property to managing HBase deletes with visibilities (#2792))
<<<<<<< HEAD
<<<<<<< HEAD
<<<<<<< HEAD
<<<<<<< HEAD
<<<<<<< HEAD
<<<<<<< HEAD
=======
>>>>>>> 7ce9817488 (GEOMESA-3113 Add system property to managing HBase deletes with visibilities (#2792))
=======
>>>>>>> 0c44f82169 (GEOMESA-3102 Fix removal of user data in FileSystemDataStore.createSchema (#2787))
=======
>>>>>>> a030b80514 (GEOMESA-3102 Fix removal of user data in FileSystemDataStore.createSchema (#2787))
=======
>>>>>>> 76328bb49 (GEOMESA-3102 Fix removal of user data in FileSystemDataStore.createSchema (#2787))
>>>>>>> 9e842c2021 (GEOMESA-3102 Fix removal of user data in FileSystemDataStore.createSchema (#2787))
<<<<<<< HEAD
<<<<<<< HEAD
<<<<<<< HEAD
<<<<<<< HEAD
<<<<<<< HEAD
<<<<<<< HEAD
=======
>>>>>>> de00bd1943 (GEOMESA-3113 Add system property to managing HBase deletes with visibilities (#2792))
=======
>>>>>>> 6bef55a1ea (GEOMESA-3113 Add system property to managing HBase deletes with visibilities (#2792))
=======
>>>>>>> 02465f5f58 (GEOMESA-3102 Fix removal of user data in FileSystemDataStore.createSchema (#2787))
=======
=======
>>>>>>> de00bd1943 (GEOMESA-3113 Add system property to managing HBase deletes with visibilities (#2792))
>>>>>>> 8eb59bcc3c (GEOMESA-3113 Add system property to managing HBase deletes with visibilities (#2792))
=======
=======
>>>>>>> f8f49130b (GEOMESA-3113 Add system property to managing HBase deletes with visibilities (#2792))
>>>>>>> 0f0dd6560e (GEOMESA-3113 Add system property to managing HBase deletes with visibilities (#2792))
<<<<<<< HEAD
<<<<<<< HEAD
<<<<<<< HEAD
<<<<<<< HEAD
<<<<<<< HEAD
<<<<<<< HEAD
=======
>>>>>>> 8eb59bcc3c (GEOMESA-3113 Add system property to managing HBase deletes with visibilities (#2792))
=======
>>>>>>> 6f245b0cc5 (GEOMESA-3102 Fix removal of user data in FileSystemDataStore.createSchema (#2787))
=======
>>>>>>> 98ce8bad96 (GEOMESA-3102 Fix removal of user data in FileSystemDataStore.createSchema (#2787))
=======
>>>>>>> a8e7273bb0 (GEOMESA-3113 Add system property to managing HBase deletes with visibilities (#2792))
<<<<<<< HEAD
<<<<<<< HEAD
<<<<<<< HEAD
<<<<<<< HEAD
=======
>>>>>>> 07c698faf4 (GEOMESA-3113 Add system property to managing HBase deletes with visibilities (#2792))
=======
>>>>>>> e055239c40 (GEOMESA-3102 Fix removal of user data in FileSystemDataStore.createSchema (#2787))
=======
>>>>>>> 51ab350ee2 (GEOMESA-3113 Add system property to managing HBase deletes with visibilities (#2792))
<<<<<<< HEAD
<<<<<<< HEAD
=======
>>>>>>> 8414c0cefb (GEOMESA-3102 Fix removal of user data in FileSystemDataStore.createSchema (#2787))
=======
=======
>>>>>>> 85d211ca2 (GEOMESA-3102 Fix removal of user data in FileSystemDataStore.createSchema (#2787))
>>>>>>> a425bc2094 (GEOMESA-3102 Fix removal of user data in FileSystemDataStore.createSchema (#2787))
<<<<<<< HEAD
<<<<<<< HEAD
=======
>>>>>>> b81683f4bc (GEOMESA-3113 Add system property to managing HBase deletes with visibilities (#2792))
=======
=======
>>>>>>> 85d211ca2 (GEOMESA-3102 Fix removal of user data in FileSystemDataStore.createSchema (#2787))
=======
>>>>>>> 595c43086 (GEOMESA-3113 Add system property to managing HBase deletes with visibilities (#2792))
>>>>>>> 6449641e67 (GEOMESA-3113 Add system property to managing HBase deletes with visibilities (#2792))
<<<<<<< HEAD
<<<<<<< HEAD
=======
>>>>>>> d24328f760 (GEOMESA-3102 Fix removal of user data in FileSystemDataStore.createSchema (#2787))
=======
>>>>>>> 39d46533eb (GEOMESA-3102 Fix removal of user data in FileSystemDataStore.createSchema (#2787))
<<<<<<< HEAD
<<<<<<< HEAD
=======
>>>>>>> 39a2b37b5e (GEOMESA-3113 Add system property to managing HBase deletes with visibilities (#2792))
=======
=======
>>>>>>> 45dca3e07 (GEOMESA-3113 Add system property to managing HBase deletes with visibilities (#2792))
>>>>>>> 9da518fc54 (GEOMESA-3113 Add system property to managing HBase deletes with visibilities (#2792))
<<<<<<< HEAD
<<<<<<< HEAD
=======
>>>>>>> b52e5bb454 (GEOMESA-3102 Fix removal of user data in FileSystemDataStore.createSchema (#2787))
=======
=======
=======
<<<<<<< HEAD
<<<<<<< HEAD
<<<<<<< HEAD
>>>>>>> 85d211ca2 (GEOMESA-3102 Fix removal of user data in FileSystemDataStore.createSchema (#2787))
=======
>>>>>>> 595c43086 (GEOMESA-3113 Add system property to managing HBase deletes with visibilities (#2792))
<<<<<<< HEAD
>>>>>>> dc17df6c0 (GEOMESA-3113 Add system property to managing HBase deletes with visibilities (#2792))
<<<<<<< HEAD
>>>>>>> 4bd5ce922d (GEOMESA-3113 Add system property to managing HBase deletes with visibilities (#2792))
=======
=======
=======
<<<<<<< HEAD
<<<<<<< HEAD
<<<<<<< HEAD
>>>>>>> 0d3cbc99a (GEOMESA-3102 Fix removal of user data in FileSystemDataStore.createSchema (#2787))
>>>>>>> 74c6b7f8d (GEOMESA-3102 Fix removal of user data in FileSystemDataStore.createSchema (#2787))
>>>>>>> d3ef2e8e78 (GEOMESA-3102 Fix removal of user data in FileSystemDataStore.createSchema (#2787))
=======
>>>>>>> 76328bb492 (GEOMESA-3102 Fix removal of user data in FileSystemDataStore.createSchema (#2787))
>>>>>>> cfd537e7af (GEOMESA-3102 Fix removal of user data in FileSystemDataStore.createSchema (#2787))
<<<<<<< HEAD
<<<<<<< HEAD
=======
>>>>>>> e17f495391 (GEOMESA-3113 Add system property to managing HBase deletes with visibilities (#2792))
=======
>>>>>>> 54709e3b06 (GEOMESA-3102 Fix removal of user data in FileSystemDataStore.createSchema (#2787))
<<<<<<< HEAD
<<<<<<< HEAD
=======
=======
>>>>>>> 7d705cac10 (GEOMESA-3113 Add system property to managing HBase deletes with visibilities (#2792))
=======
=======
=======
=======
>>>>>>> 8524ef3a47 (GEOMESA-3113 Add system property to managing HBase deletes with visibilities (#2792))
=======
>>>>>>> 85d211ca2 (GEOMESA-3102 Fix removal of user data in FileSystemDataStore.createSchema (#2787))
=======
>>>>>>> 595c43086 (GEOMESA-3113 Add system property to managing HBase deletes with visibilities (#2792))
>>>>>>> 0cdf3f2672 (GEOMESA-3113 Add system property to managing HBase deletes with visibilities (#2792))
<<<<<<< HEAD
<<<<<<< HEAD
<<<<<<< HEAD
<<<<<<< HEAD
>>>>>>> d857d34521 (GEOMESA-3113 Add system property to managing HBase deletes with visibilities (#2792))
=======
=======
>>>>>>> 5e66748475 (GEOMESA-3102 Fix removal of user data in FileSystemDataStore.createSchema (#2787))
<<<<<<< HEAD
<<<<<<< HEAD
>>>>>>> 4100fa1ce8 (GEOMESA-3102 Fix removal of user data in FileSystemDataStore.createSchema (#2787))
=======
=======
>>>>>>> 9814eb9768 (GEOMESA-3113 Add system property to managing HBase deletes with visibilities (#2792))
<<<<<<< HEAD
<<<<<<< HEAD
>>>>>>> b515d530a4 (GEOMESA-3113 Add system property to managing HBase deletes with visibilities (#2792))
=======
=======
>>>>>>> f794648fd0 (GEOMESA-3102 Fix removal of user data in FileSystemDataStore.createSchema (#2787))
=======
=======
>>>>>>> 85d211ca2 (GEOMESA-3102 Fix removal of user data in FileSystemDataStore.createSchema (#2787))
>>>>>>> 7119f2c52a (GEOMESA-3102 Fix removal of user data in FileSystemDataStore.createSchema (#2787))
<<<<<<< HEAD
>>>>>>> 7ee0f1d494 (GEOMESA-3102 Fix removal of user data in FileSystemDataStore.createSchema (#2787))
=======
=======
>>>>>>> 5d545f24ed (GEOMESA-3113 Add system property to managing HBase deletes with visibilities (#2792))
>>>>>>> 85d211ca2 (GEOMESA-3102 Fix removal of user data in FileSystemDataStore.createSchema (#2787))
=======
>>>>>>> 595c43086 (GEOMESA-3113 Add system property to managing HBase deletes with visibilities (#2792))
>>>>>>> 8037623548 (GEOMESA-3113 Add system property to managing HBase deletes with visibilities (#2792))
<<<<<<< HEAD
<<<<<<< HEAD
<<<<<<< HEAD
>>>>>>> 02fea6930b (GEOMESA-3113 Add system property to managing HBase deletes with visibilities (#2792))
=======
=======
>>>>>>> 3c372ed1b4 (GEOMESA-3102 Fix removal of user data in FileSystemDataStore.createSchema (#2787))
=======
=======
<<<<<<< HEAD
<<<<<<< HEAD
<<<<<<< HEAD
>>>>>>> 0d3cbc99a (GEOMESA-3102 Fix removal of user data in FileSystemDataStore.createSchema (#2787))
>>>>>>> f0b61142b0 (GEOMESA-3102 Fix removal of user data in FileSystemDataStore.createSchema (#2787))
<<<<<<< HEAD
<<<<<<< HEAD
<<<<<<< HEAD
>>>>>>> c843b1759d (GEOMESA-3102 Fix removal of user data in FileSystemDataStore.createSchema (#2787))
=======
=======
>>>>>>> bd17bd131e (GEOMESA-3102 Fix removal of user data in FileSystemDataStore.createSchema (#2787))
<<<<<<< HEAD
<<<<<<< HEAD
>>>>>>> a2a804586c (GEOMESA-3102 Fix removal of user data in FileSystemDataStore.createSchema (#2787))
=======
=======
>>>>>>> 0fb40a8655 (GEOMESA-3113 Add system property to managing HBase deletes with visibilities (#2792))
=======
=======
>>>>>>> 45dca3e07 (GEOMESA-3113 Add system property to managing HBase deletes with visibilities (#2792))
>>>>>>> ca22354dd7 (GEOMESA-3113 Add system property to managing HBase deletes with visibilities (#2792))
<<<<<<< HEAD
<<<<<<< HEAD
>>>>>>> a773c6ef65 (GEOMESA-3113 Add system property to managing HBase deletes with visibilities (#2792))
=======
>>>>>>> 2d01ec0bc0 (GEOMESA-3102 Fix removal of user data in FileSystemDataStore.createSchema (#2787))
=======
=======
=======
=======
<<<<<<< HEAD
>>>>>>> 85d211ca2 (GEOMESA-3102 Fix removal of user data in FileSystemDataStore.createSchema (#2787))
=======
>>>>>>> 595c43086 (GEOMESA-3113 Add system property to managing HBase deletes with visibilities (#2792))
<<<<<<< HEAD
>>>>>>> dc17df6c0 (GEOMESA-3113 Add system property to managing HBase deletes with visibilities (#2792))
<<<<<<< HEAD
>>>>>>> 2d758409cd (GEOMESA-3113 Add system property to managing HBase deletes with visibilities (#2792))
<<<<<<< HEAD
>>>>>>> b586a90765 (GEOMESA-3113 Add system property to managing HBase deletes with visibilities (#2792))
=======
=======
=======
=======
<<<<<<< HEAD
<<<<<<< HEAD
<<<<<<< HEAD
>>>>>>> 0d3cbc99a (GEOMESA-3102 Fix removal of user data in FileSystemDataStore.createSchema (#2787))
>>>>>>> 74c6b7f8d (GEOMESA-3102 Fix removal of user data in FileSystemDataStore.createSchema (#2787))
>>>>>>> 5a7f445137 (GEOMESA-3102 Fix removal of user data in FileSystemDataStore.createSchema (#2787))
>>>>>>> 29de027418 (GEOMESA-3102 Fix removal of user data in FileSystemDataStore.createSchema (#2787))
=======
>>>>>>> 5c68fb7d18 (GEOMESA-3102 Fix removal of user data in FileSystemDataStore.createSchema (#2787))
>>>>>>> 8a9d3df519 (GEOMESA-3102 Fix removal of user data in FileSystemDataStore.createSchema (#2787))
<<<<<<< HEAD
<<<<<<< HEAD
=======
>>>>>>> df9cd4f22d (GEOMESA-3113 Add system property to managing HBase deletes with visibilities (#2792))
=======
>>>>>>> 5c68fb7d18 (GEOMESA-3102 Fix removal of user data in FileSystemDataStore.createSchema (#2787))
=======
=======
>>>>>>> f8f49130b (GEOMESA-3113 Add system property to managing HBase deletes with visibilities (#2792))
<<<<<<< HEAD
<<<<<<< HEAD
<<<<<<< HEAD
>>>>>>> 4a47c538bc (GEOMESA-3113 Add system property to managing HBase deletes with visibilities (#2792))
<<<<<<< HEAD
>>>>>>> ba177f9f13 (GEOMESA-3113 Add system property to managing HBase deletes with visibilities (#2792))
=======
=======
=======
>>>>>>> 8a2d3cfac9 (GEOMESA-3102 Fix removal of user data in FileSystemDataStore.createSchema (#2787))
=======
=======
>>>>>>> 85d211ca2 (GEOMESA-3102 Fix removal of user data in FileSystemDataStore.createSchema (#2787))
>>>>>>> 02ddf6ca4 (GEOMESA-3102 Fix removal of user data in FileSystemDataStore.createSchema (#2787))
<<<<<<< HEAD
<<<<<<< HEAD
<<<<<<< HEAD
>>>>>>> a358de35a8 (GEOMESA-3102 Fix removal of user data in FileSystemDataStore.createSchema (#2787))
<<<<<<< HEAD
>>>>>>> 08ee2fed57 (GEOMESA-3102 Fix removal of user data in FileSystemDataStore.createSchema (#2787))
=======
=======
=======
>>>>>>> 869683ad83 (GEOMESA-3113 Add system property to managing HBase deletes with visibilities (#2792))
=======
=======
>>>>>>> 85d211ca2 (GEOMESA-3102 Fix removal of user data in FileSystemDataStore.createSchema (#2787))
=======
>>>>>>> 595c43086 (GEOMESA-3113 Add system property to managing HBase deletes with visibilities (#2792))
<<<<<<< HEAD
>>>>>>> 0cdf3f267 (GEOMESA-3113 Add system property to managing HBase deletes with visibilities (#2792))
<<<<<<< HEAD
>>>>>>> 44b15e96d9 (GEOMESA-3113 Add system property to managing HBase deletes with visibilities (#2792))
<<<<<<< HEAD
<<<<<<< HEAD
>>>>>>> 813cf035d0 (GEOMESA-3113 Add system property to managing HBase deletes with visibilities (#2792))
=======
=======
>>>>>>> d488f41800 (GEOMESA-3102 Fix removal of user data in FileSystemDataStore.createSchema (#2787))
<<<<<<< HEAD
<<<<<<< HEAD
>>>>>>> 49337228be (GEOMESA-3102 Fix removal of user data in FileSystemDataStore.createSchema (#2787))
=======
=======
>>>>>>> ac2d5a925f (GEOMESA-3113 Add system property to managing HBase deletes with visibilities (#2792))
<<<<<<< HEAD
<<<<<<< HEAD
>>>>>>> 54fb546133 (GEOMESA-3113 Add system property to managing HBase deletes with visibilities (#2792))
=======
=======
>>>>>>> 2d18554450 (GEOMESA-3102 Fix removal of user data in FileSystemDataStore.createSchema (#2787))
=======
=======
>>>>>>> 85d211ca2 (GEOMESA-3102 Fix removal of user data in FileSystemDataStore.createSchema (#2787))
>>>>>>> 9ce7ed900a (GEOMESA-3102 Fix removal of user data in FileSystemDataStore.createSchema (#2787))
<<<<<<< HEAD
>>>>>>> 8be42d246c (GEOMESA-3102 Fix removal of user data in FileSystemDataStore.createSchema (#2787))
=======
=======
>>>>>>> db696250b0 (GEOMESA-3113 Add system property to managing HBase deletes with visibilities (#2792))
>>>>>>> 85d211ca2 (GEOMESA-3102 Fix removal of user data in FileSystemDataStore.createSchema (#2787))
=======
>>>>>>> 595c43086 (GEOMESA-3113 Add system property to managing HBase deletes with visibilities (#2792))
>>>>>>> 7abafecb19 (GEOMESA-3113 Add system property to managing HBase deletes with visibilities (#2792))
<<<<<<< HEAD
<<<<<<< HEAD
<<<<<<< HEAD
>>>>>>> 7ac82c3dce (GEOMESA-3113 Add system property to managing HBase deletes with visibilities (#2792))
=======
=======
>>>>>>> 7ef22a4bb2 (GEOMESA-3102 Fix removal of user data in FileSystemDataStore.createSchema (#2787))
<<<<<<< HEAD
<<<<<<< HEAD
>>>>>>> 7fd052e7d2 (GEOMESA-3102 Fix removal of user data in FileSystemDataStore.createSchema (#2787))
=======
=======
>>>>>>> 2b62bcaeb4 (GEOMESA-3102 Fix removal of user data in FileSystemDataStore.createSchema (#2787))
>>>>>>> 628458842d (GEOMESA-3102 Fix removal of user data in FileSystemDataStore.createSchema (#2787))
=======
>>>>>>> aca68ab685 (GEOMESA-3113 Add system property to managing HBase deletes with visibilities (#2792))
=======
=======
>>>>>>> 75f3f455ec (GEOMESA-3102 Fix removal of user data in FileSystemDataStore.createSchema (#2787))
>>>>>>> f7952edd5f (GEOMESA-3102 Fix removal of user data in FileSystemDataStore.createSchema (#2787))
=======
<<<<<<< HEAD
<<<<<<< HEAD
=======
>>>>>>> 44bdcb9e58 (GEOMESA-3102 Fix removal of user data in FileSystemDataStore.createSchema (#2787))
>>>>>>> 85d211ca2 (GEOMESA-3102 Fix removal of user data in FileSystemDataStore.createSchema (#2787))
=======
>>>>>>> 595c43086 (GEOMESA-3113 Add system property to managing HBase deletes with visibilities (#2792))
<<<<<<< HEAD
>>>>>>> dc17df6c0 (GEOMESA-3113 Add system property to managing HBase deletes with visibilities (#2792))
<<<<<<< HEAD
>>>>>>> 7a3d004ad1 (GEOMESA-3113 Add system property to managing HBase deletes with visibilities (#2792))
<<<<<<< HEAD
>>>>>>> fd0793971d (GEOMESA-3113 Add system property to managing HBase deletes with visibilities (#2792))
=======
=======
=======
=======
<<<<<<< HEAD
<<<<<<< HEAD
<<<<<<< HEAD
>>>>>>> 0d3cbc99a (GEOMESA-3102 Fix removal of user data in FileSystemDataStore.createSchema (#2787))
>>>>>>> 74c6b7f8d (GEOMESA-3102 Fix removal of user data in FileSystemDataStore.createSchema (#2787))
>>>>>>> ce07ef89fe (GEOMESA-3102 Fix removal of user data in FileSystemDataStore.createSchema (#2787))
<<<<<<< HEAD
<<<<<<< HEAD
<<<<<<< HEAD
=======
>>>>>>> 2ec7d64046 (GEOMESA-3102 Fix removal of user data in FileSystemDataStore.createSchema (#2787))
>>>>>>> 44bdcb9e58 (GEOMESA-3102 Fix removal of user data in FileSystemDataStore.createSchema (#2787))
=======
=======
>>>>>>> 76328bb49 (GEOMESA-3102 Fix removal of user data in FileSystemDataStore.createSchema (#2787))
>>>>>>> 8871b2b4bc (GEOMESA-3102 Fix removal of user data in FileSystemDataStore.createSchema (#2787))
<<<<<<< HEAD
<<<<<<< HEAD
<<<<<<< HEAD
<<<<<<< HEAD
>>>>>>> 853c43fc17 (GEOMESA-3102 Fix removal of user data in FileSystemDataStore.createSchema (#2787))
=======
=======
>>>>>>> a52516cf49 (GEOMESA-3113 Add system property to managing HBase deletes with visibilities (#2792))
=======
=======
>>>>>>> f8f49130b (GEOMESA-3113 Add system property to managing HBase deletes with visibilities (#2792))
>>>>>>> 91b0d6a888 (GEOMESA-3113 Add system property to managing HBase deletes with visibilities (#2792))
<<<<<<< HEAD
>>>>>>> e0056031ea (GEOMESA-3113 Add system property to managing HBase deletes with visibilities (#2792))
=======
>>>>>>> 15429a51ce (GEOMESA-3102 Fix removal of user data in FileSystemDataStore.createSchema (#2787))
=======
=======
>>>>>>> 1b5719bd33 (GEOMESA-3113 Add system property to managing HBase deletes with visibilities (#2792))
>>>>>>> e41e9641d2 (GEOMESA-3113 Add system property to managing HBase deletes with visibilities (#2792))
=======
>>>>>>> 84634d919 (GEOMESA-3113 Add system property to managing HBase deletes with visibilities (#2792))
<<<<<<< HEAD
<<<<<<< HEAD
<<<<<<< HEAD
>>>>>>> 3c4fc5a828 (GEOMESA-3113 Add system property to managing HBase deletes with visibilities (#2792))
<<<<<<< HEAD
>>>>>>> c6079ecae5 (GEOMESA-3113 Add system property to managing HBase deletes with visibilities (#2792))
=======
=======
=======
=======
>>>>>>> 85d211ca2 (GEOMESA-3102 Fix removal of user data in FileSystemDataStore.createSchema (#2787))
=======
>>>>>>> 595c43086 (GEOMESA-3113 Add system property to managing HBase deletes with visibilities (#2792))
>>>>>>> de3e57f03 (GEOMESA-3113 Add system property to managing HBase deletes with visibilities (#2792))
<<<<<<< HEAD
<<<<<<< HEAD
>>>>>>> 92feb5d273 (GEOMESA-3113 Add system property to managing HBase deletes with visibilities (#2792))
<<<<<<< HEAD
>>>>>>> e0644f7991 (GEOMESA-3113 Add system property to managing HBase deletes with visibilities (#2792))
=======
=======
=======
>>>>>>> 113b056da (GEOMESA-3113 Add system property to managing HBase deletes with visibilities (#2792))
<<<<<<< HEAD
<<<<<<< HEAD
>>>>>>> 6f73f22005 (GEOMESA-3113 Add system property to managing HBase deletes with visibilities (#2792))
<<<<<<< HEAD
>>>>>>> 9888cda97e (GEOMESA-3113 Add system property to managing HBase deletes with visibilities (#2792))
=======
=======
<<<<<<< HEAD
>>>>>>> 7cf935d373 (GEOMESA-3113 Add system property to managing HBase deletes with visibilities (#2792))
=======
>>>>>>> 7c98bab97e (GEOMESA-3113 Add system property to managing HBase deletes with visibilities (#2792))
=======
>>>>>>> 1a0678c1b1 (GEOMESA-3113 Add system property to managing HBase deletes with visibilities (#2792))
=======
=======
<<<<<<< HEAD
>>>>>>> 85d211ca2 (GEOMESA-3102 Fix removal of user data in FileSystemDataStore.createSchema (#2787))
=======
>>>>>>> 595c43086 (GEOMESA-3113 Add system property to managing HBase deletes with visibilities (#2792))
<<<<<<< HEAD
>>>>>>> dc17df6c0 (GEOMESA-3113 Add system property to managing HBase deletes with visibilities (#2792))
<<<<<<< HEAD
<<<<<<< HEAD
<<<<<<< HEAD
=======
>>>>>>> 1a0678c1b1 (GEOMESA-3113 Add system property to managing HBase deletes with visibilities (#2792))
>>>>>>> 58f72e76c (GEOMESA-3113 Add system property to managing HBase deletes with visibilities (#2792))
<<<<<<< HEAD
>>>>>>> 8a234c7900 (GEOMESA-3113 Add system property to managing HBase deletes with visibilities (#2792))
<<<<<<< HEAD
>>>>>>> dba8cb28c4 (GEOMESA-3113 Add system property to managing HBase deletes with visibilities (#2792))
=======
=======
=======
>>>>>>> 4c9fb0f6e (GEOMESA-3113 Add system property to managing HBase deletes with visibilities (#2792))
<<<<<<< HEAD
>>>>>>> b51d3046a2 (GEOMESA-3113 Add system property to managing HBase deletes with visibilities (#2792))
<<<<<<< HEAD
>>>>>>> 5f0745e34b (GEOMESA-3113 Add system property to managing HBase deletes with visibilities (#2792))
=======
=======
=======
>>>>>>> 72415e208a (GEOMESA-3113 Add system property to managing HBase deletes with visibilities (#2792))
>>>>>>> c14e106409 (GEOMESA-3113 Add system property to managing HBase deletes with visibilities (#2792))
>>>>>>> e6162be24a (GEOMESA-3113 Add system property to managing HBase deletes with visibilities (#2792))
=======
<<<<<<< HEAD
<<<<<<< HEAD
=======
>>>>>>> 29dcc37810 (GEOMESA-3113 Add system property to managing HBase deletes with visibilities (#2792))
>>>>>>> 5521d97d99 (GEOMESA-3102 Fix removal of user data in FileSystemDataStore.createSchema (#2787))
<<<<<<< HEAD
>>>>>>> 0e67f36558 (GEOMESA-3102 Fix removal of user data in FileSystemDataStore.createSchema (#2787))
<<<<<<< HEAD
>>>>>>> f502df5b55 (GEOMESA-3102 Fix removal of user data in FileSystemDataStore.createSchema (#2787))
=======
=======
=======
=======
>>>>>>> 9814eb976 (GEOMESA-3113 Add system property to managing HBase deletes with visibilities (#2792))
=======
>>>>>>> f18f027f66 (GEOMESA-3102 Fix removal of user data in FileSystemDataStore.createSchema (#2787))
<<<<<<< HEAD
>>>>>>> 26fc359a06 (GEOMESA-3113 Add system property to managing HBase deletes with visibilities (#2792))
<<<<<<< HEAD
>>>>>>> 56f97cd271 (GEOMESA-3113 Add system property to managing HBase deletes with visibilities (#2792))
<<<<<<< HEAD
>>>>>>> 29dcc37810 (GEOMESA-3113 Add system property to managing HBase deletes with visibilities (#2792))
=======
=======
=======
=======
=======
>>>>>>> 85d211ca2 (GEOMESA-3102 Fix removal of user data in FileSystemDataStore.createSchema (#2787))
>>>>>>> 7119f2c52 (GEOMESA-3102 Fix removal of user data in FileSystemDataStore.createSchema (#2787))
=======
>>>>>>> dbbcaa10d3 (GEOMESA-3113 Add system property to managing HBase deletes with visibilities (#2792))
<<<<<<< HEAD
>>>>>>> adf2ac19a8 (GEOMESA-3102 Fix removal of user data in FileSystemDataStore.createSchema (#2787))
<<<<<<< HEAD
>>>>>>> 89ea8190e2 (GEOMESA-3102 Fix removal of user data in FileSystemDataStore.createSchema (#2787))
<<<<<<< HEAD
>>>>>>> f18f027f66 (GEOMESA-3102 Fix removal of user data in FileSystemDataStore.createSchema (#2787))
=======
=======
=======
=======
=======
>>>>>>> 85d211ca2 (GEOMESA-3102 Fix removal of user data in FileSystemDataStore.createSchema (#2787))
=======
>>>>>>> 595c43086 (GEOMESA-3113 Add system property to managing HBase deletes with visibilities (#2792))
>>>>>>> 803762354 (GEOMESA-3113 Add system property to managing HBase deletes with visibilities (#2792))
<<<<<<< HEAD
<<<<<<< HEAD
>>>>>>> e62505d539 (GEOMESA-3113 Add system property to managing HBase deletes with visibilities (#2792))
<<<<<<< HEAD
>>>>>>> 3226e92d8e (GEOMESA-3113 Add system property to managing HBase deletes with visibilities (#2792))
<<<<<<< HEAD
>>>>>>> dbbcaa10d3 (GEOMESA-3113 Add system property to managing HBase deletes with visibilities (#2792))
=======
=======
=======
=======
=======
<<<<<<< HEAD
<<<<<<< HEAD
<<<<<<< HEAD
>>>>>>> 0d3cbc99a (GEOMESA-3102 Fix removal of user data in FileSystemDataStore.createSchema (#2787))
>>>>>>> f0b61142b (GEOMESA-3102 Fix removal of user data in FileSystemDataStore.createSchema (#2787))
<<<<<<< HEAD
<<<<<<< HEAD
>>>>>>> 0a6aff78fb (GEOMESA-3102 Fix removal of user data in FileSystemDataStore.createSchema (#2787))
<<<<<<< HEAD
>>>>>>> d9cabf401c (GEOMESA-3102 Fix removal of user data in FileSystemDataStore.createSchema (#2787))
<<<<<<< HEAD
>>>>>>> 28be12542f (GEOMESA-3102 Fix removal of user data in FileSystemDataStore.createSchema (#2787))
=======
=======
=======
=======
>>>>>>> bd17bd131 (GEOMESA-3102 Fix removal of user data in FileSystemDataStore.createSchema (#2787))
<<<<<<< HEAD
<<<<<<< HEAD
>>>>>>> c555446b8b (GEOMESA-3102 Fix removal of user data in FileSystemDataStore.createSchema (#2787))
<<<<<<< HEAD
>>>>>>> 1230d64006 (GEOMESA-3102 Fix removal of user data in FileSystemDataStore.createSchema (#2787))
<<<<<<< HEAD
>>>>>>> 814abac33f (GEOMESA-3102 Fix removal of user data in FileSystemDataStore.createSchema (#2787))
=======
=======
=======
=======
=======
>>>>>>> 45dca3e07 (GEOMESA-3113 Add system property to managing HBase deletes with visibilities (#2792))
>>>>>>> ca22354dd (GEOMESA-3113 Add system property to managing HBase deletes with visibilities (#2792))
=======
>>>>>>> 7f486255dd (GEOMESA-3102 Fix removal of user data in FileSystemDataStore.createSchema (#2787))
<<<<<<< HEAD
>>>>>>> 797b02396b (GEOMESA-3113 Add system property to managing HBase deletes with visibilities (#2792))
<<<<<<< HEAD
>>>>>>> cd5564bac6 (GEOMESA-3113 Add system property to managing HBase deletes with visibilities (#2792))
<<<<<<< HEAD
>>>>>>> f2b9fb3853 (GEOMESA-3113 Add system property to managing HBase deletes with visibilities (#2792))
=======
=======
=======
=======
>>>>>>> c385f7994 (GEOMESA-3102 Fix removal of user data in FileSystemDataStore.createSchema (#2787))
=======
>>>>>>> e639fc30a7 (GEOMESA-3113 Add system property to managing HBase deletes with visibilities (#2792))
<<<<<<< HEAD
>>>>>>> 3171e7407d (GEOMESA-3102 Fix removal of user data in FileSystemDataStore.createSchema (#2787))
<<<<<<< HEAD
>>>>>>> 038b4ca087 (GEOMESA-3102 Fix removal of user data in FileSystemDataStore.createSchema (#2787))
<<<<<<< HEAD
>>>>>>> 7f486255dd (GEOMESA-3102 Fix removal of user data in FileSystemDataStore.createSchema (#2787))
=======
=======
=======
=======
=======
=======
=======
>>>>>>> c57a8a5ffe (GEOMESA-3102 Fix removal of user data in FileSystemDataStore.createSchema (#2787))
<<<<<<< HEAD
>>>>>>> 85d211ca2 (GEOMESA-3102 Fix removal of user data in FileSystemDataStore.createSchema (#2787))
=======
>>>>>>> 595c43086 (GEOMESA-3113 Add system property to managing HBase deletes with visibilities (#2792))
<<<<<<< HEAD
>>>>>>> dc17df6c0 (GEOMESA-3113 Add system property to managing HBase deletes with visibilities (#2792))
<<<<<<< HEAD
>>>>>>> 2d758409c (GEOMESA-3113 Add system property to managing HBase deletes with visibilities (#2792))
<<<<<<< HEAD
>>>>>>> 237494b1cc (GEOMESA-3113 Add system property to managing HBase deletes with visibilities (#2792))
<<<<<<< HEAD
>>>>>>> d774dc1d12 (GEOMESA-3113 Add system property to managing HBase deletes with visibilities (#2792))
<<<<<<< HEAD
>>>>>>> e639fc30a7 (GEOMESA-3113 Add system property to managing HBase deletes with visibilities (#2792))
=======
=======
=======
=======
=======
>>>>>>> c84a3b17a6 (GEOMESA-3102 Fix removal of user data in FileSystemDataStore.createSchema (#2787))
=======
=======
<<<<<<< HEAD
<<<<<<< HEAD
<<<<<<< HEAD
>>>>>>> 0d3cbc99a (GEOMESA-3102 Fix removal of user data in FileSystemDataStore.createSchema (#2787))
>>>>>>> 74c6b7f8d (GEOMESA-3102 Fix removal of user data in FileSystemDataStore.createSchema (#2787))
<<<<<<< HEAD
>>>>>>> 5a7f44513 (GEOMESA-3102 Fix removal of user data in FileSystemDataStore.createSchema (#2787))
<<<<<<< HEAD
>>>>>>> c7eb576a40 (GEOMESA-3102 Fix removal of user data in FileSystemDataStore.createSchema (#2787))
<<<<<<< HEAD
>>>>>>> 0645a0bbaf (GEOMESA-3102 Fix removal of user data in FileSystemDataStore.createSchema (#2787))
<<<<<<< HEAD
>>>>>>> c57a8a5ffe (GEOMESA-3102 Fix removal of user data in FileSystemDataStore.createSchema (#2787))
=======
=======
=======
=======
>>>>>>> 5c68fb7d1 (GEOMESA-3102 Fix removal of user data in FileSystemDataStore.createSchema (#2787))
<<<<<<< HEAD
>>>>>>> 9ec1f049a9 (GEOMESA-3102 Fix removal of user data in FileSystemDataStore.createSchema (#2787))
<<<<<<< HEAD
>>>>>>> e8b1c389e3 (GEOMESA-3102 Fix removal of user data in FileSystemDataStore.createSchema (#2787))
<<<<<<< HEAD
>>>>>>> 7e323ef52f (GEOMESA-3102 Fix removal of user data in FileSystemDataStore.createSchema (#2787))
=======
=======
=======
=======
=======
>>>>>>> f8f49130b (GEOMESA-3113 Add system property to managing HBase deletes with visibilities (#2792))
>>>>>>> 4a47c538b (GEOMESA-3113 Add system property to managing HBase deletes with visibilities (#2792))
=======
>>>>>>> e9395c1096 (GEOMESA-3102 Fix removal of user data in FileSystemDataStore.createSchema (#2787))
<<<<<<< HEAD
>>>>>>> a0d6da1831 (GEOMESA-3113 Add system property to managing HBase deletes with visibilities (#2792))
<<<<<<< HEAD
>>>>>>> 6abf5007af (GEOMESA-3113 Add system property to managing HBase deletes with visibilities (#2792))
<<<<<<< HEAD
>>>>>>> 69a4e317d6 (GEOMESA-3113 Add system property to managing HBase deletes with visibilities (#2792))
=======
=======
=======
=======
>>>>>>> a358de35a (GEOMESA-3102 Fix removal of user data in FileSystemDataStore.createSchema (#2787))
=======
>>>>>>> 65460df3e6 (GEOMESA-3113 Add system property to managing HBase deletes with visibilities (#2792))
<<<<<<< HEAD
>>>>>>> 1faf0d16f2 (GEOMESA-3102 Fix removal of user data in FileSystemDataStore.createSchema (#2787))
<<<<<<< HEAD
>>>>>>> 2212530e6b (GEOMESA-3102 Fix removal of user data in FileSystemDataStore.createSchema (#2787))
<<<<<<< HEAD
>>>>>>> e9395c1096 (GEOMESA-3102 Fix removal of user data in FileSystemDataStore.createSchema (#2787))
=======
=======
=======
=======
=======
=======
>>>>>>> 85d211ca2 (GEOMESA-3102 Fix removal of user data in FileSystemDataStore.createSchema (#2787))
=======
>>>>>>> 595c43086 (GEOMESA-3113 Add system property to managing HBase deletes with visibilities (#2792))
>>>>>>> 0cdf3f267 (GEOMESA-3113 Add system property to managing HBase deletes with visibilities (#2792))
>>>>>>> 44b15e96d (GEOMESA-3113 Add system property to managing HBase deletes with visibilities (#2792))
<<<<<<< HEAD
<<<<<<< HEAD
>>>>>>> e5413df04f (GEOMESA-3113 Add system property to managing HBase deletes with visibilities (#2792))
<<<<<<< HEAD
>>>>>>> d38e17d229 (GEOMESA-3113 Add system property to managing HBase deletes with visibilities (#2792))
<<<<<<< HEAD
>>>>>>> 65460df3e6 (GEOMESA-3113 Add system property to managing HBase deletes with visibilities (#2792))
=======
=======
=======
=======
>>>>>>> d488f4180 (GEOMESA-3102 Fix removal of user data in FileSystemDataStore.createSchema (#2787))
<<<<<<< HEAD
<<<<<<< HEAD
>>>>>>> 8aa4f55ef6 (GEOMESA-3102 Fix removal of user data in FileSystemDataStore.createSchema (#2787))
<<<<<<< HEAD
>>>>>>> aeb7c3ed76 (GEOMESA-3102 Fix removal of user data in FileSystemDataStore.createSchema (#2787))
<<<<<<< HEAD
>>>>>>> 16bbecada1 (GEOMESA-3102 Fix removal of user data in FileSystemDataStore.createSchema (#2787))
=======
=======
=======
=======
>>>>>>> ac2d5a925 (GEOMESA-3113 Add system property to managing HBase deletes with visibilities (#2792))
=======
>>>>>>> fa2938c568 (GEOMESA-3102 Fix removal of user data in FileSystemDataStore.createSchema (#2787))
<<<<<<< HEAD
>>>>>>> 11addb1ce7 (GEOMESA-3113 Add system property to managing HBase deletes with visibilities (#2792))
<<<<<<< HEAD
>>>>>>> 42bfd74c63 (GEOMESA-3113 Add system property to managing HBase deletes with visibilities (#2792))
<<<<<<< HEAD
>>>>>>> be1167e028 (GEOMESA-3113 Add system property to managing HBase deletes with visibilities (#2792))
=======
=======
=======
=======
=======
>>>>>>> 85d211ca2 (GEOMESA-3102 Fix removal of user data in FileSystemDataStore.createSchema (#2787))
>>>>>>> 9ce7ed900 (GEOMESA-3102 Fix removal of user data in FileSystemDataStore.createSchema (#2787))
=======
>>>>>>> 54da398207 (GEOMESA-3113 Add system property to managing HBase deletes with visibilities (#2792))
<<<<<<< HEAD
>>>>>>> 90d85d9b4b (GEOMESA-3102 Fix removal of user data in FileSystemDataStore.createSchema (#2787))
<<<<<<< HEAD
>>>>>>> bce9dc3e0e (GEOMESA-3102 Fix removal of user data in FileSystemDataStore.createSchema (#2787))
<<<<<<< HEAD
>>>>>>> fa2938c568 (GEOMESA-3102 Fix removal of user data in FileSystemDataStore.createSchema (#2787))
=======
=======
=======
=======
=======
>>>>>>> 85d211ca2 (GEOMESA-3102 Fix removal of user data in FileSystemDataStore.createSchema (#2787))
=======
>>>>>>> 595c43086 (GEOMESA-3113 Add system property to managing HBase deletes with visibilities (#2792))
>>>>>>> 7abafecb1 (GEOMESA-3113 Add system property to managing HBase deletes with visibilities (#2792))
=======
>>>>>>> e2aaf740bf (GEOMESA-3102 Fix removal of user data in FileSystemDataStore.createSchema (#2787))
<<<<<<< HEAD
>>>>>>> 1468e59829 (GEOMESA-3113 Add system property to managing HBase deletes with visibilities (#2792))
<<<<<<< HEAD
>>>>>>> 9c750992ef (GEOMESA-3113 Add system property to managing HBase deletes with visibilities (#2792))
<<<<<<< HEAD
>>>>>>> 54da398207 (GEOMESA-3113 Add system property to managing HBase deletes with visibilities (#2792))
=======
=======
=======
=======
>>>>>>> 7ef22a4bb (GEOMESA-3102 Fix removal of user data in FileSystemDataStore.createSchema (#2787))
=======
>>>>>>> 1682b13d94 (GEOMESA-3102 Fix removal of user data in FileSystemDataStore.createSchema (#2787))
<<<<<<< HEAD
>>>>>>> c8d3361f41 (GEOMESA-3102 Fix removal of user data in FileSystemDataStore.createSchema (#2787))
<<<<<<< HEAD
>>>>>>> 48dcb085fa (GEOMESA-3102 Fix removal of user data in FileSystemDataStore.createSchema (#2787))
<<<<<<< HEAD
>>>>>>> e2aaf740bf (GEOMESA-3102 Fix removal of user data in FileSystemDataStore.createSchema (#2787))
=======
=======
=======
=======
>>>>>>> 2b62bcaeb (GEOMESA-3102 Fix removal of user data in FileSystemDataStore.createSchema (#2787))
=======
>>>>>>> 8999b3f6b9 (GEOMESA-3113 Add system property to managing HBase deletes with visibilities (#2792))
<<<<<<< HEAD
>>>>>>> a618e2ba0a (GEOMESA-3102 Fix removal of user data in FileSystemDataStore.createSchema (#2787))
<<<<<<< HEAD
>>>>>>> 687ba5655c (GEOMESA-3102 Fix removal of user data in FileSystemDataStore.createSchema (#2787))
<<<<<<< HEAD
>>>>>>> 1682b13d94 (GEOMESA-3102 Fix removal of user data in FileSystemDataStore.createSchema (#2787))
=======
=======
=======
=======
=======
>>>>>>> 45dca3e07 (GEOMESA-3113 Add system property to managing HBase deletes with visibilities (#2792))
>>>>>>> afc081190 (GEOMESA-3113 Add system property to managing HBase deletes with visibilities (#2792))
=======
>>>>>>> abc395c346 (GEOMESA-3102 Fix removal of user data in FileSystemDataStore.createSchema (#2787))
<<<<<<< HEAD
>>>>>>> 65360f96a0 (GEOMESA-3113 Add system property to managing HBase deletes with visibilities (#2792))
<<<<<<< HEAD
>>>>>>> 97a911d79c (GEOMESA-3113 Add system property to managing HBase deletes with visibilities (#2792))
<<<<<<< HEAD
>>>>>>> 8999b3f6b9 (GEOMESA-3113 Add system property to managing HBase deletes with visibilities (#2792))
=======
=======
=======
=======
>>>>>>> 75f3f455e (GEOMESA-3102 Fix removal of user data in FileSystemDataStore.createSchema (#2787))
=======
>>>>>>> 3c53246c9a (GEOMESA-3113 Add system property to managing HBase deletes with visibilities (#2792))
<<<<<<< HEAD
>>>>>>> 20dc993a76 (GEOMESA-3102 Fix removal of user data in FileSystemDataStore.createSchema (#2787))
<<<<<<< HEAD
>>>>>>> 33d2777a8a (GEOMESA-3102 Fix removal of user data in FileSystemDataStore.createSchema (#2787))
<<<<<<< HEAD
>>>>>>> abc395c346 (GEOMESA-3102 Fix removal of user data in FileSystemDataStore.createSchema (#2787))
=======
=======
=======
=======
=======
=======
=======
>>>>>>> 4bb5bbc637 (GEOMESA-3102 Fix removal of user data in FileSystemDataStore.createSchema (#2787))
<<<<<<< HEAD
>>>>>>> 85d211ca2 (GEOMESA-3102 Fix removal of user data in FileSystemDataStore.createSchema (#2787))
=======
>>>>>>> 595c43086 (GEOMESA-3113 Add system property to managing HBase deletes with visibilities (#2792))
<<<<<<< HEAD
>>>>>>> dc17df6c0 (GEOMESA-3113 Add system property to managing HBase deletes with visibilities (#2792))
<<<<<<< HEAD
>>>>>>> 7a3d004ad (GEOMESA-3113 Add system property to managing HBase deletes with visibilities (#2792))
<<<<<<< HEAD
>>>>>>> bd6dd934cc (GEOMESA-3113 Add system property to managing HBase deletes with visibilities (#2792))
<<<<<<< HEAD
>>>>>>> cc5f917a7c (GEOMESA-3113 Add system property to managing HBase deletes with visibilities (#2792))
<<<<<<< HEAD
>>>>>>> 3c53246c9a (GEOMESA-3113 Add system property to managing HBase deletes with visibilities (#2792))
=======
=======
=======
=======
=======
=======
<<<<<<< HEAD
<<<<<<< HEAD
<<<<<<< HEAD
>>>>>>> 0d3cbc99a (GEOMESA-3102 Fix removal of user data in FileSystemDataStore.createSchema (#2787))
>>>>>>> 74c6b7f8d (GEOMESA-3102 Fix removal of user data in FileSystemDataStore.createSchema (#2787))
>>>>>>> ce07ef89f (GEOMESA-3102 Fix removal of user data in FileSystemDataStore.createSchema (#2787))
=======
>>>>>>> fd0ea5e670 (GEOMESA-3102 Fix removal of user data in FileSystemDataStore.createSchema (#2787))
<<<<<<< HEAD
>>>>>>> b6118ef7a5 (GEOMESA-3102 Fix removal of user data in FileSystemDataStore.createSchema (#2787))
<<<<<<< HEAD
>>>>>>> 8309b2b098 (GEOMESA-3102 Fix removal of user data in FileSystemDataStore.createSchema (#2787))
<<<<<<< HEAD
>>>>>>> 4bb5bbc637 (GEOMESA-3102 Fix removal of user data in FileSystemDataStore.createSchema (#2787))
=======
=======
=======
=======
>>>>>>> 8871b2b4b (GEOMESA-3102 Fix removal of user data in FileSystemDataStore.createSchema (#2787))
=======
>>>>>>> fc179cb2d5 (GEOMESA-3113 Add system property to managing HBase deletes with visibilities (#2792))
<<<<<<< HEAD
>>>>>>> 495c744326 (GEOMESA-3102 Fix removal of user data in FileSystemDataStore.createSchema (#2787))
<<<<<<< HEAD
>>>>>>> a49ee0e00a (GEOMESA-3102 Fix removal of user data in FileSystemDataStore.createSchema (#2787))
<<<<<<< HEAD
>>>>>>> fd0ea5e670 (GEOMESA-3102 Fix removal of user data in FileSystemDataStore.createSchema (#2787))
=======
=======
=======
=======
=======
>>>>>>> f8f49130b (GEOMESA-3113 Add system property to managing HBase deletes with visibilities (#2792))
>>>>>>> 91b0d6a88 (GEOMESA-3113 Add system property to managing HBase deletes with visibilities (#2792))
=======
>>>>>>> d2e8dad373 (GEOMESA-3102 Fix removal of user data in FileSystemDataStore.createSchema (#2787))
<<<<<<< HEAD
>>>>>>> 49d3846b23 (GEOMESA-3113 Add system property to managing HBase deletes with visibilities (#2792))
<<<<<<< HEAD
>>>>>>> 3adb85864f (GEOMESA-3113 Add system property to managing HBase deletes with visibilities (#2792))
<<<<<<< HEAD
>>>>>>> fc179cb2d5 (GEOMESA-3113 Add system property to managing HBase deletes with visibilities (#2792))
=======
=======
=======
=======
>>>>>>> 4f922d74c (GEOMESA-3102 Fix removal of user data in FileSystemDataStore.createSchema (#2787))
=======
>>>>>>> 9e74e1d9b4 (GEOMESA-3113 Add system property to managing HBase deletes with visibilities (#2792))
<<<<<<< HEAD
>>>>>>> 155d6a9469 (GEOMESA-3102 Fix removal of user data in FileSystemDataStore.createSchema (#2787))
<<<<<<< HEAD
>>>>>>> a1198ce095 (GEOMESA-3102 Fix removal of user data in FileSystemDataStore.createSchema (#2787))
<<<<<<< HEAD
>>>>>>> d2e8dad373 (GEOMESA-3102 Fix removal of user data in FileSystemDataStore.createSchema (#2787))
=======
=======
=======
=======
>>>>>>> 1b5719bd3 (GEOMESA-3113 Add system property to managing HBase deletes with visibilities (#2792))
>>>>>>> e4ee051914 (GEOMESA-3113 Add system property to managing HBase deletes with visibilities (#2792))
>>>>>>> 260d67442f (GEOMESA-3113 Add system property to managing HBase deletes with visibilities (#2792))
>>>>>>> 9e74e1d9b4 (GEOMESA-3113 Add system property to managing HBase deletes with visibilities (#2792))
=======
>>>>>>> 8ddbf27f07 (GEOMESA-3102 Fix removal of user data in FileSystemDataStore.createSchema (#2787))
<<<<<<< HEAD
<<<<<<< HEAD
=======
>>>>>>> b448819e24 (GEOMESA-3113 Add system property to managing HBase deletes with visibilities (#2792))
=======
=======
>>>>>>> bcf168a888 (GEOMESA-3113 Add system property to managing HBase deletes with visibilities (#2792))
>>>>>>> 1d4e479464 (GEOMESA-3113 Add system property to managing HBase deletes with visibilities (#2792))
<<<<<<< HEAD
<<<<<<< HEAD
=======
>>>>>>> 735f1fc092 (GEOMESA-3102 Fix removal of user data in FileSystemDataStore.createSchema (#2787))
=======
>>>>>>> a834a844c7 (GEOMESA-3113 Add system property to managing HBase deletes with visibilities (#2792))
<<<<<<< HEAD
<<<<<<< HEAD
=======
>>>>>>> 027b4d7d58 (GEOMESA-3102 Fix removal of user data in FileSystemDataStore.createSchema (#2787))
=======
=======
>>>>>>> ba7f2715c5 (GEOMESA-3102 Fix removal of user data in FileSystemDataStore.createSchema (#2787))
>>>>>>> 84f529c13e (GEOMESA-3102 Fix removal of user data in FileSystemDataStore.createSchema (#2787))
<<<<<<< HEAD
<<<<<<< HEAD
=======
>>>>>>> 6d4f75bcbb (GEOMESA-3102 Fix removal of user data in FileSystemDataStore.createSchema (#2787))
=======
>>>>>>> 0d4496a2f2 (GEOMESA-3113 Add system property to managing HBase deletes with visibilities (#2792))
<<<<<<< HEAD
<<<<<<< HEAD
=======
>>>>>>> 265d436467 (GEOMESA-3102 Fix removal of user data in FileSystemDataStore.createSchema (#2787))
=======
=======
>>>>>>> 9c809610d5 (GEOMESA-3102 Fix removal of user data in FileSystemDataStore.createSchema (#2787))
>>>>>>> ee2741585f (GEOMESA-3102 Fix removal of user data in FileSystemDataStore.createSchema (#2787))
<<<<<<< HEAD
<<<<<<< HEAD
=======
>>>>>>> 1506607bc9 (GEOMESA-3113 Add system property to managing HBase deletes with visibilities (#2792))
=======
=======
>>>>>>> a030b80514 (GEOMESA-3102 Fix removal of user data in FileSystemDataStore.createSchema (#2787))
>>>>>>> 5d88c18b90 (GEOMESA-3102 Fix removal of user data in FileSystemDataStore.createSchema (#2787))
<<<<<<< HEAD
<<<<<<< HEAD
=======
>>>>>>> abe07966f6 (GEOMESA-3102 Fix removal of user data in FileSystemDataStore.createSchema (#2787))
=======
>>>>>>> de00bd1943 (GEOMESA-3113 Add system property to managing HBase deletes with visibilities (#2792))
<<<<<<< HEAD
<<<<<<< HEAD
=======
>>>>>>> 6f245b0cc5 (GEOMESA-3102 Fix removal of user data in FileSystemDataStore.createSchema (#2787))
=======
=======
>>>>>>> 98ce8bad96 (GEOMESA-3102 Fix removal of user data in FileSystemDataStore.createSchema (#2787))
>>>>>>> ffdb14e2a7 (GEOMESA-3102 Fix removal of user data in FileSystemDataStore.createSchema (#2787))
<<<<<<< HEAD
<<<<<<< HEAD
=======
>>>>>>> ea5f19f56b (GEOMESA-3113 Add system property to managing HBase deletes with visibilities (#2792))
<<<<<<< HEAD
=======
>>>>>>> 49ebaf17a8 (GEOMESA-3102 Fix removal of user data in FileSystemDataStore.createSchema (#2787))
=======
>>>>>>> 8b0bfd55f9 (GEOMESA-3113 Add system property to managing HBase deletes with visibilities (#2792))
=======
=======
>>>>>>> 85d211ca2 (GEOMESA-3102 Fix removal of user data in FileSystemDataStore.createSchema (#2787))
>>>>>>> a863ae9a4f (GEOMESA-3102 Fix removal of user data in FileSystemDataStore.createSchema (#2787))
=======
=======
>>>>>>> 85d211ca2 (GEOMESA-3102 Fix removal of user data in FileSystemDataStore.createSchema (#2787))
=======
>>>>>>> 595c43086 (GEOMESA-3113 Add system property to managing HBase deletes with visibilities (#2792))
>>>>>>> 8e7c6661dc (GEOMESA-3113 Add system property to managing HBase deletes with visibilities (#2792))
=======
>>>>>>> fb62d8dca1 (GEOMESA-3102 Fix removal of user data in FileSystemDataStore.createSchema (#2787))
=======
>>>>>>> ce8500e632 (GEOMESA-3102 Fix removal of user data in FileSystemDataStore.createSchema (#2787))
=======
=======
>>>>>>> 45dca3e07 (GEOMESA-3113 Add system property to managing HBase deletes with visibilities (#2792))
>>>>>>> d83ac69cc5 (GEOMESA-3113 Add system property to managing HBase deletes with visibilities (#2792))
=======
=======
>>>>>>> c4ce510344 (GEOMESA-3102 Fix removal of user data in FileSystemDataStore.createSchema (#2787))
=======
=======
>>>>>>> 85d211ca2 (GEOMESA-3102 Fix removal of user data in FileSystemDataStore.createSchema (#2787))
>>>>>>> ea0c690e2 (GEOMESA-3102 Fix removal of user data in FileSystemDataStore.createSchema (#2787))
<<<<<<< HEAD
<<<<<<< HEAD
>>>>>>> 9431689196 (GEOMESA-3102 Fix removal of user data in FileSystemDataStore.createSchema (#2787))
=======
>>>>>>> 7cf935d373 (GEOMESA-3113 Add system property to managing HBase deletes with visibilities (#2792))
=======
>>>>>>> c84a3b17a6 (GEOMESA-3102 Fix removal of user data in FileSystemDataStore.createSchema (#2787))
=======
>>>>>>> 76328bb492 (GEOMESA-3102 Fix removal of user data in FileSystemDataStore.createSchema (#2787))
>>>>>>> a9cee10e0a (GEOMESA-3102 Fix removal of user data in FileSystemDataStore.createSchema (#2787))
=======
>>>>>>> 307fc2b238 (GEOMESA-3113 Add system property to managing HBase deletes with visibilities (#2792))
=======
>>>>>>> 0ac8a757dd (GEOMESA-3102 Fix removal of user data in FileSystemDataStore.createSchema (#2787))
=======
>>>>>>> 7d705cac10 (GEOMESA-3113 Add system property to managing HBase deletes with visibilities (#2792))
=======
=======
>>>>>>> 5e66748475 (GEOMESA-3102 Fix removal of user data in FileSystemDataStore.createSchema (#2787))
>>>>>>> 237bd3cb10 (GEOMESA-3102 Fix removal of user data in FileSystemDataStore.createSchema (#2787))
=======
=======
>>>>>>> 9814eb9768 (GEOMESA-3113 Add system property to managing HBase deletes with visibilities (#2792))
>>>>>>> c296484bff (GEOMESA-3113 Add system property to managing HBase deletes with visibilities (#2792))
=======
>>>>>>> f794648fd0 (GEOMESA-3102 Fix removal of user data in FileSystemDataStore.createSchema (#2787))
=======
>>>>>>> 5d545f24ed (GEOMESA-3113 Add system property to managing HBase deletes with visibilities (#2792))
=======
>>>>>>> 3c372ed1b4 (GEOMESA-3102 Fix removal of user data in FileSystemDataStore.createSchema (#2787))
=======
=======
>>>>>>> bd17bd131e (GEOMESA-3102 Fix removal of user data in FileSystemDataStore.createSchema (#2787))
>>>>>>> 682f10a0e9 (GEOMESA-3102 Fix removal of user data in FileSystemDataStore.createSchema (#2787))
=======
>>>>>>> 0fb40a8655 (GEOMESA-3113 Add system property to managing HBase deletes with visibilities (#2792))
=======
=======
>>>>>>> c385f79943 (GEOMESA-3102 Fix removal of user data in FileSystemDataStore.createSchema (#2787))
<<<<<<< HEAD
>>>>>>> 41631d23c9 (GEOMESA-3102 Fix removal of user data in FileSystemDataStore.createSchema (#2787))
=======
=======
=======
=======
<<<<<<< HEAD
>>>>>>> 85d211ca2 (GEOMESA-3102 Fix removal of user data in FileSystemDataStore.createSchema (#2787))
=======
>>>>>>> 595c43086 (GEOMESA-3113 Add system property to managing HBase deletes with visibilities (#2792))
<<<<<<< HEAD
>>>>>>> dc17df6c0 (GEOMESA-3113 Add system property to managing HBase deletes with visibilities (#2792))
<<<<<<< HEAD
>>>>>>> 2d758409cd (GEOMESA-3113 Add system property to managing HBase deletes with visibilities (#2792))
<<<<<<< HEAD
>>>>>>> bc833b1448 (GEOMESA-3113 Add system property to managing HBase deletes with visibilities (#2792))
=======
=======
=======
=======
<<<<<<< HEAD
<<<<<<< HEAD
<<<<<<< HEAD
>>>>>>> 0d3cbc99a (GEOMESA-3102 Fix removal of user data in FileSystemDataStore.createSchema (#2787))
>>>>>>> 74c6b7f8d (GEOMESA-3102 Fix removal of user data in FileSystemDataStore.createSchema (#2787))
>>>>>>> 5a7f445137 (GEOMESA-3102 Fix removal of user data in FileSystemDataStore.createSchema (#2787))
>>>>>>> 8146fed90c (GEOMESA-3102 Fix removal of user data in FileSystemDataStore.createSchema (#2787))
=======
>>>>>>> 5c68fb7d18 (GEOMESA-3102 Fix removal of user data in FileSystemDataStore.createSchema (#2787))
>>>>>>> 1e838e1657 (GEOMESA-3102 Fix removal of user data in FileSystemDataStore.createSchema (#2787))
=======
>>>>>>> 5c68fb7d18 (GEOMESA-3102 Fix removal of user data in FileSystemDataStore.createSchema (#2787))
=======
=======
>>>>>>> f8f49130b (GEOMESA-3113 Add system property to managing HBase deletes with visibilities (#2792))
<<<<<<< HEAD
>>>>>>> 4a47c538bc (GEOMESA-3113 Add system property to managing HBase deletes with visibilities (#2792))
<<<<<<< HEAD
>>>>>>> a42015a87c (GEOMESA-3113 Add system property to managing HBase deletes with visibilities (#2792))
=======
=======
=======
=======
>>>>>>> 85d211ca2 (GEOMESA-3102 Fix removal of user data in FileSystemDataStore.createSchema (#2787))
>>>>>>> 02ddf6ca4 (GEOMESA-3102 Fix removal of user data in FileSystemDataStore.createSchema (#2787))
<<<<<<< HEAD
>>>>>>> a358de35a8 (GEOMESA-3102 Fix removal of user data in FileSystemDataStore.createSchema (#2787))
<<<<<<< HEAD
>>>>>>> ffca94ce17 (GEOMESA-3102 Fix removal of user data in FileSystemDataStore.createSchema (#2787))
=======
=======
=======
=======
>>>>>>> 85d211ca2 (GEOMESA-3102 Fix removal of user data in FileSystemDataStore.createSchema (#2787))
=======
>>>>>>> 595c43086 (GEOMESA-3113 Add system property to managing HBase deletes with visibilities (#2792))
>>>>>>> 0cdf3f267 (GEOMESA-3113 Add system property to managing HBase deletes with visibilities (#2792))
>>>>>>> 44b15e96d9 (GEOMESA-3113 Add system property to managing HBase deletes with visibilities (#2792))
>>>>>>> ec072ceda6 (GEOMESA-3113 Add system property to managing HBase deletes with visibilities (#2792))
=======
=======
>>>>>>> d488f41800 (GEOMESA-3102 Fix removal of user data in FileSystemDataStore.createSchema (#2787))
>>>>>>> 8e486088f5 (GEOMESA-3102 Fix removal of user data in FileSystemDataStore.createSchema (#2787))
=======
=======
>>>>>>> ac2d5a925f (GEOMESA-3113 Add system property to managing HBase deletes with visibilities (#2792))
>>>>>>> 94096ec6bd (GEOMESA-3113 Add system property to managing HBase deletes with visibilities (#2792))
=======
>>>>>>> 2d18554450 (GEOMESA-3102 Fix removal of user data in FileSystemDataStore.createSchema (#2787))
=======
>>>>>>> db696250b0 (GEOMESA-3113 Add system property to managing HBase deletes with visibilities (#2792))
=======
=======
>>>>>>> 7ef22a4bb2 (GEOMESA-3102 Fix removal of user data in FileSystemDataStore.createSchema (#2787))
>>>>>>> a317af9cbb (GEOMESA-3102 Fix removal of user data in FileSystemDataStore.createSchema (#2787))
=======
=======
>>>>>>> 2b62bcaeb4 (GEOMESA-3102 Fix removal of user data in FileSystemDataStore.createSchema (#2787))
>>>>>>> 595d9061e3 (GEOMESA-3102 Fix removal of user data in FileSystemDataStore.createSchema (#2787))
=======
>>>>>>> 2d98e354b8 (GEOMESA-3113 Add system property to managing HBase deletes with visibilities (#2792))
=======
=======
>>>>>>> 75f3f455ec (GEOMESA-3102 Fix removal of user data in FileSystemDataStore.createSchema (#2787))
>>>>>>> 2f550bb2a7 (GEOMESA-3102 Fix removal of user data in FileSystemDataStore.createSchema (#2787))
=======
=======
>>>>>>> 98efbcd374 (GEOMESA-3102 Fix removal of user data in FileSystemDataStore.createSchema (#2787))
>>>>>>> 85d211ca2 (GEOMESA-3102 Fix removal of user data in FileSystemDataStore.createSchema (#2787))
=======
>>>>>>> 595c43086 (GEOMESA-3113 Add system property to managing HBase deletes with visibilities (#2792))
<<<<<<< HEAD
>>>>>>> dc17df6c0 (GEOMESA-3113 Add system property to managing HBase deletes with visibilities (#2792))
<<<<<<< HEAD
>>>>>>> 7a3d004ad1 (GEOMESA-3113 Add system property to managing HBase deletes with visibilities (#2792))
<<<<<<< HEAD
>>>>>>> 8781a5befd (GEOMESA-3113 Add system property to managing HBase deletes with visibilities (#2792))
=======
=======
=======
=======
<<<<<<< HEAD
<<<<<<< HEAD
<<<<<<< HEAD
>>>>>>> 0d3cbc99a (GEOMESA-3102 Fix removal of user data in FileSystemDataStore.createSchema (#2787))
>>>>>>> 74c6b7f8d (GEOMESA-3102 Fix removal of user data in FileSystemDataStore.createSchema (#2787))
>>>>>>> ce07ef89fe (GEOMESA-3102 Fix removal of user data in FileSystemDataStore.createSchema (#2787))
>>>>>>> 98efbcd374 (GEOMESA-3102 Fix removal of user data in FileSystemDataStore.createSchema (#2787))
=======
=======
>>>>>>> 76328bb49 (GEOMESA-3102 Fix removal of user data in FileSystemDataStore.createSchema (#2787))
>>>>>>> 8871b2b4bc (GEOMESA-3102 Fix removal of user data in FileSystemDataStore.createSchema (#2787))
>>>>>>> dfae24c155 (GEOMESA-3102 Fix removal of user data in FileSystemDataStore.createSchema (#2787))
=======
>>>>>>> a52516cf49 (GEOMESA-3113 Add system property to managing HBase deletes with visibilities (#2792))
=======
>>>>>>> 7e8f76c0f9 (GEOMESA-3102 Fix removal of user data in FileSystemDataStore.createSchema (#2787))
=======
=======
>>>>>>> 1b5719bd33 (GEOMESA-3113 Add system property to managing HBase deletes with visibilities (#2792))
>>>>>>> 1351a5baa4 (GEOMESA-3113 Add system property to managing HBase deletes with visibilities (#2792))
=======
>>>>>>> 84634d919 (GEOMESA-3113 Add system property to managing HBase deletes with visibilities (#2792))
<<<<<<< HEAD
>>>>>>> 3c4fc5a828 (GEOMESA-3113 Add system property to managing HBase deletes with visibilities (#2792))
<<<<<<< HEAD
>>>>>>> 857489f8a0 (GEOMESA-3113 Add system property to managing HBase deletes with visibilities (#2792))
=======
=======
=======
=======
>>>>>>> 85d211ca2 (GEOMESA-3102 Fix removal of user data in FileSystemDataStore.createSchema (#2787))
=======
>>>>>>> 595c43086 (GEOMESA-3113 Add system property to managing HBase deletes with visibilities (#2792))
>>>>>>> de3e57f03 (GEOMESA-3113 Add system property to managing HBase deletes with visibilities (#2792))
<<<<<<< HEAD
>>>>>>> 92feb5d273 (GEOMESA-3113 Add system property to managing HBase deletes with visibilities (#2792))
<<<<<<< HEAD
>>>>>>> 083bb9617b (GEOMESA-3113 Add system property to managing HBase deletes with visibilities (#2792))
=======
=======
=======
>>>>>>> 113b056da (GEOMESA-3113 Add system property to managing HBase deletes with visibilities (#2792))
<<<<<<< HEAD
>>>>>>> 6f73f22005 (GEOMESA-3113 Add system property to managing HBase deletes with visibilities (#2792))
<<<<<<< HEAD
>>>>>>> 32aba52002 (GEOMESA-3113 Add system property to managing HBase deletes with visibilities (#2792))
=======
=======
>>>>>>> 7c98bab97e (GEOMESA-3113 Add system property to managing HBase deletes with visibilities (#2792))
=======
=======
>>>>>>> 85d211ca2 (GEOMESA-3102 Fix removal of user data in FileSystemDataStore.createSchema (#2787))
=======
>>>>>>> 595c43086 (GEOMESA-3113 Add system property to managing HBase deletes with visibilities (#2792))
>>>>>>> dc17df6c0 (GEOMESA-3113 Add system property to managing HBase deletes with visibilities (#2792))
<<<<<<< HEAD
>>>>>>> 58f72e76c (GEOMESA-3113 Add system property to managing HBase deletes with visibilities (#2792))
<<<<<<< HEAD
>>>>>>> 8a234c7900 (GEOMESA-3113 Add system property to managing HBase deletes with visibilities (#2792))
<<<<<<< HEAD
>>>>>>> 2c630f9360 (GEOMESA-3113 Add system property to managing HBase deletes with visibilities (#2792))
=======
=======
=======
>>>>>>> 4c9fb0f6e (GEOMESA-3113 Add system property to managing HBase deletes with visibilities (#2792))
<<<<<<< HEAD
>>>>>>> b51d3046a2 (GEOMESA-3113 Add system property to managing HBase deletes with visibilities (#2792))
<<<<<<< HEAD
>>>>>>> b69b6b3ea1 (GEOMESA-3113 Add system property to managing HBase deletes with visibilities (#2792))
=======
=======
=======
>>>>>>> 72415e208a (GEOMESA-3113 Add system property to managing HBase deletes with visibilities (#2792))
>>>>>>> c14e106409 (GEOMESA-3113 Add system property to managing HBase deletes with visibilities (#2792))
>>>>>>> 665046a461 (GEOMESA-3113 Add system property to managing HBase deletes with visibilities (#2792))
=======
=======
>>>>>>> b1dea55b93 (GEOMESA-3113 Add system property to managing HBase deletes with visibilities (#2792))
>>>>>>> 5521d97d99 (GEOMESA-3102 Fix removal of user data in FileSystemDataStore.createSchema (#2787))
<<<<<<< HEAD
>>>>>>> 0e67f36558 (GEOMESA-3102 Fix removal of user data in FileSystemDataStore.createSchema (#2787))
<<<<<<< HEAD
>>>>>>> 1382ba7fd3 (GEOMESA-3102 Fix removal of user data in FileSystemDataStore.createSchema (#2787))
=======
=======
=======
=======
>>>>>>> 9814eb976 (GEOMESA-3113 Add system property to managing HBase deletes with visibilities (#2792))
=======
>>>>>>> 6157978769 (GEOMESA-3102 Fix removal of user data in FileSystemDataStore.createSchema (#2787))
>>>>>>> 26fc359a06 (GEOMESA-3113 Add system property to managing HBase deletes with visibilities (#2792))
<<<<<<< HEAD
>>>>>>> 56f97cd271 (GEOMESA-3113 Add system property to managing HBase deletes with visibilities (#2792))
<<<<<<< HEAD
>>>>>>> b1dea55b93 (GEOMESA-3113 Add system property to managing HBase deletes with visibilities (#2792))
=======
=======
=======
=======
=======
>>>>>>> 85d211ca2 (GEOMESA-3102 Fix removal of user data in FileSystemDataStore.createSchema (#2787))
>>>>>>> 7119f2c52 (GEOMESA-3102 Fix removal of user data in FileSystemDataStore.createSchema (#2787))
=======
>>>>>>> 7d3ca180ff (GEOMESA-3113 Add system property to managing HBase deletes with visibilities (#2792))
>>>>>>> adf2ac19a8 (GEOMESA-3102 Fix removal of user data in FileSystemDataStore.createSchema (#2787))
<<<<<<< HEAD
>>>>>>> 89ea8190e2 (GEOMESA-3102 Fix removal of user data in FileSystemDataStore.createSchema (#2787))
<<<<<<< HEAD
>>>>>>> 6157978769 (GEOMESA-3102 Fix removal of user data in FileSystemDataStore.createSchema (#2787))
=======
=======
=======
=======
=======
>>>>>>> 85d211ca2 (GEOMESA-3102 Fix removal of user data in FileSystemDataStore.createSchema (#2787))
=======
>>>>>>> 595c43086 (GEOMESA-3113 Add system property to managing HBase deletes with visibilities (#2792))
>>>>>>> 803762354 (GEOMESA-3113 Add system property to managing HBase deletes with visibilities (#2792))
<<<<<<< HEAD
>>>>>>> e62505d539 (GEOMESA-3113 Add system property to managing HBase deletes with visibilities (#2792))
<<<<<<< HEAD
>>>>>>> 3226e92d8e (GEOMESA-3113 Add system property to managing HBase deletes with visibilities (#2792))
<<<<<<< HEAD
>>>>>>> 7d3ca180ff (GEOMESA-3113 Add system property to managing HBase deletes with visibilities (#2792))
=======
=======
=======
=======
=======
<<<<<<< HEAD
<<<<<<< HEAD
<<<<<<< HEAD
>>>>>>> 0d3cbc99a (GEOMESA-3102 Fix removal of user data in FileSystemDataStore.createSchema (#2787))
>>>>>>> f0b61142b (GEOMESA-3102 Fix removal of user data in FileSystemDataStore.createSchema (#2787))
<<<<<<< HEAD
>>>>>>> 0a6aff78fb (GEOMESA-3102 Fix removal of user data in FileSystemDataStore.createSchema (#2787))
<<<<<<< HEAD
>>>>>>> d9cabf401c (GEOMESA-3102 Fix removal of user data in FileSystemDataStore.createSchema (#2787))
<<<<<<< HEAD
>>>>>>> ddc69d17c8 (GEOMESA-3102 Fix removal of user data in FileSystemDataStore.createSchema (#2787))
=======
=======
=======
=======
>>>>>>> bd17bd131 (GEOMESA-3102 Fix removal of user data in FileSystemDataStore.createSchema (#2787))
<<<<<<< HEAD
>>>>>>> c555446b8b (GEOMESA-3102 Fix removal of user data in FileSystemDataStore.createSchema (#2787))
<<<<<<< HEAD
>>>>>>> 1230d64006 (GEOMESA-3102 Fix removal of user data in FileSystemDataStore.createSchema (#2787))
<<<<<<< HEAD
>>>>>>> f9996d127e (GEOMESA-3102 Fix removal of user data in FileSystemDataStore.createSchema (#2787))
=======
=======
=======
=======
=======
>>>>>>> 45dca3e07 (GEOMESA-3113 Add system property to managing HBase deletes with visibilities (#2792))
>>>>>>> ca22354dd (GEOMESA-3113 Add system property to managing HBase deletes with visibilities (#2792))
=======
>>>>>>> 957de96206 (GEOMESA-3102 Fix removal of user data in FileSystemDataStore.createSchema (#2787))
>>>>>>> 797b02396b (GEOMESA-3113 Add system property to managing HBase deletes with visibilities (#2792))
<<<<<<< HEAD
>>>>>>> cd5564bac6 (GEOMESA-3113 Add system property to managing HBase deletes with visibilities (#2792))
<<<<<<< HEAD
>>>>>>> 73d82b731c (GEOMESA-3113 Add system property to managing HBase deletes with visibilities (#2792))
=======
=======
=======
=======
>>>>>>> c385f7994 (GEOMESA-3102 Fix removal of user data in FileSystemDataStore.createSchema (#2787))
=======
>>>>>>> 3c673847c5 (GEOMESA-3113 Add system property to managing HBase deletes with visibilities (#2792))
>>>>>>> 3171e7407d (GEOMESA-3102 Fix removal of user data in FileSystemDataStore.createSchema (#2787))
<<<<<<< HEAD
>>>>>>> 038b4ca087 (GEOMESA-3102 Fix removal of user data in FileSystemDataStore.createSchema (#2787))
<<<<<<< HEAD
>>>>>>> 957de96206 (GEOMESA-3102 Fix removal of user data in FileSystemDataStore.createSchema (#2787))
=======
=======
=======
=======
=======
=======
=======
>>>>>>> 5d89f9f58f (GEOMESA-3102 Fix removal of user data in FileSystemDataStore.createSchema (#2787))
>>>>>>> 85d211ca2 (GEOMESA-3102 Fix removal of user data in FileSystemDataStore.createSchema (#2787))
=======
>>>>>>> 595c43086 (GEOMESA-3113 Add system property to managing HBase deletes with visibilities (#2792))
<<<<<<< HEAD
>>>>>>> dc17df6c0 (GEOMESA-3113 Add system property to managing HBase deletes with visibilities (#2792))
<<<<<<< HEAD
>>>>>>> 2d758409c (GEOMESA-3113 Add system property to managing HBase deletes with visibilities (#2792))
<<<<<<< HEAD
>>>>>>> 237494b1cc (GEOMESA-3113 Add system property to managing HBase deletes with visibilities (#2792))
<<<<<<< HEAD
>>>>>>> d774dc1d12 (GEOMESA-3113 Add system property to managing HBase deletes with visibilities (#2792))
<<<<<<< HEAD
>>>>>>> 3c673847c5 (GEOMESA-3113 Add system property to managing HBase deletes with visibilities (#2792))
=======
=======
=======
=======
=======
=======
<<<<<<< HEAD
<<<<<<< HEAD
<<<<<<< HEAD
>>>>>>> 0d3cbc99a (GEOMESA-3102 Fix removal of user data in FileSystemDataStore.createSchema (#2787))
>>>>>>> 74c6b7f8d (GEOMESA-3102 Fix removal of user data in FileSystemDataStore.createSchema (#2787))
>>>>>>> 5a7f44513 (GEOMESA-3102 Fix removal of user data in FileSystemDataStore.createSchema (#2787))
<<<<<<< HEAD
>>>>>>> c7eb576a40 (GEOMESA-3102 Fix removal of user data in FileSystemDataStore.createSchema (#2787))
<<<<<<< HEAD
>>>>>>> 0645a0bbaf (GEOMESA-3102 Fix removal of user data in FileSystemDataStore.createSchema (#2787))
<<<<<<< HEAD
>>>>>>> 5d89f9f58f (GEOMESA-3102 Fix removal of user data in FileSystemDataStore.createSchema (#2787))
=======
=======
=======
=======
>>>>>>> 5c68fb7d1 (GEOMESA-3102 Fix removal of user data in FileSystemDataStore.createSchema (#2787))
<<<<<<< HEAD
>>>>>>> 9ec1f049a9 (GEOMESA-3102 Fix removal of user data in FileSystemDataStore.createSchema (#2787))
<<<<<<< HEAD
>>>>>>> e8b1c389e3 (GEOMESA-3102 Fix removal of user data in FileSystemDataStore.createSchema (#2787))
<<<<<<< HEAD
>>>>>>> d03b76c630 (GEOMESA-3102 Fix removal of user data in FileSystemDataStore.createSchema (#2787))
=======
=======
=======
=======
=======
>>>>>>> f8f49130b (GEOMESA-3113 Add system property to managing HBase deletes with visibilities (#2792))
>>>>>>> 4a47c538b (GEOMESA-3113 Add system property to managing HBase deletes with visibilities (#2792))
=======
>>>>>>> 0cb32b7425 (GEOMESA-3102 Fix removal of user data in FileSystemDataStore.createSchema (#2787))
>>>>>>> a0d6da1831 (GEOMESA-3113 Add system property to managing HBase deletes with visibilities (#2792))
<<<<<<< HEAD
>>>>>>> 6abf5007af (GEOMESA-3113 Add system property to managing HBase deletes with visibilities (#2792))
<<<<<<< HEAD
>>>>>>> ebbfa035a9 (GEOMESA-3113 Add system property to managing HBase deletes with visibilities (#2792))
=======
=======
=======
=======
>>>>>>> a358de35a (GEOMESA-3102 Fix removal of user data in FileSystemDataStore.createSchema (#2787))
=======
>>>>>>> ad7a284ebe (GEOMESA-3113 Add system property to managing HBase deletes with visibilities (#2792))
>>>>>>> 1faf0d16f2 (GEOMESA-3102 Fix removal of user data in FileSystemDataStore.createSchema (#2787))
<<<<<<< HEAD
>>>>>>> 2212530e6b (GEOMESA-3102 Fix removal of user data in FileSystemDataStore.createSchema (#2787))
<<<<<<< HEAD
>>>>>>> 0cb32b7425 (GEOMESA-3102 Fix removal of user data in FileSystemDataStore.createSchema (#2787))
=======
=======
=======
=======
=======
=======
>>>>>>> 85d211ca2 (GEOMESA-3102 Fix removal of user data in FileSystemDataStore.createSchema (#2787))
=======
>>>>>>> 595c43086 (GEOMESA-3113 Add system property to managing HBase deletes with visibilities (#2792))
>>>>>>> 0cdf3f267 (GEOMESA-3113 Add system property to managing HBase deletes with visibilities (#2792))
>>>>>>> 44b15e96d (GEOMESA-3113 Add system property to managing HBase deletes with visibilities (#2792))
<<<<<<< HEAD
>>>>>>> e5413df04f (GEOMESA-3113 Add system property to managing HBase deletes with visibilities (#2792))
<<<<<<< HEAD
>>>>>>> d38e17d229 (GEOMESA-3113 Add system property to managing HBase deletes with visibilities (#2792))
<<<<<<< HEAD
>>>>>>> ad7a284ebe (GEOMESA-3113 Add system property to managing HBase deletes with visibilities (#2792))
=======
=======
=======
=======
>>>>>>> d488f4180 (GEOMESA-3102 Fix removal of user data in FileSystemDataStore.createSchema (#2787))
<<<<<<< HEAD
>>>>>>> 8aa4f55ef6 (GEOMESA-3102 Fix removal of user data in FileSystemDataStore.createSchema (#2787))
<<<<<<< HEAD
>>>>>>> aeb7c3ed76 (GEOMESA-3102 Fix removal of user data in FileSystemDataStore.createSchema (#2787))
<<<<<<< HEAD
>>>>>>> be8a3bab90 (GEOMESA-3102 Fix removal of user data in FileSystemDataStore.createSchema (#2787))
=======
=======
=======
=======
>>>>>>> ac2d5a925 (GEOMESA-3113 Add system property to managing HBase deletes with visibilities (#2792))
=======
>>>>>>> af5b690d0b (GEOMESA-3102 Fix removal of user data in FileSystemDataStore.createSchema (#2787))
>>>>>>> 11addb1ce7 (GEOMESA-3113 Add system property to managing HBase deletes with visibilities (#2792))
<<<<<<< HEAD
>>>>>>> 42bfd74c63 (GEOMESA-3113 Add system property to managing HBase deletes with visibilities (#2792))
<<<<<<< HEAD
>>>>>>> b3fe983979 (GEOMESA-3113 Add system property to managing HBase deletes with visibilities (#2792))
=======
=======
=======
=======
=======
>>>>>>> 85d211ca2 (GEOMESA-3102 Fix removal of user data in FileSystemDataStore.createSchema (#2787))
>>>>>>> 9ce7ed900 (GEOMESA-3102 Fix removal of user data in FileSystemDataStore.createSchema (#2787))
=======
>>>>>>> 02a91455d8 (GEOMESA-3113 Add system property to managing HBase deletes with visibilities (#2792))
>>>>>>> 90d85d9b4b (GEOMESA-3102 Fix removal of user data in FileSystemDataStore.createSchema (#2787))
<<<<<<< HEAD
>>>>>>> bce9dc3e0e (GEOMESA-3102 Fix removal of user data in FileSystemDataStore.createSchema (#2787))
<<<<<<< HEAD
>>>>>>> af5b690d0b (GEOMESA-3102 Fix removal of user data in FileSystemDataStore.createSchema (#2787))
=======
=======
=======
=======
=======
>>>>>>> 85d211ca2 (GEOMESA-3102 Fix removal of user data in FileSystemDataStore.createSchema (#2787))
=======
>>>>>>> 595c43086 (GEOMESA-3113 Add system property to managing HBase deletes with visibilities (#2792))
>>>>>>> 7abafecb1 (GEOMESA-3113 Add system property to managing HBase deletes with visibilities (#2792))
=======
>>>>>>> 8c775c1126 (GEOMESA-3102 Fix removal of user data in FileSystemDataStore.createSchema (#2787))
>>>>>>> 1468e59829 (GEOMESA-3113 Add system property to managing HBase deletes with visibilities (#2792))
<<<<<<< HEAD
>>>>>>> 9c750992ef (GEOMESA-3113 Add system property to managing HBase deletes with visibilities (#2792))
<<<<<<< HEAD
>>>>>>> 02a91455d8 (GEOMESA-3113 Add system property to managing HBase deletes with visibilities (#2792))
=======
=======
=======
=======
>>>>>>> 7ef22a4bb (GEOMESA-3102 Fix removal of user data in FileSystemDataStore.createSchema (#2787))
=======
>>>>>>> b1b67a398d (GEOMESA-3102 Fix removal of user data in FileSystemDataStore.createSchema (#2787))
>>>>>>> c8d3361f41 (GEOMESA-3102 Fix removal of user data in FileSystemDataStore.createSchema (#2787))
<<<<<<< HEAD
>>>>>>> 48dcb085fa (GEOMESA-3102 Fix removal of user data in FileSystemDataStore.createSchema (#2787))
<<<<<<< HEAD
>>>>>>> 8c775c1126 (GEOMESA-3102 Fix removal of user data in FileSystemDataStore.createSchema (#2787))
=======
=======
=======
=======
>>>>>>> 2b62bcaeb (GEOMESA-3102 Fix removal of user data in FileSystemDataStore.createSchema (#2787))
=======
>>>>>>> cbaecd4a0f (GEOMESA-3113 Add system property to managing HBase deletes with visibilities (#2792))
>>>>>>> a618e2ba0a (GEOMESA-3102 Fix removal of user data in FileSystemDataStore.createSchema (#2787))
<<<<<<< HEAD
>>>>>>> 687ba5655c (GEOMESA-3102 Fix removal of user data in FileSystemDataStore.createSchema (#2787))
<<<<<<< HEAD
>>>>>>> b1b67a398d (GEOMESA-3102 Fix removal of user data in FileSystemDataStore.createSchema (#2787))
=======
=======
=======
=======
=======
>>>>>>> 45dca3e07 (GEOMESA-3113 Add system property to managing HBase deletes with visibilities (#2792))
>>>>>>> afc081190 (GEOMESA-3113 Add system property to managing HBase deletes with visibilities (#2792))
=======
>>>>>>> a23109e63b (GEOMESA-3102 Fix removal of user data in FileSystemDataStore.createSchema (#2787))
>>>>>>> 65360f96a0 (GEOMESA-3113 Add system property to managing HBase deletes with visibilities (#2792))
<<<<<<< HEAD
>>>>>>> 97a911d79c (GEOMESA-3113 Add system property to managing HBase deletes with visibilities (#2792))
<<<<<<< HEAD
>>>>>>> cbaecd4a0f (GEOMESA-3113 Add system property to managing HBase deletes with visibilities (#2792))
=======
=======
=======
=======
>>>>>>> 75f3f455e (GEOMESA-3102 Fix removal of user data in FileSystemDataStore.createSchema (#2787))
=======
>>>>>>> 9b169d0847 (GEOMESA-3113 Add system property to managing HBase deletes with visibilities (#2792))
>>>>>>> 20dc993a76 (GEOMESA-3102 Fix removal of user data in FileSystemDataStore.createSchema (#2787))
<<<<<<< HEAD
>>>>>>> 33d2777a8a (GEOMESA-3102 Fix removal of user data in FileSystemDataStore.createSchema (#2787))
<<<<<<< HEAD
>>>>>>> a23109e63b (GEOMESA-3102 Fix removal of user data in FileSystemDataStore.createSchema (#2787))
=======
=======
=======
=======
=======
=======
=======
>>>>>>> 2544a6c80c (GEOMESA-3102 Fix removal of user data in FileSystemDataStore.createSchema (#2787))
>>>>>>> 85d211ca2 (GEOMESA-3102 Fix removal of user data in FileSystemDataStore.createSchema (#2787))
=======
>>>>>>> 595c43086 (GEOMESA-3113 Add system property to managing HBase deletes with visibilities (#2792))
<<<<<<< HEAD
>>>>>>> dc17df6c0 (GEOMESA-3113 Add system property to managing HBase deletes with visibilities (#2792))
<<<<<<< HEAD
>>>>>>> 7a3d004ad (GEOMESA-3113 Add system property to managing HBase deletes with visibilities (#2792))
<<<<<<< HEAD
>>>>>>> bd6dd934cc (GEOMESA-3113 Add system property to managing HBase deletes with visibilities (#2792))
<<<<<<< HEAD
>>>>>>> cc5f917a7c (GEOMESA-3113 Add system property to managing HBase deletes with visibilities (#2792))
<<<<<<< HEAD
>>>>>>> 9b169d0847 (GEOMESA-3113 Add system property to managing HBase deletes with visibilities (#2792))
=======
=======
=======
=======
=======
=======
<<<<<<< HEAD
<<<<<<< HEAD
<<<<<<< HEAD
>>>>>>> 0d3cbc99a (GEOMESA-3102 Fix removal of user data in FileSystemDataStore.createSchema (#2787))
>>>>>>> 74c6b7f8d (GEOMESA-3102 Fix removal of user data in FileSystemDataStore.createSchema (#2787))
>>>>>>> ce07ef89f (GEOMESA-3102 Fix removal of user data in FileSystemDataStore.createSchema (#2787))
<<<<<<< HEAD
>>>>>>> b6118ef7a5 (GEOMESA-3102 Fix removal of user data in FileSystemDataStore.createSchema (#2787))
<<<<<<< HEAD
>>>>>>> 8309b2b098 (GEOMESA-3102 Fix removal of user data in FileSystemDataStore.createSchema (#2787))
<<<<<<< HEAD
>>>>>>> 2544a6c80c (GEOMESA-3102 Fix removal of user data in FileSystemDataStore.createSchema (#2787))
=======
=======
=======
=======
>>>>>>> 8871b2b4b (GEOMESA-3102 Fix removal of user data in FileSystemDataStore.createSchema (#2787))
<<<<<<< HEAD
>>>>>>> 495c744326 (GEOMESA-3102 Fix removal of user data in FileSystemDataStore.createSchema (#2787))
<<<<<<< HEAD
>>>>>>> a49ee0e00a (GEOMESA-3102 Fix removal of user data in FileSystemDataStore.createSchema (#2787))
<<<<<<< HEAD
>>>>>>> eb98a9fb29 (GEOMESA-3102 Fix removal of user data in FileSystemDataStore.createSchema (#2787))
=======
=======
=======
=======
=======
>>>>>>> f8f49130b (GEOMESA-3113 Add system property to managing HBase deletes with visibilities (#2792))
>>>>>>> 91b0d6a88 (GEOMESA-3113 Add system property to managing HBase deletes with visibilities (#2792))
=======
>>>>>>> ef0351a168 (GEOMESA-3102 Fix removal of user data in FileSystemDataStore.createSchema (#2787))
>>>>>>> 49d3846b23 (GEOMESA-3113 Add system property to managing HBase deletes with visibilities (#2792))
<<<<<<< HEAD
>>>>>>> 3adb85864f (GEOMESA-3113 Add system property to managing HBase deletes with visibilities (#2792))
<<<<<<< HEAD
>>>>>>> d539392ecd (GEOMESA-3113 Add system property to managing HBase deletes with visibilities (#2792))
=======
=======
=======
=======
>>>>>>> 4f922d74c (GEOMESA-3102 Fix removal of user data in FileSystemDataStore.createSchema (#2787))
=======
>>>>>>> d9ec67b278 (GEOMESA-3113 Add system property to managing HBase deletes with visibilities (#2792))
>>>>>>> 155d6a9469 (GEOMESA-3102 Fix removal of user data in FileSystemDataStore.createSchema (#2787))
<<<<<<< HEAD
>>>>>>> a1198ce095 (GEOMESA-3102 Fix removal of user data in FileSystemDataStore.createSchema (#2787))
<<<<<<< HEAD
>>>>>>> ef0351a168 (GEOMESA-3102 Fix removal of user data in FileSystemDataStore.createSchema (#2787))
=======
=======
=======
=======
>>>>>>> 1b5719bd3 (GEOMESA-3113 Add system property to managing HBase deletes with visibilities (#2792))
>>>>>>> e4ee051914 (GEOMESA-3113 Add system property to managing HBase deletes with visibilities (#2792))
>>>>>>> 260d67442f (GEOMESA-3113 Add system property to managing HBase deletes with visibilities (#2792))
>>>>>>> d9ec67b278 (GEOMESA-3113 Add system property to managing HBase deletes with visibilities (#2792))
=======
>>>>>>> 7053435184 (GEOMESA-3102 Fix removal of user data in FileSystemDataStore.createSchema (#2787))
=======
=======
>>>>>>> bcf168a888 (GEOMESA-3113 Add system property to managing HBase deletes with visibilities (#2792))
>>>>>>> 1417ba30dc (GEOMESA-3113 Add system property to managing HBase deletes with visibilities (#2792))
=======
>>>>>>> 0acf2e86fa (GEOMESA-3102 Fix removal of user data in FileSystemDataStore.createSchema (#2787))
=======
>>>>>>> 19e79eeeaa (GEOMESA-3113 Add system property to managing HBase deletes with visibilities (#2792))
=======
=======
>>>>>>> ba7f2715c5 (GEOMESA-3102 Fix removal of user data in FileSystemDataStore.createSchema (#2787))
>>>>>>> 9513a4f9a1 (GEOMESA-3102 Fix removal of user data in FileSystemDataStore.createSchema (#2787))
=======
>>>>>>> d61b3bb194 (GEOMESA-3102 Fix removal of user data in FileSystemDataStore.createSchema (#2787))
=======
>>>>>>> 0121c0dbad (GEOMESA-3113 Add system property to managing HBase deletes with visibilities (#2792))
=======
=======
>>>>>>> 9c809610d5 (GEOMESA-3102 Fix removal of user data in FileSystemDataStore.createSchema (#2787))
>>>>>>> e518bfb9e2 (GEOMESA-3102 Fix removal of user data in FileSystemDataStore.createSchema (#2787))
=======
>>>>>>> 5a43551b62 (GEOMESA-3113 Add system property to managing HBase deletes with visibilities (#2792))
=======
=======
>>>>>>> a030b80514 (GEOMESA-3102 Fix removal of user data in FileSystemDataStore.createSchema (#2787))
>>>>>>> a13c4c4fa7 (GEOMESA-3102 Fix removal of user data in FileSystemDataStore.createSchema (#2787))
=======
>>>>>>> 93a4d60f28 (GEOMESA-3102 Fix removal of user data in FileSystemDataStore.createSchema (#2787))
=======
>>>>>>> 6bef55a1ea (GEOMESA-3113 Add system property to managing HBase deletes with visibilities (#2792))
=======
=======
>>>>>>> 98ce8bad96 (GEOMESA-3102 Fix removal of user data in FileSystemDataStore.createSchema (#2787))
>>>>>>> 48bb106de6 (GEOMESA-3102 Fix removal of user data in FileSystemDataStore.createSchema (#2787))
=======
>>>>>>> ce7c794944 (GEOMESA-3113 Add system property to managing HBase deletes with visibilities (#2792))
=======
=======
>>>>>>> e055239c40 (GEOMESA-3102 Fix removal of user data in FileSystemDataStore.createSchema (#2787))
>>>>>>> 5b83f2d5c8 (GEOMESA-3102 Fix removal of user data in FileSystemDataStore.createSchema (#2787))
=======
>>>>>>> 5f8777dc16 (GEOMESA-3113 Add system property to managing HBase deletes with visibilities (#2792))
=======
>>>>>>> 8414c0cefb (GEOMESA-3102 Fix removal of user data in FileSystemDataStore.createSchema (#2787))
=======
>>>>>>> b81683f4bc (GEOMESA-3113 Add system property to managing HBase deletes with visibilities (#2792))
=======
=======
>>>>>>> d24328f760 (GEOMESA-3102 Fix removal of user data in FileSystemDataStore.createSchema (#2787))
>>>>>>> 01ee16a4c0 (GEOMESA-3102 Fix removal of user data in FileSystemDataStore.createSchema (#2787))
=======
>>>>>>> 6f9b076410 (GEOMESA-3102 Fix removal of user data in FileSystemDataStore.createSchema (#2787))
=======
>>>>>>> 39a2b37b5e (GEOMESA-3113 Add system property to managing HBase deletes with visibilities (#2792))
=======
=======
>>>>>>> b52e5bb454 (GEOMESA-3102 Fix removal of user data in FileSystemDataStore.createSchema (#2787))
>>>>>>> a0d25ffbaa (GEOMESA-3102 Fix removal of user data in FileSystemDataStore.createSchema (#2787))
=======
=======
>>>>>>> ade0b3801f (GEOMESA-3102 Fix removal of user data in FileSystemDataStore.createSchema (#2787))
>>>>>>> 85d211ca2 (GEOMESA-3102 Fix removal of user data in FileSystemDataStore.createSchema (#2787))
=======
>>>>>>> 595c43086 (GEOMESA-3113 Add system property to managing HBase deletes with visibilities (#2792))
<<<<<<< HEAD
>>>>>>> dc17df6c0 (GEOMESA-3113 Add system property to managing HBase deletes with visibilities (#2792))
<<<<<<< HEAD
>>>>>>> 4bd5ce922d (GEOMESA-3113 Add system property to managing HBase deletes with visibilities (#2792))
<<<<<<< HEAD
>>>>>>> 7f28e8e2e5 (GEOMESA-3113 Add system property to managing HBase deletes with visibilities (#2792))
=======
=======
=======
=======
<<<<<<< HEAD
<<<<<<< HEAD
<<<<<<< HEAD
>>>>>>> 0d3cbc99a (GEOMESA-3102 Fix removal of user data in FileSystemDataStore.createSchema (#2787))
>>>>>>> 74c6b7f8d (GEOMESA-3102 Fix removal of user data in FileSystemDataStore.createSchema (#2787))
>>>>>>> d3ef2e8e78 (GEOMESA-3102 Fix removal of user data in FileSystemDataStore.createSchema (#2787))
>>>>>>> ade0b3801f (GEOMESA-3102 Fix removal of user data in FileSystemDataStore.createSchema (#2787))
=======
>>>>>>> 9171ff5334 (GEOMESA-3102 Fix removal of user data in FileSystemDataStore.createSchema (#2787))
=======
=======
>>>>>>> e17f495391 (GEOMESA-3113 Add system property to managing HBase deletes with visibilities (#2792))
>>>>>>> f1f448d9e0 (GEOMESA-3113 Add system property to managing HBase deletes with visibilities (#2792))
=======
>>>>>>> abaa89e702 (GEOMESA-3102 Fix removal of user data in FileSystemDataStore.createSchema (#2787))
=======
>>>>>>> d857d34521 (GEOMESA-3113 Add system property to managing HBase deletes with visibilities (#2792))
>>>>>>> 8524ef3a47 (GEOMESA-3113 Add system property to managing HBase deletes with visibilities (#2792))
=======
>>>>>>> 0cdf3f2672 (GEOMESA-3113 Add system property to managing HBase deletes with visibilities (#2792))
<<<<<<< HEAD
>>>>>>> d857d34521 (GEOMESA-3113 Add system property to managing HBase deletes with visibilities (#2792))
=======
=======
>>>>>>> 5e66748475 (GEOMESA-3102 Fix removal of user data in FileSystemDataStore.createSchema (#2787))
<<<<<<< HEAD
>>>>>>> 4100fa1ce8 (GEOMESA-3102 Fix removal of user data in FileSystemDataStore.createSchema (#2787))
<<<<<<< HEAD
>>>>>>> b5ef5f3ffb (GEOMESA-3102 Fix removal of user data in FileSystemDataStore.createSchema (#2787))
=======
=======
=======
>>>>>>> 9814eb9768 (GEOMESA-3113 Add system property to managing HBase deletes with visibilities (#2792))
<<<<<<< HEAD
>>>>>>> b515d530a4 (GEOMESA-3113 Add system property to managing HBase deletes with visibilities (#2792))
<<<<<<< HEAD
>>>>>>> a0d7cc16ab (GEOMESA-3113 Add system property to managing HBase deletes with visibilities (#2792))
=======
=======
=======
=======
>>>>>>> 85d211ca2 (GEOMESA-3102 Fix removal of user data in FileSystemDataStore.createSchema (#2787))
>>>>>>> 7119f2c52a (GEOMESA-3102 Fix removal of user data in FileSystemDataStore.createSchema (#2787))
>>>>>>> 7ee0f1d494 (GEOMESA-3102 Fix removal of user data in FileSystemDataStore.createSchema (#2787))
<<<<<<< HEAD
>>>>>>> ae19085932 (GEOMESA-3102 Fix removal of user data in FileSystemDataStore.createSchema (#2787))
=======
=======
>>>>>>> 85d211ca2 (GEOMESA-3102 Fix removal of user data in FileSystemDataStore.createSchema (#2787))
=======
>>>>>>> 595c43086 (GEOMESA-3113 Add system property to managing HBase deletes with visibilities (#2792))
>>>>>>> 8037623548 (GEOMESA-3113 Add system property to managing HBase deletes with visibilities (#2792))
<<<<<<< HEAD
>>>>>>> 02fea6930b (GEOMESA-3113 Add system property to managing HBase deletes with visibilities (#2792))
<<<<<<< HEAD
>>>>>>> cdbed26e09 (GEOMESA-3113 Add system property to managing HBase deletes with visibilities (#2792))
=======
=======
=======
=======
<<<<<<< HEAD
<<<<<<< HEAD
<<<<<<< HEAD
>>>>>>> 0d3cbc99a (GEOMESA-3102 Fix removal of user data in FileSystemDataStore.createSchema (#2787))
>>>>>>> f0b61142b0 (GEOMESA-3102 Fix removal of user data in FileSystemDataStore.createSchema (#2787))
<<<<<<< HEAD
>>>>>>> c843b1759d (GEOMESA-3102 Fix removal of user data in FileSystemDataStore.createSchema (#2787))
<<<<<<< HEAD
>>>>>>> 75e5f895f3 (GEOMESA-3102 Fix removal of user data in FileSystemDataStore.createSchema (#2787))
=======
=======
=======
>>>>>>> bd17bd131e (GEOMESA-3102 Fix removal of user data in FileSystemDataStore.createSchema (#2787))
<<<<<<< HEAD
>>>>>>> a2a804586c (GEOMESA-3102 Fix removal of user data in FileSystemDataStore.createSchema (#2787))
<<<<<<< HEAD
>>>>>>> 83a8ca6465 (GEOMESA-3102 Fix removal of user data in FileSystemDataStore.createSchema (#2787))
=======
=======
=======
=======
>>>>>>> 45dca3e07 (GEOMESA-3113 Add system property to managing HBase deletes with visibilities (#2792))
>>>>>>> ca22354dd7 (GEOMESA-3113 Add system property to managing HBase deletes with visibilities (#2792))
>>>>>>> a773c6ef65 (GEOMESA-3113 Add system property to managing HBase deletes with visibilities (#2792))
<<<<<<< HEAD
>>>>>>> 34fd077439 (GEOMESA-3113 Add system property to managing HBase deletes with visibilities (#2792))
=======
=======
>>>>>>> 2d01ec0bc0 (GEOMESA-3102 Fix removal of user data in FileSystemDataStore.createSchema (#2787))
<<<<<<< HEAD
>>>>>>> f58f87b448 (GEOMESA-3102 Fix removal of user data in FileSystemDataStore.createSchema (#2787))
=======
=======
=======
=======
=======
<<<<<<< HEAD
>>>>>>> 85d211ca2 (GEOMESA-3102 Fix removal of user data in FileSystemDataStore.createSchema (#2787))
=======
>>>>>>> 595c43086 (GEOMESA-3113 Add system property to managing HBase deletes with visibilities (#2792))
<<<<<<< HEAD
>>>>>>> dc17df6c0 (GEOMESA-3113 Add system property to managing HBase deletes with visibilities (#2792))
<<<<<<< HEAD
>>>>>>> 2d758409cd (GEOMESA-3113 Add system property to managing HBase deletes with visibilities (#2792))
<<<<<<< HEAD
>>>>>>> b586a90765 (GEOMESA-3113 Add system property to managing HBase deletes with visibilities (#2792))
<<<<<<< HEAD
>>>>>>> 7196beb2e1 (GEOMESA-3113 Add system property to managing HBase deletes with visibilities (#2792))
=======
=======
=======
=======
=======
<<<<<<< HEAD
<<<<<<< HEAD
<<<<<<< HEAD
>>>>>>> 0d3cbc99a (GEOMESA-3102 Fix removal of user data in FileSystemDataStore.createSchema (#2787))
>>>>>>> 74c6b7f8d (GEOMESA-3102 Fix removal of user data in FileSystemDataStore.createSchema (#2787))
>>>>>>> 5a7f445137 (GEOMESA-3102 Fix removal of user data in FileSystemDataStore.createSchema (#2787))
>>>>>>> 29de027418 (GEOMESA-3102 Fix removal of user data in FileSystemDataStore.createSchema (#2787))
>>>>>>> 68e92adc9f (GEOMESA-3102 Fix removal of user data in FileSystemDataStore.createSchema (#2787))
=======
>>>>>>> b4cc9497d5 (GEOMESA-3102 Fix removal of user data in FileSystemDataStore.createSchema (#2787))
=======
=======
>>>>>>> c0b0589a14 (GEOMESA-3102 Fix removal of user data in FileSystemDataStore.createSchema (#2787))
>>>>>>> 4a47c538bc (GEOMESA-3113 Add system property to managing HBase deletes with visibilities (#2792))
<<<<<<< HEAD
>>>>>>> ba177f9f13 (GEOMESA-3113 Add system property to managing HBase deletes with visibilities (#2792))
<<<<<<< HEAD
>>>>>>> df9cd4f22d (GEOMESA-3113 Add system property to managing HBase deletes with visibilities (#2792))
=======
=======
=======
=======
=======
>>>>>>> 85d211ca2 (GEOMESA-3102 Fix removal of user data in FileSystemDataStore.createSchema (#2787))
>>>>>>> 02ddf6ca4 (GEOMESA-3102 Fix removal of user data in FileSystemDataStore.createSchema (#2787))
=======
>>>>>>> 2b9cd40059 (GEOMESA-3113 Add system property to managing HBase deletes with visibilities (#2792))
>>>>>>> a358de35a8 (GEOMESA-3102 Fix removal of user data in FileSystemDataStore.createSchema (#2787))
<<<<<<< HEAD
>>>>>>> 08ee2fed57 (GEOMESA-3102 Fix removal of user data in FileSystemDataStore.createSchema (#2787))
<<<<<<< HEAD
>>>>>>> c0b0589a14 (GEOMESA-3102 Fix removal of user data in FileSystemDataStore.createSchema (#2787))
=======
=======
=======
=======
=======
>>>>>>> 85d211ca2 (GEOMESA-3102 Fix removal of user data in FileSystemDataStore.createSchema (#2787))
=======
>>>>>>> 595c43086 (GEOMESA-3113 Add system property to managing HBase deletes with visibilities (#2792))
>>>>>>> 0cdf3f267 (GEOMESA-3113 Add system property to managing HBase deletes with visibilities (#2792))
>>>>>>> 44b15e96d9 (GEOMESA-3113 Add system property to managing HBase deletes with visibilities (#2792))
<<<<<<< HEAD
>>>>>>> 813cf035d0 (GEOMESA-3113 Add system property to managing HBase deletes with visibilities (#2792))
<<<<<<< HEAD
>>>>>>> 2b9cd40059 (GEOMESA-3113 Add system property to managing HBase deletes with visibilities (#2792))
=======
=======
=======
>>>>>>> d488f41800 (GEOMESA-3102 Fix removal of user data in FileSystemDataStore.createSchema (#2787))
<<<<<<< HEAD
>>>>>>> 49337228be (GEOMESA-3102 Fix removal of user data in FileSystemDataStore.createSchema (#2787))
<<<<<<< HEAD
>>>>>>> 12ae1c3224 (GEOMESA-3102 Fix removal of user data in FileSystemDataStore.createSchema (#2787))
=======
=======
=======
>>>>>>> ac2d5a925f (GEOMESA-3113 Add system property to managing HBase deletes with visibilities (#2792))
<<<<<<< HEAD
>>>>>>> 54fb546133 (GEOMESA-3113 Add system property to managing HBase deletes with visibilities (#2792))
<<<<<<< HEAD
>>>>>>> 9f616db357 (GEOMESA-3113 Add system property to managing HBase deletes with visibilities (#2792))
=======
=======
=======
=======
>>>>>>> 85d211ca2 (GEOMESA-3102 Fix removal of user data in FileSystemDataStore.createSchema (#2787))
>>>>>>> 9ce7ed900a (GEOMESA-3102 Fix removal of user data in FileSystemDataStore.createSchema (#2787))
>>>>>>> 8be42d246c (GEOMESA-3102 Fix removal of user data in FileSystemDataStore.createSchema (#2787))
<<<<<<< HEAD
>>>>>>> e721efd628 (GEOMESA-3102 Fix removal of user data in FileSystemDataStore.createSchema (#2787))
=======
=======
>>>>>>> 85d211ca2 (GEOMESA-3102 Fix removal of user data in FileSystemDataStore.createSchema (#2787))
=======
>>>>>>> 595c43086 (GEOMESA-3113 Add system property to managing HBase deletes with visibilities (#2792))
>>>>>>> 7abafecb19 (GEOMESA-3113 Add system property to managing HBase deletes with visibilities (#2792))
<<<<<<< HEAD
>>>>>>> 7ac82c3dce (GEOMESA-3113 Add system property to managing HBase deletes with visibilities (#2792))
<<<<<<< HEAD
>>>>>>> ed36e40e7c (GEOMESA-3113 Add system property to managing HBase deletes with visibilities (#2792))
=======
=======
=======
>>>>>>> 7ef22a4bb2 (GEOMESA-3102 Fix removal of user data in FileSystemDataStore.createSchema (#2787))
<<<<<<< HEAD
>>>>>>> 7fd052e7d2 (GEOMESA-3102 Fix removal of user data in FileSystemDataStore.createSchema (#2787))
<<<<<<< HEAD
>>>>>>> a05bcef080 (GEOMESA-3102 Fix removal of user data in FileSystemDataStore.createSchema (#2787))
=======
=======
=======
>>>>>>> 2b62bcaeb4 (GEOMESA-3102 Fix removal of user data in FileSystemDataStore.createSchema (#2787))
>>>>>>> 628458842d (GEOMESA-3102 Fix removal of user data in FileSystemDataStore.createSchema (#2787))
<<<<<<< HEAD
>>>>>>> 8a07c6167f (GEOMESA-3102 Fix removal of user data in FileSystemDataStore.createSchema (#2787))
=======
=======
>>>>>>> aca68ab685 (GEOMESA-3113 Add system property to managing HBase deletes with visibilities (#2792))
<<<<<<< HEAD
>>>>>>> 1b0d520fde (GEOMESA-3113 Add system property to managing HBase deletes with visibilities (#2792))
=======
=======
=======
>>>>>>> 75f3f455ec (GEOMESA-3102 Fix removal of user data in FileSystemDataStore.createSchema (#2787))
>>>>>>> f7952edd5f (GEOMESA-3102 Fix removal of user data in FileSystemDataStore.createSchema (#2787))
>>>>>>> 871350de06 (GEOMESA-3102 Fix removal of user data in FileSystemDataStore.createSchema (#2787))
=======
=======
=======
>>>>>>> 44bdcb9e58 (GEOMESA-3102 Fix removal of user data in FileSystemDataStore.createSchema (#2787))
>>>>>>> 894b6a1a15 (GEOMESA-3102 Fix removal of user data in FileSystemDataStore.createSchema (#2787))
>>>>>>> 85d211ca2 (GEOMESA-3102 Fix removal of user data in FileSystemDataStore.createSchema (#2787))
=======
>>>>>>> 595c43086 (GEOMESA-3113 Add system property to managing HBase deletes with visibilities (#2792))
<<<<<<< HEAD
>>>>>>> dc17df6c0 (GEOMESA-3113 Add system property to managing HBase deletes with visibilities (#2792))
<<<<<<< HEAD
>>>>>>> 7a3d004ad1 (GEOMESA-3113 Add system property to managing HBase deletes with visibilities (#2792))
<<<<<<< HEAD
>>>>>>> fd0793971d (GEOMESA-3113 Add system property to managing HBase deletes with visibilities (#2792))
<<<<<<< HEAD
>>>>>>> 9bcc7591e5 (GEOMESA-3113 Add system property to managing HBase deletes with visibilities (#2792))
=======
=======
=======
=======
=======
<<<<<<< HEAD
<<<<<<< HEAD
<<<<<<< HEAD
>>>>>>> 0d3cbc99a (GEOMESA-3102 Fix removal of user data in FileSystemDataStore.createSchema (#2787))
>>>>>>> 74c6b7f8d (GEOMESA-3102 Fix removal of user data in FileSystemDataStore.createSchema (#2787))
>>>>>>> ce07ef89fe (GEOMESA-3102 Fix removal of user data in FileSystemDataStore.createSchema (#2787))
>>>>>>> 44bdcb9e58 (GEOMESA-3102 Fix removal of user data in FileSystemDataStore.createSchema (#2787))
>>>>>>> 894b6a1a15 (GEOMESA-3102 Fix removal of user data in FileSystemDataStore.createSchema (#2787))
=======
>>>>>>> 853c43fc17 (GEOMESA-3102 Fix removal of user data in FileSystemDataStore.createSchema (#2787))
>>>>>>> 2ec7d64046 (GEOMESA-3102 Fix removal of user data in FileSystemDataStore.createSchema (#2787))
=======
>>>>>>> 853c43fc17 (GEOMESA-3102 Fix removal of user data in FileSystemDataStore.createSchema (#2787))
=======
=======
=======
>>>>>>> f8f49130b (GEOMESA-3113 Add system property to managing HBase deletes with visibilities (#2792))
>>>>>>> 91b0d6a888 (GEOMESA-3113 Add system property to managing HBase deletes with visibilities (#2792))
>>>>>>> e0056031ea (GEOMESA-3113 Add system property to managing HBase deletes with visibilities (#2792))
<<<<<<< HEAD
>>>>>>> 344200f1df (GEOMESA-3113 Add system property to managing HBase deletes with visibilities (#2792))
=======
=======
>>>>>>> 15429a51ce (GEOMESA-3102 Fix removal of user data in FileSystemDataStore.createSchema (#2787))
<<<<<<< HEAD
>>>>>>> 8317120c9b (GEOMESA-3102 Fix removal of user data in FileSystemDataStore.createSchema (#2787))
=======
=======
=======
>>>>>>> 1b5719bd33 (GEOMESA-3113 Add system property to managing HBase deletes with visibilities (#2792))
>>>>>>> e41e9641d2 (GEOMESA-3113 Add system property to managing HBase deletes with visibilities (#2792))
>>>>>>> 98e607d2fa (GEOMESA-3113 Add system property to managing HBase deletes with visibilities (#2792))
=======
=======
>>>>>>> 69016fbbb7 (GEOMESA-3113 Add system property to managing HBase deletes with visibilities (#2792))
>>>>>>> 3c4fc5a828 (GEOMESA-3113 Add system property to managing HBase deletes with visibilities (#2792))
<<<<<<< HEAD
>>>>>>> c6079ecae5 (GEOMESA-3113 Add system property to managing HBase deletes with visibilities (#2792))
<<<<<<< HEAD
>>>>>>> 5d46ff705f (GEOMESA-3113 Add system property to managing HBase deletes with visibilities (#2792))
=======
=======
=======
=======
=======
>>>>>>> 85d211ca2 (GEOMESA-3102 Fix removal of user data in FileSystemDataStore.createSchema (#2787))
=======
>>>>>>> 595c43086 (GEOMESA-3113 Add system property to managing HBase deletes with visibilities (#2792))
>>>>>>> de3e57f03 (GEOMESA-3113 Add system property to managing HBase deletes with visibilities (#2792))
=======
>>>>>>> d73ae82492 (GEOMESA-3113 Add system property to managing HBase deletes with visibilities (#2792))
>>>>>>> 92feb5d273 (GEOMESA-3113 Add system property to managing HBase deletes with visibilities (#2792))
<<<<<<< HEAD
>>>>>>> e0644f7991 (GEOMESA-3113 Add system property to managing HBase deletes with visibilities (#2792))
<<<<<<< HEAD
>>>>>>> 69016fbbb7 (GEOMESA-3113 Add system property to managing HBase deletes with visibilities (#2792))
=======
=======
=======
=======
>>>>>>> 113b056da (GEOMESA-3113 Add system property to managing HBase deletes with visibilities (#2792))
=======
>>>>>>> d1d11691fd (GEOMESA-3113 Add system property to managing HBase deletes with visibilities (#2792))
>>>>>>> 6f73f22005 (GEOMESA-3113 Add system property to managing HBase deletes with visibilities (#2792))
<<<<<<< HEAD
>>>>>>> 9888cda97e (GEOMESA-3113 Add system property to managing HBase deletes with visibilities (#2792))
<<<<<<< HEAD
>>>>>>> d73ae82492 (GEOMESA-3113 Add system property to managing HBase deletes with visibilities (#2792))
=======
=======
=======
=======
>>>>>>> 85d211ca2 (GEOMESA-3102 Fix removal of user data in FileSystemDataStore.createSchema (#2787))
=======
>>>>>>> 595c43086 (GEOMESA-3113 Add system property to managing HBase deletes with visibilities (#2792))
>>>>>>> dc17df6c0 (GEOMESA-3113 Add system property to managing HBase deletes with visibilities (#2792))
>>>>>>> 58f72e76c (GEOMESA-3113 Add system property to managing HBase deletes with visibilities (#2792))
<<<<<<< HEAD
>>>>>>> 8a234c7900 (GEOMESA-3113 Add system property to managing HBase deletes with visibilities (#2792))
<<<<<<< HEAD
>>>>>>> dba8cb28c4 (GEOMESA-3113 Add system property to managing HBase deletes with visibilities (#2792))
<<<<<<< HEAD
>>>>>>> d1d11691fd (GEOMESA-3113 Add system property to managing HBase deletes with visibilities (#2792))
=======
=======
=======
=======
>>>>>>> 4c9fb0f6e (GEOMESA-3113 Add system property to managing HBase deletes with visibilities (#2792))
<<<<<<< HEAD
>>>>>>> b51d3046a2 (GEOMESA-3113 Add system property to managing HBase deletes with visibilities (#2792))
<<<<<<< HEAD
>>>>>>> 5f0745e34b (GEOMESA-3113 Add system property to managing HBase deletes with visibilities (#2792))
<<<<<<< HEAD
>>>>>>> eeb8ab478a (GEOMESA-3113 Add system property to managing HBase deletes with visibilities (#2792))
=======
=======
=======
=======
>>>>>>> 72415e208a (GEOMESA-3113 Add system property to managing HBase deletes with visibilities (#2792))
>>>>>>> c14e106409 (GEOMESA-3113 Add system property to managing HBase deletes with visibilities (#2792))
>>>>>>> e6162be24a (GEOMESA-3113 Add system property to managing HBase deletes with visibilities (#2792))
>>>>>>> a8b2b56cbd (GEOMESA-3113 Add system property to managing HBase deletes with visibilities (#2792))
=======
=======
=======
>>>>>>> 29dcc37810 (GEOMESA-3113 Add system property to managing HBase deletes with visibilities (#2792))
>>>>>>> afcf525d7d (GEOMESA-3113 Add system property to managing HBase deletes with visibilities (#2792))
>>>>>>> 5521d97d99 (GEOMESA-3102 Fix removal of user data in FileSystemDataStore.createSchema (#2787))
<<<<<<< HEAD
>>>>>>> 0e67f36558 (GEOMESA-3102 Fix removal of user data in FileSystemDataStore.createSchema (#2787))
<<<<<<< HEAD
>>>>>>> f502df5b55 (GEOMESA-3102 Fix removal of user data in FileSystemDataStore.createSchema (#2787))
<<<<<<< HEAD
>>>>>>> 27eec0d076 (GEOMESA-3102 Fix removal of user data in FileSystemDataStore.createSchema (#2787))
=======
=======
=======
=======
=======
>>>>>>> 9814eb976 (GEOMESA-3113 Add system property to managing HBase deletes with visibilities (#2792))
=======
>>>>>>> e11c16ba5d (GEOMESA-3102 Fix removal of user data in FileSystemDataStore.createSchema (#2787))
>>>>>>> 26fc359a06 (GEOMESA-3113 Add system property to managing HBase deletes with visibilities (#2792))
<<<<<<< HEAD
>>>>>>> 56f97cd271 (GEOMESA-3113 Add system property to managing HBase deletes with visibilities (#2792))
<<<<<<< HEAD
>>>>>>> 29dcc37810 (GEOMESA-3113 Add system property to managing HBase deletes with visibilities (#2792))
<<<<<<< HEAD
>>>>>>> afcf525d7d (GEOMESA-3113 Add system property to managing HBase deletes with visibilities (#2792))
=======
=======
=======
=======
=======
=======
>>>>>>> 85d211ca2 (GEOMESA-3102 Fix removal of user data in FileSystemDataStore.createSchema (#2787))
>>>>>>> 7119f2c52 (GEOMESA-3102 Fix removal of user data in FileSystemDataStore.createSchema (#2787))
=======
>>>>>>> 00494e0bcf (GEOMESA-3113 Add system property to managing HBase deletes with visibilities (#2792))
>>>>>>> adf2ac19a8 (GEOMESA-3102 Fix removal of user data in FileSystemDataStore.createSchema (#2787))
<<<<<<< HEAD
>>>>>>> 89ea8190e2 (GEOMESA-3102 Fix removal of user data in FileSystemDataStore.createSchema (#2787))
<<<<<<< HEAD
>>>>>>> f18f027f66 (GEOMESA-3102 Fix removal of user data in FileSystemDataStore.createSchema (#2787))
<<<<<<< HEAD
>>>>>>> e11c16ba5d (GEOMESA-3102 Fix removal of user data in FileSystemDataStore.createSchema (#2787))
=======
=======
=======
=======
=======
=======
>>>>>>> 85d211ca2 (GEOMESA-3102 Fix removal of user data in FileSystemDataStore.createSchema (#2787))
=======
>>>>>>> 595c43086 (GEOMESA-3113 Add system property to managing HBase deletes with visibilities (#2792))
>>>>>>> 803762354 (GEOMESA-3113 Add system property to managing HBase deletes with visibilities (#2792))
=======
>>>>>>> 68098a00c3 (GEOMESA-3102 Fix removal of user data in FileSystemDataStore.createSchema (#2787))
>>>>>>> e62505d539 (GEOMESA-3113 Add system property to managing HBase deletes with visibilities (#2792))
<<<<<<< HEAD
>>>>>>> 3226e92d8e (GEOMESA-3113 Add system property to managing HBase deletes with visibilities (#2792))
<<<<<<< HEAD
>>>>>>> dbbcaa10d3 (GEOMESA-3113 Add system property to managing HBase deletes with visibilities (#2792))
<<<<<<< HEAD
>>>>>>> 00494e0bcf (GEOMESA-3113 Add system property to managing HBase deletes with visibilities (#2792))
=======
=======
=======
=======
=======
=======
<<<<<<< HEAD
<<<<<<< HEAD
<<<<<<< HEAD
>>>>>>> 0d3cbc99a (GEOMESA-3102 Fix removal of user data in FileSystemDataStore.createSchema (#2787))
>>>>>>> f0b61142b (GEOMESA-3102 Fix removal of user data in FileSystemDataStore.createSchema (#2787))
=======
>>>>>>> 5742320897 (GEOMESA-3102 Fix removal of user data in FileSystemDataStore.createSchema (#2787))
>>>>>>> 0a6aff78fb (GEOMESA-3102 Fix removal of user data in FileSystemDataStore.createSchema (#2787))
<<<<<<< HEAD
>>>>>>> d9cabf401c (GEOMESA-3102 Fix removal of user data in FileSystemDataStore.createSchema (#2787))
<<<<<<< HEAD
>>>>>>> 28be12542f (GEOMESA-3102 Fix removal of user data in FileSystemDataStore.createSchema (#2787))
<<<<<<< HEAD
>>>>>>> 68098a00c3 (GEOMESA-3102 Fix removal of user data in FileSystemDataStore.createSchema (#2787))
=======
=======
=======
=======
=======
>>>>>>> bd17bd131 (GEOMESA-3102 Fix removal of user data in FileSystemDataStore.createSchema (#2787))
=======
>>>>>>> c43c29e91c (GEOMESA-3113 Add system property to managing HBase deletes with visibilities (#2792))
>>>>>>> c555446b8b (GEOMESA-3102 Fix removal of user data in FileSystemDataStore.createSchema (#2787))
<<<<<<< HEAD
>>>>>>> 1230d64006 (GEOMESA-3102 Fix removal of user data in FileSystemDataStore.createSchema (#2787))
<<<<<<< HEAD
>>>>>>> 814abac33f (GEOMESA-3102 Fix removal of user data in FileSystemDataStore.createSchema (#2787))
<<<<<<< HEAD
>>>>>>> 5742320897 (GEOMESA-3102 Fix removal of user data in FileSystemDataStore.createSchema (#2787))
=======
=======
=======
=======
=======
=======
>>>>>>> 45dca3e07 (GEOMESA-3113 Add system property to managing HBase deletes with visibilities (#2792))
>>>>>>> ca22354dd (GEOMESA-3113 Add system property to managing HBase deletes with visibilities (#2792))
=======
>>>>>>> 78439fc2da (GEOMESA-3102 Fix removal of user data in FileSystemDataStore.createSchema (#2787))
>>>>>>> 797b02396b (GEOMESA-3113 Add system property to managing HBase deletes with visibilities (#2792))
<<<<<<< HEAD
>>>>>>> cd5564bac6 (GEOMESA-3113 Add system property to managing HBase deletes with visibilities (#2792))
<<<<<<< HEAD
>>>>>>> f2b9fb3853 (GEOMESA-3113 Add system property to managing HBase deletes with visibilities (#2792))
<<<<<<< HEAD
>>>>>>> c43c29e91c (GEOMESA-3113 Add system property to managing HBase deletes with visibilities (#2792))
=======
=======
=======
=======
=======
>>>>>>> c385f7994 (GEOMESA-3102 Fix removal of user data in FileSystemDataStore.createSchema (#2787))
=======
>>>>>>> 64c0e084b5 (GEOMESA-3113 Add system property to managing HBase deletes with visibilities (#2792))
>>>>>>> 3171e7407d (GEOMESA-3102 Fix removal of user data in FileSystemDataStore.createSchema (#2787))
<<<<<<< HEAD
>>>>>>> 038b4ca087 (GEOMESA-3102 Fix removal of user data in FileSystemDataStore.createSchema (#2787))
<<<<<<< HEAD
>>>>>>> 7f486255dd (GEOMESA-3102 Fix removal of user data in FileSystemDataStore.createSchema (#2787))
<<<<<<< HEAD
>>>>>>> 78439fc2da (GEOMESA-3102 Fix removal of user data in FileSystemDataStore.createSchema (#2787))
=======
=======
=======
=======
=======
=======
=======
=======
>>>>>>> 73cb7a0517 (GEOMESA-3102 Fix removal of user data in FileSystemDataStore.createSchema (#2787))
>>>>>>> 85d211ca2 (GEOMESA-3102 Fix removal of user data in FileSystemDataStore.createSchema (#2787))
=======
>>>>>>> 595c43086 (GEOMESA-3113 Add system property to managing HBase deletes with visibilities (#2792))
<<<<<<< HEAD
>>>>>>> dc17df6c0 (GEOMESA-3113 Add system property to managing HBase deletes with visibilities (#2792))
<<<<<<< HEAD
>>>>>>> 2d758409c (GEOMESA-3113 Add system property to managing HBase deletes with visibilities (#2792))
<<<<<<< HEAD
>>>>>>> 237494b1cc (GEOMESA-3113 Add system property to managing HBase deletes with visibilities (#2792))
<<<<<<< HEAD
>>>>>>> d774dc1d12 (GEOMESA-3113 Add system property to managing HBase deletes with visibilities (#2792))
<<<<<<< HEAD
>>>>>>> e639fc30a7 (GEOMESA-3113 Add system property to managing HBase deletes with visibilities (#2792))
<<<<<<< HEAD
>>>>>>> 64c0e084b5 (GEOMESA-3113 Add system property to managing HBase deletes with visibilities (#2792))
=======
=======
=======
=======
=======
=======
=======
<<<<<<< HEAD
<<<<<<< HEAD
<<<<<<< HEAD
>>>>>>> 0d3cbc99a (GEOMESA-3102 Fix removal of user data in FileSystemDataStore.createSchema (#2787))
>>>>>>> 74c6b7f8d (GEOMESA-3102 Fix removal of user data in FileSystemDataStore.createSchema (#2787))
>>>>>>> 5a7f44513 (GEOMESA-3102 Fix removal of user data in FileSystemDataStore.createSchema (#2787))
<<<<<<< HEAD
>>>>>>> c7eb576a40 (GEOMESA-3102 Fix removal of user data in FileSystemDataStore.createSchema (#2787))
<<<<<<< HEAD
>>>>>>> 0645a0bbaf (GEOMESA-3102 Fix removal of user data in FileSystemDataStore.createSchema (#2787))
<<<<<<< HEAD
>>>>>>> c57a8a5ffe (GEOMESA-3102 Fix removal of user data in FileSystemDataStore.createSchema (#2787))
<<<<<<< HEAD
>>>>>>> 73cb7a0517 (GEOMESA-3102 Fix removal of user data in FileSystemDataStore.createSchema (#2787))
=======
=======
=======
=======
=======
>>>>>>> 5c68fb7d1 (GEOMESA-3102 Fix removal of user data in FileSystemDataStore.createSchema (#2787))
<<<<<<< HEAD
>>>>>>> 9ec1f049a9 (GEOMESA-3102 Fix removal of user data in FileSystemDataStore.createSchema (#2787))
<<<<<<< HEAD
>>>>>>> e8b1c389e3 (GEOMESA-3102 Fix removal of user data in FileSystemDataStore.createSchema (#2787))
<<<<<<< HEAD
>>>>>>> 7e323ef52f (GEOMESA-3102 Fix removal of user data in FileSystemDataStore.createSchema (#2787))
<<<<<<< HEAD
>>>>>>> 4b926d9ec6 (GEOMESA-3102 Fix removal of user data in FileSystemDataStore.createSchema (#2787))
=======
=======
=======
=======
=======
=======
>>>>>>> f8f49130b (GEOMESA-3113 Add system property to managing HBase deletes with visibilities (#2792))
>>>>>>> 4a47c538b (GEOMESA-3113 Add system property to managing HBase deletes with visibilities (#2792))
=======
>>>>>>> a738799968 (GEOMESA-3102 Fix removal of user data in FileSystemDataStore.createSchema (#2787))
>>>>>>> a0d6da1831 (GEOMESA-3113 Add system property to managing HBase deletes with visibilities (#2792))
<<<<<<< HEAD
>>>>>>> 6abf5007af (GEOMESA-3113 Add system property to managing HBase deletes with visibilities (#2792))
<<<<<<< HEAD
>>>>>>> 69a4e317d6 (GEOMESA-3113 Add system property to managing HBase deletes with visibilities (#2792))
<<<<<<< HEAD
>>>>>>> cdb062d5e9 (GEOMESA-3113 Add system property to managing HBase deletes with visibilities (#2792))
=======
=======
=======
=======
=======
>>>>>>> a358de35a (GEOMESA-3102 Fix removal of user data in FileSystemDataStore.createSchema (#2787))
=======
>>>>>>> 3d40465720 (GEOMESA-3113 Add system property to managing HBase deletes with visibilities (#2792))
>>>>>>> 1faf0d16f2 (GEOMESA-3102 Fix removal of user data in FileSystemDataStore.createSchema (#2787))
<<<<<<< HEAD
>>>>>>> 2212530e6b (GEOMESA-3102 Fix removal of user data in FileSystemDataStore.createSchema (#2787))
<<<<<<< HEAD
>>>>>>> e9395c1096 (GEOMESA-3102 Fix removal of user data in FileSystemDataStore.createSchema (#2787))
<<<<<<< HEAD
>>>>>>> a738799968 (GEOMESA-3102 Fix removal of user data in FileSystemDataStore.createSchema (#2787))
=======
=======
=======
=======
=======
=======
=======
>>>>>>> 85d211ca2 (GEOMESA-3102 Fix removal of user data in FileSystemDataStore.createSchema (#2787))
=======
>>>>>>> 595c43086 (GEOMESA-3113 Add system property to managing HBase deletes with visibilities (#2792))
>>>>>>> 0cdf3f267 (GEOMESA-3113 Add system property to managing HBase deletes with visibilities (#2792))
>>>>>>> 44b15e96d (GEOMESA-3113 Add system property to managing HBase deletes with visibilities (#2792))
=======
>>>>>>> 49e9f5cb35 (GEOMESA-3102 Fix removal of user data in FileSystemDataStore.createSchema (#2787))
>>>>>>> e5413df04f (GEOMESA-3113 Add system property to managing HBase deletes with visibilities (#2792))
<<<<<<< HEAD
>>>>>>> d38e17d229 (GEOMESA-3113 Add system property to managing HBase deletes with visibilities (#2792))
<<<<<<< HEAD
>>>>>>> 65460df3e6 (GEOMESA-3113 Add system property to managing HBase deletes with visibilities (#2792))
<<<<<<< HEAD
>>>>>>> 3d40465720 (GEOMESA-3113 Add system property to managing HBase deletes with visibilities (#2792))
=======
=======
=======
=======
=======
>>>>>>> d488f4180 (GEOMESA-3102 Fix removal of user data in FileSystemDataStore.createSchema (#2787))
=======
>>>>>>> 3867fd5b25 (GEOMESA-3113 Add system property to managing HBase deletes with visibilities (#2792))
>>>>>>> 8aa4f55ef6 (GEOMESA-3102 Fix removal of user data in FileSystemDataStore.createSchema (#2787))
<<<<<<< HEAD
>>>>>>> aeb7c3ed76 (GEOMESA-3102 Fix removal of user data in FileSystemDataStore.createSchema (#2787))
<<<<<<< HEAD
>>>>>>> 16bbecada1 (GEOMESA-3102 Fix removal of user data in FileSystemDataStore.createSchema (#2787))
<<<<<<< HEAD
>>>>>>> 49e9f5cb35 (GEOMESA-3102 Fix removal of user data in FileSystemDataStore.createSchema (#2787))
=======
=======
=======
=======
=======
>>>>>>> ac2d5a925 (GEOMESA-3113 Add system property to managing HBase deletes with visibilities (#2792))
=======
>>>>>>> 4d7289a2fe (GEOMESA-3102 Fix removal of user data in FileSystemDataStore.createSchema (#2787))
>>>>>>> 11addb1ce7 (GEOMESA-3113 Add system property to managing HBase deletes with visibilities (#2792))
<<<<<<< HEAD
>>>>>>> 42bfd74c63 (GEOMESA-3113 Add system property to managing HBase deletes with visibilities (#2792))
<<<<<<< HEAD
>>>>>>> be1167e028 (GEOMESA-3113 Add system property to managing HBase deletes with visibilities (#2792))
<<<<<<< HEAD
>>>>>>> 3867fd5b25 (GEOMESA-3113 Add system property to managing HBase deletes with visibilities (#2792))
=======
=======
=======
=======
=======
=======
>>>>>>> 85d211ca2 (GEOMESA-3102 Fix removal of user data in FileSystemDataStore.createSchema (#2787))
>>>>>>> 9ce7ed900 (GEOMESA-3102 Fix removal of user data in FileSystemDataStore.createSchema (#2787))
=======
>>>>>>> 5af1e798d5 (GEOMESA-3113 Add system property to managing HBase deletes with visibilities (#2792))
>>>>>>> 90d85d9b4b (GEOMESA-3102 Fix removal of user data in FileSystemDataStore.createSchema (#2787))
<<<<<<< HEAD
>>>>>>> bce9dc3e0e (GEOMESA-3102 Fix removal of user data in FileSystemDataStore.createSchema (#2787))
<<<<<<< HEAD
>>>>>>> fa2938c568 (GEOMESA-3102 Fix removal of user data in FileSystemDataStore.createSchema (#2787))
<<<<<<< HEAD
>>>>>>> 4d7289a2fe (GEOMESA-3102 Fix removal of user data in FileSystemDataStore.createSchema (#2787))
=======
=======
=======
=======
=======
=======
>>>>>>> 85d211ca2 (GEOMESA-3102 Fix removal of user data in FileSystemDataStore.createSchema (#2787))
=======
>>>>>>> 595c43086 (GEOMESA-3113 Add system property to managing HBase deletes with visibilities (#2792))
>>>>>>> 7abafecb1 (GEOMESA-3113 Add system property to managing HBase deletes with visibilities (#2792))
=======
>>>>>>> eda8d4d014 (GEOMESA-3102 Fix removal of user data in FileSystemDataStore.createSchema (#2787))
>>>>>>> 1468e59829 (GEOMESA-3113 Add system property to managing HBase deletes with visibilities (#2792))
<<<<<<< HEAD
>>>>>>> 9c750992ef (GEOMESA-3113 Add system property to managing HBase deletes with visibilities (#2792))
<<<<<<< HEAD
>>>>>>> 54da398207 (GEOMESA-3113 Add system property to managing HBase deletes with visibilities (#2792))
<<<<<<< HEAD
>>>>>>> 5af1e798d5 (GEOMESA-3113 Add system property to managing HBase deletes with visibilities (#2792))
=======
=======
=======
=======
=======
>>>>>>> 7ef22a4bb (GEOMESA-3102 Fix removal of user data in FileSystemDataStore.createSchema (#2787))
=======
>>>>>>> f22bf41646 (GEOMESA-3102 Fix removal of user data in FileSystemDataStore.createSchema (#2787))
>>>>>>> c8d3361f41 (GEOMESA-3102 Fix removal of user data in FileSystemDataStore.createSchema (#2787))
<<<<<<< HEAD
>>>>>>> 48dcb085fa (GEOMESA-3102 Fix removal of user data in FileSystemDataStore.createSchema (#2787))
<<<<<<< HEAD
>>>>>>> e2aaf740bf (GEOMESA-3102 Fix removal of user data in FileSystemDataStore.createSchema (#2787))
<<<<<<< HEAD
>>>>>>> eda8d4d014 (GEOMESA-3102 Fix removal of user data in FileSystemDataStore.createSchema (#2787))
=======
=======
=======
=======
=======
>>>>>>> 2b62bcaeb (GEOMESA-3102 Fix removal of user data in FileSystemDataStore.createSchema (#2787))
=======
>>>>>>> ffcb7ff3ae (GEOMESA-3113 Add system property to managing HBase deletes with visibilities (#2792))
>>>>>>> a618e2ba0a (GEOMESA-3102 Fix removal of user data in FileSystemDataStore.createSchema (#2787))
<<<<<<< HEAD
>>>>>>> 687ba5655c (GEOMESA-3102 Fix removal of user data in FileSystemDataStore.createSchema (#2787))
<<<<<<< HEAD
>>>>>>> 1682b13d94 (GEOMESA-3102 Fix removal of user data in FileSystemDataStore.createSchema (#2787))
<<<<<<< HEAD
>>>>>>> f22bf41646 (GEOMESA-3102 Fix removal of user data in FileSystemDataStore.createSchema (#2787))
=======
=======
=======
=======
=======
=======
>>>>>>> 45dca3e07 (GEOMESA-3113 Add system property to managing HBase deletes with visibilities (#2792))
>>>>>>> afc081190 (GEOMESA-3113 Add system property to managing HBase deletes with visibilities (#2792))
=======
>>>>>>> 4b0c56ce56 (GEOMESA-3102 Fix removal of user data in FileSystemDataStore.createSchema (#2787))
>>>>>>> 65360f96a0 (GEOMESA-3113 Add system property to managing HBase deletes with visibilities (#2792))
<<<<<<< HEAD
>>>>>>> 97a911d79c (GEOMESA-3113 Add system property to managing HBase deletes with visibilities (#2792))
<<<<<<< HEAD
>>>>>>> 8999b3f6b9 (GEOMESA-3113 Add system property to managing HBase deletes with visibilities (#2792))
<<<<<<< HEAD
>>>>>>> ffcb7ff3ae (GEOMESA-3113 Add system property to managing HBase deletes with visibilities (#2792))
=======
=======
=======
=======
=======
>>>>>>> 75f3f455e (GEOMESA-3102 Fix removal of user data in FileSystemDataStore.createSchema (#2787))
=======
>>>>>>> 9ac1262e54 (GEOMESA-3113 Add system property to managing HBase deletes with visibilities (#2792))
>>>>>>> 20dc993a76 (GEOMESA-3102 Fix removal of user data in FileSystemDataStore.createSchema (#2787))
<<<<<<< HEAD
>>>>>>> 33d2777a8a (GEOMESA-3102 Fix removal of user data in FileSystemDataStore.createSchema (#2787))
<<<<<<< HEAD
>>>>>>> abc395c346 (GEOMESA-3102 Fix removal of user data in FileSystemDataStore.createSchema (#2787))
<<<<<<< HEAD
>>>>>>> 4b0c56ce56 (GEOMESA-3102 Fix removal of user data in FileSystemDataStore.createSchema (#2787))
=======
=======
=======
=======
=======
=======
=======
=======
>>>>>>> f1cbf28b81 (GEOMESA-3102 Fix removal of user data in FileSystemDataStore.createSchema (#2787))
>>>>>>> 85d211ca2 (GEOMESA-3102 Fix removal of user data in FileSystemDataStore.createSchema (#2787))
=======
>>>>>>> 595c43086 (GEOMESA-3113 Add system property to managing HBase deletes with visibilities (#2792))
<<<<<<< HEAD
>>>>>>> dc17df6c0 (GEOMESA-3113 Add system property to managing HBase deletes with visibilities (#2792))
<<<<<<< HEAD
>>>>>>> 7a3d004ad (GEOMESA-3113 Add system property to managing HBase deletes with visibilities (#2792))
<<<<<<< HEAD
>>>>>>> bd6dd934cc (GEOMESA-3113 Add system property to managing HBase deletes with visibilities (#2792))
<<<<<<< HEAD
>>>>>>> cc5f917a7c (GEOMESA-3113 Add system property to managing HBase deletes with visibilities (#2792))
<<<<<<< HEAD
>>>>>>> 3c53246c9a (GEOMESA-3113 Add system property to managing HBase deletes with visibilities (#2792))
<<<<<<< HEAD
>>>>>>> 9ac1262e54 (GEOMESA-3113 Add system property to managing HBase deletes with visibilities (#2792))
=======
=======
=======
=======
=======
=======
=======
<<<<<<< HEAD
<<<<<<< HEAD
<<<<<<< HEAD
>>>>>>> 0d3cbc99a (GEOMESA-3102 Fix removal of user data in FileSystemDataStore.createSchema (#2787))
>>>>>>> 74c6b7f8d (GEOMESA-3102 Fix removal of user data in FileSystemDataStore.createSchema (#2787))
>>>>>>> ce07ef89f (GEOMESA-3102 Fix removal of user data in FileSystemDataStore.createSchema (#2787))
=======
>>>>>>> 1a90b3062a (GEOMESA-3102 Fix removal of user data in FileSystemDataStore.createSchema (#2787))
>>>>>>> b6118ef7a5 (GEOMESA-3102 Fix removal of user data in FileSystemDataStore.createSchema (#2787))
<<<<<<< HEAD
>>>>>>> 8309b2b098 (GEOMESA-3102 Fix removal of user data in FileSystemDataStore.createSchema (#2787))
<<<<<<< HEAD
>>>>>>> 4bb5bbc637 (GEOMESA-3102 Fix removal of user data in FileSystemDataStore.createSchema (#2787))
<<<<<<< HEAD
>>>>>>> f1cbf28b81 (GEOMESA-3102 Fix removal of user data in FileSystemDataStore.createSchema (#2787))
=======
=======
=======
=======
=======
>>>>>>> 8871b2b4b (GEOMESA-3102 Fix removal of user data in FileSystemDataStore.createSchema (#2787))
=======
>>>>>>> 043e029470 (GEOMESA-3113 Add system property to managing HBase deletes with visibilities (#2792))
>>>>>>> 495c744326 (GEOMESA-3102 Fix removal of user data in FileSystemDataStore.createSchema (#2787))
<<<<<<< HEAD
>>>>>>> a49ee0e00a (GEOMESA-3102 Fix removal of user data in FileSystemDataStore.createSchema (#2787))
<<<<<<< HEAD
>>>>>>> fd0ea5e670 (GEOMESA-3102 Fix removal of user data in FileSystemDataStore.createSchema (#2787))
<<<<<<< HEAD
>>>>>>> 1a90b3062a (GEOMESA-3102 Fix removal of user data in FileSystemDataStore.createSchema (#2787))
=======
=======
=======
=======
=======
=======
>>>>>>> f8f49130b (GEOMESA-3113 Add system property to managing HBase deletes with visibilities (#2792))
>>>>>>> 91b0d6a88 (GEOMESA-3113 Add system property to managing HBase deletes with visibilities (#2792))
=======
>>>>>>> c8431d18e4 (GEOMESA-3102 Fix removal of user data in FileSystemDataStore.createSchema (#2787))
>>>>>>> 49d3846b23 (GEOMESA-3113 Add system property to managing HBase deletes with visibilities (#2792))
<<<<<<< HEAD
>>>>>>> 3adb85864f (GEOMESA-3113 Add system property to managing HBase deletes with visibilities (#2792))
<<<<<<< HEAD
>>>>>>> fc179cb2d5 (GEOMESA-3113 Add system property to managing HBase deletes with visibilities (#2792))
<<<<<<< HEAD
>>>>>>> 043e029470 (GEOMESA-3113 Add system property to managing HBase deletes with visibilities (#2792))
=======
=======
=======
=======
=======
>>>>>>> 4f922d74c (GEOMESA-3102 Fix removal of user data in FileSystemDataStore.createSchema (#2787))
=======
>>>>>>> 9dd4a005eb (GEOMESA-3113 Add system property to managing HBase deletes with visibilities (#2792))
>>>>>>> 155d6a9469 (GEOMESA-3102 Fix removal of user data in FileSystemDataStore.createSchema (#2787))
<<<<<<< HEAD
>>>>>>> a1198ce095 (GEOMESA-3102 Fix removal of user data in FileSystemDataStore.createSchema (#2787))
<<<<<<< HEAD
>>>>>>> d2e8dad373 (GEOMESA-3102 Fix removal of user data in FileSystemDataStore.createSchema (#2787))
<<<<<<< HEAD
>>>>>>> c8431d18e4 (GEOMESA-3102 Fix removal of user data in FileSystemDataStore.createSchema (#2787))
=======
=======
=======
=======
=======
>>>>>>> 1b5719bd3 (GEOMESA-3113 Add system property to managing HBase deletes with visibilities (#2792))
>>>>>>> e4ee051914 (GEOMESA-3113 Add system property to managing HBase deletes with visibilities (#2792))
>>>>>>> 260d67442f (GEOMESA-3113 Add system property to managing HBase deletes with visibilities (#2792))
>>>>>>> 9e74e1d9b4 (GEOMESA-3113 Add system property to managing HBase deletes with visibilities (#2792))
>>>>>>> 9dd4a005eb (GEOMESA-3113 Add system property to managing HBase deletes with visibilities (#2792))
=======
>>>>>>> f148adeccd (GEOMESA-3102 Fix removal of user data in FileSystemDataStore.createSchema (#2787))
=======
>>>>>>> b448819e24 (GEOMESA-3113 Add system property to managing HBase deletes with visibilities (#2792))
=======
=======
>>>>>>> 735f1fc092 (GEOMESA-3102 Fix removal of user data in FileSystemDataStore.createSchema (#2787))
>>>>>>> d71800c037 (GEOMESA-3102 Fix removal of user data in FileSystemDataStore.createSchema (#2787))
=======
>>>>>>> f68b76f4b8 (GEOMESA-3113 Add system property to managing HBase deletes with visibilities (#2792))
=======
>>>>>>> 027b4d7d58 (GEOMESA-3102 Fix removal of user data in FileSystemDataStore.createSchema (#2787))
=======
=======
>>>>>>> 6d4f75bcbb (GEOMESA-3102 Fix removal of user data in FileSystemDataStore.createSchema (#2787))
>>>>>>> 4d1cac1d60 (GEOMESA-3102 Fix removal of user data in FileSystemDataStore.createSchema (#2787))
=======
>>>>>>> cb8df4c76b (GEOMESA-3113 Add system property to managing HBase deletes with visibilities (#2792))
=======
>>>>>>> 265d436467 (GEOMESA-3102 Fix removal of user data in FileSystemDataStore.createSchema (#2787))
=======
=======
>>>>>>> 1506607bc9 (GEOMESA-3113 Add system property to managing HBase deletes with visibilities (#2792))
>>>>>>> 7ce9817488 (GEOMESA-3113 Add system property to managing HBase deletes with visibilities (#2792))
=======
>>>>>>> 0c44f82169 (GEOMESA-3102 Fix removal of user data in FileSystemDataStore.createSchema (#2787))
=======
=======
>>>>>>> abe07966f6 (GEOMESA-3102 Fix removal of user data in FileSystemDataStore.createSchema (#2787))
>>>>>>> 02465f5f58 (GEOMESA-3102 Fix removal of user data in FileSystemDataStore.createSchema (#2787))
=======
>>>>>>> 8eb59bcc3c (GEOMESA-3113 Add system property to managing HBase deletes with visibilities (#2792))
=======
>>>>>>> 6f245b0cc5 (GEOMESA-3102 Fix removal of user data in FileSystemDataStore.createSchema (#2787))
=======
=======
>>>>>>> ea5f19f56b (GEOMESA-3113 Add system property to managing HBase deletes with visibilities (#2792))
>>>>>>> 07c698faf4 (GEOMESA-3113 Add system property to managing HBase deletes with visibilities (#2792))
=======
>>>>>>> locationtech-main
=======
>>>>>>> 17748f36c5 (GEOMESA-3102 Fix removal of user data in FileSystemDataStore.createSchema (#2787))
<<<<<<< HEAD
>>>>>>> 36522ca6db (GEOMESA-3102 Fix removal of user data in FileSystemDataStore.createSchema (#2787))
=======
=======
>>>>>>> f4a18a3e5a (GEOMESA-3113 Add system property to managing HBase deletes with visibilities (#2792))
<<<<<<< HEAD
>>>>>>> 2d101f8da9 (GEOMESA-3113 Add system property to managing HBase deletes with visibilities (#2792))
=======
=======
=======
>>>>>>> 85d211ca2 (GEOMESA-3102 Fix removal of user data in FileSystemDataStore.createSchema (#2787))
=======
>>>>>>> 595c43086 (GEOMESA-3113 Add system property to managing HBase deletes with visibilities (#2792))
>>>>>>> 0d96d8bd55 (GEOMESA-3113 Add system property to managing HBase deletes with visibilities (#2792))
<<<<<<< HEAD
>>>>>>> d71c234711 (GEOMESA-3113 Add system property to managing HBase deletes with visibilities (#2792))
=======
=======
>>>>>>> f4402ff40c (GEOMESA-3102 Fix removal of user data in FileSystemDataStore.createSchema (#2787))
<<<<<<< HEAD
>>>>>>> cfbdafd9de (GEOMESA-3102 Fix removal of user data in FileSystemDataStore.createSchema (#2787))
=======
=======
>>>>>>> 582a3156f3 (GEOMESA-3102 Fix removal of user data in FileSystemDataStore.createSchema (#2787))
<<<<<<< HEAD
>>>>>>> 9d7ed88fa8 (GEOMESA-3102 Fix removal of user data in FileSystemDataStore.createSchema (#2787))
=======
=======
=======
>>>>>>> 45dca3e07 (GEOMESA-3113 Add system property to managing HBase deletes with visibilities (#2792))
>>>>>>> a1ccc017c6 (GEOMESA-3113 Add system property to managing HBase deletes with visibilities (#2792))
<<<<<<< HEAD
>>>>>>> 40a526e8a3 (GEOMESA-3113 Add system property to managing HBase deletes with visibilities (#2792))
=======
=======
>>>>>>> 7c98bab97e (GEOMESA-3113 Add system property to managing HBase deletes with visibilities (#2792))
<<<<<<< HEAD
>>>>>>> 1a0678c1b1 (GEOMESA-3113 Add system property to managing HBase deletes with visibilities (#2792))
=======
=======
>>>>>>> 76328bb49 (GEOMESA-3102 Fix removal of user data in FileSystemDataStore.createSchema (#2787))
>>>>>>> b23256999b (GEOMESA-3102 Fix removal of user data in FileSystemDataStore.createSchema (#2787))
<<<<<<< HEAD
>>>>>>> 474042e6d6 (GEOMESA-3102 Fix removal of user data in FileSystemDataStore.createSchema (#2787))
=======
=======
=======
>>>>>>> f8f49130b (GEOMESA-3113 Add system property to managing HBase deletes with visibilities (#2792))
>>>>>>> 6ee72f98ac (GEOMESA-3113 Add system property to managing HBase deletes with visibilities (#2792))
<<<<<<< HEAD
>>>>>>> 10db10e107 (GEOMESA-3113 Add system property to managing HBase deletes with visibilities (#2792))
=======
=======
>>>>>>> 8a2d3cfac9 (GEOMESA-3102 Fix removal of user data in FileSystemDataStore.createSchema (#2787))
<<<<<<< HEAD
>>>>>>> d073e4ceb3 (GEOMESA-3102 Fix removal of user data in FileSystemDataStore.createSchema (#2787))
=======
=======
>>>>>>> 869683ad83 (GEOMESA-3113 Add system property to managing HBase deletes with visibilities (#2792))
>>>>>>> 3571a41838 (GEOMESA-3113 Add system property to managing HBase deletes with visibilities (#2792))
=======
>>>>>>> 17748f36c5 (GEOMESA-3102 Fix removal of user data in FileSystemDataStore.createSchema (#2787))
=======
>>>>>>> f4a18a3e5a (GEOMESA-3113 Add system property to managing HBase deletes with visibilities (#2792))
=======
=======
>>>>>>> 85d211ca2 (GEOMESA-3102 Fix removal of user data in FileSystemDataStore.createSchema (#2787))
>>>>>>> 8bcb82bef9 (GEOMESA-3102 Fix removal of user data in FileSystemDataStore.createSchema (#2787))
=======
=======
>>>>>>> 85d211ca2 (GEOMESA-3102 Fix removal of user data in FileSystemDataStore.createSchema (#2787))
=======
>>>>>>> 595c43086 (GEOMESA-3113 Add system property to managing HBase deletes with visibilities (#2792))
>>>>>>> 0d96d8bd55 (GEOMESA-3113 Add system property to managing HBase deletes with visibilities (#2792))
=======
>>>>>>> f4402ff40c (GEOMESA-3102 Fix removal of user data in FileSystemDataStore.createSchema (#2787))
=======
>>>>>>> 582a3156f3 (GEOMESA-3102 Fix removal of user data in FileSystemDataStore.createSchema (#2787))
=======
=======
>>>>>>> 45dca3e07 (GEOMESA-3113 Add system property to managing HBase deletes with visibilities (#2792))
>>>>>>> a1ccc017c6 (GEOMESA-3113 Add system property to managing HBase deletes with visibilities (#2792))
=======
>>>>>>> c4ce510344 (GEOMESA-3102 Fix removal of user data in FileSystemDataStore.createSchema (#2787))
=======
>>>>>>> 7c98bab97e (GEOMESA-3113 Add system property to managing HBase deletes with visibilities (#2792))
        val config = new JobConf(conf)
=======
        val config = new Configuration(conf)
>>>>>>> 9bde42cc4 (GEOMESA-3102 Fix removal of user data in FileSystemDataStore.createSchema (#2787))
<<<<<<< HEAD
<<<<<<< HEAD
<<<<<<< HEAD
<<<<<<< HEAD
<<<<<<< HEAD
<<<<<<< HEAD
<<<<<<< HEAD
<<<<<<< HEAD
<<<<<<< HEAD
<<<<<<< HEAD
<<<<<<< HEAD
<<<<<<< HEAD
<<<<<<< HEAD
<<<<<<< HEAD
<<<<<<< HEAD
<<<<<<< HEAD
<<<<<<< HEAD
<<<<<<< HEAD
<<<<<<< HEAD
<<<<<<< HEAD
<<<<<<< HEAD
<<<<<<< HEAD
<<<<<<< HEAD
<<<<<<< HEAD
<<<<<<< HEAD
<<<<<<< HEAD
<<<<<<< HEAD
<<<<<<< HEAD
<<<<<<< HEAD
<<<<<<< HEAD
<<<<<<< HEAD
<<<<<<< HEAD
<<<<<<< HEAD
<<<<<<< HEAD
<<<<<<< HEAD
<<<<<<< HEAD
<<<<<<< HEAD
<<<<<<< HEAD
<<<<<<< HEAD
<<<<<<< HEAD
<<<<<<< HEAD
<<<<<<< HEAD
<<<<<<< HEAD
<<<<<<< HEAD
<<<<<<< HEAD
<<<<<<< HEAD
<<<<<<< HEAD
<<<<<<< HEAD
<<<<<<< HEAD
<<<<<<< HEAD
<<<<<<< HEAD
<<<<<<< HEAD
<<<<<<< HEAD
<<<<<<< HEAD
<<<<<<< HEAD
<<<<<<< HEAD
<<<<<<< HEAD
<<<<<<< HEAD
<<<<<<< HEAD
<<<<<<< HEAD
<<<<<<< HEAD
<<<<<<< HEAD
<<<<<<< HEAD
<<<<<<< HEAD
<<<<<<< HEAD
<<<<<<< HEAD
<<<<<<< HEAD
<<<<<<< HEAD
<<<<<<< HEAD
<<<<<<< HEAD
<<<<<<< HEAD
<<<<<<< HEAD
<<<<<<< HEAD
<<<<<<< HEAD
<<<<<<< HEAD
<<<<<<< HEAD
<<<<<<< HEAD
<<<<<<< HEAD
<<<<<<< HEAD
<<<<<<< HEAD
<<<<<<< HEAD
<<<<<<< HEAD
<<<<<<< HEAD
<<<<<<< HEAD
<<<<<<< HEAD
<<<<<<< HEAD
<<<<<<< HEAD
<<<<<<< HEAD
<<<<<<< HEAD
<<<<<<< HEAD
<<<<<<< HEAD
<<<<<<< HEAD
<<<<<<< HEAD
<<<<<<< HEAD
<<<<<<< HEAD
<<<<<<< HEAD
<<<<<<< HEAD
<<<<<<< HEAD
<<<<<<< HEAD
<<<<<<< HEAD
<<<<<<< HEAD
<<<<<<< HEAD
<<<<<<< HEAD
<<<<<<< HEAD
<<<<<<< HEAD
<<<<<<< HEAD
<<<<<<< HEAD
<<<<<<< HEAD
<<<<<<< HEAD
<<<<<<< HEAD
<<<<<<< HEAD
<<<<<<< HEAD
<<<<<<< HEAD
<<<<<<< HEAD
<<<<<<< HEAD
<<<<<<< HEAD
<<<<<<< HEAD
<<<<<<< HEAD
<<<<<<< HEAD
<<<<<<< HEAD
<<<<<<< HEAD
<<<<<<< HEAD
<<<<<<< HEAD
<<<<<<< HEAD
<<<<<<< HEAD
<<<<<<< HEAD
<<<<<<< HEAD
<<<<<<< HEAD
<<<<<<< HEAD
<<<<<<< HEAD
<<<<<<< HEAD
<<<<<<< HEAD
<<<<<<< HEAD
<<<<<<< HEAD
<<<<<<< HEAD
<<<<<<< HEAD
<<<<<<< HEAD
<<<<<<< HEAD
<<<<<<< HEAD
<<<<<<< HEAD
<<<<<<< HEAD
<<<<<<< HEAD
<<<<<<< HEAD
<<<<<<< HEAD
<<<<<<< HEAD
<<<<<<< HEAD
<<<<<<< HEAD
<<<<<<< HEAD
<<<<<<< HEAD
<<<<<<< HEAD
<<<<<<< HEAD
<<<<<<< HEAD
<<<<<<< HEAD
<<<<<<< HEAD
<<<<<<< HEAD
<<<<<<< HEAD
<<<<<<< HEAD
<<<<<<< HEAD
<<<<<<< HEAD
<<<<<<< HEAD
<<<<<<< HEAD
<<<<<<< HEAD
<<<<<<< HEAD
<<<<<<< HEAD
<<<<<<< HEAD
<<<<<<< HEAD
<<<<<<< HEAD
<<<<<<< HEAD
<<<<<<< HEAD
<<<<<<< HEAD
<<<<<<< HEAD
<<<<<<< HEAD
<<<<<<< HEAD
<<<<<<< HEAD
<<<<<<< HEAD
<<<<<<< HEAD
<<<<<<< HEAD
<<<<<<< HEAD
<<<<<<< HEAD
<<<<<<< HEAD
<<<<<<< HEAD
<<<<<<< HEAD
<<<<<<< HEAD
<<<<<<< HEAD
<<<<<<< HEAD
<<<<<<< HEAD
<<<<<<< HEAD
<<<<<<< HEAD
<<<<<<< HEAD
<<<<<<< HEAD
<<<<<<< HEAD
<<<<<<< HEAD
<<<<<<< HEAD
<<<<<<< HEAD
<<<<<<< HEAD
<<<<<<< HEAD
<<<<<<< HEAD
<<<<<<< HEAD
<<<<<<< HEAD
<<<<<<< HEAD
<<<<<<< HEAD
<<<<<<< HEAD
<<<<<<< HEAD
<<<<<<< HEAD
<<<<<<< HEAD
<<<<<<< HEAD
<<<<<<< HEAD
<<<<<<< HEAD
<<<<<<< HEAD
<<<<<<< HEAD
<<<<<<< HEAD
<<<<<<< HEAD
<<<<<<< HEAD
<<<<<<< HEAD
<<<<<<< HEAD
<<<<<<< HEAD
<<<<<<< HEAD
<<<<<<< HEAD
<<<<<<< HEAD
<<<<<<< HEAD
<<<<<<< HEAD
<<<<<<< HEAD
<<<<<<< HEAD
<<<<<<< HEAD
<<<<<<< HEAD
<<<<<<< HEAD
<<<<<<< HEAD
<<<<<<< HEAD
<<<<<<< HEAD
<<<<<<< HEAD
<<<<<<< HEAD
<<<<<<< HEAD
<<<<<<< HEAD
<<<<<<< HEAD
<<<<<<< HEAD
<<<<<<< HEAD
<<<<<<< HEAD
<<<<<<< HEAD
<<<<<<< HEAD
<<<<<<< HEAD
<<<<<<< HEAD
<<<<<<< HEAD
<<<<<<< HEAD
<<<<<<< HEAD
<<<<<<< HEAD
<<<<<<< HEAD
<<<<<<< HEAD
<<<<<<< HEAD
<<<<<<< HEAD
<<<<<<< HEAD
<<<<<<< HEAD
<<<<<<< HEAD
<<<<<<< HEAD
<<<<<<< HEAD
<<<<<<< HEAD
<<<<<<< HEAD
<<<<<<< HEAD
<<<<<<< HEAD
<<<<<<< HEAD
<<<<<<< HEAD
<<<<<<< HEAD
<<<<<<< HEAD
<<<<<<< HEAD
<<<<<<< HEAD
<<<<<<< HEAD
<<<<<<< HEAD
<<<<<<< HEAD
<<<<<<< HEAD
<<<<<<< HEAD
<<<<<<< HEAD
<<<<<<< HEAD
<<<<<<< HEAD
<<<<<<< HEAD
<<<<<<< HEAD
<<<<<<< HEAD
<<<<<<< HEAD
<<<<<<< HEAD
<<<<<<< HEAD
<<<<<<< HEAD
<<<<<<< HEAD
<<<<<<< HEAD
<<<<<<< HEAD
<<<<<<< HEAD
<<<<<<< HEAD
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
>>>>>>> 7c98bab97e (GEOMESA-3113 Add system property to managing HBase deletes with visibilities (#2792))
=======
>>>>>>> c4ce510344 (GEOMESA-3102 Fix removal of user data in FileSystemDataStore.createSchema (#2787))
=======
>>>>>>> a1ccc017c6 (GEOMESA-3113 Add system property to managing HBase deletes with visibilities (#2792))
=======
>>>>>>> 582a3156f3 (GEOMESA-3102 Fix removal of user data in FileSystemDataStore.createSchema (#2787))
=======
=======
>>>>>>> 2d101f8da9 (GEOMESA-3113 Add system property to managing HBase deletes with visibilities (#2792))
=======
>>>>>>> d71c234711 (GEOMESA-3113 Add system property to managing HBase deletes with visibilities (#2792))
=======
=======
=======
=======
=======
=======
=======
=======
>>>>>>> 869683ad83 (GEOMESA-3113 Add system property to managing HBase deletes with visibilities (#2792))
>>>>>>> 3571a41838 (GEOMESA-3113 Add system property to managing HBase deletes with visibilities (#2792))
=======
>>>>>>> 8a2d3cfac9 (GEOMESA-3102 Fix removal of user data in FileSystemDataStore.createSchema (#2787))
>>>>>>> d073e4ceb3 (GEOMESA-3102 Fix removal of user data in FileSystemDataStore.createSchema (#2787))
=======
>>>>>>> 6ee72f98ac (GEOMESA-3113 Add system property to managing HBase deletes with visibilities (#2792))
>>>>>>> 10db10e107 (GEOMESA-3113 Add system property to managing HBase deletes with visibilities (#2792))
=======
>>>>>>> b23256999b (GEOMESA-3102 Fix removal of user data in FileSystemDataStore.createSchema (#2787))
>>>>>>> 474042e6d6 (GEOMESA-3102 Fix removal of user data in FileSystemDataStore.createSchema (#2787))
=======
>>>>>>> 7c98bab97e (GEOMESA-3113 Add system property to managing HBase deletes with visibilities (#2792))
>>>>>>> 1a0678c1b1 (GEOMESA-3113 Add system property to managing HBase deletes with visibilities (#2792))
=======
>>>>>>> a1ccc017c6 (GEOMESA-3113 Add system property to managing HBase deletes with visibilities (#2792))
>>>>>>> 40a526e8a3 (GEOMESA-3113 Add system property to managing HBase deletes with visibilities (#2792))
=======
>>>>>>> 582a3156f3 (GEOMESA-3102 Fix removal of user data in FileSystemDataStore.createSchema (#2787))
>>>>>>> 9d7ed88fa8 (GEOMESA-3102 Fix removal of user data in FileSystemDataStore.createSchema (#2787))
=======
>>>>>>> 113b056da (GEOMESA-3113 Add system property to managing HBase deletes with visibilities (#2792))
=======
>>>>>>> 36522ca6db (GEOMESA-3102 Fix removal of user data in FileSystemDataStore.createSchema (#2787))
<<<<<<< HEAD
<<<<<<< HEAD
<<<<<<< HEAD
<<<<<<< HEAD
<<<<<<< HEAD
<<<<<<< HEAD
<<<<<<< HEAD
<<<<<<< HEAD
<<<<<<< HEAD
<<<<<<< HEAD
<<<<<<< HEAD
<<<<<<< HEAD
<<<<<<< HEAD
<<<<<<< HEAD
<<<<<<< HEAD
<<<<<<< HEAD
<<<<<<< HEAD
<<<<<<< HEAD
<<<<<<< HEAD
<<<<<<< HEAD
<<<<<<< HEAD
<<<<<<< HEAD
<<<<<<< HEAD
<<<<<<< HEAD
<<<<<<< HEAD
<<<<<<< HEAD
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
>>>>>>> bd17bd131e (GEOMESA-3102 Fix removal of user data in FileSystemDataStore.createSchema (#2787))
>>>>>>> 682f10a0e9 (GEOMESA-3102 Fix removal of user data in FileSystemDataStore.createSchema (#2787))
=======
>>>>>>> 5d545f24ed (GEOMESA-3113 Add system property to managing HBase deletes with visibilities (#2792))
=======
>>>>>>> f794648fd0 (GEOMESA-3102 Fix removal of user data in FileSystemDataStore.createSchema (#2787))
=======
>>>>>>> c296484bff (GEOMESA-3113 Add system property to managing HBase deletes with visibilities (#2792))
=======
>>>>>>> 237bd3cb10 (GEOMESA-3102 Fix removal of user data in FileSystemDataStore.createSchema (#2787))
=======
>>>>>>> 7d705cac10 (GEOMESA-3113 Add system property to managing HBase deletes with visibilities (#2792))
=======
>>>>>>> 0ac8a757dd (GEOMESA-3102 Fix removal of user data in FileSystemDataStore.createSchema (#2787))
=======
>>>>>>> 307fc2b238 (GEOMESA-3113 Add system property to managing HBase deletes with visibilities (#2792))
=======
>>>>>>> a9cee10e0a (GEOMESA-3102 Fix removal of user data in FileSystemDataStore.createSchema (#2787))
=======
>>>>>>> 7cf935d373 (GEOMESA-3113 Add system property to managing HBase deletes with visibilities (#2792))
=======
>>>>>>> 9431689196 (GEOMESA-3102 Fix removal of user data in FileSystemDataStore.createSchema (#2787))
=======
>>>>>>> d83ac69cc5 (GEOMESA-3113 Add system property to managing HBase deletes with visibilities (#2792))
=======
>>>>>>> ce8500e632 (GEOMESA-3102 Fix removal of user data in FileSystemDataStore.createSchema (#2787))
=======
>>>>>>> f58f87b448 (GEOMESA-3102 Fix removal of user data in FileSystemDataStore.createSchema (#2787))
=======
>>>>>>> 7196beb2e1 (GEOMESA-3113 Add system property to managing HBase deletes with visibilities (#2792))
=======
>>>>>>> b4cc9497d5 (GEOMESA-3102 Fix removal of user data in FileSystemDataStore.createSchema (#2787))
=======
>>>>>>> df9cd4f22d (GEOMESA-3113 Add system property to managing HBase deletes with visibilities (#2792))
=======
>>>>>>> c0b0589a14 (GEOMESA-3102 Fix removal of user data in FileSystemDataStore.createSchema (#2787))
=======
>>>>>>> 2b9cd40059 (GEOMESA-3113 Add system property to managing HBase deletes with visibilities (#2792))
=======
>>>>>>> 12ae1c3224 (GEOMESA-3102 Fix removal of user data in FileSystemDataStore.createSchema (#2787))
=======
>>>>>>> 9f616db357 (GEOMESA-3113 Add system property to managing HBase deletes with visibilities (#2792))
=======
>>>>>>> e721efd628 (GEOMESA-3102 Fix removal of user data in FileSystemDataStore.createSchema (#2787))
=======
>>>>>>> ed36e40e7c (GEOMESA-3113 Add system property to managing HBase deletes with visibilities (#2792))
=======
>>>>>>> 8a07c6167f (GEOMESA-3102 Fix removal of user data in FileSystemDataStore.createSchema (#2787))
=======
>>>>>>> 1b0d520fde (GEOMESA-3113 Add system property to managing HBase deletes with visibilities (#2792))
=======
>>>>>>> 871350de06 (GEOMESA-3102 Fix removal of user data in FileSystemDataStore.createSchema (#2787))
=======
>>>>>>> 9bcc7591e5 (GEOMESA-3113 Add system property to managing HBase deletes with visibilities (#2792))
=======
>>>>>>> 2ec7d64046 (GEOMESA-3102 Fix removal of user data in FileSystemDataStore.createSchema (#2787))
=======
>>>>>>> 344200f1df (GEOMESA-3113 Add system property to managing HBase deletes with visibilities (#2792))
=======
>>>>>>> 8317120c9b (GEOMESA-3102 Fix removal of user data in FileSystemDataStore.createSchema (#2787))
=======
>>>>>>> 98e607d2fa (GEOMESA-3113 Add system property to managing HBase deletes with visibilities (#2792))
=======
>>>>>>> 5d46ff705f (GEOMESA-3113 Add system property to managing HBase deletes with visibilities (#2792))
=======
>>>>>>> 69016fbbb7 (GEOMESA-3113 Add system property to managing HBase deletes with visibilities (#2792))
=======
>>>>>>> d73ae82492 (GEOMESA-3113 Add system property to managing HBase deletes with visibilities (#2792))
=======
>>>>>>> d1d11691fd (GEOMESA-3113 Add system property to managing HBase deletes with visibilities (#2792))
=======
>>>>>>> eeb8ab478a (GEOMESA-3113 Add system property to managing HBase deletes with visibilities (#2792))
=======
>>>>>>> a8b2b56cbd (GEOMESA-3113 Add system property to managing HBase deletes with visibilities (#2792))
=======
>>>>>>> 27eec0d076 (GEOMESA-3102 Fix removal of user data in FileSystemDataStore.createSchema (#2787))
=======
>>>>>>> afcf525d7d (GEOMESA-3113 Add system property to managing HBase deletes with visibilities (#2792))
=======
>>>>>>> e11c16ba5d (GEOMESA-3102 Fix removal of user data in FileSystemDataStore.createSchema (#2787))
=======
>>>>>>> 00494e0bcf (GEOMESA-3113 Add system property to managing HBase deletes with visibilities (#2792))
=======
>>>>>>> 5742320897 (GEOMESA-3102 Fix removal of user data in FileSystemDataStore.createSchema (#2787))
=======
>>>>>>> c43c29e91c (GEOMESA-3113 Add system property to managing HBase deletes with visibilities (#2792))
=======
>>>>>>> 78439fc2da (GEOMESA-3102 Fix removal of user data in FileSystemDataStore.createSchema (#2787))
=======
>>>>>>> 64c0e084b5 (GEOMESA-3113 Add system property to managing HBase deletes with visibilities (#2792))
=======
>>>>>>> 4b926d9ec6 (GEOMESA-3102 Fix removal of user data in FileSystemDataStore.createSchema (#2787))
=======
>>>>>>> cdb062d5e9 (GEOMESA-3113 Add system property to managing HBase deletes with visibilities (#2792))
=======
>>>>>>> a738799968 (GEOMESA-3102 Fix removal of user data in FileSystemDataStore.createSchema (#2787))
=======
>>>>>>> 3d40465720 (GEOMESA-3113 Add system property to managing HBase deletes with visibilities (#2792))
=======
>>>>>>> 49e9f5cb35 (GEOMESA-3102 Fix removal of user data in FileSystemDataStore.createSchema (#2787))
=======
>>>>>>> 3867fd5b25 (GEOMESA-3113 Add system property to managing HBase deletes with visibilities (#2792))
=======
>>>>>>> 4d7289a2fe (GEOMESA-3102 Fix removal of user data in FileSystemDataStore.createSchema (#2787))
=======
>>>>>>> 5af1e798d5 (GEOMESA-3113 Add system property to managing HBase deletes with visibilities (#2792))
=======
>>>>>>> f22bf41646 (GEOMESA-3102 Fix removal of user data in FileSystemDataStore.createSchema (#2787))
=======
>>>>>>> ffcb7ff3ae (GEOMESA-3113 Add system property to managing HBase deletes with visibilities (#2792))
=======
>>>>>>> 4b0c56ce56 (GEOMESA-3102 Fix removal of user data in FileSystemDataStore.createSchema (#2787))
=======
>>>>>>> 9ac1262e54 (GEOMESA-3113 Add system property to managing HBase deletes with visibilities (#2792))
=======
>>>>>>> 1a90b3062a (GEOMESA-3102 Fix removal of user data in FileSystemDataStore.createSchema (#2787))
=======
>>>>>>> 043e029470 (GEOMESA-3113 Add system property to managing HBase deletes with visibilities (#2792))
=======
>>>>>>> c8431d18e4 (GEOMESA-3102 Fix removal of user data in FileSystemDataStore.createSchema (#2787))
=======
>>>>>>> 9dd4a005eb (GEOMESA-3113 Add system property to managing HBase deletes with visibilities (#2792))
=======
>>>>>>> f148adeccd (GEOMESA-3102 Fix removal of user data in FileSystemDataStore.createSchema (#2787))
=======
>>>>>>> b448819e24 (GEOMESA-3113 Add system property to managing HBase deletes with visibilities (#2792))
=======
>>>>>>> d71800c037 (GEOMESA-3102 Fix removal of user data in FileSystemDataStore.createSchema (#2787))
=======
>>>>>>> f68b76f4b8 (GEOMESA-3113 Add system property to managing HBase deletes with visibilities (#2792))
=======
>>>>>>> 4d1cac1d60 (GEOMESA-3102 Fix removal of user data in FileSystemDataStore.createSchema (#2787))
=======
>>>>>>> cb8df4c76b (GEOMESA-3113 Add system property to managing HBase deletes with visibilities (#2792))
=======
>>>>>>> 265d436467 (GEOMESA-3102 Fix removal of user data in FileSystemDataStore.createSchema (#2787))
=======
>>>>>>> 7ce9817488 (GEOMESA-3113 Add system property to managing HBase deletes with visibilities (#2792))
=======
>>>>>>> 02465f5f58 (GEOMESA-3102 Fix removal of user data in FileSystemDataStore.createSchema (#2787))
=======
>>>>>>> 8eb59bcc3c (GEOMESA-3113 Add system property to managing HBase deletes with visibilities (#2792))
=======
>>>>>>> 6f245b0cc5 (GEOMESA-3102 Fix removal of user data in FileSystemDataStore.createSchema (#2787))
=======
>>>>>>> 07c698faf4 (GEOMESA-3113 Add system property to managing HBase deletes with visibilities (#2792))
=======
>>>>>>> a773c6ef65 (GEOMESA-3113 Add system property to managing HBase deletes with visibilities (#2792))
=======
>>>>>>> 2d01ec0bc0 (GEOMESA-3102 Fix removal of user data in FileSystemDataStore.createSchema (#2787))
=======
<<<<<<< HEAD
<<<<<<< HEAD
>>>>>>> b586a90765 (GEOMESA-3113 Add system property to managing HBase deletes with visibilities (#2792))
=======
>>>>>>> 8a9d3df519 (GEOMESA-3102 Fix removal of user data in FileSystemDataStore.createSchema (#2787))
=======
<<<<<<< HEAD
<<<<<<< HEAD
>>>>>>> ba177f9f13 (GEOMESA-3113 Add system property to managing HBase deletes with visibilities (#2792))
=======
>>>>>>> 08ee2fed57 (GEOMESA-3102 Fix removal of user data in FileSystemDataStore.createSchema (#2787))
=======
<<<<<<< HEAD
<<<<<<< HEAD
>>>>>>> 813cf035d0 (GEOMESA-3113 Add system property to managing HBase deletes with visibilities (#2792))
=======
>>>>>>> 49337228be (GEOMESA-3102 Fix removal of user data in FileSystemDataStore.createSchema (#2787))
=======
<<<<<<< HEAD
<<<<<<< HEAD
>>>>>>> 54fb546133 (GEOMESA-3113 Add system property to managing HBase deletes with visibilities (#2792))
=======
>>>>>>> 8be42d246c (GEOMESA-3102 Fix removal of user data in FileSystemDataStore.createSchema (#2787))
=======
<<<<<<< HEAD
<<<<<<< HEAD
>>>>>>> 7ac82c3dce (GEOMESA-3113 Add system property to managing HBase deletes with visibilities (#2792))
=======
>>>>>>> 628458842d (GEOMESA-3102 Fix removal of user data in FileSystemDataStore.createSchema (#2787))
=======
<<<<<<< HEAD
<<<<<<< HEAD
>>>>>>> aca68ab685 (GEOMESA-3113 Add system property to managing HBase deletes with visibilities (#2792))
=======
>>>>>>> f7952edd5f (GEOMESA-3102 Fix removal of user data in FileSystemDataStore.createSchema (#2787))
=======
<<<<<<< HEAD
<<<<<<< HEAD
>>>>>>> fd0793971d (GEOMESA-3113 Add system property to managing HBase deletes with visibilities (#2792))
=======
>>>>>>> 853c43fc17 (GEOMESA-3102 Fix removal of user data in FileSystemDataStore.createSchema (#2787))
=======
<<<<<<< HEAD
<<<<<<< HEAD
>>>>>>> e0056031ea (GEOMESA-3113 Add system property to managing HBase deletes with visibilities (#2792))
=======
>>>>>>> 15429a51ce (GEOMESA-3102 Fix removal of user data in FileSystemDataStore.createSchema (#2787))
=======
<<<<<<< HEAD
<<<<<<< HEAD
>>>>>>> e41e9641d2 (GEOMESA-3113 Add system property to managing HBase deletes with visibilities (#2792))
=======
>>>>>>> c6079ecae5 (GEOMESA-3113 Add system property to managing HBase deletes with visibilities (#2792))
=======
<<<<<<< HEAD
<<<<<<< HEAD
>>>>>>> e0644f7991 (GEOMESA-3113 Add system property to managing HBase deletes with visibilities (#2792))
=======
>>>>>>> 9888cda97e (GEOMESA-3113 Add system property to managing HBase deletes with visibilities (#2792))
=======
<<<<<<< HEAD
<<<<<<< HEAD
>>>>>>> dba8cb28c4 (GEOMESA-3113 Add system property to managing HBase deletes with visibilities (#2792))
=======
>>>>>>> 5f0745e34b (GEOMESA-3113 Add system property to managing HBase deletes with visibilities (#2792))
=======
<<<<<<< HEAD
<<<<<<< HEAD
>>>>>>> e6162be24a (GEOMESA-3113 Add system property to managing HBase deletes with visibilities (#2792))
=======
>>>>>>> f502df5b55 (GEOMESA-3102 Fix removal of user data in FileSystemDataStore.createSchema (#2787))
=======
<<<<<<< HEAD
<<<<<<< HEAD
>>>>>>> 29dcc37810 (GEOMESA-3113 Add system property to managing HBase deletes with visibilities (#2792))
=======
>>>>>>> f18f027f66 (GEOMESA-3102 Fix removal of user data in FileSystemDataStore.createSchema (#2787))
=======
<<<<<<< HEAD
<<<<<<< HEAD
>>>>>>> dbbcaa10d3 (GEOMESA-3113 Add system property to managing HBase deletes with visibilities (#2792))
=======
>>>>>>> 814abac33f (GEOMESA-3102 Fix removal of user data in FileSystemDataStore.createSchema (#2787))
=======
<<<<<<< HEAD
<<<<<<< HEAD
>>>>>>> f2b9fb3853 (GEOMESA-3113 Add system property to managing HBase deletes with visibilities (#2792))
=======
>>>>>>> 7f486255dd (GEOMESA-3102 Fix removal of user data in FileSystemDataStore.createSchema (#2787))
=======
<<<<<<< HEAD
<<<<<<< HEAD
>>>>>>> e639fc30a7 (GEOMESA-3113 Add system property to managing HBase deletes with visibilities (#2792))
=======
>>>>>>> 7e323ef52f (GEOMESA-3102 Fix removal of user data in FileSystemDataStore.createSchema (#2787))
=======
<<<<<<< HEAD
<<<<<<< HEAD
>>>>>>> 69a4e317d6 (GEOMESA-3113 Add system property to managing HBase deletes with visibilities (#2792))
=======
>>>>>>> e9395c1096 (GEOMESA-3102 Fix removal of user data in FileSystemDataStore.createSchema (#2787))
=======
<<<<<<< HEAD
<<<<<<< HEAD
>>>>>>> 65460df3e6 (GEOMESA-3113 Add system property to managing HBase deletes with visibilities (#2792))
=======
>>>>>>> 16bbecada1 (GEOMESA-3102 Fix removal of user data in FileSystemDataStore.createSchema (#2787))
=======
<<<<<<< HEAD
<<<<<<< HEAD
>>>>>>> be1167e028 (GEOMESA-3113 Add system property to managing HBase deletes with visibilities (#2792))
=======
>>>>>>> fa2938c568 (GEOMESA-3102 Fix removal of user data in FileSystemDataStore.createSchema (#2787))
=======
<<<<<<< HEAD
<<<<<<< HEAD
>>>>>>> 54da398207 (GEOMESA-3113 Add system property to managing HBase deletes with visibilities (#2792))
=======
>>>>>>> 1682b13d94 (GEOMESA-3102 Fix removal of user data in FileSystemDataStore.createSchema (#2787))
=======
<<<<<<< HEAD
<<<<<<< HEAD
>>>>>>> 8999b3f6b9 (GEOMESA-3113 Add system property to managing HBase deletes with visibilities (#2792))
=======
>>>>>>> abc395c346 (GEOMESA-3102 Fix removal of user data in FileSystemDataStore.createSchema (#2787))
=======
<<<<<<< HEAD
<<<<<<< HEAD
>>>>>>> 3c53246c9a (GEOMESA-3113 Add system property to managing HBase deletes with visibilities (#2792))
=======
>>>>>>> fd0ea5e670 (GEOMESA-3102 Fix removal of user data in FileSystemDataStore.createSchema (#2787))
=======
<<<<<<< HEAD
<<<<<<< HEAD
>>>>>>> fc179cb2d5 (GEOMESA-3113 Add system property to managing HBase deletes with visibilities (#2792))
=======
>>>>>>> d2e8dad373 (GEOMESA-3102 Fix removal of user data in FileSystemDataStore.createSchema (#2787))
=======
<<<<<<< HEAD
<<<<<<< HEAD
>>>>>>> 9e74e1d9b4 (GEOMESA-3113 Add system property to managing HBase deletes with visibilities (#2792))
=======
>>>>>>> 8ddbf27f07 (GEOMESA-3102 Fix removal of user data in FileSystemDataStore.createSchema (#2787))
=======
<<<<<<< HEAD
<<<<<<< HEAD
>>>>>>> 1d4e479464 (GEOMESA-3113 Add system property to managing HBase deletes with visibilities (#2792))
=======
>>>>>>> 735f1fc092 (GEOMESA-3102 Fix removal of user data in FileSystemDataStore.createSchema (#2787))
=======
<<<<<<< HEAD
<<<<<<< HEAD
>>>>>>> a834a844c7 (GEOMESA-3113 Add system property to managing HBase deletes with visibilities (#2792))
=======
>>>>>>> 6d4f75bcbb (GEOMESA-3102 Fix removal of user data in FileSystemDataStore.createSchema (#2787))
=======
<<<<<<< HEAD
<<<<<<< HEAD
>>>>>>> 0d4496a2f2 (GEOMESA-3113 Add system property to managing HBase deletes with visibilities (#2792))
=======
>>>>>>> ee2741585f (GEOMESA-3102 Fix removal of user data in FileSystemDataStore.createSchema (#2787))
=======
<<<<<<< HEAD
<<<<<<< HEAD
>>>>>>> 1506607bc9 (GEOMESA-3113 Add system property to managing HBase deletes with visibilities (#2792))
=======
>>>>>>> abe07966f6 (GEOMESA-3102 Fix removal of user data in FileSystemDataStore.createSchema (#2787))
=======
<<<<<<< HEAD
<<<<<<< HEAD
>>>>>>> de00bd1943 (GEOMESA-3113 Add system property to managing HBase deletes with visibilities (#2792))
=======
>>>>>>> ffdb14e2a7 (GEOMESA-3102 Fix removal of user data in FileSystemDataStore.createSchema (#2787))
=======
<<<<<<< HEAD
<<<<<<< HEAD
>>>>>>> ea5f19f56b (GEOMESA-3113 Add system property to managing HBase deletes with visibilities (#2792))
=======
>>>>>>> 0fb40a8655 (GEOMESA-3113 Add system property to managing HBase deletes with visibilities (#2792))
=======
>>>>>>> 41631d23c9 (GEOMESA-3102 Fix removal of user data in FileSystemDataStore.createSchema (#2787))
=======
>>>>>>> bc833b1448 (GEOMESA-3113 Add system property to managing HBase deletes with visibilities (#2792))
=======
>>>>>>> 1e838e1657 (GEOMESA-3102 Fix removal of user data in FileSystemDataStore.createSchema (#2787))
=======
>>>>>>> a42015a87c (GEOMESA-3113 Add system property to managing HBase deletes with visibilities (#2792))
=======
>>>>>>> ffca94ce17 (GEOMESA-3102 Fix removal of user data in FileSystemDataStore.createSchema (#2787))
=======
>>>>>>> ec072ceda6 (GEOMESA-3113 Add system property to managing HBase deletes with visibilities (#2792))
=======
>>>>>>> 8e486088f5 (GEOMESA-3102 Fix removal of user data in FileSystemDataStore.createSchema (#2787))
=======
>>>>>>> 94096ec6bd (GEOMESA-3113 Add system property to managing HBase deletes with visibilities (#2792))
=======
>>>>>>> 2d18554450 (GEOMESA-3102 Fix removal of user data in FileSystemDataStore.createSchema (#2787))
=======
>>>>>>> db696250b0 (GEOMESA-3113 Add system property to managing HBase deletes with visibilities (#2792))
=======
>>>>>>> 595d9061e3 (GEOMESA-3102 Fix removal of user data in FileSystemDataStore.createSchema (#2787))
=======
>>>>>>> 2d98e354b8 (GEOMESA-3113 Add system property to managing HBase deletes with visibilities (#2792))
=======
>>>>>>> 2f550bb2a7 (GEOMESA-3102 Fix removal of user data in FileSystemDataStore.createSchema (#2787))
=======
>>>>>>> 8781a5befd (GEOMESA-3113 Add system property to managing HBase deletes with visibilities (#2792))
=======
>>>>>>> dfae24c155 (GEOMESA-3102 Fix removal of user data in FileSystemDataStore.createSchema (#2787))
=======
>>>>>>> a52516cf49 (GEOMESA-3113 Add system property to managing HBase deletes with visibilities (#2792))
=======
>>>>>>> 7e8f76c0f9 (GEOMESA-3102 Fix removal of user data in FileSystemDataStore.createSchema (#2787))
=======
>>>>>>> 1351a5baa4 (GEOMESA-3113 Add system property to managing HBase deletes with visibilities (#2792))
=======
>>>>>>> 857489f8a0 (GEOMESA-3113 Add system property to managing HBase deletes with visibilities (#2792))
=======
>>>>>>> 083bb9617b (GEOMESA-3113 Add system property to managing HBase deletes with visibilities (#2792))
=======
>>>>>>> 32aba52002 (GEOMESA-3113 Add system property to managing HBase deletes with visibilities (#2792))
=======
>>>>>>> 2c630f9360 (GEOMESA-3113 Add system property to managing HBase deletes with visibilities (#2792))
=======
>>>>>>> b69b6b3ea1 (GEOMESA-3113 Add system property to managing HBase deletes with visibilities (#2792))
=======
>>>>>>> 665046a461 (GEOMESA-3113 Add system property to managing HBase deletes with visibilities (#2792))
=======
>>>>>>> 1382ba7fd3 (GEOMESA-3102 Fix removal of user data in FileSystemDataStore.createSchema (#2787))
=======
>>>>>>> b1dea55b93 (GEOMESA-3113 Add system property to managing HBase deletes with visibilities (#2792))
=======
>>>>>>> 6157978769 (GEOMESA-3102 Fix removal of user data in FileSystemDataStore.createSchema (#2787))
=======
>>>>>>> 7d3ca180ff (GEOMESA-3113 Add system property to managing HBase deletes with visibilities (#2792))
=======
>>>>>>> f9996d127e (GEOMESA-3102 Fix removal of user data in FileSystemDataStore.createSchema (#2787))
=======
>>>>>>> 73d82b731c (GEOMESA-3113 Add system property to managing HBase deletes with visibilities (#2792))
=======
>>>>>>> 957de96206 (GEOMESA-3102 Fix removal of user data in FileSystemDataStore.createSchema (#2787))
=======
>>>>>>> 3c673847c5 (GEOMESA-3113 Add system property to managing HBase deletes with visibilities (#2792))
=======
>>>>>>> d03b76c630 (GEOMESA-3102 Fix removal of user data in FileSystemDataStore.createSchema (#2787))
=======
>>>>>>> ebbfa035a9 (GEOMESA-3113 Add system property to managing HBase deletes with visibilities (#2792))
=======
>>>>>>> 0cb32b7425 (GEOMESA-3102 Fix removal of user data in FileSystemDataStore.createSchema (#2787))
=======
>>>>>>> ad7a284ebe (GEOMESA-3113 Add system property to managing HBase deletes with visibilities (#2792))
=======
>>>>>>> be8a3bab90 (GEOMESA-3102 Fix removal of user data in FileSystemDataStore.createSchema (#2787))
=======
>>>>>>> b3fe983979 (GEOMESA-3113 Add system property to managing HBase deletes with visibilities (#2792))
=======
>>>>>>> af5b690d0b (GEOMESA-3102 Fix removal of user data in FileSystemDataStore.createSchema (#2787))
=======
>>>>>>> 02a91455d8 (GEOMESA-3113 Add system property to managing HBase deletes with visibilities (#2792))
=======
>>>>>>> b1b67a398d (GEOMESA-3102 Fix removal of user data in FileSystemDataStore.createSchema (#2787))
=======
>>>>>>> cbaecd4a0f (GEOMESA-3113 Add system property to managing HBase deletes with visibilities (#2792))
=======
>>>>>>> a23109e63b (GEOMESA-3102 Fix removal of user data in FileSystemDataStore.createSchema (#2787))
=======
>>>>>>> 9b169d0847 (GEOMESA-3113 Add system property to managing HBase deletes with visibilities (#2792))
=======
>>>>>>> eb98a9fb29 (GEOMESA-3102 Fix removal of user data in FileSystemDataStore.createSchema (#2787))
=======
>>>>>>> d539392ecd (GEOMESA-3113 Add system property to managing HBase deletes with visibilities (#2792))
=======
>>>>>>> ef0351a168 (GEOMESA-3102 Fix removal of user data in FileSystemDataStore.createSchema (#2787))
=======
>>>>>>> d9ec67b278 (GEOMESA-3113 Add system property to managing HBase deletes with visibilities (#2792))
=======
>>>>>>> 7053435184 (GEOMESA-3102 Fix removal of user data in FileSystemDataStore.createSchema (#2787))
=======
>>>>>>> 1417ba30dc (GEOMESA-3113 Add system property to managing HBase deletes with visibilities (#2792))
=======
>>>>>>> 0acf2e86fa (GEOMESA-3102 Fix removal of user data in FileSystemDataStore.createSchema (#2787))
=======
>>>>>>> 19e79eeeaa (GEOMESA-3113 Add system property to managing HBase deletes with visibilities (#2792))
=======
>>>>>>> d61b3bb194 (GEOMESA-3102 Fix removal of user data in FileSystemDataStore.createSchema (#2787))
=======
>>>>>>> 0121c0dbad (GEOMESA-3113 Add system property to managing HBase deletes with visibilities (#2792))
=======
>>>>>>> e518bfb9e2 (GEOMESA-3102 Fix removal of user data in FileSystemDataStore.createSchema (#2787))
=======
>>>>>>> 5a43551b62 (GEOMESA-3113 Add system property to managing HBase deletes with visibilities (#2792))
=======
>>>>>>> 93a4d60f28 (GEOMESA-3102 Fix removal of user data in FileSystemDataStore.createSchema (#2787))
=======
>>>>>>> 6bef55a1ea (GEOMESA-3113 Add system property to managing HBase deletes with visibilities (#2792))
=======
>>>>>>> 48bb106de6 (GEOMESA-3102 Fix removal of user data in FileSystemDataStore.createSchema (#2787))
=======
>>>>>>> ce7c794944 (GEOMESA-3113 Add system property to managing HBase deletes with visibilities (#2792))
=======
>>>>>>> 5b83f2d5c8 (GEOMESA-3102 Fix removal of user data in FileSystemDataStore.createSchema (#2787))
=======
>>>>>>> 5f8777dc16 (GEOMESA-3113 Add system property to managing HBase deletes with visibilities (#2792))
=======
>>>>>>> 8414c0cefb (GEOMESA-3102 Fix removal of user data in FileSystemDataStore.createSchema (#2787))
=======
>>>>>>> b81683f4bc (GEOMESA-3113 Add system property to managing HBase deletes with visibilities (#2792))
=======
>>>>>>> 6f9b076410 (GEOMESA-3102 Fix removal of user data in FileSystemDataStore.createSchema (#2787))
=======
>>>>>>> 39a2b37b5e (GEOMESA-3113 Add system property to managing HBase deletes with visibilities (#2792))
=======
>>>>>>> a0d25ffbaa (GEOMESA-3102 Fix removal of user data in FileSystemDataStore.createSchema (#2787))
=======
>>>>>>> 7f28e8e2e5 (GEOMESA-3113 Add system property to managing HBase deletes with visibilities (#2792))
=======
>>>>>>> 9171ff5334 (GEOMESA-3102 Fix removal of user data in FileSystemDataStore.createSchema (#2787))
=======
>>>>>>> f1f448d9e0 (GEOMESA-3113 Add system property to managing HBase deletes with visibilities (#2792))
=======
>>>>>>> abaa89e702 (GEOMESA-3102 Fix removal of user data in FileSystemDataStore.createSchema (#2787))
=======
>>>>>>> 8524ef3a47 (GEOMESA-3113 Add system property to managing HBase deletes with visibilities (#2792))
=======
>>>>>>> b5ef5f3ffb (GEOMESA-3102 Fix removal of user data in FileSystemDataStore.createSchema (#2787))
=======
>>>>>>> a0d7cc16ab (GEOMESA-3113 Add system property to managing HBase deletes with visibilities (#2792))
=======
>>>>>>> ae19085932 (GEOMESA-3102 Fix removal of user data in FileSystemDataStore.createSchema (#2787))
=======
>>>>>>> cdbed26e09 (GEOMESA-3113 Add system property to managing HBase deletes with visibilities (#2792))
=======
>>>>>>> 83a8ca6465 (GEOMESA-3102 Fix removal of user data in FileSystemDataStore.createSchema (#2787))
=======
=======
>>>>>>> a773c6ef65 (GEOMESA-3113 Add system property to managing HBase deletes with visibilities (#2792))
>>>>>>> 34fd077439 (GEOMESA-3113 Add system property to managing HBase deletes with visibilities (#2792))
=======
=======
>>>>>>> f58f87b448 (GEOMESA-3102 Fix removal of user data in FileSystemDataStore.createSchema (#2787))
=======
>>>>>>> b586a90765 (GEOMESA-3113 Add system property to managing HBase deletes with visibilities (#2792))
=======
>>>>>>> 7196beb2e1 (GEOMESA-3113 Add system property to managing HBase deletes with visibilities (#2792))
=======
>>>>>>> b4cc9497d5 (GEOMESA-3102 Fix removal of user data in FileSystemDataStore.createSchema (#2787))
=======
>>>>>>> ba177f9f13 (GEOMESA-3113 Add system property to managing HBase deletes with visibilities (#2792))
=======
>>>>>>> df9cd4f22d (GEOMESA-3113 Add system property to managing HBase deletes with visibilities (#2792))
=======
>>>>>>> c0b0589a14 (GEOMESA-3102 Fix removal of user data in FileSystemDataStore.createSchema (#2787))
=======
>>>>>>> 813cf035d0 (GEOMESA-3113 Add system property to managing HBase deletes with visibilities (#2792))
=======
>>>>>>> 2b9cd40059 (GEOMESA-3113 Add system property to managing HBase deletes with visibilities (#2792))
=======
>>>>>>> 12ae1c3224 (GEOMESA-3102 Fix removal of user data in FileSystemDataStore.createSchema (#2787))
=======
>>>>>>> 54fb546133 (GEOMESA-3113 Add system property to managing HBase deletes with visibilities (#2792))
=======
>>>>>>> 9f616db357 (GEOMESA-3113 Add system property to managing HBase deletes with visibilities (#2792))
=======
>>>>>>> e721efd628 (GEOMESA-3102 Fix removal of user data in FileSystemDataStore.createSchema (#2787))
=======
>>>>>>> 7ac82c3dce (GEOMESA-3113 Add system property to managing HBase deletes with visibilities (#2792))
=======
>>>>>>> ed36e40e7c (GEOMESA-3113 Add system property to managing HBase deletes with visibilities (#2792))
=======
>>>>>>> 8a07c6167f (GEOMESA-3102 Fix removal of user data in FileSystemDataStore.createSchema (#2787))
=======
>>>>>>> aca68ab685 (GEOMESA-3113 Add system property to managing HBase deletes with visibilities (#2792))
=======
>>>>>>> 1b0d520fde (GEOMESA-3113 Add system property to managing HBase deletes with visibilities (#2792))
=======
>>>>>>> 871350de06 (GEOMESA-3102 Fix removal of user data in FileSystemDataStore.createSchema (#2787))
=======
>>>>>>> fd0793971d (GEOMESA-3113 Add system property to managing HBase deletes with visibilities (#2792))
=======
>>>>>>> 9bcc7591e5 (GEOMESA-3113 Add system property to managing HBase deletes with visibilities (#2792))
=======
>>>>>>> 2ec7d64046 (GEOMESA-3102 Fix removal of user data in FileSystemDataStore.createSchema (#2787))
=======
>>>>>>> e0056031ea (GEOMESA-3113 Add system property to managing HBase deletes with visibilities (#2792))
=======
>>>>>>> 344200f1df (GEOMESA-3113 Add system property to managing HBase deletes with visibilities (#2792))
=======
>>>>>>> 8317120c9b (GEOMESA-3102 Fix removal of user data in FileSystemDataStore.createSchema (#2787))
=======
>>>>>>> e41e9641d2 (GEOMESA-3113 Add system property to managing HBase deletes with visibilities (#2792))
=======
>>>>>>> 98e607d2fa (GEOMESA-3113 Add system property to managing HBase deletes with visibilities (#2792))
=======
>>>>>>> 5d46ff705f (GEOMESA-3113 Add system property to managing HBase deletes with visibilities (#2792))
=======
>>>>>>> e0644f7991 (GEOMESA-3113 Add system property to managing HBase deletes with visibilities (#2792))
=======
>>>>>>> 69016fbbb7 (GEOMESA-3113 Add system property to managing HBase deletes with visibilities (#2792))
=======
>>>>>>> d73ae82492 (GEOMESA-3113 Add system property to managing HBase deletes with visibilities (#2792))
=======
>>>>>>> dba8cb28c4 (GEOMESA-3113 Add system property to managing HBase deletes with visibilities (#2792))
=======
>>>>>>> d1d11691fd (GEOMESA-3113 Add system property to managing HBase deletes with visibilities (#2792))
=======
>>>>>>> eeb8ab478a (GEOMESA-3113 Add system property to managing HBase deletes with visibilities (#2792))
=======
>>>>>>> e6162be24a (GEOMESA-3113 Add system property to managing HBase deletes with visibilities (#2792))
=======
>>>>>>> a8b2b56cbd (GEOMESA-3113 Add system property to managing HBase deletes with visibilities (#2792))
=======
>>>>>>> 27eec0d076 (GEOMESA-3102 Fix removal of user data in FileSystemDataStore.createSchema (#2787))
=======
>>>>>>> 29dcc37810 (GEOMESA-3113 Add system property to managing HBase deletes with visibilities (#2792))
=======
>>>>>>> afcf525d7d (GEOMESA-3113 Add system property to managing HBase deletes with visibilities (#2792))
=======
>>>>>>> e11c16ba5d (GEOMESA-3102 Fix removal of user data in FileSystemDataStore.createSchema (#2787))
=======
>>>>>>> dbbcaa10d3 (GEOMESA-3113 Add system property to managing HBase deletes with visibilities (#2792))
=======
>>>>>>> 00494e0bcf (GEOMESA-3113 Add system property to managing HBase deletes with visibilities (#2792))
=======
>>>>>>> 5742320897 (GEOMESA-3102 Fix removal of user data in FileSystemDataStore.createSchema (#2787))
=======
>>>>>>> f2b9fb3853 (GEOMESA-3113 Add system property to managing HBase deletes with visibilities (#2792))
=======
>>>>>>> c43c29e91c (GEOMESA-3113 Add system property to managing HBase deletes with visibilities (#2792))
=======
>>>>>>> 78439fc2da (GEOMESA-3102 Fix removal of user data in FileSystemDataStore.createSchema (#2787))
=======
>>>>>>> e639fc30a7 (GEOMESA-3113 Add system property to managing HBase deletes with visibilities (#2792))
=======
>>>>>>> 64c0e084b5 (GEOMESA-3113 Add system property to managing HBase deletes with visibilities (#2792))
=======
>>>>>>> 4b926d9ec6 (GEOMESA-3102 Fix removal of user data in FileSystemDataStore.createSchema (#2787))
=======
>>>>>>> 69a4e317d6 (GEOMESA-3113 Add system property to managing HBase deletes with visibilities (#2792))
=======
>>>>>>> cdb062d5e9 (GEOMESA-3113 Add system property to managing HBase deletes with visibilities (#2792))
=======
>>>>>>> a738799968 (GEOMESA-3102 Fix removal of user data in FileSystemDataStore.createSchema (#2787))
=======
>>>>>>> 65460df3e6 (GEOMESA-3113 Add system property to managing HBase deletes with visibilities (#2792))
=======
>>>>>>> 3d40465720 (GEOMESA-3113 Add system property to managing HBase deletes with visibilities (#2792))
=======
>>>>>>> 49e9f5cb35 (GEOMESA-3102 Fix removal of user data in FileSystemDataStore.createSchema (#2787))
=======
>>>>>>> be1167e028 (GEOMESA-3113 Add system property to managing HBase deletes with visibilities (#2792))
=======
>>>>>>> 3867fd5b25 (GEOMESA-3113 Add system property to managing HBase deletes with visibilities (#2792))
=======
>>>>>>> 4d7289a2fe (GEOMESA-3102 Fix removal of user data in FileSystemDataStore.createSchema (#2787))
=======
>>>>>>> 54da398207 (GEOMESA-3113 Add system property to managing HBase deletes with visibilities (#2792))
=======
>>>>>>> 5af1e798d5 (GEOMESA-3113 Add system property to managing HBase deletes with visibilities (#2792))
=======
>>>>>>> f22bf41646 (GEOMESA-3102 Fix removal of user data in FileSystemDataStore.createSchema (#2787))
=======
>>>>>>> 8999b3f6b9 (GEOMESA-3113 Add system property to managing HBase deletes with visibilities (#2792))
=======
>>>>>>> ffcb7ff3ae (GEOMESA-3113 Add system property to managing HBase deletes with visibilities (#2792))
=======
>>>>>>> 4b0c56ce56 (GEOMESA-3102 Fix removal of user data in FileSystemDataStore.createSchema (#2787))
=======
>>>>>>> 3c53246c9a (GEOMESA-3113 Add system property to managing HBase deletes with visibilities (#2792))
=======
>>>>>>> 9ac1262e54 (GEOMESA-3113 Add system property to managing HBase deletes with visibilities (#2792))
=======
>>>>>>> 1a90b3062a (GEOMESA-3102 Fix removal of user data in FileSystemDataStore.createSchema (#2787))
=======
>>>>>>> fc179cb2d5 (GEOMESA-3113 Add system property to managing HBase deletes with visibilities (#2792))
=======
>>>>>>> 043e029470 (GEOMESA-3113 Add system property to managing HBase deletes with visibilities (#2792))
=======
>>>>>>> c8431d18e4 (GEOMESA-3102 Fix removal of user data in FileSystemDataStore.createSchema (#2787))
=======
>>>>>>> 9e74e1d9b4 (GEOMESA-3113 Add system property to managing HBase deletes with visibilities (#2792))
=======
>>>>>>> 9dd4a005eb (GEOMESA-3113 Add system property to managing HBase deletes with visibilities (#2792))
=======
>>>>>>> f148adeccd (GEOMESA-3102 Fix removal of user data in FileSystemDataStore.createSchema (#2787))
=======
>>>>>>> 1d4e479464 (GEOMESA-3113 Add system property to managing HBase deletes with visibilities (#2792))
=======
>>>>>>> b448819e24 (GEOMESA-3113 Add system property to managing HBase deletes with visibilities (#2792))
=======
>>>>>>> d71800c037 (GEOMESA-3102 Fix removal of user data in FileSystemDataStore.createSchema (#2787))
=======
>>>>>>> a834a844c7 (GEOMESA-3113 Add system property to managing HBase deletes with visibilities (#2792))
=======
>>>>>>> f68b76f4b8 (GEOMESA-3113 Add system property to managing HBase deletes with visibilities (#2792))
=======
>>>>>>> 4d1cac1d60 (GEOMESA-3102 Fix removal of user data in FileSystemDataStore.createSchema (#2787))
=======
>>>>>>> 0d4496a2f2 (GEOMESA-3113 Add system property to managing HBase deletes with visibilities (#2792))
=======
>>>>>>> cb8df4c76b (GEOMESA-3113 Add system property to managing HBase deletes with visibilities (#2792))
=======
>>>>>>> 265d436467 (GEOMESA-3102 Fix removal of user data in FileSystemDataStore.createSchema (#2787))
=======
>>>>>>> 1506607bc9 (GEOMESA-3113 Add system property to managing HBase deletes with visibilities (#2792))
=======
>>>>>>> 7ce9817488 (GEOMESA-3113 Add system property to managing HBase deletes with visibilities (#2792))
=======
>>>>>>> 02465f5f58 (GEOMESA-3102 Fix removal of user data in FileSystemDataStore.createSchema (#2787))
=======
>>>>>>> de00bd1943 (GEOMESA-3113 Add system property to managing HBase deletes with visibilities (#2792))
=======
>>>>>>> 8eb59bcc3c (GEOMESA-3113 Add system property to managing HBase deletes with visibilities (#2792))
=======
>>>>>>> 6f245b0cc5 (GEOMESA-3102 Fix removal of user data in FileSystemDataStore.createSchema (#2787))
=======
>>>>>>> ea5f19f56b (GEOMESA-3113 Add system property to managing HBase deletes with visibilities (#2792))
=======
>>>>>>> 07c698faf4 (GEOMESA-3113 Add system property to managing HBase deletes with visibilities (#2792))
>>>>>>> bd17bd131e (GEOMESA-3102 Fix removal of user data in FileSystemDataStore.createSchema (#2787))
=======
>>>>>>> ca22354dd7 (GEOMESA-3113 Add system property to managing HBase deletes with visibilities (#2792))
=======
<<<<<<< HEAD
<<<<<<< HEAD
<<<<<<< HEAD
<<<<<<< HEAD
<<<<<<< HEAD
<<<<<<< HEAD
=======
>>>>>>> 34fd077439 (GEOMESA-3113 Add system property to managing HBase deletes with visibilities (#2792))
=======
>>>>>>> f58f87b448 (GEOMESA-3102 Fix removal of user data in FileSystemDataStore.createSchema (#2787))
>>>>>>> c385f79943 (GEOMESA-3102 Fix removal of user data in FileSystemDataStore.createSchema (#2787))
=======
>>>>>>> 2d758409cd (GEOMESA-3113 Add system property to managing HBase deletes with visibilities (#2792))
=======
<<<<<<< HEAD
<<<<<<< HEAD
<<<<<<< HEAD
<<<<<<< HEAD
<<<<<<< HEAD
<<<<<<< HEAD
=======
>>>>>>> 7196beb2e1 (GEOMESA-3113 Add system property to managing HBase deletes with visibilities (#2792))
=======
>>>>>>> b4cc9497d5 (GEOMESA-3102 Fix removal of user data in FileSystemDataStore.createSchema (#2787))
>>>>>>> 5c68fb7d18 (GEOMESA-3102 Fix removal of user data in FileSystemDataStore.createSchema (#2787))
=======
>>>>>>> 4a47c538bc (GEOMESA-3113 Add system property to managing HBase deletes with visibilities (#2792))
=======
<<<<<<< HEAD
<<<<<<< HEAD
<<<<<<< HEAD
<<<<<<< HEAD
<<<<<<< HEAD
<<<<<<< HEAD
=======
>>>>>>> df9cd4f22d (GEOMESA-3113 Add system property to managing HBase deletes with visibilities (#2792))
=======
>>>>>>> c0b0589a14 (GEOMESA-3102 Fix removal of user data in FileSystemDataStore.createSchema (#2787))
>>>>>>> a358de35a8 (GEOMESA-3102 Fix removal of user data in FileSystemDataStore.createSchema (#2787))
=======
>>>>>>> 44b15e96d9 (GEOMESA-3113 Add system property to managing HBase deletes with visibilities (#2792))
=======
<<<<<<< HEAD
<<<<<<< HEAD
<<<<<<< HEAD
<<<<<<< HEAD
<<<<<<< HEAD
<<<<<<< HEAD
=======
>>>>>>> 2b9cd40059 (GEOMESA-3113 Add system property to managing HBase deletes with visibilities (#2792))
=======
>>>>>>> 8a07c6167f (GEOMESA-3102 Fix removal of user data in FileSystemDataStore.createSchema (#2787))
>>>>>>> 2b62bcaeb4 (GEOMESA-3102 Fix removal of user data in FileSystemDataStore.createSchema (#2787))
=======
>>>>>>> afc081190b (GEOMESA-3113 Add system property to managing HBase deletes with visibilities (#2792))
=======
<<<<<<< HEAD
<<<<<<< HEAD
<<<<<<< HEAD
<<<<<<< HEAD
<<<<<<< HEAD
<<<<<<< HEAD
=======
>>>>>>> 1b0d520fde (GEOMESA-3113 Add system property to managing HBase deletes with visibilities (#2792))
=======
>>>>>>> 871350de06 (GEOMESA-3102 Fix removal of user data in FileSystemDataStore.createSchema (#2787))
>>>>>>> 75f3f455ec (GEOMESA-3102 Fix removal of user data in FileSystemDataStore.createSchema (#2787))
=======
>>>>>>> 7a3d004ad1 (GEOMESA-3113 Add system property to managing HBase deletes with visibilities (#2792))
=======
<<<<<<< HEAD
<<<<<<< HEAD
<<<<<<< HEAD
<<<<<<< HEAD
<<<<<<< HEAD
<<<<<<< HEAD
=======
>>>>>>> 9bcc7591e5 (GEOMESA-3113 Add system property to managing HBase deletes with visibilities (#2792))
=======
>>>>>>> 2ec7d64046 (GEOMESA-3102 Fix removal of user data in FileSystemDataStore.createSchema (#2787))
>>>>>>> 8871b2b4bc (GEOMESA-3102 Fix removal of user data in FileSystemDataStore.createSchema (#2787))
=======
>>>>>>> 91b0d6a888 (GEOMESA-3113 Add system property to managing HBase deletes with visibilities (#2792))
=======
<<<<<<< HEAD
<<<<<<< HEAD
<<<<<<< HEAD
<<<<<<< HEAD
<<<<<<< HEAD
<<<<<<< HEAD
=======
>>>>>>> 344200f1df (GEOMESA-3113 Add system property to managing HBase deletes with visibilities (#2792))
=======
>>>>>>> 8317120c9b (GEOMESA-3102 Fix removal of user data in FileSystemDataStore.createSchema (#2787))
>>>>>>> 4f922d74c9 (GEOMESA-3102 Fix removal of user data in FileSystemDataStore.createSchema (#2787))
=======
>>>>>>> 1b5719bd33 (GEOMESA-3113 Add system property to managing HBase deletes with visibilities (#2792))
=======
<<<<<<< HEAD
<<<<<<< HEAD
<<<<<<< HEAD
<<<<<<< HEAD
<<<<<<< HEAD
<<<<<<< HEAD
=======
>>>>>>> 98e607d2fa (GEOMESA-3113 Add system property to managing HBase deletes with visibilities (#2792))
=======
>>>>>>> 5d46ff705f (GEOMESA-3113 Add system property to managing HBase deletes with visibilities (#2792))
>>>>>>> 3c4fc5a828 (GEOMESA-3113 Add system property to managing HBase deletes with visibilities (#2792))
=======
>>>>>>> 92feb5d273 (GEOMESA-3113 Add system property to managing HBase deletes with visibilities (#2792))
=======
<<<<<<< HEAD
<<<<<<< HEAD
<<<<<<< HEAD
<<<<<<< HEAD
<<<<<<< HEAD
<<<<<<< HEAD
=======
>>>>>>> 8a234c7900 (GEOMESA-3113 Add system property to managing HBase deletes with visibilities (#2792))
=======
>>>>>>> b51d3046a2 (GEOMESA-3113 Add system property to managing HBase deletes with visibilities (#2792))
=======
>>>>>>> c14e106409 (GEOMESA-3113 Add system property to managing HBase deletes with visibilities (#2792))
=======
>>>>>>> 0e67f36558 (GEOMESA-3102 Fix removal of user data in FileSystemDataStore.createSchema (#2787))
=======
>>>>>>> 56f97cd271 (GEOMESA-3113 Add system property to managing HBase deletes with visibilities (#2792))
=======
>>>>>>> 89ea8190e2 (GEOMESA-3102 Fix removal of user data in FileSystemDataStore.createSchema (#2787))
=======
>>>>>>> 3226e92d8e (GEOMESA-3113 Add system property to managing HBase deletes with visibilities (#2792))
=======
>>>>>>> 1230d64006 (GEOMESA-3102 Fix removal of user data in FileSystemDataStore.createSchema (#2787))
=======
>>>>>>> cd5564bac6 (GEOMESA-3113 Add system property to managing HBase deletes with visibilities (#2792))
=======
>>>>>>> 038b4ca087 (GEOMESA-3102 Fix removal of user data in FileSystemDataStore.createSchema (#2787))
=======
>>>>>>> d774dc1d12 (GEOMESA-3113 Add system property to managing HBase deletes with visibilities (#2792))
=======
>>>>>>> e8b1c389e3 (GEOMESA-3102 Fix removal of user data in FileSystemDataStore.createSchema (#2787))
=======
>>>>>>> 6abf5007af (GEOMESA-3113 Add system property to managing HBase deletes with visibilities (#2792))
=======
>>>>>>> 2212530e6b (GEOMESA-3102 Fix removal of user data in FileSystemDataStore.createSchema (#2787))
=======
>>>>>>> d38e17d229 (GEOMESA-3113 Add system property to managing HBase deletes with visibilities (#2792))
=======
>>>>>>> aeb7c3ed76 (GEOMESA-3102 Fix removal of user data in FileSystemDataStore.createSchema (#2787))
=======
>>>>>>> 42bfd74c63 (GEOMESA-3113 Add system property to managing HBase deletes with visibilities (#2792))
=======
>>>>>>> bce9dc3e0e (GEOMESA-3102 Fix removal of user data in FileSystemDataStore.createSchema (#2787))
=======
>>>>>>> 9c750992ef (GEOMESA-3113 Add system property to managing HBase deletes with visibilities (#2792))
=======
>>>>>>> 687ba5655c (GEOMESA-3102 Fix removal of user data in FileSystemDataStore.createSchema (#2787))
=======
>>>>>>> 97a911d79c (GEOMESA-3113 Add system property to managing HBase deletes with visibilities (#2792))
=======
>>>>>>> 33d2777a8a (GEOMESA-3102 Fix removal of user data in FileSystemDataStore.createSchema (#2787))
=======
>>>>>>> cc5f917a7c (GEOMESA-3113 Add system property to managing HBase deletes with visibilities (#2792))
=======
>>>>>>> a49ee0e00a (GEOMESA-3102 Fix removal of user data in FileSystemDataStore.createSchema (#2787))
=======
>>>>>>> 3adb85864f (GEOMESA-3113 Add system property to managing HBase deletes with visibilities (#2792))
=======
>>>>>>> a1198ce095 (GEOMESA-3102 Fix removal of user data in FileSystemDataStore.createSchema (#2787))
=======
>>>>>>> 260d67442f (GEOMESA-3113 Add system property to managing HBase deletes with visibilities (#2792))
=======
>>>>>>> 9888cda97e (GEOMESA-3113 Add system property to managing HBase deletes with visibilities (#2792))
=======
>>>>>>> 8a234c7900 (GEOMESA-3113 Add system property to managing HBase deletes with visibilities (#2792))
=======
>>>>>>> b51d3046a2 (GEOMESA-3113 Add system property to managing HBase deletes with visibilities (#2792))
=======
>>>>>>> c14e106409 (GEOMESA-3113 Add system property to managing HBase deletes with visibilities (#2792))
=======
>>>>>>> 0e67f36558 (GEOMESA-3102 Fix removal of user data in FileSystemDataStore.createSchema (#2787))
=======
>>>>>>> 56f97cd271 (GEOMESA-3113 Add system property to managing HBase deletes with visibilities (#2792))
=======
>>>>>>> 89ea8190e2 (GEOMESA-3102 Fix removal of user data in FileSystemDataStore.createSchema (#2787))
=======
>>>>>>> 3226e92d8e (GEOMESA-3113 Add system property to managing HBase deletes with visibilities (#2792))
=======
>>>>>>> 1230d64006 (GEOMESA-3102 Fix removal of user data in FileSystemDataStore.createSchema (#2787))
=======
>>>>>>> cd5564bac6 (GEOMESA-3113 Add system property to managing HBase deletes with visibilities (#2792))
=======
>>>>>>> 038b4ca087 (GEOMESA-3102 Fix removal of user data in FileSystemDataStore.createSchema (#2787))
=======
>>>>>>> d774dc1d12 (GEOMESA-3113 Add system property to managing HBase deletes with visibilities (#2792))
=======
>>>>>>> e8b1c389e3 (GEOMESA-3102 Fix removal of user data in FileSystemDataStore.createSchema (#2787))
=======
>>>>>>> 6abf5007af (GEOMESA-3113 Add system property to managing HBase deletes with visibilities (#2792))
=======
>>>>>>> 2212530e6b (GEOMESA-3102 Fix removal of user data in FileSystemDataStore.createSchema (#2787))
=======
>>>>>>> d38e17d229 (GEOMESA-3113 Add system property to managing HBase deletes with visibilities (#2792))
=======
>>>>>>> aeb7c3ed76 (GEOMESA-3102 Fix removal of user data in FileSystemDataStore.createSchema (#2787))
=======
>>>>>>> 42bfd74c63 (GEOMESA-3113 Add system property to managing HBase deletes with visibilities (#2792))
=======
>>>>>>> bce9dc3e0e (GEOMESA-3102 Fix removal of user data in FileSystemDataStore.createSchema (#2787))
=======
>>>>>>> 9c750992ef (GEOMESA-3113 Add system property to managing HBase deletes with visibilities (#2792))
=======
>>>>>>> 687ba5655c (GEOMESA-3102 Fix removal of user data in FileSystemDataStore.createSchema (#2787))
=======
>>>>>>> 97a911d79c (GEOMESA-3113 Add system property to managing HBase deletes with visibilities (#2792))
=======
>>>>>>> 33d2777a8a (GEOMESA-3102 Fix removal of user data in FileSystemDataStore.createSchema (#2787))
=======
>>>>>>> cc5f917a7c (GEOMESA-3113 Add system property to managing HBase deletes with visibilities (#2792))
=======
>>>>>>> a49ee0e00a (GEOMESA-3102 Fix removal of user data in FileSystemDataStore.createSchema (#2787))
=======
>>>>>>> 3adb85864f (GEOMESA-3113 Add system property to managing HBase deletes with visibilities (#2792))
=======
>>>>>>> a1198ce095 (GEOMESA-3102 Fix removal of user data in FileSystemDataStore.createSchema (#2787))
=======
>>>>>>> 260d67442f (GEOMESA-3113 Add system property to managing HBase deletes with visibilities (#2792))
=======
>>>>>>> 32aba52002 (GEOMESA-3113 Add system property to managing HBase deletes with visibilities (#2792))
=======
>>>>>>> 69016fbbb7 (GEOMESA-3113 Add system property to managing HBase deletes with visibilities (#2792))
=======
>>>>>>> d73ae82492 (GEOMESA-3113 Add system property to managing HBase deletes with visibilities (#2792))
=======
>>>>>>> 8a234c7900 (GEOMESA-3113 Add system property to managing HBase deletes with visibilities (#2792))
=======
>>>>>>> b51d3046a2 (GEOMESA-3113 Add system property to managing HBase deletes with visibilities (#2792))
=======
>>>>>>> c14e106409 (GEOMESA-3113 Add system property to managing HBase deletes with visibilities (#2792))
=======
>>>>>>> 0e67f36558 (GEOMESA-3102 Fix removal of user data in FileSystemDataStore.createSchema (#2787))
=======
>>>>>>> 56f97cd271 (GEOMESA-3113 Add system property to managing HBase deletes with visibilities (#2792))
=======
>>>>>>> 89ea8190e2 (GEOMESA-3102 Fix removal of user data in FileSystemDataStore.createSchema (#2787))
=======
>>>>>>> 3226e92d8e (GEOMESA-3113 Add system property to managing HBase deletes with visibilities (#2792))
=======
>>>>>>> 1230d64006 (GEOMESA-3102 Fix removal of user data in FileSystemDataStore.createSchema (#2787))
=======
>>>>>>> cd5564bac6 (GEOMESA-3113 Add system property to managing HBase deletes with visibilities (#2792))
=======
>>>>>>> 038b4ca087 (GEOMESA-3102 Fix removal of user data in FileSystemDataStore.createSchema (#2787))
=======
>>>>>>> d774dc1d12 (GEOMESA-3113 Add system property to managing HBase deletes with visibilities (#2792))
=======
>>>>>>> e8b1c389e3 (GEOMESA-3102 Fix removal of user data in FileSystemDataStore.createSchema (#2787))
=======
>>>>>>> 6abf5007af (GEOMESA-3113 Add system property to managing HBase deletes with visibilities (#2792))
=======
>>>>>>> 2212530e6b (GEOMESA-3102 Fix removal of user data in FileSystemDataStore.createSchema (#2787))
=======
>>>>>>> d38e17d229 (GEOMESA-3113 Add system property to managing HBase deletes with visibilities (#2792))
=======
>>>>>>> aeb7c3ed76 (GEOMESA-3102 Fix removal of user data in FileSystemDataStore.createSchema (#2787))
=======
>>>>>>> 42bfd74c63 (GEOMESA-3113 Add system property to managing HBase deletes with visibilities (#2792))
=======
>>>>>>> bce9dc3e0e (GEOMESA-3102 Fix removal of user data in FileSystemDataStore.createSchema (#2787))
=======
>>>>>>> 9c750992ef (GEOMESA-3113 Add system property to managing HBase deletes with visibilities (#2792))
=======
>>>>>>> 687ba5655c (GEOMESA-3102 Fix removal of user data in FileSystemDataStore.createSchema (#2787))
=======
>>>>>>> 97a911d79c (GEOMESA-3113 Add system property to managing HBase deletes with visibilities (#2792))
=======
>>>>>>> 33d2777a8a (GEOMESA-3102 Fix removal of user data in FileSystemDataStore.createSchema (#2787))
=======
>>>>>>> cc5f917a7c (GEOMESA-3113 Add system property to managing HBase deletes with visibilities (#2792))
=======
>>>>>>> a49ee0e00a (GEOMESA-3102 Fix removal of user data in FileSystemDataStore.createSchema (#2787))
=======
>>>>>>> 3adb85864f (GEOMESA-3113 Add system property to managing HBase deletes with visibilities (#2792))
=======
>>>>>>> a1198ce095 (GEOMESA-3102 Fix removal of user data in FileSystemDataStore.createSchema (#2787))
=======
>>>>>>> 260d67442f (GEOMESA-3113 Add system property to managing HBase deletes with visibilities (#2792))
=======
>>>>>>> 9888cda97e (GEOMESA-3113 Add system property to managing HBase deletes with visibilities (#2792))
=======
>>>>>>> 8a234c7900 (GEOMESA-3113 Add system property to managing HBase deletes with visibilities (#2792))
=======
>>>>>>> b51d3046a2 (GEOMESA-3113 Add system property to managing HBase deletes with visibilities (#2792))
=======
>>>>>>> c14e106409 (GEOMESA-3113 Add system property to managing HBase deletes with visibilities (#2792))
=======
>>>>>>> 0e67f36558 (GEOMESA-3102 Fix removal of user data in FileSystemDataStore.createSchema (#2787))
=======
>>>>>>> 56f97cd271 (GEOMESA-3113 Add system property to managing HBase deletes with visibilities (#2792))
=======
>>>>>>> 89ea8190e2 (GEOMESA-3102 Fix removal of user data in FileSystemDataStore.createSchema (#2787))
=======
>>>>>>> 3226e92d8e (GEOMESA-3113 Add system property to managing HBase deletes with visibilities (#2792))
=======
>>>>>>> 1230d64006 (GEOMESA-3102 Fix removal of user data in FileSystemDataStore.createSchema (#2787))
=======
>>>>>>> cd5564bac6 (GEOMESA-3113 Add system property to managing HBase deletes with visibilities (#2792))
=======
>>>>>>> 038b4ca087 (GEOMESA-3102 Fix removal of user data in FileSystemDataStore.createSchema (#2787))
=======
>>>>>>> d774dc1d12 (GEOMESA-3113 Add system property to managing HBase deletes with visibilities (#2792))
=======
>>>>>>> e8b1c389e3 (GEOMESA-3102 Fix removal of user data in FileSystemDataStore.createSchema (#2787))
=======
>>>>>>> 6abf5007af (GEOMESA-3113 Add system property to managing HBase deletes with visibilities (#2792))
=======
>>>>>>> 2212530e6b (GEOMESA-3102 Fix removal of user data in FileSystemDataStore.createSchema (#2787))
=======
>>>>>>> d38e17d229 (GEOMESA-3113 Add system property to managing HBase deletes with visibilities (#2792))
=======
>>>>>>> aeb7c3ed76 (GEOMESA-3102 Fix removal of user data in FileSystemDataStore.createSchema (#2787))
=======
>>>>>>> 42bfd74c63 (GEOMESA-3113 Add system property to managing HBase deletes with visibilities (#2792))
=======
>>>>>>> bce9dc3e0e (GEOMESA-3102 Fix removal of user data in FileSystemDataStore.createSchema (#2787))
=======
>>>>>>> 9c750992ef (GEOMESA-3113 Add system property to managing HBase deletes with visibilities (#2792))
=======
>>>>>>> 687ba5655c (GEOMESA-3102 Fix removal of user data in FileSystemDataStore.createSchema (#2787))
=======
>>>>>>> 97a911d79c (GEOMESA-3113 Add system property to managing HBase deletes with visibilities (#2792))
=======
>>>>>>> 33d2777a8a (GEOMESA-3102 Fix removal of user data in FileSystemDataStore.createSchema (#2787))
=======
>>>>>>> cc5f917a7c (GEOMESA-3113 Add system property to managing HBase deletes with visibilities (#2792))
=======
>>>>>>> a49ee0e00a (GEOMESA-3102 Fix removal of user data in FileSystemDataStore.createSchema (#2787))
=======
>>>>>>> 3adb85864f (GEOMESA-3113 Add system property to managing HBase deletes with visibilities (#2792))
=======
>>>>>>> a1198ce095 (GEOMESA-3102 Fix removal of user data in FileSystemDataStore.createSchema (#2787))
=======
>>>>>>> 260d67442f (GEOMESA-3113 Add system property to managing HBase deletes with visibilities (#2792))
=======
>>>>>>> 113b056da (GEOMESA-3113 Add system property to managing HBase deletes with visibilities (#2792))
>>>>>>> 6f73f22005 (GEOMESA-3113 Add system property to managing HBase deletes with visibilities (#2792))
=======
<<<<<<< HEAD
<<<<<<< HEAD
<<<<<<< HEAD
<<<<<<< HEAD
<<<<<<< HEAD
<<<<<<< HEAD
=======
>>>>>>> d73ae82492 (GEOMESA-3113 Add system property to managing HBase deletes with visibilities (#2792))
=======
>>>>>>> d1d11691fd (GEOMESA-3113 Add system property to managing HBase deletes with visibilities (#2792))
>>>>>>> 58f72e76c (GEOMESA-3113 Add system property to managing HBase deletes with visibilities (#2792))
=======
>>>>>>> 4c9fb0f6e (GEOMESA-3113 Add system property to managing HBase deletes with visibilities (#2792))
=======
<<<<<<< HEAD
<<<<<<< HEAD
<<<<<<< HEAD
<<<<<<< HEAD
<<<<<<< HEAD
<<<<<<< HEAD
=======
>>>>>>> eeb8ab478a (GEOMESA-3113 Add system property to managing HBase deletes with visibilities (#2792))
=======
>>>>>>> a8b2b56cbd (GEOMESA-3113 Add system property to managing HBase deletes with visibilities (#2792))
>>>>>>> 72415e208a (GEOMESA-3113 Add system property to managing HBase deletes with visibilities (#2792))
=======
>>>>>>> 5521d97d99 (GEOMESA-3102 Fix removal of user data in FileSystemDataStore.createSchema (#2787))
=======
<<<<<<< HEAD
<<<<<<< HEAD
<<<<<<< HEAD
<<<<<<< HEAD
<<<<<<< HEAD
<<<<<<< HEAD
=======
>>>>>>> 27eec0d076 (GEOMESA-3102 Fix removal of user data in FileSystemDataStore.createSchema (#2787))
=======
>>>>>>> afcf525d7d (GEOMESA-3113 Add system property to managing HBase deletes with visibilities (#2792))
>>>>>>> 26fc359a06 (GEOMESA-3113 Add system property to managing HBase deletes with visibilities (#2792))
=======
>>>>>>> adf2ac19a8 (GEOMESA-3102 Fix removal of user data in FileSystemDataStore.createSchema (#2787))
=======
<<<<<<< HEAD
<<<<<<< HEAD
<<<<<<< HEAD
<<<<<<< HEAD
<<<<<<< HEAD
<<<<<<< HEAD
=======
>>>>>>> e11c16ba5d (GEOMESA-3102 Fix removal of user data in FileSystemDataStore.createSchema (#2787))
=======
>>>>>>> 00494e0bcf (GEOMESA-3113 Add system property to managing HBase deletes with visibilities (#2792))
>>>>>>> e62505d539 (GEOMESA-3113 Add system property to managing HBase deletes with visibilities (#2792))
=======
=======
<<<<<<< HEAD
<<<<<<< HEAD
<<<<<<< HEAD
<<<<<<< HEAD
<<<<<<< HEAD
<<<<<<< HEAD
=======
>>>>>>> 5742320897 (GEOMESA-3102 Fix removal of user data in FileSystemDataStore.createSchema (#2787))
=======
>>>>>>> c43c29e91c (GEOMESA-3113 Add system property to managing HBase deletes with visibilities (#2792))
>>>>>>> 797b02396b (GEOMESA-3113 Add system property to managing HBase deletes with visibilities (#2792))
=======
>>>>>>> 3171e7407d (GEOMESA-3102 Fix removal of user data in FileSystemDataStore.createSchema (#2787))
=======
>>>>>>> 237494b1cc (GEOMESA-3113 Add system property to managing HBase deletes with visibilities (#2792))
=======
<<<<<<< HEAD
<<<<<<< HEAD
<<<<<<< HEAD
<<<<<<< HEAD
=======
>>>>>>> 64c0e084b5 (GEOMESA-3113 Add system property to managing HBase deletes with visibilities (#2792))
=======
>>>>>>> 4b926d9ec6 (GEOMESA-3102 Fix removal of user data in FileSystemDataStore.createSchema (#2787))
>>>>>>> 9ec1f049a9 (GEOMESA-3102 Fix removal of user data in FileSystemDataStore.createSchema (#2787))
=======
>>>>>>> a0d6da1831 (GEOMESA-3113 Add system property to managing HBase deletes with visibilities (#2792))
=======
<<<<<<< HEAD
<<<<<<< HEAD
<<<<<<< HEAD
<<<<<<< HEAD
=======
>>>>>>> cdb062d5e9 (GEOMESA-3113 Add system property to managing HBase deletes with visibilities (#2792))
=======
>>>>>>> a738799968 (GEOMESA-3102 Fix removal of user data in FileSystemDataStore.createSchema (#2787))
>>>>>>> 1faf0d16f2 (GEOMESA-3102 Fix removal of user data in FileSystemDataStore.createSchema (#2787))
=======
>>>>>>> e5413df04f (GEOMESA-3113 Add system property to managing HBase deletes with visibilities (#2792))
=======
<<<<<<< HEAD
<<<<<<< HEAD
<<<<<<< HEAD
<<<<<<< HEAD
=======
>>>>>>> 3d40465720 (GEOMESA-3113 Add system property to managing HBase deletes with visibilities (#2792))
=======
>>>>>>> 49e9f5cb35 (GEOMESA-3102 Fix removal of user data in FileSystemDataStore.createSchema (#2787))
>>>>>>> 8aa4f55ef6 (GEOMESA-3102 Fix removal of user data in FileSystemDataStore.createSchema (#2787))
=======
>>>>>>> 11addb1ce7 (GEOMESA-3113 Add system property to managing HBase deletes with visibilities (#2792))
=======
<<<<<<< HEAD
<<<<<<< HEAD
<<<<<<< HEAD
<<<<<<< HEAD
=======
>>>>>>> 3867fd5b25 (GEOMESA-3113 Add system property to managing HBase deletes with visibilities (#2792))
=======
>>>>>>> 4d7289a2fe (GEOMESA-3102 Fix removal of user data in FileSystemDataStore.createSchema (#2787))
>>>>>>> 90d85d9b4b (GEOMESA-3102 Fix removal of user data in FileSystemDataStore.createSchema (#2787))
=======
>>>>>>> 1468e59829 (GEOMESA-3113 Add system property to managing HBase deletes with visibilities (#2792))
=======
<<<<<<< HEAD
<<<<<<< HEAD
<<<<<<< HEAD
<<<<<<< HEAD
=======
>>>>>>> 5af1e798d5 (GEOMESA-3113 Add system property to managing HBase deletes with visibilities (#2792))
=======
>>>>>>> f22bf41646 (GEOMESA-3102 Fix removal of user data in FileSystemDataStore.createSchema (#2787))
>>>>>>> a618e2ba0a (GEOMESA-3102 Fix removal of user data in FileSystemDataStore.createSchema (#2787))
=======
>>>>>>> 65360f96a0 (GEOMESA-3113 Add system property to managing HBase deletes with visibilities (#2792))
=======
<<<<<<< HEAD
<<<<<<< HEAD
<<<<<<< HEAD
<<<<<<< HEAD
=======
>>>>>>> ffcb7ff3ae (GEOMESA-3113 Add system property to managing HBase deletes with visibilities (#2792))
=======
>>>>>>> 4b0c56ce56 (GEOMESA-3102 Fix removal of user data in FileSystemDataStore.createSchema (#2787))
>>>>>>> 20dc993a76 (GEOMESA-3102 Fix removal of user data in FileSystemDataStore.createSchema (#2787))
=======
>>>>>>> bd6dd934cc (GEOMESA-3113 Add system property to managing HBase deletes with visibilities (#2792))
=======
<<<<<<< HEAD
<<<<<<< HEAD
<<<<<<< HEAD
<<<<<<< HEAD
=======
>>>>>>> 9ac1262e54 (GEOMESA-3113 Add system property to managing HBase deletes with visibilities (#2792))
=======
>>>>>>> 1a90b3062a (GEOMESA-3102 Fix removal of user data in FileSystemDataStore.createSchema (#2787))
>>>>>>> 495c744326 (GEOMESA-3102 Fix removal of user data in FileSystemDataStore.createSchema (#2787))
=======
>>>>>>> 49d3846b23 (GEOMESA-3113 Add system property to managing HBase deletes with visibilities (#2792))
=======
<<<<<<< HEAD
<<<<<<< HEAD
<<<<<<< HEAD
<<<<<<< HEAD
=======
>>>>>>> 043e029470 (GEOMESA-3113 Add system property to managing HBase deletes with visibilities (#2792))
=======
>>>>>>> c8431d18e4 (GEOMESA-3102 Fix removal of user data in FileSystemDataStore.createSchema (#2787))
>>>>>>> 155d6a9469 (GEOMESA-3102 Fix removal of user data in FileSystemDataStore.createSchema (#2787))
=======
>>>>>>> e4ee051914 (GEOMESA-3113 Add system property to managing HBase deletes with visibilities (#2792))
=======
<<<<<<< HEAD
<<<<<<< HEAD
<<<<<<< HEAD
=======
>>>>>>> 9dd4a005eb (GEOMESA-3113 Add system property to managing HBase deletes with visibilities (#2792))
=======
>>>>>>> 797b02396b (GEOMESA-3113 Add system property to managing HBase deletes with visibilities (#2792))
=======
<<<<<<< HEAD
>>>>>>> f2b9fb3853 (GEOMESA-3113 Add system property to managing HBase deletes with visibilities (#2792))
=======
>>>>>>> 3171e7407d (GEOMESA-3102 Fix removal of user data in FileSystemDataStore.createSchema (#2787))
=======
>>>>>>> 7f486255dd (GEOMESA-3102 Fix removal of user data in FileSystemDataStore.createSchema (#2787))
=======
>>>>>>> e639fc30a7 (GEOMESA-3113 Add system property to managing HBase deletes with visibilities (#2792))
<<<<<<< HEAD
<<<<<<< HEAD
=======
>>>>>>> 4b926d9ec6 (GEOMESA-3102 Fix removal of user data in FileSystemDataStore.createSchema (#2787))
=======
>>>>>>> 9ec1f049a9 (GEOMESA-3102 Fix removal of user data in FileSystemDataStore.createSchema (#2787))
=======
>>>>>>> 7e323ef52f (GEOMESA-3102 Fix removal of user data in FileSystemDataStore.createSchema (#2787))
<<<<<<< HEAD
<<<<<<< HEAD
=======
>>>>>>> 69a4e317d6 (GEOMESA-3113 Add system property to managing HBase deletes with visibilities (#2792))
=======
>>>>>>> 1faf0d16f2 (GEOMESA-3102 Fix removal of user data in FileSystemDataStore.createSchema (#2787))
=======
>>>>>>> e9395c1096 (GEOMESA-3102 Fix removal of user data in FileSystemDataStore.createSchema (#2787))
<<<<<<< HEAD
<<<<<<< HEAD
=======
>>>>>>> 65460df3e6 (GEOMESA-3113 Add system property to managing HBase deletes with visibilities (#2792))
=======
>>>>>>> 8aa4f55ef6 (GEOMESA-3102 Fix removal of user data in FileSystemDataStore.createSchema (#2787))
=======
>>>>>>> 16bbecada1 (GEOMESA-3102 Fix removal of user data in FileSystemDataStore.createSchema (#2787))
<<<<<<< HEAD
<<<<<<< HEAD
=======
>>>>>>> be1167e028 (GEOMESA-3113 Add system property to managing HBase deletes with visibilities (#2792))
=======
>>>>>>> 90d85d9b4b (GEOMESA-3102 Fix removal of user data in FileSystemDataStore.createSchema (#2787))
=======
>>>>>>> fa2938c568 (GEOMESA-3102 Fix removal of user data in FileSystemDataStore.createSchema (#2787))
<<<<<<< HEAD
<<<<<<< HEAD
=======
>>>>>>> 54da398207 (GEOMESA-3113 Add system property to managing HBase deletes with visibilities (#2792))
=======
>>>>>>> a618e2ba0a (GEOMESA-3102 Fix removal of user data in FileSystemDataStore.createSchema (#2787))
=======
>>>>>>> 1682b13d94 (GEOMESA-3102 Fix removal of user data in FileSystemDataStore.createSchema (#2787))
<<<<<<< HEAD
<<<<<<< HEAD
=======
>>>>>>> 8999b3f6b9 (GEOMESA-3113 Add system property to managing HBase deletes with visibilities (#2792))
=======
>>>>>>> 20dc993a76 (GEOMESA-3102 Fix removal of user data in FileSystemDataStore.createSchema (#2787))
=======
>>>>>>> abc395c346 (GEOMESA-3102 Fix removal of user data in FileSystemDataStore.createSchema (#2787))
<<<<<<< HEAD
<<<<<<< HEAD
=======
>>>>>>> 3c53246c9a (GEOMESA-3113 Add system property to managing HBase deletes with visibilities (#2792))
=======
>>>>>>> 495c744326 (GEOMESA-3102 Fix removal of user data in FileSystemDataStore.createSchema (#2787))
=======
>>>>>>> fd0ea5e670 (GEOMESA-3102 Fix removal of user data in FileSystemDataStore.createSchema (#2787))
<<<<<<< HEAD
<<<<<<< HEAD
=======
>>>>>>> fc179cb2d5 (GEOMESA-3113 Add system property to managing HBase deletes with visibilities (#2792))
=======
>>>>>>> 155d6a9469 (GEOMESA-3102 Fix removal of user data in FileSystemDataStore.createSchema (#2787))
=======
>>>>>>> d2e8dad373 (GEOMESA-3102 Fix removal of user data in FileSystemDataStore.createSchema (#2787))
<<<<<<< HEAD
<<<<<<< HEAD
=======
>>>>>>> 9e74e1d9b4 (GEOMESA-3113 Add system property to managing HBase deletes with visibilities (#2792))
=======
=======
>>>>>>> 797b02396b (GEOMESA-3113 Add system property to managing HBase deletes with visibilities (#2792))
=======
<<<<<<< HEAD
>>>>>>> f2b9fb3853 (GEOMESA-3113 Add system property to managing HBase deletes with visibilities (#2792))
<<<<<<< HEAD
>>>>>>> c43c29e91c (GEOMESA-3113 Add system property to managing HBase deletes with visibilities (#2792))
=======
=======
>>>>>>> 3171e7407d (GEOMESA-3102 Fix removal of user data in FileSystemDataStore.createSchema (#2787))
=======
>>>>>>> 7f486255dd (GEOMESA-3102 Fix removal of user data in FileSystemDataStore.createSchema (#2787))
>>>>>>> 78439fc2da (GEOMESA-3102 Fix removal of user data in FileSystemDataStore.createSchema (#2787))
=======
>>>>>>> 64c0e084b5 (GEOMESA-3113 Add system property to managing HBase deletes with visibilities (#2792))
=======
>>>>>>> 4b926d9ec6 (GEOMESA-3102 Fix removal of user data in FileSystemDataStore.createSchema (#2787))
=======
=======
>>>>>>> 69a4e317d6 (GEOMESA-3113 Add system property to managing HBase deletes with visibilities (#2792))
>>>>>>> cdb062d5e9 (GEOMESA-3113 Add system property to managing HBase deletes with visibilities (#2792))
=======
>>>>>>> a738799968 (GEOMESA-3102 Fix removal of user data in FileSystemDataStore.createSchema (#2787))
=======
=======
>>>>>>> 65460df3e6 (GEOMESA-3113 Add system property to managing HBase deletes with visibilities (#2792))
>>>>>>> 3d40465720 (GEOMESA-3113 Add system property to managing HBase deletes with visibilities (#2792))
=======
>>>>>>> 49e9f5cb35 (GEOMESA-3102 Fix removal of user data in FileSystemDataStore.createSchema (#2787))
=======
=======
>>>>>>> be1167e028 (GEOMESA-3113 Add system property to managing HBase deletes with visibilities (#2792))
>>>>>>> 3867fd5b25 (GEOMESA-3113 Add system property to managing HBase deletes with visibilities (#2792))
=======
>>>>>>> 4d7289a2fe (GEOMESA-3102 Fix removal of user data in FileSystemDataStore.createSchema (#2787))
=======
=======
>>>>>>> 54da398207 (GEOMESA-3113 Add system property to managing HBase deletes with visibilities (#2792))
>>>>>>> 5af1e798d5 (GEOMESA-3113 Add system property to managing HBase deletes with visibilities (#2792))
=======
>>>>>>> f22bf41646 (GEOMESA-3102 Fix removal of user data in FileSystemDataStore.createSchema (#2787))
=======
=======
>>>>>>> 8999b3f6b9 (GEOMESA-3113 Add system property to managing HBase deletes with visibilities (#2792))
>>>>>>> ffcb7ff3ae (GEOMESA-3113 Add system property to managing HBase deletes with visibilities (#2792))
=======
>>>>>>> 4b0c56ce56 (GEOMESA-3102 Fix removal of user data in FileSystemDataStore.createSchema (#2787))
=======
=======
>>>>>>> 3c53246c9a (GEOMESA-3113 Add system property to managing HBase deletes with visibilities (#2792))
>>>>>>> 9ac1262e54 (GEOMESA-3113 Add system property to managing HBase deletes with visibilities (#2792))
=======
>>>>>>> 1a90b3062a (GEOMESA-3102 Fix removal of user data in FileSystemDataStore.createSchema (#2787))
=======
=======
>>>>>>> fc179cb2d5 (GEOMESA-3113 Add system property to managing HBase deletes with visibilities (#2792))
>>>>>>> 043e029470 (GEOMESA-3113 Add system property to managing HBase deletes with visibilities (#2792))
=======
>>>>>>> c8431d18e4 (GEOMESA-3102 Fix removal of user data in FileSystemDataStore.createSchema (#2787))
=======
=======
>>>>>>> 9e74e1d9b4 (GEOMESA-3113 Add system property to managing HBase deletes with visibilities (#2792))
>>>>>>> 9dd4a005eb (GEOMESA-3113 Add system property to managing HBase deletes with visibilities (#2792))
>>>>>>> bd17bd131 (GEOMESA-3102 Fix removal of user data in FileSystemDataStore.createSchema (#2787))
>>>>>>> c555446b8b (GEOMESA-3102 Fix removal of user data in FileSystemDataStore.createSchema (#2787))
=======
>>>>>>> ca22354dd (GEOMESA-3113 Add system property to managing HBase deletes with visibilities (#2792))
=======
<<<<<<< HEAD
<<<<<<< HEAD
<<<<<<< HEAD
<<<<<<< HEAD
=======
>>>>>>> c43c29e91c (GEOMESA-3113 Add system property to managing HBase deletes with visibilities (#2792))
=======
>>>>>>> 78439fc2da (GEOMESA-3102 Fix removal of user data in FileSystemDataStore.createSchema (#2787))
>>>>>>> c385f7994 (GEOMESA-3102 Fix removal of user data in FileSystemDataStore.createSchema (#2787))
=======
>>>>>>> 2d758409c (GEOMESA-3113 Add system property to managing HBase deletes with visibilities (#2792))
=======
<<<<<<< HEAD
<<<<<<< HEAD
<<<<<<< HEAD
<<<<<<< HEAD
=======
>>>>>>> 64c0e084b5 (GEOMESA-3113 Add system property to managing HBase deletes with visibilities (#2792))
=======
>>>>>>> 4b926d9ec6 (GEOMESA-3102 Fix removal of user data in FileSystemDataStore.createSchema (#2787))
>>>>>>> 5c68fb7d1 (GEOMESA-3102 Fix removal of user data in FileSystemDataStore.createSchema (#2787))
=======
>>>>>>> 4a47c538b (GEOMESA-3113 Add system property to managing HBase deletes with visibilities (#2792))
=======
<<<<<<< HEAD
<<<<<<< HEAD
<<<<<<< HEAD
<<<<<<< HEAD
=======
>>>>>>> cdb062d5e9 (GEOMESA-3113 Add system property to managing HBase deletes with visibilities (#2792))
=======
>>>>>>> a738799968 (GEOMESA-3102 Fix removal of user data in FileSystemDataStore.createSchema (#2787))
>>>>>>> a358de35a (GEOMESA-3102 Fix removal of user data in FileSystemDataStore.createSchema (#2787))
=======
>>>>>>> 44b15e96d (GEOMESA-3113 Add system property to managing HBase deletes with visibilities (#2792))
=======
<<<<<<< HEAD
<<<<<<< HEAD
<<<<<<< HEAD
<<<<<<< HEAD
=======
>>>>>>> 3d40465720 (GEOMESA-3113 Add system property to managing HBase deletes with visibilities (#2792))
=======
>>>>>>> f22bf41646 (GEOMESA-3102 Fix removal of user data in FileSystemDataStore.createSchema (#2787))
>>>>>>> 2b62bcaeb (GEOMESA-3102 Fix removal of user data in FileSystemDataStore.createSchema (#2787))
=======
>>>>>>> afc081190 (GEOMESA-3113 Add system property to managing HBase deletes with visibilities (#2792))
=======
<<<<<<< HEAD
<<<<<<< HEAD
<<<<<<< HEAD
<<<<<<< HEAD
=======
>>>>>>> ffcb7ff3ae (GEOMESA-3113 Add system property to managing HBase deletes with visibilities (#2792))
=======
>>>>>>> 4b0c56ce56 (GEOMESA-3102 Fix removal of user data in FileSystemDataStore.createSchema (#2787))
>>>>>>> 75f3f455e (GEOMESA-3102 Fix removal of user data in FileSystemDataStore.createSchema (#2787))
=======
>>>>>>> 7a3d004ad (GEOMESA-3113 Add system property to managing HBase deletes with visibilities (#2792))
=======
<<<<<<< HEAD
<<<<<<< HEAD
<<<<<<< HEAD
<<<<<<< HEAD
=======
>>>>>>> 9ac1262e54 (GEOMESA-3113 Add system property to managing HBase deletes with visibilities (#2792))
=======
>>>>>>> 1a90b3062a (GEOMESA-3102 Fix removal of user data in FileSystemDataStore.createSchema (#2787))
>>>>>>> 8871b2b4b (GEOMESA-3102 Fix removal of user data in FileSystemDataStore.createSchema (#2787))
=======
>>>>>>> 91b0d6a88 (GEOMESA-3113 Add system property to managing HBase deletes with visibilities (#2792))
=======
<<<<<<< HEAD
<<<<<<< HEAD
<<<<<<< HEAD
<<<<<<< HEAD
=======
>>>>>>> 043e029470 (GEOMESA-3113 Add system property to managing HBase deletes with visibilities (#2792))
=======
>>>>>>> c8431d18e4 (GEOMESA-3102 Fix removal of user data in FileSystemDataStore.createSchema (#2787))
>>>>>>> 4f922d74c (GEOMESA-3102 Fix removal of user data in FileSystemDataStore.createSchema (#2787))
=======
>>>>>>> 1b5719bd3 (GEOMESA-3113 Add system property to managing HBase deletes with visibilities (#2792))
=======
<<<<<<< HEAD
<<<<<<< HEAD
<<<<<<< HEAD
<<<<<<< HEAD
=======
>>>>>>> 9dd4a005eb (GEOMESA-3113 Add system property to managing HBase deletes with visibilities (#2792))
=======
>>>>>>> 4d1cac1d60 (GEOMESA-3102 Fix removal of user data in FileSystemDataStore.createSchema (#2787))
>>>>>>> 526e71304c (GEOMESA-3102 Fix removal of user data in FileSystemDataStore.createSchema (#2787))
=======
>>>>>>> 074e4b10b9 (GEOMESA-3113 Add system property to managing HBase deletes with visibilities (#2792))
=======
<<<<<<< HEAD
<<<<<<< HEAD
<<<<<<< HEAD
<<<<<<< HEAD
=======
>>>>>>> cb8df4c76b (GEOMESA-3113 Add system property to managing HBase deletes with visibilities (#2792))
=======
>>>>>>> 265d436467 (GEOMESA-3102 Fix removal of user data in FileSystemDataStore.createSchema (#2787))
>>>>>>> 9c809610d5 (GEOMESA-3102 Fix removal of user data in FileSystemDataStore.createSchema (#2787))
=======
>>>>>>> 0b22bfaa87 (GEOMESA-3113 Add system property to managing HBase deletes with visibilities (#2792))
=======
<<<<<<< HEAD
<<<<<<< HEAD
<<<<<<< HEAD
<<<<<<< HEAD
=======
>>>>>>> 7ce9817488 (GEOMESA-3113 Add system property to managing HBase deletes with visibilities (#2792))
=======
>>>>>>> 02465f5f58 (GEOMESA-3102 Fix removal of user data in FileSystemDataStore.createSchema (#2787))
>>>>>>> 9e842c2021 (GEOMESA-3102 Fix removal of user data in FileSystemDataStore.createSchema (#2787))
=======
>>>>>>> 0f0dd6560e (GEOMESA-3113 Add system property to managing HBase deletes with visibilities (#2792))
=======
<<<<<<< HEAD
<<<<<<< HEAD
<<<<<<< HEAD
<<<<<<< HEAD
=======
>>>>>>> 8eb59bcc3c (GEOMESA-3113 Add system property to managing HBase deletes with visibilities (#2792))
=======
>>>>>>> 6f245b0cc5 (GEOMESA-3102 Fix removal of user data in FileSystemDataStore.createSchema (#2787))
>>>>>>> 98ce8bad96 (GEOMESA-3102 Fix removal of user data in FileSystemDataStore.createSchema (#2787))
=======
>>>>>>> a8e7273bb0 (GEOMESA-3113 Add system property to managing HBase deletes with visibilities (#2792))
=======
<<<<<<< HEAD
>>>>>>> 39d46533eb (GEOMESA-3102 Fix removal of user data in FileSystemDataStore.createSchema (#2787))
=======
>>>>>>> 9da518fc54 (GEOMESA-3113 Add system property to managing HBase deletes with visibilities (#2792))
=======
>>>>>>> b52e5bb454 (GEOMESA-3102 Fix removal of user data in FileSystemDataStore.createSchema (#2787))
=======
>>>>>>> 4bd5ce922d (GEOMESA-3113 Add system property to managing HBase deletes with visibilities (#2792))
=======
>>>>>>> cfd537e7af (GEOMESA-3102 Fix removal of user data in FileSystemDataStore.createSchema (#2787))
=======
>>>>>>> e17f495391 (GEOMESA-3113 Add system property to managing HBase deletes with visibilities (#2792))
=======
>>>>>>> 54709e3b06 (GEOMESA-3102 Fix removal of user data in FileSystemDataStore.createSchema (#2787))
=======
>>>>>>> d857d34521 (GEOMESA-3113 Add system property to managing HBase deletes with visibilities (#2792))
=======
>>>>>>> 4100fa1ce8 (GEOMESA-3102 Fix removal of user data in FileSystemDataStore.createSchema (#2787))
=======
>>>>>>> b515d530a4 (GEOMESA-3113 Add system property to managing HBase deletes with visibilities (#2792))
=======
>>>>>>> 7ee0f1d494 (GEOMESA-3102 Fix removal of user data in FileSystemDataStore.createSchema (#2787))
=======
>>>>>>> 02fea6930b (GEOMESA-3113 Add system property to managing HBase deletes with visibilities (#2792))
=======
=======
>>>>>>> bd17bd131e (GEOMESA-3102 Fix removal of user data in FileSystemDataStore.createSchema (#2787))
>>>>>>> a2a804586c (GEOMESA-3102 Fix removal of user data in FileSystemDataStore.createSchema (#2787))
=======
=======
>>>>>>> a773c6ef65 (GEOMESA-3113 Add system property to managing HBase deletes with visibilities (#2792))
=======
>>>>>>> c385f79943 (GEOMESA-3102 Fix removal of user data in FileSystemDataStore.createSchema (#2787))
=======
>>>>>>> 2d01ec0bc0 (GEOMESA-3102 Fix removal of user data in FileSystemDataStore.createSchema (#2787))
=======
>>>>>>> b586a90765 (GEOMESA-3113 Add system property to managing HBase deletes with visibilities (#2792))
=======
>>>>>>> 5c68fb7d18 (GEOMESA-3102 Fix removal of user data in FileSystemDataStore.createSchema (#2787))
=======
>>>>>>> 8a9d3df519 (GEOMESA-3102 Fix removal of user data in FileSystemDataStore.createSchema (#2787))
=======
>>>>>>> ba177f9f13 (GEOMESA-3113 Add system property to managing HBase deletes with visibilities (#2792))
=======
>>>>>>> a358de35a8 (GEOMESA-3102 Fix removal of user data in FileSystemDataStore.createSchema (#2787))
=======
>>>>>>> 08ee2fed57 (GEOMESA-3102 Fix removal of user data in FileSystemDataStore.createSchema (#2787))
=======
>>>>>>> 813cf035d0 (GEOMESA-3113 Add system property to managing HBase deletes with visibilities (#2792))
<<<<<<< HEAD
<<<<<<< HEAD
=======
>>>>>>> 8a07c6167f (GEOMESA-3102 Fix removal of user data in FileSystemDataStore.createSchema (#2787))
=======
>>>>>>> 2b62bcaeb4 (GEOMESA-3102 Fix removal of user data in FileSystemDataStore.createSchema (#2787))
=======
>>>>>>> 628458842d (GEOMESA-3102 Fix removal of user data in FileSystemDataStore.createSchema (#2787))
<<<<<<< HEAD
<<<<<<< HEAD
=======
>>>>>>> aca68ab685 (GEOMESA-3113 Add system property to managing HBase deletes with visibilities (#2792))
=======
>>>>>>> 75f3f455ec (GEOMESA-3102 Fix removal of user data in FileSystemDataStore.createSchema (#2787))
=======
>>>>>>> f7952edd5f (GEOMESA-3102 Fix removal of user data in FileSystemDataStore.createSchema (#2787))
<<<<<<< HEAD
<<<<<<< HEAD
=======
>>>>>>> fd0793971d (GEOMESA-3113 Add system property to managing HBase deletes with visibilities (#2792))
=======
>>>>>>> 8871b2b4bc (GEOMESA-3102 Fix removal of user data in FileSystemDataStore.createSchema (#2787))
=======
>>>>>>> 853c43fc17 (GEOMESA-3102 Fix removal of user data in FileSystemDataStore.createSchema (#2787))
<<<<<<< HEAD
<<<<<<< HEAD
=======
>>>>>>> e0056031ea (GEOMESA-3113 Add system property to managing HBase deletes with visibilities (#2792))
=======
>>>>>>> 4f922d74c9 (GEOMESA-3102 Fix removal of user data in FileSystemDataStore.createSchema (#2787))
=======
>>>>>>> 15429a51ce (GEOMESA-3102 Fix removal of user data in FileSystemDataStore.createSchema (#2787))
<<<<<<< HEAD
<<<<<<< HEAD
=======
>>>>>>> e41e9641d2 (GEOMESA-3113 Add system property to managing HBase deletes with visibilities (#2792))
=======
>>>>>>> 3c4fc5a828 (GEOMESA-3113 Add system property to managing HBase deletes with visibilities (#2792))
=======
>>>>>>> c6079ecae5 (GEOMESA-3113 Add system property to managing HBase deletes with visibilities (#2792))
<<<<<<< HEAD
<<<<<<< HEAD
=======
>>>>>>> e0644f7991 (GEOMESA-3113 Add system property to managing HBase deletes with visibilities (#2792))
=======
>>>>>>> 9888cda97e (GEOMESA-3113 Add system property to managing HBase deletes with visibilities (#2792))
<<<<<<< HEAD
<<<<<<< HEAD
=======
>>>>>>> d1d11691fd (GEOMESA-3113 Add system property to managing HBase deletes with visibilities (#2792))
=======
>>>>>>> 58f72e76c (GEOMESA-3113 Add system property to managing HBase deletes with visibilities (#2792))
=======
>>>>>>> dba8cb28c4 (GEOMESA-3113 Add system property to managing HBase deletes with visibilities (#2792))
<<<<<<< HEAD
<<<<<<< HEAD
=======
>>>>>>> 5f0745e34b (GEOMESA-3113 Add system property to managing HBase deletes with visibilities (#2792))
=======
>>>>>>> 72415e208a (GEOMESA-3113 Add system property to managing HBase deletes with visibilities (#2792))
=======
>>>>>>> e6162be24a (GEOMESA-3113 Add system property to managing HBase deletes with visibilities (#2792))
<<<<<<< HEAD
<<<<<<< HEAD
=======
>>>>>>> f502df5b55 (GEOMESA-3102 Fix removal of user data in FileSystemDataStore.createSchema (#2787))
=======
>>>>>>> 26fc359a06 (GEOMESA-3113 Add system property to managing HBase deletes with visibilities (#2792))
=======
>>>>>>> 29dcc37810 (GEOMESA-3113 Add system property to managing HBase deletes with visibilities (#2792))
<<<<<<< HEAD
<<<<<<< HEAD
=======
>>>>>>> f18f027f66 (GEOMESA-3102 Fix removal of user data in FileSystemDataStore.createSchema (#2787))
=======
>>>>>>> e62505d539 (GEOMESA-3113 Add system property to managing HBase deletes with visibilities (#2792))
=======
>>>>>>> dbbcaa10d3 (GEOMESA-3113 Add system property to managing HBase deletes with visibilities (#2792))
<<<<<<< HEAD
<<<<<<< HEAD
=======
>>>>>>> 5742320897 (GEOMESA-3102 Fix removal of user data in FileSystemDataStore.createSchema (#2787))
=======
>>>>>>> bd17bd131 (GEOMESA-3102 Fix removal of user data in FileSystemDataStore.createSchema (#2787))
>>>>>>> c555446b8b (GEOMESA-3102 Fix removal of user data in FileSystemDataStore.createSchema (#2787))
=======
>>>>>>> 814abac33f (GEOMESA-3102 Fix removal of user data in FileSystemDataStore.createSchema (#2787))
<<<<<<< HEAD
<<<<<<< HEAD
=======
>>>>>>> f2b9fb3853 (GEOMESA-3113 Add system property to managing HBase deletes with visibilities (#2792))
=======
>>>>>>> c385f7994 (GEOMESA-3102 Fix removal of user data in FileSystemDataStore.createSchema (#2787))
=======
>>>>>>> 7f486255dd (GEOMESA-3102 Fix removal of user data in FileSystemDataStore.createSchema (#2787))
<<<<<<< HEAD
<<<<<<< HEAD
=======
>>>>>>> e639fc30a7 (GEOMESA-3113 Add system property to managing HBase deletes with visibilities (#2792))
=======
>>>>>>> 5c68fb7d1 (GEOMESA-3102 Fix removal of user data in FileSystemDataStore.createSchema (#2787))
=======
>>>>>>> 7e323ef52f (GEOMESA-3102 Fix removal of user data in FileSystemDataStore.createSchema (#2787))
<<<<<<< HEAD
<<<<<<< HEAD
=======
>>>>>>> 69a4e317d6 (GEOMESA-3113 Add system property to managing HBase deletes with visibilities (#2792))
=======
>>>>>>> a358de35a (GEOMESA-3102 Fix removal of user data in FileSystemDataStore.createSchema (#2787))
=======
>>>>>>> e9395c1096 (GEOMESA-3102 Fix removal of user data in FileSystemDataStore.createSchema (#2787))
<<<<<<< HEAD
<<<<<<< HEAD
=======
>>>>>>> 65460df3e6 (GEOMESA-3113 Add system property to managing HBase deletes with visibilities (#2792))
=======
>>>>>>> 2b62bcaeb (GEOMESA-3102 Fix removal of user data in FileSystemDataStore.createSchema (#2787))
=======
>>>>>>> 1682b13d94 (GEOMESA-3102 Fix removal of user data in FileSystemDataStore.createSchema (#2787))
<<<<<<< HEAD
<<<<<<< HEAD
=======
>>>>>>> 8999b3f6b9 (GEOMESA-3113 Add system property to managing HBase deletes with visibilities (#2792))
=======
>>>>>>> 75f3f455e (GEOMESA-3102 Fix removal of user data in FileSystemDataStore.createSchema (#2787))
=======
>>>>>>> abc395c346 (GEOMESA-3102 Fix removal of user data in FileSystemDataStore.createSchema (#2787))
<<<<<<< HEAD
<<<<<<< HEAD
=======
>>>>>>> 3c53246c9a (GEOMESA-3113 Add system property to managing HBase deletes with visibilities (#2792))
=======
>>>>>>> 8871b2b4b (GEOMESA-3102 Fix removal of user data in FileSystemDataStore.createSchema (#2787))
=======
>>>>>>> fd0ea5e670 (GEOMESA-3102 Fix removal of user data in FileSystemDataStore.createSchema (#2787))
<<<<<<< HEAD
<<<<<<< HEAD
=======
>>>>>>> fc179cb2d5 (GEOMESA-3113 Add system property to managing HBase deletes with visibilities (#2792))
=======
>>>>>>> 4f922d74c (GEOMESA-3102 Fix removal of user data in FileSystemDataStore.createSchema (#2787))
=======
>>>>>>> d2e8dad373 (GEOMESA-3102 Fix removal of user data in FileSystemDataStore.createSchema (#2787))
<<<<<<< HEAD
<<<<<<< HEAD
=======
>>>>>>> 9e74e1d9b4 (GEOMESA-3113 Add system property to managing HBase deletes with visibilities (#2792))
=======
>>>>>>> 526e71304c (GEOMESA-3102 Fix removal of user data in FileSystemDataStore.createSchema (#2787))
=======
>>>>>>> 6d4f75bcbb (GEOMESA-3102 Fix removal of user data in FileSystemDataStore.createSchema (#2787))
<<<<<<< HEAD
<<<<<<< HEAD
=======
>>>>>>> 0d4496a2f2 (GEOMESA-3113 Add system property to managing HBase deletes with visibilities (#2792))
=======
>>>>>>> 9c809610d5 (GEOMESA-3102 Fix removal of user data in FileSystemDataStore.createSchema (#2787))
=======
>>>>>>> ee2741585f (GEOMESA-3102 Fix removal of user data in FileSystemDataStore.createSchema (#2787))
<<<<<<< HEAD
<<<<<<< HEAD
=======
>>>>>>> 1506607bc9 (GEOMESA-3113 Add system property to managing HBase deletes with visibilities (#2792))
=======
>>>>>>> 9e842c2021 (GEOMESA-3102 Fix removal of user data in FileSystemDataStore.createSchema (#2787))
=======
>>>>>>> abe07966f6 (GEOMESA-3102 Fix removal of user data in FileSystemDataStore.createSchema (#2787))
<<<<<<< HEAD
<<<<<<< HEAD
=======
>>>>>>> de00bd1943 (GEOMESA-3113 Add system property to managing HBase deletes with visibilities (#2792))
=======
>>>>>>> 98ce8bad96 (GEOMESA-3102 Fix removal of user data in FileSystemDataStore.createSchema (#2787))
=======
>>>>>>> ffdb14e2a7 (GEOMESA-3102 Fix removal of user data in FileSystemDataStore.createSchema (#2787))
<<<<<<< HEAD
<<<<<<< HEAD
=======
>>>>>>> ea5f19f56b (GEOMESA-3113 Add system property to managing HBase deletes with visibilities (#2792))
=======
>>>>>>> 0fb40a8655 (GEOMESA-3113 Add system property to managing HBase deletes with visibilities (#2792))
=======
>>>>>>> c385f79943 (GEOMESA-3102 Fix removal of user data in FileSystemDataStore.createSchema (#2787))
=======
>>>>>>> 41631d23c9 (GEOMESA-3102 Fix removal of user data in FileSystemDataStore.createSchema (#2787))
=======
>>>>>>> bc833b1448 (GEOMESA-3113 Add system property to managing HBase deletes with visibilities (#2792))
=======
>>>>>>> 5c68fb7d18 (GEOMESA-3102 Fix removal of user data in FileSystemDataStore.createSchema (#2787))
=======
>>>>>>> 1e838e1657 (GEOMESA-3102 Fix removal of user data in FileSystemDataStore.createSchema (#2787))
=======
>>>>>>> a42015a87c (GEOMESA-3113 Add system property to managing HBase deletes with visibilities (#2792))
=======
>>>>>>> a358de35a8 (GEOMESA-3102 Fix removal of user data in FileSystemDataStore.createSchema (#2787))
=======
>>>>>>> ffca94ce17 (GEOMESA-3102 Fix removal of user data in FileSystemDataStore.createSchema (#2787))
=======
>>>>>>> ec072ceda6 (GEOMESA-3113 Add system property to managing HBase deletes with visibilities (#2792))
=======
>>>>>>> 2b62bcaeb4 (GEOMESA-3102 Fix removal of user data in FileSystemDataStore.createSchema (#2787))
=======
>>>>>>> 595d9061e3 (GEOMESA-3102 Fix removal of user data in FileSystemDataStore.createSchema (#2787))
=======
>>>>>>> 2d98e354b8 (GEOMESA-3113 Add system property to managing HBase deletes with visibilities (#2792))
=======
>>>>>>> 75f3f455ec (GEOMESA-3102 Fix removal of user data in FileSystemDataStore.createSchema (#2787))
=======
>>>>>>> 2f550bb2a7 (GEOMESA-3102 Fix removal of user data in FileSystemDataStore.createSchema (#2787))
=======
>>>>>>> 8781a5befd (GEOMESA-3113 Add system property to managing HBase deletes with visibilities (#2792))
=======
>>>>>>> 8871b2b4bc (GEOMESA-3102 Fix removal of user data in FileSystemDataStore.createSchema (#2787))
=======
>>>>>>> dfae24c155 (GEOMESA-3102 Fix removal of user data in FileSystemDataStore.createSchema (#2787))
=======
>>>>>>> a52516cf49 (GEOMESA-3113 Add system property to managing HBase deletes with visibilities (#2792))
=======
>>>>>>> 4f922d74c9 (GEOMESA-3102 Fix removal of user data in FileSystemDataStore.createSchema (#2787))
=======
>>>>>>> 7e8f76c0f9 (GEOMESA-3102 Fix removal of user data in FileSystemDataStore.createSchema (#2787))
=======
>>>>>>> 1351a5baa4 (GEOMESA-3113 Add system property to managing HBase deletes with visibilities (#2792))
=======
>>>>>>> 3c4fc5a828 (GEOMESA-3113 Add system property to managing HBase deletes with visibilities (#2792))
=======
>>>>>>> 857489f8a0 (GEOMESA-3113 Add system property to managing HBase deletes with visibilities (#2792))
=======
>>>>>>> 083bb9617b (GEOMESA-3113 Add system property to managing HBase deletes with visibilities (#2792))
=======
>>>>>>> 32aba52002 (GEOMESA-3113 Add system property to managing HBase deletes with visibilities (#2792))
=======
>>>>>>> 58f72e76c (GEOMESA-3113 Add system property to managing HBase deletes with visibilities (#2792))
=======
>>>>>>> 2c630f9360 (GEOMESA-3113 Add system property to managing HBase deletes with visibilities (#2792))
=======
>>>>>>> b69b6b3ea1 (GEOMESA-3113 Add system property to managing HBase deletes with visibilities (#2792))
=======
>>>>>>> 72415e208a (GEOMESA-3113 Add system property to managing HBase deletes with visibilities (#2792))
=======
>>>>>>> 665046a461 (GEOMESA-3113 Add system property to managing HBase deletes with visibilities (#2792))
=======
>>>>>>> 1382ba7fd3 (GEOMESA-3102 Fix removal of user data in FileSystemDataStore.createSchema (#2787))
=======
>>>>>>> 26fc359a06 (GEOMESA-3113 Add system property to managing HBase deletes with visibilities (#2792))
=======
>>>>>>> b1dea55b93 (GEOMESA-3113 Add system property to managing HBase deletes with visibilities (#2792))
=======
>>>>>>> 6157978769 (GEOMESA-3102 Fix removal of user data in FileSystemDataStore.createSchema (#2787))
=======
>>>>>>> e62505d539 (GEOMESA-3113 Add system property to managing HBase deletes with visibilities (#2792))
=======
>>>>>>> 7d3ca180ff (GEOMESA-3113 Add system property to managing HBase deletes with visibilities (#2792))
=======
>>>>>>> bd17bd131 (GEOMESA-3102 Fix removal of user data in FileSystemDataStore.createSchema (#2787))
>>>>>>> c555446b8b (GEOMESA-3102 Fix removal of user data in FileSystemDataStore.createSchema (#2787))
=======
>>>>>>> f9996d127e (GEOMESA-3102 Fix removal of user data in FileSystemDataStore.createSchema (#2787))
=======
>>>>>>> 797b02396b (GEOMESA-3113 Add system property to managing HBase deletes with visibilities (#2792))
=======
>>>>>>> 3171e7407d (GEOMESA-3102 Fix removal of user data in FileSystemDataStore.createSchema (#2787))
=======
>>>>>>> 237494b1cc (GEOMESA-3113 Add system property to managing HBase deletes with visibilities (#2792))
=======
>>>>>>> 9ec1f049a9 (GEOMESA-3102 Fix removal of user data in FileSystemDataStore.createSchema (#2787))
=======
>>>>>>> a0d6da1831 (GEOMESA-3113 Add system property to managing HBase deletes with visibilities (#2792))
=======
>>>>>>> 1faf0d16f2 (GEOMESA-3102 Fix removal of user data in FileSystemDataStore.createSchema (#2787))
=======
>>>>>>> e5413df04f (GEOMESA-3113 Add system property to managing HBase deletes with visibilities (#2792))
=======
>>>>>>> 8aa4f55ef6 (GEOMESA-3102 Fix removal of user data in FileSystemDataStore.createSchema (#2787))
=======
>>>>>>> 11addb1ce7 (GEOMESA-3113 Add system property to managing HBase deletes with visibilities (#2792))
=======
>>>>>>> 90d85d9b4b (GEOMESA-3102 Fix removal of user data in FileSystemDataStore.createSchema (#2787))
=======
>>>>>>> 1468e59829 (GEOMESA-3113 Add system property to managing HBase deletes with visibilities (#2792))
=======
>>>>>>> a618e2ba0a (GEOMESA-3102 Fix removal of user data in FileSystemDataStore.createSchema (#2787))
=======
>>>>>>> 65360f96a0 (GEOMESA-3113 Add system property to managing HBase deletes with visibilities (#2792))
=======
>>>>>>> 20dc993a76 (GEOMESA-3102 Fix removal of user data in FileSystemDataStore.createSchema (#2787))
=======
>>>>>>> bd6dd934cc (GEOMESA-3113 Add system property to managing HBase deletes with visibilities (#2792))
=======
>>>>>>> 495c744326 (GEOMESA-3102 Fix removal of user data in FileSystemDataStore.createSchema (#2787))
=======
>>>>>>> 49d3846b23 (GEOMESA-3113 Add system property to managing HBase deletes with visibilities (#2792))
=======
>>>>>>> 155d6a9469 (GEOMESA-3102 Fix removal of user data in FileSystemDataStore.createSchema (#2787))
=======
>>>>>>> e4ee051914 (GEOMESA-3113 Add system property to managing HBase deletes with visibilities (#2792))
=======
>>>>>>> bd17bd131 (GEOMESA-3102 Fix removal of user data in FileSystemDataStore.createSchema (#2787))
>>>>>>> c555446b8b (GEOMESA-3102 Fix removal of user data in FileSystemDataStore.createSchema (#2787))
=======
>>>>>>> ca22354dd (GEOMESA-3113 Add system property to managing HBase deletes with visibilities (#2792))
=======
<<<<<<< HEAD
>>>>>>> 73d82b731c (GEOMESA-3113 Add system property to managing HBase deletes with visibilities (#2792))
=======
>>>>>>> c385f7994 (GEOMESA-3102 Fix removal of user data in FileSystemDataStore.createSchema (#2787))
=======
<<<<<<< HEAD
>>>>>>> 957de96206 (GEOMESA-3102 Fix removal of user data in FileSystemDataStore.createSchema (#2787))
=======
>>>>>>> 2d758409c (GEOMESA-3113 Add system property to managing HBase deletes with visibilities (#2792))
=======
<<<<<<< HEAD
>>>>>>> 3c673847c5 (GEOMESA-3113 Add system property to managing HBase deletes with visibilities (#2792))
=======
>>>>>>> 5c68fb7d1 (GEOMESA-3102 Fix removal of user data in FileSystemDataStore.createSchema (#2787))
=======
<<<<<<< HEAD
>>>>>>> d03b76c630 (GEOMESA-3102 Fix removal of user data in FileSystemDataStore.createSchema (#2787))
=======
>>>>>>> 4a47c538b (GEOMESA-3113 Add system property to managing HBase deletes with visibilities (#2792))
=======
<<<<<<< HEAD
>>>>>>> ebbfa035a9 (GEOMESA-3113 Add system property to managing HBase deletes with visibilities (#2792))
=======
>>>>>>> a358de35a (GEOMESA-3102 Fix removal of user data in FileSystemDataStore.createSchema (#2787))
=======
<<<<<<< HEAD
>>>>>>> 0cb32b7425 (GEOMESA-3102 Fix removal of user data in FileSystemDataStore.createSchema (#2787))
=======
>>>>>>> 44b15e96d (GEOMESA-3113 Add system property to managing HBase deletes with visibilities (#2792))
=======
<<<<<<< HEAD
>>>>>>> ad7a284ebe (GEOMESA-3113 Add system property to managing HBase deletes with visibilities (#2792))
=======
>>>>>>> 2b62bcaeb (GEOMESA-3102 Fix removal of user data in FileSystemDataStore.createSchema (#2787))
=======
<<<<<<< HEAD
>>>>>>> b1b67a398d (GEOMESA-3102 Fix removal of user data in FileSystemDataStore.createSchema (#2787))
=======
>>>>>>> afc081190 (GEOMESA-3113 Add system property to managing HBase deletes with visibilities (#2792))
=======
<<<<<<< HEAD
>>>>>>> cbaecd4a0f (GEOMESA-3113 Add system property to managing HBase deletes with visibilities (#2792))
=======
>>>>>>> 75f3f455e (GEOMESA-3102 Fix removal of user data in FileSystemDataStore.createSchema (#2787))
=======
<<<<<<< HEAD
>>>>>>> a23109e63b (GEOMESA-3102 Fix removal of user data in FileSystemDataStore.createSchema (#2787))
=======
>>>>>>> 7a3d004ad (GEOMESA-3113 Add system property to managing HBase deletes with visibilities (#2792))
=======
<<<<<<< HEAD
>>>>>>> 9b169d0847 (GEOMESA-3113 Add system property to managing HBase deletes with visibilities (#2792))
=======
>>>>>>> 8871b2b4b (GEOMESA-3102 Fix removal of user data in FileSystemDataStore.createSchema (#2787))
=======
<<<<<<< HEAD
>>>>>>> eb98a9fb29 (GEOMESA-3102 Fix removal of user data in FileSystemDataStore.createSchema (#2787))
=======
>>>>>>> 91b0d6a88 (GEOMESA-3113 Add system property to managing HBase deletes with visibilities (#2792))
=======
<<<<<<< HEAD
>>>>>>> d539392ecd (GEOMESA-3113 Add system property to managing HBase deletes with visibilities (#2792))
=======
>>>>>>> 4f922d74c (GEOMESA-3102 Fix removal of user data in FileSystemDataStore.createSchema (#2787))
=======
<<<<<<< HEAD
>>>>>>> ef0351a168 (GEOMESA-3102 Fix removal of user data in FileSystemDataStore.createSchema (#2787))
=======
>>>>>>> 1b5719bd3 (GEOMESA-3113 Add system property to managing HBase deletes with visibilities (#2792))
=======
<<<<<<< HEAD
>>>>>>> d9ec67b278 (GEOMESA-3113 Add system property to managing HBase deletes with visibilities (#2792))
=======
>>>>>>> 526e71304c (GEOMESA-3102 Fix removal of user data in FileSystemDataStore.createSchema (#2787))
=======
<<<<<<< HEAD
>>>>>>> d61b3bb194 (GEOMESA-3102 Fix removal of user data in FileSystemDataStore.createSchema (#2787))
=======
>>>>>>> 074e4b10b9 (GEOMESA-3113 Add system property to managing HBase deletes with visibilities (#2792))
=======
<<<<<<< HEAD
>>>>>>> 0121c0dbad (GEOMESA-3113 Add system property to managing HBase deletes with visibilities (#2792))
=======
>>>>>>> 9c809610d5 (GEOMESA-3102 Fix removal of user data in FileSystemDataStore.createSchema (#2787))
=======
<<<<<<< HEAD
>>>>>>> e518bfb9e2 (GEOMESA-3102 Fix removal of user data in FileSystemDataStore.createSchema (#2787))
=======
>>>>>>> 0b22bfaa87 (GEOMESA-3113 Add system property to managing HBase deletes with visibilities (#2792))
=======
<<<<<<< HEAD
>>>>>>> 5a43551b62 (GEOMESA-3113 Add system property to managing HBase deletes with visibilities (#2792))
=======
>>>>>>> 9e842c2021 (GEOMESA-3102 Fix removal of user data in FileSystemDataStore.createSchema (#2787))
=======
<<<<<<< HEAD
>>>>>>> 93a4d60f28 (GEOMESA-3102 Fix removal of user data in FileSystemDataStore.createSchema (#2787))
=======
>>>>>>> 0f0dd6560e (GEOMESA-3113 Add system property to managing HBase deletes with visibilities (#2792))
=======
<<<<<<< HEAD
>>>>>>> 6bef55a1ea (GEOMESA-3113 Add system property to managing HBase deletes with visibilities (#2792))
=======
>>>>>>> 98ce8bad96 (GEOMESA-3102 Fix removal of user data in FileSystemDataStore.createSchema (#2787))
=======
<<<<<<< HEAD
>>>>>>> 48bb106de6 (GEOMESA-3102 Fix removal of user data in FileSystemDataStore.createSchema (#2787))
=======
>>>>>>> a8e7273bb0 (GEOMESA-3113 Add system property to managing HBase deletes with visibilities (#2792))
=======
<<<<<<< HEAD
>>>>>>> ce7c794944 (GEOMESA-3113 Add system property to managing HBase deletes with visibilities (#2792))
=======
>>>>>>> 39d46533eb (GEOMESA-3102 Fix removal of user data in FileSystemDataStore.createSchema (#2787))
=======
<<<<<<< HEAD
>>>>>>> 6f9b076410 (GEOMESA-3102 Fix removal of user data in FileSystemDataStore.createSchema (#2787))
=======
>>>>>>> 9da518fc54 (GEOMESA-3113 Add system property to managing HBase deletes with visibilities (#2792))
=======
<<<<<<< HEAD
>>>>>>> 39a2b37b5e (GEOMESA-3113 Add system property to managing HBase deletes with visibilities (#2792))
=======
>>>>>>> b52e5bb454 (GEOMESA-3102 Fix removal of user data in FileSystemDataStore.createSchema (#2787))
=======
<<<<<<< HEAD
>>>>>>> a0d25ffbaa (GEOMESA-3102 Fix removal of user data in FileSystemDataStore.createSchema (#2787))
=======
>>>>>>> 4bd5ce922d (GEOMESA-3113 Add system property to managing HBase deletes with visibilities (#2792))
=======
<<<<<<< HEAD
>>>>>>> 7f28e8e2e5 (GEOMESA-3113 Add system property to managing HBase deletes with visibilities (#2792))
=======
>>>>>>> cfd537e7af (GEOMESA-3102 Fix removal of user data in FileSystemDataStore.createSchema (#2787))
=======
<<<<<<< HEAD
>>>>>>> 9171ff5334 (GEOMESA-3102 Fix removal of user data in FileSystemDataStore.createSchema (#2787))
=======
>>>>>>> e17f495391 (GEOMESA-3113 Add system property to managing HBase deletes with visibilities (#2792))
=======
<<<<<<< HEAD
>>>>>>> f1f448d9e0 (GEOMESA-3113 Add system property to managing HBase deletes with visibilities (#2792))
=======
>>>>>>> 54709e3b06 (GEOMESA-3102 Fix removal of user data in FileSystemDataStore.createSchema (#2787))
=======
<<<<<<< HEAD
>>>>>>> abaa89e702 (GEOMESA-3102 Fix removal of user data in FileSystemDataStore.createSchema (#2787))
=======
>>>>>>> d857d34521 (GEOMESA-3113 Add system property to managing HBase deletes with visibilities (#2792))
=======
<<<<<<< HEAD
>>>>>>> 8524ef3a47 (GEOMESA-3113 Add system property to managing HBase deletes with visibilities (#2792))
=======
>>>>>>> 4100fa1ce8 (GEOMESA-3102 Fix removal of user data in FileSystemDataStore.createSchema (#2787))
=======
<<<<<<< HEAD
>>>>>>> b5ef5f3ffb (GEOMESA-3102 Fix removal of user data in FileSystemDataStore.createSchema (#2787))
=======
>>>>>>> b515d530a4 (GEOMESA-3113 Add system property to managing HBase deletes with visibilities (#2792))
=======
<<<<<<< HEAD
>>>>>>> a0d7cc16ab (GEOMESA-3113 Add system property to managing HBase deletes with visibilities (#2792))
=======
>>>>>>> 7ee0f1d494 (GEOMESA-3102 Fix removal of user data in FileSystemDataStore.createSchema (#2787))
=======
<<<<<<< HEAD
>>>>>>> ae19085932 (GEOMESA-3102 Fix removal of user data in FileSystemDataStore.createSchema (#2787))
=======
>>>>>>> 02fea6930b (GEOMESA-3113 Add system property to managing HBase deletes with visibilities (#2792))
=======
<<<<<<< HEAD
>>>>>>> cdbed26e09 (GEOMESA-3113 Add system property to managing HBase deletes with visibilities (#2792))
=======
=======
>>>>>>> bd17bd131e (GEOMESA-3102 Fix removal of user data in FileSystemDataStore.createSchema (#2787))
>>>>>>> a2a804586c (GEOMESA-3102 Fix removal of user data in FileSystemDataStore.createSchema (#2787))
=======
<<<<<<< HEAD
>>>>>>> 83a8ca6465 (GEOMESA-3102 Fix removal of user data in FileSystemDataStore.createSchema (#2787))
=======
=======
>>>>>>> a773c6ef65 (GEOMESA-3113 Add system property to managing HBase deletes with visibilities (#2792))
<<<<<<< HEAD
>>>>>>> 34fd077439 (GEOMESA-3113 Add system property to managing HBase deletes with visibilities (#2792))
=======
=======
>>>>>>> c385f79943 (GEOMESA-3102 Fix removal of user data in FileSystemDataStore.createSchema (#2787))
=======
>>>>>>> 2d01ec0bc0 (GEOMESA-3102 Fix removal of user data in FileSystemDataStore.createSchema (#2787))
<<<<<<< HEAD
>>>>>>> f58f87b448 (GEOMESA-3102 Fix removal of user data in FileSystemDataStore.createSchema (#2787))
=======
=======
>>>>>>> b586a90765 (GEOMESA-3113 Add system property to managing HBase deletes with visibilities (#2792))
<<<<<<< HEAD
>>>>>>> 7196beb2e1 (GEOMESA-3113 Add system property to managing HBase deletes with visibilities (#2792))
=======
=======
>>>>>>> 5c68fb7d18 (GEOMESA-3102 Fix removal of user data in FileSystemDataStore.createSchema (#2787))
=======
>>>>>>> 8a9d3df519 (GEOMESA-3102 Fix removal of user data in FileSystemDataStore.createSchema (#2787))
<<<<<<< HEAD
>>>>>>> b4cc9497d5 (GEOMESA-3102 Fix removal of user data in FileSystemDataStore.createSchema (#2787))
=======
=======
>>>>>>> ba177f9f13 (GEOMESA-3113 Add system property to managing HBase deletes with visibilities (#2792))
<<<<<<< HEAD
>>>>>>> df9cd4f22d (GEOMESA-3113 Add system property to managing HBase deletes with visibilities (#2792))
=======
=======
>>>>>>> a358de35a8 (GEOMESA-3102 Fix removal of user data in FileSystemDataStore.createSchema (#2787))
=======
>>>>>>> 08ee2fed57 (GEOMESA-3102 Fix removal of user data in FileSystemDataStore.createSchema (#2787))
>>>>>>> c0b0589a14 (GEOMESA-3102 Fix removal of user data in FileSystemDataStore.createSchema (#2787))
=======
>>>>>>> 2b9cd40059 (GEOMESA-3113 Add system property to managing HBase deletes with visibilities (#2792))
=======
>>>>>>> 8a07c6167f (GEOMESA-3102 Fix removal of user data in FileSystemDataStore.createSchema (#2787))
=======
=======
>>>>>>> aca68ab685 (GEOMESA-3113 Add system property to managing HBase deletes with visibilities (#2792))
>>>>>>> 1b0d520fde (GEOMESA-3113 Add system property to managing HBase deletes with visibilities (#2792))
=======
>>>>>>> 871350de06 (GEOMESA-3102 Fix removal of user data in FileSystemDataStore.createSchema (#2787))
=======
=======
>>>>>>> fd0793971d (GEOMESA-3113 Add system property to managing HBase deletes with visibilities (#2792))
>>>>>>> 9bcc7591e5 (GEOMESA-3113 Add system property to managing HBase deletes with visibilities (#2792))
=======
>>>>>>> 2ec7d64046 (GEOMESA-3102 Fix removal of user data in FileSystemDataStore.createSchema (#2787))
=======
=======
>>>>>>> e0056031ea (GEOMESA-3113 Add system property to managing HBase deletes with visibilities (#2792))
>>>>>>> 344200f1df (GEOMESA-3113 Add system property to managing HBase deletes with visibilities (#2792))
=======
>>>>>>> 8317120c9b (GEOMESA-3102 Fix removal of user data in FileSystemDataStore.createSchema (#2787))
=======
=======
>>>>>>> e41e9641d2 (GEOMESA-3113 Add system property to managing HBase deletes with visibilities (#2792))
>>>>>>> 98e607d2fa (GEOMESA-3113 Add system property to managing HBase deletes with visibilities (#2792))
=======
>>>>>>> 5d46ff705f (GEOMESA-3113 Add system property to managing HBase deletes with visibilities (#2792))
=======
=======
>>>>>>> e0644f7991 (GEOMESA-3113 Add system property to managing HBase deletes with visibilities (#2792))
>>>>>>> 69016fbbb7 (GEOMESA-3113 Add system property to managing HBase deletes with visibilities (#2792))
=======
>>>>>>> d73ae82492 (GEOMESA-3113 Add system property to managing HBase deletes with visibilities (#2792))
=======
>>>>>>> d1d11691fd (GEOMESA-3113 Add system property to managing HBase deletes with visibilities (#2792))
=======
=======
>>>>>>> 5f0745e34b (GEOMESA-3113 Add system property to managing HBase deletes with visibilities (#2792))
>>>>>>> eeb8ab478a (GEOMESA-3113 Add system property to managing HBase deletes with visibilities (#2792))
=======
>>>>>>> a8b2b56cbd (GEOMESA-3113 Add system property to managing HBase deletes with visibilities (#2792))
=======
=======
>>>>>>> f502df5b55 (GEOMESA-3102 Fix removal of user data in FileSystemDataStore.createSchema (#2787))
>>>>>>> 27eec0d076 (GEOMESA-3102 Fix removal of user data in FileSystemDataStore.createSchema (#2787))
=======
>>>>>>> afcf525d7d (GEOMESA-3113 Add system property to managing HBase deletes with visibilities (#2792))
=======
=======
>>>>>>> f18f027f66 (GEOMESA-3102 Fix removal of user data in FileSystemDataStore.createSchema (#2787))
>>>>>>> e11c16ba5d (GEOMESA-3102 Fix removal of user data in FileSystemDataStore.createSchema (#2787))
=======
>>>>>>> 00494e0bcf (GEOMESA-3113 Add system property to managing HBase deletes with visibilities (#2792))
=======
>>>>>>> 5742320897 (GEOMESA-3102 Fix removal of user data in FileSystemDataStore.createSchema (#2787))
=======
=======
>>>>>>> f2b9fb3853 (GEOMESA-3113 Add system property to managing HBase deletes with visibilities (#2792))
>>>>>>> c43c29e91c (GEOMESA-3113 Add system property to managing HBase deletes with visibilities (#2792))
=======
>>>>>>> 78439fc2da (GEOMESA-3102 Fix removal of user data in FileSystemDataStore.createSchema (#2787))
=======
=======
>>>>>>> e639fc30a7 (GEOMESA-3113 Add system property to managing HBase deletes with visibilities (#2792))
>>>>>>> 64c0e084b5 (GEOMESA-3113 Add system property to managing HBase deletes with visibilities (#2792))
=======
>>>>>>> 4b926d9ec6 (GEOMESA-3102 Fix removal of user data in FileSystemDataStore.createSchema (#2787))
=======
=======
>>>>>>> 69a4e317d6 (GEOMESA-3113 Add system property to managing HBase deletes with visibilities (#2792))
>>>>>>> cdb062d5e9 (GEOMESA-3113 Add system property to managing HBase deletes with visibilities (#2792))
=======
>>>>>>> a738799968 (GEOMESA-3102 Fix removal of user data in FileSystemDataStore.createSchema (#2787))
=======
=======
>>>>>>> 65460df3e6 (GEOMESA-3113 Add system property to managing HBase deletes with visibilities (#2792))
>>>>>>> 3d40465720 (GEOMESA-3113 Add system property to managing HBase deletes with visibilities (#2792))
=======
>>>>>>> f22bf41646 (GEOMESA-3102 Fix removal of user data in FileSystemDataStore.createSchema (#2787))
=======
=======
>>>>>>> 8999b3f6b9 (GEOMESA-3113 Add system property to managing HBase deletes with visibilities (#2792))
>>>>>>> ffcb7ff3ae (GEOMESA-3113 Add system property to managing HBase deletes with visibilities (#2792))
=======
>>>>>>> 4b0c56ce56 (GEOMESA-3102 Fix removal of user data in FileSystemDataStore.createSchema (#2787))
=======
=======
>>>>>>> 3c53246c9a (GEOMESA-3113 Add system property to managing HBase deletes with visibilities (#2792))
>>>>>>> 9ac1262e54 (GEOMESA-3113 Add system property to managing HBase deletes with visibilities (#2792))
=======
>>>>>>> 1a90b3062a (GEOMESA-3102 Fix removal of user data in FileSystemDataStore.createSchema (#2787))
=======
=======
>>>>>>> fc179cb2d5 (GEOMESA-3113 Add system property to managing HBase deletes with visibilities (#2792))
>>>>>>> 043e029470 (GEOMESA-3113 Add system property to managing HBase deletes with visibilities (#2792))
=======
>>>>>>> c8431d18e4 (GEOMESA-3102 Fix removal of user data in FileSystemDataStore.createSchema (#2787))
=======
=======
>>>>>>> 9e74e1d9b4 (GEOMESA-3113 Add system property to managing HBase deletes with visibilities (#2792))
>>>>>>> 9dd4a005eb (GEOMESA-3113 Add system property to managing HBase deletes with visibilities (#2792))
=======
>>>>>>> 4d1cac1d60 (GEOMESA-3102 Fix removal of user data in FileSystemDataStore.createSchema (#2787))
=======
=======
>>>>>>> 0d4496a2f2 (GEOMESA-3113 Add system property to managing HBase deletes with visibilities (#2792))
>>>>>>> cb8df4c76b (GEOMESA-3113 Add system property to managing HBase deletes with visibilities (#2792))
=======
>>>>>>> 265d436467 (GEOMESA-3102 Fix removal of user data in FileSystemDataStore.createSchema (#2787))
=======
=======
>>>>>>> 1506607bc9 (GEOMESA-3113 Add system property to managing HBase deletes with visibilities (#2792))
>>>>>>> 7ce9817488 (GEOMESA-3113 Add system property to managing HBase deletes with visibilities (#2792))
=======
>>>>>>> 02465f5f58 (GEOMESA-3102 Fix removal of user data in FileSystemDataStore.createSchema (#2787))
=======
=======
>>>>>>> de00bd1943 (GEOMESA-3113 Add system property to managing HBase deletes with visibilities (#2792))
>>>>>>> 8eb59bcc3c (GEOMESA-3113 Add system property to managing HBase deletes with visibilities (#2792))
=======
>>>>>>> 6f245b0cc5 (GEOMESA-3102 Fix removal of user data in FileSystemDataStore.createSchema (#2787))
=======
=======
>>>>>>> ea5f19f56b (GEOMESA-3113 Add system property to managing HBase deletes with visibilities (#2792))
>>>>>>> 07c698faf4 (GEOMESA-3113 Add system property to managing HBase deletes with visibilities (#2792))
        val config = new JobConf(conf)
>>>>>>> 1a21a3c30 (GEOMESA-3113 Add system property to managing HBase deletes with visibilities (#2792))
<<<<<<< HEAD
=======
>>>>>>> 85d211ca2 (GEOMESA-3102 Fix removal of user data in FileSystemDataStore.createSchema (#2787))
=======
=======
        val config = new JobConf(conf)
>>>>>>> 1a21a3c30 (GEOMESA-3113 Add system property to managing HBase deletes with visibilities (#2792))
>>>>>>> 595c43086 (GEOMESA-3113 Add system property to managing HBase deletes with visibilities (#2792))
=======
>>>>>>> locationtech-main
=======
        val config = new Configuration(conf)
>>>>>>> 9bde42cc4 (GEOMESA-3102 Fix removal of user data in FileSystemDataStore.createSchema (#2787))
>>>>>>> 3baf74fa6 (GEOMESA-3102 Fix removal of user data in FileSystemDataStore.createSchema (#2787))
>>>>>>> 0d3cbc99a (GEOMESA-3102 Fix removal of user data in FileSystemDataStore.createSchema (#2787))
<<<<<<< HEAD
<<<<<<< HEAD
<<<<<<< HEAD
<<<<<<< HEAD
<<<<<<< HEAD
<<<<<<< HEAD
<<<<<<< HEAD
<<<<<<< HEAD
<<<<<<< HEAD
<<<<<<< HEAD
<<<<<<< HEAD
<<<<<<< HEAD
<<<<<<< HEAD
<<<<<<< HEAD
<<<<<<< HEAD
<<<<<<< HEAD
<<<<<<< HEAD
<<<<<<< HEAD
<<<<<<< HEAD
<<<<<<< HEAD
<<<<<<< HEAD
<<<<<<< HEAD
<<<<<<< HEAD
<<<<<<< HEAD
<<<<<<< HEAD
<<<<<<< HEAD
<<<<<<< HEAD
<<<<<<< HEAD
<<<<<<< HEAD
<<<<<<< HEAD
<<<<<<< HEAD
<<<<<<< HEAD
<<<<<<< HEAD
<<<<<<< HEAD
<<<<<<< HEAD
<<<<<<< HEAD
<<<<<<< HEAD
<<<<<<< HEAD
<<<<<<< HEAD
<<<<<<< HEAD
<<<<<<< HEAD
<<<<<<< HEAD
<<<<<<< HEAD
<<<<<<< HEAD
<<<<<<< HEAD
<<<<<<< HEAD
<<<<<<< HEAD
<<<<<<< HEAD
<<<<<<< HEAD
<<<<<<< HEAD
<<<<<<< HEAD
<<<<<<< HEAD
<<<<<<< HEAD
<<<<<<< HEAD
<<<<<<< HEAD
<<<<<<< HEAD
<<<<<<< HEAD
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
>>>>>>> 9d7ed88fa8 (GEOMESA-3102 Fix removal of user data in FileSystemDataStore.createSchema (#2787))
=======
>>>>>>> 5a7f44513 (GEOMESA-3102 Fix removal of user data in FileSystemDataStore.createSchema (#2787))
=======
>>>>>>> ce07ef89f (GEOMESA-3102 Fix removal of user data in FileSystemDataStore.createSchema (#2787))
=======
>>>>>>> locationtech-main
=======
>>>>>>> cfbdafd9de (GEOMESA-3102 Fix removal of user data in FileSystemDataStore.createSchema (#2787))
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
>>>>>>> 5a7f445137 (GEOMESA-3102 Fix removal of user data in FileSystemDataStore.createSchema (#2787))
>>>>>>> 8146fed90c (GEOMESA-3102 Fix removal of user data in FileSystemDataStore.createSchema (#2787))
=======
>>>>>>> 682f10a0e9 (GEOMESA-3102 Fix removal of user data in FileSystemDataStore.createSchema (#2787))
=======
>>>>>>> 3c372ed1b4 (GEOMESA-3102 Fix removal of user data in FileSystemDataStore.createSchema (#2787))
=======
>>>>>>> c84a3b17a6 (GEOMESA-3102 Fix removal of user data in FileSystemDataStore.createSchema (#2787))
=======
>>>>>>> 8a07c6167f (GEOMESA-3102 Fix removal of user data in FileSystemDataStore.createSchema (#2787))
=======
>>>>>>> 894b6a1a15 (GEOMESA-3102 Fix removal of user data in FileSystemDataStore.createSchema (#2787))
=======
>>>>>>> 68098a00c3 (GEOMESA-3102 Fix removal of user data in FileSystemDataStore.createSchema (#2787))
=======
>>>>>>> 5742320897 (GEOMESA-3102 Fix removal of user data in FileSystemDataStore.createSchema (#2787))
=======
>>>>>>> 73cb7a0517 (GEOMESA-3102 Fix removal of user data in FileSystemDataStore.createSchema (#2787))
=======
>>>>>>> eda8d4d014 (GEOMESA-3102 Fix removal of user data in FileSystemDataStore.createSchema (#2787))
=======
>>>>>>> f22bf41646 (GEOMESA-3102 Fix removal of user data in FileSystemDataStore.createSchema (#2787))
=======
>>>>>>> f1cbf28b81 (GEOMESA-3102 Fix removal of user data in FileSystemDataStore.createSchema (#2787))
=======
>>>>>>> 027b4d7d58 (GEOMESA-3102 Fix removal of user data in FileSystemDataStore.createSchema (#2787))
=======
>>>>>>> 4d1cac1d60 (GEOMESA-3102 Fix removal of user data in FileSystemDataStore.createSchema (#2787))
=======
>>>>>>> 0c44f82169 (GEOMESA-3102 Fix removal of user data in FileSystemDataStore.createSchema (#2787))
=======
>>>>>>> 7fd052e7d2 (GEOMESA-3102 Fix removal of user data in FileSystemDataStore.createSchema (#2787))
=======
>>>>>>> 628458842d (GEOMESA-3102 Fix removal of user data in FileSystemDataStore.createSchema (#2787))
=======
<<<<<<< HEAD
<<<<<<< HEAD
>>>>>>> 44bdcb9e58 (GEOMESA-3102 Fix removal of user data in FileSystemDataStore.createSchema (#2787))
=======
>>>>>>> 28be12542f (GEOMESA-3102 Fix removal of user data in FileSystemDataStore.createSchema (#2787))
=======
<<<<<<< HEAD
<<<<<<< HEAD
>>>>>>> 814abac33f (GEOMESA-3102 Fix removal of user data in FileSystemDataStore.createSchema (#2787))
=======
>>>>>>> c57a8a5ffe (GEOMESA-3102 Fix removal of user data in FileSystemDataStore.createSchema (#2787))
=======
<<<<<<< HEAD
<<<<<<< HEAD
>>>>>>> e2aaf740bf (GEOMESA-3102 Fix removal of user data in FileSystemDataStore.createSchema (#2787))
=======
>>>>>>> 1682b13d94 (GEOMESA-3102 Fix removal of user data in FileSystemDataStore.createSchema (#2787))
=======
<<<<<<< HEAD
<<<<<<< HEAD
>>>>>>> 4bb5bbc637 (GEOMESA-3102 Fix removal of user data in FileSystemDataStore.createSchema (#2787))
=======
>>>>>>> 84f529c13e (GEOMESA-3102 Fix removal of user data in FileSystemDataStore.createSchema (#2787))
=======
<<<<<<< HEAD
<<<<<<< HEAD
>>>>>>> 6d4f75bcbb (GEOMESA-3102 Fix removal of user data in FileSystemDataStore.createSchema (#2787))
=======
>>>>>>> 5d88c18b90 (GEOMESA-3102 Fix removal of user data in FileSystemDataStore.createSchema (#2787))
=======
<<<<<<< HEAD
>>>>>>> a317af9cbb (GEOMESA-3102 Fix removal of user data in FileSystemDataStore.createSchema (#2787))
=======
>>>>>>> 595d9061e3 (GEOMESA-3102 Fix removal of user data in FileSystemDataStore.createSchema (#2787))
=======
>>>>>>> 98efbcd374 (GEOMESA-3102 Fix removal of user data in FileSystemDataStore.createSchema (#2787))
=======
>>>>>>> ddc69d17c8 (GEOMESA-3102 Fix removal of user data in FileSystemDataStore.createSchema (#2787))
=======
>>>>>>> f9996d127e (GEOMESA-3102 Fix removal of user data in FileSystemDataStore.createSchema (#2787))
=======
>>>>>>> 5d89f9f58f (GEOMESA-3102 Fix removal of user data in FileSystemDataStore.createSchema (#2787))
=======
>>>>>>> 8c775c1126 (GEOMESA-3102 Fix removal of user data in FileSystemDataStore.createSchema (#2787))
=======
>>>>>>> b1b67a398d (GEOMESA-3102 Fix removal of user data in FileSystemDataStore.createSchema (#2787))
=======
>>>>>>> 2544a6c80c (GEOMESA-3102 Fix removal of user data in FileSystemDataStore.createSchema (#2787))
=======
>>>>>>> 9513a4f9a1 (GEOMESA-3102 Fix removal of user data in FileSystemDataStore.createSchema (#2787))
=======
>>>>>>> d61b3bb194 (GEOMESA-3102 Fix removal of user data in FileSystemDataStore.createSchema (#2787))
=======
>>>>>>> a13c4c4fa7 (GEOMESA-3102 Fix removal of user data in FileSystemDataStore.createSchema (#2787))
=======
>>>>>>> 01ee16a4c0 (GEOMESA-3102 Fix removal of user data in FileSystemDataStore.createSchema (#2787))
=======
>>>>>>> 6f9b076410 (GEOMESA-3102 Fix removal of user data in FileSystemDataStore.createSchema (#2787))
=======
>>>>>>> ade0b3801f (GEOMESA-3102 Fix removal of user data in FileSystemDataStore.createSchema (#2787))
=======
>>>>>>> 75e5f895f3 (GEOMESA-3102 Fix removal of user data in FileSystemDataStore.createSchema (#2787))
=======
>>>>>>> 83a8ca6465 (GEOMESA-3102 Fix removal of user data in FileSystemDataStore.createSchema (#2787))
=======
>>>>>>> 68e92adc9f (GEOMESA-3102 Fix removal of user data in FileSystemDataStore.createSchema (#2787))
=======
=======
>>>>>>> 7fd052e7d2 (GEOMESA-3102 Fix removal of user data in FileSystemDataStore.createSchema (#2787))
>>>>>>> a05bcef080 (GEOMESA-3102 Fix removal of user data in FileSystemDataStore.createSchema (#2787))
=======
=======
>>>>>>> 8a07c6167f (GEOMESA-3102 Fix removal of user data in FileSystemDataStore.createSchema (#2787))
=======
>>>>>>> 44bdcb9e58 (GEOMESA-3102 Fix removal of user data in FileSystemDataStore.createSchema (#2787))
=======
>>>>>>> 894b6a1a15 (GEOMESA-3102 Fix removal of user data in FileSystemDataStore.createSchema (#2787))
=======
>>>>>>> 68098a00c3 (GEOMESA-3102 Fix removal of user data in FileSystemDataStore.createSchema (#2787))
=======
>>>>>>> 814abac33f (GEOMESA-3102 Fix removal of user data in FileSystemDataStore.createSchema (#2787))
=======
>>>>>>> 5742320897 (GEOMESA-3102 Fix removal of user data in FileSystemDataStore.createSchema (#2787))
=======
>>>>>>> 73cb7a0517 (GEOMESA-3102 Fix removal of user data in FileSystemDataStore.createSchema (#2787))
=======
>>>>>>> e2aaf740bf (GEOMESA-3102 Fix removal of user data in FileSystemDataStore.createSchema (#2787))
=======
>>>>>>> eda8d4d014 (GEOMESA-3102 Fix removal of user data in FileSystemDataStore.createSchema (#2787))
=======
>>>>>>> f22bf41646 (GEOMESA-3102 Fix removal of user data in FileSystemDataStore.createSchema (#2787))
=======
>>>>>>> 4bb5bbc637 (GEOMESA-3102 Fix removal of user data in FileSystemDataStore.createSchema (#2787))
=======
>>>>>>> f1cbf28b81 (GEOMESA-3102 Fix removal of user data in FileSystemDataStore.createSchema (#2787))
=======
>>>>>>> 027b4d7d58 (GEOMESA-3102 Fix removal of user data in FileSystemDataStore.createSchema (#2787))
=======
>>>>>>> 6d4f75bcbb (GEOMESA-3102 Fix removal of user data in FileSystemDataStore.createSchema (#2787))
=======
>>>>>>> 4d1cac1d60 (GEOMESA-3102 Fix removal of user data in FileSystemDataStore.createSchema (#2787))
=======
>>>>>>> 0c44f82169 (GEOMESA-3102 Fix removal of user data in FileSystemDataStore.createSchema (#2787))
>>>>>>> 5a7f445137 (GEOMESA-3102 Fix removal of user data in FileSystemDataStore.createSchema (#2787))
=======
>>>>>>> ce07ef89fe (GEOMESA-3102 Fix removal of user data in FileSystemDataStore.createSchema (#2787))
=======
<<<<<<< HEAD
<<<<<<< HEAD
<<<<<<< HEAD
<<<<<<< HEAD
<<<<<<< HEAD
<<<<<<< HEAD
=======
>>>>>>> 894b6a1a15 (GEOMESA-3102 Fix removal of user data in FileSystemDataStore.createSchema (#2787))
=======
>>>>>>> 68098a00c3 (GEOMESA-3102 Fix removal of user data in FileSystemDataStore.createSchema (#2787))
>>>>>>> d9cabf401c (GEOMESA-3102 Fix removal of user data in FileSystemDataStore.createSchema (#2787))
=======
>>>>>>> 1230d64006 (GEOMESA-3102 Fix removal of user data in FileSystemDataStore.createSchema (#2787))
=======
<<<<<<< HEAD
<<<<<<< HEAD
<<<<<<< HEAD
<<<<<<< HEAD
<<<<<<< HEAD
<<<<<<< HEAD
=======
>>>>>>> 48dcb085fa (GEOMESA-3102 Fix removal of user data in FileSystemDataStore.createSchema (#2787))
=======
>>>>>>> 687ba5655c (GEOMESA-3102 Fix removal of user data in FileSystemDataStore.createSchema (#2787))
=======
>>>>>>> 8309b2b098 (GEOMESA-3102 Fix removal of user data in FileSystemDataStore.createSchema (#2787))
=======
>>>>>>> c57a8a5ffe (GEOMESA-3102 Fix removal of user data in FileSystemDataStore.createSchema (#2787))
=======
>>>>>>> 48dcb085fa (GEOMESA-3102 Fix removal of user data in FileSystemDataStore.createSchema (#2787))
=======
>>>>>>> 687ba5655c (GEOMESA-3102 Fix removal of user data in FileSystemDataStore.createSchema (#2787))
=======
>>>>>>> 8309b2b098 (GEOMESA-3102 Fix removal of user data in FileSystemDataStore.createSchema (#2787))
=======
>>>>>>> 5d89f9f58f (GEOMESA-3102 Fix removal of user data in FileSystemDataStore.createSchema (#2787))
=======
>>>>>>> 5742320897 (GEOMESA-3102 Fix removal of user data in FileSystemDataStore.createSchema (#2787))
=======
>>>>>>> 73cb7a0517 (GEOMESA-3102 Fix removal of user data in FileSystemDataStore.createSchema (#2787))
=======
>>>>>>> 48dcb085fa (GEOMESA-3102 Fix removal of user data in FileSystemDataStore.createSchema (#2787))
=======
>>>>>>> 687ba5655c (GEOMESA-3102 Fix removal of user data in FileSystemDataStore.createSchema (#2787))
=======
>>>>>>> 8309b2b098 (GEOMESA-3102 Fix removal of user data in FileSystemDataStore.createSchema (#2787))
=======
>>>>>>> c57a8a5ffe (GEOMESA-3102 Fix removal of user data in FileSystemDataStore.createSchema (#2787))
=======
>>>>>>> 48dcb085fa (GEOMESA-3102 Fix removal of user data in FileSystemDataStore.createSchema (#2787))
=======
>>>>>>> 687ba5655c (GEOMESA-3102 Fix removal of user data in FileSystemDataStore.createSchema (#2787))
=======
>>>>>>> 8309b2b098 (GEOMESA-3102 Fix removal of user data in FileSystemDataStore.createSchema (#2787))
=======
>>>>>>> 5a7f44513 (GEOMESA-3102 Fix removal of user data in FileSystemDataStore.createSchema (#2787))
>>>>>>> 0645a0bbaf (GEOMESA-3102 Fix removal of user data in FileSystemDataStore.createSchema (#2787))
=======
<<<<<<< HEAD
<<<<<<< HEAD
<<<<<<< HEAD
<<<<<<< HEAD
<<<<<<< HEAD
<<<<<<< HEAD
=======
>>>>>>> 73cb7a0517 (GEOMESA-3102 Fix removal of user data in FileSystemDataStore.createSchema (#2787))
=======
>>>>>>> f1cbf28b81 (GEOMESA-3102 Fix removal of user data in FileSystemDataStore.createSchema (#2787))
>>>>>>> ce07ef89f (GEOMESA-3102 Fix removal of user data in FileSystemDataStore.createSchema (#2787))
=======
>>>>>>> a030b80514 (GEOMESA-3102 Fix removal of user data in FileSystemDataStore.createSchema (#2787))
=======
<<<<<<< HEAD
<<<<<<< HEAD
<<<<<<< HEAD
<<<<<<< HEAD
=======
>>>>>>> 0c44f82169 (GEOMESA-3102 Fix removal of user data in FileSystemDataStore.createSchema (#2787))
>>>>>>> d3ef2e8e78 (GEOMESA-3102 Fix removal of user data in FileSystemDataStore.createSchema (#2787))
=======
>>>>>>> c843b1759d (GEOMESA-3102 Fix removal of user data in FileSystemDataStore.createSchema (#2787))
=======
<<<<<<< HEAD
<<<<<<< HEAD
>>>>>>> a2a804586c (GEOMESA-3102 Fix removal of user data in FileSystemDataStore.createSchema (#2787))
=======
=======
>>>>>>> 5a7f445137 (GEOMESA-3102 Fix removal of user data in FileSystemDataStore.createSchema (#2787))
>>>>>>> 29de027418 (GEOMESA-3102 Fix removal of user data in FileSystemDataStore.createSchema (#2787))
=======
<<<<<<< HEAD
<<<<<<< HEAD
=======
>>>>>>> 44bdcb9e58 (GEOMESA-3102 Fix removal of user data in FileSystemDataStore.createSchema (#2787))
=======
>>>>>>> d9cabf401c (GEOMESA-3102 Fix removal of user data in FileSystemDataStore.createSchema (#2787))
=======
>>>>>>> 28be12542f (GEOMESA-3102 Fix removal of user data in FileSystemDataStore.createSchema (#2787))
<<<<<<< HEAD
<<<<<<< HEAD
=======
>>>>>>> 814abac33f (GEOMESA-3102 Fix removal of user data in FileSystemDataStore.createSchema (#2787))
=======
>>>>>>> c57a8a5ffe (GEOMESA-3102 Fix removal of user data in FileSystemDataStore.createSchema (#2787))
<<<<<<< HEAD
<<<<<<< HEAD
=======
>>>>>>> f1cbf28b81 (GEOMESA-3102 Fix removal of user data in FileSystemDataStore.createSchema (#2787))
=======
>>>>>>> ce07ef89f (GEOMESA-3102 Fix removal of user data in FileSystemDataStore.createSchema (#2787))
=======
>>>>>>> 4bb5bbc637 (GEOMESA-3102 Fix removal of user data in FileSystemDataStore.createSchema (#2787))
<<<<<<< HEAD
<<<<<<< HEAD
=======
>>>>>>> 5d88c18b90 (GEOMESA-3102 Fix removal of user data in FileSystemDataStore.createSchema (#2787))
=======
>>>>>>> 98efbcd374 (GEOMESA-3102 Fix removal of user data in FileSystemDataStore.createSchema (#2787))
=======
>>>>>>> d9cabf401c (GEOMESA-3102 Fix removal of user data in FileSystemDataStore.createSchema (#2787))
=======
>>>>>>> ddc69d17c8 (GEOMESA-3102 Fix removal of user data in FileSystemDataStore.createSchema (#2787))
=======
>>>>>>> f9996d127e (GEOMESA-3102 Fix removal of user data in FileSystemDataStore.createSchema (#2787))
=======
>>>>>>> 5d89f9f58f (GEOMESA-3102 Fix removal of user data in FileSystemDataStore.createSchema (#2787))
=======
>>>>>>> ce07ef89f (GEOMESA-3102 Fix removal of user data in FileSystemDataStore.createSchema (#2787))
=======
>>>>>>> 2544a6c80c (GEOMESA-3102 Fix removal of user data in FileSystemDataStore.createSchema (#2787))
=======
>>>>>>> a13c4c4fa7 (GEOMESA-3102 Fix removal of user data in FileSystemDataStore.createSchema (#2787))
=======
>>>>>>> d3ef2e8e78 (GEOMESA-3102 Fix removal of user data in FileSystemDataStore.createSchema (#2787))
=======
>>>>>>> ade0b3801f (GEOMESA-3102 Fix removal of user data in FileSystemDataStore.createSchema (#2787))
=======
>>>>>>> 75e5f895f3 (GEOMESA-3102 Fix removal of user data in FileSystemDataStore.createSchema (#2787))
=======
>>>>>>> a2a804586c (GEOMESA-3102 Fix removal of user data in FileSystemDataStore.createSchema (#2787))
=======
>>>>>>> 83a8ca6465 (GEOMESA-3102 Fix removal of user data in FileSystemDataStore.createSchema (#2787))
=======
>>>>>>> 68e92adc9f (GEOMESA-3102 Fix removal of user data in FileSystemDataStore.createSchema (#2787))
=======
=======
>>>>>>> 44bdcb9e58 (GEOMESA-3102 Fix removal of user data in FileSystemDataStore.createSchema (#2787))
>>>>>>> 894b6a1a15 (GEOMESA-3102 Fix removal of user data in FileSystemDataStore.createSchema (#2787))
=======
>>>>>>> 68098a00c3 (GEOMESA-3102 Fix removal of user data in FileSystemDataStore.createSchema (#2787))
=======
=======
>>>>>>> 814abac33f (GEOMESA-3102 Fix removal of user data in FileSystemDataStore.createSchema (#2787))
>>>>>>> 5742320897 (GEOMESA-3102 Fix removal of user data in FileSystemDataStore.createSchema (#2787))
=======
>>>>>>> 73cb7a0517 (GEOMESA-3102 Fix removal of user data in FileSystemDataStore.createSchema (#2787))
=======
>>>>>>> f1cbf28b81 (GEOMESA-3102 Fix removal of user data in FileSystemDataStore.createSchema (#2787))
=======
=======
>>>>>>> 5d88c18b90 (GEOMESA-3102 Fix removal of user data in FileSystemDataStore.createSchema (#2787))
>>>>>>> 0c44f82169 (GEOMESA-3102 Fix removal of user data in FileSystemDataStore.createSchema (#2787))
>>>>>>> aa627812d (GEOMESA-3102 Fix removal of user data in FileSystemDataStore.createSchema (#2787))
=======
=======
        val config = new JobConf(conf)
>>>>>>> 1a21a3c30 (GEOMESA-3113 Add system property to managing HBase deletes with visibilities (#2792))
>>>>>>> 45dca3e07 (GEOMESA-3113 Add system property to managing HBase deletes with visibilities (#2792))
<<<<<<< HEAD
<<<<<<< HEAD
<<<<<<< HEAD
<<<<<<< HEAD
<<<<<<< HEAD
<<<<<<< HEAD
<<<<<<< HEAD
<<<<<<< HEAD
<<<<<<< HEAD
<<<<<<< HEAD
<<<<<<< HEAD
<<<<<<< HEAD
<<<<<<< HEAD
<<<<<<< HEAD
<<<<<<< HEAD
<<<<<<< HEAD
<<<<<<< HEAD
<<<<<<< HEAD
<<<<<<< HEAD
<<<<<<< HEAD
<<<<<<< HEAD
<<<<<<< HEAD
<<<<<<< HEAD
<<<<<<< HEAD
<<<<<<< HEAD
<<<<<<< HEAD
<<<<<<< HEAD
<<<<<<< HEAD
<<<<<<< HEAD
<<<<<<< HEAD
<<<<<<< HEAD
<<<<<<< HEAD
<<<<<<< HEAD
<<<<<<< HEAD
<<<<<<< HEAD
<<<<<<< HEAD
<<<<<<< HEAD
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
>>>>>>> 6f73f22005 (GEOMESA-3113 Add system property to managing HBase deletes with visibilities (#2792))
>>>>>>> 32aba52002 (GEOMESA-3113 Add system property to managing HBase deletes with visibilities (#2792))
=======
>>>>>>> 2f550bb2a7 (GEOMESA-3102 Fix removal of user data in FileSystemDataStore.createSchema (#2787))
=======
>>>>>>> 2d98e354b8 (GEOMESA-3113 Add system property to managing HBase deletes with visibilities (#2792))
=======
>>>>>>> 41631d23c9 (GEOMESA-3102 Fix removal of user data in FileSystemDataStore.createSchema (#2787))
=======
>>>>>>> 0fb40a8655 (GEOMESA-3113 Add system property to managing HBase deletes with visibilities (#2792))
=======
>>>>>>> ffcb7ff3ae (GEOMESA-3113 Add system property to managing HBase deletes with visibilities (#2792))
=======
>>>>>>> 4b0c56ce56 (GEOMESA-3102 Fix removal of user data in FileSystemDataStore.createSchema (#2787))
=======
>>>>>>> cb8df4c76b (GEOMESA-3113 Add system property to managing HBase deletes with visibilities (#2792))
=======
>>>>>>> 265d436467 (GEOMESA-3102 Fix removal of user data in FileSystemDataStore.createSchema (#2787))
=======
>>>>>>> 7f486255dd (GEOMESA-3102 Fix removal of user data in FileSystemDataStore.createSchema (#2787))
=======
>>>>>>> 8999b3f6b9 (GEOMESA-3113 Add system property to managing HBase deletes with visibilities (#2792))
=======
<<<<<<< HEAD
<<<<<<< HEAD
>>>>>>> abc395c346 (GEOMESA-3102 Fix removal of user data in FileSystemDataStore.createSchema (#2787))
=======
>>>>>>> 0d4496a2f2 (GEOMESA-3113 Add system property to managing HBase deletes with visibilities (#2792))
=======
<<<<<<< HEAD
<<<<<<< HEAD
>>>>>>> ee2741585f (GEOMESA-3102 Fix removal of user data in FileSystemDataStore.createSchema (#2787))
=======
>>>>>>> 957de96206 (GEOMESA-3102 Fix removal of user data in FileSystemDataStore.createSchema (#2787))
=======
>>>>>>> cbaecd4a0f (GEOMESA-3113 Add system property to managing HBase deletes with visibilities (#2792))
=======
>>>>>>> a23109e63b (GEOMESA-3102 Fix removal of user data in FileSystemDataStore.createSchema (#2787))
=======
>>>>>>> 0121c0dbad (GEOMESA-3113 Add system property to managing HBase deletes with visibilities (#2792))
=======
>>>>>>> e518bfb9e2 (GEOMESA-3102 Fix removal of user data in FileSystemDataStore.createSchema (#2787))
=======
>>>>>>> 39a2b37b5e (GEOMESA-3113 Add system property to managing HBase deletes with visibilities (#2792))
=======
>>>>>>> a0d25ffbaa (GEOMESA-3102 Fix removal of user data in FileSystemDataStore.createSchema (#2787))
=======
>>>>>>> 34fd077439 (GEOMESA-3113 Add system property to managing HBase deletes with visibilities (#2792))
=======
>>>>>>> f58f87b448 (GEOMESA-3102 Fix removal of user data in FileSystemDataStore.createSchema (#2787))
=======
>>>>>>> 1b0d520fde (GEOMESA-3113 Add system property to managing HBase deletes with visibilities (#2792))
=======
>>>>>>> 871350de06 (GEOMESA-3102 Fix removal of user data in FileSystemDataStore.createSchema (#2787))
=======
>>>>>>> d73ae82492 (GEOMESA-3113 Add system property to managing HBase deletes with visibilities (#2792))
=======
=======
>>>>>>> 7f486255dd (GEOMESA-3102 Fix removal of user data in FileSystemDataStore.createSchema (#2787))
>>>>>>> 78439fc2da (GEOMESA-3102 Fix removal of user data in FileSystemDataStore.createSchema (#2787))
=======
=======
>>>>>>> ffcb7ff3ae (GEOMESA-3113 Add system property to managing HBase deletes with visibilities (#2792))
=======
>>>>>>> abc395c346 (GEOMESA-3102 Fix removal of user data in FileSystemDataStore.createSchema (#2787))
=======
>>>>>>> 4b0c56ce56 (GEOMESA-3102 Fix removal of user data in FileSystemDataStore.createSchema (#2787))
=======
>>>>>>> cb8df4c76b (GEOMESA-3113 Add system property to managing HBase deletes with visibilities (#2792))
=======
>>>>>>> ee2741585f (GEOMESA-3102 Fix removal of user data in FileSystemDataStore.createSchema (#2787))
=======
>>>>>>> 265d436467 (GEOMESA-3102 Fix removal of user data in FileSystemDataStore.createSchema (#2787))
>>>>>>> 6f73f22005 (GEOMESA-3113 Add system property to managing HBase deletes with visibilities (#2792))
=======
>>>>>>> 038b4ca087 (GEOMESA-3102 Fix removal of user data in FileSystemDataStore.createSchema (#2787))
=======
<<<<<<< HEAD
<<<<<<< HEAD
=======
>>>>>>> 97a911d79c (GEOMESA-3113 Add system property to managing HBase deletes with visibilities (#2792))
=======
>>>>>>> 33d2777a8a (GEOMESA-3102 Fix removal of user data in FileSystemDataStore.createSchema (#2787))
>>>>>>> location-main
=======
=======
>>>>>>> dc17df6c0 (GEOMESA-3113 Add system property to managing HBase deletes with visibilities (#2792))
=======
<<<<<<< HEAD
<<<<<<< HEAD
>>>>>>> 0cdf3f267 (GEOMESA-3113 Add system property to managing HBase deletes with visibilities (#2792))
=======
<<<<<<< HEAD
=======
>>>>>>> 0cdf3f2672 (GEOMESA-3113 Add system property to managing HBase deletes with visibilities (#2792))
=======
<<<<<<< HEAD
=======
>>>>>>> 3571a41838 (GEOMESA-3113 Add system property to managing HBase deletes with visibilities (#2792))
<<<<<<< HEAD
<<<<<<< HEAD
<<<<<<< HEAD
<<<<<<< HEAD
<<<<<<< HEAD
=======
>>>>>>> 78439fc2da (GEOMESA-3102 Fix removal of user data in FileSystemDataStore.createSchema (#2787))
=======
>>>>>>> ffcb7ff3ae (GEOMESA-3113 Add system property to managing HBase deletes with visibilities (#2792))
>>>>>>> 97a911d79c (GEOMESA-3113 Add system property to managing HBase deletes with visibilities (#2792))
=======
>>>>>>> 33d2777a8a (GEOMESA-3102 Fix removal of user data in FileSystemDataStore.createSchema (#2787))
=======
<<<<<<< HEAD
<<<<<<< HEAD
<<<<<<< HEAD
<<<<<<< HEAD
=======
>>>>>>> 4b0c56ce56 (GEOMESA-3102 Fix removal of user data in FileSystemDataStore.createSchema (#2787))
>>>>>>> a773c6ef65 (GEOMESA-3113 Add system property to managing HBase deletes with visibilities (#2792))
=======
>>>>>>> 2d01ec0bc0 (GEOMESA-3102 Fix removal of user data in FileSystemDataStore.createSchema (#2787))
=======
<<<<<<< HEAD
<<<<<<< HEAD
>>>>>>> aca68ab685 (GEOMESA-3113 Add system property to managing HBase deletes with visibilities (#2792))
=======
>>>>>>> f7952edd5f (GEOMESA-3102 Fix removal of user data in FileSystemDataStore.createSchema (#2787))
=======
<<<<<<< HEAD
=======
>>>>>>> 6f73f22005 (GEOMESA-3113 Add system property to managing HBase deletes with visibilities (#2792))
>>>>>>> 9888cda97e (GEOMESA-3113 Add system property to managing HBase deletes with visibilities (#2792))
=======
=======
>>>>>>> 7f486255dd (GEOMESA-3102 Fix removal of user data in FileSystemDataStore.createSchema (#2787))
=======
>>>>>>> 97a911d79c (GEOMESA-3113 Add system property to managing HBase deletes with visibilities (#2792))
=======
>>>>>>> 8999b3f6b9 (GEOMESA-3113 Add system property to managing HBase deletes with visibilities (#2792))
=======
>>>>>>> abc395c346 (GEOMESA-3102 Fix removal of user data in FileSystemDataStore.createSchema (#2787))
=======
>>>>>>> 957de96206 (GEOMESA-3102 Fix removal of user data in FileSystemDataStore.createSchema (#2787))
=======
>>>>>>> 97a911d79c (GEOMESA-3113 Add system property to managing HBase deletes with visibilities (#2792))
=======
>>>>>>> cbaecd4a0f (GEOMESA-3113 Add system property to managing HBase deletes with visibilities (#2792))
=======
>>>>>>> a23109e63b (GEOMESA-3102 Fix removal of user data in FileSystemDataStore.createSchema (#2787))
=======
>>>>>>> a773c6ef65 (GEOMESA-3113 Add system property to managing HBase deletes with visibilities (#2792))
=======
>>>>>>> 34fd077439 (GEOMESA-3113 Add system property to managing HBase deletes with visibilities (#2792))
=======
>>>>>>> f58f87b448 (GEOMESA-3102 Fix removal of user data in FileSystemDataStore.createSchema (#2787))
=======
>>>>>>> aca68ab685 (GEOMESA-3113 Add system property to managing HBase deletes with visibilities (#2792))
=======
>>>>>>> 1b0d520fde (GEOMESA-3113 Add system property to managing HBase deletes with visibilities (#2792))
=======
>>>>>>> 871350de06 (GEOMESA-3102 Fix removal of user data in FileSystemDataStore.createSchema (#2787))
=======
>>>>>>> 6f73f22005 (GEOMESA-3113 Add system property to managing HBase deletes with visibilities (#2792))
>>>>>>> 9888cda97e (GEOMESA-3113 Add system property to managing HBase deletes with visibilities (#2792))
=======
=======
>>>>>>> 7f486255dd (GEOMESA-3102 Fix removal of user data in FileSystemDataStore.createSchema (#2787))
=======
>>>>>>> 97a911d79c (GEOMESA-3113 Add system property to managing HBase deletes with visibilities (#2792))
=======
>>>>>>> 8999b3f6b9 (GEOMESA-3113 Add system property to managing HBase deletes with visibilities (#2792))
=======
>>>>>>> abc395c346 (GEOMESA-3102 Fix removal of user data in FileSystemDataStore.createSchema (#2787))
=======
>>>>>>> dc17df6c0 (GEOMESA-3113 Add system property to managing HBase deletes with visibilities (#2792))
=======
>>>>>>> 0cdf3f2672 (GEOMESA-3113 Add system property to managing HBase deletes with visibilities (#2792))
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
>>>>>>> e6162be24a (GEOMESA-3113 Add system property to managing HBase deletes with visibilities (#2792))
=======
>>>>>>> 665046a461 (GEOMESA-3113 Add system property to managing HBase deletes with visibilities (#2792))
=======
>>>>>>> 8524ef3a47 (GEOMESA-3113 Add system property to managing HBase deletes with visibilities (#2792))
=======
>>>>>>> cdbed26e09 (GEOMESA-3113 Add system property to managing HBase deletes with visibilities (#2792))
=======
=======
>>>>>>> e6162be24a (GEOMESA-3113 Add system property to managing HBase deletes with visibilities (#2792))
>>>>>>> a8b2b56cbd (GEOMESA-3113 Add system property to managing HBase deletes with visibilities (#2792))
>>>>>>> 8037623548 (GEOMESA-3113 Add system property to managing HBase deletes with visibilities (#2792))
=======
=======
=======
=======
>>>>>>> c385f79943 (GEOMESA-3102 Fix removal of user data in FileSystemDataStore.createSchema (#2787))
<<<<<<< HEAD
<<<<<<< HEAD
<<<<<<< HEAD
<<<<<<< HEAD
<<<<<<< HEAD
<<<<<<< HEAD
=======
>>>>>>> f7952edd5f (GEOMESA-3102 Fix removal of user data in FileSystemDataStore.createSchema (#2787))
=======
>>>>>>> 2f550bb2a7 (GEOMESA-3102 Fix removal of user data in FileSystemDataStore.createSchema (#2787))
=======
>>>>>>> f58f87b448 (GEOMESA-3102 Fix removal of user data in FileSystemDataStore.createSchema (#2787))
=======
=======
>>>>>>> f7952edd5f (GEOMESA-3102 Fix removal of user data in FileSystemDataStore.createSchema (#2787))
>>>>>>> 871350de06 (GEOMESA-3102 Fix removal of user data in FileSystemDataStore.createSchema (#2787))
=======
=======
=======
>>>>>>> 75f3f455ec (GEOMESA-3102 Fix removal of user data in FileSystemDataStore.createSchema (#2787))
<<<<<<< HEAD
<<<<<<< HEAD
<<<<<<< HEAD
<<<<<<< HEAD
<<<<<<< HEAD
<<<<<<< HEAD
=======
>>>>>>> 871350de06 (GEOMESA-3102 Fix removal of user data in FileSystemDataStore.createSchema (#2787))
=======
>>>>>>> a8b2b56cbd (GEOMESA-3113 Add system property to managing HBase deletes with visibilities (#2792))
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
>>>>>>> a8b2b56cbd (GEOMESA-3113 Add system property to managing HBase deletes with visibilities (#2792))
=======
>>>>>>> 00494e0bcf (GEOMESA-3113 Add system property to managing HBase deletes with visibilities (#2792))
=======
>>>>>>> 3d40465720 (GEOMESA-3113 Add system property to managing HBase deletes with visibilities (#2792))
=======
>>>>>>> 9dd4a005eb (GEOMESA-3113 Add system property to managing HBase deletes with visibilities (#2792))
=======
=======
<<<<<<< HEAD
>>>>>>> e6162be24a (GEOMESA-3113 Add system property to managing HBase deletes with visibilities (#2792))
<<<<<<< HEAD
<<<<<<< HEAD
=======
>>>>>>> dbbcaa10d3 (GEOMESA-3113 Add system property to managing HBase deletes with visibilities (#2792))
=======
>>>>>>> 65460df3e6 (GEOMESA-3113 Add system property to managing HBase deletes with visibilities (#2792))
<<<<<<< HEAD
<<<<<<< HEAD
=======
>>>>>>> 9e74e1d9b4 (GEOMESA-3113 Add system property to managing HBase deletes with visibilities (#2792))
=======
=======
<<<<<<< HEAD
>>>>>>> 665046a461 (GEOMESA-3113 Add system property to managing HBase deletes with visibilities (#2792))
=======
>>>>>>> 7d3ca180ff (GEOMESA-3113 Add system property to managing HBase deletes with visibilities (#2792))
=======
>>>>>>> ad7a284ebe (GEOMESA-3113 Add system property to managing HBase deletes with visibilities (#2792))
=======
>>>>>>> d9ec67b278 (GEOMESA-3113 Add system property to managing HBase deletes with visibilities (#2792))
=======
>>>>>>> a8b2b56cbd (GEOMESA-3113 Add system property to managing HBase deletes with visibilities (#2792))
=======
=======
>>>>>>> dbbcaa10d3 (GEOMESA-3113 Add system property to managing HBase deletes with visibilities (#2792))
>>>>>>> 00494e0bcf (GEOMESA-3113 Add system property to managing HBase deletes with visibilities (#2792))
=======
>>>>>>> 3d40465720 (GEOMESA-3113 Add system property to managing HBase deletes with visibilities (#2792))
=======
=======
>>>>>>> 9e74e1d9b4 (GEOMESA-3113 Add system property to managing HBase deletes with visibilities (#2792))
>>>>>>> 9dd4a005eb (GEOMESA-3113 Add system property to managing HBase deletes with visibilities (#2792))
>>>>>>> de3e57f03 (GEOMESA-3113 Add system property to managing HBase deletes with visibilities (#2792))
=======
=======
>>>>>>> 72415e208a (GEOMESA-3113 Add system property to managing HBase deletes with visibilities (#2792))
<<<<<<< HEAD
<<<<<<< HEAD
<<<<<<< HEAD
<<<<<<< HEAD
<<<<<<< HEAD
<<<<<<< HEAD
<<<<<<< HEAD
=======
>>>>>>> a8b2b56cbd (GEOMESA-3113 Add system property to managing HBase deletes with visibilities (#2792))
=======
>>>>>>> 00494e0bcf (GEOMESA-3113 Add system property to managing HBase deletes with visibilities (#2792))
>>>>>>> c14e106409 (GEOMESA-3113 Add system property to managing HBase deletes with visibilities (#2792))
=======
=======
=======
>>>>>>> e5413df04f (GEOMESA-3113 Add system property to managing HBase deletes with visibilities (#2792))
<<<<<<< HEAD
<<<<<<< HEAD
<<<<<<< HEAD
<<<<<<< HEAD
<<<<<<< HEAD
<<<<<<< HEAD
=======
>>>>>>> 3d40465720 (GEOMESA-3113 Add system property to managing HBase deletes with visibilities (#2792))
=======
>>>>>>> 9dd4a005eb (GEOMESA-3113 Add system property to managing HBase deletes with visibilities (#2792))
=======
>>>>>>> e4ee051914 (GEOMESA-3113 Add system property to managing HBase deletes with visibilities (#2792))
=======
>>>>>>> 65460df3e6 (GEOMESA-3113 Add system property to managing HBase deletes with visibilities (#2792))
<<<<<<< HEAD
<<<<<<< HEAD
=======
>>>>>>> 9dd4a005eb (GEOMESA-3113 Add system property to managing HBase deletes with visibilities (#2792))
=======
=======
>>>>>>> e4ee051914 (GEOMESA-3113 Add system property to managing HBase deletes with visibilities (#2792))
>>>>>>> 9e74e1d9b4 (GEOMESA-3113 Add system property to managing HBase deletes with visibilities (#2792))
<<<<<<< HEAD
=======
>>>>>>> ad7a284ebe (GEOMESA-3113 Add system property to managing HBase deletes with visibilities (#2792))
=======
=======
>>>>>>> e4ee051914 (GEOMESA-3113 Add system property to managing HBase deletes with visibilities (#2792))
>>>>>>> d9ec67b278 (GEOMESA-3113 Add system property to managing HBase deletes with visibilities (#2792))
=======
>>>>>>> 3d40465720 (GEOMESA-3113 Add system property to managing HBase deletes with visibilities (#2792))
=======
>>>>>>> 9dd4a005eb (GEOMESA-3113 Add system property to managing HBase deletes with visibilities (#2792))
>>>>>>> 803762354 (GEOMESA-3113 Add system property to managing HBase deletes with visibilities (#2792))
=======
<<<<<<< HEAD
>>>>>>> e62505d539 (GEOMESA-3113 Add system property to managing HBase deletes with visibilities (#2792))
<<<<<<< HEAD
>>>>>>> 3226e92d8e (GEOMESA-3113 Add system property to managing HBase deletes with visibilities (#2792))
=======
=======
=======
=======
=======
>>>>>>> c385f7994 (GEOMESA-3102 Fix removal of user data in FileSystemDataStore.createSchema (#2787))
<<<<<<< HEAD
<<<<<<< HEAD
<<<<<<< HEAD
<<<<<<< HEAD
=======
>>>>>>> 3d40465720 (GEOMESA-3113 Add system property to managing HBase deletes with visibilities (#2792))
>>>>>>> 3171e7407d (GEOMESA-3102 Fix removal of user data in FileSystemDataStore.createSchema (#2787))
<<<<<<< HEAD
>>>>>>> 038b4ca087 (GEOMESA-3102 Fix removal of user data in FileSystemDataStore.createSchema (#2787))
=======
=======
=======
>>>>>>> 44b15e96d (GEOMESA-3113 Add system property to managing HBase deletes with visibilities (#2792))
<<<<<<< HEAD
<<<<<<< HEAD
<<<<<<< HEAD
<<<<<<< HEAD
=======
>>>>>>> 4b0c56ce56 (GEOMESA-3102 Fix removal of user data in FileSystemDataStore.createSchema (#2787))
>>>>>>> e5413df04f (GEOMESA-3113 Add system property to managing HBase deletes with visibilities (#2792))
<<<<<<< HEAD
>>>>>>> d38e17d229 (GEOMESA-3113 Add system property to managing HBase deletes with visibilities (#2792))
=======
=======
=======
=======
=======
>>>>>>> 75f3f455e (GEOMESA-3102 Fix removal of user data in FileSystemDataStore.createSchema (#2787))
<<<<<<< HEAD
<<<<<<< HEAD
<<<<<<< HEAD
<<<<<<< HEAD
=======
>>>>>>> 9dd4a005eb (GEOMESA-3113 Add system property to managing HBase deletes with visibilities (#2792))
>>>>>>> 20dc993a76 (GEOMESA-3102 Fix removal of user data in FileSystemDataStore.createSchema (#2787))
<<<<<<< HEAD
>>>>>>> 33d2777a8a (GEOMESA-3102 Fix removal of user data in FileSystemDataStore.createSchema (#2787))
=======
=======
=======
>>>>>>> 1b5719bd3 (GEOMESA-3113 Add system property to managing HBase deletes with visibilities (#2792))
>>>>>>> e4ee051914 (GEOMESA-3113 Add system property to managing HBase deletes with visibilities (#2792))
>>>>>>> 260d67442f (GEOMESA-3113 Add system property to managing HBase deletes with visibilities (#2792))
=======
>>>>>>> d857d34521 (GEOMESA-3113 Add system property to managing HBase deletes with visibilities (#2792))
<<<<<<< HEAD
<<<<<<< HEAD
=======
>>>>>>> cdbed26e09 (GEOMESA-3113 Add system property to managing HBase deletes with visibilities (#2792))
=======
>>>>>>> 8037623548 (GEOMESA-3113 Add system property to managing HBase deletes with visibilities (#2792))
=======
>>>>>>> 02fea6930b (GEOMESA-3113 Add system property to managing HBase deletes with visibilities (#2792))
<<<<<<< HEAD
<<<<<<< HEAD
=======
>>>>>>> 2d01ec0bc0 (GEOMESA-3102 Fix removal of user data in FileSystemDataStore.createSchema (#2787))
=======
>>>>>>> f7952edd5f (GEOMESA-3102 Fix removal of user data in FileSystemDataStore.createSchema (#2787))
<<<<<<< HEAD
<<<<<<< HEAD
=======
>>>>>>> c14e106409 (GEOMESA-3113 Add system property to managing HBase deletes with visibilities (#2792))
>>>>>>> e6162be24a (GEOMESA-3113 Add system property to managing HBase deletes with visibilities (#2792))
=======
>>>>>>> c14e106409 (GEOMESA-3113 Add system property to managing HBase deletes with visibilities (#2792))
=======
=======
>>>>>>> 803762354 (GEOMESA-3113 Add system property to managing HBase deletes with visibilities (#2792))
=======
<<<<<<< HEAD
<<<<<<< HEAD
<<<<<<< HEAD
>>>>>>> e62505d539 (GEOMESA-3113 Add system property to managing HBase deletes with visibilities (#2792))
<<<<<<< HEAD
>>>>>>> 3226e92d8e (GEOMESA-3113 Add system property to managing HBase deletes with visibilities (#2792))
<<<<<<< HEAD
>>>>>>> dbbcaa10d3 (GEOMESA-3113 Add system property to managing HBase deletes with visibilities (#2792))
=======
=======
=======
=======
=======
=======
>>>>>>> c385f7994 (GEOMESA-3102 Fix removal of user data in FileSystemDataStore.createSchema (#2787))
=======
>>>>>>> 65460df3e6 (GEOMESA-3113 Add system property to managing HBase deletes with visibilities (#2792))
<<<<<<< HEAD
>>>>>>> 3171e7407d (GEOMESA-3102 Fix removal of user data in FileSystemDataStore.createSchema (#2787))
<<<<<<< HEAD
>>>>>>> 038b4ca087 (GEOMESA-3102 Fix removal of user data in FileSystemDataStore.createSchema (#2787))
<<<<<<< HEAD
>>>>>>> 7f486255dd (GEOMESA-3102 Fix removal of user data in FileSystemDataStore.createSchema (#2787))
=======
=======
=======
=======
>>>>>>> 44b15e96d (GEOMESA-3113 Add system property to managing HBase deletes with visibilities (#2792))
=======
>>>>>>> abc395c346 (GEOMESA-3102 Fix removal of user data in FileSystemDataStore.createSchema (#2787))
<<<<<<< HEAD
>>>>>>> e5413df04f (GEOMESA-3113 Add system property to managing HBase deletes with visibilities (#2792))
<<<<<<< HEAD
>>>>>>> d38e17d229 (GEOMESA-3113 Add system property to managing HBase deletes with visibilities (#2792))
<<<<<<< HEAD
>>>>>>> 65460df3e6 (GEOMESA-3113 Add system property to managing HBase deletes with visibilities (#2792))
=======
=======
=======
=======
=======
=======
>>>>>>> 75f3f455e (GEOMESA-3102 Fix removal of user data in FileSystemDataStore.createSchema (#2787))
=======
>>>>>>> 9e74e1d9b4 (GEOMESA-3113 Add system property to managing HBase deletes with visibilities (#2792))
<<<<<<< HEAD
>>>>>>> 20dc993a76 (GEOMESA-3102 Fix removal of user data in FileSystemDataStore.createSchema (#2787))
<<<<<<< HEAD
>>>>>>> 33d2777a8a (GEOMESA-3102 Fix removal of user data in FileSystemDataStore.createSchema (#2787))
<<<<<<< HEAD
>>>>>>> abc395c346 (GEOMESA-3102 Fix removal of user data in FileSystemDataStore.createSchema (#2787))
=======
=======
=======
=======
>>>>>>> 1b5719bd3 (GEOMESA-3113 Add system property to managing HBase deletes with visibilities (#2792))
>>>>>>> e4ee051914 (GEOMESA-3113 Add system property to managing HBase deletes with visibilities (#2792))
>>>>>>> 260d67442f (GEOMESA-3113 Add system property to managing HBase deletes with visibilities (#2792))
>>>>>>> 9e74e1d9b4 (GEOMESA-3113 Add system property to managing HBase deletes with visibilities (#2792))
=======
>>>>>>> 7d705cac10 (GEOMESA-3113 Add system property to managing HBase deletes with visibilities (#2792))
=======
>>>>>>> 8037623548 (GEOMESA-3113 Add system property to managing HBase deletes with visibilities (#2792))
=======
>>>>>>> 5d545f24ed (GEOMESA-3113 Add system property to managing HBase deletes with visibilities (#2792))
=======
>>>>>>> 41631d23c9 (GEOMESA-3102 Fix removal of user data in FileSystemDataStore.createSchema (#2787))
=======
>>>>>>> 2f550bb2a7 (GEOMESA-3102 Fix removal of user data in FileSystemDataStore.createSchema (#2787))
=======
>>>>>>> c14e106409 (GEOMESA-3113 Add system property to managing HBase deletes with visibilities (#2792))
>>>>>>> 665046a461 (GEOMESA-3113 Add system property to managing HBase deletes with visibilities (#2792))
=======
>>>>>>> c14e106409 (GEOMESA-3113 Add system property to managing HBase deletes with visibilities (#2792))
=======
=======
>>>>>>> 803762354 (GEOMESA-3113 Add system property to managing HBase deletes with visibilities (#2792))
=======
<<<<<<< HEAD
>>>>>>> e62505d539 (GEOMESA-3113 Add system property to managing HBase deletes with visibilities (#2792))
<<<<<<< HEAD
>>>>>>> 3226e92d8e (GEOMESA-3113 Add system property to managing HBase deletes with visibilities (#2792))
<<<<<<< HEAD
>>>>>>> 7d3ca180ff (GEOMESA-3113 Add system property to managing HBase deletes with visibilities (#2792))
=======
=======
=======
=======
=======
=======
>>>>>>> c385f7994 (GEOMESA-3102 Fix removal of user data in FileSystemDataStore.createSchema (#2787))
=======
>>>>>>> ad7a284ebe (GEOMESA-3113 Add system property to managing HBase deletes with visibilities (#2792))
>>>>>>> 3171e7407d (GEOMESA-3102 Fix removal of user data in FileSystemDataStore.createSchema (#2787))
<<<<<<< HEAD
>>>>>>> 038b4ca087 (GEOMESA-3102 Fix removal of user data in FileSystemDataStore.createSchema (#2787))
<<<<<<< HEAD
>>>>>>> 957de96206 (GEOMESA-3102 Fix removal of user data in FileSystemDataStore.createSchema (#2787))
=======
=======
=======
=======
>>>>>>> 44b15e96d (GEOMESA-3113 Add system property to managing HBase deletes with visibilities (#2792))
=======
>>>>>>> a23109e63b (GEOMESA-3102 Fix removal of user data in FileSystemDataStore.createSchema (#2787))
>>>>>>> e5413df04f (GEOMESA-3113 Add system property to managing HBase deletes with visibilities (#2792))
<<<<<<< HEAD
>>>>>>> d38e17d229 (GEOMESA-3113 Add system property to managing HBase deletes with visibilities (#2792))
<<<<<<< HEAD
>>>>>>> ad7a284ebe (GEOMESA-3113 Add system property to managing HBase deletes with visibilities (#2792))
=======
=======
=======
=======
=======
=======
>>>>>>> 75f3f455e (GEOMESA-3102 Fix removal of user data in FileSystemDataStore.createSchema (#2787))
=======
>>>>>>> d9ec67b278 (GEOMESA-3113 Add system property to managing HBase deletes with visibilities (#2792))
>>>>>>> 20dc993a76 (GEOMESA-3102 Fix removal of user data in FileSystemDataStore.createSchema (#2787))
<<<<<<< HEAD
>>>>>>> 33d2777a8a (GEOMESA-3102 Fix removal of user data in FileSystemDataStore.createSchema (#2787))
<<<<<<< HEAD
>>>>>>> a23109e63b (GEOMESA-3102 Fix removal of user data in FileSystemDataStore.createSchema (#2787))
=======
=======
=======
=======
>>>>>>> 1b5719bd3 (GEOMESA-3113 Add system property to managing HBase deletes with visibilities (#2792))
>>>>>>> e4ee051914 (GEOMESA-3113 Add system property to managing HBase deletes with visibilities (#2792))
>>>>>>> 260d67442f (GEOMESA-3113 Add system property to managing HBase deletes with visibilities (#2792))
>>>>>>> d9ec67b278 (GEOMESA-3113 Add system property to managing HBase deletes with visibilities (#2792))
=======
>>>>>>> 8524ef3a47 (GEOMESA-3113 Add system property to managing HBase deletes with visibilities (#2792))
=======
>>>>>>> cdbed26e09 (GEOMESA-3113 Add system property to managing HBase deletes with visibilities (#2792))
=======
=======
>>>>>>> 2d01ec0bc0 (GEOMESA-3102 Fix removal of user data in FileSystemDataStore.createSchema (#2787))
>>>>>>> f58f87b448 (GEOMESA-3102 Fix removal of user data in FileSystemDataStore.createSchema (#2787))
=======
>>>>>>> 871350de06 (GEOMESA-3102 Fix removal of user data in FileSystemDataStore.createSchema (#2787))
=======
=======
>>>>>>> c14e106409 (GEOMESA-3113 Add system property to managing HBase deletes with visibilities (#2792))
>>>>>>> e6162be24a (GEOMESA-3113 Add system property to managing HBase deletes with visibilities (#2792))
>>>>>>> a8b2b56cbd (GEOMESA-3113 Add system property to managing HBase deletes with visibilities (#2792))
=======
=======
>>>>>>> 78439fc2da (GEOMESA-3102 Fix removal of user data in FileSystemDataStore.createSchema (#2787))
>>>>>>> e62505d539 (GEOMESA-3113 Add system property to managing HBase deletes with visibilities (#2792))
<<<<<<< HEAD
>>>>>>> 3226e92d8e (GEOMESA-3113 Add system property to managing HBase deletes with visibilities (#2792))
<<<<<<< HEAD
>>>>>>> dbbcaa10d3 (GEOMESA-3113 Add system property to managing HBase deletes with visibilities (#2792))
<<<<<<< HEAD
>>>>>>> 00494e0bcf (GEOMESA-3113 Add system property to managing HBase deletes with visibilities (#2792))
=======
=======
=======
=======
=======
=======
=======
>>>>>>> c385f7994 (GEOMESA-3102 Fix removal of user data in FileSystemDataStore.createSchema (#2787))
=======
>>>>>>> 3d40465720 (GEOMESA-3113 Add system property to managing HBase deletes with visibilities (#2792))
>>>>>>> 3171e7407d (GEOMESA-3102 Fix removal of user data in FileSystemDataStore.createSchema (#2787))
<<<<<<< HEAD
>>>>>>> 038b4ca087 (GEOMESA-3102 Fix removal of user data in FileSystemDataStore.createSchema (#2787))
<<<<<<< HEAD
>>>>>>> 7f486255dd (GEOMESA-3102 Fix removal of user data in FileSystemDataStore.createSchema (#2787))
<<<<<<< HEAD
>>>>>>> 78439fc2da (GEOMESA-3102 Fix removal of user data in FileSystemDataStore.createSchema (#2787))
=======
=======
=======
=======
=======
>>>>>>> 44b15e96d (GEOMESA-3113 Add system property to managing HBase deletes with visibilities (#2792))
=======
>>>>>>> 4b0c56ce56 (GEOMESA-3102 Fix removal of user data in FileSystemDataStore.createSchema (#2787))
>>>>>>> e5413df04f (GEOMESA-3113 Add system property to managing HBase deletes with visibilities (#2792))
<<<<<<< HEAD
>>>>>>> d38e17d229 (GEOMESA-3113 Add system property to managing HBase deletes with visibilities (#2792))
<<<<<<< HEAD
>>>>>>> 65460df3e6 (GEOMESA-3113 Add system property to managing HBase deletes with visibilities (#2792))
<<<<<<< HEAD
>>>>>>> 3d40465720 (GEOMESA-3113 Add system property to managing HBase deletes with visibilities (#2792))
=======
=======
=======
=======
=======
=======
=======
>>>>>>> 75f3f455e (GEOMESA-3102 Fix removal of user data in FileSystemDataStore.createSchema (#2787))
=======
>>>>>>> 9dd4a005eb (GEOMESA-3113 Add system property to managing HBase deletes with visibilities (#2792))
>>>>>>> 20dc993a76 (GEOMESA-3102 Fix removal of user data in FileSystemDataStore.createSchema (#2787))
<<<<<<< HEAD
>>>>>>> 33d2777a8a (GEOMESA-3102 Fix removal of user data in FileSystemDataStore.createSchema (#2787))
<<<<<<< HEAD
>>>>>>> abc395c346 (GEOMESA-3102 Fix removal of user data in FileSystemDataStore.createSchema (#2787))
<<<<<<< HEAD
>>>>>>> 4b0c56ce56 (GEOMESA-3102 Fix removal of user data in FileSystemDataStore.createSchema (#2787))
=======
=======
=======
=======
=======
>>>>>>> 1b5719bd3 (GEOMESA-3113 Add system property to managing HBase deletes with visibilities (#2792))
>>>>>>> e4ee051914 (GEOMESA-3113 Add system property to managing HBase deletes with visibilities (#2792))
>>>>>>> 260d67442f (GEOMESA-3113 Add system property to managing HBase deletes with visibilities (#2792))
>>>>>>> 9e74e1d9b4 (GEOMESA-3113 Add system property to managing HBase deletes with visibilities (#2792))
>>>>>>> 9dd4a005eb (GEOMESA-3113 Add system property to managing HBase deletes with visibilities (#2792))
        val config = new JobConf(conf)
>>>>>>> 1a21a3c30 (GEOMESA-3113 Add system property to managing HBase deletes with visibilities (#2792))
=======
>>>>>>> 85d211ca2 (GEOMESA-3102 Fix removal of user data in FileSystemDataStore.createSchema (#2787))
<<<<<<< HEAD
<<<<<<< HEAD
<<<<<<< HEAD
<<<<<<< HEAD
<<<<<<< HEAD
<<<<<<< HEAD
<<<<<<< HEAD
<<<<<<< HEAD
<<<<<<< HEAD
<<<<<<< HEAD
<<<<<<< HEAD
<<<<<<< HEAD
<<<<<<< HEAD
<<<<<<< HEAD
<<<<<<< HEAD
<<<<<<< HEAD
<<<<<<< HEAD
<<<<<<< HEAD
<<<<<<< HEAD
<<<<<<< HEAD
<<<<<<< HEAD
<<<<<<< HEAD
<<<<<<< HEAD
<<<<<<< HEAD
<<<<<<< HEAD
<<<<<<< HEAD
<<<<<<< HEAD
<<<<<<< HEAD
<<<<<<< HEAD
<<<<<<< HEAD
<<<<<<< HEAD
<<<<<<< HEAD
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
>>>>>>> 00494e0bcf (GEOMESA-3113 Add system property to managing HBase deletes with visibilities (#2792))
=======
>>>>>>> 78439fc2da (GEOMESA-3102 Fix removal of user data in FileSystemDataStore.createSchema (#2787))
=======
>>>>>>> 3d40465720 (GEOMESA-3113 Add system property to managing HBase deletes with visibilities (#2792))
=======
>>>>>>> 4b0c56ce56 (GEOMESA-3102 Fix removal of user data in FileSystemDataStore.createSchema (#2787))
=======
>>>>>>> 9dd4a005eb (GEOMESA-3113 Add system property to managing HBase deletes with visibilities (#2792))
=======
>>>>>>> e6162be24a (GEOMESA-3113 Add system property to managing HBase deletes with visibilities (#2792))
=======
>>>>>>> dbbcaa10d3 (GEOMESA-3113 Add system property to managing HBase deletes with visibilities (#2792))
=======
<<<<<<< HEAD
<<<<<<< HEAD
>>>>>>> 7f486255dd (GEOMESA-3102 Fix removal of user data in FileSystemDataStore.createSchema (#2787))
=======
>>>>>>> 65460df3e6 (GEOMESA-3113 Add system property to managing HBase deletes with visibilities (#2792))
=======
<<<<<<< HEAD
<<<<<<< HEAD
>>>>>>> abc395c346 (GEOMESA-3102 Fix removal of user data in FileSystemDataStore.createSchema (#2787))
=======
>>>>>>> 9e74e1d9b4 (GEOMESA-3113 Add system property to managing HBase deletes with visibilities (#2792))
=======
<<<<<<< HEAD
>>>>>>> 665046a461 (GEOMESA-3113 Add system property to managing HBase deletes with visibilities (#2792))
=======
>>>>>>> 7d3ca180ff (GEOMESA-3113 Add system property to managing HBase deletes with visibilities (#2792))
=======
>>>>>>> 957de96206 (GEOMESA-3102 Fix removal of user data in FileSystemDataStore.createSchema (#2787))
=======
>>>>>>> ad7a284ebe (GEOMESA-3113 Add system property to managing HBase deletes with visibilities (#2792))
=======
>>>>>>> a23109e63b (GEOMESA-3102 Fix removal of user data in FileSystemDataStore.createSchema (#2787))
=======
>>>>>>> d9ec67b278 (GEOMESA-3113 Add system property to managing HBase deletes with visibilities (#2792))
=======
>>>>>>> 8524ef3a47 (GEOMESA-3113 Add system property to managing HBase deletes with visibilities (#2792))
=======
>>>>>>> cdbed26e09 (GEOMESA-3113 Add system property to managing HBase deletes with visibilities (#2792))
=======
>>>>>>> f58f87b448 (GEOMESA-3102 Fix removal of user data in FileSystemDataStore.createSchema (#2787))
=======
>>>>>>> 871350de06 (GEOMESA-3102 Fix removal of user data in FileSystemDataStore.createSchema (#2787))
=======
=======
>>>>>>> e6162be24a (GEOMESA-3113 Add system property to managing HBase deletes with visibilities (#2792))
>>>>>>> a8b2b56cbd (GEOMESA-3113 Add system property to managing HBase deletes with visibilities (#2792))
=======
=======
>>>>>>> 00494e0bcf (GEOMESA-3113 Add system property to managing HBase deletes with visibilities (#2792))
=======
>>>>>>> 7f486255dd (GEOMESA-3102 Fix removal of user data in FileSystemDataStore.createSchema (#2787))
=======
>>>>>>> 78439fc2da (GEOMESA-3102 Fix removal of user data in FileSystemDataStore.createSchema (#2787))
=======
>>>>>>> 3d40465720 (GEOMESA-3113 Add system property to managing HBase deletes with visibilities (#2792))
=======
>>>>>>> abc395c346 (GEOMESA-3102 Fix removal of user data in FileSystemDataStore.createSchema (#2787))
=======
>>>>>>> 4b0c56ce56 (GEOMESA-3102 Fix removal of user data in FileSystemDataStore.createSchema (#2787))
=======
>>>>>>> 9dd4a005eb (GEOMESA-3113 Add system property to managing HBase deletes with visibilities (#2792))
=======
>>>>>>> 72415e208a (GEOMESA-3113 Add system property to managing HBase deletes with visibilities (#2792))
>>>>>>> c14e106409 (GEOMESA-3113 Add system property to managing HBase deletes with visibilities (#2792))
<<<<<<< HEAD
<<<<<<< HEAD
<<<<<<< HEAD
<<<<<<< HEAD
<<<<<<< HEAD
<<<<<<< HEAD
=======
>>>>>>> a8b2b56cbd (GEOMESA-3113 Add system property to managing HBase deletes with visibilities (#2792))
=======
>>>>>>> 00494e0bcf (GEOMESA-3113 Add system property to managing HBase deletes with visibilities (#2792))
=======
=======
>>>>>>> 038b4ca087 (GEOMESA-3102 Fix removal of user data in FileSystemDataStore.createSchema (#2787))
=======
>>>>>>> d38e17d229 (GEOMESA-3113 Add system property to managing HBase deletes with visibilities (#2792))
=======
<<<<<<< HEAD
<<<<<<< HEAD
<<<<<<< HEAD
<<<<<<< HEAD
<<<<<<< HEAD
=======
>>>>>>> 3d40465720 (GEOMESA-3113 Add system property to managing HBase deletes with visibilities (#2792))
=======
>>>>>>> 4b0c56ce56 (GEOMESA-3102 Fix removal of user data in FileSystemDataStore.createSchema (#2787))
>>>>>>> 33d2777a8a (GEOMESA-3102 Fix removal of user data in FileSystemDataStore.createSchema (#2787))
=======
>>>>>>> 260d67442f (GEOMESA-3113 Add system property to managing HBase deletes with visibilities (#2792))
=======
<<<<<<< HEAD
<<<<<<< HEAD
<<<<<<< HEAD
<<<<<<< HEAD
=======
>>>>>>> 9dd4a005eb (GEOMESA-3113 Add system property to managing HBase deletes with visibilities (#2792))
=======
>>>>>>> 65460df3e6 (GEOMESA-3113 Add system property to managing HBase deletes with visibilities (#2792))
=======
>>>>>>> 33d2777a8a (GEOMESA-3102 Fix removal of user data in FileSystemDataStore.createSchema (#2787))
=======
>>>>>>> abc395c346 (GEOMESA-3102 Fix removal of user data in FileSystemDataStore.createSchema (#2787))
<<<<<<< HEAD
<<<<<<< HEAD
=======
>>>>>>> 9e74e1d9b4 (GEOMESA-3113 Add system property to managing HBase deletes with visibilities (#2792))
=======
>>>>>>> 33d2777a8a (GEOMESA-3102 Fix removal of user data in FileSystemDataStore.createSchema (#2787))
=======
>>>>>>> a23109e63b (GEOMESA-3102 Fix removal of user data in FileSystemDataStore.createSchema (#2787))
=======
>>>>>>> d9ec67b278 (GEOMESA-3113 Add system property to managing HBase deletes with visibilities (#2792))
=======
=======
>>>>>>> 65460df3e6 (GEOMESA-3113 Add system property to managing HBase deletes with visibilities (#2792))
>>>>>>> 3d40465720 (GEOMESA-3113 Add system property to managing HBase deletes with visibilities (#2792))
=======
>>>>>>> 4b0c56ce56 (GEOMESA-3102 Fix removal of user data in FileSystemDataStore.createSchema (#2787))
=======
=======
>>>>>>> 9e74e1d9b4 (GEOMESA-3113 Add system property to managing HBase deletes with visibilities (#2792))
>>>>>>> 9dd4a005eb (GEOMESA-3113 Add system property to managing HBase deletes with visibilities (#2792))
>>>>>>> 72415e208a (GEOMESA-3113 Add system property to managing HBase deletes with visibilities (#2792))
=======
>>>>>>> e62505d539 (GEOMESA-3113 Add system property to managing HBase deletes with visibilities (#2792))
<<<<<<< HEAD
>>>>>>> 3226e92d8e (GEOMESA-3113 Add system property to managing HBase deletes with visibilities (#2792))
=======
=======
>>>>>>> 3171e7407d (GEOMESA-3102 Fix removal of user data in FileSystemDataStore.createSchema (#2787))
<<<<<<< HEAD
>>>>>>> 038b4ca087 (GEOMESA-3102 Fix removal of user data in FileSystemDataStore.createSchema (#2787))
=======
=======
=======
<<<<<<< HEAD
<<<<<<< HEAD
<<<<<<< HEAD
<<<<<<< HEAD
<<<<<<< HEAD
=======
>>>>>>> 3d40465720 (GEOMESA-3113 Add system property to managing HBase deletes with visibilities (#2792))
=======
>>>>>>> 4b0c56ce56 (GEOMESA-3102 Fix removal of user data in FileSystemDataStore.createSchema (#2787))
>>>>>>> 20dc993a76 (GEOMESA-3102 Fix removal of user data in FileSystemDataStore.createSchema (#2787))
=======
>>>>>>> 44b15e96d (GEOMESA-3113 Add system property to managing HBase deletes with visibilities (#2792))
>>>>>>> e5413df04f (GEOMESA-3113 Add system property to managing HBase deletes with visibilities (#2792))
<<<<<<< HEAD
>>>>>>> d38e17d229 (GEOMESA-3113 Add system property to managing HBase deletes with visibilities (#2792))
=======
=======
=======
>>>>>>> 44b15e96d (GEOMESA-3113 Add system property to managing HBase deletes with visibilities (#2792))
=======
>>>>>>> 1b5719bd3 (GEOMESA-3113 Add system property to managing HBase deletes with visibilities (#2792))
>>>>>>> e4ee051914 (GEOMESA-3113 Add system property to managing HBase deletes with visibilities (#2792))
>>>>>>> 260d67442f (GEOMESA-3113 Add system property to managing HBase deletes with visibilities (#2792))
<<<<<<< HEAD
<<<<<<< HEAD
<<<<<<< HEAD
<<<<<<< HEAD
=======
>>>>>>> 9dd4a005eb (GEOMESA-3113 Add system property to managing HBase deletes with visibilities (#2792))
=======
>>>>>>> d857d34521 (GEOMESA-3113 Add system property to managing HBase deletes with visibilities (#2792))
=======
>>>>>>> 02fea6930b (GEOMESA-3113 Add system property to managing HBase deletes with visibilities (#2792))
<<<<<<< HEAD
<<<<<<< HEAD
=======
>>>>>>> 2d01ec0bc0 (GEOMESA-3102 Fix removal of user data in FileSystemDataStore.createSchema (#2787))
=======
>>>>>>> f7952edd5f (GEOMESA-3102 Fix removal of user data in FileSystemDataStore.createSchema (#2787))
<<<<<<< HEAD
<<<<<<< HEAD
=======
>>>>>>> e6162be24a (GEOMESA-3113 Add system property to managing HBase deletes with visibilities (#2792))
=======
=======
=======
<<<<<<< HEAD
<<<<<<< HEAD
>>>>>>> 038b4ca087 (GEOMESA-3102 Fix removal of user data in FileSystemDataStore.createSchema (#2787))
=======
>>>>>>> d38e17d229 (GEOMESA-3113 Add system property to managing HBase deletes with visibilities (#2792))
=======
>>>>>>> 72415e208a (GEOMESA-3113 Add system property to managing HBase deletes with visibilities (#2792))
=======
>>>>>>> e62505d539 (GEOMESA-3113 Add system property to managing HBase deletes with visibilities (#2792))
<<<<<<< HEAD
>>>>>>> 3226e92d8e (GEOMESA-3113 Add system property to managing HBase deletes with visibilities (#2792))
<<<<<<< HEAD
>>>>>>> dbbcaa10d3 (GEOMESA-3113 Add system property to managing HBase deletes with visibilities (#2792))
=======
=======
=======
>>>>>>> 3171e7407d (GEOMESA-3102 Fix removal of user data in FileSystemDataStore.createSchema (#2787))
<<<<<<< HEAD
>>>>>>> 038b4ca087 (GEOMESA-3102 Fix removal of user data in FileSystemDataStore.createSchema (#2787))
<<<<<<< HEAD
>>>>>>> 7f486255dd (GEOMESA-3102 Fix removal of user data in FileSystemDataStore.createSchema (#2787))
=======
=======
>>>>>>> 20dc993a76 (GEOMESA-3102 Fix removal of user data in FileSystemDataStore.createSchema (#2787))
=======
>>>>>>> abc395c346 (GEOMESA-3102 Fix removal of user data in FileSystemDataStore.createSchema (#2787))
=======
>>>>>>> 20dc993a76 (GEOMESA-3102 Fix removal of user data in FileSystemDataStore.createSchema (#2787))
=======
>>>>>>> a23109e63b (GEOMESA-3102 Fix removal of user data in FileSystemDataStore.createSchema (#2787))
>>>>>>> 44b15e96d (GEOMESA-3113 Add system property to managing HBase deletes with visibilities (#2792))
>>>>>>> e5413df04f (GEOMESA-3113 Add system property to managing HBase deletes with visibilities (#2792))
>>>>>>> d38e17d229 (GEOMESA-3113 Add system property to managing HBase deletes with visibilities (#2792))
>>>>>>> 65460df3e6 (GEOMESA-3113 Add system property to managing HBase deletes with visibilities (#2792))
=======
>>>>>>> 9e74e1d9b4 (GEOMESA-3113 Add system property to managing HBase deletes with visibilities (#2792))
=======
>>>>>>> 7d705cac10 (GEOMESA-3113 Add system property to managing HBase deletes with visibilities (#2792))
=======
>>>>>>> 5d545f24ed (GEOMESA-3113 Add system property to managing HBase deletes with visibilities (#2792))
=======
>>>>>>> 41631d23c9 (GEOMESA-3102 Fix removal of user data in FileSystemDataStore.createSchema (#2787))
=======
>>>>>>> 2f550bb2a7 (GEOMESA-3102 Fix removal of user data in FileSystemDataStore.createSchema (#2787))
=======
>>>>>>> 665046a461 (GEOMESA-3113 Add system property to managing HBase deletes with visibilities (#2792))
=======
=======
=======
>>>>>>> 038b4ca087 (GEOMESA-3102 Fix removal of user data in FileSystemDataStore.createSchema (#2787))
=======
>>>>>>> 72415e208a (GEOMESA-3113 Add system property to managing HBase deletes with visibilities (#2792))
=======
>>>>>>> e62505d539 (GEOMESA-3113 Add system property to managing HBase deletes with visibilities (#2792))
<<<<<<< HEAD
>>>>>>> 3226e92d8e (GEOMESA-3113 Add system property to managing HBase deletes with visibilities (#2792))
<<<<<<< HEAD
>>>>>>> 7d3ca180ff (GEOMESA-3113 Add system property to managing HBase deletes with visibilities (#2792))
=======
=======
=======
>>>>>>> 3171e7407d (GEOMESA-3102 Fix removal of user data in FileSystemDataStore.createSchema (#2787))
>>>>>>> 038b4ca087 (GEOMESA-3102 Fix removal of user data in FileSystemDataStore.createSchema (#2787))
>>>>>>> 957de96206 (GEOMESA-3102 Fix removal of user data in FileSystemDataStore.createSchema (#2787))
=======
=======
=======
=======
>>>>>>> 44b15e96d (GEOMESA-3113 Add system property to managing HBase deletes with visibilities (#2792))
>>>>>>> e5413df04f (GEOMESA-3113 Add system property to managing HBase deletes with visibilities (#2792))
>>>>>>> d38e17d229 (GEOMESA-3113 Add system property to managing HBase deletes with visibilities (#2792))
>>>>>>> ad7a284ebe (GEOMESA-3113 Add system property to managing HBase deletes with visibilities (#2792))
=======
>>>>>>> d9ec67b278 (GEOMESA-3113 Add system property to managing HBase deletes with visibilities (#2792))
=======
=======
>>>>>>> d857d34521 (GEOMESA-3113 Add system property to managing HBase deletes with visibilities (#2792))
>>>>>>> 8524ef3a47 (GEOMESA-3113 Add system property to managing HBase deletes with visibilities (#2792))
=======
>>>>>>> cdbed26e09 (GEOMESA-3113 Add system property to managing HBase deletes with visibilities (#2792))
=======
=======
>>>>>>> 2d01ec0bc0 (GEOMESA-3102 Fix removal of user data in FileSystemDataStore.createSchema (#2787))
>>>>>>> f58f87b448 (GEOMESA-3102 Fix removal of user data in FileSystemDataStore.createSchema (#2787))
=======
>>>>>>> 871350de06 (GEOMESA-3102 Fix removal of user data in FileSystemDataStore.createSchema (#2787))
=======
=======
>>>>>>> e6162be24a (GEOMESA-3113 Add system property to managing HBase deletes with visibilities (#2792))
>>>>>>> a8b2b56cbd (GEOMESA-3113 Add system property to managing HBase deletes with visibilities (#2792))
=======
=======
>>>>>>> 038b4ca087 (GEOMESA-3102 Fix removal of user data in FileSystemDataStore.createSchema (#2787))
=======
>>>>>>> 78439fc2da (GEOMESA-3102 Fix removal of user data in FileSystemDataStore.createSchema (#2787))
>>>>>>> 72415e208a (GEOMESA-3113 Add system property to managing HBase deletes with visibilities (#2792))
=======
>>>>>>> e62505d539 (GEOMESA-3113 Add system property to managing HBase deletes with visibilities (#2792))
<<<<<<< HEAD
>>>>>>> 3226e92d8e (GEOMESA-3113 Add system property to managing HBase deletes with visibilities (#2792))
<<<<<<< HEAD
>>>>>>> dbbcaa10d3 (GEOMESA-3113 Add system property to managing HBase deletes with visibilities (#2792))
<<<<<<< HEAD
>>>>>>> 00494e0bcf (GEOMESA-3113 Add system property to managing HBase deletes with visibilities (#2792))
=======
=======
=======
=======
>>>>>>> 3171e7407d (GEOMESA-3102 Fix removal of user data in FileSystemDataStore.createSchema (#2787))
>>>>>>> 038b4ca087 (GEOMESA-3102 Fix removal of user data in FileSystemDataStore.createSchema (#2787))
>>>>>>> 7f486255dd (GEOMESA-3102 Fix removal of user data in FileSystemDataStore.createSchema (#2787))
<<<<<<< HEAD
>>>>>>> 78439fc2da (GEOMESA-3102 Fix removal of user data in FileSystemDataStore.createSchema (#2787))
=======
=======
=======
>>>>>>> 20dc993a76 (GEOMESA-3102 Fix removal of user data in FileSystemDataStore.createSchema (#2787))
=======
>>>>>>> abc395c346 (GEOMESA-3102 Fix removal of user data in FileSystemDataStore.createSchema (#2787))
>>>>>>> 44b15e96d (GEOMESA-3113 Add system property to managing HBase deletes with visibilities (#2792))
>>>>>>> e5413df04f (GEOMESA-3113 Add system property to managing HBase deletes with visibilities (#2792))
>>>>>>> d38e17d229 (GEOMESA-3113 Add system property to managing HBase deletes with visibilities (#2792))
>>>>>>> 65460df3e6 (GEOMESA-3113 Add system property to managing HBase deletes with visibilities (#2792))
<<<<<<< HEAD
>>>>>>> 3d40465720 (GEOMESA-3113 Add system property to managing HBase deletes with visibilities (#2792))
=======
=======
>>>>>>> 9e74e1d9b4 (GEOMESA-3113 Add system property to managing HBase deletes with visibilities (#2792))
>>>>>>> 9dd4a005eb (GEOMESA-3113 Add system property to managing HBase deletes with visibilities (#2792))
>>>>>>> ea0c690e2 (GEOMESA-3102 Fix removal of user data in FileSystemDataStore.createSchema (#2787))
=======
=======
>>>>>>> 0cdf3f2672 (GEOMESA-3113 Add system property to managing HBase deletes with visibilities (#2792))
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
>>>>>>> 8524ef3a47 (GEOMESA-3113 Add system property to managing HBase deletes with visibilities (#2792))
=======
>>>>>>> cdbed26e09 (GEOMESA-3113 Add system property to managing HBase deletes with visibilities (#2792))
=======
>>>>>>> a8b2b56cbd (GEOMESA-3113 Add system property to managing HBase deletes with visibilities (#2792))
>>>>>>> 8037623548 (GEOMESA-3113 Add system property to managing HBase deletes with visibilities (#2792))
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
>>>>>>> a8b2b56cbd (GEOMESA-3113 Add system property to managing HBase deletes with visibilities (#2792))
=======
>>>>>>> 00494e0bcf (GEOMESA-3113 Add system property to managing HBase deletes with visibilities (#2792))
=======
>>>>>>> 3d40465720 (GEOMESA-3113 Add system property to managing HBase deletes with visibilities (#2792))
=======
>>>>>>> 9dd4a005eb (GEOMESA-3113 Add system property to managing HBase deletes with visibilities (#2792))
=======
>>>>>>> 8037623548 (GEOMESA-3113 Add system property to managing HBase deletes with visibilities (#2792))
=======
<<<<<<< HEAD
>>>>>>> e6162be24a (GEOMESA-3113 Add system property to managing HBase deletes with visibilities (#2792))
<<<<<<< HEAD
<<<<<<< HEAD
=======
>>>>>>> dbbcaa10d3 (GEOMESA-3113 Add system property to managing HBase deletes with visibilities (#2792))
=======
>>>>>>> 65460df3e6 (GEOMESA-3113 Add system property to managing HBase deletes with visibilities (#2792))
<<<<<<< HEAD
<<<<<<< HEAD
=======
>>>>>>> 9e74e1d9b4 (GEOMESA-3113 Add system property to managing HBase deletes with visibilities (#2792))
=======
>>>>>>> 8037623548 (GEOMESA-3113 Add system property to managing HBase deletes with visibilities (#2792))
=======
<<<<<<< HEAD
>>>>>>> 665046a461 (GEOMESA-3113 Add system property to managing HBase deletes with visibilities (#2792))
=======
>>>>>>> 7d3ca180ff (GEOMESA-3113 Add system property to managing HBase deletes with visibilities (#2792))
=======
>>>>>>> ad7a284ebe (GEOMESA-3113 Add system property to managing HBase deletes with visibilities (#2792))
=======
>>>>>>> d9ec67b278 (GEOMESA-3113 Add system property to managing HBase deletes with visibilities (#2792))
=======
>>>>>>> a8b2b56cbd (GEOMESA-3113 Add system property to managing HBase deletes with visibilities (#2792))
=======
=======
>>>>>>> dbbcaa10d3 (GEOMESA-3113 Add system property to managing HBase deletes with visibilities (#2792))
>>>>>>> 00494e0bcf (GEOMESA-3113 Add system property to managing HBase deletes with visibilities (#2792))
=======
>>>>>>> 3d40465720 (GEOMESA-3113 Add system property to managing HBase deletes with visibilities (#2792))
=======
=======
>>>>>>> 9e74e1d9b4 (GEOMESA-3113 Add system property to managing HBase deletes with visibilities (#2792))
>>>>>>> 9dd4a005eb (GEOMESA-3113 Add system property to managing HBase deletes with visibilities (#2792))
>>>>>>> de3e57f03 (GEOMESA-3113 Add system property to managing HBase deletes with visibilities (#2792))
>>>>>>> c14e106409 (GEOMESA-3113 Add system property to managing HBase deletes with visibilities (#2792))
=======
=======
>>>>>>> 72415e208a (GEOMESA-3113 Add system property to managing HBase deletes with visibilities (#2792))
<<<<<<< HEAD
<<<<<<< HEAD
<<<<<<< HEAD
=======
=======
>>>>>>> e5413df04f (GEOMESA-3113 Add system property to managing HBase deletes with visibilities (#2792))
=======
>>>>>>> e4ee051914 (GEOMESA-3113 Add system property to managing HBase deletes with visibilities (#2792))
>>>>>>> 803762354 (GEOMESA-3113 Add system property to managing HBase deletes with visibilities (#2792))
=======
>>>>>>> e62505d539 (GEOMESA-3113 Add system property to managing HBase deletes with visibilities (#2792))
=======
>>>>>>> 44b15e96d (GEOMESA-3113 Add system property to managing HBase deletes with visibilities (#2792))
=======
>>>>>>> 1b5719bd3 (GEOMESA-3113 Add system property to managing HBase deletes with visibilities (#2792))
=======
>>>>>>> d857d34521 (GEOMESA-3113 Add system property to managing HBase deletes with visibilities (#2792))
=======
>>>>>>> 8037623548 (GEOMESA-3113 Add system property to managing HBase deletes with visibilities (#2792))
=======
>>>>>>> 02fea6930b (GEOMESA-3113 Add system property to managing HBase deletes with visibilities (#2792))
=======
>>>>>>> e6162be24a (GEOMESA-3113 Add system property to managing HBase deletes with visibilities (#2792))
=======
=======
>>>>>>> e5413df04f (GEOMESA-3113 Add system property to managing HBase deletes with visibilities (#2792))
=======
>>>>>>> e4ee051914 (GEOMESA-3113 Add system property to managing HBase deletes with visibilities (#2792))
>>>>>>> 803762354 (GEOMESA-3113 Add system property to managing HBase deletes with visibilities (#2792))
=======
>>>>>>> e62505d539 (GEOMESA-3113 Add system property to managing HBase deletes with visibilities (#2792))
=======
>>>>>>> 44b15e96d (GEOMESA-3113 Add system property to managing HBase deletes with visibilities (#2792))
=======
>>>>>>> 1b5719bd3 (GEOMESA-3113 Add system property to managing HBase deletes with visibilities (#2792))
=======
>>>>>>> 7d705cac10 (GEOMESA-3113 Add system property to managing HBase deletes with visibilities (#2792))
=======
>>>>>>> 8037623548 (GEOMESA-3113 Add system property to managing HBase deletes with visibilities (#2792))
=======
>>>>>>> 5d545f24ed (GEOMESA-3113 Add system property to managing HBase deletes with visibilities (#2792))
=======
>>>>>>> 665046a461 (GEOMESA-3113 Add system property to managing HBase deletes with visibilities (#2792))
=======
>>>>>>> a8b2b56cbd (GEOMESA-3113 Add system property to managing HBase deletes with visibilities (#2792))
=======
=======
>>>>>>> e5413df04f (GEOMESA-3113 Add system property to managing HBase deletes with visibilities (#2792))
=======
>>>>>>> e4ee051914 (GEOMESA-3113 Add system property to managing HBase deletes with visibilities (#2792))
>>>>>>> 803762354 (GEOMESA-3113 Add system property to managing HBase deletes with visibilities (#2792))
=======
>>>>>>> e62505d539 (GEOMESA-3113 Add system property to managing HBase deletes with visibilities (#2792))
=======
>>>>>>> 44b15e96d (GEOMESA-3113 Add system property to managing HBase deletes with visibilities (#2792))
=======
>>>>>>> 1b5719bd3 (GEOMESA-3113 Add system property to managing HBase deletes with visibilities (#2792))
=======
>>>>>>> d857d34521 (GEOMESA-3113 Add system property to managing HBase deletes with visibilities (#2792))
=======
>>>>>>> 8037623548 (GEOMESA-3113 Add system property to managing HBase deletes with visibilities (#2792))
=======
>>>>>>> 02fea6930b (GEOMESA-3113 Add system property to managing HBase deletes with visibilities (#2792))
=======
>>>>>>> e6162be24a (GEOMESA-3113 Add system property to managing HBase deletes with visibilities (#2792))
=======
=======
>>>>>>> e5413df04f (GEOMESA-3113 Add system property to managing HBase deletes with visibilities (#2792))
=======
>>>>>>> e4ee051914 (GEOMESA-3113 Add system property to managing HBase deletes with visibilities (#2792))
>>>>>>> 803762354 (GEOMESA-3113 Add system property to managing HBase deletes with visibilities (#2792))
=======
>>>>>>> e62505d539 (GEOMESA-3113 Add system property to managing HBase deletes with visibilities (#2792))
=======
>>>>>>> 44b15e96d (GEOMESA-3113 Add system property to managing HBase deletes with visibilities (#2792))
=======
>>>>>>> 1b5719bd3 (GEOMESA-3113 Add system property to managing HBase deletes with visibilities (#2792))
=======
        val config = new JobConf(conf)
>>>>>>> 1a21a3c30 (GEOMESA-3113 Add system property to managing HBase deletes with visibilities (#2792))
>>>>>>> 595c43086 (GEOMESA-3113 Add system property to managing HBase deletes with visibilities (#2792))
<<<<<<< HEAD
<<<<<<< HEAD
<<<<<<< HEAD
<<<<<<< HEAD
<<<<<<< HEAD
<<<<<<< HEAD
<<<<<<< HEAD
<<<<<<< HEAD
<<<<<<< HEAD
<<<<<<< HEAD
<<<<<<< HEAD
<<<<<<< HEAD
<<<<<<< HEAD
<<<<<<< HEAD
<<<<<<< HEAD
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
>>>>>>> 3d40465720 (GEOMESA-3113 Add system property to managing HBase deletes with visibilities (#2792))
=======
>>>>>>> 9dd4a005eb (GEOMESA-3113 Add system property to managing HBase deletes with visibilities (#2792))
=======
>>>>>>> dbbcaa10d3 (GEOMESA-3113 Add system property to managing HBase deletes with visibilities (#2792))
=======
>>>>>>> 65460df3e6 (GEOMESA-3113 Add system property to managing HBase deletes with visibilities (#2792))
=======
<<<<<<< HEAD
<<<<<<< HEAD
>>>>>>> 9e74e1d9b4 (GEOMESA-3113 Add system property to managing HBase deletes with visibilities (#2792))
=======
>>>>>>> 7d3ca180ff (GEOMESA-3113 Add system property to managing HBase deletes with visibilities (#2792))
=======
>>>>>>> ad7a284ebe (GEOMESA-3113 Add system property to managing HBase deletes with visibilities (#2792))
=======
>>>>>>> d9ec67b278 (GEOMESA-3113 Add system property to managing HBase deletes with visibilities (#2792))
=======
>>>>>>> 8524ef3a47 (GEOMESA-3113 Add system property to managing HBase deletes with visibilities (#2792))
=======
>>>>>>> cdbed26e09 (GEOMESA-3113 Add system property to managing HBase deletes with visibilities (#2792))
=======
>>>>>>> a8b2b56cbd (GEOMESA-3113 Add system property to managing HBase deletes with visibilities (#2792))
=======
=======
>>>>>>> dbbcaa10d3 (GEOMESA-3113 Add system property to managing HBase deletes with visibilities (#2792))
>>>>>>> 00494e0bcf (GEOMESA-3113 Add system property to managing HBase deletes with visibilities (#2792))
=======
=======
>>>>>>> 3d40465720 (GEOMESA-3113 Add system property to managing HBase deletes with visibilities (#2792))
=======
>>>>>>> 9e74e1d9b4 (GEOMESA-3113 Add system property to managing HBase deletes with visibilities (#2792))
=======
>>>>>>> 9dd4a005eb (GEOMESA-3113 Add system property to managing HBase deletes with visibilities (#2792))
>>>>>>> 72415e208a (GEOMESA-3113 Add system property to managing HBase deletes with visibilities (#2792))
=======
>>>>>>> e62505d539 (GEOMESA-3113 Add system property to managing HBase deletes with visibilities (#2792))
<<<<<<< HEAD
<<<<<<< HEAD
<<<<<<< HEAD
<<<<<<< HEAD
<<<<<<< HEAD
<<<<<<< HEAD
=======
>>>>>>> 65460df3e6 (GEOMESA-3113 Add system property to managing HBase deletes with visibilities (#2792))
=======
>>>>>>> ad7a284ebe (GEOMESA-3113 Add system property to managing HBase deletes with visibilities (#2792))
=======
>>>>>>> 00494e0bcf (GEOMESA-3113 Add system property to managing HBase deletes with visibilities (#2792))
=======
=======
>>>>>>> 65460df3e6 (GEOMESA-3113 Add system property to managing HBase deletes with visibilities (#2792))
>>>>>>> 3d40465720 (GEOMESA-3113 Add system property to managing HBase deletes with visibilities (#2792))
=======
=======
>>>>>>> 44b15e96d (GEOMESA-3113 Add system property to managing HBase deletes with visibilities (#2792))
>>>>>>> e5413df04f (GEOMESA-3113 Add system property to managing HBase deletes with visibilities (#2792))
<<<<<<< HEAD
<<<<<<< HEAD
<<<<<<< HEAD
<<<<<<< HEAD
<<<<<<< HEAD
<<<<<<< HEAD
=======
>>>>>>> 9e74e1d9b4 (GEOMESA-3113 Add system property to managing HBase deletes with visibilities (#2792))
=======
>>>>>>> d9ec67b278 (GEOMESA-3113 Add system property to managing HBase deletes with visibilities (#2792))
=======
>>>>>>> 3d40465720 (GEOMESA-3113 Add system property to managing HBase deletes with visibilities (#2792))
=======
=======
>>>>>>> 9e74e1d9b4 (GEOMESA-3113 Add system property to managing HBase deletes with visibilities (#2792))
>>>>>>> 9dd4a005eb (GEOMESA-3113 Add system property to managing HBase deletes with visibilities (#2792))
=======
=======
>>>>>>> 44b15e96d (GEOMESA-3113 Add system property to managing HBase deletes with visibilities (#2792))
=======
>>>>>>> 1b5719bd3 (GEOMESA-3113 Add system property to managing HBase deletes with visibilities (#2792))
>>>>>>> e4ee051914 (GEOMESA-3113 Add system property to managing HBase deletes with visibilities (#2792))
<<<<<<< HEAD
<<<<<<< HEAD
<<<<<<< HEAD
<<<<<<< HEAD
=======
>>>>>>> 9dd4a005eb (GEOMESA-3113 Add system property to managing HBase deletes with visibilities (#2792))
=======
>>>>>>> d857d34521 (GEOMESA-3113 Add system property to managing HBase deletes with visibilities (#2792))
=======
>>>>>>> 02fea6930b (GEOMESA-3113 Add system property to managing HBase deletes with visibilities (#2792))
<<<<<<< HEAD
<<<<<<< HEAD
=======
>>>>>>> a8b2b56cbd (GEOMESA-3113 Add system property to managing HBase deletes with visibilities (#2792))
=======
=======
>>>>>>> 72415e208a (GEOMESA-3113 Add system property to managing HBase deletes with visibilities (#2792))
>>>>>>> e6162be24a (GEOMESA-3113 Add system property to managing HBase deletes with visibilities (#2792))
<<<<<<< HEAD
<<<<<<< HEAD
=======
>>>>>>> dbbcaa10d3 (GEOMESA-3113 Add system property to managing HBase deletes with visibilities (#2792))
=======
>>>>>>> 65460df3e6 (GEOMESA-3113 Add system property to managing HBase deletes with visibilities (#2792))
<<<<<<< HEAD
<<<<<<< HEAD
=======
>>>>>>> 9e74e1d9b4 (GEOMESA-3113 Add system property to managing HBase deletes with visibilities (#2792))
=======
>>>>>>> 7d705cac10 (GEOMESA-3113 Add system property to managing HBase deletes with visibilities (#2792))
=======
>>>>>>> 5d545f24ed (GEOMESA-3113 Add system property to managing HBase deletes with visibilities (#2792))
=======
=======
>>>>>>> 72415e208a (GEOMESA-3113 Add system property to managing HBase deletes with visibilities (#2792))
>>>>>>> 665046a461 (GEOMESA-3113 Add system property to managing HBase deletes with visibilities (#2792))
=======
>>>>>>> 7d3ca180ff (GEOMESA-3113 Add system property to managing HBase deletes with visibilities (#2792))
=======
>>>>>>> ad7a284ebe (GEOMESA-3113 Add system property to managing HBase deletes with visibilities (#2792))
=======
>>>>>>> d9ec67b278 (GEOMESA-3113 Add system property to managing HBase deletes with visibilities (#2792))
=======
=======
>>>>>>> d857d34521 (GEOMESA-3113 Add system property to managing HBase deletes with visibilities (#2792))
>>>>>>> 8524ef3a47 (GEOMESA-3113 Add system property to managing HBase deletes with visibilities (#2792))
=======
>>>>>>> cdbed26e09 (GEOMESA-3113 Add system property to managing HBase deletes with visibilities (#2792))
=======
>>>>>>> a8b2b56cbd (GEOMESA-3113 Add system property to managing HBase deletes with visibilities (#2792))
=======
=======
>>>>>>> dbbcaa10d3 (GEOMESA-3113 Add system property to managing HBase deletes with visibilities (#2792))
>>>>>>> 00494e0bcf (GEOMESA-3113 Add system property to managing HBase deletes with visibilities (#2792))
=======
>>>>>>> 3d40465720 (GEOMESA-3113 Add system property to managing HBase deletes with visibilities (#2792))
=======
=======
>>>>>>> 9e74e1d9b4 (GEOMESA-3113 Add system property to managing HBase deletes with visibilities (#2792))
>>>>>>> 9dd4a005eb (GEOMESA-3113 Add system property to managing HBase deletes with visibilities (#2792))
>>>>>>> dc17df6c0 (GEOMESA-3113 Add system property to managing HBase deletes with visibilities (#2792))
=======
>>>>>>> 74c6b7f8d (GEOMESA-3102 Fix removal of user data in FileSystemDataStore.createSchema (#2787))
=======
>>>>>>> 76328bb492 (GEOMESA-3102 Fix removal of user data in FileSystemDataStore.createSchema (#2787))
=======
=======
        val config = new JobConf(conf)
>>>>>>> 1a21a3c30 (GEOMESA-3113 Add system property to managing HBase deletes with visibilities (#2792))
>>>>>>> f8f49130b1 (GEOMESA-3113 Add system property to managing HBase deletes with visibilities (#2792))
=======
=======
<<<<<<< HEAD
<<<<<<< HEAD
<<<<<<< HEAD
<<<<<<< HEAD
<<<<<<< HEAD
<<<<<<< HEAD
=======
>>>>>>> abaa89e702 (GEOMESA-3102 Fix removal of user data in FileSystemDataStore.createSchema (#2787))
=======
>>>>>>> 7196beb2e1 (GEOMESA-3113 Add system property to managing HBase deletes with visibilities (#2792))
>>>>>>> dc17df6c0 (GEOMESA-3113 Add system property to managing HBase deletes with visibilities (#2792))
=======
>>>>>>> 0cdf3f267 (GEOMESA-3113 Add system property to managing HBase deletes with visibilities (#2792))
=======
<<<<<<< HEAD
<<<<<<< HEAD
<<<<<<< HEAD
<<<<<<< HEAD
<<<<<<< HEAD
<<<<<<< HEAD
=======
>>>>>>> 2b9cd40059 (GEOMESA-3113 Add system property to managing HBase deletes with visibilities (#2792))
=======
>>>>>>> ed36e40e7c (GEOMESA-3113 Add system property to managing HBase deletes with visibilities (#2792))
>>>>>>> 7abafecb19 (GEOMESA-3113 Add system property to managing HBase deletes with visibilities (#2792))
=======
>>>>>>> 0c12a2c53d (GEOMESA-3113 Add system property to managing HBase deletes with visibilities (#2792))
=======
<<<<<<< HEAD
<<<<<<< HEAD
<<<<<<< HEAD
<<<<<<< HEAD
=======
>>>>>>> f68b76f4b8 (GEOMESA-3113 Add system property to managing HBase deletes with visibilities (#2792))
>>>>>>> 6449641e67 (GEOMESA-3113 Add system property to managing HBase deletes with visibilities (#2792))
=======
=======
>>>>>>> 54709e3b06 (GEOMESA-3102 Fix removal of user data in FileSystemDataStore.createSchema (#2787))
<<<<<<< HEAD
<<<<<<< HEAD
=======
>>>>>>> 7196beb2e1 (GEOMESA-3113 Add system property to managing HBase deletes with visibilities (#2792))
=======
>>>>>>> dc17df6c0 (GEOMESA-3113 Add system property to managing HBase deletes with visibilities (#2792))
=======
>>>>>>> b586a90765 (GEOMESA-3113 Add system property to managing HBase deletes with visibilities (#2792))
<<<<<<< HEAD
<<<<<<< HEAD
=======
>>>>>>> 813cf035d0 (GEOMESA-3113 Add system property to managing HBase deletes with visibilities (#2792))
=======
>>>>>>> 7abafecb19 (GEOMESA-3113 Add system property to managing HBase deletes with visibilities (#2792))
=======
>>>>>>> 7ac82c3dce (GEOMESA-3113 Add system property to managing HBase deletes with visibilities (#2792))
<<<<<<< HEAD
<<<<<<< HEAD
=======
>>>>>>> a834a844c7 (GEOMESA-3113 Add system property to managing HBase deletes with visibilities (#2792))
=======
>>>>>>> 0ac8a757dd (GEOMESA-3102 Fix removal of user data in FileSystemDataStore.createSchema (#2787))
=======
>>>>>>> dc17df6c0 (GEOMESA-3113 Add system property to managing HBase deletes with visibilities (#2792))
=======
>>>>>>> bc833b1448 (GEOMESA-3113 Add system property to managing HBase deletes with visibilities (#2792))
=======
>>>>>>> ec072ceda6 (GEOMESA-3113 Add system property to managing HBase deletes with visibilities (#2792))
=======
>>>>>>> 7abafecb19 (GEOMESA-3113 Add system property to managing HBase deletes with visibilities (#2792))
=======
>>>>>>> db696250b0 (GEOMESA-3113 Add system property to managing HBase deletes with visibilities (#2792))
=======
>>>>>>> 19e79eeeaa (GEOMESA-3113 Add system property to managing HBase deletes with visibilities (#2792))
=======
>>>>>>> 6449641e67 (GEOMESA-3113 Add system property to managing HBase deletes with visibilities (#2792))
=======
>>>>>>> b81683f4bc (GEOMESA-3113 Add system property to managing HBase deletes with visibilities (#2792))
=======
>>>>>>> abaa89e702 (GEOMESA-3102 Fix removal of user data in FileSystemDataStore.createSchema (#2787))
=======
>>>>>>> 7196beb2e1 (GEOMESA-3113 Add system property to managing HBase deletes with visibilities (#2792))
=======
=======
>>>>>>> 813cf035d0 (GEOMESA-3113 Add system property to managing HBase deletes with visibilities (#2792))
>>>>>>> 2b9cd40059 (GEOMESA-3113 Add system property to managing HBase deletes with visibilities (#2792))
=======
>>>>>>> ed36e40e7c (GEOMESA-3113 Add system property to managing HBase deletes with visibilities (#2792))
=======
=======
>>>>>>> a834a844c7 (GEOMESA-3113 Add system property to managing HBase deletes with visibilities (#2792))
>>>>>>> f68b76f4b8 (GEOMESA-3113 Add system property to managing HBase deletes with visibilities (#2792))
        val config = new JobConf(conf)
>>>>>>> 1a21a3c30 (GEOMESA-3113 Add system property to managing HBase deletes with visibilities (#2792))
=======
>>>>>>> 85d211ca2 (GEOMESA-3102 Fix removal of user data in FileSystemDataStore.createSchema (#2787))
<<<<<<< HEAD
<<<<<<< HEAD
<<<<<<< HEAD
<<<<<<< HEAD
<<<<<<< HEAD
<<<<<<< HEAD
<<<<<<< HEAD
<<<<<<< HEAD
<<<<<<< HEAD
<<<<<<< HEAD
<<<<<<< HEAD
<<<<<<< HEAD
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
>>>>>>> 2b9cd40059 (GEOMESA-3113 Add system property to managing HBase deletes with visibilities (#2792))
=======
>>>>>>> ed36e40e7c (GEOMESA-3113 Add system property to managing HBase deletes with visibilities (#2792))
=======
>>>>>>> f68b76f4b8 (GEOMESA-3113 Add system property to managing HBase deletes with visibilities (#2792))
=======
>>>>>>> b586a90765 (GEOMESA-3113 Add system property to managing HBase deletes with visibilities (#2792))
=======
>>>>>>> 813cf035d0 (GEOMESA-3113 Add system property to managing HBase deletes with visibilities (#2792))
<<<<<<< HEAD
<<<<<<< HEAD
=======
>>>>>>> 7ac82c3dce (GEOMESA-3113 Add system property to managing HBase deletes with visibilities (#2792))
=======
>>>>>>> a834a844c7 (GEOMESA-3113 Add system property to managing HBase deletes with visibilities (#2792))
<<<<<<< HEAD
=======
>>>>>>> bc833b1448 (GEOMESA-3113 Add system property to managing HBase deletes with visibilities (#2792))
=======
>>>>>>> ec072ceda6 (GEOMESA-3113 Add system property to managing HBase deletes with visibilities (#2792))
=======
>>>>>>> db696250b0 (GEOMESA-3113 Add system property to managing HBase deletes with visibilities (#2792))
=======
>>>>>>> 19e79eeeaa (GEOMESA-3113 Add system property to managing HBase deletes with visibilities (#2792))
=======
>>>>>>> b81683f4bc (GEOMESA-3113 Add system property to managing HBase deletes with visibilities (#2792))
=======
>>>>>>> abaa89e702 (GEOMESA-3102 Fix removal of user data in FileSystemDataStore.createSchema (#2787))
=======
=======
>>>>>>> b586a90765 (GEOMESA-3113 Add system property to managing HBase deletes with visibilities (#2792))
>>>>>>> 7196beb2e1 (GEOMESA-3113 Add system property to managing HBase deletes with visibilities (#2792))
=======
>>>>>>> 2b9cd40059 (GEOMESA-3113 Add system property to managing HBase deletes with visibilities (#2792))
=======
=======
>>>>>>> 7ac82c3dce (GEOMESA-3113 Add system property to managing HBase deletes with visibilities (#2792))
>>>>>>> ed36e40e7c (GEOMESA-3113 Add system property to managing HBase deletes with visibilities (#2792))
=======
>>>>>>> f68b76f4b8 (GEOMESA-3113 Add system property to managing HBase deletes with visibilities (#2792))
>>>>>>> 02ddf6ca41 (GEOMESA-3102 Fix removal of user data in FileSystemDataStore.createSchema (#2787))
=======
>>>>>>> 0cdf3f2672 (GEOMESA-3113 Add system property to managing HBase deletes with visibilities (#2792))
<<<<<<< HEAD
<<<<<<< HEAD
<<<<<<< HEAD
<<<<<<< HEAD
<<<<<<< HEAD
<<<<<<< HEAD
=======
>>>>>>> 8524ef3a47 (GEOMESA-3113 Add system property to managing HBase deletes with visibilities (#2792))
=======
>>>>>>> d581fa3e8f (Merge branch 'feature/postgis-fixes')
=======
        val config = new JobConf(conf)
>>>>>>> 3be8d2a5a4 (Merge branch 'feature/postgis-fixes')
=======
>>>>>>> 5e66748475 (GEOMESA-3102 Fix removal of user data in FileSystemDataStore.createSchema (#2787))
<<<<<<< HEAD
<<<<<<< HEAD
<<<<<<< HEAD
<<<<<<< HEAD
<<<<<<< HEAD
<<<<<<< HEAD
=======
>>>>>>> b515d530a4 (GEOMESA-3113 Add system property to managing HBase deletes with visibilities (#2792))
=======
>>>>>>> c296484bff (GEOMESA-3113 Add system property to managing HBase deletes with visibilities (#2792))
=======
>>>>>>> b5ef5f3ffb (GEOMESA-3102 Fix removal of user data in FileSystemDataStore.createSchema (#2787))
=======
=======
>>>>>>> b515d530a4 (GEOMESA-3113 Add system property to managing HBase deletes with visibilities (#2792))
>>>>>>> a0d7cc16ab (GEOMESA-3113 Add system property to managing HBase deletes with visibilities (#2792))
=======
=======
        val config = new JobConf(conf)
>>>>>>> 1a21a3c30 (GEOMESA-3113 Add system property to managing HBase deletes with visibilities (#2792))
>>>>>>> 9814eb9768 (GEOMESA-3113 Add system property to managing HBase deletes with visibilities (#2792))
<<<<<<< HEAD
<<<<<<< HEAD
<<<<<<< HEAD
<<<<<<< HEAD
<<<<<<< HEAD
<<<<<<< HEAD
=======
>>>>>>> a0d7cc16ab (GEOMESA-3113 Add system property to managing HBase deletes with visibilities (#2792))
=======
>>>>>>> ae19085932 (GEOMESA-3102 Fix removal of user data in FileSystemDataStore.createSchema (#2787))
=======
=======
>>>>>>> dc17df6c0 (GEOMESA-3113 Add system property to managing HBase deletes with visibilities (#2792))
=======
<<<<<<< HEAD
<<<<<<< HEAD
<<<<<<< HEAD
<<<<<<< HEAD
<<<<<<< HEAD
<<<<<<< HEAD
=======
>>>>>>> 9bcc7591e5 (GEOMESA-3113 Add system property to managing HBase deletes with visibilities (#2792))
=======
>>>>>>> 98e607d2fa (GEOMESA-3113 Add system property to managing HBase deletes with visibilities (#2792))
>>>>>>> 0cdf3f267 (GEOMESA-3113 Add system property to managing HBase deletes with visibilities (#2792))
=======
>>>>>>> de3e57f03 (GEOMESA-3113 Add system property to managing HBase deletes with visibilities (#2792))
=======
<<<<<<< HEAD
<<<<<<< HEAD
<<<<<<< HEAD
<<<<<<< HEAD
=======
>>>>>>> ae19085932 (GEOMESA-3102 Fix removal of user data in FileSystemDataStore.createSchema (#2787))
=======
>>>>>>> 69016fbbb7 (GEOMESA-3113 Add system property to managing HBase deletes with visibilities (#2792))
=======
=======
=======
>>>>>>> 7ee0f1d494 (GEOMESA-3102 Fix removal of user data in FileSystemDataStore.createSchema (#2787))
<<<<<<< HEAD
<<<<<<< HEAD
=======
>>>>>>> fd0793971d (GEOMESA-3113 Add system property to managing HBase deletes with visibilities (#2792))
=======
>>>>>>> 0cdf3f267 (GEOMESA-3113 Add system property to managing HBase deletes with visibilities (#2792))
=======
>>>>>>> e41e9641d2 (GEOMESA-3113 Add system property to managing HBase deletes with visibilities (#2792))
<<<<<<< HEAD
<<<<<<< HEAD
=======
>>>>>>> e0644f7991 (GEOMESA-3113 Add system property to managing HBase deletes with visibilities (#2792))
=======
=======
=======
>>>>>>> f794648fd0 (GEOMESA-3102 Fix removal of user data in FileSystemDataStore.createSchema (#2787))
=======
>>>>>>> 8781a5befd (GEOMESA-3113 Add system property to managing HBase deletes with visibilities (#2792))
=======
>>>>>>> 0cdf3f267 (GEOMESA-3113 Add system property to managing HBase deletes with visibilities (#2792))
=======
>>>>>>> 1351a5baa4 (GEOMESA-3113 Add system property to managing HBase deletes with visibilities (#2792))
=======
>>>>>>> 083bb9617b (GEOMESA-3113 Add system property to managing HBase deletes with visibilities (#2792))
=======
>>>>>>> ae19085932 (GEOMESA-3102 Fix removal of user data in FileSystemDataStore.createSchema (#2787))
=======
=======
>>>>>>> fd0793971d (GEOMESA-3113 Add system property to managing HBase deletes with visibilities (#2792))
>>>>>>> 9bcc7591e5 (GEOMESA-3113 Add system property to managing HBase deletes with visibilities (#2792))
=======
>>>>>>> 98e607d2fa (GEOMESA-3113 Add system property to managing HBase deletes with visibilities (#2792))
=======
=======
>>>>>>> e0644f7991 (GEOMESA-3113 Add system property to managing HBase deletes with visibilities (#2792))
>>>>>>> 69016fbbb7 (GEOMESA-3113 Add system property to managing HBase deletes with visibilities (#2792))
        val config = new JobConf(conf)
>>>>>>> 1a21a3c30 (GEOMESA-3113 Add system property to managing HBase deletes with visibilities (#2792))
=======
>>>>>>> 85d211ca2 (GEOMESA-3102 Fix removal of user data in FileSystemDataStore.createSchema (#2787))
<<<<<<< HEAD
<<<<<<< HEAD
<<<<<<< HEAD
<<<<<<< HEAD
<<<<<<< HEAD
<<<<<<< HEAD
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
>>>>>>> 98e607d2fa (GEOMESA-3113 Add system property to managing HBase deletes with visibilities (#2792))
=======
>>>>>>> 69016fbbb7 (GEOMESA-3113 Add system property to managing HBase deletes with visibilities (#2792))
=======
>>>>>>> fd0793971d (GEOMESA-3113 Add system property to managing HBase deletes with visibilities (#2792))
=======
>>>>>>> e41e9641d2 (GEOMESA-3113 Add system property to managing HBase deletes with visibilities (#2792))
<<<<<<< HEAD
<<<<<<< HEAD
=======
>>>>>>> e0644f7991 (GEOMESA-3113 Add system property to managing HBase deletes with visibilities (#2792))
=======
>>>>>>> 8781a5befd (GEOMESA-3113 Add system property to managing HBase deletes with visibilities (#2792))
=======
>>>>>>> 1351a5baa4 (GEOMESA-3113 Add system property to managing HBase deletes with visibilities (#2792))
=======
>>>>>>> 083bb9617b (GEOMESA-3113 Add system property to managing HBase deletes with visibilities (#2792))
=======
>>>>>>> ae19085932 (GEOMESA-3102 Fix removal of user data in FileSystemDataStore.createSchema (#2787))
=======
=======
>>>>>>> fd0793971d (GEOMESA-3113 Add system property to managing HBase deletes with visibilities (#2792))
>>>>>>> 9bcc7591e5 (GEOMESA-3113 Add system property to managing HBase deletes with visibilities (#2792))
=======
>>>>>>> 98e607d2fa (GEOMESA-3113 Add system property to managing HBase deletes with visibilities (#2792))
=======
=======
>>>>>>> e0644f7991 (GEOMESA-3113 Add system property to managing HBase deletes with visibilities (#2792))
>>>>>>> 69016fbbb7 (GEOMESA-3113 Add system property to managing HBase deletes with visibilities (#2792))
>>>>>>> 7119f2c52a (GEOMESA-3102 Fix removal of user data in FileSystemDataStore.createSchema (#2787))
=======
>>>>>>> 8037623548 (GEOMESA-3113 Add system property to managing HBase deletes with visibilities (#2792))
=======
>>>>>>> f0b61142b0 (GEOMESA-3102 Fix removal of user data in FileSystemDataStore.createSchema (#2787))
=======
=======
>>>>>>> aa627812d (GEOMESA-3102 Fix removal of user data in FileSystemDataStore.createSchema (#2787))
<<<<<<< HEAD
<<<<<<< HEAD
>>>>>>> bd17bd131e (GEOMESA-3102 Fix removal of user data in FileSystemDataStore.createSchema (#2787))
=======
>>>>>>> ca22354dd7 (GEOMESA-3113 Add system property to managing HBase deletes with visibilities (#2792))
<<<<<<< HEAD
<<<<<<< HEAD
<<<<<<< HEAD
<<<<<<< HEAD
<<<<<<< HEAD
<<<<<<< HEAD
=======
>>>>>>> 34fd077439 (GEOMESA-3113 Add system property to managing HBase deletes with visibilities (#2792))
=======
>>>>>>> f58f87b448 (GEOMESA-3102 Fix removal of user data in FileSystemDataStore.createSchema (#2787))
=======
>>>>>>> ea0c690e2 (GEOMESA-3102 Fix removal of user data in FileSystemDataStore.createSchema (#2787))
>>>>>>> c385f79943 (GEOMESA-3102 Fix removal of user data in FileSystemDataStore.createSchema (#2787))
=======
=======
>>>>>>> 44b15e96d9 (GEOMESA-3113 Add system property to managing HBase deletes with visibilities (#2792))
=======
>>>>>>> 1b5719bd33 (GEOMESA-3113 Add system property to managing HBase deletes with visibilities (#2792))
=======
>>>>>>> 92feb5d273 (GEOMESA-3113 Add system property to managing HBase deletes with visibilities (#2792))
<<<<<<< HEAD
=======
>>>>>>> 44b15e96d9 (GEOMESA-3113 Add system property to managing HBase deletes with visibilities (#2792))
=======
>>>>>>> 1b5719bd33 (GEOMESA-3113 Add system property to managing HBase deletes with visibilities (#2792))
=======
>>>>>>> 92feb5d273 (GEOMESA-3113 Add system property to managing HBase deletes with visibilities (#2792))
<<<<<<< HEAD
=======
>>>>>>> 44b15e96d9 (GEOMESA-3113 Add system property to managing HBase deletes with visibilities (#2792))
=======
>>>>>>> 1b5719bd33 (GEOMESA-3113 Add system property to managing HBase deletes with visibilities (#2792))
=======
>>>>>>> 92feb5d273 (GEOMESA-3113 Add system property to managing HBase deletes with visibilities (#2792))
<<<<<<< HEAD
=======
>>>>>>> 44b15e96d9 (GEOMESA-3113 Add system property to managing HBase deletes with visibilities (#2792))
=======
>>>>>>> 1b5719bd33 (GEOMESA-3113 Add system property to managing HBase deletes with visibilities (#2792))
=======
>>>>>>> 92feb5d273 (GEOMESA-3113 Add system property to managing HBase deletes with visibilities (#2792))
<<<<<<< HEAD
>>>>>>> ea0c690e2 (GEOMESA-3102 Fix removal of user data in FileSystemDataStore.createSchema (#2787))
=======
=======
>>>>>>> 0cdf3f267 (GEOMESA-3113 Add system property to managing HBase deletes with visibilities (#2792))
<<<<<<< HEAD
=======
<<<<<<< HEAD
<<<<<<< HEAD
<<<<<<< HEAD
<<<<<<< HEAD
<<<<<<< HEAD
<<<<<<< HEAD
=======
>>>>>>> e41e9641d2 (GEOMESA-3113 Add system property to managing HBase deletes with visibilities (#2792))
=======
>>>>>>> e0644f7991 (GEOMESA-3113 Add system property to managing HBase deletes with visibilities (#2792))
>>>>>>> 7abafecb19 (GEOMESA-3113 Add system property to managing HBase deletes with visibilities (#2792))
=======
=======
<<<<<<< HEAD
=======
>>>>>>> b586a90765 (GEOMESA-3113 Add system property to managing HBase deletes with visibilities (#2792))
=======
>>>>>>> fd0793971d (GEOMESA-3113 Add system property to managing HBase deletes with visibilities (#2792))
<<<<<<< HEAD
>>>>>>> ec072ceda6 (GEOMESA-3113 Add system property to managing HBase deletes with visibilities (#2792))
=======
<<<<<<< HEAD
<<<<<<< HEAD
<<<<<<< HEAD
<<<<<<< HEAD
<<<<<<< HEAD
<<<<<<< HEAD
=======
>>>>>>> e41e9641d2 (GEOMESA-3113 Add system property to managing HBase deletes with visibilities (#2792))
=======
>>>>>>> e0644f7991 (GEOMESA-3113 Add system property to managing HBase deletes with visibilities (#2792))
>>>>>>> 7abafecb19 (GEOMESA-3113 Add system property to managing HBase deletes with visibilities (#2792))
=======
=======
<<<<<<< HEAD
=======
>>>>>>> b586a90765 (GEOMESA-3113 Add system property to managing HBase deletes with visibilities (#2792))
=======
>>>>>>> fd0793971d (GEOMESA-3113 Add system property to managing HBase deletes with visibilities (#2792))
=======
>>>>>>> 8781a5befd (GEOMESA-3113 Add system property to managing HBase deletes with visibilities (#2792))
<<<<<<< HEAD
>>>>>>> ea0c690e2 (GEOMESA-3102 Fix removal of user data in FileSystemDataStore.createSchema (#2787))
=======
=======
<<<<<<< HEAD
<<<<<<< HEAD
<<<<<<< HEAD
<<<<<<< HEAD
<<<<<<< HEAD
=======
>>>>>>> 7196beb2e1 (GEOMESA-3113 Add system property to managing HBase deletes with visibilities (#2792))
=======
>>>>>>> 9bcc7591e5 (GEOMESA-3113 Add system property to managing HBase deletes with visibilities (#2792))
>>>>>>> 7a3d004ad1 (GEOMESA-3113 Add system property to managing HBase deletes with visibilities (#2792))
=======
>>>>>>> 1b5719bd33 (GEOMESA-3113 Add system property to managing HBase deletes with visibilities (#2792))
=======
>>>>>>> de3e57f03 (GEOMESA-3113 Add system property to managing HBase deletes with visibilities (#2792))
=======
>>>>>>> 92feb5d273 (GEOMESA-3113 Add system property to managing HBase deletes with visibilities (#2792))
=======
<<<<<<< HEAD
<<<<<<< HEAD
<<<<<<< HEAD
<<<<<<< HEAD
=======
>>>>>>> 69016fbbb7 (GEOMESA-3113 Add system property to managing HBase deletes with visibilities (#2792))
>>>>>>> b586a90765 (GEOMESA-3113 Add system property to managing HBase deletes with visibilities (#2792))
=======
>>>>>>> 813cf035d0 (GEOMESA-3113 Add system property to managing HBase deletes with visibilities (#2792))
=======
<<<<<<< HEAD
<<<<<<< HEAD
=======
>>>>>>> ed36e40e7c (GEOMESA-3113 Add system property to managing HBase deletes with visibilities (#2792))
>>>>>>> 7abafecb19 (GEOMESA-3113 Add system property to managing HBase deletes with visibilities (#2792))
=======
>>>>>>> 7ac82c3dce (GEOMESA-3113 Add system property to managing HBase deletes with visibilities (#2792))
=======
<<<<<<< HEAD
<<<<<<< HEAD
=======
>>>>>>> 7a3d004ad1 (GEOMESA-3113 Add system property to managing HBase deletes with visibilities (#2792))
=======
<<<<<<< HEAD
<<<<<<< HEAD
>>>>>>> fd0793971d (GEOMESA-3113 Add system property to managing HBase deletes with visibilities (#2792))
=======
>>>>>>> 1b5719bd33 (GEOMESA-3113 Add system property to managing HBase deletes with visibilities (#2792))
=======
>>>>>>> e41e9641d2 (GEOMESA-3113 Add system property to managing HBase deletes with visibilities (#2792))
=======
>>>>>>> e0644f7991 (GEOMESA-3113 Add system property to managing HBase deletes with visibilities (#2792))
<<<<<<< HEAD
=======
>>>>>>> 7a3d004ad1 (GEOMESA-3113 Add system property to managing HBase deletes with visibilities (#2792))
=======
>>>>>>> 8781a5befd (GEOMESA-3113 Add system property to managing HBase deletes with visibilities (#2792))
=======
>>>>>>> 1b5719bd33 (GEOMESA-3113 Add system property to managing HBase deletes with visibilities (#2792))
=======
>>>>>>> 1351a5baa4 (GEOMESA-3113 Add system property to managing HBase deletes with visibilities (#2792))
=======
>>>>>>> 083bb9617b (GEOMESA-3113 Add system property to managing HBase deletes with visibilities (#2792))
=======
>>>>>>> b586a90765 (GEOMESA-3113 Add system property to managing HBase deletes with visibilities (#2792))
=======
>>>>>>> 7196beb2e1 (GEOMESA-3113 Add system property to managing HBase deletes with visibilities (#2792))
=======
>>>>>>> 2b9cd40059 (GEOMESA-3113 Add system property to managing HBase deletes with visibilities (#2792))
=======
>>>>>>> ed36e40e7c (GEOMESA-3113 Add system property to managing HBase deletes with visibilities (#2792))
=======
=======
>>>>>>> 7a3d004ad1 (GEOMESA-3113 Add system property to managing HBase deletes with visibilities (#2792))
=======
<<<<<<< HEAD
>>>>>>> fd0793971d (GEOMESA-3113 Add system property to managing HBase deletes with visibilities (#2792))
<<<<<<< HEAD
>>>>>>> 9bcc7591e5 (GEOMESA-3113 Add system property to managing HBase deletes with visibilities (#2792))
=======
=======
>>>>>>> 1b5719bd33 (GEOMESA-3113 Add system property to managing HBase deletes with visibilities (#2792))
=======
>>>>>>> e41e9641d2 (GEOMESA-3113 Add system property to managing HBase deletes with visibilities (#2792))
>>>>>>> 98e607d2fa (GEOMESA-3113 Add system property to managing HBase deletes with visibilities (#2792))
=======
>>>>>>> 69016fbbb7 (GEOMESA-3113 Add system property to managing HBase deletes with visibilities (#2792))
        val config = new JobConf(conf)
>>>>>>> 1a21a3c30 (GEOMESA-3113 Add system property to managing HBase deletes with visibilities (#2792))
>>>>>>> 595c43086 (GEOMESA-3113 Add system property to managing HBase deletes with visibilities (#2792))
<<<<<<< HEAD
<<<<<<< HEAD
<<<<<<< HEAD
<<<<<<< HEAD
<<<<<<< HEAD
<<<<<<< HEAD
<<<<<<< HEAD
<<<<<<< HEAD
<<<<<<< HEAD
<<<<<<< HEAD
<<<<<<< HEAD
<<<<<<< HEAD
<<<<<<< HEAD
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
>>>>>>> e0644f7991 (GEOMESA-3113 Add system property to managing HBase deletes with visibilities (#2792))
=======
>>>>>>> 083bb9617b (GEOMESA-3113 Add system property to managing HBase deletes with visibilities (#2792))
=======
>>>>>>> 7196beb2e1 (GEOMESA-3113 Add system property to managing HBase deletes with visibilities (#2792))
=======
>>>>>>> 2b9cd40059 (GEOMESA-3113 Add system property to managing HBase deletes with visibilities (#2792))
=======
>>>>>>> ed36e40e7c (GEOMESA-3113 Add system property to managing HBase deletes with visibilities (#2792))
=======
>>>>>>> 9bcc7591e5 (GEOMESA-3113 Add system property to managing HBase deletes with visibilities (#2792))
=======
>>>>>>> 98e607d2fa (GEOMESA-3113 Add system property to managing HBase deletes with visibilities (#2792))
=======
=======
>>>>>>> e0644f7991 (GEOMESA-3113 Add system property to managing HBase deletes with visibilities (#2792))
>>>>>>> 69016fbbb7 (GEOMESA-3113 Add system property to managing HBase deletes with visibilities (#2792))
=======
>>>>>>> 1b5719bd33 (GEOMESA-3113 Add system property to managing HBase deletes with visibilities (#2792))
=======
>>>>>>> 92feb5d273 (GEOMESA-3113 Add system property to managing HBase deletes with visibilities (#2792))
<<<<<<< HEAD
<<<<<<< HEAD
<<<<<<< HEAD
<<<<<<< HEAD
=======
>>>>>>> 69016fbbb7 (GEOMESA-3113 Add system property to managing HBase deletes with visibilities (#2792))
=======
>>>>>>> 813cf035d0 (GEOMESA-3113 Add system property to managing HBase deletes with visibilities (#2792))
=======
>>>>>>> 7ac82c3dce (GEOMESA-3113 Add system property to managing HBase deletes with visibilities (#2792))
<<<<<<< HEAD
<<<<<<< HEAD
=======
>>>>>>> fd0793971d (GEOMESA-3113 Add system property to managing HBase deletes with visibilities (#2792))
=======
=======
>>>>>>> 1b5719bd33 (GEOMESA-3113 Add system property to managing HBase deletes with visibilities (#2792))
>>>>>>> e41e9641d2 (GEOMESA-3113 Add system property to managing HBase deletes with visibilities (#2792))
<<<<<<< HEAD
<<<<<<< HEAD
=======
>>>>>>> e0644f7991 (GEOMESA-3113 Add system property to managing HBase deletes with visibilities (#2792))
=======
>>>>>>> ec072ceda6 (GEOMESA-3113 Add system property to managing HBase deletes with visibilities (#2792))
=======
>>>>>>> db696250b0 (GEOMESA-3113 Add system property to managing HBase deletes with visibilities (#2792))
=======
>>>>>>> 8781a5befd (GEOMESA-3113 Add system property to managing HBase deletes with visibilities (#2792))
=======
=======
>>>>>>> 1b5719bd33 (GEOMESA-3113 Add system property to managing HBase deletes with visibilities (#2792))
>>>>>>> 1351a5baa4 (GEOMESA-3113 Add system property to managing HBase deletes with visibilities (#2792))
=======
>>>>>>> 083bb9617b (GEOMESA-3113 Add system property to managing HBase deletes with visibilities (#2792))
=======
=======
>>>>>>> 813cf035d0 (GEOMESA-3113 Add system property to managing HBase deletes with visibilities (#2792))
>>>>>>> 2b9cd40059 (GEOMESA-3113 Add system property to managing HBase deletes with visibilities (#2792))
=======
>>>>>>> ed36e40e7c (GEOMESA-3113 Add system property to managing HBase deletes with visibilities (#2792))
=======
=======
>>>>>>> fd0793971d (GEOMESA-3113 Add system property to managing HBase deletes with visibilities (#2792))
>>>>>>> 9bcc7591e5 (GEOMESA-3113 Add system property to managing HBase deletes with visibilities (#2792))
=======
>>>>>>> 98e607d2fa (GEOMESA-3113 Add system property to managing HBase deletes with visibilities (#2792))
=======
=======
>>>>>>> e0644f7991 (GEOMESA-3113 Add system property to managing HBase deletes with visibilities (#2792))
>>>>>>> 69016fbbb7 (GEOMESA-3113 Add system property to managing HBase deletes with visibilities (#2792))
>>>>>>> dc17df6c0 (GEOMESA-3113 Add system property to managing HBase deletes with visibilities (#2792))
<<<<<<< HEAD
>>>>>>> 2d758409cd (GEOMESA-3113 Add system property to managing HBase deletes with visibilities (#2792))
=======
=======
>>>>>>> 74c6b7f8d (GEOMESA-3102 Fix removal of user data in FileSystemDataStore.createSchema (#2787))
<<<<<<< HEAD
>>>>>>> 5a7f445137 (GEOMESA-3102 Fix removal of user data in FileSystemDataStore.createSchema (#2787))
=======
=======
>>>>>>> 76328bb49 (GEOMESA-3102 Fix removal of user data in FileSystemDataStore.createSchema (#2787))
<<<<<<< HEAD
>>>>>>> 5c68fb7d18 (GEOMESA-3102 Fix removal of user data in FileSystemDataStore.createSchema (#2787))
=======
=======
<<<<<<< HEAD
<<<<<<< HEAD
>>>>>>> d83ac69cc5 (GEOMESA-3113 Add system property to managing HBase deletes with visibilities (#2792))
=======
>>>>>>> a1ccc017c6 (GEOMESA-3113 Add system property to managing HBase deletes with visibilities (#2792))
>>>>>>> 40a526e8a3 (GEOMESA-3113 Add system property to managing HBase deletes with visibilities (#2792))
=======
>>>>>>> a1ccc017c6 (GEOMESA-3113 Add system property to managing HBase deletes with visibilities (#2792))
=======
=======
        val config = new JobConf(conf)
>>>>>>> 1a21a3c30 (GEOMESA-3113 Add system property to managing HBase deletes with visibilities (#2792))
<<<<<<< HEAD
<<<<<<< HEAD
>>>>>>> f8f49130b (GEOMESA-3113 Add system property to managing HBase deletes with visibilities (#2792))
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
>>>>>>> 7e8f76c0f9 (GEOMESA-3102 Fix removal of user data in FileSystemDataStore.createSchema (#2787))
>>>>>>> 4a47c538bc (GEOMESA-3113 Add system property to managing HBase deletes with visibilities (#2792))
=======
=======
>>>>>>> 4f922d74c9 (GEOMESA-3102 Fix removal of user data in FileSystemDataStore.createSchema (#2787))
<<<<<<< HEAD
=======
=======
>>>>>>> 7e8f76c0f9 (GEOMESA-3102 Fix removal of user data in FileSystemDataStore.createSchema (#2787))
=======
=======
<<<<<<< HEAD
<<<<<<< HEAD
<<<<<<< HEAD
<<<<<<< HEAD
<<<<<<< HEAD
=======
>>>>>>> e9395c1096 (GEOMESA-3102 Fix removal of user data in FileSystemDataStore.createSchema (#2787))
=======
>>>>>>> d2e8dad373 (GEOMESA-3102 Fix removal of user data in FileSystemDataStore.createSchema (#2787))
>>>>>>> dc17df6c0 (GEOMESA-3113 Add system property to managing HBase deletes with visibilities (#2792))
=======
=======
>>>>>>> a358de35a (GEOMESA-3102 Fix removal of user data in FileSystemDataStore.createSchema (#2787))
<<<<<<< HEAD
<<<<<<< HEAD
=======
>>>>>>> 4f922d74c (GEOMESA-3102 Fix removal of user data in FileSystemDataStore.createSchema (#2787))
=======
=======
>>>>>>> 15429a51ce (GEOMESA-3102 Fix removal of user data in FileSystemDataStore.createSchema (#2787))
=======
>>>>>>> df9cd4f22d (GEOMESA-3113 Add system property to managing HBase deletes with visibilities (#2792))
=======
>>>>>>> c0b0589a14 (GEOMESA-3102 Fix removal of user data in FileSystemDataStore.createSchema (#2787))
=======
>>>>>>> 8317120c9b (GEOMESA-3102 Fix removal of user data in FileSystemDataStore.createSchema (#2787))
>>>>>>> 4a47c538bc (GEOMESA-3113 Add system property to managing HBase deletes with visibilities (#2792))
=======
=======
>>>>>>> 4f922d74c9 (GEOMESA-3102 Fix removal of user data in FileSystemDataStore.createSchema (#2787))
=======
=======
<<<<<<< HEAD
<<<<<<< HEAD
<<<<<<< HEAD
<<<<<<< HEAD
<<<<<<< HEAD
<<<<<<< HEAD
>>>>>>> 08ee2fed57 (GEOMESA-3102 Fix removal of user data in FileSystemDataStore.createSchema (#2787))
=======
>>>>>>> dc17df6c0 (GEOMESA-3113 Add system property to managing HBase deletes with visibilities (#2792))
=======
>>>>>>> dba8cb28c4 (GEOMESA-3113 Add system property to managing HBase deletes with visibilities (#2792))
=======
>>>>>>> e9395c1096 (GEOMESA-3102 Fix removal of user data in FileSystemDataStore.createSchema (#2787))
=======
=======
>>>>>>> 4f922d74c (GEOMESA-3102 Fix removal of user data in FileSystemDataStore.createSchema (#2787))
>>>>>>> d2e8dad373 (GEOMESA-3102 Fix removal of user data in FileSystemDataStore.createSchema (#2787))
=======
>>>>>>> dc17df6c0 (GEOMESA-3113 Add system property to managing HBase deletes with visibilities (#2792))
=======
>>>>>>> 2c630f9360 (GEOMESA-3113 Add system property to managing HBase deletes with visibilities (#2792))
=======
=======
>>>>>>> ef0351a168 (GEOMESA-3102 Fix removal of user data in FileSystemDataStore.createSchema (#2787))
=======
>>>>>>> d1d11691fd (GEOMESA-3113 Add system property to managing HBase deletes with visibilities (#2792))
=======
=======
>>>>>>> e9395c1096 (GEOMESA-3102 Fix removal of user data in FileSystemDataStore.createSchema (#2787))
>>>>>>> a738799968 (GEOMESA-3102 Fix removal of user data in FileSystemDataStore.createSchema (#2787))
=======
=======
>>>>>>> e9395c1096 (GEOMESA-3102 Fix removal of user data in FileSystemDataStore.createSchema (#2787))
=======
>>>>>>> d2e8dad373 (GEOMESA-3102 Fix removal of user data in FileSystemDataStore.createSchema (#2787))
>>>>>>> c8431d18e4 (GEOMESA-3102 Fix removal of user data in FileSystemDataStore.createSchema (#2787))
>>>>>>> dc17df6c0 (GEOMESA-3113 Add system property to managing HBase deletes with visibilities (#2792))
=======
=======
>>>>>>> a358de35a (GEOMESA-3102 Fix removal of user data in FileSystemDataStore.createSchema (#2787))
<<<<<<< HEAD
<<<<<<< HEAD
<<<<<<< HEAD
>>>>>>> 0cb32b7425 (GEOMESA-3102 Fix removal of user data in FileSystemDataStore.createSchema (#2787))
=======
=======
>>>>>>> a738799968 (GEOMESA-3102 Fix removal of user data in FileSystemDataStore.createSchema (#2787))
=======
>>>>>>> c8431d18e4 (GEOMESA-3102 Fix removal of user data in FileSystemDataStore.createSchema (#2787))
=======
>>>>>>> 4f922d74c (GEOMESA-3102 Fix removal of user data in FileSystemDataStore.createSchema (#2787))
<<<<<<< HEAD
>>>>>>> ef0351a168 (GEOMESA-3102 Fix removal of user data in FileSystemDataStore.createSchema (#2787))
=======
=======
=======
>>>>>>> 15429a51ce (GEOMESA-3102 Fix removal of user data in FileSystemDataStore.createSchema (#2787))
>>>>>>> 4a47c538bc (GEOMESA-3113 Add system property to managing HBase deletes with visibilities (#2792))
=======
=======
>>>>>>> 4f922d74c9 (GEOMESA-3102 Fix removal of user data in FileSystemDataStore.createSchema (#2787))
=======
=======
>>>>>>> 08ee2fed57 (GEOMESA-3102 Fix removal of user data in FileSystemDataStore.createSchema (#2787))
<<<<<<< HEAD
>>>>>>> c0b0589a14 (GEOMESA-3102 Fix removal of user data in FileSystemDataStore.createSchema (#2787))
=======
=======
>>>>>>> dc17df6c0 (GEOMESA-3113 Add system property to managing HBase deletes with visibilities (#2792))
=======
>>>>>>> dba8cb28c4 (GEOMESA-3113 Add system property to managing HBase deletes with visibilities (#2792))
<<<<<<< HEAD
>>>>>>> d1d11691fd (GEOMESA-3113 Add system property to managing HBase deletes with visibilities (#2792))
=======
=======
>>>>>>> e9395c1096 (GEOMESA-3102 Fix removal of user data in FileSystemDataStore.createSchema (#2787))
<<<<<<< HEAD
>>>>>>> a738799968 (GEOMESA-3102 Fix removal of user data in FileSystemDataStore.createSchema (#2787))
=======
=======
=======
>>>>>>> 4f922d74c (GEOMESA-3102 Fix removal of user data in FileSystemDataStore.createSchema (#2787))
>>>>>>> d2e8dad373 (GEOMESA-3102 Fix removal of user data in FileSystemDataStore.createSchema (#2787))
>>>>>>> c8431d18e4 (GEOMESA-3102 Fix removal of user data in FileSystemDataStore.createSchema (#2787))
        val config = new JobConf(conf)
>>>>>>> 1a21a3c30 (GEOMESA-3113 Add system property to managing HBase deletes with visibilities (#2792))
=======
>>>>>>> 85d211ca2 (GEOMESA-3102 Fix removal of user data in FileSystemDataStore.createSchema (#2787))
<<<<<<< HEAD
<<<<<<< HEAD
<<<<<<< HEAD
<<<<<<< HEAD
<<<<<<< HEAD
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
>>>>>>> a738799968 (GEOMESA-3102 Fix removal of user data in FileSystemDataStore.createSchema (#2787))
=======
>>>>>>> c8431d18e4 (GEOMESA-3102 Fix removal of user data in FileSystemDataStore.createSchema (#2787))
=======
>>>>>>> dba8cb28c4 (GEOMESA-3113 Add system property to managing HBase deletes with visibilities (#2792))
=======
>>>>>>> e9395c1096 (GEOMESA-3102 Fix removal of user data in FileSystemDataStore.createSchema (#2787))
<<<<<<< HEAD
<<<<<<< HEAD
=======
>>>>>>> d2e8dad373 (GEOMESA-3102 Fix removal of user data in FileSystemDataStore.createSchema (#2787))
=======
>>>>>>> 2c630f9360 (GEOMESA-3113 Add system property to managing HBase deletes with visibilities (#2792))
=======
>>>>>>> 0cb32b7425 (GEOMESA-3102 Fix removal of user data in FileSystemDataStore.createSchema (#2787))
=======
>>>>>>> ef0351a168 (GEOMESA-3102 Fix removal of user data in FileSystemDataStore.createSchema (#2787))
=======
>>>>>>> c0b0589a14 (GEOMESA-3102 Fix removal of user data in FileSystemDataStore.createSchema (#2787))
=======
=======
>>>>>>> dba8cb28c4 (GEOMESA-3113 Add system property to managing HBase deletes with visibilities (#2792))
>>>>>>> d1d11691fd (GEOMESA-3113 Add system property to managing HBase deletes with visibilities (#2792))
=======
>>>>>>> a738799968 (GEOMESA-3102 Fix removal of user data in FileSystemDataStore.createSchema (#2787))
=======
=======
>>>>>>> d2e8dad373 (GEOMESA-3102 Fix removal of user data in FileSystemDataStore.createSchema (#2787))
>>>>>>> c8431d18e4 (GEOMESA-3102 Fix removal of user data in FileSystemDataStore.createSchema (#2787))
>>>>>>> 02ddf6ca4 (GEOMESA-3102 Fix removal of user data in FileSystemDataStore.createSchema (#2787))
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
>>>>>>> 98e607d2fa (GEOMESA-3113 Add system property to managing HBase deletes with visibilities (#2792))
=======
>>>>>>> 15429a51ce (GEOMESA-3102 Fix removal of user data in FileSystemDataStore.createSchema (#2787))
=======
>>>>>>> e41e9641d2 (GEOMESA-3113 Add system property to managing HBase deletes with visibilities (#2792))
<<<<<<< HEAD
=======
>>>>>>> 7e8f76c0f9 (GEOMESA-3102 Fix removal of user data in FileSystemDataStore.createSchema (#2787))
=======
>>>>>>> 1351a5baa4 (GEOMESA-3113 Add system property to managing HBase deletes with visibilities (#2792))
=======
=======
>>>>>>> 15429a51ce (GEOMESA-3102 Fix removal of user data in FileSystemDataStore.createSchema (#2787))
>>>>>>> 8317120c9b (GEOMESA-3102 Fix removal of user data in FileSystemDataStore.createSchema (#2787))
=======
>>>>>>> 98e607d2fa (GEOMESA-3113 Add system property to managing HBase deletes with visibilities (#2792))
>>>>>>> a358de35a8 (GEOMESA-3102 Fix removal of user data in FileSystemDataStore.createSchema (#2787))
=======
=======
>>>>>>> 0cdf3f267 (GEOMESA-3113 Add system property to managing HBase deletes with visibilities (#2792))
<<<<<<< HEAD
<<<<<<< HEAD
<<<<<<< HEAD
<<<<<<< HEAD
<<<<<<< HEAD
<<<<<<< HEAD
<<<<<<< HEAD
<<<<<<< HEAD
<<<<<<< HEAD
<<<<<<< HEAD
<<<<<<< HEAD
<<<<<<< HEAD
<<<<<<< HEAD
<<<<<<< HEAD
<<<<<<< HEAD
<<<<<<< HEAD
<<<<<<< HEAD
<<<<<<< HEAD
<<<<<<< HEAD
<<<<<<< HEAD
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
>>>>>>> a8b2b56cbd (GEOMESA-3113 Add system property to managing HBase deletes with visibilities (#2792))
=======
>>>>>>> b6e56a9e80 (Merge branch 'feature/postgis-fixes')
=======
>>>>>>> 3d40465720 (GEOMESA-3113 Add system property to managing HBase deletes with visibilities (#2792))
=======
>>>>>>> 0a5b74c946 (Merge branch 'feature/postgis-fixes')
=======
>>>>>>> 9dd4a005eb (GEOMESA-3113 Add system property to managing HBase deletes with visibilities (#2792))
=======
>>>>>>> a30a0c1a2a (Merge branch 'feature/postgis-fixes')
=======
>>>>>>> 67de3c3202 (Merge branch 'feature/postgis-fixes')
=======
>>>>>>> e6162be24a (GEOMESA-3113 Add system property to managing HBase deletes with visibilities (#2792))
<<<<<<< HEAD
<<<<<<< HEAD
=======
>>>>>>> 638b68d081 (Merge branch 'feature/postgis-fixes')
=======
>>>>>>> 65460df3e6 (GEOMESA-3113 Add system property to managing HBase deletes with visibilities (#2792))
<<<<<<< HEAD
<<<<<<< HEAD
=======
>>>>>>> 71adb695c5 (Merge branch 'feature/postgis-fixes')
=======
>>>>>>> 9e74e1d9b4 (GEOMESA-3113 Add system property to managing HBase deletes with visibilities (#2792))
<<<<<<< HEAD
<<<<<<< HEAD
=======
>>>>>>> 30559ea5c9 (Merge branch 'feature/postgis-fixes')
=======
>>>>>>> ed25decdd5 (Merge branch 'feature/postgis-fixes')
=======
>>>>>>> 665046a461 (GEOMESA-3113 Add system property to managing HBase deletes with visibilities (#2792))
=======
>>>>>>> f893d9a594 (Merge branch 'feature/postgis-fixes')
=======
>>>>>>> ad7a284ebe (GEOMESA-3113 Add system property to managing HBase deletes with visibilities (#2792))
=======
>>>>>>> 964e86145a (Merge branch 'feature/postgis-fixes')
=======
>>>>>>> d9ec67b278 (GEOMESA-3113 Add system property to managing HBase deletes with visibilities (#2792))
=======
>>>>>>> bf6bde0830 (Merge branch 'feature/postgis-fixes')
=======
=======
>>>>>>> 67de3c3202 (Merge branch 'feature/postgis-fixes')
>>>>>>> 217b7d1cb9 (Merge branch 'feature/postgis-fixes')
=======
>>>>>>> a8b2b56cbd (GEOMESA-3113 Add system property to managing HBase deletes with visibilities (#2792))
=======
=======
>>>>>>> 638b68d081 (Merge branch 'feature/postgis-fixes')
>>>>>>> b6e56a9e80 (Merge branch 'feature/postgis-fixes')
=======
>>>>>>> 3d40465720 (GEOMESA-3113 Add system property to managing HBase deletes with visibilities (#2792))
=======
=======
>>>>>>> 71adb695c5 (Merge branch 'feature/postgis-fixes')
>>>>>>> 0a5b74c946 (Merge branch 'feature/postgis-fixes')
=======
>>>>>>> 9dd4a005eb (GEOMESA-3113 Add system property to managing HBase deletes with visibilities (#2792))
=======
=======
>>>>>>> 30559ea5c9 (Merge branch 'feature/postgis-fixes')
>>>>>>> a30a0c1a2a (Merge branch 'feature/postgis-fixes')
>>>>>>> 44b15e96d9 (GEOMESA-3113 Add system property to managing HBase deletes with visibilities (#2792))
=======
=======
>>>>>>> c14e106409 (GEOMESA-3113 Add system property to managing HBase deletes with visibilities (#2792))
=======
<<<<<<< HEAD
<<<<<<< HEAD
<<<<<<< HEAD
<<<<<<< HEAD
<<<<<<< HEAD
<<<<<<< HEAD
=======
>>>>>>> a8b2b56cbd (GEOMESA-3113 Add system property to managing HBase deletes with visibilities (#2792))
=======
>>>>>>> b6e56a9e80 (Merge branch 'feature/postgis-fixes')
>>>>>>> e944f1c88b (Merge branch 'feature/postgis-fixes')
=======
=======
<<<<<<< HEAD
<<<<<<< HEAD
<<<<<<< HEAD
<<<<<<< HEAD
<<<<<<< HEAD
<<<<<<< HEAD
>>>>>>> 26e5afc4ea (Merge branch 'feature/postgis-fixes')
=======
>>>>>>> 260d67442f (GEOMESA-3113 Add system property to managing HBase deletes with visibilities (#2792))
=======
>>>>>>> c69897d7bd (Merge branch 'feature/postgis-fixes')
=======
<<<<<<< HEAD
=======
>>>>>>> 26e5afc4ea (Merge branch 'feature/postgis-fixes')
=======
<<<<<<< HEAD
>>>>>>> 71adb695c5 (Merge branch 'feature/postgis-fixes')
=======
>>>>>>> 260d67442f (GEOMESA-3113 Add system property to managing HBase deletes with visibilities (#2792))
=======
>>>>>>> 9e74e1d9b4 (GEOMESA-3113 Add system property to managing HBase deletes with visibilities (#2792))
=======
>>>>>>> 30559ea5c9 (Merge branch 'feature/postgis-fixes')
>>>>>>> e5413df04f (GEOMESA-3113 Add system property to managing HBase deletes with visibilities (#2792))
>>>>>>> d38e17d229 (GEOMESA-3113 Add system property to managing HBase deletes with visibilities (#2792))
=======
>>>>>>> cb6bda89b6 (Merge branch 'feature/postgis-fixes')
=======
<<<<<<< HEAD
<<<<<<< HEAD
>>>>>>> e4ee051914 (GEOMESA-3113 Add system property to managing HBase deletes with visibilities (#2792))
=======
>>>>>>> 699117eca9 (Merge branch 'feature/postgis-fixes')
=======
<<<<<<< HEAD
=======
>>>>>>> e6162be24a (GEOMESA-3113 Add system property to managing HBase deletes with visibilities (#2792))
=======
>>>>>>> e944f1c88b (Merge branch 'feature/postgis-fixes')
=======
>>>>>>> 638b68d081 (Merge branch 'feature/postgis-fixes')
=======
>>>>>>> e5413df04f (GEOMESA-3113 Add system property to managing HBase deletes with visibilities (#2792))
>>>>>>> d38e17d229 (GEOMESA-3113 Add system property to managing HBase deletes with visibilities (#2792))
=======
>>>>>>> 65460df3e6 (GEOMESA-3113 Add system property to managing HBase deletes with visibilities (#2792))
=======
>>>>>>> 71adb695c5 (Merge branch 'feature/postgis-fixes')
=======
>>>>>>> e4ee051914 (GEOMESA-3113 Add system property to managing HBase deletes with visibilities (#2792))
=======
>>>>>>> 9e74e1d9b4 (GEOMESA-3113 Add system property to managing HBase deletes with visibilities (#2792))
=======
>>>>>>> 30559ea5c9 (Merge branch 'feature/postgis-fixes')
=======
>>>>>>> 665046a461 (GEOMESA-3113 Add system property to managing HBase deletes with visibilities (#2792))
=======
>>>>>>> e944f1c88b (Merge branch 'feature/postgis-fixes')
=======
>>>>>>> f893d9a594 (Merge branch 'feature/postgis-fixes')
=======
>>>>>>> e5413df04f (GEOMESA-3113 Add system property to managing HBase deletes with visibilities (#2792))
>>>>>>> d38e17d229 (GEOMESA-3113 Add system property to managing HBase deletes with visibilities (#2792))
=======
>>>>>>> ad7a284ebe (GEOMESA-3113 Add system property to managing HBase deletes with visibilities (#2792))
=======
=======
>>>>>>> 3d40465720 (GEOMESA-3113 Add system property to managing HBase deletes with visibilities (#2792))
=======
>>>>>>> 0a5b74c946 (Merge branch 'feature/postgis-fixes')
>>>>>>> 26e5afc4ea (Merge branch 'feature/postgis-fixes')
=======
>>>>>>> 260d67442f (GEOMESA-3113 Add system property to managing HBase deletes with visibilities (#2792))
=======
>>>>>>> c69897d7bd (Merge branch 'feature/postgis-fixes')
=======
<<<<<<< HEAD
=======
>>>>>>> 26e5afc4ea (Merge branch 'feature/postgis-fixes')
=======
<<<<<<< HEAD
>>>>>>> 71adb695c5 (Merge branch 'feature/postgis-fixes')
=======
>>>>>>> 260d67442f (GEOMESA-3113 Add system property to managing HBase deletes with visibilities (#2792))
=======
>>>>>>> 9e74e1d9b4 (GEOMESA-3113 Add system property to managing HBase deletes with visibilities (#2792))
=======
>>>>>>> 30559ea5c9 (Merge branch 'feature/postgis-fixes')
>>>>>>> e5413df04f (GEOMESA-3113 Add system property to managing HBase deletes with visibilities (#2792))
>>>>>>> d38e17d229 (GEOMESA-3113 Add system property to managing HBase deletes with visibilities (#2792))
=======
>>>>>>> cb6bda89b6 (Merge branch 'feature/postgis-fixes')
=======
<<<<<<< HEAD
<<<<<<< HEAD
<<<<<<< HEAD
>>>>>>> 964e86145a (Merge branch 'feature/postgis-fixes')
=======
=======
>>>>>>> 0a5b74c946 (Merge branch 'feature/postgis-fixes')
=======
>>>>>>> 9dd4a005eb (GEOMESA-3113 Add system property to managing HBase deletes with visibilities (#2792))
>>>>>>> e4ee051914 (GEOMESA-3113 Add system property to managing HBase deletes with visibilities (#2792))
=======
<<<<<<< HEAD
>>>>>>> d9ec67b278 (GEOMESA-3113 Add system property to managing HBase deletes with visibilities (#2792))
=======
>>>>>>> 699117eca9 (Merge branch 'feature/postgis-fixes')
=======
<<<<<<< HEAD
<<<<<<< HEAD
>>>>>>> bf6bde0830 (Merge branch 'feature/postgis-fixes')
=======
=======
>>>>>>> a30a0c1a2a (Merge branch 'feature/postgis-fixes')
=======
>>>>>>> e6162be24a (GEOMESA-3113 Add system property to managing HBase deletes with visibilities (#2792))
<<<<<<< HEAD
>>>>>>> a8b2b56cbd (GEOMESA-3113 Add system property to managing HBase deletes with visibilities (#2792))
=======
=======
>>>>>>> e944f1c88b (Merge branch 'feature/postgis-fixes')
=======
>>>>>>> 638b68d081 (Merge branch 'feature/postgis-fixes')
<<<<<<< HEAD
>>>>>>> b6e56a9e80 (Merge branch 'feature/postgis-fixes')
=======
=======
>>>>>>> e5413df04f (GEOMESA-3113 Add system property to managing HBase deletes with visibilities (#2792))
>>>>>>> d38e17d229 (GEOMESA-3113 Add system property to managing HBase deletes with visibilities (#2792))
=======
>>>>>>> 65460df3e6 (GEOMESA-3113 Add system property to managing HBase deletes with visibilities (#2792))
<<<<<<< HEAD
>>>>>>> 3d40465720 (GEOMESA-3113 Add system property to managing HBase deletes with visibilities (#2792))
=======
=======
>>>>>>> 71adb695c5 (Merge branch 'feature/postgis-fixes')
<<<<<<< HEAD
>>>>>>> 0a5b74c946 (Merge branch 'feature/postgis-fixes')
=======
=======
>>>>>>> e4ee051914 (GEOMESA-3113 Add system property to managing HBase deletes with visibilities (#2792))
=======
>>>>>>> 9e74e1d9b4 (GEOMESA-3113 Add system property to managing HBase deletes with visibilities (#2792))
<<<<<<< HEAD
>>>>>>> 9dd4a005eb (GEOMESA-3113 Add system property to managing HBase deletes with visibilities (#2792))
=======
=======
>>>>>>> 30559ea5c9 (Merge branch 'feature/postgis-fixes')
>>>>>>> a30a0c1a2a (Merge branch 'feature/postgis-fixes')
        val config = new JobConf(conf)
>>>>>>> 3be8d2a5a (Merge branch 'feature/postgis-fixes')
<<<<<<< HEAD
>>>>>>> db8d998aa2 (Merge branch 'feature/postgis-fixes')
=======
>>>>>>> d488f41800 (GEOMESA-3102 Fix removal of user data in FileSystemDataStore.createSchema (#2787))
=======
>>>>>>> 3c4fc5a828 (GEOMESA-3113 Add system property to managing HBase deletes with visibilities (#2792))
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
>>>>>>> 27eec0d076 (GEOMESA-3102 Fix removal of user data in FileSystemDataStore.createSchema (#2787))
=======
>>>>>>> dba8cb28c4 (GEOMESA-3113 Add system property to managing HBase deletes with visibilities (#2792))
=======
>>>>>>> f502df5b55 (GEOMESA-3102 Fix removal of user data in FileSystemDataStore.createSchema (#2787))
<<<<<<< HEAD
=======
>>>>>>> 2c630f9360 (GEOMESA-3113 Add system property to managing HBase deletes with visibilities (#2792))
=======
>>>>>>> 1382ba7fd3 (GEOMESA-3102 Fix removal of user data in FileSystemDataStore.createSchema (#2787))
=======
>>>>>>> 5d46ff705f (GEOMESA-3113 Add system property to managing HBase deletes with visibilities (#2792))
=======
=======
>>>>>>> dba8cb28c4 (GEOMESA-3113 Add system property to managing HBase deletes with visibilities (#2792))
>>>>>>> d1d11691fd (GEOMESA-3113 Add system property to managing HBase deletes with visibilities (#2792))
=======
>>>>>>> 27eec0d076 (GEOMESA-3102 Fix removal of user data in FileSystemDataStore.createSchema (#2787))
>>>>>>> ea0c690e2 (GEOMESA-3102 Fix removal of user data in FileSystemDataStore.createSchema (#2787))
=======
>>>>>>> 58f72e76c (GEOMESA-3113 Add system property to managing HBase deletes with visibilities (#2792))
=======
<<<<<<< HEAD
<<<<<<< HEAD
<<<<<<< HEAD
=======
>>>>>>> c6079ecae5 (GEOMESA-3113 Add system property to managing HBase deletes with visibilities (#2792))
=======
>>>>>>> dba8cb28c4 (GEOMESA-3113 Add system property to managing HBase deletes with visibilities (#2792))
=======
>>>>>>> 857489f8a0 (GEOMESA-3113 Add system property to managing HBase deletes with visibilities (#2792))
=======
>>>>>>> 2c630f9360 (GEOMESA-3113 Add system property to managing HBase deletes with visibilities (#2792))
=======
>>>>>>> d1d11691fd (GEOMESA-3113 Add system property to managing HBase deletes with visibilities (#2792))
=======
>>>>>>> c6079ecae5 (GEOMESA-3113 Add system property to managing HBase deletes with visibilities (#2792))
=======
>>>>>>> dba8cb28c4 (GEOMESA-3113 Add system property to managing HBase deletes with visibilities (#2792))
=======
        val config = new JobConf(conf)
>>>>>>> 1a21a3c30 (GEOMESA-3113 Add system property to managing HBase deletes with visibilities (#2792))
<<<<<<< HEAD
<<<<<<< HEAD
<<<<<<< HEAD
<<<<<<< HEAD
<<<<<<< HEAD
<<<<<<< HEAD
<<<<<<< HEAD
<<<<<<< HEAD
=======
>>>>>>> d1d11691fd (GEOMESA-3113 Add system property to managing HBase deletes with visibilities (#2792))
=======
>>>>>>> c6079ecae5 (GEOMESA-3113 Add system property to managing HBase deletes with visibilities (#2792))
=======
>>>>>>> dba8cb28c4 (GEOMESA-3113 Add system property to managing HBase deletes with visibilities (#2792))
<<<<<<< HEAD
=======
>>>>>>> 857489f8a0 (GEOMESA-3113 Add system property to managing HBase deletes with visibilities (#2792))
=======
>>>>>>> 2c630f9360 (GEOMESA-3113 Add system property to managing HBase deletes with visibilities (#2792))
=======
=======
>>>>>>> c6079ecae5 (GEOMESA-3113 Add system property to managing HBase deletes with visibilities (#2792))
>>>>>>> 5d46ff705f (GEOMESA-3113 Add system property to managing HBase deletes with visibilities (#2792))
=======
>>>>>>> d1d11691fd (GEOMESA-3113 Add system property to managing HBase deletes with visibilities (#2792))
>>>>>>> ac2d5a925f (GEOMESA-3113 Add system property to managing HBase deletes with visibilities (#2792))
=======
>>>>>>> 9c809610d5 (GEOMESA-3102 Fix removal of user data in FileSystemDataStore.createSchema (#2787))
=======
<<<<<<< HEAD
<<<<<<< HEAD
<<<<<<< HEAD
=======
>>>>>>> dc17df6c0 (GEOMESA-3113 Add system property to managing HBase deletes with visibilities (#2792))
=======
>>>>>>> 0cdf3f267 (GEOMESA-3113 Add system property to managing HBase deletes with visibilities (#2792))
=======
>>>>>>> ee2741585f (GEOMESA-3102 Fix removal of user data in FileSystemDataStore.createSchema (#2787))
=======
>>>>>>> dc17df6c0 (GEOMESA-3113 Add system property to managing HBase deletes with visibilities (#2792))
=======
>>>>>>> 0cdf3f267 (GEOMESA-3113 Add system property to managing HBase deletes with visibilities (#2792))
=======
>>>>>>> 8e7c6661dc (GEOMESA-3113 Add system property to managing HBase deletes with visibilities (#2792))
=======
>>>>>>> e518bfb9e2 (GEOMESA-3102 Fix removal of user data in FileSystemDataStore.createSchema (#2787))
=======
>>>>>>> 265d436467 (GEOMESA-3102 Fix removal of user data in FileSystemDataStore.createSchema (#2787))
=======
>>>>>>> dc17df6c0 (GEOMESA-3113 Add system property to managing HBase deletes with visibilities (#2792))
=======
>>>>>>> 0cdf3f267 (GEOMESA-3113 Add system property to managing HBase deletes with visibilities (#2792))
=======
>>>>>>> ee2741585f (GEOMESA-3102 Fix removal of user data in FileSystemDataStore.createSchema (#2787))
=======
>>>>>>> dc17df6c0 (GEOMESA-3113 Add system property to managing HBase deletes with visibilities (#2792))
=======
>>>>>>> 0cdf3f267 (GEOMESA-3113 Add system property to managing HBase deletes with visibilities (#2792))
=======
>>>>>>> 0d96d8bd55 (GEOMESA-3113 Add system property to managing HBase deletes with visibilities (#2792))
=======
=======
>>>>>>> 0cdf3f267 (GEOMESA-3113 Add system property to managing HBase deletes with visibilities (#2792))
=======
>>>>>>> 869683ad83 (GEOMESA-3113 Add system property to managing HBase deletes with visibilities (#2792))
        val config = new JobConf(conf)
>>>>>>> 1a21a3c30 (GEOMESA-3113 Add system property to managing HBase deletes with visibilities (#2792))
=======
>>>>>>> 85d211ca2 (GEOMESA-3102 Fix removal of user data in FileSystemDataStore.createSchema (#2787))
<<<<<<< HEAD
<<<<<<< HEAD
<<<<<<< HEAD
<<<<<<< HEAD
<<<<<<< HEAD
<<<<<<< HEAD
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
>>>>>>> 3571a41838 (GEOMESA-3113 Add system property to managing HBase deletes with visibilities (#2792))
=======
>>>>>>> d71c234711 (GEOMESA-3113 Add system property to managing HBase deletes with visibilities (#2792))
=======
>>>>>>> 7ce9817488 (GEOMESA-3113 Add system property to managing HBase deletes with visibilities (#2792))
=======
>>>>>>> 07c698faf4 (GEOMESA-3113 Add system property to managing HBase deletes with visibilities (#2792))
=======
>>>>>>> ee2741585f (GEOMESA-3102 Fix removal of user data in FileSystemDataStore.createSchema (#2787))
=======
>>>>>>> 1506607bc9 (GEOMESA-3113 Add system property to managing HBase deletes with visibilities (#2792))
<<<<<<< HEAD
<<<<<<< HEAD
=======
>>>>>>> ea5f19f56b (GEOMESA-3113 Add system property to managing HBase deletes with visibilities (#2792))
=======
>>>>>>> e518bfb9e2 (GEOMESA-3102 Fix removal of user data in FileSystemDataStore.createSchema (#2787))
=======
>>>>>>> 5a43551b62 (GEOMESA-3113 Add system property to managing HBase deletes with visibilities (#2792))
=======
>>>>>>> ce7c794944 (GEOMESA-3113 Add system property to managing HBase deletes with visibilities (#2792))
=======
=======
>>>>>>> ee2741585f (GEOMESA-3102 Fix removal of user data in FileSystemDataStore.createSchema (#2787))
>>>>>>> 265d436467 (GEOMESA-3102 Fix removal of user data in FileSystemDataStore.createSchema (#2787))
=======
>>>>>>> 7ce9817488 (GEOMESA-3113 Add system property to managing HBase deletes with visibilities (#2792))
=======
=======
>>>>>>> ea5f19f56b (GEOMESA-3113 Add system property to managing HBase deletes with visibilities (#2792))
>>>>>>> 07c698faf4 (GEOMESA-3113 Add system property to managing HBase deletes with visibilities (#2792))
>>>>>>> 9ce7ed900a (GEOMESA-3102 Fix removal of user data in FileSystemDataStore.createSchema (#2787))
=======
>>>>>>> 7abafecb19 (GEOMESA-3113 Add system property to managing HBase deletes with visibilities (#2792))
=======
>>>>>>> 7ef22a4bb2 (GEOMESA-3102 Fix removal of user data in FileSystemDataStore.createSchema (#2787))
=======
=======
>>>>>>> aa627812d (GEOMESA-3102 Fix removal of user data in FileSystemDataStore.createSchema (#2787))
>>>>>>> 2b62bcaeb4 (GEOMESA-3102 Fix removal of user data in FileSystemDataStore.createSchema (#2787))
=======
>>>>>>> afc081190b (GEOMESA-3113 Add system property to managing HBase deletes with visibilities (#2792))
<<<<<<< HEAD
<<<<<<< HEAD
<<<<<<< HEAD
<<<<<<< HEAD
<<<<<<< HEAD
=======
>>>>>>> 1b0d520fde (GEOMESA-3113 Add system property to managing HBase deletes with visibilities (#2792))
=======
>>>>>>> 871350de06 (GEOMESA-3102 Fix removal of user data in FileSystemDataStore.createSchema (#2787))
=======
=======
>>>>>>> a8e7273bb0 (GEOMESA-3113 Add system property to managing HBase deletes with visibilities (#2792))
=======
>>>>>>> 869683ad83 (GEOMESA-3113 Add system property to managing HBase deletes with visibilities (#2792))
>>>>>>> ea0c690e2 (GEOMESA-3102 Fix removal of user data in FileSystemDataStore.createSchema (#2787))
>>>>>>> 75f3f455ec (GEOMESA-3102 Fix removal of user data in FileSystemDataStore.createSchema (#2787))
=======
>>>>>>> dc17df6c0 (GEOMESA-3113 Add system property to managing HBase deletes with visibilities (#2792))
<<<<<<< HEAD
>>>>>>> 7a3d004ad1 (GEOMESA-3113 Add system property to managing HBase deletes with visibilities (#2792))
=======
=======
<<<<<<< HEAD
>>>>>>> 74c6b7f8d (GEOMESA-3102 Fix removal of user data in FileSystemDataStore.createSchema (#2787))
<<<<<<< HEAD
<<<<<<< HEAD
<<<<<<< HEAD
<<<<<<< HEAD
<<<<<<< HEAD
<<<<<<< HEAD
<<<<<<< HEAD
=======
>>>>>>> 853c43fc17 (GEOMESA-3102 Fix removal of user data in FileSystemDataStore.createSchema (#2787))
=======
>>>>>>> dfae24c155 (GEOMESA-3102 Fix removal of user data in FileSystemDataStore.createSchema (#2787))
=======
>>>>>>> 894b6a1a15 (GEOMESA-3102 Fix removal of user data in FileSystemDataStore.createSchema (#2787))
=======
=======
>>>>>>> 853c43fc17 (GEOMESA-3102 Fix removal of user data in FileSystemDataStore.createSchema (#2787))
>>>>>>> 2ec7d64046 (GEOMESA-3102 Fix removal of user data in FileSystemDataStore.createSchema (#2787))
>>>>>>> ce07ef89fe (GEOMESA-3102 Fix removal of user data in FileSystemDataStore.createSchema (#2787))
=======
=======
>>>>>>> 76328bb49 (GEOMESA-3102 Fix removal of user data in FileSystemDataStore.createSchema (#2787))
<<<<<<< HEAD
<<<<<<< HEAD
<<<<<<< HEAD
<<<<<<< HEAD
<<<<<<< HEAD
<<<<<<< HEAD
<<<<<<< HEAD
=======
>>>>>>> 2ec7d64046 (GEOMESA-3102 Fix removal of user data in FileSystemDataStore.createSchema (#2787))
=======
>>>>>>> 344200f1df (GEOMESA-3113 Add system property to managing HBase deletes with visibilities (#2792))
>>>>>>> 8871b2b4bc (GEOMESA-3102 Fix removal of user data in FileSystemDataStore.createSchema (#2787))
=======
=======
>>>>>>> 0cdf3f267 (GEOMESA-3113 Add system property to managing HBase deletes with visibilities (#2792))
=======
<<<<<<< HEAD
<<<<<<< HEAD
<<<<<<< HEAD
=======
>>>>>>> 8871b2b4bc (GEOMESA-3102 Fix removal of user data in FileSystemDataStore.createSchema (#2787))
=======
=======
>>>>>>> e0056031ea (GEOMESA-3113 Add system property to managing HBase deletes with visibilities (#2792))
=======
>>>>>>> ea5f19f56b (GEOMESA-3113 Add system property to managing HBase deletes with visibilities (#2792))
=======
>>>>>>> ce7c794944 (GEOMESA-3113 Add system property to managing HBase deletes with visibilities (#2792))
=======
>>>>>>> 07c698faf4 (GEOMESA-3113 Add system property to managing HBase deletes with visibilities (#2792))
=======
>>>>>>> 8871b2b4bc (GEOMESA-3102 Fix removal of user data in FileSystemDataStore.createSchema (#2787))
=======
=======
>>>>>>> e0056031ea (GEOMESA-3113 Add system property to managing HBase deletes with visibilities (#2792))
=======
>>>>>>> ea5f19f56b (GEOMESA-3113 Add system property to managing HBase deletes with visibilities (#2792))
=======
>>>>>>> 0cdf3f267 (GEOMESA-3113 Add system property to managing HBase deletes with visibilities (#2792))
=======
>>>>>>> 869683ad83 (GEOMESA-3113 Add system property to managing HBase deletes with visibilities (#2792))
=======
        val config = new JobConf(conf)
>>>>>>> 1a21a3c30 (GEOMESA-3113 Add system property to managing HBase deletes with visibilities (#2792))
>>>>>>> f8f49130b (GEOMESA-3113 Add system property to managing HBase deletes with visibilities (#2792))
>>>>>>> 91b0d6a888 (GEOMESA-3113 Add system property to managing HBase deletes with visibilities (#2792))
<<<<<<< HEAD
=======
>>>>>>> 4f922d74c9 (GEOMESA-3102 Fix removal of user data in FileSystemDataStore.createSchema (#2787))
=======
=======
>>>>>>> 0cdf3f267 (GEOMESA-3113 Add system property to managing HBase deletes with visibilities (#2792))
>>>>>>> 1b5719bd33 (GEOMESA-3113 Add system property to managing HBase deletes with visibilities (#2792))
=======
=======
        val config = new JobConf(conf)
>>>>>>> 3be8d2a5a (Merge branch 'feature/postgis-fixes')
>>>>>>> 1b25d7ddb4 (Merge branch 'feature/postgis-fixes')
<<<<<<< HEAD
<<<<<<< HEAD
<<<<<<< HEAD
<<<<<<< HEAD
<<<<<<< HEAD
<<<<<<< HEAD
=======
>>>>>>> 217b7d1cb9 (Merge branch 'feature/postgis-fixes')
=======
>>>>>>> 5d46ff705f (GEOMESA-3113 Add system property to managing HBase deletes with visibilities (#2792))
=======
=======
>>>>>>> 8a234c7900 (GEOMESA-3113 Add system property to managing HBase deletes with visibilities (#2792))
>>>>>>> 84634d919 (GEOMESA-3113 Add system property to managing HBase deletes with visibilities (#2792))
<<<<<<< HEAD
>>>>>>> 3c4fc5a828 (GEOMESA-3113 Add system property to managing HBase deletes with visibilities (#2792))
=======
=======
>>>>>>> de3e57f03 (GEOMESA-3113 Add system property to managing HBase deletes with visibilities (#2792))
<<<<<<< HEAD
>>>>>>> 92feb5d273 (GEOMESA-3113 Add system property to managing HBase deletes with visibilities (#2792))
=======
=======
>>>>>>> 113b056da (GEOMESA-3113 Add system property to managing HBase deletes with visibilities (#2792))
<<<<<<< HEAD
<<<<<<< HEAD
<<<<<<< HEAD
<<<<<<< HEAD
<<<<<<< HEAD
<<<<<<< HEAD
<<<<<<< HEAD
=======
>>>>>>> dba8cb28c4 (GEOMESA-3113 Add system property to managing HBase deletes with visibilities (#2792))
=======
>>>>>>> 2c630f9360 (GEOMESA-3113 Add system property to managing HBase deletes with visibilities (#2792))
=======
>>>>>>> d73ae82492 (GEOMESA-3113 Add system property to managing HBase deletes with visibilities (#2792))
=======
=======
>>>>>>> dba8cb28c4 (GEOMESA-3113 Add system property to managing HBase deletes with visibilities (#2792))
>>>>>>> d1d11691fd (GEOMESA-3113 Add system property to managing HBase deletes with visibilities (#2792))
>>>>>>> 6f73f22005 (GEOMESA-3113 Add system property to managing HBase deletes with visibilities (#2792))
=======
=======
>>>>>>> 595c43086 (GEOMESA-3113 Add system property to managing HBase deletes with visibilities (#2792))
<<<<<<< HEAD
<<<<<<< HEAD
<<<<<<< HEAD
<<<<<<< HEAD
<<<<<<< HEAD
<<<<<<< HEAD
=======
=======
>>>>>>> 3571a41838 (GEOMESA-3113 Add system property to managing HBase deletes with visibilities (#2792))
<<<<<<< HEAD
<<<<<<< HEAD
=======
>>>>>>> ea5f19f56b (GEOMESA-3113 Add system property to managing HBase deletes with visibilities (#2792))
<<<<<<< HEAD
=======
>>>>>>> ce7c794944 (GEOMESA-3113 Add system property to managing HBase deletes with visibilities (#2792))
=======
>>>>>>> d1d11691fd (GEOMESA-3113 Add system property to managing HBase deletes with visibilities (#2792))
=======
=======
>>>>>>> ea5f19f56b (GEOMESA-3113 Add system property to managing HBase deletes with visibilities (#2792))
>>>>>>> 07c698faf4 (GEOMESA-3113 Add system property to managing HBase deletes with visibilities (#2792))
=======
>>>>>>> locationtech-main
=======
>>>>>>> 869683ad83 (GEOMESA-3113 Add system property to managing HBase deletes with visibilities (#2792))
>>>>>>> 3571a41838 (GEOMESA-3113 Add system property to managing HBase deletes with visibilities (#2792))
>>>>>>> dc17df6c0 (GEOMESA-3113 Add system property to managing HBase deletes with visibilities (#2792))
<<<<<<< HEAD
>>>>>>> 58f72e76c (GEOMESA-3113 Add system property to managing HBase deletes with visibilities (#2792))
<<<<<<< HEAD
>>>>>>> 8a234c7900 (GEOMESA-3113 Add system property to managing HBase deletes with visibilities (#2792))
=======
=======
=======
>>>>>>> 74c6b7f8d (GEOMESA-3102 Fix removal of user data in FileSystemDataStore.createSchema (#2787))
=======
>>>>>>> 76328bb49 (GEOMESA-3102 Fix removal of user data in FileSystemDataStore.createSchema (#2787))
=======
=======
        val config = new JobConf(conf)
>>>>>>> 1a21a3c30 (GEOMESA-3113 Add system property to managing HBase deletes with visibilities (#2792))
>>>>>>> f8f49130b (GEOMESA-3113 Add system property to managing HBase deletes with visibilities (#2792))
<<<<<<< HEAD
<<<<<<< HEAD
>>>>>>> 4c9fb0f6e (GEOMESA-3113 Add system property to managing HBase deletes with visibilities (#2792))
<<<<<<< HEAD
>>>>>>> b51d3046a2 (GEOMESA-3113 Add system property to managing HBase deletes with visibilities (#2792))
=======
=======
>>>>>>> 72415e208a (GEOMESA-3113 Add system property to managing HBase deletes with visibilities (#2792))
<<<<<<< HEAD
>>>>>>> c14e106409 (GEOMESA-3113 Add system property to managing HBase deletes with visibilities (#2792))
=======
=======
=======
        val config = new JobConf(conf)
>>>>>>> 3be8d2a5a (Merge branch 'feature/postgis-fixes')
>>>>>>> e8cc4971c6 (Merge branch 'feature/postgis-fixes')
<<<<<<< HEAD
<<<<<<< HEAD
<<<<<<< HEAD
<<<<<<< HEAD
<<<<<<< HEAD
<<<<<<< HEAD
<<<<<<< HEAD
=======
>>>>>>> f502df5b55 (GEOMESA-3102 Fix removal of user data in FileSystemDataStore.createSchema (#2787))
=======
>>>>>>> 1382ba7fd3 (GEOMESA-3102 Fix removal of user data in FileSystemDataStore.createSchema (#2787))
=======
>>>>>>> b6e56a9e80 (Merge branch 'feature/postgis-fixes')
=======
=======
>>>>>>> f502df5b55 (GEOMESA-3102 Fix removal of user data in FileSystemDataStore.createSchema (#2787))
>>>>>>> 27eec0d076 (GEOMESA-3102 Fix removal of user data in FileSystemDataStore.createSchema (#2787))
>>>>>>> e944f1c88b (Merge branch 'feature/postgis-fixes')
=======
=======
>>>>>>> 5e6674847 (GEOMESA-3102 Fix removal of user data in FileSystemDataStore.createSchema (#2787))
<<<<<<< HEAD
<<<<<<< HEAD
<<<<<<< HEAD
<<<<<<< HEAD
<<<<<<< HEAD
<<<<<<< HEAD
<<<<<<< HEAD
=======
>>>>>>> 27eec0d076 (GEOMESA-3102 Fix removal of user data in FileSystemDataStore.createSchema (#2787))
=======
>>>>>>> afcf525d7d (GEOMESA-3113 Add system property to managing HBase deletes with visibilities (#2792))
>>>>>>> 5521d97d99 (GEOMESA-3102 Fix removal of user data in FileSystemDataStore.createSchema (#2787))
<<<<<<< HEAD
>>>>>>> 0e67f36558 (GEOMESA-3102 Fix removal of user data in FileSystemDataStore.createSchema (#2787))
=======
=======
=======
=======
        val config = new JobConf(conf)
>>>>>>> 1a21a3c30 (GEOMESA-3113 Add system property to managing HBase deletes with visibilities (#2792))
>>>>>>> 9814eb976 (GEOMESA-3113 Add system property to managing HBase deletes with visibilities (#2792))
<<<<<<< HEAD
<<<<<<< HEAD
<<<<<<< HEAD
<<<<<<< HEAD
=======
>>>>>>> e11c16ba5d (GEOMESA-3102 Fix removal of user data in FileSystemDataStore.createSchema (#2787))
>>>>>>> 26fc359a06 (GEOMESA-3113 Add system property to managing HBase deletes with visibilities (#2792))
<<<<<<< HEAD
>>>>>>> 56f97cd271 (GEOMESA-3113 Add system property to managing HBase deletes with visibilities (#2792))
=======
=======
=======
=======
>>>>>>> 7abafecb1 (GEOMESA-3113 Add system property to managing HBase deletes with visibilities (#2792))
=======
<<<<<<< HEAD
<<<<<<< HEAD
<<<<<<< HEAD
<<<<<<< HEAD
<<<<<<< HEAD
<<<<<<< HEAD
=======
>>>>>>> ffdb14e2a7 (GEOMESA-3102 Fix removal of user data in FileSystemDataStore.createSchema (#2787))
=======
>>>>>>> 48bb106de6 (GEOMESA-3102 Fix removal of user data in FileSystemDataStore.createSchema (#2787))
=======
>>>>>>> 5af1e798d5 (GEOMESA-3113 Add system property to managing HBase deletes with visibilities (#2792))
=======
=======
>>>>>>> ffdb14e2a7 (GEOMESA-3102 Fix removal of user data in FileSystemDataStore.createSchema (#2787))
>>>>>>> 6f245b0cc5 (GEOMESA-3102 Fix removal of user data in FileSystemDataStore.createSchema (#2787))
=======
=======
=======
>>>>>>> 98ce8bad96 (GEOMESA-3102 Fix removal of user data in FileSystemDataStore.createSchema (#2787))
<<<<<<< HEAD
<<<<<<< HEAD
<<<<<<< HEAD
<<<<<<< HEAD
=======
>>>>>>> 6f245b0cc5 (GEOMESA-3102 Fix removal of user data in FileSystemDataStore.createSchema (#2787))
=======
>>>>>>> 54da398207 (GEOMESA-3113 Add system property to managing HBase deletes with visibilities (#2792))
=======
>>>>>>> ffdb14e2a7 (GEOMESA-3102 Fix removal of user data in FileSystemDataStore.createSchema (#2787))
<<<<<<< HEAD
=======
>>>>>>> 02a91455d8 (GEOMESA-3113 Add system property to managing HBase deletes with visibilities (#2792))
=======
>>>>>>> 48bb106de6 (GEOMESA-3102 Fix removal of user data in FileSystemDataStore.createSchema (#2787))
=======
=======
>>>>>>> 54da398207 (GEOMESA-3113 Add system property to managing HBase deletes with visibilities (#2792))
>>>>>>> 5af1e798d5 (GEOMESA-3113 Add system property to managing HBase deletes with visibilities (#2792))
=======
>>>>>>> 6f245b0cc5 (GEOMESA-3102 Fix removal of user data in FileSystemDataStore.createSchema (#2787))
        val config = new JobConf(conf)
>>>>>>> 1a21a3c30 (GEOMESA-3113 Add system property to managing HBase deletes with visibilities (#2792))
=======
>>>>>>> 85d211ca2 (GEOMESA-3102 Fix removal of user data in FileSystemDataStore.createSchema (#2787))
<<<<<<< HEAD
<<<<<<< HEAD
<<<<<<< HEAD
<<<<<<< HEAD
<<<<<<< HEAD
<<<<<<< HEAD
<<<<<<< HEAD
<<<<<<< HEAD
=======
>>>>>>> 6f245b0cc5 (GEOMESA-3102 Fix removal of user data in FileSystemDataStore.createSchema (#2787))
=======
>>>>>>> 54da398207 (GEOMESA-3113 Add system property to managing HBase deletes with visibilities (#2792))
=======
>>>>>>> ffdb14e2a7 (GEOMESA-3102 Fix removal of user data in FileSystemDataStore.createSchema (#2787))
<<<<<<< HEAD
=======
>>>>>>> 02a91455d8 (GEOMESA-3113 Add system property to managing HBase deletes with visibilities (#2792))
=======
>>>>>>> 48bb106de6 (GEOMESA-3102 Fix removal of user data in FileSystemDataStore.createSchema (#2787))
=======
=======
>>>>>>> 54da398207 (GEOMESA-3113 Add system property to managing HBase deletes with visibilities (#2792))
>>>>>>> 5af1e798d5 (GEOMESA-3113 Add system property to managing HBase deletes with visibilities (#2792))
=======
>>>>>>> 6f245b0cc5 (GEOMESA-3102 Fix removal of user data in FileSystemDataStore.createSchema (#2787))
>>>>>>> 7119f2c52 (GEOMESA-3102 Fix removal of user data in FileSystemDataStore.createSchema (#2787))
<<<<<<< HEAD
>>>>>>> adf2ac19a8 (GEOMESA-3102 Fix removal of user data in FileSystemDataStore.createSchema (#2787))
<<<<<<< HEAD
>>>>>>> 89ea8190e2 (GEOMESA-3102 Fix removal of user data in FileSystemDataStore.createSchema (#2787))
=======
=======
=======
>>>>>>> 803762354 (GEOMESA-3113 Add system property to managing HBase deletes with visibilities (#2792))
<<<<<<< HEAD
>>>>>>> e62505d539 (GEOMESA-3113 Add system property to managing HBase deletes with visibilities (#2792))
<<<<<<< HEAD
>>>>>>> 3226e92d8e (GEOMESA-3113 Add system property to managing HBase deletes with visibilities (#2792))
=======
=======
=======
>>>>>>> f0b61142b (GEOMESA-3102 Fix removal of user data in FileSystemDataStore.createSchema (#2787))
<<<<<<< HEAD
<<<<<<< HEAD
<<<<<<< HEAD
<<<<<<< HEAD
=======
>>>>>>> 5742320897 (GEOMESA-3102 Fix removal of user data in FileSystemDataStore.createSchema (#2787))
>>>>>>> 0a6aff78fb (GEOMESA-3102 Fix removal of user data in FileSystemDataStore.createSchema (#2787))
<<<<<<< HEAD
>>>>>>> d9cabf401c (GEOMESA-3102 Fix removal of user data in FileSystemDataStore.createSchema (#2787))
=======
=======
=======
=======
>>>>>>> aa627812d (GEOMESA-3102 Fix removal of user data in FileSystemDataStore.createSchema (#2787))
>>>>>>> bd17bd131 (GEOMESA-3102 Fix removal of user data in FileSystemDataStore.createSchema (#2787))
<<<<<<< HEAD
<<<<<<< HEAD
<<<<<<< HEAD
<<<<<<< HEAD
=======
>>>>>>> c43c29e91c (GEOMESA-3113 Add system property to managing HBase deletes with visibilities (#2792))
>>>>>>> c555446b8b (GEOMESA-3102 Fix removal of user data in FileSystemDataStore.createSchema (#2787))
<<<<<<< HEAD
>>>>>>> 1230d64006 (GEOMESA-3102 Fix removal of user data in FileSystemDataStore.createSchema (#2787))
=======
=======
=======
>>>>>>> ca22354dd (GEOMESA-3113 Add system property to managing HBase deletes with visibilities (#2792))
<<<<<<< HEAD
<<<<<<< HEAD
<<<<<<< HEAD
<<<<<<< HEAD
=======
>>>>>>> 78439fc2da (GEOMESA-3102 Fix removal of user data in FileSystemDataStore.createSchema (#2787))
>>>>>>> 797b02396b (GEOMESA-3113 Add system property to managing HBase deletes with visibilities (#2792))
<<<<<<< HEAD
>>>>>>> cd5564bac6 (GEOMESA-3113 Add system property to managing HBase deletes with visibilities (#2792))
=======
=======
=======
>>>>>>> ea0c690e2 (GEOMESA-3102 Fix removal of user data in FileSystemDataStore.createSchema (#2787))
>>>>>>> c385f7994 (GEOMESA-3102 Fix removal of user data in FileSystemDataStore.createSchema (#2787))
<<<<<<< HEAD
<<<<<<< HEAD
<<<<<<< HEAD
<<<<<<< HEAD
=======
>>>>>>> 64c0e084b5 (GEOMESA-3113 Add system property to managing HBase deletes with visibilities (#2792))
>>>>>>> 3171e7407d (GEOMESA-3102 Fix removal of user data in FileSystemDataStore.createSchema (#2787))
<<<<<<< HEAD
>>>>>>> 038b4ca087 (GEOMESA-3102 Fix removal of user data in FileSystemDataStore.createSchema (#2787))
=======
=======
=======
=======
>>>>>>> bc833b1448 (GEOMESA-3113 Add system property to managing HBase deletes with visibilities (#2792))
<<<<<<< HEAD
>>>>>>> ea0c690e2 (GEOMESA-3102 Fix removal of user data in FileSystemDataStore.createSchema (#2787))
=======
=======
<<<<<<< HEAD
<<<<<<< HEAD
>>>>>>> 7abafecb1 (GEOMESA-3113 Add system property to managing HBase deletes with visibilities (#2792))
=======
<<<<<<< HEAD
<<<<<<< HEAD
<<<<<<< HEAD
<<<<<<< HEAD
<<<<<<< HEAD
=======
>>>>>>> 5af1e798d5 (GEOMESA-3113 Add system property to managing HBase deletes with visibilities (#2792))
=======
>>>>>>> f68b76f4b8 (GEOMESA-3113 Add system property to managing HBase deletes with visibilities (#2792))
>>>>>>> 0c12a2c53d (GEOMESA-3113 Add system property to managing HBase deletes with visibilities (#2792))
=======
>>>>>>> 6449641e67 (GEOMESA-3113 Add system property to managing HBase deletes with visibilities (#2792))
=======
=======
>>>>>>> 54da398207 (GEOMESA-3113 Add system property to managing HBase deletes with visibilities (#2792))
=======
<<<<<<< HEAD
<<<<<<< HEAD
>>>>>>> 0c12a2c53d (GEOMESA-3113 Add system property to managing HBase deletes with visibilities (#2792))
=======
<<<<<<< HEAD
>>>>>>> a834a844c7 (GEOMESA-3113 Add system property to managing HBase deletes with visibilities (#2792))
=======
>>>>>>> 7abafecb1 (GEOMESA-3113 Add system property to managing HBase deletes with visibilities (#2792))
=======
>>>>>>> 02a91455d8 (GEOMESA-3113 Add system property to managing HBase deletes with visibilities (#2792))
=======
>>>>>>> 0c12a2c53d (GEOMESA-3113 Add system property to managing HBase deletes with visibilities (#2792))
=======
>>>>>>> 19e79eeeaa (GEOMESA-3113 Add system property to managing HBase deletes with visibilities (#2792))
=======
>>>>>>> 6449641e67 (GEOMESA-3113 Add system property to managing HBase deletes with visibilities (#2792))
=======
>>>>>>> b81683f4bc (GEOMESA-3113 Add system property to managing HBase deletes with visibilities (#2792))
=======
=======
>>>>>>> 5af1e798d5 (GEOMESA-3113 Add system property to managing HBase deletes with visibilities (#2792))
=======
>>>>>>> 0c12a2c53d (GEOMESA-3113 Add system property to managing HBase deletes with visibilities (#2792))
=======
>>>>>>> a834a844c7 (GEOMESA-3113 Add system property to managing HBase deletes with visibilities (#2792))
=======
>>>>>>> f68b76f4b8 (GEOMESA-3113 Add system property to managing HBase deletes with visibilities (#2792))
        val config = new JobConf(conf)
>>>>>>> 1a21a3c30 (GEOMESA-3113 Add system property to managing HBase deletes with visibilities (#2792))
>>>>>>> 595c43086 (GEOMESA-3113 Add system property to managing HBase deletes with visibilities (#2792))
<<<<<<< HEAD
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
>>>>>>> f68b76f4b8 (GEOMESA-3113 Add system property to managing HBase deletes with visibilities (#2792))
=======
>>>>>>> 54da398207 (GEOMESA-3113 Add system property to managing HBase deletes with visibilities (#2792))
=======
>>>>>>> a834a844c7 (GEOMESA-3113 Add system property to managing HBase deletes with visibilities (#2792))
<<<<<<< HEAD
=======
>>>>>>> 02a91455d8 (GEOMESA-3113 Add system property to managing HBase deletes with visibilities (#2792))
=======
>>>>>>> 19e79eeeaa (GEOMESA-3113 Add system property to managing HBase deletes with visibilities (#2792))
=======
>>>>>>> b81683f4bc (GEOMESA-3113 Add system property to managing HBase deletes with visibilities (#2792))
=======
=======
>>>>>>> 54da398207 (GEOMESA-3113 Add system property to managing HBase deletes with visibilities (#2792))
>>>>>>> 5af1e798d5 (GEOMESA-3113 Add system property to managing HBase deletes with visibilities (#2792))
=======
>>>>>>> f68b76f4b8 (GEOMESA-3113 Add system property to managing HBase deletes with visibilities (#2792))
>>>>>>> dc17df6c0 (GEOMESA-3113 Add system property to managing HBase deletes with visibilities (#2792))
<<<<<<< HEAD
>>>>>>> 2d758409c (GEOMESA-3113 Add system property to managing HBase deletes with visibilities (#2792))
<<<<<<< HEAD
>>>>>>> 237494b1cc (GEOMESA-3113 Add system property to managing HBase deletes with visibilities (#2792))
<<<<<<< HEAD
>>>>>>> d774dc1d12 (GEOMESA-3113 Add system property to managing HBase deletes with visibilities (#2792))
=======
=======
=======
=======
>>>>>>> 74c6b7f8d (GEOMESA-3102 Fix removal of user data in FileSystemDataStore.createSchema (#2787))
<<<<<<< HEAD
>>>>>>> 5a7f44513 (GEOMESA-3102 Fix removal of user data in FileSystemDataStore.createSchema (#2787))
<<<<<<< HEAD
>>>>>>> c7eb576a40 (GEOMESA-3102 Fix removal of user data in FileSystemDataStore.createSchema (#2787))
<<<<<<< HEAD
>>>>>>> 0645a0bbaf (GEOMESA-3102 Fix removal of user data in FileSystemDataStore.createSchema (#2787))
=======
=======
=======
=======
>>>>>>> 76328bb49 (GEOMESA-3102 Fix removal of user data in FileSystemDataStore.createSchema (#2787))
<<<<<<< HEAD
<<<<<<< HEAD
<<<<<<< HEAD
<<<<<<< HEAD
=======
>>>>>>> cdb062d5e9 (GEOMESA-3113 Add system property to managing HBase deletes with visibilities (#2792))
>>>>>>> 5c68fb7d1 (GEOMESA-3102 Fix removal of user data in FileSystemDataStore.createSchema (#2787))
<<<<<<< HEAD
>>>>>>> 9ec1f049a9 (GEOMESA-3102 Fix removal of user data in FileSystemDataStore.createSchema (#2787))
<<<<<<< HEAD
>>>>>>> e8b1c389e3 (GEOMESA-3102 Fix removal of user data in FileSystemDataStore.createSchema (#2787))
=======
=======
=======
=======
=======
>>>>>>> 8871b2b4bc (GEOMESA-3102 Fix removal of user data in FileSystemDataStore.createSchema (#2787))
=======
=======
>>>>>>> a52516cf49 (GEOMESA-3113 Add system property to managing HBase deletes with visibilities (#2792))
=======
        val config = new JobConf(conf)
>>>>>>> 1a21a3c30 (GEOMESA-3113 Add system property to managing HBase deletes with visibilities (#2792))
>>>>>>> f8f49130b (GEOMESA-3113 Add system property to managing HBase deletes with visibilities (#2792))
<<<<<<< HEAD
<<<<<<< HEAD
<<<<<<< HEAD
=======
>>>>>>> 8317120c9b (GEOMESA-3102 Fix removal of user data in FileSystemDataStore.createSchema (#2787))
>>>>>>> 4a47c538b (GEOMESA-3113 Add system property to managing HBase deletes with visibilities (#2792))
<<<<<<< HEAD
>>>>>>> a0d6da1831 (GEOMESA-3113 Add system property to managing HBase deletes with visibilities (#2792))
<<<<<<< HEAD
>>>>>>> 6abf5007af (GEOMESA-3113 Add system property to managing HBase deletes with visibilities (#2792))
=======
=======
=======
>>>>>>> 02ddf6ca4 (GEOMESA-3102 Fix removal of user data in FileSystemDataStore.createSchema (#2787))
>>>>>>> a358de35a (GEOMESA-3102 Fix removal of user data in FileSystemDataStore.createSchema (#2787))
<<<<<<< HEAD
<<<<<<< HEAD
>>>>>>> 1faf0d16f2 (GEOMESA-3102 Fix removal of user data in FileSystemDataStore.createSchema (#2787))
<<<<<<< HEAD
>>>>>>> 2212530e6b (GEOMESA-3102 Fix removal of user data in FileSystemDataStore.createSchema (#2787))
=======
=======
=======
>>>>>>> 44b15e96d (GEOMESA-3113 Add system property to managing HBase deletes with visibilities (#2792))
<<<<<<< HEAD
<<<<<<< HEAD
>>>>>>> e5413df04f (GEOMESA-3113 Add system property to managing HBase deletes with visibilities (#2792))
<<<<<<< HEAD
>>>>>>> d38e17d229 (GEOMESA-3113 Add system property to managing HBase deletes with visibilities (#2792))
=======
=======
=======
=======
        val config = new JobConf(conf)
>>>>>>> 3be8d2a5a (Merge branch 'feature/postgis-fixes')
>>>>>>> db8d998aa (Merge branch 'feature/postgis-fixes')
<<<<<<< HEAD
<<<<<<< HEAD
>>>>>>> cb6bda89b6 (Merge branch 'feature/postgis-fixes')
<<<<<<< HEAD
>>>>>>> 26e5afc4ea (Merge branch 'feature/postgis-fixes')
=======
=======
=======
>>>>>>> d488f4180 (GEOMESA-3102 Fix removal of user data in FileSystemDataStore.createSchema (#2787))
<<<<<<< HEAD
<<<<<<< HEAD
>>>>>>> 8aa4f55ef6 (GEOMESA-3102 Fix removal of user data in FileSystemDataStore.createSchema (#2787))
<<<<<<< HEAD
>>>>>>> aeb7c3ed76 (GEOMESA-3102 Fix removal of user data in FileSystemDataStore.createSchema (#2787))
=======
=======
=======
=======
        val config = new JobConf(conf)
>>>>>>> 1a21a3c30 (GEOMESA-3113 Add system property to managing HBase deletes with visibilities (#2792))
>>>>>>> ac2d5a925 (GEOMESA-3113 Add system property to managing HBase deletes with visibilities (#2792))
<<<<<<< HEAD
<<<<<<< HEAD
>>>>>>> 11addb1ce7 (GEOMESA-3113 Add system property to managing HBase deletes with visibilities (#2792))
<<<<<<< HEAD
>>>>>>> 42bfd74c63 (GEOMESA-3113 Add system property to managing HBase deletes with visibilities (#2792))
=======
=======
=======
=======
>>>>>>> dc17df6c0 (GEOMESA-3113 Add system property to managing HBase deletes with visibilities (#2792))
=======
>>>>>>> 0d96d8bd55 (GEOMESA-3113 Add system property to managing HBase deletes with visibilities (#2792))
=======
        val config = new JobConf(conf)
>>>>>>> 1a21a3c30 (GEOMESA-3113 Add system property to managing HBase deletes with visibilities (#2792))
=======
>>>>>>> 85d211ca2 (GEOMESA-3102 Fix removal of user data in FileSystemDataStore.createSchema (#2787))
<<<<<<< HEAD
<<<<<<< HEAD
>>>>>>> 9ce7ed900 (GEOMESA-3102 Fix removal of user data in FileSystemDataStore.createSchema (#2787))
<<<<<<< HEAD
>>>>>>> 90d85d9b4b (GEOMESA-3102 Fix removal of user data in FileSystemDataStore.createSchema (#2787))
<<<<<<< HEAD
>>>>>>> bce9dc3e0e (GEOMESA-3102 Fix removal of user data in FileSystemDataStore.createSchema (#2787))
=======
=======
=======
>>>>>>> 7abafecb1 (GEOMESA-3113 Add system property to managing HBase deletes with visibilities (#2792))
<<<<<<< HEAD
>>>>>>> 1468e59829 (GEOMESA-3113 Add system property to managing HBase deletes with visibilities (#2792))
<<<<<<< HEAD
>>>>>>> 9c750992ef (GEOMESA-3113 Add system property to managing HBase deletes with visibilities (#2792))
=======
=======
=======
>>>>>>> 7ef22a4bb (GEOMESA-3102 Fix removal of user data in FileSystemDataStore.createSchema (#2787))
<<<<<<< HEAD
<<<<<<< HEAD
<<<<<<< HEAD
<<<<<<< HEAD
=======
>>>>>>> f22bf41646 (GEOMESA-3102 Fix removal of user data in FileSystemDataStore.createSchema (#2787))
>>>>>>> c8d3361f41 (GEOMESA-3102 Fix removal of user data in FileSystemDataStore.createSchema (#2787))
<<<<<<< HEAD
>>>>>>> 48dcb085fa (GEOMESA-3102 Fix removal of user data in FileSystemDataStore.createSchema (#2787))
=======
=======
=======
=======
>>>>>>> aa627812d (GEOMESA-3102 Fix removal of user data in FileSystemDataStore.createSchema (#2787))
>>>>>>> 2b62bcaeb (GEOMESA-3102 Fix removal of user data in FileSystemDataStore.createSchema (#2787))
<<<<<<< HEAD
<<<<<<< HEAD
<<<<<<< HEAD
<<<<<<< HEAD
=======
>>>>>>> ffcb7ff3ae (GEOMESA-3113 Add system property to managing HBase deletes with visibilities (#2792))
>>>>>>> a618e2ba0a (GEOMESA-3102 Fix removal of user data in FileSystemDataStore.createSchema (#2787))
<<<<<<< HEAD
>>>>>>> 687ba5655c (GEOMESA-3102 Fix removal of user data in FileSystemDataStore.createSchema (#2787))
=======
=======
=======
>>>>>>> afc081190 (GEOMESA-3113 Add system property to managing HBase deletes with visibilities (#2792))
<<<<<<< HEAD
<<<<<<< HEAD
<<<<<<< HEAD
<<<<<<< HEAD
=======
>>>>>>> 4b0c56ce56 (GEOMESA-3102 Fix removal of user data in FileSystemDataStore.createSchema (#2787))
>>>>>>> 65360f96a0 (GEOMESA-3113 Add system property to managing HBase deletes with visibilities (#2792))
<<<<<<< HEAD
>>>>>>> 97a911d79c (GEOMESA-3113 Add system property to managing HBase deletes with visibilities (#2792))
=======
=======
=======
>>>>>>> ea0c690e2 (GEOMESA-3102 Fix removal of user data in FileSystemDataStore.createSchema (#2787))
>>>>>>> 75f3f455e (GEOMESA-3102 Fix removal of user data in FileSystemDataStore.createSchema (#2787))
<<<<<<< HEAD
<<<<<<< HEAD
<<<<<<< HEAD
<<<<<<< HEAD
=======
>>>>>>> 9ac1262e54 (GEOMESA-3113 Add system property to managing HBase deletes with visibilities (#2792))
>>>>>>> 20dc993a76 (GEOMESA-3102 Fix removal of user data in FileSystemDataStore.createSchema (#2787))
<<<<<<< HEAD
>>>>>>> 33d2777a8a (GEOMESA-3102 Fix removal of user data in FileSystemDataStore.createSchema (#2787))
=======
=======
=======
<<<<<<< HEAD
>>>>>>> ea0c690e2 (GEOMESA-3102 Fix removal of user data in FileSystemDataStore.createSchema (#2787))
=======
>>>>>>> ea0c690e2 (GEOMESA-3102 Fix removal of user data in FileSystemDataStore.createSchema (#2787))
>>>>>>> 0b22bfaa87 (GEOMESA-3113 Add system property to managing HBase deletes with visibilities (#2792))
<<<<<<< HEAD
=======
=======
>>>>>>> 5a43551b62 (GEOMESA-3113 Add system property to managing HBase deletes with visibilities (#2792))
=======
=======
<<<<<<< HEAD
>>>>>>> 8e7c6661dc (GEOMESA-3113 Add system property to managing HBase deletes with visibilities (#2792))
=======
=======
>>>>>>> bc833b1448 (GEOMESA-3113 Add system property to managing HBase deletes with visibilities (#2792))
=======
>>>>>>> 0d96d8bd55 (GEOMESA-3113 Add system property to managing HBase deletes with visibilities (#2792))
=======
>>>>>>> d71c234711 (GEOMESA-3113 Add system property to managing HBase deletes with visibilities (#2792))
=======
        val config = new JobConf(conf)
>>>>>>> 1a21a3c30 (GEOMESA-3113 Add system property to managing HBase deletes with visibilities (#2792))
>>>>>>> 595c43086 (GEOMESA-3113 Add system property to managing HBase deletes with visibilities (#2792))
<<<<<<< HEAD
<<<<<<< HEAD
<<<<<<< HEAD
=======
>>>>>>> d71c234711 (GEOMESA-3113 Add system property to managing HBase deletes with visibilities (#2792))
>>>>>>> dc17df6c0 (GEOMESA-3113 Add system property to managing HBase deletes with visibilities (#2792))
<<<<<<< HEAD
<<<<<<< HEAD
<<<<<<< HEAD
<<<<<<< HEAD
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
>>>>>>> 0c44f82169 (GEOMESA-3102 Fix removal of user data in FileSystemDataStore.createSchema (#2787))
=======
>>>>>>> 1506607bc9 (GEOMESA-3113 Add system property to managing HBase deletes with visibilities (#2792))
=======
>>>>>>> 5d88c18b90 (GEOMESA-3102 Fix removal of user data in FileSystemDataStore.createSchema (#2787))
<<<<<<< HEAD
=======
>>>>>>> 5a43551b62 (GEOMESA-3113 Add system property to managing HBase deletes with visibilities (#2792))
=======
>>>>>>> a13c4c4fa7 (GEOMESA-3102 Fix removal of user data in FileSystemDataStore.createSchema (#2787))
=======
>>>>>>> ade0b3801f (GEOMESA-3102 Fix removal of user data in FileSystemDataStore.createSchema (#2787))
=======
>>>>>>> 68e92adc9f (GEOMESA-3102 Fix removal of user data in FileSystemDataStore.createSchema (#2787))
=======
=======
>>>>>>> 1506607bc9 (GEOMESA-3113 Add system property to managing HBase deletes with visibilities (#2792))
>>>>>>> 7ce9817488 (GEOMESA-3113 Add system property to managing HBase deletes with visibilities (#2792))
=======
>>>>>>> 0c44f82169 (GEOMESA-3102 Fix removal of user data in FileSystemDataStore.createSchema (#2787))
>>>>>>> 7a3d004ad (GEOMESA-3113 Add system property to managing HBase deletes with visibilities (#2792))
<<<<<<< HEAD
>>>>>>> bd6dd934cc (GEOMESA-3113 Add system property to managing HBase deletes with visibilities (#2792))
<<<<<<< HEAD
>>>>>>> cc5f917a7c (GEOMESA-3113 Add system property to managing HBase deletes with visibilities (#2792))
=======
=======
=======
=======
>>>>>>> 74c6b7f8d (GEOMESA-3102 Fix removal of user data in FileSystemDataStore.createSchema (#2787))
<<<<<<< HEAD
<<<<<<< HEAD
<<<<<<< HEAD
<<<<<<< HEAD
<<<<<<< HEAD
<<<<<<< HEAD
<<<<<<< HEAD
=======
>>>>>>> abe07966f6 (GEOMESA-3102 Fix removal of user data in FileSystemDataStore.createSchema (#2787))
=======
>>>>>>> 93a4d60f28 (GEOMESA-3102 Fix removal of user data in FileSystemDataStore.createSchema (#2787))
=======
>>>>>>> 9171ff5334 (GEOMESA-3102 Fix removal of user data in FileSystemDataStore.createSchema (#2787))
=======
=======
>>>>>>> abe07966f6 (GEOMESA-3102 Fix removal of user data in FileSystemDataStore.createSchema (#2787))
>>>>>>> 02465f5f58 (GEOMESA-3102 Fix removal of user data in FileSystemDataStore.createSchema (#2787))
>>>>>>> ce07ef89f (GEOMESA-3102 Fix removal of user data in FileSystemDataStore.createSchema (#2787))
<<<<<<< HEAD
>>>>>>> b6118ef7a5 (GEOMESA-3102 Fix removal of user data in FileSystemDataStore.createSchema (#2787))
<<<<<<< HEAD
>>>>>>> 8309b2b098 (GEOMESA-3102 Fix removal of user data in FileSystemDataStore.createSchema (#2787))
=======
=======
=======
=======
>>>>>>> 76328bb49 (GEOMESA-3102 Fix removal of user data in FileSystemDataStore.createSchema (#2787))
<<<<<<< HEAD
<<<<<<< HEAD
>>>>>>> 8871b2b4b (GEOMESA-3102 Fix removal of user data in FileSystemDataStore.createSchema (#2787))
<<<<<<< HEAD
>>>>>>> 495c744326 (GEOMESA-3102 Fix removal of user data in FileSystemDataStore.createSchema (#2787))
<<<<<<< HEAD
>>>>>>> a49ee0e00a (GEOMESA-3102 Fix removal of user data in FileSystemDataStore.createSchema (#2787))
=======
=======
=======
=======
>>>>>>> 0f0dd6560e (GEOMESA-3113 Add system property to managing HBase deletes with visibilities (#2792))
=======
=======
        val config = new JobConf(conf)
>>>>>>> 1a21a3c30 (GEOMESA-3113 Add system property to managing HBase deletes with visibilities (#2792))
>>>>>>> f8f49130b (GEOMESA-3113 Add system property to managing HBase deletes with visibilities (#2792))
<<<<<<< HEAD
>>>>>>> 91b0d6a88 (GEOMESA-3113 Add system property to managing HBase deletes with visibilities (#2792))
<<<<<<< HEAD
>>>>>>> 49d3846b23 (GEOMESA-3113 Add system property to managing HBase deletes with visibilities (#2792))
<<<<<<< HEAD
>>>>>>> 3adb85864f (GEOMESA-3113 Add system property to managing HBase deletes with visibilities (#2792))
=======
=======
=======
>>>>>>> 02ddf6ca4 (GEOMESA-3102 Fix removal of user data in FileSystemDataStore.createSchema (#2787))
>>>>>>> 4f922d74c (GEOMESA-3102 Fix removal of user data in FileSystemDataStore.createSchema (#2787))
<<<<<<< HEAD
>>>>>>> 155d6a9469 (GEOMESA-3102 Fix removal of user data in FileSystemDataStore.createSchema (#2787))
<<<<<<< HEAD
>>>>>>> a1198ce095 (GEOMESA-3102 Fix removal of user data in FileSystemDataStore.createSchema (#2787))
=======
=======
=======
>>>>>>> 1b5719bd3 (GEOMESA-3113 Add system property to managing HBase deletes with visibilities (#2792))
<<<<<<< HEAD
<<<<<<< HEAD
<<<<<<< HEAD
<<<<<<< HEAD
=======
>>>>>>> a30a0c1a2a (Merge branch 'feature/postgis-fixes')
>>>>>>> e4ee051914 (GEOMESA-3113 Add system property to managing HBase deletes with visibilities (#2792))
<<<<<<< HEAD
>>>>>>> 260d67442f (GEOMESA-3113 Add system property to managing HBase deletes with visibilities (#2792))
=======
=======
=======
=======
        val config = new JobConf(conf)
>>>>>>> 3be8d2a5a (Merge branch 'feature/postgis-fixes')
>>>>>>> 1b25d7ddb (Merge branch 'feature/postgis-fixes')
>>>>>>> 699117eca9 (Merge branch 'feature/postgis-fixes')
>>>>>>> c69897d7bd (Merge branch 'feature/postgis-fixes')
=======
>>>>>>> 1c115a8f87 (GEOMESA-3102 Fix removal of user data in FileSystemDataStore.createSchema (#2787))
<<<<<<< HEAD
<<<<<<< HEAD
<<<<<<< HEAD
<<<<<<< HEAD
<<<<<<< HEAD
<<<<<<< HEAD
=======
>>>>>>> 1d4e479464 (GEOMESA-3113 Add system property to managing HBase deletes with visibilities (#2792))
=======
>>>>>>> 1417ba30dc (GEOMESA-3113 Add system property to managing HBase deletes with visibilities (#2792))
=======
>>>>>>> f148adeccd (GEOMESA-3102 Fix removal of user data in FileSystemDataStore.createSchema (#2787))
=======
=======
>>>>>>> 1d4e479464 (GEOMESA-3113 Add system property to managing HBase deletes with visibilities (#2792))
>>>>>>> b448819e24 (GEOMESA-3113 Add system property to managing HBase deletes with visibilities (#2792))
=======
=======
        val config = new JobConf(conf)
>>>>>>> 1a21a3c30 (GEOMESA-3113 Add system property to managing HBase deletes with visibilities (#2792))
>>>>>>> bcf168a888 (GEOMESA-3113 Add system property to managing HBase deletes with visibilities (#2792))
<<<<<<< HEAD
<<<<<<< HEAD
<<<<<<< HEAD
<<<<<<< HEAD
<<<<<<< HEAD
<<<<<<< HEAD
=======
>>>>>>> b448819e24 (GEOMESA-3113 Add system property to managing HBase deletes with visibilities (#2792))
=======
>>>>>>> d71800c037 (GEOMESA-3102 Fix removal of user data in FileSystemDataStore.createSchema (#2787))
=======
>>>>>>> b52e5bb454 (GEOMESA-3102 Fix removal of user data in FileSystemDataStore.createSchema (#2787))
=======
<<<<<<< HEAD
=======
>>>>>>> dc17df6c0 (GEOMESA-3113 Add system property to managing HBase deletes with visibilities (#2792))
=======
=======
>>>>>>> 735f1fc092 (GEOMESA-3102 Fix removal of user data in FileSystemDataStore.createSchema (#2787))
=======
=======
>>>>>>> 0acf2e86fa (GEOMESA-3102 Fix removal of user data in FileSystemDataStore.createSchema (#2787))
=======
>>>>>>> a0d25ffbaa (GEOMESA-3102 Fix removal of user data in FileSystemDataStore.createSchema (#2787))
=======
>>>>>>> dc17df6c0 (GEOMESA-3113 Add system property to managing HBase deletes with visibilities (#2792))
=======
=======
>>>>>>> 735f1fc092 (GEOMESA-3102 Fix removal of user data in FileSystemDataStore.createSchema (#2787))
=======
        val config = new JobConf(conf)
>>>>>>> 1a21a3c30 (GEOMESA-3113 Add system property to managing HBase deletes with visibilities (#2792))
=======
>>>>>>> 85d211ca2 (GEOMESA-3102 Fix removal of user data in FileSystemDataStore.createSchema (#2787))
<<<<<<< HEAD
<<<<<<< HEAD
<<<<<<< HEAD
<<<<<<< HEAD
<<<<<<< HEAD
<<<<<<< HEAD
<<<<<<< HEAD
=======
>>>>>>> a0d25ffbaa (GEOMESA-3102 Fix removal of user data in FileSystemDataStore.createSchema (#2787))
=======
>>>>>>> 7f28e8e2e5 (GEOMESA-3113 Add system property to managing HBase deletes with visibilities (#2792))
=======
>>>>>>> d71800c037 (GEOMESA-3102 Fix removal of user data in FileSystemDataStore.createSchema (#2787))
>>>>>>> ffca7b7bd4 (GEOMESA-3102 Fix removal of user data in FileSystemDataStore.createSchema (#2787))
=======
>>>>>>> 0c12a2c53d (GEOMESA-3113 Add system property to managing HBase deletes with visibilities (#2792))
=======
>>>>>>> ba7f2715c5 (GEOMESA-3102 Fix removal of user data in FileSystemDataStore.createSchema (#2787))
=======
=======
>>>>>>> aa627812d (GEOMESA-3102 Fix removal of user data in FileSystemDataStore.createSchema (#2787))
>>>>>>> 526e71304c (GEOMESA-3102 Fix removal of user data in FileSystemDataStore.createSchema (#2787))
=======
>>>>>>> 074e4b10b9 (GEOMESA-3113 Add system property to managing HBase deletes with visibilities (#2792))
<<<<<<< HEAD
<<<<<<< HEAD
<<<<<<< HEAD
<<<<<<< HEAD
<<<<<<< HEAD
<<<<<<< HEAD
=======
>>>>>>> cb8df4c76b (GEOMESA-3113 Add system property to managing HBase deletes with visibilities (#2792))
=======
>>>>>>> 265d436467 (GEOMESA-3102 Fix removal of user data in FileSystemDataStore.createSchema (#2787))
=======
>>>>>>> ea0c690e2 (GEOMESA-3102 Fix removal of user data in FileSystemDataStore.createSchema (#2787))
>>>>>>> 9c809610d5 (GEOMESA-3102 Fix removal of user data in FileSystemDataStore.createSchema (#2787))
=======
>>>>>>> 0b22bfaa87 (GEOMESA-3113 Add system property to managing HBase deletes with visibilities (#2792))
<<<<<<< HEAD
<<<<<<< HEAD
<<<<<<< HEAD
<<<<<<< HEAD
<<<<<<< HEAD
<<<<<<< HEAD
=======
>>>>>>> 5d88c18b90 (GEOMESA-3102 Fix removal of user data in FileSystemDataStore.createSchema (#2787))
=======
>>>>>>> a13c4c4fa7 (GEOMESA-3102 Fix removal of user data in FileSystemDataStore.createSchema (#2787))
=======
>>>>>>> 7ce9817488 (GEOMESA-3113 Add system property to managing HBase deletes with visibilities (#2792))
=======
=======
>>>>>>> 5d88c18b90 (GEOMESA-3102 Fix removal of user data in FileSystemDataStore.createSchema (#2787))
>>>>>>> 0c44f82169 (GEOMESA-3102 Fix removal of user data in FileSystemDataStore.createSchema (#2787))
=======
=======
>>>>>>> 74c6b7f8d (GEOMESA-3102 Fix removal of user data in FileSystemDataStore.createSchema (#2787))
>>>>>>> a030b80514 (GEOMESA-3102 Fix removal of user data in FileSystemDataStore.createSchema (#2787))
<<<<<<< HEAD
<<<<<<< HEAD
<<<<<<< HEAD
<<<<<<< HEAD
<<<<<<< HEAD
<<<<<<< HEAD
=======
>>>>>>> abe07966f6 (GEOMESA-3102 Fix removal of user data in FileSystemDataStore.createSchema (#2787))
=======
>>>>>>> 93a4d60f28 (GEOMESA-3102 Fix removal of user data in FileSystemDataStore.createSchema (#2787))
=======
>>>>>>> 0c44f82169 (GEOMESA-3102 Fix removal of user data in FileSystemDataStore.createSchema (#2787))
=======
=======
>>>>>>> abe07966f6 (GEOMESA-3102 Fix removal of user data in FileSystemDataStore.createSchema (#2787))
>>>>>>> 02465f5f58 (GEOMESA-3102 Fix removal of user data in FileSystemDataStore.createSchema (#2787))
=======
=======
>>>>>>> 76328bb49 (GEOMESA-3102 Fix removal of user data in FileSystemDataStore.createSchema (#2787))
>>>>>>> 9e842c2021 (GEOMESA-3102 Fix removal of user data in FileSystemDataStore.createSchema (#2787))
<<<<<<< HEAD
<<<<<<< HEAD
<<<<<<< HEAD
<<<<<<< HEAD
<<<<<<< HEAD
<<<<<<< HEAD
=======
>>>>>>> 02465f5f58 (GEOMESA-3102 Fix removal of user data in FileSystemDataStore.createSchema (#2787))
=======
>>>>>>> 8eb59bcc3c (GEOMESA-3113 Add system property to managing HBase deletes with visibilities (#2792))
=======
>>>>>>> 0f0dd6560e (GEOMESA-3113 Add system property to managing HBase deletes with visibilities (#2792))
=======
>>>>>>> 02ddf6ca4 (GEOMESA-3102 Fix removal of user data in FileSystemDataStore.createSchema (#2787))
<<<<<<< HEAD
<<<<<<< HEAD
<<<<<<< HEAD
<<<<<<< HEAD
<<<<<<< HEAD
<<<<<<< HEAD
<<<<<<< HEAD
=======
>>>>>>> ea5f19f56b (GEOMESA-3113 Add system property to managing HBase deletes with visibilities (#2792))
=======
>>>>>>> ce7c794944 (GEOMESA-3113 Add system property to managing HBase deletes with visibilities (#2792))
=======
>>>>>>> 6f245b0cc5 (GEOMESA-3102 Fix removal of user data in FileSystemDataStore.createSchema (#2787))
=======
=======
>>>>>>> ea5f19f56b (GEOMESA-3113 Add system property to managing HBase deletes with visibilities (#2792))
>>>>>>> 07c698faf4 (GEOMESA-3113 Add system property to managing HBase deletes with visibilities (#2792))
>>>>>>> 98ce8bad96 (GEOMESA-3102 Fix removal of user data in FileSystemDataStore.createSchema (#2787))
=======
=======
>>>>>>> 0cdf3f267 (GEOMESA-3113 Add system property to managing HBase deletes with visibilities (#2792))
<<<<<<< HEAD
<<<<<<< HEAD
<<<<<<< HEAD
<<<<<<< HEAD
<<<<<<< HEAD
<<<<<<< HEAD
<<<<<<< HEAD
=======
>>>>>>> ec6d06b576 (Merge branch 'feature/postgis-fixes')
=======
>>>>>>> 354b5e5ae5 (Merge branch 'feature/postgis-fixes')
=======
>>>>>>> 07c698faf4 (GEOMESA-3113 Add system property to managing HBase deletes with visibilities (#2792))
=======
=======
>>>>>>> ec6d06b576 (Merge branch 'feature/postgis-fixes')
>>>>>>> cc93e0930d (Merge branch 'feature/postgis-fixes')
>>>>>>> a8e7273bb0 (GEOMESA-3113 Add system property to managing HBase deletes with visibilities (#2792))
=======
=======
        val config = new JobConf(conf)
>>>>>>> 3be8d2a5a (Merge branch 'feature/postgis-fixes')
>>>>>>> da00c7bd68 (Merge branch 'feature/postgis-fixes')
<<<<<<< HEAD
<<<<<<< HEAD
<<<<<<< HEAD
<<<<<<< HEAD
=======
>>>>>>> cc93e0930d (Merge branch 'feature/postgis-fixes')
=======
>>>>>>> e055239c40 (GEOMESA-3102 Fix removal of user data in FileSystemDataStore.createSchema (#2787))
=======
<<<<<<< HEAD
<<<<<<< HEAD
=======
>>>>>>> 7f28e8e2e5 (GEOMESA-3113 Add system property to managing HBase deletes with visibilities (#2792))
>>>>>>> ea0c690e2 (GEOMESA-3102 Fix removal of user data in FileSystemDataStore.createSchema (#2787))
=======
>>>>>>> 4bd5ce922d (GEOMESA-3113 Add system property to managing HBase deletes with visibilities (#2792))
=======
=======
        val config = new JobConf(conf)
>>>>>>> 1a21a3c30 (GEOMESA-3113 Add system property to managing HBase deletes with visibilities (#2792))
<<<<<<< HEAD
>>>>>>> 51ab350ee2 (GEOMESA-3113 Add system property to managing HBase deletes with visibilities (#2792))
=======
>>>>>>> 9431689196 (GEOMESA-3102 Fix removal of user data in FileSystemDataStore.createSchema (#2787))
=======
=======
>>>>>>> dc17df6c0 (GEOMESA-3113 Add system property to managing HBase deletes with visibilities (#2792))
=======
>>>>>>> dc17df6c0 (GEOMESA-3113 Add system property to managing HBase deletes with visibilities (#2792))
=======
        val config = new JobConf(conf)
>>>>>>> 1a21a3c30 (GEOMESA-3113 Add system property to managing HBase deletes with visibilities (#2792))
=======
>>>>>>> 85d211ca2 (GEOMESA-3102 Fix removal of user data in FileSystemDataStore.createSchema (#2787))
<<<<<<< HEAD
<<<<<<< HEAD
<<<<<<< HEAD
=======
>>>>>>> 1a0678c1b1 (GEOMESA-3113 Add system property to managing HBase deletes with visibilities (#2792))
>>>>>>> a425bc2094 (GEOMESA-3102 Fix removal of user data in FileSystemDataStore.createSchema (#2787))
=======
>>>>>>> 6449641e67 (GEOMESA-3113 Add system property to managing HBase deletes with visibilities (#2792))
=======
>>>>>>> d24328f760 (GEOMESA-3102 Fix removal of user data in FileSystemDataStore.createSchema (#2787))
=======
=======
>>>>>>> aa627812d (GEOMESA-3102 Fix removal of user data in FileSystemDataStore.createSchema (#2787))
>>>>>>> 39d46533eb (GEOMESA-3102 Fix removal of user data in FileSystemDataStore.createSchema (#2787))
=======
>>>>>>> 9da518fc54 (GEOMESA-3113 Add system property to managing HBase deletes with visibilities (#2792))
<<<<<<< HEAD
<<<<<<< HEAD
=======
>>>>>>> ea0c690e2 (GEOMESA-3102 Fix removal of user data in FileSystemDataStore.createSchema (#2787))
>>>>>>> b52e5bb454 (GEOMESA-3102 Fix removal of user data in FileSystemDataStore.createSchema (#2787))
=======
>>>>>>> 595c43086 (GEOMESA-3113 Add system property to managing HBase deletes with visibilities (#2792))
>>>>>>> dc17df6c0 (GEOMESA-3113 Add system property to managing HBase deletes with visibilities (#2792))
>>>>>>> 4bd5ce922d (GEOMESA-3113 Add system property to managing HBase deletes with visibilities (#2792))
<<<<<<< HEAD
<<<<<<< HEAD
=======
>>>>>>> ade0b3801f (GEOMESA-3102 Fix removal of user data in FileSystemDataStore.createSchema (#2787))
=======
=======
>>>>>>> 74c6b7f8d (GEOMESA-3102 Fix removal of user data in FileSystemDataStore.createSchema (#2787))
>>>>>>> d3ef2e8e78 (GEOMESA-3102 Fix removal of user data in FileSystemDataStore.createSchema (#2787))
<<<<<<< HEAD
<<<<<<< HEAD
=======
=======
>>>>>>> 76328bb492 (GEOMESA-3102 Fix removal of user data in FileSystemDataStore.createSchema (#2787))
<<<<<<< HEAD
>>>>>>> cfd537e7af (GEOMESA-3102 Fix removal of user data in FileSystemDataStore.createSchema (#2787))
=======
=======
=======
        val config = new JobConf(conf)
>>>>>>> 1a21a3c30 (GEOMESA-3113 Add system property to managing HBase deletes with visibilities (#2792))
>>>>>>> f8f49130b1 (GEOMESA-3113 Add system property to managing HBase deletes with visibilities (#2792))
>>>>>>> e17f495391 (GEOMESA-3113 Add system property to managing HBase deletes with visibilities (#2792))
=======
>>>>>>> 02ddf6ca41 (GEOMESA-3102 Fix removal of user data in FileSystemDataStore.createSchema (#2787))
>>>>>>> 54709e3b06 (GEOMESA-3102 Fix removal of user data in FileSystemDataStore.createSchema (#2787))
<<<<<<< HEAD
<<<<<<< HEAD
=======
>>>>>>> d857d34521 (GEOMESA-3113 Add system property to managing HBase deletes with visibilities (#2792))
=======
=======
        val config = new JobConf(conf)
>>>>>>> 3be8d2a5a4 (Merge branch 'feature/postgis-fixes')
>>>>>>> 34472778d3 (Merge branch 'feature/postgis-fixes')
<<<<<<< HEAD
<<<<<<< HEAD
=======
>>>>>>> 4100fa1ce8 (GEOMESA-3102 Fix removal of user data in FileSystemDataStore.createSchema (#2787))
=======
>>>>>>> b515d530a4 (GEOMESA-3113 Add system property to managing HBase deletes with visibilities (#2792))
<<<<<<< HEAD
<<<<<<< HEAD
=======
>>>>>>> 7119f2c52a (GEOMESA-3102 Fix removal of user data in FileSystemDataStore.createSchema (#2787))
<<<<<<< HEAD
>>>>>>> 7ee0f1d494 (GEOMESA-3102 Fix removal of user data in FileSystemDataStore.createSchema (#2787))
=======
=======
>>>>>>> 8037623548 (GEOMESA-3113 Add system property to managing HBase deletes with visibilities (#2792))
<<<<<<< HEAD
>>>>>>> 02fea6930b (GEOMESA-3113 Add system property to managing HBase deletes with visibilities (#2792))
=======
=======
>>>>>>> f0b61142b0 (GEOMESA-3102 Fix removal of user data in FileSystemDataStore.createSchema (#2787))
<<<<<<< HEAD
<<<<<<< HEAD
<<<<<<< HEAD
=======
>>>>>>> 83a8ca6465 (GEOMESA-3102 Fix removal of user data in FileSystemDataStore.createSchema (#2787))
>>>>>>> c843b1759d (GEOMESA-3102 Fix removal of user data in FileSystemDataStore.createSchema (#2787))
=======
=======
=======
>>>>>>> aa627812d (GEOMESA-3102 Fix removal of user data in FileSystemDataStore.createSchema (#2787))
>>>>>>> bd17bd131e (GEOMESA-3102 Fix removal of user data in FileSystemDataStore.createSchema (#2787))
>>>>>>> a2a804586c (GEOMESA-3102 Fix removal of user data in FileSystemDataStore.createSchema (#2787))
<<<<<<< HEAD
<<<<<<< HEAD
=======
>>>>>>> a773c6ef65 (GEOMESA-3113 Add system property to managing HBase deletes with visibilities (#2792))
=======
=======
>>>>>>> ea0c690e2 (GEOMESA-3102 Fix removal of user data in FileSystemDataStore.createSchema (#2787))
>>>>>>> c385f79943 (GEOMESA-3102 Fix removal of user data in FileSystemDataStore.createSchema (#2787))
>>>>>>> 2d01ec0bc0 (GEOMESA-3102 Fix removal of user data in FileSystemDataStore.createSchema (#2787))
<<<<<<< HEAD
<<<<<<< HEAD
=======
>>>>>>> 7196beb2e1 (GEOMESA-3113 Add system property to managing HBase deletes with visibilities (#2792))
=======
>>>>>>> dc17df6c0 (GEOMESA-3113 Add system property to managing HBase deletes with visibilities (#2792))
>>>>>>> 2d758409cd (GEOMESA-3113 Add system property to managing HBase deletes with visibilities (#2792))
>>>>>>> b586a90765 (GEOMESA-3113 Add system property to managing HBase deletes with visibilities (#2792))
<<<<<<< HEAD
<<<<<<< HEAD
=======
>>>>>>> 68e92adc9f (GEOMESA-3102 Fix removal of user data in FileSystemDataStore.createSchema (#2787))
=======
>>>>>>> 2d758409cd (GEOMESA-3113 Add system property to managing HBase deletes with visibilities (#2792))
=======
=======
>>>>>>> 74c6b7f8d (GEOMESA-3102 Fix removal of user data in FileSystemDataStore.createSchema (#2787))
<<<<<<< HEAD
<<<<<<< HEAD
<<<<<<< HEAD
>>>>>>> 5a7f445137 (GEOMESA-3102 Fix removal of user data in FileSystemDataStore.createSchema (#2787))
<<<<<<< HEAD
>>>>>>> 29de027418 (GEOMESA-3102 Fix removal of user data in FileSystemDataStore.createSchema (#2787))
=======
=======
=======
>>>>>>> 76328bb49 (GEOMESA-3102 Fix removal of user data in FileSystemDataStore.createSchema (#2787))
>>>>>>> 5c68fb7d18 (GEOMESA-3102 Fix removal of user data in FileSystemDataStore.createSchema (#2787))
>>>>>>> 8a9d3df519 (GEOMESA-3102 Fix removal of user data in FileSystemDataStore.createSchema (#2787))
=======
>>>>>>> 4a47c538bc (GEOMESA-3113 Add system property to managing HBase deletes with visibilities (#2792))
>>>>>>> ba177f9f13 (GEOMESA-3113 Add system property to managing HBase deletes with visibilities (#2792))
<<<<<<< HEAD
<<<<<<< HEAD
=======
>>>>>>> 02ddf6ca4 (GEOMESA-3102 Fix removal of user data in FileSystemDataStore.createSchema (#2787))
<<<<<<< HEAD
>>>>>>> a358de35a8 (GEOMESA-3102 Fix removal of user data in FileSystemDataStore.createSchema (#2787))
<<<<<<< HEAD
>>>>>>> 08ee2fed57 (GEOMESA-3102 Fix removal of user data in FileSystemDataStore.createSchema (#2787))
=======
=======
=======
>>>>>>> 0cdf3f267 (GEOMESA-3113 Add system property to managing HBase deletes with visibilities (#2792))
<<<<<<< HEAD
<<<<<<< HEAD
>>>>>>> 44b15e96d9 (GEOMESA-3113 Add system property to managing HBase deletes with visibilities (#2792))
<<<<<<< HEAD
>>>>>>> 813cf035d0 (GEOMESA-3113 Add system property to managing HBase deletes with visibilities (#2792))
=======
=======
=======
        val config = new JobConf(conf)
>>>>>>> 3be8d2a5a (Merge branch 'feature/postgis-fixes')
>>>>>>> db8d998aa2 (Merge branch 'feature/postgis-fixes')
<<<<<<< HEAD
>>>>>>> 42e8565e9b (Merge branch 'feature/postgis-fixes')
=======
=======
>>>>>>> d488f41800 (GEOMESA-3102 Fix removal of user data in FileSystemDataStore.createSchema (#2787))
<<<<<<< HEAD
<<<<<<< HEAD
<<<<<<< HEAD
=======
>>>>>>> 9f616db357 (GEOMESA-3113 Add system property to managing HBase deletes with visibilities (#2792))
>>>>>>> 49337228be (GEOMESA-3102 Fix removal of user data in FileSystemDataStore.createSchema (#2787))
=======
=======
=======
        val config = new JobConf(conf)
>>>>>>> 1a21a3c30 (GEOMESA-3113 Add system property to managing HBase deletes with visibilities (#2792))
>>>>>>> ac2d5a925f (GEOMESA-3113 Add system property to managing HBase deletes with visibilities (#2792))
<<<<<<< HEAD
<<<<<<< HEAD
<<<<<<< HEAD
=======
>>>>>>> e721efd628 (GEOMESA-3102 Fix removal of user data in FileSystemDataStore.createSchema (#2787))
>>>>>>> 54fb546133 (GEOMESA-3113 Add system property to managing HBase deletes with visibilities (#2792))
=======
=======
>>>>>>> 8a2d3cfac9 (GEOMESA-3102 Fix removal of user data in FileSystemDataStore.createSchema (#2787))
=======
>>>>>>> c4ce510344 (GEOMESA-3102 Fix removal of user data in FileSystemDataStore.createSchema (#2787))
=======
=======
>>>>>>> dc17df6c0 (GEOMESA-3113 Add system property to managing HBase deletes with visibilities (#2792))
=======
        val config = new JobConf(conf)
>>>>>>> 1a21a3c30 (GEOMESA-3113 Add system property to managing HBase deletes with visibilities (#2792))
=======
>>>>>>> 85d211ca2 (GEOMESA-3102 Fix removal of user data in FileSystemDataStore.createSchema (#2787))
<<<<<<< HEAD
<<<<<<< HEAD
<<<<<<< HEAD
>>>>>>> 9ce7ed900a (GEOMESA-3102 Fix removal of user data in FileSystemDataStore.createSchema (#2787))
<<<<<<< HEAD
<<<<<<< HEAD
<<<<<<< HEAD
=======
>>>>>>> ed36e40e7c (GEOMESA-3113 Add system property to managing HBase deletes with visibilities (#2792))
>>>>>>> 8be42d246c (GEOMESA-3102 Fix removal of user data in FileSystemDataStore.createSchema (#2787))
=======
=======
>>>>>>> 7abafecb19 (GEOMESA-3113 Add system property to managing HBase deletes with visibilities (#2792))
<<<<<<< HEAD
<<<<<<< HEAD
<<<<<<< HEAD
=======
>>>>>>> a05bcef080 (GEOMESA-3102 Fix removal of user data in FileSystemDataStore.createSchema (#2787))
>>>>>>> 7ac82c3dce (GEOMESA-3113 Add system property to managing HBase deletes with visibilities (#2792))
=======
=======
>>>>>>> 7ef22a4bb2 (GEOMESA-3102 Fix removal of user data in FileSystemDataStore.createSchema (#2787))
<<<<<<< HEAD
<<<<<<< HEAD
<<<<<<< HEAD
=======
>>>>>>> 8a07c6167f (GEOMESA-3102 Fix removal of user data in FileSystemDataStore.createSchema (#2787))
>>>>>>> 7fd052e7d2 (GEOMESA-3102 Fix removal of user data in FileSystemDataStore.createSchema (#2787))
=======
=======
=======
>>>>>>> aa627812d (GEOMESA-3102 Fix removal of user data in FileSystemDataStore.createSchema (#2787))
>>>>>>> 2b62bcaeb4 (GEOMESA-3102 Fix removal of user data in FileSystemDataStore.createSchema (#2787))
>>>>>>> 628458842d (GEOMESA-3102 Fix removal of user data in FileSystemDataStore.createSchema (#2787))
<<<<<<< HEAD
<<<<<<< HEAD
=======
>>>>>>> aca68ab685 (GEOMESA-3113 Add system property to managing HBase deletes with visibilities (#2792))
=======
=======
>>>>>>> ea0c690e2 (GEOMESA-3102 Fix removal of user data in FileSystemDataStore.createSchema (#2787))
>>>>>>> 75f3f455ec (GEOMESA-3102 Fix removal of user data in FileSystemDataStore.createSchema (#2787))
<<<<<<< HEAD
<<<<<<< HEAD
<<<<<<< HEAD
<<<<<<< HEAD
=======
>>>>>>> 9bcc7591e5 (GEOMESA-3113 Add system property to managing HBase deletes with visibilities (#2792))
>>>>>>> f7952edd5f (GEOMESA-3102 Fix removal of user data in FileSystemDataStore.createSchema (#2787))
=======
=======
>>>>>>> dc17df6c0 (GEOMESA-3113 Add system property to managing HBase deletes with visibilities (#2792))
>>>>>>> 7a3d004ad1 (GEOMESA-3113 Add system property to managing HBase deletes with visibilities (#2792))
>>>>>>> fd0793971d (GEOMESA-3113 Add system property to managing HBase deletes with visibilities (#2792))
<<<<<<< HEAD
<<<<<<< HEAD
=======
>>>>>>> ce07ef89fe (GEOMESA-3102 Fix removal of user data in FileSystemDataStore.createSchema (#2787))
>>>>>>> 44bdcb9e58 (GEOMESA-3102 Fix removal of user data in FileSystemDataStore.createSchema (#2787))
=======
>>>>>>> 8871b2b4bc (GEOMESA-3102 Fix removal of user data in FileSystemDataStore.createSchema (#2787))
>>>>>>> 853c43fc17 (GEOMESA-3102 Fix removal of user data in FileSystemDataStore.createSchema (#2787))
<<<<<<< HEAD
<<<<<<< HEAD
=======
>>>>>>> e0056031ea (GEOMESA-3113 Add system property to managing HBase deletes with visibilities (#2792))
=======
>>>>>>> 91b0d6a888 (GEOMESA-3113 Add system property to managing HBase deletes with visibilities (#2792))
=======
>>>>>>> 4f922d74c9 (GEOMESA-3102 Fix removal of user data in FileSystemDataStore.createSchema (#2787))
<<<<<<< HEAD
<<<<<<< HEAD
<<<<<<< HEAD
=======
>>>>>>> 98e607d2fa (GEOMESA-3113 Add system property to managing HBase deletes with visibilities (#2792))
>>>>>>> 15429a51ce (GEOMESA-3102 Fix removal of user data in FileSystemDataStore.createSchema (#2787))
=======
=======
=======
>>>>>>> 0cdf3f267 (GEOMESA-3113 Add system property to managing HBase deletes with visibilities (#2792))
<<<<<<< HEAD
>>>>>>> 1b5719bd33 (GEOMESA-3113 Add system property to managing HBase deletes with visibilities (#2792))
>>>>>>> e41e9641d2 (GEOMESA-3113 Add system property to managing HBase deletes with visibilities (#2792))
<<<<<<< HEAD
<<<<<<< HEAD
=======
>>>>>>> 67de3c3202 (Merge branch 'feature/postgis-fixes')
=======
=======
>>>>>>> 84634d919 (GEOMESA-3113 Add system property to managing HBase deletes with visibilities (#2792))
<<<<<<< HEAD
<<<<<<< HEAD
<<<<<<< HEAD
>>>>>>> 3c4fc5a828 (GEOMESA-3113 Add system property to managing HBase deletes with visibilities (#2792))
<<<<<<< HEAD
>>>>>>> c6079ecae5 (GEOMESA-3113 Add system property to managing HBase deletes with visibilities (#2792))
=======
=======
=======
>>>>>>> de3e57f03 (GEOMESA-3113 Add system property to managing HBase deletes with visibilities (#2792))
>>>>>>> 92feb5d273 (GEOMESA-3113 Add system property to managing HBase deletes with visibilities (#2792))
>>>>>>> e0644f7991 (GEOMESA-3113 Add system property to managing HBase deletes with visibilities (#2792))
=======
>>>>>>> 6f73f22005 (GEOMESA-3113 Add system property to managing HBase deletes with visibilities (#2792))
>>>>>>> 9888cda97e (GEOMESA-3113 Add system property to managing HBase deletes with visibilities (#2792))
<<<<<<< HEAD
<<<<<<< HEAD
=======
>>>>>>> dc17df6c0 (GEOMESA-3113 Add system property to managing HBase deletes with visibilities (#2792))
<<<<<<< HEAD
>>>>>>> 58f72e76c (GEOMESA-3113 Add system property to managing HBase deletes with visibilities (#2792))
<<<<<<< HEAD
>>>>>>> 8a234c7900 (GEOMESA-3113 Add system property to managing HBase deletes with visibilities (#2792))
<<<<<<< HEAD
>>>>>>> dba8cb28c4 (GEOMESA-3113 Add system property to managing HBase deletes with visibilities (#2792))
=======
=======
=======
=======
>>>>>>> 74c6b7f8d (GEOMESA-3102 Fix removal of user data in FileSystemDataStore.createSchema (#2787))
=======
>>>>>>> 76328bb49 (GEOMESA-3102 Fix removal of user data in FileSystemDataStore.createSchema (#2787))
=======
=======
        val config = new JobConf(conf)
>>>>>>> 1a21a3c30 (GEOMESA-3113 Add system property to managing HBase deletes with visibilities (#2792))
>>>>>>> f8f49130b (GEOMESA-3113 Add system property to managing HBase deletes with visibilities (#2792))
>>>>>>> 4c9fb0f6e (GEOMESA-3113 Add system property to managing HBase deletes with visibilities (#2792))
<<<<<<< HEAD
<<<<<<< HEAD
>>>>>>> b51d3046a2 (GEOMESA-3113 Add system property to managing HBase deletes with visibilities (#2792))
<<<<<<< HEAD
>>>>>>> 5f0745e34b (GEOMESA-3113 Add system property to managing HBase deletes with visibilities (#2792))
=======
=======
=======
>>>>>>> 72415e208a (GEOMESA-3113 Add system property to managing HBase deletes with visibilities (#2792))
>>>>>>> c14e106409 (GEOMESA-3113 Add system property to managing HBase deletes with visibilities (#2792))
>>>>>>> e6162be24a (GEOMESA-3113 Add system property to managing HBase deletes with visibilities (#2792))
=======
>>>>>>> e944f1c88b (Merge branch 'feature/postgis-fixes')
>>>>>>> 638b68d081 (Merge branch 'feature/postgis-fixes')
<<<<<<< HEAD
<<<<<<< HEAD
=======
=======
>>>>>>> 29dcc37810 (GEOMESA-3113 Add system property to managing HBase deletes with visibilities (#2792))
>>>>>>> 5521d97d99 (GEOMESA-3102 Fix removal of user data in FileSystemDataStore.createSchema (#2787))
<<<<<<< HEAD
>>>>>>> 0e67f36558 (GEOMESA-3102 Fix removal of user data in FileSystemDataStore.createSchema (#2787))
<<<<<<< HEAD
>>>>>>> f502df5b55 (GEOMESA-3102 Fix removal of user data in FileSystemDataStore.createSchema (#2787))
=======
=======
=======
=======
=======
        val config = new JobConf(conf)
>>>>>>> 1a21a3c30 (GEOMESA-3113 Add system property to managing HBase deletes with visibilities (#2792))
>>>>>>> 9814eb976 (GEOMESA-3113 Add system property to managing HBase deletes with visibilities (#2792))
=======
>>>>>>> f18f027f66 (GEOMESA-3102 Fix removal of user data in FileSystemDataStore.createSchema (#2787))
<<<<<<< HEAD
>>>>>>> 26fc359a06 (GEOMESA-3113 Add system property to managing HBase deletes with visibilities (#2792))
<<<<<<< HEAD
>>>>>>> 56f97cd271 (GEOMESA-3113 Add system property to managing HBase deletes with visibilities (#2792))
<<<<<<< HEAD
>>>>>>> 29dcc37810 (GEOMESA-3113 Add system property to managing HBase deletes with visibilities (#2792))
=======
=======
=======
=======
=======
        val config = new JobConf(conf)
>>>>>>> 1a21a3c30 (GEOMESA-3113 Add system property to managing HBase deletes with visibilities (#2792))
=======
>>>>>>> 85d211ca2 (GEOMESA-3102 Fix removal of user data in FileSystemDataStore.createSchema (#2787))
>>>>>>> 7119f2c52 (GEOMESA-3102 Fix removal of user data in FileSystemDataStore.createSchema (#2787))
<<<<<<< HEAD
<<<<<<< HEAD
>>>>>>> adf2ac19a8 (GEOMESA-3102 Fix removal of user data in FileSystemDataStore.createSchema (#2787))
<<<<<<< HEAD
>>>>>>> 89ea8190e2 (GEOMESA-3102 Fix removal of user data in FileSystemDataStore.createSchema (#2787))
<<<<<<< HEAD
>>>>>>> f18f027f66 (GEOMESA-3102 Fix removal of user data in FileSystemDataStore.createSchema (#2787))
=======
=======
=======
=======
>>>>>>> 803762354 (GEOMESA-3113 Add system property to managing HBase deletes with visibilities (#2792))
<<<<<<< HEAD
<<<<<<< HEAD
>>>>>>> e62505d539 (GEOMESA-3113 Add system property to managing HBase deletes with visibilities (#2792))
<<<<<<< HEAD
>>>>>>> 3226e92d8e (GEOMESA-3113 Add system property to managing HBase deletes with visibilities (#2792))
<<<<<<< HEAD
>>>>>>> dbbcaa10d3 (GEOMESA-3113 Add system property to managing HBase deletes with visibilities (#2792))
=======
=======
=======
=======
>>>>>>> f0b61142b (GEOMESA-3102 Fix removal of user data in FileSystemDataStore.createSchema (#2787))
=======
>>>>>>> 814abac33f (GEOMESA-3102 Fix removal of user data in FileSystemDataStore.createSchema (#2787))
<<<<<<< HEAD
>>>>>>> 0a6aff78fb (GEOMESA-3102 Fix removal of user data in FileSystemDataStore.createSchema (#2787))
<<<<<<< HEAD
>>>>>>> d9cabf401c (GEOMESA-3102 Fix removal of user data in FileSystemDataStore.createSchema (#2787))
<<<<<<< HEAD
>>>>>>> 28be12542f (GEOMESA-3102 Fix removal of user data in FileSystemDataStore.createSchema (#2787))
=======
=======
=======
=======
=======
>>>>>>> aa627812d (GEOMESA-3102 Fix removal of user data in FileSystemDataStore.createSchema (#2787))
>>>>>>> bd17bd131 (GEOMESA-3102 Fix removal of user data in FileSystemDataStore.createSchema (#2787))
=======
>>>>>>> f2b9fb3853 (GEOMESA-3113 Add system property to managing HBase deletes with visibilities (#2792))
<<<<<<< HEAD
>>>>>>> c555446b8b (GEOMESA-3102 Fix removal of user data in FileSystemDataStore.createSchema (#2787))
<<<<<<< HEAD
>>>>>>> 1230d64006 (GEOMESA-3102 Fix removal of user data in FileSystemDataStore.createSchema (#2787))
<<<<<<< HEAD
>>>>>>> 814abac33f (GEOMESA-3102 Fix removal of user data in FileSystemDataStore.createSchema (#2787))
=======
=======
=======
=======
>>>>>>> ca22354dd (GEOMESA-3113 Add system property to managing HBase deletes with visibilities (#2792))
=======
>>>>>>> 7f486255dd (GEOMESA-3102 Fix removal of user data in FileSystemDataStore.createSchema (#2787))
<<<<<<< HEAD
>>>>>>> 797b02396b (GEOMESA-3113 Add system property to managing HBase deletes with visibilities (#2792))
<<<<<<< HEAD
>>>>>>> cd5564bac6 (GEOMESA-3113 Add system property to managing HBase deletes with visibilities (#2792))
<<<<<<< HEAD
>>>>>>> f2b9fb3853 (GEOMESA-3113 Add system property to managing HBase deletes with visibilities (#2792))
=======
=======
=======
=======
>>>>>>> ea0c690e2 (GEOMESA-3102 Fix removal of user data in FileSystemDataStore.createSchema (#2787))
>>>>>>> c385f7994 (GEOMESA-3102 Fix removal of user data in FileSystemDataStore.createSchema (#2787))
=======
>>>>>>> e639fc30a7 (GEOMESA-3113 Add system property to managing HBase deletes with visibilities (#2792))
<<<<<<< HEAD
>>>>>>> 3171e7407d (GEOMESA-3102 Fix removal of user data in FileSystemDataStore.createSchema (#2787))
<<<<<<< HEAD
>>>>>>> 038b4ca087 (GEOMESA-3102 Fix removal of user data in FileSystemDataStore.createSchema (#2787))
<<<<<<< HEAD
>>>>>>> 7f486255dd (GEOMESA-3102 Fix removal of user data in FileSystemDataStore.createSchema (#2787))
=======
=======
=======
=======
<<<<<<< HEAD
>>>>>>> ea0c690e2 (GEOMESA-3102 Fix removal of user data in FileSystemDataStore.createSchema (#2787))
=======
<<<<<<< HEAD
>>>>>>> ea0c690e2 (GEOMESA-3102 Fix removal of user data in FileSystemDataStore.createSchema (#2787))
>>>>>>> 7cf935d373 (GEOMESA-3113 Add system property to managing HBase deletes with visibilities (#2792))
=======
<<<<<<< HEAD
>>>>>>> ea0c690e2 (GEOMESA-3102 Fix removal of user data in FileSystemDataStore.createSchema (#2787))
>>>>>>> 7c98bab97e (GEOMESA-3113 Add system property to managing HBase deletes with visibilities (#2792))
>>>>>>> 1a0678c1b1 (GEOMESA-3113 Add system property to managing HBase deletes with visibilities (#2792))
=======
=======
>>>>>>> 0d96d8bd55 (GEOMESA-3113 Add system property to managing HBase deletes with visibilities (#2792))
=======
=======
        val config = new JobConf(conf)
>>>>>>> 1a21a3c30 (GEOMESA-3113 Add system property to managing HBase deletes with visibilities (#2792))
>>>>>>> 595c43086 (GEOMESA-3113 Add system property to managing HBase deletes with visibilities (#2792))
<<<<<<< HEAD
>>>>>>> dc17df6c0 (GEOMESA-3113 Add system property to managing HBase deletes with visibilities (#2792))
<<<<<<< HEAD
<<<<<<< HEAD
>>>>>>> 2d758409c (GEOMESA-3113 Add system property to managing HBase deletes with visibilities (#2792))
<<<<<<< HEAD
>>>>>>> 237494b1cc (GEOMESA-3113 Add system property to managing HBase deletes with visibilities (#2792))
<<<<<<< HEAD
>>>>>>> d774dc1d12 (GEOMESA-3113 Add system property to managing HBase deletes with visibilities (#2792))
<<<<<<< HEAD
>>>>>>> e639fc30a7 (GEOMESA-3113 Add system property to managing HBase deletes with visibilities (#2792))
=======
=======
=======
=======
=======
>>>>>>> 74c6b7f8d (GEOMESA-3102 Fix removal of user data in FileSystemDataStore.createSchema (#2787))
<<<<<<< HEAD
>>>>>>> 5a7f44513 (GEOMESA-3102 Fix removal of user data in FileSystemDataStore.createSchema (#2787))
<<<<<<< HEAD
>>>>>>> c7eb576a40 (GEOMESA-3102 Fix removal of user data in FileSystemDataStore.createSchema (#2787))
<<<<<<< HEAD
>>>>>>> 0645a0bbaf (GEOMESA-3102 Fix removal of user data in FileSystemDataStore.createSchema (#2787))
<<<<<<< HEAD
>>>>>>> c57a8a5ffe (GEOMESA-3102 Fix removal of user data in FileSystemDataStore.createSchema (#2787))
=======
=======
=======
=======
=======
>>>>>>> 76328bb49 (GEOMESA-3102 Fix removal of user data in FileSystemDataStore.createSchema (#2787))
=======
>>>>>>> 69a4e317d6 (GEOMESA-3113 Add system property to managing HBase deletes with visibilities (#2792))
<<<<<<< HEAD
>>>>>>> 5c68fb7d1 (GEOMESA-3102 Fix removal of user data in FileSystemDataStore.createSchema (#2787))
<<<<<<< HEAD
>>>>>>> 9ec1f049a9 (GEOMESA-3102 Fix removal of user data in FileSystemDataStore.createSchema (#2787))
<<<<<<< HEAD
>>>>>>> e8b1c389e3 (GEOMESA-3102 Fix removal of user data in FileSystemDataStore.createSchema (#2787))
<<<<<<< HEAD
>>>>>>> 7e323ef52f (GEOMESA-3102 Fix removal of user data in FileSystemDataStore.createSchema (#2787))
=======
=======
=======
=======
=======
=======
        val config = new JobConf(conf)
>>>>>>> 1a21a3c30 (GEOMESA-3113 Add system property to managing HBase deletes with visibilities (#2792))
>>>>>>> f8f49130b (GEOMESA-3113 Add system property to managing HBase deletes with visibilities (#2792))
>>>>>>> 4a47c538b (GEOMESA-3113 Add system property to managing HBase deletes with visibilities (#2792))
<<<<<<< HEAD
<<<<<<< HEAD
>>>>>>> a0d6da1831 (GEOMESA-3113 Add system property to managing HBase deletes with visibilities (#2792))
<<<<<<< HEAD
>>>>>>> 6abf5007af (GEOMESA-3113 Add system property to managing HBase deletes with visibilities (#2792))
<<<<<<< HEAD
>>>>>>> 69a4e317d6 (GEOMESA-3113 Add system property to managing HBase deletes with visibilities (#2792))
=======
=======
=======
=======
>>>>>>> 02ddf6ca4 (GEOMESA-3102 Fix removal of user data in FileSystemDataStore.createSchema (#2787))
<<<<<<< HEAD
>>>>>>> a358de35a (GEOMESA-3102 Fix removal of user data in FileSystemDataStore.createSchema (#2787))
=======
>>>>>>> 65460df3e6 (GEOMESA-3113 Add system property to managing HBase deletes with visibilities (#2792))
<<<<<<< HEAD
>>>>>>> 1faf0d16f2 (GEOMESA-3102 Fix removal of user data in FileSystemDataStore.createSchema (#2787))
<<<<<<< HEAD
>>>>>>> 2212530e6b (GEOMESA-3102 Fix removal of user data in FileSystemDataStore.createSchema (#2787))
<<<<<<< HEAD
>>>>>>> e9395c1096 (GEOMESA-3102 Fix removal of user data in FileSystemDataStore.createSchema (#2787))
=======
=======
=======
=======
>>>>>>> 44b15e96d (GEOMESA-3113 Add system property to managing HBase deletes with visibilities (#2792))
=======
>>>>>>> 71adb695c5 (Merge branch 'feature/postgis-fixes')
<<<<<<< HEAD
>>>>>>> e5413df04f (GEOMESA-3113 Add system property to managing HBase deletes with visibilities (#2792))
<<<<<<< HEAD
>>>>>>> d38e17d229 (GEOMESA-3113 Add system property to managing HBase deletes with visibilities (#2792))
<<<<<<< HEAD
>>>>>>> 65460df3e6 (GEOMESA-3113 Add system property to managing HBase deletes with visibilities (#2792))
=======
=======
=======
=======
=======
        val config = new JobConf(conf)
>>>>>>> 3be8d2a5a (Merge branch 'feature/postgis-fixes')
>>>>>>> db8d998aa (Merge branch 'feature/postgis-fixes')
=======
>>>>>>> 16bbecada1 (GEOMESA-3102 Fix removal of user data in FileSystemDataStore.createSchema (#2787))
<<<<<<< HEAD
>>>>>>> cb6bda89b6 (Merge branch 'feature/postgis-fixes')
<<<<<<< HEAD
>>>>>>> 26e5afc4ea (Merge branch 'feature/postgis-fixes')
<<<<<<< HEAD
>>>>>>> 71adb695c5 (Merge branch 'feature/postgis-fixes')
=======
=======
=======
=======
>>>>>>> d488f4180 (GEOMESA-3102 Fix removal of user data in FileSystemDataStore.createSchema (#2787))
=======
>>>>>>> be1167e028 (GEOMESA-3113 Add system property to managing HBase deletes with visibilities (#2792))
<<<<<<< HEAD
>>>>>>> 8aa4f55ef6 (GEOMESA-3102 Fix removal of user data in FileSystemDataStore.createSchema (#2787))
<<<<<<< HEAD
>>>>>>> aeb7c3ed76 (GEOMESA-3102 Fix removal of user data in FileSystemDataStore.createSchema (#2787))
<<<<<<< HEAD
>>>>>>> 16bbecada1 (GEOMESA-3102 Fix removal of user data in FileSystemDataStore.createSchema (#2787))
=======
=======
=======
=======
=======
        val config = new JobConf(conf)
>>>>>>> 1a21a3c30 (GEOMESA-3113 Add system property to managing HBase deletes with visibilities (#2792))
>>>>>>> ac2d5a925 (GEOMESA-3113 Add system property to managing HBase deletes with visibilities (#2792))
=======
>>>>>>> fa2938c568 (GEOMESA-3102 Fix removal of user data in FileSystemDataStore.createSchema (#2787))
<<<<<<< HEAD
>>>>>>> 11addb1ce7 (GEOMESA-3113 Add system property to managing HBase deletes with visibilities (#2792))
<<<<<<< HEAD
>>>>>>> 42bfd74c63 (GEOMESA-3113 Add system property to managing HBase deletes with visibilities (#2792))
<<<<<<< HEAD
>>>>>>> be1167e028 (GEOMESA-3113 Add system property to managing HBase deletes with visibilities (#2792))
=======
=======
=======
=======
=======
        val config = new JobConf(conf)
>>>>>>> 1a21a3c30 (GEOMESA-3113 Add system property to managing HBase deletes with visibilities (#2792))
=======
>>>>>>> 85d211ca2 (GEOMESA-3102 Fix removal of user data in FileSystemDataStore.createSchema (#2787))
>>>>>>> 9ce7ed900 (GEOMESA-3102 Fix removal of user data in FileSystemDataStore.createSchema (#2787))
<<<<<<< HEAD
<<<<<<< HEAD
>>>>>>> 90d85d9b4b (GEOMESA-3102 Fix removal of user data in FileSystemDataStore.createSchema (#2787))
<<<<<<< HEAD
>>>>>>> bce9dc3e0e (GEOMESA-3102 Fix removal of user data in FileSystemDataStore.createSchema (#2787))
<<<<<<< HEAD
>>>>>>> fa2938c568 (GEOMESA-3102 Fix removal of user data in FileSystemDataStore.createSchema (#2787))
=======
=======
=======
=======
>>>>>>> 7abafecb1 (GEOMESA-3113 Add system property to managing HBase deletes with visibilities (#2792))
<<<<<<< HEAD
<<<<<<< HEAD
>>>>>>> 1468e59829 (GEOMESA-3113 Add system property to managing HBase deletes with visibilities (#2792))
<<<<<<< HEAD
>>>>>>> 9c750992ef (GEOMESA-3113 Add system property to managing HBase deletes with visibilities (#2792))
<<<<<<< HEAD
>>>>>>> 54da398207 (GEOMESA-3113 Add system property to managing HBase deletes with visibilities (#2792))
=======
=======
=======
=======
>>>>>>> 7ef22a4bb (GEOMESA-3102 Fix removal of user data in FileSystemDataStore.createSchema (#2787))
=======
>>>>>>> 1682b13d94 (GEOMESA-3102 Fix removal of user data in FileSystemDataStore.createSchema (#2787))
<<<<<<< HEAD
>>>>>>> c8d3361f41 (GEOMESA-3102 Fix removal of user data in FileSystemDataStore.createSchema (#2787))
<<<<<<< HEAD
>>>>>>> 48dcb085fa (GEOMESA-3102 Fix removal of user data in FileSystemDataStore.createSchema (#2787))
<<<<<<< HEAD
>>>>>>> e2aaf740bf (GEOMESA-3102 Fix removal of user data in FileSystemDataStore.createSchema (#2787))
=======
=======
=======
=======
=======
>>>>>>> aa627812d (GEOMESA-3102 Fix removal of user data in FileSystemDataStore.createSchema (#2787))
>>>>>>> 2b62bcaeb (GEOMESA-3102 Fix removal of user data in FileSystemDataStore.createSchema (#2787))
=======
>>>>>>> 8999b3f6b9 (GEOMESA-3113 Add system property to managing HBase deletes with visibilities (#2792))
<<<<<<< HEAD
>>>>>>> a618e2ba0a (GEOMESA-3102 Fix removal of user data in FileSystemDataStore.createSchema (#2787))
<<<<<<< HEAD
>>>>>>> 687ba5655c (GEOMESA-3102 Fix removal of user data in FileSystemDataStore.createSchema (#2787))
<<<<<<< HEAD
>>>>>>> 1682b13d94 (GEOMESA-3102 Fix removal of user data in FileSystemDataStore.createSchema (#2787))
=======
=======
=======
=======
>>>>>>> afc081190 (GEOMESA-3113 Add system property to managing HBase deletes with visibilities (#2792))
=======
>>>>>>> abc395c346 (GEOMESA-3102 Fix removal of user data in FileSystemDataStore.createSchema (#2787))
<<<<<<< HEAD
>>>>>>> 65360f96a0 (GEOMESA-3113 Add system property to managing HBase deletes with visibilities (#2792))
<<<<<<< HEAD
>>>>>>> 97a911d79c (GEOMESA-3113 Add system property to managing HBase deletes with visibilities (#2792))
<<<<<<< HEAD
>>>>>>> 8999b3f6b9 (GEOMESA-3113 Add system property to managing HBase deletes with visibilities (#2792))
=======
=======
=======
=======
>>>>>>> ea0c690e2 (GEOMESA-3102 Fix removal of user data in FileSystemDataStore.createSchema (#2787))
>>>>>>> 75f3f455e (GEOMESA-3102 Fix removal of user data in FileSystemDataStore.createSchema (#2787))
=======
>>>>>>> 3c53246c9a (GEOMESA-3113 Add system property to managing HBase deletes with visibilities (#2792))
<<<<<<< HEAD
>>>>>>> 20dc993a76 (GEOMESA-3102 Fix removal of user data in FileSystemDataStore.createSchema (#2787))
<<<<<<< HEAD
>>>>>>> 33d2777a8a (GEOMESA-3102 Fix removal of user data in FileSystemDataStore.createSchema (#2787))
<<<<<<< HEAD
>>>>>>> abc395c346 (GEOMESA-3102 Fix removal of user data in FileSystemDataStore.createSchema (#2787))
=======
=======
=======
=======
<<<<<<< HEAD
>>>>>>> ea0c690e2 (GEOMESA-3102 Fix removal of user data in FileSystemDataStore.createSchema (#2787))
=======
>>>>>>> ea0c690e2 (GEOMESA-3102 Fix removal of user data in FileSystemDataStore.createSchema (#2787))
>>>>>>> 7c98bab97e (GEOMESA-3113 Add system property to managing HBase deletes with visibilities (#2792))
=======
=======
=======
        val config = new JobConf(conf)
>>>>>>> 1a21a3c30 (GEOMESA-3113 Add system property to managing HBase deletes with visibilities (#2792))
>>>>>>> 595c43086 (GEOMESA-3113 Add system property to managing HBase deletes with visibilities (#2792))
>>>>>>> dc17df6c0 (GEOMESA-3113 Add system property to managing HBase deletes with visibilities (#2792))
<<<<<<< HEAD
<<<<<<< HEAD
<<<<<<< HEAD
<<<<<<< HEAD
<<<<<<< HEAD
>>>>>>> 7a3d004ad (GEOMESA-3113 Add system property to managing HBase deletes with visibilities (#2792))
<<<<<<< HEAD
>>>>>>> bd6dd934cc (GEOMESA-3113 Add system property to managing HBase deletes with visibilities (#2792))
<<<<<<< HEAD
>>>>>>> cc5f917a7c (GEOMESA-3113 Add system property to managing HBase deletes with visibilities (#2792))
<<<<<<< HEAD
>>>>>>> 3c53246c9a (GEOMESA-3113 Add system property to managing HBase deletes with visibilities (#2792))
=======
=======
=======
=======
=======
>>>>>>> 74c6b7f8d (GEOMESA-3102 Fix removal of user data in FileSystemDataStore.createSchema (#2787))
<<<<<<< HEAD
<<<<<<< HEAD
>>>>>>> ce07ef89f (GEOMESA-3102 Fix removal of user data in FileSystemDataStore.createSchema (#2787))
<<<<<<< HEAD
>>>>>>> b6118ef7a5 (GEOMESA-3102 Fix removal of user data in FileSystemDataStore.createSchema (#2787))
<<<<<<< HEAD
>>>>>>> 8309b2b098 (GEOMESA-3102 Fix removal of user data in FileSystemDataStore.createSchema (#2787))
<<<<<<< HEAD
>>>>>>> 4bb5bbc637 (GEOMESA-3102 Fix removal of user data in FileSystemDataStore.createSchema (#2787))
=======
=======
=======
=======
=======
>>>>>>> 76328bb49 (GEOMESA-3102 Fix removal of user data in FileSystemDataStore.createSchema (#2787))
<<<<<<< HEAD
<<<<<<< HEAD
>>>>>>> 8871b2b4b (GEOMESA-3102 Fix removal of user data in FileSystemDataStore.createSchema (#2787))
<<<<<<< HEAD
>>>>>>> 495c744326 (GEOMESA-3102 Fix removal of user data in FileSystemDataStore.createSchema (#2787))
<<<<<<< HEAD
>>>>>>> a49ee0e00a (GEOMESA-3102 Fix removal of user data in FileSystemDataStore.createSchema (#2787))
<<<<<<< HEAD
>>>>>>> fd0ea5e670 (GEOMESA-3102 Fix removal of user data in FileSystemDataStore.createSchema (#2787))
=======
=======
=======
=======
=======
>>>>>>> 6ee72f98ac (GEOMESA-3113 Add system property to managing HBase deletes with visibilities (#2792))
=======
=======
        val config = new JobConf(conf)
>>>>>>> 1a21a3c30 (GEOMESA-3113 Add system property to managing HBase deletes with visibilities (#2792))
>>>>>>> f8f49130b (GEOMESA-3113 Add system property to managing HBase deletes with visibilities (#2792))
<<<<<<< HEAD
>>>>>>> 91b0d6a88 (GEOMESA-3113 Add system property to managing HBase deletes with visibilities (#2792))
<<<<<<< HEAD
<<<<<<< HEAD
>>>>>>> 49d3846b23 (GEOMESA-3113 Add system property to managing HBase deletes with visibilities (#2792))
<<<<<<< HEAD
>>>>>>> 3adb85864f (GEOMESA-3113 Add system property to managing HBase deletes with visibilities (#2792))
<<<<<<< HEAD
>>>>>>> fc179cb2d5 (GEOMESA-3113 Add system property to managing HBase deletes with visibilities (#2792))
=======
=======
=======
=======
>>>>>>> 02ddf6ca4 (GEOMESA-3102 Fix removal of user data in FileSystemDataStore.createSchema (#2787))
>>>>>>> 4f922d74c (GEOMESA-3102 Fix removal of user data in FileSystemDataStore.createSchema (#2787))
<<<<<<< HEAD
<<<<<<< HEAD
>>>>>>> 155d6a9469 (GEOMESA-3102 Fix removal of user data in FileSystemDataStore.createSchema (#2787))
<<<<<<< HEAD
>>>>>>> a1198ce095 (GEOMESA-3102 Fix removal of user data in FileSystemDataStore.createSchema (#2787))
<<<<<<< HEAD
>>>>>>> d2e8dad373 (GEOMESA-3102 Fix removal of user data in FileSystemDataStore.createSchema (#2787))
=======
=======
=======
=======
>>>>>>> 1b5719bd3 (GEOMESA-3113 Add system property to managing HBase deletes with visibilities (#2792))
=======
>>>>>>> 30559ea5c9 (Merge branch 'feature/postgis-fixes')
<<<<<<< HEAD
>>>>>>> e4ee051914 (GEOMESA-3113 Add system property to managing HBase deletes with visibilities (#2792))
<<<<<<< HEAD
>>>>>>> 260d67442f (GEOMESA-3113 Add system property to managing HBase deletes with visibilities (#2792))
<<<<<<< HEAD
>>>>>>> 9e74e1d9b4 (GEOMESA-3113 Add system property to managing HBase deletes with visibilities (#2792))
=======
=======
=======
=======
=======
        val config = new JobConf(conf)
>>>>>>> 3be8d2a5a (Merge branch 'feature/postgis-fixes')
>>>>>>> 1b25d7ddb (Merge branch 'feature/postgis-fixes')
>>>>>>> 699117eca9 (Merge branch 'feature/postgis-fixes')
>>>>>>> c69897d7bd (Merge branch 'feature/postgis-fixes')
>>>>>>> 30559ea5c9 (Merge branch 'feature/postgis-fixes')
=======
>>>>>>> 8ddbf27f07 (GEOMESA-3102 Fix removal of user data in FileSystemDataStore.createSchema (#2787))
<<<<<<< HEAD
<<<<<<< HEAD
=======
>>>>>>> 1d4e479464 (GEOMESA-3113 Add system property to managing HBase deletes with visibilities (#2792))
=======
>>>>>>> ffca7b7bd4 (GEOMESA-3102 Fix removal of user data in FileSystemDataStore.createSchema (#2787))
<<<<<<< HEAD
<<<<<<< HEAD
<<<<<<< HEAD
<<<<<<< HEAD
=======
>>>>>>> f68b76f4b8 (GEOMESA-3113 Add system property to managing HBase deletes with visibilities (#2792))
>>>>>>> 735f1fc092 (GEOMESA-3102 Fix removal of user data in FileSystemDataStore.createSchema (#2787))
=======
=======
>>>>>>> 0c12a2c53d (GEOMESA-3113 Add system property to managing HBase deletes with visibilities (#2792))
<<<<<<< HEAD
<<<<<<< HEAD
<<<<<<< HEAD
<<<<<<< HEAD
=======
>>>>>>> 027b4d7d58 (GEOMESA-3102 Fix removal of user data in FileSystemDataStore.createSchema (#2787))
>>>>>>> a834a844c7 (GEOMESA-3113 Add system property to managing HBase deletes with visibilities (#2792))
=======
=======
>>>>>>> ba7f2715c5 (GEOMESA-3102 Fix removal of user data in FileSystemDataStore.createSchema (#2787))
<<<<<<< HEAD
<<<<<<< HEAD
<<<<<<< HEAD
<<<<<<< HEAD
>>>>>>> 84f529c13e (GEOMESA-3102 Fix removal of user data in FileSystemDataStore.createSchema (#2787))
=======
=======
>>>>>>> d61b3bb194 (GEOMESA-3102 Fix removal of user data in FileSystemDataStore.createSchema (#2787))
=======
=======
>>>>>>> aa627812d (GEOMESA-3102 Fix removal of user data in FileSystemDataStore.createSchema (#2787))
>>>>>>> 526e71304c (GEOMESA-3102 Fix removal of user data in FileSystemDataStore.createSchema (#2787))
<<<<<<< HEAD
>>>>>>> 6d4f75bcbb (GEOMESA-3102 Fix removal of user data in FileSystemDataStore.createSchema (#2787))
=======
>>>>>>> 0d4496a2f2 (GEOMESA-3113 Add system property to managing HBase deletes with visibilities (#2792))
=======
=======
>>>>>>> ea0c690e2 (GEOMESA-3102 Fix removal of user data in FileSystemDataStore.createSchema (#2787))
>>>>>>> 9c809610d5 (GEOMESA-3102 Fix removal of user data in FileSystemDataStore.createSchema (#2787))
>>>>>>> ee2741585f (GEOMESA-3102 Fix removal of user data in FileSystemDataStore.createSchema (#2787))
=======
>>>>>>> 1506607bc9 (GEOMESA-3113 Add system property to managing HBase deletes with visibilities (#2792))
<<<<<<< HEAD
<<<<<<< HEAD
=======
>>>>>>> 5d88c18b90 (GEOMESA-3102 Fix removal of user data in FileSystemDataStore.createSchema (#2787))
=======
>>>>>>> abe07966f6 (GEOMESA-3102 Fix removal of user data in FileSystemDataStore.createSchema (#2787))
<<<<<<< HEAD
<<<<<<< HEAD
=======
>>>>>>> 8eb59bcc3c (GEOMESA-3113 Add system property to managing HBase deletes with visibilities (#2792))
=======
=======
>>>>>>> 0f0dd6560e (GEOMESA-3113 Add system property to managing HBase deletes with visibilities (#2792))
>>>>>>> de00bd1943 (GEOMESA-3113 Add system property to managing HBase deletes with visibilities (#2792))
<<<<<<< HEAD
<<<<<<< HEAD
=======
>>>>>>> 98ce8bad96 (GEOMESA-3102 Fix removal of user data in FileSystemDataStore.createSchema (#2787))
>>>>>>> ffdb14e2a7 (GEOMESA-3102 Fix removal of user data in FileSystemDataStore.createSchema (#2787))
=======
>>>>>>> a8e7273bb0 (GEOMESA-3113 Add system property to managing HBase deletes with visibilities (#2792))
>>>>>>> ea5f19f56b (GEOMESA-3113 Add system property to managing HBase deletes with visibilities (#2792))
<<<<<<< HEAD
<<<<<<< HEAD
=======
>>>>>>> ec6d06b576 (Merge branch 'feature/postgis-fixes')
<<<<<<< HEAD
=======
>>>>>>> 49ebaf17a8 (GEOMESA-3102 Fix removal of user data in FileSystemDataStore.createSchema (#2787))
=======
=======
        val config = new JobConf(conf)
>>>>>>> 1a21a3c30 (GEOMESA-3113 Add system property to managing HBase deletes with visibilities (#2792))
>>>>>>> 8b0bfd55f9 (GEOMESA-3113 Add system property to managing HBase deletes with visibilities (#2792))
=======
=======
        val config = new JobConf(conf)
>>>>>>> 1a21a3c30 (GEOMESA-3113 Add system property to managing HBase deletes with visibilities (#2792))
=======
>>>>>>> 85d211ca2 (GEOMESA-3102 Fix removal of user data in FileSystemDataStore.createSchema (#2787))
>>>>>>> a863ae9a4f (GEOMESA-3102 Fix removal of user data in FileSystemDataStore.createSchema (#2787))
=======
>>>>>>> 8e7c6661dc (GEOMESA-3113 Add system property to managing HBase deletes with visibilities (#2792))
=======
>>>>>>> fb62d8dca1 (GEOMESA-3102 Fix removal of user data in FileSystemDataStore.createSchema (#2787))
=======
=======
>>>>>>> aa627812d (GEOMESA-3102 Fix removal of user data in FileSystemDataStore.createSchema (#2787))
>>>>>>> ce8500e632 (GEOMESA-3102 Fix removal of user data in FileSystemDataStore.createSchema (#2787))
=======
>>>>>>> 45dca3e07 (GEOMESA-3113 Add system property to managing HBase deletes with visibilities (#2792))
>>>>>>> d83ac69cc5 (GEOMESA-3113 Add system property to managing HBase deletes with visibilities (#2792))
=======
>>>>>>> ea0c690e2 (GEOMESA-3102 Fix removal of user data in FileSystemDataStore.createSchema (#2787))
>>>>>>> 9431689196 (GEOMESA-3102 Fix removal of user data in FileSystemDataStore.createSchema (#2787))
=======
>>>>>>> 7cf935d373 (GEOMESA-3113 Add system property to managing HBase deletes with visibilities (#2792))
=======
=======
>>>>>>> 74c6b7f8d (GEOMESA-3102 Fix removal of user data in FileSystemDataStore.createSchema (#2787))
>>>>>>> c84a3b17a6 (GEOMESA-3102 Fix removal of user data in FileSystemDataStore.createSchema (#2787))
=======
=======
>>>>>>> 76328bb492 (GEOMESA-3102 Fix removal of user data in FileSystemDataStore.createSchema (#2787))
<<<<<<< HEAD
>>>>>>> a9cee10e0a (GEOMESA-3102 Fix removal of user data in FileSystemDataStore.createSchema (#2787))
=======
=======
=======
        val config = new JobConf(conf)
>>>>>>> 1a21a3c30 (GEOMESA-3113 Add system property to managing HBase deletes with visibilities (#2792))
>>>>>>> f8f49130b1 (GEOMESA-3113 Add system property to managing HBase deletes with visibilities (#2792))
>>>>>>> 307fc2b238 (GEOMESA-3113 Add system property to managing HBase deletes with visibilities (#2792))
=======
>>>>>>> 02ddf6ca41 (GEOMESA-3102 Fix removal of user data in FileSystemDataStore.createSchema (#2787))
>>>>>>> 0ac8a757dd (GEOMESA-3102 Fix removal of user data in FileSystemDataStore.createSchema (#2787))
=======
>>>>>>> 7d705cac10 (GEOMESA-3113 Add system property to managing HBase deletes with visibilities (#2792))
=======
=======
        val config = new JobConf(conf)
>>>>>>> 3be8d2a5a4 (Merge branch 'feature/postgis-fixes')
>>>>>>> 4c41429da9 (Merge branch 'feature/postgis-fixes')
=======
>>>>>>> 237bd3cb10 (GEOMESA-3102 Fix removal of user data in FileSystemDataStore.createSchema (#2787))
=======
>>>>>>> c296484bff (GEOMESA-3113 Add system property to managing HBase deletes with visibilities (#2792))
=======
>>>>>>> 7119f2c52a (GEOMESA-3102 Fix removal of user data in FileSystemDataStore.createSchema (#2787))
<<<<<<< HEAD
>>>>>>> f794648fd0 (GEOMESA-3102 Fix removal of user data in FileSystemDataStore.createSchema (#2787))
=======
=======
>>>>>>> 8037623548 (GEOMESA-3113 Add system property to managing HBase deletes with visibilities (#2792))
<<<<<<< HEAD
>>>>>>> 5d545f24ed (GEOMESA-3113 Add system property to managing HBase deletes with visibilities (#2792))
=======
=======
>>>>>>> f0b61142b0 (GEOMESA-3102 Fix removal of user data in FileSystemDataStore.createSchema (#2787))
<<<<<<< HEAD
>>>>>>> 3c372ed1b4 (GEOMESA-3102 Fix removal of user data in FileSystemDataStore.createSchema (#2787))
=======
=======
=======
>>>>>>> aa627812d (GEOMESA-3102 Fix removal of user data in FileSystemDataStore.createSchema (#2787))
>>>>>>> bd17bd131e (GEOMESA-3102 Fix removal of user data in FileSystemDataStore.createSchema (#2787))
>>>>>>> 682f10a0e9 (GEOMESA-3102 Fix removal of user data in FileSystemDataStore.createSchema (#2787))
=======
>>>>>>> 0fb40a8655 (GEOMESA-3113 Add system property to managing HBase deletes with visibilities (#2792))
=======
=======
>>>>>>> ea0c690e2 (GEOMESA-3102 Fix removal of user data in FileSystemDataStore.createSchema (#2787))
>>>>>>> c385f79943 (GEOMESA-3102 Fix removal of user data in FileSystemDataStore.createSchema (#2787))
>>>>>>> 41631d23c9 (GEOMESA-3102 Fix removal of user data in FileSystemDataStore.createSchema (#2787))
=======
>>>>>>> dc17df6c0 (GEOMESA-3113 Add system property to managing HBase deletes with visibilities (#2792))
>>>>>>> 2d758409cd (GEOMESA-3113 Add system property to managing HBase deletes with visibilities (#2792))
>>>>>>> bc833b1448 (GEOMESA-3113 Add system property to managing HBase deletes with visibilities (#2792))
=======
>>>>>>> 2d758409cd (GEOMESA-3113 Add system property to managing HBase deletes with visibilities (#2792))
=======
=======
>>>>>>> 74c6b7f8d (GEOMESA-3102 Fix removal of user data in FileSystemDataStore.createSchema (#2787))
<<<<<<< HEAD
>>>>>>> 5a7f445137 (GEOMESA-3102 Fix removal of user data in FileSystemDataStore.createSchema (#2787))
<<<<<<< HEAD
>>>>>>> 8146fed90c (GEOMESA-3102 Fix removal of user data in FileSystemDataStore.createSchema (#2787))
=======
=======
=======
>>>>>>> 76328bb49 (GEOMESA-3102 Fix removal of user data in FileSystemDataStore.createSchema (#2787))
>>>>>>> 5c68fb7d18 (GEOMESA-3102 Fix removal of user data in FileSystemDataStore.createSchema (#2787))
>>>>>>> 1e838e1657 (GEOMESA-3102 Fix removal of user data in FileSystemDataStore.createSchema (#2787))
=======
=======
        val config = new JobConf(conf)
>>>>>>> 1a21a3c30 (GEOMESA-3113 Add system property to managing HBase deletes with visibilities (#2792))
>>>>>>> f8f49130b (GEOMESA-3113 Add system property to managing HBase deletes with visibilities (#2792))
<<<<<<< HEAD
>>>>>>> 4a47c538bc (GEOMESA-3113 Add system property to managing HBase deletes with visibilities (#2792))
<<<<<<< HEAD
>>>>>>> a42015a87c (GEOMESA-3113 Add system property to managing HBase deletes with visibilities (#2792))
=======
=======
=======
=======
        val config = new JobConf(conf)
>>>>>>> 1a21a3c30 (GEOMESA-3113 Add system property to managing HBase deletes with visibilities (#2792))
=======
>>>>>>> 85d211ca2 (GEOMESA-3102 Fix removal of user data in FileSystemDataStore.createSchema (#2787))
>>>>>>> 02ddf6ca4 (GEOMESA-3102 Fix removal of user data in FileSystemDataStore.createSchema (#2787))
<<<<<<< HEAD
>>>>>>> a358de35a8 (GEOMESA-3102 Fix removal of user data in FileSystemDataStore.createSchema (#2787))
<<<<<<< HEAD
>>>>>>> ffca94ce17 (GEOMESA-3102 Fix removal of user data in FileSystemDataStore.createSchema (#2787))
=======
=======
=======
>>>>>>> 0cdf3f267 (GEOMESA-3113 Add system property to managing HBase deletes with visibilities (#2792))
<<<<<<< HEAD
>>>>>>> 44b15e96d9 (GEOMESA-3113 Add system property to managing HBase deletes with visibilities (#2792))
<<<<<<< HEAD
>>>>>>> ec072ceda6 (GEOMESA-3113 Add system property to managing HBase deletes with visibilities (#2792))
=======
=======
=======
        val config = new JobConf(conf)
>>>>>>> 3be8d2a5a (Merge branch 'feature/postgis-fixes')
>>>>>>> db8d998aa2 (Merge branch 'feature/postgis-fixes')
<<<<<<< HEAD
>>>>>>> 6e0709aba8 (Merge branch 'feature/postgis-fixes')
=======
=======
>>>>>>> d488f41800 (GEOMESA-3102 Fix removal of user data in FileSystemDataStore.createSchema (#2787))
<<<<<<< HEAD
>>>>>>> 8e486088f5 (GEOMESA-3102 Fix removal of user data in FileSystemDataStore.createSchema (#2787))
=======
=======
=======
        val config = new JobConf(conf)
>>>>>>> 1a21a3c30 (GEOMESA-3113 Add system property to managing HBase deletes with visibilities (#2792))
>>>>>>> ac2d5a925f (GEOMESA-3113 Add system property to managing HBase deletes with visibilities (#2792))
<<<<<<< HEAD
>>>>>>> 94096ec6bd (GEOMESA-3113 Add system property to managing HBase deletes with visibilities (#2792))
=======
=======
=======
        val config = new JobConf(conf)
>>>>>>> 1a21a3c30 (GEOMESA-3113 Add system property to managing HBase deletes with visibilities (#2792))
=======
>>>>>>> 85d211ca2 (GEOMESA-3102 Fix removal of user data in FileSystemDataStore.createSchema (#2787))
>>>>>>> 9ce7ed900a (GEOMESA-3102 Fix removal of user data in FileSystemDataStore.createSchema (#2787))
<<<<<<< HEAD
>>>>>>> 2d18554450 (GEOMESA-3102 Fix removal of user data in FileSystemDataStore.createSchema (#2787))
=======
=======
>>>>>>> 7abafecb19 (GEOMESA-3113 Add system property to managing HBase deletes with visibilities (#2792))
<<<<<<< HEAD
>>>>>>> db696250b0 (GEOMESA-3113 Add system property to managing HBase deletes with visibilities (#2792))
=======
=======
>>>>>>> 7ef22a4bb2 (GEOMESA-3102 Fix removal of user data in FileSystemDataStore.createSchema (#2787))
<<<<<<< HEAD
>>>>>>> a317af9cbb (GEOMESA-3102 Fix removal of user data in FileSystemDataStore.createSchema (#2787))
=======
=======
=======
>>>>>>> aa627812d (GEOMESA-3102 Fix removal of user data in FileSystemDataStore.createSchema (#2787))
>>>>>>> 2b62bcaeb4 (GEOMESA-3102 Fix removal of user data in FileSystemDataStore.createSchema (#2787))
<<<<<<< HEAD
>>>>>>> 595d9061e3 (GEOMESA-3102 Fix removal of user data in FileSystemDataStore.createSchema (#2787))
=======
=======
>>>>>>> afc081190b (GEOMESA-3113 Add system property to managing HBase deletes with visibilities (#2792))
>>>>>>> 2d98e354b8 (GEOMESA-3113 Add system property to managing HBase deletes with visibilities (#2792))
=======
=======
>>>>>>> ea0c690e2 (GEOMESA-3102 Fix removal of user data in FileSystemDataStore.createSchema (#2787))
>>>>>>> 75f3f455ec (GEOMESA-3102 Fix removal of user data in FileSystemDataStore.createSchema (#2787))
>>>>>>> 2f550bb2a7 (GEOMESA-3102 Fix removal of user data in FileSystemDataStore.createSchema (#2787))
=======
=======
>>>>>>> dc17df6c0 (GEOMESA-3113 Add system property to managing HBase deletes with visibilities (#2792))
>>>>>>> 7a3d004ad1 (GEOMESA-3113 Add system property to managing HBase deletes with visibilities (#2792))
>>>>>>> 8781a5befd (GEOMESA-3113 Add system property to managing HBase deletes with visibilities (#2792))
=======
>>>>>>> ce07ef89fe (GEOMESA-3102 Fix removal of user data in FileSystemDataStore.createSchema (#2787))
>>>>>>> 98efbcd374 (GEOMESA-3102 Fix removal of user data in FileSystemDataStore.createSchema (#2787))
=======
>>>>>>> 8871b2b4bc (GEOMESA-3102 Fix removal of user data in FileSystemDataStore.createSchema (#2787))
>>>>>>> dfae24c155 (GEOMESA-3102 Fix removal of user data in FileSystemDataStore.createSchema (#2787))
=======
>>>>>>> 91b0d6a888 (GEOMESA-3113 Add system property to managing HBase deletes with visibilities (#2792))
<<<<<<< HEAD
>>>>>>> a52516cf49 (GEOMESA-3113 Add system property to managing HBase deletes with visibilities (#2792))
=======
=======
>>>>>>> 4f922d74c9 (GEOMESA-3102 Fix removal of user data in FileSystemDataStore.createSchema (#2787))
<<<<<<< HEAD
>>>>>>> 7e8f76c0f9 (GEOMESA-3102 Fix removal of user data in FileSystemDataStore.createSchema (#2787))
=======
=======
=======
>>>>>>> 0cdf3f267 (GEOMESA-3113 Add system property to managing HBase deletes with visibilities (#2792))
>>>>>>> 1b5719bd33 (GEOMESA-3113 Add system property to managing HBase deletes with visibilities (#2792))
>>>>>>> 1351a5baa4 (GEOMESA-3113 Add system property to managing HBase deletes with visibilities (#2792))
=======
>>>>>>> ed25decdd5 (Merge branch 'feature/postgis-fixes')
=======
=======
>>>>>>> 84634d919 (GEOMESA-3113 Add system property to managing HBase deletes with visibilities (#2792))
<<<<<<< HEAD
>>>>>>> 3c4fc5a828 (GEOMESA-3113 Add system property to managing HBase deletes with visibilities (#2792))
<<<<<<< HEAD
>>>>>>> 857489f8a0 (GEOMESA-3113 Add system property to managing HBase deletes with visibilities (#2792))
=======
=======
=======
>>>>>>> de3e57f03 (GEOMESA-3113 Add system property to managing HBase deletes with visibilities (#2792))
>>>>>>> 92feb5d273 (GEOMESA-3113 Add system property to managing HBase deletes with visibilities (#2792))
>>>>>>> 083bb9617b (GEOMESA-3113 Add system property to managing HBase deletes with visibilities (#2792))
=======
>>>>>>> 6f73f22005 (GEOMESA-3113 Add system property to managing HBase deletes with visibilities (#2792))
>>>>>>> 32aba52002 (GEOMESA-3113 Add system property to managing HBase deletes with visibilities (#2792))
=======
>>>>>>> dc17df6c0 (GEOMESA-3113 Add system property to managing HBase deletes with visibilities (#2792))
<<<<<<< HEAD
>>>>>>> 58f72e76c (GEOMESA-3113 Add system property to managing HBase deletes with visibilities (#2792))
<<<<<<< HEAD
>>>>>>> 8a234c7900 (GEOMESA-3113 Add system property to managing HBase deletes with visibilities (#2792))
<<<<<<< HEAD
>>>>>>> 2c630f9360 (GEOMESA-3113 Add system property to managing HBase deletes with visibilities (#2792))
=======
=======
=======
=======
>>>>>>> 74c6b7f8d (GEOMESA-3102 Fix removal of user data in FileSystemDataStore.createSchema (#2787))
=======
>>>>>>> 76328bb49 (GEOMESA-3102 Fix removal of user data in FileSystemDataStore.createSchema (#2787))
=======
=======
        val config = new JobConf(conf)
>>>>>>> 1a21a3c30 (GEOMESA-3113 Add system property to managing HBase deletes with visibilities (#2792))
>>>>>>> f8f49130b (GEOMESA-3113 Add system property to managing HBase deletes with visibilities (#2792))
>>>>>>> 4c9fb0f6e (GEOMESA-3113 Add system property to managing HBase deletes with visibilities (#2792))
<<<<<<< HEAD
>>>>>>> b51d3046a2 (GEOMESA-3113 Add system property to managing HBase deletes with visibilities (#2792))
<<<<<<< HEAD
>>>>>>> b69b6b3ea1 (GEOMESA-3113 Add system property to managing HBase deletes with visibilities (#2792))
=======
=======
=======
>>>>>>> 72415e208a (GEOMESA-3113 Add system property to managing HBase deletes with visibilities (#2792))
>>>>>>> c14e106409 (GEOMESA-3113 Add system property to managing HBase deletes with visibilities (#2792))
>>>>>>> 665046a461 (GEOMESA-3113 Add system property to managing HBase deletes with visibilities (#2792))
=======
>>>>>>> e944f1c88b (Merge branch 'feature/postgis-fixes')
>>>>>>> f893d9a594 (Merge branch 'feature/postgis-fixes')
=======
=======
>>>>>>> b1dea55b93 (GEOMESA-3113 Add system property to managing HBase deletes with visibilities (#2792))
>>>>>>> 5521d97d99 (GEOMESA-3102 Fix removal of user data in FileSystemDataStore.createSchema (#2787))
<<<<<<< HEAD
>>>>>>> 0e67f36558 (GEOMESA-3102 Fix removal of user data in FileSystemDataStore.createSchema (#2787))
<<<<<<< HEAD
>>>>>>> 1382ba7fd3 (GEOMESA-3102 Fix removal of user data in FileSystemDataStore.createSchema (#2787))
=======
=======
=======
=======
=======
        val config = new JobConf(conf)
>>>>>>> 1a21a3c30 (GEOMESA-3113 Add system property to managing HBase deletes with visibilities (#2792))
>>>>>>> 9814eb976 (GEOMESA-3113 Add system property to managing HBase deletes with visibilities (#2792))
=======
>>>>>>> 6157978769 (GEOMESA-3102 Fix removal of user data in FileSystemDataStore.createSchema (#2787))
>>>>>>> 26fc359a06 (GEOMESA-3113 Add system property to managing HBase deletes with visibilities (#2792))
<<<<<<< HEAD
>>>>>>> 56f97cd271 (GEOMESA-3113 Add system property to managing HBase deletes with visibilities (#2792))
<<<<<<< HEAD
>>>>>>> b1dea55b93 (GEOMESA-3113 Add system property to managing HBase deletes with visibilities (#2792))
=======
=======
=======
=======
=======
        val config = new JobConf(conf)
>>>>>>> 1a21a3c30 (GEOMESA-3113 Add system property to managing HBase deletes with visibilities (#2792))
=======
>>>>>>> 85d211ca2 (GEOMESA-3102 Fix removal of user data in FileSystemDataStore.createSchema (#2787))
>>>>>>> 7119f2c52 (GEOMESA-3102 Fix removal of user data in FileSystemDataStore.createSchema (#2787))
<<<<<<< HEAD
>>>>>>> adf2ac19a8 (GEOMESA-3102 Fix removal of user data in FileSystemDataStore.createSchema (#2787))
<<<<<<< HEAD
>>>>>>> 89ea8190e2 (GEOMESA-3102 Fix removal of user data in FileSystemDataStore.createSchema (#2787))
<<<<<<< HEAD
>>>>>>> 6157978769 (GEOMESA-3102 Fix removal of user data in FileSystemDataStore.createSchema (#2787))
=======
=======
=======
=======
>>>>>>> 803762354 (GEOMESA-3113 Add system property to managing HBase deletes with visibilities (#2792))
<<<<<<< HEAD
>>>>>>> e62505d539 (GEOMESA-3113 Add system property to managing HBase deletes with visibilities (#2792))
<<<<<<< HEAD
>>>>>>> 3226e92d8e (GEOMESA-3113 Add system property to managing HBase deletes with visibilities (#2792))
<<<<<<< HEAD
>>>>>>> 7d3ca180ff (GEOMESA-3113 Add system property to managing HBase deletes with visibilities (#2792))
=======
=======
=======
=======
>>>>>>> f0b61142b (GEOMESA-3102 Fix removal of user data in FileSystemDataStore.createSchema (#2787))
=======
>>>>>>> f9996d127e (GEOMESA-3102 Fix removal of user data in FileSystemDataStore.createSchema (#2787))
>>>>>>> 0a6aff78fb (GEOMESA-3102 Fix removal of user data in FileSystemDataStore.createSchema (#2787))
<<<<<<< HEAD
>>>>>>> d9cabf401c (GEOMESA-3102 Fix removal of user data in FileSystemDataStore.createSchema (#2787))
<<<<<<< HEAD
>>>>>>> ddc69d17c8 (GEOMESA-3102 Fix removal of user data in FileSystemDataStore.createSchema (#2787))
=======
=======
=======
=======
=======
>>>>>>> aa627812d (GEOMESA-3102 Fix removal of user data in FileSystemDataStore.createSchema (#2787))
>>>>>>> bd17bd131 (GEOMESA-3102 Fix removal of user data in FileSystemDataStore.createSchema (#2787))
=======
>>>>>>> 73d82b731c (GEOMESA-3113 Add system property to managing HBase deletes with visibilities (#2792))
>>>>>>> c555446b8b (GEOMESA-3102 Fix removal of user data in FileSystemDataStore.createSchema (#2787))
<<<<<<< HEAD
>>>>>>> 1230d64006 (GEOMESA-3102 Fix removal of user data in FileSystemDataStore.createSchema (#2787))
<<<<<<< HEAD
>>>>>>> f9996d127e (GEOMESA-3102 Fix removal of user data in FileSystemDataStore.createSchema (#2787))
=======
=======
=======
=======
>>>>>>> ca22354dd (GEOMESA-3113 Add system property to managing HBase deletes with visibilities (#2792))
=======
>>>>>>> 957de96206 (GEOMESA-3102 Fix removal of user data in FileSystemDataStore.createSchema (#2787))
>>>>>>> 797b02396b (GEOMESA-3113 Add system property to managing HBase deletes with visibilities (#2792))
<<<<<<< HEAD
>>>>>>> cd5564bac6 (GEOMESA-3113 Add system property to managing HBase deletes with visibilities (#2792))
<<<<<<< HEAD
>>>>>>> 73d82b731c (GEOMESA-3113 Add system property to managing HBase deletes with visibilities (#2792))
=======
=======
=======
=======
>>>>>>> ea0c690e2 (GEOMESA-3102 Fix removal of user data in FileSystemDataStore.createSchema (#2787))
>>>>>>> c385f7994 (GEOMESA-3102 Fix removal of user data in FileSystemDataStore.createSchema (#2787))
=======
>>>>>>> 3c673847c5 (GEOMESA-3113 Add system property to managing HBase deletes with visibilities (#2792))
>>>>>>> 3171e7407d (GEOMESA-3102 Fix removal of user data in FileSystemDataStore.createSchema (#2787))
<<<<<<< HEAD
>>>>>>> 038b4ca087 (GEOMESA-3102 Fix removal of user data in FileSystemDataStore.createSchema (#2787))
<<<<<<< HEAD
>>>>>>> 957de96206 (GEOMESA-3102 Fix removal of user data in FileSystemDataStore.createSchema (#2787))
=======
=======
=======
=======
<<<<<<< HEAD
>>>>>>> ea0c690e2 (GEOMESA-3102 Fix removal of user data in FileSystemDataStore.createSchema (#2787))
=======
=======
=======
        val config = new JobConf(conf)
>>>>>>> 1a21a3c30 (GEOMESA-3113 Add system property to managing HBase deletes with visibilities (#2792))
>>>>>>> 595c43086 (GEOMESA-3113 Add system property to managing HBase deletes with visibilities (#2792))
>>>>>>> dc17df6c0 (GEOMESA-3113 Add system property to managing HBase deletes with visibilities (#2792))
<<<<<<< HEAD
>>>>>>> 2d758409c (GEOMESA-3113 Add system property to managing HBase deletes with visibilities (#2792))
<<<<<<< HEAD
>>>>>>> 237494b1cc (GEOMESA-3113 Add system property to managing HBase deletes with visibilities (#2792))
<<<<<<< HEAD
>>>>>>> d774dc1d12 (GEOMESA-3113 Add system property to managing HBase deletes with visibilities (#2792))
<<<<<<< HEAD
>>>>>>> 3c673847c5 (GEOMESA-3113 Add system property to managing HBase deletes with visibilities (#2792))
=======
=======
=======
=======
=======
>>>>>>> 74c6b7f8d (GEOMESA-3102 Fix removal of user data in FileSystemDataStore.createSchema (#2787))
<<<<<<< HEAD
>>>>>>> 5a7f44513 (GEOMESA-3102 Fix removal of user data in FileSystemDataStore.createSchema (#2787))
<<<<<<< HEAD
>>>>>>> c7eb576a40 (GEOMESA-3102 Fix removal of user data in FileSystemDataStore.createSchema (#2787))
<<<<<<< HEAD
>>>>>>> 0645a0bbaf (GEOMESA-3102 Fix removal of user data in FileSystemDataStore.createSchema (#2787))
<<<<<<< HEAD
>>>>>>> 5d89f9f58f (GEOMESA-3102 Fix removal of user data in FileSystemDataStore.createSchema (#2787))
=======
=======
=======
=======
=======
>>>>>>> 76328bb49 (GEOMESA-3102 Fix removal of user data in FileSystemDataStore.createSchema (#2787))
=======
>>>>>>> ebbfa035a9 (GEOMESA-3113 Add system property to managing HBase deletes with visibilities (#2792))
>>>>>>> 5c68fb7d1 (GEOMESA-3102 Fix removal of user data in FileSystemDataStore.createSchema (#2787))
<<<<<<< HEAD
>>>>>>> 9ec1f049a9 (GEOMESA-3102 Fix removal of user data in FileSystemDataStore.createSchema (#2787))
<<<<<<< HEAD
>>>>>>> e8b1c389e3 (GEOMESA-3102 Fix removal of user data in FileSystemDataStore.createSchema (#2787))
<<<<<<< HEAD
>>>>>>> d03b76c630 (GEOMESA-3102 Fix removal of user data in FileSystemDataStore.createSchema (#2787))
=======
=======
=======
=======
=======
=======
        val config = new JobConf(conf)
>>>>>>> 1a21a3c30 (GEOMESA-3113 Add system property to managing HBase deletes with visibilities (#2792))
>>>>>>> f8f49130b (GEOMESA-3113 Add system property to managing HBase deletes with visibilities (#2792))
>>>>>>> 4a47c538b (GEOMESA-3113 Add system property to managing HBase deletes with visibilities (#2792))
<<<<<<< HEAD
>>>>>>> a0d6da1831 (GEOMESA-3113 Add system property to managing HBase deletes with visibilities (#2792))
<<<<<<< HEAD
>>>>>>> 6abf5007af (GEOMESA-3113 Add system property to managing HBase deletes with visibilities (#2792))
<<<<<<< HEAD
>>>>>>> ebbfa035a9 (GEOMESA-3113 Add system property to managing HBase deletes with visibilities (#2792))
=======
=======
=======
=======
>>>>>>> 02ddf6ca4 (GEOMESA-3102 Fix removal of user data in FileSystemDataStore.createSchema (#2787))
>>>>>>> a358de35a (GEOMESA-3102 Fix removal of user data in FileSystemDataStore.createSchema (#2787))
<<<<<<< HEAD
>>>>>>> 1faf0d16f2 (GEOMESA-3102 Fix removal of user data in FileSystemDataStore.createSchema (#2787))
<<<<<<< HEAD
>>>>>>> 2212530e6b (GEOMESA-3102 Fix removal of user data in FileSystemDataStore.createSchema (#2787))
<<<<<<< HEAD
>>>>>>> 0cb32b7425 (GEOMESA-3102 Fix removal of user data in FileSystemDataStore.createSchema (#2787))
=======
=======
=======
=======
>>>>>>> 44b15e96d (GEOMESA-3113 Add system property to managing HBase deletes with visibilities (#2792))
<<<<<<< HEAD
>>>>>>> e5413df04f (GEOMESA-3113 Add system property to managing HBase deletes with visibilities (#2792))
<<<<<<< HEAD
>>>>>>> d38e17d229 (GEOMESA-3113 Add system property to managing HBase deletes with visibilities (#2792))
<<<<<<< HEAD
>>>>>>> ad7a284ebe (GEOMESA-3113 Add system property to managing HBase deletes with visibilities (#2792))
=======
=======
=======
=======
=======
        val config = new JobConf(conf)
>>>>>>> 3be8d2a5a (Merge branch 'feature/postgis-fixes')
>>>>>>> db8d998aa (Merge branch 'feature/postgis-fixes')
<<<<<<< HEAD
>>>>>>> cb6bda89b6 (Merge branch 'feature/postgis-fixes')
<<<<<<< HEAD
>>>>>>> 26e5afc4ea (Merge branch 'feature/postgis-fixes')
<<<<<<< HEAD
>>>>>>> 964e86145a (Merge branch 'feature/postgis-fixes')
=======
=======
=======
=======
>>>>>>> d488f4180 (GEOMESA-3102 Fix removal of user data in FileSystemDataStore.createSchema (#2787))
<<<<<<< HEAD
>>>>>>> 8aa4f55ef6 (GEOMESA-3102 Fix removal of user data in FileSystemDataStore.createSchema (#2787))
<<<<<<< HEAD
>>>>>>> aeb7c3ed76 (GEOMESA-3102 Fix removal of user data in FileSystemDataStore.createSchema (#2787))
<<<<<<< HEAD
>>>>>>> be8a3bab90 (GEOMESA-3102 Fix removal of user data in FileSystemDataStore.createSchema (#2787))
=======
=======
=======
=======
=======
        val config = new JobConf(conf)
>>>>>>> 1a21a3c30 (GEOMESA-3113 Add system property to managing HBase deletes with visibilities (#2792))
>>>>>>> ac2d5a925 (GEOMESA-3113 Add system property to managing HBase deletes with visibilities (#2792))
<<<<<<< HEAD
>>>>>>> 11addb1ce7 (GEOMESA-3113 Add system property to managing HBase deletes with visibilities (#2792))
<<<<<<< HEAD
>>>>>>> 42bfd74c63 (GEOMESA-3113 Add system property to managing HBase deletes with visibilities (#2792))
<<<<<<< HEAD
>>>>>>> b3fe983979 (GEOMESA-3113 Add system property to managing HBase deletes with visibilities (#2792))
=======
=======
=======
=======
=======
        val config = new JobConf(conf)
>>>>>>> 1a21a3c30 (GEOMESA-3113 Add system property to managing HBase deletes with visibilities (#2792))
=======
>>>>>>> 85d211ca2 (GEOMESA-3102 Fix removal of user data in FileSystemDataStore.createSchema (#2787))
>>>>>>> 9ce7ed900 (GEOMESA-3102 Fix removal of user data in FileSystemDataStore.createSchema (#2787))
<<<<<<< HEAD
>>>>>>> 90d85d9b4b (GEOMESA-3102 Fix removal of user data in FileSystemDataStore.createSchema (#2787))
<<<<<<< HEAD
>>>>>>> bce9dc3e0e (GEOMESA-3102 Fix removal of user data in FileSystemDataStore.createSchema (#2787))
<<<<<<< HEAD
>>>>>>> af5b690d0b (GEOMESA-3102 Fix removal of user data in FileSystemDataStore.createSchema (#2787))
=======
=======
=======
=======
>>>>>>> 7abafecb1 (GEOMESA-3113 Add system property to managing HBase deletes with visibilities (#2792))
<<<<<<< HEAD
>>>>>>> 1468e59829 (GEOMESA-3113 Add system property to managing HBase deletes with visibilities (#2792))
<<<<<<< HEAD
>>>>>>> 9c750992ef (GEOMESA-3113 Add system property to managing HBase deletes with visibilities (#2792))
<<<<<<< HEAD
>>>>>>> 02a91455d8 (GEOMESA-3113 Add system property to managing HBase deletes with visibilities (#2792))
=======
=======
=======
=======
>>>>>>> 7ef22a4bb (GEOMESA-3102 Fix removal of user data in FileSystemDataStore.createSchema (#2787))
=======
>>>>>>> b1b67a398d (GEOMESA-3102 Fix removal of user data in FileSystemDataStore.createSchema (#2787))
>>>>>>> c8d3361f41 (GEOMESA-3102 Fix removal of user data in FileSystemDataStore.createSchema (#2787))
<<<<<<< HEAD
>>>>>>> 48dcb085fa (GEOMESA-3102 Fix removal of user data in FileSystemDataStore.createSchema (#2787))
<<<<<<< HEAD
>>>>>>> 8c775c1126 (GEOMESA-3102 Fix removal of user data in FileSystemDataStore.createSchema (#2787))
=======
=======
=======
=======
=======
>>>>>>> aa627812d (GEOMESA-3102 Fix removal of user data in FileSystemDataStore.createSchema (#2787))
>>>>>>> 2b62bcaeb (GEOMESA-3102 Fix removal of user data in FileSystemDataStore.createSchema (#2787))
=======
>>>>>>> cbaecd4a0f (GEOMESA-3113 Add system property to managing HBase deletes with visibilities (#2792))
>>>>>>> a618e2ba0a (GEOMESA-3102 Fix removal of user data in FileSystemDataStore.createSchema (#2787))
<<<<<<< HEAD
>>>>>>> 687ba5655c (GEOMESA-3102 Fix removal of user data in FileSystemDataStore.createSchema (#2787))
<<<<<<< HEAD
>>>>>>> b1b67a398d (GEOMESA-3102 Fix removal of user data in FileSystemDataStore.createSchema (#2787))
=======
=======
=======
=======
>>>>>>> afc081190 (GEOMESA-3113 Add system property to managing HBase deletes with visibilities (#2792))
=======
>>>>>>> a23109e63b (GEOMESA-3102 Fix removal of user data in FileSystemDataStore.createSchema (#2787))
>>>>>>> 65360f96a0 (GEOMESA-3113 Add system property to managing HBase deletes with visibilities (#2792))
<<<<<<< HEAD
>>>>>>> 97a911d79c (GEOMESA-3113 Add system property to managing HBase deletes with visibilities (#2792))
<<<<<<< HEAD
>>>>>>> cbaecd4a0f (GEOMESA-3113 Add system property to managing HBase deletes with visibilities (#2792))
=======
=======
=======
=======
>>>>>>> ea0c690e2 (GEOMESA-3102 Fix removal of user data in FileSystemDataStore.createSchema (#2787))
>>>>>>> 75f3f455e (GEOMESA-3102 Fix removal of user data in FileSystemDataStore.createSchema (#2787))
=======
>>>>>>> 9b169d0847 (GEOMESA-3113 Add system property to managing HBase deletes with visibilities (#2792))
>>>>>>> 20dc993a76 (GEOMESA-3102 Fix removal of user data in FileSystemDataStore.createSchema (#2787))
<<<<<<< HEAD
>>>>>>> 33d2777a8a (GEOMESA-3102 Fix removal of user data in FileSystemDataStore.createSchema (#2787))
<<<<<<< HEAD
>>>>>>> a23109e63b (GEOMESA-3102 Fix removal of user data in FileSystemDataStore.createSchema (#2787))
=======
=======
=======
=======
<<<<<<< HEAD
>>>>>>> ea0c690e2 (GEOMESA-3102 Fix removal of user data in FileSystemDataStore.createSchema (#2787))
=======
=======
=======
        val config = new JobConf(conf)
>>>>>>> 1a21a3c30 (GEOMESA-3113 Add system property to managing HBase deletes with visibilities (#2792))
>>>>>>> 595c43086 (GEOMESA-3113 Add system property to managing HBase deletes with visibilities (#2792))
>>>>>>> dc17df6c0 (GEOMESA-3113 Add system property to managing HBase deletes with visibilities (#2792))
<<<<<<< HEAD
>>>>>>> 7a3d004ad (GEOMESA-3113 Add system property to managing HBase deletes with visibilities (#2792))
<<<<<<< HEAD
>>>>>>> bd6dd934cc (GEOMESA-3113 Add system property to managing HBase deletes with visibilities (#2792))
<<<<<<< HEAD
>>>>>>> cc5f917a7c (GEOMESA-3113 Add system property to managing HBase deletes with visibilities (#2792))
<<<<<<< HEAD
>>>>>>> 9b169d0847 (GEOMESA-3113 Add system property to managing HBase deletes with visibilities (#2792))
=======
=======
=======
=======
=======
>>>>>>> 74c6b7f8d (GEOMESA-3102 Fix removal of user data in FileSystemDataStore.createSchema (#2787))
<<<<<<< HEAD
>>>>>>> ce07ef89f (GEOMESA-3102 Fix removal of user data in FileSystemDataStore.createSchema (#2787))
<<<<<<< HEAD
>>>>>>> b6118ef7a5 (GEOMESA-3102 Fix removal of user data in FileSystemDataStore.createSchema (#2787))
<<<<<<< HEAD
>>>>>>> 8309b2b098 (GEOMESA-3102 Fix removal of user data in FileSystemDataStore.createSchema (#2787))
<<<<<<< HEAD
>>>>>>> 2544a6c80c (GEOMESA-3102 Fix removal of user data in FileSystemDataStore.createSchema (#2787))
=======
=======
=======
=======
=======
>>>>>>> 76328bb49 (GEOMESA-3102 Fix removal of user data in FileSystemDataStore.createSchema (#2787))
<<<<<<< HEAD
>>>>>>> 8871b2b4b (GEOMESA-3102 Fix removal of user data in FileSystemDataStore.createSchema (#2787))
<<<<<<< HEAD
>>>>>>> 495c744326 (GEOMESA-3102 Fix removal of user data in FileSystemDataStore.createSchema (#2787))
<<<<<<< HEAD
>>>>>>> a49ee0e00a (GEOMESA-3102 Fix removal of user data in FileSystemDataStore.createSchema (#2787))
<<<<<<< HEAD
>>>>>>> eb98a9fb29 (GEOMESA-3102 Fix removal of user data in FileSystemDataStore.createSchema (#2787))
=======
=======
=======
=======
=======
=======
        val config = new JobConf(conf)
>>>>>>> 1a21a3c30 (GEOMESA-3113 Add system property to managing HBase deletes with visibilities (#2792))
>>>>>>> f8f49130b (GEOMESA-3113 Add system property to managing HBase deletes with visibilities (#2792))
>>>>>>> 91b0d6a88 (GEOMESA-3113 Add system property to managing HBase deletes with visibilities (#2792))
<<<<<<< HEAD
>>>>>>> 49d3846b23 (GEOMESA-3113 Add system property to managing HBase deletes with visibilities (#2792))
<<<<<<< HEAD
>>>>>>> 3adb85864f (GEOMESA-3113 Add system property to managing HBase deletes with visibilities (#2792))
<<<<<<< HEAD
>>>>>>> d539392ecd (GEOMESA-3113 Add system property to managing HBase deletes with visibilities (#2792))
=======
=======
=======
=======
>>>>>>> 02ddf6ca4 (GEOMESA-3102 Fix removal of user data in FileSystemDataStore.createSchema (#2787))
>>>>>>> 4f922d74c (GEOMESA-3102 Fix removal of user data in FileSystemDataStore.createSchema (#2787))
<<<<<<< HEAD
>>>>>>> 155d6a9469 (GEOMESA-3102 Fix removal of user data in FileSystemDataStore.createSchema (#2787))
<<<<<<< HEAD
>>>>>>> a1198ce095 (GEOMESA-3102 Fix removal of user data in FileSystemDataStore.createSchema (#2787))
<<<<<<< HEAD
>>>>>>> ef0351a168 (GEOMESA-3102 Fix removal of user data in FileSystemDataStore.createSchema (#2787))
=======
=======
=======
=======
>>>>>>> 1b5719bd3 (GEOMESA-3113 Add system property to managing HBase deletes with visibilities (#2792))
=======
>>>>>>> bf6bde0830 (Merge branch 'feature/postgis-fixes')
>>>>>>> e4ee051914 (GEOMESA-3113 Add system property to managing HBase deletes with visibilities (#2792))
<<<<<<< HEAD
>>>>>>> 260d67442f (GEOMESA-3113 Add system property to managing HBase deletes with visibilities (#2792))
<<<<<<< HEAD
>>>>>>> d9ec67b278 (GEOMESA-3113 Add system property to managing HBase deletes with visibilities (#2792))
=======
=======
=======
=======
=======
        val config = new JobConf(conf)
>>>>>>> 3be8d2a5a (Merge branch 'feature/postgis-fixes')
>>>>>>> 1b25d7ddb (Merge branch 'feature/postgis-fixes')
>>>>>>> 699117eca9 (Merge branch 'feature/postgis-fixes')
>>>>>>> c69897d7bd (Merge branch 'feature/postgis-fixes')
>>>>>>> bf6bde0830 (Merge branch 'feature/postgis-fixes')
=======
>>>>>>> 7053435184 (GEOMESA-3102 Fix removal of user data in FileSystemDataStore.createSchema (#2787))
=======
>>>>>>> 1417ba30dc (GEOMESA-3113 Add system property to managing HBase deletes with visibilities (#2792))
=======
>>>>>>> ffca7b7bd4 (GEOMESA-3102 Fix removal of user data in FileSystemDataStore.createSchema (#2787))
>>>>>>> 0acf2e86fa (GEOMESA-3102 Fix removal of user data in FileSystemDataStore.createSchema (#2787))
=======
=======
>>>>>>> 0c12a2c53d (GEOMESA-3113 Add system property to managing HBase deletes with visibilities (#2792))
>>>>>>> 19e79eeeaa (GEOMESA-3113 Add system property to managing HBase deletes with visibilities (#2792))
=======
=======
>>>>>>> ba7f2715c5 (GEOMESA-3102 Fix removal of user data in FileSystemDataStore.createSchema (#2787))
>>>>>>> 9513a4f9a1 (GEOMESA-3102 Fix removal of user data in FileSystemDataStore.createSchema (#2787))
=======
>>>>>>> d61b3bb194 (GEOMESA-3102 Fix removal of user data in FileSystemDataStore.createSchema (#2787))
=======
>>>>>>> 0121c0dbad (GEOMESA-3113 Add system property to managing HBase deletes with visibilities (#2792))
=======
=======
>>>>>>> ea0c690e2 (GEOMESA-3102 Fix removal of user data in FileSystemDataStore.createSchema (#2787))
>>>>>>> 9c809610d5 (GEOMESA-3102 Fix removal of user data in FileSystemDataStore.createSchema (#2787))
>>>>>>> e518bfb9e2 (GEOMESA-3102 Fix removal of user data in FileSystemDataStore.createSchema (#2787))
=======
>>>>>>> 5a43551b62 (GEOMESA-3113 Add system property to managing HBase deletes with visibilities (#2792))
=======
>>>>>>> a13c4c4fa7 (GEOMESA-3102 Fix removal of user data in FileSystemDataStore.createSchema (#2787))
=======
>>>>>>> 93a4d60f28 (GEOMESA-3102 Fix removal of user data in FileSystemDataStore.createSchema (#2787))
=======
=======
>>>>>>> 0f0dd6560e (GEOMESA-3113 Add system property to managing HBase deletes with visibilities (#2792))
>>>>>>> 6bef55a1ea (GEOMESA-3113 Add system property to managing HBase deletes with visibilities (#2792))
=======
>>>>>>> 98ce8bad96 (GEOMESA-3102 Fix removal of user data in FileSystemDataStore.createSchema (#2787))
>>>>>>> 48bb106de6 (GEOMESA-3102 Fix removal of user data in FileSystemDataStore.createSchema (#2787))
=======
>>>>>>> a8e7273bb0 (GEOMESA-3113 Add system property to managing HBase deletes with visibilities (#2792))
>>>>>>> ce7c794944 (GEOMESA-3113 Add system property to managing HBase deletes with visibilities (#2792))
=======
>>>>>>> 354b5e5ae5 (Merge branch 'feature/postgis-fixes')
=======
=======
>>>>>>> e055239c40 (GEOMESA-3102 Fix removal of user data in FileSystemDataStore.createSchema (#2787))
>>>>>>> 5b83f2d5c8 (GEOMESA-3102 Fix removal of user data in FileSystemDataStore.createSchema (#2787))
=======
=======
        val config = new JobConf(conf)
>>>>>>> 1a21a3c30 (GEOMESA-3113 Add system property to managing HBase deletes with visibilities (#2792))
>>>>>>> 51ab350ee2 (GEOMESA-3113 Add system property to managing HBase deletes with visibilities (#2792))
<<<<<<< HEAD
>>>>>>> 5f8777dc16 (GEOMESA-3113 Add system property to managing HBase deletes with visibilities (#2792))
=======
=======
=======
        val config = new JobConf(conf)
>>>>>>> 1a21a3c30 (GEOMESA-3113 Add system property to managing HBase deletes with visibilities (#2792))
=======
>>>>>>> 85d211ca2 (GEOMESA-3102 Fix removal of user data in FileSystemDataStore.createSchema (#2787))
>>>>>>> a425bc2094 (GEOMESA-3102 Fix removal of user data in FileSystemDataStore.createSchema (#2787))
<<<<<<< HEAD
>>>>>>> 8414c0cefb (GEOMESA-3102 Fix removal of user data in FileSystemDataStore.createSchema (#2787))
=======
=======
>>>>>>> 6449641e67 (GEOMESA-3113 Add system property to managing HBase deletes with visibilities (#2792))
<<<<<<< HEAD
>>>>>>> b81683f4bc (GEOMESA-3113 Add system property to managing HBase deletes with visibilities (#2792))
=======
=======
>>>>>>> d24328f760 (GEOMESA-3102 Fix removal of user data in FileSystemDataStore.createSchema (#2787))
<<<<<<< HEAD
>>>>>>> 01ee16a4c0 (GEOMESA-3102 Fix removal of user data in FileSystemDataStore.createSchema (#2787))
=======
=======
=======
>>>>>>> aa627812d (GEOMESA-3102 Fix removal of user data in FileSystemDataStore.createSchema (#2787))
>>>>>>> 39d46533eb (GEOMESA-3102 Fix removal of user data in FileSystemDataStore.createSchema (#2787))
>>>>>>> 6f9b076410 (GEOMESA-3102 Fix removal of user data in FileSystemDataStore.createSchema (#2787))
=======
>>>>>>> 39a2b37b5e (GEOMESA-3113 Add system property to managing HBase deletes with visibilities (#2792))
=======
=======
>>>>>>> ea0c690e2 (GEOMESA-3102 Fix removal of user data in FileSystemDataStore.createSchema (#2787))
>>>>>>> b52e5bb454 (GEOMESA-3102 Fix removal of user data in FileSystemDataStore.createSchema (#2787))
>>>>>>> a0d25ffbaa (GEOMESA-3102 Fix removal of user data in FileSystemDataStore.createSchema (#2787))
=======
>>>>>>> 7f28e8e2e5 (GEOMESA-3113 Add system property to managing HBase deletes with visibilities (#2792))
=======
>>>>>>> ade0b3801f (GEOMESA-3102 Fix removal of user data in FileSystemDataStore.createSchema (#2787))
=======
=======
=======
>>>>>>> 76328bb492 (GEOMESA-3102 Fix removal of user data in FileSystemDataStore.createSchema (#2787))
<<<<<<< HEAD
>>>>>>> cfd537e7af (GEOMESA-3102 Fix removal of user data in FileSystemDataStore.createSchema (#2787))
<<<<<<< HEAD
>>>>>>> 9171ff5334 (GEOMESA-3102 Fix removal of user data in FileSystemDataStore.createSchema (#2787))
=======
=======
=======
=======
        val config = new JobConf(conf)
>>>>>>> 1a21a3c30 (GEOMESA-3113 Add system property to managing HBase deletes with visibilities (#2792))
>>>>>>> f8f49130b1 (GEOMESA-3113 Add system property to managing HBase deletes with visibilities (#2792))
>>>>>>> e17f495391 (GEOMESA-3113 Add system property to managing HBase deletes with visibilities (#2792))
>>>>>>> f1f448d9e0 (GEOMESA-3113 Add system property to managing HBase deletes with visibilities (#2792))
=======
>>>>>>> abaa89e702 (GEOMESA-3102 Fix removal of user data in FileSystemDataStore.createSchema (#2787))
=======
=======
>>>>>>> d857d34521 (GEOMESA-3113 Add system property to managing HBase deletes with visibilities (#2792))
>>>>>>> 8524ef3a47 (GEOMESA-3113 Add system property to managing HBase deletes with visibilities (#2792))
=======
>>>>>>> d581fa3e8f (Merge branch 'feature/postgis-fixes')
=======
=======
>>>>>>> 4100fa1ce8 (GEOMESA-3102 Fix removal of user data in FileSystemDataStore.createSchema (#2787))
>>>>>>> b5ef5f3ffb (GEOMESA-3102 Fix removal of user data in FileSystemDataStore.createSchema (#2787))
=======
>>>>>>> a0d7cc16ab (GEOMESA-3113 Add system property to managing HBase deletes with visibilities (#2792))
=======
=======
>>>>>>> 7119f2c52a (GEOMESA-3102 Fix removal of user data in FileSystemDataStore.createSchema (#2787))
<<<<<<< HEAD
>>>>>>> 7ee0f1d494 (GEOMESA-3102 Fix removal of user data in FileSystemDataStore.createSchema (#2787))
<<<<<<< HEAD
>>>>>>> ae19085932 (GEOMESA-3102 Fix removal of user data in FileSystemDataStore.createSchema (#2787))
=======
=======
=======
>>>>>>> 8037623548 (GEOMESA-3113 Add system property to managing HBase deletes with visibilities (#2792))
>>>>>>> 02fea6930b (GEOMESA-3113 Add system property to managing HBase deletes with visibilities (#2792))
>>>>>>> cdbed26e09 (GEOMESA-3113 Add system property to managing HBase deletes with visibilities (#2792))
=======
>>>>>>> c843b1759d (GEOMESA-3102 Fix removal of user data in FileSystemDataStore.createSchema (#2787))
>>>>>>> 75e5f895f3 (GEOMESA-3102 Fix removal of user data in FileSystemDataStore.createSchema (#2787))
=======
>>>>>>> 83a8ca6465 (GEOMESA-3102 Fix removal of user data in FileSystemDataStore.createSchema (#2787))
=======
=======
>>>>>>> a773c6ef65 (GEOMESA-3113 Add system property to managing HBase deletes with visibilities (#2792))
>>>>>>> 34fd077439 (GEOMESA-3113 Add system property to managing HBase deletes with visibilities (#2792))
=======
>>>>>>> f58f87b448 (GEOMESA-3102 Fix removal of user data in FileSystemDataStore.createSchema (#2787))
=======
>>>>>>> 7196beb2e1 (GEOMESA-3113 Add system property to managing HBase deletes with visibilities (#2792))
=======
=======
>>>>>>> b4cc9497d5 (GEOMESA-3102 Fix removal of user data in FileSystemDataStore.createSchema (#2787))
>>>>>>> 5a7f445137 (GEOMESA-3102 Fix removal of user data in FileSystemDataStore.createSchema (#2787))
<<<<<<< HEAD
>>>>>>> 29de027418 (GEOMESA-3102 Fix removal of user data in FileSystemDataStore.createSchema (#2787))
<<<<<<< HEAD
>>>>>>> 68e92adc9f (GEOMESA-3102 Fix removal of user data in FileSystemDataStore.createSchema (#2787))
=======
=======
=======
=======
>>>>>>> 76328bb49 (GEOMESA-3102 Fix removal of user data in FileSystemDataStore.createSchema (#2787))
>>>>>>> 5c68fb7d18 (GEOMESA-3102 Fix removal of user data in FileSystemDataStore.createSchema (#2787))
>>>>>>> 8a9d3df519 (GEOMESA-3102 Fix removal of user data in FileSystemDataStore.createSchema (#2787))
>>>>>>> b4cc9497d5 (GEOMESA-3102 Fix removal of user data in FileSystemDataStore.createSchema (#2787))
=======
>>>>>>> df9cd4f22d (GEOMESA-3113 Add system property to managing HBase deletes with visibilities (#2792))
=======
=======
>>>>>>> 02ddf6ca4 (GEOMESA-3102 Fix removal of user data in FileSystemDataStore.createSchema (#2787))
<<<<<<< HEAD
>>>>>>> a358de35a8 (GEOMESA-3102 Fix removal of user data in FileSystemDataStore.createSchema (#2787))
<<<<<<< HEAD
>>>>>>> 08ee2fed57 (GEOMESA-3102 Fix removal of user data in FileSystemDataStore.createSchema (#2787))
<<<<<<< HEAD
>>>>>>> c0b0589a14 (GEOMESA-3102 Fix removal of user data in FileSystemDataStore.createSchema (#2787))
=======
=======
=======
=======
>>>>>>> 0cdf3f267 (GEOMESA-3113 Add system property to managing HBase deletes with visibilities (#2792))
=======
>>>>>>> 264c9fa240 (Merge branch 'feature/postgis-fixes')
>>>>>>> 44b15e96d9 (GEOMESA-3113 Add system property to managing HBase deletes with visibilities (#2792))
<<<<<<< HEAD
>>>>>>> 813cf035d0 (GEOMESA-3113 Add system property to managing HBase deletes with visibilities (#2792))
<<<<<<< HEAD
>>>>>>> 2b9cd40059 (GEOMESA-3113 Add system property to managing HBase deletes with visibilities (#2792))
=======
=======
=======
=======
        val config = new JobConf(conf)
>>>>>>> 3be8d2a5a (Merge branch 'feature/postgis-fixes')
>>>>>>> db8d998aa2 (Merge branch 'feature/postgis-fixes')
>>>>>>> 42e8565e9b (Merge branch 'feature/postgis-fixes')
>>>>>>> 264c9fa240 (Merge branch 'feature/postgis-fixes')
=======
>>>>>>> 49337228be (GEOMESA-3102 Fix removal of user data in FileSystemDataStore.createSchema (#2787))
>>>>>>> 12ae1c3224 (GEOMESA-3102 Fix removal of user data in FileSystemDataStore.createSchema (#2787))
=======
>>>>>>> 54fb546133 (GEOMESA-3113 Add system property to managing HBase deletes with visibilities (#2792))
>>>>>>> 9f616db357 (GEOMESA-3113 Add system property to managing HBase deletes with visibilities (#2792))
=======
>>>>>>> 8be42d246c (GEOMESA-3102 Fix removal of user data in FileSystemDataStore.createSchema (#2787))
>>>>>>> e721efd628 (GEOMESA-3102 Fix removal of user data in FileSystemDataStore.createSchema (#2787))
=======
>>>>>>> 7ac82c3dce (GEOMESA-3113 Add system property to managing HBase deletes with visibilities (#2792))
>>>>>>> ed36e40e7c (GEOMESA-3113 Add system property to managing HBase deletes with visibilities (#2792))
=======
>>>>>>> 7fd052e7d2 (GEOMESA-3102 Fix removal of user data in FileSystemDataStore.createSchema (#2787))
>>>>>>> a05bcef080 (GEOMESA-3102 Fix removal of user data in FileSystemDataStore.createSchema (#2787))
=======
>>>>>>> 8a07c6167f (GEOMESA-3102 Fix removal of user data in FileSystemDataStore.createSchema (#2787))
=======
=======
>>>>>>> aca68ab685 (GEOMESA-3113 Add system property to managing HBase deletes with visibilities (#2792))
>>>>>>> 1b0d520fde (GEOMESA-3113 Add system property to managing HBase deletes with visibilities (#2792))
=======
>>>>>>> f7952edd5f (GEOMESA-3102 Fix removal of user data in FileSystemDataStore.createSchema (#2787))
>>>>>>> 871350de06 (GEOMESA-3102 Fix removal of user data in FileSystemDataStore.createSchema (#2787))
=======
>>>>>>> 9bcc7591e5 (GEOMESA-3113 Add system property to managing HBase deletes with visibilities (#2792))
=======
=======
>>>>>>> ce07ef89fe (GEOMESA-3102 Fix removal of user data in FileSystemDataStore.createSchema (#2787))
>>>>>>> 44bdcb9e58 (GEOMESA-3102 Fix removal of user data in FileSystemDataStore.createSchema (#2787))
>>>>>>> 894b6a1a15 (GEOMESA-3102 Fix removal of user data in FileSystemDataStore.createSchema (#2787))
=======
>>>>>>> 2ec7d64046 (GEOMESA-3102 Fix removal of user data in FileSystemDataStore.createSchema (#2787))
=======
=======
>>>>>>> e0056031ea (GEOMESA-3113 Add system property to managing HBase deletes with visibilities (#2792))
>>>>>>> 344200f1df (GEOMESA-3113 Add system property to managing HBase deletes with visibilities (#2792))
=======
>>>>>>> 15429a51ce (GEOMESA-3102 Fix removal of user data in FileSystemDataStore.createSchema (#2787))
>>>>>>> 8317120c9b (GEOMESA-3102 Fix removal of user data in FileSystemDataStore.createSchema (#2787))
=======
>>>>>>> 98e607d2fa (GEOMESA-3113 Add system property to managing HBase deletes with visibilities (#2792))
=======
=======
>>>>>>> 67de3c3202 (Merge branch 'feature/postgis-fixes')
>>>>>>> 217b7d1cb9 (Merge branch 'feature/postgis-fixes')
=======
=======
>>>>>>> 69016fbbb7 (GEOMESA-3113 Add system property to managing HBase deletes with visibilities (#2792))
>>>>>>> 3c4fc5a828 (GEOMESA-3113 Add system property to managing HBase deletes with visibilities (#2792))
<<<<<<< HEAD
>>>>>>> c6079ecae5 (GEOMESA-3113 Add system property to managing HBase deletes with visibilities (#2792))
<<<<<<< HEAD
>>>>>>> 5d46ff705f (GEOMESA-3113 Add system property to managing HBase deletes with visibilities (#2792))
=======
=======
=======
=======
>>>>>>> de3e57f03 (GEOMESA-3113 Add system property to managing HBase deletes with visibilities (#2792))
>>>>>>> 92feb5d273 (GEOMESA-3113 Add system property to managing HBase deletes with visibilities (#2792))
>>>>>>> e0644f7991 (GEOMESA-3113 Add system property to managing HBase deletes with visibilities (#2792))
>>>>>>> 69016fbbb7 (GEOMESA-3113 Add system property to managing HBase deletes with visibilities (#2792))
=======
>>>>>>> d73ae82492 (GEOMESA-3113 Add system property to managing HBase deletes with visibilities (#2792))
=======
=======
>>>>>>> dc17df6c0 (GEOMESA-3113 Add system property to managing HBase deletes with visibilities (#2792))
<<<<<<< HEAD
>>>>>>> 58f72e76c (GEOMESA-3113 Add system property to managing HBase deletes with visibilities (#2792))
<<<<<<< HEAD
>>>>>>> 8a234c7900 (GEOMESA-3113 Add system property to managing HBase deletes with visibilities (#2792))
<<<<<<< HEAD
>>>>>>> dba8cb28c4 (GEOMESA-3113 Add system property to managing HBase deletes with visibilities (#2792))
<<<<<<< HEAD
>>>>>>> d1d11691fd (GEOMESA-3113 Add system property to managing HBase deletes with visibilities (#2792))
=======
=======
=======
=======
=======
>>>>>>> 74c6b7f8d (GEOMESA-3102 Fix removal of user data in FileSystemDataStore.createSchema (#2787))
=======
>>>>>>> 76328bb49 (GEOMESA-3102 Fix removal of user data in FileSystemDataStore.createSchema (#2787))
=======
=======
        val config = new JobConf(conf)
>>>>>>> 1a21a3c30 (GEOMESA-3113 Add system property to managing HBase deletes with visibilities (#2792))
>>>>>>> f8f49130b (GEOMESA-3113 Add system property to managing HBase deletes with visibilities (#2792))
>>>>>>> 4c9fb0f6e (GEOMESA-3113 Add system property to managing HBase deletes with visibilities (#2792))
=======
>>>>>>> a8b2b56cbd (GEOMESA-3113 Add system property to managing HBase deletes with visibilities (#2792))
>>>>>>> b51d3046a2 (GEOMESA-3113 Add system property to managing HBase deletes with visibilities (#2792))
<<<<<<< HEAD
>>>>>>> 5f0745e34b (GEOMESA-3113 Add system property to managing HBase deletes with visibilities (#2792))
<<<<<<< HEAD
>>>>>>> eeb8ab478a (GEOMESA-3113 Add system property to managing HBase deletes with visibilities (#2792))
=======
=======
=======
=======
>>>>>>> 72415e208a (GEOMESA-3113 Add system property to managing HBase deletes with visibilities (#2792))
>>>>>>> c14e106409 (GEOMESA-3113 Add system property to managing HBase deletes with visibilities (#2792))
>>>>>>> e6162be24a (GEOMESA-3113 Add system property to managing HBase deletes with visibilities (#2792))
>>>>>>> a8b2b56cbd (GEOMESA-3113 Add system property to managing HBase deletes with visibilities (#2792))
=======
>>>>>>> b6e56a9e80 (Merge branch 'feature/postgis-fixes')
=======
=======
=======
>>>>>>> 29dcc37810 (GEOMESA-3113 Add system property to managing HBase deletes with visibilities (#2792))
>>>>>>> 5521d97d99 (GEOMESA-3102 Fix removal of user data in FileSystemDataStore.createSchema (#2787))
<<<<<<< HEAD
>>>>>>> 0e67f36558 (GEOMESA-3102 Fix removal of user data in FileSystemDataStore.createSchema (#2787))
<<<<<<< HEAD
>>>>>>> f502df5b55 (GEOMESA-3102 Fix removal of user data in FileSystemDataStore.createSchema (#2787))
<<<<<<< HEAD
>>>>>>> 27eec0d076 (GEOMESA-3102 Fix removal of user data in FileSystemDataStore.createSchema (#2787))
=======
=======
=======
=======
=======
=======
        val config = new JobConf(conf)
>>>>>>> 1a21a3c30 (GEOMESA-3113 Add system property to managing HBase deletes with visibilities (#2792))
>>>>>>> 9814eb976 (GEOMESA-3113 Add system property to managing HBase deletes with visibilities (#2792))
=======
>>>>>>> e11c16ba5d (GEOMESA-3102 Fix removal of user data in FileSystemDataStore.createSchema (#2787))
>>>>>>> 26fc359a06 (GEOMESA-3113 Add system property to managing HBase deletes with visibilities (#2792))
<<<<<<< HEAD
>>>>>>> 56f97cd271 (GEOMESA-3113 Add system property to managing HBase deletes with visibilities (#2792))
<<<<<<< HEAD
>>>>>>> 29dcc37810 (GEOMESA-3113 Add system property to managing HBase deletes with visibilities (#2792))
<<<<<<< HEAD
>>>>>>> afcf525d7d (GEOMESA-3113 Add system property to managing HBase deletes with visibilities (#2792))
=======
=======
=======
=======
=======
=======
        val config = new JobConf(conf)
>>>>>>> 1a21a3c30 (GEOMESA-3113 Add system property to managing HBase deletes with visibilities (#2792))
=======
>>>>>>> 85d211ca2 (GEOMESA-3102 Fix removal of user data in FileSystemDataStore.createSchema (#2787))
>>>>>>> 7119f2c52 (GEOMESA-3102 Fix removal of user data in FileSystemDataStore.createSchema (#2787))
=======
>>>>>>> 00494e0bcf (GEOMESA-3113 Add system property to managing HBase deletes with visibilities (#2792))
>>>>>>> adf2ac19a8 (GEOMESA-3102 Fix removal of user data in FileSystemDataStore.createSchema (#2787))
<<<<<<< HEAD
>>>>>>> 89ea8190e2 (GEOMESA-3102 Fix removal of user data in FileSystemDataStore.createSchema (#2787))
<<<<<<< HEAD
>>>>>>> f18f027f66 (GEOMESA-3102 Fix removal of user data in FileSystemDataStore.createSchema (#2787))
<<<<<<< HEAD
>>>>>>> e11c16ba5d (GEOMESA-3102 Fix removal of user data in FileSystemDataStore.createSchema (#2787))
=======
=======
=======
=======
=======
>>>>>>> 803762354 (GEOMESA-3113 Add system property to managing HBase deletes with visibilities (#2792))
=======
>>>>>>> 68098a00c3 (GEOMESA-3102 Fix removal of user data in FileSystemDataStore.createSchema (#2787))
>>>>>>> e62505d539 (GEOMESA-3113 Add system property to managing HBase deletes with visibilities (#2792))
<<<<<<< HEAD
>>>>>>> 3226e92d8e (GEOMESA-3113 Add system property to managing HBase deletes with visibilities (#2792))
<<<<<<< HEAD
>>>>>>> dbbcaa10d3 (GEOMESA-3113 Add system property to managing HBase deletes with visibilities (#2792))
<<<<<<< HEAD
>>>>>>> 00494e0bcf (GEOMESA-3113 Add system property to managing HBase deletes with visibilities (#2792))
=======
=======
=======
=======
=======
>>>>>>> f0b61142b (GEOMESA-3102 Fix removal of user data in FileSystemDataStore.createSchema (#2787))
=======
>>>>>>> 5742320897 (GEOMESA-3102 Fix removal of user data in FileSystemDataStore.createSchema (#2787))
>>>>>>> 0a6aff78fb (GEOMESA-3102 Fix removal of user data in FileSystemDataStore.createSchema (#2787))
<<<<<<< HEAD
>>>>>>> d9cabf401c (GEOMESA-3102 Fix removal of user data in FileSystemDataStore.createSchema (#2787))
<<<<<<< HEAD
>>>>>>> 28be12542f (GEOMESA-3102 Fix removal of user data in FileSystemDataStore.createSchema (#2787))
<<<<<<< HEAD
>>>>>>> 68098a00c3 (GEOMESA-3102 Fix removal of user data in FileSystemDataStore.createSchema (#2787))
=======
=======
=======
=======
=======
=======
>>>>>>> aa627812d (GEOMESA-3102 Fix removal of user data in FileSystemDataStore.createSchema (#2787))
>>>>>>> bd17bd131 (GEOMESA-3102 Fix removal of user data in FileSystemDataStore.createSchema (#2787))
=======
>>>>>>> c43c29e91c (GEOMESA-3113 Add system property to managing HBase deletes with visibilities (#2792))
>>>>>>> c555446b8b (GEOMESA-3102 Fix removal of user data in FileSystemDataStore.createSchema (#2787))
<<<<<<< HEAD
>>>>>>> 1230d64006 (GEOMESA-3102 Fix removal of user data in FileSystemDataStore.createSchema (#2787))
<<<<<<< HEAD
>>>>>>> 814abac33f (GEOMESA-3102 Fix removal of user data in FileSystemDataStore.createSchema (#2787))
<<<<<<< HEAD
>>>>>>> 5742320897 (GEOMESA-3102 Fix removal of user data in FileSystemDataStore.createSchema (#2787))
=======
=======
=======
=======
=======
>>>>>>> ca22354dd (GEOMESA-3113 Add system property to managing HBase deletes with visibilities (#2792))
=======
>>>>>>> 78439fc2da (GEOMESA-3102 Fix removal of user data in FileSystemDataStore.createSchema (#2787))
>>>>>>> 797b02396b (GEOMESA-3113 Add system property to managing HBase deletes with visibilities (#2792))
<<<<<<< HEAD
>>>>>>> cd5564bac6 (GEOMESA-3113 Add system property to managing HBase deletes with visibilities (#2792))
<<<<<<< HEAD
>>>>>>> f2b9fb3853 (GEOMESA-3113 Add system property to managing HBase deletes with visibilities (#2792))
<<<<<<< HEAD
>>>>>>> c43c29e91c (GEOMESA-3113 Add system property to managing HBase deletes with visibilities (#2792))
=======
=======
=======
=======
=======
>>>>>>> ea0c690e2 (GEOMESA-3102 Fix removal of user data in FileSystemDataStore.createSchema (#2787))
>>>>>>> c385f7994 (GEOMESA-3102 Fix removal of user data in FileSystemDataStore.createSchema (#2787))
=======
>>>>>>> 64c0e084b5 (GEOMESA-3113 Add system property to managing HBase deletes with visibilities (#2792))
>>>>>>> 3171e7407d (GEOMESA-3102 Fix removal of user data in FileSystemDataStore.createSchema (#2787))
<<<<<<< HEAD
>>>>>>> 038b4ca087 (GEOMESA-3102 Fix removal of user data in FileSystemDataStore.createSchema (#2787))
<<<<<<< HEAD
>>>>>>> 7f486255dd (GEOMESA-3102 Fix removal of user data in FileSystemDataStore.createSchema (#2787))
<<<<<<< HEAD
>>>>>>> 78439fc2da (GEOMESA-3102 Fix removal of user data in FileSystemDataStore.createSchema (#2787))
=======
=======
=======
=======
=======
<<<<<<< HEAD
>>>>>>> ea0c690e2 (GEOMESA-3102 Fix removal of user data in FileSystemDataStore.createSchema (#2787))
=======
=======
=======
        val config = new JobConf(conf)
>>>>>>> 1a21a3c30 (GEOMESA-3113 Add system property to managing HBase deletes with visibilities (#2792))
>>>>>>> 595c43086 (GEOMESA-3113 Add system property to managing HBase deletes with visibilities (#2792))
>>>>>>> dc17df6c0 (GEOMESA-3113 Add system property to managing HBase deletes with visibilities (#2792))
<<<<<<< HEAD
>>>>>>> 2d758409c (GEOMESA-3113 Add system property to managing HBase deletes with visibilities (#2792))
<<<<<<< HEAD
>>>>>>> 237494b1cc (GEOMESA-3113 Add system property to managing HBase deletes with visibilities (#2792))
<<<<<<< HEAD
>>>>>>> d774dc1d12 (GEOMESA-3113 Add system property to managing HBase deletes with visibilities (#2792))
<<<<<<< HEAD
>>>>>>> e639fc30a7 (GEOMESA-3113 Add system property to managing HBase deletes with visibilities (#2792))
<<<<<<< HEAD
>>>>>>> 64c0e084b5 (GEOMESA-3113 Add system property to managing HBase deletes with visibilities (#2792))
=======
=======
=======
=======
=======
=======
>>>>>>> 74c6b7f8d (GEOMESA-3102 Fix removal of user data in FileSystemDataStore.createSchema (#2787))
<<<<<<< HEAD
>>>>>>> 5a7f44513 (GEOMESA-3102 Fix removal of user data in FileSystemDataStore.createSchema (#2787))
<<<<<<< HEAD
>>>>>>> c7eb576a40 (GEOMESA-3102 Fix removal of user data in FileSystemDataStore.createSchema (#2787))
<<<<<<< HEAD
>>>>>>> 0645a0bbaf (GEOMESA-3102 Fix removal of user data in FileSystemDataStore.createSchema (#2787))
<<<<<<< HEAD
>>>>>>> c57a8a5ffe (GEOMESA-3102 Fix removal of user data in FileSystemDataStore.createSchema (#2787))
<<<<<<< HEAD
>>>>>>> 73cb7a0517 (GEOMESA-3102 Fix removal of user data in FileSystemDataStore.createSchema (#2787))
=======
=======
=======
=======
=======
=======
>>>>>>> 76328bb49 (GEOMESA-3102 Fix removal of user data in FileSystemDataStore.createSchema (#2787))
=======
>>>>>>> cdb062d5e9 (GEOMESA-3113 Add system property to managing HBase deletes with visibilities (#2792))
>>>>>>> 5c68fb7d1 (GEOMESA-3102 Fix removal of user data in FileSystemDataStore.createSchema (#2787))
<<<<<<< HEAD
>>>>>>> 9ec1f049a9 (GEOMESA-3102 Fix removal of user data in FileSystemDataStore.createSchema (#2787))
<<<<<<< HEAD
>>>>>>> e8b1c389e3 (GEOMESA-3102 Fix removal of user data in FileSystemDataStore.createSchema (#2787))
<<<<<<< HEAD
>>>>>>> 7e323ef52f (GEOMESA-3102 Fix removal of user data in FileSystemDataStore.createSchema (#2787))
<<<<<<< HEAD
>>>>>>> 4b926d9ec6 (GEOMESA-3102 Fix removal of user data in FileSystemDataStore.createSchema (#2787))
=======
=======
=======
=======
=======
=======
=======
        val config = new JobConf(conf)
>>>>>>> 1a21a3c30 (GEOMESA-3113 Add system property to managing HBase deletes with visibilities (#2792))
>>>>>>> f8f49130b (GEOMESA-3113 Add system property to managing HBase deletes with visibilities (#2792))
>>>>>>> 4a47c538b (GEOMESA-3113 Add system property to managing HBase deletes with visibilities (#2792))
=======
>>>>>>> a738799968 (GEOMESA-3102 Fix removal of user data in FileSystemDataStore.createSchema (#2787))
>>>>>>> a0d6da1831 (GEOMESA-3113 Add system property to managing HBase deletes with visibilities (#2792))
<<<<<<< HEAD
>>>>>>> 6abf5007af (GEOMESA-3113 Add system property to managing HBase deletes with visibilities (#2792))
<<<<<<< HEAD
>>>>>>> 69a4e317d6 (GEOMESA-3113 Add system property to managing HBase deletes with visibilities (#2792))
<<<<<<< HEAD
>>>>>>> cdb062d5e9 (GEOMESA-3113 Add system property to managing HBase deletes with visibilities (#2792))
=======
=======
=======
=======
=======
>>>>>>> 02ddf6ca4 (GEOMESA-3102 Fix removal of user data in FileSystemDataStore.createSchema (#2787))
>>>>>>> a358de35a (GEOMESA-3102 Fix removal of user data in FileSystemDataStore.createSchema (#2787))
=======
>>>>>>> 3d40465720 (GEOMESA-3113 Add system property to managing HBase deletes with visibilities (#2792))
>>>>>>> 1faf0d16f2 (GEOMESA-3102 Fix removal of user data in FileSystemDataStore.createSchema (#2787))
<<<<<<< HEAD
>>>>>>> 2212530e6b (GEOMESA-3102 Fix removal of user data in FileSystemDataStore.createSchema (#2787))
<<<<<<< HEAD
>>>>>>> e9395c1096 (GEOMESA-3102 Fix removal of user data in FileSystemDataStore.createSchema (#2787))
<<<<<<< HEAD
>>>>>>> a738799968 (GEOMESA-3102 Fix removal of user data in FileSystemDataStore.createSchema (#2787))
=======
=======
=======
=======
=======
>>>>>>> 44b15e96d (GEOMESA-3113 Add system property to managing HBase deletes with visibilities (#2792))
=======
>>>>>>> 0a5b74c946 (Merge branch 'feature/postgis-fixes')
>>>>>>> e5413df04f (GEOMESA-3113 Add system property to managing HBase deletes with visibilities (#2792))
<<<<<<< HEAD
>>>>>>> d38e17d229 (GEOMESA-3113 Add system property to managing HBase deletes with visibilities (#2792))
<<<<<<< HEAD
>>>>>>> 65460df3e6 (GEOMESA-3113 Add system property to managing HBase deletes with visibilities (#2792))
<<<<<<< HEAD
>>>>>>> 3d40465720 (GEOMESA-3113 Add system property to managing HBase deletes with visibilities (#2792))
=======
=======
=======
=======
=======
=======
        val config = new JobConf(conf)
>>>>>>> 3be8d2a5a (Merge branch 'feature/postgis-fixes')
>>>>>>> db8d998aa (Merge branch 'feature/postgis-fixes')
=======
>>>>>>> 49e9f5cb35 (GEOMESA-3102 Fix removal of user data in FileSystemDataStore.createSchema (#2787))
>>>>>>> cb6bda89b6 (Merge branch 'feature/postgis-fixes')
<<<<<<< HEAD
>>>>>>> 26e5afc4ea (Merge branch 'feature/postgis-fixes')
<<<<<<< HEAD
>>>>>>> 71adb695c5 (Merge branch 'feature/postgis-fixes')
<<<<<<< HEAD
>>>>>>> 0a5b74c946 (Merge branch 'feature/postgis-fixes')
=======
=======
=======
=======
=======
>>>>>>> d488f4180 (GEOMESA-3102 Fix removal of user data in FileSystemDataStore.createSchema (#2787))
=======
>>>>>>> 3867fd5b25 (GEOMESA-3113 Add system property to managing HBase deletes with visibilities (#2792))
>>>>>>> 8aa4f55ef6 (GEOMESA-3102 Fix removal of user data in FileSystemDataStore.createSchema (#2787))
<<<<<<< HEAD
>>>>>>> aeb7c3ed76 (GEOMESA-3102 Fix removal of user data in FileSystemDataStore.createSchema (#2787))
<<<<<<< HEAD
>>>>>>> 16bbecada1 (GEOMESA-3102 Fix removal of user data in FileSystemDataStore.createSchema (#2787))
<<<<<<< HEAD
>>>>>>> 49e9f5cb35 (GEOMESA-3102 Fix removal of user data in FileSystemDataStore.createSchema (#2787))
=======
=======
=======
=======
=======
=======
        val config = new JobConf(conf)
>>>>>>> 1a21a3c30 (GEOMESA-3113 Add system property to managing HBase deletes with visibilities (#2792))
>>>>>>> ac2d5a925 (GEOMESA-3113 Add system property to managing HBase deletes with visibilities (#2792))
=======
>>>>>>> 4d7289a2fe (GEOMESA-3102 Fix removal of user data in FileSystemDataStore.createSchema (#2787))
>>>>>>> 11addb1ce7 (GEOMESA-3113 Add system property to managing HBase deletes with visibilities (#2792))
<<<<<<< HEAD
>>>>>>> 42bfd74c63 (GEOMESA-3113 Add system property to managing HBase deletes with visibilities (#2792))
<<<<<<< HEAD
>>>>>>> be1167e028 (GEOMESA-3113 Add system property to managing HBase deletes with visibilities (#2792))
<<<<<<< HEAD
>>>>>>> 3867fd5b25 (GEOMESA-3113 Add system property to managing HBase deletes with visibilities (#2792))
=======
=======
=======
=======
=======
=======
        val config = new JobConf(conf)
>>>>>>> 1a21a3c30 (GEOMESA-3113 Add system property to managing HBase deletes with visibilities (#2792))
=======
>>>>>>> 85d211ca2 (GEOMESA-3102 Fix removal of user data in FileSystemDataStore.createSchema (#2787))
>>>>>>> 9ce7ed900 (GEOMESA-3102 Fix removal of user data in FileSystemDataStore.createSchema (#2787))
=======
>>>>>>> 5af1e798d5 (GEOMESA-3113 Add system property to managing HBase deletes with visibilities (#2792))
>>>>>>> 90d85d9b4b (GEOMESA-3102 Fix removal of user data in FileSystemDataStore.createSchema (#2787))
<<<<<<< HEAD
>>>>>>> bce9dc3e0e (GEOMESA-3102 Fix removal of user data in FileSystemDataStore.createSchema (#2787))
<<<<<<< HEAD
>>>>>>> fa2938c568 (GEOMESA-3102 Fix removal of user data in FileSystemDataStore.createSchema (#2787))
<<<<<<< HEAD
>>>>>>> 4d7289a2fe (GEOMESA-3102 Fix removal of user data in FileSystemDataStore.createSchema (#2787))
=======
=======
=======
=======
=======
>>>>>>> 7abafecb1 (GEOMESA-3113 Add system property to managing HBase deletes with visibilities (#2792))
=======
>>>>>>> eda8d4d014 (GEOMESA-3102 Fix removal of user data in FileSystemDataStore.createSchema (#2787))
>>>>>>> 1468e59829 (GEOMESA-3113 Add system property to managing HBase deletes with visibilities (#2792))
<<<<<<< HEAD
>>>>>>> 9c750992ef (GEOMESA-3113 Add system property to managing HBase deletes with visibilities (#2792))
<<<<<<< HEAD
>>>>>>> 54da398207 (GEOMESA-3113 Add system property to managing HBase deletes with visibilities (#2792))
<<<<<<< HEAD
>>>>>>> 5af1e798d5 (GEOMESA-3113 Add system property to managing HBase deletes with visibilities (#2792))
=======
=======
=======
=======
=======
>>>>>>> 7ef22a4bb (GEOMESA-3102 Fix removal of user data in FileSystemDataStore.createSchema (#2787))
=======
>>>>>>> f22bf41646 (GEOMESA-3102 Fix removal of user data in FileSystemDataStore.createSchema (#2787))
>>>>>>> c8d3361f41 (GEOMESA-3102 Fix removal of user data in FileSystemDataStore.createSchema (#2787))
<<<<<<< HEAD
>>>>>>> 48dcb085fa (GEOMESA-3102 Fix removal of user data in FileSystemDataStore.createSchema (#2787))
<<<<<<< HEAD
>>>>>>> e2aaf740bf (GEOMESA-3102 Fix removal of user data in FileSystemDataStore.createSchema (#2787))
<<<<<<< HEAD
>>>>>>> eda8d4d014 (GEOMESA-3102 Fix removal of user data in FileSystemDataStore.createSchema (#2787))
=======
=======
=======
=======
=======
=======
>>>>>>> aa627812d (GEOMESA-3102 Fix removal of user data in FileSystemDataStore.createSchema (#2787))
>>>>>>> 2b62bcaeb (GEOMESA-3102 Fix removal of user data in FileSystemDataStore.createSchema (#2787))
=======
>>>>>>> ffcb7ff3ae (GEOMESA-3113 Add system property to managing HBase deletes with visibilities (#2792))
>>>>>>> a618e2ba0a (GEOMESA-3102 Fix removal of user data in FileSystemDataStore.createSchema (#2787))
<<<<<<< HEAD
>>>>>>> 687ba5655c (GEOMESA-3102 Fix removal of user data in FileSystemDataStore.createSchema (#2787))
<<<<<<< HEAD
>>>>>>> 1682b13d94 (GEOMESA-3102 Fix removal of user data in FileSystemDataStore.createSchema (#2787))
<<<<<<< HEAD
>>>>>>> f22bf41646 (GEOMESA-3102 Fix removal of user data in FileSystemDataStore.createSchema (#2787))
=======
=======
=======
=======
=======
>>>>>>> afc081190 (GEOMESA-3113 Add system property to managing HBase deletes with visibilities (#2792))
=======
>>>>>>> 4b0c56ce56 (GEOMESA-3102 Fix removal of user data in FileSystemDataStore.createSchema (#2787))
>>>>>>> 65360f96a0 (GEOMESA-3113 Add system property to managing HBase deletes with visibilities (#2792))
<<<<<<< HEAD
>>>>>>> 97a911d79c (GEOMESA-3113 Add system property to managing HBase deletes with visibilities (#2792))
<<<<<<< HEAD
>>>>>>> 8999b3f6b9 (GEOMESA-3113 Add system property to managing HBase deletes with visibilities (#2792))
<<<<<<< HEAD
>>>>>>> ffcb7ff3ae (GEOMESA-3113 Add system property to managing HBase deletes with visibilities (#2792))
=======
=======
=======
=======
=======
>>>>>>> ea0c690e2 (GEOMESA-3102 Fix removal of user data in FileSystemDataStore.createSchema (#2787))
>>>>>>> 75f3f455e (GEOMESA-3102 Fix removal of user data in FileSystemDataStore.createSchema (#2787))
=======
>>>>>>> 9ac1262e54 (GEOMESA-3113 Add system property to managing HBase deletes with visibilities (#2792))
>>>>>>> 20dc993a76 (GEOMESA-3102 Fix removal of user data in FileSystemDataStore.createSchema (#2787))
<<<<<<< HEAD
>>>>>>> 33d2777a8a (GEOMESA-3102 Fix removal of user data in FileSystemDataStore.createSchema (#2787))
<<<<<<< HEAD
>>>>>>> abc395c346 (GEOMESA-3102 Fix removal of user data in FileSystemDataStore.createSchema (#2787))
<<<<<<< HEAD
>>>>>>> 4b0c56ce56 (GEOMESA-3102 Fix removal of user data in FileSystemDataStore.createSchema (#2787))
=======
=======
=======
=======
=======
<<<<<<< HEAD
>>>>>>> ea0c690e2 (GEOMESA-3102 Fix removal of user data in FileSystemDataStore.createSchema (#2787))
=======
=======
=======
        val config = new JobConf(conf)
>>>>>>> 1a21a3c30 (GEOMESA-3113 Add system property to managing HBase deletes with visibilities (#2792))
>>>>>>> 595c43086 (GEOMESA-3113 Add system property to managing HBase deletes with visibilities (#2792))
>>>>>>> dc17df6c0 (GEOMESA-3113 Add system property to managing HBase deletes with visibilities (#2792))
=======
>>>>>>> f1cbf28b81 (GEOMESA-3102 Fix removal of user data in FileSystemDataStore.createSchema (#2787))
>>>>>>> 7a3d004ad (GEOMESA-3113 Add system property to managing HBase deletes with visibilities (#2792))
<<<<<<< HEAD
>>>>>>> bd6dd934cc (GEOMESA-3113 Add system property to managing HBase deletes with visibilities (#2792))
<<<<<<< HEAD
>>>>>>> cc5f917a7c (GEOMESA-3113 Add system property to managing HBase deletes with visibilities (#2792))
<<<<<<< HEAD
>>>>>>> 3c53246c9a (GEOMESA-3113 Add system property to managing HBase deletes with visibilities (#2792))
<<<<<<< HEAD
>>>>>>> 9ac1262e54 (GEOMESA-3113 Add system property to managing HBase deletes with visibilities (#2792))
=======
=======
=======
=======
=======
=======
>>>>>>> 74c6b7f8d (GEOMESA-3102 Fix removal of user data in FileSystemDataStore.createSchema (#2787))
<<<<<<< HEAD
>>>>>>> ce07ef89f (GEOMESA-3102 Fix removal of user data in FileSystemDataStore.createSchema (#2787))
<<<<<<< HEAD
>>>>>>> b6118ef7a5 (GEOMESA-3102 Fix removal of user data in FileSystemDataStore.createSchema (#2787))
<<<<<<< HEAD
>>>>>>> 8309b2b098 (GEOMESA-3102 Fix removal of user data in FileSystemDataStore.createSchema (#2787))
<<<<<<< HEAD
>>>>>>> 4bb5bbc637 (GEOMESA-3102 Fix removal of user data in FileSystemDataStore.createSchema (#2787))
<<<<<<< HEAD
>>>>>>> f1cbf28b81 (GEOMESA-3102 Fix removal of user data in FileSystemDataStore.createSchema (#2787))
=======
=======
=======
=======
=======
=======
>>>>>>> 76328bb49 (GEOMESA-3102 Fix removal of user data in FileSystemDataStore.createSchema (#2787))
<<<<<<< HEAD
>>>>>>> 8871b2b4b (GEOMESA-3102 Fix removal of user data in FileSystemDataStore.createSchema (#2787))
<<<<<<< HEAD
>>>>>>> 495c744326 (GEOMESA-3102 Fix removal of user data in FileSystemDataStore.createSchema (#2787))
<<<<<<< HEAD
>>>>>>> a49ee0e00a (GEOMESA-3102 Fix removal of user data in FileSystemDataStore.createSchema (#2787))
<<<<<<< HEAD
>>>>>>> fd0ea5e670 (GEOMESA-3102 Fix removal of user data in FileSystemDataStore.createSchema (#2787))
<<<<<<< HEAD
>>>>>>> 1a90b3062a (GEOMESA-3102 Fix removal of user data in FileSystemDataStore.createSchema (#2787))
=======
=======
=======
=======
=======
=======
=======
        val config = new JobConf(conf)
>>>>>>> 1a21a3c30 (GEOMESA-3113 Add system property to managing HBase deletes with visibilities (#2792))
>>>>>>> f8f49130b (GEOMESA-3113 Add system property to managing HBase deletes with visibilities (#2792))
>>>>>>> 91b0d6a88 (GEOMESA-3113 Add system property to managing HBase deletes with visibilities (#2792))
=======
>>>>>>> c8431d18e4 (GEOMESA-3102 Fix removal of user data in FileSystemDataStore.createSchema (#2787))
>>>>>>> 49d3846b23 (GEOMESA-3113 Add system property to managing HBase deletes with visibilities (#2792))
<<<<<<< HEAD
>>>>>>> 3adb85864f (GEOMESA-3113 Add system property to managing HBase deletes with visibilities (#2792))
<<<<<<< HEAD
>>>>>>> fc179cb2d5 (GEOMESA-3113 Add system property to managing HBase deletes with visibilities (#2792))
<<<<<<< HEAD
>>>>>>> 043e029470 (GEOMESA-3113 Add system property to managing HBase deletes with visibilities (#2792))
=======
=======
=======
=======
=======
>>>>>>> 02ddf6ca4 (GEOMESA-3102 Fix removal of user data in FileSystemDataStore.createSchema (#2787))
>>>>>>> 4f922d74c (GEOMESA-3102 Fix removal of user data in FileSystemDataStore.createSchema (#2787))
=======
>>>>>>> 9dd4a005eb (GEOMESA-3113 Add system property to managing HBase deletes with visibilities (#2792))
>>>>>>> 155d6a9469 (GEOMESA-3102 Fix removal of user data in FileSystemDataStore.createSchema (#2787))
<<<<<<< HEAD
>>>>>>> a1198ce095 (GEOMESA-3102 Fix removal of user data in FileSystemDataStore.createSchema (#2787))
<<<<<<< HEAD
>>>>>>> d2e8dad373 (GEOMESA-3102 Fix removal of user data in FileSystemDataStore.createSchema (#2787))
<<<<<<< HEAD
>>>>>>> c8431d18e4 (GEOMESA-3102 Fix removal of user data in FileSystemDataStore.createSchema (#2787))
=======
=======
=======
=======
=======
>>>>>>> 1b5719bd3 (GEOMESA-3113 Add system property to managing HBase deletes with visibilities (#2792))
=======
>>>>>>> a30a0c1a2a (Merge branch 'feature/postgis-fixes')
>>>>>>> e4ee051914 (GEOMESA-3113 Add system property to managing HBase deletes with visibilities (#2792))
<<<<<<< HEAD
>>>>>>> 260d67442f (GEOMESA-3113 Add system property to managing HBase deletes with visibilities (#2792))
<<<<<<< HEAD
>>>>>>> 9e74e1d9b4 (GEOMESA-3113 Add system property to managing HBase deletes with visibilities (#2792))
<<<<<<< HEAD
>>>>>>> 9dd4a005eb (GEOMESA-3113 Add system property to managing HBase deletes with visibilities (#2792))
=======
=======
=======
=======
=======
=======
        val config = new JobConf(conf)
>>>>>>> 3be8d2a5a (Merge branch 'feature/postgis-fixes')
>>>>>>> 1b25d7ddb (Merge branch 'feature/postgis-fixes')
>>>>>>> 699117eca9 (Merge branch 'feature/postgis-fixes')
>>>>>>> c69897d7bd (Merge branch 'feature/postgis-fixes')
>>>>>>> 30559ea5c9 (Merge branch 'feature/postgis-fixes')
>>>>>>> a30a0c1a2a (Merge branch 'feature/postgis-fixes')
=======
>>>>>>> f148adeccd (GEOMESA-3102 Fix removal of user data in FileSystemDataStore.createSchema (#2787))
=======
=======
>>>>>>> 1d4e479464 (GEOMESA-3113 Add system property to managing HBase deletes with visibilities (#2792))
>>>>>>> b448819e24 (GEOMESA-3113 Add system property to managing HBase deletes with visibilities (#2792))
=======
>>>>>>> 735f1fc092 (GEOMESA-3102 Fix removal of user data in FileSystemDataStore.createSchema (#2787))
>>>>>>> d71800c037 (GEOMESA-3102 Fix removal of user data in FileSystemDataStore.createSchema (#2787))
=======
>>>>>>> a834a844c7 (GEOMESA-3113 Add system property to managing HBase deletes with visibilities (#2792))
>>>>>>> f68b76f4b8 (GEOMESA-3113 Add system property to managing HBase deletes with visibilities (#2792))
=======
>>>>>>> 84f529c13e (GEOMESA-3102 Fix removal of user data in FileSystemDataStore.createSchema (#2787))
>>>>>>> 027b4d7d58 (GEOMESA-3102 Fix removal of user data in FileSystemDataStore.createSchema (#2787))
=======
>>>>>>> 84f529c13e (GEOMESA-3102 Fix removal of user data in FileSystemDataStore.createSchema (#2787))
=======
=======
=======
>>>>>>> aa627812d (GEOMESA-3102 Fix removal of user data in FileSystemDataStore.createSchema (#2787))
>>>>>>> 526e71304c (GEOMESA-3102 Fix removal of user data in FileSystemDataStore.createSchema (#2787))
>>>>>>> 6d4f75bcbb (GEOMESA-3102 Fix removal of user data in FileSystemDataStore.createSchema (#2787))
<<<<<<< HEAD
>>>>>>> 4d1cac1d60 (GEOMESA-3102 Fix removal of user data in FileSystemDataStore.createSchema (#2787))
=======
=======
>>>>>>> 0d4496a2f2 (GEOMESA-3113 Add system property to managing HBase deletes with visibilities (#2792))
<<<<<<< HEAD
>>>>>>> cb8df4c76b (GEOMESA-3113 Add system property to managing HBase deletes with visibilities (#2792))
=======
=======
=======
>>>>>>> ea0c690e2 (GEOMESA-3102 Fix removal of user data in FileSystemDataStore.createSchema (#2787))
>>>>>>> 9c809610d5 (GEOMESA-3102 Fix removal of user data in FileSystemDataStore.createSchema (#2787))
>>>>>>> ee2741585f (GEOMESA-3102 Fix removal of user data in FileSystemDataStore.createSchema (#2787))
>>>>>>> 265d436467 (GEOMESA-3102 Fix removal of user data in FileSystemDataStore.createSchema (#2787))
=======
>>>>>>> 7ce9817488 (GEOMESA-3113 Add system property to managing HBase deletes with visibilities (#2792))
=======
=======
>>>>>>> 5d88c18b90 (GEOMESA-3102 Fix removal of user data in FileSystemDataStore.createSchema (#2787))
>>>>>>> 0c44f82169 (GEOMESA-3102 Fix removal of user data in FileSystemDataStore.createSchema (#2787))
=======
>>>>>>> 02465f5f58 (GEOMESA-3102 Fix removal of user data in FileSystemDataStore.createSchema (#2787))
=======
>>>>>>> 8eb59bcc3c (GEOMESA-3113 Add system property to managing HBase deletes with visibilities (#2792))
=======
=======
>>>>>>> 98ce8bad96 (GEOMESA-3102 Fix removal of user data in FileSystemDataStore.createSchema (#2787))
>>>>>>> ffdb14e2a7 (GEOMESA-3102 Fix removal of user data in FileSystemDataStore.createSchema (#2787))
>>>>>>> 6f245b0cc5 (GEOMESA-3102 Fix removal of user data in FileSystemDataStore.createSchema (#2787))
=======
>>>>>>> 07c698faf4 (GEOMESA-3113 Add system property to managing HBase deletes with visibilities (#2792))
=======
=======
>>>>>>> ec6d06b576 (Merge branch 'feature/postgis-fixes')
>>>>>>> cc93e0930d (Merge branch 'feature/postgis-fixes')
=======
>>>>>>> locationtech-main
=======
>>>>>>> 17748f36c5 (GEOMESA-3102 Fix removal of user data in FileSystemDataStore.createSchema (#2787))
<<<<<<< HEAD
>>>>>>> 36522ca6db (GEOMESA-3102 Fix removal of user data in FileSystemDataStore.createSchema (#2787))
=======
=======
=======
        val config = new JobConf(conf)
>>>>>>> 1a21a3c30 (GEOMESA-3113 Add system property to managing HBase deletes with visibilities (#2792))
>>>>>>> f4a18a3e5a (GEOMESA-3113 Add system property to managing HBase deletes with visibilities (#2792))
<<<<<<< HEAD
>>>>>>> 2d101f8da9 (GEOMESA-3113 Add system property to managing HBase deletes with visibilities (#2792))
=======
=======
>>>>>>> 0d96d8bd55 (GEOMESA-3113 Add system property to managing HBase deletes with visibilities (#2792))
<<<<<<< HEAD
>>>>>>> d71c234711 (GEOMESA-3113 Add system property to managing HBase deletes with visibilities (#2792))
=======
=======
>>>>>>> f4402ff40c (GEOMESA-3102 Fix removal of user data in FileSystemDataStore.createSchema (#2787))
<<<<<<< HEAD
>>>>>>> cfbdafd9de (GEOMESA-3102 Fix removal of user data in FileSystemDataStore.createSchema (#2787))
=======
=======
=======
>>>>>>> aa627812d (GEOMESA-3102 Fix removal of user data in FileSystemDataStore.createSchema (#2787))
>>>>>>> 582a3156f3 (GEOMESA-3102 Fix removal of user data in FileSystemDataStore.createSchema (#2787))
<<<<<<< HEAD
>>>>>>> 9d7ed88fa8 (GEOMESA-3102 Fix removal of user data in FileSystemDataStore.createSchema (#2787))
=======
=======
>>>>>>> 45dca3e07 (GEOMESA-3113 Add system property to managing HBase deletes with visibilities (#2792))
>>>>>>> a1ccc017c6 (GEOMESA-3113 Add system property to managing HBase deletes with visibilities (#2792))
<<<<<<< HEAD
>>>>>>> 40a526e8a3 (GEOMESA-3113 Add system property to managing HBase deletes with visibilities (#2792))
=======
=======
>>>>>>> 7c98bab97e (GEOMESA-3113 Add system property to managing HBase deletes with visibilities (#2792))
<<<<<<< HEAD
>>>>>>> 1a0678c1b1 (GEOMESA-3113 Add system property to managing HBase deletes with visibilities (#2792))
=======
=======
=======
>>>>>>> 76328bb49 (GEOMESA-3102 Fix removal of user data in FileSystemDataStore.createSchema (#2787))
>>>>>>> b23256999b (GEOMESA-3102 Fix removal of user data in FileSystemDataStore.createSchema (#2787))
<<<<<<< HEAD
>>>>>>> 474042e6d6 (GEOMESA-3102 Fix removal of user data in FileSystemDataStore.createSchema (#2787))
=======
=======
>>>>>>> 6ee72f98ac (GEOMESA-3113 Add system property to managing HBase deletes with visibilities (#2792))
<<<<<<< HEAD
>>>>>>> 10db10e107 (GEOMESA-3113 Add system property to managing HBase deletes with visibilities (#2792))
=======
=======
>>>>>>> 02ddf6ca4 (GEOMESA-3102 Fix removal of user data in FileSystemDataStore.createSchema (#2787))
>>>>>>> 8a2d3cfac9 (GEOMESA-3102 Fix removal of user data in FileSystemDataStore.createSchema (#2787))
<<<<<<< HEAD
>>>>>>> d073e4ceb3 (GEOMESA-3102 Fix removal of user data in FileSystemDataStore.createSchema (#2787))
=======
=======
=======
>>>>>>> 0cdf3f267 (GEOMESA-3113 Add system property to managing HBase deletes with visibilities (#2792))
>>>>>>> 869683ad83 (GEOMESA-3113 Add system property to managing HBase deletes with visibilities (#2792))
<<<<<<< HEAD
>>>>>>> 3571a41838 (GEOMESA-3113 Add system property to managing HBase deletes with visibilities (#2792))
=======
=======
=======
        val config = new JobConf(conf)
>>>>>>> 3be8d2a5a (Merge branch 'feature/postgis-fixes')
>>>>>>> 64eaf6b132 (Merge branch 'feature/postgis-fixes')
>>>>>>> 79bf541ac8 (Merge branch 'feature/postgis-fixes')
=======
>>>>>>> 17748f36c5 (GEOMESA-3102 Fix removal of user data in FileSystemDataStore.createSchema (#2787))
=======
=======
        val config = new JobConf(conf)
>>>>>>> 1a21a3c30 (GEOMESA-3113 Add system property to managing HBase deletes with visibilities (#2792))
>>>>>>> f4a18a3e5a (GEOMESA-3113 Add system property to managing HBase deletes with visibilities (#2792))
=======
=======
        val config = new JobConf(conf)
>>>>>>> 1a21a3c30 (GEOMESA-3113 Add system property to managing HBase deletes with visibilities (#2792))
=======
>>>>>>> 85d211ca2 (GEOMESA-3102 Fix removal of user data in FileSystemDataStore.createSchema (#2787))
>>>>>>> 8bcb82bef9 (GEOMESA-3102 Fix removal of user data in FileSystemDataStore.createSchema (#2787))
=======
>>>>>>> 0d96d8bd55 (GEOMESA-3113 Add system property to managing HBase deletes with visibilities (#2792))
=======
>>>>>>> f4402ff40c (GEOMESA-3102 Fix removal of user data in FileSystemDataStore.createSchema (#2787))
=======
=======
>>>>>>> aa627812d (GEOMESA-3102 Fix removal of user data in FileSystemDataStore.createSchema (#2787))
>>>>>>> 582a3156f3 (GEOMESA-3102 Fix removal of user data in FileSystemDataStore.createSchema (#2787))
=======
>>>>>>> 45dca3e07 (GEOMESA-3113 Add system property to managing HBase deletes with visibilities (#2792))
>>>>>>> a1ccc017c6 (GEOMESA-3113 Add system property to managing HBase deletes with visibilities (#2792))
=======
>>>>>>> ea0c690e2 (GEOMESA-3102 Fix removal of user data in FileSystemDataStore.createSchema (#2787))
>>>>>>> c4ce510344 (GEOMESA-3102 Fix removal of user data in FileSystemDataStore.createSchema (#2787))
=======
>>>>>>> 7c98bab97e (GEOMESA-3113 Add system property to managing HBase deletes with visibilities (#2792))
        GeoMesaAccumuloInputFormat.configure(config, paramsAsJava, qp, Some(ds.auths))
        sc.newAPIHadoopRDD(config, classOf[GeoMesaAccumuloInputFormat], classOf[Text], classOf[SimpleFeature]).map(_._2)
      }
    }

    try {
      // get the query plan to set up the iterators, ranges, etc
      // getMultipleQueryPlan will return the fallback if any
      // element of the plan is a JoinPlan
      val sft = ds.getSchema(query.getTypeName)
      val qps = AccumuloJobUtils.getMultipleQueryPlan(ds, query)

      // can return a union of the RDDs because the query planner *should*
      // be rewriting ORs to make them logically disjoint
      // e.g. "A OR B OR C" -> "A OR (B NOT A) OR ((C NOT A) NOT B)"
      val sfrdd = if (qps.lengthCompare(1) == 0 && qps.head.tables.lengthCompare(1) == 0) {
        queryPlanToRDD(sft, qps.head) // no union needed for single query plan
      } else {
        // flatten and duplicate the query plans so each one only has a single table
        val expanded = qps.flatMap {
          case qp: BatchScanPlan => qp.tables.map(t => qp.copy(tables = Seq(t)))
          case qp: EmptyPlan => Seq(qp)
          case qp => throw new NotImplementedError(s"Unexpected query plan type: $qp")
        }
        sc.union(expanded.map(queryPlanToRDD(sft, _)))
      }
      SpatialRDD(sfrdd, transform.getOrElse(sft))
    } finally {
      if (ds != null) {
        ds.dispose()
      }
    }
  }

  /**
    * Writes this RDD to a GeoMesa table.
    * The type must exist in the data store, and all of the features in the RDD must be of this type.
    *
    * @param rdd rdd
    * @param params params
    * @param typeName type name
    */
  def save(rdd: RDD[SimpleFeature], params: Map[String, String], typeName: String): Unit = {
    WithStore[AccumuloDataStore](params) { ds =>
      require(ds.getSchema(typeName) != null,
        "Feature type must exist before calling save. Call createSchema on the DataStore first.")
    }

    rdd.foreachPartition { iter =>
      WithStore[AccumuloDataStore](params) { ds =>
        WithClose(ds.getFeatureWriterAppend(typeName, Transaction.AUTO_COMMIT)) { writer =>
          iter.foreach(FeatureUtils.write(writer, _, useProvidedFid = true))
        }
      }
    }
  }
}
