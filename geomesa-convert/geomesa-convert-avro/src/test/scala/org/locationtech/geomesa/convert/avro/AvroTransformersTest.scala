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
        exp.apply(Array(decoded)) mustEqual " foo "
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
>>>>>>> d6616d893e (GEOMESA-3061 Converters - support bytes in Avro top-level union types (#2762))
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
>>>>>>> 7e68948ac (GEOMESA-3061 Converters - support bytes in Avro top-level union types (#2762))
>>>>>>> d6616d893e (GEOMESA-3061 Converters - support bytes in Avro top-level union types (#2762))
=======
        exp.apply(Array(decoded)) mustEqual " foo "
=======
>>>>>>> b9bdd406e (GEOMESA-3061 Converters - support bytes in Avro top-level union types (#2762))
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
>>>>>>> 7e68948ac6 (GEOMESA-3061 Converters - support bytes in Avro top-level union types (#2762))
=======
=======
>>>>>>> d6616d893e (GEOMESA-3061 Converters - support bytes in Avro top-level union types (#2762))
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
>>>>>>> 6eb31fb652 (GEOMESA-3061 Converters - support bytes in Avro top-level union types (#2762))
=======
>>>>>>> 67b361c856 (GEOMESA-3061 Converters - support bytes in Avro top-level union types (#2762))
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
>>>>>>> d6616d893e (GEOMESA-3061 Converters - support bytes in Avro top-level union types (#2762))
        exp.eval(Array(decoded)) mustEqual " foo "
>>>>>>> b9bdd406e3 (GEOMESA-3061 Converters - support bytes in Avro top-level union types (#2762))
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
        exp.apply(Array(decoded)) mustEqual "foo"
      }

      "handle null values" >> {
        Expression("avroBinaryList(avroPath($0, '/content$type=TObj/foo'))").apply(Array(decoded)) must beNull
        Expression("avroBinaryMap(avroPath($0, '/content$type=TObj/foo'))").apply(Array(decoded)) must beNull
        Expression("avroBinaryUuid(avroPath($0, '/content$type=TObj/foo'))").apply(Array(decoded)) must beNull
=======
=======
        exp.apply(Array(decoded)) mustEqual "foo"
>>>>>>> 1ba2f23b3d (GEOMESA-3071 Move all converter state into evaluation context)
=======
        exp.apply(Array(decoded)) mustEqual "foo"
=======
<<<<<<< HEAD
>>>>>>> b9bdd406e (GEOMESA-3061 Converters - support bytes in Avro top-level union types (#2762))
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
>>>>>>> 149b7a7809 (GEOMESA-3071 Move all converter state into evaluation context)
=======
=======
>>>>>>> 7e68948ac (GEOMESA-3061 Converters - support bytes in Avro top-level union types (#2762))
>>>>>>> d6616d893e (GEOMESA-3061 Converters - support bytes in Avro top-level union types (#2762))
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
>>>>>>> 7e68948ac (GEOMESA-3061 Converters - support bytes in Avro top-level union types (#2762))
>>>>>>> d6616d893e (GEOMESA-3061 Converters - support bytes in Avro top-level union types (#2762))
=======
        exp.apply(Array(decoded)) mustEqual "foo"
=======
>>>>>>> b9bdd406e (GEOMESA-3061 Converters - support bytes in Avro top-level union types (#2762))
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
>>>>>>> 7e68948ac6 (GEOMESA-3061 Converters - support bytes in Avro top-level union types (#2762))
=======
=======
>>>>>>> d6616d893e (GEOMESA-3061 Converters - support bytes in Avro top-level union types (#2762))
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
>>>>>>> 6eb31fb652 (GEOMESA-3061 Converters - support bytes in Avro top-level union types (#2762))
=======
>>>>>>> 67b361c856 (GEOMESA-3061 Converters - support bytes in Avro top-level union types (#2762))
=======
        exp.apply(Array(decoded)) mustEqual "foo"
=======
>>>>>>> b9bdd406e (GEOMESA-3061 Converters - support bytes in Avro top-level union types (#2762))
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
>>>>>>> d6616d893e (GEOMESA-3061 Converters - support bytes in Avro top-level union types (#2762))
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
=======
<<<<<<< HEAD
=======
<<<<<<< HEAD
<<<<<<< HEAD
>>>>>>> locationtech-main
=======
>>>>>>> b1c506839 (GEOMESA-3061 Converters - support bytes in Avro top-level union types (#2762))
>>>>>>> f71fa3c0e1 (GEOMESA-3061 Converters - support bytes in Avro top-level union types (#2762))
=======
>>>>>>> cdb4102515 (GEOMESA-3061 Converters - support bytes in Avro top-level union types (#2762))
=======
>>>>>>> 0d80bae0c6 (GEOMESA-3071 Move all converter state into evaluation context)
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
>>>>>>> a9f01eaaf (GEOMESA-3061 Converters - support bytes in Avro top-level union types (#2762))
=======
>>>>>>> dd5d6434b (GEOMESA-3071 Move all converter state into evaluation context)
<<<<<<< HEAD
<<<<<<< HEAD
>>>>>>> 686339d050 (GEOMESA-3071 Move all converter state into evaluation context)
=======
=======
>>>>>>> 07a6a5c291 (GEOMESA-3061 Converters - support bytes in Avro top-level union types (#2762))
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
=======
>>>>>>> a9f01eaaf (GEOMESA-3061 Converters - support bytes in Avro top-level union types (#2762))
=======
>>>>>>> dd5d6434b (GEOMESA-3071 Move all converter state into evaluation context)
>>>>>>> 6289007008 (GEOMESA-3071 Move all converter state into evaluation context)
=======
>>>>>>> 07a6a5c291 (GEOMESA-3061 Converters - support bytes in Avro top-level union types (#2762))
=======
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
=======
>>>>>>> a9f01eaaf (GEOMESA-3061 Converters - support bytes in Avro top-level union types (#2762))
>>>>>>> 7e68948ac (GEOMESA-3061 Converters - support bytes in Avro top-level union types (#2762))
>>>>>>> d6616d893e (GEOMESA-3061 Converters - support bytes in Avro top-level union types (#2762))
        Expression("avroBinaryList(avroPath($0, '/content$type=TObj/foo'))").apply(Array(decoded)) must beNull
        Expression("avroBinaryList(avroPath($0, '/content$type=TObj/foo'))").eval(Array(decoded)) must beNull
        Expression("avroBinaryMap(avroPath($0, '/content$type=TObj/foo'))").apply(Array(decoded)) must beNull
        Expression("avroBinaryMap(avroPath($0, '/content$type=TObj/foo'))").eval(Array(decoded)) must beNull
        Expression("avroBinaryUuid(avroPath($0, '/content$type=TObj/foo'))").apply(Array(decoded)) must beNull
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
<<<<<<< HEAD
=======
=======
>>>>>>> f71fa3c0e (GEOMESA-3061 Converters - support bytes in Avro top-level union types (#2762))
<<<<<<< HEAD
=======
>>>>>>> 4073c9b173 (GEOMESA-3061 Converters - support bytes in Avro top-level union types (#2762))
=======
>>>>>>> 6289007008 (GEOMESA-3071 Move all converter state into evaluation context)
=======
>>>>>>> 07a6a5c291 (GEOMESA-3061 Converters - support bytes in Avro top-level union types (#2762))
=======
>>>>>>> 7e68948ac (GEOMESA-3061 Converters - support bytes in Avro top-level union types (#2762))
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
<<<<<<< HEAD
<<<<<<< HEAD
=======
>>>>>>> locationtech-main
=======
=======
>>>>>>> cdb4102515 (GEOMESA-3061 Converters - support bytes in Avro top-level union types (#2762))
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
        Expression("avroBinaryList(avroPath($0, '/content$type=TObj/foo'))").eval(Array(decoded)) must beNull
        Expression("avroBinaryMap(avroPath($0, '/content$type=TObj/foo'))").eval(Array(decoded)) must beNull
>>>>>>> b9bdd406e (GEOMESA-3061 Converters - support bytes in Avro top-level union types (#2762))
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
        Expression("avroBinaryList(avroPath($0, '/content$type=TObj/foo'))").eval(Array(decoded)) must beNull
        Expression("avroBinaryMap(avroPath($0, '/content$type=TObj/foo'))").eval(Array(decoded)) must beNull
>>>>>>> b9bdd406e (GEOMESA-3061 Converters - support bytes in Avro top-level union types (#2762))
>>>>>>> a9f01eaaf (GEOMESA-3061 Converters - support bytes in Avro top-level union types (#2762))
>>>>>>> 7e68948ac (GEOMESA-3061 Converters - support bytes in Avro top-level union types (#2762))
>>>>>>> d6616d893e (GEOMESA-3061 Converters - support bytes in Avro top-level union types (#2762))
        Expression("avroBinaryUuid(avroPath($0, '/content$type=TObj/foo'))").eval(Array(decoded)) must beNull
>>>>>>> b9bdd406e3 (GEOMESA-3061 Converters - support bytes in Avro top-level union types (#2762))
      }
    }
  }
}
