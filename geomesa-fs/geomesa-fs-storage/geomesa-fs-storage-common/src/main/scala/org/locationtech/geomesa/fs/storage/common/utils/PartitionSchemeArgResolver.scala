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
<<<<<<< HEAD
<<<<<<< HEAD
<<<<<<< HEAD
 * Copyright (c) 2013-2023 Commonwealth Computer Research, Inc.
=======
=======
>>>>>>> db8d998aa (Merge branch 'feature/postgis-fixes')
<<<<<<< HEAD
 * Copyright (c) 2013-2022 Commonwealth Computer Research, Inc.
=======
 * Copyright (c) 2013-2021 Commonwealth Computer Research, Inc.
>>>>>>> 51a90e7f0 (GEOMESA-3092 Support Lambda NiFi processor (#2777))
<<<<<<< HEAD
>>>>>>> 120815d0b (GEOMESA-3092 Support Lambda NiFi processor (#2777))
=======
=======
 * Copyright (c) 2013-2022 Commonwealth Computer Research, Inc.
>>>>>>> 3be8d2a5a (Merge branch 'feature/postgis-fixes')
>>>>>>> db8d998aa (Merge branch 'feature/postgis-fixes')
=======
=======
>>>>>>> 1cc1e5df3 (GEOMESA-3092 Support Lambda NiFi processor (#2777))
=======
>>>>>>> 40667d637 (GEOMESA-3092 Support Lambda NiFi processor (#2777))
=======
>>>>>>> 3f50ce5c7 (GEOMESA-3092 Support Lambda NiFi processor (#2777))
=======
>>>>>>> a05012d5a (GEOMESA-3092 Support Lambda NiFi processor (#2777))
=======
>>>>>>> e8cc4971c6 (Merge branch 'feature/postgis-fixes')
=======
>>>>>>> b54485f5a2 (GEOMESA-3092 Support Lambda NiFi processor (#2777))
=======
>>>>>>> cb6bda89b6 (Merge branch 'feature/postgis-fixes')
=======
>>>>>>> 09d87762c5 (GEOMESA-3254 Add Bloop build support)
=======
>>>>>>> d79d99099b (GEOMESA-3092 Support Lambda NiFi processor (#2777))
 * Copyright (c) 2013-2023 Commonwealth Computer Research, Inc.
=======
 * Copyright (c) 2013-2022 Commonwealth Computer Research, Inc.
>>>>>>> 9cdd96d1c (GEOMESA-3092 Support Lambda NiFi processor (#2777))
=======
 * Copyright (c) 2013-2022 Commonwealth Computer Research, Inc.
>>>>>>> 92dccb4d7 (GEOMESA-3092 Support Lambda NiFi processor (#2777))
=======
 * Copyright (c) 2013-2022 Commonwealth Computer Research, Inc.
>>>>>>> f487c279d (GEOMESA-3092 Support Lambda NiFi processor (#2777))
=======
 * Copyright (c) 2013-2022 Commonwealth Computer Research, Inc.
>>>>>>> b36757a53 (GEOMESA-3092 Support Lambda NiFi processor (#2777))
=======
 * Copyright (c) 2013-2021 Commonwealth Computer Research, Inc.
>>>>>>> 51a90e7f0 (GEOMESA-3092 Support Lambda NiFi processor (#2777))
<<<<<<< HEAD
>>>>>>> 468ab7139 (GEOMESA-3092 Support Lambda NiFi processor (#2777))
=======
=======
 * Copyright (c) 2013-2022 Commonwealth Computer Research, Inc.
>>>>>>> 3be8d2a5a (Merge branch 'feature/postgis-fixes')
<<<<<<< HEAD
>>>>>>> e8cc4971c6 (Merge branch 'feature/postgis-fixes')
=======
=======
=======
>>>>>>> db8d998aa (Merge branch 'feature/postgis-fixes')
 * Copyright (c) 2013-2022 Commonwealth Computer Research, Inc.
=======
 * Copyright (c) 2013-2021 Commonwealth Computer Research, Inc.
>>>>>>> 51a90e7f0 (GEOMESA-3092 Support Lambda NiFi processor (#2777))
<<<<<<< HEAD
>>>>>>> 120815d0b (GEOMESA-3092 Support Lambda NiFi processor (#2777))
<<<<<<< HEAD
>>>>>>> b54485f5a2 (GEOMESA-3092 Support Lambda NiFi processor (#2777))
=======
=======
=======
 * Copyright (c) 2013-2022 Commonwealth Computer Research, Inc.
>>>>>>> 3be8d2a5a (Merge branch 'feature/postgis-fixes')
>>>>>>> db8d998aa (Merge branch 'feature/postgis-fixes')
<<<<<<< HEAD
>>>>>>> cb6bda89b6 (Merge branch 'feature/postgis-fixes')
=======
=======
 * Copyright (c) 2013-2022 Commonwealth Computer Research, Inc.
>>>>>>> d845d7c1b (GEOMESA-3254 Add Bloop build support)
<<<<<<< HEAD
>>>>>>> 09d87762c5 (GEOMESA-3254 Add Bloop build support)
=======
=======
 * Copyright (c) 2013-2023 Commonwealth Computer Research, Inc.
=======
<<<<<<< HEAD
 * Copyright (c) 2013-2022 Commonwealth Computer Research, Inc.
=======
 * Copyright (c) 2013-2021 Commonwealth Computer Research, Inc.
>>>>>>> 51a90e7f0 (GEOMESA-3092 Support Lambda NiFi processor (#2777))
>>>>>>> 120815d0b (GEOMESA-3092 Support Lambda NiFi processor (#2777))
>>>>>>> 234aacdc1 (GEOMESA-3092 Support Lambda NiFi processor (#2777))
>>>>>>> d79d99099b (GEOMESA-3092 Support Lambda NiFi processor (#2777))
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Apache License, Version 2.0
 * which accompanies this distribution and is available at
 * http://www.opensource.org/licenses/apache2.0.php.
 ***********************************************************************/

package org.locationtech.geomesa.fs.storage.common.utils

<<<<<<< HEAD
=======
import java.nio.charset.StandardCharsets

>>>>>>> 51a90e7f0 (GEOMESA-3092 Support Lambda NiFi processor (#2777))
import org.apache.commons.io.IOUtils
import org.locationtech.geomesa.fs.storage.api.{NamedOptions, PartitionSchemeFactory}
import org.locationtech.geomesa.fs.storage.common.StorageSerialization
import org.locationtech.geomesa.fs.storage.common.utils.PartitionSchemeArgResolver.SchemeArgs
import org.locationtech.geomesa.utils.conf.ArgResolver
import org.locationtech.geomesa.utils.io.{PathUtils, WithClose}
import org.opengis.feature.simple.SimpleFeatureType

<<<<<<< HEAD
import java.nio.charset.StandardCharsets
=======
>>>>>>> 51a90e7f0 (GEOMESA-3092 Support Lambda NiFi processor (#2777))
import scala.util.control.NonFatal

object PartitionSchemeArgResolver {

  private val instance = new PartitionSchemeArgResolver

  case class SchemeArgs(sft: SimpleFeatureType, scheme: String)

  def resolve(sft: SimpleFeatureType, scheme: String): Either[Throwable, NamedOptions] =
    instance.getArg(SchemeArgs(sft, scheme))
}

class PartitionSchemeArgResolver extends ArgResolver[NamedOptions, SchemeArgs] {

  import org.locationtech.geomesa.utils.conf.ArgResolver.ArgTypes._

  private val fileNameReg = """([^.]*)\.([^.]*)""" // e.g. "foo.bar"
  private val confStrings = Seq("{")

  override protected def argType(args: SchemeArgs): ArgTypes = {
    // guess the type we are trying to parse, to determine which error we show for failures
    // order is important here
    if (confStrings.exists(args.scheme.contains)) {
      CONFSTR
    } else if (args.scheme.matches(fileNameReg) || args.scheme.contains("/")) {
      PATH
    } else {
      NAME
    }
  }

  override val parseMethodList: Seq[SchemeArgs => ResEither] = List[SchemeArgs => ResEither](
    getNamedScheme,
    parseFile,
    parseString
  )

  private [PartitionSchemeArgResolver] def getNamedScheme(args: SchemeArgs): ResEither = {
    try {
      val options = NamedOptions(args.scheme)
      PartitionSchemeFactory.load(args.sft, options)
      Right(options)
    } catch {
      case NonFatal(e) => Left((s"Unable to load named scheme ${args.scheme}", e, NAME))
    }
  }

  private [PartitionSchemeArgResolver] def parseString(args: SchemeArgs): ResEither = {
    try {
      val options = StorageSerialization.deserialize(args.scheme)
      PartitionSchemeFactory.load(args.sft, options)
      Right(options)
    } catch {
      case NonFatal(e) => Left((s"Unable to load scheme from arg ${args.scheme}", e, CONFSTR))
    }
  }

  private [PartitionSchemeArgResolver] def parseFile(args: SchemeArgs): ResEither = {
    try {
      val handle = PathUtils.interpretPath(args.scheme).headOption.getOrElse {
        throw new RuntimeException(s"Could not read file at ${args.scheme}")
      }
      WithClose(handle.open) { is =>
        if (is.hasNext) {
          val config = IOUtils.toString(is.next._2, StandardCharsets.UTF_8)
          val options = StorageSerialization.deserialize(config)
          PartitionSchemeFactory.load(args.sft, options)
          Right(options)
        } else {
          throw new RuntimeException(s"Could not read file at ${args.scheme}")
        }
      }
    } catch {
      case NonFatal(e) => Left((s"Unable to load scheme from file ${args.scheme}", e, PATH))
    }
  }
}
