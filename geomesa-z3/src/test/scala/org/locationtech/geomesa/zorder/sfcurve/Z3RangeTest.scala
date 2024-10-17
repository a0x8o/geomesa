/***********************************************************************
<<<<<<< HEAD
 * Copyright (c) 2013-2024 Commonwealth Computer Research, Inc.
=======
<<<<<<< HEAD
 * Copyright (c) 2013-2023 Commonwealth Computer Research, Inc.
=======
 * Copyright (c) 2013-2022 Commonwealth Computer Research, Inc.
<<<<<<< HEAD
<<<<<<< HEAD
<<<<<<< HEAD
=======
>>>>>>> e74fa3f690 (GEOMESA-3254 Add Bloop build support)
>>>>>>> 58d14a257e (GEOMESA-3254 Add Bloop build support)
<<<<<<< HEAD
>>>>>>> 1463162d60 (GEOMESA-3254 Add Bloop build support)
=======
=======
>>>>>>> 58d14a257 (GEOMESA-3254 Add Bloop build support)
>>>>>>> fa60953a42 (GEOMESA-3254 Add Bloop build support)
<<<<<<< HEAD
<<<<<<< HEAD
>>>>>>> 9f430502b2 (GEOMESA-3254 Add Bloop build support)
=======
=======
>>>>>>> 58d14a257e (GEOMESA-3254 Add Bloop build support)
>>>>>>> 7564665969 (GEOMESA-3254 Add Bloop build support)
>>>>>>> dce8c58b44 (GEOMESA-3254 Add Bloop build support)
=======
=======
>>>>>>> 58d14a257e (GEOMESA-3254 Add Bloop build support)
>>>>>>> 7564665969 (GEOMESA-3254 Add Bloop build support)
=======
>>>>>>> e74fa3f690 (GEOMESA-3254 Add Bloop build support)
>>>>>>> b727e40f7c (GEOMESA-3254 Add Bloop build support)
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Apache License, Version 2.0
 * which accompanies this distribution and is available at
 * http://www.opensource.org/licenses/apache2.0.php.
 ***********************************************************************/

package org.locationtech.geomesa.zorder.sfcurve

import org.junit.runner.RunWith
import org.specs2.mutable.Specification
import org.specs2.runner.JUnitRunner

@RunWith(classOf[JUnitRunner])
class Z3RangeTest extends Specification {

  val zmin = Z3(2, 2, 0)
  val zmax = Z3(3, 6, 0)
  val range = ZRange(zmin, zmax)

  "Z3Range" should {

    "require ordered min and max" in {
      ZRange(Z3(2, 2, 0), Z3(1, 4, 0)) // should be valid
      ZRange(zmax, zmin) must throwAn[IllegalArgumentException]
    }

    "for uncuttable ranges" in {
      val range = ZRange(zmin, zmin)
      Z3.cut(range, Z3(0, 0, 0).z, inRange = false) must beEmpty
    }

    "for out of range zs" in  {
      val zcut = Z3(5, 1, 0).z
      Z3.cut(range, zcut, inRange = false) mustEqual
        List(ZRange(zmin, Z3(3, 3, 0)), ZRange(Z3(2, 4, 0), zmax))
    }

    "support length" in {
      range.length shouldEqual 130
    }

    "support overlaps" in {
      Z3.overlaps(range, range) must beTrue
      Z3.overlaps(range, ZRange(Z3(3, 0, 0), Z3(3, 2, 0))) must beTrue
      Z3.overlaps(range, ZRange(Z3(0, 0, 0), Z3(2, 2, 0))) must beTrue
      Z3.overlaps(range, ZRange(Z3(1, 6, 0), Z3(4, 6, 0))) must beTrue
      Z3.overlaps(range, ZRange(Z3(2, 0, 0), Z3(3, 1, 0))) must beFalse
      Z3.overlaps(range, ZRange(Z3(4, 6, 0), Z3(6, 7, 0))) must beFalse
    }

    "support contains ranges" in  {
      Z3.contains(range, range) must beTrue
      Z3.contains(range, ZRange(Z3(2, 2, 0), Z3(3, 3, 0))) must beTrue
      Z3.contains(range, ZRange(Z3(3, 5, 0), Z3(3, 6, 0))) must beTrue
      Z3.contains(range, ZRange(Z3(2, 2, 0), Z3(4, 3, 0))) must beFalse
      Z3.contains(range, ZRange(Z3(2, 1, 0), Z3(3, 3, 0))) must beFalse
      Z3.contains(range, ZRange(Z3(2, 1, 0), Z3(3, 7, 0))) must beFalse
    }
  }
}
