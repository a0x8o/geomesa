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
<<<<<<< HEAD
=======
>>>>>>> e2a2dd4c2e (GEOMESA-3198 Kafka streams integration (#2854))
>>>>>>> de758f45a6 (GEOMESA-3198 Kafka streams integration (#2854))
<<<<<<< HEAD
>>>>>>> 133afd3681 (GEOMESA-3198 Kafka streams integration (#2854))
=======
=======
>>>>>>> de758f45a (GEOMESA-3198 Kafka streams integration (#2854))
>>>>>>> 0b3e844fc4 (GEOMESA-3198 Kafka streams integration (#2854))
<<<<<<< HEAD
<<<<<<< HEAD
>>>>>>> a7c0500a81 (GEOMESA-3198 Kafka streams integration (#2854))
=======
=======
>>>>>>> de758f45a6 (GEOMESA-3198 Kafka streams integration (#2854))
>>>>>>> 03f3e71921 (GEOMESA-3198 Kafka streams integration (#2854))
>>>>>>> 0452af77a1 (GEOMESA-3198 Kafka streams integration (#2854))
=======
=======
>>>>>>> de758f45a6 (GEOMESA-3198 Kafka streams integration (#2854))
>>>>>>> 03f3e71921 (GEOMESA-3198 Kafka streams integration (#2854))
=======
>>>>>>> e2a2dd4c2e (GEOMESA-3198 Kafka streams integration (#2854))
<<<<<<< HEAD
>>>>>>> 67d93e2791 (GEOMESA-3198 Kafka streams integration (#2854))
=======
=======
>>>>>>> de758f45a6 (GEOMESA-3198 Kafka streams integration (#2854))
>>>>>>> b62770d74c (GEOMESA-3198 Kafka streams integration (#2854))
>>>>>>> 39fae2ee18 (GEOMESA-3198 Kafka streams integration (#2854))
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
<<<<<<< HEAD
<<<<<<< HEAD
<<<<<<< HEAD
<<<<<<< HEAD
<<<<<<< HEAD
<<<<<<< HEAD
<<<<<<< HEAD
<<<<<<< HEAD
<<<<<<< HEAD
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
>>>>>>> e792102d4b (GEOMESA-3198 Kafka streams integration (#2854))
=======
>>>>>>> 5a4c24e020 (GEOMESA-3254 Add Bloop build support)
=======
>>>>>>> e74fa3f690 (GEOMESA-3254 Add Bloop build support)
=======
>>>>>>> c9a6fc453c (GEOMESA-3198 Kafka streams integration (#2854))
=======
>>>>>>> f9df175e9b (GEOMESA-3198 Kafka streams integration (#2854))
=======
>>>>>>> 73f3a8cb69 (GEOMESA-3198 Kafka streams integration (#2854))
=======
>>>>>>> 8d7834ec11 (GEOMESA-3198 Kafka streams integration (#2854))
<<<<<<< HEAD
<<<<<<< HEAD
=======
>>>>>>> 63a045a753 (GEOMESA-3254 Add Bloop build support)
=======
>>>>>>> fa60953a42 (GEOMESA-3254 Add Bloop build support)
<<<<<<< HEAD
<<<<<<< HEAD
=======
>>>>>>> c9a6fc453c (GEOMESA-3198 Kafka streams integration (#2854))
=======
=======
>>>>>>> 73f3a8cb6 (GEOMESA-3198 Kafka streams integration (#2854))
>>>>>>> 4ae16a2980 (GEOMESA-3198 Kafka streams integration (#2854))
<<<<<<< HEAD
<<<<<<< HEAD
=======
>>>>>>> b09307f5c0 (GEOMESA-3198 Kafka streams integration (#2854))
=======
>>>>>>> 03f3e71921 (GEOMESA-3198 Kafka streams integration (#2854))
=======
>>>>>>> 030cd33877 (GEOMESA-3198 Kafka streams integration (#2854))
=======
>>>>>>> f1532f2313 (GEOMESA-3254 Add Bloop build support)
=======
>>>>>>> 7564665969 (GEOMESA-3254 Add Bloop build support)
=======
=======
>>>>>>> 73f3a8cb69 (GEOMESA-3198 Kafka streams integration (#2854))
>>>>>>> d4a13604e7 (GEOMESA-3198 Kafka streams integration (#2854))
=======
>>>>>>> e792102d4b (GEOMESA-3198 Kafka streams integration (#2854))
=======
=======
>>>>>>> 63a045a753 (GEOMESA-3254 Add Bloop build support)
>>>>>>> 5a4c24e020 (GEOMESA-3254 Add Bloop build support)
=======
>>>>>>> e74fa3f690 (GEOMESA-3254 Add Bloop build support)
=======
>>>>>>> c9a6fc453c (GEOMESA-3198 Kafka streams integration (#2854))
=======
=======
>>>>>>> b09307f5c0 (GEOMESA-3198 Kafka streams integration (#2854))
>>>>>>> f9df175e9b (GEOMESA-3198 Kafka streams integration (#2854))
=======
>>>>>>> b62770d74c (GEOMESA-3198 Kafka streams integration (#2854))
=======
>>>>>>> 7258020868 (GEOMESA-3198 Kafka streams integration (#2854))
=======
>>>>>>> 7a84c9d22d (GEOMESA-3254 Add Bloop build support)
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
<<<<<<< HEAD
<<<<<<< HEAD
<<<<<<< HEAD
<<<<<<< HEAD
<<<<<<< HEAD
<<<<<<< HEAD
<<<<<<< HEAD
=======
>>>>>>> 8d7834ec11 (GEOMESA-3198 Kafka streams integration (#2854))
=======
>>>>>>> 030cd33877 (GEOMESA-3198 Kafka streams integration (#2854))
=======
>>>>>>> e2a2dd4c2e (GEOMESA-3198 Kafka streams integration (#2854))
=======
=======
>>>>>>> 8d7834ec11 (GEOMESA-3198 Kafka streams integration (#2854))
>>>>>>> e792102d4b (GEOMESA-3198 Kafka streams integration (#2854))
=======
>>>>>>> 7258020868 (GEOMESA-3198 Kafka streams integration (#2854))
=======
=======
import org.locationtech.geomesa.kafka.utils.GeoMessageSerializer.GeoMessagePartitioner
>>>>>>> de758f45a (GEOMESA-3198 Kafka streams integration (#2854))
<<<<<<< HEAD
<<<<<<< HEAD
<<<<<<< HEAD
<<<<<<< HEAD
=======
>>>>>>> e792102d4b (GEOMESA-3198 Kafka streams integration (#2854))
>>>>>>> 1b8cbf843d (GEOMESA-3198 Kafka streams integration (#2854))
=======
>>>>>>> d845d7c1bd (GEOMESA-3254 Add Bloop build support)
<<<<<<< HEAD
<<<<<<< HEAD
<<<<<<< HEAD
=======
>>>>>>> 58d14a257e (GEOMESA-3254 Add Bloop build support)
=======
>>>>>>> 0b3e844fc4 (GEOMESA-3198 Kafka streams integration (#2854))
<<<<<<< HEAD
<<<<<<< HEAD
=======
>>>>>>> 1b8cbf843 (GEOMESA-3198 Kafka streams integration (#2854))
<<<<<<< HEAD
>>>>>>> 8d7834ec11 (GEOMESA-3198 Kafka streams integration (#2854))
=======
=======
>>>>>>> d845d7c1b (GEOMESA-3254 Add Bloop build support)
<<<<<<< HEAD
>>>>>>> 63a045a753 (GEOMESA-3254 Add Bloop build support)
=======
=======
>>>>>>> 58d14a257 (GEOMESA-3254 Add Bloop build support)
>>>>>>> fa60953a42 (GEOMESA-3254 Add Bloop build support)
<<<<<<< HEAD
=======
>>>>>>> 03f3e71921 (GEOMESA-3198 Kafka streams integration (#2854))
=======
>>>>>>> 1b8cbf843d (GEOMESA-3198 Kafka streams integration (#2854))
>>>>>>> 030cd33877 (GEOMESA-3198 Kafka streams integration (#2854))
=======
>>>>>>> f1532f2313 (GEOMESA-3254 Add Bloop build support)
=======
=======
>>>>>>> 58d14a257e (GEOMESA-3254 Add Bloop build support)
>>>>>>> 7564665969 (GEOMESA-3254 Add Bloop build support)
=======
>>>>>>> e2a2dd4c2e (GEOMESA-3198 Kafka streams integration (#2854))
=======
=======
>>>>>>> 1b8cbf843 (GEOMESA-3198 Kafka streams integration (#2854))
<<<<<<< HEAD
>>>>>>> 8d7834ec11 (GEOMESA-3198 Kafka streams integration (#2854))
<<<<<<< HEAD
>>>>>>> e792102d4b (GEOMESA-3198 Kafka streams integration (#2854))
=======
=======
=======
>>>>>>> d845d7c1b (GEOMESA-3254 Add Bloop build support)
>>>>>>> 63a045a753 (GEOMESA-3254 Add Bloop build support)
>>>>>>> 5a4c24e020 (GEOMESA-3254 Add Bloop build support)
=======
>>>>>>> e74fa3f690 (GEOMESA-3254 Add Bloop build support)
=======
>>>>>>> b62770d74c (GEOMESA-3198 Kafka streams integration (#2854))
=======
>>>>>>> 1b8cbf843d (GEOMESA-3198 Kafka streams integration (#2854))
>>>>>>> 7258020868 (GEOMESA-3198 Kafka streams integration (#2854))
=======
>>>>>>> 7a84c9d22d (GEOMESA-3254 Add Bloop build support)

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
<<<<<<< HEAD
<<<<<<< HEAD
<<<<<<< HEAD
=======
>>>>>>> e2a2dd4c2e (GEOMESA-3198 Kafka streams integration (#2854))
>>>>>>> de758f45a6 (GEOMESA-3198 Kafka streams integration (#2854))
=======
>>>>>>> de758f45a (GEOMESA-3198 Kafka streams integration (#2854))
>>>>>>> 0b3e844fc4 (GEOMESA-3198 Kafka streams integration (#2854))
<<<<<<< HEAD
=======
>>>>>>> de758f45a6 (GEOMESA-3198 Kafka streams integration (#2854))
>>>>>>> 03f3e71921 (GEOMESA-3198 Kafka streams integration (#2854))
=======
>>>>>>> e2a2dd4c2e (GEOMESA-3198 Kafka streams integration (#2854))
=======
>>>>>>> de758f45a6 (GEOMESA-3198 Kafka streams integration (#2854))
>>>>>>> b62770d74c (GEOMESA-3198 Kafka streams integration (#2854))
}
