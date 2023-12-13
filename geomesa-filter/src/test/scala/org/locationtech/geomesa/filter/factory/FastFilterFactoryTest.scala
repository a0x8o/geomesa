/***********************************************************************
 * Copyright (c) 2013-2023 Commonwealth Computer Research, Inc.
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Apache License, Version 2.0
 * which accompanies this distribution and is available at
 * http://www.opensource.org/licenses/apache2.0.php.
 ***********************************************************************/


package org.locationtech.geomesa.filter.factory

import org.geotools.factory.CommonFactoryFinder
import org.geotools.filter.text.ecql.ECQL
import org.geotools.util.factory.Hints
import org.junit.runner.RunWith
import org.locationtech.geomesa.features.ScalaSimpleFeature
import org.locationtech.geomesa.filter.expression.{FastPropertyIsEqualTo, FastPropertyName, OrHashEquality, OrSequentialEquality}
import org.locationtech.geomesa.utils.geotools.SimpleFeatureTypes
<<<<<<< HEAD
<<<<<<< HEAD
<<<<<<< HEAD
<<<<<<< HEAD
<<<<<<< HEAD
<<<<<<< HEAD
<<<<<<< HEAD
<<<<<<< HEAD
<<<<<<< HEAD
<<<<<<< HEAD
<<<<<<< HEAD
<<<<<<< HEAD
<<<<<<< HEAD
<<<<<<< HEAD
<<<<<<< HEAD
<<<<<<< HEAD
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
>>>>>>> 3676d4e56a (GEOMESA-3061 Converters - support bytes in Avro top-level union types (#2762))
=======
>>>>>>> f1532f2313 (GEOMESA-3254 Add Bloop build support)
=======
>>>>>>> 7564665969 (GEOMESA-3254 Add Bloop build support)
=======
<<<<<<< HEAD
<<<<<<< HEAD
>>>>>>> 96d5d442fa (GEOMESA-3061 Converters - support bytes in Avro top-level union types (#2762))
=======
>>>>>>> 5a4c24e020 (GEOMESA-3254 Add Bloop build support)
=======
>>>>>>> a52e4429be (GEOMESA-3061 Converters - support bytes in Avro top-level union types (#2762))
=======
>>>>>>> 0104fb37e4 (GEOMESA-3061 Converters - support bytes in Avro top-level union types (#2762))
=======
>>>>>>> 7a84c9d22d (GEOMESA-3254 Add Bloop build support)
=======
>>>>>>> 9e49c1aac7 (GEOMESA-3254 Add Bloop build support)
=======
>>>>>>> 7fbbd56493 (GEOMESA-3061 Converters - support bytes in Avro top-level union types (#2762))
=======
>>>>>>> b298e017f1 (GEOMESA-3254 Add Bloop build support)
=======
>>>>>>> 1ea8b10ac7 (GEOMESA-3061 Converters - support bytes in Avro top-level union types (#2762))
=======
>>>>>>> 9293965a7d (GEOMESA-3061 Converters - support bytes in Avro top-level union types (#2762))
=======
>>>>>>> ac217b392d (GEOMESA-3061 Converters - support bytes in Avro top-level union types (#2762))
=======
=======
>>>>>>> f1532f2313 (GEOMESA-3254 Add Bloop build support)
>>>>>>> c738f63bd9 (GEOMESA-3254 Add Bloop build support)
=======
=======
>>>>>>> f586fec5a3 (GEOMESA-3254 Add Bloop build support)
=======
>>>>>>> 96d5d442fa (GEOMESA-3061 Converters - support bytes in Avro top-level union types (#2762))
=======
>>>>>>> 3676d4e56a (GEOMESA-3061 Converters - support bytes in Avro top-level union types (#2762))
import org.opengis.filter.PropertyIsEqualTo
<<<<<<< HEAD
>>>>>>> b9bdd406e3 (GEOMESA-3061 Converters - support bytes in Avro top-level union types (#2762))
=======
>>>>>>> b9bdd406e (GEOMESA-3061 Converters - support bytes in Avro top-level union types (#2762))
>>>>>>> d9ed077cd1 (GEOMESA-3061 Converters - support bytes in Avro top-level union types (#2762))
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
import org.opengis.filter.PropertyIsEqualTo
>>>>>>> b9bdd406e (GEOMESA-3061 Converters - support bytes in Avro top-level union types (#2762))
>>>>>>> 6d9a5b626c (GEOMESA-3061 Converters - support bytes in Avro top-level union types (#2762))
<<<<<<< HEAD
<<<<<<< HEAD
<<<<<<< HEAD
<<<<<<< HEAD
<<<<<<< HEAD
=======
>>>>>>> 3676d4e56a (GEOMESA-3061 Converters - support bytes in Avro top-level union types (#2762))
=======
>>>>>>> 63a045a753 (GEOMESA-3254 Add Bloop build support)
=======
=======
import org.opengis.filter.PropertyIsEqualTo
>>>>>>> b9bdd406e (GEOMESA-3061 Converters - support bytes in Avro top-level union types (#2762))
>>>>>>> 12e3a588fc (GEOMESA-3061 Converters - support bytes in Avro top-level union types (#2762))
<<<<<<< HEAD
<<<<<<< HEAD
<<<<<<< HEAD
<<<<<<< HEAD
=======
>>>>>>> 0104fb37e4 (GEOMESA-3061 Converters - support bytes in Avro top-level union types (#2762))
=======
>>>>>>> 9293965a7d (GEOMESA-3061 Converters - support bytes in Avro top-level union types (#2762))
=======
=======
import org.opengis.filter.PropertyIsEqualTo
>>>>>>> b9bdd406e (GEOMESA-3061 Converters - support bytes in Avro top-level union types (#2762))
>>>>>>> f0b9bd8121 (GEOMESA-3061 Converters - support bytes in Avro top-level union types (#2762))
<<<<<<< HEAD
<<<<<<< HEAD
<<<<<<< HEAD
=======
=======
import org.opengis.filter.PropertyIsEqualTo
<<<<<<< HEAD
>>>>>>> b9bdd406e3 (GEOMESA-3061 Converters - support bytes in Avro top-level union types (#2762))
<<<<<<< HEAD
>>>>>>> 59a1fbb96e (GEOMESA-3061 Converters - support bytes in Avro top-level union types (#2762))
=======
=======
>>>>>>> b9bdd406e (GEOMESA-3061 Converters - support bytes in Avro top-level union types (#2762))
>>>>>>> d9ed077cd1 (GEOMESA-3061 Converters - support bytes in Avro top-level union types (#2762))
>>>>>>> 810876750d (GEOMESA-3061 Converters - support bytes in Avro top-level union types (#2762))
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
>>>>>>> 96d5d442fa (GEOMESA-3061 Converters - support bytes in Avro top-level union types (#2762))
=======
=======
>>>>>>> 63a045a753 (GEOMESA-3254 Add Bloop build support)
>>>>>>> 5a4c24e020 (GEOMESA-3254 Add Bloop build support)
=======
>>>>>>> a52e4429be (GEOMESA-3061 Converters - support bytes in Avro top-level union types (#2762))
=======
>>>>>>> 0104fb37e4 (GEOMESA-3061 Converters - support bytes in Avro top-level union types (#2762))
=======
=======
import org.opengis.filter.PropertyIsEqualTo
<<<<<<< HEAD
>>>>>>> b9bdd406e3 (GEOMESA-3061 Converters - support bytes in Avro top-level union types (#2762))
<<<<<<< HEAD
>>>>>>> 3d5144418e (GEOMESA-3061 Converters - support bytes in Avro top-level union types (#2762))
=======
=======
>>>>>>> b9bdd406e (GEOMESA-3061 Converters - support bytes in Avro top-level union types (#2762))
>>>>>>> d9ed077cd1 (GEOMESA-3061 Converters - support bytes in Avro top-level union types (#2762))
>>>>>>> d498bef1ce (GEOMESA-3061 Converters - support bytes in Avro top-level union types (#2762))
=======
>>>>>>> 7a84c9d22d (GEOMESA-3254 Add Bloop build support)
=======
=======
>>>>>>> 58d14a257e (GEOMESA-3254 Add Bloop build support)
>>>>>>> 9e49c1aac7 (GEOMESA-3254 Add Bloop build support)
=======
>>>>>>> 7fbbd56493 (GEOMESA-3061 Converters - support bytes in Avro top-level union types (#2762))
=======
=======
>>>>>>> 63a045a753 (GEOMESA-3254 Add Bloop build support)
>>>>>>> b298e017f1 (GEOMESA-3254 Add Bloop build support)
=======
>>>>>>> 1ea8b10ac7 (GEOMESA-3061 Converters - support bytes in Avro top-level union types (#2762))
=======
>>>>>>> 9293965a7d (GEOMESA-3061 Converters - support bytes in Avro top-level union types (#2762))
=======
=======
=======
import org.opengis.filter.PropertyIsEqualTo
<<<<<<< HEAD
>>>>>>> b9bdd406e3 (GEOMESA-3061 Converters - support bytes in Avro top-level union types (#2762))
<<<<<<< HEAD
>>>>>>> 59a1fbb96e (GEOMESA-3061 Converters - support bytes in Avro top-level union types (#2762))
<<<<<<< HEAD
>>>>>>> ac217b392d (GEOMESA-3061 Converters - support bytes in Avro top-level union types (#2762))
=======
=======
=======
>>>>>>> b9bdd406e (GEOMESA-3061 Converters - support bytes in Avro top-level union types (#2762))
>>>>>>> d9ed077cd1 (GEOMESA-3061 Converters - support bytes in Avro top-level union types (#2762))
>>>>>>> 810876750d (GEOMESA-3061 Converters - support bytes in Avro top-level union types (#2762))
>>>>>>> 5a55bf9756 (GEOMESA-3061 Converters - support bytes in Avro top-level union types (#2762))
=======
>>>>>>> c738f63bd9 (GEOMESA-3254 Add Bloop build support)
=======
>>>>>>> f586fec5a3 (GEOMESA-3254 Add Bloop build support)
=======
=======
>>>>>>> 96d5d442fa (GEOMESA-3061 Converters - support bytes in Avro top-level union types (#2762))
>>>>>>> 3676d4e56a (GEOMESA-3061 Converters - support bytes in Avro top-level union types (#2762))
import org.opengis.filter.expression.Literal
import org.opengis.filter.spatial.BBOX
import org.specs2.execute.Result
import org.specs2.mutable.Specification
import org.specs2.runner.JUnitRunner

@RunWith(classOf[JUnitRunner])
class FastFilterFactoryTest extends Specification {

  "FastFilterFactory" should {
    "be loadable via hints" >> {
      val hints = new Hints()
      hints.put(Hints.FILTER_FACTORY, classOf[FastFilterFactory])
      val ff = CommonFactoryFinder.getFilterFactory2(hints)
      ff must beAnInstanceOf[FastFilterFactory]
    }
    "be loadable via system hints" >> {
      skipped("This might work if property is set globally at jvm startup...")
      System.setProperty("org.opengis.filter.FilterFactory", classOf[FastFilterFactory].getName)
      try {
        Hints.scanSystemProperties()
        val ff = CommonFactoryFinder.getFilterFactory2
        ff must beAnInstanceOf[FastFilterFactory]
      } finally {
        System.clearProperty("org.opengis.filter.FilterFactory")
        Hints.scanSystemProperties()
      }
    }
    "create fast property names via ECQL" >> {
      val sft = SimpleFeatureTypes.createType("test", "geom:Point:srid=4326")
      val bbox = FastFilterFactory.toFilter(sft, "bbox(geom, -179, -89, 179, 89)")
      bbox.asInstanceOf[BBOX].getExpression1 must beAnInstanceOf[FastPropertyName]
    }
    "create sequential OR filter" >> {
      val sft = SimpleFeatureTypes.createType("test", "name:String,*geom:Point:srid=4326")
      val or = FastFilterFactory.toFilter(sft, "name = 'foo' OR name = 'bar' OR name = 'baz'")
      or must beAnInstanceOf[OrSequentialEquality]
      foreach(Seq("foo", "bar", "baz")) { name =>
        or.evaluate(ScalaSimpleFeature.create(sft, "1", name, "POINT (45 55)")) must beTrue
      }
      foreach(Seq("blu", "qux")) { name =>
        or.evaluate(ScalaSimpleFeature.create(sft, "1", name, "POINT (45 55)")) must beFalse
      }
    }
    "create hash OR filter for > 4 values" >> {
      val sft = SimpleFeatureTypes.createType("test", "name:String,*geom:Point:srid=4326")
      val or = FastFilterFactory.toFilter(sft, "name = 'foo' OR name = 'bar' OR name = 'baz' OR name = 'foo2' " +
          "OR name = 'bar2' OR name = 'baz2' OR name = 'foo3'")
      or must beAnInstanceOf[OrHashEquality]
      foreach(Seq("foo", "bar", "baz", "foo2", "bar2", "baz2", "foo3")) { name =>
        or.evaluate(ScalaSimpleFeature.create(sft, "1", name, "POINT (45 55)")) must beTrue
      }
      foreach(Seq("blu", "qux")) { name =>
        or.evaluate(ScalaSimpleFeature.create(sft, "1", name, "POINT (45 55)")) must beFalse
      }
    }
    "fall back to standard OR filters" >> {
      val sft = SimpleFeatureTypes.createType("test", "name:String,*geom:Point:srid=4326")
      val or = FastFilterFactory.toFilter(sft, "name = 'foo' OR name = 'bar' OR bbox(geom,-120,45,-115,50)")
      or must not(beAnInstanceOf[OrHashEquality])
      or must not(beAnInstanceOf[OrSequentialEquality])
      foreach(Seq("foo", "bar")) { name =>
        or.evaluate(ScalaSimpleFeature.create(sft, "1", name, "POINT (45 55)")) must beTrue
      }
      foreach(Seq("blu", "qux")) { name =>
        or.evaluate(ScalaSimpleFeature.create(sft, "1", name, "POINT (45 55)")) must beFalse
      }
    }
    "kick out bad filters from optimize" >> {
      val sft = SimpleFeatureTypes.createType("test", "name:String,*geom:Point:srid=4326")
      FastFilterFactory.toFilter(sft, "name ilike '%abc\\'") must throwA[IllegalArgumentException]
      FastFilterFactory.toFilter(sft, "name like '%abc\\'") must throwA[IllegalArgumentException]
      ok
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
<<<<<<< HEAD
<<<<<<< HEAD
<<<<<<< HEAD
<<<<<<< HEAD
<<<<<<< HEAD
<<<<<<< HEAD
<<<<<<< HEAD
<<<<<<< HEAD
<<<<<<< HEAD
<<<<<<< HEAD
<<<<<<< HEAD
<<<<<<< HEAD
<<<<<<< HEAD
<<<<<<< HEAD
<<<<<<< HEAD
<<<<<<< HEAD
<<<<<<< HEAD
<<<<<<< HEAD
<<<<<<< HEAD
<<<<<<< HEAD
<<<<<<< HEAD
<<<<<<< HEAD
<<<<<<< HEAD
<<<<<<< HEAD
<<<<<<< HEAD
<<<<<<< HEAD
<<<<<<< HEAD
<<<<<<< HEAD
<<<<<<< HEAD
<<<<<<< HEAD
<<<<<<< HEAD
<<<<<<< HEAD
<<<<<<< HEAD
<<<<<<< HEAD
<<<<<<< HEAD
<<<<<<< HEAD
<<<<<<< HEAD
<<<<<<< HEAD
<<<<<<< HEAD
<<<<<<< HEAD
<<<<<<< HEAD
<<<<<<< HEAD
<<<<<<< HEAD
<<<<<<< HEAD
<<<<<<< HEAD
<<<<<<< HEAD
<<<<<<< HEAD
<<<<<<< HEAD
<<<<<<< HEAD
<<<<<<< HEAD
<<<<<<< HEAD
<<<<<<< HEAD
<<<<<<< HEAD
<<<<<<< HEAD
<<<<<<< HEAD
<<<<<<< HEAD
<<<<<<< HEAD
<<<<<<< HEAD
<<<<<<< HEAD
<<<<<<< HEAD
<<<<<<< HEAD
<<<<<<< HEAD
<<<<<<< HEAD
<<<<<<< HEAD
<<<<<<< HEAD
<<<<<<< HEAD
<<<<<<< HEAD
<<<<<<< HEAD
<<<<<<< HEAD
<<<<<<< HEAD
<<<<<<< HEAD
<<<<<<< HEAD
<<<<<<< HEAD
<<<<<<< HEAD
<<<<<<< HEAD
<<<<<<< HEAD
<<<<<<< HEAD
<<<<<<< HEAD
<<<<<<< HEAD
<<<<<<< HEAD
<<<<<<< HEAD
<<<<<<< HEAD
<<<<<<< HEAD
<<<<<<< HEAD
<<<<<<< HEAD
<<<<<<< HEAD
<<<<<<< HEAD
<<<<<<< HEAD
<<<<<<< HEAD
<<<<<<< HEAD
<<<<<<< HEAD
<<<<<<< HEAD
<<<<<<< HEAD
<<<<<<< HEAD
<<<<<<< HEAD
<<<<<<< HEAD
<<<<<<< HEAD
<<<<<<< HEAD
<<<<<<< HEAD
<<<<<<< HEAD
<<<<<<< HEAD
<<<<<<< HEAD
<<<<<<< HEAD
<<<<<<< HEAD
<<<<<<< HEAD
<<<<<<< HEAD
<<<<<<< HEAD
<<<<<<< HEAD
<<<<<<< HEAD
<<<<<<< HEAD
<<<<<<< HEAD
<<<<<<< HEAD
<<<<<<< HEAD
<<<<<<< HEAD
<<<<<<< HEAD
<<<<<<< HEAD
<<<<<<< HEAD
<<<<<<< HEAD
<<<<<<< HEAD
<<<<<<< HEAD
<<<<<<< HEAD
<<<<<<< HEAD
<<<<<<< HEAD
<<<<<<< HEAD
<<<<<<< HEAD
<<<<<<< HEAD
<<<<<<< HEAD
<<<<<<< HEAD
<<<<<<< HEAD
<<<<<<< HEAD
<<<<<<< HEAD
<<<<<<< HEAD
<<<<<<< HEAD
<<<<<<< HEAD
<<<<<<< HEAD
<<<<<<< HEAD
<<<<<<< HEAD
<<<<<<< HEAD
<<<<<<< HEAD
<<<<<<< HEAD
<<<<<<< HEAD
<<<<<<< HEAD
<<<<<<< HEAD
<<<<<<< HEAD
<<<<<<< HEAD
<<<<<<< HEAD
<<<<<<< HEAD
<<<<<<< HEAD
<<<<<<< HEAD
<<<<<<< HEAD
<<<<<<< HEAD
<<<<<<< HEAD
<<<<<<< HEAD
<<<<<<< HEAD
<<<<<<< HEAD
<<<<<<< HEAD
<<<<<<< HEAD
<<<<<<< HEAD
<<<<<<< HEAD
<<<<<<< HEAD
<<<<<<< HEAD
<<<<<<< HEAD
<<<<<<< HEAD
<<<<<<< HEAD
<<<<<<< HEAD
<<<<<<< HEAD
<<<<<<< HEAD
<<<<<<< HEAD
<<<<<<< HEAD
<<<<<<< HEAD
<<<<<<< HEAD
<<<<<<< HEAD
<<<<<<< HEAD
<<<<<<< HEAD
<<<<<<< HEAD
<<<<<<< HEAD
<<<<<<< HEAD
<<<<<<< HEAD
<<<<<<< HEAD
<<<<<<< HEAD
<<<<<<< HEAD
<<<<<<< HEAD
<<<<<<< HEAD
<<<<<<< HEAD
<<<<<<< HEAD
<<<<<<< HEAD
<<<<<<< HEAD
<<<<<<< HEAD
<<<<<<< HEAD
<<<<<<< HEAD
<<<<<<< HEAD
<<<<<<< HEAD
<<<<<<< HEAD
<<<<<<< HEAD
<<<<<<< HEAD
<<<<<<< HEAD
<<<<<<< HEAD
<<<<<<< HEAD
<<<<<<< HEAD
<<<<<<< HEAD
<<<<<<< HEAD
<<<<<<< HEAD
<<<<<<< HEAD
<<<<<<< HEAD
<<<<<<< HEAD
<<<<<<< HEAD
<<<<<<< HEAD
<<<<<<< HEAD
<<<<<<< HEAD
<<<<<<< HEAD
<<<<<<< HEAD
<<<<<<< HEAD
<<<<<<< HEAD
<<<<<<< HEAD
<<<<<<< HEAD
<<<<<<< HEAD
<<<<<<< HEAD
<<<<<<< HEAD
<<<<<<< HEAD
<<<<<<< HEAD
<<<<<<< HEAD
<<<<<<< HEAD
<<<<<<< HEAD
<<<<<<< HEAD
<<<<<<< HEAD
<<<<<<< HEAD
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
>>>>>>> 043f2d0167 (GEOMESA-3067 Find attribute in Filters with Functions with embedded expressions correctly)
=======
>>>>>>> ac217b392d (GEOMESA-3061 Converters - support bytes in Avro top-level union types (#2762))
=======
>>>>>>> a6693cb0ba (GEOMESA-3067 Find attribute in Filters with Functions with embedded expressions correctly)
=======
>>>>>>> e7d6b701c8 (GEOMESA-3061 Converters - support bytes in Avro top-level union types (#2762))
=======
>>>>>>> 70f2c62b7e (GEOMESA-3067 Find attribute in Filters with Functions with embedded expressions correctly)
=======
>>>>>>> 95e52e061e (GEOMESA-3061 Converters - support bytes in Avro top-level union types (#2762))
=======
>>>>>>> 424e7de15a (GEOMESA-3067 Find attribute in Filters with Functions with embedded expressions correctly)
=======
>>>>>>> 988874c83e (GEOMESA-3061 Converters - support bytes in Avro top-level union types (#2762))
=======
>>>>>>> 87dddefcd8 (GEOMESA-3067 Find attribute in Filters with Functions with embedded expressions correctly)
=======
>>>>>>> aea9fbe131 (GEOMESA-3061 Converters - support bytes in Avro top-level union types (#2762))
=======
>>>>>>> d581fa3e8f (Merge branch 'feature/postgis-fixes')
=======
>>>>>>> ca1e0fad13 (GEOMESA-3067 Find attribute in Filters with Functions with embedded expressions correctly)
=======
>>>>>>> 5a55bf9756 (GEOMESA-3061 Converters - support bytes in Avro top-level union types (#2762))
=======
>>>>>>> adfec3a47a (GEOMESA-3067 Find attribute in Filters with Functions with embedded expressions correctly)
=======
>>>>>>> e0c2527549 (GEOMESA-3061 Converters - support bytes in Avro top-level union types (#2762))
=======
>>>>>>> 4cf1d8d259 (GEOMESA-3067 Find attribute in Filters with Functions with embedded expressions correctly)
=======
>>>>>>> cb5e2daf2b (GEOMESA-3061 Converters - support bytes in Avro top-level union types (#2762))
=======
>>>>>>> 9bcad1eb67 (GEOMESA-3067 Find attribute in Filters with Functions with embedded expressions correctly)
=======
>>>>>>> 00e61f4b70 (GEOMESA-3061 Converters - support bytes in Avro top-level union types (#2762))
=======
>>>>>>> 9a4568fbda (GEOMESA-3067 Find attribute in Filters with Functions with embedded expressions correctly)
=======
>>>>>>> 4864cfc581 (GEOMESA-3061 Converters - support bytes in Avro top-level union types (#2762))
=======
>>>>>>> 264c9fa240 (Merge branch 'feature/postgis-fixes')
=======
>>>>>>> c738f63bd9 (GEOMESA-3254 Add Bloop build support)
=======
>>>>>>> 7213a78a3a (GEOMESA-3067 Find attribute in Filters with Functions with embedded expressions correctly)
=======
>>>>>>> 3676d4e56a (GEOMESA-3061 Converters - support bytes in Avro top-level union types (#2762))
=======
>>>>>>> e8ce815f1b (GEOMESA-3067 Find attribute in Filters with Functions with embedded expressions correctly)
=======
>>>>>>> 60b4637548 (GEOMESA-3061 Converters - support bytes in Avro top-level union types (#2762))
=======
>>>>>>> 6f81d40992 (GEOMESA-3067 Find attribute in Filters with Functions with embedded expressions correctly)
=======
>>>>>>> 009a284072 (GEOMESA-3061 Converters - support bytes in Avro top-level union types (#2762))
=======
>>>>>>> 9df4f8a9f6 (GEOMESA-3067 Find attribute in Filters with Functions with embedded expressions correctly)
=======
>>>>>>> 7b8c8dcc3d (GEOMESA-3061 Converters - support bytes in Avro top-level union types (#2762))
=======
>>>>>>> 79cd5cb606 (GEOMESA-3067 Find attribute in Filters with Functions with embedded expressions correctly)
=======
>>>>>>> c029a43a6c (GEOMESA-3061 Converters - support bytes in Avro top-level union types (#2762))
=======
>>>>>>> 217b7d1cb9 (Merge branch 'feature/postgis-fixes')
=======
>>>>>>> a5b0374ee2 (GEOMESA-3061 Converters - support bytes in Avro top-level union types (#2762))
=======
>>>>>>> 4f51687745 (GEOMESA-3061 Converters - support bytes in Avro top-level union types (#2762))
=======
>>>>>>> 9a2d40c613 (GEOMESA-3061 Converters - support bytes in Avro top-level union types (#2762))
=======
>>>>>>> 73770612e0 (GEOMESA-3061 Converters - support bytes in Avro top-level union types (#2762))
=======
>>>>>>> 6c83981af3 (GEOMESA-3061 Converters - support bytes in Avro top-level union types (#2762))
=======
=======
>>>>>>> f302a54949 (GEOMESA-3061 Converters - support bytes in Avro top-level union types (#2762))
=======
>>>>>>> a83fe4cf7c (GEOMESA-3067 Find attribute in Filters with Functions with embedded expressions correctly)
=======
>>>>>>> a788dfac03 (GEOMESA-3061 Converters - support bytes in Avro top-level union types (#2762))
=======
>>>>>>> da00c7bd68 (Merge branch 'feature/postgis-fixes')
=======
>>>>>>> a63cb7e74 (GEOMESA-3067 Find attribute in Filters with Functions with embedded expressions correctly)
>>>>>>> 125ffd0575 (GEOMESA-3067 Find attribute in Filters with Functions with embedded expressions correctly)
=======
>>>>>>> f110463a26 (GEOMESA-3061 Converters - support bytes in Avro top-level union types (#2762))
=======
=======
>>>>>>> 86ec77f9cb (GEOMESA-3061 Converters - support bytes in Avro top-level union types (#2762))
=======
>>>>>>> 17883cb601 (GEOMESA-3067 Find attribute in Filters with Functions with embedded expressions correctly)
=======
>>>>>>> 1bcc513539 (GEOMESA-3061 Converters - support bytes in Avro top-level union types (#2762))
=======
>>>>>>> ec6d06b576 (Merge branch 'feature/postgis-fixes')
=======
=======
>>>>>>> f302a54949 (GEOMESA-3061 Converters - support bytes in Avro top-level union types (#2762))
=======
>>>>>>> a83fe4cf7c (GEOMESA-3067 Find attribute in Filters with Functions with embedded expressions correctly)
=======
>>>>>>> a788dfac03 (GEOMESA-3061 Converters - support bytes in Avro top-level union types (#2762))
=======
>>>>>>> da00c7bd68 (Merge branch 'feature/postgis-fixes')
=======
>>>>>>> a63cb7e74 (GEOMESA-3067 Find attribute in Filters with Functions with embedded expressions correctly)
>>>>>>> 125ffd0575 (GEOMESA-3067 Find attribute in Filters with Functions with embedded expressions correctly)
>>>>>>> d83561962d (GEOMESA-3067 Find attribute in Filters with Functions with embedded expressions correctly)
=======
>>>>>>> c22ecd64c3 (GEOMESA-3061 Converters - support bytes in Avro top-level union types (#2762))
=======
=======
>>>>>>> 2a887f75bf (GEOMESA-3061 Converters - support bytes in Avro top-level union types (#2762))
=======
>>>>>>> 08a743b61d (GEOMESA-3067 Find attribute in Filters with Functions with embedded expressions correctly)
=======
>>>>>>> b08cb4d818 (GEOMESA-3061 Converters - support bytes in Avro top-level union types (#2762))
=======
>>>>>>> 354b5e5ae5 (Merge branch 'feature/postgis-fixes')
=======
=======
>>>>>>> f302a54949 (GEOMESA-3061 Converters - support bytes in Avro top-level union types (#2762))
=======
>>>>>>> a83fe4cf7c (GEOMESA-3067 Find attribute in Filters with Functions with embedded expressions correctly)
=======
>>>>>>> a788dfac03 (GEOMESA-3061 Converters - support bytes in Avro top-level union types (#2762))
=======
>>>>>>> da00c7bd68 (Merge branch 'feature/postgis-fixes')
=======
>>>>>>> a63cb7e74 (GEOMESA-3067 Find attribute in Filters with Functions with embedded expressions correctly)
>>>>>>> 125ffd0575 (GEOMESA-3067 Find attribute in Filters with Functions with embedded expressions correctly)
>>>>>>> 6e297b9b6f (GEOMESA-3067 Find attribute in Filters with Functions with embedded expressions correctly)
=======
>>>>>>> 4c361f07da (GEOMESA-3061 Converters - support bytes in Avro top-level union types (#2762))
=======
>>>>>>> 20f6826d0f (GEOMESA-3067 Find attribute in Filters with Functions with embedded expressions correctly)
=======
>>>>>>> a1d28116d4 (GEOMESA-3067 Find attribute in Filters with Functions with embedded expressions correctly)
=======
<<<<<<< HEAD
<<<<<<< HEAD
>>>>>>> d1fa26b39d (GEOMESA-3061 Converters - support bytes in Avro top-level union types (#2762))
=======
>>>>>>> ef55408e9a (GEOMESA-3067 Find attribute in Filters with Functions with embedded expressions correctly)
=======
<<<<<<< HEAD
<<<<<<< HEAD
>>>>>>> f67dd3371e (GEOMESA-3061 Converters - support bytes in Avro top-level union types (#2762))
=======
>>>>>>> a9884ff1f6 (GEOMESA-3067 Find attribute in Filters with Functions with embedded expressions correctly)
=======
<<<<<<< HEAD
<<<<<<< HEAD
>>>>>>> f7cef54062 (GEOMESA-3061 Converters - support bytes in Avro top-level union types (#2762))
=======
>>>>>>> 49f2a1c310 (GEOMESA-3067 Find attribute in Filters with Functions with embedded expressions correctly)
=======
<<<<<<< HEAD
<<<<<<< HEAD
>>>>>>> a16b64a4d1 (GEOMESA-3061 Converters - support bytes in Avro top-level union types (#2762))
=======
>>>>>>> 34472778d3 (Merge branch 'feature/postgis-fixes')
=======
<<<<<<< HEAD
<<<<<<< HEAD
>>>>>>> 5430d59024 (GEOMESA-3067 Find attribute in Filters with Functions with embedded expressions correctly)
=======
>>>>>>> 810876750d (GEOMESA-3061 Converters - support bytes in Avro top-level union types (#2762))
=======
<<<<<<< HEAD
<<<<<<< HEAD
>>>>>>> 2571e49519 (GEOMESA-3067 Find attribute in Filters with Functions with embedded expressions correctly)
=======
>>>>>>> d206a68a13 (GEOMESA-3061 Converters - support bytes in Avro top-level union types (#2762))
=======
<<<<<<< HEAD
<<<<<<< HEAD
>>>>>>> 9412e85b59 (GEOMESA-3067 Find attribute in Filters with Functions with embedded expressions correctly)
=======
>>>>>>> 694bcd3776 (GEOMESA-3061 Converters - support bytes in Avro top-level union types (#2762))
=======
<<<<<<< HEAD
<<<<<<< HEAD
>>>>>>> 24c4df93a5 (GEOMESA-3067 Find attribute in Filters with Functions with embedded expressions correctly)
=======
>>>>>>> 6cd1151639 (GEOMESA-3061 Converters - support bytes in Avro top-level union types (#2762))
=======
<<<<<<< HEAD
<<<<<<< HEAD
>>>>>>> 1e00950a90 (GEOMESA-3067 Find attribute in Filters with Functions with embedded expressions correctly)
=======
>>>>>>> 1973f72e77 (GEOMESA-3061 Converters - support bytes in Avro top-level union types (#2762))
=======
<<<<<<< HEAD
<<<<<<< HEAD
>>>>>>> 42e8565e9b (Merge branch 'feature/postgis-fixes')
=======
>>>>>>> f1532f2313 (GEOMESA-3254 Add Bloop build support)
=======
<<<<<<< HEAD
<<<<<<< HEAD
>>>>>>> 4bbf97686c (GEOMESA-3067 Find attribute in Filters with Functions with embedded expressions correctly)
=======
>>>>>>> 96d5d442fa (GEOMESA-3061 Converters - support bytes in Avro top-level union types (#2762))
=======
<<<<<<< HEAD
<<<<<<< HEAD
>>>>>>> b3dd8ec805 (GEOMESA-3067 Find attribute in Filters with Functions with embedded expressions correctly)
=======
>>>>>>> 5dcf23da52 (GEOMESA-3061 Converters - support bytes in Avro top-level union types (#2762))
=======
<<<<<<< HEAD
<<<<<<< HEAD
>>>>>>> 2b62d1f3fe (GEOMESA-3067 Find attribute in Filters with Functions with embedded expressions correctly)
=======
>>>>>>> 92674ff9d4 (GEOMESA-3061 Converters - support bytes in Avro top-level union types (#2762))
=======
<<<<<<< HEAD
<<<<<<< HEAD
>>>>>>> c169cb2905 (GEOMESA-3067 Find attribute in Filters with Functions with embedded expressions correctly)
=======
>>>>>>> 9a4dff9e4f (GEOMESA-3061 Converters - support bytes in Avro top-level union types (#2762))
=======
<<<<<<< HEAD
<<<<<<< HEAD
>>>>>>> 63ca73533e (GEOMESA-3067 Find attribute in Filters with Functions with embedded expressions correctly)
=======
>>>>>>> 0fc6650ecf (GEOMESA-3061 Converters - support bytes in Avro top-level union types (#2762))
=======
<<<<<<< HEAD
<<<<<<< HEAD
>>>>>>> 67de3c3202 (Merge branch 'feature/postgis-fixes')
=======
>>>>>>> 1bb69524c2 (GEOMESA-3061 Converters - support bytes in Avro top-level union types (#2762))
=======
<<<<<<< HEAD
<<<<<<< HEAD
>>>>>>> 8c9ca1211a (GEOMESA-3061 Converters - support bytes in Avro top-level union types (#2762))
=======
>>>>>>> a22efb4d66 (GEOMESA-3061 Converters - support bytes in Avro top-level union types (#2762))
=======
<<<<<<< HEAD
<<<<<<< HEAD
>>>>>>> 1cad375176 (GEOMESA-3061 Converters - support bytes in Avro top-level union types (#2762))
=======
>>>>>>> 1e39c0c27d (GEOMESA-3061 Converters - support bytes in Avro top-level union types (#2762))
=======
<<<<<<< HEAD
>>>>>>> 638b68d081 (Merge branch 'feature/postgis-fixes')
=======
>>>>>>> a990cf104e (GEOMESA-3067 Find attribute in Filters with Functions with embedded expressions correctly)
=======
>>>>>>> a1f15598cb (GEOMESA-3061 Converters - support bytes in Avro top-level union types (#2762))
=======
>>>>>>> 4373c901b3 (GEOMESA-3067 Find attribute in Filters with Functions with embedded expressions correctly)
=======
>>>>>>> 963feec660 (GEOMESA-3061 Converters - support bytes in Avro top-level union types (#2762))
=======
>>>>>>> 2c14568a23 (GEOMESA-3067 Find attribute in Filters with Functions with embedded expressions correctly)
=======
>>>>>>> 84ac051f28 (GEOMESA-3061 Converters - support bytes in Avro top-level union types (#2762))
=======
>>>>>>> 99acaa0887 (GEOMESA-3067 Find attribute in Filters with Functions with embedded expressions correctly)
=======
>>>>>>> fe3de10f11 (GEOMESA-3061 Converters - support bytes in Avro top-level union types (#2762))
=======
>>>>>>> 21deff19fd (GEOMESA-3067 Find attribute in Filters with Functions with embedded expressions correctly)
=======
>>>>>>> d0785cf307 (GEOMESA-3061 Converters - support bytes in Avro top-level union types (#2762))
=======
>>>>>>> 71adb695c5 (Merge branch 'feature/postgis-fixes')
=======
>>>>>>> 5a4c24e020 (GEOMESA-3254 Add Bloop build support)
=======
>>>>>>> 53900605ca (GEOMESA-3067 Find attribute in Filters with Functions with embedded expressions correctly)
=======
>>>>>>> a52e4429be (GEOMESA-3061 Converters - support bytes in Avro top-level union types (#2762))
=======
>>>>>>> 5f01e2c4fc (GEOMESA-3067 Find attribute in Filters with Functions with embedded expressions correctly)
=======
>>>>>>> 5c6b9f1f8b (GEOMESA-3061 Converters - support bytes in Avro top-level union types (#2762))
=======
>>>>>>> 511bd92a86 (GEOMESA-3067 Find attribute in Filters with Functions with embedded expressions correctly)
=======
>>>>>>> 9d44ff473d (GEOMESA-3061 Converters - support bytes in Avro top-level union types (#2762))
=======
>>>>>>> bff2bdde04 (GEOMESA-3067 Find attribute in Filters with Functions with embedded expressions correctly)
=======
>>>>>>> a35efac12e (GEOMESA-3061 Converters - support bytes in Avro top-level union types (#2762))
=======
>>>>>>> 323528580f (GEOMESA-3067 Find attribute in Filters with Functions with embedded expressions correctly)
=======
>>>>>>> fd5565dfba (GEOMESA-3061 Converters - support bytes in Avro top-level union types (#2762))
=======
>>>>>>> 30559ea5c9 (Merge branch 'feature/postgis-fixes')
=======
>>>>>>> 78fe4921a6 (GEOMESA-3067 Find attribute in Filters with Functions with embedded expressions correctly)
=======
>>>>>>> 0104fb37e4 (GEOMESA-3061 Converters - support bytes in Avro top-level union types (#2762))
=======
>>>>>>> 530b057384 (GEOMESA-3067 Find attribute in Filters with Functions with embedded expressions correctly)
=======
>>>>>>> 2654d9c120 (GEOMESA-3061 Converters - support bytes in Avro top-level union types (#2762))
=======
=======
>>>>>>> 20f6826d0f (GEOMESA-3067 Find attribute in Filters with Functions with embedded expressions correctly)
>>>>>>> de7d6ef448 (GEOMESA-3067 Find attribute in Filters with Functions with embedded expressions correctly)
=======
>>>>>>> efb6723f42 (GEOMESA-3067 Find attribute in Filters with Functions with embedded expressions correctly)
=======
>>>>>>> 7bdbfa5524 (GEOMESA-3061 Converters - support bytes in Avro top-level union types (#2762))
=======
>>>>>>> 17b189175b (GEOMESA-3067 Find attribute in Filters with Functions with embedded expressions correctly)
=======
>>>>>>> 7bff4d0018 (GEOMESA-3061 Converters - support bytes in Avro top-level union types (#2762))
=======
>>>>>>> 657a38673a (GEOMESA-3067 Find attribute in Filters with Functions with embedded expressions correctly)
=======
>>>>>>> e8b736ee96 (GEOMESA-3061 Converters - support bytes in Avro top-level union types (#2762))
=======
>>>>>>> e31a4215c4 (GEOMESA-3067 Find attribute in Filters with Functions with embedded expressions correctly)
=======
>>>>>>> 0efbfe547e (GEOMESA-3061 Converters - support bytes in Avro top-level union types (#2762))
=======
>>>>>>> 4c41429da9 (Merge branch 'feature/postgis-fixes')
=======
>>>>>>> ca13f8551e (GEOMESA-3067 Find attribute in Filters with Functions with embedded expressions correctly)
=======
>>>>>>> d498bef1ce (GEOMESA-3061 Converters - support bytes in Avro top-level union types (#2762))
=======
>>>>>>> cd4422a10c (GEOMESA-3067 Find attribute in Filters with Functions with embedded expressions correctly)
=======
>>>>>>> a5b160f47b (GEOMESA-3061 Converters - support bytes in Avro top-level union types (#2762))
=======
>>>>>>> fa429c7863 (GEOMESA-3067 Find attribute in Filters with Functions with embedded expressions correctly)
=======
>>>>>>> 5cf31d21f3 (GEOMESA-3061 Converters - support bytes in Avro top-level union types (#2762))
=======
>>>>>>> def2794bb5 (GEOMESA-3067 Find attribute in Filters with Functions with embedded expressions correctly)
=======
>>>>>>> 94fecee1d8 (GEOMESA-3061 Converters - support bytes in Avro top-level union types (#2762))
=======
>>>>>>> f8d3d445c0 (GEOMESA-3067 Find attribute in Filters with Functions with embedded expressions correctly)
=======
>>>>>>> 4599715c51 (d)
=======
>>>>>>> 6e0709aba8 (Merge branch 'feature/postgis-fixes')
=======
>>>>>>> 7a84c9d22d (GEOMESA-3254 Add Bloop build support)
=======
>>>>>>> bad8172e9b (GEOMESA-3067 Find attribute in Filters with Functions with embedded expressions correctly)
=======
>>>>>>> 7fbbd56493 (GEOMESA-3061 Converters - support bytes in Avro top-level union types (#2762))
=======
>>>>>>> e582c3ecfe (GEOMESA-3067 Find attribute in Filters with Functions with embedded expressions correctly)
=======
>>>>>>> 3eb12f79a9 (GEOMESA-3061 Converters - support bytes in Avro top-level union types (#2762))
=======
>>>>>>> 8b16ac5c65 (GEOMESA-3067 Find attribute in Filters with Functions with embedded expressions correctly)
=======
>>>>>>> 4ccd6f6b1f (GEOMESA-3061 Converters - support bytes in Avro top-level union types (#2762))
=======
>>>>>>> f983ea29f0 (GEOMESA-3067 Find attribute in Filters with Functions with embedded expressions correctly)
=======
>>>>>>> 35b69b8f2f (GEOMESA-3061 Converters - support bytes in Avro top-level union types (#2762))
=======
>>>>>>> da4e2905b4 (GEOMESA-3067 Find attribute in Filters with Functions with embedded expressions correctly)
=======
>>>>>>> db8a3a22b2 (GEOMESA-3061 Converters - support bytes in Avro top-level union types (#2762))
=======
>>>>>>> ed25decdd5 (Merge branch 'feature/postgis-fixes')
=======
>>>>>>> 27afb28ab6 (GEOMESA-3061 Converters - support bytes in Avro top-level union types (#2762))
=======
>>>>>>> 26a09ee6c2 (GEOMESA-3061 Converters - support bytes in Avro top-level union types (#2762))
=======
>>>>>>> 194ad4e5c0 (GEOMESA-3061 Converters - support bytes in Avro top-level union types (#2762))
=======
>>>>>>> 7b3c90c53f (GEOMESA-3061 Converters - support bytes in Avro top-level union types (#2762))
=======
>>>>>>> db9dfb6f14 (GEOMESA-3061 Converters - support bytes in Avro top-level union types (#2762))
=======
>>>>>>> f893d9a594 (Merge branch 'feature/postgis-fixes')
=======
>>>>>>> f33d55e2ba (GEOMESA-3067 Find attribute in Filters with Functions with embedded expressions correctly)
=======
>>>>>>> b8ebbf6083 (GEOMESA-3061 Converters - support bytes in Avro top-level union types (#2762))
=======
>>>>>>> 1278241911 (GEOMESA-3067 Find attribute in Filters with Functions with embedded expressions correctly)
=======
>>>>>>> 3e7fb62639 (GEOMESA-3061 Converters - support bytes in Avro top-level union types (#2762))
=======
>>>>>>> 00d66ae013 (GEOMESA-3067 Find attribute in Filters with Functions with embedded expressions correctly)
=======
>>>>>>> c2cfc968d2 (GEOMESA-3061 Converters - support bytes in Avro top-level union types (#2762))
=======
>>>>>>> 5d8dab9f81 (GEOMESA-3067 Find attribute in Filters with Functions with embedded expressions correctly)
=======
>>>>>>> 0fa73844a1 (GEOMESA-3061 Converters - support bytes in Avro top-level union types (#2762))
=======
>>>>>>> 1ef95979ee (GEOMESA-3067 Find attribute in Filters with Functions with embedded expressions correctly)
=======
>>>>>>> 63546aacdc (GEOMESA-3061 Converters - support bytes in Avro top-level union types (#2762))
=======
>>>>>>> 964e86145a (Merge branch 'feature/postgis-fixes')
=======
>>>>>>> b298e017f1 (GEOMESA-3254 Add Bloop build support)
=======
>>>>>>> 72b96c5c3e (GEOMESA-3067 Find attribute in Filters with Functions with embedded expressions correctly)
=======
>>>>>>> 1ea8b10ac7 (GEOMESA-3061 Converters - support bytes in Avro top-level union types (#2762))
=======
>>>>>>> e72b998c12 (GEOMESA-3067 Find attribute in Filters with Functions with embedded expressions correctly)
=======
>>>>>>> b800c052cc (GEOMESA-3061 Converters - support bytes in Avro top-level union types (#2762))
=======
>>>>>>> 8e70a881a6 (GEOMESA-3067 Find attribute in Filters with Functions with embedded expressions correctly)
=======
>>>>>>> 9dbe1503e8 (GEOMESA-3061 Converters - support bytes in Avro top-level union types (#2762))
=======
>>>>>>> 53bc726472 (GEOMESA-3067 Find attribute in Filters with Functions with embedded expressions correctly)
=======
>>>>>>> 6e30236dd2 (GEOMESA-3061 Converters - support bytes in Avro top-level union types (#2762))
=======
>>>>>>> 3261561062 (GEOMESA-3067 Find attribute in Filters with Functions with embedded expressions correctly)
=======
>>>>>>> dbd932fed6 (GEOMESA-3061 Converters - support bytes in Avro top-level union types (#2762))
=======
>>>>>>> bf6bde0830 (Merge branch 'feature/postgis-fixes')
=======
>>>>>>> 5b9d5ada1b (GEOMESA-3067 Find attribute in Filters with Functions with embedded expressions correctly)
=======
>>>>>>> 9293965a7d (GEOMESA-3061 Converters - support bytes in Avro top-level union types (#2762))
=======
>>>>>>> 67dc71ffb1 (GEOMESA-3067 Find attribute in Filters with Functions with embedded expressions correctly)
=======
>>>>>>> 058fd96baa (GEOMESA-3061 Converters - support bytes in Avro top-level union types (#2762))
=======
=======
>>>>>>> 20f6826d0f (GEOMESA-3067 Find attribute in Filters with Functions with embedded expressions correctly)
>>>>>>> f7fc21ae20 (GEOMESA-3067 Find attribute in Filters with Functions with embedded expressions correctly)
=======
=======
>>>>>>> a6693cb0ba (GEOMESA-3067 Find attribute in Filters with Functions with embedded expressions correctly)
=======
>>>>>>> d1fa26b39d (GEOMESA-3061 Converters - support bytes in Avro top-level union types (#2762))
=======
>>>>>>> e7d6b701c8 (GEOMESA-3061 Converters - support bytes in Avro top-level union types (#2762))
=======
>>>>>>> 70f2c62b7e (GEOMESA-3067 Find attribute in Filters with Functions with embedded expressions correctly)
=======
>>>>>>> f67dd3371e (GEOMESA-3061 Converters - support bytes in Avro top-level union types (#2762))
=======
>>>>>>> 95e52e061e (GEOMESA-3061 Converters - support bytes in Avro top-level union types (#2762))
=======
>>>>>>> 424e7de15a (GEOMESA-3067 Find attribute in Filters with Functions with embedded expressions correctly)
=======
>>>>>>> f7cef54062 (GEOMESA-3061 Converters - support bytes in Avro top-level union types (#2762))
=======
>>>>>>> 988874c83e (GEOMESA-3061 Converters - support bytes in Avro top-level union types (#2762))
=======
>>>>>>> 87dddefcd8 (GEOMESA-3067 Find attribute in Filters with Functions with embedded expressions correctly)
=======
>>>>>>> a16b64a4d1 (GEOMESA-3061 Converters - support bytes in Avro top-level union types (#2762))
=======
>>>>>>> aea9fbe131 (GEOMESA-3061 Converters - support bytes in Avro top-level union types (#2762))
=======
>>>>>>> d581fa3e8f (Merge branch 'feature/postgis-fixes')
=======
>>>>>>> 5430d59024 (GEOMESA-3067 Find attribute in Filters with Functions with embedded expressions correctly)
=======
>>>>>>> ca1e0fad13 (GEOMESA-3067 Find attribute in Filters with Functions with embedded expressions correctly)
=======
>>>>>>> 5a55bf9756 (GEOMESA-3061 Converters - support bytes in Avro top-level union types (#2762))
=======
>>>>>>> 2571e49519 (GEOMESA-3067 Find attribute in Filters with Functions with embedded expressions correctly)
=======
>>>>>>> adfec3a47a (GEOMESA-3067 Find attribute in Filters with Functions with embedded expressions correctly)
=======
>>>>>>> e0c2527549 (GEOMESA-3061 Converters - support bytes in Avro top-level union types (#2762))
=======
>>>>>>> 9412e85b59 (GEOMESA-3067 Find attribute in Filters with Functions with embedded expressions correctly)
=======
>>>>>>> 4cf1d8d259 (GEOMESA-3067 Find attribute in Filters with Functions with embedded expressions correctly)
=======
>>>>>>> cb5e2daf2b (GEOMESA-3061 Converters - support bytes in Avro top-level union types (#2762))
=======
>>>>>>> 24c4df93a5 (GEOMESA-3067 Find attribute in Filters with Functions with embedded expressions correctly)
=======
>>>>>>> 9bcad1eb67 (GEOMESA-3067 Find attribute in Filters with Functions with embedded expressions correctly)
=======
>>>>>>> 00e61f4b70 (GEOMESA-3061 Converters - support bytes in Avro top-level union types (#2762))
=======
>>>>>>> 1e00950a90 (GEOMESA-3067 Find attribute in Filters with Functions with embedded expressions correctly)
=======
>>>>>>> 9a4568fbda (GEOMESA-3067 Find attribute in Filters with Functions with embedded expressions correctly)
=======
>>>>>>> 4864cfc581 (GEOMESA-3061 Converters - support bytes in Avro top-level union types (#2762))
=======
>>>>>>> 42e8565e9b (Merge branch 'feature/postgis-fixes')
=======
>>>>>>> 264c9fa240 (Merge branch 'feature/postgis-fixes')
=======
>>>>>>> c738f63bd9 (GEOMESA-3254 Add Bloop build support)
=======
>>>>>>> 4bbf97686c (GEOMESA-3067 Find attribute in Filters with Functions with embedded expressions correctly)
=======
>>>>>>> 7213a78a3a (GEOMESA-3067 Find attribute in Filters with Functions with embedded expressions correctly)
=======
>>>>>>> 3676d4e56a (GEOMESA-3061 Converters - support bytes in Avro top-level union types (#2762))
=======
>>>>>>> b3dd8ec805 (GEOMESA-3067 Find attribute in Filters with Functions with embedded expressions correctly)
=======
>>>>>>> e8ce815f1b (GEOMESA-3067 Find attribute in Filters with Functions with embedded expressions correctly)
=======
>>>>>>> 60b4637548 (GEOMESA-3061 Converters - support bytes in Avro top-level union types (#2762))
=======
>>>>>>> 2b62d1f3fe (GEOMESA-3067 Find attribute in Filters with Functions with embedded expressions correctly)
=======
>>>>>>> 6f81d40992 (GEOMESA-3067 Find attribute in Filters with Functions with embedded expressions correctly)
=======
>>>>>>> 009a284072 (GEOMESA-3061 Converters - support bytes in Avro top-level union types (#2762))
=======
>>>>>>> c169cb2905 (GEOMESA-3067 Find attribute in Filters with Functions with embedded expressions correctly)
=======
>>>>>>> 9df4f8a9f6 (GEOMESA-3067 Find attribute in Filters with Functions with embedded expressions correctly)
=======
>>>>>>> 7b8c8dcc3d (GEOMESA-3061 Converters - support bytes in Avro top-level union types (#2762))
=======
>>>>>>> 63ca73533e (GEOMESA-3067 Find attribute in Filters with Functions with embedded expressions correctly)
=======
>>>>>>> 79cd5cb606 (GEOMESA-3067 Find attribute in Filters with Functions with embedded expressions correctly)
=======
>>>>>>> c029a43a6c (GEOMESA-3061 Converters - support bytes in Avro top-level union types (#2762))
=======
>>>>>>> 67de3c3202 (Merge branch 'feature/postgis-fixes')
=======
>>>>>>> 217b7d1cb9 (Merge branch 'feature/postgis-fixes')
=======
>>>>>>> a5b0374ee2 (GEOMESA-3061 Converters - support bytes in Avro top-level union types (#2762))
=======
>>>>>>> 8c9ca1211a (GEOMESA-3061 Converters - support bytes in Avro top-level union types (#2762))
=======
>>>>>>> 4f51687745 (GEOMESA-3061 Converters - support bytes in Avro top-level union types (#2762))
=======
>>>>>>> 9a2d40c613 (GEOMESA-3061 Converters - support bytes in Avro top-level union types (#2762))
=======
>>>>>>> 1cad375176 (GEOMESA-3061 Converters - support bytes in Avro top-level union types (#2762))
=======
>>>>>>> 73770612e0 (GEOMESA-3061 Converters - support bytes in Avro top-level union types (#2762))
=======
>>>>>>> 6c83981af3 (GEOMESA-3061 Converters - support bytes in Avro top-level union types (#2762))
>>>>>>> b9bdd406e3 (GEOMESA-3061 Converters - support bytes in Avro top-level union types (#2762))
=======
>>>>>>> f36b0e8b9a (GEOMESA-3067 Find attribute in Filters with Functions with embedded expressions correctly)
<<<<<<< HEAD
<<<<<<< HEAD
<<<<<<< HEAD
<<<<<<< HEAD
<<<<<<< HEAD
<<<<<<< HEAD
=======
>>>>>>> d1fa26b39d (GEOMESA-3061 Converters - support bytes in Avro top-level union types (#2762))
=======
>>>>>>> 7bdbfa5524 (GEOMESA-3061 Converters - support bytes in Avro top-level union types (#2762))
=======
>>>>>>> a6693cb0ba (GEOMESA-3067 Find attribute in Filters with Functions with embedded expressions correctly)
=======
=======
>>>>>>> d1fa26b39d (GEOMESA-3061 Converters - support bytes in Avro top-level union types (#2762))
>>>>>>> e7d6b701c8 (GEOMESA-3061 Converters - support bytes in Avro top-level union types (#2762))
=======
=======
>>>>>>> b9bdd406e (GEOMESA-3061 Converters - support bytes in Avro top-level union types (#2762))
>>>>>>> cdb4102515 (GEOMESA-3061 Converters - support bytes in Avro top-level union types (#2762))
<<<<<<< HEAD
<<<<<<< HEAD
<<<<<<< HEAD
<<<<<<< HEAD
<<<<<<< HEAD
<<<<<<< HEAD
=======
>>>>>>> e7d6b701c8 (GEOMESA-3061 Converters - support bytes in Avro top-level union types (#2762))
=======
>>>>>>> 70f2c62b7e (GEOMESA-3067 Find attribute in Filters with Functions with embedded expressions correctly)
=======
>>>>>>> e3a63fee18 (GEOMESA-3067 Find attribute in Filters with Functions with embedded expressions correctly)
=======
=======
>>>>>>> b9bdd406e (GEOMESA-3061 Converters - support bytes in Avro top-level union types (#2762))
>>>>>>> 0e68e9f4cc (GEOMESA-3061 Converters - support bytes in Avro top-level union types (#2762))
<<<<<<< HEAD
<<<<<<< HEAD
<<<<<<< HEAD
<<<<<<< HEAD
<<<<<<< HEAD
<<<<<<< HEAD
=======
>>>>>>> 95e52e061e (GEOMESA-3061 Converters - support bytes in Avro top-level union types (#2762))
=======
>>>>>>> 424e7de15a (GEOMESA-3067 Find attribute in Filters with Functions with embedded expressions correctly)
=======
=======
>>>>>>> 67b361c856 (GEOMESA-3061 Converters - support bytes in Avro top-level union types (#2762))
=======
>>>>>>> 9d708b240a (GEOMESA-3061 Converters - support bytes in Avro top-level union types (#2762))
=======
<<<<<<< HEAD
<<<<<<< HEAD
<<<<<<< HEAD
<<<<<<< HEAD
<<<<<<< HEAD
<<<<<<< HEAD
=======
>>>>>>> e0c2527549 (GEOMESA-3061 Converters - support bytes in Avro top-level union types (#2762))
=======
>>>>>>> 4cf1d8d259 (GEOMESA-3067 Find attribute in Filters with Functions with embedded expressions correctly)
>>>>>>> 3333975e77 (GEOMESA-3067 Find attribute in Filters with Functions with embedded expressions correctly)
=======
>>>>>>> 76618c8da3 (GEOMESA-3061 Converters - support bytes in Avro top-level union types (#2762))
=======
<<<<<<< HEAD
<<<<<<< HEAD
<<<<<<< HEAD
<<<<<<< HEAD
<<<<<<< HEAD
<<<<<<< HEAD
=======
>>>>>>> c8a325e13c (GEOMESA-3061 Converters - support bytes in Avro top-level union types (#2762))
=======
>>>>>>> 9638dc731e (GEOMESA-3067 Find attribute in Filters with Functions with embedded expressions correctly)
=======
>>>>>>> 97ec7d864a (GEOMESA-3061 Converters - support bytes in Avro top-level union types (#2762))
=======
>>>>>>> db8d998aa2 (Merge branch 'feature/postgis-fixes')
=======
>>>>>>> ad3cedc4db (GEOMESA-3061 Converters - support bytes in Avro top-level union types (#2762))
=======
>>>>>>> bc49131942 (GEOMESA-3067 Find attribute in Filters with Functions with embedded expressions correctly)
=======
>>>>>>> bdbced26d4 (GEOMESA-3061 Converters - support bytes in Avro top-level union types (#2762))
=======
>>>>>>> 1b25d7ddb4 (Merge branch 'feature/postgis-fixes')
=======
>>>>>>> 0dbede148d (GEOMESA-3061 Converters - support bytes in Avro top-level union types (#2762))
=======
>>>>>>> 22dcc8170f (GEOMESA-3061 Converters - support bytes in Avro top-level union types (#2762))
=======
>>>>>>> b009fd23f4 (GEOMESA-3061 Converters - support bytes in Avro top-level union types (#2762))
=======
=======
>>>>>>> bc4062951d (GEOMESA-3061 Converters - support bytes in Avro top-level union types (#2762))
=======
>>>>>>> e944f1c88b (Merge branch 'feature/postgis-fixes')
=======
>>>>>>> deb8fd68de (GEOMESA-3067 Find attribute in Filters with Functions with embedded expressions correctly)
=======
>>>>>>> 8adfab65bb (GEOMESA-3061 Converters - support bytes in Avro top-level union types (#2762))
=======
>>>>>>> 3254b186da (GEOMESA-3067 Find attribute in Filters with Functions with embedded expressions correctly)
=======
>>>>>>> 7b0539b808 (GEOMESA-3061 Converters - support bytes in Avro top-level union types (#2762))
=======
>>>>>>> 982031ef44 (GEOMESA-3067 Find attribute in Filters with Functions with embedded expressions correctly)
=======
>>>>>>> 0086b292ba (GEOMESA-3061 Converters - support bytes in Avro top-level union types (#2762))
=======
>>>>>>> cf57a2c189 (GEOMESA-3067 Find attribute in Filters with Functions with embedded expressions correctly)
=======
>>>>>>> e15d50d7d3 (GEOMESA-3061 Converters - support bytes in Avro top-level union types (#2762))
=======
>>>>>>> bec3ba7d08 (GEOMESA-3067 Find attribute in Filters with Functions with embedded expressions correctly)
=======
>>>>>>> 8de43cccf6 (GEOMESA-3061 Converters - support bytes in Avro top-level union types (#2762))
=======
>>>>>>> 26e5afc4ea (Merge branch 'feature/postgis-fixes')
=======
>>>>>>> 63a045a753 (GEOMESA-3254 Add Bloop build support)
=======
>>>>>>> b1a7408547 (GEOMESA-3067 Find attribute in Filters with Functions with embedded expressions correctly)
=======
>>>>>>> 12e3a588fc (GEOMESA-3061 Converters - support bytes in Avro top-level union types (#2762))
=======
>>>>>>> c8e013ff91 (GEOMESA-3067 Find attribute in Filters with Functions with embedded expressions correctly)
=======
>>>>>>> 1890b11217 (GEOMESA-3061 Converters - support bytes in Avro top-level union types (#2762))
=======
>>>>>>> 912169b5e9 (GEOMESA-3067 Find attribute in Filters with Functions with embedded expressions correctly)
=======
>>>>>>> 9c28193a91 (GEOMESA-3061 Converters - support bytes in Avro top-level union types (#2762))
=======
>>>>>>> 1b60c2aeba (GEOMESA-3067 Find attribute in Filters with Functions with embedded expressions correctly)
=======
>>>>>>> d294ce49e2 (GEOMESA-3061 Converters - support bytes in Avro top-level union types (#2762))
=======
>>>>>>> ed45e8551f (GEOMESA-3067 Find attribute in Filters with Functions with embedded expressions correctly)
=======
>>>>>>> 1df8328338 (GEOMESA-3061 Converters - support bytes in Avro top-level union types (#2762))
=======
>>>>>>> c69897d7bd (Merge branch 'feature/postgis-fixes')
=======
>>>>>>> dace2085b (GEOMESA-3061 Converters - support bytes in Avro top-level union types (#2762))
>>>>>>> 238945d4b3 (GEOMESA-3061 Converters - support bytes in Avro top-level union types (#2762))
=======
>>>>>>> 516fe7e9c (GEOMESA-3061 Converters - support bytes in Avro top-level union types (#2762))
=======
>>>>>>> e8cc4971c6 (Merge branch 'feature/postgis-fixes')
=======
>>>>>>> 8a3e82747d (GEOMESA-3067 Find attribute in Filters with Functions with embedded expressions correctly)
=======
>>>>>>> 81ee66102b (GEOMESA-3061 Converters - support bytes in Avro top-level union types (#2762))
=======
>>>>>>> 9943e05ec9 (GEOMESA-3067 Find attribute in Filters with Functions with embedded expressions correctly)
=======
>>>>>>> 53a3e72cbf (GEOMESA-3061 Converters - support bytes in Avro top-level union types (#2762))
=======
>>>>>>> d15af7157e (GEOMESA-3067 Find attribute in Filters with Functions with embedded expressions correctly)
=======
>>>>>>> 947761ec9b (GEOMESA-3061 Converters - support bytes in Avro top-level union types (#2762))
=======
>>>>>>> 9813375fcc (GEOMESA-3067 Find attribute in Filters with Functions with embedded expressions correctly)
=======
=======
>>>>>>> d2eec4be68 (GEOMESA-3067 Find attribute in Filters with Functions with embedded expressions correctly)
=======
>>>>>>> d94c03a98e (GEOMESA-3061 Converters - support bytes in Avro top-level union types (#2762))
=======
>>>>>>> cb6bda89b6 (Merge branch 'feature/postgis-fixes')
=======
>>>>>>> 09d87762c5 (GEOMESA-3254 Add Bloop build support)
=======
>>>>>>> e69b2aa6dc (GEOMESA-3067 Find attribute in Filters with Functions with embedded expressions correctly)
=======
>>>>>>> 67e4c1354f (GEOMESA-3061 Converters - support bytes in Avro top-level union types (#2762))
=======
>>>>>>> 060ac2189c (GEOMESA-3067 Find attribute in Filters with Functions with embedded expressions correctly)
=======
>>>>>>> 8035cc5893 (GEOMESA-3061 Converters - support bytes in Avro top-level union types (#2762))
=======
=======
=======
=======
>>>>>>> 9abc630fdf (GEOMESA-3061 Converters - support bytes in Avro top-level union types (#2762))
=======
>>>>>>> 570899511d (GEOMESA-3067 Find attribute in Filters with Functions with embedded expressions correctly)
=======
>>>>>>> 25063957fc (GEOMESA-3061 Converters - support bytes in Avro top-level union types (#2762))
=======
>>>>>>> 699117eca9 (Merge branch 'feature/postgis-fixes')
=======
=======
>>>>>>> a63cb7e74 (GEOMESA-3067 Find attribute in Filters with Functions with embedded expressions correctly)
>>>>>>> 8fb060734 (GEOMESA-3067 Find attribute in Filters with Functions with embedded expressions correctly)
>>>>>>> 38b3282770 (GEOMESA-3067 Find attribute in Filters with Functions with embedded expressions correctly)
=======
>>>>>>> a910ae135 (GEOMESA-3061 Converters - support bytes in Avro top-level union types (#2762))
>>>>>>> 07161eaaa6 (GEOMESA-3061 Converters - support bytes in Avro top-level union types (#2762))
=======
>>>>>>> 7f922b040 (GEOMESA-3067 Find attribute in Filters with Functions with embedded expressions correctly)
>>>>>>> 04f08c23c5 (GEOMESA-3067 Find attribute in Filters with Functions with embedded expressions correctly)
=======
>>>>>>> c8a325e13 (GEOMESA-3061 Converters - support bytes in Avro top-level union types (#2762))
>>>>>>> c9328eddce (GEOMESA-3061 Converters - support bytes in Avro top-level union types (#2762))
=======
>>>>>>> 9638dc731 (GEOMESA-3067 Find attribute in Filters with Functions with embedded expressions correctly)
=======
>>>>>>> 97ec7d864 (GEOMESA-3061 Converters - support bytes in Avro top-level union types (#2762))
=======
>>>>>>> db8d998aa (Merge branch 'feature/postgis-fixes')
=======
>>>>>>> ad3cedc4d (GEOMESA-3061 Converters - support bytes in Avro top-level union types (#2762))
=======
>>>>>>> bc4913194 (GEOMESA-3067 Find attribute in Filters with Functions with embedded expressions correctly)
=======
>>>>>>> bdbced26d (GEOMESA-3061 Converters - support bytes in Avro top-level union types (#2762))
=======
>>>>>>> 1b25d7ddb (Merge branch 'feature/postgis-fixes')
=======
>>>>>>> 24c4df93a5 (GEOMESA-3067 Find attribute in Filters with Functions with embedded expressions correctly)
=======
>>>>>>> c8a325e13c (GEOMESA-3061 Converters - support bytes in Avro top-level union types (#2762))
=======
>>>>>>> 9638dc731e (GEOMESA-3067 Find attribute in Filters with Functions with embedded expressions correctly)
=======
>>>>>>> 97ec7d864a (GEOMESA-3061 Converters - support bytes in Avro top-level union types (#2762))
=======
>>>>>>> db8d998aa2 (Merge branch 'feature/postgis-fixes')
=======
>>>>>>> ad3cedc4db (GEOMESA-3061 Converters - support bytes in Avro top-level union types (#2762))
=======
>>>>>>> bc49131942 (GEOMESA-3067 Find attribute in Filters with Functions with embedded expressions correctly)
=======
>>>>>>> bdbced26d4 (GEOMESA-3061 Converters - support bytes in Avro top-level union types (#2762))
=======
>>>>>>> 1b25d7ddb4 (Merge branch 'feature/postgis-fixes')
=======
>>>>>>> 0dbede148d (GEOMESA-3061 Converters - support bytes in Avro top-level union types (#2762))
=======
>>>>>>> 22dcc8170f (GEOMESA-3061 Converters - support bytes in Avro top-level union types (#2762))
=======
>>>>>>> b009fd23f4 (GEOMESA-3061 Converters - support bytes in Avro top-level union types (#2762))
=======
=======
>>>>>>> bc4062951d (GEOMESA-3061 Converters - support bytes in Avro top-level union types (#2762))
=======
>>>>>>> e944f1c88b (Merge branch 'feature/postgis-fixes')
=======
>>>>>>> deb8fd68de (GEOMESA-3067 Find attribute in Filters with Functions with embedded expressions correctly)
=======
>>>>>>> 8adfab65bb (GEOMESA-3061 Converters - support bytes in Avro top-level union types (#2762))
=======
>>>>>>> 3254b186da (GEOMESA-3067 Find attribute in Filters with Functions with embedded expressions correctly)
=======
>>>>>>> 7b0539b808 (GEOMESA-3061 Converters - support bytes in Avro top-level union types (#2762))
=======
>>>>>>> 982031ef44 (GEOMESA-3067 Find attribute in Filters with Functions with embedded expressions correctly)
=======
>>>>>>> 0086b292ba (GEOMESA-3061 Converters - support bytes in Avro top-level union types (#2762))
=======
>>>>>>> cf57a2c189 (GEOMESA-3067 Find attribute in Filters with Functions with embedded expressions correctly)
=======
>>>>>>> e15d50d7d3 (GEOMESA-3061 Converters - support bytes in Avro top-level union types (#2762))
=======
>>>>>>> bec3ba7d08 (GEOMESA-3067 Find attribute in Filters with Functions with embedded expressions correctly)
=======
>>>>>>> 8de43cccf6 (GEOMESA-3061 Converters - support bytes in Avro top-level union types (#2762))
=======
>>>>>>> 26e5afc4ea (Merge branch 'feature/postgis-fixes')
=======
>>>>>>> 63a045a753 (GEOMESA-3254 Add Bloop build support)
=======
>>>>>>> b1a7408547 (GEOMESA-3067 Find attribute in Filters with Functions with embedded expressions correctly)
=======
>>>>>>> 12e3a588fc (GEOMESA-3061 Converters - support bytes in Avro top-level union types (#2762))
=======
>>>>>>> c8e013ff91 (GEOMESA-3067 Find attribute in Filters with Functions with embedded expressions correctly)
=======
>>>>>>> 1890b11217 (GEOMESA-3061 Converters - support bytes in Avro top-level union types (#2762))
=======
>>>>>>> 912169b5e9 (GEOMESA-3067 Find attribute in Filters with Functions with embedded expressions correctly)
=======
>>>>>>> 9c28193a91 (GEOMESA-3061 Converters - support bytes in Avro top-level union types (#2762))
=======
>>>>>>> 1b60c2aeba (GEOMESA-3067 Find attribute in Filters with Functions with embedded expressions correctly)
=======
>>>>>>> d294ce49e2 (GEOMESA-3061 Converters - support bytes in Avro top-level union types (#2762))
=======
>>>>>>> ed45e8551f (GEOMESA-3067 Find attribute in Filters with Functions with embedded expressions correctly)
=======
>>>>>>> 1df8328338 (GEOMESA-3061 Converters - support bytes in Avro top-level union types (#2762))
=======
>>>>>>> c69897d7bd (Merge branch 'feature/postgis-fixes')
=======
>>>>>>> dace2085b (GEOMESA-3061 Converters - support bytes in Avro top-level union types (#2762))
>>>>>>> 238945d4b3 (GEOMESA-3061 Converters - support bytes in Avro top-level union types (#2762))
=======
>>>>>>> 516fe7e9c (GEOMESA-3061 Converters - support bytes in Avro top-level union types (#2762))
=======
>>>>>>> e8cc4971c6 (Merge branch 'feature/postgis-fixes')
=======
>>>>>>> 8a3e82747d (GEOMESA-3067 Find attribute in Filters with Functions with embedded expressions correctly)
=======
>>>>>>> 81ee66102b (GEOMESA-3061 Converters - support bytes in Avro top-level union types (#2762))
=======
>>>>>>> 9943e05ec9 (GEOMESA-3067 Find attribute in Filters with Functions with embedded expressions correctly)
=======
>>>>>>> 53a3e72cbf (GEOMESA-3061 Converters - support bytes in Avro top-level union types (#2762))
=======
>>>>>>> d15af7157e (GEOMESA-3067 Find attribute in Filters with Functions with embedded expressions correctly)
=======
>>>>>>> 947761ec9b (GEOMESA-3061 Converters - support bytes in Avro top-level union types (#2762))
=======
>>>>>>> 9813375fcc (GEOMESA-3067 Find attribute in Filters with Functions with embedded expressions correctly)
=======
=======
>>>>>>> d2eec4be68 (GEOMESA-3067 Find attribute in Filters with Functions with embedded expressions correctly)
=======
>>>>>>> d94c03a98e (GEOMESA-3061 Converters - support bytes in Avro top-level union types (#2762))
=======
>>>>>>> cb6bda89b6 (Merge branch 'feature/postgis-fixes')
=======
>>>>>>> 09d87762c5 (GEOMESA-3254 Add Bloop build support)
=======
>>>>>>> e69b2aa6dc (GEOMESA-3067 Find attribute in Filters with Functions with embedded expressions correctly)
=======
>>>>>>> 67e4c1354f (GEOMESA-3061 Converters - support bytes in Avro top-level union types (#2762))
=======
>>>>>>> 060ac2189c (GEOMESA-3067 Find attribute in Filters with Functions with embedded expressions correctly)
=======
>>>>>>> 8035cc5893 (GEOMESA-3061 Converters - support bytes in Avro top-level union types (#2762))
=======
=======
=======
=======
>>>>>>> 9abc630fdf (GEOMESA-3061 Converters - support bytes in Avro top-level union types (#2762))
=======
>>>>>>> 570899511d (GEOMESA-3067 Find attribute in Filters with Functions with embedded expressions correctly)
=======
>>>>>>> 25063957fc (GEOMESA-3061 Converters - support bytes in Avro top-level union types (#2762))
=======
>>>>>>> 699117eca9 (Merge branch 'feature/postgis-fixes')
=======
=======
>>>>>>> a63cb7e74 (GEOMESA-3067 Find attribute in Filters with Functions with embedded expressions correctly)
>>>>>>> 8fb060734 (GEOMESA-3067 Find attribute in Filters with Functions with embedded expressions correctly)
>>>>>>> 38b3282770 (GEOMESA-3067 Find attribute in Filters with Functions with embedded expressions correctly)
=======
>>>>>>> a910ae135 (GEOMESA-3061 Converters - support bytes in Avro top-level union types (#2762))
>>>>>>> 07161eaaa6 (GEOMESA-3061 Converters - support bytes in Avro top-level union types (#2762))
=======
>>>>>>> 7f922b040 (GEOMESA-3067 Find attribute in Filters with Functions with embedded expressions correctly)
>>>>>>> 04f08c23c5 (GEOMESA-3067 Find attribute in Filters with Functions with embedded expressions correctly)
=======
>>>>>>> c8a325e13 (GEOMESA-3061 Converters - support bytes in Avro top-level union types (#2762))
>>>>>>> c9328eddce (GEOMESA-3061 Converters - support bytes in Avro top-level union types (#2762))
=======
>>>>>>> 9638dc731 (GEOMESA-3067 Find attribute in Filters with Functions with embedded expressions correctly)
=======
>>>>>>> 97ec7d864 (GEOMESA-3061 Converters - support bytes in Avro top-level union types (#2762))
=======
>>>>>>> db8d998aa (Merge branch 'feature/postgis-fixes')
=======
>>>>>>> ad3cedc4d (GEOMESA-3061 Converters - support bytes in Avro top-level union types (#2762))
=======
>>>>>>> bc4913194 (GEOMESA-3067 Find attribute in Filters with Functions with embedded expressions correctly)
=======
>>>>>>> bdbced26d (GEOMESA-3061 Converters - support bytes in Avro top-level union types (#2762))
=======
>>>>>>> 1b25d7ddb (Merge branch 'feature/postgis-fixes')
=======
>>>>>>> def2794bb5 (GEOMESA-3067 Find attribute in Filters with Functions with embedded expressions correctly)
=======
>>>>>>> cb5e2daf2b (GEOMESA-3061 Converters - support bytes in Avro top-level union types (#2762))
=======
>>>>>>> 9bcad1eb67 (GEOMESA-3067 Find attribute in Filters with Functions with embedded expressions correctly)
=======
>>>>>>> c8a325e13c (GEOMESA-3061 Converters - support bytes in Avro top-level union types (#2762))
=======
>>>>>>> 9638dc731e (GEOMESA-3067 Find attribute in Filters with Functions with embedded expressions correctly)
=======
>>>>>>> 97ec7d864a (GEOMESA-3061 Converters - support bytes in Avro top-level union types (#2762))
=======
>>>>>>> db8d998aa2 (Merge branch 'feature/postgis-fixes')
=======
>>>>>>> ad3cedc4db (GEOMESA-3061 Converters - support bytes in Avro top-level union types (#2762))
=======
>>>>>>> bc49131942 (GEOMESA-3067 Find attribute in Filters with Functions with embedded expressions correctly)
=======
>>>>>>> bdbced26d4 (GEOMESA-3061 Converters - support bytes in Avro top-level union types (#2762))
=======
>>>>>>> 1b25d7ddb4 (Merge branch 'feature/postgis-fixes')
=======
>>>>>>> 0dbede148d (GEOMESA-3061 Converters - support bytes in Avro top-level union types (#2762))
=======
>>>>>>> 22dcc8170f (GEOMESA-3061 Converters - support bytes in Avro top-level union types (#2762))
=======
>>>>>>> b009fd23f4 (GEOMESA-3061 Converters - support bytes in Avro top-level union types (#2762))
=======
=======
>>>>>>> bc4062951d (GEOMESA-3061 Converters - support bytes in Avro top-level union types (#2762))
=======
>>>>>>> e944f1c88b (Merge branch 'feature/postgis-fixes')
=======
>>>>>>> deb8fd68de (GEOMESA-3067 Find attribute in Filters with Functions with embedded expressions correctly)
=======
>>>>>>> 8adfab65bb (GEOMESA-3061 Converters - support bytes in Avro top-level union types (#2762))
=======
>>>>>>> 3254b186da (GEOMESA-3067 Find attribute in Filters with Functions with embedded expressions correctly)
=======
>>>>>>> 7b0539b808 (GEOMESA-3061 Converters - support bytes in Avro top-level union types (#2762))
=======
>>>>>>> 982031ef44 (GEOMESA-3067 Find attribute in Filters with Functions with embedded expressions correctly)
=======
>>>>>>> 0086b292ba (GEOMESA-3061 Converters - support bytes in Avro top-level union types (#2762))
=======
>>>>>>> cf57a2c189 (GEOMESA-3067 Find attribute in Filters with Functions with embedded expressions correctly)
=======
>>>>>>> e15d50d7d3 (GEOMESA-3061 Converters - support bytes in Avro top-level union types (#2762))
=======
>>>>>>> bec3ba7d08 (GEOMESA-3067 Find attribute in Filters with Functions with embedded expressions correctly)
=======
>>>>>>> 8de43cccf6 (GEOMESA-3061 Converters - support bytes in Avro top-level union types (#2762))
=======
>>>>>>> 26e5afc4ea (Merge branch 'feature/postgis-fixes')
=======
>>>>>>> 63a045a753 (GEOMESA-3254 Add Bloop build support)
=======
>>>>>>> b1a7408547 (GEOMESA-3067 Find attribute in Filters with Functions with embedded expressions correctly)
=======
>>>>>>> 12e3a588fc (GEOMESA-3061 Converters - support bytes in Avro top-level union types (#2762))
=======
>>>>>>> c8e013ff91 (GEOMESA-3067 Find attribute in Filters with Functions with embedded expressions correctly)
=======
>>>>>>> 1890b11217 (GEOMESA-3061 Converters - support bytes in Avro top-level union types (#2762))
=======
>>>>>>> 912169b5e9 (GEOMESA-3067 Find attribute in Filters with Functions with embedded expressions correctly)
=======
>>>>>>> 9c28193a91 (GEOMESA-3061 Converters - support bytes in Avro top-level union types (#2762))
=======
>>>>>>> 1b60c2aeba (GEOMESA-3067 Find attribute in Filters with Functions with embedded expressions correctly)
=======
>>>>>>> d294ce49e2 (GEOMESA-3061 Converters - support bytes in Avro top-level union types (#2762))
=======
>>>>>>> ed45e8551f (GEOMESA-3067 Find attribute in Filters with Functions with embedded expressions correctly)
=======
>>>>>>> 1df8328338 (GEOMESA-3061 Converters - support bytes in Avro top-level union types (#2762))
=======
>>>>>>> c69897d7bd (Merge branch 'feature/postgis-fixes')
=======
>>>>>>> dace2085b (GEOMESA-3061 Converters - support bytes in Avro top-level union types (#2762))
>>>>>>> 238945d4b3 (GEOMESA-3061 Converters - support bytes in Avro top-level union types (#2762))
=======
>>>>>>> 516fe7e9c (GEOMESA-3061 Converters - support bytes in Avro top-level union types (#2762))
=======
>>>>>>> e8cc4971c6 (Merge branch 'feature/postgis-fixes')
=======
>>>>>>> 8a3e82747d (GEOMESA-3067 Find attribute in Filters with Functions with embedded expressions correctly)
=======
>>>>>>> 81ee66102b (GEOMESA-3061 Converters - support bytes in Avro top-level union types (#2762))
=======
>>>>>>> 9943e05ec9 (GEOMESA-3067 Find attribute in Filters with Functions with embedded expressions correctly)
=======
>>>>>>> 53a3e72cbf (GEOMESA-3061 Converters - support bytes in Avro top-level union types (#2762))
=======
>>>>>>> d15af7157e (GEOMESA-3067 Find attribute in Filters with Functions with embedded expressions correctly)
=======
>>>>>>> 947761ec9b (GEOMESA-3061 Converters - support bytes in Avro top-level union types (#2762))
=======
>>>>>>> 9813375fcc (GEOMESA-3067 Find attribute in Filters with Functions with embedded expressions correctly)
=======
=======
>>>>>>> d2eec4be68 (GEOMESA-3067 Find attribute in Filters with Functions with embedded expressions correctly)
=======
>>>>>>> d94c03a98e (GEOMESA-3061 Converters - support bytes in Avro top-level union types (#2762))
=======
>>>>>>> cb6bda89b6 (Merge branch 'feature/postgis-fixes')
=======
>>>>>>> 09d87762c5 (GEOMESA-3254 Add Bloop build support)
=======
>>>>>>> e69b2aa6dc (GEOMESA-3067 Find attribute in Filters with Functions with embedded expressions correctly)
=======
>>>>>>> 67e4c1354f (GEOMESA-3061 Converters - support bytes in Avro top-level union types (#2762))
=======
>>>>>>> 060ac2189c (GEOMESA-3067 Find attribute in Filters with Functions with embedded expressions correctly)
=======
>>>>>>> 8035cc5893 (GEOMESA-3061 Converters - support bytes in Avro top-level union types (#2762))
=======
=======
=======
=======
>>>>>>> 9abc630fdf (GEOMESA-3061 Converters - support bytes in Avro top-level union types (#2762))
=======
>>>>>>> 570899511d (GEOMESA-3067 Find attribute in Filters with Functions with embedded expressions correctly)
=======
>>>>>>> 25063957fc (GEOMESA-3061 Converters - support bytes in Avro top-level union types (#2762))
=======
>>>>>>> 699117eca9 (Merge branch 'feature/postgis-fixes')
=======
=======
>>>>>>> a63cb7e74 (GEOMESA-3067 Find attribute in Filters with Functions with embedded expressions correctly)
>>>>>>> 8fb060734 (GEOMESA-3067 Find attribute in Filters with Functions with embedded expressions correctly)
>>>>>>> 38b3282770 (GEOMESA-3067 Find attribute in Filters with Functions with embedded expressions correctly)
=======
>>>>>>> a910ae135 (GEOMESA-3061 Converters - support bytes in Avro top-level union types (#2762))
>>>>>>> 07161eaaa6 (GEOMESA-3061 Converters - support bytes in Avro top-level union types (#2762))
=======
>>>>>>> 7f922b040 (GEOMESA-3067 Find attribute in Filters with Functions with embedded expressions correctly)
>>>>>>> 04f08c23c5 (GEOMESA-3067 Find attribute in Filters with Functions with embedded expressions correctly)
=======
>>>>>>> c8a325e13 (GEOMESA-3061 Converters - support bytes in Avro top-level union types (#2762))
>>>>>>> c9328eddce (GEOMESA-3061 Converters - support bytes in Avro top-level union types (#2762))
=======
>>>>>>> 9638dc731 (GEOMESA-3067 Find attribute in Filters with Functions with embedded expressions correctly)
=======
>>>>>>> 97ec7d864 (GEOMESA-3061 Converters - support bytes in Avro top-level union types (#2762))
=======
>>>>>>> db8d998aa (Merge branch 'feature/postgis-fixes')
=======
>>>>>>> ad3cedc4d (GEOMESA-3061 Converters - support bytes in Avro top-level union types (#2762))
=======
>>>>>>> bc4913194 (GEOMESA-3067 Find attribute in Filters with Functions with embedded expressions correctly)
=======
>>>>>>> bdbced26d (GEOMESA-3061 Converters - support bytes in Avro top-level union types (#2762))
=======
>>>>>>> 1b25d7ddb (Merge branch 'feature/postgis-fixes')
=======
>>>>>>> 24c4df93a5 (GEOMESA-3067 Find attribute in Filters with Functions with embedded expressions correctly)
=======
>>>>>>> c8a325e13c (GEOMESA-3061 Converters - support bytes in Avro top-level union types (#2762))
=======
>>>>>>> 9638dc731e (GEOMESA-3067 Find attribute in Filters with Functions with embedded expressions correctly)
=======
>>>>>>> 97ec7d864a (GEOMESA-3061 Converters - support bytes in Avro top-level union types (#2762))
=======
>>>>>>> db8d998aa2 (Merge branch 'feature/postgis-fixes')
=======
>>>>>>> ad3cedc4db (GEOMESA-3061 Converters - support bytes in Avro top-level union types (#2762))
=======
>>>>>>> bc49131942 (GEOMESA-3067 Find attribute in Filters with Functions with embedded expressions correctly)
=======
>>>>>>> bdbced26d4 (GEOMESA-3061 Converters - support bytes in Avro top-level union types (#2762))
=======
>>>>>>> 1b25d7ddb4 (Merge branch 'feature/postgis-fixes')
=======
>>>>>>> 0dbede148d (GEOMESA-3061 Converters - support bytes in Avro top-level union types (#2762))
=======
>>>>>>> 22dcc8170f (GEOMESA-3061 Converters - support bytes in Avro top-level union types (#2762))
=======
>>>>>>> b009fd23f4 (GEOMESA-3061 Converters - support bytes in Avro top-level union types (#2762))
=======
=======
>>>>>>> bc4062951d (GEOMESA-3061 Converters - support bytes in Avro top-level union types (#2762))
=======
>>>>>>> dace2085b (GEOMESA-3061 Converters - support bytes in Avro top-level union types (#2762))
>>>>>>> 238945d4b3 (GEOMESA-3061 Converters - support bytes in Avro top-level union types (#2762))
=======
>>>>>>> 516fe7e9c (GEOMESA-3061 Converters - support bytes in Avro top-level union types (#2762))
=======
>>>>>>> a63cb7e74 (GEOMESA-3067 Find attribute in Filters with Functions with embedded expressions correctly)
>>>>>>> c3b0a1b6e3 (GEOMESA-3067 Find attribute in Filters with Functions with embedded expressions correctly)
=======
<<<<<<< HEAD
<<<<<<< HEAD
<<<<<<< HEAD
<<<<<<< HEAD
<<<<<<< HEAD
<<<<<<< HEAD
=======
>>>>>>> 9bcad1eb67 (GEOMESA-3067 Find attribute in Filters with Functions with embedded expressions correctly)
=======
>>>>>>> 00e61f4b70 (GEOMESA-3061 Converters - support bytes in Avro top-level union types (#2762))
>>>>>>> 67b361c85 (GEOMESA-3061 Converters - support bytes in Avro top-level union types (#2762))
=======
>>>>>>> e6e1f4bdd5 (GEOMESA-3061 Converters - support bytes in Avro top-level union types (#2762))
=======
<<<<<<< HEAD
<<<<<<< HEAD
<<<<<<< HEAD
<<<<<<< HEAD
<<<<<<< HEAD
<<<<<<< HEAD
=======
>>>>>>> 60b4637548 (GEOMESA-3061 Converters - support bytes in Avro top-level union types (#2762))
=======
>>>>>>> 6f81d40992 (GEOMESA-3067 Find attribute in Filters with Functions with embedded expressions correctly)
>>>>>>> 7f922b040c (GEOMESA-3067 Find attribute in Filters with Functions with embedded expressions correctly)
=======
>>>>>>> a910ae135f (GEOMESA-3061 Converters - support bytes in Avro top-level union types (#2762))
=======
<<<<<<< HEAD
<<<<<<< HEAD
<<<<<<< HEAD
<<<<<<< HEAD
<<<<<<< HEAD
<<<<<<< HEAD
=======
>>>>>>> c169cb2905 (GEOMESA-3067 Find attribute in Filters with Functions with embedded expressions correctly)
=======
>>>>>>> f983ea29f0 (GEOMESA-3067 Find attribute in Filters with Functions with embedded expressions correctly)
=======
>>>>>>> 009a284072 (GEOMESA-3061 Converters - support bytes in Avro top-level union types (#2762))
=======
=======
>>>>>>> c169cb2905 (GEOMESA-3067 Find attribute in Filters with Functions with embedded expressions correctly)
>>>>>>> 9df4f8a9f6 (GEOMESA-3067 Find attribute in Filters with Functions with embedded expressions correctly)
=======
>>>>>>> a63cb7e74 (GEOMESA-3067 Find attribute in Filters with Functions with embedded expressions correctly)
>>>>>>> 8fb0607344 (GEOMESA-3067 Find attribute in Filters with Functions with embedded expressions correctly)
=======
<<<<<<< HEAD
<<<<<<< HEAD
<<<<<<< HEAD
<<<<<<< HEAD
<<<<<<< HEAD
<<<<<<< HEAD
=======
>>>>>>> 9df4f8a9f6 (GEOMESA-3067 Find attribute in Filters with Functions with embedded expressions correctly)
=======
>>>>>>> 7b8c8dcc3d (GEOMESA-3061 Converters - support bytes in Avro top-level union types (#2762))
>>>>>>> 67b361c85 (GEOMESA-3061 Converters - support bytes in Avro top-level union types (#2762))
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
>>>>>>> 1cad375176 (GEOMESA-3061 Converters - support bytes in Avro top-level union types (#2762))
=======
>>>>>>> 4373c901b3 (GEOMESA-3067 Find attribute in Filters with Functions with embedded expressions correctly)
=======
>>>>>>> fe3de10f11 (GEOMESA-3061 Converters - support bytes in Avro top-level union types (#2762))
=======
>>>>>>> a35efac12e (GEOMESA-3061 Converters - support bytes in Avro top-level union types (#2762))
=======
>>>>>>> 7b3c90c53f (GEOMESA-3061 Converters - support bytes in Avro top-level union types (#2762))
=======
>>>>>>> 1278241911 (GEOMESA-3067 Find attribute in Filters with Functions with embedded expressions correctly)
=======
>>>>>>> 0fa73844a1 (GEOMESA-3061 Converters - support bytes in Avro top-level union types (#2762))
=======
>>>>>>> 6e30236dd2 (GEOMESA-3061 Converters - support bytes in Avro top-level union types (#2762))
=======
>>>>>>> 4f51687745 (GEOMESA-3061 Converters - support bytes in Avro top-level union types (#2762))
=======
=======
>>>>>>> 1cad375176 (GEOMESA-3061 Converters - support bytes in Avro top-level union types (#2762))
>>>>>>> 73770612e0 (GEOMESA-3061 Converters - support bytes in Avro top-level union types (#2762))
>>>>>>> 240977229 (GEOMESA-3061 Converters - support bytes in Avro top-level union types (#2762))
=======
>>>>>>> 45ad5d11f (GEOMESA-3061 Converters - support bytes in Avro top-level union types (#2762))
=======
=======
>>>>>>> dace2085b (GEOMESA-3061 Converters - support bytes in Avro top-level union types (#2762))
<<<<<<< HEAD
<<<<<<< HEAD
<<<<<<< HEAD
<<<<<<< HEAD
<<<<<<< HEAD
=======
>>>>>>> 73770612e0 (GEOMESA-3061 Converters - support bytes in Avro top-level union types (#2762))
=======
=======
>>>>>>> c9328eddce (GEOMESA-3061 Converters - support bytes in Avro top-level union types (#2762))
<<<<<<< HEAD
<<<<<<< HEAD
<<<<<<< HEAD
<<<<<<< HEAD
=======
>>>>>>> 9abc630fdf (GEOMESA-3061 Converters - support bytes in Avro top-level union types (#2762))
=======
>>>>>>> fe3de10f11 (GEOMESA-3061 Converters - support bytes in Avro top-level union types (#2762))
=======
=======
>>>>>>> 9abc630fdf (GEOMESA-3061 Converters - support bytes in Avro top-level union types (#2762))
>>>>>>> a35efac12e (GEOMESA-3061 Converters - support bytes in Avro top-level union types (#2762))
=======
>>>>>>> 0fa73844a1 (GEOMESA-3061 Converters - support bytes in Avro top-level union types (#2762))
=======
=======
>>>>>>> 9abc630fdf (GEOMESA-3061 Converters - support bytes in Avro top-level union types (#2762))
>>>>>>> 6e30236dd2 (GEOMESA-3061 Converters - support bytes in Avro top-level union types (#2762))
>>>>>>> e182e6e99 (GEOMESA-3067 Find attribute in Filters with Functions with embedded expressions correctly)
=======
<<<<<<< HEAD
>>>>>>> 9943e05ec9 (GEOMESA-3067 Find attribute in Filters with Functions with embedded expressions correctly)
=======
>>>>>>> 9d708b240 (GEOMESA-3061 Converters - support bytes in Avro top-level union types (#2762))
=======
<<<<<<< HEAD
>>>>>>> 53a3e72cbf (GEOMESA-3061 Converters - support bytes in Avro top-level union types (#2762))
=======
>>>>>>> 3333975e7 (GEOMESA-3067 Find attribute in Filters with Functions with embedded expressions correctly)
=======
<<<<<<< HEAD
<<<<<<< HEAD
<<<<<<< HEAD
<<<<<<< HEAD
<<<<<<< HEAD
=======
>>>>>>> 84ac051f28 (GEOMESA-3061 Converters - support bytes in Avro top-level union types (#2762))
=======
>>>>>>> c2cfc968d2 (GEOMESA-3061 Converters - support bytes in Avro top-level union types (#2762))
>>>>>>> d15af7157e (GEOMESA-3067 Find attribute in Filters with Functions with embedded expressions correctly)
=======
>>>>>>> 76618c8da (GEOMESA-3061 Converters - support bytes in Avro top-level union types (#2762))
=======
<<<<<<< HEAD
<<<<<<< HEAD
<<<<<<< HEAD
<<<<<<< HEAD
<<<<<<< HEAD
=======
>>>>>>> 99acaa0887 (GEOMESA-3067 Find attribute in Filters with Functions with embedded expressions correctly)
=======
>>>>>>> 5d8dab9f81 (GEOMESA-3067 Find attribute in Filters with Functions with embedded expressions correctly)
>>>>>>> 947761ec9b (GEOMESA-3061 Converters - support bytes in Avro top-level union types (#2762))
=======
=======
>>>>>>> a63cb7e74 (GEOMESA-3067 Find attribute in Filters with Functions with embedded expressions correctly)
>>>>>>> c3b0a1b6e (GEOMESA-3067 Find attribute in Filters with Functions with embedded expressions correctly)
=======
<<<<<<< HEAD
<<<<<<< HEAD
<<<<<<< HEAD
<<<<<<< HEAD
<<<<<<< HEAD
=======
>>>>>>> fe3de10f11 (GEOMESA-3061 Converters - support bytes in Avro top-level union types (#2762))
=======
>>>>>>> 0fa73844a1 (GEOMESA-3061 Converters - support bytes in Avro top-level union types (#2762))
>>>>>>> 9813375fcc (GEOMESA-3067 Find attribute in Filters with Functions with embedded expressions correctly)
=======
=======
>>>>>>> c8a325e13 (GEOMESA-3061 Converters - support bytes in Avro top-level union types (#2762))
<<<<<<< HEAD
<<<<<<< HEAD
<<<<<<< HEAD
<<<<<<< HEAD
<<<<<<< HEAD
=======
>>>>>>> a35efac12e (GEOMESA-3061 Converters - support bytes in Avro top-level union types (#2762))
=======
>>>>>>> 6e30236dd2 (GEOMESA-3061 Converters - support bytes in Avro top-level union types (#2762))
>>>>>>> c9328eddce (GEOMESA-3061 Converters - support bytes in Avro top-level union types (#2762))
=======
=======
>>>>>>> ad3cedc4d (GEOMESA-3061 Converters - support bytes in Avro top-level union types (#2762))
>>>>>>> 9abc630fdf (GEOMESA-3061 Converters - support bytes in Avro top-level union types (#2762))
<<<<<<< HEAD
<<<<<<< HEAD
<<<<<<< HEAD
=======
>>>>>>> d206a68a13 (GEOMESA-3061 Converters - support bytes in Avro top-level union types (#2762))
=======
>>>>>>> 3333975e77 (GEOMESA-3067 Find attribute in Filters with Functions with embedded expressions correctly)
=======
>>>>>>> 9412e85b59 (GEOMESA-3067 Find attribute in Filters with Functions with embedded expressions correctly)
<<<<<<< HEAD
<<<<<<< HEAD
=======
>>>>>>> 694bcd3776 (GEOMESA-3061 Converters - support bytes in Avro top-level union types (#2762))
=======
>>>>>>> 24c4df93a5 (GEOMESA-3067 Find attribute in Filters with Functions with embedded expressions correctly)
<<<<<<< HEAD
<<<<<<< HEAD
=======
>>>>>>> 00e61f4b70 (GEOMESA-3061 Converters - support bytes in Avro top-level union types (#2762))
=======
>>>>>>> 67b361c85 (GEOMESA-3061 Converters - support bytes in Avro top-level union types (#2762))
=======
>>>>>>> 6cd1151639 (GEOMESA-3061 Converters - support bytes in Avro top-level union types (#2762))
<<<<<<< HEAD
<<<<<<< HEAD
=======
>>>>>>> 5dcf23da52 (GEOMESA-3061 Converters - support bytes in Avro top-level union types (#2762))
=======
>>>>>>> 7f922b040c (GEOMESA-3067 Find attribute in Filters with Functions with embedded expressions correctly)
=======
>>>>>>> 2b62d1f3fe (GEOMESA-3067 Find attribute in Filters with Functions with embedded expressions correctly)
<<<<<<< HEAD
<<<<<<< HEAD
=======
>>>>>>> 92674ff9d4 (GEOMESA-3061 Converters - support bytes in Avro top-level union types (#2762))
=======
>>>>>>> c169cb2905 (GEOMESA-3067 Find attribute in Filters with Functions with embedded expressions correctly)
<<<<<<< HEAD
<<<<<<< HEAD
=======
>>>>>>> 7b8c8dcc3d (GEOMESA-3061 Converters - support bytes in Avro top-level union types (#2762))
=======
>>>>>>> 67b361c85 (GEOMESA-3061 Converters - support bytes in Avro top-level union types (#2762))
=======
>>>>>>> 9a4dff9e4f (GEOMESA-3061 Converters - support bytes in Avro top-level union types (#2762))
<<<<<<< HEAD
<<<<<<< HEAD
=======
>>>>>>> 240977229 (GEOMESA-3061 Converters - support bytes in Avro top-level union types (#2762))
=======
<<<<<<< HEAD
<<<<<<< HEAD
>>>>>>> 8c9ca1211a (GEOMESA-3061 Converters - support bytes in Avro top-level union types (#2762))
=======
>>>>>>> 45ad5d11f (GEOMESA-3061 Converters - support bytes in Avro top-level union types (#2762))
=======
>>>>>>> a22efb4d66 (GEOMESA-3061 Converters - support bytes in Avro top-level union types (#2762))
=======
>>>>>>> 1cad375176 (GEOMESA-3061 Converters - support bytes in Avro top-level union types (#2762))
<<<<<<< HEAD
=======
=======
>>>>>>> e182e6e99 (GEOMESA-3067 Find attribute in Filters with Functions with embedded expressions correctly)
=======
<<<<<<< HEAD
>>>>>>> 9943e05ec9 (GEOMESA-3067 Find attribute in Filters with Functions with embedded expressions correctly)
<<<<<<< HEAD
>>>>>>> 4373c901b3 (GEOMESA-3067 Find attribute in Filters with Functions with embedded expressions correctly)
=======
=======
>>>>>>> 9d708b240 (GEOMESA-3061 Converters - support bytes in Avro top-level union types (#2762))
=======
>>>>>>> 53a3e72cbf (GEOMESA-3061 Converters - support bytes in Avro top-level union types (#2762))
>>>>>>> 963feec660 (GEOMESA-3061 Converters - support bytes in Avro top-level union types (#2762))
=======
>>>>>>> d15af7157e (GEOMESA-3067 Find attribute in Filters with Functions with embedded expressions correctly)
>>>>>>> 2c14568a23 (GEOMESA-3067 Find attribute in Filters with Functions with embedded expressions correctly)
=======
>>>>>>> 947761ec9b (GEOMESA-3061 Converters - support bytes in Avro top-level union types (#2762))
>>>>>>> 84ac051f28 (GEOMESA-3061 Converters - support bytes in Avro top-level union types (#2762))
=======
>>>>>>> 9813375fcc (GEOMESA-3067 Find attribute in Filters with Functions with embedded expressions correctly)
>>>>>>> 99acaa0887 (GEOMESA-3067 Find attribute in Filters with Functions with embedded expressions correctly)
=======
>>>>>>> c9328eddce (GEOMESA-3061 Converters - support bytes in Avro top-level union types (#2762))
>>>>>>> fe3de10f11 (GEOMESA-3061 Converters - support bytes in Avro top-level union types (#2762))
=======
>>>>>>> a35efac12e (GEOMESA-3061 Converters - support bytes in Avro top-level union types (#2762))
=======
>>>>>>> a5b160f47b (GEOMESA-3061 Converters - support bytes in Avro top-level union types (#2762))
=======
>>>>>>> 3333975e77 (GEOMESA-3067 Find attribute in Filters with Functions with embedded expressions correctly)
=======
>>>>>>> fa429c7863 (GEOMESA-3067 Find attribute in Filters with Functions with embedded expressions correctly)
=======
>>>>>>> 5cf31d21f3 (GEOMESA-3061 Converters - support bytes in Avro top-level union types (#2762))
=======
>>>>>>> def2794bb5 (GEOMESA-3067 Find attribute in Filters with Functions with embedded expressions correctly)
=======
>>>>>>> 67b361c85 (GEOMESA-3061 Converters - support bytes in Avro top-level union types (#2762))
=======
>>>>>>> 94fecee1d8 (GEOMESA-3061 Converters - support bytes in Avro top-level union types (#2762))
=======
>>>>>>> 3eb12f79a9 (GEOMESA-3061 Converters - support bytes in Avro top-level union types (#2762))
=======
>>>>>>> 7f922b040c (GEOMESA-3067 Find attribute in Filters with Functions with embedded expressions correctly)
=======
>>>>>>> 8b16ac5c65 (GEOMESA-3067 Find attribute in Filters with Functions with embedded expressions correctly)
=======
>>>>>>> 4ccd6f6b1f (GEOMESA-3061 Converters - support bytes in Avro top-level union types (#2762))
=======
>>>>>>> f983ea29f0 (GEOMESA-3067 Find attribute in Filters with Functions with embedded expressions correctly)
=======
>>>>>>> 67b361c85 (GEOMESA-3061 Converters - support bytes in Avro top-level union types (#2762))
=======
>>>>>>> 35b69b8f2f (GEOMESA-3061 Converters - support bytes in Avro top-level union types (#2762))
=======
>>>>>>> 240977229 (GEOMESA-3061 Converters - support bytes in Avro top-level union types (#2762))
=======
>>>>>>> 26a09ee6c2 (GEOMESA-3061 Converters - support bytes in Avro top-level union types (#2762))
=======
>>>>>>> 45ad5d11f (GEOMESA-3061 Converters - support bytes in Avro top-level union types (#2762))
=======
>>>>>>> 194ad4e5c0 (GEOMESA-3061 Converters - support bytes in Avro top-level union types (#2762))
=======
>>>>>>> 7b3c90c53f (GEOMESA-3061 Converters - support bytes in Avro top-level union types (#2762))
=======
=======
>>>>>>> e182e6e99 (GEOMESA-3067 Find attribute in Filters with Functions with embedded expressions correctly)
=======
<<<<<<< HEAD
>>>>>>> 9943e05ec9 (GEOMESA-3067 Find attribute in Filters with Functions with embedded expressions correctly)
<<<<<<< HEAD
>>>>>>> 1278241911 (GEOMESA-3067 Find attribute in Filters with Functions with embedded expressions correctly)
=======
=======
>>>>>>> 9d708b240 (GEOMESA-3061 Converters - support bytes in Avro top-level union types (#2762))
=======
>>>>>>> 53a3e72cbf (GEOMESA-3061 Converters - support bytes in Avro top-level union types (#2762))
>>>>>>> 3e7fb62639 (GEOMESA-3061 Converters - support bytes in Avro top-level union types (#2762))
=======
>>>>>>> d15af7157e (GEOMESA-3067 Find attribute in Filters with Functions with embedded expressions correctly)
>>>>>>> 00d66ae013 (GEOMESA-3067 Find attribute in Filters with Functions with embedded expressions correctly)
=======
>>>>>>> 947761ec9b (GEOMESA-3061 Converters - support bytes in Avro top-level union types (#2762))
>>>>>>> c2cfc968d2 (GEOMESA-3061 Converters - support bytes in Avro top-level union types (#2762))
=======
>>>>>>> 9813375fcc (GEOMESA-3067 Find attribute in Filters with Functions with embedded expressions correctly)
>>>>>>> 5d8dab9f81 (GEOMESA-3067 Find attribute in Filters with Functions with embedded expressions correctly)
=======
>>>>>>> c9328eddce (GEOMESA-3061 Converters - support bytes in Avro top-level union types (#2762))
>>>>>>> 0fa73844a1 (GEOMESA-3061 Converters - support bytes in Avro top-level union types (#2762))
=======
>>>>>>> 6e30236dd2 (GEOMESA-3061 Converters - support bytes in Avro top-level union types (#2762))
=======
=======
>>>>>>> d206a68a13 (GEOMESA-3061 Converters - support bytes in Avro top-level union types (#2762))
>>>>>>> e0c2527549 (GEOMESA-3061 Converters - support bytes in Avro top-level union types (#2762))
=======
>>>>>>> 4cf1d8d259 (GEOMESA-3067 Find attribute in Filters with Functions with embedded expressions correctly)
=======
=======
>>>>>>> 694bcd3776 (GEOMESA-3061 Converters - support bytes in Avro top-level union types (#2762))
>>>>>>> cb5e2daf2b (GEOMESA-3061 Converters - support bytes in Avro top-level union types (#2762))
=======
>>>>>>> 9bcad1eb67 (GEOMESA-3067 Find attribute in Filters with Functions with embedded expressions correctly)
=======
>>>>>>> 00e61f4b70 (GEOMESA-3061 Converters - support bytes in Avro top-level union types (#2762))
=======
=======
>>>>>>> 5dcf23da52 (GEOMESA-3061 Converters - support bytes in Avro top-level union types (#2762))
>>>>>>> 60b4637548 (GEOMESA-3061 Converters - support bytes in Avro top-level union types (#2762))
=======
>>>>>>> 6f81d40992 (GEOMESA-3067 Find attribute in Filters with Functions with embedded expressions correctly)
=======
=======
>>>>>>> 92674ff9d4 (GEOMESA-3061 Converters - support bytes in Avro top-level union types (#2762))
>>>>>>> 009a284072 (GEOMESA-3061 Converters - support bytes in Avro top-level union types (#2762))
=======
>>>>>>> 9df4f8a9f6 (GEOMESA-3067 Find attribute in Filters with Functions with embedded expressions correctly)
=======
>>>>>>> 7b8c8dcc3d (GEOMESA-3061 Converters - support bytes in Avro top-level union types (#2762))
=======
=======
>>>>>>> 240977229 (GEOMESA-3061 Converters - support bytes in Avro top-level union types (#2762))
=======
<<<<<<< HEAD
>>>>>>> 8c9ca1211a (GEOMESA-3061 Converters - support bytes in Avro top-level union types (#2762))
<<<<<<< HEAD
>>>>>>> 4f51687745 (GEOMESA-3061 Converters - support bytes in Avro top-level union types (#2762))
=======
=======
>>>>>>> 45ad5d11f (GEOMESA-3061 Converters - support bytes in Avro top-level union types (#2762))
=======
>>>>>>> a22efb4d66 (GEOMESA-3061 Converters - support bytes in Avro top-level union types (#2762))
>>>>>>> 9a2d40c613 (GEOMESA-3061 Converters - support bytes in Avro top-level union types (#2762))
=======
>>>>>>> 73770612e0 (GEOMESA-3061 Converters - support bytes in Avro top-level union types (#2762))
>>>>>>> b9bdd406e (GEOMESA-3061 Converters - support bytes in Avro top-level union types (#2762))
=======
>>>>>>> f36b0e8b9 (GEOMESA-3067 Find attribute in Filters with Functions with embedded expressions correctly)
<<<<<<< HEAD
<<<<<<< HEAD
<<<<<<< HEAD
<<<<<<< HEAD
<<<<<<< HEAD
<<<<<<< HEAD
<<<<<<< HEAD
<<<<<<< HEAD
<<<<<<< HEAD
<<<<<<< HEAD
<<<<<<< HEAD
<<<<<<< HEAD
<<<<<<< HEAD
<<<<<<< HEAD
<<<<<<< HEAD
<<<<<<< HEAD
<<<<<<< HEAD
<<<<<<< HEAD
<<<<<<< HEAD
<<<<<<< HEAD
<<<<<<< HEAD
<<<<<<< HEAD
<<<<<<< HEAD
<<<<<<< HEAD
<<<<<<< HEAD
<<<<<<< HEAD
<<<<<<< HEAD
<<<<<<< HEAD
<<<<<<< HEAD
<<<<<<< HEAD
<<<<<<< HEAD
<<<<<<< HEAD
<<<<<<< HEAD
<<<<<<< HEAD
<<<<<<< HEAD
<<<<<<< HEAD
<<<<<<< HEAD
<<<<<<< HEAD
<<<<<<< HEAD
<<<<<<< HEAD
<<<<<<< HEAD
<<<<<<< HEAD
<<<<<<< HEAD
<<<<<<< HEAD
<<<<<<< HEAD
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
>>>>>>> 9bcad1eb67 (GEOMESA-3067 Find attribute in Filters with Functions with embedded expressions correctly)
=======
>>>>>>> 00e61f4b70 (GEOMESA-3061 Converters - support bytes in Avro top-level union types (#2762))
=======
>>>>>>> 60b4637548 (GEOMESA-3061 Converters - support bytes in Avro top-level union types (#2762))
=======
>>>>>>> 9df4f8a9f6 (GEOMESA-3067 Find attribute in Filters with Functions with embedded expressions correctly)
=======
>>>>>>> 7b8c8dcc3d (GEOMESA-3061 Converters - support bytes in Avro top-level union types (#2762))
=======
>>>>>>> 4f51687745 (GEOMESA-3061 Converters - support bytes in Avro top-level union types (#2762))
=======
>>>>>>> 73770612e0 (GEOMESA-3061 Converters - support bytes in Avro top-level union types (#2762))
=======
>>>>>>> d206a68a13 (GEOMESA-3061 Converters - support bytes in Avro top-level union types (#2762))
=======
>>>>>>> 24c4df93a5 (GEOMESA-3067 Find attribute in Filters with Functions with embedded expressions correctly)
<<<<<<< HEAD
<<<<<<< HEAD
=======
>>>>>>> 6cd1151639 (GEOMESA-3061 Converters - support bytes in Avro top-level union types (#2762))
=======
>>>>>>> 5dcf23da52 (GEOMESA-3061 Converters - support bytes in Avro top-level union types (#2762))
<<<<<<< HEAD
<<<<<<< HEAD
=======
>>>>>>> c169cb2905 (GEOMESA-3067 Find attribute in Filters with Functions with embedded expressions correctly)
=======
>>>>>>> 9a4dff9e4f (GEOMESA-3061 Converters - support bytes in Avro top-level union types (#2762))
<<<<<<< HEAD
<<<<<<< HEAD
=======
>>>>>>> 8c9ca1211a (GEOMESA-3061 Converters - support bytes in Avro top-level union types (#2762))
=======
>>>>>>> 1cad375176 (GEOMESA-3061 Converters - support bytes in Avro top-level union types (#2762))
<<<<<<< HEAD
=======
>>>>>>> 4373c901b3 (GEOMESA-3067 Find attribute in Filters with Functions with embedded expressions correctly)
=======
>>>>>>> 963feec660 (GEOMESA-3061 Converters - support bytes in Avro top-level union types (#2762))
=======
>>>>>>> 99acaa0887 (GEOMESA-3067 Find attribute in Filters with Functions with embedded expressions correctly)
=======
>>>>>>> fe3de10f11 (GEOMESA-3061 Converters - support bytes in Avro top-level union types (#2762))
=======
>>>>>>> bff2bdde04 (GEOMESA-3067 Find attribute in Filters with Functions with embedded expressions correctly)
=======
>>>>>>> a35efac12e (GEOMESA-3061 Converters - support bytes in Avro top-level union types (#2762))
=======
>>>>>>> d83561962d (GEOMESA-3067 Find attribute in Filters with Functions with embedded expressions correctly)
=======
>>>>>>> a5b160f47b (GEOMESA-3061 Converters - support bytes in Avro top-level union types (#2762))
=======
>>>>>>> def2794bb5 (GEOMESA-3067 Find attribute in Filters with Functions with embedded expressions correctly)
=======
>>>>>>> 94fecee1d8 (GEOMESA-3061 Converters - support bytes in Avro top-level union types (#2762))
=======
>>>>>>> 3eb12f79a9 (GEOMESA-3061 Converters - support bytes in Avro top-level union types (#2762))
=======
>>>>>>> f983ea29f0 (GEOMESA-3067 Find attribute in Filters with Functions with embedded expressions correctly)
=======
>>>>>>> 35b69b8f2f (GEOMESA-3061 Converters - support bytes in Avro top-level union types (#2762))
=======
>>>>>>> 26a09ee6c2 (GEOMESA-3061 Converters - support bytes in Avro top-level union types (#2762))
=======
>>>>>>> 7b3c90c53f (GEOMESA-3061 Converters - support bytes in Avro top-level union types (#2762))
=======
>>>>>>> 1278241911 (GEOMESA-3067 Find attribute in Filters with Functions with embedded expressions correctly)
=======
>>>>>>> 3e7fb62639 (GEOMESA-3061 Converters - support bytes in Avro top-level union types (#2762))
=======
>>>>>>> 5d8dab9f81 (GEOMESA-3067 Find attribute in Filters with Functions with embedded expressions correctly)
=======
>>>>>>> 0fa73844a1 (GEOMESA-3061 Converters - support bytes in Avro top-level union types (#2762))
=======
>>>>>>> 53bc726472 (GEOMESA-3067 Find attribute in Filters with Functions with embedded expressions correctly)
=======
>>>>>>> 6e30236dd2 (GEOMESA-3061 Converters - support bytes in Avro top-level union types (#2762))
=======
>>>>>>> 6e297b9b6f (GEOMESA-3067 Find attribute in Filters with Functions with embedded expressions correctly)
=======
=======
>>>>>>> d206a68a13 (GEOMESA-3061 Converters - support bytes in Avro top-level union types (#2762))
>>>>>>> e0c2527549 (GEOMESA-3061 Converters - support bytes in Avro top-level union types (#2762))
=======
>>>>>>> 9bcad1eb67 (GEOMESA-3067 Find attribute in Filters with Functions with embedded expressions correctly)
=======
=======
>>>>>>> 6cd1151639 (GEOMESA-3061 Converters - support bytes in Avro top-level union types (#2762))
>>>>>>> 00e61f4b70 (GEOMESA-3061 Converters - support bytes in Avro top-level union types (#2762))
=======
>>>>>>> 60b4637548 (GEOMESA-3061 Converters - support bytes in Avro top-level union types (#2762))
=======
=======
>>>>>>> c169cb2905 (GEOMESA-3067 Find attribute in Filters with Functions with embedded expressions correctly)
>>>>>>> 9df4f8a9f6 (GEOMESA-3067 Find attribute in Filters with Functions with embedded expressions correctly)
=======
>>>>>>> 7b8c8dcc3d (GEOMESA-3061 Converters - support bytes in Avro top-level union types (#2762))
=======
=======
>>>>>>> 8c9ca1211a (GEOMESA-3061 Converters - support bytes in Avro top-level union types (#2762))
>>>>>>> 4f51687745 (GEOMESA-3061 Converters - support bytes in Avro top-level union types (#2762))
=======
>>>>>>> 73770612e0 (GEOMESA-3061 Converters - support bytes in Avro top-level union types (#2762))
>>>>>>> a63cb7e740 (GEOMESA-3067 Find attribute in Filters with Functions with embedded expressions correctly)
=======
=======
>>>>>>> 9d708b240a (GEOMESA-3061 Converters - support bytes in Avro top-level union types (#2762))
<<<<<<< HEAD
=======
<<<<<<< HEAD
<<<<<<< HEAD
>>>>>>> c3b0a1b6e3 (GEOMESA-3067 Find attribute in Filters with Functions with embedded expressions correctly)
=======
=======
<<<<<<< HEAD
<<<<<<< HEAD
<<<<<<< HEAD
<<<<<<< HEAD
>>>>>>> a5b160f47b (GEOMESA-3061 Converters - support bytes in Avro top-level union types (#2762))
=======
<<<<<<< HEAD
<<<<<<< HEAD
>>>>>>> c3b0a1b6e3 (GEOMESA-3067 Find attribute in Filters with Functions with embedded expressions correctly)
=======
=======
<<<<<<< HEAD
<<<<<<< HEAD
=======
>>>>>>> 00e61f4b70 (GEOMESA-3061 Converters - support bytes in Avro top-level union types (#2762))
=======
>>>>>>> 4f51687745 (GEOMESA-3061 Converters - support bytes in Avro top-level union types (#2762))
>>>>>>> 22dcc8170f (GEOMESA-3061 Converters - support bytes in Avro top-level union types (#2762))
=======
>>>>>>> 238945d4b3 (GEOMESA-3061 Converters - support bytes in Avro top-level union types (#2762))
=======
<<<<<<< HEAD
<<<<<<< HEAD
=======
<<<<<<< HEAD
<<<<<<< HEAD
>>>>>>> 7b0539b808 (GEOMESA-3061 Converters - support bytes in Avro top-level union types (#2762))
=======
>>>>>>> cf57a2c189 (GEOMESA-3067 Find attribute in Filters with Functions with embedded expressions correctly)
=======
<<<<<<< HEAD
<<<<<<< HEAD
>>>>>>> e15d50d7d3 (GEOMESA-3061 Converters - support bytes in Avro top-level union types (#2762))
=======
>>>>>>> 1b60c2aeba (GEOMESA-3067 Find attribute in Filters with Functions with embedded expressions correctly)
=======
<<<<<<< HEAD
<<<<<<< HEAD
>>>>>>> d294ce49e2 (GEOMESA-3061 Converters - support bytes in Avro top-level union types (#2762))
=======
=======
>>>>>>> 7b0539b808 (GEOMESA-3061 Converters - support bytes in Avro top-level union types (#2762))
=======
>>>>>>> 963feec660 (GEOMESA-3061 Converters - support bytes in Avro top-level union types (#2762))
=======
>>>>>>> e15d50d7d3 (GEOMESA-3061 Converters - support bytes in Avro top-level union types (#2762))
=======
>>>>>>> fe3de10f11 (GEOMESA-3061 Converters - support bytes in Avro top-level union types (#2762))
=======
>>>>>>> bff2bdde04 (GEOMESA-3067 Find attribute in Filters with Functions with embedded expressions correctly)
=======
>>>>>>> d294ce49e2 (GEOMESA-3061 Converters - support bytes in Avro top-level union types (#2762))
=======
>>>>>>> a35efac12e (GEOMESA-3061 Converters - support bytes in Avro top-level union types (#2762))
>>>>>>> 9943e05ec9 (GEOMESA-3067 Find attribute in Filters with Functions with embedded expressions correctly)
>>>>>>> 3254b186da (GEOMESA-3067 Find attribute in Filters with Functions with embedded expressions correctly)
=======
=======
>>>>>>> 22dcc8170f (GEOMESA-3061 Converters - support bytes in Avro top-level union types (#2762))
=======
<<<<<<< HEAD
>>>>>>> 8c9ca1211a (GEOMESA-3061 Converters - support bytes in Avro top-level union types (#2762))
=======
>>>>>>> 238945d4b3 (GEOMESA-3061 Converters - support bytes in Avro top-level union types (#2762))
=======
>>>>>>> 1cad375176 (GEOMESA-3061 Converters - support bytes in Avro top-level union types (#2762))
<<<<<<< HEAD
=======
=======
>>>>>>> 99acaa0887 (GEOMESA-3067 Find attribute in Filters with Functions with embedded expressions correctly)
>>>>>>> 9943e05ec9 (GEOMESA-3067 Find attribute in Filters with Functions with embedded expressions correctly)
>>>>>>> 3254b186da (GEOMESA-3067 Find attribute in Filters with Functions with embedded expressions correctly)
=======
>>>>>>> 4373c901b3 (GEOMESA-3067 Find attribute in Filters with Functions with embedded expressions correctly)
=======
>>>>>>> 73770612e0 (GEOMESA-3061 Converters - support bytes in Avro top-level union types (#2762))
>>>>>>> 67b361c85 (GEOMESA-3061 Converters - support bytes in Avro top-level union types (#2762))
>>>>>>> c8a325e13c (GEOMESA-3061 Converters - support bytes in Avro top-level union types (#2762))
=======
>>>>>>> e6e1f4bdd5 (GEOMESA-3061 Converters - support bytes in Avro top-level union types (#2762))
=======
<<<<<<< HEAD
<<<<<<< HEAD
>>>>>>> 8fb0607344 (GEOMESA-3067 Find attribute in Filters with Functions with embedded expressions correctly)
=======
=======
>>>>>>> 67b361c85 (GEOMESA-3061 Converters - support bytes in Avro top-level union types (#2762))
>>>>>>> ad3cedc4db (GEOMESA-3061 Converters - support bytes in Avro top-level union types (#2762))
=======
<<<<<<< HEAD
<<<<<<< HEAD
>>>>>>> 240977229 (GEOMESA-3061 Converters - support bytes in Avro top-level union types (#2762))
=======
=======
>>>>>>> 67b361c85 (GEOMESA-3061 Converters - support bytes in Avro top-level union types (#2762))
>>>>>>> dace2085b (GEOMESA-3061 Converters - support bytes in Avro top-level union types (#2762))
=======
=======
<<<<<<< HEAD
<<<<<<< HEAD
<<<<<<< HEAD
<<<<<<< HEAD
=======
>>>>>>> 73770612e0 (GEOMESA-3061 Converters - support bytes in Avro top-level union types (#2762))
>>>>>>> 9813375fcc (GEOMESA-3067 Find attribute in Filters with Functions with embedded expressions correctly)
=======
>>>>>>> c9328eddce (GEOMESA-3061 Converters - support bytes in Avro top-level union types (#2762))
=======
<<<<<<< HEAD
<<<<<<< HEAD
>>>>>>> 38b3282770 (GEOMESA-3067 Find attribute in Filters with Functions with embedded expressions correctly)
=======
>>>>>>> 9abc630fdf (GEOMESA-3061 Converters - support bytes in Avro top-level union types (#2762))
=======
<<<<<<< HEAD
=======
>>>>>>> 963feec660 (GEOMESA-3061 Converters - support bytes in Avro top-level union types (#2762))
=======
>>>>>>> 9813375fcc (GEOMESA-3067 Find attribute in Filters with Functions with embedded expressions correctly)
=======
>>>>>>> 99acaa0887 (GEOMESA-3067 Find attribute in Filters with Functions with embedded expressions correctly)
=======
>>>>>>> fe3de10f11 (GEOMESA-3061 Converters - support bytes in Avro top-level union types (#2762))
=======
>>>>>>> 38b3282770 (GEOMESA-3067 Find attribute in Filters with Functions with embedded expressions correctly)
=======
>>>>>>> bff2bdde04 (GEOMESA-3067 Find attribute in Filters with Functions with embedded expressions correctly)
=======
>>>>>>> a35efac12e (GEOMESA-3061 Converters - support bytes in Avro top-level union types (#2762))
>>>>>>> 67b361c85 (GEOMESA-3061 Converters - support bytes in Avro top-level union types (#2762))
=======
>>>>>>> 9d708b240 (GEOMESA-3061 Converters - support bytes in Avro top-level union types (#2762))
>>>>>>> 53a3e72cbf (GEOMESA-3061 Converters - support bytes in Avro top-level union types (#2762))
=======
<<<<<<< HEAD
<<<<<<< HEAD
>>>>>>> c3b0a1b6e (GEOMESA-3067 Find attribute in Filters with Functions with embedded expressions correctly)
=======
>>>>>>> c3b0a1b6e (GEOMESA-3067 Find attribute in Filters with Functions with embedded expressions correctly)
=======
<<<<<<< HEAD
>>>>>>> 99acaa0887 (GEOMESA-3067 Find attribute in Filters with Functions with embedded expressions correctly)
=======
=======
>>>>>>> 67b361c85 (GEOMESA-3061 Converters - support bytes in Avro top-level union types (#2762))
>>>>>>> c8a325e13 (GEOMESA-3061 Converters - support bytes in Avro top-level union types (#2762))
=======
>>>>>>> 8fb060734 (GEOMESA-3067 Find attribute in Filters with Functions with embedded expressions correctly)
<<<<<<< HEAD
=======
=======
<<<<<<< HEAD
>>>>>>> bff2bdde04 (GEOMESA-3067 Find attribute in Filters with Functions with embedded expressions correctly)
=======
=======
>>>>>>> 67b361c85 (GEOMESA-3061 Converters - support bytes in Avro top-level union types (#2762))
>>>>>>> ad3cedc4d (GEOMESA-3061 Converters - support bytes in Avro top-level union types (#2762))
=======
>>>>>>> 125ffd0575 (GEOMESA-3067 Find attribute in Filters with Functions with embedded expressions correctly)
<<<<<<< HEAD
=======
=======
>>>>>>> d83561962d (GEOMESA-3067 Find attribute in Filters with Functions with embedded expressions correctly)
=======
=======
>>>>>>> d206a68a13 (GEOMESA-3061 Converters - support bytes in Avro top-level union types (#2762))
=======
>>>>>>> c3b0a1b6e3 (GEOMESA-3067 Find attribute in Filters with Functions with embedded expressions correctly)
=======
>>>>>>> 24c4df93a5 (GEOMESA-3067 Find attribute in Filters with Functions with embedded expressions correctly)
=======
>>>>>>> 67b361c85 (GEOMESA-3061 Converters - support bytes in Avro top-level union types (#2762))
>>>>>>> c8a325e13c (GEOMESA-3061 Converters - support bytes in Avro top-level union types (#2762))
=======
>>>>>>> 6cd1151639 (GEOMESA-3061 Converters - support bytes in Avro top-level union types (#2762))
=======
>>>>>>> 5dcf23da52 (GEOMESA-3061 Converters - support bytes in Avro top-level union types (#2762))
=======
>>>>>>> 8fb0607344 (GEOMESA-3067 Find attribute in Filters with Functions with embedded expressions correctly)
=======
>>>>>>> c169cb2905 (GEOMESA-3067 Find attribute in Filters with Functions with embedded expressions correctly)
=======
>>>>>>> 9a4dff9e4f (GEOMESA-3061 Converters - support bytes in Avro top-level union types (#2762))
=======
>>>>>>> 240977229 (GEOMESA-3061 Converters - support bytes in Avro top-level union types (#2762))
=======
>>>>>>> 8c9ca1211a (GEOMESA-3061 Converters - support bytes in Avro top-level union types (#2762))
=======
=======
>>>>>>> 1cad375176 (GEOMESA-3061 Converters - support bytes in Avro top-level union types (#2762))
<<<<<<< HEAD
=======
=======
>>>>>>> 963feec660 (GEOMESA-3061 Converters - support bytes in Avro top-level union types (#2762))
=======
>>>>>>> 67b361c85 (GEOMESA-3061 Converters - support bytes in Avro top-level union types (#2762))
>>>>>>> c8a325e13 (GEOMESA-3061 Converters - support bytes in Avro top-level union types (#2762))
=======
=======
>>>>>>> fe3de10f11 (GEOMESA-3061 Converters - support bytes in Avro top-level union types (#2762))
=======
>>>>>>> 67b361c85 (GEOMESA-3061 Converters - support bytes in Avro top-level union types (#2762))
>>>>>>> ad3cedc4d (GEOMESA-3061 Converters - support bytes in Avro top-level union types (#2762))
=======
=======
>>>>>>> a35efac12e (GEOMESA-3061 Converters - support bytes in Avro top-level union types (#2762))
=======
=======
>>>>>>> 22dcc8170f (GEOMESA-3061 Converters - support bytes in Avro top-level union types (#2762))
=======
>>>>>>> 26a09ee6c2 (GEOMESA-3061 Converters - support bytes in Avro top-level union types (#2762))
=======
>>>>>>> 7b3c90c53f (GEOMESA-3061 Converters - support bytes in Avro top-level union types (#2762))
=======
=======
>>>>>>> 7b0539b808 (GEOMESA-3061 Converters - support bytes in Avro top-level union types (#2762))
=======
>>>>>>> cf57a2c189 (GEOMESA-3067 Find attribute in Filters with Functions with embedded expressions correctly)
=======
>>>>>>> e15d50d7d3 (GEOMESA-3061 Converters - support bytes in Avro top-level union types (#2762))
=======
>>>>>>> 1b60c2aeba (GEOMESA-3067 Find attribute in Filters with Functions with embedded expressions correctly)
=======
>>>>>>> d294ce49e2 (GEOMESA-3061 Converters - support bytes in Avro top-level union types (#2762))
=======
>>>>>>> 9943e05ec9 (GEOMESA-3067 Find attribute in Filters with Functions with embedded expressions correctly)
>>>>>>> 3254b186da (GEOMESA-3067 Find attribute in Filters with Functions with embedded expressions correctly)
=======
<<<<<<< HEAD
>>>>>>> 1278241911 (GEOMESA-3067 Find attribute in Filters with Functions with embedded expressions correctly)
=======
=======
>>>>>>> 22dcc8170f (GEOMESA-3061 Converters - support bytes in Avro top-level union types (#2762))
=======
>>>>>>> 8c9ca1211a (GEOMESA-3061 Converters - support bytes in Avro top-level union types (#2762))
>>>>>>> 4f51687745 (GEOMESA-3061 Converters - support bytes in Avro top-level union types (#2762))
>>>>>>> 67b361c85 (GEOMESA-3061 Converters - support bytes in Avro top-level union types (#2762))
>>>>>>> c8a325e13c (GEOMESA-3061 Converters - support bytes in Avro top-level union types (#2762))
=======
>>>>>>> e6e1f4bdd5 (GEOMESA-3061 Converters - support bytes in Avro top-level union types (#2762))
=======
<<<<<<< HEAD
<<<<<<< HEAD
>>>>>>> 8fb0607344 (GEOMESA-3067 Find attribute in Filters with Functions with embedded expressions correctly)
=======
=======
<<<<<<< HEAD
>>>>>>> 94fecee1d8 (GEOMESA-3061 Converters - support bytes in Avro top-level union types (#2762))
=======
>>>>>>> 67b361c85 (GEOMESA-3061 Converters - support bytes in Avro top-level union types (#2762))
>>>>>>> ad3cedc4db (GEOMESA-3061 Converters - support bytes in Avro top-level union types (#2762))
=======
<<<<<<< HEAD
<<<<<<< HEAD
>>>>>>> 240977229 (GEOMESA-3061 Converters - support bytes in Avro top-level union types (#2762))
=======
=======
<<<<<<< HEAD
>>>>>>> 35b69b8f2f (GEOMESA-3061 Converters - support bytes in Avro top-level union types (#2762))
=======
>>>>>>> 67b361c85 (GEOMESA-3061 Converters - support bytes in Avro top-level union types (#2762))
>>>>>>> dace2085b (GEOMESA-3061 Converters - support bytes in Avro top-level union types (#2762))
=======
=======
<<<<<<< HEAD
<<<<<<< HEAD
>>>>>>> 7b3c90c53f (GEOMESA-3061 Converters - support bytes in Avro top-level union types (#2762))
=======
>>>>>>> 9813375fcc (GEOMESA-3067 Find attribute in Filters with Functions with embedded expressions correctly)
>>>>>>> 5d8dab9f81 (GEOMESA-3067 Find attribute in Filters with Functions with embedded expressions correctly)
=======
>>>>>>> c9328eddce (GEOMESA-3061 Converters - support bytes in Avro top-level union types (#2762))
=======
>>>>>>> 38b3282770 (GEOMESA-3067 Find attribute in Filters with Functions with embedded expressions correctly)
=======
>>>>>>> 9abc630fdf (GEOMESA-3061 Converters - support bytes in Avro top-level union types (#2762))
=======
>>>>>>> 67b361c85 (GEOMESA-3061 Converters - support bytes in Avro top-level union types (#2762))
=======
>>>>>>> 9d708b240 (GEOMESA-3061 Converters - support bytes in Avro top-level union types (#2762))
>>>>>>> 53a3e72cbf (GEOMESA-3061 Converters - support bytes in Avro top-level union types (#2762))
=======
>>>>>>> c3b0a1b6e (GEOMESA-3067 Find attribute in Filters with Functions with embedded expressions correctly)
=======
=======
<<<<<<< HEAD
>>>>>>> 3e7fb62639 (GEOMESA-3061 Converters - support bytes in Avro top-level union types (#2762))
=======
>>>>>>> 67b361c85 (GEOMESA-3061 Converters - support bytes in Avro top-level union types (#2762))
>>>>>>> c8a325e13 (GEOMESA-3061 Converters - support bytes in Avro top-level union types (#2762))
=======
>>>>>>> 8fb060734 (GEOMESA-3067 Find attribute in Filters with Functions with embedded expressions correctly)
=======
=======
<<<<<<< HEAD
>>>>>>> 0fa73844a1 (GEOMESA-3061 Converters - support bytes in Avro top-level union types (#2762))
=======
>>>>>>> 67b361c85 (GEOMESA-3061 Converters - support bytes in Avro top-level union types (#2762))
>>>>>>> ad3cedc4d (GEOMESA-3061 Converters - support bytes in Avro top-level union types (#2762))
=======
>>>>>>> 125ffd0575 (GEOMESA-3067 Find attribute in Filters with Functions with embedded expressions correctly)
=======
=======
<<<<<<< HEAD
>>>>>>> 6e30236dd2 (GEOMESA-3061 Converters - support bytes in Avro top-level union types (#2762))
=======
>>>>>>> d206a68a13 (GEOMESA-3061 Converters - support bytes in Avro top-level union types (#2762))
=======
<<<<<<< HEAD
>>>>>>> e0c2527549 (GEOMESA-3061 Converters - support bytes in Avro top-level union types (#2762))
=======
>>>>>>> c3b0a1b6e3 (GEOMESA-3067 Find attribute in Filters with Functions with embedded expressions correctly)
=======
>>>>>>> 24c4df93a5 (GEOMESA-3067 Find attribute in Filters with Functions with embedded expressions correctly)
=======
<<<<<<< HEAD
>>>>>>> 9bcad1eb67 (GEOMESA-3067 Find attribute in Filters with Functions with embedded expressions correctly)
=======
>>>>>>> 67b361c85 (GEOMESA-3061 Converters - support bytes in Avro top-level union types (#2762))
>>>>>>> c8a325e13c (GEOMESA-3061 Converters - support bytes in Avro top-level union types (#2762))
=======
>>>>>>> 6cd1151639 (GEOMESA-3061 Converters - support bytes in Avro top-level union types (#2762))
=======
<<<<<<< HEAD
>>>>>>> 00e61f4b70 (GEOMESA-3061 Converters - support bytes in Avro top-level union types (#2762))
=======
>>>>>>> 5dcf23da52 (GEOMESA-3061 Converters - support bytes in Avro top-level union types (#2762))
=======
<<<<<<< HEAD
>>>>>>> 60b4637548 (GEOMESA-3061 Converters - support bytes in Avro top-level union types (#2762))
=======
>>>>>>> 8fb0607344 (GEOMESA-3067 Find attribute in Filters with Functions with embedded expressions correctly)
=======
>>>>>>> c169cb2905 (GEOMESA-3067 Find attribute in Filters with Functions with embedded expressions correctly)
=======
<<<<<<< HEAD
>>>>>>> 9df4f8a9f6 (GEOMESA-3067 Find attribute in Filters with Functions with embedded expressions correctly)
=======
>>>>>>> 9a4dff9e4f (GEOMESA-3061 Converters - support bytes in Avro top-level union types (#2762))
=======
<<<<<<< HEAD
>>>>>>> 7b8c8dcc3d (GEOMESA-3061 Converters - support bytes in Avro top-level union types (#2762))
=======
>>>>>>> 240977229 (GEOMESA-3061 Converters - support bytes in Avro top-level union types (#2762))
=======
>>>>>>> 8c9ca1211a (GEOMESA-3061 Converters - support bytes in Avro top-level union types (#2762))
=======
>>>>>>> 4f51687745 (GEOMESA-3061 Converters - support bytes in Avro top-level union types (#2762))
=======
>>>>>>> 73770612e0 (GEOMESA-3061 Converters - support bytes in Avro top-level union types (#2762))
>>>>>>> b9bdd406e (GEOMESA-3061 Converters - support bytes in Avro top-level union types (#2762))
>>>>>>> cdb410251 (GEOMESA-3061 Converters - support bytes in Avro top-level union types (#2762))
<<<<<<< HEAD
<<<<<<< HEAD
<<<<<<< HEAD
<<<<<<< HEAD
<<<<<<< HEAD
<<<<<<< HEAD
<<<<<<< HEAD
<<<<<<< HEAD
<<<<<<< HEAD
<<<<<<< HEAD
<<<<<<< HEAD
<<<<<<< HEAD
<<<<<<< HEAD
<<<<<<< HEAD
<<<<<<< HEAD
<<<<<<< HEAD
<<<<<<< HEAD
<<<<<<< HEAD
<<<<<<< HEAD
<<<<<<< HEAD
<<<<<<< HEAD
<<<<<<< HEAD
<<<<<<< HEAD
<<<<<<< HEAD
<<<<<<< HEAD
<<<<<<< HEAD
<<<<<<< HEAD
<<<<<<< HEAD
<<<<<<< HEAD
<<<<<<< HEAD
<<<<<<< HEAD
<<<<<<< HEAD
<<<<<<< HEAD
<<<<<<< HEAD
<<<<<<< HEAD
<<<<<<< HEAD
<<<<<<< HEAD
<<<<<<< HEAD
<<<<<<< HEAD
<<<<<<< HEAD
<<<<<<< HEAD
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
>>>>>>> 4cf1d8d259 (GEOMESA-3067 Find attribute in Filters with Functions with embedded expressions correctly)
=======
>>>>>>> 00e61f4b70 (GEOMESA-3061 Converters - support bytes in Avro top-level union types (#2762))
=======
>>>>>>> 60b4637548 (GEOMESA-3061 Converters - support bytes in Avro top-level union types (#2762))
=======
>>>>>>> 6f81d40992 (GEOMESA-3067 Find attribute in Filters with Functions with embedded expressions correctly)
=======
>>>>>>> 7b8c8dcc3d (GEOMESA-3061 Converters - support bytes in Avro top-level union types (#2762))
=======
>>>>>>> 4f51687745 (GEOMESA-3061 Converters - support bytes in Avro top-level union types (#2762))
=======
>>>>>>> 73770612e0 (GEOMESA-3061 Converters - support bytes in Avro top-level union types (#2762))
=======
>>>>>>> d206a68a13 (GEOMESA-3061 Converters - support bytes in Avro top-level union types (#2762))
=======
>>>>>>> 9412e85b59 (GEOMESA-3067 Find attribute in Filters with Functions with embedded expressions correctly)
<<<<<<< HEAD
<<<<<<< HEAD
=======
>>>>>>> 6cd1151639 (GEOMESA-3061 Converters - support bytes in Avro top-level union types (#2762))
=======
>>>>>>> 5dcf23da52 (GEOMESA-3061 Converters - support bytes in Avro top-level union types (#2762))
<<<<<<< HEAD
<<<<<<< HEAD
=======
>>>>>>> 2b62d1f3fe (GEOMESA-3067 Find attribute in Filters with Functions with embedded expressions correctly)
=======
>>>>>>> 9a4dff9e4f (GEOMESA-3061 Converters - support bytes in Avro top-level union types (#2762))
<<<<<<< HEAD
<<<<<<< HEAD
=======
>>>>>>> 8c9ca1211a (GEOMESA-3061 Converters - support bytes in Avro top-level union types (#2762))
=======
>>>>>>> 1cad375176 (GEOMESA-3061 Converters - support bytes in Avro top-level union types (#2762))
<<<<<<< HEAD
=======
>>>>>>> 963feec660 (GEOMESA-3061 Converters - support bytes in Avro top-level union types (#2762))
=======
>>>>>>> 2c14568a23 (GEOMESA-3067 Find attribute in Filters with Functions with embedded expressions correctly)
=======
>>>>>>> fe3de10f11 (GEOMESA-3061 Converters - support bytes in Avro top-level union types (#2762))
=======
>>>>>>> 511bd92a86 (GEOMESA-3067 Find attribute in Filters with Functions with embedded expressions correctly)
=======
>>>>>>> a35efac12e (GEOMESA-3061 Converters - support bytes in Avro top-level union types (#2762))
=======
>>>>>>> de7d6ef448 (GEOMESA-3067 Find attribute in Filters with Functions with embedded expressions correctly)
=======
>>>>>>> a5b160f47b (GEOMESA-3061 Converters - support bytes in Avro top-level union types (#2762))
=======
>>>>>>> fa429c7863 (GEOMESA-3067 Find attribute in Filters with Functions with embedded expressions correctly)
=======
>>>>>>> 94fecee1d8 (GEOMESA-3061 Converters - support bytes in Avro top-level union types (#2762))
=======
>>>>>>> 3eb12f79a9 (GEOMESA-3061 Converters - support bytes in Avro top-level union types (#2762))
=======
>>>>>>> 8b16ac5c65 (GEOMESA-3067 Find attribute in Filters with Functions with embedded expressions correctly)
=======
>>>>>>> 35b69b8f2f (GEOMESA-3061 Converters - support bytes in Avro top-level union types (#2762))
=======
>>>>>>> 26a09ee6c2 (GEOMESA-3061 Converters - support bytes in Avro top-level union types (#2762))
=======
>>>>>>> 7b3c90c53f (GEOMESA-3061 Converters - support bytes in Avro top-level union types (#2762))
=======
>>>>>>> 3e7fb62639 (GEOMESA-3061 Converters - support bytes in Avro top-level union types (#2762))
=======
>>>>>>> 00d66ae013 (GEOMESA-3067 Find attribute in Filters with Functions with embedded expressions correctly)
=======
>>>>>>> 0fa73844a1 (GEOMESA-3061 Converters - support bytes in Avro top-level union types (#2762))
=======
>>>>>>> 8e70a881a6 (GEOMESA-3067 Find attribute in Filters with Functions with embedded expressions correctly)
=======
>>>>>>> 6e30236dd2 (GEOMESA-3061 Converters - support bytes in Avro top-level union types (#2762))
=======
>>>>>>> f7fc21ae20 (GEOMESA-3067 Find attribute in Filters with Functions with embedded expressions correctly)
=======
=======
>>>>>>> d206a68a13 (GEOMESA-3061 Converters - support bytes in Avro top-level union types (#2762))
>>>>>>> e0c2527549 (GEOMESA-3061 Converters - support bytes in Avro top-level union types (#2762))
=======
>>>>>>> 4cf1d8d259 (GEOMESA-3067 Find attribute in Filters with Functions with embedded expressions correctly)
=======
=======
>>>>>>> 6cd1151639 (GEOMESA-3061 Converters - support bytes in Avro top-level union types (#2762))
>>>>>>> 00e61f4b70 (GEOMESA-3061 Converters - support bytes in Avro top-level union types (#2762))
=======
>>>>>>> 60b4637548 (GEOMESA-3061 Converters - support bytes in Avro top-level union types (#2762))
=======
=======
>>>>>>> 2b62d1f3fe (GEOMESA-3067 Find attribute in Filters with Functions with embedded expressions correctly)
>>>>>>> 6f81d40992 (GEOMESA-3067 Find attribute in Filters with Functions with embedded expressions correctly)
=======
>>>>>>> 7b8c8dcc3d (GEOMESA-3061 Converters - support bytes in Avro top-level union types (#2762))
=======
=======
>>>>>>> 8c9ca1211a (GEOMESA-3061 Converters - support bytes in Avro top-level union types (#2762))
>>>>>>> 4f51687745 (GEOMESA-3061 Converters - support bytes in Avro top-level union types (#2762))
=======
>>>>>>> 73770612e0 (GEOMESA-3061 Converters - support bytes in Avro top-level union types (#2762))
>>>>>>> 67b361c856 (GEOMESA-3061 Converters - support bytes in Avro top-level union types (#2762))
=======
>>>>>>> 908ad4071d (GEOMESA-3067 Find attribute in Filters with Functions with embedded expressions correctly)
=======
=======
>>>>>>> b9bdd406e (GEOMESA-3061 Converters - support bytes in Avro top-level union types (#2762))
>>>>>>> b4320946b4 (GEOMESA-3061 Converters - support bytes in Avro top-level union types (#2762))
=======
>>>>>>> 3be8d2a5a4 (Merge branch 'feature/postgis-fixes')
=======
>>>>>>> 907fb0b08a (GEOMESA-3067 Find attribute in Filters with Functions with embedded expressions correctly)
<<<<<<< HEAD
<<<<<<< HEAD
<<<<<<< HEAD
<<<<<<< HEAD
<<<<<<< HEAD
<<<<<<< HEAD
=======
>>>>>>> 810876750d (GEOMESA-3061 Converters - support bytes in Avro top-level union types (#2762))
=======
>>>>>>> d498bef1ce (GEOMESA-3061 Converters - support bytes in Avro top-level union types (#2762))
=======
>>>>>>> ca1e0fad13 (GEOMESA-3067 Find attribute in Filters with Functions with embedded expressions correctly)
=======
=======
>>>>>>> 810876750d (GEOMESA-3061 Converters - support bytes in Avro top-level union types (#2762))
>>>>>>> 5a55bf9756 (GEOMESA-3061 Converters - support bytes in Avro top-level union types (#2762))
=======
=======
>>>>>>> b9bdd406e (GEOMESA-3061 Converters - support bytes in Avro top-level union types (#2762))
>>>>>>> d9ed077cd1 (GEOMESA-3061 Converters - support bytes in Avro top-level union types (#2762))
<<<<<<< HEAD
<<<<<<< HEAD
<<<<<<< HEAD
<<<<<<< HEAD
<<<<<<< HEAD
<<<<<<< HEAD
=======
>>>>>>> 5a55bf9756 (GEOMESA-3061 Converters - support bytes in Avro top-level union types (#2762))
=======
>>>>>>> adfec3a47a (GEOMESA-3067 Find attribute in Filters with Functions with embedded expressions correctly)
=======
=======
>>>>>>> c3c5dd0ebb (GEOMESA-3061 Converters - support bytes in Avro top-level union types (#2762))
=======
<<<<<<< HEAD
<<<<<<< HEAD
<<<<<<< HEAD
<<<<<<< HEAD
>>>>>>> 67b361c85 (GEOMESA-3061 Converters - support bytes in Avro top-level union types (#2762))
=======
=======
>>>>>>> 2654d9c120 (GEOMESA-3061 Converters - support bytes in Avro top-level union types (#2762))
=======
>>>>>>> 67b361c85 (GEOMESA-3061 Converters - support bytes in Avro top-level union types (#2762))
=======
>>>>>>> 86ec77f9cb (GEOMESA-3061 Converters - support bytes in Avro top-level union types (#2762))
=======
>>>>>>> 058fd96baa (GEOMESA-3061 Converters - support bytes in Avro top-level union types (#2762))
=======
>>>>>>> 67b361c85 (GEOMESA-3061 Converters - support bytes in Avro top-level union types (#2762))
=======
>>>>>>> 2a887f75bf (GEOMESA-3061 Converters - support bytes in Avro top-level union types (#2762))
>>>>>>> b9bdd406e (GEOMESA-3061 Converters - support bytes in Avro top-level union types (#2762))
=======
>>>>>>> f36b0e8b9 (GEOMESA-3067 Find attribute in Filters with Functions with embedded expressions correctly)
<<<<<<< HEAD
<<<<<<< HEAD
<<<<<<< HEAD
<<<<<<< HEAD
<<<<<<< HEAD
<<<<<<< HEAD
=======
>>>>>>> 2654d9c120 (GEOMESA-3061 Converters - support bytes in Avro top-level union types (#2762))
=======
>>>>>>> 86ec77f9cb (GEOMESA-3061 Converters - support bytes in Avro top-level union types (#2762))
=======
>>>>>>> 058fd96baa (GEOMESA-3061 Converters - support bytes in Avro top-level union types (#2762))
=======
>>>>>>> 2a887f75bf (GEOMESA-3061 Converters - support bytes in Avro top-level union types (#2762))
>>>>>>> e182e6e99c (GEOMESA-3067 Find attribute in Filters with Functions with embedded expressions correctly)
=======
>>>>>>> 9d708b240a (GEOMESA-3061 Converters - support bytes in Avro top-level union types (#2762))
=======
=======
>>>>>>> c8a325e13c (GEOMESA-3061 Converters - support bytes in Avro top-level union types (#2762))
=======
>>>>>>> ad3cedc4db (GEOMESA-3061 Converters - support bytes in Avro top-level union types (#2762))
=======
<<<<<<< HEAD
<<<<<<< HEAD
<<<<<<< HEAD
<<<<<<< HEAD
<<<<<<< HEAD
<<<<<<< HEAD
=======
>>>>>>> 7b8c8dcc3d (GEOMESA-3061 Converters - support bytes in Avro top-level union types (#2762))
=======
>>>>>>> 4f51687745 (GEOMESA-3061 Converters - support bytes in Avro top-level union types (#2762))
>>>>>>> 22dcc8170f (GEOMESA-3061 Converters - support bytes in Avro top-level union types (#2762))
=======
=======
<<<<<<< HEAD
<<<<<<< HEAD
<<<<<<< HEAD
<<<<<<< HEAD
<<<<<<< HEAD
>>>>>>> 7b0539b808 (GEOMESA-3061 Converters - support bytes in Avro top-level union types (#2762))
=======
>>>>>>> 982031ef44 (GEOMESA-3067 Find attribute in Filters with Functions with embedded expressions correctly)
=======
>>>>>>> e15d50d7d3 (GEOMESA-3061 Converters - support bytes in Avro top-level union types (#2762))
=======
<<<<<<< HEAD
<<<<<<< HEAD
>>>>>>> 912169b5e9 (GEOMESA-3067 Find attribute in Filters with Functions with embedded expressions correctly)
=======
>>>>>>> d294ce49e2 (GEOMESA-3061 Converters - support bytes in Avro top-level union types (#2762))
=======
<<<<<<< HEAD
=======
>>>>>>> 7b0539b808 (GEOMESA-3061 Converters - support bytes in Avro top-level union types (#2762))
=======
<<<<<<< HEAD
>>>>>>> 963feec660 (GEOMESA-3061 Converters - support bytes in Avro top-level union types (#2762))
=======
>>>>>>> 982031ef44 (GEOMESA-3067 Find attribute in Filters with Functions with embedded expressions correctly)
=======
>>>>>>> 2c14568a23 (GEOMESA-3067 Find attribute in Filters with Functions with embedded expressions correctly)
=======
>>>>>>> fe3de10f11 (GEOMESA-3061 Converters - support bytes in Avro top-level union types (#2762))
=======
>>>>>>> 912169b5e9 (GEOMESA-3067 Find attribute in Filters with Functions with embedded expressions correctly)
=======
>>>>>>> 511bd92a86 (GEOMESA-3067 Find attribute in Filters with Functions with embedded expressions correctly)
=======
>>>>>>> a35efac12e (GEOMESA-3061 Converters - support bytes in Avro top-level union types (#2762))
>>>>>>> dace2085b (GEOMESA-3061 Converters - support bytes in Avro top-level union types (#2762))
>>>>>>> 238945d4b3 (GEOMESA-3061 Converters - support bytes in Avro top-level union types (#2762))
=======
>>>>>>> 53a3e72cbf (GEOMESA-3061 Converters - support bytes in Avro top-level union types (#2762))
=======
<<<<<<< HEAD
<<<<<<< HEAD
>>>>>>> d15af7157e (GEOMESA-3067 Find attribute in Filters with Functions with embedded expressions correctly)
=======
=======
<<<<<<< HEAD
<<<<<<< HEAD
>>>>>>> 04f08c23c5 (GEOMESA-3067 Find attribute in Filters with Functions with embedded expressions correctly)
=======
>>>>>>> 9abc630fdf (GEOMESA-3061 Converters - support bytes in Avro top-level union types (#2762))
=======
=======
>>>>>>> 04f08c23c5 (GEOMESA-3067 Find attribute in Filters with Functions with embedded expressions correctly)
=======
<<<<<<< HEAD
>>>>>>> 511bd92a86 (GEOMESA-3067 Find attribute in Filters with Functions with embedded expressions correctly)
=======
>>>>>>> 9abc630fdf (GEOMESA-3061 Converters - support bytes in Avro top-level union types (#2762))
=======
>>>>>>> a35efac12e (GEOMESA-3061 Converters - support bytes in Avro top-level union types (#2762))
>>>>>>> c8a325e13 (GEOMESA-3061 Converters - support bytes in Avro top-level union types (#2762))
>>>>>>> c9328eddce (GEOMESA-3061 Converters - support bytes in Avro top-level union types (#2762))
=======
>>>>>>> ad3cedc4d (GEOMESA-3061 Converters - support bytes in Avro top-level union types (#2762))
=======
<<<<<<< HEAD
<<<<<<< HEAD
<<<<<<< HEAD
=======
>>>>>>> 86ec77f9cb (GEOMESA-3061 Converters - support bytes in Avro top-level union types (#2762))
=======
>>>>>>> 67b361c85 (GEOMESA-3061 Converters - support bytes in Avro top-level union types (#2762))
=======
=======
>>>>>>> b9bdd406e (GEOMESA-3061 Converters - support bytes in Avro top-level union types (#2762))
>>>>>>> cdb410251 (GEOMESA-3061 Converters - support bytes in Avro top-level union types (#2762))
<<<<<<< HEAD
>>>>>>> f302a54949 (GEOMESA-3061 Converters - support bytes in Avro top-level union types (#2762))
=======
<<<<<<< HEAD
=======
>>>>>>> 9a4dff9e4f (GEOMESA-3061 Converters - support bytes in Avro top-level union types (#2762))
=======
>>>>>>> 22dcc8170f (GEOMESA-3061 Converters - support bytes in Avro top-level union types (#2762))
=======
>>>>>>> 8c9ca1211a (GEOMESA-3061 Converters - support bytes in Avro top-level union types (#2762))
=======
>>>>>>> dace2085b (GEOMESA-3061 Converters - support bytes in Avro top-level union types (#2762))
>>>>>>> 238945d4b3 (GEOMESA-3061 Converters - support bytes in Avro top-level union types (#2762))
=======
>>>>>>> 1cad375176 (GEOMESA-3061 Converters - support bytes in Avro top-level union types (#2762))
=======
>>>>>>> 963feec660 (GEOMESA-3061 Converters - support bytes in Avro top-level union types (#2762))
=======
>>>>>>> d15af7157e (GEOMESA-3067 Find attribute in Filters with Functions with embedded expressions correctly)
=======
>>>>>>> 2c14568a23 (GEOMESA-3067 Find attribute in Filters with Functions with embedded expressions correctly)
=======
>>>>>>> c8a325e13 (GEOMESA-3061 Converters - support bytes in Avro top-level union types (#2762))
>>>>>>> c9328eddce (GEOMESA-3061 Converters - support bytes in Avro top-level union types (#2762))
=======
>>>>>>> fe3de10f11 (GEOMESA-3061 Converters - support bytes in Avro top-level union types (#2762))
=======
>>>>>>> a35efac12e (GEOMESA-3061 Converters - support bytes in Avro top-level union types (#2762))
=======
>>>>>>> 86ec77f9cb (GEOMESA-3061 Converters - support bytes in Avro top-level union types (#2762))
=======
>>>>>>> 35b69b8f2f (GEOMESA-3061 Converters - support bytes in Avro top-level union types (#2762))
=======
>>>>>>> 22dcc8170f (GEOMESA-3061 Converters - support bytes in Avro top-level union types (#2762))
=======
>>>>>>> 26a09ee6c2 (GEOMESA-3061 Converters - support bytes in Avro top-level union types (#2762))
=======
>>>>>>> dace2085b (GEOMESA-3061 Converters - support bytes in Avro top-level union types (#2762))
>>>>>>> 238945d4b3 (GEOMESA-3061 Converters - support bytes in Avro top-level union types (#2762))
=======
>>>>>>> 7b3c90c53f (GEOMESA-3061 Converters - support bytes in Avro top-level union types (#2762))
=======
=======
>>>>>>> 73770612e0 (GEOMESA-3061 Converters - support bytes in Avro top-level union types (#2762))
>>>>>>> 7b0539b808 (GEOMESA-3061 Converters - support bytes in Avro top-level union types (#2762))
=======
>>>>>>> 982031ef44 (GEOMESA-3067 Find attribute in Filters with Functions with embedded expressions correctly)
=======
>>>>>>> e15d50d7d3 (GEOMESA-3061 Converters - support bytes in Avro top-level union types (#2762))
=======
>>>>>>> 912169b5e9 (GEOMESA-3067 Find attribute in Filters with Functions with embedded expressions correctly)
=======
>>>>>>> d294ce49e2 (GEOMESA-3061 Converters - support bytes in Avro top-level union types (#2762))
=======
>>>>>>> dace2085b (GEOMESA-3061 Converters - support bytes in Avro top-level union types (#2762))
>>>>>>> 238945d4b3 (GEOMESA-3061 Converters - support bytes in Avro top-level union types (#2762))
=======
>>>>>>> 53a3e72cbf (GEOMESA-3061 Converters - support bytes in Avro top-level union types (#2762))
=======
<<<<<<< HEAD
>>>>>>> 3e7fb62639 (GEOMESA-3061 Converters - support bytes in Avro top-level union types (#2762))
=======
>>>>>>> d15af7157e (GEOMESA-3067 Find attribute in Filters with Functions with embedded expressions correctly)
=======
<<<<<<< HEAD
>>>>>>> 00d66ae013 (GEOMESA-3067 Find attribute in Filters with Functions with embedded expressions correctly)
=======
=======
>>>>>>> 04f08c23c5 (GEOMESA-3067 Find attribute in Filters with Functions with embedded expressions correctly)
=======
>>>>>>> 9abc630fdf (GEOMESA-3061 Converters - support bytes in Avro top-level union types (#2762))
=======
>>>>>>> c8a325e13 (GEOMESA-3061 Converters - support bytes in Avro top-level union types (#2762))
>>>>>>> c9328eddce (GEOMESA-3061 Converters - support bytes in Avro top-level union types (#2762))
=======
<<<<<<< HEAD
>>>>>>> 0fa73844a1 (GEOMESA-3061 Converters - support bytes in Avro top-level union types (#2762))
=======
>>>>>>> ad3cedc4d (GEOMESA-3061 Converters - support bytes in Avro top-level union types (#2762))
=======
<<<<<<< HEAD
>>>>>>> 6e30236dd2 (GEOMESA-3061 Converters - support bytes in Avro top-level union types (#2762))
=======
<<<<<<< HEAD
=======
>>>>>>> 67b361c85 (GEOMESA-3061 Converters - support bytes in Avro top-level union types (#2762))
=======
=======
>>>>>>> b9bdd406e (GEOMESA-3061 Converters - support bytes in Avro top-level union types (#2762))
>>>>>>> cdb410251 (GEOMESA-3061 Converters - support bytes in Avro top-level union types (#2762))
<<<<<<< HEAD
>>>>>>> f302a54949 (GEOMESA-3061 Converters - support bytes in Avro top-level union types (#2762))
=======
<<<<<<< HEAD
>>>>>>> 2a887f75bf (GEOMESA-3061 Converters - support bytes in Avro top-level union types (#2762))
=======
=======
>>>>>>> 9a4dff9e4f (GEOMESA-3061 Converters - support bytes in Avro top-level union types (#2762))
<<<<<<< HEAD
>>>>>>> 7b8c8dcc3d (GEOMESA-3061 Converters - support bytes in Avro top-level union types (#2762))
=======
=======
>>>>>>> 22dcc8170f (GEOMESA-3061 Converters - support bytes in Avro top-level union types (#2762))
=======
>>>>>>> 8c9ca1211a (GEOMESA-3061 Converters - support bytes in Avro top-level union types (#2762))
<<<<<<< HEAD
>>>>>>> 4f51687745 (GEOMESA-3061 Converters - support bytes in Avro top-level union types (#2762))
=======
=======
>>>>>>> dace2085b (GEOMESA-3061 Converters - support bytes in Avro top-level union types (#2762))
>>>>>>> 238945d4b3 (GEOMESA-3061 Converters - support bytes in Avro top-level union types (#2762))
=======
>>>>>>> 1cad375176 (GEOMESA-3061 Converters - support bytes in Avro top-level union types (#2762))
>>>>>>> 73770612e0 (GEOMESA-3061 Converters - support bytes in Avro top-level union types (#2762))
>>>>>>> e3a63fee1 (GEOMESA-3067 Find attribute in Filters with Functions with embedded expressions correctly)
<<<<<<< HEAD
<<<<<<< HEAD
<<<<<<< HEAD
<<<<<<< HEAD
<<<<<<< HEAD
<<<<<<< HEAD
<<<<<<< HEAD
<<<<<<< HEAD
=======
>>>>>>> 92674ff9d4 (GEOMESA-3061 Converters - support bytes in Avro top-level union types (#2762))
=======
>>>>>>> f110463a26 (GEOMESA-3061 Converters - support bytes in Avro top-level union types (#2762))
=======
>>>>>>> 4ccd6f6b1f (GEOMESA-3061 Converters - support bytes in Avro top-level union types (#2762))
=======
>>>>>>> c22ecd64c3 (GEOMESA-3061 Converters - support bytes in Avro top-level union types (#2762))
=======
=======
>>>>>>> 92674ff9d4 (GEOMESA-3061 Converters - support bytes in Avro top-level union types (#2762))
>>>>>>> 009a284072 (GEOMESA-3061 Converters - support bytes in Avro top-level union types (#2762))
>>>>>>> 3333975e77 (GEOMESA-3067 Find attribute in Filters with Functions with embedded expressions correctly)
=======
=======
>>>>>>> a910ae135f (GEOMESA-3061 Converters - support bytes in Avro top-level union types (#2762))
=======
<<<<<<< HEAD
<<<<<<< HEAD
<<<<<<< HEAD
<<<<<<< HEAD
<<<<<<< HEAD
=======
>>>>>>> 009a284072 (GEOMESA-3061 Converters - support bytes in Avro top-level union types (#2762))
>>>>>>> 4c361f07da (GEOMESA-3061 Converters - support bytes in Avro top-level union types (#2762))
=======
=======
>>>>>>> 92674ff9d4 (GEOMESA-3061 Converters - support bytes in Avro top-level union types (#2762))
=======
<<<<<<< HEAD
>>>>>>> 4c361f07da (GEOMESA-3061 Converters - support bytes in Avro top-level union types (#2762))
=======
>>>>>>> f110463a26 (GEOMESA-3061 Converters - support bytes in Avro top-level union types (#2762))
=======
>>>>>>> 4ccd6f6b1f (GEOMESA-3061 Converters - support bytes in Avro top-level union types (#2762))
=======
>>>>>>> 4c361f07da (GEOMESA-3061 Converters - support bytes in Avro top-level union types (#2762))
=======
>>>>>>> c22ecd64c3 (GEOMESA-3061 Converters - support bytes in Avro top-level union types (#2762))
=======
=======
>>>>>>> 009a284072 (GEOMESA-3061 Converters - support bytes in Avro top-level union types (#2762))
>>>>>>> b9bdd406e (GEOMESA-3061 Converters - support bytes in Avro top-level union types (#2762))
>>>>>>> 0e68e9f4c (GEOMESA-3061 Converters - support bytes in Avro top-level union types (#2762))
<<<<<<< HEAD
<<<<<<< HEAD
<<<<<<< HEAD
<<<<<<< HEAD
<<<<<<< HEAD
<<<<<<< HEAD
<<<<<<< HEAD
<<<<<<< HEAD
<<<<<<< HEAD
<<<<<<< HEAD
<<<<<<< HEAD
<<<<<<< HEAD
<<<<<<< HEAD
<<<<<<< HEAD
<<<<<<< HEAD
<<<<<<< HEAD
<<<<<<< HEAD
<<<<<<< HEAD
<<<<<<< HEAD
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
>>>>>>> 9df4f8a9f6 (GEOMESA-3067 Find attribute in Filters with Functions with embedded expressions correctly)
=======
>>>>>>> 9a2d40c613 (GEOMESA-3061 Converters - support bytes in Avro top-level union types (#2762))
=======
>>>>>>> 92674ff9d4 (GEOMESA-3061 Converters - support bytes in Avro top-level union types (#2762))
=======
>>>>>>> c169cb2905 (GEOMESA-3067 Find attribute in Filters with Functions with embedded expressions correctly)
<<<<<<< HEAD
<<<<<<< HEAD
=======
>>>>>>> a22efb4d66 (GEOMESA-3061 Converters - support bytes in Avro top-level union types (#2762))
=======
>>>>>>> 99acaa0887 (GEOMESA-3067 Find attribute in Filters with Functions with embedded expressions correctly)
=======
>>>>>>> 9d44ff473d (GEOMESA-3061 Converters - support bytes in Avro top-level union types (#2762))
=======
>>>>>>> bff2bdde04 (GEOMESA-3067 Find attribute in Filters with Functions with embedded expressions correctly)
=======
>>>>>>> f110463a26 (GEOMESA-3061 Converters - support bytes in Avro top-level union types (#2762))
=======
>>>>>>> d83561962d (GEOMESA-3067 Find attribute in Filters with Functions with embedded expressions correctly)
=======
>>>>>>> 4ccd6f6b1f (GEOMESA-3061 Converters - support bytes in Avro top-level union types (#2762))
=======
>>>>>>> f983ea29f0 (GEOMESA-3067 Find attribute in Filters with Functions with embedded expressions correctly)
=======
>>>>>>> 194ad4e5c0 (GEOMESA-3061 Converters - support bytes in Avro top-level union types (#2762))
=======
>>>>>>> 5d8dab9f81 (GEOMESA-3067 Find attribute in Filters with Functions with embedded expressions correctly)
=======
>>>>>>> 9dbe1503e8 (GEOMESA-3061 Converters - support bytes in Avro top-level union types (#2762))
=======
>>>>>>> 53bc726472 (GEOMESA-3067 Find attribute in Filters with Functions with embedded expressions correctly)
=======
>>>>>>> c22ecd64c3 (GEOMESA-3061 Converters - support bytes in Avro top-level union types (#2762))
=======
>>>>>>> 6e297b9b6f (GEOMESA-3067 Find attribute in Filters with Functions with embedded expressions correctly)
=======
=======
>>>>>>> 92674ff9d4 (GEOMESA-3061 Converters - support bytes in Avro top-level union types (#2762))
>>>>>>> 009a284072 (GEOMESA-3061 Converters - support bytes in Avro top-level union types (#2762))
=======
>>>>>>> 9df4f8a9f6 (GEOMESA-3067 Find attribute in Filters with Functions with embedded expressions correctly)
=======
=======
>>>>>>> a22efb4d66 (GEOMESA-3061 Converters - support bytes in Avro top-level union types (#2762))
>>>>>>> 9a2d40c613 (GEOMESA-3061 Converters - support bytes in Avro top-level union types (#2762))
>>>>>>> 76618c8da3 (GEOMESA-3061 Converters - support bytes in Avro top-level union types (#2762))
=======
=======
>>>>>>> b009fd23f4 (GEOMESA-3061 Converters - support bytes in Avro top-level union types (#2762))
=======
<<<<<<< HEAD
<<<<<<< HEAD
<<<<<<< HEAD
<<<<<<< HEAD
<<<<<<< HEAD
=======
>>>>>>> 9a2d40c613 (GEOMESA-3061 Converters - support bytes in Avro top-level union types (#2762))
>>>>>>> cf57a2c189 (GEOMESA-3067 Find attribute in Filters with Functions with embedded expressions correctly)
=======
>>>>>>> 9c28193a91 (GEOMESA-3061 Converters - support bytes in Avro top-level union types (#2762))
=======
<<<<<<< HEAD
<<<<<<< HEAD
<<<<<<< HEAD
<<<<<<< HEAD
>>>>>>> 1b60c2aeba (GEOMESA-3067 Find attribute in Filters with Functions with embedded expressions correctly)
=======
=======
>>>>>>> a22efb4d66 (GEOMESA-3061 Converters - support bytes in Avro top-level union types (#2762))
<<<<<<< HEAD
=======
>>>>>>> cf57a2c189 (GEOMESA-3067 Find attribute in Filters with Functions with embedded expressions correctly)
=======
>>>>>>> 99acaa0887 (GEOMESA-3067 Find attribute in Filters with Functions with embedded expressions correctly)
=======
>>>>>>> 9d44ff473d (GEOMESA-3061 Converters - support bytes in Avro top-level union types (#2762))
=======
>>>>>>> 1b60c2aeba (GEOMESA-3067 Find attribute in Filters with Functions with embedded expressions correctly)
=======
>>>>>>> bff2bdde04 (GEOMESA-3067 Find attribute in Filters with Functions with embedded expressions correctly)
=======
>>>>>>> 194ad4e5c0 (GEOMESA-3061 Converters - support bytes in Avro top-level union types (#2762))
=======
>>>>>>> cf57a2c189 (GEOMESA-3067 Find attribute in Filters with Functions with embedded expressions correctly)
=======
>>>>>>> 5d8dab9f81 (GEOMESA-3067 Find attribute in Filters with Functions with embedded expressions correctly)
=======
>>>>>>> 9dbe1503e8 (GEOMESA-3061 Converters - support bytes in Avro top-level union types (#2762))
=======
>>>>>>> 1b60c2aeba (GEOMESA-3067 Find attribute in Filters with Functions with embedded expressions correctly)
=======
>>>>>>> 53bc726472 (GEOMESA-3067 Find attribute in Filters with Functions with embedded expressions correctly)
=======
>>>>>>> 9a2d40c613 (GEOMESA-3061 Converters - support bytes in Avro top-level union types (#2762))
>>>>>>> a63cb7e74 (GEOMESA-3067 Find attribute in Filters with Functions with embedded expressions correctly)
<<<<<<< HEAD
<<<<<<< HEAD
<<<<<<< HEAD
<<<<<<< HEAD
<<<<<<< HEAD
<<<<<<< HEAD
<<<<<<< HEAD
<<<<<<< HEAD
=======
>>>>>>> 9a4dff9e4f (GEOMESA-3061 Converters - support bytes in Avro top-level union types (#2762))
=======
>>>>>>> 86ec77f9cb (GEOMESA-3061 Converters - support bytes in Avro top-level union types (#2762))
=======
>>>>>>> 35b69b8f2f (GEOMESA-3061 Converters - support bytes in Avro top-level union types (#2762))
=======
>>>>>>> 2a887f75bf (GEOMESA-3061 Converters - support bytes in Avro top-level union types (#2762))
=======
=======
>>>>>>> 9a4dff9e4f (GEOMESA-3061 Converters - support bytes in Avro top-level union types (#2762))
>>>>>>> 7b8c8dcc3d (GEOMESA-3061 Converters - support bytes in Avro top-level union types (#2762))
>>>>>>> c3b0a1b6e3 (GEOMESA-3067 Find attribute in Filters with Functions with embedded expressions correctly)
=======
=======
>>>>>>> 67b361c85 (GEOMESA-3061 Converters - support bytes in Avro top-level union types (#2762))
<<<<<<< HEAD
<<<<<<< HEAD
<<<<<<< HEAD
<<<<<<< HEAD
<<<<<<< HEAD
<<<<<<< HEAD
<<<<<<< HEAD
<<<<<<< HEAD
<<<<<<< HEAD
<<<<<<< HEAD
<<<<<<< HEAD
<<<<<<< HEAD
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
>>>>>>> 73770612e0 (GEOMESA-3061 Converters - support bytes in Avro top-level union types (#2762))
=======
>>>>>>> 63ca73533e (GEOMESA-3067 Find attribute in Filters with Functions with embedded expressions correctly)
=======
>>>>>>> 1cad375176 (GEOMESA-3061 Converters - support bytes in Avro top-level union types (#2762))
<<<<<<< HEAD
=======
>>>>>>> 21deff19fd (GEOMESA-3067 Find attribute in Filters with Functions with embedded expressions correctly)
=======
>>>>>>> a35efac12e (GEOMESA-3061 Converters - support bytes in Avro top-level union types (#2762))
=======
>>>>>>> 323528580f (GEOMESA-3067 Find attribute in Filters with Functions with embedded expressions correctly)
=======
>>>>>>> 17883cb601 (GEOMESA-3067 Find attribute in Filters with Functions with embedded expressions correctly)
=======
>>>>>>> da4e2905b4 (GEOMESA-3067 Find attribute in Filters with Functions with embedded expressions correctly)
=======
>>>>>>> 7b3c90c53f (GEOMESA-3061 Converters - support bytes in Avro top-level union types (#2762))
=======
>>>>>>> 1ef95979ee (GEOMESA-3067 Find attribute in Filters with Functions with embedded expressions correctly)
=======
>>>>>>> 6e30236dd2 (GEOMESA-3061 Converters - support bytes in Avro top-level union types (#2762))
=======
>>>>>>> 3261561062 (GEOMESA-3067 Find attribute in Filters with Functions with embedded expressions correctly)
=======
>>>>>>> 08a743b61d (GEOMESA-3067 Find attribute in Filters with Functions with embedded expressions correctly)
=======
=======
>>>>>>> 63ca73533e (GEOMESA-3067 Find attribute in Filters with Functions with embedded expressions correctly)
>>>>>>> 79cd5cb606 (GEOMESA-3067 Find attribute in Filters with Functions with embedded expressions correctly)
=======
>>>>>>> 73770612e0 (GEOMESA-3061 Converters - support bytes in Avro top-level union types (#2762))
>>>>>>> c8a325e13c (GEOMESA-3061 Converters - support bytes in Avro top-level union types (#2762))
=======
=======
>>>>>>> 238945d4b3 (GEOMESA-3061 Converters - support bytes in Avro top-level union types (#2762))
=======
<<<<<<< HEAD
<<<<<<< HEAD
<<<<<<< HEAD
<<<<<<< HEAD
<<<<<<< HEAD
=======
>>>>>>> 73770612e0 (GEOMESA-3061 Converters - support bytes in Avro top-level union types (#2762))
>>>>>>> bec3ba7d08 (GEOMESA-3067 Find attribute in Filters with Functions with embedded expressions correctly)
=======
>>>>>>> d294ce49e2 (GEOMESA-3061 Converters - support bytes in Avro top-level union types (#2762))
=======
<<<<<<< HEAD
<<<<<<< HEAD
<<<<<<< HEAD
<<<<<<< HEAD
>>>>>>> ed45e8551f (GEOMESA-3067 Find attribute in Filters with Functions with embedded expressions correctly)
=======
=======
>>>>>>> 1cad375176 (GEOMESA-3061 Converters - support bytes in Avro top-level union types (#2762))
<<<<<<< HEAD
=======
>>>>>>> bec3ba7d08 (GEOMESA-3067 Find attribute in Filters with Functions with embedded expressions correctly)
=======
>>>>>>> 21deff19fd (GEOMESA-3067 Find attribute in Filters with Functions with embedded expressions correctly)
=======
>>>>>>> a35efac12e (GEOMESA-3061 Converters - support bytes in Avro top-level union types (#2762))
=======
>>>>>>> ed45e8551f (GEOMESA-3067 Find attribute in Filters with Functions with embedded expressions correctly)
=======
>>>>>>> 323528580f (GEOMESA-3067 Find attribute in Filters with Functions with embedded expressions correctly)
=======
>>>>>>> 7b3c90c53f (GEOMESA-3061 Converters - support bytes in Avro top-level union types (#2762))
=======
>>>>>>> bec3ba7d08 (GEOMESA-3067 Find attribute in Filters with Functions with embedded expressions correctly)
=======
>>>>>>> 1ef95979ee (GEOMESA-3067 Find attribute in Filters with Functions with embedded expressions correctly)
=======
>>>>>>> 6e30236dd2 (GEOMESA-3061 Converters - support bytes in Avro top-level union types (#2762))
=======
>>>>>>> ed45e8551f (GEOMESA-3067 Find attribute in Filters with Functions with embedded expressions correctly)
=======
>>>>>>> 3261561062 (GEOMESA-3067 Find attribute in Filters with Functions with embedded expressions correctly)
=======
>>>>>>> 73770612e0 (GEOMESA-3061 Converters - support bytes in Avro top-level union types (#2762))
>>>>>>> 908ad4071 (GEOMESA-3067 Find attribute in Filters with Functions with embedded expressions correctly)
<<<<<<< HEAD
<<<<<<< HEAD
<<<<<<< HEAD
<<<<<<< HEAD
<<<<<<< HEAD
<<<<<<< HEAD
<<<<<<< HEAD
<<<<<<< HEAD
=======
>>>>>>> 0fc6650ecf (GEOMESA-3061 Converters - support bytes in Avro top-level union types (#2762))
=======
>>>>>>> 1bcc513539 (GEOMESA-3061 Converters - support bytes in Avro top-level union types (#2762))
=======
>>>>>>> db8a3a22b2 (GEOMESA-3061 Converters - support bytes in Avro top-level union types (#2762))
=======
>>>>>>> b08cb4d818 (GEOMESA-3061 Converters - support bytes in Avro top-level union types (#2762))
=======
=======
>>>>>>> 0fc6650ecf (GEOMESA-3061 Converters - support bytes in Avro top-level union types (#2762))
>>>>>>> c029a43a6c (GEOMESA-3061 Converters - support bytes in Avro top-level union types (#2762))
>>>>>>> 9638dc731e (GEOMESA-3067 Find attribute in Filters with Functions with embedded expressions correctly)
=======
=======
>>>>>>> bdbced26d4 (GEOMESA-3061 Converters - support bytes in Avro top-level union types (#2762))
=======
<<<<<<< HEAD
<<<<<<< HEAD
<<<<<<< HEAD
<<<<<<< HEAD
<<<<<<< HEAD
=======
>>>>>>> c029a43a6c (GEOMESA-3061 Converters - support bytes in Avro top-level union types (#2762))
>>>>>>> a788dfac03 (GEOMESA-3061 Converters - support bytes in Avro top-level union types (#2762))
=======
=======
>>>>>>> 0fc6650ecf (GEOMESA-3061 Converters - support bytes in Avro top-level union types (#2762))
=======
<<<<<<< HEAD
>>>>>>> a788dfac03 (GEOMESA-3061 Converters - support bytes in Avro top-level union types (#2762))
=======
>>>>>>> 1bcc513539 (GEOMESA-3061 Converters - support bytes in Avro top-level union types (#2762))
=======
>>>>>>> db8a3a22b2 (GEOMESA-3061 Converters - support bytes in Avro top-level union types (#2762))
=======
>>>>>>> a788dfac03 (GEOMESA-3061 Converters - support bytes in Avro top-level union types (#2762))
=======
>>>>>>> b08cb4d818 (GEOMESA-3061 Converters - support bytes in Avro top-level union types (#2762))
=======
=======
>>>>>>> c029a43a6c (GEOMESA-3061 Converters - support bytes in Avro top-level union types (#2762))
>>>>>>> b9bdd406e (GEOMESA-3061 Converters - support bytes in Avro top-level union types (#2762))
>>>>>>> b4320946b (GEOMESA-3061 Converters - support bytes in Avro top-level union types (#2762))
<<<<<<< HEAD
<<<<<<< HEAD
<<<<<<< HEAD
<<<<<<< HEAD
<<<<<<< HEAD
<<<<<<< HEAD
<<<<<<< HEAD
<<<<<<< HEAD
<<<<<<< HEAD
<<<<<<< HEAD
<<<<<<< HEAD
<<<<<<< HEAD
<<<<<<< HEAD
<<<<<<< HEAD
<<<<<<< HEAD
<<<<<<< HEAD
<<<<<<< HEAD
<<<<<<< HEAD
<<<<<<< HEAD
<<<<<<< HEAD
<<<<<<< HEAD
<<<<<<< HEAD
<<<<<<< HEAD
<<<<<<< HEAD
<<<<<<< HEAD
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
>>>>>>> 217b7d1cb9 (Merge branch 'feature/postgis-fixes')
=======
>>>>>>> 6c83981af3 (GEOMESA-3061 Converters - support bytes in Avro top-level union types (#2762))
=======
>>>>>>> 0fc6650ecf (GEOMESA-3061 Converters - support bytes in Avro top-level union types (#2762))
=======
>>>>>>> 67de3c3202 (Merge branch 'feature/postgis-fixes')
<<<<<<< HEAD
<<<<<<< HEAD
=======
>>>>>>> 1e39c0c27d (GEOMESA-3061 Converters - support bytes in Avro top-level union types (#2762))
=======
>>>>>>> 638b68d081 (Merge branch 'feature/postgis-fixes')
=======
>>>>>>> d0785cf307 (GEOMESA-3061 Converters - support bytes in Avro top-level union types (#2762))
=======
>>>>>>> 71adb695c5 (Merge branch 'feature/postgis-fixes')
=======
>>>>>>> fd5565dfba (GEOMESA-3061 Converters - support bytes in Avro top-level union types (#2762))
=======
>>>>>>> 30559ea5c9 (Merge branch 'feature/postgis-fixes')
=======
>>>>>>> 1bcc513539 (GEOMESA-3061 Converters - support bytes in Avro top-level union types (#2762))
=======
>>>>>>> ec6d06b576 (Merge branch 'feature/postgis-fixes')
=======
>>>>>>> db8a3a22b2 (GEOMESA-3061 Converters - support bytes in Avro top-level union types (#2762))
=======
>>>>>>> ed25decdd5 (Merge branch 'feature/postgis-fixes')
=======
>>>>>>> db9dfb6f14 (GEOMESA-3061 Converters - support bytes in Avro top-level union types (#2762))
=======
>>>>>>> f893d9a594 (Merge branch 'feature/postgis-fixes')
=======
>>>>>>> 63546aacdc (GEOMESA-3061 Converters - support bytes in Avro top-level union types (#2762))
=======
>>>>>>> 964e86145a (Merge branch 'feature/postgis-fixes')
=======
>>>>>>> dbd932fed6 (GEOMESA-3061 Converters - support bytes in Avro top-level union types (#2762))
=======
>>>>>>> bf6bde0830 (Merge branch 'feature/postgis-fixes')
=======
>>>>>>> b08cb4d818 (GEOMESA-3061 Converters - support bytes in Avro top-level union types (#2762))
=======
>>>>>>> 354b5e5ae5 (Merge branch 'feature/postgis-fixes')
=======
=======
>>>>>>> 0fc6650ecf (GEOMESA-3061 Converters - support bytes in Avro top-level union types (#2762))
>>>>>>> c029a43a6c (GEOMESA-3061 Converters - support bytes in Avro top-level union types (#2762))
=======
>>>>>>> 217b7d1cb9 (Merge branch 'feature/postgis-fixes')
=======
=======
>>>>>>> 1e39c0c27d (GEOMESA-3061 Converters - support bytes in Avro top-level union types (#2762))
>>>>>>> 6c83981af3 (GEOMESA-3061 Converters - support bytes in Avro top-level union types (#2762))
>>>>>>> 97ec7d864a (GEOMESA-3061 Converters - support bytes in Avro top-level union types (#2762))
=======
=======
>>>>>>> bc4062951d (GEOMESA-3061 Converters - support bytes in Avro top-level union types (#2762))
=======
<<<<<<< HEAD
<<<<<<< HEAD
<<<<<<< HEAD
<<<<<<< HEAD
<<<<<<< HEAD
=======
>>>>>>> 6c83981af3 (GEOMESA-3061 Converters - support bytes in Avro top-level union types (#2762))
>>>>>>> e944f1c88b (Merge branch 'feature/postgis-fixes')
=======
=======
<<<<<<< HEAD
<<<<<<< HEAD
<<<<<<< HEAD
<<<<<<< HEAD
>>>>>>> 26e5afc4ea (Merge branch 'feature/postgis-fixes')
=======
>>>>>>> 1df8328338 (GEOMESA-3061 Converters - support bytes in Avro top-level union types (#2762))
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
>>>>>>> 1df8328338 (GEOMESA-3061 Converters - support bytes in Avro top-level union types (#2762))
=======
>>>>>>> fd5565dfba (GEOMESA-3061 Converters - support bytes in Avro top-level union types (#2762))
=======
>>>>>>> 30559ea5c9 (Merge branch 'feature/postgis-fixes')
>>>>>>> d94c03a98e (GEOMESA-3061 Converters - support bytes in Avro top-level union types (#2762))
>>>>>>> 8de43cccf6 (GEOMESA-3061 Converters - support bytes in Avro top-level union types (#2762))
=======
>>>>>>> cb6bda89b6 (Merge branch 'feature/postgis-fixes')
=======
<<<<<<< HEAD
<<<<<<< HEAD
>>>>>>> 25063957fc (GEOMESA-3061 Converters - support bytes in Avro top-level union types (#2762))
=======
>>>>>>> 699117eca9 (Merge branch 'feature/postgis-fixes')
=======
<<<<<<< HEAD
=======
>>>>>>> 1e39c0c27d (GEOMESA-3061 Converters - support bytes in Avro top-level union types (#2762))
=======
>>>>>>> e944f1c88b (Merge branch 'feature/postgis-fixes')
=======
>>>>>>> 638b68d081 (Merge branch 'feature/postgis-fixes')
=======
>>>>>>> d94c03a98e (GEOMESA-3061 Converters - support bytes in Avro top-level union types (#2762))
>>>>>>> 8de43cccf6 (GEOMESA-3061 Converters - support bytes in Avro top-level union types (#2762))
=======
>>>>>>> d0785cf307 (GEOMESA-3061 Converters - support bytes in Avro top-level union types (#2762))
=======
>>>>>>> 71adb695c5 (Merge branch 'feature/postgis-fixes')
=======
>>>>>>> 25063957fc (GEOMESA-3061 Converters - support bytes in Avro top-level union types (#2762))
=======
>>>>>>> fd5565dfba (GEOMESA-3061 Converters - support bytes in Avro top-level union types (#2762))
=======
>>>>>>> 30559ea5c9 (Merge branch 'feature/postgis-fixes')
=======
>>>>>>> db9dfb6f14 (GEOMESA-3061 Converters - support bytes in Avro top-level union types (#2762))
=======
>>>>>>> e944f1c88b (Merge branch 'feature/postgis-fixes')
=======
>>>>>>> f893d9a594 (Merge branch 'feature/postgis-fixes')
=======
>>>>>>> d94c03a98e (GEOMESA-3061 Converters - support bytes in Avro top-level union types (#2762))
>>>>>>> 8de43cccf6 (GEOMESA-3061 Converters - support bytes in Avro top-level union types (#2762))
=======
>>>>>>> 63546aacdc (GEOMESA-3061 Converters - support bytes in Avro top-level union types (#2762))
=======
>>>>>>> 26e5afc4ea (Merge branch 'feature/postgis-fixes')
=======
>>>>>>> 1df8328338 (GEOMESA-3061 Converters - support bytes in Avro top-level union types (#2762))
=======
>>>>>>> c69897d7bd (Merge branch 'feature/postgis-fixes')
=======
>>>>>>> d94c03a98e (GEOMESA-3061 Converters - support bytes in Avro top-level union types (#2762))
>>>>>>> 8de43cccf6 (GEOMESA-3061 Converters - support bytes in Avro top-level union types (#2762))
=======
>>>>>>> cb6bda89b6 (Merge branch 'feature/postgis-fixes')
=======
<<<<<<< HEAD
>>>>>>> 964e86145a (Merge branch 'feature/postgis-fixes')
=======
>>>>>>> 25063957fc (GEOMESA-3061 Converters - support bytes in Avro top-level union types (#2762))
=======
<<<<<<< HEAD
>>>>>>> dbd932fed6 (GEOMESA-3061 Converters - support bytes in Avro top-level union types (#2762))
=======
>>>>>>> 699117eca9 (Merge branch 'feature/postgis-fixes')
=======
<<<<<<< HEAD
>>>>>>> bf6bde0830 (Merge branch 'feature/postgis-fixes')
=======
=======
>>>>>>> 1e39c0c27d (GEOMESA-3061 Converters - support bytes in Avro top-level union types (#2762))
>>>>>>> 6c83981af3 (GEOMESA-3061 Converters - support bytes in Avro top-level union types (#2762))
>>>>>>> 3be8d2a5a (Merge branch 'feature/postgis-fixes')
<<<<<<< HEAD
>>>>>>> db8d998aa2 (Merge branch 'feature/postgis-fixes')
=======
>>>>>>> d845d7c1bd (GEOMESA-3254 Add Bloop build support)
=======
>>>>>>> 7bb5f26c3e (GEOMESA-3067 Find attribute in Filters with Functions with embedded expressions correctly)
=======
=======
>>>>>>> b9bdd406e (GEOMESA-3061 Converters - support bytes in Avro top-level union types (#2762))
>>>>>>> 6d9a5b626c (GEOMESA-3061 Converters - support bytes in Avro top-level union types (#2762))
=======
=======
>>>>>>> b9bdd406e (GEOMESA-3061 Converters - support bytes in Avro top-level union types (#2762))
=======
>>>>>>> f36b0e8b9 (GEOMESA-3067 Find attribute in Filters with Functions with embedded expressions correctly)
>>>>>>> e5ed68fdd3 (GEOMESA-3067 Find attribute in Filters with Functions with embedded expressions correctly)
<<<<<<< HEAD
<<<<<<< HEAD
<<<<<<< HEAD
<<<<<<< HEAD
<<<<<<< HEAD
<<<<<<< HEAD
=======
>>>>>>> e8ce815f1b (GEOMESA-3067 Find attribute in Filters with Functions with embedded expressions correctly)
=======
>>>>>>> 60b4637548 (GEOMESA-3061 Converters - support bytes in Avro top-level union types (#2762))
=======
>>>>>>> e6e1f4bdd5 (GEOMESA-3061 Converters - support bytes in Avro top-level union types (#2762))
=======
=======
>>>>>>> e3a63fee1 (GEOMESA-3067 Find attribute in Filters with Functions with embedded expressions correctly)
>>>>>>> 7f922b040c (GEOMESA-3067 Find attribute in Filters with Functions with embedded expressions correctly)
<<<<<<< HEAD
<<<<<<< HEAD
<<<<<<< HEAD
<<<<<<< HEAD
<<<<<<< HEAD
<<<<<<< HEAD
=======
>>>>>>> 6f81d40992 (GEOMESA-3067 Find attribute in Filters with Functions with embedded expressions correctly)
=======
>>>>>>> 009a284072 (GEOMESA-3061 Converters - support bytes in Avro top-level union types (#2762))
=======
>>>>>>> a910ae135f (GEOMESA-3061 Converters - support bytes in Avro top-level union types (#2762))
=======
=======
>>>>>>> a63cb7e74 (GEOMESA-3067 Find attribute in Filters with Functions with embedded expressions correctly)
>>>>>>> 8fb0607344 (GEOMESA-3067 Find attribute in Filters with Functions with embedded expressions correctly)
<<<<<<< HEAD
<<<<<<< HEAD
<<<<<<< HEAD
<<<<<<< HEAD
<<<<<<< HEAD
<<<<<<< HEAD
=======
>>>>>>> 9a4dff9e4f (GEOMESA-3061 Converters - support bytes in Avro top-level union types (#2762))
=======
>>>>>>> 35b69b8f2f (GEOMESA-3061 Converters - support bytes in Avro top-level union types (#2762))
=======
>>>>>>> 9df4f8a9f6 (GEOMESA-3067 Find attribute in Filters with Functions with embedded expressions correctly)
=======
=======
>>>>>>> 9a4dff9e4f (GEOMESA-3061 Converters - support bytes in Avro top-level union types (#2762))
>>>>>>> 7b8c8dcc3d (GEOMESA-3061 Converters - support bytes in Avro top-level union types (#2762))
=======
=======
>>>>>>> 67b361c85 (GEOMESA-3061 Converters - support bytes in Avro top-level union types (#2762))
>>>>>>> ad3cedc4db (GEOMESA-3061 Converters - support bytes in Avro top-level union types (#2762))
<<<<<<< HEAD
<<<<<<< HEAD
<<<<<<< HEAD
<<<<<<< HEAD
<<<<<<< HEAD
<<<<<<< HEAD
=======
>>>>>>> 63ca73533e (GEOMESA-3067 Find attribute in Filters with Functions with embedded expressions correctly)
=======
>>>>>>> da4e2905b4 (GEOMESA-3067 Find attribute in Filters with Functions with embedded expressions correctly)
=======
>>>>>>> 7b8c8dcc3d (GEOMESA-3061 Converters - support bytes in Avro top-level union types (#2762))
=======
=======
>>>>>>> 63ca73533e (GEOMESA-3067 Find attribute in Filters with Functions with embedded expressions correctly)
>>>>>>> 79cd5cb606 (GEOMESA-3067 Find attribute in Filters with Functions with embedded expressions correctly)
=======
=======
>>>>>>> 908ad4071 (GEOMESA-3067 Find attribute in Filters with Functions with embedded expressions correctly)
>>>>>>> bc49131942 (GEOMESA-3067 Find attribute in Filters with Functions with embedded expressions correctly)
<<<<<<< HEAD
<<<<<<< HEAD
<<<<<<< HEAD
<<<<<<< HEAD
<<<<<<< HEAD
<<<<<<< HEAD
=======
>>>>>>> 79cd5cb606 (GEOMESA-3067 Find attribute in Filters with Functions with embedded expressions correctly)
=======
>>>>>>> c029a43a6c (GEOMESA-3061 Converters - support bytes in Avro top-level union types (#2762))
=======
>>>>>>> bdbced26d4 (GEOMESA-3061 Converters - support bytes in Avro top-level union types (#2762))
=======
=======
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
>>>>>>> a5b0374ee2 (GEOMESA-3061 Converters - support bytes in Avro top-level union types (#2762))
=======
=======
<<<<<<< HEAD
=======
>>>>>>> b9bdd406e (GEOMESA-3061 Converters - support bytes in Avro top-level union types (#2762))
>>>>>>> 87bf55340 (GEOMESA-3061 Converters - support bytes in Avro top-level union types (#2762))
<<<<<<< HEAD
>>>>>>> 0dbede148d (GEOMESA-3061 Converters - support bytes in Avro top-level union types (#2762))
=======
=======
>>>>>>> 240977229 (GEOMESA-3061 Converters - support bytes in Avro top-level union types (#2762))
<<<<<<< HEAD
>>>>>>> 22dcc8170f (GEOMESA-3061 Converters - support bytes in Avro top-level union types (#2762))
=======
=======
>>>>>>> 45ad5d11f (GEOMESA-3061 Converters - support bytes in Avro top-level union types (#2762))
<<<<<<< HEAD
<<<<<<< HEAD
<<<<<<< HEAD
<<<<<<< HEAD
<<<<<<< HEAD
<<<<<<< HEAD
<<<<<<< HEAD
=======
>>>>>>> 1cad375176 (GEOMESA-3061 Converters - support bytes in Avro top-level union types (#2762))
=======
>>>>>>> 7b3c90c53f (GEOMESA-3061 Converters - support bytes in Avro top-level union types (#2762))
=======
>>>>>>> 9a2d40c613 (GEOMESA-3061 Converters - support bytes in Avro top-level union types (#2762))
=======
=======
>>>>>>> 1cad375176 (GEOMESA-3061 Converters - support bytes in Avro top-level union types (#2762))
>>>>>>> 73770612e0 (GEOMESA-3061 Converters - support bytes in Avro top-level union types (#2762))
>>>>>>> b009fd23f4 (GEOMESA-3061 Converters - support bytes in Avro top-level union types (#2762))
=======
=======
>>>>>>> dace2085b (GEOMESA-3061 Converters - support bytes in Avro top-level union types (#2762))
<<<<<<< HEAD
<<<<<<< HEAD
<<<<<<< HEAD
<<<<<<< HEAD
<<<<<<< HEAD
<<<<<<< HEAD
<<<<<<< HEAD
=======
>>>>>>> 1e39c0c27d (GEOMESA-3061 Converters - support bytes in Avro top-level union types (#2762))
=======
>>>>>>> db9dfb6f14 (GEOMESA-3061 Converters - support bytes in Avro top-level union types (#2762))
=======
>>>>>>> 73770612e0 (GEOMESA-3061 Converters - support bytes in Avro top-level union types (#2762))
=======
=======
>>>>>>> 1e39c0c27d (GEOMESA-3061 Converters - support bytes in Avro top-level union types (#2762))
>>>>>>> 6c83981af3 (GEOMESA-3061 Converters - support bytes in Avro top-level union types (#2762))
>>>>>>> 238945d4b3 (GEOMESA-3061 Converters - support bytes in Avro top-level union types (#2762))
=======
=======
>>>>>>> 516fe7e9c (GEOMESA-3061 Converters - support bytes in Avro top-level union types (#2762))
<<<<<<< HEAD
<<<<<<< HEAD
<<<<<<< HEAD
<<<<<<< HEAD
<<<<<<< HEAD
<<<<<<< HEAD
=======
>>>>>>> 638b68d081 (Merge branch 'feature/postgis-fixes')
=======
>>>>>>> f893d9a594 (Merge branch 'feature/postgis-fixes')
=======
>>>>>>> 6c83981af3 (GEOMESA-3061 Converters - support bytes in Avro top-level union types (#2762))
>>>>>>> bc4062951d (GEOMESA-3061 Converters - support bytes in Avro top-level union types (#2762))
=======
=======
=======
>>>>>>> 3be8d2a5a (Merge branch 'feature/postgis-fixes')
>>>>>>> e8cc4971c6 (Merge branch 'feature/postgis-fixes')
<<<<<<< HEAD
<<<<<<< HEAD
<<<<<<< HEAD
<<<<<<< HEAD
<<<<<<< HEAD
=======
>>>>>>> a990cf104e (GEOMESA-3067 Find attribute in Filters with Functions with embedded expressions correctly)
=======
>>>>>>> f33d55e2ba (GEOMESA-3067 Find attribute in Filters with Functions with embedded expressions correctly)
>>>>>>> e944f1c88b (Merge branch 'feature/postgis-fixes')
=======
=======
>>>>>>> 907fb0b08 (GEOMESA-3067 Find attribute in Filters with Functions with embedded expressions correctly)
<<<<<<< HEAD
<<<<<<< HEAD
<<<<<<< HEAD
<<<<<<< HEAD
<<<<<<< HEAD
>>>>>>> 8a3e82747d (GEOMESA-3067 Find attribute in Filters with Functions with embedded expressions correctly)
<<<<<<< HEAD
>>>>>>> deb8fd68de (GEOMESA-3067 Find attribute in Filters with Functions with embedded expressions correctly)
=======
=======
=======
=======
>>>>>>> b9bdd406e (GEOMESA-3061 Converters - support bytes in Avro top-level union types (#2762))
>>>>>>> d9ed077cd (GEOMESA-3061 Converters - support bytes in Avro top-level union types (#2762))
<<<<<<< HEAD
<<<<<<< HEAD
<<<<<<< HEAD
>>>>>>> 81ee66102b (GEOMESA-3061 Converters - support bytes in Avro top-level union types (#2762))
<<<<<<< HEAD
>>>>>>> 8adfab65bb (GEOMESA-3061 Converters - support bytes in Avro top-level union types (#2762))
=======
=======
=======
>>>>>>> e182e6e99 (GEOMESA-3067 Find attribute in Filters with Functions with embedded expressions correctly)
<<<<<<< HEAD
<<<<<<< HEAD
<<<<<<< HEAD
>>>>>>> 9943e05ec9 (GEOMESA-3067 Find attribute in Filters with Functions with embedded expressions correctly)
<<<<<<< HEAD
>>>>>>> 3254b186da (GEOMESA-3067 Find attribute in Filters with Functions with embedded expressions correctly)
=======
=======
=======
>>>>>>> 9d708b240 (GEOMESA-3061 Converters - support bytes in Avro top-level union types (#2762))
<<<<<<< HEAD
<<<<<<< HEAD
<<<<<<< HEAD
>>>>>>> 53a3e72cbf (GEOMESA-3061 Converters - support bytes in Avro top-level union types (#2762))
<<<<<<< HEAD
>>>>>>> 7b0539b808 (GEOMESA-3061 Converters - support bytes in Avro top-level union types (#2762))
=======
=======
=======
=======
>>>>>>> e3a63fee1 (GEOMESA-3067 Find attribute in Filters with Functions with embedded expressions correctly)
>>>>>>> 3333975e7 (GEOMESA-3067 Find attribute in Filters with Functions with embedded expressions correctly)
<<<<<<< HEAD
<<<<<<< HEAD
<<<<<<< HEAD
>>>>>>> d15af7157e (GEOMESA-3067 Find attribute in Filters with Functions with embedded expressions correctly)
<<<<<<< HEAD
>>>>>>> 982031ef44 (GEOMESA-3067 Find attribute in Filters with Functions with embedded expressions correctly)
=======
=======
=======
>>>>>>> 76618c8da (GEOMESA-3061 Converters - support bytes in Avro top-level union types (#2762))
<<<<<<< HEAD
<<<<<<< HEAD
<<<<<<< HEAD
>>>>>>> 947761ec9b (GEOMESA-3061 Converters - support bytes in Avro top-level union types (#2762))
<<<<<<< HEAD
>>>>>>> 0086b292ba (GEOMESA-3061 Converters - support bytes in Avro top-level union types (#2762))
=======
=======
=======
=======
>>>>>>> a63cb7e74 (GEOMESA-3067 Find attribute in Filters with Functions with embedded expressions correctly)
>>>>>>> c3b0a1b6e (GEOMESA-3067 Find attribute in Filters with Functions with embedded expressions correctly)
<<<<<<< HEAD
<<<<<<< HEAD
<<<<<<< HEAD
>>>>>>> 9813375fcc (GEOMESA-3067 Find attribute in Filters with Functions with embedded expressions correctly)
<<<<<<< HEAD
>>>>>>> cf57a2c189 (GEOMESA-3067 Find attribute in Filters with Functions with embedded expressions correctly)
=======
=======
=======
>>>>>>> c8a325e13 (GEOMESA-3061 Converters - support bytes in Avro top-level union types (#2762))
<<<<<<< HEAD
<<<<<<< HEAD
<<<<<<< HEAD
>>>>>>> c9328eddce (GEOMESA-3061 Converters - support bytes in Avro top-level union types (#2762))
<<<<<<< HEAD
>>>>>>> e15d50d7d3 (GEOMESA-3061 Converters - support bytes in Avro top-level union types (#2762))
=======
=======
=======
=======
>>>>>>> 908ad4071 (GEOMESA-3067 Find attribute in Filters with Functions with embedded expressions correctly)
>>>>>>> 9638dc731 (GEOMESA-3067 Find attribute in Filters with Functions with embedded expressions correctly)
<<<<<<< HEAD
<<<<<<< HEAD
<<<<<<< HEAD
>>>>>>> d2eec4be68 (GEOMESA-3067 Find attribute in Filters with Functions with embedded expressions correctly)
<<<<<<< HEAD
>>>>>>> bec3ba7d08 (GEOMESA-3067 Find attribute in Filters with Functions with embedded expressions correctly)
=======
=======
=======
>>>>>>> 97ec7d864 (GEOMESA-3061 Converters - support bytes in Avro top-level union types (#2762))
<<<<<<< HEAD
<<<<<<< HEAD
<<<<<<< HEAD
>>>>>>> d94c03a98e (GEOMESA-3061 Converters - support bytes in Avro top-level union types (#2762))
<<<<<<< HEAD
>>>>>>> 8de43cccf6 (GEOMESA-3061 Converters - support bytes in Avro top-level union types (#2762))
=======
=======
=======
=======
>>>>>>> 3be8d2a5a (Merge branch 'feature/postgis-fixes')
>>>>>>> db8d998aa (Merge branch 'feature/postgis-fixes')
<<<<<<< HEAD
<<<<<<< HEAD
<<<<<<< HEAD
>>>>>>> cb6bda89b6 (Merge branch 'feature/postgis-fixes')
<<<<<<< HEAD
>>>>>>> 26e5afc4ea (Merge branch 'feature/postgis-fixes')
=======
=======
=======
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
>>>>>>> 7bb5f26c3 (GEOMESA-3067 Find attribute in Filters with Functions with embedded expressions correctly)
<<<<<<< HEAD
<<<<<<< HEAD
<<<<<<< HEAD
>>>>>>> e69b2aa6dc (GEOMESA-3067 Find attribute in Filters with Functions with embedded expressions correctly)
<<<<<<< HEAD
>>>>>>> b1a7408547 (GEOMESA-3067 Find attribute in Filters with Functions with embedded expressions correctly)
=======
=======
=======
=======
>>>>>>> b9bdd406e (GEOMESA-3061 Converters - support bytes in Avro top-level union types (#2762))
>>>>>>> 6d9a5b626 (GEOMESA-3061 Converters - support bytes in Avro top-level union types (#2762))
<<<<<<< HEAD
<<<<<<< HEAD
<<<<<<< HEAD
>>>>>>> 67e4c1354f (GEOMESA-3061 Converters - support bytes in Avro top-level union types (#2762))
<<<<<<< HEAD
>>>>>>> 12e3a588fc (GEOMESA-3061 Converters - support bytes in Avro top-level union types (#2762))
=======
=======
=======
=======
>>>>>>> e6e1f4bdd (GEOMESA-3061 Converters - support bytes in Avro top-level union types (#2762))
=======
<<<<<<< HEAD
<<<<<<< HEAD
>>>>>>> b9bdd406e (GEOMESA-3061 Converters - support bytes in Avro top-level union types (#2762))
=======
>>>>>>> f36b0e8b9 (GEOMESA-3067 Find attribute in Filters with Functions with embedded expressions correctly)
<<<<<<< HEAD
>>>>>>> e5ed68fdd (GEOMESA-3067 Find attribute in Filters with Functions with embedded expressions correctly)
<<<<<<< HEAD
>>>>>>> 060ac2189c (GEOMESA-3067 Find attribute in Filters with Functions with embedded expressions correctly)
<<<<<<< HEAD
>>>>>>> c8e013ff91 (GEOMESA-3067 Find attribute in Filters with Functions with embedded expressions correctly)
=======
=======
=======
=======
>>>>>>> c3c5dd0ebb (GEOMESA-3061 Converters - support bytes in Avro top-level union types (#2762))
=======
=======
>>>>>>> b9bdd406e (GEOMESA-3061 Converters - support bytes in Avro top-level union types (#2762))
>>>>>>> cdb410251 (GEOMESA-3061 Converters - support bytes in Avro top-level union types (#2762))
<<<<<<< HEAD
>>>>>>> e6e1f4bdd (GEOMESA-3061 Converters - support bytes in Avro top-level union types (#2762))
<<<<<<< HEAD
>>>>>>> 8035cc5893 (GEOMESA-3061 Converters - support bytes in Avro top-level union types (#2762))
<<<<<<< HEAD
>>>>>>> 1890b11217 (GEOMESA-3061 Converters - support bytes in Avro top-level union types (#2762))
=======
=======
=======
=======
>>>>>>> e3a63fee1 (GEOMESA-3067 Find attribute in Filters with Functions with embedded expressions correctly)
>>>>>>> 7f922b040 (GEOMESA-3067 Find attribute in Filters with Functions with embedded expressions correctly)
<<<<<<< HEAD
<<<<<<< HEAD
<<<<<<< HEAD
>>>>>>> 04f08c23c5 (GEOMESA-3067 Find attribute in Filters with Functions with embedded expressions correctly)
<<<<<<< HEAD
>>>>>>> 912169b5e9 (GEOMESA-3067 Find attribute in Filters with Functions with embedded expressions correctly)
=======
=======
=======
>>>>>>> a910ae135 (GEOMESA-3061 Converters - support bytes in Avro top-level union types (#2762))
<<<<<<< HEAD
<<<<<<< HEAD
<<<<<<< HEAD
>>>>>>> 07161eaaa6 (GEOMESA-3061 Converters - support bytes in Avro top-level union types (#2762))
<<<<<<< HEAD
>>>>>>> 9c28193a91 (GEOMESA-3061 Converters - support bytes in Avro top-level union types (#2762))
=======
=======
=======
=======
>>>>>>> a63cb7e74 (GEOMESA-3067 Find attribute in Filters with Functions with embedded expressions correctly)
>>>>>>> 8fb060734 (GEOMESA-3067 Find attribute in Filters with Functions with embedded expressions correctly)
<<<<<<< HEAD
<<<<<<< HEAD
<<<<<<< HEAD
>>>>>>> 38b3282770 (GEOMESA-3067 Find attribute in Filters with Functions with embedded expressions correctly)
<<<<<<< HEAD
>>>>>>> 1b60c2aeba (GEOMESA-3067 Find attribute in Filters with Functions with embedded expressions correctly)
=======
=======
=======
>>>>>>> ad3cedc4d (GEOMESA-3061 Converters - support bytes in Avro top-level union types (#2762))
<<<<<<< HEAD
<<<<<<< HEAD
<<<<<<< HEAD
>>>>>>> 9abc630fdf (GEOMESA-3061 Converters - support bytes in Avro top-level union types (#2762))
<<<<<<< HEAD
>>>>>>> d294ce49e2 (GEOMESA-3061 Converters - support bytes in Avro top-level union types (#2762))
=======
=======
=======
=======
>>>>>>> 908ad4071 (GEOMESA-3067 Find attribute in Filters with Functions with embedded expressions correctly)
>>>>>>> bc4913194 (GEOMESA-3067 Find attribute in Filters with Functions with embedded expressions correctly)
<<<<<<< HEAD
<<<<<<< HEAD
<<<<<<< HEAD
>>>>>>> 570899511d (GEOMESA-3067 Find attribute in Filters with Functions with embedded expressions correctly)
<<<<<<< HEAD
>>>>>>> ed45e8551f (GEOMESA-3067 Find attribute in Filters with Functions with embedded expressions correctly)
=======
=======
=======
>>>>>>> bdbced26d (GEOMESA-3061 Converters - support bytes in Avro top-level union types (#2762))
<<<<<<< HEAD
<<<<<<< HEAD
<<<<<<< HEAD
>>>>>>> 25063957fc (GEOMESA-3061 Converters - support bytes in Avro top-level union types (#2762))
<<<<<<< HEAD
>>>>>>> 1df8328338 (GEOMESA-3061 Converters - support bytes in Avro top-level union types (#2762))
=======
=======
=======
=======
>>>>>>> 3be8d2a5a (Merge branch 'feature/postgis-fixes')
>>>>>>> 1b25d7ddb (Merge branch 'feature/postgis-fixes')
>>>>>>> 699117eca9 (Merge branch 'feature/postgis-fixes')
>>>>>>> c69897d7bd (Merge branch 'feature/postgis-fixes')
=======
>>>>>>> 74db66044b (GEOMESA-3067 Find attribute in Filters with Functions with embedded expressions correctly)
<<<<<<< HEAD
<<<<<<< HEAD
<<<<<<< HEAD
<<<<<<< HEAD
=======
>>>>>>> 0104fb37e4 (GEOMESA-3061 Converters - support bytes in Avro top-level union types (#2762))
=======
>>>>>>> 9293965a7d (GEOMESA-3061 Converters - support bytes in Avro top-level union types (#2762))
=======
=======
>>>>>>> b9bdd406e (GEOMESA-3061 Converters - support bytes in Avro top-level union types (#2762))
>>>>>>> f0b9bd8121 (GEOMESA-3061 Converters - support bytes in Avro top-level union types (#2762))
<<<<<<< HEAD
<<<<<<< HEAD
<<<<<<< HEAD
<<<<<<< HEAD
=======
>>>>>>> 530b057384 (GEOMESA-3067 Find attribute in Filters with Functions with embedded expressions correctly)
=======
>>>>>>> 67dc71ffb1 (GEOMESA-3067 Find attribute in Filters with Functions with embedded expressions correctly)
=======
=======
>>>>>>> b9bdd406e (GEOMESA-3061 Converters - support bytes in Avro top-level union types (#2762))
=======
>>>>>>> f36b0e8b9 (GEOMESA-3067 Find attribute in Filters with Functions with embedded expressions correctly)
>>>>>>> ef1a0521bd (GEOMESA-3067 Find attribute in Filters with Functions with embedded expressions correctly)
<<<<<<< HEAD
<<<<<<< HEAD
<<<<<<< HEAD
<<<<<<< HEAD
=======
>>>>>>> c3c5dd0ebb (GEOMESA-3061 Converters - support bytes in Avro top-level union types (#2762))
=======
=======
>>>>>>> e3a63fee1 (GEOMESA-3067 Find attribute in Filters with Functions with embedded expressions correctly)
>>>>>>> 20f6826d0f (GEOMESA-3067 Find attribute in Filters with Functions with embedded expressions correctly)
<<<<<<< HEAD
<<<<<<< HEAD
<<<<<<< HEAD
<<<<<<< HEAD
=======
>>>>>>> 4c361f07da (GEOMESA-3061 Converters - support bytes in Avro top-level union types (#2762))
=======
=======
>>>>>>> a63cb7e74 (GEOMESA-3067 Find attribute in Filters with Functions with embedded expressions correctly)
>>>>>>> 125ffd0575 (GEOMESA-3067 Find attribute in Filters with Functions with embedded expressions correctly)
<<<<<<< HEAD
<<<<<<< HEAD
<<<<<<< HEAD
<<<<<<< HEAD
=======
>>>>>>> 86ec77f9cb (GEOMESA-3061 Converters - support bytes in Avro top-level union types (#2762))
=======
>>>>>>> 2a887f75bf (GEOMESA-3061 Converters - support bytes in Avro top-level union types (#2762))
=======
=======
>>>>>>> 67b361c85 (GEOMESA-3061 Converters - support bytes in Avro top-level union types (#2762))
>>>>>>> f302a54949 (GEOMESA-3061 Converters - support bytes in Avro top-level union types (#2762))
<<<<<<< HEAD
<<<<<<< HEAD
<<<<<<< HEAD
<<<<<<< HEAD
=======
>>>>>>> 17883cb601 (GEOMESA-3067 Find attribute in Filters with Functions with embedded expressions correctly)
=======
>>>>>>> 08a743b61d (GEOMESA-3067 Find attribute in Filters with Functions with embedded expressions correctly)
=======
=======
>>>>>>> 908ad4071 (GEOMESA-3067 Find attribute in Filters with Functions with embedded expressions correctly)
>>>>>>> a83fe4cf7c (GEOMESA-3067 Find attribute in Filters with Functions with embedded expressions correctly)
<<<<<<< HEAD
<<<<<<< HEAD
<<<<<<< HEAD
<<<<<<< HEAD
=======
>>>>>>> a788dfac03 (GEOMESA-3061 Converters - support bytes in Avro top-level union types (#2762))
=======
=======
>>>>>>> 3be8d2a5a (Merge branch 'feature/postgis-fixes')
>>>>>>> da00c7bd68 (Merge branch 'feature/postgis-fixes')
<<<<<<< HEAD
<<<<<<< HEAD
<<<<<<< HEAD
=======
>>>>>>> 32d312dc48 (GEOMESA-3067 Find attribute in Filters with Functions with embedded expressions correctly)
=======
=======
>>>>>>> b9bdd406e3 (GEOMESA-3061 Converters - support bytes in Avro top-level union types (#2762))
>>>>>>> 59a1fbb96e (GEOMESA-3061 Converters - support bytes in Avro top-level union types (#2762))
<<<<<<< HEAD
<<<<<<< HEAD
=======
>>>>>>> a1d28116d4 (GEOMESA-3067 Find attribute in Filters with Functions with embedded expressions correctly)
=======
>>>>>>> d1fa26b39d (GEOMESA-3061 Converters - support bytes in Avro top-level union types (#2762))
<<<<<<< HEAD
<<<<<<< HEAD
=======
>>>>>>> 70f2c62b7e (GEOMESA-3067 Find attribute in Filters with Functions with embedded expressions correctly)
=======
=======
>>>>>>> e3a63fee18 (GEOMESA-3067 Find attribute in Filters with Functions with embedded expressions correctly)
>>>>>>> ef55408e9a (GEOMESA-3067 Find attribute in Filters with Functions with embedded expressions correctly)
<<<<<<< HEAD
<<<<<<< HEAD
=======
>>>>>>> f67dd3371e (GEOMESA-3061 Converters - support bytes in Avro top-level union types (#2762))
=======
=======
=======
<<<<<<< HEAD
<<<<<<< HEAD
>>>>>>> 67b361c856 (GEOMESA-3061 Converters - support bytes in Avro top-level union types (#2762))
=======
>>>>>>> b9bdd406e (GEOMESA-3061 Converters - support bytes in Avro top-level union types (#2762))
=======
>>>>>>> f36b0e8b9 (GEOMESA-3067 Find attribute in Filters with Functions with embedded expressions correctly)
<<<<<<< HEAD
>>>>>>> a63cb7e740 (GEOMESA-3067 Find attribute in Filters with Functions with embedded expressions correctly)
<<<<<<< HEAD
>>>>>>> a9884ff1f6 (GEOMESA-3067 Find attribute in Filters with Functions with embedded expressions correctly)
=======
=======
=======
=======
>>>>>>> b9bdd406e (GEOMESA-3061 Converters - support bytes in Avro top-level union types (#2762))
>>>>>>> cdb410251 (GEOMESA-3061 Converters - support bytes in Avro top-level union types (#2762))
>>>>>>> 67b361c856 (GEOMESA-3061 Converters - support bytes in Avro top-level union types (#2762))
<<<<<<< HEAD
<<<<<<< HEAD
<<<<<<< HEAD
=======
>>>>>>> 87dddefcd8 (GEOMESA-3067 Find attribute in Filters with Functions with embedded expressions correctly)
>>>>>>> f7cef54062 (GEOMESA-3061 Converters - support bytes in Avro top-level union types (#2762))
=======
=======
>>>>>>> 908ad4071d (GEOMESA-3067 Find attribute in Filters with Functions with embedded expressions correctly)
<<<<<<< HEAD
<<<<<<< HEAD
<<<<<<< HEAD
<<<<<<< HEAD
>>>>>>> 49f2a1c310 (GEOMESA-3067 Find attribute in Filters with Functions with embedded expressions correctly)
=======
=======
>>>>>>> 0efbfe547e (GEOMESA-3061 Converters - support bytes in Avro top-level union types (#2762))
=======
=======
>>>>>>> b9bdd406e (GEOMESA-3061 Converters - support bytes in Avro top-level union types (#2762))
>>>>>>> b4320946b4 (GEOMESA-3061 Converters - support bytes in Avro top-level union types (#2762))
<<<<<<< HEAD
<<<<<<< HEAD
<<<<<<< HEAD
>>>>>>> a16b64a4d1 (GEOMESA-3061 Converters - support bytes in Avro top-level union types (#2762))
=======
=======
>>>>>>> 3be8d2a5a4 (Merge branch 'feature/postgis-fixes')
>>>>>>> 34472778d3 (Merge branch 'feature/postgis-fixes')
=======
>>>>>>> 5430d59024 (GEOMESA-3067 Find attribute in Filters with Functions with embedded expressions correctly)
=======
>>>>>>> 810876750d (GEOMESA-3061 Converters - support bytes in Avro top-level union types (#2762))
<<<<<<< HEAD
<<<<<<< HEAD
=======
=======
>>>>>>> cd4422a10c (GEOMESA-3067 Find attribute in Filters with Functions with embedded expressions correctly)
=======
=======
=======
=======
>>>>>>> adfec3a47a (GEOMESA-3067 Find attribute in Filters with Functions with embedded expressions correctly)
=======
>>>>>>> b9bdd406e (GEOMESA-3061 Converters - support bytes in Avro top-level union types (#2762))
=======
>>>>>>> f36b0e8b9 (GEOMESA-3067 Find attribute in Filters with Functions with embedded expressions correctly)
>>>>>>> e182e6e99c (GEOMESA-3067 Find attribute in Filters with Functions with embedded expressions correctly)
<<<<<<< HEAD
<<<<<<< HEAD
<<<<<<< HEAD
<<<<<<< HEAD
<<<<<<< HEAD
=======
>>>>>>> e0c2527549 (GEOMESA-3061 Converters - support bytes in Avro top-level union types (#2762))
>>>>>>> 2571e49519 (GEOMESA-3067 Find attribute in Filters with Functions with embedded expressions correctly)
=======
=======
>>>>>>> 9d708b240a (GEOMESA-3061 Converters - support bytes in Avro top-level union types (#2762))
<<<<<<< HEAD
<<<<<<< HEAD
<<<<<<< HEAD
<<<<<<< HEAD
>>>>>>> d206a68a13 (GEOMESA-3061 Converters - support bytes in Avro top-level union types (#2762))
=======
=======
<<<<<<< HEAD
=======
=======
>>>>>>> 94fecee1d8 (GEOMESA-3061 Converters - support bytes in Avro top-level union types (#2762))
>>>>>>> c8a325e13c (GEOMESA-3061 Converters - support bytes in Avro top-level union types (#2762))
=======
>>>>>>> c8a325e13c (GEOMESA-3061 Converters - support bytes in Avro top-level union types (#2762))
=======
>>>>>>> e3a63fee1 (GEOMESA-3067 Find attribute in Filters with Functions with embedded expressions correctly)
<<<<<<< HEAD
>>>>>>> 3333975e77 (GEOMESA-3067 Find attribute in Filters with Functions with embedded expressions correctly)
<<<<<<< HEAD
>>>>>>> 9412e85b59 (GEOMESA-3067 Find attribute in Filters with Functions with embedded expressions correctly)
=======
=======
=======
=======
>>>>>>> b9bdd406e (GEOMESA-3061 Converters - support bytes in Avro top-level union types (#2762))
>>>>>>> 0e68e9f4c (GEOMESA-3061 Converters - support bytes in Avro top-level union types (#2762))
<<<<<<< HEAD
<<<<<<< HEAD
>>>>>>> 76618c8da3 (GEOMESA-3061 Converters - support bytes in Avro top-level union types (#2762))
<<<<<<< HEAD
>>>>>>> 694bcd3776 (GEOMESA-3061 Converters - support bytes in Avro top-level union types (#2762))
=======
=======
=======
>>>>>>> a63cb7e74 (GEOMESA-3067 Find attribute in Filters with Functions with embedded expressions correctly)
<<<<<<< HEAD
<<<<<<< HEAD
>>>>>>> c3b0a1b6e3 (GEOMESA-3067 Find attribute in Filters with Functions with embedded expressions correctly)
<<<<<<< HEAD
>>>>>>> 24c4df93a5 (GEOMESA-3067 Find attribute in Filters with Functions with embedded expressions correctly)
=======
=======
=======
>>>>>>> 67b361c85 (GEOMESA-3061 Converters - support bytes in Avro top-level union types (#2762))
<<<<<<< HEAD
<<<<<<< HEAD
>>>>>>> c8a325e13c (GEOMESA-3061 Converters - support bytes in Avro top-level union types (#2762))
<<<<<<< HEAD
>>>>>>> 6cd1151639 (GEOMESA-3061 Converters - support bytes in Avro top-level union types (#2762))
=======
=======
=======
>>>>>>> 908ad4071 (GEOMESA-3067 Find attribute in Filters with Functions with embedded expressions correctly)
<<<<<<< HEAD
<<<<<<< HEAD
>>>>>>> 9638dc731e (GEOMESA-3067 Find attribute in Filters with Functions with embedded expressions correctly)
<<<<<<< HEAD
>>>>>>> 1e00950a90 (GEOMESA-3067 Find attribute in Filters with Functions with embedded expressions correctly)
=======
=======
=======
=======
>>>>>>> b9bdd406e (GEOMESA-3061 Converters - support bytes in Avro top-level union types (#2762))
>>>>>>> b4320946b (GEOMESA-3061 Converters - support bytes in Avro top-level union types (#2762))
<<<<<<< HEAD
<<<<<<< HEAD
>>>>>>> 97ec7d864a (GEOMESA-3061 Converters - support bytes in Avro top-level union types (#2762))
<<<<<<< HEAD
>>>>>>> 1973f72e77 (GEOMESA-3061 Converters - support bytes in Avro top-level union types (#2762))
=======
=======
=======
>>>>>>> 3be8d2a5a (Merge branch 'feature/postgis-fixes')
>>>>>>> db8d998aa2 (Merge branch 'feature/postgis-fixes')
<<<<<<< HEAD
<<<<<<< HEAD
<<<<<<< HEAD
=======
>>>>>>> c738f63bd9 (GEOMESA-3254 Add Bloop build support)
>>>>>>> 42e8565e9b (Merge branch 'feature/postgis-fixes')
=======
=======
>>>>>>> d845d7c1bd (GEOMESA-3254 Add Bloop build support)
<<<<<<< HEAD
<<<<<<< HEAD
<<<<<<< HEAD
<<<<<<< HEAD
=======
>>>>>>> 7213a78a3a (GEOMESA-3067 Find attribute in Filters with Functions with embedded expressions correctly)
>>>>>>> f1532f2313 (GEOMESA-3254 Add Bloop build support)
=======
=======
>>>>>>> 7bb5f26c3e (GEOMESA-3067 Find attribute in Filters with Functions with embedded expressions correctly)
<<<<<<< HEAD
<<<<<<< HEAD
<<<<<<< HEAD
<<<<<<< HEAD
>>>>>>> 4bbf97686c (GEOMESA-3067 Find attribute in Filters with Functions with embedded expressions correctly)
=======
=======
>>>>>>> 7fbbd56493 (GEOMESA-3061 Converters - support bytes in Avro top-level union types (#2762))
=======
=======
>>>>>>> b9bdd406e (GEOMESA-3061 Converters - support bytes in Avro top-level union types (#2762))
>>>>>>> 6d9a5b626c (GEOMESA-3061 Converters - support bytes in Avro top-level union types (#2762))
<<<<<<< HEAD
>>>>>>> 96d5d442fa (GEOMESA-3061 Converters - support bytes in Avro top-level union types (#2762))
=======
>>>>>>> b3dd8ec805 (GEOMESA-3067 Find attribute in Filters with Functions with embedded expressions correctly)
=======
=======
>>>>>>> e6e1f4bdd5 (GEOMESA-3061 Converters - support bytes in Avro top-level union types (#2762))
>>>>>>> 5dcf23da52 (GEOMESA-3061 Converters - support bytes in Avro top-level union types (#2762))
=======
>>>>>>> 2b62d1f3fe (GEOMESA-3067 Find attribute in Filters with Functions with embedded expressions correctly)
<<<<<<< HEAD
<<<<<<< HEAD
=======
>>>>>>> 009a284072 (GEOMESA-3061 Converters - support bytes in Avro top-level union types (#2762))
=======
=======
>>>>>>> a910ae135f (GEOMESA-3061 Converters - support bytes in Avro top-level union types (#2762))
>>>>>>> 92674ff9d4 (GEOMESA-3061 Converters - support bytes in Avro top-level union types (#2762))
<<<<<<< HEAD
<<<<<<< HEAD
=======
>>>>>>> c169cb2905 (GEOMESA-3067 Find attribute in Filters with Functions with embedded expressions correctly)
=======
>>>>>>> 9a4dff9e4f (GEOMESA-3061 Converters - support bytes in Avro top-level union types (#2762))
<<<<<<< HEAD
<<<<<<< HEAD
=======
>>>>>>> 63ca73533e (GEOMESA-3067 Find attribute in Filters with Functions with embedded expressions correctly)
=======
=======
>>>>>>> bdbced26d4 (GEOMESA-3061 Converters - support bytes in Avro top-level union types (#2762))
>>>>>>> 0fc6650ecf (GEOMESA-3061 Converters - support bytes in Avro top-level union types (#2762))
<<<<<<< HEAD
<<<<<<< HEAD
=======
>>>>>>> 67de3c3202 (Merge branch 'feature/postgis-fixes')
=======
=======
<<<<<<< HEAD
>>>>>>> 27afb28ab6 (GEOMESA-3061 Converters - support bytes in Avro top-level union types (#2762))
=======
=======
>>>>>>> a5b0374ee2 (GEOMESA-3061 Converters - support bytes in Avro top-level union types (#2762))
=======
=======
>>>>>>> b9bdd406e (GEOMESA-3061 Converters - support bytes in Avro top-level union types (#2762))
>>>>>>> 87bf55340 (GEOMESA-3061 Converters - support bytes in Avro top-level union types (#2762))
<<<<<<< HEAD
<<<<<<< HEAD
<<<<<<< HEAD
<<<<<<< HEAD
>>>>>>> 0dbede148d (GEOMESA-3061 Converters - support bytes in Avro top-level union types (#2762))
<<<<<<< HEAD
>>>>>>> 1bb69524c2 (GEOMESA-3061 Converters - support bytes in Avro top-level union types (#2762))
=======
=======
>>>>>>> 0dbede148d (GEOMESA-3061 Converters - support bytes in Avro top-level union types (#2762))
>>>>>>> 26a09ee6c2 (GEOMESA-3061 Converters - support bytes in Avro top-level union types (#2762))
=======
=======
>>>>>>> 240977229 (GEOMESA-3061 Converters - support bytes in Avro top-level union types (#2762))
>>>>>>> 22dcc8170f (GEOMESA-3061 Converters - support bytes in Avro top-level union types (#2762))
<<<<<<< HEAD
>>>>>>> 8c9ca1211a (GEOMESA-3061 Converters - support bytes in Avro top-level union types (#2762))
=======
>>>>>>> b009fd23f4 (GEOMESA-3061 Converters - support bytes in Avro top-level union types (#2762))
>>>>>>> a22efb4d66 (GEOMESA-3061 Converters - support bytes in Avro top-level union types (#2762))
=======
>>>>>>> 238945d4b3 (GEOMESA-3061 Converters - support bytes in Avro top-level union types (#2762))
>>>>>>> 1cad375176 (GEOMESA-3061 Converters - support bytes in Avro top-level union types (#2762))
<<<<<<< HEAD
<<<<<<< HEAD
=======
>>>>>>> bc4062951d (GEOMESA-3061 Converters - support bytes in Avro top-level union types (#2762))
>>>>>>> 1e39c0c27d (GEOMESA-3061 Converters - support bytes in Avro top-level union types (#2762))
=======
>>>>>>> e944f1c88b (Merge branch 'feature/postgis-fixes')
>>>>>>> 638b68d081 (Merge branch 'feature/postgis-fixes')
=======
=======
>>>>>>> a1f15598cb (GEOMESA-3061 Converters - support bytes in Avro top-level union types (#2762))
>>>>>>> 8a3e82747d (GEOMESA-3067 Find attribute in Filters with Functions with embedded expressions correctly)
<<<<<<< HEAD
>>>>>>> deb8fd68de (GEOMESA-3067 Find attribute in Filters with Functions with embedded expressions correctly)
<<<<<<< HEAD
>>>>>>> a990cf104e (GEOMESA-3067 Find attribute in Filters with Functions with embedded expressions correctly)
=======
=======
=======
=======
=======
>>>>>>> b9bdd406e (GEOMESA-3061 Converters - support bytes in Avro top-level union types (#2762))
<<<<<<< HEAD
>>>>>>> d9ed077cd (GEOMESA-3061 Converters - support bytes in Avro top-level union types (#2762))
=======
>>>>>>> 4373c901b3 (GEOMESA-3067 Find attribute in Filters with Functions with embedded expressions correctly)
>>>>>>> 81ee66102b (GEOMESA-3061 Converters - support bytes in Avro top-level union types (#2762))
<<<<<<< HEAD
>>>>>>> 8adfab65bb (GEOMESA-3061 Converters - support bytes in Avro top-level union types (#2762))
<<<<<<< HEAD
>>>>>>> a1f15598cb (GEOMESA-3061 Converters - support bytes in Avro top-level union types (#2762))
=======
=======
=======
=======
>>>>>>> e182e6e99 (GEOMESA-3067 Find attribute in Filters with Functions with embedded expressions correctly)
=======
>>>>>>> 963feec660 (GEOMESA-3061 Converters - support bytes in Avro top-level union types (#2762))
>>>>>>> 9943e05ec9 (GEOMESA-3067 Find attribute in Filters with Functions with embedded expressions correctly)
<<<<<<< HEAD
>>>>>>> 3254b186da (GEOMESA-3067 Find attribute in Filters with Functions with embedded expressions correctly)
<<<<<<< HEAD
>>>>>>> 4373c901b3 (GEOMESA-3067 Find attribute in Filters with Functions with embedded expressions correctly)
=======
=======
=======
=======
>>>>>>> 9d708b240 (GEOMESA-3061 Converters - support bytes in Avro top-level union types (#2762))
=======
>>>>>>> 2c14568a23 (GEOMESA-3067 Find attribute in Filters with Functions with embedded expressions correctly)
>>>>>>> 53a3e72cbf (GEOMESA-3061 Converters - support bytes in Avro top-level union types (#2762))
<<<<<<< HEAD
>>>>>>> 7b0539b808 (GEOMESA-3061 Converters - support bytes in Avro top-level union types (#2762))
<<<<<<< HEAD
>>>>>>> 963feec660 (GEOMESA-3061 Converters - support bytes in Avro top-level union types (#2762))
=======
=======
=======
=======
=======
>>>>>>> e3a63fee1 (GEOMESA-3067 Find attribute in Filters with Functions with embedded expressions correctly)
>>>>>>> 3333975e7 (GEOMESA-3067 Find attribute in Filters with Functions with embedded expressions correctly)
=======
>>>>>>> 84ac051f28 (GEOMESA-3061 Converters - support bytes in Avro top-level union types (#2762))
>>>>>>> d15af7157e (GEOMESA-3067 Find attribute in Filters with Functions with embedded expressions correctly)
<<<<<<< HEAD
>>>>>>> 982031ef44 (GEOMESA-3067 Find attribute in Filters with Functions with embedded expressions correctly)
<<<<<<< HEAD
>>>>>>> 2c14568a23 (GEOMESA-3067 Find attribute in Filters with Functions with embedded expressions correctly)
=======
=======
=======
=======
>>>>>>> 76618c8da (GEOMESA-3061 Converters - support bytes in Avro top-level union types (#2762))
=======
>>>>>>> 99acaa0887 (GEOMESA-3067 Find attribute in Filters with Functions with embedded expressions correctly)
>>>>>>> 947761ec9b (GEOMESA-3061 Converters - support bytes in Avro top-level union types (#2762))
<<<<<<< HEAD
>>>>>>> 0086b292ba (GEOMESA-3061 Converters - support bytes in Avro top-level union types (#2762))
<<<<<<< HEAD
>>>>>>> 84ac051f28 (GEOMESA-3061 Converters - support bytes in Avro top-level union types (#2762))
=======
=======
=======
=======
=======
>>>>>>> a63cb7e74 (GEOMESA-3067 Find attribute in Filters with Functions with embedded expressions correctly)
>>>>>>> c3b0a1b6e (GEOMESA-3067 Find attribute in Filters with Functions with embedded expressions correctly)
=======
>>>>>>> fe3de10f11 (GEOMESA-3061 Converters - support bytes in Avro top-level union types (#2762))
>>>>>>> 9813375fcc (GEOMESA-3067 Find attribute in Filters with Functions with embedded expressions correctly)
<<<<<<< HEAD
>>>>>>> cf57a2c189 (GEOMESA-3067 Find attribute in Filters with Functions with embedded expressions correctly)
<<<<<<< HEAD
>>>>>>> 99acaa0887 (GEOMESA-3067 Find attribute in Filters with Functions with embedded expressions correctly)
=======
=======
=======
=======
>>>>>>> c8a325e13 (GEOMESA-3061 Converters - support bytes in Avro top-level union types (#2762))
=======
>>>>>>> 21deff19fd (GEOMESA-3067 Find attribute in Filters with Functions with embedded expressions correctly)
>>>>>>> c9328eddce (GEOMESA-3061 Converters - support bytes in Avro top-level union types (#2762))
<<<<<<< HEAD
>>>>>>> e15d50d7d3 (GEOMESA-3061 Converters - support bytes in Avro top-level union types (#2762))
<<<<<<< HEAD
>>>>>>> fe3de10f11 (GEOMESA-3061 Converters - support bytes in Avro top-level union types (#2762))
=======
=======
=======
=======
=======
>>>>>>> 908ad4071 (GEOMESA-3067 Find attribute in Filters with Functions with embedded expressions correctly)
>>>>>>> 9638dc731 (GEOMESA-3067 Find attribute in Filters with Functions with embedded expressions correctly)
=======
>>>>>>> d0785cf307 (GEOMESA-3061 Converters - support bytes in Avro top-level union types (#2762))
>>>>>>> d2eec4be68 (GEOMESA-3067 Find attribute in Filters with Functions with embedded expressions correctly)
<<<<<<< HEAD
>>>>>>> bec3ba7d08 (GEOMESA-3067 Find attribute in Filters with Functions with embedded expressions correctly)
<<<<<<< HEAD
>>>>>>> 21deff19fd (GEOMESA-3067 Find attribute in Filters with Functions with embedded expressions correctly)
=======
=======
=======
=======
>>>>>>> 97ec7d864 (GEOMESA-3061 Converters - support bytes in Avro top-level union types (#2762))
=======
>>>>>>> 71adb695c5 (Merge branch 'feature/postgis-fixes')
>>>>>>> d94c03a98e (GEOMESA-3061 Converters - support bytes in Avro top-level union types (#2762))
<<<<<<< HEAD
>>>>>>> 8de43cccf6 (GEOMESA-3061 Converters - support bytes in Avro top-level union types (#2762))
<<<<<<< HEAD
>>>>>>> d0785cf307 (GEOMESA-3061 Converters - support bytes in Avro top-level union types (#2762))
=======
=======
=======
=======
=======
>>>>>>> 3be8d2a5a (Merge branch 'feature/postgis-fixes')
>>>>>>> db8d998aa (Merge branch 'feature/postgis-fixes')
=======
>>>>>>> 5a4c24e020 (GEOMESA-3254 Add Bloop build support)
>>>>>>> cb6bda89b6 (Merge branch 'feature/postgis-fixes')
<<<<<<< HEAD
>>>>>>> 26e5afc4ea (Merge branch 'feature/postgis-fixes')
<<<<<<< HEAD
>>>>>>> 71adb695c5 (Merge branch 'feature/postgis-fixes')
=======
=======
=======
=======
>>>>>>> d845d7c1b (GEOMESA-3254 Add Bloop build support)
=======
>>>>>>> 53900605ca (GEOMESA-3067 Find attribute in Filters with Functions with embedded expressions correctly)
>>>>>>> 09d87762c5 (GEOMESA-3254 Add Bloop build support)
<<<<<<< HEAD
>>>>>>> 63a045a753 (GEOMESA-3254 Add Bloop build support)
<<<<<<< HEAD
>>>>>>> 5a4c24e020 (GEOMESA-3254 Add Bloop build support)
=======
=======
=======
=======
>>>>>>> 7bb5f26c3 (GEOMESA-3067 Find attribute in Filters with Functions with embedded expressions correctly)
=======
>>>>>>> a52e4429be (GEOMESA-3061 Converters - support bytes in Avro top-level union types (#2762))
>>>>>>> e69b2aa6dc (GEOMESA-3067 Find attribute in Filters with Functions with embedded expressions correctly)
<<<<<<< HEAD
>>>>>>> b1a7408547 (GEOMESA-3067 Find attribute in Filters with Functions with embedded expressions correctly)
<<<<<<< HEAD
>>>>>>> 53900605ca (GEOMESA-3067 Find attribute in Filters with Functions with embedded expressions correctly)
=======
=======
=======
=======
=======
>>>>>>> b9bdd406e (GEOMESA-3061 Converters - support bytes in Avro top-level union types (#2762))
>>>>>>> 6d9a5b626 (GEOMESA-3061 Converters - support bytes in Avro top-level union types (#2762))
=======
>>>>>>> 5f01e2c4fc (GEOMESA-3067 Find attribute in Filters with Functions with embedded expressions correctly)
>>>>>>> 67e4c1354f (GEOMESA-3061 Converters - support bytes in Avro top-level union types (#2762))
<<<<<<< HEAD
>>>>>>> 12e3a588fc (GEOMESA-3061 Converters - support bytes in Avro top-level union types (#2762))
<<<<<<< HEAD
>>>>>>> a52e4429be (GEOMESA-3061 Converters - support bytes in Avro top-level union types (#2762))
=======
=======
=======
=======
=======
=======
>>>>>>> 5c6b9f1f8b (GEOMESA-3061 Converters - support bytes in Avro top-level union types (#2762))
>>>>>>> b9bdd406e (GEOMESA-3061 Converters - support bytes in Avro top-level union types (#2762))
=======
>>>>>>> f36b0e8b9 (GEOMESA-3067 Find attribute in Filters with Functions with embedded expressions correctly)
<<<<<<< HEAD
>>>>>>> e5ed68fdd (GEOMESA-3067 Find attribute in Filters with Functions with embedded expressions correctly)
<<<<<<< HEAD
>>>>>>> 060ac2189c (GEOMESA-3067 Find attribute in Filters with Functions with embedded expressions correctly)
<<<<<<< HEAD
>>>>>>> c8e013ff91 (GEOMESA-3067 Find attribute in Filters with Functions with embedded expressions correctly)
<<<<<<< HEAD
>>>>>>> 5f01e2c4fc (GEOMESA-3067 Find attribute in Filters with Functions with embedded expressions correctly)
=======
=======
=======
=======
=======
=======
>>>>>>> b9bdd406e (GEOMESA-3061 Converters - support bytes in Avro top-level union types (#2762))
>>>>>>> cdb410251 (GEOMESA-3061 Converters - support bytes in Avro top-level union types (#2762))
>>>>>>> e6e1f4bdd (GEOMESA-3061 Converters - support bytes in Avro top-level union types (#2762))
<<<<<<< HEAD
>>>>>>> 8035cc5893 (GEOMESA-3061 Converters - support bytes in Avro top-level union types (#2762))
<<<<<<< HEAD
>>>>>>> 1890b11217 (GEOMESA-3061 Converters - support bytes in Avro top-level union types (#2762))
<<<<<<< HEAD
>>>>>>> 5c6b9f1f8b (GEOMESA-3061 Converters - support bytes in Avro top-level union types (#2762))
=======
=======
=======
=======
=======
>>>>>>> e3a63fee1 (GEOMESA-3067 Find attribute in Filters with Functions with embedded expressions correctly)
>>>>>>> 7f922b040 (GEOMESA-3067 Find attribute in Filters with Functions with embedded expressions correctly)
=======
>>>>>>> 9d44ff473d (GEOMESA-3061 Converters - support bytes in Avro top-level union types (#2762))
>>>>>>> 04f08c23c5 (GEOMESA-3067 Find attribute in Filters with Functions with embedded expressions correctly)
<<<<<<< HEAD
>>>>>>> 912169b5e9 (GEOMESA-3067 Find attribute in Filters with Functions with embedded expressions correctly)
<<<<<<< HEAD
>>>>>>> 511bd92a86 (GEOMESA-3067 Find attribute in Filters with Functions with embedded expressions correctly)
=======
=======
=======
=======
>>>>>>> a910ae135 (GEOMESA-3061 Converters - support bytes in Avro top-level union types (#2762))
=======
>>>>>>> bff2bdde04 (GEOMESA-3067 Find attribute in Filters with Functions with embedded expressions correctly)
>>>>>>> 07161eaaa6 (GEOMESA-3061 Converters - support bytes in Avro top-level union types (#2762))
<<<<<<< HEAD
>>>>>>> 9c28193a91 (GEOMESA-3061 Converters - support bytes in Avro top-level union types (#2762))
<<<<<<< HEAD
>>>>>>> 9d44ff473d (GEOMESA-3061 Converters - support bytes in Avro top-level union types (#2762))
=======
=======
=======
=======
=======
>>>>>>> a63cb7e74 (GEOMESA-3067 Find attribute in Filters with Functions with embedded expressions correctly)
>>>>>>> 8fb060734 (GEOMESA-3067 Find attribute in Filters with Functions with embedded expressions correctly)
=======
>>>>>>> a35efac12e (GEOMESA-3061 Converters - support bytes in Avro top-level union types (#2762))
>>>>>>> 38b3282770 (GEOMESA-3067 Find attribute in Filters with Functions with embedded expressions correctly)
<<<<<<< HEAD
>>>>>>> 1b60c2aeba (GEOMESA-3067 Find attribute in Filters with Functions with embedded expressions correctly)
<<<<<<< HEAD
>>>>>>> bff2bdde04 (GEOMESA-3067 Find attribute in Filters with Functions with embedded expressions correctly)
=======
=======
=======
=======
>>>>>>> ad3cedc4d (GEOMESA-3061 Converters - support bytes in Avro top-level union types (#2762))
=======
>>>>>>> 323528580f (GEOMESA-3067 Find attribute in Filters with Functions with embedded expressions correctly)
>>>>>>> 9abc630fdf (GEOMESA-3061 Converters - support bytes in Avro top-level union types (#2762))
<<<<<<< HEAD
>>>>>>> d294ce49e2 (GEOMESA-3061 Converters - support bytes in Avro top-level union types (#2762))
<<<<<<< HEAD
>>>>>>> a35efac12e (GEOMESA-3061 Converters - support bytes in Avro top-level union types (#2762))
=======
=======
=======
=======
=======
>>>>>>> 908ad4071 (GEOMESA-3067 Find attribute in Filters with Functions with embedded expressions correctly)
>>>>>>> bc4913194 (GEOMESA-3067 Find attribute in Filters with Functions with embedded expressions correctly)
=======
>>>>>>> fd5565dfba (GEOMESA-3061 Converters - support bytes in Avro top-level union types (#2762))
>>>>>>> 570899511d (GEOMESA-3067 Find attribute in Filters with Functions with embedded expressions correctly)
<<<<<<< HEAD
>>>>>>> ed45e8551f (GEOMESA-3067 Find attribute in Filters with Functions with embedded expressions correctly)
<<<<<<< HEAD
>>>>>>> 323528580f (GEOMESA-3067 Find attribute in Filters with Functions with embedded expressions correctly)
=======
=======
=======
=======
>>>>>>> bdbced26d (GEOMESA-3061 Converters - support bytes in Avro top-level union types (#2762))
=======
>>>>>>> 30559ea5c9 (Merge branch 'feature/postgis-fixes')
>>>>>>> 25063957fc (GEOMESA-3061 Converters - support bytes in Avro top-level union types (#2762))
<<<<<<< HEAD
>>>>>>> 1df8328338 (GEOMESA-3061 Converters - support bytes in Avro top-level union types (#2762))
<<<<<<< HEAD
>>>>>>> fd5565dfba (GEOMESA-3061 Converters - support bytes in Avro top-level union types (#2762))
=======
=======
=======
=======
=======
>>>>>>> 3be8d2a5a (Merge branch 'feature/postgis-fixes')
>>>>>>> 1b25d7ddb (Merge branch 'feature/postgis-fixes')
>>>>>>> 699117eca9 (Merge branch 'feature/postgis-fixes')
>>>>>>> c69897d7bd (Merge branch 'feature/postgis-fixes')
>>>>>>> 30559ea5c9 (Merge branch 'feature/postgis-fixes')
=======
>>>>>>> 78fe4921a6 (GEOMESA-3067 Find attribute in Filters with Functions with embedded expressions correctly)
=======
>>>>>>> 0104fb37e4 (GEOMESA-3061 Converters - support bytes in Avro top-level union types (#2762))
=======
>>>>>>> 530b057384 (GEOMESA-3067 Find attribute in Filters with Functions with embedded expressions correctly)
=======
=======
>>>>>>> c3c5dd0ebb (GEOMESA-3061 Converters - support bytes in Avro top-level union types (#2762))
>>>>>>> 2654d9c120 (GEOMESA-3061 Converters - support bytes in Avro top-level union types (#2762))
=======
>>>>>>> de7d6ef448 (GEOMESA-3067 Find attribute in Filters with Functions with embedded expressions correctly)
=======
=======
>>>>>>> 4c361f07da (GEOMESA-3061 Converters - support bytes in Avro top-level union types (#2762))
>>>>>>> f110463a26 (GEOMESA-3061 Converters - support bytes in Avro top-level union types (#2762))
=======
>>>>>>> d83561962d (GEOMESA-3067 Find attribute in Filters with Functions with embedded expressions correctly)
=======
>>>>>>> 86ec77f9cb (GEOMESA-3061 Converters - support bytes in Avro top-level union types (#2762))
=======
>>>>>>> 17883cb601 (GEOMESA-3067 Find attribute in Filters with Functions with embedded expressions correctly)
=======
=======
>>>>>>> a788dfac03 (GEOMESA-3061 Converters - support bytes in Avro top-level union types (#2762))
>>>>>>> 1bcc513539 (GEOMESA-3061 Converters - support bytes in Avro top-level union types (#2762))
=======
>>>>>>> ec6d06b576 (Merge branch 'feature/postgis-fixes')
=======
>>>>>>> 724c808fa8 (GEOMESA-3067 Find attribute in Filters with Functions with embedded expressions correctly)
=======
=======
>>>>>>> b9bdd406e3 (GEOMESA-3061 Converters - support bytes in Avro top-level union types (#2762))
>>>>>>> 3d5144418e (GEOMESA-3061 Converters - support bytes in Avro top-level union types (#2762))
=======
>>>>>>> efb6723f42 (GEOMESA-3067 Find attribute in Filters with Functions with embedded expressions correctly)
=======
>>>>>>> 7bdbfa5524 (GEOMESA-3061 Converters - support bytes in Avro top-level union types (#2762))
=======
=======
>>>>>>> e3a63fee18 (GEOMESA-3067 Find attribute in Filters with Functions with embedded expressions correctly)
>>>>>>> 17b189175b (GEOMESA-3067 Find attribute in Filters with Functions with embedded expressions correctly)
=======
>>>>>>> 7bff4d0018 (GEOMESA-3061 Converters - support bytes in Avro top-level union types (#2762))
=======
=======
=======
>>>>>>> 67b361c856 (GEOMESA-3061 Converters - support bytes in Avro top-level union types (#2762))
=======
>>>>>>> b9bdd406e (GEOMESA-3061 Converters - support bytes in Avro top-level union types (#2762))
=======
>>>>>>> f36b0e8b9 (GEOMESA-3067 Find attribute in Filters with Functions with embedded expressions correctly)
<<<<<<< HEAD
>>>>>>> a63cb7e740 (GEOMESA-3067 Find attribute in Filters with Functions with embedded expressions correctly)
<<<<<<< HEAD
>>>>>>> 657a38673a (GEOMESA-3067 Find attribute in Filters with Functions with embedded expressions correctly)
=======
=======
=======
=======
>>>>>>> b9bdd406e (GEOMESA-3061 Converters - support bytes in Avro top-level union types (#2762))
>>>>>>> cdb410251 (GEOMESA-3061 Converters - support bytes in Avro top-level union types (#2762))
>>>>>>> 67b361c856 (GEOMESA-3061 Converters - support bytes in Avro top-level union types (#2762))
>>>>>>> e8b736ee96 (GEOMESA-3061 Converters - support bytes in Avro top-level union types (#2762))
=======
=======
>>>>>>> 908ad4071d (GEOMESA-3067 Find attribute in Filters with Functions with embedded expressions correctly)
>>>>>>> e31a4215c4 (GEOMESA-3067 Find attribute in Filters with Functions with embedded expressions correctly)
=======
>>>>>>> 0efbfe547e (GEOMESA-3061 Converters - support bytes in Avro top-level union types (#2762))
=======
=======
>>>>>>> 3be8d2a5a4 (Merge branch 'feature/postgis-fixes')
>>>>>>> 4c41429da9 (Merge branch 'feature/postgis-fixes')
=======
>>>>>>> ca13f8551e (GEOMESA-3067 Find attribute in Filters with Functions with embedded expressions correctly)
=======
>>>>>>> d498bef1ce (GEOMESA-3061 Converters - support bytes in Avro top-level union types (#2762))
=======
>>>>>>> cd4422a10c (GEOMESA-3067 Find attribute in Filters with Functions with embedded expressions correctly)
=======
=======
>>>>>>> 9d708b240a (GEOMESA-3061 Converters - support bytes in Avro top-level union types (#2762))
>>>>>>> a5b160f47b (GEOMESA-3061 Converters - support bytes in Avro top-level union types (#2762))
=======
=======
=======
>>>>>>> e3a63fee1 (GEOMESA-3067 Find attribute in Filters with Functions with embedded expressions correctly)
<<<<<<< HEAD
>>>>>>> 3333975e77 (GEOMESA-3067 Find attribute in Filters with Functions with embedded expressions correctly)
<<<<<<< HEAD
>>>>>>> fa429c7863 (GEOMESA-3067 Find attribute in Filters with Functions with embedded expressions correctly)
=======
=======
=======
=======
>>>>>>> b9bdd406e (GEOMESA-3061 Converters - support bytes in Avro top-level union types (#2762))
>>>>>>> 0e68e9f4c (GEOMESA-3061 Converters - support bytes in Avro top-level union types (#2762))
<<<<<<< HEAD
>>>>>>> 76618c8da3 (GEOMESA-3061 Converters - support bytes in Avro top-level union types (#2762))
<<<<<<< HEAD
>>>>>>> 5cf31d21f3 (GEOMESA-3061 Converters - support bytes in Avro top-level union types (#2762))
=======
=======
=======
>>>>>>> a63cb7e74 (GEOMESA-3067 Find attribute in Filters with Functions with embedded expressions correctly)
<<<<<<< HEAD
>>>>>>> c3b0a1b6e3 (GEOMESA-3067 Find attribute in Filters with Functions with embedded expressions correctly)
<<<<<<< HEAD
>>>>>>> def2794bb5 (GEOMESA-3067 Find attribute in Filters with Functions with embedded expressions correctly)
=======
=======
=======
>>>>>>> 67b361c85 (GEOMESA-3061 Converters - support bytes in Avro top-level union types (#2762))
<<<<<<< HEAD
>>>>>>> c8a325e13c (GEOMESA-3061 Converters - support bytes in Avro top-level union types (#2762))
<<<<<<< HEAD
>>>>>>> 94fecee1d8 (GEOMESA-3061 Converters - support bytes in Avro top-level union types (#2762))
=======
=======
=======
>>>>>>> 908ad4071 (GEOMESA-3067 Find attribute in Filters with Functions with embedded expressions correctly)
<<<<<<< HEAD
>>>>>>> 9638dc731e (GEOMESA-3067 Find attribute in Filters with Functions with embedded expressions correctly)
<<<<<<< HEAD
>>>>>>> f8d3d445c0 (GEOMESA-3067 Find attribute in Filters with Functions with embedded expressions correctly)
=======
=======
=======
=======
>>>>>>> b9bdd406e (GEOMESA-3061 Converters - support bytes in Avro top-level union types (#2762))
>>>>>>> b4320946b (GEOMESA-3061 Converters - support bytes in Avro top-level union types (#2762))
<<<<<<< HEAD
>>>>>>> 97ec7d864a (GEOMESA-3061 Converters - support bytes in Avro top-level union types (#2762))
<<<<<<< HEAD
>>>>>>> 4599715c51 (d)
=======
=======
=======
>>>>>>> 3be8d2a5a (Merge branch 'feature/postgis-fixes')
>>>>>>> db8d998aa2 (Merge branch 'feature/postgis-fixes')
>>>>>>> 6e0709aba8 (Merge branch 'feature/postgis-fixes')
=======
=======
>>>>>>> d845d7c1bd (GEOMESA-3254 Add Bloop build support)
>>>>>>> 7a84c9d22d (GEOMESA-3254 Add Bloop build support)
=======
=======
>>>>>>> 7bb5f26c3e (GEOMESA-3067 Find attribute in Filters with Functions with embedded expressions correctly)
>>>>>>> bad8172e9b (GEOMESA-3067 Find attribute in Filters with Functions with embedded expressions correctly)
=======
>>>>>>> 7fbbd56493 (GEOMESA-3061 Converters - support bytes in Avro top-level union types (#2762))
=======
>>>>>>> e582c3ecfe (GEOMESA-3067 Find attribute in Filters with Functions with embedded expressions correctly)
=======
=======
>>>>>>> e6e1f4bdd5 (GEOMESA-3061 Converters - support bytes in Avro top-level union types (#2762))
>>>>>>> 3eb12f79a9 (GEOMESA-3061 Converters - support bytes in Avro top-level union types (#2762))
=======
>>>>>>> 8b16ac5c65 (GEOMESA-3067 Find attribute in Filters with Functions with embedded expressions correctly)
=======
=======
>>>>>>> a910ae135f (GEOMESA-3061 Converters - support bytes in Avro top-level union types (#2762))
>>>>>>> 4ccd6f6b1f (GEOMESA-3061 Converters - support bytes in Avro top-level union types (#2762))
=======
>>>>>>> f983ea29f0 (GEOMESA-3067 Find attribute in Filters with Functions with embedded expressions correctly)
=======
>>>>>>> 35b69b8f2f (GEOMESA-3061 Converters - support bytes in Avro top-level union types (#2762))
=======
>>>>>>> da4e2905b4 (GEOMESA-3067 Find attribute in Filters with Functions with embedded expressions correctly)
=======
=======
>>>>>>> bdbced26d4 (GEOMESA-3061 Converters - support bytes in Avro top-level union types (#2762))
>>>>>>> db8a3a22b2 (GEOMESA-3061 Converters - support bytes in Avro top-level union types (#2762))
=======
>>>>>>> ed25decdd5 (Merge branch 'feature/postgis-fixes')
=======
>>>>>>> 0dbede148d (GEOMESA-3061 Converters - support bytes in Avro top-level union types (#2762))
>>>>>>> 27afb28ab6 (GEOMESA-3061 Converters - support bytes in Avro top-level union types (#2762))
=======
>>>>>>> 26a09ee6c2 (GEOMESA-3061 Converters - support bytes in Avro top-level union types (#2762))
=======
>>>>>>> b009fd23f4 (GEOMESA-3061 Converters - support bytes in Avro top-level union types (#2762))
>>>>>>> 194ad4e5c0 (GEOMESA-3061 Converters - support bytes in Avro top-level union types (#2762))
=======
>>>>>>> 238945d4b3 (GEOMESA-3061 Converters - support bytes in Avro top-level union types (#2762))
>>>>>>> 7b3c90c53f (GEOMESA-3061 Converters - support bytes in Avro top-level union types (#2762))
=======
>>>>>>> bc4062951d (GEOMESA-3061 Converters - support bytes in Avro top-level union types (#2762))
>>>>>>> db9dfb6f14 (GEOMESA-3061 Converters - support bytes in Avro top-level union types (#2762))
=======
>>>>>>> e944f1c88b (Merge branch 'feature/postgis-fixes')
>>>>>>> f893d9a594 (Merge branch 'feature/postgis-fixes')
=======
=======
>>>>>>> b8ebbf6083 (GEOMESA-3061 Converters - support bytes in Avro top-level union types (#2762))
>>>>>>> 8a3e82747d (GEOMESA-3067 Find attribute in Filters with Functions with embedded expressions correctly)
<<<<<<< HEAD
>>>>>>> deb8fd68de (GEOMESA-3067 Find attribute in Filters with Functions with embedded expressions correctly)
<<<<<<< HEAD
>>>>>>> f33d55e2ba (GEOMESA-3067 Find attribute in Filters with Functions with embedded expressions correctly)
=======
=======
=======
=======
=======
>>>>>>> b9bdd406e (GEOMESA-3061 Converters - support bytes in Avro top-level union types (#2762))
>>>>>>> d9ed077cd (GEOMESA-3061 Converters - support bytes in Avro top-level union types (#2762))
=======
>>>>>>> 1278241911 (GEOMESA-3067 Find attribute in Filters with Functions with embedded expressions correctly)
>>>>>>> 81ee66102b (GEOMESA-3061 Converters - support bytes in Avro top-level union types (#2762))
<<<<<<< HEAD
>>>>>>> 8adfab65bb (GEOMESA-3061 Converters - support bytes in Avro top-level union types (#2762))
<<<<<<< HEAD
>>>>>>> b8ebbf6083 (GEOMESA-3061 Converters - support bytes in Avro top-level union types (#2762))
=======
=======
=======
=======
>>>>>>> e182e6e99 (GEOMESA-3067 Find attribute in Filters with Functions with embedded expressions correctly)
=======
>>>>>>> 3e7fb62639 (GEOMESA-3061 Converters - support bytes in Avro top-level union types (#2762))
>>>>>>> 9943e05ec9 (GEOMESA-3067 Find attribute in Filters with Functions with embedded expressions correctly)
<<<<<<< HEAD
>>>>>>> 3254b186da (GEOMESA-3067 Find attribute in Filters with Functions with embedded expressions correctly)
<<<<<<< HEAD
>>>>>>> 1278241911 (GEOMESA-3067 Find attribute in Filters with Functions with embedded expressions correctly)
=======
=======
=======
=======
>>>>>>> 9d708b240 (GEOMESA-3061 Converters - support bytes in Avro top-level union types (#2762))
=======
>>>>>>> 00d66ae013 (GEOMESA-3067 Find attribute in Filters with Functions with embedded expressions correctly)
>>>>>>> 53a3e72cbf (GEOMESA-3061 Converters - support bytes in Avro top-level union types (#2762))
<<<<<<< HEAD
>>>>>>> 7b0539b808 (GEOMESA-3061 Converters - support bytes in Avro top-level union types (#2762))
<<<<<<< HEAD
>>>>>>> 3e7fb62639 (GEOMESA-3061 Converters - support bytes in Avro top-level union types (#2762))
=======
=======
=======
=======
=======
>>>>>>> e3a63fee1 (GEOMESA-3067 Find attribute in Filters with Functions with embedded expressions correctly)
>>>>>>> 3333975e7 (GEOMESA-3067 Find attribute in Filters with Functions with embedded expressions correctly)
=======
>>>>>>> c2cfc968d2 (GEOMESA-3061 Converters - support bytes in Avro top-level union types (#2762))
>>>>>>> d15af7157e (GEOMESA-3067 Find attribute in Filters with Functions with embedded expressions correctly)
<<<<<<< HEAD
>>>>>>> 982031ef44 (GEOMESA-3067 Find attribute in Filters with Functions with embedded expressions correctly)
<<<<<<< HEAD
>>>>>>> 00d66ae013 (GEOMESA-3067 Find attribute in Filters with Functions with embedded expressions correctly)
=======
=======
=======
=======
>>>>>>> 76618c8da (GEOMESA-3061 Converters - support bytes in Avro top-level union types (#2762))
=======
>>>>>>> 5d8dab9f81 (GEOMESA-3067 Find attribute in Filters with Functions with embedded expressions correctly)
>>>>>>> 947761ec9b (GEOMESA-3061 Converters - support bytes in Avro top-level union types (#2762))
<<<<<<< HEAD
>>>>>>> 0086b292ba (GEOMESA-3061 Converters - support bytes in Avro top-level union types (#2762))
<<<<<<< HEAD
>>>>>>> c2cfc968d2 (GEOMESA-3061 Converters - support bytes in Avro top-level union types (#2762))
=======
=======
=======
=======
=======
>>>>>>> a63cb7e74 (GEOMESA-3067 Find attribute in Filters with Functions with embedded expressions correctly)
>>>>>>> c3b0a1b6e (GEOMESA-3067 Find attribute in Filters with Functions with embedded expressions correctly)
=======
>>>>>>> 0fa73844a1 (GEOMESA-3061 Converters - support bytes in Avro top-level union types (#2762))
>>>>>>> 9813375fcc (GEOMESA-3067 Find attribute in Filters with Functions with embedded expressions correctly)
<<<<<<< HEAD
>>>>>>> cf57a2c189 (GEOMESA-3067 Find attribute in Filters with Functions with embedded expressions correctly)
<<<<<<< HEAD
>>>>>>> 5d8dab9f81 (GEOMESA-3067 Find attribute in Filters with Functions with embedded expressions correctly)
=======
=======
=======
=======
>>>>>>> c8a325e13 (GEOMESA-3061 Converters - support bytes in Avro top-level union types (#2762))
=======
>>>>>>> 1ef95979ee (GEOMESA-3067 Find attribute in Filters with Functions with embedded expressions correctly)
>>>>>>> c9328eddce (GEOMESA-3061 Converters - support bytes in Avro top-level union types (#2762))
<<<<<<< HEAD
>>>>>>> e15d50d7d3 (GEOMESA-3061 Converters - support bytes in Avro top-level union types (#2762))
<<<<<<< HEAD
>>>>>>> 0fa73844a1 (GEOMESA-3061 Converters - support bytes in Avro top-level union types (#2762))
=======
=======
=======
=======
=======
>>>>>>> 908ad4071 (GEOMESA-3067 Find attribute in Filters with Functions with embedded expressions correctly)
>>>>>>> 9638dc731 (GEOMESA-3067 Find attribute in Filters with Functions with embedded expressions correctly)
=======
>>>>>>> 63546aacdc (GEOMESA-3061 Converters - support bytes in Avro top-level union types (#2762))
>>>>>>> d2eec4be68 (GEOMESA-3067 Find attribute in Filters with Functions with embedded expressions correctly)
<<<<<<< HEAD
>>>>>>> bec3ba7d08 (GEOMESA-3067 Find attribute in Filters with Functions with embedded expressions correctly)
<<<<<<< HEAD
>>>>>>> 1ef95979ee (GEOMESA-3067 Find attribute in Filters with Functions with embedded expressions correctly)
=======
=======
=======
=======
>>>>>>> 97ec7d864 (GEOMESA-3061 Converters - support bytes in Avro top-level union types (#2762))
=======
>>>>>>> 964e86145a (Merge branch 'feature/postgis-fixes')
>>>>>>> d94c03a98e (GEOMESA-3061 Converters - support bytes in Avro top-level union types (#2762))
<<<<<<< HEAD
>>>>>>> 8de43cccf6 (GEOMESA-3061 Converters - support bytes in Avro top-level union types (#2762))
<<<<<<< HEAD
>>>>>>> 63546aacdc (GEOMESA-3061 Converters - support bytes in Avro top-level union types (#2762))
=======
=======
=======
=======
=======
>>>>>>> 3be8d2a5a (Merge branch 'feature/postgis-fixes')
>>>>>>> db8d998aa (Merge branch 'feature/postgis-fixes')
=======
>>>>>>> b298e017f1 (GEOMESA-3254 Add Bloop build support)
>>>>>>> cb6bda89b6 (Merge branch 'feature/postgis-fixes')
<<<<<<< HEAD
>>>>>>> 26e5afc4ea (Merge branch 'feature/postgis-fixes')
<<<<<<< HEAD
>>>>>>> 964e86145a (Merge branch 'feature/postgis-fixes')
=======
=======
=======
=======
>>>>>>> d845d7c1b (GEOMESA-3254 Add Bloop build support)
=======
>>>>>>> 72b96c5c3e (GEOMESA-3067 Find attribute in Filters with Functions with embedded expressions correctly)
>>>>>>> 09d87762c5 (GEOMESA-3254 Add Bloop build support)
<<<<<<< HEAD
>>>>>>> 63a045a753 (GEOMESA-3254 Add Bloop build support)
<<<<<<< HEAD
>>>>>>> b298e017f1 (GEOMESA-3254 Add Bloop build support)
=======
=======
=======
=======
>>>>>>> 7bb5f26c3 (GEOMESA-3067 Find attribute in Filters with Functions with embedded expressions correctly)
=======
>>>>>>> 1ea8b10ac7 (GEOMESA-3061 Converters - support bytes in Avro top-level union types (#2762))
>>>>>>> e69b2aa6dc (GEOMESA-3067 Find attribute in Filters with Functions with embedded expressions correctly)
<<<<<<< HEAD
>>>>>>> b1a7408547 (GEOMESA-3067 Find attribute in Filters with Functions with embedded expressions correctly)
<<<<<<< HEAD
>>>>>>> 72b96c5c3e (GEOMESA-3067 Find attribute in Filters with Functions with embedded expressions correctly)
=======
=======
=======
=======
=======
>>>>>>> b9bdd406e (GEOMESA-3061 Converters - support bytes in Avro top-level union types (#2762))
>>>>>>> 6d9a5b626 (GEOMESA-3061 Converters - support bytes in Avro top-level union types (#2762))
=======
>>>>>>> e72b998c12 (GEOMESA-3067 Find attribute in Filters with Functions with embedded expressions correctly)
>>>>>>> 67e4c1354f (GEOMESA-3061 Converters - support bytes in Avro top-level union types (#2762))
<<<<<<< HEAD
>>>>>>> 12e3a588fc (GEOMESA-3061 Converters - support bytes in Avro top-level union types (#2762))
<<<<<<< HEAD
>>>>>>> 1ea8b10ac7 (GEOMESA-3061 Converters - support bytes in Avro top-level union types (#2762))
=======
=======
=======
=======
=======
=======
>>>>>>> b800c052cc (GEOMESA-3061 Converters - support bytes in Avro top-level union types (#2762))
>>>>>>> b9bdd406e (GEOMESA-3061 Converters - support bytes in Avro top-level union types (#2762))
=======
>>>>>>> f36b0e8b9 (GEOMESA-3067 Find attribute in Filters with Functions with embedded expressions correctly)
<<<<<<< HEAD
>>>>>>> e5ed68fdd (GEOMESA-3067 Find attribute in Filters with Functions with embedded expressions correctly)
<<<<<<< HEAD
>>>>>>> 060ac2189c (GEOMESA-3067 Find attribute in Filters with Functions with embedded expressions correctly)
<<<<<<< HEAD
>>>>>>> c8e013ff91 (GEOMESA-3067 Find attribute in Filters with Functions with embedded expressions correctly)
<<<<<<< HEAD
>>>>>>> e72b998c12 (GEOMESA-3067 Find attribute in Filters with Functions with embedded expressions correctly)
=======
=======
=======
=======
=======
=======
>>>>>>> b9bdd406e (GEOMESA-3061 Converters - support bytes in Avro top-level union types (#2762))
>>>>>>> cdb410251 (GEOMESA-3061 Converters - support bytes in Avro top-level union types (#2762))
>>>>>>> e6e1f4bdd (GEOMESA-3061 Converters - support bytes in Avro top-level union types (#2762))
<<<<<<< HEAD
>>>>>>> 8035cc5893 (GEOMESA-3061 Converters - support bytes in Avro top-level union types (#2762))
<<<<<<< HEAD
>>>>>>> 1890b11217 (GEOMESA-3061 Converters - support bytes in Avro top-level union types (#2762))
<<<<<<< HEAD
>>>>>>> b800c052cc (GEOMESA-3061 Converters - support bytes in Avro top-level union types (#2762))
=======
=======
=======
=======
=======
>>>>>>> e3a63fee1 (GEOMESA-3067 Find attribute in Filters with Functions with embedded expressions correctly)
>>>>>>> 7f922b040 (GEOMESA-3067 Find attribute in Filters with Functions with embedded expressions correctly)
=======
>>>>>>> 9dbe1503e8 (GEOMESA-3061 Converters - support bytes in Avro top-level union types (#2762))
>>>>>>> 04f08c23c5 (GEOMESA-3067 Find attribute in Filters with Functions with embedded expressions correctly)
<<<<<<< HEAD
>>>>>>> 912169b5e9 (GEOMESA-3067 Find attribute in Filters with Functions with embedded expressions correctly)
<<<<<<< HEAD
>>>>>>> 8e70a881a6 (GEOMESA-3067 Find attribute in Filters with Functions with embedded expressions correctly)
=======
=======
=======
=======
>>>>>>> a910ae135 (GEOMESA-3061 Converters - support bytes in Avro top-level union types (#2762))
=======
>>>>>>> 53bc726472 (GEOMESA-3067 Find attribute in Filters with Functions with embedded expressions correctly)
>>>>>>> 07161eaaa6 (GEOMESA-3061 Converters - support bytes in Avro top-level union types (#2762))
<<<<<<< HEAD
>>>>>>> 9c28193a91 (GEOMESA-3061 Converters - support bytes in Avro top-level union types (#2762))
<<<<<<< HEAD
>>>>>>> 9dbe1503e8 (GEOMESA-3061 Converters - support bytes in Avro top-level union types (#2762))
=======
=======
=======
=======
=======
>>>>>>> a63cb7e74 (GEOMESA-3067 Find attribute in Filters with Functions with embedded expressions correctly)
>>>>>>> 8fb060734 (GEOMESA-3067 Find attribute in Filters with Functions with embedded expressions correctly)
=======
>>>>>>> 6e30236dd2 (GEOMESA-3061 Converters - support bytes in Avro top-level union types (#2762))
>>>>>>> 38b3282770 (GEOMESA-3067 Find attribute in Filters with Functions with embedded expressions correctly)
<<<<<<< HEAD
>>>>>>> 1b60c2aeba (GEOMESA-3067 Find attribute in Filters with Functions with embedded expressions correctly)
<<<<<<< HEAD
>>>>>>> 53bc726472 (GEOMESA-3067 Find attribute in Filters with Functions with embedded expressions correctly)
=======
=======
=======
=======
>>>>>>> ad3cedc4d (GEOMESA-3061 Converters - support bytes in Avro top-level union types (#2762))
=======
>>>>>>> 3261561062 (GEOMESA-3067 Find attribute in Filters with Functions with embedded expressions correctly)
>>>>>>> 9abc630fdf (GEOMESA-3061 Converters - support bytes in Avro top-level union types (#2762))
<<<<<<< HEAD
>>>>>>> d294ce49e2 (GEOMESA-3061 Converters - support bytes in Avro top-level union types (#2762))
<<<<<<< HEAD
>>>>>>> 6e30236dd2 (GEOMESA-3061 Converters - support bytes in Avro top-level union types (#2762))
=======
=======
=======
=======
=======
>>>>>>> 908ad4071 (GEOMESA-3067 Find attribute in Filters with Functions with embedded expressions correctly)
>>>>>>> bc4913194 (GEOMESA-3067 Find attribute in Filters with Functions with embedded expressions correctly)
=======
>>>>>>> dbd932fed6 (GEOMESA-3061 Converters - support bytes in Avro top-level union types (#2762))
>>>>>>> 570899511d (GEOMESA-3067 Find attribute in Filters with Functions with embedded expressions correctly)
<<<<<<< HEAD
>>>>>>> ed45e8551f (GEOMESA-3067 Find attribute in Filters with Functions with embedded expressions correctly)
<<<<<<< HEAD
>>>>>>> 3261561062 (GEOMESA-3067 Find attribute in Filters with Functions with embedded expressions correctly)
=======
=======
=======
=======
>>>>>>> bdbced26d (GEOMESA-3061 Converters - support bytes in Avro top-level union types (#2762))
=======
>>>>>>> bf6bde0830 (Merge branch 'feature/postgis-fixes')
>>>>>>> 25063957fc (GEOMESA-3061 Converters - support bytes in Avro top-level union types (#2762))
<<<<<<< HEAD
>>>>>>> 1df8328338 (GEOMESA-3061 Converters - support bytes in Avro top-level union types (#2762))
<<<<<<< HEAD
>>>>>>> dbd932fed6 (GEOMESA-3061 Converters - support bytes in Avro top-level union types (#2762))
=======
=======
=======
=======
=======
>>>>>>> 3be8d2a5a (Merge branch 'feature/postgis-fixes')
>>>>>>> 1b25d7ddb (Merge branch 'feature/postgis-fixes')
>>>>>>> 699117eca9 (Merge branch 'feature/postgis-fixes')
>>>>>>> c69897d7bd (Merge branch 'feature/postgis-fixes')
>>>>>>> bf6bde0830 (Merge branch 'feature/postgis-fixes')
=======
>>>>>>> 5b9d5ada1b (GEOMESA-3067 Find attribute in Filters with Functions with embedded expressions correctly)
=======
>>>>>>> 9293965a7d (GEOMESA-3061 Converters - support bytes in Avro top-level union types (#2762))
=======
>>>>>>> 67dc71ffb1 (GEOMESA-3067 Find attribute in Filters with Functions with embedded expressions correctly)
=======
=======
>>>>>>> c3c5dd0ebb (GEOMESA-3061 Converters - support bytes in Avro top-level union types (#2762))
>>>>>>> 058fd96baa (GEOMESA-3061 Converters - support bytes in Avro top-level union types (#2762))
=======
>>>>>>> f7fc21ae20 (GEOMESA-3067 Find attribute in Filters with Functions with embedded expressions correctly)
=======
=======
>>>>>>> 4c361f07da (GEOMESA-3061 Converters - support bytes in Avro top-level union types (#2762))
>>>>>>> c22ecd64c3 (GEOMESA-3061 Converters - support bytes in Avro top-level union types (#2762))
=======
>>>>>>> 6e297b9b6f (GEOMESA-3067 Find attribute in Filters with Functions with embedded expressions correctly)
=======
>>>>>>> 2a887f75bf (GEOMESA-3061 Converters - support bytes in Avro top-level union types (#2762))
=======
>>>>>>> 08a743b61d (GEOMESA-3067 Find attribute in Filters with Functions with embedded expressions correctly)
=======
=======
>>>>>>> a788dfac03 (GEOMESA-3061 Converters - support bytes in Avro top-level union types (#2762))
>>>>>>> b08cb4d818 (GEOMESA-3061 Converters - support bytes in Avro top-level union types (#2762))
=======
>>>>>>> 354b5e5ae5 (Merge branch 'feature/postgis-fixes')
=======
=======
>>>>>>> 32d312dc48 (GEOMESA-3067 Find attribute in Filters with Functions with embedded expressions correctly)
>>>>>>> 043f2d0167 (GEOMESA-3067 Find attribute in Filters with Functions with embedded expressions correctly)
=======
>>>>>>> ac217b392d (GEOMESA-3061 Converters - support bytes in Avro top-level union types (#2762))
=======
=======
>>>>>>> a1d28116d4 (GEOMESA-3067 Find attribute in Filters with Functions with embedded expressions correctly)
>>>>>>> a6693cb0ba (GEOMESA-3067 Find attribute in Filters with Functions with embedded expressions correctly)
=======
>>>>>>> e7d6b701c8 (GEOMESA-3061 Converters - support bytes in Avro top-level union types (#2762))
=======
>>>>>>> 70f2c62b7e (GEOMESA-3067 Find attribute in Filters with Functions with embedded expressions correctly)
=======
=======
>>>>>>> f67dd3371e (GEOMESA-3061 Converters - support bytes in Avro top-level union types (#2762))
>>>>>>> 95e52e061e (GEOMESA-3061 Converters - support bytes in Avro top-level union types (#2762))
=======
=======
>>>>>>> 67b361c856 (GEOMESA-3061 Converters - support bytes in Avro top-level union types (#2762))
=======
>>>>>>> 988874c83e (GEOMESA-3061 Converters - support bytes in Avro top-level union types (#2762))
>>>>>>> b9bdd406e (GEOMESA-3061 Converters - support bytes in Avro top-level union types (#2762))
=======
>>>>>>> f36b0e8b9 (GEOMESA-3067 Find attribute in Filters with Functions with embedded expressions correctly)
<<<<<<< HEAD
>>>>>>> a63cb7e740 (GEOMESA-3067 Find attribute in Filters with Functions with embedded expressions correctly)
<<<<<<< HEAD
>>>>>>> a9884ff1f6 (GEOMESA-3067 Find attribute in Filters with Functions with embedded expressions correctly)
<<<<<<< HEAD
>>>>>>> 424e7de15a (GEOMESA-3067 Find attribute in Filters with Functions with embedded expressions correctly)
=======
=======
=======
=======
=======
>>>>>>> b9bdd406e (GEOMESA-3061 Converters - support bytes in Avro top-level union types (#2762))
>>>>>>> cdb410251 (GEOMESA-3061 Converters - support bytes in Avro top-level union types (#2762))
>>>>>>> 67b361c856 (GEOMESA-3061 Converters - support bytes in Avro top-level union types (#2762))
>>>>>>> f7cef54062 (GEOMESA-3061 Converters - support bytes in Avro top-level union types (#2762))
>>>>>>> 988874c83e (GEOMESA-3061 Converters - support bytes in Avro top-level union types (#2762))
=======
>>>>>>> 49f2a1c310 (GEOMESA-3067 Find attribute in Filters with Functions with embedded expressions correctly)
>>>>>>> 87dddefcd8 (GEOMESA-3067 Find attribute in Filters with Functions with embedded expressions correctly)
=======
>>>>>>> 49f2a1c310 (GEOMESA-3067 Find attribute in Filters with Functions with embedded expressions correctly)
=======
=======
=======
>>>>>>> b9bdd406e (GEOMESA-3061 Converters - support bytes in Avro top-level union types (#2762))
>>>>>>> b4320946b4 (GEOMESA-3061 Converters - support bytes in Avro top-level union types (#2762))
<<<<<<< HEAD
>>>>>>> a16b64a4d1 (GEOMESA-3061 Converters - support bytes in Avro top-level union types (#2762))
<<<<<<< HEAD
>>>>>>> aea9fbe131 (GEOMESA-3061 Converters - support bytes in Avro top-level union types (#2762))
=======
=======
=======
>>>>>>> 3be8d2a5a4 (Merge branch 'feature/postgis-fixes')
>>>>>>> 34472778d3 (Merge branch 'feature/postgis-fixes')
<<<<<<< HEAD
>>>>>>> d581fa3e8f (Merge branch 'feature/postgis-fixes')
=======
=======
>>>>>>> 5430d59024 (GEOMESA-3067 Find attribute in Filters with Functions with embedded expressions correctly)
>>>>>>> ca1e0fad13 (GEOMESA-3067 Find attribute in Filters with Functions with embedded expressions correctly)
=======
>>>>>>> 5a55bf9756 (GEOMESA-3061 Converters - support bytes in Avro top-level union types (#2762))
=======
>>>>>>> 2571e49519 (GEOMESA-3067 Find attribute in Filters with Functions with embedded expressions correctly)
>>>>>>> adfec3a47a (GEOMESA-3067 Find attribute in Filters with Functions with embedded expressions correctly)
=======
>>>>>>> d206a68a13 (GEOMESA-3061 Converters - support bytes in Avro top-level union types (#2762))
>>>>>>> e0c2527549 (GEOMESA-3061 Converters - support bytes in Avro top-level union types (#2762))
=======
>>>>>>> d206a68a13 (GEOMESA-3061 Converters - support bytes in Avro top-level union types (#2762))
=======
=======
=======
>>>>>>> e3a63fee1 (GEOMESA-3067 Find attribute in Filters with Functions with embedded expressions correctly)
<<<<<<< HEAD
>>>>>>> 3333975e77 (GEOMESA-3067 Find attribute in Filters with Functions with embedded expressions correctly)
<<<<<<< HEAD
>>>>>>> 9412e85b59 (GEOMESA-3067 Find attribute in Filters with Functions with embedded expressions correctly)
<<<<<<< HEAD
>>>>>>> 4cf1d8d259 (GEOMESA-3067 Find attribute in Filters with Functions with embedded expressions correctly)
=======
=======
=======
=======
=======
>>>>>>> b9bdd406e (GEOMESA-3061 Converters - support bytes in Avro top-level union types (#2762))
>>>>>>> 0e68e9f4c (GEOMESA-3061 Converters - support bytes in Avro top-level union types (#2762))
=======
>>>>>>> 9bcad1eb67 (GEOMESA-3067 Find attribute in Filters with Functions with embedded expressions correctly)
>>>>>>> 76618c8da3 (GEOMESA-3061 Converters - support bytes in Avro top-level union types (#2762))
<<<<<<< HEAD
>>>>>>> 694bcd3776 (GEOMESA-3061 Converters - support bytes in Avro top-level union types (#2762))
<<<<<<< HEAD
>>>>>>> cb5e2daf2b (GEOMESA-3061 Converters - support bytes in Avro top-level union types (#2762))
=======
=======
=======
=======
>>>>>>> a63cb7e74 (GEOMESA-3067 Find attribute in Filters with Functions with embedded expressions correctly)
=======
>>>>>>> 00e61f4b70 (GEOMESA-3061 Converters - support bytes in Avro top-level union types (#2762))
>>>>>>> c3b0a1b6e3 (GEOMESA-3067 Find attribute in Filters with Functions with embedded expressions correctly)
<<<<<<< HEAD
>>>>>>> 24c4df93a5 (GEOMESA-3067 Find attribute in Filters with Functions with embedded expressions correctly)
<<<<<<< HEAD
>>>>>>> 9bcad1eb67 (GEOMESA-3067 Find attribute in Filters with Functions with embedded expressions correctly)
=======
=======
=======
=======
>>>>>>> 67b361c85 (GEOMESA-3061 Converters - support bytes in Avro top-level union types (#2762))
=======
>>>>>>> 9a4568fbda (GEOMESA-3067 Find attribute in Filters with Functions with embedded expressions correctly)
>>>>>>> c8a325e13c (GEOMESA-3061 Converters - support bytes in Avro top-level union types (#2762))
<<<<<<< HEAD
>>>>>>> 6cd1151639 (GEOMESA-3061 Converters - support bytes in Avro top-level union types (#2762))
<<<<<<< HEAD
>>>>>>> 00e61f4b70 (GEOMESA-3061 Converters - support bytes in Avro top-level union types (#2762))
=======
=======
=======
=======
>>>>>>> 908ad4071 (GEOMESA-3067 Find attribute in Filters with Functions with embedded expressions correctly)
=======
>>>>>>> 4864cfc581 (GEOMESA-3061 Converters - support bytes in Avro top-level union types (#2762))
>>>>>>> 9638dc731e (GEOMESA-3067 Find attribute in Filters with Functions with embedded expressions correctly)
<<<<<<< HEAD
>>>>>>> 1e00950a90 (GEOMESA-3067 Find attribute in Filters with Functions with embedded expressions correctly)
<<<<<<< HEAD
>>>>>>> 9a4568fbda (GEOMESA-3067 Find attribute in Filters with Functions with embedded expressions correctly)
=======
=======
=======
=======
=======
>>>>>>> b9bdd406e (GEOMESA-3061 Converters - support bytes in Avro top-level union types (#2762))
>>>>>>> b4320946b (GEOMESA-3061 Converters - support bytes in Avro top-level union types (#2762))
=======
>>>>>>> 264c9fa240 (Merge branch 'feature/postgis-fixes')
>>>>>>> 97ec7d864a (GEOMESA-3061 Converters - support bytes in Avro top-level union types (#2762))
<<<<<<< HEAD
>>>>>>> 1973f72e77 (GEOMESA-3061 Converters - support bytes in Avro top-level union types (#2762))
<<<<<<< HEAD
>>>>>>> 4864cfc581 (GEOMESA-3061 Converters - support bytes in Avro top-level union types (#2762))
=======
=======
=======
=======
>>>>>>> 3be8d2a5a (Merge branch 'feature/postgis-fixes')
>>>>>>> db8d998aa2 (Merge branch 'feature/postgis-fixes')
>>>>>>> 42e8565e9b (Merge branch 'feature/postgis-fixes')
>>>>>>> 264c9fa240 (Merge branch 'feature/postgis-fixes')
=======
>>>>>>> f1532f2313 (GEOMESA-3254 Add Bloop build support)
>>>>>>> c738f63bd9 (GEOMESA-3254 Add Bloop build support)
=======
>>>>>>> 4bbf97686c (GEOMESA-3067 Find attribute in Filters with Functions with embedded expressions correctly)
>>>>>>> 7213a78a3a (GEOMESA-3067 Find attribute in Filters with Functions with embedded expressions correctly)
=======
>>>>>>> 4bbf97686c (GEOMESA-3067 Find attribute in Filters with Functions with embedded expressions correctly)
=======
=======
=======
>>>>>>> b9bdd406e (GEOMESA-3061 Converters - support bytes in Avro top-level union types (#2762))
>>>>>>> 6d9a5b626c (GEOMESA-3061 Converters - support bytes in Avro top-level union types (#2762))
>>>>>>> 96d5d442fa (GEOMESA-3061 Converters - support bytes in Avro top-level union types (#2762))
<<<<<<< HEAD
>>>>>>> 3676d4e56a (GEOMESA-3061 Converters - support bytes in Avro top-level union types (#2762))
=======
=======
>>>>>>> b3dd8ec805 (GEOMESA-3067 Find attribute in Filters with Functions with embedded expressions correctly)
<<<<<<< HEAD
>>>>>>> e8ce815f1b (GEOMESA-3067 Find attribute in Filters with Functions with embedded expressions correctly)
=======
=======
=======
>>>>>>> e6e1f4bdd5 (GEOMESA-3061 Converters - support bytes in Avro top-level union types (#2762))
>>>>>>> 5dcf23da52 (GEOMESA-3061 Converters - support bytes in Avro top-level union types (#2762))
>>>>>>> 60b4637548 (GEOMESA-3061 Converters - support bytes in Avro top-level union types (#2762))
=======
>>>>>>> 6f81d40992 (GEOMESA-3067 Find attribute in Filters with Functions with embedded expressions correctly)
=======
>>>>>>> 009a284072 (GEOMESA-3061 Converters - support bytes in Avro top-level union types (#2762))
=======
=======
>>>>>>> c169cb2905 (GEOMESA-3067 Find attribute in Filters with Functions with embedded expressions correctly)
>>>>>>> 9df4f8a9f6 (GEOMESA-3067 Find attribute in Filters with Functions with embedded expressions correctly)
=======
>>>>>>> 7b8c8dcc3d (GEOMESA-3061 Converters - support bytes in Avro top-level union types (#2762))
=======
=======
>>>>>>> 63ca73533e (GEOMESA-3067 Find attribute in Filters with Functions with embedded expressions correctly)
>>>>>>> 79cd5cb606 (GEOMESA-3067 Find attribute in Filters with Functions with embedded expressions correctly)
=======
>>>>>>> c029a43a6c (GEOMESA-3061 Converters - support bytes in Avro top-level union types (#2762))
=======
=======
>>>>>>> 67de3c3202 (Merge branch 'feature/postgis-fixes')
>>>>>>> 217b7d1cb9 (Merge branch 'feature/postgis-fixes')
=======
=======
>>>>>>> 87bf55340 (GEOMESA-3061 Converters - support bytes in Avro top-level union types (#2762))
<<<<<<< HEAD
>>>>>>> 4f51687745 (GEOMESA-3061 Converters - support bytes in Avro top-level union types (#2762))
>>>>>>> 0dbede148d (GEOMESA-3061 Converters - support bytes in Avro top-level union types (#2762))
<<<<<<< HEAD
>>>>>>> 1bb69524c2 (GEOMESA-3061 Converters - support bytes in Avro top-level union types (#2762))
<<<<<<< HEAD
>>>>>>> a5b0374ee2 (GEOMESA-3061 Converters - support bytes in Avro top-level union types (#2762))
=======
=======
=======
=======
>>>>>>> 240977229 (GEOMESA-3061 Converters - support bytes in Avro top-level union types (#2762))
>>>>>>> 22dcc8170f (GEOMESA-3061 Converters - support bytes in Avro top-level union types (#2762))
>>>>>>> 8c9ca1211a (GEOMESA-3061 Converters - support bytes in Avro top-level union types (#2762))
<<<<<<< HEAD
>>>>>>> 4f51687745 (GEOMESA-3061 Converters - support bytes in Avro top-level union types (#2762))
=======
=======
>>>>>>> b009fd23f4 (GEOMESA-3061 Converters - support bytes in Avro top-level union types (#2762))
>>>>>>> a22efb4d66 (GEOMESA-3061 Converters - support bytes in Avro top-level union types (#2762))
>>>>>>> 9a2d40c613 (GEOMESA-3061 Converters - support bytes in Avro top-level union types (#2762))
=======
>>>>>>> 73770612e0 (GEOMESA-3061 Converters - support bytes in Avro top-level union types (#2762))
=======
=======
>>>>>>> bc4062951d (GEOMESA-3061 Converters - support bytes in Avro top-level union types (#2762))
>>>>>>> 1e39c0c27d (GEOMESA-3061 Converters - support bytes in Avro top-level union types (#2762))
>>>>>>> 6c83981af3 (GEOMESA-3061 Converters - support bytes in Avro top-level union types (#2762))
    "handle logical erasure of entire clauses" >> {
      val sft = SimpleFeatureTypes.createType("test", "a:Integer")
      val ecql = "(a = 0 AND a = 0) OR (a = 0 AND a = 1) OR (a = 0 AND a = 2)"
      val filter = FastFilterFactory.toFilter(sft, ecql)
      filter must beAnInstanceOf[FastPropertyIsEqualTo]
      filter.asInstanceOf[FastPropertyIsEqualTo].getExpression1 must beAnInstanceOf[FastPropertyName]
      filter.asInstanceOf[FastPropertyIsEqualTo].getExpression1.asInstanceOf[FastPropertyName].getPropertyName mustEqual "a"
      filter.asInstanceOf[FastPropertyIsEqualTo].getExpression2 must beAnInstanceOf[Literal]
      filter.asInstanceOf[FastPropertyIsEqualTo].getExpression2.asInstanceOf[Literal].getValue mustEqual 0
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
<<<<<<< HEAD
<<<<<<< HEAD
<<<<<<< HEAD
<<<<<<< HEAD
<<<<<<< HEAD
<<<<<<< HEAD
<<<<<<< HEAD
<<<<<<< HEAD
<<<<<<< HEAD
<<<<<<< HEAD
<<<<<<< HEAD
<<<<<<< HEAD
<<<<<<< HEAD
<<<<<<< HEAD
<<<<<<< HEAD
<<<<<<< HEAD
<<<<<<< HEAD
<<<<<<< HEAD
<<<<<<< HEAD
<<<<<<< HEAD
<<<<<<< HEAD
<<<<<<< HEAD
<<<<<<< HEAD
<<<<<<< HEAD
<<<<<<< HEAD
<<<<<<< HEAD
<<<<<<< HEAD
<<<<<<< HEAD
<<<<<<< HEAD
<<<<<<< HEAD
<<<<<<< HEAD
<<<<<<< HEAD
<<<<<<< HEAD
<<<<<<< HEAD
<<<<<<< HEAD
<<<<<<< HEAD
<<<<<<< HEAD
<<<<<<< HEAD
<<<<<<< HEAD
<<<<<<< HEAD
<<<<<<< HEAD
<<<<<<< HEAD
<<<<<<< HEAD
<<<<<<< HEAD
<<<<<<< HEAD
<<<<<<< HEAD
<<<<<<< HEAD
<<<<<<< HEAD
<<<<<<< HEAD
<<<<<<< HEAD
<<<<<<< HEAD
<<<<<<< HEAD
<<<<<<< HEAD
<<<<<<< HEAD
<<<<<<< HEAD
<<<<<<< HEAD
<<<<<<< HEAD
<<<<<<< HEAD
<<<<<<< HEAD
<<<<<<< HEAD
<<<<<<< HEAD
<<<<<<< HEAD
<<<<<<< HEAD
<<<<<<< HEAD
<<<<<<< HEAD
<<<<<<< HEAD
<<<<<<< HEAD
<<<<<<< HEAD
<<<<<<< HEAD
<<<<<<< HEAD
<<<<<<< HEAD
<<<<<<< HEAD
<<<<<<< HEAD
<<<<<<< HEAD
<<<<<<< HEAD
<<<<<<< HEAD
<<<<<<< HEAD
<<<<<<< HEAD
<<<<<<< HEAD
<<<<<<< HEAD
<<<<<<< HEAD
<<<<<<< HEAD
<<<<<<< HEAD
<<<<<<< HEAD
<<<<<<< HEAD
<<<<<<< HEAD
<<<<<<< HEAD
<<<<<<< HEAD
<<<<<<< HEAD
<<<<<<< HEAD
<<<<<<< HEAD
<<<<<<< HEAD
<<<<<<< HEAD
<<<<<<< HEAD
<<<<<<< HEAD
<<<<<<< HEAD
<<<<<<< HEAD
<<<<<<< HEAD
<<<<<<< HEAD
<<<<<<< HEAD
<<<<<<< HEAD
<<<<<<< HEAD
<<<<<<< HEAD
<<<<<<< HEAD
<<<<<<< HEAD
<<<<<<< HEAD
<<<<<<< HEAD
<<<<<<< HEAD
<<<<<<< HEAD
<<<<<<< HEAD
<<<<<<< HEAD
<<<<<<< HEAD
<<<<<<< HEAD
<<<<<<< HEAD
<<<<<<< HEAD
<<<<<<< HEAD
<<<<<<< HEAD
<<<<<<< HEAD
<<<<<<< HEAD
<<<<<<< HEAD
<<<<<<< HEAD
<<<<<<< HEAD
<<<<<<< HEAD
<<<<<<< HEAD
<<<<<<< HEAD
<<<<<<< HEAD
<<<<<<< HEAD
<<<<<<< HEAD
<<<<<<< HEAD
<<<<<<< HEAD
<<<<<<< HEAD
<<<<<<< HEAD
<<<<<<< HEAD
<<<<<<< HEAD
<<<<<<< HEAD
<<<<<<< HEAD
<<<<<<< HEAD
<<<<<<< HEAD
<<<<<<< HEAD
<<<<<<< HEAD
<<<<<<< HEAD
<<<<<<< HEAD
<<<<<<< HEAD
<<<<<<< HEAD
<<<<<<< HEAD
<<<<<<< HEAD
<<<<<<< HEAD
<<<<<<< HEAD
<<<<<<< HEAD
<<<<<<< HEAD
<<<<<<< HEAD
<<<<<<< HEAD
<<<<<<< HEAD
<<<<<<< HEAD
<<<<<<< HEAD
<<<<<<< HEAD
<<<<<<< HEAD
<<<<<<< HEAD
<<<<<<< HEAD
<<<<<<< HEAD
<<<<<<< HEAD
<<<<<<< HEAD
<<<<<<< HEAD
<<<<<<< HEAD
<<<<<<< HEAD
<<<<<<< HEAD
<<<<<<< HEAD
<<<<<<< HEAD
<<<<<<< HEAD
<<<<<<< HEAD
<<<<<<< HEAD
<<<<<<< HEAD
<<<<<<< HEAD
<<<<<<< HEAD
<<<<<<< HEAD
<<<<<<< HEAD
<<<<<<< HEAD
<<<<<<< HEAD
<<<<<<< HEAD
<<<<<<< HEAD
<<<<<<< HEAD
<<<<<<< HEAD
<<<<<<< HEAD
<<<<<<< HEAD
<<<<<<< HEAD
<<<<<<< HEAD
<<<<<<< HEAD
<<<<<<< HEAD
<<<<<<< HEAD
<<<<<<< HEAD
<<<<<<< HEAD
<<<<<<< HEAD
<<<<<<< HEAD
<<<<<<< HEAD
<<<<<<< HEAD
<<<<<<< HEAD
<<<<<<< HEAD
<<<<<<< HEAD
<<<<<<< HEAD
<<<<<<< HEAD
<<<<<<< HEAD
<<<<<<< HEAD
<<<<<<< HEAD
<<<<<<< HEAD
<<<<<<< HEAD
<<<<<<< HEAD
<<<<<<< HEAD
<<<<<<< HEAD
<<<<<<< HEAD
<<<<<<< HEAD
<<<<<<< HEAD
<<<<<<< HEAD
<<<<<<< HEAD
<<<<<<< HEAD
<<<<<<< HEAD
<<<<<<< HEAD
<<<<<<< HEAD
<<<<<<< HEAD
<<<<<<< HEAD
<<<<<<< HEAD
<<<<<<< HEAD
<<<<<<< HEAD
<<<<<<< HEAD
<<<<<<< HEAD
<<<<<<< HEAD
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
>>>>>>> a6693cb0ba (GEOMESA-3067 Find attribute in Filters with Functions with embedded expressions correctly)
=======
>>>>>>> e7d6b701c8 (GEOMESA-3061 Converters - support bytes in Avro top-level union types (#2762))
=======
>>>>>>> 70f2c62b7e (GEOMESA-3067 Find attribute in Filters with Functions with embedded expressions correctly)
=======
>>>>>>> 95e52e061e (GEOMESA-3061 Converters - support bytes in Avro top-level union types (#2762))
=======
>>>>>>> 424e7de15a (GEOMESA-3067 Find attribute in Filters with Functions with embedded expressions correctly)
=======
>>>>>>> 988874c83e (GEOMESA-3061 Converters - support bytes in Avro top-level union types (#2762))
=======
>>>>>>> 87dddefcd8 (GEOMESA-3067 Find attribute in Filters with Functions with embedded expressions correctly)
=======
>>>>>>> aea9fbe131 (GEOMESA-3061 Converters - support bytes in Avro top-level union types (#2762))
=======
>>>>>>> d581fa3e8f (Merge branch 'feature/postgis-fixes')
=======
>>>>>>> ca1e0fad13 (GEOMESA-3067 Find attribute in Filters with Functions with embedded expressions correctly)
=======
>>>>>>> 5a55bf9756 (GEOMESA-3061 Converters - support bytes in Avro top-level union types (#2762))
=======
>>>>>>> adfec3a47a (GEOMESA-3067 Find attribute in Filters with Functions with embedded expressions correctly)
=======
>>>>>>> e0c2527549 (GEOMESA-3061 Converters - support bytes in Avro top-level union types (#2762))
=======
>>>>>>> 4cf1d8d259 (GEOMESA-3067 Find attribute in Filters with Functions with embedded expressions correctly)
=======
>>>>>>> cb5e2daf2b (GEOMESA-3061 Converters - support bytes in Avro top-level union types (#2762))
=======
>>>>>>> 9bcad1eb67 (GEOMESA-3067 Find attribute in Filters with Functions with embedded expressions correctly)
=======
>>>>>>> 00e61f4b70 (GEOMESA-3061 Converters - support bytes in Avro top-level union types (#2762))
=======
>>>>>>> 9a4568fbda (GEOMESA-3067 Find attribute in Filters with Functions with embedded expressions correctly)
=======
>>>>>>> 4864cfc581 (GEOMESA-3061 Converters - support bytes in Avro top-level union types (#2762))
=======
>>>>>>> 264c9fa240 (Merge branch 'feature/postgis-fixes')
=======
>>>>>>> c738f63bd9 (GEOMESA-3254 Add Bloop build support)
=======
>>>>>>> 7213a78a3a (GEOMESA-3067 Find attribute in Filters with Functions with embedded expressions correctly)
=======
>>>>>>> 3676d4e56a (GEOMESA-3061 Converters - support bytes in Avro top-level union types (#2762))
=======
>>>>>>> e8ce815f1b (GEOMESA-3067 Find attribute in Filters with Functions with embedded expressions correctly)
=======
>>>>>>> 60b4637548 (GEOMESA-3061 Converters - support bytes in Avro top-level union types (#2762))
=======
>>>>>>> 6f81d40992 (GEOMESA-3067 Find attribute in Filters with Functions with embedded expressions correctly)
=======
>>>>>>> 009a284072 (GEOMESA-3061 Converters - support bytes in Avro top-level union types (#2762))
=======
>>>>>>> 9df4f8a9f6 (GEOMESA-3067 Find attribute in Filters with Functions with embedded expressions correctly)
=======
>>>>>>> 7b8c8dcc3d (GEOMESA-3061 Converters - support bytes in Avro top-level union types (#2762))
=======
>>>>>>> 79cd5cb606 (GEOMESA-3067 Find attribute in Filters with Functions with embedded expressions correctly)
=======
>>>>>>> c029a43a6c (GEOMESA-3061 Converters - support bytes in Avro top-level union types (#2762))
=======
>>>>>>> 217b7d1cb9 (Merge branch 'feature/postgis-fixes')
=======
>>>>>>> a5b0374ee2 (GEOMESA-3061 Converters - support bytes in Avro top-level union types (#2762))
=======
>>>>>>> 4f51687745 (GEOMESA-3061 Converters - support bytes in Avro top-level union types (#2762))
=======
>>>>>>> 9a2d40c613 (GEOMESA-3061 Converters - support bytes in Avro top-level union types (#2762))
=======
>>>>>>> 73770612e0 (GEOMESA-3061 Converters - support bytes in Avro top-level union types (#2762))
=======
>>>>>>> 6c83981af3 (GEOMESA-3061 Converters - support bytes in Avro top-level union types (#2762))
=======
>>>>>>> 59a1fbb96e (GEOMESA-3061 Converters - support bytes in Avro top-level union types (#2762))
=======
>>>>>>> a1d28116d4 (GEOMESA-3067 Find attribute in Filters with Functions with embedded expressions correctly)
=======
<<<<<<< HEAD
<<<<<<< HEAD
>>>>>>> d1fa26b39d (GEOMESA-3061 Converters - support bytes in Avro top-level union types (#2762))
=======
>>>>>>> ef55408e9a (GEOMESA-3067 Find attribute in Filters with Functions with embedded expressions correctly)
=======
<<<<<<< HEAD
<<<<<<< HEAD
>>>>>>> f67dd3371e (GEOMESA-3061 Converters - support bytes in Avro top-level union types (#2762))
=======
>>>>>>> a9884ff1f6 (GEOMESA-3067 Find attribute in Filters with Functions with embedded expressions correctly)
=======
<<<<<<< HEAD
<<<<<<< HEAD
>>>>>>> f7cef54062 (GEOMESA-3061 Converters - support bytes in Avro top-level union types (#2762))
=======
>>>>>>> 49f2a1c310 (GEOMESA-3067 Find attribute in Filters with Functions with embedded expressions correctly)
=======
<<<<<<< HEAD
<<<<<<< HEAD
>>>>>>> a16b64a4d1 (GEOMESA-3061 Converters - support bytes in Avro top-level union types (#2762))
=======
>>>>>>> 34472778d3 (Merge branch 'feature/postgis-fixes')
=======
<<<<<<< HEAD
<<<<<<< HEAD
>>>>>>> 5430d59024 (GEOMESA-3067 Find attribute in Filters with Functions with embedded expressions correctly)
=======
>>>>>>> 810876750d (GEOMESA-3061 Converters - support bytes in Avro top-level union types (#2762))
=======
<<<<<<< HEAD
<<<<<<< HEAD
>>>>>>> 2571e49519 (GEOMESA-3067 Find attribute in Filters with Functions with embedded expressions correctly)
=======
>>>>>>> d206a68a13 (GEOMESA-3061 Converters - support bytes in Avro top-level union types (#2762))
=======
<<<<<<< HEAD
<<<<<<< HEAD
>>>>>>> 9412e85b59 (GEOMESA-3067 Find attribute in Filters with Functions with embedded expressions correctly)
=======
>>>>>>> 694bcd3776 (GEOMESA-3061 Converters - support bytes in Avro top-level union types (#2762))
=======
<<<<<<< HEAD
<<<<<<< HEAD
>>>>>>> 24c4df93a5 (GEOMESA-3067 Find attribute in Filters with Functions with embedded expressions correctly)
=======
>>>>>>> 6cd1151639 (GEOMESA-3061 Converters - support bytes in Avro top-level union types (#2762))
=======
<<<<<<< HEAD
<<<<<<< HEAD
>>>>>>> 1e00950a90 (GEOMESA-3067 Find attribute in Filters with Functions with embedded expressions correctly)
=======
>>>>>>> 1973f72e77 (GEOMESA-3061 Converters - support bytes in Avro top-level union types (#2762))
=======
<<<<<<< HEAD
<<<<<<< HEAD
>>>>>>> 42e8565e9b (Merge branch 'feature/postgis-fixes')
=======
>>>>>>> f1532f2313 (GEOMESA-3254 Add Bloop build support)
=======
<<<<<<< HEAD
<<<<<<< HEAD
>>>>>>> 4bbf97686c (GEOMESA-3067 Find attribute in Filters with Functions with embedded expressions correctly)
=======
>>>>>>> 96d5d442fa (GEOMESA-3061 Converters - support bytes in Avro top-level union types (#2762))
=======
<<<<<<< HEAD
<<<<<<< HEAD
>>>>>>> b3dd8ec805 (GEOMESA-3067 Find attribute in Filters with Functions with embedded expressions correctly)
=======
>>>>>>> 5dcf23da52 (GEOMESA-3061 Converters - support bytes in Avro top-level union types (#2762))
=======
<<<<<<< HEAD
<<<<<<< HEAD
>>>>>>> 2b62d1f3fe (GEOMESA-3067 Find attribute in Filters with Functions with embedded expressions correctly)
=======
>>>>>>> 92674ff9d4 (GEOMESA-3061 Converters - support bytes in Avro top-level union types (#2762))
=======
<<<<<<< HEAD
<<<<<<< HEAD
>>>>>>> c169cb2905 (GEOMESA-3067 Find attribute in Filters with Functions with embedded expressions correctly)
=======
>>>>>>> 9a4dff9e4f (GEOMESA-3061 Converters - support bytes in Avro top-level union types (#2762))
=======
<<<<<<< HEAD
<<<<<<< HEAD
>>>>>>> 63ca73533e (GEOMESA-3067 Find attribute in Filters with Functions with embedded expressions correctly)
=======
>>>>>>> 0fc6650ecf (GEOMESA-3061 Converters - support bytes in Avro top-level union types (#2762))
=======
<<<<<<< HEAD
<<<<<<< HEAD
>>>>>>> 67de3c3202 (Merge branch 'feature/postgis-fixes')
=======
>>>>>>> 1bb69524c2 (GEOMESA-3061 Converters - support bytes in Avro top-level union types (#2762))
=======
<<<<<<< HEAD
<<<<<<< HEAD
>>>>>>> 8c9ca1211a (GEOMESA-3061 Converters - support bytes in Avro top-level union types (#2762))
=======
>>>>>>> a22efb4d66 (GEOMESA-3061 Converters - support bytes in Avro top-level union types (#2762))
=======
<<<<<<< HEAD
<<<<<<< HEAD
>>>>>>> 1cad375176 (GEOMESA-3061 Converters - support bytes in Avro top-level union types (#2762))
=======
>>>>>>> 1e39c0c27d (GEOMESA-3061 Converters - support bytes in Avro top-level union types (#2762))
=======
<<<<<<< HEAD
>>>>>>> 638b68d081 (Merge branch 'feature/postgis-fixes')
=======
>>>>>>> a990cf104e (GEOMESA-3067 Find attribute in Filters with Functions with embedded expressions correctly)
=======
>>>>>>> a1f15598cb (GEOMESA-3061 Converters - support bytes in Avro top-level union types (#2762))
=======
>>>>>>> 4373c901b3 (GEOMESA-3067 Find attribute in Filters with Functions with embedded expressions correctly)
=======
>>>>>>> 963feec660 (GEOMESA-3061 Converters - support bytes in Avro top-level union types (#2762))
=======
>>>>>>> 2c14568a23 (GEOMESA-3067 Find attribute in Filters with Functions with embedded expressions correctly)
=======
>>>>>>> 84ac051f28 (GEOMESA-3061 Converters - support bytes in Avro top-level union types (#2762))
=======
>>>>>>> 99acaa0887 (GEOMESA-3067 Find attribute in Filters with Functions with embedded expressions correctly)
=======
>>>>>>> fe3de10f11 (GEOMESA-3061 Converters - support bytes in Avro top-level union types (#2762))
=======
>>>>>>> 21deff19fd (GEOMESA-3067 Find attribute in Filters with Functions with embedded expressions correctly)
=======
>>>>>>> d0785cf307 (GEOMESA-3061 Converters - support bytes in Avro top-level union types (#2762))
=======
>>>>>>> 71adb695c5 (Merge branch 'feature/postgis-fixes')
=======
>>>>>>> 5a4c24e020 (GEOMESA-3254 Add Bloop build support)
=======
>>>>>>> 53900605ca (GEOMESA-3067 Find attribute in Filters with Functions with embedded expressions correctly)
=======
>>>>>>> a52e4429be (GEOMESA-3061 Converters - support bytes in Avro top-level union types (#2762))
=======
>>>>>>> 5f01e2c4fc (GEOMESA-3067 Find attribute in Filters with Functions with embedded expressions correctly)
=======
>>>>>>> 5c6b9f1f8b (GEOMESA-3061 Converters - support bytes in Avro top-level union types (#2762))
=======
>>>>>>> 511bd92a86 (GEOMESA-3067 Find attribute in Filters with Functions with embedded expressions correctly)
=======
>>>>>>> 9d44ff473d (GEOMESA-3061 Converters - support bytes in Avro top-level union types (#2762))
=======
>>>>>>> bff2bdde04 (GEOMESA-3067 Find attribute in Filters with Functions with embedded expressions correctly)
=======
>>>>>>> a35efac12e (GEOMESA-3061 Converters - support bytes in Avro top-level union types (#2762))
=======
>>>>>>> 323528580f (GEOMESA-3067 Find attribute in Filters with Functions with embedded expressions correctly)
=======
>>>>>>> fd5565dfba (GEOMESA-3061 Converters - support bytes in Avro top-level union types (#2762))
=======
>>>>>>> 30559ea5c9 (Merge branch 'feature/postgis-fixes')
=======
>>>>>>> 78fe4921a6 (GEOMESA-3067 Find attribute in Filters with Functions with embedded expressions correctly)
=======
>>>>>>> 0104fb37e4 (GEOMESA-3061 Converters - support bytes in Avro top-level union types (#2762))
=======
>>>>>>> 530b057384 (GEOMESA-3067 Find attribute in Filters with Functions with embedded expressions correctly)
=======
>>>>>>> 2654d9c120 (GEOMESA-3061 Converters - support bytes in Avro top-level union types (#2762))
=======
>>>>>>> de7d6ef448 (GEOMESA-3067 Find attribute in Filters with Functions with embedded expressions correctly)
=======
>>>>>>> f110463a26 (GEOMESA-3061 Converters - support bytes in Avro top-level union types (#2762))
=======
>>>>>>> d83561962d (GEOMESA-3067 Find attribute in Filters with Functions with embedded expressions correctly)
=======
>>>>>>> 86ec77f9cb (GEOMESA-3061 Converters - support bytes in Avro top-level union types (#2762))
=======
>>>>>>> 17883cb601 (GEOMESA-3067 Find attribute in Filters with Functions with embedded expressions correctly)
=======
>>>>>>> 1bcc513539 (GEOMESA-3061 Converters - support bytes in Avro top-level union types (#2762))
=======
>>>>>>> ec6d06b576 (Merge branch 'feature/postgis-fixes')
=======
>>>>>>> 3d5144418e (GEOMESA-3061 Converters - support bytes in Avro top-level union types (#2762))
=======
>>>>>>> efb6723f42 (GEOMESA-3067 Find attribute in Filters with Functions with embedded expressions correctly)
=======
>>>>>>> 7bdbfa5524 (GEOMESA-3061 Converters - support bytes in Avro top-level union types (#2762))
=======
>>>>>>> 17b189175b (GEOMESA-3067 Find attribute in Filters with Functions with embedded expressions correctly)
=======
>>>>>>> 7bff4d0018 (GEOMESA-3061 Converters - support bytes in Avro top-level union types (#2762))
=======
>>>>>>> 657a38673a (GEOMESA-3067 Find attribute in Filters with Functions with embedded expressions correctly)
=======
>>>>>>> e8b736ee96 (GEOMESA-3061 Converters - support bytes in Avro top-level union types (#2762))
=======
>>>>>>> e31a4215c4 (GEOMESA-3067 Find attribute in Filters with Functions with embedded expressions correctly)
=======
>>>>>>> 0efbfe547e (GEOMESA-3061 Converters - support bytes in Avro top-level union types (#2762))
=======
>>>>>>> 4c41429da9 (Merge branch 'feature/postgis-fixes')
=======
>>>>>>> ca13f8551e (GEOMESA-3067 Find attribute in Filters with Functions with embedded expressions correctly)
=======
>>>>>>> d498bef1ce (GEOMESA-3061 Converters - support bytes in Avro top-level union types (#2762))
=======
>>>>>>> cd4422a10c (GEOMESA-3067 Find attribute in Filters with Functions with embedded expressions correctly)
=======
>>>>>>> a5b160f47b (GEOMESA-3061 Converters - support bytes in Avro top-level union types (#2762))
=======
>>>>>>> fa429c7863 (GEOMESA-3067 Find attribute in Filters with Functions with embedded expressions correctly)
=======
>>>>>>> 5cf31d21f3 (GEOMESA-3061 Converters - support bytes in Avro top-level union types (#2762))
=======
>>>>>>> def2794bb5 (GEOMESA-3067 Find attribute in Filters with Functions with embedded expressions correctly)
=======
>>>>>>> 94fecee1d8 (GEOMESA-3061 Converters - support bytes in Avro top-level union types (#2762))
=======
>>>>>>> f8d3d445c0 (GEOMESA-3067 Find attribute in Filters with Functions with embedded expressions correctly)
=======
>>>>>>> 4599715c51 (d)
=======
>>>>>>> 6e0709aba8 (Merge branch 'feature/postgis-fixes')
=======
>>>>>>> 7a84c9d22d (GEOMESA-3254 Add Bloop build support)
=======
>>>>>>> bad8172e9b (GEOMESA-3067 Find attribute in Filters with Functions with embedded expressions correctly)
=======
>>>>>>> 7fbbd56493 (GEOMESA-3061 Converters - support bytes in Avro top-level union types (#2762))
=======
>>>>>>> e582c3ecfe (GEOMESA-3067 Find attribute in Filters with Functions with embedded expressions correctly)
=======
>>>>>>> 3eb12f79a9 (GEOMESA-3061 Converters - support bytes in Avro top-level union types (#2762))
=======
>>>>>>> 8b16ac5c65 (GEOMESA-3067 Find attribute in Filters with Functions with embedded expressions correctly)
=======
>>>>>>> 4ccd6f6b1f (GEOMESA-3061 Converters - support bytes in Avro top-level union types (#2762))
=======
>>>>>>> f983ea29f0 (GEOMESA-3067 Find attribute in Filters with Functions with embedded expressions correctly)
=======
>>>>>>> 35b69b8f2f (GEOMESA-3061 Converters - support bytes in Avro top-level union types (#2762))
=======
>>>>>>> da4e2905b4 (GEOMESA-3067 Find attribute in Filters with Functions with embedded expressions correctly)
=======
>>>>>>> db8a3a22b2 (GEOMESA-3061 Converters - support bytes in Avro top-level union types (#2762))
=======
>>>>>>> ed25decdd5 (Merge branch 'feature/postgis-fixes')
=======
>>>>>>> 27afb28ab6 (GEOMESA-3061 Converters - support bytes in Avro top-level union types (#2762))
=======
>>>>>>> 26a09ee6c2 (GEOMESA-3061 Converters - support bytes in Avro top-level union types (#2762))
=======
>>>>>>> 194ad4e5c0 (GEOMESA-3061 Converters - support bytes in Avro top-level union types (#2762))
=======
>>>>>>> 7b3c90c53f (GEOMESA-3061 Converters - support bytes in Avro top-level union types (#2762))
=======
>>>>>>> db9dfb6f14 (GEOMESA-3061 Converters - support bytes in Avro top-level union types (#2762))
=======
>>>>>>> f893d9a594 (Merge branch 'feature/postgis-fixes')
=======
>>>>>>> f33d55e2ba (GEOMESA-3067 Find attribute in Filters with Functions with embedded expressions correctly)
=======
>>>>>>> b8ebbf6083 (GEOMESA-3061 Converters - support bytes in Avro top-level union types (#2762))
=======
>>>>>>> 1278241911 (GEOMESA-3067 Find attribute in Filters with Functions with embedded expressions correctly)
=======
>>>>>>> 3e7fb62639 (GEOMESA-3061 Converters - support bytes in Avro top-level union types (#2762))
=======
>>>>>>> 00d66ae013 (GEOMESA-3067 Find attribute in Filters with Functions with embedded expressions correctly)
=======
>>>>>>> c2cfc968d2 (GEOMESA-3061 Converters - support bytes in Avro top-level union types (#2762))
=======
>>>>>>> 5d8dab9f81 (GEOMESA-3067 Find attribute in Filters with Functions with embedded expressions correctly)
=======
>>>>>>> 0fa73844a1 (GEOMESA-3061 Converters - support bytes in Avro top-level union types (#2762))
=======
>>>>>>> 1ef95979ee (GEOMESA-3067 Find attribute in Filters with Functions with embedded expressions correctly)
=======
>>>>>>> 63546aacdc (GEOMESA-3061 Converters - support bytes in Avro top-level union types (#2762))
=======
>>>>>>> 964e86145a (Merge branch 'feature/postgis-fixes')
=======
>>>>>>> b298e017f1 (GEOMESA-3254 Add Bloop build support)
=======
>>>>>>> 72b96c5c3e (GEOMESA-3067 Find attribute in Filters with Functions with embedded expressions correctly)
=======
>>>>>>> 1ea8b10ac7 (GEOMESA-3061 Converters - support bytes in Avro top-level union types (#2762))
=======
>>>>>>> e72b998c12 (GEOMESA-3067 Find attribute in Filters with Functions with embedded expressions correctly)
=======
>>>>>>> b800c052cc (GEOMESA-3061 Converters - support bytes in Avro top-level union types (#2762))
=======
>>>>>>> 8e70a881a6 (GEOMESA-3067 Find attribute in Filters with Functions with embedded expressions correctly)
=======
>>>>>>> 9dbe1503e8 (GEOMESA-3061 Converters - support bytes in Avro top-level union types (#2762))
=======
>>>>>>> 53bc726472 (GEOMESA-3067 Find attribute in Filters with Functions with embedded expressions correctly)
=======
>>>>>>> 6e30236dd2 (GEOMESA-3061 Converters - support bytes in Avro top-level union types (#2762))
=======
>>>>>>> 3261561062 (GEOMESA-3067 Find attribute in Filters with Functions with embedded expressions correctly)
=======
>>>>>>> dbd932fed6 (GEOMESA-3061 Converters - support bytes in Avro top-level union types (#2762))
=======
>>>>>>> bf6bde0830 (Merge branch 'feature/postgis-fixes')
=======
>>>>>>> 5b9d5ada1b (GEOMESA-3067 Find attribute in Filters with Functions with embedded expressions correctly)
=======
>>>>>>> 9293965a7d (GEOMESA-3061 Converters - support bytes in Avro top-level union types (#2762))
=======
>>>>>>> 67dc71ffb1 (GEOMESA-3067 Find attribute in Filters with Functions with embedded expressions correctly)
=======
>>>>>>> 058fd96baa (GEOMESA-3061 Converters - support bytes in Avro top-level union types (#2762))
=======
>>>>>>> f7fc21ae20 (GEOMESA-3067 Find attribute in Filters with Functions with embedded expressions correctly)
=======
>>>>>>> c22ecd64c3 (GEOMESA-3061 Converters - support bytes in Avro top-level union types (#2762))
=======
>>>>>>> 6e297b9b6f (GEOMESA-3067 Find attribute in Filters with Functions with embedded expressions correctly)
=======
>>>>>>> 2a887f75bf (GEOMESA-3061 Converters - support bytes in Avro top-level union types (#2762))
=======
>>>>>>> 08a743b61d (GEOMESA-3067 Find attribute in Filters with Functions with embedded expressions correctly)
=======
>>>>>>> b08cb4d818 (GEOMESA-3061 Converters - support bytes in Avro top-level union types (#2762))
=======
>>>>>>> 354b5e5ae5 (Merge branch 'feature/postgis-fixes')
=======
>>>>>>> 043f2d0167 (GEOMESA-3067 Find attribute in Filters with Functions with embedded expressions correctly)
=======
=======
>>>>>>> 59a1fbb96e (GEOMESA-3061 Converters - support bytes in Avro top-level union types (#2762))
>>>>>>> ac217b392d (GEOMESA-3061 Converters - support bytes in Avro top-level union types (#2762))
=======
=======
>>>>>>> a6693cb0ba (GEOMESA-3067 Find attribute in Filters with Functions with embedded expressions correctly)
=======
>>>>>>> d1fa26b39d (GEOMESA-3061 Converters - support bytes in Avro top-level union types (#2762))
=======
>>>>>>> e7d6b701c8 (GEOMESA-3061 Converters - support bytes in Avro top-level union types (#2762))
=======
>>>>>>> 70f2c62b7e (GEOMESA-3067 Find attribute in Filters with Functions with embedded expressions correctly)
=======
>>>>>>> f67dd3371e (GEOMESA-3061 Converters - support bytes in Avro top-level union types (#2762))
=======
>>>>>>> 95e52e061e (GEOMESA-3061 Converters - support bytes in Avro top-level union types (#2762))
=======
>>>>>>> 424e7de15a (GEOMESA-3067 Find attribute in Filters with Functions with embedded expressions correctly)
=======
>>>>>>> f7cef54062 (GEOMESA-3061 Converters - support bytes in Avro top-level union types (#2762))
=======
>>>>>>> 988874c83e (GEOMESA-3061 Converters - support bytes in Avro top-level union types (#2762))
=======
>>>>>>> 87dddefcd8 (GEOMESA-3067 Find attribute in Filters with Functions with embedded expressions correctly)
=======
>>>>>>> a16b64a4d1 (GEOMESA-3061 Converters - support bytes in Avro top-level union types (#2762))
=======
>>>>>>> aea9fbe131 (GEOMESA-3061 Converters - support bytes in Avro top-level union types (#2762))
=======
>>>>>>> d581fa3e8f (Merge branch 'feature/postgis-fixes')
=======
>>>>>>> 5430d59024 (GEOMESA-3067 Find attribute in Filters with Functions with embedded expressions correctly)
=======
>>>>>>> ca1e0fad13 (GEOMESA-3067 Find attribute in Filters with Functions with embedded expressions correctly)
=======
>>>>>>> 5a55bf9756 (GEOMESA-3061 Converters - support bytes in Avro top-level union types (#2762))
=======
>>>>>>> 2571e49519 (GEOMESA-3067 Find attribute in Filters with Functions with embedded expressions correctly)
=======
>>>>>>> adfec3a47a (GEOMESA-3067 Find attribute in Filters with Functions with embedded expressions correctly)
=======
>>>>>>> e0c2527549 (GEOMESA-3061 Converters - support bytes in Avro top-level union types (#2762))
=======
>>>>>>> 9412e85b59 (GEOMESA-3067 Find attribute in Filters with Functions with embedded expressions correctly)
=======
>>>>>>> 4cf1d8d259 (GEOMESA-3067 Find attribute in Filters with Functions with embedded expressions correctly)
=======
>>>>>>> cb5e2daf2b (GEOMESA-3061 Converters - support bytes in Avro top-level union types (#2762))
=======
>>>>>>> 24c4df93a5 (GEOMESA-3067 Find attribute in Filters with Functions with embedded expressions correctly)
=======
>>>>>>> 9bcad1eb67 (GEOMESA-3067 Find attribute in Filters with Functions with embedded expressions correctly)
=======
>>>>>>> 00e61f4b70 (GEOMESA-3061 Converters - support bytes in Avro top-level union types (#2762))
=======
>>>>>>> 1e00950a90 (GEOMESA-3067 Find attribute in Filters with Functions with embedded expressions correctly)
=======
>>>>>>> 9a4568fbda (GEOMESA-3067 Find attribute in Filters with Functions with embedded expressions correctly)
=======
>>>>>>> 4864cfc581 (GEOMESA-3061 Converters - support bytes in Avro top-level union types (#2762))
=======
>>>>>>> 42e8565e9b (Merge branch 'feature/postgis-fixes')
=======
>>>>>>> 264c9fa240 (Merge branch 'feature/postgis-fixes')
=======
>>>>>>> c738f63bd9 (GEOMESA-3254 Add Bloop build support)
=======
>>>>>>> 4bbf97686c (GEOMESA-3067 Find attribute in Filters with Functions with embedded expressions correctly)
=======
>>>>>>> 7213a78a3a (GEOMESA-3067 Find attribute in Filters with Functions with embedded expressions correctly)
=======
>>>>>>> 3676d4e56a (GEOMESA-3061 Converters - support bytes in Avro top-level union types (#2762))
=======
>>>>>>> b3dd8ec805 (GEOMESA-3067 Find attribute in Filters with Functions with embedded expressions correctly)
=======
>>>>>>> e8ce815f1b (GEOMESA-3067 Find attribute in Filters with Functions with embedded expressions correctly)
=======
>>>>>>> 60b4637548 (GEOMESA-3061 Converters - support bytes in Avro top-level union types (#2762))
=======
>>>>>>> 2b62d1f3fe (GEOMESA-3067 Find attribute in Filters with Functions with embedded expressions correctly)
=======
>>>>>>> 6f81d40992 (GEOMESA-3067 Find attribute in Filters with Functions with embedded expressions correctly)
=======
>>>>>>> 009a284072 (GEOMESA-3061 Converters - support bytes in Avro top-level union types (#2762))
=======
>>>>>>> c169cb2905 (GEOMESA-3067 Find attribute in Filters with Functions with embedded expressions correctly)
=======
>>>>>>> 9df4f8a9f6 (GEOMESA-3067 Find attribute in Filters with Functions with embedded expressions correctly)
=======
>>>>>>> 7b8c8dcc3d (GEOMESA-3061 Converters - support bytes in Avro top-level union types (#2762))
=======
>>>>>>> 63ca73533e (GEOMESA-3067 Find attribute in Filters with Functions with embedded expressions correctly)
=======
>>>>>>> 79cd5cb606 (GEOMESA-3067 Find attribute in Filters with Functions with embedded expressions correctly)
=======
>>>>>>> c029a43a6c (GEOMESA-3061 Converters - support bytes in Avro top-level union types (#2762))
=======
>>>>>>> 67de3c3202 (Merge branch 'feature/postgis-fixes')
=======
>>>>>>> 217b7d1cb9 (Merge branch 'feature/postgis-fixes')
=======
>>>>>>> a5b0374ee2 (GEOMESA-3061 Converters - support bytes in Avro top-level union types (#2762))
=======
>>>>>>> 8c9ca1211a (GEOMESA-3061 Converters - support bytes in Avro top-level union types (#2762))
=======
>>>>>>> 4f51687745 (GEOMESA-3061 Converters - support bytes in Avro top-level union types (#2762))
=======
>>>>>>> 9a2d40c613 (GEOMESA-3061 Converters - support bytes in Avro top-level union types (#2762))
=======
>>>>>>> 1cad375176 (GEOMESA-3061 Converters - support bytes in Avro top-level union types (#2762))
=======
>>>>>>> 73770612e0 (GEOMESA-3061 Converters - support bytes in Avro top-level union types (#2762))
=======
>>>>>>> 6c83981af3 (GEOMESA-3061 Converters - support bytes in Avro top-level union types (#2762))
>>>>>>> 7acc3ea465 (GEOMESA-3067 Find attribute in Filters with Functions with embedded expressions correctly)
=======
>>>>>>> b9bdd406e3 (GEOMESA-3061 Converters - support bytes in Avro top-level union types (#2762))
<<<<<<< HEAD
<<<<<<< HEAD
<<<<<<< HEAD
<<<<<<< HEAD
<<<<<<< HEAD
<<<<<<< HEAD
=======
>>>>>>> a1d28116d4 (GEOMESA-3067 Find attribute in Filters with Functions with embedded expressions correctly)
=======
>>>>>>> efb6723f42 (GEOMESA-3067 Find attribute in Filters with Functions with embedded expressions correctly)
=======
>>>>>>> ac217b392d (GEOMESA-3061 Converters - support bytes in Avro top-level union types (#2762))
=======
=======
>>>>>>> a1d28116d4 (GEOMESA-3067 Find attribute in Filters with Functions with embedded expressions correctly)
>>>>>>> a6693cb0ba (GEOMESA-3067 Find attribute in Filters with Functions with embedded expressions correctly)
=======
=======
>>>>>>> 7acc3ea46 (GEOMESA-3067 Find attribute in Filters with Functions with embedded expressions correctly)
>>>>>>> f36b0e8b9a (GEOMESA-3067 Find attribute in Filters with Functions with embedded expressions correctly)
<<<<<<< HEAD
<<<<<<< HEAD
<<<<<<< HEAD
<<<<<<< HEAD
<<<<<<< HEAD
<<<<<<< HEAD
=======
>>>>>>> a6693cb0ba (GEOMESA-3067 Find attribute in Filters with Functions with embedded expressions correctly)
=======
>>>>>>> e7d6b701c8 (GEOMESA-3061 Converters - support bytes in Avro top-level union types (#2762))
=======
=======
>>>>>>> a63cb7e740 (GEOMESA-3067 Find attribute in Filters with Functions with embedded expressions correctly)
=======
<<<<<<< HEAD
<<<<<<< HEAD
<<<<<<< HEAD
<<<<<<< HEAD
<<<<<<< HEAD
<<<<<<< HEAD
=======
>>>>>>> 3333975e77 (GEOMESA-3067 Find attribute in Filters with Functions with embedded expressions correctly)
=======
>>>>>>> 76618c8da3 (GEOMESA-3061 Converters - support bytes in Avro top-level union types (#2762))
=======
>>>>>>> c3b0a1b6e3 (GEOMESA-3067 Find attribute in Filters with Functions with embedded expressions correctly)
=======
>>>>>>> c8a325e13c (GEOMESA-3061 Converters - support bytes in Avro top-level union types (#2762))
=======
>>>>>>> 9638dc731e (GEOMESA-3067 Find attribute in Filters with Functions with embedded expressions correctly)
=======
>>>>>>> 97ec7d864a (GEOMESA-3061 Converters - support bytes in Avro top-level union types (#2762))
=======
>>>>>>> db8d998aa2 (Merge branch 'feature/postgis-fixes')
=======
>>>>>>> 7f922b040c (GEOMESA-3067 Find attribute in Filters with Functions with embedded expressions correctly)
=======
>>>>>>> a910ae135f (GEOMESA-3061 Converters - support bytes in Avro top-level union types (#2762))
=======
>>>>>>> 8fb0607344 (GEOMESA-3067 Find attribute in Filters with Functions with embedded expressions correctly)
=======
>>>>>>> ad3cedc4db (GEOMESA-3061 Converters - support bytes in Avro top-level union types (#2762))
=======
>>>>>>> bc49131942 (GEOMESA-3067 Find attribute in Filters with Functions with embedded expressions correctly)
=======
>>>>>>> bdbced26d4 (GEOMESA-3061 Converters - support bytes in Avro top-level union types (#2762))
=======
>>>>>>> 1b25d7ddb4 (Merge branch 'feature/postgis-fixes')
=======
>>>>>>> 0dbede148d (GEOMESA-3061 Converters - support bytes in Avro top-level union types (#2762))
=======
>>>>>>> 22dcc8170f (GEOMESA-3061 Converters - support bytes in Avro top-level union types (#2762))
=======
=======
>>>>>>> 238945d4b3 (GEOMESA-3061 Converters - support bytes in Avro top-level union types (#2762))
=======
>>>>>>> bc4062951d (GEOMESA-3061 Converters - support bytes in Avro top-level union types (#2762))
=======
>>>>>>> e944f1c88b (Merge branch 'feature/postgis-fixes')
=======
>>>>>>> deb8fd68de (GEOMESA-3067 Find attribute in Filters with Functions with embedded expressions correctly)
=======
>>>>>>> 8adfab65bb (GEOMESA-3061 Converters - support bytes in Avro top-level union types (#2762))
=======
>>>>>>> 3254b186da (GEOMESA-3067 Find attribute in Filters with Functions with embedded expressions correctly)
=======
>>>>>>> 7b0539b808 (GEOMESA-3061 Converters - support bytes in Avro top-level union types (#2762))
=======
>>>>>>> 982031ef44 (GEOMESA-3067 Find attribute in Filters with Functions with embedded expressions correctly)
=======
>>>>>>> 0086b292ba (GEOMESA-3061 Converters - support bytes in Avro top-level union types (#2762))
=======
>>>>>>> cf57a2c189 (GEOMESA-3067 Find attribute in Filters with Functions with embedded expressions correctly)
=======
>>>>>>> e15d50d7d3 (GEOMESA-3061 Converters - support bytes in Avro top-level union types (#2762))
=======
>>>>>>> bec3ba7d08 (GEOMESA-3067 Find attribute in Filters with Functions with embedded expressions correctly)
=======
>>>>>>> 8de43cccf6 (GEOMESA-3061 Converters - support bytes in Avro top-level union types (#2762))
=======
>>>>>>> 26e5afc4ea (Merge branch 'feature/postgis-fixes')
=======
>>>>>>> 63a045a753 (GEOMESA-3254 Add Bloop build support)
=======
>>>>>>> b1a7408547 (GEOMESA-3067 Find attribute in Filters with Functions with embedded expressions correctly)
=======
>>>>>>> 12e3a588fc (GEOMESA-3061 Converters - support bytes in Avro top-level union types (#2762))
=======
>>>>>>> c8e013ff91 (GEOMESA-3067 Find attribute in Filters with Functions with embedded expressions correctly)
=======
>>>>>>> 1890b11217 (GEOMESA-3061 Converters - support bytes in Avro top-level union types (#2762))
=======
>>>>>>> 912169b5e9 (GEOMESA-3067 Find attribute in Filters with Functions with embedded expressions correctly)
=======
>>>>>>> 9c28193a91 (GEOMESA-3061 Converters - support bytes in Avro top-level union types (#2762))
=======
>>>>>>> 1b60c2aeba (GEOMESA-3067 Find attribute in Filters with Functions with embedded expressions correctly)
=======
>>>>>>> d294ce49e2 (GEOMESA-3061 Converters - support bytes in Avro top-level union types (#2762))
=======
>>>>>>> ed45e8551f (GEOMESA-3067 Find attribute in Filters with Functions with embedded expressions correctly)
=======
>>>>>>> 1df8328338 (GEOMESA-3061 Converters - support bytes in Avro top-level union types (#2762))
=======
>>>>>>> c69897d7bd (Merge branch 'feature/postgis-fixes')
=======
>>>>>>> 45ad5d11f (GEOMESA-3061 Converters - support bytes in Avro top-level union types (#2762))
>>>>>>> b009fd23f4 (GEOMESA-3061 Converters - support bytes in Avro top-level union types (#2762))
=======
>>>>>>> dace2085b (GEOMESA-3061 Converters - support bytes in Avro top-level union types (#2762))
=======
>>>>>>> 516fe7e9c (GEOMESA-3061 Converters - support bytes in Avro top-level union types (#2762))
=======
>>>>>>> e8cc4971c6 (Merge branch 'feature/postgis-fixes')
=======
>>>>>>> 8a3e82747d (GEOMESA-3067 Find attribute in Filters with Functions with embedded expressions correctly)
=======
>>>>>>> 81ee66102b (GEOMESA-3061 Converters - support bytes in Avro top-level union types (#2762))
=======
>>>>>>> 9943e05ec9 (GEOMESA-3067 Find attribute in Filters with Functions with embedded expressions correctly)
=======
>>>>>>> 53a3e72cbf (GEOMESA-3061 Converters - support bytes in Avro top-level union types (#2762))
=======
=======
>>>>>>> 947761ec9b (GEOMESA-3061 Converters - support bytes in Avro top-level union types (#2762))
=======
>>>>>>> 9813375fcc (GEOMESA-3067 Find attribute in Filters with Functions with embedded expressions correctly)
=======
>>>>>>> c9328eddce (GEOMESA-3061 Converters - support bytes in Avro top-level union types (#2762))
=======
>>>>>>> d2eec4be68 (GEOMESA-3067 Find attribute in Filters with Functions with embedded expressions correctly)
=======
>>>>>>> d94c03a98e (GEOMESA-3061 Converters - support bytes in Avro top-level union types (#2762))
=======
>>>>>>> cb6bda89b6 (Merge branch 'feature/postgis-fixes')
=======
>>>>>>> 09d87762c5 (GEOMESA-3254 Add Bloop build support)
=======
>>>>>>> e69b2aa6dc (GEOMESA-3067 Find attribute in Filters with Functions with embedded expressions correctly)
=======
>>>>>>> 67e4c1354f (GEOMESA-3061 Converters - support bytes in Avro top-level union types (#2762))
=======
>>>>>>> 060ac2189c (GEOMESA-3067 Find attribute in Filters with Functions with embedded expressions correctly)
=======
>>>>>>> 8035cc5893 (GEOMESA-3061 Converters - support bytes in Avro top-level union types (#2762))
=======
>>>>>>> 04f08c23c5 (GEOMESA-3067 Find attribute in Filters with Functions with embedded expressions correctly)
=======
>>>>>>> 07161eaaa6 (GEOMESA-3061 Converters - support bytes in Avro top-level union types (#2762))
=======
>>>>>>> 38b3282770 (GEOMESA-3067 Find attribute in Filters with Functions with embedded expressions correctly)
=======
>>>>>>> 9abc630fdf (GEOMESA-3061 Converters - support bytes in Avro top-level union types (#2762))
=======
>>>>>>> 570899511d (GEOMESA-3067 Find attribute in Filters with Functions with embedded expressions correctly)
=======
>>>>>>> 25063957fc (GEOMESA-3061 Converters - support bytes in Avro top-level union types (#2762))
=======
>>>>>>> 699117eca9 (Merge branch 'feature/postgis-fixes')
=======
>>>>>>> 3333975e7 (GEOMESA-3067 Find attribute in Filters with Functions with embedded expressions correctly)
>>>>>>> d15af7157e (GEOMESA-3067 Find attribute in Filters with Functions with embedded expressions correctly)
=======
>>>>>>> 76618c8da (GEOMESA-3061 Converters - support bytes in Avro top-level union types (#2762))
=======
>>>>>>> c3b0a1b6e (GEOMESA-3067 Find attribute in Filters with Functions with embedded expressions correctly)
=======
>>>>>>> c8a325e13 (GEOMESA-3061 Converters - support bytes in Avro top-level union types (#2762))
=======
>>>>>>> 9638dc731 (GEOMESA-3067 Find attribute in Filters with Functions with embedded expressions correctly)
=======
>>>>>>> 97ec7d864 (GEOMESA-3061 Converters - support bytes in Avro top-level union types (#2762))
=======
>>>>>>> db8d998aa (Merge branch 'feature/postgis-fixes')
=======
>>>>>>> 7f922b040 (GEOMESA-3067 Find attribute in Filters with Functions with embedded expressions correctly)
=======
>>>>>>> a910ae135 (GEOMESA-3061 Converters - support bytes in Avro top-level union types (#2762))
=======
>>>>>>> 8fb060734 (GEOMESA-3067 Find attribute in Filters with Functions with embedded expressions correctly)
=======
>>>>>>> ad3cedc4d (GEOMESA-3061 Converters - support bytes in Avro top-level union types (#2762))
=======
>>>>>>> bc4913194 (GEOMESA-3067 Find attribute in Filters with Functions with embedded expressions correctly)
=======
>>>>>>> bdbced26d (GEOMESA-3061 Converters - support bytes in Avro top-level union types (#2762))
=======
>>>>>>> 1b25d7ddb (Merge branch 'feature/postgis-fixes')
=======
>>>>>>> 20f6826d0f (GEOMESA-3067 Find attribute in Filters with Functions with embedded expressions correctly)
=======
>>>>>>> 4c361f07da (GEOMESA-3061 Converters - support bytes in Avro top-level union types (#2762))
=======
>>>>>>> 125ffd0575 (GEOMESA-3067 Find attribute in Filters with Functions with embedded expressions correctly)
=======
>>>>>>> f302a54949 (GEOMESA-3061 Converters - support bytes in Avro top-level union types (#2762))
=======
>>>>>>> a83fe4cf7c (GEOMESA-3067 Find attribute in Filters with Functions with embedded expressions correctly)
=======
>>>>>>> a788dfac03 (GEOMESA-3061 Converters - support bytes in Avro top-level union types (#2762))
=======
>>>>>>> da00c7bd68 (Merge branch 'feature/postgis-fixes')
=======
>>>>>>> f7cef54062 (GEOMESA-3061 Converters - support bytes in Avro top-level union types (#2762))
=======
>>>>>>> 3333975e77 (GEOMESA-3067 Find attribute in Filters with Functions with embedded expressions correctly)
=======
>>>>>>> 76618c8da3 (GEOMESA-3061 Converters - support bytes in Avro top-level union types (#2762))
=======
>>>>>>> c3b0a1b6e3 (GEOMESA-3067 Find attribute in Filters with Functions with embedded expressions correctly)
=======
>>>>>>> c8a325e13c (GEOMESA-3061 Converters - support bytes in Avro top-level union types (#2762))
=======
>>>>>>> 9638dc731e (GEOMESA-3067 Find attribute in Filters with Functions with embedded expressions correctly)
=======
>>>>>>> 97ec7d864a (GEOMESA-3061 Converters - support bytes in Avro top-level union types (#2762))
=======
>>>>>>> db8d998aa2 (Merge branch 'feature/postgis-fixes')
=======
>>>>>>> 7f922b040c (GEOMESA-3067 Find attribute in Filters with Functions with embedded expressions correctly)
=======
>>>>>>> a910ae135f (GEOMESA-3061 Converters - support bytes in Avro top-level union types (#2762))
=======
>>>>>>> 8fb0607344 (GEOMESA-3067 Find attribute in Filters with Functions with embedded expressions correctly)
=======
>>>>>>> ad3cedc4db (GEOMESA-3061 Converters - support bytes in Avro top-level union types (#2762))
=======
>>>>>>> bc49131942 (GEOMESA-3067 Find attribute in Filters with Functions with embedded expressions correctly)
=======
>>>>>>> bdbced26d4 (GEOMESA-3061 Converters - support bytes in Avro top-level union types (#2762))
=======
>>>>>>> 1b25d7ddb4 (Merge branch 'feature/postgis-fixes')
=======
>>>>>>> 0dbede148d (GEOMESA-3061 Converters - support bytes in Avro top-level union types (#2762))
=======
>>>>>>> 22dcc8170f (GEOMESA-3061 Converters - support bytes in Avro top-level union types (#2762))
=======
=======
>>>>>>> 238945d4b3 (GEOMESA-3061 Converters - support bytes in Avro top-level union types (#2762))
=======
>>>>>>> bc4062951d (GEOMESA-3061 Converters - support bytes in Avro top-level union types (#2762))
=======
>>>>>>> e944f1c88b (Merge branch 'feature/postgis-fixes')
=======
>>>>>>> deb8fd68de (GEOMESA-3067 Find attribute in Filters with Functions with embedded expressions correctly)
=======
>>>>>>> 8adfab65bb (GEOMESA-3061 Converters - support bytes in Avro top-level union types (#2762))
=======
>>>>>>> 3254b186da (GEOMESA-3067 Find attribute in Filters with Functions with embedded expressions correctly)
=======
>>>>>>> 7b0539b808 (GEOMESA-3061 Converters - support bytes in Avro top-level union types (#2762))
=======
>>>>>>> 982031ef44 (GEOMESA-3067 Find attribute in Filters with Functions with embedded expressions correctly)
=======
>>>>>>> 0086b292ba (GEOMESA-3061 Converters - support bytes in Avro top-level union types (#2762))
=======
>>>>>>> cf57a2c189 (GEOMESA-3067 Find attribute in Filters with Functions with embedded expressions correctly)
=======
>>>>>>> e15d50d7d3 (GEOMESA-3061 Converters - support bytes in Avro top-level union types (#2762))
=======
>>>>>>> bec3ba7d08 (GEOMESA-3067 Find attribute in Filters with Functions with embedded expressions correctly)
=======
>>>>>>> 8de43cccf6 (GEOMESA-3061 Converters - support bytes in Avro top-level union types (#2762))
=======
>>>>>>> 26e5afc4ea (Merge branch 'feature/postgis-fixes')
=======
>>>>>>> 63a045a753 (GEOMESA-3254 Add Bloop build support)
=======
>>>>>>> b1a7408547 (GEOMESA-3067 Find attribute in Filters with Functions with embedded expressions correctly)
=======
>>>>>>> 12e3a588fc (GEOMESA-3061 Converters - support bytes in Avro top-level union types (#2762))
=======
>>>>>>> c8e013ff91 (GEOMESA-3067 Find attribute in Filters with Functions with embedded expressions correctly)
=======
>>>>>>> 1890b11217 (GEOMESA-3061 Converters - support bytes in Avro top-level union types (#2762))
=======
>>>>>>> 912169b5e9 (GEOMESA-3067 Find attribute in Filters with Functions with embedded expressions correctly)
=======
>>>>>>> 9c28193a91 (GEOMESA-3061 Converters - support bytes in Avro top-level union types (#2762))
=======
>>>>>>> 1b60c2aeba (GEOMESA-3067 Find attribute in Filters with Functions with embedded expressions correctly)
=======
>>>>>>> d294ce49e2 (GEOMESA-3061 Converters - support bytes in Avro top-level union types (#2762))
=======
>>>>>>> ed45e8551f (GEOMESA-3067 Find attribute in Filters with Functions with embedded expressions correctly)
=======
>>>>>>> 1df8328338 (GEOMESA-3061 Converters - support bytes in Avro top-level union types (#2762))
=======
>>>>>>> c69897d7bd (Merge branch 'feature/postgis-fixes')
=======
>>>>>>> 45ad5d11f (GEOMESA-3061 Converters - support bytes in Avro top-level union types (#2762))
>>>>>>> b009fd23f4 (GEOMESA-3061 Converters - support bytes in Avro top-level union types (#2762))
=======
>>>>>>> dace2085b (GEOMESA-3061 Converters - support bytes in Avro top-level union types (#2762))
=======
>>>>>>> 516fe7e9c (GEOMESA-3061 Converters - support bytes in Avro top-level union types (#2762))
=======
>>>>>>> e8cc4971c6 (Merge branch 'feature/postgis-fixes')
=======
>>>>>>> 8a3e82747d (GEOMESA-3067 Find attribute in Filters with Functions with embedded expressions correctly)
=======
>>>>>>> 81ee66102b (GEOMESA-3061 Converters - support bytes in Avro top-level union types (#2762))
=======
>>>>>>> 9943e05ec9 (GEOMESA-3067 Find attribute in Filters with Functions with embedded expressions correctly)
=======
>>>>>>> 53a3e72cbf (GEOMESA-3061 Converters - support bytes in Avro top-level union types (#2762))
=======
=======
>>>>>>> 947761ec9b (GEOMESA-3061 Converters - support bytes in Avro top-level union types (#2762))
=======
>>>>>>> 9813375fcc (GEOMESA-3067 Find attribute in Filters with Functions with embedded expressions correctly)
=======
>>>>>>> c9328eddce (GEOMESA-3061 Converters - support bytes in Avro top-level union types (#2762))
=======
>>>>>>> d2eec4be68 (GEOMESA-3067 Find attribute in Filters with Functions with embedded expressions correctly)
=======
>>>>>>> d94c03a98e (GEOMESA-3061 Converters - support bytes in Avro top-level union types (#2762))
=======
>>>>>>> cb6bda89b6 (Merge branch 'feature/postgis-fixes')
=======
>>>>>>> 09d87762c5 (GEOMESA-3254 Add Bloop build support)
=======
>>>>>>> e69b2aa6dc (GEOMESA-3067 Find attribute in Filters with Functions with embedded expressions correctly)
=======
>>>>>>> 67e4c1354f (GEOMESA-3061 Converters - support bytes in Avro top-level union types (#2762))
=======
>>>>>>> 060ac2189c (GEOMESA-3067 Find attribute in Filters with Functions with embedded expressions correctly)
=======
>>>>>>> 8035cc5893 (GEOMESA-3061 Converters - support bytes in Avro top-level union types (#2762))
=======
>>>>>>> 04f08c23c5 (GEOMESA-3067 Find attribute in Filters with Functions with embedded expressions correctly)
=======
>>>>>>> 07161eaaa6 (GEOMESA-3061 Converters - support bytes in Avro top-level union types (#2762))
=======
>>>>>>> 38b3282770 (GEOMESA-3067 Find attribute in Filters with Functions with embedded expressions correctly)
=======
>>>>>>> 9abc630fdf (GEOMESA-3061 Converters - support bytes in Avro top-level union types (#2762))
=======
>>>>>>> 570899511d (GEOMESA-3067 Find attribute in Filters with Functions with embedded expressions correctly)
=======
>>>>>>> 25063957fc (GEOMESA-3061 Converters - support bytes in Avro top-level union types (#2762))
=======
>>>>>>> 699117eca9 (Merge branch 'feature/postgis-fixes')
=======
>>>>>>> 3333975e7 (GEOMESA-3067 Find attribute in Filters with Functions with embedded expressions correctly)
>>>>>>> d15af7157e (GEOMESA-3067 Find attribute in Filters with Functions with embedded expressions correctly)
=======
>>>>>>> 76618c8da (GEOMESA-3061 Converters - support bytes in Avro top-level union types (#2762))
=======
>>>>>>> c3b0a1b6e (GEOMESA-3067 Find attribute in Filters with Functions with embedded expressions correctly)
=======
>>>>>>> c8a325e13 (GEOMESA-3061 Converters - support bytes in Avro top-level union types (#2762))
=======
>>>>>>> 9638dc731 (GEOMESA-3067 Find attribute in Filters with Functions with embedded expressions correctly)
=======
>>>>>>> 97ec7d864 (GEOMESA-3061 Converters - support bytes in Avro top-level union types (#2762))
=======
>>>>>>> db8d998aa (Merge branch 'feature/postgis-fixes')
=======
>>>>>>> 7f922b040 (GEOMESA-3067 Find attribute in Filters with Functions with embedded expressions correctly)
=======
>>>>>>> a910ae135 (GEOMESA-3061 Converters - support bytes in Avro top-level union types (#2762))
=======
>>>>>>> 8fb060734 (GEOMESA-3067 Find attribute in Filters with Functions with embedded expressions correctly)
=======
>>>>>>> ad3cedc4d (GEOMESA-3061 Converters - support bytes in Avro top-level union types (#2762))
=======
>>>>>>> bc4913194 (GEOMESA-3067 Find attribute in Filters with Functions with embedded expressions correctly)
=======
>>>>>>> bdbced26d (GEOMESA-3061 Converters - support bytes in Avro top-level union types (#2762))
=======
>>>>>>> 1b25d7ddb (Merge branch 'feature/postgis-fixes')
=======
>>>>>>> 20f6826d0f (GEOMESA-3067 Find attribute in Filters with Functions with embedded expressions correctly)
=======
>>>>>>> 4c361f07da (GEOMESA-3061 Converters - support bytes in Avro top-level union types (#2762))
=======
>>>>>>> 125ffd0575 (GEOMESA-3067 Find attribute in Filters with Functions with embedded expressions correctly)
=======
>>>>>>> f302a54949 (GEOMESA-3061 Converters - support bytes in Avro top-level union types (#2762))
=======
>>>>>>> a83fe4cf7c (GEOMESA-3067 Find attribute in Filters with Functions with embedded expressions correctly)
=======
>>>>>>> a788dfac03 (GEOMESA-3061 Converters - support bytes in Avro top-level union types (#2762))
=======
>>>>>>> da00c7bd68 (Merge branch 'feature/postgis-fixes')
=======
>>>>>>> e8b736ee96 (GEOMESA-3061 Converters - support bytes in Avro top-level union types (#2762))
=======
>>>>>>> 424e7de15a (GEOMESA-3067 Find attribute in Filters with Functions with embedded expressions correctly)
=======
>>>>>>> 988874c83e (GEOMESA-3061 Converters - support bytes in Avro top-level union types (#2762))
=======
>>>>>>> 3333975e77 (GEOMESA-3067 Find attribute in Filters with Functions with embedded expressions correctly)
=======
>>>>>>> 76618c8da3 (GEOMESA-3061 Converters - support bytes in Avro top-level union types (#2762))
=======
>>>>>>> c3b0a1b6e3 (GEOMESA-3067 Find attribute in Filters with Functions with embedded expressions correctly)
=======
>>>>>>> c8a325e13c (GEOMESA-3061 Converters - support bytes in Avro top-level union types (#2762))
=======
>>>>>>> 9638dc731e (GEOMESA-3067 Find attribute in Filters with Functions with embedded expressions correctly)
=======
>>>>>>> 97ec7d864a (GEOMESA-3061 Converters - support bytes in Avro top-level union types (#2762))
=======
>>>>>>> db8d998aa2 (Merge branch 'feature/postgis-fixes')
=======
>>>>>>> 7f922b040c (GEOMESA-3067 Find attribute in Filters with Functions with embedded expressions correctly)
=======
>>>>>>> a910ae135f (GEOMESA-3061 Converters - support bytes in Avro top-level union types (#2762))
=======
>>>>>>> 8fb0607344 (GEOMESA-3067 Find attribute in Filters with Functions with embedded expressions correctly)
=======
>>>>>>> ad3cedc4db (GEOMESA-3061 Converters - support bytes in Avro top-level union types (#2762))
=======
>>>>>>> bc49131942 (GEOMESA-3067 Find attribute in Filters with Functions with embedded expressions correctly)
=======
>>>>>>> bdbced26d4 (GEOMESA-3061 Converters - support bytes in Avro top-level union types (#2762))
=======
>>>>>>> 1b25d7ddb4 (Merge branch 'feature/postgis-fixes')
=======
>>>>>>> 0dbede148d (GEOMESA-3061 Converters - support bytes in Avro top-level union types (#2762))
=======
>>>>>>> 22dcc8170f (GEOMESA-3061 Converters - support bytes in Avro top-level union types (#2762))
=======
=======
>>>>>>> 238945d4b3 (GEOMESA-3061 Converters - support bytes in Avro top-level union types (#2762))
=======
>>>>>>> bc4062951d (GEOMESA-3061 Converters - support bytes in Avro top-level union types (#2762))
=======
>>>>>>> e944f1c88b (Merge branch 'feature/postgis-fixes')
=======
>>>>>>> deb8fd68de (GEOMESA-3067 Find attribute in Filters with Functions with embedded expressions correctly)
=======
>>>>>>> 8adfab65bb (GEOMESA-3061 Converters - support bytes in Avro top-level union types (#2762))
=======
>>>>>>> 3254b186da (GEOMESA-3067 Find attribute in Filters with Functions with embedded expressions correctly)
=======
>>>>>>> 7b0539b808 (GEOMESA-3061 Converters - support bytes in Avro top-level union types (#2762))
=======
>>>>>>> 982031ef44 (GEOMESA-3067 Find attribute in Filters with Functions with embedded expressions correctly)
=======
>>>>>>> 0086b292ba (GEOMESA-3061 Converters - support bytes in Avro top-level union types (#2762))
=======
>>>>>>> cf57a2c189 (GEOMESA-3067 Find attribute in Filters with Functions with embedded expressions correctly)
=======
>>>>>>> e15d50d7d3 (GEOMESA-3061 Converters - support bytes in Avro top-level union types (#2762))
=======
>>>>>>> bec3ba7d08 (GEOMESA-3067 Find attribute in Filters with Functions with embedded expressions correctly)
=======
>>>>>>> 8de43cccf6 (GEOMESA-3061 Converters - support bytes in Avro top-level union types (#2762))
=======
>>>>>>> 26e5afc4ea (Merge branch 'feature/postgis-fixes')
=======
>>>>>>> 63a045a753 (GEOMESA-3254 Add Bloop build support)
=======
>>>>>>> b1a7408547 (GEOMESA-3067 Find attribute in Filters with Functions with embedded expressions correctly)
=======
>>>>>>> 12e3a588fc (GEOMESA-3061 Converters - support bytes in Avro top-level union types (#2762))
=======
>>>>>>> c8e013ff91 (GEOMESA-3067 Find attribute in Filters with Functions with embedded expressions correctly)
=======
>>>>>>> 1890b11217 (GEOMESA-3061 Converters - support bytes in Avro top-level union types (#2762))
=======
>>>>>>> 912169b5e9 (GEOMESA-3067 Find attribute in Filters with Functions with embedded expressions correctly)
=======
>>>>>>> 9c28193a91 (GEOMESA-3061 Converters - support bytes in Avro top-level union types (#2762))
=======
>>>>>>> 1b60c2aeba (GEOMESA-3067 Find attribute in Filters with Functions with embedded expressions correctly)
=======
>>>>>>> d294ce49e2 (GEOMESA-3061 Converters - support bytes in Avro top-level union types (#2762))
=======
>>>>>>> ed45e8551f (GEOMESA-3067 Find attribute in Filters with Functions with embedded expressions correctly)
=======
>>>>>>> 1df8328338 (GEOMESA-3061 Converters - support bytes in Avro top-level union types (#2762))
=======
>>>>>>> c69897d7bd (Merge branch 'feature/postgis-fixes')
=======
>>>>>>> 45ad5d11f (GEOMESA-3061 Converters - support bytes in Avro top-level union types (#2762))
>>>>>>> b009fd23f4 (GEOMESA-3061 Converters - support bytes in Avro top-level union types (#2762))
=======
>>>>>>> dace2085b (GEOMESA-3061 Converters - support bytes in Avro top-level union types (#2762))
=======
>>>>>>> 516fe7e9c (GEOMESA-3061 Converters - support bytes in Avro top-level union types (#2762))
=======
>>>>>>> e8cc4971c6 (Merge branch 'feature/postgis-fixes')
=======
>>>>>>> 8a3e82747d (GEOMESA-3067 Find attribute in Filters with Functions with embedded expressions correctly)
=======
>>>>>>> 81ee66102b (GEOMESA-3061 Converters - support bytes in Avro top-level union types (#2762))
=======
>>>>>>> 9943e05ec9 (GEOMESA-3067 Find attribute in Filters with Functions with embedded expressions correctly)
=======
>>>>>>> 53a3e72cbf (GEOMESA-3061 Converters - support bytes in Avro top-level union types (#2762))
=======
=======
>>>>>>> 947761ec9b (GEOMESA-3061 Converters - support bytes in Avro top-level union types (#2762))
=======
>>>>>>> 9813375fcc (GEOMESA-3067 Find attribute in Filters with Functions with embedded expressions correctly)
=======
>>>>>>> c9328eddce (GEOMESA-3061 Converters - support bytes in Avro top-level union types (#2762))
=======
>>>>>>> d2eec4be68 (GEOMESA-3067 Find attribute in Filters with Functions with embedded expressions correctly)
=======
>>>>>>> d94c03a98e (GEOMESA-3061 Converters - support bytes in Avro top-level union types (#2762))
=======
>>>>>>> cb6bda89b6 (Merge branch 'feature/postgis-fixes')
=======
>>>>>>> 09d87762c5 (GEOMESA-3254 Add Bloop build support)
=======
>>>>>>> e69b2aa6dc (GEOMESA-3067 Find attribute in Filters with Functions with embedded expressions correctly)
=======
>>>>>>> 67e4c1354f (GEOMESA-3061 Converters - support bytes in Avro top-level union types (#2762))
=======
>>>>>>> 060ac2189c (GEOMESA-3067 Find attribute in Filters with Functions with embedded expressions correctly)
=======
>>>>>>> 8035cc5893 (GEOMESA-3061 Converters - support bytes in Avro top-level union types (#2762))
=======
>>>>>>> 04f08c23c5 (GEOMESA-3067 Find attribute in Filters with Functions with embedded expressions correctly)
=======
>>>>>>> 07161eaaa6 (GEOMESA-3061 Converters - support bytes in Avro top-level union types (#2762))
=======
>>>>>>> 38b3282770 (GEOMESA-3067 Find attribute in Filters with Functions with embedded expressions correctly)
=======
>>>>>>> 9abc630fdf (GEOMESA-3061 Converters - support bytes in Avro top-level union types (#2762))
=======
>>>>>>> 570899511d (GEOMESA-3067 Find attribute in Filters with Functions with embedded expressions correctly)
=======
>>>>>>> 25063957fc (GEOMESA-3061 Converters - support bytes in Avro top-level union types (#2762))
=======
>>>>>>> 699117eca9 (Merge branch 'feature/postgis-fixes')
=======
>>>>>>> 3333975e7 (GEOMESA-3067 Find attribute in Filters with Functions with embedded expressions correctly)
>>>>>>> d15af7157e (GEOMESA-3067 Find attribute in Filters with Functions with embedded expressions correctly)
=======
>>>>>>> 76618c8da (GEOMESA-3061 Converters - support bytes in Avro top-level union types (#2762))
=======
>>>>>>> c3b0a1b6e (GEOMESA-3067 Find attribute in Filters with Functions with embedded expressions correctly)
=======
>>>>>>> c8a325e13 (GEOMESA-3061 Converters - support bytes in Avro top-level union types (#2762))
=======
>>>>>>> 9638dc731 (GEOMESA-3067 Find attribute in Filters with Functions with embedded expressions correctly)
=======
>>>>>>> 97ec7d864 (GEOMESA-3061 Converters - support bytes in Avro top-level union types (#2762))
=======
>>>>>>> db8d998aa (Merge branch 'feature/postgis-fixes')
=======
>>>>>>> 7f922b040 (GEOMESA-3067 Find attribute in Filters with Functions with embedded expressions correctly)
=======
>>>>>>> a910ae135 (GEOMESA-3061 Converters - support bytes in Avro top-level union types (#2762))
=======
>>>>>>> 8fb060734 (GEOMESA-3067 Find attribute in Filters with Functions with embedded expressions correctly)
=======
>>>>>>> ad3cedc4d (GEOMESA-3061 Converters - support bytes in Avro top-level union types (#2762))
=======
>>>>>>> bc4913194 (GEOMESA-3067 Find attribute in Filters with Functions with embedded expressions correctly)
=======
>>>>>>> bdbced26d (GEOMESA-3061 Converters - support bytes in Avro top-level union types (#2762))
=======
>>>>>>> 1b25d7ddb (Merge branch 'feature/postgis-fixes')
=======
>>>>>>> 20f6826d0f (GEOMESA-3067 Find attribute in Filters with Functions with embedded expressions correctly)
=======
>>>>>>> 4c361f07da (GEOMESA-3061 Converters - support bytes in Avro top-level union types (#2762))
=======
>>>>>>> 125ffd0575 (GEOMESA-3067 Find attribute in Filters with Functions with embedded expressions correctly)
=======
>>>>>>> f302a54949 (GEOMESA-3061 Converters - support bytes in Avro top-level union types (#2762))
=======
>>>>>>> a83fe4cf7c (GEOMESA-3067 Find attribute in Filters with Functions with embedded expressions correctly)
=======
>>>>>>> a788dfac03 (GEOMESA-3061 Converters - support bytes in Avro top-level union types (#2762))
=======
>>>>>>> da00c7bd68 (Merge branch 'feature/postgis-fixes')
=======
>>>>>>> f7cef54062 (GEOMESA-3061 Converters - support bytes in Avro top-level union types (#2762))
=======
>>>>>>> 3333975e77 (GEOMESA-3067 Find attribute in Filters with Functions with embedded expressions correctly)
=======
>>>>>>> 76618c8da3 (GEOMESA-3061 Converters - support bytes in Avro top-level union types (#2762))
=======
>>>>>>> c3b0a1b6e3 (GEOMESA-3067 Find attribute in Filters with Functions with embedded expressions correctly)
=======
>>>>>>> c8a325e13c (GEOMESA-3061 Converters - support bytes in Avro top-level union types (#2762))
=======
>>>>>>> 9638dc731e (GEOMESA-3067 Find attribute in Filters with Functions with embedded expressions correctly)
=======
>>>>>>> 97ec7d864a (GEOMESA-3061 Converters - support bytes in Avro top-level union types (#2762))
=======
>>>>>>> db8d998aa2 (Merge branch 'feature/postgis-fixes')
=======
>>>>>>> 7f922b040c (GEOMESA-3067 Find attribute in Filters with Functions with embedded expressions correctly)
=======
>>>>>>> a910ae135f (GEOMESA-3061 Converters - support bytes in Avro top-level union types (#2762))
=======
>>>>>>> 8fb0607344 (GEOMESA-3067 Find attribute in Filters with Functions with embedded expressions correctly)
=======
>>>>>>> ad3cedc4db (GEOMESA-3061 Converters - support bytes in Avro top-level union types (#2762))
=======
>>>>>>> bc49131942 (GEOMESA-3067 Find attribute in Filters with Functions with embedded expressions correctly)
=======
>>>>>>> bdbced26d4 (GEOMESA-3061 Converters - support bytes in Avro top-level union types (#2762))
=======
>>>>>>> 1b25d7ddb4 (Merge branch 'feature/postgis-fixes')
=======
>>>>>>> 0dbede148d (GEOMESA-3061 Converters - support bytes in Avro top-level union types (#2762))
=======
>>>>>>> 22dcc8170f (GEOMESA-3061 Converters - support bytes in Avro top-level union types (#2762))
=======
=======
>>>>>>> 238945d4b3 (GEOMESA-3061 Converters - support bytes in Avro top-level union types (#2762))
=======
>>>>>>> bc4062951d (GEOMESA-3061 Converters - support bytes in Avro top-level union types (#2762))
=======
>>>>>>> 45ad5d11f (GEOMESA-3061 Converters - support bytes in Avro top-level union types (#2762))
>>>>>>> b009fd23f4 (GEOMESA-3061 Converters - support bytes in Avro top-level union types (#2762))
=======
>>>>>>> dace2085b (GEOMESA-3061 Converters - support bytes in Avro top-level union types (#2762))
=======
>>>>>>> 516fe7e9c (GEOMESA-3061 Converters - support bytes in Avro top-level union types (#2762))
=======
>>>>>>> cdb410251 (GEOMESA-3061 Converters - support bytes in Avro top-level union types (#2762))
>>>>>>> 67b361c856 (GEOMESA-3061 Converters - support bytes in Avro top-level union types (#2762))
=======
<<<<<<< HEAD
<<<<<<< HEAD
<<<<<<< HEAD
<<<<<<< HEAD
<<<<<<< HEAD
<<<<<<< HEAD
=======
>>>>>>> 988874c83e (GEOMESA-3061 Converters - support bytes in Avro top-level union types (#2762))
=======
>>>>>>> adfec3a47a (GEOMESA-3067 Find attribute in Filters with Functions with embedded expressions correctly)
>>>>>>> e182e6e99c (GEOMESA-3067 Find attribute in Filters with Functions with embedded expressions correctly)
=======
=======
>>>>>>> cdb410251 (GEOMESA-3061 Converters - support bytes in Avro top-level union types (#2762))
>>>>>>> 9d708b240a (GEOMESA-3061 Converters - support bytes in Avro top-level union types (#2762))
=======
<<<<<<< HEAD
<<<<<<< HEAD
<<<<<<< HEAD
<<<<<<< HEAD
<<<<<<< HEAD
<<<<<<< HEAD
>>>>>>> 0e68e9f4c (GEOMESA-3061 Converters - support bytes in Avro top-level union types (#2762))
=======
>>>>>>> a63cb7e74 (GEOMESA-3067 Find attribute in Filters with Functions with embedded expressions correctly)
=======
<<<<<<< HEAD
<<<<<<< HEAD
<<<<<<< HEAD
<<<<<<< HEAD
=======
>>>>>>> 6cd1151639 (GEOMESA-3061 Converters - support bytes in Avro top-level union types (#2762))
=======
>>>>>>> 94fecee1d8 (GEOMESA-3061 Converters - support bytes in Avro top-level union types (#2762))
=======
>>>>>>> cdb410251 (GEOMESA-3061 Converters - support bytes in Avro top-level union types (#2762))
>>>>>>> 67b361c85 (GEOMESA-3061 Converters - support bytes in Avro top-level union types (#2762))
=======
<<<<<<< HEAD
<<<<<<< HEAD
>>>>>>> b4320946b (GEOMESA-3061 Converters - support bytes in Avro top-level union types (#2762))
=======
>>>>>>> e5ed68fdd3 (GEOMESA-3067 Find attribute in Filters with Functions with embedded expressions correctly)
=======
=======
>>>>>>> cdb410251 (GEOMESA-3061 Converters - support bytes in Avro top-level union types (#2762))
>>>>>>> e6e1f4bdd5 (GEOMESA-3061 Converters - support bytes in Avro top-level union types (#2762))
=======
>>>>>>> 0e68e9f4c (GEOMESA-3061 Converters - support bytes in Avro top-level union types (#2762))
=======
<<<<<<< HEAD
<<<<<<< HEAD
<<<<<<< HEAD
<<<<<<< HEAD
>>>>>>> a63cb7e74 (GEOMESA-3067 Find attribute in Filters with Functions with embedded expressions correctly)
=======
=======
>>>>>>> cdb410251 (GEOMESA-3061 Converters - support bytes in Avro top-level union types (#2762))
>>>>>>> 67b361c85 (GEOMESA-3061 Converters - support bytes in Avro top-level union types (#2762))
=======
<<<<<<< HEAD
<<<<<<< HEAD
<<<<<<< HEAD
<<<<<<< HEAD
<<<<<<< HEAD
<<<<<<< HEAD
=======
>>>>>>> c9328eddce (GEOMESA-3061 Converters - support bytes in Avro top-level union types (#2762))
=======
>>>>>>> d94c03a98e (GEOMESA-3061 Converters - support bytes in Avro top-level union types (#2762))
=======
>>>>>>> 9abc630fdf (GEOMESA-3061 Converters - support bytes in Avro top-level union types (#2762))
=======
>>>>>>> 25063957fc (GEOMESA-3061 Converters - support bytes in Avro top-level union types (#2762))
>>>>>>> b4320946b (GEOMESA-3061 Converters - support bytes in Avro top-level union types (#2762))
=======
<<<<<<< HEAD
>>>>>>> 87bf55340 (GEOMESA-3061 Converters - support bytes in Avro top-level union types (#2762))
=======
=======
>>>>>>> cdb410251 (GEOMESA-3061 Converters - support bytes in Avro top-level union types (#2762))
>>>>>>> 240977229 (GEOMESA-3061 Converters - support bytes in Avro top-level union types (#2762))
=======
=======
>>>>>>> 45ad5d11f (GEOMESA-3061 Converters - support bytes in Avro top-level union types (#2762))
=======
>>>>>>> dace2085b (GEOMESA-3061 Converters - support bytes in Avro top-level union types (#2762))
=======
>>>>>>> b4320946b (GEOMESA-3061 Converters - support bytes in Avro top-level union types (#2762))
=======
>>>>>>> 516fe7e9c (GEOMESA-3061 Converters - support bytes in Avro top-level union types (#2762))
=======
>>>>>>> d9ed077cd (GEOMESA-3061 Converters - support bytes in Avro top-level union types (#2762))
=======
<<<<<<< HEAD
>>>>>>> 81ee66102b (GEOMESA-3061 Converters - support bytes in Avro top-level union types (#2762))
=======
>>>>>>> e182e6e99 (GEOMESA-3067 Find attribute in Filters with Functions with embedded expressions correctly)
=======
<<<<<<< HEAD
>>>>>>> 9943e05ec9 (GEOMESA-3067 Find attribute in Filters with Functions with embedded expressions correctly)
=======
=======
>>>>>>> cdb410251 (GEOMESA-3061 Converters - support bytes in Avro top-level union types (#2762))
>>>>>>> 9d708b240 (GEOMESA-3061 Converters - support bytes in Avro top-level union types (#2762))
=======
<<<<<<< HEAD
>>>>>>> 53a3e72cbf (GEOMESA-3061 Converters - support bytes in Avro top-level union types (#2762))
=======
=======
>>>>>>> 76618c8da (GEOMESA-3061 Converters - support bytes in Avro top-level union types (#2762))
<<<<<<< HEAD
>>>>>>> 947761ec9b (GEOMESA-3061 Converters - support bytes in Avro top-level union types (#2762))
=======
=======
>>>>>>> a63cb7e74 (GEOMESA-3067 Find attribute in Filters with Functions with embedded expressions correctly)
=======
>>>>>>> c3b0a1b6e (GEOMESA-3067 Find attribute in Filters with Functions with embedded expressions correctly)
<<<<<<< HEAD
>>>>>>> 9813375fcc (GEOMESA-3067 Find attribute in Filters with Functions with embedded expressions correctly)
=======
=======
>>>>>>> c8a325e13 (GEOMESA-3061 Converters - support bytes in Avro top-level union types (#2762))
<<<<<<< HEAD
>>>>>>> c9328eddce (GEOMESA-3061 Converters - support bytes in Avro top-level union types (#2762))
=======
=======
>>>>>>> b4320946b (GEOMESA-3061 Converters - support bytes in Avro top-level union types (#2762))
=======
>>>>>>> 97ec7d864 (GEOMESA-3061 Converters - support bytes in Avro top-level union types (#2762))
<<<<<<< HEAD
>>>>>>> d94c03a98e (GEOMESA-3061 Converters - support bytes in Avro top-level union types (#2762))
=======
=======
>>>>>>> a910ae135 (GEOMESA-3061 Converters - support bytes in Avro top-level union types (#2762))
<<<<<<< HEAD
>>>>>>> 07161eaaa6 (GEOMESA-3061 Converters - support bytes in Avro top-level union types (#2762))
=======
=======
>>>>>>> a63cb7e74 (GEOMESA-3067 Find attribute in Filters with Functions with embedded expressions correctly)
=======
>>>>>>> 8fb060734 (GEOMESA-3067 Find attribute in Filters with Functions with embedded expressions correctly)
<<<<<<< HEAD
>>>>>>> 38b3282770 (GEOMESA-3067 Find attribute in Filters with Functions with embedded expressions correctly)
=======
=======
>>>>>>> ad3cedc4d (GEOMESA-3061 Converters - support bytes in Avro top-level union types (#2762))
<<<<<<< HEAD
>>>>>>> 9abc630fdf (GEOMESA-3061 Converters - support bytes in Avro top-level union types (#2762))
=======
=======
>>>>>>> b4320946b (GEOMESA-3061 Converters - support bytes in Avro top-level union types (#2762))
=======
>>>>>>> bdbced26d (GEOMESA-3061 Converters - support bytes in Avro top-level union types (#2762))
>>>>>>> 25063957fc (GEOMESA-3061 Converters - support bytes in Avro top-level union types (#2762))
=======
>>>>>>> a9884ff1f6 (GEOMESA-3067 Find attribute in Filters with Functions with embedded expressions correctly)
=======
>>>>>>> f7cef54062 (GEOMESA-3061 Converters - support bytes in Avro top-level union types (#2762))
=======
>>>>>>> e182e6e99c (GEOMESA-3067 Find attribute in Filters with Functions with embedded expressions correctly)
=======
>>>>>>> 2571e49519 (GEOMESA-3067 Find attribute in Filters with Functions with embedded expressions correctly)
=======
>>>>>>> d206a68a13 (GEOMESA-3061 Converters - support bytes in Avro top-level union types (#2762))
=======
>>>>>>> 0e68e9f4c (GEOMESA-3061 Converters - support bytes in Avro top-level union types (#2762))
=======
>>>>>>> 694bcd3776 (GEOMESA-3061 Converters - support bytes in Avro top-level union types (#2762))
=======
>>>>>>> 24c4df93a5 (GEOMESA-3067 Find attribute in Filters with Functions with embedded expressions correctly)
=======
>>>>>>> 6cd1151639 (GEOMESA-3061 Converters - support bytes in Avro top-level union types (#2762))
=======
>>>>>>> 657a38673a (GEOMESA-3067 Find attribute in Filters with Functions with embedded expressions correctly)
=======
>>>>>>> e8b736ee96 (GEOMESA-3061 Converters - support bytes in Avro top-level union types (#2762))
=======
>>>>>>> e182e6e99c (GEOMESA-3067 Find attribute in Filters with Functions with embedded expressions correctly)
=======
>>>>>>> cd4422a10c (GEOMESA-3067 Find attribute in Filters with Functions with embedded expressions correctly)
=======
>>>>>>> a5b160f47b (GEOMESA-3061 Converters - support bytes in Avro top-level union types (#2762))
=======
>>>>>>> 0e68e9f4c (GEOMESA-3061 Converters - support bytes in Avro top-level union types (#2762))
=======
>>>>>>> 5cf31d21f3 (GEOMESA-3061 Converters - support bytes in Avro top-level union types (#2762))
=======
>>>>>>> def2794bb5 (GEOMESA-3067 Find attribute in Filters with Functions with embedded expressions correctly)
=======
>>>>>>> 94fecee1d8 (GEOMESA-3061 Converters - support bytes in Avro top-level union types (#2762))
>>>>>>> 7acc3ea46 (GEOMESA-3067 Find attribute in Filters with Functions with embedded expressions correctly)
=======
>>>>>>> b9bdd406e (GEOMESA-3061 Converters - support bytes in Avro top-level union types (#2762))
<<<<<<< HEAD
<<<<<<< HEAD
<<<<<<< HEAD
<<<<<<< HEAD
<<<<<<< HEAD
<<<<<<< HEAD
<<<<<<< HEAD
<<<<<<< HEAD
<<<<<<< HEAD
<<<<<<< HEAD
<<<<<<< HEAD
<<<<<<< HEAD
<<<<<<< HEAD
<<<<<<< HEAD
<<<<<<< HEAD
<<<<<<< HEAD
<<<<<<< HEAD
<<<<<<< HEAD
<<<<<<< HEAD
<<<<<<< HEAD
<<<<<<< HEAD
<<<<<<< HEAD
<<<<<<< HEAD
<<<<<<< HEAD
<<<<<<< HEAD
<<<<<<< HEAD
<<<<<<< HEAD
<<<<<<< HEAD
<<<<<<< HEAD
<<<<<<< HEAD
<<<<<<< HEAD
<<<<<<< HEAD
<<<<<<< HEAD
<<<<<<< HEAD
<<<<<<< HEAD
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
>>>>>>> a9884ff1f6 (GEOMESA-3067 Find attribute in Filters with Functions with embedded expressions correctly)
=======
>>>>>>> f7cef54062 (GEOMESA-3061 Converters - support bytes in Avro top-level union types (#2762))
=======
>>>>>>> 2571e49519 (GEOMESA-3067 Find attribute in Filters with Functions with embedded expressions correctly)
=======
>>>>>>> d206a68a13 (GEOMESA-3061 Converters - support bytes in Avro top-level union types (#2762))
=======
>>>>>>> 694bcd3776 (GEOMESA-3061 Converters - support bytes in Avro top-level union types (#2762))
=======
>>>>>>> 24c4df93a5 (GEOMESA-3067 Find attribute in Filters with Functions with embedded expressions correctly)
=======
>>>>>>> 6cd1151639 (GEOMESA-3061 Converters - support bytes in Avro top-level union types (#2762))
=======
>>>>>>> 657a38673a (GEOMESA-3067 Find attribute in Filters with Functions with embedded expressions correctly)
=======
>>>>>>> e8b736ee96 (GEOMESA-3061 Converters - support bytes in Avro top-level union types (#2762))
=======
>>>>>>> a5b160f47b (GEOMESA-3061 Converters - support bytes in Avro top-level union types (#2762))
=======
>>>>>>> 5cf31d21f3 (GEOMESA-3061 Converters - support bytes in Avro top-level union types (#2762))
=======
>>>>>>> def2794bb5 (GEOMESA-3067 Find attribute in Filters with Functions with embedded expressions correctly)
=======
>>>>>>> 94fecee1d8 (GEOMESA-3061 Converters - support bytes in Avro top-level union types (#2762))
>>>>>>> cdb4102515 (GEOMESA-3061 Converters - support bytes in Avro top-level union types (#2762))
=======
=======
>>>>>>> 7acc3ea46 (GEOMESA-3067 Find attribute in Filters with Functions with embedded expressions correctly)
>>>>>>> e3a63fee18 (GEOMESA-3067 Find attribute in Filters with Functions with embedded expressions correctly)
=======
=======
>>>>>>> ef1a0521bd (GEOMESA-3067 Find attribute in Filters with Functions with embedded expressions correctly)
=======
=======
>>>>>>> cdb410251 (GEOMESA-3061 Converters - support bytes in Avro top-level union types (#2762))
>>>>>>> c3c5dd0ebb (GEOMESA-3061 Converters - support bytes in Avro top-level union types (#2762))
=======
>>>>>>> 0e68e9f4c (GEOMESA-3061 Converters - support bytes in Avro top-level union types (#2762))
=======
>>>>>>> a63cb7e74 (GEOMESA-3067 Find attribute in Filters with Functions with embedded expressions correctly)
=======
=======
>>>>>>> cdb410251 (GEOMESA-3061 Converters - support bytes in Avro top-level union types (#2762))
>>>>>>> 67b361c85 (GEOMESA-3061 Converters - support bytes in Avro top-level union types (#2762))
=======
>>>>>>> b4320946b (GEOMESA-3061 Converters - support bytes in Avro top-level union types (#2762))
<<<<<<< HEAD
<<<<<<< HEAD
<<<<<<< HEAD
=======
=======
>>>>>>> e5ed68fdd3 (GEOMESA-3067 Find attribute in Filters with Functions with embedded expressions correctly)
=======
=======
>>>>>>> cdb410251 (GEOMESA-3061 Converters - support bytes in Avro top-level union types (#2762))
>>>>>>> e6e1f4bdd5 (GEOMESA-3061 Converters - support bytes in Avro top-level union types (#2762))
=======
>>>>>>> 0e68e9f4c (GEOMESA-3061 Converters - support bytes in Avro top-level union types (#2762))
=======
<<<<<<< HEAD
<<<<<<< HEAD
<<<<<<< HEAD
<<<<<<< HEAD
>>>>>>> a63cb7e74 (GEOMESA-3067 Find attribute in Filters with Functions with embedded expressions correctly)
=======
=======
>>>>>>> cdb410251 (GEOMESA-3061 Converters - support bytes in Avro top-level union types (#2762))
>>>>>>> 67b361c85 (GEOMESA-3061 Converters - support bytes in Avro top-level union types (#2762))
=======
<<<<<<< HEAD
<<<<<<< HEAD
<<<<<<< HEAD
<<<<<<< HEAD
<<<<<<< HEAD
<<<<<<< HEAD
=======
>>>>>>> c9328eddce (GEOMESA-3061 Converters - support bytes in Avro top-level union types (#2762))
=======
>>>>>>> d94c03a98e (GEOMESA-3061 Converters - support bytes in Avro top-level union types (#2762))
=======
>>>>>>> 9abc630fdf (GEOMESA-3061 Converters - support bytes in Avro top-level union types (#2762))
=======
>>>>>>> 25063957fc (GEOMESA-3061 Converters - support bytes in Avro top-level union types (#2762))
>>>>>>> b4320946b (GEOMESA-3061 Converters - support bytes in Avro top-level union types (#2762))
=======
<<<<<<< HEAD
>>>>>>> 87bf55340 (GEOMESA-3061 Converters - support bytes in Avro top-level union types (#2762))
=======
=======
>>>>>>> cdb410251 (GEOMESA-3061 Converters - support bytes in Avro top-level union types (#2762))
>>>>>>> 240977229 (GEOMESA-3061 Converters - support bytes in Avro top-level union types (#2762))
=======
=======
>>>>>>> 45ad5d11f (GEOMESA-3061 Converters - support bytes in Avro top-level union types (#2762))
=======
>>>>>>> dace2085b (GEOMESA-3061 Converters - support bytes in Avro top-level union types (#2762))
=======
>>>>>>> b4320946b (GEOMESA-3061 Converters - support bytes in Avro top-level union types (#2762))
=======
>>>>>>> 516fe7e9c (GEOMESA-3061 Converters - support bytes in Avro top-level union types (#2762))
=======
>>>>>>> d9ed077cd (GEOMESA-3061 Converters - support bytes in Avro top-level union types (#2762))
=======
<<<<<<< HEAD
>>>>>>> 81ee66102b (GEOMESA-3061 Converters - support bytes in Avro top-level union types (#2762))
=======
>>>>>>> e182e6e99 (GEOMESA-3067 Find attribute in Filters with Functions with embedded expressions correctly)
=======
<<<<<<< HEAD
>>>>>>> 9943e05ec9 (GEOMESA-3067 Find attribute in Filters with Functions with embedded expressions correctly)
=======
=======
>>>>>>> cdb410251 (GEOMESA-3061 Converters - support bytes in Avro top-level union types (#2762))
>>>>>>> 9d708b240 (GEOMESA-3061 Converters - support bytes in Avro top-level union types (#2762))
=======
<<<<<<< HEAD
>>>>>>> 53a3e72cbf (GEOMESA-3061 Converters - support bytes in Avro top-level union types (#2762))
=======
=======
>>>>>>> 76618c8da (GEOMESA-3061 Converters - support bytes in Avro top-level union types (#2762))
<<<<<<< HEAD
>>>>>>> 947761ec9b (GEOMESA-3061 Converters - support bytes in Avro top-level union types (#2762))
=======
=======
>>>>>>> a63cb7e74 (GEOMESA-3067 Find attribute in Filters with Functions with embedded expressions correctly)
=======
>>>>>>> c3b0a1b6e (GEOMESA-3067 Find attribute in Filters with Functions with embedded expressions correctly)
<<<<<<< HEAD
>>>>>>> 9813375fcc (GEOMESA-3067 Find attribute in Filters with Functions with embedded expressions correctly)
=======
=======
>>>>>>> c8a325e13 (GEOMESA-3061 Converters - support bytes in Avro top-level union types (#2762))
<<<<<<< HEAD
>>>>>>> c9328eddce (GEOMESA-3061 Converters - support bytes in Avro top-level union types (#2762))
=======
=======
>>>>>>> b4320946b (GEOMESA-3061 Converters - support bytes in Avro top-level union types (#2762))
=======
>>>>>>> 97ec7d864 (GEOMESA-3061 Converters - support bytes in Avro top-level union types (#2762))
<<<<<<< HEAD
>>>>>>> d94c03a98e (GEOMESA-3061 Converters - support bytes in Avro top-level union types (#2762))
=======
=======
>>>>>>> a910ae135 (GEOMESA-3061 Converters - support bytes in Avro top-level union types (#2762))
<<<<<<< HEAD
>>>>>>> 07161eaaa6 (GEOMESA-3061 Converters - support bytes in Avro top-level union types (#2762))
=======
=======
>>>>>>> a63cb7e74 (GEOMESA-3067 Find attribute in Filters with Functions with embedded expressions correctly)
=======
>>>>>>> 8fb060734 (GEOMESA-3067 Find attribute in Filters with Functions with embedded expressions correctly)
<<<<<<< HEAD
>>>>>>> 38b3282770 (GEOMESA-3067 Find attribute in Filters with Functions with embedded expressions correctly)
=======
=======
>>>>>>> ad3cedc4d (GEOMESA-3061 Converters - support bytes in Avro top-level union types (#2762))
<<<<<<< HEAD
>>>>>>> 9abc630fdf (GEOMESA-3061 Converters - support bytes in Avro top-level union types (#2762))
=======
=======
>>>>>>> b4320946b (GEOMESA-3061 Converters - support bytes in Avro top-level union types (#2762))
=======
>>>>>>> bdbced26d (GEOMESA-3061 Converters - support bytes in Avro top-level union types (#2762))
>>>>>>> 25063957fc (GEOMESA-3061 Converters - support bytes in Avro top-level union types (#2762))
=======
=======
>>>>>>> 4599715c51 (d)
=======
=======
>>>>>>> b08cb4d818 (GEOMESA-3061 Converters - support bytes in Avro top-level union types (#2762))
>>>>>>> 7acc3ea46 (GEOMESA-3067 Find attribute in Filters with Functions with embedded expressions correctly)
=======
>>>>>>> b9bdd406e (GEOMESA-3061 Converters - support bytes in Avro top-level union types (#2762))
<<<<<<< HEAD
<<<<<<< HEAD
<<<<<<< HEAD
<<<<<<< HEAD
<<<<<<< HEAD
<<<<<<< HEAD
<<<<<<< HEAD
<<<<<<< HEAD
<<<<<<< HEAD
<<<<<<< HEAD
<<<<<<< HEAD
<<<<<<< HEAD
<<<<<<< HEAD
<<<<<<< HEAD
<<<<<<< HEAD
<<<<<<< HEAD
<<<<<<< HEAD
<<<<<<< HEAD
<<<<<<< HEAD
<<<<<<< HEAD
<<<<<<< HEAD
<<<<<<< HEAD
<<<<<<< HEAD
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
>>>>>>> cd4422a10c (GEOMESA-3067 Find attribute in Filters with Functions with embedded expressions correctly)
=======
>>>>>>> 4599715c51 (d)
>>>>>>> cdb4102515 (GEOMESA-3061 Converters - support bytes in Avro top-level union types (#2762))
=======
=======
>>>>>>> 7acc3ea46 (GEOMESA-3067 Find attribute in Filters with Functions with embedded expressions correctly)
>>>>>>> e3a63fee18 (GEOMESA-3067 Find attribute in Filters with Functions with embedded expressions correctly)
=======
>>>>>>> 1973f72e77 (GEOMESA-3061 Converters - support bytes in Avro top-level union types (#2762))
=======
>>>>>>> ef1a0521bd (GEOMESA-3067 Find attribute in Filters with Functions with embedded expressions correctly)
=======
=======
>>>>>>> cdb410251 (GEOMESA-3061 Converters - support bytes in Avro top-level union types (#2762))
>>>>>>> c3c5dd0ebb (GEOMESA-3061 Converters - support bytes in Avro top-level union types (#2762))
=======
=======
>>>>>>> e0c2527549 (GEOMESA-3061 Converters - support bytes in Avro top-level union types (#2762))
=======
>>>>>>> cb5e2daf2b (GEOMESA-3061 Converters - support bytes in Avro top-level union types (#2762))
>>>>>>> 0e68e9f4c (GEOMESA-3061 Converters - support bytes in Avro top-level union types (#2762))
=======
>>>>>>> a63cb7e74 (GEOMESA-3067 Find attribute in Filters with Functions with embedded expressions correctly)
=======
<<<<<<< HEAD
<<<<<<< HEAD
=======
>>>>>>> 6cd1151639 (GEOMESA-3061 Converters - support bytes in Avro top-level union types (#2762))
=======
>>>>>>> cdb410251 (GEOMESA-3061 Converters - support bytes in Avro top-level union types (#2762))
>>>>>>> 67b361c85 (GEOMESA-3061 Converters - support bytes in Avro top-level union types (#2762))
=======
<<<<<<< HEAD
>>>>>>> b4320946b (GEOMESA-3061 Converters - support bytes in Avro top-level union types (#2762))
=======
>>>>>>> e5ed68fdd3 (GEOMESA-3067 Find attribute in Filters with Functions with embedded expressions correctly)
=======
=======
>>>>>>> cdb410251 (GEOMESA-3061 Converters - support bytes in Avro top-level union types (#2762))
>>>>>>> e6e1f4bdd5 (GEOMESA-3061 Converters - support bytes in Avro top-level union types (#2762))
=======
>>>>>>> 0e68e9f4c (GEOMESA-3061 Converters - support bytes in Avro top-level union types (#2762))
=======
<<<<<<< HEAD
<<<<<<< HEAD
<<<<<<< HEAD
<<<<<<< HEAD
>>>>>>> a63cb7e74 (GEOMESA-3067 Find attribute in Filters with Functions with embedded expressions correctly)
=======
=======
>>>>>>> cdb410251 (GEOMESA-3061 Converters - support bytes in Avro top-level union types (#2762))
>>>>>>> 67b361c85 (GEOMESA-3061 Converters - support bytes in Avro top-level union types (#2762))
=======
<<<<<<< HEAD
<<<<<<< HEAD
<<<<<<< HEAD
<<<<<<< HEAD
<<<<<<< HEAD
<<<<<<< HEAD
=======
>>>>>>> c9328eddce (GEOMESA-3061 Converters - support bytes in Avro top-level union types (#2762))
=======
>>>>>>> d94c03a98e (GEOMESA-3061 Converters - support bytes in Avro top-level union types (#2762))
=======
>>>>>>> 9abc630fdf (GEOMESA-3061 Converters - support bytes in Avro top-level union types (#2762))
=======
>>>>>>> 25063957fc (GEOMESA-3061 Converters - support bytes in Avro top-level union types (#2762))
>>>>>>> b4320946b (GEOMESA-3061 Converters - support bytes in Avro top-level union types (#2762))
=======
<<<<<<< HEAD
>>>>>>> 87bf55340 (GEOMESA-3061 Converters - support bytes in Avro top-level union types (#2762))
=======
=======
>>>>>>> cdb410251 (GEOMESA-3061 Converters - support bytes in Avro top-level union types (#2762))
>>>>>>> 240977229 (GEOMESA-3061 Converters - support bytes in Avro top-level union types (#2762))
=======
=======
>>>>>>> 45ad5d11f (GEOMESA-3061 Converters - support bytes in Avro top-level union types (#2762))
=======
>>>>>>> dace2085b (GEOMESA-3061 Converters - support bytes in Avro top-level union types (#2762))
=======
>>>>>>> b4320946b (GEOMESA-3061 Converters - support bytes in Avro top-level union types (#2762))
=======
>>>>>>> 516fe7e9c (GEOMESA-3061 Converters - support bytes in Avro top-level union types (#2762))
=======
>>>>>>> d9ed077cd (GEOMESA-3061 Converters - support bytes in Avro top-level union types (#2762))
=======
<<<<<<< HEAD
>>>>>>> 81ee66102b (GEOMESA-3061 Converters - support bytes in Avro top-level union types (#2762))
=======
>>>>>>> e182e6e99 (GEOMESA-3067 Find attribute in Filters with Functions with embedded expressions correctly)
=======
<<<<<<< HEAD
>>>>>>> 9943e05ec9 (GEOMESA-3067 Find attribute in Filters with Functions with embedded expressions correctly)
=======
=======
>>>>>>> cdb410251 (GEOMESA-3061 Converters - support bytes in Avro top-level union types (#2762))
>>>>>>> 9d708b240 (GEOMESA-3061 Converters - support bytes in Avro top-level union types (#2762))
=======
<<<<<<< HEAD
>>>>>>> 53a3e72cbf (GEOMESA-3061 Converters - support bytes in Avro top-level union types (#2762))
=======
=======
>>>>>>> 76618c8da (GEOMESA-3061 Converters - support bytes in Avro top-level union types (#2762))
<<<<<<< HEAD
>>>>>>> 947761ec9b (GEOMESA-3061 Converters - support bytes in Avro top-level union types (#2762))
=======
=======
>>>>>>> a63cb7e74 (GEOMESA-3067 Find attribute in Filters with Functions with embedded expressions correctly)
=======
>>>>>>> c3b0a1b6e (GEOMESA-3067 Find attribute in Filters with Functions with embedded expressions correctly)
<<<<<<< HEAD
>>>>>>> 9813375fcc (GEOMESA-3067 Find attribute in Filters with Functions with embedded expressions correctly)
=======
=======
>>>>>>> c8a325e13 (GEOMESA-3061 Converters - support bytes in Avro top-level union types (#2762))
<<<<<<< HEAD
>>>>>>> c9328eddce (GEOMESA-3061 Converters - support bytes in Avro top-level union types (#2762))
=======
=======
>>>>>>> b4320946b (GEOMESA-3061 Converters - support bytes in Avro top-level union types (#2762))
=======
>>>>>>> 97ec7d864 (GEOMESA-3061 Converters - support bytes in Avro top-level union types (#2762))
<<<<<<< HEAD
>>>>>>> d94c03a98e (GEOMESA-3061 Converters - support bytes in Avro top-level union types (#2762))
=======
=======
>>>>>>> a910ae135 (GEOMESA-3061 Converters - support bytes in Avro top-level union types (#2762))
<<<<<<< HEAD
>>>>>>> 07161eaaa6 (GEOMESA-3061 Converters - support bytes in Avro top-level union types (#2762))
=======
=======
>>>>>>> a63cb7e74 (GEOMESA-3067 Find attribute in Filters with Functions with embedded expressions correctly)
=======
>>>>>>> 8fb060734 (GEOMESA-3067 Find attribute in Filters with Functions with embedded expressions correctly)
<<<<<<< HEAD
>>>>>>> 38b3282770 (GEOMESA-3067 Find attribute in Filters with Functions with embedded expressions correctly)
=======
=======
>>>>>>> ad3cedc4d (GEOMESA-3061 Converters - support bytes in Avro top-level union types (#2762))
<<<<<<< HEAD
>>>>>>> 9abc630fdf (GEOMESA-3061 Converters - support bytes in Avro top-level union types (#2762))
=======
=======
>>>>>>> b4320946b (GEOMESA-3061 Converters - support bytes in Avro top-level union types (#2762))
=======
>>>>>>> bdbced26d (GEOMESA-3061 Converters - support bytes in Avro top-level union types (#2762))
>>>>>>> 25063957fc (GEOMESA-3061 Converters - support bytes in Avro top-level union types (#2762))
=======
>>>>>>> a9884ff1f6 (GEOMESA-3067 Find attribute in Filters with Functions with embedded expressions correctly)
=======
>>>>>>> f7cef54062 (GEOMESA-3061 Converters - support bytes in Avro top-level union types (#2762))
=======
>>>>>>> e182e6e99c (GEOMESA-3067 Find attribute in Filters with Functions with embedded expressions correctly)
=======
>>>>>>> 2571e49519 (GEOMESA-3067 Find attribute in Filters with Functions with embedded expressions correctly)
=======
>>>>>>> d206a68a13 (GEOMESA-3061 Converters - support bytes in Avro top-level union types (#2762))
=======
>>>>>>> 0e68e9f4c (GEOMESA-3061 Converters - support bytes in Avro top-level union types (#2762))
=======
>>>>>>> 694bcd3776 (GEOMESA-3061 Converters - support bytes in Avro top-level union types (#2762))
=======
>>>>>>> 24c4df93a5 (GEOMESA-3067 Find attribute in Filters with Functions with embedded expressions correctly)
=======
>>>>>>> 6cd1151639 (GEOMESA-3061 Converters - support bytes in Avro top-level union types (#2762))
>>>>>>> 7acc3ea46 (GEOMESA-3067 Find attribute in Filters with Functions with embedded expressions correctly)
=======
>>>>>>> b9bdd406e (GEOMESA-3061 Converters - support bytes in Avro top-level union types (#2762))
<<<<<<< HEAD
<<<<<<< HEAD
<<<<<<< HEAD
<<<<<<< HEAD
<<<<<<< HEAD
<<<<<<< HEAD
<<<<<<< HEAD
<<<<<<< HEAD
<<<<<<< HEAD
<<<<<<< HEAD
<<<<<<< HEAD
<<<<<<< HEAD
<<<<<<< HEAD
<<<<<<< HEAD
<<<<<<< HEAD
<<<<<<< HEAD
<<<<<<< HEAD
<<<<<<< HEAD
<<<<<<< HEAD
<<<<<<< HEAD
<<<<<<< HEAD
<<<<<<< HEAD
<<<<<<< HEAD
<<<<<<< HEAD
<<<<<<< HEAD
<<<<<<< HEAD
<<<<<<< HEAD
<<<<<<< HEAD
<<<<<<< HEAD
<<<<<<< HEAD
<<<<<<< HEAD
<<<<<<< HEAD
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
>>>>>>> 3eb12f79a9 (GEOMESA-3061 Converters - support bytes in Avro top-level union types (#2762))
=======
>>>>>>> 4ccd6f6b1f (GEOMESA-3061 Converters - support bytes in Avro top-level union types (#2762))
=======
>>>>>>> f983ea29f0 (GEOMESA-3067 Find attribute in Filters with Functions with embedded expressions correctly)
=======
>>>>>>> 35b69b8f2f (GEOMESA-3061 Converters - support bytes in Avro top-level union types (#2762))
=======
>>>>>>> db8a3a22b2 (GEOMESA-3061 Converters - support bytes in Avro top-level union types (#2762))
=======
>>>>>>> 27afb28ab6 (GEOMESA-3061 Converters - support bytes in Avro top-level union types (#2762))
=======
>>>>>>> 26a09ee6c2 (GEOMESA-3061 Converters - support bytes in Avro top-level union types (#2762))
=======
>>>>>>> 194ad4e5c0 (GEOMESA-3061 Converters - support bytes in Avro top-level union types (#2762))
=======
>>>>>>> 7b3c90c53f (GEOMESA-3061 Converters - support bytes in Avro top-level union types (#2762))
=======
>>>>>>> db9dfb6f14 (GEOMESA-3061 Converters - support bytes in Avro top-level union types (#2762))
=======
>>>>>>> b8ebbf6083 (GEOMESA-3061 Converters - support bytes in Avro top-level union types (#2762))
=======
>>>>>>> 1278241911 (GEOMESA-3067 Find attribute in Filters with Functions with embedded expressions correctly)
=======
>>>>>>> 3e7fb62639 (GEOMESA-3061 Converters - support bytes in Avro top-level union types (#2762))
=======
>>>>>>> c2cfc968d2 (GEOMESA-3061 Converters - support bytes in Avro top-level union types (#2762))
=======
>>>>>>> 5d8dab9f81 (GEOMESA-3067 Find attribute in Filters with Functions with embedded expressions correctly)
=======
>>>>>>> 0fa73844a1 (GEOMESA-3061 Converters - support bytes in Avro top-level union types (#2762))
=======
>>>>>>> 63546aacdc (GEOMESA-3061 Converters - support bytes in Avro top-level union types (#2762))
=======
>>>>>>> 9dbe1503e8 (GEOMESA-3061 Converters - support bytes in Avro top-level union types (#2762))
=======
>>>>>>> 53bc726472 (GEOMESA-3067 Find attribute in Filters with Functions with embedded expressions correctly)
=======
>>>>>>> 6e30236dd2 (GEOMESA-3061 Converters - support bytes in Avro top-level union types (#2762))
=======
>>>>>>> dbd932fed6 (GEOMESA-3061 Converters - support bytes in Avro top-level union types (#2762))
=======
=======
>>>>>>> a9884ff1f6 (GEOMESA-3067 Find attribute in Filters with Functions with embedded expressions correctly)
>>>>>>> 424e7de15a (GEOMESA-3067 Find attribute in Filters with Functions with embedded expressions correctly)
=======
=======
>>>>>>> adfec3a47a (GEOMESA-3067 Find attribute in Filters with Functions with embedded expressions correctly)
=======
>>>>>>> e0c2527549 (GEOMESA-3061 Converters - support bytes in Avro top-level union types (#2762))
=======
>>>>>>> cb5e2daf2b (GEOMESA-3061 Converters - support bytes in Avro top-level union types (#2762))
=======
>>>>>>> 9bcad1eb67 (GEOMESA-3067 Find attribute in Filters with Functions with embedded expressions correctly)
=======
>>>>>>> 00e61f4b70 (GEOMESA-3061 Converters - support bytes in Avro top-level union types (#2762))
=======
>>>>>>> a9884ff1f6 (GEOMESA-3067 Find attribute in Filters with Functions with embedded expressions correctly)
=======
>>>>>>> f7cef54062 (GEOMESA-3061 Converters - support bytes in Avro top-level union types (#2762))
<<<<<<< HEAD
>>>>>>> 988874c83e (GEOMESA-3061 Converters - support bytes in Avro top-level union types (#2762))
=======
=======
>>>>>>> 2571e49519 (GEOMESA-3067 Find attribute in Filters with Functions with embedded expressions correctly)
<<<<<<< HEAD
>>>>>>> adfec3a47a (GEOMESA-3067 Find attribute in Filters with Functions with embedded expressions correctly)
=======
=======
>>>>>>> d206a68a13 (GEOMESA-3061 Converters - support bytes in Avro top-level union types (#2762))
<<<<<<< HEAD
>>>>>>> e0c2527549 (GEOMESA-3061 Converters - support bytes in Avro top-level union types (#2762))
=======
=======
>>>>>>> 694bcd3776 (GEOMESA-3061 Converters - support bytes in Avro top-level union types (#2762))
<<<<<<< HEAD
>>>>>>> cb5e2daf2b (GEOMESA-3061 Converters - support bytes in Avro top-level union types (#2762))
=======
=======
>>>>>>> 24c4df93a5 (GEOMESA-3067 Find attribute in Filters with Functions with embedded expressions correctly)
<<<<<<< HEAD
>>>>>>> 9bcad1eb67 (GEOMESA-3067 Find attribute in Filters with Functions with embedded expressions correctly)
=======
=======
>>>>>>> 6cd1151639 (GEOMESA-3061 Converters - support bytes in Avro top-level union types (#2762))
>>>>>>> 00e61f4b70 (GEOMESA-3061 Converters - support bytes in Avro top-level union types (#2762))
>>>>>>> cdb4102515 (GEOMESA-3061 Converters - support bytes in Avro top-level union types (#2762))
>>>>>>> e582c3ecfe (GEOMESA-3067 Find attribute in Filters with Functions with embedded expressions correctly)
=======
>>>>>>> 530b057384 (GEOMESA-3067 Find attribute in Filters with Functions with embedded expressions correctly)
=======
>>>>>>> 2654d9c120 (GEOMESA-3061 Converters - support bytes in Avro top-level union types (#2762))
=======
>>>>>>> f110463a26 (GEOMESA-3061 Converters - support bytes in Avro top-level union types (#2762))
=======
<<<<<<< HEAD
>>>>>>> d83561962d (GEOMESA-3067 Find attribute in Filters with Functions with embedded expressions correctly)
=======
>>>>>>> 86ec77f9cb (GEOMESA-3061 Converters - support bytes in Avro top-level union types (#2762))
=======
>>>>>>> 1bcc513539 (GEOMESA-3061 Converters - support bytes in Avro top-level union types (#2762))
=======
>>>>>>> ef1a0521bd (GEOMESA-3067 Find attribute in Filters with Functions with embedded expressions correctly)
=======
=======
>>>>>>> cdb410251 (GEOMESA-3061 Converters - support bytes in Avro top-level union types (#2762))
>>>>>>> c3c5dd0ebb (GEOMESA-3061 Converters - support bytes in Avro top-level union types (#2762))
=======
>>>>>>> 0e68e9f4c (GEOMESA-3061 Converters - support bytes in Avro top-level union types (#2762))
=======
>>>>>>> a63cb7e74 (GEOMESA-3067 Find attribute in Filters with Functions with embedded expressions correctly)
=======
=======
>>>>>>> cdb410251 (GEOMESA-3061 Converters - support bytes in Avro top-level union types (#2762))
>>>>>>> 67b361c85 (GEOMESA-3061 Converters - support bytes in Avro top-level union types (#2762))
=======
<<<<<<< HEAD
=======
>>>>>>> b4320946b (GEOMESA-3061 Converters - support bytes in Avro top-level union types (#2762))
<<<<<<< HEAD
=======
=======
>>>>>>> e5ed68fdd3 (GEOMESA-3067 Find attribute in Filters with Functions with embedded expressions correctly)
=======
=======
>>>>>>> cdb410251 (GEOMESA-3061 Converters - support bytes in Avro top-level union types (#2762))
>>>>>>> e6e1f4bdd5 (GEOMESA-3061 Converters - support bytes in Avro top-level union types (#2762))
=======
>>>>>>> 0e68e9f4c (GEOMESA-3061 Converters - support bytes in Avro top-level union types (#2762))
=======
<<<<<<< HEAD
>>>>>>> a63cb7e74 (GEOMESA-3067 Find attribute in Filters with Functions with embedded expressions correctly)
=======
=======
>>>>>>> cdb410251 (GEOMESA-3061 Converters - support bytes in Avro top-level union types (#2762))
>>>>>>> 67b361c85 (GEOMESA-3061 Converters - support bytes in Avro top-level union types (#2762))
=======
<<<<<<< HEAD
<<<<<<< HEAD
>>>>>>> b4320946b (GEOMESA-3061 Converters - support bytes in Avro top-level union types (#2762))
=======
>>>>>>> 87bf55340 (GEOMESA-3061 Converters - support bytes in Avro top-level union types (#2762))
=======
=======
>>>>>>> cdb410251 (GEOMESA-3061 Converters - support bytes in Avro top-level union types (#2762))
>>>>>>> 240977229 (GEOMESA-3061 Converters - support bytes in Avro top-level union types (#2762))
=======
=======
>>>>>>> 45ad5d11f (GEOMESA-3061 Converters - support bytes in Avro top-level union types (#2762))
=======
>>>>>>> dace2085b (GEOMESA-3061 Converters - support bytes in Avro top-level union types (#2762))
=======
>>>>>>> b4320946b (GEOMESA-3061 Converters - support bytes in Avro top-level union types (#2762))
=======
>>>>>>> 516fe7e9c (GEOMESA-3061 Converters - support bytes in Avro top-level union types (#2762))
>>>>>>> 7acc3ea46 (GEOMESA-3067 Find attribute in Filters with Functions with embedded expressions correctly)
=======
>>>>>>> b9bdd406e (GEOMESA-3061 Converters - support bytes in Avro top-level union types (#2762))
<<<<<<< HEAD
<<<<<<< HEAD
<<<<<<< HEAD
<<<<<<< HEAD
<<<<<<< HEAD
<<<<<<< HEAD
<<<<<<< HEAD
<<<<<<< HEAD
<<<<<<< HEAD
<<<<<<< HEAD
<<<<<<< HEAD
<<<<<<< HEAD
<<<<<<< HEAD
<<<<<<< HEAD
<<<<<<< HEAD
<<<<<<< HEAD
<<<<<<< HEAD
<<<<<<< HEAD
<<<<<<< HEAD
>>>>>>> cdb4102515 (GEOMESA-3061 Converters - support bytes in Avro top-level union types (#2762))
=======
=======
>>>>>>> 7acc3ea46 (GEOMESA-3067 Find attribute in Filters with Functions with embedded expressions correctly)
>>>>>>> e3a63fee18 (GEOMESA-3067 Find attribute in Filters with Functions with embedded expressions correctly)
=======
>>>>>>> 1973f72e77 (GEOMESA-3061 Converters - support bytes in Avro top-level union types (#2762))
=======
>>>>>>> 4864cfc581 (GEOMESA-3061 Converters - support bytes in Avro top-level union types (#2762))
>>>>>>> 7acc3ea46 (GEOMESA-3067 Find attribute in Filters with Functions with embedded expressions correctly)
=======
>>>>>>> b9bdd406e (GEOMESA-3061 Converters - support bytes in Avro top-level union types (#2762))
<<<<<<< HEAD
<<<<<<< HEAD
<<<<<<< HEAD
<<<<<<< HEAD
<<<<<<< HEAD
>>>>>>> 67dc71ffb1 (GEOMESA-3067 Find attribute in Filters with Functions with embedded expressions correctly)
=======
<<<<<<< HEAD
>>>>>>> 058fd96baa (GEOMESA-3061 Converters - support bytes in Avro top-level union types (#2762))
=======
<<<<<<< HEAD
>>>>>>> c22ecd64c3 (GEOMESA-3061 Converters - support bytes in Avro top-level union types (#2762))
=======
<<<<<<< HEAD
>>>>>>> 6e297b9b6f (GEOMESA-3067 Find attribute in Filters with Functions with embedded expressions correctly)
=======
<<<<<<< HEAD
>>>>>>> 2a887f75bf (GEOMESA-3061 Converters - support bytes in Avro top-level union types (#2762))
=======
>>>>>>> b08cb4d818 (GEOMESA-3061 Converters - support bytes in Avro top-level union types (#2762))
>>>>>>> 0e68e9f4cc (GEOMESA-3061 Converters - support bytes in Avro top-level union types (#2762))
=======
=======
>>>>>>> f302a54949 (GEOMESA-3061 Converters - support bytes in Avro top-level union types (#2762))
=======
>>>>>>> a788dfac03 (GEOMESA-3061 Converters - support bytes in Avro top-level union types (#2762))
=======
>>>>>>> a63cb7e74 (GEOMESA-3067 Find attribute in Filters with Functions with embedded expressions correctly)
>>>>>>> 125ffd0575 (GEOMESA-3067 Find attribute in Filters with Functions with embedded expressions correctly)
=======
>>>>>>> 4c361f07da (GEOMESA-3061 Converters - support bytes in Avro top-level union types (#2762))
=======
=======
>>>>>>> f302a54949 (GEOMESA-3061 Converters - support bytes in Avro top-level union types (#2762))
=======
>>>>>>> a788dfac03 (GEOMESA-3061 Converters - support bytes in Avro top-level union types (#2762))
=======
>>>>>>> a63cb7e74 (GEOMESA-3067 Find attribute in Filters with Functions with embedded expressions correctly)
>>>>>>> 125ffd0575 (GEOMESA-3067 Find attribute in Filters with Functions with embedded expressions correctly)
=======
>>>>>>> 4c361f07da (GEOMESA-3061 Converters - support bytes in Avro top-level union types (#2762))
=======
=======
>>>>>>> f302a54949 (GEOMESA-3061 Converters - support bytes in Avro top-level union types (#2762))
=======
>>>>>>> a788dfac03 (GEOMESA-3061 Converters - support bytes in Avro top-level union types (#2762))
=======
>>>>>>> a63cb7e74 (GEOMESA-3067 Find attribute in Filters with Functions with embedded expressions correctly)
>>>>>>> 125ffd0575 (GEOMESA-3067 Find attribute in Filters with Functions with embedded expressions correctly)
=======
>>>>>>> 4c361f07da (GEOMESA-3061 Converters - support bytes in Avro top-level union types (#2762))
=======
=======
>>>>>>> 67b361c856 (GEOMESA-3061 Converters - support bytes in Avro top-level union types (#2762))
=======
>>>>>>> e182e6e99c (GEOMESA-3067 Find attribute in Filters with Functions with embedded expressions correctly)
=======
<<<<<<< HEAD
<<<<<<< HEAD
<<<<<<< HEAD
<<<<<<< HEAD
<<<<<<< HEAD
<<<<<<< HEAD
=======
>>>>>>> adfec3a47a (GEOMESA-3067 Find attribute in Filters with Functions with embedded expressions correctly)
=======
>>>>>>> e0c2527549 (GEOMESA-3061 Converters - support bytes in Avro top-level union types (#2762))
>>>>>>> 9d708b240a (GEOMESA-3061 Converters - support bytes in Avro top-level union types (#2762))
=======
>>>>>>> 76618c8da3 (GEOMESA-3061 Converters - support bytes in Avro top-level union types (#2762))
=======
<<<<<<< HEAD
<<<<<<< HEAD
<<<<<<< HEAD
=======
>>>>>>> c8a325e13c (GEOMESA-3061 Converters - support bytes in Avro top-level union types (#2762))
=======
>>>>>>> 97ec7d864a (GEOMESA-3061 Converters - support bytes in Avro top-level union types (#2762))
=======
>>>>>>> ad3cedc4db (GEOMESA-3061 Converters - support bytes in Avro top-level union types (#2762))
=======
>>>>>>> bdbced26d4 (GEOMESA-3061 Converters - support bytes in Avro top-level union types (#2762))
=======
>>>>>>> 0dbede148d (GEOMESA-3061 Converters - support bytes in Avro top-level union types (#2762))
=======
>>>>>>> 22dcc8170f (GEOMESA-3061 Converters - support bytes in Avro top-level union types (#2762))
=======
>>>>>>> b009fd23f4 (GEOMESA-3061 Converters - support bytes in Avro top-level union types (#2762))
=======
=======
>>>>>>> bc4062951d (GEOMESA-3061 Converters - support bytes in Avro top-level union types (#2762))
=======
>>>>>>> 8adfab65bb (GEOMESA-3061 Converters - support bytes in Avro top-level union types (#2762))
=======
>>>>>>> 3254b186da (GEOMESA-3067 Find attribute in Filters with Functions with embedded expressions correctly)
=======
>>>>>>> 7b0539b808 (GEOMESA-3061 Converters - support bytes in Avro top-level union types (#2762))
=======
>>>>>>> 0086b292ba (GEOMESA-3061 Converters - support bytes in Avro top-level union types (#2762))
=======
>>>>>>> cf57a2c189 (GEOMESA-3067 Find attribute in Filters with Functions with embedded expressions correctly)
=======
>>>>>>> e15d50d7d3 (GEOMESA-3061 Converters - support bytes in Avro top-level union types (#2762))
=======
>>>>>>> 8de43cccf6 (GEOMESA-3061 Converters - support bytes in Avro top-level union types (#2762))
=======
>>>>>>> 9c28193a91 (GEOMESA-3061 Converters - support bytes in Avro top-level union types (#2762))
=======
>>>>>>> 1b60c2aeba (GEOMESA-3067 Find attribute in Filters with Functions with embedded expressions correctly)
=======
>>>>>>> d294ce49e2 (GEOMESA-3061 Converters - support bytes in Avro top-level union types (#2762))
=======
>>>>>>> 1df8328338 (GEOMESA-3061 Converters - support bytes in Avro top-level union types (#2762))
=======
>>>>>>> dace2085b (GEOMESA-3061 Converters - support bytes in Avro top-level union types (#2762))
>>>>>>> 238945d4b3 (GEOMESA-3061 Converters - support bytes in Avro top-level union types (#2762))
=======
>>>>>>> 516fe7e9c (GEOMESA-3061 Converters - support bytes in Avro top-level union types (#2762))
=======
>>>>>>> 81ee66102b (GEOMESA-3061 Converters - support bytes in Avro top-level union types (#2762))
=======
>>>>>>> 9943e05ec9 (GEOMESA-3067 Find attribute in Filters with Functions with embedded expressions correctly)
=======
>>>>>>> 53a3e72cbf (GEOMESA-3061 Converters - support bytes in Avro top-level union types (#2762))
=======
>>>>>>> 947761ec9b (GEOMESA-3061 Converters - support bytes in Avro top-level union types (#2762))
=======
>>>>>>> 9813375fcc (GEOMESA-3067 Find attribute in Filters with Functions with embedded expressions correctly)
=======
=======
>>>>>>> d94c03a98e (GEOMESA-3061 Converters - support bytes in Avro top-level union types (#2762))
=======
=======
=======
>>>>>>> 9abc630fdf (GEOMESA-3061 Converters - support bytes in Avro top-level union types (#2762))
=======
>>>>>>> 25063957fc (GEOMESA-3061 Converters - support bytes in Avro top-level union types (#2762))
=======
=======
>>>>>>> a63cb7e74 (GEOMESA-3067 Find attribute in Filters with Functions with embedded expressions correctly)
>>>>>>> 8fb060734 (GEOMESA-3067 Find attribute in Filters with Functions with embedded expressions correctly)
>>>>>>> 38b3282770 (GEOMESA-3067 Find attribute in Filters with Functions with embedded expressions correctly)
=======
>>>>>>> a910ae135 (GEOMESA-3061 Converters - support bytes in Avro top-level union types (#2762))
>>>>>>> 07161eaaa6 (GEOMESA-3061 Converters - support bytes in Avro top-level union types (#2762))
=======
>>>>>>> c8a325e13 (GEOMESA-3061 Converters - support bytes in Avro top-level union types (#2762))
>>>>>>> c9328eddce (GEOMESA-3061 Converters - support bytes in Avro top-level union types (#2762))
=======
>>>>>>> 97ec7d864 (GEOMESA-3061 Converters - support bytes in Avro top-level union types (#2762))
=======
>>>>>>> ad3cedc4d (GEOMESA-3061 Converters - support bytes in Avro top-level union types (#2762))
=======
>>>>>>> bdbced26d (GEOMESA-3061 Converters - support bytes in Avro top-level union types (#2762))
=======
>>>>>>> a63cb7e74 (GEOMESA-3067 Find attribute in Filters with Functions with embedded expressions correctly)
>>>>>>> c3b0a1b6e3 (GEOMESA-3067 Find attribute in Filters with Functions with embedded expressions correctly)
=======
>>>>>>> 67b361c85 (GEOMESA-3061 Converters - support bytes in Avro top-level union types (#2762))
=======
>>>>>>> e5ed68fdd3 (GEOMESA-3067 Find attribute in Filters with Functions with embedded expressions correctly)
=======
>>>>>>> e6e1f4bdd5 (GEOMESA-3061 Converters - support bytes in Avro top-level union types (#2762))
=======
>>>>>>> a910ae135f (GEOMESA-3061 Converters - support bytes in Avro top-level union types (#2762))
=======
=======
>>>>>>> a63cb7e74 (GEOMESA-3067 Find attribute in Filters with Functions with embedded expressions correctly)
>>>>>>> 8fb0607344 (GEOMESA-3067 Find attribute in Filters with Functions with embedded expressions correctly)
=======
>>>>>>> 67b361c85 (GEOMESA-3061 Converters - support bytes in Avro top-level union types (#2762))
=======
<<<<<<< HEAD
<<<<<<< HEAD
<<<<<<< HEAD
<<<<<<< HEAD
>>>>>>> 240977229 (GEOMESA-3061 Converters - support bytes in Avro top-level union types (#2762))
=======
>>>>>>> 45ad5d11f (GEOMESA-3061 Converters - support bytes in Avro top-level union types (#2762))
=======
=======
>>>>>>> dace2085b (GEOMESA-3061 Converters - support bytes in Avro top-level union types (#2762))
=======
=======
>>>>>>> c9328eddce (GEOMESA-3061 Converters - support bytes in Avro top-level union types (#2762))
=======
>>>>>>> 9abc630fdf (GEOMESA-3061 Converters - support bytes in Avro top-level union types (#2762))
>>>>>>> e182e6e99 (GEOMESA-3067 Find attribute in Filters with Functions with embedded expressions correctly)
=======
<<<<<<< HEAD
>>>>>>> 9943e05ec9 (GEOMESA-3067 Find attribute in Filters with Functions with embedded expressions correctly)
=======
>>>>>>> 9d708b240 (GEOMESA-3061 Converters - support bytes in Avro top-level union types (#2762))
=======
<<<<<<< HEAD
>>>>>>> 53a3e72cbf (GEOMESA-3061 Converters - support bytes in Avro top-level union types (#2762))
=======
>>>>>>> 76618c8da (GEOMESA-3061 Converters - support bytes in Avro top-level union types (#2762))
=======
>>>>>>> 947761ec9b (GEOMESA-3061 Converters - support bytes in Avro top-level union types (#2762))
=======
>>>>>>> a63cb7e74 (GEOMESA-3067 Find attribute in Filters with Functions with embedded expressions correctly)
>>>>>>> c3b0a1b6e (GEOMESA-3067 Find attribute in Filters with Functions with embedded expressions correctly)
=======
=======
>>>>>>> c8a325e13 (GEOMESA-3061 Converters - support bytes in Avro top-level union types (#2762))
=======
>>>>>>> ad3cedc4d (GEOMESA-3061 Converters - support bytes in Avro top-level union types (#2762))
=======
>>>>>>> 2571e49519 (GEOMESA-3067 Find attribute in Filters with Functions with embedded expressions correctly)
=======
>>>>>>> 9d708b240a (GEOMESA-3061 Converters - support bytes in Avro top-level union types (#2762))
=======
>>>>>>> d206a68a13 (GEOMESA-3061 Converters - support bytes in Avro top-level union types (#2762))
=======
>>>>>>> 694bcd3776 (GEOMESA-3061 Converters - support bytes in Avro top-level union types (#2762))
=======
>>>>>>> c8a325e13c (GEOMESA-3061 Converters - support bytes in Avro top-level union types (#2762))
=======
>>>>>>> 97ec7d864a (GEOMESA-3061 Converters - support bytes in Avro top-level union types (#2762))
=======
>>>>>>> ad3cedc4db (GEOMESA-3061 Converters - support bytes in Avro top-level union types (#2762))
=======
>>>>>>> bdbced26d4 (GEOMESA-3061 Converters - support bytes in Avro top-level union types (#2762))
=======
>>>>>>> 0dbede148d (GEOMESA-3061 Converters - support bytes in Avro top-level union types (#2762))
=======
>>>>>>> 22dcc8170f (GEOMESA-3061 Converters - support bytes in Avro top-level union types (#2762))
=======
>>>>>>> b009fd23f4 (GEOMESA-3061 Converters - support bytes in Avro top-level union types (#2762))
=======
=======
>>>>>>> bc4062951d (GEOMESA-3061 Converters - support bytes in Avro top-level union types (#2762))
=======
>>>>>>> 8adfab65bb (GEOMESA-3061 Converters - support bytes in Avro top-level union types (#2762))
=======
>>>>>>> 3254b186da (GEOMESA-3067 Find attribute in Filters with Functions with embedded expressions correctly)
=======
>>>>>>> 7b0539b808 (GEOMESA-3061 Converters - support bytes in Avro top-level union types (#2762))
=======
>>>>>>> 0086b292ba (GEOMESA-3061 Converters - support bytes in Avro top-level union types (#2762))
=======
>>>>>>> cf57a2c189 (GEOMESA-3067 Find attribute in Filters with Functions with embedded expressions correctly)
=======
>>>>>>> e15d50d7d3 (GEOMESA-3061 Converters - support bytes in Avro top-level union types (#2762))
=======
>>>>>>> 8de43cccf6 (GEOMESA-3061 Converters - support bytes in Avro top-level union types (#2762))
=======
>>>>>>> 9c28193a91 (GEOMESA-3061 Converters - support bytes in Avro top-level union types (#2762))
=======
>>>>>>> 1b60c2aeba (GEOMESA-3067 Find attribute in Filters with Functions with embedded expressions correctly)
=======
>>>>>>> d294ce49e2 (GEOMESA-3061 Converters - support bytes in Avro top-level union types (#2762))
=======
>>>>>>> 1df8328338 (GEOMESA-3061 Converters - support bytes in Avro top-level union types (#2762))
=======
>>>>>>> dace2085b (GEOMESA-3061 Converters - support bytes in Avro top-level union types (#2762))
>>>>>>> 238945d4b3 (GEOMESA-3061 Converters - support bytes in Avro top-level union types (#2762))
=======
>>>>>>> 516fe7e9c (GEOMESA-3061 Converters - support bytes in Avro top-level union types (#2762))
=======
>>>>>>> 81ee66102b (GEOMESA-3061 Converters - support bytes in Avro top-level union types (#2762))
=======
>>>>>>> 9943e05ec9 (GEOMESA-3067 Find attribute in Filters with Functions with embedded expressions correctly)
=======
>>>>>>> 53a3e72cbf (GEOMESA-3061 Converters - support bytes in Avro top-level union types (#2762))
=======
>>>>>>> 947761ec9b (GEOMESA-3061 Converters - support bytes in Avro top-level union types (#2762))
=======
>>>>>>> 9813375fcc (GEOMESA-3067 Find attribute in Filters with Functions with embedded expressions correctly)
=======
=======
>>>>>>> d94c03a98e (GEOMESA-3061 Converters - support bytes in Avro top-level union types (#2762))
=======
=======
=======
>>>>>>> 9abc630fdf (GEOMESA-3061 Converters - support bytes in Avro top-level union types (#2762))
=======
>>>>>>> 25063957fc (GEOMESA-3061 Converters - support bytes in Avro top-level union types (#2762))
=======
=======
>>>>>>> a63cb7e74 (GEOMESA-3067 Find attribute in Filters with Functions with embedded expressions correctly)
>>>>>>> 8fb060734 (GEOMESA-3067 Find attribute in Filters with Functions with embedded expressions correctly)
>>>>>>> 38b3282770 (GEOMESA-3067 Find attribute in Filters with Functions with embedded expressions correctly)
=======
>>>>>>> a910ae135 (GEOMESA-3061 Converters - support bytes in Avro top-level union types (#2762))
>>>>>>> 07161eaaa6 (GEOMESA-3061 Converters - support bytes in Avro top-level union types (#2762))
=======
>>>>>>> c8a325e13 (GEOMESA-3061 Converters - support bytes in Avro top-level union types (#2762))
>>>>>>> c9328eddce (GEOMESA-3061 Converters - support bytes in Avro top-level union types (#2762))
=======
>>>>>>> 97ec7d864 (GEOMESA-3061 Converters - support bytes in Avro top-level union types (#2762))
=======
>>>>>>> ad3cedc4d (GEOMESA-3061 Converters - support bytes in Avro top-level union types (#2762))
=======
>>>>>>> bdbced26d (GEOMESA-3061 Converters - support bytes in Avro top-level union types (#2762))
=======
>>>>>>> a63cb7e74 (GEOMESA-3067 Find attribute in Filters with Functions with embedded expressions correctly)
>>>>>>> c3b0a1b6e3 (GEOMESA-3067 Find attribute in Filters with Functions with embedded expressions correctly)
=======
>>>>>>> 67b361c85 (GEOMESA-3061 Converters - support bytes in Avro top-level union types (#2762))
=======
>>>>>>> e5ed68fdd3 (GEOMESA-3067 Find attribute in Filters with Functions with embedded expressions correctly)
=======
>>>>>>> e6e1f4bdd5 (GEOMESA-3061 Converters - support bytes in Avro top-level union types (#2762))
=======
>>>>>>> a910ae135f (GEOMESA-3061 Converters - support bytes in Avro top-level union types (#2762))
=======
=======
>>>>>>> a63cb7e74 (GEOMESA-3067 Find attribute in Filters with Functions with embedded expressions correctly)
>>>>>>> 8fb0607344 (GEOMESA-3067 Find attribute in Filters with Functions with embedded expressions correctly)
=======
>>>>>>> 67b361c85 (GEOMESA-3061 Converters - support bytes in Avro top-level union types (#2762))
=======
<<<<<<< HEAD
<<<<<<< HEAD
<<<<<<< HEAD
<<<<<<< HEAD
>>>>>>> 240977229 (GEOMESA-3061 Converters - support bytes in Avro top-level union types (#2762))
=======
>>>>>>> 45ad5d11f (GEOMESA-3061 Converters - support bytes in Avro top-level union types (#2762))
=======
=======
>>>>>>> dace2085b (GEOMESA-3061 Converters - support bytes in Avro top-level union types (#2762))
=======
=======
>>>>>>> c9328eddce (GEOMESA-3061 Converters - support bytes in Avro top-level union types (#2762))
=======
>>>>>>> 9abc630fdf (GEOMESA-3061 Converters - support bytes in Avro top-level union types (#2762))
>>>>>>> e182e6e99 (GEOMESA-3067 Find attribute in Filters with Functions with embedded expressions correctly)
=======
<<<<<<< HEAD
>>>>>>> 9943e05ec9 (GEOMESA-3067 Find attribute in Filters with Functions with embedded expressions correctly)
=======
>>>>>>> 9d708b240 (GEOMESA-3061 Converters - support bytes in Avro top-level union types (#2762))
=======
<<<<<<< HEAD
>>>>>>> 53a3e72cbf (GEOMESA-3061 Converters - support bytes in Avro top-level union types (#2762))
=======
>>>>>>> 76618c8da (GEOMESA-3061 Converters - support bytes in Avro top-level union types (#2762))
=======
>>>>>>> 947761ec9b (GEOMESA-3061 Converters - support bytes in Avro top-level union types (#2762))
=======
>>>>>>> a63cb7e74 (GEOMESA-3067 Find attribute in Filters with Functions with embedded expressions correctly)
>>>>>>> c3b0a1b6e (GEOMESA-3067 Find attribute in Filters with Functions with embedded expressions correctly)
=======
=======
>>>>>>> c8a325e13 (GEOMESA-3061 Converters - support bytes in Avro top-level union types (#2762))
=======
>>>>>>> ad3cedc4d (GEOMESA-3061 Converters - support bytes in Avro top-level union types (#2762))
=======
>>>>>>> cd4422a10c (GEOMESA-3067 Find attribute in Filters with Functions with embedded expressions correctly)
=======
>>>>>>> 9d708b240a (GEOMESA-3061 Converters - support bytes in Avro top-level union types (#2762))
=======
>>>>>>> a5b160f47b (GEOMESA-3061 Converters - support bytes in Avro top-level union types (#2762))
=======
>>>>>>> 5cf31d21f3 (GEOMESA-3061 Converters - support bytes in Avro top-level union types (#2762))
=======
>>>>>>> cb5e2daf2b (GEOMESA-3061 Converters - support bytes in Avro top-level union types (#2762))
=======
>>>>>>> c8a325e13c (GEOMESA-3061 Converters - support bytes in Avro top-level union types (#2762))
=======
>>>>>>> 97ec7d864a (GEOMESA-3061 Converters - support bytes in Avro top-level union types (#2762))
=======
>>>>>>> ad3cedc4db (GEOMESA-3061 Converters - support bytes in Avro top-level union types (#2762))
=======
>>>>>>> bdbced26d4 (GEOMESA-3061 Converters - support bytes in Avro top-level union types (#2762))
=======
>>>>>>> 0dbede148d (GEOMESA-3061 Converters - support bytes in Avro top-level union types (#2762))
=======
>>>>>>> 22dcc8170f (GEOMESA-3061 Converters - support bytes in Avro top-level union types (#2762))
=======
>>>>>>> b009fd23f4 (GEOMESA-3061 Converters - support bytes in Avro top-level union types (#2762))
=======
=======
>>>>>>> bc4062951d (GEOMESA-3061 Converters - support bytes in Avro top-level union types (#2762))
=======
>>>>>>> 8adfab65bb (GEOMESA-3061 Converters - support bytes in Avro top-level union types (#2762))
=======
>>>>>>> 3254b186da (GEOMESA-3067 Find attribute in Filters with Functions with embedded expressions correctly)
=======
>>>>>>> 7b0539b808 (GEOMESA-3061 Converters - support bytes in Avro top-level union types (#2762))
=======
>>>>>>> 0086b292ba (GEOMESA-3061 Converters - support bytes in Avro top-level union types (#2762))
=======
>>>>>>> cf57a2c189 (GEOMESA-3067 Find attribute in Filters with Functions with embedded expressions correctly)
=======
>>>>>>> e15d50d7d3 (GEOMESA-3061 Converters - support bytes in Avro top-level union types (#2762))
=======
>>>>>>> 8de43cccf6 (GEOMESA-3061 Converters - support bytes in Avro top-level union types (#2762))
=======
>>>>>>> 9c28193a91 (GEOMESA-3061 Converters - support bytes in Avro top-level union types (#2762))
=======
>>>>>>> 1b60c2aeba (GEOMESA-3067 Find attribute in Filters with Functions with embedded expressions correctly)
=======
>>>>>>> d294ce49e2 (GEOMESA-3061 Converters - support bytes in Avro top-level union types (#2762))
=======
>>>>>>> 1df8328338 (GEOMESA-3061 Converters - support bytes in Avro top-level union types (#2762))
=======
>>>>>>> dace2085b (GEOMESA-3061 Converters - support bytes in Avro top-level union types (#2762))
>>>>>>> 238945d4b3 (GEOMESA-3061 Converters - support bytes in Avro top-level union types (#2762))
=======
>>>>>>> 516fe7e9c (GEOMESA-3061 Converters - support bytes in Avro top-level union types (#2762))
=======
>>>>>>> 81ee66102b (GEOMESA-3061 Converters - support bytes in Avro top-level union types (#2762))
=======
>>>>>>> 9943e05ec9 (GEOMESA-3067 Find attribute in Filters with Functions with embedded expressions correctly)
=======
>>>>>>> 53a3e72cbf (GEOMESA-3061 Converters - support bytes in Avro top-level union types (#2762))
=======
>>>>>>> 947761ec9b (GEOMESA-3061 Converters - support bytes in Avro top-level union types (#2762))
=======
>>>>>>> 9813375fcc (GEOMESA-3067 Find attribute in Filters with Functions with embedded expressions correctly)
=======
=======
>>>>>>> d94c03a98e (GEOMESA-3061 Converters - support bytes in Avro top-level union types (#2762))
=======
=======
=======
>>>>>>> 9abc630fdf (GEOMESA-3061 Converters - support bytes in Avro top-level union types (#2762))
=======
>>>>>>> 25063957fc (GEOMESA-3061 Converters - support bytes in Avro top-level union types (#2762))
=======
=======
>>>>>>> a63cb7e74 (GEOMESA-3067 Find attribute in Filters with Functions with embedded expressions correctly)
>>>>>>> 8fb060734 (GEOMESA-3067 Find attribute in Filters with Functions with embedded expressions correctly)
>>>>>>> 38b3282770 (GEOMESA-3067 Find attribute in Filters with Functions with embedded expressions correctly)
=======
>>>>>>> a910ae135 (GEOMESA-3061 Converters - support bytes in Avro top-level union types (#2762))
>>>>>>> 07161eaaa6 (GEOMESA-3061 Converters - support bytes in Avro top-level union types (#2762))
=======
>>>>>>> c8a325e13 (GEOMESA-3061 Converters - support bytes in Avro top-level union types (#2762))
>>>>>>> c9328eddce (GEOMESA-3061 Converters - support bytes in Avro top-level union types (#2762))
=======
>>>>>>> 97ec7d864 (GEOMESA-3061 Converters - support bytes in Avro top-level union types (#2762))
=======
>>>>>>> ad3cedc4d (GEOMESA-3061 Converters - support bytes in Avro top-level union types (#2762))
=======
>>>>>>> bdbced26d (GEOMESA-3061 Converters - support bytes in Avro top-level union types (#2762))
=======
>>>>>>> a63cb7e74 (GEOMESA-3067 Find attribute in Filters with Functions with embedded expressions correctly)
>>>>>>> c3b0a1b6e3 (GEOMESA-3067 Find attribute in Filters with Functions with embedded expressions correctly)
=======
>>>>>>> 67b361c85 (GEOMESA-3061 Converters - support bytes in Avro top-level union types (#2762))
=======
>>>>>>> e5ed68fdd3 (GEOMESA-3067 Find attribute in Filters with Functions with embedded expressions correctly)
=======
>>>>>>> e6e1f4bdd5 (GEOMESA-3061 Converters - support bytes in Avro top-level union types (#2762))
=======
>>>>>>> a910ae135f (GEOMESA-3061 Converters - support bytes in Avro top-level union types (#2762))
=======
=======
>>>>>>> a63cb7e74 (GEOMESA-3067 Find attribute in Filters with Functions with embedded expressions correctly)
>>>>>>> 8fb0607344 (GEOMESA-3067 Find attribute in Filters with Functions with embedded expressions correctly)
=======
>>>>>>> 67b361c85 (GEOMESA-3061 Converters - support bytes in Avro top-level union types (#2762))
=======
<<<<<<< HEAD
<<<<<<< HEAD
<<<<<<< HEAD
<<<<<<< HEAD
>>>>>>> 240977229 (GEOMESA-3061 Converters - support bytes in Avro top-level union types (#2762))
=======
>>>>>>> 45ad5d11f (GEOMESA-3061 Converters - support bytes in Avro top-level union types (#2762))
=======
=======
>>>>>>> dace2085b (GEOMESA-3061 Converters - support bytes in Avro top-level union types (#2762))
=======
=======
>>>>>>> c9328eddce (GEOMESA-3061 Converters - support bytes in Avro top-level union types (#2762))
=======
>>>>>>> 9abc630fdf (GEOMESA-3061 Converters - support bytes in Avro top-level union types (#2762))
>>>>>>> e182e6e99 (GEOMESA-3067 Find attribute in Filters with Functions with embedded expressions correctly)
=======
<<<<<<< HEAD
>>>>>>> 9943e05ec9 (GEOMESA-3067 Find attribute in Filters with Functions with embedded expressions correctly)
=======
>>>>>>> 9d708b240 (GEOMESA-3061 Converters - support bytes in Avro top-level union types (#2762))
=======
<<<<<<< HEAD
>>>>>>> 53a3e72cbf (GEOMESA-3061 Converters - support bytes in Avro top-level union types (#2762))
=======
>>>>>>> 76618c8da (GEOMESA-3061 Converters - support bytes in Avro top-level union types (#2762))
=======
>>>>>>> 947761ec9b (GEOMESA-3061 Converters - support bytes in Avro top-level union types (#2762))
=======
>>>>>>> a63cb7e74 (GEOMESA-3067 Find attribute in Filters with Functions with embedded expressions correctly)
>>>>>>> c3b0a1b6e (GEOMESA-3067 Find attribute in Filters with Functions with embedded expressions correctly)
=======
=======
>>>>>>> c8a325e13 (GEOMESA-3061 Converters - support bytes in Avro top-level union types (#2762))
=======
>>>>>>> ad3cedc4d (GEOMESA-3061 Converters - support bytes in Avro top-level union types (#2762))
=======
>>>>>>> 2571e49519 (GEOMESA-3067 Find attribute in Filters with Functions with embedded expressions correctly)
=======
>>>>>>> 9d708b240a (GEOMESA-3061 Converters - support bytes in Avro top-level union types (#2762))
=======
>>>>>>> d206a68a13 (GEOMESA-3061 Converters - support bytes in Avro top-level union types (#2762))
=======
>>>>>>> 694bcd3776 (GEOMESA-3061 Converters - support bytes in Avro top-level union types (#2762))
=======
>>>>>>> c8a325e13c (GEOMESA-3061 Converters - support bytes in Avro top-level union types (#2762))
=======
>>>>>>> 97ec7d864a (GEOMESA-3061 Converters - support bytes in Avro top-level union types (#2762))
=======
>>>>>>> ad3cedc4db (GEOMESA-3061 Converters - support bytes in Avro top-level union types (#2762))
=======
>>>>>>> bdbced26d4 (GEOMESA-3061 Converters - support bytes in Avro top-level union types (#2762))
=======
>>>>>>> 0dbede148d (GEOMESA-3061 Converters - support bytes in Avro top-level union types (#2762))
=======
>>>>>>> 22dcc8170f (GEOMESA-3061 Converters - support bytes in Avro top-level union types (#2762))
=======
>>>>>>> b009fd23f4 (GEOMESA-3061 Converters - support bytes in Avro top-level union types (#2762))
=======
=======
>>>>>>> bc4062951d (GEOMESA-3061 Converters - support bytes in Avro top-level union types (#2762))
=======
>>>>>>> dace2085b (GEOMESA-3061 Converters - support bytes in Avro top-level union types (#2762))
>>>>>>> 238945d4b3 (GEOMESA-3061 Converters - support bytes in Avro top-level union types (#2762))
=======
>>>>>>> 516fe7e9c (GEOMESA-3061 Converters - support bytes in Avro top-level union types (#2762))
=======
>>>>>>> a63cb7e74 (GEOMESA-3067 Find attribute in Filters with Functions with embedded expressions correctly)
>>>>>>> c3b0a1b6e3 (GEOMESA-3067 Find attribute in Filters with Functions with embedded expressions correctly)
=======
>>>>>>> 67b361c85 (GEOMESA-3061 Converters - support bytes in Avro top-level union types (#2762))
=======
>>>>>>> e5ed68fdd3 (GEOMESA-3067 Find attribute in Filters with Functions with embedded expressions correctly)
=======
>>>>>>> e6e1f4bdd5 (GEOMESA-3061 Converters - support bytes in Avro top-level union types (#2762))
=======
>>>>>>> a910ae135f (GEOMESA-3061 Converters - support bytes in Avro top-level union types (#2762))
=======
=======
>>>>>>> a63cb7e74 (GEOMESA-3067 Find attribute in Filters with Functions with embedded expressions correctly)
>>>>>>> 8fb0607344 (GEOMESA-3067 Find attribute in Filters with Functions with embedded expressions correctly)
=======
>>>>>>> 67b361c85 (GEOMESA-3061 Converters - support bytes in Avro top-level union types (#2762))
=======
<<<<<<< HEAD
>>>>>>> 240977229 (GEOMESA-3061 Converters - support bytes in Avro top-level union types (#2762))
=======
>>>>>>> 45ad5d11f (GEOMESA-3061 Converters - support bytes in Avro top-level union types (#2762))
=======
=======
>>>>>>> dace2085b (GEOMESA-3061 Converters - support bytes in Avro top-level union types (#2762))
=======
>>>>>>> 7acc3ea46 (GEOMESA-3067 Find attribute in Filters with Functions with embedded expressions correctly)
>>>>>>> f36b0e8b9 (GEOMESA-3067 Find attribute in Filters with Functions with embedded expressions correctly)
<<<<<<< HEAD
<<<<<<< HEAD
<<<<<<< HEAD
<<<<<<< HEAD
<<<<<<< HEAD
<<<<<<< HEAD
<<<<<<< HEAD
<<<<<<< HEAD
<<<<<<< HEAD
<<<<<<< HEAD
<<<<<<< HEAD
<<<<<<< HEAD
<<<<<<< HEAD
<<<<<<< HEAD
<<<<<<< HEAD
<<<<<<< HEAD
<<<<<<< HEAD
<<<<<<< HEAD
<<<<<<< HEAD
<<<<<<< HEAD
<<<<<<< HEAD
<<<<<<< HEAD
<<<<<<< HEAD
<<<<<<< HEAD
<<<<<<< HEAD
<<<<<<< HEAD
<<<<<<< HEAD
<<<<<<< HEAD
<<<<<<< HEAD
<<<<<<< HEAD
<<<<<<< HEAD
<<<<<<< HEAD
<<<<<<< HEAD
<<<<<<< HEAD
<<<<<<< HEAD
<<<<<<< HEAD
<<<<<<< HEAD
<<<<<<< HEAD
<<<<<<< HEAD
<<<<<<< HEAD
<<<<<<< HEAD
<<<<<<< HEAD
<<<<<<< HEAD
<<<<<<< HEAD
<<<<<<< HEAD
<<<<<<< HEAD
<<<<<<< HEAD
<<<<<<< HEAD
<<<<<<< HEAD
<<<<<<< HEAD
<<<<<<< HEAD
<<<<<<< HEAD
<<<<<<< HEAD
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
>>>>>>> e0c2527549 (GEOMESA-3061 Converters - support bytes in Avro top-level union types (#2762))
=======
>>>>>>> 9bcad1eb67 (GEOMESA-3067 Find attribute in Filters with Functions with embedded expressions correctly)
=======
>>>>>>> 00e61f4b70 (GEOMESA-3061 Converters - support bytes in Avro top-level union types (#2762))
=======
>>>>>>> e8ce815f1b (GEOMESA-3067 Find attribute in Filters with Functions with embedded expressions correctly)
=======
>>>>>>> 60b4637548 (GEOMESA-3061 Converters - support bytes in Avro top-level union types (#2762))
=======
>>>>>>> 9df4f8a9f6 (GEOMESA-3067 Find attribute in Filters with Functions with embedded expressions correctly)
=======
>>>>>>> 7b8c8dcc3d (GEOMESA-3061 Converters - support bytes in Avro top-level union types (#2762))
=======
>>>>>>> 4f51687745 (GEOMESA-3061 Converters - support bytes in Avro top-level union types (#2762))
=======
>>>>>>> 73770612e0 (GEOMESA-3061 Converters - support bytes in Avro top-level union types (#2762))
=======
>>>>>>> 2571e49519 (GEOMESA-3067 Find attribute in Filters with Functions with embedded expressions correctly)
=======
>>>>>>> d206a68a13 (GEOMESA-3061 Converters - support bytes in Avro top-level union types (#2762))
<<<<<<< HEAD
<<<<<<< HEAD
=======
>>>>>>> 24c4df93a5 (GEOMESA-3067 Find attribute in Filters with Functions with embedded expressions correctly)
=======
>>>>>>> 6cd1151639 (GEOMESA-3061 Converters - support bytes in Avro top-level union types (#2762))
<<<<<<< HEAD
<<<<<<< HEAD
=======
>>>>>>> b3dd8ec805 (GEOMESA-3067 Find attribute in Filters with Functions with embedded expressions correctly)
=======
>>>>>>> 5dcf23da52 (GEOMESA-3061 Converters - support bytes in Avro top-level union types (#2762))
<<<<<<< HEAD
<<<<<<< HEAD
=======
>>>>>>> c169cb2905 (GEOMESA-3067 Find attribute in Filters with Functions with embedded expressions correctly)
=======
>>>>>>> 9a4dff9e4f (GEOMESA-3061 Converters - support bytes in Avro top-level union types (#2762))
<<<<<<< HEAD
<<<<<<< HEAD
=======
>>>>>>> 8c9ca1211a (GEOMESA-3061 Converters - support bytes in Avro top-level union types (#2762))
=======
>>>>>>> 1cad375176 (GEOMESA-3061 Converters - support bytes in Avro top-level union types (#2762))
<<<<<<< HEAD
=======
>>>>>>> 4373c901b3 (GEOMESA-3067 Find attribute in Filters with Functions with embedded expressions correctly)
=======
>>>>>>> 963feec660 (GEOMESA-3061 Converters - support bytes in Avro top-level union types (#2762))
=======
>>>>>>> 99acaa0887 (GEOMESA-3067 Find attribute in Filters with Functions with embedded expressions correctly)
=======
>>>>>>> fe3de10f11 (GEOMESA-3061 Converters - support bytes in Avro top-level union types (#2762))
=======
>>>>>>> bff2bdde04 (GEOMESA-3067 Find attribute in Filters with Functions with embedded expressions correctly)
=======
>>>>>>> a35efac12e (GEOMESA-3061 Converters - support bytes in Avro top-level union types (#2762))
=======
>>>>>>> d83561962d (GEOMESA-3067 Find attribute in Filters with Functions with embedded expressions correctly)
=======
>>>>>>> cd4422a10c (GEOMESA-3067 Find attribute in Filters with Functions with embedded expressions correctly)
=======
>>>>>>> a5b160f47b (GEOMESA-3061 Converters - support bytes in Avro top-level union types (#2762))
=======
>>>>>>> def2794bb5 (GEOMESA-3067 Find attribute in Filters with Functions with embedded expressions correctly)
=======
>>>>>>> 94fecee1d8 (GEOMESA-3061 Converters - support bytes in Avro top-level union types (#2762))
=======
>>>>>>> e582c3ecfe (GEOMESA-3067 Find attribute in Filters with Functions with embedded expressions correctly)
=======
>>>>>>> 3eb12f79a9 (GEOMESA-3061 Converters - support bytes in Avro top-level union types (#2762))
=======
>>>>>>> f983ea29f0 (GEOMESA-3067 Find attribute in Filters with Functions with embedded expressions correctly)
=======
>>>>>>> 35b69b8f2f (GEOMESA-3061 Converters - support bytes in Avro top-level union types (#2762))
=======
>>>>>>> 26a09ee6c2 (GEOMESA-3061 Converters - support bytes in Avro top-level union types (#2762))
=======
>>>>>>> 7b3c90c53f (GEOMESA-3061 Converters - support bytes in Avro top-level union types (#2762))
=======
>>>>>>> 1278241911 (GEOMESA-3067 Find attribute in Filters with Functions with embedded expressions correctly)
=======
>>>>>>> 3e7fb62639 (GEOMESA-3061 Converters - support bytes in Avro top-level union types (#2762))
=======
>>>>>>> 5d8dab9f81 (GEOMESA-3067 Find attribute in Filters with Functions with embedded expressions correctly)
=======
>>>>>>> 0fa73844a1 (GEOMESA-3061 Converters - support bytes in Avro top-level union types (#2762))
=======
>>>>>>> 53bc726472 (GEOMESA-3067 Find attribute in Filters with Functions with embedded expressions correctly)
=======
>>>>>>> 6e30236dd2 (GEOMESA-3061 Converters - support bytes in Avro top-level union types (#2762))
=======
>>>>>>> 6e297b9b6f (GEOMESA-3067 Find attribute in Filters with Functions with embedded expressions correctly)
=======
=======
>>>>>>> 2571e49519 (GEOMESA-3067 Find attribute in Filters with Functions with embedded expressions correctly)
>>>>>>> adfec3a47a (GEOMESA-3067 Find attribute in Filters with Functions with embedded expressions correctly)
=======
>>>>>>> e0c2527549 (GEOMESA-3061 Converters - support bytes in Avro top-level union types (#2762))
=======
=======
>>>>>>> 24c4df93a5 (GEOMESA-3067 Find attribute in Filters with Functions with embedded expressions correctly)
>>>>>>> 9bcad1eb67 (GEOMESA-3067 Find attribute in Filters with Functions with embedded expressions correctly)
=======
>>>>>>> 00e61f4b70 (GEOMESA-3061 Converters - support bytes in Avro top-level union types (#2762))
=======
=======
>>>>>>> b3dd8ec805 (GEOMESA-3067 Find attribute in Filters with Functions with embedded expressions correctly)
>>>>>>> e8ce815f1b (GEOMESA-3067 Find attribute in Filters with Functions with embedded expressions correctly)
=======
>>>>>>> 60b4637548 (GEOMESA-3061 Converters - support bytes in Avro top-level union types (#2762))
=======
=======
>>>>>>> c169cb2905 (GEOMESA-3067 Find attribute in Filters with Functions with embedded expressions correctly)
>>>>>>> 9df4f8a9f6 (GEOMESA-3067 Find attribute in Filters with Functions with embedded expressions correctly)
=======
>>>>>>> 7b8c8dcc3d (GEOMESA-3061 Converters - support bytes in Avro top-level union types (#2762))
=======
=======
>>>>>>> 8c9ca1211a (GEOMESA-3061 Converters - support bytes in Avro top-level union types (#2762))
>>>>>>> 4f51687745 (GEOMESA-3061 Converters - support bytes in Avro top-level union types (#2762))
=======
>>>>>>> 73770612e0 (GEOMESA-3061 Converters - support bytes in Avro top-level union types (#2762))
>>>>>>> a63cb7e740 (GEOMESA-3067 Find attribute in Filters with Functions with embedded expressions correctly)
=======
=======
>>>>>>> c3b0a1b6e3 (GEOMESA-3067 Find attribute in Filters with Functions with embedded expressions correctly)
=======
<<<<<<< HEAD
<<<<<<< HEAD
<<<<<<< HEAD
<<<<<<< HEAD
<<<<<<< HEAD
<<<<<<< HEAD
=======
>>>>>>> 9bcad1eb67 (GEOMESA-3067 Find attribute in Filters with Functions with embedded expressions correctly)
=======
>>>>>>> 00e61f4b70 (GEOMESA-3061 Converters - support bytes in Avro top-level union types (#2762))
>>>>>>> c8a325e13c (GEOMESA-3061 Converters - support bytes in Avro top-level union types (#2762))
=======
>>>>>>> 8fb0607344 (GEOMESA-3067 Find attribute in Filters with Functions with embedded expressions correctly)
=======
<<<<<<< HEAD
<<<<<<< HEAD
<<<<<<< HEAD
<<<<<<< HEAD
<<<<<<< HEAD
<<<<<<< HEAD
=======
>>>>>>> 9df4f8a9f6 (GEOMESA-3067 Find attribute in Filters with Functions with embedded expressions correctly)
=======
>>>>>>> 7b8c8dcc3d (GEOMESA-3061 Converters - support bytes in Avro top-level union types (#2762))
>>>>>>> ad3cedc4db (GEOMESA-3061 Converters - support bytes in Avro top-level union types (#2762))
=======
>>>>>>> 22dcc8170f (GEOMESA-3061 Converters - support bytes in Avro top-level union types (#2762))
=======
<<<<<<< HEAD
<<<<<<< HEAD
<<<<<<< HEAD
<<<<<<< HEAD
<<<<<<< HEAD
<<<<<<< HEAD
=======
>>>>>>> 3254b186da (GEOMESA-3067 Find attribute in Filters with Functions with embedded expressions correctly)
=======
>>>>>>> 7b0539b808 (GEOMESA-3061 Converters - support bytes in Avro top-level union types (#2762))
=======
>>>>>>> cf57a2c189 (GEOMESA-3067 Find attribute in Filters with Functions with embedded expressions correctly)
=======
>>>>>>> e15d50d7d3 (GEOMESA-3061 Converters - support bytes in Avro top-level union types (#2762))
=======
>>>>>>> 1b60c2aeba (GEOMESA-3067 Find attribute in Filters with Functions with embedded expressions correctly)
=======
>>>>>>> d294ce49e2 (GEOMESA-3061 Converters - support bytes in Avro top-level union types (#2762))
=======
>>>>>>> 1cad375176 (GEOMESA-3061 Converters - support bytes in Avro top-level union types (#2762))
=======
>>>>>>> 3254b186da (GEOMESA-3067 Find attribute in Filters with Functions with embedded expressions correctly)
=======
>>>>>>> 7b0539b808 (GEOMESA-3061 Converters - support bytes in Avro top-level union types (#2762))
=======
>>>>>>> cf57a2c189 (GEOMESA-3067 Find attribute in Filters with Functions with embedded expressions correctly)
=======
>>>>>>> e15d50d7d3 (GEOMESA-3061 Converters - support bytes in Avro top-level union types (#2762))
=======
>>>>>>> 1b60c2aeba (GEOMESA-3067 Find attribute in Filters with Functions with embedded expressions correctly)
=======
>>>>>>> d294ce49e2 (GEOMESA-3061 Converters - support bytes in Avro top-level union types (#2762))
=======
>>>>>>> 7b3c90c53f (GEOMESA-3061 Converters - support bytes in Avro top-level union types (#2762))
=======
>>>>>>> 4f51687745 (GEOMESA-3061 Converters - support bytes in Avro top-level union types (#2762))
=======
>>>>>>> 73770612e0 (GEOMESA-3061 Converters - support bytes in Avro top-level union types (#2762))
=======
>>>>>>> 3254b186da (GEOMESA-3067 Find attribute in Filters with Functions with embedded expressions correctly)
=======
>>>>>>> 7b0539b808 (GEOMESA-3061 Converters - support bytes in Avro top-level union types (#2762))
=======
>>>>>>> cf57a2c189 (GEOMESA-3067 Find attribute in Filters with Functions with embedded expressions correctly)
=======
>>>>>>> e15d50d7d3 (GEOMESA-3061 Converters - support bytes in Avro top-level union types (#2762))
=======
>>>>>>> 1b60c2aeba (GEOMESA-3067 Find attribute in Filters with Functions with embedded expressions correctly)
=======
>>>>>>> d294ce49e2 (GEOMESA-3061 Converters - support bytes in Avro top-level union types (#2762))
=======
>>>>>>> 1cad375176 (GEOMESA-3061 Converters - support bytes in Avro top-level union types (#2762))
=======
>>>>>>> dace2085b (GEOMESA-3061 Converters - support bytes in Avro top-level union types (#2762))
>>>>>>> 238945d4b3 (GEOMESA-3061 Converters - support bytes in Avro top-level union types (#2762))
=======
<<<<<<< HEAD
<<<<<<< HEAD
<<<<<<< HEAD
<<<<<<< HEAD
<<<<<<< HEAD
=======
>>>>>>> 73770612e0 (GEOMESA-3061 Converters - support bytes in Avro top-level union types (#2762))
>>>>>>> 9943e05ec9 (GEOMESA-3067 Find attribute in Filters with Functions with embedded expressions correctly)
=======
>>>>>>> 53a3e72cbf (GEOMESA-3061 Converters - support bytes in Avro top-level union types (#2762))
=======
<<<<<<< HEAD
<<<<<<< HEAD
<<<<<<< HEAD
<<<<<<< HEAD
=======
>>>>>>> c9328eddce (GEOMESA-3061 Converters - support bytes in Avro top-level union types (#2762))
=======
>>>>>>> 38b3282770 (GEOMESA-3067 Find attribute in Filters with Functions with embedded expressions correctly)
=======
>>>>>>> 9abc630fdf (GEOMESA-3061 Converters - support bytes in Avro top-level union types (#2762))
=======
>>>>>>> 99acaa0887 (GEOMESA-3067 Find attribute in Filters with Functions with embedded expressions correctly)
=======
>>>>>>> c9328eddce (GEOMESA-3061 Converters - support bytes in Avro top-level union types (#2762))
=======
>>>>>>> 38b3282770 (GEOMESA-3067 Find attribute in Filters with Functions with embedded expressions correctly)
=======
>>>>>>> 9abc630fdf (GEOMESA-3061 Converters - support bytes in Avro top-level union types (#2762))
=======
>>>>>>> 5d8dab9f81 (GEOMESA-3067 Find attribute in Filters with Functions with embedded expressions correctly)
=======
>>>>>>> c9328eddce (GEOMESA-3061 Converters - support bytes in Avro top-level union types (#2762))
=======
>>>>>>> 38b3282770 (GEOMESA-3067 Find attribute in Filters with Functions with embedded expressions correctly)
=======
>>>>>>> 9abc630fdf (GEOMESA-3061 Converters - support bytes in Avro top-level union types (#2762))
=======
>>>>>>> c3b0a1b6e (GEOMESA-3067 Find attribute in Filters with Functions with embedded expressions correctly)
>>>>>>> 9813375fcc (GEOMESA-3067 Find attribute in Filters with Functions with embedded expressions correctly)
=======
<<<<<<< HEAD
<<<<<<< HEAD
<<<<<<< HEAD
<<<<<<< HEAD
>>>>>>> c8a325e13 (GEOMESA-3061 Converters - support bytes in Avro top-level union types (#2762))
=======
>>>>>>> 8fb060734 (GEOMESA-3067 Find attribute in Filters with Functions with embedded expressions correctly)
=======
<<<<<<< HEAD
<<<<<<< HEAD
<<<<<<< HEAD
<<<<<<< HEAD
>>>>>>> ad3cedc4d (GEOMESA-3061 Converters - support bytes in Avro top-level union types (#2762))
=======
>>>>>>> 125ffd0575 (GEOMESA-3067 Find attribute in Filters with Functions with embedded expressions correctly)
=======
<<<<<<< HEAD
<<<<<<< HEAD
<<<<<<< HEAD
=======
>>>>>>> 24c4df93a5 (GEOMESA-3067 Find attribute in Filters with Functions with embedded expressions correctly)
=======
>>>>>>> c8a325e13c (GEOMESA-3061 Converters - support bytes in Avro top-level union types (#2762))
=======
>>>>>>> 6cd1151639 (GEOMESA-3061 Converters - support bytes in Avro top-level union types (#2762))
<<<<<<< HEAD
<<<<<<< HEAD
=======
>>>>>>> c169cb2905 (GEOMESA-3067 Find attribute in Filters with Functions with embedded expressions correctly)
=======
>>>>>>> ad3cedc4db (GEOMESA-3061 Converters - support bytes in Avro top-level union types (#2762))
=======
>>>>>>> 9a4dff9e4f (GEOMESA-3061 Converters - support bytes in Avro top-level union types (#2762))
<<<<<<< HEAD
<<<<<<< HEAD
=======
>>>>>>> 8c9ca1211a (GEOMESA-3061 Converters - support bytes in Avro top-level union types (#2762))
=======
>>>>>>> 1cad375176 (GEOMESA-3061 Converters - support bytes in Avro top-level union types (#2762))
<<<<<<< HEAD
=======
>>>>>>> 9943e05ec9 (GEOMESA-3067 Find attribute in Filters with Functions with embedded expressions correctly)
=======
>>>>>>> 4373c901b3 (GEOMESA-3067 Find attribute in Filters with Functions with embedded expressions correctly)
=======
>>>>>>> 963feec660 (GEOMESA-3061 Converters - support bytes in Avro top-level union types (#2762))
=======
>>>>>>> 99acaa0887 (GEOMESA-3067 Find attribute in Filters with Functions with embedded expressions correctly)
=======
>>>>>>> c8a325e13 (GEOMESA-3061 Converters - support bytes in Avro top-level union types (#2762))
=======
>>>>>>> fe3de10f11 (GEOMESA-3061 Converters - support bytes in Avro top-level union types (#2762))
=======
>>>>>>> bff2bdde04 (GEOMESA-3067 Find attribute in Filters with Functions with embedded expressions correctly)
=======
>>>>>>> ad3cedc4d (GEOMESA-3061 Converters - support bytes in Avro top-level union types (#2762))
=======
>>>>>>> a35efac12e (GEOMESA-3061 Converters - support bytes in Avro top-level union types (#2762))
=======
>>>>>>> d83561962d (GEOMESA-3067 Find attribute in Filters with Functions with embedded expressions correctly)
=======
>>>>>>> def2794bb5 (GEOMESA-3067 Find attribute in Filters with Functions with embedded expressions correctly)
=======
>>>>>>> c8a325e13c (GEOMESA-3061 Converters - support bytes in Avro top-level union types (#2762))
=======
>>>>>>> 94fecee1d8 (GEOMESA-3061 Converters - support bytes in Avro top-level union types (#2762))
=======
>>>>>>> f983ea29f0 (GEOMESA-3067 Find attribute in Filters with Functions with embedded expressions correctly)
=======
>>>>>>> ad3cedc4db (GEOMESA-3061 Converters - support bytes in Avro top-level union types (#2762))
=======
>>>>>>> 35b69b8f2f (GEOMESA-3061 Converters - support bytes in Avro top-level union types (#2762))
=======
>>>>>>> 26a09ee6c2 (GEOMESA-3061 Converters - support bytes in Avro top-level union types (#2762))
=======
>>>>>>> 7b3c90c53f (GEOMESA-3061 Converters - support bytes in Avro top-level union types (#2762))
=======
>>>>>>> 9943e05ec9 (GEOMESA-3067 Find attribute in Filters with Functions with embedded expressions correctly)
=======
>>>>>>> 1278241911 (GEOMESA-3067 Find attribute in Filters with Functions with embedded expressions correctly)
=======
>>>>>>> 3e7fb62639 (GEOMESA-3061 Converters - support bytes in Avro top-level union types (#2762))
=======
>>>>>>> 5d8dab9f81 (GEOMESA-3067 Find attribute in Filters with Functions with embedded expressions correctly)
=======
>>>>>>> c8a325e13 (GEOMESA-3061 Converters - support bytes in Avro top-level union types (#2762))
=======
>>>>>>> 0fa73844a1 (GEOMESA-3061 Converters - support bytes in Avro top-level union types (#2762))
=======
>>>>>>> 53bc726472 (GEOMESA-3067 Find attribute in Filters with Functions with embedded expressions correctly)
=======
>>>>>>> ad3cedc4d (GEOMESA-3061 Converters - support bytes in Avro top-level union types (#2762))
=======
>>>>>>> 6e30236dd2 (GEOMESA-3061 Converters - support bytes in Avro top-level union types (#2762))
=======
>>>>>>> 6e297b9b6f (GEOMESA-3067 Find attribute in Filters with Functions with embedded expressions correctly)
=======
=======
>>>>>>> 24c4df93a5 (GEOMESA-3067 Find attribute in Filters with Functions with embedded expressions correctly)
>>>>>>> 9bcad1eb67 (GEOMESA-3067 Find attribute in Filters with Functions with embedded expressions correctly)
=======
>>>>>>> 00e61f4b70 (GEOMESA-3061 Converters - support bytes in Avro top-level union types (#2762))
=======
=======
>>>>>>> c169cb2905 (GEOMESA-3067 Find attribute in Filters with Functions with embedded expressions correctly)
>>>>>>> 9df4f8a9f6 (GEOMESA-3067 Find attribute in Filters with Functions with embedded expressions correctly)
=======
>>>>>>> 7b8c8dcc3d (GEOMESA-3061 Converters - support bytes in Avro top-level union types (#2762))
=======
=======
>>>>>>> 8c9ca1211a (GEOMESA-3061 Converters - support bytes in Avro top-level union types (#2762))
>>>>>>> 4f51687745 (GEOMESA-3061 Converters - support bytes in Avro top-level union types (#2762))
=======
>>>>>>> 73770612e0 (GEOMESA-3061 Converters - support bytes in Avro top-level union types (#2762))
>>>>>>> cdb410251 (GEOMESA-3061 Converters - support bytes in Avro top-level union types (#2762))
<<<<<<< HEAD
<<<<<<< HEAD
<<<<<<< HEAD
<<<<<<< HEAD
<<<<<<< HEAD
<<<<<<< HEAD
<<<<<<< HEAD
<<<<<<< HEAD
=======
>>>>>>> 6f81d40992 (GEOMESA-3067 Find attribute in Filters with Functions with embedded expressions correctly)
=======
>>>>>>> 9412e85b59 (GEOMESA-3067 Find attribute in Filters with Functions with embedded expressions correctly)
=======
>>>>>>> 2b62d1f3fe (GEOMESA-3067 Find attribute in Filters with Functions with embedded expressions correctly)
<<<<<<< HEAD
=======
>>>>>>> fa429c7863 (GEOMESA-3067 Find attribute in Filters with Functions with embedded expressions correctly)
=======
>>>>>>> 8b16ac5c65 (GEOMESA-3067 Find attribute in Filters with Functions with embedded expressions correctly)
=======
=======
>>>>>>> 9412e85b59 (GEOMESA-3067 Find attribute in Filters with Functions with embedded expressions correctly)
>>>>>>> 4cf1d8d259 (GEOMESA-3067 Find attribute in Filters with Functions with embedded expressions correctly)
=======
>>>>>>> 6f81d40992 (GEOMESA-3067 Find attribute in Filters with Functions with embedded expressions correctly)
>>>>>>> 67b361c856 (GEOMESA-3061 Converters - support bytes in Avro top-level union types (#2762))
=======
=======
>>>>>>> 7acc3ea46 (GEOMESA-3067 Find attribute in Filters with Functions with embedded expressions correctly)
>>>>>>> 908ad4071d (GEOMESA-3067 Find attribute in Filters with Functions with embedded expressions correctly)
=======
=======
>>>>>>> 7acc3ea46 (GEOMESA-3067 Find attribute in Filters with Functions with embedded expressions correctly)
=======
>>>>>>> b9bdd406e (GEOMESA-3061 Converters - support bytes in Avro top-level union types (#2762))
>>>>>>> b4320946b4 (GEOMESA-3061 Converters - support bytes in Avro top-level union types (#2762))
=======
>>>>>>> 3be8d2a5a4 (Merge branch 'feature/postgis-fixes')
<<<<<<< HEAD
<<<<<<< HEAD
<<<<<<< HEAD
<<<<<<< HEAD
<<<<<<< HEAD
<<<<<<< HEAD
=======
>>>>>>> 5430d59024 (GEOMESA-3067 Find attribute in Filters with Functions with embedded expressions correctly)
=======
>>>>>>> ca13f8551e (GEOMESA-3067 Find attribute in Filters with Functions with embedded expressions correctly)
=======
>>>>>>> d581fa3e8f (Merge branch 'feature/postgis-fixes')
=======
=======
>>>>>>> 5430d59024 (GEOMESA-3067 Find attribute in Filters with Functions with embedded expressions correctly)
>>>>>>> ca1e0fad13 (GEOMESA-3067 Find attribute in Filters with Functions with embedded expressions correctly)
=======
=======
>>>>>>> 7acc3ea46 (GEOMESA-3067 Find attribute in Filters with Functions with embedded expressions correctly)
>>>>>>> 907fb0b08a (GEOMESA-3067 Find attribute in Filters with Functions with embedded expressions correctly)
<<<<<<< HEAD
<<<<<<< HEAD
<<<<<<< HEAD
<<<<<<< HEAD
<<<<<<< HEAD
<<<<<<< HEAD
=======
>>>>>>> 810876750d (GEOMESA-3061 Converters - support bytes in Avro top-level union types (#2762))
=======
>>>>>>> d498bef1ce (GEOMESA-3061 Converters - support bytes in Avro top-level union types (#2762))
=======
>>>>>>> ca1e0fad13 (GEOMESA-3067 Find attribute in Filters with Functions with embedded expressions correctly)
=======
=======
>>>>>>> 810876750d (GEOMESA-3061 Converters - support bytes in Avro top-level union types (#2762))
>>>>>>> 5a55bf9756 (GEOMESA-3061 Converters - support bytes in Avro top-level union types (#2762))
=======
=======
>>>>>>> 7acc3ea46 (GEOMESA-3067 Find attribute in Filters with Functions with embedded expressions correctly)
=======
>>>>>>> b9bdd406e (GEOMESA-3061 Converters - support bytes in Avro top-level union types (#2762))
>>>>>>> d9ed077cd1 (GEOMESA-3061 Converters - support bytes in Avro top-level union types (#2762))
<<<<<<< HEAD
<<<<<<< HEAD
<<<<<<< HEAD
<<<<<<< HEAD
<<<<<<< HEAD
<<<<<<< HEAD
=======
>>>>>>> 5a55bf9756 (GEOMESA-3061 Converters - support bytes in Avro top-level union types (#2762))
=======
>>>>>>> adfec3a47a (GEOMESA-3067 Find attribute in Filters with Functions with embedded expressions correctly)
=======
>>>>>>> e182e6e99c (GEOMESA-3067 Find attribute in Filters with Functions with embedded expressions correctly)
=======
=======
>>>>>>> cdb410251 (GEOMESA-3061 Converters - support bytes in Avro top-level union types (#2762))
>>>>>>> 9d708b240a (GEOMESA-3061 Converters - support bytes in Avro top-level union types (#2762))
<<<<<<< HEAD
<<<<<<< HEAD
<<<<<<< HEAD
<<<<<<< HEAD
<<<<<<< HEAD
<<<<<<< HEAD
=======
>>>>>>> e0c2527549 (GEOMESA-3061 Converters - support bytes in Avro top-level union types (#2762))
=======
>>>>>>> 4cf1d8d259 (GEOMESA-3067 Find attribute in Filters with Functions with embedded expressions correctly)
=======
=======
>>>>>>> 7f922b040c (GEOMESA-3067 Find attribute in Filters with Functions with embedded expressions correctly)
=======
=======
>>>>>>> 7acc3ea46 (GEOMESA-3067 Find attribute in Filters with Functions with embedded expressions correctly)
>>>>>>> e3a63fee1 (GEOMESA-3067 Find attribute in Filters with Functions with embedded expressions correctly)
<<<<<<< HEAD
<<<<<<< HEAD
<<<<<<< HEAD
<<<<<<< HEAD
<<<<<<< HEAD
<<<<<<< HEAD
<<<<<<< HEAD
<<<<<<< HEAD
<<<<<<< HEAD
<<<<<<< HEAD
<<<<<<< HEAD
<<<<<<< HEAD
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
>>>>>>> 009a284072 (GEOMESA-3061 Converters - support bytes in Avro top-level union types (#2762))
=======
>>>>>>> 2b62d1f3fe (GEOMESA-3067 Find attribute in Filters with Functions with embedded expressions correctly)
=======
>>>>>>> 92674ff9d4 (GEOMESA-3061 Converters - support bytes in Avro top-level union types (#2762))
<<<<<<< HEAD
=======
>>>>>>> 2c14568a23 (GEOMESA-3067 Find attribute in Filters with Functions with embedded expressions correctly)
=======
>>>>>>> 84ac051f28 (GEOMESA-3061 Converters - support bytes in Avro top-level union types (#2762))
=======
>>>>>>> 9d44ff473d (GEOMESA-3061 Converters - support bytes in Avro top-level union types (#2762))
=======
>>>>>>> f110463a26 (GEOMESA-3061 Converters - support bytes in Avro top-level union types (#2762))
=======
>>>>>>> 8b16ac5c65 (GEOMESA-3067 Find attribute in Filters with Functions with embedded expressions correctly)
=======
>>>>>>> 4ccd6f6b1f (GEOMESA-3061 Converters - support bytes in Avro top-level union types (#2762))
=======
>>>>>>> 00d66ae013 (GEOMESA-3067 Find attribute in Filters with Functions with embedded expressions correctly)
=======
>>>>>>> c2cfc968d2 (GEOMESA-3061 Converters - support bytes in Avro top-level union types (#2762))
=======
>>>>>>> 9dbe1503e8 (GEOMESA-3061 Converters - support bytes in Avro top-level union types (#2762))
=======
>>>>>>> c22ecd64c3 (GEOMESA-3061 Converters - support bytes in Avro top-level union types (#2762))
=======
=======
>>>>>>> 2b62d1f3fe (GEOMESA-3067 Find attribute in Filters with Functions with embedded expressions correctly)
>>>>>>> 6f81d40992 (GEOMESA-3067 Find attribute in Filters with Functions with embedded expressions correctly)
=======
>>>>>>> 009a284072 (GEOMESA-3061 Converters - support bytes in Avro top-level union types (#2762))
>>>>>>> 3333975e77 (GEOMESA-3067 Find attribute in Filters with Functions with embedded expressions correctly)
=======
=======
>>>>>>> 982031ef44 (GEOMESA-3067 Find attribute in Filters with Functions with embedded expressions correctly)
=======
<<<<<<< HEAD
<<<<<<< HEAD
<<<<<<< HEAD
<<<<<<< HEAD
>>>>>>> 0086b292ba (GEOMESA-3061 Converters - support bytes in Avro top-level union types (#2762))
=======
>>>>>>> 9c28193a91 (GEOMESA-3061 Converters - support bytes in Avro top-level union types (#2762))
=======
<<<<<<< HEAD
<<<<<<< HEAD
=======
>>>>>>> 2c14568a23 (GEOMESA-3067 Find attribute in Filters with Functions with embedded expressions correctly)
=======
>>>>>>> 0086b292ba (GEOMESA-3061 Converters - support bytes in Avro top-level union types (#2762))
=======
>>>>>>> 84ac051f28 (GEOMESA-3061 Converters - support bytes in Avro top-level union types (#2762))
=======
>>>>>>> 9d44ff473d (GEOMESA-3061 Converters - support bytes in Avro top-level union types (#2762))
=======
>>>>>>> 00d66ae013 (GEOMESA-3067 Find attribute in Filters with Functions with embedded expressions correctly)
=======
>>>>>>> 0086b292ba (GEOMESA-3061 Converters - support bytes in Avro top-level union types (#2762))
=======
>>>>>>> c2cfc968d2 (GEOMESA-3061 Converters - support bytes in Avro top-level union types (#2762))
=======
>>>>>>> 9dbe1503e8 (GEOMESA-3061 Converters - support bytes in Avro top-level union types (#2762))
>>>>>>> 0e68e9f4c (GEOMESA-3061 Converters - support bytes in Avro top-level union types (#2762))
<<<<<<< HEAD
<<<<<<< HEAD
<<<<<<< HEAD
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
>>>>>>> 9a2d40c613 (GEOMESA-3061 Converters - support bytes in Avro top-level union types (#2762))
=======
>>>>>>> c169cb2905 (GEOMESA-3067 Find attribute in Filters with Functions with embedded expressions correctly)
=======
>>>>>>> a22efb4d66 (GEOMESA-3061 Converters - support bytes in Avro top-level union types (#2762))
<<<<<<< HEAD
=======
>>>>>>> d83561962d (GEOMESA-3067 Find attribute in Filters with Functions with embedded expressions correctly)
=======
>>>>>>> f983ea29f0 (GEOMESA-3067 Find attribute in Filters with Functions with embedded expressions correctly)
=======
>>>>>>> 194ad4e5c0 (GEOMESA-3061 Converters - support bytes in Avro top-level union types (#2762))
=======
>>>>>>> 6e297b9b6f (GEOMESA-3067 Find attribute in Filters with Functions with embedded expressions correctly)
=======
=======
>>>>>>> c169cb2905 (GEOMESA-3067 Find attribute in Filters with Functions with embedded expressions correctly)
>>>>>>> 9df4f8a9f6 (GEOMESA-3067 Find attribute in Filters with Functions with embedded expressions correctly)
=======
>>>>>>> 9a2d40c613 (GEOMESA-3061 Converters - support bytes in Avro top-level union types (#2762))
>>>>>>> 76618c8da3 (GEOMESA-3061 Converters - support bytes in Avro top-level union types (#2762))
=======
=======
>>>>>>> b009fd23f4 (GEOMESA-3061 Converters - support bytes in Avro top-level union types (#2762))
=======
>>>>>>> a63cb7e74 (GEOMESA-3067 Find attribute in Filters with Functions with embedded expressions correctly)
<<<<<<< HEAD
<<<<<<< HEAD
<<<<<<< HEAD
<<<<<<< HEAD
<<<<<<< HEAD
<<<<<<< HEAD
<<<<<<< HEAD
<<<<<<< HEAD
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
>>>>>>> 9a4dff9e4f (GEOMESA-3061 Converters - support bytes in Avro top-level union types (#2762))
=======
>>>>>>> 99acaa0887 (GEOMESA-3067 Find attribute in Filters with Functions with embedded expressions correctly)
=======
>>>>>>> fe3de10f11 (GEOMESA-3061 Converters - support bytes in Avro top-level union types (#2762))
=======
>>>>>>> bff2bdde04 (GEOMESA-3067 Find attribute in Filters with Functions with embedded expressions correctly)
=======
>>>>>>> a35efac12e (GEOMESA-3061 Converters - support bytes in Avro top-level union types (#2762))
=======
>>>>>>> 35b69b8f2f (GEOMESA-3061 Converters - support bytes in Avro top-level union types (#2762))
=======
>>>>>>> 5d8dab9f81 (GEOMESA-3067 Find attribute in Filters with Functions with embedded expressions correctly)
=======
>>>>>>> 0fa73844a1 (GEOMESA-3061 Converters - support bytes in Avro top-level union types (#2762))
=======
>>>>>>> 53bc726472 (GEOMESA-3067 Find attribute in Filters with Functions with embedded expressions correctly)
=======
>>>>>>> 6e30236dd2 (GEOMESA-3061 Converters - support bytes in Avro top-level union types (#2762))
=======
=======
>>>>>>> 9a4dff9e4f (GEOMESA-3061 Converters - support bytes in Avro top-level union types (#2762))
>>>>>>> 7b8c8dcc3d (GEOMESA-3061 Converters - support bytes in Avro top-level union types (#2762))
>>>>>>> c3b0a1b6e3 (GEOMESA-3067 Find attribute in Filters with Functions with embedded expressions correctly)
=======
=======
>>>>>>> ad3cedc4db (GEOMESA-3061 Converters - support bytes in Avro top-level union types (#2762))
=======
<<<<<<< HEAD
<<<<<<< HEAD
<<<<<<< HEAD
<<<<<<< HEAD
<<<<<<< HEAD
=======
>>>>>>> 7b8c8dcc3d (GEOMESA-3061 Converters - support bytes in Avro top-level union types (#2762))
>>>>>>> cf57a2c189 (GEOMESA-3067 Find attribute in Filters with Functions with embedded expressions correctly)
=======
=======
<<<<<<< HEAD
<<<<<<< HEAD
<<<<<<< HEAD
<<<<<<< HEAD
>>>>>>> 1b60c2aeba (GEOMESA-3067 Find attribute in Filters with Functions with embedded expressions correctly)
=======
>>>>>>> d294ce49e2 (GEOMESA-3061 Converters - support bytes in Avro top-level union types (#2762))
=======
=======
>>>>>>> 1b60c2aeba (GEOMESA-3067 Find attribute in Filters with Functions with embedded expressions correctly)
=======
<<<<<<< HEAD
<<<<<<< HEAD
>>>>>>> bff2bdde04 (GEOMESA-3067 Find attribute in Filters with Functions with embedded expressions correctly)
=======
>>>>>>> d294ce49e2 (GEOMESA-3061 Converters - support bytes in Avro top-level union types (#2762))
=======
>>>>>>> a35efac12e (GEOMESA-3061 Converters - support bytes in Avro top-level union types (#2762))
=======
>>>>>>> d294ce49e2 (GEOMESA-3061 Converters - support bytes in Avro top-level union types (#2762))
=======
>>>>>>> 6e30236dd2 (GEOMESA-3061 Converters - support bytes in Avro top-level union types (#2762))
>>>>>>> c8a325e13 (GEOMESA-3061 Converters - support bytes in Avro top-level union types (#2762))
>>>>>>> e15d50d7d3 (GEOMESA-3061 Converters - support bytes in Avro top-level union types (#2762))
=======
>>>>>>> ad3cedc4d (GEOMESA-3061 Converters - support bytes in Avro top-level union types (#2762))
=======
<<<<<<< HEAD
<<<<<<< HEAD
=======
>>>>>>> 9a4dff9e4f (GEOMESA-3061 Converters - support bytes in Avro top-level union types (#2762))
=======
>>>>>>> cf57a2c189 (GEOMESA-3067 Find attribute in Filters with Functions with embedded expressions correctly)
=======
>>>>>>> 99acaa0887 (GEOMESA-3067 Find attribute in Filters with Functions with embedded expressions correctly)
=======
=======
>>>>>>> 1b60c2aeba (GEOMESA-3067 Find attribute in Filters with Functions with embedded expressions correctly)
=======
>>>>>>> 53bc726472 (GEOMESA-3067 Find attribute in Filters with Functions with embedded expressions correctly)
>>>>>>> c8a325e13 (GEOMESA-3061 Converters - support bytes in Avro top-level union types (#2762))
>>>>>>> e15d50d7d3 (GEOMESA-3061 Converters - support bytes in Avro top-level union types (#2762))
=======
>>>>>>> fe3de10f11 (GEOMESA-3061 Converters - support bytes in Avro top-level union types (#2762))
=======
>>>>>>> a35efac12e (GEOMESA-3061 Converters - support bytes in Avro top-level union types (#2762))
=======
>>>>>>> 35b69b8f2f (GEOMESA-3061 Converters - support bytes in Avro top-level union types (#2762))
=======
>>>>>>> cf57a2c189 (GEOMESA-3067 Find attribute in Filters with Functions with embedded expressions correctly)
=======
>>>>>>> 5d8dab9f81 (GEOMESA-3067 Find attribute in Filters with Functions with embedded expressions correctly)
=======
>>>>>>> c8a325e13 (GEOMESA-3061 Converters - support bytes in Avro top-level union types (#2762))
>>>>>>> e15d50d7d3 (GEOMESA-3061 Converters - support bytes in Avro top-level union types (#2762))
=======
>>>>>>> 0fa73844a1 (GEOMESA-3061 Converters - support bytes in Avro top-level union types (#2762))
=======
>>>>>>> 6e30236dd2 (GEOMESA-3061 Converters - support bytes in Avro top-level union types (#2762))
=======
>>>>>>> 9a4dff9e4f (GEOMESA-3061 Converters - support bytes in Avro top-level union types (#2762))
=======
>>>>>>> cdb410251 (GEOMESA-3061 Converters - support bytes in Avro top-level union types (#2762))
>>>>>>> 67b361c85 (GEOMESA-3061 Converters - support bytes in Avro top-level union types (#2762))
<<<<<<< HEAD
<<<<<<< HEAD
<<<<<<< HEAD
<<<<<<< HEAD
<<<<<<< HEAD
<<<<<<< HEAD
<<<<<<< HEAD
<<<<<<< HEAD
<<<<<<< HEAD
<<<<<<< HEAD
<<<<<<< HEAD
<<<<<<< HEAD
<<<<<<< HEAD
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
>>>>>>> 79cd5cb606 (GEOMESA-3067 Find attribute in Filters with Functions with embedded expressions correctly)
=======
>>>>>>> 73770612e0 (GEOMESA-3061 Converters - support bytes in Avro top-level union types (#2762))
=======
>>>>>>> 9a4dff9e4f (GEOMESA-3061 Converters - support bytes in Avro top-level union types (#2762))
=======
>>>>>>> 63ca73533e (GEOMESA-3067 Find attribute in Filters with Functions with embedded expressions correctly)
<<<<<<< HEAD
<<<<<<< HEAD
=======
>>>>>>> 1cad375176 (GEOMESA-3061 Converters - support bytes in Avro top-level union types (#2762))
=======
>>>>>>> 21deff19fd (GEOMESA-3067 Find attribute in Filters with Functions with embedded expressions correctly)
=======
>>>>>>> a35efac12e (GEOMESA-3061 Converters - support bytes in Avro top-level union types (#2762))
=======
>>>>>>> 323528580f (GEOMESA-3067 Find attribute in Filters with Functions with embedded expressions correctly)
=======
>>>>>>> 35b69b8f2f (GEOMESA-3061 Converters - support bytes in Avro top-level union types (#2762))
=======
>>>>>>> da4e2905b4 (GEOMESA-3067 Find attribute in Filters with Functions with embedded expressions correctly)
=======
>>>>>>> 7b3c90c53f (GEOMESA-3061 Converters - support bytes in Avro top-level union types (#2762))
=======
>>>>>>> 1ef95979ee (GEOMESA-3067 Find attribute in Filters with Functions with embedded expressions correctly)
=======
>>>>>>> 6e30236dd2 (GEOMESA-3061 Converters - support bytes in Avro top-level union types (#2762))
=======
>>>>>>> 3261561062 (GEOMESA-3067 Find attribute in Filters with Functions with embedded expressions correctly)
=======
=======
>>>>>>> 9a4dff9e4f (GEOMESA-3061 Converters - support bytes in Avro top-level union types (#2762))
>>>>>>> 7b8c8dcc3d (GEOMESA-3061 Converters - support bytes in Avro top-level union types (#2762))
=======
>>>>>>> 79cd5cb606 (GEOMESA-3067 Find attribute in Filters with Functions with embedded expressions correctly)
=======
=======
>>>>>>> 1cad375176 (GEOMESA-3061 Converters - support bytes in Avro top-level union types (#2762))
>>>>>>> 73770612e0 (GEOMESA-3061 Converters - support bytes in Avro top-level union types (#2762))
>>>>>>> c8a325e13c (GEOMESA-3061 Converters - support bytes in Avro top-level union types (#2762))
=======
=======
>>>>>>> bc49131942 (GEOMESA-3067 Find attribute in Filters with Functions with embedded expressions correctly)
=======
<<<<<<< HEAD
<<<<<<< HEAD
<<<<<<< HEAD
<<<<<<< HEAD
<<<<<<< HEAD
<<<<<<< HEAD
=======
>>>>>>> 79cd5cb606 (GEOMESA-3067 Find attribute in Filters with Functions with embedded expressions correctly)
=======
>>>>>>> 73770612e0 (GEOMESA-3061 Converters - support bytes in Avro top-level union types (#2762))
>>>>>>> 238945d4b3 (GEOMESA-3061 Converters - support bytes in Avro top-level union types (#2762))
=======
=======
<<<<<<< HEAD
<<<<<<< HEAD
<<<<<<< HEAD
<<<<<<< HEAD
>>>>>>> d294ce49e2 (GEOMESA-3061 Converters - support bytes in Avro top-level union types (#2762))
=======
>>>>>>> ed45e8551f (GEOMESA-3067 Find attribute in Filters with Functions with embedded expressions correctly)
=======
=======
>>>>>>> d294ce49e2 (GEOMESA-3061 Converters - support bytes in Avro top-level union types (#2762))
=======
<<<<<<< HEAD
<<<<<<< HEAD
>>>>>>> a35efac12e (GEOMESA-3061 Converters - support bytes in Avro top-level union types (#2762))
=======
>>>>>>> ed45e8551f (GEOMESA-3067 Find attribute in Filters with Functions with embedded expressions correctly)
=======
>>>>>>> 323528580f (GEOMESA-3067 Find attribute in Filters with Functions with embedded expressions correctly)
=======
>>>>>>> ed45e8551f (GEOMESA-3067 Find attribute in Filters with Functions with embedded expressions correctly)
=======
>>>>>>> 3261561062 (GEOMESA-3067 Find attribute in Filters with Functions with embedded expressions correctly)
>>>>>>> 9638dc731 (GEOMESA-3067 Find attribute in Filters with Functions with embedded expressions correctly)
>>>>>>> bec3ba7d08 (GEOMESA-3067 Find attribute in Filters with Functions with embedded expressions correctly)
=======
>>>>>>> bc4913194 (GEOMESA-3067 Find attribute in Filters with Functions with embedded expressions correctly)
=======
<<<<<<< HEAD
<<<<<<< HEAD
=======
>>>>>>> 63ca73533e (GEOMESA-3067 Find attribute in Filters with Functions with embedded expressions correctly)
=======
>>>>>>> 238945d4b3 (GEOMESA-3061 Converters - support bytes in Avro top-level union types (#2762))
=======
>>>>>>> 1cad375176 (GEOMESA-3061 Converters - support bytes in Avro top-level union types (#2762))
=======
=======
>>>>>>> d294ce49e2 (GEOMESA-3061 Converters - support bytes in Avro top-level union types (#2762))
=======
>>>>>>> 6e30236dd2 (GEOMESA-3061 Converters - support bytes in Avro top-level union types (#2762))
>>>>>>> 9638dc731 (GEOMESA-3067 Find attribute in Filters with Functions with embedded expressions correctly)
>>>>>>> bec3ba7d08 (GEOMESA-3067 Find attribute in Filters with Functions with embedded expressions correctly)
=======
>>>>>>> 21deff19fd (GEOMESA-3067 Find attribute in Filters with Functions with embedded expressions correctly)
=======
>>>>>>> 323528580f (GEOMESA-3067 Find attribute in Filters with Functions with embedded expressions correctly)
=======
>>>>>>> da4e2905b4 (GEOMESA-3067 Find attribute in Filters with Functions with embedded expressions correctly)
=======
>>>>>>> 238945d4b3 (GEOMESA-3061 Converters - support bytes in Avro top-level union types (#2762))
=======
>>>>>>> 7b3c90c53f (GEOMESA-3061 Converters - support bytes in Avro top-level union types (#2762))
=======
>>>>>>> 9638dc731 (GEOMESA-3067 Find attribute in Filters with Functions with embedded expressions correctly)
>>>>>>> bec3ba7d08 (GEOMESA-3067 Find attribute in Filters with Functions with embedded expressions correctly)
=======
>>>>>>> 1ef95979ee (GEOMESA-3067 Find attribute in Filters with Functions with embedded expressions correctly)
=======
>>>>>>> 3261561062 (GEOMESA-3067 Find attribute in Filters with Functions with embedded expressions correctly)
=======
>>>>>>> 63ca73533e (GEOMESA-3067 Find attribute in Filters with Functions with embedded expressions correctly)
=======
>>>>>>> 238945d4b3 (GEOMESA-3061 Converters - support bytes in Avro top-level union types (#2762))
=======
>>>>>>> 1cad375176 (GEOMESA-3061 Converters - support bytes in Avro top-level union types (#2762))
=======
>>>>>>> 7acc3ea46 (GEOMESA-3067 Find attribute in Filters with Functions with embedded expressions correctly)
>>>>>>> 908ad4071 (GEOMESA-3067 Find attribute in Filters with Functions with embedded expressions correctly)
<<<<<<< HEAD
<<<<<<< HEAD
<<<<<<< HEAD
<<<<<<< HEAD
<<<<<<< HEAD
<<<<<<< HEAD
<<<<<<< HEAD
<<<<<<< HEAD
<<<<<<< HEAD
<<<<<<< HEAD
<<<<<<< HEAD
<<<<<<< HEAD
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
>>>>>>> c029a43a6c (GEOMESA-3061 Converters - support bytes in Avro top-level union types (#2762))
=======
>>>>>>> 63ca73533e (GEOMESA-3067 Find attribute in Filters with Functions with embedded expressions correctly)
=======
>>>>>>> 0fc6650ecf (GEOMESA-3061 Converters - support bytes in Avro top-level union types (#2762))
<<<<<<< HEAD
=======
>>>>>>> 21deff19fd (GEOMESA-3067 Find attribute in Filters with Functions with embedded expressions correctly)
=======
>>>>>>> d0785cf307 (GEOMESA-3061 Converters - support bytes in Avro top-level union types (#2762))
=======
>>>>>>> 323528580f (GEOMESA-3067 Find attribute in Filters with Functions with embedded expressions correctly)
=======
>>>>>>> fd5565dfba (GEOMESA-3061 Converters - support bytes in Avro top-level union types (#2762))
=======
>>>>>>> da4e2905b4 (GEOMESA-3067 Find attribute in Filters with Functions with embedded expressions correctly)
=======
>>>>>>> db8a3a22b2 (GEOMESA-3061 Converters - support bytes in Avro top-level union types (#2762))
=======
>>>>>>> 1ef95979ee (GEOMESA-3067 Find attribute in Filters with Functions with embedded expressions correctly)
=======
>>>>>>> 63546aacdc (GEOMESA-3061 Converters - support bytes in Avro top-level union types (#2762))
=======
>>>>>>> 3261561062 (GEOMESA-3067 Find attribute in Filters with Functions with embedded expressions correctly)
=======
>>>>>>> dbd932fed6 (GEOMESA-3061 Converters - support bytes in Avro top-level union types (#2762))
=======
=======
>>>>>>> 63ca73533e (GEOMESA-3067 Find attribute in Filters with Functions with embedded expressions correctly)
>>>>>>> 79cd5cb606 (GEOMESA-3067 Find attribute in Filters with Functions with embedded expressions correctly)
=======
>>>>>>> c029a43a6c (GEOMESA-3061 Converters - support bytes in Avro top-level union types (#2762))
>>>>>>> 9638dc731e (GEOMESA-3067 Find attribute in Filters with Functions with embedded expressions correctly)
=======
=======
>>>>>>> bec3ba7d08 (GEOMESA-3067 Find attribute in Filters with Functions with embedded expressions correctly)
=======
<<<<<<< HEAD
<<<<<<< HEAD
<<<<<<< HEAD
<<<<<<< HEAD
>>>>>>> 8de43cccf6 (GEOMESA-3061 Converters - support bytes in Avro top-level union types (#2762))
=======
>>>>>>> ed45e8551f (GEOMESA-3067 Find attribute in Filters with Functions with embedded expressions correctly)
=======
<<<<<<< HEAD
<<<<<<< HEAD
<<<<<<< HEAD
<<<<<<< HEAD
>>>>>>> 1df8328338 (GEOMESA-3061 Converters - support bytes in Avro top-level union types (#2762))
=======
=======
>>>>>>> 21deff19fd (GEOMESA-3067 Find attribute in Filters with Functions with embedded expressions correctly)
=======
>>>>>>> 8de43cccf6 (GEOMESA-3061 Converters - support bytes in Avro top-level union types (#2762))
=======
>>>>>>> d0785cf307 (GEOMESA-3061 Converters - support bytes in Avro top-level union types (#2762))
=======
>>>>>>> 323528580f (GEOMESA-3067 Find attribute in Filters with Functions with embedded expressions correctly)
=======
>>>>>>> 1df8328338 (GEOMESA-3061 Converters - support bytes in Avro top-level union types (#2762))
=======
>>>>>>> fd5565dfba (GEOMESA-3061 Converters - support bytes in Avro top-level union types (#2762))
=======
>>>>>>> 1ef95979ee (GEOMESA-3067 Find attribute in Filters with Functions with embedded expressions correctly)
=======
>>>>>>> 8de43cccf6 (GEOMESA-3061 Converters - support bytes in Avro top-level union types (#2762))
=======
>>>>>>> 63546aacdc (GEOMESA-3061 Converters - support bytes in Avro top-level union types (#2762))
=======
>>>>>>> 3261561062 (GEOMESA-3067 Find attribute in Filters with Functions with embedded expressions correctly)
=======
>>>>>>> 1df8328338 (GEOMESA-3061 Converters - support bytes in Avro top-level union types (#2762))
=======
>>>>>>> dbd932fed6 (GEOMESA-3061 Converters - support bytes in Avro top-level union types (#2762))
>>>>>>> b4320946b (GEOMESA-3061 Converters - support bytes in Avro top-level union types (#2762))
<<<<<<< HEAD
<<<<<<< HEAD
<<<<<<< HEAD
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
>>>>>>> 6c83981af3 (GEOMESA-3061 Converters - support bytes in Avro top-level union types (#2762))
=======
>>>>>>> 67de3c3202 (Merge branch 'feature/postgis-fixes')
=======
>>>>>>> 1e39c0c27d (GEOMESA-3061 Converters - support bytes in Avro top-level union types (#2762))
<<<<<<< HEAD
=======
>>>>>>> 638b68d081 (Merge branch 'feature/postgis-fixes')
=======
>>>>>>> ed25decdd5 (Merge branch 'feature/postgis-fixes')
=======
>>>>>>> db9dfb6f14 (GEOMESA-3061 Converters - support bytes in Avro top-level union types (#2762))
=======
>>>>>>> f893d9a594 (Merge branch 'feature/postgis-fixes')
=======
=======
>>>>>>> 67de3c3202 (Merge branch 'feature/postgis-fixes')
>>>>>>> 217b7d1cb9 (Merge branch 'feature/postgis-fixes')
=======
>>>>>>> 6c83981af3 (GEOMESA-3061 Converters - support bytes in Avro top-level union types (#2762))
>>>>>>> 97ec7d864a (GEOMESA-3061 Converters - support bytes in Avro top-level union types (#2762))
=======
=======
>>>>>>> bc4062951d (GEOMESA-3061 Converters - support bytes in Avro top-level union types (#2762))
=======
<<<<<<< HEAD
<<<<<<< HEAD
<<<<<<< HEAD
<<<<<<< HEAD
<<<<<<< HEAD
=======
>>>>>>> 6c83981af3 (GEOMESA-3061 Converters - support bytes in Avro top-level union types (#2762))
>>>>>>> e944f1c88b (Merge branch 'feature/postgis-fixes')
=======
=======
>>>>>>> 1e39c0c27d (GEOMESA-3061 Converters - support bytes in Avro top-level union types (#2762))
<<<<<<< HEAD
=======
>>>>>>> e944f1c88b (Merge branch 'feature/postgis-fixes')
=======
>>>>>>> 638b68d081 (Merge branch 'feature/postgis-fixes')
=======
>>>>>>> db9dfb6f14 (GEOMESA-3061 Converters - support bytes in Avro top-level union types (#2762))
=======
>>>>>>> e944f1c88b (Merge branch 'feature/postgis-fixes')
=======
>>>>>>> f893d9a594 (Merge branch 'feature/postgis-fixes')
=======
>>>>>>> 6c83981af3 (GEOMESA-3061 Converters - support bytes in Avro top-level union types (#2762))
>>>>>>> 3be8d2a5a (Merge branch 'feature/postgis-fixes')
<<<<<<< HEAD
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
>>>>>>> 1bb69524c2 (GEOMESA-3061 Converters - support bytes in Avro top-level union types (#2762))
=======
>>>>>>> 71adb695c5 (Merge branch 'feature/postgis-fixes')
=======
>>>>>>> 30559ea5c9 (Merge branch 'feature/postgis-fixes')
=======
>>>>>>> 27afb28ab6 (GEOMESA-3061 Converters - support bytes in Avro top-level union types (#2762))
=======
>>>>>>> 964e86145a (Merge branch 'feature/postgis-fixes')
=======
>>>>>>> bf6bde0830 (Merge branch 'feature/postgis-fixes')
=======
=======
>>>>>>> 1bb69524c2 (GEOMESA-3061 Converters - support bytes in Avro top-level union types (#2762))
>>>>>>> a5b0374ee2 (GEOMESA-3061 Converters - support bytes in Avro top-level union types (#2762))
>>>>>>> db8d998aa2 (Merge branch 'feature/postgis-fixes')
=======
>>>>>>> d845d7c1bd (GEOMESA-3254 Add Bloop build support)
=======
=======
>>>>>>> 7acc3ea46 (GEOMESA-3067 Find attribute in Filters with Functions with embedded expressions correctly)
>>>>>>> 7bb5f26c3e (GEOMESA-3067 Find attribute in Filters with Functions with embedded expressions correctly)
=======
=======
>>>>>>> 7acc3ea46 (GEOMESA-3067 Find attribute in Filters with Functions with embedded expressions correctly)
=======
>>>>>>> b9bdd406e (GEOMESA-3061 Converters - support bytes in Avro top-level union types (#2762))
>>>>>>> 6d9a5b626c (GEOMESA-3061 Converters - support bytes in Avro top-level union types (#2762))
<<<<<<< HEAD
<<<<<<< HEAD
<<<<<<< HEAD
<<<<<<< HEAD
<<<<<<< HEAD
<<<<<<< HEAD
=======
>>>>>>> 3676d4e56a (GEOMESA-3061 Converters - support bytes in Avro top-level union types (#2762))
=======
>>>>>>> e8ce815f1b (GEOMESA-3067 Find attribute in Filters with Functions with embedded expressions correctly)
=======
>>>>>>> e5ed68fdd3 (GEOMESA-3067 Find attribute in Filters with Functions with embedded expressions correctly)
=======
=======
>>>>>>> cdb410251 (GEOMESA-3061 Converters - support bytes in Avro top-level union types (#2762))
>>>>>>> e6e1f4bdd5 (GEOMESA-3061 Converters - support bytes in Avro top-level union types (#2762))
<<<<<<< HEAD
<<<<<<< HEAD
<<<<<<< HEAD
<<<<<<< HEAD
<<<<<<< HEAD
<<<<<<< HEAD
=======
>>>>>>> 60b4637548 (GEOMESA-3061 Converters - support bytes in Avro top-level union types (#2762))
=======
>>>>>>> 6f81d40992 (GEOMESA-3067 Find attribute in Filters with Functions with embedded expressions correctly)
=======
>>>>>>> 7f922b040c (GEOMESA-3067 Find attribute in Filters with Functions with embedded expressions correctly)
=======
=======
>>>>>>> 0e68e9f4c (GEOMESA-3061 Converters - support bytes in Avro top-level union types (#2762))
>>>>>>> a910ae135f (GEOMESA-3061 Converters - support bytes in Avro top-level union types (#2762))
<<<<<<< HEAD
<<<<<<< HEAD
<<<<<<< HEAD
<<<<<<< HEAD
<<<<<<< HEAD
<<<<<<< HEAD
=======
>>>>>>> c169cb2905 (GEOMESA-3067 Find attribute in Filters with Functions with embedded expressions correctly)
=======
>>>>>>> f983ea29f0 (GEOMESA-3067 Find attribute in Filters with Functions with embedded expressions correctly)
=======
>>>>>>> 009a284072 (GEOMESA-3061 Converters - support bytes in Avro top-level union types (#2762))
=======
=======
>>>>>>> c169cb2905 (GEOMESA-3067 Find attribute in Filters with Functions with embedded expressions correctly)
>>>>>>> 9df4f8a9f6 (GEOMESA-3067 Find attribute in Filters with Functions with embedded expressions correctly)
=======
=======
>>>>>>> a63cb7e74 (GEOMESA-3067 Find attribute in Filters with Functions with embedded expressions correctly)
>>>>>>> 8fb0607344 (GEOMESA-3067 Find attribute in Filters with Functions with embedded expressions correctly)
<<<<<<< HEAD
<<<<<<< HEAD
<<<<<<< HEAD
<<<<<<< HEAD
<<<<<<< HEAD
<<<<<<< HEAD
=======
>>>>>>> 9df4f8a9f6 (GEOMESA-3067 Find attribute in Filters with Functions with embedded expressions correctly)
=======
>>>>>>> 7b8c8dcc3d (GEOMESA-3061 Converters - support bytes in Avro top-level union types (#2762))
=======
>>>>>>> ad3cedc4db (GEOMESA-3061 Converters - support bytes in Avro top-level union types (#2762))
=======
>>>>>>> bc49131942 (GEOMESA-3067 Find attribute in Filters with Functions with embedded expressions correctly)
<<<<<<< HEAD
<<<<<<< HEAD
<<<<<<< HEAD
<<<<<<< HEAD
<<<<<<< HEAD
<<<<<<< HEAD
=======
>>>>>>> 0fc6650ecf (GEOMESA-3061 Converters - support bytes in Avro top-level union types (#2762))
=======
>>>>>>> db8a3a22b2 (GEOMESA-3061 Converters - support bytes in Avro top-level union types (#2762))
=======
>>>>>>> 79cd5cb606 (GEOMESA-3067 Find attribute in Filters with Functions with embedded expressions correctly)
=======
=======
>>>>>>> 0fc6650ecf (GEOMESA-3061 Converters - support bytes in Avro top-level union types (#2762))
>>>>>>> c029a43a6c (GEOMESA-3061 Converters - support bytes in Avro top-level union types (#2762))
=======
=======
>>>>>>> b4320946b (GEOMESA-3061 Converters - support bytes in Avro top-level union types (#2762))
>>>>>>> bdbced26d4 (GEOMESA-3061 Converters - support bytes in Avro top-level union types (#2762))
<<<<<<< HEAD
<<<<<<< HEAD
<<<<<<< HEAD
<<<<<<< HEAD
<<<<<<< HEAD
<<<<<<< HEAD
=======
>>>>>>> 67de3c3202 (Merge branch 'feature/postgis-fixes')
=======
>>>>>>> ed25decdd5 (Merge branch 'feature/postgis-fixes')
=======
>>>>>>> c029a43a6c (GEOMESA-3061 Converters - support bytes in Avro top-level union types (#2762))
=======
=======
>>>>>>> 67de3c3202 (Merge branch 'feature/postgis-fixes')
>>>>>>> 217b7d1cb9 (Merge branch 'feature/postgis-fixes')
=======
=======
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
>>>>>>> a5b0374ee2 (GEOMESA-3061 Converters - support bytes in Avro top-level union types (#2762))
=======
=======
>>>>>>> 26e5afc4ea (Merge branch 'feature/postgis-fixes')
=======
>>>>>>> c69897d7bd (Merge branch 'feature/postgis-fixes')
=======
<<<<<<< HEAD
>>>>>>> 26e5afc4ea (Merge branch 'feature/postgis-fixes')
=======
>>>>>>> c69897d7bd (Merge branch 'feature/postgis-fixes')
=======
<<<<<<< HEAD
>>>>>>> 26e5afc4ea (Merge branch 'feature/postgis-fixes')
=======
>>>>>>> c69897d7bd (Merge branch 'feature/postgis-fixes')
=======
=======
>>>>>>> a990cf104e (GEOMESA-3067 Find attribute in Filters with Functions with embedded expressions correctly)
=======
>>>>>>> f33d55e2ba (GEOMESA-3067 Find attribute in Filters with Functions with embedded expressions correctly)
<<<<<<< HEAD
>>>>>>> 87bf55340 (GEOMESA-3061 Converters - support bytes in Avro top-level union types (#2762))
<<<<<<< HEAD
>>>>>>> 0dbede148d (GEOMESA-3061 Converters - support bytes in Avro top-level union types (#2762))
=======
=======
=======
>>>>>>> cdb410251 (GEOMESA-3061 Converters - support bytes in Avro top-level union types (#2762))
>>>>>>> 240977229 (GEOMESA-3061 Converters - support bytes in Avro top-level union types (#2762))
<<<<<<< HEAD
>>>>>>> 22dcc8170f (GEOMESA-3061 Converters - support bytes in Avro top-level union types (#2762))
=======
=======
>>>>>>> 45ad5d11f (GEOMESA-3061 Converters - support bytes in Avro top-level union types (#2762))
<<<<<<< HEAD
<<<<<<< HEAD
<<<<<<< HEAD
<<<<<<< HEAD
<<<<<<< HEAD
<<<<<<< HEAD
<<<<<<< HEAD
=======
>>>>>>> 1cad375176 (GEOMESA-3061 Converters - support bytes in Avro top-level union types (#2762))
=======
>>>>>>> 7b3c90c53f (GEOMESA-3061 Converters - support bytes in Avro top-level union types (#2762))
=======
>>>>>>> 9a2d40c613 (GEOMESA-3061 Converters - support bytes in Avro top-level union types (#2762))
=======
=======
>>>>>>> 1cad375176 (GEOMESA-3061 Converters - support bytes in Avro top-level union types (#2762))
>>>>>>> 73770612e0 (GEOMESA-3061 Converters - support bytes in Avro top-level union types (#2762))
>>>>>>> b009fd23f4 (GEOMESA-3061 Converters - support bytes in Avro top-level union types (#2762))
=======
=======
>>>>>>> dace2085b (GEOMESA-3061 Converters - support bytes in Avro top-level union types (#2762))
<<<<<<< HEAD
<<<<<<< HEAD
<<<<<<< HEAD
<<<<<<< HEAD
<<<<<<< HEAD
<<<<<<< HEAD
<<<<<<< HEAD
=======
>>>>>>> 1e39c0c27d (GEOMESA-3061 Converters - support bytes in Avro top-level union types (#2762))
=======
>>>>>>> db9dfb6f14 (GEOMESA-3061 Converters - support bytes in Avro top-level union types (#2762))
=======
>>>>>>> 73770612e0 (GEOMESA-3061 Converters - support bytes in Avro top-level union types (#2762))
=======
=======
>>>>>>> 1e39c0c27d (GEOMESA-3061 Converters - support bytes in Avro top-level union types (#2762))
>>>>>>> 6c83981af3 (GEOMESA-3061 Converters - support bytes in Avro top-level union types (#2762))
>>>>>>> 238945d4b3 (GEOMESA-3061 Converters - support bytes in Avro top-level union types (#2762))
=======
=======
>>>>>>> 516fe7e9c (GEOMESA-3061 Converters - support bytes in Avro top-level union types (#2762))
<<<<<<< HEAD
<<<<<<< HEAD
<<<<<<< HEAD
<<<<<<< HEAD
<<<<<<< HEAD
<<<<<<< HEAD
=======
>>>>>>> 638b68d081 (Merge branch 'feature/postgis-fixes')
=======
>>>>>>> f893d9a594 (Merge branch 'feature/postgis-fixes')
=======
>>>>>>> 6c83981af3 (GEOMESA-3061 Converters - support bytes in Avro top-level union types (#2762))
>>>>>>> bc4062951d (GEOMESA-3061 Converters - support bytes in Avro top-level union types (#2762))
=======
=======
=======
>>>>>>> 3be8d2a5a (Merge branch 'feature/postgis-fixes')
>>>>>>> e8cc4971c6 (Merge branch 'feature/postgis-fixes')
<<<<<<< HEAD
<<<<<<< HEAD
<<<<<<< HEAD
<<<<<<< HEAD
<<<<<<< HEAD
=======
>>>>>>> a990cf104e (GEOMESA-3067 Find attribute in Filters with Functions with embedded expressions correctly)
=======
>>>>>>> f33d55e2ba (GEOMESA-3067 Find attribute in Filters with Functions with embedded expressions correctly)
>>>>>>> e944f1c88b (Merge branch 'feature/postgis-fixes')
=======
=======
=======
>>>>>>> 7acc3ea46 (GEOMESA-3067 Find attribute in Filters with Functions with embedded expressions correctly)
>>>>>>> 907fb0b08 (GEOMESA-3067 Find attribute in Filters with Functions with embedded expressions correctly)
<<<<<<< HEAD
<<<<<<< HEAD
<<<<<<< HEAD
<<<<<<< HEAD
<<<<<<< HEAD
>>>>>>> 8a3e82747d (GEOMESA-3067 Find attribute in Filters with Functions with embedded expressions correctly)
<<<<<<< HEAD
>>>>>>> deb8fd68de (GEOMESA-3067 Find attribute in Filters with Functions with embedded expressions correctly)
=======
=======
=======
>>>>>>> d9ed077cd (GEOMESA-3061 Converters - support bytes in Avro top-level union types (#2762))
<<<<<<< HEAD
<<<<<<< HEAD
<<<<<<< HEAD
>>>>>>> 81ee66102b (GEOMESA-3061 Converters - support bytes in Avro top-level union types (#2762))
<<<<<<< HEAD
>>>>>>> 8adfab65bb (GEOMESA-3061 Converters - support bytes in Avro top-level union types (#2762))
=======
=======
=======
>>>>>>> e182e6e99 (GEOMESA-3067 Find attribute in Filters with Functions with embedded expressions correctly)
<<<<<<< HEAD
<<<<<<< HEAD
<<<<<<< HEAD
>>>>>>> 9943e05ec9 (GEOMESA-3067 Find attribute in Filters with Functions with embedded expressions correctly)
<<<<<<< HEAD
>>>>>>> 3254b186da (GEOMESA-3067 Find attribute in Filters with Functions with embedded expressions correctly)
=======
=======
=======
=======
>>>>>>> cdb410251 (GEOMESA-3061 Converters - support bytes in Avro top-level union types (#2762))
>>>>>>> 9d708b240 (GEOMESA-3061 Converters - support bytes in Avro top-level union types (#2762))
<<<<<<< HEAD
<<<<<<< HEAD
<<<<<<< HEAD
>>>>>>> 53a3e72cbf (GEOMESA-3061 Converters - support bytes in Avro top-level union types (#2762))
<<<<<<< HEAD
>>>>>>> 7b0539b808 (GEOMESA-3061 Converters - support bytes in Avro top-level union types (#2762))
=======
=======
=======
>>>>>>> 3333975e7 (GEOMESA-3067 Find attribute in Filters with Functions with embedded expressions correctly)
<<<<<<< HEAD
<<<<<<< HEAD
<<<<<<< HEAD
>>>>>>> d15af7157e (GEOMESA-3067 Find attribute in Filters with Functions with embedded expressions correctly)
<<<<<<< HEAD
>>>>>>> 982031ef44 (GEOMESA-3067 Find attribute in Filters with Functions with embedded expressions correctly)
=======
=======
=======
=======
>>>>>>> 0e68e9f4c (GEOMESA-3061 Converters - support bytes in Avro top-level union types (#2762))
>>>>>>> 76618c8da (GEOMESA-3061 Converters - support bytes in Avro top-level union types (#2762))
<<<<<<< HEAD
<<<<<<< HEAD
<<<<<<< HEAD
>>>>>>> 947761ec9b (GEOMESA-3061 Converters - support bytes in Avro top-level union types (#2762))
<<<<<<< HEAD
>>>>>>> 0086b292ba (GEOMESA-3061 Converters - support bytes in Avro top-level union types (#2762))
=======
=======
=======
>>>>>>> c3b0a1b6e (GEOMESA-3067 Find attribute in Filters with Functions with embedded expressions correctly)
<<<<<<< HEAD
<<<<<<< HEAD
<<<<<<< HEAD
>>>>>>> 9813375fcc (GEOMESA-3067 Find attribute in Filters with Functions with embedded expressions correctly)
<<<<<<< HEAD
>>>>>>> cf57a2c189 (GEOMESA-3067 Find attribute in Filters with Functions with embedded expressions correctly)
=======
=======
=======
>>>>>>> c8a325e13 (GEOMESA-3061 Converters - support bytes in Avro top-level union types (#2762))
<<<<<<< HEAD
<<<<<<< HEAD
<<<<<<< HEAD
>>>>>>> c9328eddce (GEOMESA-3061 Converters - support bytes in Avro top-level union types (#2762))
<<<<<<< HEAD
>>>>>>> e15d50d7d3 (GEOMESA-3061 Converters - support bytes in Avro top-level union types (#2762))
=======
=======
=======
>>>>>>> 9638dc731 (GEOMESA-3067 Find attribute in Filters with Functions with embedded expressions correctly)
<<<<<<< HEAD
<<<<<<< HEAD
<<<<<<< HEAD
>>>>>>> d2eec4be68 (GEOMESA-3067 Find attribute in Filters with Functions with embedded expressions correctly)
<<<<<<< HEAD
>>>>>>> bec3ba7d08 (GEOMESA-3067 Find attribute in Filters with Functions with embedded expressions correctly)
=======
=======
=======
=======
>>>>>>> b4320946b (GEOMESA-3061 Converters - support bytes in Avro top-level union types (#2762))
>>>>>>> 97ec7d864 (GEOMESA-3061 Converters - support bytes in Avro top-level union types (#2762))
<<<<<<< HEAD
<<<<<<< HEAD
<<<<<<< HEAD
>>>>>>> d94c03a98e (GEOMESA-3061 Converters - support bytes in Avro top-level union types (#2762))
<<<<<<< HEAD
>>>>>>> 8de43cccf6 (GEOMESA-3061 Converters - support bytes in Avro top-level union types (#2762))
=======
=======
=======
>>>>>>> db8d998aa (Merge branch 'feature/postgis-fixes')
<<<<<<< HEAD
<<<<<<< HEAD
<<<<<<< HEAD
>>>>>>> cb6bda89b6 (Merge branch 'feature/postgis-fixes')
<<<<<<< HEAD
>>>>>>> 26e5afc4ea (Merge branch 'feature/postgis-fixes')
=======
=======
=======
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
=======
>>>>>>> 7acc3ea46 (GEOMESA-3067 Find attribute in Filters with Functions with embedded expressions correctly)
>>>>>>> 7bb5f26c3 (GEOMESA-3067 Find attribute in Filters with Functions with embedded expressions correctly)
<<<<<<< HEAD
<<<<<<< HEAD
<<<<<<< HEAD
>>>>>>> e69b2aa6dc (GEOMESA-3067 Find attribute in Filters with Functions with embedded expressions correctly)
<<<<<<< HEAD
>>>>>>> b1a7408547 (GEOMESA-3067 Find attribute in Filters with Functions with embedded expressions correctly)
=======
=======
=======
=======
>>>>>>> e5ed68fdd (GEOMESA-3067 Find attribute in Filters with Functions with embedded expressions correctly)
=======
<<<<<<< HEAD
<<<<<<< HEAD
<<<<<<< HEAD
<<<<<<< HEAD
=======
>>>>>>> 5c6b9f1f8b (GEOMESA-3061 Converters - support bytes in Avro top-level union types (#2762))
=======
>>>>>>> b800c052cc (GEOMESA-3061 Converters - support bytes in Avro top-level union types (#2762))
=======
>>>>>>> cdb410251 (GEOMESA-3061 Converters - support bytes in Avro top-level union types (#2762))
>>>>>>> e6e1f4bdd (GEOMESA-3061 Converters - support bytes in Avro top-level union types (#2762))
=======
>>>>>>> 7acc3ea46 (GEOMESA-3067 Find attribute in Filters with Functions with embedded expressions correctly)
=======
>>>>>>> b9bdd406e (GEOMESA-3061 Converters - support bytes in Avro top-level union types (#2762))
<<<<<<< HEAD
<<<<<<< HEAD
>>>>>>> 6d9a5b626 (GEOMESA-3061 Converters - support bytes in Avro top-level union types (#2762))
<<<<<<< HEAD
>>>>>>> 67e4c1354f (GEOMESA-3061 Converters - support bytes in Avro top-level union types (#2762))
<<<<<<< HEAD
>>>>>>> 12e3a588fc (GEOMESA-3061 Converters - support bytes in Avro top-level union types (#2762))
=======
=======
=======
=======
>>>>>>> e6e1f4bdd (GEOMESA-3061 Converters - support bytes in Avro top-level union types (#2762))
=======
<<<<<<< HEAD
<<<<<<< HEAD
<<<<<<< HEAD
<<<<<<< HEAD
>>>>>>> ef1a0521bd (GEOMESA-3067 Find attribute in Filters with Functions with embedded expressions correctly)
=======
>>>>>>> c3c5dd0ebb (GEOMESA-3061 Converters - support bytes in Avro top-level union types (#2762))
=======
<<<<<<< HEAD
<<<<<<< HEAD
<<<<<<< HEAD
<<<<<<< HEAD
>>>>>>> 67b361c85 (GEOMESA-3061 Converters - support bytes in Avro top-level union types (#2762))
=======
=======
>>>>>>> ef1a0521bd (GEOMESA-3067 Find attribute in Filters with Functions with embedded expressions correctly)
=======
>>>>>>> 530b057384 (GEOMESA-3067 Find attribute in Filters with Functions with embedded expressions correctly)
=======
>>>>>>> 2654d9c120 (GEOMESA-3061 Converters - support bytes in Avro top-level union types (#2762))
=======
>>>>>>> 67b361c85 (GEOMESA-3061 Converters - support bytes in Avro top-level union types (#2762))
=======
>>>>>>> 86ec77f9cb (GEOMESA-3061 Converters - support bytes in Avro top-level union types (#2762))
=======
>>>>>>> ef1a0521bd (GEOMESA-3067 Find attribute in Filters with Functions with embedded expressions correctly)
=======
>>>>>>> 67dc71ffb1 (GEOMESA-3067 Find attribute in Filters with Functions with embedded expressions correctly)
=======
>>>>>>> 058fd96baa (GEOMESA-3061 Converters - support bytes in Avro top-level union types (#2762))
=======
>>>>>>> 67b361c85 (GEOMESA-3061 Converters - support bytes in Avro top-level union types (#2762))
=======
>>>>>>> 2a887f75bf (GEOMESA-3061 Converters - support bytes in Avro top-level union types (#2762))
=======
>>>>>>> 7acc3ea46 (GEOMESA-3067 Find attribute in Filters with Functions with embedded expressions correctly)
>>>>>>> f36b0e8b9 (GEOMESA-3067 Find attribute in Filters with Functions with embedded expressions correctly)
<<<<<<< HEAD
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
>>>>>>> 530b057384 (GEOMESA-3067 Find attribute in Filters with Functions with embedded expressions correctly)
=======
>>>>>>> 2654d9c120 (GEOMESA-3061 Converters - support bytes in Avro top-level union types (#2762))
=======
>>>>>>> 86ec77f9cb (GEOMESA-3061 Converters - support bytes in Avro top-level union types (#2762))
=======
>>>>>>> 67dc71ffb1 (GEOMESA-3067 Find attribute in Filters with Functions with embedded expressions correctly)
=======
>>>>>>> 058fd96baa (GEOMESA-3061 Converters - support bytes in Avro top-level union types (#2762))
=======
>>>>>>> 2a887f75bf (GEOMESA-3061 Converters - support bytes in Avro top-level union types (#2762))
>>>>>>> e5ed68fdd (GEOMESA-3067 Find attribute in Filters with Functions with embedded expressions correctly)
<<<<<<< HEAD
>>>>>>> 060ac2189c (GEOMESA-3067 Find attribute in Filters with Functions with embedded expressions correctly)
<<<<<<< HEAD
>>>>>>> c8e013ff91 (GEOMESA-3067 Find attribute in Filters with Functions with embedded expressions correctly)
=======
=======
=======
=======
>>>>>>> f302a54949 (GEOMESA-3061 Converters - support bytes in Avro top-level union types (#2762))
=======
>>>>>>> cdb410251 (GEOMESA-3061 Converters - support bytes in Avro top-level union types (#2762))
<<<<<<< HEAD
<<<<<<< HEAD
>>>>>>> e6e1f4bdd (GEOMESA-3061 Converters - support bytes in Avro top-level union types (#2762))
<<<<<<< HEAD
>>>>>>> 8035cc5893 (GEOMESA-3061 Converters - support bytes in Avro top-level union types (#2762))
<<<<<<< HEAD
>>>>>>> 1890b11217 (GEOMESA-3061 Converters - support bytes in Avro top-level union types (#2762))
=======
=======
=======
=======
>>>>>>> 20f6826d0f (GEOMESA-3067 Find attribute in Filters with Functions with embedded expressions correctly)
=======
=======
>>>>>>> 7acc3ea46 (GEOMESA-3067 Find attribute in Filters with Functions with embedded expressions correctly)
>>>>>>> e3a63fee1 (GEOMESA-3067 Find attribute in Filters with Functions with embedded expressions correctly)
<<<<<<< HEAD
>>>>>>> 7f922b040 (GEOMESA-3067 Find attribute in Filters with Functions with embedded expressions correctly)
<<<<<<< HEAD
>>>>>>> 04f08c23c5 (GEOMESA-3067 Find attribute in Filters with Functions with embedded expressions correctly)
<<<<<<< HEAD
>>>>>>> 912169b5e9 (GEOMESA-3067 Find attribute in Filters with Functions with embedded expressions correctly)
=======
=======
=======
=======
>>>>>>> 0e68e9f4c (GEOMESA-3061 Converters - support bytes in Avro top-level union types (#2762))
>>>>>>> a910ae135 (GEOMESA-3061 Converters - support bytes in Avro top-level union types (#2762))
<<<<<<< HEAD
>>>>>>> 07161eaaa6 (GEOMESA-3061 Converters - support bytes in Avro top-level union types (#2762))
<<<<<<< HEAD
>>>>>>> 9c28193a91 (GEOMESA-3061 Converters - support bytes in Avro top-level union types (#2762))
=======
=======
=======
>>>>>>> 8fb060734 (GEOMESA-3067 Find attribute in Filters with Functions with embedded expressions correctly)
<<<<<<< HEAD
<<<<<<< HEAD
<<<<<<< HEAD
>>>>>>> 38b3282770 (GEOMESA-3067 Find attribute in Filters with Functions with embedded expressions correctly)
<<<<<<< HEAD
>>>>>>> 1b60c2aeba (GEOMESA-3067 Find attribute in Filters with Functions with embedded expressions correctly)
=======
=======
=======
>>>>>>> ad3cedc4d (GEOMESA-3061 Converters - support bytes in Avro top-level union types (#2762))
<<<<<<< HEAD
<<<<<<< HEAD
<<<<<<< HEAD
>>>>>>> 9abc630fdf (GEOMESA-3061 Converters - support bytes in Avro top-level union types (#2762))
<<<<<<< HEAD
>>>>>>> d294ce49e2 (GEOMESA-3061 Converters - support bytes in Avro top-level union types (#2762))
=======
=======
=======
>>>>>>> bc4913194 (GEOMESA-3067 Find attribute in Filters with Functions with embedded expressions correctly)
<<<<<<< HEAD
<<<<<<< HEAD
<<<<<<< HEAD
>>>>>>> 570899511d (GEOMESA-3067 Find attribute in Filters with Functions with embedded expressions correctly)
<<<<<<< HEAD
>>>>>>> ed45e8551f (GEOMESA-3067 Find attribute in Filters with Functions with embedded expressions correctly)
=======
=======
=======
=======
>>>>>>> b4320946b (GEOMESA-3061 Converters - support bytes in Avro top-level union types (#2762))
>>>>>>> bdbced26d (GEOMESA-3061 Converters - support bytes in Avro top-level union types (#2762))
<<<<<<< HEAD
<<<<<<< HEAD
<<<<<<< HEAD
>>>>>>> 25063957fc (GEOMESA-3061 Converters - support bytes in Avro top-level union types (#2762))
<<<<<<< HEAD
>>>>>>> 1df8328338 (GEOMESA-3061 Converters - support bytes in Avro top-level union types (#2762))
=======
=======
=======
>>>>>>> 1b25d7ddb (Merge branch 'feature/postgis-fixes')
>>>>>>> 699117eca9 (Merge branch 'feature/postgis-fixes')
>>>>>>> c69897d7bd (Merge branch 'feature/postgis-fixes')
=======
=======
>>>>>>> 7acc3ea46 (GEOMESA-3067 Find attribute in Filters with Functions with embedded expressions correctly)
>>>>>>> 74db66044b (GEOMESA-3067 Find attribute in Filters with Functions with embedded expressions correctly)
<<<<<<< HEAD
<<<<<<< HEAD
<<<<<<< HEAD
<<<<<<< HEAD
=======
>>>>>>> 0104fb37e4 (GEOMESA-3061 Converters - support bytes in Avro top-level union types (#2762))
=======
>>>>>>> 9293965a7d (GEOMESA-3061 Converters - support bytes in Avro top-level union types (#2762))
=======
=======
>>>>>>> 7acc3ea46 (GEOMESA-3067 Find attribute in Filters with Functions with embedded expressions correctly)
=======
>>>>>>> b9bdd406e (GEOMESA-3061 Converters - support bytes in Avro top-level union types (#2762))
>>>>>>> f0b9bd8121 (GEOMESA-3061 Converters - support bytes in Avro top-level union types (#2762))
<<<<<<< HEAD
<<<<<<< HEAD
<<<<<<< HEAD
<<<<<<< HEAD
=======
>>>>>>> ef1a0521bd (GEOMESA-3067 Find attribute in Filters with Functions with embedded expressions correctly)
=======
=======
>>>>>>> cdb410251 (GEOMESA-3061 Converters - support bytes in Avro top-level union types (#2762))
>>>>>>> c3c5dd0ebb (GEOMESA-3061 Converters - support bytes in Avro top-level union types (#2762))
<<<<<<< HEAD
<<<<<<< HEAD
<<<<<<< HEAD
<<<<<<< HEAD
=======
>>>>>>> 20f6826d0f (GEOMESA-3067 Find attribute in Filters with Functions with embedded expressions correctly)
=======
=======
>>>>>>> 0e68e9f4c (GEOMESA-3061 Converters - support bytes in Avro top-level union types (#2762))
>>>>>>> 4c361f07da (GEOMESA-3061 Converters - support bytes in Avro top-level union types (#2762))
<<<<<<< HEAD
<<<<<<< HEAD
<<<<<<< HEAD
<<<<<<< HEAD
=======
=======
>>>>>>> a63cb7e74 (GEOMESA-3067 Find attribute in Filters with Functions with embedded expressions correctly)
<<<<<<< HEAD
>>>>>>> 125ffd0575 (GEOMESA-3067 Find attribute in Filters with Functions with embedded expressions correctly)
=======
=======
=======
>>>>>>> cdb410251 (GEOMESA-3061 Converters - support bytes in Avro top-level union types (#2762))
>>>>>>> 67b361c85 (GEOMESA-3061 Converters - support bytes in Avro top-level union types (#2762))
<<<<<<< HEAD
>>>>>>> f302a54949 (GEOMESA-3061 Converters - support bytes in Avro top-level union types (#2762))
=======
=======
=======
>>>>>>> 7acc3ea46 (GEOMESA-3067 Find attribute in Filters with Functions with embedded expressions correctly)
>>>>>>> 908ad4071 (GEOMESA-3067 Find attribute in Filters with Functions with embedded expressions correctly)
<<<<<<< HEAD
<<<<<<< HEAD
<<<<<<< HEAD
<<<<<<< HEAD
<<<<<<< HEAD
=======
>>>>>>> 1bcc513539 (GEOMESA-3061 Converters - support bytes in Avro top-level union types (#2762))
=======
>>>>>>> b08cb4d818 (GEOMESA-3061 Converters - support bytes in Avro top-level union types (#2762))
>>>>>>> a83fe4cf7c (GEOMESA-3067 Find attribute in Filters with Functions with embedded expressions correctly)
=======
=======
>>>>>>> b4320946b (GEOMESA-3061 Converters - support bytes in Avro top-level union types (#2762))
<<<<<<< HEAD
<<<<<<< HEAD
<<<<<<< HEAD
<<<<<<< HEAD
<<<<<<< HEAD
=======
>>>>>>> ec6d06b576 (Merge branch 'feature/postgis-fixes')
=======
>>>>>>> 354b5e5ae5 (Merge branch 'feature/postgis-fixes')
>>>>>>> a788dfac03 (GEOMESA-3061 Converters - support bytes in Avro top-level union types (#2762))
=======
=======
>>>>>>> 3be8d2a5a (Merge branch 'feature/postgis-fixes')
>>>>>>> da00c7bd68 (Merge branch 'feature/postgis-fixes')
<<<<<<< HEAD
<<<<<<< HEAD
<<<<<<< HEAD
=======
>>>>>>> 043f2d0167 (GEOMESA-3067 Find attribute in Filters with Functions with embedded expressions correctly)
=======
=======
>>>>>>> 7acc3ea465 (GEOMESA-3067 Find attribute in Filters with Functions with embedded expressions correctly)
>>>>>>> 32d312dc48 (GEOMESA-3067 Find attribute in Filters with Functions with embedded expressions correctly)
<<<<<<< HEAD
<<<<<<< HEAD
=======
>>>>>>> 59a1fbb96e (GEOMESA-3061 Converters - support bytes in Avro top-level union types (#2762))
=======
>>>>>>> a1d28116d4 (GEOMESA-3067 Find attribute in Filters with Functions with embedded expressions correctly)
<<<<<<< HEAD
<<<<<<< HEAD
=======
=======
>>>>>>> 7bdbfa5524 (GEOMESA-3061 Converters - support bytes in Avro top-level union types (#2762))
=======
=======
=======
=======
>>>>>>> e7d6b701c8 (GEOMESA-3061 Converters - support bytes in Avro top-level union types (#2762))
=======
>>>>>>> 7acc3ea46 (GEOMESA-3067 Find attribute in Filters with Functions with embedded expressions correctly)
=======
>>>>>>> b9bdd406e (GEOMESA-3061 Converters - support bytes in Avro top-level union types (#2762))
>>>>>>> cdb4102515 (GEOMESA-3061 Converters - support bytes in Avro top-level union types (#2762))
<<<<<<< HEAD
<<<<<<< HEAD
<<<<<<< HEAD
<<<<<<< HEAD
<<<<<<< HEAD
>>>>>>> d1fa26b39d (GEOMESA-3061 Converters - support bytes in Avro top-level union types (#2762))
=======
=======
>>>>>>> 17b189175b (GEOMESA-3067 Find attribute in Filters with Functions with embedded expressions correctly)
=======
=======
>>>>>>> 7acc3ea46 (GEOMESA-3067 Find attribute in Filters with Functions with embedded expressions correctly)
>>>>>>> e3a63fee18 (GEOMESA-3067 Find attribute in Filters with Functions with embedded expressions correctly)
<<<<<<< HEAD
<<<<<<< HEAD
<<<<<<< HEAD
>>>>>>> ef55408e9a (GEOMESA-3067 Find attribute in Filters with Functions with embedded expressions correctly)
=======
=======
>>>>>>> 7bff4d0018 (GEOMESA-3061 Converters - support bytes in Avro top-level union types (#2762))
=======
=======
>>>>>>> 7acc3ea46 (GEOMESA-3067 Find attribute in Filters with Functions with embedded expressions correctly)
=======
>>>>>>> b9bdd406e (GEOMESA-3061 Converters - support bytes in Avro top-level union types (#2762))
>>>>>>> 0e68e9f4cc (GEOMESA-3061 Converters - support bytes in Avro top-level union types (#2762))
<<<<<<< HEAD
<<<<<<< HEAD
<<<<<<< HEAD
>>>>>>> f67dd3371e (GEOMESA-3061 Converters - support bytes in Avro top-level union types (#2762))
=======
=======
=======
>>>>>>> 67b361c856 (GEOMESA-3061 Converters - support bytes in Avro top-level union types (#2762))
=======
=======
>>>>>>> 7acc3ea46 (GEOMESA-3067 Find attribute in Filters with Functions with embedded expressions correctly)
>>>>>>> f36b0e8b9 (GEOMESA-3067 Find attribute in Filters with Functions with embedded expressions correctly)
<<<<<<< HEAD
>>>>>>> a63cb7e740 (GEOMESA-3067 Find attribute in Filters with Functions with embedded expressions correctly)
<<<<<<< HEAD
>>>>>>> a9884ff1f6 (GEOMESA-3067 Find attribute in Filters with Functions with embedded expressions correctly)
=======
=======
=======
>>>>>>> cdb410251 (GEOMESA-3061 Converters - support bytes in Avro top-level union types (#2762))
>>>>>>> 67b361c856 (GEOMESA-3061 Converters - support bytes in Avro top-level union types (#2762))
<<<<<<< HEAD
<<<<<<< HEAD
<<<<<<< HEAD
>>>>>>> f7cef54062 (GEOMESA-3061 Converters - support bytes in Avro top-level union types (#2762))
=======
=======
>>>>>>> e31a4215c4 (GEOMESA-3067 Find attribute in Filters with Functions with embedded expressions correctly)
=======
=======
>>>>>>> 7acc3ea46 (GEOMESA-3067 Find attribute in Filters with Functions with embedded expressions correctly)
>>>>>>> 908ad4071d (GEOMESA-3067 Find attribute in Filters with Functions with embedded expressions correctly)
<<<<<<< HEAD
<<<<<<< HEAD
<<<<<<< HEAD
>>>>>>> 49f2a1c310 (GEOMESA-3067 Find attribute in Filters with Functions with embedded expressions correctly)
=======
=======
>>>>>>> 0efbfe547e (GEOMESA-3061 Converters - support bytes in Avro top-level union types (#2762))
=======
=======
>>>>>>> 7acc3ea46 (GEOMESA-3067 Find attribute in Filters with Functions with embedded expressions correctly)
=======
>>>>>>> b9bdd406e (GEOMESA-3061 Converters - support bytes in Avro top-level union types (#2762))
>>>>>>> b4320946b4 (GEOMESA-3061 Converters - support bytes in Avro top-level union types (#2762))
<<<<<<< HEAD
>>>>>>> a16b64a4d1 (GEOMESA-3061 Converters - support bytes in Avro top-level union types (#2762))
=======
>>>>>>> 34472778d3 (Merge branch 'feature/postgis-fixes')
=======
>>>>>>> 5430d59024 (GEOMESA-3067 Find attribute in Filters with Functions with embedded expressions correctly)
=======
>>>>>>> 810876750d (GEOMESA-3061 Converters - support bytes in Avro top-level union types (#2762))
=======
=======
>>>>>>> e182e6e99c (GEOMESA-3067 Find attribute in Filters with Functions with embedded expressions correctly)
>>>>>>> 2571e49519 (GEOMESA-3067 Find attribute in Filters with Functions with embedded expressions correctly)
=======
>>>>>>> d206a68a13 (GEOMESA-3061 Converters - support bytes in Avro top-level union types (#2762))
<<<<<<< HEAD
<<<<<<< HEAD
=======
>>>>>>> 4cf1d8d259 (GEOMESA-3067 Find attribute in Filters with Functions with embedded expressions correctly)
=======
=======
=======
=======
>>>>>>> 7acc3ea46 (GEOMESA-3067 Find attribute in Filters with Functions with embedded expressions correctly)
>>>>>>> e3a63fee1 (GEOMESA-3067 Find attribute in Filters with Functions with embedded expressions correctly)
<<<<<<< HEAD
<<<<<<< HEAD
<<<<<<< HEAD
>>>>>>> 3333975e77 (GEOMESA-3067 Find attribute in Filters with Functions with embedded expressions correctly)
<<<<<<< HEAD
>>>>>>> 9412e85b59 (GEOMESA-3067 Find attribute in Filters with Functions with embedded expressions correctly)
=======
=======
=======
>>>>>>> 0e68e9f4c (GEOMESA-3061 Converters - support bytes in Avro top-level union types (#2762))
<<<<<<< HEAD
>>>>>>> 76618c8da3 (GEOMESA-3061 Converters - support bytes in Avro top-level union types (#2762))
<<<<<<< HEAD
>>>>>>> 694bcd3776 (GEOMESA-3061 Converters - support bytes in Avro top-level union types (#2762))
=======
=======
=======
>>>>>>> a63cb7e74 (GEOMESA-3067 Find attribute in Filters with Functions with embedded expressions correctly)
<<<<<<< HEAD
<<<<<<< HEAD
>>>>>>> c3b0a1b6e3 (GEOMESA-3067 Find attribute in Filters with Functions with embedded expressions correctly)
<<<<<<< HEAD
>>>>>>> 24c4df93a5 (GEOMESA-3067 Find attribute in Filters with Functions with embedded expressions correctly)
=======
=======
=======
=======
>>>>>>> cdb410251 (GEOMESA-3061 Converters - support bytes in Avro top-level union types (#2762))
>>>>>>> 67b361c85 (GEOMESA-3061 Converters - support bytes in Avro top-level union types (#2762))
<<<<<<< HEAD
<<<<<<< HEAD
>>>>>>> c8a325e13c (GEOMESA-3061 Converters - support bytes in Avro top-level union types (#2762))
<<<<<<< HEAD
>>>>>>> 6cd1151639 (GEOMESA-3061 Converters - support bytes in Avro top-level union types (#2762))
=======
=======
=======
=======
>>>>>>> 7acc3ea46 (GEOMESA-3067 Find attribute in Filters with Functions with embedded expressions correctly)
>>>>>>> 908ad4071 (GEOMESA-3067 Find attribute in Filters with Functions with embedded expressions correctly)
<<<<<<< HEAD
<<<<<<< HEAD
>>>>>>> 9638dc731e (GEOMESA-3067 Find attribute in Filters with Functions with embedded expressions correctly)
<<<<<<< HEAD
>>>>>>> 1e00950a90 (GEOMESA-3067 Find attribute in Filters with Functions with embedded expressions correctly)
=======
=======
=======
>>>>>>> b4320946b (GEOMESA-3061 Converters - support bytes in Avro top-level union types (#2762))
<<<<<<< HEAD
<<<<<<< HEAD
>>>>>>> 97ec7d864a (GEOMESA-3061 Converters - support bytes in Avro top-level union types (#2762))
<<<<<<< HEAD
>>>>>>> 1973f72e77 (GEOMESA-3061 Converters - support bytes in Avro top-level union types (#2762))
=======
=======
=======
>>>>>>> 3be8d2a5a (Merge branch 'feature/postgis-fixes')
>>>>>>> db8d998aa2 (Merge branch 'feature/postgis-fixes')
<<<<<<< HEAD
<<<<<<< HEAD
<<<<<<< HEAD
=======
>>>>>>> c738f63bd9 (GEOMESA-3254 Add Bloop build support)
>>>>>>> 42e8565e9b (Merge branch 'feature/postgis-fixes')
=======
=======
>>>>>>> d845d7c1bd (GEOMESA-3254 Add Bloop build support)
<<<<<<< HEAD
<<<<<<< HEAD
<<<<<<< HEAD
<<<<<<< HEAD
>>>>>>> f1532f2313 (GEOMESA-3254 Add Bloop build support)
=======
=======
>>>>>>> bad8172e9b (GEOMESA-3067 Find attribute in Filters with Functions with embedded expressions correctly)
=======
=======
>>>>>>> 7acc3ea46 (GEOMESA-3067 Find attribute in Filters with Functions with embedded expressions correctly)
>>>>>>> 7bb5f26c3e (GEOMESA-3067 Find attribute in Filters with Functions with embedded expressions correctly)
<<<<<<< HEAD
>>>>>>> 4bbf97686c (GEOMESA-3067 Find attribute in Filters with Functions with embedded expressions correctly)
=======
>>>>>>> 96d5d442fa (GEOMESA-3061 Converters - support bytes in Avro top-level union types (#2762))
=======
=======
>>>>>>> e5ed68fdd3 (GEOMESA-3067 Find attribute in Filters with Functions with embedded expressions correctly)
>>>>>>> b3dd8ec805 (GEOMESA-3067 Find attribute in Filters with Functions with embedded expressions correctly)
=======
>>>>>>> 5dcf23da52 (GEOMESA-3061 Converters - support bytes in Avro top-level union types (#2762))
<<<<<<< HEAD
<<<<<<< HEAD
=======
>>>>>>> 6f81d40992 (GEOMESA-3067 Find attribute in Filters with Functions with embedded expressions correctly)
=======
=======
>>>>>>> 7f922b040c (GEOMESA-3067 Find attribute in Filters with Functions with embedded expressions correctly)
>>>>>>> 2b62d1f3fe (GEOMESA-3067 Find attribute in Filters with Functions with embedded expressions correctly)
<<<<<<< HEAD
<<<<<<< HEAD
=======
>>>>>>> 92674ff9d4 (GEOMESA-3061 Converters - support bytes in Avro top-level union types (#2762))
=======
>>>>>>> c169cb2905 (GEOMESA-3067 Find attribute in Filters with Functions with embedded expressions correctly)
<<<<<<< HEAD
<<<<<<< HEAD
=======
>>>>>>> 7b8c8dcc3d (GEOMESA-3061 Converters - support bytes in Avro top-level union types (#2762))
=======
=======
>>>>>>> ad3cedc4db (GEOMESA-3061 Converters - support bytes in Avro top-level union types (#2762))
>>>>>>> 9a4dff9e4f (GEOMESA-3061 Converters - support bytes in Avro top-level union types (#2762))
<<<<<<< HEAD
<<<<<<< HEAD
=======
>>>>>>> 63ca73533e (GEOMESA-3067 Find attribute in Filters with Functions with embedded expressions correctly)
=======
>>>>>>> 0fc6650ecf (GEOMESA-3061 Converters - support bytes in Avro top-level union types (#2762))
<<<<<<< HEAD
<<<<<<< HEAD
=======
>>>>>>> 67de3c3202 (Merge branch 'feature/postgis-fixes')
=======
=======
=======
>>>>>>> 87bf55340 (GEOMESA-3061 Converters - support bytes in Avro top-level union types (#2762))
<<<<<<< HEAD
<<<<<<< HEAD
<<<<<<< HEAD
>>>>>>> 0dbede148d (GEOMESA-3061 Converters - support bytes in Avro top-level union types (#2762))
<<<<<<< HEAD
>>>>>>> 1bb69524c2 (GEOMESA-3061 Converters - support bytes in Avro top-level union types (#2762))
=======
=======
=======
=======
>>>>>>> cdb410251 (GEOMESA-3061 Converters - support bytes in Avro top-level union types (#2762))
>>>>>>> 240977229 (GEOMESA-3061 Converters - support bytes in Avro top-level union types (#2762))
>>>>>>> 22dcc8170f (GEOMESA-3061 Converters - support bytes in Avro top-level union types (#2762))
>>>>>>> 8c9ca1211a (GEOMESA-3061 Converters - support bytes in Avro top-level union types (#2762))
=======
>>>>>>> b009fd23f4 (GEOMESA-3061 Converters - support bytes in Avro top-level union types (#2762))
>>>>>>> a22efb4d66 (GEOMESA-3061 Converters - support bytes in Avro top-level union types (#2762))
<<<<<<< HEAD
<<<<<<< HEAD
=======
>>>>>>> 238945d4b3 (GEOMESA-3061 Converters - support bytes in Avro top-level union types (#2762))
>>>>>>> 1cad375176 (GEOMESA-3061 Converters - support bytes in Avro top-level union types (#2762))
=======
>>>>>>> bc4062951d (GEOMESA-3061 Converters - support bytes in Avro top-level union types (#2762))
>>>>>>> 1e39c0c27d (GEOMESA-3061 Converters - support bytes in Avro top-level union types (#2762))
<<<<<<< HEAD
=======
>>>>>>> e944f1c88b (Merge branch 'feature/postgis-fixes')
>>>>>>> 638b68d081 (Merge branch 'feature/postgis-fixes')
=======
=======
>>>>>>> a1f15598cb (GEOMESA-3061 Converters - support bytes in Avro top-level union types (#2762))
>>>>>>> 8a3e82747d (GEOMESA-3067 Find attribute in Filters with Functions with embedded expressions correctly)
<<<<<<< HEAD
>>>>>>> deb8fd68de (GEOMESA-3067 Find attribute in Filters with Functions with embedded expressions correctly)
<<<<<<< HEAD
>>>>>>> a990cf104e (GEOMESA-3067 Find attribute in Filters with Functions with embedded expressions correctly)
=======
=======
=======
=======
>>>>>>> d9ed077cd (GEOMESA-3061 Converters - support bytes in Avro top-level union types (#2762))
=======
>>>>>>> 4373c901b3 (GEOMESA-3067 Find attribute in Filters with Functions with embedded expressions correctly)
>>>>>>> 81ee66102b (GEOMESA-3061 Converters - support bytes in Avro top-level union types (#2762))
<<<<<<< HEAD
>>>>>>> 8adfab65bb (GEOMESA-3061 Converters - support bytes in Avro top-level union types (#2762))
<<<<<<< HEAD
>>>>>>> a1f15598cb (GEOMESA-3061 Converters - support bytes in Avro top-level union types (#2762))
=======
=======
=======
=======
>>>>>>> e182e6e99 (GEOMESA-3067 Find attribute in Filters with Functions with embedded expressions correctly)
=======
>>>>>>> 963feec660 (GEOMESA-3061 Converters - support bytes in Avro top-level union types (#2762))
>>>>>>> 9943e05ec9 (GEOMESA-3067 Find attribute in Filters with Functions with embedded expressions correctly)
<<<<<<< HEAD
>>>>>>> 3254b186da (GEOMESA-3067 Find attribute in Filters with Functions with embedded expressions correctly)
<<<<<<< HEAD
>>>>>>> 4373c901b3 (GEOMESA-3067 Find attribute in Filters with Functions with embedded expressions correctly)
=======
=======
=======
=======
=======
>>>>>>> cdb410251 (GEOMESA-3061 Converters - support bytes in Avro top-level union types (#2762))
>>>>>>> 9d708b240 (GEOMESA-3061 Converters - support bytes in Avro top-level union types (#2762))
=======
>>>>>>> 2c14568a23 (GEOMESA-3067 Find attribute in Filters with Functions with embedded expressions correctly)
>>>>>>> 53a3e72cbf (GEOMESA-3061 Converters - support bytes in Avro top-level union types (#2762))
<<<<<<< HEAD
>>>>>>> 7b0539b808 (GEOMESA-3061 Converters - support bytes in Avro top-level union types (#2762))
<<<<<<< HEAD
>>>>>>> 963feec660 (GEOMESA-3061 Converters - support bytes in Avro top-level union types (#2762))
=======
=======
=======
=======
>>>>>>> 3333975e7 (GEOMESA-3067 Find attribute in Filters with Functions with embedded expressions correctly)
=======
>>>>>>> 84ac051f28 (GEOMESA-3061 Converters - support bytes in Avro top-level union types (#2762))
>>>>>>> d15af7157e (GEOMESA-3067 Find attribute in Filters with Functions with embedded expressions correctly)
<<<<<<< HEAD
>>>>>>> 982031ef44 (GEOMESA-3067 Find attribute in Filters with Functions with embedded expressions correctly)
<<<<<<< HEAD
>>>>>>> 2c14568a23 (GEOMESA-3067 Find attribute in Filters with Functions with embedded expressions correctly)
=======
=======
=======
=======
=======
>>>>>>> 0e68e9f4c (GEOMESA-3061 Converters - support bytes in Avro top-level union types (#2762))
>>>>>>> 76618c8da (GEOMESA-3061 Converters - support bytes in Avro top-level union types (#2762))
=======
>>>>>>> 99acaa0887 (GEOMESA-3067 Find attribute in Filters with Functions with embedded expressions correctly)
>>>>>>> 947761ec9b (GEOMESA-3061 Converters - support bytes in Avro top-level union types (#2762))
<<<<<<< HEAD
>>>>>>> 0086b292ba (GEOMESA-3061 Converters - support bytes in Avro top-level union types (#2762))
<<<<<<< HEAD
>>>>>>> 84ac051f28 (GEOMESA-3061 Converters - support bytes in Avro top-level union types (#2762))
=======
=======
=======
=======
>>>>>>> c3b0a1b6e (GEOMESA-3067 Find attribute in Filters with Functions with embedded expressions correctly)
=======
>>>>>>> fe3de10f11 (GEOMESA-3061 Converters - support bytes in Avro top-level union types (#2762))
>>>>>>> 9813375fcc (GEOMESA-3067 Find attribute in Filters with Functions with embedded expressions correctly)
<<<<<<< HEAD
>>>>>>> cf57a2c189 (GEOMESA-3067 Find attribute in Filters with Functions with embedded expressions correctly)
<<<<<<< HEAD
>>>>>>> 99acaa0887 (GEOMESA-3067 Find attribute in Filters with Functions with embedded expressions correctly)
=======
=======
=======
=======
>>>>>>> c8a325e13 (GEOMESA-3061 Converters - support bytes in Avro top-level union types (#2762))
=======
>>>>>>> 21deff19fd (GEOMESA-3067 Find attribute in Filters with Functions with embedded expressions correctly)
>>>>>>> c9328eddce (GEOMESA-3061 Converters - support bytes in Avro top-level union types (#2762))
<<<<<<< HEAD
>>>>>>> e15d50d7d3 (GEOMESA-3061 Converters - support bytes in Avro top-level union types (#2762))
<<<<<<< HEAD
>>>>>>> fe3de10f11 (GEOMESA-3061 Converters - support bytes in Avro top-level union types (#2762))
=======
=======
=======
=======
>>>>>>> 9638dc731 (GEOMESA-3067 Find attribute in Filters with Functions with embedded expressions correctly)
=======
>>>>>>> d0785cf307 (GEOMESA-3061 Converters - support bytes in Avro top-level union types (#2762))
>>>>>>> d2eec4be68 (GEOMESA-3067 Find attribute in Filters with Functions with embedded expressions correctly)
<<<<<<< HEAD
>>>>>>> bec3ba7d08 (GEOMESA-3067 Find attribute in Filters with Functions with embedded expressions correctly)
<<<<<<< HEAD
>>>>>>> 21deff19fd (GEOMESA-3067 Find attribute in Filters with Functions with embedded expressions correctly)
=======
=======
=======
=======
=======
>>>>>>> b4320946b (GEOMESA-3061 Converters - support bytes in Avro top-level union types (#2762))
>>>>>>> 97ec7d864 (GEOMESA-3061 Converters - support bytes in Avro top-level union types (#2762))
=======
>>>>>>> 71adb695c5 (Merge branch 'feature/postgis-fixes')
>>>>>>> d94c03a98e (GEOMESA-3061 Converters - support bytes in Avro top-level union types (#2762))
<<<<<<< HEAD
>>>>>>> 8de43cccf6 (GEOMESA-3061 Converters - support bytes in Avro top-level union types (#2762))
<<<<<<< HEAD
>>>>>>> d0785cf307 (GEOMESA-3061 Converters - support bytes in Avro top-level union types (#2762))
=======
=======
=======
=======
>>>>>>> db8d998aa (Merge branch 'feature/postgis-fixes')
=======
>>>>>>> 5a4c24e020 (GEOMESA-3254 Add Bloop build support)
>>>>>>> cb6bda89b6 (Merge branch 'feature/postgis-fixes')
<<<<<<< HEAD
>>>>>>> 26e5afc4ea (Merge branch 'feature/postgis-fixes')
<<<<<<< HEAD
>>>>>>> 71adb695c5 (Merge branch 'feature/postgis-fixes')
=======
=======
=======
=======
>>>>>>> d845d7c1b (GEOMESA-3254 Add Bloop build support)
=======
>>>>>>> 53900605ca (GEOMESA-3067 Find attribute in Filters with Functions with embedded expressions correctly)
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
>>>>>>> 7acc3ea46 (GEOMESA-3067 Find attribute in Filters with Functions with embedded expressions correctly)
>>>>>>> 7bb5f26c3 (GEOMESA-3067 Find attribute in Filters with Functions with embedded expressions correctly)
=======
>>>>>>> a52e4429be (GEOMESA-3061 Converters - support bytes in Avro top-level union types (#2762))
>>>>>>> e69b2aa6dc (GEOMESA-3067 Find attribute in Filters with Functions with embedded expressions correctly)
<<<<<<< HEAD
>>>>>>> b1a7408547 (GEOMESA-3067 Find attribute in Filters with Functions with embedded expressions correctly)
<<<<<<< HEAD
>>>>>>> 53900605ca (GEOMESA-3067 Find attribute in Filters with Functions with embedded expressions correctly)
=======
=======
=======
=======
=======
=======
>>>>>>> 5f01e2c4fc (GEOMESA-3067 Find attribute in Filters with Functions with embedded expressions correctly)
>>>>>>> 7acc3ea46 (GEOMESA-3067 Find attribute in Filters with Functions with embedded expressions correctly)
=======
>>>>>>> b9bdd406e (GEOMESA-3061 Converters - support bytes in Avro top-level union types (#2762))
<<<<<<< HEAD
>>>>>>> 6d9a5b626 (GEOMESA-3061 Converters - support bytes in Avro top-level union types (#2762))
<<<<<<< HEAD
>>>>>>> 67e4c1354f (GEOMESA-3061 Converters - support bytes in Avro top-level union types (#2762))
<<<<<<< HEAD
>>>>>>> 12e3a588fc (GEOMESA-3061 Converters - support bytes in Avro top-level union types (#2762))
<<<<<<< HEAD
>>>>>>> a52e4429be (GEOMESA-3061 Converters - support bytes in Avro top-level union types (#2762))
=======
=======
=======
=======
=======
=======
>>>>>>> 5c6b9f1f8b (GEOMESA-3061 Converters - support bytes in Avro top-level union types (#2762))
=======
>>>>>>> 7acc3ea46 (GEOMESA-3067 Find attribute in Filters with Functions with embedded expressions correctly)
>>>>>>> f36b0e8b9 (GEOMESA-3067 Find attribute in Filters with Functions with embedded expressions correctly)
<<<<<<< HEAD
>>>>>>> e5ed68fdd (GEOMESA-3067 Find attribute in Filters with Functions with embedded expressions correctly)
<<<<<<< HEAD
>>>>>>> 060ac2189c (GEOMESA-3067 Find attribute in Filters with Functions with embedded expressions correctly)
<<<<<<< HEAD
>>>>>>> c8e013ff91 (GEOMESA-3067 Find attribute in Filters with Functions with embedded expressions correctly)
<<<<<<< HEAD
>>>>>>> 5f01e2c4fc (GEOMESA-3067 Find attribute in Filters with Functions with embedded expressions correctly)
=======
=======
=======
=======
=======
>>>>>>> cdb410251 (GEOMESA-3061 Converters - support bytes in Avro top-level union types (#2762))
<<<<<<< HEAD
>>>>>>> e6e1f4bdd (GEOMESA-3061 Converters - support bytes in Avro top-level union types (#2762))
<<<<<<< HEAD
>>>>>>> 8035cc5893 (GEOMESA-3061 Converters - support bytes in Avro top-level union types (#2762))
<<<<<<< HEAD
>>>>>>> 1890b11217 (GEOMESA-3061 Converters - support bytes in Avro top-level union types (#2762))
<<<<<<< HEAD
>>>>>>> 5c6b9f1f8b (GEOMESA-3061 Converters - support bytes in Avro top-level union types (#2762))
=======
=======
=======
=======
=======
=======
>>>>>>> 7acc3ea46 (GEOMESA-3067 Find attribute in Filters with Functions with embedded expressions correctly)
>>>>>>> e3a63fee1 (GEOMESA-3067 Find attribute in Filters with Functions with embedded expressions correctly)
>>>>>>> 7f922b040 (GEOMESA-3067 Find attribute in Filters with Functions with embedded expressions correctly)
<<<<<<< HEAD
>>>>>>> 04f08c23c5 (GEOMESA-3067 Find attribute in Filters with Functions with embedded expressions correctly)
<<<<<<< HEAD
>>>>>>> 912169b5e9 (GEOMESA-3067 Find attribute in Filters with Functions with embedded expressions correctly)
<<<<<<< HEAD
>>>>>>> 511bd92a86 (GEOMESA-3067 Find attribute in Filters with Functions with embedded expressions correctly)
=======
=======
=======
=======
=======
>>>>>>> 0e68e9f4c (GEOMESA-3061 Converters - support bytes in Avro top-level union types (#2762))
>>>>>>> a910ae135 (GEOMESA-3061 Converters - support bytes in Avro top-level union types (#2762))
<<<<<<< HEAD
>>>>>>> 07161eaaa6 (GEOMESA-3061 Converters - support bytes in Avro top-level union types (#2762))
<<<<<<< HEAD
>>>>>>> 9c28193a91 (GEOMESA-3061 Converters - support bytes in Avro top-level union types (#2762))
<<<<<<< HEAD
>>>>>>> 9d44ff473d (GEOMESA-3061 Converters - support bytes in Avro top-level union types (#2762))
=======
=======
=======
=======
>>>>>>> 8fb060734 (GEOMESA-3067 Find attribute in Filters with Functions with embedded expressions correctly)
=======
>>>>>>> a35efac12e (GEOMESA-3061 Converters - support bytes in Avro top-level union types (#2762))
>>>>>>> 38b3282770 (GEOMESA-3067 Find attribute in Filters with Functions with embedded expressions correctly)
<<<<<<< HEAD
>>>>>>> 1b60c2aeba (GEOMESA-3067 Find attribute in Filters with Functions with embedded expressions correctly)
<<<<<<< HEAD
>>>>>>> bff2bdde04 (GEOMESA-3067 Find attribute in Filters with Functions with embedded expressions correctly)
=======
=======
=======
=======
>>>>>>> ad3cedc4d (GEOMESA-3061 Converters - support bytes in Avro top-level union types (#2762))
=======
>>>>>>> 323528580f (GEOMESA-3067 Find attribute in Filters with Functions with embedded expressions correctly)
>>>>>>> 9abc630fdf (GEOMESA-3061 Converters - support bytes in Avro top-level union types (#2762))
<<<<<<< HEAD
>>>>>>> d294ce49e2 (GEOMESA-3061 Converters - support bytes in Avro top-level union types (#2762))
<<<<<<< HEAD
>>>>>>> a35efac12e (GEOMESA-3061 Converters - support bytes in Avro top-level union types (#2762))
=======
=======
=======
=======
>>>>>>> bc4913194 (GEOMESA-3067 Find attribute in Filters with Functions with embedded expressions correctly)
=======
>>>>>>> fd5565dfba (GEOMESA-3061 Converters - support bytes in Avro top-level union types (#2762))
>>>>>>> 570899511d (GEOMESA-3067 Find attribute in Filters with Functions with embedded expressions correctly)
<<<<<<< HEAD
>>>>>>> ed45e8551f (GEOMESA-3067 Find attribute in Filters with Functions with embedded expressions correctly)
<<<<<<< HEAD
>>>>>>> 323528580f (GEOMESA-3067 Find attribute in Filters with Functions with embedded expressions correctly)
=======
=======
=======
=======
=======
>>>>>>> b4320946b (GEOMESA-3061 Converters - support bytes in Avro top-level union types (#2762))
>>>>>>> bdbced26d (GEOMESA-3061 Converters - support bytes in Avro top-level union types (#2762))
=======
>>>>>>> 30559ea5c9 (Merge branch 'feature/postgis-fixes')
>>>>>>> 25063957fc (GEOMESA-3061 Converters - support bytes in Avro top-level union types (#2762))
<<<<<<< HEAD
>>>>>>> 1df8328338 (GEOMESA-3061 Converters - support bytes in Avro top-level union types (#2762))
<<<<<<< HEAD
>>>>>>> fd5565dfba (GEOMESA-3061 Converters - support bytes in Avro top-level union types (#2762))
=======
=======
=======
=======
>>>>>>> 1b25d7ddb (Merge branch 'feature/postgis-fixes')
>>>>>>> 699117eca9 (Merge branch 'feature/postgis-fixes')
>>>>>>> c69897d7bd (Merge branch 'feature/postgis-fixes')
>>>>>>> 30559ea5c9 (Merge branch 'feature/postgis-fixes')
=======
>>>>>>> 78fe4921a6 (GEOMESA-3067 Find attribute in Filters with Functions with embedded expressions correctly)
=======
>>>>>>> 0104fb37e4 (GEOMESA-3061 Converters - support bytes in Avro top-level union types (#2762))
=======
=======
>>>>>>> ef1a0521bd (GEOMESA-3067 Find attribute in Filters with Functions with embedded expressions correctly)
>>>>>>> 530b057384 (GEOMESA-3067 Find attribute in Filters with Functions with embedded expressions correctly)
=======
>>>>>>> 2654d9c120 (GEOMESA-3061 Converters - support bytes in Avro top-level union types (#2762))
=======
=======
>>>>>>> 20f6826d0f (GEOMESA-3067 Find attribute in Filters with Functions with embedded expressions correctly)
>>>>>>> de7d6ef448 (GEOMESA-3067 Find attribute in Filters with Functions with embedded expressions correctly)
=======
>>>>>>> f110463a26 (GEOMESA-3061 Converters - support bytes in Avro top-level union types (#2762))
=======
=======
=======
>>>>>>> a63cb7e74 (GEOMESA-3067 Find attribute in Filters with Functions with embedded expressions correctly)
<<<<<<< HEAD
>>>>>>> 125ffd0575 (GEOMESA-3067 Find attribute in Filters with Functions with embedded expressions correctly)
<<<<<<< HEAD
>>>>>>> d83561962d (GEOMESA-3067 Find attribute in Filters with Functions with embedded expressions correctly)
=======
=======
=======
=======
>>>>>>> cdb410251 (GEOMESA-3061 Converters - support bytes in Avro top-level union types (#2762))
>>>>>>> 67b361c85 (GEOMESA-3061 Converters - support bytes in Avro top-level union types (#2762))
>>>>>>> f302a54949 (GEOMESA-3061 Converters - support bytes in Avro top-level union types (#2762))
>>>>>>> 86ec77f9cb (GEOMESA-3061 Converters - support bytes in Avro top-level union types (#2762))
=======
>>>>>>> a83fe4cf7c (GEOMESA-3067 Find attribute in Filters with Functions with embedded expressions correctly)
>>>>>>> 17883cb601 (GEOMESA-3067 Find attribute in Filters with Functions with embedded expressions correctly)
=======
>>>>>>> a788dfac03 (GEOMESA-3061 Converters - support bytes in Avro top-level union types (#2762))
>>>>>>> 1bcc513539 (GEOMESA-3061 Converters - support bytes in Avro top-level union types (#2762))
=======
>>>>>>> ec6d06b576 (Merge branch 'feature/postgis-fixes')
=======
=======
>>>>>>> 7acc3ea465 (GEOMESA-3067 Find attribute in Filters with Functions with embedded expressions correctly)
>>>>>>> 724c808fa8 (GEOMESA-3067 Find attribute in Filters with Functions with embedded expressions correctly)
=======
>>>>>>> 3d5144418e (GEOMESA-3061 Converters - support bytes in Avro top-level union types (#2762))
=======
>>>>>>> efb6723f42 (GEOMESA-3067 Find attribute in Filters with Functions with embedded expressions correctly)
=======
>>>>>>> 7bdbfa5524 (GEOMESA-3061 Converters - support bytes in Avro top-level union types (#2762))
=======
>>>>>>> 17b189175b (GEOMESA-3067 Find attribute in Filters with Functions with embedded expressions correctly)
=======
>>>>>>> 7bff4d0018 (GEOMESA-3061 Converters - support bytes in Avro top-level union types (#2762))
=======
=======
=======
>>>>>>> 67b361c856 (GEOMESA-3061 Converters - support bytes in Avro top-level union types (#2762))
=======
=======
>>>>>>> 7acc3ea46 (GEOMESA-3067 Find attribute in Filters with Functions with embedded expressions correctly)
>>>>>>> f36b0e8b9 (GEOMESA-3067 Find attribute in Filters with Functions with embedded expressions correctly)
<<<<<<< HEAD
>>>>>>> a63cb7e740 (GEOMESA-3067 Find attribute in Filters with Functions with embedded expressions correctly)
<<<<<<< HEAD
>>>>>>> 657a38673a (GEOMESA-3067 Find attribute in Filters with Functions with embedded expressions correctly)
=======
=======
=======
>>>>>>> cdb410251 (GEOMESA-3061 Converters - support bytes in Avro top-level union types (#2762))
>>>>>>> 67b361c856 (GEOMESA-3061 Converters - support bytes in Avro top-level union types (#2762))
>>>>>>> e8b736ee96 (GEOMESA-3061 Converters - support bytes in Avro top-level union types (#2762))
=======
>>>>>>> e31a4215c4 (GEOMESA-3067 Find attribute in Filters with Functions with embedded expressions correctly)
=======
>>>>>>> 0efbfe547e (GEOMESA-3061 Converters - support bytes in Avro top-level union types (#2762))
=======
>>>>>>> 4c41429da9 (Merge branch 'feature/postgis-fixes')
=======
>>>>>>> ca13f8551e (GEOMESA-3067 Find attribute in Filters with Functions with embedded expressions correctly)
=======
>>>>>>> d498bef1ce (GEOMESA-3061 Converters - support bytes in Avro top-level union types (#2762))
=======
=======
>>>>>>> e182e6e99c (GEOMESA-3067 Find attribute in Filters with Functions with embedded expressions correctly)
>>>>>>> cd4422a10c (GEOMESA-3067 Find attribute in Filters with Functions with embedded expressions correctly)
=======
>>>>>>> a5b160f47b (GEOMESA-3061 Converters - support bytes in Avro top-level union types (#2762))
=======
=======
=======
=======
>>>>>>> 7acc3ea46 (GEOMESA-3067 Find attribute in Filters with Functions with embedded expressions correctly)
>>>>>>> e3a63fee1 (GEOMESA-3067 Find attribute in Filters with Functions with embedded expressions correctly)
<<<<<<< HEAD
>>>>>>> 3333975e77 (GEOMESA-3067 Find attribute in Filters with Functions with embedded expressions correctly)
<<<<<<< HEAD
>>>>>>> fa429c7863 (GEOMESA-3067 Find attribute in Filters with Functions with embedded expressions correctly)
=======
=======
=======
>>>>>>> 0e68e9f4c (GEOMESA-3061 Converters - support bytes in Avro top-level union types (#2762))
<<<<<<< HEAD
>>>>>>> 76618c8da3 (GEOMESA-3061 Converters - support bytes in Avro top-level union types (#2762))
<<<<<<< HEAD
>>>>>>> 5cf31d21f3 (GEOMESA-3061 Converters - support bytes in Avro top-level union types (#2762))
=======
=======
=======
>>>>>>> a63cb7e74 (GEOMESA-3067 Find attribute in Filters with Functions with embedded expressions correctly)
<<<<<<< HEAD
>>>>>>> c3b0a1b6e3 (GEOMESA-3067 Find attribute in Filters with Functions with embedded expressions correctly)
<<<<<<< HEAD
>>>>>>> def2794bb5 (GEOMESA-3067 Find attribute in Filters with Functions with embedded expressions correctly)
=======
=======
=======
=======
>>>>>>> cdb410251 (GEOMESA-3061 Converters - support bytes in Avro top-level union types (#2762))
>>>>>>> 67b361c85 (GEOMESA-3061 Converters - support bytes in Avro top-level union types (#2762))
<<<<<<< HEAD
>>>>>>> c8a325e13c (GEOMESA-3061 Converters - support bytes in Avro top-level union types (#2762))
<<<<<<< HEAD
>>>>>>> 94fecee1d8 (GEOMESA-3061 Converters - support bytes in Avro top-level union types (#2762))
=======
=======
=======
=======
>>>>>>> 7acc3ea46 (GEOMESA-3067 Find attribute in Filters with Functions with embedded expressions correctly)
>>>>>>> 908ad4071 (GEOMESA-3067 Find attribute in Filters with Functions with embedded expressions correctly)
<<<<<<< HEAD
>>>>>>> 9638dc731e (GEOMESA-3067 Find attribute in Filters with Functions with embedded expressions correctly)
<<<<<<< HEAD
>>>>>>> f8d3d445c0 (GEOMESA-3067 Find attribute in Filters with Functions with embedded expressions correctly)
=======
=======
=======
>>>>>>> b4320946b (GEOMESA-3061 Converters - support bytes in Avro top-level union types (#2762))
<<<<<<< HEAD
>>>>>>> 97ec7d864a (GEOMESA-3061 Converters - support bytes in Avro top-level union types (#2762))
<<<<<<< HEAD
>>>>>>> 4599715c51 (d)
=======
=======
=======
>>>>>>> 3be8d2a5a (Merge branch 'feature/postgis-fixes')
>>>>>>> db8d998aa2 (Merge branch 'feature/postgis-fixes')
>>>>>>> 6e0709aba8 (Merge branch 'feature/postgis-fixes')
=======
=======
>>>>>>> d845d7c1bd (GEOMESA-3254 Add Bloop build support)
>>>>>>> 7a84c9d22d (GEOMESA-3254 Add Bloop build support)
=======
>>>>>>> bad8172e9b (GEOMESA-3067 Find attribute in Filters with Functions with embedded expressions correctly)
=======
>>>>>>> 7fbbd56493 (GEOMESA-3061 Converters - support bytes in Avro top-level union types (#2762))
=======
=======
>>>>>>> e5ed68fdd3 (GEOMESA-3067 Find attribute in Filters with Functions with embedded expressions correctly)
>>>>>>> e582c3ecfe (GEOMESA-3067 Find attribute in Filters with Functions with embedded expressions correctly)
=======
>>>>>>> 3eb12f79a9 (GEOMESA-3061 Converters - support bytes in Avro top-level union types (#2762))
=======
=======
>>>>>>> 7f922b040c (GEOMESA-3067 Find attribute in Filters with Functions with embedded expressions correctly)
>>>>>>> 8b16ac5c65 (GEOMESA-3067 Find attribute in Filters with Functions with embedded expressions correctly)
=======
>>>>>>> 4ccd6f6b1f (GEOMESA-3061 Converters - support bytes in Avro top-level union types (#2762))
=======
>>>>>>> f983ea29f0 (GEOMESA-3067 Find attribute in Filters with Functions with embedded expressions correctly)
=======
=======
>>>>>>> ad3cedc4db (GEOMESA-3061 Converters - support bytes in Avro top-level union types (#2762))
>>>>>>> 35b69b8f2f (GEOMESA-3061 Converters - support bytes in Avro top-level union types (#2762))
=======
>>>>>>> da4e2905b4 (GEOMESA-3067 Find attribute in Filters with Functions with embedded expressions correctly)
=======
>>>>>>> db8a3a22b2 (GEOMESA-3061 Converters - support bytes in Avro top-level union types (#2762))
=======
>>>>>>> ed25decdd5 (Merge branch 'feature/postgis-fixes')
=======
=======
=======
>>>>>>> 87bf55340 (GEOMESA-3061 Converters - support bytes in Avro top-level union types (#2762))
<<<<<<< HEAD
>>>>>>> 0dbede148d (GEOMESA-3061 Converters - support bytes in Avro top-level union types (#2762))
<<<<<<< HEAD
>>>>>>> 27afb28ab6 (GEOMESA-3061 Converters - support bytes in Avro top-level union types (#2762))
=======
=======
=======
=======
>>>>>>> cdb410251 (GEOMESA-3061 Converters - support bytes in Avro top-level union types (#2762))
>>>>>>> 240977229 (GEOMESA-3061 Converters - support bytes in Avro top-level union types (#2762))
>>>>>>> 22dcc8170f (GEOMESA-3061 Converters - support bytes in Avro top-level union types (#2762))
>>>>>>> 26a09ee6c2 (GEOMESA-3061 Converters - support bytes in Avro top-level union types (#2762))
=======
>>>>>>> b009fd23f4 (GEOMESA-3061 Converters - support bytes in Avro top-level union types (#2762))
>>>>>>> 194ad4e5c0 (GEOMESA-3061 Converters - support bytes in Avro top-level union types (#2762))
=======
>>>>>>> 238945d4b3 (GEOMESA-3061 Converters - support bytes in Avro top-level union types (#2762))
>>>>>>> 7b3c90c53f (GEOMESA-3061 Converters - support bytes in Avro top-level union types (#2762))
=======
>>>>>>> bc4062951d (GEOMESA-3061 Converters - support bytes in Avro top-level union types (#2762))
>>>>>>> db9dfb6f14 (GEOMESA-3061 Converters - support bytes in Avro top-level union types (#2762))
=======
>>>>>>> e944f1c88b (Merge branch 'feature/postgis-fixes')
>>>>>>> f893d9a594 (Merge branch 'feature/postgis-fixes')
=======
=======
>>>>>>> b8ebbf6083 (GEOMESA-3061 Converters - support bytes in Avro top-level union types (#2762))
>>>>>>> 8a3e82747d (GEOMESA-3067 Find attribute in Filters with Functions with embedded expressions correctly)
<<<<<<< HEAD
>>>>>>> deb8fd68de (GEOMESA-3067 Find attribute in Filters with Functions with embedded expressions correctly)
<<<<<<< HEAD
>>>>>>> f33d55e2ba (GEOMESA-3067 Find attribute in Filters with Functions with embedded expressions correctly)
=======
=======
=======
=======
>>>>>>> d9ed077cd (GEOMESA-3061 Converters - support bytes in Avro top-level union types (#2762))
=======
>>>>>>> 1278241911 (GEOMESA-3067 Find attribute in Filters with Functions with embedded expressions correctly)
>>>>>>> 81ee66102b (GEOMESA-3061 Converters - support bytes in Avro top-level union types (#2762))
<<<<<<< HEAD
>>>>>>> 8adfab65bb (GEOMESA-3061 Converters - support bytes in Avro top-level union types (#2762))
<<<<<<< HEAD
>>>>>>> b8ebbf6083 (GEOMESA-3061 Converters - support bytes in Avro top-level union types (#2762))
=======
=======
=======
=======
>>>>>>> e182e6e99 (GEOMESA-3067 Find attribute in Filters with Functions with embedded expressions correctly)
=======
>>>>>>> 3e7fb62639 (GEOMESA-3061 Converters - support bytes in Avro top-level union types (#2762))
>>>>>>> 9943e05ec9 (GEOMESA-3067 Find attribute in Filters with Functions with embedded expressions correctly)
<<<<<<< HEAD
>>>>>>> 3254b186da (GEOMESA-3067 Find attribute in Filters with Functions with embedded expressions correctly)
<<<<<<< HEAD
>>>>>>> 1278241911 (GEOMESA-3067 Find attribute in Filters with Functions with embedded expressions correctly)
=======
=======
=======
=======
=======
>>>>>>> cdb410251 (GEOMESA-3061 Converters - support bytes in Avro top-level union types (#2762))
>>>>>>> 9d708b240 (GEOMESA-3061 Converters - support bytes in Avro top-level union types (#2762))
=======
>>>>>>> 00d66ae013 (GEOMESA-3067 Find attribute in Filters with Functions with embedded expressions correctly)
>>>>>>> 53a3e72cbf (GEOMESA-3061 Converters - support bytes in Avro top-level union types (#2762))
<<<<<<< HEAD
>>>>>>> 7b0539b808 (GEOMESA-3061 Converters - support bytes in Avro top-level union types (#2762))
<<<<<<< HEAD
>>>>>>> 3e7fb62639 (GEOMESA-3061 Converters - support bytes in Avro top-level union types (#2762))
=======
=======
=======
=======
>>>>>>> 3333975e7 (GEOMESA-3067 Find attribute in Filters with Functions with embedded expressions correctly)
=======
>>>>>>> c2cfc968d2 (GEOMESA-3061 Converters - support bytes in Avro top-level union types (#2762))
>>>>>>> d15af7157e (GEOMESA-3067 Find attribute in Filters with Functions with embedded expressions correctly)
<<<<<<< HEAD
>>>>>>> 982031ef44 (GEOMESA-3067 Find attribute in Filters with Functions with embedded expressions correctly)
<<<<<<< HEAD
>>>>>>> 00d66ae013 (GEOMESA-3067 Find attribute in Filters with Functions with embedded expressions correctly)
=======
=======
=======
=======
=======
>>>>>>> 0e68e9f4c (GEOMESA-3061 Converters - support bytes in Avro top-level union types (#2762))
>>>>>>> 76618c8da (GEOMESA-3061 Converters - support bytes in Avro top-level union types (#2762))
=======
>>>>>>> 5d8dab9f81 (GEOMESA-3067 Find attribute in Filters with Functions with embedded expressions correctly)
>>>>>>> 947761ec9b (GEOMESA-3061 Converters - support bytes in Avro top-level union types (#2762))
<<<<<<< HEAD
>>>>>>> 0086b292ba (GEOMESA-3061 Converters - support bytes in Avro top-level union types (#2762))
<<<<<<< HEAD
>>>>>>> c2cfc968d2 (GEOMESA-3061 Converters - support bytes in Avro top-level union types (#2762))
=======
=======
=======
=======
>>>>>>> c3b0a1b6e (GEOMESA-3067 Find attribute in Filters with Functions with embedded expressions correctly)
=======
>>>>>>> 0fa73844a1 (GEOMESA-3061 Converters - support bytes in Avro top-level union types (#2762))
>>>>>>> 9813375fcc (GEOMESA-3067 Find attribute in Filters with Functions with embedded expressions correctly)
<<<<<<< HEAD
>>>>>>> cf57a2c189 (GEOMESA-3067 Find attribute in Filters with Functions with embedded expressions correctly)
<<<<<<< HEAD
>>>>>>> 5d8dab9f81 (GEOMESA-3067 Find attribute in Filters with Functions with embedded expressions correctly)
=======
=======
=======
=======
>>>>>>> c8a325e13 (GEOMESA-3061 Converters - support bytes in Avro top-level union types (#2762))
=======
>>>>>>> 1ef95979ee (GEOMESA-3067 Find attribute in Filters with Functions with embedded expressions correctly)
>>>>>>> c9328eddce (GEOMESA-3061 Converters - support bytes in Avro top-level union types (#2762))
<<<<<<< HEAD
>>>>>>> e15d50d7d3 (GEOMESA-3061 Converters - support bytes in Avro top-level union types (#2762))
<<<<<<< HEAD
>>>>>>> 0fa73844a1 (GEOMESA-3061 Converters - support bytes in Avro top-level union types (#2762))
=======
=======
=======
=======
>>>>>>> 9638dc731 (GEOMESA-3067 Find attribute in Filters with Functions with embedded expressions correctly)
=======
>>>>>>> 63546aacdc (GEOMESA-3061 Converters - support bytes in Avro top-level union types (#2762))
>>>>>>> d2eec4be68 (GEOMESA-3067 Find attribute in Filters with Functions with embedded expressions correctly)
<<<<<<< HEAD
>>>>>>> bec3ba7d08 (GEOMESA-3067 Find attribute in Filters with Functions with embedded expressions correctly)
<<<<<<< HEAD
>>>>>>> 1ef95979ee (GEOMESA-3067 Find attribute in Filters with Functions with embedded expressions correctly)
=======
=======
=======
=======
=======
>>>>>>> b4320946b (GEOMESA-3061 Converters - support bytes in Avro top-level union types (#2762))
>>>>>>> 97ec7d864 (GEOMESA-3061 Converters - support bytes in Avro top-level union types (#2762))
=======
>>>>>>> 964e86145a (Merge branch 'feature/postgis-fixes')
>>>>>>> d94c03a98e (GEOMESA-3061 Converters - support bytes in Avro top-level union types (#2762))
<<<<<<< HEAD
>>>>>>> 8de43cccf6 (GEOMESA-3061 Converters - support bytes in Avro top-level union types (#2762))
<<<<<<< HEAD
>>>>>>> 63546aacdc (GEOMESA-3061 Converters - support bytes in Avro top-level union types (#2762))
=======
=======
=======
=======
>>>>>>> db8d998aa (Merge branch 'feature/postgis-fixes')
=======
>>>>>>> b298e017f1 (GEOMESA-3254 Add Bloop build support)
>>>>>>> cb6bda89b6 (Merge branch 'feature/postgis-fixes')
<<<<<<< HEAD
>>>>>>> 26e5afc4ea (Merge branch 'feature/postgis-fixes')
<<<<<<< HEAD
>>>>>>> 964e86145a (Merge branch 'feature/postgis-fixes')
=======
=======
=======
=======
>>>>>>> d845d7c1b (GEOMESA-3254 Add Bloop build support)
=======
>>>>>>> 72b96c5c3e (GEOMESA-3067 Find attribute in Filters with Functions with embedded expressions correctly)
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
>>>>>>> 7acc3ea46 (GEOMESA-3067 Find attribute in Filters with Functions with embedded expressions correctly)
>>>>>>> 7bb5f26c3 (GEOMESA-3067 Find attribute in Filters with Functions with embedded expressions correctly)
=======
>>>>>>> 1ea8b10ac7 (GEOMESA-3061 Converters - support bytes in Avro top-level union types (#2762))
>>>>>>> e69b2aa6dc (GEOMESA-3067 Find attribute in Filters with Functions with embedded expressions correctly)
<<<<<<< HEAD
>>>>>>> b1a7408547 (GEOMESA-3067 Find attribute in Filters with Functions with embedded expressions correctly)
<<<<<<< HEAD
>>>>>>> 72b96c5c3e (GEOMESA-3067 Find attribute in Filters with Functions with embedded expressions correctly)
=======
=======
=======
=======
=======
=======
>>>>>>> e72b998c12 (GEOMESA-3067 Find attribute in Filters with Functions with embedded expressions correctly)
>>>>>>> 7acc3ea46 (GEOMESA-3067 Find attribute in Filters with Functions with embedded expressions correctly)
=======
>>>>>>> b9bdd406e (GEOMESA-3061 Converters - support bytes in Avro top-level union types (#2762))
<<<<<<< HEAD
>>>>>>> 6d9a5b626 (GEOMESA-3061 Converters - support bytes in Avro top-level union types (#2762))
<<<<<<< HEAD
>>>>>>> 67e4c1354f (GEOMESA-3061 Converters - support bytes in Avro top-level union types (#2762))
<<<<<<< HEAD
>>>>>>> 12e3a588fc (GEOMESA-3061 Converters - support bytes in Avro top-level union types (#2762))
<<<<<<< HEAD
>>>>>>> 1ea8b10ac7 (GEOMESA-3061 Converters - support bytes in Avro top-level union types (#2762))
=======
=======
=======
=======
=======
=======
>>>>>>> b800c052cc (GEOMESA-3061 Converters - support bytes in Avro top-level union types (#2762))
=======
>>>>>>> 7acc3ea46 (GEOMESA-3067 Find attribute in Filters with Functions with embedded expressions correctly)
>>>>>>> f36b0e8b9 (GEOMESA-3067 Find attribute in Filters with Functions with embedded expressions correctly)
<<<<<<< HEAD
>>>>>>> e5ed68fdd (GEOMESA-3067 Find attribute in Filters with Functions with embedded expressions correctly)
<<<<<<< HEAD
>>>>>>> 060ac2189c (GEOMESA-3067 Find attribute in Filters with Functions with embedded expressions correctly)
<<<<<<< HEAD
>>>>>>> c8e013ff91 (GEOMESA-3067 Find attribute in Filters with Functions with embedded expressions correctly)
<<<<<<< HEAD
>>>>>>> e72b998c12 (GEOMESA-3067 Find attribute in Filters with Functions with embedded expressions correctly)
=======
=======
=======
=======
=======
>>>>>>> cdb410251 (GEOMESA-3061 Converters - support bytes in Avro top-level union types (#2762))
<<<<<<< HEAD
>>>>>>> e6e1f4bdd (GEOMESA-3061 Converters - support bytes in Avro top-level union types (#2762))
<<<<<<< HEAD
>>>>>>> 8035cc5893 (GEOMESA-3061 Converters - support bytes in Avro top-level union types (#2762))
<<<<<<< HEAD
>>>>>>> 1890b11217 (GEOMESA-3061 Converters - support bytes in Avro top-level union types (#2762))
<<<<<<< HEAD
>>>>>>> b800c052cc (GEOMESA-3061 Converters - support bytes in Avro top-level union types (#2762))
=======
=======
=======
=======
=======
=======
>>>>>>> 7acc3ea46 (GEOMESA-3067 Find attribute in Filters with Functions with embedded expressions correctly)
>>>>>>> e3a63fee1 (GEOMESA-3067 Find attribute in Filters with Functions with embedded expressions correctly)
>>>>>>> 7f922b040 (GEOMESA-3067 Find attribute in Filters with Functions with embedded expressions correctly)
<<<<<<< HEAD
>>>>>>> 04f08c23c5 (GEOMESA-3067 Find attribute in Filters with Functions with embedded expressions correctly)
<<<<<<< HEAD
>>>>>>> 912169b5e9 (GEOMESA-3067 Find attribute in Filters with Functions with embedded expressions correctly)
<<<<<<< HEAD
>>>>>>> 8e70a881a6 (GEOMESA-3067 Find attribute in Filters with Functions with embedded expressions correctly)
=======
=======
=======
=======
=======
>>>>>>> 0e68e9f4c (GEOMESA-3061 Converters - support bytes in Avro top-level union types (#2762))
>>>>>>> a910ae135 (GEOMESA-3061 Converters - support bytes in Avro top-level union types (#2762))
<<<<<<< HEAD
>>>>>>> 07161eaaa6 (GEOMESA-3061 Converters - support bytes in Avro top-level union types (#2762))
<<<<<<< HEAD
>>>>>>> 9c28193a91 (GEOMESA-3061 Converters - support bytes in Avro top-level union types (#2762))
<<<<<<< HEAD
>>>>>>> 9dbe1503e8 (GEOMESA-3061 Converters - support bytes in Avro top-level union types (#2762))
=======
=======
=======
=======
>>>>>>> 8fb060734 (GEOMESA-3067 Find attribute in Filters with Functions with embedded expressions correctly)
=======
>>>>>>> 6e30236dd2 (GEOMESA-3061 Converters - support bytes in Avro top-level union types (#2762))
>>>>>>> 38b3282770 (GEOMESA-3067 Find attribute in Filters with Functions with embedded expressions correctly)
<<<<<<< HEAD
>>>>>>> 1b60c2aeba (GEOMESA-3067 Find attribute in Filters with Functions with embedded expressions correctly)
<<<<<<< HEAD
>>>>>>> 53bc726472 (GEOMESA-3067 Find attribute in Filters with Functions with embedded expressions correctly)
=======
=======
=======
=======
>>>>>>> ad3cedc4d (GEOMESA-3061 Converters - support bytes in Avro top-level union types (#2762))
=======
>>>>>>> 3261561062 (GEOMESA-3067 Find attribute in Filters with Functions with embedded expressions correctly)
>>>>>>> 9abc630fdf (GEOMESA-3061 Converters - support bytes in Avro top-level union types (#2762))
<<<<<<< HEAD
>>>>>>> d294ce49e2 (GEOMESA-3061 Converters - support bytes in Avro top-level union types (#2762))
<<<<<<< HEAD
>>>>>>> 6e30236dd2 (GEOMESA-3061 Converters - support bytes in Avro top-level union types (#2762))
=======
=======
=======
=======
>>>>>>> bc4913194 (GEOMESA-3067 Find attribute in Filters with Functions with embedded expressions correctly)
=======
>>>>>>> dbd932fed6 (GEOMESA-3061 Converters - support bytes in Avro top-level union types (#2762))
>>>>>>> 570899511d (GEOMESA-3067 Find attribute in Filters with Functions with embedded expressions correctly)
<<<<<<< HEAD
>>>>>>> ed45e8551f (GEOMESA-3067 Find attribute in Filters with Functions with embedded expressions correctly)
<<<<<<< HEAD
>>>>>>> 3261561062 (GEOMESA-3067 Find attribute in Filters with Functions with embedded expressions correctly)
=======
=======
=======
=======
=======
>>>>>>> b4320946b (GEOMESA-3061 Converters - support bytes in Avro top-level union types (#2762))
>>>>>>> bdbced26d (GEOMESA-3061 Converters - support bytes in Avro top-level union types (#2762))
=======
>>>>>>> bf6bde0830 (Merge branch 'feature/postgis-fixes')
>>>>>>> 25063957fc (GEOMESA-3061 Converters - support bytes in Avro top-level union types (#2762))
<<<<<<< HEAD
>>>>>>> 1df8328338 (GEOMESA-3061 Converters - support bytes in Avro top-level union types (#2762))
<<<<<<< HEAD
>>>>>>> dbd932fed6 (GEOMESA-3061 Converters - support bytes in Avro top-level union types (#2762))
=======
=======
=======
=======
>>>>>>> 1b25d7ddb (Merge branch 'feature/postgis-fixes')
>>>>>>> 699117eca9 (Merge branch 'feature/postgis-fixes')
>>>>>>> c69897d7bd (Merge branch 'feature/postgis-fixes')
>>>>>>> bf6bde0830 (Merge branch 'feature/postgis-fixes')
=======
>>>>>>> 5b9d5ada1b (GEOMESA-3067 Find attribute in Filters with Functions with embedded expressions correctly)
=======
>>>>>>> 9293965a7d (GEOMESA-3061 Converters - support bytes in Avro top-level union types (#2762))
=======
=======
>>>>>>> ef1a0521bd (GEOMESA-3067 Find attribute in Filters with Functions with embedded expressions correctly)
>>>>>>> 67dc71ffb1 (GEOMESA-3067 Find attribute in Filters with Functions with embedded expressions correctly)
=======
>>>>>>> 058fd96baa (GEOMESA-3061 Converters - support bytes in Avro top-level union types (#2762))
=======
=======
>>>>>>> 20f6826d0f (GEOMESA-3067 Find attribute in Filters with Functions with embedded expressions correctly)
>>>>>>> f7fc21ae20 (GEOMESA-3067 Find attribute in Filters with Functions with embedded expressions correctly)
=======
>>>>>>> c22ecd64c3 (GEOMESA-3061 Converters - support bytes in Avro top-level union types (#2762))
=======
=======
=======
>>>>>>> a63cb7e74 (GEOMESA-3067 Find attribute in Filters with Functions with embedded expressions correctly)
<<<<<<< HEAD
>>>>>>> 125ffd0575 (GEOMESA-3067 Find attribute in Filters with Functions with embedded expressions correctly)
<<<<<<< HEAD
>>>>>>> 6e297b9b6f (GEOMESA-3067 Find attribute in Filters with Functions with embedded expressions correctly)
=======
=======
=======
=======
>>>>>>> cdb410251 (GEOMESA-3061 Converters - support bytes in Avro top-level union types (#2762))
>>>>>>> 67b361c85 (GEOMESA-3061 Converters - support bytes in Avro top-level union types (#2762))
>>>>>>> f302a54949 (GEOMESA-3061 Converters - support bytes in Avro top-level union types (#2762))
>>>>>>> 2a887f75bf (GEOMESA-3061 Converters - support bytes in Avro top-level union types (#2762))
=======
>>>>>>> a83fe4cf7c (GEOMESA-3067 Find attribute in Filters with Functions with embedded expressions correctly)
>>>>>>> 08a743b61d (GEOMESA-3067 Find attribute in Filters with Functions with embedded expressions correctly)
=======
>>>>>>> a788dfac03 (GEOMESA-3061 Converters - support bytes in Avro top-level union types (#2762))
>>>>>>> b08cb4d818 (GEOMESA-3061 Converters - support bytes in Avro top-level union types (#2762))
=======
>>>>>>> 354b5e5ae5 (Merge branch 'feature/postgis-fixes')
=======
>>>>>>> 043f2d0167 (GEOMESA-3067 Find attribute in Filters with Functions with embedded expressions correctly)
=======
=======
>>>>>>> 59a1fbb96e (GEOMESA-3061 Converters - support bytes in Avro top-level union types (#2762))
>>>>>>> ac217b392d (GEOMESA-3061 Converters - support bytes in Avro top-level union types (#2762))
=======
>>>>>>> a6693cb0ba (GEOMESA-3067 Find attribute in Filters with Functions with embedded expressions correctly)
=======
>>>>>>> d1fa26b39d (GEOMESA-3061 Converters - support bytes in Avro top-level union types (#2762))
>>>>>>> e7d6b701c8 (GEOMESA-3061 Converters - support bytes in Avro top-level union types (#2762))
=======
>>>>>>> d1fa26b39d (GEOMESA-3061 Converters - support bytes in Avro top-level union types (#2762))
=======
=======
=======
>>>>>>> 7acc3ea46 (GEOMESA-3067 Find attribute in Filters with Functions with embedded expressions correctly)
>>>>>>> e3a63fee18 (GEOMESA-3067 Find attribute in Filters with Functions with embedded expressions correctly)
<<<<<<< HEAD
>>>>>>> ef55408e9a (GEOMESA-3067 Find attribute in Filters with Functions with embedded expressions correctly)
<<<<<<< HEAD
>>>>>>> 70f2c62b7e (GEOMESA-3067 Find attribute in Filters with Functions with embedded expressions correctly)
=======
=======
=======
=======
>>>>>>> 7acc3ea46 (GEOMESA-3067 Find attribute in Filters with Functions with embedded expressions correctly)
=======
>>>>>>> b9bdd406e (GEOMESA-3061 Converters - support bytes in Avro top-level union types (#2762))
>>>>>>> 0e68e9f4cc (GEOMESA-3061 Converters - support bytes in Avro top-level union types (#2762))
<<<<<<< HEAD
>>>>>>> f67dd3371e (GEOMESA-3061 Converters - support bytes in Avro top-level union types (#2762))
<<<<<<< HEAD
>>>>>>> 95e52e061e (GEOMESA-3061 Converters - support bytes in Avro top-level union types (#2762))
=======
=======
=======
=======
>>>>>>> 67b361c856 (GEOMESA-3061 Converters - support bytes in Avro top-level union types (#2762))
=======
=======
>>>>>>> 7acc3ea46 (GEOMESA-3067 Find attribute in Filters with Functions with embedded expressions correctly)
>>>>>>> f36b0e8b9 (GEOMESA-3067 Find attribute in Filters with Functions with embedded expressions correctly)
<<<<<<< HEAD
>>>>>>> a63cb7e740 (GEOMESA-3067 Find attribute in Filters with Functions with embedded expressions correctly)
<<<<<<< HEAD
>>>>>>> a9884ff1f6 (GEOMESA-3067 Find attribute in Filters with Functions with embedded expressions correctly)
<<<<<<< HEAD
>>>>>>> 424e7de15a (GEOMESA-3067 Find attribute in Filters with Functions with embedded expressions correctly)
=======
=======
=======
=======
>>>>>>> cdb410251 (GEOMESA-3061 Converters - support bytes in Avro top-level union types (#2762))
>>>>>>> 67b361c856 (GEOMESA-3061 Converters - support bytes in Avro top-level union types (#2762))
>>>>>>> f7cef54062 (GEOMESA-3061 Converters - support bytes in Avro top-level union types (#2762))
>>>>>>> 988874c83e (GEOMESA-3061 Converters - support bytes in Avro top-level union types (#2762))
=======
>>>>>>> f7cef54062 (GEOMESA-3061 Converters - support bytes in Avro top-level union types (#2762))
=======
=======
=======
>>>>>>> 7acc3ea46 (GEOMESA-3067 Find attribute in Filters with Functions with embedded expressions correctly)
>>>>>>> 908ad4071d (GEOMESA-3067 Find attribute in Filters with Functions with embedded expressions correctly)
<<<<<<< HEAD
>>>>>>> 49f2a1c310 (GEOMESA-3067 Find attribute in Filters with Functions with embedded expressions correctly)
<<<<<<< HEAD
>>>>>>> 87dddefcd8 (GEOMESA-3067 Find attribute in Filters with Functions with embedded expressions correctly)
=======
=======
=======
=======
>>>>>>> 7acc3ea46 (GEOMESA-3067 Find attribute in Filters with Functions with embedded expressions correctly)
=======
>>>>>>> b9bdd406e (GEOMESA-3061 Converters - support bytes in Avro top-level union types (#2762))
>>>>>>> b4320946b4 (GEOMESA-3061 Converters - support bytes in Avro top-level union types (#2762))
>>>>>>> a16b64a4d1 (GEOMESA-3061 Converters - support bytes in Avro top-level union types (#2762))
<<<<<<< HEAD
>>>>>>> aea9fbe131 (GEOMESA-3061 Converters - support bytes in Avro top-level union types (#2762))
=======
=======
>>>>>>> 34472778d3 (Merge branch 'feature/postgis-fixes')
<<<<<<< HEAD
>>>>>>> d581fa3e8f (Merge branch 'feature/postgis-fixes')
=======
=======
>>>>>>> 5430d59024 (GEOMESA-3067 Find attribute in Filters with Functions with embedded expressions correctly)
<<<<<<< HEAD
>>>>>>> ca1e0fad13 (GEOMESA-3067 Find attribute in Filters with Functions with embedded expressions correctly)
=======
=======
>>>>>>> 810876750d (GEOMESA-3061 Converters - support bytes in Avro top-level union types (#2762))
<<<<<<< HEAD
>>>>>>> 5a55bf9756 (GEOMESA-3061 Converters - support bytes in Avro top-level union types (#2762))
=======
=======
=======
>>>>>>> e182e6e99c (GEOMESA-3067 Find attribute in Filters with Functions with embedded expressions correctly)
>>>>>>> 2571e49519 (GEOMESA-3067 Find attribute in Filters with Functions with embedded expressions correctly)
>>>>>>> adfec3a47a (GEOMESA-3067 Find attribute in Filters with Functions with embedded expressions correctly)
=======
>>>>>>> e0c2527549 (GEOMESA-3061 Converters - support bytes in Avro top-level union types (#2762))
=======
=======
>>>>>>> cb5e2daf2b (GEOMESA-3061 Converters - support bytes in Avro top-level union types (#2762))
>>>>>>> 3333975e77 (GEOMESA-3067 Find attribute in Filters with Functions with embedded expressions correctly)
<<<<<<< HEAD
>>>>>>> 9412e85b59 (GEOMESA-3067 Find attribute in Filters with Functions with embedded expressions correctly)
<<<<<<< HEAD
>>>>>>> 4cf1d8d259 (GEOMESA-3067 Find attribute in Filters with Functions with embedded expressions correctly)
=======
=======
=======
=======
>>>>>>> 0e68e9f4c (GEOMESA-3061 Converters - support bytes in Avro top-level union types (#2762))
<<<<<<< HEAD
>>>>>>> 76618c8da3 (GEOMESA-3061 Converters - support bytes in Avro top-level union types (#2762))
<<<<<<< HEAD
>>>>>>> 694bcd3776 (GEOMESA-3061 Converters - support bytes in Avro top-level union types (#2762))
<<<<<<< HEAD
>>>>>>> cb5e2daf2b (GEOMESA-3061 Converters - support bytes in Avro top-level union types (#2762))
=======
=======
=======
=======
>>>>>>> a63cb7e74 (GEOMESA-3067 Find attribute in Filters with Functions with embedded expressions correctly)
=======
>>>>>>> 00e61f4b70 (GEOMESA-3061 Converters - support bytes in Avro top-level union types (#2762))
>>>>>>> c3b0a1b6e3 (GEOMESA-3067 Find attribute in Filters with Functions with embedded expressions correctly)
<<<<<<< HEAD
>>>>>>> 24c4df93a5 (GEOMESA-3067 Find attribute in Filters with Functions with embedded expressions correctly)
<<<<<<< HEAD
>>>>>>> 9bcad1eb67 (GEOMESA-3067 Find attribute in Filters with Functions with embedded expressions correctly)
=======
=======
=======
=======
=======
>>>>>>> cdb410251 (GEOMESA-3061 Converters - support bytes in Avro top-level union types (#2762))
>>>>>>> 67b361c85 (GEOMESA-3061 Converters - support bytes in Avro top-level union types (#2762))
=======
>>>>>>> 9a4568fbda (GEOMESA-3067 Find attribute in Filters with Functions with embedded expressions correctly)
>>>>>>> c8a325e13c (GEOMESA-3061 Converters - support bytes in Avro top-level union types (#2762))
<<<<<<< HEAD
>>>>>>> 6cd1151639 (GEOMESA-3061 Converters - support bytes in Avro top-level union types (#2762))
<<<<<<< HEAD
>>>>>>> 00e61f4b70 (GEOMESA-3061 Converters - support bytes in Avro top-level union types (#2762))
=======
=======
=======
=======
=======
>>>>>>> 7acc3ea46 (GEOMESA-3067 Find attribute in Filters with Functions with embedded expressions correctly)
>>>>>>> 908ad4071 (GEOMESA-3067 Find attribute in Filters with Functions with embedded expressions correctly)
=======
>>>>>>> 4864cfc581 (GEOMESA-3061 Converters - support bytes in Avro top-level union types (#2762))
>>>>>>> 9638dc731e (GEOMESA-3067 Find attribute in Filters with Functions with embedded expressions correctly)
<<<<<<< HEAD
>>>>>>> 1e00950a90 (GEOMESA-3067 Find attribute in Filters with Functions with embedded expressions correctly)
<<<<<<< HEAD
>>>>>>> 9a4568fbda (GEOMESA-3067 Find attribute in Filters with Functions with embedded expressions correctly)
=======
=======
=======
=======
>>>>>>> b4320946b (GEOMESA-3061 Converters - support bytes in Avro top-level union types (#2762))
=======
>>>>>>> 264c9fa240 (Merge branch 'feature/postgis-fixes')
>>>>>>> 97ec7d864a (GEOMESA-3061 Converters - support bytes in Avro top-level union types (#2762))
<<<<<<< HEAD
>>>>>>> 1973f72e77 (GEOMESA-3061 Converters - support bytes in Avro top-level union types (#2762))
<<<<<<< HEAD
>>>>>>> 4864cfc581 (GEOMESA-3061 Converters - support bytes in Avro top-level union types (#2762))
=======
=======
=======
=======
>>>>>>> 3be8d2a5a (Merge branch 'feature/postgis-fixes')
>>>>>>> db8d998aa2 (Merge branch 'feature/postgis-fixes')
>>>>>>> 42e8565e9b (Merge branch 'feature/postgis-fixes')
>>>>>>> 264c9fa240 (Merge branch 'feature/postgis-fixes')
=======
>>>>>>> f1532f2313 (GEOMESA-3254 Add Bloop build support)
>>>>>>> c738f63bd9 (GEOMESA-3254 Add Bloop build support)
=======
>>>>>>> f1532f2313 (GEOMESA-3254 Add Bloop build support)
=======
=======
=======
>>>>>>> 7acc3ea46 (GEOMESA-3067 Find attribute in Filters with Functions with embedded expressions correctly)
>>>>>>> 7bb5f26c3e (GEOMESA-3067 Find attribute in Filters with Functions with embedded expressions correctly)
>>>>>>> 4bbf97686c (GEOMESA-3067 Find attribute in Filters with Functions with embedded expressions correctly)
<<<<<<< HEAD
>>>>>>> 7213a78a3a (GEOMESA-3067 Find attribute in Filters with Functions with embedded expressions correctly)
=======
=======
>>>>>>> 96d5d442fa (GEOMESA-3061 Converters - support bytes in Avro top-level union types (#2762))
<<<<<<< HEAD
>>>>>>> 3676d4e56a (GEOMESA-3061 Converters - support bytes in Avro top-level union types (#2762))
=======
=======
=======
>>>>>>> e5ed68fdd3 (GEOMESA-3067 Find attribute in Filters with Functions with embedded expressions correctly)
>>>>>>> b3dd8ec805 (GEOMESA-3067 Find attribute in Filters with Functions with embedded expressions correctly)
>>>>>>> e8ce815f1b (GEOMESA-3067 Find attribute in Filters with Functions with embedded expressions correctly)
=======
>>>>>>> 60b4637548 (GEOMESA-3061 Converters - support bytes in Avro top-level union types (#2762))
=======
>>>>>>> 6f81d40992 (GEOMESA-3067 Find attribute in Filters with Functions with embedded expressions correctly)
=======
=======
>>>>>>> 92674ff9d4 (GEOMESA-3061 Converters - support bytes in Avro top-level union types (#2762))
>>>>>>> 009a284072 (GEOMESA-3061 Converters - support bytes in Avro top-level union types (#2762))
=======
>>>>>>> 9df4f8a9f6 (GEOMESA-3067 Find attribute in Filters with Functions with embedded expressions correctly)
=======
>>>>>>> 7b8c8dcc3d (GEOMESA-3061 Converters - support bytes in Avro top-level union types (#2762))
=======
=======
>>>>>>> 63ca73533e (GEOMESA-3067 Find attribute in Filters with Functions with embedded expressions correctly)
>>>>>>> 79cd5cb606 (GEOMESA-3067 Find attribute in Filters with Functions with embedded expressions correctly)
=======
>>>>>>> c029a43a6c (GEOMESA-3061 Converters - support bytes in Avro top-level union types (#2762))
=======
=======
>>>>>>> 67de3c3202 (Merge branch 'feature/postgis-fixes')
>>>>>>> 217b7d1cb9 (Merge branch 'feature/postgis-fixes')
=======
=======
>>>>>>> 4f51687745 (GEOMESA-3061 Converters - support bytes in Avro top-level union types (#2762))
>>>>>>> 0dbede148d (GEOMESA-3061 Converters - support bytes in Avro top-level union types (#2762))
<<<<<<< HEAD
>>>>>>> 1bb69524c2 (GEOMESA-3061 Converters - support bytes in Avro top-level union types (#2762))
<<<<<<< HEAD
>>>>>>> a5b0374ee2 (GEOMESA-3061 Converters - support bytes in Avro top-level union types (#2762))
=======
=======
=======
=======
=======
>>>>>>> cdb410251 (GEOMESA-3061 Converters - support bytes in Avro top-level union types (#2762))
>>>>>>> 240977229 (GEOMESA-3061 Converters - support bytes in Avro top-level union types (#2762))
>>>>>>> 22dcc8170f (GEOMESA-3061 Converters - support bytes in Avro top-level union types (#2762))
>>>>>>> 8c9ca1211a (GEOMESA-3061 Converters - support bytes in Avro top-level union types (#2762))
>>>>>>> 4f51687745 (GEOMESA-3061 Converters - support bytes in Avro top-level union types (#2762))
=======
>>>>>>> 9a2d40c613 (GEOMESA-3061 Converters - support bytes in Avro top-level union types (#2762))
=======
=======
>>>>>>> 238945d4b3 (GEOMESA-3061 Converters - support bytes in Avro top-level union types (#2762))
>>>>>>> 1cad375176 (GEOMESA-3061 Converters - support bytes in Avro top-level union types (#2762))
>>>>>>> 73770612e0 (GEOMESA-3061 Converters - support bytes in Avro top-level union types (#2762))
=======
>>>>>>> 6c83981af3 (GEOMESA-3061 Converters - support bytes in Avro top-level union types (#2762))
    "create filter containing functions with embedded expressions" >> {
      val sft = SimpleFeatureTypes.createType("test", "f0:Integer,f1:Integer")
      val ecql = "min(f0 + 2, 4) < min(f1, 5)"
      val filterGeoMesa = FastFilterFactory.toFilter(sft, ecql)
      val filterGeoTools = ECQL.toFilter(ecql)
      Result.foreach(1 to 10) { i =>
<<<<<<< HEAD
<<<<<<< HEAD
<<<<<<< HEAD
<<<<<<< HEAD
<<<<<<< HEAD
<<<<<<< HEAD
<<<<<<< HEAD
<<<<<<< HEAD
<<<<<<< HEAD
<<<<<<< HEAD
<<<<<<< HEAD
<<<<<<< HEAD
<<<<<<< HEAD
<<<<<<< HEAD
<<<<<<< HEAD
<<<<<<< HEAD
<<<<<<< HEAD
<<<<<<< HEAD
<<<<<<< HEAD
<<<<<<< HEAD
<<<<<<< HEAD
<<<<<<< HEAD
<<<<<<< HEAD
<<<<<<< HEAD
<<<<<<< HEAD
<<<<<<< HEAD
<<<<<<< HEAD
<<<<<<< HEAD
<<<<<<< HEAD
<<<<<<< HEAD
<<<<<<< HEAD
<<<<<<< HEAD
<<<<<<< HEAD
<<<<<<< HEAD
<<<<<<< HEAD
<<<<<<< HEAD
<<<<<<< HEAD
<<<<<<< HEAD
<<<<<<< HEAD
<<<<<<< HEAD
<<<<<<< HEAD
<<<<<<< HEAD
<<<<<<< HEAD
<<<<<<< HEAD
<<<<<<< HEAD
<<<<<<< HEAD
<<<<<<< HEAD
<<<<<<< HEAD
<<<<<<< HEAD
<<<<<<< HEAD
<<<<<<< HEAD
<<<<<<< HEAD
<<<<<<< HEAD
<<<<<<< HEAD
<<<<<<< HEAD
<<<<<<< HEAD
<<<<<<< HEAD
<<<<<<< HEAD
<<<<<<< HEAD
<<<<<<< HEAD
<<<<<<< HEAD
<<<<<<< HEAD
<<<<<<< HEAD
<<<<<<< HEAD
<<<<<<< HEAD
<<<<<<< HEAD
<<<<<<< HEAD
<<<<<<< HEAD
<<<<<<< HEAD
<<<<<<< HEAD
<<<<<<< HEAD
<<<<<<< HEAD
<<<<<<< HEAD
<<<<<<< HEAD
<<<<<<< HEAD
<<<<<<< HEAD
<<<<<<< HEAD
<<<<<<< HEAD
<<<<<<< HEAD
<<<<<<< HEAD
<<<<<<< HEAD
<<<<<<< HEAD
<<<<<<< HEAD
<<<<<<< HEAD
<<<<<<< HEAD
<<<<<<< HEAD
<<<<<<< HEAD
<<<<<<< HEAD
<<<<<<< HEAD
<<<<<<< HEAD
<<<<<<< HEAD
<<<<<<< HEAD
<<<<<<< HEAD
<<<<<<< HEAD
<<<<<<< HEAD
<<<<<<< HEAD
<<<<<<< HEAD
<<<<<<< HEAD
<<<<<<< HEAD
<<<<<<< HEAD
<<<<<<< HEAD
<<<<<<< HEAD
<<<<<<< HEAD
<<<<<<< HEAD
<<<<<<< HEAD
<<<<<<< HEAD
<<<<<<< HEAD
<<<<<<< HEAD
<<<<<<< HEAD
<<<<<<< HEAD
<<<<<<< HEAD
<<<<<<< HEAD
<<<<<<< HEAD
<<<<<<< HEAD
<<<<<<< HEAD
<<<<<<< HEAD
<<<<<<< HEAD
<<<<<<< HEAD
<<<<<<< HEAD
<<<<<<< HEAD
<<<<<<< HEAD
<<<<<<< HEAD
<<<<<<< HEAD
<<<<<<< HEAD
<<<<<<< HEAD
<<<<<<< HEAD
<<<<<<< HEAD
<<<<<<< HEAD
<<<<<<< HEAD
<<<<<<< HEAD
<<<<<<< HEAD
<<<<<<< HEAD
<<<<<<< HEAD
<<<<<<< HEAD
<<<<<<< HEAD
<<<<<<< HEAD
<<<<<<< HEAD
<<<<<<< HEAD
<<<<<<< HEAD
<<<<<<< HEAD
<<<<<<< HEAD
<<<<<<< HEAD
<<<<<<< HEAD
<<<<<<< HEAD
<<<<<<< HEAD
<<<<<<< HEAD
<<<<<<< HEAD
<<<<<<< HEAD
<<<<<<< HEAD
<<<<<<< HEAD
<<<<<<< HEAD
<<<<<<< HEAD
<<<<<<< HEAD
<<<<<<< HEAD
<<<<<<< HEAD
<<<<<<< HEAD
<<<<<<< HEAD
<<<<<<< HEAD
<<<<<<< HEAD
<<<<<<< HEAD
<<<<<<< HEAD
<<<<<<< HEAD
<<<<<<< HEAD
<<<<<<< HEAD
<<<<<<< HEAD
<<<<<<< HEAD
<<<<<<< HEAD
<<<<<<< HEAD
<<<<<<< HEAD
<<<<<<< HEAD
<<<<<<< HEAD
<<<<<<< HEAD
<<<<<<< HEAD
<<<<<<< HEAD
<<<<<<< HEAD
<<<<<<< HEAD
<<<<<<< HEAD
<<<<<<< HEAD
<<<<<<< HEAD
<<<<<<< HEAD
<<<<<<< HEAD
<<<<<<< HEAD
<<<<<<< HEAD
<<<<<<< HEAD
<<<<<<< HEAD
<<<<<<< HEAD
<<<<<<< HEAD
<<<<<<< HEAD
<<<<<<< HEAD
<<<<<<< HEAD
<<<<<<< HEAD
<<<<<<< HEAD
<<<<<<< HEAD
<<<<<<< HEAD
<<<<<<< HEAD
<<<<<<< HEAD
<<<<<<< HEAD
<<<<<<< HEAD
<<<<<<< HEAD
<<<<<<< HEAD
<<<<<<< HEAD
<<<<<<< HEAD
<<<<<<< HEAD
<<<<<<< HEAD
<<<<<<< HEAD
<<<<<<< HEAD
<<<<<<< HEAD
<<<<<<< HEAD
<<<<<<< HEAD
<<<<<<< HEAD
<<<<<<< HEAD
<<<<<<< HEAD
<<<<<<< HEAD
<<<<<<< HEAD
<<<<<<< HEAD
<<<<<<< HEAD
<<<<<<< HEAD
<<<<<<< HEAD
<<<<<<< HEAD
<<<<<<< HEAD
<<<<<<< HEAD
<<<<<<< HEAD
<<<<<<< HEAD
<<<<<<< HEAD
<<<<<<< HEAD
<<<<<<< HEAD
<<<<<<< HEAD
<<<<<<< HEAD
<<<<<<< HEAD
<<<<<<< HEAD
<<<<<<< HEAD
<<<<<<< HEAD
<<<<<<< HEAD
<<<<<<< HEAD
<<<<<<< HEAD
<<<<<<< HEAD
<<<<<<< HEAD
<<<<<<< HEAD
<<<<<<< HEAD
<<<<<<< HEAD
<<<<<<< HEAD
<<<<<<< HEAD
<<<<<<< HEAD
<<<<<<< HEAD
<<<<<<< HEAD
<<<<<<< HEAD
<<<<<<< HEAD
<<<<<<< HEAD
<<<<<<< HEAD
<<<<<<< HEAD
<<<<<<< HEAD
<<<<<<< HEAD
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
>>>>>>> ac217b392d (GEOMESA-3061 Converters - support bytes in Avro top-level union types (#2762))
=======
>>>>>>> a6693cb0ba (GEOMESA-3067 Find attribute in Filters with Functions with embedded expressions correctly)
=======
>>>>>>> e7d6b701c8 (GEOMESA-3061 Converters - support bytes in Avro top-level union types (#2762))
=======
>>>>>>> 70f2c62b7e (GEOMESA-3067 Find attribute in Filters with Functions with embedded expressions correctly)
=======
>>>>>>> 95e52e061e (GEOMESA-3061 Converters - support bytes in Avro top-level union types (#2762))
=======
>>>>>>> 424e7de15a (GEOMESA-3067 Find attribute in Filters with Functions with embedded expressions correctly)
=======
>>>>>>> 988874c83e (GEOMESA-3061 Converters - support bytes in Avro top-level union types (#2762))
=======
>>>>>>> 87dddefcd8 (GEOMESA-3067 Find attribute in Filters with Functions with embedded expressions correctly)
=======
>>>>>>> aea9fbe131 (GEOMESA-3061 Converters - support bytes in Avro top-level union types (#2762))
=======
>>>>>>> d581fa3e8f (Merge branch 'feature/postgis-fixes')
=======
>>>>>>> ca1e0fad13 (GEOMESA-3067 Find attribute in Filters with Functions with embedded expressions correctly)
=======
>>>>>>> 5a55bf9756 (GEOMESA-3061 Converters - support bytes in Avro top-level union types (#2762))
=======
>>>>>>> adfec3a47a (GEOMESA-3067 Find attribute in Filters with Functions with embedded expressions correctly)
=======
>>>>>>> e0c2527549 (GEOMESA-3061 Converters - support bytes in Avro top-level union types (#2762))
=======
>>>>>>> 4cf1d8d259 (GEOMESA-3067 Find attribute in Filters with Functions with embedded expressions correctly)
=======
>>>>>>> cb5e2daf2b (GEOMESA-3061 Converters - support bytes in Avro top-level union types (#2762))
=======
>>>>>>> 9bcad1eb67 (GEOMESA-3067 Find attribute in Filters with Functions with embedded expressions correctly)
=======
>>>>>>> 00e61f4b70 (GEOMESA-3061 Converters - support bytes in Avro top-level union types (#2762))
=======
>>>>>>> 9a4568fbda (GEOMESA-3067 Find attribute in Filters with Functions with embedded expressions correctly)
=======
>>>>>>> 4864cfc581 (GEOMESA-3061 Converters - support bytes in Avro top-level union types (#2762))
=======
>>>>>>> 264c9fa240 (Merge branch 'feature/postgis-fixes')
=======
>>>>>>> c738f63bd9 (GEOMESA-3254 Add Bloop build support)
=======
>>>>>>> 7213a78a3a (GEOMESA-3067 Find attribute in Filters with Functions with embedded expressions correctly)
=======
>>>>>>> 3676d4e56a (GEOMESA-3061 Converters - support bytes in Avro top-level union types (#2762))
=======
>>>>>>> e8ce815f1b (GEOMESA-3067 Find attribute in Filters with Functions with embedded expressions correctly)
=======
>>>>>>> 60b4637548 (GEOMESA-3061 Converters - support bytes in Avro top-level union types (#2762))
=======
>>>>>>> 6f81d40992 (GEOMESA-3067 Find attribute in Filters with Functions with embedded expressions correctly)
=======
>>>>>>> 009a284072 (GEOMESA-3061 Converters - support bytes in Avro top-level union types (#2762))
=======
>>>>>>> 9df4f8a9f6 (GEOMESA-3067 Find attribute in Filters with Functions with embedded expressions correctly)
=======
>>>>>>> 7b8c8dcc3d (GEOMESA-3061 Converters - support bytes in Avro top-level union types (#2762))
=======
>>>>>>> 79cd5cb606 (GEOMESA-3067 Find attribute in Filters with Functions with embedded expressions correctly)
=======
>>>>>>> c029a43a6c (GEOMESA-3061 Converters - support bytes in Avro top-level union types (#2762))
=======
>>>>>>> 217b7d1cb9 (Merge branch 'feature/postgis-fixes')
=======
>>>>>>> a5b0374ee2 (GEOMESA-3061 Converters - support bytes in Avro top-level union types (#2762))
=======
>>>>>>> 4f51687745 (GEOMESA-3061 Converters - support bytes in Avro top-level union types (#2762))
=======
>>>>>>> 9a2d40c613 (GEOMESA-3061 Converters - support bytes in Avro top-level union types (#2762))
=======
>>>>>>> 73770612e0 (GEOMESA-3061 Converters - support bytes in Avro top-level union types (#2762))
=======
>>>>>>> 6c83981af3 (GEOMESA-3061 Converters - support bytes in Avro top-level union types (#2762))
=======
>>>>>>> 32d312dc48 (GEOMESA-3067 Find attribute in Filters with Functions with embedded expressions correctly)
=======
>>>>>>> 59a1fbb96e (GEOMESA-3061 Converters - support bytes in Avro top-level union types (#2762))
<<<<<<< HEAD
<<<<<<< HEAD
=======
>>>>>>> a1d28116d4 (GEOMESA-3067 Find attribute in Filters with Functions with embedded expressions correctly)
=======
>>>>>>> d1fa26b39d (GEOMESA-3061 Converters - support bytes in Avro top-level union types (#2762))
<<<<<<< HEAD
<<<<<<< HEAD
=======
>>>>>>> ef55408e9a (GEOMESA-3067 Find attribute in Filters with Functions with embedded expressions correctly)
=======
>>>>>>> f67dd3371e (GEOMESA-3061 Converters - support bytes in Avro top-level union types (#2762))
<<<<<<< HEAD
<<<<<<< HEAD
=======
>>>>>>> a9884ff1f6 (GEOMESA-3067 Find attribute in Filters with Functions with embedded expressions correctly)
=======
>>>>>>> f7cef54062 (GEOMESA-3061 Converters - support bytes in Avro top-level union types (#2762))
<<<<<<< HEAD
<<<<<<< HEAD
=======
>>>>>>> 49f2a1c310 (GEOMESA-3067 Find attribute in Filters with Functions with embedded expressions correctly)
=======
>>>>>>> a16b64a4d1 (GEOMESA-3061 Converters - support bytes in Avro top-level union types (#2762))
<<<<<<< HEAD
<<<<<<< HEAD
=======
>>>>>>> 34472778d3 (Merge branch 'feature/postgis-fixes')
=======
>>>>>>> 5430d59024 (GEOMESA-3067 Find attribute in Filters with Functions with embedded expressions correctly)
<<<<<<< HEAD
<<<<<<< HEAD
=======
>>>>>>> 810876750d (GEOMESA-3061 Converters - support bytes in Avro top-level union types (#2762))
=======
>>>>>>> 2571e49519 (GEOMESA-3067 Find attribute in Filters with Functions with embedded expressions correctly)
<<<<<<< HEAD
<<<<<<< HEAD
=======
>>>>>>> d206a68a13 (GEOMESA-3061 Converters - support bytes in Avro top-level union types (#2762))
=======
>>>>>>> 9412e85b59 (GEOMESA-3067 Find attribute in Filters with Functions with embedded expressions correctly)
<<<<<<< HEAD
<<<<<<< HEAD
=======
>>>>>>> 694bcd3776 (GEOMESA-3061 Converters - support bytes in Avro top-level union types (#2762))
=======
>>>>>>> 24c4df93a5 (GEOMESA-3067 Find attribute in Filters with Functions with embedded expressions correctly)
<<<<<<< HEAD
<<<<<<< HEAD
=======
>>>>>>> 6cd1151639 (GEOMESA-3061 Converters - support bytes in Avro top-level union types (#2762))
=======
>>>>>>> 1e00950a90 (GEOMESA-3067 Find attribute in Filters with Functions with embedded expressions correctly)
<<<<<<< HEAD
<<<<<<< HEAD
=======
>>>>>>> 1973f72e77 (GEOMESA-3061 Converters - support bytes in Avro top-level union types (#2762))
=======
>>>>>>> 42e8565e9b (Merge branch 'feature/postgis-fixes')
<<<<<<< HEAD
<<<<<<< HEAD
=======
>>>>>>> f1532f2313 (GEOMESA-3254 Add Bloop build support)
=======
>>>>>>> 4bbf97686c (GEOMESA-3067 Find attribute in Filters with Functions with embedded expressions correctly)
<<<<<<< HEAD
<<<<<<< HEAD
=======
>>>>>>> 96d5d442fa (GEOMESA-3061 Converters - support bytes in Avro top-level union types (#2762))
=======
>>>>>>> b3dd8ec805 (GEOMESA-3067 Find attribute in Filters with Functions with embedded expressions correctly)
<<<<<<< HEAD
<<<<<<< HEAD
=======
>>>>>>> 5dcf23da52 (GEOMESA-3061 Converters - support bytes in Avro top-level union types (#2762))
=======
>>>>>>> 2b62d1f3fe (GEOMESA-3067 Find attribute in Filters with Functions with embedded expressions correctly)
<<<<<<< HEAD
<<<<<<< HEAD
=======
>>>>>>> 92674ff9d4 (GEOMESA-3061 Converters - support bytes in Avro top-level union types (#2762))
=======
>>>>>>> c169cb2905 (GEOMESA-3067 Find attribute in Filters with Functions with embedded expressions correctly)
<<<<<<< HEAD
<<<<<<< HEAD
=======
>>>>>>> 9a4dff9e4f (GEOMESA-3061 Converters - support bytes in Avro top-level union types (#2762))
=======
>>>>>>> 63ca73533e (GEOMESA-3067 Find attribute in Filters with Functions with embedded expressions correctly)
<<<<<<< HEAD
<<<<<<< HEAD
=======
>>>>>>> 0fc6650ecf (GEOMESA-3061 Converters - support bytes in Avro top-level union types (#2762))
=======
>>>>>>> 67de3c3202 (Merge branch 'feature/postgis-fixes')
<<<<<<< HEAD
<<<<<<< HEAD
=======
>>>>>>> 1bb69524c2 (GEOMESA-3061 Converters - support bytes in Avro top-level union types (#2762))
=======
>>>>>>> 8c9ca1211a (GEOMESA-3061 Converters - support bytes in Avro top-level union types (#2762))
<<<<<<< HEAD
<<<<<<< HEAD
=======
>>>>>>> a22efb4d66 (GEOMESA-3061 Converters - support bytes in Avro top-level union types (#2762))
=======
>>>>>>> 1cad375176 (GEOMESA-3061 Converters - support bytes in Avro top-level union types (#2762))
<<<<<<< HEAD
<<<<<<< HEAD
=======
>>>>>>> 1e39c0c27d (GEOMESA-3061 Converters - support bytes in Avro top-level union types (#2762))
=======
>>>>>>> 638b68d081 (Merge branch 'feature/postgis-fixes')
=======
>>>>>>> a990cf104e (GEOMESA-3067 Find attribute in Filters with Functions with embedded expressions correctly)
=======
>>>>>>> a1f15598cb (GEOMESA-3061 Converters - support bytes in Avro top-level union types (#2762))
=======
>>>>>>> 4373c901b3 (GEOMESA-3067 Find attribute in Filters with Functions with embedded expressions correctly)
=======
>>>>>>> 963feec660 (GEOMESA-3061 Converters - support bytes in Avro top-level union types (#2762))
=======
>>>>>>> 2c14568a23 (GEOMESA-3067 Find attribute in Filters with Functions with embedded expressions correctly)
=======
>>>>>>> 84ac051f28 (GEOMESA-3061 Converters - support bytes in Avro top-level union types (#2762))
=======
>>>>>>> 99acaa0887 (GEOMESA-3067 Find attribute in Filters with Functions with embedded expressions correctly)
=======
>>>>>>> fe3de10f11 (GEOMESA-3061 Converters - support bytes in Avro top-level union types (#2762))
=======
>>>>>>> 21deff19fd (GEOMESA-3067 Find attribute in Filters with Functions with embedded expressions correctly)
=======
>>>>>>> d0785cf307 (GEOMESA-3061 Converters - support bytes in Avro top-level union types (#2762))
=======
>>>>>>> 71adb695c5 (Merge branch 'feature/postgis-fixes')
=======
>>>>>>> 5a4c24e020 (GEOMESA-3254 Add Bloop build support)
=======
>>>>>>> 53900605ca (GEOMESA-3067 Find attribute in Filters with Functions with embedded expressions correctly)
=======
>>>>>>> a52e4429be (GEOMESA-3061 Converters - support bytes in Avro top-level union types (#2762))
=======
>>>>>>> 5f01e2c4fc (GEOMESA-3067 Find attribute in Filters with Functions with embedded expressions correctly)
=======
>>>>>>> 5c6b9f1f8b (GEOMESA-3061 Converters - support bytes in Avro top-level union types (#2762))
=======
>>>>>>> 511bd92a86 (GEOMESA-3067 Find attribute in Filters with Functions with embedded expressions correctly)
=======
>>>>>>> 9d44ff473d (GEOMESA-3061 Converters - support bytes in Avro top-level union types (#2762))
=======
>>>>>>> bff2bdde04 (GEOMESA-3067 Find attribute in Filters with Functions with embedded expressions correctly)
=======
>>>>>>> a35efac12e (GEOMESA-3061 Converters - support bytes in Avro top-level union types (#2762))
=======
>>>>>>> 323528580f (GEOMESA-3067 Find attribute in Filters with Functions with embedded expressions correctly)
=======
>>>>>>> fd5565dfba (GEOMESA-3061 Converters - support bytes in Avro top-level union types (#2762))
=======
>>>>>>> 30559ea5c9 (Merge branch 'feature/postgis-fixes')
=======
>>>>>>> 78fe4921a6 (GEOMESA-3067 Find attribute in Filters with Functions with embedded expressions correctly)
=======
>>>>>>> 0104fb37e4 (GEOMESA-3061 Converters - support bytes in Avro top-level union types (#2762))
=======
>>>>>>> 530b057384 (GEOMESA-3067 Find attribute in Filters with Functions with embedded expressions correctly)
=======
>>>>>>> 2654d9c120 (GEOMESA-3061 Converters - support bytes in Avro top-level union types (#2762))
=======
>>>>>>> de7d6ef448 (GEOMESA-3067 Find attribute in Filters with Functions with embedded expressions correctly)
=======
>>>>>>> f110463a26 (GEOMESA-3061 Converters - support bytes in Avro top-level union types (#2762))
=======
>>>>>>> d83561962d (GEOMESA-3067 Find attribute in Filters with Functions with embedded expressions correctly)
=======
>>>>>>> 86ec77f9cb (GEOMESA-3061 Converters - support bytes in Avro top-level union types (#2762))
=======
>>>>>>> 17883cb601 (GEOMESA-3067 Find attribute in Filters with Functions with embedded expressions correctly)
=======
>>>>>>> 1bcc513539 (GEOMESA-3061 Converters - support bytes in Avro top-level union types (#2762))
=======
>>>>>>> ec6d06b576 (Merge branch 'feature/postgis-fixes')
=======
>>>>>>> 724c808fa8 (GEOMESA-3067 Find attribute in Filters with Functions with embedded expressions correctly)
=======
>>>>>>> 3d5144418e (GEOMESA-3061 Converters - support bytes in Avro top-level union types (#2762))
=======
>>>>>>> efb6723f42 (GEOMESA-3067 Find attribute in Filters with Functions with embedded expressions correctly)
=======
>>>>>>> 7bdbfa5524 (GEOMESA-3061 Converters - support bytes in Avro top-level union types (#2762))
=======
>>>>>>> 17b189175b (GEOMESA-3067 Find attribute in Filters with Functions with embedded expressions correctly)
=======
>>>>>>> 7bff4d0018 (GEOMESA-3061 Converters - support bytes in Avro top-level union types (#2762))
=======
>>>>>>> 657a38673a (GEOMESA-3067 Find attribute in Filters with Functions with embedded expressions correctly)
=======
>>>>>>> e8b736ee96 (GEOMESA-3061 Converters - support bytes in Avro top-level union types (#2762))
=======
>>>>>>> e31a4215c4 (GEOMESA-3067 Find attribute in Filters with Functions with embedded expressions correctly)
=======
>>>>>>> 0efbfe547e (GEOMESA-3061 Converters - support bytes in Avro top-level union types (#2762))
=======
>>>>>>> 4c41429da9 (Merge branch 'feature/postgis-fixes')
=======
>>>>>>> ca13f8551e (GEOMESA-3067 Find attribute in Filters with Functions with embedded expressions correctly)
=======
>>>>>>> d498bef1ce (GEOMESA-3061 Converters - support bytes in Avro top-level union types (#2762))
=======
>>>>>>> cd4422a10c (GEOMESA-3067 Find attribute in Filters with Functions with embedded expressions correctly)
=======
>>>>>>> a5b160f47b (GEOMESA-3061 Converters - support bytes in Avro top-level union types (#2762))
=======
>>>>>>> fa429c7863 (GEOMESA-3067 Find attribute in Filters with Functions with embedded expressions correctly)
=======
>>>>>>> 5cf31d21f3 (GEOMESA-3061 Converters - support bytes in Avro top-level union types (#2762))
=======
>>>>>>> def2794bb5 (GEOMESA-3067 Find attribute in Filters with Functions with embedded expressions correctly)
=======
>>>>>>> 94fecee1d8 (GEOMESA-3061 Converters - support bytes in Avro top-level union types (#2762))
=======
>>>>>>> f8d3d445c0 (GEOMESA-3067 Find attribute in Filters with Functions with embedded expressions correctly)
=======
>>>>>>> 4599715c51 (d)
=======
>>>>>>> 6e0709aba8 (Merge branch 'feature/postgis-fixes')
=======
>>>>>>> 7a84c9d22d (GEOMESA-3254 Add Bloop build support)
=======
>>>>>>> bad8172e9b (GEOMESA-3067 Find attribute in Filters with Functions with embedded expressions correctly)
=======
>>>>>>> 7fbbd56493 (GEOMESA-3061 Converters - support bytes in Avro top-level union types (#2762))
=======
>>>>>>> e582c3ecfe (GEOMESA-3067 Find attribute in Filters with Functions with embedded expressions correctly)
=======
>>>>>>> 3eb12f79a9 (GEOMESA-3061 Converters - support bytes in Avro top-level union types (#2762))
=======
>>>>>>> 8b16ac5c65 (GEOMESA-3067 Find attribute in Filters with Functions with embedded expressions correctly)
=======
>>>>>>> 4ccd6f6b1f (GEOMESA-3061 Converters - support bytes in Avro top-level union types (#2762))
=======
>>>>>>> f983ea29f0 (GEOMESA-3067 Find attribute in Filters with Functions with embedded expressions correctly)
=======
>>>>>>> 35b69b8f2f (GEOMESA-3061 Converters - support bytes in Avro top-level union types (#2762))
=======
>>>>>>> da4e2905b4 (GEOMESA-3067 Find attribute in Filters with Functions with embedded expressions correctly)
=======
>>>>>>> db8a3a22b2 (GEOMESA-3061 Converters - support bytes in Avro top-level union types (#2762))
=======
>>>>>>> ed25decdd5 (Merge branch 'feature/postgis-fixes')
=======
>>>>>>> 27afb28ab6 (GEOMESA-3061 Converters - support bytes in Avro top-level union types (#2762))
=======
>>>>>>> 26a09ee6c2 (GEOMESA-3061 Converters - support bytes in Avro top-level union types (#2762))
=======
>>>>>>> 194ad4e5c0 (GEOMESA-3061 Converters - support bytes in Avro top-level union types (#2762))
=======
>>>>>>> 7b3c90c53f (GEOMESA-3061 Converters - support bytes in Avro top-level union types (#2762))
=======
>>>>>>> db9dfb6f14 (GEOMESA-3061 Converters - support bytes in Avro top-level union types (#2762))
=======
>>>>>>> f893d9a594 (Merge branch 'feature/postgis-fixes')
=======
>>>>>>> f33d55e2ba (GEOMESA-3067 Find attribute in Filters with Functions with embedded expressions correctly)
=======
>>>>>>> b8ebbf6083 (GEOMESA-3061 Converters - support bytes in Avro top-level union types (#2762))
=======
>>>>>>> 1278241911 (GEOMESA-3067 Find attribute in Filters with Functions with embedded expressions correctly)
=======
>>>>>>> 3e7fb62639 (GEOMESA-3061 Converters - support bytes in Avro top-level union types (#2762))
=======
>>>>>>> 00d66ae013 (GEOMESA-3067 Find attribute in Filters with Functions with embedded expressions correctly)
=======
>>>>>>> c2cfc968d2 (GEOMESA-3061 Converters - support bytes in Avro top-level union types (#2762))
=======
>>>>>>> 5d8dab9f81 (GEOMESA-3067 Find attribute in Filters with Functions with embedded expressions correctly)
=======
>>>>>>> 0fa73844a1 (GEOMESA-3061 Converters - support bytes in Avro top-level union types (#2762))
=======
>>>>>>> 1ef95979ee (GEOMESA-3067 Find attribute in Filters with Functions with embedded expressions correctly)
=======
>>>>>>> 63546aacdc (GEOMESA-3061 Converters - support bytes in Avro top-level union types (#2762))
=======
>>>>>>> 964e86145a (Merge branch 'feature/postgis-fixes')
=======
>>>>>>> b298e017f1 (GEOMESA-3254 Add Bloop build support)
=======
>>>>>>> 72b96c5c3e (GEOMESA-3067 Find attribute in Filters with Functions with embedded expressions correctly)
=======
>>>>>>> 1ea8b10ac7 (GEOMESA-3061 Converters - support bytes in Avro top-level union types (#2762))
=======
>>>>>>> e72b998c12 (GEOMESA-3067 Find attribute in Filters with Functions with embedded expressions correctly)
=======
>>>>>>> b800c052cc (GEOMESA-3061 Converters - support bytes in Avro top-level union types (#2762))
=======
>>>>>>> 8e70a881a6 (GEOMESA-3067 Find attribute in Filters with Functions with embedded expressions correctly)
=======
>>>>>>> 9dbe1503e8 (GEOMESA-3061 Converters - support bytes in Avro top-level union types (#2762))
=======
>>>>>>> 53bc726472 (GEOMESA-3067 Find attribute in Filters with Functions with embedded expressions correctly)
=======
>>>>>>> 6e30236dd2 (GEOMESA-3061 Converters - support bytes in Avro top-level union types (#2762))
=======
>>>>>>> 3261561062 (GEOMESA-3067 Find attribute in Filters with Functions with embedded expressions correctly)
=======
>>>>>>> dbd932fed6 (GEOMESA-3061 Converters - support bytes in Avro top-level union types (#2762))
=======
>>>>>>> bf6bde0830 (Merge branch 'feature/postgis-fixes')
=======
>>>>>>> 5b9d5ada1b (GEOMESA-3067 Find attribute in Filters with Functions with embedded expressions correctly)
=======
>>>>>>> 9293965a7d (GEOMESA-3061 Converters - support bytes in Avro top-level union types (#2762))
=======
>>>>>>> 67dc71ffb1 (GEOMESA-3067 Find attribute in Filters with Functions with embedded expressions correctly)
=======
>>>>>>> 058fd96baa (GEOMESA-3061 Converters - support bytes in Avro top-level union types (#2762))
=======
>>>>>>> f7fc21ae20 (GEOMESA-3067 Find attribute in Filters with Functions with embedded expressions correctly)
=======
>>>>>>> c22ecd64c3 (GEOMESA-3061 Converters - support bytes in Avro top-level union types (#2762))
=======
>>>>>>> 6e297b9b6f (GEOMESA-3067 Find attribute in Filters with Functions with embedded expressions correctly)
=======
>>>>>>> 2a887f75bf (GEOMESA-3061 Converters - support bytes in Avro top-level union types (#2762))
=======
>>>>>>> 08a743b61d (GEOMESA-3067 Find attribute in Filters with Functions with embedded expressions correctly)
=======
>>>>>>> b08cb4d818 (GEOMESA-3061 Converters - support bytes in Avro top-level union types (#2762))
=======
>>>>>>> 354b5e5ae5 (Merge branch 'feature/postgis-fixes')
=======
=======
>>>>>>> 32d312dc48 (GEOMESA-3067 Find attribute in Filters with Functions with embedded expressions correctly)
>>>>>>> 043f2d0167 (GEOMESA-3067 Find attribute in Filters with Functions with embedded expressions correctly)
=======
>>>>>>> ac217b392d (GEOMESA-3061 Converters - support bytes in Avro top-level union types (#2762))
=======
=======
>>>>>>> a1d28116d4 (GEOMESA-3067 Find attribute in Filters with Functions with embedded expressions correctly)
>>>>>>> a6693cb0ba (GEOMESA-3067 Find attribute in Filters with Functions with embedded expressions correctly)
=======
>>>>>>> e7d6b701c8 (GEOMESA-3061 Converters - support bytes in Avro top-level union types (#2762))
=======
=======
>>>>>>> ef55408e9a (GEOMESA-3067 Find attribute in Filters with Functions with embedded expressions correctly)
>>>>>>> 70f2c62b7e (GEOMESA-3067 Find attribute in Filters with Functions with embedded expressions correctly)
=======
>>>>>>> 95e52e061e (GEOMESA-3061 Converters - support bytes in Avro top-level union types (#2762))
=======
=======
>>>>>>> a9884ff1f6 (GEOMESA-3067 Find attribute in Filters with Functions with embedded expressions correctly)
>>>>>>> 424e7de15a (GEOMESA-3067 Find attribute in Filters with Functions with embedded expressions correctly)
=======
>>>>>>> 988874c83e (GEOMESA-3061 Converters - support bytes in Avro top-level union types (#2762))
=======
=======
>>>>>>> 49f2a1c310 (GEOMESA-3067 Find attribute in Filters with Functions with embedded expressions correctly)
>>>>>>> 87dddefcd8 (GEOMESA-3067 Find attribute in Filters with Functions with embedded expressions correctly)
=======
>>>>>>> aea9fbe131 (GEOMESA-3061 Converters - support bytes in Avro top-level union types (#2762))
=======
=======
>>>>>>> 34472778d3 (Merge branch 'feature/postgis-fixes')
>>>>>>> d581fa3e8f (Merge branch 'feature/postgis-fixes')
=======
>>>>>>> ca1e0fad13 (GEOMESA-3067 Find attribute in Filters with Functions with embedded expressions correctly)
=======
=======
>>>>>>> 810876750d (GEOMESA-3061 Converters - support bytes in Avro top-level union types (#2762))
>>>>>>> 5a55bf9756 (GEOMESA-3061 Converters - support bytes in Avro top-level union types (#2762))
=======
>>>>>>> adfec3a47a (GEOMESA-3067 Find attribute in Filters with Functions with embedded expressions correctly)
=======
=======
>>>>>>> d206a68a13 (GEOMESA-3061 Converters - support bytes in Avro top-level union types (#2762))
>>>>>>> e0c2527549 (GEOMESA-3061 Converters - support bytes in Avro top-level union types (#2762))
=======
>>>>>>> 4cf1d8d259 (GEOMESA-3067 Find attribute in Filters with Functions with embedded expressions correctly)
=======
=======
>>>>>>> 694bcd3776 (GEOMESA-3061 Converters - support bytes in Avro top-level union types (#2762))
>>>>>>> cb5e2daf2b (GEOMESA-3061 Converters - support bytes in Avro top-level union types (#2762))
=======
>>>>>>> 9bcad1eb67 (GEOMESA-3067 Find attribute in Filters with Functions with embedded expressions correctly)
=======
=======
>>>>>>> 6cd1151639 (GEOMESA-3061 Converters - support bytes in Avro top-level union types (#2762))
>>>>>>> 00e61f4b70 (GEOMESA-3061 Converters - support bytes in Avro top-level union types (#2762))
=======
>>>>>>> 9a4568fbda (GEOMESA-3067 Find attribute in Filters with Functions with embedded expressions correctly)
=======
=======
>>>>>>> 1973f72e77 (GEOMESA-3061 Converters - support bytes in Avro top-level union types (#2762))
>>>>>>> 4864cfc581 (GEOMESA-3061 Converters - support bytes in Avro top-level union types (#2762))
=======
>>>>>>> 264c9fa240 (Merge branch 'feature/postgis-fixes')
=======
=======
>>>>>>> f1532f2313 (GEOMESA-3254 Add Bloop build support)
>>>>>>> c738f63bd9 (GEOMESA-3254 Add Bloop build support)
=======
>>>>>>> 7213a78a3a (GEOMESA-3067 Find attribute in Filters with Functions with embedded expressions correctly)
=======
=======
>>>>>>> 96d5d442fa (GEOMESA-3061 Converters - support bytes in Avro top-level union types (#2762))
>>>>>>> 3676d4e56a (GEOMESA-3061 Converters - support bytes in Avro top-level union types (#2762))
=======
>>>>>>> e8ce815f1b (GEOMESA-3067 Find attribute in Filters with Functions with embedded expressions correctly)
=======
=======
>>>>>>> 5dcf23da52 (GEOMESA-3061 Converters - support bytes in Avro top-level union types (#2762))
>>>>>>> 60b4637548 (GEOMESA-3061 Converters - support bytes in Avro top-level union types (#2762))
=======
>>>>>>> 6f81d40992 (GEOMESA-3067 Find attribute in Filters with Functions with embedded expressions correctly)
=======
=======
>>>>>>> 92674ff9d4 (GEOMESA-3061 Converters - support bytes in Avro top-level union types (#2762))
>>>>>>> 009a284072 (GEOMESA-3061 Converters - support bytes in Avro top-level union types (#2762))
=======
>>>>>>> 9df4f8a9f6 (GEOMESA-3067 Find attribute in Filters with Functions with embedded expressions correctly)
=======
=======
>>>>>>> 9a4dff9e4f (GEOMESA-3061 Converters - support bytes in Avro top-level union types (#2762))
>>>>>>> 7b8c8dcc3d (GEOMESA-3061 Converters - support bytes in Avro top-level union types (#2762))
=======
>>>>>>> 79cd5cb606 (GEOMESA-3067 Find attribute in Filters with Functions with embedded expressions correctly)
=======
=======
>>>>>>> 0fc6650ecf (GEOMESA-3061 Converters - support bytes in Avro top-level union types (#2762))
>>>>>>> c029a43a6c (GEOMESA-3061 Converters - support bytes in Avro top-level union types (#2762))
=======
>>>>>>> 217b7d1cb9 (Merge branch 'feature/postgis-fixes')
=======
=======
>>>>>>> 1bb69524c2 (GEOMESA-3061 Converters - support bytes in Avro top-level union types (#2762))
>>>>>>> a5b0374ee2 (GEOMESA-3061 Converters - support bytes in Avro top-level union types (#2762))
=======
>>>>>>> 4f51687745 (GEOMESA-3061 Converters - support bytes in Avro top-level union types (#2762))
=======
=======
>>>>>>> a22efb4d66 (GEOMESA-3061 Converters - support bytes in Avro top-level union types (#2762))
>>>>>>> 9a2d40c613 (GEOMESA-3061 Converters - support bytes in Avro top-level union types (#2762))
=======
>>>>>>> 73770612e0 (GEOMESA-3061 Converters - support bytes in Avro top-level union types (#2762))
=======
=======
>>>>>>> 1e39c0c27d (GEOMESA-3061 Converters - support bytes in Avro top-level union types (#2762))
>>>>>>> 6c83981af3 (GEOMESA-3061 Converters - support bytes in Avro top-level union types (#2762))
        Result.foreach(1 to 10) { j =>
=======
        Result.foreach(1 to 10){ j =>
>>>>>>> 7acc3ea465 (GEOMESA-3067 Find attribute in Filters with Functions with embedded expressions correctly)
<<<<<<< HEAD
<<<<<<< HEAD
<<<<<<< HEAD
<<<<<<< HEAD
<<<<<<< HEAD
<<<<<<< HEAD
=======
>>>>>>> 043f2d0167 (GEOMESA-3067 Find attribute in Filters with Functions with embedded expressions correctly)
=======
>>>>>>> ac217b392d (GEOMESA-3061 Converters - support bytes in Avro top-level union types (#2762))
=======
        Result.foreach(1 to 10) { j =>
>>>>>>> b9bdd406e3 (GEOMESA-3061 Converters - support bytes in Avro top-level union types (#2762))
=======
<<<<<<< HEAD
<<<<<<< HEAD
<<<<<<< HEAD
<<<<<<< HEAD
<<<<<<< HEAD
<<<<<<< HEAD
=======
>>>>>>> a6693cb0ba (GEOMESA-3067 Find attribute in Filters with Functions with embedded expressions correctly)
=======
>>>>>>> e7d6b701c8 (GEOMESA-3061 Converters - support bytes in Avro top-level union types (#2762))
=======
>>>>>>> cdb4102515 (GEOMESA-3061 Converters - support bytes in Avro top-level union types (#2762))
=======
>>>>>>> 0e68e9f4cc (GEOMESA-3061 Converters - support bytes in Avro top-level union types (#2762))
<<<<<<< HEAD
<<<<<<< HEAD
<<<<<<< HEAD
<<<<<<< HEAD
<<<<<<< HEAD
<<<<<<< HEAD
=======
>>>>>>> a9884ff1f6 (GEOMESA-3067 Find attribute in Filters with Functions with embedded expressions correctly)
=======
>>>>>>> 657a38673a (GEOMESA-3067 Find attribute in Filters with Functions with embedded expressions correctly)
=======
>>>>>>> 95e52e061e (GEOMESA-3061 Converters - support bytes in Avro top-level union types (#2762))
=======
=======
>>>>>>> a9884ff1f6 (GEOMESA-3067 Find attribute in Filters with Functions with embedded expressions correctly)
>>>>>>> 424e7de15a (GEOMESA-3067 Find attribute in Filters with Functions with embedded expressions correctly)
=======
=======
>>>>>>> f36b0e8b9 (GEOMESA-3067 Find attribute in Filters with Functions with embedded expressions correctly)
>>>>>>> a63cb7e740 (GEOMESA-3067 Find attribute in Filters with Functions with embedded expressions correctly)
<<<<<<< HEAD
<<<<<<< HEAD
<<<<<<< HEAD
<<<<<<< HEAD
<<<<<<< HEAD
<<<<<<< HEAD
=======
>>>>>>> 424e7de15a (GEOMESA-3067 Find attribute in Filters with Functions with embedded expressions correctly)
=======
>>>>>>> 988874c83e (GEOMESA-3061 Converters - support bytes in Avro top-level union types (#2762))
=======
=======
>>>>>>> 3333975e77 (GEOMESA-3067 Find attribute in Filters with Functions with embedded expressions correctly)
=======
<<<<<<< HEAD
<<<<<<< HEAD
<<<<<<< HEAD
<<<<<<< HEAD
<<<<<<< HEAD
<<<<<<< HEAD
=======
>>>>>>> 4cf1d8d259 (GEOMESA-3067 Find attribute in Filters with Functions with embedded expressions correctly)
=======
>>>>>>> cb5e2daf2b (GEOMESA-3061 Converters - support bytes in Avro top-level union types (#2762))
>>>>>>> 76618c8da3 (GEOMESA-3061 Converters - support bytes in Avro top-level union types (#2762))
=======
>>>>>>> c3b0a1b6e3 (GEOMESA-3067 Find attribute in Filters with Functions with embedded expressions correctly)
=======
<<<<<<< HEAD
<<<<<<< HEAD
<<<<<<< HEAD
<<<<<<< HEAD
<<<<<<< HEAD
<<<<<<< HEAD
=======
>>>>>>> 9638dc731e (GEOMESA-3067 Find attribute in Filters with Functions with embedded expressions correctly)
=======
>>>>>>> 97ec7d864a (GEOMESA-3061 Converters - support bytes in Avro top-level union types (#2762))
=======
>>>>>>> db8d998aa2 (Merge branch 'feature/postgis-fixes')
=======
>>>>>>> bc49131942 (GEOMESA-3067 Find attribute in Filters with Functions with embedded expressions correctly)
=======
>>>>>>> bdbced26d4 (GEOMESA-3061 Converters - support bytes in Avro top-level union types (#2762))
=======
>>>>>>> 1b25d7ddb4 (Merge branch 'feature/postgis-fixes')
=======
>>>>>>> 0dbede148d (GEOMESA-3061 Converters - support bytes in Avro top-level union types (#2762))
=======
>>>>>>> 22dcc8170f (GEOMESA-3061 Converters - support bytes in Avro top-level union types (#2762))
=======
>>>>>>> b009fd23f4 (GEOMESA-3061 Converters - support bytes in Avro top-level union types (#2762))
=======
>>>>>>> 238945d4b3 (GEOMESA-3061 Converters - support bytes in Avro top-level union types (#2762))
=======
=======
>>>>>>> e944f1c88b (Merge branch 'feature/postgis-fixes')
=======
>>>>>>> deb8fd68de (GEOMESA-3067 Find attribute in Filters with Functions with embedded expressions correctly)
=======
>>>>>>> 8adfab65bb (GEOMESA-3061 Converters - support bytes in Avro top-level union types (#2762))
=======
>>>>>>> 3254b186da (GEOMESA-3067 Find attribute in Filters with Functions with embedded expressions correctly)
=======
>>>>>>> 7b0539b808 (GEOMESA-3061 Converters - support bytes in Avro top-level union types (#2762))
=======
>>>>>>> 982031ef44 (GEOMESA-3067 Find attribute in Filters with Functions with embedded expressions correctly)
=======
>>>>>>> 0086b292ba (GEOMESA-3061 Converters - support bytes in Avro top-level union types (#2762))
=======
>>>>>>> cf57a2c189 (GEOMESA-3067 Find attribute in Filters with Functions with embedded expressions correctly)
=======
>>>>>>> e15d50d7d3 (GEOMESA-3061 Converters - support bytes in Avro top-level union types (#2762))
=======
>>>>>>> bec3ba7d08 (GEOMESA-3067 Find attribute in Filters with Functions with embedded expressions correctly)
=======
>>>>>>> 8de43cccf6 (GEOMESA-3061 Converters - support bytes in Avro top-level union types (#2762))
=======
>>>>>>> 26e5afc4ea (Merge branch 'feature/postgis-fixes')
=======
>>>>>>> 63a045a753 (GEOMESA-3254 Add Bloop build support)
=======
>>>>>>> b1a7408547 (GEOMESA-3067 Find attribute in Filters with Functions with embedded expressions correctly)
=======
>>>>>>> 12e3a588fc (GEOMESA-3061 Converters - support bytes in Avro top-level union types (#2762))
=======
>>>>>>> c8e013ff91 (GEOMESA-3067 Find attribute in Filters with Functions with embedded expressions correctly)
=======
>>>>>>> 1890b11217 (GEOMESA-3061 Converters - support bytes in Avro top-level union types (#2762))
=======
>>>>>>> 912169b5e9 (GEOMESA-3067 Find attribute in Filters with Functions with embedded expressions correctly)
=======
>>>>>>> 9c28193a91 (GEOMESA-3061 Converters - support bytes in Avro top-level union types (#2762))
=======
>>>>>>> 1b60c2aeba (GEOMESA-3067 Find attribute in Filters with Functions with embedded expressions correctly)
=======
>>>>>>> d294ce49e2 (GEOMESA-3061 Converters - support bytes in Avro top-level union types (#2762))
=======
>>>>>>> ed45e8551f (GEOMESA-3067 Find attribute in Filters with Functions with embedded expressions correctly)
=======
>>>>>>> 1df8328338 (GEOMESA-3061 Converters - support bytes in Avro top-level union types (#2762))
=======
>>>>>>> c69897d7bd (Merge branch 'feature/postgis-fixes')
=======
>>>>>>> 516fe7e9c (GEOMESA-3061 Converters - support bytes in Avro top-level union types (#2762))
>>>>>>> bc4062951d (GEOMESA-3061 Converters - support bytes in Avro top-level union types (#2762))
=======
>>>>>>> e8cc4971c6 (Merge branch 'feature/postgis-fixes')
=======
>>>>>>> 8a3e82747d (GEOMESA-3067 Find attribute in Filters with Functions with embedded expressions correctly)
=======
>>>>>>> 81ee66102b (GEOMESA-3061 Converters - support bytes in Avro top-level union types (#2762))
=======
>>>>>>> 9943e05ec9 (GEOMESA-3067 Find attribute in Filters with Functions with embedded expressions correctly)
=======
>>>>>>> a83fe4cf7c (GEOMESA-3067 Find attribute in Filters with Functions with embedded expressions correctly)
=======
>>>>>>> a788dfac03 (GEOMESA-3061 Converters - support bytes in Avro top-level union types (#2762))
=======
>>>>>>> da00c7bd68 (Merge branch 'feature/postgis-fixes')
=======
>>>>>>> 6cd1151639 (GEOMESA-3061 Converters - support bytes in Avro top-level union types (#2762))
=======
>>>>>>> 9638dc731e (GEOMESA-3067 Find attribute in Filters with Functions with embedded expressions correctly)
=======
>>>>>>> 97ec7d864a (GEOMESA-3061 Converters - support bytes in Avro top-level union types (#2762))
=======
>>>>>>> db8d998aa2 (Merge branch 'feature/postgis-fixes')
=======
>>>>>>> bc49131942 (GEOMESA-3067 Find attribute in Filters with Functions with embedded expressions correctly)
=======
>>>>>>> bdbced26d4 (GEOMESA-3061 Converters - support bytes in Avro top-level union types (#2762))
=======
>>>>>>> 1b25d7ddb4 (Merge branch 'feature/postgis-fixes')
=======
>>>>>>> 0dbede148d (GEOMESA-3061 Converters - support bytes in Avro top-level union types (#2762))
=======
>>>>>>> 22dcc8170f (GEOMESA-3061 Converters - support bytes in Avro top-level union types (#2762))
=======
>>>>>>> b009fd23f4 (GEOMESA-3061 Converters - support bytes in Avro top-level union types (#2762))
=======
>>>>>>> 238945d4b3 (GEOMESA-3061 Converters - support bytes in Avro top-level union types (#2762))
=======
=======
>>>>>>> e944f1c88b (Merge branch 'feature/postgis-fixes')
=======
>>>>>>> deb8fd68de (GEOMESA-3067 Find attribute in Filters with Functions with embedded expressions correctly)
=======
>>>>>>> 8adfab65bb (GEOMESA-3061 Converters - support bytes in Avro top-level union types (#2762))
=======
>>>>>>> 3254b186da (GEOMESA-3067 Find attribute in Filters with Functions with embedded expressions correctly)
=======
>>>>>>> 7b0539b808 (GEOMESA-3061 Converters - support bytes in Avro top-level union types (#2762))
=======
>>>>>>> 982031ef44 (GEOMESA-3067 Find attribute in Filters with Functions with embedded expressions correctly)
=======
>>>>>>> 0086b292ba (GEOMESA-3061 Converters - support bytes in Avro top-level union types (#2762))
=======
>>>>>>> cf57a2c189 (GEOMESA-3067 Find attribute in Filters with Functions with embedded expressions correctly)
=======
>>>>>>> e15d50d7d3 (GEOMESA-3061 Converters - support bytes in Avro top-level union types (#2762))
=======
>>>>>>> bec3ba7d08 (GEOMESA-3067 Find attribute in Filters with Functions with embedded expressions correctly)
=======
>>>>>>> 8de43cccf6 (GEOMESA-3061 Converters - support bytes in Avro top-level union types (#2762))
=======
>>>>>>> 26e5afc4ea (Merge branch 'feature/postgis-fixes')
=======
>>>>>>> 63a045a753 (GEOMESA-3254 Add Bloop build support)
=======
>>>>>>> b1a7408547 (GEOMESA-3067 Find attribute in Filters with Functions with embedded expressions correctly)
=======
>>>>>>> 12e3a588fc (GEOMESA-3061 Converters - support bytes in Avro top-level union types (#2762))
=======
>>>>>>> c8e013ff91 (GEOMESA-3067 Find attribute in Filters with Functions with embedded expressions correctly)
=======
>>>>>>> 1890b11217 (GEOMESA-3061 Converters - support bytes in Avro top-level union types (#2762))
=======
>>>>>>> 912169b5e9 (GEOMESA-3067 Find attribute in Filters with Functions with embedded expressions correctly)
=======
>>>>>>> 9c28193a91 (GEOMESA-3061 Converters - support bytes in Avro top-level union types (#2762))
=======
>>>>>>> 1b60c2aeba (GEOMESA-3067 Find attribute in Filters with Functions with embedded expressions correctly)
=======
>>>>>>> d294ce49e2 (GEOMESA-3061 Converters - support bytes in Avro top-level union types (#2762))
=======
>>>>>>> ed45e8551f (GEOMESA-3067 Find attribute in Filters with Functions with embedded expressions correctly)
=======
>>>>>>> 1df8328338 (GEOMESA-3061 Converters - support bytes in Avro top-level union types (#2762))
=======
>>>>>>> c69897d7bd (Merge branch 'feature/postgis-fixes')
=======
>>>>>>> 516fe7e9c (GEOMESA-3061 Converters - support bytes in Avro top-level union types (#2762))
>>>>>>> bc4062951d (GEOMESA-3061 Converters - support bytes in Avro top-level union types (#2762))
=======
>>>>>>> e8cc4971c6 (Merge branch 'feature/postgis-fixes')
=======
>>>>>>> 8a3e82747d (GEOMESA-3067 Find attribute in Filters with Functions with embedded expressions correctly)
=======
>>>>>>> 81ee66102b (GEOMESA-3061 Converters - support bytes in Avro top-level union types (#2762))
=======
>>>>>>> 9943e05ec9 (GEOMESA-3067 Find attribute in Filters with Functions with embedded expressions correctly)
=======
>>>>>>> a83fe4cf7c (GEOMESA-3067 Find attribute in Filters with Functions with embedded expressions correctly)
=======
>>>>>>> a788dfac03 (GEOMESA-3061 Converters - support bytes in Avro top-level union types (#2762))
=======
>>>>>>> da00c7bd68 (Merge branch 'feature/postgis-fixes')
=======
>>>>>>> 94fecee1d8 (GEOMESA-3061 Converters - support bytes in Avro top-level union types (#2762))
=======
>>>>>>> 9bcad1eb67 (GEOMESA-3067 Find attribute in Filters with Functions with embedded expressions correctly)
=======
>>>>>>> 00e61f4b70 (GEOMESA-3061 Converters - support bytes in Avro top-level union types (#2762))
=======
>>>>>>> 9638dc731e (GEOMESA-3067 Find attribute in Filters with Functions with embedded expressions correctly)
=======
>>>>>>> 97ec7d864a (GEOMESA-3061 Converters - support bytes in Avro top-level union types (#2762))
=======
>>>>>>> db8d998aa2 (Merge branch 'feature/postgis-fixes')
=======
>>>>>>> bc49131942 (GEOMESA-3067 Find attribute in Filters with Functions with embedded expressions correctly)
=======
>>>>>>> bdbced26d4 (GEOMESA-3061 Converters - support bytes in Avro top-level union types (#2762))
=======
>>>>>>> 1b25d7ddb4 (Merge branch 'feature/postgis-fixes')
=======
>>>>>>> 0dbede148d (GEOMESA-3061 Converters - support bytes in Avro top-level union types (#2762))
=======
>>>>>>> 22dcc8170f (GEOMESA-3061 Converters - support bytes in Avro top-level union types (#2762))
=======
>>>>>>> b009fd23f4 (GEOMESA-3061 Converters - support bytes in Avro top-level union types (#2762))
=======
>>>>>>> 238945d4b3 (GEOMESA-3061 Converters - support bytes in Avro top-level union types (#2762))
=======
=======
>>>>>>> e944f1c88b (Merge branch 'feature/postgis-fixes')
=======
>>>>>>> deb8fd68de (GEOMESA-3067 Find attribute in Filters with Functions with embedded expressions correctly)
=======
>>>>>>> 8adfab65bb (GEOMESA-3061 Converters - support bytes in Avro top-level union types (#2762))
=======
>>>>>>> 3254b186da (GEOMESA-3067 Find attribute in Filters with Functions with embedded expressions correctly)
=======
>>>>>>> 7b0539b808 (GEOMESA-3061 Converters - support bytes in Avro top-level union types (#2762))
=======
>>>>>>> 982031ef44 (GEOMESA-3067 Find attribute in Filters with Functions with embedded expressions correctly)
=======
>>>>>>> 0086b292ba (GEOMESA-3061 Converters - support bytes in Avro top-level union types (#2762))
=======
>>>>>>> cf57a2c189 (GEOMESA-3067 Find attribute in Filters with Functions with embedded expressions correctly)
=======
>>>>>>> e15d50d7d3 (GEOMESA-3061 Converters - support bytes in Avro top-level union types (#2762))
=======
>>>>>>> bec3ba7d08 (GEOMESA-3067 Find attribute in Filters with Functions with embedded expressions correctly)
=======
>>>>>>> 8de43cccf6 (GEOMESA-3061 Converters - support bytes in Avro top-level union types (#2762))
=======
>>>>>>> 26e5afc4ea (Merge branch 'feature/postgis-fixes')
=======
>>>>>>> 63a045a753 (GEOMESA-3254 Add Bloop build support)
=======
>>>>>>> b1a7408547 (GEOMESA-3067 Find attribute in Filters with Functions with embedded expressions correctly)
=======
>>>>>>> 12e3a588fc (GEOMESA-3061 Converters - support bytes in Avro top-level union types (#2762))
=======
>>>>>>> c8e013ff91 (GEOMESA-3067 Find attribute in Filters with Functions with embedded expressions correctly)
=======
>>>>>>> 1890b11217 (GEOMESA-3061 Converters - support bytes in Avro top-level union types (#2762))
=======
>>>>>>> 912169b5e9 (GEOMESA-3067 Find attribute in Filters with Functions with embedded expressions correctly)
=======
>>>>>>> 9c28193a91 (GEOMESA-3061 Converters - support bytes in Avro top-level union types (#2762))
=======
>>>>>>> 1b60c2aeba (GEOMESA-3067 Find attribute in Filters with Functions with embedded expressions correctly)
=======
>>>>>>> d294ce49e2 (GEOMESA-3061 Converters - support bytes in Avro top-level union types (#2762))
=======
>>>>>>> ed45e8551f (GEOMESA-3067 Find attribute in Filters with Functions with embedded expressions correctly)
=======
>>>>>>> 1df8328338 (GEOMESA-3061 Converters - support bytes in Avro top-level union types (#2762))
=======
>>>>>>> c69897d7bd (Merge branch 'feature/postgis-fixes')
=======
>>>>>>> 516fe7e9c (GEOMESA-3061 Converters - support bytes in Avro top-level union types (#2762))
>>>>>>> bc4062951d (GEOMESA-3061 Converters - support bytes in Avro top-level union types (#2762))
=======
>>>>>>> e8cc4971c6 (Merge branch 'feature/postgis-fixes')
=======
>>>>>>> 8a3e82747d (GEOMESA-3067 Find attribute in Filters with Functions with embedded expressions correctly)
=======
>>>>>>> 81ee66102b (GEOMESA-3061 Converters - support bytes in Avro top-level union types (#2762))
=======
>>>>>>> 9943e05ec9 (GEOMESA-3067 Find attribute in Filters with Functions with embedded expressions correctly)
=======
>>>>>>> a83fe4cf7c (GEOMESA-3067 Find attribute in Filters with Functions with embedded expressions correctly)
=======
>>>>>>> a788dfac03 (GEOMESA-3061 Converters - support bytes in Avro top-level union types (#2762))
=======
>>>>>>> da00c7bd68 (Merge branch 'feature/postgis-fixes')
=======
>>>>>>> 6cd1151639 (GEOMESA-3061 Converters - support bytes in Avro top-level union types (#2762))
=======
>>>>>>> 9638dc731e (GEOMESA-3067 Find attribute in Filters with Functions with embedded expressions correctly)
=======
>>>>>>> 97ec7d864a (GEOMESA-3061 Converters - support bytes in Avro top-level union types (#2762))
=======
>>>>>>> db8d998aa2 (Merge branch 'feature/postgis-fixes')
=======
>>>>>>> bc49131942 (GEOMESA-3067 Find attribute in Filters with Functions with embedded expressions correctly)
=======
>>>>>>> bdbced26d4 (GEOMESA-3061 Converters - support bytes in Avro top-level union types (#2762))
=======
>>>>>>> 1b25d7ddb4 (Merge branch 'feature/postgis-fixes')
=======
>>>>>>> 0dbede148d (GEOMESA-3061 Converters - support bytes in Avro top-level union types (#2762))
=======
>>>>>>> 22dcc8170f (GEOMESA-3061 Converters - support bytes in Avro top-level union types (#2762))
=======
>>>>>>> b009fd23f4 (GEOMESA-3061 Converters - support bytes in Avro top-level union types (#2762))
=======
>>>>>>> 238945d4b3 (GEOMESA-3061 Converters - support bytes in Avro top-level union types (#2762))
=======
=======
>>>>>>> 516fe7e9c (GEOMESA-3061 Converters - support bytes in Avro top-level union types (#2762))
>>>>>>> bc4062951d (GEOMESA-3061 Converters - support bytes in Avro top-level union types (#2762))
=======
>>>>>>> 67b361c85 (GEOMESA-3061 Converters - support bytes in Avro top-level union types (#2762))
>>>>>>> c8a325e13c (GEOMESA-3061 Converters - support bytes in Avro top-level union types (#2762))
=======
<<<<<<< HEAD
<<<<<<< HEAD
<<<<<<< HEAD
<<<<<<< HEAD
<<<<<<< HEAD
<<<<<<< HEAD
=======
>>>>>>> 00e61f4b70 (GEOMESA-3061 Converters - support bytes in Avro top-level union types (#2762))
=======
>>>>>>> 6f81d40992 (GEOMESA-3067 Find attribute in Filters with Functions with embedded expressions correctly)
>>>>>>> 7f922b040c (GEOMESA-3067 Find attribute in Filters with Functions with embedded expressions correctly)
=======
>>>>>>> a910ae135f (GEOMESA-3061 Converters - support bytes in Avro top-level union types (#2762))
=======
<<<<<<< HEAD
<<<<<<< HEAD
<<<<<<< HEAD
<<<<<<< HEAD
<<<<<<< HEAD
<<<<<<< HEAD
=======
>>>>>>> 009a284072 (GEOMESA-3061 Converters - support bytes in Avro top-level union types (#2762))
=======
>>>>>>> 9df4f8a9f6 (GEOMESA-3067 Find attribute in Filters with Functions with embedded expressions correctly)
>>>>>>> 8fb0607344 (GEOMESA-3067 Find attribute in Filters with Functions with embedded expressions correctly)
=======
=======
>>>>>>> 67b361c85 (GEOMESA-3061 Converters - support bytes in Avro top-level union types (#2762))
>>>>>>> ad3cedc4db (GEOMESA-3061 Converters - support bytes in Avro top-level union types (#2762))
=======
<<<<<<< HEAD
<<<<<<< HEAD
<<<<<<< HEAD
<<<<<<< HEAD
<<<<<<< HEAD
<<<<<<< HEAD
=======
>>>>>>> 7b8c8dcc3d (GEOMESA-3061 Converters - support bytes in Avro top-level union types (#2762))
=======
>>>>>>> 4f51687745 (GEOMESA-3061 Converters - support bytes in Avro top-level union types (#2762))
>>>>>>> 240977229 (GEOMESA-3061 Converters - support bytes in Avro top-level union types (#2762))
=======
>>>>>>> 45ad5d11f (GEOMESA-3061 Converters - support bytes in Avro top-level union types (#2762))
=======
<<<<<<< HEAD
<<<<<<< HEAD
<<<<<<< HEAD
<<<<<<< HEAD
<<<<<<< HEAD
<<<<<<< HEAD
=======
>>>>>>> 1cad375176 (GEOMESA-3061 Converters - support bytes in Avro top-level union types (#2762))
=======
>>>>>>> 7b3c90c53f (GEOMESA-3061 Converters - support bytes in Avro top-level union types (#2762))
=======
>>>>>>> 9a2d40c613 (GEOMESA-3061 Converters - support bytes in Avro top-level union types (#2762))
=======
=======
>>>>>>> 1cad375176 (GEOMESA-3061 Converters - support bytes in Avro top-level union types (#2762))
>>>>>>> 73770612e0 (GEOMESA-3061 Converters - support bytes in Avro top-level union types (#2762))
=======
>>>>>>> 67b361c85 (GEOMESA-3061 Converters - support bytes in Avro top-level union types (#2762))
>>>>>>> dace2085b (GEOMESA-3061 Converters - support bytes in Avro top-level union types (#2762))
=======
<<<<<<< HEAD
<<<<<<< HEAD
<<<<<<< HEAD
<<<<<<< HEAD
<<<<<<< HEAD
=======
>>>>>>> d15af7157e (GEOMESA-3067 Find attribute in Filters with Functions with embedded expressions correctly)
=======
>>>>>>> 947761ec9b (GEOMESA-3061 Converters - support bytes in Avro top-level union types (#2762))
=======
>>>>>>> 9813375fcc (GEOMESA-3067 Find attribute in Filters with Functions with embedded expressions correctly)
=======
>>>>>>> c9328eddce (GEOMESA-3061 Converters - support bytes in Avro top-level union types (#2762))
=======
=======
>>>>>>> d94c03a98e (GEOMESA-3061 Converters - support bytes in Avro top-level union types (#2762))
=======
>>>>>>> cb6bda89b6 (Merge branch 'feature/postgis-fixes')
=======
>>>>>>> 09d87762c5 (GEOMESA-3254 Add Bloop build support)
=======
>>>>>>> e69b2aa6dc (GEOMESA-3067 Find attribute in Filters with Functions with embedded expressions correctly)
=======
>>>>>>> 67e4c1354f (GEOMESA-3061 Converters - support bytes in Avro top-level union types (#2762))
=======
>>>>>>> 060ac2189c (GEOMESA-3067 Find attribute in Filters with Functions with embedded expressions correctly)
=======
>>>>>>> 8035cc5893 (GEOMESA-3061 Converters - support bytes in Avro top-level union types (#2762))
=======
>>>>>>> 04f08c23c5 (GEOMESA-3067 Find attribute in Filters with Functions with embedded expressions correctly)
=======
>>>>>>> 07161eaaa6 (GEOMESA-3061 Converters - support bytes in Avro top-level union types (#2762))
=======
>>>>>>> 38b3282770 (GEOMESA-3067 Find attribute in Filters with Functions with embedded expressions correctly)
=======
>>>>>>> 9abc630fdf (GEOMESA-3061 Converters - support bytes in Avro top-level union types (#2762))
=======
>>>>>>> 570899511d (GEOMESA-3067 Find attribute in Filters with Functions with embedded expressions correctly)
=======
>>>>>>> 25063957fc (GEOMESA-3061 Converters - support bytes in Avro top-level union types (#2762))
=======
>>>>>>> 699117eca9 (Merge branch 'feature/postgis-fixes')
=======
>>>>>>> 9638dc731 (GEOMESA-3067 Find attribute in Filters with Functions with embedded expressions correctly)
>>>>>>> d2eec4be68 (GEOMESA-3067 Find attribute in Filters with Functions with embedded expressions correctly)
=======
>>>>>>> 97ec7d864 (GEOMESA-3061 Converters - support bytes in Avro top-level union types (#2762))
=======
>>>>>>> db8d998aa (Merge branch 'feature/postgis-fixes')
=======
>>>>>>> bc4913194 (GEOMESA-3067 Find attribute in Filters with Functions with embedded expressions correctly)
=======
>>>>>>> bdbced26d (GEOMESA-3061 Converters - support bytes in Avro top-level union types (#2762))
=======
>>>>>>> 1b25d7ddb (Merge branch 'feature/postgis-fixes')
=======
>>>>>>> 963feec660 (GEOMESA-3061 Converters - support bytes in Avro top-level union types (#2762))
=======
>>>>>>> d15af7157e (GEOMESA-3067 Find attribute in Filters with Functions with embedded expressions correctly)
=======
>>>>>>> 947761ec9b (GEOMESA-3061 Converters - support bytes in Avro top-level union types (#2762))
=======
>>>>>>> 9813375fcc (GEOMESA-3067 Find attribute in Filters with Functions with embedded expressions correctly)
=======
>>>>>>> c9328eddce (GEOMESA-3061 Converters - support bytes in Avro top-level union types (#2762))
=======
=======
>>>>>>> d94c03a98e (GEOMESA-3061 Converters - support bytes in Avro top-level union types (#2762))
=======
>>>>>>> cb6bda89b6 (Merge branch 'feature/postgis-fixes')
=======
>>>>>>> 09d87762c5 (GEOMESA-3254 Add Bloop build support)
=======
>>>>>>> e69b2aa6dc (GEOMESA-3067 Find attribute in Filters with Functions with embedded expressions correctly)
=======
>>>>>>> 67e4c1354f (GEOMESA-3061 Converters - support bytes in Avro top-level union types (#2762))
=======
>>>>>>> 060ac2189c (GEOMESA-3067 Find attribute in Filters with Functions with embedded expressions correctly)
=======
>>>>>>> 8035cc5893 (GEOMESA-3061 Converters - support bytes in Avro top-level union types (#2762))
=======
>>>>>>> 04f08c23c5 (GEOMESA-3067 Find attribute in Filters with Functions with embedded expressions correctly)
=======
>>>>>>> 07161eaaa6 (GEOMESA-3061 Converters - support bytes in Avro top-level union types (#2762))
=======
>>>>>>> 38b3282770 (GEOMESA-3067 Find attribute in Filters with Functions with embedded expressions correctly)
=======
>>>>>>> 9abc630fdf (GEOMESA-3061 Converters - support bytes in Avro top-level union types (#2762))
=======
>>>>>>> 570899511d (GEOMESA-3067 Find attribute in Filters with Functions with embedded expressions correctly)
=======
>>>>>>> 25063957fc (GEOMESA-3061 Converters - support bytes in Avro top-level union types (#2762))
=======
>>>>>>> 699117eca9 (Merge branch 'feature/postgis-fixes')
=======
>>>>>>> 9638dc731 (GEOMESA-3067 Find attribute in Filters with Functions with embedded expressions correctly)
>>>>>>> d2eec4be68 (GEOMESA-3067 Find attribute in Filters with Functions with embedded expressions correctly)
=======
>>>>>>> 97ec7d864 (GEOMESA-3061 Converters - support bytes in Avro top-level union types (#2762))
=======
>>>>>>> db8d998aa (Merge branch 'feature/postgis-fixes')
=======
>>>>>>> bc4913194 (GEOMESA-3067 Find attribute in Filters with Functions with embedded expressions correctly)
=======
>>>>>>> bdbced26d (GEOMESA-3061 Converters - support bytes in Avro top-level union types (#2762))
=======
>>>>>>> 1b25d7ddb (Merge branch 'feature/postgis-fixes')
=======
>>>>>>> 3e7fb62639 (GEOMESA-3061 Converters - support bytes in Avro top-level union types (#2762))
=======
>>>>>>> 73770612e0 (GEOMESA-3061 Converters - support bytes in Avro top-level union types (#2762))
=======
>>>>>>> d15af7157e (GEOMESA-3067 Find attribute in Filters with Functions with embedded expressions correctly)
=======
>>>>>>> 947761ec9b (GEOMESA-3061 Converters - support bytes in Avro top-level union types (#2762))
=======
>>>>>>> 9813375fcc (GEOMESA-3067 Find attribute in Filters with Functions with embedded expressions correctly)
=======
>>>>>>> c9328eddce (GEOMESA-3061 Converters - support bytes in Avro top-level union types (#2762))
=======
=======
>>>>>>> d94c03a98e (GEOMESA-3061 Converters - support bytes in Avro top-level union types (#2762))
=======
>>>>>>> cb6bda89b6 (Merge branch 'feature/postgis-fixes')
=======
>>>>>>> 09d87762c5 (GEOMESA-3254 Add Bloop build support)
=======
>>>>>>> e69b2aa6dc (GEOMESA-3067 Find attribute in Filters with Functions with embedded expressions correctly)
=======
>>>>>>> 67e4c1354f (GEOMESA-3061 Converters - support bytes in Avro top-level union types (#2762))
=======
>>>>>>> 060ac2189c (GEOMESA-3067 Find attribute in Filters with Functions with embedded expressions correctly)
=======
>>>>>>> 8035cc5893 (GEOMESA-3061 Converters - support bytes in Avro top-level union types (#2762))
=======
>>>>>>> 04f08c23c5 (GEOMESA-3067 Find attribute in Filters with Functions with embedded expressions correctly)
=======
>>>>>>> 07161eaaa6 (GEOMESA-3061 Converters - support bytes in Avro top-level union types (#2762))
=======
>>>>>>> 38b3282770 (GEOMESA-3067 Find attribute in Filters with Functions with embedded expressions correctly)
=======
>>>>>>> 9abc630fdf (GEOMESA-3061 Converters - support bytes in Avro top-level union types (#2762))
=======
>>>>>>> 570899511d (GEOMESA-3067 Find attribute in Filters with Functions with embedded expressions correctly)
=======
>>>>>>> 25063957fc (GEOMESA-3061 Converters - support bytes in Avro top-level union types (#2762))
=======
>>>>>>> 699117eca9 (Merge branch 'feature/postgis-fixes')
=======
>>>>>>> 9638dc731 (GEOMESA-3067 Find attribute in Filters with Functions with embedded expressions correctly)
>>>>>>> d2eec4be68 (GEOMESA-3067 Find attribute in Filters with Functions with embedded expressions correctly)
=======
>>>>>>> 97ec7d864 (GEOMESA-3061 Converters - support bytes in Avro top-level union types (#2762))
=======
>>>>>>> db8d998aa (Merge branch 'feature/postgis-fixes')
=======
>>>>>>> bc4913194 (GEOMESA-3067 Find attribute in Filters with Functions with embedded expressions correctly)
=======
>>>>>>> bdbced26d (GEOMESA-3061 Converters - support bytes in Avro top-level union types (#2762))
=======
>>>>>>> 1b25d7ddb (Merge branch 'feature/postgis-fixes')
=======
>>>>>>> 67b361c85 (GEOMESA-3061 Converters - support bytes in Avro top-level union types (#2762))
=======
>>>>>>> 9d708b240 (GEOMESA-3061 Converters - support bytes in Avro top-level union types (#2762))
>>>>>>> 53a3e72cbf (GEOMESA-3061 Converters - support bytes in Avro top-level union types (#2762))
=======
<<<<<<< HEAD
<<<<<<< HEAD
<<<<<<< HEAD
<<<<<<< HEAD
>>>>>>> 3333975e7 (GEOMESA-3067 Find attribute in Filters with Functions with embedded expressions correctly)
=======
>>>>>>> 76618c8da (GEOMESA-3061 Converters - support bytes in Avro top-level union types (#2762))
=======
<<<<<<< HEAD
<<<<<<< HEAD
<<<<<<< HEAD
<<<<<<< HEAD
>>>>>>> c3b0a1b6e (GEOMESA-3067 Find attribute in Filters with Functions with embedded expressions correctly)
=======
=======
>>>>>>> 67b361c85 (GEOMESA-3061 Converters - support bytes in Avro top-level union types (#2762))
>>>>>>> c8a325e13 (GEOMESA-3061 Converters - support bytes in Avro top-level union types (#2762))
=======
<<<<<<< HEAD
<<<<<<< HEAD
<<<<<<< HEAD
<<<<<<< HEAD
>>>>>>> e6e1f4bdd (GEOMESA-3061 Converters - support bytes in Avro top-level union types (#2762))
=======
>>>>>>> 7f922b040 (GEOMESA-3067 Find attribute in Filters with Functions with embedded expressions correctly)
=======
<<<<<<< HEAD
<<<<<<< HEAD
<<<<<<< HEAD
<<<<<<< HEAD
>>>>>>> a910ae135 (GEOMESA-3061 Converters - support bytes in Avro top-level union types (#2762))
=======
>>>>>>> 8fb060734 (GEOMESA-3067 Find attribute in Filters with Functions with embedded expressions correctly)
=======
<<<<<<< HEAD
<<<<<<< HEAD
<<<<<<< HEAD
<<<<<<< HEAD
=======
>>>>>>> a35efac12e (GEOMESA-3061 Converters - support bytes in Avro top-level union types (#2762))
=======
>>>>>>> 6e30236dd2 (GEOMESA-3061 Converters - support bytes in Avro top-level union types (#2762))
=======
>>>>>>> 67b361c85 (GEOMESA-3061 Converters - support bytes in Avro top-level union types (#2762))
>>>>>>> ad3cedc4d (GEOMESA-3061 Converters - support bytes in Avro top-level union types (#2762))
=======
<<<<<<< HEAD
<<<<<<< HEAD
<<<<<<< HEAD
<<<<<<< HEAD
>>>>>>> 20f6826d0f (GEOMESA-3067 Find attribute in Filters with Functions with embedded expressions correctly)
=======
>>>>>>> 4c361f07da (GEOMESA-3061 Converters - support bytes in Avro top-level union types (#2762))
=======
<<<<<<< HEAD
<<<<<<< HEAD
<<<<<<< HEAD
<<<<<<< HEAD
>>>>>>> 125ffd0575 (GEOMESA-3067 Find attribute in Filters with Functions with embedded expressions correctly)
=======
=======
>>>>>>> 67b361c85 (GEOMESA-3061 Converters - support bytes in Avro top-level union types (#2762))
>>>>>>> f302a54949 (GEOMESA-3061 Converters - support bytes in Avro top-level union types (#2762))
=======
<<<<<<< HEAD
<<<<<<< HEAD
<<<<<<< HEAD
=======
>>>>>>> 9412e85b59 (GEOMESA-3067 Find attribute in Filters with Functions with embedded expressions correctly)
=======
>>>>>>> 76618c8da3 (GEOMESA-3061 Converters - support bytes in Avro top-level union types (#2762))
=======
>>>>>>> 694bcd3776 (GEOMESA-3061 Converters - support bytes in Avro top-level union types (#2762))
<<<<<<< HEAD
<<<<<<< HEAD
=======
>>>>>>> 24c4df93a5 (GEOMESA-3067 Find attribute in Filters with Functions with embedded expressions correctly)
=======
>>>>>>> 6cd1151639 (GEOMESA-3061 Converters - support bytes in Avro top-level union types (#2762))
<<<<<<< HEAD
<<<<<<< HEAD
=======
>>>>>>> 6f81d40992 (GEOMESA-3067 Find attribute in Filters with Functions with embedded expressions correctly)
=======
>>>>>>> 7f922b040c (GEOMESA-3067 Find attribute in Filters with Functions with embedded expressions correctly)
=======
>>>>>>> 2b62d1f3fe (GEOMESA-3067 Find attribute in Filters with Functions with embedded expressions correctly)
<<<<<<< HEAD
<<<<<<< HEAD
=======
>>>>>>> 92674ff9d4 (GEOMESA-3061 Converters - support bytes in Avro top-level union types (#2762))
=======
>>>>>>> 8fb0607344 (GEOMESA-3067 Find attribute in Filters with Functions with embedded expressions correctly)
=======
>>>>>>> c169cb2905 (GEOMESA-3067 Find attribute in Filters with Functions with embedded expressions correctly)
<<<<<<< HEAD
<<<<<<< HEAD
=======
>>>>>>> 9a4dff9e4f (GEOMESA-3061 Converters - support bytes in Avro top-level union types (#2762))
=======
>>>>>>> 240977229 (GEOMESA-3061 Converters - support bytes in Avro top-level union types (#2762))
=======
>>>>>>> 8c9ca1211a (GEOMESA-3061 Converters - support bytes in Avro top-level union types (#2762))
<<<<<<< HEAD
<<<<<<< HEAD
=======
>>>>>>> a22efb4d66 (GEOMESA-3061 Converters - support bytes in Avro top-level union types (#2762))
=======
>>>>>>> 1cad375176 (GEOMESA-3061 Converters - support bytes in Avro top-level union types (#2762))
<<<<<<< HEAD
=======
>>>>>>> 963feec660 (GEOMESA-3061 Converters - support bytes in Avro top-level union types (#2762))
=======
>>>>>>> 3333975e7 (GEOMESA-3067 Find attribute in Filters with Functions with embedded expressions correctly)
=======
>>>>>>> 2c14568a23 (GEOMESA-3067 Find attribute in Filters with Functions with embedded expressions correctly)
=======
>>>>>>> 84ac051f28 (GEOMESA-3061 Converters - support bytes in Avro top-level union types (#2762))
=======
>>>>>>> c3b0a1b6e (GEOMESA-3067 Find attribute in Filters with Functions with embedded expressions correctly)
=======
>>>>>>> 99acaa0887 (GEOMESA-3067 Find attribute in Filters with Functions with embedded expressions correctly)
=======
>>>>>>> fe3de10f11 (GEOMESA-3061 Converters - support bytes in Avro top-level union types (#2762))
=======
>>>>>>> e6e1f4bdd (GEOMESA-3061 Converters - support bytes in Avro top-level union types (#2762))
=======
>>>>>>> 5c6b9f1f8b (GEOMESA-3061 Converters - support bytes in Avro top-level union types (#2762))
=======
>>>>>>> 511bd92a86 (GEOMESA-3067 Find attribute in Filters with Functions with embedded expressions correctly)
=======
>>>>>>> a910ae135 (GEOMESA-3061 Converters - support bytes in Avro top-level union types (#2762))
=======
>>>>>>> 9d44ff473d (GEOMESA-3061 Converters - support bytes in Avro top-level union types (#2762))
=======
>>>>>>> bff2bdde04 (GEOMESA-3067 Find attribute in Filters with Functions with embedded expressions correctly)
=======
>>>>>>> a35efac12e (GEOMESA-3061 Converters - support bytes in Avro top-level union types (#2762))
=======
>>>>>>> 20f6826d0f (GEOMESA-3067 Find attribute in Filters with Functions with embedded expressions correctly)
=======
>>>>>>> de7d6ef448 (GEOMESA-3067 Find attribute in Filters with Functions with embedded expressions correctly)
=======
>>>>>>> f110463a26 (GEOMESA-3061 Converters - support bytes in Avro top-level union types (#2762))
=======
>>>>>>> 125ffd0575 (GEOMESA-3067 Find attribute in Filters with Functions with embedded expressions correctly)
=======
>>>>>>> d83561962d (GEOMESA-3067 Find attribute in Filters with Functions with embedded expressions correctly)
=======
>>>>>>> 86ec77f9cb (GEOMESA-3061 Converters - support bytes in Avro top-level union types (#2762))
=======
>>>>>>> fa429c7863 (GEOMESA-3067 Find attribute in Filters with Functions with embedded expressions correctly)
=======
>>>>>>> 76618c8da3 (GEOMESA-3061 Converters - support bytes in Avro top-level union types (#2762))
=======
>>>>>>> 5cf31d21f3 (GEOMESA-3061 Converters - support bytes in Avro top-level union types (#2762))
=======
>>>>>>> def2794bb5 (GEOMESA-3067 Find attribute in Filters with Functions with embedded expressions correctly)
=======
>>>>>>> 94fecee1d8 (GEOMESA-3061 Converters - support bytes in Avro top-level union types (#2762))
=======
>>>>>>> 7f922b040c (GEOMESA-3067 Find attribute in Filters with Functions with embedded expressions correctly)
=======
>>>>>>> 8b16ac5c65 (GEOMESA-3067 Find attribute in Filters with Functions with embedded expressions correctly)
=======
>>>>>>> 4ccd6f6b1f (GEOMESA-3061 Converters - support bytes in Avro top-level union types (#2762))
=======
>>>>>>> 8fb0607344 (GEOMESA-3067 Find attribute in Filters with Functions with embedded expressions correctly)
=======
>>>>>>> f983ea29f0 (GEOMESA-3067 Find attribute in Filters with Functions with embedded expressions correctly)
=======
>>>>>>> 35b69b8f2f (GEOMESA-3061 Converters - support bytes in Avro top-level union types (#2762))
=======
>>>>>>> 240977229 (GEOMESA-3061 Converters - support bytes in Avro top-level union types (#2762))
=======
>>>>>>> 26a09ee6c2 (GEOMESA-3061 Converters - support bytes in Avro top-level union types (#2762))
=======
>>>>>>> 194ad4e5c0 (GEOMESA-3061 Converters - support bytes in Avro top-level union types (#2762))
=======
>>>>>>> 7b3c90c53f (GEOMESA-3061 Converters - support bytes in Avro top-level union types (#2762))
=======
>>>>>>> 3e7fb62639 (GEOMESA-3061 Converters - support bytes in Avro top-level union types (#2762))
=======
>>>>>>> 3333975e7 (GEOMESA-3067 Find attribute in Filters with Functions with embedded expressions correctly)
=======
>>>>>>> 00d66ae013 (GEOMESA-3067 Find attribute in Filters with Functions with embedded expressions correctly)
=======
>>>>>>> c2cfc968d2 (GEOMESA-3061 Converters - support bytes in Avro top-level union types (#2762))
=======
>>>>>>> c3b0a1b6e (GEOMESA-3067 Find attribute in Filters with Functions with embedded expressions correctly)
=======
>>>>>>> 5d8dab9f81 (GEOMESA-3067 Find attribute in Filters with Functions with embedded expressions correctly)
=======
>>>>>>> 0fa73844a1 (GEOMESA-3061 Converters - support bytes in Avro top-level union types (#2762))
=======
>>>>>>> e6e1f4bdd (GEOMESA-3061 Converters - support bytes in Avro top-level union types (#2762))
=======
>>>>>>> b800c052cc (GEOMESA-3061 Converters - support bytes in Avro top-level union types (#2762))
=======
>>>>>>> 8e70a881a6 (GEOMESA-3067 Find attribute in Filters with Functions with embedded expressions correctly)
=======
>>>>>>> a910ae135 (GEOMESA-3061 Converters - support bytes in Avro top-level union types (#2762))
=======
>>>>>>> 9dbe1503e8 (GEOMESA-3061 Converters - support bytes in Avro top-level union types (#2762))
=======
>>>>>>> 53bc726472 (GEOMESA-3067 Find attribute in Filters with Functions with embedded expressions correctly)
=======
>>>>>>> 6e30236dd2 (GEOMESA-3061 Converters - support bytes in Avro top-level union types (#2762))
=======
>>>>>>> 20f6826d0f (GEOMESA-3067 Find attribute in Filters with Functions with embedded expressions correctly)
=======
>>>>>>> f7fc21ae20 (GEOMESA-3067 Find attribute in Filters with Functions with embedded expressions correctly)
=======
>>>>>>> c22ecd64c3 (GEOMESA-3061 Converters - support bytes in Avro top-level union types (#2762))
=======
>>>>>>> 125ffd0575 (GEOMESA-3067 Find attribute in Filters with Functions with embedded expressions correctly)
=======
>>>>>>> 6e297b9b6f (GEOMESA-3067 Find attribute in Filters with Functions with embedded expressions correctly)
=======
>>>>>>> 2a887f75bf (GEOMESA-3061 Converters - support bytes in Avro top-level union types (#2762))
=======
=======
>>>>>>> 9412e85b59 (GEOMESA-3067 Find attribute in Filters with Functions with embedded expressions correctly)
>>>>>>> 4cf1d8d259 (GEOMESA-3067 Find attribute in Filters with Functions with embedded expressions correctly)
=======
>>>>>>> cb5e2daf2b (GEOMESA-3061 Converters - support bytes in Avro top-level union types (#2762))
=======
=======
>>>>>>> 24c4df93a5 (GEOMESA-3067 Find attribute in Filters with Functions with embedded expressions correctly)
>>>>>>> 9bcad1eb67 (GEOMESA-3067 Find attribute in Filters with Functions with embedded expressions correctly)
=======
>>>>>>> 00e61f4b70 (GEOMESA-3061 Converters - support bytes in Avro top-level union types (#2762))
=======
>>>>>>> 6f81d40992 (GEOMESA-3067 Find attribute in Filters with Functions with embedded expressions correctly)
=======
=======
>>>>>>> 92674ff9d4 (GEOMESA-3061 Converters - support bytes in Avro top-level union types (#2762))
>>>>>>> 009a284072 (GEOMESA-3061 Converters - support bytes in Avro top-level union types (#2762))
=======
>>>>>>> 9df4f8a9f6 (GEOMESA-3067 Find attribute in Filters with Functions with embedded expressions correctly)
=======
=======
>>>>>>> 9a4dff9e4f (GEOMESA-3061 Converters - support bytes in Avro top-level union types (#2762))
>>>>>>> 7b8c8dcc3d (GEOMESA-3061 Converters - support bytes in Avro top-level union types (#2762))
=======
>>>>>>> 4f51687745 (GEOMESA-3061 Converters - support bytes in Avro top-level union types (#2762))
=======
=======
>>>>>>> a22efb4d66 (GEOMESA-3061 Converters - support bytes in Avro top-level union types (#2762))
>>>>>>> 9a2d40c613 (GEOMESA-3061 Converters - support bytes in Avro top-level union types (#2762))
=======
>>>>>>> 73770612e0 (GEOMESA-3061 Converters - support bytes in Avro top-level union types (#2762))
>>>>>>> f36b0e8b9 (GEOMESA-3067 Find attribute in Filters with Functions with embedded expressions correctly)
=======
>>>>>>> cdb410251 (GEOMESA-3061 Converters - support bytes in Avro top-level union types (#2762))
<<<<<<< HEAD
<<<<<<< HEAD
<<<<<<< HEAD
<<<<<<< HEAD
<<<<<<< HEAD
<<<<<<< HEAD
<<<<<<< HEAD
<<<<<<< HEAD
<<<<<<< HEAD
<<<<<<< HEAD
<<<<<<< HEAD
<<<<<<< HEAD
<<<<<<< HEAD
<<<<<<< HEAD
<<<<<<< HEAD
<<<<<<< HEAD
<<<<<<< HEAD
<<<<<<< HEAD
<<<<<<< HEAD
<<<<<<< HEAD
<<<<<<< HEAD
<<<<<<< HEAD
<<<<<<< HEAD
<<<<<<< HEAD
<<<<<<< HEAD
<<<<<<< HEAD
<<<<<<< HEAD
<<<<<<< HEAD
<<<<<<< HEAD
<<<<<<< HEAD
<<<<<<< HEAD
<<<<<<< HEAD
<<<<<<< HEAD
<<<<<<< HEAD
<<<<<<< HEAD
<<<<<<< HEAD
<<<<<<< HEAD
<<<<<<< HEAD
<<<<<<< HEAD
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
>>>>>>> 00e61f4b70 (GEOMESA-3061 Converters - support bytes in Avro top-level union types (#2762))
=======
>>>>>>> 6f81d40992 (GEOMESA-3067 Find attribute in Filters with Functions with embedded expressions correctly)
=======
>>>>>>> 7b8c8dcc3d (GEOMESA-3061 Converters - support bytes in Avro top-level union types (#2762))
=======
>>>>>>> 4f51687745 (GEOMESA-3061 Converters - support bytes in Avro top-level union types (#2762))
=======
>>>>>>> 73770612e0 (GEOMESA-3061 Converters - support bytes in Avro top-level union types (#2762))
=======
>>>>>>> 9412e85b59 (GEOMESA-3067 Find attribute in Filters with Functions with embedded expressions correctly)
=======
>>>>>>> 6cd1151639 (GEOMESA-3061 Converters - support bytes in Avro top-level union types (#2762))
<<<<<<< HEAD
<<<<<<< HEAD
=======
>>>>>>> 2b62d1f3fe (GEOMESA-3067 Find attribute in Filters with Functions with embedded expressions correctly)
=======
>>>>>>> 9a4dff9e4f (GEOMESA-3061 Converters - support bytes in Avro top-level union types (#2762))
<<<<<<< HEAD
<<<<<<< HEAD
=======
>>>>>>> 8c9ca1211a (GEOMESA-3061 Converters - support bytes in Avro top-level union types (#2762))
=======
>>>>>>> 1cad375176 (GEOMESA-3061 Converters - support bytes in Avro top-level union types (#2762))
<<<<<<< HEAD
=======
>>>>>>> 963feec660 (GEOMESA-3061 Converters - support bytes in Avro top-level union types (#2762))
=======
>>>>>>> 2c14568a23 (GEOMESA-3067 Find attribute in Filters with Functions with embedded expressions correctly)
=======
>>>>>>> fe3de10f11 (GEOMESA-3061 Converters - support bytes in Avro top-level union types (#2762))
=======
>>>>>>> 5c6b9f1f8b (GEOMESA-3061 Converters - support bytes in Avro top-level union types (#2762))
=======
>>>>>>> 511bd92a86 (GEOMESA-3067 Find attribute in Filters with Functions with embedded expressions correctly)
=======
>>>>>>> a35efac12e (GEOMESA-3061 Converters - support bytes in Avro top-level union types (#2762))
=======
>>>>>>> de7d6ef448 (GEOMESA-3067 Find attribute in Filters with Functions with embedded expressions correctly)
=======
>>>>>>> 86ec77f9cb (GEOMESA-3061 Converters - support bytes in Avro top-level union types (#2762))
=======
>>>>>>> fa429c7863 (GEOMESA-3067 Find attribute in Filters with Functions with embedded expressions correctly)
=======
>>>>>>> 94fecee1d8 (GEOMESA-3061 Converters - support bytes in Avro top-level union types (#2762))
=======
>>>>>>> 8b16ac5c65 (GEOMESA-3067 Find attribute in Filters with Functions with embedded expressions correctly)
=======
>>>>>>> 35b69b8f2f (GEOMESA-3061 Converters - support bytes in Avro top-level union types (#2762))
=======
>>>>>>> 26a09ee6c2 (GEOMESA-3061 Converters - support bytes in Avro top-level union types (#2762))
=======
>>>>>>> 7b3c90c53f (GEOMESA-3061 Converters - support bytes in Avro top-level union types (#2762))
=======
>>>>>>> 3e7fb62639 (GEOMESA-3061 Converters - support bytes in Avro top-level union types (#2762))
=======
>>>>>>> 00d66ae013 (GEOMESA-3067 Find attribute in Filters with Functions with embedded expressions correctly)
=======
>>>>>>> 0fa73844a1 (GEOMESA-3061 Converters - support bytes in Avro top-level union types (#2762))
=======
>>>>>>> b800c052cc (GEOMESA-3061 Converters - support bytes in Avro top-level union types (#2762))
=======
>>>>>>> 8e70a881a6 (GEOMESA-3067 Find attribute in Filters with Functions with embedded expressions correctly)
=======
>>>>>>> 6e30236dd2 (GEOMESA-3061 Converters - support bytes in Avro top-level union types (#2762))
=======
>>>>>>> f7fc21ae20 (GEOMESA-3067 Find attribute in Filters with Functions with embedded expressions correctly)
=======
>>>>>>> 2a887f75bf (GEOMESA-3061 Converters - support bytes in Avro top-level union types (#2762))
=======
=======
>>>>>>> 9412e85b59 (GEOMESA-3067 Find attribute in Filters with Functions with embedded expressions correctly)
>>>>>>> 4cf1d8d259 (GEOMESA-3067 Find attribute in Filters with Functions with embedded expressions correctly)
=======
>>>>>>> 00e61f4b70 (GEOMESA-3061 Converters - support bytes in Avro top-level union types (#2762))
=======
=======
>>>>>>> 2b62d1f3fe (GEOMESA-3067 Find attribute in Filters with Functions with embedded expressions correctly)
>>>>>>> 6f81d40992 (GEOMESA-3067 Find attribute in Filters with Functions with embedded expressions correctly)
=======
>>>>>>> 7b8c8dcc3d (GEOMESA-3061 Converters - support bytes in Avro top-level union types (#2762))
=======
=======
>>>>>>> 8c9ca1211a (GEOMESA-3061 Converters - support bytes in Avro top-level union types (#2762))
>>>>>>> 4f51687745 (GEOMESA-3061 Converters - support bytes in Avro top-level union types (#2762))
=======
>>>>>>> 73770612e0 (GEOMESA-3061 Converters - support bytes in Avro top-level union types (#2762))
>>>>>>> 67b361c856 (GEOMESA-3061 Converters - support bytes in Avro top-level union types (#2762))
=======
>>>>>>> b4320946b4 (GEOMESA-3061 Converters - support bytes in Avro top-level union types (#2762))
=======
>>>>>>> d9ed077cd1 (GEOMESA-3061 Converters - support bytes in Avro top-level union types (#2762))
=======
=======
>>>>>>> f36b0e8b9 (GEOMESA-3067 Find attribute in Filters with Functions with embedded expressions correctly)
>>>>>>> e182e6e99c (GEOMESA-3067 Find attribute in Filters with Functions with embedded expressions correctly)
=======
=======
>>>>>>> f36b0e8b9 (GEOMESA-3067 Find attribute in Filters with Functions with embedded expressions correctly)
=======
>>>>>>> cdb410251 (GEOMESA-3061 Converters - support bytes in Avro top-level union types (#2762))
>>>>>>> 9d708b240a (GEOMESA-3061 Converters - support bytes in Avro top-level union types (#2762))
<<<<<<< HEAD
<<<<<<< HEAD
<<<<<<< HEAD
<<<<<<< HEAD
<<<<<<< HEAD
<<<<<<< HEAD
=======
>>>>>>> e0c2527549 (GEOMESA-3061 Converters - support bytes in Avro top-level union types (#2762))
=======
>>>>>>> 4cf1d8d259 (GEOMESA-3067 Find attribute in Filters with Functions with embedded expressions correctly)
=======
=======
>>>>>>> c8a325e13c (GEOMESA-3061 Converters - support bytes in Avro top-level union types (#2762))
=======
<<<<<<< HEAD
<<<<<<< HEAD
<<<<<<< HEAD
<<<<<<< HEAD
<<<<<<< HEAD
<<<<<<< HEAD
=======
>>>>>>> 00e61f4b70 (GEOMESA-3061 Converters - support bytes in Avro top-level union types (#2762))
=======
>>>>>>> 7b8c8dcc3d (GEOMESA-3061 Converters - support bytes in Avro top-level union types (#2762))
>>>>>>> ad3cedc4db (GEOMESA-3061 Converters - support bytes in Avro top-level union types (#2762))
=======
>>>>>>> 22dcc8170f (GEOMESA-3061 Converters - support bytes in Avro top-level union types (#2762))
=======
<<<<<<< HEAD
<<<<<<< HEAD
<<<<<<< HEAD
<<<<<<< HEAD
<<<<<<< HEAD
<<<<<<< HEAD
=======
>>>>>>> 7b0539b808 (GEOMESA-3061 Converters - support bytes in Avro top-level union types (#2762))
=======
>>>>>>> 982031ef44 (GEOMESA-3067 Find attribute in Filters with Functions with embedded expressions correctly)
=======
>>>>>>> e15d50d7d3 (GEOMESA-3061 Converters - support bytes in Avro top-level union types (#2762))
=======
>>>>>>> 1890b11217 (GEOMESA-3061 Converters - support bytes in Avro top-level union types (#2762))
=======
>>>>>>> 912169b5e9 (GEOMESA-3067 Find attribute in Filters with Functions with embedded expressions correctly)
=======
>>>>>>> d294ce49e2 (GEOMESA-3061 Converters - support bytes in Avro top-level union types (#2762))
=======
>>>>>>> 1cad375176 (GEOMESA-3061 Converters - support bytes in Avro top-level union types (#2762))
=======
>>>>>>> 7b0539b808 (GEOMESA-3061 Converters - support bytes in Avro top-level union types (#2762))
=======
>>>>>>> 982031ef44 (GEOMESA-3067 Find attribute in Filters with Functions with embedded expressions correctly)
=======
>>>>>>> e15d50d7d3 (GEOMESA-3061 Converters - support bytes in Avro top-level union types (#2762))
=======
>>>>>>> 1890b11217 (GEOMESA-3061 Converters - support bytes in Avro top-level union types (#2762))
=======
>>>>>>> 912169b5e9 (GEOMESA-3067 Find attribute in Filters with Functions with embedded expressions correctly)
=======
>>>>>>> d294ce49e2 (GEOMESA-3061 Converters - support bytes in Avro top-level union types (#2762))
=======
>>>>>>> 7b3c90c53f (GEOMESA-3061 Converters - support bytes in Avro top-level union types (#2762))
=======
>>>>>>> 4f51687745 (GEOMESA-3061 Converters - support bytes in Avro top-level union types (#2762))
=======
>>>>>>> 73770612e0 (GEOMESA-3061 Converters - support bytes in Avro top-level union types (#2762))
=======
>>>>>>> 7b0539b808 (GEOMESA-3061 Converters - support bytes in Avro top-level union types (#2762))
=======
>>>>>>> 982031ef44 (GEOMESA-3067 Find attribute in Filters with Functions with embedded expressions correctly)
=======
>>>>>>> e15d50d7d3 (GEOMESA-3061 Converters - support bytes in Avro top-level union types (#2762))
=======
>>>>>>> 1890b11217 (GEOMESA-3061 Converters - support bytes in Avro top-level union types (#2762))
=======
>>>>>>> 912169b5e9 (GEOMESA-3067 Find attribute in Filters with Functions with embedded expressions correctly)
=======
>>>>>>> d294ce49e2 (GEOMESA-3061 Converters - support bytes in Avro top-level union types (#2762))
=======
>>>>>>> 1cad375176 (GEOMESA-3061 Converters - support bytes in Avro top-level union types (#2762))
=======
>>>>>>> dace2085b (GEOMESA-3061 Converters - support bytes in Avro top-level union types (#2762))
>>>>>>> 238945d4b3 (GEOMESA-3061 Converters - support bytes in Avro top-level union types (#2762))
=======
<<<<<<< HEAD
<<<<<<< HEAD
<<<<<<< HEAD
<<<<<<< HEAD
<<<<<<< HEAD
=======
>>>>>>> 73770612e0 (GEOMESA-3061 Converters - support bytes in Avro top-level union types (#2762))
>>>>>>> 53a3e72cbf (GEOMESA-3061 Converters - support bytes in Avro top-level union types (#2762))
=======
>>>>>>> d15af7157e (GEOMESA-3067 Find attribute in Filters with Functions with embedded expressions correctly)
=======
<<<<<<< HEAD
<<<<<<< HEAD
<<<<<<< HEAD
<<<<<<< HEAD
=======
>>>>>>> 8035cc5893 (GEOMESA-3061 Converters - support bytes in Avro top-level union types (#2762))
=======
>>>>>>> 04f08c23c5 (GEOMESA-3067 Find attribute in Filters with Functions with embedded expressions correctly)
=======
>>>>>>> 9abc630fdf (GEOMESA-3061 Converters - support bytes in Avro top-level union types (#2762))
=======
>>>>>>> fe3de10f11 (GEOMESA-3061 Converters - support bytes in Avro top-level union types (#2762))
=======
>>>>>>> 8035cc5893 (GEOMESA-3061 Converters - support bytes in Avro top-level union types (#2762))
=======
>>>>>>> 04f08c23c5 (GEOMESA-3067 Find attribute in Filters with Functions with embedded expressions correctly)
=======
>>>>>>> 9abc630fdf (GEOMESA-3061 Converters - support bytes in Avro top-level union types (#2762))
=======
>>>>>>> 0fa73844a1 (GEOMESA-3061 Converters - support bytes in Avro top-level union types (#2762))
=======
>>>>>>> 8035cc5893 (GEOMESA-3061 Converters - support bytes in Avro top-level union types (#2762))
=======
>>>>>>> 04f08c23c5 (GEOMESA-3067 Find attribute in Filters with Functions with embedded expressions correctly)
=======
>>>>>>> 9abc630fdf (GEOMESA-3061 Converters - support bytes in Avro top-level union types (#2762))
=======
>>>>>>> c8a325e13 (GEOMESA-3061 Converters - support bytes in Avro top-level union types (#2762))
>>>>>>> c9328eddce (GEOMESA-3061 Converters - support bytes in Avro top-level union types (#2762))
=======
<<<<<<< HEAD
<<<<<<< HEAD
<<<<<<< HEAD
<<<<<<< HEAD
>>>>>>> ad3cedc4d (GEOMESA-3061 Converters - support bytes in Avro top-level union types (#2762))
=======
>>>>>>> f302a54949 (GEOMESA-3061 Converters - support bytes in Avro top-level union types (#2762))
=======
<<<<<<< HEAD
<<<<<<< HEAD
<<<<<<< HEAD
=======
>>>>>>> 6cd1151639 (GEOMESA-3061 Converters - support bytes in Avro top-level union types (#2762))
=======
>>>>>>> ad3cedc4db (GEOMESA-3061 Converters - support bytes in Avro top-level union types (#2762))
=======
>>>>>>> 9a4dff9e4f (GEOMESA-3061 Converters - support bytes in Avro top-level union types (#2762))
<<<<<<< HEAD
<<<<<<< HEAD
=======
>>>>>>> 8c9ca1211a (GEOMESA-3061 Converters - support bytes in Avro top-level union types (#2762))
=======
>>>>>>> 1cad375176 (GEOMESA-3061 Converters - support bytes in Avro top-level union types (#2762))
<<<<<<< HEAD
=======
>>>>>>> 53a3e72cbf (GEOMESA-3061 Converters - support bytes in Avro top-level union types (#2762))
=======
>>>>>>> 963feec660 (GEOMESA-3061 Converters - support bytes in Avro top-level union types (#2762))
=======
>>>>>>> 2c14568a23 (GEOMESA-3067 Find attribute in Filters with Functions with embedded expressions correctly)
=======
>>>>>>> fe3de10f11 (GEOMESA-3061 Converters - support bytes in Avro top-level union types (#2762))
=======
>>>>>>> ad3cedc4d (GEOMESA-3061 Converters - support bytes in Avro top-level union types (#2762))
=======
>>>>>>> a35efac12e (GEOMESA-3061 Converters - support bytes in Avro top-level union types (#2762))
=======
>>>>>>> 86ec77f9cb (GEOMESA-3061 Converters - support bytes in Avro top-level union types (#2762))
=======
>>>>>>> 94fecee1d8 (GEOMESA-3061 Converters - support bytes in Avro top-level union types (#2762))
=======
>>>>>>> ad3cedc4db (GEOMESA-3061 Converters - support bytes in Avro top-level union types (#2762))
=======
>>>>>>> 35b69b8f2f (GEOMESA-3061 Converters - support bytes in Avro top-level union types (#2762))
=======
>>>>>>> 26a09ee6c2 (GEOMESA-3061 Converters - support bytes in Avro top-level union types (#2762))
=======
>>>>>>> 7b3c90c53f (GEOMESA-3061 Converters - support bytes in Avro top-level union types (#2762))
=======
>>>>>>> 53a3e72cbf (GEOMESA-3061 Converters - support bytes in Avro top-level union types (#2762))
=======
>>>>>>> 3e7fb62639 (GEOMESA-3061 Converters - support bytes in Avro top-level union types (#2762))
=======
>>>>>>> 00d66ae013 (GEOMESA-3067 Find attribute in Filters with Functions with embedded expressions correctly)
=======
>>>>>>> 0fa73844a1 (GEOMESA-3061 Converters - support bytes in Avro top-level union types (#2762))
=======
>>>>>>> ad3cedc4d (GEOMESA-3061 Converters - support bytes in Avro top-level union types (#2762))
=======
>>>>>>> 6e30236dd2 (GEOMESA-3061 Converters - support bytes in Avro top-level union types (#2762))
=======
>>>>>>> 2a887f75bf (GEOMESA-3061 Converters - support bytes in Avro top-level union types (#2762))
=======
=======
>>>>>>> 6cd1151639 (GEOMESA-3061 Converters - support bytes in Avro top-level union types (#2762))
>>>>>>> 00e61f4b70 (GEOMESA-3061 Converters - support bytes in Avro top-level union types (#2762))
=======
>>>>>>> 7b8c8dcc3d (GEOMESA-3061 Converters - support bytes in Avro top-level union types (#2762))
=======
=======
>>>>>>> 8c9ca1211a (GEOMESA-3061 Converters - support bytes in Avro top-level union types (#2762))
>>>>>>> 4f51687745 (GEOMESA-3061 Converters - support bytes in Avro top-level union types (#2762))
=======
>>>>>>> 73770612e0 (GEOMESA-3061 Converters - support bytes in Avro top-level union types (#2762))
>>>>>>> e3a63fee1 (GEOMESA-3067 Find attribute in Filters with Functions with embedded expressions correctly)
<<<<<<< HEAD
<<<<<<< HEAD
<<<<<<< HEAD
<<<<<<< HEAD
<<<<<<< HEAD
<<<<<<< HEAD
<<<<<<< HEAD
<<<<<<< HEAD
=======
>>>>>>> 92674ff9d4 (GEOMESA-3061 Converters - support bytes in Avro top-level union types (#2762))
=======
>>>>>>> f110463a26 (GEOMESA-3061 Converters - support bytes in Avro top-level union types (#2762))
=======
>>>>>>> 4ccd6f6b1f (GEOMESA-3061 Converters - support bytes in Avro top-level union types (#2762))
=======
>>>>>>> c22ecd64c3 (GEOMESA-3061 Converters - support bytes in Avro top-level union types (#2762))
=======
=======
>>>>>>> 92674ff9d4 (GEOMESA-3061 Converters - support bytes in Avro top-level union types (#2762))
>>>>>>> 009a284072 (GEOMESA-3061 Converters - support bytes in Avro top-level union types (#2762))
>>>>>>> 3333975e77 (GEOMESA-3067 Find attribute in Filters with Functions with embedded expressions correctly)
=======
=======
>>>>>>> 0e68e9f4c (GEOMESA-3061 Converters - support bytes in Avro top-level union types (#2762))
<<<<<<< HEAD
<<<<<<< HEAD
<<<<<<< HEAD
<<<<<<< HEAD
<<<<<<< HEAD
<<<<<<< HEAD
<<<<<<< HEAD
<<<<<<< HEAD
<<<<<<< HEAD
<<<<<<< HEAD
<<<<<<< HEAD
<<<<<<< HEAD
<<<<<<< HEAD
<<<<<<< HEAD
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
>>>>>>> 9a2d40c613 (GEOMESA-3061 Converters - support bytes in Avro top-level union types (#2762))
=======
>>>>>>> c169cb2905 (GEOMESA-3067 Find attribute in Filters with Functions with embedded expressions correctly)
=======
>>>>>>> a22efb4d66 (GEOMESA-3061 Converters - support bytes in Avro top-level union types (#2762))
<<<<<<< HEAD
=======
>>>>>>> 99acaa0887 (GEOMESA-3067 Find attribute in Filters with Functions with embedded expressions correctly)
=======
>>>>>>> 9d44ff473d (GEOMESA-3061 Converters - support bytes in Avro top-level union types (#2762))
=======
>>>>>>> bff2bdde04 (GEOMESA-3067 Find attribute in Filters with Functions with embedded expressions correctly)
=======
>>>>>>> d83561962d (GEOMESA-3067 Find attribute in Filters with Functions with embedded expressions correctly)
=======
>>>>>>> f983ea29f0 (GEOMESA-3067 Find attribute in Filters with Functions with embedded expressions correctly)
=======
>>>>>>> 194ad4e5c0 (GEOMESA-3061 Converters - support bytes in Avro top-level union types (#2762))
=======
>>>>>>> 5d8dab9f81 (GEOMESA-3067 Find attribute in Filters with Functions with embedded expressions correctly)
=======
>>>>>>> 9dbe1503e8 (GEOMESA-3061 Converters - support bytes in Avro top-level union types (#2762))
=======
>>>>>>> 53bc726472 (GEOMESA-3067 Find attribute in Filters with Functions with embedded expressions correctly)
=======
>>>>>>> 6e297b9b6f (GEOMESA-3067 Find attribute in Filters with Functions with embedded expressions correctly)
=======
>>>>>>> 9bcad1eb67 (GEOMESA-3067 Find attribute in Filters with Functions with embedded expressions correctly)
=======
=======
>>>>>>> c169cb2905 (GEOMESA-3067 Find attribute in Filters with Functions with embedded expressions correctly)
>>>>>>> 9df4f8a9f6 (GEOMESA-3067 Find attribute in Filters with Functions with embedded expressions correctly)
=======
>>>>>>> 9a2d40c613 (GEOMESA-3061 Converters - support bytes in Avro top-level union types (#2762))
>>>>>>> 76618c8da3 (GEOMESA-3061 Converters - support bytes in Avro top-level union types (#2762))
=======
=======
>>>>>>> 8fb0607344 (GEOMESA-3067 Find attribute in Filters with Functions with embedded expressions correctly)
=======
<<<<<<< HEAD
<<<<<<< HEAD
<<<<<<< HEAD
<<<<<<< HEAD
<<<<<<< HEAD
<<<<<<< HEAD
=======
>>>>>>> 9df4f8a9f6 (GEOMESA-3067 Find attribute in Filters with Functions with embedded expressions correctly)
=======
>>>>>>> 9a2d40c613 (GEOMESA-3061 Converters - support bytes in Avro top-level union types (#2762))
>>>>>>> b009fd23f4 (GEOMESA-3061 Converters - support bytes in Avro top-level union types (#2762))
=======
=======
<<<<<<< HEAD
<<<<<<< HEAD
<<<<<<< HEAD
<<<<<<< HEAD
>>>>>>> 9c28193a91 (GEOMESA-3061 Converters - support bytes in Avro top-level union types (#2762))
=======
>>>>>>> 1b60c2aeba (GEOMESA-3067 Find attribute in Filters with Functions with embedded expressions correctly)
=======
=======
>>>>>>> 9c28193a91 (GEOMESA-3061 Converters - support bytes in Avro top-level union types (#2762))
=======
<<<<<<< HEAD
<<<<<<< HEAD
>>>>>>> 9d44ff473d (GEOMESA-3061 Converters - support bytes in Avro top-level union types (#2762))
=======
>>>>>>> 1b60c2aeba (GEOMESA-3067 Find attribute in Filters with Functions with embedded expressions correctly)
=======
>>>>>>> bff2bdde04 (GEOMESA-3067 Find attribute in Filters with Functions with embedded expressions correctly)
=======
>>>>>>> 1b60c2aeba (GEOMESA-3067 Find attribute in Filters with Functions with embedded expressions correctly)
=======
>>>>>>> 53bc726472 (GEOMESA-3067 Find attribute in Filters with Functions with embedded expressions correctly)
>>>>>>> c3b0a1b6e (GEOMESA-3067 Find attribute in Filters with Functions with embedded expressions correctly)
>>>>>>> cf57a2c189 (GEOMESA-3067 Find attribute in Filters with Functions with embedded expressions correctly)
=======
>>>>>>> 8fb060734 (GEOMESA-3067 Find attribute in Filters with Functions with embedded expressions correctly)
=======
<<<<<<< HEAD
<<<<<<< HEAD
<<<<<<< HEAD
<<<<<<< HEAD
>>>>>>> 125ffd0575 (GEOMESA-3067 Find attribute in Filters with Functions with embedded expressions correctly)
=======
=======
>>>>>>> c169cb2905 (GEOMESA-3067 Find attribute in Filters with Functions with embedded expressions correctly)
=======
<<<<<<< HEAD
<<<<<<< HEAD
=======
>>>>>>> 9a2d40c613 (GEOMESA-3061 Converters - support bytes in Avro top-level union types (#2762))
>>>>>>> b009fd23f4 (GEOMESA-3061 Converters - support bytes in Avro top-level union types (#2762))
=======
>>>>>>> a22efb4d66 (GEOMESA-3061 Converters - support bytes in Avro top-level union types (#2762))
=======
<<<<<<< HEAD
=======
>>>>>>> 9c28193a91 (GEOMESA-3061 Converters - support bytes in Avro top-level union types (#2762))
=======
>>>>>>> 9dbe1503e8 (GEOMESA-3061 Converters - support bytes in Avro top-level union types (#2762))
>>>>>>> c3b0a1b6e (GEOMESA-3067 Find attribute in Filters with Functions with embedded expressions correctly)
>>>>>>> cf57a2c189 (GEOMESA-3067 Find attribute in Filters with Functions with embedded expressions correctly)
=======
>>>>>>> 99acaa0887 (GEOMESA-3067 Find attribute in Filters with Functions with embedded expressions correctly)
=======
>>>>>>> bff2bdde04 (GEOMESA-3067 Find attribute in Filters with Functions with embedded expressions correctly)
=======
>>>>>>> 125ffd0575 (GEOMESA-3067 Find attribute in Filters with Functions with embedded expressions correctly)
=======
>>>>>>> d83561962d (GEOMESA-3067 Find attribute in Filters with Functions with embedded expressions correctly)
=======
>>>>>>> f983ea29f0 (GEOMESA-3067 Find attribute in Filters with Functions with embedded expressions correctly)
=======
>>>>>>> b009fd23f4 (GEOMESA-3061 Converters - support bytes in Avro top-level union types (#2762))
=======
>>>>>>> 194ad4e5c0 (GEOMESA-3061 Converters - support bytes in Avro top-level union types (#2762))
=======
>>>>>>> c3b0a1b6e (GEOMESA-3067 Find attribute in Filters with Functions with embedded expressions correctly)
>>>>>>> cf57a2c189 (GEOMESA-3067 Find attribute in Filters with Functions with embedded expressions correctly)
=======
>>>>>>> 5d8dab9f81 (GEOMESA-3067 Find attribute in Filters with Functions with embedded expressions correctly)
=======
>>>>>>> 53bc726472 (GEOMESA-3067 Find attribute in Filters with Functions with embedded expressions correctly)
=======
>>>>>>> 125ffd0575 (GEOMESA-3067 Find attribute in Filters with Functions with embedded expressions correctly)
=======
>>>>>>> 6e297b9b6f (GEOMESA-3067 Find attribute in Filters with Functions with embedded expressions correctly)
=======
=======
>>>>>>> 9df4f8a9f6 (GEOMESA-3067 Find attribute in Filters with Functions with embedded expressions correctly)
=======
>>>>>>> 9a2d40c613 (GEOMESA-3061 Converters - support bytes in Avro top-level union types (#2762))
>>>>>>> f36b0e8b9 (GEOMESA-3067 Find attribute in Filters with Functions with embedded expressions correctly)
>>>>>>> a63cb7e74 (GEOMESA-3067 Find attribute in Filters with Functions with embedded expressions correctly)
<<<<<<< HEAD
<<<<<<< HEAD
<<<<<<< HEAD
<<<<<<< HEAD
<<<<<<< HEAD
<<<<<<< HEAD
<<<<<<< HEAD
<<<<<<< HEAD
<<<<<<< HEAD
<<<<<<< HEAD
<<<<<<< HEAD
<<<<<<< HEAD
<<<<<<< HEAD
<<<<<<< HEAD
<<<<<<< HEAD
<<<<<<< HEAD
<<<<<<< HEAD
<<<<<<< HEAD
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
>>>>>>> 7b8c8dcc3d (GEOMESA-3061 Converters - support bytes in Avro top-level union types (#2762))
=======
>>>>>>> c169cb2905 (GEOMESA-3067 Find attribute in Filters with Functions with embedded expressions correctly)
=======
>>>>>>> 9a4dff9e4f (GEOMESA-3061 Converters - support bytes in Avro top-level union types (#2762))
<<<<<<< HEAD
=======
>>>>>>> 99acaa0887 (GEOMESA-3067 Find attribute in Filters with Functions with embedded expressions correctly)
=======
>>>>>>> fe3de10f11 (GEOMESA-3061 Converters - support bytes in Avro top-level union types (#2762))
=======
>>>>>>> bff2bdde04 (GEOMESA-3067 Find attribute in Filters with Functions with embedded expressions correctly)
=======
>>>>>>> a35efac12e (GEOMESA-3061 Converters - support bytes in Avro top-level union types (#2762))
=======
>>>>>>> d83561962d (GEOMESA-3067 Find attribute in Filters with Functions with embedded expressions correctly)
=======
>>>>>>> 86ec77f9cb (GEOMESA-3061 Converters - support bytes in Avro top-level union types (#2762))
=======
>>>>>>> f983ea29f0 (GEOMESA-3067 Find attribute in Filters with Functions with embedded expressions correctly)
=======
>>>>>>> 35b69b8f2f (GEOMESA-3061 Converters - support bytes in Avro top-level union types (#2762))
=======
>>>>>>> 5d8dab9f81 (GEOMESA-3067 Find attribute in Filters with Functions with embedded expressions correctly)
=======
>>>>>>> 0fa73844a1 (GEOMESA-3061 Converters - support bytes in Avro top-level union types (#2762))
=======
>>>>>>> 53bc726472 (GEOMESA-3067 Find attribute in Filters with Functions with embedded expressions correctly)
=======
>>>>>>> 6e30236dd2 (GEOMESA-3061 Converters - support bytes in Avro top-level union types (#2762))
=======
>>>>>>> 6e297b9b6f (GEOMESA-3067 Find attribute in Filters with Functions with embedded expressions correctly)
=======
>>>>>>> 2a887f75bf (GEOMESA-3061 Converters - support bytes in Avro top-level union types (#2762))
=======
=======
>>>>>>> c169cb2905 (GEOMESA-3067 Find attribute in Filters with Functions with embedded expressions correctly)
>>>>>>> 9df4f8a9f6 (GEOMESA-3067 Find attribute in Filters with Functions with embedded expressions correctly)
=======
>>>>>>> 7b8c8dcc3d (GEOMESA-3061 Converters - support bytes in Avro top-level union types (#2762))
>>>>>>> c3b0a1b6e3 (GEOMESA-3067 Find attribute in Filters with Functions with embedded expressions correctly)
=======
=======
>>>>>>> cf57a2c189 (GEOMESA-3067 Find attribute in Filters with Functions with embedded expressions correctly)
=======
<<<<<<< HEAD
<<<<<<< HEAD
<<<<<<< HEAD
<<<<<<< HEAD
>>>>>>> e15d50d7d3 (GEOMESA-3061 Converters - support bytes in Avro top-level union types (#2762))
=======
>>>>>>> 1b60c2aeba (GEOMESA-3067 Find attribute in Filters with Functions with embedded expressions correctly)
=======
<<<<<<< HEAD
<<<<<<< HEAD
<<<<<<< HEAD
<<<<<<< HEAD
>>>>>>> d294ce49e2 (GEOMESA-3061 Converters - support bytes in Avro top-level union types (#2762))
=======
=======
>>>>>>> 99acaa0887 (GEOMESA-3067 Find attribute in Filters with Functions with embedded expressions correctly)
=======
>>>>>>> e15d50d7d3 (GEOMESA-3061 Converters - support bytes in Avro top-level union types (#2762))
=======
>>>>>>> fe3de10f11 (GEOMESA-3061 Converters - support bytes in Avro top-level union types (#2762))
=======
>>>>>>> bff2bdde04 (GEOMESA-3067 Find attribute in Filters with Functions with embedded expressions correctly)
=======
>>>>>>> d294ce49e2 (GEOMESA-3061 Converters - support bytes in Avro top-level union types (#2762))
=======
>>>>>>> a35efac12e (GEOMESA-3061 Converters - support bytes in Avro top-level union types (#2762))
=======
>>>>>>> 5d8dab9f81 (GEOMESA-3067 Find attribute in Filters with Functions with embedded expressions correctly)
=======
>>>>>>> e15d50d7d3 (GEOMESA-3061 Converters - support bytes in Avro top-level union types (#2762))
=======
>>>>>>> 0fa73844a1 (GEOMESA-3061 Converters - support bytes in Avro top-level union types (#2762))
=======
>>>>>>> 53bc726472 (GEOMESA-3067 Find attribute in Filters with Functions with embedded expressions correctly)
=======
>>>>>>> d294ce49e2 (GEOMESA-3061 Converters - support bytes in Avro top-level union types (#2762))
=======
>>>>>>> 6e30236dd2 (GEOMESA-3061 Converters - support bytes in Avro top-level union types (#2762))
>>>>>>> 67b361c85 (GEOMESA-3061 Converters - support bytes in Avro top-level union types (#2762))
<<<<<<< HEAD
<<<<<<< HEAD
<<<<<<< HEAD
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
>>>>>>> 73770612e0 (GEOMESA-3061 Converters - support bytes in Avro top-level union types (#2762))
=======
>>>>>>> 63ca73533e (GEOMESA-3067 Find attribute in Filters with Functions with embedded expressions correctly)
=======
>>>>>>> 1cad375176 (GEOMESA-3061 Converters - support bytes in Avro top-level union types (#2762))
<<<<<<< HEAD
=======
>>>>>>> 17883cb601 (GEOMESA-3067 Find attribute in Filters with Functions with embedded expressions correctly)
=======
>>>>>>> da4e2905b4 (GEOMESA-3067 Find attribute in Filters with Functions with embedded expressions correctly)
=======
>>>>>>> 7b3c90c53f (GEOMESA-3061 Converters - support bytes in Avro top-level union types (#2762))
=======
>>>>>>> 08a743b61d (GEOMESA-3067 Find attribute in Filters with Functions with embedded expressions correctly)
=======
=======
>>>>>>> 63ca73533e (GEOMESA-3067 Find attribute in Filters with Functions with embedded expressions correctly)
>>>>>>> 79cd5cb606 (GEOMESA-3067 Find attribute in Filters with Functions with embedded expressions correctly)
=======
>>>>>>> 73770612e0 (GEOMESA-3061 Converters - support bytes in Avro top-level union types (#2762))
>>>>>>> c8a325e13c (GEOMESA-3061 Converters - support bytes in Avro top-level union types (#2762))
=======
=======
>>>>>>> 238945d4b3 (GEOMESA-3061 Converters - support bytes in Avro top-level union types (#2762))
=======
>>>>>>> 908ad4071 (GEOMESA-3067 Find attribute in Filters with Functions with embedded expressions correctly)
<<<<<<< HEAD
<<<<<<< HEAD
<<<<<<< HEAD
<<<<<<< HEAD
<<<<<<< HEAD
<<<<<<< HEAD
<<<<<<< HEAD
<<<<<<< HEAD
<<<<<<< HEAD
<<<<<<< HEAD
<<<<<<< HEAD
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
>>>>>>> 0fc6650ecf (GEOMESA-3061 Converters - support bytes in Avro top-level union types (#2762))
=======
>>>>>>> 21deff19fd (GEOMESA-3067 Find attribute in Filters with Functions with embedded expressions correctly)
=======
>>>>>>> d0785cf307 (GEOMESA-3061 Converters - support bytes in Avro top-level union types (#2762))
=======
>>>>>>> 323528580f (GEOMESA-3067 Find attribute in Filters with Functions with embedded expressions correctly)
=======
>>>>>>> fd5565dfba (GEOMESA-3061 Converters - support bytes in Avro top-level union types (#2762))
=======
>>>>>>> 1bcc513539 (GEOMESA-3061 Converters - support bytes in Avro top-level union types (#2762))
=======
>>>>>>> db8a3a22b2 (GEOMESA-3061 Converters - support bytes in Avro top-level union types (#2762))
=======
>>>>>>> 1ef95979ee (GEOMESA-3067 Find attribute in Filters with Functions with embedded expressions correctly)
=======
>>>>>>> 63546aacdc (GEOMESA-3061 Converters - support bytes in Avro top-level union types (#2762))
=======
>>>>>>> 3261561062 (GEOMESA-3067 Find attribute in Filters with Functions with embedded expressions correctly)
=======
>>>>>>> dbd932fed6 (GEOMESA-3061 Converters - support bytes in Avro top-level union types (#2762))
=======
>>>>>>> b08cb4d818 (GEOMESA-3061 Converters - support bytes in Avro top-level union types (#2762))
=======
=======
>>>>>>> 0fc6650ecf (GEOMESA-3061 Converters - support bytes in Avro top-level union types (#2762))
>>>>>>> c029a43a6c (GEOMESA-3061 Converters - support bytes in Avro top-level union types (#2762))
>>>>>>> 9638dc731e (GEOMESA-3067 Find attribute in Filters with Functions with embedded expressions correctly)
=======
=======
>>>>>>> bec3ba7d08 (GEOMESA-3067 Find attribute in Filters with Functions with embedded expressions correctly)
=======
<<<<<<< HEAD
<<<<<<< HEAD
<<<<<<< HEAD
<<<<<<< HEAD
>>>>>>> 8de43cccf6 (GEOMESA-3061 Converters - support bytes in Avro top-level union types (#2762))
=======
>>>>>>> ed45e8551f (GEOMESA-3067 Find attribute in Filters with Functions with embedded expressions correctly)
=======
<<<<<<< HEAD
<<<<<<< HEAD
<<<<<<< HEAD
<<<<<<< HEAD
>>>>>>> 1df8328338 (GEOMESA-3061 Converters - support bytes in Avro top-level union types (#2762))
=======
=======
>>>>>>> 21deff19fd (GEOMESA-3067 Find attribute in Filters with Functions with embedded expressions correctly)
=======
>>>>>>> 8de43cccf6 (GEOMESA-3061 Converters - support bytes in Avro top-level union types (#2762))
=======
>>>>>>> d0785cf307 (GEOMESA-3061 Converters - support bytes in Avro top-level union types (#2762))
=======
>>>>>>> 323528580f (GEOMESA-3067 Find attribute in Filters with Functions with embedded expressions correctly)
=======
>>>>>>> 1df8328338 (GEOMESA-3061 Converters - support bytes in Avro top-level union types (#2762))
=======
>>>>>>> fd5565dfba (GEOMESA-3061 Converters - support bytes in Avro top-level union types (#2762))
=======
>>>>>>> 1ef95979ee (GEOMESA-3067 Find attribute in Filters with Functions with embedded expressions correctly)
=======
>>>>>>> 8de43cccf6 (GEOMESA-3061 Converters - support bytes in Avro top-level union types (#2762))
=======
>>>>>>> 63546aacdc (GEOMESA-3061 Converters - support bytes in Avro top-level union types (#2762))
=======
>>>>>>> 3261561062 (GEOMESA-3067 Find attribute in Filters with Functions with embedded expressions correctly)
=======
>>>>>>> 1df8328338 (GEOMESA-3061 Converters - support bytes in Avro top-level union types (#2762))
=======
>>>>>>> dbd932fed6 (GEOMESA-3061 Converters - support bytes in Avro top-level union types (#2762))
>>>>>>> b4320946b (GEOMESA-3061 Converters - support bytes in Avro top-level union types (#2762))
<<<<<<< HEAD
<<<<<<< HEAD
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
>>>>>>> 6c83981af3 (GEOMESA-3061 Converters - support bytes in Avro top-level union types (#2762))
=======
>>>>>>> 1bb69524c2 (GEOMESA-3061 Converters - support bytes in Avro top-level union types (#2762))
=======
>>>>>>> 1e39c0c27d (GEOMESA-3061 Converters - support bytes in Avro top-level union types (#2762))
<<<<<<< HEAD
=======
>>>>>>> a990cf104e (GEOMESA-3067 Find attribute in Filters with Functions with embedded expressions correctly)
=======
>>>>>>> 27afb28ab6 (GEOMESA-3061 Converters - support bytes in Avro top-level union types (#2762))
=======
>>>>>>> db9dfb6f14 (GEOMESA-3061 Converters - support bytes in Avro top-level union types (#2762))
=======
>>>>>>> f33d55e2ba (GEOMESA-3067 Find attribute in Filters with Functions with embedded expressions correctly)
=======
=======
>>>>>>> 1bb69524c2 (GEOMESA-3061 Converters - support bytes in Avro top-level union types (#2762))
>>>>>>> a5b0374ee2 (GEOMESA-3061 Converters - support bytes in Avro top-level union types (#2762))
=======
>>>>>>> 6c83981af3 (GEOMESA-3061 Converters - support bytes in Avro top-level union types (#2762))
>>>>>>> 97ec7d864a (GEOMESA-3061 Converters - support bytes in Avro top-level union types (#2762))
=======
>>>>>>> 6d9a5b626c (GEOMESA-3061 Converters - support bytes in Avro top-level union types (#2762))
=======
=======
>>>>>>> f36b0e8b9 (GEOMESA-3067 Find attribute in Filters with Functions with embedded expressions correctly)
>>>>>>> e5ed68fdd3 (GEOMESA-3067 Find attribute in Filters with Functions with embedded expressions correctly)
=======
=======
>>>>>>> f36b0e8b9 (GEOMESA-3067 Find attribute in Filters with Functions with embedded expressions correctly)
=======
>>>>>>> cdb410251 (GEOMESA-3061 Converters - support bytes in Avro top-level union types (#2762))
>>>>>>> e6e1f4bdd5 (GEOMESA-3061 Converters - support bytes in Avro top-level union types (#2762))
<<<<<<< HEAD
<<<<<<< HEAD
=======
>>>>>>> 8b16ac5c65 (GEOMESA-3067 Find attribute in Filters with Functions with embedded expressions correctly)
=======
=======
>>>>>>> e3a63fee1 (GEOMESA-3067 Find attribute in Filters with Functions with embedded expressions correctly)
>>>>>>> 7f922b040c (GEOMESA-3067 Find attribute in Filters with Functions with embedded expressions correctly)
<<<<<<< HEAD
<<<<<<< HEAD
<<<<<<< HEAD
<<<<<<< HEAD
<<<<<<< HEAD
<<<<<<< HEAD
=======
>>>>>>> 92674ff9d4 (GEOMESA-3061 Converters - support bytes in Avro top-level union types (#2762))
=======
>>>>>>> 4ccd6f6b1f (GEOMESA-3061 Converters - support bytes in Avro top-level union types (#2762))
=======
>>>>>>> 6f81d40992 (GEOMESA-3067 Find attribute in Filters with Functions with embedded expressions correctly)
=======
=======
>>>>>>> 92674ff9d4 (GEOMESA-3061 Converters - support bytes in Avro top-level union types (#2762))
>>>>>>> 009a284072 (GEOMESA-3061 Converters - support bytes in Avro top-level union types (#2762))
=======
=======
>>>>>>> 0e68e9f4c (GEOMESA-3061 Converters - support bytes in Avro top-level union types (#2762))
>>>>>>> a910ae135f (GEOMESA-3061 Converters - support bytes in Avro top-level union types (#2762))
<<<<<<< HEAD
<<<<<<< HEAD
<<<<<<< HEAD
<<<<<<< HEAD
<<<<<<< HEAD
<<<<<<< HEAD
=======
>>>>>>> 009a284072 (GEOMESA-3061 Converters - support bytes in Avro top-level union types (#2762))
=======
>>>>>>> 9df4f8a9f6 (GEOMESA-3067 Find attribute in Filters with Functions with embedded expressions correctly)
=======
>>>>>>> 8fb0607344 (GEOMESA-3067 Find attribute in Filters with Functions with embedded expressions correctly)
=======
=======
>>>>>>> 67b361c85 (GEOMESA-3061 Converters - support bytes in Avro top-level union types (#2762))
>>>>>>> ad3cedc4db (GEOMESA-3061 Converters - support bytes in Avro top-level union types (#2762))
<<<<<<< HEAD
<<<<<<< HEAD
<<<<<<< HEAD
<<<<<<< HEAD
<<<<<<< HEAD
<<<<<<< HEAD
=======
>>>>>>> 63ca73533e (GEOMESA-3067 Find attribute in Filters with Functions with embedded expressions correctly)
=======
>>>>>>> da4e2905b4 (GEOMESA-3067 Find attribute in Filters with Functions with embedded expressions correctly)
=======
>>>>>>> 7b8c8dcc3d (GEOMESA-3061 Converters - support bytes in Avro top-level union types (#2762))
=======
=======
>>>>>>> 63ca73533e (GEOMESA-3067 Find attribute in Filters with Functions with embedded expressions correctly)
>>>>>>> 79cd5cb606 (GEOMESA-3067 Find attribute in Filters with Functions with embedded expressions correctly)
=======
=======
>>>>>>> 908ad4071 (GEOMESA-3067 Find attribute in Filters with Functions with embedded expressions correctly)
>>>>>>> bc49131942 (GEOMESA-3067 Find attribute in Filters with Functions with embedded expressions correctly)
<<<<<<< HEAD
<<<<<<< HEAD
<<<<<<< HEAD
<<<<<<< HEAD
<<<<<<< HEAD
<<<<<<< HEAD
=======
>>>>>>> 0fc6650ecf (GEOMESA-3061 Converters - support bytes in Avro top-level union types (#2762))
=======
>>>>>>> db8a3a22b2 (GEOMESA-3061 Converters - support bytes in Avro top-level union types (#2762))
=======
>>>>>>> 79cd5cb606 (GEOMESA-3067 Find attribute in Filters with Functions with embedded expressions correctly)
=======
=======
>>>>>>> 0fc6650ecf (GEOMESA-3061 Converters - support bytes in Avro top-level union types (#2762))
>>>>>>> c029a43a6c (GEOMESA-3061 Converters - support bytes in Avro top-level union types (#2762))
=======
=======
>>>>>>> b4320946b (GEOMESA-3061 Converters - support bytes in Avro top-level union types (#2762))
>>>>>>> bdbced26d4 (GEOMESA-3061 Converters - support bytes in Avro top-level union types (#2762))
<<<<<<< HEAD
<<<<<<< HEAD
<<<<<<< HEAD
<<<<<<< HEAD
<<<<<<< HEAD
<<<<<<< HEAD
=======
>>>>>>> c029a43a6c (GEOMESA-3061 Converters - support bytes in Avro top-level union types (#2762))
=======
>>>>>>> a5b0374ee2 (GEOMESA-3061 Converters - support bytes in Avro top-level union types (#2762))
=======
=======
>>>>>>> bc4062951d (GEOMESA-3061 Converters - support bytes in Avro top-level union types (#2762))
=======
<<<<<<< HEAD
<<<<<<< HEAD
<<<<<<< HEAD
<<<<<<< HEAD
<<<<<<< HEAD
=======
>>>>>>> 6c83981af3 (GEOMESA-3061 Converters - support bytes in Avro top-level union types (#2762))
>>>>>>> deb8fd68de (GEOMESA-3067 Find attribute in Filters with Functions with embedded expressions correctly)
=======
=======
>>>>>>> 1e39c0c27d (GEOMESA-3061 Converters - support bytes in Avro top-level union types (#2762))
<<<<<<< HEAD
=======
>>>>>>> deb8fd68de (GEOMESA-3067 Find attribute in Filters with Functions with embedded expressions correctly)
=======
>>>>>>> a990cf104e (GEOMESA-3067 Find attribute in Filters with Functions with embedded expressions correctly)
=======
>>>>>>> db9dfb6f14 (GEOMESA-3061 Converters - support bytes in Avro top-level union types (#2762))
=======
>>>>>>> deb8fd68de (GEOMESA-3067 Find attribute in Filters with Functions with embedded expressions correctly)
=======
>>>>>>> f33d55e2ba (GEOMESA-3067 Find attribute in Filters with Functions with embedded expressions correctly)
=======
>>>>>>> 6c83981af3 (GEOMESA-3061 Converters - support bytes in Avro top-level union types (#2762))
>>>>>>> 87bf55340 (GEOMESA-3061 Converters - support bytes in Avro top-level union types (#2762))
<<<<<<< HEAD
>>>>>>> 0dbede148d (GEOMESA-3061 Converters - support bytes in Avro top-level union types (#2762))
=======
=======
>>>>>>> 240977229 (GEOMESA-3061 Converters - support bytes in Avro top-level union types (#2762))
<<<<<<< HEAD
>>>>>>> 22dcc8170f (GEOMESA-3061 Converters - support bytes in Avro top-level union types (#2762))
=======
=======
>>>>>>> 45ad5d11f (GEOMESA-3061 Converters - support bytes in Avro top-level union types (#2762))
<<<<<<< HEAD
<<<<<<< HEAD
<<<<<<< HEAD
<<<<<<< HEAD
<<<<<<< HEAD
<<<<<<< HEAD
<<<<<<< HEAD
=======
>>>>>>> 1cad375176 (GEOMESA-3061 Converters - support bytes in Avro top-level union types (#2762))
=======
>>>>>>> 7b3c90c53f (GEOMESA-3061 Converters - support bytes in Avro top-level union types (#2762))
=======
>>>>>>> 9a2d40c613 (GEOMESA-3061 Converters - support bytes in Avro top-level union types (#2762))
=======
=======
>>>>>>> 1cad375176 (GEOMESA-3061 Converters - support bytes in Avro top-level union types (#2762))
>>>>>>> 73770612e0 (GEOMESA-3061 Converters - support bytes in Avro top-level union types (#2762))
>>>>>>> b009fd23f4 (GEOMESA-3061 Converters - support bytes in Avro top-level union types (#2762))
=======
=======
>>>>>>> dace2085b (GEOMESA-3061 Converters - support bytes in Avro top-level union types (#2762))
<<<<<<< HEAD
<<<<<<< HEAD
<<<<<<< HEAD
<<<<<<< HEAD
<<<<<<< HEAD
<<<<<<< HEAD
<<<<<<< HEAD
=======
>>>>>>> 1e39c0c27d (GEOMESA-3061 Converters - support bytes in Avro top-level union types (#2762))
=======
>>>>>>> db9dfb6f14 (GEOMESA-3061 Converters - support bytes in Avro top-level union types (#2762))
=======
>>>>>>> 73770612e0 (GEOMESA-3061 Converters - support bytes in Avro top-level union types (#2762))
=======
=======
>>>>>>> 1e39c0c27d (GEOMESA-3061 Converters - support bytes in Avro top-level union types (#2762))
>>>>>>> 6c83981af3 (GEOMESA-3061 Converters - support bytes in Avro top-level union types (#2762))
>>>>>>> 238945d4b3 (GEOMESA-3061 Converters - support bytes in Avro top-level union types (#2762))
=======
=======
>>>>>>> 516fe7e9c (GEOMESA-3061 Converters - support bytes in Avro top-level union types (#2762))
<<<<<<< HEAD
<<<<<<< HEAD
<<<<<<< HEAD
<<<<<<< HEAD
<<<<<<< HEAD
<<<<<<< HEAD
=======
>>>>>>> a990cf104e (GEOMESA-3067 Find attribute in Filters with Functions with embedded expressions correctly)
=======
>>>>>>> f33d55e2ba (GEOMESA-3067 Find attribute in Filters with Functions with embedded expressions correctly)
=======
>>>>>>> 6c83981af3 (GEOMESA-3061 Converters - support bytes in Avro top-level union types (#2762))
>>>>>>> bc4062951d (GEOMESA-3061 Converters - support bytes in Avro top-level union types (#2762))
=======
=======
=======
>>>>>>> 907fb0b08 (GEOMESA-3067 Find attribute in Filters with Functions with embedded expressions correctly)
<<<<<<< HEAD
<<<<<<< HEAD
<<<<<<< HEAD
<<<<<<< HEAD
<<<<<<< HEAD
>>>>>>> 8a3e82747d (GEOMESA-3067 Find attribute in Filters with Functions with embedded expressions correctly)
<<<<<<< HEAD
>>>>>>> deb8fd68de (GEOMESA-3067 Find attribute in Filters with Functions with embedded expressions correctly)
=======
=======
=======
>>>>>>> d9ed077cd (GEOMESA-3061 Converters - support bytes in Avro top-level union types (#2762))
<<<<<<< HEAD
<<<<<<< HEAD
<<<<<<< HEAD
>>>>>>> 81ee66102b (GEOMESA-3061 Converters - support bytes in Avro top-level union types (#2762))
<<<<<<< HEAD
>>>>>>> 8adfab65bb (GEOMESA-3061 Converters - support bytes in Avro top-level union types (#2762))
=======
=======
=======
=======
>>>>>>> f36b0e8b9 (GEOMESA-3067 Find attribute in Filters with Functions with embedded expressions correctly)
>>>>>>> e182e6e99 (GEOMESA-3067 Find attribute in Filters with Functions with embedded expressions correctly)
<<<<<<< HEAD
<<<<<<< HEAD
<<<<<<< HEAD
>>>>>>> 9943e05ec9 (GEOMESA-3067 Find attribute in Filters with Functions with embedded expressions correctly)
<<<<<<< HEAD
>>>>>>> 3254b186da (GEOMESA-3067 Find attribute in Filters with Functions with embedded expressions correctly)
=======
=======
=======
>>>>>>> 9d708b240 (GEOMESA-3061 Converters - support bytes in Avro top-level union types (#2762))
<<<<<<< HEAD
<<<<<<< HEAD
<<<<<<< HEAD
>>>>>>> 53a3e72cbf (GEOMESA-3061 Converters - support bytes in Avro top-level union types (#2762))
<<<<<<< HEAD
>>>>>>> 7b0539b808 (GEOMESA-3061 Converters - support bytes in Avro top-level union types (#2762))
=======
=======
=======
=======
>>>>>>> e3a63fee1 (GEOMESA-3067 Find attribute in Filters with Functions with embedded expressions correctly)
>>>>>>> 3333975e7 (GEOMESA-3067 Find attribute in Filters with Functions with embedded expressions correctly)
<<<<<<< HEAD
<<<<<<< HEAD
<<<<<<< HEAD
>>>>>>> d15af7157e (GEOMESA-3067 Find attribute in Filters with Functions with embedded expressions correctly)
<<<<<<< HEAD
>>>>>>> 982031ef44 (GEOMESA-3067 Find attribute in Filters with Functions with embedded expressions correctly)
=======
=======
=======
>>>>>>> 76618c8da (GEOMESA-3061 Converters - support bytes in Avro top-level union types (#2762))
<<<<<<< HEAD
<<<<<<< HEAD
<<<<<<< HEAD
>>>>>>> 947761ec9b (GEOMESA-3061 Converters - support bytes in Avro top-level union types (#2762))
<<<<<<< HEAD
>>>>>>> 0086b292ba (GEOMESA-3061 Converters - support bytes in Avro top-level union types (#2762))
=======
=======
=======
>>>>>>> c3b0a1b6e (GEOMESA-3067 Find attribute in Filters with Functions with embedded expressions correctly)
<<<<<<< HEAD
<<<<<<< HEAD
<<<<<<< HEAD
>>>>>>> 9813375fcc (GEOMESA-3067 Find attribute in Filters with Functions with embedded expressions correctly)
<<<<<<< HEAD
>>>>>>> cf57a2c189 (GEOMESA-3067 Find attribute in Filters with Functions with embedded expressions correctly)
=======
=======
=======
=======
>>>>>>> 67b361c85 (GEOMESA-3061 Converters - support bytes in Avro top-level union types (#2762))
>>>>>>> c8a325e13 (GEOMESA-3061 Converters - support bytes in Avro top-level union types (#2762))
<<<<<<< HEAD
<<<<<<< HEAD
<<<<<<< HEAD
>>>>>>> c9328eddce (GEOMESA-3061 Converters - support bytes in Avro top-level union types (#2762))
<<<<<<< HEAD
>>>>>>> e15d50d7d3 (GEOMESA-3061 Converters - support bytes in Avro top-level union types (#2762))
=======
=======
=======
>>>>>>> 9638dc731 (GEOMESA-3067 Find attribute in Filters with Functions with embedded expressions correctly)
<<<<<<< HEAD
<<<<<<< HEAD
<<<<<<< HEAD
>>>>>>> d2eec4be68 (GEOMESA-3067 Find attribute in Filters with Functions with embedded expressions correctly)
<<<<<<< HEAD
>>>>>>> bec3ba7d08 (GEOMESA-3067 Find attribute in Filters with Functions with embedded expressions correctly)
=======
=======
=======
=======
>>>>>>> b4320946b (GEOMESA-3061 Converters - support bytes in Avro top-level union types (#2762))
>>>>>>> 97ec7d864 (GEOMESA-3061 Converters - support bytes in Avro top-level union types (#2762))
<<<<<<< HEAD
<<<<<<< HEAD
<<<<<<< HEAD
>>>>>>> d94c03a98e (GEOMESA-3061 Converters - support bytes in Avro top-level union types (#2762))
<<<<<<< HEAD
>>>>>>> 8de43cccf6 (GEOMESA-3061 Converters - support bytes in Avro top-level union types (#2762))
=======
=======
=======
>>>>>>> 7bb5f26c3 (GEOMESA-3067 Find attribute in Filters with Functions with embedded expressions correctly)
<<<<<<< HEAD
<<<<<<< HEAD
<<<<<<< HEAD
>>>>>>> e69b2aa6dc (GEOMESA-3067 Find attribute in Filters with Functions with embedded expressions correctly)
<<<<<<< HEAD
>>>>>>> b1a7408547 (GEOMESA-3067 Find attribute in Filters with Functions with embedded expressions correctly)
=======
=======
=======
>>>>>>> 6d9a5b626 (GEOMESA-3061 Converters - support bytes in Avro top-level union types (#2762))
<<<<<<< HEAD
<<<<<<< HEAD
<<<<<<< HEAD
>>>>>>> 67e4c1354f (GEOMESA-3061 Converters - support bytes in Avro top-level union types (#2762))
<<<<<<< HEAD
>>>>>>> 12e3a588fc (GEOMESA-3061 Converters - support bytes in Avro top-level union types (#2762))
=======
=======
=======
=======
>>>>>>> f36b0e8b9 (GEOMESA-3067 Find attribute in Filters with Functions with embedded expressions correctly)
>>>>>>> e5ed68fdd (GEOMESA-3067 Find attribute in Filters with Functions with embedded expressions correctly)
<<<<<<< HEAD
<<<<<<< HEAD
<<<<<<< HEAD
>>>>>>> 060ac2189c (GEOMESA-3067 Find attribute in Filters with Functions with embedded expressions correctly)
<<<<<<< HEAD
>>>>>>> c8e013ff91 (GEOMESA-3067 Find attribute in Filters with Functions with embedded expressions correctly)
=======
=======
=======
>>>>>>> e6e1f4bdd (GEOMESA-3061 Converters - support bytes in Avro top-level union types (#2762))
<<<<<<< HEAD
<<<<<<< HEAD
<<<<<<< HEAD
>>>>>>> 8035cc5893 (GEOMESA-3061 Converters - support bytes in Avro top-level union types (#2762))
<<<<<<< HEAD
>>>>>>> 1890b11217 (GEOMESA-3061 Converters - support bytes in Avro top-level union types (#2762))
=======
=======
=======
=======
>>>>>>> e3a63fee1 (GEOMESA-3067 Find attribute in Filters with Functions with embedded expressions correctly)
>>>>>>> 7f922b040 (GEOMESA-3067 Find attribute in Filters with Functions with embedded expressions correctly)
<<<<<<< HEAD
<<<<<<< HEAD
<<<<<<< HEAD
>>>>>>> 04f08c23c5 (GEOMESA-3067 Find attribute in Filters with Functions with embedded expressions correctly)
<<<<<<< HEAD
>>>>>>> 912169b5e9 (GEOMESA-3067 Find attribute in Filters with Functions with embedded expressions correctly)
=======
=======
=======
>>>>>>> a910ae135 (GEOMESA-3061 Converters - support bytes in Avro top-level union types (#2762))
<<<<<<< HEAD
<<<<<<< HEAD
<<<<<<< HEAD
>>>>>>> 07161eaaa6 (GEOMESA-3061 Converters - support bytes in Avro top-level union types (#2762))
<<<<<<< HEAD
>>>>>>> 9c28193a91 (GEOMESA-3061 Converters - support bytes in Avro top-level union types (#2762))
=======
=======
=======
>>>>>>> 8fb060734 (GEOMESA-3067 Find attribute in Filters with Functions with embedded expressions correctly)
<<<<<<< HEAD
<<<<<<< HEAD
<<<<<<< HEAD
>>>>>>> 38b3282770 (GEOMESA-3067 Find attribute in Filters with Functions with embedded expressions correctly)
<<<<<<< HEAD
>>>>>>> 1b60c2aeba (GEOMESA-3067 Find attribute in Filters with Functions with embedded expressions correctly)
=======
=======
=======
=======
>>>>>>> 67b361c85 (GEOMESA-3061 Converters - support bytes in Avro top-level union types (#2762))
>>>>>>> ad3cedc4d (GEOMESA-3061 Converters - support bytes in Avro top-level union types (#2762))
<<<<<<< HEAD
<<<<<<< HEAD
<<<<<<< HEAD
>>>>>>> 9abc630fdf (GEOMESA-3061 Converters - support bytes in Avro top-level union types (#2762))
<<<<<<< HEAD
>>>>>>> d294ce49e2 (GEOMESA-3061 Converters - support bytes in Avro top-level union types (#2762))
=======
=======
=======
>>>>>>> bc4913194 (GEOMESA-3067 Find attribute in Filters with Functions with embedded expressions correctly)
<<<<<<< HEAD
<<<<<<< HEAD
<<<<<<< HEAD
>>>>>>> 570899511d (GEOMESA-3067 Find attribute in Filters with Functions with embedded expressions correctly)
<<<<<<< HEAD
>>>>>>> ed45e8551f (GEOMESA-3067 Find attribute in Filters with Functions with embedded expressions correctly)
=======
=======
=======
=======
>>>>>>> b4320946b (GEOMESA-3061 Converters - support bytes in Avro top-level union types (#2762))
>>>>>>> bdbced26d (GEOMESA-3061 Converters - support bytes in Avro top-level union types (#2762))
>>>>>>> 25063957fc (GEOMESA-3061 Converters - support bytes in Avro top-level union types (#2762))
>>>>>>> 1df8328338 (GEOMESA-3061 Converters - support bytes in Avro top-level union types (#2762))
=======
>>>>>>> f0b9bd8121 (GEOMESA-3061 Converters - support bytes in Avro top-level union types (#2762))
<<<<<<< HEAD
<<<<<<< HEAD
<<<<<<< HEAD
<<<<<<< HEAD
=======
>>>>>>> 530b057384 (GEOMESA-3067 Find attribute in Filters with Functions with embedded expressions correctly)
=======
>>>>>>> 67dc71ffb1 (GEOMESA-3067 Find attribute in Filters with Functions with embedded expressions correctly)
=======
=======
>>>>>>> f36b0e8b9 (GEOMESA-3067 Find attribute in Filters with Functions with embedded expressions correctly)
>>>>>>> ef1a0521bd (GEOMESA-3067 Find attribute in Filters with Functions with embedded expressions correctly)
<<<<<<< HEAD
<<<<<<< HEAD
<<<<<<< HEAD
<<<<<<< HEAD
=======
>>>>>>> 2654d9c120 (GEOMESA-3061 Converters - support bytes in Avro top-level union types (#2762))
=======
>>>>>>> 058fd96baa (GEOMESA-3061 Converters - support bytes in Avro top-level union types (#2762))
=======
=======
>>>>>>> f36b0e8b9 (GEOMESA-3067 Find attribute in Filters with Functions with embedded expressions correctly)
=======
>>>>>>> cdb410251 (GEOMESA-3061 Converters - support bytes in Avro top-level union types (#2762))
>>>>>>> c3c5dd0ebb (GEOMESA-3061 Converters - support bytes in Avro top-level union types (#2762))
<<<<<<< HEAD
<<<<<<< HEAD
<<<<<<< HEAD
<<<<<<< HEAD
=======
>>>>>>> de7d6ef448 (GEOMESA-3067 Find attribute in Filters with Functions with embedded expressions correctly)
=======
>>>>>>> f7fc21ae20 (GEOMESA-3067 Find attribute in Filters with Functions with embedded expressions correctly)
=======
=======
>>>>>>> e3a63fee1 (GEOMESA-3067 Find attribute in Filters with Functions with embedded expressions correctly)
>>>>>>> 20f6826d0f (GEOMESA-3067 Find attribute in Filters with Functions with embedded expressions correctly)
<<<<<<< HEAD
<<<<<<< HEAD
<<<<<<< HEAD
<<<<<<< HEAD
=======
>>>>>>> f110463a26 (GEOMESA-3061 Converters - support bytes in Avro top-level union types (#2762))
=======
>>>>>>> c22ecd64c3 (GEOMESA-3061 Converters - support bytes in Avro top-level union types (#2762))
=======
=======
>>>>>>> 0e68e9f4c (GEOMESA-3061 Converters - support bytes in Avro top-level union types (#2762))
>>>>>>> 4c361f07da (GEOMESA-3061 Converters - support bytes in Avro top-level union types (#2762))
<<<<<<< HEAD
<<<<<<< HEAD
<<<<<<< HEAD
<<<<<<< HEAD
=======
>>>>>>> 125ffd0575 (GEOMESA-3067 Find attribute in Filters with Functions with embedded expressions correctly)
=======
=======
>>>>>>> 67b361c85 (GEOMESA-3061 Converters - support bytes in Avro top-level union types (#2762))
>>>>>>> f302a54949 (GEOMESA-3061 Converters - support bytes in Avro top-level union types (#2762))
<<<<<<< HEAD
<<<<<<< HEAD
<<<<<<< HEAD
<<<<<<< HEAD
=======
>>>>>>> 17883cb601 (GEOMESA-3067 Find attribute in Filters with Functions with embedded expressions correctly)
=======
>>>>>>> 08a743b61d (GEOMESA-3067 Find attribute in Filters with Functions with embedded expressions correctly)
=======
=======
>>>>>>> 908ad4071 (GEOMESA-3067 Find attribute in Filters with Functions with embedded expressions correctly)
>>>>>>> a83fe4cf7c (GEOMESA-3067 Find attribute in Filters with Functions with embedded expressions correctly)
<<<<<<< HEAD
<<<<<<< HEAD
<<<<<<< HEAD
<<<<<<< HEAD
=======
>>>>>>> 1bcc513539 (GEOMESA-3061 Converters - support bytes in Avro top-level union types (#2762))
=======
>>>>>>> b08cb4d818 (GEOMESA-3061 Converters - support bytes in Avro top-level union types (#2762))
=======
=======
>>>>>>> b4320946b (GEOMESA-3061 Converters - support bytes in Avro top-level union types (#2762))
>>>>>>> a788dfac03 (GEOMESA-3061 Converters - support bytes in Avro top-level union types (#2762))
<<<<<<< HEAD
<<<<<<< HEAD
<<<<<<< HEAD
=======
>>>>>>> a1d28116d4 (GEOMESA-3067 Find attribute in Filters with Functions with embedded expressions correctly)
=======
>>>>>>> f67dd3371e (GEOMESA-3061 Converters - support bytes in Avro top-level union types (#2762))
<<<<<<< HEAD
<<<<<<< HEAD
=======
>>>>>>> a9884ff1f6 (GEOMESA-3067 Find attribute in Filters with Functions with embedded expressions correctly)
=======
=======
<<<<<<< HEAD
>>>>>>> e8b736ee96 (GEOMESA-3061 Converters - support bytes in Avro top-level union types (#2762))
=======
=======
>>>>>>> 988874c83e (GEOMESA-3061 Converters - support bytes in Avro top-level union types (#2762))
=======
>>>>>>> f36b0e8b9 (GEOMESA-3067 Find attribute in Filters with Functions with embedded expressions correctly)
=======
>>>>>>> cdb410251 (GEOMESA-3061 Converters - support bytes in Avro top-level union types (#2762))
>>>>>>> 67b361c856 (GEOMESA-3061 Converters - support bytes in Avro top-level union types (#2762))
<<<<<<< HEAD
<<<<<<< HEAD
<<<<<<< HEAD
<<<<<<< HEAD
>>>>>>> f7cef54062 (GEOMESA-3061 Converters - support bytes in Avro top-level union types (#2762))
=======
=======
>>>>>>> b4320946b4 (GEOMESA-3061 Converters - support bytes in Avro top-level union types (#2762))
<<<<<<< HEAD
<<<<<<< HEAD
>>>>>>> a16b64a4d1 (GEOMESA-3061 Converters - support bytes in Avro top-level union types (#2762))
=======
=======
>>>>>>> d9ed077cd1 (GEOMESA-3061 Converters - support bytes in Avro top-level union types (#2762))
<<<<<<< HEAD
<<<<<<< HEAD
>>>>>>> 810876750d (GEOMESA-3061 Converters - support bytes in Avro top-level union types (#2762))
=======
=======
>>>>>>> cd4422a10c (GEOMESA-3067 Find attribute in Filters with Functions with embedded expressions correctly)
=======
=======
>>>>>>> f36b0e8b9 (GEOMESA-3067 Find attribute in Filters with Functions with embedded expressions correctly)
>>>>>>> e182e6e99c (GEOMESA-3067 Find attribute in Filters with Functions with embedded expressions correctly)
<<<<<<< HEAD
>>>>>>> 2571e49519 (GEOMESA-3067 Find attribute in Filters with Functions with embedded expressions correctly)
=======
>>>>>>> d206a68a13 (GEOMESA-3061 Converters - support bytes in Avro top-level union types (#2762))
=======
=======
=======
>>>>>>> e3a63fee1 (GEOMESA-3067 Find attribute in Filters with Functions with embedded expressions correctly)
<<<<<<< HEAD
>>>>>>> 3333975e77 (GEOMESA-3067 Find attribute in Filters with Functions with embedded expressions correctly)
<<<<<<< HEAD
>>>>>>> 9412e85b59 (GEOMESA-3067 Find attribute in Filters with Functions with embedded expressions correctly)
=======
=======
=======
>>>>>>> 0e68e9f4c (GEOMESA-3061 Converters - support bytes in Avro top-level union types (#2762))
<<<<<<< HEAD
>>>>>>> 76618c8da3 (GEOMESA-3061 Converters - support bytes in Avro top-level union types (#2762))
<<<<<<< HEAD
>>>>>>> 694bcd3776 (GEOMESA-3061 Converters - support bytes in Avro top-level union types (#2762))
=======
>>>>>>> 76618c8da3 (GEOMESA-3061 Converters - support bytes in Avro top-level union types (#2762))
=======
>>>>>>> def2794bb5 (GEOMESA-3067 Find attribute in Filters with Functions with embedded expressions correctly)
=======
=======
=======
>>>>>>> f36b0e8b9 (GEOMESA-3067 Find attribute in Filters with Functions with embedded expressions correctly)
>>>>>>> a63cb7e74 (GEOMESA-3067 Find attribute in Filters with Functions with embedded expressions correctly)
<<<<<<< HEAD
<<<<<<< HEAD
<<<<<<< HEAD
>>>>>>> c3b0a1b6e3 (GEOMESA-3067 Find attribute in Filters with Functions with embedded expressions correctly)
<<<<<<< HEAD
>>>>>>> 24c4df93a5 (GEOMESA-3067 Find attribute in Filters with Functions with embedded expressions correctly)
=======
=======
=======
>>>>>>> 67b361c85 (GEOMESA-3061 Converters - support bytes in Avro top-level union types (#2762))
<<<<<<< HEAD
>>>>>>> c8a325e13c (GEOMESA-3061 Converters - support bytes in Avro top-level union types (#2762))
<<<<<<< HEAD
>>>>>>> 6cd1151639 (GEOMESA-3061 Converters - support bytes in Avro top-level union types (#2762))
=======
=======
=======
>>>>>>> 908ad4071 (GEOMESA-3067 Find attribute in Filters with Functions with embedded expressions correctly)
<<<<<<< HEAD
<<<<<<< HEAD
>>>>>>> 9638dc731e (GEOMESA-3067 Find attribute in Filters with Functions with embedded expressions correctly)
<<<<<<< HEAD
>>>>>>> 1e00950a90 (GEOMESA-3067 Find attribute in Filters with Functions with embedded expressions correctly)
=======
=======
=======
>>>>>>> b4320946b (GEOMESA-3061 Converters - support bytes in Avro top-level union types (#2762))
>>>>>>> 97ec7d864a (GEOMESA-3061 Converters - support bytes in Avro top-level union types (#2762))
<<<<<<< HEAD
>>>>>>> 1973f72e77 (GEOMESA-3061 Converters - support bytes in Avro top-level union types (#2762))
=======
=======
>>>>>>> 6d9a5b626c (GEOMESA-3061 Converters - support bytes in Avro top-level union types (#2762))
<<<<<<< HEAD
<<<<<<< HEAD
<<<<<<< HEAD
=======
>>>>>>> e8ce815f1b (GEOMESA-3067 Find attribute in Filters with Functions with embedded expressions correctly)
>>>>>>> 96d5d442fa (GEOMESA-3061 Converters - support bytes in Avro top-level union types (#2762))
=======
=======
=======
>>>>>>> f36b0e8b9 (GEOMESA-3067 Find attribute in Filters with Functions with embedded expressions correctly)
>>>>>>> e5ed68fdd3 (GEOMESA-3067 Find attribute in Filters with Functions with embedded expressions correctly)
<<<<<<< HEAD
<<<<<<< HEAD
<<<<<<< HEAD
=======
>>>>>>> 60b4637548 (GEOMESA-3061 Converters - support bytes in Avro top-level union types (#2762))
>>>>>>> b3dd8ec805 (GEOMESA-3067 Find attribute in Filters with Functions with embedded expressions correctly)
=======
=======
=======
>>>>>>> f36b0e8b9 (GEOMESA-3067 Find attribute in Filters with Functions with embedded expressions correctly)
=======
>>>>>>> cdb410251 (GEOMESA-3061 Converters - support bytes in Avro top-level union types (#2762))
<<<<<<< HEAD
<<<<<<< HEAD
>>>>>>> e6e1f4bdd5 (GEOMESA-3061 Converters - support bytes in Avro top-level union types (#2762))
>>>>>>> 5dcf23da52 (GEOMESA-3061 Converters - support bytes in Avro top-level union types (#2762))
=======
>>>>>>> 2b62d1f3fe (GEOMESA-3067 Find attribute in Filters with Functions with embedded expressions correctly)
<<<<<<< HEAD
<<<<<<< HEAD
=======
>>>>>>> 92674ff9d4 (GEOMESA-3061 Converters - support bytes in Avro top-level union types (#2762))
=======
=======
>>>>>>> 8fb0607344 (GEOMESA-3067 Find attribute in Filters with Functions with embedded expressions correctly)
>>>>>>> c169cb2905 (GEOMESA-3067 Find attribute in Filters with Functions with embedded expressions correctly)
<<<<<<< HEAD
<<<<<<< HEAD
=======
>>>>>>> 9a4dff9e4f (GEOMESA-3061 Converters - support bytes in Avro top-level union types (#2762))
=======
>>>>>>> 63ca73533e (GEOMESA-3067 Find attribute in Filters with Functions with embedded expressions correctly)
<<<<<<< HEAD
<<<<<<< HEAD
=======
>>>>>>> 0fc6650ecf (GEOMESA-3061 Converters - support bytes in Avro top-level union types (#2762))
=======
=======
=======
>>>>>>> 87bf55340 (GEOMESA-3061 Converters - support bytes in Avro top-level union types (#2762))
<<<<<<< HEAD
<<<<<<< HEAD
<<<<<<< HEAD
>>>>>>> 0dbede148d (GEOMESA-3061 Converters - support bytes in Avro top-level union types (#2762))
<<<<<<< HEAD
>>>>>>> 1bb69524c2 (GEOMESA-3061 Converters - support bytes in Avro top-level union types (#2762))
=======
=======
=======
>>>>>>> 240977229 (GEOMESA-3061 Converters - support bytes in Avro top-level union types (#2762))
>>>>>>> 22dcc8170f (GEOMESA-3061 Converters - support bytes in Avro top-level union types (#2762))
>>>>>>> 8c9ca1211a (GEOMESA-3061 Converters - support bytes in Avro top-level union types (#2762))
=======
>>>>>>> b009fd23f4 (GEOMESA-3061 Converters - support bytes in Avro top-level union types (#2762))
>>>>>>> a22efb4d66 (GEOMESA-3061 Converters - support bytes in Avro top-level union types (#2762))
<<<<<<< HEAD
<<<<<<< HEAD
=======
>>>>>>> 238945d4b3 (GEOMESA-3061 Converters - support bytes in Avro top-level union types (#2762))
>>>>>>> 1cad375176 (GEOMESA-3061 Converters - support bytes in Avro top-level union types (#2762))
=======
>>>>>>> bc4062951d (GEOMESA-3061 Converters - support bytes in Avro top-level union types (#2762))
>>>>>>> 1e39c0c27d (GEOMESA-3061 Converters - support bytes in Avro top-level union types (#2762))
<<<<<<< HEAD
=======
=======
>>>>>>> a1f15598cb (GEOMESA-3061 Converters - support bytes in Avro top-level union types (#2762))
>>>>>>> 8a3e82747d (GEOMESA-3067 Find attribute in Filters with Functions with embedded expressions correctly)
<<<<<<< HEAD
>>>>>>> deb8fd68de (GEOMESA-3067 Find attribute in Filters with Functions with embedded expressions correctly)
<<<<<<< HEAD
>>>>>>> a990cf104e (GEOMESA-3067 Find attribute in Filters with Functions with embedded expressions correctly)
=======
=======
=======
=======
>>>>>>> d9ed077cd (GEOMESA-3061 Converters - support bytes in Avro top-level union types (#2762))
=======
>>>>>>> 4373c901b3 (GEOMESA-3067 Find attribute in Filters with Functions with embedded expressions correctly)
>>>>>>> 81ee66102b (GEOMESA-3061 Converters - support bytes in Avro top-level union types (#2762))
<<<<<<< HEAD
>>>>>>> 8adfab65bb (GEOMESA-3061 Converters - support bytes in Avro top-level union types (#2762))
<<<<<<< HEAD
>>>>>>> a1f15598cb (GEOMESA-3061 Converters - support bytes in Avro top-level union types (#2762))
=======
=======
=======
=======
=======
>>>>>>> f36b0e8b9 (GEOMESA-3067 Find attribute in Filters with Functions with embedded expressions correctly)
>>>>>>> e182e6e99 (GEOMESA-3067 Find attribute in Filters with Functions with embedded expressions correctly)
=======
>>>>>>> 963feec660 (GEOMESA-3061 Converters - support bytes in Avro top-level union types (#2762))
>>>>>>> 9943e05ec9 (GEOMESA-3067 Find attribute in Filters with Functions with embedded expressions correctly)
<<<<<<< HEAD
>>>>>>> 3254b186da (GEOMESA-3067 Find attribute in Filters with Functions with embedded expressions correctly)
<<<<<<< HEAD
>>>>>>> 4373c901b3 (GEOMESA-3067 Find attribute in Filters with Functions with embedded expressions correctly)
=======
=======
=======
=======
>>>>>>> 9d708b240 (GEOMESA-3061 Converters - support bytes in Avro top-level union types (#2762))
=======
>>>>>>> 2c14568a23 (GEOMESA-3067 Find attribute in Filters with Functions with embedded expressions correctly)
>>>>>>> 53a3e72cbf (GEOMESA-3061 Converters - support bytes in Avro top-level union types (#2762))
<<<<<<< HEAD
>>>>>>> 7b0539b808 (GEOMESA-3061 Converters - support bytes in Avro top-level union types (#2762))
<<<<<<< HEAD
>>>>>>> 963feec660 (GEOMESA-3061 Converters - support bytes in Avro top-level union types (#2762))
=======
=======
=======
=======
=======
>>>>>>> e3a63fee1 (GEOMESA-3067 Find attribute in Filters with Functions with embedded expressions correctly)
>>>>>>> 3333975e7 (GEOMESA-3067 Find attribute in Filters with Functions with embedded expressions correctly)
=======
>>>>>>> 84ac051f28 (GEOMESA-3061 Converters - support bytes in Avro top-level union types (#2762))
>>>>>>> d15af7157e (GEOMESA-3067 Find attribute in Filters with Functions with embedded expressions correctly)
<<<<<<< HEAD
>>>>>>> 982031ef44 (GEOMESA-3067 Find attribute in Filters with Functions with embedded expressions correctly)
<<<<<<< HEAD
>>>>>>> 2c14568a23 (GEOMESA-3067 Find attribute in Filters with Functions with embedded expressions correctly)
=======
=======
=======
=======
>>>>>>> 76618c8da (GEOMESA-3061 Converters - support bytes in Avro top-level union types (#2762))
=======
>>>>>>> 99acaa0887 (GEOMESA-3067 Find attribute in Filters with Functions with embedded expressions correctly)
>>>>>>> 947761ec9b (GEOMESA-3061 Converters - support bytes in Avro top-level union types (#2762))
<<<<<<< HEAD
>>>>>>> 0086b292ba (GEOMESA-3061 Converters - support bytes in Avro top-level union types (#2762))
<<<<<<< HEAD
>>>>>>> 84ac051f28 (GEOMESA-3061 Converters - support bytes in Avro top-level union types (#2762))
=======
=======
=======
=======
>>>>>>> c3b0a1b6e (GEOMESA-3067 Find attribute in Filters with Functions with embedded expressions correctly)
=======
>>>>>>> fe3de10f11 (GEOMESA-3061 Converters - support bytes in Avro top-level union types (#2762))
>>>>>>> 9813375fcc (GEOMESA-3067 Find attribute in Filters with Functions with embedded expressions correctly)
<<<<<<< HEAD
>>>>>>> cf57a2c189 (GEOMESA-3067 Find attribute in Filters with Functions with embedded expressions correctly)
<<<<<<< HEAD
>>>>>>> 99acaa0887 (GEOMESA-3067 Find attribute in Filters with Functions with embedded expressions correctly)
=======
=======
=======
=======
=======
>>>>>>> 67b361c85 (GEOMESA-3061 Converters - support bytes in Avro top-level union types (#2762))
>>>>>>> c8a325e13 (GEOMESA-3061 Converters - support bytes in Avro top-level union types (#2762))
=======
>>>>>>> 21deff19fd (GEOMESA-3067 Find attribute in Filters with Functions with embedded expressions correctly)
>>>>>>> c9328eddce (GEOMESA-3061 Converters - support bytes in Avro top-level union types (#2762))
<<<<<<< HEAD
>>>>>>> e15d50d7d3 (GEOMESA-3061 Converters - support bytes in Avro top-level union types (#2762))
<<<<<<< HEAD
>>>>>>> fe3de10f11 (GEOMESA-3061 Converters - support bytes in Avro top-level union types (#2762))
=======
=======
=======
=======
>>>>>>> 9638dc731 (GEOMESA-3067 Find attribute in Filters with Functions with embedded expressions correctly)
=======
>>>>>>> d0785cf307 (GEOMESA-3061 Converters - support bytes in Avro top-level union types (#2762))
>>>>>>> d2eec4be68 (GEOMESA-3067 Find attribute in Filters with Functions with embedded expressions correctly)
<<<<<<< HEAD
>>>>>>> bec3ba7d08 (GEOMESA-3067 Find attribute in Filters with Functions with embedded expressions correctly)
<<<<<<< HEAD
>>>>>>> 21deff19fd (GEOMESA-3067 Find attribute in Filters with Functions with embedded expressions correctly)
=======
=======
=======
=======
=======
>>>>>>> b4320946b (GEOMESA-3061 Converters - support bytes in Avro top-level union types (#2762))
>>>>>>> 97ec7d864 (GEOMESA-3061 Converters - support bytes in Avro top-level union types (#2762))
=======
>>>>>>> 53900605ca (GEOMESA-3067 Find attribute in Filters with Functions with embedded expressions correctly)
>>>>>>> d94c03a98e (GEOMESA-3061 Converters - support bytes in Avro top-level union types (#2762))
<<<<<<< HEAD
>>>>>>> 8de43cccf6 (GEOMESA-3061 Converters - support bytes in Avro top-level union types (#2762))
<<<<<<< HEAD
>>>>>>> d0785cf307 (GEOMESA-3061 Converters - support bytes in Avro top-level union types (#2762))
=======
=======
=======
=======
>>>>>>> 7bb5f26c3 (GEOMESA-3067 Find attribute in Filters with Functions with embedded expressions correctly)
=======
>>>>>>> a52e4429be (GEOMESA-3061 Converters - support bytes in Avro top-level union types (#2762))
>>>>>>> e69b2aa6dc (GEOMESA-3067 Find attribute in Filters with Functions with embedded expressions correctly)
<<<<<<< HEAD
>>>>>>> b1a7408547 (GEOMESA-3067 Find attribute in Filters with Functions with embedded expressions correctly)
<<<<<<< HEAD
>>>>>>> 53900605ca (GEOMESA-3067 Find attribute in Filters with Functions with embedded expressions correctly)
=======
=======
=======
=======
>>>>>>> 6d9a5b626 (GEOMESA-3061 Converters - support bytes in Avro top-level union types (#2762))
=======
>>>>>>> 5f01e2c4fc (GEOMESA-3067 Find attribute in Filters with Functions with embedded expressions correctly)
>>>>>>> 67e4c1354f (GEOMESA-3061 Converters - support bytes in Avro top-level union types (#2762))
<<<<<<< HEAD
>>>>>>> 12e3a588fc (GEOMESA-3061 Converters - support bytes in Avro top-level union types (#2762))
<<<<<<< HEAD
>>>>>>> a52e4429be (GEOMESA-3061 Converters - support bytes in Avro top-level union types (#2762))
=======
=======
=======
=======
=======
>>>>>>> f36b0e8b9 (GEOMESA-3067 Find attribute in Filters with Functions with embedded expressions correctly)
>>>>>>> e5ed68fdd (GEOMESA-3067 Find attribute in Filters with Functions with embedded expressions correctly)
=======
>>>>>>> 5c6b9f1f8b (GEOMESA-3061 Converters - support bytes in Avro top-level union types (#2762))
>>>>>>> 060ac2189c (GEOMESA-3067 Find attribute in Filters with Functions with embedded expressions correctly)
<<<<<<< HEAD
>>>>>>> c8e013ff91 (GEOMESA-3067 Find attribute in Filters with Functions with embedded expressions correctly)
<<<<<<< HEAD
>>>>>>> 5f01e2c4fc (GEOMESA-3067 Find attribute in Filters with Functions with embedded expressions correctly)
=======
=======
=======
=======
>>>>>>> e6e1f4bdd (GEOMESA-3061 Converters - support bytes in Avro top-level union types (#2762))
=======
>>>>>>> 511bd92a86 (GEOMESA-3067 Find attribute in Filters with Functions with embedded expressions correctly)
>>>>>>> 8035cc5893 (GEOMESA-3061 Converters - support bytes in Avro top-level union types (#2762))
<<<<<<< HEAD
>>>>>>> 1890b11217 (GEOMESA-3061 Converters - support bytes in Avro top-level union types (#2762))
<<<<<<< HEAD
>>>>>>> 5c6b9f1f8b (GEOMESA-3061 Converters - support bytes in Avro top-level union types (#2762))
=======
=======
=======
=======
=======
>>>>>>> e3a63fee1 (GEOMESA-3067 Find attribute in Filters with Functions with embedded expressions correctly)
>>>>>>> 7f922b040 (GEOMESA-3067 Find attribute in Filters with Functions with embedded expressions correctly)
=======
>>>>>>> 9d44ff473d (GEOMESA-3061 Converters - support bytes in Avro top-level union types (#2762))
>>>>>>> 04f08c23c5 (GEOMESA-3067 Find attribute in Filters with Functions with embedded expressions correctly)
<<<<<<< HEAD
>>>>>>> 912169b5e9 (GEOMESA-3067 Find attribute in Filters with Functions with embedded expressions correctly)
<<<<<<< HEAD
>>>>>>> 511bd92a86 (GEOMESA-3067 Find attribute in Filters with Functions with embedded expressions correctly)
=======
=======
=======
=======
>>>>>>> a910ae135 (GEOMESA-3061 Converters - support bytes in Avro top-level union types (#2762))
=======
>>>>>>> bff2bdde04 (GEOMESA-3067 Find attribute in Filters with Functions with embedded expressions correctly)
>>>>>>> 07161eaaa6 (GEOMESA-3061 Converters - support bytes in Avro top-level union types (#2762))
<<<<<<< HEAD
>>>>>>> 9c28193a91 (GEOMESA-3061 Converters - support bytes in Avro top-level union types (#2762))
<<<<<<< HEAD
>>>>>>> 9d44ff473d (GEOMESA-3061 Converters - support bytes in Avro top-level union types (#2762))
=======
=======
=======
=======
>>>>>>> 8fb060734 (GEOMESA-3067 Find attribute in Filters with Functions with embedded expressions correctly)
=======
>>>>>>> a35efac12e (GEOMESA-3061 Converters - support bytes in Avro top-level union types (#2762))
>>>>>>> 38b3282770 (GEOMESA-3067 Find attribute in Filters with Functions with embedded expressions correctly)
<<<<<<< HEAD
>>>>>>> 1b60c2aeba (GEOMESA-3067 Find attribute in Filters with Functions with embedded expressions correctly)
<<<<<<< HEAD
>>>>>>> bff2bdde04 (GEOMESA-3067 Find attribute in Filters with Functions with embedded expressions correctly)
=======
=======
=======
=======
=======
>>>>>>> 67b361c85 (GEOMESA-3061 Converters - support bytes in Avro top-level union types (#2762))
>>>>>>> ad3cedc4d (GEOMESA-3061 Converters - support bytes in Avro top-level union types (#2762))
=======
>>>>>>> 323528580f (GEOMESA-3067 Find attribute in Filters with Functions with embedded expressions correctly)
>>>>>>> 9abc630fdf (GEOMESA-3061 Converters - support bytes in Avro top-level union types (#2762))
<<<<<<< HEAD
>>>>>>> d294ce49e2 (GEOMESA-3061 Converters - support bytes in Avro top-level union types (#2762))
<<<<<<< HEAD
>>>>>>> a35efac12e (GEOMESA-3061 Converters - support bytes in Avro top-level union types (#2762))
=======
=======
=======
=======
>>>>>>> bc4913194 (GEOMESA-3067 Find attribute in Filters with Functions with embedded expressions correctly)
=======
>>>>>>> fd5565dfba (GEOMESA-3061 Converters - support bytes in Avro top-level union types (#2762))
>>>>>>> 570899511d (GEOMESA-3067 Find attribute in Filters with Functions with embedded expressions correctly)
<<<<<<< HEAD
>>>>>>> ed45e8551f (GEOMESA-3067 Find attribute in Filters with Functions with embedded expressions correctly)
<<<<<<< HEAD
>>>>>>> 323528580f (GEOMESA-3067 Find attribute in Filters with Functions with embedded expressions correctly)
=======
=======
=======
=======
=======
>>>>>>> b4320946b (GEOMESA-3061 Converters - support bytes in Avro top-level union types (#2762))
>>>>>>> bdbced26d (GEOMESA-3061 Converters - support bytes in Avro top-level union types (#2762))
>>>>>>> 25063957fc (GEOMESA-3061 Converters - support bytes in Avro top-level union types (#2762))
>>>>>>> 1df8328338 (GEOMESA-3061 Converters - support bytes in Avro top-level union types (#2762))
>>>>>>> fd5565dfba (GEOMESA-3061 Converters - support bytes in Avro top-level union types (#2762))
=======
>>>>>>> 0104fb37e4 (GEOMESA-3061 Converters - support bytes in Avro top-level union types (#2762))
=======
>>>>>>> 530b057384 (GEOMESA-3067 Find attribute in Filters with Functions with embedded expressions correctly)
=======
>>>>>>> 2654d9c120 (GEOMESA-3061 Converters - support bytes in Avro top-level union types (#2762))
=======
>>>>>>> de7d6ef448 (GEOMESA-3067 Find attribute in Filters with Functions with embedded expressions correctly)
=======
>>>>>>> f110463a26 (GEOMESA-3061 Converters - support bytes in Avro top-level union types (#2762))
=======
=======
>>>>>>> 125ffd0575 (GEOMESA-3067 Find attribute in Filters with Functions with embedded expressions correctly)
>>>>>>> d83561962d (GEOMESA-3067 Find attribute in Filters with Functions with embedded expressions correctly)
=======
>>>>>>> 86ec77f9cb (GEOMESA-3061 Converters - support bytes in Avro top-level union types (#2762))
=======
>>>>>>> 17883cb601 (GEOMESA-3067 Find attribute in Filters with Functions with embedded expressions correctly)
=======
>>>>>>> 1bcc513539 (GEOMESA-3061 Converters - support bytes in Avro top-level union types (#2762))
=======
>>>>>>> efb6723f42 (GEOMESA-3067 Find attribute in Filters with Functions with embedded expressions correctly)
=======
>>>>>>> 7bff4d0018 (GEOMESA-3061 Converters - support bytes in Avro top-level union types (#2762))
=======
>>>>>>> 657a38673a (GEOMESA-3067 Find attribute in Filters with Functions with embedded expressions correctly)
=======
>>>>>>> e8b736ee96 (GEOMESA-3061 Converters - support bytes in Avro top-level union types (#2762))
=======
=======
>>>>>>> b4320946b4 (GEOMESA-3061 Converters - support bytes in Avro top-level union types (#2762))
>>>>>>> 0efbfe547e (GEOMESA-3061 Converters - support bytes in Avro top-level union types (#2762))
=======
=======
>>>>>>> d9ed077cd1 (GEOMESA-3061 Converters - support bytes in Avro top-level union types (#2762))
>>>>>>> d498bef1ce (GEOMESA-3061 Converters - support bytes in Avro top-level union types (#2762))
=======
>>>>>>> cd4422a10c (GEOMESA-3067 Find attribute in Filters with Functions with embedded expressions correctly)
=======
>>>>>>> a5b160f47b (GEOMESA-3061 Converters - support bytes in Avro top-level union types (#2762))
=======
=======
=======
>>>>>>> e3a63fee1 (GEOMESA-3067 Find attribute in Filters with Functions with embedded expressions correctly)
<<<<<<< HEAD
>>>>>>> 3333975e77 (GEOMESA-3067 Find attribute in Filters with Functions with embedded expressions correctly)
<<<<<<< HEAD
>>>>>>> fa429c7863 (GEOMESA-3067 Find attribute in Filters with Functions with embedded expressions correctly)
=======
=======
=======
>>>>>>> 0e68e9f4c (GEOMESA-3061 Converters - support bytes in Avro top-level union types (#2762))
>>>>>>> 76618c8da3 (GEOMESA-3061 Converters - support bytes in Avro top-level union types (#2762))
>>>>>>> 5cf31d21f3 (GEOMESA-3061 Converters - support bytes in Avro top-level union types (#2762))
=======
>>>>>>> c3b0a1b6e3 (GEOMESA-3067 Find attribute in Filters with Functions with embedded expressions correctly)
>>>>>>> def2794bb5 (GEOMESA-3067 Find attribute in Filters with Functions with embedded expressions correctly)
=======
>>>>>>> c3b0a1b6e3 (GEOMESA-3067 Find attribute in Filters with Functions with embedded expressions correctly)
=======
=======
>>>>>>> 67b361c85 (GEOMESA-3061 Converters - support bytes in Avro top-level union types (#2762))
<<<<<<< HEAD
>>>>>>> c8a325e13c (GEOMESA-3061 Converters - support bytes in Avro top-level union types (#2762))
<<<<<<< HEAD
>>>>>>> 94fecee1d8 (GEOMESA-3061 Converters - support bytes in Avro top-level union types (#2762))
=======
=======
=======
>>>>>>> 908ad4071 (GEOMESA-3067 Find attribute in Filters with Functions with embedded expressions correctly)
<<<<<<< HEAD
>>>>>>> 9638dc731e (GEOMESA-3067 Find attribute in Filters with Functions with embedded expressions correctly)
<<<<<<< HEAD
>>>>>>> f8d3d445c0 (GEOMESA-3067 Find attribute in Filters with Functions with embedded expressions correctly)
=======
=======
=======
>>>>>>> b4320946b (GEOMESA-3061 Converters - support bytes in Avro top-level union types (#2762))
>>>>>>> 97ec7d864a (GEOMESA-3061 Converters - support bytes in Avro top-level union types (#2762))
<<<<<<< HEAD
>>>>>>> 4599715c51 (d)
=======
=======
>>>>>>> 6d9a5b626c (GEOMESA-3061 Converters - support bytes in Avro top-level union types (#2762))
<<<<<<< HEAD
>>>>>>> 7fbbd56493 (GEOMESA-3061 Converters - support bytes in Avro top-level union types (#2762))
=======
=======
=======
>>>>>>> f36b0e8b9 (GEOMESA-3067 Find attribute in Filters with Functions with embedded expressions correctly)
>>>>>>> e5ed68fdd3 (GEOMESA-3067 Find attribute in Filters with Functions with embedded expressions correctly)
>>>>>>> e582c3ecfe (GEOMESA-3067 Find attribute in Filters with Functions with embedded expressions correctly)
=======
>>>>>>> 3eb12f79a9 (GEOMESA-3061 Converters - support bytes in Avro top-level union types (#2762))
=======
>>>>>>> 8b16ac5c65 (GEOMESA-3067 Find attribute in Filters with Functions with embedded expressions correctly)
=======
>>>>>>> 4ccd6f6b1f (GEOMESA-3061 Converters - support bytes in Avro top-level union types (#2762))
=======
=======
>>>>>>> 8fb0607344 (GEOMESA-3067 Find attribute in Filters with Functions with embedded expressions correctly)
>>>>>>> f983ea29f0 (GEOMESA-3067 Find attribute in Filters with Functions with embedded expressions correctly)
=======
>>>>>>> 35b69b8f2f (GEOMESA-3061 Converters - support bytes in Avro top-level union types (#2762))
=======
>>>>>>> da4e2905b4 (GEOMESA-3067 Find attribute in Filters with Functions with embedded expressions correctly)
=======
>>>>>>> db8a3a22b2 (GEOMESA-3061 Converters - support bytes in Avro top-level union types (#2762))
=======
=======
=======
>>>>>>> 87bf55340 (GEOMESA-3061 Converters - support bytes in Avro top-level union types (#2762))
<<<<<<< HEAD
>>>>>>> 0dbede148d (GEOMESA-3061 Converters - support bytes in Avro top-level union types (#2762))
<<<<<<< HEAD
>>>>>>> 27afb28ab6 (GEOMESA-3061 Converters - support bytes in Avro top-level union types (#2762))
=======
=======
=======
>>>>>>> 240977229 (GEOMESA-3061 Converters - support bytes in Avro top-level union types (#2762))
>>>>>>> 22dcc8170f (GEOMESA-3061 Converters - support bytes in Avro top-level union types (#2762))
>>>>>>> 26a09ee6c2 (GEOMESA-3061 Converters - support bytes in Avro top-level union types (#2762))
=======
>>>>>>> b009fd23f4 (GEOMESA-3061 Converters - support bytes in Avro top-level union types (#2762))
>>>>>>> 194ad4e5c0 (GEOMESA-3061 Converters - support bytes in Avro top-level union types (#2762))
=======
>>>>>>> 238945d4b3 (GEOMESA-3061 Converters - support bytes in Avro top-level union types (#2762))
>>>>>>> 7b3c90c53f (GEOMESA-3061 Converters - support bytes in Avro top-level union types (#2762))
=======
>>>>>>> bc4062951d (GEOMESA-3061 Converters - support bytes in Avro top-level union types (#2762))
>>>>>>> db9dfb6f14 (GEOMESA-3061 Converters - support bytes in Avro top-level union types (#2762))
=======
=======
>>>>>>> b8ebbf6083 (GEOMESA-3061 Converters - support bytes in Avro top-level union types (#2762))
>>>>>>> 8a3e82747d (GEOMESA-3067 Find attribute in Filters with Functions with embedded expressions correctly)
<<<<<<< HEAD
>>>>>>> deb8fd68de (GEOMESA-3067 Find attribute in Filters with Functions with embedded expressions correctly)
<<<<<<< HEAD
>>>>>>> f33d55e2ba (GEOMESA-3067 Find attribute in Filters with Functions with embedded expressions correctly)
=======
=======
=======
=======
>>>>>>> d9ed077cd (GEOMESA-3061 Converters - support bytes in Avro top-level union types (#2762))
=======
>>>>>>> 1278241911 (GEOMESA-3067 Find attribute in Filters with Functions with embedded expressions correctly)
>>>>>>> 81ee66102b (GEOMESA-3061 Converters - support bytes in Avro top-level union types (#2762))
<<<<<<< HEAD
>>>>>>> 8adfab65bb (GEOMESA-3061 Converters - support bytes in Avro top-level union types (#2762))
<<<<<<< HEAD
>>>>>>> b8ebbf6083 (GEOMESA-3061 Converters - support bytes in Avro top-level union types (#2762))
=======
=======
=======
=======
=======
>>>>>>> f36b0e8b9 (GEOMESA-3067 Find attribute in Filters with Functions with embedded expressions correctly)
>>>>>>> e182e6e99 (GEOMESA-3067 Find attribute in Filters with Functions with embedded expressions correctly)
=======
>>>>>>> 3e7fb62639 (GEOMESA-3061 Converters - support bytes in Avro top-level union types (#2762))
>>>>>>> 9943e05ec9 (GEOMESA-3067 Find attribute in Filters with Functions with embedded expressions correctly)
<<<<<<< HEAD
>>>>>>> 3254b186da (GEOMESA-3067 Find attribute in Filters with Functions with embedded expressions correctly)
<<<<<<< HEAD
>>>>>>> 1278241911 (GEOMESA-3067 Find attribute in Filters with Functions with embedded expressions correctly)
=======
=======
=======
=======
>>>>>>> 9d708b240 (GEOMESA-3061 Converters - support bytes in Avro top-level union types (#2762))
=======
>>>>>>> 00d66ae013 (GEOMESA-3067 Find attribute in Filters with Functions with embedded expressions correctly)
>>>>>>> 53a3e72cbf (GEOMESA-3061 Converters - support bytes in Avro top-level union types (#2762))
<<<<<<< HEAD
>>>>>>> 7b0539b808 (GEOMESA-3061 Converters - support bytes in Avro top-level union types (#2762))
<<<<<<< HEAD
>>>>>>> 3e7fb62639 (GEOMESA-3061 Converters - support bytes in Avro top-level union types (#2762))
=======
=======
=======
=======
=======
>>>>>>> e3a63fee1 (GEOMESA-3067 Find attribute in Filters with Functions with embedded expressions correctly)
>>>>>>> 3333975e7 (GEOMESA-3067 Find attribute in Filters with Functions with embedded expressions correctly)
=======
>>>>>>> c2cfc968d2 (GEOMESA-3061 Converters - support bytes in Avro top-level union types (#2762))
>>>>>>> d15af7157e (GEOMESA-3067 Find attribute in Filters with Functions with embedded expressions correctly)
<<<<<<< HEAD
>>>>>>> 982031ef44 (GEOMESA-3067 Find attribute in Filters with Functions with embedded expressions correctly)
<<<<<<< HEAD
>>>>>>> 00d66ae013 (GEOMESA-3067 Find attribute in Filters with Functions with embedded expressions correctly)
=======
=======
=======
=======
>>>>>>> 76618c8da (GEOMESA-3061 Converters - support bytes in Avro top-level union types (#2762))
=======
>>>>>>> 5d8dab9f81 (GEOMESA-3067 Find attribute in Filters with Functions with embedded expressions correctly)
>>>>>>> 947761ec9b (GEOMESA-3061 Converters - support bytes in Avro top-level union types (#2762))
<<<<<<< HEAD
>>>>>>> 0086b292ba (GEOMESA-3061 Converters - support bytes in Avro top-level union types (#2762))
<<<<<<< HEAD
>>>>>>> c2cfc968d2 (GEOMESA-3061 Converters - support bytes in Avro top-level union types (#2762))
=======
=======
=======
=======
>>>>>>> c3b0a1b6e (GEOMESA-3067 Find attribute in Filters with Functions with embedded expressions correctly)
=======
>>>>>>> 0fa73844a1 (GEOMESA-3061 Converters - support bytes in Avro top-level union types (#2762))
>>>>>>> 9813375fcc (GEOMESA-3067 Find attribute in Filters with Functions with embedded expressions correctly)
<<<<<<< HEAD
>>>>>>> cf57a2c189 (GEOMESA-3067 Find attribute in Filters with Functions with embedded expressions correctly)
<<<<<<< HEAD
>>>>>>> 5d8dab9f81 (GEOMESA-3067 Find attribute in Filters with Functions with embedded expressions correctly)
=======
=======
=======
=======
=======
>>>>>>> 67b361c85 (GEOMESA-3061 Converters - support bytes in Avro top-level union types (#2762))
>>>>>>> c8a325e13 (GEOMESA-3061 Converters - support bytes in Avro top-level union types (#2762))
=======
>>>>>>> 1ef95979ee (GEOMESA-3067 Find attribute in Filters with Functions with embedded expressions correctly)
>>>>>>> c9328eddce (GEOMESA-3061 Converters - support bytes in Avro top-level union types (#2762))
<<<<<<< HEAD
>>>>>>> e15d50d7d3 (GEOMESA-3061 Converters - support bytes in Avro top-level union types (#2762))
<<<<<<< HEAD
>>>>>>> 0fa73844a1 (GEOMESA-3061 Converters - support bytes in Avro top-level union types (#2762))
=======
=======
=======
=======
>>>>>>> 9638dc731 (GEOMESA-3067 Find attribute in Filters with Functions with embedded expressions correctly)
=======
>>>>>>> 63546aacdc (GEOMESA-3061 Converters - support bytes in Avro top-level union types (#2762))
>>>>>>> d2eec4be68 (GEOMESA-3067 Find attribute in Filters with Functions with embedded expressions correctly)
<<<<<<< HEAD
>>>>>>> bec3ba7d08 (GEOMESA-3067 Find attribute in Filters with Functions with embedded expressions correctly)
<<<<<<< HEAD
>>>>>>> 1ef95979ee (GEOMESA-3067 Find attribute in Filters with Functions with embedded expressions correctly)
=======
=======
=======
=======
=======
>>>>>>> b4320946b (GEOMESA-3061 Converters - support bytes in Avro top-level union types (#2762))
>>>>>>> 97ec7d864 (GEOMESA-3061 Converters - support bytes in Avro top-level union types (#2762))
=======
>>>>>>> 72b96c5c3e (GEOMESA-3067 Find attribute in Filters with Functions with embedded expressions correctly)
>>>>>>> d94c03a98e (GEOMESA-3061 Converters - support bytes in Avro top-level union types (#2762))
<<<<<<< HEAD
>>>>>>> 8de43cccf6 (GEOMESA-3061 Converters - support bytes in Avro top-level union types (#2762))
<<<<<<< HEAD
>>>>>>> 63546aacdc (GEOMESA-3061 Converters - support bytes in Avro top-level union types (#2762))
=======
=======
=======
=======
>>>>>>> 7bb5f26c3 (GEOMESA-3067 Find attribute in Filters with Functions with embedded expressions correctly)
=======
>>>>>>> 1ea8b10ac7 (GEOMESA-3061 Converters - support bytes in Avro top-level union types (#2762))
>>>>>>> e69b2aa6dc (GEOMESA-3067 Find attribute in Filters with Functions with embedded expressions correctly)
<<<<<<< HEAD
>>>>>>> b1a7408547 (GEOMESA-3067 Find attribute in Filters with Functions with embedded expressions correctly)
<<<<<<< HEAD
>>>>>>> 72b96c5c3e (GEOMESA-3067 Find attribute in Filters with Functions with embedded expressions correctly)
=======
=======
=======
=======
>>>>>>> 6d9a5b626 (GEOMESA-3061 Converters - support bytes in Avro top-level union types (#2762))
=======
>>>>>>> e72b998c12 (GEOMESA-3067 Find attribute in Filters with Functions with embedded expressions correctly)
>>>>>>> 67e4c1354f (GEOMESA-3061 Converters - support bytes in Avro top-level union types (#2762))
<<<<<<< HEAD
>>>>>>> 12e3a588fc (GEOMESA-3061 Converters - support bytes in Avro top-level union types (#2762))
<<<<<<< HEAD
>>>>>>> 1ea8b10ac7 (GEOMESA-3061 Converters - support bytes in Avro top-level union types (#2762))
=======
=======
=======
=======
=======
>>>>>>> f36b0e8b9 (GEOMESA-3067 Find attribute in Filters with Functions with embedded expressions correctly)
>>>>>>> e5ed68fdd (GEOMESA-3067 Find attribute in Filters with Functions with embedded expressions correctly)
=======
>>>>>>> b800c052cc (GEOMESA-3061 Converters - support bytes in Avro top-level union types (#2762))
>>>>>>> 060ac2189c (GEOMESA-3067 Find attribute in Filters with Functions with embedded expressions correctly)
<<<<<<< HEAD
>>>>>>> c8e013ff91 (GEOMESA-3067 Find attribute in Filters with Functions with embedded expressions correctly)
<<<<<<< HEAD
>>>>>>> e72b998c12 (GEOMESA-3067 Find attribute in Filters with Functions with embedded expressions correctly)
=======
=======
=======
=======
>>>>>>> e6e1f4bdd (GEOMESA-3061 Converters - support bytes in Avro top-level union types (#2762))
=======
>>>>>>> 8e70a881a6 (GEOMESA-3067 Find attribute in Filters with Functions with embedded expressions correctly)
>>>>>>> 8035cc5893 (GEOMESA-3061 Converters - support bytes in Avro top-level union types (#2762))
<<<<<<< HEAD
>>>>>>> 1890b11217 (GEOMESA-3061 Converters - support bytes in Avro top-level union types (#2762))
<<<<<<< HEAD
>>>>>>> b800c052cc (GEOMESA-3061 Converters - support bytes in Avro top-level union types (#2762))
=======
=======
=======
=======
=======
>>>>>>> e3a63fee1 (GEOMESA-3067 Find attribute in Filters with Functions with embedded expressions correctly)
>>>>>>> 7f922b040 (GEOMESA-3067 Find attribute in Filters with Functions with embedded expressions correctly)
=======
>>>>>>> 9dbe1503e8 (GEOMESA-3061 Converters - support bytes in Avro top-level union types (#2762))
>>>>>>> 04f08c23c5 (GEOMESA-3067 Find attribute in Filters with Functions with embedded expressions correctly)
<<<<<<< HEAD
>>>>>>> 912169b5e9 (GEOMESA-3067 Find attribute in Filters with Functions with embedded expressions correctly)
<<<<<<< HEAD
>>>>>>> 8e70a881a6 (GEOMESA-3067 Find attribute in Filters with Functions with embedded expressions correctly)
=======
=======
=======
=======
>>>>>>> a910ae135 (GEOMESA-3061 Converters - support bytes in Avro top-level union types (#2762))
=======
>>>>>>> 53bc726472 (GEOMESA-3067 Find attribute in Filters with Functions with embedded expressions correctly)
>>>>>>> 07161eaaa6 (GEOMESA-3061 Converters - support bytes in Avro top-level union types (#2762))
<<<<<<< HEAD
>>>>>>> 9c28193a91 (GEOMESA-3061 Converters - support bytes in Avro top-level union types (#2762))
<<<<<<< HEAD
>>>>>>> 9dbe1503e8 (GEOMESA-3061 Converters - support bytes in Avro top-level union types (#2762))
=======
=======
=======
=======
>>>>>>> 8fb060734 (GEOMESA-3067 Find attribute in Filters with Functions with embedded expressions correctly)
=======
>>>>>>> 6e30236dd2 (GEOMESA-3061 Converters - support bytes in Avro top-level union types (#2762))
>>>>>>> 38b3282770 (GEOMESA-3067 Find attribute in Filters with Functions with embedded expressions correctly)
<<<<<<< HEAD
>>>>>>> 1b60c2aeba (GEOMESA-3067 Find attribute in Filters with Functions with embedded expressions correctly)
<<<<<<< HEAD
>>>>>>> 53bc726472 (GEOMESA-3067 Find attribute in Filters with Functions with embedded expressions correctly)
=======
=======
=======
=======
=======
>>>>>>> 67b361c85 (GEOMESA-3061 Converters - support bytes in Avro top-level union types (#2762))
>>>>>>> ad3cedc4d (GEOMESA-3061 Converters - support bytes in Avro top-level union types (#2762))
=======
>>>>>>> 3261561062 (GEOMESA-3067 Find attribute in Filters with Functions with embedded expressions correctly)
>>>>>>> 9abc630fdf (GEOMESA-3061 Converters - support bytes in Avro top-level union types (#2762))
<<<<<<< HEAD
>>>>>>> d294ce49e2 (GEOMESA-3061 Converters - support bytes in Avro top-level union types (#2762))
<<<<<<< HEAD
>>>>>>> 6e30236dd2 (GEOMESA-3061 Converters - support bytes in Avro top-level union types (#2762))
=======
=======
=======
=======
>>>>>>> bc4913194 (GEOMESA-3067 Find attribute in Filters with Functions with embedded expressions correctly)
=======
>>>>>>> dbd932fed6 (GEOMESA-3061 Converters - support bytes in Avro top-level union types (#2762))
>>>>>>> 570899511d (GEOMESA-3067 Find attribute in Filters with Functions with embedded expressions correctly)
<<<<<<< HEAD
>>>>>>> ed45e8551f (GEOMESA-3067 Find attribute in Filters with Functions with embedded expressions correctly)
<<<<<<< HEAD
>>>>>>> 3261561062 (GEOMESA-3067 Find attribute in Filters with Functions with embedded expressions correctly)
=======
=======
=======
=======
=======
>>>>>>> b4320946b (GEOMESA-3061 Converters - support bytes in Avro top-level union types (#2762))
>>>>>>> bdbced26d (GEOMESA-3061 Converters - support bytes in Avro top-level union types (#2762))
>>>>>>> 25063957fc (GEOMESA-3061 Converters - support bytes in Avro top-level union types (#2762))
>>>>>>> 1df8328338 (GEOMESA-3061 Converters - support bytes in Avro top-level union types (#2762))
>>>>>>> dbd932fed6 (GEOMESA-3061 Converters - support bytes in Avro top-level union types (#2762))
=======
>>>>>>> 9293965a7d (GEOMESA-3061 Converters - support bytes in Avro top-level union types (#2762))
=======
>>>>>>> 67dc71ffb1 (GEOMESA-3067 Find attribute in Filters with Functions with embedded expressions correctly)
=======
>>>>>>> 058fd96baa (GEOMESA-3061 Converters - support bytes in Avro top-level union types (#2762))
=======
>>>>>>> f7fc21ae20 (GEOMESA-3067 Find attribute in Filters with Functions with embedded expressions correctly)
=======
>>>>>>> c22ecd64c3 (GEOMESA-3061 Converters - support bytes in Avro top-level union types (#2762))
=======
=======
>>>>>>> 125ffd0575 (GEOMESA-3067 Find attribute in Filters with Functions with embedded expressions correctly)
>>>>>>> 6e297b9b6f (GEOMESA-3067 Find attribute in Filters with Functions with embedded expressions correctly)
=======
>>>>>>> 2a887f75bf (GEOMESA-3061 Converters - support bytes in Avro top-level union types (#2762))
=======
>>>>>>> 08a743b61d (GEOMESA-3067 Find attribute in Filters with Functions with embedded expressions correctly)
=======
>>>>>>> b08cb4d818 (GEOMESA-3061 Converters - support bytes in Avro top-level union types (#2762))
=======
=======
>>>>>>> a1d28116d4 (GEOMESA-3067 Find attribute in Filters with Functions with embedded expressions correctly)
>>>>>>> a6693cb0ba (GEOMESA-3067 Find attribute in Filters with Functions with embedded expressions correctly)
=======
>>>>>>> 95e52e061e (GEOMESA-3061 Converters - support bytes in Avro top-level union types (#2762))
=======
=======
>>>>>>> a9884ff1f6 (GEOMESA-3067 Find attribute in Filters with Functions with embedded expressions correctly)
>>>>>>> 424e7de15a (GEOMESA-3067 Find attribute in Filters with Functions with embedded expressions correctly)
=======
>>>>>>> f7cef54062 (GEOMESA-3061 Converters - support bytes in Avro top-level union types (#2762))
>>>>>>> 988874c83e (GEOMESA-3061 Converters - support bytes in Avro top-level union types (#2762))
=======
>>>>>>> 67b361c856 (GEOMESA-3061 Converters - support bytes in Avro top-level union types (#2762))
<<<<<<< HEAD
>>>>>>> f7cef54062 (GEOMESA-3061 Converters - support bytes in Avro top-level union types (#2762))
=======
=======
>>>>>>> b4320946b4 (GEOMESA-3061 Converters - support bytes in Avro top-level union types (#2762))
<<<<<<< HEAD
>>>>>>> a16b64a4d1 (GEOMESA-3061 Converters - support bytes in Avro top-level union types (#2762))
<<<<<<< HEAD
>>>>>>> aea9fbe131 (GEOMESA-3061 Converters - support bytes in Avro top-level union types (#2762))
=======
=======
=======
>>>>>>> d9ed077cd1 (GEOMESA-3061 Converters - support bytes in Avro top-level union types (#2762))
<<<<<<< HEAD
>>>>>>> 810876750d (GEOMESA-3061 Converters - support bytes in Avro top-level union types (#2762))
<<<<<<< HEAD
>>>>>>> 5a55bf9756 (GEOMESA-3061 Converters - support bytes in Avro top-level union types (#2762))
=======
=======
=======
=======
>>>>>>> f36b0e8b9 (GEOMESA-3067 Find attribute in Filters with Functions with embedded expressions correctly)
>>>>>>> e182e6e99c (GEOMESA-3067 Find attribute in Filters with Functions with embedded expressions correctly)
>>>>>>> 2571e49519 (GEOMESA-3067 Find attribute in Filters with Functions with embedded expressions correctly)
<<<<<<< HEAD
>>>>>>> adfec3a47a (GEOMESA-3067 Find attribute in Filters with Functions with embedded expressions correctly)
=======
=======
>>>>>>> d206a68a13 (GEOMESA-3061 Converters - support bytes in Avro top-level union types (#2762))
<<<<<<< HEAD
>>>>>>> e0c2527549 (GEOMESA-3061 Converters - support bytes in Avro top-level union types (#2762))
=======
=======
=======
=======
>>>>>>> e3a63fee1 (GEOMESA-3067 Find attribute in Filters with Functions with embedded expressions correctly)
<<<<<<< HEAD
>>>>>>> 3333975e77 (GEOMESA-3067 Find attribute in Filters with Functions with embedded expressions correctly)
<<<<<<< HEAD
>>>>>>> 9412e85b59 (GEOMESA-3067 Find attribute in Filters with Functions with embedded expressions correctly)
<<<<<<< HEAD
>>>>>>> 4cf1d8d259 (GEOMESA-3067 Find attribute in Filters with Functions with embedded expressions correctly)
=======
=======
=======
=======
>>>>>>> 0e68e9f4c (GEOMESA-3061 Converters - support bytes in Avro top-level union types (#2762))
>>>>>>> 76618c8da3 (GEOMESA-3061 Converters - support bytes in Avro top-level union types (#2762))
>>>>>>> 694bcd3776 (GEOMESA-3061 Converters - support bytes in Avro top-level union types (#2762))
<<<<<<< HEAD
>>>>>>> cb5e2daf2b (GEOMESA-3061 Converters - support bytes in Avro top-level union types (#2762))
=======
=======
>>>>>>> 76618c8da3 (GEOMESA-3061 Converters - support bytes in Avro top-level union types (#2762))
=======
=======
=======
>>>>>>> f36b0e8b9 (GEOMESA-3067 Find attribute in Filters with Functions with embedded expressions correctly)
>>>>>>> a63cb7e74 (GEOMESA-3067 Find attribute in Filters with Functions with embedded expressions correctly)
<<<<<<< HEAD
>>>>>>> c3b0a1b6e3 (GEOMESA-3067 Find attribute in Filters with Functions with embedded expressions correctly)
<<<<<<< HEAD
>>>>>>> 24c4df93a5 (GEOMESA-3067 Find attribute in Filters with Functions with embedded expressions correctly)
<<<<<<< HEAD
>>>>>>> 9bcad1eb67 (GEOMESA-3067 Find attribute in Filters with Functions with embedded expressions correctly)
=======
=======
=======
=======
>>>>>>> 67b361c85 (GEOMESA-3061 Converters - support bytes in Avro top-level union types (#2762))
<<<<<<< HEAD
>>>>>>> c8a325e13c (GEOMESA-3061 Converters - support bytes in Avro top-level union types (#2762))
<<<<<<< HEAD
>>>>>>> 6cd1151639 (GEOMESA-3061 Converters - support bytes in Avro top-level union types (#2762))
<<<<<<< HEAD
>>>>>>> 00e61f4b70 (GEOMESA-3061 Converters - support bytes in Avro top-level union types (#2762))
=======
=======
=======
=======
>>>>>>> 908ad4071 (GEOMESA-3067 Find attribute in Filters with Functions with embedded expressions correctly)
=======
>>>>>>> 4864cfc581 (GEOMESA-3061 Converters - support bytes in Avro top-level union types (#2762))
>>>>>>> 9638dc731e (GEOMESA-3067 Find attribute in Filters with Functions with embedded expressions correctly)
<<<<<<< HEAD
>>>>>>> 1e00950a90 (GEOMESA-3067 Find attribute in Filters with Functions with embedded expressions correctly)
<<<<<<< HEAD
>>>>>>> 9a4568fbda (GEOMESA-3067 Find attribute in Filters with Functions with embedded expressions correctly)
=======
=======
=======
=======
>>>>>>> b4320946b (GEOMESA-3061 Converters - support bytes in Avro top-level union types (#2762))
>>>>>>> 97ec7d864a (GEOMESA-3061 Converters - support bytes in Avro top-level union types (#2762))
>>>>>>> 1973f72e77 (GEOMESA-3061 Converters - support bytes in Avro top-level union types (#2762))
>>>>>>> 4864cfc581 (GEOMESA-3061 Converters - support bytes in Avro top-level union types (#2762))
=======
>>>>>>> 96d5d442fa (GEOMESA-3061 Converters - support bytes in Avro top-level union types (#2762))
>>>>>>> 3676d4e56a (GEOMESA-3061 Converters - support bytes in Avro top-level union types (#2762))
=======
>>>>>>> b3dd8ec805 (GEOMESA-3067 Find attribute in Filters with Functions with embedded expressions correctly)
>>>>>>> e8ce815f1b (GEOMESA-3067 Find attribute in Filters with Functions with embedded expressions correctly)
=======
>>>>>>> e6e1f4bdd5 (GEOMESA-3061 Converters - support bytes in Avro top-level union types (#2762))
>>>>>>> 5dcf23da52 (GEOMESA-3061 Converters - support bytes in Avro top-level union types (#2762))
>>>>>>> 60b4637548 (GEOMESA-3061 Converters - support bytes in Avro top-level union types (#2762))
=======
>>>>>>> 6f81d40992 (GEOMESA-3067 Find attribute in Filters with Functions with embedded expressions correctly)
=======
=======
>>>>>>> 92674ff9d4 (GEOMESA-3061 Converters - support bytes in Avro top-level union types (#2762))
>>>>>>> 009a284072 (GEOMESA-3061 Converters - support bytes in Avro top-level union types (#2762))
=======
>>>>>>> 9df4f8a9f6 (GEOMESA-3067 Find attribute in Filters with Functions with embedded expressions correctly)
=======
=======
>>>>>>> 9a4dff9e4f (GEOMESA-3061 Converters - support bytes in Avro top-level union types (#2762))
>>>>>>> 7b8c8dcc3d (GEOMESA-3061 Converters - support bytes in Avro top-level union types (#2762))
=======
>>>>>>> 79cd5cb606 (GEOMESA-3067 Find attribute in Filters with Functions with embedded expressions correctly)
=======
=======
>>>>>>> 0fc6650ecf (GEOMESA-3061 Converters - support bytes in Avro top-level union types (#2762))
>>>>>>> c029a43a6c (GEOMESA-3061 Converters - support bytes in Avro top-level union types (#2762))
=======
=======
>>>>>>> 4f51687745 (GEOMESA-3061 Converters - support bytes in Avro top-level union types (#2762))
>>>>>>> 0dbede148d (GEOMESA-3061 Converters - support bytes in Avro top-level union types (#2762))
<<<<<<< HEAD
>>>>>>> 1bb69524c2 (GEOMESA-3061 Converters - support bytes in Avro top-level union types (#2762))
<<<<<<< HEAD
>>>>>>> a5b0374ee2 (GEOMESA-3061 Converters - support bytes in Avro top-level union types (#2762))
=======
=======
=======
=======
>>>>>>> 240977229 (GEOMESA-3061 Converters - support bytes in Avro top-level union types (#2762))
>>>>>>> 22dcc8170f (GEOMESA-3061 Converters - support bytes in Avro top-level union types (#2762))
>>>>>>> 8c9ca1211a (GEOMESA-3061 Converters - support bytes in Avro top-level union types (#2762))
>>>>>>> 4f51687745 (GEOMESA-3061 Converters - support bytes in Avro top-level union types (#2762))
=======
>>>>>>> 9a2d40c613 (GEOMESA-3061 Converters - support bytes in Avro top-level union types (#2762))
=======
=======
>>>>>>> 238945d4b3 (GEOMESA-3061 Converters - support bytes in Avro top-level union types (#2762))
>>>>>>> 1cad375176 (GEOMESA-3061 Converters - support bytes in Avro top-level union types (#2762))
>>>>>>> 73770612e0 (GEOMESA-3061 Converters - support bytes in Avro top-level union types (#2762))
=======
>>>>>>> 6c83981af3 (GEOMESA-3061 Converters - support bytes in Avro top-level union types (#2762))
        Result.foreach(1 to 10) { j =>
=======
        Result.foreach(1 to 10){ j =>
>>>>>>> 7acc3ea46 (GEOMESA-3067 Find attribute in Filters with Functions with embedded expressions correctly)
<<<<<<< HEAD
<<<<<<< HEAD
<<<<<<< HEAD
<<<<<<< HEAD
<<<<<<< HEAD
<<<<<<< HEAD
<<<<<<< HEAD
<<<<<<< HEAD
<<<<<<< HEAD
<<<<<<< HEAD
<<<<<<< HEAD
<<<<<<< HEAD
<<<<<<< HEAD
<<<<<<< HEAD
<<<<<<< HEAD
<<<<<<< HEAD
<<<<<<< HEAD
<<<<<<< HEAD
<<<<<<< HEAD
<<<<<<< HEAD
<<<<<<< HEAD
<<<<<<< HEAD
<<<<<<< HEAD
<<<<<<< HEAD
<<<<<<< HEAD
<<<<<<< HEAD
<<<<<<< HEAD
<<<<<<< HEAD
<<<<<<< HEAD
<<<<<<< HEAD
<<<<<<< HEAD
<<<<<<< HEAD
<<<<<<< HEAD
<<<<<<< HEAD
<<<<<<< HEAD
<<<<<<< HEAD
<<<<<<< HEAD
<<<<<<< HEAD
<<<<<<< HEAD
<<<<<<< HEAD
<<<<<<< HEAD
<<<<<<< HEAD
<<<<<<< HEAD
<<<<<<< HEAD
<<<<<<< HEAD
<<<<<<< HEAD
<<<<<<< HEAD
<<<<<<< HEAD
<<<<<<< HEAD
<<<<<<< HEAD
<<<<<<< HEAD
<<<<<<< HEAD
<<<<<<< HEAD
<<<<<<< HEAD
<<<<<<< HEAD
<<<<<<< HEAD
<<<<<<< HEAD
<<<<<<< HEAD
<<<<<<< HEAD
<<<<<<< HEAD
<<<<<<< HEAD
<<<<<<< HEAD
<<<<<<< HEAD
<<<<<<< HEAD
<<<<<<< HEAD
<<<<<<< HEAD
<<<<<<< HEAD
<<<<<<< HEAD
<<<<<<< HEAD
<<<<<<< HEAD
<<<<<<< HEAD
<<<<<<< HEAD
<<<<<<< HEAD
<<<<<<< HEAD
<<<<<<< HEAD
<<<<<<< HEAD
<<<<<<< HEAD
<<<<<<< HEAD
<<<<<<< HEAD
<<<<<<< HEAD
<<<<<<< HEAD
<<<<<<< HEAD
<<<<<<< HEAD
<<<<<<< HEAD
<<<<<<< HEAD
<<<<<<< HEAD
<<<<<<< HEAD
<<<<<<< HEAD
<<<<<<< HEAD
<<<<<<< HEAD
<<<<<<< HEAD
<<<<<<< HEAD
<<<<<<< HEAD
<<<<<<< HEAD
<<<<<<< HEAD
<<<<<<< HEAD
<<<<<<< HEAD
<<<<<<< HEAD
<<<<<<< HEAD
<<<<<<< HEAD
<<<<<<< HEAD
<<<<<<< HEAD
<<<<<<< HEAD
<<<<<<< HEAD
<<<<<<< HEAD
<<<<<<< HEAD
<<<<<<< HEAD
<<<<<<< HEAD
<<<<<<< HEAD
<<<<<<< HEAD
<<<<<<< HEAD
<<<<<<< HEAD
<<<<<<< HEAD
<<<<<<< HEAD
<<<<<<< HEAD
<<<<<<< HEAD
<<<<<<< HEAD
<<<<<<< HEAD
<<<<<<< HEAD
<<<<<<< HEAD
<<<<<<< HEAD
<<<<<<< HEAD
<<<<<<< HEAD
<<<<<<< HEAD
<<<<<<< HEAD
<<<<<<< HEAD
<<<<<<< HEAD
<<<<<<< HEAD
<<<<<<< HEAD
<<<<<<< HEAD
<<<<<<< HEAD
<<<<<<< HEAD
<<<<<<< HEAD
<<<<<<< HEAD
<<<<<<< HEAD
<<<<<<< HEAD
<<<<<<< HEAD
<<<<<<< HEAD
<<<<<<< HEAD
<<<<<<< HEAD
<<<<<<< HEAD
<<<<<<< HEAD
<<<<<<< HEAD
<<<<<<< HEAD
<<<<<<< HEAD
<<<<<<< HEAD
<<<<<<< HEAD
<<<<<<< HEAD
<<<<<<< HEAD
<<<<<<< HEAD
<<<<<<< HEAD
<<<<<<< HEAD
<<<<<<< HEAD
<<<<<<< HEAD
<<<<<<< HEAD
<<<<<<< HEAD
<<<<<<< HEAD
<<<<<<< HEAD
<<<<<<< HEAD
<<<<<<< HEAD
<<<<<<< HEAD
<<<<<<< HEAD
<<<<<<< HEAD
<<<<<<< HEAD
<<<<<<< HEAD
<<<<<<< HEAD
<<<<<<< HEAD
<<<<<<< HEAD
<<<<<<< HEAD
<<<<<<< HEAD
<<<<<<< HEAD
<<<<<<< HEAD
<<<<<<< HEAD
<<<<<<< HEAD
<<<<<<< HEAD
<<<<<<< HEAD
<<<<<<< HEAD
<<<<<<< HEAD
<<<<<<< HEAD
<<<<<<< HEAD
<<<<<<< HEAD
<<<<<<< HEAD
<<<<<<< HEAD
<<<<<<< HEAD
<<<<<<< HEAD
<<<<<<< HEAD
<<<<<<< HEAD
<<<<<<< HEAD
<<<<<<< HEAD
<<<<<<< HEAD
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
>>>>>>> 988874c83e (GEOMESA-3061 Converters - support bytes in Avro top-level union types (#2762))
=======
>>>>>>> aea9fbe131 (GEOMESA-3061 Converters - support bytes in Avro top-level union types (#2762))
=======
>>>>>>> 5a55bf9756 (GEOMESA-3061 Converters - support bytes in Avro top-level union types (#2762))
=======
>>>>>>> adfec3a47a (GEOMESA-3067 Find attribute in Filters with Functions with embedded expressions correctly)
=======
>>>>>>> e0c2527549 (GEOMESA-3061 Converters - support bytes in Avro top-level union types (#2762))
=======
>>>>>>> 4cf1d8d259 (GEOMESA-3067 Find attribute in Filters with Functions with embedded expressions correctly)
=======
>>>>>>> cb5e2daf2b (GEOMESA-3061 Converters - support bytes in Avro top-level union types (#2762))
=======
>>>>>>> 9bcad1eb67 (GEOMESA-3067 Find attribute in Filters with Functions with embedded expressions correctly)
=======
>>>>>>> 00e61f4b70 (GEOMESA-3061 Converters - support bytes in Avro top-level union types (#2762))
=======
>>>>>>> 9a4568fbda (GEOMESA-3067 Find attribute in Filters with Functions with embedded expressions correctly)
=======
>>>>>>> 4864cfc581 (GEOMESA-3061 Converters - support bytes in Avro top-level union types (#2762))
=======
>>>>>>> 3676d4e56a (GEOMESA-3061 Converters - support bytes in Avro top-level union types (#2762))
=======
>>>>>>> e8ce815f1b (GEOMESA-3067 Find attribute in Filters with Functions with embedded expressions correctly)
=======
>>>>>>> 60b4637548 (GEOMESA-3061 Converters - support bytes in Avro top-level union types (#2762))
=======
>>>>>>> 6f81d40992 (GEOMESA-3067 Find attribute in Filters with Functions with embedded expressions correctly)
=======
>>>>>>> 009a284072 (GEOMESA-3061 Converters - support bytes in Avro top-level union types (#2762))
=======
>>>>>>> 9df4f8a9f6 (GEOMESA-3067 Find attribute in Filters with Functions with embedded expressions correctly)
=======
>>>>>>> 7b8c8dcc3d (GEOMESA-3061 Converters - support bytes in Avro top-level union types (#2762))
=======
>>>>>>> 79cd5cb606 (GEOMESA-3067 Find attribute in Filters with Functions with embedded expressions correctly)
=======
>>>>>>> c029a43a6c (GEOMESA-3061 Converters - support bytes in Avro top-level union types (#2762))
=======
>>>>>>> a5b0374ee2 (GEOMESA-3061 Converters - support bytes in Avro top-level union types (#2762))
=======
>>>>>>> 4f51687745 (GEOMESA-3061 Converters - support bytes in Avro top-level union types (#2762))
=======
>>>>>>> 9a2d40c613 (GEOMESA-3061 Converters - support bytes in Avro top-level union types (#2762))
=======
>>>>>>> 73770612e0 (GEOMESA-3061 Converters - support bytes in Avro top-level union types (#2762))
=======
>>>>>>> 6c83981af3 (GEOMESA-3061 Converters - support bytes in Avro top-level union types (#2762))
=======
>>>>>>> a9884ff1f6 (GEOMESA-3067 Find attribute in Filters with Functions with embedded expressions correctly)
=======
>>>>>>> f7cef54062 (GEOMESA-3061 Converters - support bytes in Avro top-level union types (#2762))
<<<<<<< HEAD
<<<<<<< HEAD
=======
>>>>>>> a16b64a4d1 (GEOMESA-3061 Converters - support bytes in Avro top-level union types (#2762))
=======
>>>>>>> 810876750d (GEOMESA-3061 Converters - support bytes in Avro top-level union types (#2762))
<<<<<<< HEAD
<<<<<<< HEAD
=======
>>>>>>> 2571e49519 (GEOMESA-3067 Find attribute in Filters with Functions with embedded expressions correctly)
=======
>>>>>>> d206a68a13 (GEOMESA-3061 Converters - support bytes in Avro top-level union types (#2762))
<<<<<<< HEAD
<<<<<<< HEAD
=======
>>>>>>> 9412e85b59 (GEOMESA-3067 Find attribute in Filters with Functions with embedded expressions correctly)
=======
>>>>>>> 694bcd3776 (GEOMESA-3061 Converters - support bytes in Avro top-level union types (#2762))
<<<<<<< HEAD
<<<<<<< HEAD
=======
>>>>>>> 24c4df93a5 (GEOMESA-3067 Find attribute in Filters with Functions with embedded expressions correctly)
=======
>>>>>>> 6cd1151639 (GEOMESA-3061 Converters - support bytes in Avro top-level union types (#2762))
<<<<<<< HEAD
<<<<<<< HEAD
=======
>>>>>>> 1e00950a90 (GEOMESA-3067 Find attribute in Filters with Functions with embedded expressions correctly)
=======
>>>>>>> 1973f72e77 (GEOMESA-3061 Converters - support bytes in Avro top-level union types (#2762))
<<<<<<< HEAD
<<<<<<< HEAD
=======
>>>>>>> 96d5d442fa (GEOMESA-3061 Converters - support bytes in Avro top-level union types (#2762))
=======
>>>>>>> b3dd8ec805 (GEOMESA-3067 Find attribute in Filters with Functions with embedded expressions correctly)
<<<<<<< HEAD
<<<<<<< HEAD
=======
>>>>>>> 5dcf23da52 (GEOMESA-3061 Converters - support bytes in Avro top-level union types (#2762))
=======
>>>>>>> 2b62d1f3fe (GEOMESA-3067 Find attribute in Filters with Functions with embedded expressions correctly)
<<<<<<< HEAD
<<<<<<< HEAD
=======
>>>>>>> 92674ff9d4 (GEOMESA-3061 Converters - support bytes in Avro top-level union types (#2762))
=======
>>>>>>> c169cb2905 (GEOMESA-3067 Find attribute in Filters with Functions with embedded expressions correctly)
<<<<<<< HEAD
<<<<<<< HEAD
=======
>>>>>>> 9a4dff9e4f (GEOMESA-3061 Converters - support bytes in Avro top-level union types (#2762))
=======
>>>>>>> 63ca73533e (GEOMESA-3067 Find attribute in Filters with Functions with embedded expressions correctly)
<<<<<<< HEAD
<<<<<<< HEAD
=======
>>>>>>> 0fc6650ecf (GEOMESA-3061 Converters - support bytes in Avro top-level union types (#2762))
=======
>>>>>>> 1bb69524c2 (GEOMESA-3061 Converters - support bytes in Avro top-level union types (#2762))
<<<<<<< HEAD
<<<<<<< HEAD
=======
>>>>>>> 8c9ca1211a (GEOMESA-3061 Converters - support bytes in Avro top-level union types (#2762))
=======
>>>>>>> a22efb4d66 (GEOMESA-3061 Converters - support bytes in Avro top-level union types (#2762))
<<<<<<< HEAD
<<<<<<< HEAD
=======
>>>>>>> 1cad375176 (GEOMESA-3061 Converters - support bytes in Avro top-level union types (#2762))
=======
>>>>>>> 1e39c0c27d (GEOMESA-3061 Converters - support bytes in Avro top-level union types (#2762))
<<<<<<< HEAD
=======
>>>>>>> a990cf104e (GEOMESA-3067 Find attribute in Filters with Functions with embedded expressions correctly)
=======
>>>>>>> a1f15598cb (GEOMESA-3061 Converters - support bytes in Avro top-level union types (#2762))
=======
>>>>>>> 4373c901b3 (GEOMESA-3067 Find attribute in Filters with Functions with embedded expressions correctly)
=======
>>>>>>> 963feec660 (GEOMESA-3061 Converters - support bytes in Avro top-level union types (#2762))
=======
>>>>>>> 2c14568a23 (GEOMESA-3067 Find attribute in Filters with Functions with embedded expressions correctly)
=======
>>>>>>> 84ac051f28 (GEOMESA-3061 Converters - support bytes in Avro top-level union types (#2762))
=======
>>>>>>> 99acaa0887 (GEOMESA-3067 Find attribute in Filters with Functions with embedded expressions correctly)
=======
>>>>>>> fe3de10f11 (GEOMESA-3061 Converters - support bytes in Avro top-level union types (#2762))
=======
>>>>>>> 21deff19fd (GEOMESA-3067 Find attribute in Filters with Functions with embedded expressions correctly)
=======
>>>>>>> d0785cf307 (GEOMESA-3061 Converters - support bytes in Avro top-level union types (#2762))
=======
>>>>>>> 53900605ca (GEOMESA-3067 Find attribute in Filters with Functions with embedded expressions correctly)
=======
>>>>>>> a52e4429be (GEOMESA-3061 Converters - support bytes in Avro top-level union types (#2762))
=======
>>>>>>> 5f01e2c4fc (GEOMESA-3067 Find attribute in Filters with Functions with embedded expressions correctly)
=======
>>>>>>> 5c6b9f1f8b (GEOMESA-3061 Converters - support bytes in Avro top-level union types (#2762))
=======
>>>>>>> 511bd92a86 (GEOMESA-3067 Find attribute in Filters with Functions with embedded expressions correctly)
=======
>>>>>>> 9d44ff473d (GEOMESA-3061 Converters - support bytes in Avro top-level union types (#2762))
=======
>>>>>>> bff2bdde04 (GEOMESA-3067 Find attribute in Filters with Functions with embedded expressions correctly)
=======
>>>>>>> a35efac12e (GEOMESA-3061 Converters - support bytes in Avro top-level union types (#2762))
=======
>>>>>>> 323528580f (GEOMESA-3067 Find attribute in Filters with Functions with embedded expressions correctly)
=======
>>>>>>> fd5565dfba (GEOMESA-3061 Converters - support bytes in Avro top-level union types (#2762))
=======
>>>>>>> 0104fb37e4 (GEOMESA-3061 Converters - support bytes in Avro top-level union types (#2762))
=======
>>>>>>> 530b057384 (GEOMESA-3067 Find attribute in Filters with Functions with embedded expressions correctly)
=======
>>>>>>> 2654d9c120 (GEOMESA-3061 Converters - support bytes in Avro top-level union types (#2762))
=======
>>>>>>> de7d6ef448 (GEOMESA-3067 Find attribute in Filters with Functions with embedded expressions correctly)
=======
>>>>>>> f110463a26 (GEOMESA-3061 Converters - support bytes in Avro top-level union types (#2762))
=======
>>>>>>> d83561962d (GEOMESA-3067 Find attribute in Filters with Functions with embedded expressions correctly)
=======
>>>>>>> 86ec77f9cb (GEOMESA-3061 Converters - support bytes in Avro top-level union types (#2762))
=======
>>>>>>> 17883cb601 (GEOMESA-3067 Find attribute in Filters with Functions with embedded expressions correctly)
=======
>>>>>>> 1bcc513539 (GEOMESA-3061 Converters - support bytes in Avro top-level union types (#2762))
=======
>>>>>>> 7bff4d0018 (GEOMESA-3061 Converters - support bytes in Avro top-level union types (#2762))
=======
>>>>>>> 657a38673a (GEOMESA-3067 Find attribute in Filters with Functions with embedded expressions correctly)
=======
>>>>>>> e8b736ee96 (GEOMESA-3061 Converters - support bytes in Avro top-level union types (#2762))
=======
>>>>>>> 0efbfe547e (GEOMESA-3061 Converters - support bytes in Avro top-level union types (#2762))
=======
>>>>>>> d498bef1ce (GEOMESA-3061 Converters - support bytes in Avro top-level union types (#2762))
=======
>>>>>>> cd4422a10c (GEOMESA-3067 Find attribute in Filters with Functions with embedded expressions correctly)
=======
>>>>>>> a5b160f47b (GEOMESA-3061 Converters - support bytes in Avro top-level union types (#2762))
=======
>>>>>>> fa429c7863 (GEOMESA-3067 Find attribute in Filters with Functions with embedded expressions correctly)
=======
>>>>>>> 5cf31d21f3 (GEOMESA-3061 Converters - support bytes in Avro top-level union types (#2762))
=======
>>>>>>> def2794bb5 (GEOMESA-3067 Find attribute in Filters with Functions with embedded expressions correctly)
=======
>>>>>>> 94fecee1d8 (GEOMESA-3061 Converters - support bytes in Avro top-level union types (#2762))
=======
>>>>>>> f8d3d445c0 (GEOMESA-3067 Find attribute in Filters with Functions with embedded expressions correctly)
=======
>>>>>>> 4599715c51 (d)
=======
>>>>>>> 7fbbd56493 (GEOMESA-3061 Converters - support bytes in Avro top-level union types (#2762))
=======
>>>>>>> e582c3ecfe (GEOMESA-3067 Find attribute in Filters with Functions with embedded expressions correctly)
=======
>>>>>>> 3eb12f79a9 (GEOMESA-3061 Converters - support bytes in Avro top-level union types (#2762))
=======
>>>>>>> 8b16ac5c65 (GEOMESA-3067 Find attribute in Filters with Functions with embedded expressions correctly)
=======
>>>>>>> 4ccd6f6b1f (GEOMESA-3061 Converters - support bytes in Avro top-level union types (#2762))
=======
>>>>>>> f983ea29f0 (GEOMESA-3067 Find attribute in Filters with Functions with embedded expressions correctly)
=======
>>>>>>> 35b69b8f2f (GEOMESA-3061 Converters - support bytes in Avro top-level union types (#2762))
=======
>>>>>>> da4e2905b4 (GEOMESA-3067 Find attribute in Filters with Functions with embedded expressions correctly)
=======
>>>>>>> db8a3a22b2 (GEOMESA-3061 Converters - support bytes in Avro top-level union types (#2762))
=======
>>>>>>> 27afb28ab6 (GEOMESA-3061 Converters - support bytes in Avro top-level union types (#2762))
=======
>>>>>>> 26a09ee6c2 (GEOMESA-3061 Converters - support bytes in Avro top-level union types (#2762))
=======
>>>>>>> 194ad4e5c0 (GEOMESA-3061 Converters - support bytes in Avro top-level union types (#2762))
=======
>>>>>>> 7b3c90c53f (GEOMESA-3061 Converters - support bytes in Avro top-level union types (#2762))
=======
>>>>>>> db9dfb6f14 (GEOMESA-3061 Converters - support bytes in Avro top-level union types (#2762))
=======
>>>>>>> f33d55e2ba (GEOMESA-3067 Find attribute in Filters with Functions with embedded expressions correctly)
=======
>>>>>>> b8ebbf6083 (GEOMESA-3061 Converters - support bytes in Avro top-level union types (#2762))
=======
>>>>>>> 1278241911 (GEOMESA-3067 Find attribute in Filters with Functions with embedded expressions correctly)
=======
>>>>>>> 3e7fb62639 (GEOMESA-3061 Converters - support bytes in Avro top-level union types (#2762))
=======
>>>>>>> 00d66ae013 (GEOMESA-3067 Find attribute in Filters with Functions with embedded expressions correctly)
=======
>>>>>>> c2cfc968d2 (GEOMESA-3061 Converters - support bytes in Avro top-level union types (#2762))
=======
>>>>>>> 5d8dab9f81 (GEOMESA-3067 Find attribute in Filters with Functions with embedded expressions correctly)
=======
>>>>>>> 0fa73844a1 (GEOMESA-3061 Converters - support bytes in Avro top-level union types (#2762))
=======
>>>>>>> 1ef95979ee (GEOMESA-3067 Find attribute in Filters with Functions with embedded expressions correctly)
=======
>>>>>>> 63546aacdc (GEOMESA-3061 Converters - support bytes in Avro top-level union types (#2762))
=======
>>>>>>> 72b96c5c3e (GEOMESA-3067 Find attribute in Filters with Functions with embedded expressions correctly)
=======
>>>>>>> 1ea8b10ac7 (GEOMESA-3061 Converters - support bytes in Avro top-level union types (#2762))
=======
>>>>>>> e72b998c12 (GEOMESA-3067 Find attribute in Filters with Functions with embedded expressions correctly)
=======
>>>>>>> b800c052cc (GEOMESA-3061 Converters - support bytes in Avro top-level union types (#2762))
=======
>>>>>>> 8e70a881a6 (GEOMESA-3067 Find attribute in Filters with Functions with embedded expressions correctly)
=======
>>>>>>> 9dbe1503e8 (GEOMESA-3061 Converters - support bytes in Avro top-level union types (#2762))
=======
>>>>>>> 53bc726472 (GEOMESA-3067 Find attribute in Filters with Functions with embedded expressions correctly)
=======
>>>>>>> 6e30236dd2 (GEOMESA-3061 Converters - support bytes in Avro top-level union types (#2762))
=======
>>>>>>> 3261561062 (GEOMESA-3067 Find attribute in Filters with Functions with embedded expressions correctly)
=======
>>>>>>> dbd932fed6 (GEOMESA-3061 Converters - support bytes in Avro top-level union types (#2762))
=======
>>>>>>> 9293965a7d (GEOMESA-3061 Converters - support bytes in Avro top-level union types (#2762))
=======
>>>>>>> 67dc71ffb1 (GEOMESA-3067 Find attribute in Filters with Functions with embedded expressions correctly)
=======
>>>>>>> 058fd96baa (GEOMESA-3061 Converters - support bytes in Avro top-level union types (#2762))
=======
>>>>>>> f7fc21ae20 (GEOMESA-3067 Find attribute in Filters with Functions with embedded expressions correctly)
=======
>>>>>>> c22ecd64c3 (GEOMESA-3061 Converters - support bytes in Avro top-level union types (#2762))
=======
>>>>>>> 6e297b9b6f (GEOMESA-3067 Find attribute in Filters with Functions with embedded expressions correctly)
=======
>>>>>>> 2a887f75bf (GEOMESA-3061 Converters - support bytes in Avro top-level union types (#2762))
=======
>>>>>>> 08a743b61d (GEOMESA-3067 Find attribute in Filters with Functions with embedded expressions correctly)
=======
>>>>>>> b08cb4d818 (GEOMESA-3061 Converters - support bytes in Avro top-level union types (#2762))
=======
>>>>>>> a6693cb0ba (GEOMESA-3067 Find attribute in Filters with Functions with embedded expressions correctly)
=======
>>>>>>> 95e52e061e (GEOMESA-3061 Converters - support bytes in Avro top-level union types (#2762))
=======
=======
>>>>>>> a9884ff1f6 (GEOMESA-3067 Find attribute in Filters with Functions with embedded expressions correctly)
>>>>>>> 424e7de15a (GEOMESA-3067 Find attribute in Filters with Functions with embedded expressions correctly)
=======
>>>>>>> 988874c83e (GEOMESA-3061 Converters - support bytes in Avro top-level union types (#2762))
=======
=======
>>>>>>> a16b64a4d1 (GEOMESA-3061 Converters - support bytes in Avro top-level union types (#2762))
>>>>>>> aea9fbe131 (GEOMESA-3061 Converters - support bytes in Avro top-level union types (#2762))
=======
>>>>>>> 5a55bf9756 (GEOMESA-3061 Converters - support bytes in Avro top-level union types (#2762))
=======
=======
>>>>>>> 2571e49519 (GEOMESA-3067 Find attribute in Filters with Functions with embedded expressions correctly)
>>>>>>> adfec3a47a (GEOMESA-3067 Find attribute in Filters with Functions with embedded expressions correctly)
=======
>>>>>>> e0c2527549 (GEOMESA-3061 Converters - support bytes in Avro top-level union types (#2762))
=======
=======
>>>>>>> 9412e85b59 (GEOMESA-3067 Find attribute in Filters with Functions with embedded expressions correctly)
>>>>>>> 4cf1d8d259 (GEOMESA-3067 Find attribute in Filters with Functions with embedded expressions correctly)
=======
>>>>>>> cb5e2daf2b (GEOMESA-3061 Converters - support bytes in Avro top-level union types (#2762))
=======
=======
>>>>>>> 24c4df93a5 (GEOMESA-3067 Find attribute in Filters with Functions with embedded expressions correctly)
>>>>>>> 9bcad1eb67 (GEOMESA-3067 Find attribute in Filters with Functions with embedded expressions correctly)
=======
>>>>>>> 00e61f4b70 (GEOMESA-3061 Converters - support bytes in Avro top-level union types (#2762))
=======
=======
>>>>>>> 1e00950a90 (GEOMESA-3067 Find attribute in Filters with Functions with embedded expressions correctly)
>>>>>>> 9a4568fbda (GEOMESA-3067 Find attribute in Filters with Functions with embedded expressions correctly)
=======
>>>>>>> 4864cfc581 (GEOMESA-3061 Converters - support bytes in Avro top-level union types (#2762))
=======
=======
>>>>>>> 96d5d442fa (GEOMESA-3061 Converters - support bytes in Avro top-level union types (#2762))
>>>>>>> 3676d4e56a (GEOMESA-3061 Converters - support bytes in Avro top-level union types (#2762))
=======
>>>>>>> e8ce815f1b (GEOMESA-3067 Find attribute in Filters with Functions with embedded expressions correctly)
=======
=======
>>>>>>> 5dcf23da52 (GEOMESA-3061 Converters - support bytes in Avro top-level union types (#2762))
>>>>>>> 60b4637548 (GEOMESA-3061 Converters - support bytes in Avro top-level union types (#2762))
=======
>>>>>>> 6f81d40992 (GEOMESA-3067 Find attribute in Filters with Functions with embedded expressions correctly)
=======
=======
>>>>>>> 92674ff9d4 (GEOMESA-3061 Converters - support bytes in Avro top-level union types (#2762))
>>>>>>> 009a284072 (GEOMESA-3061 Converters - support bytes in Avro top-level union types (#2762))
=======
>>>>>>> 9df4f8a9f6 (GEOMESA-3067 Find attribute in Filters with Functions with embedded expressions correctly)
=======
=======
>>>>>>> 9a4dff9e4f (GEOMESA-3061 Converters - support bytes in Avro top-level union types (#2762))
>>>>>>> 7b8c8dcc3d (GEOMESA-3061 Converters - support bytes in Avro top-level union types (#2762))
=======
>>>>>>> 79cd5cb606 (GEOMESA-3067 Find attribute in Filters with Functions with embedded expressions correctly)
=======
=======
>>>>>>> 0fc6650ecf (GEOMESA-3061 Converters - support bytes in Avro top-level union types (#2762))
>>>>>>> c029a43a6c (GEOMESA-3061 Converters - support bytes in Avro top-level union types (#2762))
=======
>>>>>>> a5b0374ee2 (GEOMESA-3061 Converters - support bytes in Avro top-level union types (#2762))
=======
=======
>>>>>>> 8c9ca1211a (GEOMESA-3061 Converters - support bytes in Avro top-level union types (#2762))
>>>>>>> 4f51687745 (GEOMESA-3061 Converters - support bytes in Avro top-level union types (#2762))
=======
>>>>>>> 9a2d40c613 (GEOMESA-3061 Converters - support bytes in Avro top-level union types (#2762))
=======
=======
>>>>>>> 1cad375176 (GEOMESA-3061 Converters - support bytes in Avro top-level union types (#2762))
>>>>>>> 73770612e0 (GEOMESA-3061 Converters - support bytes in Avro top-level union types (#2762))
=======
>>>>>>> 6c83981af3 (GEOMESA-3061 Converters - support bytes in Avro top-level union types (#2762))
>>>>>>> f36b0e8b9a (GEOMESA-3067 Find attribute in Filters with Functions with embedded expressions correctly)
=======
=======
>>>>>>> f302a54949 (GEOMESA-3061 Converters - support bytes in Avro top-level union types (#2762))
=======
>>>>>>> a83fe4cf7c (GEOMESA-3067 Find attribute in Filters with Functions with embedded expressions correctly)
=======
>>>>>>> a788dfac03 (GEOMESA-3061 Converters - support bytes in Avro top-level union types (#2762))
=======
>>>>>>> a63cb7e74 (GEOMESA-3067 Find attribute in Filters with Functions with embedded expressions correctly)
>>>>>>> 125ffd0575 (GEOMESA-3067 Find attribute in Filters with Functions with embedded expressions correctly)
=======
>>>>>>> 4c361f07da (GEOMESA-3061 Converters - support bytes in Avro top-level union types (#2762))
=======
>>>>>>> 20f6826d0f (GEOMESA-3067 Find attribute in Filters with Functions with embedded expressions correctly)
=======
=======
>>>>>>> f302a54949 (GEOMESA-3061 Converters - support bytes in Avro top-level union types (#2762))
=======
>>>>>>> a83fe4cf7c (GEOMESA-3067 Find attribute in Filters with Functions with embedded expressions correctly)
=======
>>>>>>> a788dfac03 (GEOMESA-3061 Converters - support bytes in Avro top-level union types (#2762))
=======
>>>>>>> a63cb7e74 (GEOMESA-3067 Find attribute in Filters with Functions with embedded expressions correctly)
>>>>>>> 125ffd0575 (GEOMESA-3067 Find attribute in Filters with Functions with embedded expressions correctly)
=======
>>>>>>> 4c361f07da (GEOMESA-3061 Converters - support bytes in Avro top-level union types (#2762))
=======
>>>>>>> 20f6826d0f (GEOMESA-3067 Find attribute in Filters with Functions with embedded expressions correctly)
=======
=======
>>>>>>> f302a54949 (GEOMESA-3061 Converters - support bytes in Avro top-level union types (#2762))
=======
>>>>>>> a83fe4cf7c (GEOMESA-3067 Find attribute in Filters with Functions with embedded expressions correctly)
=======
>>>>>>> a788dfac03 (GEOMESA-3061 Converters - support bytes in Avro top-level union types (#2762))
=======
>>>>>>> a63cb7e74 (GEOMESA-3067 Find attribute in Filters with Functions with embedded expressions correctly)
>>>>>>> 125ffd0575 (GEOMESA-3067 Find attribute in Filters with Functions with embedded expressions correctly)
=======
>>>>>>> 4c361f07da (GEOMESA-3061 Converters - support bytes in Avro top-level union types (#2762))
=======
>>>>>>> 20f6826d0f (GEOMESA-3067 Find attribute in Filters with Functions with embedded expressions correctly)
=======
=======
        Result.foreach(1 to 10) { j =>
>>>>>>> b9bdd406e (GEOMESA-3061 Converters - support bytes in Avro top-level union types (#2762))
>>>>>>> cdb4102515 (GEOMESA-3061 Converters - support bytes in Avro top-level union types (#2762))
=======
<<<<<<< HEAD
<<<<<<< HEAD
=======
>>>>>>> e7d6b701c8 (GEOMESA-3061 Converters - support bytes in Avro top-level union types (#2762))
=======
=======
>>>>>>> cdb4102515 (GEOMESA-3061 Converters - support bytes in Avro top-level union types (#2762))
>>>>>>> d1fa26b39d (GEOMESA-3061 Converters - support bytes in Avro top-level union types (#2762))
        Result.foreach(1 to 10) { j =>
=======
        Result.foreach(1 to 10){ j =>
>>>>>>> 7acc3ea46 (GEOMESA-3067 Find attribute in Filters with Functions with embedded expressions correctly)
<<<<<<< HEAD
>>>>>>> e3a63fee18 (GEOMESA-3067 Find attribute in Filters with Functions with embedded expressions correctly)
=======
=======
        Result.foreach(1 to 10) { j =>
>>>>>>> b9bdd406e (GEOMESA-3061 Converters - support bytes in Avro top-level union types (#2762))
>>>>>>> 0e68e9f4cc (GEOMESA-3061 Converters - support bytes in Avro top-level union types (#2762))
=======
=======
<<<<<<< HEAD
<<<<<<< HEAD
<<<<<<< HEAD
<<<<<<< HEAD
<<<<<<< HEAD
<<<<<<< HEAD
=======
>>>>>>> 424e7de15a (GEOMESA-3067 Find attribute in Filters with Functions with embedded expressions correctly)
=======
>>>>>>> 988874c83e (GEOMESA-3061 Converters - support bytes in Avro top-level union types (#2762))
>>>>>>> 67b361c856 (GEOMESA-3061 Converters - support bytes in Avro top-level union types (#2762))
=======
>>>>>>> 9d708b240a (GEOMESA-3061 Converters - support bytes in Avro top-level union types (#2762))
=======
<<<<<<< HEAD
<<<<<<< HEAD
<<<<<<< HEAD
<<<<<<< HEAD
<<<<<<< HEAD
<<<<<<< HEAD
=======
>>>>>>> e0c2527549 (GEOMESA-3061 Converters - support bytes in Avro top-level union types (#2762))
=======
>>>>>>> 4cf1d8d259 (GEOMESA-3067 Find attribute in Filters with Functions with embedded expressions correctly)
>>>>>>> 3333975e77 (GEOMESA-3067 Find attribute in Filters with Functions with embedded expressions correctly)
=======
>>>>>>> 76618c8da3 (GEOMESA-3061 Converters - support bytes in Avro top-level union types (#2762))
=======
<<<<<<< HEAD
<<<<<<< HEAD
<<<<<<< HEAD
<<<<<<< HEAD
<<<<<<< HEAD
<<<<<<< HEAD
=======
>>>>>>> c8a325e13c (GEOMESA-3061 Converters - support bytes in Avro top-level union types (#2762))
=======
>>>>>>> 9638dc731e (GEOMESA-3067 Find attribute in Filters with Functions with embedded expressions correctly)
=======
>>>>>>> 97ec7d864a (GEOMESA-3061 Converters - support bytes in Avro top-level union types (#2762))
=======
>>>>>>> ad3cedc4db (GEOMESA-3061 Converters - support bytes in Avro top-level union types (#2762))
=======
>>>>>>> bc49131942 (GEOMESA-3067 Find attribute in Filters with Functions with embedded expressions correctly)
=======
>>>>>>> bdbced26d4 (GEOMESA-3061 Converters - support bytes in Avro top-level union types (#2762))
=======
>>>>>>> 0dbede148d (GEOMESA-3061 Converters - support bytes in Avro top-level union types (#2762))
=======
>>>>>>> 22dcc8170f (GEOMESA-3061 Converters - support bytes in Avro top-level union types (#2762))
=======
>>>>>>> b009fd23f4 (GEOMESA-3061 Converters - support bytes in Avro top-level union types (#2762))
=======
=======
>>>>>>> bc4062951d (GEOMESA-3061 Converters - support bytes in Avro top-level union types (#2762))
=======
>>>>>>> deb8fd68de (GEOMESA-3067 Find attribute in Filters with Functions with embedded expressions correctly)
=======
>>>>>>> 8adfab65bb (GEOMESA-3061 Converters - support bytes in Avro top-level union types (#2762))
=======
>>>>>>> 3254b186da (GEOMESA-3067 Find attribute in Filters with Functions with embedded expressions correctly)
=======
>>>>>>> 7b0539b808 (GEOMESA-3061 Converters - support bytes in Avro top-level union types (#2762))
=======
>>>>>>> 982031ef44 (GEOMESA-3067 Find attribute in Filters with Functions with embedded expressions correctly)
=======
>>>>>>> 0086b292ba (GEOMESA-3061 Converters - support bytes in Avro top-level union types (#2762))
=======
>>>>>>> cf57a2c189 (GEOMESA-3067 Find attribute in Filters with Functions with embedded expressions correctly)
=======
>>>>>>> e15d50d7d3 (GEOMESA-3061 Converters - support bytes in Avro top-level union types (#2762))
=======
>>>>>>> bec3ba7d08 (GEOMESA-3067 Find attribute in Filters with Functions with embedded expressions correctly)
=======
>>>>>>> 8de43cccf6 (GEOMESA-3061 Converters - support bytes in Avro top-level union types (#2762))
=======
>>>>>>> b1a7408547 (GEOMESA-3067 Find attribute in Filters with Functions with embedded expressions correctly)
=======
>>>>>>> 12e3a588fc (GEOMESA-3061 Converters - support bytes in Avro top-level union types (#2762))
=======
>>>>>>> c8e013ff91 (GEOMESA-3067 Find attribute in Filters with Functions with embedded expressions correctly)
=======
>>>>>>> 1890b11217 (GEOMESA-3061 Converters - support bytes in Avro top-level union types (#2762))
=======
>>>>>>> 912169b5e9 (GEOMESA-3067 Find attribute in Filters with Functions with embedded expressions correctly)
=======
>>>>>>> 9c28193a91 (GEOMESA-3061 Converters - support bytes in Avro top-level union types (#2762))
=======
>>>>>>> 1b60c2aeba (GEOMESA-3067 Find attribute in Filters with Functions with embedded expressions correctly)
=======
>>>>>>> d294ce49e2 (GEOMESA-3061 Converters - support bytes in Avro top-level union types (#2762))
=======
>>>>>>> ed45e8551f (GEOMESA-3067 Find attribute in Filters with Functions with embedded expressions correctly)
=======
>>>>>>> 1df8328338 (GEOMESA-3061 Converters - support bytes in Avro top-level union types (#2762))
=======
>>>>>>> dace2085b (GEOMESA-3061 Converters - support bytes in Avro top-level union types (#2762))
>>>>>>> 238945d4b3 (GEOMESA-3061 Converters - support bytes in Avro top-level union types (#2762))
=======
>>>>>>> 516fe7e9c (GEOMESA-3061 Converters - support bytes in Avro top-level union types (#2762))
=======
>>>>>>> 8a3e82747d (GEOMESA-3067 Find attribute in Filters with Functions with embedded expressions correctly)
=======
>>>>>>> 81ee66102b (GEOMESA-3061 Converters - support bytes in Avro top-level union types (#2762))
=======
>>>>>>> 9943e05ec9 (GEOMESA-3067 Find attribute in Filters with Functions with embedded expressions correctly)
=======
>>>>>>> 53a3e72cbf (GEOMESA-3061 Converters - support bytes in Avro top-level union types (#2762))
=======
>>>>>>> d15af7157e (GEOMESA-3067 Find attribute in Filters with Functions with embedded expressions correctly)
=======
>>>>>>> 947761ec9b (GEOMESA-3061 Converters - support bytes in Avro top-level union types (#2762))
=======
>>>>>>> 9813375fcc (GEOMESA-3067 Find attribute in Filters with Functions with embedded expressions correctly)
=======
=======
>>>>>>> d2eec4be68 (GEOMESA-3067 Find attribute in Filters with Functions with embedded expressions correctly)
=======
>>>>>>> d94c03a98e (GEOMESA-3061 Converters - support bytes in Avro top-level union types (#2762))
=======
>>>>>>> e69b2aa6dc (GEOMESA-3067 Find attribute in Filters with Functions with embedded expressions correctly)
=======
>>>>>>> 67e4c1354f (GEOMESA-3061 Converters - support bytes in Avro top-level union types (#2762))
=======
>>>>>>> 060ac2189c (GEOMESA-3067 Find attribute in Filters with Functions with embedded expressions correctly)
=======
>>>>>>> 8035cc5893 (GEOMESA-3061 Converters - support bytes in Avro top-level union types (#2762))
=======
=======
=======
=======
>>>>>>> 9abc630fdf (GEOMESA-3061 Converters - support bytes in Avro top-level union types (#2762))
=======
>>>>>>> 570899511d (GEOMESA-3067 Find attribute in Filters with Functions with embedded expressions correctly)
=======
>>>>>>> 25063957fc (GEOMESA-3061 Converters - support bytes in Avro top-level union types (#2762))
=======
=======
>>>>>>> a63cb7e74 (GEOMESA-3067 Find attribute in Filters with Functions with embedded expressions correctly)
>>>>>>> 8fb060734 (GEOMESA-3067 Find attribute in Filters with Functions with embedded expressions correctly)
>>>>>>> 38b3282770 (GEOMESA-3067 Find attribute in Filters with Functions with embedded expressions correctly)
=======
>>>>>>> a910ae135 (GEOMESA-3061 Converters - support bytes in Avro top-level union types (#2762))
>>>>>>> 07161eaaa6 (GEOMESA-3061 Converters - support bytes in Avro top-level union types (#2762))
=======
>>>>>>> 7f922b040 (GEOMESA-3067 Find attribute in Filters with Functions with embedded expressions correctly)
>>>>>>> 04f08c23c5 (GEOMESA-3067 Find attribute in Filters with Functions with embedded expressions correctly)
=======
>>>>>>> c8a325e13 (GEOMESA-3061 Converters - support bytes in Avro top-level union types (#2762))
>>>>>>> c9328eddce (GEOMESA-3061 Converters - support bytes in Avro top-level union types (#2762))
=======
>>>>>>> 9638dc731 (GEOMESA-3067 Find attribute in Filters with Functions with embedded expressions correctly)
=======
>>>>>>> 97ec7d864 (GEOMESA-3061 Converters - support bytes in Avro top-level union types (#2762))
=======
>>>>>>> ad3cedc4d (GEOMESA-3061 Converters - support bytes in Avro top-level union types (#2762))
=======
>>>>>>> bc4913194 (GEOMESA-3067 Find attribute in Filters with Functions with embedded expressions correctly)
=======
>>>>>>> bdbced26d (GEOMESA-3061 Converters - support bytes in Avro top-level union types (#2762))
=======
>>>>>>> 24c4df93a5 (GEOMESA-3067 Find attribute in Filters with Functions with embedded expressions correctly)
=======
>>>>>>> c8a325e13c (GEOMESA-3061 Converters - support bytes in Avro top-level union types (#2762))
=======
>>>>>>> 9638dc731e (GEOMESA-3067 Find attribute in Filters with Functions with embedded expressions correctly)
=======
>>>>>>> 97ec7d864a (GEOMESA-3061 Converters - support bytes in Avro top-level union types (#2762))
=======
>>>>>>> ad3cedc4db (GEOMESA-3061 Converters - support bytes in Avro top-level union types (#2762))
=======
>>>>>>> bc49131942 (GEOMESA-3067 Find attribute in Filters with Functions with embedded expressions correctly)
=======
>>>>>>> bdbced26d4 (GEOMESA-3061 Converters - support bytes in Avro top-level union types (#2762))
=======
>>>>>>> 0dbede148d (GEOMESA-3061 Converters - support bytes in Avro top-level union types (#2762))
=======
>>>>>>> 22dcc8170f (GEOMESA-3061 Converters - support bytes in Avro top-level union types (#2762))
=======
>>>>>>> b009fd23f4 (GEOMESA-3061 Converters - support bytes in Avro top-level union types (#2762))
=======
=======
>>>>>>> bc4062951d (GEOMESA-3061 Converters - support bytes in Avro top-level union types (#2762))
=======
>>>>>>> deb8fd68de (GEOMESA-3067 Find attribute in Filters with Functions with embedded expressions correctly)
=======
>>>>>>> 8adfab65bb (GEOMESA-3061 Converters - support bytes in Avro top-level union types (#2762))
=======
>>>>>>> 3254b186da (GEOMESA-3067 Find attribute in Filters with Functions with embedded expressions correctly)
=======
>>>>>>> 7b0539b808 (GEOMESA-3061 Converters - support bytes in Avro top-level union types (#2762))
=======
>>>>>>> 982031ef44 (GEOMESA-3067 Find attribute in Filters with Functions with embedded expressions correctly)
=======
>>>>>>> 0086b292ba (GEOMESA-3061 Converters - support bytes in Avro top-level union types (#2762))
=======
>>>>>>> cf57a2c189 (GEOMESA-3067 Find attribute in Filters with Functions with embedded expressions correctly)
=======
>>>>>>> e15d50d7d3 (GEOMESA-3061 Converters - support bytes in Avro top-level union types (#2762))
=======
>>>>>>> bec3ba7d08 (GEOMESA-3067 Find attribute in Filters with Functions with embedded expressions correctly)
=======
>>>>>>> 8de43cccf6 (GEOMESA-3061 Converters - support bytes in Avro top-level union types (#2762))
=======
>>>>>>> b1a7408547 (GEOMESA-3067 Find attribute in Filters with Functions with embedded expressions correctly)
=======
>>>>>>> 12e3a588fc (GEOMESA-3061 Converters - support bytes in Avro top-level union types (#2762))
=======
>>>>>>> c8e013ff91 (GEOMESA-3067 Find attribute in Filters with Functions with embedded expressions correctly)
=======
>>>>>>> 1890b11217 (GEOMESA-3061 Converters - support bytes in Avro top-level union types (#2762))
=======
>>>>>>> 912169b5e9 (GEOMESA-3067 Find attribute in Filters with Functions with embedded expressions correctly)
=======
>>>>>>> 9c28193a91 (GEOMESA-3061 Converters - support bytes in Avro top-level union types (#2762))
=======
>>>>>>> 1b60c2aeba (GEOMESA-3067 Find attribute in Filters with Functions with embedded expressions correctly)
=======
>>>>>>> d294ce49e2 (GEOMESA-3061 Converters - support bytes in Avro top-level union types (#2762))
=======
>>>>>>> ed45e8551f (GEOMESA-3067 Find attribute in Filters with Functions with embedded expressions correctly)
=======
>>>>>>> 1df8328338 (GEOMESA-3061 Converters - support bytes in Avro top-level union types (#2762))
=======
>>>>>>> dace2085b (GEOMESA-3061 Converters - support bytes in Avro top-level union types (#2762))
>>>>>>> 238945d4b3 (GEOMESA-3061 Converters - support bytes in Avro top-level union types (#2762))
=======
>>>>>>> 516fe7e9c (GEOMESA-3061 Converters - support bytes in Avro top-level union types (#2762))
=======
>>>>>>> 8a3e82747d (GEOMESA-3067 Find attribute in Filters with Functions with embedded expressions correctly)
=======
>>>>>>> 81ee66102b (GEOMESA-3061 Converters - support bytes in Avro top-level union types (#2762))
=======
>>>>>>> 9943e05ec9 (GEOMESA-3067 Find attribute in Filters with Functions with embedded expressions correctly)
=======
>>>>>>> 53a3e72cbf (GEOMESA-3061 Converters - support bytes in Avro top-level union types (#2762))
=======
>>>>>>> d15af7157e (GEOMESA-3067 Find attribute in Filters with Functions with embedded expressions correctly)
=======
>>>>>>> 947761ec9b (GEOMESA-3061 Converters - support bytes in Avro top-level union types (#2762))
=======
>>>>>>> 9813375fcc (GEOMESA-3067 Find attribute in Filters with Functions with embedded expressions correctly)
=======
=======
>>>>>>> d2eec4be68 (GEOMESA-3067 Find attribute in Filters with Functions with embedded expressions correctly)
=======
>>>>>>> d94c03a98e (GEOMESA-3061 Converters - support bytes in Avro top-level union types (#2762))
=======
>>>>>>> e69b2aa6dc (GEOMESA-3067 Find attribute in Filters with Functions with embedded expressions correctly)
=======
>>>>>>> 67e4c1354f (GEOMESA-3061 Converters - support bytes in Avro top-level union types (#2762))
=======
>>>>>>> 060ac2189c (GEOMESA-3067 Find attribute in Filters with Functions with embedded expressions correctly)
=======
>>>>>>> 8035cc5893 (GEOMESA-3061 Converters - support bytes in Avro top-level union types (#2762))
=======
=======
=======
=======
>>>>>>> 9abc630fdf (GEOMESA-3061 Converters - support bytes in Avro top-level union types (#2762))
=======
>>>>>>> 570899511d (GEOMESA-3067 Find attribute in Filters with Functions with embedded expressions correctly)
=======
>>>>>>> 25063957fc (GEOMESA-3061 Converters - support bytes in Avro top-level union types (#2762))
=======
=======
>>>>>>> a63cb7e74 (GEOMESA-3067 Find attribute in Filters with Functions with embedded expressions correctly)
>>>>>>> 8fb060734 (GEOMESA-3067 Find attribute in Filters with Functions with embedded expressions correctly)
>>>>>>> 38b3282770 (GEOMESA-3067 Find attribute in Filters with Functions with embedded expressions correctly)
=======
>>>>>>> a910ae135 (GEOMESA-3061 Converters - support bytes in Avro top-level union types (#2762))
>>>>>>> 07161eaaa6 (GEOMESA-3061 Converters - support bytes in Avro top-level union types (#2762))
=======
>>>>>>> 7f922b040 (GEOMESA-3067 Find attribute in Filters with Functions with embedded expressions correctly)
>>>>>>> 04f08c23c5 (GEOMESA-3067 Find attribute in Filters with Functions with embedded expressions correctly)
=======
>>>>>>> c8a325e13 (GEOMESA-3061 Converters - support bytes in Avro top-level union types (#2762))
>>>>>>> c9328eddce (GEOMESA-3061 Converters - support bytes in Avro top-level union types (#2762))
=======
>>>>>>> 9638dc731 (GEOMESA-3067 Find attribute in Filters with Functions with embedded expressions correctly)
=======
>>>>>>> 97ec7d864 (GEOMESA-3061 Converters - support bytes in Avro top-level union types (#2762))
=======
>>>>>>> ad3cedc4d (GEOMESA-3061 Converters - support bytes in Avro top-level union types (#2762))
=======
>>>>>>> bc4913194 (GEOMESA-3067 Find attribute in Filters with Functions with embedded expressions correctly)
=======
>>>>>>> bdbced26d (GEOMESA-3061 Converters - support bytes in Avro top-level union types (#2762))
=======
>>>>>>> def2794bb5 (GEOMESA-3067 Find attribute in Filters with Functions with embedded expressions correctly)
=======
>>>>>>> cb5e2daf2b (GEOMESA-3061 Converters - support bytes in Avro top-level union types (#2762))
=======
>>>>>>> 9bcad1eb67 (GEOMESA-3067 Find attribute in Filters with Functions with embedded expressions correctly)
=======
>>>>>>> c8a325e13c (GEOMESA-3061 Converters - support bytes in Avro top-level union types (#2762))
=======
>>>>>>> 9638dc731e (GEOMESA-3067 Find attribute in Filters with Functions with embedded expressions correctly)
=======
>>>>>>> 97ec7d864a (GEOMESA-3061 Converters - support bytes in Avro top-level union types (#2762))
=======
>>>>>>> ad3cedc4db (GEOMESA-3061 Converters - support bytes in Avro top-level union types (#2762))
=======
>>>>>>> bc49131942 (GEOMESA-3067 Find attribute in Filters with Functions with embedded expressions correctly)
=======
>>>>>>> bdbced26d4 (GEOMESA-3061 Converters - support bytes in Avro top-level union types (#2762))
=======
>>>>>>> 0dbede148d (GEOMESA-3061 Converters - support bytes in Avro top-level union types (#2762))
=======
>>>>>>> 22dcc8170f (GEOMESA-3061 Converters - support bytes in Avro top-level union types (#2762))
=======
>>>>>>> b009fd23f4 (GEOMESA-3061 Converters - support bytes in Avro top-level union types (#2762))
=======
=======
>>>>>>> bc4062951d (GEOMESA-3061 Converters - support bytes in Avro top-level union types (#2762))
=======
>>>>>>> deb8fd68de (GEOMESA-3067 Find attribute in Filters with Functions with embedded expressions correctly)
=======
>>>>>>> 8adfab65bb (GEOMESA-3061 Converters - support bytes in Avro top-level union types (#2762))
=======
>>>>>>> 3254b186da (GEOMESA-3067 Find attribute in Filters with Functions with embedded expressions correctly)
=======
>>>>>>> 7b0539b808 (GEOMESA-3061 Converters - support bytes in Avro top-level union types (#2762))
=======
>>>>>>> 982031ef44 (GEOMESA-3067 Find attribute in Filters with Functions with embedded expressions correctly)
=======
>>>>>>> 0086b292ba (GEOMESA-3061 Converters - support bytes in Avro top-level union types (#2762))
=======
>>>>>>> cf57a2c189 (GEOMESA-3067 Find attribute in Filters with Functions with embedded expressions correctly)
=======
>>>>>>> e15d50d7d3 (GEOMESA-3061 Converters - support bytes in Avro top-level union types (#2762))
=======
>>>>>>> bec3ba7d08 (GEOMESA-3067 Find attribute in Filters with Functions with embedded expressions correctly)
=======
>>>>>>> 8de43cccf6 (GEOMESA-3061 Converters - support bytes in Avro top-level union types (#2762))
=======
>>>>>>> b1a7408547 (GEOMESA-3067 Find attribute in Filters with Functions with embedded expressions correctly)
=======
>>>>>>> 12e3a588fc (GEOMESA-3061 Converters - support bytes in Avro top-level union types (#2762))
=======
>>>>>>> c8e013ff91 (GEOMESA-3067 Find attribute in Filters with Functions with embedded expressions correctly)
=======
>>>>>>> 1890b11217 (GEOMESA-3061 Converters - support bytes in Avro top-level union types (#2762))
=======
>>>>>>> 912169b5e9 (GEOMESA-3067 Find attribute in Filters with Functions with embedded expressions correctly)
=======
>>>>>>> 9c28193a91 (GEOMESA-3061 Converters - support bytes in Avro top-level union types (#2762))
=======
>>>>>>> 1b60c2aeba (GEOMESA-3067 Find attribute in Filters with Functions with embedded expressions correctly)
=======
>>>>>>> d294ce49e2 (GEOMESA-3061 Converters - support bytes in Avro top-level union types (#2762))
=======
>>>>>>> ed45e8551f (GEOMESA-3067 Find attribute in Filters with Functions with embedded expressions correctly)
=======
>>>>>>> 1df8328338 (GEOMESA-3061 Converters - support bytes in Avro top-level union types (#2762))
=======
>>>>>>> dace2085b (GEOMESA-3061 Converters - support bytes in Avro top-level union types (#2762))
>>>>>>> 238945d4b3 (GEOMESA-3061 Converters - support bytes in Avro top-level union types (#2762))
=======
>>>>>>> 516fe7e9c (GEOMESA-3061 Converters - support bytes in Avro top-level union types (#2762))
=======
>>>>>>> 8a3e82747d (GEOMESA-3067 Find attribute in Filters with Functions with embedded expressions correctly)
=======
>>>>>>> 81ee66102b (GEOMESA-3061 Converters - support bytes in Avro top-level union types (#2762))
=======
>>>>>>> 9943e05ec9 (GEOMESA-3067 Find attribute in Filters with Functions with embedded expressions correctly)
=======
>>>>>>> 53a3e72cbf (GEOMESA-3061 Converters - support bytes in Avro top-level union types (#2762))
=======
>>>>>>> d15af7157e (GEOMESA-3067 Find attribute in Filters with Functions with embedded expressions correctly)
=======
>>>>>>> 947761ec9b (GEOMESA-3061 Converters - support bytes in Avro top-level union types (#2762))
=======
>>>>>>> 9813375fcc (GEOMESA-3067 Find attribute in Filters with Functions with embedded expressions correctly)
=======
=======
>>>>>>> d2eec4be68 (GEOMESA-3067 Find attribute in Filters with Functions with embedded expressions correctly)
=======
>>>>>>> d94c03a98e (GEOMESA-3061 Converters - support bytes in Avro top-level union types (#2762))
=======
>>>>>>> e69b2aa6dc (GEOMESA-3067 Find attribute in Filters with Functions with embedded expressions correctly)
=======
>>>>>>> 67e4c1354f (GEOMESA-3061 Converters - support bytes in Avro top-level union types (#2762))
=======
>>>>>>> 060ac2189c (GEOMESA-3067 Find attribute in Filters with Functions with embedded expressions correctly)
=======
>>>>>>> 8035cc5893 (GEOMESA-3061 Converters - support bytes in Avro top-level union types (#2762))
=======
=======
=======
=======
>>>>>>> 9abc630fdf (GEOMESA-3061 Converters - support bytes in Avro top-level union types (#2762))
=======
>>>>>>> 570899511d (GEOMESA-3067 Find attribute in Filters with Functions with embedded expressions correctly)
=======
>>>>>>> 25063957fc (GEOMESA-3061 Converters - support bytes in Avro top-level union types (#2762))
=======
=======
>>>>>>> a63cb7e74 (GEOMESA-3067 Find attribute in Filters with Functions with embedded expressions correctly)
>>>>>>> 8fb060734 (GEOMESA-3067 Find attribute in Filters with Functions with embedded expressions correctly)
>>>>>>> 38b3282770 (GEOMESA-3067 Find attribute in Filters with Functions with embedded expressions correctly)
=======
>>>>>>> a910ae135 (GEOMESA-3061 Converters - support bytes in Avro top-level union types (#2762))
>>>>>>> 07161eaaa6 (GEOMESA-3061 Converters - support bytes in Avro top-level union types (#2762))
=======
>>>>>>> 7f922b040 (GEOMESA-3067 Find attribute in Filters with Functions with embedded expressions correctly)
>>>>>>> 04f08c23c5 (GEOMESA-3067 Find attribute in Filters with Functions with embedded expressions correctly)
=======
>>>>>>> c8a325e13 (GEOMESA-3061 Converters - support bytes in Avro top-level union types (#2762))
>>>>>>> c9328eddce (GEOMESA-3061 Converters - support bytes in Avro top-level union types (#2762))
=======
>>>>>>> 9638dc731 (GEOMESA-3067 Find attribute in Filters with Functions with embedded expressions correctly)
=======
>>>>>>> 97ec7d864 (GEOMESA-3061 Converters - support bytes in Avro top-level union types (#2762))
=======
>>>>>>> ad3cedc4d (GEOMESA-3061 Converters - support bytes in Avro top-level union types (#2762))
=======
>>>>>>> bc4913194 (GEOMESA-3067 Find attribute in Filters with Functions with embedded expressions correctly)
=======
>>>>>>> bdbced26d (GEOMESA-3061 Converters - support bytes in Avro top-level union types (#2762))
=======
>>>>>>> 24c4df93a5 (GEOMESA-3067 Find attribute in Filters with Functions with embedded expressions correctly)
=======
>>>>>>> c8a325e13c (GEOMESA-3061 Converters - support bytes in Avro top-level union types (#2762))
=======
>>>>>>> 9638dc731e (GEOMESA-3067 Find attribute in Filters with Functions with embedded expressions correctly)
=======
>>>>>>> 97ec7d864a (GEOMESA-3061 Converters - support bytes in Avro top-level union types (#2762))
=======
>>>>>>> ad3cedc4db (GEOMESA-3061 Converters - support bytes in Avro top-level union types (#2762))
=======
>>>>>>> bc49131942 (GEOMESA-3067 Find attribute in Filters with Functions with embedded expressions correctly)
=======
>>>>>>> bdbced26d4 (GEOMESA-3061 Converters - support bytes in Avro top-level union types (#2762))
=======
>>>>>>> 0dbede148d (GEOMESA-3061 Converters - support bytes in Avro top-level union types (#2762))
=======
>>>>>>> 22dcc8170f (GEOMESA-3061 Converters - support bytes in Avro top-level union types (#2762))
=======
>>>>>>> b009fd23f4 (GEOMESA-3061 Converters - support bytes in Avro top-level union types (#2762))
=======
=======
>>>>>>> bc4062951d (GEOMESA-3061 Converters - support bytes in Avro top-level union types (#2762))
=======
>>>>>>> dace2085b (GEOMESA-3061 Converters - support bytes in Avro top-level union types (#2762))
>>>>>>> 238945d4b3 (GEOMESA-3061 Converters - support bytes in Avro top-level union types (#2762))
=======
>>>>>>> 516fe7e9c (GEOMESA-3061 Converters - support bytes in Avro top-level union types (#2762))
=======
>>>>>>> a63cb7e74 (GEOMESA-3067 Find attribute in Filters with Functions with embedded expressions correctly)
>>>>>>> c3b0a1b6e3 (GEOMESA-3067 Find attribute in Filters with Functions with embedded expressions correctly)
=======
<<<<<<< HEAD
<<<<<<< HEAD
<<<<<<< HEAD
<<<<<<< HEAD
<<<<<<< HEAD
<<<<<<< HEAD
=======
>>>>>>> 9bcad1eb67 (GEOMESA-3067 Find attribute in Filters with Functions with embedded expressions correctly)
=======
>>>>>>> 00e61f4b70 (GEOMESA-3061 Converters - support bytes in Avro top-level union types (#2762))
>>>>>>> 67b361c85 (GEOMESA-3061 Converters - support bytes in Avro top-level union types (#2762))
=======
>>>>>>> e6e1f4bdd5 (GEOMESA-3061 Converters - support bytes in Avro top-level union types (#2762))
=======
<<<<<<< HEAD
<<<<<<< HEAD
<<<<<<< HEAD
<<<<<<< HEAD
<<<<<<< HEAD
<<<<<<< HEAD
=======
>>>>>>> 60b4637548 (GEOMESA-3061 Converters - support bytes in Avro top-level union types (#2762))
=======
>>>>>>> 6f81d40992 (GEOMESA-3067 Find attribute in Filters with Functions with embedded expressions correctly)
>>>>>>> 7f922b040c (GEOMESA-3067 Find attribute in Filters with Functions with embedded expressions correctly)
=======
>>>>>>> a910ae135f (GEOMESA-3061 Converters - support bytes in Avro top-level union types (#2762))
=======
<<<<<<< HEAD
<<<<<<< HEAD
<<<<<<< HEAD
<<<<<<< HEAD
<<<<<<< HEAD
<<<<<<< HEAD
=======
>>>>>>> c169cb2905 (GEOMESA-3067 Find attribute in Filters with Functions with embedded expressions correctly)
=======
>>>>>>> f983ea29f0 (GEOMESA-3067 Find attribute in Filters with Functions with embedded expressions correctly)
=======
>>>>>>> 009a284072 (GEOMESA-3061 Converters - support bytes in Avro top-level union types (#2762))
=======
=======
>>>>>>> c169cb2905 (GEOMESA-3067 Find attribute in Filters with Functions with embedded expressions correctly)
>>>>>>> 9df4f8a9f6 (GEOMESA-3067 Find attribute in Filters with Functions with embedded expressions correctly)
=======
>>>>>>> a63cb7e74 (GEOMESA-3067 Find attribute in Filters with Functions with embedded expressions correctly)
>>>>>>> 8fb0607344 (GEOMESA-3067 Find attribute in Filters with Functions with embedded expressions correctly)
=======
<<<<<<< HEAD
<<<<<<< HEAD
<<<<<<< HEAD
<<<<<<< HEAD
<<<<<<< HEAD
<<<<<<< HEAD
=======
>>>>>>> 9df4f8a9f6 (GEOMESA-3067 Find attribute in Filters with Functions with embedded expressions correctly)
=======
>>>>>>> 7b8c8dcc3d (GEOMESA-3061 Converters - support bytes in Avro top-level union types (#2762))
>>>>>>> 67b361c85 (GEOMESA-3061 Converters - support bytes in Avro top-level union types (#2762))
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
>>>>>>> 1cad375176 (GEOMESA-3061 Converters - support bytes in Avro top-level union types (#2762))
=======
>>>>>>> 4373c901b3 (GEOMESA-3067 Find attribute in Filters with Functions with embedded expressions correctly)
=======
>>>>>>> fe3de10f11 (GEOMESA-3061 Converters - support bytes in Avro top-level union types (#2762))
=======
>>>>>>> a35efac12e (GEOMESA-3061 Converters - support bytes in Avro top-level union types (#2762))
=======
>>>>>>> 7b3c90c53f (GEOMESA-3061 Converters - support bytes in Avro top-level union types (#2762))
=======
>>>>>>> 1278241911 (GEOMESA-3067 Find attribute in Filters with Functions with embedded expressions correctly)
=======
>>>>>>> 0fa73844a1 (GEOMESA-3061 Converters - support bytes in Avro top-level union types (#2762))
=======
>>>>>>> 6e30236dd2 (GEOMESA-3061 Converters - support bytes in Avro top-level union types (#2762))
=======
>>>>>>> 4f51687745 (GEOMESA-3061 Converters - support bytes in Avro top-level union types (#2762))
=======
=======
>>>>>>> 1cad375176 (GEOMESA-3061 Converters - support bytes in Avro top-level union types (#2762))
>>>>>>> 73770612e0 (GEOMESA-3061 Converters - support bytes in Avro top-level union types (#2762))
>>>>>>> 240977229 (GEOMESA-3061 Converters - support bytes in Avro top-level union types (#2762))
=======
>>>>>>> 45ad5d11f (GEOMESA-3061 Converters - support bytes in Avro top-level union types (#2762))
=======
=======
>>>>>>> dace2085b (GEOMESA-3061 Converters - support bytes in Avro top-level union types (#2762))
<<<<<<< HEAD
<<<<<<< HEAD
<<<<<<< HEAD
<<<<<<< HEAD
<<<<<<< HEAD
=======
>>>>>>> 73770612e0 (GEOMESA-3061 Converters - support bytes in Avro top-level union types (#2762))
=======
=======
>>>>>>> c9328eddce (GEOMESA-3061 Converters - support bytes in Avro top-level union types (#2762))
<<<<<<< HEAD
<<<<<<< HEAD
<<<<<<< HEAD
<<<<<<< HEAD
=======
>>>>>>> 9abc630fdf (GEOMESA-3061 Converters - support bytes in Avro top-level union types (#2762))
=======
>>>>>>> fe3de10f11 (GEOMESA-3061 Converters - support bytes in Avro top-level union types (#2762))
=======
=======
>>>>>>> 9abc630fdf (GEOMESA-3061 Converters - support bytes in Avro top-level union types (#2762))
>>>>>>> a35efac12e (GEOMESA-3061 Converters - support bytes in Avro top-level union types (#2762))
=======
>>>>>>> 0fa73844a1 (GEOMESA-3061 Converters - support bytes in Avro top-level union types (#2762))
=======
=======
>>>>>>> 9abc630fdf (GEOMESA-3061 Converters - support bytes in Avro top-level union types (#2762))
>>>>>>> 6e30236dd2 (GEOMESA-3061 Converters - support bytes in Avro top-level union types (#2762))
>>>>>>> e182e6e99 (GEOMESA-3067 Find attribute in Filters with Functions with embedded expressions correctly)
=======
<<<<<<< HEAD
>>>>>>> 9943e05ec9 (GEOMESA-3067 Find attribute in Filters with Functions with embedded expressions correctly)
=======
>>>>>>> 9d708b240 (GEOMESA-3061 Converters - support bytes in Avro top-level union types (#2762))
=======
<<<<<<< HEAD
>>>>>>> 53a3e72cbf (GEOMESA-3061 Converters - support bytes in Avro top-level union types (#2762))
=======
>>>>>>> 3333975e7 (GEOMESA-3067 Find attribute in Filters with Functions with embedded expressions correctly)
=======
<<<<<<< HEAD
<<<<<<< HEAD
<<<<<<< HEAD
<<<<<<< HEAD
<<<<<<< HEAD
=======
>>>>>>> 84ac051f28 (GEOMESA-3061 Converters - support bytes in Avro top-level union types (#2762))
=======
>>>>>>> c2cfc968d2 (GEOMESA-3061 Converters - support bytes in Avro top-level union types (#2762))
>>>>>>> d15af7157e (GEOMESA-3067 Find attribute in Filters with Functions with embedded expressions correctly)
=======
>>>>>>> 76618c8da (GEOMESA-3061 Converters - support bytes in Avro top-level union types (#2762))
=======
<<<<<<< HEAD
<<<<<<< HEAD
<<<<<<< HEAD
<<<<<<< HEAD
<<<<<<< HEAD
=======
>>>>>>> 99acaa0887 (GEOMESA-3067 Find attribute in Filters with Functions with embedded expressions correctly)
=======
>>>>>>> 5d8dab9f81 (GEOMESA-3067 Find attribute in Filters with Functions with embedded expressions correctly)
>>>>>>> 947761ec9b (GEOMESA-3061 Converters - support bytes in Avro top-level union types (#2762))
=======
=======
>>>>>>> a63cb7e74 (GEOMESA-3067 Find attribute in Filters with Functions with embedded expressions correctly)
>>>>>>> c3b0a1b6e (GEOMESA-3067 Find attribute in Filters with Functions with embedded expressions correctly)
=======
<<<<<<< HEAD
<<<<<<< HEAD
<<<<<<< HEAD
<<<<<<< HEAD
<<<<<<< HEAD
=======
>>>>>>> fe3de10f11 (GEOMESA-3061 Converters - support bytes in Avro top-level union types (#2762))
=======
>>>>>>> 0fa73844a1 (GEOMESA-3061 Converters - support bytes in Avro top-level union types (#2762))
>>>>>>> 9813375fcc (GEOMESA-3067 Find attribute in Filters with Functions with embedded expressions correctly)
=======
=======
>>>>>>> c8a325e13 (GEOMESA-3061 Converters - support bytes in Avro top-level union types (#2762))
<<<<<<< HEAD
<<<<<<< HEAD
<<<<<<< HEAD
<<<<<<< HEAD
<<<<<<< HEAD
=======
>>>>>>> a35efac12e (GEOMESA-3061 Converters - support bytes in Avro top-level union types (#2762))
=======
>>>>>>> 6e30236dd2 (GEOMESA-3061 Converters - support bytes in Avro top-level union types (#2762))
>>>>>>> c9328eddce (GEOMESA-3061 Converters - support bytes in Avro top-level union types (#2762))
=======
=======
>>>>>>> ad3cedc4d (GEOMESA-3061 Converters - support bytes in Avro top-level union types (#2762))
>>>>>>> 9abc630fdf (GEOMESA-3061 Converters - support bytes in Avro top-level union types (#2762))
<<<<<<< HEAD
<<<<<<< HEAD
<<<<<<< HEAD
=======
>>>>>>> a9884ff1f6 (GEOMESA-3067 Find attribute in Filters with Functions with embedded expressions correctly)
=======
>>>>>>> 67b361c856 (GEOMESA-3061 Converters - support bytes in Avro top-level union types (#2762))
=======
>>>>>>> f7cef54062 (GEOMESA-3061 Converters - support bytes in Avro top-level union types (#2762))
<<<<<<< HEAD
<<<<<<< HEAD
=======
>>>>>>> d206a68a13 (GEOMESA-3061 Converters - support bytes in Avro top-level union types (#2762))
=======
>>>>>>> 3333975e77 (GEOMESA-3067 Find attribute in Filters with Functions with embedded expressions correctly)
=======
>>>>>>> 9412e85b59 (GEOMESA-3067 Find attribute in Filters with Functions with embedded expressions correctly)
<<<<<<< HEAD
<<<<<<< HEAD
=======
>>>>>>> 694bcd3776 (GEOMESA-3061 Converters - support bytes in Avro top-level union types (#2762))
=======
>>>>>>> 24c4df93a5 (GEOMESA-3067 Find attribute in Filters with Functions with embedded expressions correctly)
<<<<<<< HEAD
<<<<<<< HEAD
=======
>>>>>>> 00e61f4b70 (GEOMESA-3061 Converters - support bytes in Avro top-level union types (#2762))
=======
>>>>>>> 67b361c85 (GEOMESA-3061 Converters - support bytes in Avro top-level union types (#2762))
=======
>>>>>>> 6cd1151639 (GEOMESA-3061 Converters - support bytes in Avro top-level union types (#2762))
<<<<<<< HEAD
<<<<<<< HEAD
=======
>>>>>>> 5dcf23da52 (GEOMESA-3061 Converters - support bytes in Avro top-level union types (#2762))
=======
>>>>>>> 7f922b040c (GEOMESA-3067 Find attribute in Filters with Functions with embedded expressions correctly)
=======
>>>>>>> 2b62d1f3fe (GEOMESA-3067 Find attribute in Filters with Functions with embedded expressions correctly)
<<<<<<< HEAD
<<<<<<< HEAD
=======
>>>>>>> 92674ff9d4 (GEOMESA-3061 Converters - support bytes in Avro top-level union types (#2762))
=======
>>>>>>> c169cb2905 (GEOMESA-3067 Find attribute in Filters with Functions with embedded expressions correctly)
<<<<<<< HEAD
<<<<<<< HEAD
=======
>>>>>>> 7b8c8dcc3d (GEOMESA-3061 Converters - support bytes in Avro top-level union types (#2762))
=======
>>>>>>> 67b361c85 (GEOMESA-3061 Converters - support bytes in Avro top-level union types (#2762))
=======
>>>>>>> 9a4dff9e4f (GEOMESA-3061 Converters - support bytes in Avro top-level union types (#2762))
<<<<<<< HEAD
<<<<<<< HEAD
=======
>>>>>>> 240977229 (GEOMESA-3061 Converters - support bytes in Avro top-level union types (#2762))
=======
<<<<<<< HEAD
<<<<<<< HEAD
>>>>>>> 8c9ca1211a (GEOMESA-3061 Converters - support bytes in Avro top-level union types (#2762))
=======
>>>>>>> 45ad5d11f (GEOMESA-3061 Converters - support bytes in Avro top-level union types (#2762))
=======
>>>>>>> a22efb4d66 (GEOMESA-3061 Converters - support bytes in Avro top-level union types (#2762))
=======
>>>>>>> 1cad375176 (GEOMESA-3061 Converters - support bytes in Avro top-level union types (#2762))
<<<<<<< HEAD
=======
=======
>>>>>>> e182e6e99 (GEOMESA-3067 Find attribute in Filters with Functions with embedded expressions correctly)
=======
<<<<<<< HEAD
>>>>>>> 9943e05ec9 (GEOMESA-3067 Find attribute in Filters with Functions with embedded expressions correctly)
<<<<<<< HEAD
>>>>>>> 4373c901b3 (GEOMESA-3067 Find attribute in Filters with Functions with embedded expressions correctly)
=======
=======
>>>>>>> 9d708b240 (GEOMESA-3061 Converters - support bytes in Avro top-level union types (#2762))
=======
>>>>>>> 53a3e72cbf (GEOMESA-3061 Converters - support bytes in Avro top-level union types (#2762))
>>>>>>> 963feec660 (GEOMESA-3061 Converters - support bytes in Avro top-level union types (#2762))
=======
>>>>>>> d15af7157e (GEOMESA-3067 Find attribute in Filters with Functions with embedded expressions correctly)
>>>>>>> 2c14568a23 (GEOMESA-3067 Find attribute in Filters with Functions with embedded expressions correctly)
=======
>>>>>>> 947761ec9b (GEOMESA-3061 Converters - support bytes in Avro top-level union types (#2762))
>>>>>>> 84ac051f28 (GEOMESA-3061 Converters - support bytes in Avro top-level union types (#2762))
=======
>>>>>>> 9813375fcc (GEOMESA-3067 Find attribute in Filters with Functions with embedded expressions correctly)
>>>>>>> 99acaa0887 (GEOMESA-3067 Find attribute in Filters with Functions with embedded expressions correctly)
=======
>>>>>>> c9328eddce (GEOMESA-3061 Converters - support bytes in Avro top-level union types (#2762))
>>>>>>> fe3de10f11 (GEOMESA-3061 Converters - support bytes in Avro top-level union types (#2762))
=======
>>>>>>> a35efac12e (GEOMESA-3061 Converters - support bytes in Avro top-level union types (#2762))
=======
>>>>>>> 657a38673a (GEOMESA-3067 Find attribute in Filters with Functions with embedded expressions correctly)
=======
>>>>>>> 67b361c856 (GEOMESA-3061 Converters - support bytes in Avro top-level union types (#2762))
=======
>>>>>>> e8b736ee96 (GEOMESA-3061 Converters - support bytes in Avro top-level union types (#2762))
=======
>>>>>>> a5b160f47b (GEOMESA-3061 Converters - support bytes in Avro top-level union types (#2762))
=======
>>>>>>> 3333975e77 (GEOMESA-3067 Find attribute in Filters with Functions with embedded expressions correctly)
=======
>>>>>>> fa429c7863 (GEOMESA-3067 Find attribute in Filters with Functions with embedded expressions correctly)
=======
>>>>>>> 5cf31d21f3 (GEOMESA-3061 Converters - support bytes in Avro top-level union types (#2762))
=======
>>>>>>> def2794bb5 (GEOMESA-3067 Find attribute in Filters with Functions with embedded expressions correctly)
=======
>>>>>>> 67b361c85 (GEOMESA-3061 Converters - support bytes in Avro top-level union types (#2762))
=======
>>>>>>> 94fecee1d8 (GEOMESA-3061 Converters - support bytes in Avro top-level union types (#2762))
=======
>>>>>>> 3eb12f79a9 (GEOMESA-3061 Converters - support bytes in Avro top-level union types (#2762))
=======
>>>>>>> 7f922b040c (GEOMESA-3067 Find attribute in Filters with Functions with embedded expressions correctly)
=======
>>>>>>> 8b16ac5c65 (GEOMESA-3067 Find attribute in Filters with Functions with embedded expressions correctly)
=======
>>>>>>> 4ccd6f6b1f (GEOMESA-3061 Converters - support bytes in Avro top-level union types (#2762))
=======
>>>>>>> f983ea29f0 (GEOMESA-3067 Find attribute in Filters with Functions with embedded expressions correctly)
=======
>>>>>>> 67b361c85 (GEOMESA-3061 Converters - support bytes in Avro top-level union types (#2762))
=======
>>>>>>> 35b69b8f2f (GEOMESA-3061 Converters - support bytes in Avro top-level union types (#2762))
=======
>>>>>>> 240977229 (GEOMESA-3061 Converters - support bytes in Avro top-level union types (#2762))
=======
>>>>>>> 26a09ee6c2 (GEOMESA-3061 Converters - support bytes in Avro top-level union types (#2762))
=======
>>>>>>> 45ad5d11f (GEOMESA-3061 Converters - support bytes in Avro top-level union types (#2762))
=======
>>>>>>> 194ad4e5c0 (GEOMESA-3061 Converters - support bytes in Avro top-level union types (#2762))
=======
>>>>>>> 7b3c90c53f (GEOMESA-3061 Converters - support bytes in Avro top-level union types (#2762))
=======
=======
>>>>>>> e182e6e99 (GEOMESA-3067 Find attribute in Filters with Functions with embedded expressions correctly)
=======
<<<<<<< HEAD
>>>>>>> 9943e05ec9 (GEOMESA-3067 Find attribute in Filters with Functions with embedded expressions correctly)
<<<<<<< HEAD
>>>>>>> 1278241911 (GEOMESA-3067 Find attribute in Filters with Functions with embedded expressions correctly)
=======
=======
>>>>>>> 9d708b240 (GEOMESA-3061 Converters - support bytes in Avro top-level union types (#2762))
=======
>>>>>>> 53a3e72cbf (GEOMESA-3061 Converters - support bytes in Avro top-level union types (#2762))
>>>>>>> 3e7fb62639 (GEOMESA-3061 Converters - support bytes in Avro top-level union types (#2762))
=======
>>>>>>> d15af7157e (GEOMESA-3067 Find attribute in Filters with Functions with embedded expressions correctly)
>>>>>>> 00d66ae013 (GEOMESA-3067 Find attribute in Filters with Functions with embedded expressions correctly)
=======
>>>>>>> 947761ec9b (GEOMESA-3061 Converters - support bytes in Avro top-level union types (#2762))
>>>>>>> c2cfc968d2 (GEOMESA-3061 Converters - support bytes in Avro top-level union types (#2762))
=======
>>>>>>> 9813375fcc (GEOMESA-3067 Find attribute in Filters with Functions with embedded expressions correctly)
>>>>>>> 5d8dab9f81 (GEOMESA-3067 Find attribute in Filters with Functions with embedded expressions correctly)
=======
>>>>>>> c9328eddce (GEOMESA-3061 Converters - support bytes in Avro top-level union types (#2762))
>>>>>>> 0fa73844a1 (GEOMESA-3061 Converters - support bytes in Avro top-level union types (#2762))
=======
>>>>>>> 6e30236dd2 (GEOMESA-3061 Converters - support bytes in Avro top-level union types (#2762))
=======
=======
>>>>>>> a9884ff1f6 (GEOMESA-3067 Find attribute in Filters with Functions with embedded expressions correctly)
>>>>>>> 424e7de15a (GEOMESA-3067 Find attribute in Filters with Functions with embedded expressions correctly)
=======
>>>>>>> 988874c83e (GEOMESA-3061 Converters - support bytes in Avro top-level union types (#2762))
=======
=======
>>>>>>> d206a68a13 (GEOMESA-3061 Converters - support bytes in Avro top-level union types (#2762))
>>>>>>> e0c2527549 (GEOMESA-3061 Converters - support bytes in Avro top-level union types (#2762))
=======
>>>>>>> 4cf1d8d259 (GEOMESA-3067 Find attribute in Filters with Functions with embedded expressions correctly)
=======
=======
>>>>>>> 694bcd3776 (GEOMESA-3061 Converters - support bytes in Avro top-level union types (#2762))
>>>>>>> cb5e2daf2b (GEOMESA-3061 Converters - support bytes in Avro top-level union types (#2762))
=======
>>>>>>> 9bcad1eb67 (GEOMESA-3067 Find attribute in Filters with Functions with embedded expressions correctly)
=======
>>>>>>> 00e61f4b70 (GEOMESA-3061 Converters - support bytes in Avro top-level union types (#2762))
=======
=======
>>>>>>> 5dcf23da52 (GEOMESA-3061 Converters - support bytes in Avro top-level union types (#2762))
>>>>>>> 60b4637548 (GEOMESA-3061 Converters - support bytes in Avro top-level union types (#2762))
=======
>>>>>>> 6f81d40992 (GEOMESA-3067 Find attribute in Filters with Functions with embedded expressions correctly)
=======
=======
>>>>>>> 92674ff9d4 (GEOMESA-3061 Converters - support bytes in Avro top-level union types (#2762))
>>>>>>> 009a284072 (GEOMESA-3061 Converters - support bytes in Avro top-level union types (#2762))
=======
>>>>>>> 9df4f8a9f6 (GEOMESA-3067 Find attribute in Filters with Functions with embedded expressions correctly)
=======
>>>>>>> 7b8c8dcc3d (GEOMESA-3061 Converters - support bytes in Avro top-level union types (#2762))
=======
=======
>>>>>>> 240977229 (GEOMESA-3061 Converters - support bytes in Avro top-level union types (#2762))
=======
<<<<<<< HEAD
>>>>>>> 8c9ca1211a (GEOMESA-3061 Converters - support bytes in Avro top-level union types (#2762))
<<<<<<< HEAD
>>>>>>> 4f51687745 (GEOMESA-3061 Converters - support bytes in Avro top-level union types (#2762))
=======
=======
>>>>>>> 45ad5d11f (GEOMESA-3061 Converters - support bytes in Avro top-level union types (#2762))
=======
>>>>>>> a22efb4d66 (GEOMESA-3061 Converters - support bytes in Avro top-level union types (#2762))
>>>>>>> 9a2d40c613 (GEOMESA-3061 Converters - support bytes in Avro top-level union types (#2762))
=======
>>>>>>> 73770612e0 (GEOMESA-3061 Converters - support bytes in Avro top-level union types (#2762))
        Result.foreach(1 to 10) { j =>
>>>>>>> b9bdd406e (GEOMESA-3061 Converters - support bytes in Avro top-level union types (#2762))
=======
>>>>>>> f36b0e8b9 (GEOMESA-3067 Find attribute in Filters with Functions with embedded expressions correctly)
<<<<<<< HEAD
<<<<<<< HEAD
<<<<<<< HEAD
<<<<<<< HEAD
<<<<<<< HEAD
<<<<<<< HEAD
<<<<<<< HEAD
<<<<<<< HEAD
<<<<<<< HEAD
<<<<<<< HEAD
<<<<<<< HEAD
<<<<<<< HEAD
<<<<<<< HEAD
<<<<<<< HEAD
<<<<<<< HEAD
<<<<<<< HEAD
<<<<<<< HEAD
<<<<<<< HEAD
<<<<<<< HEAD
<<<<<<< HEAD
<<<<<<< HEAD
<<<<<<< HEAD
<<<<<<< HEAD
<<<<<<< HEAD
<<<<<<< HEAD
<<<<<<< HEAD
<<<<<<< HEAD
<<<<<<< HEAD
<<<<<<< HEAD
<<<<<<< HEAD
<<<<<<< HEAD
<<<<<<< HEAD
<<<<<<< HEAD
<<<<<<< HEAD
<<<<<<< HEAD
<<<<<<< HEAD
<<<<<<< HEAD
<<<<<<< HEAD
<<<<<<< HEAD
<<<<<<< HEAD
<<<<<<< HEAD
<<<<<<< HEAD
<<<<<<< HEAD
<<<<<<< HEAD
<<<<<<< HEAD
<<<<<<< HEAD
<<<<<<< HEAD
<<<<<<< HEAD
<<<<<<< HEAD
<<<<<<< HEAD
<<<<<<< HEAD
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
>>>>>>> 9bcad1eb67 (GEOMESA-3067 Find attribute in Filters with Functions with embedded expressions correctly)
=======
>>>>>>> 00e61f4b70 (GEOMESA-3061 Converters - support bytes in Avro top-level union types (#2762))
=======
>>>>>>> 60b4637548 (GEOMESA-3061 Converters - support bytes in Avro top-level union types (#2762))
=======
>>>>>>> 9df4f8a9f6 (GEOMESA-3067 Find attribute in Filters with Functions with embedded expressions correctly)
=======
>>>>>>> 7b8c8dcc3d (GEOMESA-3061 Converters - support bytes in Avro top-level union types (#2762))
=======
>>>>>>> 4f51687745 (GEOMESA-3061 Converters - support bytes in Avro top-level union types (#2762))
=======
>>>>>>> 73770612e0 (GEOMESA-3061 Converters - support bytes in Avro top-level union types (#2762))
=======
>>>>>>> d206a68a13 (GEOMESA-3061 Converters - support bytes in Avro top-level union types (#2762))
=======
>>>>>>> 24c4df93a5 (GEOMESA-3067 Find attribute in Filters with Functions with embedded expressions correctly)
<<<<<<< HEAD
<<<<<<< HEAD
=======
>>>>>>> 6cd1151639 (GEOMESA-3061 Converters - support bytes in Avro top-level union types (#2762))
=======
>>>>>>> 5dcf23da52 (GEOMESA-3061 Converters - support bytes in Avro top-level union types (#2762))
<<<<<<< HEAD
<<<<<<< HEAD
=======
>>>>>>> c169cb2905 (GEOMESA-3067 Find attribute in Filters with Functions with embedded expressions correctly)
=======
>>>>>>> 9a4dff9e4f (GEOMESA-3061 Converters - support bytes in Avro top-level union types (#2762))
<<<<<<< HEAD
<<<<<<< HEAD
=======
>>>>>>> 8c9ca1211a (GEOMESA-3061 Converters - support bytes in Avro top-level union types (#2762))
=======
>>>>>>> 1cad375176 (GEOMESA-3061 Converters - support bytes in Avro top-level union types (#2762))
<<<<<<< HEAD
=======
>>>>>>> 4373c901b3 (GEOMESA-3067 Find attribute in Filters with Functions with embedded expressions correctly)
=======
>>>>>>> 963feec660 (GEOMESA-3061 Converters - support bytes in Avro top-level union types (#2762))
=======
>>>>>>> 99acaa0887 (GEOMESA-3067 Find attribute in Filters with Functions with embedded expressions correctly)
=======
>>>>>>> fe3de10f11 (GEOMESA-3061 Converters - support bytes in Avro top-level union types (#2762))
=======
>>>>>>> bff2bdde04 (GEOMESA-3067 Find attribute in Filters with Functions with embedded expressions correctly)
=======
>>>>>>> a35efac12e (GEOMESA-3061 Converters - support bytes in Avro top-level union types (#2762))
=======
>>>>>>> d83561962d (GEOMESA-3067 Find attribute in Filters with Functions with embedded expressions correctly)
=======
>>>>>>> 3eb12f79a9 (GEOMESA-3061 Converters - support bytes in Avro top-level union types (#2762))
=======
>>>>>>> f983ea29f0 (GEOMESA-3067 Find attribute in Filters with Functions with embedded expressions correctly)
=======
>>>>>>> 35b69b8f2f (GEOMESA-3061 Converters - support bytes in Avro top-level union types (#2762))
=======
>>>>>>> 26a09ee6c2 (GEOMESA-3061 Converters - support bytes in Avro top-level union types (#2762))
=======
>>>>>>> 7b3c90c53f (GEOMESA-3061 Converters - support bytes in Avro top-level union types (#2762))
=======
>>>>>>> 1278241911 (GEOMESA-3067 Find attribute in Filters with Functions with embedded expressions correctly)
=======
>>>>>>> 3e7fb62639 (GEOMESA-3061 Converters - support bytes in Avro top-level union types (#2762))
=======
>>>>>>> 5d8dab9f81 (GEOMESA-3067 Find attribute in Filters with Functions with embedded expressions correctly)
=======
>>>>>>> 0fa73844a1 (GEOMESA-3061 Converters - support bytes in Avro top-level union types (#2762))
=======
>>>>>>> 53bc726472 (GEOMESA-3067 Find attribute in Filters with Functions with embedded expressions correctly)
=======
>>>>>>> 6e30236dd2 (GEOMESA-3061 Converters - support bytes in Avro top-level union types (#2762))
=======
>>>>>>> 6e297b9b6f (GEOMESA-3067 Find attribute in Filters with Functions with embedded expressions correctly)
=======
>>>>>>> 424e7de15a (GEOMESA-3067 Find attribute in Filters with Functions with embedded expressions correctly)
=======
>>>>>>> 988874c83e (GEOMESA-3061 Converters - support bytes in Avro top-level union types (#2762))
=======
=======
>>>>>>> d206a68a13 (GEOMESA-3061 Converters - support bytes in Avro top-level union types (#2762))
>>>>>>> e0c2527549 (GEOMESA-3061 Converters - support bytes in Avro top-level union types (#2762))
=======
>>>>>>> 9bcad1eb67 (GEOMESA-3067 Find attribute in Filters with Functions with embedded expressions correctly)
=======
=======
>>>>>>> 6cd1151639 (GEOMESA-3061 Converters - support bytes in Avro top-level union types (#2762))
>>>>>>> 00e61f4b70 (GEOMESA-3061 Converters - support bytes in Avro top-level union types (#2762))
=======
>>>>>>> 60b4637548 (GEOMESA-3061 Converters - support bytes in Avro top-level union types (#2762))
=======
=======
>>>>>>> c169cb2905 (GEOMESA-3067 Find attribute in Filters with Functions with embedded expressions correctly)
>>>>>>> 9df4f8a9f6 (GEOMESA-3067 Find attribute in Filters with Functions with embedded expressions correctly)
=======
>>>>>>> 7b8c8dcc3d (GEOMESA-3061 Converters - support bytes in Avro top-level union types (#2762))
=======
=======
>>>>>>> 8c9ca1211a (GEOMESA-3061 Converters - support bytes in Avro top-level union types (#2762))
>>>>>>> 4f51687745 (GEOMESA-3061 Converters - support bytes in Avro top-level union types (#2762))
=======
>>>>>>> 73770612e0 (GEOMESA-3061 Converters - support bytes in Avro top-level union types (#2762))
>>>>>>> a63cb7e740 (GEOMESA-3067 Find attribute in Filters with Functions with embedded expressions correctly)
=======
=======
>>>>>>> 9d708b240a (GEOMESA-3061 Converters - support bytes in Avro top-level union types (#2762))
=======
<<<<<<< HEAD
<<<<<<< HEAD
<<<<<<< HEAD
<<<<<<< HEAD
=======
>>>>>>> e0c2527549 (GEOMESA-3061 Converters - support bytes in Avro top-level union types (#2762))
=======
>>>>>>> 9bcad1eb67 (GEOMESA-3067 Find attribute in Filters with Functions with embedded expressions correctly)
>>>>>>> c3b0a1b6e3 (GEOMESA-3067 Find attribute in Filters with Functions with embedded expressions correctly)
=======
=======
<<<<<<< HEAD
<<<<<<< HEAD
<<<<<<< HEAD
<<<<<<< HEAD
<<<<<<< HEAD
=======
>>>>>>> 00e61f4b70 (GEOMESA-3061 Converters - support bytes in Avro top-level union types (#2762))
=======
>>>>>>> 4f51687745 (GEOMESA-3061 Converters - support bytes in Avro top-level union types (#2762))
>>>>>>> 22dcc8170f (GEOMESA-3061 Converters - support bytes in Avro top-level union types (#2762))
=======
>>>>>>> 238945d4b3 (GEOMESA-3061 Converters - support bytes in Avro top-level union types (#2762))
=======
=======
<<<<<<< HEAD
<<<<<<< HEAD
<<<<<<< HEAD
<<<<<<< HEAD
>>>>>>> 7b0539b808 (GEOMESA-3061 Converters - support bytes in Avro top-level union types (#2762))
=======
>>>>>>> cf57a2c189 (GEOMESA-3067 Find attribute in Filters with Functions with embedded expressions correctly)
=======
<<<<<<< HEAD
<<<<<<< HEAD
<<<<<<< HEAD
<<<<<<< HEAD
>>>>>>> e15d50d7d3 (GEOMESA-3061 Converters - support bytes in Avro top-level union types (#2762))
=======
>>>>>>> 1b60c2aeba (GEOMESA-3067 Find attribute in Filters with Functions with embedded expressions correctly)
=======
<<<<<<< HEAD
<<<<<<< HEAD
<<<<<<< HEAD
<<<<<<< HEAD
>>>>>>> d294ce49e2 (GEOMESA-3061 Converters - support bytes in Avro top-level union types (#2762))
=======
=======
>>>>>>> 7b0539b808 (GEOMESA-3061 Converters - support bytes in Avro top-level union types (#2762))
=======
>>>>>>> 963feec660 (GEOMESA-3061 Converters - support bytes in Avro top-level union types (#2762))
=======
>>>>>>> e15d50d7d3 (GEOMESA-3061 Converters - support bytes in Avro top-level union types (#2762))
=======
>>>>>>> fe3de10f11 (GEOMESA-3061 Converters - support bytes in Avro top-level union types (#2762))
=======
>>>>>>> bff2bdde04 (GEOMESA-3067 Find attribute in Filters with Functions with embedded expressions correctly)
=======
>>>>>>> d294ce49e2 (GEOMESA-3061 Converters - support bytes in Avro top-level union types (#2762))
=======
>>>>>>> a35efac12e (GEOMESA-3061 Converters - support bytes in Avro top-level union types (#2762))
=======
>>>>>>> 7b0539b808 (GEOMESA-3061 Converters - support bytes in Avro top-level union types (#2762))
=======
>>>>>>> 3e7fb62639 (GEOMESA-3061 Converters - support bytes in Avro top-level union types (#2762))
=======
>>>>>>> e15d50d7d3 (GEOMESA-3061 Converters - support bytes in Avro top-level union types (#2762))
=======
>>>>>>> 0fa73844a1 (GEOMESA-3061 Converters - support bytes in Avro top-level union types (#2762))
=======
>>>>>>> 53bc726472 (GEOMESA-3067 Find attribute in Filters with Functions with embedded expressions correctly)
=======
>>>>>>> d294ce49e2 (GEOMESA-3061 Converters - support bytes in Avro top-level union types (#2762))
=======
>>>>>>> 6e30236dd2 (GEOMESA-3061 Converters - support bytes in Avro top-level union types (#2762))
>>>>>>> 9943e05ec9 (GEOMESA-3067 Find attribute in Filters with Functions with embedded expressions correctly)
>>>>>>> 3254b186da (GEOMESA-3067 Find attribute in Filters with Functions with embedded expressions correctly)
=======
=======
>>>>>>> 22dcc8170f (GEOMESA-3061 Converters - support bytes in Avro top-level union types (#2762))
=======
<<<<<<< HEAD
<<<<<<< HEAD
<<<<<<< HEAD
<<<<<<< HEAD
=======
>>>>>>> 73770612e0 (GEOMESA-3061 Converters - support bytes in Avro top-level union types (#2762))
>>>>>>> 8c9ca1211a (GEOMESA-3061 Converters - support bytes in Avro top-level union types (#2762))
=======
>>>>>>> 238945d4b3 (GEOMESA-3061 Converters - support bytes in Avro top-level union types (#2762))
=======
>>>>>>> 1cad375176 (GEOMESA-3061 Converters - support bytes in Avro top-level union types (#2762))
<<<<<<< HEAD
=======
=======
>>>>>>> 99acaa0887 (GEOMESA-3067 Find attribute in Filters with Functions with embedded expressions correctly)
>>>>>>> 9943e05ec9 (GEOMESA-3067 Find attribute in Filters with Functions with embedded expressions correctly)
>>>>>>> 3254b186da (GEOMESA-3067 Find attribute in Filters with Functions with embedded expressions correctly)
=======
>>>>>>> 4373c901b3 (GEOMESA-3067 Find attribute in Filters with Functions with embedded expressions correctly)
=======
>>>>>>> 22dcc8170f (GEOMESA-3061 Converters - support bytes in Avro top-level union types (#2762))
=======
>>>>>>> 26a09ee6c2 (GEOMESA-3061 Converters - support bytes in Avro top-level union types (#2762))
=======
>>>>>>> 238945d4b3 (GEOMESA-3061 Converters - support bytes in Avro top-level union types (#2762))
=======
>>>>>>> 7b3c90c53f (GEOMESA-3061 Converters - support bytes in Avro top-level union types (#2762))
=======
=======
>>>>>>> 5d8dab9f81 (GEOMESA-3067 Find attribute in Filters with Functions with embedded expressions correctly)
>>>>>>> 9943e05ec9 (GEOMESA-3067 Find attribute in Filters with Functions with embedded expressions correctly)
>>>>>>> 3254b186da (GEOMESA-3067 Find attribute in Filters with Functions with embedded expressions correctly)
=======
>>>>>>> 1278241911 (GEOMESA-3067 Find attribute in Filters with Functions with embedded expressions correctly)
=======
>>>>>>> 8c9ca1211a (GEOMESA-3061 Converters - support bytes in Avro top-level union types (#2762))
>>>>>>> 4f51687745 (GEOMESA-3061 Converters - support bytes in Avro top-level union types (#2762))
=======
>>>>>>> 73770612e0 (GEOMESA-3061 Converters - support bytes in Avro top-level union types (#2762))
>>>>>>> 67b361c85 (GEOMESA-3061 Converters - support bytes in Avro top-level union types (#2762))
>>>>>>> c8a325e13c (GEOMESA-3061 Converters - support bytes in Avro top-level union types (#2762))
=======
>>>>>>> e6e1f4bdd5 (GEOMESA-3061 Converters - support bytes in Avro top-level union types (#2762))
=======
<<<<<<< HEAD
<<<<<<< HEAD
<<<<<<< HEAD
<<<<<<< HEAD
<<<<<<< HEAD
=======
>>>>>>> 60b4637548 (GEOMESA-3061 Converters - support bytes in Avro top-level union types (#2762))
=======
>>>>>>> 9df4f8a9f6 (GEOMESA-3067 Find attribute in Filters with Functions with embedded expressions correctly)
>>>>>>> 8fb0607344 (GEOMESA-3067 Find attribute in Filters with Functions with embedded expressions correctly)
=======
>>>>>>> 8fb0607344 (GEOMESA-3067 Find attribute in Filters with Functions with embedded expressions correctly)
=======
<<<<<<< HEAD
>>>>>>> f983ea29f0 (GEOMESA-3067 Find attribute in Filters with Functions with embedded expressions correctly)
=======
=======
>>>>>>> 67b361c85 (GEOMESA-3061 Converters - support bytes in Avro top-level union types (#2762))
>>>>>>> ad3cedc4db (GEOMESA-3061 Converters - support bytes in Avro top-level union types (#2762))
=======
<<<<<<< HEAD
<<<<<<< HEAD
<<<<<<< HEAD
<<<<<<< HEAD
<<<<<<< HEAD
=======
>>>>>>> 7b8c8dcc3d (GEOMESA-3061 Converters - support bytes in Avro top-level union types (#2762))
=======
>>>>>>> 4f51687745 (GEOMESA-3061 Converters - support bytes in Avro top-level union types (#2762))
>>>>>>> 240977229 (GEOMESA-3061 Converters - support bytes in Avro top-level union types (#2762))
=======
>>>>>>> 240977229 (GEOMESA-3061 Converters - support bytes in Avro top-level union types (#2762))
=======
<<<<<<< HEAD
>>>>>>> 26a09ee6c2 (GEOMESA-3061 Converters - support bytes in Avro top-level union types (#2762))
=======
=======
=======
>>>>>>> 7b3c90c53f (GEOMESA-3061 Converters - support bytes in Avro top-level union types (#2762))
>>>>>>> 67b361c85 (GEOMESA-3061 Converters - support bytes in Avro top-level union types (#2762))
>>>>>>> dace2085b (GEOMESA-3061 Converters - support bytes in Avro top-level union types (#2762))
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
>>>>>>> 73770612e0 (GEOMESA-3061 Converters - support bytes in Avro top-level union types (#2762))
>>>>>>> 9813375fcc (GEOMESA-3067 Find attribute in Filters with Functions with embedded expressions correctly)
=======
>>>>>>> c9328eddce (GEOMESA-3061 Converters - support bytes in Avro top-level union types (#2762))
=======
<<<<<<< HEAD
<<<<<<< HEAD
<<<<<<< HEAD
<<<<<<< HEAD
>>>>>>> 38b3282770 (GEOMESA-3067 Find attribute in Filters with Functions with embedded expressions correctly)
=======
>>>>>>> 9abc630fdf (GEOMESA-3061 Converters - support bytes in Avro top-level union types (#2762))
=======
<<<<<<< HEAD
<<<<<<< HEAD
=======
>>>>>>> 963feec660 (GEOMESA-3061 Converters - support bytes in Avro top-level union types (#2762))
=======
>>>>>>> 9813375fcc (GEOMESA-3067 Find attribute in Filters with Functions with embedded expressions correctly)
=======
>>>>>>> 99acaa0887 (GEOMESA-3067 Find attribute in Filters with Functions with embedded expressions correctly)
=======
>>>>>>> fe3de10f11 (GEOMESA-3061 Converters - support bytes in Avro top-level union types (#2762))
=======
>>>>>>> 38b3282770 (GEOMESA-3067 Find attribute in Filters with Functions with embedded expressions correctly)
=======
>>>>>>> bff2bdde04 (GEOMESA-3067 Find attribute in Filters with Functions with embedded expressions correctly)
=======
>>>>>>> a35efac12e (GEOMESA-3061 Converters - support bytes in Avro top-level union types (#2762))
=======
>>>>>>> 3e7fb62639 (GEOMESA-3061 Converters - support bytes in Avro top-level union types (#2762))
=======
>>>>>>> 9813375fcc (GEOMESA-3067 Find attribute in Filters with Functions with embedded expressions correctly)
=======
>>>>>>> 5d8dab9f81 (GEOMESA-3067 Find attribute in Filters with Functions with embedded expressions correctly)
=======
>>>>>>> 0fa73844a1 (GEOMESA-3061 Converters - support bytes in Avro top-level union types (#2762))
=======
>>>>>>> 38b3282770 (GEOMESA-3067 Find attribute in Filters with Functions with embedded expressions correctly)
=======
>>>>>>> 53bc726472 (GEOMESA-3067 Find attribute in Filters with Functions with embedded expressions correctly)
=======
>>>>>>> 6e30236dd2 (GEOMESA-3061 Converters - support bytes in Avro top-level union types (#2762))
>>>>>>> 67b361c85 (GEOMESA-3061 Converters - support bytes in Avro top-level union types (#2762))
=======
>>>>>>> 9d708b240 (GEOMESA-3061 Converters - support bytes in Avro top-level union types (#2762))
>>>>>>> 53a3e72cbf (GEOMESA-3061 Converters - support bytes in Avro top-level union types (#2762))
=======
<<<<<<< HEAD
<<<<<<< HEAD
<<<<<<< HEAD
<<<<<<< HEAD
>>>>>>> c3b0a1b6e (GEOMESA-3067 Find attribute in Filters with Functions with embedded expressions correctly)
=======
>>>>>>> c3b0a1b6e (GEOMESA-3067 Find attribute in Filters with Functions with embedded expressions correctly)
=======
<<<<<<< HEAD
>>>>>>> 5d8dab9f81 (GEOMESA-3067 Find attribute in Filters with Functions with embedded expressions correctly)
=======
>>>>>>> c3b0a1b6e (GEOMESA-3067 Find attribute in Filters with Functions with embedded expressions correctly)
=======
<<<<<<< HEAD
>>>>>>> 99acaa0887 (GEOMESA-3067 Find attribute in Filters with Functions with embedded expressions correctly)
=======
=======
>>>>>>> 67b361c85 (GEOMESA-3061 Converters - support bytes in Avro top-level union types (#2762))
>>>>>>> c8a325e13 (GEOMESA-3061 Converters - support bytes in Avro top-level union types (#2762))
=======
>>>>>>> 8fb060734 (GEOMESA-3067 Find attribute in Filters with Functions with embedded expressions correctly)
<<<<<<< HEAD
<<<<<<< HEAD
=======
=======
<<<<<<< HEAD
>>>>>>> 53bc726472 (GEOMESA-3067 Find attribute in Filters with Functions with embedded expressions correctly)
=======
=======
<<<<<<< HEAD
>>>>>>> bff2bdde04 (GEOMESA-3067 Find attribute in Filters with Functions with embedded expressions correctly)
=======
=======
>>>>>>> 67b361c85 (GEOMESA-3061 Converters - support bytes in Avro top-level union types (#2762))
>>>>>>> ad3cedc4d (GEOMESA-3061 Converters - support bytes in Avro top-level union types (#2762))
=======
>>>>>>> 125ffd0575 (GEOMESA-3067 Find attribute in Filters with Functions with embedded expressions correctly)
<<<<<<< HEAD
<<<<<<< HEAD
=======
=======
<<<<<<< HEAD
>>>>>>> 6e297b9b6f (GEOMESA-3067 Find attribute in Filters with Functions with embedded expressions correctly)
=======
=======
>>>>>>> d83561962d (GEOMESA-3067 Find attribute in Filters with Functions with embedded expressions correctly)
=======
=======
=======
>>>>>>> 988874c83e (GEOMESA-3061 Converters - support bytes in Avro top-level union types (#2762))
>>>>>>> a63cb7e740 (GEOMESA-3067 Find attribute in Filters with Functions with embedded expressions correctly)
=======
=======
>>>>>>> f7cef54062 (GEOMESA-3061 Converters - support bytes in Avro top-level union types (#2762))
=======
<<<<<<< HEAD
<<<<<<< HEAD
>>>>>>> d206a68a13 (GEOMESA-3061 Converters - support bytes in Avro top-level union types (#2762))
=======
>>>>>>> c3b0a1b6e3 (GEOMESA-3067 Find attribute in Filters with Functions with embedded expressions correctly)
=======
>>>>>>> 24c4df93a5 (GEOMESA-3067 Find attribute in Filters with Functions with embedded expressions correctly)
=======
<<<<<<< HEAD
<<<<<<< HEAD
>>>>>>> 67b361c85 (GEOMESA-3061 Converters - support bytes in Avro top-level union types (#2762))
>>>>>>> c8a325e13c (GEOMESA-3061 Converters - support bytes in Avro top-level union types (#2762))
=======
<<<<<<< HEAD
>>>>>>> 6cd1151639 (GEOMESA-3061 Converters - support bytes in Avro top-level union types (#2762))
=======
>>>>>>> e6e1f4bdd5 (GEOMESA-3061 Converters - support bytes in Avro top-level union types (#2762))
=======
>>>>>>> 3eb12f79a9 (GEOMESA-3061 Converters - support bytes in Avro top-level union types (#2762))
=======
>>>>>>> 5dcf23da52 (GEOMESA-3061 Converters - support bytes in Avro top-level union types (#2762))
=======
>>>>>>> 8fb0607344 (GEOMESA-3067 Find attribute in Filters with Functions with embedded expressions correctly)
=======
>>>>>>> c169cb2905 (GEOMESA-3067 Find attribute in Filters with Functions with embedded expressions correctly)
=======
>>>>>>> 9a4dff9e4f (GEOMESA-3061 Converters - support bytes in Avro top-level union types (#2762))
=======
<<<<<<< HEAD
<<<<<<< HEAD
=======
>>>>>>> 4f51687745 (GEOMESA-3061 Converters - support bytes in Avro top-level union types (#2762))
>>>>>>> 240977229 (GEOMESA-3061 Converters - support bytes in Avro top-level union types (#2762))
=======
>>>>>>> 8c9ca1211a (GEOMESA-3061 Converters - support bytes in Avro top-level union types (#2762))
=======
<<<<<<< HEAD
<<<<<<< HEAD
=======
>>>>>>> 1cad375176 (GEOMESA-3061 Converters - support bytes in Avro top-level union types (#2762))
=======
=======
>>>>>>> 963feec660 (GEOMESA-3061 Converters - support bytes in Avro top-level union types (#2762))
=======
=======
>>>>>>> 0fa73844a1 (GEOMESA-3061 Converters - support bytes in Avro top-level union types (#2762))
>>>>>>> 67b361c85 (GEOMESA-3061 Converters - support bytes in Avro top-level union types (#2762))
>>>>>>> c8a325e13 (GEOMESA-3061 Converters - support bytes in Avro top-level union types (#2762))
=======
=======
<<<<<<< HEAD
>>>>>>> fe3de10f11 (GEOMESA-3061 Converters - support bytes in Avro top-level union types (#2762))
=======
=======
>>>>>>> 6e30236dd2 (GEOMESA-3061 Converters - support bytes in Avro top-level union types (#2762))
>>>>>>> 67b361c85 (GEOMESA-3061 Converters - support bytes in Avro top-level union types (#2762))
>>>>>>> ad3cedc4d (GEOMESA-3061 Converters - support bytes in Avro top-level union types (#2762))
=======
=======
<<<<<<< HEAD
>>>>>>> a35efac12e (GEOMESA-3061 Converters - support bytes in Avro top-level union types (#2762))
=======
>>>>>>> 67b361c85 (GEOMESA-3061 Converters - support bytes in Avro top-level union types (#2762))
>>>>>>> ad3cedc4db (GEOMESA-3061 Converters - support bytes in Avro top-level union types (#2762))
=======
=======
>>>>>>> 35b69b8f2f (GEOMESA-3061 Converters - support bytes in Avro top-level union types (#2762))
=======
>>>>>>> 7b3c90c53f (GEOMESA-3061 Converters - support bytes in Avro top-level union types (#2762))
=======
=======
>>>>>>> 3e7fb62639 (GEOMESA-3061 Converters - support bytes in Avro top-level union types (#2762))
=======
>>>>>>> 0fa73844a1 (GEOMESA-3061 Converters - support bytes in Avro top-level union types (#2762))
=======
>>>>>>> 6e30236dd2 (GEOMESA-3061 Converters - support bytes in Avro top-level union types (#2762))
=======
>>>>>>> 988874c83e (GEOMESA-3061 Converters - support bytes in Avro top-level union types (#2762))
=======
>>>>>>> d206a68a13 (GEOMESA-3061 Converters - support bytes in Avro top-level union types (#2762))
=======
>>>>>>> e0c2527549 (GEOMESA-3061 Converters - support bytes in Avro top-level union types (#2762))
=======
>>>>>>> 9bcad1eb67 (GEOMESA-3067 Find attribute in Filters with Functions with embedded expressions correctly)
=======
>>>>>>> 67b361c85 (GEOMESA-3061 Converters - support bytes in Avro top-level union types (#2762))
>>>>>>> c8a325e13c (GEOMESA-3061 Converters - support bytes in Avro top-level union types (#2762))
=======
>>>>>>> 6cd1151639 (GEOMESA-3061 Converters - support bytes in Avro top-level union types (#2762))
=======
<<<<<<< HEAD
>>>>>>> 00e61f4b70 (GEOMESA-3061 Converters - support bytes in Avro top-level union types (#2762))
=======
>>>>>>> 5dcf23da52 (GEOMESA-3061 Converters - support bytes in Avro top-level union types (#2762))
=======
<<<<<<< HEAD
>>>>>>> 60b4637548 (GEOMESA-3061 Converters - support bytes in Avro top-level union types (#2762))
=======
>>>>>>> 8fb0607344 (GEOMESA-3067 Find attribute in Filters with Functions with embedded expressions correctly)
=======
>>>>>>> c169cb2905 (GEOMESA-3067 Find attribute in Filters with Functions with embedded expressions correctly)
=======
>>>>>>> 9df4f8a9f6 (GEOMESA-3067 Find attribute in Filters with Functions with embedded expressions correctly)
=======
>>>>>>> 7b8c8dcc3d (GEOMESA-3061 Converters - support bytes in Avro top-level union types (#2762))
=======
>>>>>>> 4f51687745 (GEOMESA-3061 Converters - support bytes in Avro top-level union types (#2762))
=======
=======
>>>>>>> 1cad375176 (GEOMESA-3061 Converters - support bytes in Avro top-level union types (#2762))
>>>>>>> 73770612e0 (GEOMESA-3061 Converters - support bytes in Avro top-level union types (#2762))
        Result.foreach(1 to 10) { j =>
>>>>>>> b9bdd406e (GEOMESA-3061 Converters - support bytes in Avro top-level union types (#2762))
>>>>>>> cdb410251 (GEOMESA-3061 Converters - support bytes in Avro top-level union types (#2762))
<<<<<<< HEAD
<<<<<<< HEAD
<<<<<<< HEAD
<<<<<<< HEAD
<<<<<<< HEAD
<<<<<<< HEAD
<<<<<<< HEAD
<<<<<<< HEAD
<<<<<<< HEAD
<<<<<<< HEAD
<<<<<<< HEAD
<<<<<<< HEAD
<<<<<<< HEAD
<<<<<<< HEAD
<<<<<<< HEAD
<<<<<<< HEAD
<<<<<<< HEAD
<<<<<<< HEAD
<<<<<<< HEAD
<<<<<<< HEAD
<<<<<<< HEAD
<<<<<<< HEAD
<<<<<<< HEAD
<<<<<<< HEAD
<<<<<<< HEAD
<<<<<<< HEAD
<<<<<<< HEAD
<<<<<<< HEAD
<<<<<<< HEAD
<<<<<<< HEAD
<<<<<<< HEAD
<<<<<<< HEAD
<<<<<<< HEAD
<<<<<<< HEAD
<<<<<<< HEAD
<<<<<<< HEAD
<<<<<<< HEAD
<<<<<<< HEAD
<<<<<<< HEAD
<<<<<<< HEAD
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
>>>>>>> 4cf1d8d259 (GEOMESA-3067 Find attribute in Filters with Functions with embedded expressions correctly)
=======
>>>>>>> 00e61f4b70 (GEOMESA-3061 Converters - support bytes in Avro top-level union types (#2762))
=======
>>>>>>> 60b4637548 (GEOMESA-3061 Converters - support bytes in Avro top-level union types (#2762))
=======
>>>>>>> 6f81d40992 (GEOMESA-3067 Find attribute in Filters with Functions with embedded expressions correctly)
=======
>>>>>>> 7b8c8dcc3d (GEOMESA-3061 Converters - support bytes in Avro top-level union types (#2762))
=======
>>>>>>> 4f51687745 (GEOMESA-3061 Converters - support bytes in Avro top-level union types (#2762))
=======
>>>>>>> 73770612e0 (GEOMESA-3061 Converters - support bytes in Avro top-level union types (#2762))
=======
>>>>>>> d206a68a13 (GEOMESA-3061 Converters - support bytes in Avro top-level union types (#2762))
=======
>>>>>>> 9412e85b59 (GEOMESA-3067 Find attribute in Filters with Functions with embedded expressions correctly)
<<<<<<< HEAD
<<<<<<< HEAD
=======
>>>>>>> 6cd1151639 (GEOMESA-3061 Converters - support bytes in Avro top-level union types (#2762))
=======
>>>>>>> 5dcf23da52 (GEOMESA-3061 Converters - support bytes in Avro top-level union types (#2762))
<<<<<<< HEAD
<<<<<<< HEAD
=======
>>>>>>> 2b62d1f3fe (GEOMESA-3067 Find attribute in Filters with Functions with embedded expressions correctly)
=======
>>>>>>> 9a4dff9e4f (GEOMESA-3061 Converters - support bytes in Avro top-level union types (#2762))
<<<<<<< HEAD
<<<<<<< HEAD
=======
>>>>>>> 8c9ca1211a (GEOMESA-3061 Converters - support bytes in Avro top-level union types (#2762))
=======
>>>>>>> 1cad375176 (GEOMESA-3061 Converters - support bytes in Avro top-level union types (#2762))
<<<<<<< HEAD
=======
>>>>>>> 963feec660 (GEOMESA-3061 Converters - support bytes in Avro top-level union types (#2762))
=======
>>>>>>> 2c14568a23 (GEOMESA-3067 Find attribute in Filters with Functions with embedded expressions correctly)
=======
>>>>>>> fe3de10f11 (GEOMESA-3061 Converters - support bytes in Avro top-level union types (#2762))
=======
>>>>>>> 511bd92a86 (GEOMESA-3067 Find attribute in Filters with Functions with embedded expressions correctly)
=======
>>>>>>> a35efac12e (GEOMESA-3061 Converters - support bytes in Avro top-level union types (#2762))
=======
>>>>>>> de7d6ef448 (GEOMESA-3067 Find attribute in Filters with Functions with embedded expressions correctly)
=======
>>>>>>> 3eb12f79a9 (GEOMESA-3061 Converters - support bytes in Avro top-level union types (#2762))
=======
>>>>>>> 8b16ac5c65 (GEOMESA-3067 Find attribute in Filters with Functions with embedded expressions correctly)
=======
>>>>>>> 35b69b8f2f (GEOMESA-3061 Converters - support bytes in Avro top-level union types (#2762))
=======
>>>>>>> 26a09ee6c2 (GEOMESA-3061 Converters - support bytes in Avro top-level union types (#2762))
=======
>>>>>>> 7b3c90c53f (GEOMESA-3061 Converters - support bytes in Avro top-level union types (#2762))
=======
>>>>>>> 3e7fb62639 (GEOMESA-3061 Converters - support bytes in Avro top-level union types (#2762))
=======
>>>>>>> 00d66ae013 (GEOMESA-3067 Find attribute in Filters with Functions with embedded expressions correctly)
=======
>>>>>>> 0fa73844a1 (GEOMESA-3061 Converters - support bytes in Avro top-level union types (#2762))
=======
>>>>>>> 8e70a881a6 (GEOMESA-3067 Find attribute in Filters with Functions with embedded expressions correctly)
=======
>>>>>>> 6e30236dd2 (GEOMESA-3061 Converters - support bytes in Avro top-level union types (#2762))
=======
>>>>>>> f7fc21ae20 (GEOMESA-3067 Find attribute in Filters with Functions with embedded expressions correctly)
=======
>>>>>>> 988874c83e (GEOMESA-3061 Converters - support bytes in Avro top-level union types (#2762))
=======
=======
>>>>>>> d206a68a13 (GEOMESA-3061 Converters - support bytes in Avro top-level union types (#2762))
>>>>>>> e0c2527549 (GEOMESA-3061 Converters - support bytes in Avro top-level union types (#2762))
=======
>>>>>>> 4cf1d8d259 (GEOMESA-3067 Find attribute in Filters with Functions with embedded expressions correctly)
=======
=======
>>>>>>> 6cd1151639 (GEOMESA-3061 Converters - support bytes in Avro top-level union types (#2762))
>>>>>>> 00e61f4b70 (GEOMESA-3061 Converters - support bytes in Avro top-level union types (#2762))
=======
>>>>>>> 60b4637548 (GEOMESA-3061 Converters - support bytes in Avro top-level union types (#2762))
=======
=======
>>>>>>> 2b62d1f3fe (GEOMESA-3067 Find attribute in Filters with Functions with embedded expressions correctly)
>>>>>>> 6f81d40992 (GEOMESA-3067 Find attribute in Filters with Functions with embedded expressions correctly)
=======
>>>>>>> 7b8c8dcc3d (GEOMESA-3061 Converters - support bytes in Avro top-level union types (#2762))
=======
=======
>>>>>>> 8c9ca1211a (GEOMESA-3061 Converters - support bytes in Avro top-level union types (#2762))
>>>>>>> 4f51687745 (GEOMESA-3061 Converters - support bytes in Avro top-level union types (#2762))
=======
>>>>>>> 73770612e0 (GEOMESA-3061 Converters - support bytes in Avro top-level union types (#2762))
>>>>>>> 67b361c856 (GEOMESA-3061 Converters - support bytes in Avro top-level union types (#2762))
=======
=======
=======
>>>>>>> cdb4102515 (GEOMESA-3061 Converters - support bytes in Avro top-level union types (#2762))
>>>>>>> 7bdbfa5524 (GEOMESA-3061 Converters - support bytes in Avro top-level union types (#2762))
        Result.foreach(1 to 10) { j =>
=======
        Result.foreach(1 to 10){ j =>
>>>>>>> 7acc3ea46 (GEOMESA-3067 Find attribute in Filters with Functions with embedded expressions correctly)
<<<<<<< HEAD
>>>>>>> 908ad4071d (GEOMESA-3067 Find attribute in Filters with Functions with embedded expressions correctly)
=======
=======
        Result.foreach(1 to 10) { j =>
>>>>>>> b9bdd406e (GEOMESA-3061 Converters - support bytes in Avro top-level union types (#2762))
>>>>>>> b4320946b4 (GEOMESA-3061 Converters - support bytes in Avro top-level union types (#2762))
<<<<<<< HEAD
<<<<<<< HEAD
<<<<<<< HEAD
<<<<<<< HEAD
=======
>>>>>>> aea9fbe131 (GEOMESA-3061 Converters - support bytes in Avro top-level union types (#2762))
=======
>>>>>>> d581fa3e8f (Merge branch 'feature/postgis-fixes')
=======
        Result.foreach(1 to 10) { j =>
>>>>>>> 3be8d2a5a4 (Merge branch 'feature/postgis-fixes')
=======
        Result.foreach(1 to 10) { j =>
=======
        Result.foreach(1 to 10){ j =>
>>>>>>> 7acc3ea46 (GEOMESA-3067 Find attribute in Filters with Functions with embedded expressions correctly)
>>>>>>> 907fb0b08a (GEOMESA-3067 Find attribute in Filters with Functions with embedded expressions correctly)
<<<<<<< HEAD
<<<<<<< HEAD
<<<<<<< HEAD
<<<<<<< HEAD
=======
>>>>>>> 810876750d (GEOMESA-3061 Converters - support bytes in Avro top-level union types (#2762))
=======
>>>>>>> ca1e0fad13 (GEOMESA-3067 Find attribute in Filters with Functions with embedded expressions correctly)
=======
=======
>>>>>>> 810876750d (GEOMESA-3061 Converters - support bytes in Avro top-level union types (#2762))
>>>>>>> 5a55bf9756 (GEOMESA-3061 Converters - support bytes in Avro top-level union types (#2762))
=======
=======
        Result.foreach(1 to 10) { j =>
>>>>>>> b9bdd406e (GEOMESA-3061 Converters - support bytes in Avro top-level union types (#2762))
>>>>>>> d9ed077cd1 (GEOMESA-3061 Converters - support bytes in Avro top-level union types (#2762))
<<<<<<< HEAD
<<<<<<< HEAD
<<<<<<< HEAD
<<<<<<< HEAD
=======
>>>>>>> 5a55bf9756 (GEOMESA-3061 Converters - support bytes in Avro top-level union types (#2762))
=======
>>>>>>> adfec3a47a (GEOMESA-3067 Find attribute in Filters with Functions with embedded expressions correctly)
=======
=======
>>>>>>> c3c5dd0ebb (GEOMESA-3061 Converters - support bytes in Avro top-level union types (#2762))
=======
<<<<<<< HEAD
<<<<<<< HEAD
<<<<<<< HEAD
<<<<<<< HEAD
>>>>>>> 67b361c85 (GEOMESA-3061 Converters - support bytes in Avro top-level union types (#2762))
=======
=======
=======
=======
>>>>>>> 2571e49519 (GEOMESA-3067 Find attribute in Filters with Functions with embedded expressions correctly)
<<<<<<< HEAD
=======
>>>>>>> 2654d9c120 (GEOMESA-3061 Converters - support bytes in Avro top-level union types (#2762))
=======
>>>>>>> 67b361c85 (GEOMESA-3061 Converters - support bytes in Avro top-level union types (#2762))
=======
>>>>>>> 86ec77f9cb (GEOMESA-3061 Converters - support bytes in Avro top-level union types (#2762))
=======
>>>>>>> 058fd96baa (GEOMESA-3061 Converters - support bytes in Avro top-level union types (#2762))
=======
>>>>>>> 67b361c85 (GEOMESA-3061 Converters - support bytes in Avro top-level union types (#2762))
=======
>>>>>>> 2a887f75bf (GEOMESA-3061 Converters - support bytes in Avro top-level union types (#2762))
=======
>>>>>>> adfec3a47a (GEOMESA-3067 Find attribute in Filters with Functions with embedded expressions correctly)
        Result.foreach(1 to 10) { j =>
>>>>>>> b9bdd406e (GEOMESA-3061 Converters - support bytes in Avro top-level union types (#2762))
=======
>>>>>>> f36b0e8b9 (GEOMESA-3067 Find attribute in Filters with Functions with embedded expressions correctly)
<<<<<<< HEAD
<<<<<<< HEAD
<<<<<<< HEAD
<<<<<<< HEAD
<<<<<<< HEAD
<<<<<<< HEAD
<<<<<<< HEAD
<<<<<<< HEAD
=======
>>>>>>> 2654d9c120 (GEOMESA-3061 Converters - support bytes in Avro top-level union types (#2762))
=======
>>>>>>> 86ec77f9cb (GEOMESA-3061 Converters - support bytes in Avro top-level union types (#2762))
=======
>>>>>>> 058fd96baa (GEOMESA-3061 Converters - support bytes in Avro top-level union types (#2762))
=======
>>>>>>> 2a887f75bf (GEOMESA-3061 Converters - support bytes in Avro top-level union types (#2762))
=======
>>>>>>> adfec3a47a (GEOMESA-3067 Find attribute in Filters with Functions with embedded expressions correctly)
>>>>>>> e182e6e99c (GEOMESA-3067 Find attribute in Filters with Functions with embedded expressions correctly)
=======
>>>>>>> 9d708b240a (GEOMESA-3061 Converters - support bytes in Avro top-level union types (#2762))
=======
=======
>>>>>>> c8a325e13c (GEOMESA-3061 Converters - support bytes in Avro top-level union types (#2762))
=======
>>>>>>> ad3cedc4db (GEOMESA-3061 Converters - support bytes in Avro top-level union types (#2762))
=======
<<<<<<< HEAD
<<<<<<< HEAD
<<<<<<< HEAD
<<<<<<< HEAD
<<<<<<< HEAD
<<<<<<< HEAD
=======
>>>>>>> 7b8c8dcc3d (GEOMESA-3061 Converters - support bytes in Avro top-level union types (#2762))
=======
>>>>>>> 4f51687745 (GEOMESA-3061 Converters - support bytes in Avro top-level union types (#2762))
>>>>>>> 22dcc8170f (GEOMESA-3061 Converters - support bytes in Avro top-level union types (#2762))
=======
=======
<<<<<<< HEAD
<<<<<<< HEAD
<<<<<<< HEAD
<<<<<<< HEAD
<<<<<<< HEAD
>>>>>>> 7b0539b808 (GEOMESA-3061 Converters - support bytes in Avro top-level union types (#2762))
=======
>>>>>>> 982031ef44 (GEOMESA-3067 Find attribute in Filters with Functions with embedded expressions correctly)
=======
>>>>>>> e15d50d7d3 (GEOMESA-3061 Converters - support bytes in Avro top-level union types (#2762))
=======
<<<<<<< HEAD
<<<<<<< HEAD
>>>>>>> 912169b5e9 (GEOMESA-3067 Find attribute in Filters with Functions with embedded expressions correctly)
=======
>>>>>>> d294ce49e2 (GEOMESA-3061 Converters - support bytes in Avro top-level union types (#2762))
=======
<<<<<<< HEAD
=======
>>>>>>> 7b0539b808 (GEOMESA-3061 Converters - support bytes in Avro top-level union types (#2762))
=======
<<<<<<< HEAD
>>>>>>> 963feec660 (GEOMESA-3061 Converters - support bytes in Avro top-level union types (#2762))
=======
>>>>>>> 982031ef44 (GEOMESA-3067 Find attribute in Filters with Functions with embedded expressions correctly)
=======
>>>>>>> 2c14568a23 (GEOMESA-3067 Find attribute in Filters with Functions with embedded expressions correctly)
=======
>>>>>>> fe3de10f11 (GEOMESA-3061 Converters - support bytes in Avro top-level union types (#2762))
=======
>>>>>>> 912169b5e9 (GEOMESA-3067 Find attribute in Filters with Functions with embedded expressions correctly)
=======
>>>>>>> 511bd92a86 (GEOMESA-3067 Find attribute in Filters with Functions with embedded expressions correctly)
=======
>>>>>>> a35efac12e (GEOMESA-3061 Converters - support bytes in Avro top-level union types (#2762))
>>>>>>> dace2085b (GEOMESA-3061 Converters - support bytes in Avro top-level union types (#2762))
>>>>>>> 238945d4b3 (GEOMESA-3061 Converters - support bytes in Avro top-level union types (#2762))
=======
>>>>>>> 53a3e72cbf (GEOMESA-3061 Converters - support bytes in Avro top-level union types (#2762))
=======
<<<<<<< HEAD
<<<<<<< HEAD
>>>>>>> d15af7157e (GEOMESA-3067 Find attribute in Filters with Functions with embedded expressions correctly)
=======
=======
<<<<<<< HEAD
<<<<<<< HEAD
>>>>>>> 04f08c23c5 (GEOMESA-3067 Find attribute in Filters with Functions with embedded expressions correctly)
=======
>>>>>>> 9abc630fdf (GEOMESA-3061 Converters - support bytes in Avro top-level union types (#2762))
=======
=======
>>>>>>> 04f08c23c5 (GEOMESA-3067 Find attribute in Filters with Functions with embedded expressions correctly)
=======
<<<<<<< HEAD
>>>>>>> 511bd92a86 (GEOMESA-3067 Find attribute in Filters with Functions with embedded expressions correctly)
=======
>>>>>>> 9abc630fdf (GEOMESA-3061 Converters - support bytes in Avro top-level union types (#2762))
=======
>>>>>>> a35efac12e (GEOMESA-3061 Converters - support bytes in Avro top-level union types (#2762))
>>>>>>> c8a325e13 (GEOMESA-3061 Converters - support bytes in Avro top-level union types (#2762))
>>>>>>> c9328eddce (GEOMESA-3061 Converters - support bytes in Avro top-level union types (#2762))
=======
>>>>>>> ad3cedc4d (GEOMESA-3061 Converters - support bytes in Avro top-level union types (#2762))
=======
<<<<<<< HEAD
<<<<<<< HEAD
<<<<<<< HEAD
=======
>>>>>>> 86ec77f9cb (GEOMESA-3061 Converters - support bytes in Avro top-level union types (#2762))
=======
>>>>>>> 67b361c85 (GEOMESA-3061 Converters - support bytes in Avro top-level union types (#2762))
=======
=======
        Result.foreach(1 to 10) { j =>
>>>>>>> b9bdd406e (GEOMESA-3061 Converters - support bytes in Avro top-level union types (#2762))
>>>>>>> cdb410251 (GEOMESA-3061 Converters - support bytes in Avro top-level union types (#2762))
<<<<<<< HEAD
>>>>>>> f302a54949 (GEOMESA-3061 Converters - support bytes in Avro top-level union types (#2762))
=======
<<<<<<< HEAD
=======
>>>>>>> 9a4dff9e4f (GEOMESA-3061 Converters - support bytes in Avro top-level union types (#2762))
=======
>>>>>>> 22dcc8170f (GEOMESA-3061 Converters - support bytes in Avro top-level union types (#2762))
=======
>>>>>>> 8c9ca1211a (GEOMESA-3061 Converters - support bytes in Avro top-level union types (#2762))
=======
>>>>>>> dace2085b (GEOMESA-3061 Converters - support bytes in Avro top-level union types (#2762))
>>>>>>> 238945d4b3 (GEOMESA-3061 Converters - support bytes in Avro top-level union types (#2762))
=======
>>>>>>> 1cad375176 (GEOMESA-3061 Converters - support bytes in Avro top-level union types (#2762))
=======
>>>>>>> 963feec660 (GEOMESA-3061 Converters - support bytes in Avro top-level union types (#2762))
=======
>>>>>>> d15af7157e (GEOMESA-3067 Find attribute in Filters with Functions with embedded expressions correctly)
=======
>>>>>>> 2c14568a23 (GEOMESA-3067 Find attribute in Filters with Functions with embedded expressions correctly)
=======
>>>>>>> c8a325e13 (GEOMESA-3061 Converters - support bytes in Avro top-level union types (#2762))
>>>>>>> c9328eddce (GEOMESA-3061 Converters - support bytes in Avro top-level union types (#2762))
=======
>>>>>>> fe3de10f11 (GEOMESA-3061 Converters - support bytes in Avro top-level union types (#2762))
=======
>>>>>>> a35efac12e (GEOMESA-3061 Converters - support bytes in Avro top-level union types (#2762))
=======
>>>>>>> 86ec77f9cb (GEOMESA-3061 Converters - support bytes in Avro top-level union types (#2762))
=======
>>>>>>> 35b69b8f2f (GEOMESA-3061 Converters - support bytes in Avro top-level union types (#2762))
=======
>>>>>>> 22dcc8170f (GEOMESA-3061 Converters - support bytes in Avro top-level union types (#2762))
=======
>>>>>>> 26a09ee6c2 (GEOMESA-3061 Converters - support bytes in Avro top-level union types (#2762))
=======
>>>>>>> dace2085b (GEOMESA-3061 Converters - support bytes in Avro top-level union types (#2762))
>>>>>>> 238945d4b3 (GEOMESA-3061 Converters - support bytes in Avro top-level union types (#2762))
=======
>>>>>>> 7b3c90c53f (GEOMESA-3061 Converters - support bytes in Avro top-level union types (#2762))
=======
=======
>>>>>>> 73770612e0 (GEOMESA-3061 Converters - support bytes in Avro top-level union types (#2762))
>>>>>>> 7b0539b808 (GEOMESA-3061 Converters - support bytes in Avro top-level union types (#2762))
=======
>>>>>>> 982031ef44 (GEOMESA-3067 Find attribute in Filters with Functions with embedded expressions correctly)
=======
>>>>>>> e15d50d7d3 (GEOMESA-3061 Converters - support bytes in Avro top-level union types (#2762))
=======
>>>>>>> 912169b5e9 (GEOMESA-3067 Find attribute in Filters with Functions with embedded expressions correctly)
=======
>>>>>>> d294ce49e2 (GEOMESA-3061 Converters - support bytes in Avro top-level union types (#2762))
=======
>>>>>>> dace2085b (GEOMESA-3061 Converters - support bytes in Avro top-level union types (#2762))
>>>>>>> 238945d4b3 (GEOMESA-3061 Converters - support bytes in Avro top-level union types (#2762))
=======
>>>>>>> 53a3e72cbf (GEOMESA-3061 Converters - support bytes in Avro top-level union types (#2762))
=======
<<<<<<< HEAD
>>>>>>> 3e7fb62639 (GEOMESA-3061 Converters - support bytes in Avro top-level union types (#2762))
=======
>>>>>>> d15af7157e (GEOMESA-3067 Find attribute in Filters with Functions with embedded expressions correctly)
=======
<<<<<<< HEAD
>>>>>>> 00d66ae013 (GEOMESA-3067 Find attribute in Filters with Functions with embedded expressions correctly)
=======
=======
>>>>>>> 04f08c23c5 (GEOMESA-3067 Find attribute in Filters with Functions with embedded expressions correctly)
=======
>>>>>>> 9abc630fdf (GEOMESA-3061 Converters - support bytes in Avro top-level union types (#2762))
=======
>>>>>>> c8a325e13 (GEOMESA-3061 Converters - support bytes in Avro top-level union types (#2762))
>>>>>>> c9328eddce (GEOMESA-3061 Converters - support bytes in Avro top-level union types (#2762))
=======
<<<<<<< HEAD
>>>>>>> 0fa73844a1 (GEOMESA-3061 Converters - support bytes in Avro top-level union types (#2762))
=======
>>>>>>> ad3cedc4d (GEOMESA-3061 Converters - support bytes in Avro top-level union types (#2762))
=======
<<<<<<< HEAD
>>>>>>> 6e30236dd2 (GEOMESA-3061 Converters - support bytes in Avro top-level union types (#2762))
=======
<<<<<<< HEAD
=======
>>>>>>> 67b361c85 (GEOMESA-3061 Converters - support bytes in Avro top-level union types (#2762))
=======
=======
        Result.foreach(1 to 10) { j =>
>>>>>>> b9bdd406e (GEOMESA-3061 Converters - support bytes in Avro top-level union types (#2762))
>>>>>>> cdb410251 (GEOMESA-3061 Converters - support bytes in Avro top-level union types (#2762))
<<<<<<< HEAD
>>>>>>> f302a54949 (GEOMESA-3061 Converters - support bytes in Avro top-level union types (#2762))
=======
<<<<<<< HEAD
>>>>>>> 2a887f75bf (GEOMESA-3061 Converters - support bytes in Avro top-level union types (#2762))
=======
=======
>>>>>>> 9a4dff9e4f (GEOMESA-3061 Converters - support bytes in Avro top-level union types (#2762))
<<<<<<< HEAD
>>>>>>> 7b8c8dcc3d (GEOMESA-3061 Converters - support bytes in Avro top-level union types (#2762))
=======
=======
>>>>>>> 22dcc8170f (GEOMESA-3061 Converters - support bytes in Avro top-level union types (#2762))
=======
>>>>>>> 8c9ca1211a (GEOMESA-3061 Converters - support bytes in Avro top-level union types (#2762))
<<<<<<< HEAD
>>>>>>> 4f51687745 (GEOMESA-3061 Converters - support bytes in Avro top-level union types (#2762))
=======
=======
>>>>>>> dace2085b (GEOMESA-3061 Converters - support bytes in Avro top-level union types (#2762))
>>>>>>> 238945d4b3 (GEOMESA-3061 Converters - support bytes in Avro top-level union types (#2762))
=======
>>>>>>> 1cad375176 (GEOMESA-3061 Converters - support bytes in Avro top-level union types (#2762))
>>>>>>> 73770612e0 (GEOMESA-3061 Converters - support bytes in Avro top-level union types (#2762))
>>>>>>> e3a63fee1 (GEOMESA-3067 Find attribute in Filters with Functions with embedded expressions correctly)
<<<<<<< HEAD
<<<<<<< HEAD
<<<<<<< HEAD
<<<<<<< HEAD
<<<<<<< HEAD
<<<<<<< HEAD
<<<<<<< HEAD
<<<<<<< HEAD
=======
>>>>>>> 92674ff9d4 (GEOMESA-3061 Converters - support bytes in Avro top-level union types (#2762))
=======
>>>>>>> f110463a26 (GEOMESA-3061 Converters - support bytes in Avro top-level union types (#2762))
=======
>>>>>>> 4ccd6f6b1f (GEOMESA-3061 Converters - support bytes in Avro top-level union types (#2762))
=======
>>>>>>> c22ecd64c3 (GEOMESA-3061 Converters - support bytes in Avro top-level union types (#2762))
=======
=======
>>>>>>> 92674ff9d4 (GEOMESA-3061 Converters - support bytes in Avro top-level union types (#2762))
>>>>>>> 009a284072 (GEOMESA-3061 Converters - support bytes in Avro top-level union types (#2762))
>>>>>>> 3333975e77 (GEOMESA-3067 Find attribute in Filters with Functions with embedded expressions correctly)
=======
=======
>>>>>>> a910ae135f (GEOMESA-3061 Converters - support bytes in Avro top-level union types (#2762))
=======
<<<<<<< HEAD
<<<<<<< HEAD
<<<<<<< HEAD
<<<<<<< HEAD
<<<<<<< HEAD
=======
>>>>>>> 009a284072 (GEOMESA-3061 Converters - support bytes in Avro top-level union types (#2762))
>>>>>>> 4c361f07da (GEOMESA-3061 Converters - support bytes in Avro top-level union types (#2762))
=======
=======
>>>>>>> 92674ff9d4 (GEOMESA-3061 Converters - support bytes in Avro top-level union types (#2762))
=======
<<<<<<< HEAD
>>>>>>> 4c361f07da (GEOMESA-3061 Converters - support bytes in Avro top-level union types (#2762))
=======
>>>>>>> f110463a26 (GEOMESA-3061 Converters - support bytes in Avro top-level union types (#2762))
=======
>>>>>>> 4ccd6f6b1f (GEOMESA-3061 Converters - support bytes in Avro top-level union types (#2762))
=======
>>>>>>> 4c361f07da (GEOMESA-3061 Converters - support bytes in Avro top-level union types (#2762))
=======
>>>>>>> c22ecd64c3 (GEOMESA-3061 Converters - support bytes in Avro top-level union types (#2762))
=======
=======
>>>>>>> 009a284072 (GEOMESA-3061 Converters - support bytes in Avro top-level union types (#2762))
        Result.foreach(1 to 10) { j =>
>>>>>>> b9bdd406e (GEOMESA-3061 Converters - support bytes in Avro top-level union types (#2762))
>>>>>>> 0e68e9f4c (GEOMESA-3061 Converters - support bytes in Avro top-level union types (#2762))
<<<<<<< HEAD
<<<<<<< HEAD
<<<<<<< HEAD
<<<<<<< HEAD
<<<<<<< HEAD
<<<<<<< HEAD
<<<<<<< HEAD
<<<<<<< HEAD
<<<<<<< HEAD
<<<<<<< HEAD
<<<<<<< HEAD
<<<<<<< HEAD
<<<<<<< HEAD
<<<<<<< HEAD
<<<<<<< HEAD
<<<<<<< HEAD
<<<<<<< HEAD
<<<<<<< HEAD
<<<<<<< HEAD
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
>>>>>>> 9df4f8a9f6 (GEOMESA-3067 Find attribute in Filters with Functions with embedded expressions correctly)
=======
>>>>>>> 9a2d40c613 (GEOMESA-3061 Converters - support bytes in Avro top-level union types (#2762))
=======
>>>>>>> 92674ff9d4 (GEOMESA-3061 Converters - support bytes in Avro top-level union types (#2762))
=======
>>>>>>> c169cb2905 (GEOMESA-3067 Find attribute in Filters with Functions with embedded expressions correctly)
<<<<<<< HEAD
<<<<<<< HEAD
=======
>>>>>>> a22efb4d66 (GEOMESA-3061 Converters - support bytes in Avro top-level union types (#2762))
=======
>>>>>>> 99acaa0887 (GEOMESA-3067 Find attribute in Filters with Functions with embedded expressions correctly)
=======
>>>>>>> 9d44ff473d (GEOMESA-3061 Converters - support bytes in Avro top-level union types (#2762))
=======
>>>>>>> bff2bdde04 (GEOMESA-3067 Find attribute in Filters with Functions with embedded expressions correctly)
=======
>>>>>>> f110463a26 (GEOMESA-3061 Converters - support bytes in Avro top-level union types (#2762))
=======
>>>>>>> d83561962d (GEOMESA-3067 Find attribute in Filters with Functions with embedded expressions correctly)
=======
>>>>>>> 4ccd6f6b1f (GEOMESA-3061 Converters - support bytes in Avro top-level union types (#2762))
=======
>>>>>>> f983ea29f0 (GEOMESA-3067 Find attribute in Filters with Functions with embedded expressions correctly)
=======
>>>>>>> 194ad4e5c0 (GEOMESA-3061 Converters - support bytes in Avro top-level union types (#2762))
=======
>>>>>>> 5d8dab9f81 (GEOMESA-3067 Find attribute in Filters with Functions with embedded expressions correctly)
=======
>>>>>>> 9dbe1503e8 (GEOMESA-3061 Converters - support bytes in Avro top-level union types (#2762))
=======
>>>>>>> 53bc726472 (GEOMESA-3067 Find attribute in Filters with Functions with embedded expressions correctly)
=======
>>>>>>> c22ecd64c3 (GEOMESA-3061 Converters - support bytes in Avro top-level union types (#2762))
=======
>>>>>>> 6e297b9b6f (GEOMESA-3067 Find attribute in Filters with Functions with embedded expressions correctly)
=======
=======
>>>>>>> 92674ff9d4 (GEOMESA-3061 Converters - support bytes in Avro top-level union types (#2762))
>>>>>>> 009a284072 (GEOMESA-3061 Converters - support bytes in Avro top-level union types (#2762))
=======
>>>>>>> 9df4f8a9f6 (GEOMESA-3067 Find attribute in Filters with Functions with embedded expressions correctly)
=======
=======
>>>>>>> a22efb4d66 (GEOMESA-3061 Converters - support bytes in Avro top-level union types (#2762))
>>>>>>> 9a2d40c613 (GEOMESA-3061 Converters - support bytes in Avro top-level union types (#2762))
>>>>>>> 76618c8da3 (GEOMESA-3061 Converters - support bytes in Avro top-level union types (#2762))
=======
=======
>>>>>>> b009fd23f4 (GEOMESA-3061 Converters - support bytes in Avro top-level union types (#2762))
=======
<<<<<<< HEAD
<<<<<<< HEAD
<<<<<<< HEAD
<<<<<<< HEAD
<<<<<<< HEAD
=======
>>>>>>> 9a2d40c613 (GEOMESA-3061 Converters - support bytes in Avro top-level union types (#2762))
>>>>>>> cf57a2c189 (GEOMESA-3067 Find attribute in Filters with Functions with embedded expressions correctly)
=======
>>>>>>> 9c28193a91 (GEOMESA-3061 Converters - support bytes in Avro top-level union types (#2762))
=======
<<<<<<< HEAD
<<<<<<< HEAD
<<<<<<< HEAD
<<<<<<< HEAD
>>>>>>> 1b60c2aeba (GEOMESA-3067 Find attribute in Filters with Functions with embedded expressions correctly)
=======
=======
>>>>>>> a22efb4d66 (GEOMESA-3061 Converters - support bytes in Avro top-level union types (#2762))
<<<<<<< HEAD
=======
>>>>>>> cf57a2c189 (GEOMESA-3067 Find attribute in Filters with Functions with embedded expressions correctly)
=======
>>>>>>> 99acaa0887 (GEOMESA-3067 Find attribute in Filters with Functions with embedded expressions correctly)
=======
>>>>>>> 9d44ff473d (GEOMESA-3061 Converters - support bytes in Avro top-level union types (#2762))
=======
>>>>>>> 1b60c2aeba (GEOMESA-3067 Find attribute in Filters with Functions with embedded expressions correctly)
=======
>>>>>>> bff2bdde04 (GEOMESA-3067 Find attribute in Filters with Functions with embedded expressions correctly)
=======
>>>>>>> 194ad4e5c0 (GEOMESA-3061 Converters - support bytes in Avro top-level union types (#2762))
=======
>>>>>>> cf57a2c189 (GEOMESA-3067 Find attribute in Filters with Functions with embedded expressions correctly)
=======
>>>>>>> 5d8dab9f81 (GEOMESA-3067 Find attribute in Filters with Functions with embedded expressions correctly)
=======
>>>>>>> 9dbe1503e8 (GEOMESA-3061 Converters - support bytes in Avro top-level union types (#2762))
=======
>>>>>>> 1b60c2aeba (GEOMESA-3067 Find attribute in Filters with Functions with embedded expressions correctly)
=======
>>>>>>> 53bc726472 (GEOMESA-3067 Find attribute in Filters with Functions with embedded expressions correctly)
=======
>>>>>>> 9a2d40c613 (GEOMESA-3061 Converters - support bytes in Avro top-level union types (#2762))
>>>>>>> a63cb7e74 (GEOMESA-3067 Find attribute in Filters with Functions with embedded expressions correctly)
<<<<<<< HEAD
<<<<<<< HEAD
<<<<<<< HEAD
<<<<<<< HEAD
<<<<<<< HEAD
<<<<<<< HEAD
<<<<<<< HEAD
<<<<<<< HEAD
=======
>>>>>>> 9a4dff9e4f (GEOMESA-3061 Converters - support bytes in Avro top-level union types (#2762))
=======
>>>>>>> 86ec77f9cb (GEOMESA-3061 Converters - support bytes in Avro top-level union types (#2762))
=======
>>>>>>> 35b69b8f2f (GEOMESA-3061 Converters - support bytes in Avro top-level union types (#2762))
=======
>>>>>>> 2a887f75bf (GEOMESA-3061 Converters - support bytes in Avro top-level union types (#2762))
=======
=======
>>>>>>> 9a4dff9e4f (GEOMESA-3061 Converters - support bytes in Avro top-level union types (#2762))
>>>>>>> 7b8c8dcc3d (GEOMESA-3061 Converters - support bytes in Avro top-level union types (#2762))
>>>>>>> c3b0a1b6e3 (GEOMESA-3067 Find attribute in Filters with Functions with embedded expressions correctly)
=======
=======
>>>>>>> 67b361c85 (GEOMESA-3061 Converters - support bytes in Avro top-level union types (#2762))
<<<<<<< HEAD
<<<<<<< HEAD
<<<<<<< HEAD
<<<<<<< HEAD
<<<<<<< HEAD
<<<<<<< HEAD
<<<<<<< HEAD
<<<<<<< HEAD
<<<<<<< HEAD
<<<<<<< HEAD
<<<<<<< HEAD
<<<<<<< HEAD
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
>>>>>>> 73770612e0 (GEOMESA-3061 Converters - support bytes in Avro top-level union types (#2762))
=======
>>>>>>> 63ca73533e (GEOMESA-3067 Find attribute in Filters with Functions with embedded expressions correctly)
=======
>>>>>>> 1cad375176 (GEOMESA-3061 Converters - support bytes in Avro top-level union types (#2762))
<<<<<<< HEAD
=======
>>>>>>> 21deff19fd (GEOMESA-3067 Find attribute in Filters with Functions with embedded expressions correctly)
=======
>>>>>>> a35efac12e (GEOMESA-3061 Converters - support bytes in Avro top-level union types (#2762))
=======
>>>>>>> 323528580f (GEOMESA-3067 Find attribute in Filters with Functions with embedded expressions correctly)
=======
>>>>>>> 17883cb601 (GEOMESA-3067 Find attribute in Filters with Functions with embedded expressions correctly)
=======
>>>>>>> da4e2905b4 (GEOMESA-3067 Find attribute in Filters with Functions with embedded expressions correctly)
=======
>>>>>>> 7b3c90c53f (GEOMESA-3061 Converters - support bytes in Avro top-level union types (#2762))
=======
>>>>>>> 1ef95979ee (GEOMESA-3067 Find attribute in Filters with Functions with embedded expressions correctly)
=======
>>>>>>> 6e30236dd2 (GEOMESA-3061 Converters - support bytes in Avro top-level union types (#2762))
=======
>>>>>>> 3261561062 (GEOMESA-3067 Find attribute in Filters with Functions with embedded expressions correctly)
=======
>>>>>>> 08a743b61d (GEOMESA-3067 Find attribute in Filters with Functions with embedded expressions correctly)
=======
=======
>>>>>>> 63ca73533e (GEOMESA-3067 Find attribute in Filters with Functions with embedded expressions correctly)
>>>>>>> 79cd5cb606 (GEOMESA-3067 Find attribute in Filters with Functions with embedded expressions correctly)
=======
>>>>>>> 73770612e0 (GEOMESA-3061 Converters - support bytes in Avro top-level union types (#2762))
>>>>>>> c8a325e13c (GEOMESA-3061 Converters - support bytes in Avro top-level union types (#2762))
=======
=======
>>>>>>> 238945d4b3 (GEOMESA-3061 Converters - support bytes in Avro top-level union types (#2762))
=======
<<<<<<< HEAD
<<<<<<< HEAD
<<<<<<< HEAD
<<<<<<< HEAD
<<<<<<< HEAD
=======
>>>>>>> 73770612e0 (GEOMESA-3061 Converters - support bytes in Avro top-level union types (#2762))
>>>>>>> bec3ba7d08 (GEOMESA-3067 Find attribute in Filters with Functions with embedded expressions correctly)
=======
>>>>>>> d294ce49e2 (GEOMESA-3061 Converters - support bytes in Avro top-level union types (#2762))
=======
<<<<<<< HEAD
<<<<<<< HEAD
<<<<<<< HEAD
<<<<<<< HEAD
>>>>>>> ed45e8551f (GEOMESA-3067 Find attribute in Filters with Functions with embedded expressions correctly)
=======
=======
>>>>>>> 1cad375176 (GEOMESA-3061 Converters - support bytes in Avro top-level union types (#2762))
<<<<<<< HEAD
=======
>>>>>>> bec3ba7d08 (GEOMESA-3067 Find attribute in Filters with Functions with embedded expressions correctly)
=======
>>>>>>> 21deff19fd (GEOMESA-3067 Find attribute in Filters with Functions with embedded expressions correctly)
=======
>>>>>>> a35efac12e (GEOMESA-3061 Converters - support bytes in Avro top-level union types (#2762))
=======
>>>>>>> ed45e8551f (GEOMESA-3067 Find attribute in Filters with Functions with embedded expressions correctly)
=======
>>>>>>> 323528580f (GEOMESA-3067 Find attribute in Filters with Functions with embedded expressions correctly)
=======
>>>>>>> 7b3c90c53f (GEOMESA-3061 Converters - support bytes in Avro top-level union types (#2762))
=======
>>>>>>> bec3ba7d08 (GEOMESA-3067 Find attribute in Filters with Functions with embedded expressions correctly)
=======
>>>>>>> 1ef95979ee (GEOMESA-3067 Find attribute in Filters with Functions with embedded expressions correctly)
=======
>>>>>>> 6e30236dd2 (GEOMESA-3061 Converters - support bytes in Avro top-level union types (#2762))
=======
>>>>>>> ed45e8551f (GEOMESA-3067 Find attribute in Filters with Functions with embedded expressions correctly)
=======
>>>>>>> 3261561062 (GEOMESA-3067 Find attribute in Filters with Functions with embedded expressions correctly)
=======
>>>>>>> 73770612e0 (GEOMESA-3061 Converters - support bytes in Avro top-level union types (#2762))
>>>>>>> 908ad4071 (GEOMESA-3067 Find attribute in Filters with Functions with embedded expressions correctly)
<<<<<<< HEAD
<<<<<<< HEAD
<<<<<<< HEAD
<<<<<<< HEAD
<<<<<<< HEAD
<<<<<<< HEAD
<<<<<<< HEAD
<<<<<<< HEAD
=======
>>>>>>> 0fc6650ecf (GEOMESA-3061 Converters - support bytes in Avro top-level union types (#2762))
=======
>>>>>>> 1bcc513539 (GEOMESA-3061 Converters - support bytes in Avro top-level union types (#2762))
=======
>>>>>>> db8a3a22b2 (GEOMESA-3061 Converters - support bytes in Avro top-level union types (#2762))
=======
>>>>>>> b08cb4d818 (GEOMESA-3061 Converters - support bytes in Avro top-level union types (#2762))
=======
=======
>>>>>>> 0fc6650ecf (GEOMESA-3061 Converters - support bytes in Avro top-level union types (#2762))
>>>>>>> c029a43a6c (GEOMESA-3061 Converters - support bytes in Avro top-level union types (#2762))
>>>>>>> 9638dc731e (GEOMESA-3067 Find attribute in Filters with Functions with embedded expressions correctly)
=======
=======
>>>>>>> bdbced26d4 (GEOMESA-3061 Converters - support bytes in Avro top-level union types (#2762))
=======
<<<<<<< HEAD
<<<<<<< HEAD
<<<<<<< HEAD
<<<<<<< HEAD
<<<<<<< HEAD
=======
>>>>>>> c029a43a6c (GEOMESA-3061 Converters - support bytes in Avro top-level union types (#2762))
>>>>>>> a788dfac03 (GEOMESA-3061 Converters - support bytes in Avro top-level union types (#2762))
=======
=======
>>>>>>> 0fc6650ecf (GEOMESA-3061 Converters - support bytes in Avro top-level union types (#2762))
=======
<<<<<<< HEAD
>>>>>>> a788dfac03 (GEOMESA-3061 Converters - support bytes in Avro top-level union types (#2762))
=======
>>>>>>> 1bcc513539 (GEOMESA-3061 Converters - support bytes in Avro top-level union types (#2762))
=======
>>>>>>> db8a3a22b2 (GEOMESA-3061 Converters - support bytes in Avro top-level union types (#2762))
=======
>>>>>>> a788dfac03 (GEOMESA-3061 Converters - support bytes in Avro top-level union types (#2762))
=======
>>>>>>> b08cb4d818 (GEOMESA-3061 Converters - support bytes in Avro top-level union types (#2762))
=======
=======
>>>>>>> c029a43a6c (GEOMESA-3061 Converters - support bytes in Avro top-level union types (#2762))
        Result.foreach(1 to 10) { j =>
>>>>>>> b9bdd406e (GEOMESA-3061 Converters - support bytes in Avro top-level union types (#2762))
>>>>>>> b4320946b (GEOMESA-3061 Converters - support bytes in Avro top-level union types (#2762))
<<<<<<< HEAD
<<<<<<< HEAD
<<<<<<< HEAD
<<<<<<< HEAD
<<<<<<< HEAD
<<<<<<< HEAD
<<<<<<< HEAD
<<<<<<< HEAD
<<<<<<< HEAD
<<<<<<< HEAD
<<<<<<< HEAD
<<<<<<< HEAD
<<<<<<< HEAD
<<<<<<< HEAD
<<<<<<< HEAD
<<<<<<< HEAD
<<<<<<< HEAD
<<<<<<< HEAD
<<<<<<< HEAD
<<<<<<< HEAD
<<<<<<< HEAD
<<<<<<< HEAD
<<<<<<< HEAD
<<<<<<< HEAD
<<<<<<< HEAD
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
>>>>>>> 217b7d1cb9 (Merge branch 'feature/postgis-fixes')
=======
>>>>>>> 6c83981af3 (GEOMESA-3061 Converters - support bytes in Avro top-level union types (#2762))
=======
>>>>>>> 0fc6650ecf (GEOMESA-3061 Converters - support bytes in Avro top-level union types (#2762))
=======
>>>>>>> 67de3c3202 (Merge branch 'feature/postgis-fixes')
<<<<<<< HEAD
<<<<<<< HEAD
=======
>>>>>>> 1e39c0c27d (GEOMESA-3061 Converters - support bytes in Avro top-level union types (#2762))
=======
>>>>>>> 638b68d081 (Merge branch 'feature/postgis-fixes')
=======
>>>>>>> d0785cf307 (GEOMESA-3061 Converters - support bytes in Avro top-level union types (#2762))
=======
>>>>>>> 71adb695c5 (Merge branch 'feature/postgis-fixes')
=======
>>>>>>> fd5565dfba (GEOMESA-3061 Converters - support bytes in Avro top-level union types (#2762))
=======
>>>>>>> 30559ea5c9 (Merge branch 'feature/postgis-fixes')
=======
>>>>>>> 1bcc513539 (GEOMESA-3061 Converters - support bytes in Avro top-level union types (#2762))
=======
>>>>>>> ec6d06b576 (Merge branch 'feature/postgis-fixes')
=======
>>>>>>> db8a3a22b2 (GEOMESA-3061 Converters - support bytes in Avro top-level union types (#2762))
=======
>>>>>>> ed25decdd5 (Merge branch 'feature/postgis-fixes')
=======
>>>>>>> db9dfb6f14 (GEOMESA-3061 Converters - support bytes in Avro top-level union types (#2762))
=======
>>>>>>> f893d9a594 (Merge branch 'feature/postgis-fixes')
=======
>>>>>>> 63546aacdc (GEOMESA-3061 Converters - support bytes in Avro top-level union types (#2762))
=======
>>>>>>> 964e86145a (Merge branch 'feature/postgis-fixes')
=======
>>>>>>> dbd932fed6 (GEOMESA-3061 Converters - support bytes in Avro top-level union types (#2762))
=======
>>>>>>> bf6bde0830 (Merge branch 'feature/postgis-fixes')
=======
>>>>>>> b08cb4d818 (GEOMESA-3061 Converters - support bytes in Avro top-level union types (#2762))
=======
>>>>>>> 354b5e5ae5 (Merge branch 'feature/postgis-fixes')
=======
=======
>>>>>>> 0fc6650ecf (GEOMESA-3061 Converters - support bytes in Avro top-level union types (#2762))
>>>>>>> c029a43a6c (GEOMESA-3061 Converters - support bytes in Avro top-level union types (#2762))
=======
>>>>>>> 217b7d1cb9 (Merge branch 'feature/postgis-fixes')
=======
=======
>>>>>>> 1e39c0c27d (GEOMESA-3061 Converters - support bytes in Avro top-level union types (#2762))
>>>>>>> 6c83981af3 (GEOMESA-3061 Converters - support bytes in Avro top-level union types (#2762))
>>>>>>> 97ec7d864a (GEOMESA-3061 Converters - support bytes in Avro top-level union types (#2762))
=======
=======
>>>>>>> bc4062951d (GEOMESA-3061 Converters - support bytes in Avro top-level union types (#2762))
=======
<<<<<<< HEAD
<<<<<<< HEAD
<<<<<<< HEAD
<<<<<<< HEAD
<<<<<<< HEAD
=======
>>>>>>> 6c83981af3 (GEOMESA-3061 Converters - support bytes in Avro top-level union types (#2762))
>>>>>>> e944f1c88b (Merge branch 'feature/postgis-fixes')
=======
=======
<<<<<<< HEAD
<<<<<<< HEAD
<<<<<<< HEAD
<<<<<<< HEAD
>>>>>>> 26e5afc4ea (Merge branch 'feature/postgis-fixes')
=======
>>>>>>> 1df8328338 (GEOMESA-3061 Converters - support bytes in Avro top-level union types (#2762))
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
>>>>>>> 1df8328338 (GEOMESA-3061 Converters - support bytes in Avro top-level union types (#2762))
=======
>>>>>>> fd5565dfba (GEOMESA-3061 Converters - support bytes in Avro top-level union types (#2762))
=======
>>>>>>> 30559ea5c9 (Merge branch 'feature/postgis-fixes')
>>>>>>> d94c03a98e (GEOMESA-3061 Converters - support bytes in Avro top-level union types (#2762))
>>>>>>> 8de43cccf6 (GEOMESA-3061 Converters - support bytes in Avro top-level union types (#2762))
=======
>>>>>>> cb6bda89b6 (Merge branch 'feature/postgis-fixes')
=======
<<<<<<< HEAD
<<<<<<< HEAD
>>>>>>> 25063957fc (GEOMESA-3061 Converters - support bytes in Avro top-level union types (#2762))
=======
>>>>>>> 699117eca9 (Merge branch 'feature/postgis-fixes')
=======
<<<<<<< HEAD
=======
>>>>>>> 1e39c0c27d (GEOMESA-3061 Converters - support bytes in Avro top-level union types (#2762))
=======
>>>>>>> e944f1c88b (Merge branch 'feature/postgis-fixes')
=======
>>>>>>> 638b68d081 (Merge branch 'feature/postgis-fixes')
=======
>>>>>>> d94c03a98e (GEOMESA-3061 Converters - support bytes in Avro top-level union types (#2762))
>>>>>>> 8de43cccf6 (GEOMESA-3061 Converters - support bytes in Avro top-level union types (#2762))
=======
>>>>>>> d0785cf307 (GEOMESA-3061 Converters - support bytes in Avro top-level union types (#2762))
=======
>>>>>>> 71adb695c5 (Merge branch 'feature/postgis-fixes')
=======
>>>>>>> 25063957fc (GEOMESA-3061 Converters - support bytes in Avro top-level union types (#2762))
=======
>>>>>>> fd5565dfba (GEOMESA-3061 Converters - support bytes in Avro top-level union types (#2762))
=======
>>>>>>> 30559ea5c9 (Merge branch 'feature/postgis-fixes')
=======
>>>>>>> db9dfb6f14 (GEOMESA-3061 Converters - support bytes in Avro top-level union types (#2762))
=======
>>>>>>> e944f1c88b (Merge branch 'feature/postgis-fixes')
=======
>>>>>>> f893d9a594 (Merge branch 'feature/postgis-fixes')
=======
>>>>>>> d94c03a98e (GEOMESA-3061 Converters - support bytes in Avro top-level union types (#2762))
>>>>>>> 8de43cccf6 (GEOMESA-3061 Converters - support bytes in Avro top-level union types (#2762))
=======
>>>>>>> 63546aacdc (GEOMESA-3061 Converters - support bytes in Avro top-level union types (#2762))
=======
>>>>>>> 26e5afc4ea (Merge branch 'feature/postgis-fixes')
=======
>>>>>>> 1df8328338 (GEOMESA-3061 Converters - support bytes in Avro top-level union types (#2762))
=======
>>>>>>> c69897d7bd (Merge branch 'feature/postgis-fixes')
=======
>>>>>>> d94c03a98e (GEOMESA-3061 Converters - support bytes in Avro top-level union types (#2762))
>>>>>>> 8de43cccf6 (GEOMESA-3061 Converters - support bytes in Avro top-level union types (#2762))
=======
>>>>>>> cb6bda89b6 (Merge branch 'feature/postgis-fixes')
=======
<<<<<<< HEAD
>>>>>>> 964e86145a (Merge branch 'feature/postgis-fixes')
=======
>>>>>>> 25063957fc (GEOMESA-3061 Converters - support bytes in Avro top-level union types (#2762))
=======
<<<<<<< HEAD
>>>>>>> dbd932fed6 (GEOMESA-3061 Converters - support bytes in Avro top-level union types (#2762))
=======
>>>>>>> 699117eca9 (Merge branch 'feature/postgis-fixes')
=======
<<<<<<< HEAD
>>>>>>> bf6bde0830 (Merge branch 'feature/postgis-fixes')
=======
=======
>>>>>>> 1e39c0c27d (GEOMESA-3061 Converters - support bytes in Avro top-level union types (#2762))
>>>>>>> 6c83981af3 (GEOMESA-3061 Converters - support bytes in Avro top-level union types (#2762))
        Result.foreach(1 to 10) { j =>
>>>>>>> 3be8d2a5a (Merge branch 'feature/postgis-fixes')
<<<<<<< HEAD
>>>>>>> db8d998aa2 (Merge branch 'feature/postgis-fixes')
=======
        Result.foreach(1 to 10) { j =>
>>>>>>> d845d7c1bd (GEOMESA-3254 Add Bloop build support)
=======
        Result.foreach(1 to 10) { j =>
=======
        Result.foreach(1 to 10){ j =>
>>>>>>> 7acc3ea46 (GEOMESA-3067 Find attribute in Filters with Functions with embedded expressions correctly)
>>>>>>> 7bb5f26c3e (GEOMESA-3067 Find attribute in Filters with Functions with embedded expressions correctly)
=======
<<<<<<< HEAD
<<<<<<< HEAD
<<<<<<< HEAD
<<<<<<< HEAD
<<<<<<< HEAD
<<<<<<< HEAD
=======
>>>>>>> 3676d4e56a (GEOMESA-3061 Converters - support bytes in Avro top-level union types (#2762))
=======
>>>>>>> a5b0374ee2 (GEOMESA-3061 Converters - support bytes in Avro top-level union types (#2762))
>>>>>>> 0dbede148d (GEOMESA-3061 Converters - support bytes in Avro top-level union types (#2762))
=======
<<<<<<< HEAD
<<<<<<< HEAD
<<<<<<< HEAD
=======
>>>>>>> 0dbede148d (GEOMESA-3061 Converters - support bytes in Avro top-level union types (#2762))
=======
>>>>>>> 1bb69524c2 (GEOMESA-3061 Converters - support bytes in Avro top-level union types (#2762))
=======
>>>>>>> a990cf104e (GEOMESA-3067 Find attribute in Filters with Functions with embedded expressions correctly)
=======
>>>>>>> 0dbede148d (GEOMESA-3061 Converters - support bytes in Avro top-level union types (#2762))
=======
>>>>>>> 27afb28ab6 (GEOMESA-3061 Converters - support bytes in Avro top-level union types (#2762))
=======
>>>>>>> f33d55e2ba (GEOMESA-3067 Find attribute in Filters with Functions with embedded expressions correctly)
=======
>>>>>>> 0dbede148d (GEOMESA-3061 Converters - support bytes in Avro top-level union types (#2762))
=======
>>>>>>> 1bb69524c2 (GEOMESA-3061 Converters - support bytes in Avro top-level union types (#2762))
=======
        Result.foreach(1 to 10) { j =>
>>>>>>> b9bdd406e (GEOMESA-3061 Converters - support bytes in Avro top-level union types (#2762))
<<<<<<< HEAD
>>>>>>> 6d9a5b626c (GEOMESA-3061 Converters - support bytes in Avro top-level union types (#2762))
=======
=======
        Result.foreach(1 to 10) { j =>
>>>>>>> b9bdd406e (GEOMESA-3061 Converters - support bytes in Avro top-level union types (#2762))
=======
>>>>>>> f36b0e8b9 (GEOMESA-3067 Find attribute in Filters with Functions with embedded expressions correctly)
>>>>>>> e5ed68fdd3 (GEOMESA-3067 Find attribute in Filters with Functions with embedded expressions correctly)
=======
>>>>>>> e6e1f4bdd5 (GEOMESA-3061 Converters - support bytes in Avro top-level union types (#2762))
<<<<<<< HEAD
<<<<<<< HEAD
<<<<<<< HEAD
<<<<<<< HEAD
<<<<<<< HEAD
<<<<<<< HEAD
=======
>>>>>>> 2b62d1f3fe (GEOMESA-3067 Find attribute in Filters with Functions with embedded expressions correctly)
=======
>>>>>>> 8b16ac5c65 (GEOMESA-3067 Find attribute in Filters with Functions with embedded expressions correctly)
=======
>>>>>>> 60b4637548 (GEOMESA-3061 Converters - support bytes in Avro top-level union types (#2762))
=======
=======
>>>>>>> 2b62d1f3fe (GEOMESA-3067 Find attribute in Filters with Functions with embedded expressions correctly)
>>>>>>> 6f81d40992 (GEOMESA-3067 Find attribute in Filters with Functions with embedded expressions correctly)
=======
=======
>>>>>>> e3a63fee1 (GEOMESA-3067 Find attribute in Filters with Functions with embedded expressions correctly)
>>>>>>> 7f922b040c (GEOMESA-3067 Find attribute in Filters with Functions with embedded expressions correctly)
<<<<<<< HEAD
<<<<<<< HEAD
<<<<<<< HEAD
<<<<<<< HEAD
<<<<<<< HEAD
<<<<<<< HEAD
=======
>>>>>>> 6f81d40992 (GEOMESA-3067 Find attribute in Filters with Functions with embedded expressions correctly)
=======
>>>>>>> 009a284072 (GEOMESA-3061 Converters - support bytes in Avro top-level union types (#2762))
=======
>>>>>>> a910ae135f (GEOMESA-3061 Converters - support bytes in Avro top-level union types (#2762))
=======
=======
>>>>>>> a63cb7e74 (GEOMESA-3067 Find attribute in Filters with Functions with embedded expressions correctly)
>>>>>>> 8fb0607344 (GEOMESA-3067 Find attribute in Filters with Functions with embedded expressions correctly)
<<<<<<< HEAD
<<<<<<< HEAD
<<<<<<< HEAD
<<<<<<< HEAD
<<<<<<< HEAD
<<<<<<< HEAD
=======
>>>>>>> 9a4dff9e4f (GEOMESA-3061 Converters - support bytes in Avro top-level union types (#2762))
=======
>>>>>>> 35b69b8f2f (GEOMESA-3061 Converters - support bytes in Avro top-level union types (#2762))
=======
>>>>>>> 9df4f8a9f6 (GEOMESA-3067 Find attribute in Filters with Functions with embedded expressions correctly)
=======
=======
>>>>>>> 9a4dff9e4f (GEOMESA-3061 Converters - support bytes in Avro top-level union types (#2762))
>>>>>>> 7b8c8dcc3d (GEOMESA-3061 Converters - support bytes in Avro top-level union types (#2762))
=======
=======
>>>>>>> 67b361c85 (GEOMESA-3061 Converters - support bytes in Avro top-level union types (#2762))
>>>>>>> ad3cedc4db (GEOMESA-3061 Converters - support bytes in Avro top-level union types (#2762))
<<<<<<< HEAD
<<<<<<< HEAD
<<<<<<< HEAD
<<<<<<< HEAD
<<<<<<< HEAD
<<<<<<< HEAD
=======
>>>>>>> 63ca73533e (GEOMESA-3067 Find attribute in Filters with Functions with embedded expressions correctly)
=======
>>>>>>> da4e2905b4 (GEOMESA-3067 Find attribute in Filters with Functions with embedded expressions correctly)
=======
>>>>>>> 7b8c8dcc3d (GEOMESA-3061 Converters - support bytes in Avro top-level union types (#2762))
=======
=======
>>>>>>> 63ca73533e (GEOMESA-3067 Find attribute in Filters with Functions with embedded expressions correctly)
>>>>>>> 79cd5cb606 (GEOMESA-3067 Find attribute in Filters with Functions with embedded expressions correctly)
=======
=======
>>>>>>> 908ad4071 (GEOMESA-3067 Find attribute in Filters with Functions with embedded expressions correctly)
>>>>>>> bc49131942 (GEOMESA-3067 Find attribute in Filters with Functions with embedded expressions correctly)
<<<<<<< HEAD
<<<<<<< HEAD
<<<<<<< HEAD
<<<<<<< HEAD
<<<<<<< HEAD
<<<<<<< HEAD
=======
>>>>>>> 79cd5cb606 (GEOMESA-3067 Find attribute in Filters with Functions with embedded expressions correctly)
=======
>>>>>>> c029a43a6c (GEOMESA-3061 Converters - support bytes in Avro top-level union types (#2762))
=======
>>>>>>> bdbced26d4 (GEOMESA-3061 Converters - support bytes in Avro top-level union types (#2762))
=======
=======
        Result.foreach(1 to 10) { j =>
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
>>>>>>> a5b0374ee2 (GEOMESA-3061 Converters - support bytes in Avro top-level union types (#2762))
=======
>>>>>>> 87bf55340 (GEOMESA-3061 Converters - support bytes in Avro top-level union types (#2762))
<<<<<<< HEAD
>>>>>>> 0dbede148d (GEOMESA-3061 Converters - support bytes in Avro top-level union types (#2762))
=======
=======
>>>>>>> 240977229 (GEOMESA-3061 Converters - support bytes in Avro top-level union types (#2762))
<<<<<<< HEAD
>>>>>>> 22dcc8170f (GEOMESA-3061 Converters - support bytes in Avro top-level union types (#2762))
=======
=======
>>>>>>> 45ad5d11f (GEOMESA-3061 Converters - support bytes in Avro top-level union types (#2762))
<<<<<<< HEAD
<<<<<<< HEAD
<<<<<<< HEAD
<<<<<<< HEAD
<<<<<<< HEAD
<<<<<<< HEAD
<<<<<<< HEAD
=======
>>>>>>> 1cad375176 (GEOMESA-3061 Converters - support bytes in Avro top-level union types (#2762))
=======
>>>>>>> 7b3c90c53f (GEOMESA-3061 Converters - support bytes in Avro top-level union types (#2762))
=======
>>>>>>> 9a2d40c613 (GEOMESA-3061 Converters - support bytes in Avro top-level union types (#2762))
=======
=======
>>>>>>> 1cad375176 (GEOMESA-3061 Converters - support bytes in Avro top-level union types (#2762))
>>>>>>> 73770612e0 (GEOMESA-3061 Converters - support bytes in Avro top-level union types (#2762))
>>>>>>> b009fd23f4 (GEOMESA-3061 Converters - support bytes in Avro top-level union types (#2762))
=======
=======
>>>>>>> dace2085b (GEOMESA-3061 Converters - support bytes in Avro top-level union types (#2762))
<<<<<<< HEAD
<<<<<<< HEAD
<<<<<<< HEAD
<<<<<<< HEAD
<<<<<<< HEAD
<<<<<<< HEAD
<<<<<<< HEAD
=======
>>>>>>> 1e39c0c27d (GEOMESA-3061 Converters - support bytes in Avro top-level union types (#2762))
=======
>>>>>>> db9dfb6f14 (GEOMESA-3061 Converters - support bytes in Avro top-level union types (#2762))
=======
>>>>>>> 73770612e0 (GEOMESA-3061 Converters - support bytes in Avro top-level union types (#2762))
=======
=======
>>>>>>> 1e39c0c27d (GEOMESA-3061 Converters - support bytes in Avro top-level union types (#2762))
>>>>>>> 6c83981af3 (GEOMESA-3061 Converters - support bytes in Avro top-level union types (#2762))
>>>>>>> 238945d4b3 (GEOMESA-3061 Converters - support bytes in Avro top-level union types (#2762))
=======
=======
>>>>>>> 516fe7e9c (GEOMESA-3061 Converters - support bytes in Avro top-level union types (#2762))
<<<<<<< HEAD
<<<<<<< HEAD
<<<<<<< HEAD
<<<<<<< HEAD
<<<<<<< HEAD
<<<<<<< HEAD
=======
>>>>>>> 638b68d081 (Merge branch 'feature/postgis-fixes')
=======
>>>>>>> f893d9a594 (Merge branch 'feature/postgis-fixes')
=======
>>>>>>> 6c83981af3 (GEOMESA-3061 Converters - support bytes in Avro top-level union types (#2762))
>>>>>>> bc4062951d (GEOMESA-3061 Converters - support bytes in Avro top-level union types (#2762))
=======
=======
=======
        Result.foreach(1 to 10) { j =>
>>>>>>> 3be8d2a5a (Merge branch 'feature/postgis-fixes')
>>>>>>> e8cc4971c6 (Merge branch 'feature/postgis-fixes')
<<<<<<< HEAD
<<<<<<< HEAD
<<<<<<< HEAD
<<<<<<< HEAD
<<<<<<< HEAD
=======
>>>>>>> a990cf104e (GEOMESA-3067 Find attribute in Filters with Functions with embedded expressions correctly)
=======
>>>>>>> f33d55e2ba (GEOMESA-3067 Find attribute in Filters with Functions with embedded expressions correctly)
>>>>>>> e944f1c88b (Merge branch 'feature/postgis-fixes')
=======
=======
>>>>>>> 907fb0b08 (GEOMESA-3067 Find attribute in Filters with Functions with embedded expressions correctly)
<<<<<<< HEAD
<<<<<<< HEAD
<<<<<<< HEAD
<<<<<<< HEAD
<<<<<<< HEAD
>>>>>>> 8a3e82747d (GEOMESA-3067 Find attribute in Filters with Functions with embedded expressions correctly)
<<<<<<< HEAD
>>>>>>> deb8fd68de (GEOMESA-3067 Find attribute in Filters with Functions with embedded expressions correctly)
=======
=======
=======
=======
        Result.foreach(1 to 10) { j =>
>>>>>>> b9bdd406e (GEOMESA-3061 Converters - support bytes in Avro top-level union types (#2762))
>>>>>>> d9ed077cd (GEOMESA-3061 Converters - support bytes in Avro top-level union types (#2762))
<<<<<<< HEAD
<<<<<<< HEAD
<<<<<<< HEAD
>>>>>>> 81ee66102b (GEOMESA-3061 Converters - support bytes in Avro top-level union types (#2762))
<<<<<<< HEAD
>>>>>>> 8adfab65bb (GEOMESA-3061 Converters - support bytes in Avro top-level union types (#2762))
=======
=======
=======
>>>>>>> e182e6e99 (GEOMESA-3067 Find attribute in Filters with Functions with embedded expressions correctly)
<<<<<<< HEAD
<<<<<<< HEAD
<<<<<<< HEAD
>>>>>>> 9943e05ec9 (GEOMESA-3067 Find attribute in Filters with Functions with embedded expressions correctly)
<<<<<<< HEAD
>>>>>>> 3254b186da (GEOMESA-3067 Find attribute in Filters with Functions with embedded expressions correctly)
=======
=======
=======
>>>>>>> 9d708b240 (GEOMESA-3061 Converters - support bytes in Avro top-level union types (#2762))
<<<<<<< HEAD
<<<<<<< HEAD
<<<<<<< HEAD
>>>>>>> 53a3e72cbf (GEOMESA-3061 Converters - support bytes in Avro top-level union types (#2762))
<<<<<<< HEAD
>>>>>>> 7b0539b808 (GEOMESA-3061 Converters - support bytes in Avro top-level union types (#2762))
=======
=======
=======
=======
>>>>>>> e3a63fee1 (GEOMESA-3067 Find attribute in Filters with Functions with embedded expressions correctly)
>>>>>>> 3333975e7 (GEOMESA-3067 Find attribute in Filters with Functions with embedded expressions correctly)
<<<<<<< HEAD
<<<<<<< HEAD
<<<<<<< HEAD
>>>>>>> d15af7157e (GEOMESA-3067 Find attribute in Filters with Functions with embedded expressions correctly)
<<<<<<< HEAD
>>>>>>> 982031ef44 (GEOMESA-3067 Find attribute in Filters with Functions with embedded expressions correctly)
=======
=======
=======
>>>>>>> 76618c8da (GEOMESA-3061 Converters - support bytes in Avro top-level union types (#2762))
<<<<<<< HEAD
<<<<<<< HEAD
<<<<<<< HEAD
>>>>>>> 947761ec9b (GEOMESA-3061 Converters - support bytes in Avro top-level union types (#2762))
<<<<<<< HEAD
>>>>>>> 0086b292ba (GEOMESA-3061 Converters - support bytes in Avro top-level union types (#2762))
=======
=======
=======
=======
>>>>>>> a63cb7e74 (GEOMESA-3067 Find attribute in Filters with Functions with embedded expressions correctly)
>>>>>>> c3b0a1b6e (GEOMESA-3067 Find attribute in Filters with Functions with embedded expressions correctly)
<<<<<<< HEAD
<<<<<<< HEAD
<<<<<<< HEAD
>>>>>>> 9813375fcc (GEOMESA-3067 Find attribute in Filters with Functions with embedded expressions correctly)
<<<<<<< HEAD
>>>>>>> cf57a2c189 (GEOMESA-3067 Find attribute in Filters with Functions with embedded expressions correctly)
=======
=======
=======
>>>>>>> c8a325e13 (GEOMESA-3061 Converters - support bytes in Avro top-level union types (#2762))
<<<<<<< HEAD
<<<<<<< HEAD
<<<<<<< HEAD
>>>>>>> c9328eddce (GEOMESA-3061 Converters - support bytes in Avro top-level union types (#2762))
<<<<<<< HEAD
>>>>>>> e15d50d7d3 (GEOMESA-3061 Converters - support bytes in Avro top-level union types (#2762))
=======
=======
=======
=======
>>>>>>> 908ad4071 (GEOMESA-3067 Find attribute in Filters with Functions with embedded expressions correctly)
>>>>>>> 9638dc731 (GEOMESA-3067 Find attribute in Filters with Functions with embedded expressions correctly)
<<<<<<< HEAD
<<<<<<< HEAD
<<<<<<< HEAD
>>>>>>> d2eec4be68 (GEOMESA-3067 Find attribute in Filters with Functions with embedded expressions correctly)
<<<<<<< HEAD
>>>>>>> bec3ba7d08 (GEOMESA-3067 Find attribute in Filters with Functions with embedded expressions correctly)
=======
=======
=======
>>>>>>> 97ec7d864 (GEOMESA-3061 Converters - support bytes in Avro top-level union types (#2762))
<<<<<<< HEAD
<<<<<<< HEAD
<<<<<<< HEAD
>>>>>>> d94c03a98e (GEOMESA-3061 Converters - support bytes in Avro top-level union types (#2762))
<<<<<<< HEAD
>>>>>>> 8de43cccf6 (GEOMESA-3061 Converters - support bytes in Avro top-level union types (#2762))
=======
=======
=======
=======
        Result.foreach(1 to 10) { j =>
>>>>>>> 3be8d2a5a (Merge branch 'feature/postgis-fixes')
>>>>>>> db8d998aa (Merge branch 'feature/postgis-fixes')
<<<<<<< HEAD
<<<<<<< HEAD
<<<<<<< HEAD
>>>>>>> cb6bda89b6 (Merge branch 'feature/postgis-fixes')
<<<<<<< HEAD
>>>>>>> 26e5afc4ea (Merge branch 'feature/postgis-fixes')
=======
=======
=======
        Result.foreach(1 to 10) { j =>
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
>>>>>>> 7bb5f26c3 (GEOMESA-3067 Find attribute in Filters with Functions with embedded expressions correctly)
<<<<<<< HEAD
<<<<<<< HEAD
<<<<<<< HEAD
>>>>>>> e69b2aa6dc (GEOMESA-3067 Find attribute in Filters with Functions with embedded expressions correctly)
<<<<<<< HEAD
>>>>>>> b1a7408547 (GEOMESA-3067 Find attribute in Filters with Functions with embedded expressions correctly)
=======
=======
=======
=======
        Result.foreach(1 to 10) { j =>
>>>>>>> b9bdd406e (GEOMESA-3061 Converters - support bytes in Avro top-level union types (#2762))
>>>>>>> 6d9a5b626 (GEOMESA-3061 Converters - support bytes in Avro top-level union types (#2762))
<<<<<<< HEAD
<<<<<<< HEAD
<<<<<<< HEAD
>>>>>>> 67e4c1354f (GEOMESA-3061 Converters - support bytes in Avro top-level union types (#2762))
<<<<<<< HEAD
>>>>>>> 12e3a588fc (GEOMESA-3061 Converters - support bytes in Avro top-level union types (#2762))
=======
=======
=======
=======
>>>>>>> e6e1f4bdd (GEOMESA-3061 Converters - support bytes in Avro top-level union types (#2762))
=======
<<<<<<< HEAD
<<<<<<< HEAD
        Result.foreach(1 to 10) { j =>
>>>>>>> b9bdd406e (GEOMESA-3061 Converters - support bytes in Avro top-level union types (#2762))
=======
>>>>>>> f36b0e8b9 (GEOMESA-3067 Find attribute in Filters with Functions with embedded expressions correctly)
<<<<<<< HEAD
>>>>>>> e5ed68fdd (GEOMESA-3067 Find attribute in Filters with Functions with embedded expressions correctly)
<<<<<<< HEAD
>>>>>>> 060ac2189c (GEOMESA-3067 Find attribute in Filters with Functions with embedded expressions correctly)
<<<<<<< HEAD
>>>>>>> c8e013ff91 (GEOMESA-3067 Find attribute in Filters with Functions with embedded expressions correctly)
=======
=======
=======
=======
>>>>>>> c3c5dd0ebb (GEOMESA-3061 Converters - support bytes in Avro top-level union types (#2762))
=======
=======
        Result.foreach(1 to 10) { j =>
>>>>>>> b9bdd406e (GEOMESA-3061 Converters - support bytes in Avro top-level union types (#2762))
>>>>>>> cdb410251 (GEOMESA-3061 Converters - support bytes in Avro top-level union types (#2762))
<<<<<<< HEAD
>>>>>>> e6e1f4bdd (GEOMESA-3061 Converters - support bytes in Avro top-level union types (#2762))
<<<<<<< HEAD
>>>>>>> 8035cc5893 (GEOMESA-3061 Converters - support bytes in Avro top-level union types (#2762))
<<<<<<< HEAD
>>>>>>> 1890b11217 (GEOMESA-3061 Converters - support bytes in Avro top-level union types (#2762))
=======
=======
=======
=======
>>>>>>> e3a63fee1 (GEOMESA-3067 Find attribute in Filters with Functions with embedded expressions correctly)
>>>>>>> 7f922b040 (GEOMESA-3067 Find attribute in Filters with Functions with embedded expressions correctly)
<<<<<<< HEAD
<<<<<<< HEAD
<<<<<<< HEAD
>>>>>>> 04f08c23c5 (GEOMESA-3067 Find attribute in Filters with Functions with embedded expressions correctly)
<<<<<<< HEAD
>>>>>>> 912169b5e9 (GEOMESA-3067 Find attribute in Filters with Functions with embedded expressions correctly)
=======
=======
=======
>>>>>>> a910ae135 (GEOMESA-3061 Converters - support bytes in Avro top-level union types (#2762))
<<<<<<< HEAD
<<<<<<< HEAD
<<<<<<< HEAD
>>>>>>> 07161eaaa6 (GEOMESA-3061 Converters - support bytes in Avro top-level union types (#2762))
<<<<<<< HEAD
>>>>>>> 9c28193a91 (GEOMESA-3061 Converters - support bytes in Avro top-level union types (#2762))
=======
=======
=======
=======
>>>>>>> a63cb7e74 (GEOMESA-3067 Find attribute in Filters with Functions with embedded expressions correctly)
>>>>>>> 8fb060734 (GEOMESA-3067 Find attribute in Filters with Functions with embedded expressions correctly)
<<<<<<< HEAD
<<<<<<< HEAD
<<<<<<< HEAD
>>>>>>> 38b3282770 (GEOMESA-3067 Find attribute in Filters with Functions with embedded expressions correctly)
<<<<<<< HEAD
>>>>>>> 1b60c2aeba (GEOMESA-3067 Find attribute in Filters with Functions with embedded expressions correctly)
=======
=======
=======
>>>>>>> ad3cedc4d (GEOMESA-3061 Converters - support bytes in Avro top-level union types (#2762))
<<<<<<< HEAD
<<<<<<< HEAD
<<<<<<< HEAD
>>>>>>> 9abc630fdf (GEOMESA-3061 Converters - support bytes in Avro top-level union types (#2762))
<<<<<<< HEAD
>>>>>>> d294ce49e2 (GEOMESA-3061 Converters - support bytes in Avro top-level union types (#2762))
=======
=======
=======
=======
>>>>>>> 908ad4071 (GEOMESA-3067 Find attribute in Filters with Functions with embedded expressions correctly)
>>>>>>> bc4913194 (GEOMESA-3067 Find attribute in Filters with Functions with embedded expressions correctly)
<<<<<<< HEAD
<<<<<<< HEAD
<<<<<<< HEAD
>>>>>>> 570899511d (GEOMESA-3067 Find attribute in Filters with Functions with embedded expressions correctly)
<<<<<<< HEAD
>>>>>>> ed45e8551f (GEOMESA-3067 Find attribute in Filters with Functions with embedded expressions correctly)
=======
=======
=======
>>>>>>> bdbced26d (GEOMESA-3061 Converters - support bytes in Avro top-level union types (#2762))
<<<<<<< HEAD
<<<<<<< HEAD
<<<<<<< HEAD
>>>>>>> 25063957fc (GEOMESA-3061 Converters - support bytes in Avro top-level union types (#2762))
<<<<<<< HEAD
>>>>>>> 1df8328338 (GEOMESA-3061 Converters - support bytes in Avro top-level union types (#2762))
=======
=======
=======
=======
        Result.foreach(1 to 10) { j =>
>>>>>>> 3be8d2a5a (Merge branch 'feature/postgis-fixes')
>>>>>>> 1b25d7ddb (Merge branch 'feature/postgis-fixes')
>>>>>>> 699117eca9 (Merge branch 'feature/postgis-fixes')
>>>>>>> c69897d7bd (Merge branch 'feature/postgis-fixes')
=======
        Result.foreach(1 to 10) { j =>
=======
        Result.foreach(1 to 10){ j =>
>>>>>>> 7acc3ea46 (GEOMESA-3067 Find attribute in Filters with Functions with embedded expressions correctly)
>>>>>>> 74db66044b (GEOMESA-3067 Find attribute in Filters with Functions with embedded expressions correctly)
<<<<<<< HEAD
<<<<<<< HEAD
<<<<<<< HEAD
<<<<<<< HEAD
=======
>>>>>>> 0104fb37e4 (GEOMESA-3061 Converters - support bytes in Avro top-level union types (#2762))
=======
>>>>>>> 9293965a7d (GEOMESA-3061 Converters - support bytes in Avro top-level union types (#2762))
=======
=======
        Result.foreach(1 to 10) { j =>
>>>>>>> b9bdd406e (GEOMESA-3061 Converters - support bytes in Avro top-level union types (#2762))
>>>>>>> f0b9bd8121 (GEOMESA-3061 Converters - support bytes in Avro top-level union types (#2762))
<<<<<<< HEAD
<<<<<<< HEAD
<<<<<<< HEAD
<<<<<<< HEAD
=======
>>>>>>> 530b057384 (GEOMESA-3067 Find attribute in Filters with Functions with embedded expressions correctly)
=======
>>>>>>> 67dc71ffb1 (GEOMESA-3067 Find attribute in Filters with Functions with embedded expressions correctly)
=======
=======
        Result.foreach(1 to 10) { j =>
>>>>>>> b9bdd406e (GEOMESA-3061 Converters - support bytes in Avro top-level union types (#2762))
=======
>>>>>>> f36b0e8b9 (GEOMESA-3067 Find attribute in Filters with Functions with embedded expressions correctly)
>>>>>>> ef1a0521bd (GEOMESA-3067 Find attribute in Filters with Functions with embedded expressions correctly)
<<<<<<< HEAD
<<<<<<< HEAD
<<<<<<< HEAD
<<<<<<< HEAD
=======
>>>>>>> c3c5dd0ebb (GEOMESA-3061 Converters - support bytes in Avro top-level union types (#2762))
=======
=======
>>>>>>> e3a63fee1 (GEOMESA-3067 Find attribute in Filters with Functions with embedded expressions correctly)
>>>>>>> 20f6826d0f (GEOMESA-3067 Find attribute in Filters with Functions with embedded expressions correctly)
<<<<<<< HEAD
<<<<<<< HEAD
<<<<<<< HEAD
<<<<<<< HEAD
=======
>>>>>>> 4c361f07da (GEOMESA-3061 Converters - support bytes in Avro top-level union types (#2762))
=======
=======
>>>>>>> a63cb7e74 (GEOMESA-3067 Find attribute in Filters with Functions with embedded expressions correctly)
>>>>>>> 125ffd0575 (GEOMESA-3067 Find attribute in Filters with Functions with embedded expressions correctly)
<<<<<<< HEAD
<<<<<<< HEAD
<<<<<<< HEAD
<<<<<<< HEAD
=======
>>>>>>> 86ec77f9cb (GEOMESA-3061 Converters - support bytes in Avro top-level union types (#2762))
=======
>>>>>>> 2a887f75bf (GEOMESA-3061 Converters - support bytes in Avro top-level union types (#2762))
=======
=======
>>>>>>> 67b361c85 (GEOMESA-3061 Converters - support bytes in Avro top-level union types (#2762))
>>>>>>> f302a54949 (GEOMESA-3061 Converters - support bytes in Avro top-level union types (#2762))
<<<<<<< HEAD
<<<<<<< HEAD
<<<<<<< HEAD
<<<<<<< HEAD
=======
>>>>>>> 17883cb601 (GEOMESA-3067 Find attribute in Filters with Functions with embedded expressions correctly)
=======
>>>>>>> 08a743b61d (GEOMESA-3067 Find attribute in Filters with Functions with embedded expressions correctly)
=======
=======
>>>>>>> 908ad4071 (GEOMESA-3067 Find attribute in Filters with Functions with embedded expressions correctly)
>>>>>>> a83fe4cf7c (GEOMESA-3067 Find attribute in Filters with Functions with embedded expressions correctly)
<<<<<<< HEAD
<<<<<<< HEAD
<<<<<<< HEAD
<<<<<<< HEAD
=======
>>>>>>> a788dfac03 (GEOMESA-3061 Converters - support bytes in Avro top-level union types (#2762))
=======
=======
        Result.foreach(1 to 10) { j =>
>>>>>>> 3be8d2a5a (Merge branch 'feature/postgis-fixes')
>>>>>>> da00c7bd68 (Merge branch 'feature/postgis-fixes')
<<<<<<< HEAD
<<<<<<< HEAD
<<<<<<< HEAD
=======
>>>>>>> 32d312dc48 (GEOMESA-3067 Find attribute in Filters with Functions with embedded expressions correctly)
=======
=======
        Result.foreach(1 to 10) { j =>
>>>>>>> b9bdd406e3 (GEOMESA-3061 Converters - support bytes in Avro top-level union types (#2762))
>>>>>>> 59a1fbb96e (GEOMESA-3061 Converters - support bytes in Avro top-level union types (#2762))
<<<<<<< HEAD
<<<<<<< HEAD
=======
>>>>>>> f36b0e8b9a (GEOMESA-3067 Find attribute in Filters with Functions with embedded expressions correctly)
>>>>>>> a1d28116d4 (GEOMESA-3067 Find attribute in Filters with Functions with embedded expressions correctly)
=======
<<<<<<< HEAD
<<<<<<< HEAD
<<<<<<< HEAD
=======
>>>>>>> 95e52e061e (GEOMESA-3061 Converters - support bytes in Avro top-level union types (#2762))
=======
>>>>>>> f67dd3371e (GEOMESA-3061 Converters - support bytes in Avro top-level union types (#2762))
>>>>>>> f36b0e8b9a (GEOMESA-3067 Find attribute in Filters with Functions with embedded expressions correctly)
=======
<<<<<<< HEAD
>>>>>>> f36b0e8b9a (GEOMESA-3067 Find attribute in Filters with Functions with embedded expressions correctly)
>>>>>>> 7bdbfa5524 (GEOMESA-3061 Converters - support bytes in Avro top-level union types (#2762))
=======
>>>>>>> f36b0e8b9a (GEOMESA-3067 Find attribute in Filters with Functions with embedded expressions correctly)
>>>>>>> e7d6b701c8 (GEOMESA-3061 Converters - support bytes in Avro top-level union types (#2762))
=======
=======
        Result.foreach(1 to 10) { j =>
>>>>>>> b9bdd406e (GEOMESA-3061 Converters - support bytes in Avro top-level union types (#2762))
>>>>>>> cdb4102515 (GEOMESA-3061 Converters - support bytes in Avro top-level union types (#2762))
<<<<<<< HEAD
<<<<<<< HEAD
<<<<<<< HEAD
<<<<<<< HEAD
>>>>>>> d1fa26b39d (GEOMESA-3061 Converters - support bytes in Avro top-level union types (#2762))
=======
=======
=======
>>>>>>> 17b189175b (GEOMESA-3067 Find attribute in Filters with Functions with embedded expressions correctly)
=======
>>>>>>> d1fa26b39d (GEOMESA-3061 Converters - support bytes in Avro top-level union types (#2762))
=======
=======
>>>>>>> 70f2c62b7e (GEOMESA-3067 Find attribute in Filters with Functions with embedded expressions correctly)
        Result.foreach(1 to 10) { j =>
=======
        Result.foreach(1 to 10){ j =>
>>>>>>> 7acc3ea46 (GEOMESA-3067 Find attribute in Filters with Functions with embedded expressions correctly)
>>>>>>> e3a63fee18 (GEOMESA-3067 Find attribute in Filters with Functions with embedded expressions correctly)
<<<<<<< HEAD
<<<<<<< HEAD
<<<<<<< HEAD
<<<<<<< HEAD
>>>>>>> ef55408e9a (GEOMESA-3067 Find attribute in Filters with Functions with embedded expressions correctly)
=======
=======
>>>>>>> 7bff4d0018 (GEOMESA-3061 Converters - support bytes in Avro top-level union types (#2762))
=======
=======
        Result.foreach(1 to 10) { j =>
>>>>>>> b9bdd406e (GEOMESA-3061 Converters - support bytes in Avro top-level union types (#2762))
>>>>>>> 0e68e9f4cc (GEOMESA-3061 Converters - support bytes in Avro top-level union types (#2762))
<<<<<<< HEAD
>>>>>>> f67dd3371e (GEOMESA-3061 Converters - support bytes in Avro top-level union types (#2762))
=======
>>>>>>> a63cb7e740 (GEOMESA-3067 Find attribute in Filters with Functions with embedded expressions correctly)
>>>>>>> a9884ff1f6 (GEOMESA-3067 Find attribute in Filters with Functions with embedded expressions correctly)
=======
>>>>>>> 67b361c856 (GEOMESA-3061 Converters - support bytes in Avro top-level union types (#2762))
<<<<<<< HEAD
>>>>>>> f7cef54062 (GEOMESA-3061 Converters - support bytes in Avro top-level union types (#2762))
=======
=======
        Result.foreach(1 to 10) { j =>
=======
        Result.foreach(1 to 10){ j =>
>>>>>>> 7acc3ea46 (GEOMESA-3067 Find attribute in Filters with Functions with embedded expressions correctly)
<<<<<<< HEAD
>>>>>>> 908ad4071d (GEOMESA-3067 Find attribute in Filters with Functions with embedded expressions correctly)
>>>>>>> 49f2a1c310 (GEOMESA-3067 Find attribute in Filters with Functions with embedded expressions correctly)
=======
>>>>>>> a16b64a4d1 (GEOMESA-3061 Converters - support bytes in Avro top-level union types (#2762))
<<<<<<< HEAD
<<<<<<< HEAD
=======
>>>>>>> d581fa3e8f (Merge branch 'feature/postgis-fixes')
=======
=======
        Result.foreach(1 to 10) { j =>
>>>>>>> 3be8d2a5a4 (Merge branch 'feature/postgis-fixes')
>>>>>>> 34472778d3 (Merge branch 'feature/postgis-fixes')
<<<<<<< HEAD
<<<<<<< HEAD
=======
>>>>>>> 5430d59024 (GEOMESA-3067 Find attribute in Filters with Functions with embedded expressions correctly)
=======
>>>>>>> 810876750d (GEOMESA-3061 Converters - support bytes in Avro top-level union types (#2762))
<<<<<<< HEAD
<<<<<<< HEAD
=======
>>>>>>> e182e6e99c (GEOMESA-3067 Find attribute in Filters with Functions with embedded expressions correctly)
<<<<<<< HEAD
>>>>>>> 2571e49519 (GEOMESA-3067 Find attribute in Filters with Functions with embedded expressions correctly)
=======
=======
>>>>>>> 9d708b240a (GEOMESA-3061 Converters - support bytes in Avro top-level union types (#2762))
<<<<<<< HEAD
>>>>>>> d206a68a13 (GEOMESA-3061 Converters - support bytes in Avro top-level union types (#2762))
=======
=======
=======
<<<<<<< HEAD
<<<<<<< HEAD
=======
>>>>>>> 00e61f4b70 (GEOMESA-3061 Converters - support bytes in Avro top-level union types (#2762))
>>>>>>> c8a325e13c (GEOMESA-3061 Converters - support bytes in Avro top-level union types (#2762))
=======
>>>>>>> e3a63fee1 (GEOMESA-3067 Find attribute in Filters with Functions with embedded expressions correctly)
<<<<<<< HEAD
>>>>>>> 3333975e77 (GEOMESA-3067 Find attribute in Filters with Functions with embedded expressions correctly)
<<<<<<< HEAD
>>>>>>> 9412e85b59 (GEOMESA-3067 Find attribute in Filters with Functions with embedded expressions correctly)
=======
=======
=======
=======
        Result.foreach(1 to 10) { j =>
>>>>>>> b9bdd406e (GEOMESA-3061 Converters - support bytes in Avro top-level union types (#2762))
>>>>>>> 0e68e9f4c (GEOMESA-3061 Converters - support bytes in Avro top-level union types (#2762))
<<<<<<< HEAD
<<<<<<< HEAD
>>>>>>> 76618c8da3 (GEOMESA-3061 Converters - support bytes in Avro top-level union types (#2762))
<<<<<<< HEAD
>>>>>>> 694bcd3776 (GEOMESA-3061 Converters - support bytes in Avro top-level union types (#2762))
=======
=======
=======
>>>>>>> a63cb7e74 (GEOMESA-3067 Find attribute in Filters with Functions with embedded expressions correctly)
<<<<<<< HEAD
<<<<<<< HEAD
>>>>>>> c3b0a1b6e3 (GEOMESA-3067 Find attribute in Filters with Functions with embedded expressions correctly)
<<<<<<< HEAD
>>>>>>> 24c4df93a5 (GEOMESA-3067 Find attribute in Filters with Functions with embedded expressions correctly)
=======
=======
=======
>>>>>>> 67b361c85 (GEOMESA-3061 Converters - support bytes in Avro top-level union types (#2762))
<<<<<<< HEAD
<<<<<<< HEAD
>>>>>>> c8a325e13c (GEOMESA-3061 Converters - support bytes in Avro top-level union types (#2762))
<<<<<<< HEAD
>>>>>>> 6cd1151639 (GEOMESA-3061 Converters - support bytes in Avro top-level union types (#2762))
=======
=======
=======
>>>>>>> 908ad4071 (GEOMESA-3067 Find attribute in Filters with Functions with embedded expressions correctly)
<<<<<<< HEAD
<<<<<<< HEAD
>>>>>>> 9638dc731e (GEOMESA-3067 Find attribute in Filters with Functions with embedded expressions correctly)
<<<<<<< HEAD
>>>>>>> 1e00950a90 (GEOMESA-3067 Find attribute in Filters with Functions with embedded expressions correctly)
=======
=======
=======
=======
        Result.foreach(1 to 10) { j =>
>>>>>>> b9bdd406e (GEOMESA-3061 Converters - support bytes in Avro top-level union types (#2762))
>>>>>>> b4320946b (GEOMESA-3061 Converters - support bytes in Avro top-level union types (#2762))
<<<<<<< HEAD
<<<<<<< HEAD
>>>>>>> 97ec7d864a (GEOMESA-3061 Converters - support bytes in Avro top-level union types (#2762))
<<<<<<< HEAD
>>>>>>> 1973f72e77 (GEOMESA-3061 Converters - support bytes in Avro top-level union types (#2762))
=======
=======
=======
        Result.foreach(1 to 10) { j =>
>>>>>>> 3be8d2a5a (Merge branch 'feature/postgis-fixes')
>>>>>>> db8d998aa2 (Merge branch 'feature/postgis-fixes')
<<<<<<< HEAD
<<<<<<< HEAD
<<<<<<< HEAD
=======
>>>>>>> c738f63bd9 (GEOMESA-3254 Add Bloop build support)
>>>>>>> 42e8565e9b (Merge branch 'feature/postgis-fixes')
=======
=======
        Result.foreach(1 to 10) { j =>
>>>>>>> d845d7c1bd (GEOMESA-3254 Add Bloop build support)
<<<<<<< HEAD
<<<<<<< HEAD
<<<<<<< HEAD
<<<<<<< HEAD
>>>>>>> f1532f2313 (GEOMESA-3254 Add Bloop build support)
=======
=======
>>>>>>> bad8172e9b (GEOMESA-3067 Find attribute in Filters with Functions with embedded expressions correctly)
=======
=======
>>>>>>> f1532f2313 (GEOMESA-3254 Add Bloop build support)
=======
=======
>>>>>>> 7213a78a3a (GEOMESA-3067 Find attribute in Filters with Functions with embedded expressions correctly)
        Result.foreach(1 to 10) { j =>
=======
        Result.foreach(1 to 10){ j =>
>>>>>>> 7acc3ea46 (GEOMESA-3067 Find attribute in Filters with Functions with embedded expressions correctly)
>>>>>>> 7bb5f26c3e (GEOMESA-3067 Find attribute in Filters with Functions with embedded expressions correctly)
<<<<<<< HEAD
<<<<<<< HEAD
>>>>>>> 4bbf97686c (GEOMESA-3067 Find attribute in Filters with Functions with embedded expressions correctly)
=======
=======
>>>>>>> 7fbbd56493 (GEOMESA-3061 Converters - support bytes in Avro top-level union types (#2762))
=======
        Result.foreach(1 to 10) { j =>
>>>>>>> b9bdd406e (GEOMESA-3061 Converters - support bytes in Avro top-level union types (#2762))
>>>>>>> 6d9a5b626c (GEOMESA-3061 Converters - support bytes in Avro top-level union types (#2762))
<<<<<<< HEAD
<<<<<<< HEAD
<<<<<<< HEAD
>>>>>>> 96d5d442fa (GEOMESA-3061 Converters - support bytes in Avro top-level union types (#2762))
=======
=======
>>>>>>> e582c3ecfe (GEOMESA-3067 Find attribute in Filters with Functions with embedded expressions correctly)
=======
=======
        Result.foreach(1 to 10) { j =>
>>>>>>> b9bdd406e (GEOMESA-3061 Converters - support bytes in Avro top-level union types (#2762))
=======
>>>>>>> f36b0e8b9 (GEOMESA-3067 Find attribute in Filters with Functions with embedded expressions correctly)
>>>>>>> e5ed68fdd3 (GEOMESA-3067 Find attribute in Filters with Functions with embedded expressions correctly)
<<<<<<< HEAD
>>>>>>> b3dd8ec805 (GEOMESA-3067 Find attribute in Filters with Functions with embedded expressions correctly)
=======
>>>>>>> 5dcf23da52 (GEOMESA-3061 Converters - support bytes in Avro top-level union types (#2762))
=======
>>>>>>> 2b62d1f3fe (GEOMESA-3067 Find attribute in Filters with Functions with embedded expressions correctly)
=======
=======
>>>>>>> a910ae135f (GEOMESA-3061 Converters - support bytes in Avro top-level union types (#2762))
>>>>>>> 92674ff9d4 (GEOMESA-3061 Converters - support bytes in Avro top-level union types (#2762))
=======
>>>>>>> c169cb2905 (GEOMESA-3067 Find attribute in Filters with Functions with embedded expressions correctly)
<<<<<<< HEAD
<<<<<<< HEAD
=======
>>>>>>> 9a4dff9e4f (GEOMESA-3061 Converters - support bytes in Avro top-level union types (#2762))
=======
>>>>>>> 63ca73533e (GEOMESA-3067 Find attribute in Filters with Functions with embedded expressions correctly)
<<<<<<< HEAD
<<<<<<< HEAD
=======
>>>>>>> c029a43a6c (GEOMESA-3061 Converters - support bytes in Avro top-level union types (#2762))
=======
=======
>>>>>>> bdbced26d4 (GEOMESA-3061 Converters - support bytes in Avro top-level union types (#2762))
>>>>>>> 0fc6650ecf (GEOMESA-3061 Converters - support bytes in Avro top-level union types (#2762))
<<<<<<< HEAD
<<<<<<< HEAD
=======
>>>>>>> 67de3c3202 (Merge branch 'feature/postgis-fixes')
=======
=======
>>>>>>> 87bf55340 (GEOMESA-3061 Converters - support bytes in Avro top-level union types (#2762))
<<<<<<< HEAD
<<<<<<< HEAD
<<<<<<< HEAD
>>>>>>> 0dbede148d (GEOMESA-3061 Converters - support bytes in Avro top-level union types (#2762))
<<<<<<< HEAD
>>>>>>> 1bb69524c2 (GEOMESA-3061 Converters - support bytes in Avro top-level union types (#2762))
=======
=======
=======
>>>>>>> 240977229 (GEOMESA-3061 Converters - support bytes in Avro top-level union types (#2762))
>>>>>>> 22dcc8170f (GEOMESA-3061 Converters - support bytes in Avro top-level union types (#2762))
>>>>>>> 8c9ca1211a (GEOMESA-3061 Converters - support bytes in Avro top-level union types (#2762))
=======
>>>>>>> b009fd23f4 (GEOMESA-3061 Converters - support bytes in Avro top-level union types (#2762))
>>>>>>> a22efb4d66 (GEOMESA-3061 Converters - support bytes in Avro top-level union types (#2762))
<<<<<<< HEAD
<<<<<<< HEAD
=======
>>>>>>> 238945d4b3 (GEOMESA-3061 Converters - support bytes in Avro top-level union types (#2762))
>>>>>>> 1cad375176 (GEOMESA-3061 Converters - support bytes in Avro top-level union types (#2762))
=======
>>>>>>> bc4062951d (GEOMESA-3061 Converters - support bytes in Avro top-level union types (#2762))
>>>>>>> 1e39c0c27d (GEOMESA-3061 Converters - support bytes in Avro top-level union types (#2762))
<<<<<<< HEAD
=======
>>>>>>> e944f1c88b (Merge branch 'feature/postgis-fixes')
>>>>>>> 638b68d081 (Merge branch 'feature/postgis-fixes')
=======
=======
>>>>>>> a1f15598cb (GEOMESA-3061 Converters - support bytes in Avro top-level union types (#2762))
>>>>>>> 8a3e82747d (GEOMESA-3067 Find attribute in Filters with Functions with embedded expressions correctly)
<<<<<<< HEAD
>>>>>>> deb8fd68de (GEOMESA-3067 Find attribute in Filters with Functions with embedded expressions correctly)
<<<<<<< HEAD
>>>>>>> a990cf104e (GEOMESA-3067 Find attribute in Filters with Functions with embedded expressions correctly)
=======
=======
=======
=======
=======
        Result.foreach(1 to 10) { j =>
>>>>>>> b9bdd406e (GEOMESA-3061 Converters - support bytes in Avro top-level union types (#2762))
>>>>>>> d9ed077cd (GEOMESA-3061 Converters - support bytes in Avro top-level union types (#2762))
=======
>>>>>>> 4373c901b3 (GEOMESA-3067 Find attribute in Filters with Functions with embedded expressions correctly)
>>>>>>> 81ee66102b (GEOMESA-3061 Converters - support bytes in Avro top-level union types (#2762))
<<<<<<< HEAD
>>>>>>> 8adfab65bb (GEOMESA-3061 Converters - support bytes in Avro top-level union types (#2762))
<<<<<<< HEAD
>>>>>>> a1f15598cb (GEOMESA-3061 Converters - support bytes in Avro top-level union types (#2762))
=======
=======
=======
=======
>>>>>>> e182e6e99 (GEOMESA-3067 Find attribute in Filters with Functions with embedded expressions correctly)
=======
>>>>>>> 963feec660 (GEOMESA-3061 Converters - support bytes in Avro top-level union types (#2762))
>>>>>>> 9943e05ec9 (GEOMESA-3067 Find attribute in Filters with Functions with embedded expressions correctly)
<<<<<<< HEAD
>>>>>>> 3254b186da (GEOMESA-3067 Find attribute in Filters with Functions with embedded expressions correctly)
<<<<<<< HEAD
>>>>>>> 4373c901b3 (GEOMESA-3067 Find attribute in Filters with Functions with embedded expressions correctly)
=======
=======
=======
=======
>>>>>>> 9d708b240 (GEOMESA-3061 Converters - support bytes in Avro top-level union types (#2762))
=======
>>>>>>> 2c14568a23 (GEOMESA-3067 Find attribute in Filters with Functions with embedded expressions correctly)
>>>>>>> 53a3e72cbf (GEOMESA-3061 Converters - support bytes in Avro top-level union types (#2762))
<<<<<<< HEAD
>>>>>>> 7b0539b808 (GEOMESA-3061 Converters - support bytes in Avro top-level union types (#2762))
<<<<<<< HEAD
>>>>>>> 963feec660 (GEOMESA-3061 Converters - support bytes in Avro top-level union types (#2762))
=======
=======
=======
=======
=======
>>>>>>> e3a63fee1 (GEOMESA-3067 Find attribute in Filters with Functions with embedded expressions correctly)
>>>>>>> 3333975e7 (GEOMESA-3067 Find attribute in Filters with Functions with embedded expressions correctly)
=======
>>>>>>> 84ac051f28 (GEOMESA-3061 Converters - support bytes in Avro top-level union types (#2762))
>>>>>>> d15af7157e (GEOMESA-3067 Find attribute in Filters with Functions with embedded expressions correctly)
<<<<<<< HEAD
>>>>>>> 982031ef44 (GEOMESA-3067 Find attribute in Filters with Functions with embedded expressions correctly)
<<<<<<< HEAD
>>>>>>> 2c14568a23 (GEOMESA-3067 Find attribute in Filters with Functions with embedded expressions correctly)
=======
=======
=======
=======
>>>>>>> 76618c8da (GEOMESA-3061 Converters - support bytes in Avro top-level union types (#2762))
=======
>>>>>>> 99acaa0887 (GEOMESA-3067 Find attribute in Filters with Functions with embedded expressions correctly)
>>>>>>> 947761ec9b (GEOMESA-3061 Converters - support bytes in Avro top-level union types (#2762))
<<<<<<< HEAD
>>>>>>> 0086b292ba (GEOMESA-3061 Converters - support bytes in Avro top-level union types (#2762))
<<<<<<< HEAD
>>>>>>> 84ac051f28 (GEOMESA-3061 Converters - support bytes in Avro top-level union types (#2762))
=======
=======
=======
=======
=======
>>>>>>> a63cb7e74 (GEOMESA-3067 Find attribute in Filters with Functions with embedded expressions correctly)
>>>>>>> c3b0a1b6e (GEOMESA-3067 Find attribute in Filters with Functions with embedded expressions correctly)
=======
>>>>>>> fe3de10f11 (GEOMESA-3061 Converters - support bytes in Avro top-level union types (#2762))
>>>>>>> 9813375fcc (GEOMESA-3067 Find attribute in Filters with Functions with embedded expressions correctly)
<<<<<<< HEAD
>>>>>>> cf57a2c189 (GEOMESA-3067 Find attribute in Filters with Functions with embedded expressions correctly)
<<<<<<< HEAD
>>>>>>> 99acaa0887 (GEOMESA-3067 Find attribute in Filters with Functions with embedded expressions correctly)
=======
=======
=======
=======
>>>>>>> c8a325e13 (GEOMESA-3061 Converters - support bytes in Avro top-level union types (#2762))
=======
>>>>>>> 21deff19fd (GEOMESA-3067 Find attribute in Filters with Functions with embedded expressions correctly)
>>>>>>> c9328eddce (GEOMESA-3061 Converters - support bytes in Avro top-level union types (#2762))
<<<<<<< HEAD
>>>>>>> e15d50d7d3 (GEOMESA-3061 Converters - support bytes in Avro top-level union types (#2762))
<<<<<<< HEAD
>>>>>>> fe3de10f11 (GEOMESA-3061 Converters - support bytes in Avro top-level union types (#2762))
=======
=======
=======
=======
=======
>>>>>>> 908ad4071 (GEOMESA-3067 Find attribute in Filters with Functions with embedded expressions correctly)
>>>>>>> 9638dc731 (GEOMESA-3067 Find attribute in Filters with Functions with embedded expressions correctly)
=======
>>>>>>> d0785cf307 (GEOMESA-3061 Converters - support bytes in Avro top-level union types (#2762))
>>>>>>> d2eec4be68 (GEOMESA-3067 Find attribute in Filters with Functions with embedded expressions correctly)
<<<<<<< HEAD
>>>>>>> bec3ba7d08 (GEOMESA-3067 Find attribute in Filters with Functions with embedded expressions correctly)
<<<<<<< HEAD
>>>>>>> 21deff19fd (GEOMESA-3067 Find attribute in Filters with Functions with embedded expressions correctly)
=======
=======
=======
=======
>>>>>>> 97ec7d864 (GEOMESA-3061 Converters - support bytes in Avro top-level union types (#2762))
=======
>>>>>>> 71adb695c5 (Merge branch 'feature/postgis-fixes')
>>>>>>> d94c03a98e (GEOMESA-3061 Converters - support bytes in Avro top-level union types (#2762))
<<<<<<< HEAD
>>>>>>> 8de43cccf6 (GEOMESA-3061 Converters - support bytes in Avro top-level union types (#2762))
<<<<<<< HEAD
>>>>>>> d0785cf307 (GEOMESA-3061 Converters - support bytes in Avro top-level union types (#2762))
=======
=======
=======
=======
=======
        Result.foreach(1 to 10) { j =>
>>>>>>> 3be8d2a5a (Merge branch 'feature/postgis-fixes')
>>>>>>> db8d998aa (Merge branch 'feature/postgis-fixes')
=======
>>>>>>> 5a4c24e020 (GEOMESA-3254 Add Bloop build support)
>>>>>>> cb6bda89b6 (Merge branch 'feature/postgis-fixes')
<<<<<<< HEAD
>>>>>>> 26e5afc4ea (Merge branch 'feature/postgis-fixes')
<<<<<<< HEAD
>>>>>>> 71adb695c5 (Merge branch 'feature/postgis-fixes')
=======
=======
=======
=======
        Result.foreach(1 to 10) { j =>
>>>>>>> d845d7c1b (GEOMESA-3254 Add Bloop build support)
=======
>>>>>>> 53900605ca (GEOMESA-3067 Find attribute in Filters with Functions with embedded expressions correctly)
>>>>>>> 09d87762c5 (GEOMESA-3254 Add Bloop build support)
<<<<<<< HEAD
>>>>>>> 63a045a753 (GEOMESA-3254 Add Bloop build support)
<<<<<<< HEAD
>>>>>>> 5a4c24e020 (GEOMESA-3254 Add Bloop build support)
=======
=======
=======
=======
>>>>>>> 7bb5f26c3 (GEOMESA-3067 Find attribute in Filters with Functions with embedded expressions correctly)
=======
>>>>>>> a52e4429be (GEOMESA-3061 Converters - support bytes in Avro top-level union types (#2762))
>>>>>>> e69b2aa6dc (GEOMESA-3067 Find attribute in Filters with Functions with embedded expressions correctly)
<<<<<<< HEAD
>>>>>>> b1a7408547 (GEOMESA-3067 Find attribute in Filters with Functions with embedded expressions correctly)
<<<<<<< HEAD
>>>>>>> 53900605ca (GEOMESA-3067 Find attribute in Filters with Functions with embedded expressions correctly)
=======
=======
=======
=======
=======
        Result.foreach(1 to 10) { j =>
>>>>>>> b9bdd406e (GEOMESA-3061 Converters - support bytes in Avro top-level union types (#2762))
>>>>>>> 6d9a5b626 (GEOMESA-3061 Converters - support bytes in Avro top-level union types (#2762))
=======
>>>>>>> 5f01e2c4fc (GEOMESA-3067 Find attribute in Filters with Functions with embedded expressions correctly)
>>>>>>> 67e4c1354f (GEOMESA-3061 Converters - support bytes in Avro top-level union types (#2762))
<<<<<<< HEAD
>>>>>>> 12e3a588fc (GEOMESA-3061 Converters - support bytes in Avro top-level union types (#2762))
<<<<<<< HEAD
>>>>>>> a52e4429be (GEOMESA-3061 Converters - support bytes in Avro top-level union types (#2762))
=======
=======
=======
=======
=======
=======
>>>>>>> 5c6b9f1f8b (GEOMESA-3061 Converters - support bytes in Avro top-level union types (#2762))
        Result.foreach(1 to 10) { j =>
>>>>>>> b9bdd406e (GEOMESA-3061 Converters - support bytes in Avro top-level union types (#2762))
=======
>>>>>>> f36b0e8b9 (GEOMESA-3067 Find attribute in Filters with Functions with embedded expressions correctly)
<<<<<<< HEAD
>>>>>>> e5ed68fdd (GEOMESA-3067 Find attribute in Filters with Functions with embedded expressions correctly)
<<<<<<< HEAD
>>>>>>> 060ac2189c (GEOMESA-3067 Find attribute in Filters with Functions with embedded expressions correctly)
<<<<<<< HEAD
>>>>>>> c8e013ff91 (GEOMESA-3067 Find attribute in Filters with Functions with embedded expressions correctly)
<<<<<<< HEAD
>>>>>>> 5f01e2c4fc (GEOMESA-3067 Find attribute in Filters with Functions with embedded expressions correctly)
=======
=======
=======
=======
=======
=======
        Result.foreach(1 to 10) { j =>
>>>>>>> b9bdd406e (GEOMESA-3061 Converters - support bytes in Avro top-level union types (#2762))
>>>>>>> cdb410251 (GEOMESA-3061 Converters - support bytes in Avro top-level union types (#2762))
>>>>>>> e6e1f4bdd (GEOMESA-3061 Converters - support bytes in Avro top-level union types (#2762))
<<<<<<< HEAD
>>>>>>> 8035cc5893 (GEOMESA-3061 Converters - support bytes in Avro top-level union types (#2762))
<<<<<<< HEAD
>>>>>>> 1890b11217 (GEOMESA-3061 Converters - support bytes in Avro top-level union types (#2762))
<<<<<<< HEAD
>>>>>>> 5c6b9f1f8b (GEOMESA-3061 Converters - support bytes in Avro top-level union types (#2762))
=======
=======
=======
=======
=======
>>>>>>> e3a63fee1 (GEOMESA-3067 Find attribute in Filters with Functions with embedded expressions correctly)
>>>>>>> 7f922b040 (GEOMESA-3067 Find attribute in Filters with Functions with embedded expressions correctly)
=======
>>>>>>> 9d44ff473d (GEOMESA-3061 Converters - support bytes in Avro top-level union types (#2762))
>>>>>>> 04f08c23c5 (GEOMESA-3067 Find attribute in Filters with Functions with embedded expressions correctly)
<<<<<<< HEAD
>>>>>>> 912169b5e9 (GEOMESA-3067 Find attribute in Filters with Functions with embedded expressions correctly)
<<<<<<< HEAD
>>>>>>> 511bd92a86 (GEOMESA-3067 Find attribute in Filters with Functions with embedded expressions correctly)
=======
=======
=======
=======
>>>>>>> a910ae135 (GEOMESA-3061 Converters - support bytes in Avro top-level union types (#2762))
=======
>>>>>>> bff2bdde04 (GEOMESA-3067 Find attribute in Filters with Functions with embedded expressions correctly)
>>>>>>> 07161eaaa6 (GEOMESA-3061 Converters - support bytes in Avro top-level union types (#2762))
<<<<<<< HEAD
>>>>>>> 9c28193a91 (GEOMESA-3061 Converters - support bytes in Avro top-level union types (#2762))
<<<<<<< HEAD
>>>>>>> 9d44ff473d (GEOMESA-3061 Converters - support bytes in Avro top-level union types (#2762))
=======
=======
=======
=======
=======
>>>>>>> a63cb7e74 (GEOMESA-3067 Find attribute in Filters with Functions with embedded expressions correctly)
>>>>>>> 8fb060734 (GEOMESA-3067 Find attribute in Filters with Functions with embedded expressions correctly)
=======
>>>>>>> a35efac12e (GEOMESA-3061 Converters - support bytes in Avro top-level union types (#2762))
>>>>>>> 38b3282770 (GEOMESA-3067 Find attribute in Filters with Functions with embedded expressions correctly)
<<<<<<< HEAD
>>>>>>> 1b60c2aeba (GEOMESA-3067 Find attribute in Filters with Functions with embedded expressions correctly)
<<<<<<< HEAD
>>>>>>> bff2bdde04 (GEOMESA-3067 Find attribute in Filters with Functions with embedded expressions correctly)
=======
=======
=======
=======
>>>>>>> ad3cedc4d (GEOMESA-3061 Converters - support bytes in Avro top-level union types (#2762))
=======
>>>>>>> 323528580f (GEOMESA-3067 Find attribute in Filters with Functions with embedded expressions correctly)
>>>>>>> 9abc630fdf (GEOMESA-3061 Converters - support bytes in Avro top-level union types (#2762))
<<<<<<< HEAD
>>>>>>> d294ce49e2 (GEOMESA-3061 Converters - support bytes in Avro top-level union types (#2762))
<<<<<<< HEAD
>>>>>>> a35efac12e (GEOMESA-3061 Converters - support bytes in Avro top-level union types (#2762))
=======
=======
=======
=======
=======
>>>>>>> 908ad4071 (GEOMESA-3067 Find attribute in Filters with Functions with embedded expressions correctly)
>>>>>>> bc4913194 (GEOMESA-3067 Find attribute in Filters with Functions with embedded expressions correctly)
=======
>>>>>>> fd5565dfba (GEOMESA-3061 Converters - support bytes in Avro top-level union types (#2762))
>>>>>>> 570899511d (GEOMESA-3067 Find attribute in Filters with Functions with embedded expressions correctly)
<<<<<<< HEAD
>>>>>>> ed45e8551f (GEOMESA-3067 Find attribute in Filters with Functions with embedded expressions correctly)
<<<<<<< HEAD
>>>>>>> 323528580f (GEOMESA-3067 Find attribute in Filters with Functions with embedded expressions correctly)
=======
=======
=======
=======
>>>>>>> bdbced26d (GEOMESA-3061 Converters - support bytes in Avro top-level union types (#2762))
=======
>>>>>>> 30559ea5c9 (Merge branch 'feature/postgis-fixes')
>>>>>>> 25063957fc (GEOMESA-3061 Converters - support bytes in Avro top-level union types (#2762))
<<<<<<< HEAD
>>>>>>> 1df8328338 (GEOMESA-3061 Converters - support bytes in Avro top-level union types (#2762))
<<<<<<< HEAD
>>>>>>> fd5565dfba (GEOMESA-3061 Converters - support bytes in Avro top-level union types (#2762))
=======
=======
=======
=======
=======
        Result.foreach(1 to 10) { j =>
>>>>>>> 3be8d2a5a (Merge branch 'feature/postgis-fixes')
>>>>>>> 1b25d7ddb (Merge branch 'feature/postgis-fixes')
>>>>>>> 699117eca9 (Merge branch 'feature/postgis-fixes')
>>>>>>> c69897d7bd (Merge branch 'feature/postgis-fixes')
>>>>>>> 30559ea5c9 (Merge branch 'feature/postgis-fixes')
=======
>>>>>>> 78fe4921a6 (GEOMESA-3067 Find attribute in Filters with Functions with embedded expressions correctly)
=======
>>>>>>> 0104fb37e4 (GEOMESA-3061 Converters - support bytes in Avro top-level union types (#2762))
=======
>>>>>>> 530b057384 (GEOMESA-3067 Find attribute in Filters with Functions with embedded expressions correctly)
=======
=======
>>>>>>> c3c5dd0ebb (GEOMESA-3061 Converters - support bytes in Avro top-level union types (#2762))
>>>>>>> 2654d9c120 (GEOMESA-3061 Converters - support bytes in Avro top-level union types (#2762))
=======
>>>>>>> de7d6ef448 (GEOMESA-3067 Find attribute in Filters with Functions with embedded expressions correctly)
=======
=======
>>>>>>> 4c361f07da (GEOMESA-3061 Converters - support bytes in Avro top-level union types (#2762))
>>>>>>> f110463a26 (GEOMESA-3061 Converters - support bytes in Avro top-level union types (#2762))
=======
>>>>>>> d83561962d (GEOMESA-3067 Find attribute in Filters with Functions with embedded expressions correctly)
=======
>>>>>>> 86ec77f9cb (GEOMESA-3061 Converters - support bytes in Avro top-level union types (#2762))
=======
>>>>>>> 17883cb601 (GEOMESA-3067 Find attribute in Filters with Functions with embedded expressions correctly)
=======
=======
>>>>>>> a788dfac03 (GEOMESA-3061 Converters - support bytes in Avro top-level union types (#2762))
>>>>>>> 1bcc513539 (GEOMESA-3061 Converters - support bytes in Avro top-level union types (#2762))
=======
>>>>>>> ec6d06b576 (Merge branch 'feature/postgis-fixes')
=======
>>>>>>> 724c808fa8 (GEOMESA-3067 Find attribute in Filters with Functions with embedded expressions correctly)
=======
=======
        Result.foreach(1 to 10) { j =>
>>>>>>> b9bdd406e3 (GEOMESA-3061 Converters - support bytes in Avro top-level union types (#2762))
>>>>>>> 3d5144418e (GEOMESA-3061 Converters - support bytes in Avro top-level union types (#2762))
=======
>>>>>>> f36b0e8b9a (GEOMESA-3067 Find attribute in Filters with Functions with embedded expressions correctly)
>>>>>>> efb6723f42 (GEOMESA-3067 Find attribute in Filters with Functions with embedded expressions correctly)
=======
>>>>>>> 7bdbfa5524 (GEOMESA-3061 Converters - support bytes in Avro top-level union types (#2762))
=======
>>>>>>> 17b189175b (GEOMESA-3067 Find attribute in Filters with Functions with embedded expressions correctly)
=======
>>>>>>> 7bff4d0018 (GEOMESA-3061 Converters - support bytes in Avro top-level union types (#2762))
=======
>>>>>>> a63cb7e740 (GEOMESA-3067 Find attribute in Filters with Functions with embedded expressions correctly)
>>>>>>> 657a38673a (GEOMESA-3067 Find attribute in Filters with Functions with embedded expressions correctly)
=======
=======
>>>>>>> a5b160f47b (GEOMESA-3061 Converters - support bytes in Avro top-level union types (#2762))
=======
>>>>>>> def2794bb5 (GEOMESA-3067 Find attribute in Filters with Functions with embedded expressions correctly)
=======
>>>>>>> 94fecee1d8 (GEOMESA-3061 Converters - support bytes in Avro top-level union types (#2762))
>>>>>>> a63cb7e740 (GEOMESA-3067 Find attribute in Filters with Functions with embedded expressions correctly)
=======
=======
>>>>>>> 9d708b240a (GEOMESA-3061 Converters - support bytes in Avro top-level union types (#2762))
=======
>>>>>>> c3b0a1b6e3 (GEOMESA-3067 Find attribute in Filters with Functions with embedded expressions correctly)
=======
=======
>>>>>>> 67b361c85 (GEOMESA-3061 Converters - support bytes in Avro top-level union types (#2762))
>>>>>>> c8a325e13c (GEOMESA-3061 Converters - support bytes in Avro top-level union types (#2762))
=======
=======
        Result.foreach(1 to 10) { j =>
>>>>>>> b9bdd406e (GEOMESA-3061 Converters - support bytes in Avro top-level union types (#2762))
>>>>>>> cdb410251 (GEOMESA-3061 Converters - support bytes in Avro top-level union types (#2762))
<<<<<<< HEAD
<<<<<<< HEAD
<<<<<<< HEAD
>>>>>>> 67b361c856 (GEOMESA-3061 Converters - support bytes in Avro top-level union types (#2762))
<<<<<<< HEAD
>>>>>>> e8b736ee96 (GEOMESA-3061 Converters - support bytes in Avro top-level union types (#2762))
=======
=======
        Result.foreach(1 to 10) { j =>
=======
        Result.foreach(1 to 10){ j =>
>>>>>>> 7acc3ea46 (GEOMESA-3067 Find attribute in Filters with Functions with embedded expressions correctly)
>>>>>>> 908ad4071d (GEOMESA-3067 Find attribute in Filters with Functions with embedded expressions correctly)
<<<<<<< HEAD
>>>>>>> e31a4215c4 (GEOMESA-3067 Find attribute in Filters with Functions with embedded expressions correctly)
=======
=======
=======
        Result.foreach(1 to 10) { j =>
>>>>>>> b9bdd406e (GEOMESA-3061 Converters - support bytes in Avro top-level union types (#2762))
>>>>>>> b4320946b4 (GEOMESA-3061 Converters - support bytes in Avro top-level union types (#2762))
<<<<<<< HEAD
>>>>>>> 0efbfe547e (GEOMESA-3061 Converters - support bytes in Avro top-level union types (#2762))
=======
=======
        Result.foreach(1 to 10) { j =>
>>>>>>> 3be8d2a5a4 (Merge branch 'feature/postgis-fixes')
<<<<<<< HEAD
>>>>>>> 4c41429da9 (Merge branch 'feature/postgis-fixes')
=======
=======
        Result.foreach(1 to 10) { j =>
=======
        Result.foreach(1 to 10){ j =>
>>>>>>> 7acc3ea46 (GEOMESA-3067 Find attribute in Filters with Functions with embedded expressions correctly)
>>>>>>> 907fb0b08a (GEOMESA-3067 Find attribute in Filters with Functions with embedded expressions correctly)
<<<<<<< HEAD
>>>>>>> ca13f8551e (GEOMESA-3067 Find attribute in Filters with Functions with embedded expressions correctly)
=======
=======
=======
        Result.foreach(1 to 10) { j =>
>>>>>>> b9bdd406e (GEOMESA-3061 Converters - support bytes in Avro top-level union types (#2762))
>>>>>>> d9ed077cd1 (GEOMESA-3061 Converters - support bytes in Avro top-level union types (#2762))
<<<<<<< HEAD
>>>>>>> d498bef1ce (GEOMESA-3061 Converters - support bytes in Avro top-level union types (#2762))
=======
=======
=======
        Result.foreach(1 to 10) { j =>
>>>>>>> b9bdd406e (GEOMESA-3061 Converters - support bytes in Avro top-level union types (#2762))
=======
>>>>>>> f36b0e8b9 (GEOMESA-3067 Find attribute in Filters with Functions with embedded expressions correctly)
>>>>>>> e182e6e99c (GEOMESA-3067 Find attribute in Filters with Functions with embedded expressions correctly)
<<<<<<< HEAD
>>>>>>> cd4422a10c (GEOMESA-3067 Find attribute in Filters with Functions with embedded expressions correctly)
=======
=======
>>>>>>> 9d708b240a (GEOMESA-3061 Converters - support bytes in Avro top-level union types (#2762))
<<<<<<< HEAD
>>>>>>> a5b160f47b (GEOMESA-3061 Converters - support bytes in Avro top-level union types (#2762))
=======
=======
=======
>>>>>>> c8a325e13c (GEOMESA-3061 Converters - support bytes in Avro top-level union types (#2762))
=======
>>>>>>> e3a63fee1 (GEOMESA-3067 Find attribute in Filters with Functions with embedded expressions correctly)
<<<<<<< HEAD
>>>>>>> 3333975e77 (GEOMESA-3067 Find attribute in Filters with Functions with embedded expressions correctly)
<<<<<<< HEAD
>>>>>>> fa429c7863 (GEOMESA-3067 Find attribute in Filters with Functions with embedded expressions correctly)
=======
=======
=======
=======
        Result.foreach(1 to 10) { j =>
>>>>>>> b9bdd406e (GEOMESA-3061 Converters - support bytes in Avro top-level union types (#2762))
>>>>>>> 0e68e9f4c (GEOMESA-3061 Converters - support bytes in Avro top-level union types (#2762))
<<<<<<< HEAD
>>>>>>> 76618c8da3 (GEOMESA-3061 Converters - support bytes in Avro top-level union types (#2762))
<<<<<<< HEAD
>>>>>>> 5cf31d21f3 (GEOMESA-3061 Converters - support bytes in Avro top-level union types (#2762))
=======
=======
=======
>>>>>>> a63cb7e74 (GEOMESA-3067 Find attribute in Filters with Functions with embedded expressions correctly)
<<<<<<< HEAD
>>>>>>> c3b0a1b6e3 (GEOMESA-3067 Find attribute in Filters with Functions with embedded expressions correctly)
<<<<<<< HEAD
>>>>>>> def2794bb5 (GEOMESA-3067 Find attribute in Filters with Functions with embedded expressions correctly)
=======
=======
=======
>>>>>>> 67b361c85 (GEOMESA-3061 Converters - support bytes in Avro top-level union types (#2762))
<<<<<<< HEAD
>>>>>>> c8a325e13c (GEOMESA-3061 Converters - support bytes in Avro top-level union types (#2762))
<<<<<<< HEAD
>>>>>>> 94fecee1d8 (GEOMESA-3061 Converters - support bytes in Avro top-level union types (#2762))
=======
=======
=======
>>>>>>> 908ad4071 (GEOMESA-3067 Find attribute in Filters with Functions with embedded expressions correctly)
<<<<<<< HEAD
>>>>>>> 9638dc731e (GEOMESA-3067 Find attribute in Filters with Functions with embedded expressions correctly)
<<<<<<< HEAD
>>>>>>> f8d3d445c0 (GEOMESA-3067 Find attribute in Filters with Functions with embedded expressions correctly)
=======
=======
=======
=======
        Result.foreach(1 to 10) { j =>
>>>>>>> b9bdd406e (GEOMESA-3061 Converters - support bytes in Avro top-level union types (#2762))
>>>>>>> b4320946b (GEOMESA-3061 Converters - support bytes in Avro top-level union types (#2762))
<<<<<<< HEAD
>>>>>>> 97ec7d864a (GEOMESA-3061 Converters - support bytes in Avro top-level union types (#2762))
<<<<<<< HEAD
>>>>>>> 4599715c51 (d)
=======
=======
=======
        Result.foreach(1 to 10) { j =>
>>>>>>> 3be8d2a5a (Merge branch 'feature/postgis-fixes')
>>>>>>> db8d998aa2 (Merge branch 'feature/postgis-fixes')
>>>>>>> 6e0709aba8 (Merge branch 'feature/postgis-fixes')
=======
=======
        Result.foreach(1 to 10) { j =>
>>>>>>> d845d7c1bd (GEOMESA-3254 Add Bloop build support)
>>>>>>> 7a84c9d22d (GEOMESA-3254 Add Bloop build support)
=======
>>>>>>> bad8172e9b (GEOMESA-3067 Find attribute in Filters with Functions with embedded expressions correctly)
=======
>>>>>>> 7fbbd56493 (GEOMESA-3061 Converters - support bytes in Avro top-level union types (#2762))
=======
>>>>>>> e582c3ecfe (GEOMESA-3067 Find attribute in Filters with Functions with embedded expressions correctly)
=======
>>>>>>> 3eb12f79a9 (GEOMESA-3061 Converters - support bytes in Avro top-level union types (#2762))
=======
>>>>>>> 8b16ac5c65 (GEOMESA-3067 Find attribute in Filters with Functions with embedded expressions correctly)
=======
=======
>>>>>>> a910ae135f (GEOMESA-3061 Converters - support bytes in Avro top-level union types (#2762))
>>>>>>> 4ccd6f6b1f (GEOMESA-3061 Converters - support bytes in Avro top-level union types (#2762))
=======
>>>>>>> f983ea29f0 (GEOMESA-3067 Find attribute in Filters with Functions with embedded expressions correctly)
=======
>>>>>>> 35b69b8f2f (GEOMESA-3061 Converters - support bytes in Avro top-level union types (#2762))
=======
>>>>>>> da4e2905b4 (GEOMESA-3067 Find attribute in Filters with Functions with embedded expressions correctly)
=======
=======
>>>>>>> bdbced26d4 (GEOMESA-3061 Converters - support bytes in Avro top-level union types (#2762))
>>>>>>> db8a3a22b2 (GEOMESA-3061 Converters - support bytes in Avro top-level union types (#2762))
=======
>>>>>>> ed25decdd5 (Merge branch 'feature/postgis-fixes')
=======
=======
>>>>>>> 87bf55340 (GEOMESA-3061 Converters - support bytes in Avro top-level union types (#2762))
<<<<<<< HEAD
>>>>>>> 0dbede148d (GEOMESA-3061 Converters - support bytes in Avro top-level union types (#2762))
<<<<<<< HEAD
>>>>>>> 27afb28ab6 (GEOMESA-3061 Converters - support bytes in Avro top-level union types (#2762))
=======
=======
=======
>>>>>>> 240977229 (GEOMESA-3061 Converters - support bytes in Avro top-level union types (#2762))
>>>>>>> 22dcc8170f (GEOMESA-3061 Converters - support bytes in Avro top-level union types (#2762))
>>>>>>> 26a09ee6c2 (GEOMESA-3061 Converters - support bytes in Avro top-level union types (#2762))
=======
>>>>>>> b009fd23f4 (GEOMESA-3061 Converters - support bytes in Avro top-level union types (#2762))
>>>>>>> 194ad4e5c0 (GEOMESA-3061 Converters - support bytes in Avro top-level union types (#2762))
=======
>>>>>>> 238945d4b3 (GEOMESA-3061 Converters - support bytes in Avro top-level union types (#2762))
>>>>>>> 7b3c90c53f (GEOMESA-3061 Converters - support bytes in Avro top-level union types (#2762))
=======
>>>>>>> bc4062951d (GEOMESA-3061 Converters - support bytes in Avro top-level union types (#2762))
>>>>>>> db9dfb6f14 (GEOMESA-3061 Converters - support bytes in Avro top-level union types (#2762))
=======
>>>>>>> e944f1c88b (Merge branch 'feature/postgis-fixes')
>>>>>>> f893d9a594 (Merge branch 'feature/postgis-fixes')
=======
=======
>>>>>>> b8ebbf6083 (GEOMESA-3061 Converters - support bytes in Avro top-level union types (#2762))
>>>>>>> 8a3e82747d (GEOMESA-3067 Find attribute in Filters with Functions with embedded expressions correctly)
<<<<<<< HEAD
>>>>>>> deb8fd68de (GEOMESA-3067 Find attribute in Filters with Functions with embedded expressions correctly)
<<<<<<< HEAD
>>>>>>> f33d55e2ba (GEOMESA-3067 Find attribute in Filters with Functions with embedded expressions correctly)
=======
=======
=======
=======
=======
        Result.foreach(1 to 10) { j =>
>>>>>>> b9bdd406e (GEOMESA-3061 Converters - support bytes in Avro top-level union types (#2762))
>>>>>>> d9ed077cd (GEOMESA-3061 Converters - support bytes in Avro top-level union types (#2762))
=======
>>>>>>> 1278241911 (GEOMESA-3067 Find attribute in Filters with Functions with embedded expressions correctly)
>>>>>>> 81ee66102b (GEOMESA-3061 Converters - support bytes in Avro top-level union types (#2762))
<<<<<<< HEAD
>>>>>>> 8adfab65bb (GEOMESA-3061 Converters - support bytes in Avro top-level union types (#2762))
<<<<<<< HEAD
>>>>>>> b8ebbf6083 (GEOMESA-3061 Converters - support bytes in Avro top-level union types (#2762))
=======
=======
=======
=======
>>>>>>> e182e6e99 (GEOMESA-3067 Find attribute in Filters with Functions with embedded expressions correctly)
=======
>>>>>>> 3e7fb62639 (GEOMESA-3061 Converters - support bytes in Avro top-level union types (#2762))
>>>>>>> 9943e05ec9 (GEOMESA-3067 Find attribute in Filters with Functions with embedded expressions correctly)
<<<<<<< HEAD
>>>>>>> 3254b186da (GEOMESA-3067 Find attribute in Filters with Functions with embedded expressions correctly)
<<<<<<< HEAD
>>>>>>> 1278241911 (GEOMESA-3067 Find attribute in Filters with Functions with embedded expressions correctly)
=======
=======
=======
=======
>>>>>>> 9d708b240 (GEOMESA-3061 Converters - support bytes in Avro top-level union types (#2762))
=======
>>>>>>> 00d66ae013 (GEOMESA-3067 Find attribute in Filters with Functions with embedded expressions correctly)
>>>>>>> 53a3e72cbf (GEOMESA-3061 Converters - support bytes in Avro top-level union types (#2762))
<<<<<<< HEAD
>>>>>>> 7b0539b808 (GEOMESA-3061 Converters - support bytes in Avro top-level union types (#2762))
<<<<<<< HEAD
>>>>>>> 3e7fb62639 (GEOMESA-3061 Converters - support bytes in Avro top-level union types (#2762))
=======
=======
=======
=======
=======
>>>>>>> e3a63fee1 (GEOMESA-3067 Find attribute in Filters with Functions with embedded expressions correctly)
>>>>>>> 3333975e7 (GEOMESA-3067 Find attribute in Filters with Functions with embedded expressions correctly)
=======
>>>>>>> c2cfc968d2 (GEOMESA-3061 Converters - support bytes in Avro top-level union types (#2762))
>>>>>>> d15af7157e (GEOMESA-3067 Find attribute in Filters with Functions with embedded expressions correctly)
<<<<<<< HEAD
>>>>>>> 982031ef44 (GEOMESA-3067 Find attribute in Filters with Functions with embedded expressions correctly)
<<<<<<< HEAD
>>>>>>> 00d66ae013 (GEOMESA-3067 Find attribute in Filters with Functions with embedded expressions correctly)
=======
=======
=======
=======
>>>>>>> 76618c8da (GEOMESA-3061 Converters - support bytes in Avro top-level union types (#2762))
=======
>>>>>>> 5d8dab9f81 (GEOMESA-3067 Find attribute in Filters with Functions with embedded expressions correctly)
>>>>>>> 947761ec9b (GEOMESA-3061 Converters - support bytes in Avro top-level union types (#2762))
<<<<<<< HEAD
>>>>>>> 0086b292ba (GEOMESA-3061 Converters - support bytes in Avro top-level union types (#2762))
<<<<<<< HEAD
>>>>>>> c2cfc968d2 (GEOMESA-3061 Converters - support bytes in Avro top-level union types (#2762))
=======
=======
=======
=======
=======
>>>>>>> a63cb7e74 (GEOMESA-3067 Find attribute in Filters with Functions with embedded expressions correctly)
>>>>>>> c3b0a1b6e (GEOMESA-3067 Find attribute in Filters with Functions with embedded expressions correctly)
=======
>>>>>>> 0fa73844a1 (GEOMESA-3061 Converters - support bytes in Avro top-level union types (#2762))
>>>>>>> 9813375fcc (GEOMESA-3067 Find attribute in Filters with Functions with embedded expressions correctly)
<<<<<<< HEAD
>>>>>>> cf57a2c189 (GEOMESA-3067 Find attribute in Filters with Functions with embedded expressions correctly)
<<<<<<< HEAD
>>>>>>> 5d8dab9f81 (GEOMESA-3067 Find attribute in Filters with Functions with embedded expressions correctly)
=======
=======
=======
=======
>>>>>>> c8a325e13 (GEOMESA-3061 Converters - support bytes in Avro top-level union types (#2762))
=======
>>>>>>> 1ef95979ee (GEOMESA-3067 Find attribute in Filters with Functions with embedded expressions correctly)
>>>>>>> c9328eddce (GEOMESA-3061 Converters - support bytes in Avro top-level union types (#2762))
<<<<<<< HEAD
>>>>>>> e15d50d7d3 (GEOMESA-3061 Converters - support bytes in Avro top-level union types (#2762))
<<<<<<< HEAD
>>>>>>> 0fa73844a1 (GEOMESA-3061 Converters - support bytes in Avro top-level union types (#2762))
=======
=======
=======
=======
=======
>>>>>>> 908ad4071 (GEOMESA-3067 Find attribute in Filters with Functions with embedded expressions correctly)
>>>>>>> 9638dc731 (GEOMESA-3067 Find attribute in Filters with Functions with embedded expressions correctly)
=======
>>>>>>> 63546aacdc (GEOMESA-3061 Converters - support bytes in Avro top-level union types (#2762))
>>>>>>> d2eec4be68 (GEOMESA-3067 Find attribute in Filters with Functions with embedded expressions correctly)
<<<<<<< HEAD
>>>>>>> bec3ba7d08 (GEOMESA-3067 Find attribute in Filters with Functions with embedded expressions correctly)
<<<<<<< HEAD
>>>>>>> 1ef95979ee (GEOMESA-3067 Find attribute in Filters with Functions with embedded expressions correctly)
=======
=======
=======
=======
>>>>>>> 97ec7d864 (GEOMESA-3061 Converters - support bytes in Avro top-level union types (#2762))
=======
>>>>>>> 964e86145a (Merge branch 'feature/postgis-fixes')
>>>>>>> d94c03a98e (GEOMESA-3061 Converters - support bytes in Avro top-level union types (#2762))
<<<<<<< HEAD
>>>>>>> 8de43cccf6 (GEOMESA-3061 Converters - support bytes in Avro top-level union types (#2762))
<<<<<<< HEAD
>>>>>>> 63546aacdc (GEOMESA-3061 Converters - support bytes in Avro top-level union types (#2762))
=======
=======
=======
=======
=======
        Result.foreach(1 to 10) { j =>
>>>>>>> 3be8d2a5a (Merge branch 'feature/postgis-fixes')
>>>>>>> db8d998aa (Merge branch 'feature/postgis-fixes')
=======
>>>>>>> b298e017f1 (GEOMESA-3254 Add Bloop build support)
>>>>>>> cb6bda89b6 (Merge branch 'feature/postgis-fixes')
<<<<<<< HEAD
>>>>>>> 26e5afc4ea (Merge branch 'feature/postgis-fixes')
<<<<<<< HEAD
>>>>>>> 964e86145a (Merge branch 'feature/postgis-fixes')
=======
=======
=======
=======
        Result.foreach(1 to 10) { j =>
>>>>>>> d845d7c1b (GEOMESA-3254 Add Bloop build support)
=======
>>>>>>> 72b96c5c3e (GEOMESA-3067 Find attribute in Filters with Functions with embedded expressions correctly)
>>>>>>> 09d87762c5 (GEOMESA-3254 Add Bloop build support)
<<<<<<< HEAD
>>>>>>> 63a045a753 (GEOMESA-3254 Add Bloop build support)
<<<<<<< HEAD
>>>>>>> b298e017f1 (GEOMESA-3254 Add Bloop build support)
=======
=======
=======
=======
>>>>>>> 7bb5f26c3 (GEOMESA-3067 Find attribute in Filters with Functions with embedded expressions correctly)
=======
>>>>>>> 1ea8b10ac7 (GEOMESA-3061 Converters - support bytes in Avro top-level union types (#2762))
>>>>>>> e69b2aa6dc (GEOMESA-3067 Find attribute in Filters with Functions with embedded expressions correctly)
<<<<<<< HEAD
>>>>>>> b1a7408547 (GEOMESA-3067 Find attribute in Filters with Functions with embedded expressions correctly)
<<<<<<< HEAD
>>>>>>> 72b96c5c3e (GEOMESA-3067 Find attribute in Filters with Functions with embedded expressions correctly)
=======
=======
=======
=======
=======
        Result.foreach(1 to 10) { j =>
>>>>>>> b9bdd406e (GEOMESA-3061 Converters - support bytes in Avro top-level union types (#2762))
>>>>>>> 6d9a5b626 (GEOMESA-3061 Converters - support bytes in Avro top-level union types (#2762))
=======
>>>>>>> e72b998c12 (GEOMESA-3067 Find attribute in Filters with Functions with embedded expressions correctly)
>>>>>>> 67e4c1354f (GEOMESA-3061 Converters - support bytes in Avro top-level union types (#2762))
<<<<<<< HEAD
>>>>>>> 12e3a588fc (GEOMESA-3061 Converters - support bytes in Avro top-level union types (#2762))
<<<<<<< HEAD
>>>>>>> 1ea8b10ac7 (GEOMESA-3061 Converters - support bytes in Avro top-level union types (#2762))
=======
=======
=======
=======
=======
=======
>>>>>>> b800c052cc (GEOMESA-3061 Converters - support bytes in Avro top-level union types (#2762))
        Result.foreach(1 to 10) { j =>
>>>>>>> b9bdd406e (GEOMESA-3061 Converters - support bytes in Avro top-level union types (#2762))
=======
>>>>>>> f36b0e8b9 (GEOMESA-3067 Find attribute in Filters with Functions with embedded expressions correctly)
<<<<<<< HEAD
>>>>>>> e5ed68fdd (GEOMESA-3067 Find attribute in Filters with Functions with embedded expressions correctly)
<<<<<<< HEAD
>>>>>>> 060ac2189c (GEOMESA-3067 Find attribute in Filters with Functions with embedded expressions correctly)
<<<<<<< HEAD
>>>>>>> c8e013ff91 (GEOMESA-3067 Find attribute in Filters with Functions with embedded expressions correctly)
<<<<<<< HEAD
>>>>>>> e72b998c12 (GEOMESA-3067 Find attribute in Filters with Functions with embedded expressions correctly)
=======
=======
=======
=======
=======
=======
        Result.foreach(1 to 10) { j =>
>>>>>>> b9bdd406e (GEOMESA-3061 Converters - support bytes in Avro top-level union types (#2762))
>>>>>>> cdb410251 (GEOMESA-3061 Converters - support bytes in Avro top-level union types (#2762))
>>>>>>> e6e1f4bdd (GEOMESA-3061 Converters - support bytes in Avro top-level union types (#2762))
<<<<<<< HEAD
>>>>>>> 8035cc5893 (GEOMESA-3061 Converters - support bytes in Avro top-level union types (#2762))
<<<<<<< HEAD
>>>>>>> 1890b11217 (GEOMESA-3061 Converters - support bytes in Avro top-level union types (#2762))
<<<<<<< HEAD
>>>>>>> b800c052cc (GEOMESA-3061 Converters - support bytes in Avro top-level union types (#2762))
=======
=======
=======
=======
=======
>>>>>>> e3a63fee1 (GEOMESA-3067 Find attribute in Filters with Functions with embedded expressions correctly)
>>>>>>> 7f922b040 (GEOMESA-3067 Find attribute in Filters with Functions with embedded expressions correctly)
=======
>>>>>>> 9dbe1503e8 (GEOMESA-3061 Converters - support bytes in Avro top-level union types (#2762))
>>>>>>> 04f08c23c5 (GEOMESA-3067 Find attribute in Filters with Functions with embedded expressions correctly)
<<<<<<< HEAD
>>>>>>> 912169b5e9 (GEOMESA-3067 Find attribute in Filters with Functions with embedded expressions correctly)
<<<<<<< HEAD
>>>>>>> 8e70a881a6 (GEOMESA-3067 Find attribute in Filters with Functions with embedded expressions correctly)
=======
=======
=======
=======
>>>>>>> a910ae135 (GEOMESA-3061 Converters - support bytes in Avro top-level union types (#2762))
=======
>>>>>>> 53bc726472 (GEOMESA-3067 Find attribute in Filters with Functions with embedded expressions correctly)
>>>>>>> 07161eaaa6 (GEOMESA-3061 Converters - support bytes in Avro top-level union types (#2762))
<<<<<<< HEAD
>>>>>>> 9c28193a91 (GEOMESA-3061 Converters - support bytes in Avro top-level union types (#2762))
<<<<<<< HEAD
>>>>>>> 9dbe1503e8 (GEOMESA-3061 Converters - support bytes in Avro top-level union types (#2762))
=======
=======
=======
=======
=======
>>>>>>> a63cb7e74 (GEOMESA-3067 Find attribute in Filters with Functions with embedded expressions correctly)
>>>>>>> 8fb060734 (GEOMESA-3067 Find attribute in Filters with Functions with embedded expressions correctly)
=======
>>>>>>> 6e30236dd2 (GEOMESA-3061 Converters - support bytes in Avro top-level union types (#2762))
>>>>>>> 38b3282770 (GEOMESA-3067 Find attribute in Filters with Functions with embedded expressions correctly)
<<<<<<< HEAD
>>>>>>> 1b60c2aeba (GEOMESA-3067 Find attribute in Filters with Functions with embedded expressions correctly)
<<<<<<< HEAD
>>>>>>> 53bc726472 (GEOMESA-3067 Find attribute in Filters with Functions with embedded expressions correctly)
=======
=======
=======
=======
>>>>>>> ad3cedc4d (GEOMESA-3061 Converters - support bytes in Avro top-level union types (#2762))
=======
>>>>>>> 3261561062 (GEOMESA-3067 Find attribute in Filters with Functions with embedded expressions correctly)
>>>>>>> 9abc630fdf (GEOMESA-3061 Converters - support bytes in Avro top-level union types (#2762))
<<<<<<< HEAD
>>>>>>> d294ce49e2 (GEOMESA-3061 Converters - support bytes in Avro top-level union types (#2762))
<<<<<<< HEAD
>>>>>>> 6e30236dd2 (GEOMESA-3061 Converters - support bytes in Avro top-level union types (#2762))
=======
=======
=======
=======
=======
>>>>>>> 908ad4071 (GEOMESA-3067 Find attribute in Filters with Functions with embedded expressions correctly)
>>>>>>> bc4913194 (GEOMESA-3067 Find attribute in Filters with Functions with embedded expressions correctly)
=======
>>>>>>> dbd932fed6 (GEOMESA-3061 Converters - support bytes in Avro top-level union types (#2762))
>>>>>>> 570899511d (GEOMESA-3067 Find attribute in Filters with Functions with embedded expressions correctly)
<<<<<<< HEAD
>>>>>>> ed45e8551f (GEOMESA-3067 Find attribute in Filters with Functions with embedded expressions correctly)
<<<<<<< HEAD
>>>>>>> 3261561062 (GEOMESA-3067 Find attribute in Filters with Functions with embedded expressions correctly)
=======
=======
=======
=======
>>>>>>> bdbced26d (GEOMESA-3061 Converters - support bytes in Avro top-level union types (#2762))
=======
>>>>>>> bf6bde0830 (Merge branch 'feature/postgis-fixes')
>>>>>>> 25063957fc (GEOMESA-3061 Converters - support bytes in Avro top-level union types (#2762))
<<<<<<< HEAD
>>>>>>> 1df8328338 (GEOMESA-3061 Converters - support bytes in Avro top-level union types (#2762))
<<<<<<< HEAD
>>>>>>> dbd932fed6 (GEOMESA-3061 Converters - support bytes in Avro top-level union types (#2762))
=======
=======
=======
=======
=======
        Result.foreach(1 to 10) { j =>
>>>>>>> 3be8d2a5a (Merge branch 'feature/postgis-fixes')
>>>>>>> 1b25d7ddb (Merge branch 'feature/postgis-fixes')
>>>>>>> 699117eca9 (Merge branch 'feature/postgis-fixes')
>>>>>>> c69897d7bd (Merge branch 'feature/postgis-fixes')
>>>>>>> bf6bde0830 (Merge branch 'feature/postgis-fixes')
=======
>>>>>>> 5b9d5ada1b (GEOMESA-3067 Find attribute in Filters with Functions with embedded expressions correctly)
=======
>>>>>>> 9293965a7d (GEOMESA-3061 Converters - support bytes in Avro top-level union types (#2762))
=======
>>>>>>> 67dc71ffb1 (GEOMESA-3067 Find attribute in Filters with Functions with embedded expressions correctly)
=======
=======
>>>>>>> c3c5dd0ebb (GEOMESA-3061 Converters - support bytes in Avro top-level union types (#2762))
>>>>>>> 058fd96baa (GEOMESA-3061 Converters - support bytes in Avro top-level union types (#2762))
=======
>>>>>>> f7fc21ae20 (GEOMESA-3067 Find attribute in Filters with Functions with embedded expressions correctly)
=======
=======
>>>>>>> 4c361f07da (GEOMESA-3061 Converters - support bytes in Avro top-level union types (#2762))
>>>>>>> c22ecd64c3 (GEOMESA-3061 Converters - support bytes in Avro top-level union types (#2762))
=======
>>>>>>> 6e297b9b6f (GEOMESA-3067 Find attribute in Filters with Functions with embedded expressions correctly)
=======
>>>>>>> 2a887f75bf (GEOMESA-3061 Converters - support bytes in Avro top-level union types (#2762))
=======
>>>>>>> 08a743b61d (GEOMESA-3067 Find attribute in Filters with Functions with embedded expressions correctly)
=======
=======
>>>>>>> a788dfac03 (GEOMESA-3061 Converters - support bytes in Avro top-level union types (#2762))
>>>>>>> b08cb4d818 (GEOMESA-3061 Converters - support bytes in Avro top-level union types (#2762))
=======
>>>>>>> 354b5e5ae5 (Merge branch 'feature/postgis-fixes')
=======
=======
>>>>>>> 32d312dc48 (GEOMESA-3067 Find attribute in Filters with Functions with embedded expressions correctly)
>>>>>>> 043f2d0167 (GEOMESA-3067 Find attribute in Filters with Functions with embedded expressions correctly)
=======
>>>>>>> ac217b392d (GEOMESA-3061 Converters - support bytes in Avro top-level union types (#2762))
=======
=======
>>>>>>> f36b0e8b9a (GEOMESA-3067 Find attribute in Filters with Functions with embedded expressions correctly)
>>>>>>> a1d28116d4 (GEOMESA-3067 Find attribute in Filters with Functions with embedded expressions correctly)
>>>>>>> a6693cb0ba (GEOMESA-3067 Find attribute in Filters with Functions with embedded expressions correctly)
=======
>>>>>>> d1fa26b39d (GEOMESA-3061 Converters - support bytes in Avro top-level union types (#2762))
>>>>>>> e7d6b701c8 (GEOMESA-3061 Converters - support bytes in Avro top-level union types (#2762))
=======
>>>>>>> ef55408e9a (GEOMESA-3067 Find attribute in Filters with Functions with embedded expressions correctly)
>>>>>>> 70f2c62b7e (GEOMESA-3067 Find attribute in Filters with Functions with embedded expressions correctly)
=======
>>>>>>> e3a63fee18 (GEOMESA-3067 Find attribute in Filters with Functions with embedded expressions correctly)
<<<<<<< HEAD
>>>>>>> ef55408e9a (GEOMESA-3067 Find attribute in Filters with Functions with embedded expressions correctly)
=======
=======
=======
        Result.foreach(1 to 10) { j =>
>>>>>>> b9bdd406e (GEOMESA-3061 Converters - support bytes in Avro top-level union types (#2762))
>>>>>>> 0e68e9f4cc (GEOMESA-3061 Converters - support bytes in Avro top-level union types (#2762))
>>>>>>> f67dd3371e (GEOMESA-3061 Converters - support bytes in Avro top-level union types (#2762))
<<<<<<< HEAD
>>>>>>> 95e52e061e (GEOMESA-3061 Converters - support bytes in Avro top-level union types (#2762))
=======
=======
>>>>>>> a63cb7e740 (GEOMESA-3067 Find attribute in Filters with Functions with embedded expressions correctly)
>>>>>>> a9884ff1f6 (GEOMESA-3067 Find attribute in Filters with Functions with embedded expressions correctly)
<<<<<<< HEAD
>>>>>>> 424e7de15a (GEOMESA-3067 Find attribute in Filters with Functions with embedded expressions correctly)
=======
=======
>>>>>>> 67b361c856 (GEOMESA-3061 Converters - support bytes in Avro top-level union types (#2762))
<<<<<<< HEAD
>>>>>>> f7cef54062 (GEOMESA-3061 Converters - support bytes in Avro top-level union types (#2762))
<<<<<<< HEAD
>>>>>>> 988874c83e (GEOMESA-3061 Converters - support bytes in Avro top-level union types (#2762))
=======
=======
=======
        Result.foreach(1 to 10) { j =>
=======
        Result.foreach(1 to 10){ j =>
>>>>>>> 7acc3ea46 (GEOMESA-3067 Find attribute in Filters with Functions with embedded expressions correctly)
>>>>>>> 908ad4071d (GEOMESA-3067 Find attribute in Filters with Functions with embedded expressions correctly)
>>>>>>> 49f2a1c310 (GEOMESA-3067 Find attribute in Filters with Functions with embedded expressions correctly)
>>>>>>> 87dddefcd8 (GEOMESA-3067 Find attribute in Filters with Functions with embedded expressions correctly)
=======
>>>>>>> aea9fbe131 (GEOMESA-3061 Converters - support bytes in Avro top-level union types (#2762))
=======
>>>>>>> d581fa3e8f (Merge branch 'feature/postgis-fixes')
=======
=======
>>>>>>> 5430d59024 (GEOMESA-3067 Find attribute in Filters with Functions with embedded expressions correctly)
>>>>>>> ca1e0fad13 (GEOMESA-3067 Find attribute in Filters with Functions with embedded expressions correctly)
=======
>>>>>>> 5a55bf9756 (GEOMESA-3061 Converters - support bytes in Avro top-level union types (#2762))
=======
=======
>>>>>>> e182e6e99c (GEOMESA-3067 Find attribute in Filters with Functions with embedded expressions correctly)
<<<<<<< HEAD
>>>>>>> 2571e49519 (GEOMESA-3067 Find attribute in Filters with Functions with embedded expressions correctly)
<<<<<<< HEAD
>>>>>>> adfec3a47a (GEOMESA-3067 Find attribute in Filters with Functions with embedded expressions correctly)
=======
=======
=======
>>>>>>> 9d708b240a (GEOMESA-3061 Converters - support bytes in Avro top-level union types (#2762))
>>>>>>> d206a68a13 (GEOMESA-3061 Converters - support bytes in Avro top-level union types (#2762))
>>>>>>> e0c2527549 (GEOMESA-3061 Converters - support bytes in Avro top-level union types (#2762))
=======
>>>>>>> e3a63fee1 (GEOMESA-3067 Find attribute in Filters with Functions with embedded expressions correctly)
<<<<<<< HEAD
>>>>>>> 3333975e77 (GEOMESA-3067 Find attribute in Filters with Functions with embedded expressions correctly)
<<<<<<< HEAD
>>>>>>> 9412e85b59 (GEOMESA-3067 Find attribute in Filters with Functions with embedded expressions correctly)
<<<<<<< HEAD
>>>>>>> 4cf1d8d259 (GEOMESA-3067 Find attribute in Filters with Functions with embedded expressions correctly)
=======
=======
=======
=======
=======
        Result.foreach(1 to 10) { j =>
>>>>>>> b9bdd406e (GEOMESA-3061 Converters - support bytes in Avro top-level union types (#2762))
>>>>>>> 0e68e9f4c (GEOMESA-3061 Converters - support bytes in Avro top-level union types (#2762))
=======
>>>>>>> 9bcad1eb67 (GEOMESA-3067 Find attribute in Filters with Functions with embedded expressions correctly)
>>>>>>> 76618c8da3 (GEOMESA-3061 Converters - support bytes in Avro top-level union types (#2762))
<<<<<<< HEAD
>>>>>>> 694bcd3776 (GEOMESA-3061 Converters - support bytes in Avro top-level union types (#2762))
<<<<<<< HEAD
>>>>>>> cb5e2daf2b (GEOMESA-3061 Converters - support bytes in Avro top-level union types (#2762))
=======
=======
=======
=======
>>>>>>> a63cb7e74 (GEOMESA-3067 Find attribute in Filters with Functions with embedded expressions correctly)
=======
>>>>>>> 00e61f4b70 (GEOMESA-3061 Converters - support bytes in Avro top-level union types (#2762))
>>>>>>> c3b0a1b6e3 (GEOMESA-3067 Find attribute in Filters with Functions with embedded expressions correctly)
<<<<<<< HEAD
>>>>>>> 24c4df93a5 (GEOMESA-3067 Find attribute in Filters with Functions with embedded expressions correctly)
<<<<<<< HEAD
>>>>>>> 9bcad1eb67 (GEOMESA-3067 Find attribute in Filters with Functions with embedded expressions correctly)
=======
=======
=======
=======
>>>>>>> 67b361c85 (GEOMESA-3061 Converters - support bytes in Avro top-level union types (#2762))
=======
>>>>>>> 9a4568fbda (GEOMESA-3067 Find attribute in Filters with Functions with embedded expressions correctly)
>>>>>>> c8a325e13c (GEOMESA-3061 Converters - support bytes in Avro top-level union types (#2762))
<<<<<<< HEAD
>>>>>>> 6cd1151639 (GEOMESA-3061 Converters - support bytes in Avro top-level union types (#2762))
<<<<<<< HEAD
>>>>>>> 00e61f4b70 (GEOMESA-3061 Converters - support bytes in Avro top-level union types (#2762))
=======
=======
=======
=======
>>>>>>> 908ad4071 (GEOMESA-3067 Find attribute in Filters with Functions with embedded expressions correctly)
=======
>>>>>>> 4864cfc581 (GEOMESA-3061 Converters - support bytes in Avro top-level union types (#2762))
>>>>>>> 9638dc731e (GEOMESA-3067 Find attribute in Filters with Functions with embedded expressions correctly)
<<<<<<< HEAD
>>>>>>> 1e00950a90 (GEOMESA-3067 Find attribute in Filters with Functions with embedded expressions correctly)
<<<<<<< HEAD
>>>>>>> 9a4568fbda (GEOMESA-3067 Find attribute in Filters with Functions with embedded expressions correctly)
=======
=======
=======
=======
=======
        Result.foreach(1 to 10) { j =>
>>>>>>> b9bdd406e (GEOMESA-3061 Converters - support bytes in Avro top-level union types (#2762))
>>>>>>> b4320946b (GEOMESA-3061 Converters - support bytes in Avro top-level union types (#2762))
=======
>>>>>>> 264c9fa240 (Merge branch 'feature/postgis-fixes')
>>>>>>> 97ec7d864a (GEOMESA-3061 Converters - support bytes in Avro top-level union types (#2762))
<<<<<<< HEAD
>>>>>>> 1973f72e77 (GEOMESA-3061 Converters - support bytes in Avro top-level union types (#2762))
<<<<<<< HEAD
>>>>>>> 4864cfc581 (GEOMESA-3061 Converters - support bytes in Avro top-level union types (#2762))
=======
=======
=======
=======
        Result.foreach(1 to 10) { j =>
>>>>>>> 3be8d2a5a (Merge branch 'feature/postgis-fixes')
>>>>>>> db8d998aa2 (Merge branch 'feature/postgis-fixes')
>>>>>>> 42e8565e9b (Merge branch 'feature/postgis-fixes')
>>>>>>> 264c9fa240 (Merge branch 'feature/postgis-fixes')
=======
>>>>>>> f1532f2313 (GEOMESA-3254 Add Bloop build support)
>>>>>>> c738f63bd9 (GEOMESA-3254 Add Bloop build support)
=======
>>>>>>> 4bbf97686c (GEOMESA-3067 Find attribute in Filters with Functions with embedded expressions correctly)
<<<<<<< HEAD
>>>>>>> 7213a78a3a (GEOMESA-3067 Find attribute in Filters with Functions with embedded expressions correctly)
=======
=======
=======
        Result.foreach(1 to 10) { j =>
>>>>>>> b9bdd406e (GEOMESA-3061 Converters - support bytes in Avro top-level union types (#2762))
>>>>>>> 6d9a5b626c (GEOMESA-3061 Converters - support bytes in Avro top-level union types (#2762))
<<<<<<< HEAD
>>>>>>> 96d5d442fa (GEOMESA-3061 Converters - support bytes in Avro top-level union types (#2762))
<<<<<<< HEAD
>>>>>>> 3676d4e56a (GEOMESA-3061 Converters - support bytes in Avro top-level union types (#2762))
=======
=======
=======
=======
        Result.foreach(1 to 10) { j =>
>>>>>>> b9bdd406e (GEOMESA-3061 Converters - support bytes in Avro top-level union types (#2762))
=======
>>>>>>> f36b0e8b9 (GEOMESA-3067 Find attribute in Filters with Functions with embedded expressions correctly)
>>>>>>> e5ed68fdd3 (GEOMESA-3067 Find attribute in Filters with Functions with embedded expressions correctly)
>>>>>>> b3dd8ec805 (GEOMESA-3067 Find attribute in Filters with Functions with embedded expressions correctly)
<<<<<<< HEAD
>>>>>>> e8ce815f1b (GEOMESA-3067 Find attribute in Filters with Functions with embedded expressions correctly)
=======
=======
>>>>>>> 5dcf23da52 (GEOMESA-3061 Converters - support bytes in Avro top-level union types (#2762))
<<<<<<< HEAD
>>>>>>> 60b4637548 (GEOMESA-3061 Converters - support bytes in Avro top-level union types (#2762))
=======
=======
>>>>>>> 2b62d1f3fe (GEOMESA-3067 Find attribute in Filters with Functions with embedded expressions correctly)
<<<<<<< HEAD
>>>>>>> 6f81d40992 (GEOMESA-3067 Find attribute in Filters with Functions with embedded expressions correctly)
=======
=======
=======
>>>>>>> a910ae135f (GEOMESA-3061 Converters - support bytes in Avro top-level union types (#2762))
>>>>>>> 92674ff9d4 (GEOMESA-3061 Converters - support bytes in Avro top-level union types (#2762))
>>>>>>> 009a284072 (GEOMESA-3061 Converters - support bytes in Avro top-level union types (#2762))
=======
>>>>>>> 9df4f8a9f6 (GEOMESA-3067 Find attribute in Filters with Functions with embedded expressions correctly)
=======
=======
>>>>>>> 9a4dff9e4f (GEOMESA-3061 Converters - support bytes in Avro top-level union types (#2762))
>>>>>>> 7b8c8dcc3d (GEOMESA-3061 Converters - support bytes in Avro top-level union types (#2762))
=======
>>>>>>> 79cd5cb606 (GEOMESA-3067 Find attribute in Filters with Functions with embedded expressions correctly)
=======
>>>>>>> c029a43a6c (GEOMESA-3061 Converters - support bytes in Avro top-level union types (#2762))
=======
=======
>>>>>>> 67de3c3202 (Merge branch 'feature/postgis-fixes')
>>>>>>> 217b7d1cb9 (Merge branch 'feature/postgis-fixes')
=======
=======
>>>>>>> 4f51687745 (GEOMESA-3061 Converters - support bytes in Avro top-level union types (#2762))
>>>>>>> 0dbede148d (GEOMESA-3061 Converters - support bytes in Avro top-level union types (#2762))
<<<<<<< HEAD
>>>>>>> 1bb69524c2 (GEOMESA-3061 Converters - support bytes in Avro top-level union types (#2762))
<<<<<<< HEAD
>>>>>>> a5b0374ee2 (GEOMESA-3061 Converters - support bytes in Avro top-level union types (#2762))
=======
=======
=======
=======
>>>>>>> 240977229 (GEOMESA-3061 Converters - support bytes in Avro top-level union types (#2762))
>>>>>>> 22dcc8170f (GEOMESA-3061 Converters - support bytes in Avro top-level union types (#2762))
>>>>>>> 8c9ca1211a (GEOMESA-3061 Converters - support bytes in Avro top-level union types (#2762))
>>>>>>> 4f51687745 (GEOMESA-3061 Converters - support bytes in Avro top-level union types (#2762))
=======
>>>>>>> 9a2d40c613 (GEOMESA-3061 Converters - support bytes in Avro top-level union types (#2762))
=======
=======
>>>>>>> 238945d4b3 (GEOMESA-3061 Converters - support bytes in Avro top-level union types (#2762))
>>>>>>> 1cad375176 (GEOMESA-3061 Converters - support bytes in Avro top-level union types (#2762))
>>>>>>> 73770612e0 (GEOMESA-3061 Converters - support bytes in Avro top-level union types (#2762))
=======
>>>>>>> 6c83981af3 (GEOMESA-3061 Converters - support bytes in Avro top-level union types (#2762))
          val sf = ScalaSimpleFeature.create(sft, s"${i}_${j}", i, j)
          filterGeoMesa.evaluate(sf) mustEqual filterGeoTools.evaluate(sf)
        }
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
<<<<<<< HEAD
<<<<<<< HEAD
<<<<<<< HEAD
<<<<<<< HEAD
<<<<<<< HEAD
<<<<<<< HEAD
<<<<<<< HEAD
<<<<<<< HEAD
<<<<<<< HEAD
<<<<<<< HEAD
<<<<<<< HEAD
<<<<<<< HEAD
<<<<<<< HEAD
<<<<<<< HEAD
<<<<<<< HEAD
<<<<<<< HEAD
<<<<<<< HEAD
<<<<<<< HEAD
<<<<<<< HEAD
<<<<<<< HEAD
<<<<<<< HEAD
<<<<<<< HEAD
<<<<<<< HEAD
<<<<<<< HEAD
<<<<<<< HEAD
<<<<<<< HEAD
<<<<<<< HEAD
<<<<<<< HEAD
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
>>>>>>> 264c9fa240 (Merge branch 'feature/postgis-fixes')
=======
>>>>>>> c738f63bd9 (GEOMESA-3254 Add Bloop build support)
=======
>>>>>>> 7213a78a3a (GEOMESA-3067 Find attribute in Filters with Functions with embedded expressions correctly)
=======
>>>>>>> 217b7d1cb9 (Merge branch 'feature/postgis-fixes')
=======
>>>>>>> 5430d59024 (GEOMESA-3067 Find attribute in Filters with Functions with embedded expressions correctly)
=======
>>>>>>> 42e8565e9b (Merge branch 'feature/postgis-fixes')
=======
<<<<<<< HEAD
<<<<<<< HEAD
>>>>>>> f1532f2313 (GEOMESA-3254 Add Bloop build support)
=======
>>>>>>> 4bbf97686c (GEOMESA-3067 Find attribute in Filters with Functions with embedded expressions correctly)
=======
<<<<<<< HEAD
<<<<<<< HEAD
>>>>>>> 67de3c3202 (Merge branch 'feature/postgis-fixes')
=======
>>>>>>> a990cf104e (GEOMESA-3067 Find attribute in Filters with Functions with embedded expressions correctly)
=======
>>>>>>> 71adb695c5 (Merge branch 'feature/postgis-fixes')
=======
>>>>>>> 5a4c24e020 (GEOMESA-3254 Add Bloop build support)
=======
>>>>>>> 53900605ca (GEOMESA-3067 Find attribute in Filters with Functions with embedded expressions correctly)
=======
>>>>>>> 30559ea5c9 (Merge branch 'feature/postgis-fixes')
=======
>>>>>>> 78fe4921a6 (GEOMESA-3067 Find attribute in Filters with Functions with embedded expressions correctly)
=======
>>>>>>> ec6d06b576 (Merge branch 'feature/postgis-fixes')
=======
>>>>>>> ca13f8551e (GEOMESA-3067 Find attribute in Filters with Functions with embedded expressions correctly)
=======
>>>>>>> 6e0709aba8 (Merge branch 'feature/postgis-fixes')
=======
>>>>>>> 7a84c9d22d (GEOMESA-3254 Add Bloop build support)
=======
>>>>>>> bad8172e9b (GEOMESA-3067 Find attribute in Filters with Functions with embedded expressions correctly)
=======
>>>>>>> ed25decdd5 (Merge branch 'feature/postgis-fixes')
=======
>>>>>>> f33d55e2ba (GEOMESA-3067 Find attribute in Filters with Functions with embedded expressions correctly)
=======
>>>>>>> 964e86145a (Merge branch 'feature/postgis-fixes')
=======
>>>>>>> b298e017f1 (GEOMESA-3254 Add Bloop build support)
=======
>>>>>>> 72b96c5c3e (GEOMESA-3067 Find attribute in Filters with Functions with embedded expressions correctly)
=======
>>>>>>> bf6bde0830 (Merge branch 'feature/postgis-fixes')
=======
>>>>>>> 5b9d5ada1b (GEOMESA-3067 Find attribute in Filters with Functions with embedded expressions correctly)
=======
>>>>>>> 354b5e5ae5 (Merge branch 'feature/postgis-fixes')
=======
>>>>>>> 043f2d0167 (GEOMESA-3067 Find attribute in Filters with Functions with embedded expressions correctly)
=======
>>>>>>> d581fa3e8f (Merge branch 'feature/postgis-fixes')
=======
=======
>>>>>>> 5430d59024 (GEOMESA-3067 Find attribute in Filters with Functions with embedded expressions correctly)
>>>>>>> ca1e0fad13 (GEOMESA-3067 Find attribute in Filters with Functions with embedded expressions correctly)
=======
=======
>>>>>>> 264c9fa240 (Merge branch 'feature/postgis-fixes')
=======
>>>>>>> f1532f2313 (GEOMESA-3254 Add Bloop build support)
=======
>>>>>>> c738f63bd9 (GEOMESA-3254 Add Bloop build support)
=======
>>>>>>> 7213a78a3a (GEOMESA-3067 Find attribute in Filters with Functions with embedded expressions correctly)
=======
>>>>>>> 67de3c3202 (Merge branch 'feature/postgis-fixes')
=======
>>>>>>> 217b7d1cb9 (Merge branch 'feature/postgis-fixes')
>>>>>>> 3be8d2a5a4 (Merge branch 'feature/postgis-fixes')
=======
>>>>>>> 907fb0b08a (GEOMESA-3067 Find attribute in Filters with Functions with embedded expressions correctly)
<<<<<<< HEAD
<<<<<<< HEAD
<<<<<<< HEAD
<<<<<<< HEAD
<<<<<<< HEAD
<<<<<<< HEAD
=======
>>>>>>> 42e8565e9b (Merge branch 'feature/postgis-fixes')
=======
>>>>>>> 6e0709aba8 (Merge branch 'feature/postgis-fixes')
=======
>>>>>>> ca1e0fad13 (GEOMESA-3067 Find attribute in Filters with Functions with embedded expressions correctly)
=======
=======
>>>>>>> 42e8565e9b (Merge branch 'feature/postgis-fixes')
>>>>>>> 264c9fa240 (Merge branch 'feature/postgis-fixes')
=======
=======
>>>>>>> 3be8d2a5a (Merge branch 'feature/postgis-fixes')
>>>>>>> db8d998aa2 (Merge branch 'feature/postgis-fixes')
<<<<<<< HEAD
<<<<<<< HEAD
<<<<<<< HEAD
<<<<<<< HEAD
<<<<<<< HEAD
<<<<<<< HEAD
=======
>>>>>>> 264c9fa240 (Merge branch 'feature/postgis-fixes')
=======
>>>>>>> c738f63bd9 (GEOMESA-3254 Add Bloop build support)
=======
>>>>>>> d845d7c1bd (GEOMESA-3254 Add Bloop build support)
=======
>>>>>>> 7bb5f26c3e (GEOMESA-3067 Find attribute in Filters with Functions with embedded expressions correctly)
<<<<<<< HEAD
<<<<<<< HEAD
<<<<<<< HEAD
<<<<<<< HEAD
<<<<<<< HEAD
<<<<<<< HEAD
=======
>>>>>>> 67de3c3202 (Merge branch 'feature/postgis-fixes')
=======
>>>>>>> ed25decdd5 (Merge branch 'feature/postgis-fixes')
=======
>>>>>>> 7213a78a3a (GEOMESA-3067 Find attribute in Filters with Functions with embedded expressions correctly)
=======
=======
>>>>>>> 67de3c3202 (Merge branch 'feature/postgis-fixes')
>>>>>>> 217b7d1cb9 (Merge branch 'feature/postgis-fixes')
=======
=======
>>>>>>> 3be8d2a5a (Merge branch 'feature/postgis-fixes')
>>>>>>> 1b25d7ddb4 (Merge branch 'feature/postgis-fixes')
<<<<<<< HEAD
<<<<<<< HEAD
<<<<<<< HEAD
<<<<<<< HEAD
<<<<<<< HEAD
=======
>>>>>>> 217b7d1cb9 (Merge branch 'feature/postgis-fixes')
=======
=======
>>>>>>> 26e5afc4ea (Merge branch 'feature/postgis-fixes')
=======
>>>>>>> 63a045a753 (GEOMESA-3254 Add Bloop build support)
=======
<<<<<<< HEAD
<<<<<<< HEAD
<<<<<<< HEAD
<<<<<<< HEAD
>>>>>>> b1a7408547 (GEOMESA-3067 Find attribute in Filters with Functions with embedded expressions correctly)
=======
>>>>>>> c69897d7bd (Merge branch 'feature/postgis-fixes')
=======
<<<<<<< HEAD
<<<<<<< HEAD
=======
>>>>>>> 5a4c24e020 (GEOMESA-3254 Add Bloop build support)
=======
>>>>>>> b1a7408547 (GEOMESA-3067 Find attribute in Filters with Functions with embedded expressions correctly)
=======
>>>>>>> 53900605ca (GEOMESA-3067 Find attribute in Filters with Functions with embedded expressions correctly)
=======
>>>>>>> 30559ea5c9 (Merge branch 'feature/postgis-fixes')
=======
>>>>>>> b298e017f1 (GEOMESA-3254 Add Bloop build support)
=======
>>>>>>> b1a7408547 (GEOMESA-3067 Find attribute in Filters with Functions with embedded expressions correctly)
=======
>>>>>>> 72b96c5c3e (GEOMESA-3067 Find attribute in Filters with Functions with embedded expressions correctly)
=======
>>>>>>> bf6bde0830 (Merge branch 'feature/postgis-fixes')
>>>>>>> 3be8d2a5a (Merge branch 'feature/postgis-fixes')
=======
>>>>>>> 907fb0b08 (GEOMESA-3067 Find attribute in Filters with Functions with embedded expressions correctly)
<<<<<<< HEAD
>>>>>>> deb8fd68de (GEOMESA-3067 Find attribute in Filters with Functions with embedded expressions correctly)
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
<<<<<<< HEAD
<<<<<<< HEAD
<<<<<<< HEAD
<<<<<<< HEAD
=======
>>>>>>> 53900605ca (GEOMESA-3067 Find attribute in Filters with Functions with embedded expressions correctly)
=======
>>>>>>> 72b96c5c3e (GEOMESA-3067 Find attribute in Filters with Functions with embedded expressions correctly)
>>>>>>> 63a045a753 (GEOMESA-3254 Add Bloop build support)
=======
=======
>>>>>>> 7bb5f26c3 (GEOMESA-3067 Find attribute in Filters with Functions with embedded expressions correctly)
<<<<<<< HEAD
<<<<<<< HEAD
<<<<<<< HEAD
<<<<<<< HEAD
<<<<<<< HEAD
=======
>>>>>>> 30559ea5c9 (Merge branch 'feature/postgis-fixes')
=======
>>>>>>> bf6bde0830 (Merge branch 'feature/postgis-fixes')
>>>>>>> b1a7408547 (GEOMESA-3067 Find attribute in Filters with Functions with embedded expressions correctly)
=======
=======
=======
>>>>>>> 3be8d2a5a (Merge branch 'feature/postgis-fixes')
>>>>>>> 1b25d7ddb (Merge branch 'feature/postgis-fixes')
>>>>>>> c69897d7bd (Merge branch 'feature/postgis-fixes')
<<<<<<< HEAD
<<<<<<< HEAD
<<<<<<< HEAD
<<<<<<< HEAD
=======
>>>>>>> 74db66044b (GEOMESA-3067 Find attribute in Filters with Functions with embedded expressions correctly)
=======
=======
>>>>>>> 3be8d2a5a (Merge branch 'feature/postgis-fixes')
>>>>>>> da00c7bd68 (Merge branch 'feature/postgis-fixes')
<<<<<<< HEAD
<<<<<<< HEAD
<<<<<<< HEAD
=======
>>>>>>> 32d312dc48 (GEOMESA-3067 Find attribute in Filters with Functions with embedded expressions correctly)
=======
=======
>>>>>>> 3be8d2a5a4 (Merge branch 'feature/postgis-fixes')
>>>>>>> 34472778d3 (Merge branch 'feature/postgis-fixes')
<<<<<<< HEAD
<<<<<<< HEAD
=======
>>>>>>> 5430d59024 (GEOMESA-3067 Find attribute in Filters with Functions with embedded expressions correctly)
=======
>>>>>>> 42e8565e9b (Merge branch 'feature/postgis-fixes')
<<<<<<< HEAD
<<<<<<< HEAD
=======
>>>>>>> c738f63bd9 (GEOMESA-3254 Add Bloop build support)
=======
=======
>>>>>>> d845d7c1bd (GEOMESA-3254 Add Bloop build support)
>>>>>>> f1532f2313 (GEOMESA-3254 Add Bloop build support)
<<<<<<< HEAD
<<<<<<< HEAD
=======
>>>>>>> 4bbf97686c (GEOMESA-3067 Find attribute in Filters with Functions with embedded expressions correctly)
=======
>>>>>>> 67de3c3202 (Merge branch 'feature/postgis-fixes')
<<<<<<< HEAD
=======
=======
=======
>>>>>>> 26e5afc4ea (Merge branch 'feature/postgis-fixes')
=======
>>>>>>> 3be8d2a5a (Merge branch 'feature/postgis-fixes')
=======
>>>>>>> 907fb0b08 (GEOMESA-3067 Find attribute in Filters with Functions with embedded expressions correctly)
<<<<<<< HEAD
>>>>>>> deb8fd68de (GEOMESA-3067 Find attribute in Filters with Functions with embedded expressions correctly)
<<<<<<< HEAD
>>>>>>> a990cf104e (GEOMESA-3067 Find attribute in Filters with Functions with embedded expressions correctly)
=======
=======
=======
=======
>>>>>>> 3be8d2a5a (Merge branch 'feature/postgis-fixes')
>>>>>>> db8d998aa (Merge branch 'feature/postgis-fixes')
>>>>>>> 26e5afc4ea (Merge branch 'feature/postgis-fixes')
>>>>>>> 71adb695c5 (Merge branch 'feature/postgis-fixes')
=======
>>>>>>> 63a045a753 (GEOMESA-3254 Add Bloop build support)
>>>>>>> 5a4c24e020 (GEOMESA-3254 Add Bloop build support)
=======
>>>>>>> b1a7408547 (GEOMESA-3067 Find attribute in Filters with Functions with embedded expressions correctly)
>>>>>>> 53900605ca (GEOMESA-3067 Find attribute in Filters with Functions with embedded expressions correctly)
=======
>>>>>>> 30559ea5c9 (Merge branch 'feature/postgis-fixes')
=======
=======
>>>>>>> 74db66044b (GEOMESA-3067 Find attribute in Filters with Functions with embedded expressions correctly)
>>>>>>> 78fe4921a6 (GEOMESA-3067 Find attribute in Filters with Functions with embedded expressions correctly)
=======
>>>>>>> ec6d06b576 (Merge branch 'feature/postgis-fixes')
=======
>>>>>>> 724c808fa8 (GEOMESA-3067 Find attribute in Filters with Functions with embedded expressions correctly)
=======
=======
>>>>>>> 3be8d2a5a4 (Merge branch 'feature/postgis-fixes')
>>>>>>> 4c41429da9 (Merge branch 'feature/postgis-fixes')
=======
>>>>>>> ca13f8551e (GEOMESA-3067 Find attribute in Filters with Functions with embedded expressions correctly)
=======
>>>>>>> 6e0709aba8 (Merge branch 'feature/postgis-fixes')
=======
=======
>>>>>>> d845d7c1bd (GEOMESA-3254 Add Bloop build support)
>>>>>>> 7a84c9d22d (GEOMESA-3254 Add Bloop build support)
=======
>>>>>>> bad8172e9b (GEOMESA-3067 Find attribute in Filters with Functions with embedded expressions correctly)
=======
>>>>>>> ed25decdd5 (Merge branch 'feature/postgis-fixes')
=======
=======
=======
>>>>>>> 26e5afc4ea (Merge branch 'feature/postgis-fixes')
=======
>>>>>>> 3be8d2a5a (Merge branch 'feature/postgis-fixes')
=======
>>>>>>> 907fb0b08 (GEOMESA-3067 Find attribute in Filters with Functions with embedded expressions correctly)
<<<<<<< HEAD
>>>>>>> deb8fd68de (GEOMESA-3067 Find attribute in Filters with Functions with embedded expressions correctly)
<<<<<<< HEAD
>>>>>>> f33d55e2ba (GEOMESA-3067 Find attribute in Filters with Functions with embedded expressions correctly)
=======
=======
=======
=======
>>>>>>> 3be8d2a5a (Merge branch 'feature/postgis-fixes')
>>>>>>> db8d998aa (Merge branch 'feature/postgis-fixes')
>>>>>>> 26e5afc4ea (Merge branch 'feature/postgis-fixes')
>>>>>>> 964e86145a (Merge branch 'feature/postgis-fixes')
=======
>>>>>>> 63a045a753 (GEOMESA-3254 Add Bloop build support)
>>>>>>> b298e017f1 (GEOMESA-3254 Add Bloop build support)
=======
>>>>>>> b1a7408547 (GEOMESA-3067 Find attribute in Filters with Functions with embedded expressions correctly)
>>>>>>> 72b96c5c3e (GEOMESA-3067 Find attribute in Filters with Functions with embedded expressions correctly)
=======
>>>>>>> bf6bde0830 (Merge branch 'feature/postgis-fixes')
=======
=======
>>>>>>> 74db66044b (GEOMESA-3067 Find attribute in Filters with Functions with embedded expressions correctly)
>>>>>>> 5b9d5ada1b (GEOMESA-3067 Find attribute in Filters with Functions with embedded expressions correctly)
=======
>>>>>>> 354b5e5ae5 (Merge branch 'feature/postgis-fixes')
=======
=======
>>>>>>> 32d312dc48 (GEOMESA-3067 Find attribute in Filters with Functions with embedded expressions correctly)
>>>>>>> 043f2d0167 (GEOMESA-3067 Find attribute in Filters with Functions with embedded expressions correctly)
=======
>>>>>>> d581fa3e8f (Merge branch 'feature/postgis-fixes')
=======
=======
>>>>>>> 5430d59024 (GEOMESA-3067 Find attribute in Filters with Functions with embedded expressions correctly)
>>>>>>> ca1e0fad13 (GEOMESA-3067 Find attribute in Filters with Functions with embedded expressions correctly)
=======
>>>>>>> 264c9fa240 (Merge branch 'feature/postgis-fixes')
=======
>>>>>>> c738f63bd9 (GEOMESA-3254 Add Bloop build support)
=======
=======
>>>>>>> 4bbf97686c (GEOMESA-3067 Find attribute in Filters with Functions with embedded expressions correctly)
>>>>>>> 7213a78a3a (GEOMESA-3067 Find attribute in Filters with Functions with embedded expressions correctly)
=======
>>>>>>> 217b7d1cb9 (Merge branch 'feature/postgis-fixes')
    "comparison operators should have consistent semantics" >> {
      val sft = SimpleFeatureTypes.createType("test", "s:String")
      val sf = ScalaSimpleFeature.create(sft, "id", "5")
      FastFilterFactory.toFilter(sft, "s > '100'").evaluate(sf) must beTrue
      FastFilterFactory.toFilter(sft, "s >= '100'").evaluate(sf) must beTrue
      FastFilterFactory.toFilter(sft, "s < '100'").evaluate(sf) must beFalse
      FastFilterFactory.toFilter(sft, "s <= '100'").evaluate(sf) must beFalse
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
<<<<<<< HEAD
<<<<<<< HEAD
<<<<<<< HEAD
<<<<<<< HEAD
<<<<<<< HEAD
<<<<<<< HEAD
<<<<<<< HEAD
<<<<<<< HEAD
<<<<<<< HEAD
<<<<<<< HEAD
<<<<<<< HEAD
<<<<<<< HEAD
<<<<<<< HEAD
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
>>>>>>> 34472778d3 (Merge branch 'feature/postgis-fixes')
>>>>>>> d581fa3e8f (Merge branch 'feature/postgis-fixes')
=======
>>>>>>> ca1e0fad13 (GEOMESA-3067 Find attribute in Filters with Functions with embedded expressions correctly)
=======
>>>>>>> 264c9fa240 (Merge branch 'feature/postgis-fixes')
=======
>>>>>>> c738f63bd9 (GEOMESA-3254 Add Bloop build support)
=======
>>>>>>> 7213a78a3a (GEOMESA-3067 Find attribute in Filters with Functions with embedded expressions correctly)
=======
>>>>>>> 217b7d1cb9 (Merge branch 'feature/postgis-fixes')
=======
>>>>>>> 34472778d3 (Merge branch 'feature/postgis-fixes')
=======
>>>>>>> 5430d59024 (GEOMESA-3067 Find attribute in Filters with Functions with embedded expressions correctly)
=======
>>>>>>> 42e8565e9b (Merge branch 'feature/postgis-fixes')
=======
>>>>>>> f1532f2313 (GEOMESA-3254 Add Bloop build support)
=======
>>>>>>> 4bbf97686c (GEOMESA-3067 Find attribute in Filters with Functions with embedded expressions correctly)
=======
>>>>>>> 67de3c3202 (Merge branch 'feature/postgis-fixes')
=======
<<<<<<< HEAD
>>>>>>> 42e8565e9b (Merge branch 'feature/postgis-fixes')
=======
>>>>>>> f1532f2313 (GEOMESA-3254 Add Bloop build support)
=======
>>>>>>> 4bbf97686c (GEOMESA-3067 Find attribute in Filters with Functions with embedded expressions correctly)
=======
>>>>>>> 67de3c3202 (Merge branch 'feature/postgis-fixes')
=======
>>>>>>> a990cf104e (GEOMESA-3067 Find attribute in Filters with Functions with embedded expressions correctly)
=======
>>>>>>> 71adb695c5 (Merge branch 'feature/postgis-fixes')
=======
>>>>>>> 5a4c24e020 (GEOMESA-3254 Add Bloop build support)
=======
>>>>>>> 53900605ca (GEOMESA-3067 Find attribute in Filters with Functions with embedded expressions correctly)
=======
>>>>>>> 30559ea5c9 (Merge branch 'feature/postgis-fixes')
=======
>>>>>>> 78fe4921a6 (GEOMESA-3067 Find attribute in Filters with Functions with embedded expressions correctly)
=======
>>>>>>> ec6d06b576 (Merge branch 'feature/postgis-fixes')
=======
>>>>>>> 4c41429da9 (Merge branch 'feature/postgis-fixes')
=======
>>>>>>> ca13f8551e (GEOMESA-3067 Find attribute in Filters with Functions with embedded expressions correctly)
=======
>>>>>>> 6e0709aba8 (Merge branch 'feature/postgis-fixes')
=======
>>>>>>> 7a84c9d22d (GEOMESA-3254 Add Bloop build support)
=======
>>>>>>> bad8172e9b (GEOMESA-3067 Find attribute in Filters with Functions with embedded expressions correctly)
=======
>>>>>>> ed25decdd5 (Merge branch 'feature/postgis-fixes')
=======
>>>>>>> f33d55e2ba (GEOMESA-3067 Find attribute in Filters with Functions with embedded expressions correctly)
=======
>>>>>>> 964e86145a (Merge branch 'feature/postgis-fixes')
=======
>>>>>>> b298e017f1 (GEOMESA-3254 Add Bloop build support)
=======
>>>>>>> 72b96c5c3e (GEOMESA-3067 Find attribute in Filters with Functions with embedded expressions correctly)
=======
>>>>>>> bf6bde0830 (Merge branch 'feature/postgis-fixes')
=======
>>>>>>> 5b9d5ada1b (GEOMESA-3067 Find attribute in Filters with Functions with embedded expressions correctly)
=======
>>>>>>> 354b5e5ae5 (Merge branch 'feature/postgis-fixes')
=======
>>>>>>> 043f2d0167 (GEOMESA-3067 Find attribute in Filters with Functions with embedded expressions correctly)
=======
<<<<<<< HEAD
<<<<<<< HEAD
<<<<<<< HEAD
<<<<<<< HEAD
=======
>>>>>>> ca1e0fad13 (GEOMESA-3067 Find attribute in Filters with Functions with embedded expressions correctly)
<<<<<<< HEAD
<<<<<<< HEAD
<<<<<<< HEAD
<<<<<<< HEAD
<<<<<<< HEAD
=======
>>>>>>> ef55408e9a (GEOMESA-3067 Find attribute in Filters with Functions with embedded expressions correctly)
=======
>>>>>>> 49f2a1c310 (GEOMESA-3067 Find attribute in Filters with Functions with embedded expressions correctly)
<<<<<<< HEAD
=======
>>>>>>> 17b189175b (GEOMESA-3067 Find attribute in Filters with Functions with embedded expressions correctly)
=======
>>>>>>> e31a4215c4 (GEOMESA-3067 Find attribute in Filters with Functions with embedded expressions correctly)
=======
=======
>>>>>>> ef55408e9a (GEOMESA-3067 Find attribute in Filters with Functions with embedded expressions correctly)
>>>>>>> 70f2c62b7e (GEOMESA-3067 Find attribute in Filters with Functions with embedded expressions correctly)
=======
>>>>>>> 87dddefcd8 (GEOMESA-3067 Find attribute in Filters with Functions with embedded expressions correctly)
>>>>>>> 7acc3ea465 (GEOMESA-3067 Find attribute in Filters with Functions with embedded expressions correctly)
=======
>>>>>>> 7acc3ea46 (GEOMESA-3067 Find attribute in Filters with Functions with embedded expressions correctly)
>>>>>>> f36b0e8b9a (GEOMESA-3067 Find attribute in Filters with Functions with embedded expressions correctly)
=======
>>>>>>> 7acc3ea46 (GEOMESA-3067 Find attribute in Filters with Functions with embedded expressions correctly)
>>>>>>> e3a63fee18 (GEOMESA-3067 Find attribute in Filters with Functions with embedded expressions correctly)
<<<<<<< HEAD
<<<<<<< HEAD
<<<<<<< HEAD
<<<<<<< HEAD
<<<<<<< HEAD
<<<<<<< HEAD
=======
>>>>>>> 70f2c62b7e (GEOMESA-3067 Find attribute in Filters with Functions with embedded expressions correctly)
=======
>>>>>>> 87dddefcd8 (GEOMESA-3067 Find attribute in Filters with Functions with embedded expressions correctly)
=======
>>>>>>> 7acc3ea46 (GEOMESA-3067 Find attribute in Filters with Functions with embedded expressions correctly)
>>>>>>> 908ad4071d (GEOMESA-3067 Find attribute in Filters with Functions with embedded expressions correctly)
=======
>>>>>>> 3be8d2a5a4 (Merge branch 'feature/postgis-fixes')
<<<<<<< HEAD
<<<<<<< HEAD
<<<<<<< HEAD
<<<<<<< HEAD
<<<<<<< HEAD
<<<<<<< HEAD
=======
>>>>>>> 5430d59024 (GEOMESA-3067 Find attribute in Filters with Functions with embedded expressions correctly)
=======
>>>>>>> ca13f8551e (GEOMESA-3067 Find attribute in Filters with Functions with embedded expressions correctly)
=======
>>>>>>> d581fa3e8f (Merge branch 'feature/postgis-fixes')
=======
=======
>>>>>>> 5430d59024 (GEOMESA-3067 Find attribute in Filters with Functions with embedded expressions correctly)
>>>>>>> ca1e0fad13 (GEOMESA-3067 Find attribute in Filters with Functions with embedded expressions correctly)
=======
=======
>>>>>>> 7acc3ea46 (GEOMESA-3067 Find attribute in Filters with Functions with embedded expressions correctly)
>>>>>>> 907fb0b08a (GEOMESA-3067 Find attribute in Filters with Functions with embedded expressions correctly)
<<<<<<< HEAD
<<<<<<< HEAD
<<<<<<< HEAD
<<<<<<< HEAD
<<<<<<< HEAD
<<<<<<< HEAD
=======
>>>>>>> ca1e0fad13 (GEOMESA-3067 Find attribute in Filters with Functions with embedded expressions correctly)
=======
>>>>>>> 264c9fa240 (Merge branch 'feature/postgis-fixes')
=======
=======
>>>>>>> deb8fd68de (GEOMESA-3067 Find attribute in Filters with Functions with embedded expressions correctly)
=======
<<<<<<< HEAD
<<<<<<< HEAD
<<<<<<< HEAD
<<<<<<< HEAD
=======
>>>>>>> 63a045a753 (GEOMESA-3254 Add Bloop build support)
=======
>>>>>>> b1a7408547 (GEOMESA-3067 Find attribute in Filters with Functions with embedded expressions correctly)
=======
>>>>>>> c69897d7bd (Merge branch 'feature/postgis-fixes')
=======
>>>>>>> 71adb695c5 (Merge branch 'feature/postgis-fixes')
=======
>>>>>>> 63a045a753 (GEOMESA-3254 Add Bloop build support)
=======
>>>>>>> b1a7408547 (GEOMESA-3067 Find attribute in Filters with Functions with embedded expressions correctly)
=======
>>>>>>> c69897d7bd (Merge branch 'feature/postgis-fixes')
=======
>>>>>>> 964e86145a (Merge branch 'feature/postgis-fixes')
=======
>>>>>>> 63a045a753 (GEOMESA-3254 Add Bloop build support)
=======
>>>>>>> b1a7408547 (GEOMESA-3067 Find attribute in Filters with Functions with embedded expressions correctly)
=======
>>>>>>> c69897d7bd (Merge branch 'feature/postgis-fixes')
=======
>>>>>>> db8d998aa (Merge branch 'feature/postgis-fixes')
>>>>>>> 26e5afc4ea (Merge branch 'feature/postgis-fixes')
=======
<<<<<<< HEAD
<<<<<<< HEAD
<<<<<<< HEAD
<<<<<<< HEAD
>>>>>>> 1b25d7ddb (Merge branch 'feature/postgis-fixes')
=======
=======
>>>>>>> a990cf104e (GEOMESA-3067 Find attribute in Filters with Functions with embedded expressions correctly)
=======
>>>>>>> 71adb695c5 (Merge branch 'feature/postgis-fixes')
=======
>>>>>>> 1b25d7ddb (Merge branch 'feature/postgis-fixes')
=======
>>>>>>> 30559ea5c9 (Merge branch 'feature/postgis-fixes')
=======
>>>>>>> f33d55e2ba (GEOMESA-3067 Find attribute in Filters with Functions with embedded expressions correctly)
=======
>>>>>>> 964e86145a (Merge branch 'feature/postgis-fixes')
=======
>>>>>>> 1b25d7ddb (Merge branch 'feature/postgis-fixes')
=======
>>>>>>> bf6bde0830 (Merge branch 'feature/postgis-fixes')
>>>>>>> 7acc3ea46 (GEOMESA-3067 Find attribute in Filters with Functions with embedded expressions correctly)
=======
>>>>>>> 3be8d2a5a (Merge branch 'feature/postgis-fixes')
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
>>>>>>> a990cf104e (GEOMESA-3067 Find attribute in Filters with Functions with embedded expressions correctly)
=======
>>>>>>> 71adb695c5 (Merge branch 'feature/postgis-fixes')
=======
>>>>>>> 30559ea5c9 (Merge branch 'feature/postgis-fixes')
=======
>>>>>>> f33d55e2ba (GEOMESA-3067 Find attribute in Filters with Functions with embedded expressions correctly)
=======
>>>>>>> 964e86145a (Merge branch 'feature/postgis-fixes')
=======
>>>>>>> bf6bde0830 (Merge branch 'feature/postgis-fixes')
>>>>>>> db8d998aa2 (Merge branch 'feature/postgis-fixes')
=======
>>>>>>> d845d7c1bd (GEOMESA-3254 Add Bloop build support)
=======
=======
>>>>>>> 7acc3ea46 (GEOMESA-3067 Find attribute in Filters with Functions with embedded expressions correctly)
>>>>>>> 7bb5f26c3e (GEOMESA-3067 Find attribute in Filters with Functions with embedded expressions correctly)
=======
=======
>>>>>>> 7acc3ea46 (GEOMESA-3067 Find attribute in Filters with Functions with embedded expressions correctly)
=======
>>>>>>> 3be8d2a5a (Merge branch 'feature/postgis-fixes')
>>>>>>> 1b25d7ddb4 (Merge branch 'feature/postgis-fixes')
<<<<<<< HEAD
<<<<<<< HEAD
<<<<<<< HEAD
<<<<<<< HEAD
<<<<<<< HEAD
=======
>>>>>>> 217b7d1cb9 (Merge branch 'feature/postgis-fixes')
=======
=======
>>>>>>> 26e5afc4ea (Merge branch 'feature/postgis-fixes')
=======
>>>>>>> c69897d7bd (Merge branch 'feature/postgis-fixes')
=======
=======
>>>>>>> 7acc3ea46 (GEOMESA-3067 Find attribute in Filters with Functions with embedded expressions correctly)
>>>>>>> 907fb0b08 (GEOMESA-3067 Find attribute in Filters with Functions with embedded expressions correctly)
<<<<<<< HEAD
>>>>>>> deb8fd68de (GEOMESA-3067 Find attribute in Filters with Functions with embedded expressions correctly)
=======
=======
>>>>>>> db8d998aa (Merge branch 'feature/postgis-fixes')
<<<<<<< HEAD
>>>>>>> 26e5afc4ea (Merge branch 'feature/postgis-fixes')
=======
=======
>>>>>>> d845d7c1b (GEOMESA-3254 Add Bloop build support)
<<<<<<< HEAD
<<<<<<< HEAD
<<<<<<< HEAD
<<<<<<< HEAD
<<<<<<< HEAD
=======
>>>>>>> 53900605ca (GEOMESA-3067 Find attribute in Filters with Functions with embedded expressions correctly)
=======
>>>>>>> 72b96c5c3e (GEOMESA-3067 Find attribute in Filters with Functions with embedded expressions correctly)
>>>>>>> 63a045a753 (GEOMESA-3254 Add Bloop build support)
=======
=======
=======
>>>>>>> 7acc3ea46 (GEOMESA-3067 Find attribute in Filters with Functions with embedded expressions correctly)
>>>>>>> 7bb5f26c3 (GEOMESA-3067 Find attribute in Filters with Functions with embedded expressions correctly)
<<<<<<< HEAD
<<<<<<< HEAD
<<<<<<< HEAD
<<<<<<< HEAD
<<<<<<< HEAD
=======
>>>>>>> 30559ea5c9 (Merge branch 'feature/postgis-fixes')
=======
>>>>>>> bf6bde0830 (Merge branch 'feature/postgis-fixes')
>>>>>>> b1a7408547 (GEOMESA-3067 Find attribute in Filters with Functions with embedded expressions correctly)
=======
=======
>>>>>>> 1b25d7ddb (Merge branch 'feature/postgis-fixes')
>>>>>>> c69897d7bd (Merge branch 'feature/postgis-fixes')
<<<<<<< HEAD
<<<<<<< HEAD
<<<<<<< HEAD
<<<<<<< HEAD
=======
>>>>>>> 78fe4921a6 (GEOMESA-3067 Find attribute in Filters with Functions with embedded expressions correctly)
=======
>>>>>>> 5b9d5ada1b (GEOMESA-3067 Find attribute in Filters with Functions with embedded expressions correctly)
=======
=======
>>>>>>> 7acc3ea46 (GEOMESA-3067 Find attribute in Filters with Functions with embedded expressions correctly)
>>>>>>> 74db66044b (GEOMESA-3067 Find attribute in Filters with Functions with embedded expressions correctly)
<<<<<<< HEAD
<<<<<<< HEAD
<<<<<<< HEAD
<<<<<<< HEAD
=======
>>>>>>> ec6d06b576 (Merge branch 'feature/postgis-fixes')
=======
>>>>>>> 354b5e5ae5 (Merge branch 'feature/postgis-fixes')
=======
=======
>>>>>>> 7acc3ea46 (GEOMESA-3067 Find attribute in Filters with Functions with embedded expressions correctly)
=======
>>>>>>> 3be8d2a5a (Merge branch 'feature/postgis-fixes')
>>>>>>> da00c7bd68 (Merge branch 'feature/postgis-fixes')
<<<<<<< HEAD
<<<<<<< HEAD
<<<<<<< HEAD
=======
=======
<<<<<<< HEAD
>>>>>>> 7acc3ea465 (GEOMESA-3067 Find attribute in Filters with Functions with embedded expressions correctly)
<<<<<<< HEAD
>>>>>>> 32d312dc48 (GEOMESA-3067 Find attribute in Filters with Functions with embedded expressions correctly)
=======
=======
>>>>>>> 7acc3ea46 (GEOMESA-3067 Find attribute in Filters with Functions with embedded expressions correctly)
>>>>>>> f36b0e8b9a (GEOMESA-3067 Find attribute in Filters with Functions with embedded expressions correctly)
>>>>>>> a1d28116d4 (GEOMESA-3067 Find attribute in Filters with Functions with embedded expressions correctly)
=======
>>>>>>> ef55408e9a (GEOMESA-3067 Find attribute in Filters with Functions with embedded expressions correctly)
<<<<<<< HEAD
<<<<<<< HEAD
=======
>>>>>>> 87dddefcd8 (GEOMESA-3067 Find attribute in Filters with Functions with embedded expressions correctly)
=======
=======
>>>>>>> 7acc3ea46 (GEOMESA-3067 Find attribute in Filters with Functions with embedded expressions correctly)
>>>>>>> 908ad4071d (GEOMESA-3067 Find attribute in Filters with Functions with embedded expressions correctly)
>>>>>>> 49f2a1c310 (GEOMESA-3067 Find attribute in Filters with Functions with embedded expressions correctly)
<<<<<<< HEAD
<<<<<<< HEAD
=======
>>>>>>> 34472778d3 (Merge branch 'feature/postgis-fixes')
=======
>>>>>>> 5430d59024 (GEOMESA-3067 Find attribute in Filters with Functions with embedded expressions correctly)
<<<<<<< HEAD
<<<<<<< HEAD
=======
=======
>>>>>>> 6e0709aba8 (Merge branch 'feature/postgis-fixes')
=======
=======
=======
=======
>>>>>>> 264c9fa240 (Merge branch 'feature/postgis-fixes')
=======
>>>>>>> 7acc3ea46 (GEOMESA-3067 Find attribute in Filters with Functions with embedded expressions correctly)
=======
>>>>>>> 3be8d2a5a (Merge branch 'feature/postgis-fixes')
>>>>>>> db8d998aa2 (Merge branch 'feature/postgis-fixes')
<<<<<<< HEAD
<<<<<<< HEAD
<<<<<<< HEAD
<<<<<<< HEAD
<<<<<<< HEAD
=======
>>>>>>> c738f63bd9 (GEOMESA-3254 Add Bloop build support)
>>>>>>> 42e8565e9b (Merge branch 'feature/postgis-fixes')
=======
=======
>>>>>>> d845d7c1bd (GEOMESA-3254 Add Bloop build support)
<<<<<<< HEAD
<<<<<<< HEAD
<<<<<<< HEAD
<<<<<<< HEAD
>>>>>>> f1532f2313 (GEOMESA-3254 Add Bloop build support)
=======
=======
>>>>>>> bad8172e9b (GEOMESA-3067 Find attribute in Filters with Functions with embedded expressions correctly)
=======
=======
>>>>>>> 7acc3ea46 (GEOMESA-3067 Find attribute in Filters with Functions with embedded expressions correctly)
>>>>>>> 7bb5f26c3e (GEOMESA-3067 Find attribute in Filters with Functions with embedded expressions correctly)
<<<<<<< HEAD
>>>>>>> 4bbf97686c (GEOMESA-3067 Find attribute in Filters with Functions with embedded expressions correctly)
=======
>>>>>>> 67de3c3202 (Merge branch 'feature/postgis-fixes')
=======
=======
=======
>>>>>>> 26e5afc4ea (Merge branch 'feature/postgis-fixes')
=======
=======
>>>>>>> 7acc3ea46 (GEOMESA-3067 Find attribute in Filters with Functions with embedded expressions correctly)
>>>>>>> 907fb0b08 (GEOMESA-3067 Find attribute in Filters with Functions with embedded expressions correctly)
<<<<<<< HEAD
>>>>>>> deb8fd68de (GEOMESA-3067 Find attribute in Filters with Functions with embedded expressions correctly)
<<<<<<< HEAD
>>>>>>> a990cf104e (GEOMESA-3067 Find attribute in Filters with Functions with embedded expressions correctly)
=======
=======
=======
>>>>>>> db8d998aa (Merge branch 'feature/postgis-fixes')
>>>>>>> 26e5afc4ea (Merge branch 'feature/postgis-fixes')
>>>>>>> 71adb695c5 (Merge branch 'feature/postgis-fixes')
=======
>>>>>>> 63a045a753 (GEOMESA-3254 Add Bloop build support)
>>>>>>> 5a4c24e020 (GEOMESA-3254 Add Bloop build support)
=======
>>>>>>> b1a7408547 (GEOMESA-3067 Find attribute in Filters with Functions with embedded expressions correctly)
>>>>>>> 53900605ca (GEOMESA-3067 Find attribute in Filters with Functions with embedded expressions correctly)
=======
>>>>>>> 30559ea5c9 (Merge branch 'feature/postgis-fixes')
=======
>>>>>>> 78fe4921a6 (GEOMESA-3067 Find attribute in Filters with Functions with embedded expressions correctly)
=======
>>>>>>> ec6d06b576 (Merge branch 'feature/postgis-fixes')
=======
=======
<<<<<<< HEAD
>>>>>>> 7acc3ea465 (GEOMESA-3067 Find attribute in Filters with Functions with embedded expressions correctly)
<<<<<<< HEAD
>>>>>>> 724c808fa8 (GEOMESA-3067 Find attribute in Filters with Functions with embedded expressions correctly)
=======
=======
>>>>>>> 7acc3ea46 (GEOMESA-3067 Find attribute in Filters with Functions with embedded expressions correctly)
>>>>>>> f36b0e8b9a (GEOMESA-3067 Find attribute in Filters with Functions with embedded expressions correctly)
>>>>>>> efb6723f42 (GEOMESA-3067 Find attribute in Filters with Functions with embedded expressions correctly)
=======
>>>>>>> 17b189175b (GEOMESA-3067 Find attribute in Filters with Functions with embedded expressions correctly)
=======
=======
>>>>>>> 7acc3ea46 (GEOMESA-3067 Find attribute in Filters with Functions with embedded expressions correctly)
>>>>>>> 908ad4071d (GEOMESA-3067 Find attribute in Filters with Functions with embedded expressions correctly)
>>>>>>> e31a4215c4 (GEOMESA-3067 Find attribute in Filters with Functions with embedded expressions correctly)
=======
>>>>>>> 4c41429da9 (Merge branch 'feature/postgis-fixes')
=======
>>>>>>> ca13f8551e (GEOMESA-3067 Find attribute in Filters with Functions with embedded expressions correctly)
=======
>>>>>>> 6e0709aba8 (Merge branch 'feature/postgis-fixes')
=======
=======
>>>>>>> d845d7c1bd (GEOMESA-3254 Add Bloop build support)
>>>>>>> 7a84c9d22d (GEOMESA-3254 Add Bloop build support)
=======
>>>>>>> bad8172e9b (GEOMESA-3067 Find attribute in Filters with Functions with embedded expressions correctly)
=======
>>>>>>> ed25decdd5 (Merge branch 'feature/postgis-fixes')
=======
=======
=======
>>>>>>> 26e5afc4ea (Merge branch 'feature/postgis-fixes')
=======
=======
>>>>>>> 7acc3ea46 (GEOMESA-3067 Find attribute in Filters with Functions with embedded expressions correctly)
>>>>>>> 907fb0b08 (GEOMESA-3067 Find attribute in Filters with Functions with embedded expressions correctly)
<<<<<<< HEAD
>>>>>>> deb8fd68de (GEOMESA-3067 Find attribute in Filters with Functions with embedded expressions correctly)
<<<<<<< HEAD
>>>>>>> f33d55e2ba (GEOMESA-3067 Find attribute in Filters with Functions with embedded expressions correctly)
=======
=======
=======
>>>>>>> db8d998aa (Merge branch 'feature/postgis-fixes')
>>>>>>> 26e5afc4ea (Merge branch 'feature/postgis-fixes')
>>>>>>> 964e86145a (Merge branch 'feature/postgis-fixes')
=======
>>>>>>> 63a045a753 (GEOMESA-3254 Add Bloop build support)
>>>>>>> b298e017f1 (GEOMESA-3254 Add Bloop build support)
=======
>>>>>>> b1a7408547 (GEOMESA-3067 Find attribute in Filters with Functions with embedded expressions correctly)
>>>>>>> 72b96c5c3e (GEOMESA-3067 Find attribute in Filters with Functions with embedded expressions correctly)
=======
>>>>>>> bf6bde0830 (Merge branch 'feature/postgis-fixes')
=======
>>>>>>> 5b9d5ada1b (GEOMESA-3067 Find attribute in Filters with Functions with embedded expressions correctly)
=======
>>>>>>> 354b5e5ae5 (Merge branch 'feature/postgis-fixes')
=======
=======
=======
<<<<<<< HEAD
>>>>>>> 7acc3ea465 (GEOMESA-3067 Find attribute in Filters with Functions with embedded expressions correctly)
<<<<<<< HEAD
>>>>>>> 32d312dc48 (GEOMESA-3067 Find attribute in Filters with Functions with embedded expressions correctly)
<<<<<<< HEAD
>>>>>>> 043f2d0167 (GEOMESA-3067 Find attribute in Filters with Functions with embedded expressions correctly)
=======
=======
=======
>>>>>>> 7acc3ea46 (GEOMESA-3067 Find attribute in Filters with Functions with embedded expressions correctly)
>>>>>>> f36b0e8b9a (GEOMESA-3067 Find attribute in Filters with Functions with embedded expressions correctly)
>>>>>>> a1d28116d4 (GEOMESA-3067 Find attribute in Filters with Functions with embedded expressions correctly)
>>>>>>> a6693cb0ba (GEOMESA-3067 Find attribute in Filters with Functions with embedded expressions correctly)
=======
>>>>>>> 70f2c62b7e (GEOMESA-3067 Find attribute in Filters with Functions with embedded expressions correctly)
=======
>>>>>>> 87dddefcd8 (GEOMESA-3067 Find attribute in Filters with Functions with embedded expressions correctly)
=======
=======
>>>>>>> 34472778d3 (Merge branch 'feature/postgis-fixes')
>>>>>>> d581fa3e8f (Merge branch 'feature/postgis-fixes')
=======
>>>>>>> ca1e0fad13 (GEOMESA-3067 Find attribute in Filters with Functions with embedded expressions correctly)
=======
>>>>>>> 42e8565e9b (Merge branch 'feature/postgis-fixes')
>>>>>>> 264c9fa240 (Merge branch 'feature/postgis-fixes')
=======
>>>>>>> f1532f2313 (GEOMESA-3254 Add Bloop build support)
>>>>>>> c738f63bd9 (GEOMESA-3254 Add Bloop build support)
=======
>>>>>>> f1532f2313 (GEOMESA-3254 Add Bloop build support)
=======
=======
=======
>>>>>>> 7acc3ea46 (GEOMESA-3067 Find attribute in Filters with Functions with embedded expressions correctly)
>>>>>>> 7bb5f26c3e (GEOMESA-3067 Find attribute in Filters with Functions with embedded expressions correctly)
>>>>>>> 4bbf97686c (GEOMESA-3067 Find attribute in Filters with Functions with embedded expressions correctly)
<<<<<<< HEAD
>>>>>>> 7213a78a3a (GEOMESA-3067 Find attribute in Filters with Functions with embedded expressions correctly)
=======
=======
>>>>>>> 67de3c3202 (Merge branch 'feature/postgis-fixes')
>>>>>>> 217b7d1cb9 (Merge branch 'feature/postgis-fixes')
  }
}
