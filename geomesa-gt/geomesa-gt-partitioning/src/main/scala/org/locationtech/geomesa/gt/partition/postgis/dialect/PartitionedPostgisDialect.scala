/***********************************************************************
 * Copyright (c) 2013-2024 Commonwealth Computer Research, Inc.
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Apache License, Version 2.0
 * which accompanies this distribution and is available at
 * http://www.opensource.org/licenses/apache2.0.php.
 ***********************************************************************/

package org.locationtech.geomesa.gt.partition.postgis.dialect

import com.typesafe.scalalogging.StrictLogging
import org.geotools.api.data.Query
import org.geotools.api.feature.`type`.{AttributeDescriptor, GeometryDescriptor}
import org.geotools.api.feature.simple.SimpleFeatureType
import org.geotools.api.filter.Filter
import org.geotools.data.postgis.PostGISDialect
import org.geotools.geometry.jts._
import org.geotools.jdbc.JDBCDataStore
<<<<<<< HEAD
import org.geotools.referencing.CRS
import org.geotools.util.factory.Hints
<<<<<<< HEAD
<<<<<<< HEAD
<<<<<<< HEAD
<<<<<<< HEAD
<<<<<<< HEAD
<<<<<<< HEAD
<<<<<<< HEAD
<<<<<<< HEAD
<<<<<<< HEAD
<<<<<<< HEAD
<<<<<<< HEAD
<<<<<<< HEAD
<<<<<<< HEAD
<<<<<<< HEAD
<<<<<<< HEAD
<<<<<<< HEAD
<<<<<<< HEAD
<<<<<<< HEAD
<<<<<<< HEAD
<<<<<<< HEAD
<<<<<<< HEAD
<<<<<<< HEAD
<<<<<<< HEAD
<<<<<<< HEAD
<<<<<<< HEAD
<<<<<<< HEAD
<<<<<<< HEAD
<<<<<<< HEAD
<<<<<<< HEAD
<<<<<<< HEAD
<<<<<<< HEAD
<<<<<<< HEAD
<<<<<<< HEAD
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
>>>>>>> 48fcd67085 (GEOMESA-3212 Postgis - convert constant functions to literals for SQL translation (#2875))
=======
>>>>>>> c0571b43e1 (GEOMESA-3262 Postgis - add config to skip whole world filters)
=======
>>>>>>> 01c8505b38 (GEOMESA-3212 Postgis - convert constant functions to literals for SQL translation (#2875))
=======
>>>>>>> 13656f5052 (GEOMESA-3254 Add Bloop build support)
=======
>>>>>>> b39bd292d4 (GEOMESA-3254 Add Bloop build support)
=======
>>>>>>> d391bc18f0 (GEOMESA-3212 Postgis - convert constant functions to literals for SQL translation (#2875))
=======
>>>>>>> 30a68d04cb (GEOMESA-3212 Postgis - convert constant functions to literals for SQL translation (#2875))
=======
>>>>>>> 64b3066584 (GEOMESA-3212 Postgis - convert constant functions to literals for SQL translation (#2875))
=======
>>>>>>> 75d5a347f8 (GEOMESA-3262 Postgis - add config to skip whole world filters)
<<<<<<< HEAD
<<<<<<< HEAD
=======
>>>>>>> 4983e191e6 (GEOMESA-3212 Postgis - convert constant functions to literals for SQL translation (#2875))
=======
>>>>>>> 5a4c24e020 (GEOMESA-3254 Add Bloop build support)
<<<<<<< HEAD
<<<<<<< HEAD
=======
>>>>>>> e74fa3f690 (GEOMESA-3254 Add Bloop build support)
=======
>>>>>>> b8426b262b (GEOMESA-3212 Postgis - convert constant functions to literals for SQL translation (#2875))
<<<<<<< HEAD
<<<<<<< HEAD
=======
>>>>>>> a26c0acbb7 (GEOMESA-3212 Postgis - convert constant functions to literals for SQL translation (#2875))
=======
>>>>>>> 7a84c9d22d (GEOMESA-3254 Add Bloop build support)
=======
>>>>>>> 9e49c1aac7 (GEOMESA-3254 Add Bloop build support)
=======
>>>>>>> be6b05230c (GEOMESA-3212 Postgis - convert constant functions to literals for SQL translation (#2875))
=======
>>>>>>> b5c0452b13 (GEOMESA-3262 Postgis - add config to skip whole world filters)
=======
>>>>>>> 30ec49c9c0 (GEOMESA-3212 Postgis - convert constant functions to literals for SQL translation (#2875))
=======
>>>>>>> b298e017f1 (GEOMESA-3254 Add Bloop build support)
=======
>>>>>>> 3e610250ce (GEOMESA-3254 Add Bloop build support)
=======
>>>>>>> e4a3f1a534 (GEOMESA-3212 Postgis - convert constant functions to literals for SQL translation (#2875))
=======
>>>>>>> 83c2c09260 (GEOMESA-3212 Postgis - convert constant functions to literals for SQL translation (#2875))
=======
>>>>>>> edde3a188e (GEOMESA-3212 Postgis - convert constant functions to literals for SQL translation (#2875))
=======
>>>>>>> c738f63bd9 (GEOMESA-3254 Add Bloop build support)
=======
>>>>>>> f586fec5a3 (GEOMESA-3254 Add Bloop build support)
=======
=======
>>>>>>> 64b3066584 (GEOMESA-3212 Postgis - convert constant functions to literals for SQL translation (#2875))
>>>>>>> eb0302a7c5 (GEOMESA-3212 Postgis - convert constant functions to literals for SQL translation (#2875))
=======
>>>>>>> c0571b43e1 (GEOMESA-3262 Postgis - add config to skip whole world filters)
=======
=======
>>>>>>> 4983e191e6 (GEOMESA-3212 Postgis - convert constant functions to literals for SQL translation (#2875))
>>>>>>> 01c8505b38 (GEOMESA-3212 Postgis - convert constant functions to literals for SQL translation (#2875))
=======
>>>>>>> 13656f5052 (GEOMESA-3254 Add Bloop build support)
=======
=======
>>>>>>> e74fa3f690 (GEOMESA-3254 Add Bloop build support)
>>>>>>> b39bd292d4 (GEOMESA-3254 Add Bloop build support)
=======
>>>>>>> d391bc18f0 (GEOMESA-3212 Postgis - convert constant functions to literals for SQL translation (#2875))
=======
=======
>>>>>>> a26c0acbb7 (GEOMESA-3212 Postgis - convert constant functions to literals for SQL translation (#2875))
>>>>>>> 30a68d04cb (GEOMESA-3212 Postgis - convert constant functions to literals for SQL translation (#2875))
import org.locationtech.geomesa.gt.partition.postgis.dialect.filter.SplitFilterVisitor
=======
<<<<<<< HEAD
<<<<<<< HEAD
<<<<<<< HEAD
=======
>>>>>>> 3ab56cb4cf (GEOMESA-3212 Postgis - convert constant functions to literals for SQL translation (#2875))
=======
=======
>>>>>>> 7d4ed7605c (GEOMESA-3262 Postgis - add config to skip whole world filters)
=======
<<<<<<< HEAD
<<<<<<< HEAD
<<<<<<< HEAD
<<<<<<< HEAD
<<<<<<< HEAD
<<<<<<< HEAD
=======
>>>>>>> c0571b43e1 (GEOMESA-3262 Postgis - add config to skip whole world filters)
=======
>>>>>>> 01c8505b38 (GEOMESA-3212 Postgis - convert constant functions to literals for SQL translation (#2875))
>>>>>>> d30ebb4092 (GEOMESA-3212 Postgis - convert constant functions to literals for SQL translation (#2875))
=======
>>>>>>> 63a045a753 (GEOMESA-3254 Add Bloop build support)
=======
<<<<<<< HEAD
<<<<<<< HEAD
<<<<<<< HEAD
<<<<<<< HEAD
<<<<<<< HEAD
<<<<<<< HEAD
=======
>>>>>>> 13656f5052 (GEOMESA-3254 Add Bloop build support)
=======
>>>>>>> b39bd292d4 (GEOMESA-3254 Add Bloop build support)
>>>>>>> fa60953a42 (GEOMESA-3254 Add Bloop build support)
=======
>>>>>>> ddf486214c (GEOMESA-3212 Postgis - convert constant functions to literals for SQL translation (#2875))
=======
<<<<<<< HEAD
<<<<<<< HEAD
<<<<<<< HEAD
<<<<<<< HEAD
=======
>>>>>>> d391bc18f0 (GEOMESA-3212 Postgis - convert constant functions to literals for SQL translation (#2875))
=======
>>>>>>> 75d5a347f8 (GEOMESA-3262 Postgis - add config to skip whole world filters)
=======
>>>>>>> d30ebb4092 (GEOMESA-3212 Postgis - convert constant functions to literals for SQL translation (#2875))
=======
>>>>>>> 4983e191e6 (GEOMESA-3212 Postgis - convert constant functions to literals for SQL translation (#2875))
<<<<<<< HEAD
<<<<<<< HEAD
=======
>>>>>>> 5a4c24e020 (GEOMESA-3254 Add Bloop build support)
=======
>>>>>>> fa60953a42 (GEOMESA-3254 Add Bloop build support)
=======
>>>>>>> e74fa3f690 (GEOMESA-3254 Add Bloop build support)
<<<<<<< HEAD
<<<<<<< HEAD
=======
>>>>>>> b8426b262b (GEOMESA-3212 Postgis - convert constant functions to literals for SQL translation (#2875))
=======
>>>>>>> b5c0452b13 (GEOMESA-3262 Postgis - add config to skip whole world filters)
=======
>>>>>>> d30ebb4092 (GEOMESA-3212 Postgis - convert constant functions to literals for SQL translation (#2875))
=======
>>>>>>> 30ec49c9c0 (GEOMESA-3212 Postgis - convert constant functions to literals for SQL translation (#2875))
=======
>>>>>>> b298e017f1 (GEOMESA-3254 Add Bloop build support)
=======
>>>>>>> fa60953a42 (GEOMESA-3254 Add Bloop build support)
=======
>>>>>>> 3e610250ce (GEOMESA-3254 Add Bloop build support)
=======
>>>>>>> e4a3f1a534 (GEOMESA-3212 Postgis - convert constant functions to literals for SQL translation (#2875))
=======
=======
>>>>>>> 75d5a347f8 (GEOMESA-3262 Postgis - add config to skip whole world filters)
>>>>>>> c0571b43e1 (GEOMESA-3262 Postgis - add config to skip whole world filters)
=======
>>>>>>> 01c8505b38 (GEOMESA-3212 Postgis - convert constant functions to literals for SQL translation (#2875))
=======
=======
>>>>>>> 5a4c24e020 (GEOMESA-3254 Add Bloop build support)
>>>>>>> 13656f5052 (GEOMESA-3254 Add Bloop build support)
=======
>>>>>>> b39bd292d4 (GEOMESA-3254 Add Bloop build support)
=======
=======
>>>>>>> b8426b262b (GEOMESA-3212 Postgis - convert constant functions to literals for SQL translation (#2875))
>>>>>>> d391bc18f0 (GEOMESA-3212 Postgis - convert constant functions to literals for SQL translation (#2875))
>>>>>>> dcd872c1a (GEOMESA-3212 Postgis - convert constant functions to literals for SQL translation (#2875))
>>>>>>> 5e000da485 (GEOMESA-3212 Postgis - convert constant functions to literals for SQL translation (#2875))
=======
>>>>>>> d845d7c1bd (GEOMESA-3254 Add Bloop build support)
=======
>>>>>>> 58d14a257e (GEOMESA-3254 Add Bloop build support)
<<<<<<< HEAD
<<<<<<< HEAD
=======
>>>>>>> be6b05230c (GEOMESA-3212 Postgis - convert constant functions to literals for SQL translation (#2875))
=======
=======
>>>>>>> dcd872c1a (GEOMESA-3212 Postgis - convert constant functions to literals for SQL translation (#2875))
>>>>>>> 713060f3a2 (GEOMESA-3212 Postgis - convert constant functions to literals for SQL translation (#2875))
<<<<<<< HEAD
<<<<<<< HEAD
<<<<<<< HEAD
=======
>>>>>>> eb0302a7c5 (GEOMESA-3212 Postgis - convert constant functions to literals for SQL translation (#2875))
import org.locationtech.geomesa.gt.partition.postgis.dialect.filter.LiteralFunctionVisitor
<<<<<<< HEAD
>>>>>>> dcd872c1ac (GEOMESA-3212 Postgis - convert constant functions to literals for SQL translation (#2875))
=======
=======
=======
>>>>>>> e694961e05 (GEOMESA-3212 Postgis - convert constant functions to literals for SQL translation (#2875))
<<<<<<< HEAD
<<<<<<< HEAD
<<<<<<< HEAD
<<<<<<< HEAD
<<<<<<< HEAD
<<<<<<< HEAD
=======
>>>>>>> 01c8505b38 (GEOMESA-3212 Postgis - convert constant functions to literals for SQL translation (#2875))
=======
>>>>>>> 13656f5052 (GEOMESA-3254 Add Bloop build support)
=======
>>>>>>> 09d87762c5 (GEOMESA-3254 Add Bloop build support)
=======
>>>>>>> 1dae86c846 (GEOMESA-3254 Add Bloop build support)
<<<<<<< HEAD
<<<<<<< HEAD
<<<<<<< HEAD
<<<<<<< HEAD
<<<<<<< HEAD
<<<<<<< HEAD
=======
>>>>>>> b39bd292d4 (GEOMESA-3254 Add Bloop build support)
=======
>>>>>>> d391bc18f0 (GEOMESA-3212 Postgis - convert constant functions to literals for SQL translation (#2875))
=======
>>>>>>> 50a84fd0eb (GEOMESA-3212 Postgis - convert constant functions to literals for SQL translation (#2875))
=======
>>>>>>> 4983e191e6 (GEOMESA-3212 Postgis - convert constant functions to literals for SQL translation (#2875))
<<<<<<< HEAD
<<<<<<< HEAD
=======
>>>>>>> 13656f5052 (GEOMESA-3254 Add Bloop build support)
=======
=======
>>>>>>> 09d87762c5 (GEOMESA-3254 Add Bloop build support)
>>>>>>> 5a4c24e020 (GEOMESA-3254 Add Bloop build support)
<<<<<<< HEAD
<<<<<<< HEAD
=======
>>>>>>> e74fa3f690 (GEOMESA-3254 Add Bloop build support)
=======
=======
>>>>>>> 50a84fd0eb (GEOMESA-3212 Postgis - convert constant functions to literals for SQL translation (#2875))
>>>>>>> b8426b262b (GEOMESA-3212 Postgis - convert constant functions to literals for SQL translation (#2875))
<<<<<<< HEAD
=======
>>>>>>> 30ec49c9c0 (GEOMESA-3212 Postgis - convert constant functions to literals for SQL translation (#2875))
=======
=======
>>>>>>> 09d87762c5 (GEOMESA-3254 Add Bloop build support)
>>>>>>> b298e017f1 (GEOMESA-3254 Add Bloop build support)
=======
>>>>>>> 3e610250ce (GEOMESA-3254 Add Bloop build support)
=======
=======
>>>>>>> 50a84fd0eb (GEOMESA-3212 Postgis - convert constant functions to literals for SQL translation (#2875))
>>>>>>> e4a3f1a534 (GEOMESA-3212 Postgis - convert constant functions to literals for SQL translation (#2875))
=======
>>>>>>> 01c8505b38 (GEOMESA-3212 Postgis - convert constant functions to literals for SQL translation (#2875))
=======
>>>>>>> 13656f5052 (GEOMESA-3254 Add Bloop build support)
=======
=======
>>>>>>> e74fa3f690 (GEOMESA-3254 Add Bloop build support)
>>>>>>> b39bd292d4 (GEOMESA-3254 Add Bloop build support)
=======
>>>>>>> d391bc18f0 (GEOMESA-3212 Postgis - convert constant functions to literals for SQL translation (#2875))
import org.locationtech.geomesa.gt.partition.postgis.dialect.filter.SplitFilterVisitor
<<<<<<< HEAD
>>>>>>> 1be2e3ecb (GEOMESA-3262 Postgis - add config to skip whole world filters)
<<<<<<< HEAD
>>>>>>> 7d4ed7605c (GEOMESA-3262 Postgis - add config to skip whole world filters)
=======
=======
=======
=======
=======
>>>>>>> dcd872c1a (GEOMESA-3212 Postgis - convert constant functions to literals for SQL translation (#2875))
>>>>>>> 5e000da48 (GEOMESA-3212 Postgis - convert constant functions to literals for SQL translation (#2875))
<<<<<<< HEAD
<<<<<<< HEAD
<<<<<<< HEAD
<<<<<<< HEAD
<<<<<<< HEAD
<<<<<<< HEAD
=======
>>>>>>> 01c8505b38 (GEOMESA-3212 Postgis - convert constant functions to literals for SQL translation (#2875))
=======
>>>>>>> 13656f5052 (GEOMESA-3254 Add Bloop build support)
=======
>>>>>>> d845d7c1b (GEOMESA-3254 Add Bloop build support)
=======
>>>>>>> 58d14a257 (GEOMESA-3254 Add Bloop build support)
<<<<<<< HEAD
<<<<<<< HEAD
<<<<<<< HEAD
<<<<<<< HEAD
<<<<<<< HEAD
<<<<<<< HEAD
=======
>>>>>>> b8426b262b (GEOMESA-3212 Postgis - convert constant functions to literals for SQL translation (#2875))
=======
>>>>>>> e4a3f1a534 (GEOMESA-3212 Postgis - convert constant functions to literals for SQL translation (#2875))
=======
>>>>>>> b39bd292d4 (GEOMESA-3254 Add Bloop build support)
=======
=======
>>>>>>> b8426b262b (GEOMESA-3212 Postgis - convert constant functions to literals for SQL translation (#2875))
>>>>>>> d391bc18f0 (GEOMESA-3212 Postgis - convert constant functions to literals for SQL translation (#2875))
=======
=======
>>>>>>> dcd872c1a (GEOMESA-3212 Postgis - convert constant functions to literals for SQL translation (#2875))
>>>>>>> 713060f3a (GEOMESA-3212 Postgis - convert constant functions to literals for SQL translation (#2875))
<<<<<<< HEAD
<<<<<<< HEAD
<<<<<<< HEAD
<<<<<<< HEAD
=======
>>>>>>> d391bc18f0 (GEOMESA-3212 Postgis - convert constant functions to literals for SQL translation (#2875))
=======
>>>>>>> 4983e191e6 (GEOMESA-3212 Postgis - convert constant functions to literals for SQL translation (#2875))
=======
=======
>>>>>>> d845d7c1b (GEOMESA-3254 Add Bloop build support)
>>>>>>> 5a4c24e020 (GEOMESA-3254 Add Bloop build support)
<<<<<<< HEAD
<<<<<<< HEAD
=======
>>>>>>> e74fa3f690 (GEOMESA-3254 Add Bloop build support)
=======
>>>>>>> b8426b262b (GEOMESA-3212 Postgis - convert constant functions to literals for SQL translation (#2875))
<<<<<<< HEAD
=======
>>>>>>> 30ec49c9c0 (GEOMESA-3212 Postgis - convert constant functions to literals for SQL translation (#2875))
=======
=======
>>>>>>> d845d7c1b (GEOMESA-3254 Add Bloop build support)
>>>>>>> b298e017f1 (GEOMESA-3254 Add Bloop build support)
=======
>>>>>>> 3e610250ce (GEOMESA-3254 Add Bloop build support)
=======
>>>>>>> e4a3f1a534 (GEOMESA-3212 Postgis - convert constant functions to literals for SQL translation (#2875))
=======
=======
>>>>>>> 4983e191e6 (GEOMESA-3212 Postgis - convert constant functions to literals for SQL translation (#2875))
>>>>>>> 01c8505b38 (GEOMESA-3212 Postgis - convert constant functions to literals for SQL translation (#2875))
=======
>>>>>>> 13656f5052 (GEOMESA-3254 Add Bloop build support)
=======
=======
>>>>>>> e74fa3f690 (GEOMESA-3254 Add Bloop build support)
>>>>>>> b39bd292d4 (GEOMESA-3254 Add Bloop build support)
=======
>>>>>>> d391bc18f0 (GEOMESA-3212 Postgis - convert constant functions to literals for SQL translation (#2875))
import org.locationtech.geomesa.gt.partition.postgis.dialect.filter.LiteralFunctionVisitor
>>>>>>> dcd872c1a (GEOMESA-3212 Postgis - convert constant functions to literals for SQL translation (#2875))
>>>>>>> 91b820951 (GEOMESA-3212 Postgis - convert constant functions to literals for SQL translation (#2875))
>>>>>>> 9fb20ad56c (GEOMESA-3212 Postgis - convert constant functions to literals for SQL translation (#2875))
=======
import org.locationtech.geomesa.gt.partition.postgis.dialect.filter.SplitFilterVisitor
=======
import org.locationtech.geomesa.gt.partition.postgis.dialect.filter.SplitFilterVisitor
>>>>>>> d7efff9563 (GEOMESA-3212 Postgis - convert constant functions to literals for SQL translation (#2875))
=======
=======
import org.locationtech.geomesa.gt.partition.postgis.dialect.filter.SplitFilterVisitor
=======
>>>>>>> d7efff9563 (GEOMESA-3212 Postgis - convert constant functions to literals for SQL translation (#2875))
=======
>>>>>>> dcd872c1a (GEOMESA-3212 Postgis - convert constant functions to literals for SQL translation (#2875))
import org.locationtech.geomesa.gt.partition.postgis.dialect.filter.LiteralFunctionVisitor
>>>>>>> 713060f3a2 (GEOMESA-3212 Postgis - convert constant functions to literals for SQL translation (#2875))
<<<<<<< HEAD
<<<<<<< HEAD
=======
<<<<<<< HEAD
<<<<<<< HEAD
<<<<<<< HEAD
>>>>>>> locationtech-main
=======
>>>>>>> f5b2148366 (GEOMESA-3212 Postgis - convert constant functions to literals for SQL translation (#2875))
>>>>>>> location-main
=======
>>>>>>> 48fcd67085 (GEOMESA-3212 Postgis - convert constant functions to literals for SQL translation (#2875))
>>>>>>> f5b2148366 (GEOMESA-3212 Postgis - convert constant functions to literals for SQL translation (#2875))
<<<<<<< HEAD
<<<<<<< HEAD
<<<<<<< HEAD
<<<<<<< HEAD
=======
>>>>>>> 30a68d04cb (GEOMESA-3212 Postgis - convert constant functions to literals for SQL translation (#2875))
=======
=======
=======
>>>>>>> f1532f2313 (GEOMESA-3254 Add Bloop build support)
=======
>>>>>>> 7564665969 (GEOMESA-3254 Add Bloop build support)
import org.locationtech.geomesa.gt.partition.postgis.dialect.filter.SplitFilterVisitor
=======
=======
import org.locationtech.geomesa.gt.partition.postgis.dialect.filter.SplitFilterVisitor
=======
>>>>>>> d4a1e3591e (GEOMESA-3212 Postgis - convert constant functions to literals for SQL translation (#2875))
=======
=======
>>>>>>> dcd872c1a (GEOMESA-3212 Postgis - convert constant functions to literals for SQL translation (#2875))
>>>>>>> 5e000da485 (GEOMESA-3212 Postgis - convert constant functions to literals for SQL translation (#2875))
<<<<<<< HEAD
<<<<<<< HEAD
<<<<<<< HEAD
>>>>>>> 406de071e1 (GEOMESA-3212 Postgis - convert constant functions to literals for SQL translation (#2875))
=======
=======
>>>>>>> d845d7c1bd (GEOMESA-3254 Add Bloop build support)
<<<<<<< HEAD
>>>>>>> f1532f2313 (GEOMESA-3254 Add Bloop build support)
=======
=======
>>>>>>> 58d14a257e (GEOMESA-3254 Add Bloop build support)
>>>>>>> 7564665969 (GEOMESA-3254 Add Bloop build support)
=======
>>>>>>> 64b3066584 (GEOMESA-3212 Postgis - convert constant functions to literals for SQL translation (#2875))
import org.locationtech.geomesa.gt.partition.postgis.dialect.filter.LiteralFunctionVisitor
<<<<<<< HEAD
>>>>>>> dcd872c1ac (GEOMESA-3212 Postgis - convert constant functions to literals for SQL translation (#2875))
<<<<<<< HEAD
>>>>>>> df43e72c50 (GEOMESA-3212 Postgis - convert constant functions to literals for SQL translation (#2875))
=======
=======
=======
import org.locationtech.geomesa.gt.partition.postgis.dialect.filter.SplitFilterVisitor
<<<<<<< HEAD
>>>>>>> 1be2e3ecb (GEOMESA-3262 Postgis - add config to skip whole world filters)
<<<<<<< HEAD
>>>>>>> 7d4ed7605c (GEOMESA-3262 Postgis - add config to skip whole world filters)
<<<<<<< HEAD
>>>>>>> 75d5a347f8 (GEOMESA-3262 Postgis - add config to skip whole world filters)
=======
=======
=======
=======
import org.locationtech.geomesa.gt.partition.postgis.dialect.filter.LiteralFunctionVisitor
>>>>>>> dcd872c1a (GEOMESA-3212 Postgis - convert constant functions to literals for SQL translation (#2875))
>>>>>>> 91b820951 (GEOMESA-3212 Postgis - convert constant functions to literals for SQL translation (#2875))
>>>>>>> 9fb20ad56c (GEOMESA-3212 Postgis - convert constant functions to literals for SQL translation (#2875))
>>>>>>> ad8bba7bb7 (GEOMESA-3212 Postgis - convert constant functions to literals for SQL translation (#2875))
=======
>>>>>>> a26c0acbb7 (GEOMESA-3212 Postgis - convert constant functions to literals for SQL translation (#2875))
<<<<<<< HEAD
<<<<<<< HEAD
=======
=======
>>>>>>> d4a1e3591e (GEOMESA-3212 Postgis - convert constant functions to literals for SQL translation (#2875))
=======
=======
>>>>>>> d845d7c1bd (GEOMESA-3254 Add Bloop build support)
>>>>>>> 7a84c9d22d (GEOMESA-3254 Add Bloop build support)
=======
>>>>>>> 9e49c1aac7 (GEOMESA-3254 Add Bloop build support)
=======
>>>>>>> be6b05230c (GEOMESA-3212 Postgis - convert constant functions to literals for SQL translation (#2875))
import org.locationtech.geomesa.gt.partition.postgis.dialect.filter.LiteralFunctionVisitor
<<<<<<< HEAD
>>>>>>> dcd872c1ac (GEOMESA-3212 Postgis - convert constant functions to literals for SQL translation (#2875))
<<<<<<< HEAD
>>>>>>> 7481483700 (GEOMESA-3212 Postgis - convert constant functions to literals for SQL translation (#2875))
=======
=======
=======
import org.locationtech.geomesa.gt.partition.postgis.dialect.filter.SplitFilterVisitor
<<<<<<< HEAD
>>>>>>> 1be2e3ecb (GEOMESA-3262 Postgis - add config to skip whole world filters)
<<<<<<< HEAD
>>>>>>> 7d4ed7605c (GEOMESA-3262 Postgis - add config to skip whole world filters)
<<<<<<< HEAD
>>>>>>> b5c0452b13 (GEOMESA-3262 Postgis - add config to skip whole world filters)
=======
=======
=======
=======
import org.locationtech.geomesa.gt.partition.postgis.dialect.filter.LiteralFunctionVisitor
>>>>>>> dcd872c1a (GEOMESA-3212 Postgis - convert constant functions to literals for SQL translation (#2875))
>>>>>>> 91b820951 (GEOMESA-3212 Postgis - convert constant functions to literals for SQL translation (#2875))
>>>>>>> 9fb20ad56c (GEOMESA-3212 Postgis - convert constant functions to literals for SQL translation (#2875))
>>>>>>> 56e5bdc2a5 (GEOMESA-3212 Postgis - convert constant functions to literals for SQL translation (#2875))
=======
>>>>>>> 83c2c09260 (GEOMESA-3212 Postgis - convert constant functions to literals for SQL translation (#2875))
=======
=======
=======
=======
>>>>>>> f1532f2313 (GEOMESA-3254 Add Bloop build support)
=======
>>>>>>> 7564665969 (GEOMESA-3254 Add Bloop build support)
import org.locationtech.geomesa.gt.partition.postgis.dialect.filter.SplitFilterVisitor
=======
=======
=======
>>>>>>> dcd872c1a (GEOMESA-3212 Postgis - convert constant functions to literals for SQL translation (#2875))
>>>>>>> 5e000da485 (GEOMESA-3212 Postgis - convert constant functions to literals for SQL translation (#2875))
<<<<<<< HEAD
>>>>>>> 406de071e1 (GEOMESA-3212 Postgis - convert constant functions to literals for SQL translation (#2875))
=======
=======
>>>>>>> d845d7c1bd (GEOMESA-3254 Add Bloop build support)
<<<<<<< HEAD
>>>>>>> f1532f2313 (GEOMESA-3254 Add Bloop build support)
=======
=======
>>>>>>> 58d14a257e (GEOMESA-3254 Add Bloop build support)
>>>>>>> 7564665969 (GEOMESA-3254 Add Bloop build support)
=======
>>>>>>> 64b3066584 (GEOMESA-3212 Postgis - convert constant functions to literals for SQL translation (#2875))
import org.locationtech.geomesa.gt.partition.postgis.dialect.filter.LiteralFunctionVisitor
<<<<<<< HEAD
>>>>>>> dcd872c1ac (GEOMESA-3212 Postgis - convert constant functions to literals for SQL translation (#2875))
<<<<<<< HEAD
>>>>>>> df43e72c50 (GEOMESA-3212 Postgis - convert constant functions to literals for SQL translation (#2875))
<<<<<<< HEAD
>>>>>>> 3ab56cb4cf (GEOMESA-3212 Postgis - convert constant functions to literals for SQL translation (#2875))
=======
=======
=======
=======
import org.locationtech.geomesa.gt.partition.postgis.dialect.filter.SplitFilterVisitor
<<<<<<< HEAD
>>>>>>> 1be2e3ecb (GEOMESA-3262 Postgis - add config to skip whole world filters)
<<<<<<< HEAD
>>>>>>> 7d4ed7605c (GEOMESA-3262 Postgis - add config to skip whole world filters)
<<<<<<< HEAD
>>>>>>> 75d5a347f8 (GEOMESA-3262 Postgis - add config to skip whole world filters)
<<<<<<< HEAD
>>>>>>> c0571b43e1 (GEOMESA-3262 Postgis - add config to skip whole world filters)
=======
=======
=======
=======
=======
import org.locationtech.geomesa.gt.partition.postgis.dialect.filter.LiteralFunctionVisitor
>>>>>>> dcd872c1a (GEOMESA-3212 Postgis - convert constant functions to literals for SQL translation (#2875))
>>>>>>> 91b820951 (GEOMESA-3212 Postgis - convert constant functions to literals for SQL translation (#2875))
>>>>>>> 9fb20ad56c (GEOMESA-3212 Postgis - convert constant functions to literals for SQL translation (#2875))
>>>>>>> ad8bba7bb7 (GEOMESA-3212 Postgis - convert constant functions to literals for SQL translation (#2875))
>>>>>>> 8ed0ae6564 (GEOMESA-3212 Postgis - convert constant functions to literals for SQL translation (#2875))
=======
>>>>>>> 30a68d04cb (GEOMESA-3212 Postgis - convert constant functions to literals for SQL translation (#2875))
=======
>>>>>>> locationtech-main
=======
>>>>>>> d7efff9563 (GEOMESA-3212 Postgis - convert constant functions to literals for SQL translation (#2875))
>>>>>>> 48fcd67085 (GEOMESA-3212 Postgis - convert constant functions to literals for SQL translation (#2875))
=======
>>>>>>> d7efff9563 (GEOMESA-3212 Postgis - convert constant functions to literals for SQL translation (#2875))
import org.locationtech.geomesa.gt.partition.postgis.dialect.functions.{LogCleaner, TruncateToPartition, TruncateToTenMinutes}
import org.locationtech.geomesa.gt.partition.postgis.dialect.procedures._
import org.locationtech.geomesa.gt.partition.postgis.dialect.tables._
import org.locationtech.geomesa.gt.partition.postgis.dialect.triggers.{DeleteTrigger, InsertTrigger, UpdateTrigger, WriteAheadTrigger}
import org.locationtech.geomesa.index.planning.QueryInterceptor.QueryInterceptorFactory
import org.locationtech.geomesa.utils.geotools.{Conversions, SimpleFeatureTypes}
<<<<<<< HEAD
import org.locationtech.geomesa.utils.io.{CloseWithLogging, WithClose}
=======
import org.locationtech.geomesa.utils.io.WithClose
<<<<<<< HEAD
<<<<<<< HEAD
<<<<<<< HEAD
<<<<<<< HEAD
<<<<<<< HEAD
<<<<<<< HEAD
<<<<<<< HEAD
<<<<<<< HEAD
<<<<<<< HEAD
<<<<<<< HEAD
<<<<<<< HEAD
<<<<<<< HEAD
<<<<<<< HEAD
<<<<<<< HEAD
<<<<<<< HEAD
<<<<<<< HEAD
<<<<<<< HEAD
>>>>>>> c87fc5b3a50 (GEOMESA-3215 Postgis - support List-type attributes)
=======
>>>>>>> e0fae91be7e (GEOMESA-3254 Add Bloop build support)
=======
>>>>>>> bfe0a05e667 (GEOMESA-3215 Postgis - support List-type attributes)
=======
>>>>>>> 6c766af4ddf (GEOMESA-3254 Add Bloop build support)
=======
>>>>>>> 08a41bb8d46 (GEOMESA-3215 Postgis - support List-type attributes)
=======
>>>>>>> e8ed988015f (GEOMESA-3254 Add Bloop build support)
=======
>>>>>>> 726079e9097 (GEOMESA-3215 Postgis - support List-type attributes)
=======
>>>>>>> 51815f9fda7 (GEOMESA-3254 Add Bloop build support)
=======
>>>>>>> a92fc0c344a (GEOMESA-3215 Postgis - support List-type attributes)
=======
>>>>>>> 869fc8fd799 (GEOMESA-3254 Add Bloop build support)
=======
>>>>>>> 233738d84b2 (GEOMESA-3215 Postgis - support List-type attributes)
=======
>>>>>>> 3e0e1d02715 (GEOMESA-3254 Add Bloop build support)
=======
>>>>>>> 83289c9a29b (GEOMESA-3215 Postgis - support List-type attributes)
=======
>>>>>>> 975518c8be2 (GEOMESA-3254 Add Bloop build support)
=======
>>>>>>> 4c7e5d0bb47 (Merge branch 'a0x8o' into stag0)
=======
>>>>>>> 34c5b2ded85 (GEOMESA-3254 Add Bloop build support)
=======
>>>>>>> b53a70f0715 (GEOMESA-3215 Postgis - support List-type attributes)
import org.locationtech.jts.geom._
<<<<<<< HEAD
=======
import org.opengis.feature.`type`.{AttributeDescriptor, GeometryDescriptor}
<<<<<<< HEAD
<<<<<<< HEAD
<<<<<<< HEAD
<<<<<<< HEAD
<<<<<<< HEAD
<<<<<<< HEAD
<<<<<<< HEAD
<<<<<<< HEAD
<<<<<<< HEAD
<<<<<<< HEAD
<<<<<<< HEAD
<<<<<<< HEAD
<<<<<<< HEAD
<<<<<<< HEAD
<<<<<<< HEAD
<<<<<<< HEAD
<<<<<<< HEAD
<<<<<<< HEAD
<<<<<<< HEAD
<<<<<<< HEAD
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
>>>>>>> f586fec5a3 (GEOMESA-3254 Add Bloop build support)
=======
>>>>>>> 29836dbeb7 (GEOMESA-3215 Postgis - support List-type attributes)
=======
>>>>>>> 34836e5f4e (GEOMESA-3215 Postgis - support List-type attributes)
=======
>>>>>>> 13656f5052 (GEOMESA-3254 Add Bloop build support)
=======
>>>>>>> 67ba50b23a (GEOMESA-3215 Postgis - support List-type attributes)
=======
>>>>>>> cdf5a8b797 (GEOMESA-3215 Postgis - support List-type attributes)
=======
>>>>>>> f1532f2313 (GEOMESA-3254 Add Bloop build support)
=======
>>>>>>> 7564665969 (GEOMESA-3254 Add Bloop build support)
=======
<<<<<<< HEAD
<<<<<<< HEAD
>>>>>>> 4b7c48b509 (GEOMESA-3215 Postgis - support List-type attributes)
=======
>>>>>>> 5a4c24e020 (GEOMESA-3254 Add Bloop build support)
=======
<<<<<<< HEAD
<<<<<<< HEAD
>>>>>>> 6edc66c3cb (GEOMESA-3215 Postgis - support List-type attributes)
=======
>>>>>>> 7e990c0c62 (GEOMESA-3215 Postgis - support List-type attributes)
=======
<<<<<<< HEAD
>>>>>>> 7a84c9d22d (GEOMESA-3254 Add Bloop build support)
=======
>>>>>>> 9e49c1aac7 (GEOMESA-3254 Add Bloop build support)
=======
>>>>>>> da609e20da (GEOMESA-3215 Postgis - support List-type attributes)
=======
>>>>>>> b298e017f1 (GEOMESA-3254 Add Bloop build support)
=======
>>>>>>> 6494375eef (GEOMESA-3215 Postgis - support List-type attributes)
=======
>>>>>>> 6de7ca735b (GEOMESA-3215 Postgis - support List-type attributes)
=======
>>>>>>> ec585da266 (GEOMESA-3215 Postgis - support List-type attributes)
=======
=======
>>>>>>> f1532f2313 (GEOMESA-3254 Add Bloop build support)
>>>>>>> c738f63bd9 (GEOMESA-3254 Add Bloop build support)
=======
=======
>>>>>>> f586fec5a3 (GEOMESA-3254 Add Bloop build support)
=======
>>>>>>> 4b7c48b509 (GEOMESA-3215 Postgis - support List-type attributes)
=======
>>>>>>> 34836e5f4e (GEOMESA-3215 Postgis - support List-type attributes)
=======
>>>>>>> 13656f5052 (GEOMESA-3254 Add Bloop build support)
=======
>>>>>>> 6edc66c3cb (GEOMESA-3215 Postgis - support List-type attributes)
=======
>>>>>>> 67ba50b23a (GEOMESA-3215 Postgis - support List-type attributes)
=======
>>>>>>> cdf5a8b797 (GEOMESA-3215 Postgis - support List-type attributes)
import org.opengis.feature.`type`.AttributeDescriptor
<<<<<<< HEAD
>>>>>>> ee1d5f2071 (GEOMESA-3215 Postgis - support List-type attributes)
=======
>>>>>>> ee1d5f207 (GEOMESA-3215 Postgis - support List-type attributes)
>>>>>>> cf1d94c7a8 (GEOMESA-3215 Postgis - support List-type attributes)
=======
>>>>>>> d845d7c1bd (GEOMESA-3254 Add Bloop build support)
<<<<<<< HEAD
<<<<<<< HEAD
<<<<<<< HEAD
<<<<<<< HEAD
<<<<<<< HEAD
<<<<<<< HEAD
=======
>>>>>>> c738f63bd9 (GEOMESA-3254 Add Bloop build support)
=======
>>>>>>> f586fec5a3 (GEOMESA-3254 Add Bloop build support)
=======
>>>>>>> 58d14a257e (GEOMESA-3254 Add Bloop build support)
=======
=======
import org.opengis.feature.`type`.AttributeDescriptor
>>>>>>> ee1d5f207 (GEOMESA-3215 Postgis - support List-type attributes)
>>>>>>> 42af7673bd (GEOMESA-3215 Postgis - support List-type attributes)
<<<<<<< HEAD
<<<<<<< HEAD
<<<<<<< HEAD
<<<<<<< HEAD
<<<<<<< HEAD
<<<<<<< HEAD
=======
>>>>>>> 34836e5f4e (GEOMESA-3215 Postgis - support List-type attributes)
=======
>>>>>>> 13656f5052 (GEOMESA-3254 Add Bloop build support)
=======
>>>>>>> 63a045a753 (GEOMESA-3254 Add Bloop build support)
=======
=======
import org.opengis.feature.`type`.AttributeDescriptor
>>>>>>> ee1d5f207 (GEOMESA-3215 Postgis - support List-type attributes)
>>>>>>> 75e1524a30 (GEOMESA-3215 Postgis - support List-type attributes)
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
>>>>>>> 67ba50b23a (GEOMESA-3215 Postgis - support List-type attributes)
=======
=======
>>>>>>> 7e990c0c62 (GEOMESA-3215 Postgis - support List-type attributes)
>>>>>>> cdf5a8b797 (GEOMESA-3215 Postgis - support List-type attributes)
=======
=======
import org.opengis.feature.`type`.AttributeDescriptor
>>>>>>> ee1d5f207 (GEOMESA-3215 Postgis - support List-type attributes)
>>>>>>> 7542dc78d8 (GEOMESA-3215 Postgis - support List-type attributes)
<<<<<<< HEAD
<<<<<<< HEAD
<<<<<<< HEAD
<<<<<<< HEAD
=======
>>>>>>> cdf5a8b797 (GEOMESA-3215 Postgis - support List-type attributes)
=======
=======
import org.opengis.feature.`type`.AttributeDescriptor
<<<<<<< HEAD
>>>>>>> ee1d5f2071 (GEOMESA-3215 Postgis - support List-type attributes)
<<<<<<< HEAD
>>>>>>> 2912d58b06 (GEOMESA-3215 Postgis - support List-type attributes)
=======
=======
>>>>>>> ee1d5f207 (GEOMESA-3215 Postgis - support List-type attributes)
>>>>>>> cf1d94c7a8 (GEOMESA-3215 Postgis - support List-type attributes)
>>>>>>> bf9e5cdd91 (GEOMESA-3215 Postgis - support List-type attributes)
=======
>>>>>>> f1532f2313 (GEOMESA-3254 Add Bloop build support)
<<<<<<< HEAD
<<<<<<< HEAD
=======
>>>>>>> f586fec5a3 (GEOMESA-3254 Add Bloop build support)
=======
=======
>>>>>>> 58d14a257e (GEOMESA-3254 Add Bloop build support)
>>>>>>> 7564665969 (GEOMESA-3254 Add Bloop build support)
<<<<<<< HEAD
<<<<<<< HEAD
=======
>>>>>>> 4b7c48b509 (GEOMESA-3215 Postgis - support List-type attributes)
=======
=======
>>>>>>> 63a045a753 (GEOMESA-3254 Add Bloop build support)
>>>>>>> 5a4c24e020 (GEOMESA-3254 Add Bloop build support)
<<<<<<< HEAD
<<<<<<< HEAD
=======
>>>>>>> 6edc66c3cb (GEOMESA-3215 Postgis - support List-type attributes)
=======
>>>>>>> 7e990c0c62 (GEOMESA-3215 Postgis - support List-type attributes)
<<<<<<< HEAD
<<<<<<< HEAD
=======
=======
import org.opengis.feature.`type`.AttributeDescriptor
<<<<<<< HEAD
>>>>>>> ee1d5f2071 (GEOMESA-3215 Postgis - support List-type attributes)
<<<<<<< HEAD
>>>>>>> 36a7119501 (GEOMESA-3215 Postgis - support List-type attributes)
=======
=======
>>>>>>> ee1d5f207 (GEOMESA-3215 Postgis - support List-type attributes)
>>>>>>> cf1d94c7a8 (GEOMESA-3215 Postgis - support List-type attributes)
>>>>>>> a207fd51c3 (GEOMESA-3215 Postgis - support List-type attributes)
=======
>>>>>>> 7a84c9d22d (GEOMESA-3254 Add Bloop build support)
=======
=======
>>>>>>> 58d14a257e (GEOMESA-3254 Add Bloop build support)
>>>>>>> 9e49c1aac7 (GEOMESA-3254 Add Bloop build support)
=======
>>>>>>> da609e20da (GEOMESA-3215 Postgis - support List-type attributes)
=======
=======
>>>>>>> 63a045a753 (GEOMESA-3254 Add Bloop build support)
>>>>>>> b298e017f1 (GEOMESA-3254 Add Bloop build support)
=======
>>>>>>> 6494375eef (GEOMESA-3215 Postgis - support List-type attributes)
=======
>>>>>>> 6de7ca735b (GEOMESA-3215 Postgis - support List-type attributes)
=======
=======
=======
import org.opengis.feature.`type`.AttributeDescriptor
<<<<<<< HEAD
>>>>>>> ee1d5f2071 (GEOMESA-3215 Postgis - support List-type attributes)
<<<<<<< HEAD
>>>>>>> 2912d58b06 (GEOMESA-3215 Postgis - support List-type attributes)
<<<<<<< HEAD
>>>>>>> ec585da266 (GEOMESA-3215 Postgis - support List-type attributes)
=======
=======
=======
>>>>>>> ee1d5f207 (GEOMESA-3215 Postgis - support List-type attributes)
>>>>>>> cf1d94c7a8 (GEOMESA-3215 Postgis - support List-type attributes)
>>>>>>> bf9e5cdd91 (GEOMESA-3215 Postgis - support List-type attributes)
>>>>>>> 6768ebe0c2 (GEOMESA-3215 Postgis - support List-type attributes)
=======
>>>>>>> c738f63bd9 (GEOMESA-3254 Add Bloop build support)
=======
>>>>>>> f586fec5a3 (GEOMESA-3254 Add Bloop build support)
=======
=======
>>>>>>> 4b7c48b509 (GEOMESA-3215 Postgis - support List-type attributes)
>>>>>>> 34836e5f4e (GEOMESA-3215 Postgis - support List-type attributes)
=======
>>>>>>> 13656f5052 (GEOMESA-3254 Add Bloop build support)
=======
=======
>>>>>>> 6edc66c3cb (GEOMESA-3215 Postgis - support List-type attributes)
>>>>>>> 67ba50b23a (GEOMESA-3215 Postgis - support List-type attributes)
=======
>>>>>>> cdf5a8b797 (GEOMESA-3215 Postgis - support List-type attributes)
=======
>>>>>>> locationtech-main
=======
=======
import org.opengis.feature.`type`.AttributeDescriptor
>>>>>>> ee1d5f207 (GEOMESA-3215 Postgis - support List-type attributes)
>>>>>>> a980818468 (GEOMESA-3215 Postgis - support List-type attributes)
>>>>>>> 29836dbeb7 (GEOMESA-3215 Postgis - support List-type attributes)
=======
=======
import org.opengis.feature.`type`.AttributeDescriptor
>>>>>>> ee1d5f207 (GEOMESA-3215 Postgis - support List-type attributes)
>>>>>>> a980818468 (GEOMESA-3215 Postgis - support List-type attributes)
import org.opengis.feature.simple.SimpleFeatureType
import org.opengis.filter.Filter
>>>>>>> a8e0698bf72 (GEOMESA-3215 Postgis - support List-type attributes)

import java.sql.{Connection, DatabaseMetaData, ResultSet, Types}
<<<<<<< HEAD
import scala.util.Try
<<<<<<< HEAD
<<<<<<< HEAD
<<<<<<< HEAD
<<<<<<< HEAD
<<<<<<< HEAD
<<<<<<< HEAD
<<<<<<< HEAD
<<<<<<< HEAD
<<<<<<< HEAD
<<<<<<< HEAD
<<<<<<< HEAD
<<<<<<< HEAD
<<<<<<< HEAD
<<<<<<< HEAD
<<<<<<< HEAD
<<<<<<< HEAD
<<<<<<< HEAD
<<<<<<< HEAD
<<<<<<< HEAD
<<<<<<< HEAD
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
>>>>>>> f586fec5a3 (GEOMESA-3254 Add Bloop build support)
=======
>>>>>>> 29836dbeb7 (GEOMESA-3215 Postgis - support List-type attributes)
=======
>>>>>>> 34836e5f4e (GEOMESA-3215 Postgis - support List-type attributes)
=======
>>>>>>> 13656f5052 (GEOMESA-3254 Add Bloop build support)
=======
>>>>>>> 67ba50b23a (GEOMESA-3215 Postgis - support List-type attributes)
=======
>>>>>>> cdf5a8b797 (GEOMESA-3215 Postgis - support List-type attributes)
=======
>>>>>>> f1532f2313 (GEOMESA-3254 Add Bloop build support)
=======
>>>>>>> 7564665969 (GEOMESA-3254 Add Bloop build support)
=======
>>>>>>> 4b7c48b509 (GEOMESA-3215 Postgis - support List-type attributes)
=======
>>>>>>> 5a4c24e020 (GEOMESA-3254 Add Bloop build support)
=======
>>>>>>> 6edc66c3cb (GEOMESA-3215 Postgis - support List-type attributes)
=======
>>>>>>> 7e990c0c62 (GEOMESA-3215 Postgis - support List-type attributes)
=======
<<<<<<< HEAD
>>>>>>> 4b7c48b509 (GEOMESA-3215 Postgis - support List-type attributes)
=======
>>>>>>> 5a4c24e020 (GEOMESA-3254 Add Bloop build support)
=======
>>>>>>> 6edc66c3cb (GEOMESA-3215 Postgis - support List-type attributes)
=======
>>>>>>> 7e990c0c62 (GEOMESA-3215 Postgis - support List-type attributes)
=======
>>>>>>> 7a84c9d22d (GEOMESA-3254 Add Bloop build support)
=======
>>>>>>> 9e49c1aac7 (GEOMESA-3254 Add Bloop build support)
=======
>>>>>>> da609e20da (GEOMESA-3215 Postgis - support List-type attributes)
=======
>>>>>>> b298e017f1 (GEOMESA-3254 Add Bloop build support)
=======
>>>>>>> 6494375eef (GEOMESA-3215 Postgis - support List-type attributes)
=======
>>>>>>> 6de7ca735b (GEOMESA-3215 Postgis - support List-type attributes)
=======
>>>>>>> ec585da266 (GEOMESA-3215 Postgis - support List-type attributes)
=======
=======
>>>>>>> f1532f2313 (GEOMESA-3254 Add Bloop build support)
>>>>>>> c738f63bd9 (GEOMESA-3254 Add Bloop build support)
=======
=======
>>>>>>> f586fec5a3 (GEOMESA-3254 Add Bloop build support)
<<<<<<< HEAD
>>>>>>> ee1d5f2071 (GEOMESA-3215 Postgis - support List-type attributes)
=======
>>>>>>> ee1d5f207 (GEOMESA-3215 Postgis - support List-type attributes)
>>>>>>> cf1d94c7a8 (GEOMESA-3215 Postgis - support List-type attributes)
=======
>>>>>>> d845d7c1bd (GEOMESA-3254 Add Bloop build support)
<<<<<<< HEAD
<<<<<<< HEAD
<<<<<<< HEAD
<<<<<<< HEAD
<<<<<<< HEAD
<<<<<<< HEAD
=======
>>>>>>> c738f63bd9 (GEOMESA-3254 Add Bloop build support)
=======
>>>>>>> f586fec5a3 (GEOMESA-3254 Add Bloop build support)
=======
>>>>>>> 58d14a257e (GEOMESA-3254 Add Bloop build support)
=======
=======
>>>>>>> ee1d5f207 (GEOMESA-3215 Postgis - support List-type attributes)
>>>>>>> 42af7673bd (GEOMESA-3215 Postgis - support List-type attributes)
<<<<<<< HEAD
<<<<<<< HEAD
<<<<<<< HEAD
<<<<<<< HEAD
<<<<<<< HEAD
<<<<<<< HEAD
=======
>>>>>>> 34836e5f4e (GEOMESA-3215 Postgis - support List-type attributes)
=======
>>>>>>> 13656f5052 (GEOMESA-3254 Add Bloop build support)
=======
>>>>>>> 63a045a753 (GEOMESA-3254 Add Bloop build support)
=======
=======
>>>>>>> ee1d5f207 (GEOMESA-3215 Postgis - support List-type attributes)
>>>>>>> 75e1524a30 (GEOMESA-3215 Postgis - support List-type attributes)
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
>>>>>>> 67ba50b23a (GEOMESA-3215 Postgis - support List-type attributes)
=======
=======
>>>>>>> 7e990c0c62 (GEOMESA-3215 Postgis - support List-type attributes)
>>>>>>> cdf5a8b797 (GEOMESA-3215 Postgis - support List-type attributes)
=======
=======
>>>>>>> ee1d5f207 (GEOMESA-3215 Postgis - support List-type attributes)
>>>>>>> 7542dc78d8 (GEOMESA-3215 Postgis - support List-type attributes)
<<<<<<< HEAD
<<<<<<< HEAD
<<<<<<< HEAD
<<<<<<< HEAD
=======
>>>>>>> cdf5a8b797 (GEOMESA-3215 Postgis - support List-type attributes)
=======
=======
<<<<<<< HEAD
>>>>>>> ee1d5f2071 (GEOMESA-3215 Postgis - support List-type attributes)
<<<<<<< HEAD
>>>>>>> 2912d58b06 (GEOMESA-3215 Postgis - support List-type attributes)
=======
=======
>>>>>>> ee1d5f207 (GEOMESA-3215 Postgis - support List-type attributes)
>>>>>>> cf1d94c7a8 (GEOMESA-3215 Postgis - support List-type attributes)
>>>>>>> bf9e5cdd91 (GEOMESA-3215 Postgis - support List-type attributes)
=======
>>>>>>> f1532f2313 (GEOMESA-3254 Add Bloop build support)
<<<<<<< HEAD
<<<<<<< HEAD
=======
>>>>>>> f586fec5a3 (GEOMESA-3254 Add Bloop build support)
=======
=======
>>>>>>> 58d14a257e (GEOMESA-3254 Add Bloop build support)
>>>>>>> 7564665969 (GEOMESA-3254 Add Bloop build support)
<<<<<<< HEAD
<<<<<<< HEAD
=======
>>>>>>> 4b7c48b509 (GEOMESA-3215 Postgis - support List-type attributes)
=======
=======
>>>>>>> 63a045a753 (GEOMESA-3254 Add Bloop build support)
>>>>>>> 5a4c24e020 (GEOMESA-3254 Add Bloop build support)
<<<<<<< HEAD
<<<<<<< HEAD
=======
>>>>>>> 6edc66c3cb (GEOMESA-3215 Postgis - support List-type attributes)
=======
>>>>>>> 7e990c0c62 (GEOMESA-3215 Postgis - support List-type attributes)
<<<<<<< HEAD
<<<<<<< HEAD
=======
=======
<<<<<<< HEAD
>>>>>>> ee1d5f2071 (GEOMESA-3215 Postgis - support List-type attributes)
<<<<<<< HEAD
>>>>>>> 36a7119501 (GEOMESA-3215 Postgis - support List-type attributes)
=======
=======
>>>>>>> ee1d5f207 (GEOMESA-3215 Postgis - support List-type attributes)
>>>>>>> cf1d94c7a8 (GEOMESA-3215 Postgis - support List-type attributes)
>>>>>>> a207fd51c3 (GEOMESA-3215 Postgis - support List-type attributes)
=======
>>>>>>> 7a84c9d22d (GEOMESA-3254 Add Bloop build support)
=======
=======
>>>>>>> 58d14a257e (GEOMESA-3254 Add Bloop build support)
>>>>>>> 9e49c1aac7 (GEOMESA-3254 Add Bloop build support)
=======
>>>>>>> da609e20da (GEOMESA-3215 Postgis - support List-type attributes)
=======
=======
>>>>>>> 63a045a753 (GEOMESA-3254 Add Bloop build support)
>>>>>>> b298e017f1 (GEOMESA-3254 Add Bloop build support)
=======
>>>>>>> 6494375eef (GEOMESA-3215 Postgis - support List-type attributes)
=======
>>>>>>> 6de7ca735b (GEOMESA-3215 Postgis - support List-type attributes)
=======
=======
=======
<<<<<<< HEAD
>>>>>>> ee1d5f2071 (GEOMESA-3215 Postgis - support List-type attributes)
<<<<<<< HEAD
>>>>>>> 2912d58b06 (GEOMESA-3215 Postgis - support List-type attributes)
<<<<<<< HEAD
>>>>>>> ec585da266 (GEOMESA-3215 Postgis - support List-type attributes)
=======
=======
=======
>>>>>>> ee1d5f207 (GEOMESA-3215 Postgis - support List-type attributes)
>>>>>>> cf1d94c7a8 (GEOMESA-3215 Postgis - support List-type attributes)
>>>>>>> bf9e5cdd91 (GEOMESA-3215 Postgis - support List-type attributes)
>>>>>>> 6768ebe0c2 (GEOMESA-3215 Postgis - support List-type attributes)
=======
>>>>>>> c738f63bd9 (GEOMESA-3254 Add Bloop build support)
=======
>>>>>>> f586fec5a3 (GEOMESA-3254 Add Bloop build support)
=======
=======
>>>>>>> 4b7c48b509 (GEOMESA-3215 Postgis - support List-type attributes)
>>>>>>> 34836e5f4e (GEOMESA-3215 Postgis - support List-type attributes)
=======
>>>>>>> 13656f5052 (GEOMESA-3254 Add Bloop build support)
=======
=======
>>>>>>> 6edc66c3cb (GEOMESA-3215 Postgis - support List-type attributes)
>>>>>>> 67ba50b23a (GEOMESA-3215 Postgis - support List-type attributes)
=======
>>>>>>> cdf5a8b797 (GEOMESA-3215 Postgis - support List-type attributes)
=======
>>>>>>> locationtech-main
=======
=======
>>>>>>> ee1d5f207 (GEOMESA-3215 Postgis - support List-type attributes)
>>>>>>> a980818468 (GEOMESA-3215 Postgis - support List-type attributes)
>>>>>>> 29836dbeb7 (GEOMESA-3215 Postgis - support List-type attributes)
=======
=======
>>>>>>> ee1d5f207 (GEOMESA-3215 Postgis - support List-type attributes)
>>>>>>> a980818468 (GEOMESA-3215 Postgis - support List-type attributes)

class PartitionedPostgisDialect(store: JDBCDataStore) extends PostGISDialect(store) with StrictLogging {

  import org.locationtech.geomesa.utils.geotools.RichAttributeDescriptors.RichAttributeDescriptor

  import scala.collection.JavaConverters._

  // order of calls from JDBCDataStore during create schema:
  //  encodeCreateTable
  //  encodeTableName
  //  encodePrimaryKey
  //  encodeColumnName
  //  encodeColumnType
  //  encodePostColumnCreateTable
  //  encodePostCreateTable
  //  postCreateTable

  // order of calls during remove schema:
  //  preDropTable
  //  "DROP TABLE " + encodeTableName
  //  postDropTable

  // state for checking when we want to use the write_ahead table in place of the main view
  private val dropping = new ThreadLocal[Boolean]() {
    override def initialValue(): Boolean = false
  }

  private val interceptors = {
    val factory = QueryInterceptorFactory(store)
    sys.addShutdownHook(CloseWithLogging(factory)) // we don't have any API hooks to dispose of things...
    factory
  }

  /**
   * Re-create the PLPG/SQL procedures associated with a feature type. This can be used
   * to 'upgrade in place' if the code is changed.
   *
   * @param schemaName database schema, e.g. "public"
   * @param sft feature type
   * @param cx connection
   */
  def upgrade(schemaName: String, sft: SimpleFeatureType, cx: Connection): Unit =
    postCreateTable(schemaName, sft, cx)

<<<<<<< HEAD
  override def getDesiredTablesType: Array[String] = Array("VIEW", "TABLE")

=======
<<<<<<< HEAD
<<<<<<< HEAD
<<<<<<< HEAD
<<<<<<< HEAD
<<<<<<< HEAD
<<<<<<< HEAD
<<<<<<< HEAD
=======
>>>>>>> e74fa3f690 (GEOMESA-3254 Add Bloop build support)
=======
>>>>>>> 3e610250ce (GEOMESA-3254 Add Bloop build support)
=======
>>>>>>> f586fec5a3 (GEOMESA-3254 Add Bloop build support)
=======
=======
>>>>>>> e74fa3f690 (GEOMESA-3254 Add Bloop build support)
>>>>>>> b39bd292d4 (GEOMESA-3254 Add Bloop build support)
>>>>>>> 58d14a257e (GEOMESA-3254 Add Bloop build support)
=======
>>>>>>> 58d14a257 (GEOMESA-3254 Add Bloop build support)
>>>>>>> fa60953a42 (GEOMESA-3254 Add Bloop build support)
<<<<<<< HEAD
<<<<<<< HEAD
<<<<<<< HEAD
<<<<<<< HEAD
=======
>>>>>>> b39bd292d4 (GEOMESA-3254 Add Bloop build support)
=======
>>>>>>> 58d14a257e (GEOMESA-3254 Add Bloop build support)
>>>>>>> 7564665969 (GEOMESA-3254 Add Bloop build support)
=======
>>>>>>> e74fa3f690 (GEOMESA-3254 Add Bloop build support)
<<<<<<< HEAD
=======
>>>>>>> 58d14a257e (GEOMESA-3254 Add Bloop build support)
>>>>>>> 9e49c1aac7 (GEOMESA-3254 Add Bloop build support)
=======
>>>>>>> 3e610250ce (GEOMESA-3254 Add Bloop build support)
=======
=======
>>>>>>> 58d14a257e (GEOMESA-3254 Add Bloop build support)
>>>>>>> 7564665969 (GEOMESA-3254 Add Bloop build support)
>>>>>>> f586fec5a3 (GEOMESA-3254 Add Bloop build support)
=======
>>>>>>> b39bd292d4 (GEOMESA-3254 Add Bloop build support)
  // filter out the partition tables from exposed feature types
  override def includeTable(schemaName: String, tableName: String, cx: Connection): Boolean = {
    super.includeTable(schemaName, tableName, cx) && {
      val metadata = cx.getMetaData
      val schemaPattern = store.escapeNamePattern(metadata, schemaName)
      val tablePattern = store.escapeNamePattern(metadata, tableName)
      val rs = metadata.getTables(null, schemaPattern, tablePattern, Array("VIEW"))
      try { rs.next() } finally {
        rs.close()
      }
    }
  }

  override def encodeCreateTable(sql: StringBuffer): Unit =
    sql.append("CREATE TABLE IF NOT EXISTS ")

  override def encodeCreateTable(sql: StringBuffer): Unit =
    sql.append("CREATE TABLE IF NOT EXISTS ")

  override def encodeTableName(raw: String, sql: StringBuffer): Unit = {
    if (dropping.get) {
      // redirect from the view as DROP TABLE is hard-coded by the JDBC data store,
      // and cascade the drop to delete any write ahead partitions
      sql.append(escape(raw + WriteAheadTableSuffix.raw)).append(" CASCADE")
      dropping.remove()
    } else {
      sql.append(escape(raw))
    }
  }

  override def encodePrimaryKey(column: String, sql: StringBuffer): Unit = {
    encodeColumnName(null, column, sql)
    // make our primary key a string instead of the default integer
    sql.append(" character varying NOT NULL")
  }

  override def encodePostCreateTable(tableName: String, sql: StringBuffer): Unit = {
    val i = sql.indexOf(tableName)
    if (i == -1) {
      logger.warn(s"Did not find table name '$tableName' in CREATE TABLE statement: $sql")
    } else {
      // rename to the write ahead table
      sql.insert(i + tableName.length, WriteAheadTableSuffix.raw)
<<<<<<< HEAD
    }
  }

  override def postCreateTable(schemaName: String, sft: SimpleFeatureType, cx: Connection): Unit = {
    // Throw an error if the sft name is longer than 31 characters
    if (sft.getTypeName.length() > 31) {
      val errorMsg = "Can't create schema: type name exceeds max supported length of 31 characters"
      throw new IllegalArgumentException(errorMsg)
    }

    // note: we skip the call to `super`, which creates a spatial index (that we don't want), and which
    // alters the geometry column types (which we handle in the create statement)
    val info = TypeInfo(schemaName, sft)
    implicit val ex: ExecutionContext = new ExecutionContext(cx)
    try {
      PartitionedPostgisDialect.Commands.foreach(_.create(info))
    } finally {
      ex.close()
    }
  }

  override def postCreateAttribute(
      att: AttributeDescriptor,
      tableName: String,
      schemaName: String,
      cx: Connection): Unit = {

    def withCol(fn: ResultSet => Unit): Unit = {
      val meta = cx.getMetaData
      def escape(name: String): String = store.escapeNamePattern(meta, name)
      WithClose(meta.getColumns(cx.getCatalog, escape(schemaName), escape(tableName), escape(att.getLocalName))) { cols =>
        if (cols.next()) {
          fn(cols)
        } else {
          logger.warn(s"Could not retrieve column metadata for attribute ${att.getLocalName}")
        }
      }
    }

    if (classOf[String].isAssignableFrom(att.getType.getBinding)) {
      withCol { cols =>
        val typeName = cols.getString("TYPE_NAME")
        if ("json".equalsIgnoreCase(typeName) || "jsonb".equalsIgnoreCase(typeName)) {
          att.getUserData.put(SimpleFeatureTypes.AttributeOptions.OptJson, "true")
        }
      }
    } else if (classOf[java.util.List[_]].isAssignableFrom(att.getType.getBinding)) {
      withCol { cols =>
        val arrayType = super.getMapping(cols, cx)
        if (arrayType.isArray) {
          att.getUserData.put(SimpleFeatureTypes.AttributeConfigs.UserDataListType, arrayType.getComponentType.getName)
        } else {
          logger.warn(s"Found a list-type attribute but database type was not an array for ${att.getLocalName}")
        }
      }
<<<<<<< HEAD
=======
    }
  }

  override def postCreateTable(schemaName: String, sft: SimpleFeatureType, cx: Connection): Unit = {
    // note: we skip the call to `super`, which creates a spatial index (that we don't want), and which
    // alters the geometry column types (which we handle in the create statement)
    val info = TypeInfo(schemaName, sft)
    implicit val ex: ExecutionContext = new ExecutionContext(cx)
    try {
      PartitionedPostgisDialect.Commands.foreach(_.create(info))
    } finally {
      ex.close()
>>>>>>> 58d14a257e (GEOMESA-3254 Add Bloop build support)
=======
>>>>>>> 6c2babb799 (GEOMESA-3301 Partitioned PostGIS - fix Avro export)
    }
  }

  override def postCreateFeatureType(
      sft: SimpleFeatureType,
      metadata: DatabaseMetaData,
      schemaName: String,
      cx: Connection): Unit = {

    import PartitionedPostgisDialect.Config._

    // normally views get set to read-only, override that here since we use triggers to delegate writes
    sft.getUserData.remove(JDBCDataStore.JDBC_READ_ONLY)

    // populate user data
    val userDataSql = s"select key, value from ${escape(schemaName)}.${UserDataTable.Name.quoted} where type_name = ?"
    WithClose(cx.prepareStatement(userDataSql)) { statement =>
      statement.setString(1, sft.getTypeName)
      WithClose(statement.executeQuery()) { rs =>
        while (rs.next()) {
          sft.getUserData.put(rs.getString(1), rs.getString(2))
        }
      }
    }

    // populate tablespaces
    val tablespaceSql =
      s"select table_space, table_type from " +
          s"${escape(schemaName)}.${PartitionTablespacesTable.Name.quoted} where type_name = ?"
    WithClose(cx.prepareStatement(tablespaceSql)) { statement =>
      statement.setString(1, sft.getTypeName)
      WithClose(statement.executeQuery()) { rs =>
        while (rs.next()) {
          val ts = rs.getString(1)
          if (ts != null && ts.nonEmpty) {
            rs.getString(2) match {
              case WriteAheadTableSuffix.raw => sft.getUserData.put(WriteAheadTableSpace, ts)
              case PartitionedWriteAheadTableSuffix.raw => sft.getUserData.put(WriteAheadPartitionsTableSpace, ts)
              case PartitionedTableSuffix.raw => sft.getUserData.put(MainTableSpace, ts)
              case s => logger.warn(s"Ignoring unexpected tablespace table: $s")
            }
          }
        }
      }
    }
  }

  override def preDropTable(schemaName: String, sft: SimpleFeatureType, cx: Connection): Unit = {
    // due to the JDBCDataStore hard-coding "DROP TABLE" we have to redirect it away from the main view,
    // and we can't drop the write ahead table so that it has something to drop
    dropping.set(true)
    val info = TypeInfo(schemaName, sft)

    implicit val ex: ExecutionContext = new ExecutionContext(cx)
    try {
      PartitionedPostgisDialect.Commands.reverse.filter(_ != WriteAheadTable).foreach(_.drop(info))
    } finally {
      ex.close()
    }
  }

  override def postDropTable(schemaName: String, sft: SimpleFeatureType, cx: Connection): Unit = {
    val info = TypeInfo(schemaName, sft)

    implicit val ex: ExecutionContext = new ExecutionContext(cx)
    try {
      WriteAheadTable.drop(info) // drop the write ahead name sequence
    } finally {
      ex.close()
    }

    // rename the sft so that configuration is applied to the write ahead table
    super.postDropTable(schemaName, SimpleFeatureTypes.renameSft(sft, info.tables.writeAhead.name.raw), cx)
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
>>>>>>> 48fcd67085 (GEOMESA-3212 Postgis - convert constant functions to literals for SQL translation (#2875))
=======
>>>>>>> 3ab56cb4cf (GEOMESA-3212 Postgis - convert constant functions to literals for SQL translation (#2875))
=======
>>>>>>> edde3a188e (GEOMESA-3212 Postgis - convert constant functions to literals for SQL translation (#2875))
=======
>>>>>>> c0571b43e1 (GEOMESA-3262 Postgis - add config to skip whole world filters)
=======
>>>>>>> 8ed0ae6564 (GEOMESA-3212 Postgis - convert constant functions to literals for SQL translation (#2875))
=======
>>>>>>> 01c8505b38 (GEOMESA-3212 Postgis - convert constant functions to literals for SQL translation (#2875))
=======
>>>>>>> 30a68d04cb (GEOMESA-3212 Postgis - convert constant functions to literals for SQL translation (#2875))
=======
>>>>>>> f5b2148366 (GEOMESA-3212 Postgis - convert constant functions to literals for SQL translation (#2875))
=======
>>>>>>> df43e72c50 (GEOMESA-3212 Postgis - convert constant functions to literals for SQL translation (#2875))
<<<<<<< HEAD
<<<<<<< HEAD
=======
>>>>>>> 406de071e1 (GEOMESA-3212 Postgis - convert constant functions to literals for SQL translation (#2875))
=======
>>>>>>> 75d5a347f8 (GEOMESA-3262 Postgis - add config to skip whole world filters)
<<<<<<< HEAD
<<<<<<< HEAD
=======
>>>>>>> ad8bba7bb7 (GEOMESA-3212 Postgis - convert constant functions to literals for SQL translation (#2875))
=======
>>>>>>> 4983e191e6 (GEOMESA-3212 Postgis - convert constant functions to literals for SQL translation (#2875))
<<<<<<< HEAD
<<<<<<< HEAD
=======
>>>>>>> 30a68d04cb (GEOMESA-3212 Postgis - convert constant functions to literals for SQL translation (#2875))
=======
=======
>>>>>>> f5b2148366 (GEOMESA-3212 Postgis - convert constant functions to literals for SQL translation (#2875))
>>>>>>> a26c0acbb7 (GEOMESA-3212 Postgis - convert constant functions to literals for SQL translation (#2875))
<<<<<<< HEAD
<<<<<<< HEAD
=======
>>>>>>> 7481483700 (GEOMESA-3212 Postgis - convert constant functions to literals for SQL translation (#2875))
=======
>>>>>>> d4a1e3591e (GEOMESA-3212 Postgis - convert constant functions to literals for SQL translation (#2875))
=======
>>>>>>> b5c0452b13 (GEOMESA-3262 Postgis - add config to skip whole world filters)
=======
>>>>>>> 56e5bdc2a5 (GEOMESA-3212 Postgis - convert constant functions to literals for SQL translation (#2875))
=======
>>>>>>> 30ec49c9c0 (GEOMESA-3212 Postgis - convert constant functions to literals for SQL translation (#2875))
=======
=======
>>>>>>> f5b2148366 (GEOMESA-3212 Postgis - convert constant functions to literals for SQL translation (#2875))
>>>>>>> 83c2c09260 (GEOMESA-3212 Postgis - convert constant functions to literals for SQL translation (#2875))
=======
>>>>>>> 3ab56cb4cf (GEOMESA-3212 Postgis - convert constant functions to literals for SQL translation (#2875))
=======
=======
>>>>>>> 406de071e1 (GEOMESA-3212 Postgis - convert constant functions to literals for SQL translation (#2875))
>>>>>>> edde3a188e (GEOMESA-3212 Postgis - convert constant functions to literals for SQL translation (#2875))
=======
>>>>>>> c0571b43e1 (GEOMESA-3262 Postgis - add config to skip whole world filters)
=======
=======
>>>>>>> ad8bba7bb7 (GEOMESA-3212 Postgis - convert constant functions to literals for SQL translation (#2875))
>>>>>>> 8ed0ae6564 (GEOMESA-3212 Postgis - convert constant functions to literals for SQL translation (#2875))
=======
>>>>>>> 01c8505b38 (GEOMESA-3212 Postgis - convert constant functions to literals for SQL translation (#2875))
=======
>>>>>>> 30a68d04cb (GEOMESA-3212 Postgis - convert constant functions to literals for SQL translation (#2875))
=======
>>>>>>> locationtech-main
=======
>>>>>>> d7efff9563 (GEOMESA-3212 Postgis - convert constant functions to literals for SQL translation (#2875))
>>>>>>> 48fcd67085 (GEOMESA-3212 Postgis - convert constant functions to literals for SQL translation (#2875))
=======
>>>>>>> d7efff9563 (GEOMESA-3212 Postgis - convert constant functions to literals for SQL translation (#2875))
  override def splitFilter(filter: Filter, schema: SimpleFeatureType): Array[Filter] = {
    import PartitionedPostgisDialect.Config.ConfigConversions
    val simplified = SplitFilterVisitor(filter, schema.isFilterWholeWorld)
    val query = new Query(schema.getTypeName, simplified)
    interceptors(schema).foreach(_.rewrite(query))
    super.splitFilter(query.getFilter, schema)
  }
=======
<<<<<<< HEAD
<<<<<<< HEAD
<<<<<<< HEAD
<<<<<<< HEAD
=======
<<<<<<< HEAD
>>>>>>> locationtech-main
=======
>>>>>>> 48fcd67085 (GEOMESA-3212 Postgis - convert constant functions to literals for SQL translation (#2875))
<<<<<<< HEAD
<<<<<<< HEAD
<<<<<<< HEAD
<<<<<<< HEAD
<<<<<<< HEAD
<<<<<<< HEAD
<<<<<<< HEAD
<<<<<<< HEAD
=======
>>>>>>> a26c0acbb7 (GEOMESA-3212 Postgis - convert constant functions to literals for SQL translation (#2875))
=======
>>>>>>> 83c2c09260 (GEOMESA-3212 Postgis - convert constant functions to literals for SQL translation (#2875))
=======
>>>>>>> edde3a188e (GEOMESA-3212 Postgis - convert constant functions to literals for SQL translation (#2875))
=======
>>>>>>> c0571b43e1 (GEOMESA-3262 Postgis - add config to skip whole world filters)
=======
=======
>>>>>>> a26c0acbb7 (GEOMESA-3212 Postgis - convert constant functions to literals for SQL translation (#2875))
>>>>>>> 30a68d04cb (GEOMESA-3212 Postgis - convert constant functions to literals for SQL translation (#2875))
=======
>>>>>>> 7d4ed7605c (GEOMESA-3262 Postgis - add config to skip whole world filters)
=======
>>>>>>> 9fb20ad56c (GEOMESA-3212 Postgis - convert constant functions to literals for SQL translation (#2875))
<<<<<<< HEAD
<<<<<<< HEAD
<<<<<<< HEAD
<<<<<<< HEAD
<<<<<<< HEAD
<<<<<<< HEAD
=======
>>>>>>> 8ed0ae6564 (GEOMESA-3212 Postgis - convert constant functions to literals for SQL translation (#2875))
=======
>>>>>>> 01c8505b38 (GEOMESA-3212 Postgis - convert constant functions to literals for SQL translation (#2875))
=======
>>>>>>> d30ebb4092 (GEOMESA-3212 Postgis - convert constant functions to literals for SQL translation (#2875))
=======
>>>>>>> ad8bba7bb7 (GEOMESA-3212 Postgis - convert constant functions to literals for SQL translation (#2875))
<<<<<<< HEAD
<<<<<<< HEAD
=======
>>>>>>> 01c8505b38 (GEOMESA-3212 Postgis - convert constant functions to literals for SQL translation (#2875))
=======
=======
>>>>>>> d30ebb4092 (GEOMESA-3212 Postgis - convert constant functions to literals for SQL translation (#2875))
>>>>>>> 4983e191e6 (GEOMESA-3212 Postgis - convert constant functions to literals for SQL translation (#2875))
<<<<<<< HEAD
=======
>>>>>>> 56e5bdc2a5 (GEOMESA-3212 Postgis - convert constant functions to literals for SQL translation (#2875))
=======
=======
>>>>>>> d30ebb4092 (GEOMESA-3212 Postgis - convert constant functions to literals for SQL translation (#2875))
>>>>>>> 30ec49c9c0 (GEOMESA-3212 Postgis - convert constant functions to literals for SQL translation (#2875))
=======
>>>>>>> 8ed0ae6564 (GEOMESA-3212 Postgis - convert constant functions to literals for SQL translation (#2875))
=======
>>>>>>> 01c8505b38 (GEOMESA-3212 Postgis - convert constant functions to literals for SQL translation (#2875))
  override def splitFilter(filter: Filter, schema: SimpleFeatureType): Array[Filter] =
    super.splitFilter(LiteralFunctionVisitor(filter), schema)
<<<<<<< HEAD
<<<<<<< HEAD
<<<<<<< HEAD
<<<<<<< HEAD
<<<<<<< HEAD
<<<<<<< HEAD
=======
>>>>>>> f1532f2313 (GEOMESA-3254 Add Bloop build support)
>>>>>>> 5e000da485 (GEOMESA-3212 Postgis - convert constant functions to literals for SQL translation (#2875))
=======
<<<<<<< HEAD
=======
>>>>>>> ee1d5f207 (GEOMESA-3215 Postgis - support List-type attributes)
<<<<<<< HEAD
>>>>>>> cf1d94c7a8 (GEOMESA-3215 Postgis - support List-type attributes)
=======
>>>>>>> d845d7c1bd (GEOMESA-3254 Add Bloop build support)
<<<<<<< HEAD
<<<<<<< HEAD
=======
  override def splitFilter(filter: Filter, schema: SimpleFeatureType): Array[Filter] =
    super.splitFilter(LiteralFunctionVisitor(filter), schema)
<<<<<<< HEAD
<<<<<<< HEAD
>>>>>>> 713060f3a2 (GEOMESA-3212 Postgis - convert constant functions to literals for SQL translation (#2875))
<<<<<<< HEAD
>>>>>>> f5b2148366 (GEOMESA-3212 Postgis - convert constant functions to literals for SQL translation (#2875))
=======
=======
<<<<<<< HEAD
=======
>>>>>>> ee1d5f207 (GEOMESA-3215 Postgis - support List-type attributes)
>>>>>>> 42af7673bd (GEOMESA-3215 Postgis - support List-type attributes)
>>>>>>> 7542dc78d8 (GEOMESA-3215 Postgis - support List-type attributes)
=======
  override def splitFilter(filter: Filter, schema: SimpleFeatureType): Array[Filter] =
    super.splitFilter(LiteralFunctionVisitor(filter), schema)
<<<<<<< HEAD
<<<<<<< HEAD
>>>>>>> 713060f3a2 (GEOMESA-3212 Postgis - convert constant functions to literals for SQL translation (#2875))
<<<<<<< HEAD
>>>>>>> d7efff9563 (GEOMESA-3212 Postgis - convert constant functions to literals for SQL translation (#2875))
=======
=======
<<<<<<< HEAD
=======
>>>>>>> ee1d5f207 (GEOMESA-3215 Postgis - support List-type attributes)
>>>>>>> 42af7673bd (GEOMESA-3215 Postgis - support List-type attributes)
>>>>>>> a980818468 (GEOMESA-3215 Postgis - support List-type attributes)

  override def registerClassToSqlMappings(mappings: java.util.Map[Class[_], Integer]): Unit = {
    super.registerClassToSqlMappings(mappings)
    mappings.put(classOf[java.util.List[_]], Types.ARRAY)
  }

  override def registerSqlTypeNameToClassMappings(mappings: java.util.Map[String, Class[_]]): Unit = {
    super.registerSqlTypeNameToClassMappings(mappings)
    mappings.put("array", classOf[java.util.List[_]])
  }

  override def registerSqlTypeToSqlTypeNameOverrides(overrides: java.util.Map[Integer, String]): Unit = {
    super.registerSqlTypeToSqlTypeNameOverrides(overrides)
    overrides.put(Types.ARRAY, "ARRAY")
  }

  override def encodePostColumnCreateTable(att: AttributeDescriptor, sql: StringBuffer): Unit = {
<<<<<<< HEAD
<<<<<<< HEAD
<<<<<<< HEAD
<<<<<<< HEAD
<<<<<<< HEAD
    import PartitionedPostgisDialect.Config.GeometryAttributeConversions
=======
<<<<<<< HEAD
>>>>>>> cf1d94c7a8 (GEOMESA-3215 Postgis - support List-type attributes)
=======
>>>>>>> d845d7c1bd (GEOMESA-3254 Add Bloop build support)
=======
=======
    import PartitionedPostgisDialect.Config.GeometryAttributeConversions
=======
<<<<<<< HEAD
>>>>>>> a980818468 (GEOMESA-3215 Postgis - support List-type attributes)
>>>>>>> 7542dc78d8 (GEOMESA-3215 Postgis - support List-type attributes)
    att match {
      case gd: GeometryDescriptor =>
        val nullable = gd.getMinOccurs <= 0 || gd.isNillable
        val i = sql.lastIndexOf("geometry")
        // expect `geometry NOT NULL` or `geometry` depending on nullable flag
        if (i == -1 || (nullable && i != sql.length() - 8) || (!nullable && i != sql.length() - 17)) {
          logger.warn(s"Found geometry-type attribute but no geometry column binding: $sql")
        } else {
          val srid = gd.getSrid.getOrElse(-1)
          val geomType = PartitionedPostgisDialect.GeometryMappings.getOrElse(gd.getType.getBinding, "GEOMETRY")
          val geomTypeWithDims = gd.getCoordinateDimensions match {
            case None | Some(2) => geomType
            case Some(3) => s"${geomType}Z"
            case Some(4) => s"${geomType}ZM"
            case Some(d) =>
              throw new IllegalArgumentException(
                s"PostGIS only supports geometries with 2, 3 and 4 dimensions, but found: $d")
          }
          sql.insert(i + 8, s" ($geomTypeWithDims, $srid)")
        }

      case _ if att.isJson() =>
        // replace 'VARCHAR' with jsonb
        val i = sql.lastIndexOf(" VARCHAR")
        if (i == sql.length() - 8) {
          sql.replace(i + 1, i + 8, "JSONB")
        } else {
          logger.warn(s"Found JSON-type attribute but no CHARACTER VARYING column binding: $sql")
        }

      case _ if att.isList =>
        // go back and encode the array type in the CQL create statement
        val i = sql.lastIndexOf(" ARRAY")
        if (i == sql.length() - 6) {
          sql.insert(i, " " + getListTypeMapping(att.getListType()))
        } else {
          logger.warn(s"Found list-type attribute but no ARRAY column binding: $sql")
        }

      case _ => // no-op
=======
    super.encodePostColumnCreateTable(att, sql)
<<<<<<< HEAD
<<<<<<< HEAD
    if (att.isJson()) {
      // replace 'VARCHAR' with jsonb
      val i = sql.lastIndexOf(" VARCHAR")
      if (i == sql.length() - 8) {
        sql.replace(i + 1, i + 8, "JSONB")
      } else {
        logger.warn(s"Found JSON-type attribute but no CHARACTER VARYING column binding: $sql")
      }
    } else if (att.isList) {
=======
    if (att.isList) {
>>>>>>> a980818468 (GEOMESA-3215 Postgis - support List-type attributes)
      // go back and encode the array type in the CQL create statement
      val i = sql.lastIndexOf(" ARRAY")
      if (i == sql.length() - 6) {
        sql.insert(i, " " + getListTypeMapping(att.getListType()))
      } else {
        logger.warn(s"Found list-type attribute but no ARRAY column binding: $sql")
      }
>>>>>>> ee1d5f207 (GEOMESA-3215 Postgis - support List-type attributes)
<<<<<<< HEAD
    }
  }

  override def getMapping(columnMetaData: ResultSet, cx: Connection): Class[_] = {
    val mapping = super.getMapping(columnMetaData, cx)
    if (mapping != null && mapping.isArray) {
      classOf[java.util.List[_]]
    } else {
      mapping
    }
  }

  /**
   * Gets the array type for a list/array column
   *
   * @param binding list-type binding
   * @return
   */
  private def getListTypeMapping(binding: Class[_]): String = {
    val mappings = new java.util.HashMap[String, Class[_]]()
    registerSqlTypeNameToClassMappings(mappings)
    var mapping: String = null
    var partial: String = null
    val iter = mappings.asScala.iterator
    while (iter.hasNext && mapping == null) {
      val (name, clas) = iter.next
      if (clas == binding) {
        mapping = name
      } else if (partial == null && clas.isAssignableFrom(binding)) {
        partial = name
      }
    }
    if (mapping != null) {
      mapping
    } else if (partial != null) {
      partial
    } else {
      logger.warn(s"Could not find list-type column for type ${binding.getName}")
      "text"
    }
  }
<<<<<<< HEAD
<<<<<<< HEAD
<<<<<<< HEAD
<<<<<<< HEAD
=======
<<<<<<< HEAD
  override def splitFilter(filter: Filter, schema: SimpleFeatureType): Array[Filter] =
    super.splitFilter(LiteralFunctionVisitor(filter), schema)
<<<<<<< HEAD
>>>>>>> dcd872c1ac (GEOMESA-3212 Postgis - convert constant functions to literals for SQL translation (#2875))
=======
=======
>>>>>>> c738f63bd9 (GEOMESA-3254 Add Bloop build support)
=======
>>>>>>> 713060f3a2 (GEOMESA-3212 Postgis - convert constant functions to literals for SQL translation (#2875))
=======
=======
>>>>>>> ee1d5f207 (GEOMESA-3215 Postgis - support List-type attributes)
>>>>>>> 42af7673bd (GEOMESA-3215 Postgis - support List-type attributes)
=======
=======
=======
>>>>>>> 91b820951 (GEOMESA-3212 Postgis - convert constant functions to literals for SQL translation (#2875))
<<<<<<< HEAD
<<<<<<< HEAD
<<<<<<< HEAD
<<<<<<< HEAD
<<<<<<< HEAD
<<<<<<< HEAD
=======
>>>>>>> 8ed0ae6564 (GEOMESA-3212 Postgis - convert constant functions to literals for SQL translation (#2875))
=======
>>>>>>> 01c8505b38 (GEOMESA-3212 Postgis - convert constant functions to literals for SQL translation (#2875))
=======
>>>>>>> e694961e05 (GEOMESA-3212 Postgis - convert constant functions to literals for SQL translation (#2875))
  override def splitFilter(filter: Filter, schema: SimpleFeatureType): Array[Filter] = {
    import PartitionedPostgisDialect.Config.ConfigConversions
    super.splitFilter(SplitFilterVisitor(filter, schema.isFilterWholeWorld), schema)
  }
<<<<<<< HEAD
>>>>>>> 1be2e3ecb (GEOMESA-3262 Postgis - add config to skip whole world filters)
<<<<<<< HEAD
>>>>>>> 7d4ed7605c (GEOMESA-3262 Postgis - add config to skip whole world filters)
=======
=======
=======
=======
=======
>>>>>>> 7d4ed7605c (GEOMESA-3262 Postgis - add config to skip whole world filters)
>>>>>>> 75d5a347f8 (GEOMESA-3262 Postgis - add config to skip whole world filters)
  override def splitFilter(filter: Filter, schema: SimpleFeatureType): Array[Filter] =
    super.splitFilter(LiteralFunctionVisitor(filter), schema)
<<<<<<< HEAD
<<<<<<< HEAD
<<<<<<< HEAD
<<<<<<< HEAD
<<<<<<< HEAD
<<<<<<< HEAD
<<<<<<< HEAD
<<<<<<< HEAD
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
>>>>>>> 6edc66c3cb (GEOMESA-3215 Postgis - support List-type attributes)
=======
>>>>>>> e4a3f1a534 (GEOMESA-3212 Postgis - convert constant functions to literals for SQL translation (#2875))
=======
>>>>>>> 6494375eef (GEOMESA-3215 Postgis - support List-type attributes)
=======
>>>>>>> eb0302a7c5 (GEOMESA-3212 Postgis - convert constant functions to literals for SQL translation (#2875))
=======
>>>>>>> 34836e5f4e (GEOMESA-3215 Postgis - support List-type attributes)
=======
=======
>>>>>>> 5a4c24e020 (GEOMESA-3254 Add Bloop build support)
>>>>>>> 13656f5052 (GEOMESA-3254 Add Bloop build support)
=======
=======
>>>>>>> 67ba50b23a (GEOMESA-3215 Postgis - support List-type attributes)
=======
>>>>>>> 5a4c24e020 (GEOMESA-3254 Add Bloop build support)
=======
>>>>>>> b8426b262b (GEOMESA-3212 Postgis - convert constant functions to literals for SQL translation (#2875))
<<<<<<< HEAD
>>>>>>> d391bc18f0 (GEOMESA-3212 Postgis - convert constant functions to literals for SQL translation (#2875))
=======
=======
>>>>>>> 6edc66c3cb (GEOMESA-3215 Postgis - support List-type attributes)
>>>>>>> 67ba50b23a (GEOMESA-3215 Postgis - support List-type attributes)
>>>>>>> 5e000da48 (GEOMESA-3212 Postgis - convert constant functions to literals for SQL translation (#2875))
<<<<<<< HEAD
>>>>>>> e694961e05 (GEOMESA-3212 Postgis - convert constant functions to literals for SQL translation (#2875))
<<<<<<< HEAD
>>>>>>> d30ebb4092 (GEOMESA-3212 Postgis - convert constant functions to literals for SQL translation (#2875))
=======
=======
=======
>>>>>>> 5e000da485 (GEOMESA-3212 Postgis - convert constant functions to literals for SQL translation (#2875))
>>>>>>> 4b7c48b509 (GEOMESA-3215 Postgis - support List-type attributes)
=======
<<<<<<< HEAD
=======
>>>>>>> ee1d5f207 (GEOMESA-3215 Postgis - support List-type attributes)
<<<<<<< HEAD
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
<<<<<<< HEAD
<<<<<<< HEAD
>>>>>>> 09d87762c5 (GEOMESA-3254 Add Bloop build support)
<<<<<<< HEAD
>>>>>>> 63a045a753 (GEOMESA-3254 Add Bloop build support)
=======
=======
=======
>>>>>>> 713060f3a (GEOMESA-3212 Postgis - convert constant functions to literals for SQL translation (#2875))
>>>>>>> 50a84fd0eb (GEOMESA-3212 Postgis - convert constant functions to literals for SQL translation (#2875))
>>>>>>> ddf486214c (GEOMESA-3212 Postgis - convert constant functions to literals for SQL translation (#2875))
<<<<<<< HEAD
=======
>>>>>>> b8426b262b (GEOMESA-3212 Postgis - convert constant functions to literals for SQL translation (#2875))
>>>>>>> 48fcd67085 (GEOMESA-3212 Postgis - convert constant functions to literals for SQL translation (#2875))
=======
  override def splitFilter(filter: Filter, schema: SimpleFeatureType): Array[Filter] =
    super.splitFilter(LiteralFunctionVisitor(filter), schema)
<<<<<<< HEAD
<<<<<<< HEAD
<<<<<<< HEAD
<<<<<<< HEAD
<<<<<<< HEAD
<<<<<<< HEAD
<<<<<<< HEAD
=======
>>>>>>> eb0302a7c5 (GEOMESA-3212 Postgis - convert constant functions to literals for SQL translation (#2875))
=======
>>>>>>> 64b3066584 (GEOMESA-3212 Postgis - convert constant functions to literals for SQL translation (#2875))
=======
>>>>>>> 4b7c48b509 (GEOMESA-3215 Postgis - support List-type attributes)
>>>>>>> 5e000da485 (GEOMESA-3212 Postgis - convert constant functions to literals for SQL translation (#2875))
<<<<<<< HEAD
>>>>>>> 406de071e1 (GEOMESA-3212 Postgis - convert constant functions to literals for SQL translation (#2875))
=======
=======
<<<<<<< HEAD
=======
>>>>>>> ee1d5f207 (GEOMESA-3215 Postgis - support List-type attributes)
<<<<<<< HEAD
>>>>>>> cf1d94c7a8 (GEOMESA-3215 Postgis - support List-type attributes)
>>>>>>> bf9e5cdd91 (GEOMESA-3215 Postgis - support List-type attributes)
=======
=======
>>>>>>> 29836dbeb7 (GEOMESA-3215 Postgis - support List-type attributes)
>>>>>>> 713060f3a2 (GEOMESA-3212 Postgis - convert constant functions to literals for SQL translation (#2875))
<<<<<<< HEAD
>>>>>>> d7efff9563 (GEOMESA-3212 Postgis - convert constant functions to literals for SQL translation (#2875))
<<<<<<< HEAD
>>>>>>> 48fcd67085 (GEOMESA-3212 Postgis - convert constant functions to literals for SQL translation (#2875))
=======
=======
=======
<<<<<<< HEAD
=======
>>>>>>> ee1d5f207 (GEOMESA-3215 Postgis - support List-type attributes)
>>>>>>> 42af7673bd (GEOMESA-3215 Postgis - support List-type attributes)
>>>>>>> a980818468 (GEOMESA-3215 Postgis - support List-type attributes)
>>>>>>> 29836dbeb7 (GEOMESA-3215 Postgis - support List-type attributes)

  override def registerClassToSqlMappings(mappings: java.util.Map[Class[_], Integer]): Unit = {
    super.registerClassToSqlMappings(mappings)
    mappings.put(classOf[java.util.List[_]], Types.ARRAY)
  }

  override def registerSqlTypeNameToClassMappings(mappings: java.util.Map[String, Class[_]]): Unit = {
    super.registerSqlTypeNameToClassMappings(mappings)
    mappings.put("array", classOf[java.util.List[_]])
  }

  override def registerSqlTypeToSqlTypeNameOverrides(overrides: java.util.Map[Integer, String]): Unit = {
    super.registerSqlTypeToSqlTypeNameOverrides(overrides)
    overrides.put(Types.ARRAY, "ARRAY")
  }

  override def encodePostColumnCreateTable(att: AttributeDescriptor, sql: StringBuffer): Unit = {
<<<<<<< HEAD
<<<<<<< HEAD
=======
    import PartitionedPostgisDialect.Config.GeometryAttributeConversions
>>>>>>> 66d8688836 (GEOMESA-3298 Partitioned PostGIS - Add check for non-integer user data)
=======
    import PartitionedPostgisDialect.Config.GeometryAttributeConversions
=======
<<<<<<< HEAD
>>>>>>> 7542dc78d8 (GEOMESA-3215 Postgis - support List-type attributes)
>>>>>>> 29836dbeb7 (GEOMESA-3215 Postgis - support List-type attributes)
    att match {
      case gd: GeometryDescriptor =>
        val nullable = gd.getMinOccurs <= 0 || gd.isNillable
        val i = sql.lastIndexOf("geometry")
        // expect `geometry NOT NULL` or `geometry` depending on nullable flag
        if (i == -1 || (nullable && i != sql.length() - 8) || (!nullable && i != sql.length() - 17)) {
          logger.warn(s"Found geometry-type attribute but no geometry column binding: $sql")
        } else {
          val srid = gd.getSrid.getOrElse(-1)
          val geomType = PartitionedPostgisDialect.GeometryMappings.getOrElse(gd.getType.getBinding, "GEOMETRY")
          val geomTypeWithDims = gd.getCoordinateDimensions match {
            case None | Some(2) => geomType
            case Some(3) => s"${geomType}Z"
            case Some(4) => s"${geomType}ZM"
            case Some(d) =>
              throw new IllegalArgumentException(
                s"PostGIS only supports geometries with 2, 3 and 4 dimensions, but found: $d")
          }
          sql.insert(i + 8, s" ($geomTypeWithDims, $srid)")
        }

      case _ if att.isJson() =>
        // replace 'VARCHAR' with jsonb
        val i = sql.lastIndexOf(" VARCHAR")
        if (i == sql.length() - 8) {
          sql.replace(i + 1, i + 8, "JSONB")
        } else {
          logger.warn(s"Found JSON-type attribute but no CHARACTER VARYING column binding: $sql")
        }

      case _ if att.isList =>
        // go back and encode the array type in the CQL create statement
        val i = sql.lastIndexOf(" ARRAY")
        if (i == sql.length() - 6) {
          sql.insert(i, " " + getListTypeMapping(att.getListType()))
        } else {
          logger.warn(s"Found list-type attribute but no ARRAY column binding: $sql")
        }

      case _ => // no-op
<<<<<<< HEAD
<<<<<<< HEAD
=======
<<<<<<< HEAD
    super.encodePostColumnCreateTable(att, sql)
<<<<<<< HEAD
<<<<<<< HEAD
=======
>>>>>>> 230ae6c3ab (GEOMESA-3217,GEOMESA-3216 Support Postgis json attributes, top-level arrays in json)
    if (att.isJson()) {
      // replace 'VARCHAR' with jsonb
      val i = sql.lastIndexOf(" VARCHAR")
      if (i == sql.length() - 8) {
        sql.replace(i + 1, i + 8, "JSONB")
      } else {
        logger.warn(s"Found JSON-type attribute but no CHARACTER VARYING column binding: $sql")
      }
    } else if (att.isList) {
<<<<<<< HEAD
=======
    if (att.isList) {
>>>>>>> 3a1e1d7213 (GEOMESA-3215 Postgis - support List-type attributes)
=======
>>>>>>> 230ae6c3ab (GEOMESA-3217,GEOMESA-3216 Support Postgis json attributes, top-level arrays in json)
=======
=======
    super.encodePostColumnCreateTable(att, sql)
<<<<<<< HEAD
    if (att.isList) {
<<<<<<< HEAD
>>>>>>> bf9e5cdd91 (GEOMESA-3215 Postgis - support List-type attributes)
=======
>>>>>>> a980818468 (GEOMESA-3215 Postgis - support List-type attributes)
>>>>>>> 29836dbeb7 (GEOMESA-3215 Postgis - support List-type attributes)
      // go back and encode the array type in the CQL create statement
      val i = sql.lastIndexOf(" ARRAY")
      if (i == sql.length() - 6) {
        sql.insert(i, " " + getListTypeMapping(att.getListType()))
      } else {
        logger.warn(s"Found list-type attribute but no ARRAY column binding: $sql")
      }
>>>>>>> ee1d5f207 (GEOMESA-3215 Postgis - support List-type attributes)
<<<<<<< HEAD
=======
>>>>>>> 09d87762c5 (GEOMESA-3254 Add Bloop build support)
=======
<<<<<<< HEAD
>>>>>>> bf9e5cdd91 (GEOMESA-3215 Postgis - support List-type attributes)
=======
>>>>>>> a980818468 (GEOMESA-3215 Postgis - support List-type attributes)
>>>>>>> 29836dbeb7 (GEOMESA-3215 Postgis - support List-type attributes)
    }
  }

  override def getMapping(columnMetaData: ResultSet, cx: Connection): Class[_] = {
    val mapping = super.getMapping(columnMetaData, cx)
    if (mapping != null && mapping.isArray) {
      classOf[java.util.List[_]]
    } else {
      mapping
    }
  }

  /**
   * Gets the array type for a list/array column
   *
   * @param binding list-type binding
   * @return
   */
  private def getListTypeMapping(binding: Class[_]): String = {
    val mappings = new java.util.HashMap[String, Class[_]]()
    registerSqlTypeNameToClassMappings(mappings)
    var mapping: String = null
    var partial: String = null
    val iter = mappings.asScala.iterator
    while (iter.hasNext && mapping == null) {
      val (name, clas) = iter.next
      if (clas == binding) {
        mapping = name
      } else if (partial == null && clas.isAssignableFrom(binding)) {
        partial = name
      }
    }
    if (mapping != null) {
      mapping
    } else if (partial != null) {
      partial
    } else {
      logger.warn(s"Could not find list-type column for type ${binding.getName}")
      "text"
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
=======
<<<<<<< HEAD
<<<<<<< HEAD
<<<<<<< HEAD
<<<<<<< HEAD
=======
  override def splitFilter(filter: Filter, schema: SimpleFeatureType): Array[Filter] =
    super.splitFilter(LiteralFunctionVisitor(filter), schema)
<<<<<<< HEAD
>>>>>>> dcd872c1ac (GEOMESA-3212 Postgis - convert constant functions to literals for SQL translation (#2875))
=======
=======
  override def splitFilter(filter: Filter, schema: SimpleFeatureType): Array[Filter] =
    super.splitFilter(LiteralFunctionVisitor(filter), schema)
<<<<<<< HEAD
<<<<<<< HEAD
>>>>>>> 713060f3a2 (GEOMESA-3212 Postgis - convert constant functions to literals for SQL translation (#2875))
<<<<<<< HEAD
>>>>>>> f5b2148366 (GEOMESA-3212 Postgis - convert constant functions to literals for SQL translation (#2875))
=======
=======
<<<<<<< HEAD
=======
>>>>>>> ee1d5f207 (GEOMESA-3215 Postgis - support List-type attributes)
>>>>>>> 42af7673bd (GEOMESA-3215 Postgis - support List-type attributes)
>>>>>>> 7542dc78d8 (GEOMESA-3215 Postgis - support List-type attributes)

  override def registerClassToSqlMappings(mappings: java.util.Map[Class[_], Integer]): Unit = {
    super.registerClassToSqlMappings(mappings)
    mappings.put(classOf[java.util.List[_]], Types.ARRAY)
  }

  override def registerSqlTypeNameToClassMappings(mappings: java.util.Map[String, Class[_]]): Unit = {
    super.registerSqlTypeNameToClassMappings(mappings)
    mappings.put("array", classOf[java.util.List[_]])
  }

  override def registerSqlTypeToSqlTypeNameOverrides(overrides: java.util.Map[Integer, String]): Unit = {
    super.registerSqlTypeToSqlTypeNameOverrides(overrides)
    overrides.put(Types.ARRAY, "ARRAY")
  }

  override def encodePostColumnCreateTable(att: AttributeDescriptor, sql: StringBuffer): Unit = {
<<<<<<< HEAD
    att match {
      case gd: GeometryDescriptor =>
        val nullable = gd.getMinOccurs <= 0 || gd.isNillable
        val i = sql.lastIndexOf("geometry")
        // expect `geometry NOT NULL` or `geometry` depending on nullable flag
        if (i == -1 || (nullable && i != sql.length() - 8) || (!nullable && i != sql.length() - 17)) {
          logger.warn(s"Found geometry-type attribute but no geometry column binding: $sql")
        } else {
          val srid =
            Option(gd.getUserData.get(JDBCDataStore.JDBC_NATIVE_SRID).asInstanceOf[Integer])
                .orElse(Option(gd.getCoordinateReferenceSystem).flatMap(crs => Try(CRS.lookupEpsgCode(crs, true)).filter(_ != null).toOption))
                .map(_.intValue())
                .getOrElse(-1)
          val geomType = PartitionedPostgisDialect.GeometryMappings.getOrElse(gd.getType.getBinding, "GEOMETRY")
          val geomTypeWithDims =
            Option(gd.getUserData.get(Hints.COORDINATE_DIMENSION).asInstanceOf[Integer]).map(_.intValue) match {
              case None | Some(2) => geomType
              case Some(3) => s"${geomType}Z"
              case Some(4) => s"${geomType}ZM"
              case Some(d) =>
                throw new IllegalArgumentException(
                  s"PostGIS only supports geometries with 2, 3 and 4 dimensions, but found: $d")
            }
          sql.insert(i + 8, s" ($geomTypeWithDims, $srid)")
        }

      case _ if att.isJson() =>
        // replace 'VARCHAR' with jsonb
        val i = sql.lastIndexOf(" VARCHAR")
        if (i == sql.length() - 8) {
          sql.replace(i + 1, i + 8, "JSONB")
        } else {
          logger.warn(s"Found JSON-type attribute but no CHARACTER VARYING column binding: $sql")
        }

      case _ if att.isList =>
        // go back and encode the array type in the CQL create statement
        val i = sql.lastIndexOf(" ARRAY")
        if (i == sql.length() - 6) {
          sql.insert(i, " " + getListTypeMapping(att.getListType()))
        } else {
          logger.warn(s"Found list-type attribute but no ARRAY column binding: $sql")
        }

      case _ => // no-op
=======
    super.encodePostColumnCreateTable(att, sql)
=======
>>>>>>> 11b6e79a03 (GEOMESA-3217,GEOMESA-3216 Support Postgis json attributes, top-level arrays in json)
=======
>>>>>>> 11b6e79a03 (GEOMESA-3217,GEOMESA-3216 Support Postgis json attributes, top-level arrays in json)
    if (att.isJson()) {
      // replace 'VARCHAR' with jsonb
      val i = sql.lastIndexOf(" VARCHAR")
      if (i == sql.length() - 8) {
        sql.replace(i + 1, i + 8, "JSONB")
      } else {
        logger.warn(s"Found JSON-type attribute but no CHARACTER VARYING column binding: $sql")
      }
    } else if (att.isList) {
      // go back and encode the array type in the CQL create statement
      val i = sql.lastIndexOf(" ARRAY")
      if (i == sql.length() - 6) {
        sql.insert(i, " " + getListTypeMapping(att.getListType()))
      } else {
        logger.warn(s"Found list-type attribute but no ARRAY column binding: $sql")
      }
>>>>>>> ee1d5f207 (GEOMESA-3215 Postgis - support List-type attributes)
    }
  }

  override def getMapping(columnMetaData: ResultSet, cx: Connection): Class[_] = {
    val mapping = super.getMapping(columnMetaData, cx)
    if (mapping != null && mapping.isArray) {
      classOf[java.util.List[_]]
    } else {
      mapping
    }
  }

  /**
   * Gets the array type for a list/array column
   *
   * @param binding list-type binding
   * @return
   */
  private def getListTypeMapping(binding: Class[_]): String = {
    val mappings = new java.util.HashMap[String, Class[_]]()
    registerSqlTypeNameToClassMappings(mappings)
    var mapping: String = null
    var partial: String = null
    val iter = mappings.asScala.iterator
    while (iter.hasNext && mapping == null) {
      val (name, clas) = iter.next
      if (clas == binding) {
        mapping = name
      } else if (partial == null && clas.isAssignableFrom(binding)) {
        partial = name
      }
    }
    if (mapping != null) {
      mapping
    } else if (partial != null) {
      partial
    } else {
      logger.warn(s"Could not find list-type column for type ${binding.getName}")
      "text"
    }
  }
<<<<<<< HEAD
<<<<<<< HEAD
>>>>>>> a26c0acbb7 (GEOMESA-3212 Postgis - convert constant functions to literals for SQL translation (#2875))
<<<<<<< HEAD
>>>>>>> 30a68d04cb (GEOMESA-3212 Postgis - convert constant functions to literals for SQL translation (#2875))
=======
=======
<<<<<<< HEAD
>>>>>>> 7e990c0c62 (GEOMESA-3215 Postgis - support List-type attributes)
>>>>>>> cdf5a8b797 (GEOMESA-3215 Postgis - support List-type attributes)
>>>>>>> ee1d5f2071 (GEOMESA-3215 Postgis - support List-type attributes)
=======
>>>>>>> dcd872c1a (GEOMESA-3212 Postgis - convert constant functions to literals for SQL translation (#2875))
<<<<<<< HEAD
>>>>>>> 5e000da485 (GEOMESA-3212 Postgis - convert constant functions to literals for SQL translation (#2875))
=======
=======
>>>>>>> ee1d5f207 (GEOMESA-3215 Postgis - support List-type attributes)
=======
<<<<<<< HEAD
>>>>>>> 75d5a347f8 (GEOMESA-3262 Postgis - add config to skip whole world filters)
>>>>>>> cf1d94c7a8 (GEOMESA-3215 Postgis - support List-type attributes)
=======
>>>>>>> d845d7c1bd (GEOMESA-3254 Add Bloop build support)
=======
<<<<<<< HEAD
=======
>>>>>>> dcd872c1a (GEOMESA-3212 Postgis - convert constant functions to literals for SQL translation (#2875))
>>>>>>> 713060f3a2 (GEOMESA-3212 Postgis - convert constant functions to literals for SQL translation (#2875))
=======
=======
<<<<<<< HEAD
>>>>>>> 9fb20ad56c (GEOMESA-3212 Postgis - convert constant functions to literals for SQL translation (#2875))
=======
>>>>>>> 1913bc4c2c (GEOMESA-3215 Postgis - support List-type attributes)
=======
>>>>>>> 63a045a753 (GEOMESA-3254 Add Bloop build support)
=======
>>>>>>> ddf486214c (GEOMESA-3212 Postgis - convert constant functions to literals for SQL translation (#2875))
=======
>>>>>>> dcd872c1a (GEOMESA-3212 Postgis - convert constant functions to literals for SQL translation (#2875))
=======
>>>>>>> ee1d5f207 (GEOMESA-3215 Postgis - support List-type attributes)
<<<<<<< HEAD
>>>>>>> 42af7673bd (GEOMESA-3215 Postgis - support List-type attributes)
=======
=======
=======
>>>>>>> 3a1e1d7213 (GEOMESA-3215 Postgis - support List-type attributes)
=======
>>>>>>> 09d87762c5 (GEOMESA-3254 Add Bloop build support)
=======
>>>>>>> 50a84fd0eb (GEOMESA-3212 Postgis - convert constant functions to literals for SQL translation (#2875))
=======
<<<<<<< HEAD
  override def splitFilter(filter: Filter, schema: SimpleFeatureType): Array[Filter] =
    super.splitFilter(LiteralFunctionVisitor(filter), schema)
<<<<<<< HEAD
>>>>>>> dcd872c1a (GEOMESA-3212 Postgis - convert constant functions to literals for SQL translation (#2875))
<<<<<<< HEAD
>>>>>>> 91b820951 (GEOMESA-3212 Postgis - convert constant functions to literals for SQL translation (#2875))
<<<<<<< HEAD
>>>>>>> 9fb20ad56c (GEOMESA-3212 Postgis - convert constant functions to literals for SQL translation (#2875))
=======
=======
=======
<<<<<<< HEAD
=======
=======
>>>>>>> ee1d5f207 (GEOMESA-3215 Postgis - support List-type attributes)
>>>>>>> 42af7673b (GEOMESA-3215 Postgis - support List-type attributes)
=======
>>>>>>> f1532f2313 (GEOMESA-3254 Add Bloop build support)
=======
>>>>>>> 713060f3a2 (GEOMESA-3212 Postgis - convert constant functions to literals for SQL translation (#2875))
>>>>>>> 64b3066584 (GEOMESA-3212 Postgis - convert constant functions to literals for SQL translation (#2875))
=======
>>>>>>> ee1d5f207 (GEOMESA-3215 Postgis - support List-type attributes)
>>>>>>> 42af7673bd (GEOMESA-3215 Postgis - support List-type attributes)
<<<<<<< HEAD
>>>>>>> 4b7c48b509 (GEOMESA-3215 Postgis - support List-type attributes)
=======
=======
=======
=======
>>>>>>> ad8bba7bb7 (GEOMESA-3212 Postgis - convert constant functions to literals for SQL translation (#2875))
=======
=======
>>>>>>> e694961e05 (GEOMESA-3212 Postgis - convert constant functions to literals for SQL translation (#2875))
>>>>>>> 4983e191e6 (GEOMESA-3212 Postgis - convert constant functions to literals for SQL translation (#2875))
  override def splitFilter(filter: Filter, schema: SimpleFeatureType): Array[Filter] = {
    import PartitionedPostgisDialect.Config.ConfigConversions
    super.splitFilter(SplitFilterVisitor(filter, schema.isFilterWholeWorld), schema)
  }
<<<<<<< HEAD
>>>>>>> 1be2e3ecb (GEOMESA-3262 Postgis - add config to skip whole world filters)
<<<<<<< HEAD
>>>>>>> 7d4ed7605c (GEOMESA-3262 Postgis - add config to skip whole world filters)
<<<<<<< HEAD
>>>>>>> 75d5a347f8 (GEOMESA-3262 Postgis - add config to skip whole world filters)
=======
=======
=======
=======
  override def splitFilter(filter: Filter, schema: SimpleFeatureType): Array[Filter] =
    super.splitFilter(LiteralFunctionVisitor(filter), schema)
<<<<<<< HEAD
<<<<<<< HEAD
=======
>>>>>>> b8426b262b (GEOMESA-3212 Postgis - convert constant functions to literals for SQL translation (#2875))
>>>>>>> 5e000da48 (GEOMESA-3212 Postgis - convert constant functions to literals for SQL translation (#2875))
<<<<<<< HEAD
>>>>>>> e694961e05 (GEOMESA-3212 Postgis - convert constant functions to literals for SQL translation (#2875))
<<<<<<< HEAD
>>>>>>> d30ebb4092 (GEOMESA-3212 Postgis - convert constant functions to literals for SQL translation (#2875))
<<<<<<< HEAD
>>>>>>> 4983e191e6 (GEOMESA-3212 Postgis - convert constant functions to literals for SQL translation (#2875))
=======
=======
=======
=======
<<<<<<< HEAD
=======
>>>>>>> ee1d5f207 (GEOMESA-3215 Postgis - support List-type attributes)
>>>>>>> cf1d94c7a (GEOMESA-3215 Postgis - support List-type attributes)
<<<<<<< HEAD
>>>>>>> 3a1e1d7213 (GEOMESA-3215 Postgis - support List-type attributes)
<<<<<<< HEAD
>>>>>>> 1913bc4c2c (GEOMESA-3215 Postgis - support List-type attributes)
<<<<<<< HEAD
>>>>>>> 9d3260f1dc (GEOMESA-3215 Postgis - support List-type attributes)
=======
=======
=======
=======
>>>>>>> d845d7c1b (GEOMESA-3254 Add Bloop build support)
<<<<<<< HEAD
>>>>>>> 09d87762c5 (GEOMESA-3254 Add Bloop build support)
<<<<<<< HEAD
>>>>>>> 63a045a753 (GEOMESA-3254 Add Bloop build support)
<<<<<<< HEAD
>>>>>>> 5a4c24e020 (GEOMESA-3254 Add Bloop build support)
=======
=======
=======
=======
>>>>>>> 713060f3a (GEOMESA-3212 Postgis - convert constant functions to literals for SQL translation (#2875))
>>>>>>> 50a84fd0eb (GEOMESA-3212 Postgis - convert constant functions to literals for SQL translation (#2875))
>>>>>>> ddf486214c (GEOMESA-3212 Postgis - convert constant functions to literals for SQL translation (#2875))
>>>>>>> b8426b262b (GEOMESA-3212 Postgis - convert constant functions to literals for SQL translation (#2875))
=======
=======
=======
>>>>>>> 7d4ed7605c (GEOMESA-3262 Postgis - add config to skip whole world filters)
>>>>>>> b5c0452b13 (GEOMESA-3262 Postgis - add config to skip whole world filters)
  override def splitFilter(filter: Filter, schema: SimpleFeatureType): Array[Filter] =
    super.splitFilter(LiteralFunctionVisitor(filter), schema)
<<<<<<< HEAD
<<<<<<< HEAD
<<<<<<< HEAD
<<<<<<< HEAD
<<<<<<< HEAD
>>>>>>> 5e000da485 (GEOMESA-3212 Postgis - convert constant functions to literals for SQL translation (#2875))
<<<<<<< HEAD
>>>>>>> d4a1e3591e (GEOMESA-3212 Postgis - convert constant functions to literals for SQL translation (#2875))
=======
=======
<<<<<<< HEAD
=======
>>>>>>> ee1d5f207 (GEOMESA-3215 Postgis - support List-type attributes)
<<<<<<< HEAD
>>>>>>> cf1d94c7a8 (GEOMESA-3215 Postgis - support List-type attributes)
<<<<<<< HEAD
>>>>>>> a207fd51c3 (GEOMESA-3215 Postgis - support List-type attributes)

  override def registerClassToSqlMappings(mappings: java.util.Map[Class[_], Integer]): Unit = {
    super.registerClassToSqlMappings(mappings)
    mappings.put(classOf[java.util.List[_]], Types.ARRAY)
  }

  override def registerSqlTypeNameToClassMappings(mappings: java.util.Map[String, Class[_]]): Unit = {
    super.registerSqlTypeNameToClassMappings(mappings)
    mappings.put("array", classOf[java.util.List[_]])
  }

  override def registerSqlTypeToSqlTypeNameOverrides(overrides: java.util.Map[Integer, String]): Unit = {
    super.registerSqlTypeToSqlTypeNameOverrides(overrides)
    overrides.put(Types.ARRAY, "ARRAY")
  }

  override def encodePostColumnCreateTable(att: AttributeDescriptor, sql: StringBuffer): Unit = {
<<<<<<< HEAD
    att match {
      case gd: GeometryDescriptor =>
        val nullable = gd.getMinOccurs <= 0 || gd.isNillable
        val i = sql.lastIndexOf("geometry")
        // expect `geometry NOT NULL` or `geometry` depending on nullable flag
        if (i == -1 || (nullable && i != sql.length() - 8) || (!nullable && i != sql.length() - 17)) {
          logger.warn(s"Found geometry-type attribute but no geometry column binding: $sql")
        } else {
          val srid =
            Option(gd.getUserData.get(JDBCDataStore.JDBC_NATIVE_SRID).asInstanceOf[Integer])
                .orElse(Option(gd.getCoordinateReferenceSystem).flatMap(crs => Try(CRS.lookupEpsgCode(crs, true)).filter(_ != null).toOption))
                .map(_.intValue())
                .getOrElse(-1)
          val geomType = PartitionedPostgisDialect.GeometryMappings.getOrElse(gd.getType.getBinding, "GEOMETRY")
          val geomTypeWithDims =
            Option(gd.getUserData.get(Hints.COORDINATE_DIMENSION).asInstanceOf[Integer]).map(_.intValue) match {
              case None | Some(2) => geomType
              case Some(3) => s"${geomType}Z"
              case Some(4) => s"${geomType}ZM"
              case Some(d) =>
                throw new IllegalArgumentException(
                  s"PostGIS only supports geometries with 2, 3 and 4 dimensions, but found: $d")
            }
          sql.insert(i + 8, s" ($geomTypeWithDims, $srid)")
        }

      case _ if att.isJson() =>
        // replace 'VARCHAR' with jsonb
        val i = sql.lastIndexOf(" VARCHAR")
        if (i == sql.length() - 8) {
          sql.replace(i + 1, i + 8, "JSONB")
        } else {
          logger.warn(s"Found JSON-type attribute but no CHARACTER VARYING column binding: $sql")
        }

      case _ if att.isList =>
        // go back and encode the array type in the CQL create statement
        val i = sql.lastIndexOf(" ARRAY")
        if (i == sql.length() - 6) {
          sql.insert(i, " " + getListTypeMapping(att.getListType()))
        } else {
          logger.warn(s"Found list-type attribute but no ARRAY column binding: $sql")
        }

      case _ => // no-op
<<<<<<< HEAD
<<<<<<< HEAD
=======
    super.encodePostColumnCreateTable(att, sql)
<<<<<<< HEAD
<<<<<<< HEAD
=======
>>>>>>> 230ae6c3ab (GEOMESA-3217,GEOMESA-3216 Support Postgis json attributes, top-level arrays in json)
    if (att.isJson()) {
      // replace 'VARCHAR' with jsonb
      val i = sql.lastIndexOf(" VARCHAR")
      if (i == sql.length() - 8) {
        sql.replace(i + 1, i + 8, "JSONB")
      } else {
        logger.warn(s"Found JSON-type attribute but no CHARACTER VARYING column binding: $sql")
      }
    } else if (att.isList) {
<<<<<<< HEAD
=======
    if (att.isList) {
>>>>>>> 3a1e1d7213 (GEOMESA-3215 Postgis - support List-type attributes)
=======
>>>>>>> 230ae6c3ab (GEOMESA-3217,GEOMESA-3216 Support Postgis json attributes, top-level arrays in json)
=======
=======
    super.encodePostColumnCreateTable(att, sql)
    if (att.isList) {
>>>>>>> a207fd51c3 (GEOMESA-3215 Postgis - support List-type attributes)
      // go back and encode the array type in the CQL create statement
      val i = sql.lastIndexOf(" ARRAY")
      if (i == sql.length() - 6) {
        sql.insert(i, " " + getListTypeMapping(att.getListType()))
      } else {
        logger.warn(s"Found list-type attribute but no ARRAY column binding: $sql")
      }
>>>>>>> ee1d5f207 (GEOMESA-3215 Postgis - support List-type attributes)
<<<<<<< HEAD
=======
>>>>>>> 09d87762c5 (GEOMESA-3254 Add Bloop build support)
=======
>>>>>>> a207fd51c3 (GEOMESA-3215 Postgis - support List-type attributes)
    }
  }

  override def getMapping(columnMetaData: ResultSet, cx: Connection): Class[_] = {
    val mapping = super.getMapping(columnMetaData, cx)
    if (mapping != null && mapping.isArray) {
      classOf[java.util.List[_]]
    } else {
      mapping
    }
  }

  /**
   * Gets the array type for a list/array column
   *
   * @param binding list-type binding
   * @return
   */
  private def getListTypeMapping(binding: Class[_]): String = {
    val mappings = new java.util.HashMap[String, Class[_]]()
    registerSqlTypeNameToClassMappings(mappings)
    var mapping: String = null
    var partial: String = null
    val iter = mappings.asScala.iterator
    while (iter.hasNext && mapping == null) {
      val (name, clas) = iter.next
      if (clas == binding) {
        mapping = name
      } else if (partial == null && clas.isAssignableFrom(binding)) {
        partial = name
      }
    }
    if (mapping != null) {
      mapping
    } else if (partial != null) {
      partial
    } else {
      logger.warn(s"Could not find list-type column for type ${binding.getName}")
      "text"
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
>>>>>>> ee1d5f207 (GEOMESA-3215 Postgis - support List-type attributes)
<<<<<<< HEAD
>>>>>>> 47f8de1bb (GEOMESA-3215 Postgis - support List-type attributes)
<<<<<<< HEAD
>>>>>>> afb207dc68 (GEOMESA-3215 Postgis - support List-type attributes)
=======
=======
=======
>>>>>>> dcd872c1a (GEOMESA-3212 Postgis - convert constant functions to literals for SQL translation (#2875))
>>>>>>> 5e000da48 (GEOMESA-3212 Postgis - convert constant functions to literals for SQL translation (#2875))
<<<<<<< HEAD
>>>>>>> e694961e05 (GEOMESA-3212 Postgis - convert constant functions to literals for SQL translation (#2875))
<<<<<<< HEAD
>>>>>>> d30ebb4092 (GEOMESA-3212 Postgis - convert constant functions to literals for SQL translation (#2875))
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
<<<<<<< HEAD
>>>>>>> 09d87762c5 (GEOMESA-3254 Add Bloop build support)
<<<<<<< HEAD
>>>>>>> 63a045a753 (GEOMESA-3254 Add Bloop build support)
=======
=======
=======
=======
>>>>>>> dcd872c1a (GEOMESA-3212 Postgis - convert constant functions to literals for SQL translation (#2875))
>>>>>>> 713060f3a (GEOMESA-3212 Postgis - convert constant functions to literals for SQL translation (#2875))
<<<<<<< HEAD
>>>>>>> 50a84fd0eb (GEOMESA-3212 Postgis - convert constant functions to literals for SQL translation (#2875))
<<<<<<< HEAD
>>>>>>> ddf486214c (GEOMESA-3212 Postgis - convert constant functions to literals for SQL translation (#2875))
=======
=======
=======
<<<<<<< HEAD
=======
>>>>>>> dcd872c1a (GEOMESA-3212 Postgis - convert constant functions to literals for SQL translation (#2875))
=======
>>>>>>> ee1d5f207 (GEOMESA-3215 Postgis - support List-type attributes)
>>>>>>> 42af7673b (GEOMESA-3215 Postgis - support List-type attributes)
>>>>>>> 6d3c0ecb75 (GEOMESA-3215 Postgis - support List-type attributes)
>>>>>>> 75e1524a30 (GEOMESA-3215 Postgis - support List-type attributes)
=======
=======
>>>>>>> dcd872c1a (GEOMESA-3212 Postgis - convert constant functions to literals for SQL translation (#2875))
>>>>>>> f5b2148366 (GEOMESA-3212 Postgis - convert constant functions to literals for SQL translation (#2875))
<<<<<<< HEAD
<<<<<<< HEAD
=======
>>>>>>> 7e990c0c62 (GEOMESA-3215 Postgis - support List-type attributes)
=======
=======
>>>>>>> dcd872c1a (GEOMESA-3212 Postgis - convert constant functions to literals for SQL translation (#2875))
=======
>>>>>>> ee1d5f207 (GEOMESA-3215 Postgis - support List-type attributes)
>>>>>>> 7542dc78d8 (GEOMESA-3215 Postgis - support List-type attributes)
<<<<<<< HEAD
=======
=======
>>>>>>> bf9e5cdd91 (GEOMESA-3215 Postgis - support List-type attributes)
=======
<<<<<<< HEAD
>>>>>>> f1532f2313 (GEOMESA-3254 Add Bloop build support)
=======
<<<<<<< HEAD
>>>>>>> 64b3066584 (GEOMESA-3212 Postgis - convert constant functions to literals for SQL translation (#2875))
=======
<<<<<<< HEAD
>>>>>>> 4b7c48b509 (GEOMESA-3215 Postgis - support List-type attributes)
=======
<<<<<<< HEAD
>>>>>>> ad8bba7bb7 (GEOMESA-3212 Postgis - convert constant functions to literals for SQL translation (#2875))
=======
<<<<<<< HEAD
>>>>>>> 9d3260f1dc (GEOMESA-3215 Postgis - support List-type attributes)
=======
<<<<<<< HEAD
>>>>>>> 5a4c24e020 (GEOMESA-3254 Add Bloop build support)
=======
<<<<<<< HEAD
>>>>>>> b8426b262b (GEOMESA-3212 Postgis - convert constant functions to literals for SQL translation (#2875))
=======
>>>>>>> a207fd51c3 (GEOMESA-3215 Postgis - support List-type attributes)
=======
<<<<<<< HEAD
  override def splitFilter(filter: Filter, schema: SimpleFeatureType): Array[Filter] =
    super.splitFilter(LiteralFunctionVisitor(filter), schema)
<<<<<<< HEAD
>>>>>>> dcd872c1ac (GEOMESA-3212 Postgis - convert constant functions to literals for SQL translation (#2875))
<<<<<<< HEAD
>>>>>>> df43e72c50 (GEOMESA-3212 Postgis - convert constant functions to literals for SQL translation (#2875))
=======
=======
=======
  override def splitFilter(filter: Filter, schema: SimpleFeatureType): Array[Filter] =
    super.splitFilter(LiteralFunctionVisitor(filter), schema)
<<<<<<< HEAD
<<<<<<< HEAD
>>>>>>> 713060f3a2 (GEOMESA-3212 Postgis - convert constant functions to literals for SQL translation (#2875))
<<<<<<< HEAD
>>>>>>> f5b2148366 (GEOMESA-3212 Postgis - convert constant functions to literals for SQL translation (#2875))
=======
=======
<<<<<<< HEAD
=======
>>>>>>> ee1d5f207 (GEOMESA-3215 Postgis - support List-type attributes)
>>>>>>> 42af7673bd (GEOMESA-3215 Postgis - support List-type attributes)
>>>>>>> 7542dc78d8 (GEOMESA-3215 Postgis - support List-type attributes)
=======
=======
>>>>>>> d845d7c1bd (GEOMESA-3254 Add Bloop build support)
<<<<<<< HEAD
>>>>>>> 7a84c9d22d (GEOMESA-3254 Add Bloop build support)
=======
=======
>>>>>>> 713060f3a2 (GEOMESA-3212 Postgis - convert constant functions to literals for SQL translation (#2875))
<<<<<<< HEAD
>>>>>>> be6b05230c (GEOMESA-3212 Postgis - convert constant functions to literals for SQL translation (#2875))
=======
=======
=======
>>>>>>> ee1d5f207 (GEOMESA-3215 Postgis - support List-type attributes)
>>>>>>> 42af7673bd (GEOMESA-3215 Postgis - support List-type attributes)
<<<<<<< HEAD
>>>>>>> da609e20da (GEOMESA-3215 Postgis - support List-type attributes)
=======
=======
=======
=======
>>>>>>> 56e5bdc2a5 (GEOMESA-3212 Postgis - convert constant functions to literals for SQL translation (#2875))
=======
=======
>>>>>>> e694961e05 (GEOMESA-3212 Postgis - convert constant functions to literals for SQL translation (#2875))
>>>>>>> 30ec49c9c0 (GEOMESA-3212 Postgis - convert constant functions to literals for SQL translation (#2875))
  override def splitFilter(filter: Filter, schema: SimpleFeatureType): Array[Filter] = {
    import PartitionedPostgisDialect.Config.ConfigConversions
    super.splitFilter(SplitFilterVisitor(filter, schema.isFilterWholeWorld), schema)
  }
<<<<<<< HEAD
>>>>>>> 1be2e3ecb (GEOMESA-3262 Postgis - add config to skip whole world filters)
<<<<<<< HEAD
>>>>>>> 7d4ed7605c (GEOMESA-3262 Postgis - add config to skip whole world filters)
<<<<<<< HEAD
>>>>>>> b5c0452b13 (GEOMESA-3262 Postgis - add config to skip whole world filters)
=======
=======
=======
=======
  override def splitFilter(filter: Filter, schema: SimpleFeatureType): Array[Filter] =
    super.splitFilter(LiteralFunctionVisitor(filter), schema)
<<<<<<< HEAD
<<<<<<< HEAD
<<<<<<< HEAD
>>>>>>> 5e000da48 (GEOMESA-3212 Postgis - convert constant functions to literals for SQL translation (#2875))
<<<<<<< HEAD
>>>>>>> e694961e05 (GEOMESA-3212 Postgis - convert constant functions to literals for SQL translation (#2875))
<<<<<<< HEAD
>>>>>>> d30ebb4092 (GEOMESA-3212 Postgis - convert constant functions to literals for SQL translation (#2875))
<<<<<<< HEAD
>>>>>>> 30ec49c9c0 (GEOMESA-3212 Postgis - convert constant functions to literals for SQL translation (#2875))
=======
=======
=======
=======
<<<<<<< HEAD
=======
>>>>>>> ee1d5f207 (GEOMESA-3215 Postgis - support List-type attributes)
>>>>>>> cf1d94c7a (GEOMESA-3215 Postgis - support List-type attributes)
<<<<<<< HEAD
>>>>>>> 3a1e1d7213 (GEOMESA-3215 Postgis - support List-type attributes)
<<<<<<< HEAD
>>>>>>> 1913bc4c2c (GEOMESA-3215 Postgis - support List-type attributes)
<<<<<<< HEAD
>>>>>>> e7dfbc3fc1 (GEOMESA-3215 Postgis - support List-type attributes)
=======
=======
=======
=======
>>>>>>> d845d7c1b (GEOMESA-3254 Add Bloop build support)
<<<<<<< HEAD
>>>>>>> 09d87762c5 (GEOMESA-3254 Add Bloop build support)
<<<<<<< HEAD
>>>>>>> 63a045a753 (GEOMESA-3254 Add Bloop build support)
<<<<<<< HEAD
>>>>>>> b298e017f1 (GEOMESA-3254 Add Bloop build support)
=======
=======
=======
=======
>>>>>>> 713060f3a (GEOMESA-3212 Postgis - convert constant functions to literals for SQL translation (#2875))
>>>>>>> 50a84fd0eb (GEOMESA-3212 Postgis - convert constant functions to literals for SQL translation (#2875))
>>>>>>> ddf486214c (GEOMESA-3212 Postgis - convert constant functions to literals for SQL translation (#2875))
>>>>>>> e4a3f1a534 (GEOMESA-3212 Postgis - convert constant functions to literals for SQL translation (#2875))
=======
=======
>>>>>>> 6768ebe0c2 (GEOMESA-3215 Postgis - support List-type attributes)
>>>>>>> 5e000da485 (GEOMESA-3212 Postgis - convert constant functions to literals for SQL translation (#2875))
<<<<<<< HEAD
>>>>>>> 406de071e1 (GEOMESA-3212 Postgis - convert constant functions to literals for SQL translation (#2875))
<<<<<<< HEAD
>>>>>>> edde3a188e (GEOMESA-3212 Postgis - convert constant functions to literals for SQL translation (#2875))
=======
=======
=======
<<<<<<< HEAD
=======
>>>>>>> ee1d5f207 (GEOMESA-3215 Postgis - support List-type attributes)
>>>>>>> cf1d94c7a8 (GEOMESA-3215 Postgis - support List-type attributes)
>>>>>>> bf9e5cdd91 (GEOMESA-3215 Postgis - support List-type attributes)
>>>>>>> 6768ebe0c2 (GEOMESA-3215 Postgis - support List-type attributes)

  override def registerClassToSqlMappings(mappings: java.util.Map[Class[_], Integer]): Unit = {
    super.registerClassToSqlMappings(mappings)
    mappings.put(classOf[java.util.List[_]], Types.ARRAY)
  }

  override def registerSqlTypeNameToClassMappings(mappings: java.util.Map[String, Class[_]]): Unit = {
    super.registerSqlTypeNameToClassMappings(mappings)
    mappings.put("array", classOf[java.util.List[_]])
  }

  override def registerSqlTypeToSqlTypeNameOverrides(overrides: java.util.Map[Integer, String]): Unit = {
    super.registerSqlTypeToSqlTypeNameOverrides(overrides)
    overrides.put(Types.ARRAY, "ARRAY")
  }

  override def encodePostColumnCreateTable(att: AttributeDescriptor, sql: StringBuffer): Unit = {
<<<<<<< HEAD
    att match {
      case gd: GeometryDescriptor =>
        val nullable = gd.getMinOccurs <= 0 || gd.isNillable
        val i = sql.lastIndexOf("geometry")
        // expect `geometry NOT NULL` or `geometry` depending on nullable flag
        if (i == -1 || (nullable && i != sql.length() - 8) || (!nullable && i != sql.length() - 17)) {
          logger.warn(s"Found geometry-type attribute but no geometry column binding: $sql")
        } else {
          val srid =
            Option(gd.getUserData.get(JDBCDataStore.JDBC_NATIVE_SRID).asInstanceOf[Integer])
                .orElse(Option(gd.getCoordinateReferenceSystem).flatMap(crs => Try(CRS.lookupEpsgCode(crs, true)).filter(_ != null).toOption))
                .map(_.intValue())
                .getOrElse(-1)
          val geomType = PartitionedPostgisDialect.GeometryMappings.getOrElse(gd.getType.getBinding, "GEOMETRY")
          val geomTypeWithDims =
            Option(gd.getUserData.get(Hints.COORDINATE_DIMENSION).asInstanceOf[Integer]).map(_.intValue) match {
              case None | Some(2) => geomType
              case Some(3) => s"${geomType}Z"
              case Some(4) => s"${geomType}ZM"
              case Some(d) =>
                throw new IllegalArgumentException(
                  s"PostGIS only supports geometries with 2, 3 and 4 dimensions, but found: $d")
            }
          sql.insert(i + 8, s" ($geomTypeWithDims, $srid)")
        }

      case _ if att.isJson() =>
        // replace 'VARCHAR' with jsonb
        val i = sql.lastIndexOf(" VARCHAR")
        if (i == sql.length() - 8) {
          sql.replace(i + 1, i + 8, "JSONB")
        } else {
          logger.warn(s"Found JSON-type attribute but no CHARACTER VARYING column binding: $sql")
        }

      case _ if att.isList =>
        // go back and encode the array type in the CQL create statement
        val i = sql.lastIndexOf(" ARRAY")
        if (i == sql.length() - 6) {
          sql.insert(i, " " + getListTypeMapping(att.getListType()))
        } else {
          logger.warn(s"Found list-type attribute but no ARRAY column binding: $sql")
        }

      case _ => // no-op
<<<<<<< HEAD
<<<<<<< HEAD
=======
    super.encodePostColumnCreateTable(att, sql)
<<<<<<< HEAD
<<<<<<< HEAD
=======
>>>>>>> 230ae6c3ab (GEOMESA-3217,GEOMESA-3216 Support Postgis json attributes, top-level arrays in json)
    if (att.isJson()) {
      // replace 'VARCHAR' with jsonb
      val i = sql.lastIndexOf(" VARCHAR")
      if (i == sql.length() - 8) {
        sql.replace(i + 1, i + 8, "JSONB")
      } else {
        logger.warn(s"Found JSON-type attribute but no CHARACTER VARYING column binding: $sql")
      }
    } else if (att.isList) {
<<<<<<< HEAD
=======
    if (att.isList) {
>>>>>>> 3a1e1d7213 (GEOMESA-3215 Postgis - support List-type attributes)
=======
>>>>>>> 230ae6c3ab (GEOMESA-3217,GEOMESA-3216 Support Postgis json attributes, top-level arrays in json)
=======
=======
    super.encodePostColumnCreateTable(att, sql)
    if (att.isList) {
>>>>>>> bf9e5cdd91 (GEOMESA-3215 Postgis - support List-type attributes)
      // go back and encode the array type in the CQL create statement
      val i = sql.lastIndexOf(" ARRAY")
      if (i == sql.length() - 6) {
        sql.insert(i, " " + getListTypeMapping(att.getListType()))
      } else {
        logger.warn(s"Found list-type attribute but no ARRAY column binding: $sql")
      }
>>>>>>> ee1d5f207 (GEOMESA-3215 Postgis - support List-type attributes)
<<<<<<< HEAD
=======
>>>>>>> 09d87762c5 (GEOMESA-3254 Add Bloop build support)
=======
>>>>>>> bf9e5cdd91 (GEOMESA-3215 Postgis - support List-type attributes)
    }
  }

  override def getMapping(columnMetaData: ResultSet, cx: Connection): Class[_] = {
    val mapping = super.getMapping(columnMetaData, cx)
    if (mapping != null && mapping.isArray) {
      classOf[java.util.List[_]]
    } else {
      mapping
    }
  }

  /**
   * Gets the array type for a list/array column
   *
   * @param binding list-type binding
   * @return
   */
  private def getListTypeMapping(binding: Class[_]): String = {
    val mappings = new java.util.HashMap[String, Class[_]]()
    registerSqlTypeNameToClassMappings(mappings)
    var mapping: String = null
    var partial: String = null
    val iter = mappings.asScala.iterator
    while (iter.hasNext && mapping == null) {
      val (name, clas) = iter.next
      if (clas == binding) {
        mapping = name
      } else if (partial == null && clas.isAssignableFrom(binding)) {
        partial = name
      }
    }
    if (mapping != null) {
      mapping
    } else if (partial != null) {
      partial
    } else {
      logger.warn(s"Could not find list-type column for type ${binding.getName}")
      "text"
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
>>>>>>> bf9e5cdd91 (GEOMESA-3215 Postgis - support List-type attributes)
=======
<<<<<<< HEAD
=======
>>>>>>> 3ab56cb4cf (GEOMESA-3212 Postgis - convert constant functions to literals for SQL translation (#2875))
<<<<<<< HEAD
<<<<<<< HEAD
=======
  override def splitFilter(filter: Filter, schema: SimpleFeatureType): Array[Filter] =
    super.splitFilter(LiteralFunctionVisitor(filter), schema)
<<<<<<< HEAD
>>>>>>> dcd872c1ac (GEOMESA-3212 Postgis - convert constant functions to literals for SQL translation (#2875))
=======
=======
  override def splitFilter(filter: Filter, schema: SimpleFeatureType): Array[Filter] =
    super.splitFilter(LiteralFunctionVisitor(filter), schema)
<<<<<<< HEAD
<<<<<<< HEAD
>>>>>>> 713060f3a2 (GEOMESA-3212 Postgis - convert constant functions to literals for SQL translation (#2875))
<<<<<<< HEAD
>>>>>>> f5b2148366 (GEOMESA-3212 Postgis - convert constant functions to literals for SQL translation (#2875))
=======
=======
<<<<<<< HEAD
=======
>>>>>>> ee1d5f207 (GEOMESA-3215 Postgis - support List-type attributes)
>>>>>>> 42af7673bd (GEOMESA-3215 Postgis - support List-type attributes)
>>>>>>> 7542dc78d8 (GEOMESA-3215 Postgis - support List-type attributes)
=======
>>>>>>> f1532f2313 (GEOMESA-3254 Add Bloop build support)
=======
>>>>>>> d845d7c1bd (GEOMESA-3254 Add Bloop build support)
=======
>>>>>>> 713060f3a2 (GEOMESA-3212 Postgis - convert constant functions to literals for SQL translation (#2875))
<<<<<<< HEAD
>>>>>>> 64b3066584 (GEOMESA-3212 Postgis - convert constant functions to literals for SQL translation (#2875))
=======
=======
=======
>>>>>>> ee1d5f207 (GEOMESA-3215 Postgis - support List-type attributes)
>>>>>>> 42af7673bd (GEOMESA-3215 Postgis - support List-type attributes)
<<<<<<< HEAD
>>>>>>> 4b7c48b509 (GEOMESA-3215 Postgis - support List-type attributes)
=======
=======
=======
=======
>>>>>>> ad8bba7bb7 (GEOMESA-3212 Postgis - convert constant functions to literals for SQL translation (#2875))
=======
=======
>>>>>>> e694961e05 (GEOMESA-3212 Postgis - convert constant functions to literals for SQL translation (#2875))
>>>>>>> 4983e191e6 (GEOMESA-3212 Postgis - convert constant functions to literals for SQL translation (#2875))
  override def splitFilter(filter: Filter, schema: SimpleFeatureType): Array[Filter] = {
    import PartitionedPostgisDialect.Config.ConfigConversions
    super.splitFilter(SplitFilterVisitor(filter, schema.isFilterWholeWorld), schema)
  }
<<<<<<< HEAD
>>>>>>> 1be2e3ecb (GEOMESA-3262 Postgis - add config to skip whole world filters)
<<<<<<< HEAD
>>>>>>> 7d4ed7605c (GEOMESA-3262 Postgis - add config to skip whole world filters)
<<<<<<< HEAD
>>>>>>> 75d5a347f8 (GEOMESA-3262 Postgis - add config to skip whole world filters)
=======
=======
=======
=======
  override def splitFilter(filter: Filter, schema: SimpleFeatureType): Array[Filter] =
    super.splitFilter(LiteralFunctionVisitor(filter), schema)
<<<<<<< HEAD
<<<<<<< HEAD
>>>>>>> 5e000da48 (GEOMESA-3212 Postgis - convert constant functions to literals for SQL translation (#2875))
<<<<<<< HEAD
>>>>>>> e694961e05 (GEOMESA-3212 Postgis - convert constant functions to literals for SQL translation (#2875))
<<<<<<< HEAD
>>>>>>> d30ebb4092 (GEOMESA-3212 Postgis - convert constant functions to literals for SQL translation (#2875))
<<<<<<< HEAD
>>>>>>> 4983e191e6 (GEOMESA-3212 Postgis - convert constant functions to literals for SQL translation (#2875))
=======
=======
=======
=======
<<<<<<< HEAD
=======
>>>>>>> ee1d5f207 (GEOMESA-3215 Postgis - support List-type attributes)
>>>>>>> cf1d94c7a (GEOMESA-3215 Postgis - support List-type attributes)
=======
>>>>>>> 5a4c24e020 (GEOMESA-3254 Add Bloop build support)
>>>>>>> 3a1e1d7213 (GEOMESA-3215 Postgis - support List-type attributes)
<<<<<<< HEAD
>>>>>>> 1913bc4c2c (GEOMESA-3215 Postgis - support List-type attributes)
<<<<<<< HEAD
>>>>>>> 9d3260f1dc (GEOMESA-3215 Postgis - support List-type attributes)
=======
=======
=======
=======
>>>>>>> d845d7c1b (GEOMESA-3254 Add Bloop build support)
=======
>>>>>>> b8426b262b (GEOMESA-3212 Postgis - convert constant functions to literals for SQL translation (#2875))
>>>>>>> 09d87762c5 (GEOMESA-3254 Add Bloop build support)
<<<<<<< HEAD
>>>>>>> 63a045a753 (GEOMESA-3254 Add Bloop build support)
<<<<<<< HEAD
>>>>>>> 5a4c24e020 (GEOMESA-3254 Add Bloop build support)
=======
=======
=======
=======
>>>>>>> 713060f3a (GEOMESA-3212 Postgis - convert constant functions to literals for SQL translation (#2875))
>>>>>>> 50a84fd0eb (GEOMESA-3212 Postgis - convert constant functions to literals for SQL translation (#2875))
>>>>>>> ddf486214c (GEOMESA-3212 Postgis - convert constant functions to literals for SQL translation (#2875))
>>>>>>> b8426b262b (GEOMESA-3212 Postgis - convert constant functions to literals for SQL translation (#2875))

  override def registerClassToSqlMappings(mappings: java.util.Map[Class[_], Integer]): Unit = {
    super.registerClassToSqlMappings(mappings)
    mappings.put(classOf[java.util.List[_]], Types.ARRAY)
  }

  override def registerSqlTypeNameToClassMappings(mappings: java.util.Map[String, Class[_]]): Unit = {
    super.registerSqlTypeNameToClassMappings(mappings)
    mappings.put("array", classOf[java.util.List[_]])
  }

  override def registerSqlTypeToSqlTypeNameOverrides(overrides: java.util.Map[Integer, String]): Unit = {
    super.registerSqlTypeToSqlTypeNameOverrides(overrides)
    overrides.put(Types.ARRAY, "ARRAY")
  }

  override def encodePostColumnCreateTable(att: AttributeDescriptor, sql: StringBuffer): Unit = {
    att match {
      case gd: GeometryDescriptor =>
        val nullable = gd.getMinOccurs <= 0 || gd.isNillable
        val i = sql.lastIndexOf("geometry")
        // expect `geometry NOT NULL` or `geometry` depending on nullable flag
        if (i == -1 || (nullable && i != sql.length() - 8) || (!nullable && i != sql.length() - 17)) {
          logger.warn(s"Found geometry-type attribute but no geometry column binding: $sql")
        } else {
          val srid =
            Option(gd.getUserData.get(JDBCDataStore.JDBC_NATIVE_SRID).asInstanceOf[Integer])
                .orElse(Option(gd.getCoordinateReferenceSystem).flatMap(crs => Try(CRS.lookupEpsgCode(crs, true)).filter(_ != null).toOption))
                .map(_.intValue())
                .getOrElse(-1)
          val geomType = PartitionedPostgisDialect.GeometryMappings.getOrElse(gd.getType.getBinding, "GEOMETRY")
          val geomTypeWithDims =
            Option(gd.getUserData.get(Hints.COORDINATE_DIMENSION).asInstanceOf[Integer]).map(_.intValue) match {
              case None | Some(2) => geomType
              case Some(3) => s"${geomType}Z"
              case Some(4) => s"${geomType}ZM"
              case Some(d) =>
                throw new IllegalArgumentException(
                  s"PostGIS only supports geometries with 2, 3 and 4 dimensions, but found: $d")
            }
          sql.insert(i + 8, s" ($geomTypeWithDims, $srid)")
        }

      case _ if att.isJson() =>
        // replace 'VARCHAR' with jsonb
        val i = sql.lastIndexOf(" VARCHAR")
        if (i == sql.length() - 8) {
          sql.replace(i + 1, i + 8, "JSONB")
        } else {
          logger.warn(s"Found JSON-type attribute but no CHARACTER VARYING column binding: $sql")
        }

      case _ if att.isList =>
        // go back and encode the array type in the CQL create statement
        val i = sql.lastIndexOf(" ARRAY")
        if (i == sql.length() - 6) {
          sql.insert(i, " " + getListTypeMapping(att.getListType()))
        } else {
          logger.warn(s"Found list-type attribute but no ARRAY column binding: $sql")
        }

      case _ => // no-op
<<<<<<< HEAD
=======
    super.encodePostColumnCreateTable(att, sql)
<<<<<<< HEAD
<<<<<<< HEAD
=======
>>>>>>> 230ae6c3ab (GEOMESA-3217,GEOMESA-3216 Support Postgis json attributes, top-level arrays in json)
    if (att.isJson()) {
      // replace 'VARCHAR' with jsonb
      val i = sql.lastIndexOf(" VARCHAR")
      if (i == sql.length() - 8) {
        sql.replace(i + 1, i + 8, "JSONB")
      } else {
        logger.warn(s"Found JSON-type attribute but no CHARACTER VARYING column binding: $sql")
      }
    } else if (att.isList) {
<<<<<<< HEAD
=======
    if (att.isList) {
>>>>>>> 3a1e1d7213 (GEOMESA-3215 Postgis - support List-type attributes)
=======
>>>>>>> 230ae6c3ab (GEOMESA-3217,GEOMESA-3216 Support Postgis json attributes, top-level arrays in json)
      // go back and encode the array type in the CQL create statement
      val i = sql.lastIndexOf(" ARRAY")
      if (i == sql.length() - 6) {
        sql.insert(i, " " + getListTypeMapping(att.getListType()))
      } else {
        logger.warn(s"Found list-type attribute but no ARRAY column binding: $sql")
      }
>>>>>>> ee1d5f207 (GEOMESA-3215 Postgis - support List-type attributes)
=======
>>>>>>> 09d87762c5 (GEOMESA-3254 Add Bloop build support)
    }
  }

  override def getMapping(columnMetaData: ResultSet, cx: Connection): Class[_] = {
    val mapping = super.getMapping(columnMetaData, cx)
    if (mapping != null && mapping.isArray) {
      classOf[java.util.List[_]]
    } else {
      mapping
    }
  }

  /**
   * Gets the array type for a list/array column
   *
   * @param binding list-type binding
   * @return
   */
  private def getListTypeMapping(binding: Class[_]): String = {
    val mappings = new java.util.HashMap[String, Class[_]]()
    registerSqlTypeNameToClassMappings(mappings)
    var mapping: String = null
    var partial: String = null
    val iter = mappings.asScala.iterator
    while (iter.hasNext && mapping == null) {
      val (name, clas) = iter.next
      if (clas == binding) {
        mapping = name
      } else if (partial == null && clas.isAssignableFrom(binding)) {
        partial = name
      }
    }
    if (mapping != null) {
      mapping
    } else if (partial != null) {
      partial
    } else {
      logger.warn(s"Could not find list-type column for type ${binding.getName}")
      "text"
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
>>>>>>> 83c2c09260 (GEOMESA-3212 Postgis - convert constant functions to literals for SQL translation (#2875))
=======
<<<<<<< HEAD
>>>>>>> 6de7ca735b (GEOMESA-3215 Postgis - support List-type attributes)
=======
<<<<<<< HEAD
>>>>>>> c738f63bd9 (GEOMESA-3254 Add Bloop build support)
=======
<<<<<<< HEAD
>>>>>>> eb0302a7c5 (GEOMESA-3212 Postgis - convert constant functions to literals for SQL translation (#2875))
=======
<<<<<<< HEAD
>>>>>>> 34836e5f4e (GEOMESA-3215 Postgis - support List-type attributes)
=======
<<<<<<< HEAD
>>>>>>> 8ed0ae6564 (GEOMESA-3212 Postgis - convert constant functions to literals for SQL translation (#2875))
=======
<<<<<<< HEAD
>>>>>>> 3ce7fe64a3 (GEOMESA-3215 Postgis - support List-type attributes)
=======
<<<<<<< HEAD
>>>>>>> 13656f5052 (GEOMESA-3254 Add Bloop build support)
=======
<<<<<<< HEAD
>>>>>>> d391bc18f0 (GEOMESA-3212 Postgis - convert constant functions to literals for SQL translation (#2875))
>>>>>>> ee1d5f2071 (GEOMESA-3215 Postgis - support List-type attributes)
<<<<<<< HEAD
>>>>>>> 2912d58b06 (GEOMESA-3215 Postgis - support List-type attributes)
=======
=======
>>>>>>> dcd872c1a (GEOMESA-3212 Postgis - convert constant functions to literals for SQL translation (#2875))
<<<<<<< HEAD
>>>>>>> 5e000da485 (GEOMESA-3212 Postgis - convert constant functions to literals for SQL translation (#2875))
<<<<<<< HEAD
>>>>>>> 406de071e1 (GEOMESA-3212 Postgis - convert constant functions to literals for SQL translation (#2875))
=======
=======
=======
>>>>>>> ee1d5f207 (GEOMESA-3215 Postgis - support List-type attributes)
>>>>>>> cf1d94c7a8 (GEOMESA-3215 Postgis - support List-type attributes)
<<<<<<< HEAD
>>>>>>> bf9e5cdd91 (GEOMESA-3215 Postgis - support List-type attributes)
=======
=======
>>>>>>> d845d7c1bd (GEOMESA-3254 Add Bloop build support)
<<<<<<< HEAD
>>>>>>> f1532f2313 (GEOMESA-3254 Add Bloop build support)
=======
=======
=======
>>>>>>> dcd872c1a (GEOMESA-3212 Postgis - convert constant functions to literals for SQL translation (#2875))
>>>>>>> 713060f3a2 (GEOMESA-3212 Postgis - convert constant functions to literals for SQL translation (#2875))
<<<<<<< HEAD
>>>>>>> 64b3066584 (GEOMESA-3212 Postgis - convert constant functions to literals for SQL translation (#2875))
=======
=======
=======
>>>>>>> 9fb20ad56c (GEOMESA-3212 Postgis - convert constant functions to literals for SQL translation (#2875))
=======
>>>>>>> 1913bc4c2c (GEOMESA-3215 Postgis - support List-type attributes)
=======
>>>>>>> 63a045a753 (GEOMESA-3254 Add Bloop build support)
=======
>>>>>>> ddf486214c (GEOMESA-3212 Postgis - convert constant functions to literals for SQL translation (#2875))
=======
>>>>>>> dcd872c1a (GEOMESA-3212 Postgis - convert constant functions to literals for SQL translation (#2875))
=======
>>>>>>> ee1d5f207 (GEOMESA-3215 Postgis - support List-type attributes)
<<<<<<< HEAD
>>>>>>> 42af7673bd (GEOMESA-3215 Postgis - support List-type attributes)
<<<<<<< HEAD
>>>>>>> 4b7c48b509 (GEOMESA-3215 Postgis - support List-type attributes)
=======
=======
=======
=======
>>>>>>> 3a1e1d7213 (GEOMESA-3215 Postgis - support List-type attributes)
=======
>>>>>>> 09d87762c5 (GEOMESA-3254 Add Bloop build support)
=======
>>>>>>> 50a84fd0eb (GEOMESA-3212 Postgis - convert constant functions to literals for SQL translation (#2875))
=======
<<<<<<< HEAD
  override def splitFilter(filter: Filter, schema: SimpleFeatureType): Array[Filter] =
    super.splitFilter(LiteralFunctionVisitor(filter), schema)
<<<<<<< HEAD
>>>>>>> dcd872c1a (GEOMESA-3212 Postgis - convert constant functions to literals for SQL translation (#2875))
<<<<<<< HEAD
>>>>>>> 91b820951 (GEOMESA-3212 Postgis - convert constant functions to literals for SQL translation (#2875))
<<<<<<< HEAD
>>>>>>> 9fb20ad56c (GEOMESA-3212 Postgis - convert constant functions to literals for SQL translation (#2875))
<<<<<<< HEAD
>>>>>>> ad8bba7bb7 (GEOMESA-3212 Postgis - convert constant functions to literals for SQL translation (#2875))
=======
=======
=======
=======
<<<<<<< HEAD
=======
=======
>>>>>>> ee1d5f207 (GEOMESA-3215 Postgis - support List-type attributes)
>>>>>>> 42af7673b (GEOMESA-3215 Postgis - support List-type attributes)

  override def registerClassToSqlMappings(mappings: java.util.Map[Class[_], Integer]): Unit = {
    super.registerClassToSqlMappings(mappings)
    mappings.put(classOf[java.util.List[_]], Types.ARRAY)
  }

  override def registerSqlTypeNameToClassMappings(mappings: java.util.Map[String, Class[_]]): Unit = {
    super.registerSqlTypeNameToClassMappings(mappings)
    mappings.put("array", classOf[java.util.List[_]])
  }

  override def registerSqlTypeToSqlTypeNameOverrides(overrides: java.util.Map[Integer, String]): Unit = {
    super.registerSqlTypeToSqlTypeNameOverrides(overrides)
    overrides.put(Types.ARRAY, "ARRAY")
  }

  override def encodePostColumnCreateTable(att: AttributeDescriptor, sql: StringBuffer): Unit = {
<<<<<<< HEAD
    att match {
      case gd: GeometryDescriptor =>
        val nullable = gd.getMinOccurs <= 0 || gd.isNillable
        val i = sql.lastIndexOf("geometry")
        // expect `geometry NOT NULL` or `geometry` depending on nullable flag
        if (i == -1 || (nullable && i != sql.length() - 8) || (!nullable && i != sql.length() - 17)) {
          logger.warn(s"Found geometry-type attribute but no geometry column binding: $sql")
        } else {
          val srid =
            Option(gd.getUserData.get(JDBCDataStore.JDBC_NATIVE_SRID).asInstanceOf[Integer])
                .orElse(Option(gd.getCoordinateReferenceSystem).flatMap(crs => Try(CRS.lookupEpsgCode(crs, true)).filter(_ != null).toOption))
                .map(_.intValue())
                .getOrElse(-1)
          val geomType = PartitionedPostgisDialect.GeometryMappings.getOrElse(gd.getType.getBinding, "GEOMETRY")
          val geomTypeWithDims =
            Option(gd.getUserData.get(Hints.COORDINATE_DIMENSION).asInstanceOf[Integer]).map(_.intValue) match {
              case None | Some(2) => geomType
              case Some(3) => s"${geomType}Z"
              case Some(4) => s"${geomType}ZM"
              case Some(d) =>
                throw new IllegalArgumentException(
                  s"PostGIS only supports geometries with 2, 3 and 4 dimensions, but found: $d")
            }
          sql.insert(i + 8, s" ($geomTypeWithDims, $srid)")
        }

      case _ if att.isJson() =>
        // replace 'VARCHAR' with jsonb
        val i = sql.lastIndexOf(" VARCHAR")
        if (i == sql.length() - 8) {
          sql.replace(i + 1, i + 8, "JSONB")
        } else {
          logger.warn(s"Found JSON-type attribute but no CHARACTER VARYING column binding: $sql")
        }

      case _ if att.isList =>
        // go back and encode the array type in the CQL create statement
        val i = sql.lastIndexOf(" ARRAY")
        if (i == sql.length() - 6) {
          sql.insert(i, " " + getListTypeMapping(att.getListType()))
        } else {
          logger.warn(s"Found list-type attribute but no ARRAY column binding: $sql")
        }

      case _ => // no-op
=======
    super.encodePostColumnCreateTable(att, sql)
    if (att.isJson()) {
      // replace 'VARCHAR' with jsonb
      val i = sql.lastIndexOf(" VARCHAR")
      if (i == sql.length() - 8) {
        sql.replace(i + 1, i + 8, "JSONB")
      } else {
        logger.warn(s"Found JSON-type attribute but no CHARACTER VARYING column binding: $sql")
      }
    } else if (att.isList) {
      // go back and encode the array type in the CQL create statement
      val i = sql.lastIndexOf(" ARRAY")
      if (i == sql.length() - 6) {
        sql.insert(i, " " + getListTypeMapping(att.getListType()))
      } else {
        logger.warn(s"Found list-type attribute but no ARRAY column binding: $sql")
      }
>>>>>>> ee1d5f207 (GEOMESA-3215 Postgis - support List-type attributes)
    }
  }

  override def getMapping(columnMetaData: ResultSet, cx: Connection): Class[_] = {
    val mapping = super.getMapping(columnMetaData, cx)
    if (mapping != null && mapping.isArray) {
      classOf[java.util.List[_]]
    } else {
      mapping
    }
  }

  /**
   * Gets the array type for a list/array column
   *
   * @param binding list-type binding
   * @return
   */
  private def getListTypeMapping(binding: Class[_]): String = {
    val mappings = new java.util.HashMap[String, Class[_]]()
    registerSqlTypeNameToClassMappings(mappings)
    var mapping: String = null
    var partial: String = null
    val iter = mappings.asScala.iterator
    while (iter.hasNext && mapping == null) {
      val (name, clas) = iter.next
      if (clas == binding) {
        mapping = name
      } else if (partial == null && clas.isAssignableFrom(binding)) {
        partial = name
      }
    }
    if (mapping != null) {
      mapping
    } else if (partial != null) {
      partial
    } else {
      logger.warn(s"Could not find list-type column for type ${binding.getName}")
      "text"
    }
  }
<<<<<<< HEAD
>>>>>>> ee1d5f207 (GEOMESA-3215 Postgis - support List-type attributes)
<<<<<<< HEAD
>>>>>>> 47f8de1bb (GEOMESA-3215 Postgis - support List-type attributes)
<<<<<<< HEAD
>>>>>>> afb207dc68 (GEOMESA-3215 Postgis - support List-type attributes)
<<<<<<< HEAD
>>>>>>> 69a6e5986e (GEOMESA-3215 Postgis - support List-type attributes)
=======
=======
=======
=======
>>>>>>> dcd872c1a (GEOMESA-3212 Postgis - convert constant functions to literals for SQL translation (#2875))
>>>>>>> 5e000da48 (GEOMESA-3212 Postgis - convert constant functions to literals for SQL translation (#2875))
<<<<<<< HEAD
>>>>>>> e694961e05 (GEOMESA-3212 Postgis - convert constant functions to literals for SQL translation (#2875))
<<<<<<< HEAD
>>>>>>> d30ebb4092 (GEOMESA-3212 Postgis - convert constant functions to literals for SQL translation (#2875))
<<<<<<< HEAD
>>>>>>> 4983e191e6 (GEOMESA-3212 Postgis - convert constant functions to literals for SQL translation (#2875))
=======
=======
=======
=======
>>>>>>> ee1d5f207 (GEOMESA-3215 Postgis - support List-type attributes)
>>>>>>> cf1d94c7a (GEOMESA-3215 Postgis - support List-type attributes)
<<<<<<< HEAD
>>>>>>> 3a1e1d7213 (GEOMESA-3215 Postgis - support List-type attributes)
<<<<<<< HEAD
>>>>>>> 1913bc4c2c (GEOMESA-3215 Postgis - support List-type attributes)
<<<<<<< HEAD
>>>>>>> 9d3260f1dc (GEOMESA-3215 Postgis - support List-type attributes)
=======
=======
=======
=======
>>>>>>> d845d7c1b (GEOMESA-3254 Add Bloop build support)
<<<<<<< HEAD
>>>>>>> 09d87762c5 (GEOMESA-3254 Add Bloop build support)
<<<<<<< HEAD
>>>>>>> 63a045a753 (GEOMESA-3254 Add Bloop build support)
<<<<<<< HEAD
>>>>>>> 5a4c24e020 (GEOMESA-3254 Add Bloop build support)
=======
=======
=======
=======
=======
>>>>>>> dcd872c1a (GEOMESA-3212 Postgis - convert constant functions to literals for SQL translation (#2875))
>>>>>>> 713060f3a (GEOMESA-3212 Postgis - convert constant functions to literals for SQL translation (#2875))
<<<<<<< HEAD
>>>>>>> 50a84fd0eb (GEOMESA-3212 Postgis - convert constant functions to literals for SQL translation (#2875))
<<<<<<< HEAD
>>>>>>> ddf486214c (GEOMESA-3212 Postgis - convert constant functions to literals for SQL translation (#2875))
<<<<<<< HEAD
>>>>>>> b8426b262b (GEOMESA-3212 Postgis - convert constant functions to literals for SQL translation (#2875))
=======
=======
=======
=======
<<<<<<< HEAD
=======
>>>>>>> dcd872c1a (GEOMESA-3212 Postgis - convert constant functions to literals for SQL translation (#2875))
=======
>>>>>>> ee1d5f207 (GEOMESA-3215 Postgis - support List-type attributes)
>>>>>>> 42af7673b (GEOMESA-3215 Postgis - support List-type attributes)
>>>>>>> 6d3c0ecb75 (GEOMESA-3215 Postgis - support List-type attributes)
>>>>>>> 75e1524a30 (GEOMESA-3215 Postgis - support List-type attributes)
<<<<<<< HEAD
<<<<<<< HEAD
>>>>>>> 6edc66c3cb (GEOMESA-3215 Postgis - support List-type attributes)
=======
<<<<<<< HEAD
=======
>>>>>>> 83c2c09260 (GEOMESA-3212 Postgis - convert constant functions to literals for SQL translation (#2875))
=======
=======
>>>>>>> dcd872c1a (GEOMESA-3212 Postgis - convert constant functions to literals for SQL translation (#2875))
>>>>>>> f5b2148366 (GEOMESA-3212 Postgis - convert constant functions to literals for SQL translation (#2875))
<<<<<<< HEAD
<<<<<<< HEAD
<<<<<<< HEAD
>>>>>>> a26c0acbb7 (GEOMESA-3212 Postgis - convert constant functions to literals for SQL translation (#2875))
=======
<<<<<<< HEAD
=======
>>>>>>> 6de7ca735b (GEOMESA-3215 Postgis - support List-type attributes)
=======
=======
>>>>>>> dcd872c1a (GEOMESA-3212 Postgis - convert constant functions to literals for SQL translation (#2875))
=======
>>>>>>> ee1d5f207 (GEOMESA-3215 Postgis - support List-type attributes)
>>>>>>> 7542dc78d8 (GEOMESA-3215 Postgis - support List-type attributes)
<<<<<<< HEAD
<<<<<<< HEAD
>>>>>>> 7e990c0c62 (GEOMESA-3215 Postgis - support List-type attributes)
=======
=======
>>>>>>> 7a84c9d22d (GEOMESA-3254 Add Bloop build support)
=======
>>>>>>> be6b05230c (GEOMESA-3212 Postgis - convert constant functions to literals for SQL translation (#2875))
=======
>>>>>>> da609e20da (GEOMESA-3215 Postgis - support List-type attributes)
=======
>>>>>>> 56e5bdc2a5 (GEOMESA-3212 Postgis - convert constant functions to literals for SQL translation (#2875))
=======
>>>>>>> e7dfbc3fc1 (GEOMESA-3215 Postgis - support List-type attributes)
=======
>>>>>>> b298e017f1 (GEOMESA-3254 Add Bloop build support)
=======
>>>>>>> e4a3f1a534 (GEOMESA-3212 Postgis - convert constant functions to literals for SQL translation (#2875))
=======
<<<<<<< HEAD
  override def splitFilter(filter: Filter, schema: SimpleFeatureType): Array[Filter] =
    super.splitFilter(LiteralFunctionVisitor(filter), schema)
<<<<<<< HEAD
>>>>>>> dcd872c1ac (GEOMESA-3212 Postgis - convert constant functions to literals for SQL translation (#2875))
<<<<<<< HEAD
>>>>>>> 7481483700 (GEOMESA-3212 Postgis - convert constant functions to literals for SQL translation (#2875))
=======
=======

  override def registerClassToSqlMappings(mappings: java.util.Map[Class[_], Integer]): Unit = {
    super.registerClassToSqlMappings(mappings)
    mappings.put(classOf[java.util.List[_]], Types.ARRAY)
  }

  override def registerSqlTypeNameToClassMappings(mappings: java.util.Map[String, Class[_]]): Unit = {
    super.registerSqlTypeNameToClassMappings(mappings)
    mappings.put("array", classOf[java.util.List[_]])
  }

  override def registerSqlTypeToSqlTypeNameOverrides(overrides: java.util.Map[Integer, String]): Unit = {
    super.registerSqlTypeToSqlTypeNameOverrides(overrides)
    overrides.put(Types.ARRAY, "ARRAY")
  }

  override def encodePostColumnCreateTable(att: AttributeDescriptor, sql: StringBuffer): Unit = {
    att match {
      case gd: GeometryDescriptor =>
        val nullable = gd.getMinOccurs <= 0 || gd.isNillable
        val i = sql.lastIndexOf("geometry")
        // expect `geometry NOT NULL` or `geometry` depending on nullable flag
        if (i == -1 || (nullable && i != sql.length() - 8) || (!nullable && i != sql.length() - 17)) {
          logger.warn(s"Found geometry-type attribute but no geometry column binding: $sql")
        } else {
          val srid =
            Option(gd.getUserData.get(JDBCDataStore.JDBC_NATIVE_SRID).asInstanceOf[Integer])
                .orElse(Option(gd.getCoordinateReferenceSystem).flatMap(crs => Try(CRS.lookupEpsgCode(crs, true)).filter(_ != null).toOption))
                .map(_.intValue())
                .getOrElse(-1)
          val geomType = PartitionedPostgisDialect.GeometryMappings.getOrElse(gd.getType.getBinding, "GEOMETRY")
          val geomTypeWithDims =
            Option(gd.getUserData.get(Hints.COORDINATE_DIMENSION).asInstanceOf[Integer]).map(_.intValue) match {
              case None | Some(2) => geomType
              case Some(3) => s"${geomType}Z"
              case Some(4) => s"${geomType}ZM"
              case Some(d) =>
                throw new IllegalArgumentException(
                  s"PostGIS only supports geometries with 2, 3 and 4 dimensions, but found: $d")
            }
          sql.insert(i + 8, s" ($geomTypeWithDims, $srid)")
        }

      case _ if att.isJson() =>
        // replace 'VARCHAR' with jsonb
        val i = sql.lastIndexOf(" VARCHAR")
        if (i == sql.length() - 8) {
          sql.replace(i + 1, i + 8, "JSONB")
        } else {
          logger.warn(s"Found JSON-type attribute but no CHARACTER VARYING column binding: $sql")
        }

      case _ if att.isList =>
        // go back and encode the array type in the CQL create statement
        val i = sql.lastIndexOf(" ARRAY")
        if (i == sql.length() - 6) {
          sql.insert(i, " " + getListTypeMapping(att.getListType()))
        } else {
          logger.warn(s"Found list-type attribute but no ARRAY column binding: $sql")
        }

      case _ => // no-op
=======
>>>>>>> a980818468 (GEOMESA-3215 Postgis - support List-type attributes)
    }
  }

  override def getMapping(columnMetaData: ResultSet, cx: Connection): Class[_] = {
    val mapping = super.getMapping(columnMetaData, cx)
    if (mapping != null && mapping.isArray) {
      classOf[java.util.List[_]]
    } else {
      mapping
    }
  }

  /**
   * Gets the array type for a list/array column
   *
   * @param binding list-type binding
   * @return
   */
  private def getListTypeMapping(binding: Class[_]): String = {
    val mappings = new java.util.HashMap[String, Class[_]]()
    registerSqlTypeNameToClassMappings(mappings)
    var mapping: String = null
    var partial: String = null
    val iter = mappings.asScala.iterator
    while (iter.hasNext && mapping == null) {
      val (name, clas) = iter.next
      if (clas == binding) {
        mapping = name
      } else if (partial == null && clas.isAssignableFrom(binding)) {
        partial = name
      }
    }
    if (mapping != null) {
      mapping
    } else if (partial != null) {
      partial
    } else {
      logger.warn(s"Could not find list-type column for type ${binding.getName}")
      "text"
    }
  }
<<<<<<< HEAD
<<<<<<< HEAD
>>>>>>> ee1d5f2071 (GEOMESA-3215 Postgis - support List-type attributes)
<<<<<<< HEAD
>>>>>>> 36a7119501 (GEOMESA-3215 Postgis - support List-type attributes)
=======
=======
>>>>>>> dcd872c1a (GEOMESA-3212 Postgis - convert constant functions to literals for SQL translation (#2875))
<<<<<<< HEAD
>>>>>>> 5e000da485 (GEOMESA-3212 Postgis - convert constant functions to literals for SQL translation (#2875))
<<<<<<< HEAD
>>>>>>> d4a1e3591e (GEOMESA-3212 Postgis - convert constant functions to literals for SQL translation (#2875))
=======
=======
=======
>>>>>>> ee1d5f207 (GEOMESA-3215 Postgis - support List-type attributes)
>>>>>>> cf1d94c7a8 (GEOMESA-3215 Postgis - support List-type attributes)
<<<<<<< HEAD
>>>>>>> a207fd51c3 (GEOMESA-3215 Postgis - support List-type attributes)
=======
=======
>>>>>>> d845d7c1bd (GEOMESA-3254 Add Bloop build support)
<<<<<<< HEAD
>>>>>>> 7a84c9d22d (GEOMESA-3254 Add Bloop build support)
=======
=======
=======
>>>>>>> dcd872c1a (GEOMESA-3212 Postgis - convert constant functions to literals for SQL translation (#2875))
>>>>>>> 713060f3a2 (GEOMESA-3212 Postgis - convert constant functions to literals for SQL translation (#2875))
<<<<<<< HEAD
>>>>>>> be6b05230c (GEOMESA-3212 Postgis - convert constant functions to literals for SQL translation (#2875))
=======
=======
=======
>>>>>>> 9fb20ad56c (GEOMESA-3212 Postgis - convert constant functions to literals for SQL translation (#2875))
=======
>>>>>>> 1913bc4c2c (GEOMESA-3215 Postgis - support List-type attributes)
=======
>>>>>>> 63a045a753 (GEOMESA-3254 Add Bloop build support)
=======
>>>>>>> ddf486214c (GEOMESA-3212 Postgis - convert constant functions to literals for SQL translation (#2875))
=======
>>>>>>> dcd872c1a (GEOMESA-3212 Postgis - convert constant functions to literals for SQL translation (#2875))
=======
>>>>>>> ee1d5f207 (GEOMESA-3215 Postgis - support List-type attributes)
<<<<<<< HEAD
>>>>>>> 42af7673bd (GEOMESA-3215 Postgis - support List-type attributes)
<<<<<<< HEAD
>>>>>>> da609e20da (GEOMESA-3215 Postgis - support List-type attributes)
=======
=======
=======
=======
>>>>>>> 3a1e1d7213 (GEOMESA-3215 Postgis - support List-type attributes)
=======
>>>>>>> 09d87762c5 (GEOMESA-3254 Add Bloop build support)
=======
>>>>>>> 50a84fd0eb (GEOMESA-3212 Postgis - convert constant functions to literals for SQL translation (#2875))
=======
<<<<<<< HEAD
  override def splitFilter(filter: Filter, schema: SimpleFeatureType): Array[Filter] =
    super.splitFilter(LiteralFunctionVisitor(filter), schema)
<<<<<<< HEAD
>>>>>>> dcd872c1a (GEOMESA-3212 Postgis - convert constant functions to literals for SQL translation (#2875))
<<<<<<< HEAD
>>>>>>> 91b820951 (GEOMESA-3212 Postgis - convert constant functions to literals for SQL translation (#2875))
<<<<<<< HEAD
>>>>>>> 9fb20ad56c (GEOMESA-3212 Postgis - convert constant functions to literals for SQL translation (#2875))
<<<<<<< HEAD
>>>>>>> 56e5bdc2a5 (GEOMESA-3212 Postgis - convert constant functions to literals for SQL translation (#2875))
=======
=======
=======
=======
<<<<<<< HEAD
=======
=======
>>>>>>> ee1d5f207 (GEOMESA-3215 Postgis - support List-type attributes)
>>>>>>> 42af7673b (GEOMESA-3215 Postgis - support List-type attributes)

  override def registerClassToSqlMappings(mappings: java.util.Map[Class[_], Integer]): Unit = {
    super.registerClassToSqlMappings(mappings)
    mappings.put(classOf[java.util.List[_]], Types.ARRAY)
  }

  override def registerSqlTypeNameToClassMappings(mappings: java.util.Map[String, Class[_]]): Unit = {
    super.registerSqlTypeNameToClassMappings(mappings)
    mappings.put("array", classOf[java.util.List[_]])
  }

  override def registerSqlTypeToSqlTypeNameOverrides(overrides: java.util.Map[Integer, String]): Unit = {
    super.registerSqlTypeToSqlTypeNameOverrides(overrides)
    overrides.put(Types.ARRAY, "ARRAY")
  }

  override def encodePostColumnCreateTable(att: AttributeDescriptor, sql: StringBuffer): Unit = {
<<<<<<< HEAD
    att match {
      case gd: GeometryDescriptor =>
        val nullable = gd.getMinOccurs <= 0 || gd.isNillable
        val i = sql.lastIndexOf("geometry")
        // expect `geometry NOT NULL` or `geometry` depending on nullable flag
        if (i == -1 || (nullable && i != sql.length() - 8) || (!nullable && i != sql.length() - 17)) {
          logger.warn(s"Found geometry-type attribute but no geometry column binding: $sql")
        } else {
          val srid =
            Option(gd.getUserData.get(JDBCDataStore.JDBC_NATIVE_SRID).asInstanceOf[Integer])
                .orElse(Option(gd.getCoordinateReferenceSystem).flatMap(crs => Try(CRS.lookupEpsgCode(crs, true)).filter(_ != null).toOption))
                .map(_.intValue())
                .getOrElse(-1)
          val geomType = PartitionedPostgisDialect.GeometryMappings.getOrElse(gd.getType.getBinding, "GEOMETRY")
          val geomTypeWithDims =
            Option(gd.getUserData.get(Hints.COORDINATE_DIMENSION).asInstanceOf[Integer]).map(_.intValue) match {
              case None | Some(2) => geomType
              case Some(3) => s"${geomType}Z"
              case Some(4) => s"${geomType}ZM"
              case Some(d) =>
                throw new IllegalArgumentException(
                  s"PostGIS only supports geometries with 2, 3 and 4 dimensions, but found: $d")
            }
          sql.insert(i + 8, s" ($geomTypeWithDims, $srid)")
        }

      case _ if att.isJson() =>
        // replace 'VARCHAR' with jsonb
        val i = sql.lastIndexOf(" VARCHAR")
        if (i == sql.length() - 8) {
          sql.replace(i + 1, i + 8, "JSONB")
        } else {
          logger.warn(s"Found JSON-type attribute but no CHARACTER VARYING column binding: $sql")
        }

      case _ if att.isList =>
        // go back and encode the array type in the CQL create statement
        val i = sql.lastIndexOf(" ARRAY")
        if (i == sql.length() - 6) {
          sql.insert(i, " " + getListTypeMapping(att.getListType()))
        } else {
          logger.warn(s"Found list-type attribute but no ARRAY column binding: $sql")
        }

      case _ => // no-op
=======
    super.encodePostColumnCreateTable(att, sql)
    if (att.isJson()) {
      // replace 'VARCHAR' with jsonb
      val i = sql.lastIndexOf(" VARCHAR")
      if (i == sql.length() - 8) {
        sql.replace(i + 1, i + 8, "JSONB")
      } else {
        logger.warn(s"Found JSON-type attribute but no CHARACTER VARYING column binding: $sql")
      }
    } else if (att.isList) {
      // go back and encode the array type in the CQL create statement
      val i = sql.lastIndexOf(" ARRAY")
      if (i == sql.length() - 6) {
        sql.insert(i, " " + getListTypeMapping(att.getListType()))
      } else {
        logger.warn(s"Found list-type attribute but no ARRAY column binding: $sql")
      }
>>>>>>> ee1d5f207 (GEOMESA-3215 Postgis - support List-type attributes)
    }
  }

  override def getMapping(columnMetaData: ResultSet, cx: Connection): Class[_] = {
    val mapping = super.getMapping(columnMetaData, cx)
    if (mapping != null && mapping.isArray) {
      classOf[java.util.List[_]]
    } else {
      mapping
    }
  }

  /**
   * Gets the array type for a list/array column
   *
   * @param binding list-type binding
   * @return
   */
  private def getListTypeMapping(binding: Class[_]): String = {
    val mappings = new java.util.HashMap[String, Class[_]]()
    registerSqlTypeNameToClassMappings(mappings)
    var mapping: String = null
    var partial: String = null
    val iter = mappings.asScala.iterator
    while (iter.hasNext && mapping == null) {
      val (name, clas) = iter.next
      if (clas == binding) {
        mapping = name
      } else if (partial == null && clas.isAssignableFrom(binding)) {
        partial = name
      }
    }
    if (mapping != null) {
      mapping
    } else if (partial != null) {
      partial
    } else {
      logger.warn(s"Could not find list-type column for type ${binding.getName}")
      "text"
    }
  }
<<<<<<< HEAD
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
>>>>>>> dcd872c1a (GEOMESA-3212 Postgis - convert constant functions to literals for SQL translation (#2875))
>>>>>>> 5e000da48 (GEOMESA-3212 Postgis - convert constant functions to literals for SQL translation (#2875))
<<<<<<< HEAD
>>>>>>> e694961e05 (GEOMESA-3212 Postgis - convert constant functions to literals for SQL translation (#2875))
<<<<<<< HEAD
>>>>>>> d30ebb4092 (GEOMESA-3212 Postgis - convert constant functions to literals for SQL translation (#2875))
<<<<<<< HEAD
>>>>>>> 30ec49c9c0 (GEOMESA-3212 Postgis - convert constant functions to literals for SQL translation (#2875))
=======
=======
=======
=======
>>>>>>> ee1d5f207 (GEOMESA-3215 Postgis - support List-type attributes)
>>>>>>> cf1d94c7a (GEOMESA-3215 Postgis - support List-type attributes)
<<<<<<< HEAD
>>>>>>> 3a1e1d7213 (GEOMESA-3215 Postgis - support List-type attributes)
<<<<<<< HEAD
>>>>>>> 1913bc4c2c (GEOMESA-3215 Postgis - support List-type attributes)
<<<<<<< HEAD
>>>>>>> e7dfbc3fc1 (GEOMESA-3215 Postgis - support List-type attributes)
=======
=======
=======
=======
>>>>>>> d845d7c1b (GEOMESA-3254 Add Bloop build support)
<<<<<<< HEAD
>>>>>>> 09d87762c5 (GEOMESA-3254 Add Bloop build support)
<<<<<<< HEAD
>>>>>>> 63a045a753 (GEOMESA-3254 Add Bloop build support)
<<<<<<< HEAD
>>>>>>> b298e017f1 (GEOMESA-3254 Add Bloop build support)
=======
=======
=======
=======
=======
>>>>>>> dcd872c1a (GEOMESA-3212 Postgis - convert constant functions to literals for SQL translation (#2875))
>>>>>>> 713060f3a (GEOMESA-3212 Postgis - convert constant functions to literals for SQL translation (#2875))
<<<<<<< HEAD
>>>>>>> 50a84fd0eb (GEOMESA-3212 Postgis - convert constant functions to literals for SQL translation (#2875))
<<<<<<< HEAD
>>>>>>> ddf486214c (GEOMESA-3212 Postgis - convert constant functions to literals for SQL translation (#2875))
<<<<<<< HEAD
>>>>>>> e4a3f1a534 (GEOMESA-3212 Postgis - convert constant functions to literals for SQL translation (#2875))
=======
=======
=======
=======
<<<<<<< HEAD
=======
>>>>>>> dcd872c1a (GEOMESA-3212 Postgis - convert constant functions to literals for SQL translation (#2875))
=======
>>>>>>> ee1d5f207 (GEOMESA-3215 Postgis - support List-type attributes)
>>>>>>> 42af7673b (GEOMESA-3215 Postgis - support List-type attributes)
>>>>>>> 6d3c0ecb75 (GEOMESA-3215 Postgis - support List-type attributes)
>>>>>>> 75e1524a30 (GEOMESA-3215 Postgis - support List-type attributes)
>>>>>>> 6494375eef (GEOMESA-3215 Postgis - support List-type attributes)
=======
>>>>>>> 83c2c09260 (GEOMESA-3212 Postgis - convert constant functions to literals for SQL translation (#2875))
=======
>>>>>>> 6de7ca735b (GEOMESA-3215 Postgis - support List-type attributes)
=======
=======
=======
>>>>>>> f1532f2313 (GEOMESA-3254 Add Bloop build support)
=======
>>>>>>> 64b3066584 (GEOMESA-3212 Postgis - convert constant functions to literals for SQL translation (#2875))
=======
>>>>>>> 4b7c48b509 (GEOMESA-3215 Postgis - support List-type attributes)
=======
>>>>>>> ad8bba7bb7 (GEOMESA-3212 Postgis - convert constant functions to literals for SQL translation (#2875))
=======
>>>>>>> 9d3260f1dc (GEOMESA-3215 Postgis - support List-type attributes)
=======
>>>>>>> 5a4c24e020 (GEOMESA-3254 Add Bloop build support)
=======
>>>>>>> b8426b262b (GEOMESA-3212 Postgis - convert constant functions to literals for SQL translation (#2875))
=======
<<<<<<< HEAD
  override def splitFilter(filter: Filter, schema: SimpleFeatureType): Array[Filter] =
    super.splitFilter(LiteralFunctionVisitor(filter), schema)
<<<<<<< HEAD
>>>>>>> dcd872c1ac (GEOMESA-3212 Postgis - convert constant functions to literals for SQL translation (#2875))
<<<<<<< HEAD
>>>>>>> df43e72c50 (GEOMESA-3212 Postgis - convert constant functions to literals for SQL translation (#2875))
<<<<<<< HEAD
>>>>>>> 3ab56cb4cf (GEOMESA-3212 Postgis - convert constant functions to literals for SQL translation (#2875))
=======
=======
=======

  override def registerClassToSqlMappings(mappings: java.util.Map[Class[_], Integer]): Unit = {
    super.registerClassToSqlMappings(mappings)
    mappings.put(classOf[java.util.List[_]], Types.ARRAY)
  }

  override def registerSqlTypeNameToClassMappings(mappings: java.util.Map[String, Class[_]]): Unit = {
    super.registerSqlTypeNameToClassMappings(mappings)
    mappings.put("array", classOf[java.util.List[_]])
  }

  override def registerSqlTypeToSqlTypeNameOverrides(overrides: java.util.Map[Integer, String]): Unit = {
    super.registerSqlTypeToSqlTypeNameOverrides(overrides)
    overrides.put(Types.ARRAY, "ARRAY")
  }

  override def encodePostColumnCreateTable(att: AttributeDescriptor, sql: StringBuffer): Unit = {
    att match {
      case gd: GeometryDescriptor =>
        val nullable = gd.getMinOccurs <= 0 || gd.isNillable
        val i = sql.lastIndexOf("geometry")
        // expect `geometry NOT NULL` or `geometry` depending on nullable flag
        if (i == -1 || (nullable && i != sql.length() - 8) || (!nullable && i != sql.length() - 17)) {
          logger.warn(s"Found geometry-type attribute but no geometry column binding: $sql")
        } else {
          val srid =
            Option(gd.getUserData.get(JDBCDataStore.JDBC_NATIVE_SRID).asInstanceOf[Integer])
                .orElse(Option(gd.getCoordinateReferenceSystem).flatMap(crs => Try(CRS.lookupEpsgCode(crs, true)).filter(_ != null).toOption))
                .map(_.intValue())
                .getOrElse(-1)
          val geomType = PartitionedPostgisDialect.GeometryMappings.getOrElse(gd.getType.getBinding, "GEOMETRY")
          val geomTypeWithDims =
            Option(gd.getUserData.get(Hints.COORDINATE_DIMENSION).asInstanceOf[Integer]).map(_.intValue) match {
              case None | Some(2) => geomType
              case Some(3) => s"${geomType}Z"
              case Some(4) => s"${geomType}ZM"
              case Some(d) =>
                throw new IllegalArgumentException(
                  s"PostGIS only supports geometries with 2, 3 and 4 dimensions, but found: $d")
            }
          sql.insert(i + 8, s" ($geomTypeWithDims, $srid)")
        }

      case _ if att.isJson() =>
        // replace 'VARCHAR' with jsonb
        val i = sql.lastIndexOf(" VARCHAR")
        if (i == sql.length() - 8) {
          sql.replace(i + 1, i + 8, "JSONB")
        } else {
          logger.warn(s"Found JSON-type attribute but no CHARACTER VARYING column binding: $sql")
        }

      case _ if att.isList =>
        // go back and encode the array type in the CQL create statement
        val i = sql.lastIndexOf(" ARRAY")
        if (i == sql.length() - 6) {
          sql.insert(i, " " + getListTypeMapping(att.getListType()))
        } else {
          logger.warn(s"Found list-type attribute but no ARRAY column binding: $sql")
        }

      case _ => // no-op
    }
  }

  override def getMapping(columnMetaData: ResultSet, cx: Connection): Class[_] = {
    val mapping = super.getMapping(columnMetaData, cx)
    if (mapping != null && mapping.isArray) {
      classOf[java.util.List[_]]
    } else {
      mapping
    }
  }

  /**
   * Gets the array type for a list/array column
   *
   * @param binding list-type binding
   * @return
   */
  private def getListTypeMapping(binding: Class[_]): String = {
    val mappings = new java.util.HashMap[String, Class[_]]()
    registerSqlTypeNameToClassMappings(mappings)
    var mapping: String = null
    var partial: String = null
    val iter = mappings.asScala.iterator
    while (iter.hasNext && mapping == null) {
      val (name, clas) = iter.next
      if (clas == binding) {
        mapping = name
      } else if (partial == null && clas.isAssignableFrom(binding)) {
        partial = name
      }
    }
    if (mapping != null) {
      mapping
    } else if (partial != null) {
      partial
    } else {
      logger.warn(s"Could not find list-type column for type ${binding.getName}")
      "text"
    }
  }
>>>>>>> ee1d5f2071 (GEOMESA-3215 Postgis - support List-type attributes)
<<<<<<< HEAD
>>>>>>> 2912d58b06 (GEOMESA-3215 Postgis - support List-type attributes)
<<<<<<< HEAD
>>>>>>> ec585da266 (GEOMESA-3215 Postgis - support List-type attributes)
=======
=======
=======
>>>>>>> dcd872c1a (GEOMESA-3212 Postgis - convert constant functions to literals for SQL translation (#2875))
<<<<<<< HEAD
>>>>>>> 5e000da485 (GEOMESA-3212 Postgis - convert constant functions to literals for SQL translation (#2875))
<<<<<<< HEAD
>>>>>>> 406de071e1 (GEOMESA-3212 Postgis - convert constant functions to literals for SQL translation (#2875))
<<<<<<< HEAD
>>>>>>> edde3a188e (GEOMESA-3212 Postgis - convert constant functions to literals for SQL translation (#2875))
=======
=======
=======
=======
>>>>>>> ee1d5f207 (GEOMESA-3215 Postgis - support List-type attributes)
>>>>>>> cf1d94c7a8 (GEOMESA-3215 Postgis - support List-type attributes)
<<<<<<< HEAD
>>>>>>> bf9e5cdd91 (GEOMESA-3215 Postgis - support List-type attributes)
<<<<<<< HEAD
>>>>>>> 6768ebe0c2 (GEOMESA-3215 Postgis - support List-type attributes)
=======
=======
=======
>>>>>>> d845d7c1bd (GEOMESA-3254 Add Bloop build support)
<<<<<<< HEAD
>>>>>>> f1532f2313 (GEOMESA-3254 Add Bloop build support)
<<<<<<< HEAD
>>>>>>> c738f63bd9 (GEOMESA-3254 Add Bloop build support)
=======
=======
=======
=======
>>>>>>> dcd872c1a (GEOMESA-3212 Postgis - convert constant functions to literals for SQL translation (#2875))
>>>>>>> 713060f3a2 (GEOMESA-3212 Postgis - convert constant functions to literals for SQL translation (#2875))
<<<<<<< HEAD
>>>>>>> 64b3066584 (GEOMESA-3212 Postgis - convert constant functions to literals for SQL translation (#2875))
<<<<<<< HEAD
>>>>>>> eb0302a7c5 (GEOMESA-3212 Postgis - convert constant functions to literals for SQL translation (#2875))
=======
=======
=======
=======
>>>>>>> 9fb20ad56c (GEOMESA-3212 Postgis - convert constant functions to literals for SQL translation (#2875))
=======
>>>>>>> 1913bc4c2c (GEOMESA-3215 Postgis - support List-type attributes)
=======
>>>>>>> 63a045a753 (GEOMESA-3254 Add Bloop build support)
=======
>>>>>>> ddf486214c (GEOMESA-3212 Postgis - convert constant functions to literals for SQL translation (#2875))
=======
>>>>>>> dcd872c1a (GEOMESA-3212 Postgis - convert constant functions to literals for SQL translation (#2875))
=======
>>>>>>> ee1d5f207 (GEOMESA-3215 Postgis - support List-type attributes)
<<<<<<< HEAD
>>>>>>> 42af7673bd (GEOMESA-3215 Postgis - support List-type attributes)
<<<<<<< HEAD
>>>>>>> 4b7c48b509 (GEOMESA-3215 Postgis - support List-type attributes)
<<<<<<< HEAD
>>>>>>> 34836e5f4e (GEOMESA-3215 Postgis - support List-type attributes)
=======
=======
=======
=======
=======
>>>>>>> 3a1e1d7213 (GEOMESA-3215 Postgis - support List-type attributes)
=======
>>>>>>> 09d87762c5 (GEOMESA-3254 Add Bloop build support)
=======
>>>>>>> 50a84fd0eb (GEOMESA-3212 Postgis - convert constant functions to literals for SQL translation (#2875))
=======
<<<<<<< HEAD
  override def splitFilter(filter: Filter, schema: SimpleFeatureType): Array[Filter] =
    super.splitFilter(LiteralFunctionVisitor(filter), schema)
<<<<<<< HEAD
>>>>>>> dcd872c1a (GEOMESA-3212 Postgis - convert constant functions to literals for SQL translation (#2875))
<<<<<<< HEAD
>>>>>>> 91b820951 (GEOMESA-3212 Postgis - convert constant functions to literals for SQL translation (#2875))
<<<<<<< HEAD
>>>>>>> 9fb20ad56c (GEOMESA-3212 Postgis - convert constant functions to literals for SQL translation (#2875))
<<<<<<< HEAD
>>>>>>> ad8bba7bb7 (GEOMESA-3212 Postgis - convert constant functions to literals for SQL translation (#2875))
<<<<<<< HEAD
>>>>>>> 8ed0ae6564 (GEOMESA-3212 Postgis - convert constant functions to literals for SQL translation (#2875))
=======
=======
=======
=======
=======
<<<<<<< HEAD
=======
=======
>>>>>>> ee1d5f207 (GEOMESA-3215 Postgis - support List-type attributes)
>>>>>>> 42af7673b (GEOMESA-3215 Postgis - support List-type attributes)

  override def registerClassToSqlMappings(mappings: java.util.Map[Class[_], Integer]): Unit = {
    super.registerClassToSqlMappings(mappings)
    mappings.put(classOf[java.util.List[_]], Types.ARRAY)
  }

  override def registerSqlTypeNameToClassMappings(mappings: java.util.Map[String, Class[_]]): Unit = {
    super.registerSqlTypeNameToClassMappings(mappings)
    mappings.put("array", classOf[java.util.List[_]])
  }

  override def registerSqlTypeToSqlTypeNameOverrides(overrides: java.util.Map[Integer, String]): Unit = {
    super.registerSqlTypeToSqlTypeNameOverrides(overrides)
    overrides.put(Types.ARRAY, "ARRAY")
  }

  override def encodePostColumnCreateTable(att: AttributeDescriptor, sql: StringBuffer): Unit = {
<<<<<<< HEAD
    att match {
      case gd: GeometryDescriptor =>
        val nullable = gd.getMinOccurs <= 0 || gd.isNillable
        val i = sql.lastIndexOf("geometry")
        // expect `geometry NOT NULL` or `geometry` depending on nullable flag
        if (i == -1 || (nullable && i != sql.length() - 8) || (!nullable && i != sql.length() - 17)) {
          logger.warn(s"Found geometry-type attribute but no geometry column binding: $sql")
        } else {
          val srid =
            Option(gd.getUserData.get(JDBCDataStore.JDBC_NATIVE_SRID).asInstanceOf[Integer])
                .orElse(Option(gd.getCoordinateReferenceSystem).flatMap(crs => Try(CRS.lookupEpsgCode(crs, true)).filter(_ != null).toOption))
                .map(_.intValue())
                .getOrElse(-1)
          val geomType = PartitionedPostgisDialect.GeometryMappings.getOrElse(gd.getType.getBinding, "GEOMETRY")
          val geomTypeWithDims =
            Option(gd.getUserData.get(Hints.COORDINATE_DIMENSION).asInstanceOf[Integer]).map(_.intValue) match {
              case None | Some(2) => geomType
              case Some(3) => s"${geomType}Z"
              case Some(4) => s"${geomType}ZM"
              case Some(d) =>
                throw new IllegalArgumentException(
                  s"PostGIS only supports geometries with 2, 3 and 4 dimensions, but found: $d")
            }
          sql.insert(i + 8, s" ($geomTypeWithDims, $srid)")
        }

      case _ if att.isJson() =>
        // replace 'VARCHAR' with jsonb
        val i = sql.lastIndexOf(" VARCHAR")
        if (i == sql.length() - 8) {
          sql.replace(i + 1, i + 8, "JSONB")
        } else {
          logger.warn(s"Found JSON-type attribute but no CHARACTER VARYING column binding: $sql")
        }

      case _ if att.isList =>
        // go back and encode the array type in the CQL create statement
        val i = sql.lastIndexOf(" ARRAY")
        if (i == sql.length() - 6) {
          sql.insert(i, " " + getListTypeMapping(att.getListType()))
        } else {
          logger.warn(s"Found list-type attribute but no ARRAY column binding: $sql")
        }

      case _ => // no-op
=======
    super.encodePostColumnCreateTable(att, sql)
    if (att.isJson()) {
      // replace 'VARCHAR' with jsonb
      val i = sql.lastIndexOf(" VARCHAR")
      if (i == sql.length() - 8) {
        sql.replace(i + 1, i + 8, "JSONB")
      } else {
        logger.warn(s"Found JSON-type attribute but no CHARACTER VARYING column binding: $sql")
      }
    } else if (att.isList) {
      // go back and encode the array type in the CQL create statement
      val i = sql.lastIndexOf(" ARRAY")
      if (i == sql.length() - 6) {
        sql.insert(i, " " + getListTypeMapping(att.getListType()))
      } else {
        logger.warn(s"Found list-type attribute but no ARRAY column binding: $sql")
      }
>>>>>>> ee1d5f207 (GEOMESA-3215 Postgis - support List-type attributes)
    }
  }

  override def getMapping(columnMetaData: ResultSet, cx: Connection): Class[_] = {
    val mapping = super.getMapping(columnMetaData, cx)
    if (mapping != null && mapping.isArray) {
      classOf[java.util.List[_]]
    } else {
      mapping
    }
  }

  /**
   * Gets the array type for a list/array column
   *
   * @param binding list-type binding
   * @return
   */
  private def getListTypeMapping(binding: Class[_]): String = {
    val mappings = new java.util.HashMap[String, Class[_]]()
    registerSqlTypeNameToClassMappings(mappings)
    var mapping: String = null
    var partial: String = null
    val iter = mappings.asScala.iterator
    while (iter.hasNext && mapping == null) {
      val (name, clas) = iter.next
      if (clas == binding) {
        mapping = name
      } else if (partial == null && clas.isAssignableFrom(binding)) {
        partial = name
      }
    }
    if (mapping != null) {
      mapping
    } else if (partial != null) {
      partial
    } else {
      logger.warn(s"Could not find list-type column for type ${binding.getName}")
      "text"
    }
  }
<<<<<<< HEAD
>>>>>>> ee1d5f207 (GEOMESA-3215 Postgis - support List-type attributes)
<<<<<<< HEAD
>>>>>>> 47f8de1bb (GEOMESA-3215 Postgis - support List-type attributes)
<<<<<<< HEAD
>>>>>>> afb207dc68 (GEOMESA-3215 Postgis - support List-type attributes)
<<<<<<< HEAD
>>>>>>> 69a6e5986e (GEOMESA-3215 Postgis - support List-type attributes)
<<<<<<< HEAD
>>>>>>> 38e39baec8 (GEOMESA-3215 Postgis - support List-type attributes)
=======
=======
=======
=======
=======
>>>>>>> dcd872c1a (GEOMESA-3212 Postgis - convert constant functions to literals for SQL translation (#2875))
>>>>>>> 5e000da48 (GEOMESA-3212 Postgis - convert constant functions to literals for SQL translation (#2875))
<<<<<<< HEAD
>>>>>>> e694961e05 (GEOMESA-3212 Postgis - convert constant functions to literals for SQL translation (#2875))
<<<<<<< HEAD
>>>>>>> d30ebb4092 (GEOMESA-3212 Postgis - convert constant functions to literals for SQL translation (#2875))
<<<<<<< HEAD
>>>>>>> 4983e191e6 (GEOMESA-3212 Postgis - convert constant functions to literals for SQL translation (#2875))
<<<<<<< HEAD
>>>>>>> 01c8505b38 (GEOMESA-3212 Postgis - convert constant functions to literals for SQL translation (#2875))
=======
=======
=======
=======
=======
>>>>>>> ee1d5f207 (GEOMESA-3215 Postgis - support List-type attributes)
>>>>>>> cf1d94c7a (GEOMESA-3215 Postgis - support List-type attributes)
<<<<<<< HEAD
>>>>>>> 3a1e1d7213 (GEOMESA-3215 Postgis - support List-type attributes)
<<<<<<< HEAD
>>>>>>> 1913bc4c2c (GEOMESA-3215 Postgis - support List-type attributes)
<<<<<<< HEAD
>>>>>>> 9d3260f1dc (GEOMESA-3215 Postgis - support List-type attributes)
<<<<<<< HEAD
>>>>>>> 3ce7fe64a3 (GEOMESA-3215 Postgis - support List-type attributes)
=======
=======
=======
=======
=======
>>>>>>> d845d7c1b (GEOMESA-3254 Add Bloop build support)
<<<<<<< HEAD
>>>>>>> 09d87762c5 (GEOMESA-3254 Add Bloop build support)
<<<<<<< HEAD
>>>>>>> 63a045a753 (GEOMESA-3254 Add Bloop build support)
<<<<<<< HEAD
>>>>>>> 5a4c24e020 (GEOMESA-3254 Add Bloop build support)
<<<<<<< HEAD
>>>>>>> 13656f5052 (GEOMESA-3254 Add Bloop build support)
=======
=======
=======
=======
=======
=======
>>>>>>> dcd872c1a (GEOMESA-3212 Postgis - convert constant functions to literals for SQL translation (#2875))
>>>>>>> 713060f3a (GEOMESA-3212 Postgis - convert constant functions to literals for SQL translation (#2875))
<<<<<<< HEAD
>>>>>>> 50a84fd0eb (GEOMESA-3212 Postgis - convert constant functions to literals for SQL translation (#2875))
<<<<<<< HEAD
>>>>>>> ddf486214c (GEOMESA-3212 Postgis - convert constant functions to literals for SQL translation (#2875))
<<<<<<< HEAD
>>>>>>> b8426b262b (GEOMESA-3212 Postgis - convert constant functions to literals for SQL translation (#2875))
<<<<<<< HEAD
>>>>>>> d391bc18f0 (GEOMESA-3212 Postgis - convert constant functions to literals for SQL translation (#2875))
=======
=======
=======
=======
=======
<<<<<<< HEAD
=======
>>>>>>> dcd872c1a (GEOMESA-3212 Postgis - convert constant functions to literals for SQL translation (#2875))
=======
>>>>>>> ee1d5f207 (GEOMESA-3215 Postgis - support List-type attributes)
>>>>>>> 42af7673b (GEOMESA-3215 Postgis - support List-type attributes)
>>>>>>> 6d3c0ecb75 (GEOMESA-3215 Postgis - support List-type attributes)
>>>>>>> 75e1524a30 (GEOMESA-3215 Postgis - support List-type attributes)
>>>>>>> 6edc66c3cb (GEOMESA-3215 Postgis - support List-type attributes)
>>>>>>> 67ba50b23a (GEOMESA-3215 Postgis - support List-type attributes)
=======
>>>>>>> a26c0acbb7 (GEOMESA-3212 Postgis - convert constant functions to literals for SQL translation (#2875))
>>>>>>> 30a68d04cb (GEOMESA-3212 Postgis - convert constant functions to literals for SQL translation (#2875))
=======
>>>>>>> 7e990c0c62 (GEOMESA-3215 Postgis - support List-type attributes)
<<<<<<< HEAD
>>>>>>> cdf5a8b797 (GEOMESA-3215 Postgis - support List-type attributes)
=======
>>>>>>> locationtech-main
=======
=======
>>>>>>> dcd872c1a (GEOMESA-3212 Postgis - convert constant functions to literals for SQL translation (#2875))
>>>>>>> d7efff9563 (GEOMESA-3212 Postgis - convert constant functions to literals for SQL translation (#2875))
<<<<<<< HEAD
>>>>>>> 48fcd67085 (GEOMESA-3212 Postgis - convert constant functions to literals for SQL translation (#2875))
=======
=======
=======
>>>>>>> dcd872c1a (GEOMESA-3212 Postgis - convert constant functions to literals for SQL translation (#2875))
=======
>>>>>>> ee1d5f207 (GEOMESA-3215 Postgis - support List-type attributes)
>>>>>>> a980818468 (GEOMESA-3215 Postgis - support List-type attributes)
>>>>>>> 29836dbeb7 (GEOMESA-3215 Postgis - support List-type attributes)
=======
=======
>>>>>>> dcd872c1a (GEOMESA-3212 Postgis - convert constant functions to literals for SQL translation (#2875))
>>>>>>> d7efff9563 (GEOMESA-3212 Postgis - convert constant functions to literals for SQL translation (#2875))
=======
=======
>>>>>>> dcd872c1a (GEOMESA-3212 Postgis - convert constant functions to literals for SQL translation (#2875))
=======
>>>>>>> ee1d5f207 (GEOMESA-3215 Postgis - support List-type attributes)
>>>>>>> a980818468 (GEOMESA-3215 Postgis - support List-type attributes)
}

object PartitionedPostgisDialect {

  private val GeometryMappings = Map[Class[_], String](
    classOf[Geometry]           -> "GEOMETRY",
    classOf[Point]              -> "POINT",
    classOf[LineString]         -> "LINESTRING",
    classOf[Polygon]            -> "POLYGON",
    classOf[MultiPoint]         -> "MULTIPOINT",
    classOf[MultiLineString]    -> "MULTILINESTRING",
    classOf[MultiPolygon]       -> "MULTIPOLYGON",
    classOf[GeometryCollection] -> "GEOMETRYCOLLECTION",
    classOf[CircularString]     -> "CIRCULARSTRING",
    classOf[CircularRing]       -> "CIRCULARSTRING",
    classOf[MultiCurve]         -> "MULTICURVE",
    classOf[CompoundCurve]      -> "COMPOUNDCURVE",
    classOf[CompoundRing]       -> "COMPOUNDCURVE"
  )

  private val Commands: Seq[Sql] = Seq(
    SequenceTable,
    WriteAheadTable,
    WriteAheadTrigger,
    PartitionTables,
    MainView,
    InsertTrigger,
    UpdateTrigger,
    DeleteTrigger,
    PrimaryKeyTable,
    PartitionTablespacesTable,
    AnalyzeQueueTable,
    SortQueueTable,
    UserDataTable,
    TruncateToTenMinutes,
    TruncateToPartition,
    RollWriteAheadLog,
    PartitionWriteAheadLog,
    MergeWriteAheadPartitions,
    DropAgedOffPartitions,
    PartitionMaintenance,
    AnalyzePartitions,
    CompactPartitions,
    LogCleaner
  )

  object Config extends Conversions {

    // size of each partition - can be updated after schema is created, but requires
    // running PartitionedPostgisDialect.upgrade in order to be applied
    val IntervalHours = "pg.partitions.interval.hours"
    // pages_per_range on the BRIN index - can't be updated after schema is created
    val PagesPerRange = "pg.partitions.pages-per-range"
    // max partitions to keep, i.e. age-off - can be updated freely after schema is created
    val MaxPartitions = "pg.partitions.max"
    // minute of each 10 minute block to execute the partition jobs - can be updated after schema is created,
    // but requires running PartitionedPostgisDialect.upgrade in order to be applied
    val CronMinute = "pg.partitions.cron.minute"
    // remove 'whole world' filters - can be updated freely after schema is created
    val FilterWholeWorld = "pg.partitions.filter.world"

    // tablespace configurations - can be updated freely after the schema is created
    val WriteAheadTableSpace = "pg.partitions.tablespace.wa"
    val WriteAheadPartitionsTableSpace = "pg.partitions.tablespace.wa-partitions"
    val MainTableSpace = "pg.partitions.tablespace.main"

    // set postgres table wal logging
    val WalLogEnabled = "pg.wal.enabled"

    implicit class ConfigConversions(val sft: SimpleFeatureType) extends AnyVal {
      def getIntervalHours: Int = Option(sft.getUserData.get(IntervalHours)).map(int).getOrElse(6)
      def getMaxPartitions: Option[Int] = Option(sft.getUserData.get(MaxPartitions)).map(int)
      def getWriteAheadTableSpace: Option[String] = Option(sft.getUserData.get(WriteAheadTableSpace).asInstanceOf[String])
      def getWriteAheadPartitionsTableSpace: Option[String] = Option(sft.getUserData.get(WriteAheadPartitionsTableSpace).asInstanceOf[String])
      def getMainTableSpace: Option[String] = Option(sft.getUserData.get(MainTableSpace).asInstanceOf[String])
      def getCronMinute: Option[Int] = Option(sft.getUserData.get(CronMinute).asInstanceOf[String]).map(int)
      def getPagesPerRange: Int = Option(sft.getUserData.get(PagesPerRange).asInstanceOf[String]).map(int).getOrElse(128)
<<<<<<< HEAD
<<<<<<< HEAD
<<<<<<< HEAD
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
>>>>>>> fa60953a42 (GEOMESA-3254 Add Bloop build support)
=======
>>>>>>> f586fec5a3 (GEOMESA-3254 Add Bloop build support)
=======
=======
>>>>>>> 75d5a347f8 (GEOMESA-3262 Postgis - add config to skip whole world filters)
>>>>>>> c0571b43e1 (GEOMESA-3262 Postgis - add config to skip whole world filters)
=======
=======
>>>>>>> 75d5a347f8 (GEOMESA-3262 Postgis - add config to skip whole world filters)
=======
>>>>>>> e74fa3f690 (GEOMESA-3254 Add Bloop build support)
>>>>>>> b39bd292d4 (GEOMESA-3254 Add Bloop build support)
      def isFilterWholeWorld: Boolean = Option(sft.getUserData.get(FilterWholeWorld).asInstanceOf[String]).forall(_.toBoolean)
=======
>>>>>>> 58d14a257 (GEOMESA-3254 Add Bloop build support)
    }

    implicit class GeometryAttributeConversions(val d: GeometryDescriptor) extends AnyVal {
      def getSrid: Option[Int] =
        Option(d.getUserData.get(JDBCDataStore.JDBC_NATIVE_SRID)).map(int)
            .orElse(
              Option(d.getCoordinateReferenceSystem)
                  .flatMap(crs => Try(CRS.lookupEpsgCode(crs, true)).filter(_ != null).toOption.map(_.intValue())))
      def getCoordinateDimensions: Option[Int] =
        Option(d.getUserData.get(Hints.COORDINATE_DIMENSION)).map(int)
=======
>>>>>>> 58d14a257e (GEOMESA-3254 Add Bloop build support)
=======
      def isFilterWholeWorld: Boolean = Option(sft.getUserData.get(FilterWholeWorld).asInstanceOf[String]).forall(_.toBoolean)
>>>>>>> 7d4ed7605c (GEOMESA-3262 Postgis - add config to skip whole world filters)
<<<<<<< HEAD
<<<<<<< HEAD
=======
>>>>>>> e74fa3f690 (GEOMESA-3254 Add Bloop build support)
=======
      def isFilterWholeWorld: Boolean = Option(sft.getUserData.get(FilterWholeWorld).asInstanceOf[String]).forall(_.toBoolean)
=======
>>>>>>> 58d14a257e (GEOMESA-3254 Add Bloop build support)
>>>>>>> 7564665969 (GEOMESA-3254 Add Bloop build support)
=======
=======
>>>>>>> e74fa3f690 (GEOMESA-3254 Add Bloop build support)
=======
>>>>>>> 3e610250ce (GEOMESA-3254 Add Bloop build support)
      def isFilterWholeWorld: Boolean = Option(sft.getUserData.get(FilterWholeWorld).asInstanceOf[String]).forall(_.toBoolean)
=======
>>>>>>> 58d14a257e (GEOMESA-3254 Add Bloop build support)
=======
      def isFilterWholeWorld: Boolean = Option(sft.getUserData.get(FilterWholeWorld).asInstanceOf[String]).forall(_.toBoolean)
>>>>>>> 7d4ed7605c (GEOMESA-3262 Postgis - add config to skip whole world filters)
<<<<<<< HEAD
<<<<<<< HEAD
>>>>>>> 75d5a347f8 (GEOMESA-3262 Postgis - add config to skip whole world filters)
=======
=======
>>>>>>> 3e610250ce (GEOMESA-3254 Add Bloop build support)
=======
      def isFilterWholeWorld: Boolean = Option(sft.getUserData.get(FilterWholeWorld).asInstanceOf[String]).forall(_.toBoolean)
=======
>>>>>>> 58d14a257 (GEOMESA-3254 Add Bloop build support)
>>>>>>> fa60953a42 (GEOMESA-3254 Add Bloop build support)
<<<<<<< HEAD
<<<<<<< HEAD
<<<<<<< HEAD
>>>>>>> e74fa3f690 (GEOMESA-3254 Add Bloop build support)
=======
>>>>>>> f586fec5a3 (GEOMESA-3254 Add Bloop build support)
=======
>>>>>>> b39bd292d4 (GEOMESA-3254 Add Bloop build support)
=======
      def isFilterWholeWorld: Boolean = Option(sft.getUserData.get(FilterWholeWorld).asInstanceOf[String]).forall(_.toBoolean)
=======
>>>>>>> 58d14a257e (GEOMESA-3254 Add Bloop build support)
<<<<<<< HEAD
>>>>>>> 9e49c1aac7 (GEOMESA-3254 Add Bloop build support)
=======
      def isFilterWholeWorld: Boolean = Option(sft.getUserData.get(FilterWholeWorld).asInstanceOf[String]).forall(_.toBoolean)
=======
>>>>>>> 58d14a257e (GEOMESA-3254 Add Bloop build support)
=======
      def isFilterWholeWorld: Boolean = Option(sft.getUserData.get(FilterWholeWorld).asInstanceOf[String]).forall(_.toBoolean)
>>>>>>> 7d4ed7605c (GEOMESA-3262 Postgis - add config to skip whole world filters)
>>>>>>> b5c0452b13 (GEOMESA-3262 Postgis - add config to skip whole world filters)
=======
>>>>>>> 3e610250ce (GEOMESA-3254 Add Bloop build support)
=======
>>>>>>> 7564665969 (GEOMESA-3254 Add Bloop build support)
<<<<<<< HEAD
>>>>>>> f586fec5a3 (GEOMESA-3254 Add Bloop build support)
=======
=======
>>>>>>> 75d5a347f8 (GEOMESA-3262 Postgis - add config to skip whole world filters)
<<<<<<< HEAD
>>>>>>> c0571b43e1 (GEOMESA-3262 Postgis - add config to skip whole world filters)
=======
=======
>>>>>>> e74fa3f690 (GEOMESA-3254 Add Bloop build support)
>>>>>>> b39bd292d4 (GEOMESA-3254 Add Bloop build support)
    }

    implicit class GeometryAttributeConversions(val d: GeometryDescriptor) extends AnyVal {
      def getSrid: Option[Int] =
        Option(d.getUserData.get(JDBCDataStore.JDBC_NATIVE_SRID)).map(int)
            .orElse(
              Option(d.getCoordinateReferenceSystem)
                  .flatMap(crs => Try(CRS.lookupEpsgCode(crs, true)).filter(_ != null).toOption.map(_.intValue())))
      def getCoordinateDimensions: Option[Int] =
        Option(d.getUserData.get(Hints.COORDINATE_DIMENSION)).map(int)
    }
  }
}
