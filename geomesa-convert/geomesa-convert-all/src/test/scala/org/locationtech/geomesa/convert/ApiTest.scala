/***********************************************************************
<<<<<<< HEAD
<<<<<<< HEAD
<<<<<<< HEAD
<<<<<<< HEAD
<<<<<<< HEAD
<<<<<<< HEAD
<<<<<<< HEAD
<<<<<<< HEAD
<<<<<<< HEAD
 * Copyright (c) 2013-2024 Commonwealth Computer Research, Inc.
=======
=======
>>>>>>> 5bf7fcb2bf (GEOMESA-3071 Move all converter state into evaluation context)
=======
>>>>>>> 750f006e6b (GEOMESA-3071 Move all converter state into evaluation context)
=======
>>>>>>> 9e43839c99 (GEOMESA-3071 Move all converter state into evaluation context)
=======
>>>>>>> 8b8139a232 (GEOMESA-3071 Move all converter state into evaluation context)
=======
>>>>>>> d136bd4a2c (Merge branch 'feature/postgis-fixes')
=======
>>>>>>> af4a557187 (GEOMESA-3071 Move all converter state into evaluation context)
=======
>>>>>>> b368bb796e (Merge branch 'feature/postgis-fixes')
=======
>>>>>>> c8d2cfae9c (GEOMESA-3254 Add Bloop build support)
<<<<<<< HEAD
 * Copyright (c) 2013-2023 Commonwealth Computer Research, Inc.
=======
 * Copyright (c) 2013-2021 Commonwealth Computer Research, Inc.
>>>>>>> 1ba2f23b3d (GEOMESA-3071 Move all converter state into evaluation context)
<<<<<<< HEAD
>>>>>>> a3aefef462 (GEOMESA-3071 Move all converter state into evaluation context)
=======
=======
=======
>>>>>>> 0d80bae0c6 (GEOMESA-3071 Move all converter state into evaluation context)
=======
>>>>>>> f3a49e0825 (GEOMESA-3071 Move all converter state into evaluation context)
=======
>>>>>>> 0f4c829f25 (GEOMESA-3071 Move all converter state into evaluation context)
=======
>>>>>>> 74661c3147 (GEOMESA-3071 Move all converter state into evaluation context)
=======
>>>>>>> db8d998aa2 (Merge branch 'feature/postgis-fixes')
 * Copyright (c) 2013-2022 Commonwealth Computer Research, Inc.
=======
 * Copyright (c) 2013-2021 Commonwealth Computer Research, Inc.
>>>>>>> 1ba2f23b3 (GEOMESA-3071 Move all converter state into evaluation context)
<<<<<<< HEAD
<<<<<<< HEAD
<<<<<<< HEAD
<<<<<<< HEAD
<<<<<<< HEAD
>>>>>>> dd5d6434b0 (GEOMESA-3071 Move all converter state into evaluation context)
<<<<<<< HEAD
>>>>>>> 5bf7fcb2bf (GEOMESA-3071 Move all converter state into evaluation context)
=======
=======
>>>>>>> 0d80bae0c6 (GEOMESA-3071 Move all converter state into evaluation context)
<<<<<<< HEAD
>>>>>>> 750f006e6b (GEOMESA-3071 Move all converter state into evaluation context)
=======
=======
>>>>>>> f3a49e0825 (GEOMESA-3071 Move all converter state into evaluation context)
<<<<<<< HEAD
>>>>>>> 9e43839c99 (GEOMESA-3071 Move all converter state into evaluation context)
=======
=======
>>>>>>> 0f4c829f25 (GEOMESA-3071 Move all converter state into evaluation context)
<<<<<<< HEAD
>>>>>>> 8b8139a232 (GEOMESA-3071 Move all converter state into evaluation context)
=======
=======
 * Copyright (c) 2013-2022 Commonwealth Computer Research, Inc.
>>>>>>> 3be8d2a5a4 (Merge branch 'feature/postgis-fixes')
<<<<<<< HEAD
>>>>>>> d136bd4a2c (Merge branch 'feature/postgis-fixes')
=======
=======
>>>>>>> 74661c3147 (GEOMESA-3071 Move all converter state into evaluation context)
<<<<<<< HEAD
>>>>>>> af4a557187 (GEOMESA-3071 Move all converter state into evaluation context)
=======
=======
=======
 * Copyright (c) 2013-2022 Commonwealth Computer Research, Inc.
>>>>>>> 3be8d2a5a (Merge branch 'feature/postgis-fixes')
>>>>>>> db8d998aa2 (Merge branch 'feature/postgis-fixes')
<<<<<<< HEAD
>>>>>>> b368bb796e (Merge branch 'feature/postgis-fixes')
=======
=======
 * Copyright (c) 2013-2022 Commonwealth Computer Research, Inc.
>>>>>>> d845d7c1bd (GEOMESA-3254 Add Bloop build support)
>>>>>>> c8d2cfae9c (GEOMESA-3254 Add Bloop build support)
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Apache License, Version 2.0
 * which accompanies this distribution and is available at
 * http://www.opensource.org/licenses/apache2.0.php.
 ***********************************************************************/

package org.locationtech.geomesa.convert

<<<<<<< HEAD
import org.apache.commons.io.IOUtils
import org.geotools.api.feature.simple.SimpleFeatureType
import org.locationtech.geomesa.convert.TestConverterFactory.TestField
import org.locationtech.geomesa.convert2.AbstractConverter.{BasicConfig, BasicOptions}
import org.locationtech.geomesa.convert2.AbstractConverterFactory.{BasicConfigConvert, BasicOptionsConvert, FieldConvert, OptionConvert, PrimitiveConvert}
import org.locationtech.geomesa.convert2.transforms.TransformerFunction.NamedTransformerFunction
import org.locationtech.geomesa.convert2.transforms.{Expression, TransformerFunction, TransformerFunctionFactory}
import org.locationtech.geomesa.convert2.{AbstractConverter, AbstractConverterFactory, Field}
import org.locationtech.geomesa.utils.collection.CloseableIterator
import pureconfig.ConfigObjectCursor
import pureconfig.error.ConfigReaderFailures

import java.io.InputStream
<<<<<<< HEAD
=======
import java.io.{ByteArrayInputStream, InputStream}
import java.nio.charset.StandardCharsets

import com.typesafe.config.ConfigFactory
=======
>>>>>>> 58d14a257e (GEOMESA-3254 Add Bloop build support)
import org.apache.commons.io.IOUtils
import org.locationtech.geomesa.convert.TestConverterFactory.TestField
import org.locationtech.geomesa.convert2.AbstractConverter.{BasicConfig, BasicOptions}
import org.locationtech.geomesa.convert2.AbstractConverterFactory.{BasicConfigConvert, BasicOptionsConvert, FieldConvert, OptionConvert, PrimitiveConvert}
import org.locationtech.geomesa.convert2.transforms.TransformerFunction.NamedTransformerFunction
import org.locationtech.geomesa.convert2.transforms.{Expression, TransformerFunction, TransformerFunctionFactory}
import org.locationtech.geomesa.convert2.{AbstractConverter, AbstractConverterFactory, Field}
import org.locationtech.geomesa.utils.collection.CloseableIterator
import org.opengis.feature.simple.SimpleFeatureType
import pureconfig.ConfigObjectCursor
import pureconfig.error.ConfigReaderFailures

<<<<<<< HEAD
@RunWith(classOf[JUnitRunner])
class ApiTest extends Specification {

  "SimpleFeatureConverters" should {
    "work with AbstractConverters that have not been updated to use the new API" in {
      val sft = SimpleFeatureTypes.createType("test", "name:String,age:Int,line:String,dtg:Date,*geom:Point:srid=4326")
      val config =
        ConfigFactory.parseString(
          """{
            |  type = "test"
            |  fields = [
            |    { name = "name",  split = true, transform = "foo(bar($1))" }
            |    { name = "age",   split = true, transform = "$2::int"      }
            |    { name = "dtg",   split = true, transform = "dateTime($3)" }
            |    { name = "lon",   split = true, transform = "toDouble($4)" }
            |    { name = "lat",   split = true, transform = "toDouble($5)" }
            |    { name = "geom",  transform = "point($lon, $lat)"          }
            |    { name = "line",  transform = "bar(lineNo())"              }
            |  ]
            |}""".stripMargin
        )
      val data = "bob,21,2021-01-02T00:00:00.000Z,120,-45.5".getBytes(StandardCharsets.UTF_8)

      val converter = SimpleFeatureConverter(sft, config)
      converter must beAnInstanceOf[TestConverter]
      val result = WithClose(converter.process(new ByteArrayInputStream(data)))(_.toList)
      result must haveLength(1)
      result.head.getAttribute("name") mustEqual "foo bar bob"
      result.head.getAttribute("age") mustEqual 21
      result.head.getAttribute("line") mustEqual "bar 0"
      FastConverter.convert(result.head.getAttribute("dtg"), classOf[String]) mustEqual "2021-01-02T00:00:00.000Z"
      FastConverter.convert(result.head.getAttribute("geom"), classOf[String]) mustEqual "POINT (120 -45.5)"
    }
  }

}
<<<<<<< HEAD
>>>>>>> 1ba2f23b3d (GEOMESA-3071 Move all converter state into evaluation context)
=======
>>>>>>> 1ba2f23b3 (GEOMESA-3071 Move all converter state into evaluation context)
>>>>>>> 74661c3147 (GEOMESA-3071 Move all converter state into evaluation context)
=======
>>>>>>> d845d7c1bd (GEOMESA-3254 Add Bloop build support)
=======
import java.io.InputStream
>>>>>>> 58d14a257e (GEOMESA-3254 Add Bloop build support)

class TestConverter(sft: SimpleFeatureType, config: BasicConfig, fields: Seq[TestField], options: BasicOptions)
    extends AbstractConverter[String, BasicConfig, TestField, BasicOptions](sft, config, fields, options) {

  import scala.collection.JavaConverters._

  override protected def parse(is: InputStream, ec: EvaluationContext): CloseableIterator[String] =
    CloseableIterator(IOUtils.lineIterator(is, options.encoding).asScala, is.close())

  override protected def values(
      parsed: CloseableIterator[String],
      ec: EvaluationContext): CloseableIterator[Array[Any]] = parsed.map(Array[Any](_))
}

class TestConverterFactory extends AbstractConverterFactory[TestConverter, BasicConfig, TestField, BasicOptions](
  "test", BasicConfigConvert, TestConverterFactory.TestFieldConvert, BasicOptionsConvert)
<<<<<<< HEAD
<<<<<<< HEAD
=======
class TestConverterFactory extends AbstractConverterFactory[TestConverter, BasicConfig, TestField, BasicOptions] {
  override protected val typeToProcess: String = "test"
  override protected implicit val configConvert: ConverterConfigConvert[BasicConfig] = BasicConfigConvert
  override protected implicit val fieldConvert: FieldConvert[TestField] = TestConverterFactory.TestFieldConvert
  override protected implicit val optsConvert: ConverterOptionsConvert[BasicOptions] = BasicOptionsConvert
}
<<<<<<< HEAD
>>>>>>> 1ba2f23b3d (GEOMESA-3071 Move all converter state into evaluation context)
=======
>>>>>>> 1ba2f23b3 (GEOMESA-3071 Move all converter state into evaluation context)
>>>>>>> 74661c3147 (GEOMESA-3071 Move all converter state into evaluation context)
=======
>>>>>>> d845d7c1bd (GEOMESA-3254 Add Bloop build support)
=======
>>>>>>> 58d14a257e (GEOMESA-3254 Add Bloop build support)

object TestConverterFactory {

  object TestFieldConvert extends FieldConvert[TestField] with OptionConvert {

    override protected def decodeField(cur: ConfigObjectCursor,
        name: String,
        transform: Option[Expression]): Either[ConfigReaderFailures, TestField] = {
      val split = cur.atKeyOrUndefined("split")
      if (split.isUndefined) { Right(TestDerivedField(name, transform)) } else {
        for { s <- PrimitiveConvert.booleanConfigReader.from(split).right } yield {
          if (s) { TestSplitField(name, transform) } else { TestDerivedField(name, transform) }
        }
      }
    }

    override protected def encodeField(field: TestField, base: java.util.Map[String, AnyRef]): Unit = {
      field match {
        case _: TestSplitField => base.put("split", java.lang.Boolean.TRUE)
        case _ =>
      }
    }
  }

  trait TestField extends Field

  case class TestDerivedField(name: String, transforms: Option[Expression]) extends TestField {
    override def fieldArg: Option[Array[AnyRef] => AnyRef] = None
  }
<<<<<<< HEAD

  case class TestSplitField(name: String, transforms: Option[Expression]) extends TestField {
    override def fieldArg: Option[Array[AnyRef] => AnyRef] =
      Some(args => Array[Any](args(0)) ++ args(0).asInstanceOf[String].split(","))
<<<<<<< HEAD
=======
  case class TestDerivedField(name: String, transforms: Option[Expression]) extends TestField

  case class TestSplitField(name: String, transforms: Option[Expression]) extends TestField {
    override def eval(args: Array[Any])(implicit ec: EvaluationContext): Any =
      super.eval(Array[Any](args(0)) ++ args(0).asInstanceOf[String].split(","))
<<<<<<< HEAD
>>>>>>> 1ba2f23b3d (GEOMESA-3071 Move all converter state into evaluation context)
=======
>>>>>>> 1ba2f23b3 (GEOMESA-3071 Move all converter state into evaluation context)
>>>>>>> 74661c3147 (GEOMESA-3071 Move all converter state into evaluation context)
=======
>>>>>>> d845d7c1bd (GEOMESA-3254 Add Bloop build support)
=======

  case class TestSplitField(name: String, transforms: Option[Expression]) extends TestField {
    override def fieldArg: Option[Array[AnyRef] => AnyRef] =
      Some(args => Array[Any](args(0)) ++ args(0).asInstanceOf[String].split(","))
>>>>>>> 58d14a257e (GEOMESA-3254 Add Bloop build support)
  }
}

class TestFunctionFactory extends TransformerFunctionFactory {

  override def functions: Seq[TransformerFunction] = Seq(foo, bar)

  private val foo = new NamedTransformerFunction(Seq("foo")) {
    override def apply(args: Array[AnyRef]): AnyRef = "foo " + args(0)
<<<<<<< HEAD
<<<<<<< HEAD
=======
    override def eval(args: Array[Any])(implicit ec: EvaluationContext): Any = "foo " + args(0)
<<<<<<< HEAD
>>>>>>> 1ba2f23b3d (GEOMESA-3071 Move all converter state into evaluation context)
=======
>>>>>>> 1ba2f23b3 (GEOMESA-3071 Move all converter state into evaluation context)
>>>>>>> 74661c3147 (GEOMESA-3071 Move all converter state into evaluation context)
=======
>>>>>>> d845d7c1bd (GEOMESA-3254 Add Bloop build support)
=======
>>>>>>> 58d14a257e (GEOMESA-3254 Add Bloop build support)
  }

  private val bar = new TransformerFunction {
    override def names: Seq[String] = Seq("bar")
    override def apply(args: Array[AnyRef]): AnyRef = "bar " + args(0)
    override def withContext(ec: EvaluationContext): TransformerFunction = this
<<<<<<< HEAD
<<<<<<< HEAD
=======
    override def eval(args: Array[Any])(implicit ec: EvaluationContext): Any = "bar " + args(0)
<<<<<<< HEAD
>>>>>>> 1ba2f23b3d (GEOMESA-3071 Move all converter state into evaluation context)
=======
>>>>>>> 1ba2f23b3 (GEOMESA-3071 Move all converter state into evaluation context)
>>>>>>> 74661c3147 (GEOMESA-3071 Move all converter state into evaluation context)
=======
>>>>>>> d845d7c1bd (GEOMESA-3254 Add Bloop build support)
=======
>>>>>>> 58d14a257e (GEOMESA-3254 Add Bloop build support)
  }
}
