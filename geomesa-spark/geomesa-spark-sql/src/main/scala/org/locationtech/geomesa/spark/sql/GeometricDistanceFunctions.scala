/***********************************************************************
<<<<<<< HEAD
 * Copyright (c) 2013-2023 Commonwealth Computer Research, Inc.
=======
 * Copyright (c) 2013-2022 Commonwealth Computer Research, Inc.
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
>>>>>>> 58d14a257e (GEOMESA-3254 Add Bloop build support)
=======
>>>>>>> 58d14a257 (GEOMESA-3254 Add Bloop build support)
>>>>>>> fa60953a42 (GEOMESA-3254 Add Bloop build support)
<<<<<<< HEAD
<<<<<<< HEAD
<<<<<<< HEAD
=======
>>>>>>> 58d14a257e (GEOMESA-3254 Add Bloop build support)
>>>>>>> 7564665969 (GEOMESA-3254 Add Bloop build support)
=======
>>>>>>> e74fa3f690 (GEOMESA-3254 Add Bloop build support)
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
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Apache License, Version 2.0
 * which accompanies this distribution and is available at
 * http://www.opensource.org/licenses/apache2.0.php.
 ***********************************************************************/

package org.locationtech.geomesa.spark.sql

import org.apache.spark.sql.SQLContext
import org.geotools.geometry.jts.GeometryCoordinateSequenceTransformer
import org.geotools.referencing.crs.DefaultGeographicCRS
import org.geotools.referencing.{CRS, GeodeticCalculator}
import org.locationtech.geomesa.spark.jts.util.SQLFunctionHelper.nullableUDF
import org.locationtech.jts.geom.{Coordinate, Geometry, LineString}

object GeometricDistanceFunctions {
  import java.{lang => jl}

  val ST_DistanceSpheroid: (Geometry, Geometry) => jl.Double =
    nullableUDF((s, e) => fastDistance(s.getCoordinate, e.getCoordinate))

  // Assumes input is two points, for use with collect_list and window functions
  val ST_AggregateDistanceSpheroid: Seq[Geometry] => jl.Double = a => ST_DistanceSpheroid(a(0), a(1))

  val ST_LengthSpheroid: LineString => jl.Double =
    nullableUDF(line => line.getCoordinates.sliding(2).map { case Array(l, r) => fastDistance(l, r) }.sum)

  val ST_Transform: (Geometry, String, String) => Geometry = nullableUDF { (geometry, fromCRSCode, toCRSCode) =>
    val transformer = new GeometryCoordinateSequenceTransformer
    val fromCode = CRS.decode(fromCRSCode, true)
    val toCode = CRS.decode(toCRSCode, true)
    transformer.setMathTransform(CRS.findMathTransform(fromCode, toCode, true))
    transformer.transform(geometry)
  }

  val distanceNames = Map(
    ST_DistanceSpheroid -> "st_distanceSpheroid",
    ST_AggregateDistanceSpheroid -> "st_aggregateDistanceSpheroid",
    ST_LengthSpheroid -> "st_lengthSpheroid",
    ST_Transform -> "st_transform"
  )


  def registerFunctions(sqlContext: SQLContext): Unit = {
    sqlContext.udf.register(distanceNames (ST_DistanceSpheroid), ST_DistanceSpheroid)
    sqlContext.udf.register(distanceNames (ST_AggregateDistanceSpheroid), ST_AggregateDistanceSpheroid)
    sqlContext.udf.register(distanceNames (ST_LengthSpheroid), ST_LengthSpheroid)
    sqlContext.udf.register(distanceNames (ST_Transform), ST_Transform)
  }

  @transient private val geoCalcs = new ThreadLocal[GeodeticCalculator] {
    override def initialValue(): GeodeticCalculator = new GeodeticCalculator(DefaultGeographicCRS.WGS84)
  }

  def fastDistance(c1: Coordinate, c2: Coordinate): Double = {
    val calc = geoCalcs.get()
    calc.setStartingGeographicPoint(c1.x, c1.y)
    calc.setDestinationGeographicPoint(c2.x, c2.y)
    calc.getOrthodromicDistance
  }


}
