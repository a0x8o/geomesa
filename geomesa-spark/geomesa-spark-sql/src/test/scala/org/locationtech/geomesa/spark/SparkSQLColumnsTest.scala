/***********************************************************************
 * Copyright (c) 2013-2024 Commonwealth Computer Research, Inc.
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Apache License, Version 2.0
 * which accompanies this distribution and is available at
 * http://www.opensource.org/licenses/apache2.0.php.
 ***********************************************************************/

package org.locationtech.geomesa.spark

import com.typesafe.scalalogging.LazyLogging
import org.apache.spark.sql.jts.JTSTypes
import org.apache.spark.sql.types.{ArrayType, DataTypes, MapType}
<<<<<<< HEAD
import org.apache.spark.sql.{SQLContext, SparkSession}
<<<<<<< HEAD
<<<<<<< HEAD
<<<<<<< HEAD
<<<<<<< HEAD
<<<<<<< HEAD
<<<<<<< HEAD
<<<<<<< HEAD
<<<<<<< HEAD
<<<<<<< HEAD
<<<<<<< HEAD
<<<<<<< HEAD
<<<<<<< HEAD
<<<<<<< HEAD
<<<<<<< HEAD
<<<<<<< HEAD
<<<<<<< HEAD
<<<<<<< HEAD
<<<<<<< HEAD
<<<<<<< HEAD
<<<<<<< HEAD
<<<<<<< HEAD
<<<<<<< HEAD
<<<<<<< HEAD
<<<<<<< HEAD
<<<<<<< HEAD
<<<<<<< HEAD
<<<<<<< HEAD
<<<<<<< HEAD
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
import org.apache.spark.sql.{SQLContext, SQLTypes, SparkSession}
>>>>>>> 544d6f235 (GEOMESA-3078 Support Bytes, List and Map attribute types in GeoMesa Spark SQL)
=======
=======
=======
>>>>>>> locatelli-main
<<<<<<< HEAD
<<<<<<< HEAD
<<<<<<< HEAD
<<<<<<< HEAD
<<<<<<< HEAD
<<<<<<< HEAD
=======
>>>>>>> locatelli-main
=======
>>>>>>> locatelli-main
<<<<<<< HEAD
<<<<<<< HEAD
<<<<<<< HEAD
<<<<<<< HEAD
<<<<<<< HEAD
<<<<<<< HEAD
<<<<<<< HEAD
=======
>>>>>>> locatelli-main
=======
>>>>>>> locatelli-main
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
>>>>>>> locatelli-main
=======
>>>>>>> locatelli-main
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
=======
<<<<<<< HEAD
<<<<<<< HEAD
<<<<<<< HEAD
=======
>>>>>>> locatelli-main
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
<<<<<<< HEAD
<<<<<<< HEAD
<<<<<<< HEAD
<<<<<<< HEAD
<<<<<<< HEAD
<<<<<<< HEAD
<<<<<<< HEAD
>>>>>>> locatelli-main
<<<<<<< HEAD
=======
>>>>>>> locatelli-main
<<<<<<< HEAD
<<<<<<< HEAD
=======
>>>>>>> locatelli-main
<<<<<<< HEAD
<<<<<<< HEAD
<<<<<<< HEAD
<<<<<<< HEAD
=======
>>>>>>> locatelli-main
=======
>>>>>>> locatelli-main
=======
>>>>>>> f586fec5a3 (GEOMESA-3254 Add Bloop build support)
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
>>>>>>> locatelli-main
import org.geotools.api.data.{DataStore, DataStoreFinder, Transaction}
=======
=======
>>>>>>> 0884e75348d (GEOMESA-3254 Add Bloop build support)
=======
>>>>>>> 4a4bbd8ec03 (GEOMESA-3254 Add Bloop build support)
=======
>>>>>>> 6404cee6de6 (GEOMESA-3078 Support Bytes, List and Map attribute types in GeoMesa Spark SQL)
=======
>>>>>>> 15b6bf02d15 (GEOMESA-3254 Add Bloop build support)
=======
>>>>>>> 8f07793609b (GEOMESA-3078 Support Bytes, List and Map attribute types in GeoMesa Spark SQL)
=======
>>>>>>> 5d800401cf6 (GEOMESA-3078 Support Bytes, List and Map attribute types in GeoMesa Spark SQL)
=======
>>>>>>> 3ac6332d32f (GEOMESA-3078 Support Bytes, List and Map attribute types in GeoMesa Spark SQL)
=======
=======
>>>>>>> 04ca02e264f (GEOMESA-3254 Add Bloop build support)
=======
>>>>>>> 271f65bfeb3 (GEOMESA-3078 Support Bytes, List and Map attribute types in GeoMesa Spark SQL)
=======
>>>>>>> a104e87b93f (GEOMESA-3254 Add Bloop build support)
=======
>>>>>>> 80abe4e87eb (GEOMESA-3078 Support Bytes, List and Map attribute types in GeoMesa Spark SQL)
=======
>>>>>>> 736d4aaa3d3 (GEOMESA-3078 Support Bytes, List and Map attribute types in GeoMesa Spark SQL)
=======
>>>>>>> a77b1143fe9 (GEOMESA-3078 Support Bytes, List and Map attribute types in GeoMesa Spark SQL)
=======
>>>>>>> 75ae649304a (GEOMESA-3254 Add Bloop build support)
=======
>>>>>>> e54506ef011 (GEOMESA-3254 Add Bloop build support)
=======
>>>>>>> 529f1b209b9 (GEOMESA-3078 Support Bytes, List and Map attribute types in GeoMesa Spark SQL)
=======
>>>>>>> 9f1e983c633 (GEOMESA-3254 Add Bloop build support)
=======
>>>>>>> b41eeb536da (GEOMESA-3078 Support Bytes, List and Map attribute types in GeoMesa Spark SQL)
=======
>>>>>>> 2dd50567ea7 (GEOMESA-3078 Support Bytes, List and Map attribute types in GeoMesa Spark SQL)
=======
>>>>>>> 0e02583336f (GEOMESA-3078 Support Bytes, List and Map attribute types in GeoMesa Spark SQL)
=======
>>>>>>> 37636fb3b99 (GEOMESA-3254 Add Bloop build support)
=======
=======
>>>>>>> d3ea2bf1e59 (GEOMESA-3078 Support Bytes, List and Map attribute types in GeoMesa Spark SQL)
=======
>>>>>>> 8f244c4b80a (GEOMESA-3254 Add Bloop build support)
=======
>>>>>>> d34b30a2453 (GEOMESA-3078 Support Bytes, List and Map attribute types in GeoMesa Spark SQL)
=======
>>>>>>> 7ea869a79f7 (GEOMESA-3078 Support Bytes, List and Map attribute types in GeoMesa Spark SQL)
=======
>>>>>>> 9cecede2ff0 (GEOMESA-3078 Support Bytes, List and Map attribute types in GeoMesa Spark SQL)
=======
>>>>>>> fb5732bd615 (GEOMESA-3078 Support Bytes, List and Map attribute types in GeoMesa Spark SQL)
=======
>>>>>>> f586fec5a3 (GEOMESA-3254 Add Bloop build support)
>>>>>>> 4a6d96f2b4e (GEOMESA-3254 Add Bloop build support)
<<<<<<< HEAD
<<<<<<< HEAD
<<<<<<< HEAD
<<<<<<< HEAD
<<<<<<< HEAD
<<<<<<< HEAD
<<<<<<< HEAD
<<<<<<< HEAD
<<<<<<< HEAD
<<<<<<< HEAD
<<<<<<< HEAD
<<<<<<< HEAD
<<<<<<< HEAD
<<<<<<< HEAD
<<<<<<< HEAD
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
>>>>>>> locatelli-main
=======
>>>>>>> locatelli-main
=======
>>>>>>> locatelli-main
=======
>>>>>>> locatelli-main
=======
>>>>>>> locatelli-main
=======
>>>>>>> locatelli-main
=======
>>>>>>> locatelli-main
=======
>>>>>>> locatelli-main
=======
>>>>>>> locatelli-main
=======
>>>>>>> locatelli-main
=======
>>>>>>> locatelli-main
=======
>>>>>>> locatelli-main
=======
>>>>>>> 29fba6fef4 (GEOMESA-3078 Support Bytes, List and Map attribute types in GeoMesa Spark SQL)
=======
>>>>>>> c94b71d579 (GEOMESA-3078 Support Bytes, List and Map attribute types in GeoMesa Spark SQL)
=======
>>>>>>> 13656f5052 (GEOMESA-3254 Add Bloop build support)
=======
>>>>>>> afdad4a952 (GEOMESA-3078 Support Bytes, List and Map attribute types in GeoMesa Spark SQL)
=======
>>>>>>> 96b3033c39 (GEOMESA-3078 Support Bytes, List and Map attribute types in GeoMesa Spark SQL)
<<<<<<< HEAD
<<<<<<< HEAD
<<<<<<< HEAD
<<<<<<< HEAD
<<<<<<< HEAD
<<<<<<< HEAD
<<<<<<< HEAD
<<<<<<< HEAD
<<<<<<< HEAD
<<<<<<< HEAD
<<<<<<< HEAD
<<<<<<< HEAD
<<<<<<< HEAD
<<<<<<< HEAD
<<<<<<< HEAD
<<<<<<< HEAD
<<<<<<< HEAD
<<<<<<< HEAD
<<<<<<< HEAD
<<<<<<< HEAD
<<<<<<< HEAD
<<<<<<< HEAD
<<<<<<< HEAD
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
>>>>>>> f1532f2313 (GEOMESA-3254 Add Bloop build support)
=======
=======
>>>>>>> f1532f2313 (GEOMESA-3254 Add Bloop build support)
>>>>>>> 7c6dac7c346 (GEOMESA-3254 Add Bloop build support)
>>>>>>> locatelli-main
=======
=======
>>>>>>> f1532f2313 (GEOMESA-3254 Add Bloop build support)
>>>>>>> 7c6dac7c346 (GEOMESA-3254 Add Bloop build support)
>>>>>>> locatelli-main
=======
=======
>>>>>>> f1532f2313 (GEOMESA-3254 Add Bloop build support)
>>>>>>> 7c6dac7c346 (GEOMESA-3254 Add Bloop build support)
>>>>>>> locatelli-main
=======
=======
>>>>>>> f1532f2313 (GEOMESA-3254 Add Bloop build support)
>>>>>>> 7c6dac7c346 (GEOMESA-3254 Add Bloop build support)
>>>>>>> locatelli-main
=======
=======
>>>>>>> f1532f2313 (GEOMESA-3254 Add Bloop build support)
>>>>>>> 7c6dac7c346 (GEOMESA-3254 Add Bloop build support)
>>>>>>> locatelli-main
=======
=======
>>>>>>> f1532f2313 (GEOMESA-3254 Add Bloop build support)
>>>>>>> 7c6dac7c346 (GEOMESA-3254 Add Bloop build support)
>>>>>>> locatelli-main
=======
=======
>>>>>>> f1532f2313 (GEOMESA-3254 Add Bloop build support)
>>>>>>> 7c6dac7c346 (GEOMESA-3254 Add Bloop build support)
>>>>>>> locatelli-main
=======
=======
>>>>>>> f1532f2313 (GEOMESA-3254 Add Bloop build support)
>>>>>>> 7c6dac7c346 (GEOMESA-3254 Add Bloop build support)
>>>>>>> locatelli-main
=======
=======
>>>>>>> f1532f2313 (GEOMESA-3254 Add Bloop build support)
>>>>>>> 7c6dac7c346 (GEOMESA-3254 Add Bloop build support)
>>>>>>> locatelli-main
=======
=======
>>>>>>> f1532f2313 (GEOMESA-3254 Add Bloop build support)
>>>>>>> 7c6dac7c346 (GEOMESA-3254 Add Bloop build support)
>>>>>>> locatelli-main
=======
=======
>>>>>>> f1532f2313 (GEOMESA-3254 Add Bloop build support)
>>>>>>> 7c6dac7c346 (GEOMESA-3254 Add Bloop build support)
>>>>>>> locatelli-main
=======
=======
>>>>>>> f1532f2313 (GEOMESA-3254 Add Bloop build support)
>>>>>>> 7c6dac7c346 (GEOMESA-3254 Add Bloop build support)
>>>>>>> locatelli-main
=======
=======
>>>>>>> f1532f2313 (GEOMESA-3254 Add Bloop build support)
>>>>>>> 7c6dac7c346 (GEOMESA-3254 Add Bloop build support)
>>>>>>> locatelli-main
=======
=======
>>>>>>> f1532f2313 (GEOMESA-3254 Add Bloop build support)
>>>>>>> 7c6dac7c346 (GEOMESA-3254 Add Bloop build support)
>>>>>>> locatelli-main
=======
=======
>>>>>>> f1532f2313 (GEOMESA-3254 Add Bloop build support)
>>>>>>> 7c6dac7c346 (GEOMESA-3254 Add Bloop build support)
>>>>>>> locatelli-main
=======
=======
>>>>>>> f1532f2313 (GEOMESA-3254 Add Bloop build support)
>>>>>>> 7c6dac7c346 (GEOMESA-3254 Add Bloop build support)
>>>>>>> locatelli-main
=======
=======
>>>>>>> f1532f2313 (GEOMESA-3254 Add Bloop build support)
>>>>>>> 7c6dac7c346 (GEOMESA-3254 Add Bloop build support)
>>>>>>> locatelli-main
=======
=======
>>>>>>> f1532f2313 (GEOMESA-3254 Add Bloop build support)
>>>>>>> 7c6dac7c346 (GEOMESA-3254 Add Bloop build support)
>>>>>>> locatelli-main
=======
=======
>>>>>>> f1532f2313 (GEOMESA-3254 Add Bloop build support)
>>>>>>> 7c6dac7c346 (GEOMESA-3254 Add Bloop build support)
>>>>>>> locatelli-main
=======
=======
>>>>>>> f1532f2313 (GEOMESA-3254 Add Bloop build support)
>>>>>>> 7c6dac7c346 (GEOMESA-3254 Add Bloop build support)
>>>>>>> locatelli-main
=======
=======
>>>>>>> f1532f2313 (GEOMESA-3254 Add Bloop build support)
>>>>>>> 7c6dac7c346 (GEOMESA-3254 Add Bloop build support)
>>>>>>> locatelli-main
=======
=======
>>>>>>> f1532f2313 (GEOMESA-3254 Add Bloop build support)
>>>>>>> 7c6dac7c346 (GEOMESA-3254 Add Bloop build support)
>>>>>>> locatelli-main
=======
=======
>>>>>>> f1532f2313 (GEOMESA-3254 Add Bloop build support)
>>>>>>> 7c6dac7c346 (GEOMESA-3254 Add Bloop build support)
>>>>>>> locatelli-main
=======
=======
>>>>>>> f1532f2313 (GEOMESA-3254 Add Bloop build support)
>>>>>>> 7c6dac7c346 (GEOMESA-3254 Add Bloop build support)
>>>>>>> locatelli-main
=======
=======
>>>>>>> f1532f2313 (GEOMESA-3254 Add Bloop build support)
>>>>>>> 7c6dac7c346 (GEOMESA-3254 Add Bloop build support)
>>>>>>> locatelli-main
=======
>>>>>>> 7564665969 (GEOMESA-3254 Add Bloop build support)
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
<<<<<<< HEAD
<<<<<<< HEAD
<<<<<<< HEAD
<<<<<<< HEAD
<<<<<<< HEAD
<<<<<<< HEAD
<<<<<<< HEAD
<<<<<<< HEAD
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
=======
>>>>>>> locatelli-main
=======
>>>>>>> locatelli-main
=======
>>>>>>> locatelli-main
=======
>>>>>>> locatelli-main
=======
>>>>>>> locatelli-main
=======
>>>>>>> locatelli-main
=======
>>>>>>> locatelli-main
=======
>>>>>>> locatelli-main
=======
>>>>>>> locatelli-main
=======
>>>>>>> locatelli-main
=======
>>>>>>> locatelli-main
=======
>>>>>>> locatelli-main
=======
>>>>>>> locatelli-main
=======
>>>>>>> locatelli-main
=======
>>>>>>> locatelli-main
=======
>>>>>>> locatelli-main
=======
>>>>>>> locatelli-main
=======
>>>>>>> locatelli-main
=======
>>>>>>> locatelli-main
=======
>>>>>>> locatelli-main
>>>>>>> 962cfa7e50 (GEOMESA-3078 Support Bytes, List and Map attribute types in GeoMesa Spark SQL)
=======
>>>>>>> 5a4c24e020 (GEOMESA-3254 Add Bloop build support)
=======
<<<<<<< HEAD
<<<<<<< HEAD
>>>>>>> 0eb6dc6a60 (GEOMESA-3078 Support Bytes, List and Map attribute types in GeoMesa Spark SQL)
=======
>>>>>>> 3820b86465 (GEOMESA-3078 Support Bytes, List and Map attribute types in GeoMesa Spark SQL)
<<<<<<< HEAD
<<<<<<< HEAD
<<<<<<< HEAD
<<<<<<< HEAD
<<<<<<< HEAD
<<<<<<< HEAD
<<<<<<< HEAD
<<<<<<< HEAD
<<<<<<< HEAD
<<<<<<< HEAD
<<<<<<< HEAD
<<<<<<< HEAD
<<<<<<< HEAD
<<<<<<< HEAD
<<<<<<< HEAD
<<<<<<< HEAD
<<<<<<< HEAD
<<<<<<< HEAD
<<<<<<< HEAD
<<<<<<< HEAD
<<<<<<< HEAD
<<<<<<< HEAD
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
>>>>>>> 0eb6dc6a60 (GEOMESA-3078 Support Bytes, List and Map attribute types in GeoMesa Spark SQL)
=======
>>>>>>> 3820b86465 (GEOMESA-3078 Support Bytes, List and Map attribute types in GeoMesa Spark SQL)
=======
>>>>>>> locatelli-main
=======
>>>>>>> locatelli-main
=======
>>>>>>> locatelli-main
=======
>>>>>>> locatelli-main
=======
>>>>>>> locatelli-main
=======
>>>>>>> locatelli-main
=======
>>>>>>> locatelli-main
=======
>>>>>>> locatelli-main
=======
>>>>>>> locatelli-main
=======
>>>>>>> locatelli-main
=======
>>>>>>> locatelli-main
=======
>>>>>>> locatelli-main
=======
>>>>>>> locatelli-main
=======
>>>>>>> locatelli-main
=======
>>>>>>> locatelli-main
=======
>>>>>>> locatelli-main
=======
>>>>>>> locatelli-main
=======
>>>>>>> locatelli-main
=======
>>>>>>> locatelli-main
=======
>>>>>>> locatelli-main
=======
>>>>>>> locatelli-main
=======
>>>>>>> locatelli-main
=======
>>>>>>> locatelli-main
=======
>>>>>>> locatelli-main
=======
>>>>>>> locatelli-main
=======
>>>>>>> locatelli-main
=======
>>>>>>> locatelli-main
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
>>>>>>> 7a84c9d22d (GEOMESA-3254 Add Bloop build support)
=======
>>>>>>> 9e49c1aac7 (GEOMESA-3254 Add Bloop build support)
=======
>>>>>>> dcaad7e3f9 (GEOMESA-3078 Support Bytes, List and Map attribute types in GeoMesa Spark SQL)
=======
>>>>>>> b298e017f1 (GEOMESA-3254 Add Bloop build support)
=======
>>>>>>> 15e786eba8 (GEOMESA-3078 Support Bytes, List and Map attribute types in GeoMesa Spark SQL)
=======
>>>>>>> 5343d2ddea (GEOMESA-3078 Support Bytes, List and Map attribute types in GeoMesa Spark SQL)
=======
>>>>>>> 383fa0c977 (GEOMESA-3078 Support Bytes, List and Map attribute types in GeoMesa Spark SQL)
=======
=======
>>>>>>> f1532f2313 (GEOMESA-3254 Add Bloop build support)
>>>>>>> c738f63bd9 (GEOMESA-3254 Add Bloop build support)
=======
=======
>>>>>>> f586fec5a3 (GEOMESA-3254 Add Bloop build support)
=======
>>>>>>> 962cfa7e50 (GEOMESA-3078 Support Bytes, List and Map attribute types in GeoMesa Spark SQL)
=======
>>>>>>> c94b71d579 (GEOMESA-3078 Support Bytes, List and Map attribute types in GeoMesa Spark SQL)
=======
>>>>>>> 13656f5052 (GEOMESA-3254 Add Bloop build support)
=======
>>>>>>> 0eb6dc6a60 (GEOMESA-3078 Support Bytes, List and Map attribute types in GeoMesa Spark SQL)
=======
>>>>>>> afdad4a952 (GEOMESA-3078 Support Bytes, List and Map attribute types in GeoMesa Spark SQL)
=======
>>>>>>> 96b3033c39 (GEOMESA-3078 Support Bytes, List and Map attribute types in GeoMesa Spark SQL)
<<<<<<< HEAD
<<<<<<< HEAD
<<<<<<< HEAD
<<<<<<< HEAD
<<<<<<< HEAD
<<<<<<< HEAD
<<<<<<< HEAD
<<<<<<< HEAD
<<<<<<< HEAD
<<<<<<< HEAD
<<<<<<< HEAD
<<<<<<< HEAD
<<<<<<< HEAD
<<<<<<< HEAD
<<<<<<< HEAD
<<<<<<< HEAD
<<<<<<< HEAD
<<<<<<< HEAD
<<<<<<< HEAD
<<<<<<< HEAD
<<<<<<< HEAD
<<<<<<< HEAD
<<<<<<< HEAD
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
>>>>>>> locatelli-main
=======
>>>>>>> locatelli-main
=======
>>>>>>> locatelli-main
=======
>>>>>>> locatelli-main
=======
>>>>>>> locatelli-main
=======
>>>>>>> locatelli-main
=======
>>>>>>> locatelli-main
=======
>>>>>>> locatelli-main
=======
>>>>>>> locatelli-main
=======
>>>>>>> locatelli-main
=======
>>>>>>> locatelli-main
=======
>>>>>>> locatelli-main
=======
>>>>>>> locatelli-main
=======
>>>>>>> locatelli-main
=======
>>>>>>> locatelli-main
=======
>>>>>>> locatelli-main
=======
>>>>>>> locatelli-main
=======
>>>>>>> locatelli-main
=======
>>>>>>> locatelli-main
=======
>>>>>>> locatelli-main
import org.apache.spark.sql.{SQLContext, SQLTypes, SparkSession}
<<<<<<< HEAD
>>>>>>> 544d6f2353 (GEOMESA-3078 Support Bytes, List and Map attribute types in GeoMesa Spark SQL)
=======
>>>>>>> 544d6f235 (GEOMESA-3078 Support Bytes, List and Map attribute types in GeoMesa Spark SQL)
>>>>>>> 7f520da00a (GEOMESA-3078 Support Bytes, List and Map attribute types in GeoMesa Spark SQL)
=======
>>>>>>> d845d7c1bd (GEOMESA-3254 Add Bloop build support)
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
<<<<<<< HEAD
<<<<<<< HEAD
<<<<<<< HEAD
<<<<<<< HEAD
<<<<<<< HEAD
<<<<<<< HEAD
<<<<<<< HEAD
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
>>>>>>> c738f63bd9 (GEOMESA-3254 Add Bloop build support)
=======
>>>>>>> f586fec5a3 (GEOMESA-3254 Add Bloop build support)
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
>>>>>>> c738f63bd9 (GEOMESA-3254 Add Bloop build support)
=======
>>>>>>> f586fec5a3 (GEOMESA-3254 Add Bloop build support)
>>>>>>> locatelli-main
=======
>>>>>>> c738f63bd9 (GEOMESA-3254 Add Bloop build support)
=======
>>>>>>> f586fec5a3 (GEOMESA-3254 Add Bloop build support)
>>>>>>> locatelli-main
=======
>>>>>>> c738f63bd9 (GEOMESA-3254 Add Bloop build support)
=======
>>>>>>> f586fec5a3 (GEOMESA-3254 Add Bloop build support)
>>>>>>> locatelli-main
=======
>>>>>>> c738f63bd9 (GEOMESA-3254 Add Bloop build support)
=======
>>>>>>> f586fec5a3 (GEOMESA-3254 Add Bloop build support)
>>>>>>> locatelli-main
=======
>>>>>>> c738f63bd9 (GEOMESA-3254 Add Bloop build support)
=======
>>>>>>> f586fec5a3 (GEOMESA-3254 Add Bloop build support)
>>>>>>> locatelli-main
=======
>>>>>>> c738f63bd9 (GEOMESA-3254 Add Bloop build support)
=======
>>>>>>> f586fec5a3 (GEOMESA-3254 Add Bloop build support)
>>>>>>> locatelli-main
=======
>>>>>>> c738f63bd9 (GEOMESA-3254 Add Bloop build support)
=======
>>>>>>> f586fec5a3 (GEOMESA-3254 Add Bloop build support)
>>>>>>> locatelli-main
=======
>>>>>>> c738f63bd9 (GEOMESA-3254 Add Bloop build support)
=======
>>>>>>> f586fec5a3 (GEOMESA-3254 Add Bloop build support)
>>>>>>> locatelli-main
=======
>>>>>>> c738f63bd9 (GEOMESA-3254 Add Bloop build support)
=======
>>>>>>> f586fec5a3 (GEOMESA-3254 Add Bloop build support)
>>>>>>> locatelli-main
=======
>>>>>>> c738f63bd9 (GEOMESA-3254 Add Bloop build support)
=======
>>>>>>> f586fec5a3 (GEOMESA-3254 Add Bloop build support)
>>>>>>> locatelli-main
=======
>>>>>>> c738f63bd9 (GEOMESA-3254 Add Bloop build support)
=======
>>>>>>> f586fec5a3 (GEOMESA-3254 Add Bloop build support)
>>>>>>> locatelli-main
=======
>>>>>>> c738f63bd9 (GEOMESA-3254 Add Bloop build support)
=======
>>>>>>> f586fec5a3 (GEOMESA-3254 Add Bloop build support)
>>>>>>> locatelli-main
=======
>>>>>>> c738f63bd9 (GEOMESA-3254 Add Bloop build support)
=======
>>>>>>> f586fec5a3 (GEOMESA-3254 Add Bloop build support)
>>>>>>> locatelli-main
=======
>>>>>>> c738f63bd9 (GEOMESA-3254 Add Bloop build support)
=======
>>>>>>> f586fec5a3 (GEOMESA-3254 Add Bloop build support)
>>>>>>> locatelli-main
=======
>>>>>>> c738f63bd9 (GEOMESA-3254 Add Bloop build support)
=======
>>>>>>> f586fec5a3 (GEOMESA-3254 Add Bloop build support)
>>>>>>> locatelli-main
=======
>>>>>>> c738f63bd9 (GEOMESA-3254 Add Bloop build support)
=======
>>>>>>> f586fec5a3 (GEOMESA-3254 Add Bloop build support)
>>>>>>> locatelli-main
=======
>>>>>>> c738f63bd9 (GEOMESA-3254 Add Bloop build support)
=======
>>>>>>> f586fec5a3 (GEOMESA-3254 Add Bloop build support)
>>>>>>> locatelli-main
=======
>>>>>>> c738f63bd9 (GEOMESA-3254 Add Bloop build support)
=======
>>>>>>> f586fec5a3 (GEOMESA-3254 Add Bloop build support)
>>>>>>> locatelli-main
=======
>>>>>>> c738f63bd9 (GEOMESA-3254 Add Bloop build support)
=======
>>>>>>> f586fec5a3 (GEOMESA-3254 Add Bloop build support)
>>>>>>> locatelli-main
=======
>>>>>>> c738f63bd9 (GEOMESA-3254 Add Bloop build support)
=======
>>>>>>> f586fec5a3 (GEOMESA-3254 Add Bloop build support)
>>>>>>> locatelli-main
=======
>>>>>>> c738f63bd9 (GEOMESA-3254 Add Bloop build support)
=======
>>>>>>> f586fec5a3 (GEOMESA-3254 Add Bloop build support)
>>>>>>> locatelli-main
=======
>>>>>>> c738f63bd9 (GEOMESA-3254 Add Bloop build support)
=======
>>>>>>> f586fec5a3 (GEOMESA-3254 Add Bloop build support)
>>>>>>> locatelli-main
=======
>>>>>>> c738f63bd9 (GEOMESA-3254 Add Bloop build support)
=======
>>>>>>> f586fec5a3 (GEOMESA-3254 Add Bloop build support)
>>>>>>> locatelli-main
=======
>>>>>>> c738f63bd9 (GEOMESA-3254 Add Bloop build support)
=======
>>>>>>> f586fec5a3 (GEOMESA-3254 Add Bloop build support)
>>>>>>> locatelli-main
=======
>>>>>>> c738f63bd9 (GEOMESA-3254 Add Bloop build support)
=======
>>>>>>> f586fec5a3 (GEOMESA-3254 Add Bloop build support)
>>>>>>> locatelli-main
=======
>>>>>>> c738f63bd9 (GEOMESA-3254 Add Bloop build support)
=======
>>>>>>> f586fec5a3 (GEOMESA-3254 Add Bloop build support)
>>>>>>> locatelli-main
=======
>>>>>>> c738f63bd9 (GEOMESA-3254 Add Bloop build support)
=======
>>>>>>> f586fec5a3 (GEOMESA-3254 Add Bloop build support)
>>>>>>> locatelli-main
=======
>>>>>>> c738f63bd9 (GEOMESA-3254 Add Bloop build support)
=======
>>>>>>> f586fec5a3 (GEOMESA-3254 Add Bloop build support)
>>>>>>> locatelli-main
=======
>>>>>>> 58d14a257e (GEOMESA-3254 Add Bloop build support)
=======
=======
import org.apache.spark.sql.{SQLContext, SQLTypes, SparkSession}
>>>>>>> 544d6f235 (GEOMESA-3078 Support Bytes, List and Map attribute types in GeoMesa Spark SQL)
>>>>>>> f4e2dcfd14 (GEOMESA-3078 Support Bytes, List and Map attribute types in GeoMesa Spark SQL)
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
<<<<<<< HEAD
<<<<<<< HEAD
<<<<<<< HEAD
<<<<<<< HEAD
<<<<<<< HEAD
<<<<<<< HEAD
<<<<<<< HEAD
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
>>>>>>> c94b71d579 (GEOMESA-3078 Support Bytes, List and Map attribute types in GeoMesa Spark SQL)
=======
>>>>>>> 13656f5052 (GEOMESA-3254 Add Bloop build support)
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
>>>>>>> c94b71d579 (GEOMESA-3078 Support Bytes, List and Map attribute types in GeoMesa Spark SQL)
=======
>>>>>>> 13656f5052 (GEOMESA-3254 Add Bloop build support)
>>>>>>> locatelli-main
=======
>>>>>>> c94b71d579 (GEOMESA-3078 Support Bytes, List and Map attribute types in GeoMesa Spark SQL)
=======
>>>>>>> 13656f5052 (GEOMESA-3254 Add Bloop build support)
>>>>>>> locatelli-main
=======
>>>>>>> c94b71d579 (GEOMESA-3078 Support Bytes, List and Map attribute types in GeoMesa Spark SQL)
=======
>>>>>>> 13656f5052 (GEOMESA-3254 Add Bloop build support)
>>>>>>> locatelli-main
=======
>>>>>>> c94b71d579 (GEOMESA-3078 Support Bytes, List and Map attribute types in GeoMesa Spark SQL)
=======
>>>>>>> 13656f5052 (GEOMESA-3254 Add Bloop build support)
>>>>>>> locatelli-main
=======
>>>>>>> c94b71d579 (GEOMESA-3078 Support Bytes, List and Map attribute types in GeoMesa Spark SQL)
=======
>>>>>>> 13656f5052 (GEOMESA-3254 Add Bloop build support)
>>>>>>> locatelli-main
=======
>>>>>>> c94b71d579 (GEOMESA-3078 Support Bytes, List and Map attribute types in GeoMesa Spark SQL)
=======
>>>>>>> 13656f5052 (GEOMESA-3254 Add Bloop build support)
>>>>>>> locatelli-main
=======
>>>>>>> c94b71d579 (GEOMESA-3078 Support Bytes, List and Map attribute types in GeoMesa Spark SQL)
=======
>>>>>>> 13656f5052 (GEOMESA-3254 Add Bloop build support)
>>>>>>> locatelli-main
=======
>>>>>>> c94b71d579 (GEOMESA-3078 Support Bytes, List and Map attribute types in GeoMesa Spark SQL)
=======
>>>>>>> 13656f5052 (GEOMESA-3254 Add Bloop build support)
>>>>>>> locatelli-main
=======
>>>>>>> c94b71d579 (GEOMESA-3078 Support Bytes, List and Map attribute types in GeoMesa Spark SQL)
=======
>>>>>>> 13656f5052 (GEOMESA-3254 Add Bloop build support)
>>>>>>> locatelli-main
=======
>>>>>>> c94b71d579 (GEOMESA-3078 Support Bytes, List and Map attribute types in GeoMesa Spark SQL)
=======
>>>>>>> 13656f5052 (GEOMESA-3254 Add Bloop build support)
>>>>>>> locatelli-main
=======
>>>>>>> c94b71d579 (GEOMESA-3078 Support Bytes, List and Map attribute types in GeoMesa Spark SQL)
=======
>>>>>>> 13656f5052 (GEOMESA-3254 Add Bloop build support)
>>>>>>> locatelli-main
=======
>>>>>>> c94b71d579 (GEOMESA-3078 Support Bytes, List and Map attribute types in GeoMesa Spark SQL)
=======
>>>>>>> 13656f5052 (GEOMESA-3254 Add Bloop build support)
>>>>>>> locatelli-main
=======
>>>>>>> c94b71d579 (GEOMESA-3078 Support Bytes, List and Map attribute types in GeoMesa Spark SQL)
=======
>>>>>>> 13656f5052 (GEOMESA-3254 Add Bloop build support)
>>>>>>> locatelli-main
=======
>>>>>>> c94b71d579 (GEOMESA-3078 Support Bytes, List and Map attribute types in GeoMesa Spark SQL)
=======
>>>>>>> 13656f5052 (GEOMESA-3254 Add Bloop build support)
>>>>>>> locatelli-main
=======
>>>>>>> c94b71d579 (GEOMESA-3078 Support Bytes, List and Map attribute types in GeoMesa Spark SQL)
=======
>>>>>>> 13656f5052 (GEOMESA-3254 Add Bloop build support)
>>>>>>> locatelli-main
=======
>>>>>>> c94b71d579 (GEOMESA-3078 Support Bytes, List and Map attribute types in GeoMesa Spark SQL)
=======
>>>>>>> 13656f5052 (GEOMESA-3254 Add Bloop build support)
>>>>>>> locatelli-main
=======
>>>>>>> c94b71d579 (GEOMESA-3078 Support Bytes, List and Map attribute types in GeoMesa Spark SQL)
=======
>>>>>>> 13656f5052 (GEOMESA-3254 Add Bloop build support)
>>>>>>> locatelli-main
=======
>>>>>>> c94b71d579 (GEOMESA-3078 Support Bytes, List and Map attribute types in GeoMesa Spark SQL)
=======
>>>>>>> 13656f5052 (GEOMESA-3254 Add Bloop build support)
>>>>>>> locatelli-main
=======
>>>>>>> c94b71d579 (GEOMESA-3078 Support Bytes, List and Map attribute types in GeoMesa Spark SQL)
=======
>>>>>>> 13656f5052 (GEOMESA-3254 Add Bloop build support)
>>>>>>> locatelli-main
=======
>>>>>>> c94b71d579 (GEOMESA-3078 Support Bytes, List and Map attribute types in GeoMesa Spark SQL)
=======
>>>>>>> 13656f5052 (GEOMESA-3254 Add Bloop build support)
>>>>>>> locatelli-main
=======
>>>>>>> c94b71d579 (GEOMESA-3078 Support Bytes, List and Map attribute types in GeoMesa Spark SQL)
=======
>>>>>>> 13656f5052 (GEOMESA-3254 Add Bloop build support)
>>>>>>> locatelli-main
=======
>>>>>>> c94b71d579 (GEOMESA-3078 Support Bytes, List and Map attribute types in GeoMesa Spark SQL)
=======
>>>>>>> 13656f5052 (GEOMESA-3254 Add Bloop build support)
>>>>>>> locatelli-main
=======
>>>>>>> c94b71d579 (GEOMESA-3078 Support Bytes, List and Map attribute types in GeoMesa Spark SQL)
=======
>>>>>>> 13656f5052 (GEOMESA-3254 Add Bloop build support)
>>>>>>> locatelli-main
=======
>>>>>>> c94b71d579 (GEOMESA-3078 Support Bytes, List and Map attribute types in GeoMesa Spark SQL)
=======
>>>>>>> 13656f5052 (GEOMESA-3254 Add Bloop build support)
>>>>>>> locatelli-main
=======
>>>>>>> c94b71d579 (GEOMESA-3078 Support Bytes, List and Map attribute types in GeoMesa Spark SQL)
=======
>>>>>>> 13656f5052 (GEOMESA-3254 Add Bloop build support)
>>>>>>> locatelli-main
=======
>>>>>>> c94b71d579 (GEOMESA-3078 Support Bytes, List and Map attribute types in GeoMesa Spark SQL)
=======
>>>>>>> 13656f5052 (GEOMESA-3254 Add Bloop build support)
>>>>>>> locatelli-main
=======
>>>>>>> c94b71d579 (GEOMESA-3078 Support Bytes, List and Map attribute types in GeoMesa Spark SQL)
=======
>>>>>>> 13656f5052 (GEOMESA-3254 Add Bloop build support)
>>>>>>> locatelli-main
=======
>>>>>>> c94b71d579 (GEOMESA-3078 Support Bytes, List and Map attribute types in GeoMesa Spark SQL)
=======
>>>>>>> 13656f5052 (GEOMESA-3254 Add Bloop build support)
>>>>>>> locatelli-main
=======
>>>>>>> 63a045a753 (GEOMESA-3254 Add Bloop build support)
=======
=======
import org.apache.spark.sql.{SQLContext, SQLTypes, SparkSession}
>>>>>>> 544d6f235 (GEOMESA-3078 Support Bytes, List and Map attribute types in GeoMesa Spark SQL)
>>>>>>> b11f0e2cf4 (GEOMESA-3078 Support Bytes, List and Map attribute types in GeoMesa Spark SQL)
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
<<<<<<< HEAD
<<<<<<< HEAD
<<<<<<< HEAD
<<<<<<< HEAD
<<<<<<< HEAD
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
>>>>>>> locatelli-main
=======
>>>>>>> locatelli-main
<<<<<<< HEAD
<<<<<<< HEAD
=======
>>>>>>> 3820b86465 (GEOMESA-3078 Support Bytes, List and Map attribute types in GeoMesa Spark SQL)
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
>>>>>>> 3820b86465 (GEOMESA-3078 Support Bytes, List and Map attribute types in GeoMesa Spark SQL)
<<<<<<< HEAD
>>>>>>> locatelli-main
=======
>>>>>>> locatelli-main
=======
>>>>>>> locatelli-main
=======
<<<<<<< HEAD
=======
>>>>>>> 3820b86465 (GEOMESA-3078 Support Bytes, List and Map attribute types in GeoMesa Spark SQL)
>>>>>>> locatelli-main
=======
>>>>>>> 3820b86465 (GEOMESA-3078 Support Bytes, List and Map attribute types in GeoMesa Spark SQL)
>>>>>>> locatelli-main
=======
>>>>>>> 3820b86465 (GEOMESA-3078 Support Bytes, List and Map attribute types in GeoMesa Spark SQL)
>>>>>>> locatelli-main
=======
>>>>>>> 3820b86465 (GEOMESA-3078 Support Bytes, List and Map attribute types in GeoMesa Spark SQL)
>>>>>>> locatelli-main
=======
>>>>>>> 3820b86465 (GEOMESA-3078 Support Bytes, List and Map attribute types in GeoMesa Spark SQL)
>>>>>>> locatelli-main
=======
>>>>>>> 3820b86465 (GEOMESA-3078 Support Bytes, List and Map attribute types in GeoMesa Spark SQL)
>>>>>>> locatelli-main
=======
>>>>>>> 3820b86465 (GEOMESA-3078 Support Bytes, List and Map attribute types in GeoMesa Spark SQL)
>>>>>>> locatelli-main
=======
>>>>>>> 3820b86465 (GEOMESA-3078 Support Bytes, List and Map attribute types in GeoMesa Spark SQL)
>>>>>>> locatelli-main
=======
>>>>>>> 3820b86465 (GEOMESA-3078 Support Bytes, List and Map attribute types in GeoMesa Spark SQL)
>>>>>>> locatelli-main
=======
>>>>>>> 3820b86465 (GEOMESA-3078 Support Bytes, List and Map attribute types in GeoMesa Spark SQL)
>>>>>>> locatelli-main
=======
>>>>>>> 3820b86465 (GEOMESA-3078 Support Bytes, List and Map attribute types in GeoMesa Spark SQL)
>>>>>>> locatelli-main
=======
>>>>>>> 3820b86465 (GEOMESA-3078 Support Bytes, List and Map attribute types in GeoMesa Spark SQL)
>>>>>>> locatelli-main
=======
>>>>>>> 3820b86465 (GEOMESA-3078 Support Bytes, List and Map attribute types in GeoMesa Spark SQL)
>>>>>>> locatelli-main
=======
>>>>>>> 3820b86465 (GEOMESA-3078 Support Bytes, List and Map attribute types in GeoMesa Spark SQL)
>>>>>>> locatelli-main
=======
>>>>>>> 3820b86465 (GEOMESA-3078 Support Bytes, List and Map attribute types in GeoMesa Spark SQL)
>>>>>>> locatelli-main
=======
>>>>>>> 3820b86465 (GEOMESA-3078 Support Bytes, List and Map attribute types in GeoMesa Spark SQL)
>>>>>>> locatelli-main
=======
>>>>>>> 3820b86465 (GEOMESA-3078 Support Bytes, List and Map attribute types in GeoMesa Spark SQL)
>>>>>>> locatelli-main
=======
>>>>>>> 3820b86465 (GEOMESA-3078 Support Bytes, List and Map attribute types in GeoMesa Spark SQL)
>>>>>>> locatelli-main
=======
>>>>>>> 3820b86465 (GEOMESA-3078 Support Bytes, List and Map attribute types in GeoMesa Spark SQL)
>>>>>>> locatelli-main
=======
>>>>>>> 3820b86465 (GEOMESA-3078 Support Bytes, List and Map attribute types in GeoMesa Spark SQL)
>>>>>>> locatelli-main
=======
>>>>>>> 3820b86465 (GEOMESA-3078 Support Bytes, List and Map attribute types in GeoMesa Spark SQL)
>>>>>>> locatelli-main
=======
>>>>>>> 3820b86465 (GEOMESA-3078 Support Bytes, List and Map attribute types in GeoMesa Spark SQL)
>>>>>>> locatelli-main
=======
>>>>>>> 3820b86465 (GEOMESA-3078 Support Bytes, List and Map attribute types in GeoMesa Spark SQL)
>>>>>>> locatelli-main
=======
>>>>>>> 3820b86465 (GEOMESA-3078 Support Bytes, List and Map attribute types in GeoMesa Spark SQL)
>>>>>>> locatelli-main
=======
>>>>>>> 3820b86465 (GEOMESA-3078 Support Bytes, List and Map attribute types in GeoMesa Spark SQL)
>>>>>>> locatelli-main
=======
>>>>>>> 3820b86465 (GEOMESA-3078 Support Bytes, List and Map attribute types in GeoMesa Spark SQL)
>>>>>>> locatelli-main
=======
>>>>>>> 3820b86465 (GEOMESA-3078 Support Bytes, List and Map attribute types in GeoMesa Spark SQL)
>>>>>>> locatelli-main
=======
>>>>>>> 3820b86465 (GEOMESA-3078 Support Bytes, List and Map attribute types in GeoMesa Spark SQL)
>>>>>>> locatelli-main
=======
>>>>>>> 3820b86465 (GEOMESA-3078 Support Bytes, List and Map attribute types in GeoMesa Spark SQL)
>>>>>>> locatelli-main
=======
>>>>>>> 5343d2ddea (GEOMESA-3078 Support Bytes, List and Map attribute types in GeoMesa Spark SQL)
=======
>>>>>>> afdad4a952 (GEOMESA-3078 Support Bytes, List and Map attribute types in GeoMesa Spark SQL)
=======
=======
>>>>>>> 3820b86465 (GEOMESA-3078 Support Bytes, List and Map attribute types in GeoMesa Spark SQL)
>>>>>>> 96b3033c39 (GEOMESA-3078 Support Bytes, List and Map attribute types in GeoMesa Spark SQL)
<<<<<<< HEAD
<<<<<<< HEAD
<<<<<<< HEAD
<<<<<<< HEAD
<<<<<<< HEAD
<<<<<<< HEAD
<<<<<<< HEAD
<<<<<<< HEAD
<<<<<<< HEAD
<<<<<<< HEAD
<<<<<<< HEAD
<<<<<<< HEAD
<<<<<<< HEAD
<<<<<<< HEAD
<<<<<<< HEAD
<<<<<<< HEAD
<<<<<<< HEAD
<<<<<<< HEAD
<<<<<<< HEAD
<<<<<<< HEAD
<<<<<<< HEAD
<<<<<<< HEAD
<<<<<<< HEAD
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
>>>>>>> locatelli-main
=======
>>>>>>> locatelli-main
=======
>>>>>>> locatelli-main
=======
>>>>>>> locatelli-main
=======
>>>>>>> locatelli-main
=======
>>>>>>> locatelli-main
=======
>>>>>>> locatelli-main
=======
>>>>>>> locatelli-main
=======
>>>>>>> locatelli-main
=======
>>>>>>> locatelli-main
=======
>>>>>>> locatelli-main
=======
>>>>>>> locatelli-main
=======
>>>>>>> locatelli-main
=======
>>>>>>> locatelli-main
=======
>>>>>>> locatelli-main
=======
>>>>>>> locatelli-main
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
import org.apache.spark.sql.{SQLContext, SQLTypes, SparkSession}
>>>>>>> 544d6f235 (GEOMESA-3078 Support Bytes, List and Map attribute types in GeoMesa Spark SQL)
>>>>>>> 217acd3c0a (GEOMESA-3078 Support Bytes, List and Map attribute types in GeoMesa Spark SQL)
<<<<<<< HEAD
<<<<<<< HEAD
<<<<<<< HEAD
<<<<<<< HEAD
<<<<<<< HEAD
<<<<<<< HEAD
<<<<<<< HEAD
<<<<<<< HEAD
<<<<<<< HEAD
<<<<<<< HEAD
<<<<<<< HEAD
<<<<<<< HEAD
<<<<<<< HEAD
<<<<<<< HEAD
<<<<<<< HEAD
<<<<<<< HEAD
<<<<<<< HEAD
<<<<<<< HEAD
<<<<<<< HEAD
<<<<<<< HEAD
<<<<<<< HEAD
<<<<<<< HEAD
<<<<<<< HEAD
<<<<<<< HEAD
<<<<<<< HEAD
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
>>>>>>> 96b3033c39 (GEOMESA-3078 Support Bytes, List and Map attribute types in GeoMesa Spark SQL)
<<<<<<< HEAD
>>>>>>> locatelli-main
=======
>>>>>>> locatelli-main
=======
<<<<<<< HEAD
=======
>>>>>>> 96b3033c39 (GEOMESA-3078 Support Bytes, List and Map attribute types in GeoMesa Spark SQL)
>>>>>>> locatelli-main
=======
=======
>>>>>>> 96b3033c39 (GEOMESA-3078 Support Bytes, List and Map attribute types in GeoMesa Spark SQL)
>>>>>>> locatelli-main
=======
=======
>>>>>>> 96b3033c39 (GEOMESA-3078 Support Bytes, List and Map attribute types in GeoMesa Spark SQL)
>>>>>>> locatelli-main
=======
=======
>>>>>>> 96b3033c39 (GEOMESA-3078 Support Bytes, List and Map attribute types in GeoMesa Spark SQL)
>>>>>>> locatelli-main
=======
=======
>>>>>>> 96b3033c39 (GEOMESA-3078 Support Bytes, List and Map attribute types in GeoMesa Spark SQL)
>>>>>>> locatelli-main
=======
=======
>>>>>>> 96b3033c39 (GEOMESA-3078 Support Bytes, List and Map attribute types in GeoMesa Spark SQL)
>>>>>>> locatelli-main
=======
=======
>>>>>>> 96b3033c39 (GEOMESA-3078 Support Bytes, List and Map attribute types in GeoMesa Spark SQL)
>>>>>>> locatelli-main
=======
=======
>>>>>>> 96b3033c39 (GEOMESA-3078 Support Bytes, List and Map attribute types in GeoMesa Spark SQL)
>>>>>>> locatelli-main
=======
=======
>>>>>>> 96b3033c39 (GEOMESA-3078 Support Bytes, List and Map attribute types in GeoMesa Spark SQL)
>>>>>>> locatelli-main
=======
=======
>>>>>>> 96b3033c39 (GEOMESA-3078 Support Bytes, List and Map attribute types in GeoMesa Spark SQL)
>>>>>>> locatelli-main
=======
=======
>>>>>>> 96b3033c39 (GEOMESA-3078 Support Bytes, List and Map attribute types in GeoMesa Spark SQL)
>>>>>>> locatelli-main
=======
=======
>>>>>>> 96b3033c39 (GEOMESA-3078 Support Bytes, List and Map attribute types in GeoMesa Spark SQL)
>>>>>>> locatelli-main
=======
=======
>>>>>>> 96b3033c39 (GEOMESA-3078 Support Bytes, List and Map attribute types in GeoMesa Spark SQL)
>>>>>>> locatelli-main
=======
=======
>>>>>>> 96b3033c39 (GEOMESA-3078 Support Bytes, List and Map attribute types in GeoMesa Spark SQL)
>>>>>>> locatelli-main
=======
=======
>>>>>>> 96b3033c39 (GEOMESA-3078 Support Bytes, List and Map attribute types in GeoMesa Spark SQL)
>>>>>>> locatelli-main
=======
=======
>>>>>>> 96b3033c39 (GEOMESA-3078 Support Bytes, List and Map attribute types in GeoMesa Spark SQL)
>>>>>>> locatelli-main
=======
=======
>>>>>>> 96b3033c39 (GEOMESA-3078 Support Bytes, List and Map attribute types in GeoMesa Spark SQL)
>>>>>>> locatelli-main
=======
=======
>>>>>>> 96b3033c39 (GEOMESA-3078 Support Bytes, List and Map attribute types in GeoMesa Spark SQL)
>>>>>>> locatelli-main
=======
=======
>>>>>>> 96b3033c39 (GEOMESA-3078 Support Bytes, List and Map attribute types in GeoMesa Spark SQL)
>>>>>>> locatelli-main
=======
=======
>>>>>>> 96b3033c39 (GEOMESA-3078 Support Bytes, List and Map attribute types in GeoMesa Spark SQL)
>>>>>>> locatelli-main
=======
=======
>>>>>>> 96b3033c39 (GEOMESA-3078 Support Bytes, List and Map attribute types in GeoMesa Spark SQL)
>>>>>>> locatelli-main
=======
=======
>>>>>>> 96b3033c39 (GEOMESA-3078 Support Bytes, List and Map attribute types in GeoMesa Spark SQL)
>>>>>>> locatelli-main
=======
=======
>>>>>>> 96b3033c39 (GEOMESA-3078 Support Bytes, List and Map attribute types in GeoMesa Spark SQL)
>>>>>>> locatelli-main
=======
=======
>>>>>>> 96b3033c39 (GEOMESA-3078 Support Bytes, List and Map attribute types in GeoMesa Spark SQL)
>>>>>>> locatelli-main
=======
=======
>>>>>>> 96b3033c39 (GEOMESA-3078 Support Bytes, List and Map attribute types in GeoMesa Spark SQL)
>>>>>>> locatelli-main
=======
=======
>>>>>>> 96b3033c39 (GEOMESA-3078 Support Bytes, List and Map attribute types in GeoMesa Spark SQL)
>>>>>>> locatelli-main
=======
=======
>>>>>>> 96b3033c39 (GEOMESA-3078 Support Bytes, List and Map attribute types in GeoMesa Spark SQL)
>>>>>>> locatelli-main
=======
=======
>>>>>>> 96b3033c39 (GEOMESA-3078 Support Bytes, List and Map attribute types in GeoMesa Spark SQL)
>>>>>>> locatelli-main
=======
=======
>>>>>>> 96b3033c39 (GEOMESA-3078 Support Bytes, List and Map attribute types in GeoMesa Spark SQL)
>>>>>>> locatelli-main
=======
=======
>>>>>>> 96b3033c39 (GEOMESA-3078 Support Bytes, List and Map attribute types in GeoMesa Spark SQL)
>>>>>>> locatelli-main
=======
=======
>>>>>>> 96b3033c39 (GEOMESA-3078 Support Bytes, List and Map attribute types in GeoMesa Spark SQL)
>>>>>>> locatelli-main
=======
=======
import org.apache.spark.sql.{SQLContext, SQLTypes, SparkSession}
<<<<<<< HEAD
>>>>>>> 544d6f2353 (GEOMESA-3078 Support Bytes, List and Map attribute types in GeoMesa Spark SQL)
<<<<<<< HEAD
>>>>>>> 6255df1e67 (GEOMESA-3078 Support Bytes, List and Map attribute types in GeoMesa Spark SQL)
=======
=======
>>>>>>> 544d6f235 (GEOMESA-3078 Support Bytes, List and Map attribute types in GeoMesa Spark SQL)
>>>>>>> 7f520da00a (GEOMESA-3078 Support Bytes, List and Map attribute types in GeoMesa Spark SQL)
>>>>>>> d127f509ed (GEOMESA-3078 Support Bytes, List and Map attribute types in GeoMesa Spark SQL)
=======
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
<<<<<<< HEAD
<<<<<<< HEAD
<<<<<<< HEAD
<<<<<<< HEAD
<<<<<<< HEAD
<<<<<<< HEAD
<<<<<<< HEAD
<<<<<<< HEAD
<<<<<<< HEAD
<<<<<<< HEAD
<<<<<<< HEAD
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
>>>>>>> locatelli-main
=======
<<<<<<< HEAD
=======
>>>>>>> f586fec5a3 (GEOMESA-3254 Add Bloop build support)
>>>>>>> locatelli-main
=======
>>>>>>> f586fec5a3 (GEOMESA-3254 Add Bloop build support)
>>>>>>> locatelli-main
=======
>>>>>>> f586fec5a3 (GEOMESA-3254 Add Bloop build support)
>>>>>>> locatelli-main
=======
>>>>>>> f586fec5a3 (GEOMESA-3254 Add Bloop build support)
>>>>>>> locatelli-main
=======
>>>>>>> f586fec5a3 (GEOMESA-3254 Add Bloop build support)
>>>>>>> locatelli-main
=======
>>>>>>> f586fec5a3 (GEOMESA-3254 Add Bloop build support)
>>>>>>> locatelli-main
=======
>>>>>>> f586fec5a3 (GEOMESA-3254 Add Bloop build support)
>>>>>>> locatelli-main
=======
>>>>>>> f586fec5a3 (GEOMESA-3254 Add Bloop build support)
>>>>>>> locatelli-main
=======
>>>>>>> f586fec5a3 (GEOMESA-3254 Add Bloop build support)
>>>>>>> locatelli-main
=======
>>>>>>> f586fec5a3 (GEOMESA-3254 Add Bloop build support)
>>>>>>> locatelli-main
=======
>>>>>>> f586fec5a3 (GEOMESA-3254 Add Bloop build support)
>>>>>>> locatelli-main
=======
>>>>>>> f586fec5a3 (GEOMESA-3254 Add Bloop build support)
>>>>>>> locatelli-main
=======
>>>>>>> f586fec5a3 (GEOMESA-3254 Add Bloop build support)
>>>>>>> locatelli-main
=======
>>>>>>> f586fec5a3 (GEOMESA-3254 Add Bloop build support)
>>>>>>> locatelli-main
=======
>>>>>>> f586fec5a3 (GEOMESA-3254 Add Bloop build support)
>>>>>>> locatelli-main
=======
>>>>>>> f586fec5a3 (GEOMESA-3254 Add Bloop build support)
>>>>>>> locatelli-main
=======
>>>>>>> f586fec5a3 (GEOMESA-3254 Add Bloop build support)
>>>>>>> locatelli-main
=======
>>>>>>> f586fec5a3 (GEOMESA-3254 Add Bloop build support)
>>>>>>> locatelli-main
=======
>>>>>>> f586fec5a3 (GEOMESA-3254 Add Bloop build support)
>>>>>>> locatelli-main
=======
>>>>>>> f586fec5a3 (GEOMESA-3254 Add Bloop build support)
>>>>>>> locatelli-main
=======
>>>>>>> f586fec5a3 (GEOMESA-3254 Add Bloop build support)
>>>>>>> locatelli-main
=======
>>>>>>> f586fec5a3 (GEOMESA-3254 Add Bloop build support)
>>>>>>> locatelli-main
=======
>>>>>>> f586fec5a3 (GEOMESA-3254 Add Bloop build support)
>>>>>>> locatelli-main
=======
>>>>>>> f586fec5a3 (GEOMESA-3254 Add Bloop build support)
>>>>>>> locatelli-main
=======
>>>>>>> f586fec5a3 (GEOMESA-3254 Add Bloop build support)
>>>>>>> locatelli-main
=======
>>>>>>> f586fec5a3 (GEOMESA-3254 Add Bloop build support)
>>>>>>> locatelli-main
=======
>>>>>>> f586fec5a3 (GEOMESA-3254 Add Bloop build support)
>>>>>>> locatelli-main
=======
>>>>>>> f586fec5a3 (GEOMESA-3254 Add Bloop build support)
>>>>>>> locatelli-main
=======
>>>>>>> f586fec5a3 (GEOMESA-3254 Add Bloop build support)
>>>>>>> locatelli-main
=======
>>>>>>> f586fec5a3 (GEOMESA-3254 Add Bloop build support)
>>>>>>> locatelli-main
=======
>>>>>>> f586fec5a3 (GEOMESA-3254 Add Bloop build support)
>>>>>>> locatelli-main
=======
>>>>>>> f586fec5a3 (GEOMESA-3254 Add Bloop build support)
>>>>>>> locatelli-main
=======
=======
>>>>>>> 58d14a257e (GEOMESA-3254 Add Bloop build support)
>>>>>>> 7564665969 (GEOMESA-3254 Add Bloop build support)
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
<<<<<<< HEAD
<<<<<<< HEAD
<<<<<<< HEAD
<<<<<<< HEAD
<<<<<<< HEAD
<<<<<<< HEAD
<<<<<<< HEAD
<<<<<<< HEAD
<<<<<<< HEAD
<<<<<<< HEAD
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
>>>>>>> locatelli-main
=======
>>>>>>> locatelli-main
=======
>>>>>>> locatelli-main
=======
>>>>>>> locatelli-main
=======
>>>>>>> locatelli-main
=======
>>>>>>> locatelli-main
=======
>>>>>>> locatelli-main
=======
>>>>>>> locatelli-main
=======
>>>>>>> locatelli-main
=======
>>>>>>> locatelli-main
=======
>>>>>>> locatelli-main
=======
>>>>>>> locatelli-main
=======
>>>>>>> locatelli-main
=======
>>>>>>> locatelli-main
=======
>>>>>>> locatelli-main
=======
>>>>>>> locatelli-main
=======
>>>>>>> locatelli-main
=======
>>>>>>> locatelli-main
=======
>>>>>>> locatelli-main
=======
>>>>>>> locatelli-main
>>>>>>> 962cfa7e50 (GEOMESA-3078 Support Bytes, List and Map attribute types in GeoMesa Spark SQL)
=======
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
<<<<<<< HEAD
<<<<<<< HEAD
<<<<<<< HEAD
<<<<<<< HEAD
<<<<<<< HEAD
<<<<<<< HEAD
<<<<<<< HEAD
<<<<<<< HEAD
<<<<<<< HEAD
<<<<<<< HEAD
<<<<<<< HEAD
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
>>>>>>> locatelli-main
=======
>>>>>>> locatelli-main
=======
>>>>>>> locatelli-main
=======
>>>>>>> locatelli-main
=======
>>>>>>> locatelli-main
=======
>>>>>>> locatelli-main
=======
>>>>>>> locatelli-main
=======
>>>>>>> locatelli-main
=======
>>>>>>> locatelli-main
=======
>>>>>>> locatelli-main
=======
>>>>>>> locatelli-main
=======
>>>>>>> locatelli-main
=======
>>>>>>> locatelli-main
=======
>>>>>>> locatelli-main
=======
>>>>>>> locatelli-main
=======
>>>>>>> locatelli-main
=======
>>>>>>> locatelli-main
=======
>>>>>>> locatelli-main
=======
>>>>>>> locatelli-main
=======
>>>>>>> locatelli-main
>>>>>>> 0eb6dc6a60 (GEOMESA-3078 Support Bytes, List and Map attribute types in GeoMesa Spark SQL)
=======
>>>>>>> 3820b86465 (GEOMESA-3078 Support Bytes, List and Map attribute types in GeoMesa Spark SQL)
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
<<<<<<< HEAD
<<<<<<< HEAD
<<<<<<< HEAD
<<<<<<< HEAD
<<<<<<< HEAD
<<<<<<< HEAD
<<<<<<< HEAD
<<<<<<< HEAD
<<<<<<< HEAD
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
>>>>>>> locatelli-main
=======
>>>>>>> locatelli-main
=======
>>>>>>> locatelli-main
=======
>>>>>>> locatelli-main
=======
>>>>>>> locatelli-main
=======
>>>>>>> locatelli-main
=======
>>>>>>> locatelli-main
=======
>>>>>>> locatelli-main
=======
>>>>>>> locatelli-main
=======
>>>>>>> locatelli-main
=======
>>>>>>> locatelli-main
=======
>>>>>>> locatelli-main
=======
>>>>>>> locatelli-main
=======
>>>>>>> locatelli-main
=======
>>>>>>> locatelli-main
=======
>>>>>>> locatelli-main
=======
>>>>>>> locatelli-main
=======
>>>>>>> locatelli-main
=======
>>>>>>> locatelli-main
=======
>>>>>>> locatelli-main
=======
import org.apache.spark.sql.{SQLContext, SQLTypes, SparkSession}
<<<<<<< HEAD
>>>>>>> 544d6f2353 (GEOMESA-3078 Support Bytes, List and Map attribute types in GeoMesa Spark SQL)
<<<<<<< HEAD
>>>>>>> 6b6a8cecec (GEOMESA-3078 Support Bytes, List and Map attribute types in GeoMesa Spark SQL)
=======
=======
>>>>>>> 544d6f235 (GEOMESA-3078 Support Bytes, List and Map attribute types in GeoMesa Spark SQL)
>>>>>>> 7f520da00a (GEOMESA-3078 Support Bytes, List and Map attribute types in GeoMesa Spark SQL)
>>>>>>> edba4ab184 (GEOMESA-3078 Support Bytes, List and Map attribute types in GeoMesa Spark SQL)
=======
>>>>>>> 7a84c9d22d (GEOMESA-3254 Add Bloop build support)
=======
=======
>>>>>>> 58d14a257e (GEOMESA-3254 Add Bloop build support)
>>>>>>> 9e49c1aac7 (GEOMESA-3254 Add Bloop build support)
=======
>>>>>>> dcaad7e3f9 (GEOMESA-3078 Support Bytes, List and Map attribute types in GeoMesa Spark SQL)
=======
=======
>>>>>>> 63a045a753 (GEOMESA-3254 Add Bloop build support)
>>>>>>> b298e017f1 (GEOMESA-3254 Add Bloop build support)
=======
>>>>>>> 15e786eba8 (GEOMESA-3078 Support Bytes, List and Map attribute types in GeoMesa Spark SQL)
=======
>>>>>>> 5343d2ddea (GEOMESA-3078 Support Bytes, List and Map attribute types in GeoMesa Spark SQL)
=======
=======
=======
import org.apache.spark.sql.{SQLContext, SQLTypes, SparkSession}
<<<<<<< HEAD
>>>>>>> 544d6f2353 (GEOMESA-3078 Support Bytes, List and Map attribute types in GeoMesa Spark SQL)
<<<<<<< HEAD
>>>>>>> 6255df1e67 (GEOMESA-3078 Support Bytes, List and Map attribute types in GeoMesa Spark SQL)
<<<<<<< HEAD
>>>>>>> 383fa0c977 (GEOMESA-3078 Support Bytes, List and Map attribute types in GeoMesa Spark SQL)
=======
=======
=======
>>>>>>> 544d6f235 (GEOMESA-3078 Support Bytes, List and Map attribute types in GeoMesa Spark SQL)
>>>>>>> 7f520da00a (GEOMESA-3078 Support Bytes, List and Map attribute types in GeoMesa Spark SQL)
>>>>>>> d127f509ed (GEOMESA-3078 Support Bytes, List and Map attribute types in GeoMesa Spark SQL)
>>>>>>> 628f3a0c4b (GEOMESA-3078 Support Bytes, List and Map attribute types in GeoMesa Spark SQL)
=======
>>>>>>> c738f63bd9 (GEOMESA-3254 Add Bloop build support)
=======
>>>>>>> f586fec5a3 (GEOMESA-3254 Add Bloop build support)
=======
=======
>>>>>>> 962cfa7e50 (GEOMESA-3078 Support Bytes, List and Map attribute types in GeoMesa Spark SQL)
>>>>>>> c94b71d579 (GEOMESA-3078 Support Bytes, List and Map attribute types in GeoMesa Spark SQL)
=======
>>>>>>> 13656f5052 (GEOMESA-3254 Add Bloop build support)
=======
=======
>>>>>>> 0eb6dc6a60 (GEOMESA-3078 Support Bytes, List and Map attribute types in GeoMesa Spark SQL)
>>>>>>> afdad4a952 (GEOMESA-3078 Support Bytes, List and Map attribute types in GeoMesa Spark SQL)
=======
>>>>>>> 96b3033c39 (GEOMESA-3078 Support Bytes, List and Map attribute types in GeoMesa Spark SQL)
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
<<<<<<< HEAD
<<<<<<< HEAD
<<<<<<< HEAD
<<<<<<< HEAD
<<<<<<< HEAD
<<<<<<< HEAD
<<<<<<< HEAD
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
>>>>>>> locatelli-main
=======
>>>>>>> locatelli-main
=======
>>>>>>> locatelli-main
=======
>>>>>>> locatelli-main
=======
>>>>>>> locatelli-main
=======
>>>>>>> locatelli-main
=======
>>>>>>> locatelli-main
=======
>>>>>>> locatelli-main
=======
>>>>>>> locatelli-main
=======
>>>>>>> locatelli-main
=======
>>>>>>> locatelli-main
=======
>>>>>>> locatelli-main
=======
>>>>>>> locatelli-main
=======
>>>>>>> locatelli-main
=======
>>>>>>> locatelli-main
=======
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
import org.apache.spark.sql.{SQLContext, SQLTypes, SparkSession}
>>>>>>> 544d6f235 (GEOMESA-3078 Support Bytes, List and Map attribute types in GeoMesa Spark SQL)
>>>>>>> f7e376a051 (GEOMESA-3078 Support Bytes, List and Map attribute types in GeoMesa Spark SQL)
<<<<<<< HEAD
<<<<<<< HEAD
<<<<<<< HEAD
<<<<<<< HEAD
<<<<<<< HEAD
<<<<<<< HEAD
<<<<<<< HEAD
<<<<<<< HEAD
<<<<<<< HEAD
<<<<<<< HEAD
<<<<<<< HEAD
<<<<<<< HEAD
<<<<<<< HEAD
<<<<<<< HEAD
<<<<<<< HEAD
<<<<<<< HEAD
<<<<<<< HEAD
<<<<<<< HEAD
<<<<<<< HEAD
<<<<<<< HEAD
<<<<<<< HEAD
<<<<<<< HEAD
<<<<<<< HEAD
<<<<<<< HEAD
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
>>>>>>> 29fba6fef4 (GEOMESA-3078 Support Bytes, List and Map attribute types in GeoMesa Spark SQL)
>>>>>>> locatelli-main
=======
>>>>>>> 29fba6fef4 (GEOMESA-3078 Support Bytes, List and Map attribute types in GeoMesa Spark SQL)
>>>>>>> locatelli-main
=======
>>>>>>> 29fba6fef4 (GEOMESA-3078 Support Bytes, List and Map attribute types in GeoMesa Spark SQL)
>>>>>>> locatelli-main
=======
>>>>>>> 29fba6fef4 (GEOMESA-3078 Support Bytes, List and Map attribute types in GeoMesa Spark SQL)
>>>>>>> locatelli-main
=======
>>>>>>> 29fba6fef4 (GEOMESA-3078 Support Bytes, List and Map attribute types in GeoMesa Spark SQL)
>>>>>>> locatelli-main
=======
>>>>>>> 29fba6fef4 (GEOMESA-3078 Support Bytes, List and Map attribute types in GeoMesa Spark SQL)
>>>>>>> locatelli-main
=======
>>>>>>> 29fba6fef4 (GEOMESA-3078 Support Bytes, List and Map attribute types in GeoMesa Spark SQL)
>>>>>>> locatelli-main
=======
>>>>>>> 29fba6fef4 (GEOMESA-3078 Support Bytes, List and Map attribute types in GeoMesa Spark SQL)
>>>>>>> locatelli-main
=======
>>>>>>> 29fba6fef4 (GEOMESA-3078 Support Bytes, List and Map attribute types in GeoMesa Spark SQL)
>>>>>>> locatelli-main
=======
>>>>>>> 29fba6fef4 (GEOMESA-3078 Support Bytes, List and Map attribute types in GeoMesa Spark SQL)
>>>>>>> locatelli-main
=======
>>>>>>> 29fba6fef4 (GEOMESA-3078 Support Bytes, List and Map attribute types in GeoMesa Spark SQL)
>>>>>>> locatelli-main
=======
>>>>>>> 29fba6fef4 (GEOMESA-3078 Support Bytes, List and Map attribute types in GeoMesa Spark SQL)
>>>>>>> locatelli-main
=======
>>>>>>> 29fba6fef4 (GEOMESA-3078 Support Bytes, List and Map attribute types in GeoMesa Spark SQL)
>>>>>>> locatelli-main
=======
>>>>>>> 29fba6fef4 (GEOMESA-3078 Support Bytes, List and Map attribute types in GeoMesa Spark SQL)
>>>>>>> locatelli-main
=======
>>>>>>> 29fba6fef4 (GEOMESA-3078 Support Bytes, List and Map attribute types in GeoMesa Spark SQL)
>>>>>>> locatelli-main
=======
>>>>>>> 29fba6fef4 (GEOMESA-3078 Support Bytes, List and Map attribute types in GeoMesa Spark SQL)
>>>>>>> locatelli-main
=======
>>>>>>> 29fba6fef4 (GEOMESA-3078 Support Bytes, List and Map attribute types in GeoMesa Spark SQL)
>>>>>>> locatelli-main
=======
>>>>>>> 29fba6fef4 (GEOMESA-3078 Support Bytes, List and Map attribute types in GeoMesa Spark SQL)
>>>>>>> locatelli-main
=======
>>>>>>> 29fba6fef4 (GEOMESA-3078 Support Bytes, List and Map attribute types in GeoMesa Spark SQL)
>>>>>>> locatelli-main
=======
>>>>>>> 29fba6fef4 (GEOMESA-3078 Support Bytes, List and Map attribute types in GeoMesa Spark SQL)
>>>>>>> locatelli-main
=======
>>>>>>> 29fba6fef4 (GEOMESA-3078 Support Bytes, List and Map attribute types in GeoMesa Spark SQL)
>>>>>>> locatelli-main
=======
>>>>>>> 29fba6fef4 (GEOMESA-3078 Support Bytes, List and Map attribute types in GeoMesa Spark SQL)
>>>>>>> locatelli-main
=======
>>>>>>> 29fba6fef4 (GEOMESA-3078 Support Bytes, List and Map attribute types in GeoMesa Spark SQL)
>>>>>>> locatelli-main
=======
>>>>>>> 29fba6fef4 (GEOMESA-3078 Support Bytes, List and Map attribute types in GeoMesa Spark SQL)
>>>>>>> locatelli-main
=======
>>>>>>> 29fba6fef4 (GEOMESA-3078 Support Bytes, List and Map attribute types in GeoMesa Spark SQL)
>>>>>>> locatelli-main
=======
>>>>>>> 29fba6fef4 (GEOMESA-3078 Support Bytes, List and Map attribute types in GeoMesa Spark SQL)
>>>>>>> locatelli-main
=======
>>>>>>> 29fba6fef4 (GEOMESA-3078 Support Bytes, List and Map attribute types in GeoMesa Spark SQL)
>>>>>>> locatelli-main
=======
>>>>>>> 29fba6fef4 (GEOMESA-3078 Support Bytes, List and Map attribute types in GeoMesa Spark SQL)
>>>>>>> locatelli-main
=======
>>>>>>> 29fba6fef4 (GEOMESA-3078 Support Bytes, List and Map attribute types in GeoMesa Spark SQL)
>>>>>>> locatelli-main
=======
>>>>>>> 29fba6fef4 (GEOMESA-3078 Support Bytes, List and Map attribute types in GeoMesa Spark SQL)
>>>>>>> locatelli-main
=======
>>>>>>> 29fba6fef4 (GEOMESA-3078 Support Bytes, List and Map attribute types in GeoMesa Spark SQL)
>>>>>>> locatelli-main
=======
>>>>>>> 29fba6fef4 (GEOMESA-3078 Support Bytes, List and Map attribute types in GeoMesa Spark SQL)
>>>>>>> locatelli-main
=======
>>>>>>> 29fba6fef4 (GEOMESA-3078 Support Bytes, List and Map attribute types in GeoMesa Spark SQL)
>>>>>>> locatelli-main
=======
=======
import org.apache.spark.sql.{SQLContext, SQLTypes, SparkSession}
>>>>>>> 544d6f235 (GEOMESA-3078 Support Bytes, List and Map attribute types in GeoMesa Spark SQL)
<<<<<<< HEAD
<<<<<<< HEAD
<<<<<<< HEAD
<<<<<<< HEAD
<<<<<<< HEAD
<<<<<<< HEAD
<<<<<<< HEAD
<<<<<<< HEAD
<<<<<<< HEAD
<<<<<<< HEAD
<<<<<<< HEAD
<<<<<<< HEAD
<<<<<<< HEAD
<<<<<<< HEAD
<<<<<<< HEAD
<<<<<<< HEAD
<<<<<<< HEAD
<<<<<<< HEAD
<<<<<<< HEAD
<<<<<<< HEAD
<<<<<<< HEAD
<<<<<<< HEAD
<<<<<<< HEAD
<<<<<<< HEAD
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
>>>>>>> f7e376a051 (GEOMESA-3078 Support Bytes, List and Map attribute types in GeoMesa Spark SQL)
>>>>>>> locatelli-main
=======
>>>>>>> f7e376a051 (GEOMESA-3078 Support Bytes, List and Map attribute types in GeoMesa Spark SQL)
>>>>>>> locatelli-main
=======
>>>>>>> f7e376a051 (GEOMESA-3078 Support Bytes, List and Map attribute types in GeoMesa Spark SQL)
>>>>>>> locatelli-main
=======
>>>>>>> f7e376a051 (GEOMESA-3078 Support Bytes, List and Map attribute types in GeoMesa Spark SQL)
>>>>>>> locatelli-main
=======
>>>>>>> f7e376a051 (GEOMESA-3078 Support Bytes, List and Map attribute types in GeoMesa Spark SQL)
>>>>>>> locatelli-main
=======
>>>>>>> f7e376a051 (GEOMESA-3078 Support Bytes, List and Map attribute types in GeoMesa Spark SQL)
>>>>>>> locatelli-main
=======
>>>>>>> f7e376a051 (GEOMESA-3078 Support Bytes, List and Map attribute types in GeoMesa Spark SQL)
>>>>>>> locatelli-main
=======
>>>>>>> f7e376a051 (GEOMESA-3078 Support Bytes, List and Map attribute types in GeoMesa Spark SQL)
>>>>>>> locatelli-main
=======
>>>>>>> f7e376a051 (GEOMESA-3078 Support Bytes, List and Map attribute types in GeoMesa Spark SQL)
>>>>>>> locatelli-main
=======
>>>>>>> f7e376a051 (GEOMESA-3078 Support Bytes, List and Map attribute types in GeoMesa Spark SQL)
>>>>>>> locatelli-main
=======
>>>>>>> f7e376a051 (GEOMESA-3078 Support Bytes, List and Map attribute types in GeoMesa Spark SQL)
>>>>>>> locatelli-main
=======
>>>>>>> f7e376a051 (GEOMESA-3078 Support Bytes, List and Map attribute types in GeoMesa Spark SQL)
>>>>>>> locatelli-main
=======
>>>>>>> f7e376a051 (GEOMESA-3078 Support Bytes, List and Map attribute types in GeoMesa Spark SQL)
>>>>>>> locatelli-main
=======
>>>>>>> f7e376a051 (GEOMESA-3078 Support Bytes, List and Map attribute types in GeoMesa Spark SQL)
>>>>>>> locatelli-main
=======
>>>>>>> f7e376a051 (GEOMESA-3078 Support Bytes, List and Map attribute types in GeoMesa Spark SQL)
>>>>>>> locatelli-main
=======
>>>>>>> f7e376a051 (GEOMESA-3078 Support Bytes, List and Map attribute types in GeoMesa Spark SQL)
>>>>>>> locatelli-main
=======
>>>>>>> f7e376a051 (GEOMESA-3078 Support Bytes, List and Map attribute types in GeoMesa Spark SQL)
>>>>>>> locatelli-main
=======
>>>>>>> f7e376a051 (GEOMESA-3078 Support Bytes, List and Map attribute types in GeoMesa Spark SQL)
>>>>>>> locatelli-main
=======
>>>>>>> f7e376a051 (GEOMESA-3078 Support Bytes, List and Map attribute types in GeoMesa Spark SQL)
>>>>>>> locatelli-main
=======
>>>>>>> f7e376a051 (GEOMESA-3078 Support Bytes, List and Map attribute types in GeoMesa Spark SQL)
>>>>>>> locatelli-main
=======
>>>>>>> f7e376a051 (GEOMESA-3078 Support Bytes, List and Map attribute types in GeoMesa Spark SQL)
>>>>>>> locatelli-main
=======
>>>>>>> f7e376a051 (GEOMESA-3078 Support Bytes, List and Map attribute types in GeoMesa Spark SQL)
>>>>>>> locatelli-main
=======
>>>>>>> f7e376a051 (GEOMESA-3078 Support Bytes, List and Map attribute types in GeoMesa Spark SQL)
>>>>>>> locatelli-main
=======
>>>>>>> f7e376a051 (GEOMESA-3078 Support Bytes, List and Map attribute types in GeoMesa Spark SQL)
>>>>>>> locatelli-main
=======
>>>>>>> f7e376a051 (GEOMESA-3078 Support Bytes, List and Map attribute types in GeoMesa Spark SQL)
>>>>>>> locatelli-main
=======
>>>>>>> f7e376a051 (GEOMESA-3078 Support Bytes, List and Map attribute types in GeoMesa Spark SQL)
>>>>>>> locatelli-main
=======
>>>>>>> f7e376a051 (GEOMESA-3078 Support Bytes, List and Map attribute types in GeoMesa Spark SQL)
>>>>>>> locatelli-main
=======
>>>>>>> f7e376a051 (GEOMESA-3078 Support Bytes, List and Map attribute types in GeoMesa Spark SQL)
>>>>>>> locatelli-main
=======
>>>>>>> f7e376a051 (GEOMESA-3078 Support Bytes, List and Map attribute types in GeoMesa Spark SQL)
>>>>>>> locatelli-main
=======
>>>>>>> f7e376a051 (GEOMESA-3078 Support Bytes, List and Map attribute types in GeoMesa Spark SQL)
>>>>>>> locatelli-main
=======
>>>>>>> f7e376a051 (GEOMESA-3078 Support Bytes, List and Map attribute types in GeoMesa Spark SQL)
>>>>>>> locatelli-main
=======
>>>>>>> f7e376a051 (GEOMESA-3078 Support Bytes, List and Map attribute types in GeoMesa Spark SQL)
>>>>>>> locatelli-main
=======
>>>>>>> f7e376a051 (GEOMESA-3078 Support Bytes, List and Map attribute types in GeoMesa Spark SQL)
>>>>>>> locatelli-main
import org.geotools.data.{DataStore, DataStoreFinder, Transaction}
>>>>>>> 10b992fa94b (GEOMESA-3078 Support Bytes, List and Map attribute types in GeoMesa Spark SQL)
import org.junit.runner.RunWith
import org.locationtech.geomesa.features.ScalaSimpleFeature
import org.locationtech.geomesa.spark.sql.SQLTypes
import org.locationtech.geomesa.utils.geotools.{FeatureUtils, SimpleFeatureTypes}
import org.locationtech.geomesa.utils.io.WithClose
import org.specs2.execute.Result
import org.specs2.mutable.Specification
import org.specs2.runner.JUnitRunner
import org.specs2.execute.Result

import java.util.{Collections, UUID}

@RunWith(classOf[JUnitRunner])
class SparkSQLColumnsTest extends Specification with LazyLogging {

  import scala.collection.JavaConverters._

  sequential

  var ds: DataStore = _
  var spark: SparkSession = _
  var sc: SQLContext = _

  val spec =
    """int:Integer,
      |long:Long,
      |float:Float,
      |double:Double,
      |uuid:UUID,
      |string:String,
      |boolean:Boolean,
      |dtg:Date,
      |time:Timestamp,
      |bytes:Bytes,
      |list:List[String],
      |map:Map[String,Integer],
      |line:LineString:srid=4326,
      |poly:Polygon:srid=4326,
      |points:MultiPoint:srid=4326,
      |lines:MultiLineString:srid=4326,
      |polys:MultiPolygon:srid=4326,
      |geoms:GeometryCollection:srid=4326,
      |*point:Point:srid=4326
    """.stripMargin

  lazy val sft = SimpleFeatureTypes.createType("complex", spec)
  lazy val sf = {
    val sf = new ScalaSimpleFeature(sft, "0")
    sf.setAttribute("int", "1")
    sf.setAttribute("long", "-100")
    sf.setAttribute("float", "1.0")
    sf.setAttribute("double", "5.37")
    sf.setAttribute("uuid", UUID.randomUUID())
    sf.setAttribute("string", "mystring")
    sf.setAttribute("boolean", "false")
    sf.setAttribute("dtg", "2013-01-02T00:00:00.000Z")
    sf.setAttribute("time", "2013-01-02T00:00:00.000Z")
    sf.setAttribute("bytes", Array[Byte](0, 1))
    sf.setAttribute("list", Collections.singletonList("mylist"))
    sf.setAttribute("map", Collections.singletonMap("mykey", 1))
    sf.setAttribute("line", "LINESTRING(0 2, 2 0, 8 6)")
    sf.setAttribute("poly", "POLYGON((20 10, 30 0, 40 10, 30 20, 20 10))")
    sf.setAttribute("points", "MULTIPOINT(0 0, 2 2)")
    sf.setAttribute("lines", "MULTILINESTRING((0 2, 2 0, 8 6),(0 2, 2 0, 8 6))")
    sf.setAttribute("polys", "MULTIPOLYGON(((-1 0, 0 1, 1 0, 0 -1, -1 0)), ((-2 6, 1 6, 1 3, -2 3, -2 6)), ((-1 5, 2 5, 2 2, -1 2, -1 5)))")
    sf.setAttribute("geoms", "GEOMETRYCOLLECTION(POINT(45.0 49.0),POINT(45.1 49.1))")
    sf.setAttribute("point", "POINT(45.0 49.0)")
    sf
  }

  // we turn off the geo-index on the CQEngine DataStore because
  // BucketIndex doesn't do polygon <-> polygon comparisons properly;
  // acceptable performance-wise because the test data set is small
  val dsParams = Map(
    "geotools" -> "true",
    "cqengine" -> "true",
    "useGeoIndex" -> "false"
  )

  // before
  step {
    ds = DataStoreFinder.getDataStore(dsParams.asJava)
    spark = SparkSQLTestUtils.createSparkSession()
    sc = spark.sqlContext
    SQLTypes.init(sc)

    ds.createSchema(sft)

    WithClose(ds.getFeatureWriterAppend(sft.getTypeName, Transaction.AUTO_COMMIT)) { writer =>
      FeatureUtils.copyToWriter(writer, sf, useProvidedFid = true)
      writer.write()
    }

    val df = spark.read
        .format("geomesa")
        .options(dsParams)
        .option("geomesa.feature", sft.getTypeName)
        .load()

    logger.debug(df.schema.treeString)
    df.createOrReplaceTempView(sft.getTypeName)
  }

  "GeoMesaSparkSQL" should {

    "map appropriate column types" in {
      val df = sc.sql(s"select * from ${sft.getTypeName}")

      val expected = Seq(
        "__fid__" -> DataTypes.StringType,
        "int"     -> DataTypes.IntegerType,
        "long"    -> DataTypes.LongType,
        "float"   -> DataTypes.FloatType,
        "double"  -> DataTypes.DoubleType,
        "string"  -> DataTypes.StringType,
        "boolean" -> DataTypes.BooleanType,
        "dtg"     -> DataTypes.TimestampType,
        "time"    -> DataTypes.TimestampType,
        "bytes"   -> DataTypes.BinaryType,
        "list"    -> ArrayType(DataTypes.StringType),
        "map"     -> MapType(DataTypes.StringType, DataTypes.IntegerType),
        "line"    -> JTSTypes.LineStringTypeInstance,
        "poly"    -> JTSTypes.PolygonTypeInstance,
        "points"  -> JTSTypes.MultiPointTypeInstance,
        "lines"   -> JTSTypes.MultiLineStringTypeInstance,
        "polys"   -> JTSTypes.MultipolygonTypeInstance,
        "geoms"   -> JTSTypes.GeometryCollectionTypeInstance,
        "point"   -> JTSTypes.PointTypeInstance
      )

      val schema = df.schema
      schema must haveLength(expected.length) // note: uuid was not supported
      schema.map(_.name) mustEqual expected.map(_._1)
      schema.map(_.dataType) mustEqual expected.map(_._2)

      val result = df.collect()
      result must haveLength(1)

      val row = result.head

      // note: have to compare backwards so that java.util.Date == java.sql.Timestamp
      sf.getID mustEqual row.get(0)
      Result.foreach(expected.drop(1)) { case (f, _) =>
        val attrType = sft.getDescriptor(f).getType
        if (attrType.getBinding == classOf[java.util.List[_]]) {
          sf.getAttribute(f).asInstanceOf[java.util.List[_]].toArray() mustEqual row.getAs[Seq[_]](f).toArray
        } else if (attrType.getBinding == classOf[java.util.Map[_, _]]) {
          sf.getAttribute(f).asInstanceOf[java.util.Map[_, _]].asScala mustEqual row.getAs[Map[_, _]](f)
        } else {
          sf.getAttribute(f) mustEqual row.getAs[AnyRef](f)
        }
      }
    }
  }

  // after
  step {
    ds.dispose()
    spark.stop()
  }
}
