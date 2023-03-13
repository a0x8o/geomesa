/***********************************************************************
 * Copyright (c) 2013-2023 Commonwealth Computer Research, Inc.
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Apache License, Version 2.0
 * which accompanies this distribution and is available at
 * http://www.opensource.org/licenses/apache2.0.php.
 ***********************************************************************/

package org.locationtech.geomesa.gt.partition.postgis

import org.geotools.data.postgis.{PostGISDialect, PostGISPSDialect, PostgisNGDataStoreFactory}
import org.geotools.jdbc.{JDBCDataStore, SQLDialect}
<<<<<<< HEAD
<<<<<<< HEAD
<<<<<<< HEAD
<<<<<<< HEAD
<<<<<<< HEAD
<<<<<<< HEAD
=======
>>>>>>> 91b820951 (GEOMESA-3212 Postgis - convert constant functions to literals for SQL translation (#2875))
=======
>>>>>>> 47f8de1bb (GEOMESA-3215 Postgis - support List-type attributes)
=======
=======
>>>>>>> 5e000da48 (GEOMESA-3212 Postgis - convert constant functions to literals for SQL translation (#2875))
>>>>>>> e694961e05 (GEOMESA-3212 Postgis - convert constant functions to literals for SQL translation (#2875))
=======
=======
>>>>>>> 5e000da48 (GEOMESA-3212 Postgis - convert constant functions to literals for SQL translation (#2875))
=======
>>>>>>> cf1d94c7a (GEOMESA-3215 Postgis - support List-type attributes)
>>>>>>> 3a1e1d7213 (GEOMESA-3215 Postgis - support List-type attributes)
import org.locationtech.geomesa.gt.partition.postgis.dialect.{PartitionedPostgisDialect, PartitionedPostgisPsDialect}
=======
import org.locationtech.geomesa.gt.partition.postgis.dialect.PartitionedPostgisDialect
import org.opengis.feature.simple.SimpleFeatureType
import org.opengis.filter.Filter

import java.sql.{Connection, DatabaseMetaData}
>>>>>>> dcd872c1a (GEOMESA-3212 Postgis - convert constant functions to literals for SQL translation (#2875))
<<<<<<< HEAD
<<<<<<< HEAD
<<<<<<< HEAD
<<<<<<< HEAD
=======
>>>>>>> e694961e05 (GEOMESA-3212 Postgis - convert constant functions to literals for SQL translation (#2875))
=======
>>>>>>> 3a1e1d7213 (GEOMESA-3215 Postgis - support List-type attributes)
=======
import org.locationtech.geomesa.gt.partition.postgis.dialect.{PartitionedPostgisDialect, PartitionedPostgisPsDialect}
>>>>>>> ee1d5f207 (GEOMESA-3215 Postgis - support List-type attributes)
=======
<<<<<<< HEAD
>>>>>>> 91b820951 (GEOMESA-3212 Postgis - convert constant functions to literals for SQL translation (#2875))
=======
=======
import org.locationtech.geomesa.gt.partition.postgis.dialect.{PartitionedPostgisDialect, PartitionedPostgisPsDialect}
>>>>>>> ee1d5f207 (GEOMESA-3215 Postgis - support List-type attributes)
>>>>>>> 47f8de1bb (GEOMESA-3215 Postgis - support List-type attributes)
=======
>>>>>>> 5e000da48 (GEOMESA-3212 Postgis - convert constant functions to literals for SQL translation (#2875))
<<<<<<< HEAD
>>>>>>> e694961e05 (GEOMESA-3212 Postgis - convert constant functions to literals for SQL translation (#2875))
=======
=======
=======
import org.locationtech.geomesa.gt.partition.postgis.dialect.{PartitionedPostgisDialect, PartitionedPostgisPsDialect}
>>>>>>> ee1d5f207 (GEOMESA-3215 Postgis - support List-type attributes)
>>>>>>> cf1d94c7a (GEOMESA-3215 Postgis - support List-type attributes)
>>>>>>> 3a1e1d7213 (GEOMESA-3215 Postgis - support List-type attributes)

class PartitionedPostgisDataStoreFactory extends PostgisNGDataStoreFactory {

  import PartitionedPostgisDataStoreParams.DbType

  override def getDisplayName: String = "PostGIS (partitioned)"

  override def getDescription: String = "PostGIS Database with time-partitioned tables"

  override protected def getDatabaseID: String = DbType.sample.asInstanceOf[String]

  override protected def setupParameters(parameters: java.util.Map[String, AnyRef]): Unit = {
    super.setupParameters(parameters)
    // override postgis dbkey
    parameters.put(DbType.key, DbType)
  }

  override protected def createDataStoreInternal(store: JDBCDataStore, params: java.util.Map[String, _]): JDBCDataStore = {

    val ds = super.createDataStoreInternal(store, params)
    val dialect = new PartitionedPostgisDialect(ds)

    ds.getSQLDialect match {
      case d: PostGISDialect =>
        dialect.setEncodeBBOXFilterAsEnvelope(d.isEncodeBBOXFilterAsEnvelope)
        dialect.setEstimatedExtentsEnabled(d.isEstimatedExtentsEnabled)
        dialect.setFunctionEncodingEnabled(d.isFunctionEncodingEnabled)
        dialect.setLooseBBOXEnabled(d.isLooseBBOXEnabled)
        dialect.setSimplifyEnabled(d.isSimplifyEnabled)
        ds.setSQLDialect(dialect)

      case d: PostGISPSDialect =>
        dialect.setEncodeBBOXFilterAsEnvelope(d.isEncodeBBOXFilterAsEnvelope)
        dialect.setFunctionEncodingEnabled(d.isFunctionEncodingEnabled)
        dialect.setLooseBBOXEnabled(d.isLooseBBOXEnabled)

        // these configs aren't exposed through the PS dialect so re-calculate them from the params
        val est = PostgisNGDataStoreFactory.ESTIMATED_EXTENTS.lookUp(params)
        dialect.setEstimatedExtentsEnabled(est == null || est == java.lang.Boolean.TRUE)
        val simplify = PostgisNGDataStoreFactory.SIMPLIFY.lookUp(params)
        dialect.setSimplifyEnabled(simplify == null || simplify == java.lang.Boolean.TRUE)

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
>>>>>>> 47f8de1bb (GEOMESA-3215 Postgis - support List-type attributes)
=======
>>>>>>> e8cc4971c6 (Merge branch 'feature/postgis-fixes')
=======
>>>>>>> e694961e05 (GEOMESA-3212 Postgis - convert constant functions to literals for SQL translation (#2875))
=======
=======
>>>>>>> cf1d94c7a (GEOMESA-3215 Postgis - support List-type attributes)
>>>>>>> 3a1e1d7213 (GEOMESA-3215 Postgis - support List-type attributes)
=======
=======
>>>>>>> cf1d94c7a (GEOMESA-3215 Postgis - support List-type attributes)
=======
>>>>>>> db8d998aa (Merge branch 'feature/postgis-fixes')
>>>>>>> cb6bda89b6 (Merge branch 'feature/postgis-fixes')
        ds.setSQLDialect(new PartitionedPostgisPsDialect(ds, dialect))
=======
=======
>>>>>>> ee1d5f207 (GEOMESA-3215 Postgis - support List-type attributes)
<<<<<<< HEAD
<<<<<<< HEAD
<<<<<<< HEAD
=======
        ds.setSQLDialect(new PartitionedPostgisPsDialect(ds, dialect))
=======
>>>>>>> 91b820951 (GEOMESA-3212 Postgis - convert constant functions to literals for SQL translation (#2875))
=======
>>>>>>> 47f8de1bb (GEOMESA-3215 Postgis - support List-type attributes)
=======
=======
>>>>>>> 3a1e1d7213 (GEOMESA-3215 Postgis - support List-type attributes)
=======
        ds.setSQLDialect(new PartitionedPostgisPsDialect(ds, dialect))
=======
>>>>>>> 5e000da48 (GEOMESA-3212 Postgis - convert constant functions to literals for SQL translation (#2875))
<<<<<<< HEAD
>>>>>>> e694961e05 (GEOMESA-3212 Postgis - convert constant functions to literals for SQL translation (#2875))
=======
=======
>>>>>>> cf1d94c7a (GEOMESA-3215 Postgis - support List-type attributes)
>>>>>>> 3a1e1d7213 (GEOMESA-3215 Postgis - support List-type attributes)
        ds.setSQLDialect(new PostGISPSDialect(ds, dialect) {
          // fix bug with PostGISPSDialect dialect not delegating these methods
          override def getDefaultVarcharSize: Int = dialect.getDefaultVarcharSize
          override def encodeTableName(raw: String, sql: StringBuffer): Unit = dialect.encodeTableName(raw, sql)
          override def postCreateFeatureType(
              featureType: SimpleFeatureType,
              metadata: DatabaseMetaData,
              schemaName: String,
              cx: Connection): Unit = {
            dialect.postCreateFeatureType(featureType, metadata, schemaName, cx)
          }
          override def splitFilter(filter: Filter, schema: SimpleFeatureType): Array[Filter] =
            dialect.splitFilter(filter, schema)
<<<<<<< HEAD
<<<<<<< HEAD
<<<<<<< HEAD
=======
>>>>>>> f31d66ef5 (GEOMESA-3212 Postgis - convert constant functions to literals for SQL translation (#2875))
=======
<<<<<<< HEAD
          override def getDesiredTablesType: Array[String] = dialect.getDesiredTablesType
=======
>>>>>>> dcd872c1a (GEOMESA-3212 Postgis - convert constant functions to literals for SQL translation (#2875))
>>>>>>> f9fc40305 (GEOMESA-3212 Postgis - convert constant functions to literals for SQL translation (#2875))
<<<<<<< HEAD
        })
<<<<<<< HEAD
>>>>>>> dcd872c1a (GEOMESA-3212 Postgis - convert constant functions to literals for SQL translation (#2875))
=======
=======
        ds.setSQLDialect(new PartitionedPostgisPsDialect(ds, dialect))
>>>>>>> c79be4f83 (GEOMESA-3215 Postgis - support List-type attributes)
>>>>>>> ee1d5f207 (GEOMESA-3215 Postgis - support List-type attributes)
<<<<<<< HEAD
<<<<<<< HEAD
=======
        ds.setSQLDialect(new PartitionedPostgisPsDialect(ds, dialect))
>>>>>>> 3be8d2a5a (Merge branch 'feature/postgis-fixes')
<<<<<<< HEAD
=======
=======
>>>>>>> f31d66ef5 (GEOMESA-3212 Postgis - convert constant functions to literals for SQL translation (#2875))
        })
<<<<<<< HEAD
>>>>>>> dcd872c1a (GEOMESA-3212 Postgis - convert constant functions to literals for SQL translation (#2875))
<<<<<<< HEAD
<<<<<<< HEAD
>>>>>>> 91b820951 (GEOMESA-3212 Postgis - convert constant functions to literals for SQL translation (#2875))
=======
>>>>>>> 47f8de1bb (GEOMESA-3215 Postgis - support List-type attributes)
=======
=======
        ds.setSQLDialect(new PartitionedPostgisPsDialect(ds, dialect))
>>>>>>> 3be8d2a5a (Merge branch 'feature/postgis-fixes')
>>>>>>> e8cc4971c6 (Merge branch 'feature/postgis-fixes')
=======
>>>>>>> 5e000da48 (GEOMESA-3212 Postgis - convert constant functions to literals for SQL translation (#2875))
>>>>>>> e694961e05 (GEOMESA-3212 Postgis - convert constant functions to literals for SQL translation (#2875))
=======
>>>>>>> 5e000da48 (GEOMESA-3212 Postgis - convert constant functions to literals for SQL translation (#2875))
=======
=======
=======
        ds.setSQLDialect(new PartitionedPostgisPsDialect(ds, dialect))
>>>>>>> c79be4f83 (GEOMESA-3215 Postgis - support List-type attributes)
>>>>>>> ee1d5f207 (GEOMESA-3215 Postgis - support List-type attributes)
>>>>>>> cf1d94c7a (GEOMESA-3215 Postgis - support List-type attributes)
<<<<<<< HEAD
>>>>>>> 3a1e1d7213 (GEOMESA-3215 Postgis - support List-type attributes)
=======
=======
>>>>>>> db8d998aa (Merge branch 'feature/postgis-fixes')
>>>>>>> cb6bda89b6 (Merge branch 'feature/postgis-fixes')

      case d => throw new IllegalArgumentException(s"Expected PostGISDialect but got: ${d.getClass.getName}")
    }
    ds
  }

  // these will get replaced in createDataStoreInternal, above
  override protected def createSQLDialect(dataStore: JDBCDataStore): SQLDialect = new PostGISDialect(dataStore)
  override protected def createSQLDialect(dataStore: JDBCDataStore, params: java.util.Map[String, _]): SQLDialect =
    new PostGISDialect(dataStore)
}
