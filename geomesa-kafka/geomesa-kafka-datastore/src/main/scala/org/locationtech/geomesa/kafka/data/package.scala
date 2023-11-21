/***********************************************************************
<<<<<<< HEAD
 * Copyright (c) 2013-2023 Commonwealth Computer Research, Inc.
=======
 * Copyright (c) 2013-2022 Commonwealth Computer Research, Inc.
<<<<<<< HEAD
>>>>>>> de758f45a6 (GEOMESA-3198 Kafka streams integration (#2854))
=======
>>>>>>> de758f45a (GEOMESA-3198 Kafka streams integration (#2854))
>>>>>>> 0b3e844fc4 (GEOMESA-3198 Kafka streams integration (#2854))
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Apache License, Version 2.0
 * which accompanies this distribution and is available at
 * http://www.opensource.org/licenses/apache2.0.php.
 ***********************************************************************/

package org.locationtech.geomesa.kafka

import org.apache.kafka.clients.producer.Producer
<<<<<<< HEAD
<<<<<<< HEAD
<<<<<<< HEAD
<<<<<<< HEAD
<<<<<<< HEAD
=======
>>>>>>> 73f3a8cb69 (GEOMESA-3198 Kafka streams integration (#2854))
import org.locationtech.geomesa.utils.concurrent.LazyCloseable
=======
<<<<<<< HEAD
=======
import org.locationtech.geomesa.kafka.utils.GeoMessageSerializer.GeoMessagePartitioner
>>>>>>> de758f45a (GEOMESA-3198 Kafka streams integration (#2854))

import java.io.Closeable
>>>>>>> 1b8cbf843 (GEOMESA-3198 Kafka streams integration (#2854))

package object data {

  val DefaultCatalog: String = "geomesa-catalog"
  val DefaultZkPath: String = "geomesa/ds/kafka"

  class LazyProducer(create: => Producer[Array[Byte], Array[Byte]])
      extends LazyCloseable[Producer[Array[Byte], Array[Byte]]](create)
=======
import org.locationtech.geomesa.kafka.utils.GeoMessageSerializer.GeoMessagePartitioner
<<<<<<< HEAD
=======
=======
import org.locationtech.geomesa.kafka.utils.GeoMessageSerializer.GeoMessagePartitioner
>>>>>>> de758f45a (GEOMESA-3198 Kafka streams integration (#2854))
>>>>>>> 1b8cbf843d (GEOMESA-3198 Kafka streams integration (#2854))
=======
>>>>>>> d845d7c1bd (GEOMESA-3254 Add Bloop build support)
=======
>>>>>>> 58d14a257e (GEOMESA-3254 Add Bloop build support)
=======
>>>>>>> 0b3e844fc4 (GEOMESA-3198 Kafka streams integration (#2854))

import java.io.Closeable

package object data {

  class LazyProducer(create: => Producer[Array[Byte], Array[Byte]]) extends Closeable {

    @volatile
    private var initialized = false

    lazy val producer: Producer[Array[Byte], Array[Byte]] = {
      initialized = true
      create
    }

    override def close(): Unit = {
      if (initialized) {
        producer.close()
      }
    }
  }
<<<<<<< HEAD
>>>>>>> de758f45a6 (GEOMESA-3198 Kafka streams integration (#2854))
=======
>>>>>>> de758f45a (GEOMESA-3198 Kafka streams integration (#2854))
>>>>>>> 0b3e844fc4 (GEOMESA-3198 Kafka streams integration (#2854))
}
