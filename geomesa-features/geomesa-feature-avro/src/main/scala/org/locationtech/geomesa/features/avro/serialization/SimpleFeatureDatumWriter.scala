/***********************************************************************
<<<<<<< HEAD
<<<<<<< HEAD
=======
 * Copyright (c) 2013-2024 Commonwealth Computer Research, Inc.
=======
<<<<<<< HEAD
>>>>>>> locatelli-main
 * Copyright (c) 2013-2023 Commonwealth Computer Research, Inc.
=======
 * Copyright (c) 2013-2022 Commonwealth Computer Research, Inc.
<<<<<<< HEAD
<<<<<<< HEAD
<<<<<<< HEAD
<<<<<<< HEAD
<<<<<<< HEAD
<<<<<<< HEAD
>>>>>>> 58d14a257 (GEOMESA-3254 Add Bloop build support)
=======
<<<<<<< HEAD
=======
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
>>>>>>> e74fa3f690 (GEOMESA-3254 Add Bloop build support)
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
>>>>>>> e74fa3f690 (GEOMESA-3254 Add Bloop build support)
<<<<<<< HEAD
>>>>>>> locatelli-main
=======
>>>>>>> locatelli-main
=======
>>>>>>> locatelli-main
=======
>>>>>>> 3e610250ce (GEOMESA-3254 Add Bloop build support)
=======
>>>>>>> f586fec5a3 (GEOMESA-3254 Add Bloop build support)
=======
=======
>>>>>>> e74fa3f690 (GEOMESA-3254 Add Bloop build support)
>>>>>>> b39bd292d4 (GEOMESA-3254 Add Bloop build support)
<<<<<<< HEAD
<<<<<<< HEAD
<<<<<<< HEAD
>>>>>>> locatelli-main
=======
>>>>>>> locatelli-main
=======
>>>>>>> locatelli-main
>>>>>>> 58d14a257e (GEOMESA-3254 Add Bloop build support)
=======
>>>>>>> 58d14a257e (GEOMESA-3254 Add Bloop build support)
<<<<<<< HEAD
>>>>>>> 1463162d60 (GEOMESA-3254 Add Bloop build support)
=======
>>>>>>> locatelli-main
=======
>>>>>>> 58d14a257 (GEOMESA-3254 Add Bloop build support)
>>>>>>> fa60953a42 (GEOMESA-3254 Add Bloop build support)
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
>>>>>>> b39bd292d4 (GEOMESA-3254 Add Bloop build support)
<<<<<<< HEAD
>>>>>>> locatelli-main
=======
>>>>>>> locatelli-main
=======
<<<<<<< HEAD
=======
>>>>>>> b39bd292d4 (GEOMESA-3254 Add Bloop build support)
>>>>>>> locatelli-main
=======
<<<<<<< HEAD
>>>>>>> 9f430502b2 (GEOMESA-3254 Add Bloop build support)
=======
=======
>>>>>>> 58d14a257e (GEOMESA-3254 Add Bloop build support)
>>>>>>> 7564665969 (GEOMESA-3254 Add Bloop build support)
>>>>>>> dce8c58b44 (GEOMESA-3254 Add Bloop build support)
=======
=======
>>>>>>> 0bd247219b (GEOMESA-3254 Add Bloop build support)
=======
>>>>>>> 847c6dae88 (GEOMESA-3254 Add Bloop build support)
=======
=======
>>>>>>> b39bd292d4 (GEOMESA-3254 Add Bloop build support)
>>>>>>> fb054a34dc (GEOMESA-3254 Add Bloop build support)
>>>>>>> locatelli-main
=======
>>>>>>> 58d14a257e (GEOMESA-3254 Add Bloop build support)
>>>>>>> 7564665969 (GEOMESA-3254 Add Bloop build support)
=======
>>>>>>> e74fa3f690 (GEOMESA-3254 Add Bloop build support)
<<<<<<< HEAD
<<<<<<< HEAD
<<<<<<< HEAD
<<<<<<< HEAD
>>>>>>> locationtech-main
=======
<<<<<<< HEAD
=======
>>>>>>> locatelli-main
=======
>>>>>>> locatelli-main
=======
>>>>>>> 58d14a257e (GEOMESA-3254 Add Bloop build support)
>>>>>>> 9e49c1aac7 (GEOMESA-3254 Add Bloop build support)
=======
>>>>>>> 3e610250ce (GEOMESA-3254 Add Bloop build support)
=======
>>>>>>> b727e40f7c (GEOMESA-3254 Add Bloop build support)
=======
=======
>>>>>>> fb054a34dc (GEOMESA-3254 Add Bloop build support)
=======
>>>>>>> 58d14a257e (GEOMESA-3254 Add Bloop build support)
>>>>>>> 9e49c1aac7 (GEOMESA-3254 Add Bloop build support)
<<<<<<< HEAD
>>>>>>> 3515f7f054 (GEOMESA-3254 Add Bloop build support)
=======
=======
>>>>>>> 3e610250ce (GEOMESA-3254 Add Bloop build support)
<<<<<<< HEAD
>>>>>>> 0bd247219b (GEOMESA-3254 Add Bloop build support)
=======
>>>>>>> locatelli-main
=======
=======
>>>>>>> 58d14a257e (GEOMESA-3254 Add Bloop build support)
>>>>>>> 7564665969 (GEOMESA-3254 Add Bloop build support)
>>>>>>> f586fec5a3 (GEOMESA-3254 Add Bloop build support)
<<<<<<< HEAD
=======
>>>>>>> b39bd292d4 (GEOMESA-3254 Add Bloop build support)
<<<<<<< HEAD
<<<<<<< HEAD
>>>>>>> locatelli-main
=======
>>>>>>> locatelli-main
=======
>>>>>>> locatelli-main
=======
<<<<<<< HEAD
>>>>>>> 847c6dae88 (GEOMESA-3254 Add Bloop build support)
=======
=======
>>>>>>> b39bd292d4 (GEOMESA-3254 Add Bloop build support)
>>>>>>> fb054a34dc (GEOMESA-3254 Add Bloop build support)
>>>>>>> locatelli-main
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Apache License, Version 2.0
 * which accompanies this distribution and is available at
 * http://www.opensource.org/licenses/apache2.0.php.
 ***********************************************************************/

package org.locationtech.geomesa.features.avro.serialization

import org.apache.avro.Schema
import org.apache.avro.io.{DatumWriter, Encoder}
import org.locationtech.geomesa.features.SerializationOption.SerializationOption
import org.opengis.feature.simple.{SimpleFeature, SimpleFeatureType}

/**
 * Datum writer for simple features
 *
 * @param sft simple feature type to write
 * @param opts serialization options
 */
class SimpleFeatureDatumWriter(sft: SimpleFeatureType, opts: Set[SerializationOption] = Set.empty)
    extends DatumWriter[SimpleFeature] {

  private val serde = AvroSerialization(sft, opts)

  private val fid = serde.fid.orNull
  private val fields = serde.fields.toArray
  private val userData = serde.userData.orNull

  private var schema = serde.schema

  def getSchema: Schema = schema

  override def setSchema(schema: Schema): Unit = this.schema = schema

  override def write(datum: SimpleFeature, out: Encoder): Unit = {
    AvroField.VersionField.write(out, serde.version)
    if (fid != null) {
      fid.write(out, datum.getID)
    }
    var i = 0
    while (i < sft.getAttributeCount) {
      fields(i).write(out, datum.getAttribute(i))
      i += 1
    }
    if (userData != null) {
      userData.write(out, datum.getUserData)
    }
  }
}
