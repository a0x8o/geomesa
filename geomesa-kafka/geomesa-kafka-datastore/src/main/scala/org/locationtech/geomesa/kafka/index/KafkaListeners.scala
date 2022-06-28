/***********************************************************************
<<<<<<< HEAD
<<<<<<< HEAD
<<<<<<< HEAD
<<<<<<< HEAD
<<<<<<< HEAD
=======
=======
<<<<<<< HEAD
>>>>>>> geomesa-kafka
=======
<<<<<<< HEAD
=======
>>>>>>> d0dc799ff (GEOMESA-3100 Kafka layer views (#2784))
=======
<<<<<<< HEAD
>>>>>>> feature/schema-registry
 * Copyright (c) 2013-2021 Commonwealth Computer Research, Inc.
=======
<<<<<<< HEAD
=======
>>>>>>> 58286bfd3 (GEOMESA-3100 Kafka layer views (#2784))
<<<<<<< HEAD
<<<<<<< HEAD
=======
>>>>>>> 5ca0cd6de (GEOMESA-3100 Kafka layer views (#2784))
>>>>>>> geomesa-kafka
=======
>>>>>>> 5ca0cd6de (GEOMESA-3100 Kafka layer views (#2784))
<<<<<<< HEAD
=======
>>>>>>> bddfdbea5 (GEOMESA-3100 Kafka layer views (#2784))
=======
>>>>>>> d0dc799ff (GEOMESA-3100 Kafka layer views (#2784))
>>>>>>> feature/schema-registry
=======
>>>>>>> feature/postgis-fixes
 * Copyright (c) 2013-2022 Commonwealth Computer Research, Inc.
=======
 * Copyright (c) 2013-2021 Commonwealth Computer Research, Inc.
>>>>>>> af0a88eb1 (GEOMESA-3100 Kafka layer views (#2784))
<<<<<<< HEAD
<<<<<<< HEAD
<<<<<<< HEAD
<<<<<<< HEAD
>>>>>>> locationtech-main
=======
>>>>>>> 58286bfd3 (GEOMESA-3100 Kafka layer views (#2784))
=======
=======
<<<<<<< HEAD
=======
>>>>>>> d0dc799ff (GEOMESA-3100 Kafka layer views (#2784))
>>>>>>> feature/schema-registry
=======
<<<<<<< HEAD
>>>>>>> locationtech-main
=======
>>>>>>> 58286bfd3 (GEOMESA-3100 Kafka layer views (#2784))
>>>>>>> 5ca0cd6de (GEOMESA-3100 Kafka layer views (#2784))
<<<<<<< HEAD
>>>>>>> geomesa-kafka
=======
<<<<<<< HEAD
=======
>>>>>>> bddfdbea5 (GEOMESA-3100 Kafka layer views (#2784))
=======
>>>>>>> d0dc799ff (GEOMESA-3100 Kafka layer views (#2784))
>>>>>>> feature/schema-registry
=======
>>>>>>> feature/postgis-fixes
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Apache License, Version 2.0
 * which accompanies this distribution and is available at
 * http://www.opensource.org/licenses/apache2.0.php.
 ***********************************************************************/

package org.locationtech.geomesa.kafka.index

import com.typesafe.scalalogging.StrictLogging
import org.geotools.data.simple.SimpleFeatureSource
import org.geotools.data.{FeatureEvent, FeatureListener}
import org.locationtech.geomesa.kafka.utils.KafkaFeatureEvent
import org.opengis.feature.simple.SimpleFeature

import java.util.Collections
import java.util.concurrent.ConcurrentHashMap
import scala.util.control.NonFatal

trait KafkaListeners extends StrictLogging {

  import scala.collection.JavaConverters._

  // use a flag instead of checking listeners.isEmpty, which is slightly expensive for ConcurrentHashMap
  @volatile
  private var hasListeners = false

  private val listeners = {
    val map = new ConcurrentHashMap[(SimpleFeatureSource, FeatureListener), java.lang.Boolean]()
    Collections.newSetFromMap(map).asScala
  }

  def addListener(source: SimpleFeatureSource, listener: FeatureListener): Unit = synchronized {
    listeners.add((source, listener))
    hasListeners = true
  }

  def removeListener(source: SimpleFeatureSource, listener: FeatureListener): Unit = synchronized {
    listeners.remove((source, listener))
    hasListeners = listeners.nonEmpty
  }

  private[kafka] def fireChange(timestamp: Long, feature: SimpleFeature): Unit = {
    if (hasListeners) {
      fireEvent(KafkaFeatureEvent.changed(_, feature, timestamp))
    }
  }

  private[kafka] def fireDelete(timestamp: Long, id: String, removed: => SimpleFeature): Unit = {
    if (hasListeners) {
      fireEvent(KafkaFeatureEvent.removed(_, id, removed, timestamp))
    }
  }

  private[kafka] def fireClear(timestamp: Long): Unit = {
    if (hasListeners) {
      fireEvent(KafkaFeatureEvent.cleared(_, timestamp))
    }
  }

  private def fireEvent(toEvent: SimpleFeatureSource => FeatureEvent): Unit = {
    listeners.foreach { case (source, listener) =>
      val event = toEvent(source)
      try { listener.changed(event) } catch {
        case NonFatal(e) => logger.error(s"Error in feature listener for $event", e)
      }
    }
  }
}
