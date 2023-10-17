/***********************************************************************
 * Copyright (c) 2013-2023 Commonwealth Computer Research, Inc.
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Apache License, Version 2.0
 * which accompanies this distribution and is available at
 * http://www.opensource.org/licenses/apache2.0.php.
 ***********************************************************************/

package org.locationtech.geomesa.gt.partition.postgis

import com.typesafe.scalalogging.LazyLogging
<<<<<<< HEAD
<<<<<<< HEAD
import org.geotools.data._
import org.geotools.feature.simple.SimpleFeatureBuilder
=======
import org.geotools.data.postgis.PostGISPSDialect
<<<<<<< HEAD
<<<<<<< HEAD
import org.geotools.data.{DataStoreFinder, DefaultTransaction, Query, Transaction}
=======
<<<<<<< HEAD
=======
import org.geotools.data.{DataStoreFinder, DefaultTransaction, Query, Transaction}
>>>>>>> ee1d5f207 (GEOMESA-3215 Postgis - support List-type attributes)
>>>>>>> cf1d94c7a8 (GEOMESA-3215 Postgis - support List-type attributes)
=======
>>>>>>> d845d7c1bd (GEOMESA-3254 Add Bloop build support)
=======
import org.geotools.data._
import org.geotools.data.postgis.PostGISPSDialect
>>>>>>> 58d14a257e (GEOMESA-3254 Add Bloop build support)
import org.geotools.filter.identity.FeatureIdImpl
>>>>>>> ee1d5f2071 (GEOMESA-3215 Postgis - support List-type attributes)
import org.geotools.filter.text.ecql.ECQL
import org.geotools.jdbc.JDBCDataStore
import org.geotools.referencing.CRS
import org.junit.runner.RunWith
import org.locationtech.geomesa.filter.FilterHelper
import org.locationtech.geomesa.gt.partition.postgis.dialect.procedures.{DropAgedOffPartitions, PartitionMaintenance, RollWriteAheadLog}
import org.locationtech.geomesa.gt.partition.postgis.dialect.tables.{PartitionTablespacesTable, PrimaryKeyTable, SequenceTable, UserDataTable}
import org.locationtech.geomesa.gt.partition.postgis.dialect.{PartitionedPostgisDialect, PartitionedPostgisPsDialect, TableConfig, TypeInfo}
import org.locationtech.geomesa.utils.collection.SelfClosingIterator
import org.locationtech.geomesa.utils.geotools.{FeatureUtils, ObjectType, SimpleFeatureTypes}
import org.locationtech.geomesa.utils.io.WithClose
import org.locationtech.geomesa.utils.text.WKTUtils
import org.opengis.feature.simple.{SimpleFeature, SimpleFeatureType}
import org.opengis.filter.Filter
import org.specs2.mutable.Specification
import org.specs2.runner.JUnitRunner
import org.specs2.specification.BeforeAfterAll
import org.testcontainers.containers.GenericContainer
import org.testcontainers.containers.output.Slf4jLogConsumer
import org.testcontainers.images.builder.ImageFromDockerfile

<<<<<<< HEAD
<<<<<<< HEAD
import java.sql.Connection
import java.util.concurrent.CopyOnWriteArrayList
import java.util.logging.{Handler, Level, LogRecord}
import java.util.{Collections, Locale}
import scala.collection.mutable.ArrayBuffer
=======
=======
import java.util.Collections
>>>>>>> ee1d5f2071 (GEOMESA-3215 Postgis - support List-type attributes)
import scala.annotation.tailrec
>>>>>>> f639b39b85 (GEOMESA-3208 Postgis - Fix camel-case feature type names)
import scala.util.Try
import scala.util.control.NonFatal

@RunWith(classOf[JUnitRunner])
class PartitionedPostgisDataStoreTest extends Specification with BeforeAfterAll with LazyLogging {

  import scala.collection.JavaConverters._

  val hours = 1
  val spec =
<<<<<<< HEAD
<<<<<<< HEAD
<<<<<<< HEAD
<<<<<<< HEAD
<<<<<<< HEAD
    "name:List[String],props:String:json=true,age:Int,dtg:Date,*geom:Point:srid=4326;" +
=======
    "name:List[String],age:Int,dtg:Date,*geom:Point:srid=4326;" +
>>>>>>> ee1d5f2071 (GEOMESA-3215 Postgis - support List-type attributes)
=======
    "name:List[String],props:String:json=true,age:Int,dtg:Date,*geom:Point:srid=4326;" +
>>>>>>> 865887e960 (GEOMESA-3217,GEOMESA-3216 Support Postgis json attributes, top-level arrays in json)
=======
=======
>>>>>>> e243573ba4 (GEOMESA-3217,GEOMESA-3216 Support Postgis json attributes, top-level arrays in json)
    "name:List[String],props:String:json=true,age:Int,dtg:Date,*geom:Point:srid=4326;" +
=======
    "name:List[String],age:Int,dtg:Date,*geom:Point:srid=4326;" +
>>>>>>> ee1d5f207 (GEOMESA-3215 Postgis - support List-type attributes)
<<<<<<< HEAD
>>>>>>> cf1d94c7a8 (GEOMESA-3215 Postgis - support List-type attributes)
=======
=======
    "name:List[String],props:String:json=true,age:Int,dtg:Date,*geom:Point:srid=4326;" +
>>>>>>> 865887e96 (GEOMESA-3217,GEOMESA-3216 Support Postgis json attributes, top-level arrays in json)
>>>>>>> e243573ba4 (GEOMESA-3217,GEOMESA-3216 Support Postgis json attributes, top-level arrays in json)
=======
    "name:List[String],props:String:json=true,age:Int,dtg:Date,*geom:Point:srid=4326;" +
>>>>>>> d845d7c1bd (GEOMESA-3254 Add Bloop build support)
        Seq(
          s"pg.partitions.interval.hours=$hours",
          "pg.partitions.cron.minute=0"/*,
          "pg.partitions.pages-per-range=32",
          "pg.partitions.max=2",
          "pg.partitions.tablespace.wa=partition",
          "pg.partitions.tablespace.wa-partitions=partition",
          "pg.partitions.tablespace.main=partition",*/
        ).mkString(",")

<<<<<<< HEAD
  val schema = "public"
=======
  val methods =
    Methods(
      create = false,
      upgrade = false,
      write = false,
      update = false,
      query = false,
      delete = false,
      remove = false
    )
>>>>>>> ee1d5f2071 (GEOMESA-3215 Postgis - support List-type attributes)

  lazy val sft = SimpleFeatureTypes.createType(s"test", spec)

  lazy val now = System.currentTimeMillis()

  lazy val features = Seq.tabulate(10) { i =>
    val builder = new SimpleFeatureBuilder(sft)
    builder.set("name", Collections.singletonList(s"name$i"))
    builder.set("age", i)
    builder.set("props", s"""["name$i"]""")
    builder.set("dtg", new java.util.Date(now - ((i + 1) * 20 * 60 * 1000))) // 20 minutes
    builder.set("geom", WKTUtils.read(s"POINT(0 $i)"))
    builder.buildFeature(s"fid$i")
  }

  lazy val params = Map(
    "dbtype" -> PartitionedPostgisDataStoreParams.DbType.sample,
    "host" -> host,
    "port" -> port,
    "database" -> "postgres",
    "user" -> "postgres",
    "passwd" -> "postgres",
    "Batch insert size" -> "10",
    "preparedStatements" -> "true"
  )

  var container: GenericContainer[_] = _

  lazy val host = Option(container).map(_.getHost).getOrElse("localhost")
  lazy val port = Option(container).map(_.getFirstMappedPort).getOrElse(5432).toString

  override def beforeAll(): Unit = {
    val image =
      new ImageFromDockerfile("testcontainers/postgis_cron", false)
          .withFileFromClasspath(".", "testcontainers")
          .withBuildArg("FROM_TAG", sys.props.getOrElse("postgis.docker.tag", "15-3.3"))
    container = new GenericContainer(image)
    container.addEnv("POSTGRES_HOST_AUTH_METHOD", "trust")
    container.addExposedPort(5432)
    container.start()
    container.followOutput(new Slf4jLogConsumer(logger.underlying))
  }

  override def afterAll(): Unit = {
    if (container != null) {
      container.stop()
    }
  }

  "PartitionedPostgisDataStore" should {
    "work" in {
<<<<<<< HEAD
<<<<<<< HEAD
=======
      skipped("requires postgis instance")
=======
      if (!methods.any) {
        skipped("requires postgis instance")
      }
>>>>>>> 58d14a257e (GEOMESA-3254 Add Bloop build support)
      val params =
        Map(
          "dbtype"   -> PartitionedPostgisDataStoreParams.DbType.sample,
          "host"     -> "localhost",
          "port"     -> "5432",
          "schema"   -> "public",
          "database" -> "postgres",
          "user"     -> "postgres",
          "passwd"   -> "postgres",
          "Batch insert size"  -> "10",
          "Commit size"        -> "20",
          "preparedStatements" -> "true"
        )

>>>>>>> f639b39b85 (GEOMESA-3208 Postgis - Fix camel-case feature type names)
      val ds = DataStoreFinder.getDataStore(params.asJava)
      ds must not(beNull)

      try {
        ds must beAnInstanceOf[JDBCDataStore]

<<<<<<< HEAD
        foreach(Seq("test", "test-dash")) { name =>
          val sft = SimpleFeatureTypes.renameSft(this.sft, name)
          ds.getTypeNames.toSeq must not(contain(sft.getTypeName))
          ds.createSchema(sft)
=======
        logger.info(s"Existing type names: ${ds.getTypeNames.mkString(", ")}")

        if (methods.create) {
          if (ds.getTypeNames.contains(sft.getTypeName)) {
            logger.warn("Schema already exists, skipping create")
          } else {
            ds.createSchema(sft)
          }
        }
        if (methods.upgrade) {
          WithClose(ds.asInstanceOf[JDBCDataStore].getConnection(Transaction.AUTO_COMMIT)) { cx =>
            val dialect = ds.asInstanceOf[JDBCDataStore].dialect match {
              case p: PartitionedPostgisDialect => p
              case p: PostGISPSDialect =>
                @tailrec
                def unwrap(c: Class[_]): Class[_] =
                  if (c == classOf[PostGISPSDialect]) { c } else { unwrap(c.getSuperclass) }
                val m = unwrap(p.getClass).getDeclaredMethod("getDelegate")
                m.setAccessible(true)
                m.invoke(p).asInstanceOf[PartitionedPostgisDialect]
            }
            dialect.upgrade("public", sft, cx)
          }
        }
>>>>>>> 58d14a257e (GEOMESA-3254 Add Bloop build support)

<<<<<<< HEAD
<<<<<<< HEAD
<<<<<<< HEAD
<<<<<<< HEAD
<<<<<<< HEAD
          val schema = Try(ds.getSchema(sft.getTypeName)).getOrElse(null)
          schema must not(beNull)
          schema.getUserData.asScala must containAllOf(sft.getUserData.asScala.toSeq)
          logger.debug(s"Schema: ${SimpleFeatureTypes.encodeType(schema)}")
=======
        val userData = Try(ds.getSchema(sft.getTypeName)).map(_.getUserData.asScala).getOrElse(null)
        userData must not(beNull)
        userData must containAllOf(sft.getUserData.asScala.toSeq)
>>>>>>> f639b39b85 (GEOMESA-3208 Postgis - Fix camel-case feature type names)
=======
=======
>>>>>>> 203dda21b9 (GEOMESA-3208 Postgis - Fix camel-case feature type names)
=======
=======
>>>>>>> ee1d5f207 (GEOMESA-3215 Postgis - support List-type attributes)
>>>>>>> cf1d94c7a8 (GEOMESA-3215 Postgis - support List-type attributes)
=======
>>>>>>> d845d7c1bd (GEOMESA-3254 Add Bloop build support)
        val schema = Try(ds.getSchema(sft.getTypeName)).getOrElse(null)
        schema must not(beNull)
        schema.getUserData.asScala must containAllOf(sft.getUserData.asScala.toSeq)
        logger.info(s"Schema: ${SimpleFeatureTypes.encodeType(schema)}")
<<<<<<< HEAD
<<<<<<< HEAD
<<<<<<< HEAD
>>>>>>> ee1d5f2071 (GEOMESA-3215 Postgis - support List-type attributes)
=======
=======
>>>>>>> cf1d94c7a8 (GEOMESA-3215 Postgis - support List-type attributes)
=======
        val userData = Try(ds.getSchema(sft.getTypeName)).map(_.getUserData.asScala).getOrElse(null)
        userData must not(beNull)
        userData must containAllOf(sft.getUserData.asScala.toSeq)
>>>>>>> f639b39b8 (GEOMESA-3208 Postgis - Fix camel-case feature type names)
<<<<<<< HEAD
>>>>>>> 203dda21b9 (GEOMESA-3208 Postgis - Fix camel-case feature type names)
=======
=======
>>>>>>> ee1d5f207 (GEOMESA-3215 Postgis - support List-type attributes)
>>>>>>> cf1d94c7a8 (GEOMESA-3215 Postgis - support List-type attributes)
=======
>>>>>>> d845d7c1bd (GEOMESA-3254 Add Bloop build support)

          // write some data
          WithClose(new DefaultTransaction()) { tx =>
            WithClose(ds.getFeatureWriterAppend(sft.getTypeName, tx)) { writer =>
<<<<<<< HEAD
              features.foreach { feature =>
                FeatureUtils.write(writer, feature, useProvidedFid = true)
=======
              (1 to 10).foreach { i =>
                val next = writer.next()
                next.setAttribute("name", Collections.singletonList(s"name$i"))
                next.setAttribute("age", i)
                next.setAttribute("props", s"""["name$i"]""")
                next.setAttribute("dtg", new java.util.Date(now - (i * 20 * 60 * 1000))) // 20 minutes
                next.setAttribute("geom", WKTUtils.read(s"POINT(0 $i)"))
                next.getUserData.put(Hints.USE_PROVIDED_FID, java.lang.Boolean.TRUE)
                next.getIdentifier.asInstanceOf[FeatureIdImpl].setID(s"fid$i")
                writer.write()
>>>>>>> ee1d5f2071 (GEOMESA-3215 Postgis - support List-type attributes)
              }
            }
            tx.commit()
          }

<<<<<<< HEAD
          WithClose(ds.getFeatureReader(new Query(sft.getTypeName), Transaction.AUTO_COMMIT)) { reader =>
            val result = SelfClosingIterator(reader).toList
            result.map(compFromDb) must containTheSameElementsAs(features.map(compWithFid(_, sft)))
          }

          // verify data is being partitioned as expected
          WithClose(ds.asInstanceOf[JDBCDataStore].getConnection(Transaction.AUTO_COMMIT)) { cx =>
            val typeInfo = TypeInfo(this.schema, sft)
            // initially everything is in the write ahead log
            foreach(Seq(typeInfo.tables.view, typeInfo.tables.writeAhead))(table => count(cx, table) mustEqual 10)
            foreach(Seq(typeInfo.tables.writeAheadPartitions, typeInfo.tables.mainPartitions))(table => count(cx, table) mustEqual 0)
            // manually invoke the scheduled crons so we don't have to wait
            WithClose(cx.prepareCall(s"call ${RollWriteAheadLog.name(typeInfo).quoted}();"))(_.execute())
            WithClose(cx.prepareCall(s"call ${PartitionMaintenance.name(typeInfo).quoted}();"))(_.execute())
            // verify that data was sorted into the appropriate tables based on dtg
            count(cx, typeInfo.tables.view) mustEqual 10
            count(cx, typeInfo.tables.writeAhead) mustEqual 0
            count(cx, typeInfo.tables.writeAheadPartitions) must beGreaterThan(0)
            count(cx, typeInfo.tables.mainPartitions) must beGreaterThan(0)
          }

          // ensure we still get same results after running partitioning
          WithClose(ds.getFeatureReader(new Query(sft.getTypeName), Transaction.AUTO_COMMIT)) { reader =>
            val result = SelfClosingIterator(reader).toList
            result.map(compFromDb) must containTheSameElementsAs(features.map(compWithFid(_, sft)))
          }

          features.foreach { feature =>
            WithClose(ds.getFeatureWriter(sft.getTypeName, ECQL.toFilter(s"IN('${feature.getID}')"), Transaction.AUTO_COMMIT)) { writer =>
              writer.hasNext must beTrue
              writer.next()
              writer.remove()
=======
        if (methods.update) {
          (1 to 10).foreach { i =>
            WithClose(ds.getFeatureWriter(sft.getTypeName, ECQL.toFilter(s"IN('fid$i')"), Transaction.AUTO_COMMIT)) { writer =>
              if (writer.hasNext) {
                val next = writer.next()
                next.setAttribute("name", java.util.Arrays.asList(s"name$i", s"name$i-update"))
                next.setAttribute("props", s"""["name$i-update"]""")
                next.setAttribute("dtg", new java.util.Date(now - (i * 5 * 60 * 1000)))
                writer.write()
              } else {
                logger.warn(s"No entry found for update fid$i")
              }
>>>>>>> 58d14a257e (GEOMESA-3254 Add Bloop build support)
            }
          }

<<<<<<< HEAD
          WithClose(ds.getFeatureReader(new Query(sft.getTypeName), Transaction.AUTO_COMMIT)) { reader =>
            reader.hasNext must beFalse
=======
        if (methods.query) {
          WithClose(ds.getFeatureReader(new Query(sft.getTypeName), Transaction.AUTO_COMMIT)) { reader =>
            while (reader.hasNext) {
<<<<<<< HEAD
<<<<<<< HEAD
<<<<<<< HEAD
              logger.info(reader.next.toString)
=======
<<<<<<< HEAD
              logger.info(DataUtilities.encodeFeature(reader.next))
=======
              logger.info(reader.next.toString)
>>>>>>> ee1d5f207 (GEOMESA-3215 Postgis - support List-type attributes)
>>>>>>> cf1d94c7a8 (GEOMESA-3215 Postgis - support List-type attributes)
=======
              logger.info(DataUtilities.encodeFeature(reader.next))
>>>>>>> d845d7c1bd (GEOMESA-3254 Add Bloop build support)
=======
              logger.info(DataUtilities.encodeFeature(reader.next))
>>>>>>> 58d14a257e (GEOMESA-3254 Add Bloop build support)
            }
          }
        }

        if (methods.delete) {
          (1 to 10).foreach { i =>
            WithClose(ds.getFeatureWriter(sft.getTypeName, ECQL.toFilter(s"IN('fid$i')"), Transaction.AUTO_COMMIT)) { writer =>
              if (writer.hasNext) {
                writer.next()
                writer.remove()
              } else {
                logger.warn(s"No entry found for delete fid$i")
              }
            }
>>>>>>> ee1d5f2071 (GEOMESA-3215 Postgis - support List-type attributes)
          }
        }
      } catch {
        case NonFatal(e) => logger.error("", e); ko
      } finally {
        ds.dispose()
      }
      ok
    }

    "age-off" in {
      val ds = DataStoreFinder.getDataStore(params.asJava)
      ds must not(beNull)

      try {
        ds must beAnInstanceOf[JDBCDataStore]

        foreach(Seq("age-off", "ageoff")) { name =>
          val sft = SimpleFeatureTypes.renameSft(this.sft, name)
          sft.getUserData.put("pg.partitions.max", "2")

          ds.getTypeNames.toSeq must not(contain(sft.getTypeName))
          ds.createSchema(sft)

          val schema = Try(ds.getSchema(sft.getTypeName)).getOrElse(null)
          schema must not(beNull)
          schema.getUserData.asScala must containAllOf(sft.getUserData.asScala.toSeq)
          logger.debug(s"Schema: ${SimpleFeatureTypes.encodeType(schema)}")

          // write some data
          WithClose(new DefaultTransaction()) { tx =>
            WithClose(ds.getFeatureWriterAppend(sft.getTypeName, tx)) { writer =>
              features.foreach { feature =>
                FeatureUtils.write(writer, feature, useProvidedFid = true)
              }
            }
            tx.commit()
          }

          // verify data is being partitioned as expected
          WithClose(ds.asInstanceOf[JDBCDataStore].getConnection(Transaction.AUTO_COMMIT)) { cx =>
            val typeInfo = TypeInfo(this.schema, sft)
            // initially everything is in the write ahead log
            foreach(Seq(typeInfo.tables.view, typeInfo.tables.writeAhead))(table => count(cx, table) mustEqual 10)
            foreach(Seq(typeInfo.tables.writeAheadPartitions, typeInfo.tables.mainPartitions)) { table =>
              count(cx, table) mustEqual 0
            }
            // manually invoke the scheduled crons so we don't have to wait
            WithClose(cx.prepareCall(s"call ${RollWriteAheadLog.name(typeInfo).quoted}();"))(_.execute())
            WithClose(cx.prepareCall(s"call ${PartitionMaintenance.name(typeInfo).quoted}();"))(_.execute())
            // verify that data was aged off appropriately - exact age-off depends on time test was run
            count(cx, typeInfo.tables.view) must beOneOf(6, 7, 8)
          }
        }
      } finally {
        ds.dispose()
      }
    }

    "re-create functions" in {
      val ds = DataStoreFinder.getDataStore(params.asJava)
      ds must not(beNull)

      try {
        ds must beAnInstanceOf[JDBCDataStore]

        foreach(Seq("re-create", "recreate")) { name =>
          val sft = SimpleFeatureTypes.renameSft(this.sft, name)

          ds.getTypeNames.toSeq must not(contain(sft.getTypeName))
          ds.createSchema(sft)

          val schema = Try(ds.getSchema(sft.getTypeName)).getOrElse(null)
          schema must not(beNull)
          schema.getUserData.asScala must containAllOf(sft.getUserData.asScala.toSeq)
          logger.debug(s"Schema: ${SimpleFeatureTypes.encodeType(schema)}")

          // write some data
          WithClose(new DefaultTransaction()) { tx =>
            WithClose(ds.getFeatureWriterAppend(sft.getTypeName, tx)) { writer =>
              features.foreach { feature =>
                FeatureUtils.write(writer, feature, useProvidedFid = true)
              }
            }
            tx.commit()
          }

          // verify data comes back
          WithClose(ds.getFeatureReader(new Query(sft.getTypeName), Transaction.AUTO_COMMIT)) { reader =>
            val result = SelfClosingIterator(reader).toList
            result.map(compFromDb) must containTheSameElementsAs(features.map(compWithFid(_, sft)))
          }

          val typeInfo = TypeInfo(this.schema, sft)

          // replace the age-off function so that we can verify it gets updated later
          val oldAgeOff = DropAgedOffPartitions.name(typeInfo)
          val body =
            s"""    BEGIN
               |      SELECT value::int FROM ${typeInfo.schema.quoted}.${UserDataTable.Name.quoted};
               |    END;""".stripMargin
          val sql =
            s"""CREATE OR REPLACE PROCEDURE ${oldAgeOff.quoted}(cur_time timestamp without time zone) LANGUAGE plpgsql AS
               |  $$BODY$$
               |$body
               |  $$BODY$$;
               |""".stripMargin

          WithClose(ds.asInstanceOf[JDBCDataStore].getConnection(Transaction.AUTO_COMMIT)) { cx =>
            WithClose(cx.prepareStatement(sql))(_.executeUpdate())
            WithClose(cx.prepareStatement(s"SELECT prosrc FROM pg_proc WHERE proname = ${oldAgeOff.asLiteral};")) { st =>
              WithClose(st.executeQuery()) { rs =>
                rs.next() must beTrue
                rs.getString(1).trim mustEqual body.trim
              }
            }
            // now drop the main view
            WithClose(cx.prepareStatement(s"""DROP VIEW "${sft.getTypeName}""""))(_.executeUpdate())
          }

          // verify the feature type no longer returns
          ds.getTypeNames
          ds.getTypeNames.toSeq must not(contain(sft.getTypeName))
          // re-create the schema, adding some extra user data
          sft.getUserData.put("pg.partitions.max", "2")
          // we have to get a new data store so that it doesn't use the cached entry...
          WithClose(DataStoreFinder.getDataStore(params.asJava)) { ds =>
            ds.createSchema(sft)
            val schema = Try(ds.getSchema(sft.getTypeName)).getOrElse(null)
            schema must not(beNull)
            schema.getUserData.asScala must containAllOf(sft.getUserData.asScala.toSeq)

            // verify data still comes back
            WithClose(ds.getFeatureReader(new Query(sft.getTypeName), Transaction.AUTO_COMMIT)) { reader =>
              val result = SelfClosingIterator(reader).toList
              result.map(compFromDb) must containTheSameElementsAs(features.map(compWithFid(_, sft)))
            }
          }

          // verify that the age-off function was re-created
          WithClose(ds.asInstanceOf[JDBCDataStore].getConnection(Transaction.AUTO_COMMIT)) { cx =>
            WithClose(cx.prepareStatement(s"SELECT prosrc FROM pg_proc WHERE proname = ${oldAgeOff.asLiteral};")) { st =>
              WithClose(st.executeQuery()) { rs =>
                rs.next() must beTrue
                rs.getString(1).trim must not(beEqualTo(body.trim))
              }
            }
          }
        }
      } finally {
        ds.dispose()
      }
    }

    "drop all associated tables on removeSchema" in {
      val ds = DataStoreFinder.getDataStore(params.asJava)
      ds must not(beNull)

      try {
        ds must beAnInstanceOf[JDBCDataStore]

        foreach(Seq("dropme-test", "dropmetest")) { name =>
          val sft = SimpleFeatureTypes.renameSft(this.sft, name)

          ds.getTypeNames.toSeq must not(contain(sft.getTypeName))
          ds.createSchema(sft)

          val schema = Try(ds.getSchema(sft.getTypeName)).getOrElse(null)
          schema must not(beNull)
          schema.getUserData.asScala must containAllOf(sft.getUserData.asScala.toSeq)
          logger.debug(s"Schema: ${SimpleFeatureTypes.encodeType(schema)}")

          // write some data
          WithClose(new DefaultTransaction()) { tx =>
            WithClose(ds.getFeatureWriterAppend(sft.getTypeName, tx)) { writer =>
              features.foreach { feature =>
                FeatureUtils.write(writer, feature, useProvidedFid = true)
              }
            }
            tx.commit()
          }

          // get all the tables associated with the schema
          def getTablesAndIndices: Seq[String] = {
            val tables = ArrayBuffer.empty[String]
            WithClose(ds.asInstanceOf[JDBCDataStore].getConnection(Transaction.AUTO_COMMIT)) { cx =>
              WithClose(cx.getMetaData.getTables(null, null, "dropme%", null)) { rs =>
                while (rs.next()) {
                  tables += rs.getString(3)
                }
              }
            }
            tables.toSeq
          }

          // get all the procedures and functions associated with the schema
          def getFunctions: Seq[String] = {
            val fns = ArrayBuffer.empty[String]
            WithClose(ds.asInstanceOf[JDBCDataStore].getConnection(Transaction.AUTO_COMMIT)) { cx =>
              WithClose(cx.getMetaData.getProcedures(null, null, "%dropme%")) { rs =>
                while (rs.next()) {
                  fns += rs.getString(3)
                }
              }
              WithClose(cx.getMetaData.getFunctions(null, null, "%dropme%")) { rs =>
                while (rs.next()) {
                  fns += rs.getString(3)
                }
              }
            }
            fns.toSeq
          }

          // get all the user data and other associated metadata
          def getMeta: Seq[String] = {
            val meta = ArrayBuffer.empty[String]
            WithClose(ds.asInstanceOf[JDBCDataStore].getConnection(Transaction.AUTO_COMMIT)) { cx =>
              Seq(
                (UserDataTable.Name, "type_name", "key"),
                (SequenceTable.Name, "type_name", "value"),
                (PrimaryKeyTable.Name, "table_name", "pk_column"),
                (PartitionTablespacesTable.Name, "type_name", "table_type")
              ).foreach { case (table, where, select) =>
                WithClose(cx.prepareStatement(s"SELECT $select FROM ${table.quoted} WHERE $where like 'dropme%';")) { st =>
                  WithClose(st.executeQuery()) { rs =>
                    while (rs.next()) {
                      meta += rs.getString(1)
                    }
                  }
                }
              }
            }
            meta.toSeq
          }

          // _wa, _wa_partition, _partition, _spill tables + dtg, pk, geom indices for each
          // _analyze_queue, _sort_queue, _wa_000, main view
          getTablesAndIndices must haveLength(20)
          // delete/insert/update/wa triggers
          // analyze_partitions, compact, drop_age_off, merge_wa, part_maintenance, part_wa, roll_wa,
          getFunctions must haveLength(11)
          // 3 tablespaces, 4 user data, 1 seq count, 1 primary key
          getMeta must haveLength(9)

          ds.removeSchema(sft.getTypeName)

          getTablesAndIndices must beEmpty
          getFunctions must beEmpty
          getMeta must beEmpty
        }
      } finally {
        ds.dispose()
      }
    }

    "remove whole-world filters" in {
      val ds = DataStoreFinder.getDataStore(params.asJava)
      ds must not(beNull)

      try {
        ds must beAnInstanceOf[JDBCDataStore]

        val wholeWorldFilters = {
          import FilterHelper.ff
          import org.locationtech.geomesa.utils.geotools.CRS_EPSG_4326
          // note: can't use ECQL.toFilter as it tries to load jai and dies
          val geom = ff.property("geom")
          val bbox = ff.bbox(geom, -180, -90, 180, 90, CRS.toSRS(CRS_EPSG_4326))
          val intersects =
            ff.intersects(geom, ff.literal(WKTUtils.read("POLYGON((-190 -100, 190 -100, 190 100, -190 100, -190 -100))")))
          Seq(bbox, intersects)
        }

        foreach(Seq(true, false)) { ignoreFilters =>
          val sft = SimpleFeatureTypes.renameSft(this.sft, s"ignore_$ignoreFilters")
          sft.getUserData.put(PartitionedPostgisDialect.Config.FilterWholeWorld, s"$ignoreFilters")

          ds.getTypeNames.toSeq must not(contain(sft.getTypeName))
          ds.createSchema(sft)

          val schema = Try(ds.getSchema(sft.getTypeName)).getOrElse(null)
          schema must not(beNull)
          schema.getUserData.asScala must containAllOf(sft.getUserData.asScala.toSeq)
          logger.debug(s"Schema: ${SimpleFeatureTypes.encodeType(schema)}")

          // write some data
          WithClose(new DefaultTransaction()) { tx =>
            WithClose(ds.getFeatureWriterAppend(sft.getTypeName, tx)) { writer =>
              features.foreach { feature =>
                FeatureUtils.write(writer, feature, useProvidedFid = true)
              }
            }
            tx.commit()
          }

          foreach(wholeWorldFilters) { filter =>
            val Array(left, right) = ds.asInstanceOf[JDBCDataStore].getSQLDialect.splitFilter(filter, schema)
            if (ignoreFilters) {
              left mustEqual Filter.INCLUDE
            } else {
              left mustEqual filter
            }
            right mustEqual Filter.INCLUDE

            // track the messages logged by the JDBC store to verify the filter being run
            val messages = new CopyOnWriteArrayList[(String, String)]()
            val threadId = Thread.currentThread().getId
            val handler = new Handler() {
              override def publish(record: LogRecord): Unit =
                if (record.getThreadID == threadId) { messages.add((record.getSourceMethodName, record.getMessage)) }
              override def flush(): Unit = {}
              override def close(): Unit = {}
            }
            val logger = ds.asInstanceOf[JDBCDataStore].getLogger
            logger.setLevel(Level.FINE)
            logger.addHandler(handler)
            WithClose(ds.getFeatureReader(new Query(sft.getTypeName, filter), Transaction.AUTO_COMMIT)) { reader =>
              val result = SelfClosingIterator(reader).toList
              result.map(compFromDb) must containTheSameElementsAs(features.map(compWithFid(_, sft)))
            }

            val selects = messages.asScala.collect { case ("selectSQLPS", v) => v }
            selects must haveLength(1)
            if (ignoreFilters) {
              selects.head.toLowerCase(Locale.US) must not(contain("where"))
            } else {
              selects.head.toLowerCase(Locale.US) must contain("where")
            }
          }
        }
      } finally {
        ds.dispose()
      }
    }

    "default to using prepared statements" in {
      foreach(Seq(params, params + ("preparedStatements" -> "true"), params - "preparedStatements")) { params =>
        val ds = DataStoreFinder.getDataStore(params.asJava)
        ds must not(beNull)
        try {
          ds must beAnInstanceOf[JDBCDataStore]
          ds.asInstanceOf[JDBCDataStore].getSQLDialect must beAnInstanceOf[PartitionedPostgisPsDialect]
        } finally {
          ds.dispose()
        }
      }
      foreach(Seq(params + ("preparedStatements" -> "false"))) { params =>
        val ds = DataStoreFinder.getDataStore(params.asJava)
        ds must not(beNull)
        try {
          ds must beAnInstanceOf[JDBCDataStore]
          ds.asInstanceOf[JDBCDataStore].getSQLDialect must beAnInstanceOf[PartitionedPostgisDialect] // not partitioned
        } finally {
          ds.dispose()
        }
      }
    }

    "set appropriate user data for list and json attributes" in {
      val ds = DataStoreFinder.getDataStore(params.asJava)
      ds must not(beNull)

      try {
        ds must beAnInstanceOf[JDBCDataStore]

        val sft = SimpleFeatureTypes.renameSft(this.sft, "attrtest")
        ds.getTypeNames.toSeq must not(contain(sft.getTypeName))
        ds.createSchema(sft)

        val schema = Try(ds.getSchema(sft.getTypeName)).getOrElse(null)
        schema must not(beNull)
        schema.getUserData.asScala must containAllOf(sft.getUserData.asScala.toSeq)
        logger.debug(s"Schema: ${SimpleFeatureTypes.encodeType(schema)}")

        ObjectType.selectType(schema.getDescriptor("name")) mustEqual Seq(ObjectType.LIST, ObjectType.STRING)
        ObjectType.selectType(schema.getDescriptor("props")) mustEqual Seq(ObjectType.STRING, ObjectType.JSON)
        ObjectType.selectType(schema.getDescriptor("dtg")) mustEqual Seq(ObjectType.DATE)
        ObjectType.selectType(schema.getDescriptor("geom")) mustEqual Seq(ObjectType.GEOMETRY, ObjectType.POINT)
      } finally {
        ds.dispose()
      }
    }

    "support idle_in_transaction_session_timeout" in {
      val sft = SimpleFeatureTypes.renameSft(this.sft, "timeout")

      val ds = DataStoreFinder.getDataStore((params ++ Map("idle_in_transaction_session_timeout" -> "100ms", "fetch size" -> 1)).asJava)
      ds must not(beNull)

      try {
        ds must beAnInstanceOf[JDBCDataStore]

        ds.getTypeNames.toSeq must not(contain(sft.getTypeName))
        ds.createSchema(sft)

        val schema = Try(ds.getSchema(sft.getTypeName)).getOrElse(null)
        schema must not(beNull)
        schema.getUserData.asScala must containAllOf(sft.getUserData.asScala.toSeq)
        logger.debug(s"Schema: ${SimpleFeatureTypes.encodeType(schema)}")

        // write some data
        WithClose(new DefaultTransaction()) { tx =>
          WithClose(ds.getFeatureWriterAppend(sft.getTypeName, tx)) { writer =>
            features.foreach { feature =>
              FeatureUtils.write(writer, feature, useProvidedFid = true)
            }
          }
          tx.commit()
        }

        // verify that statements will timeout and return an error
        WithClose(ds.getFeatureReader(new Query(sft.getTypeName), Transaction.AUTO_COMMIT)) { reader =>
          reader.hasNext must beTrue
          reader.next must not(beNull)
          Thread.sleep(120)
          reader.hasNext must throwAn[Exception]
        }
      } finally {
        ds.dispose()
      }
    }
  }

<<<<<<< HEAD
  def compFromDb(sf: SimpleFeature): Seq[Any] = {
    Seq(sf.getID) ++ sf.getAttributes.asScala.map {
        // even though Timestamp extends Date, equals comparison doesn't work between the 2
        case t: java.sql.Timestamp => new java.util.Date(t.getTime)
        case a => a
      }
  }

  // note: jdbc data store adds the type name into the fid, so we add it here for the comparison
  def compWithFid(sf: SimpleFeature, sft: SimpleFeatureType): Seq[Any] =
    Seq(s"${sft.getTypeName}.${sf.getID}") ++ sf.getAttributes.asScala

  def count(cx: Connection, table: TableConfig): Int = {
    WithClose(cx.prepareStatement(s"select count(*) from ${table.name.qualified};")) { statement =>
      WithClose(statement.executeQuery()) { rs =>
        rs.next() must beTrue
        rs.getInt(1)
      }
    }
  }
=======
  case class Methods(
      create: Boolean,
<<<<<<< HEAD
<<<<<<< HEAD
<<<<<<< HEAD
      recreate: Boolean,
=======
<<<<<<< HEAD
      upgrade: Boolean,
=======
      recreate: Boolean,
>>>>>>> ee1d5f207 (GEOMESA-3215 Postgis - support List-type attributes)
>>>>>>> cf1d94c7a8 (GEOMESA-3215 Postgis - support List-type attributes)
=======
      upgrade: Boolean,
>>>>>>> d845d7c1bd (GEOMESA-3254 Add Bloop build support)
=======
      upgrade: Boolean,
>>>>>>> 58d14a257e (GEOMESA-3254 Add Bloop build support)
      write: Boolean,
      update: Boolean,
      query: Boolean,
      delete: Boolean,
      remove: Boolean
<<<<<<< HEAD
<<<<<<< HEAD
<<<<<<< HEAD
    )
>>>>>>> ee1d5f2071 (GEOMESA-3215 Postgis - support List-type attributes)
=======
<<<<<<< HEAD
    ) {
    def any: Boolean = create || upgrade || write || update || query || delete || remove
  }
=======
    )
>>>>>>> ee1d5f207 (GEOMESA-3215 Postgis - support List-type attributes)
>>>>>>> cf1d94c7a8 (GEOMESA-3215 Postgis - support List-type attributes)
=======
    ) {
    def any: Boolean = create || upgrade || write || update || query || delete || remove
  }
>>>>>>> d845d7c1bd (GEOMESA-3254 Add Bloop build support)
=======
    ) {
    def any: Boolean = create || upgrade || write || update || query || delete || remove
  }
>>>>>>> 58d14a257e (GEOMESA-3254 Add Bloop build support)
}
