/***********************************************************************
 * Copyright (c) 2013-2024 Commonwealth Computer Research, Inc.
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Apache License, Version 2.0
 * which accompanies this distribution and is available at
 * http://www.opensource.org/licenses/apache2.0.php.
 ***********************************************************************/

package org.locationtech.geomesa.kafka.data

import org.geotools.api.data.{FeatureListener, Transaction}
import org.geotools.api.feature.simple.SimpleFeatureType
import org.geotools.api.filter.Filter
import org.locationtech.geomesa.index.geotools.GeoMesaFeatureStore
import org.locationtech.geomesa.kafka.data.KafkaFeatureWriter.AppendKafkaFeatureWriter
import org.locationtech.geomesa.kafka.index.KafkaListeners
import org.locationtech.geomesa.utils.io.WithClose

<<<<<<< HEAD
class KafkaFeatureStore(ds: KafkaDataStore, sft: SimpleFeatureType, listeners: KafkaListeners)
    extends GeoMesaFeatureStore(ds, sft) {
<<<<<<< HEAD
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
>>>>>>> f1532f2313 (GEOMESA-3254 Add Bloop build support)
=======
>>>>>>> 7564665969 (GEOMESA-3254 Add Bloop build support)
=======
>>>>>>> 3010fc384e (GEOMESA-3100 Kafka layer views (#2784))
=======
class KafkaFeatureStore(ds: KafkaDataStore, sft: SimpleFeatureType, runner: QueryRunner, listeners: KafkaListeners)
    extends GeoMesaFeatureStore(ds, sft, runner) {
<<<<<<< HEAD
>>>>>>> af0a88eb17 (GEOMESA-3100 Kafka layer views (#2784))
=======
>>>>>>> af0a88eb1 (GEOMESA-3100 Kafka layer views (#2784))
>>>>>>> a0314fb7ff (GEOMESA-3100 Kafka layer views (#2784))
=======
>>>>>>> d845d7c1bd (GEOMESA-3254 Add Bloop build support)
<<<<<<< HEAD
<<<<<<< HEAD
=======
>>>>>>> 58d14a257e (GEOMESA-3254 Add Bloop build support)
=======
=======
<<<<<<< HEAD
>>>>>>> ccfb3bd95e (GEOMESA-3100 Kafka layer views (#2784))
=======
>>>>>>> 337ecd16e5 (GEOMESA-3100 Kafka layer views (#2784))
=======
class KafkaFeatureStore(ds: KafkaDataStore, sft: SimpleFeatureType, runner: QueryRunner, listeners: KafkaListeners)
    extends GeoMesaFeatureStore(ds, sft, runner) {
>>>>>>> af0a88eb1 (GEOMESA-3100 Kafka layer views (#2784))
<<<<<<< HEAD
<<<<<<< HEAD
>>>>>>> 17f13b3a7a (GEOMESA-3100 Kafka layer views (#2784))
=======
>>>>>>> 63a045a753 (GEOMESA-3254 Add Bloop build support)
=======
>>>>>>> ccfb3bd95e (GEOMESA-3100 Kafka layer views (#2784))
=======
>>>>>>> 337ecd16e5 (GEOMESA-3100 Kafka layer views (#2784))
=======
=======
class KafkaFeatureStore(ds: KafkaDataStore, sft: SimpleFeatureType, runner: QueryRunner, listeners: KafkaListeners)
    extends GeoMesaFeatureStore(ds, sft, runner) {
<<<<<<< HEAD
>>>>>>> af0a88eb17 (GEOMESA-3100 Kafka layer views (#2784))
<<<<<<< HEAD
>>>>>>> c860f21098 (GEOMESA-3100 Kafka layer views (#2784))
=======
=======
>>>>>>> af0a88eb1 (GEOMESA-3100 Kafka layer views (#2784))
>>>>>>> a0314fb7ff (GEOMESA-3100 Kafka layer views (#2784))
>>>>>>> 8ec26b8c2a (GEOMESA-3100 Kafka layer views (#2784))
=======
>>>>>>> f1532f2313 (GEOMESA-3254 Add Bloop build support)
=======
=======
>>>>>>> 58d14a257e (GEOMESA-3254 Add Bloop build support)
>>>>>>> 7564665969 (GEOMESA-3254 Add Bloop build support)
=======
class KafkaFeatureStore(ds: KafkaDataStore, sft: SimpleFeatureType, runner: QueryRunner, listeners: KafkaListeners)
    extends GeoMesaFeatureStore(ds, sft, runner) {
>>>>>>> af0a88eb1 (GEOMESA-3100 Kafka layer views (#2784))
>>>>>>> 17f13b3a7a (GEOMESA-3100 Kafka layer views (#2784))
>>>>>>> 3010fc384e (GEOMESA-3100 Kafka layer views (#2784))

  override def removeFeatures(filter: Filter): Unit = filter match {
    case Filter.INCLUDE => clearFeatures()
    case _ => super.removeFeatures(filter)
  }

  override def addFeatureListener(listener: FeatureListener): Unit = listeners.addListener(this, listener)

  override def removeFeatureListener(listener: FeatureListener): Unit = listeners.removeListener(this, listener)

  private def clearFeatures(): Unit = {
    WithClose(ds.getFeatureWriterAppend(sft.getTypeName, Transaction.AUTO_COMMIT)) { writer =>
      writer.asInstanceOf[AppendKafkaFeatureWriter].clear()
    }
  }
}
