/***********************************************************************
 * Copyright (c) 2013-2024 Commonwealth Computer Research, Inc.
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Apache License, Version 2.0
 * which accompanies this distribution and is available at
 * http://www.opensource.org/licenses/apache2.0.php.
 ***********************************************************************/

package org.locationtech.geomesa.convert.avro

import org.junit.runner.RunWith
import org.locationtech.geomesa.convert.EvaluationContext
import org.locationtech.geomesa.convert2.transforms.Expression
import org.specs2.mutable.Specification
import org.specs2.runner.JUnitRunner

@RunWith(classOf[JUnitRunner])
class AvroTransformersTest extends Specification with AvroUtils {

  sequential

  implicit val ctx: EvaluationContext = EvaluationContext.empty

  "Transformers" should {
    "handle Avro records" >> {
      "extract an inner value" >> {
        val exp = Expression("avroPath($0, '/content$type=TObj/kvmap[$k=prop3]/v')")
<<<<<<< HEAD
<<<<<<< HEAD
<<<<<<< HEAD
<<<<<<< HEAD
<<<<<<< HEAD
<<<<<<< HEAD
<<<<<<< HEAD
<<<<<<< HEAD
<<<<<<< HEAD
<<<<<<< HEAD
<<<<<<< HEAD
<<<<<<< HEAD
<<<<<<< HEAD
<<<<<<< HEAD
<<<<<<< HEAD
<<<<<<< HEAD
<<<<<<< HEAD
<<<<<<< HEAD
<<<<<<< HEAD
<<<<<<< HEAD
<<<<<<< HEAD
<<<<<<< HEAD
<<<<<<< HEAD
<<<<<<< HEAD
<<<<<<< HEAD
<<<<<<< HEAD
<<<<<<< HEAD
<<<<<<< HEAD
<<<<<<< HEAD
<<<<<<< HEAD
<<<<<<< HEAD
<<<<<<< HEAD
<<<<<<< HEAD
<<<<<<< HEAD
<<<<<<< HEAD
<<<<<<< HEAD
<<<<<<< HEAD
<<<<<<< HEAD
<<<<<<< HEAD
<<<<<<< HEAD
<<<<<<< HEAD
<<<<<<< HEAD
<<<<<<< HEAD
<<<<<<< HEAD
<<<<<<< HEAD
<<<<<<< HEAD
<<<<<<< HEAD
<<<<<<< HEAD
<<<<<<< HEAD
<<<<<<< HEAD
<<<<<<< HEAD
<<<<<<< HEAD
<<<<<<< HEAD
<<<<<<< HEAD
<<<<<<< HEAD
<<<<<<< HEAD
<<<<<<< HEAD
<<<<<<< HEAD
<<<<<<< HEAD
<<<<<<< HEAD
<<<<<<< HEAD
<<<<<<< HEAD
<<<<<<< HEAD
<<<<<<< HEAD
<<<<<<< HEAD
        exp.apply(Array(decoded)) mustEqual " foo "
<<<<<<< HEAD
=======
<<<<<<< HEAD
=======
        exp.apply(Array(decoded)) mustEqual " foo "
>>>>>>> 1ba2f23b3d (GEOMESA-3071 Move all converter state into evaluation context)
=======
        exp.apply(Array(decoded)) mustEqual " foo "
=======
>>>>>>> b9bdd406e (GEOMESA-3061 Converters - support bytes in Avro top-level union types (#2762))
>>>>>>> a9f01eaaf5 (GEOMESA-3061 Converters - support bytes in Avro top-level union types (#2762))
=======
=======
<<<<<<< HEAD
<<<<<<< HEAD
<<<<<<< HEAD
>>>>>>> f71fa3c0e1 (GEOMESA-3061 Converters - support bytes in Avro top-level union types (#2762))
=======
>>>>>>> 7e68948ac6 (GEOMESA-3061 Converters - support bytes in Avro top-level union types (#2762))
=======
=======
>>>>>>> 67b361c856 (GEOMESA-3061 Converters - support bytes in Avro top-level union types (#2762))
=======
>>>>>>> 149b7a7809 (GEOMESA-3071 Move all converter state into evaluation context)
=======
>>>>>>> d6616d893e (GEOMESA-3061 Converters - support bytes in Avro top-level union types (#2762))
=======
>>>>>>> 5ba418ba6c (GEOMESA-3071 Move all converter state into evaluation context)
=======
<<<<<<< HEAD
>>>>>>> dd5d6434b (GEOMESA-3071 Move all converter state into evaluation context)
<<<<<<< HEAD
>>>>>>> 686339d050 (GEOMESA-3071 Move all converter state into evaluation context)
=======
=======
<<<<<<< HEAD
<<<<<<< HEAD
<<<<<<< HEAD
>>>>>>> f71fa3c0e (GEOMESA-3061 Converters - support bytes in Avro top-level union types (#2762))
<<<<<<< HEAD
>>>>>>> 6eb31fb652 (GEOMESA-3061 Converters - support bytes in Avro top-level union types (#2762))
=======
>>>>>>> 4073c9b173 (GEOMESA-3061 Converters - support bytes in Avro top-level union types (#2762))
=======
=======
<<<<<<< HEAD
>>>>>>> dd5d6434b (GEOMESA-3071 Move all converter state into evaluation context)
<<<<<<< HEAD
>>>>>>> 6289007008 (GEOMESA-3071 Move all converter state into evaluation context)
=======
=======
<<<<<<< HEAD
<<<<<<< HEAD
<<<<<<< HEAD
>>>>>>> f71fa3c0e (GEOMESA-3061 Converters - support bytes in Avro top-level union types (#2762))
>>>>>>> 07a6a5c291 (GEOMESA-3061 Converters - support bytes in Avro top-level union types (#2762))
=======
=======
>>>>>>> 0d80bae0c (GEOMESA-3071 Move all converter state into evaluation context)
<<<<<<< HEAD
>>>>>>> 149b7a7809 (GEOMESA-3071 Move all converter state into evaluation context)
=======
=======
>>>>>>> 7e68948ac (GEOMESA-3061 Converters - support bytes in Avro top-level union types (#2762))
<<<<<<< HEAD
>>>>>>> d6616d893e (GEOMESA-3061 Converters - support bytes in Avro top-level union types (#2762))
=======
=======
>>>>>>> 76618c8da3 (GEOMESA-3061 Converters - support bytes in Avro top-level union types (#2762))
=======
>>>>>>> 8caee74520 (GEOMESA-3071 Move all converter state into evaluation context)
=======
>>>>>>> 61208268cd (GEOMESA-3061 Converters - support bytes in Avro top-level union types (#2762))
=======
>>>>>>> 0166e9455b (GEOMESA-3071 Move all converter state into evaluation context)
=======
>>>>>>> c8a325e13c (GEOMESA-3061 Converters - support bytes in Avro top-level union types (#2762))
=======
>>>>>>> e734e4d064 (GEOMESA-3071 Move all converter state into evaluation context)
=======
>>>>>>> 4f0e2712ab (GEOMESA-3061 Converters - support bytes in Avro top-level union types (#2762))
=======
>>>>>>> d1cf3ad8b5 (GEOMESA-3071 Move all converter state into evaluation context)
=======
>>>>>>> 97ec7d864a (GEOMESA-3061 Converters - support bytes in Avro top-level union types (#2762))
=======
>>>>>>> 25e967804c (GEOMESA-3071 Move all converter state into evaluation context)
=======
>>>>>>> 91bbd30a52 (GEOMESA-3061 Converters - support bytes in Avro top-level union types (#2762))
=======
>>>>>>> a2ac294bf3 (GEOMESA-3071 Move all converter state into evaluation context)
=======
>>>>>>> db8d998aa2 (Merge branch 'feature/postgis-fixes')
=======
>>>>>>> 2c62962643 (GEOMESA-3061 Converters - support bytes in Avro top-level union types (#2762))
=======
>>>>>>> 54cfc0cf1a (GEOMESA-3071 Move all converter state into evaluation context)
=======
>>>>>>> bdbced26d4 (GEOMESA-3061 Converters - support bytes in Avro top-level union types (#2762))
=======
>>>>>>> 02ce9d8126 (GEOMESA-3071 Move all converter state into evaluation context)
=======
>>>>>>> 243797ba3c (GEOMESA-3061 Converters - support bytes in Avro top-level union types (#2762))
=======
>>>>>>> 81b8eb5aeb (GEOMESA-3071 Move all converter state into evaluation context)
=======
>>>>>>> 1b25d7ddb4 (Merge branch 'feature/postgis-fixes')
=======
>>>>>>> 0dbede148d (GEOMESA-3061 Converters - support bytes in Avro top-level union types (#2762))
=======
<<<<<<< HEAD
=======
>>>>>>> 67b361c85 (GEOMESA-3061 Converters - support bytes in Avro top-level union types (#2762))
=======
>>>>>>> 149b7a780 (GEOMESA-3071 Move all converter state into evaluation context)
=======
>>>>>>> d6616d893 (GEOMESA-3061 Converters - support bytes in Avro top-level union types (#2762))
=======
>>>>>>> 5ba418ba6 (GEOMESA-3071 Move all converter state into evaluation context)
=======
<<<<<<< HEAD
>>>>>>> 5ba418ba6 (GEOMESA-3071 Move all converter state into evaluation context)
=======
=======
>>>>>>> 2c62962643 (GEOMESA-3061 Converters - support bytes in Avro top-level union types (#2762))
<<<<<<< HEAD
>>>>>>> dd5d6434b (GEOMESA-3071 Move all converter state into evaluation context)
<<<<<<< HEAD
>>>>>>> 686339d05 (GEOMESA-3071 Move all converter state into evaluation context)
<<<<<<< HEAD
>>>>>>> 5ba418ba6c (GEOMESA-3071 Move all converter state into evaluation context)
=======
=======
=======
<<<<<<< HEAD
>>>>>>> dd5d6434b (GEOMESA-3071 Move all converter state into evaluation context)
>>>>>>> 07a6a5c29 (GEOMESA-3061 Converters - support bytes in Avro top-level union types (#2762))
=======
<<<<<<< HEAD
<<<<<<< HEAD
<<<<<<< HEAD
>>>>>>> f71fa3c0e (GEOMESA-3061 Converters - support bytes in Avro top-level union types (#2762))
<<<<<<< HEAD
<<<<<<< HEAD
>>>>>>> 6eb31fb65 (GEOMESA-3061 Converters - support bytes in Avro top-level union types (#2762))
<<<<<<< HEAD
>>>>>>> 28e2bfa2dc (GEOMESA-3061 Converters - support bytes in Avro top-level union types (#2762))
=======
>>>>>>> 314e6ef1a2 (GEOMESA-3061 Converters - support bytes in Avro top-level union types (#2762))
=======
=======
>>>>>>> dd5d6434b (GEOMESA-3071 Move all converter state into evaluation context)
>>>>>>> 455aae09d3 (GEOMESA-3071 Move all converter state into evaluation context)
        exp.apply(Array(decoded)) mustEqual " foo "
=======
>>>>>>> b9bdd406e (GEOMESA-3061 Converters - support bytes in Avro top-level union types (#2762))
=======
        exp.apply(Array(decoded)) mustEqual " foo "
>>>>>>> 1ba2f23b3 (GEOMESA-3071 Move all converter state into evaluation context)
<<<<<<< HEAD
<<<<<<< HEAD
<<<<<<< HEAD
<<<<<<< HEAD
<<<<<<< HEAD
<<<<<<< HEAD
<<<<<<< HEAD
<<<<<<< HEAD
<<<<<<< HEAD
<<<<<<< HEAD
<<<<<<< HEAD
<<<<<<< HEAD
<<<<<<< HEAD
>>>>>>> dd5d6434b0 (GEOMESA-3071 Move all converter state into evaluation context)
=======
>>>>>>> locationtech-main
=======
>>>>>>> b9bdd406e (GEOMESA-3061 Converters - support bytes in Avro top-level union types (#2762))
>>>>>>> b1c506839 (GEOMESA-3061 Converters - support bytes in Avro top-level union types (#2762))
>>>>>>> f71fa3c0e1 (GEOMESA-3061 Converters - support bytes in Avro top-level union types (#2762))
=======
>>>>>>> 7e68948ac6 (GEOMESA-3061 Converters - support bytes in Avro top-level union types (#2762))
=======
>>>>>>> 686339d050 (GEOMESA-3071 Move all converter state into evaluation context)
=======
>>>>>>> 6eb31fb652 (GEOMESA-3061 Converters - support bytes in Avro top-level union types (#2762))
=======
>>>>>>> 4073c9b173 (GEOMESA-3061 Converters - support bytes in Avro top-level union types (#2762))
=======
>>>>>>> 6289007008 (GEOMESA-3071 Move all converter state into evaluation context)
=======
>>>>>>> 07a6a5c291 (GEOMESA-3061 Converters - support bytes in Avro top-level union types (#2762))
=======
>>>>>>> 149b7a7809 (GEOMESA-3071 Move all converter state into evaluation context)
=======
=======
>>>>>>> 5ba418ba6c (GEOMESA-3071 Move all converter state into evaluation context)
=======
>>>>>>> 28e2bfa2dc (GEOMESA-3061 Converters - support bytes in Avro top-level union types (#2762))
=======
>>>>>>> 7e68948ac (GEOMESA-3061 Converters - support bytes in Avro top-level union types (#2762))
>>>>>>> d6616d893e (GEOMESA-3061 Converters - support bytes in Avro top-level union types (#2762))
=======
>>>>>>> 686339d05 (GEOMESA-3071 Move all converter state into evaluation context)
=======
>>>>>>> 6eb31fb65 (GEOMESA-3061 Converters - support bytes in Avro top-level union types (#2762))
=======
>>>>>>> 314e6ef1a2 (GEOMESA-3061 Converters - support bytes in Avro top-level union types (#2762))
=======
>>>>>>> 455aae09d3 (GEOMESA-3071 Move all converter state into evaluation context)
=======
        exp.apply(Array(decoded)) mustEqual " foo "
=======
>>>>>>> b9bdd406e (GEOMESA-3061 Converters - support bytes in Avro top-level union types (#2762))
<<<<<<< HEAD
<<<<<<< HEAD
<<<<<<< HEAD
>>>>>>> cdb4102515 (GEOMESA-3061 Converters - support bytes in Avro top-level union types (#2762))
=======
        exp.apply(Array(decoded)) mustEqual " foo "
=======
>>>>>>> b9bdd406e (GEOMESA-3061 Converters - support bytes in Avro top-level union types (#2762))
=======
        exp.apply(Array(decoded)) mustEqual " foo "
>>>>>>> 1ba2f23b3 (GEOMESA-3071 Move all converter state into evaluation context)
>>>>>>> 0d80bae0c6 (GEOMESA-3071 Move all converter state into evaluation context)
=======
>>>>>>> a9f01eaaf (GEOMESA-3061 Converters - support bytes in Avro top-level union types (#2762))
<<<<<<< HEAD
<<<<<<< HEAD
<<<<<<< HEAD
<<<<<<< HEAD
<<<<<<< HEAD
>>>>>>> 7e68948ac6 (GEOMESA-3061 Converters - support bytes in Avro top-level union types (#2762))
=======
=======
>>>>>>> d6616d893e (GEOMESA-3061 Converters - support bytes in Avro top-level union types (#2762))
=======
>>>>>>> 5ba418ba6c (GEOMESA-3071 Move all converter state into evaluation context)
=======
>>>>>>> dd5d6434b (GEOMESA-3071 Move all converter state into evaluation context)
<<<<<<< HEAD
<<<<<<< HEAD
>>>>>>> 686339d050 (GEOMESA-3071 Move all converter state into evaluation context)
=======
=======
>>>>>>> 07a6a5c291 (GEOMESA-3061 Converters - support bytes in Avro top-level union types (#2762))
=======
>>>>>>> locationtech-main
=======
>>>>>>> b9bdd406e (GEOMESA-3061 Converters - support bytes in Avro top-level union types (#2762))
>>>>>>> b1c506839 (GEOMESA-3061 Converters - support bytes in Avro top-level union types (#2762))
>>>>>>> f71fa3c0e (GEOMESA-3061 Converters - support bytes in Avro top-level union types (#2762))
<<<<<<< HEAD
<<<<<<< HEAD
<<<<<<< HEAD
>>>>>>> 6eb31fb652 (GEOMESA-3061 Converters - support bytes in Avro top-level union types (#2762))
=======
>>>>>>> 67b361c856 (GEOMESA-3061 Converters - support bytes in Avro top-level union types (#2762))
=======
>>>>>>> 28e2bfa2dc (GEOMESA-3061 Converters - support bytes in Avro top-level union types (#2762))
=======
        exp.apply(Array(decoded)) mustEqual " foo "
=======
>>>>>>> b9bdd406e (GEOMESA-3061 Converters - support bytes in Avro top-level union types (#2762))
<<<<<<< HEAD
>>>>>>> 0e68e9f4cc (GEOMESA-3061 Converters - support bytes in Avro top-level union types (#2762))
=======
        exp.apply(Array(decoded)) mustEqual " foo "
=======
>>>>>>> b9bdd406e (GEOMESA-3061 Converters - support bytes in Avro top-level union types (#2762))
=======
        exp.apply(Array(decoded)) mustEqual " foo "
>>>>>>> 1ba2f23b3 (GEOMESA-3071 Move all converter state into evaluation context)
>>>>>>> f3a49e0825 (GEOMESA-3071 Move all converter state into evaluation context)
=======
>>>>>>> a9f01eaaf (GEOMESA-3061 Converters - support bytes in Avro top-level union types (#2762))
>>>>>>> 4073c9b173 (GEOMESA-3061 Converters - support bytes in Avro top-level union types (#2762))
=======
=======
>>>>>>> dd5d6434b (GEOMESA-3071 Move all converter state into evaluation context)
>>>>>>> 6289007008 (GEOMESA-3071 Move all converter state into evaluation context)
=======
>>>>>>> 07a6a5c291 (GEOMESA-3061 Converters - support bytes in Avro top-level union types (#2762))
=======
>>>>>>> cdb410251 (GEOMESA-3061 Converters - support bytes in Avro top-level union types (#2762))
<<<<<<< HEAD
>>>>>>> 67b361c856 (GEOMESA-3061 Converters - support bytes in Avro top-level union types (#2762))
=======
=======
>>>>>>> 0d80bae0c (GEOMESA-3071 Move all converter state into evaluation context)
<<<<<<< HEAD
>>>>>>> 149b7a7809 (GEOMESA-3071 Move all converter state into evaluation context)
=======
=======
>>>>>>> 7e68948ac (GEOMESA-3061 Converters - support bytes in Avro top-level union types (#2762))
<<<<<<< HEAD
>>>>>>> d6616d893e (GEOMESA-3061 Converters - support bytes in Avro top-level union types (#2762))
=======
=======
>>>>>>> 6ac55e1ef7 (GEOMESA-3071 Move all converter state into evaluation context)
=======
>>>>>>> a910ae135f (GEOMESA-3061 Converters - support bytes in Avro top-level union types (#2762))
=======
>>>>>>> 84bc7e0e2a (GEOMESA-3071 Move all converter state into evaluation context)
=======
>>>>>>> 941104fee8 (GEOMESA-3061 Converters - support bytes in Avro top-level union types (#2762))
=======
>>>>>>> 849693a129 (GEOMESA-3071 Move all converter state into evaluation context)
=======
>>>>>>> ad3cedc4db (GEOMESA-3061 Converters - support bytes in Avro top-level union types (#2762))
=======
>>>>>>> d9a9062a08 (GEOMESA-3071 Move all converter state into evaluation context)
=======
<<<<<<< HEAD
=======
>>>>>>> 67b361c85 (GEOMESA-3061 Converters - support bytes in Avro top-level union types (#2762))
=======
>>>>>>> 149b7a780 (GEOMESA-3071 Move all converter state into evaluation context)
=======
<<<<<<< HEAD
>>>>>>> dd5d6434b (GEOMESA-3071 Move all converter state into evaluation context)
<<<<<<< HEAD
>>>>>>> 686339d05 (GEOMESA-3071 Move all converter state into evaluation context)
<<<<<<< HEAD
<<<<<<< HEAD
<<<<<<< HEAD
>>>>>>> 5ba418ba6c (GEOMESA-3071 Move all converter state into evaluation context)
=======
=======
>>>>>>> 6eb31fb65 (GEOMESA-3061 Converters - support bytes in Avro top-level union types (#2762))
>>>>>>> 28e2bfa2dc (GEOMESA-3061 Converters - support bytes in Avro top-level union types (#2762))
=======
        exp.apply(Array(decoded)) mustEqual " foo "
=======
>>>>>>> b9bdd406e (GEOMESA-3061 Converters - support bytes in Avro top-level union types (#2762))
>>>>>>> b4320946b4 (GEOMESA-3061 Converters - support bytes in Avro top-level union types (#2762))
=======
        exp.apply(Array(decoded)) mustEqual " foo "
=======
>>>>>>> b9bdd406e (GEOMESA-3061 Converters - support bytes in Avro top-level union types (#2762))
=======
        exp.apply(Array(decoded)) mustEqual " foo "
>>>>>>> 1ba2f23b3 (GEOMESA-3071 Move all converter state into evaluation context)
>>>>>>> 0f4c829f25 (GEOMESA-3071 Move all converter state into evaluation context)
=======
>>>>>>> a9f01eaaf (GEOMESA-3061 Converters - support bytes in Avro top-level union types (#2762))
>>>>>>> 314e6ef1a2 (GEOMESA-3061 Converters - support bytes in Avro top-level union types (#2762))
=======
=======
>>>>>>> dd5d6434b (GEOMESA-3071 Move all converter state into evaluation context)
>>>>>>> 455aae09d3 (GEOMESA-3071 Move all converter state into evaluation context)
=======
        exp.apply(Array(decoded)) mustEqual " foo "
>>>>>>> 3be8d2a5a4 (Merge branch 'feature/postgis-fixes')
        exp.eval(Array(decoded)) mustEqual " foo "
>>>>>>> b9bdd406e3 (GEOMESA-3061 Converters - support bytes in Avro top-level union types (#2762))
=======
=======
>>>>>>> 74661c3147 (GEOMESA-3071 Move all converter state into evaluation context)
=======
>>>>>>> 6bd64e6308 (GEOMESA-3061 Converters - support bytes in Avro top-level union types (#2762))
=======
>>>>>>> 55b43ae566 (GEOMESA-3071 Move all converter state into evaluation context)
=======
>>>>>>> 9d708b240a (GEOMESA-3061 Converters - support bytes in Avro top-level union types (#2762))
=======
>>>>>>> cb7d3570f5 (GEOMESA-3071 Move all converter state into evaluation context)
=======
>>>>>>> 9990cd7dc7 (GEOMESA-3061 Converters - support bytes in Avro top-level union types (#2762))
=======
>>>>>>> 6ac55e1ef7 (GEOMESA-3071 Move all converter state into evaluation context)
=======
=======
=======
<<<<<<< HEAD
>>>>>>> dd5d6434b (GEOMESA-3071 Move all converter state into evaluation context)
>>>>>>> 07a6a5c29 (GEOMESA-3061 Converters - support bytes in Avro top-level union types (#2762))
=======
<<<<<<< HEAD
<<<<<<< HEAD
<<<<<<< HEAD
>>>>>>> f71fa3c0e (GEOMESA-3061 Converters - support bytes in Avro top-level union types (#2762))
<<<<<<< HEAD
<<<<<<< HEAD
>>>>>>> 6eb31fb65 (GEOMESA-3061 Converters - support bytes in Avro top-level union types (#2762))
<<<<<<< HEAD
>>>>>>> 5f428db977 (GEOMESA-3061 Converters - support bytes in Avro top-level union types (#2762))
=======
=======
>>>>>>> 07a6a5c29 (GEOMESA-3061 Converters - support bytes in Avro top-level union types (#2762))
<<<<<<< HEAD
<<<<<<< HEAD
>>>>>>> 89bdd3013e (GEOMESA-3061 Converters - support bytes in Avro top-level union types (#2762))
=======
=======
=======
>>>>>>> 0d80bae0c (GEOMESA-3071 Move all converter state into evaluation context)
<<<<<<< HEAD
>>>>>>> 149b7a780 (GEOMESA-3071 Move all converter state into evaluation context)
<<<<<<< HEAD
>>>>>>> e734e4d064 (GEOMESA-3071 Move all converter state into evaluation context)
=======
=======
=======
>>>>>>> 7e68948ac (GEOMESA-3061 Converters - support bytes in Avro top-level union types (#2762))
<<<<<<< HEAD
>>>>>>> d6616d893 (GEOMESA-3061 Converters - support bytes in Avro top-level union types (#2762))
<<<<<<< HEAD
>>>>>>> 4f0e2712ab (GEOMESA-3061 Converters - support bytes in Avro top-level union types (#2762))
=======
=======
=======
=======
<<<<<<< HEAD
>>>>>>> dd5d6434b (GEOMESA-3071 Move all converter state into evaluation context)
<<<<<<< HEAD
>>>>>>> 686339d05 (GEOMESA-3071 Move all converter state into evaluation context)
<<<<<<< HEAD
>>>>>>> 5ba418ba6 (GEOMESA-3071 Move all converter state into evaluation context)
<<<<<<< HEAD
>>>>>>> d1cf3ad8b5 (GEOMESA-3071 Move all converter state into evaluation context)
=======
=======
=======
=======
<<<<<<< HEAD
<<<<<<< HEAD
<<<<<<< HEAD
>>>>>>> f71fa3c0e (GEOMESA-3061 Converters - support bytes in Avro top-level union types (#2762))
>>>>>>> 6eb31fb65 (GEOMESA-3061 Converters - support bytes in Avro top-level union types (#2762))
>>>>>>> 28e2bfa2d (GEOMESA-3061 Converters - support bytes in Avro top-level union types (#2762))
>>>>>>> 72bafaf54b (GEOMESA-3061 Converters - support bytes in Avro top-level union types (#2762))
        exp.apply(Array(decoded)) mustEqual " foo "
=======
<<<<<<< HEAD
=======
        exp.apply(Array(decoded)) mustEqual " foo "
>>>>>>> 1ba2f23b3 (GEOMESA-3071 Move all converter state into evaluation context)
<<<<<<< HEAD
<<<<<<< HEAD
<<<<<<< HEAD
<<<<<<< HEAD
<<<<<<< HEAD
<<<<<<< HEAD
=======
>>>>>>> 7e68948ac (GEOMESA-3061 Converters - support bytes in Avro top-level union types (#2762))
=======
>>>>>>> 686339d05 (GEOMESA-3071 Move all converter state into evaluation context)
=======
>>>>>>> 6eb31fb65 (GEOMESA-3061 Converters - support bytes in Avro top-level union types (#2762))
=======
        exp.apply(Array(decoded)) mustEqual " foo "
=======
>>>>>>> b9bdd406e (GEOMESA-3061 Converters - support bytes in Avro top-level union types (#2762))
>>>>>>> a9f01eaaf (GEOMESA-3061 Converters - support bytes in Avro top-level union types (#2762))
<<<<<<< HEAD
<<<<<<< HEAD
=======
<<<<<<< HEAD
=======
<<<<<<< HEAD
<<<<<<< HEAD
<<<<<<< HEAD
>>>>>>> f71fa3c0e (GEOMESA-3061 Converters - support bytes in Avro top-level union types (#2762))
=======
>>>>>>> 7e68948ac (GEOMESA-3061 Converters - support bytes in Avro top-level union types (#2762))
=======
>>>>>>> 4073c9b17 (GEOMESA-3061 Converters - support bytes in Avro top-level union types (#2762))
=======
=======
>>>>>>> dd5d6434b (GEOMESA-3071 Move all converter state into evaluation context)
<<<<<<< HEAD
>>>>>>> 628900700 (GEOMESA-3071 Move all converter state into evaluation context)
=======
>>>>>>> 314e6ef1a (GEOMESA-3061 Converters - support bytes in Avro top-level union types (#2762))
=======
=======
>>>>>>> dd5d6434b (GEOMESA-3071 Move all converter state into evaluation context)
>>>>>>> 455aae09d (GEOMESA-3071 Move all converter state into evaluation context)
        exp.apply(Array(decoded)) mustEqual " foo "
=======
>>>>>>> b9bdd406e (GEOMESA-3061 Converters - support bytes in Avro top-level union types (#2762))
=======
        exp.apply(Array(decoded)) mustEqual " foo "
>>>>>>> 1ba2f23b3 (GEOMESA-3071 Move all converter state into evaluation context)
<<<<<<< HEAD
<<<<<<< HEAD
<<<<<<< HEAD
<<<<<<< HEAD
<<<<<<< HEAD
<<<<<<< HEAD
>>>>>>> dd5d6434b (GEOMESA-3071 Move all converter state into evaluation context)
=======
>>>>>>> 07a6a5c29 (GEOMESA-3061 Converters - support bytes in Avro top-level union types (#2762))
=======
>>>>>>> locationtech-main
=======
>>>>>>> b9bdd406e (GEOMESA-3061 Converters - support bytes in Avro top-level union types (#2762))
>>>>>>> b1c506839 (GEOMESA-3061 Converters - support bytes in Avro top-level union types (#2762))
>>>>>>> f71fa3c0e (GEOMESA-3061 Converters - support bytes in Avro top-level union types (#2762))
<<<<<<< HEAD
<<<<<<< HEAD
<<<<<<< HEAD
<<<<<<< HEAD
=======
>>>>>>> 7e68948ac (GEOMESA-3061 Converters - support bytes in Avro top-level union types (#2762))
=======
>>>>>>> 4073c9b17 (GEOMESA-3061 Converters - support bytes in Avro top-level union types (#2762))
=======
>>>>>>> 628900700 (GEOMESA-3071 Move all converter state into evaluation context)
=======
>>>>>>> 67b361c85 (GEOMESA-3061 Converters - support bytes in Avro top-level union types (#2762))
=======
>>>>>>> 28e2bfa2d (GEOMESA-3061 Converters - support bytes in Avro top-level union types (#2762))
=======
>>>>>>> 314e6ef1a (GEOMESA-3061 Converters - support bytes in Avro top-level union types (#2762))
=======
>>>>>>> 455aae09d (GEOMESA-3071 Move all converter state into evaluation context)
=======
        exp.apply(Array(decoded)) mustEqual " foo "
=======
>>>>>>> b9bdd406e (GEOMESA-3061 Converters - support bytes in Avro top-level union types (#2762))
<<<<<<< HEAD
<<<<<<< HEAD
<<<<<<< HEAD
<<<<<<< HEAD
>>>>>>> cdb410251 (GEOMESA-3061 Converters - support bytes in Avro top-level union types (#2762))
=======
<<<<<<< HEAD
        exp.apply(Array(decoded)) mustEqual " foo "
=======
>>>>>>> b9bdd406e (GEOMESA-3061 Converters - support bytes in Avro top-level union types (#2762))
=======
        exp.apply(Array(decoded)) mustEqual " foo "
>>>>>>> 1ba2f23b3 (GEOMESA-3071 Move all converter state into evaluation context)
>>>>>>> 0d80bae0c (GEOMESA-3071 Move all converter state into evaluation context)
=======
<<<<<<< HEAD
>>>>>>> a9f01eaaf (GEOMESA-3061 Converters - support bytes in Avro top-level union types (#2762))
<<<<<<< HEAD
<<<<<<< HEAD
>>>>>>> 7e68948ac (GEOMESA-3061 Converters - support bytes in Avro top-level union types (#2762))
=======
<<<<<<< HEAD
>>>>>>> dd5d6434b (GEOMESA-3071 Move all converter state into evaluation context)
>>>>>>> 686339d05 (GEOMESA-3071 Move all converter state into evaluation context)
=======
>>>>>>> 6eb31fb65 (GEOMESA-3061 Converters - support bytes in Avro top-level union types (#2762))
=======
        exp.apply(Array(decoded)) mustEqual " foo "
=======
>>>>>>> b9bdd406e (GEOMESA-3061 Converters - support bytes in Avro top-level union types (#2762))
>>>>>>> 0e68e9f4c (GEOMESA-3061 Converters - support bytes in Avro top-level union types (#2762))
=======
        exp.apply(Array(decoded)) mustEqual " foo "
=======
>>>>>>> b9bdd406e (GEOMESA-3061 Converters - support bytes in Avro top-level union types (#2762))
=======
        exp.apply(Array(decoded)) mustEqual " foo "
>>>>>>> 1ba2f23b3 (GEOMESA-3071 Move all converter state into evaluation context)
>>>>>>> f3a49e082 (GEOMESA-3071 Move all converter state into evaluation context)
=======
>>>>>>> a9f01eaaf (GEOMESA-3061 Converters - support bytes in Avro top-level union types (#2762))
>>>>>>> 4073c9b17 (GEOMESA-3061 Converters - support bytes in Avro top-level union types (#2762))
=======
=======
>>>>>>> dd5d6434b (GEOMESA-3071 Move all converter state into evaluation context)
>>>>>>> 628900700 (GEOMESA-3071 Move all converter state into evaluation context)
=======
>>>>>>> 07a6a5c29 (GEOMESA-3061 Converters - support bytes in Avro top-level union types (#2762))
=======
>>>>>>> cdb410251 (GEOMESA-3061 Converters - support bytes in Avro top-level union types (#2762))
>>>>>>> 67b361c85 (GEOMESA-3061 Converters - support bytes in Avro top-level union types (#2762))
=======
>>>>>>> 0d80bae0c (GEOMESA-3071 Move all converter state into evaluation context)
>>>>>>> 149b7a780 (GEOMESA-3071 Move all converter state into evaluation context)
=======
>>>>>>> 7e68948ac (GEOMESA-3061 Converters - support bytes in Avro top-level union types (#2762))
>>>>>>> d6616d893 (GEOMESA-3061 Converters - support bytes in Avro top-level union types (#2762))
=======
>>>>>>> f7f5195405 (GEOMESA-3071 Move all converter state into evaluation context)
=======
=======
<<<<<<< HEAD
>>>>>>> dd5d6434b (GEOMESA-3071 Move all converter state into evaluation context)
<<<<<<< HEAD
>>>>>>> 686339d05 (GEOMESA-3071 Move all converter state into evaluation context)
<<<<<<< HEAD
<<<<<<< HEAD
<<<<<<< HEAD
>>>>>>> 5ba418ba6 (GEOMESA-3071 Move all converter state into evaluation context)
=======
=======
>>>>>>> 6eb31fb65 (GEOMESA-3061 Converters - support bytes in Avro top-level union types (#2762))
>>>>>>> 28e2bfa2d (GEOMESA-3061 Converters - support bytes in Avro top-level union types (#2762))
=======
        exp.apply(Array(decoded)) mustEqual " foo "
=======
>>>>>>> b9bdd406e (GEOMESA-3061 Converters - support bytes in Avro top-level union types (#2762))
>>>>>>> b4320946b (GEOMESA-3061 Converters - support bytes in Avro top-level union types (#2762))
=======
        exp.apply(Array(decoded)) mustEqual " foo "
=======
>>>>>>> b9bdd406e (GEOMESA-3061 Converters - support bytes in Avro top-level union types (#2762))
=======
        exp.apply(Array(decoded)) mustEqual " foo "
>>>>>>> 1ba2f23b3 (GEOMESA-3071 Move all converter state into evaluation context)
>>>>>>> 0f4c829f2 (GEOMESA-3071 Move all converter state into evaluation context)
=======
>>>>>>> a9f01eaaf (GEOMESA-3061 Converters - support bytes in Avro top-level union types (#2762))
>>>>>>> 314e6ef1a (GEOMESA-3061 Converters - support bytes in Avro top-level union types (#2762))
=======
=======
>>>>>>> dd5d6434b (GEOMESA-3071 Move all converter state into evaluation context)
>>>>>>> 455aae09d (GEOMESA-3071 Move all converter state into evaluation context)
=======
        exp.apply(Array(decoded)) mustEqual " foo "
>>>>>>> 3be8d2a5a (Merge branch 'feature/postgis-fixes')
        exp.eval(Array(decoded)) mustEqual " foo "
>>>>>>> b9bdd406e (GEOMESA-3061 Converters - support bytes in Avro top-level union types (#2762))
>>>>>>> d9ed077cd1 (GEOMESA-3061 Converters - support bytes in Avro top-level union types (#2762))
=======
        exp.apply(Array(decoded)) mustEqual " foo "
>>>>>>> d845d7c1bd (GEOMESA-3254 Add Bloop build support)
=======
>>>>>>> 58d14a257e (GEOMESA-3254 Add Bloop build support)
=======
=======
>>>>>>> b17adcecc4 (GEOMESA-3071 Move all converter state into evaluation context)
=======
>>>>>>> 3c071a6b3e (GEOMESA-3061 Converters - support bytes in Avro top-level union types (#2762))
=======
>>>>>>> eccc16ddf9 (GEOMESA-3071 Move all converter state into evaluation context)
=======
>>>>>>> e6e1f4bdd5 (GEOMESA-3061 Converters - support bytes in Avro top-level union types (#2762))
=======
>>>>>>> 71edb3b56e (GEOMESA-3071 Move all converter state into evaluation context)
=======
>>>>>>> 10910a4865 (GEOMESA-3061 Converters - support bytes in Avro top-level union types (#2762))
=======
>>>>>>> f7f5195405 (GEOMESA-3071 Move all converter state into evaluation context)
=======
=======
=======
<<<<<<< HEAD
<<<<<<< HEAD
<<<<<<< HEAD
>>>>>>> f71fa3c0e (GEOMESA-3061 Converters - support bytes in Avro top-level union types (#2762))
>>>>>>> 6eb31fb65 (GEOMESA-3061 Converters - support bytes in Avro top-level union types (#2762))
>>>>>>> 23c0241798 (GEOMESA-3061 Converters - support bytes in Avro top-level union types (#2762))
=======
=======
>>>>>>> 07a6a5c29 (GEOMESA-3061 Converters - support bytes in Avro top-level union types (#2762))
>>>>>>> 85663f71c4 (GEOMESA-3061 Converters - support bytes in Avro top-level union types (#2762))
=======
=======
=======
>>>>>>> 0d80bae0c (GEOMESA-3071 Move all converter state into evaluation context)
<<<<<<< HEAD
>>>>>>> 149b7a780 (GEOMESA-3071 Move all converter state into evaluation context)
<<<<<<< HEAD
>>>>>>> d9a9062a08 (GEOMESA-3071 Move all converter state into evaluation context)
=======
=======
=======
>>>>>>> 7e68948ac (GEOMESA-3061 Converters - support bytes in Avro top-level union types (#2762))
<<<<<<< HEAD
>>>>>>> d6616d893 (GEOMESA-3061 Converters - support bytes in Avro top-level union types (#2762))
<<<<<<< HEAD
>>>>>>> 2c62962643 (GEOMESA-3061 Converters - support bytes in Avro top-level union types (#2762))
=======
=======
=======
=======
<<<<<<< HEAD
>>>>>>> dd5d6434b (GEOMESA-3071 Move all converter state into evaluation context)
<<<<<<< HEAD
>>>>>>> 686339d05 (GEOMESA-3071 Move all converter state into evaluation context)
<<<<<<< HEAD
>>>>>>> 5ba418ba6 (GEOMESA-3071 Move all converter state into evaluation context)
<<<<<<< HEAD
>>>>>>> 54cfc0cf1a (GEOMESA-3071 Move all converter state into evaluation context)
=======
=======
=======
=======
<<<<<<< HEAD
<<<<<<< HEAD
<<<<<<< HEAD
>>>>>>> f71fa3c0e (GEOMESA-3061 Converters - support bytes in Avro top-level union types (#2762))
>>>>>>> 6eb31fb65 (GEOMESA-3061 Converters - support bytes in Avro top-level union types (#2762))
>>>>>>> 28e2bfa2d (GEOMESA-3061 Converters - support bytes in Avro top-level union types (#2762))
>>>>>>> d4c5768cfa (GEOMESA-3061 Converters - support bytes in Avro top-level union types (#2762))
        exp.apply(Array(decoded)) mustEqual " foo "
=======
<<<<<<< HEAD
=======
        exp.apply(Array(decoded)) mustEqual " foo "
>>>>>>> 1ba2f23b3 (GEOMESA-3071 Move all converter state into evaluation context)
<<<<<<< HEAD
<<<<<<< HEAD
<<<<<<< HEAD
<<<<<<< HEAD
<<<<<<< HEAD
<<<<<<< HEAD
=======
>>>>>>> 7e68948ac (GEOMESA-3061 Converters - support bytes in Avro top-level union types (#2762))
=======
>>>>>>> 686339d05 (GEOMESA-3071 Move all converter state into evaluation context)
=======
>>>>>>> 6eb31fb65 (GEOMESA-3061 Converters - support bytes in Avro top-level union types (#2762))
=======
        exp.apply(Array(decoded)) mustEqual " foo "
=======
>>>>>>> b9bdd406e (GEOMESA-3061 Converters - support bytes in Avro top-level union types (#2762))
>>>>>>> a9f01eaaf (GEOMESA-3061 Converters - support bytes in Avro top-level union types (#2762))
<<<<<<< HEAD
<<<<<<< HEAD
=======
<<<<<<< HEAD
=======
<<<<<<< HEAD
<<<<<<< HEAD
<<<<<<< HEAD
>>>>>>> f71fa3c0e (GEOMESA-3061 Converters - support bytes in Avro top-level union types (#2762))
=======
>>>>>>> 7e68948ac (GEOMESA-3061 Converters - support bytes in Avro top-level union types (#2762))
=======
>>>>>>> 4073c9b17 (GEOMESA-3061 Converters - support bytes in Avro top-level union types (#2762))
=======
=======
>>>>>>> dd5d6434b (GEOMESA-3071 Move all converter state into evaluation context)
<<<<<<< HEAD
>>>>>>> 628900700 (GEOMESA-3071 Move all converter state into evaluation context)
=======
>>>>>>> 314e6ef1a (GEOMESA-3061 Converters - support bytes in Avro top-level union types (#2762))
=======
=======
>>>>>>> dd5d6434b (GEOMESA-3071 Move all converter state into evaluation context)
>>>>>>> 455aae09d (GEOMESA-3071 Move all converter state into evaluation context)
        exp.apply(Array(decoded)) mustEqual " foo "
=======
>>>>>>> b9bdd406e (GEOMESA-3061 Converters - support bytes in Avro top-level union types (#2762))
=======
        exp.apply(Array(decoded)) mustEqual " foo "
>>>>>>> 1ba2f23b3 (GEOMESA-3071 Move all converter state into evaluation context)
<<<<<<< HEAD
<<<<<<< HEAD
<<<<<<< HEAD
<<<<<<< HEAD
<<<<<<< HEAD
<<<<<<< HEAD
>>>>>>> dd5d6434b (GEOMESA-3071 Move all converter state into evaluation context)
=======
>>>>>>> 07a6a5c29 (GEOMESA-3061 Converters - support bytes in Avro top-level union types (#2762))
=======
>>>>>>> locationtech-main
=======
>>>>>>> b9bdd406e (GEOMESA-3061 Converters - support bytes in Avro top-level union types (#2762))
>>>>>>> b1c506839 (GEOMESA-3061 Converters - support bytes in Avro top-level union types (#2762))
>>>>>>> f71fa3c0e (GEOMESA-3061 Converters - support bytes in Avro top-level union types (#2762))
<<<<<<< HEAD
<<<<<<< HEAD
<<<<<<< HEAD
<<<<<<< HEAD
=======
>>>>>>> 7e68948ac (GEOMESA-3061 Converters - support bytes in Avro top-level union types (#2762))
=======
>>>>>>> 4073c9b17 (GEOMESA-3061 Converters - support bytes in Avro top-level union types (#2762))
=======
>>>>>>> 628900700 (GEOMESA-3071 Move all converter state into evaluation context)
=======
>>>>>>> 67b361c85 (GEOMESA-3061 Converters - support bytes in Avro top-level union types (#2762))
=======
>>>>>>> 28e2bfa2d (GEOMESA-3061 Converters - support bytes in Avro top-level union types (#2762))
=======
>>>>>>> 314e6ef1a (GEOMESA-3061 Converters - support bytes in Avro top-level union types (#2762))
=======
>>>>>>> 455aae09d (GEOMESA-3071 Move all converter state into evaluation context)
=======
        exp.apply(Array(decoded)) mustEqual " foo "
=======
>>>>>>> b9bdd406e (GEOMESA-3061 Converters - support bytes in Avro top-level union types (#2762))
<<<<<<< HEAD
<<<<<<< HEAD
<<<<<<< HEAD
<<<<<<< HEAD
>>>>>>> cdb410251 (GEOMESA-3061 Converters - support bytes in Avro top-level union types (#2762))
=======
<<<<<<< HEAD
        exp.apply(Array(decoded)) mustEqual " foo "
=======
>>>>>>> b9bdd406e (GEOMESA-3061 Converters - support bytes in Avro top-level union types (#2762))
=======
        exp.apply(Array(decoded)) mustEqual " foo "
>>>>>>> 1ba2f23b3 (GEOMESA-3071 Move all converter state into evaluation context)
>>>>>>> 0d80bae0c (GEOMESA-3071 Move all converter state into evaluation context)
=======
<<<<<<< HEAD
>>>>>>> a9f01eaaf (GEOMESA-3061 Converters - support bytes in Avro top-level union types (#2762))
<<<<<<< HEAD
<<<<<<< HEAD
>>>>>>> 7e68948ac (GEOMESA-3061 Converters - support bytes in Avro top-level union types (#2762))
=======
<<<<<<< HEAD
>>>>>>> dd5d6434b (GEOMESA-3071 Move all converter state into evaluation context)
>>>>>>> 686339d05 (GEOMESA-3071 Move all converter state into evaluation context)
=======
>>>>>>> 6eb31fb65 (GEOMESA-3061 Converters - support bytes in Avro top-level union types (#2762))
=======
        exp.apply(Array(decoded)) mustEqual " foo "
=======
>>>>>>> b9bdd406e (GEOMESA-3061 Converters - support bytes in Avro top-level union types (#2762))
>>>>>>> 0e68e9f4c (GEOMESA-3061 Converters - support bytes in Avro top-level union types (#2762))
=======
        exp.apply(Array(decoded)) mustEqual " foo "
=======
>>>>>>> b9bdd406e (GEOMESA-3061 Converters - support bytes in Avro top-level union types (#2762))
=======
        exp.apply(Array(decoded)) mustEqual " foo "
>>>>>>> 1ba2f23b3 (GEOMESA-3071 Move all converter state into evaluation context)
>>>>>>> f3a49e082 (GEOMESA-3071 Move all converter state into evaluation context)
=======
>>>>>>> a9f01eaaf (GEOMESA-3061 Converters - support bytes in Avro top-level union types (#2762))
>>>>>>> 4073c9b17 (GEOMESA-3061 Converters - support bytes in Avro top-level union types (#2762))
=======
=======
>>>>>>> dd5d6434b (GEOMESA-3071 Move all converter state into evaluation context)
>>>>>>> 628900700 (GEOMESA-3071 Move all converter state into evaluation context)
=======
>>>>>>> 07a6a5c29 (GEOMESA-3061 Converters - support bytes in Avro top-level union types (#2762))
=======
>>>>>>> cdb410251 (GEOMESA-3061 Converters - support bytes in Avro top-level union types (#2762))
>>>>>>> 67b361c85 (GEOMESA-3061 Converters - support bytes in Avro top-level union types (#2762))
=======
>>>>>>> 0d80bae0c (GEOMESA-3071 Move all converter state into evaluation context)
>>>>>>> 149b7a780 (GEOMESA-3071 Move all converter state into evaluation context)
=======
>>>>>>> 7e68948ac (GEOMESA-3061 Converters - support bytes in Avro top-level union types (#2762))
>>>>>>> d6616d893 (GEOMESA-3061 Converters - support bytes in Avro top-level union types (#2762))
=======
=======
>>>>>>> dd5d6434b (GEOMESA-3071 Move all converter state into evaluation context)
>>>>>>> 686339d05 (GEOMESA-3071 Move all converter state into evaluation context)
<<<<<<< HEAD
>>>>>>> 5ba418ba6 (GEOMESA-3071 Move all converter state into evaluation context)
=======
=======
>>>>>>> 6eb31fb65 (GEOMESA-3061 Converters - support bytes in Avro top-level union types (#2762))
>>>>>>> 28e2bfa2d (GEOMESA-3061 Converters - support bytes in Avro top-level union types (#2762))
=======
        exp.apply(Array(decoded)) mustEqual " foo "
=======
>>>>>>> b9bdd406e (GEOMESA-3061 Converters - support bytes in Avro top-level union types (#2762))
>>>>>>> b4320946b (GEOMESA-3061 Converters - support bytes in Avro top-level union types (#2762))
=======
        exp.apply(Array(decoded)) mustEqual " foo "
=======
>>>>>>> b9bdd406e (GEOMESA-3061 Converters - support bytes in Avro top-level union types (#2762))
=======
        exp.apply(Array(decoded)) mustEqual " foo "
>>>>>>> 1ba2f23b3 (GEOMESA-3071 Move all converter state into evaluation context)
>>>>>>> 0f4c829f2 (GEOMESA-3071 Move all converter state into evaluation context)
=======
>>>>>>> a9f01eaaf (GEOMESA-3061 Converters - support bytes in Avro top-level union types (#2762))
>>>>>>> 314e6ef1a (GEOMESA-3061 Converters - support bytes in Avro top-level union types (#2762))
=======
=======
>>>>>>> dd5d6434b (GEOMESA-3071 Move all converter state into evaluation context)
>>>>>>> 455aae09d (GEOMESA-3071 Move all converter state into evaluation context)
=======
        exp.apply(Array(decoded)) mustEqual " foo "
>>>>>>> 3be8d2a5a (Merge branch 'feature/postgis-fixes')
=======
        exp.apply(Array(decoded)) mustEqual " foo "
=======
>>>>>>> 87bf55340 (GEOMESA-3061 Converters - support bytes in Avro top-level union types (#2762))
        exp.eval(Array(decoded)) mustEqual " foo "
>>>>>>> b9bdd406e (GEOMESA-3061 Converters - support bytes in Avro top-level union types (#2762))
>>>>>>> 6d9a5b626c (GEOMESA-3061 Converters - support bytes in Avro top-level union types (#2762))
      }

      "handle compound expressions" >> {
        val exp = Expression("trim(avroPath($0, '/content$type=TObj/kvmap[$k=prop3]/v'))")
<<<<<<< HEAD
<<<<<<< HEAD
<<<<<<< HEAD
<<<<<<< HEAD
<<<<<<< HEAD
<<<<<<< HEAD
<<<<<<< HEAD
<<<<<<< HEAD
<<<<<<< HEAD
<<<<<<< HEAD
<<<<<<< HEAD
<<<<<<< HEAD
<<<<<<< HEAD
<<<<<<< HEAD
<<<<<<< HEAD
<<<<<<< HEAD
<<<<<<< HEAD
<<<<<<< HEAD
<<<<<<< HEAD
<<<<<<< HEAD
<<<<<<< HEAD
<<<<<<< HEAD
<<<<<<< HEAD
<<<<<<< HEAD
<<<<<<< HEAD
<<<<<<< HEAD
<<<<<<< HEAD
<<<<<<< HEAD
<<<<<<< HEAD
<<<<<<< HEAD
<<<<<<< HEAD
<<<<<<< HEAD
<<<<<<< HEAD
<<<<<<< HEAD
<<<<<<< HEAD
<<<<<<< HEAD
<<<<<<< HEAD
<<<<<<< HEAD
<<<<<<< HEAD
<<<<<<< HEAD
<<<<<<< HEAD
<<<<<<< HEAD
<<<<<<< HEAD
<<<<<<< HEAD
<<<<<<< HEAD
<<<<<<< HEAD
<<<<<<< HEAD
<<<<<<< HEAD
<<<<<<< HEAD
<<<<<<< HEAD
<<<<<<< HEAD
<<<<<<< HEAD
<<<<<<< HEAD
<<<<<<< HEAD
<<<<<<< HEAD
<<<<<<< HEAD
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
>>>>>>> d9ed077cd1 (GEOMESA-3061 Converters - support bytes in Avro top-level union types (#2762))
=======
>>>>>>> 74661c3147 (GEOMESA-3071 Move all converter state into evaluation context)
=======
>>>>>>> 6bd64e6308 (GEOMESA-3061 Converters - support bytes in Avro top-level union types (#2762))
=======
>>>>>>> 55b43ae566 (GEOMESA-3071 Move all converter state into evaluation context)
=======
>>>>>>> 9d708b240a (GEOMESA-3061 Converters - support bytes in Avro top-level union types (#2762))
=======
>>>>>>> cb7d3570f5 (GEOMESA-3071 Move all converter state into evaluation context)
=======
>>>>>>> 9990cd7dc7 (GEOMESA-3061 Converters - support bytes in Avro top-level union types (#2762))
=======
=======
>>>>>>> 76618c8da3 (GEOMESA-3061 Converters - support bytes in Avro top-level union types (#2762))
=======
>>>>>>> 8caee74520 (GEOMESA-3071 Move all converter state into evaluation context)
=======
>>>>>>> 61208268cd (GEOMESA-3061 Converters - support bytes in Avro top-level union types (#2762))
=======
>>>>>>> 0166e9455b (GEOMESA-3071 Move all converter state into evaluation context)
=======
>>>>>>> c8a325e13c (GEOMESA-3061 Converters - support bytes in Avro top-level union types (#2762))
=======
>>>>>>> e734e4d064 (GEOMESA-3071 Move all converter state into evaluation context)
=======
>>>>>>> 4f0e2712ab (GEOMESA-3061 Converters - support bytes in Avro top-level union types (#2762))
=======
>>>>>>> d1cf3ad8b5 (GEOMESA-3071 Move all converter state into evaluation context)
=======
>>>>>>> 97ec7d864a (GEOMESA-3061 Converters - support bytes in Avro top-level union types (#2762))
=======
>>>>>>> 25e967804c (GEOMESA-3071 Move all converter state into evaluation context)
=======
>>>>>>> 91bbd30a52 (GEOMESA-3061 Converters - support bytes in Avro top-level union types (#2762))
=======
>>>>>>> a2ac294bf3 (GEOMESA-3071 Move all converter state into evaluation context)
=======
>>>>>>> db8d998aa2 (Merge branch 'feature/postgis-fixes')
=======
>>>>>>> bdbced26d4 (GEOMESA-3061 Converters - support bytes in Avro top-level union types (#2762))
=======
>>>>>>> 02ce9d8126 (GEOMESA-3071 Move all converter state into evaluation context)
=======
>>>>>>> 243797ba3c (GEOMESA-3061 Converters - support bytes in Avro top-level union types (#2762))
=======
>>>>>>> 81b8eb5aeb (GEOMESA-3071 Move all converter state into evaluation context)
=======
>>>>>>> 1b25d7ddb4 (Merge branch 'feature/postgis-fixes')
=======
>>>>>>> 0dbede148d (GEOMESA-3061 Converters - support bytes in Avro top-level union types (#2762))
=======
=======
>>>>>>> 67b361c85 (GEOMESA-3061 Converters - support bytes in Avro top-level union types (#2762))
=======
>>>>>>> 149b7a780 (GEOMESA-3071 Move all converter state into evaluation context)
=======
>>>>>>> d6616d893 (GEOMESA-3061 Converters - support bytes in Avro top-level union types (#2762))
=======
>>>>>>> 5ba418ba6 (GEOMESA-3071 Move all converter state into evaluation context)
=======
<<<<<<< HEAD
>>>>>>> dd5d6434b (GEOMESA-3071 Move all converter state into evaluation context)
<<<<<<< HEAD
>>>>>>> 686339d05 (GEOMESA-3071 Move all converter state into evaluation context)
<<<<<<< HEAD
>>>>>>> 6ac55e1ef7 (GEOMESA-3071 Move all converter state into evaluation context)
=======
=======
=======
<<<<<<< HEAD
<<<<<<< HEAD
<<<<<<< HEAD
>>>>>>> f71fa3c0e (GEOMESA-3061 Converters - support bytes in Avro top-level union types (#2762))
<<<<<<< HEAD
>>>>>>> 6eb31fb65 (GEOMESA-3061 Converters - support bytes in Avro top-level union types (#2762))
<<<<<<< HEAD
>>>>>>> 5f428db977 (GEOMESA-3061 Converters - support bytes in Avro top-level union types (#2762))
=======
=======
=======
>>>>>>> 0d80bae0c (GEOMESA-3071 Move all converter state into evaluation context)
<<<<<<< HEAD
>>>>>>> 149b7a780 (GEOMESA-3071 Move all converter state into evaluation context)
<<<<<<< HEAD
>>>>>>> e734e4d064 (GEOMESA-3071 Move all converter state into evaluation context)
=======
=======
=======
>>>>>>> 7e68948ac (GEOMESA-3061 Converters - support bytes in Avro top-level union types (#2762))
<<<<<<< HEAD
>>>>>>> d6616d893 (GEOMESA-3061 Converters - support bytes in Avro top-level union types (#2762))
<<<<<<< HEAD
>>>>>>> 4f0e2712ab (GEOMESA-3061 Converters - support bytes in Avro top-level union types (#2762))
=======
=======
=======
>>>>>>> a910ae135f (GEOMESA-3061 Converters - support bytes in Avro top-level union types (#2762))
=======
>>>>>>> 84bc7e0e2a (GEOMESA-3071 Move all converter state into evaluation context)
=======
>>>>>>> 941104fee8 (GEOMESA-3061 Converters - support bytes in Avro top-level union types (#2762))
=======
>>>>>>> 849693a129 (GEOMESA-3071 Move all converter state into evaluation context)
=======
>>>>>>> ad3cedc4db (GEOMESA-3061 Converters - support bytes in Avro top-level union types (#2762))
=======
>>>>>>> d9a9062a08 (GEOMESA-3071 Move all converter state into evaluation context)
=======
>>>>>>> 2c62962643 (GEOMESA-3061 Converters - support bytes in Avro top-level union types (#2762))
=======
>>>>>>> 54cfc0cf1a (GEOMESA-3071 Move all converter state into evaluation context)
=======
=======
>>>>>>> 67b361c85 (GEOMESA-3061 Converters - support bytes in Avro top-level union types (#2762))
=======
>>>>>>> 149b7a780 (GEOMESA-3071 Move all converter state into evaluation context)
=======
>>>>>>> d6616d893 (GEOMESA-3061 Converters - support bytes in Avro top-level union types (#2762))
=======
>>>>>>> 5ba418ba6 (GEOMESA-3071 Move all converter state into evaluation context)
=======
<<<<<<< HEAD
>>>>>>> dd5d6434b (GEOMESA-3071 Move all converter state into evaluation context)
<<<<<<< HEAD
>>>>>>> 686339d05 (GEOMESA-3071 Move all converter state into evaluation context)
<<<<<<< HEAD
>>>>>>> 5ba418ba6 (GEOMESA-3071 Move all converter state into evaluation context)
<<<<<<< HEAD
>>>>>>> d1cf3ad8b5 (GEOMESA-3071 Move all converter state into evaluation context)
=======
=======
=======
=======
<<<<<<< HEAD
<<<<<<< HEAD
<<<<<<< HEAD
>>>>>>> f71fa3c0e (GEOMESA-3061 Converters - support bytes in Avro top-level union types (#2762))
<<<<<<< HEAD
>>>>>>> 6eb31fb65 (GEOMESA-3061 Converters - support bytes in Avro top-level union types (#2762))
<<<<<<< HEAD
>>>>>>> 28e2bfa2d (GEOMESA-3061 Converters - support bytes in Avro top-level union types (#2762))
>>>>>>> 72bafaf54b (GEOMESA-3061 Converters - support bytes in Avro top-level union types (#2762))
=======
>>>>>>> d845d7c1bd (GEOMESA-3254 Add Bloop build support)
=======
>>>>>>> 6d9a5b626c (GEOMESA-3061 Converters - support bytes in Avro top-level union types (#2762))
=======
>>>>>>> b17adcecc4 (GEOMESA-3071 Move all converter state into evaluation context)
=======
>>>>>>> 3c071a6b3e (GEOMESA-3061 Converters - support bytes in Avro top-level union types (#2762))
=======
>>>>>>> eccc16ddf9 (GEOMESA-3071 Move all converter state into evaluation context)
=======
>>>>>>> e6e1f4bdd5 (GEOMESA-3061 Converters - support bytes in Avro top-level union types (#2762))
=======
>>>>>>> 71edb3b56e (GEOMESA-3071 Move all converter state into evaluation context)
=======
>>>>>>> 10910a4865 (GEOMESA-3061 Converters - support bytes in Avro top-level union types (#2762))
=======
=======
=======
<<<<<<< HEAD
>>>>>>> dd5d6434b (GEOMESA-3071 Move all converter state into evaluation context)
<<<<<<< HEAD
>>>>>>> 686339d05 (GEOMESA-3071 Move all converter state into evaluation context)
<<<<<<< HEAD
>>>>>>> f7f5195405 (GEOMESA-3071 Move all converter state into evaluation context)
=======
=======
=======
<<<<<<< HEAD
<<<<<<< HEAD
<<<<<<< HEAD
>>>>>>> f71fa3c0e (GEOMESA-3061 Converters - support bytes in Avro top-level union types (#2762))
>>>>>>> 6eb31fb65 (GEOMESA-3061 Converters - support bytes in Avro top-level union types (#2762))
>>>>>>> 23c0241798 (GEOMESA-3061 Converters - support bytes in Avro top-level union types (#2762))
=======
=======
=======
>>>>>>> 0d80bae0c (GEOMESA-3071 Move all converter state into evaluation context)
<<<<<<< HEAD
>>>>>>> 149b7a780 (GEOMESA-3071 Move all converter state into evaluation context)
<<<<<<< HEAD
>>>>>>> d9a9062a08 (GEOMESA-3071 Move all converter state into evaluation context)
=======
=======
=======
>>>>>>> 7e68948ac (GEOMESA-3061 Converters - support bytes in Avro top-level union types (#2762))
<<<<<<< HEAD
>>>>>>> d6616d893 (GEOMESA-3061 Converters - support bytes in Avro top-level union types (#2762))
<<<<<<< HEAD
>>>>>>> 2c62962643 (GEOMESA-3061 Converters - support bytes in Avro top-level union types (#2762))
=======
=======
=======
=======
<<<<<<< HEAD
>>>>>>> dd5d6434b (GEOMESA-3071 Move all converter state into evaluation context)
<<<<<<< HEAD
>>>>>>> 686339d05 (GEOMESA-3071 Move all converter state into evaluation context)
<<<<<<< HEAD
>>>>>>> 5ba418ba6 (GEOMESA-3071 Move all converter state into evaluation context)
<<<<<<< HEAD
>>>>>>> 54cfc0cf1a (GEOMESA-3071 Move all converter state into evaluation context)
=======
=======
=======
=======
<<<<<<< HEAD
<<<<<<< HEAD
<<<<<<< HEAD
>>>>>>> f71fa3c0e (GEOMESA-3061 Converters - support bytes in Avro top-level union types (#2762))
>>>>>>> 6eb31fb65 (GEOMESA-3061 Converters - support bytes in Avro top-level union types (#2762))
>>>>>>> 28e2bfa2d (GEOMESA-3061 Converters - support bytes in Avro top-level union types (#2762))
<<<<<<< HEAD
>>>>>>> d4c5768cfa (GEOMESA-3061 Converters - support bytes in Avro top-level union types (#2762))
=======
=======
>>>>>>> 87bf55340 (GEOMESA-3061 Converters - support bytes in Avro top-level union types (#2762))
>>>>>>> 0dbede148d (GEOMESA-3061 Converters - support bytes in Avro top-level union types (#2762))
        exp.apply(Array(decoded)) mustEqual "foo"
<<<<<<< HEAD
      }

      "handle null values" >> {
        Expression("avroBinaryList(avroPath($0, '/content$type=TObj/foo'))").apply(Array(decoded)) must beNull
        Expression("avroBinaryMap(avroPath($0, '/content$type=TObj/foo'))").apply(Array(decoded)) must beNull
        Expression("avroBinaryUuid(avroPath($0, '/content$type=TObj/foo'))").apply(Array(decoded)) must beNull
<<<<<<< HEAD
<<<<<<< HEAD
=======
<<<<<<< HEAD
<<<<<<< HEAD
=======
        exp.apply(Array(decoded)) mustEqual "foo"
<<<<<<< HEAD
>>>>>>> 1ba2f23b3d (GEOMESA-3071 Move all converter state into evaluation context)
=======
>>>>>>> 1ba2f23b3 (GEOMESA-3071 Move all converter state into evaluation context)
<<<<<<< HEAD
<<<<<<< HEAD
<<<<<<< HEAD
<<<<<<< HEAD
<<<<<<< HEAD
<<<<<<< HEAD
>>>>>>> 6ac55e1ef7 (GEOMESA-3071 Move all converter state into evaluation context)
=======
<<<<<<< HEAD
>>>>>>> 5f428db977 (GEOMESA-3061 Converters - support bytes in Avro top-level union types (#2762))
=======
<<<<<<< HEAD
>>>>>>> e734e4d064 (GEOMESA-3071 Move all converter state into evaluation context)
=======
=======
>>>>>>> d1cf3ad8b5 (GEOMESA-3071 Move all converter state into evaluation context)
=======
>>>>>>> 72bafaf54b (GEOMESA-3061 Converters - support bytes in Avro top-level union types (#2762))
<<<<<<< HEAD
=======
>>>>>>> 7e68948ac (GEOMESA-3061 Converters - support bytes in Avro top-level union types (#2762))
>>>>>>> 4f0e2712ab (GEOMESA-3061 Converters - support bytes in Avro top-level union types (#2762))
=======
>>>>>>> 686339d05 (GEOMESA-3071 Move all converter state into evaluation context)
=======
>>>>>>> 6eb31fb65 (GEOMESA-3061 Converters - support bytes in Avro top-level union types (#2762))
=======
        exp.apply(Array(decoded)) mustEqual "foo"
=======
<<<<<<< HEAD
>>>>>>> b9bdd406e (GEOMESA-3061 Converters - support bytes in Avro top-level union types (#2762))
<<<<<<< HEAD
>>>>>>> a9f01eaaf5 (GEOMESA-3061 Converters - support bytes in Avro top-level union types (#2762))
=======
=======
<<<<<<< HEAD
<<<<<<< HEAD
<<<<<<< HEAD
>>>>>>> f71fa3c0e1 (GEOMESA-3061 Converters - support bytes in Avro top-level union types (#2762))
=======
>>>>>>> 0d80bae0c6 (GEOMESA-3071 Move all converter state into evaluation context)
=======
>>>>>>> 7e68948ac6 (GEOMESA-3061 Converters - support bytes in Avro top-level union types (#2762))
=======
=======
>>>>>>> 67b361c856 (GEOMESA-3061 Converters - support bytes in Avro top-level union types (#2762))
=======
>>>>>>> 149b7a7809 (GEOMESA-3071 Move all converter state into evaluation context)
=======
>>>>>>> d6616d893e (GEOMESA-3061 Converters - support bytes in Avro top-level union types (#2762))
=======
>>>>>>> 5ba418ba6c (GEOMESA-3071 Move all converter state into evaluation context)
=======
<<<<<<< HEAD
>>>>>>> dd5d6434b (GEOMESA-3071 Move all converter state into evaluation context)
<<<<<<< HEAD
>>>>>>> 686339d050 (GEOMESA-3071 Move all converter state into evaluation context)
=======
>>>>>>> a9f01eaaf (GEOMESA-3061 Converters - support bytes in Avro top-level union types (#2762))
<<<<<<< HEAD
<<<<<<< HEAD
>>>>>>> 4f0e2712ab (GEOMESA-3061 Converters - support bytes in Avro top-level union types (#2762))
=======
<<<<<<< HEAD
>>>>>>> d1cf3ad8b5 (GEOMESA-3071 Move all converter state into evaluation context)
=======
<<<<<<< HEAD
=======
<<<<<<< HEAD
<<<<<<< HEAD
<<<<<<< HEAD
>>>>>>> f71fa3c0e (GEOMESA-3061 Converters - support bytes in Avro top-level union types (#2762))
<<<<<<< HEAD
<<<<<<< HEAD
>>>>>>> 6eb31fb652 (GEOMESA-3061 Converters - support bytes in Avro top-level union types (#2762))
=======
>>>>>>> f3a49e0825 (GEOMESA-3071 Move all converter state into evaluation context)
=======
>>>>>>> 4073c9b173 (GEOMESA-3061 Converters - support bytes in Avro top-level union types (#2762))
=======
=======
<<<<<<< HEAD
>>>>>>> dd5d6434b (GEOMESA-3071 Move all converter state into evaluation context)
<<<<<<< HEAD
>>>>>>> 6289007008 (GEOMESA-3071 Move all converter state into evaluation context)
=======
=======
<<<<<<< HEAD
<<<<<<< HEAD
<<<<<<< HEAD
>>>>>>> f71fa3c0e (GEOMESA-3061 Converters - support bytes in Avro top-level union types (#2762))
>>>>>>> 07a6a5c291 (GEOMESA-3061 Converters - support bytes in Avro top-level union types (#2762))
=======
=======
>>>>>>> 0d80bae0c (GEOMESA-3071 Move all converter state into evaluation context)
<<<<<<< HEAD
<<<<<<< HEAD
>>>>>>> 149b7a7809 (GEOMESA-3071 Move all converter state into evaluation context)
=======
=======
>>>>>>> 7e68948ac (GEOMESA-3061 Converters - support bytes in Avro top-level union types (#2762))
<<<<<<< HEAD
<<<<<<< HEAD
>>>>>>> d6616d893e (GEOMESA-3061 Converters - support bytes in Avro top-level union types (#2762))
=======
=======
=======
<<<<<<< HEAD
>>>>>>> dd5d6434b (GEOMESA-3071 Move all converter state into evaluation context)
<<<<<<< HEAD
>>>>>>> 686339d05 (GEOMESA-3071 Move all converter state into evaluation context)
<<<<<<< HEAD
>>>>>>> 5ba418ba6c (GEOMESA-3071 Move all converter state into evaluation context)
=======
=======
=======
<<<<<<< HEAD
<<<<<<< HEAD
<<<<<<< HEAD
>>>>>>> f71fa3c0e (GEOMESA-3061 Converters - support bytes in Avro top-level union types (#2762))
>>>>>>> 6eb31fb65 (GEOMESA-3061 Converters - support bytes in Avro top-level union types (#2762))
>>>>>>> 28e2bfa2dc (GEOMESA-3061 Converters - support bytes in Avro top-level union types (#2762))
=======
>>>>>>> 0f4c829f25 (GEOMESA-3071 Move all converter state into evaluation context)
=======
>>>>>>> 314e6ef1a2 (GEOMESA-3061 Converters - support bytes in Avro top-level union types (#2762))
=======
=======
>>>>>>> dd5d6434b (GEOMESA-3071 Move all converter state into evaluation context)
>>>>>>> 455aae09d3 (GEOMESA-3071 Move all converter state into evaluation context)
=======
=======
>>>>>>> 0d80bae0c (GEOMESA-3071 Move all converter state into evaluation context)
>>>>>>> cb7d3570f5 (GEOMESA-3071 Move all converter state into evaluation context)
=======
=======
>>>>>>> 7e68948ac (GEOMESA-3061 Converters - support bytes in Avro top-level union types (#2762))
>>>>>>> 9990cd7dc7 (GEOMESA-3061 Converters - support bytes in Avro top-level union types (#2762))
=======
=======
>>>>>>> f3a49e082 (GEOMESA-3071 Move all converter state into evaluation context)
<<<<<<< HEAD
>>>>>>> 8caee74520 (GEOMESA-3071 Move all converter state into evaluation context)
=======
=======
>>>>>>> 4073c9b17 (GEOMESA-3061 Converters - support bytes in Avro top-level union types (#2762))
<<<<<<< HEAD
>>>>>>> 61208268cd (GEOMESA-3061 Converters - support bytes in Avro top-level union types (#2762))
=======
=======
=======
<<<<<<< HEAD
>>>>>>> dd5d6434b (GEOMESA-3071 Move all converter state into evaluation context)
<<<<<<< HEAD
>>>>>>> 628900700 (GEOMESA-3071 Move all converter state into evaluation context)
<<<<<<< HEAD
>>>>>>> 0166e9455b (GEOMESA-3071 Move all converter state into evaluation context)
=======
=======
=======
<<<<<<< HEAD
<<<<<<< HEAD
<<<<<<< HEAD
>>>>>>> f71fa3c0e (GEOMESA-3061 Converters - support bytes in Avro top-level union types (#2762))
>>>>>>> 07a6a5c29 (GEOMESA-3061 Converters - support bytes in Avro top-level union types (#2762))
<<<<<<< HEAD
>>>>>>> 89bdd3013e (GEOMESA-3061 Converters - support bytes in Avro top-level union types (#2762))
=======
=======
>>>>>>> 0f4c829f2 (GEOMESA-3071 Move all converter state into evaluation context)
<<<<<<< HEAD
>>>>>>> 25e967804c (GEOMESA-3071 Move all converter state into evaluation context)
=======
=======
>>>>>>> 314e6ef1a (GEOMESA-3061 Converters - support bytes in Avro top-level union types (#2762))
<<<<<<< HEAD
>>>>>>> 91bbd30a52 (GEOMESA-3061 Converters - support bytes in Avro top-level union types (#2762))
=======
=======
=======
>>>>>>> dd5d6434b (GEOMESA-3071 Move all converter state into evaluation context)
>>>>>>> 455aae09d (GEOMESA-3071 Move all converter state into evaluation context)
>>>>>>> a2ac294bf3 (GEOMESA-3071 Move all converter state into evaluation context)
        exp.apply(Array(decoded)) mustEqual "foo"
=======
>>>>>>> b9bdd406e (GEOMESA-3061 Converters - support bytes in Avro top-level union types (#2762))
=======
        exp.apply(Array(decoded)) mustEqual "foo"
>>>>>>> 1ba2f23b3 (GEOMESA-3071 Move all converter state into evaluation context)
<<<<<<< HEAD
<<<<<<< HEAD
<<<<<<< HEAD
<<<<<<< HEAD
<<<<<<< HEAD
<<<<<<< HEAD
<<<<<<< HEAD
<<<<<<< HEAD
<<<<<<< HEAD
<<<<<<< HEAD
<<<<<<< HEAD
<<<<<<< HEAD
<<<<<<< HEAD
<<<<<<< HEAD
<<<<<<< HEAD
<<<<<<< HEAD
<<<<<<< HEAD
<<<<<<< HEAD
<<<<<<< HEAD
<<<<<<< HEAD
<<<<<<< HEAD
<<<<<<< HEAD
<<<<<<< HEAD
<<<<<<< HEAD
<<<<<<< HEAD
<<<<<<< HEAD
>>>>>>> dd5d6434b0 (GEOMESA-3071 Move all converter state into evaluation context)
=======
>>>>>>> locationtech-main
=======
>>>>>>> b9bdd406e (GEOMESA-3061 Converters - support bytes in Avro top-level union types (#2762))
>>>>>>> b1c506839 (GEOMESA-3061 Converters - support bytes in Avro top-level union types (#2762))
>>>>>>> f71fa3c0e1 (GEOMESA-3061 Converters - support bytes in Avro top-level union types (#2762))
=======
>>>>>>> 7e68948ac6 (GEOMESA-3061 Converters - support bytes in Avro top-level union types (#2762))
=======
>>>>>>> 686339d050 (GEOMESA-3071 Move all converter state into evaluation context)
=======
>>>>>>> 6eb31fb652 (GEOMESA-3061 Converters - support bytes in Avro top-level union types (#2762))
=======
>>>>>>> 4073c9b173 (GEOMESA-3061 Converters - support bytes in Avro top-level union types (#2762))
=======
>>>>>>> 6289007008 (GEOMESA-3071 Move all converter state into evaluation context)
=======
>>>>>>> 07a6a5c291 (GEOMESA-3061 Converters - support bytes in Avro top-level union types (#2762))
=======
>>>>>>> 149b7a7809 (GEOMESA-3071 Move all converter state into evaluation context)
=======
=======
>>>>>>> 5ba418ba6c (GEOMESA-3071 Move all converter state into evaluation context)
=======
>>>>>>> 28e2bfa2dc (GEOMESA-3061 Converters - support bytes in Avro top-level union types (#2762))
=======
>>>>>>> 7e68948ac (GEOMESA-3061 Converters - support bytes in Avro top-level union types (#2762))
>>>>>>> d6616d893e (GEOMESA-3061 Converters - support bytes in Avro top-level union types (#2762))
=======
>>>>>>> 686339d05 (GEOMESA-3071 Move all converter state into evaluation context)
=======
>>>>>>> 6eb31fb65 (GEOMESA-3061 Converters - support bytes in Avro top-level union types (#2762))
=======
>>>>>>> 314e6ef1a2 (GEOMESA-3061 Converters - support bytes in Avro top-level union types (#2762))
=======
>>>>>>> 455aae09d3 (GEOMESA-3071 Move all converter state into evaluation context)
=======
>>>>>>> 6bd64e6308 (GEOMESA-3061 Converters - support bytes in Avro top-level union types (#2762))
=======
        exp.apply(Array(decoded)) mustEqual "foo"
=======
<<<<<<< HEAD
>>>>>>> b9bdd406e (GEOMESA-3061 Converters - support bytes in Avro top-level union types (#2762))
<<<<<<< HEAD
<<<<<<< HEAD
<<<<<<< HEAD
<<<<<<< HEAD
>>>>>>> cdb4102515 (GEOMESA-3061 Converters - support bytes in Avro top-level union types (#2762))
=======
>>>>>>> 0d80bae0c6 (GEOMESA-3071 Move all converter state into evaluation context)
=======
>>>>>>> a9f01eaaf (GEOMESA-3061 Converters - support bytes in Avro top-level union types (#2762))
<<<<<<< HEAD
<<<<<<< HEAD
<<<<<<< HEAD
<<<<<<< HEAD
<<<<<<< HEAD
<<<<<<< HEAD
>>>>>>> 7e68948ac6 (GEOMESA-3061 Converters - support bytes in Avro top-level union types (#2762))
=======
=======
>>>>>>> d6616d893e (GEOMESA-3061 Converters - support bytes in Avro top-level union types (#2762))
=======
>>>>>>> 5ba418ba6c (GEOMESA-3071 Move all converter state into evaluation context)
=======
=======
>>>>>>> cb7d3570f5 (GEOMESA-3071 Move all converter state into evaluation context)
=======
>>>>>>> 9990cd7dc7 (GEOMESA-3061 Converters - support bytes in Avro top-level union types (#2762))
=======
>>>>>>> 8caee74520 (GEOMESA-3071 Move all converter state into evaluation context)
=======
>>>>>>> 61208268cd (GEOMESA-3061 Converters - support bytes in Avro top-level union types (#2762))
=======
>>>>>>> 0166e9455b (GEOMESA-3071 Move all converter state into evaluation context)
=======
>>>>>>> 89bdd3013e (GEOMESA-3061 Converters - support bytes in Avro top-level union types (#2762))
=======
>>>>>>> 25e967804c (GEOMESA-3071 Move all converter state into evaluation context)
=======
>>>>>>> 91bbd30a52 (GEOMESA-3061 Converters - support bytes in Avro top-level union types (#2762))
=======
>>>>>>> a2ac294bf3 (GEOMESA-3071 Move all converter state into evaluation context)
>>>>>>> dd5d6434b (GEOMESA-3071 Move all converter state into evaluation context)
<<<<<<< HEAD
<<<<<<< HEAD
>>>>>>> 686339d050 (GEOMESA-3071 Move all converter state into evaluation context)
=======
=======
>>>>>>> 07a6a5c291 (GEOMESA-3061 Converters - support bytes in Avro top-level union types (#2762))
=======
>>>>>>> locationtech-main
=======
>>>>>>> b9bdd406e (GEOMESA-3061 Converters - support bytes in Avro top-level union types (#2762))
>>>>>>> b1c506839 (GEOMESA-3061 Converters - support bytes in Avro top-level union types (#2762))
>>>>>>> f71fa3c0e (GEOMESA-3061 Converters - support bytes in Avro top-level union types (#2762))
<<<<<<< HEAD
<<<<<<< HEAD
<<<<<<< HEAD
<<<<<<< HEAD
<<<<<<< HEAD
<<<<<<< HEAD
<<<<<<< HEAD
>>>>>>> 6eb31fb652 (GEOMESA-3061 Converters - support bytes in Avro top-level union types (#2762))
=======
>>>>>>> 67b361c856 (GEOMESA-3061 Converters - support bytes in Avro top-level union types (#2762))
=======
>>>>>>> 28e2bfa2dc (GEOMESA-3061 Converters - support bytes in Avro top-level union types (#2762))
=======
>>>>>>> 55b43ae566 (GEOMESA-3071 Move all converter state into evaluation context)
=======
=======
<<<<<<< HEAD
<<<<<<< HEAD
<<<<<<< HEAD
>>>>>>> f71fa3c0e (GEOMESA-3061 Converters - support bytes in Avro top-level union types (#2762))
        exp.apply(Array(decoded)) mustEqual "foo"
=======
>>>>>>> b9bdd406e (GEOMESA-3061 Converters - support bytes in Avro top-level union types (#2762))
<<<<<<< HEAD
<<<<<<< HEAD
>>>>>>> 0e68e9f4cc (GEOMESA-3061 Converters - support bytes in Avro top-level union types (#2762))
=======
>>>>>>> f3a49e0825 (GEOMESA-3071 Move all converter state into evaluation context)
=======
>>>>>>> a9f01eaaf (GEOMESA-3061 Converters - support bytes in Avro top-level union types (#2762))
>>>>>>> 4073c9b173 (GEOMESA-3061 Converters - support bytes in Avro top-level union types (#2762))
=======
=======
>>>>>>> dd5d6434b (GEOMESA-3071 Move all converter state into evaluation context)
>>>>>>> 6289007008 (GEOMESA-3071 Move all converter state into evaluation context)
=======
>>>>>>> 07a6a5c291 (GEOMESA-3061 Converters - support bytes in Avro top-level union types (#2762))
=======
>>>>>>> cdb410251 (GEOMESA-3061 Converters - support bytes in Avro top-level union types (#2762))
<<<<<<< HEAD
>>>>>>> 67b361c856 (GEOMESA-3061 Converters - support bytes in Avro top-level union types (#2762))
=======
=======
>>>>>>> 0d80bae0c (GEOMESA-3071 Move all converter state into evaluation context)
<<<<<<< HEAD
>>>>>>> 149b7a7809 (GEOMESA-3071 Move all converter state into evaluation context)
=======
=======
>>>>>>> 7e68948ac (GEOMESA-3061 Converters - support bytes in Avro top-level union types (#2762))
<<<<<<< HEAD
>>>>>>> d6616d893e (GEOMESA-3061 Converters - support bytes in Avro top-level union types (#2762))
=======
=======
=======
>>>>>>> dd5d6434b (GEOMESA-3071 Move all converter state into evaluation context)
>>>>>>> 686339d05 (GEOMESA-3071 Move all converter state into evaluation context)
<<<<<<< HEAD
>>>>>>> 5ba418ba6c (GEOMESA-3071 Move all converter state into evaluation context)
=======
=======
>>>>>>> 6eb31fb65 (GEOMESA-3061 Converters - support bytes in Avro top-level union types (#2762))
>>>>>>> 28e2bfa2dc (GEOMESA-3061 Converters - support bytes in Avro top-level union types (#2762))
=======
        exp.apply(Array(decoded)) mustEqual "foo"
=======
>>>>>>> b9bdd406e (GEOMESA-3061 Converters - support bytes in Avro top-level union types (#2762))
>>>>>>> b4320946b4 (GEOMESA-3061 Converters - support bytes in Avro top-level union types (#2762))
=======
>>>>>>> 0f4c829f25 (GEOMESA-3071 Move all converter state into evaluation context)
=======
>>>>>>> a9f01eaaf (GEOMESA-3061 Converters - support bytes in Avro top-level union types (#2762))
>>>>>>> 314e6ef1a2 (GEOMESA-3061 Converters - support bytes in Avro top-level union types (#2762))
=======
=======
>>>>>>> dd5d6434b (GEOMESA-3071 Move all converter state into evaluation context)
>>>>>>> 455aae09d3 (GEOMESA-3071 Move all converter state into evaluation context)
=======
        exp.apply(Array(decoded)) mustEqual "foo"
>>>>>>> 3be8d2a5a4 (Merge branch 'feature/postgis-fixes')
=======
>>>>>>> d9ed077cd1 (GEOMESA-3061 Converters - support bytes in Avro top-level union types (#2762))
=======
=======
        exp.apply(Array(decoded)) mustEqual "foo"
>>>>>>> 1ba2f23b3 (GEOMESA-3071 Move all converter state into evaluation context)
>>>>>>> 74661c3147 (GEOMESA-3071 Move all converter state into evaluation context)
=======
>>>>>>> a9f01eaaf (GEOMESA-3061 Converters - support bytes in Avro top-level union types (#2762))
>>>>>>> 6bd64e6308 (GEOMESA-3061 Converters - support bytes in Avro top-level union types (#2762))
=======
=======
        exp.apply(Array(decoded)) mustEqual "foo"
>>>>>>> 1ba2f23b3 (GEOMESA-3071 Move all converter state into evaluation context)
<<<<<<< HEAD
>>>>>>> dd5d6434b (GEOMESA-3071 Move all converter state into evaluation context)
<<<<<<< HEAD
>>>>>>> 55b43ae566 (GEOMESA-3071 Move all converter state into evaluation context)
=======
=======
>>>>>>> locationtech-main
=======
>>>>>>> b9bdd406e (GEOMESA-3061 Converters - support bytes in Avro top-level union types (#2762))
>>>>>>> b1c506839 (GEOMESA-3061 Converters - support bytes in Avro top-level union types (#2762))
>>>>>>> f71fa3c0e (GEOMESA-3061 Converters - support bytes in Avro top-level union types (#2762))
>>>>>>> c5e1827657 (GEOMESA-3061 Converters - support bytes in Avro top-level union types (#2762))
=======
=======
>>>>>>> 5f428db977 (GEOMESA-3061 Converters - support bytes in Avro top-level union types (#2762))
=======
>>>>>>> c8a325e13c (GEOMESA-3061 Converters - support bytes in Avro top-level union types (#2762))
=======
>>>>>>> 72bafaf54b (GEOMESA-3061 Converters - support bytes in Avro top-level union types (#2762))
=======
>>>>>>> 7e68948ac (GEOMESA-3061 Converters - support bytes in Avro top-level union types (#2762))
=======
>>>>>>> 4073c9b17 (GEOMESA-3061 Converters - support bytes in Avro top-level union types (#2762))
=======
>>>>>>> 628900700 (GEOMESA-3071 Move all converter state into evaluation context)
=======
>>>>>>> 07a6a5c29 (GEOMESA-3061 Converters - support bytes in Avro top-level union types (#2762))
=======
>>>>>>> 67b361c85 (GEOMESA-3061 Converters - support bytes in Avro top-level union types (#2762))
=======
>>>>>>> 28e2bfa2d (GEOMESA-3061 Converters - support bytes in Avro top-level union types (#2762))
=======
>>>>>>> 314e6ef1a (GEOMESA-3061 Converters - support bytes in Avro top-level union types (#2762))
=======
>>>>>>> 455aae09d (GEOMESA-3071 Move all converter state into evaluation context)
=======
        exp.apply(Array(decoded)) mustEqual "foo"
=======
>>>>>>> b9bdd406e (GEOMESA-3061 Converters - support bytes in Avro top-level union types (#2762))
<<<<<<< HEAD
<<<<<<< HEAD
<<<<<<< HEAD
<<<<<<< HEAD
>>>>>>> cdb410251 (GEOMESA-3061 Converters - support bytes in Avro top-level union types (#2762))
<<<<<<< HEAD
>>>>>>> 9d708b240a (GEOMESA-3061 Converters - support bytes in Avro top-level union types (#2762))
=======
=======
>>>>>>> 0d80bae0c (GEOMESA-3071 Move all converter state into evaluation context)
<<<<<<< HEAD
<<<<<<< HEAD
<<<<<<< HEAD
>>>>>>> cb7d3570f5 (GEOMESA-3071 Move all converter state into evaluation context)
=======
=======
>>>>>>> e734e4d064 (GEOMESA-3071 Move all converter state into evaluation context)
=======
>>>>>>> 4f0e2712ab (GEOMESA-3061 Converters - support bytes in Avro top-level union types (#2762))
=======
>>>>>>> a9f01eaaf (GEOMESA-3061 Converters - support bytes in Avro top-level union types (#2762))
<<<<<<< HEAD
<<<<<<< HEAD
>>>>>>> 7e68948ac (GEOMESA-3061 Converters - support bytes in Avro top-level union types (#2762))
<<<<<<< HEAD
>>>>>>> 9990cd7dc7 (GEOMESA-3061 Converters - support bytes in Avro top-level union types (#2762))
=======
=======
>>>>>>> dd5d6434b (GEOMESA-3071 Move all converter state into evaluation context)
<<<<<<< HEAD
>>>>>>> 686339d05 (GEOMESA-3071 Move all converter state into evaluation context)
<<<<<<< HEAD
>>>>>>> 6ac55e1ef7 (GEOMESA-3071 Move all converter state into evaluation context)
=======
=======
>>>>>>> 6eb31fb65 (GEOMESA-3061 Converters - support bytes in Avro top-level union types (#2762))
<<<<<<< HEAD
>>>>>>> 5f428db977 (GEOMESA-3061 Converters - support bytes in Avro top-level union types (#2762))
=======
=======
        exp.apply(Array(decoded)) mustEqual "foo"
=======
>>>>>>> b9bdd406e (GEOMESA-3061 Converters - support bytes in Avro top-level union types (#2762))
>>>>>>> 0e68e9f4c (GEOMESA-3061 Converters - support bytes in Avro top-level union types (#2762))
<<<<<<< HEAD
>>>>>>> 76618c8da3 (GEOMESA-3061 Converters - support bytes in Avro top-level union types (#2762))
=======
=======
>>>>>>> f3a49e082 (GEOMESA-3071 Move all converter state into evaluation context)
<<<<<<< HEAD
>>>>>>> 8caee74520 (GEOMESA-3071 Move all converter state into evaluation context)
=======
=======
>>>>>>> a9f01eaaf (GEOMESA-3061 Converters - support bytes in Avro top-level union types (#2762))
>>>>>>> 4073c9b17 (GEOMESA-3061 Converters - support bytes in Avro top-level union types (#2762))
<<<<<<< HEAD
>>>>>>> 61208268cd (GEOMESA-3061 Converters - support bytes in Avro top-level union types (#2762))
=======
=======
=======
>>>>>>> dd5d6434b (GEOMESA-3071 Move all converter state into evaluation context)
>>>>>>> 628900700 (GEOMESA-3071 Move all converter state into evaluation context)
<<<<<<< HEAD
>>>>>>> 0166e9455b (GEOMESA-3071 Move all converter state into evaluation context)
=======
=======
=======
>>>>>>> locationtech-main
=======
>>>>>>> b9bdd406e (GEOMESA-3061 Converters - support bytes in Avro top-level union types (#2762))
>>>>>>> b1c506839 (GEOMESA-3061 Converters - support bytes in Avro top-level union types (#2762))
>>>>>>> f71fa3c0e (GEOMESA-3061 Converters - support bytes in Avro top-level union types (#2762))
>>>>>>> 07a6a5c29 (GEOMESA-3061 Converters - support bytes in Avro top-level union types (#2762))
<<<<<<< HEAD
>>>>>>> 89bdd3013e (GEOMESA-3061 Converters - support bytes in Avro top-level union types (#2762))
=======
=======
>>>>>>> cdb410251 (GEOMESA-3061 Converters - support bytes in Avro top-level union types (#2762))
>>>>>>> 67b361c85 (GEOMESA-3061 Converters - support bytes in Avro top-level union types (#2762))
<<<<<<< HEAD
>>>>>>> c8a325e13c (GEOMESA-3061 Converters - support bytes in Avro top-level union types (#2762))
=======
=======
>>>>>>> 149b7a780 (GEOMESA-3071 Move all converter state into evaluation context)
<<<<<<< HEAD
>>>>>>> e734e4d064 (GEOMESA-3071 Move all converter state into evaluation context)
=======
=======
=======
>>>>>>> 7e68948ac (GEOMESA-3061 Converters - support bytes in Avro top-level union types (#2762))
<<<<<<< HEAD
>>>>>>> d6616d893 (GEOMESA-3061 Converters - support bytes in Avro top-level union types (#2762))
<<<<<<< HEAD
>>>>>>> 4f0e2712ab (GEOMESA-3061 Converters - support bytes in Avro top-level union types (#2762))
=======
=======
=======
=======
>>>>>>> dd5d6434b (GEOMESA-3071 Move all converter state into evaluation context)
>>>>>>> 686339d05 (GEOMESA-3071 Move all converter state into evaluation context)
<<<<<<< HEAD
>>>>>>> 5ba418ba6 (GEOMESA-3071 Move all converter state into evaluation context)
<<<<<<< HEAD
>>>>>>> d1cf3ad8b5 (GEOMESA-3071 Move all converter state into evaluation context)
=======
=======
=======
>>>>>>> 6eb31fb65 (GEOMESA-3061 Converters - support bytes in Avro top-level union types (#2762))
>>>>>>> 28e2bfa2d (GEOMESA-3061 Converters - support bytes in Avro top-level union types (#2762))
<<<<<<< HEAD
>>>>>>> 72bafaf54b (GEOMESA-3061 Converters - support bytes in Avro top-level union types (#2762))
=======
=======
        exp.apply(Array(decoded)) mustEqual "foo"
=======
>>>>>>> b9bdd406e (GEOMESA-3061 Converters - support bytes in Avro top-level union types (#2762))
>>>>>>> b4320946b (GEOMESA-3061 Converters - support bytes in Avro top-level union types (#2762))
<<<<<<< HEAD
>>>>>>> 97ec7d864a (GEOMESA-3061 Converters - support bytes in Avro top-level union types (#2762))
=======
=======
>>>>>>> 0f4c829f2 (GEOMESA-3071 Move all converter state into evaluation context)
<<<<<<< HEAD
>>>>>>> 25e967804c (GEOMESA-3071 Move all converter state into evaluation context)
=======
=======
>>>>>>> a9f01eaaf (GEOMESA-3061 Converters - support bytes in Avro top-level union types (#2762))
>>>>>>> 314e6ef1a (GEOMESA-3061 Converters - support bytes in Avro top-level union types (#2762))
<<<<<<< HEAD
>>>>>>> 91bbd30a52 (GEOMESA-3061 Converters - support bytes in Avro top-level union types (#2762))
=======
=======
=======
>>>>>>> dd5d6434b (GEOMESA-3071 Move all converter state into evaluation context)
>>>>>>> 455aae09d (GEOMESA-3071 Move all converter state into evaluation context)
<<<<<<< HEAD
>>>>>>> a2ac294bf3 (GEOMESA-3071 Move all converter state into evaluation context)
=======
=======
        exp.apply(Array(decoded)) mustEqual "foo"
>>>>>>> 3be8d2a5a (Merge branch 'feature/postgis-fixes')
>>>>>>> db8d998aa2 (Merge branch 'feature/postgis-fixes')
        exp.eval(Array(decoded)) mustEqual "foo"
=======
>>>>>>> 58d14a257e (GEOMESA-3254 Add Bloop build support)
      }

      "handle null values" >> {
<<<<<<< HEAD
<<<<<<< HEAD
<<<<<<< HEAD
<<<<<<< HEAD
<<<<<<< HEAD
<<<<<<< HEAD
<<<<<<< HEAD
<<<<<<< HEAD
<<<<<<< HEAD
<<<<<<< HEAD
<<<<<<< HEAD
<<<<<<< HEAD
<<<<<<< HEAD
<<<<<<< HEAD
<<<<<<< HEAD
<<<<<<< HEAD
<<<<<<< HEAD
<<<<<<< HEAD
<<<<<<< HEAD
<<<<<<< HEAD
<<<<<<< HEAD
<<<<<<< HEAD
<<<<<<< HEAD
<<<<<<< HEAD
<<<<<<< HEAD
<<<<<<< HEAD
<<<<<<< HEAD
<<<<<<< HEAD
<<<<<<< HEAD
<<<<<<< HEAD
<<<<<<< HEAD
<<<<<<< HEAD
<<<<<<< HEAD
<<<<<<< HEAD
<<<<<<< HEAD
<<<<<<< HEAD
<<<<<<< HEAD
<<<<<<< HEAD
<<<<<<< HEAD
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
>>>>>>> c5e1827657 (GEOMESA-3061 Converters - support bytes in Avro top-level union types (#2762))
=======
>>>>>>> 9d708b240a (GEOMESA-3061 Converters - support bytes in Avro top-level union types (#2762))
=======
>>>>>>> cb7d3570f5 (GEOMESA-3071 Move all converter state into evaluation context)
=======
>>>>>>> 9990cd7dc7 (GEOMESA-3061 Converters - support bytes in Avro top-level union types (#2762))
=======
>>>>>>> 6ac55e1ef7 (GEOMESA-3071 Move all converter state into evaluation context)
=======
>>>>>>> 5f428db977 (GEOMESA-3061 Converters - support bytes in Avro top-level union types (#2762))
=======
>>>>>>> 76618c8da3 (GEOMESA-3061 Converters - support bytes in Avro top-level union types (#2762))
=======
>>>>>>> 8caee74520 (GEOMESA-3071 Move all converter state into evaluation context)
=======
>>>>>>> 61208268cd (GEOMESA-3061 Converters - support bytes in Avro top-level union types (#2762))
=======
>>>>>>> 0166e9455b (GEOMESA-3071 Move all converter state into evaluation context)
=======
>>>>>>> 89bdd3013e (GEOMESA-3061 Converters - support bytes in Avro top-level union types (#2762))
=======
>>>>>>> c8a325e13c (GEOMESA-3061 Converters - support bytes in Avro top-level union types (#2762))
=======
=======
=======
=======
>>>>>>> 72bafaf54b (GEOMESA-3061 Converters - support bytes in Avro top-level union types (#2762))
=======
>>>>>>> 97ec7d864a (GEOMESA-3061 Converters - support bytes in Avro top-level union types (#2762))
=======
>>>>>>> 25e967804c (GEOMESA-3071 Move all converter state into evaluation context)
=======
>>>>>>> 91bbd30a52 (GEOMESA-3061 Converters - support bytes in Avro top-level union types (#2762))
=======
>>>>>>> a2ac294bf3 (GEOMESA-3071 Move all converter state into evaluation context)
=======
>>>>>>> db8d998aa2 (Merge branch 'feature/postgis-fixes')
=======
=======
>>>>>>> 28e2bfa2d (GEOMESA-3061 Converters - support bytes in Avro top-level union types (#2762))
=======
>>>>>>> 686339d05 (GEOMESA-3071 Move all converter state into evaluation context)
>>>>>>> 5ba418ba6 (GEOMESA-3071 Move all converter state into evaluation context)
>>>>>>> d1cf3ad8b5 (GEOMESA-3071 Move all converter state into evaluation context)
=======
<<<<<<< HEAD
>>>>>>> d6616d893 (GEOMESA-3061 Converters - support bytes in Avro top-level union types (#2762))
>>>>>>> 4f0e2712ab (GEOMESA-3061 Converters - support bytes in Avro top-level union types (#2762))
=======
<<<<<<< HEAD
>>>>>>> 149b7a780 (GEOMESA-3071 Move all converter state into evaluation context)
>>>>>>> e734e4d064 (GEOMESA-3071 Move all converter state into evaluation context)
=======
>>>>>>> dd5d6434b (GEOMESA-3071 Move all converter state into evaluation context)
<<<<<<< HEAD
>>>>>>> 5ba418ba6 (GEOMESA-3071 Move all converter state into evaluation context)
=======
>>>>>>> 6eb31fb65 (GEOMESA-3061 Converters - support bytes in Avro top-level union types (#2762))
=======
>>>>>>> 455aae09d (GEOMESA-3071 Move all converter state into evaluation context)
=======
>>>>>>> a9f01eaaf (GEOMESA-3061 Converters - support bytes in Avro top-level union types (#2762))
=======
>>>>>>> dd5d6434b (GEOMESA-3071 Move all converter state into evaluation context)
<<<<<<< HEAD
<<<<<<< HEAD
<<<<<<< HEAD
=======
>>>>>>> 6eb31fb65 (GEOMESA-3061 Converters - support bytes in Avro top-level union types (#2762))
>>>>>>> 28e2bfa2d (GEOMESA-3061 Converters - support bytes in Avro top-level union types (#2762))
=======
<<<<<<< HEAD
=======
<<<<<<< HEAD
<<<<<<< HEAD
>>>>>>> locationtech-main
=======
>>>>>>> b1c506839 (GEOMESA-3061 Converters - support bytes in Avro top-level union types (#2762))
<<<<<<< HEAD
<<<<<<< HEAD
>>>>>>> f71fa3c0e1 (GEOMESA-3061 Converters - support bytes in Avro top-level union types (#2762))
=======
>>>>>>> f71fa3c0e (GEOMESA-3061 Converters - support bytes in Avro top-level union types (#2762))
<<<<<<< HEAD
>>>>>>> 72bafaf54b (GEOMESA-3061 Converters - support bytes in Avro top-level union types (#2762))
=======
>>>>>>> cdb4102515 (GEOMESA-3061 Converters - support bytes in Avro top-level union types (#2762))
=======
<<<<<<< HEAD
>>>>>>> 0d80bae0c6 (GEOMESA-3071 Move all converter state into evaluation context)
=======
>>>>>>> 0d80bae0c (GEOMESA-3071 Move all converter state into evaluation context)
<<<<<<< HEAD
<<<<<<< HEAD
>>>>>>> e734e4d064 (GEOMESA-3071 Move all converter state into evaluation context)
=======
=======
>>>>>>> a9f01eaaf (GEOMESA-3061 Converters - support bytes in Avro top-level union types (#2762))
>>>>>>> 7e68948ac6 (GEOMESA-3061 Converters - support bytes in Avro top-level union types (#2762))
=======
=======
>>>>>>> 6eb31fb652 (GEOMESA-3061 Converters - support bytes in Avro top-level union types (#2762))
=======
>>>>>>> 07a6a5c291 (GEOMESA-3061 Converters - support bytes in Avro top-level union types (#2762))
=======
>>>>>>> 67b361c856 (GEOMESA-3061 Converters - support bytes in Avro top-level union types (#2762))
=======
>>>>>>> 149b7a7809 (GEOMESA-3071 Move all converter state into evaluation context)
=======
>>>>>>> d6616d893e (GEOMESA-3061 Converters - support bytes in Avro top-level union types (#2762))
=======
=======
>>>>>>> 28e2bfa2dc (GEOMESA-3061 Converters - support bytes in Avro top-level union types (#2762))
=======
>>>>>>> 686339d05 (GEOMESA-3071 Move all converter state into evaluation context)
>>>>>>> 5ba418ba6c (GEOMESA-3071 Move all converter state into evaluation context)
=======
>>>>>>> 6eb31fb65 (GEOMESA-3061 Converters - support bytes in Avro top-level union types (#2762))
=======
>>>>>>> a9f01eaaf (GEOMESA-3061 Converters - support bytes in Avro top-level union types (#2762))
=======
>>>>>>> dd5d6434b (GEOMESA-3071 Move all converter state into evaluation context)
<<<<<<< HEAD
<<<<<<< HEAD
<<<<<<< HEAD
<<<<<<< HEAD
>>>>>>> 686339d050 (GEOMESA-3071 Move all converter state into evaluation context)
=======
=======
>>>>>>> 07a6a5c291 (GEOMESA-3061 Converters - support bytes in Avro top-level union types (#2762))
=======
>>>>>>> 5ba418ba6c (GEOMESA-3071 Move all converter state into evaluation context)
=======
=======
>>>>>>> 6eb31fb65 (GEOMESA-3061 Converters - support bytes in Avro top-level union types (#2762))
>>>>>>> 28e2bfa2dc (GEOMESA-3061 Converters - support bytes in Avro top-level union types (#2762))
=======
=======
<<<<<<< HEAD
<<<<<<< HEAD
>>>>>>> locationtech-main
=======
>>>>>>> b1c506839 (GEOMESA-3061 Converters - support bytes in Avro top-level union types (#2762))
>>>>>>> f71fa3c0e (GEOMESA-3061 Converters - support bytes in Avro top-level union types (#2762))
<<<<<<< HEAD
<<<<<<< HEAD
<<<<<<< HEAD
<<<<<<< HEAD
>>>>>>> 6eb31fb652 (GEOMESA-3061 Converters - support bytes in Avro top-level union types (#2762))
=======
>>>>>>> 0e68e9f4cc (GEOMESA-3061 Converters - support bytes in Avro top-level union types (#2762))
=======
>>>>>>> f3a49e0825 (GEOMESA-3071 Move all converter state into evaluation context)
=======
=======
>>>>>>> a9f01eaaf (GEOMESA-3061 Converters - support bytes in Avro top-level union types (#2762))
>>>>>>> 4073c9b173 (GEOMESA-3061 Converters - support bytes in Avro top-level union types (#2762))
=======
<<<<<<< HEAD
=======
>>>>>>> d6616d893 (GEOMESA-3061 Converters - support bytes in Avro top-level union types (#2762))
=======
=======
>>>>>>> a9f01eaaf (GEOMESA-3061 Converters - support bytes in Avro top-level union types (#2762))
>>>>>>> 7e68948ac (GEOMESA-3061 Converters - support bytes in Avro top-level union types (#2762))
<<<<<<< HEAD
<<<<<<< HEAD
>>>>>>> 4f0e2712ab (GEOMESA-3061 Converters - support bytes in Avro top-level union types (#2762))
=======
<<<<<<< HEAD
>>>>>>> d1cf3ad8b5 (GEOMESA-3071 Move all converter state into evaluation context)
=======
=======
>>>>>>> 6eb31fb65 (GEOMESA-3061 Converters - support bytes in Avro top-level union types (#2762))
=======
>>>>>>> 07a6a5c29 (GEOMESA-3061 Converters - support bytes in Avro top-level union types (#2762))
=======
>>>>>>> 67b361c85 (GEOMESA-3061 Converters - support bytes in Avro top-level union types (#2762))
=======
>>>>>>> a9f01eaaf (GEOMESA-3061 Converters - support bytes in Avro top-level union types (#2762))
=======
>>>>>>> dd5d6434b (GEOMESA-3071 Move all converter state into evaluation context)
<<<<<<< HEAD
<<<<<<< HEAD
>>>>>>> 6289007008 (GEOMESA-3071 Move all converter state into evaluation context)
=======
>>>>>>> 07a6a5c291 (GEOMESA-3061 Converters - support bytes in Avro top-level union types (#2762))
=======
=======
>>>>>>> 28e2bfa2dc (GEOMESA-3061 Converters - support bytes in Avro top-level union types (#2762))
=======
>>>>>>> cdb410251 (GEOMESA-3061 Converters - support bytes in Avro top-level union types (#2762))
<<<<<<< HEAD
<<<<<<< HEAD
>>>>>>> 67b361c856 (GEOMESA-3061 Converters - support bytes in Avro top-level union types (#2762))
=======
=======
>>>>>>> 0d80bae0c (GEOMESA-3071 Move all converter state into evaluation context)
<<<<<<< HEAD
<<<<<<< HEAD
>>>>>>> 149b7a7809 (GEOMESA-3071 Move all converter state into evaluation context)
=======
=======
>>>>>>> 9990cd7dc7 (GEOMESA-3061 Converters - support bytes in Avro top-level union types (#2762))
=======
=======
>>>>>>> a9f01eaaf (GEOMESA-3061 Converters - support bytes in Avro top-level union types (#2762))
>>>>>>> 7e68948ac (GEOMESA-3061 Converters - support bytes in Avro top-level union types (#2762))
<<<<<<< HEAD
<<<<<<< HEAD
<<<<<<< HEAD
>>>>>>> d6616d893e (GEOMESA-3061 Converters - support bytes in Avro top-level union types (#2762))
=======
=======
>>>>>>> 686339d05 (GEOMESA-3071 Move all converter state into evaluation context)
<<<<<<< HEAD
>>>>>>> 5ba418ba6c (GEOMESA-3071 Move all converter state into evaluation context)
=======
=======
>>>>>>> 6eb31fb65 (GEOMESA-3061 Converters - support bytes in Avro top-level union types (#2762))
>>>>>>> 28e2bfa2dc (GEOMESA-3061 Converters - support bytes in Avro top-level union types (#2762))
=======
>>>>>>> b4320946b4 (GEOMESA-3061 Converters - support bytes in Avro top-level union types (#2762))
=======
>>>>>>> 0f4c829f25 (GEOMESA-3071 Move all converter state into evaluation context)
=======
=======
>>>>>>> a9f01eaaf (GEOMESA-3061 Converters - support bytes in Avro top-level union types (#2762))
>>>>>>> 314e6ef1a2 (GEOMESA-3061 Converters - support bytes in Avro top-level union types (#2762))
=======
>>>>>>> 6ac55e1ef7 (GEOMESA-3071 Move all converter state into evaluation context)
=======
=======
>>>>>>> a9f01eaaf (GEOMESA-3061 Converters - support bytes in Avro top-level union types (#2762))
=======
>>>>>>> dd5d6434b (GEOMESA-3071 Move all converter state into evaluation context)
<<<<<<< HEAD
>>>>>>> 455aae09d3 (GEOMESA-3071 Move all converter state into evaluation context)
=======
>>>>>>> 3be8d2a5a4 (Merge branch 'feature/postgis-fixes')
=======
>>>>>>> 6bd64e6308 (GEOMESA-3061 Converters - support bytes in Avro top-level union types (#2762))
=======
>>>>>>> 55b43ae566 (GEOMESA-3071 Move all converter state into evaluation context)
=======
>>>>>>> f71fa3c0e (GEOMESA-3061 Converters - support bytes in Avro top-level union types (#2762))
>>>>>>> c5e1827657 (GEOMESA-3061 Converters - support bytes in Avro top-level union types (#2762))
=======
=======
>>>>>>> cdb410251 (GEOMESA-3061 Converters - support bytes in Avro top-level union types (#2762))
>>>>>>> 9d708b240a (GEOMESA-3061 Converters - support bytes in Avro top-level union types (#2762))
=======
=======
>>>>>>> 0d80bae0c (GEOMESA-3071 Move all converter state into evaluation context)
>>>>>>> cb7d3570f5 (GEOMESA-3071 Move all converter state into evaluation context)
=======
>>>>>>> 9990cd7dc7 (GEOMESA-3061 Converters - support bytes in Avro top-level union types (#2762))
=======
>>>>>>> 686339d05 (GEOMESA-3071 Move all converter state into evaluation context)
>>>>>>> 6ac55e1ef7 (GEOMESA-3071 Move all converter state into evaluation context)
=======
=======
>>>>>>> 89bdd3013e (GEOMESA-3061 Converters - support bytes in Avro top-level union types (#2762))
<<<<<<< HEAD
>>>>>>> 686339d05 (GEOMESA-3071 Move all converter state into evaluation context)
=======
=======
>>>>>>> 07a6a5c29 (GEOMESA-3061 Converters - support bytes in Avro top-level union types (#2762))
=======
=======
<<<<<<< HEAD
<<<<<<< HEAD
>>>>>>> locationtech-main
=======
>>>>>>> b1c506839 (GEOMESA-3061 Converters - support bytes in Avro top-level union types (#2762))
>>>>>>> f71fa3c0e (GEOMESA-3061 Converters - support bytes in Avro top-level union types (#2762))
<<<<<<< HEAD
<<<<<<< HEAD
>>>>>>> 6eb31fb65 (GEOMESA-3061 Converters - support bytes in Avro top-level union types (#2762))
<<<<<<< HEAD
>>>>>>> 5f428db977 (GEOMESA-3061 Converters - support bytes in Avro top-level union types (#2762))
=======
=======
>>>>>>> 0e68e9f4c (GEOMESA-3061 Converters - support bytes in Avro top-level union types (#2762))
<<<<<<< HEAD
>>>>>>> 76618c8da3 (GEOMESA-3061 Converters - support bytes in Avro top-level union types (#2762))
=======
=======
>>>>>>> f3a49e082 (GEOMESA-3071 Move all converter state into evaluation context)
<<<<<<< HEAD
>>>>>>> 8caee74520 (GEOMESA-3071 Move all converter state into evaluation context)
=======
=======
=======
>>>>>>> a9f01eaaf (GEOMESA-3061 Converters - support bytes in Avro top-level union types (#2762))
>>>>>>> 4073c9b17 (GEOMESA-3061 Converters - support bytes in Avro top-level union types (#2762))
<<<<<<< HEAD
>>>>>>> 61208268cd (GEOMESA-3061 Converters - support bytes in Avro top-level union types (#2762))
=======
=======
=======
>>>>>>> a9f01eaaf (GEOMESA-3061 Converters - support bytes in Avro top-level union types (#2762))
=======
>>>>>>> dd5d6434b (GEOMESA-3071 Move all converter state into evaluation context)
>>>>>>> 628900700 (GEOMESA-3071 Move all converter state into evaluation context)
<<<<<<< HEAD
>>>>>>> 0166e9455b (GEOMESA-3071 Move all converter state into evaluation context)
=======
=======
>>>>>>> 07a6a5c29 (GEOMESA-3061 Converters - support bytes in Avro top-level union types (#2762))
<<<<<<< HEAD
>>>>>>> 89bdd3013e (GEOMESA-3061 Converters - support bytes in Avro top-level union types (#2762))
=======
=======
=======
>>>>>>> cdb410251 (GEOMESA-3061 Converters - support bytes in Avro top-level union types (#2762))
>>>>>>> 67b361c85 (GEOMESA-3061 Converters - support bytes in Avro top-level union types (#2762))
<<<<<<< HEAD
>>>>>>> c8a325e13c (GEOMESA-3061 Converters - support bytes in Avro top-level union types (#2762))
=======
=======
>>>>>>> 149b7a780 (GEOMESA-3071 Move all converter state into evaluation context)
<<<<<<< HEAD
>>>>>>> e734e4d064 (GEOMESA-3071 Move all converter state into evaluation context)
=======
=======
>>>>>>> d6616d893 (GEOMESA-3061 Converters - support bytes in Avro top-level union types (#2762))
<<<<<<< HEAD
>>>>>>> 4f0e2712ab (GEOMESA-3061 Converters - support bytes in Avro top-level union types (#2762))
=======
=======
=======
>>>>>>> 686339d05 (GEOMESA-3071 Move all converter state into evaluation context)
<<<<<<< HEAD
>>>>>>> 5ba418ba6 (GEOMESA-3071 Move all converter state into evaluation context)
<<<<<<< HEAD
>>>>>>> d1cf3ad8b5 (GEOMESA-3071 Move all converter state into evaluation context)
=======
=======
=======
>>>>>>> 6eb31fb65 (GEOMESA-3061 Converters - support bytes in Avro top-level union types (#2762))
>>>>>>> 28e2bfa2d (GEOMESA-3061 Converters - support bytes in Avro top-level union types (#2762))
<<<<<<< HEAD
>>>>>>> 72bafaf54b (GEOMESA-3061 Converters - support bytes in Avro top-level union types (#2762))
=======
=======
>>>>>>> b4320946b (GEOMESA-3061 Converters - support bytes in Avro top-level union types (#2762))
<<<<<<< HEAD
>>>>>>> 97ec7d864a (GEOMESA-3061 Converters - support bytes in Avro top-level union types (#2762))
=======
=======
>>>>>>> 0f4c829f2 (GEOMESA-3071 Move all converter state into evaluation context)
<<<<<<< HEAD
>>>>>>> 25e967804c (GEOMESA-3071 Move all converter state into evaluation context)
=======
=======
=======
>>>>>>> a9f01eaaf (GEOMESA-3061 Converters - support bytes in Avro top-level union types (#2762))
>>>>>>> 314e6ef1a (GEOMESA-3061 Converters - support bytes in Avro top-level union types (#2762))
<<<<<<< HEAD
>>>>>>> 91bbd30a52 (GEOMESA-3061 Converters - support bytes in Avro top-level union types (#2762))
=======
=======
>>>>>>> 455aae09d (GEOMESA-3071 Move all converter state into evaluation context)
<<<<<<< HEAD
>>>>>>> a2ac294bf3 (GEOMESA-3071 Move all converter state into evaluation context)
=======
=======
>>>>>>> 3be8d2a5a (Merge branch 'feature/postgis-fixes')
>>>>>>> db8d998aa2 (Merge branch 'feature/postgis-fixes')
        Expression("avroBinaryList(avroPath($0, '/content$type=TObj/foo'))").apply(Array(decoded)) must beNull
        Expression("avroBinaryMap(avroPath($0, '/content$type=TObj/foo'))").apply(Array(decoded)) must beNull
        Expression("avroBinaryUuid(avroPath($0, '/content$type=TObj/foo'))").apply(Array(decoded)) must beNull
<<<<<<< HEAD
<<<<<<< HEAD
<<<<<<< HEAD
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
>>>>>>> 9d708b240a (GEOMESA-3061 Converters - support bytes in Avro top-level union types (#2762))
=======
>>>>>>> 76618c8da3 (GEOMESA-3061 Converters - support bytes in Avro top-level union types (#2762))
=======
>>>>>>> 97ec7d864a (GEOMESA-3061 Converters - support bytes in Avro top-level union types (#2762))
=======
>>>>>>> db8d998aa2 (Merge branch 'feature/postgis-fixes')
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
=======
>>>>>>> f71fa3c0e (GEOMESA-3061 Converters - support bytes in Avro top-level union types (#2762))
>>>>>>> c5e1827657 (GEOMESA-3061 Converters - support bytes in Avro top-level union types (#2762))
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
=======
>>>>>>> f71fa3c0e1 (GEOMESA-3061 Converters - support bytes in Avro top-level union types (#2762))
=======
<<<<<<< HEAD
<<<<<<< HEAD
<<<<<<< HEAD
=======
>>>>>>> 07a6a5c291 (GEOMESA-3061 Converters - support bytes in Avro top-level union types (#2762))
=======
>>>>>>> 67b361c856 (GEOMESA-3061 Converters - support bytes in Avro top-level union types (#2762))
=======
>>>>>>> 149b7a7809 (GEOMESA-3071 Move all converter state into evaluation context)
=======
>>>>>>> d6616d893e (GEOMESA-3061 Converters - support bytes in Avro top-level union types (#2762))
=======
>>>>>>> 5ba418ba6c (GEOMESA-3071 Move all converter state into evaluation context)
=======
=======
>>>>>>> 6eb31fb65 (GEOMESA-3061 Converters - support bytes in Avro top-level union types (#2762))
>>>>>>> 28e2bfa2dc (GEOMESA-3061 Converters - support bytes in Avro top-level union types (#2762))
=======
>>>>>>> 5f428db977 (GEOMESA-3061 Converters - support bytes in Avro top-level union types (#2762))
=======
>>>>>>> 07a6a5c29 (GEOMESA-3061 Converters - support bytes in Avro top-level union types (#2762))
=======
>>>>>>> 67b361c85 (GEOMESA-3061 Converters - support bytes in Avro top-level union types (#2762))
=======
>>>>>>> 149b7a780 (GEOMESA-3071 Move all converter state into evaluation context)
=======
>>>>>>> d6616d893 (GEOMESA-3061 Converters - support bytes in Avro top-level union types (#2762))
=======
>>>>>>> 5ba418ba6 (GEOMESA-3071 Move all converter state into evaluation context)
=======
=======
>>>>>>> 6eb31fb65 (GEOMESA-3061 Converters - support bytes in Avro top-level union types (#2762))
>>>>>>> 28e2bfa2d (GEOMESA-3061 Converters - support bytes in Avro top-level union types (#2762))
=======
<<<<<<< HEAD
=======
=======
>>>>>>> f71fa3c0e (GEOMESA-3061 Converters - support bytes in Avro top-level union types (#2762))
<<<<<<< HEAD
<<<<<<< HEAD
<<<<<<< HEAD
<<<<<<< HEAD
<<<<<<< HEAD
=======
>>>>>>> 4073c9b173 (GEOMESA-3061 Converters - support bytes in Avro top-level union types (#2762))
=======
>>>>>>> 6289007008 (GEOMESA-3071 Move all converter state into evaluation context)
=======
>>>>>>> 07a6a5c291 (GEOMESA-3061 Converters - support bytes in Avro top-level union types (#2762))
=======
>>>>>>> 28e2bfa2dc (GEOMESA-3061 Converters - support bytes in Avro top-level union types (#2762))
=======
>>>>>>> 7e68948ac (GEOMESA-3061 Converters - support bytes in Avro top-level union types (#2762))
=======
>>>>>>> 686339d05 (GEOMESA-3071 Move all converter state into evaluation context)
=======
>>>>>>> 6eb31fb65 (GEOMESA-3061 Converters - support bytes in Avro top-level union types (#2762))
=======
>>>>>>> 314e6ef1a2 (GEOMESA-3061 Converters - support bytes in Avro top-level union types (#2762))
=======
>>>>>>> 455aae09d3 (GEOMESA-3071 Move all converter state into evaluation context)
=======
>>>>>>> 9990cd7dc7 (GEOMESA-3061 Converters - support bytes in Avro top-level union types (#2762))
=======
>>>>>>> 6ac55e1ef7 (GEOMESA-3071 Move all converter state into evaluation context)
=======
>>>>>>> 5f428db977 (GEOMESA-3061 Converters - support bytes in Avro top-level union types (#2762))
=======
>>>>>>> 89bdd3013e (GEOMESA-3061 Converters - support bytes in Avro top-level union types (#2762))
=======
>>>>>>> 72bafaf54b (GEOMESA-3061 Converters - support bytes in Avro top-level union types (#2762))
=======
>>>>>>> 4073c9b17 (GEOMESA-3061 Converters - support bytes in Avro top-level union types (#2762))
=======
>>>>>>> 628900700 (GEOMESA-3071 Move all converter state into evaluation context)
=======
>>>>>>> 07a6a5c29 (GEOMESA-3061 Converters - support bytes in Avro top-level union types (#2762))
=======
>>>>>>> 28e2bfa2d (GEOMESA-3061 Converters - support bytes in Avro top-level union types (#2762))
=======
>>>>>>> 7e68948ac (GEOMESA-3061 Converters - support bytes in Avro top-level union types (#2762))
=======
>>>>>>> 686339d05 (GEOMESA-3071 Move all converter state into evaluation context)
=======
>>>>>>> 6eb31fb65 (GEOMESA-3061 Converters - support bytes in Avro top-level union types (#2762))
=======
>>>>>>> 314e6ef1a (GEOMESA-3061 Converters - support bytes in Avro top-level union types (#2762))
=======
>>>>>>> 455aae09d (GEOMESA-3071 Move all converter state into evaluation context)
=======
        Expression("avroBinaryList(avroPath($0, '/content$type=TObj/foo'))").apply(Array(decoded)) must beNull
>>>>>>> 1ba2f23b3 (GEOMESA-3071 Move all converter state into evaluation context)
        Expression("avroBinaryList(avroPath($0, '/content$type=TObj/foo'))").eval(Array(decoded)) must beNull
        Expression("avroBinaryMap(avroPath($0, '/content$type=TObj/foo'))").apply(Array(decoded)) must beNull
        Expression("avroBinaryMap(avroPath($0, '/content$type=TObj/foo'))").eval(Array(decoded)) must beNull
<<<<<<< HEAD
>>>>>>> b9bdd406e (GEOMESA-3061 Converters - support bytes in Avro top-level union types (#2762))
=======
        Expression("avroBinaryUuid(avroPath($0, '/content$type=TObj/foo'))").apply(Array(decoded)) must beNull
>>>>>>> 1ba2f23b3 (GEOMESA-3071 Move all converter state into evaluation context)
<<<<<<< HEAD
<<<<<<< HEAD
<<<<<<< HEAD
<<<<<<< HEAD
=======
<<<<<<< HEAD
=======
>>>>>>> 6eb31fb65 (GEOMESA-3061 Converters - support bytes in Avro top-level union types (#2762))
=======
=======
=======
        Expression("avroBinaryList(avroPath($0, '/content$type=TObj/foo'))").apply(Array(decoded)) must beNull
>>>>>>> 1ba2f23b3 (GEOMESA-3071 Move all converter state into evaluation context)
>>>>>>> dd5d6434b (GEOMESA-3071 Move all converter state into evaluation context)
        Expression("avroBinaryList(avroPath($0, '/content$type=TObj/foo'))").eval(Array(decoded)) must beNull
        Expression("avroBinaryMap(avroPath($0, '/content$type=TObj/foo'))").apply(Array(decoded)) must beNull
        Expression("avroBinaryMap(avroPath($0, '/content$type=TObj/foo'))").eval(Array(decoded)) must beNull
>>>>>>> 28e2bfa2d (GEOMESA-3061 Converters - support bytes in Avro top-level union types (#2762))
<<<<<<< HEAD
<<<<<<< HEAD
<<<<<<< HEAD
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
>>>>>>> c5e1827657 (GEOMESA-3061 Converters - support bytes in Avro top-level union types (#2762))
=======
>>>>>>> 9990cd7dc7 (GEOMESA-3061 Converters - support bytes in Avro top-level union types (#2762))
=======
>>>>>>> 5f428db977 (GEOMESA-3061 Converters - support bytes in Avro top-level union types (#2762))
=======
>>>>>>> 61208268cd (GEOMESA-3061 Converters - support bytes in Avro top-level union types (#2762))
=======
>>>>>>> 89bdd3013e (GEOMESA-3061 Converters - support bytes in Avro top-level union types (#2762))
=======
>>>>>>> 4f0e2712ab (GEOMESA-3061 Converters - support bytes in Avro top-level union types (#2762))
=======
>>>>>>> locationtech-main
=======
=======
<<<<<<< HEAD
<<<<<<< HEAD
<<<<<<< HEAD
>>>>>>> cdb4102515 (GEOMESA-3061 Converters - support bytes in Avro top-level union types (#2762))
=======
>>>>>>> cdb410251 (GEOMESA-3061 Converters - support bytes in Avro top-level union types (#2762))
>>>>>>> 72bafaf54b (GEOMESA-3061 Converters - support bytes in Avro top-level union types (#2762))
=======
<<<<<<< HEAD
>>>>>>> 28e2bfa2d (GEOMESA-3061 Converters - support bytes in Avro top-level union types (#2762))
=======
=======
        Expression("avroBinaryList(avroPath($0, '/content$type=TObj/foo'))").apply(Array(decoded)) must beNull
>>>>>>> 1ba2f23b3 (GEOMESA-3071 Move all converter state into evaluation context)
        Expression("avroBinaryList(avroPath($0, '/content$type=TObj/foo'))").eval(Array(decoded)) must beNull
        Expression("avroBinaryMap(avroPath($0, '/content$type=TObj/foo'))").apply(Array(decoded)) must beNull
        Expression("avroBinaryMap(avroPath($0, '/content$type=TObj/foo'))").eval(Array(decoded)) must beNull
<<<<<<< HEAD
>>>>>>> b9bdd406e (GEOMESA-3061 Converters - support bytes in Avro top-level union types (#2762))
<<<<<<< HEAD
<<<<<<< HEAD
>>>>>>> b1c506839 (GEOMESA-3061 Converters - support bytes in Avro top-level union types (#2762))
>>>>>>> f71fa3c0e1 (GEOMESA-3061 Converters - support bytes in Avro top-level union types (#2762))
=======
>>>>>>> cdb4102515 (GEOMESA-3061 Converters - support bytes in Avro top-level union types (#2762))
=======
=======
        Expression("avroBinaryUuid(avroPath($0, '/content$type=TObj/foo'))").apply(Array(decoded)) must beNull
>>>>>>> 1ba2f23b3 (GEOMESA-3071 Move all converter state into evaluation context)
>>>>>>> 0d80bae0c6 (GEOMESA-3071 Move all converter state into evaluation context)
=======
=======
>>>>>>> 6eb31fb652 (GEOMESA-3061 Converters - support bytes in Avro top-level union types (#2762))
=======
>>>>>>> 07a6a5c291 (GEOMESA-3061 Converters - support bytes in Avro top-level union types (#2762))
=======
>>>>>>> d6616d893e (GEOMESA-3061 Converters - support bytes in Avro top-level union types (#2762))
=======
=======
>>>>>>> 6eb31fb65 (GEOMESA-3061 Converters - support bytes in Avro top-level union types (#2762))
>>>>>>> 28e2bfa2dc (GEOMESA-3061 Converters - support bytes in Avro top-level union types (#2762))
=======
=======
=======
        Expression("avroBinaryList(avroPath($0, '/content$type=TObj/foo'))").apply(Array(decoded)) must beNull
>>>>>>> 1ba2f23b3 (GEOMESA-3071 Move all converter state into evaluation context)
>>>>>>> dd5d6434b (GEOMESA-3071 Move all converter state into evaluation context)
        Expression("avroBinaryList(avroPath($0, '/content$type=TObj/foo'))").eval(Array(decoded)) must beNull
        Expression("avroBinaryMap(avroPath($0, '/content$type=TObj/foo'))").apply(Array(decoded)) must beNull
        Expression("avroBinaryMap(avroPath($0, '/content$type=TObj/foo'))").eval(Array(decoded)) must beNull
<<<<<<< HEAD
>>>>>>> b9bdd406e (GEOMESA-3061 Converters - support bytes in Avro top-level union types (#2762))
<<<<<<< HEAD
>>>>>>> a9f01eaaf (GEOMESA-3061 Converters - support bytes in Avro top-level union types (#2762))
<<<<<<< HEAD
>>>>>>> 7e68948ac6 (GEOMESA-3061 Converters - support bytes in Avro top-level union types (#2762))
=======
=======
=======
        Expression("avroBinaryUuid(avroPath($0, '/content$type=TObj/foo'))").apply(Array(decoded)) must beNull
>>>>>>> 1ba2f23b3 (GEOMESA-3071 Move all converter state into evaluation context)
>>>>>>> dd5d6434b (GEOMESA-3071 Move all converter state into evaluation context)
<<<<<<< HEAD
<<<<<<< HEAD
>>>>>>> 686339d050 (GEOMESA-3071 Move all converter state into evaluation context)
=======
=======
>>>>>>> 07a6a5c291 (GEOMESA-3061 Converters - support bytes in Avro top-level union types (#2762))
=======
>>>>>>> locationtech-main
=======
=======
<<<<<<< HEAD
<<<<<<< HEAD
<<<<<<< HEAD
>>>>>>> 0e68e9f4cc (GEOMESA-3061 Converters - support bytes in Avro top-level union types (#2762))
=======
>>>>>>> 149b7a7809 (GEOMESA-3071 Move all converter state into evaluation context)
=======
=======
        Expression("avroBinaryList(avroPath($0, '/content$type=TObj/foo'))").apply(Array(decoded)) must beNull
>>>>>>> 1ba2f23b3 (GEOMESA-3071 Move all converter state into evaluation context)
<<<<<<< HEAD
        Expression("avroBinaryList(avroPath($0, '/content$type=TObj/foo'))").eval(Array(decoded)) must beNull
        Expression("avroBinaryMap(avroPath($0, '/content$type=TObj/foo'))").apply(Array(decoded)) must beNull
        Expression("avroBinaryMap(avroPath($0, '/content$type=TObj/foo'))").eval(Array(decoded)) must beNull
<<<<<<< HEAD
>>>>>>> b9bdd406e (GEOMESA-3061 Converters - support bytes in Avro top-level union types (#2762))
<<<<<<< HEAD
<<<<<<< HEAD
>>>>>>> b1c506839 (GEOMESA-3061 Converters - support bytes in Avro top-level union types (#2762))
>>>>>>> f71fa3c0e (GEOMESA-3061 Converters - support bytes in Avro top-level union types (#2762))
>>>>>>> 6eb31fb652 (GEOMESA-3061 Converters - support bytes in Avro top-level union types (#2762))
=======
>>>>>>> 0e68e9f4cc (GEOMESA-3061 Converters - support bytes in Avro top-level union types (#2762))
=======
=======
        Expression("avroBinaryUuid(avroPath($0, '/content$type=TObj/foo'))").apply(Array(decoded)) must beNull
>>>>>>> 1ba2f23b3 (GEOMESA-3071 Move all converter state into evaluation context)
>>>>>>> f3a49e0825 (GEOMESA-3071 Move all converter state into evaluation context)
=======
=======
=======
>>>>>>> 28e2bfa2dc (GEOMESA-3061 Converters - support bytes in Avro top-level union types (#2762))
=======
=======
        Expression("avroBinaryList(avroPath($0, '/content$type=TObj/foo'))").apply(Array(decoded)) must beNull
>>>>>>> 1ba2f23b3 (GEOMESA-3071 Move all converter state into evaluation context)
>>>>>>> dd5d6434b (GEOMESA-3071 Move all converter state into evaluation context)
        Expression("avroBinaryList(avroPath($0, '/content$type=TObj/foo'))").eval(Array(decoded)) must beNull
        Expression("avroBinaryMap(avroPath($0, '/content$type=TObj/foo'))").apply(Array(decoded)) must beNull
        Expression("avroBinaryMap(avroPath($0, '/content$type=TObj/foo'))").eval(Array(decoded)) must beNull
<<<<<<< HEAD
>>>>>>> b9bdd406e (GEOMESA-3061 Converters - support bytes in Avro top-level union types (#2762))
<<<<<<< HEAD
>>>>>>> a9f01eaaf (GEOMESA-3061 Converters - support bytes in Avro top-level union types (#2762))
<<<<<<< HEAD
>>>>>>> 4073c9b173 (GEOMESA-3061 Converters - support bytes in Avro top-level union types (#2762))
=======
=======
=======
        Expression("avroBinaryUuid(avroPath($0, '/content$type=TObj/foo'))").apply(Array(decoded)) must beNull
>>>>>>> 1ba2f23b3 (GEOMESA-3071 Move all converter state into evaluation context)
>>>>>>> dd5d6434b (GEOMESA-3071 Move all converter state into evaluation context)
>>>>>>> 6289007008 (GEOMESA-3071 Move all converter state into evaluation context)
=======
=======
>>>>>>> 0d80bae0c (GEOMESA-3071 Move all converter state into evaluation context)
>>>>>>> 149b7a7809 (GEOMESA-3071 Move all converter state into evaluation context)
        Expression("avroBinaryList(avroPath($0, '/content$type=TObj/foo'))").eval(Array(decoded)) must beNull
        Expression("avroBinaryMap(avroPath($0, '/content$type=TObj/foo'))").apply(Array(decoded)) must beNull
        Expression("avroBinaryMap(avroPath($0, '/content$type=TObj/foo'))").eval(Array(decoded)) must beNull
<<<<<<< HEAD
>>>>>>> b9bdd406e (GEOMESA-3061 Converters - support bytes in Avro top-level union types (#2762))
<<<<<<< HEAD
>>>>>>> b1c506839 (GEOMESA-3061 Converters - support bytes in Avro top-level union types (#2762))
>>>>>>> f71fa3c0e (GEOMESA-3061 Converters - support bytes in Avro top-level union types (#2762))
<<<<<<< HEAD
>>>>>>> 07a6a5c291 (GEOMESA-3061 Converters - support bytes in Avro top-level union types (#2762))
=======
=======
>>>>>>> b4320946b4 (GEOMESA-3061 Converters - support bytes in Avro top-level union types (#2762))
=======
=======
        Expression("avroBinaryList(avroPath($0, '/content$type=TObj/foo'))").apply(Array(decoded)) must beNull
>>>>>>> 1ba2f23b3 (GEOMESA-3071 Move all converter state into evaluation context)
        Expression("avroBinaryList(avroPath($0, '/content$type=TObj/foo'))").eval(Array(decoded)) must beNull
        Expression("avroBinaryMap(avroPath($0, '/content$type=TObj/foo'))").apply(Array(decoded)) must beNull
        Expression("avroBinaryMap(avroPath($0, '/content$type=TObj/foo'))").eval(Array(decoded)) must beNull
<<<<<<< HEAD
>>>>>>> b9bdd406e (GEOMESA-3061 Converters - support bytes in Avro top-level union types (#2762))
<<<<<<< HEAD
<<<<<<< HEAD
>>>>>>> cdb410251 (GEOMESA-3061 Converters - support bytes in Avro top-level union types (#2762))
<<<<<<< HEAD
>>>>>>> 67b361c856 (GEOMESA-3061 Converters - support bytes in Avro top-level union types (#2762))
=======
=======
=======
        Expression("avroBinaryUuid(avroPath($0, '/content$type=TObj/foo'))").apply(Array(decoded)) must beNull
>>>>>>> 1ba2f23b3 (GEOMESA-3071 Move all converter state into evaluation context)
>>>>>>> 0d80bae0c (GEOMESA-3071 Move all converter state into evaluation context)
<<<<<<< HEAD
>>>>>>> 149b7a7809 (GEOMESA-3071 Move all converter state into evaluation context)
=======
=======
=======
<<<<<<< HEAD
>>>>>>> 6eb31fb65 (GEOMESA-3061 Converters - support bytes in Avro top-level union types (#2762))
=======
>>>>>>> 07a6a5c29 (GEOMESA-3061 Converters - support bytes in Avro top-level union types (#2762))
=======
>>>>>>> d6616d893 (GEOMESA-3061 Converters - support bytes in Avro top-level union types (#2762))
=======
=======
=======
        Expression("avroBinaryList(avroPath($0, '/content$type=TObj/foo'))").apply(Array(decoded)) must beNull
>>>>>>> 1ba2f23b3 (GEOMESA-3071 Move all converter state into evaluation context)
>>>>>>> dd5d6434b (GEOMESA-3071 Move all converter state into evaluation context)
        Expression("avroBinaryList(avroPath($0, '/content$type=TObj/foo'))").eval(Array(decoded)) must beNull
        Expression("avroBinaryMap(avroPath($0, '/content$type=TObj/foo'))").apply(Array(decoded)) must beNull
        Expression("avroBinaryMap(avroPath($0, '/content$type=TObj/foo'))").eval(Array(decoded)) must beNull
<<<<<<< HEAD
>>>>>>> b9bdd406e (GEOMESA-3061 Converters - support bytes in Avro top-level union types (#2762))
<<<<<<< HEAD
>>>>>>> a9f01eaaf (GEOMESA-3061 Converters - support bytes in Avro top-level union types (#2762))
<<<<<<< HEAD
>>>>>>> 7e68948ac (GEOMESA-3061 Converters - support bytes in Avro top-level union types (#2762))
<<<<<<< HEAD
>>>>>>> d6616d893e (GEOMESA-3061 Converters - support bytes in Avro top-level union types (#2762))
=======
=======
=======
=======
        Expression("avroBinaryUuid(avroPath($0, '/content$type=TObj/foo'))").apply(Array(decoded)) must beNull
>>>>>>> 1ba2f23b3 (GEOMESA-3071 Move all converter state into evaluation context)
>>>>>>> dd5d6434b (GEOMESA-3071 Move all converter state into evaluation context)
<<<<<<< HEAD
<<<<<<< HEAD
>>>>>>> 686339d05 (GEOMESA-3071 Move all converter state into evaluation context)
<<<<<<< HEAD
<<<<<<< HEAD
>>>>>>> 5ba418ba6c (GEOMESA-3071 Move all converter state into evaluation context)
=======
=======
>>>>>>> 6bd64e6308 (GEOMESA-3061 Converters - support bytes in Avro top-level union types (#2762))
=======
=======
        Expression("avroBinaryList(avroPath($0, '/content$type=TObj/foo'))").apply(Array(decoded)) must beNull
>>>>>>> 1ba2f23b3 (GEOMESA-3071 Move all converter state into evaluation context)
        Expression("avroBinaryList(avroPath($0, '/content$type=TObj/foo'))").eval(Array(decoded)) must beNull
        Expression("avroBinaryMap(avroPath($0, '/content$type=TObj/foo'))").apply(Array(decoded)) must beNull
        Expression("avroBinaryMap(avroPath($0, '/content$type=TObj/foo'))").eval(Array(decoded)) must beNull
<<<<<<< HEAD
>>>>>>> b9bdd406e (GEOMESA-3061 Converters - support bytes in Avro top-level union types (#2762))
<<<<<<< HEAD
<<<<<<< HEAD
>>>>>>> b1c506839 (GEOMESA-3061 Converters - support bytes in Avro top-level union types (#2762))
>>>>>>> f71fa3c0e (GEOMESA-3061 Converters - support bytes in Avro top-level union types (#2762))
>>>>>>> 6eb31fb65 (GEOMESA-3061 Converters - support bytes in Avro top-level union types (#2762))
>>>>>>> 28e2bfa2dc (GEOMESA-3061 Converters - support bytes in Avro top-level union types (#2762))
=======
>>>>>>> b4320946b4 (GEOMESA-3061 Converters - support bytes in Avro top-level union types (#2762))
=======
=======
        Expression("avroBinaryUuid(avroPath($0, '/content$type=TObj/foo'))").apply(Array(decoded)) must beNull
>>>>>>> 1ba2f23b3 (GEOMESA-3071 Move all converter state into evaluation context)
>>>>>>> 0f4c829f25 (GEOMESA-3071 Move all converter state into evaluation context)
=======
=======
=======
=======
        Expression("avroBinaryList(avroPath($0, '/content$type=TObj/foo'))").apply(Array(decoded)) must beNull
>>>>>>> 1ba2f23b3 (GEOMESA-3071 Move all converter state into evaluation context)
>>>>>>> dd5d6434b (GEOMESA-3071 Move all converter state into evaluation context)
        Expression("avroBinaryList(avroPath($0, '/content$type=TObj/foo'))").eval(Array(decoded)) must beNull
        Expression("avroBinaryMap(avroPath($0, '/content$type=TObj/foo'))").apply(Array(decoded)) must beNull
        Expression("avroBinaryMap(avroPath($0, '/content$type=TObj/foo'))").eval(Array(decoded)) must beNull
<<<<<<< HEAD
>>>>>>> b9bdd406e (GEOMESA-3061 Converters - support bytes in Avro top-level union types (#2762))
<<<<<<< HEAD
>>>>>>> a9f01eaaf (GEOMESA-3061 Converters - support bytes in Avro top-level union types (#2762))
<<<<<<< HEAD
>>>>>>> 314e6ef1a2 (GEOMESA-3061 Converters - support bytes in Avro top-level union types (#2762))
=======
=======
=======
        Expression("avroBinaryUuid(avroPath($0, '/content$type=TObj/foo'))").apply(Array(decoded)) must beNull
>>>>>>> 1ba2f23b3 (GEOMESA-3071 Move all converter state into evaluation context)
>>>>>>> dd5d6434b (GEOMESA-3071 Move all converter state into evaluation context)
>>>>>>> 455aae09d3 (GEOMESA-3071 Move all converter state into evaluation context)
=======
>>>>>>> 3be8d2a5a4 (Merge branch 'feature/postgis-fixes')
        Expression("avroBinaryUuid(avroPath($0, '/content$type=TObj/foo'))").eval(Array(decoded)) must beNull
>>>>>>> b9bdd406e3 (GEOMESA-3061 Converters - support bytes in Avro top-level union types (#2762))
=======
=======
        Expression("avroBinaryList(avroPath($0, '/content$type=TObj/foo'))").apply(Array(decoded)) must beNull
>>>>>>> 74661c3147 (GEOMESA-3071 Move all converter state into evaluation context)
        Expression("avroBinaryList(avroPath($0, '/content$type=TObj/foo'))").eval(Array(decoded)) must beNull
        Expression("avroBinaryMap(avroPath($0, '/content$type=TObj/foo'))").apply(Array(decoded)) must beNull
        Expression("avroBinaryMap(avroPath($0, '/content$type=TObj/foo'))").eval(Array(decoded)) must beNull
        Expression("avroBinaryUuid(avroPath($0, '/content$type=TObj/foo'))").apply(Array(decoded)) must beNull
=======
>>>>>>> 6bd64e6308 (GEOMESA-3061 Converters - support bytes in Avro top-level union types (#2762))
=======
=======
        Expression("avroBinaryUuid(avroPath($0, '/content$type=TObj/foo'))").apply(Array(decoded)) must beNull
>>>>>>> 1ba2f23b3 (GEOMESA-3071 Move all converter state into evaluation context)
>>>>>>> 55b43ae566 (GEOMESA-3071 Move all converter state into evaluation context)
=======
>>>>>>> cdb410251 (GEOMESA-3061 Converters - support bytes in Avro top-level union types (#2762))
>>>>>>> 9d708b240a (GEOMESA-3061 Converters - support bytes in Avro top-level union types (#2762))
=======
=======
        Expression("avroBinaryList(avroPath($0, '/content$type=TObj/foo'))").apply(Array(decoded)) must beNull
>>>>>>> 1ba2f23b3 (GEOMESA-3071 Move all converter state into evaluation context)
        Expression("avroBinaryList(avroPath($0, '/content$type=TObj/foo'))").eval(Array(decoded)) must beNull
        Expression("avroBinaryMap(avroPath($0, '/content$type=TObj/foo'))").apply(Array(decoded)) must beNull
        Expression("avroBinaryMap(avroPath($0, '/content$type=TObj/foo'))").eval(Array(decoded)) must beNull
<<<<<<< HEAD
>>>>>>> b9bdd406e (GEOMESA-3061 Converters - support bytes in Avro top-level union types (#2762))
<<<<<<< HEAD
<<<<<<< HEAD
>>>>>>> b1c506839 (GEOMESA-3061 Converters - support bytes in Avro top-level union types (#2762))
>>>>>>> f71fa3c0e (GEOMESA-3061 Converters - support bytes in Avro top-level union types (#2762))
<<<<<<< HEAD
>>>>>>> c5e1827657 (GEOMESA-3061 Converters - support bytes in Avro top-level union types (#2762))
=======
=======
>>>>>>> cdb410251 (GEOMESA-3061 Converters - support bytes in Avro top-level union types (#2762))
<<<<<<< HEAD
>>>>>>> 9d708b240a (GEOMESA-3061 Converters - support bytes in Avro top-level union types (#2762))
=======
=======
=======
        Expression("avroBinaryUuid(avroPath($0, '/content$type=TObj/foo'))").apply(Array(decoded)) must beNull
>>>>>>> 1ba2f23b3 (GEOMESA-3071 Move all converter state into evaluation context)
>>>>>>> 0d80bae0c (GEOMESA-3071 Move all converter state into evaluation context)
<<<<<<< HEAD
>>>>>>> cb7d3570f5 (GEOMESA-3071 Move all converter state into evaluation context)
=======
=======
=======
=======
=======
        Expression("avroBinaryList(avroPath($0, '/content$type=TObj/foo'))").apply(Array(decoded)) must beNull
>>>>>>> 1ba2f23b3 (GEOMESA-3071 Move all converter state into evaluation context)
>>>>>>> dd5d6434b (GEOMESA-3071 Move all converter state into evaluation context)
        Expression("avroBinaryList(avroPath($0, '/content$type=TObj/foo'))").eval(Array(decoded)) must beNull
        Expression("avroBinaryMap(avroPath($0, '/content$type=TObj/foo'))").apply(Array(decoded)) must beNull
        Expression("avroBinaryMap(avroPath($0, '/content$type=TObj/foo'))").eval(Array(decoded)) must beNull
<<<<<<< HEAD
>>>>>>> b9bdd406e (GEOMESA-3061 Converters - support bytes in Avro top-level union types (#2762))
<<<<<<< HEAD
>>>>>>> a9f01eaaf (GEOMESA-3061 Converters - support bytes in Avro top-level union types (#2762))
<<<<<<< HEAD
>>>>>>> 7e68948ac (GEOMESA-3061 Converters - support bytes in Avro top-level union types (#2762))
<<<<<<< HEAD
>>>>>>> 9990cd7dc7 (GEOMESA-3061 Converters - support bytes in Avro top-level union types (#2762))
=======
=======
=======
=======
        Expression("avroBinaryUuid(avroPath($0, '/content$type=TObj/foo'))").apply(Array(decoded)) must beNull
>>>>>>> 1ba2f23b3 (GEOMESA-3071 Move all converter state into evaluation context)
>>>>>>> dd5d6434b (GEOMESA-3071 Move all converter state into evaluation context)
>>>>>>> 686339d05 (GEOMESA-3071 Move all converter state into evaluation context)
>>>>>>> 6ac55e1ef7 (GEOMESA-3071 Move all converter state into evaluation context)
=======
=======
<<<<<<< HEAD
=======
>>>>>>> 07a6a5c29 (GEOMESA-3061 Converters - support bytes in Avro top-level union types (#2762))
=======
>>>>>>> locationtech-main
=======
=======
<<<<<<< HEAD
<<<<<<< HEAD
>>>>>>> 0e68e9f4c (GEOMESA-3061 Converters - support bytes in Avro top-level union types (#2762))
=======
>>>>>>> 149b7a780 (GEOMESA-3071 Move all converter state into evaluation context)
=======
=======
        Expression("avroBinaryList(avroPath($0, '/content$type=TObj/foo'))").apply(Array(decoded)) must beNull
>>>>>>> 1ba2f23b3 (GEOMESA-3071 Move all converter state into evaluation context)
<<<<<<< HEAD
        Expression("avroBinaryList(avroPath($0, '/content$type=TObj/foo'))").eval(Array(decoded)) must beNull
        Expression("avroBinaryMap(avroPath($0, '/content$type=TObj/foo'))").apply(Array(decoded)) must beNull
        Expression("avroBinaryMap(avroPath($0, '/content$type=TObj/foo'))").eval(Array(decoded)) must beNull
<<<<<<< HEAD
>>>>>>> b9bdd406e (GEOMESA-3061 Converters - support bytes in Avro top-level union types (#2762))
<<<<<<< HEAD
<<<<<<< HEAD
>>>>>>> b1c506839 (GEOMESA-3061 Converters - support bytes in Avro top-level union types (#2762))
>>>>>>> f71fa3c0e (GEOMESA-3061 Converters - support bytes in Avro top-level union types (#2762))
>>>>>>> 6eb31fb65 (GEOMESA-3061 Converters - support bytes in Avro top-level union types (#2762))
<<<<<<< HEAD
>>>>>>> 5f428db977 (GEOMESA-3061 Converters - support bytes in Avro top-level union types (#2762))
=======
=======
>>>>>>> 0e68e9f4c (GEOMESA-3061 Converters - support bytes in Avro top-level union types (#2762))
<<<<<<< HEAD
>>>>>>> 76618c8da3 (GEOMESA-3061 Converters - support bytes in Avro top-level union types (#2762))
=======
=======
=======
        Expression("avroBinaryUuid(avroPath($0, '/content$type=TObj/foo'))").apply(Array(decoded)) must beNull
>>>>>>> 1ba2f23b3 (GEOMESA-3071 Move all converter state into evaluation context)
>>>>>>> f3a49e082 (GEOMESA-3071 Move all converter state into evaluation context)
<<<<<<< HEAD
>>>>>>> 8caee74520 (GEOMESA-3071 Move all converter state into evaluation context)
=======
=======
=======
=======
>>>>>>> 5ba418ba6 (GEOMESA-3071 Move all converter state into evaluation context)
=======
=======
        Expression("avroBinaryList(avroPath($0, '/content$type=TObj/foo'))").apply(Array(decoded)) must beNull
>>>>>>> 1ba2f23b3 (GEOMESA-3071 Move all converter state into evaluation context)
>>>>>>> dd5d6434b (GEOMESA-3071 Move all converter state into evaluation context)
<<<<<<< HEAD
        Expression("avroBinaryList(avroPath($0, '/content$type=TObj/foo'))").eval(Array(decoded)) must beNull
        Expression("avroBinaryMap(avroPath($0, '/content$type=TObj/foo'))").apply(Array(decoded)) must beNull
        Expression("avroBinaryMap(avroPath($0, '/content$type=TObj/foo'))").eval(Array(decoded)) must beNull
<<<<<<< HEAD
>>>>>>> b9bdd406e (GEOMESA-3061 Converters - support bytes in Avro top-level union types (#2762))
<<<<<<< HEAD
>>>>>>> a9f01eaaf (GEOMESA-3061 Converters - support bytes in Avro top-level union types (#2762))
<<<<<<< HEAD
>>>>>>> 4073c9b17 (GEOMESA-3061 Converters - support bytes in Avro top-level union types (#2762))
<<<<<<< HEAD
>>>>>>> 61208268cd (GEOMESA-3061 Converters - support bytes in Avro top-level union types (#2762))
=======
=======
=======
=======
        Expression("avroBinaryUuid(avroPath($0, '/content$type=TObj/foo'))").apply(Array(decoded)) must beNull
>>>>>>> 1ba2f23b3 (GEOMESA-3071 Move all converter state into evaluation context)
>>>>>>> dd5d6434b (GEOMESA-3071 Move all converter state into evaluation context)
>>>>>>> 628900700 (GEOMESA-3071 Move all converter state into evaluation context)
<<<<<<< HEAD
>>>>>>> 0166e9455b (GEOMESA-3071 Move all converter state into evaluation context)
=======
=======
=======
>>>>>>> 0d80bae0c (GEOMESA-3071 Move all converter state into evaluation context)
>>>>>>> 149b7a780 (GEOMESA-3071 Move all converter state into evaluation context)
        Expression("avroBinaryList(avroPath($0, '/content$type=TObj/foo'))").eval(Array(decoded)) must beNull
        Expression("avroBinaryMap(avroPath($0, '/content$type=TObj/foo'))").apply(Array(decoded)) must beNull
        Expression("avroBinaryMap(avroPath($0, '/content$type=TObj/foo'))").eval(Array(decoded)) must beNull
<<<<<<< HEAD
>>>>>>> b9bdd406e (GEOMESA-3061 Converters - support bytes in Avro top-level union types (#2762))
<<<<<<< HEAD
>>>>>>> b1c506839 (GEOMESA-3061 Converters - support bytes in Avro top-level union types (#2762))
>>>>>>> f71fa3c0e (GEOMESA-3061 Converters - support bytes in Avro top-level union types (#2762))
<<<<<<< HEAD
>>>>>>> 07a6a5c29 (GEOMESA-3061 Converters - support bytes in Avro top-level union types (#2762))
<<<<<<< HEAD
>>>>>>> 89bdd3013e (GEOMESA-3061 Converters - support bytes in Avro top-level union types (#2762))
=======
=======
=======
>>>>>>> b4320946b (GEOMESA-3061 Converters - support bytes in Avro top-level union types (#2762))
=======
=======
        Expression("avroBinaryList(avroPath($0, '/content$type=TObj/foo'))").apply(Array(decoded)) must beNull
>>>>>>> 1ba2f23b3 (GEOMESA-3071 Move all converter state into evaluation context)
        Expression("avroBinaryList(avroPath($0, '/content$type=TObj/foo'))").eval(Array(decoded)) must beNull
        Expression("avroBinaryMap(avroPath($0, '/content$type=TObj/foo'))").apply(Array(decoded)) must beNull
        Expression("avroBinaryMap(avroPath($0, '/content$type=TObj/foo'))").eval(Array(decoded)) must beNull
<<<<<<< HEAD
>>>>>>> b9bdd406e (GEOMESA-3061 Converters - support bytes in Avro top-level union types (#2762))
<<<<<<< HEAD
<<<<<<< HEAD
>>>>>>> cdb410251 (GEOMESA-3061 Converters - support bytes in Avro top-level union types (#2762))
<<<<<<< HEAD
>>>>>>> 67b361c85 (GEOMESA-3061 Converters - support bytes in Avro top-level union types (#2762))
<<<<<<< HEAD
>>>>>>> c8a325e13c (GEOMESA-3061 Converters - support bytes in Avro top-level union types (#2762))
=======
=======
=======
=======
        Expression("avroBinaryUuid(avroPath($0, '/content$type=TObj/foo'))").apply(Array(decoded)) must beNull
>>>>>>> 1ba2f23b3 (GEOMESA-3071 Move all converter state into evaluation context)
>>>>>>> 0d80bae0c (GEOMESA-3071 Move all converter state into evaluation context)
<<<<<<< HEAD
>>>>>>> 149b7a780 (GEOMESA-3071 Move all converter state into evaluation context)
<<<<<<< HEAD
>>>>>>> e734e4d064 (GEOMESA-3071 Move all converter state into evaluation context)
=======
=======
=======
=======
=======
>>>>>>> 5ba418ba6 (GEOMESA-3071 Move all converter state into evaluation context)
        Expression("avroBinaryList(avroPath($0, '/content$type=TObj/foo'))").eval(Array(decoded)) must beNull
        Expression("avroBinaryMap(avroPath($0, '/content$type=TObj/foo'))").apply(Array(decoded)) must beNull
        Expression("avroBinaryMap(avroPath($0, '/content$type=TObj/foo'))").eval(Array(decoded)) must beNull
<<<<<<< HEAD
>>>>>>> b9bdd406e (GEOMESA-3061 Converters - support bytes in Avro top-level union types (#2762))
<<<<<<< HEAD
>>>>>>> a9f01eaaf (GEOMESA-3061 Converters - support bytes in Avro top-level union types (#2762))
<<<<<<< HEAD
>>>>>>> 7e68948ac (GEOMESA-3061 Converters - support bytes in Avro top-level union types (#2762))
<<<<<<< HEAD
>>>>>>> d6616d893 (GEOMESA-3061 Converters - support bytes in Avro top-level union types (#2762))
<<<<<<< HEAD
>>>>>>> 4f0e2712ab (GEOMESA-3061 Converters - support bytes in Avro top-level union types (#2762))
=======
=======
=======
=======
=======
        Expression("avroBinaryUuid(avroPath($0, '/content$type=TObj/foo'))").apply(Array(decoded)) must beNull
>>>>>>> 1ba2f23b3 (GEOMESA-3071 Move all converter state into evaluation context)
>>>>>>> dd5d6434b (GEOMESA-3071 Move all converter state into evaluation context)
>>>>>>> 686339d05 (GEOMESA-3071 Move all converter state into evaluation context)
>>>>>>> 5ba418ba6 (GEOMESA-3071 Move all converter state into evaluation context)
<<<<<<< HEAD
>>>>>>> d1cf3ad8b5 (GEOMESA-3071 Move all converter state into evaluation context)
=======
=======
        Expression("avroBinaryList(avroPath($0, '/content$type=TObj/foo'))").eval(Array(decoded)) must beNull
        Expression("avroBinaryMap(avroPath($0, '/content$type=TObj/foo'))").eval(Array(decoded)) must beNull
>>>>>>> b9bdd406e (GEOMESA-3061 Converters - support bytes in Avro top-level union types (#2762))
>>>>>>> b1c506839 (GEOMESA-3061 Converters - support bytes in Avro top-level union types (#2762))
>>>>>>> f71fa3c0e (GEOMESA-3061 Converters - support bytes in Avro top-level union types (#2762))
>>>>>>> 6eb31fb65 (GEOMESA-3061 Converters - support bytes in Avro top-level union types (#2762))
>>>>>>> 28e2bfa2d (GEOMESA-3061 Converters - support bytes in Avro top-level union types (#2762))
<<<<<<< HEAD
>>>>>>> 72bafaf54b (GEOMESA-3061 Converters - support bytes in Avro top-level union types (#2762))
=======
=======
>>>>>>> b4320946b (GEOMESA-3061 Converters - support bytes in Avro top-level union types (#2762))
<<<<<<< HEAD
>>>>>>> 97ec7d864a (GEOMESA-3061 Converters - support bytes in Avro top-level union types (#2762))
=======
=======
=======
        Expression("avroBinaryUuid(avroPath($0, '/content$type=TObj/foo'))").apply(Array(decoded)) must beNull
>>>>>>> 1ba2f23b3 (GEOMESA-3071 Move all converter state into evaluation context)
>>>>>>> 0f4c829f2 (GEOMESA-3071 Move all converter state into evaluation context)
<<<<<<< HEAD
>>>>>>> 25e967804c (GEOMESA-3071 Move all converter state into evaluation context)
=======
=======
=======
=======
=======
        Expression("avroBinaryList(avroPath($0, '/content$type=TObj/foo'))").apply(Array(decoded)) must beNull
>>>>>>> 1ba2f23b3 (GEOMESA-3071 Move all converter state into evaluation context)
>>>>>>> dd5d6434b (GEOMESA-3071 Move all converter state into evaluation context)
        Expression("avroBinaryList(avroPath($0, '/content$type=TObj/foo'))").eval(Array(decoded)) must beNull
        Expression("avroBinaryMap(avroPath($0, '/content$type=TObj/foo'))").apply(Array(decoded)) must beNull
        Expression("avroBinaryMap(avroPath($0, '/content$type=TObj/foo'))").eval(Array(decoded)) must beNull
<<<<<<< HEAD
>>>>>>> b9bdd406e (GEOMESA-3061 Converters - support bytes in Avro top-level union types (#2762))
<<<<<<< HEAD
>>>>>>> a9f01eaaf (GEOMESA-3061 Converters - support bytes in Avro top-level union types (#2762))
<<<<<<< HEAD
>>>>>>> 314e6ef1a (GEOMESA-3061 Converters - support bytes in Avro top-level union types (#2762))
<<<<<<< HEAD
>>>>>>> 91bbd30a52 (GEOMESA-3061 Converters - support bytes in Avro top-level union types (#2762))
=======
=======
=======
=======
        Expression("avroBinaryUuid(avroPath($0, '/content$type=TObj/foo'))").apply(Array(decoded)) must beNull
>>>>>>> 1ba2f23b3 (GEOMESA-3071 Move all converter state into evaluation context)
>>>>>>> dd5d6434b (GEOMESA-3071 Move all converter state into evaluation context)
>>>>>>> 455aae09d (GEOMESA-3071 Move all converter state into evaluation context)
<<<<<<< HEAD
>>>>>>> a2ac294bf3 (GEOMESA-3071 Move all converter state into evaluation context)
=======
=======
>>>>>>> 3be8d2a5a (Merge branch 'feature/postgis-fixes')
>>>>>>> db8d998aa2 (Merge branch 'feature/postgis-fixes')
        Expression("avroBinaryUuid(avroPath($0, '/content$type=TObj/foo'))").eval(Array(decoded)) must beNull
>>>>>>> b9bdd406e (GEOMESA-3061 Converters - support bytes in Avro top-level union types (#2762))
>>>>>>> d9ed077cd1 (GEOMESA-3061 Converters - support bytes in Avro top-level union types (#2762))
=======
>>>>>>> d845d7c1bd (GEOMESA-3254 Add Bloop build support)
=======
>>>>>>> 58d14a257e (GEOMESA-3254 Add Bloop build support)
=======
=======
<<<<<<< HEAD
=======
        exp.apply(Array(decoded)) mustEqual "foo"
>>>>>>> 1ba2f23b3 (GEOMESA-3071 Move all converter state into evaluation context)
<<<<<<< HEAD
<<<<<<< HEAD
<<<<<<< HEAD
<<<<<<< HEAD
<<<<<<< HEAD
<<<<<<< HEAD
=======
>>>>>>> 7e68948ac (GEOMESA-3061 Converters - support bytes in Avro top-level union types (#2762))
=======
>>>>>>> 686339d05 (GEOMESA-3071 Move all converter state into evaluation context)
=======
>>>>>>> 6eb31fb65 (GEOMESA-3061 Converters - support bytes in Avro top-level union types (#2762))
=======
        exp.apply(Array(decoded)) mustEqual "foo"
=======
<<<<<<< HEAD
>>>>>>> b9bdd406e (GEOMESA-3061 Converters - support bytes in Avro top-level union types (#2762))
>>>>>>> a9f01eaaf (GEOMESA-3061 Converters - support bytes in Avro top-level union types (#2762))
<<<<<<< HEAD
<<<<<<< HEAD
=======
<<<<<<< HEAD
=======
<<<<<<< HEAD
<<<<<<< HEAD
<<<<<<< HEAD
>>>>>>> f71fa3c0e (GEOMESA-3061 Converters - support bytes in Avro top-level union types (#2762))
=======
>>>>>>> 0d80bae0c (GEOMESA-3071 Move all converter state into evaluation context)
=======
>>>>>>> 7e68948ac (GEOMESA-3061 Converters - support bytes in Avro top-level union types (#2762))
=======
>>>>>>> f3a49e082 (GEOMESA-3071 Move all converter state into evaluation context)
=======
>>>>>>> 4073c9b17 (GEOMESA-3061 Converters - support bytes in Avro top-level union types (#2762))
=======
=======
<<<<<<< HEAD
>>>>>>> dd5d6434b (GEOMESA-3071 Move all converter state into evaluation context)
<<<<<<< HEAD
>>>>>>> 628900700 (GEOMESA-3071 Move all converter state into evaluation context)
=======
=======
<<<<<<< HEAD
<<<<<<< HEAD
<<<<<<< HEAD
>>>>>>> f71fa3c0e (GEOMESA-3061 Converters - support bytes in Avro top-level union types (#2762))
>>>>>>> 07a6a5c29 (GEOMESA-3061 Converters - support bytes in Avro top-level union types (#2762))
=======
>>>>>>> 0f4c829f2 (GEOMESA-3071 Move all converter state into evaluation context)
=======
>>>>>>> 314e6ef1a (GEOMESA-3061 Converters - support bytes in Avro top-level union types (#2762))
=======
=======
>>>>>>> dd5d6434b (GEOMESA-3071 Move all converter state into evaluation context)
>>>>>>> 455aae09d (GEOMESA-3071 Move all converter state into evaluation context)
        exp.apply(Array(decoded)) mustEqual "foo"
=======
>>>>>>> b9bdd406e (GEOMESA-3061 Converters - support bytes in Avro top-level union types (#2762))
=======
        exp.apply(Array(decoded)) mustEqual "foo"
>>>>>>> 1ba2f23b3 (GEOMESA-3071 Move all converter state into evaluation context)
<<<<<<< HEAD
<<<<<<< HEAD
<<<<<<< HEAD
<<<<<<< HEAD
<<<<<<< HEAD
<<<<<<< HEAD
<<<<<<< HEAD
<<<<<<< HEAD
<<<<<<< HEAD
<<<<<<< HEAD
>>>>>>> dd5d6434b (GEOMESA-3071 Move all converter state into evaluation context)
=======
>>>>>>> locationtech-main
=======
>>>>>>> b9bdd406e (GEOMESA-3061 Converters - support bytes in Avro top-level union types (#2762))
>>>>>>> b1c506839 (GEOMESA-3061 Converters - support bytes in Avro top-level union types (#2762))
>>>>>>> f71fa3c0e (GEOMESA-3061 Converters - support bytes in Avro top-level union types (#2762))
<<<<<<< HEAD
<<<<<<< HEAD
<<<<<<< HEAD
=======
>>>>>>> 7e68948ac (GEOMESA-3061 Converters - support bytes in Avro top-level union types (#2762))
=======
>>>>>>> 4073c9b17 (GEOMESA-3061 Converters - support bytes in Avro top-level union types (#2762))
=======
>>>>>>> 628900700 (GEOMESA-3071 Move all converter state into evaluation context)
=======
>>>>>>> 07a6a5c29 (GEOMESA-3061 Converters - support bytes in Avro top-level union types (#2762))
=======
>>>>>>> 67b361c85 (GEOMESA-3061 Converters - support bytes in Avro top-level union types (#2762))
=======
>>>>>>> 28e2bfa2d (GEOMESA-3061 Converters - support bytes in Avro top-level union types (#2762))
=======
>>>>>>> 314e6ef1a (GEOMESA-3061 Converters - support bytes in Avro top-level union types (#2762))
=======
>>>>>>> 455aae09d (GEOMESA-3071 Move all converter state into evaluation context)
=======
        exp.apply(Array(decoded)) mustEqual "foo"
=======
>>>>>>> b9bdd406e (GEOMESA-3061 Converters - support bytes in Avro top-level union types (#2762))
<<<<<<< HEAD
<<<<<<< HEAD
<<<<<<< HEAD
<<<<<<< HEAD
>>>>>>> cdb410251 (GEOMESA-3061 Converters - support bytes in Avro top-level union types (#2762))
=======
>>>>>>> 0d80bae0c (GEOMESA-3071 Move all converter state into evaluation context)
<<<<<<< HEAD
<<<<<<< HEAD
=======
>>>>>>> a9f01eaaf (GEOMESA-3061 Converters - support bytes in Avro top-level union types (#2762))
<<<<<<< HEAD
<<<<<<< HEAD
>>>>>>> 7e68948ac (GEOMESA-3061 Converters - support bytes in Avro top-level union types (#2762))
=======
>>>>>>> dd5d6434b (GEOMESA-3071 Move all converter state into evaluation context)
<<<<<<< HEAD
>>>>>>> 686339d05 (GEOMESA-3071 Move all converter state into evaluation context)
=======
>>>>>>> 6eb31fb65 (GEOMESA-3061 Converters - support bytes in Avro top-level union types (#2762))
=======
        exp.apply(Array(decoded)) mustEqual "foo"
=======
>>>>>>> b9bdd406e (GEOMESA-3061 Converters - support bytes in Avro top-level union types (#2762))
>>>>>>> 0e68e9f4c (GEOMESA-3061 Converters - support bytes in Avro top-level union types (#2762))
=======
>>>>>>> f3a49e082 (GEOMESA-3071 Move all converter state into evaluation context)
=======
>>>>>>> a9f01eaaf (GEOMESA-3061 Converters - support bytes in Avro top-level union types (#2762))
>>>>>>> 4073c9b17 (GEOMESA-3061 Converters - support bytes in Avro top-level union types (#2762))
=======
=======
>>>>>>> dd5d6434b (GEOMESA-3071 Move all converter state into evaluation context)
>>>>>>> 628900700 (GEOMESA-3071 Move all converter state into evaluation context)
=======
=======
>>>>>>> locationtech-main
=======
>>>>>>> b9bdd406e (GEOMESA-3061 Converters - support bytes in Avro top-level union types (#2762))
>>>>>>> b1c506839 (GEOMESA-3061 Converters - support bytes in Avro top-level union types (#2762))
>>>>>>> f71fa3c0e (GEOMESA-3061 Converters - support bytes in Avro top-level union types (#2762))
>>>>>>> 07a6a5c29 (GEOMESA-3061 Converters - support bytes in Avro top-level union types (#2762))
=======
>>>>>>> cdb410251 (GEOMESA-3061 Converters - support bytes in Avro top-level union types (#2762))
>>>>>>> 67b361c85 (GEOMESA-3061 Converters - support bytes in Avro top-level union types (#2762))
=======
>>>>>>> 149b7a780 (GEOMESA-3071 Move all converter state into evaluation context)
=======
=======
>>>>>>> 7e68948ac (GEOMESA-3061 Converters - support bytes in Avro top-level union types (#2762))
<<<<<<< HEAD
>>>>>>> d6616d893 (GEOMESA-3061 Converters - support bytes in Avro top-level union types (#2762))
=======
=======
=======
>>>>>>> dd5d6434b (GEOMESA-3071 Move all converter state into evaluation context)
>>>>>>> 686339d05 (GEOMESA-3071 Move all converter state into evaluation context)
<<<<<<< HEAD
>>>>>>> 5ba418ba6 (GEOMESA-3071 Move all converter state into evaluation context)
=======
=======
>>>>>>> 6eb31fb65 (GEOMESA-3061 Converters - support bytes in Avro top-level union types (#2762))
>>>>>>> 28e2bfa2d (GEOMESA-3061 Converters - support bytes in Avro top-level union types (#2762))
=======
        exp.apply(Array(decoded)) mustEqual "foo"
=======
>>>>>>> b9bdd406e (GEOMESA-3061 Converters - support bytes in Avro top-level union types (#2762))
>>>>>>> b4320946b (GEOMESA-3061 Converters - support bytes in Avro top-level union types (#2762))
=======
>>>>>>> 0f4c829f2 (GEOMESA-3071 Move all converter state into evaluation context)
=======
>>>>>>> a9f01eaaf (GEOMESA-3061 Converters - support bytes in Avro top-level union types (#2762))
>>>>>>> 314e6ef1a (GEOMESA-3061 Converters - support bytes in Avro top-level union types (#2762))
=======
=======
>>>>>>> dd5d6434b (GEOMESA-3071 Move all converter state into evaluation context)
>>>>>>> 455aae09d (GEOMESA-3071 Move all converter state into evaluation context)
=======
        exp.apply(Array(decoded)) mustEqual "foo"
>>>>>>> 3be8d2a5a (Merge branch 'feature/postgis-fixes')
=======
>>>>>>> 87bf55340 (GEOMESA-3061 Converters - support bytes in Avro top-level union types (#2762))
        exp.eval(Array(decoded)) mustEqual "foo"
      }

      "handle null values" >> {
<<<<<<< HEAD
<<<<<<< HEAD
<<<<<<< HEAD
<<<<<<< HEAD
<<<<<<< HEAD
<<<<<<< HEAD
<<<<<<< HEAD
<<<<<<< HEAD
<<<<<<< HEAD
<<<<<<< HEAD
<<<<<<< HEAD
<<<<<<< HEAD
<<<<<<< HEAD
<<<<<<< HEAD
<<<<<<< HEAD
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
>>>>>>> 28e2bfa2d (GEOMESA-3061 Converters - support bytes in Avro top-level union types (#2762))
=======
>>>>>>> 686339d05 (GEOMESA-3071 Move all converter state into evaluation context)
>>>>>>> 5ba418ba6 (GEOMESA-3071 Move all converter state into evaluation context)
=======
<<<<<<< HEAD
>>>>>>> d6616d893 (GEOMESA-3061 Converters - support bytes in Avro top-level union types (#2762))
=======
<<<<<<< HEAD
>>>>>>> 149b7a780 (GEOMESA-3071 Move all converter state into evaluation context)
=======
>>>>>>> dd5d6434b (GEOMESA-3071 Move all converter state into evaluation context)
<<<<<<< HEAD
>>>>>>> 5ba418ba6 (GEOMESA-3071 Move all converter state into evaluation context)
=======
>>>>>>> 6eb31fb65 (GEOMESA-3061 Converters - support bytes in Avro top-level union types (#2762))
=======
>>>>>>> 455aae09d (GEOMESA-3071 Move all converter state into evaluation context)
=======
>>>>>>> a9f01eaaf (GEOMESA-3061 Converters - support bytes in Avro top-level union types (#2762))
=======
>>>>>>> dd5d6434b (GEOMESA-3071 Move all converter state into evaluation context)
<<<<<<< HEAD
<<<<<<< HEAD
<<<<<<< HEAD
=======
>>>>>>> 6eb31fb65 (GEOMESA-3061 Converters - support bytes in Avro top-level union types (#2762))
>>>>>>> 28e2bfa2d (GEOMESA-3061 Converters - support bytes in Avro top-level union types (#2762))
=======
<<<<<<< HEAD
=======
<<<<<<< HEAD
<<<<<<< HEAD
>>>>>>> locationtech-main
=======
>>>>>>> b1c506839 (GEOMESA-3061 Converters - support bytes in Avro top-level union types (#2762))
>>>>>>> f71fa3c0e (GEOMESA-3061 Converters - support bytes in Avro top-level union types (#2762))
<<<<<<< HEAD
=======
>>>>>>> cdb410251 (GEOMESA-3061 Converters - support bytes in Avro top-level union types (#2762))
=======
>>>>>>> 0d80bae0c (GEOMESA-3071 Move all converter state into evaluation context)
<<<<<<< HEAD
<<<<<<< HEAD
=======
>>>>>>> d6616d893 (GEOMESA-3061 Converters - support bytes in Avro top-level union types (#2762))
=======
=======
>>>>>>> a9f01eaaf (GEOMESA-3061 Converters - support bytes in Avro top-level union types (#2762))
>>>>>>> 7e68948ac (GEOMESA-3061 Converters - support bytes in Avro top-level union types (#2762))
<<<<<<< HEAD
<<<<<<< HEAD
=======
=======
>>>>>>> 6eb31fb65 (GEOMESA-3061 Converters - support bytes in Avro top-level union types (#2762))
=======
>>>>>>> 07a6a5c29 (GEOMESA-3061 Converters - support bytes in Avro top-level union types (#2762))
=======
>>>>>>> 67b361c85 (GEOMESA-3061 Converters - support bytes in Avro top-level union types (#2762))
=======
>>>>>>> a9f01eaaf (GEOMESA-3061 Converters - support bytes in Avro top-level union types (#2762))
=======
>>>>>>> dd5d6434b (GEOMESA-3071 Move all converter state into evaluation context)
<<<<<<< HEAD
<<<<<<< HEAD
>>>>>>> 686339d05 (GEOMESA-3071 Move all converter state into evaluation context)
=======
=======
>>>>>>> 07a6a5c29 (GEOMESA-3061 Converters - support bytes in Avro top-level union types (#2762))
=======
=======
<<<<<<< HEAD
<<<<<<< HEAD
>>>>>>> locationtech-main
=======
>>>>>>> b1c506839 (GEOMESA-3061 Converters - support bytes in Avro top-level union types (#2762))
>>>>>>> f71fa3c0e (GEOMESA-3061 Converters - support bytes in Avro top-level union types (#2762))
<<<<<<< HEAD
<<<<<<< HEAD
>>>>>>> 6eb31fb65 (GEOMESA-3061 Converters - support bytes in Avro top-level union types (#2762))
=======
>>>>>>> 0e68e9f4c (GEOMESA-3061 Converters - support bytes in Avro top-level union types (#2762))
=======
>>>>>>> f3a49e082 (GEOMESA-3071 Move all converter state into evaluation context)
=======
=======
>>>>>>> a9f01eaaf (GEOMESA-3061 Converters - support bytes in Avro top-level union types (#2762))
>>>>>>> 4073c9b17 (GEOMESA-3061 Converters - support bytes in Avro top-level union types (#2762))
=======
=======
>>>>>>> a9f01eaaf (GEOMESA-3061 Converters - support bytes in Avro top-level union types (#2762))
=======
>>>>>>> dd5d6434b (GEOMESA-3071 Move all converter state into evaluation context)
>>>>>>> 628900700 (GEOMESA-3071 Move all converter state into evaluation context)
=======
>>>>>>> 07a6a5c29 (GEOMESA-3061 Converters - support bytes in Avro top-level union types (#2762))
=======
=======
>>>>>>> cdb410251 (GEOMESA-3061 Converters - support bytes in Avro top-level union types (#2762))
>>>>>>> 67b361c85 (GEOMESA-3061 Converters - support bytes in Avro top-level union types (#2762))
=======
>>>>>>> 149b7a780 (GEOMESA-3071 Move all converter state into evaluation context)
=======
>>>>>>> d6616d893 (GEOMESA-3061 Converters - support bytes in Avro top-level union types (#2762))
=======
=======
>>>>>>> 686339d05 (GEOMESA-3071 Move all converter state into evaluation context)
<<<<<<< HEAD
>>>>>>> 5ba418ba6 (GEOMESA-3071 Move all converter state into evaluation context)
=======
=======
>>>>>>> 6eb31fb65 (GEOMESA-3061 Converters - support bytes in Avro top-level union types (#2762))
>>>>>>> 28e2bfa2d (GEOMESA-3061 Converters - support bytes in Avro top-level union types (#2762))
=======
>>>>>>> b4320946b (GEOMESA-3061 Converters - support bytes in Avro top-level union types (#2762))
=======
>>>>>>> 0f4c829f2 (GEOMESA-3071 Move all converter state into evaluation context)
=======
=======
>>>>>>> a9f01eaaf (GEOMESA-3061 Converters - support bytes in Avro top-level union types (#2762))
>>>>>>> 314e6ef1a (GEOMESA-3061 Converters - support bytes in Avro top-level union types (#2762))
=======
>>>>>>> 455aae09d (GEOMESA-3071 Move all converter state into evaluation context)
=======
>>>>>>> 3be8d2a5a (Merge branch 'feature/postgis-fixes')
        Expression("avroBinaryList(avroPath($0, '/content$type=TObj/foo'))").apply(Array(decoded)) must beNull
        Expression("avroBinaryList(avroPath($0, '/content$type=TObj/foo'))").eval(Array(decoded)) must beNull
        Expression("avroBinaryMap(avroPath($0, '/content$type=TObj/foo'))").apply(Array(decoded)) must beNull
        Expression("avroBinaryMap(avroPath($0, '/content$type=TObj/foo'))").eval(Array(decoded)) must beNull
        Expression("avroBinaryUuid(avroPath($0, '/content$type=TObj/foo'))").apply(Array(decoded)) must beNull
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
=======
>>>>>>> f71fa3c0e (GEOMESA-3061 Converters - support bytes in Avro top-level union types (#2762))
=======
<<<<<<< HEAD
<<<<<<< HEAD
<<<<<<< HEAD
=======
>>>>>>> 07a6a5c29 (GEOMESA-3061 Converters - support bytes in Avro top-level union types (#2762))
=======
>>>>>>> 67b361c85 (GEOMESA-3061 Converters - support bytes in Avro top-level union types (#2762))
=======
>>>>>>> 149b7a780 (GEOMESA-3071 Move all converter state into evaluation context)
=======
>>>>>>> d6616d893 (GEOMESA-3061 Converters - support bytes in Avro top-level union types (#2762))
=======
>>>>>>> 5ba418ba6 (GEOMESA-3071 Move all converter state into evaluation context)
=======
=======
>>>>>>> 6eb31fb65 (GEOMESA-3061 Converters - support bytes in Avro top-level union types (#2762))
>>>>>>> 28e2bfa2d (GEOMESA-3061 Converters - support bytes in Avro top-level union types (#2762))
=======
<<<<<<< HEAD
=======
=======
>>>>>>> f71fa3c0e (GEOMESA-3061 Converters - support bytes in Avro top-level union types (#2762))
<<<<<<< HEAD
<<<<<<< HEAD
=======
>>>>>>> 4073c9b17 (GEOMESA-3061 Converters - support bytes in Avro top-level union types (#2762))
=======
>>>>>>> 628900700 (GEOMESA-3071 Move all converter state into evaluation context)
=======
>>>>>>> 07a6a5c29 (GEOMESA-3061 Converters - support bytes in Avro top-level union types (#2762))
=======
>>>>>>> 28e2bfa2d (GEOMESA-3061 Converters - support bytes in Avro top-level union types (#2762))
=======
>>>>>>> 7e68948ac (GEOMESA-3061 Converters - support bytes in Avro top-level union types (#2762))
=======
>>>>>>> 686339d05 (GEOMESA-3071 Move all converter state into evaluation context)
=======
>>>>>>> 6eb31fb65 (GEOMESA-3061 Converters - support bytes in Avro top-level union types (#2762))
=======
>>>>>>> 314e6ef1a (GEOMESA-3061 Converters - support bytes in Avro top-level union types (#2762))
=======
>>>>>>> 455aae09d (GEOMESA-3071 Move all converter state into evaluation context)
=======
        Expression("avroBinaryList(avroPath($0, '/content$type=TObj/foo'))").apply(Array(decoded)) must beNull
>>>>>>> 1ba2f23b3 (GEOMESA-3071 Move all converter state into evaluation context)
        Expression("avroBinaryList(avroPath($0, '/content$type=TObj/foo'))").eval(Array(decoded)) must beNull
        Expression("avroBinaryMap(avroPath($0, '/content$type=TObj/foo'))").apply(Array(decoded)) must beNull
        Expression("avroBinaryMap(avroPath($0, '/content$type=TObj/foo'))").eval(Array(decoded)) must beNull
<<<<<<< HEAD
>>>>>>> b9bdd406e (GEOMESA-3061 Converters - support bytes in Avro top-level union types (#2762))
=======
        Expression("avroBinaryUuid(avroPath($0, '/content$type=TObj/foo'))").apply(Array(decoded)) must beNull
>>>>>>> 1ba2f23b3 (GEOMESA-3071 Move all converter state into evaluation context)
<<<<<<< HEAD
<<<<<<< HEAD
<<<<<<< HEAD
<<<<<<< HEAD
=======
<<<<<<< HEAD
=======
>>>>>>> 6eb31fb65 (GEOMESA-3061 Converters - support bytes in Avro top-level union types (#2762))
=======
=======
=======
        Expression("avroBinaryList(avroPath($0, '/content$type=TObj/foo'))").apply(Array(decoded)) must beNull
>>>>>>> 1ba2f23b3 (GEOMESA-3071 Move all converter state into evaluation context)
>>>>>>> dd5d6434b (GEOMESA-3071 Move all converter state into evaluation context)
        Expression("avroBinaryList(avroPath($0, '/content$type=TObj/foo'))").eval(Array(decoded)) must beNull
        Expression("avroBinaryMap(avroPath($0, '/content$type=TObj/foo'))").apply(Array(decoded)) must beNull
        Expression("avroBinaryMap(avroPath($0, '/content$type=TObj/foo'))").eval(Array(decoded)) must beNull
>>>>>>> 28e2bfa2d (GEOMESA-3061 Converters - support bytes in Avro top-level union types (#2762))
<<<<<<< HEAD
<<<<<<< HEAD
<<<<<<< HEAD
<<<<<<< HEAD
=======
>>>>>>> locationtech-main
=======
=======
<<<<<<< HEAD
>>>>>>> cdb410251 (GEOMESA-3061 Converters - support bytes in Avro top-level union types (#2762))
=======
<<<<<<< HEAD
>>>>>>> 28e2bfa2d (GEOMESA-3061 Converters - support bytes in Avro top-level union types (#2762))
=======
=======
        Expression("avroBinaryList(avroPath($0, '/content$type=TObj/foo'))").apply(Array(decoded)) must beNull
>>>>>>> 1ba2f23b3 (GEOMESA-3071 Move all converter state into evaluation context)
        Expression("avroBinaryList(avroPath($0, '/content$type=TObj/foo'))").eval(Array(decoded)) must beNull
        Expression("avroBinaryMap(avroPath($0, '/content$type=TObj/foo'))").apply(Array(decoded)) must beNull
        Expression("avroBinaryMap(avroPath($0, '/content$type=TObj/foo'))").eval(Array(decoded)) must beNull
<<<<<<< HEAD
>>>>>>> b9bdd406e (GEOMESA-3061 Converters - support bytes in Avro top-level union types (#2762))
<<<<<<< HEAD
<<<<<<< HEAD
>>>>>>> b1c506839 (GEOMESA-3061 Converters - support bytes in Avro top-level union types (#2762))
>>>>>>> f71fa3c0e (GEOMESA-3061 Converters - support bytes in Avro top-level union types (#2762))
=======
>>>>>>> cdb410251 (GEOMESA-3061 Converters - support bytes in Avro top-level union types (#2762))
=======
=======
        Expression("avroBinaryUuid(avroPath($0, '/content$type=TObj/foo'))").apply(Array(decoded)) must beNull
>>>>>>> 1ba2f23b3 (GEOMESA-3071 Move all converter state into evaluation context)
>>>>>>> 0d80bae0c (GEOMESA-3071 Move all converter state into evaluation context)
=======
=======
<<<<<<< HEAD
>>>>>>> 6eb31fb65 (GEOMESA-3061 Converters - support bytes in Avro top-level union types (#2762))
=======
>>>>>>> 07a6a5c29 (GEOMESA-3061 Converters - support bytes in Avro top-level union types (#2762))
=======
>>>>>>> d6616d893 (GEOMESA-3061 Converters - support bytes in Avro top-level union types (#2762))
=======
=======
=======
        Expression("avroBinaryList(avroPath($0, '/content$type=TObj/foo'))").apply(Array(decoded)) must beNull
>>>>>>> 1ba2f23b3 (GEOMESA-3071 Move all converter state into evaluation context)
>>>>>>> dd5d6434b (GEOMESA-3071 Move all converter state into evaluation context)
        Expression("avroBinaryList(avroPath($0, '/content$type=TObj/foo'))").eval(Array(decoded)) must beNull
        Expression("avroBinaryMap(avroPath($0, '/content$type=TObj/foo'))").apply(Array(decoded)) must beNull
        Expression("avroBinaryMap(avroPath($0, '/content$type=TObj/foo'))").eval(Array(decoded)) must beNull
<<<<<<< HEAD
>>>>>>> b9bdd406e (GEOMESA-3061 Converters - support bytes in Avro top-level union types (#2762))
<<<<<<< HEAD
>>>>>>> a9f01eaaf (GEOMESA-3061 Converters - support bytes in Avro top-level union types (#2762))
<<<<<<< HEAD
>>>>>>> 7e68948ac (GEOMESA-3061 Converters - support bytes in Avro top-level union types (#2762))
=======
=======
=======
        Expression("avroBinaryUuid(avroPath($0, '/content$type=TObj/foo'))").apply(Array(decoded)) must beNull
>>>>>>> 1ba2f23b3 (GEOMESA-3071 Move all converter state into evaluation context)
>>>>>>> dd5d6434b (GEOMESA-3071 Move all converter state into evaluation context)
<<<<<<< HEAD
<<<<<<< HEAD
>>>>>>> 686339d05 (GEOMESA-3071 Move all converter state into evaluation context)
=======
<<<<<<< HEAD
=======
>>>>>>> 07a6a5c29 (GEOMESA-3061 Converters - support bytes in Avro top-level union types (#2762))
=======
>>>>>>> locationtech-main
=======
=======
<<<<<<< HEAD
<<<<<<< HEAD
>>>>>>> 0e68e9f4c (GEOMESA-3061 Converters - support bytes in Avro top-level union types (#2762))
=======
>>>>>>> 149b7a780 (GEOMESA-3071 Move all converter state into evaluation context)
=======
=======
        Expression("avroBinaryList(avroPath($0, '/content$type=TObj/foo'))").apply(Array(decoded)) must beNull
>>>>>>> 1ba2f23b3 (GEOMESA-3071 Move all converter state into evaluation context)
<<<<<<< HEAD
        Expression("avroBinaryList(avroPath($0, '/content$type=TObj/foo'))").eval(Array(decoded)) must beNull
        Expression("avroBinaryMap(avroPath($0, '/content$type=TObj/foo'))").apply(Array(decoded)) must beNull
        Expression("avroBinaryMap(avroPath($0, '/content$type=TObj/foo'))").eval(Array(decoded)) must beNull
<<<<<<< HEAD
>>>>>>> b9bdd406e (GEOMESA-3061 Converters - support bytes in Avro top-level union types (#2762))
<<<<<<< HEAD
<<<<<<< HEAD
>>>>>>> b1c506839 (GEOMESA-3061 Converters - support bytes in Avro top-level union types (#2762))
>>>>>>> f71fa3c0e (GEOMESA-3061 Converters - support bytes in Avro top-level union types (#2762))
>>>>>>> 6eb31fb65 (GEOMESA-3061 Converters - support bytes in Avro top-level union types (#2762))
=======
>>>>>>> 0e68e9f4c (GEOMESA-3061 Converters - support bytes in Avro top-level union types (#2762))
=======
=======
        Expression("avroBinaryUuid(avroPath($0, '/content$type=TObj/foo'))").apply(Array(decoded)) must beNull
>>>>>>> 1ba2f23b3 (GEOMESA-3071 Move all converter state into evaluation context)
>>>>>>> f3a49e082 (GEOMESA-3071 Move all converter state into evaluation context)
=======
=======
=======
>>>>>>> 5ba418ba6 (GEOMESA-3071 Move all converter state into evaluation context)
=======
=======
        Expression("avroBinaryList(avroPath($0, '/content$type=TObj/foo'))").apply(Array(decoded)) must beNull
>>>>>>> 1ba2f23b3 (GEOMESA-3071 Move all converter state into evaluation context)
>>>>>>> dd5d6434b (GEOMESA-3071 Move all converter state into evaluation context)
<<<<<<< HEAD
        Expression("avroBinaryList(avroPath($0, '/content$type=TObj/foo'))").eval(Array(decoded)) must beNull
        Expression("avroBinaryMap(avroPath($0, '/content$type=TObj/foo'))").apply(Array(decoded)) must beNull
        Expression("avroBinaryMap(avroPath($0, '/content$type=TObj/foo'))").eval(Array(decoded)) must beNull
<<<<<<< HEAD
>>>>>>> b9bdd406e (GEOMESA-3061 Converters - support bytes in Avro top-level union types (#2762))
<<<<<<< HEAD
>>>>>>> a9f01eaaf (GEOMESA-3061 Converters - support bytes in Avro top-level union types (#2762))
<<<<<<< HEAD
>>>>>>> 4073c9b17 (GEOMESA-3061 Converters - support bytes in Avro top-level union types (#2762))
=======
=======
=======
        Expression("avroBinaryUuid(avroPath($0, '/content$type=TObj/foo'))").apply(Array(decoded)) must beNull
>>>>>>> 1ba2f23b3 (GEOMESA-3071 Move all converter state into evaluation context)
>>>>>>> dd5d6434b (GEOMESA-3071 Move all converter state into evaluation context)
>>>>>>> 628900700 (GEOMESA-3071 Move all converter state into evaluation context)
=======
=======
>>>>>>> 0d80bae0c (GEOMESA-3071 Move all converter state into evaluation context)
>>>>>>> 149b7a780 (GEOMESA-3071 Move all converter state into evaluation context)
        Expression("avroBinaryList(avroPath($0, '/content$type=TObj/foo'))").eval(Array(decoded)) must beNull
        Expression("avroBinaryMap(avroPath($0, '/content$type=TObj/foo'))").apply(Array(decoded)) must beNull
        Expression("avroBinaryMap(avroPath($0, '/content$type=TObj/foo'))").eval(Array(decoded)) must beNull
<<<<<<< HEAD
>>>>>>> b9bdd406e (GEOMESA-3061 Converters - support bytes in Avro top-level union types (#2762))
<<<<<<< HEAD
>>>>>>> b1c506839 (GEOMESA-3061 Converters - support bytes in Avro top-level union types (#2762))
>>>>>>> f71fa3c0e (GEOMESA-3061 Converters - support bytes in Avro top-level union types (#2762))
<<<<<<< HEAD
>>>>>>> 07a6a5c29 (GEOMESA-3061 Converters - support bytes in Avro top-level union types (#2762))
=======
=======
>>>>>>> b4320946b (GEOMESA-3061 Converters - support bytes in Avro top-level union types (#2762))
=======
=======
        Expression("avroBinaryList(avroPath($0, '/content$type=TObj/foo'))").apply(Array(decoded)) must beNull
>>>>>>> 1ba2f23b3 (GEOMESA-3071 Move all converter state into evaluation context)
        Expression("avroBinaryList(avroPath($0, '/content$type=TObj/foo'))").eval(Array(decoded)) must beNull
        Expression("avroBinaryMap(avroPath($0, '/content$type=TObj/foo'))").apply(Array(decoded)) must beNull
        Expression("avroBinaryMap(avroPath($0, '/content$type=TObj/foo'))").eval(Array(decoded)) must beNull
<<<<<<< HEAD
>>>>>>> b9bdd406e (GEOMESA-3061 Converters - support bytes in Avro top-level union types (#2762))
<<<<<<< HEAD
<<<<<<< HEAD
>>>>>>> cdb410251 (GEOMESA-3061 Converters - support bytes in Avro top-level union types (#2762))
<<<<<<< HEAD
>>>>>>> 67b361c85 (GEOMESA-3061 Converters - support bytes in Avro top-level union types (#2762))
=======
=======
=======
        Expression("avroBinaryUuid(avroPath($0, '/content$type=TObj/foo'))").apply(Array(decoded)) must beNull
>>>>>>> 1ba2f23b3 (GEOMESA-3071 Move all converter state into evaluation context)
>>>>>>> 0d80bae0c (GEOMESA-3071 Move all converter state into evaluation context)
<<<<<<< HEAD
>>>>>>> 149b7a780 (GEOMESA-3071 Move all converter state into evaluation context)
=======
=======
=======
=======
>>>>>>> 5ba418ba6 (GEOMESA-3071 Move all converter state into evaluation context)
        Expression("avroBinaryList(avroPath($0, '/content$type=TObj/foo'))").eval(Array(decoded)) must beNull
        Expression("avroBinaryMap(avroPath($0, '/content$type=TObj/foo'))").apply(Array(decoded)) must beNull
        Expression("avroBinaryMap(avroPath($0, '/content$type=TObj/foo'))").eval(Array(decoded)) must beNull
<<<<<<< HEAD
>>>>>>> b9bdd406e (GEOMESA-3061 Converters - support bytes in Avro top-level union types (#2762))
<<<<<<< HEAD
>>>>>>> a9f01eaaf (GEOMESA-3061 Converters - support bytes in Avro top-level union types (#2762))
<<<<<<< HEAD
>>>>>>> 7e68948ac (GEOMESA-3061 Converters - support bytes in Avro top-level union types (#2762))
<<<<<<< HEAD
>>>>>>> d6616d893 (GEOMESA-3061 Converters - support bytes in Avro top-level union types (#2762))
=======
=======
=======
=======
        Expression("avroBinaryUuid(avroPath($0, '/content$type=TObj/foo'))").apply(Array(decoded)) must beNull
>>>>>>> 1ba2f23b3 (GEOMESA-3071 Move all converter state into evaluation context)
>>>>>>> dd5d6434b (GEOMESA-3071 Move all converter state into evaluation context)
>>>>>>> 686339d05 (GEOMESA-3071 Move all converter state into evaluation context)
>>>>>>> 5ba418ba6 (GEOMESA-3071 Move all converter state into evaluation context)
=======
        Expression("avroBinaryList(avroPath($0, '/content$type=TObj/foo'))").eval(Array(decoded)) must beNull
        Expression("avroBinaryMap(avroPath($0, '/content$type=TObj/foo'))").eval(Array(decoded)) must beNull
>>>>>>> b9bdd406e (GEOMESA-3061 Converters - support bytes in Avro top-level union types (#2762))
>>>>>>> b1c506839 (GEOMESA-3061 Converters - support bytes in Avro top-level union types (#2762))
>>>>>>> f71fa3c0e (GEOMESA-3061 Converters - support bytes in Avro top-level union types (#2762))
>>>>>>> 6eb31fb65 (GEOMESA-3061 Converters - support bytes in Avro top-level union types (#2762))
>>>>>>> 28e2bfa2d (GEOMESA-3061 Converters - support bytes in Avro top-level union types (#2762))
=======
>>>>>>> b4320946b (GEOMESA-3061 Converters - support bytes in Avro top-level union types (#2762))
=======
=======
        Expression("avroBinaryUuid(avroPath($0, '/content$type=TObj/foo'))").apply(Array(decoded)) must beNull
>>>>>>> 1ba2f23b3 (GEOMESA-3071 Move all converter state into evaluation context)
>>>>>>> 0f4c829f2 (GEOMESA-3071 Move all converter state into evaluation context)
=======
=======
=======
=======
        Expression("avroBinaryList(avroPath($0, '/content$type=TObj/foo'))").apply(Array(decoded)) must beNull
>>>>>>> 1ba2f23b3 (GEOMESA-3071 Move all converter state into evaluation context)
>>>>>>> dd5d6434b (GEOMESA-3071 Move all converter state into evaluation context)
        Expression("avroBinaryList(avroPath($0, '/content$type=TObj/foo'))").eval(Array(decoded)) must beNull
        Expression("avroBinaryMap(avroPath($0, '/content$type=TObj/foo'))").apply(Array(decoded)) must beNull
        Expression("avroBinaryMap(avroPath($0, '/content$type=TObj/foo'))").eval(Array(decoded)) must beNull
<<<<<<< HEAD
>>>>>>> b9bdd406e (GEOMESA-3061 Converters - support bytes in Avro top-level union types (#2762))
<<<<<<< HEAD
>>>>>>> a9f01eaaf (GEOMESA-3061 Converters - support bytes in Avro top-level union types (#2762))
<<<<<<< HEAD
>>>>>>> 314e6ef1a (GEOMESA-3061 Converters - support bytes in Avro top-level union types (#2762))
=======
=======
=======
        Expression("avroBinaryUuid(avroPath($0, '/content$type=TObj/foo'))").apply(Array(decoded)) must beNull
>>>>>>> 1ba2f23b3 (GEOMESA-3071 Move all converter state into evaluation context)
>>>>>>> dd5d6434b (GEOMESA-3071 Move all converter state into evaluation context)
>>>>>>> 455aae09d (GEOMESA-3071 Move all converter state into evaluation context)
=======
>>>>>>> 3be8d2a5a (Merge branch 'feature/postgis-fixes')
=======
        Expression("avroBinaryList(avroPath($0, '/content$type=TObj/foo'))").eval(Array(decoded)) must beNull
        Expression("avroBinaryMap(avroPath($0, '/content$type=TObj/foo'))").eval(Array(decoded)) must beNull
>>>>>>> 87bf55340 (GEOMESA-3061 Converters - support bytes in Avro top-level union types (#2762))
        Expression("avroBinaryUuid(avroPath($0, '/content$type=TObj/foo'))").eval(Array(decoded)) must beNull
>>>>>>> b9bdd406e (GEOMESA-3061 Converters - support bytes in Avro top-level union types (#2762))
>>>>>>> 6d9a5b626c (GEOMESA-3061 Converters - support bytes in Avro top-level union types (#2762))
      }
    }
  }
}
