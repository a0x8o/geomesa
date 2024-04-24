/***********************************************************************
 * Copyright (c) 2013-2024 Commonwealth Computer Research, Inc.
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Apache License, Version 2.0
 * which accompanies this distribution and is available at
 * http://www.opensource.org/licenses/apache2.0.php.
 ***********************************************************************/

package org.locationtech.geomesa.lambda

<<<<<<< HEAD
<<<<<<< HEAD
<<<<<<< HEAD
<<<<<<< HEAD
<<<<<<< HEAD
<<<<<<< HEAD
<<<<<<< HEAD
<<<<<<< HEAD
=======
>>>>>>> a6f7217266 (GEOMESA-3258 Use zookeeper docker for offset manager test (#2971))
=======
>>>>>>> 247707e7e5 (GEOMESA-3258 Use docker instead of embedded Kafka for tests (#2957))
=======
>>>>>>> 564f32a99e (GEOMESA-3258 Use zookeeper docker for offset manager test (#2971))
<<<<<<< HEAD
=======
>>>>>>> 4794e7a57e (GEOMESA-3258 Use docker instead of embedded Kafka for tests (#2957))
=======
>>>>>>> fae5c0e52f (GEOMESA-3258 Use zookeeper docker for offset manager test (#2971))
=======
=======
>>>>>>> 247707e7e5 (GEOMESA-3258 Use docker instead of embedded Kafka for tests (#2957))
>>>>>>> 0dba605f9e (GEOMESA-3258 Use docker instead of embedded Kafka for tests (#2957))
=======
>>>>>>> a6f7217266 (GEOMESA-3258 Use zookeeper docker for offset manager test (#2971))
import com.typesafe.scalalogging.LazyLogging
import org.junit.runner.RunWith
import org.locationtech.geomesa.lambda.stream.OffsetManager.OffsetListener
import org.locationtech.geomesa.lambda.stream.ZookeeperOffsetManager
import org.specs2.mutable.Specification
import org.specs2.runner.JUnitRunner
import org.specs2.specification.BeforeAfterAll
import org.testcontainers.containers.GenericContainer
import org.testcontainers.containers.output.Slf4jLogConsumer
import org.testcontainers.utility.DockerImageName

import java.util.concurrent.{LinkedBlockingQueue, TimeUnit}
<<<<<<< HEAD
<<<<<<< HEAD
<<<<<<< HEAD
<<<<<<< HEAD
<<<<<<< HEAD
<<<<<<< HEAD
=======
>>>>>>> 6c49ac84e4 (Try to fix intermittent zookeeper test failures)
=======
>>>>>>> 6d1a5d55eb (Try to fix intermittent zookeeper test failures)
=======
>>>>>>> 0dba605f9e (GEOMESA-3258 Use docker instead of embedded Kafka for tests (#2957))
=======
=======
import com.typesafe.scalalogging.LazyLogging
>>>>>>> a03d53d147 (GEOMESA-3258 Use zookeeper docker for offset manager test (#2971))
import org.junit.runner.RunWith
import org.locationtech.geomesa.lambda.stream.OffsetManager.OffsetListener
import org.locationtech.geomesa.lambda.stream.ZookeeperOffsetManager
import org.specs2.mutable.Specification
import org.specs2.runner.JUnitRunner
import org.specs2.specification.BeforeAfterAll
import org.testcontainers.containers.GenericContainer
import org.testcontainers.containers.output.Slf4jLogConsumer
import org.testcontainers.utility.DockerImageName

@RunWith(classOf[JUnitRunner])
<<<<<<< HEAD
class ZookeeperOffsetManagerTest extends LambdaContainerTest {
>>>>>>> 0b203c6713 (GEOMESA-3258 Use docker instead of embedded Kafka for tests (#2957))
=======
class ZookeeperOffsetManagerTest extends Specification with BeforeAfterAll with LazyLogging {
>>>>>>> a03d53d147 (GEOMESA-3258 Use zookeeper docker for offset manager test (#2971))
=======
>>>>>>> 77f2650b49 (Try to fix intermittent zookeeper test failures)
<<<<<<< HEAD
<<<<<<< HEAD
<<<<<<< HEAD
=======
=======
=======
import com.typesafe.scalalogging.LazyLogging
>>>>>>> a03d53d147 (GEOMESA-3258 Use zookeeper docker for offset manager test (#2971))
import org.junit.runner.RunWith
import org.locationtech.geomesa.lambda.stream.OffsetManager.OffsetListener
import org.locationtech.geomesa.lambda.stream.ZookeeperOffsetManager
import org.specs2.mutable.Specification
import org.specs2.runner.JUnitRunner
import org.specs2.specification.BeforeAfterAll
import org.testcontainers.containers.GenericContainer
import org.testcontainers.containers.output.Slf4jLogConsumer
import org.testcontainers.utility.DockerImageName

@RunWith(classOf[JUnitRunner])
<<<<<<< HEAD
class ZookeeperOffsetManagerTest extends LambdaContainerTest {
>>>>>>> 0b203c6713 (GEOMESA-3258 Use docker instead of embedded Kafka for tests (#2957))
<<<<<<< HEAD
>>>>>>> 247707e7e5 (GEOMESA-3258 Use docker instead of embedded Kafka for tests (#2957))
=======
=======
class ZookeeperOffsetManagerTest extends Specification with BeforeAfterAll with LazyLogging {
>>>>>>> a03d53d147 (GEOMESA-3258 Use zookeeper docker for offset manager test (#2971))
>>>>>>> 564f32a99e (GEOMESA-3258 Use zookeeper docker for offset manager test (#2971))
=======
>>>>>>> 6c49ac84e4 (Try to fix intermittent zookeeper test failures)
=======
=======
=======
import com.typesafe.scalalogging.LazyLogging
>>>>>>> a03d53d147 (GEOMESA-3258 Use zookeeper docker for offset manager test (#2971))
import org.junit.runner.RunWith
import org.locationtech.geomesa.lambda.stream.OffsetManager.OffsetListener
import org.locationtech.geomesa.lambda.stream.ZookeeperOffsetManager
import org.specs2.mutable.Specification
import org.specs2.runner.JUnitRunner
import org.specs2.specification.BeforeAfterAll
import org.testcontainers.containers.GenericContainer
import org.testcontainers.containers.output.Slf4jLogConsumer
import org.testcontainers.utility.DockerImageName

@RunWith(classOf[JUnitRunner])
<<<<<<< HEAD
class ZookeeperOffsetManagerTest extends LambdaContainerTest {
>>>>>>> 0b203c6713 (GEOMESA-3258 Use docker instead of embedded Kafka for tests (#2957))
<<<<<<< HEAD
>>>>>>> 4794e7a57e (GEOMESA-3258 Use docker instead of embedded Kafka for tests (#2957))
=======
=======
class ZookeeperOffsetManagerTest extends Specification with BeforeAfterAll with LazyLogging {
>>>>>>> a03d53d147 (GEOMESA-3258 Use zookeeper docker for offset manager test (#2971))
>>>>>>> fae5c0e52f (GEOMESA-3258 Use zookeeper docker for offset manager test (#2971))
=======
>>>>>>> 6d1a5d55eb (Try to fix intermittent zookeeper test failures)
=======
=======
=======
=======
import com.typesafe.scalalogging.LazyLogging
>>>>>>> a03d53d147 (GEOMESA-3258 Use zookeeper docker for offset manager test (#2971))
import org.junit.runner.RunWith
import org.locationtech.geomesa.lambda.stream.OffsetManager.OffsetListener
import org.locationtech.geomesa.lambda.stream.ZookeeperOffsetManager
import org.specs2.mutable.Specification
import org.specs2.runner.JUnitRunner
import org.specs2.specification.BeforeAfterAll
import org.testcontainers.containers.GenericContainer
import org.testcontainers.containers.output.Slf4jLogConsumer
import org.testcontainers.utility.DockerImageName

@RunWith(classOf[JUnitRunner])
<<<<<<< HEAD
class ZookeeperOffsetManagerTest extends LambdaContainerTest {
>>>>>>> 0b203c6713 (GEOMESA-3258 Use docker instead of embedded Kafka for tests (#2957))
<<<<<<< HEAD
>>>>>>> 247707e7e5 (GEOMESA-3258 Use docker instead of embedded Kafka for tests (#2957))
<<<<<<< HEAD
>>>>>>> 0dba605f9e (GEOMESA-3258 Use docker instead of embedded Kafka for tests (#2957))
=======
=======
=======
class ZookeeperOffsetManagerTest extends Specification with BeforeAfterAll with LazyLogging {
>>>>>>> a03d53d147 (GEOMESA-3258 Use zookeeper docker for offset manager test (#2971))
>>>>>>> 564f32a99e (GEOMESA-3258 Use zookeeper docker for offset manager test (#2971))
>>>>>>> a6f7217266 (GEOMESA-3258 Use zookeeper docker for offset manager test (#2971))

@RunWith(classOf[JUnitRunner])
class ZookeeperOffsetManagerTest extends Specification with BeforeAfterAll with LazyLogging {

  private var container: GenericContainer[_] = _
<<<<<<< HEAD
=======
<<<<<<< HEAD
<<<<<<< HEAD
<<<<<<< HEAD
=======
=======
=======
=======

  lazy val host = Option(container).map(_.getHost).getOrElse("localhost")
  lazy val port = Option(container).map(_.getFirstMappedPort).getOrElse(2181).toString
  lazy val zookeepers = s"$host:$port"

  override def beforeAll(): Unit = {
    val image =
      DockerImageName.parse("zookeeper")
          .withTag(sys.props.getOrElse("zookeeper.docker.tag", "3.6.4"))
    container = new GenericContainer(image)
    container.addExposedPort(2181)
    container.start()
    container.followOutput(new Slf4jLogConsumer(logger.underlying))
  }

  override def afterAll(): Unit = {
    if (container != null) {
      container.stop()
    }
  }
>>>>>>> a03d53d147 (GEOMESA-3258 Use zookeeper docker for offset manager test (#2971))
>>>>>>> 564f32a99e (GEOMESA-3258 Use zookeeper docker for offset manager test (#2971))
>>>>>>> a6f7217266 (GEOMESA-3258 Use zookeeper docker for offset manager test (#2971))

<<<<<<< HEAD
  lazy val host = Option(container).map(_.getHost).getOrElse("localhost")
  lazy val port = Option(container).map(_.getFirstMappedPort).getOrElse(2181).toString
  lazy val zookeepers = s"$host:$port"

  override def beforeAll(): Unit = {
    val image =
      DockerImageName.parse("zookeeper")
          .withTag(sys.props.getOrElse("zookeeper.docker.tag", "3.6.4"))
    container = new GenericContainer(image)
    container.addExposedPort(2181)
    container.start()
    container.followOutput(new Slf4jLogConsumer(logger.underlying))
  }

  override def afterAll(): Unit = {
    if (container != null) {
      container.stop()
    }
  }
>>>>>>> a03d53d147 (GEOMESA-3258 Use zookeeper docker for offset manager test (#2971))
>>>>>>> fae5c0e52f (GEOMESA-3258 Use zookeeper docker for offset manager test (#2971))

<<<<<<< HEAD
<<<<<<< HEAD
  lazy val host = Option(container).map(_.getHost).getOrElse("localhost")
  lazy val port = Option(container).map(_.getFirstMappedPort).getOrElse(2181).toString
  lazy val zookeepers = s"$host:$port"

  override def beforeAll(): Unit = {
    val image =
      DockerImageName.parse("zookeeper")
          .withTag(sys.props.getOrElse("zookeeper.docker.tag", "3.6.4"))
    container = new GenericContainer(image)
    container.addExposedPort(2181)
    container.start()
    container.followOutput(new Slf4jLogConsumer(logger.underlying))
  }

  override def afterAll(): Unit = {
    if (container != null) {
      container.stop()
    }
  }
>>>>>>> a03d53d147 (GEOMESA-3258 Use zookeeper docker for offset manager test (#2971))
>>>>>>> 564f32a99e (GEOMESA-3258 Use zookeeper docker for offset manager test (#2971))

<<<<<<< HEAD
<<<<<<< HEAD
  lazy val host = Option(container).map(_.getHost).getOrElse("localhost")
  lazy val port = Option(container).map(_.getFirstMappedPort).getOrElse(2181).toString
  lazy val zookeepers = s"$host:$port"

  override def beforeAll(): Unit = {
    val image =
      DockerImageName.parse("zookeeper")
          .withTag(sys.props.getOrElse("zookeeper.docker.tag", "3.6.4"))
    container = new GenericContainer(image)
    container.addExposedPort(2181)
    container.start()
    container.followOutput(new Slf4jLogConsumer(logger.underlying))
  }

  override def afterAll(): Unit = {
    if (container != null) {
      container.stop()
    }
  }
>>>>>>> a03d53d147 (GEOMESA-3258 Use zookeeper docker for offset manager test (#2971))

<<<<<<< HEAD
<<<<<<< HEAD
  lazy val host = Option(container).map(_.getHost).getOrElse("localhost")
  lazy val port = Option(container).map(_.getFirstMappedPort).getOrElse(2181).toString
  lazy val zookeepers = s"$host:$port"

  override def beforeAll(): Unit = {
    val image =
      DockerImageName.parse("zookeeper")
          .withTag(sys.props.getOrElse("zookeeper.docker.tag", "3.6.4"))
    container = new GenericContainer(image)
    container.addExposedPort(2181)
    container.start()
    container.followOutput(new Slf4jLogConsumer(logger.underlying))
  }

  override def afterAll(): Unit = {
    if (container != null) {
      container.stop()
    }
  }

=======
>>>>>>> 247707e7e5 (GEOMESA-3258 Use docker instead of embedded Kafka for tests (#2957))
=======
<<<<<<< HEAD
>>>>>>> 4794e7a57e (GEOMESA-3258 Use docker instead of embedded Kafka for tests (#2957))
=======
=======
>>>>>>> 0dba605f9e (GEOMESA-3258 Use docker instead of embedded Kafka for tests (#2957))
>>>>>>> 0b203c6713 (GEOMESA-3258 Use docker instead of embedded Kafka for tests (#2957))
  "ZookeeperOffsetManager" should {
    "store and retrieve offsets" in {
      val manager = new ZookeeperOffsetManager(zookeepers, "ZookeeperOffsetManagerTest")
<<<<<<< HEAD
<<<<<<< HEAD
<<<<<<< HEAD
<<<<<<< HEAD
<<<<<<< HEAD
<<<<<<< HEAD
<<<<<<< HEAD
=======
>>>>>>> a6f7217266 (GEOMESA-3258 Use zookeeper docker for offset manager test (#2971))
=======
>>>>>>> 77f2650b49 (Try to fix intermittent zookeeper test failures)
=======
>>>>>>> 564f32a99e (GEOMESA-3258 Use zookeeper docker for offset manager test (#2971))
<<<<<<< HEAD
=======
=======
>>>>>>> 77f2650b49 (Try to fix intermittent zookeeper test failures)
>>>>>>> 6c49ac84e4 (Try to fix intermittent zookeeper test failures)
=======
>>>>>>> fae5c0e52f (GEOMESA-3258 Use zookeeper docker for offset manager test (#2971))
=======
=======
>>>>>>> 77f2650b49 (Try to fix intermittent zookeeper test failures)
>>>>>>> 6d1a5d55eb (Try to fix intermittent zookeeper test failures)
=======
>>>>>>> a6f7217266 (GEOMESA-3258 Use zookeeper docker for offset manager test (#2971))
      try {
        foreach(0 until 3) { i =>
          manager.getOffset("foo", i) mustEqual -1L
          manager.setOffset("foo", i, i)
          manager.getOffset("foo", i) mustEqual i
        }
      } finally {
        manager.close()
      }
<<<<<<< HEAD
<<<<<<< HEAD
<<<<<<< HEAD
<<<<<<< HEAD
<<<<<<< HEAD
<<<<<<< HEAD
=======
>>>>>>> 564f32a99e (GEOMESA-3258 Use zookeeper docker for offset manager test (#2971))
=======
>>>>>>> 6c49ac84e4 (Try to fix intermittent zookeeper test failures)
=======
>>>>>>> fae5c0e52f (GEOMESA-3258 Use zookeeper docker for offset manager test (#2971))
=======
>>>>>>> 6d1a5d55eb (Try to fix intermittent zookeeper test failures)
=======
=======
>>>>>>> 564f32a99e (GEOMESA-3258 Use zookeeper docker for offset manager test (#2971))
>>>>>>> a6f7217266 (GEOMESA-3258 Use zookeeper docker for offset manager test (#2971))
=======
      val offsets = 0 until 3
      forall(offsets)(i => manager.getOffset("foo", i) mustEqual -1L)
      offsets.foreach(i => manager.setOffset("foo", i, i))
      forall(offsets)(i => manager.getOffset("foo", i) mustEqual i)
>>>>>>> a03d53d147 (GEOMESA-3258 Use zookeeper docker for offset manager test (#2971))
<<<<<<< HEAD
<<<<<<< HEAD
<<<<<<< HEAD
<<<<<<< HEAD
<<<<<<< HEAD
=======
>>>>>>> a6f7217266 (GEOMESA-3258 Use zookeeper docker for offset manager test (#2971))
=======
>>>>>>> 77f2650b49 (Try to fix intermittent zookeeper test failures)
=======
>>>>>>> 564f32a99e (GEOMESA-3258 Use zookeeper docker for offset manager test (#2971))
<<<<<<< HEAD
=======
=======
>>>>>>> 77f2650b49 (Try to fix intermittent zookeeper test failures)
>>>>>>> 6c49ac84e4 (Try to fix intermittent zookeeper test failures)
=======
>>>>>>> fae5c0e52f (GEOMESA-3258 Use zookeeper docker for offset manager test (#2971))
=======
=======
>>>>>>> 77f2650b49 (Try to fix intermittent zookeeper test failures)
>>>>>>> 6d1a5d55eb (Try to fix intermittent zookeeper test failures)
=======
>>>>>>> a6f7217266 (GEOMESA-3258 Use zookeeper docker for offset manager test (#2971))
    }

    "trigger listeners" in {
      val manager = new ZookeeperOffsetManager(zookeepers, "ZookeeperOffsetManagerTest")
<<<<<<< HEAD
<<<<<<< HEAD
<<<<<<< HEAD
<<<<<<< HEAD
<<<<<<< HEAD
<<<<<<< HEAD
<<<<<<< HEAD
=======
>>>>>>> a6f7217266 (GEOMESA-3258 Use zookeeper docker for offset manager test (#2971))
=======
>>>>>>> 77f2650b49 (Try to fix intermittent zookeeper test failures)
=======
>>>>>>> 564f32a99e (GEOMESA-3258 Use zookeeper docker for offset manager test (#2971))
<<<<<<< HEAD
=======
=======
>>>>>>> 77f2650b49 (Try to fix intermittent zookeeper test failures)
>>>>>>> 6c49ac84e4 (Try to fix intermittent zookeeper test failures)
=======
>>>>>>> fae5c0e52f (GEOMESA-3258 Use zookeeper docker for offset manager test (#2971))
=======
=======
>>>>>>> 77f2650b49 (Try to fix intermittent zookeeper test failures)
>>>>>>> 6d1a5d55eb (Try to fix intermittent zookeeper test failures)
=======
>>>>>>> a6f7217266 (GEOMESA-3258 Use zookeeper docker for offset manager test (#2971))
      try {
        val triggers = new LinkedBlockingQueue[(Int, Int)]()
        manager.addOffsetListener("bar", new OffsetListener() {
          override def offsetChanged(partition: Int, offset: Long): Unit = triggers.add(partition, offset.toInt)
        })
<<<<<<< HEAD
<<<<<<< HEAD
<<<<<<< HEAD
<<<<<<< HEAD
<<<<<<< HEAD
<<<<<<< HEAD
=======
>>>>>>> 564f32a99e (GEOMESA-3258 Use zookeeper docker for offset manager test (#2971))
=======
>>>>>>> 6c49ac84e4 (Try to fix intermittent zookeeper test failures)
=======
>>>>>>> fae5c0e52f (GEOMESA-3258 Use zookeeper docker for offset manager test (#2971))
=======
>>>>>>> 6d1a5d55eb (Try to fix intermittent zookeeper test failures)
=======
=======
>>>>>>> 564f32a99e (GEOMESA-3258 Use zookeeper docker for offset manager test (#2971))
>>>>>>> a6f7217266 (GEOMESA-3258 Use zookeeper docker for offset manager test (#2971))
=======
      val triggers = scala.collection.mutable.Map(0 -> 0, 1 -> 0, 2 -> 0)
      manager.addOffsetListener("bar", new OffsetListener() {
        override def offsetChanged(partition: Int, offset: Long): Unit =
          triggers(partition) = offset.toInt
      })
>>>>>>> a03d53d147 (GEOMESA-3258 Use zookeeper docker for offset manager test (#2971))
<<<<<<< HEAD
<<<<<<< HEAD
<<<<<<< HEAD
<<<<<<< HEAD
<<<<<<< HEAD
=======
>>>>>>> a6f7217266 (GEOMESA-3258 Use zookeeper docker for offset manager test (#2971))
=======
>>>>>>> 77f2650b49 (Try to fix intermittent zookeeper test failures)
=======
>>>>>>> 564f32a99e (GEOMESA-3258 Use zookeeper docker for offset manager test (#2971))
<<<<<<< HEAD
=======
=======
>>>>>>> 77f2650b49 (Try to fix intermittent zookeeper test failures)
>>>>>>> 6c49ac84e4 (Try to fix intermittent zookeeper test failures)
=======
>>>>>>> fae5c0e52f (GEOMESA-3258 Use zookeeper docker for offset manager test (#2971))
=======
=======
>>>>>>> 77f2650b49 (Try to fix intermittent zookeeper test failures)
>>>>>>> 6d1a5d55eb (Try to fix intermittent zookeeper test failures)
=======
>>>>>>> a6f7217266 (GEOMESA-3258 Use zookeeper docker for offset manager test (#2971))

        manager.setOffset("bar", 0, 1)
        triggers.poll(4, TimeUnit.SECONDS) mustEqual 0 -> 1
        manager.setOffset("bar", 0, 2)
        triggers.poll(4, TimeUnit.SECONDS) mustEqual 0 -> 2
        manager.setOffset("bar", 2, 1)
        triggers.poll(4, TimeUnit.SECONDS) mustEqual 2 -> 1
      } finally {
        manager.close()
      }
    }
  }
}
