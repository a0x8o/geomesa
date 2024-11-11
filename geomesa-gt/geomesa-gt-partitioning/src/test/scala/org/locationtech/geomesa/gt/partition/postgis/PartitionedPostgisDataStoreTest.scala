/***********************************************************************
 * Copyright (c) 2013-2024 Commonwealth Computer Research, Inc.
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Apache License, Version 2.0
 * which accompanies this distribution and is available at
 * http://www.opensource.org/licenses/apache2.0.php.
 ***********************************************************************/

package org.locationtech.geomesa.gt.partition.postgis

import com.typesafe.scalalogging.LazyLogging
<<<<<<< HEAD
<<<<<<< HEAD
<<<<<<< HEAD
<<<<<<< HEAD
=======
=======
=======
<<<<<<< HEAD
=======
>>>>>>> 2912d58b06 (GEOMESA-3215 Postgis - support List-type attributes)
import org.geotools.data._
>>>>>>> 05a1868e90 (GEOMESA-3246 Upgrade Arrow to 11.0.0)
<<<<<<< HEAD
import org.geotools.data._
>>>>>>> fa60953a42 (GEOMESA-3254 Add Bloop build support)
<<<<<<< HEAD
import org.geotools.data._
>>>>>>> afb207dc68 (GEOMESA-3215 Postgis - support List-type attributes)
<<<<<<< HEAD
<<<<<<< HEAD
<<<<<<< HEAD
<<<<<<< HEAD
<<<<<<< HEAD
<<<<<<< HEAD
=======
=======
=======
<<<<<<< HEAD
=======
>>>>>>> 36a7119501 (GEOMESA-3215 Postgis - support List-type attributes)
=======
>>>>>>> 9e49c1aac7 (GEOMESA-3254 Add Bloop build support)
=======
>>>>>>> 630900cfbb (GEOMESA-3246 Upgrade Arrow to 11.0.0)
import org.geotools.data._
<<<<<<< HEAD
>>>>>>> 05a1868e90 (GEOMESA-3246 Upgrade Arrow to 11.0.0)
<<<<<<< HEAD
import org.geotools.data._
>>>>>>> fa60953a42 (GEOMESA-3254 Add Bloop build support)
<<<<<<< HEAD
import org.geotools.data._
>>>>>>> afb207dc68 (GEOMESA-3215 Postgis - support List-type attributes)
<<<<<<< HEAD
<<<<<<< HEAD
<<<<<<< HEAD
<<<<<<< HEAD
<<<<<<< HEAD
<<<<<<< HEAD
=======
=======
=======
<<<<<<< HEAD
=======
>>>>>>> 2912d58b06 (GEOMESA-3215 Postgis - support List-type attributes)
=======
>>>>>>> 7564665969 (GEOMESA-3254 Add Bloop build support)
=======
>>>>>>> 6c49bcd685 (GEOMESA-3246 Upgrade Arrow to 11.0.0)
import org.geotools.data._
<<<<<<< HEAD
>>>>>>> 05a1868e90 (GEOMESA-3246 Upgrade Arrow to 11.0.0)
<<<<<<< HEAD
import org.geotools.data._
>>>>>>> fa60953a42 (GEOMESA-3254 Add Bloop build support)
<<<<<<< HEAD
import org.geotools.data._
>>>>>>> afb207dc68 (GEOMESA-3215 Postgis - support List-type attributes)
<<<<<<< HEAD
<<<<<<< HEAD
<<<<<<< HEAD
import org.geotools.api.data._
import org.geotools.api.feature.simple.{SimpleFeature, SimpleFeatureType}
import org.geotools.api.filter.Filter
<<<<<<< HEAD
import org.geotools.api.filter.MultiValuedFilter.MatchAction
=======
=======
<<<<<<< HEAD
>>>>>>> a8e0698bf72 (GEOMESA-3215 Postgis - support List-type attributes)
<<<<<<< HEAD
>>>>>>> 133f17e7484 (GEOMESA-3215 Postgis - support List-type attributes)
=======
=======
<<<<<<< HEAD
>>>>>>> 4a4bbd8ec03 (GEOMESA-3254 Add Bloop build support)
<<<<<<< HEAD
>>>>>>> 7e19dd4a99a (Merge branch 'a0x8o' into stag0)
=======
=======
<<<<<<< HEAD
>>>>>>> e289c9ae736 (GEOMESA-3246 Upgrade Arrow to 11.0.0)
>>>>>>> a9a183e257b (GEOMESA-3246 Upgrade Arrow to 11.0.0)
import org.geotools.data._
=======
>>>>>>> 7e990c0c62 (GEOMESA-3215 Postgis - support List-type attributes)
=======
>>>>>>> 6de7ca735b (GEOMESA-3215 Postgis - support List-type attributes)
<<<<<<< HEAD
import org.geotools.factory.CommonFactoryFinder
=======
<<<<<<< HEAD
>>>>>>> 62ad23f963c (GEOMESA-3215 Postgis - support List-type attributes)
import org.geotools.feature.simple.SimpleFeatureBuilder
=======
import org.geotools.data.postgis.PostGISPSDialect
<<<<<<< HEAD
<<<<<<< HEAD
<<<<<<< HEAD
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
>>>>>>> bf9e5cdd91 (GEOMESA-3215 Postgis - support List-type attributes)
=======
>>>>>>> f1532f2313 (GEOMESA-3254 Add Bloop build support)
=======
>>>>>>> a207fd51c3 (GEOMESA-3215 Postgis - support List-type attributes)
=======
>>>>>>> 7a84c9d22d (GEOMESA-3254 Add Bloop build support)
=======
>>>>>>> ec585da266 (GEOMESA-3215 Postgis - support List-type attributes)
import org.geotools.data.{DataStoreFinder, DefaultTransaction, Query, Transaction}
=======
<<<<<<< HEAD
=======
import org.geotools.data.{DataStoreFinder, DefaultTransaction, Query, Transaction}
>>>>>>> ee1d5f207 (GEOMESA-3215 Postgis - support List-type attributes)
>>>>>>> cf1d94c7a8 (GEOMESA-3215 Postgis - support List-type attributes)
<<<<<<< HEAD
<<<<<<< HEAD
<<<<<<< HEAD
<<<<<<< HEAD
=======
>>>>>>> d845d7c1bd (GEOMESA-3254 Add Bloop build support)
=======
import org.geotools.data._
import org.geotools.data.postgis.PostGISPSDialect
>>>>>>> 58d14a257e (GEOMESA-3254 Add Bloop build support)
=======
>>>>>>> bf9e5cdd91 (GEOMESA-3215 Postgis - support List-type attributes)
=======
=======
>>>>>>> d845d7c1bd (GEOMESA-3254 Add Bloop build support)
>>>>>>> f1532f2313 (GEOMESA-3254 Add Bloop build support)
=======
>>>>>>> a207fd51c3 (GEOMESA-3215 Postgis - support List-type attributes)
=======
=======
>>>>>>> d845d7c1bd (GEOMESA-3254 Add Bloop build support)
>>>>>>> 7a84c9d22d (GEOMESA-3254 Add Bloop build support)
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
import org.specs2.mutable.Specification
import org.specs2.runner.JUnitRunner
import org.specs2.specification.BeforeAfterAll
=======
import org.geotools.data._
<<<<<<< HEAD
<<<<<<< HEAD
import org.geotools.feature.simple.SimpleFeatureBuilder
=======
import org.geotools.data.postgis.PostGISPSDialect
<<<<<<< HEAD
=======
>>>>>>> 7542dc78d8 (GEOMESA-3215 Postgis - support List-type attributes)
=======
import org.geotools.data.{DataStoreFinder, DefaultTransaction, Query, Transaction}
>>>>>>> ee1d5f207 (GEOMESA-3215 Postgis - support List-type attributes)
import org.geotools.filter.identity.FeatureIdImpl
>>>>>>> cf1d94c7a (GEOMESA-3215 Postgis - support List-type attributes)
<<<<<<< HEAD
<<<<<<< HEAD
=======
>>>>>>> locationtech-main
=======
import org.geotools.data.postgis.PostGISPSDialect
<<<<<<< HEAD
<<<<<<< HEAD
=======
>>>>>>> 7e990c0c62 (GEOMESA-3215 Postgis - support List-type attributes)
import org.geotools.data.{DataStoreFinder, DefaultTransaction, Query, Transaction}
=======
<<<<<<< HEAD
=======
import org.geotools.data.{DataStoreFinder, DefaultTransaction, Query, Transaction}
>>>>>>> ee1d5f207 (GEOMESA-3215 Postgis - support List-type attributes)
>>>>>>> cf1d94c7a (GEOMESA-3215 Postgis - support List-type attributes)
=======
<<<<<<< HEAD
>>>>>>> d845d7c1b (GEOMESA-3254 Add Bloop build support)
=======
import org.geotools.data._
import org.geotools.data.postgis.PostGISPSDialect
>>>>>>> 58d14a257 (GEOMESA-3254 Add Bloop build support)
import org.geotools.filter.identity.FeatureIdImpl
>>>>>>> ee1d5f207 (GEOMESA-3215 Postgis - support List-type attributes)
>>>>>>> 47f8de1bb (GEOMESA-3215 Postgis - support List-type attributes)
>>>>>>> afb207dc68 (GEOMESA-3215 Postgis - support List-type attributes)
=======
>>>>>>> 7542dc78d8 (GEOMESA-3215 Postgis - support List-type attributes)
=======
import org.geotools.data.{DataStoreFinder, DefaultTransaction, Query, Transaction}
=======
>>>>>>> d845d7c1bd (GEOMESA-3254 Add Bloop build support)
=======
import org.geotools.data._
import org.geotools.data.postgis.PostGISPSDialect
>>>>>>> 58d14a257e (GEOMESA-3254 Add Bloop build support)
>>>>>>> 7564665969 (GEOMESA-3254 Add Bloop build support)
import org.geotools.filter.identity.FeatureIdImpl
>>>>>>> ee1d5f2071 (GEOMESA-3215 Postgis - support List-type attributes)
<<<<<<< HEAD
>>>>>>> 2912d58b06 (GEOMESA-3215 Postgis - support List-type attributes)
=======
=======
=======
import org.geotools.data.{DataStoreFinder, DefaultTransaction, Query, Transaction}
>>>>>>> ee1d5f207 (GEOMESA-3215 Postgis - support List-type attributes)
import org.geotools.filter.identity.FeatureIdImpl
>>>>>>> cf1d94c7a (GEOMESA-3215 Postgis - support List-type attributes)
>>>>>>> 7542dc78d8 (GEOMESA-3215 Postgis - support List-type attributes)
<<<<<<< HEAD
>>>>>>> 7e990c0c62 (GEOMESA-3215 Postgis - support List-type attributes)
=======
>>>>>>> ec585da266 (GEOMESA-3215 Postgis - support List-type attributes)
=======
import org.geotools.data.{DataStoreFinder, DefaultTransaction, Query, Transaction}
import org.geotools.filter.identity.FeatureIdImpl
>>>>>>> ee1d5f2071 (GEOMESA-3215 Postgis - support List-type attributes)
<<<<<<< HEAD
>>>>>>> 36a7119501 (GEOMESA-3215 Postgis - support List-type attributes)
=======
>>>>>>> 2912d58b06 (GEOMESA-3215 Postgis - support List-type attributes)
>>>>>>> ec585da266 (GEOMESA-3215 Postgis - support List-type attributes)
import org.geotools.filter.text.ecql.ECQL
import org.geotools.jdbc.JDBCDataStore
import org.geotools.referencing.CRS
import org.junit.runner.RunWith
import org.locationtech.geomesa.filter.FilterHelper
import org.locationtech.geomesa.gt.partition.postgis.dialect.procedures.{DropAgedOffPartitions, PartitionMaintenance, RollWriteAheadLog}
import org.locationtech.geomesa.gt.partition.postgis.dialect.tables.UserDataTable
import org.locationtech.geomesa.gt.partition.postgis.dialect.{PartitionedPostgisDialect, TableConfig, TypeInfo}
=======
import org.geotools.data._
<<<<<<< HEAD
<<<<<<< HEAD
<<<<<<< HEAD
<<<<<<< HEAD
<<<<<<< HEAD
=======
>>>>>>> 4b7c48b509 (GEOMESA-3215 Postgis - support List-type attributes)
=======
>>>>>>> 69a6e5986e (GEOMESA-3215 Postgis - support List-type attributes)
=======
>>>>>>> da609e20da (GEOMESA-3215 Postgis - support List-type attributes)
import org.geotools.feature.simple.SimpleFeatureBuilder
=======
import org.geotools.data.postgis.PostGISPSDialect
<<<<<<< HEAD
=======
import org.geotools.data.{DataStoreFinder, DefaultTransaction, Query, Transaction}
>>>>>>> ee1d5f207 (GEOMESA-3215 Postgis - support List-type attributes)
import org.geotools.filter.identity.FeatureIdImpl
>>>>>>> cf1d94c7a (GEOMESA-3215 Postgis - support List-type attributes)
<<<<<<< HEAD
<<<<<<< HEAD
=======
<<<<<<< HEAD
import org.geotools.feature.simple.SimpleFeatureBuilder
>>>>>>> 6c49bcd685 (GEOMESA-3246 Upgrade Arrow to 11.0.0)
=======
>>>>>>> 4b7c48b509 (GEOMESA-3215 Postgis - support List-type attributes)
=======
>>>>>>> locationtech-main
=======
import org.geotools.data.postgis.PostGISPSDialect
<<<<<<< HEAD
<<<<<<< HEAD
=======
>>>>>>> 6de7ca735b (GEOMESA-3215 Postgis - support List-type attributes)
import org.geotools.data.{DataStoreFinder, DefaultTransaction, Query, Transaction}
=======
<<<<<<< HEAD
=======
import org.geotools.data.{DataStoreFinder, DefaultTransaction, Query, Transaction}
>>>>>>> ee1d5f207 (GEOMESA-3215 Postgis - support List-type attributes)
>>>>>>> cf1d94c7a (GEOMESA-3215 Postgis - support List-type attributes)
=======
<<<<<<< HEAD
>>>>>>> d845d7c1b (GEOMESA-3254 Add Bloop build support)
=======
import org.geotools.data._
import org.geotools.data.postgis.PostGISPSDialect
>>>>>>> 58d14a257 (GEOMESA-3254 Add Bloop build support)
=======
>>>>>>> d845d7c1bd (GEOMESA-3254 Add Bloop build support)
=======
import org.geotools.data._
import org.geotools.data.postgis.PostGISPSDialect
>>>>>>> 58d14a257e (GEOMESA-3254 Add Bloop build support)
>>>>>>> 9e49c1aac7 (GEOMESA-3254 Add Bloop build support)
import org.geotools.filter.identity.FeatureIdImpl
<<<<<<< HEAD
>>>>>>> ee1d5f207 (GEOMESA-3215 Postgis - support List-type attributes)
>>>>>>> 47f8de1bb (GEOMESA-3215 Postgis - support List-type attributes)
>>>>>>> afb207dc68 (GEOMESA-3215 Postgis - support List-type attributes)
>>>>>>> 69a6e5986e (GEOMESA-3215 Postgis - support List-type attributes)
=======
>>>>>>> ee1d5f2071 (GEOMESA-3215 Postgis - support List-type attributes)
=======
=======
import org.geotools.data.{DataStoreFinder, DefaultTransaction, Query, Transaction}
>>>>>>> ee1d5f207 (GEOMESA-3215 Postgis - support List-type attributes)
import org.geotools.filter.identity.FeatureIdImpl
>>>>>>> cf1d94c7a (GEOMESA-3215 Postgis - support List-type attributes)
>>>>>>> 7542dc78d8 (GEOMESA-3215 Postgis - support List-type attributes)
>>>>>>> 6de7ca735b (GEOMESA-3215 Postgis - support List-type attributes)
import org.geotools.filter.text.ecql.ECQL
import org.geotools.jdbc.JDBCDataStore
import org.geotools.referencing.CRS
import org.junit.runner.RunWith
import org.locationtech.geomesa.filter.FilterHelper
import org.locationtech.geomesa.gt.partition.postgis.dialect.procedures.{DropAgedOffPartitions, PartitionMaintenance, RollWriteAheadLog}
import org.locationtech.geomesa.gt.partition.postgis.dialect.tables.UserDataTable
<<<<<<< HEAD
import org.locationtech.geomesa.gt.partition.postgis.dialect.{TableConfig, TypeInfo}
<<<<<<< HEAD
>>>>>>> a928f2f73 (GEOMESA-3246 Upgrade Arrow to 11.0.0)
=======
>>>>>>> a928f2f739 (GEOMESA-3246 Upgrade Arrow to 11.0.0)
<<<<<<< HEAD
>>>>>>> 6c49bcd685 (GEOMESA-3246 Upgrade Arrow to 11.0.0)
=======
=======
import org.locationtech.geomesa.gt.partition.postgis.dialect.{PartitionedPostgisDialect, TableConfig, TypeInfo}
<<<<<<< HEAD
<<<<<<< HEAD
>>>>>>> 7d4ed7605c (GEOMESA-3262 Postgis - add config to skip whole world filters)
<<<<<<< HEAD
>>>>>>> 75d5a347f8 (GEOMESA-3262 Postgis - add config to skip whole world filters)
=======
=======
=======
import org.geotools.data._
<<<<<<< HEAD
<<<<<<< HEAD
import org.geotools.feature.simple.SimpleFeatureBuilder
=======
import org.geotools.data.postgis.PostGISPSDialect
<<<<<<< HEAD
=======
import org.geotools.data.{DataStoreFinder, DefaultTransaction, Query, Transaction}
>>>>>>> ee1d5f207 (GEOMESA-3215 Postgis - support List-type attributes)
import org.geotools.filter.identity.FeatureIdImpl
>>>>>>> cf1d94c7a (GEOMESA-3215 Postgis - support List-type attributes)
<<<<<<< HEAD
=======
=======
import org.geotools.data._
import org.geotools.feature.simple.SimpleFeatureBuilder
>>>>>>> 630900cfbb (GEOMESA-3246 Upgrade Arrow to 11.0.0)
=======
>>>>>>> da609e20da (GEOMESA-3215 Postgis - support List-type attributes)
=======
<<<<<<< HEAD
=======
>>>>>>> locationtech-main
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
>>>>>>> cf1d94c7a (GEOMESA-3215 Postgis - support List-type attributes)
=======
>>>>>>> d845d7c1b (GEOMESA-3254 Add Bloop build support)
=======
import org.geotools.data._
import org.geotools.data.postgis.PostGISPSDialect
>>>>>>> 58d14a257 (GEOMESA-3254 Add Bloop build support)
import org.geotools.filter.identity.FeatureIdImpl
>>>>>>> ee1d5f207 (GEOMESA-3215 Postgis - support List-type attributes)
>>>>>>> 47f8de1bb (GEOMESA-3215 Postgis - support List-type attributes)
>>>>>>> afb207dc68 (GEOMESA-3215 Postgis - support List-type attributes)
>>>>>>> 6bd2f89dcd (GEOMESA-3215 Postgis - support List-type attributes)
import org.geotools.filter.text.ecql.ECQL
import org.geotools.jdbc.JDBCDataStore
import org.geotools.referencing.CRS
import org.junit.runner.RunWith
import org.locationtech.geomesa.filter.FilterHelper
import org.locationtech.geomesa.gt.partition.postgis.dialect.procedures.{DropAgedOffPartitions, PartitionMaintenance, RollWriteAheadLog}
import org.locationtech.geomesa.gt.partition.postgis.dialect.tables.UserDataTable
<<<<<<< HEAD
import org.locationtech.geomesa.gt.partition.postgis.dialect.{TableConfig, TypeInfo}
<<<<<<< HEAD
>>>>>>> a928f2f73 (GEOMESA-3246 Upgrade Arrow to 11.0.0)
>>>>>>> 05a1868e90 (GEOMESA-3246 Upgrade Arrow to 11.0.0)
>>>>>>> d18777a94f (GEOMESA-3246 Upgrade Arrow to 11.0.0)
=======
>>>>>>> a928f2f739 (GEOMESA-3246 Upgrade Arrow to 11.0.0)
<<<<<<< HEAD
>>>>>>> 630900cfbb (GEOMESA-3246 Upgrade Arrow to 11.0.0)
=======
=======
import org.locationtech.geomesa.gt.partition.postgis.dialect.{PartitionedPostgisDialect, TableConfig, TypeInfo}
<<<<<<< HEAD
>>>>>>> 7d4ed7605c (GEOMESA-3262 Postgis - add config to skip whole world filters)
<<<<<<< HEAD
>>>>>>> b5c0452b13 (GEOMESA-3262 Postgis - add config to skip whole world filters)
=======
=======
=======
import org.geotools.data._
<<<<<<< HEAD
import org.geotools.feature.simple.SimpleFeatureBuilder
=======
import org.geotools.data.postgis.PostGISPSDialect
<<<<<<< HEAD
=======
import org.geotools.data.{DataStoreFinder, DefaultTransaction, Query, Transaction}
>>>>>>> ee1d5f207 (GEOMESA-3215 Postgis - support List-type attributes)
import org.geotools.filter.identity.FeatureIdImpl
>>>>>>> cf1d94c7a (GEOMESA-3215 Postgis - support List-type attributes)
import org.geotools.filter.text.ecql.ECQL
import org.geotools.jdbc.JDBCDataStore
import org.junit.runner.RunWith
import org.locationtech.geomesa.gt.partition.postgis.dialect.procedures.{PartitionMaintenance, RollWriteAheadLog}
import org.locationtech.geomesa.gt.partition.postgis.dialect.{TableConfig, TypeInfo}
>>>>>>> a928f2f73 (GEOMESA-3246 Upgrade Arrow to 11.0.0)
>>>>>>> 05a1868e90 (GEOMESA-3246 Upgrade Arrow to 11.0.0)
>>>>>>> 320759d5d3 (GEOMESA-3246 Upgrade Arrow to 11.0.0)
import org.locationtech.geomesa.utils.collection.SelfClosingIterator
import org.locationtech.geomesa.utils.geotools.{FeatureUtils, SimpleFeatureTypes}
import org.locationtech.geomesa.utils.io.WithClose
import org.locationtech.geomesa.utils.text.WKTUtils
<<<<<<< HEAD
<<<<<<< HEAD
<<<<<<< HEAD
<<<<<<< HEAD
<<<<<<< HEAD
<<<<<<< HEAD
=======
>>>>>>> 05a1868e90 (GEOMESA-3246 Upgrade Arrow to 11.0.0)
import org.opengis.feature.simple.{SimpleFeature, SimpleFeatureType}
import org.opengis.filter.Filter
import org.specs2.mutable.Specification
import org.specs2.runner.JUnitRunner
<<<<<<< HEAD
>>>>>>> a928f2f739 (GEOMESA-3246 Upgrade Arrow to 11.0.0)
=======
import org.specs2.specification.BeforeAfterAll
<<<<<<< HEAD
<<<<<<< HEAD
>>>>>>> 5c8e27c70f (GEOMESA-3260 Postgis - fix age-off bug (#2958))
=======
=======
>>>>>>> 6c49bcd685 (GEOMESA-3246 Upgrade Arrow to 11.0.0)
=======
import org.opengis.feature.simple.SimpleFeature
import org.specs2.mutable.Specification
import org.specs2.runner.JUnitRunner
<<<<<<< HEAD
<<<<<<< HEAD
>>>>>>> a928f2f73 (GEOMESA-3246 Upgrade Arrow to 11.0.0)
>>>>>>> 05a1868e90 (GEOMESA-3246 Upgrade Arrow to 11.0.0)
=======
=======
>>>>>>> d18777a94f (GEOMESA-3246 Upgrade Arrow to 11.0.0)
>>>>>>> a928f2f739 (GEOMESA-3246 Upgrade Arrow to 11.0.0)
<<<<<<< HEAD
>>>>>>> 6c49bcd685 (GEOMESA-3246 Upgrade Arrow to 11.0.0)
=======
=======
=======
>>>>>>> 630900cfbb (GEOMESA-3246 Upgrade Arrow to 11.0.0)
=======
>>>>>>> e54159ef30 (GEOMESA-3260 Postgis - fix age-off bug (#2958))
=======
=======
>>>>>>> 05a1868e90 (GEOMESA-3246 Upgrade Arrow to 11.0.0)
>>>>>>> 320759d5d3 (GEOMESA-3246 Upgrade Arrow to 11.0.0)
import org.opengis.feature.simple.{SimpleFeature, SimpleFeatureType}
import org.opengis.filter.Filter
import org.specs2.mutable.Specification
import org.specs2.runner.JUnitRunner
import org.specs2.specification.BeforeAfterAll
<<<<<<< HEAD
>>>>>>> 5c8e27c70f (GEOMESA-3260 Postgis - fix age-off bug (#2958))
<<<<<<< HEAD
>>>>>>> 9bd39d5310 (GEOMESA-3260 Postgis - fix age-off bug (#2958))
=======
=======
>>>>>>> a928f2f73 (GEOMESA-3246 Upgrade Arrow to 11.0.0)
>>>>>>> 05a1868e90 (GEOMESA-3246 Upgrade Arrow to 11.0.0)
>>>>>>> d18777a94f (GEOMESA-3246 Upgrade Arrow to 11.0.0)
=======
=======
import org.opengis.feature.simple.SimpleFeature
import org.specs2.mutable.Specification
import org.specs2.runner.JUnitRunner
<<<<<<< HEAD
>>>>>>> a928f2f739 (GEOMESA-3246 Upgrade Arrow to 11.0.0)
<<<<<<< HEAD
>>>>>>> 630900cfbb (GEOMESA-3246 Upgrade Arrow to 11.0.0)
=======
=======
import org.opengis.feature.simple.{SimpleFeature, SimpleFeatureType}
import org.opengis.filter.Filter
import org.specs2.mutable.Specification
import org.specs2.runner.JUnitRunner
import org.specs2.specification.BeforeAfterAll
>>>>>>> 5c8e27c70f (GEOMESA-3260 Postgis - fix age-off bug (#2958))
<<<<<<< HEAD
>>>>>>> e54159ef30 (GEOMESA-3260 Postgis - fix age-off bug (#2958))
=======
=======
>>>>>>> a928f2f73 (GEOMESA-3246 Upgrade Arrow to 11.0.0)
>>>>>>> 05a1868e90 (GEOMESA-3246 Upgrade Arrow to 11.0.0)
>>>>>>> 320759d5d3 (GEOMESA-3246 Upgrade Arrow to 11.0.0)
import org.testcontainers.containers.GenericContainer
import org.testcontainers.containers.output.Slf4jLogConsumer
import org.testcontainers.utility.DockerImageName

<<<<<<< HEAD
<<<<<<< HEAD
<<<<<<< HEAD
<<<<<<< HEAD
<<<<<<< HEAD
<<<<<<< HEAD
<<<<<<< HEAD
<<<<<<< HEAD
<<<<<<< HEAD
<<<<<<< HEAD
<<<<<<< HEAD
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
>>>>>>> 69a6e5986e (GEOMESA-3215 Postgis - support List-type attributes)
=======
>>>>>>> d18777a94f (GEOMESA-3246 Upgrade Arrow to 11.0.0)
=======
>>>>>>> 6bd2f89dcd (GEOMESA-3215 Postgis - support List-type attributes)
=======
>>>>>>> 320759d5d3 (GEOMESA-3246 Upgrade Arrow to 11.0.0)
=======
>>>>>>> ec30c2a23d (GEOMESA-3208 Postgis - Fix camel-case feature type names)
=======
>>>>>>> ec585da266 (GEOMESA-3215 Postgis - support List-type attributes)
=======
>>>>>>> ce17eba7ba (GEOMESA-3208 Postgis - Fix camel-case feature type names)
=======
>>>>>>> afb207dc68 (GEOMESA-3215 Postgis - support List-type attributes)
<<<<<<< HEAD
<<<<<<< HEAD
<<<<<<< HEAD
<<<<<<< HEAD
=======
>>>>>>> 05a1868e90 (GEOMESA-3246 Upgrade Arrow to 11.0.0)
=======
>>>>>>> a9343b6734 (GEOMESA-3208 Postgis - Fix camel-case feature type names)
<<<<<<< HEAD
<<<<<<< HEAD
=======
>>>>>>> 2912d58b06 (GEOMESA-3215 Postgis - support List-type attributes)
=======
>>>>>>> 6c49bcd685 (GEOMESA-3246 Upgrade Arrow to 11.0.0)
=======
=======
>>>>>>> ce17eba7ba (GEOMESA-3208 Postgis - Fix camel-case feature type names)
>>>>>>> fae2cdacf2 (GEOMESA-3208 Postgis - Fix camel-case feature type names)
=======
>>>>>>> 69a6e5986e (GEOMESA-3215 Postgis - support List-type attributes)
=======
=======
>>>>>>> 05a1868e90 (GEOMESA-3246 Upgrade Arrow to 11.0.0)
>>>>>>> d18777a94f (GEOMESA-3246 Upgrade Arrow to 11.0.0)
=======
>>>>>>> 4d7cc37021 (GEOMESA-3208 Postgis - Fix camel-case feature type names)
=======
>>>>>>> 36a7119501 (GEOMESA-3215 Postgis - support List-type attributes)
=======
>>>>>>> 630900cfbb (GEOMESA-3246 Upgrade Arrow to 11.0.0)
=======
=======
>>>>>>> ce17eba7ba (GEOMESA-3208 Postgis - Fix camel-case feature type names)
>>>>>>> 1e4bec1171 (GEOMESA-3208 Postgis - Fix camel-case feature type names)
=======
>>>>>>> 6bd2f89dcd (GEOMESA-3215 Postgis - support List-type attributes)
=======
=======
>>>>>>> 05a1868e90 (GEOMESA-3246 Upgrade Arrow to 11.0.0)
>>>>>>> 320759d5d3 (GEOMESA-3246 Upgrade Arrow to 11.0.0)
=======
>>>>>>> ec30c2a23d (GEOMESA-3208 Postgis - Fix camel-case feature type names)
=======
=======
>>>>>>> 2912d58b06 (GEOMESA-3215 Postgis - support List-type attributes)
>>>>>>> ec585da266 (GEOMESA-3215 Postgis - support List-type attributes)
import java.sql.Connection
import java.util.concurrent.CopyOnWriteArrayList
import java.util.logging.{Handler, Level, LogRecord}
import java.util.{Collections, Locale}
<<<<<<< HEAD
<<<<<<< HEAD
import scala.collection.mutable.ArrayBuffer
=======
<<<<<<< HEAD
<<<<<<< HEAD
=======
>>>>>>> 2912d58b06 (GEOMESA-3215 Postgis - support List-type attributes)
=======
import java.util.Collections
>>>>>>> ee1d5f2071 (GEOMESA-3215 Postgis - support List-type attributes)
import scala.annotation.tailrec
>>>>>>> f639b39b85 (GEOMESA-3208 Postgis - Fix camel-case feature type names)
=======
import java.sql.Connection
<<<<<<< HEAD
<<<<<<< HEAD
<<<<<<< HEAD
<<<<<<< HEAD
<<<<<<< HEAD
=======
>>>>>>> 75d5a347f8 (GEOMESA-3262 Postgis - add config to skip whole world filters)
=======
>>>>>>> b5c0452b13 (GEOMESA-3262 Postgis - add config to skip whole world filters)
import java.util.Collections
>>>>>>> a928f2f739 (GEOMESA-3246 Upgrade Arrow to 11.0.0)
=======
import java.util.{Collections, Locale}
import java.util.concurrent.CopyOnWriteArrayList
import java.util.logging.{Handler, Level, LogRecord}
<<<<<<< HEAD
<<<<<<< HEAD
<<<<<<< HEAD
<<<<<<< HEAD
<<<<<<< HEAD
>>>>>>> 7d4ed7605c (GEOMESA-3262 Postgis - add config to skip whole world filters)
=======
=======
=======
import java.util.Collections
>>>>>>> ee1d5f207 (GEOMESA-3215 Postgis - support List-type attributes)
import scala.annotation.tailrec
>>>>>>> f639b39b8 (GEOMESA-3208 Postgis - Fix camel-case feature type names)
<<<<<<< HEAD
>>>>>>> ce17eba7ba (GEOMESA-3208 Postgis - Fix camel-case feature type names)
=======
=======
import java.sql.Connection
import java.util.Collections
>>>>>>> a928f2f73 (GEOMESA-3246 Upgrade Arrow to 11.0.0)
>>>>>>> 05a1868e90 (GEOMESA-3246 Upgrade Arrow to 11.0.0)
<<<<<<< HEAD
<<<<<<< HEAD
<<<<<<< HEAD
=======
=======
=======
import java.util.Collections
>>>>>>> ee1d5f2071 (GEOMESA-3215 Postgis - support List-type attributes)
import scala.annotation.tailrec
>>>>>>> f639b39b85 (GEOMESA-3208 Postgis - Fix camel-case feature type names)
>>>>>>> a9343b6734 (GEOMESA-3208 Postgis - Fix camel-case feature type names)
=======
import java.util.Collections
>>>>>>> a928f2f739 (GEOMESA-3246 Upgrade Arrow to 11.0.0)
>>>>>>> 6c49bcd685 (GEOMESA-3246 Upgrade Arrow to 11.0.0)
=======
>>>>>>> 7d4ed7605c (GEOMESA-3262 Postgis - add config to skip whole world filters)
>>>>>>> 75d5a347f8 (GEOMESA-3262 Postgis - add config to skip whole world filters)
=======
>>>>>>> 7d4ed7605c (GEOMESA-3262 Postgis - add config to skip whole world filters)
=======
=======
=======
import java.util.Collections
>>>>>>> ee1d5f207 (GEOMESA-3215 Postgis - support List-type attributes)
import scala.annotation.tailrec
>>>>>>> f639b39b8 (GEOMESA-3208 Postgis - Fix camel-case feature type names)
>>>>>>> ce17eba7ba (GEOMESA-3208 Postgis - Fix camel-case feature type names)
>>>>>>> fae2cdacf2 (GEOMESA-3208 Postgis - Fix camel-case feature type names)
=======
>>>>>>> d18777a94f (GEOMESA-3246 Upgrade Arrow to 11.0.0)
=======
=======
=======
import java.util.Collections
>>>>>>> ee1d5f2071 (GEOMESA-3215 Postgis - support List-type attributes)
import scala.annotation.tailrec
>>>>>>> f639b39b85 (GEOMESA-3208 Postgis - Fix camel-case feature type names)
>>>>>>> 4d7cc37021 (GEOMESA-3208 Postgis - Fix camel-case feature type names)
=======
import java.util.Collections
>>>>>>> a928f2f739 (GEOMESA-3246 Upgrade Arrow to 11.0.0)
>>>>>>> 630900cfbb (GEOMESA-3246 Upgrade Arrow to 11.0.0)
=======
>>>>>>> 7d4ed7605c (GEOMESA-3262 Postgis - add config to skip whole world filters)
>>>>>>> b5c0452b13 (GEOMESA-3262 Postgis - add config to skip whole world filters)
=======
>>>>>>> 7d4ed7605c (GEOMESA-3262 Postgis - add config to skip whole world filters)
=======
=======
=======
import java.util.Collections
>>>>>>> ee1d5f207 (GEOMESA-3215 Postgis - support List-type attributes)
import scala.annotation.tailrec
>>>>>>> f639b39b8 (GEOMESA-3208 Postgis - Fix camel-case feature type names)
>>>>>>> ce17eba7ba (GEOMESA-3208 Postgis - Fix camel-case feature type names)
>>>>>>> 1e4bec1171 (GEOMESA-3208 Postgis - Fix camel-case feature type names)
=======
>>>>>>> 320759d5d3 (GEOMESA-3246 Upgrade Arrow to 11.0.0)
=======
=======
import scala.annotation.tailrec
>>>>>>> f639b39b85 (GEOMESA-3208 Postgis - Fix camel-case feature type names)
>>>>>>> a9343b6734 (GEOMESA-3208 Postgis - Fix camel-case feature type names)
>>>>>>> ec30c2a23d (GEOMESA-3208 Postgis - Fix camel-case feature type names)
import scala.util.Try
import scala.util.control.NonFatal

@RunWith(classOf[JUnitRunner])
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
>>>>>>> 6c49bcd685 (GEOMESA-3246 Upgrade Arrow to 11.0.0)
=======
>>>>>>> 9bd39d5310 (GEOMESA-3260 Postgis - fix age-off bug (#2958))
=======
>>>>>>> d18777a94f (GEOMESA-3246 Upgrade Arrow to 11.0.0)
=======
>>>>>>> 630900cfbb (GEOMESA-3246 Upgrade Arrow to 11.0.0)
=======
>>>>>>> e54159ef30 (GEOMESA-3260 Postgis - fix age-off bug (#2958))
=======
>>>>>>> 320759d5d3 (GEOMESA-3246 Upgrade Arrow to 11.0.0)
class PartitionedPostgisDataStoreTest extends Specification with BeforeAfterAll with LazyLogging {
=======
class PartitionedPostgisDataStoreTest extends Specification with LazyLogging {
>>>>>>> a928f2f739 (GEOMESA-3246 Upgrade Arrow to 11.0.0)
<<<<<<< HEAD
<<<<<<< HEAD
<<<<<<< HEAD
<<<<<<< HEAD
=======
class PartitionedPostgisDataStoreTest extends Specification with BeforeAfterAll with LazyLogging {
>>>>>>> 5c8e27c70f (GEOMESA-3260 Postgis - fix age-off bug (#2958))
=======
class PartitionedPostgisDataStoreTest extends Specification with BeforeAfterAll with LazyLogging {
=======
class PartitionedPostgisDataStoreTest extends Specification with LazyLogging {
>>>>>>> a928f2f73 (GEOMESA-3246 Upgrade Arrow to 11.0.0)
>>>>>>> 05a1868e90 (GEOMESA-3246 Upgrade Arrow to 11.0.0)
<<<<<<< HEAD
<<<<<<< HEAD
=======
>>>>>>> 6c49bcd685 (GEOMESA-3246 Upgrade Arrow to 11.0.0)
=======
=======
class PartitionedPostgisDataStoreTest extends Specification with BeforeAfterAll with LazyLogging {
>>>>>>> 5c8e27c70f (GEOMESA-3260 Postgis - fix age-off bug (#2958))
>>>>>>> 9bd39d5310 (GEOMESA-3260 Postgis - fix age-off bug (#2958))
=======
>>>>>>> d18777a94f (GEOMESA-3246 Upgrade Arrow to 11.0.0)
=======
>>>>>>> 630900cfbb (GEOMESA-3246 Upgrade Arrow to 11.0.0)
=======
=======
class PartitionedPostgisDataStoreTest extends Specification with BeforeAfterAll with LazyLogging {
>>>>>>> 5c8e27c70f (GEOMESA-3260 Postgis - fix age-off bug (#2958))
>>>>>>> e54159ef30 (GEOMESA-3260 Postgis - fix age-off bug (#2958))
=======
>>>>>>> 320759d5d3 (GEOMESA-3246 Upgrade Arrow to 11.0.0)

  import scala.collection.JavaConverters._

  val hours = 1
  val spec =
<<<<<<< HEAD
<<<<<<< HEAD
<<<<<<< HEAD
<<<<<<< HEAD
<<<<<<< HEAD
<<<<<<< HEAD
<<<<<<< HEAD
<<<<<<< HEAD
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
=======
>>>>>>> cf1d94c7a (GEOMESA-3215 Postgis - support List-type attributes)
>>>>>>> 1913bc4c2c (GEOMESA-3215 Postgis - support List-type attributes)
=======
=======
>>>>>>> 63a045a753 (GEOMESA-3254 Add Bloop build support)
=======
>>>>>>> 05a1868e90 (GEOMESA-3246 Upgrade Arrow to 11.0.0)
=======
>>>>>>> 75e1524a30 (GEOMESA-3215 Postgis - support List-type attributes)
=======
>>>>>>> ce0f6336d5 (GEOMESA-3217,GEOMESA-3216 Support Postgis json attributes, top-level arrays in json)
=======
>>>>>>> cf1d94c7a (GEOMESA-3215 Postgis - support List-type attributes)
=======
>>>>>>> e243573ba (GEOMESA-3217,GEOMESA-3216 Support Postgis json attributes, top-level arrays in json)
<<<<<<< HEAD
>>>>>>> 789a0bdedd (GEOMESA-3217,GEOMESA-3216 Support Postgis json attributes, top-level arrays in json)
=======
=======
>>>>>>> 42af7673b (GEOMESA-3215 Postgis - support List-type attributes)
<<<<<<< HEAD
>>>>>>> 75e1524a30 (GEOMESA-3215 Postgis - support List-type attributes)
=======
=======
>>>>>>> 8dc8f9c76 (GEOMESA-3217,GEOMESA-3216 Support Postgis json attributes, top-level arrays in json)
>>>>>>> ce0f6336d5 (GEOMESA-3217,GEOMESA-3216 Support Postgis json attributes, top-level arrays in json)
    "name:List[String],props:String:json=true,age:Int,dtg:Date,*geom:Point:srid=4326;" +
=======
>>>>>>> f5a0fbbc4a (GEOMESA-3217,GEOMESA-3216 Support Postgis json attributes, top-level arrays in json)
<<<<<<< HEAD
<<<<<<< HEAD
<<<<<<< HEAD
<<<<<<< HEAD
<<<<<<< HEAD
<<<<<<< HEAD
<<<<<<< HEAD
<<<<<<< HEAD
<<<<<<< HEAD
<<<<<<< HEAD
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
=======
>>>>>>> cf1d94c7a (GEOMESA-3215 Postgis - support List-type attributes)
>>>>>>> 1913bc4c2c (GEOMESA-3215 Postgis - support List-type attributes)
=======
=======
>>>>>>> 63a045a753 (GEOMESA-3254 Add Bloop build support)
=======
>>>>>>> 05a1868e90 (GEOMESA-3246 Upgrade Arrow to 11.0.0)
=======
>>>>>>> 75e1524a30 (GEOMESA-3215 Postgis - support List-type attributes)
=======
>>>>>>> ce0f6336d5 (GEOMESA-3217,GEOMESA-3216 Support Postgis json attributes, top-level arrays in json)
=======
>>>>>>> cf1d94c7a (GEOMESA-3215 Postgis - support List-type attributes)
=======
>>>>>>> e243573ba (GEOMESA-3217,GEOMESA-3216 Support Postgis json attributes, top-level arrays in json)
<<<<<<< HEAD
>>>>>>> 789a0bdedd (GEOMESA-3217,GEOMESA-3216 Support Postgis json attributes, top-level arrays in json)
=======
=======
>>>>>>> 42af7673b (GEOMESA-3215 Postgis - support List-type attributes)
<<<<<<< HEAD
>>>>>>> 75e1524a30 (GEOMESA-3215 Postgis - support List-type attributes)
=======
=======
>>>>>>> 8dc8f9c76 (GEOMESA-3217,GEOMESA-3216 Support Postgis json attributes, top-level arrays in json)
>>>>>>> ce0f6336d5 (GEOMESA-3217,GEOMESA-3216 Support Postgis json attributes, top-level arrays in json)
    "name:List[String],props:String:json=true,age:Int,dtg:Date,*geom:Point:srid=4326;" +
=======
>>>>>>> f5a0fbbc4a (GEOMESA-3217,GEOMESA-3216 Support Postgis json attributes, top-level arrays in json)
<<<<<<< HEAD
<<<<<<< HEAD
<<<<<<< HEAD
<<<<<<< HEAD
<<<<<<< HEAD
<<<<<<< HEAD
<<<<<<< HEAD
<<<<<<< HEAD
<<<<<<< HEAD
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
=======
>>>>>>> cf1d94c7a (GEOMESA-3215 Postgis - support List-type attributes)
>>>>>>> 1913bc4c2c (GEOMESA-3215 Postgis - support List-type attributes)
=======
=======
>>>>>>> 63a045a753 (GEOMESA-3254 Add Bloop build support)
=======
>>>>>>> 05a1868e90 (GEOMESA-3246 Upgrade Arrow to 11.0.0)
=======
>>>>>>> 75e1524a30 (GEOMESA-3215 Postgis - support List-type attributes)
=======
>>>>>>> ce0f6336d5 (GEOMESA-3217,GEOMESA-3216 Support Postgis json attributes, top-level arrays in json)
=======
>>>>>>> cf1d94c7a (GEOMESA-3215 Postgis - support List-type attributes)
=======
>>>>>>> e243573ba (GEOMESA-3217,GEOMESA-3216 Support Postgis json attributes, top-level arrays in json)
<<<<<<< HEAD
>>>>>>> 789a0bdedd (GEOMESA-3217,GEOMESA-3216 Support Postgis json attributes, top-level arrays in json)
=======
=======
>>>>>>> 42af7673b (GEOMESA-3215 Postgis - support List-type attributes)
<<<<<<< HEAD
>>>>>>> 75e1524a30 (GEOMESA-3215 Postgis - support List-type attributes)
=======
=======
>>>>>>> 8dc8f9c76 (GEOMESA-3217,GEOMESA-3216 Support Postgis json attributes, top-level arrays in json)
>>>>>>> ce0f6336d5 (GEOMESA-3217,GEOMESA-3216 Support Postgis json attributes, top-level arrays in json)
    "name:List[String],props:String:json=true,age:Int,dtg:Date,*geom:Point:srid=4326;" +
=======
>>>>>>> f5a0fbbc4a (GEOMESA-3217,GEOMESA-3216 Support Postgis json attributes, top-level arrays in json)
<<<<<<< HEAD
<<<<<<< HEAD
<<<<<<< HEAD
=======
>>>>>>> b597cf01b8 (GEOMESA-3217,GEOMESA-3216 Support Postgis json attributes, top-level arrays in json)
=======
>>>>>>> bf9e5cdd91 (GEOMESA-3215 Postgis - support List-type attributes)
=======
>>>>>>> 45ed5ccca0 (GEOMESA-3217,GEOMESA-3216 Support Postgis json attributes, top-level arrays in json)
=======
>>>>>>> f1532f2313 (GEOMESA-3254 Add Bloop build support)
=======
>>>>>>> 6c49bcd685 (GEOMESA-3246 Upgrade Arrow to 11.0.0)
=======
>>>>>>> 4b7c48b509 (GEOMESA-3215 Postgis - support List-type attributes)
=======
>>>>>>> e9a70d8c07 (GEOMESA-3217,GEOMESA-3216 Support Postgis json attributes, top-level arrays in json)
=======
>>>>>>> 69a6e5986e (GEOMESA-3215 Postgis - support List-type attributes)
=======
>>>>>>> f8a4dfe0b3 (GEOMESA-3217,GEOMESA-3216 Support Postgis json attributes, top-level arrays in json)
=======
>>>>>>> a207fd51c3 (GEOMESA-3215 Postgis - support List-type attributes)
=======
>>>>>>> 05825c803f (GEOMESA-3217,GEOMESA-3216 Support Postgis json attributes, top-level arrays in json)
=======
>>>>>>> 7a84c9d22d (GEOMESA-3254 Add Bloop build support)
=======
>>>>>>> 630900cfbb (GEOMESA-3246 Upgrade Arrow to 11.0.0)
=======
>>>>>>> da609e20da (GEOMESA-3215 Postgis - support List-type attributes)
=======
>>>>>>> d0df7c5dc2 (GEOMESA-3217,GEOMESA-3216 Support Postgis json attributes, top-level arrays in json)
=======
>>>>>>> 6bd2f89dcd (GEOMESA-3215 Postgis - support List-type attributes)
=======
=======
>>>>>>> b597cf01b8 (GEOMESA-3217,GEOMESA-3216 Support Postgis json attributes, top-level arrays in json)
>>>>>>> f30e218074 (GEOMESA-3217,GEOMESA-3216 Support Postgis json attributes, top-level arrays in json)
    "name:List[String],props:String:json=true,age:Int,dtg:Date,*geom:Point:srid=4326;" +
=======
    "name:List[String],age:Int,dtg:Date,*geom:Point:srid=4326;" +
>>>>>>> ee1d5f2071 (GEOMESA-3215 Postgis - support List-type attributes)
=======
    "name:List[String],props:String:json=true,age:Int,dtg:Date,*geom:Point:srid=4326;" +
>>>>>>> 865887e960 (GEOMESA-3217,GEOMESA-3216 Support Postgis json attributes, top-level arrays in json)
<<<<<<< HEAD
<<<<<<< HEAD
<<<<<<< HEAD
<<<<<<< HEAD
<<<<<<< HEAD
=======
>>>>>>> f30e218074 (GEOMESA-3217,GEOMESA-3216 Support Postgis json attributes, top-level arrays in json)
=======
=======
>>>>>>> e243573ba4 (GEOMESA-3217,GEOMESA-3216 Support Postgis json attributes, top-level arrays in json)
=======
>>>>>>> 8dc8f9c76d (GEOMESA-3217,GEOMESA-3216 Support Postgis json attributes, top-level arrays in json)
<<<<<<< HEAD
<<<<<<< HEAD
<<<<<<< HEAD
<<<<<<< HEAD
=======
>>>>>>> bbcfc938d3 (GEOMESA-3217,GEOMESA-3216 Support Postgis json attributes, top-level arrays in json)
=======
=======
>>>>>>> bf9e5cdd91 (GEOMESA-3215 Postgis - support List-type attributes)
=======
>>>>>>> e9a70d8c07 (GEOMESA-3217,GEOMESA-3216 Support Postgis json attributes, top-level arrays in json)
=======
=======
>>>>>>> bbcfc938d3 (GEOMESA-3217,GEOMESA-3216 Support Postgis json attributes, top-level arrays in json)
>>>>>>> 95fa3152e7 (GEOMESA-3217,GEOMESA-3216 Support Postgis json attributes, top-level arrays in json)
=======
=======
>>>>>>> a207fd51c3 (GEOMESA-3215 Postgis - support List-type attributes)
=======
>>>>>>> d0df7c5dc2 (GEOMESA-3217,GEOMESA-3216 Support Postgis json attributes, top-level arrays in json)
=======
=======
>>>>>>> bbcfc938d3 (GEOMESA-3217,GEOMESA-3216 Support Postgis json attributes, top-level arrays in json)
>>>>>>> 59c740cb04 (GEOMESA-3217,GEOMESA-3216 Support Postgis json attributes, top-level arrays in json)
    "name:List[String],props:String:json=true,age:Int,dtg:Date,*geom:Point:srid=4326;" +
=======
    "name:List[String],age:Int,dtg:Date,*geom:Point:srid=4326;" +
>>>>>>> ee1d5f207 (GEOMESA-3215 Postgis - support List-type attributes)
<<<<<<< HEAD
<<<<<<< HEAD
<<<<<<< HEAD
<<<<<<< HEAD
<<<<<<< HEAD
<<<<<<< HEAD
<<<<<<< HEAD
<<<<<<< HEAD
<<<<<<< HEAD
<<<<<<< HEAD
<<<<<<< HEAD
<<<<<<< HEAD
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
>>>>>>> e9a70d8c07 (GEOMESA-3217,GEOMESA-3216 Support Postgis json attributes, top-level arrays in json)
=======
>>>>>>> 9d3260f1dc (GEOMESA-3215 Postgis - support List-type attributes)
=======
>>>>>>> c3240dd4f8 (GEOMESA-3217,GEOMESA-3216 Support Postgis json attributes, top-level arrays in json)
=======
>>>>>>> 6edc66c3cb (GEOMESA-3215 Postgis - support List-type attributes)
=======
>>>>>>> 215bcb7385 (GEOMESA-3217,GEOMESA-3216 Support Postgis json attributes, top-level arrays in json)
=======
>>>>>>> 95fa3152e7 (GEOMESA-3217,GEOMESA-3216 Support Postgis json attributes, top-level arrays in json)
=======
>>>>>>> d0df7c5dc2 (GEOMESA-3217,GEOMESA-3216 Support Postgis json attributes, top-level arrays in json)
=======
>>>>>>> e7dfbc3fc1 (GEOMESA-3215 Postgis - support List-type attributes)
=======
>>>>>>> 91da2997ee (GEOMESA-3217,GEOMESA-3216 Support Postgis json attributes, top-level arrays in json)
=======
>>>>>>> 6494375eef (GEOMESA-3215 Postgis - support List-type attributes)
=======
>>>>>>> 319ffdf066 (GEOMESA-3217,GEOMESA-3216 Support Postgis json attributes, top-level arrays in json)
=======
>>>>>>> 59c740cb04 (GEOMESA-3217,GEOMESA-3216 Support Postgis json attributes, top-level arrays in json)
>>>>>>> cf1d94c7a8 (GEOMESA-3215 Postgis - support List-type attributes)
=======
=======
>>>>>>> 1913bc4c2c (GEOMESA-3215 Postgis - support List-type attributes)
=======
<<<<<<< HEAD
<<<<<<< HEAD
<<<<<<< HEAD
<<<<<<< HEAD
>>>>>>> 789a0bdedd (GEOMESA-3217,GEOMESA-3216 Support Postgis json attributes, top-level arrays in json)
=======
>>>>>>> 75e1524a30 (GEOMESA-3215 Postgis - support List-type attributes)
=======
<<<<<<< HEAD
<<<<<<< HEAD
<<<<<<< HEAD
<<<<<<< HEAD
>>>>>>> ce0f6336d5 (GEOMESA-3217,GEOMESA-3216 Support Postgis json attributes, top-level arrays in json)
=======
=======
>>>>>>> 9d3260f1dc (GEOMESA-3215 Postgis - support List-type attributes)
=======
>>>>>>> 789a0bdedd (GEOMESA-3217,GEOMESA-3216 Support Postgis json attributes, top-level arrays in json)
=======
>>>>>>> c3240dd4f8 (GEOMESA-3217,GEOMESA-3216 Support Postgis json attributes, top-level arrays in json)
=======
>>>>>>> 6edc66c3cb (GEOMESA-3215 Postgis - support List-type attributes)
=======
>>>>>>> ce0f6336d5 (GEOMESA-3217,GEOMESA-3216 Support Postgis json attributes, top-level arrays in json)
=======
>>>>>>> 215bcb7385 (GEOMESA-3217,GEOMESA-3216 Support Postgis json attributes, top-level arrays in json)
=======
>>>>>>> e7dfbc3fc1 (GEOMESA-3215 Postgis - support List-type attributes)
=======
>>>>>>> 789a0bdedd (GEOMESA-3217,GEOMESA-3216 Support Postgis json attributes, top-level arrays in json)
=======
>>>>>>> 91da2997ee (GEOMESA-3217,GEOMESA-3216 Support Postgis json attributes, top-level arrays in json)
=======
>>>>>>> 6494375eef (GEOMESA-3215 Postgis - support List-type attributes)
=======
>>>>>>> ce0f6336d5 (GEOMESA-3217,GEOMESA-3216 Support Postgis json attributes, top-level arrays in json)
=======
>>>>>>> 319ffdf066 (GEOMESA-3217,GEOMESA-3216 Support Postgis json attributes, top-level arrays in json)
    "name:List[String],props:String:json=true,age:Int,dtg:Date,*geom:Point:srid=4326;" +
>>>>>>> 865887e96 (GEOMESA-3217,GEOMESA-3216 Support Postgis json attributes, top-level arrays in json)
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
>>>>>>> 69a6e5986e (GEOMESA-3215 Postgis - support List-type attributes)
=======
>>>>>>> 9d0679fff9 (GEOMESA-3217,GEOMESA-3216 Support Postgis json attributes, top-level arrays in json)
=======
>>>>>>> 9d3260f1dc (GEOMESA-3215 Postgis - support List-type attributes)
=======
>>>>>>> 6bd2f89dcd (GEOMESA-3215 Postgis - support List-type attributes)
=======
>>>>>>> b4dbc3c8cf (GEOMESA-3217,GEOMESA-3216 Support Postgis json attributes, top-level arrays in json)
=======
>>>>>>> e7dfbc3fc1 (GEOMESA-3215 Postgis - support List-type attributes)
>>>>>>> e243573ba4 (GEOMESA-3217,GEOMESA-3216 Support Postgis json attributes, top-level arrays in json)
=======
    "name:List[String],props:String:json=true,age:Int,dtg:Date,*geom:Point:srid=4326;" +
>>>>>>> d845d7c1bd (GEOMESA-3254 Add Bloop build support)
=======
    "name:List[String],props:String:json=true,age:Int,dtg:Date,*geom:Point:srid=4326;" +
>>>>>>> a928f2f739 (GEOMESA-3246 Upgrade Arrow to 11.0.0)
=======
=======
>>>>>>> e243573ba4 (GEOMESA-3217,GEOMESA-3216 Support Postgis json attributes, top-level arrays in json)
    "name:List[String],props:String:json=true,age:Int,dtg:Date,*geom:Point:srid=4326;" +
=======
    "name:List[String],age:Int,dtg:Date,*geom:Point:srid=4326;" +
>>>>>>> ee1d5f207 (GEOMESA-3215 Postgis - support List-type attributes)
<<<<<<< HEAD
>>>>>>> 42af7673bd (GEOMESA-3215 Postgis - support List-type attributes)
=======
=======
    "name:List[String],props:String:json=true,age:Int,dtg:Date,*geom:Point:srid=4326;" +
>>>>>>> 865887e96 (GEOMESA-3217,GEOMESA-3216 Support Postgis json attributes, top-level arrays in json)
>>>>>>> 8dc8f9c76d (GEOMESA-3217,GEOMESA-3216 Support Postgis json attributes, top-level arrays in json)
=======
<<<<<<< HEAD
<<<<<<< HEAD
<<<<<<< HEAD
<<<<<<< HEAD
=======
>>>>>>> f5a0fbbc4a (GEOMESA-3217,GEOMESA-3216 Support Postgis json attributes, top-level arrays in json)
=======
>>>>>>> 1913bc4c2c (GEOMESA-3215 Postgis - support List-type attributes)
<<<<<<< HEAD
<<<<<<< HEAD
=======
>>>>>>> 69a6e5986e (GEOMESA-3215 Postgis - support List-type attributes)
=======
=======
>>>>>>> f5a0fbbc4a (GEOMESA-3217,GEOMESA-3216 Support Postgis json attributes, top-level arrays in json)
>>>>>>> 9d0679fff9 (GEOMESA-3217,GEOMESA-3216 Support Postgis json attributes, top-level arrays in json)
=======
>>>>>>> 9d3260f1dc (GEOMESA-3215 Postgis - support List-type attributes)
=======
>>>>>>> 6bd2f89dcd (GEOMESA-3215 Postgis - support List-type attributes)
=======
=======
>>>>>>> f5a0fbbc4a (GEOMESA-3217,GEOMESA-3216 Support Postgis json attributes, top-level arrays in json)
>>>>>>> b4dbc3c8cf (GEOMESA-3217,GEOMESA-3216 Support Postgis json attributes, top-level arrays in json)
=======
>>>>>>> e7dfbc3fc1 (GEOMESA-3215 Postgis - support List-type attributes)
>>>>>>> locationtech-main
=======
    "name:List[String],age:Int,dtg:Date,*geom:Point:srid=4326;" +
>>>>>>> ee1d5f207 (GEOMESA-3215 Postgis - support List-type attributes)
>>>>>>> 47f8de1bb (GEOMESA-3215 Postgis - support List-type attributes)
<<<<<<< HEAD
<<<<<<< HEAD
<<<<<<< HEAD
<<<<<<< HEAD
<<<<<<< HEAD
=======
>>>>>>> 9d0679fff9 (GEOMESA-3217,GEOMESA-3216 Support Postgis json attributes, top-level arrays in json)
=======
>>>>>>> b4dbc3c8cf (GEOMESA-3217,GEOMESA-3216 Support Postgis json attributes, top-level arrays in json)
>>>>>>> afb207dc68 (GEOMESA-3215 Postgis - support List-type attributes)
=======
=======
>>>>>>> eb44b0e44 (GEOMESA-3217,GEOMESA-3216 Support Postgis json attributes, top-level arrays in json)
<<<<<<< HEAD
<<<<<<< HEAD
<<<<<<< HEAD
<<<<<<< HEAD
<<<<<<< HEAD
=======
>>>>>>> 9d3260f1dc (GEOMESA-3215 Postgis - support List-type attributes)
=======
>>>>>>> e7dfbc3fc1 (GEOMESA-3215 Postgis - support List-type attributes)
>>>>>>> f5a0fbbc4a (GEOMESA-3217,GEOMESA-3216 Support Postgis json attributes, top-level arrays in json)
=======
=======
=======
>>>>>>> cf1d94c7a (GEOMESA-3215 Postgis - support List-type attributes)
<<<<<<< HEAD
<<<<<<< HEAD
<<<<<<< HEAD
<<<<<<< HEAD
<<<<<<< HEAD
>>>>>>> 3a1e1d7213 (GEOMESA-3215 Postgis - support List-type attributes)
<<<<<<< HEAD
>>>>>>> 1913bc4c2c (GEOMESA-3215 Postgis - support List-type attributes)
=======
=======
=======
=======
    "name:List[String],props:String:json=true,age:Int,dtg:Date,*geom:Point:srid=4326;" +
>>>>>>> 865887e96 (GEOMESA-3217,GEOMESA-3216 Support Postgis json attributes, top-level arrays in json)
>>>>>>> e243573ba (GEOMESA-3217,GEOMESA-3216 Support Postgis json attributes, top-level arrays in json)
<<<<<<< HEAD
<<<<<<< HEAD
<<<<<<< HEAD
>>>>>>> 230ae6c3ab (GEOMESA-3217,GEOMESA-3216 Support Postgis json attributes, top-level arrays in json)
<<<<<<< HEAD
>>>>>>> 789a0bdedd (GEOMESA-3217,GEOMESA-3216 Support Postgis json attributes, top-level arrays in json)
=======
=======
=======
    "name:List[String],props:String:json=true,age:Int,dtg:Date,*geom:Point:srid=4326;" +
>>>>>>> d845d7c1b (GEOMESA-3254 Add Bloop build support)
<<<<<<< HEAD
<<<<<<< HEAD
<<<<<<< HEAD
>>>>>>> 09d87762c5 (GEOMESA-3254 Add Bloop build support)
<<<<<<< HEAD
>>>>>>> 63a045a753 (GEOMESA-3254 Add Bloop build support)
=======
=======
=======
    "name:List[String],props:String:json=true,age:Int,dtg:Date,*geom:Point:srid=4326;" +
>>>>>>> a928f2f73 (GEOMESA-3246 Upgrade Arrow to 11.0.0)
<<<<<<< HEAD
<<<<<<< HEAD
<<<<<<< HEAD
>>>>>>> 7c0158dc6e (GEOMESA-3246 Upgrade Arrow to 11.0.0)
<<<<<<< HEAD
>>>>>>> 05a1868e90 (GEOMESA-3246 Upgrade Arrow to 11.0.0)
=======
=======
=======
>>>>>>> 42af7673b (GEOMESA-3215 Postgis - support List-type attributes)
<<<<<<< HEAD
<<<<<<< HEAD
<<<<<<< HEAD
>>>>>>> 6d3c0ecb75 (GEOMESA-3215 Postgis - support List-type attributes)
<<<<<<< HEAD
>>>>>>> 75e1524a30 (GEOMESA-3215 Postgis - support List-type attributes)
=======
=======
=======
=======
    "name:List[String],props:String:json=true,age:Int,dtg:Date,*geom:Point:srid=4326;" +
>>>>>>> 865887e96 (GEOMESA-3217,GEOMESA-3216 Support Postgis json attributes, top-level arrays in json)
>>>>>>> 8dc8f9c76 (GEOMESA-3217,GEOMESA-3216 Support Postgis json attributes, top-level arrays in json)
>>>>>>> 61a93c41b7 (GEOMESA-3217,GEOMESA-3216 Support Postgis json attributes, top-level arrays in json)
>>>>>>> ce0f6336d5 (GEOMESA-3217,GEOMESA-3216 Support Postgis json attributes, top-level arrays in json)
=======
<<<<<<< HEAD
=======
>>>>>>> e243573ba4 (GEOMESA-3217,GEOMESA-3216 Support Postgis json attributes, top-level arrays in json)
=======
>>>>>>> 6de7ca735b (GEOMESA-3215 Postgis - support List-type attributes)
    "name:List[String],props:String:json=true,age:Int,dtg:Date,*geom:Point:srid=4326;" +
=======
    "name:List[String],age:Int,dtg:Date,*geom:Point:srid=4326;" +
>>>>>>> ee1d5f207 (GEOMESA-3215 Postgis - support List-type attributes)
<<<<<<< HEAD
<<<<<<< HEAD
>>>>>>> 7542dc78d8 (GEOMESA-3215 Postgis - support List-type attributes)
<<<<<<< HEAD
<<<<<<< HEAD
<<<<<<< HEAD
=======
>>>>>>> 95fa3152e7 (GEOMESA-3217,GEOMESA-3216 Support Postgis json attributes, top-level arrays in json)
=======
>>>>>>> 59c740cb04 (GEOMESA-3217,GEOMESA-3216 Support Postgis json attributes, top-level arrays in json)
=======
=======
    "name:List[String],props:String:json=true,age:Int,dtg:Date,*geom:Point:srid=4326;" +
>>>>>>> 865887e96 (GEOMESA-3217,GEOMESA-3216 Support Postgis json attributes, top-level arrays in json)
>>>>>>> bbcfc938d3 (GEOMESA-3217,GEOMESA-3216 Support Postgis json attributes, top-level arrays in json)
<<<<<<< HEAD
<<<<<<< HEAD
<<<<<<< HEAD
=======
>>>>>>> ec585da266 (GEOMESA-3215 Postgis - support List-type attributes)
=======
    "name:List[String],props:String:json=true,age:Int,dtg:Date,*geom:Point:srid=4326;" +
=======
    "name:List[String],age:Int,dtg:Date,*geom:Point:srid=4326;" +
>>>>>>> ee1d5f2071 (GEOMESA-3215 Postgis - support List-type attributes)
>>>>>>> 2912d58b06 (GEOMESA-3215 Postgis - support List-type attributes)
<<<<<<< HEAD
<<<<<<< HEAD
=======
>>>>>>> b597cf01b8 (GEOMESA-3217,GEOMESA-3216 Support Postgis json attributes, top-level arrays in json)
=======
>>>>>>> cf1d94c7a8 (GEOMESA-3215 Postgis - support List-type attributes)
>>>>>>> bf9e5cdd91 (GEOMESA-3215 Postgis - support List-type attributes)
=======
<<<<<<< HEAD
>>>>>>> cf1d94c7a8 (GEOMESA-3215 Postgis - support List-type attributes)
=======
<<<<<<< HEAD
>>>>>>> cf1d94c7a8 (GEOMESA-3215 Postgis - support List-type attributes)
>>>>>>> 05825c803f (GEOMESA-3217,GEOMESA-3216 Support Postgis json attributes, top-level arrays in json)
=======
=======
    "name:List[String],props:String:json=true,age:Int,dtg:Date,*geom:Point:srid=4326;" +
>>>>>>> 865887e96 (GEOMESA-3217,GEOMESA-3216 Support Postgis json attributes, top-level arrays in json)
>>>>>>> e243573ba4 (GEOMESA-3217,GEOMESA-3216 Support Postgis json attributes, top-level arrays in json)
<<<<<<< HEAD
<<<<<<< HEAD
<<<<<<< HEAD
>>>>>>> 45ed5ccca0 (GEOMESA-3217,GEOMESA-3216 Support Postgis json attributes, top-level arrays in json)
=======
=======
    "name:List[String],props:String:json=true,age:Int,dtg:Date,*geom:Point:srid=4326;" +
>>>>>>> d845d7c1bd (GEOMESA-3254 Add Bloop build support)
<<<<<<< HEAD
<<<<<<< HEAD
>>>>>>> f1532f2313 (GEOMESA-3254 Add Bloop build support)
=======
=======
    "name:List[String],props:String:json=true,age:Int,dtg:Date,*geom:Point:srid=4326;" +
>>>>>>> a928f2f739 (GEOMESA-3246 Upgrade Arrow to 11.0.0)
<<<<<<< HEAD
<<<<<<< HEAD
>>>>>>> 6c49bcd685 (GEOMESA-3246 Upgrade Arrow to 11.0.0)
=======
=======
>>>>>>> da609e20da (GEOMESA-3215 Postgis - support List-type attributes)
=======
    "name:List[String],props:String:json=true,age:Int,dtg:Date,*geom:Point:srid=4326;" +
=======
    "name:List[String],age:Int,dtg:Date,*geom:Point:srid=4326;" +
>>>>>>> ee1d5f207 (GEOMESA-3215 Postgis - support List-type attributes)
>>>>>>> 42af7673bd (GEOMESA-3215 Postgis - support List-type attributes)
<<<<<<< HEAD
<<<<<<< HEAD
<<<<<<< HEAD
>>>>>>> 4b7c48b509 (GEOMESA-3215 Postgis - support List-type attributes)
=======
=======
>>>>>>> d0df7c5dc2 (GEOMESA-3217,GEOMESA-3216 Support Postgis json attributes, top-level arrays in json)
=======
=======
    "name:List[String],props:String:json=true,age:Int,dtg:Date,*geom:Point:srid=4326;" +
>>>>>>> 865887e96 (GEOMESA-3217,GEOMESA-3216 Support Postgis json attributes, top-level arrays in json)
>>>>>>> 8dc8f9c76d (GEOMESA-3217,GEOMESA-3216 Support Postgis json attributes, top-level arrays in json)
<<<<<<< HEAD
>>>>>>> e9a70d8c07 (GEOMESA-3217,GEOMESA-3216 Support Postgis json attributes, top-level arrays in json)
=======
>>>>>>> afb207dc68 (GEOMESA-3215 Postgis - support List-type attributes)
>>>>>>> 69a6e5986e (GEOMESA-3215 Postgis - support List-type attributes)
=======
>>>>>>> f5a0fbbc4a (GEOMESA-3217,GEOMESA-3216 Support Postgis json attributes, top-level arrays in json)
>>>>>>> 9d0679fff9 (GEOMESA-3217,GEOMESA-3216 Support Postgis json attributes, top-level arrays in json)
=======
=======
>>>>>>> c3240dd4f8 (GEOMESA-3217,GEOMESA-3216 Support Postgis json attributes, top-level arrays in json)
>>>>>>> 3a1e1d7213 (GEOMESA-3215 Postgis - support List-type attributes)
<<<<<<< HEAD
>>>>>>> 1913bc4c2c (GEOMESA-3215 Postgis - support List-type attributes)
<<<<<<< HEAD
>>>>>>> 9d3260f1dc (GEOMESA-3215 Postgis - support List-type attributes)
=======
=======
=======
=======
=======
    "name:List[String],props:String:json=true,age:Int,dtg:Date,*geom:Point:srid=4326;" +
>>>>>>> 865887e96 (GEOMESA-3217,GEOMESA-3216 Support Postgis json attributes, top-level arrays in json)
>>>>>>> e243573ba (GEOMESA-3217,GEOMESA-3216 Support Postgis json attributes, top-level arrays in json)
=======
>>>>>>> 5a4c24e020 (GEOMESA-3254 Add Bloop build support)
>>>>>>> 230ae6c3ab (GEOMESA-3217,GEOMESA-3216 Support Postgis json attributes, top-level arrays in json)
<<<<<<< HEAD
>>>>>>> 789a0bdedd (GEOMESA-3217,GEOMESA-3216 Support Postgis json attributes, top-level arrays in json)
<<<<<<< HEAD
>>>>>>> c3240dd4f8 (GEOMESA-3217,GEOMESA-3216 Support Postgis json attributes, top-level arrays in json)
=======
=======
=======
=======
    "name:List[String],props:String:json=true,age:Int,dtg:Date,*geom:Point:srid=4326;" +
>>>>>>> d845d7c1b (GEOMESA-3254 Add Bloop build support)
=======
>>>>>>> d18777a94f (GEOMESA-3246 Upgrade Arrow to 11.0.0)
>>>>>>> 09d87762c5 (GEOMESA-3254 Add Bloop build support)
<<<<<<< HEAD
>>>>>>> 63a045a753 (GEOMESA-3254 Add Bloop build support)
<<<<<<< HEAD
>>>>>>> 5a4c24e020 (GEOMESA-3254 Add Bloop build support)
=======
=======
=======
=======
    "name:List[String],props:String:json=true,age:Int,dtg:Date,*geom:Point:srid=4326;" +
>>>>>>> a928f2f73 (GEOMESA-3246 Upgrade Arrow to 11.0.0)
=======
>>>>>>> 6edc66c3cb (GEOMESA-3215 Postgis - support List-type attributes)
>>>>>>> 7c0158dc6e (GEOMESA-3246 Upgrade Arrow to 11.0.0)
<<<<<<< HEAD
>>>>>>> 05a1868e90 (GEOMESA-3246 Upgrade Arrow to 11.0.0)
<<<<<<< HEAD
>>>>>>> d18777a94f (GEOMESA-3246 Upgrade Arrow to 11.0.0)
=======
=======
=======
=======
>>>>>>> 42af7673b (GEOMESA-3215 Postgis - support List-type attributes)
=======
>>>>>>> 215bcb7385 (GEOMESA-3217,GEOMESA-3216 Support Postgis json attributes, top-level arrays in json)
>>>>>>> 6d3c0ecb75 (GEOMESA-3215 Postgis - support List-type attributes)
<<<<<<< HEAD
>>>>>>> 75e1524a30 (GEOMESA-3215 Postgis - support List-type attributes)
<<<<<<< HEAD
>>>>>>> 6edc66c3cb (GEOMESA-3215 Postgis - support List-type attributes)
=======
=======
=======
=======
=======
    "name:List[String],props:String:json=true,age:Int,dtg:Date,*geom:Point:srid=4326;" +
>>>>>>> 865887e96 (GEOMESA-3217,GEOMESA-3216 Support Postgis json attributes, top-level arrays in json)
>>>>>>> 8dc8f9c76 (GEOMESA-3217,GEOMESA-3216 Support Postgis json attributes, top-level arrays in json)
>>>>>>> 61a93c41b7 (GEOMESA-3217,GEOMESA-3216 Support Postgis json attributes, top-level arrays in json)
>>>>>>> ce0f6336d5 (GEOMESA-3217,GEOMESA-3216 Support Postgis json attributes, top-level arrays in json)
>>>>>>> 215bcb7385 (GEOMESA-3217,GEOMESA-3216 Support Postgis json attributes, top-level arrays in json)
=======
>>>>>>> 7e990c0c62 (GEOMESA-3215 Postgis - support List-type attributes)
=======
>>>>>>> 95fa3152e7 (GEOMESA-3217,GEOMESA-3216 Support Postgis json attributes, top-level arrays in json)
=======
    "name:List[String],props:String:json=true,age:Int,dtg:Date,*geom:Point:srid=4326;" +
=======
    "name:List[String],age:Int,dtg:Date,*geom:Point:srid=4326;" +
>>>>>>> ee1d5f2071 (GEOMESA-3215 Postgis - support List-type attributes)
>>>>>>> 36a7119501 (GEOMESA-3215 Postgis - support List-type attributes)
=======
>>>>>>> f8a4dfe0b3 (GEOMESA-3217,GEOMESA-3216 Support Postgis json attributes, top-level arrays in json)
=======
>>>>>>> cf1d94c7a8 (GEOMESA-3215 Postgis - support List-type attributes)
>>>>>>> a207fd51c3 (GEOMESA-3215 Postgis - support List-type attributes)
=======
>>>>>>> 05825c803f (GEOMESA-3217,GEOMESA-3216 Support Postgis json attributes, top-level arrays in json)
=======
=======
    "name:List[String],props:String:json=true,age:Int,dtg:Date,*geom:Point:srid=4326;" +
>>>>>>> d845d7c1bd (GEOMESA-3254 Add Bloop build support)
>>>>>>> 7a84c9d22d (GEOMESA-3254 Add Bloop build support)
=======
=======
    "name:List[String],props:String:json=true,age:Int,dtg:Date,*geom:Point:srid=4326;" +
>>>>>>> a928f2f739 (GEOMESA-3246 Upgrade Arrow to 11.0.0)
>>>>>>> 630900cfbb (GEOMESA-3246 Upgrade Arrow to 11.0.0)
=======
>>>>>>> da609e20da (GEOMESA-3215 Postgis - support List-type attributes)
=======
>>>>>>> d0df7c5dc2 (GEOMESA-3217,GEOMESA-3216 Support Postgis json attributes, top-level arrays in json)
=======
>>>>>>> afb207dc68 (GEOMESA-3215 Postgis - support List-type attributes)
>>>>>>> 6bd2f89dcd (GEOMESA-3215 Postgis - support List-type attributes)
=======
>>>>>>> f5a0fbbc4a (GEOMESA-3217,GEOMESA-3216 Support Postgis json attributes, top-level arrays in json)
>>>>>>> b4dbc3c8cf (GEOMESA-3217,GEOMESA-3216 Support Postgis json attributes, top-level arrays in json)
=======
=======
>>>>>>> 91da2997ee (GEOMESA-3217,GEOMESA-3216 Support Postgis json attributes, top-level arrays in json)
>>>>>>> 3a1e1d7213 (GEOMESA-3215 Postgis - support List-type attributes)
<<<<<<< HEAD
>>>>>>> 1913bc4c2c (GEOMESA-3215 Postgis - support List-type attributes)
<<<<<<< HEAD
>>>>>>> e7dfbc3fc1 (GEOMESA-3215 Postgis - support List-type attributes)
=======
=======
=======
=======
=======
    "name:List[String],props:String:json=true,age:Int,dtg:Date,*geom:Point:srid=4326;" +
>>>>>>> 865887e96 (GEOMESA-3217,GEOMESA-3216 Support Postgis json attributes, top-level arrays in json)
>>>>>>> e243573ba (GEOMESA-3217,GEOMESA-3216 Support Postgis json attributes, top-level arrays in json)
=======
>>>>>>> b298e017f1 (GEOMESA-3254 Add Bloop build support)
>>>>>>> 230ae6c3ab (GEOMESA-3217,GEOMESA-3216 Support Postgis json attributes, top-level arrays in json)
<<<<<<< HEAD
>>>>>>> 789a0bdedd (GEOMESA-3217,GEOMESA-3216 Support Postgis json attributes, top-level arrays in json)
<<<<<<< HEAD
>>>>>>> 91da2997ee (GEOMESA-3217,GEOMESA-3216 Support Postgis json attributes, top-level arrays in json)
=======
=======
=======
=======
    "name:List[String],props:String:json=true,age:Int,dtg:Date,*geom:Point:srid=4326;" +
>>>>>>> d845d7c1b (GEOMESA-3254 Add Bloop build support)
=======
>>>>>>> 320759d5d3 (GEOMESA-3246 Upgrade Arrow to 11.0.0)
>>>>>>> 09d87762c5 (GEOMESA-3254 Add Bloop build support)
<<<<<<< HEAD
>>>>>>> 63a045a753 (GEOMESA-3254 Add Bloop build support)
<<<<<<< HEAD
>>>>>>> b298e017f1 (GEOMESA-3254 Add Bloop build support)
=======
=======
=======
=======
    "name:List[String],props:String:json=true,age:Int,dtg:Date,*geom:Point:srid=4326;" +
>>>>>>> a928f2f73 (GEOMESA-3246 Upgrade Arrow to 11.0.0)
=======
>>>>>>> 6494375eef (GEOMESA-3215 Postgis - support List-type attributes)
>>>>>>> 7c0158dc6e (GEOMESA-3246 Upgrade Arrow to 11.0.0)
<<<<<<< HEAD
>>>>>>> 05a1868e90 (GEOMESA-3246 Upgrade Arrow to 11.0.0)
<<<<<<< HEAD
>>>>>>> 320759d5d3 (GEOMESA-3246 Upgrade Arrow to 11.0.0)
=======
=======
=======
=======
>>>>>>> 42af7673b (GEOMESA-3215 Postgis - support List-type attributes)
=======
>>>>>>> 319ffdf066 (GEOMESA-3217,GEOMESA-3216 Support Postgis json attributes, top-level arrays in json)
>>>>>>> 6d3c0ecb75 (GEOMESA-3215 Postgis - support List-type attributes)
<<<<<<< HEAD
>>>>>>> 75e1524a30 (GEOMESA-3215 Postgis - support List-type attributes)
<<<<<<< HEAD
>>>>>>> 6494375eef (GEOMESA-3215 Postgis - support List-type attributes)
=======
=======
=======
=======
=======
    "name:List[String],props:String:json=true,age:Int,dtg:Date,*geom:Point:srid=4326;" +
>>>>>>> 865887e96 (GEOMESA-3217,GEOMESA-3216 Support Postgis json attributes, top-level arrays in json)
>>>>>>> 8dc8f9c76 (GEOMESA-3217,GEOMESA-3216 Support Postgis json attributes, top-level arrays in json)
>>>>>>> 61a93c41b7 (GEOMESA-3217,GEOMESA-3216 Support Postgis json attributes, top-level arrays in json)
>>>>>>> ce0f6336d5 (GEOMESA-3217,GEOMESA-3216 Support Postgis json attributes, top-level arrays in json)
>>>>>>> 319ffdf066 (GEOMESA-3217,GEOMESA-3216 Support Postgis json attributes, top-level arrays in json)
=======
>>>>>>> 7542dc78d8 (GEOMESA-3215 Postgis - support List-type attributes)
>>>>>>> 6de7ca735b (GEOMESA-3215 Postgis - support List-type attributes)
=======
>>>>>>> 59c740cb04 (GEOMESA-3217,GEOMESA-3216 Support Postgis json attributes, top-level arrays in json)
=======
>>>>>>> ec585da266 (GEOMESA-3215 Postgis - support List-type attributes)
=======
=======
>>>>>>> b597cf01b8 (GEOMESA-3217,GEOMESA-3216 Support Postgis json attributes, top-level arrays in json)
>>>>>>> f30e218074 (GEOMESA-3217,GEOMESA-3216 Support Postgis json attributes, top-level arrays in json)
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
<<<<<<< HEAD
<<<<<<< HEAD
<<<<<<< HEAD
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
>>>>>>> d18777a94f (GEOMESA-3246 Upgrade Arrow to 11.0.0)
=======
>>>>>>> 320759d5d3 (GEOMESA-3246 Upgrade Arrow to 11.0.0)
=======
>>>>>>> ec585da266 (GEOMESA-3215 Postgis - support List-type attributes)
=======
>>>>>>> afb207dc68 (GEOMESA-3215 Postgis - support List-type attributes)
=======
>>>>>>> 05a1868e90 (GEOMESA-3246 Upgrade Arrow to 11.0.0)
<<<<<<< HEAD
<<<<<<< HEAD
<<<<<<< HEAD
=======
>>>>>>> 2912d58b06 (GEOMESA-3215 Postgis - support List-type attributes)
=======
>>>>>>> 6c49bcd685 (GEOMESA-3246 Upgrade Arrow to 11.0.0)
=======
=======
>>>>>>> afb207dc68 (GEOMESA-3215 Postgis - support List-type attributes)
>>>>>>> 69a6e5986e (GEOMESA-3215 Postgis - support List-type attributes)
=======
>>>>>>> d18777a94f (GEOMESA-3246 Upgrade Arrow to 11.0.0)
=======
>>>>>>> 36a7119501 (GEOMESA-3215 Postgis - support List-type attributes)
=======
>>>>>>> 630900cfbb (GEOMESA-3246 Upgrade Arrow to 11.0.0)
=======
=======
>>>>>>> afb207dc68 (GEOMESA-3215 Postgis - support List-type attributes)
>>>>>>> 6bd2f89dcd (GEOMESA-3215 Postgis - support List-type attributes)
=======
>>>>>>> 320759d5d3 (GEOMESA-3246 Upgrade Arrow to 11.0.0)
=======
=======
>>>>>>> 2912d58b06 (GEOMESA-3215 Postgis - support List-type attributes)
>>>>>>> ec585da266 (GEOMESA-3215 Postgis - support List-type attributes)
  val schema = "public"
=======
  val methods =
    Methods(
      create = false,
<<<<<<< HEAD
<<<<<<< HEAD
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
>>>>>>> 69a6e5986e (GEOMESA-3215 Postgis - support List-type attributes)
=======
>>>>>>> e74fa3f690 (GEOMESA-3254 Add Bloop build support)
=======
>>>>>>> 6bd2f89dcd (GEOMESA-3215 Postgis - support List-type attributes)
=======
>>>>>>> 3e610250ce (GEOMESA-3254 Add Bloop build support)
=======
>>>>>>> ec585da266 (GEOMESA-3215 Postgis - support List-type attributes)
      upgrade = false,
=======
      recreate = false,
>>>>>>> afb207dc68 (GEOMESA-3215 Postgis - support List-type attributes)
<<<<<<< HEAD
<<<<<<< HEAD
<<<<<<< HEAD
<<<<<<< HEAD
=======
      upgrade = false,
>>>>>>> fa60953a42 (GEOMESA-3254 Add Bloop build support)
=======
      recreate = false,
>>>>>>> 2912d58b06 (GEOMESA-3215 Postgis - support List-type attributes)
<<<<<<< HEAD
=======
      upgrade = false,
>>>>>>> 7564665969 (GEOMESA-3254 Add Bloop build support)
=======
>>>>>>> 69a6e5986e (GEOMESA-3215 Postgis - support List-type attributes)
=======
=======
      upgrade = false,
>>>>>>> fa60953a42 (GEOMESA-3254 Add Bloop build support)
>>>>>>> e74fa3f690 (GEOMESA-3254 Add Bloop build support)
=======
      recreate = false,
>>>>>>> 36a7119501 (GEOMESA-3215 Postgis - support List-type attributes)
=======
      upgrade = false,
>>>>>>> 9e49c1aac7 (GEOMESA-3254 Add Bloop build support)
=======
>>>>>>> 6bd2f89dcd (GEOMESA-3215 Postgis - support List-type attributes)
=======
=======
      upgrade = false,
>>>>>>> fa60953a42 (GEOMESA-3254 Add Bloop build support)
>>>>>>> 3e610250ce (GEOMESA-3254 Add Bloop build support)
=======
>>>>>>> ec585da266 (GEOMESA-3215 Postgis - support List-type attributes)
      write = false,
      update = false,
      query = false,
      delete = false,
      remove = false
    )
<<<<<<< HEAD
<<<<<<< HEAD
<<<<<<< HEAD
<<<<<<< HEAD
<<<<<<< HEAD
<<<<<<< HEAD
=======
>>>>>>> 69a6e5986e (GEOMESA-3215 Postgis - support List-type attributes)
=======
>>>>>>> 6bd2f89dcd (GEOMESA-3215 Postgis - support List-type attributes)
=======
>>>>>>> ec585da266 (GEOMESA-3215 Postgis - support List-type attributes)
>>>>>>> ee1d5f2071 (GEOMESA-3215 Postgis - support List-type attributes)
=======
  val schema = "public"
>>>>>>> a928f2f739 (GEOMESA-3246 Upgrade Arrow to 11.0.0)
<<<<<<< HEAD
<<<<<<< HEAD
<<<<<<< HEAD
<<<<<<< HEAD
=======
>>>>>>> ee1d5f207 (GEOMESA-3215 Postgis - support List-type attributes)
<<<<<<< HEAD
>>>>>>> afb207dc68 (GEOMESA-3215 Postgis - support List-type attributes)
=======
=======
  val schema = "public"
>>>>>>> a928f2f73 (GEOMESA-3246 Upgrade Arrow to 11.0.0)
>>>>>>> 05a1868e90 (GEOMESA-3246 Upgrade Arrow to 11.0.0)
=======
>>>>>>> ee1d5f2071 (GEOMESA-3215 Postgis - support List-type attributes)
>>>>>>> 2912d58b06 (GEOMESA-3215 Postgis - support List-type attributes)
<<<<<<< HEAD
=======
>>>>>>> 6c49bcd685 (GEOMESA-3246 Upgrade Arrow to 11.0.0)
=======
=======
>>>>>>> ee1d5f207 (GEOMESA-3215 Postgis - support List-type attributes)
<<<<<<< HEAD
>>>>>>> afb207dc68 (GEOMESA-3215 Postgis - support List-type attributes)
<<<<<<< HEAD
>>>>>>> 69a6e5986e (GEOMESA-3215 Postgis - support List-type attributes)
=======
=======
=======
  val schema = "public"
>>>>>>> a928f2f73 (GEOMESA-3246 Upgrade Arrow to 11.0.0)
>>>>>>> 05a1868e90 (GEOMESA-3246 Upgrade Arrow to 11.0.0)
>>>>>>> d18777a94f (GEOMESA-3246 Upgrade Arrow to 11.0.0)
=======
>>>>>>> ee1d5f2071 (GEOMESA-3215 Postgis - support List-type attributes)
>>>>>>> 36a7119501 (GEOMESA-3215 Postgis - support List-type attributes)
=======
>>>>>>> 630900cfbb (GEOMESA-3246 Upgrade Arrow to 11.0.0)
=======
=======
>>>>>>> ee1d5f207 (GEOMESA-3215 Postgis - support List-type attributes)
<<<<<<< HEAD
>>>>>>> afb207dc68 (GEOMESA-3215 Postgis - support List-type attributes)
<<<<<<< HEAD
>>>>>>> 6bd2f89dcd (GEOMESA-3215 Postgis - support List-type attributes)
=======
=======
=======
  val schema = "public"
>>>>>>> a928f2f73 (GEOMESA-3246 Upgrade Arrow to 11.0.0)
>>>>>>> 05a1868e90 (GEOMESA-3246 Upgrade Arrow to 11.0.0)
>>>>>>> 320759d5d3 (GEOMESA-3246 Upgrade Arrow to 11.0.0)
=======
>>>>>>> ec585da266 (GEOMESA-3215 Postgis - support List-type attributes)

  lazy val sft = SimpleFeatureTypes.createType(s"test", spec)

  lazy val now = System.currentTimeMillis()

  lazy val features = Seq.tabulate(10) { i =>
    val builder = new SimpleFeatureBuilder(sft)
    builder.set("name", java.util.List.of(s"name$i", s"alt$i"))
    builder.set("age", i)
    builder.set("props", s"""["name$i"]""")
    builder.set("dtg", new java.util.Date(now - ((i + 1) * 20 * 60 * 1000))) // 20 minutes
    builder.set("geom", WKTUtils.read(s"POINT(0 $i)"))
    builder.buildFeature(s"fid$i")
  }

  lazy val params = Map(
    "dbtype" -> PartitionedPostgisDataStoreParams.DbType.sample,
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
>>>>>>> 05a1868e90 (GEOMESA-3246 Upgrade Arrow to 11.0.0)
=======
>>>>>>> 6c49bcd685 (GEOMESA-3246 Upgrade Arrow to 11.0.0)
=======
>>>>>>> 9bd39d5310 (GEOMESA-3260 Postgis - fix age-off bug (#2958))
=======
=======
>>>>>>> 05a1868e90 (GEOMESA-3246 Upgrade Arrow to 11.0.0)
>>>>>>> d18777a94f (GEOMESA-3246 Upgrade Arrow to 11.0.0)
=======
>>>>>>> 630900cfbb (GEOMESA-3246 Upgrade Arrow to 11.0.0)
=======
>>>>>>> e54159ef30 (GEOMESA-3260 Postgis - fix age-off bug (#2958))
=======
=======
>>>>>>> 05a1868e90 (GEOMESA-3246 Upgrade Arrow to 11.0.0)
>>>>>>> 320759d5d3 (GEOMESA-3246 Upgrade Arrow to 11.0.0)
    "host" -> host,
    "port" -> port,
=======
    "host" -> container.getHost,
    "port" -> container.getFirstMappedPort.toString,
<<<<<<< HEAD
<<<<<<< HEAD
<<<<<<< HEAD
<<<<<<< HEAD
<<<<<<< HEAD
=======
=======
>>>>>>> 320759d5d3 (GEOMESA-3246 Upgrade Arrow to 11.0.0)
>>>>>>> a928f2f739 (GEOMESA-3246 Upgrade Arrow to 11.0.0)
<<<<<<< HEAD
>>>>>>> d18777a94f (GEOMESA-3246 Upgrade Arrow to 11.0.0)
=======
>>>>>>> e54159ef30 (GEOMESA-3260 Postgis - fix age-off bug (#2958))
=======
    "host" -> host,
    "port" -> port,
>>>>>>> 5c8e27c70f (GEOMESA-3260 Postgis - fix age-off bug (#2958))
<<<<<<< HEAD
<<<<<<< HEAD
=======
>>>>>>> a928f2f73 (GEOMESA-3246 Upgrade Arrow to 11.0.0)
>>>>>>> 05a1868e90 (GEOMESA-3246 Upgrade Arrow to 11.0.0)
<<<<<<< HEAD
=======
>>>>>>> a928f2f739 (GEOMESA-3246 Upgrade Arrow to 11.0.0)
<<<<<<< HEAD
>>>>>>> 6c49bcd685 (GEOMESA-3246 Upgrade Arrow to 11.0.0)
=======
=======
    "host" -> host,
    "port" -> port,
>>>>>>> 5c8e27c70f (GEOMESA-3260 Postgis - fix age-off bug (#2958))
>>>>>>> 9bd39d5310 (GEOMESA-3260 Postgis - fix age-off bug (#2958))
=======
>>>>>>> d18777a94f (GEOMESA-3246 Upgrade Arrow to 11.0.0)
=======
>>>>>>> a928f2f739 (GEOMESA-3246 Upgrade Arrow to 11.0.0)
>>>>>>> 630900cfbb (GEOMESA-3246 Upgrade Arrow to 11.0.0)
=======
>>>>>>> e54159ef30 (GEOMESA-3260 Postgis - fix age-off bug (#2958))
=======
=======
>>>>>>> a928f2f73 (GEOMESA-3246 Upgrade Arrow to 11.0.0)
>>>>>>> 05a1868e90 (GEOMESA-3246 Upgrade Arrow to 11.0.0)
>>>>>>> 320759d5d3 (GEOMESA-3246 Upgrade Arrow to 11.0.0)
    "schema" -> schema,
>>>>>>> a928f2f739 (GEOMESA-3246 Upgrade Arrow to 11.0.0)
    "database" -> "postgres",
    "user" -> "postgres",
    "passwd" -> "postgres",
    "Batch insert size" -> "10",
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
>>>>>>> 843af3b23e (GEOMESA-3263 Docs for NiFi schema initialization)
=======
>>>>>>> d18777a94f (GEOMESA-3246 Upgrade Arrow to 11.0.0)
=======
>>>>>>> b47b4583aa (GEOMESA-3263 Docs for NiFi schema initialization)
=======
>>>>>>> 320759d5d3 (GEOMESA-3246 Upgrade Arrow to 11.0.0)
=======
    "Commit size" -> "20",
>>>>>>> a928f2f739 (GEOMESA-3246 Upgrade Arrow to 11.0.0)
=======
>>>>>>> e53d56fe7c (GEOMESA-3263 Docs for NiFi schema initialization)
<<<<<<< HEAD
<<<<<<< HEAD
<<<<<<< HEAD
<<<<<<< HEAD
=======
>>>>>>> d18777a94f (GEOMESA-3246 Upgrade Arrow to 11.0.0)
=======
>>>>>>> 320759d5d3 (GEOMESA-3246 Upgrade Arrow to 11.0.0)
=======
=======
    "Commit size" -> "20",
>>>>>>> a928f2f73 (GEOMESA-3246 Upgrade Arrow to 11.0.0)
>>>>>>> 05a1868e90 (GEOMESA-3246 Upgrade Arrow to 11.0.0)
<<<<<<< HEAD
<<<<<<< HEAD
=======
=======
    "Commit size" -> "20",
>>>>>>> a928f2f739 (GEOMESA-3246 Upgrade Arrow to 11.0.0)
>>>>>>> 6c49bcd685 (GEOMESA-3246 Upgrade Arrow to 11.0.0)
=======
>>>>>>> 843af3b23e (GEOMESA-3263 Docs for NiFi schema initialization)
=======
>>>>>>> d18777a94f (GEOMESA-3246 Upgrade Arrow to 11.0.0)
=======
=======
    "Commit size" -> "20",
>>>>>>> a928f2f739 (GEOMESA-3246 Upgrade Arrow to 11.0.0)
>>>>>>> 630900cfbb (GEOMESA-3246 Upgrade Arrow to 11.0.0)
=======
>>>>>>> b47b4583aa (GEOMESA-3263 Docs for NiFi schema initialization)
=======
>>>>>>> 320759d5d3 (GEOMESA-3246 Upgrade Arrow to 11.0.0)
    "preparedStatements" -> "true"
  )

  var container: GenericContainer[_] = _

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
>>>>>>> d18777a94f (GEOMESA-3246 Upgrade Arrow to 11.0.0)
=======
>>>>>>> 320759d5d3 (GEOMESA-3246 Upgrade Arrow to 11.0.0)
=======
>>>>>>> 5c8e27c70f (GEOMESA-3260 Postgis - fix age-off bug (#2958))
=======
>>>>>>> 05a1868e90 (GEOMESA-3246 Upgrade Arrow to 11.0.0)
<<<<<<< HEAD
<<<<<<< HEAD
=======
>>>>>>> 6c49bcd685 (GEOMESA-3246 Upgrade Arrow to 11.0.0)
=======
=======
>>>>>>> 5c8e27c70f (GEOMESA-3260 Postgis - fix age-off bug (#2958))
>>>>>>> 9bd39d5310 (GEOMESA-3260 Postgis - fix age-off bug (#2958))
=======
>>>>>>> d18777a94f (GEOMESA-3246 Upgrade Arrow to 11.0.0)
=======
>>>>>>> 630900cfbb (GEOMESA-3246 Upgrade Arrow to 11.0.0)
=======
=======
>>>>>>> 5c8e27c70f (GEOMESA-3260 Postgis - fix age-off bug (#2958))
>>>>>>> e54159ef30 (GEOMESA-3260 Postgis - fix age-off bug (#2958))
=======
>>>>>>> 320759d5d3 (GEOMESA-3246 Upgrade Arrow to 11.0.0)
  lazy val host = Option(container).map(_.getHost).getOrElse("localhost")
  lazy val port = Option(container).map(_.getFirstMappedPort).getOrElse(5432).toString

  lazy val fif = CommonFactoryFinder.getFilterFactory

  override def beforeAll(): Unit = {
<<<<<<< HEAD
<<<<<<< HEAD
<<<<<<< HEAD
<<<<<<< HEAD
<<<<<<< HEAD
<<<<<<< HEAD
<<<<<<< HEAD
<<<<<<< HEAD
=======
>>>>>>> 9bd39d5310 (GEOMESA-3260 Postgis - fix age-off bug (#2958))
=======
>>>>>>> d18777a94f (GEOMESA-3246 Upgrade Arrow to 11.0.0)
=======
>>>>>>> e54159ef30 (GEOMESA-3260 Postgis - fix age-off bug (#2958))
=======
>>>>>>> 320759d5d3 (GEOMESA-3246 Upgrade Arrow to 11.0.0)
=======
  step {
>>>>>>> a928f2f739 (GEOMESA-3246 Upgrade Arrow to 11.0.0)
=======
>>>>>>> 5c8e27c70f (GEOMESA-3260 Postgis - fix age-off bug (#2958))
<<<<<<< HEAD
<<<<<<< HEAD
<<<<<<< HEAD
<<<<<<< HEAD
=======
>>>>>>> d18777a94f (GEOMESA-3246 Upgrade Arrow to 11.0.0)
=======
>>>>>>> 320759d5d3 (GEOMESA-3246 Upgrade Arrow to 11.0.0)
=======
=======
  step {
>>>>>>> a928f2f73 (GEOMESA-3246 Upgrade Arrow to 11.0.0)
>>>>>>> 05a1868e90 (GEOMESA-3246 Upgrade Arrow to 11.0.0)
<<<<<<< HEAD
<<<<<<< HEAD
=======
=======
  step {
>>>>>>> a928f2f739 (GEOMESA-3246 Upgrade Arrow to 11.0.0)
>>>>>>> 6c49bcd685 (GEOMESA-3246 Upgrade Arrow to 11.0.0)
=======
>>>>>>> 9bd39d5310 (GEOMESA-3260 Postgis - fix age-off bug (#2958))
=======
>>>>>>> d18777a94f (GEOMESA-3246 Upgrade Arrow to 11.0.0)
=======
=======
  step {
>>>>>>> a928f2f739 (GEOMESA-3246 Upgrade Arrow to 11.0.0)
>>>>>>> 630900cfbb (GEOMESA-3246 Upgrade Arrow to 11.0.0)
=======
>>>>>>> e54159ef30 (GEOMESA-3260 Postgis - fix age-off bug (#2958))
=======
>>>>>>> 320759d5d3 (GEOMESA-3246 Upgrade Arrow to 11.0.0)
    val image =
      DockerImageName.parse("ghcr.io/geomesa/postgis-cron")
          .withTag(sys.props.getOrElse("postgis.docker.tag", "15-3.4"))
    container = new GenericContainer(image)
    container.addEnv("POSTGRES_HOST_AUTH_METHOD", "trust")
    container.addExposedPort(5432)
    container.start()
    container.followOutput(new Slf4jLogConsumer(logger.underlying))
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
=======
>>>>>>> d18777a94f (GEOMESA-3246 Upgrade Arrow to 11.0.0)
=======
>>>>>>> 320759d5d3 (GEOMESA-3246 Upgrade Arrow to 11.0.0)
=======
>>>>>>> 5c8e27c70f (GEOMESA-3260 Postgis - fix age-off bug (#2958))
=======
>>>>>>> 05a1868e90 (GEOMESA-3246 Upgrade Arrow to 11.0.0)
<<<<<<< HEAD
<<<<<<< HEAD
=======
>>>>>>> 6c49bcd685 (GEOMESA-3246 Upgrade Arrow to 11.0.0)
=======
=======
>>>>>>> 5c8e27c70f (GEOMESA-3260 Postgis - fix age-off bug (#2958))
>>>>>>> 9bd39d5310 (GEOMESA-3260 Postgis - fix age-off bug (#2958))
=======
>>>>>>> d18777a94f (GEOMESA-3246 Upgrade Arrow to 11.0.0)
=======
>>>>>>> 630900cfbb (GEOMESA-3246 Upgrade Arrow to 11.0.0)
=======
=======
>>>>>>> 5c8e27c70f (GEOMESA-3260 Postgis - fix age-off bug (#2958))
>>>>>>> e54159ef30 (GEOMESA-3260 Postgis - fix age-off bug (#2958))
=======
>>>>>>> 320759d5d3 (GEOMESA-3246 Upgrade Arrow to 11.0.0)
  override def afterAll(): Unit = {
    if (container != null) {
      container.stop()
    }
  }

  "PartitionedPostgisDataStore" should {

    "fail with a useful error message if type name is too long" in {
      val ds = DataStoreFinder.getDataStore(params.asJava)
      ds must not(beNull)

      try {
        ds must beAnInstanceOf[JDBCDataStore]

        // This sft name exceeds 31 characters, so it should fail
        val sft = SimpleFeatureTypes.renameSft(this.sft, "abcdefghijklmnopqrstuvwxyzabcde_____")
        ds.getTypeNames.toSeq must not(contain(sft.getTypeName))
        ds.createSchema(sft) must throwAn[java.io.IOException].like {
          case e => e.getCause.getMessage mustEqual "Can't create schema: type name exceeds max supported length of 31 characters"
        }
      } finally {
        ds.dispose()
      }
      ok
    }

    "work" in {
<<<<<<< HEAD
<<<<<<< HEAD
<<<<<<< HEAD
<<<<<<< HEAD
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
>>>>>>> ec30c2a23d (GEOMESA-3208 Postgis - Fix camel-case feature type names)
=======
>>>>>>> fa60953a42 (GEOMESA-3254 Add Bloop build support)
=======
>>>>>>> 7564665969 (GEOMESA-3254 Add Bloop build support)
=======
>>>>>>> fae2cdacf2 (GEOMESA-3208 Postgis - Fix camel-case feature type names)
=======
=======
>>>>>>> fa60953a42 (GEOMESA-3254 Add Bloop build support)
>>>>>>> e74fa3f690 (GEOMESA-3254 Add Bloop build support)
=======
>>>>>>> 9e49c1aac7 (GEOMESA-3254 Add Bloop build support)
=======
>>>>>>> 1e4bec1171 (GEOMESA-3208 Postgis - Fix camel-case feature type names)
=======
=======
>>>>>>> fa60953a42 (GEOMESA-3254 Add Bloop build support)
>>>>>>> 3e610250ce (GEOMESA-3254 Add Bloop build support)
=======
      skipped("requires postgis instance")
=======
      if (!methods.any) {
        skipped("requires postgis instance")
      }
<<<<<<< HEAD
<<<<<<< HEAD
<<<<<<< HEAD
<<<<<<< HEAD
<<<<<<< HEAD
=======
>>>>>>> e74fa3f690 (GEOMESA-3254 Add Bloop build support)
=======
>>>>>>> 3e610250ce (GEOMESA-3254 Add Bloop build support)
>>>>>>> 58d14a257e (GEOMESA-3254 Add Bloop build support)
=======
=======
      skipped("requires postgis instance")
>>>>>>> ce17eba7ba (GEOMESA-3208 Postgis - Fix camel-case feature type names)
<<<<<<< HEAD
<<<<<<< HEAD
<<<<<<< HEAD
<<<<<<< HEAD
=======
>>>>>>> 58d14a257 (GEOMESA-3254 Add Bloop build support)
>>>>>>> fa60953a42 (GEOMESA-3254 Add Bloop build support)
=======
=======
      skipped("requires postgis instance")
>>>>>>> a9343b6734 (GEOMESA-3208 Postgis - Fix camel-case feature type names)
<<<<<<< HEAD
=======
>>>>>>> 58d14a257e (GEOMESA-3254 Add Bloop build support)
>>>>>>> 7564665969 (GEOMESA-3254 Add Bloop build support)
=======
>>>>>>> fae2cdacf2 (GEOMESA-3208 Postgis - Fix camel-case feature type names)
=======
=======
>>>>>>> 58d14a257 (GEOMESA-3254 Add Bloop build support)
>>>>>>> fa60953a42 (GEOMESA-3254 Add Bloop build support)
>>>>>>> e74fa3f690 (GEOMESA-3254 Add Bloop build support)
=======
=======
      skipped("requires postgis instance")
>>>>>>> 4d7cc37021 (GEOMESA-3208 Postgis - Fix camel-case feature type names)
=======
>>>>>>> 58d14a257e (GEOMESA-3254 Add Bloop build support)
>>>>>>> 9e49c1aac7 (GEOMESA-3254 Add Bloop build support)
=======
>>>>>>> 1e4bec1171 (GEOMESA-3208 Postgis - Fix camel-case feature type names)
=======
=======
>>>>>>> 58d14a257 (GEOMESA-3254 Add Bloop build support)
>>>>>>> fa60953a42 (GEOMESA-3254 Add Bloop build support)
>>>>>>> 3e610250ce (GEOMESA-3254 Add Bloop build support)
=======
>>>>>>> ec30c2a23d (GEOMESA-3208 Postgis - Fix camel-case feature type names)
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

<<<<<<< HEAD
<<<<<<< HEAD
<<<<<<< HEAD
<<<<<<< HEAD
<<<<<<< HEAD
<<<<<<< HEAD
=======
>>>>>>> fae2cdacf2 (GEOMESA-3208 Postgis - Fix camel-case feature type names)
=======
>>>>>>> 1e4bec1171 (GEOMESA-3208 Postgis - Fix camel-case feature type names)
=======
>>>>>>> ec30c2a23d (GEOMESA-3208 Postgis - Fix camel-case feature type names)
>>>>>>> f639b39b85 (GEOMESA-3208 Postgis - Fix camel-case feature type names)
=======
  "PartitionedPostgisDataStore" should {
    "work" in {
>>>>>>> a928f2f739 (GEOMESA-3246 Upgrade Arrow to 11.0.0)
<<<<<<< HEAD
<<<<<<< HEAD
<<<<<<< HEAD
<<<<<<< HEAD
=======
>>>>>>> f639b39b8 (GEOMESA-3208 Postgis - Fix camel-case feature type names)
<<<<<<< HEAD
>>>>>>> ce17eba7ba (GEOMESA-3208 Postgis - Fix camel-case feature type names)
=======
=======
  "PartitionedPostgisDataStore" should {
    "work" in {
>>>>>>> a928f2f73 (GEOMESA-3246 Upgrade Arrow to 11.0.0)
>>>>>>> 05a1868e90 (GEOMESA-3246 Upgrade Arrow to 11.0.0)
=======
>>>>>>> f639b39b85 (GEOMESA-3208 Postgis - Fix camel-case feature type names)
>>>>>>> a9343b6734 (GEOMESA-3208 Postgis - Fix camel-case feature type names)
<<<<<<< HEAD
=======
>>>>>>> 6c49bcd685 (GEOMESA-3246 Upgrade Arrow to 11.0.0)
=======
=======
>>>>>>> f639b39b8 (GEOMESA-3208 Postgis - Fix camel-case feature type names)
<<<<<<< HEAD
>>>>>>> ce17eba7ba (GEOMESA-3208 Postgis - Fix camel-case feature type names)
<<<<<<< HEAD
>>>>>>> fae2cdacf2 (GEOMESA-3208 Postgis - Fix camel-case feature type names)
=======
=======
=======
  "PartitionedPostgisDataStore" should {
    "work" in {
>>>>>>> a928f2f73 (GEOMESA-3246 Upgrade Arrow to 11.0.0)
>>>>>>> 05a1868e90 (GEOMESA-3246 Upgrade Arrow to 11.0.0)
>>>>>>> d18777a94f (GEOMESA-3246 Upgrade Arrow to 11.0.0)
=======
>>>>>>> f639b39b85 (GEOMESA-3208 Postgis - Fix camel-case feature type names)
>>>>>>> 4d7cc37021 (GEOMESA-3208 Postgis - Fix camel-case feature type names)
=======
>>>>>>> 630900cfbb (GEOMESA-3246 Upgrade Arrow to 11.0.0)
=======
=======
>>>>>>> f639b39b8 (GEOMESA-3208 Postgis - Fix camel-case feature type names)
<<<<<<< HEAD
>>>>>>> ce17eba7ba (GEOMESA-3208 Postgis - Fix camel-case feature type names)
<<<<<<< HEAD
>>>>>>> 1e4bec1171 (GEOMESA-3208 Postgis - Fix camel-case feature type names)
=======
=======
=======
  "PartitionedPostgisDataStore" should {
    "work" in {
>>>>>>> a928f2f73 (GEOMESA-3246 Upgrade Arrow to 11.0.0)
>>>>>>> 05a1868e90 (GEOMESA-3246 Upgrade Arrow to 11.0.0)
>>>>>>> 320759d5d3 (GEOMESA-3246 Upgrade Arrow to 11.0.0)
=======
>>>>>>> ec30c2a23d (GEOMESA-3208 Postgis - Fix camel-case feature type names)
      val ds = DataStoreFinder.getDataStore(params.asJava)
      ds must not(beNull)

      try {
        ds must beAnInstanceOf[JDBCDataStore]

<<<<<<< HEAD
<<<<<<< HEAD
<<<<<<< HEAD
<<<<<<< HEAD
<<<<<<< HEAD
<<<<<<< HEAD
<<<<<<< HEAD
<<<<<<< HEAD
<<<<<<< HEAD
<<<<<<< HEAD
<<<<<<< HEAD
<<<<<<< HEAD
<<<<<<< HEAD
<<<<<<< HEAD
<<<<<<< HEAD
<<<<<<< HEAD
<<<<<<< HEAD
<<<<<<< HEAD
        val sftNames: Seq[String] = Seq("test", "test-abcdefghijklmnopqrstuvwxyz")

        foreach(sftNames) { name =>
=======
=======
>>>>>>> 6aae44d50d6 (GEOMESA-3246 Upgrade Arrow to 11.0.0)
=======
>>>>>>> 3e02b27cb9e (GEOMESA-3260 Postgis - fix age-off bug (#2958))
<<<<<<< HEAD
=======
<<<<<<< HEAD
=======
>>>>>>> 794a6f66c3 (GEOMESA-3261 Postgis - Fix age-off for non-alpha feature type names)
>>>>>>> 7242d030619 (GEOMESA-3261 Postgis - Fix age-off for non-alpha feature type names)
=======
=======
>>>>>>> f5d7da9ec9b (GEOMESA-3246 Upgrade Arrow to 11.0.0)
=======
>>>>>>> 03bab7b5955 (GEOMESA-3254 Add Bloop build support)
=======
>>>>>>> bff2f794202 (GEOMESA-3246 Upgrade Arrow to 11.0.0)
=======
>>>>>>> 026082e8c97 (GEOMESA-3260 Postgis - fix age-off bug (#2958))
=======
>>>>>>> 44792cd3f18 (GEOMESA-3261 Postgis - Fix age-off for non-alpha feature type names)
<<<<<<< HEAD
=======
=======
>>>>>>> c206c9d8073 (GEOMESA-3246 Upgrade Arrow to 11.0.0)
=======
>>>>>>> 427980bdc78 (GEOMESA-3254 Add Bloop build support)
=======
>>>>>>> 5d5e9077ef0 (GEOMESA-3246 Upgrade Arrow to 11.0.0)
=======
>>>>>>> 65da3020383 (GEOMESA-3260 Postgis - fix age-off bug (#2958))
=======
>>>>>>> 6c44e965324 (GEOMESA-3261 Postgis - Fix age-off for non-alpha feature type names)
=======
>>>>>>> e16c7896977 (GEOMESA-3254 Add Bloop build support)
=======
>>>>>>> 46cde254c1e (GEOMESA-3246 Upgrade Arrow to 11.0.0)
<<<<<<< HEAD
=======
>>>>>>> e74fa3f690 (GEOMESA-3254 Add Bloop build support)
>>>>>>> aa583829088 (GEOMESA-3254 Add Bloop build support)
=======
>>>>>>> d18777a94f (GEOMESA-3246 Upgrade Arrow to 11.0.0)
=======
>>>>>>> 3e610250ce (GEOMESA-3254 Add Bloop build support)
=======
>>>>>>> 320759d5d3 (GEOMESA-3246 Upgrade Arrow to 11.0.0)
=======
>>>>>>> 794a6f66c3 (GEOMESA-3261 Postgis - Fix age-off for non-alpha feature type names)
=======
>>>>>>> fa60953a42 (GEOMESA-3254 Add Bloop build support)
<<<<<<< HEAD
<<<<<<< HEAD
<<<<<<< HEAD
<<<<<<< HEAD
<<<<<<< HEAD
>>>>>>> 4ae0f37471e (GEOMESA-3254 Add Bloop build support)
=======
=======
>>>>>>> aa583829088 (GEOMESA-3254 Add Bloop build support)
=======
>>>>>>> c206c9d8073 (GEOMESA-3246 Upgrade Arrow to 11.0.0)
=======
>>>>>>> e16c7896977 (GEOMESA-3254 Add Bloop build support)
=======
>>>>>>> 46cde254c1e (GEOMESA-3246 Upgrade Arrow to 11.0.0)
=======
>>>>>>> 05a1868e90 (GEOMESA-3246 Upgrade Arrow to 11.0.0)
<<<<<<< HEAD
>>>>>>> f5d7da9ec9b (GEOMESA-3246 Upgrade Arrow to 11.0.0)
=======
=======
>>>>>>> 7564665969 (GEOMESA-3254 Add Bloop build support)
<<<<<<< HEAD
>>>>>>> 03bab7b5955 (GEOMESA-3254 Add Bloop build support)
=======
=======
>>>>>>> 6c49bcd685 (GEOMESA-3246 Upgrade Arrow to 11.0.0)
<<<<<<< HEAD
>>>>>>> bff2f794202 (GEOMESA-3246 Upgrade Arrow to 11.0.0)
=======
=======
>>>>>>> 9bd39d5310 (GEOMESA-3260 Postgis - fix age-off bug (#2958))
<<<<<<< HEAD
>>>>>>> 026082e8c97 (GEOMESA-3260 Postgis - fix age-off bug (#2958))
=======
=======
=======
>>>>>>> 794a6f66c3 (GEOMESA-3261 Postgis - Fix age-off for non-alpha feature type names)
>>>>>>> cad359442f (GEOMESA-3261 Postgis - Fix age-off for non-alpha feature type names)
<<<<<<< HEAD
>>>>>>> 44792cd3f18 (GEOMESA-3261 Postgis - Fix age-off for non-alpha feature type names)
=======
=======
>>>>>>> e74fa3f690 (GEOMESA-3254 Add Bloop build support)
<<<<<<< HEAD
>>>>>>> aa583829088 (GEOMESA-3254 Add Bloop build support)
=======
=======
=======
>>>>>>> 05a1868e90 (GEOMESA-3246 Upgrade Arrow to 11.0.0)
>>>>>>> d18777a94f (GEOMESA-3246 Upgrade Arrow to 11.0.0)
<<<<<<< HEAD
>>>>>>> c206c9d8073 (GEOMESA-3246 Upgrade Arrow to 11.0.0)
=======
=======
>>>>>>> 9e49c1aac7 (GEOMESA-3254 Add Bloop build support)
<<<<<<< HEAD
>>>>>>> 427980bdc78 (GEOMESA-3254 Add Bloop build support)
=======
=======
>>>>>>> 630900cfbb (GEOMESA-3246 Upgrade Arrow to 11.0.0)
<<<<<<< HEAD
>>>>>>> 5d5e9077ef0 (GEOMESA-3246 Upgrade Arrow to 11.0.0)
=======
=======
>>>>>>> e54159ef30 (GEOMESA-3260 Postgis - fix age-off bug (#2958))
<<<<<<< HEAD
>>>>>>> 65da3020383 (GEOMESA-3260 Postgis - fix age-off bug (#2958))
=======
=======
=======
>>>>>>> 794a6f66c3 (GEOMESA-3261 Postgis - Fix age-off for non-alpha feature type names)
>>>>>>> 5789b0c84e (GEOMESA-3261 Postgis - Fix age-off for non-alpha feature type names)
<<<<<<< HEAD
>>>>>>> 6c44e965324 (GEOMESA-3261 Postgis - Fix age-off for non-alpha feature type names)
=======
=======
>>>>>>> 3e610250ce (GEOMESA-3254 Add Bloop build support)
<<<<<<< HEAD
>>>>>>> e16c7896977 (GEOMESA-3254 Add Bloop build support)
=======
=======
=======
>>>>>>> 05a1868e90 (GEOMESA-3246 Upgrade Arrow to 11.0.0)
>>>>>>> 320759d5d3 (GEOMESA-3246 Upgrade Arrow to 11.0.0)
>>>>>>> 46cde254c1e (GEOMESA-3246 Upgrade Arrow to 11.0.0)
        foreach(Seq("test", "test-dash")) { name =>
>>>>>>> 7844c8d8dfd (GEOMESA-3254 Add Bloop build support)
          val sft = SimpleFeatureTypes.renameSft(this.sft, name)
          ds.getTypeNames.toSeq must not(contain(sft.getTypeName))
          ds.createSchema(sft)
<<<<<<< HEAD
<<<<<<< HEAD
<<<<<<< HEAD
<<<<<<< HEAD
<<<<<<< HEAD
<<<<<<< HEAD
<<<<<<< HEAD
<<<<<<< HEAD
=======
>>>>>>> fa60953a42 (GEOMESA-3254 Add Bloop build support)
=======
        logger.info(s"Existing type names: ${ds.getTypeNames.mkString(", ")}")
=======
=======
>>>>>>> cad359442f (GEOMESA-3261 Postgis - Fix age-off for non-alpha feature type names)
=======
=======
>>>>>>> fa60953a42 (GEOMESA-3254 Add Bloop build support)
>>>>>>> e74fa3f690 (GEOMESA-3254 Add Bloop build support)
=======
        logger.info(s"Existing type names: ${ds.getTypeNames.mkString(", ")}")
=======
=======
>>>>>>> 5789b0c84e (GEOMESA-3261 Postgis - Fix age-off for non-alpha feature type names)
=======
=======
>>>>>>> fa60953a42 (GEOMESA-3254 Add Bloop build support)
>>>>>>> 3e610250ce (GEOMESA-3254 Add Bloop build support)
=======
        logger.info(s"Existing type names: ${ds.getTypeNames.mkString(", ")}")

<<<<<<< HEAD
<<<<<<< HEAD
<<<<<<< HEAD
<<<<<<< HEAD
<<<<<<< HEAD
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
<<<<<<< HEAD
>>>>>>> 58d14a257e (GEOMESA-3254 Add Bloop build support)
<<<<<<< HEAD
>>>>>>> 9e49c1aac7 (GEOMESA-3254 Add Bloop build support)
=======
=======
        ds.getTypeNames.toSeq must not(contain(sft.getTypeName))
        ds.createSchema(sft)
>>>>>>> 5c8e27c70f (GEOMESA-3260 Postgis - fix age-off bug (#2958))
<<<<<<< HEAD
>>>>>>> e54159ef30 (GEOMESA-3260 Postgis - fix age-off bug (#2958))
=======
=======
>>>>>>> 58d14a257 (GEOMESA-3254 Add Bloop build support)
>>>>>>> fa60953a42 (GEOMESA-3254 Add Bloop build support)
>>>>>>> 3e610250ce (GEOMESA-3254 Add Bloop build support)

<<<<<<< HEAD
<<<<<<< HEAD
<<<<<<< HEAD
<<<<<<< HEAD
<<<<<<< HEAD
<<<<<<< HEAD
<<<<<<< HEAD
<<<<<<< HEAD
<<<<<<< HEAD
<<<<<<< HEAD
<<<<<<< HEAD
<<<<<<< HEAD
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
<<<<<<< HEAD
>>>>>>> 58d14a257e (GEOMESA-3254 Add Bloop build support)
<<<<<<< HEAD
>>>>>>> 7564665969 (GEOMESA-3254 Add Bloop build support)
=======
=======
        ds.getTypeNames.toSeq must not(contain(sft.getTypeName))
        ds.createSchema(sft)
>>>>>>> 5c8e27c70f (GEOMESA-3260 Postgis - fix age-off bug (#2958))
<<<<<<< HEAD
>>>>>>> 9bd39d5310 (GEOMESA-3260 Postgis - fix age-off bug (#2958))
=======
=======
>>>>>>> 58d14a257 (GEOMESA-3254 Add Bloop build support)
>>>>>>> fa60953a42 (GEOMESA-3254 Add Bloop build support)
>>>>>>> e74fa3f690 (GEOMESA-3254 Add Bloop build support)

<<<<<<< HEAD
<<<<<<< HEAD
<<<<<<< HEAD
<<<<<<< HEAD
<<<<<<< HEAD
<<<<<<< HEAD
<<<<<<< HEAD
<<<<<<< HEAD
<<<<<<< HEAD
<<<<<<< HEAD
<<<<<<< HEAD
<<<<<<< HEAD
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
<<<<<<< HEAD
>>>>>>> 58d14a257e (GEOMESA-3254 Add Bloop build support)
=======
        ds.getTypeNames.toSeq must not(contain(sft.getTypeName))
        ds.createSchema(sft)
>>>>>>> 5c8e27c70f (GEOMESA-3260 Postgis - fix age-off bug (#2958))
=======
>>>>>>> 58d14a257 (GEOMESA-3254 Add Bloop build support)
>>>>>>> fa60953a42 (GEOMESA-3254 Add Bloop build support)

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
>>>>>>> 85b4d3f0dc (GEOMESA-3208 Postgis - Fix camel-case feature type names)
=======
>>>>>>> 7542dc78d8 (GEOMESA-3215 Postgis - support List-type attributes)
<<<<<<< HEAD
=======
<<<<<<< HEAD
>>>>>>> 7542dc78d8 (GEOMESA-3215 Postgis - support List-type attributes)
=======
>>>>>>> b7a3bd4175 (GEOMESA-3208 Postgis - Fix camel-case feature type names)
<<<<<<< HEAD
=======
>>>>>>> 7542dc78d8 (GEOMESA-3215 Postgis - support List-type attributes)
=======
>>>>>>> 2eb5450278 (GEOMESA-3208 Postgis - Fix camel-case feature type names)
<<<<<<< HEAD
=======
>>>>>>> a9343b6734 (GEOMESA-3208 Postgis - Fix camel-case feature type names)
=======
>>>>>>> 2912d58b06 (GEOMESA-3215 Postgis - support List-type attributes)
<<<<<<< HEAD
<<<<<<< HEAD
=======
>>>>>>> 495444cdb7 (GEOMESA-3208 Postgis - Fix camel-case feature type names)
=======
>>>>>>> bf9e5cdd91 (GEOMESA-3215 Postgis - support List-type attributes)
=======
>>>>>>> f1532f2313 (GEOMESA-3254 Add Bloop build support)
=======
>>>>>>> fae2cdacf2 (GEOMESA-3208 Postgis - Fix camel-case feature type names)
=======
>>>>>>> 69a6e5986e (GEOMESA-3215 Postgis - support List-type attributes)
=======
>>>>>>> c179d1ac6a (GEOMESA-3208 Postgis - Fix camel-case feature type names)
=======
>>>>>>> 9d3260f1dc (GEOMESA-3215 Postgis - support List-type attributes)
=======
>>>>>>> 5a4c24e020 (GEOMESA-3254 Add Bloop build support)
=======
>>>>>>> 4d7cc37021 (GEOMESA-3208 Postgis - Fix camel-case feature type names)
=======
>>>>>>> 36a7119501 (GEOMESA-3215 Postgis - support List-type attributes)
=======
>>>>>>> d063f807c9 (GEOMESA-3208 Postgis - Fix camel-case feature type names)
=======
>>>>>>> a207fd51c3 (GEOMESA-3215 Postgis - support List-type attributes)
=======
>>>>>>> 7a84c9d22d (GEOMESA-3254 Add Bloop build support)
=======
>>>>>>> 1e4bec1171 (GEOMESA-3208 Postgis - Fix camel-case feature type names)
=======
>>>>>>> 6bd2f89dcd (GEOMESA-3215 Postgis - support List-type attributes)
=======
>>>>>>> c7780c8f6c (GEOMESA-3208 Postgis - Fix camel-case feature type names)
=======
>>>>>>> e7dfbc3fc1 (GEOMESA-3215 Postgis - support List-type attributes)
=======
>>>>>>> b298e017f1 (GEOMESA-3254 Add Bloop build support)
=======
>>>>>>> a9343b6734 (GEOMESA-3208 Postgis - Fix camel-case feature type names)
>>>>>>> ec30c2a23d (GEOMESA-3208 Postgis - Fix camel-case feature type names)
=======
>>>>>>> ec585da266 (GEOMESA-3215 Postgis - support List-type attributes)
=======
=======
>>>>>>> 495444cdb7 (GEOMESA-3208 Postgis - Fix camel-case feature type names)
>>>>>>> 08f61fab09 (GEOMESA-3208 Postgis - Fix camel-case feature type names)
          val schema = Try(ds.getSchema(sft.getTypeName)).getOrElse(null)
          schema must not(beNull)
          schema.getUserData.asScala must containAllOf(sft.getUserData.asScala.toSeq)
          logger.debug(s"Schema: ${SimpleFeatureTypes.encodeType(schema)}")
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
=======
>>>>>>> a9343b6734 (GEOMESA-3208 Postgis - Fix camel-case feature type names)
=======
>>>>>>> 2eb5450278 (GEOMESA-3208 Postgis - Fix camel-case feature type names)
=======
>>>>>>> 7e990c0c62 (GEOMESA-3215 Postgis - support List-type attributes)
=======
>>>>>>> 4d7cc37021 (GEOMESA-3208 Postgis - Fix camel-case feature type names)
=======
>>>>>>> b7a3bd4175 (GEOMESA-3208 Postgis - Fix camel-case feature type names)
=======
>>>>>>> 6de7ca735b (GEOMESA-3215 Postgis - support List-type attributes)
=======
=======
>>>>>>> a9343b6734 (GEOMESA-3208 Postgis - Fix camel-case feature type names)
>>>>>>> ec30c2a23d (GEOMESA-3208 Postgis - Fix camel-case feature type names)
        val userData = Try(ds.getSchema(sft.getTypeName)).map(_.getUserData.asScala).getOrElse(null)
        userData must not(beNull)
        userData must containAllOf(sft.getUserData.asScala.toSeq)
>>>>>>> f639b39b85 (GEOMESA-3208 Postgis - Fix camel-case feature type names)
<<<<<<< HEAD
<<<<<<< HEAD
<<<<<<< HEAD
<<<<<<< HEAD
<<<<<<< HEAD
<<<<<<< HEAD
=======
>>>>>>> ec30c2a23d (GEOMESA-3208 Postgis - Fix camel-case feature type names)
=======
>>>>>>> ec585da266 (GEOMESA-3215 Postgis - support List-type attributes)
=======
=======
>>>>>>> 203dda21b9 (GEOMESA-3208 Postgis - Fix camel-case feature type names)
<<<<<<< HEAD
<<<<<<< HEAD
<<<<<<< HEAD
<<<<<<< HEAD
<<<<<<< HEAD
=======
>>>>>>> bf9e5cdd91 (GEOMESA-3215 Postgis - support List-type attributes)
=======
>>>>>>> a207fd51c3 (GEOMESA-3215 Postgis - support List-type attributes)
=======
>>>>>>> 08f61fab09 (GEOMESA-3208 Postgis - Fix camel-case feature type names)
=======
=======
>>>>>>> ee1d5f207 (GEOMESA-3215 Postgis - support List-type attributes)
>>>>>>> cf1d94c7a8 (GEOMESA-3215 Postgis - support List-type attributes)
<<<<<<< HEAD
<<<<<<< HEAD
<<<<<<< HEAD
<<<<<<< HEAD
=======
>>>>>>> d845d7c1bd (GEOMESA-3254 Add Bloop build support)
=======
<<<<<<< HEAD
<<<<<<< HEAD
=======
>>>>>>> 2912d58b06 (GEOMESA-3215 Postgis - support List-type attributes)
=======
>>>>>>> 495444cdb7 (GEOMESA-3208 Postgis - Fix camel-case feature type names)
=======
>>>>>>> bf9e5cdd91 (GEOMESA-3215 Postgis - support List-type attributes)
=======
=======
>>>>>>> d845d7c1bd (GEOMESA-3254 Add Bloop build support)
>>>>>>> f1532f2313 (GEOMESA-3254 Add Bloop build support)
=======
=======
>>>>>>> 5789b0c84e (GEOMESA-3261 Postgis - Fix age-off for non-alpha feature type names)

<<<<<<< HEAD
<<<<<<< HEAD
>>>>>>> 794a6f66c3 (GEOMESA-3261 Postgis - Fix age-off for non-alpha feature type names)
<<<<<<< HEAD
<<<<<<< HEAD
<<<<<<< HEAD
>>>>>>> cad359442f (GEOMESA-3261 Postgis - Fix age-off for non-alpha feature type names)
=======
=======
>>>>>>> ce17eba7ba (GEOMESA-3208 Postgis - Fix camel-case feature type names)
<<<<<<< HEAD
<<<<<<< HEAD
>>>>>>> fae2cdacf2 (GEOMESA-3208 Postgis - Fix camel-case feature type names)
=======
=======
>>>>>>> afb207dc68 (GEOMESA-3215 Postgis - support List-type attributes)
<<<<<<< HEAD
<<<<<<< HEAD
>>>>>>> 69a6e5986e (GEOMESA-3215 Postgis - support List-type attributes)
=======
=======
>>>>>>> b8e1d54867 (GEOMESA-3208 Postgis - Fix camel-case feature type names)
<<<<<<< HEAD
<<<<<<< HEAD
>>>>>>> c179d1ac6a (GEOMESA-3208 Postgis - Fix camel-case feature type names)
=======
=======
>>>>>>> 1913bc4c2c (GEOMESA-3215 Postgis - support List-type attributes)
<<<<<<< HEAD
<<<<<<< HEAD
>>>>>>> 9d3260f1dc (GEOMESA-3215 Postgis - support List-type attributes)
=======
=======
>>>>>>> 63a045a753 (GEOMESA-3254 Add Bloop build support)
<<<<<<< HEAD
>>>>>>> 5a4c24e020 (GEOMESA-3254 Add Bloop build support)
=======
=======
>>>>>>> 36a7119501 (GEOMESA-3215 Postgis - support List-type attributes)
=======
>>>>>>> d063f807c9 (GEOMESA-3208 Postgis - Fix camel-case feature type names)
=======
>>>>>>> a207fd51c3 (GEOMESA-3215 Postgis - support List-type attributes)
=======
=======
>>>>>>> d845d7c1bd (GEOMESA-3254 Add Bloop build support)
>>>>>>> 7a84c9d22d (GEOMESA-3254 Add Bloop build support)
=======
>>>>>>> 5789b0c84e (GEOMESA-3261 Postgis - Fix age-off for non-alpha feature type names)
=======
=======
>>>>>>> ce17eba7ba (GEOMESA-3208 Postgis - Fix camel-case feature type names)
>>>>>>> 1e4bec1171 (GEOMESA-3208 Postgis - Fix camel-case feature type names)
=======
=======
>>>>>>> afb207dc68 (GEOMESA-3215 Postgis - support List-type attributes)
>>>>>>> 6bd2f89dcd (GEOMESA-3215 Postgis - support List-type attributes)
=======
=======
>>>>>>> b8e1d54867 (GEOMESA-3208 Postgis - Fix camel-case feature type names)
>>>>>>> c7780c8f6c (GEOMESA-3208 Postgis - Fix camel-case feature type names)
=======
=======
>>>>>>> 1913bc4c2c (GEOMESA-3215 Postgis - support List-type attributes)
>>>>>>> e7dfbc3fc1 (GEOMESA-3215 Postgis - support List-type attributes)
=======
=======
>>>>>>> 63a045a753 (GEOMESA-3254 Add Bloop build support)
>>>>>>> b298e017f1 (GEOMESA-3254 Add Bloop build support)
=======
=======
=======
>>>>>>> 2912d58b06 (GEOMESA-3215 Postgis - support List-type attributes)
<<<<<<< HEAD
>>>>>>> ec585da266 (GEOMESA-3215 Postgis - support List-type attributes)
=======
=======
>>>>>>> 495444cdb7 (GEOMESA-3208 Postgis - Fix camel-case feature type names)
>>>>>>> 08f61fab09 (GEOMESA-3208 Postgis - Fix camel-case feature type names)
        val schema = Try(ds.getSchema(sft.getTypeName)).getOrElse(null)
        schema must not(beNull)
        schema.getUserData.asScala must containAllOf(sft.getUserData.asScala.toSeq)
        logger.info(s"Schema: ${SimpleFeatureTypes.encodeType(schema)}")
<<<<<<< HEAD
<<<<<<< HEAD
<<<<<<< HEAD
<<<<<<< HEAD
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
>>>>>>> bf9e5cdd91 (GEOMESA-3215 Postgis - support List-type attributes)
=======
>>>>>>> f1532f2313 (GEOMESA-3254 Add Bloop build support)
=======
>>>>>>> a207fd51c3 (GEOMESA-3215 Postgis - support List-type attributes)
=======
>>>>>>> 7a84c9d22d (GEOMESA-3254 Add Bloop build support)
=======
>>>>>>> ec585da266 (GEOMESA-3215 Postgis - support List-type attributes)
=======
>>>>>>> 08f61fab09 (GEOMESA-3208 Postgis - Fix camel-case feature type names)
>>>>>>> ee1d5f2071 (GEOMESA-3215 Postgis - support List-type attributes)
=======
=======
>>>>>>> cf1d94c7a8 (GEOMESA-3215 Postgis - support List-type attributes)
=======
<<<<<<< HEAD
<<<<<<< HEAD
<<<<<<< HEAD
<<<<<<< HEAD
<<<<<<< HEAD
<<<<<<< HEAD
<<<<<<< HEAD
=======
>>>>>>> 7e990c0c62 (GEOMESA-3215 Postgis - support List-type attributes)
=======
>>>>>>> 6de7ca735b (GEOMESA-3215 Postgis - support List-type attributes)
=======
=======
<<<<<<< HEAD
=======
>>>>>>> ee1d5f207 (GEOMESA-3215 Postgis - support List-type attributes)
>>>>>>> 42af7673bd (GEOMESA-3215 Postgis - support List-type attributes)
>>>>>>> 7542dc78d8 (GEOMESA-3215 Postgis - support List-type attributes)
<<<<<<< HEAD
<<<<<<< HEAD
=======
>>>>>>> 2eb5450278 (GEOMESA-3208 Postgis - Fix camel-case feature type names)
=======
>>>>>>> 7e990c0c62 (GEOMESA-3215 Postgis - support List-type attributes)
=======
>>>>>>> b7a3bd4175 (GEOMESA-3208 Postgis - Fix camel-case feature type names)
=======
>>>>>>> 6de7ca735b (GEOMESA-3215 Postgis - support List-type attributes)
        val schema = Try(ds.getSchema(sft.getTypeName)).getOrElse(null)
        schema must not(beNull)
        schema.getUserData.asScala must containAllOf(sft.getUserData.asScala.toSeq)
<<<<<<< HEAD
        logger.debug(s"Schema: ${SimpleFeatureTypes.encodeType(schema)}")
=======
        logger.info(s"Schema: ${SimpleFeatureTypes.encodeType(schema)}")
<<<<<<< HEAD
<<<<<<< HEAD
<<<<<<< HEAD
<<<<<<< HEAD
<<<<<<< HEAD
=======
>>>>>>> 7e990c0c62 (GEOMESA-3215 Postgis - support List-type attributes)
=======
>>>>>>> 6de7ca735b (GEOMESA-3215 Postgis - support List-type attributes)
>>>>>>> 85b4d3f0dc (GEOMESA-3208 Postgis - Fix camel-case feature type names)
=======
<<<<<<< HEAD
>>>>>>> 7542dc78d8 (GEOMESA-3215 Postgis - support List-type attributes)
=======
<<<<<<< HEAD
<<<<<<< HEAD
<<<<<<< HEAD
=======
>>>>>>> 08f61fab09 (GEOMESA-3208 Postgis - Fix camel-case feature type names)
=======
>>>>>>> ee1d5f2071 (GEOMESA-3215 Postgis - support List-type attributes)
=======
=======
>>>>>>> 495444cdb7 (GEOMESA-3208 Postgis - Fix camel-case feature type names)
<<<<<<< HEAD
=======
>>>>>>> bf9e5cdd91 (GEOMESA-3215 Postgis - support List-type attributes)
=======
>>>>>>> 85b4d3f0dc (GEOMESA-3208 Postgis - Fix camel-case feature type names)
=======
>>>>>>> 2eb5450278 (GEOMESA-3208 Postgis - Fix camel-case feature type names)
=======
>>>>>>> 7e990c0c62 (GEOMESA-3215 Postgis - support List-type attributes)
=======
>>>>>>> ee1d5f2071 (GEOMESA-3215 Postgis - support List-type attributes)
=======
=======
>>>>>>> d063f807c9 (GEOMESA-3208 Postgis - Fix camel-case feature type names)
=======
>>>>>>> a207fd51c3 (GEOMESA-3215 Postgis - support List-type attributes)
=======
>>>>>>> 85b4d3f0dc (GEOMESA-3208 Postgis - Fix camel-case feature type names)
=======
>>>>>>> b7a3bd4175 (GEOMESA-3208 Postgis - Fix camel-case feature type names)
=======
>>>>>>> 6de7ca735b (GEOMESA-3215 Postgis - support List-type attributes)
=======
>>>>>>> 08f61fab09 (GEOMESA-3208 Postgis - Fix camel-case feature type names)
        val userData = Try(ds.getSchema(sft.getTypeName)).map(_.getUserData.asScala).getOrElse(null)
        userData must not(beNull)
        userData must containAllOf(sft.getUserData.asScala.toSeq)
>>>>>>> f639b39b8 (GEOMESA-3208 Postgis - Fix camel-case feature type names)
<<<<<<< HEAD
<<<<<<< HEAD
<<<<<<< HEAD
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
>>>>>>> bf9e5cdd91 (GEOMESA-3215 Postgis - support List-type attributes)
=======
>>>>>>> 2eb5450278 (GEOMESA-3208 Postgis - Fix camel-case feature type names)
=======
>>>>>>> 7e990c0c62 (GEOMESA-3215 Postgis - support List-type attributes)
=======
>>>>>>> a207fd51c3 (GEOMESA-3215 Postgis - support List-type attributes)
=======
>>>>>>> b7a3bd4175 (GEOMESA-3208 Postgis - Fix camel-case feature type names)
=======
>>>>>>> 6de7ca735b (GEOMESA-3215 Postgis - support List-type attributes)
=======
>>>>>>> 08f61fab09 (GEOMESA-3208 Postgis - Fix camel-case feature type names)
>>>>>>> 203dda21b9 (GEOMESA-3208 Postgis - Fix camel-case feature type names)
=======
=======
>>>>>>> ee1d5f207 (GEOMESA-3215 Postgis - support List-type attributes)
>>>>>>> cf1d94c7a8 (GEOMESA-3215 Postgis - support List-type attributes)
<<<<<<< HEAD
<<<<<<< HEAD
<<<<<<< HEAD
<<<<<<< HEAD
=======
>>>>>>> d845d7c1bd (GEOMESA-3254 Add Bloop build support)
=======
<<<<<<< HEAD
<<<<<<< HEAD
<<<<<<< HEAD
<<<<<<< HEAD
=======
>>>>>>> 7542dc78d8 (GEOMESA-3215 Postgis - support List-type attributes)
>>>>>>> 203dda21b (GEOMESA-3208 Postgis - Fix camel-case feature type names)
<<<<<<< HEAD
>>>>>>> 48c6002574 (GEOMESA-3208 Postgis - Fix camel-case feature type names)
<<<<<<< HEAD
>>>>>>> 85b4d3f0dc (GEOMESA-3208 Postgis - Fix camel-case feature type names)
=======
=======
=======
=======
>>>>>>> ee1d5f207 (GEOMESA-3215 Postgis - support List-type attributes)
>>>>>>> cf1d94c7a (GEOMESA-3215 Postgis - support List-type attributes)
>>>>>>> 42af7673bd (GEOMESA-3215 Postgis - support List-type attributes)
>>>>>>> 7542dc78d8 (GEOMESA-3215 Postgis - support List-type attributes)
=======
>>>>>>> a9343b6734 (GEOMESA-3208 Postgis - Fix camel-case feature type names)
<<<<<<< HEAD
<<<<<<< HEAD
=======
>>>>>>> ee1d5f2071 (GEOMESA-3215 Postgis - support List-type attributes)
>>>>>>> 2912d58b06 (GEOMESA-3215 Postgis - support List-type attributes)
=======
>>>>>>> 203dda21b9 (GEOMESA-3208 Postgis - Fix camel-case feature type names)
>>>>>>> 495444cdb7 (GEOMESA-3208 Postgis - Fix camel-case feature type names)
<<<<<<< HEAD
=======
>>>>>>> bf9e5cdd91 (GEOMESA-3215 Postgis - support List-type attributes)
=======
=======
>>>>>>> d845d7c1bd (GEOMESA-3254 Add Bloop build support)
>>>>>>> f1532f2313 (GEOMESA-3254 Add Bloop build support)
=======
=======
=======
>>>>>>> 7542dc78d8 (GEOMESA-3215 Postgis - support List-type attributes)
>>>>>>> 7e990c0c62 (GEOMESA-3215 Postgis - support List-type attributes)
>>>>>>> 203dda21b (GEOMESA-3208 Postgis - Fix camel-case feature type names)
<<<<<<< HEAD
>>>>>>> 48c6002574 (GEOMESA-3208 Postgis - Fix camel-case feature type names)
<<<<<<< HEAD
>>>>>>> 85b4d3f0dc (GEOMESA-3208 Postgis - Fix camel-case feature type names)
<<<<<<< HEAD
>>>>>>> 2eb5450278 (GEOMESA-3208 Postgis - Fix camel-case feature type names)
=======
=======
=======
=======
=======
>>>>>>> ee1d5f207 (GEOMESA-3215 Postgis - support List-type attributes)
>>>>>>> cf1d94c7a (GEOMESA-3215 Postgis - support List-type attributes)
>>>>>>> 42af7673bd (GEOMESA-3215 Postgis - support List-type attributes)
>>>>>>> 7542dc78d8 (GEOMESA-3215 Postgis - support List-type attributes)
>>>>>>> 7e990c0c62 (GEOMESA-3215 Postgis - support List-type attributes)
=======
>>>>>>> 4d7cc37021 (GEOMESA-3208 Postgis - Fix camel-case feature type names)
=======
>>>>>>> ee1d5f2071 (GEOMESA-3215 Postgis - support List-type attributes)
>>>>>>> 36a7119501 (GEOMESA-3215 Postgis - support List-type attributes)
=======
>>>>>>> 203dda21b9 (GEOMESA-3208 Postgis - Fix camel-case feature type names)
>>>>>>> d063f807c9 (GEOMESA-3208 Postgis - Fix camel-case feature type names)
=======
>>>>>>> a207fd51c3 (GEOMESA-3215 Postgis - support List-type attributes)
=======
=======
>>>>>>> d845d7c1bd (GEOMESA-3254 Add Bloop build support)
>>>>>>> 7a84c9d22d (GEOMESA-3254 Add Bloop build support)
=======
=======
=======
>>>>>>> 7542dc78d8 (GEOMESA-3215 Postgis - support List-type attributes)
>>>>>>> 6de7ca735b (GEOMESA-3215 Postgis - support List-type attributes)
>>>>>>> 203dda21b (GEOMESA-3208 Postgis - Fix camel-case feature type names)
<<<<<<< HEAD
>>>>>>> 48c6002574 (GEOMESA-3208 Postgis - Fix camel-case feature type names)
<<<<<<< HEAD
>>>>>>> 85b4d3f0dc (GEOMESA-3208 Postgis - Fix camel-case feature type names)
<<<<<<< HEAD
>>>>>>> b7a3bd4175 (GEOMESA-3208 Postgis - Fix camel-case feature type names)
=======
=======
=======
=======
=======
>>>>>>> ee1d5f207 (GEOMESA-3215 Postgis - support List-type attributes)
>>>>>>> cf1d94c7a (GEOMESA-3215 Postgis - support List-type attributes)
>>>>>>> 42af7673bd (GEOMESA-3215 Postgis - support List-type attributes)
>>>>>>> 7542dc78d8 (GEOMESA-3215 Postgis - support List-type attributes)
>>>>>>> 6de7ca735b (GEOMESA-3215 Postgis - support List-type attributes)
=======
>>>>>>> ec30c2a23d (GEOMESA-3208 Postgis - Fix camel-case feature type names)
=======
=======
>>>>>>> ee1d5f2071 (GEOMESA-3215 Postgis - support List-type attributes)
>>>>>>> 2912d58b06 (GEOMESA-3215 Postgis - support List-type attributes)
>>>>>>> ec585da266 (GEOMESA-3215 Postgis - support List-type attributes)
=======
>>>>>>> 08f61fab09 (GEOMESA-3208 Postgis - Fix camel-case feature type names)

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
<<<<<<< HEAD
<<<<<<< HEAD
<<<<<<< HEAD
<<<<<<< HEAD
<<<<<<< HEAD
<<<<<<< HEAD
=======
>>>>>>> f30e218074 (GEOMESA-3217,GEOMESA-3216 Support Postgis json attributes, top-level arrays in json)
                next.setAttribute("props", s"""["name$i"]""")
=======
>>>>>>> 2912d58b06 (GEOMESA-3215 Postgis - support List-type attributes)
=======
                next.setAttribute("props", s"""["name$i"]""")
>>>>>>> b597cf01b8 (GEOMESA-3217,GEOMESA-3216 Support Postgis json attributes, top-level arrays in json)
<<<<<<< HEAD
=======
>>>>>>> 36a7119501 (GEOMESA-3215 Postgis - support List-type attributes)
=======
                next.setAttribute("props", s"""["name$i"]""")
>>>>>>> f8a4dfe0b3 (GEOMESA-3217,GEOMESA-3216 Support Postgis json attributes, top-level arrays in json)
=======
                next.setAttribute("props", s"""["name$i"]""")
=======
>>>>>>> 2912d58b06 (GEOMESA-3215 Postgis - support List-type attributes)
>>>>>>> ec585da266 (GEOMESA-3215 Postgis - support List-type attributes)
=======
>>>>>>> f30e218074 (GEOMESA-3217,GEOMESA-3216 Support Postgis json attributes, top-level arrays in json)
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
<<<<<<< HEAD
<<<<<<< HEAD
<<<<<<< HEAD
<<<<<<< HEAD
<<<<<<< HEAD
<<<<<<< HEAD
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
=======
=======
>>>>>>> bf9e5cdd91 (GEOMESA-3215 Postgis - support List-type attributes)
=======
>>>>>>> f1532f2313 (GEOMESA-3254 Add Bloop build support)
=======
>>>>>>> 7564665969 (GEOMESA-3254 Add Bloop build support)
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
=======
=======
>>>>>>> a207fd51c3 (GEOMESA-3215 Postgis - support List-type attributes)
=======
>>>>>>> 7a84c9d22d (GEOMESA-3254 Add Bloop build support)
=======
>>>>>>> 9e49c1aac7 (GEOMESA-3254 Add Bloop build support)
=======
>>>>>>> ec585da266 (GEOMESA-3215 Postgis - support List-type attributes)
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
=======
              logger.info(reader.next.toString)
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
>>>>>>> 2912d58b06 (GEOMESA-3215 Postgis - support List-type attributes)
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
>>>>>>> 36a7119501 (GEOMESA-3215 Postgis - support List-type attributes)
          }
        }
<<<<<<< HEAD

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
>>>>>>> 2912d58b06 (GEOMESA-3215 Postgis - support List-type attributes)
          }
        }
<<<<<<< HEAD

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
=======
>>>>>>> 7e990c0c62 (GEOMESA-3215 Postgis - support List-type attributes)
=======
>>>>>>> 6de7ca735b (GEOMESA-3215 Postgis - support List-type attributes)
<<<<<<< HEAD
=======

        WithClose(ds.getFeatureReader(new Query(sft.getTypeName), Transaction.AUTO_COMMIT)) { reader =>
          reader.hasNext must beFalse
        }

<<<<<<< HEAD
        ds.removeSchema(sft.getTypeName)
=======
        if (methods.query) {
          WithClose(ds.getFeatureReader(new Query(sft.getTypeName), Transaction.AUTO_COMMIT)) { reader =>
            while (reader.hasNext) {
<<<<<<< HEAD
              logger.info(DataUtilities.encodeFeature(reader.next))
=======
              logger.info(reader.next.toString)
>>>>>>> ee1d5f207 (GEOMESA-3215 Postgis - support List-type attributes)
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
          }
        }

        if (methods.remove) {
          ds.removeSchema(sft.getTypeName)
        }
>>>>>>> cf1d94c7a (GEOMESA-3215 Postgis - support List-type attributes)
>>>>>>> 42af7673bd (GEOMESA-3215 Postgis - support List-type attributes)
      } catch {
        case NonFatal(e) => logger.error("", e); ko
      } finally {
        ds.dispose()
      }
    }

    "filter on list elements" in {
      val ds = DataStoreFinder.getDataStore(params.asJava)
      ds must not(beNull)

      try {
        ds must beAnInstanceOf[JDBCDataStore]

        val sft = SimpleFeatureTypes.renameSft(this.sft, "list-filters")
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

        val filters = Seq(
          fif.equals(fif.property("name"), fif.literal("name0")),
          fif.equal(fif.property("name"), fif.literal("name0"), false, MatchAction.ANY),
          fif.equals(fif.property("name"), fif.literal(Collections.singletonList("name0"))),
          fif.equal(fif.property("name"), fif.literal(Collections.singletonList("name0")), false, MatchAction.ANY),
          fif.equal(fif.property("name"), fif.literal(java.util.List.of("name0", "alt0")), false, MatchAction.ANY),
          fif.equal(fif.property("name"), fif.literal(java.util.List.of("name0", "alt0")), false, MatchAction.ALL),
          ECQL.toFilter("name = 'name0'"),
        )
        foreach(filters) { filter =>
          WithClose(ds.getFeatureReader(new Query(sft.getTypeName, filter), Transaction.AUTO_COMMIT)) { reader =>
            val result = SelfClosingIterator(reader).toList
            result must haveLength(1)
            compFromDb(result.head) mustEqual compWithFid(features.head, sft)
          }
        }

        val nonMatchingFilters = Seq(
          fif.equal(fif.property("name"), fif.literal("name0"), false, MatchAction.ALL),
          fif.equal(fif.property("name"), fif.literal(Collections.singletonList("name0")), false, MatchAction.ALL),
        )
        foreach(nonMatchingFilters) { filter =>
          WithClose(ds.getFeatureReader(new Query(sft.getTypeName, filter), Transaction.AUTO_COMMIT)) { reader =>
            val result = SelfClosingIterator(reader).toList
            result must beEmpty
          }
        }
      } finally {
        ds.dispose()
      }
    }

<<<<<<< HEAD
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
=======
<<<<<<< HEAD
  step {
    if (container != null) {
      container.stop()
>>>>>>> 42af7673bd (GEOMESA-3215 Postgis - support List-type attributes)
<<<<<<< HEAD
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

=======

<<<<<<< HEAD
<<<<<<< HEAD
>>>>>>> 794a6f66c3 (GEOMESA-3261 Postgis - Fix age-off for non-alpha feature type names)
=======
>>>>>>> ce17eba7ba (GEOMESA-3208 Postgis - Fix camel-case feature type names)
=======
>>>>>>> afb207dc68 (GEOMESA-3215 Postgis - support List-type attributes)
=======
>>>>>>> b8e1d54867 (GEOMESA-3208 Postgis - Fix camel-case feature type names)
=======
>>>>>>> 1913bc4c2c (GEOMESA-3215 Postgis - support List-type attributes)
=======
>>>>>>> 63a045a753 (GEOMESA-3254 Add Bloop build support)
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
=======
>>>>>>> 6de7ca735b (GEOMESA-3215 Postgis - support List-type attributes)
    }

    "support query interceptors" in {
      val sft = SimpleFeatureTypes.renameSft(this.sft, "interceptor")
      sft.getUserData.put(SimpleFeatureTypes.Configs.QueryInterceptors, classOf[TestQueryInterceptor].getName)

      val ds = DataStoreFinder.getDataStore(params.asJava)
      ds must not(beNull)

      try {
        ds must beAnInstanceOf[JDBCDataStore]

        ds.getTypeNames.toSeq must not(contain(sft.getTypeName))
        ds.createSchema(sft)

        val schema = Try(ds.getSchema(sft.getTypeName)).getOrElse(null)
        schema must not(beNull)
        schema.getUserData.asScala must containAllOf(sft.getUserData.asScala.toSeq)
        logger.debug(s"Schema: ${SimpleFeatureTypes.encodeType(schema)}")

        val Array(left, right) = ds.asInstanceOf[JDBCDataStore].getSQLDialect.splitFilter(Filter.EXCLUDE, schema)
        left mustEqual Filter.INCLUDE
        right mustEqual Filter.INCLUDE

        // write some data
        WithClose(new DefaultTransaction()) { tx =>
          WithClose(ds.getFeatureWriterAppend(sft.getTypeName, tx)) { writer =>
            features.foreach { feature =>
              FeatureUtils.write(writer, feature, useProvidedFid = true)
            }
          }
          tx.commit()
        }

        // verify that filter is re-written to be Filter.INCLUDE
        WithClose(ds.getFeatureReader(new Query(sft.getTypeName, ECQL.toFilter("IN('1')")), Transaction.AUTO_COMMIT)) { reader =>
          val result = SelfClosingIterator(reader).toList
          result.map(compFromDb) must containTheSameElementsAs(features.map(compWithFid(_, sft)))
        }
      } finally {
        ds.dispose()
      }
    }

    "support idle_in_transaction_session_timeout" in {
      val sft = SimpleFeatureTypes.renameSft(this.sft, "timeout")

      val ds = DataStoreFinder.getDataStore((params ++ Map("idle_in_transaction_session_timeout" -> "500ms", "fetch size" -> 1)).asJava)
      ds must not(beNull)

      try {
        ds must beAnInstanceOf[JDBCDataStore]

        ds.getTypeNames.toSeq must not(contain(sft.getTypeName))
=======
        ds.getTypeNames must beEmpty
>>>>>>> a928f2f739 (GEOMESA-3246 Upgrade Arrow to 11.0.0)
        ds.createSchema(sft)

<<<<<<< HEAD
<<<<<<< HEAD
<<<<<<< HEAD
<<<<<<< HEAD
=======
>>>>>>> ee1d5f207 (GEOMESA-3215 Postgis - support List-type attributes)
=======
>>>>>>> 25cedeff6a (GEOMESA-3208 Postgis - Fix camel-case feature type names)
=======
=======
>>>>>>> ee1d5f207 (GEOMESA-3215 Postgis - support List-type attributes)
>>>>>>> 4b7c48b509 (GEOMESA-3215 Postgis - support List-type attributes)
        val schema = Try(ds.getSchema(sft.getTypeName)).getOrElse(null)
        schema must not(beNull)
        schema.getUserData.asScala must containAllOf(sft.getUserData.asScala.toSeq)
<<<<<<< HEAD
        logger.debug(s"Schema: ${SimpleFeatureTypes.encodeType(schema)}")
=======
        logger.info(s"Schema: ${SimpleFeatureTypes.encodeType(schema)}")
<<<<<<< HEAD
<<<<<<< HEAD
<<<<<<< HEAD
=======
=======
>>>>>>> f9969bc4e9 (GEOMESA-3208 Postgis - Fix camel-case feature type names)
=======
>>>>>>> 3a1e1d7213 (GEOMESA-3215 Postgis - support List-type attributes)
=======
>>>>>>> 09d87762c5 (GEOMESA-3254 Add Bloop build support)
          val schema = Try(ds.getSchema(sft.getTypeName)).getOrElse(null)
          schema must not(beNull)
          schema.getUserData.asScala must containAllOf(sft.getUserData.asScala.toSeq)
          logger.debug(s"Schema: ${SimpleFeatureTypes.encodeType(schema)}")
>>>>>>> 47f8de1bb (GEOMESA-3215 Postgis - support List-type attributes)
=======
=======
>>>>>>> ee1d5f207 (GEOMESA-3215 Postgis - support List-type attributes)
=======
>>>>>>> d845d7c1b (GEOMESA-3254 Add Bloop build support)
        val schema = Try(ds.getSchema(sft.getTypeName)).getOrElse(null)
        schema must not(beNull)
        schema.getUserData.asScala must containAllOf(sft.getUserData.asScala.toSeq)
        logger.info(s"Schema: ${SimpleFeatureTypes.encodeType(schema)}")
<<<<<<< HEAD
<<<<<<< HEAD
>>>>>>> cf1d94c7a (GEOMESA-3215 Postgis - support List-type attributes)
=======
=======
>>>>>>> f9969bc4e9 (GEOMESA-3208 Postgis - Fix camel-case feature type names)
=======
>>>>>>> 3a1e1d7213 (GEOMESA-3215 Postgis - support List-type attributes)
=======
>>>>>>> 09d87762c5 (GEOMESA-3254 Add Bloop build support)
          val schema = Try(ds.getSchema(sft.getTypeName)).getOrElse(null)
          schema must not(beNull)
          schema.getUserData.asScala must containAllOf(sft.getUserData.asScala.toSeq)
          logger.debug(s"Schema: ${SimpleFeatureTypes.encodeType(schema)}")
>>>>>>> 47f8de1bb (GEOMESA-3215 Postgis - support List-type attributes)
=======
=======
>>>>>>> ee1d5f207 (GEOMESA-3215 Postgis - support List-type attributes)
=======
>>>>>>> d845d7c1b (GEOMESA-3254 Add Bloop build support)
        val schema = Try(ds.getSchema(sft.getTypeName)).getOrElse(null)
        schema must not(beNull)
        schema.getUserData.asScala must containAllOf(sft.getUserData.asScala.toSeq)
        logger.info(s"Schema: ${SimpleFeatureTypes.encodeType(schema)}")
<<<<<<< HEAD
<<<<<<< HEAD
>>>>>>> cf1d94c7a (GEOMESA-3215 Postgis - support List-type attributes)
=======
        val userData = Try(ds.getSchema(sft.getTypeName)).map(_.getUserData.asScala).getOrElse(null)
        userData must not(beNull)
        userData must containAllOf(sft.getUserData.asScala.toSeq)
>>>>>>> f639b39b8 (GEOMESA-3208 Postgis - Fix camel-case feature type names)
<<<<<<< HEAD
<<<<<<< HEAD
>>>>>>> 203dda21b (GEOMESA-3208 Postgis - Fix camel-case feature type names)
=======
=======
>>>>>>> ee1d5f207 (GEOMESA-3215 Postgis - support List-type attributes)
>>>>>>> cf1d94c7a (GEOMESA-3215 Postgis - support List-type attributes)
<<<<<<< HEAD
=======
>>>>>>> locationtech-main
=======
=======
>>>>>>> a91558bd4 (GEOMESA-3208 Postgis - Fix camel-case feature type names)
          val schema = Try(ds.getSchema(sft.getTypeName)).getOrElse(null)
          schema must not(beNull)
          schema.getUserData.asScala must containAllOf(sft.getUserData.asScala.toSeq)
          logger.debug(s"Schema: ${SimpleFeatureTypes.encodeType(schema)}")
<<<<<<< HEAD
>>>>>>> c3367776f (GEOMESA-3261 Postgis - Fix age-off for non-alpha feature type names)
<<<<<<< HEAD
>>>>>>> 794a6f66c3 (GEOMESA-3261 Postgis - Fix age-off for non-alpha feature type names)
=======
=======
=======
        val userData = Try(ds.getSchema(sft.getTypeName)).map(_.getUserData.asScala).getOrElse(null)
        userData must not(beNull)
        userData must containAllOf(sft.getUserData.asScala.toSeq)
>>>>>>> f639b39b8 (GEOMESA-3208 Postgis - Fix camel-case feature type names)
>>>>>>> a91558bd4 (GEOMESA-3208 Postgis - Fix camel-case feature type names)
<<<<<<< HEAD
<<<<<<< HEAD
<<<<<<< HEAD
=======
>>>>>>> 6bd2f89dcd (GEOMESA-3215 Postgis - support List-type attributes)
>>>>>>> ce17eba7ba (GEOMESA-3208 Postgis - Fix camel-case feature type names)
=======
=======
=======
<<<<<<< HEAD
<<<<<<< HEAD
<<<<<<< HEAD
<<<<<<< HEAD
=======
>>>>>>> e7dfbc3fc1 (GEOMESA-3215 Postgis - support List-type attributes)
=======
>>>>>>> 203dda21b (GEOMESA-3208 Postgis - Fix camel-case feature type names)
=======
>>>>>>> 6bd2f89dcd (GEOMESA-3215 Postgis - support List-type attributes)
=======
=======
>>>>>>> 203dda21b (GEOMESA-3208 Postgis - Fix camel-case feature type names)
>>>>>>> c7780c8f6c (GEOMESA-3208 Postgis - Fix camel-case feature type names)
        val schema = Try(ds.getSchema(sft.getTypeName)).getOrElse(null)
        schema must not(beNull)
        schema.getUserData.asScala must containAllOf(sft.getUserData.asScala.toSeq)
        logger.info(s"Schema: ${SimpleFeatureTypes.encodeType(schema)}")
<<<<<<< HEAD
<<<<<<< HEAD
<<<<<<< HEAD
>>>>>>> ee1d5f207 (GEOMESA-3215 Postgis - support List-type attributes)
<<<<<<< HEAD
>>>>>>> 47f8de1bb (GEOMESA-3215 Postgis - support List-type attributes)
<<<<<<< HEAD
>>>>>>> afb207dc68 (GEOMESA-3215 Postgis - support List-type attributes)
=======
=======
=======
=======
>>>>>>> 25cedeff6a (GEOMESA-3208 Postgis - Fix camel-case feature type names)
=======
>>>>>>> 4b7c48b509 (GEOMESA-3215 Postgis - support List-type attributes)
=======
        val userData = Try(ds.getSchema(sft.getTypeName)).map(_.getUserData.asScala).getOrElse(null)
        userData must not(beNull)
        userData must containAllOf(sft.getUserData.asScala.toSeq)
>>>>>>> f639b39b8 (GEOMESA-3208 Postgis - Fix camel-case feature type names)
<<<<<<< HEAD
>>>>>>> 203dda21b (GEOMESA-3208 Postgis - Fix camel-case feature type names)
<<<<<<< HEAD
<<<<<<< HEAD
<<<<<<< HEAD
>>>>>>> f9969bc4e9 (GEOMESA-3208 Postgis - Fix camel-case feature type names)
<<<<<<< HEAD
>>>>>>> b8e1d54867 (GEOMESA-3208 Postgis - Fix camel-case feature type names)
=======
=======
>>>>>>> 4b7c48b509 (GEOMESA-3215 Postgis - support List-type attributes)
=======
=======
>>>>>>> ee1d5f207 (GEOMESA-3215 Postgis - support List-type attributes)
>>>>>>> cf1d94c7a (GEOMESA-3215 Postgis - support List-type attributes)
<<<<<<< HEAD
<<<<<<< HEAD
>>>>>>> 3a1e1d7213 (GEOMESA-3215 Postgis - support List-type attributes)
<<<<<<< HEAD
>>>>>>> 1913bc4c2c (GEOMESA-3215 Postgis - support List-type attributes)
=======
=======
=======
>>>>>>> d845d7c1b (GEOMESA-3254 Add Bloop build support)
>>>>>>> 09d87762c5 (GEOMESA-3254 Add Bloop build support)
>>>>>>> 63a045a753 (GEOMESA-3254 Add Bloop build support)
=======
>>>>>>> 25cedeff6a (GEOMESA-3208 Postgis - Fix camel-case feature type names)
=======
>>>>>>> 4b7c48b509 (GEOMESA-3215 Postgis - support List-type attributes)
=======
>>>>>>> ce17eba7ba (GEOMESA-3208 Postgis - Fix camel-case feature type names)
>>>>>>> 1e4bec1171 (GEOMESA-3208 Postgis - Fix camel-case feature type names)
=======
=======
>>>>>>> c7780c8f6c (GEOMESA-3208 Postgis - Fix camel-case feature type names)
>>>>>>> ee1d5f207 (GEOMESA-3215 Postgis - support List-type attributes)
<<<<<<< HEAD
>>>>>>> 47f8de1bb (GEOMESA-3215 Postgis - support List-type attributes)
<<<<<<< HEAD
>>>>>>> afb207dc68 (GEOMESA-3215 Postgis - support List-type attributes)
<<<<<<< HEAD
>>>>>>> 6bd2f89dcd (GEOMESA-3215 Postgis - support List-type attributes)
=======
=======
=======
=======
=======
        val userData = Try(ds.getSchema(sft.getTypeName)).map(_.getUserData.asScala).getOrElse(null)
        userData must not(beNull)
        userData must containAllOf(sft.getUserData.asScala.toSeq)
>>>>>>> f639b39b8 (GEOMESA-3208 Postgis - Fix camel-case feature type names)
>>>>>>> 203dda21b (GEOMESA-3208 Postgis - Fix camel-case feature type names)
<<<<<<< HEAD
>>>>>>> f9969bc4e9 (GEOMESA-3208 Postgis - Fix camel-case feature type names)
<<<<<<< HEAD
>>>>>>> b8e1d54867 (GEOMESA-3208 Postgis - Fix camel-case feature type names)
<<<<<<< HEAD
>>>>>>> c7780c8f6c (GEOMESA-3208 Postgis - Fix camel-case feature type names)
=======
=======
=======
=======
>>>>>>> ee1d5f207 (GEOMESA-3215 Postgis - support List-type attributes)
>>>>>>> cf1d94c7a (GEOMESA-3215 Postgis - support List-type attributes)
>>>>>>> 3a1e1d7213 (GEOMESA-3215 Postgis - support List-type attributes)
>>>>>>> 1913bc4c2c (GEOMESA-3215 Postgis - support List-type attributes)
>>>>>>> e7dfbc3fc1 (GEOMESA-3215 Postgis - support List-type attributes)

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
<<<<<<< HEAD
<<<<<<< HEAD
                next.setAttribute("props", s"""["name$i"]""")
=======
>>>>>>> 6bd2f89dcd (GEOMESA-3215 Postgis - support List-type attributes)
=======
                next.setAttribute("props", s"""["name$i"]""")
>>>>>>> b4dbc3c8cf (GEOMESA-3217,GEOMESA-3216 Support Postgis json attributes, top-level arrays in json)
                next.setAttribute("dtg", new java.util.Date(now - (i * 20 * 60 * 1000))) // 20 minutes
                next.setAttribute("geom", WKTUtils.read(s"POINT(0 $i)"))
                next.getUserData.put(Hints.USE_PROVIDED_FID, java.lang.Boolean.TRUE)
                next.getIdentifier.asInstanceOf[FeatureIdImpl].setID(s"fid$i")
                writer.write()
>>>>>>> ee1d5f207 (GEOMESA-3215 Postgis - support List-type attributes)
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
>>>>>>> 58d14a257 (GEOMESA-3254 Add Bloop build support)
            }
          }

<<<<<<< HEAD
<<<<<<< HEAD
<<<<<<< HEAD
<<<<<<< HEAD
<<<<<<< HEAD
<<<<<<< HEAD
=======
>>>>>>> 6c49bcd685 (GEOMESA-3246 Upgrade Arrow to 11.0.0)
=======
>>>>>>> 6bd2f89dcd (GEOMESA-3215 Postgis - support List-type attributes)
        // verify that statements will timeout and return an error
        WithClose(ds.getFeatureReader(new Query(sft.getTypeName), Transaction.AUTO_COMMIT)) { reader =>
          reader.hasNext must beTrue
          reader.next must not(beNull)
          Thread.sleep(600)
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

=======
        def compFromDb(sf: SimpleFeature): Seq[Any] = Seq(sf.getID) ++ sf.getAttributes.asScala.map {
          // even though Timestamp extends Date, equals comparison doesn't work between the 2
          case t: java.sql.Timestamp => new java.util.Date(t.getTime)
          case a => a
        }
        // note: jdbc data store adds the type name into the fid, so we add it here for the comparison
        def compWithFid(sf: SimpleFeature): Seq[Any] = Seq(s"${sft.getTypeName}.${sf.getID}") ++ sf.getAttributes.asScala

<<<<<<< HEAD
=======
>>>>>>> 5c8e27c70f (GEOMESA-3260 Postgis - fix age-off bug (#2958))
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
          WithClose(ds.getFeatureReader(new Query(sft.getTypeName), Transaction.AUTO_COMMIT)) { reader =>
            reader.hasNext must beFalse
>>>>>>> 794a6f66c3 (GEOMESA-3261 Postgis - Fix age-off for non-alpha feature type names)
=======
          WithClose(ds.getFeatureReader(new Query(sft.getTypeName), Transaction.AUTO_COMMIT)) { reader =>
            reader.hasNext must beFalse
=======
        if (methods.query) {
          WithClose(ds.getFeatureReader(new Query(sft.getTypeName), Transaction.AUTO_COMMIT)) { reader =>
            while (reader.hasNext) {
<<<<<<< HEAD
<<<<<<< HEAD
<<<<<<< HEAD
<<<<<<< HEAD
<<<<<<< HEAD
=======
>>>>>>> e7dfbc3fc1 (GEOMESA-3215 Postgis - support List-type attributes)
              logger.info(reader.next.toString)
=======
<<<<<<< HEAD
              logger.info(DataUtilities.encodeFeature(reader.next))
=======
              logger.info(reader.next.toString)
>>>>>>> ee1d5f207 (GEOMESA-3215 Postgis - support List-type attributes)
>>>>>>> cf1d94c7a (GEOMESA-3215 Postgis - support List-type attributes)
<<<<<<< HEAD
=======
              logger.info(DataUtilities.encodeFeature(reader.next))
>>>>>>> d845d7c1b (GEOMESA-3254 Add Bloop build support)
=======
              logger.info(DataUtilities.encodeFeature(reader.next))
>>>>>>> 58d14a257 (GEOMESA-3254 Add Bloop build support)
=======
              logger.info(reader.next.toString)
>>>>>>> 6bd2f89dcd (GEOMESA-3215 Postgis - support List-type attributes)
=======
>>>>>>> e7dfbc3fc1 (GEOMESA-3215 Postgis - support List-type attributes)
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
>>>>>>> ee1d5f207 (GEOMESA-3215 Postgis - support List-type attributes)
>>>>>>> afb207dc68 (GEOMESA-3215 Postgis - support List-type attributes)
          }
        }
<<<<<<< HEAD
<<<<<<< HEAD
=======
=======
        ds.getTypeNames must beEmpty
        ds.createSchema(sft)

<<<<<<< HEAD
<<<<<<< HEAD
=======
>>>>>>> ee1d5f207 (GEOMESA-3215 Postgis - support List-type attributes)
        val schema = Try(ds.getSchema(sft.getTypeName)).getOrElse(null)
        schema must not(beNull)
        schema.getUserData.asScala must containAllOf(sft.getUserData.asScala.toSeq)
<<<<<<< HEAD
        logger.debug(s"Schema: ${SimpleFeatureTypes.encodeType(schema)}")
=======
        logger.info(s"Schema: ${SimpleFeatureTypes.encodeType(schema)}")
<<<<<<< HEAD
=======
=======
>>>>>>> f9969bc4e9 (GEOMESA-3208 Postgis - Fix camel-case feature type names)
=======
>>>>>>> 3a1e1d7213 (GEOMESA-3215 Postgis - support List-type attributes)
=======
>>>>>>> 09d87762c5 (GEOMESA-3254 Add Bloop build support)
          val schema = Try(ds.getSchema(sft.getTypeName)).getOrElse(null)
          schema must not(beNull)
          schema.getUserData.asScala must containAllOf(sft.getUserData.asScala.toSeq)
          logger.debug(s"Schema: ${SimpleFeatureTypes.encodeType(schema)}")
>>>>>>> 47f8de1bb (GEOMESA-3215 Postgis - support List-type attributes)
=======
=======
>>>>>>> ee1d5f207 (GEOMESA-3215 Postgis - support List-type attributes)
=======
>>>>>>> d845d7c1b (GEOMESA-3254 Add Bloop build support)
        val schema = Try(ds.getSchema(sft.getTypeName)).getOrElse(null)
        schema must not(beNull)
        schema.getUserData.asScala must containAllOf(sft.getUserData.asScala.toSeq)
        logger.info(s"Schema: ${SimpleFeatureTypes.encodeType(schema)}")
<<<<<<< HEAD
<<<<<<< HEAD
>>>>>>> cf1d94c7a (GEOMESA-3215 Postgis - support List-type attributes)
=======
        val userData = Try(ds.getSchema(sft.getTypeName)).map(_.getUserData.asScala).getOrElse(null)
        userData must not(beNull)
        userData must containAllOf(sft.getUserData.asScala.toSeq)
>>>>>>> f639b39b8 (GEOMESA-3208 Postgis - Fix camel-case feature type names)
<<<<<<< HEAD
<<<<<<< HEAD
>>>>>>> 203dda21b (GEOMESA-3208 Postgis - Fix camel-case feature type names)
=======
=======
>>>>>>> ee1d5f207 (GEOMESA-3215 Postgis - support List-type attributes)
>>>>>>> cf1d94c7a (GEOMESA-3215 Postgis - support List-type attributes)
<<<<<<< HEAD
=======
>>>>>>> locationtech-main
=======
=======
>>>>>>> a91558bd4 (GEOMESA-3208 Postgis - Fix camel-case feature type names)
          val schema = Try(ds.getSchema(sft.getTypeName)).getOrElse(null)
          schema must not(beNull)
          schema.getUserData.asScala must containAllOf(sft.getUserData.asScala.toSeq)
          logger.debug(s"Schema: ${SimpleFeatureTypes.encodeType(schema)}")
<<<<<<< HEAD
>>>>>>> c3367776f (GEOMESA-3261 Postgis - Fix age-off for non-alpha feature type names)
<<<<<<< HEAD
>>>>>>> 794a6f66c3 (GEOMESA-3261 Postgis - Fix age-off for non-alpha feature type names)
=======
=======
=======
        val userData = Try(ds.getSchema(sft.getTypeName)).map(_.getUserData.asScala).getOrElse(null)
        userData must not(beNull)
        userData must containAllOf(sft.getUserData.asScala.toSeq)
>>>>>>> f639b39b8 (GEOMESA-3208 Postgis - Fix camel-case feature type names)
>>>>>>> a91558bd4 (GEOMESA-3208 Postgis - Fix camel-case feature type names)
<<<<<<< HEAD
>>>>>>> ce17eba7ba (GEOMESA-3208 Postgis - Fix camel-case feature type names)
=======
=======
=======
<<<<<<< HEAD
=======
>>>>>>> 203dda21b (GEOMESA-3208 Postgis - Fix camel-case feature type names)
        val schema = Try(ds.getSchema(sft.getTypeName)).getOrElse(null)
        schema must not(beNull)
        schema.getUserData.asScala must containAllOf(sft.getUserData.asScala.toSeq)
        logger.info(s"Schema: ${SimpleFeatureTypes.encodeType(schema)}")
<<<<<<< HEAD
>>>>>>> ee1d5f207 (GEOMESA-3215 Postgis - support List-type attributes)
<<<<<<< HEAD
>>>>>>> 47f8de1bb (GEOMESA-3215 Postgis - support List-type attributes)
<<<<<<< HEAD
>>>>>>> afb207dc68 (GEOMESA-3215 Postgis - support List-type attributes)
=======
=======
=======
=======
        val userData = Try(ds.getSchema(sft.getTypeName)).map(_.getUserData.asScala).getOrElse(null)
        userData must not(beNull)
        userData must containAllOf(sft.getUserData.asScala.toSeq)
>>>>>>> f639b39b8 (GEOMESA-3208 Postgis - Fix camel-case feature type names)
>>>>>>> 203dda21b (GEOMESA-3208 Postgis - Fix camel-case feature type names)
<<<<<<< HEAD
>>>>>>> f9969bc4e9 (GEOMESA-3208 Postgis - Fix camel-case feature type names)
<<<<<<< HEAD
>>>>>>> b8e1d54867 (GEOMESA-3208 Postgis - Fix camel-case feature type names)
=======
=======
=======
>>>>>>> ee1d5f207 (GEOMESA-3215 Postgis - support List-type attributes)
>>>>>>> cf1d94c7a (GEOMESA-3215 Postgis - support List-type attributes)
<<<<<<< HEAD
>>>>>>> 3a1e1d7213 (GEOMESA-3215 Postgis - support List-type attributes)
<<<<<<< HEAD
>>>>>>> 1913bc4c2c (GEOMESA-3215 Postgis - support List-type attributes)
=======
=======
=======
>>>>>>> d845d7c1b (GEOMESA-3254 Add Bloop build support)
>>>>>>> 09d87762c5 (GEOMESA-3254 Add Bloop build support)
>>>>>>> 63a045a753 (GEOMESA-3254 Add Bloop build support)

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
>>>>>>> ee1d5f207 (GEOMESA-3215 Postgis - support List-type attributes)
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
>>>>>>> 58d14a257 (GEOMESA-3254 Add Bloop build support)
            }
          }

<<<<<<< HEAD
=======
<<<<<<< HEAD
<<<<<<< HEAD
<<<<<<< HEAD
<<<<<<< HEAD
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

=======
>>>>>>> 9bd39d5310 (GEOMESA-3260 Postgis - fix age-off bug (#2958))
        def compFromDb(sf: SimpleFeature): Seq[Any] = Seq(sf.getID) ++ sf.getAttributes.asScala.map {
          // even though Timestamp extends Date, equals comparison doesn't work between the 2
          case t: java.sql.Timestamp => new java.util.Date(t.getTime)
          case a => a
        }
        // note: jdbc data store adds the type name into the fid, so we add it here for the comparison
        def compWithFid(sf: SimpleFeature): Seq[Any] = Seq(s"${sft.getTypeName}.${sf.getID}") ++ sf.getAttributes.asScala

=======
<<<<<<< HEAD
>>>>>>> 6c49bcd685 (GEOMESA-3246 Upgrade Arrow to 11.0.0)
=======
>>>>>>> 5c8e27c70f (GEOMESA-3260 Postgis - fix age-off bug (#2958))
>>>>>>> 9bd39d5310 (GEOMESA-3260 Postgis - fix age-off bug (#2958))
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
          WithClose(ds.getFeatureReader(new Query(sft.getTypeName), Transaction.AUTO_COMMIT)) { reader =>
            reader.hasNext must beFalse
>>>>>>> 794a6f66c3 (GEOMESA-3261 Postgis - Fix age-off for non-alpha feature type names)
=======
          WithClose(ds.getFeatureReader(new Query(sft.getTypeName), Transaction.AUTO_COMMIT)) { reader =>
            reader.hasNext must beFalse
=======
        if (methods.query) {
          WithClose(ds.getFeatureReader(new Query(sft.getTypeName), Transaction.AUTO_COMMIT)) { reader =>
            while (reader.hasNext) {
<<<<<<< HEAD
<<<<<<< HEAD
<<<<<<< HEAD
<<<<<<< HEAD
<<<<<<< HEAD
=======
>>>>>>> b298e017f1 (GEOMESA-3254 Add Bloop build support)
=======
>>>>>>> 3e610250ce (GEOMESA-3254 Add Bloop build support)
              logger.info(reader.next.toString)
=======
<<<<<<< HEAD
              logger.info(DataUtilities.encodeFeature(reader.next))
=======
              logger.info(reader.next.toString)
>>>>>>> ee1d5f207 (GEOMESA-3215 Postgis - support List-type attributes)
>>>>>>> cf1d94c7a (GEOMESA-3215 Postgis - support List-type attributes)
=======
              logger.info(DataUtilities.encodeFeature(reader.next))
>>>>>>> d845d7c1b (GEOMESA-3254 Add Bloop build support)
<<<<<<< HEAD
<<<<<<< HEAD
=======
              logger.info(DataUtilities.encodeFeature(reader.next))
>>>>>>> 58d14a257 (GEOMESA-3254 Add Bloop build support)
=======
>>>>>>> b298e017f1 (GEOMESA-3254 Add Bloop build support)
=======
=======
              logger.info(DataUtilities.encodeFeature(reader.next))
>>>>>>> 58d14a257 (GEOMESA-3254 Add Bloop build support)
>>>>>>> 3e610250ce (GEOMESA-3254 Add Bloop build support)
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
>>>>>>> ee1d5f207 (GEOMESA-3215 Postgis - support List-type attributes)
>>>>>>> afb207dc68 (GEOMESA-3215 Postgis - support List-type attributes)
          }
        }
<<<<<<< HEAD
<<<<<<< HEAD
<<<<<<< HEAD
<<<<<<< HEAD
>>>>>>> 7c0158dc6e (GEOMESA-3246 Upgrade Arrow to 11.0.0)
=======
>>>>>>> 6c49bcd685 (GEOMESA-3246 Upgrade Arrow to 11.0.0)
=======
>>>>>>> cad359442f (GEOMESA-3261 Postgis - Fix age-off for non-alpha feature type names)
=======
=======
>>>>>>> 320759d5d3 (GEOMESA-3246 Upgrade Arrow to 11.0.0)
=======
=======
        ds.getTypeNames must beEmpty
        ds.createSchema(sft)

<<<<<<< HEAD
<<<<<<< HEAD
<<<<<<< HEAD
<<<<<<< HEAD
<<<<<<< HEAD
=======
>>>>>>> 6494375eef (GEOMESA-3215 Postgis - support List-type attributes)
=======
>>>>>>> ee1d5f207 (GEOMESA-3215 Postgis - support List-type attributes)
        val schema = Try(ds.getSchema(sft.getTypeName)).getOrElse(null)
        schema must not(beNull)
        schema.getUserData.asScala must containAllOf(sft.getUserData.asScala.toSeq)
<<<<<<< HEAD
        logger.debug(s"Schema: ${SimpleFeatureTypes.encodeType(schema)}")
=======
        logger.info(s"Schema: ${SimpleFeatureTypes.encodeType(schema)}")
<<<<<<< HEAD
<<<<<<< HEAD
=======
        val userData = Try(ds.getSchema(sft.getTypeName)).map(_.getUserData.asScala).getOrElse(null)
        userData must not(beNull)
        userData must containAllOf(sft.getUserData.asScala.toSeq)
>>>>>>> f639b39b8 (GEOMESA-3208 Postgis - Fix camel-case feature type names)
<<<<<<< HEAD
>>>>>>> 203dda21b (GEOMESA-3208 Postgis - Fix camel-case feature type names)
=======
=======
>>>>>>> ee1d5f207 (GEOMESA-3215 Postgis - support List-type attributes)
>>>>>>> cf1d94c7a (GEOMESA-3215 Postgis - support List-type attributes)
=======
=======
>>>>>>> a6add7b0b1 (GEOMESA-3208 Postgis - Fix camel-case feature type names)
        val schema = Try(ds.getSchema(sft.getTypeName)).getOrElse(null)
        schema must not(beNull)
        schema.getUserData.asScala must containAllOf(sft.getUserData.asScala.toSeq)
<<<<<<< HEAD
        logger.debug(s"Schema: ${SimpleFeatureTypes.encodeType(schema)}")
<<<<<<< HEAD
>>>>>>> 320759d5d3 (GEOMESA-3246 Upgrade Arrow to 11.0.0)
=======
=======
        logger.info(s"Schema: ${SimpleFeatureTypes.encodeType(schema)}")
=======
>>>>>>> 6494375eef (GEOMESA-3215 Postgis - support List-type attributes)
=======
        val userData = Try(ds.getSchema(sft.getTypeName)).map(_.getUserData.asScala).getOrElse(null)
        userData must not(beNull)
        userData must containAllOf(sft.getUserData.asScala.toSeq)
>>>>>>> f639b39b8 (GEOMESA-3208 Postgis - Fix camel-case feature type names)
<<<<<<< HEAD
>>>>>>> 203dda21b (GEOMESA-3208 Postgis - Fix camel-case feature type names)
<<<<<<< HEAD
>>>>>>> a6add7b0b1 (GEOMESA-3208 Postgis - Fix camel-case feature type names)
=======
=======
=======
>>>>>>> ee1d5f207 (GEOMESA-3215 Postgis - support List-type attributes)
>>>>>>> cf1d94c7a (GEOMESA-3215 Postgis - support List-type attributes)
>>>>>>> 6494375eef (GEOMESA-3215 Postgis - support List-type attributes)

        // write some data
        WithClose(new DefaultTransaction()) { tx =>
          WithClose(ds.getFeatureWriterAppend(sft.getTypeName, tx)) { writer =>
            features.foreach { feature =>
              FeatureUtils.write(writer, feature, useProvidedFid = true)
            }
          }
          tx.commit()
        }

        def compFromDb(sf: SimpleFeature): Seq[Any] = Seq(sf.getID) ++ sf.getAttributes.asScala.map {
          // even though Timestamp extends Date, equals comparison doesn't work between the 2
          case t: java.sql.Timestamp => new java.util.Date(t.getTime)
          case a => a
        }
        // note: jdbc data store adds the type name into the fid, so we add it here for the comparison
        def compWithFid(sf: SimpleFeature): Seq[Any] = Seq(s"${sft.getTypeName}.${sf.getID}") ++ sf.getAttributes.asScala

        WithClose(ds.getFeatureReader(new Query(sft.getTypeName), Transaction.AUTO_COMMIT)) { reader =>
          val result = SelfClosingIterator(reader).toList
          result.map(compFromDb) must containTheSameElementsAs(features.map(compWithFid))
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
          result.map(compFromDb) must containTheSameElementsAs(features.map(compWithFid))
        }

        features.foreach { feature =>
          WithClose(ds.getFeatureWriter(sft.getTypeName, ECQL.toFilter(s"IN('${feature.getID}')"), Transaction.AUTO_COMMIT)) { writer =>
            writer.hasNext must beTrue
            writer.next()
            writer.remove()
          }
        }
>>>>>>> 7c0158dc6e (GEOMESA-3246 Upgrade Arrow to 11.0.0)
<<<<<<< HEAD
>>>>>>> d18777a94f (GEOMESA-3246 Upgrade Arrow to 11.0.0)
=======
>>>>>>> 320759d5d3 (GEOMESA-3246 Upgrade Arrow to 11.0.0)

        WithClose(ds.getFeatureReader(new Query(sft.getTypeName), Transaction.AUTO_COMMIT)) { reader =>
          reader.hasNext must beFalse
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
=======
>>>>>>> 4b7c48b509 (GEOMESA-3215 Postgis - support List-type attributes)
=======
>>>>>>> d18777a94f (GEOMESA-3246 Upgrade Arrow to 11.0.0)
=======
>>>>>>> 6edc66c3cb (GEOMESA-3215 Postgis - support List-type attributes)
=======
>>>>>>> 320759d5d3 (GEOMESA-3246 Upgrade Arrow to 11.0.0)
=======
>>>>>>> 6494375eef (GEOMESA-3215 Postgis - support List-type attributes)
        ds.removeSchema(sft.getTypeName)
=======
        if (methods.query) {
          WithClose(ds.getFeatureReader(new Query(sft.getTypeName), Transaction.AUTO_COMMIT)) { reader =>
            while (reader.hasNext) {
<<<<<<< HEAD
              logger.info(DataUtilities.encodeFeature(reader.next))
=======
              logger.info(reader.next.toString)
>>>>>>> ee1d5f207 (GEOMESA-3215 Postgis - support List-type attributes)
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
          }
        }

        if (methods.remove) {
          ds.removeSchema(sft.getTypeName)
        }
>>>>>>> cf1d94c7a (GEOMESA-3215 Postgis - support List-type attributes)
<<<<<<< HEAD
<<<<<<< HEAD
<<<<<<< HEAD
=======
>>>>>>> cad359442f (GEOMESA-3261 Postgis - Fix age-off for non-alpha feature type names)
=======
>>>>>>> locationtech-main
=======
>>>>>>> c3367776f (GEOMESA-3261 Postgis - Fix age-off for non-alpha feature type names)
<<<<<<< HEAD
<<<<<<< HEAD
<<<<<<< HEAD
<<<<<<< HEAD
>>>>>>> 794a6f66c3 (GEOMESA-3261 Postgis - Fix age-off for non-alpha feature type names)
=======
=======
=======
>>>>>>> 6d3c0ecb75 (GEOMESA-3215 Postgis - support List-type attributes)
        ds.removeSchema(sft.getTypeName)
<<<<<<< HEAD
>>>>>>> a928f2f73 (GEOMESA-3246 Upgrade Arrow to 11.0.0)
<<<<<<< HEAD
>>>>>>> 7c0158dc6e (GEOMESA-3246 Upgrade Arrow to 11.0.0)
<<<<<<< HEAD
>>>>>>> 05a1868e90 (GEOMESA-3246 Upgrade Arrow to 11.0.0)
=======
=======
=======
=======
        if (methods.query) {
          WithClose(ds.getFeatureReader(new Query(sft.getTypeName), Transaction.AUTO_COMMIT)) { reader =>
            while (reader.hasNext) {
<<<<<<< HEAD
              logger.info(DataUtilities.encodeFeature(reader.next))
=======
              logger.info(reader.next.toString)
>>>>>>> ee1d5f207 (GEOMESA-3215 Postgis - support List-type attributes)
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
          }
        }

        if (methods.remove) {
          ds.removeSchema(sft.getTypeName)
        }
>>>>>>> cf1d94c7a (GEOMESA-3215 Postgis - support List-type attributes)
>>>>>>> 42af7673b (GEOMESA-3215 Postgis - support List-type attributes)
>>>>>>> 6d3c0ecb75 (GEOMESA-3215 Postgis - support List-type attributes)
>>>>>>> 75e1524a30 (GEOMESA-3215 Postgis - support List-type attributes)
=======
        ds.removeSchema(sft.getTypeName)
>>>>>>> 6c49bcd685 (GEOMESA-3246 Upgrade Arrow to 11.0.0)
=======
>>>>>>> 4b7c48b509 (GEOMESA-3215 Postgis - support List-type attributes)
=======
>>>>>>> 794a6f66c3 (GEOMESA-3261 Postgis - Fix age-off for non-alpha feature type names)
>>>>>>> cad359442f (GEOMESA-3261 Postgis - Fix age-off for non-alpha feature type names)
=======
>>>>>>> 794a6f66c3 (GEOMESA-3261 Postgis - Fix age-off for non-alpha feature type names)
=======
=======
=======
>>>>>>> 6d3c0ecb75 (GEOMESA-3215 Postgis - support List-type attributes)
        ds.removeSchema(sft.getTypeName)
<<<<<<< HEAD
>>>>>>> a928f2f73 (GEOMESA-3246 Upgrade Arrow to 11.0.0)
<<<<<<< HEAD
>>>>>>> 7c0158dc6e (GEOMESA-3246 Upgrade Arrow to 11.0.0)
<<<<<<< HEAD
>>>>>>> 05a1868e90 (GEOMESA-3246 Upgrade Arrow to 11.0.0)
<<<<<<< HEAD
>>>>>>> d18777a94f (GEOMESA-3246 Upgrade Arrow to 11.0.0)
=======
=======
=======
=======
=======
        if (methods.query) {
          WithClose(ds.getFeatureReader(new Query(sft.getTypeName), Transaction.AUTO_COMMIT)) { reader =>
            while (reader.hasNext) {
<<<<<<< HEAD
              logger.info(DataUtilities.encodeFeature(reader.next))
=======
              logger.info(reader.next.toString)
>>>>>>> ee1d5f207 (GEOMESA-3215 Postgis - support List-type attributes)
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
          }
        }

        if (methods.remove) {
          ds.removeSchema(sft.getTypeName)
        }
>>>>>>> cf1d94c7a (GEOMESA-3215 Postgis - support List-type attributes)
>>>>>>> 42af7673b (GEOMESA-3215 Postgis - support List-type attributes)
>>>>>>> 6d3c0ecb75 (GEOMESA-3215 Postgis - support List-type attributes)
>>>>>>> 75e1524a30 (GEOMESA-3215 Postgis - support List-type attributes)
>>>>>>> 6edc66c3cb (GEOMESA-3215 Postgis - support List-type attributes)
=======
>>>>>>> 794a6f66c3 (GEOMESA-3261 Postgis - Fix age-off for non-alpha feature type names)
=======
=======
=======
>>>>>>> 6d3c0ecb75 (GEOMESA-3215 Postgis - support List-type attributes)
        ds.removeSchema(sft.getTypeName)
<<<<<<< HEAD
>>>>>>> a928f2f73 (GEOMESA-3246 Upgrade Arrow to 11.0.0)
<<<<<<< HEAD
>>>>>>> 7c0158dc6e (GEOMESA-3246 Upgrade Arrow to 11.0.0)
<<<<<<< HEAD
>>>>>>> 05a1868e90 (GEOMESA-3246 Upgrade Arrow to 11.0.0)
<<<<<<< HEAD
>>>>>>> 320759d5d3 (GEOMESA-3246 Upgrade Arrow to 11.0.0)
=======
=======
=======
=======
=======
        if (methods.query) {
          WithClose(ds.getFeatureReader(new Query(sft.getTypeName), Transaction.AUTO_COMMIT)) { reader =>
            while (reader.hasNext) {
<<<<<<< HEAD
              logger.info(DataUtilities.encodeFeature(reader.next))
=======
              logger.info(reader.next.toString)
>>>>>>> ee1d5f207 (GEOMESA-3215 Postgis - support List-type attributes)
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
          }
        }

        if (methods.remove) {
          ds.removeSchema(sft.getTypeName)
        }
>>>>>>> cf1d94c7a (GEOMESA-3215 Postgis - support List-type attributes)
>>>>>>> 42af7673b (GEOMESA-3215 Postgis - support List-type attributes)
>>>>>>> 6d3c0ecb75 (GEOMESA-3215 Postgis - support List-type attributes)
>>>>>>> 75e1524a30 (GEOMESA-3215 Postgis - support List-type attributes)
>>>>>>> 6494375eef (GEOMESA-3215 Postgis - support List-type attributes)
      } catch {
        case NonFatal(e) => logger.error("", e); ko
      } finally {
        ds.dispose()
      }
      ok
    }
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
<<<<<<< HEAD
>>>>>>> locationtech-main
>>>>>>> 5c8e27c70f (GEOMESA-3260 Postgis - fix age-off bug (#2958))
  step {
    if (container != null) {
      container.stop()
=======
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
>>>>>>> 61951ec00 (GEOMESA-3260 Postgis - fix age-off bug (#2958))
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
<<<<<<< HEAD
=======
<<<<<<< HEAD
  step {
    if (container != null) {
      container.stop()
>>>>>>> 42af7673bd (GEOMESA-3215 Postgis - support List-type attributes)
=======
>>>>>>> b5c0452b13 (GEOMESA-3262 Postgis - add config to skip whole world filters)
    }
  }

<<<<<<< HEAD
<<<<<<< HEAD
>>>>>>> a928f2f739 (GEOMESA-3246 Upgrade Arrow to 11.0.0)
=======
=======
>>>>>>> afb207dc68 (GEOMESA-3215 Postgis - support List-type attributes)
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

<<<<<<< HEAD
>>>>>>> 5c8e27c70f (GEOMESA-3260 Postgis - fix age-off bug (#2958))
=======
=======
  }

<<<<<<< HEAD
  step {
    if (container != null) {
      container.stop()
    }
  }

>>>>>>> a928f2f73 (GEOMESA-3246 Upgrade Arrow to 11.0.0)
>>>>>>> 05a1868e90 (GEOMESA-3246 Upgrade Arrow to 11.0.0)
=======
  }
=======
>>>>>>> 9bd39d5310 (GEOMESA-3260 Postgis - fix age-off bug (#2958))
=======
>>>>>>> d18777a94f (GEOMESA-3246 Upgrade Arrow to 11.0.0)
=======
>>>>>>> 320759d5d3 (GEOMESA-3246 Upgrade Arrow to 11.0.0)

<<<<<<< HEAD
<<<<<<< HEAD
=======
<<<<<<< HEAD
=======
<<<<<<< HEAD
>>>>>>> locationtech-main
>>>>>>> 5c8e27c70f (GEOMESA-3260 Postgis - fix age-off bug (#2958))
  step {
    if (container != null) {
      container.stop()
=======
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
>>>>>>> 61951ec00 (GEOMESA-3260 Postgis - fix age-off bug (#2958))
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
<<<<<<< HEAD
=======

    "support idle_in_transaction_session_timeout" in {
      val sft = SimpleFeatureTypes.renameSft(this.sft, "timeout")

      val ds = DataStoreFinder.getDataStore((params ++ Map("idle_in_transaction_session_timeout" -> "100ms", "fetch size" -> 1)).asJava)
      ds must not(beNull)

      try {
        ds must beAnInstanceOf[JDBCDataStore]

        ds.getTypeNames.toSeq must not(contain(sft.getTypeName))
=======
        ds.getTypeNames must beEmpty
>>>>>>> a928f2f739 (GEOMESA-3246 Upgrade Arrow to 11.0.0)
        ds.createSchema(sft)

<<<<<<< HEAD
<<<<<<< HEAD
=======
>>>>>>> ee1d5f207 (GEOMESA-3215 Postgis - support List-type attributes)
        val schema = Try(ds.getSchema(sft.getTypeName)).getOrElse(null)
        schema must not(beNull)
        schema.getUserData.asScala must containAllOf(sft.getUserData.asScala.toSeq)
<<<<<<< HEAD
        logger.debug(s"Schema: ${SimpleFeatureTypes.encodeType(schema)}")
=======
        logger.info(s"Schema: ${SimpleFeatureTypes.encodeType(schema)}")
<<<<<<< HEAD
=======
        val userData = Try(ds.getSchema(sft.getTypeName)).map(_.getUserData.asScala).getOrElse(null)
        userData must not(beNull)
        userData must containAllOf(sft.getUserData.asScala.toSeq)
>>>>>>> f639b39b8 (GEOMESA-3208 Postgis - Fix camel-case feature type names)
<<<<<<< HEAD
>>>>>>> 203dda21b (GEOMESA-3208 Postgis - Fix camel-case feature type names)
=======
=======
>>>>>>> ee1d5f207 (GEOMESA-3215 Postgis - support List-type attributes)
>>>>>>> cf1d94c7a (GEOMESA-3215 Postgis - support List-type attributes)
<<<<<<< HEAD
=======
>>>>>>> locationtech-main
=======
          val schema = Try(ds.getSchema(sft.getTypeName)).getOrElse(null)
          schema must not(beNull)
          schema.getUserData.asScala must containAllOf(sft.getUserData.asScala.toSeq)
          logger.debug(s"Schema: ${SimpleFeatureTypes.encodeType(schema)}")
>>>>>>> c3367776f (GEOMESA-3261 Postgis - Fix age-off for non-alpha feature type names)
>>>>>>> 794a6f66c3 (GEOMESA-3261 Postgis - Fix age-off for non-alpha feature type names)

          // write some data
          WithClose(new DefaultTransaction()) { tx =>
            WithClose(ds.getFeatureWriterAppend(sft.getTypeName, tx)) { writer =>
              features.foreach { feature =>
                FeatureUtils.write(writer, feature, useProvidedFid = true)
              }
            }
            tx.commit()
          }

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
            }
          }

<<<<<<< HEAD
<<<<<<< HEAD
<<<<<<< HEAD
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
>>>>>>> 630900cfbb (GEOMESA-3246 Upgrade Arrow to 11.0.0)
  }

<<<<<<< HEAD
<<<<<<< HEAD
<<<<<<< HEAD
<<<<<<< HEAD
>>>>>>> a928f2f739 (GEOMESA-3246 Upgrade Arrow to 11.0.0)
<<<<<<< HEAD
>>>>>>> 6c49bcd685 (GEOMESA-3246 Upgrade Arrow to 11.0.0)
=======
=======
=======
>>>>>>> afb207dc68 (GEOMESA-3215 Postgis - support List-type attributes)
=======
>>>>>>> 36a7119501 (GEOMESA-3215 Postgis - support List-type attributes)
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

<<<<<<< HEAD
<<<<<<< HEAD
>>>>>>> 5c8e27c70f (GEOMESA-3260 Postgis - fix age-off bug (#2958))
<<<<<<< HEAD
>>>>>>> 9bd39d5310 (GEOMESA-3260 Postgis - fix age-off bug (#2958))
=======
=======
=======
  }

<<<<<<< HEAD
=======
=======
        def compFromDb(sf: SimpleFeature): Seq[Any] = Seq(sf.getID) ++ sf.getAttributes.asScala.map {
          // even though Timestamp extends Date, equals comparison doesn't work between the 2
          case t: java.sql.Timestamp => new java.util.Date(t.getTime)
          case a => a
        }
        // note: jdbc data store adds the type name into the fid, so we add it here for the comparison
        def compWithFid(sf: SimpleFeature): Seq[Any] = Seq(s"${sft.getTypeName}.${sf.getID}") ++ sf.getAttributes.asScala

=======
>>>>>>> 5c8e27c70f (GEOMESA-3260 Postgis - fix age-off bug (#2958))
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
          WithClose(ds.getFeatureReader(new Query(sft.getTypeName), Transaction.AUTO_COMMIT)) { reader =>
            reader.hasNext must beFalse
>>>>>>> 794a6f66c3 (GEOMESA-3261 Postgis - Fix age-off for non-alpha feature type names)
          }
        }
<<<<<<< HEAD

        WithClose(ds.getFeatureReader(new Query(sft.getTypeName), Transaction.AUTO_COMMIT)) { reader =>
          reader.hasNext must beFalse
        }

<<<<<<< HEAD
        ds.removeSchema(sft.getTypeName)
=======
        if (methods.query) {
          WithClose(ds.getFeatureReader(new Query(sft.getTypeName), Transaction.AUTO_COMMIT)) { reader =>
            while (reader.hasNext) {
<<<<<<< HEAD
              logger.info(DataUtilities.encodeFeature(reader.next))
=======
              logger.info(reader.next.toString)
>>>>>>> ee1d5f207 (GEOMESA-3215 Postgis - support List-type attributes)
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
          }
        }

        if (methods.remove) {
          ds.removeSchema(sft.getTypeName)
        }
>>>>>>> cf1d94c7a (GEOMESA-3215 Postgis - support List-type attributes)
<<<<<<< HEAD
=======
>>>>>>> locationtech-main
=======
>>>>>>> c3367776f (GEOMESA-3261 Postgis - Fix age-off for non-alpha feature type names)
>>>>>>> 794a6f66c3 (GEOMESA-3261 Postgis - Fix age-off for non-alpha feature type names)
      } catch {
        case NonFatal(e) => logger.error("", e); ko
      } finally {
        ds.dispose()
      }
      ok
    }

<<<<<<< HEAD
<<<<<<< HEAD
>>>>>>> 630900cfbb (GEOMESA-3246 Upgrade Arrow to 11.0.0)
=======
<<<<<<< HEAD
>>>>>>> da609e20da (GEOMESA-3215 Postgis - support List-type attributes)
=======
<<<<<<< HEAD
=======
<<<<<<< HEAD
=======
<<<<<<< HEAD
>>>>>>> locationtech-main
>>>>>>> 5c8e27c70f (GEOMESA-3260 Postgis - fix age-off bug (#2958))
>>>>>>> e54159ef30 (GEOMESA-3260 Postgis - fix age-off bug (#2958))
  step {
    if (container != null) {
      container.stop()
=======
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
>>>>>>> 61951ec00 (GEOMESA-3260 Postgis - fix age-off bug (#2958))
    }
  }

<<<<<<< HEAD
<<<<<<< HEAD
>>>>>>> a928f2f73 (GEOMESA-3246 Upgrade Arrow to 11.0.0)
>>>>>>> 05a1868e90 (GEOMESA-3246 Upgrade Arrow to 11.0.0)
>>>>>>> d18777a94f (GEOMESA-3246 Upgrade Arrow to 11.0.0)
=======
>>>>>>> a928f2f739 (GEOMESA-3246 Upgrade Arrow to 11.0.0)
>>>>>>> 630900cfbb (GEOMESA-3246 Upgrade Arrow to 11.0.0)
=======
=======
>>>>>>> 6bd2f89dcd (GEOMESA-3215 Postgis - support List-type attributes)
>>>>>>> a928f2f739 (GEOMESA-3246 Upgrade Arrow to 11.0.0)
=======
=======
>>>>>>> afb207dc68 (GEOMESA-3215 Postgis - support List-type attributes)
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

<<<<<<< HEAD
>>>>>>> 5c8e27c70f (GEOMESA-3260 Postgis - fix age-off bug (#2958))
<<<<<<< HEAD
>>>>>>> e54159ef30 (GEOMESA-3260 Postgis - fix age-off bug (#2958))
=======
=======
=======
  }

  step {
    if (container != null) {
      container.stop()
    }
  }

>>>>>>> a928f2f73 (GEOMESA-3246 Upgrade Arrow to 11.0.0)
>>>>>>> 05a1868e90 (GEOMESA-3246 Upgrade Arrow to 11.0.0)
>>>>>>> 320759d5d3 (GEOMESA-3246 Upgrade Arrow to 11.0.0)
  def count(cx: Connection, table: TableConfig): Int = {
    WithClose(cx.prepareStatement(s"select count(*) from ${table.name.qualified};")) { statement =>
      WithClose(statement.executeQuery()) { rs =>
        rs.next() must beTrue
        rs.getInt(1)
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
=======
<<<<<<< HEAD
=======
<<<<<<< HEAD
=======
=======
>>>>>>> 7542dc78d8 (GEOMESA-3215 Postgis - support List-type attributes)
=======
  }
<<<<<<< HEAD
<<<<<<< HEAD
<<<<<<< HEAD
>>>>>>> 6c49bcd685 (GEOMESA-3246 Upgrade Arrow to 11.0.0)
=======
=======
=======
>>>>>>> 6edc66c3cb (GEOMESA-3215 Postgis - support List-type attributes)
=======
>>>>>>> 7e990c0c62 (GEOMESA-3215 Postgis - support List-type attributes)
=======
<<<<<<< HEAD
=======
<<<<<<< HEAD
=======
=======
>>>>>>> 7542dc78d8 (GEOMESA-3215 Postgis - support List-type attributes)
=======
>>>>>>> 630900cfbb (GEOMESA-3246 Upgrade Arrow to 11.0.0)
=======
=======
=======
>>>>>>> 6494375eef (GEOMESA-3215 Postgis - support List-type attributes)
=======
>>>>>>> 6de7ca735b (GEOMESA-3215 Postgis - support List-type attributes)
=======
<<<<<<< HEAD
=======
<<<<<<< HEAD
=======
=======
>>>>>>> 7542dc78d8 (GEOMESA-3215 Postgis - support List-type attributes)
=======
  case class Methods(
      create: Boolean,
<<<<<<< HEAD
      upgrade: Boolean,
=======
      recreate: Boolean,
>>>>>>> ee1d5f207 (GEOMESA-3215 Postgis - support List-type attributes)
      write: Boolean,
      update: Boolean,
      query: Boolean,
      delete: Boolean,
      remove: Boolean
<<<<<<< HEAD
    ) {
    def any: Boolean = create || upgrade || write || update || query || delete || remove
>>>>>>> cf1d94c7a (GEOMESA-3215 Postgis - support List-type attributes)
<<<<<<< HEAD
>>>>>>> 6d3c0ecb75 (GEOMESA-3215 Postgis - support List-type attributes)
>>>>>>> 75e1524a30 (GEOMESA-3215 Postgis - support List-type attributes)
  }
<<<<<<< HEAD
<<<<<<< HEAD
<<<<<<< HEAD
=======
<<<<<<< HEAD
>>>>>>> afb207dc68 (GEOMESA-3215 Postgis - support List-type attributes)
>>>>>>> 6bd2f89dcd (GEOMESA-3215 Postgis - support List-type attributes)
=======
  case class Methods(
      create: Boolean,
<<<<<<< HEAD
      upgrade: Boolean,
=======
      recreate: Boolean,
>>>>>>> ee1d5f207 (GEOMESA-3215 Postgis - support List-type attributes)
=======
  case class Methods(
      create: Boolean,
<<<<<<< HEAD
<<<<<<< HEAD
<<<<<<< HEAD
      recreate: Boolean,
<<<<<<< HEAD
>>>>>>> 47f8de1bb (GEOMESA-3215 Postgis - support List-type attributes)
=======
=======
<<<<<<< HEAD
      upgrade: Boolean,
=======
      recreate: Boolean,
>>>>>>> ee1d5f207 (GEOMESA-3215 Postgis - support List-type attributes)
>>>>>>> cf1d94c7a (GEOMESA-3215 Postgis - support List-type attributes)
<<<<<<< HEAD
>>>>>>> 3a1e1d7213 (GEOMESA-3215 Postgis - support List-type attributes)
=======
=======
      upgrade: Boolean,
>>>>>>> d845d7c1b (GEOMESA-3254 Add Bloop build support)
<<<<<<< HEAD
>>>>>>> 09d87762c5 (GEOMESA-3254 Add Bloop build support)
=======
=======
      upgrade: Boolean,
>>>>>>> 58d14a257 (GEOMESA-3254 Add Bloop build support)
>>>>>>> 1dae86c846 (GEOMESA-3254 Add Bloop build support)
=======
=======
  case class Methods(
      create: Boolean,
      recreate: Boolean,
>>>>>>> 2912d58b06 (GEOMESA-3215 Postgis - support List-type attributes)
      write: Boolean,
      update: Boolean,
      query: Boolean,
      delete: Boolean,
      remove: Boolean
<<<<<<< HEAD
<<<<<<< HEAD
<<<<<<< HEAD
<<<<<<< HEAD
<<<<<<< HEAD
<<<<<<< HEAD
    ) {
    def any: Boolean = create || upgrade || write || update || query || delete || remove
>>>>>>> cf1d94c7a (GEOMESA-3215 Postgis - support List-type attributes)
  }
<<<<<<< HEAD
<<<<<<< HEAD
>>>>>>> da609e20da (GEOMESA-3215 Postgis - support List-type attributes)
=======
  case class Methods(
      create: Boolean,
<<<<<<< HEAD
<<<<<<< HEAD
<<<<<<< HEAD
      upgrade: Boolean,
=======
      recreate: Boolean,
>>>>>>> ee1d5f207 (GEOMESA-3215 Postgis - support List-type attributes)
=======
=======
  case class Methods(
      create: Boolean,
<<<<<<< HEAD
      recreate: Boolean,
<<<<<<< HEAD
>>>>>>> 36a7119501 (GEOMESA-3215 Postgis - support List-type attributes)
=======
=======
<<<<<<< HEAD
      upgrade: Boolean,
=======
      recreate: Boolean,
>>>>>>> ee1d5f207 (GEOMESA-3215 Postgis - support List-type attributes)
>>>>>>> cf1d94c7a8 (GEOMESA-3215 Postgis - support List-type attributes)
>>>>>>> a207fd51c3 (GEOMESA-3215 Postgis - support List-type attributes)
      write: Boolean,
      update: Boolean,
      query: Boolean,
      delete: Boolean,
      remove: Boolean
<<<<<<< HEAD
<<<<<<< HEAD
<<<<<<< HEAD
    ) {
    def any: Boolean = create || upgrade || write || update || query || delete || remove
>>>>>>> cf1d94c7a (GEOMESA-3215 Postgis - support List-type attributes)
<<<<<<< HEAD
>>>>>>> 6d3c0ecb75 (GEOMESA-3215 Postgis - support List-type attributes)
>>>>>>> 75e1524a30 (GEOMESA-3215 Postgis - support List-type attributes)
  }
<<<<<<< HEAD
<<<<<<< HEAD
=======
<<<<<<< HEAD
>>>>>>> afb207dc68 (GEOMESA-3215 Postgis - support List-type attributes)
>>>>>>> 69a6e5986e (GEOMESA-3215 Postgis - support List-type attributes)
=======
  case class Methods(
      create: Boolean,
<<<<<<< HEAD
      upgrade: Boolean,
=======
      recreate: Boolean,
>>>>>>> ee1d5f207 (GEOMESA-3215 Postgis - support List-type attributes)
=======
  case class Methods(
      create: Boolean,
<<<<<<< HEAD
<<<<<<< HEAD
<<<<<<< HEAD
      recreate: Boolean,
<<<<<<< HEAD
>>>>>>> 47f8de1bb (GEOMESA-3215 Postgis - support List-type attributes)
=======
=======
<<<<<<< HEAD
      upgrade: Boolean,
=======
      recreate: Boolean,
>>>>>>> ee1d5f207 (GEOMESA-3215 Postgis - support List-type attributes)
>>>>>>> cf1d94c7a (GEOMESA-3215 Postgis - support List-type attributes)
<<<<<<< HEAD
>>>>>>> 3a1e1d7213 (GEOMESA-3215 Postgis - support List-type attributes)
=======
=======
      upgrade: Boolean,
>>>>>>> d845d7c1b (GEOMESA-3254 Add Bloop build support)
<<<<<<< HEAD
>>>>>>> 09d87762c5 (GEOMESA-3254 Add Bloop build support)
=======
=======
      upgrade: Boolean,
>>>>>>> 58d14a257 (GEOMESA-3254 Add Bloop build support)
>>>>>>> 1dae86c846 (GEOMESA-3254 Add Bloop build support)
      write: Boolean,
      update: Boolean,
      query: Boolean,
      delete: Boolean,
      remove: Boolean
<<<<<<< HEAD
<<<<<<< HEAD
<<<<<<< HEAD
<<<<<<< HEAD
<<<<<<< HEAD
    ) {
    def any: Boolean = create || upgrade || write || update || query || delete || remove
>>>>>>> cf1d94c7a (GEOMESA-3215 Postgis - support List-type attributes)
  }
<<<<<<< HEAD
<<<<<<< HEAD
>>>>>>> 4b7c48b509 (GEOMESA-3215 Postgis - support List-type attributes)
=======
  case class Methods(
      create: Boolean,
<<<<<<< HEAD
<<<<<<< HEAD
<<<<<<< HEAD
<<<<<<< HEAD
      upgrade: Boolean,
=======
      recreate: Boolean,
>>>>>>> ee1d5f207 (GEOMESA-3215 Postgis - support List-type attributes)
=======
=======
<<<<<<< HEAD
>>>>>>> 7a84c9d22d (GEOMESA-3254 Add Bloop build support)
      recreate: Boolean,
=======
<<<<<<< HEAD
      upgrade: Boolean,
=======
      recreate: Boolean,
>>>>>>> ee1d5f207 (GEOMESA-3215 Postgis - support List-type attributes)
>>>>>>> cf1d94c7a8 (GEOMESA-3215 Postgis - support List-type attributes)
<<<<<<< HEAD
>>>>>>> bf9e5cdd91 (GEOMESA-3215 Postgis - support List-type attributes)
=======
=======
      upgrade: Boolean,
>>>>>>> d845d7c1bd (GEOMESA-3254 Add Bloop build support)
>>>>>>> 7a84c9d22d (GEOMESA-3254 Add Bloop build support)
      write: Boolean,
      update: Boolean,
      query: Boolean,
      delete: Boolean,
      remove: Boolean
<<<<<<< HEAD
<<<<<<< HEAD
<<<<<<< HEAD
    ) {
    def any: Boolean = create || upgrade || write || update || query || delete || remove
>>>>>>> cf1d94c7a (GEOMESA-3215 Postgis - support List-type attributes)
<<<<<<< HEAD
>>>>>>> 6d3c0ecb75 (GEOMESA-3215 Postgis - support List-type attributes)
>>>>>>> 75e1524a30 (GEOMESA-3215 Postgis - support List-type attributes)
  }
<<<<<<< HEAD
<<<<<<< HEAD
<<<<<<< HEAD
=======
<<<<<<< HEAD
>>>>>>> afb207dc68 (GEOMESA-3215 Postgis - support List-type attributes)
=======
  case class Methods(
      create: Boolean,
<<<<<<< HEAD
      upgrade: Boolean,
=======
      recreate: Boolean,
>>>>>>> ee1d5f207 (GEOMESA-3215 Postgis - support List-type attributes)
=======
  case class Methods(
      create: Boolean,
<<<<<<< HEAD
<<<<<<< HEAD
<<<<<<< HEAD
      recreate: Boolean,
<<<<<<< HEAD
>>>>>>> 47f8de1bb (GEOMESA-3215 Postgis - support List-type attributes)
=======
=======
<<<<<<< HEAD
      upgrade: Boolean,
=======
      recreate: Boolean,
>>>>>>> ee1d5f207 (GEOMESA-3215 Postgis - support List-type attributes)
>>>>>>> cf1d94c7a (GEOMESA-3215 Postgis - support List-type attributes)
<<<<<<< HEAD
>>>>>>> 3a1e1d7213 (GEOMESA-3215 Postgis - support List-type attributes)
=======
=======
      upgrade: Boolean,
>>>>>>> d845d7c1b (GEOMESA-3254 Add Bloop build support)
<<<<<<< HEAD
>>>>>>> 09d87762c5 (GEOMESA-3254 Add Bloop build support)
=======
=======
      upgrade: Boolean,
>>>>>>> 58d14a257 (GEOMESA-3254 Add Bloop build support)
>>>>>>> 1dae86c846 (GEOMESA-3254 Add Bloop build support)
=======
=======
  case class Methods(
      create: Boolean,
      recreate: Boolean,
>>>>>>> 2912d58b06 (GEOMESA-3215 Postgis - support List-type attributes)
      write: Boolean,
      update: Boolean,
      query: Boolean,
      delete: Boolean,
      remove: Boolean
<<<<<<< HEAD
<<<<<<< HEAD
<<<<<<< HEAD
<<<<<<< HEAD
<<<<<<< HEAD
<<<<<<< HEAD
    ) {
    def any: Boolean = create || upgrade || write || update || query || delete || remove
>>>>>>> cf1d94c7a (GEOMESA-3215 Postgis - support List-type attributes)
  }
<<<<<<< HEAD
<<<<<<< HEAD
=======
  case class Methods(
      create: Boolean,
<<<<<<< HEAD
<<<<<<< HEAD
<<<<<<< HEAD
=======
>>>>>>> f1532f2313 (GEOMESA-3254 Add Bloop build support)
=======
>>>>>>> 7564665969 (GEOMESA-3254 Add Bloop build support)
=======
<<<<<<< HEAD
>>>>>>> 9e49c1aac7 (GEOMESA-3254 Add Bloop build support)
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
<<<<<<< HEAD
<<<<<<< HEAD
<<<<<<< HEAD
=======
      upgrade: Boolean,
>>>>>>> 58d14a257e (GEOMESA-3254 Add Bloop build support)
=======
>>>>>>> f1532f2313 (GEOMESA-3254 Add Bloop build support)
=======
=======
      upgrade: Boolean,
>>>>>>> 58d14a257e (GEOMESA-3254 Add Bloop build support)
>>>>>>> 7564665969 (GEOMESA-3254 Add Bloop build support)
=======
=======
      upgrade: Boolean,
>>>>>>> 58d14a257e (GEOMESA-3254 Add Bloop build support)
>>>>>>> 9e49c1aac7 (GEOMESA-3254 Add Bloop build support)
      write: Boolean,
      update: Boolean,
      query: Boolean,
      delete: Boolean,
      remove: Boolean
<<<<<<< HEAD
<<<<<<< HEAD
<<<<<<< HEAD
<<<<<<< HEAD
<<<<<<< HEAD
<<<<<<< HEAD
=======
>>>>>>> bf9e5cdd91 (GEOMESA-3215 Postgis - support List-type attributes)
=======
>>>>>>> f1532f2313 (GEOMESA-3254 Add Bloop build support)
=======
>>>>>>> 7564665969 (GEOMESA-3254 Add Bloop build support)
=======
>>>>>>> a207fd51c3 (GEOMESA-3215 Postgis - support List-type attributes)
=======
>>>>>>> 7a84c9d22d (GEOMESA-3254 Add Bloop build support)
=======
>>>>>>> 9e49c1aac7 (GEOMESA-3254 Add Bloop build support)
    )
>>>>>>> ee1d5f2071 (GEOMESA-3215 Postgis - support List-type attributes)
=======
<<<<<<< HEAD
    ) {
    def any: Boolean = create || upgrade || write || update || query || delete || remove
  }
=======
<<<<<<< HEAD
<<<<<<< HEAD
<<<<<<< HEAD
<<<<<<< HEAD
=======
=======
>>>>>>> 09d87762c5 (GEOMESA-3254 Add Bloop build support)
=======
>>>>>>> 1dae86c846 (GEOMESA-3254 Add Bloop build support)
=======
<<<<<<< HEAD
>>>>>>> 1dae86c846 (GEOMESA-3254 Add Bloop build support)
=======
<<<<<<< HEAD
>>>>>>> 1dae86c846 (GEOMESA-3254 Add Bloop build support)
=======
=======
=======
=======
>>>>>>> 9d3260f1dc (GEOMESA-3215 Postgis - support List-type attributes)
=======
>>>>>>> 5a4c24e020 (GEOMESA-3254 Add Bloop build support)
=======
=======
=======
>>>>>>> e7dfbc3fc1 (GEOMESA-3215 Postgis - support List-type attributes)
=======
>>>>>>> b298e017f1 (GEOMESA-3254 Add Bloop build support)
<<<<<<< HEAD
    ) {
    def any: Boolean = create || upgrade || write || update || query || delete || remove
  }
=======
>>>>>>> cf1d94c7a (GEOMESA-3215 Postgis - support List-type attributes)
>>>>>>> 3a1e1d7213 (GEOMESA-3215 Postgis - support List-type attributes)
    )
>>>>>>> ee1d5f207 (GEOMESA-3215 Postgis - support List-type attributes)
<<<<<<< HEAD
<<<<<<< HEAD
<<<<<<< HEAD
<<<<<<< HEAD
<<<<<<< HEAD
<<<<<<< HEAD
=======
>>>>>>> 69a6e5986e (GEOMESA-3215 Postgis - support List-type attributes)
=======
>>>>>>> 5a4c24e020 (GEOMESA-3254 Add Bloop build support)
=======
>>>>>>> 6bd2f89dcd (GEOMESA-3215 Postgis - support List-type attributes)
=======
>>>>>>> b298e017f1 (GEOMESA-3254 Add Bloop build support)
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
<<<<<<< HEAD
<<<<<<< HEAD
<<<<<<< HEAD
<<<<<<< HEAD
=======
>>>>>>> a928f2f739 (GEOMESA-3246 Upgrade Arrow to 11.0.0)
=======
=======
    )
>>>>>>> ee1d5f207 (GEOMESA-3215 Postgis - support List-type attributes)
>>>>>>> 42af7673bd (GEOMESA-3215 Postgis - support List-type attributes)
<<<<<<< HEAD
<<<<<<< HEAD
<<<<<<< HEAD
<<<<<<< HEAD
=======
=======
>>>>>>> 63a045a753 (GEOMESA-3254 Add Bloop build support)
<<<<<<< HEAD
<<<<<<< HEAD
=======
=======
>>>>>>> 69a6e5986e (GEOMESA-3215 Postgis - support List-type attributes)
=======
>>>>>>> 5a4c24e020 (GEOMESA-3254 Add Bloop build support)
=======
=======
>>>>>>> 6bd2f89dcd (GEOMESA-3215 Postgis - support List-type attributes)
=======
>>>>>>> b298e017f1 (GEOMESA-3254 Add Bloop build support)
>>>>>>> locationtech-main
=======
    )
>>>>>>> ee1d5f207 (GEOMESA-3215 Postgis - support List-type attributes)
>>>>>>> 47f8de1bb (GEOMESA-3215 Postgis - support List-type attributes)
<<<<<<< HEAD
<<<<<<< HEAD
<<<<<<< HEAD
<<<<<<< HEAD
<<<<<<< HEAD
=======
>>>>>>> 5a4c24e020 (GEOMESA-3254 Add Bloop build support)
=======
>>>>>>> b298e017f1 (GEOMESA-3254 Add Bloop build support)
>>>>>>> afb207dc68 (GEOMESA-3215 Postgis - support List-type attributes)
=======
=======
=======
    ) {
    def any: Boolean = create || upgrade || write || update || query || delete || remove
  }
>>>>>>> d845d7c1b (GEOMESA-3254 Add Bloop build support)
<<<<<<< HEAD
<<<<<<< HEAD
<<<<<<< HEAD
<<<<<<< HEAD
<<<<<<< HEAD
>>>>>>> 09d87762c5 (GEOMESA-3254 Add Bloop build support)
<<<<<<< HEAD
>>>>>>> 63a045a753 (GEOMESA-3254 Add Bloop build support)
=======
=======
=======
    ) {
    def any: Boolean = create || upgrade || write || update || query || delete || remove
  }
>>>>>>> 58d14a257 (GEOMESA-3254 Add Bloop build support)
<<<<<<< HEAD
<<<<<<< HEAD
<<<<<<< HEAD
>>>>>>> 1dae86c846 (GEOMESA-3254 Add Bloop build support)
<<<<<<< HEAD
>>>>>>> fa60953a42 (GEOMESA-3254 Add Bloop build support)
=======
=======
=======
>>>>>>> a928f2f73 (GEOMESA-3246 Upgrade Arrow to 11.0.0)
<<<<<<< HEAD
<<<<<<< HEAD
<<<<<<< HEAD
>>>>>>> 7c0158dc6e (GEOMESA-3246 Upgrade Arrow to 11.0.0)
<<<<<<< HEAD
>>>>>>> 05a1868e90 (GEOMESA-3246 Upgrade Arrow to 11.0.0)
=======
=======
=======
=======
    )
>>>>>>> ee1d5f207 (GEOMESA-3215 Postgis - support List-type attributes)
>>>>>>> 42af7673b (GEOMESA-3215 Postgis - support List-type attributes)
>>>>>>> 6d3c0ecb75 (GEOMESA-3215 Postgis - support List-type attributes)
>>>>>>> 75e1524a30 (GEOMESA-3215 Postgis - support List-type attributes)
=======
  }
=======
    )
>>>>>>> ee1d5f207 (GEOMESA-3215 Postgis - support List-type attributes)
>>>>>>> 7542dc78d8 (GEOMESA-3215 Postgis - support List-type attributes)
<<<<<<< HEAD
<<<<<<< HEAD
<<<<<<< HEAD
=======
>>>>>>> ec585da266 (GEOMESA-3215 Postgis - support List-type attributes)
=======
    )
>>>>>>> ee1d5f2071 (GEOMESA-3215 Postgis - support List-type attributes)
>>>>>>> 2912d58b06 (GEOMESA-3215 Postgis - support List-type attributes)
<<<<<<< HEAD
=======
    )
>>>>>>> ee1d5f207 (GEOMESA-3215 Postgis - support List-type attributes)
>>>>>>> cf1d94c7a8 (GEOMESA-3215 Postgis - support List-type attributes)
<<<<<<< HEAD
<<<<<<< HEAD
>>>>>>> bf9e5cdd91 (GEOMESA-3215 Postgis - support List-type attributes)
=======
=======
>>>>>>> 7a84c9d22d (GEOMESA-3254 Add Bloop build support)
=======
    ) {
    def any: Boolean = create || upgrade || write || update || query || delete || remove
  }
>>>>>>> d845d7c1bd (GEOMESA-3254 Add Bloop build support)
<<<<<<< HEAD
>>>>>>> f1532f2313 (GEOMESA-3254 Add Bloop build support)
=======
>>>>>>> 7564665969 (GEOMESA-3254 Add Bloop build support)
=======
=======
>>>>>>> a928f2f739 (GEOMESA-3246 Upgrade Arrow to 11.0.0)
>>>>>>> 6c49bcd685 (GEOMESA-3246 Upgrade Arrow to 11.0.0)
=======
>>>>>>> 4b7c48b509 (GEOMESA-3215 Postgis - support List-type attributes)
=======
>>>>>>> afb207dc68 (GEOMESA-3215 Postgis - support List-type attributes)
>>>>>>> 69a6e5986e (GEOMESA-3215 Postgis - support List-type attributes)
=======
=======
>>>>>>> e74fa3f690 (GEOMESA-3254 Add Bloop build support)
>>>>>>> 09d87762c5 (GEOMESA-3254 Add Bloop build support)
<<<<<<< HEAD
>>>>>>> 63a045a753 (GEOMESA-3254 Add Bloop build support)
<<<<<<< HEAD
>>>>>>> 5a4c24e020 (GEOMESA-3254 Add Bloop build support)
=======
=======
=======
=======
    ) {
    def any: Boolean = create || upgrade || write || update || query || delete || remove
  }
>>>>>>> 58d14a257 (GEOMESA-3254 Add Bloop build support)
=======
>>>>>>> d18777a94f (GEOMESA-3246 Upgrade Arrow to 11.0.0)
>>>>>>> 1dae86c846 (GEOMESA-3254 Add Bloop build support)
<<<<<<< HEAD
>>>>>>> fa60953a42 (GEOMESA-3254 Add Bloop build support)
<<<<<<< HEAD
>>>>>>> e74fa3f690 (GEOMESA-3254 Add Bloop build support)
=======
=======
=======
=======
>>>>>>> a928f2f73 (GEOMESA-3246 Upgrade Arrow to 11.0.0)
=======
>>>>>>> 6edc66c3cb (GEOMESA-3215 Postgis - support List-type attributes)
>>>>>>> 7c0158dc6e (GEOMESA-3246 Upgrade Arrow to 11.0.0)
<<<<<<< HEAD
>>>>>>> 05a1868e90 (GEOMESA-3246 Upgrade Arrow to 11.0.0)
<<<<<<< HEAD
>>>>>>> d18777a94f (GEOMESA-3246 Upgrade Arrow to 11.0.0)
=======
=======
=======
=======
=======
    )
>>>>>>> ee1d5f207 (GEOMESA-3215 Postgis - support List-type attributes)
>>>>>>> 42af7673b (GEOMESA-3215 Postgis - support List-type attributes)
>>>>>>> 6d3c0ecb75 (GEOMESA-3215 Postgis - support List-type attributes)
>>>>>>> 75e1524a30 (GEOMESA-3215 Postgis - support List-type attributes)
>>>>>>> 6edc66c3cb (GEOMESA-3215 Postgis - support List-type attributes)
=======
>>>>>>> 7e990c0c62 (GEOMESA-3215 Postgis - support List-type attributes)
=======
    )
>>>>>>> ee1d5f2071 (GEOMESA-3215 Postgis - support List-type attributes)
>>>>>>> 36a7119501 (GEOMESA-3215 Postgis - support List-type attributes)
=======
    )
>>>>>>> ee1d5f207 (GEOMESA-3215 Postgis - support List-type attributes)
>>>>>>> cf1d94c7a8 (GEOMESA-3215 Postgis - support List-type attributes)
>>>>>>> a207fd51c3 (GEOMESA-3215 Postgis - support List-type attributes)
=======
>>>>>>> 7a84c9d22d (GEOMESA-3254 Add Bloop build support)
=======
>>>>>>> 9e49c1aac7 (GEOMESA-3254 Add Bloop build support)
=======
=======
>>>>>>> a928f2f739 (GEOMESA-3246 Upgrade Arrow to 11.0.0)
>>>>>>> 630900cfbb (GEOMESA-3246 Upgrade Arrow to 11.0.0)
=======
>>>>>>> da609e20da (GEOMESA-3215 Postgis - support List-type attributes)
=======
>>>>>>> afb207dc68 (GEOMESA-3215 Postgis - support List-type attributes)
>>>>>>> 6bd2f89dcd (GEOMESA-3215 Postgis - support List-type attributes)
=======
=======
>>>>>>> 3e610250ce (GEOMESA-3254 Add Bloop build support)
>>>>>>> 09d87762c5 (GEOMESA-3254 Add Bloop build support)
<<<<<<< HEAD
>>>>>>> 63a045a753 (GEOMESA-3254 Add Bloop build support)
<<<<<<< HEAD
>>>>>>> b298e017f1 (GEOMESA-3254 Add Bloop build support)
=======
=======
=======
=======
    ) {
    def any: Boolean = create || upgrade || write || update || query || delete || remove
  }
>>>>>>> 58d14a257 (GEOMESA-3254 Add Bloop build support)
=======
>>>>>>> 320759d5d3 (GEOMESA-3246 Upgrade Arrow to 11.0.0)
>>>>>>> 1dae86c846 (GEOMESA-3254 Add Bloop build support)
<<<<<<< HEAD
>>>>>>> fa60953a42 (GEOMESA-3254 Add Bloop build support)
<<<<<<< HEAD
>>>>>>> 3e610250ce (GEOMESA-3254 Add Bloop build support)
=======
=======
=======
=======
>>>>>>> a928f2f73 (GEOMESA-3246 Upgrade Arrow to 11.0.0)
=======
>>>>>>> 6494375eef (GEOMESA-3215 Postgis - support List-type attributes)
>>>>>>> 7c0158dc6e (GEOMESA-3246 Upgrade Arrow to 11.0.0)
<<<<<<< HEAD
>>>>>>> 05a1868e90 (GEOMESA-3246 Upgrade Arrow to 11.0.0)
<<<<<<< HEAD
>>>>>>> 320759d5d3 (GEOMESA-3246 Upgrade Arrow to 11.0.0)
=======
=======
=======
=======
=======
    )
>>>>>>> ee1d5f207 (GEOMESA-3215 Postgis - support List-type attributes)
>>>>>>> 42af7673b (GEOMESA-3215 Postgis - support List-type attributes)
>>>>>>> 6d3c0ecb75 (GEOMESA-3215 Postgis - support List-type attributes)
>>>>>>> 75e1524a30 (GEOMESA-3215 Postgis - support List-type attributes)
>>>>>>> 6494375eef (GEOMESA-3215 Postgis - support List-type attributes)
=======
>>>>>>> 6de7ca735b (GEOMESA-3215 Postgis - support List-type attributes)
=======
>>>>>>> ec585da266 (GEOMESA-3215 Postgis - support List-type attributes)
}
