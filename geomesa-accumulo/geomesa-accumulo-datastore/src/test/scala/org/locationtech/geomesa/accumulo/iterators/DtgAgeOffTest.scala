/***********************************************************************
 * Copyright (c) 2013-2024 Commonwealth Computer Research, Inc.
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Apache License, Version 2.0
 * which accompanies this distribution and is available at
 * http://www.opensource.org/licenses/apache2.0.php.
 ***********************************************************************/

package org.locationtech.geomesa.accumulo.iterators

<<<<<<< HEAD
<<<<<<< HEAD
<<<<<<< HEAD
<<<<<<< HEAD
<<<<<<< HEAD
<<<<<<< HEAD
<<<<<<< HEAD
<<<<<<< HEAD
<<<<<<< HEAD
import org.apache.accumulo.core.security.NamespacePermission
=======
<<<<<<< HEAD
>>>>>>> 3f46120787f (GEOMESA-3062 DtgAgeOff Filter does not work properly with join indexes (#2756))
=======
<<<<<<< HEAD
>>>>>>> 53850805107 (GEOMESA-3254 Add Bloop build support)
=======
<<<<<<< HEAD
>>>>>>> 22a38f23e56 (GEOMESA-3062 DtgAgeOff Filter does not work properly with join indexes (#2756))
=======
<<<<<<< HEAD
>>>>>>> f27a3227a94 (GEOMESA-3254 Add Bloop build support)
=======
<<<<<<< HEAD
>>>>>>> e01497052d1 (GEOMESA-3062 DtgAgeOff Filter does not work properly with join indexes (#2756))
=======
<<<<<<< HEAD
>>>>>>> e8262cd2acb (GEOMESA-3254 Add Bloop build support)
=======
<<<<<<< HEAD
>>>>>>> e6373511751 (GEOMESA-3062 DtgAgeOff Filter does not work properly with join indexes (#2756))
=======
<<<<<<< HEAD
>>>>>>> c2794ade1d2 (GEOMESA-3254 Add Bloop build support)
=======
<<<<<<< HEAD
>>>>>>> 55700402d6f (GEOMESA-3062 DtgAgeOff Filter does not work properly with join indexes (#2756))
import org.geotools.api.data.{DataStore, DataStoreFinder}
import org.geotools.api.feature.simple.SimpleFeature
import org.geotools.api.filter.Filter
=======
<<<<<<< HEAD
=======
>>>>>>> 0884e75348d (GEOMESA-3254 Add Bloop build support)
=======
>>>>>>> 122bdcdadd9 (GEOMESA-3062 DtgAgeOff Filter does not work properly with join indexes (#2756))
=======
>>>>>>> 15b6bf02d15 (GEOMESA-3254 Add Bloop build support)
=======
>>>>>>> 0b9cc5c9061 (GEOMESA-3062 DtgAgeOff Filter does not work properly with join indexes (#2756))
=======
>>>>>>> 7c6dac7c346 (GEOMESA-3254 Add Bloop build support)
=======
>>>>>>> 7d2471c8e3e (GEOMESA-3062 DtgAgeOff Filter does not work properly with join indexes (#2756))
=======
>>>>>>> a104e87b93f (GEOMESA-3254 Add Bloop build support)
=======
>>>>>>> 912129d8177 (GEOMESA-3062 DtgAgeOff Filter does not work properly with join indexes (#2756))
import org.apache.accumulo.core.client.security.tokens.PasswordToken
<<<<<<< HEAD
<<<<<<< HEAD
<<<<<<< HEAD
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
>>>>>>> 5a4c24e020 (GEOMESA-3254 Add Bloop build support)
=======
>>>>>>> 6bbccb88ad (GEOMESA-3062 DtgAgeOff Filter does not work properly with join indexes (#2756))
=======
>>>>>>> e303c34c32 (GEOMESA-3062 DtgAgeOff Filter does not work properly with join indexes (#2756))
=======
>>>>>>> c3880e4ec1 (GEOMESA-3062 DtgAgeOff Filter does not work properly with join indexes (#2756))
=======
<<<<<<< HEAD
>>>>>>> 2c1e7121ba (GEOMESA-3062 DtgAgeOff Filter does not work properly with join indexes (#2756))
=======
>>>>>>> f1532f2313 (GEOMESA-3254 Add Bloop build support)
=======
>>>>>>> 7564665969 (GEOMESA-3254 Add Bloop build support)
=======
=======
>>>>>>> e303c34c32 (GEOMESA-3062 DtgAgeOff Filter does not work properly with join indexes (#2756))
>>>>>>> 05a00a4ecf (GEOMESA-3062 DtgAgeOff Filter does not work properly with join indexes (#2756))
=======
=======
>>>>>>> 6bbccb88ad (GEOMESA-3062 DtgAgeOff Filter does not work properly with join indexes (#2756))
=======
=======
>>>>>>> 43225692a8 (GEOMESA-3062 DtgAgeOff Filter does not work properly with join indexes (#2756))
import java.time.{ZoneOffset, ZonedDateTime}
import java.util.{Collections, Date}

import org.apache.accumulo.core.client.Connector
<<<<<<< HEAD
<<<<<<< HEAD
<<<<<<< HEAD
<<<<<<< HEAD
<<<<<<< HEAD
<<<<<<< HEAD
<<<<<<< HEAD
<<<<<<< HEAD
=======
>>>>>>> d625188ed5 (GEOMESA-3062 DtgAgeOff Filter does not work properly with join indexes (#2756))
=======
>>>>>>> 05a00a4ecf (GEOMESA-3062 DtgAgeOff Filter does not work properly with join indexes (#2756))
=======
>>>>>>> 6bbccb88ad (GEOMESA-3062 DtgAgeOff Filter does not work properly with join indexes (#2756))
>>>>>>> 1ec19b5aac (GEOMESA-3062 DtgAgeOff Filter does not work properly with join indexes (#2756))
=======
>>>>>>> 1ec19b5aa (GEOMESA-3062 DtgAgeOff Filter does not work properly with join indexes (#2756))
>>>>>>> 0cdc5f0484 (GEOMESA-3062 DtgAgeOff Filter does not work properly with join indexes (#2756))
<<<<<<< HEAD
<<<<<<< HEAD
=======
>>>>>>> d845d7c1bd (GEOMESA-3254 Add Bloop build support)
=======
>>>>>>> 58d14a257e (GEOMESA-3254 Add Bloop build support)
<<<<<<< HEAD
<<<<<<< HEAD
=======
>>>>>>> 1ec19b5aa (GEOMESA-3062 DtgAgeOff Filter does not work properly with join indexes (#2756))
>>>>>>> e303c34c32 (GEOMESA-3062 DtgAgeOff Filter does not work properly with join indexes (#2756))
=======
>>>>>>> 63a045a753 (GEOMESA-3254 Add Bloop build support)
<<<<<<< HEAD
<<<<<<< HEAD
=======
>>>>>>> 1ec19b5aa (GEOMESA-3062 DtgAgeOff Filter does not work properly with join indexes (#2756))
>>>>>>> c3880e4ec1 (GEOMESA-3062 DtgAgeOff Filter does not work properly with join indexes (#2756))
=======
>>>>>>> 1ec19b5aac (GEOMESA-3062 DtgAgeOff Filter does not work properly with join indexes (#2756))
>>>>>>> 2c1e7121ba (GEOMESA-3062 DtgAgeOff Filter does not work properly with join indexes (#2756))
=======
>>>>>>> d625188ed5 (GEOMESA-3062 DtgAgeOff Filter does not work properly with join indexes (#2756))
=======
=======
>>>>>>> d845d7c1bd (GEOMESA-3254 Add Bloop build support)
>>>>>>> f1532f2313 (GEOMESA-3254 Add Bloop build support)
=======
>>>>>>> 7564665969 (GEOMESA-3254 Add Bloop build support)
=======
=======
>>>>>>> 1ec19b5aa (GEOMESA-3062 DtgAgeOff Filter does not work properly with join indexes (#2756))
>>>>>>> e303c34c32 (GEOMESA-3062 DtgAgeOff Filter does not work properly with join indexes (#2756))
>>>>>>> 05a00a4ecf (GEOMESA-3062 DtgAgeOff Filter does not work properly with join indexes (#2756))
=======
>>>>>>> 5a4c24e020 (GEOMESA-3254 Add Bloop build support)
=======
=======
>>>>>>> 1ec19b5aa (GEOMESA-3062 DtgAgeOff Filter does not work properly with join indexes (#2756))
>>>>>>> c3880e4ec1 (GEOMESA-3062 DtgAgeOff Filter does not work properly with join indexes (#2756))
>>>>>>> 6bbccb88ad (GEOMESA-3062 DtgAgeOff Filter does not work properly with join indexes (#2756))
=======
>>>>>>> 1ec19b5aac (GEOMESA-3062 DtgAgeOff Filter does not work properly with join indexes (#2756))
>>>>>>> 43225692a8 (GEOMESA-3062 DtgAgeOff Filter does not work properly with join indexes (#2756))
import org.geotools.data.{DataStore, DataStoreFinder}
>>>>>>> ffd9687a2fb (GEOMESA-3062 DtgAgeOff Filter does not work properly with join indexes (#2756))
import org.junit.runner.RunWith
import org.locationtech.geomesa.accumulo.AccumuloContainer.Users
import org.locationtech.geomesa.accumulo.data.AccumuloDataStoreParams
import org.locationtech.geomesa.accumulo.util.TableManager
import org.locationtech.geomesa.accumulo.{AccumuloContainer, TestWithFeatureType}
import org.locationtech.geomesa.features.ScalaSimpleFeature
import org.locationtech.geomesa.security.SecurityUtils
import org.locationtech.geomesa.utils.collection.{CloseableIterator, SelfClosingIterator}
import org.locationtech.geomesa.utils.geotools.SimpleFeatureTypes
import org.locationtech.geomesa.utils.geotools.SimpleFeatureTypes.Configs
import org.locationtech.geomesa.utils.io.WithClose
import org.specs2.mutable.Specification
import org.specs2.runner.JUnitRunner

import java.time.{ZoneOffset, ZonedDateTime}
import java.util.{Collections, Date}

@RunWith(classOf[JUnitRunner])
class DtgAgeOffTest extends Specification with TestWithFeatureType {

  import scala.collection.JavaConverters._

  sequential

  override val spec = "l1:Int,l2:Boolean,l3:Long,l4:Long,s:Int," +
    "name:String,foo:String:index=join,geom:Point:srid=4326,dtg:Date,bar:String:index=join"

  val today: ZonedDateTime = ZonedDateTime.now(ZoneOffset.UTC)

  def add(ids: Range, ident: String, vis: String): Unit = {
    val features = ids.map { i =>
      ScalaSimpleFeature.create(sft,  i.toString, 1, true, 3L, 4L, 5,
        "foo", s"${ident}_$i", s"POINT($i $i)", Date.from(today.minusDays(i).toInstant), "bar")
    }
    features.foreach(SecurityUtils.setFeatureVisibility(_, vis))
    addFeatures(features)
  }

  def getDataStore(user: String): DataStore =
    DataStoreFinder.getDataStore((dsParams ++ Map(AccumuloDataStoreParams.UserParam.key -> user)).asJava)

  def configureAgeOff(days: Int): Unit = {
    ds.updateSchema(sft.getTypeName,
      SimpleFeatureTypes.immutable(sft, Collections.singletonMap(Configs.FeatureExpiration, s"dtg($days days)")))
  }

  def query(ds: DataStore): Seq[SimpleFeature] =
    SelfClosingIterator(ds.getFeatureSource(sft.getTypeName).getFeatures(Filter.INCLUDE).features).toList

  step {
    val ns = catalog.substring(0, catalog.indexOf("."))
    WithClose(AccumuloContainer.Container.client()) { client =>
      new TableManager(client).ensureNamespaceExists(ns)
      client.securityOperations().grantNamespacePermission(Users.user.name, ns, NamespacePermission.READ)
      client.securityOperations().grantNamespacePermission(Users.admin.name, ns, NamespacePermission.READ)
    }
  }

  "DTGAgeOff" should {
    "run at scan time with vis" in {
      add(1 to 10, "id", "user")
      add(1 to 10, "idx2", "system")
      add(1 to 10, "idx3", "admin")

      val userDs = getDataStore(user.name)
      val adminDs = getDataStore(admin.name)
      val sysDs = ds

      query(userDs) must haveSize(10)
      query(adminDs) must haveSize(20)
      query(sysDs) must haveSize(30)

      scanDirect(30)

      configureAgeOff(11)
      query(userDs) must haveSize(10)
      query(adminDs) must haveSize(20)
      query(sysDs) must haveSize(30)

      scanDirect(30)

      configureAgeOff(10)
      query(userDs) must haveSize(9)
      query(adminDs) must haveSize(18)
      query(sysDs) must haveSize(27)

      scanDirect(27)

      configureAgeOff(5)
      query(userDs) must haveSize(4)
      query(adminDs) must haveSize(8)
      query(sysDs) must haveSize(12)

      configureAgeOff(1)
      query(userDs) must haveSize(0)
      query(adminDs) must haveSize(0)
      query(sysDs) must haveSize(0)
    }
  }

  // Scans all GeoMesa Accumulo tables directly and verifies the number of records that the `root` user can see.
<<<<<<< HEAD
  private def scanDirect(expected: Int): Unit = {
    WithClose(AccumuloContainer.Container.client()) { conn =>
      val tables = conn.tableOperations().list().asScala.filter(_.contains("DtgAgeOffTest_DtgAgeOffTest"))
      tables must not(beEmpty)
      forall(tables) { tableName =>
        val scanner = conn.createScanner(tableName, AccumuloContainer.Users.root.auths)
        val count = scanner.asScala.size
        scanner.close()
        count mustEqual expected
      }
    }
=======
  private def scanDirect(expected: Int) = {
<<<<<<< HEAD
    val conn = MiniCluster.cluster.createAccumuloClient(MiniCluster.Users.root.name, new PasswordToken(MiniCluster.Users.root.password))
<<<<<<< HEAD
<<<<<<< HEAD
<<<<<<< HEAD
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
>>>>>>> f1532f2313 (GEOMESA-3254 Add Bloop build support)
=======
>>>>>>> 7564665969 (GEOMESA-3254 Add Bloop build support)
=======
>>>>>>> 05a00a4ecf (GEOMESA-3062 DtgAgeOff Filter does not work properly with join indexes (#2756))
=======
>>>>>>> 5a4c24e020 (GEOMESA-3254 Add Bloop build support)
=======
>>>>>>> 6bbccb88ad (GEOMESA-3062 DtgAgeOff Filter does not work properly with join indexes (#2756))
=======
    val conn: Connector = MiniCluster.cluster.getConnector(MiniCluster.Users.root.name, MiniCluster.Users.root.password)
<<<<<<< HEAD
>>>>>>> 1ec19b5aac (GEOMESA-3062 DtgAgeOff Filter does not work properly with join indexes (#2756))
=======
>>>>>>> 1ec19b5aa (GEOMESA-3062 DtgAgeOff Filter does not work properly with join indexes (#2756))
>>>>>>> 0cdc5f0484 (GEOMESA-3062 DtgAgeOff Filter does not work properly with join indexes (#2756))
=======
>>>>>>> d845d7c1bd (GEOMESA-3254 Add Bloop build support)
<<<<<<< HEAD
<<<<<<< HEAD
=======
>>>>>>> 58d14a257e (GEOMESA-3254 Add Bloop build support)
=======
=======
    val conn: Connector = MiniCluster.cluster.getConnector(MiniCluster.Users.root.name, MiniCluster.Users.root.password)
>>>>>>> 1ec19b5aa (GEOMESA-3062 DtgAgeOff Filter does not work properly with join indexes (#2756))
>>>>>>> e303c34c32 (GEOMESA-3062 DtgAgeOff Filter does not work properly with join indexes (#2756))
<<<<<<< HEAD
<<<<<<< HEAD
=======
>>>>>>> 63a045a753 (GEOMESA-3254 Add Bloop build support)
=======
=======
    val conn: Connector = MiniCluster.cluster.getConnector(MiniCluster.Users.root.name, MiniCluster.Users.root.password)
>>>>>>> 1ec19b5aa (GEOMESA-3062 DtgAgeOff Filter does not work properly with join indexes (#2756))
>>>>>>> c3880e4ec1 (GEOMESA-3062 DtgAgeOff Filter does not work properly with join indexes (#2756))
<<<<<<< HEAD
=======
=======
    val conn: Connector = MiniCluster.cluster.getConnector(MiniCluster.Users.root.name, MiniCluster.Users.root.password)
<<<<<<< HEAD
>>>>>>> 1ec19b5aac (GEOMESA-3062 DtgAgeOff Filter does not work properly with join indexes (#2756))
<<<<<<< HEAD
>>>>>>> 2c1e7121ba (GEOMESA-3062 DtgAgeOff Filter does not work properly with join indexes (#2756))
=======
=======
>>>>>>> 1ec19b5aa (GEOMESA-3062 DtgAgeOff Filter does not work properly with join indexes (#2756))
>>>>>>> 0cdc5f0484 (GEOMESA-3062 DtgAgeOff Filter does not work properly with join indexes (#2756))
>>>>>>> d625188ed5 (GEOMESA-3062 DtgAgeOff Filter does not work properly with join indexes (#2756))
=======
>>>>>>> f1532f2313 (GEOMESA-3254 Add Bloop build support)
=======
=======
>>>>>>> 58d14a257e (GEOMESA-3254 Add Bloop build support)
>>>>>>> 7564665969 (GEOMESA-3254 Add Bloop build support)
=======
>>>>>>> 05a00a4ecf (GEOMESA-3062 DtgAgeOff Filter does not work properly with join indexes (#2756))
=======
=======
>>>>>>> 63a045a753 (GEOMESA-3254 Add Bloop build support)
>>>>>>> 5a4c24e020 (GEOMESA-3254 Add Bloop build support)
=======
>>>>>>> 6bbccb88ad (GEOMESA-3062 DtgAgeOff Filter does not work properly with join indexes (#2756))
=======
=======
    val conn: Connector = MiniCluster.cluster.getConnector(MiniCluster.Users.root.name, MiniCluster.Users.root.password)
>>>>>>> 1ec19b5aac (GEOMESA-3062 DtgAgeOff Filter does not work properly with join indexes (#2756))
>>>>>>> 43225692a8 (GEOMESA-3062 DtgAgeOff Filter does not work properly with join indexes (#2756))
    conn.tableOperations().list().asScala.filter(t => t.contains("DtgAgeOffTest_DtgAgeOffTest")).forall { tableName =>
      val scanner = conn.createScanner(tableName, MiniCluster.Users.root.auths)
      val count = scanner.asScala.size
      scanner.close()
      count mustEqual expected
    }
<<<<<<< HEAD
    conn.close()
<<<<<<< HEAD
<<<<<<< HEAD
<<<<<<< HEAD
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
>>>>>>> f1532f2313 (GEOMESA-3254 Add Bloop build support)
=======
>>>>>>> 7564665969 (GEOMESA-3254 Add Bloop build support)
=======
>>>>>>> 05a00a4ecf (GEOMESA-3062 DtgAgeOff Filter does not work properly with join indexes (#2756))
=======
>>>>>>> 5a4c24e020 (GEOMESA-3254 Add Bloop build support)
=======
>>>>>>> 6bbccb88ad (GEOMESA-3062 DtgAgeOff Filter does not work properly with join indexes (#2756))
=======
<<<<<<< HEAD
>>>>>>> 1ec19b5aac (GEOMESA-3062 DtgAgeOff Filter does not work properly with join indexes (#2756))
<<<<<<< HEAD
>>>>>>> ffd9687a2fb (GEOMESA-3062 DtgAgeOff Filter does not work properly with join indexes (#2756))
=======
=======
>>>>>>> 1ec19b5aa (GEOMESA-3062 DtgAgeOff Filter does not work properly with join indexes (#2756))
>>>>>>> 0cdc5f0484 (GEOMESA-3062 DtgAgeOff Filter does not work properly with join indexes (#2756))
<<<<<<< HEAD
>>>>>>> 7d68dc5b4dd (GEOMESA-3062 DtgAgeOff Filter does not work properly with join indexes (#2756))
=======
=======
>>>>>>> d845d7c1bd (GEOMESA-3254 Add Bloop build support)
<<<<<<< HEAD
<<<<<<< HEAD
<<<<<<< HEAD
>>>>>>> 0884e75348d (GEOMESA-3254 Add Bloop build support)
=======
=======
>>>>>>> 7c6dac7c346 (GEOMESA-3254 Add Bloop build support)
=======
>>>>>>> 04ca02e264f (GEOMESA-3254 Add Bloop build support)
=======
>>>>>>> 58d14a257e (GEOMESA-3254 Add Bloop build support)
<<<<<<< HEAD
>>>>>>> 4a4bbd8ec03 (GEOMESA-3254 Add Bloop build support)
=======
=======
=======
>>>>>>> 1ec19b5aa (GEOMESA-3062 DtgAgeOff Filter does not work properly with join indexes (#2756))
>>>>>>> e303c34c32 (GEOMESA-3062 DtgAgeOff Filter does not work properly with join indexes (#2756))
<<<<<<< HEAD
<<<<<<< HEAD
<<<<<<< HEAD
>>>>>>> 122bdcdadd9 (GEOMESA-3062 DtgAgeOff Filter does not work properly with join indexes (#2756))
=======
=======
>>>>>>> 7d2471c8e3e (GEOMESA-3062 DtgAgeOff Filter does not work properly with join indexes (#2756))
=======
>>>>>>> a104e87b93f (GEOMESA-3254 Add Bloop build support)
=======
>>>>>>> 63a045a753 (GEOMESA-3254 Add Bloop build support)
<<<<<<< HEAD
>>>>>>> 15b6bf02d15 (GEOMESA-3254 Add Bloop build support)
=======
=======
=======
>>>>>>> 1ec19b5aa (GEOMESA-3062 DtgAgeOff Filter does not work properly with join indexes (#2756))
>>>>>>> c3880e4ec1 (GEOMESA-3062 DtgAgeOff Filter does not work properly with join indexes (#2756))
<<<<<<< HEAD
<<<<<<< HEAD
>>>>>>> 0b9cc5c9061 (GEOMESA-3062 DtgAgeOff Filter does not work properly with join indexes (#2756))
=======
=======
>>>>>>> 912129d8177 (GEOMESA-3062 DtgAgeOff Filter does not work properly with join indexes (#2756))
=======
=======
<<<<<<< HEAD
>>>>>>> 1ec19b5aac (GEOMESA-3062 DtgAgeOff Filter does not work properly with join indexes (#2756))
<<<<<<< HEAD
>>>>>>> 2c1e7121ba (GEOMESA-3062 DtgAgeOff Filter does not work properly with join indexes (#2756))
<<<<<<< HEAD
>>>>>>> 3d1f3275103 (GEOMESA-3062 DtgAgeOff Filter does not work properly with join indexes (#2756))
=======
=======
=======
>>>>>>> 1ec19b5aa (GEOMESA-3062 DtgAgeOff Filter does not work properly with join indexes (#2756))
>>>>>>> 0cdc5f0484 (GEOMESA-3062 DtgAgeOff Filter does not work properly with join indexes (#2756))
>>>>>>> d625188ed5 (GEOMESA-3062 DtgAgeOff Filter does not work properly with join indexes (#2756))
<<<<<<< HEAD
>>>>>>> 1fdc45aa600 (GEOMESA-3062 DtgAgeOff Filter does not work properly with join indexes (#2756))
=======
=======
>>>>>>> f1532f2313 (GEOMESA-3254 Add Bloop build support)
<<<<<<< HEAD
>>>>>>> 7c6dac7c346 (GEOMESA-3254 Add Bloop build support)
=======
=======
=======
>>>>>>> 58d14a257e (GEOMESA-3254 Add Bloop build support)
>>>>>>> 7564665969 (GEOMESA-3254 Add Bloop build support)
<<<<<<< HEAD
>>>>>>> 04ca02e264f (GEOMESA-3254 Add Bloop build support)
=======
=======
>>>>>>> 05a00a4ecf (GEOMESA-3062 DtgAgeOff Filter does not work properly with join indexes (#2756))
<<<<<<< HEAD
>>>>>>> 7d2471c8e3e (GEOMESA-3062 DtgAgeOff Filter does not work properly with join indexes (#2756))
=======
=======
=======
>>>>>>> 63a045a753 (GEOMESA-3254 Add Bloop build support)
>>>>>>> 5a4c24e020 (GEOMESA-3254 Add Bloop build support)
<<<<<<< HEAD
>>>>>>> a104e87b93f (GEOMESA-3254 Add Bloop build support)
=======
=======
>>>>>>> 6bbccb88ad (GEOMESA-3062 DtgAgeOff Filter does not work properly with join indexes (#2756))
<<<<<<< HEAD
>>>>>>> 912129d8177 (GEOMESA-3062 DtgAgeOff Filter does not work properly with join indexes (#2756))
=======
=======
=======
>>>>>>> 1ec19b5aac (GEOMESA-3062 DtgAgeOff Filter does not work properly with join indexes (#2756))
>>>>>>> 43225692a8 (GEOMESA-3062 DtgAgeOff Filter does not work properly with join indexes (#2756))
>>>>>>> b9f32bdf532 (GEOMESA-3062 DtgAgeOff Filter does not work properly with join indexes (#2756))
  }
}
