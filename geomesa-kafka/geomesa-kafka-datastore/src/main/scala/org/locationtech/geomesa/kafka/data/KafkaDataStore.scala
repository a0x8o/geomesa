/***********************************************************************
 * Copyright (c) 2013-2024 Commonwealth Computer Research, Inc.
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Apache License, Version 2.0
 * which accompanies this distribution and is available at
 * http://www.opensource.org/licenses/apache2.0.php.
 ***********************************************************************/

package org.locationtech.geomesa.kafka.data

import com.github.benmanes.caffeine.cache.{CacheLoader, Caffeine, Ticker}
import com.typesafe.scalalogging.LazyLogging
import org.apache.kafka.clients.admin.{AdminClient, AdminClientConfig, NewTopic}
import org.apache.kafka.clients.consumer.ConsumerConfig.GROUP_ID_CONFIG
import org.apache.kafka.clients.consumer.{Consumer, ConsumerRebalanceListener, KafkaConsumer}
import org.apache.kafka.clients.producer.ProducerConfig.{ACKS_CONFIG, PARTITIONER_CLASS_CONFIG}
import org.apache.kafka.clients.producer.{KafkaProducer, Producer}
import org.apache.kafka.common.TopicPartition
import org.apache.kafka.common.serialization.{ByteArrayDeserializer, ByteArraySerializer}
import org.geotools.api.data.{Query, SimpleFeatureStore, Transaction}
import org.geotools.api.feature.simple.SimpleFeatureType
import org.geotools.api.filter.Filter
import org.locationtech.geomesa.features.SerializationType.SerializationType
import org.locationtech.geomesa.filter.factory.FastFilterFactory
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
<<<<<<< HEAD
<<<<<<< HEAD
<<<<<<< HEAD
<<<<<<< HEAD
<<<<<<< HEAD
=======
>>>>>>> 770d928c15 (GEOMESA-3100 Kafka layer views (#2784))
=======
>>>>>>> 5dc1f86700 (GEOMESA-3100 Kafka layer views (#2784))
=======
>>>>>>> 808743e257 (GEOMESA-3100 Kafka layer views (#2784))
=======
>>>>>>> ad0d29873e (GEOMESA-3100 Kafka layer views (#2784))
=======
>>>>>>> 0a0bf0292e (GEOMESA-3100 Kafka layer views (#2784))
=======
>>>>>>> f43f8303d3 (GEOMESA-3100 Kafka layer views (#2784))
=======
>>>>>>> 6368ee48e8 (GEOMESA-3100 Kafka layer views (#2784))
=======
>>>>>>> 4516873dab (GEOMESA-3100 Kafka layer views (#2784))
=======
>>>>>>> 34472778d3 (Merge branch 'feature/postgis-fixes')
=======
>>>>>>> 8ec26b8c2a (GEOMESA-3100 Kafka layer views (#2784))
=======
>>>>>>> 4b0dd3e513 (GEOMESA-3100 Kafka layer views (#2784))
=======
>>>>>>> 6e453fd3d0 (GEOMESA-3100 Kafka layer views (#2784))
=======
>>>>>>> f187a4fcf9 (GEOMESA-3100 Kafka layer views (#2784))
=======
>>>>>>> d309fbbbbf (GEOMESA-3100 Kafka layer views (#2784))
=======
>>>>>>> d76a495d83 (GEOMESA-3100 Kafka layer views (#2784))
=======
>>>>>>> bbc8576d19 (GEOMESA-3100 Kafka layer views (#2784))
=======
>>>>>>> d3b123117a (GEOMESA-3100 Kafka layer views (#2784))
=======
>>>>>>> 885048dd7d (GEOMESA-3100 Kafka layer views (#2784))
=======
>>>>>>> 42e8565e9b (Merge branch 'feature/postgis-fixes')
=======
>>>>>>> f1532f2313 (GEOMESA-3254 Add Bloop build support)
=======
>>>>>>> 3010fc384e (GEOMESA-3100 Kafka layer views (#2784))
=======
>>>>>>> 1c99a27679 (GEOMESA-3100 Kafka layer views (#2784))
=======
>>>>>>> 92dc7a8411 (GEOMESA-3100 Kafka layer views (#2784))
=======
>>>>>>> 2766fc9b5b (GEOMESA-3100 Kafka layer views (#2784))
=======
>>>>>>> de8804123e (GEOMESA-3100 Kafka layer views (#2784))
=======
>>>>>>> 2f673a268a (GEOMESA-3100 Kafka layer views (#2784))
=======
>>>>>>> c44e474495 (GEOMESA-3100 Kafka layer views (#2784))
=======
>>>>>>> c2a94543ba (GEOMESA-3100 Kafka layer views (#2784))
=======
>>>>>>> 117b13aaaa (GEOMESA-3100 Kafka layer views (#2784))
=======
>>>>>>> 67de3c3202 (Merge branch 'feature/postgis-fixes')
=======
>>>>>>> cf457d8543 (GEOMESA-3100 Kafka layer views (#2784))
=======
>>>>>>> 0cd029fb3b (GEOMESA-3100 Kafka layer views (#2784))
=======
>>>>>>> c61bffed00 (GEOMESA-3100 Kafka layer views (#2784))
=======
>>>>>>> 12f226f36d (GEOMESA-3100 Kafka layer views (#2784))
=======
>>>>>>> 89f0c9f2c3 (GEOMESA-3100 Kafka layer views (#2784))
=======
>>>>>>> 222e44653b (GEOMESA-3100 Kafka layer views (#2784))
=======
>>>>>>> 4f4ecaeb43 (GEOMESA-3100 Kafka layer views (#2784))
=======
>>>>>>> b4cd5a7733 (GEOMESA-3100 Kafka layer views (#2784))
=======
>>>>>>> 750ebbabe7 (GEOMESA-3100 Kafka layer views (#2784))
=======
>>>>>>> 638b68d081 (Merge branch 'feature/postgis-fixes')
=======
>>>>>>> fc4546247e (GEOMESA-3100 Kafka layer views (#2784))
=======
>>>>>>> 65e544d20e (GEOMESA-3100 Kafka layer views (#2784))
=======
>>>>>>> c64e652363 (GEOMESA-3100 Kafka layer views (#2784))
=======
>>>>>>> 02eb81c815 (GEOMESA-3100 Kafka layer views (#2784))
=======
>>>>>>> 43ac4062d9 (GEOMESA-3100 Kafka layer views (#2784))
=======
>>>>>>> 30905e530b (GEOMESA-3100 Kafka layer views (#2784))
=======
>>>>>>> 121a1d3470 (GEOMESA-3100 Kafka layer views (#2784))
=======
>>>>>>> 297ca0be9c (GEOMESA-3100 Kafka layer views (#2784))
=======
>>>>>>> 39d28fffcb (GEOMESA-3100 Kafka layer views (#2784))
=======
>>>>>>> 71adb695c5 (Merge branch 'feature/postgis-fixes')
=======
>>>>>>> 5a4c24e020 (GEOMESA-3254 Add Bloop build support)
=======
>>>>>>> d4039e3d9a (GEOMESA-3100 Kafka layer views (#2784))
=======
>>>>>>> 0d5f6377de (GEOMESA-3100 Kafka layer views (#2784))
=======
>>>>>>> 41df6a2aa3 (GEOMESA-3100 Kafka layer views (#2784))
=======
>>>>>>> fb32a36e0e (GEOMESA-3100 Kafka layer views (#2784))
=======
>>>>>>> 340134cdda (GEOMESA-3100 Kafka layer views (#2784))
=======
>>>>>>> ea8384d9b7 (GEOMESA-3100 Kafka layer views (#2784))
=======
>>>>>>> fe3378ccaa (GEOMESA-3100 Kafka layer views (#2784))
=======
>>>>>>> 79f56900f0 (GEOMESA-3100 Kafka layer views (#2784))
=======
>>>>>>> 72ec0b2107 (GEOMESA-3100 Kafka layer views (#2784))
=======
>>>>>>> 30559ea5c9 (Merge branch 'feature/postgis-fixes')
=======
>>>>>>> ad362b1341 (GEOMESA-3100 Kafka layer views (#2784))
=======
<<<<<<< HEAD
=======
<<<<<<< HEAD
>>>>>>> 5ca0cd6de5 (GEOMESA-3100 Kafka layer views (#2784))
import org.locationtech.geomesa.index.FlushableFeatureWriter
=======
<<<<<<< HEAD
>>>>>>> af0a88eb17 (GEOMESA-3100 Kafka layer views (#2784))
=======
>>>>>>> af0a88eb1 (GEOMESA-3100 Kafka layer views (#2784))
<<<<<<< HEAD
>>>>>>> f7038468b7 (GEOMESA-3100 Kafka layer views (#2784))
=======
>>>>>>> locationtech-main
=======
<<<<<<< HEAD
<<<<<<< HEAD
=======
>>>>>>> 2f66072323 (GEOMESA-3100 Kafka layer views (#2784))
=======
=======
<<<<<<< HEAD
<<<<<<< HEAD
>>>>>>> 4231e686dd (GEOMESA-3100 Kafka layer views (#2784))
=======
>>>>>>> fa68dd43c6 (GEOMESA-3100 Kafka layer views (#2784))
=======
<<<<<<< HEAD
>>>>>>> 19aa61c0de (GEOMESA-3100 Kafka layer views (#2784))
=======
=======
>>>>>>> 4231e686dd (GEOMESA-3100 Kafka layer views (#2784))
=======
>>>>>>> d309fbbbbf (GEOMESA-3100 Kafka layer views (#2784))
=======
>>>>>>> de8804123e (GEOMESA-3100 Kafka layer views (#2784))
>>>>>>> d0dc799ff (GEOMESA-3100 Kafka layer views (#2784))
>>>>>>> ea3b40e187 (GEOMESA-3100 Kafka layer views (#2784))
=======
>>>>>>> 862857ce2e (GEOMESA-3100 Kafka layer views (#2784))
<<<<<<< HEAD
<<<<<<< HEAD
=======
>>>>>>> f187a4fcf9 (GEOMESA-3100 Kafka layer views (#2784))
=======
=======
>>>>>>> d0dc799ff (GEOMESA-3100 Kafka layer views (#2784))
>>>>>>> 28427dfd8f (GEOMESA-3100 Kafka layer views (#2784))
<<<<<<< HEAD
<<<<<<< HEAD
=======
=======
>>>>>>> a62b956fb6 (GEOMESA-3100 Kafka layer views (#2784))
=======
>>>>>>> 4adaa7f479 (GEOMESA-3100 Kafka layer views (#2784))
=======
>>>>>>> 6af71ff432 (GEOMESA-3100 Kafka layer views (#2784))
=======
>>>>>>> db8d998aa2 (Merge branch 'feature/postgis-fixes')
=======
>>>>>>> c57b5f538a (GEOMESA-3100 Kafka layer views (#2784))
=======
>>>>>>> 88ef67cdfe (GEOMESA-3100 Kafka layer views (#2784))
=======
>>>>>>> 89fb9950ef (GEOMESA-3100 Kafka layer views (#2784))
=======
<<<<<<< HEAD
<<<<<<< HEAD
>>>>>>> 1b25d7ddb4 (Merge branch 'feature/postgis-fixes')
=======
>>>>>>> 98e7bf59d2 (GEOMESA-3100 Kafka layer views (#2784))
=======
<<<<<<< HEAD
<<<<<<< HEAD
>>>>>>> e24613dc4a (GEOMESA-3100 Kafka layer views (#2784))
=======
>>>>>>> dae1cf3cef (GEOMESA-3100 Kafka layer views (#2784))
=======
<<<<<<< HEAD
<<<<<<< HEAD
>>>>>>> 50a71079c1 (GEOMESA-3100 Kafka layer views (#2784))
=======
=======
<<<<<<< HEAD
<<<<<<< HEAD
>>>>>>> 4c325746bd (GEOMESA-3100 Kafka layer views (#2784))
=======
>>>>>>> 3ebcdb99d9 (GEOMESA-3100 Kafka layer views (#2784))
=======
>>>>>>> fdf51402cf (GEOMESA-3100 Kafka layer views (#2784))
=======
<<<<<<< HEAD
<<<<<<< HEAD
>>>>>>> a377061090 (GEOMESA-3100 Kafka layer views (#2784))
=======
>>>>>>> e944f1c88b (Merge branch 'feature/postgis-fixes')
=======
<<<<<<< HEAD
<<<<<<< HEAD
>>>>>>> eddb4eaca1 (GEOMESA-3100 Kafka layer views (#2784))
=======
>>>>>>> be0c9d161a (GEOMESA-3100 Kafka layer views (#2784))
=======
<<<<<<< HEAD
<<<<<<< HEAD
>>>>>>> 7bdc1feea8 (GEOMESA-3100 Kafka layer views (#2784))
=======
>>>>>>> 9b15c8e14c (GEOMESA-3100 Kafka layer views (#2784))
=======
<<<<<<< HEAD
<<<<<<< HEAD
>>>>>>> 3977ecc140 (GEOMESA-3100 Kafka layer views (#2784))
=======
>>>>>>> 495a1efc9f (GEOMESA-3100 Kafka layer views (#2784))
=======
<<<<<<< HEAD
<<<<<<< HEAD
>>>>>>> 5d8c5baea0 (GEOMESA-3100 Kafka layer views (#2784))
=======
>>>>>>> 7628960f66 (GEOMESA-3100 Kafka layer views (#2784))
=======
<<<<<<< HEAD
<<<<<<< HEAD
>>>>>>> 416a95a4c0 (GEOMESA-3100 Kafka layer views (#2784))
=======
>>>>>>> 26e5afc4ea (Merge branch 'feature/postgis-fixes')
=======
<<<<<<< HEAD
<<<<<<< HEAD
>>>>>>> 63a045a753 (GEOMESA-3254 Add Bloop build support)
=======
>>>>>>> ccfb3bd95e (GEOMESA-3100 Kafka layer views (#2784))
=======
<<<<<<< HEAD
<<<<<<< HEAD
>>>>>>> b5abc19ca4 (GEOMESA-3100 Kafka layer views (#2784))
=======
>>>>>>> 2750a5beef (GEOMESA-3100 Kafka layer views (#2784))
=======
<<<<<<< HEAD
<<<<<<< HEAD
>>>>>>> cb4aa55ae3 (GEOMESA-3100 Kafka layer views (#2784))
=======
>>>>>>> 468da42855 (GEOMESA-3100 Kafka layer views (#2784))
=======
<<<<<<< HEAD
<<<<<<< HEAD
>>>>>>> 5dd3eb3a6d (GEOMESA-3100 Kafka layer views (#2784))
=======
>>>>>>> d530f7b24a (GEOMESA-3100 Kafka layer views (#2784))
=======
<<<<<<< HEAD
<<<<<<< HEAD
>>>>>>> 5e230912b1 (GEOMESA-3100 Kafka layer views (#2784))
=======
>>>>>>> f340d6feab (GEOMESA-3100 Kafka layer views (#2784))
=======
<<<<<<< HEAD
<<<<<<< HEAD
>>>>>>> c69897d7bd (Merge branch 'feature/postgis-fixes')
=======
=======
>>>>>>> 4c325746bd (GEOMESA-3100 Kafka layer views (#2784))
=======
<<<<<<< HEAD
>>>>>>> 222e44653b (GEOMESA-3100 Kafka layer views (#2784))
=======
>>>>>>> 3ebcdb99d9 (GEOMESA-3100 Kafka layer views (#2784))
=======
>>>>>>> 4f4ecaeb43 (GEOMESA-3100 Kafka layer views (#2784))
=======
>>>>>>> b4cd5a7733 (GEOMESA-3100 Kafka layer views (#2784))
=======
>>>>>>> a377061090 (GEOMESA-3100 Kafka layer views (#2784))
=======
>>>>>>> 750ebbabe7 (GEOMESA-3100 Kafka layer views (#2784))
=======
>>>>>>> 638b68d081 (Merge branch 'feature/postgis-fixes')
=======
>>>>>>> eddb4eaca1 (GEOMESA-3100 Kafka layer views (#2784))
=======
>>>>>>> fc4546247e (GEOMESA-3100 Kafka layer views (#2784))
=======
>>>>>>> 65e544d20e (GEOMESA-3100 Kafka layer views (#2784))
=======
>>>>>>> 7bdc1feea8 (GEOMESA-3100 Kafka layer views (#2784))
=======
>>>>>>> c64e652363 (GEOMESA-3100 Kafka layer views (#2784))
=======
>>>>>>> 02eb81c815 (GEOMESA-3100 Kafka layer views (#2784))
=======
>>>>>>> 3977ecc140 (GEOMESA-3100 Kafka layer views (#2784))
=======
>>>>>>> 43ac4062d9 (GEOMESA-3100 Kafka layer views (#2784))
=======
>>>>>>> 30905e530b (GEOMESA-3100 Kafka layer views (#2784))
=======
>>>>>>> 5d8c5baea0 (GEOMESA-3100 Kafka layer views (#2784))
=======
>>>>>>> 121a1d3470 (GEOMESA-3100 Kafka layer views (#2784))
=======
>>>>>>> 297ca0be9c (GEOMESA-3100 Kafka layer views (#2784))
=======
>>>>>>> 416a95a4c0 (GEOMESA-3100 Kafka layer views (#2784))
=======
>>>>>>> 39d28fffcb (GEOMESA-3100 Kafka layer views (#2784))
=======
>>>>>>> 71adb695c5 (Merge branch 'feature/postgis-fixes')
=======
>>>>>>> 63a045a753 (GEOMESA-3254 Add Bloop build support)
=======
>>>>>>> 5a4c24e020 (GEOMESA-3254 Add Bloop build support)
=======
>>>>>>> d4039e3d9a (GEOMESA-3100 Kafka layer views (#2784))
=======
>>>>>>> b5abc19ca4 (GEOMESA-3100 Kafka layer views (#2784))
=======
>>>>>>> 0d5f6377de (GEOMESA-3100 Kafka layer views (#2784))
=======
>>>>>>> 41df6a2aa3 (GEOMESA-3100 Kafka layer views (#2784))
=======
>>>>>>> cb4aa55ae3 (GEOMESA-3100 Kafka layer views (#2784))
=======
>>>>>>> fb32a36e0e (GEOMESA-3100 Kafka layer views (#2784))
=======
>>>>>>> 340134cdda (GEOMESA-3100 Kafka layer views (#2784))
=======
>>>>>>> 5dd3eb3a6d (GEOMESA-3100 Kafka layer views (#2784))
=======
>>>>>>> ea8384d9b7 (GEOMESA-3100 Kafka layer views (#2784))
=======
>>>>>>> fe3378ccaa (GEOMESA-3100 Kafka layer views (#2784))
=======
>>>>>>> 5e230912b1 (GEOMESA-3100 Kafka layer views (#2784))
=======
>>>>>>> 79f56900f0 (GEOMESA-3100 Kafka layer views (#2784))
=======
>>>>>>> 72ec0b2107 (GEOMESA-3100 Kafka layer views (#2784))
=======
>>>>>>> c69897d7bd (Merge branch 'feature/postgis-fixes')
=======
>>>>>>> 30559ea5c9 (Merge branch 'feature/postgis-fixes')
>>>>>>> 65a3a6e36 (GEOMESA-3100 Kafka layer views (#2784))
>>>>>>> 9e910620b3 (GEOMESA-3100 Kafka layer views (#2784))
=======
>>>>>>> 429ffc55e (GEOMESA-3100 Kafka layer views (#2784))
=======
<<<<<<< HEAD
<<<<<<< HEAD
>>>>>>> e7f3e6588 (GEOMESA-3100 Kafka layer views (#2784))
=======
>>>>>>> 6f6887eb8 (GEOMESA-3100 Kafka layer views (#2784))
=======
<<<<<<< HEAD
<<<<<<< HEAD
>>>>>>> 42549e8e3 (GEOMESA-3100 Kafka layer views (#2784))
=======
>>>>>>> e8cc4971c6 (Merge branch 'feature/postgis-fixes')
=======
<<<<<<< HEAD
<<<<<<< HEAD
>>>>>>> 8ed2c9f7e5 (GEOMESA-3100 Kafka layer views (#2784))
=======
>>>>>>> c1d0543aac (GEOMESA-3100 Kafka layer views (#2784))
=======
<<<<<<< HEAD
<<<<<<< HEAD
>>>>>>> 8b9e99d11a (GEOMESA-3100 Kafka layer views (#2784))
=======
>>>>>>> 614fcb6bc3 (GEOMESA-3100 Kafka layer views (#2784))
=======
<<<<<<< HEAD
<<<<<<< HEAD
=======
>>>>>>> 04f82bbc57 (GEOMESA-3100 Kafka layer views (#2784))
=======
>>>>>>> e0773a1bd7 (GEOMESA-3100 Kafka layer views (#2784))
=======
>>>>>>> ae5eea67f1 (GEOMESA-3100 Kafka layer views (#2784))
=======
>>>>>>> 23a7d9849f (GEOMESA-3100 Kafka layer views (#2784))
=======
>>>>>>> cb6bda89b6 (Merge branch 'feature/postgis-fixes')
=======
>>>>>>> 09d87762c5 (GEOMESA-3254 Add Bloop build support)
=======
>>>>>>> 6069aba6b4 (GEOMESA-3100 Kafka layer views (#2784))
=======
>>>>>>> 4480b2d1b9 (GEOMESA-3100 Kafka layer views (#2784))
=======
>>>>>>> 9e433ba57e (GEOMESA-3100 Kafka layer views (#2784))
=======
>>>>>>> 2df2640494 (GEOMESA-3100 Kafka layer views (#2784))
=======
>>>>>>> 23f312535d (GEOMESA-3100 Kafka layer views (#2784))
=======
>>>>>>> 826636f69d (GEOMESA-3100 Kafka layer views (#2784))
=======
>>>>>>> 1e11ed51a6 (GEOMESA-3100 Kafka layer views (#2784))
=======
>>>>>>> 976f319530 (GEOMESA-3100 Kafka layer views (#2784))
=======
>>>>>>> bc97b07a31 (GEOMESA-3100 Kafka layer views (#2784))
=======
>>>>>>> 699117eca9 (Merge branch 'feature/postgis-fixes')
=======
>>>>>>> 43ac4062d9 (GEOMESA-3100 Kafka layer views (#2784))
=======
>>>>>>> 04f82bbc57 (GEOMESA-3100 Kafka layer views (#2784))
=======
>>>>>>> e0773a1bd7 (GEOMESA-3100 Kafka layer views (#2784))
=======
>>>>>>> ae5eea67f1 (GEOMESA-3100 Kafka layer views (#2784))
=======
>>>>>>> 23a7d9849f (GEOMESA-3100 Kafka layer views (#2784))
=======
>>>>>>> cb6bda89b6 (Merge branch 'feature/postgis-fixes')
=======
>>>>>>> 09d87762c5 (GEOMESA-3254 Add Bloop build support)
=======
>>>>>>> 6069aba6b4 (GEOMESA-3100 Kafka layer views (#2784))
=======
>>>>>>> 4480b2d1b9 (GEOMESA-3100 Kafka layer views (#2784))
=======
>>>>>>> 9e433ba57e (GEOMESA-3100 Kafka layer views (#2784))
=======
>>>>>>> 2df2640494 (GEOMESA-3100 Kafka layer views (#2784))
=======
>>>>>>> 23f312535d (GEOMESA-3100 Kafka layer views (#2784))
=======
>>>>>>> 826636f69d (GEOMESA-3100 Kafka layer views (#2784))
=======
>>>>>>> 1e11ed51a6 (GEOMESA-3100 Kafka layer views (#2784))
=======
>>>>>>> 976f319530 (GEOMESA-3100 Kafka layer views (#2784))
=======
>>>>>>> bc97b07a31 (GEOMESA-3100 Kafka layer views (#2784))
=======
>>>>>>> 699117eca9 (Merge branch 'feature/postgis-fixes')
=======
>>>>>>> 4231e686d (GEOMESA-3100 Kafka layer views (#2784))
>>>>>>> 69e3273ac1 (GEOMESA-3100 Kafka layer views (#2784))
=======
<<<<<<< HEAD
<<<<<<< HEAD
>>>>>>> ac0357d36 (GEOMESA-3100 Kafka layer views (#2784))
=======
>>>>>>> a62b956fb (GEOMESA-3100 Kafka layer views (#2784))
=======
<<<<<<< HEAD
<<<<<<< HEAD
>>>>>>> 4adaa7f47 (GEOMESA-3100 Kafka layer views (#2784))
=======
>>>>>>> 6af71ff43 (GEOMESA-3100 Kafka layer views (#2784))
=======
<<<<<<< HEAD
<<<<<<< HEAD
>>>>>>> db8d998aa (Merge branch 'feature/postgis-fixes')
=======
>>>>>>> fa68dd43c (GEOMESA-3100 Kafka layer views (#2784))
=======
<<<<<<< HEAD
<<<<<<< HEAD
>>>>>>> 54ece16d1 (GEOMESA-3100 Kafka layer views (#2784))
=======
>>>>>>> c57b5f538 (GEOMESA-3100 Kafka layer views (#2784))
=======
<<<<<<< HEAD
<<<<<<< HEAD
>>>>>>> 88ef67cdf (GEOMESA-3100 Kafka layer views (#2784))
=======
>>>>>>> 89fb9950e (GEOMESA-3100 Kafka layer views (#2784))
=======
<<<<<<< HEAD
<<<<<<< HEAD
>>>>>>> 1b25d7ddb (Merge branch 'feature/postgis-fixes')
=======
>>>>>>> 9a5d6d2815 (GEOMESA-3100 Kafka layer views (#2784))
=======
>>>>>>> f4b2369e9a (GEOMESA-3100 Kafka layer views (#2784))
=======
>>>>>>> 305a9263eb (GEOMESA-3100 Kafka layer views (#2784))
=======
>>>>>>> da00c7bd68 (Merge branch 'feature/postgis-fixes')
=======
=======
>>>>>>> 117b13aaaa (GEOMESA-3100 Kafka layer views (#2784))
=======
>>>>>>> 1b25d7ddb4 (Merge branch 'feature/postgis-fixes')
=======
>>>>>>> 67de3c3202 (Merge branch 'feature/postgis-fixes')
=======
>>>>>>> cf457d8543 (GEOMESA-3100 Kafka layer views (#2784))
=======
>>>>>>> e24613dc4a (GEOMESA-3100 Kafka layer views (#2784))
=======
>>>>>>> 0cd029fb3b (GEOMESA-3100 Kafka layer views (#2784))
=======
>>>>>>> c61bffed00 (GEOMESA-3100 Kafka layer views (#2784))
=======
>>>>>>> 50a71079c1 (GEOMESA-3100 Kafka layer views (#2784))
=======
>>>>>>> 12f226f36d (GEOMESA-3100 Kafka layer views (#2784))
=======
>>>>>>> 65a3a6e36 (GEOMESA-3100 Kafka layer views (#2784))
>>>>>>> 9e910620b3 (GEOMESA-3100 Kafka layer views (#2784))
=======
>>>>>>> 89f0c9f2c3 (GEOMESA-3100 Kafka layer views (#2784))
=======
>>>>>>> 222e44653b (GEOMESA-3100 Kafka layer views (#2784))
=======
>>>>>>> e7f3e6588 (GEOMESA-3100 Kafka layer views (#2784))
=======
>>>>>>> 4f4ecaeb43 (GEOMESA-3100 Kafka layer views (#2784))
=======
>>>>>>> b4cd5a7733 (GEOMESA-3100 Kafka layer views (#2784))
=======
>>>>>>> 42549e8e3 (GEOMESA-3100 Kafka layer views (#2784))
=======
>>>>>>> 750ebbabe7 (GEOMESA-3100 Kafka layer views (#2784))
=======
>>>>>>> 638b68d081 (Merge branch 'feature/postgis-fixes')
=======
>>>>>>> 8ed2c9f7e5 (GEOMESA-3100 Kafka layer views (#2784))
=======
>>>>>>> fc4546247e (GEOMESA-3100 Kafka layer views (#2784))
=======
>>>>>>> 65e544d20e (GEOMESA-3100 Kafka layer views (#2784))
=======
>>>>>>> 8b9e99d11a (GEOMESA-3100 Kafka layer views (#2784))
=======
>>>>>>> c64e652363 (GEOMESA-3100 Kafka layer views (#2784))
=======
>>>>>>> 02eb81c815 (GEOMESA-3100 Kafka layer views (#2784))
=======
>>>>>>> 43ac4062d9 (GEOMESA-3100 Kafka layer views (#2784))
=======
>>>>>>> ac0357d36 (GEOMESA-3100 Kafka layer views (#2784))
=======
>>>>>>> 30905e530b (GEOMESA-3100 Kafka layer views (#2784))
=======
>>>>>>> 121a1d3470 (GEOMESA-3100 Kafka layer views (#2784))
=======
>>>>>>> 4adaa7f47 (GEOMESA-3100 Kafka layer views (#2784))
=======
>>>>>>> 297ca0be9c (GEOMESA-3100 Kafka layer views (#2784))
=======
>>>>>>> 39d28fffcb (GEOMESA-3100 Kafka layer views (#2784))
=======
>>>>>>> db8d998aa (Merge branch 'feature/postgis-fixes')
=======
>>>>>>> 71adb695c5 (Merge branch 'feature/postgis-fixes')
=======
>>>>>>> 340134cdda (GEOMESA-3100 Kafka layer views (#2784))
=======
>>>>>>> 54ece16d1 (GEOMESA-3100 Kafka layer views (#2784))
=======
>>>>>>> ea8384d9b7 (GEOMESA-3100 Kafka layer views (#2784))
=======
>>>>>>> fe3378ccaa (GEOMESA-3100 Kafka layer views (#2784))
=======
>>>>>>> 88ef67cdf (GEOMESA-3100 Kafka layer views (#2784))
=======
>>>>>>> 79f56900f0 (GEOMESA-3100 Kafka layer views (#2784))
=======
>>>>>>> 72ec0b2107 (GEOMESA-3100 Kafka layer views (#2784))
=======
>>>>>>> 1b25d7ddb (Merge branch 'feature/postgis-fixes')
=======
>>>>>>> 30559ea5c9 (Merge branch 'feature/postgis-fixes')
>>>>>>> d0dc799ff (GEOMESA-3100 Kafka layer views (#2784))
=======
>>>>>>> 936154130 (GEOMESA-3100 Kafka layer views (#2784))
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
>>>>>>> 222e44653b (GEOMESA-3100 Kafka layer views (#2784))
=======
>>>>>>> 4f4ecaeb43 (GEOMESA-3100 Kafka layer views (#2784))
=======
>>>>>>> 30905e530b (GEOMESA-3100 Kafka layer views (#2784))
=======
>>>>>>> 121a1d3470 (GEOMESA-3100 Kafka layer views (#2784))
=======
>>>>>>> ea8384d9b7 (GEOMESA-3100 Kafka layer views (#2784))
=======
>>>>>>> fe3378ccaa (GEOMESA-3100 Kafka layer views (#2784))
>>>>>>> ac0357d362 (GEOMESA-3100 Kafka layer views (#2784))
=======
=======
>>>>>>> 4c325746bd (GEOMESA-3100 Kafka layer views (#2784))
=======
<<<<<<< HEAD
<<<<<<< HEAD
>>>>>>> 3ebcdb99d9 (GEOMESA-3100 Kafka layer views (#2784))
=======
=======
<<<<<<< HEAD
<<<<<<< HEAD
>>>>>>> 5d8c5baea0 (GEOMESA-3100 Kafka layer views (#2784))
=======
>>>>>>> 5dd3eb3a6d (GEOMESA-3100 Kafka layer views (#2784))
=======
>>>>>>> d530f7b24a (GEOMESA-3100 Kafka layer views (#2784))
=======
<<<<<<< HEAD
=======
>>>>>>> 5d8c5baea0 (GEOMESA-3100 Kafka layer views (#2784))
=======
<<<<<<< HEAD
>>>>>>> 121a1d3470 (GEOMESA-3100 Kafka layer views (#2784))
=======
>>>>>>> 5dd3eb3a6d (GEOMESA-3100 Kafka layer views (#2784))
=======
>>>>>>> ea8384d9b7 (GEOMESA-3100 Kafka layer views (#2784))
=======
>>>>>>> fe3378ccaa (GEOMESA-3100 Kafka layer views (#2784))
>>>>>>> 04f82bbc57 (GEOMESA-3100 Kafka layer views (#2784))
>>>>>>> 495a1efc9f (GEOMESA-3100 Kafka layer views (#2784))
=======
>>>>>>> e0773a1bd7 (GEOMESA-3100 Kafka layer views (#2784))
=======
<<<<<<< HEAD
<<<<<<< HEAD
>>>>>>> 826636f69d (GEOMESA-3100 Kafka layer views (#2784))
=======
>>>>>>> 1e11ed51a6 (GEOMESA-3100 Kafka layer views (#2784))
=======
<<<<<<< HEAD
=======
>>>>>>> 222e44653b (GEOMESA-3100 Kafka layer views (#2784))
=======
>>>>>>> 3ebcdb99d9 (GEOMESA-3100 Kafka layer views (#2784))
=======
>>>>>>> 4f4ecaeb43 (GEOMESA-3100 Kafka layer views (#2784))
=======
>>>>>>> 04f82bbc57 (GEOMESA-3100 Kafka layer views (#2784))
>>>>>>> 495a1efc9f (GEOMESA-3100 Kafka layer views (#2784))
=======
>>>>>>> 30905e530b (GEOMESA-3100 Kafka layer views (#2784))
=======
>>>>>>> 121a1d3470 (GEOMESA-3100 Kafka layer views (#2784))
=======
>>>>>>> 826636f69d (GEOMESA-3100 Kafka layer views (#2784))
=======
>>>>>>> ea8384d9b7 (GEOMESA-3100 Kafka layer views (#2784))
=======
>>>>>>> fe3378ccaa (GEOMESA-3100 Kafka layer views (#2784))
>>>>>>> 2f6607232 (GEOMESA-3100 Kafka layer views (#2784))
<<<<<<< HEAD
<<<<<<< HEAD
<<<<<<< HEAD
>>>>>>> a62b956fb6 (GEOMESA-3100 Kafka layer views (#2784))
=======
=======
>>>>>>> 88ef67cdfe (GEOMESA-3100 Kafka layer views (#2784))
=======
>>>>>>> f4b2369e9a (GEOMESA-3100 Kafka layer views (#2784))
=======
=======
>>>>>>> d0dc799ff (GEOMESA-3100 Kafka layer views (#2784))
>>>>>>> ea3b40e18 (GEOMESA-3100 Kafka layer views (#2784))
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
>>>>>>> 0cd029fb3b (GEOMESA-3100 Kafka layer views (#2784))
=======
>>>>>>> b4cd5a7733 (GEOMESA-3100 Kafka layer views (#2784))
=======
>>>>>>> 65e544d20e (GEOMESA-3100 Kafka layer views (#2784))
=======
>>>>>>> 297ca0be9c (GEOMESA-3100 Kafka layer views (#2784))
=======
>>>>>>> 79f56900f0 (GEOMESA-3100 Kafka layer views (#2784))
>>>>>>> 4adaa7f479 (GEOMESA-3100 Kafka layer views (#2784))
=======
>>>>>>> c589b832a5 (GEOMESA-3100 Kafka layer views (#2784))
=======
=======
>>>>>>> d0dc799ff (GEOMESA-3100 Kafka layer views (#2784))
>>>>>>> ffbc2ce32a (GEOMESA-3100 Kafka layer views (#2784))
=======
=======
>>>>>>> d0dc799ff (GEOMESA-3100 Kafka layer views (#2784))
=======
>>>>>>> 936154130 (GEOMESA-3100 Kafka layer views (#2784))
>>>>>>> 54ece16d15 (GEOMESA-3100 Kafka layer views (#2784))
=======
=======
>>>>>>> 2f6607232 (GEOMESA-3100 Kafka layer views (#2784))
>>>>>>> c57b5f538a (GEOMESA-3100 Kafka layer views (#2784))
=======
>>>>>>> 88ef67cdfe (GEOMESA-3100 Kafka layer views (#2784))
=======
=======
<<<<<<< HEAD
<<<<<<< HEAD
>>>>>>> fdf51402cf (GEOMESA-3100 Kafka layer views (#2784))
=======
>>>>>>> be0c9d161a (GEOMESA-3100 Kafka layer views (#2784))
=======
<<<<<<< HEAD
<<<<<<< HEAD
>>>>>>> 7628960f66 (GEOMESA-3100 Kafka layer views (#2784))
=======
>>>>>>> 5e230912b1 (GEOMESA-3100 Kafka layer views (#2784))
=======
<<<<<<< HEAD
=======
>>>>>>> fdf51402cf (GEOMESA-3100 Kafka layer views (#2784))
=======
>>>>>>> b4cd5a7733 (GEOMESA-3100 Kafka layer views (#2784))
=======
>>>>>>> 65e544d20e (GEOMESA-3100 Kafka layer views (#2784))
=======
>>>>>>> 7628960f66 (GEOMESA-3100 Kafka layer views (#2784))
=======
>>>>>>> 297ca0be9c (GEOMESA-3100 Kafka layer views (#2784))
=======
>>>>>>> 79f56900f0 (GEOMESA-3100 Kafka layer views (#2784))
>>>>>>> 581f1dd15 (GEOMESA-3100 Kafka layer views (#2784))
<<<<<<< HEAD
>>>>>>> e24613dc4a (GEOMESA-3100 Kafka layer views (#2784))
=======
=======
>>>>>>> 1a5f68233 (GEOMESA-3100 Kafka layer views (#2784))
<<<<<<< HEAD
>>>>>>> dae1cf3cef (GEOMESA-3100 Kafka layer views (#2784))
=======
=======
=======
>>>>>>> d0dc799ff (GEOMESA-3100 Kafka layer views (#2784))
>>>>>>> 73767737b (GEOMESA-3100 Kafka layer views (#2784))
<<<<<<< HEAD
<<<<<<< HEAD
<<<<<<< HEAD
=======
>>>>>>> 222e44653b (GEOMESA-3100 Kafka layer views (#2784))
>>>>>>> 50a71079c1 (GEOMESA-3100 Kafka layer views (#2784))
=======
=======
>>>>>>> 429ffc55e (GEOMESA-3100 Kafka layer views (#2784))
<<<<<<< HEAD
<<<<<<< HEAD
<<<<<<< HEAD
=======
>>>>>>> 4f4ecaeb43 (GEOMESA-3100 Kafka layer views (#2784))
>>>>>>> 4c325746bd (GEOMESA-3100 Kafka layer views (#2784))
=======
=======
=======
>>>>>>> 2f6607232 (GEOMESA-3100 Kafka layer views (#2784))
>>>>>>> e7f3e6588 (GEOMESA-3100 Kafka layer views (#2784))
<<<<<<< HEAD
<<<<<<< HEAD
<<<<<<< HEAD
=======
>>>>>>> b4cd5a7733 (GEOMESA-3100 Kafka layer views (#2784))
>>>>>>> 3ebcdb99d9 (GEOMESA-3100 Kafka layer views (#2784))
=======
=======
>>>>>>> 6f6887eb8 (GEOMESA-3100 Kafka layer views (#2784))
<<<<<<< HEAD
<<<<<<< HEAD
<<<<<<< HEAD
=======
>>>>>>> 65e544d20e (GEOMESA-3100 Kafka layer views (#2784))
>>>>>>> fdf51402cf (GEOMESA-3100 Kafka layer views (#2784))
=======
=======
=======
<<<<<<< HEAD
<<<<<<< HEAD
>>>>>>> ae5eea67f1 (GEOMESA-3100 Kafka layer views (#2784))
=======
>>>>>>> 976f319530 (GEOMESA-3100 Kafka layer views (#2784))
=======
<<<<<<< HEAD
=======
>>>>>>> ae5eea67f1 (GEOMESA-3100 Kafka layer views (#2784))
=======
>>>>>>> 297ca0be9c (GEOMESA-3100 Kafka layer views (#2784))
=======
>>>>>>> 79f56900f0 (GEOMESA-3100 Kafka layer views (#2784))
>>>>>>> 9236b0208 (GEOMESA-3100 Kafka layer views (#2784))
<<<<<<< HEAD
>>>>>>> c1d0543aac (GEOMESA-3100 Kafka layer views (#2784))
<<<<<<< HEAD
>>>>>>> be0c9d161a (GEOMESA-3100 Kafka layer views (#2784))
=======
=======
=======
>>>>>>> 862857ce2 (GEOMESA-3100 Kafka layer views (#2784))
<<<<<<< HEAD
<<<<<<< HEAD
>>>>>>> 8b9e99d11a (GEOMESA-3100 Kafka layer views (#2784))
<<<<<<< HEAD
>>>>>>> 7bdc1feea8 (GEOMESA-3100 Kafka layer views (#2784))
=======
=======
=======
=======
>>>>>>> d0dc799ff (GEOMESA-3100 Kafka layer views (#2784))
>>>>>>> 28427dfd8 (GEOMESA-3100 Kafka layer views (#2784))
<<<<<<< HEAD
<<<<<<< HEAD
>>>>>>> 614fcb6bc3 (GEOMESA-3100 Kafka layer views (#2784))
<<<<<<< HEAD
>>>>>>> 9b15c8e14c (GEOMESA-3100 Kafka layer views (#2784))
=======
=======
=======
>>>>>>> ac0357d36 (GEOMESA-3100 Kafka layer views (#2784))
<<<<<<< HEAD
<<<<<<< HEAD
>>>>>>> 04f82bbc57 (GEOMESA-3100 Kafka layer views (#2784))
<<<<<<< HEAD
>>>>>>> 495a1efc9f (GEOMESA-3100 Kafka layer views (#2784))
=======
=======
=======
=======
>>>>>>> 2f6607232 (GEOMESA-3100 Kafka layer views (#2784))
>>>>>>> a62b956fb (GEOMESA-3100 Kafka layer views (#2784))
<<<<<<< HEAD
<<<<<<< HEAD
>>>>>>> e0773a1bd7 (GEOMESA-3100 Kafka layer views (#2784))
<<<<<<< HEAD
>>>>>>> 5d8c5baea0 (GEOMESA-3100 Kafka layer views (#2784))
=======
=======
=======
>>>>>>> 4adaa7f47 (GEOMESA-3100 Kafka layer views (#2784))
<<<<<<< HEAD
<<<<<<< HEAD
>>>>>>> ae5eea67f1 (GEOMESA-3100 Kafka layer views (#2784))
<<<<<<< HEAD
>>>>>>> 7628960f66 (GEOMESA-3100 Kafka layer views (#2784))
=======
=======
=======
>>>>>>> f6e840b5d (GEOMESA-3100 Kafka layer views (#2784))
<<<<<<< HEAD
<<<<<<< HEAD
>>>>>>> 4480b2d1b9 (GEOMESA-3100 Kafka layer views (#2784))
<<<<<<< HEAD
>>>>>>> b5abc19ca4 (GEOMESA-3100 Kafka layer views (#2784))
=======
=======
=======
>>>>>>> c589b832a (GEOMESA-3100 Kafka layer views (#2784))
<<<<<<< HEAD
<<<<<<< HEAD
>>>>>>> 9e433ba57e (GEOMESA-3100 Kafka layer views (#2784))
<<<<<<< HEAD
>>>>>>> 2750a5beef (GEOMESA-3100 Kafka layer views (#2784))
=======
=======
=======
=======
>>>>>>> d0dc799ff (GEOMESA-3100 Kafka layer views (#2784))
>>>>>>> ffbc2ce32 (GEOMESA-3100 Kafka layer views (#2784))
<<<<<<< HEAD
<<<<<<< HEAD
>>>>>>> 2df2640494 (GEOMESA-3100 Kafka layer views (#2784))
<<<<<<< HEAD
>>>>>>> cb4aa55ae3 (GEOMESA-3100 Kafka layer views (#2784))
=======
=======
=======
>>>>>>> 54ece16d1 (GEOMESA-3100 Kafka layer views (#2784))
<<<<<<< HEAD
<<<<<<< HEAD
>>>>>>> 826636f69d (GEOMESA-3100 Kafka layer views (#2784))
<<<<<<< HEAD
>>>>>>> 5dd3eb3a6d (GEOMESA-3100 Kafka layer views (#2784))
=======
=======
=======
=======
>>>>>>> 2f6607232 (GEOMESA-3100 Kafka layer views (#2784))
>>>>>>> c57b5f538 (GEOMESA-3100 Kafka layer views (#2784))
<<<<<<< HEAD
<<<<<<< HEAD
>>>>>>> 1e11ed51a6 (GEOMESA-3100 Kafka layer views (#2784))
<<<<<<< HEAD
>>>>>>> d530f7b24a (GEOMESA-3100 Kafka layer views (#2784))
=======
=======
=======
>>>>>>> 88ef67cdf (GEOMESA-3100 Kafka layer views (#2784))
>>>>>>> 976f319530 (GEOMESA-3100 Kafka layer views (#2784))
>>>>>>> 5e230912b1 (GEOMESA-3100 Kafka layer views (#2784))
=======
>>>>>>> 12fe94b860 (GEOMESA-3100 Kafka layer views (#2784))
=======
=======
>>>>>>> d0dc799ff (GEOMESA-3100 Kafka layer views (#2784))
>>>>>>> 0e42c51dc0 (GEOMESA-3100 Kafka layer views (#2784))
=======
=======
>>>>>>> d0dc799ff (GEOMESA-3100 Kafka layer views (#2784))
=======
>>>>>>> 936154130 (GEOMESA-3100 Kafka layer views (#2784))
>>>>>>> 626c8f9b93 (GEOMESA-3100 Kafka layer views (#2784))
=======
=======
>>>>>>> 2f6607232 (GEOMESA-3100 Kafka layer views (#2784))
>>>>>>> 9a5d6d2815 (GEOMESA-3100 Kafka layer views (#2784))
=======
>>>>>>> f4b2369e9a (GEOMESA-3100 Kafka layer views (#2784))
=======
>>>>>>> 770d928c15 (GEOMESA-3100 Kafka layer views (#2784))
=======
=======
>>>>>>> 2f66072323 (GEOMESA-3100 Kafka layer views (#2784))
>>>>>>> f43f8303d3 (GEOMESA-3100 Kafka layer views (#2784))
=======
>>>>>>> d0dc799ff (GEOMESA-3100 Kafka layer views (#2784))
>>>>>>> ea3b40e187 (GEOMESA-3100 Kafka layer views (#2784))
>>>>>>> 6368ee48e8 (GEOMESA-3100 Kafka layer views (#2784))
=======
>>>>>>> 6e453fd3d0 (GEOMESA-3100 Kafka layer views (#2784))
=======
>>>>>>> f187a4fcf9 (GEOMESA-3100 Kafka layer views (#2784))
=======
=======
=======
>>>>>>> a62b956fb6 (GEOMESA-3100 Kafka layer views (#2784))
=======
>>>>>>> 4adaa7f479 (GEOMESA-3100 Kafka layer views (#2784))
=======
>>>>>>> 6af71ff432 (GEOMESA-3100 Kafka layer views (#2784))
=======
>>>>>>> db8d998aa2 (Merge branch 'feature/postgis-fixes')
=======
>>>>>>> c57b5f538a (GEOMESA-3100 Kafka layer views (#2784))
=======
>>>>>>> 88ef67cdfe (GEOMESA-3100 Kafka layer views (#2784))
=======
>>>>>>> d0dc799ff (GEOMESA-3100 Kafka layer views (#2784))
=======
>>>>>>> 936154130 (GEOMESA-3100 Kafka layer views (#2784))
<<<<<<< HEAD
<<<<<<< HEAD
>>>>>>> ac0357d362 (GEOMESA-3100 Kafka layer views (#2784))
<<<<<<< HEAD
>>>>>>> d76a495d83 (GEOMESA-3100 Kafka layer views (#2784))
=======
=======
=======
>>>>>>> 2f6607232 (GEOMESA-3100 Kafka layer views (#2784))
<<<<<<< HEAD
<<<<<<< HEAD
>>>>>>> a62b956fb6 (GEOMESA-3100 Kafka layer views (#2784))
<<<<<<< HEAD
>>>>>>> bbc8576d19 (GEOMESA-3100 Kafka layer views (#2784))
=======
=======
=======
>>>>>>> 88ef67cdfe (GEOMESA-3100 Kafka layer views (#2784))
=======
=======
>>>>>>> d0dc799ff (GEOMESA-3100 Kafka layer views (#2784))
>>>>>>> ea3b40e18 (GEOMESA-3100 Kafka layer views (#2784))
<<<<<<< HEAD
>>>>>>> 4adaa7f479 (GEOMESA-3100 Kafka layer views (#2784))
<<<<<<< HEAD
>>>>>>> d3b123117a (GEOMESA-3100 Kafka layer views (#2784))
=======
=======
>>>>>>> c589b832a5 (GEOMESA-3100 Kafka layer views (#2784))
<<<<<<< HEAD
>>>>>>> 92dc7a8411 (GEOMESA-3100 Kafka layer views (#2784))
=======
=======
=======
>>>>>>> d0dc799ff (GEOMESA-3100 Kafka layer views (#2784))
>>>>>>> ffbc2ce32a (GEOMESA-3100 Kafka layer views (#2784))
<<<<<<< HEAD
>>>>>>> 2766fc9b5b (GEOMESA-3100 Kafka layer views (#2784))
=======
=======
=======
>>>>>>> d0dc799ff (GEOMESA-3100 Kafka layer views (#2784))
=======
>>>>>>> 936154130 (GEOMESA-3100 Kafka layer views (#2784))
>>>>>>> 54ece16d15 (GEOMESA-3100 Kafka layer views (#2784))
<<<<<<< HEAD
>>>>>>> 2f673a268a (GEOMESA-3100 Kafka layer views (#2784))
=======
=======
=======
>>>>>>> 2f6607232 (GEOMESA-3100 Kafka layer views (#2784))
>>>>>>> c57b5f538a (GEOMESA-3100 Kafka layer views (#2784))
<<<<<<< HEAD
>>>>>>> c44e474495 (GEOMESA-3100 Kafka layer views (#2784))
=======
=======
>>>>>>> 88ef67cdfe (GEOMESA-3100 Kafka layer views (#2784))
>>>>>>> c2a94543ba (GEOMESA-3100 Kafka layer views (#2784))
=======
>>>>>>> 581f1dd15 (GEOMESA-3100 Kafka layer views (#2784))
<<<<<<< HEAD
>>>>>>> e24613dc4a (GEOMESA-3100 Kafka layer views (#2784))
<<<<<<< HEAD
>>>>>>> 0cd029fb3b (GEOMESA-3100 Kafka layer views (#2784))
=======
=======
=======
>>>>>>> 1a5f68233 (GEOMESA-3100 Kafka layer views (#2784))
>>>>>>> dae1cf3cef (GEOMESA-3100 Kafka layer views (#2784))
>>>>>>> c61bffed00 (GEOMESA-3100 Kafka layer views (#2784))
=======
>>>>>>> 50a71079c1 (GEOMESA-3100 Kafka layer views (#2784))
>>>>>>> 12f226f36d (GEOMESA-3100 Kafka layer views (#2784))
=======
>>>>>>> 4c325746bd (GEOMESA-3100 Kafka layer views (#2784))
>>>>>>> 222e44653b (GEOMESA-3100 Kafka layer views (#2784))
=======
>>>>>>> 3ebcdb99d9 (GEOMESA-3100 Kafka layer views (#2784))
>>>>>>> 4f4ecaeb43 (GEOMESA-3100 Kafka layer views (#2784))
=======
>>>>>>> fdf51402cf (GEOMESA-3100 Kafka layer views (#2784))
>>>>>>> b4cd5a7733 (GEOMESA-3100 Kafka layer views (#2784))
=======
>>>>>>> 9236b0208 (GEOMESA-3100 Kafka layer views (#2784))
<<<<<<< HEAD
>>>>>>> c1d0543aac (GEOMESA-3100 Kafka layer views (#2784))
<<<<<<< HEAD
>>>>>>> be0c9d161a (GEOMESA-3100 Kafka layer views (#2784))
<<<<<<< HEAD
>>>>>>> 65e544d20e (GEOMESA-3100 Kafka layer views (#2784))
=======
=======
=======
=======
>>>>>>> 862857ce2 (GEOMESA-3100 Kafka layer views (#2784))
=======
>>>>>>> 02eb81c815 (GEOMESA-3100 Kafka layer views (#2784))
>>>>>>> 8b9e99d11a (GEOMESA-3100 Kafka layer views (#2784))
<<<<<<< HEAD
>>>>>>> 7bdc1feea8 (GEOMESA-3100 Kafka layer views (#2784))
<<<<<<< HEAD
>>>>>>> c64e652363 (GEOMESA-3100 Kafka layer views (#2784))
=======
=======
=======
=======
=======
>>>>>>> d0dc799ff (GEOMESA-3100 Kafka layer views (#2784))
>>>>>>> 28427dfd8 (GEOMESA-3100 Kafka layer views (#2784))
=======
>>>>>>> 30905e530b (GEOMESA-3100 Kafka layer views (#2784))
>>>>>>> 614fcb6bc3 (GEOMESA-3100 Kafka layer views (#2784))
<<<<<<< HEAD
>>>>>>> 9b15c8e14c (GEOMESA-3100 Kafka layer views (#2784))
<<<<<<< HEAD
>>>>>>> 02eb81c815 (GEOMESA-3100 Kafka layer views (#2784))
=======
=======
=======
=======
>>>>>>> ac0357d36 (GEOMESA-3100 Kafka layer views (#2784))
=======
>>>>>>> 121a1d3470 (GEOMESA-3100 Kafka layer views (#2784))
>>>>>>> 04f82bbc57 (GEOMESA-3100 Kafka layer views (#2784))
<<<<<<< HEAD
>>>>>>> 495a1efc9f (GEOMESA-3100 Kafka layer views (#2784))
<<<<<<< HEAD
>>>>>>> 30905e530b (GEOMESA-3100 Kafka layer views (#2784))
=======
=======
=======
=======
=======
>>>>>>> 2f6607232 (GEOMESA-3100 Kafka layer views (#2784))
>>>>>>> a62b956fb (GEOMESA-3100 Kafka layer views (#2784))
=======
>>>>>>> 297ca0be9c (GEOMESA-3100 Kafka layer views (#2784))
>>>>>>> e0773a1bd7 (GEOMESA-3100 Kafka layer views (#2784))
<<<<<<< HEAD
>>>>>>> 5d8c5baea0 (GEOMESA-3100 Kafka layer views (#2784))
<<<<<<< HEAD
>>>>>>> 121a1d3470 (GEOMESA-3100 Kafka layer views (#2784))
=======
=======
=======
=======
>>>>>>> 4adaa7f47 (GEOMESA-3100 Kafka layer views (#2784))
=======
>>>>>>> 0d5f6377de (GEOMESA-3100 Kafka layer views (#2784))
>>>>>>> ae5eea67f1 (GEOMESA-3100 Kafka layer views (#2784))
<<<<<<< HEAD
>>>>>>> 7628960f66 (GEOMESA-3100 Kafka layer views (#2784))
<<<<<<< HEAD
>>>>>>> 297ca0be9c (GEOMESA-3100 Kafka layer views (#2784))
=======
=======
=======
=======
>>>>>>> f6e840b5d (GEOMESA-3100 Kafka layer views (#2784))
=======
>>>>>>> 41df6a2aa3 (GEOMESA-3100 Kafka layer views (#2784))
>>>>>>> 4480b2d1b9 (GEOMESA-3100 Kafka layer views (#2784))
<<<<<<< HEAD
>>>>>>> b5abc19ca4 (GEOMESA-3100 Kafka layer views (#2784))
<<<<<<< HEAD
>>>>>>> 0d5f6377de (GEOMESA-3100 Kafka layer views (#2784))
=======
=======
=======
=======
>>>>>>> c589b832a (GEOMESA-3100 Kafka layer views (#2784))
=======
>>>>>>> fb32a36e0e (GEOMESA-3100 Kafka layer views (#2784))
>>>>>>> 9e433ba57e (GEOMESA-3100 Kafka layer views (#2784))
<<<<<<< HEAD
>>>>>>> 2750a5beef (GEOMESA-3100 Kafka layer views (#2784))
<<<<<<< HEAD
>>>>>>> 41df6a2aa3 (GEOMESA-3100 Kafka layer views (#2784))
=======
=======
=======
=======
=======
>>>>>>> d0dc799ff (GEOMESA-3100 Kafka layer views (#2784))
>>>>>>> ffbc2ce32 (GEOMESA-3100 Kafka layer views (#2784))
=======
>>>>>>> ea8384d9b7 (GEOMESA-3100 Kafka layer views (#2784))
>>>>>>> 2df2640494 (GEOMESA-3100 Kafka layer views (#2784))
<<<<<<< HEAD
>>>>>>> cb4aa55ae3 (GEOMESA-3100 Kafka layer views (#2784))
<<<<<<< HEAD
>>>>>>> fb32a36e0e (GEOMESA-3100 Kafka layer views (#2784))
=======
=======
=======
=======
>>>>>>> 54ece16d1 (GEOMESA-3100 Kafka layer views (#2784))
=======
>>>>>>> fe3378ccaa (GEOMESA-3100 Kafka layer views (#2784))
>>>>>>> 826636f69d (GEOMESA-3100 Kafka layer views (#2784))
<<<<<<< HEAD
>>>>>>> 5dd3eb3a6d (GEOMESA-3100 Kafka layer views (#2784))
<<<<<<< HEAD
>>>>>>> ea8384d9b7 (GEOMESA-3100 Kafka layer views (#2784))
=======
=======
=======
=======
=======
>>>>>>> 2f6607232 (GEOMESA-3100 Kafka layer views (#2784))
>>>>>>> c57b5f538 (GEOMESA-3100 Kafka layer views (#2784))
=======
>>>>>>> 79f56900f0 (GEOMESA-3100 Kafka layer views (#2784))
>>>>>>> 1e11ed51a6 (GEOMESA-3100 Kafka layer views (#2784))
<<<<<<< HEAD
>>>>>>> d530f7b24a (GEOMESA-3100 Kafka layer views (#2784))
<<<<<<< HEAD
>>>>>>> fe3378ccaa (GEOMESA-3100 Kafka layer views (#2784))
=======
=======
=======
=======
>>>>>>> 88ef67cdf (GEOMESA-3100 Kafka layer views (#2784))
>>>>>>> 976f319530 (GEOMESA-3100 Kafka layer views (#2784))
>>>>>>> 5e230912b1 (GEOMESA-3100 Kafka layer views (#2784))
>>>>>>> 79f56900f0 (GEOMESA-3100 Kafka layer views (#2784))
import org.locationtech.geomesa.index.FlushableFeatureWriter
=======
>>>>>>> af0a88eb1 (GEOMESA-3100 Kafka layer views (#2784))
>>>>>>> 58286bfd3 (GEOMESA-3100 Kafka layer views (#2784))
>>>>>>> 5ca0cd6de5 (GEOMESA-3100 Kafka layer views (#2784))
<<<<<<< HEAD
<<<<<<< HEAD
=======
>>>>>>> 5dc1f86700 (GEOMESA-3100 Kafka layer views (#2784))
=======
import org.locationtech.geomesa.index.FlushableFeatureWriter
=======
>>>>>>> af0a88eb1 (GEOMESA-3100 Kafka layer views (#2784))
<<<<<<< HEAD
<<<<<<< HEAD
=======
import org.locationtech.geomesa.index.FlushableFeatureWriter
=======
>>>>>>> af0a88eb1 (GEOMESA-3100 Kafka layer views (#2784))
>>>>>>> 9361541304 (GEOMESA-3100 Kafka layer views (#2784))
=======
import org.locationtech.geomesa.index.FlushableFeatureWriter
=======
>>>>>>> af0a88eb1 (GEOMESA-3100 Kafka layer views (#2784))
>>>>>>> 9236b02087 (GEOMESA-3100 Kafka layer views (#2784))
=======
import org.locationtech.geomesa.index.FlushableFeatureWriter
=======
>>>>>>> af0a88eb1 (GEOMESA-3100 Kafka layer views (#2784))
>>>>>>> f6e840b5dd (GEOMESA-3100 Kafka layer views (#2784))
=======
import org.locationtech.geomesa.index.FlushableFeatureWriter
=======
>>>>>>> af0a88eb1 (GEOMESA-3100 Kafka layer views (#2784))
>>>>>>> 64646d61ed (GEOMESA-3100 Kafka layer views (#2784))
=======
>>>>>>> 808743e257 (GEOMESA-3100 Kafka layer views (#2784))
=======
import org.locationtech.geomesa.index.FlushableFeatureWriter
=======
>>>>>>> af0a88eb1 (GEOMESA-3100 Kafka layer views (#2784))
>>>>>>> 9361541304 (GEOMESA-3100 Kafka layer views (#2784))
=======
import org.locationtech.geomesa.index.FlushableFeatureWriter
=======
>>>>>>> af0a88eb1 (GEOMESA-3100 Kafka layer views (#2784))
>>>>>>> 9236b02087 (GEOMESA-3100 Kafka layer views (#2784))
=======
import org.locationtech.geomesa.index.FlushableFeatureWriter
=======
>>>>>>> af0a88eb1 (GEOMESA-3100 Kafka layer views (#2784))
>>>>>>> f6e840b5dd (GEOMESA-3100 Kafka layer views (#2784))
=======
<<<<<<< HEAD
=======
<<<<<<< HEAD
import org.locationtech.geomesa.index.FlushableFeatureWriter
=======
>>>>>>> af0a88eb1 (GEOMESA-3100 Kafka layer views (#2784))
>>>>>>> locationtech-main
<<<<<<< HEAD
<<<<<<< HEAD
<<<<<<< HEAD
<<<<<<< HEAD
<<<<<<< HEAD
<<<<<<< HEAD
<<<<<<< HEAD
<<<<<<< HEAD
=======
>>>>>>> 0a0bf0292e (GEOMESA-3100 Kafka layer views (#2784))
=======
>>>>>>> 4b0dd3e513 (GEOMESA-3100 Kafka layer views (#2784))
=======
>>>>>>> 1c99a27679 (GEOMESA-3100 Kafka layer views (#2784))
>>>>>>> d0dc799ff1 (GEOMESA-3100 Kafka layer views (#2784))
=======
>>>>>>> 9361541304 (GEOMESA-3100 Kafka layer views (#2784))
=======
<<<<<<< HEAD
<<<<<<< HEAD
>>>>>>> 9236b02087 (GEOMESA-3100 Kafka layer views (#2784))
=======
>>>>>>> f6e840b5dd (GEOMESA-3100 Kafka layer views (#2784))
=======
<<<<<<< HEAD
>>>>>>> 64646d61ed (GEOMESA-3100 Kafka layer views (#2784))
=======
=======
>>>>>>> d0dc799ff1 (GEOMESA-3100 Kafka layer views (#2784))
=======
>>>>>>> 808743e257 (GEOMESA-3100 Kafka layer views (#2784))
=======
>>>>>>> 9236b02087 (GEOMESA-3100 Kafka layer views (#2784))
=======
>>>>>>> 4b0dd3e513 (GEOMESA-3100 Kafka layer views (#2784))
=======
>>>>>>> 1c99a27679 (GEOMESA-3100 Kafka layer views (#2784))
import org.locationtech.geomesa.index.FlushableFeatureWriter
=======
>>>>>>> af0a88eb1 (GEOMESA-3100 Kafka layer views (#2784))
<<<<<<< HEAD
<<<<<<< HEAD
<<<<<<< HEAD
<<<<<<< HEAD
<<<<<<< HEAD
<<<<<<< HEAD
<<<<<<< HEAD
<<<<<<< HEAD
=======
>>>>>>> 808743e257 (GEOMESA-3100 Kafka layer views (#2784))
=======
>>>>>>> 4b0dd3e513 (GEOMESA-3100 Kafka layer views (#2784))
=======
>>>>>>> 1c99a27679 (GEOMESA-3100 Kafka layer views (#2784))
>>>>>>> bddfdbea54 (GEOMESA-3100 Kafka layer views (#2784))
=======
>>>>>>> 58286bfd3 (GEOMESA-3100 Kafka layer views (#2784))
>>>>>>> 5ca0cd6de (GEOMESA-3100 Kafka layer views (#2784))
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
<<<<<<< HEAD
=======
>>>>>>> f43f8303d3 (GEOMESA-3100 Kafka layer views (#2784))
=======
>>>>>>> 6368ee48e8 (GEOMESA-3100 Kafka layer views (#2784))
=======
>>>>>>> 6e453fd3d0 (GEOMESA-3100 Kafka layer views (#2784))
=======
>>>>>>> f187a4fcf9 (GEOMESA-3100 Kafka layer views (#2784))
=======
>>>>>>> d76a495d83 (GEOMESA-3100 Kafka layer views (#2784))
=======
>>>>>>> bbc8576d19 (GEOMESA-3100 Kafka layer views (#2784))
=======
>>>>>>> d3b123117a (GEOMESA-3100 Kafka layer views (#2784))
=======
>>>>>>> 92dc7a8411 (GEOMESA-3100 Kafka layer views (#2784))
=======
>>>>>>> 2766fc9b5b (GEOMESA-3100 Kafka layer views (#2784))
=======
>>>>>>> 2f673a268a (GEOMESA-3100 Kafka layer views (#2784))
=======
>>>>>>> c44e474495 (GEOMESA-3100 Kafka layer views (#2784))
=======
>>>>>>> c2a94543ba (GEOMESA-3100 Kafka layer views (#2784))
=======
>>>>>>> 0cd029fb3b (GEOMESA-3100 Kafka layer views (#2784))
=======
>>>>>>> c61bffed00 (GEOMESA-3100 Kafka layer views (#2784))
=======
>>>>>>> 12f226f36d (GEOMESA-3100 Kafka layer views (#2784))
=======
>>>>>>> 222e44653b (GEOMESA-3100 Kafka layer views (#2784))
=======
>>>>>>> 4f4ecaeb43 (GEOMESA-3100 Kafka layer views (#2784))
=======
>>>>>>> b4cd5a7733 (GEOMESA-3100 Kafka layer views (#2784))
=======
>>>>>>> 65e544d20e (GEOMESA-3100 Kafka layer views (#2784))
=======
>>>>>>> c64e652363 (GEOMESA-3100 Kafka layer views (#2784))
=======
>>>>>>> 02eb81c815 (GEOMESA-3100 Kafka layer views (#2784))
=======
>>>>>>> 30905e530b (GEOMESA-3100 Kafka layer views (#2784))
=======
>>>>>>> 121a1d3470 (GEOMESA-3100 Kafka layer views (#2784))
=======
>>>>>>> 297ca0be9c (GEOMESA-3100 Kafka layer views (#2784))
=======
>>>>>>> 0d5f6377de (GEOMESA-3100 Kafka layer views (#2784))
=======
>>>>>>> 41df6a2aa3 (GEOMESA-3100 Kafka layer views (#2784))
=======
>>>>>>> fb32a36e0e (GEOMESA-3100 Kafka layer views (#2784))
=======
>>>>>>> ea8384d9b7 (GEOMESA-3100 Kafka layer views (#2784))
=======
>>>>>>> fe3378ccaa (GEOMESA-3100 Kafka layer views (#2784))
=======
>>>>>>> 79f56900f0 (GEOMESA-3100 Kafka layer views (#2784))
>>>>>>> d0dc799ff1 (GEOMESA-3100 Kafka layer views (#2784))
=======
>>>>>>> 2f66072323 (GEOMESA-3100 Kafka layer views (#2784))
=======
<<<<<<< HEAD
<<<<<<< HEAD
>>>>>>> ea3b40e187 (GEOMESA-3100 Kafka layer views (#2784))
=======
>>>>>>> 862857ce2e (GEOMESA-3100 Kafka layer views (#2784))
=======
<<<<<<< HEAD
<<<<<<< HEAD
>>>>>>> 28427dfd8f (GEOMESA-3100 Kafka layer views (#2784))
=======
>>>>>>> ac0357d362 (GEOMESA-3100 Kafka layer views (#2784))
=======
<<<<<<< HEAD
<<<<<<< HEAD
=======
>>>>>>> 4adaa7f479 (GEOMESA-3100 Kafka layer views (#2784))
=======
>>>>>>> 88ef67cdfe (GEOMESA-3100 Kafka layer views (#2784))
=======
>>>>>>> e24613dc4a (GEOMESA-3100 Kafka layer views (#2784))
=======
>>>>>>> dae1cf3cef (GEOMESA-3100 Kafka layer views (#2784))
=======
>>>>>>> 50a71079c1 (GEOMESA-3100 Kafka layer views (#2784))
=======
>>>>>>> 4c325746bd (GEOMESA-3100 Kafka layer views (#2784))
=======
>>>>>>> 3ebcdb99d9 (GEOMESA-3100 Kafka layer views (#2784))
=======
=======
>>>>>>> be0c9d161a (GEOMESA-3100 Kafka layer views (#2784))
=======
>>>>>>> 7bdc1feea8 (GEOMESA-3100 Kafka layer views (#2784))
=======
>>>>>>> 9b15c8e14c (GEOMESA-3100 Kafka layer views (#2784))
=======
>>>>>>> 495a1efc9f (GEOMESA-3100 Kafka layer views (#2784))
=======
>>>>>>> 5d8c5baea0 (GEOMESA-3100 Kafka layer views (#2784))
=======
>>>>>>> 7628960f66 (GEOMESA-3100 Kafka layer views (#2784))
=======
>>>>>>> b5abc19ca4 (GEOMESA-3100 Kafka layer views (#2784))
=======
>>>>>>> 2750a5beef (GEOMESA-3100 Kafka layer views (#2784))
=======
>>>>>>> cb4aa55ae3 (GEOMESA-3100 Kafka layer views (#2784))
=======
>>>>>>> 5dd3eb3a6d (GEOMESA-3100 Kafka layer views (#2784))
=======
>>>>>>> d530f7b24a (GEOMESA-3100 Kafka layer views (#2784))
=======
>>>>>>> 5e230912b1 (GEOMESA-3100 Kafka layer views (#2784))
=======
>>>>>>> 6f6887eb8 (GEOMESA-3100 Kafka layer views (#2784))
>>>>>>> fdf51402cf (GEOMESA-3100 Kafka layer views (#2784))
=======
>>>>>>> c1d0543aac (GEOMESA-3100 Kafka layer views (#2784))
=======
>>>>>>> 8b9e99d11a (GEOMESA-3100 Kafka layer views (#2784))
=======
>>>>>>> 614fcb6bc3 (GEOMESA-3100 Kafka layer views (#2784))
=======
>>>>>>> 04f82bbc57 (GEOMESA-3100 Kafka layer views (#2784))
=======
>>>>>>> e0773a1bd7 (GEOMESA-3100 Kafka layer views (#2784))
=======
=======
>>>>>>> 4480b2d1b9 (GEOMESA-3100 Kafka layer views (#2784))
=======
>>>>>>> 9e433ba57e (GEOMESA-3100 Kafka layer views (#2784))
=======
=======
=======
=======
>>>>>>> 976f319530 (GEOMESA-3100 Kafka layer views (#2784))
=======
=======
>>>>>>> f4b2369e9a (GEOMESA-3100 Kafka layer views (#2784))
=======
>>>>>>> 2f6607232 (GEOMESA-3100 Kafka layer views (#2784))
>>>>>>> c57b5f538 (GEOMESA-3100 Kafka layer views (#2784))
>>>>>>> 1e11ed51a6 (GEOMESA-3100 Kafka layer views (#2784))
=======
>>>>>>> 54ece16d1 (GEOMESA-3100 Kafka layer views (#2784))
>>>>>>> 826636f69d (GEOMESA-3100 Kafka layer views (#2784))
=======
>>>>>>> ffbc2ce32 (GEOMESA-3100 Kafka layer views (#2784))
>>>>>>> 2df2640494 (GEOMESA-3100 Kafka layer views (#2784))
=======
>>>>>>> 4adaa7f47 (GEOMESA-3100 Kafka layer views (#2784))
>>>>>>> ae5eea67f1 (GEOMESA-3100 Kafka layer views (#2784))
=======
>>>>>>> 88ef67cdf (GEOMESA-3100 Kafka layer views (#2784))
=======
>>>>>>> bbc8576d19 (GEOMESA-3100 Kafka layer views (#2784))
=======
>>>>>>> 4adaa7f479 (GEOMESA-3100 Kafka layer views (#2784))
=======
>>>>>>> 88ef67cdfe (GEOMESA-3100 Kafka layer views (#2784))
=======
>>>>>>> e24613dc4a (GEOMESA-3100 Kafka layer views (#2784))
=======
>>>>>>> dae1cf3cef (GEOMESA-3100 Kafka layer views (#2784))
=======
>>>>>>> 50a71079c1 (GEOMESA-3100 Kafka layer views (#2784))
=======
>>>>>>> 4c325746bd (GEOMESA-3100 Kafka layer views (#2784))
=======
>>>>>>> 3ebcdb99d9 (GEOMESA-3100 Kafka layer views (#2784))
=======
=======
>>>>>>> be0c9d161a (GEOMESA-3100 Kafka layer views (#2784))
=======
>>>>>>> 7bdc1feea8 (GEOMESA-3100 Kafka layer views (#2784))
=======
>>>>>>> 9b15c8e14c (GEOMESA-3100 Kafka layer views (#2784))
=======
>>>>>>> 495a1efc9f (GEOMESA-3100 Kafka layer views (#2784))
=======
>>>>>>> 5d8c5baea0 (GEOMESA-3100 Kafka layer views (#2784))
=======
>>>>>>> 7628960f66 (GEOMESA-3100 Kafka layer views (#2784))
=======
>>>>>>> b5abc19ca4 (GEOMESA-3100 Kafka layer views (#2784))
=======
>>>>>>> 2750a5beef (GEOMESA-3100 Kafka layer views (#2784))
=======
>>>>>>> cb4aa55ae3 (GEOMESA-3100 Kafka layer views (#2784))
=======
>>>>>>> 5dd3eb3a6d (GEOMESA-3100 Kafka layer views (#2784))
=======
>>>>>>> d530f7b24a (GEOMESA-3100 Kafka layer views (#2784))
=======
>>>>>>> 5e230912b1 (GEOMESA-3100 Kafka layer views (#2784))
=======
>>>>>>> 6f6887eb8 (GEOMESA-3100 Kafka layer views (#2784))
>>>>>>> fdf51402cf (GEOMESA-3100 Kafka layer views (#2784))
=======
>>>>>>> c1d0543aac (GEOMESA-3100 Kafka layer views (#2784))
=======
>>>>>>> 8b9e99d11a (GEOMESA-3100 Kafka layer views (#2784))
=======
>>>>>>> 614fcb6bc3 (GEOMESA-3100 Kafka layer views (#2784))
=======
>>>>>>> 04f82bbc57 (GEOMESA-3100 Kafka layer views (#2784))
=======
>>>>>>> e0773a1bd7 (GEOMESA-3100 Kafka layer views (#2784))
=======
=======
>>>>>>> 4480b2d1b9 (GEOMESA-3100 Kafka layer views (#2784))
=======
>>>>>>> 9e433ba57e (GEOMESA-3100 Kafka layer views (#2784))
=======
=======
=======
=======
>>>>>>> 976f319530 (GEOMESA-3100 Kafka layer views (#2784))
=======
=======
>>>>>>> 2f6607232 (GEOMESA-3100 Kafka layer views (#2784))
>>>>>>> c57b5f538 (GEOMESA-3100 Kafka layer views (#2784))
>>>>>>> 1e11ed51a6 (GEOMESA-3100 Kafka layer views (#2784))
=======
>>>>>>> 54ece16d1 (GEOMESA-3100 Kafka layer views (#2784))
>>>>>>> 826636f69d (GEOMESA-3100 Kafka layer views (#2784))
=======
>>>>>>> ffbc2ce32 (GEOMESA-3100 Kafka layer views (#2784))
>>>>>>> 2df2640494 (GEOMESA-3100 Kafka layer views (#2784))
=======
>>>>>>> 4adaa7f47 (GEOMESA-3100 Kafka layer views (#2784))
>>>>>>> ae5eea67f1 (GEOMESA-3100 Kafka layer views (#2784))
=======
>>>>>>> 88ef67cdf (GEOMESA-3100 Kafka layer views (#2784))
=======
>>>>>>> 2f6607232 (GEOMESA-3100 Kafka layer views (#2784))
>>>>>>> a62b956fb6 (GEOMESA-3100 Kafka layer views (#2784))
=======
<<<<<<< HEAD
<<<<<<< HEAD
>>>>>>> ea3b40e18 (GEOMESA-3100 Kafka layer views (#2784))
=======
>>>>>>> c589b832a5 (GEOMESA-3100 Kafka layer views (#2784))
=======
<<<<<<< HEAD
<<<<<<< HEAD
>>>>>>> ffbc2ce32a (GEOMESA-3100 Kafka layer views (#2784))
=======
>>>>>>> 54ece16d15 (GEOMESA-3100 Kafka layer views (#2784))
=======
<<<<<<< HEAD
<<<<<<< HEAD
=======
>>>>>>> c44e474495 (GEOMESA-3100 Kafka layer views (#2784))
=======
>>>>>>> 2f6607232 (GEOMESA-3100 Kafka layer views (#2784))
>>>>>>> c57b5f538a (GEOMESA-3100 Kafka layer views (#2784))
=======
<<<<<<< HEAD
<<<<<<< HEAD
>>>>>>> ea3b40e18 (GEOMESA-3100 Kafka layer views (#2784))
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
=======
>>>>>>> b4cd5a7733 (GEOMESA-3100 Kafka layer views (#2784))
=======
>>>>>>> c64e652363 (GEOMESA-3100 Kafka layer views (#2784))
=======
>>>>>>> 297ca0be9c (GEOMESA-3100 Kafka layer views (#2784))
=======
>>>>>>> 79f56900f0 (GEOMESA-3100 Kafka layer views (#2784))
>>>>>>> 1a5f68233 (GEOMESA-3100 Kafka layer views (#2784))
=======
>>>>>>> 73767737b (GEOMESA-3100 Kafka layer views (#2784))
=======
>>>>>>> 429ffc55e (GEOMESA-3100 Kafka layer views (#2784))
=======
<<<<<<< HEAD
<<<<<<< HEAD
=======
>>>>>>> 4f4ecaeb43 (GEOMESA-3100 Kafka layer views (#2784))
=======
>>>>>>> 2f6607232 (GEOMESA-3100 Kafka layer views (#2784))
>>>>>>> e7f3e6588 (GEOMESA-3100 Kafka layer views (#2784))
=======
<<<<<<< HEAD
<<<<<<< HEAD
=======
>>>>>>> 6f6887eb8 (GEOMESA-3100 Kafka layer views (#2784))
=======
<<<<<<< HEAD
<<<<<<< HEAD
=======
>>>>>>> ae5eea67f1 (GEOMESA-3100 Kafka layer views (#2784))
=======
>>>>>>> 976f319530 (GEOMESA-3100 Kafka layer views (#2784))
<<<<<<< HEAD
=======
=======
>>>>>>> ae5eea67f1 (GEOMESA-3100 Kafka layer views (#2784))
>>>>>>> 297ca0be9c (GEOMESA-3100 Kafka layer views (#2784))
=======
>>>>>>> 79f56900f0 (GEOMESA-3100 Kafka layer views (#2784))
>>>>>>> 862857ce2 (GEOMESA-3100 Kafka layer views (#2784))
=======
<<<<<<< HEAD
>>>>>>> 8b9e99d11a (GEOMESA-3100 Kafka layer views (#2784))
=======
>>>>>>> 28427dfd8 (GEOMESA-3100 Kafka layer views (#2784))
=======
<<<<<<< HEAD
>>>>>>> 614fcb6bc3 (GEOMESA-3100 Kafka layer views (#2784))
=======
>>>>>>> ac0357d36 (GEOMESA-3100 Kafka layer views (#2784))
=======
<<<<<<< HEAD
<<<<<<< HEAD
<<<<<<< HEAD
=======
>>>>>>> 121a1d3470 (GEOMESA-3100 Kafka layer views (#2784))
>>>>>>> 04f82bbc57 (GEOMESA-3100 Kafka layer views (#2784))
=======
=======
>>>>>>> 2f6607232 (GEOMESA-3100 Kafka layer views (#2784))
>>>>>>> a62b956fb (GEOMESA-3100 Kafka layer views (#2784))
=======
<<<<<<< HEAD
<<<<<<< HEAD
<<<<<<< HEAD
=======
>>>>>>> 297ca0be9c (GEOMESA-3100 Kafka layer views (#2784))
>>>>>>> e0773a1bd7 (GEOMESA-3100 Kafka layer views (#2784))
=======
=======
>>>>>>> 4adaa7f47 (GEOMESA-3100 Kafka layer views (#2784))
<<<<<<< HEAD
<<<<<<< HEAD
<<<<<<< HEAD
=======
>>>>>>> 41df6a2aa3 (GEOMESA-3100 Kafka layer views (#2784))
>>>>>>> ae5eea67f1 (GEOMESA-3100 Kafka layer views (#2784))
=======
=======
=======
>>>>>>> c589b832a (GEOMESA-3100 Kafka layer views (#2784))
<<<<<<< HEAD
<<<<<<< HEAD
<<<<<<< HEAD
=======
>>>>>>> 79f56900f0 (GEOMESA-3100 Kafka layer views (#2784))
>>>>>>> 9e433ba57e (GEOMESA-3100 Kafka layer views (#2784))
=======
=======
>>>>>>> 88ef67cdf (GEOMESA-3100 Kafka layer views (#2784))
>>>>>>> 976f319530 (GEOMESA-3100 Kafka layer views (#2784))
<<<<<<< HEAD
=======
>>>>>>> f43f8303d3 (GEOMESA-3100 Kafka layer views (#2784))
=======
>>>>>>> ea3b40e187 (GEOMESA-3100 Kafka layer views (#2784))
=======
>>>>>>> 6368ee48e8 (GEOMESA-3100 Kafka layer views (#2784))
=======
>>>>>>> 6e453fd3d0 (GEOMESA-3100 Kafka layer views (#2784))
=======
>>>>>>> 28427dfd8f (GEOMESA-3100 Kafka layer views (#2784))
=======
>>>>>>> f187a4fcf9 (GEOMESA-3100 Kafka layer views (#2784))
=======
>>>>>>> d76a495d83 (GEOMESA-3100 Kafka layer views (#2784))
=======
>>>>>>> bbc8576d19 (GEOMESA-3100 Kafka layer views (#2784))
=======
>>>>>>> ea3b40e18 (GEOMESA-3100 Kafka layer views (#2784))
=======
>>>>>>> d3b123117a (GEOMESA-3100 Kafka layer views (#2784))
=======
>>>>>>> 92dc7a8411 (GEOMESA-3100 Kafka layer views (#2784))
=======
>>>>>>> ffbc2ce32a (GEOMESA-3100 Kafka layer views (#2784))
=======
>>>>>>> 2766fc9b5b (GEOMESA-3100 Kafka layer views (#2784))
=======
>>>>>>> 2f673a268a (GEOMESA-3100 Kafka layer views (#2784))
=======
>>>>>>> c44e474495 (GEOMESA-3100 Kafka layer views (#2784))
=======
>>>>>>> ea3b40e18 (GEOMESA-3100 Kafka layer views (#2784))
=======
>>>>>>> c2a94543ba (GEOMESA-3100 Kafka layer views (#2784))
=======
>>>>>>> 1a5f68233 (GEOMESA-3100 Kafka layer views (#2784))
=======
<<<<<<< HEAD
>>>>>>> c61bffed00 (GEOMESA-3100 Kafka layer views (#2784))
=======
>>>>>>> 73767737b (GEOMESA-3100 Kafka layer views (#2784))
=======
>>>>>>> 12f226f36d (GEOMESA-3100 Kafka layer views (#2784))
=======
>>>>>>> 222e44653b (GEOMESA-3100 Kafka layer views (#2784))
=======
>>>>>>> 4f4ecaeb43 (GEOMESA-3100 Kafka layer views (#2784))
=======
=======
>>>>>>> 6f6887eb8 (GEOMESA-3100 Kafka layer views (#2784))
>>>>>>> b4cd5a7733 (GEOMESA-3100 Kafka layer views (#2784))
=======
>>>>>>> 862857ce2 (GEOMESA-3100 Kafka layer views (#2784))
=======
<<<<<<< HEAD
>>>>>>> 8b9e99d11a (GEOMESA-3100 Kafka layer views (#2784))
<<<<<<< HEAD
>>>>>>> c64e652363 (GEOMESA-3100 Kafka layer views (#2784))
=======
=======
>>>>>>> 28427dfd8 (GEOMESA-3100 Kafka layer views (#2784))
=======
>>>>>>> 614fcb6bc3 (GEOMESA-3100 Kafka layer views (#2784))
>>>>>>> 02eb81c815 (GEOMESA-3100 Kafka layer views (#2784))
=======
>>>>>>> 04f82bbc57 (GEOMESA-3100 Kafka layer views (#2784))
>>>>>>> 30905e530b (GEOMESA-3100 Kafka layer views (#2784))
=======
>>>>>>> e0773a1bd7 (GEOMESA-3100 Kafka layer views (#2784))
>>>>>>> 121a1d3470 (GEOMESA-3100 Kafka layer views (#2784))
=======
>>>>>>> ae5eea67f1 (GEOMESA-3100 Kafka layer views (#2784))
>>>>>>> 297ca0be9c (GEOMESA-3100 Kafka layer views (#2784))
=======
>>>>>>> 9e433ba57e (GEOMESA-3100 Kafka layer views (#2784))
>>>>>>> 41df6a2aa3 (GEOMESA-3100 Kafka layer views (#2784))
=======
>>>>>>> 79f56900f0 (GEOMESA-3100 Kafka layer views (#2784))
import org.locationtech.geomesa.index.FlushableFeatureWriter
=======
>>>>>>> af0a88eb1 (GEOMESA-3100 Kafka layer views (#2784))
<<<<<<< HEAD
<<<<<<< HEAD
<<<<<<< HEAD
<<<<<<< HEAD
<<<<<<< HEAD
<<<<<<< HEAD
=======
>>>>>>> f43f8303d3 (GEOMESA-3100 Kafka layer views (#2784))
=======
>>>>>>> 6e453fd3d0 (GEOMESA-3100 Kafka layer views (#2784))
=======
>>>>>>> 92dc7a8411 (GEOMESA-3100 Kafka layer views (#2784))
>>>>>>> 95c83ca7fa (GEOMESA-3100 Kafka layer views (#2784))
=======
>>>>>>> 58286bfd3 (GEOMESA-3100 Kafka layer views (#2784))
>>>>>>> 5ca0cd6de (GEOMESA-3100 Kafka layer views (#2784))
>>>>>>> 9361541304 (GEOMESA-3100 Kafka layer views (#2784))
=======
>>>>>>> bddfdbea5 (GEOMESA-3100 Kafka layer views (#2784))
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
>>>>>>> f187a4fcf9 (GEOMESA-3100 Kafka layer views (#2784))
=======
>>>>>>> bbc8576d19 (GEOMESA-3100 Kafka layer views (#2784))
=======
>>>>>>> d3b123117a (GEOMESA-3100 Kafka layer views (#2784))
=======
>>>>>>> 2766fc9b5b (GEOMESA-3100 Kafka layer views (#2784))
=======
>>>>>>> c44e474495 (GEOMESA-3100 Kafka layer views (#2784))
=======
>>>>>>> c2a94543ba (GEOMESA-3100 Kafka layer views (#2784))
=======
>>>>>>> c61bffed00 (GEOMESA-3100 Kafka layer views (#2784))
=======
>>>>>>> 12f226f36d (GEOMESA-3100 Kafka layer views (#2784))
=======
>>>>>>> 4f4ecaeb43 (GEOMESA-3100 Kafka layer views (#2784))
=======
>>>>>>> b4cd5a7733 (GEOMESA-3100 Kafka layer views (#2784))
=======
>>>>>>> c64e652363 (GEOMESA-3100 Kafka layer views (#2784))
=======
>>>>>>> 02eb81c815 (GEOMESA-3100 Kafka layer views (#2784))
=======
>>>>>>> 121a1d3470 (GEOMESA-3100 Kafka layer views (#2784))
=======
>>>>>>> 297ca0be9c (GEOMESA-3100 Kafka layer views (#2784))
=======
>>>>>>> 41df6a2aa3 (GEOMESA-3100 Kafka layer views (#2784))
=======
>>>>>>> fb32a36e0e (GEOMESA-3100 Kafka layer views (#2784))
=======
>>>>>>> fe3378ccaa (GEOMESA-3100 Kafka layer views (#2784))
=======
>>>>>>> 79f56900f0 (GEOMESA-3100 Kafka layer views (#2784))
>>>>>>> 2f66072323 (GEOMESA-3100 Kafka layer views (#2784))
=======
=======
>>>>>>> a62b956fb6 (GEOMESA-3100 Kafka layer views (#2784))
=======
<<<<<<< HEAD
<<<<<<< HEAD
>>>>>>> 4adaa7f479 (GEOMESA-3100 Kafka layer views (#2784))
=======
>>>>>>> c57b5f538a (GEOMESA-3100 Kafka layer views (#2784))
=======
<<<<<<< HEAD
<<<<<<< HEAD
>>>>>>> 88ef67cdfe (GEOMESA-3100 Kafka layer views (#2784))
=======
>>>>>>> dae1cf3cef (GEOMESA-3100 Kafka layer views (#2784))
=======
<<<<<<< HEAD
<<<<<<< HEAD
>>>>>>> 50a71079c1 (GEOMESA-3100 Kafka layer views (#2784))
=======
=======
<<<<<<< HEAD
<<<<<<< HEAD
>>>>>>> fdf51402cf (GEOMESA-3100 Kafka layer views (#2784))
=======
>>>>>>> 7bdc1feea8 (GEOMESA-3100 Kafka layer views (#2784))
=======
>>>>>>> 9b15c8e14c (GEOMESA-3100 Kafka layer views (#2784))
=======
<<<<<<< HEAD
<<<<<<< HEAD
>>>>>>> 5d8c5baea0 (GEOMESA-3100 Kafka layer views (#2784))
=======
>>>>>>> 7628960f66 (GEOMESA-3100 Kafka layer views (#2784))
=======
<<<<<<< HEAD
<<<<<<< HEAD
>>>>>>> 2750a5beef (GEOMESA-3100 Kafka layer views (#2784))
=======
>>>>>>> cb4aa55ae3 (GEOMESA-3100 Kafka layer views (#2784))
=======
<<<<<<< HEAD
<<<<<<< HEAD
>>>>>>> d530f7b24a (GEOMESA-3100 Kafka layer views (#2784))
=======
>>>>>>> 5e230912b1 (GEOMESA-3100 Kafka layer views (#2784))
=======
<<<<<<< HEAD
=======
>>>>>>> fdf51402cf (GEOMESA-3100 Kafka layer views (#2784))
=======
<<<<<<< HEAD
>>>>>>> b4cd5a7733 (GEOMESA-3100 Kafka layer views (#2784))
=======
>>>>>>> 7bdc1feea8 (GEOMESA-3100 Kafka layer views (#2784))
=======
>>>>>>> c64e652363 (GEOMESA-3100 Kafka layer views (#2784))
=======
>>>>>>> 02eb81c815 (GEOMESA-3100 Kafka layer views (#2784))
=======
>>>>>>> 5d8c5baea0 (GEOMESA-3100 Kafka layer views (#2784))
=======
>>>>>>> 121a1d3470 (GEOMESA-3100 Kafka layer views (#2784))
=======
>>>>>>> 297ca0be9c (GEOMESA-3100 Kafka layer views (#2784))
=======
>>>>>>> 2750a5beef (GEOMESA-3100 Kafka layer views (#2784))
=======
>>>>>>> 41df6a2aa3 (GEOMESA-3100 Kafka layer views (#2784))
=======
>>>>>>> fb32a36e0e (GEOMESA-3100 Kafka layer views (#2784))
=======
>>>>>>> d530f7b24a (GEOMESA-3100 Kafka layer views (#2784))
=======
>>>>>>> fe3378ccaa (GEOMESA-3100 Kafka layer views (#2784))
=======
>>>>>>> 79f56900f0 (GEOMESA-3100 Kafka layer views (#2784))
>>>>>>> e7f3e6588 (GEOMESA-3100 Kafka layer views (#2784))
>>>>>>> 3ebcdb99d9 (GEOMESA-3100 Kafka layer views (#2784))
=======
>>>>>>> 6f6887eb8 (GEOMESA-3100 Kafka layer views (#2784))
=======
<<<<<<< HEAD
<<<<<<< HEAD
>>>>>>> 8b9e99d11a (GEOMESA-3100 Kafka layer views (#2784))
=======
>>>>>>> 614fcb6bc3 (GEOMESA-3100 Kafka layer views (#2784))
=======
<<<<<<< HEAD
<<<<<<< HEAD
=======
>>>>>>> ae5eea67f1 (GEOMESA-3100 Kafka layer views (#2784))
=======
>>>>>>> 9e433ba57e (GEOMESA-3100 Kafka layer views (#2784))
=======
>>>>>>> 2df2640494 (GEOMESA-3100 Kafka layer views (#2784))
=======
>>>>>>> 1e11ed51a6 (GEOMESA-3100 Kafka layer views (#2784))
=======
>>>>>>> 976f319530 (GEOMESA-3100 Kafka layer views (#2784))
=======
>>>>>>> 121a1d3470 (GEOMESA-3100 Kafka layer views (#2784))
=======
>>>>>>> ae5eea67f1 (GEOMESA-3100 Kafka layer views (#2784))
=======
>>>>>>> 9e433ba57e (GEOMESA-3100 Kafka layer views (#2784))
=======
>>>>>>> 2df2640494 (GEOMESA-3100 Kafka layer views (#2784))
=======
>>>>>>> 1e11ed51a6 (GEOMESA-3100 Kafka layer views (#2784))
=======
>>>>>>> 976f319530 (GEOMESA-3100 Kafka layer views (#2784))
=======
>>>>>>> a62b956fb (GEOMESA-3100 Kafka layer views (#2784))
>>>>>>> e0773a1bd7 (GEOMESA-3100 Kafka layer views (#2784))
=======
<<<<<<< HEAD
<<<<<<< HEAD
>>>>>>> 4adaa7f47 (GEOMESA-3100 Kafka layer views (#2784))
=======
>>>>>>> c57b5f538 (GEOMESA-3100 Kafka layer views (#2784))
=======
<<<<<<< HEAD
<<<<<<< HEAD
>>>>>>> 88ef67cdf (GEOMESA-3100 Kafka layer views (#2784))
=======
=======
>>>>>>> bbc8576d19 (GEOMESA-3100 Kafka layer views (#2784))
=======
>>>>>>> 4adaa7f479 (GEOMESA-3100 Kafka layer views (#2784))
=======
>>>>>>> d3b123117a (GEOMESA-3100 Kafka layer views (#2784))
=======
>>>>>>> c44e474495 (GEOMESA-3100 Kafka layer views (#2784))
=======
>>>>>>> 88ef67cdfe (GEOMESA-3100 Kafka layer views (#2784))
=======
>>>>>>> c2a94543ba (GEOMESA-3100 Kafka layer views (#2784))
=======
>>>>>>> c61bffed00 (GEOMESA-3100 Kafka layer views (#2784))
=======
>>>>>>> 50a71079c1 (GEOMESA-3100 Kafka layer views (#2784))
=======
>>>>>>> 12f226f36d (GEOMESA-3100 Kafka layer views (#2784))
=======
>>>>>>> e7f3e6588 (GEOMESA-3100 Kafka layer views (#2784))
>>>>>>> 3ebcdb99d9 (GEOMESA-3100 Kafka layer views (#2784))
=======
>>>>>>> 4f4ecaeb43 (GEOMESA-3100 Kafka layer views (#2784))
=======
>>>>>>> b4cd5a7733 (GEOMESA-3100 Kafka layer views (#2784))
=======
>>>>>>> 8b9e99d11a (GEOMESA-3100 Kafka layer views (#2784))
=======
>>>>>>> c64e652363 (GEOMESA-3100 Kafka layer views (#2784))
=======
>>>>>>> 02eb81c815 (GEOMESA-3100 Kafka layer views (#2784))
=======
>>>>>>> 121a1d3470 (GEOMESA-3100 Kafka layer views (#2784))
=======
>>>>>>> 4adaa7f47 (GEOMESA-3100 Kafka layer views (#2784))
=======
>>>>>>> 297ca0be9c (GEOMESA-3100 Kafka layer views (#2784))
=======
>>>>>>> fe3378ccaa (GEOMESA-3100 Kafka layer views (#2784))
=======
>>>>>>> 88ef67cdf (GEOMESA-3100 Kafka layer views (#2784))
=======
>>>>>>> 79f56900f0 (GEOMESA-3100 Kafka layer views (#2784))
>>>>>>> d0dc799ff (GEOMESA-3100 Kafka layer views (#2784))
<<<<<<< HEAD
<<<<<<< HEAD
<<<<<<< HEAD
<<<<<<< HEAD
=======
>>>>>>> d309fbbbbf (GEOMESA-3100 Kafka layer views (#2784))
=======
>>>>>>> de8804123e (GEOMESA-3100 Kafka layer views (#2784))
>>>>>>> ea3b40e187 (GEOMESA-3100 Kafka layer views (#2784))
=======
>>>>>>> 4231e686dd (GEOMESA-3100 Kafka layer views (#2784))
=======
<<<<<<< HEAD
<<<<<<< HEAD
>>>>>>> fa68dd43c6 (GEOMESA-3100 Kafka layer views (#2784))
=======
=======
>>>>>>> 0a0bf0292e (GEOMESA-3100 Kafka layer views (#2784))
=======
>>>>>>> d309fbbbbf (GEOMESA-3100 Kafka layer views (#2784))
=======
>>>>>>> fa68dd43c6 (GEOMESA-3100 Kafka layer views (#2784))
=======
>>>>>>> de8804123e (GEOMESA-3100 Kafka layer views (#2784))
import org.locationtech.geomesa.index.FlushableFeatureWriter
=======
>>>>>>> af0a88eb1 (GEOMESA-3100 Kafka layer views (#2784))
<<<<<<< HEAD
<<<<<<< HEAD
<<<<<<< HEAD
<<<<<<< HEAD
<<<<<<< HEAD
=======
>>>>>>> d309fbbbbf (GEOMESA-3100 Kafka layer views (#2784))
=======
>>>>>>> de8804123e (GEOMESA-3100 Kafka layer views (#2784))
>>>>>>> d2cb939f51 (GEOMESA-3100 Kafka layer views (#2784))
=======
import org.locationtech.geomesa.index.FlushableFeatureWriter
>>>>>>> 3be8d2a5a4 (Merge branch 'feature/postgis-fixes')
=======
import org.locationtech.geomesa.index.FlushableFeatureWriter
=======
>>>>>>> af0a88eb1 (GEOMESA-3100 Kafka layer views (#2784))
>>>>>>> a0314fb7ff (GEOMESA-3100 Kafka layer views (#2784))
=======
<<<<<<< HEAD
>>>>>>> bddfdbea54 (GEOMESA-3100 Kafka layer views (#2784))
>>>>>>> 0a0bf0292e (GEOMESA-3100 Kafka layer views (#2784))
=======
>>>>>>> 58286bfd3 (GEOMESA-3100 Kafka layer views (#2784))
>>>>>>> 5ca0cd6de (GEOMESA-3100 Kafka layer views (#2784))
>>>>>>> 9236b02087 (GEOMESA-3100 Kafka layer views (#2784))
=======
>>>>>>> bddfdbea5 (GEOMESA-3100 Kafka layer views (#2784))
>>>>>>> 862857ce2e (GEOMESA-3100 Kafka layer views (#2784))
<<<<<<< HEAD
<<<<<<< HEAD
=======
>>>>>>> f187a4fcf9 (GEOMESA-3100 Kafka layer views (#2784))
=======
=======
>>>>>>> d0dc799ff (GEOMESA-3100 Kafka layer views (#2784))
>>>>>>> 28427dfd8f (GEOMESA-3100 Kafka layer views (#2784))
<<<<<<< HEAD
<<<<<<< HEAD
=======
>>>>>>> 95c83ca7f (GEOMESA-3100 Kafka layer views (#2784))
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
>>>>>>> 2f673a268a (GEOMESA-3100 Kafka layer views (#2784))
=======
>>>>>>> 89f0c9f2c3 (GEOMESA-3100 Kafka layer views (#2784))
=======
>>>>>>> 222e44653b (GEOMESA-3100 Kafka layer views (#2784))
=======
>>>>>>> 43ac4062d9 (GEOMESA-3100 Kafka layer views (#2784))
=======
>>>>>>> 30905e530b (GEOMESA-3100 Kafka layer views (#2784))
=======
>>>>>>> 340134cdda (GEOMESA-3100 Kafka layer views (#2784))
=======
>>>>>>> ea8384d9b7 (GEOMESA-3100 Kafka layer views (#2784))
>>>>>>> 4231e686dd (GEOMESA-3100 Kafka layer views (#2784))
=======
=======
>>>>>>> 9e910620b3 (GEOMESA-3100 Kafka layer views (#2784))
=======
<<<<<<< HEAD
<<<<<<< HEAD
>>>>>>> 4c325746bd (GEOMESA-3100 Kafka layer views (#2784))
=======
=======
<<<<<<< HEAD
<<<<<<< HEAD
>>>>>>> 495a1efc9f (GEOMESA-3100 Kafka layer views (#2784))
=======
>>>>>>> 468da42855 (GEOMESA-3100 Kafka layer views (#2784))
=======
>>>>>>> 5dd3eb3a6d (GEOMESA-3100 Kafka layer views (#2784))
=======
<<<<<<< HEAD
=======
>>>>>>> 495a1efc9f (GEOMESA-3100 Kafka layer views (#2784))
=======
<<<<<<< HEAD
>>>>>>> 30905e530b (GEOMESA-3100 Kafka layer views (#2784))
=======
>>>>>>> 468da42855 (GEOMESA-3100 Kafka layer views (#2784))
=======
>>>>>>> 340134cdda (GEOMESA-3100 Kafka layer views (#2784))
=======
>>>>>>> ea8384d9b7 (GEOMESA-3100 Kafka layer views (#2784))
>>>>>>> 69e3273ac1 (GEOMESA-3100 Kafka layer views (#2784))
>>>>>>> 3977ecc140 (GEOMESA-3100 Kafka layer views (#2784))
=======
>>>>>>> 04f82bbc57 (GEOMESA-3100 Kafka layer views (#2784))
=======
<<<<<<< HEAD
<<<<<<< HEAD
>>>>>>> 23f312535d (GEOMESA-3100 Kafka layer views (#2784))
=======
>>>>>>> 826636f69d (GEOMESA-3100 Kafka layer views (#2784))
=======
<<<<<<< HEAD
=======
>>>>>>> 89f0c9f2c3 (GEOMESA-3100 Kafka layer views (#2784))
=======
>>>>>>> 4c325746bd (GEOMESA-3100 Kafka layer views (#2784))
=======
>>>>>>> 222e44653b (GEOMESA-3100 Kafka layer views (#2784))
=======
>>>>>>> 69e3273ac1 (GEOMESA-3100 Kafka layer views (#2784))
>>>>>>> 3977ecc140 (GEOMESA-3100 Kafka layer views (#2784))
=======
>>>>>>> 43ac4062d9 (GEOMESA-3100 Kafka layer views (#2784))
=======
>>>>>>> 30905e530b (GEOMESA-3100 Kafka layer views (#2784))
=======
>>>>>>> 23f312535d (GEOMESA-3100 Kafka layer views (#2784))
=======
>>>>>>> 340134cdda (GEOMESA-3100 Kafka layer views (#2784))
=======
>>>>>>> ea8384d9b7 (GEOMESA-3100 Kafka layer views (#2784))
>>>>>>> 936154130 (GEOMESA-3100 Kafka layer views (#2784))
<<<<<<< HEAD
<<<<<<< HEAD
>>>>>>> ac0357d362 (GEOMESA-3100 Kafka layer views (#2784))
=======
=======
>>>>>>> 2f6607232 (GEOMESA-3100 Kafka layer views (#2784))
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
>>>>>>> c2a94543ba (GEOMESA-3100 Kafka layer views (#2784))
=======
>>>>>>> 4f4ecaeb43 (GEOMESA-3100 Kafka layer views (#2784))
=======
>>>>>>> b4cd5a7733 (GEOMESA-3100 Kafka layer views (#2784))
=======
>>>>>>> 121a1d3470 (GEOMESA-3100 Kafka layer views (#2784))
=======
>>>>>>> 297ca0be9c (GEOMESA-3100 Kafka layer views (#2784))
=======
>>>>>>> fe3378ccaa (GEOMESA-3100 Kafka layer views (#2784))
=======
>>>>>>> 79f56900f0 (GEOMESA-3100 Kafka layer views (#2784))
>>>>>>> a62b956fb6 (GEOMESA-3100 Kafka layer views (#2784))
=======
=======
>>>>>>> 88ef67cdfe (GEOMESA-3100 Kafka layer views (#2784))
=======
<<<<<<< HEAD
<<<<<<< HEAD
>>>>>>> 3ebcdb99d9 (GEOMESA-3100 Kafka layer views (#2784))
=======
=======
<<<<<<< HEAD
<<<<<<< HEAD
>>>>>>> 5d8c5baea0 (GEOMESA-3100 Kafka layer views (#2784))
=======
>>>>>>> 7628960f66 (GEOMESA-3100 Kafka layer views (#2784))
=======
>>>>>>> d530f7b24a (GEOMESA-3100 Kafka layer views (#2784))
=======
<<<<<<< HEAD
<<<<<<< HEAD
>>>>>>> 5e230912b1 (GEOMESA-3100 Kafka layer views (#2784))
=======
=======
>>>>>>> 5d8c5baea0 (GEOMESA-3100 Kafka layer views (#2784))
=======
<<<<<<< HEAD
>>>>>>> 121a1d3470 (GEOMESA-3100 Kafka layer views (#2784))
=======
>>>>>>> 7628960f66 (GEOMESA-3100 Kafka layer views (#2784))
=======
>>>>>>> 297ca0be9c (GEOMESA-3100 Kafka layer views (#2784))
=======
>>>>>>> fe3378ccaa (GEOMESA-3100 Kafka layer views (#2784))
=======
>>>>>>> 5e230912b1 (GEOMESA-3100 Kafka layer views (#2784))
=======
>>>>>>> 79f56900f0 (GEOMESA-3100 Kafka layer views (#2784))
>>>>>>> 6f6887eb8 (GEOMESA-3100 Kafka layer views (#2784))
>>>>>>> fdf51402cf (GEOMESA-3100 Kafka layer views (#2784))
=======
>>>>>>> e0773a1bd7 (GEOMESA-3100 Kafka layer views (#2784))
=======
<<<<<<< HEAD
=======
>>>>>>> 1e11ed51a6 (GEOMESA-3100 Kafka layer views (#2784))
=======
>>>>>>> 976f319530 (GEOMESA-3100 Kafka layer views (#2784))
=======
>>>>>>> 4adaa7f47 (GEOMESA-3100 Kafka layer views (#2784))
>>>>>>> ae5eea67f1 (GEOMESA-3100 Kafka layer views (#2784))
=======
>>>>>>> 88ef67cdf (GEOMESA-3100 Kafka layer views (#2784))
=======
=======
>>>>>>> c2a94543ba (GEOMESA-3100 Kafka layer views (#2784))
=======
>>>>>>> 3ebcdb99d9 (GEOMESA-3100 Kafka layer views (#2784))
=======
>>>>>>> 4f4ecaeb43 (GEOMESA-3100 Kafka layer views (#2784))
=======
>>>>>>> 6f6887eb8 (GEOMESA-3100 Kafka layer views (#2784))
>>>>>>> fdf51402cf (GEOMESA-3100 Kafka layer views (#2784))
=======
>>>>>>> b4cd5a7733 (GEOMESA-3100 Kafka layer views (#2784))
=======
>>>>>>> 121a1d3470 (GEOMESA-3100 Kafka layer views (#2784))
=======
>>>>>>> 1e11ed51a6 (GEOMESA-3100 Kafka layer views (#2784))
=======
>>>>>>> 976f319530 (GEOMESA-3100 Kafka layer views (#2784))
=======
>>>>>>> 4adaa7f47 (GEOMESA-3100 Kafka layer views (#2784))
>>>>>>> ae5eea67f1 (GEOMESA-3100 Kafka layer views (#2784))
=======
>>>>>>> 88ef67cdf (GEOMESA-3100 Kafka layer views (#2784))
=======
=======
>>>>>>> d0dc799ff (GEOMESA-3100 Kafka layer views (#2784))
>>>>>>> ea3b40e18 (GEOMESA-3100 Kafka layer views (#2784))
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
>>>>>>> c2a94543ba (GEOMESA-3100 Kafka layer views (#2784))
=======
>>>>>>> 117b13aaaa (GEOMESA-3100 Kafka layer views (#2784))
=======
>>>>>>> b4cd5a7733 (GEOMESA-3100 Kafka layer views (#2784))
=======
>>>>>>> 750ebbabe7 (GEOMESA-3100 Kafka layer views (#2784))
=======
>>>>>>> 297ca0be9c (GEOMESA-3100 Kafka layer views (#2784))
=======
>>>>>>> 39d28fffcb (GEOMESA-3100 Kafka layer views (#2784))
=======
>>>>>>> 79f56900f0 (GEOMESA-3100 Kafka layer views (#2784))
=======
>>>>>>> 72ec0b2107 (GEOMESA-3100 Kafka layer views (#2784))
>>>>>>> 4adaa7f479 (GEOMESA-3100 Kafka layer views (#2784))
=======
=======
>>>>>>> 89fb9950ef (GEOMESA-3100 Kafka layer views (#2784))
=======
<<<<<<< HEAD
<<<<<<< HEAD
>>>>>>> fdf51402cf (GEOMESA-3100 Kafka layer views (#2784))
=======
=======
<<<<<<< HEAD
<<<<<<< HEAD
>>>>>>> 7628960f66 (GEOMESA-3100 Kafka layer views (#2784))
=======
>>>>>>> 416a95a4c0 (GEOMESA-3100 Kafka layer views (#2784))
=======
>>>>>>> 5e230912b1 (GEOMESA-3100 Kafka layer views (#2784))
=======
<<<<<<< HEAD
<<<<<<< HEAD
>>>>>>> f340d6feab (GEOMESA-3100 Kafka layer views (#2784))
=======
=======
>>>>>>> 7628960f66 (GEOMESA-3100 Kafka layer views (#2784))
=======
<<<<<<< HEAD
>>>>>>> 297ca0be9c (GEOMESA-3100 Kafka layer views (#2784))
=======
>>>>>>> 416a95a4c0 (GEOMESA-3100 Kafka layer views (#2784))
=======
>>>>>>> 39d28fffcb (GEOMESA-3100 Kafka layer views (#2784))
=======
>>>>>>> 79f56900f0 (GEOMESA-3100 Kafka layer views (#2784))
=======
>>>>>>> f340d6feab (GEOMESA-3100 Kafka layer views (#2784))
=======
>>>>>>> 72ec0b2107 (GEOMESA-3100 Kafka layer views (#2784))
>>>>>>> 42549e8e3 (GEOMESA-3100 Kafka layer views (#2784))
>>>>>>> a377061090 (GEOMESA-3100 Kafka layer views (#2784))
=======
>>>>>>> ae5eea67f1 (GEOMESA-3100 Kafka layer views (#2784))
=======
<<<<<<< HEAD
<<<<<<< HEAD
=======
>>>>>>> 976f319530 (GEOMESA-3100 Kafka layer views (#2784))
=======
>>>>>>> bc97b07a31 (GEOMESA-3100 Kafka layer views (#2784))
=======
>>>>>>> 39d28fffcb (GEOMESA-3100 Kafka layer views (#2784))
=======
>>>>>>> 976f319530 (GEOMESA-3100 Kafka layer views (#2784))
=======
>>>>>>> bc97b07a31 (GEOMESA-3100 Kafka layer views (#2784))
=======
>>>>>>> 6af71ff43 (GEOMESA-3100 Kafka layer views (#2784))
>>>>>>> 23a7d9849f (GEOMESA-3100 Kafka layer views (#2784))
=======
<<<<<<< HEAD
<<<<<<< HEAD
>>>>>>> 89fb9950e (GEOMESA-3100 Kafka layer views (#2784))
=======
=======
>>>>>>> 117b13aaaa (GEOMESA-3100 Kafka layer views (#2784))
=======
>>>>>>> fdf51402cf (GEOMESA-3100 Kafka layer views (#2784))
=======
>>>>>>> b4cd5a7733 (GEOMESA-3100 Kafka layer views (#2784))
=======
>>>>>>> 42549e8e3 (GEOMESA-3100 Kafka layer views (#2784))
>>>>>>> a377061090 (GEOMESA-3100 Kafka layer views (#2784))
=======
>>>>>>> 750ebbabe7 (GEOMESA-3100 Kafka layer views (#2784))
=======
>>>>>>> 297ca0be9c (GEOMESA-3100 Kafka layer views (#2784))
=======
>>>>>>> 39d28fffcb (GEOMESA-3100 Kafka layer views (#2784))
=======
>>>>>>> 89fb9950e (GEOMESA-3100 Kafka layer views (#2784))
=======
>>>>>>> 72ec0b2107 (GEOMESA-3100 Kafka layer views (#2784))
import org.locationtech.geomesa.index.FlushableFeatureWriter
=======
>>>>>>> af0a88eb1 (GEOMESA-3100 Kafka layer views (#2784))
>>>>>>> d2cb939f5 (GEOMESA-3100 Kafka layer views (#2784))
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
>>>>>>> 117b13aaaa (GEOMESA-3100 Kafka layer views (#2784))
=======
>>>>>>> 67de3c3202 (Merge branch 'feature/postgis-fixes')
=======
>>>>>>> 750ebbabe7 (GEOMESA-3100 Kafka layer views (#2784))
=======
>>>>>>> 638b68d081 (Merge branch 'feature/postgis-fixes')
=======
>>>>>>> 39d28fffcb (GEOMESA-3100 Kafka layer views (#2784))
=======
>>>>>>> 71adb695c5 (Merge branch 'feature/postgis-fixes')
=======
>>>>>>> 72ec0b2107 (GEOMESA-3100 Kafka layer views (#2784))
=======
>>>>>>> 30559ea5c9 (Merge branch 'feature/postgis-fixes')
>>>>>>> 6af71ff432 (GEOMESA-3100 Kafka layer views (#2784))
=======
=======
>>>>>>> a377061090 (GEOMESA-3100 Kafka layer views (#2784))
=======
<<<<<<< HEAD
<<<<<<< HEAD
>>>>>>> e944f1c88b (Merge branch 'feature/postgis-fixes')
=======
=======
<<<<<<< HEAD
<<<<<<< HEAD
>>>>>>> 26e5afc4ea (Merge branch 'feature/postgis-fixes')
=======
>>>>>>> f340d6feab (GEOMESA-3100 Kafka layer views (#2784))
=======
>>>>>>> c69897d7bd (Merge branch 'feature/postgis-fixes')
=======
<<<<<<< HEAD
=======
>>>>>>> 26e5afc4ea (Merge branch 'feature/postgis-fixes')
=======
<<<<<<< HEAD
>>>>>>> 71adb695c5 (Merge branch 'feature/postgis-fixes')
=======
>>>>>>> f340d6feab (GEOMESA-3100 Kafka layer views (#2784))
=======
>>>>>>> 72ec0b2107 (GEOMESA-3100 Kafka layer views (#2784))
=======
>>>>>>> 30559ea5c9 (Merge branch 'feature/postgis-fixes')
>>>>>>> 23a7d9849f (GEOMESA-3100 Kafka layer views (#2784))
>>>>>>> 416a95a4c0 (GEOMESA-3100 Kafka layer views (#2784))
=======
>>>>>>> cb6bda89b6 (Merge branch 'feature/postgis-fixes')
=======
<<<<<<< HEAD
<<<<<<< HEAD
>>>>>>> bc97b07a31 (GEOMESA-3100 Kafka layer views (#2784))
=======
>>>>>>> 699117eca9 (Merge branch 'feature/postgis-fixes')
=======
<<<<<<< HEAD
=======
>>>>>>> 750ebbabe7 (GEOMESA-3100 Kafka layer views (#2784))
=======
>>>>>>> e944f1c88b (Merge branch 'feature/postgis-fixes')
=======
>>>>>>> 638b68d081 (Merge branch 'feature/postgis-fixes')
=======
>>>>>>> 23a7d9849f (GEOMESA-3100 Kafka layer views (#2784))
>>>>>>> 416a95a4c0 (GEOMESA-3100 Kafka layer views (#2784))
=======
>>>>>>> 39d28fffcb (GEOMESA-3100 Kafka layer views (#2784))
=======
>>>>>>> 71adb695c5 (Merge branch 'feature/postgis-fixes')
=======
>>>>>>> bc97b07a31 (GEOMESA-3100 Kafka layer views (#2784))
=======
>>>>>>> 72ec0b2107 (GEOMESA-3100 Kafka layer views (#2784))
=======
>>>>>>> 30559ea5c9 (Merge branch 'feature/postgis-fixes')
import org.locationtech.geomesa.index.FlushableFeatureWriter
>>>>>>> 3be8d2a5a (Merge branch 'feature/postgis-fixes')
<<<<<<< HEAD
>>>>>>> db8d998aa2 (Merge branch 'feature/postgis-fixes')
=======
import org.locationtech.geomesa.index.FlushableFeatureWriter
>>>>>>> d845d7c1bd (GEOMESA-3254 Add Bloop build support)
=======
>>>>>>> 98e7bf59d2 (GEOMESA-3100 Kafka layer views (#2784))
=======
import org.locationtech.geomesa.index.FlushableFeatureWriter
=======
>>>>>>> af0a88eb1 (GEOMESA-3100 Kafka layer views (#2784))
<<<<<<< HEAD
<<<<<<< HEAD
<<<<<<< HEAD
<<<<<<< HEAD
=======
>>>>>>> cf457d8543 (GEOMESA-3100 Kafka layer views (#2784))
=======
>>>>>>> fc4546247e (GEOMESA-3100 Kafka layer views (#2784))
>>>>>>> 17f13b3a7a (GEOMESA-3100 Kafka layer views (#2784))
=======
>>>>>>> 58286bfd3 (GEOMESA-3100 Kafka layer views (#2784))
>>>>>>> 5ca0cd6de (GEOMESA-3100 Kafka layer views (#2784))
>>>>>>> f6e840b5dd (GEOMESA-3100 Kafka layer views (#2784))
=======
>>>>>>> bddfdbea5 (GEOMESA-3100 Kafka layer views (#2784))
>>>>>>> c589b832a5 (GEOMESA-3100 Kafka layer views (#2784))
=======
=======
>>>>>>> d0dc799ff (GEOMESA-3100 Kafka layer views (#2784))
>>>>>>> ffbc2ce32a (GEOMESA-3100 Kafka layer views (#2784))
<<<<<<< HEAD
<<<<<<< HEAD
=======
>>>>>>> 95c83ca7f (GEOMESA-3100 Kafka layer views (#2784))
>>>>>>> fa68dd43c6 (GEOMESA-3100 Kafka layer views (#2784))
=======
=======
>>>>>>> 936154130 (GEOMESA-3100 Kafka layer views (#2784))
>>>>>>> 54ece16d15 (GEOMESA-3100 Kafka layer views (#2784))
<<<<<<< HEAD
<<<<<<< HEAD
=======
>>>>>>> c44e474495 (GEOMESA-3100 Kafka layer views (#2784))
=======
=======
>>>>>>> 2f6607232 (GEOMESA-3100 Kafka layer views (#2784))
>>>>>>> c57b5f538a (GEOMESA-3100 Kafka layer views (#2784))
<<<<<<< HEAD
<<<<<<< HEAD
=======
>>>>>>> 88ef67cdfe (GEOMESA-3100 Kafka layer views (#2784))
=======
>>>>>>> 89fb9950ef (GEOMESA-3100 Kafka layer views (#2784))
<<<<<<< HEAD
<<<<<<< HEAD
=======
>>>>>>> 67de3c3202 (Merge branch 'feature/postgis-fixes')
=======
=======
import org.locationtech.geomesa.index.FlushableFeatureWriter
>>>>>>> 3be8d2a5a (Merge branch 'feature/postgis-fixes')
>>>>>>> 1b25d7ddb4 (Merge branch 'feature/postgis-fixes')
<<<<<<< HEAD
<<<<<<< HEAD
=======
=======
>>>>>>> eddb4eaca1 (GEOMESA-3100 Kafka layer views (#2784))
>>>>>>> eecabb92a (GEOMESA-3100 Kafka layer views (#2784))
<<<<<<< HEAD
>>>>>>> 98e7bf59d2 (GEOMESA-3100 Kafka layer views (#2784))
=======
=======
>>>>>>> 581f1dd15 (GEOMESA-3100 Kafka layer views (#2784))
<<<<<<< HEAD
>>>>>>> e24613dc4a (GEOMESA-3100 Kafka layer views (#2784))
=======
=======
>>>>>>> 1a5f68233 (GEOMESA-3100 Kafka layer views (#2784))
<<<<<<< HEAD
<<<<<<< HEAD
<<<<<<< HEAD
=======
>>>>>>> 12f226f36d (GEOMESA-3100 Kafka layer views (#2784))
>>>>>>> dae1cf3cef (GEOMESA-3100 Kafka layer views (#2784))
=======
=======
=======
>>>>>>> d0dc799ff (GEOMESA-3100 Kafka layer views (#2784))
>>>>>>> 73767737b (GEOMESA-3100 Kafka layer views (#2784))
<<<<<<< HEAD
<<<<<<< HEAD
<<<<<<< HEAD
=======
>>>>>>> 89f0c9f2c3 (GEOMESA-3100 Kafka layer views (#2784))
>>>>>>> 50a71079c1 (GEOMESA-3100 Kafka layer views (#2784))
=======
=======
>>>>>>> 65a3a6e36 (GEOMESA-3100 Kafka layer views (#2784))
<<<<<<< HEAD
<<<<<<< HEAD
<<<<<<< HEAD
=======
>>>>>>> 222e44653b (GEOMESA-3100 Kafka layer views (#2784))
>>>>>>> 9e910620b3 (GEOMESA-3100 Kafka layer views (#2784))
=======
=======
=======
>>>>>>> 936154130 (GEOMESA-3100 Kafka layer views (#2784))
>>>>>>> 429ffc55e (GEOMESA-3100 Kafka layer views (#2784))
<<<<<<< HEAD
<<<<<<< HEAD
<<<<<<< HEAD
=======
>>>>>>> 4f4ecaeb43 (GEOMESA-3100 Kafka layer views (#2784))
>>>>>>> 4c325746bd (GEOMESA-3100 Kafka layer views (#2784))
=======
=======
>>>>>>> e7f3e6588 (GEOMESA-3100 Kafka layer views (#2784))
<<<<<<< HEAD
<<<<<<< HEAD
<<<<<<< HEAD
=======
>>>>>>> b4cd5a7733 (GEOMESA-3100 Kafka layer views (#2784))
>>>>>>> 3ebcdb99d9 (GEOMESA-3100 Kafka layer views (#2784))
=======
=======
>>>>>>> 6f6887eb8 (GEOMESA-3100 Kafka layer views (#2784))
<<<<<<< HEAD
<<<<<<< HEAD
<<<<<<< HEAD
=======
>>>>>>> 750ebbabe7 (GEOMESA-3100 Kafka layer views (#2784))
>>>>>>> fdf51402cf (GEOMESA-3100 Kafka layer views (#2784))
=======
=======
>>>>>>> 42549e8e3 (GEOMESA-3100 Kafka layer views (#2784))
<<<<<<< HEAD
<<<<<<< HEAD
<<<<<<< HEAD
=======
>>>>>>> 638b68d081 (Merge branch 'feature/postgis-fixes')
>>>>>>> a377061090 (GEOMESA-3100 Kafka layer views (#2784))
=======
=======
=======
import org.locationtech.geomesa.index.FlushableFeatureWriter
>>>>>>> 3be8d2a5a (Merge branch 'feature/postgis-fixes')
>>>>>>> e8cc4971c6 (Merge branch 'feature/postgis-fixes')
<<<<<<< HEAD
<<<<<<< HEAD
<<<<<<< HEAD
=======
>>>>>>> fc4546247e (GEOMESA-3100 Kafka layer views (#2784))
>>>>>>> e944f1c88b (Merge branch 'feature/postgis-fixes')
=======
=======
>>>>>>> a0314fb7f (GEOMESA-3100 Kafka layer views (#2784))
<<<<<<< HEAD
<<<<<<< HEAD
<<<<<<< HEAD
>>>>>>> 8ed2c9f7e5 (GEOMESA-3100 Kafka layer views (#2784))
<<<<<<< HEAD
>>>>>>> eddb4eaca1 (GEOMESA-3100 Kafka layer views (#2784))
=======
=======
=======
>>>>>>> 9236b0208 (GEOMESA-3100 Kafka layer views (#2784))
<<<<<<< HEAD
<<<<<<< HEAD
>>>>>>> c1d0543aac (GEOMESA-3100 Kafka layer views (#2784))
<<<<<<< HEAD
>>>>>>> be0c9d161a (GEOMESA-3100 Kafka layer views (#2784))
=======
=======
=======
>>>>>>> 862857ce2 (GEOMESA-3100 Kafka layer views (#2784))
<<<<<<< HEAD
<<<<<<< HEAD
>>>>>>> 8b9e99d11a (GEOMESA-3100 Kafka layer views (#2784))
<<<<<<< HEAD
>>>>>>> 7bdc1feea8 (GEOMESA-3100 Kafka layer views (#2784))
=======
=======
=======
=======
>>>>>>> d0dc799ff (GEOMESA-3100 Kafka layer views (#2784))
>>>>>>> 28427dfd8 (GEOMESA-3100 Kafka layer views (#2784))
<<<<<<< HEAD
<<<<<<< HEAD
>>>>>>> 614fcb6bc3 (GEOMESA-3100 Kafka layer views (#2784))
<<<<<<< HEAD
>>>>>>> 9b15c8e14c (GEOMESA-3100 Kafka layer views (#2784))
=======
=======
=======
>>>>>>> 4231e686d (GEOMESA-3100 Kafka layer views (#2784))
<<<<<<< HEAD
<<<<<<< HEAD
>>>>>>> 69e3273ac1 (GEOMESA-3100 Kafka layer views (#2784))
<<<<<<< HEAD
>>>>>>> 3977ecc140 (GEOMESA-3100 Kafka layer views (#2784))
=======
=======
=======
=======
>>>>>>> 936154130 (GEOMESA-3100 Kafka layer views (#2784))
>>>>>>> ac0357d36 (GEOMESA-3100 Kafka layer views (#2784))
<<<<<<< HEAD
<<<<<<< HEAD
>>>>>>> 04f82bbc57 (GEOMESA-3100 Kafka layer views (#2784))
<<<<<<< HEAD
>>>>>>> 495a1efc9f (GEOMESA-3100 Kafka layer views (#2784))
=======
=======
=======
>>>>>>> a62b956fb (GEOMESA-3100 Kafka layer views (#2784))
<<<<<<< HEAD
<<<<<<< HEAD
>>>>>>> e0773a1bd7 (GEOMESA-3100 Kafka layer views (#2784))
<<<<<<< HEAD
>>>>>>> 5d8c5baea0 (GEOMESA-3100 Kafka layer views (#2784))
=======
=======
=======
>>>>>>> 4adaa7f47 (GEOMESA-3100 Kafka layer views (#2784))
<<<<<<< HEAD
<<<<<<< HEAD
>>>>>>> ae5eea67f1 (GEOMESA-3100 Kafka layer views (#2784))
<<<<<<< HEAD
>>>>>>> 7628960f66 (GEOMESA-3100 Kafka layer views (#2784))
=======
=======
=======
>>>>>>> 6af71ff43 (GEOMESA-3100 Kafka layer views (#2784))
<<<<<<< HEAD
<<<<<<< HEAD
>>>>>>> 23a7d9849f (GEOMESA-3100 Kafka layer views (#2784))
<<<<<<< HEAD
>>>>>>> 416a95a4c0 (GEOMESA-3100 Kafka layer views (#2784))
=======
=======
=======
=======
import org.locationtech.geomesa.index.FlushableFeatureWriter
>>>>>>> 3be8d2a5a (Merge branch 'feature/postgis-fixes')
>>>>>>> db8d998aa (Merge branch 'feature/postgis-fixes')
<<<<<<< HEAD
<<<<<<< HEAD
>>>>>>> cb6bda89b6 (Merge branch 'feature/postgis-fixes')
<<<<<<< HEAD
>>>>>>> 26e5afc4ea (Merge branch 'feature/postgis-fixes')
=======
=======
=======
import org.locationtech.geomesa.index.FlushableFeatureWriter
>>>>>>> d845d7c1b (GEOMESA-3254 Add Bloop build support)
<<<<<<< HEAD
<<<<<<< HEAD
>>>>>>> 09d87762c5 (GEOMESA-3254 Add Bloop build support)
<<<<<<< HEAD
>>>>>>> 63a045a753 (GEOMESA-3254 Add Bloop build support)
=======
=======
=======
import org.locationtech.geomesa.index.FlushableFeatureWriter
=======
>>>>>>> af0a88eb1 (GEOMESA-3100 Kafka layer views (#2784))
>>>>>>> 17f13b3a7 (GEOMESA-3100 Kafka layer views (#2784))
<<<<<<< HEAD
<<<<<<< HEAD
>>>>>>> 6069aba6b4 (GEOMESA-3100 Kafka layer views (#2784))
<<<<<<< HEAD
>>>>>>> ccfb3bd95e (GEOMESA-3100 Kafka layer views (#2784))
=======
=======
=======
>>>>>>> f6e840b5d (GEOMESA-3100 Kafka layer views (#2784))
<<<<<<< HEAD
<<<<<<< HEAD
>>>>>>> 4480b2d1b9 (GEOMESA-3100 Kafka layer views (#2784))
<<<<<<< HEAD
>>>>>>> b5abc19ca4 (GEOMESA-3100 Kafka layer views (#2784))
=======
=======
=======
>>>>>>> c589b832a (GEOMESA-3100 Kafka layer views (#2784))
<<<<<<< HEAD
<<<<<<< HEAD
>>>>>>> 9e433ba57e (GEOMESA-3100 Kafka layer views (#2784))
<<<<<<< HEAD
>>>>>>> 2750a5beef (GEOMESA-3100 Kafka layer views (#2784))
=======
=======
=======
=======
>>>>>>> d0dc799ff (GEOMESA-3100 Kafka layer views (#2784))
>>>>>>> ffbc2ce32 (GEOMESA-3100 Kafka layer views (#2784))
<<<<<<< HEAD
<<<<<<< HEAD
>>>>>>> 2df2640494 (GEOMESA-3100 Kafka layer views (#2784))
<<<<<<< HEAD
>>>>>>> cb4aa55ae3 (GEOMESA-3100 Kafka layer views (#2784))
=======
=======
=======
>>>>>>> fa68dd43c (GEOMESA-3100 Kafka layer views (#2784))
<<<<<<< HEAD
<<<<<<< HEAD
>>>>>>> 23f312535d (GEOMESA-3100 Kafka layer views (#2784))
<<<<<<< HEAD
>>>>>>> 468da42855 (GEOMESA-3100 Kafka layer views (#2784))
=======
=======
=======
=======
>>>>>>> 936154130 (GEOMESA-3100 Kafka layer views (#2784))
>>>>>>> 54ece16d1 (GEOMESA-3100 Kafka layer views (#2784))
<<<<<<< HEAD
<<<<<<< HEAD
>>>>>>> 826636f69d (GEOMESA-3100 Kafka layer views (#2784))
<<<<<<< HEAD
>>>>>>> 5dd3eb3a6d (GEOMESA-3100 Kafka layer views (#2784))
=======
=======
=======
>>>>>>> c57b5f538 (GEOMESA-3100 Kafka layer views (#2784))
<<<<<<< HEAD
<<<<<<< HEAD
>>>>>>> 1e11ed51a6 (GEOMESA-3100 Kafka layer views (#2784))
<<<<<<< HEAD
>>>>>>> d530f7b24a (GEOMESA-3100 Kafka layer views (#2784))
=======
=======
=======
>>>>>>> 88ef67cdf (GEOMESA-3100 Kafka layer views (#2784))
<<<<<<< HEAD
<<<<<<< HEAD
>>>>>>> 976f319530 (GEOMESA-3100 Kafka layer views (#2784))
<<<<<<< HEAD
>>>>>>> 5e230912b1 (GEOMESA-3100 Kafka layer views (#2784))
=======
=======
=======
>>>>>>> 89fb9950e (GEOMESA-3100 Kafka layer views (#2784))
<<<<<<< HEAD
<<<<<<< HEAD
>>>>>>> bc97b07a31 (GEOMESA-3100 Kafka layer views (#2784))
<<<<<<< HEAD
>>>>>>> f340d6feab (GEOMESA-3100 Kafka layer views (#2784))
=======
=======
=======
=======
import org.locationtech.geomesa.index.FlushableFeatureWriter
>>>>>>> 3be8d2a5a (Merge branch 'feature/postgis-fixes')
>>>>>>> 1b25d7ddb (Merge branch 'feature/postgis-fixes')
>>>>>>> 699117eca9 (Merge branch 'feature/postgis-fixes')
>>>>>>> c69897d7bd (Merge branch 'feature/postgis-fixes')
=======
import org.locationtech.geomesa.index.FlushableFeatureWriter
=======
>>>>>>> af0a88eb1 (GEOMESA-3100 Kafka layer views (#2784))
>>>>>>> 337ecd16e5 (GEOMESA-3100 Kafka layer views (#2784))
<<<<<<< HEAD
=======
>>>>>>> 58286bfd3 (GEOMESA-3100 Kafka layer views (#2784))
>>>>>>> 5ca0cd6de (GEOMESA-3100 Kafka layer views (#2784))
>>>>>>> 64646d61ed (GEOMESA-3100 Kafka layer views (#2784))
=======
=======
>>>>>>> 0e42c51dc0 (GEOMESA-3100 Kafka layer views (#2784))
=======
>>>>>>> 626c8f9b93 (GEOMESA-3100 Kafka layer views (#2784))
=======
=======
>>>>>>> 2f6607232 (GEOMESA-3100 Kafka layer views (#2784))
>>>>>>> 9a5d6d2815 (GEOMESA-3100 Kafka layer views (#2784))
=======
>>>>>>> ea3b40e18 (GEOMESA-3100 Kafka layer views (#2784))
=======
import org.locationtech.geomesa.index.FlushableFeatureWriter
=======
>>>>>>> af0a88eb1 (GEOMESA-3100 Kafka layer views (#2784))
>>>>>>> bddfdbea5 (GEOMESA-3100 Kafka layer views (#2784))
<<<<<<< HEAD
<<<<<<< HEAD
<<<<<<< HEAD
>>>>>>> 12fe94b860 (GEOMESA-3100 Kafka layer views (#2784))
=======
=======
>>>>>>> 9a5d6d2815 (GEOMESA-3100 Kafka layer views (#2784))
=======
>>>>>>> f4b2369e9a (GEOMESA-3100 Kafka layer views (#2784))
=======
>>>>>>> d0dc799ff (GEOMESA-3100 Kafka layer views (#2784))
<<<<<<< HEAD
>>>>>>> 0e42c51dc0 (GEOMESA-3100 Kafka layer views (#2784))
=======
=======
import org.locationtech.geomesa.index.FlushableFeatureWriter
=======
>>>>>>> af0a88eb1 (GEOMESA-3100 Kafka layer views (#2784))
>>>>>>> 95c83ca7f (GEOMESA-3100 Kafka layer views (#2784))
<<<<<<< HEAD
>>>>>>> 19aa61c0de (GEOMESA-3100 Kafka layer views (#2784))
=======
=======
>>>>>>> 936154130 (GEOMESA-3100 Kafka layer views (#2784))
<<<<<<< HEAD
>>>>>>> 626c8f9b93 (GEOMESA-3100 Kafka layer views (#2784))
=======
=======
>>>>>>> 2f6607232 (GEOMESA-3100 Kafka layer views (#2784))
<<<<<<< HEAD
>>>>>>> 9a5d6d2815 (GEOMESA-3100 Kafka layer views (#2784))
=======
=======
=======
>>>>>>> d0dc799ff (GEOMESA-3100 Kafka layer views (#2784))
>>>>>>> ea3b40e18 (GEOMESA-3100 Kafka layer views (#2784))
<<<<<<< HEAD
>>>>>>> f4b2369e9a (GEOMESA-3100 Kafka layer views (#2784))
=======
=======
import org.locationtech.geomesa.index.FlushableFeatureWriter
=======
>>>>>>> af0a88eb1 (GEOMESA-3100 Kafka layer views (#2784))
>>>>>>> d2cb939f5 (GEOMESA-3100 Kafka layer views (#2784))
<<<<<<< HEAD
>>>>>>> 305a9263eb (GEOMESA-3100 Kafka layer views (#2784))
=======
=======
import org.locationtech.geomesa.index.FlushableFeatureWriter
>>>>>>> 3be8d2a5a (Merge branch 'feature/postgis-fixes')
>>>>>>> da00c7bd68 (Merge branch 'feature/postgis-fixes')
=======
import org.locationtech.geomesa.index.FlushableFeatureWriter
=======
<<<<<<< HEAD
>>>>>>> af0a88eb17 (GEOMESA-3100 Kafka layer views (#2784))
<<<<<<< HEAD
>>>>>>> c860f21098 (GEOMESA-3100 Kafka layer views (#2784))
=======
=======
>>>>>>> af0a88eb1 (GEOMESA-3100 Kafka layer views (#2784))
>>>>>>> f7038468b7 (GEOMESA-3100 Kafka layer views (#2784))
>>>>>>> 984dd84de9 (GEOMESA-3100 Kafka layer views (#2784))
=======
>>>>>>> 770d928c15 (GEOMESA-3100 Kafka layer views (#2784))
=======
>>>>>>> bddfdbea54 (GEOMESA-3100 Kafka layer views (#2784))
>>>>>>> 5dc1f86700 (GEOMESA-3100 Kafka layer views (#2784))
=======
>>>>>>> d0dc799ff1 (GEOMESA-3100 Kafka layer views (#2784))
<<<<<<< HEAD
>>>>>>> 808743e257 (GEOMESA-3100 Kafka layer views (#2784))
=======
=======
import org.locationtech.geomesa.index.FlushableFeatureWriter
=======
>>>>>>> af0a88eb1 (GEOMESA-3100 Kafka layer views (#2784))
>>>>>>> 95c83ca7fa (GEOMESA-3100 Kafka layer views (#2784))
<<<<<<< HEAD
>>>>>>> ad0d29873e (GEOMESA-3100 Kafka layer views (#2784))
=======
=======
>>>>>>> 58286bfd3 (GEOMESA-3100 Kafka layer views (#2784))
>>>>>>> 5ca0cd6de (GEOMESA-3100 Kafka layer views (#2784))
>>>>>>> 9361541304 (GEOMESA-3100 Kafka layer views (#2784))
>>>>>>> 0a0bf0292e (GEOMESA-3100 Kafka layer views (#2784))
=======
>>>>>>> 2f66072323 (GEOMESA-3100 Kafka layer views (#2784))
>>>>>>> f43f8303d3 (GEOMESA-3100 Kafka layer views (#2784))
=======
>>>>>>> 2f66072323 (GEOMESA-3100 Kafka layer views (#2784))
=======
=======
>>>>>>> d0dc799ff (GEOMESA-3100 Kafka layer views (#2784))
>>>>>>> ea3b40e187 (GEOMESA-3100 Kafka layer views (#2784))
<<<<<<< HEAD
>>>>>>> 6368ee48e8 (GEOMESA-3100 Kafka layer views (#2784))
=======
=======
import org.locationtech.geomesa.index.FlushableFeatureWriter
=======
>>>>>>> af0a88eb1 (GEOMESA-3100 Kafka layer views (#2784))
>>>>>>> d2cb939f51 (GEOMESA-3100 Kafka layer views (#2784))
<<<<<<< HEAD
>>>>>>> 4516873dab (GEOMESA-3100 Kafka layer views (#2784))
=======
=======
import org.locationtech.geomesa.index.FlushableFeatureWriter
>>>>>>> 3be8d2a5a4 (Merge branch 'feature/postgis-fixes')
<<<<<<< HEAD
>>>>>>> 34472778d3 (Merge branch 'feature/postgis-fixes')
=======
=======
import org.locationtech.geomesa.index.FlushableFeatureWriter
=======
>>>>>>> af0a88eb1 (GEOMESA-3100 Kafka layer views (#2784))
>>>>>>> a0314fb7ff (GEOMESA-3100 Kafka layer views (#2784))
>>>>>>> 8ec26b8c2a (GEOMESA-3100 Kafka layer views (#2784))
=======
>>>>>>> 58286bfd3 (GEOMESA-3100 Kafka layer views (#2784))
>>>>>>> 5ca0cd6de (GEOMESA-3100 Kafka layer views (#2784))
>>>>>>> 9236b02087 (GEOMESA-3100 Kafka layer views (#2784))
>>>>>>> 4b0dd3e513 (GEOMESA-3100 Kafka layer views (#2784))
=======
>>>>>>> 6e453fd3d0 (GEOMESA-3100 Kafka layer views (#2784))
=======
>>>>>>> f187a4fcf9 (GEOMESA-3100 Kafka layer views (#2784))
=======
=======
>>>>>>> 95c83ca7f (GEOMESA-3100 Kafka layer views (#2784))
<<<<<<< HEAD
>>>>>>> 4231e686dd (GEOMESA-3100 Kafka layer views (#2784))
<<<<<<< HEAD
>>>>>>> d309fbbbbf (GEOMESA-3100 Kafka layer views (#2784))
=======
=======
=======
>>>>>>> 936154130 (GEOMESA-3100 Kafka layer views (#2784))
<<<<<<< HEAD
>>>>>>> ac0357d362 (GEOMESA-3100 Kafka layer views (#2784))
<<<<<<< HEAD
>>>>>>> d76a495d83 (GEOMESA-3100 Kafka layer views (#2784))
=======
=======
=======
>>>>>>> 2f6607232 (GEOMESA-3100 Kafka layer views (#2784))
>>>>>>> a62b956fb6 (GEOMESA-3100 Kafka layer views (#2784))
>>>>>>> bbc8576d19 (GEOMESA-3100 Kafka layer views (#2784))
=======
>>>>>>> a62b956fb6 (GEOMESA-3100 Kafka layer views (#2784))
=======
=======
=======
>>>>>>> d0dc799ff (GEOMESA-3100 Kafka layer views (#2784))
>>>>>>> ea3b40e18 (GEOMESA-3100 Kafka layer views (#2784))
<<<<<<< HEAD
>>>>>>> 4adaa7f479 (GEOMESA-3100 Kafka layer views (#2784))
<<<<<<< HEAD
>>>>>>> d3b123117a (GEOMESA-3100 Kafka layer views (#2784))
=======
=======
=======
import org.locationtech.geomesa.index.FlushableFeatureWriter
=======
>>>>>>> af0a88eb1 (GEOMESA-3100 Kafka layer views (#2784))
>>>>>>> d2cb939f5 (GEOMESA-3100 Kafka layer views (#2784))
<<<<<<< HEAD
>>>>>>> 6af71ff432 (GEOMESA-3100 Kafka layer views (#2784))
<<<<<<< HEAD
>>>>>>> 885048dd7d (GEOMESA-3100 Kafka layer views (#2784))
=======
=======
=======
import org.locationtech.geomesa.index.FlushableFeatureWriter
>>>>>>> 3be8d2a5a (Merge branch 'feature/postgis-fixes')
>>>>>>> db8d998aa2 (Merge branch 'feature/postgis-fixes')
<<<<<<< HEAD
>>>>>>> 42e8565e9b (Merge branch 'feature/postgis-fixes')
=======
=======
import org.locationtech.geomesa.index.FlushableFeatureWriter
>>>>>>> d845d7c1bd (GEOMESA-3254 Add Bloop build support)
<<<<<<< HEAD
>>>>>>> f1532f2313 (GEOMESA-3254 Add Bloop build support)
=======
=======
import org.locationtech.geomesa.index.FlushableFeatureWriter
=======
>>>>>>> af0a88eb1 (GEOMESA-3100 Kafka layer views (#2784))
>>>>>>> 17f13b3a7a (GEOMESA-3100 Kafka layer views (#2784))
<<<<<<< HEAD
>>>>>>> 3010fc384e (GEOMESA-3100 Kafka layer views (#2784))
=======
=======
>>>>>>> 58286bfd3 (GEOMESA-3100 Kafka layer views (#2784))
>>>>>>> 5ca0cd6de (GEOMESA-3100 Kafka layer views (#2784))
>>>>>>> f6e840b5dd (GEOMESA-3100 Kafka layer views (#2784))
<<<<<<< HEAD
>>>>>>> 1c99a27679 (GEOMESA-3100 Kafka layer views (#2784))
=======
=======
>>>>>>> bddfdbea5 (GEOMESA-3100 Kafka layer views (#2784))
>>>>>>> c589b832a5 (GEOMESA-3100 Kafka layer views (#2784))
>>>>>>> 92dc7a8411 (GEOMESA-3100 Kafka layer views (#2784))
=======
>>>>>>> 2766fc9b5b (GEOMESA-3100 Kafka layer views (#2784))
=======
=======
>>>>>>> 95c83ca7f (GEOMESA-3100 Kafka layer views (#2784))
>>>>>>> fa68dd43c6 (GEOMESA-3100 Kafka layer views (#2784))
>>>>>>> de8804123e (GEOMESA-3100 Kafka layer views (#2784))
=======
>>>>>>> 2f673a268a (GEOMESA-3100 Kafka layer views (#2784))
=======
>>>>>>> c44e474495 (GEOMESA-3100 Kafka layer views (#2784))
=======
=======
>>>>>>> 88ef67cdfe (GEOMESA-3100 Kafka layer views (#2784))
>>>>>>> c2a94543ba (GEOMESA-3100 Kafka layer views (#2784))
=======
>>>>>>> 117b13aaaa (GEOMESA-3100 Kafka layer views (#2784))
=======
>>>>>>> 67de3c3202 (Merge branch 'feature/postgis-fixes')
=======
=======
>>>>>>> eecabb92a (GEOMESA-3100 Kafka layer views (#2784))
<<<<<<< HEAD
>>>>>>> 98e7bf59d2 (GEOMESA-3100 Kafka layer views (#2784))
<<<<<<< HEAD
>>>>>>> cf457d8543 (GEOMESA-3100 Kafka layer views (#2784))
=======
=======
=======
>>>>>>> 581f1dd15 (GEOMESA-3100 Kafka layer views (#2784))
>>>>>>> e24613dc4a (GEOMESA-3100 Kafka layer views (#2784))
>>>>>>> 0cd029fb3b (GEOMESA-3100 Kafka layer views (#2784))
=======
>>>>>>> dae1cf3cef (GEOMESA-3100 Kafka layer views (#2784))
>>>>>>> c61bffed00 (GEOMESA-3100 Kafka layer views (#2784))
=======
>>>>>>> 50a71079c1 (GEOMESA-3100 Kafka layer views (#2784))
>>>>>>> 12f226f36d (GEOMESA-3100 Kafka layer views (#2784))
=======
>>>>>>> 9e910620b3 (GEOMESA-3100 Kafka layer views (#2784))
>>>>>>> 89f0c9f2c3 (GEOMESA-3100 Kafka layer views (#2784))
=======
>>>>>>> 4c325746bd (GEOMESA-3100 Kafka layer views (#2784))
>>>>>>> 222e44653b (GEOMESA-3100 Kafka layer views (#2784))
=======
>>>>>>> 3ebcdb99d9 (GEOMESA-3100 Kafka layer views (#2784))
>>>>>>> 4f4ecaeb43 (GEOMESA-3100 Kafka layer views (#2784))
=======
>>>>>>> fdf51402cf (GEOMESA-3100 Kafka layer views (#2784))
>>>>>>> b4cd5a7733 (GEOMESA-3100 Kafka layer views (#2784))
=======
>>>>>>> a377061090 (GEOMESA-3100 Kafka layer views (#2784))
>>>>>>> 750ebbabe7 (GEOMESA-3100 Kafka layer views (#2784))
=======
>>>>>>> e944f1c88b (Merge branch 'feature/postgis-fixes')
>>>>>>> 638b68d081 (Merge branch 'feature/postgis-fixes')
=======
=======
>>>>>>> 65e544d20e (GEOMESA-3100 Kafka layer views (#2784))
>>>>>>> 8ed2c9f7e5 (GEOMESA-3100 Kafka layer views (#2784))
<<<<<<< HEAD
>>>>>>> eddb4eaca1 (GEOMESA-3100 Kafka layer views (#2784))
<<<<<<< HEAD
>>>>>>> fc4546247e (GEOMESA-3100 Kafka layer views (#2784))
=======
=======
=======
=======
>>>>>>> 9236b0208 (GEOMESA-3100 Kafka layer views (#2784))
=======
>>>>>>> c64e652363 (GEOMESA-3100 Kafka layer views (#2784))
>>>>>>> c1d0543aac (GEOMESA-3100 Kafka layer views (#2784))
<<<<<<< HEAD
>>>>>>> be0c9d161a (GEOMESA-3100 Kafka layer views (#2784))
<<<<<<< HEAD
>>>>>>> 65e544d20e (GEOMESA-3100 Kafka layer views (#2784))
=======
=======
=======
=======
>>>>>>> 862857ce2 (GEOMESA-3100 Kafka layer views (#2784))
=======
>>>>>>> 02eb81c815 (GEOMESA-3100 Kafka layer views (#2784))
>>>>>>> 8b9e99d11a (GEOMESA-3100 Kafka layer views (#2784))
<<<<<<< HEAD
>>>>>>> 7bdc1feea8 (GEOMESA-3100 Kafka layer views (#2784))
<<<<<<< HEAD
>>>>>>> c64e652363 (GEOMESA-3100 Kafka layer views (#2784))
=======
=======
=======
=======
=======
>>>>>>> d0dc799ff (GEOMESA-3100 Kafka layer views (#2784))
>>>>>>> 28427dfd8 (GEOMESA-3100 Kafka layer views (#2784))
=======
>>>>>>> 43ac4062d9 (GEOMESA-3100 Kafka layer views (#2784))
>>>>>>> 614fcb6bc3 (GEOMESA-3100 Kafka layer views (#2784))
<<<<<<< HEAD
>>>>>>> 9b15c8e14c (GEOMESA-3100 Kafka layer views (#2784))
<<<<<<< HEAD
>>>>>>> 02eb81c815 (GEOMESA-3100 Kafka layer views (#2784))
=======
=======
=======
=======
>>>>>>> 4231e686d (GEOMESA-3100 Kafka layer views (#2784))
=======
>>>>>>> 30905e530b (GEOMESA-3100 Kafka layer views (#2784))
>>>>>>> 69e3273ac1 (GEOMESA-3100 Kafka layer views (#2784))
<<<<<<< HEAD
>>>>>>> 3977ecc140 (GEOMESA-3100 Kafka layer views (#2784))
<<<<<<< HEAD
>>>>>>> 43ac4062d9 (GEOMESA-3100 Kafka layer views (#2784))
=======
=======
=======
=======
=======
>>>>>>> 936154130 (GEOMESA-3100 Kafka layer views (#2784))
>>>>>>> ac0357d36 (GEOMESA-3100 Kafka layer views (#2784))
=======
>>>>>>> 121a1d3470 (GEOMESA-3100 Kafka layer views (#2784))
>>>>>>> 04f82bbc57 (GEOMESA-3100 Kafka layer views (#2784))
<<<<<<< HEAD
>>>>>>> 495a1efc9f (GEOMESA-3100 Kafka layer views (#2784))
<<<<<<< HEAD
>>>>>>> 30905e530b (GEOMESA-3100 Kafka layer views (#2784))
=======
=======
=======
=======
>>>>>>> a62b956fb (GEOMESA-3100 Kafka layer views (#2784))
=======
>>>>>>> 297ca0be9c (GEOMESA-3100 Kafka layer views (#2784))
>>>>>>> e0773a1bd7 (GEOMESA-3100 Kafka layer views (#2784))
<<<<<<< HEAD
>>>>>>> 5d8c5baea0 (GEOMESA-3100 Kafka layer views (#2784))
<<<<<<< HEAD
>>>>>>> 121a1d3470 (GEOMESA-3100 Kafka layer views (#2784))
=======
=======
=======
=======
>>>>>>> 4adaa7f47 (GEOMESA-3100 Kafka layer views (#2784))
=======
>>>>>>> 39d28fffcb (GEOMESA-3100 Kafka layer views (#2784))
>>>>>>> ae5eea67f1 (GEOMESA-3100 Kafka layer views (#2784))
<<<<<<< HEAD
>>>>>>> 7628960f66 (GEOMESA-3100 Kafka layer views (#2784))
<<<<<<< HEAD
>>>>>>> 297ca0be9c (GEOMESA-3100 Kafka layer views (#2784))
=======
=======
=======
=======
>>>>>>> 6af71ff43 (GEOMESA-3100 Kafka layer views (#2784))
=======
>>>>>>> 71adb695c5 (Merge branch 'feature/postgis-fixes')
>>>>>>> 23a7d9849f (GEOMESA-3100 Kafka layer views (#2784))
<<<<<<< HEAD
>>>>>>> 416a95a4c0 (GEOMESA-3100 Kafka layer views (#2784))
<<<<<<< HEAD
>>>>>>> 39d28fffcb (GEOMESA-3100 Kafka layer views (#2784))
=======
=======
=======
=======
=======
import org.locationtech.geomesa.index.FlushableFeatureWriter
>>>>>>> 3be8d2a5a (Merge branch 'feature/postgis-fixes')
>>>>>>> db8d998aa (Merge branch 'feature/postgis-fixes')
=======
>>>>>>> 5a4c24e020 (GEOMESA-3254 Add Bloop build support)
>>>>>>> cb6bda89b6 (Merge branch 'feature/postgis-fixes')
<<<<<<< HEAD
>>>>>>> 26e5afc4ea (Merge branch 'feature/postgis-fixes')
<<<<<<< HEAD
>>>>>>> 71adb695c5 (Merge branch 'feature/postgis-fixes')
=======
=======
=======
=======
import org.locationtech.geomesa.index.FlushableFeatureWriter
>>>>>>> d845d7c1b (GEOMESA-3254 Add Bloop build support)
=======
>>>>>>> d4039e3d9a (GEOMESA-3100 Kafka layer views (#2784))
>>>>>>> 09d87762c5 (GEOMESA-3254 Add Bloop build support)
<<<<<<< HEAD
>>>>>>> 63a045a753 (GEOMESA-3254 Add Bloop build support)
<<<<<<< HEAD
>>>>>>> 5a4c24e020 (GEOMESA-3254 Add Bloop build support)
=======
=======
=======
=======
import org.locationtech.geomesa.index.FlushableFeatureWriter
=======
>>>>>>> af0a88eb1 (GEOMESA-3100 Kafka layer views (#2784))
>>>>>>> 17f13b3a7 (GEOMESA-3100 Kafka layer views (#2784))
=======
>>>>>>> 0d5f6377de (GEOMESA-3100 Kafka layer views (#2784))
>>>>>>> 6069aba6b4 (GEOMESA-3100 Kafka layer views (#2784))
<<<<<<< HEAD
>>>>>>> ccfb3bd95e (GEOMESA-3100 Kafka layer views (#2784))
<<<<<<< HEAD
>>>>>>> d4039e3d9a (GEOMESA-3100 Kafka layer views (#2784))
=======
=======
=======
=======
>>>>>>> f6e840b5d (GEOMESA-3100 Kafka layer views (#2784))
=======
>>>>>>> 41df6a2aa3 (GEOMESA-3100 Kafka layer views (#2784))
>>>>>>> 4480b2d1b9 (GEOMESA-3100 Kafka layer views (#2784))
<<<<<<< HEAD
>>>>>>> b5abc19ca4 (GEOMESA-3100 Kafka layer views (#2784))
<<<<<<< HEAD
>>>>>>> 0d5f6377de (GEOMESA-3100 Kafka layer views (#2784))
=======
=======
=======
=======
>>>>>>> c589b832a (GEOMESA-3100 Kafka layer views (#2784))
=======
>>>>>>> fb32a36e0e (GEOMESA-3100 Kafka layer views (#2784))
>>>>>>> 9e433ba57e (GEOMESA-3100 Kafka layer views (#2784))
<<<<<<< HEAD
>>>>>>> 2750a5beef (GEOMESA-3100 Kafka layer views (#2784))
<<<<<<< HEAD
>>>>>>> 41df6a2aa3 (GEOMESA-3100 Kafka layer views (#2784))
=======
=======
=======
=======
=======
>>>>>>> d0dc799ff (GEOMESA-3100 Kafka layer views (#2784))
>>>>>>> ffbc2ce32 (GEOMESA-3100 Kafka layer views (#2784))
=======
>>>>>>> 340134cdda (GEOMESA-3100 Kafka layer views (#2784))
>>>>>>> 2df2640494 (GEOMESA-3100 Kafka layer views (#2784))
<<<<<<< HEAD
>>>>>>> cb4aa55ae3 (GEOMESA-3100 Kafka layer views (#2784))
<<<<<<< HEAD
>>>>>>> fb32a36e0e (GEOMESA-3100 Kafka layer views (#2784))
=======
=======
=======
=======
>>>>>>> fa68dd43c (GEOMESA-3100 Kafka layer views (#2784))
=======
>>>>>>> ea8384d9b7 (GEOMESA-3100 Kafka layer views (#2784))
>>>>>>> 23f312535d (GEOMESA-3100 Kafka layer views (#2784))
<<<<<<< HEAD
>>>>>>> 468da42855 (GEOMESA-3100 Kafka layer views (#2784))
<<<<<<< HEAD
>>>>>>> 340134cdda (GEOMESA-3100 Kafka layer views (#2784))
=======
=======
=======
=======
=======
>>>>>>> 936154130 (GEOMESA-3100 Kafka layer views (#2784))
>>>>>>> 54ece16d1 (GEOMESA-3100 Kafka layer views (#2784))
=======
>>>>>>> fe3378ccaa (GEOMESA-3100 Kafka layer views (#2784))
>>>>>>> 826636f69d (GEOMESA-3100 Kafka layer views (#2784))
<<<<<<< HEAD
>>>>>>> 5dd3eb3a6d (GEOMESA-3100 Kafka layer views (#2784))
<<<<<<< HEAD
>>>>>>> ea8384d9b7 (GEOMESA-3100 Kafka layer views (#2784))
=======
=======
=======
=======
>>>>>>> c57b5f538 (GEOMESA-3100 Kafka layer views (#2784))
=======
>>>>>>> 79f56900f0 (GEOMESA-3100 Kafka layer views (#2784))
>>>>>>> 1e11ed51a6 (GEOMESA-3100 Kafka layer views (#2784))
<<<<<<< HEAD
>>>>>>> d530f7b24a (GEOMESA-3100 Kafka layer views (#2784))
<<<<<<< HEAD
>>>>>>> fe3378ccaa (GEOMESA-3100 Kafka layer views (#2784))
=======
=======
=======
=======
>>>>>>> 88ef67cdf (GEOMESA-3100 Kafka layer views (#2784))
=======
>>>>>>> 72ec0b2107 (GEOMESA-3100 Kafka layer views (#2784))
>>>>>>> 976f319530 (GEOMESA-3100 Kafka layer views (#2784))
<<<<<<< HEAD
>>>>>>> 5e230912b1 (GEOMESA-3100 Kafka layer views (#2784))
<<<<<<< HEAD
>>>>>>> 79f56900f0 (GEOMESA-3100 Kafka layer views (#2784))
=======
=======
=======
=======
>>>>>>> 89fb9950e (GEOMESA-3100 Kafka layer views (#2784))
=======
>>>>>>> 30559ea5c9 (Merge branch 'feature/postgis-fixes')
>>>>>>> bc97b07a31 (GEOMESA-3100 Kafka layer views (#2784))
<<<<<<< HEAD
>>>>>>> f340d6feab (GEOMESA-3100 Kafka layer views (#2784))
<<<<<<< HEAD
>>>>>>> 72ec0b2107 (GEOMESA-3100 Kafka layer views (#2784))
=======
=======
=======
=======
=======
import org.locationtech.geomesa.index.FlushableFeatureWriter
>>>>>>> 3be8d2a5a (Merge branch 'feature/postgis-fixes')
>>>>>>> 1b25d7ddb (Merge branch 'feature/postgis-fixes')
>>>>>>> 699117eca9 (Merge branch 'feature/postgis-fixes')
>>>>>>> c69897d7bd (Merge branch 'feature/postgis-fixes')
>>>>>>> 30559ea5c9 (Merge branch 'feature/postgis-fixes')
=======
>>>>>>> ad362b1341 (GEOMESA-3100 Kafka layer views (#2784))
import org.locationtech.geomesa.index.geotools.GeoMesaDataStoreFactory.NamespaceConfig
import org.locationtech.geomesa.index.geotools.{GeoMesaFeatureReader, MetadataBackedDataStore}
import org.locationtech.geomesa.index.metadata.GeoMesaMetadata
import org.locationtech.geomesa.index.stats.{GeoMesaStats, HasGeoMesaStats, RunnableStats}
import org.locationtech.geomesa.index.utils.LocalLocking
import org.locationtech.geomesa.kafka.consumer.ThreadedConsumer.ConsumerErrorHandler
import org.locationtech.geomesa.kafka.data.KafkaCacheLoader.KafkaCacheLoaderImpl
import org.locationtech.geomesa.kafka.data.KafkaDataStore.KafkaDataStoreConfig
import org.locationtech.geomesa.kafka.data.KafkaFeatureWriter._
import org.locationtech.geomesa.kafka.index._
import org.locationtech.geomesa.kafka.utils.GeoMessageProcessor
import org.locationtech.geomesa.kafka.utils.GeoMessageProcessor.GeoMessageConsumer
import org.locationtech.geomesa.kafka.utils.GeoMessageSerializer.{GeoMessagePartitioner, GeoMessageSerializerFactory}
import org.locationtech.geomesa.kafka.versions.KafkaConsumerVersions
import org.locationtech.geomesa.memory.cqengine.utils.CQIndexType.CQIndexType
import org.locationtech.geomesa.metrics.core.GeoMesaMetrics
import org.locationtech.geomesa.security.AuthorizationsProvider
import org.locationtech.geomesa.utils.audit.{AuditProvider, AuditWriter}
import org.locationtech.geomesa.utils.conf.GeoMesaSystemProperties.SystemProperty
import org.locationtech.geomesa.utils.geotools.SimpleFeatureTypes.Configs.TableSharing
import org.locationtech.geomesa.utils.geotools.SimpleFeatureTypes.InternalConfigs.TableSharingPrefix
import org.locationtech.geomesa.utils.geotools.Transform.Transforms
import org.locationtech.geomesa.utils.geotools.{SimpleFeatureTypes, Transform}
import org.locationtech.geomesa.utils.io.{CloseWithLogging, WithClose}
import org.locationtech.geomesa.utils.zk.ZookeeperLocking

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
<<<<<<< HEAD
<<<<<<< HEAD
<<<<<<< HEAD
<<<<<<< HEAD
<<<<<<< HEAD
=======
=======
>>>>>>> d0dc799ff1 (GEOMESA-3100 Kafka layer views (#2784))
>>>>>>> 808743e257 (GEOMESA-3100 Kafka layer views (#2784))
=======
>>>>>>> 5dc1f86700 (GEOMESA-3100 Kafka layer views (#2784))
=======
=======
>>>>>>> 19aa61c0de (GEOMESA-3100 Kafka layer views (#2784))
=======
>>>>>>> 626c8f9b93 (GEOMESA-3100 Kafka layer views (#2784))
=======
>>>>>>> 9a5d6d2815 (GEOMESA-3100 Kafka layer views (#2784))
=======
>>>>>>> f4b2369e9a (GEOMESA-3100 Kafka layer views (#2784))
=======
>>>>>>> 305a9263eb (GEOMESA-3100 Kafka layer views (#2784))
=======
>>>>>>> da00c7bd68 (Merge branch 'feature/postgis-fixes')
=======
>>>>>>> d0dc799ff (GEOMESA-3100 Kafka layer views (#2784))
>>>>>>> 0e42c51dc0 (GEOMESA-3100 Kafka layer views (#2784))
=======
<<<<<<< HEAD
>>>>>>> 12fe94b860 (GEOMESA-3100 Kafka layer views (#2784))
=======
>>>>>>> ad0d29873e (GEOMESA-3100 Kafka layer views (#2784))
=======
>>>>>>> 0a0bf0292e (GEOMESA-3100 Kafka layer views (#2784))
=======
>>>>>>> f43f8303d3 (GEOMESA-3100 Kafka layer views (#2784))
=======
>>>>>>> 6368ee48e8 (GEOMESA-3100 Kafka layer views (#2784))
=======
>>>>>>> 4516873dab (GEOMESA-3100 Kafka layer views (#2784))
=======
>>>>>>> 34472778d3 (Merge branch 'feature/postgis-fixes')
=======
>>>>>>> 8ec26b8c2a (GEOMESA-3100 Kafka layer views (#2784))
=======
>>>>>>> 4b0dd3e513 (GEOMESA-3100 Kafka layer views (#2784))
=======
>>>>>>> 6e453fd3d0 (GEOMESA-3100 Kafka layer views (#2784))
=======
>>>>>>> f187a4fcf9 (GEOMESA-3100 Kafka layer views (#2784))
=======
>>>>>>> d309fbbbbf (GEOMESA-3100 Kafka layer views (#2784))
=======
>>>>>>> d76a495d83 (GEOMESA-3100 Kafka layer views (#2784))
=======
>>>>>>> bbc8576d19 (GEOMESA-3100 Kafka layer views (#2784))
=======
>>>>>>> d3b123117a (GEOMESA-3100 Kafka layer views (#2784))
=======
>>>>>>> 885048dd7d (GEOMESA-3100 Kafka layer views (#2784))
=======
>>>>>>> 42e8565e9b (Merge branch 'feature/postgis-fixes')
=======
>>>>>>> f1532f2313 (GEOMESA-3254 Add Bloop build support)
=======
>>>>>>> 3010fc384e (GEOMESA-3100 Kafka layer views (#2784))
=======
>>>>>>> 1c99a27679 (GEOMESA-3100 Kafka layer views (#2784))
=======
>>>>>>> 92dc7a8411 (GEOMESA-3100 Kafka layer views (#2784))
=======
>>>>>>> 2766fc9b5b (GEOMESA-3100 Kafka layer views (#2784))
=======
>>>>>>> de8804123e (GEOMESA-3100 Kafka layer views (#2784))
=======
>>>>>>> 2f673a268a (GEOMESA-3100 Kafka layer views (#2784))
=======
>>>>>>> c44e474495 (GEOMESA-3100 Kafka layer views (#2784))
=======
>>>>>>> c2a94543ba (GEOMESA-3100 Kafka layer views (#2784))
=======
>>>>>>> 117b13aaaa (GEOMESA-3100 Kafka layer views (#2784))
=======
>>>>>>> 67de3c3202 (Merge branch 'feature/postgis-fixes')
=======
>>>>>>> cf457d8543 (GEOMESA-3100 Kafka layer views (#2784))
=======
>>>>>>> 0cd029fb3b (GEOMESA-3100 Kafka layer views (#2784))
=======
>>>>>>> c61bffed00 (GEOMESA-3100 Kafka layer views (#2784))
=======
>>>>>>> 12f226f36d (GEOMESA-3100 Kafka layer views (#2784))
=======
>>>>>>> 89f0c9f2c3 (GEOMESA-3100 Kafka layer views (#2784))
=======
>>>>>>> 222e44653b (GEOMESA-3100 Kafka layer views (#2784))
=======
>>>>>>> 4f4ecaeb43 (GEOMESA-3100 Kafka layer views (#2784))
=======
>>>>>>> b4cd5a7733 (GEOMESA-3100 Kafka layer views (#2784))
=======
>>>>>>> 750ebbabe7 (GEOMESA-3100 Kafka layer views (#2784))
=======
>>>>>>> 638b68d081 (Merge branch 'feature/postgis-fixes')
=======
>>>>>>> fc4546247e (GEOMESA-3100 Kafka layer views (#2784))
=======
>>>>>>> 65e544d20e (GEOMESA-3100 Kafka layer views (#2784))
=======
>>>>>>> c64e652363 (GEOMESA-3100 Kafka layer views (#2784))
=======
>>>>>>> 02eb81c815 (GEOMESA-3100 Kafka layer views (#2784))
=======
>>>>>>> 43ac4062d9 (GEOMESA-3100 Kafka layer views (#2784))
=======
>>>>>>> 30905e530b (GEOMESA-3100 Kafka layer views (#2784))
=======
>>>>>>> 121a1d3470 (GEOMESA-3100 Kafka layer views (#2784))
=======
>>>>>>> 297ca0be9c (GEOMESA-3100 Kafka layer views (#2784))
=======
>>>>>>> 39d28fffcb (GEOMESA-3100 Kafka layer views (#2784))
=======
>>>>>>> 71adb695c5 (Merge branch 'feature/postgis-fixes')
=======
>>>>>>> 5a4c24e020 (GEOMESA-3254 Add Bloop build support)
=======
>>>>>>> d4039e3d9a (GEOMESA-3100 Kafka layer views (#2784))
=======
>>>>>>> 0d5f6377de (GEOMESA-3100 Kafka layer views (#2784))
=======
>>>>>>> 41df6a2aa3 (GEOMESA-3100 Kafka layer views (#2784))
=======
>>>>>>> fb32a36e0e (GEOMESA-3100 Kafka layer views (#2784))
=======
>>>>>>> 340134cdda (GEOMESA-3100 Kafka layer views (#2784))
=======
>>>>>>> ea8384d9b7 (GEOMESA-3100 Kafka layer views (#2784))
=======
>>>>>>> fe3378ccaa (GEOMESA-3100 Kafka layer views (#2784))
=======
>>>>>>> 79f56900f0 (GEOMESA-3100 Kafka layer views (#2784))
=======
>>>>>>> 72ec0b2107 (GEOMESA-3100 Kafka layer views (#2784))
=======
>>>>>>> 30559ea5c9 (Merge branch 'feature/postgis-fixes')
=======
>>>>>>> ad362b1341 (GEOMESA-3100 Kafka layer views (#2784))
=======
>>>>>>> d0dc799ff1 (GEOMESA-3100 Kafka layer views (#2784))
=======
>>>>>>> 9361541304 (GEOMESA-3100 Kafka layer views (#2784))
=======
>>>>>>> 2f66072323 (GEOMESA-3100 Kafka layer views (#2784))
=======
=======
>>>>>>> 4231e686dd (GEOMESA-3100 Kafka layer views (#2784))
=======
>>>>>>> ac0357d362 (GEOMESA-3100 Kafka layer views (#2784))
=======
>>>>>>> a62b956fb6 (GEOMESA-3100 Kafka layer views (#2784))
=======
>>>>>>> 4adaa7f479 (GEOMESA-3100 Kafka layer views (#2784))
=======
>>>>>>> 6af71ff432 (GEOMESA-3100 Kafka layer views (#2784))
=======
>>>>>>> db8d998aa2 (Merge branch 'feature/postgis-fixes')
=======
>>>>>>> fa68dd43c6 (GEOMESA-3100 Kafka layer views (#2784))
=======
>>>>>>> 54ece16d15 (GEOMESA-3100 Kafka layer views (#2784))
=======
>>>>>>> c57b5f538a (GEOMESA-3100 Kafka layer views (#2784))
=======
>>>>>>> 88ef67cdfe (GEOMESA-3100 Kafka layer views (#2784))
=======
>>>>>>> 89fb9950ef (GEOMESA-3100 Kafka layer views (#2784))
=======
>>>>>>> 1b25d7ddb4 (Merge branch 'feature/postgis-fixes')
=======
>>>>>>> 98e7bf59d2 (GEOMESA-3100 Kafka layer views (#2784))
=======
>>>>>>> e24613dc4a (GEOMESA-3100 Kafka layer views (#2784))
=======
>>>>>>> dae1cf3cef (GEOMESA-3100 Kafka layer views (#2784))
=======
>>>>>>> 50a71079c1 (GEOMESA-3100 Kafka layer views (#2784))
=======
=======
>>>>>>> 4c325746bd (GEOMESA-3100 Kafka layer views (#2784))
=======
>>>>>>> 3ebcdb99d9 (GEOMESA-3100 Kafka layer views (#2784))
=======
>>>>>>> fdf51402cf (GEOMESA-3100 Kafka layer views (#2784))
=======
>>>>>>> a377061090 (GEOMESA-3100 Kafka layer views (#2784))
=======
>>>>>>> e944f1c88b (Merge branch 'feature/postgis-fixes')
=======
>>>>>>> eddb4eaca1 (GEOMESA-3100 Kafka layer views (#2784))
=======
>>>>>>> be0c9d161a (GEOMESA-3100 Kafka layer views (#2784))
=======
>>>>>>> 7bdc1feea8 (GEOMESA-3100 Kafka layer views (#2784))
=======
>>>>>>> 9b15c8e14c (GEOMESA-3100 Kafka layer views (#2784))
=======
>>>>>>> 3977ecc140 (GEOMESA-3100 Kafka layer views (#2784))
=======
>>>>>>> 495a1efc9f (GEOMESA-3100 Kafka layer views (#2784))
=======
>>>>>>> 5d8c5baea0 (GEOMESA-3100 Kafka layer views (#2784))
=======
>>>>>>> 7628960f66 (GEOMESA-3100 Kafka layer views (#2784))
=======
>>>>>>> 416a95a4c0 (GEOMESA-3100 Kafka layer views (#2784))
=======
>>>>>>> 26e5afc4ea (Merge branch 'feature/postgis-fixes')
=======
>>>>>>> 63a045a753 (GEOMESA-3254 Add Bloop build support)
=======
>>>>>>> ccfb3bd95e (GEOMESA-3100 Kafka layer views (#2784))
=======
>>>>>>> b5abc19ca4 (GEOMESA-3100 Kafka layer views (#2784))
=======
>>>>>>> 2750a5beef (GEOMESA-3100 Kafka layer views (#2784))
=======
>>>>>>> cb4aa55ae3 (GEOMESA-3100 Kafka layer views (#2784))
=======
>>>>>>> 468da42855 (GEOMESA-3100 Kafka layer views (#2784))
=======
>>>>>>> 5dd3eb3a6d (GEOMESA-3100 Kafka layer views (#2784))
=======
>>>>>>> d530f7b24a (GEOMESA-3100 Kafka layer views (#2784))
=======
>>>>>>> 5e230912b1 (GEOMESA-3100 Kafka layer views (#2784))
=======
>>>>>>> f340d6feab (GEOMESA-3100 Kafka layer views (#2784))
=======
>>>>>>> c69897d7bd (Merge branch 'feature/postgis-fixes')
=======
>>>>>>> 65a3a6e36 (GEOMESA-3100 Kafka layer views (#2784))
>>>>>>> 9e910620b3 (GEOMESA-3100 Kafka layer views (#2784))
=======
>>>>>>> 429ffc55e (GEOMESA-3100 Kafka layer views (#2784))
=======
>>>>>>> e7f3e6588 (GEOMESA-3100 Kafka layer views (#2784))
=======
>>>>>>> 6f6887eb8 (GEOMESA-3100 Kafka layer views (#2784))
=======
>>>>>>> 42549e8e3 (GEOMESA-3100 Kafka layer views (#2784))
=======
>>>>>>> e8cc4971c6 (Merge branch 'feature/postgis-fixes')
=======
>>>>>>> 8ed2c9f7e5 (GEOMESA-3100 Kafka layer views (#2784))
=======
>>>>>>> c1d0543aac (GEOMESA-3100 Kafka layer views (#2784))
=======
>>>>>>> 8b9e99d11a (GEOMESA-3100 Kafka layer views (#2784))
=======
>>>>>>> 614fcb6bc3 (GEOMESA-3100 Kafka layer views (#2784))
=======
=======
>>>>>>> 04f82bbc57 (GEOMESA-3100 Kafka layer views (#2784))
=======
>>>>>>> e0773a1bd7 (GEOMESA-3100 Kafka layer views (#2784))
=======
>>>>>>> ae5eea67f1 (GEOMESA-3100 Kafka layer views (#2784))
=======
>>>>>>> 23a7d9849f (GEOMESA-3100 Kafka layer views (#2784))
=======
>>>>>>> cb6bda89b6 (Merge branch 'feature/postgis-fixes')
=======
>>>>>>> 09d87762c5 (GEOMESA-3254 Add Bloop build support)
=======
>>>>>>> 6069aba6b4 (GEOMESA-3100 Kafka layer views (#2784))
=======
>>>>>>> 4480b2d1b9 (GEOMESA-3100 Kafka layer views (#2784))
=======
=======
=======
>>>>>>> 23f312535d (GEOMESA-3100 Kafka layer views (#2784))
=======
>>>>>>> 826636f69d (GEOMESA-3100 Kafka layer views (#2784))
=======
>>>>>>> 1e11ed51a6 (GEOMESA-3100 Kafka layer views (#2784))
=======
>>>>>>> 976f319530 (GEOMESA-3100 Kafka layer views (#2784))
=======
>>>>>>> bc97b07a31 (GEOMESA-3100 Kafka layer views (#2784))
=======
>>>>>>> 699117eca9 (Merge branch 'feature/postgis-fixes')
=======
=======
>>>>>>> d0dc799ff (GEOMESA-3100 Kafka layer views (#2784))
>>>>>>> ffbc2ce32 (GEOMESA-3100 Kafka layer views (#2784))
>>>>>>> 2df2640494 (GEOMESA-3100 Kafka layer views (#2784))
=======
>>>>>>> c589b832a (GEOMESA-3100 Kafka layer views (#2784))
>>>>>>> 9e433ba57e (GEOMESA-3100 Kafka layer views (#2784))
=======
>>>>>>> 4231e686d (GEOMESA-3100 Kafka layer views (#2784))
>>>>>>> 69e3273ac1 (GEOMESA-3100 Kafka layer views (#2784))
=======
>>>>>>> ac0357d36 (GEOMESA-3100 Kafka layer views (#2784))
=======
>>>>>>> a62b956fb (GEOMESA-3100 Kafka layer views (#2784))
=======
>>>>>>> 4adaa7f47 (GEOMESA-3100 Kafka layer views (#2784))
=======
>>>>>>> 6af71ff43 (GEOMESA-3100 Kafka layer views (#2784))
=======
>>>>>>> db8d998aa (Merge branch 'feature/postgis-fixes')
=======
>>>>>>> fa68dd43c (GEOMESA-3100 Kafka layer views (#2784))
=======
>>>>>>> 54ece16d1 (GEOMESA-3100 Kafka layer views (#2784))
=======
>>>>>>> c57b5f538 (GEOMESA-3100 Kafka layer views (#2784))
=======
>>>>>>> 88ef67cdf (GEOMESA-3100 Kafka layer views (#2784))
=======
>>>>>>> 89fb9950e (GEOMESA-3100 Kafka layer views (#2784))
=======
>>>>>>> 1b25d7ddb (Merge branch 'feature/postgis-fixes')
=======
>>>>>>> d0dc799ff (GEOMESA-3100 Kafka layer views (#2784))
>>>>>>> ea3b40e187 (GEOMESA-3100 Kafka layer views (#2784))
=======
>>>>>>> 9236b02087 (GEOMESA-3100 Kafka layer views (#2784))
=======
>>>>>>> 862857ce2e (GEOMESA-3100 Kafka layer views (#2784))
=======
=======
>>>>>>> d0dc799ff (GEOMESA-3100 Kafka layer views (#2784))
>>>>>>> 28427dfd8f (GEOMESA-3100 Kafka layer views (#2784))
=======
>>>>>>> 936154130 (GEOMESA-3100 Kafka layer views (#2784))
=======
>>>>>>> 2f6607232 (GEOMESA-3100 Kafka layer views (#2784))
=======
=======
>>>>>>> d0dc799ff (GEOMESA-3100 Kafka layer views (#2784))
>>>>>>> ea3b40e18 (GEOMESA-3100 Kafka layer views (#2784))
=======
>>>>>>> f6e840b5dd (GEOMESA-3100 Kafka layer views (#2784))
=======
>>>>>>> c589b832a5 (GEOMESA-3100 Kafka layer views (#2784))
=======
=======
>>>>>>> d0dc799ff (GEOMESA-3100 Kafka layer views (#2784))
>>>>>>> ffbc2ce32a (GEOMESA-3100 Kafka layer views (#2784))
=======
>>>>>>> 936154130 (GEOMESA-3100 Kafka layer views (#2784))
=======
>>>>>>> 2f6607232 (GEOMESA-3100 Kafka layer views (#2784))
=======
=======
>>>>>>> d0dc799ff (GEOMESA-3100 Kafka layer views (#2784))
>>>>>>> ea3b40e18 (GEOMESA-3100 Kafka layer views (#2784))
=======
<<<<<<< HEAD
>>>>>>> 2f6607232 (GEOMESA-3100 Kafka layer views (#2784))
=======
=======
>>>>>>> d0dc799ff (GEOMESA-3100 Kafka layer views (#2784))
>>>>>>> ea3b40e18 (GEOMESA-3100 Kafka layer views (#2784))
=======
<<<<<<< HEAD
>>>>>>> 2f6607232 (GEOMESA-3100 Kafka layer views (#2784))
=======
=======
>>>>>>> d0dc799ff (GEOMESA-3100 Kafka layer views (#2784))
>>>>>>> ea3b40e18 (GEOMESA-3100 Kafka layer views (#2784))
=======
>>>>>>> 9236b0208 (GEOMESA-3100 Kafka layer views (#2784))
=======
>>>>>>> 862857ce2 (GEOMESA-3100 Kafka layer views (#2784))
=======
=======
>>>>>>> d0dc799ff (GEOMESA-3100 Kafka layer views (#2784))
>>>>>>> 28427dfd8 (GEOMESA-3100 Kafka layer views (#2784))
=======
=======
>>>>>>> ac0357d36 (GEOMESA-3100 Kafka layer views (#2784))
=======
=======
>>>>>>> f6e840b5d (GEOMESA-3100 Kafka layer views (#2784))
=======
>>>>>>> 54ece16d1 (GEOMESA-3100 Kafka layer views (#2784))
<<<<<<< HEAD
>>>>>>> 2f6607232 (GEOMESA-3100 Kafka layer views (#2784))
=======
=======
>>>>>>> d0dc799ff (GEOMESA-3100 Kafka layer views (#2784))
>>>>>>> ea3b40e18 (GEOMESA-3100 Kafka layer views (#2784))
=======
>>>>>>> 581f1dd15 (GEOMESA-3100 Kafka layer views (#2784))
=======
>>>>>>> 1a5f68233 (GEOMESA-3100 Kafka layer views (#2784))
=======
=======
>>>>>>> d0dc799ff (GEOMESA-3100 Kafka layer views (#2784))
>>>>>>> 73767737b (GEOMESA-3100 Kafka layer views (#2784))
=======
=======
>>>>>>> 429ffc55e (GEOMESA-3100 Kafka layer views (#2784))
<<<<<<< HEAD
>>>>>>> 2f66072323 (GEOMESA-3100 Kafka layer views (#2784))
=======
=======
>>>>>>> 4231e686dd (GEOMESA-3100 Kafka layer views (#2784))
=======
>>>>>>> ac0357d362 (GEOMESA-3100 Kafka layer views (#2784))
=======
>>>>>>> a62b956fb6 (GEOMESA-3100 Kafka layer views (#2784))
=======
>>>>>>> 4adaa7f479 (GEOMESA-3100 Kafka layer views (#2784))
=======
>>>>>>> 6af71ff432 (GEOMESA-3100 Kafka layer views (#2784))
=======
>>>>>>> db8d998aa2 (Merge branch 'feature/postgis-fixes')
=======
>>>>>>> fa68dd43c6 (GEOMESA-3100 Kafka layer views (#2784))
=======
>>>>>>> 54ece16d15 (GEOMESA-3100 Kafka layer views (#2784))
=======
>>>>>>> c57b5f538a (GEOMESA-3100 Kafka layer views (#2784))
=======
>>>>>>> 88ef67cdfe (GEOMESA-3100 Kafka layer views (#2784))
=======
>>>>>>> 89fb9950ef (GEOMESA-3100 Kafka layer views (#2784))
=======
>>>>>>> 1b25d7ddb4 (Merge branch 'feature/postgis-fixes')
=======
>>>>>>> 98e7bf59d2 (GEOMESA-3100 Kafka layer views (#2784))
=======
>>>>>>> e24613dc4a (GEOMESA-3100 Kafka layer views (#2784))
=======
>>>>>>> dae1cf3cef (GEOMESA-3100 Kafka layer views (#2784))
=======
>>>>>>> 50a71079c1 (GEOMESA-3100 Kafka layer views (#2784))
=======
=======
>>>>>>> 4c325746bd (GEOMESA-3100 Kafka layer views (#2784))
=======
>>>>>>> 3ebcdb99d9 (GEOMESA-3100 Kafka layer views (#2784))
=======
>>>>>>> fdf51402cf (GEOMESA-3100 Kafka layer views (#2784))
=======
>>>>>>> a377061090 (GEOMESA-3100 Kafka layer views (#2784))
=======
>>>>>>> e944f1c88b (Merge branch 'feature/postgis-fixes')
=======
>>>>>>> eddb4eaca1 (GEOMESA-3100 Kafka layer views (#2784))
=======
>>>>>>> be0c9d161a (GEOMESA-3100 Kafka layer views (#2784))
=======
>>>>>>> 7bdc1feea8 (GEOMESA-3100 Kafka layer views (#2784))
=======
>>>>>>> 9b15c8e14c (GEOMESA-3100 Kafka layer views (#2784))
=======
>>>>>>> 3977ecc140 (GEOMESA-3100 Kafka layer views (#2784))
=======
>>>>>>> 495a1efc9f (GEOMESA-3100 Kafka layer views (#2784))
=======
>>>>>>> 5d8c5baea0 (GEOMESA-3100 Kafka layer views (#2784))
=======
>>>>>>> 7628960f66 (GEOMESA-3100 Kafka layer views (#2784))
=======
>>>>>>> 416a95a4c0 (GEOMESA-3100 Kafka layer views (#2784))
=======
>>>>>>> 26e5afc4ea (Merge branch 'feature/postgis-fixes')
=======
>>>>>>> 63a045a753 (GEOMESA-3254 Add Bloop build support)
=======
>>>>>>> ccfb3bd95e (GEOMESA-3100 Kafka layer views (#2784))
=======
>>>>>>> b5abc19ca4 (GEOMESA-3100 Kafka layer views (#2784))
=======
>>>>>>> 2750a5beef (GEOMESA-3100 Kafka layer views (#2784))
=======
>>>>>>> cb4aa55ae3 (GEOMESA-3100 Kafka layer views (#2784))
=======
>>>>>>> 468da42855 (GEOMESA-3100 Kafka layer views (#2784))
=======
>>>>>>> 5dd3eb3a6d (GEOMESA-3100 Kafka layer views (#2784))
=======
>>>>>>> d530f7b24a (GEOMESA-3100 Kafka layer views (#2784))
=======
>>>>>>> 5e230912b1 (GEOMESA-3100 Kafka layer views (#2784))
=======
>>>>>>> f340d6feab (GEOMESA-3100 Kafka layer views (#2784))
=======
>>>>>>> c69897d7bd (Merge branch 'feature/postgis-fixes')
=======
>>>>>>> 65a3a6e36 (GEOMESA-3100 Kafka layer views (#2784))
>>>>>>> 9e910620b3 (GEOMESA-3100 Kafka layer views (#2784))
=======
>>>>>>> 429ffc55e (GEOMESA-3100 Kafka layer views (#2784))
=======
>>>>>>> e7f3e6588 (GEOMESA-3100 Kafka layer views (#2784))
=======
>>>>>>> 6f6887eb8 (GEOMESA-3100 Kafka layer views (#2784))
=======
>>>>>>> 42549e8e3 (GEOMESA-3100 Kafka layer views (#2784))
=======
>>>>>>> e8cc4971c6 (Merge branch 'feature/postgis-fixes')
=======
>>>>>>> 8ed2c9f7e5 (GEOMESA-3100 Kafka layer views (#2784))
=======
>>>>>>> c1d0543aac (GEOMESA-3100 Kafka layer views (#2784))
=======
>>>>>>> 8b9e99d11a (GEOMESA-3100 Kafka layer views (#2784))
=======
>>>>>>> 614fcb6bc3 (GEOMESA-3100 Kafka layer views (#2784))
=======
=======
>>>>>>> 04f82bbc57 (GEOMESA-3100 Kafka layer views (#2784))
=======
>>>>>>> e0773a1bd7 (GEOMESA-3100 Kafka layer views (#2784))
=======
>>>>>>> ae5eea67f1 (GEOMESA-3100 Kafka layer views (#2784))
=======
>>>>>>> 23a7d9849f (GEOMESA-3100 Kafka layer views (#2784))
=======
>>>>>>> cb6bda89b6 (Merge branch 'feature/postgis-fixes')
=======
>>>>>>> 09d87762c5 (GEOMESA-3254 Add Bloop build support)
=======
>>>>>>> 6069aba6b4 (GEOMESA-3100 Kafka layer views (#2784))
=======
>>>>>>> 4480b2d1b9 (GEOMESA-3100 Kafka layer views (#2784))
=======
=======
=======
>>>>>>> 23f312535d (GEOMESA-3100 Kafka layer views (#2784))
=======
>>>>>>> 826636f69d (GEOMESA-3100 Kafka layer views (#2784))
=======
>>>>>>> 1e11ed51a6 (GEOMESA-3100 Kafka layer views (#2784))
=======
>>>>>>> 976f319530 (GEOMESA-3100 Kafka layer views (#2784))
=======
>>>>>>> bc97b07a31 (GEOMESA-3100 Kafka layer views (#2784))
=======
>>>>>>> 699117eca9 (Merge branch 'feature/postgis-fixes')
=======
=======
>>>>>>> d0dc799ff (GEOMESA-3100 Kafka layer views (#2784))
>>>>>>> ffbc2ce32 (GEOMESA-3100 Kafka layer views (#2784))
>>>>>>> 2df2640494 (GEOMESA-3100 Kafka layer views (#2784))
=======
>>>>>>> c589b832a (GEOMESA-3100 Kafka layer views (#2784))
>>>>>>> 9e433ba57e (GEOMESA-3100 Kafka layer views (#2784))
=======
>>>>>>> 4231e686d (GEOMESA-3100 Kafka layer views (#2784))
>>>>>>> 69e3273ac1 (GEOMESA-3100 Kafka layer views (#2784))
=======
>>>>>>> ac0357d36 (GEOMESA-3100 Kafka layer views (#2784))
=======
>>>>>>> a62b956fb (GEOMESA-3100 Kafka layer views (#2784))
=======
>>>>>>> 4adaa7f47 (GEOMESA-3100 Kafka layer views (#2784))
=======
>>>>>>> 6af71ff43 (GEOMESA-3100 Kafka layer views (#2784))
=======
>>>>>>> db8d998aa (Merge branch 'feature/postgis-fixes')
=======
>>>>>>> fa68dd43c (GEOMESA-3100 Kafka layer views (#2784))
=======
>>>>>>> 54ece16d1 (GEOMESA-3100 Kafka layer views (#2784))
=======
>>>>>>> c57b5f538 (GEOMESA-3100 Kafka layer views (#2784))
=======
>>>>>>> 88ef67cdf (GEOMESA-3100 Kafka layer views (#2784))
=======
>>>>>>> 89fb9950e (GEOMESA-3100 Kafka layer views (#2784))
=======
>>>>>>> 1b25d7ddb (Merge branch 'feature/postgis-fixes')
=======
>>>>>>> d0dc799ff (GEOMESA-3100 Kafka layer views (#2784))
>>>>>>> ea3b40e187 (GEOMESA-3100 Kafka layer views (#2784))
=======
>>>>>>> 9236b02087 (GEOMESA-3100 Kafka layer views (#2784))
=======
>>>>>>> 862857ce2e (GEOMESA-3100 Kafka layer views (#2784))
=======
=======
>>>>>>> d0dc799ff (GEOMESA-3100 Kafka layer views (#2784))
>>>>>>> 28427dfd8f (GEOMESA-3100 Kafka layer views (#2784))
=======
>>>>>>> 936154130 (GEOMESA-3100 Kafka layer views (#2784))
=======
>>>>>>> 2f6607232 (GEOMESA-3100 Kafka layer views (#2784))
=======
=======
>>>>>>> d0dc799ff (GEOMESA-3100 Kafka layer views (#2784))
>>>>>>> ea3b40e18 (GEOMESA-3100 Kafka layer views (#2784))
=======
<<<<<<< HEAD
=======
>>>>>>> d0dc799ff (GEOMESA-3100 Kafka layer views (#2784))
>>>>>>> ea3b40e18 (GEOMESA-3100 Kafka layer views (#2784))
=======
>>>>>>> f6e840b5dd (GEOMESA-3100 Kafka layer views (#2784))
=======
>>>>>>> c589b832a5 (GEOMESA-3100 Kafka layer views (#2784))
=======
=======
>>>>>>> d0dc799ff (GEOMESA-3100 Kafka layer views (#2784))
>>>>>>> ffbc2ce32a (GEOMESA-3100 Kafka layer views (#2784))
=======
>>>>>>> 936154130 (GEOMESA-3100 Kafka layer views (#2784))
=======
>>>>>>> 2f6607232 (GEOMESA-3100 Kafka layer views (#2784))
=======
=======
>>>>>>> d0dc799ff (GEOMESA-3100 Kafka layer views (#2784))
>>>>>>> ea3b40e18 (GEOMESA-3100 Kafka layer views (#2784))
=======
<<<<<<< HEAD
>>>>>>> 2f6607232 (GEOMESA-3100 Kafka layer views (#2784))
=======
=======
>>>>>>> d0dc799ff (GEOMESA-3100 Kafka layer views (#2784))
>>>>>>> ea3b40e18 (GEOMESA-3100 Kafka layer views (#2784))
=======
<<<<<<< HEAD
>>>>>>> 2f6607232 (GEOMESA-3100 Kafka layer views (#2784))
=======
=======
>>>>>>> d0dc799ff (GEOMESA-3100 Kafka layer views (#2784))
>>>>>>> ea3b40e18 (GEOMESA-3100 Kafka layer views (#2784))
=======
>>>>>>> 9236b0208 (GEOMESA-3100 Kafka layer views (#2784))
=======
>>>>>>> 862857ce2 (GEOMESA-3100 Kafka layer views (#2784))
=======
=======
>>>>>>> d0dc799ff (GEOMESA-3100 Kafka layer views (#2784))
>>>>>>> 28427dfd8 (GEOMESA-3100 Kafka layer views (#2784))
=======
=======
>>>>>>> ac0357d36 (GEOMESA-3100 Kafka layer views (#2784))
=======
=======
>>>>>>> f6e840b5d (GEOMESA-3100 Kafka layer views (#2784))
=======
>>>>>>> 54ece16d1 (GEOMESA-3100 Kafka layer views (#2784))
<<<<<<< HEAD
>>>>>>> 2f6607232 (GEOMESA-3100 Kafka layer views (#2784))
=======
=======
>>>>>>> d0dc799ff (GEOMESA-3100 Kafka layer views (#2784))
>>>>>>> ea3b40e18 (GEOMESA-3100 Kafka layer views (#2784))
=======
>>>>>>> 581f1dd15 (GEOMESA-3100 Kafka layer views (#2784))
=======
>>>>>>> 1a5f68233 (GEOMESA-3100 Kafka layer views (#2784))
=======
=======
>>>>>>> d0dc799ff (GEOMESA-3100 Kafka layer views (#2784))
>>>>>>> 73767737b (GEOMESA-3100 Kafka layer views (#2784))
=======
=======
>>>>>>> 429ffc55e (GEOMESA-3100 Kafka layer views (#2784))
=======
=======
>>>>>>> 64646d61ed (GEOMESA-3100 Kafka layer views (#2784))
=======
>>>>>>> 936154130 (GEOMESA-3100 Kafka layer views (#2784))
=======
>>>>>>> 626c8f9b93 (GEOMESA-3100 Kafka layer views (#2784))
=======
>>>>>>> 9a5d6d2815 (GEOMESA-3100 Kafka layer views (#2784))
=======
=======
>>>>>>> 770d928c15 (GEOMESA-3100 Kafka layer views (#2784))
=======
>>>>>>> 0a0bf0292e (GEOMESA-3100 Kafka layer views (#2784))
<<<<<<< HEAD
import java.io.{Closeable, IOException}
=======
<<<<<<< HEAD
=======
>>>>>>> 58286bfd3 (GEOMESA-3100 Kafka layer views (#2784))
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
>>>>>>> 808743e257 (GEOMESA-3100 Kafka layer views (#2784))
=======
>>>>>>> 0a0bf0292e (GEOMESA-3100 Kafka layer views (#2784))
=======
>>>>>>> 4b0dd3e513 (GEOMESA-3100 Kafka layer views (#2784))
=======
>>>>>>> 1c99a27679 (GEOMESA-3100 Kafka layer views (#2784))
>>>>>>> 5ca0cd6de5 (GEOMESA-3100 Kafka layer views (#2784))
=======
>>>>>>> 5ca0cd6de (GEOMESA-3100 Kafka layer views (#2784))
<<<<<<< HEAD
<<<<<<< HEAD
<<<<<<< HEAD
<<<<<<< HEAD
=======
>>>>>>> ea3b40e18 (GEOMESA-3100 Kafka layer views (#2784))
=======
>>>>>>> bddfdbea5 (GEOMESA-3100 Kafka layer views (#2784))
<<<<<<< HEAD
>>>>>>> 12fe94b860 (GEOMESA-3100 Kafka layer views (#2784))
=======
>>>>>>> 5ca0cd6de5 (GEOMESA-3100 Kafka layer views (#2784))
>>>>>>> 770d928c15 (GEOMESA-3100 Kafka layer views (#2784))
import java.io.{Closeable, IOException, StringReader}
=======
import java.io.{Closeable, IOException}
<<<<<<< HEAD
>>>>>>> af0a88eb17 (GEOMESA-3100 Kafka layer views (#2784))
=======
>>>>>>> af0a88eb1 (GEOMESA-3100 Kafka layer views (#2784))
<<<<<<< HEAD
<<<<<<< HEAD
<<<<<<< HEAD
>>>>>>> f7038468b7 (GEOMESA-3100 Kafka layer views (#2784))
=======
<<<<<<< HEAD
>>>>>>> 12fe94b860 (GEOMESA-3100 Kafka layer views (#2784))
=======
<<<<<<< HEAD
=======
>>>>>>> f7038468b7 (GEOMESA-3100 Kafka layer views (#2784))
=======
<<<<<<< HEAD
>>>>>>> 770d928c15 (GEOMESA-3100 Kafka layer views (#2784))
>>>>>>> locationtech-main
=======
>>>>>>> 58286bfd3 (GEOMESA-3100 Kafka layer views (#2784))
>>>>>>> 5ca0cd6de5 (GEOMESA-3100 Kafka layer views (#2784))
<<<<<<< HEAD
<<<<<<< HEAD
=======
=======
>>>>>>> 5ca0cd6de (GEOMESA-3100 Kafka layer views (#2784))
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
>>>>>>> d0dc799ff1 (GEOMESA-3100 Kafka layer views (#2784))
=======
>>>>>>> 5ca0cd6de (GEOMESA-3100 Kafka layer views (#2784))
>>>>>>> 9361541304 (GEOMESA-3100 Kafka layer views (#2784))
=======
=======
>>>>>>> bddfdbea5 (GEOMESA-3100 Kafka layer views (#2784))
>>>>>>> 2f66072323 (GEOMESA-3100 Kafka layer views (#2784))
=======
=======
>>>>>>> ac0357d362 (GEOMESA-3100 Kafka layer views (#2784))
=======
>>>>>>> a62b956fb6 (GEOMESA-3100 Kafka layer views (#2784))
=======
=======
>>>>>>> e24613dc4a (GEOMESA-3100 Kafka layer views (#2784))
=======
>>>>>>> dae1cf3cef (GEOMESA-3100 Kafka layer views (#2784))
=======
>>>>>>> 50a71079c1 (GEOMESA-3100 Kafka layer views (#2784))
=======
>>>>>>> 4c325746bd (GEOMESA-3100 Kafka layer views (#2784))
=======
>>>>>>> 3ebcdb99d9 (GEOMESA-3100 Kafka layer views (#2784))
=======
>>>>>>> fdf51402cf (GEOMESA-3100 Kafka layer views (#2784))
=======
=======
>>>>>>> 7bdc1feea8 (GEOMESA-3100 Kafka layer views (#2784))
=======
>>>>>>> 9b15c8e14c (GEOMESA-3100 Kafka layer views (#2784))
=======
>>>>>>> 495a1efc9f (GEOMESA-3100 Kafka layer views (#2784))
=======
>>>>>>> 5d8c5baea0 (GEOMESA-3100 Kafka layer views (#2784))
=======
>>>>>>> 7628960f66 (GEOMESA-3100 Kafka layer views (#2784))
=======
>>>>>>> b5abc19ca4 (GEOMESA-3100 Kafka layer views (#2784))
=======
>>>>>>> 2750a5beef (GEOMESA-3100 Kafka layer views (#2784))
=======
>>>>>>> cb4aa55ae3 (GEOMESA-3100 Kafka layer views (#2784))
=======
>>>>>>> 5dd3eb3a6d (GEOMESA-3100 Kafka layer views (#2784))
=======
>>>>>>> d530f7b24a (GEOMESA-3100 Kafka layer views (#2784))
=======
>>>>>>> 5e230912b1 (GEOMESA-3100 Kafka layer views (#2784))
=======
>>>>>>> c1d0543aac (GEOMESA-3100 Kafka layer views (#2784))
>>>>>>> be0c9d161a (GEOMESA-3100 Kafka layer views (#2784))
=======
>>>>>>> 8b9e99d11a (GEOMESA-3100 Kafka layer views (#2784))
=======
>>>>>>> ea3b40e18 (GEOMESA-3100 Kafka layer views (#2784))
>>>>>>> 4adaa7f479 (GEOMESA-3100 Kafka layer views (#2784))
=======
>>>>>>> 54ece16d15 (GEOMESA-3100 Kafka layer views (#2784))
=======
>>>>>>> c57b5f538a (GEOMESA-3100 Kafka layer views (#2784))
=======
=======
>>>>>>> ea3b40e18 (GEOMESA-3100 Kafka layer views (#2784))
>>>>>>> 88ef67cdfe (GEOMESA-3100 Kafka layer views (#2784))
=======
>>>>>>> 73767737b (GEOMESA-3100 Kafka layer views (#2784))
=======
>>>>>>> 429ffc55e (GEOMESA-3100 Kafka layer views (#2784))
=======
>>>>>>> e7f3e6588 (GEOMESA-3100 Kafka layer views (#2784))
=======
=======
>>>>>>> ea3b40e18 (GEOMESA-3100 Kafka layer views (#2784))
>>>>>>> 6f6887eb8 (GEOMESA-3100 Kafka layer views (#2784))
=======
=======
>>>>>>> 04f82bbc57 (GEOMESA-3100 Kafka layer views (#2784))
=======
>>>>>>> e0773a1bd7 (GEOMESA-3100 Kafka layer views (#2784))
=======
>>>>>>> ae5eea67f1 (GEOMESA-3100 Kafka layer views (#2784))
=======
>>>>>>> 4480b2d1b9 (GEOMESA-3100 Kafka layer views (#2784))
=======
>>>>>>> 9e433ba57e (GEOMESA-3100 Kafka layer views (#2784))
=======
>>>>>>> 2df2640494 (GEOMESA-3100 Kafka layer views (#2784))
=======
>>>>>>> 826636f69d (GEOMESA-3100 Kafka layer views (#2784))
=======
>>>>>>> 1e11ed51a6 (GEOMESA-3100 Kafka layer views (#2784))
=======
>>>>>>> 976f319530 (GEOMESA-3100 Kafka layer views (#2784))
=======
>>>>>>> ea3b40e18 (GEOMESA-3100 Kafka layer views (#2784))
=======
>>>>>>> 28427dfd8 (GEOMESA-3100 Kafka layer views (#2784))
>>>>>>> 614fcb6bc3 (GEOMESA-3100 Kafka layer views (#2784))
=======
>>>>>>> ac0357d36 (GEOMESA-3100 Kafka layer views (#2784))
=======
>>>>>>> a62b956fb (GEOMESA-3100 Kafka layer views (#2784))
=======
=======
>>>>>>> ea3b40e18 (GEOMESA-3100 Kafka layer views (#2784))
>>>>>>> 4adaa7f47 (GEOMESA-3100 Kafka layer views (#2784))
=======
>>>>>>> ffbc2ce32 (GEOMESA-3100 Kafka layer views (#2784))
=======
>>>>>>> 54ece16d1 (GEOMESA-3100 Kafka layer views (#2784))
=======
>>>>>>> c57b5f538 (GEOMESA-3100 Kafka layer views (#2784))
=======
=======
>>>>>>> ea3b40e18 (GEOMESA-3100 Kafka layer views (#2784))
>>>>>>> 88ef67cdf (GEOMESA-3100 Kafka layer views (#2784))
=======
>>>>>>> bddfdbea5 (GEOMESA-3100 Kafka layer views (#2784))
=======
>>>>>>> d0dc799ff (GEOMESA-3100 Kafka layer views (#2784))
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
>>>>>>> ea3b40e187 (GEOMESA-3100 Kafka layer views (#2784))
=======
>>>>>>> 5ca0cd6de (GEOMESA-3100 Kafka layer views (#2784))
>>>>>>> 9236b02087 (GEOMESA-3100 Kafka layer views (#2784))
=======
=======
>>>>>>> bddfdbea5 (GEOMESA-3100 Kafka layer views (#2784))
>>>>>>> 862857ce2e (GEOMESA-3100 Kafka layer views (#2784))
=======
=======
>>>>>>> bddfdbea5 (GEOMESA-3100 Kafka layer views (#2784))
=======
>>>>>>> d0dc799ff (GEOMESA-3100 Kafka layer views (#2784))
>>>>>>> 28427dfd8f (GEOMESA-3100 Kafka layer views (#2784))
=======
=======
>>>>>>> 4adaa7f479 (GEOMESA-3100 Kafka layer views (#2784))
=======
>>>>>>> 88ef67cdfe (GEOMESA-3100 Kafka layer views (#2784))
=======
>>>>>>> 50a71079c1 (GEOMESA-3100 Kafka layer views (#2784))
=======
>>>>>>> 9e910620b3 (GEOMESA-3100 Kafka layer views (#2784))
=======
=======
>>>>>>> 9b15c8e14c (GEOMESA-3100 Kafka layer views (#2784))
=======
>>>>>>> 3977ecc140 (GEOMESA-3100 Kafka layer views (#2784))
=======
>>>>>>> 7628960f66 (GEOMESA-3100 Kafka layer views (#2784))
=======
>>>>>>> cb4aa55ae3 (GEOMESA-3100 Kafka layer views (#2784))
=======
>>>>>>> 468da42855 (GEOMESA-3100 Kafka layer views (#2784))
=======
>>>>>>> 5e230912b1 (GEOMESA-3100 Kafka layer views (#2784))
=======
>>>>>>> 6f6887eb8 (GEOMESA-3100 Kafka layer views (#2784))
>>>>>>> fdf51402cf (GEOMESA-3100 Kafka layer views (#2784))
=======
>>>>>>> 614fcb6bc3 (GEOMESA-3100 Kafka layer views (#2784))
=======
>>>>>>> 69e3273ac1 (GEOMESA-3100 Kafka layer views (#2784))
=======
=======
>>>>>>> 2df2640494 (GEOMESA-3100 Kafka layer views (#2784))
=======
>>>>>>> 23f312535d (GEOMESA-3100 Kafka layer views (#2784))
=======
>>>>>>> 976f319530 (GEOMESA-3100 Kafka layer views (#2784))
=======
>>>>>>> 4adaa7f47 (GEOMESA-3100 Kafka layer views (#2784))
>>>>>>> ae5eea67f1 (GEOMESA-3100 Kafka layer views (#2784))
=======
>>>>>>> 88ef67cdf (GEOMESA-3100 Kafka layer views (#2784))
=======
>>>>>>> f4b2369e9a (GEOMESA-3100 Kafka layer views (#2784))
=======
>>>>>>> 95c83ca7f (GEOMESA-3100 Kafka layer views (#2784))
<<<<<<< HEAD
<<<<<<< HEAD
<<<<<<< HEAD
>>>>>>> 4231e686dd (GEOMESA-3100 Kafka layer views (#2784))
=======
=======
>>>>>>> 936154130 (GEOMESA-3100 Kafka layer views (#2784))
<<<<<<< HEAD
<<<<<<< HEAD
<<<<<<< HEAD
<<<<<<< HEAD
<<<<<<< HEAD
<<<<<<< HEAD
<<<<<<< HEAD
<<<<<<< HEAD
<<<<<<< HEAD
>>>>>>> ac0357d362 (GEOMESA-3100 Kafka layer views (#2784))
=======
=======
>>>>>>> c57b5f538a (GEOMESA-3100 Kafka layer views (#2784))
=======
>>>>>>> 4c325746bd (GEOMESA-3100 Kafka layer views (#2784))
=======
=======
>>>>>>> 495a1efc9f (GEOMESA-3100 Kafka layer views (#2784))
=======
>>>>>>> 5d8c5baea0 (GEOMESA-3100 Kafka layer views (#2784))
=======
>>>>>>> 5dd3eb3a6d (GEOMESA-3100 Kafka layer views (#2784))
=======
>>>>>>> d530f7b24a (GEOMESA-3100 Kafka layer views (#2784))
=======
>>>>>>> e7f3e6588 (GEOMESA-3100 Kafka layer views (#2784))
>>>>>>> 3ebcdb99d9 (GEOMESA-3100 Kafka layer views (#2784))
=======
>>>>>>> 04f82bbc57 (GEOMESA-3100 Kafka layer views (#2784))
=======
=======
>>>>>>> 826636f69d (GEOMESA-3100 Kafka layer views (#2784))
=======
>>>>>>> 1e11ed51a6 (GEOMESA-3100 Kafka layer views (#2784))
=======
>>>>>>> a62b956fb (GEOMESA-3100 Kafka layer views (#2784))
>>>>>>> e0773a1bd7 (GEOMESA-3100 Kafka layer views (#2784))
=======
>>>>>>> c57b5f538 (GEOMESA-3100 Kafka layer views (#2784))
=======
>>>>>>> 9a5d6d2815 (GEOMESA-3100 Kafka layer views (#2784))
=======
=======
>>>>>>> bddfdbea5 (GEOMESA-3100 Kafka layer views (#2784))
>>>>>>> 2f6607232 (GEOMESA-3100 Kafka layer views (#2784))
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
>>>>>>> a62b956fb6 (GEOMESA-3100 Kafka layer views (#2784))
=======
=======
>>>>>>> 3ebcdb99d9 (GEOMESA-3100 Kafka layer views (#2784))
=======
>>>>>>> fdf51402cf (GEOMESA-3100 Kafka layer views (#2784))
=======
=======
>>>>>>> 7628960f66 (GEOMESA-3100 Kafka layer views (#2784))
=======
>>>>>>> d530f7b24a (GEOMESA-3100 Kafka layer views (#2784))
=======
>>>>>>> 5e230912b1 (GEOMESA-3100 Kafka layer views (#2784))
=======
>>>>>>> e0773a1bd7 (GEOMESA-3100 Kafka layer views (#2784))
>>>>>>> 5d8c5baea0 (GEOMESA-3100 Kafka layer views (#2784))
=======
>>>>>>> ae5eea67f1 (GEOMESA-3100 Kafka layer views (#2784))
=======
>>>>>>> 1e11ed51a6 (GEOMESA-3100 Kafka layer views (#2784))
=======
>>>>>>> 976f319530 (GEOMESA-3100 Kafka layer views (#2784))
=======
>>>>>>> ea3b40e18 (GEOMESA-3100 Kafka layer views (#2784))
<<<<<<< HEAD
<<<<<<< HEAD
<<<<<<< HEAD
>>>>>>> 4adaa7f479 (GEOMESA-3100 Kafka layer views (#2784))
=======
=======
>>>>>>> d2cb939f5 (GEOMESA-3100 Kafka layer views (#2784))
<<<<<<< HEAD
<<<<<<< HEAD
<<<<<<< HEAD
<<<<<<< HEAD
<<<<<<< HEAD
>>>>>>> 6af71ff432 (GEOMESA-3100 Kafka layer views (#2784))
=======
>>>>>>> 5ca0cd6de (GEOMESA-3100 Kafka layer views (#2784))
>>>>>>> f6e840b5dd (GEOMESA-3100 Kafka layer views (#2784))
=======
=======
>>>>>>> bddfdbea5 (GEOMESA-3100 Kafka layer views (#2784))
>>>>>>> c589b832a5 (GEOMESA-3100 Kafka layer views (#2784))
=======
=======
>>>>>>> bddfdbea5 (GEOMESA-3100 Kafka layer views (#2784))
=======
>>>>>>> d0dc799ff (GEOMESA-3100 Kafka layer views (#2784))
>>>>>>> ffbc2ce32a (GEOMESA-3100 Kafka layer views (#2784))
=======
=======
>>>>>>> 95c83ca7f (GEOMESA-3100 Kafka layer views (#2784))
>>>>>>> fa68dd43c6 (GEOMESA-3100 Kafka layer views (#2784))
=======
=======
>>>>>>> 936154130 (GEOMESA-3100 Kafka layer views (#2784))
>>>>>>> 54ece16d15 (GEOMESA-3100 Kafka layer views (#2784))
=======
>>>>>>> c57b5f538a (GEOMESA-3100 Kafka layer views (#2784))
=======
=======
>>>>>>> ea3b40e18 (GEOMESA-3100 Kafka layer views (#2784))
>>>>>>> 88ef67cdfe (GEOMESA-3100 Kafka layer views (#2784))
=======
=======
>>>>>>> d2cb939f5 (GEOMESA-3100 Kafka layer views (#2784))
>>>>>>> 89fb9950ef (GEOMESA-3100 Kafka layer views (#2784))
=======
=======
>>>>>>> a377061090 (GEOMESA-3100 Kafka layer views (#2784))
=======
>>>>>>> eddb4eaca1 (GEOMESA-3100 Kafka layer views (#2784))
=======
>>>>>>> 416a95a4c0 (GEOMESA-3100 Kafka layer views (#2784))
=======
>>>>>>> f340d6feab (GEOMESA-3100 Kafka layer views (#2784))
=======
>>>>>>> eecabb92a (GEOMESA-3100 Kafka layer views (#2784))
<<<<<<< HEAD
>>>>>>> 98e7bf59d2 (GEOMESA-3100 Kafka layer views (#2784))
=======
=======
>>>>>>> 581f1dd15 (GEOMESA-3100 Kafka layer views (#2784))
<<<<<<< HEAD
>>>>>>> e24613dc4a (GEOMESA-3100 Kafka layer views (#2784))
=======
=======
=======
>>>>>>> bddfdbea5 (GEOMESA-3100 Kafka layer views (#2784))
>>>>>>> 1a5f68233 (GEOMESA-3100 Kafka layer views (#2784))
<<<<<<< HEAD
>>>>>>> dae1cf3cef (GEOMESA-3100 Kafka layer views (#2784))
=======
=======
>>>>>>> 73767737b (GEOMESA-3100 Kafka layer views (#2784))
<<<<<<< HEAD
>>>>>>> 50a71079c1 (GEOMESA-3100 Kafka layer views (#2784))
=======
=======
=======
>>>>>>> 95c83ca7f (GEOMESA-3100 Kafka layer views (#2784))
>>>>>>> 65a3a6e36 (GEOMESA-3100 Kafka layer views (#2784))
<<<<<<< HEAD
>>>>>>> 9e910620b3 (GEOMESA-3100 Kafka layer views (#2784))
=======
=======
>>>>>>> 429ffc55e (GEOMESA-3100 Kafka layer views (#2784))
<<<<<<< HEAD
>>>>>>> 4c325746bd (GEOMESA-3100 Kafka layer views (#2784))
=======
=======
>>>>>>> e7f3e6588 (GEOMESA-3100 Kafka layer views (#2784))
<<<<<<< HEAD
>>>>>>> 3ebcdb99d9 (GEOMESA-3100 Kafka layer views (#2784))
=======
=======
=======
>>>>>>> ea3b40e18 (GEOMESA-3100 Kafka layer views (#2784))
>>>>>>> 6f6887eb8 (GEOMESA-3100 Kafka layer views (#2784))
<<<<<<< HEAD
>>>>>>> fdf51402cf (GEOMESA-3100 Kafka layer views (#2784))
=======
=======
>>>>>>> 42549e8e3 (GEOMESA-3100 Kafka layer views (#2784))
<<<<<<< HEAD
>>>>>>> a377061090 (GEOMESA-3100 Kafka layer views (#2784))
=======
=======
=======
>>>>>>> 23a7d9849f (GEOMESA-3100 Kafka layer views (#2784))
=======
>>>>>>> bc97b07a31 (GEOMESA-3100 Kafka layer views (#2784))
=======
>>>>>>> a0314fb7f (GEOMESA-3100 Kafka layer views (#2784))
<<<<<<< HEAD
>>>>>>> 8ed2c9f7e5 (GEOMESA-3100 Kafka layer views (#2784))
<<<<<<< HEAD
>>>>>>> eddb4eaca1 (GEOMESA-3100 Kafka layer views (#2784))
=======
=======
=======
>>>>>>> 9236b0208 (GEOMESA-3100 Kafka layer views (#2784))
<<<<<<< HEAD
>>>>>>> c1d0543aac (GEOMESA-3100 Kafka layer views (#2784))
<<<<<<< HEAD
>>>>>>> be0c9d161a (GEOMESA-3100 Kafka layer views (#2784))
=======
=======
=======
=======
>>>>>>> bddfdbea5 (GEOMESA-3100 Kafka layer views (#2784))
>>>>>>> 862857ce2 (GEOMESA-3100 Kafka layer views (#2784))
<<<<<<< HEAD
>>>>>>> 8b9e99d11a (GEOMESA-3100 Kafka layer views (#2784))
<<<<<<< HEAD
>>>>>>> 7bdc1feea8 (GEOMESA-3100 Kafka layer views (#2784))
=======
=======
=======
>>>>>>> 28427dfd8 (GEOMESA-3100 Kafka layer views (#2784))
<<<<<<< HEAD
>>>>>>> 614fcb6bc3 (GEOMESA-3100 Kafka layer views (#2784))
<<<<<<< HEAD
>>>>>>> 9b15c8e14c (GEOMESA-3100 Kafka layer views (#2784))
=======
=======
=======
=======
>>>>>>> 95c83ca7f (GEOMESA-3100 Kafka layer views (#2784))
>>>>>>> 4231e686d (GEOMESA-3100 Kafka layer views (#2784))
<<<<<<< HEAD
>>>>>>> 69e3273ac1 (GEOMESA-3100 Kafka layer views (#2784))
<<<<<<< HEAD
>>>>>>> 3977ecc140 (GEOMESA-3100 Kafka layer views (#2784))
=======
=======
=======
>>>>>>> ac0357d36 (GEOMESA-3100 Kafka layer views (#2784))
<<<<<<< HEAD
>>>>>>> 04f82bbc57 (GEOMESA-3100 Kafka layer views (#2784))
<<<<<<< HEAD
>>>>>>> 495a1efc9f (GEOMESA-3100 Kafka layer views (#2784))
=======
=======
=======
>>>>>>> a62b956fb (GEOMESA-3100 Kafka layer views (#2784))
<<<<<<< HEAD
>>>>>>> e0773a1bd7 (GEOMESA-3100 Kafka layer views (#2784))
<<<<<<< HEAD
>>>>>>> 5d8c5baea0 (GEOMESA-3100 Kafka layer views (#2784))
=======
=======
=======
=======
>>>>>>> ea3b40e18 (GEOMESA-3100 Kafka layer views (#2784))
>>>>>>> 4adaa7f47 (GEOMESA-3100 Kafka layer views (#2784))
<<<<<<< HEAD
>>>>>>> ae5eea67f1 (GEOMESA-3100 Kafka layer views (#2784))
<<<<<<< HEAD
>>>>>>> 7628960f66 (GEOMESA-3100 Kafka layer views (#2784))
=======
=======
=======
>>>>>>> 6af71ff43 (GEOMESA-3100 Kafka layer views (#2784))
<<<<<<< HEAD
>>>>>>> 23a7d9849f (GEOMESA-3100 Kafka layer views (#2784))
<<<<<<< HEAD
>>>>>>> 416a95a4c0 (GEOMESA-3100 Kafka layer views (#2784))
=======
=======
=======
>>>>>>> 17f13b3a7 (GEOMESA-3100 Kafka layer views (#2784))
<<<<<<< HEAD
>>>>>>> 6069aba6b4 (GEOMESA-3100 Kafka layer views (#2784))
<<<<<<< HEAD
>>>>>>> ccfb3bd95e (GEOMESA-3100 Kafka layer views (#2784))
=======
=======
=======
>>>>>>> f6e840b5d (GEOMESA-3100 Kafka layer views (#2784))
<<<<<<< HEAD
>>>>>>> 4480b2d1b9 (GEOMESA-3100 Kafka layer views (#2784))
<<<<<<< HEAD
>>>>>>> b5abc19ca4 (GEOMESA-3100 Kafka layer views (#2784))
=======
=======
=======
=======
>>>>>>> bddfdbea5 (GEOMESA-3100 Kafka layer views (#2784))
>>>>>>> c589b832a (GEOMESA-3100 Kafka layer views (#2784))
<<<<<<< HEAD
>>>>>>> 9e433ba57e (GEOMESA-3100 Kafka layer views (#2784))
<<<<<<< HEAD
>>>>>>> 2750a5beef (GEOMESA-3100 Kafka layer views (#2784))
=======
=======
=======
>>>>>>> ffbc2ce32 (GEOMESA-3100 Kafka layer views (#2784))
<<<<<<< HEAD
>>>>>>> 2df2640494 (GEOMESA-3100 Kafka layer views (#2784))
<<<<<<< HEAD
>>>>>>> cb4aa55ae3 (GEOMESA-3100 Kafka layer views (#2784))
=======
=======
=======
=======
>>>>>>> 95c83ca7f (GEOMESA-3100 Kafka layer views (#2784))
>>>>>>> fa68dd43c (GEOMESA-3100 Kafka layer views (#2784))
<<<<<<< HEAD
>>>>>>> 23f312535d (GEOMESA-3100 Kafka layer views (#2784))
<<<<<<< HEAD
>>>>>>> 468da42855 (GEOMESA-3100 Kafka layer views (#2784))
=======
=======
=======
>>>>>>> 54ece16d1 (GEOMESA-3100 Kafka layer views (#2784))
<<<<<<< HEAD
>>>>>>> 826636f69d (GEOMESA-3100 Kafka layer views (#2784))
<<<<<<< HEAD
>>>>>>> 5dd3eb3a6d (GEOMESA-3100 Kafka layer views (#2784))
=======
=======
=======
>>>>>>> c57b5f538 (GEOMESA-3100 Kafka layer views (#2784))
<<<<<<< HEAD
>>>>>>> 1e11ed51a6 (GEOMESA-3100 Kafka layer views (#2784))
<<<<<<< HEAD
>>>>>>> d530f7b24a (GEOMESA-3100 Kafka layer views (#2784))
=======
=======
=======
=======
>>>>>>> ea3b40e18 (GEOMESA-3100 Kafka layer views (#2784))
>>>>>>> 88ef67cdf (GEOMESA-3100 Kafka layer views (#2784))
<<<<<<< HEAD
>>>>>>> 976f319530 (GEOMESA-3100 Kafka layer views (#2784))
<<<<<<< HEAD
>>>>>>> 5e230912b1 (GEOMESA-3100 Kafka layer views (#2784))
=======
=======
=======
>>>>>>> 89fb9950e (GEOMESA-3100 Kafka layer views (#2784))
>>>>>>> bc97b07a31 (GEOMESA-3100 Kafka layer views (#2784))
>>>>>>> f340d6feab (GEOMESA-3100 Kafka layer views (#2784))
=======
>>>>>>> 5ca0cd6de (GEOMESA-3100 Kafka layer views (#2784))
>>>>>>> 64646d61ed (GEOMESA-3100 Kafka layer views (#2784))
=======
=======
>>>>>>> d0dc799ff (GEOMESA-3100 Kafka layer views (#2784))
>>>>>>> 0e42c51dc0 (GEOMESA-3100 Kafka layer views (#2784))
=======
=======
>>>>>>> 95c83ca7f (GEOMESA-3100 Kafka layer views (#2784))
>>>>>>> 19aa61c0de (GEOMESA-3100 Kafka layer views (#2784))
=======
=======
>>>>>>> 936154130 (GEOMESA-3100 Kafka layer views (#2784))
>>>>>>> 626c8f9b93 (GEOMESA-3100 Kafka layer views (#2784))
=======
>>>>>>> 9a5d6d2815 (GEOMESA-3100 Kafka layer views (#2784))
=======
=======
>>>>>>> ea3b40e18 (GEOMESA-3100 Kafka layer views (#2784))
>>>>>>> f4b2369e9a (GEOMESA-3100 Kafka layer views (#2784))
=======
=======
>>>>>>> d2cb939f5 (GEOMESA-3100 Kafka layer views (#2784))
>>>>>>> 305a9263eb (GEOMESA-3100 Kafka layer views (#2784))
=======
=======
>>>>>>> 5dc1f86700 (GEOMESA-3100 Kafka layer views (#2784))
import java.io.{Closeable, IOException, StringReader}
=======
import java.io.{Closeable, IOException}
>>>>>>> af0a88eb1 (GEOMESA-3100 Kafka layer views (#2784))
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
>>>>>>> bddfdbea54 (GEOMESA-3100 Kafka layer views (#2784))
=======
=======
>>>>>>> 19aa61c0de (GEOMESA-3100 Kafka layer views (#2784))
=======
>>>>>>> 626c8f9b93 (GEOMESA-3100 Kafka layer views (#2784))
=======
>>>>>>> 9a5d6d2815 (GEOMESA-3100 Kafka layer views (#2784))
=======
>>>>>>> f4b2369e9a (GEOMESA-3100 Kafka layer views (#2784))
=======
>>>>>>> 305a9263eb (GEOMESA-3100 Kafka layer views (#2784))
=======
>>>>>>> d0dc799ff (GEOMESA-3100 Kafka layer views (#2784))
>>>>>>> 0e42c51dc0 (GEOMESA-3100 Kafka layer views (#2784))
=======
>>>>>>> 936154130 (GEOMESA-3100 Kafka layer views (#2784))
=======
>>>>>>> 2f6607232 (GEOMESA-3100 Kafka layer views (#2784))
=======
=======
>>>>>>> d0dc799ff (GEOMESA-3100 Kafka layer views (#2784))
>>>>>>> ea3b40e18 (GEOMESA-3100 Kafka layer views (#2784))
=======
<<<<<<< HEAD
=======
>>>>>>> 9361541304 (GEOMESA-3100 Kafka layer views (#2784))
=======
>>>>>>> 2f66072323 (GEOMESA-3100 Kafka layer views (#2784))
=======
=======
>>>>>>> 4231e686dd (GEOMESA-3100 Kafka layer views (#2784))
=======
>>>>>>> ac0357d362 (GEOMESA-3100 Kafka layer views (#2784))
=======
>>>>>>> a62b956fb6 (GEOMESA-3100 Kafka layer views (#2784))
=======
>>>>>>> 4adaa7f479 (GEOMESA-3100 Kafka layer views (#2784))
=======
>>>>>>> 6af71ff432 (GEOMESA-3100 Kafka layer views (#2784))
=======
>>>>>>> fa68dd43c6 (GEOMESA-3100 Kafka layer views (#2784))
=======
>>>>>>> 54ece16d15 (GEOMESA-3100 Kafka layer views (#2784))
=======
>>>>>>> c57b5f538a (GEOMESA-3100 Kafka layer views (#2784))
=======
>>>>>>> 88ef67cdfe (GEOMESA-3100 Kafka layer views (#2784))
=======
>>>>>>> 89fb9950ef (GEOMESA-3100 Kafka layer views (#2784))
=======
>>>>>>> 98e7bf59d2 (GEOMESA-3100 Kafka layer views (#2784))
=======
>>>>>>> e24613dc4a (GEOMESA-3100 Kafka layer views (#2784))
=======
>>>>>>> dae1cf3cef (GEOMESA-3100 Kafka layer views (#2784))
=======
>>>>>>> 50a71079c1 (GEOMESA-3100 Kafka layer views (#2784))
=======
=======
>>>>>>> 4c325746bd (GEOMESA-3100 Kafka layer views (#2784))
=======
>>>>>>> 3ebcdb99d9 (GEOMESA-3100 Kafka layer views (#2784))
=======
>>>>>>> fdf51402cf (GEOMESA-3100 Kafka layer views (#2784))
=======
>>>>>>> a377061090 (GEOMESA-3100 Kafka layer views (#2784))
=======
>>>>>>> eddb4eaca1 (GEOMESA-3100 Kafka layer views (#2784))
=======
>>>>>>> be0c9d161a (GEOMESA-3100 Kafka layer views (#2784))
=======
>>>>>>> 7bdc1feea8 (GEOMESA-3100 Kafka layer views (#2784))
=======
>>>>>>> 9b15c8e14c (GEOMESA-3100 Kafka layer views (#2784))
=======
>>>>>>> 3977ecc140 (GEOMESA-3100 Kafka layer views (#2784))
=======
>>>>>>> 495a1efc9f (GEOMESA-3100 Kafka layer views (#2784))
=======
>>>>>>> 5d8c5baea0 (GEOMESA-3100 Kafka layer views (#2784))
=======
>>>>>>> 7628960f66 (GEOMESA-3100 Kafka layer views (#2784))
=======
>>>>>>> 416a95a4c0 (GEOMESA-3100 Kafka layer views (#2784))
=======
>>>>>>> ccfb3bd95e (GEOMESA-3100 Kafka layer views (#2784))
=======
>>>>>>> b5abc19ca4 (GEOMESA-3100 Kafka layer views (#2784))
=======
>>>>>>> 2750a5beef (GEOMESA-3100 Kafka layer views (#2784))
=======
>>>>>>> cb4aa55ae3 (GEOMESA-3100 Kafka layer views (#2784))
=======
>>>>>>> 468da42855 (GEOMESA-3100 Kafka layer views (#2784))
=======
>>>>>>> 5dd3eb3a6d (GEOMESA-3100 Kafka layer views (#2784))
=======
>>>>>>> d530f7b24a (GEOMESA-3100 Kafka layer views (#2784))
=======
>>>>>>> 5e230912b1 (GEOMESA-3100 Kafka layer views (#2784))
=======
>>>>>>> f340d6feab (GEOMESA-3100 Kafka layer views (#2784))
=======
>>>>>>> 65a3a6e36 (GEOMESA-3100 Kafka layer views (#2784))
>>>>>>> 9e910620b3 (GEOMESA-3100 Kafka layer views (#2784))
=======
>>>>>>> 429ffc55e (GEOMESA-3100 Kafka layer views (#2784))
=======
>>>>>>> e7f3e6588 (GEOMESA-3100 Kafka layer views (#2784))
=======
>>>>>>> 6f6887eb8 (GEOMESA-3100 Kafka layer views (#2784))
=======
>>>>>>> 42549e8e3 (GEOMESA-3100 Kafka layer views (#2784))
=======
>>>>>>> 8ed2c9f7e5 (GEOMESA-3100 Kafka layer views (#2784))
=======
>>>>>>> c1d0543aac (GEOMESA-3100 Kafka layer views (#2784))
=======
>>>>>>> 8b9e99d11a (GEOMESA-3100 Kafka layer views (#2784))
=======
>>>>>>> 614fcb6bc3 (GEOMESA-3100 Kafka layer views (#2784))
=======
=======
>>>>>>> 04f82bbc57 (GEOMESA-3100 Kafka layer views (#2784))
=======
>>>>>>> e0773a1bd7 (GEOMESA-3100 Kafka layer views (#2784))
=======
>>>>>>> ae5eea67f1 (GEOMESA-3100 Kafka layer views (#2784))
=======
>>>>>>> 23a7d9849f (GEOMESA-3100 Kafka layer views (#2784))
=======
>>>>>>> 6069aba6b4 (GEOMESA-3100 Kafka layer views (#2784))
=======
>>>>>>> 4480b2d1b9 (GEOMESA-3100 Kafka layer views (#2784))
=======
=======
=======
>>>>>>> 23f312535d (GEOMESA-3100 Kafka layer views (#2784))
=======
>>>>>>> 826636f69d (GEOMESA-3100 Kafka layer views (#2784))
=======
>>>>>>> 1e11ed51a6 (GEOMESA-3100 Kafka layer views (#2784))
=======
>>>>>>> 976f319530 (GEOMESA-3100 Kafka layer views (#2784))
=======
>>>>>>> bc97b07a31 (GEOMESA-3100 Kafka layer views (#2784))
=======
=======
>>>>>>> d0dc799ff (GEOMESA-3100 Kafka layer views (#2784))
>>>>>>> ffbc2ce32 (GEOMESA-3100 Kafka layer views (#2784))
>>>>>>> 2df2640494 (GEOMESA-3100 Kafka layer views (#2784))
=======
>>>>>>> c589b832a (GEOMESA-3100 Kafka layer views (#2784))
>>>>>>> 9e433ba57e (GEOMESA-3100 Kafka layer views (#2784))
=======
>>>>>>> 4231e686d (GEOMESA-3100 Kafka layer views (#2784))
>>>>>>> 69e3273ac1 (GEOMESA-3100 Kafka layer views (#2784))
=======
>>>>>>> ac0357d36 (GEOMESA-3100 Kafka layer views (#2784))
=======
>>>>>>> a62b956fb (GEOMESA-3100 Kafka layer views (#2784))
=======
>>>>>>> 4adaa7f47 (GEOMESA-3100 Kafka layer views (#2784))
=======
>>>>>>> 6af71ff43 (GEOMESA-3100 Kafka layer views (#2784))
=======
>>>>>>> fa68dd43c (GEOMESA-3100 Kafka layer views (#2784))
=======
>>>>>>> 54ece16d1 (GEOMESA-3100 Kafka layer views (#2784))
=======
>>>>>>> c57b5f538 (GEOMESA-3100 Kafka layer views (#2784))
=======
>>>>>>> 88ef67cdf (GEOMESA-3100 Kafka layer views (#2784))
=======
>>>>>>> 89fb9950e (GEOMESA-3100 Kafka layer views (#2784))
=======
>>>>>>> d0dc799ff (GEOMESA-3100 Kafka layer views (#2784))
>>>>>>> ea3b40e187 (GEOMESA-3100 Kafka layer views (#2784))
=======
>>>>>>> 9236b02087 (GEOMESA-3100 Kafka layer views (#2784))
=======
>>>>>>> 862857ce2e (GEOMESA-3100 Kafka layer views (#2784))
=======
=======
>>>>>>> d0dc799ff (GEOMESA-3100 Kafka layer views (#2784))
>>>>>>> 28427dfd8f (GEOMESA-3100 Kafka layer views (#2784))
=======
>>>>>>> 936154130 (GEOMESA-3100 Kafka layer views (#2784))
=======
>>>>>>> 2f6607232 (GEOMESA-3100 Kafka layer views (#2784))
=======
=======
>>>>>>> d0dc799ff (GEOMESA-3100 Kafka layer views (#2784))
>>>>>>> ea3b40e18 (GEOMESA-3100 Kafka layer views (#2784))
=======
>>>>>>> f6e840b5dd (GEOMESA-3100 Kafka layer views (#2784))
=======
>>>>>>> c589b832a5 (GEOMESA-3100 Kafka layer views (#2784))
=======
=======
>>>>>>> d0dc799ff (GEOMESA-3100 Kafka layer views (#2784))
>>>>>>> ffbc2ce32a (GEOMESA-3100 Kafka layer views (#2784))
=======
>>>>>>> 936154130 (GEOMESA-3100 Kafka layer views (#2784))
=======
>>>>>>> 2f6607232 (GEOMESA-3100 Kafka layer views (#2784))
=======
=======
>>>>>>> d0dc799ff (GEOMESA-3100 Kafka layer views (#2784))
>>>>>>> ea3b40e18 (GEOMESA-3100 Kafka layer views (#2784))
=======
<<<<<<< HEAD
>>>>>>> 2f6607232 (GEOMESA-3100 Kafka layer views (#2784))
=======
=======
>>>>>>> d0dc799ff (GEOMESA-3100 Kafka layer views (#2784))
>>>>>>> ea3b40e18 (GEOMESA-3100 Kafka layer views (#2784))
=======
<<<<<<< HEAD
>>>>>>> 2f6607232 (GEOMESA-3100 Kafka layer views (#2784))
=======
=======
>>>>>>> d0dc799ff (GEOMESA-3100 Kafka layer views (#2784))
>>>>>>> ea3b40e18 (GEOMESA-3100 Kafka layer views (#2784))
=======
>>>>>>> 9236b0208 (GEOMESA-3100 Kafka layer views (#2784))
=======
>>>>>>> 862857ce2 (GEOMESA-3100 Kafka layer views (#2784))
=======
=======
>>>>>>> d0dc799ff (GEOMESA-3100 Kafka layer views (#2784))
>>>>>>> 28427dfd8 (GEOMESA-3100 Kafka layer views (#2784))
=======
=======
>>>>>>> ac0357d36 (GEOMESA-3100 Kafka layer views (#2784))
=======
=======
>>>>>>> f6e840b5d (GEOMESA-3100 Kafka layer views (#2784))
=======
>>>>>>> 54ece16d1 (GEOMESA-3100 Kafka layer views (#2784))
<<<<<<< HEAD
>>>>>>> 2f6607232 (GEOMESA-3100 Kafka layer views (#2784))
=======
=======
>>>>>>> d0dc799ff (GEOMESA-3100 Kafka layer views (#2784))
>>>>>>> ea3b40e18 (GEOMESA-3100 Kafka layer views (#2784))
=======
>>>>>>> 581f1dd15 (GEOMESA-3100 Kafka layer views (#2784))
=======
>>>>>>> 1a5f68233 (GEOMESA-3100 Kafka layer views (#2784))
=======
=======
>>>>>>> d0dc799ff (GEOMESA-3100 Kafka layer views (#2784))
>>>>>>> 73767737b (GEOMESA-3100 Kafka layer views (#2784))
=======
=======
>>>>>>> 429ffc55e (GEOMESA-3100 Kafka layer views (#2784))
=======
=======
>>>>>>> 64646d61ed (GEOMESA-3100 Kafka layer views (#2784))
<<<<<<< HEAD
>>>>>>> locationtech-main
=======
>>>>>>> 58286bfd3 (GEOMESA-3100 Kafka layer views (#2784))
>>>>>>> 5ca0cd6de (GEOMESA-3100 Kafka layer views (#2784))
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
>>>>>>> d0dc799ff1 (GEOMESA-3100 Kafka layer views (#2784))
=======
=======
>>>>>>> 5ca0cd6de (GEOMESA-3100 Kafka layer views (#2784))
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
>>>>>>> d0dc799ff1 (GEOMESA-3100 Kafka layer views (#2784))
=======
>>>>>>> 5ca0cd6de (GEOMESA-3100 Kafka layer views (#2784))
>>>>>>> 9361541304 (GEOMESA-3100 Kafka layer views (#2784))
=======
=======
>>>>>>> bddfdbea5 (GEOMESA-3100 Kafka layer views (#2784))
>>>>>>> 2f66072323 (GEOMESA-3100 Kafka layer views (#2784))
=======
=======
>>>>>>> ac0357d362 (GEOMESA-3100 Kafka layer views (#2784))
=======
>>>>>>> a62b956fb6 (GEOMESA-3100 Kafka layer views (#2784))
=======
=======
>>>>>>> e24613dc4a (GEOMESA-3100 Kafka layer views (#2784))
=======
>>>>>>> dae1cf3cef (GEOMESA-3100 Kafka layer views (#2784))
=======
>>>>>>> 50a71079c1 (GEOMESA-3100 Kafka layer views (#2784))
=======
>>>>>>> 4c325746bd (GEOMESA-3100 Kafka layer views (#2784))
=======
>>>>>>> 3ebcdb99d9 (GEOMESA-3100 Kafka layer views (#2784))
=======
>>>>>>> fdf51402cf (GEOMESA-3100 Kafka layer views (#2784))
=======
=======
>>>>>>> 7bdc1feea8 (GEOMESA-3100 Kafka layer views (#2784))
=======
>>>>>>> 9b15c8e14c (GEOMESA-3100 Kafka layer views (#2784))
=======
>>>>>>> 495a1efc9f (GEOMESA-3100 Kafka layer views (#2784))
=======
>>>>>>> 5d8c5baea0 (GEOMESA-3100 Kafka layer views (#2784))
=======
>>>>>>> 7628960f66 (GEOMESA-3100 Kafka layer views (#2784))
=======
>>>>>>> b5abc19ca4 (GEOMESA-3100 Kafka layer views (#2784))
=======
>>>>>>> 2750a5beef (GEOMESA-3100 Kafka layer views (#2784))
=======
>>>>>>> cb4aa55ae3 (GEOMESA-3100 Kafka layer views (#2784))
=======
>>>>>>> 5dd3eb3a6d (GEOMESA-3100 Kafka layer views (#2784))
=======
>>>>>>> d530f7b24a (GEOMESA-3100 Kafka layer views (#2784))
=======
>>>>>>> 5e230912b1 (GEOMESA-3100 Kafka layer views (#2784))
=======
>>>>>>> c1d0543aac (GEOMESA-3100 Kafka layer views (#2784))
>>>>>>> be0c9d161a (GEOMESA-3100 Kafka layer views (#2784))
=======
>>>>>>> 8b9e99d11a (GEOMESA-3100 Kafka layer views (#2784))
=======
>>>>>>> ea3b40e18 (GEOMESA-3100 Kafka layer views (#2784))
>>>>>>> 4adaa7f479 (GEOMESA-3100 Kafka layer views (#2784))
=======
>>>>>>> 54ece16d15 (GEOMESA-3100 Kafka layer views (#2784))
=======
>>>>>>> c57b5f538a (GEOMESA-3100 Kafka layer views (#2784))
=======
=======
>>>>>>> ea3b40e18 (GEOMESA-3100 Kafka layer views (#2784))
>>>>>>> 88ef67cdfe (GEOMESA-3100 Kafka layer views (#2784))
=======
>>>>>>> 73767737b (GEOMESA-3100 Kafka layer views (#2784))
=======
>>>>>>> 429ffc55e (GEOMESA-3100 Kafka layer views (#2784))
=======
>>>>>>> e7f3e6588 (GEOMESA-3100 Kafka layer views (#2784))
=======
=======
>>>>>>> ea3b40e18 (GEOMESA-3100 Kafka layer views (#2784))
>>>>>>> 6f6887eb8 (GEOMESA-3100 Kafka layer views (#2784))
=======
=======
>>>>>>> 04f82bbc57 (GEOMESA-3100 Kafka layer views (#2784))
=======
>>>>>>> e0773a1bd7 (GEOMESA-3100 Kafka layer views (#2784))
=======
>>>>>>> ae5eea67f1 (GEOMESA-3100 Kafka layer views (#2784))
=======
>>>>>>> 4480b2d1b9 (GEOMESA-3100 Kafka layer views (#2784))
=======
>>>>>>> 9e433ba57e (GEOMESA-3100 Kafka layer views (#2784))
=======
>>>>>>> 2df2640494 (GEOMESA-3100 Kafka layer views (#2784))
=======
>>>>>>> 826636f69d (GEOMESA-3100 Kafka layer views (#2784))
=======
>>>>>>> 1e11ed51a6 (GEOMESA-3100 Kafka layer views (#2784))
=======
>>>>>>> 976f319530 (GEOMESA-3100 Kafka layer views (#2784))
=======
>>>>>>> ea3b40e18 (GEOMESA-3100 Kafka layer views (#2784))
=======
>>>>>>> 28427dfd8 (GEOMESA-3100 Kafka layer views (#2784))
>>>>>>> 614fcb6bc3 (GEOMESA-3100 Kafka layer views (#2784))
=======
>>>>>>> ac0357d36 (GEOMESA-3100 Kafka layer views (#2784))
=======
>>>>>>> a62b956fb (GEOMESA-3100 Kafka layer views (#2784))
=======
=======
>>>>>>> ea3b40e18 (GEOMESA-3100 Kafka layer views (#2784))
>>>>>>> 4adaa7f47 (GEOMESA-3100 Kafka layer views (#2784))
=======
>>>>>>> ffbc2ce32 (GEOMESA-3100 Kafka layer views (#2784))
=======
>>>>>>> 54ece16d1 (GEOMESA-3100 Kafka layer views (#2784))
=======
>>>>>>> c57b5f538 (GEOMESA-3100 Kafka layer views (#2784))
=======
=======
>>>>>>> ea3b40e18 (GEOMESA-3100 Kafka layer views (#2784))
>>>>>>> 88ef67cdf (GEOMESA-3100 Kafka layer views (#2784))
=======
>>>>>>> bddfdbea5 (GEOMESA-3100 Kafka layer views (#2784))
=======
>>>>>>> d0dc799ff (GEOMESA-3100 Kafka layer views (#2784))
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
>>>>>>> ea3b40e187 (GEOMESA-3100 Kafka layer views (#2784))
=======
>>>>>>> 5ca0cd6de (GEOMESA-3100 Kafka layer views (#2784))
>>>>>>> 9236b02087 (GEOMESA-3100 Kafka layer views (#2784))
=======
=======
>>>>>>> bddfdbea5 (GEOMESA-3100 Kafka layer views (#2784))
>>>>>>> 862857ce2e (GEOMESA-3100 Kafka layer views (#2784))
=======
=======
>>>>>>> bddfdbea5 (GEOMESA-3100 Kafka layer views (#2784))
=======
>>>>>>> d0dc799ff (GEOMESA-3100 Kafka layer views (#2784))
>>>>>>> 28427dfd8f (GEOMESA-3100 Kafka layer views (#2784))
=======
=======
>>>>>>> 4adaa7f479 (GEOMESA-3100 Kafka layer views (#2784))
=======
>>>>>>> 88ef67cdfe (GEOMESA-3100 Kafka layer views (#2784))
=======
>>>>>>> 50a71079c1 (GEOMESA-3100 Kafka layer views (#2784))
=======
>>>>>>> 9e910620b3 (GEOMESA-3100 Kafka layer views (#2784))
=======
=======
>>>>>>> 9b15c8e14c (GEOMESA-3100 Kafka layer views (#2784))
=======
>>>>>>> 3977ecc140 (GEOMESA-3100 Kafka layer views (#2784))
=======
>>>>>>> 7628960f66 (GEOMESA-3100 Kafka layer views (#2784))
=======
>>>>>>> cb4aa55ae3 (GEOMESA-3100 Kafka layer views (#2784))
=======
>>>>>>> 468da42855 (GEOMESA-3100 Kafka layer views (#2784))
=======
>>>>>>> 5e230912b1 (GEOMESA-3100 Kafka layer views (#2784))
=======
>>>>>>> 6f6887eb8 (GEOMESA-3100 Kafka layer views (#2784))
>>>>>>> fdf51402cf (GEOMESA-3100 Kafka layer views (#2784))
=======
>>>>>>> 614fcb6bc3 (GEOMESA-3100 Kafka layer views (#2784))
=======
>>>>>>> 69e3273ac1 (GEOMESA-3100 Kafka layer views (#2784))
=======
=======
>>>>>>> 2df2640494 (GEOMESA-3100 Kafka layer views (#2784))
=======
>>>>>>> 23f312535d (GEOMESA-3100 Kafka layer views (#2784))
=======
>>>>>>> 976f319530 (GEOMESA-3100 Kafka layer views (#2784))
=======
>>>>>>> 4adaa7f47 (GEOMESA-3100 Kafka layer views (#2784))
>>>>>>> ae5eea67f1 (GEOMESA-3100 Kafka layer views (#2784))
=======
>>>>>>> 88ef67cdf (GEOMESA-3100 Kafka layer views (#2784))
=======
>>>>>>> 95c83ca7f (GEOMESA-3100 Kafka layer views (#2784))
<<<<<<< HEAD
<<<<<<< HEAD
>>>>>>> 4231e686dd (GEOMESA-3100 Kafka layer views (#2784))
=======
=======
>>>>>>> 936154130 (GEOMESA-3100 Kafka layer views (#2784))
<<<<<<< HEAD
<<<<<<< HEAD
<<<<<<< HEAD
<<<<<<< HEAD
<<<<<<< HEAD
<<<<<<< HEAD
<<<<<<< HEAD
<<<<<<< HEAD
>>>>>>> ac0357d362 (GEOMESA-3100 Kafka layer views (#2784))
=======
=======
>>>>>>> c57b5f538a (GEOMESA-3100 Kafka layer views (#2784))
=======
>>>>>>> 4c325746bd (GEOMESA-3100 Kafka layer views (#2784))
=======
=======
>>>>>>> 495a1efc9f (GEOMESA-3100 Kafka layer views (#2784))
=======
>>>>>>> 5d8c5baea0 (GEOMESA-3100 Kafka layer views (#2784))
=======
>>>>>>> 5dd3eb3a6d (GEOMESA-3100 Kafka layer views (#2784))
=======
>>>>>>> d530f7b24a (GEOMESA-3100 Kafka layer views (#2784))
=======
>>>>>>> e7f3e6588 (GEOMESA-3100 Kafka layer views (#2784))
>>>>>>> 3ebcdb99d9 (GEOMESA-3100 Kafka layer views (#2784))
=======
>>>>>>> 04f82bbc57 (GEOMESA-3100 Kafka layer views (#2784))
=======
=======
>>>>>>> 826636f69d (GEOMESA-3100 Kafka layer views (#2784))
=======
>>>>>>> 1e11ed51a6 (GEOMESA-3100 Kafka layer views (#2784))
=======
>>>>>>> a62b956fb (GEOMESA-3100 Kafka layer views (#2784))
>>>>>>> e0773a1bd7 (GEOMESA-3100 Kafka layer views (#2784))
=======
>>>>>>> c57b5f538 (GEOMESA-3100 Kafka layer views (#2784))
=======
=======
>>>>>>> bddfdbea5 (GEOMESA-3100 Kafka layer views (#2784))
>>>>>>> 2f6607232 (GEOMESA-3100 Kafka layer views (#2784))
<<<<<<< HEAD
<<<<<<< HEAD
<<<<<<< HEAD
<<<<<<< HEAD
<<<<<<< HEAD
<<<<<<< HEAD
<<<<<<< HEAD
<<<<<<< HEAD
<<<<<<< HEAD
>>>>>>> a62b956fb6 (GEOMESA-3100 Kafka layer views (#2784))
=======
=======
>>>>>>> 3ebcdb99d9 (GEOMESA-3100 Kafka layer views (#2784))
=======
>>>>>>> fdf51402cf (GEOMESA-3100 Kafka layer views (#2784))
=======
=======
>>>>>>> 7628960f66 (GEOMESA-3100 Kafka layer views (#2784))
=======
>>>>>>> d530f7b24a (GEOMESA-3100 Kafka layer views (#2784))
=======
>>>>>>> 5e230912b1 (GEOMESA-3100 Kafka layer views (#2784))
=======
>>>>>>> e0773a1bd7 (GEOMESA-3100 Kafka layer views (#2784))
>>>>>>> 5d8c5baea0 (GEOMESA-3100 Kafka layer views (#2784))
=======
>>>>>>> ae5eea67f1 (GEOMESA-3100 Kafka layer views (#2784))
=======
>>>>>>> 1e11ed51a6 (GEOMESA-3100 Kafka layer views (#2784))
=======
>>>>>>> 976f319530 (GEOMESA-3100 Kafka layer views (#2784))
=======
>>>>>>> ea3b40e18 (GEOMESA-3100 Kafka layer views (#2784))
<<<<<<< HEAD
<<<<<<< HEAD
>>>>>>> 4adaa7f479 (GEOMESA-3100 Kafka layer views (#2784))
=======
=======
>>>>>>> d2cb939f5 (GEOMESA-3100 Kafka layer views (#2784))
<<<<<<< HEAD
<<<<<<< HEAD
<<<<<<< HEAD
<<<<<<< HEAD
<<<<<<< HEAD
>>>>>>> 6af71ff432 (GEOMESA-3100 Kafka layer views (#2784))
=======
>>>>>>> 5ca0cd6de (GEOMESA-3100 Kafka layer views (#2784))
>>>>>>> f6e840b5dd (GEOMESA-3100 Kafka layer views (#2784))
=======
=======
>>>>>>> bddfdbea5 (GEOMESA-3100 Kafka layer views (#2784))
>>>>>>> c589b832a5 (GEOMESA-3100 Kafka layer views (#2784))
=======
=======
>>>>>>> bddfdbea5 (GEOMESA-3100 Kafka layer views (#2784))
=======
>>>>>>> d0dc799ff (GEOMESA-3100 Kafka layer views (#2784))
>>>>>>> ffbc2ce32a (GEOMESA-3100 Kafka layer views (#2784))
=======
=======
>>>>>>> 95c83ca7f (GEOMESA-3100 Kafka layer views (#2784))
>>>>>>> fa68dd43c6 (GEOMESA-3100 Kafka layer views (#2784))
=======
=======
>>>>>>> 936154130 (GEOMESA-3100 Kafka layer views (#2784))
>>>>>>> 54ece16d15 (GEOMESA-3100 Kafka layer views (#2784))
=======
>>>>>>> c57b5f538a (GEOMESA-3100 Kafka layer views (#2784))
=======
=======
>>>>>>> ea3b40e18 (GEOMESA-3100 Kafka layer views (#2784))
>>>>>>> 88ef67cdfe (GEOMESA-3100 Kafka layer views (#2784))
=======
=======
>>>>>>> d2cb939f5 (GEOMESA-3100 Kafka layer views (#2784))
>>>>>>> 89fb9950ef (GEOMESA-3100 Kafka layer views (#2784))
=======
=======
>>>>>>> a377061090 (GEOMESA-3100 Kafka layer views (#2784))
=======
>>>>>>> eddb4eaca1 (GEOMESA-3100 Kafka layer views (#2784))
=======
>>>>>>> 416a95a4c0 (GEOMESA-3100 Kafka layer views (#2784))
=======
>>>>>>> f340d6feab (GEOMESA-3100 Kafka layer views (#2784))
=======
>>>>>>> eecabb92a (GEOMESA-3100 Kafka layer views (#2784))
<<<<<<< HEAD
>>>>>>> 98e7bf59d2 (GEOMESA-3100 Kafka layer views (#2784))
=======
=======
>>>>>>> 581f1dd15 (GEOMESA-3100 Kafka layer views (#2784))
<<<<<<< HEAD
>>>>>>> e24613dc4a (GEOMESA-3100 Kafka layer views (#2784))
=======
=======
=======
>>>>>>> bddfdbea5 (GEOMESA-3100 Kafka layer views (#2784))
>>>>>>> 1a5f68233 (GEOMESA-3100 Kafka layer views (#2784))
<<<<<<< HEAD
>>>>>>> dae1cf3cef (GEOMESA-3100 Kafka layer views (#2784))
=======
=======
>>>>>>> 73767737b (GEOMESA-3100 Kafka layer views (#2784))
<<<<<<< HEAD
>>>>>>> 50a71079c1 (GEOMESA-3100 Kafka layer views (#2784))
=======
=======
=======
>>>>>>> 95c83ca7f (GEOMESA-3100 Kafka layer views (#2784))
>>>>>>> 65a3a6e36 (GEOMESA-3100 Kafka layer views (#2784))
<<<<<<< HEAD
>>>>>>> 9e910620b3 (GEOMESA-3100 Kafka layer views (#2784))
=======
=======
>>>>>>> 429ffc55e (GEOMESA-3100 Kafka layer views (#2784))
<<<<<<< HEAD
>>>>>>> 4c325746bd (GEOMESA-3100 Kafka layer views (#2784))
=======
=======
>>>>>>> e7f3e6588 (GEOMESA-3100 Kafka layer views (#2784))
<<<<<<< HEAD
>>>>>>> 3ebcdb99d9 (GEOMESA-3100 Kafka layer views (#2784))
=======
=======
=======
>>>>>>> ea3b40e18 (GEOMESA-3100 Kafka layer views (#2784))
>>>>>>> 6f6887eb8 (GEOMESA-3100 Kafka layer views (#2784))
<<<<<<< HEAD
>>>>>>> fdf51402cf (GEOMESA-3100 Kafka layer views (#2784))
=======
=======
>>>>>>> 42549e8e3 (GEOMESA-3100 Kafka layer views (#2784))
<<<<<<< HEAD
>>>>>>> a377061090 (GEOMESA-3100 Kafka layer views (#2784))
=======
=======
=======
>>>>>>> 23a7d9849f (GEOMESA-3100 Kafka layer views (#2784))
=======
>>>>>>> bc97b07a31 (GEOMESA-3100 Kafka layer views (#2784))
=======
>>>>>>> a0314fb7f (GEOMESA-3100 Kafka layer views (#2784))
<<<<<<< HEAD
>>>>>>> 8ed2c9f7e5 (GEOMESA-3100 Kafka layer views (#2784))
<<<<<<< HEAD
>>>>>>> eddb4eaca1 (GEOMESA-3100 Kafka layer views (#2784))
=======
=======
=======
>>>>>>> 9236b0208 (GEOMESA-3100 Kafka layer views (#2784))
<<<<<<< HEAD
>>>>>>> c1d0543aac (GEOMESA-3100 Kafka layer views (#2784))
<<<<<<< HEAD
>>>>>>> be0c9d161a (GEOMESA-3100 Kafka layer views (#2784))
=======
=======
=======
=======
>>>>>>> bddfdbea5 (GEOMESA-3100 Kafka layer views (#2784))
>>>>>>> 862857ce2 (GEOMESA-3100 Kafka layer views (#2784))
<<<<<<< HEAD
>>>>>>> 8b9e99d11a (GEOMESA-3100 Kafka layer views (#2784))
<<<<<<< HEAD
>>>>>>> 7bdc1feea8 (GEOMESA-3100 Kafka layer views (#2784))
=======
=======
=======
>>>>>>> 28427dfd8 (GEOMESA-3100 Kafka layer views (#2784))
<<<<<<< HEAD
>>>>>>> 614fcb6bc3 (GEOMESA-3100 Kafka layer views (#2784))
<<<<<<< HEAD
>>>>>>> 9b15c8e14c (GEOMESA-3100 Kafka layer views (#2784))
=======
=======
=======
=======
>>>>>>> 95c83ca7f (GEOMESA-3100 Kafka layer views (#2784))
>>>>>>> 4231e686d (GEOMESA-3100 Kafka layer views (#2784))
<<<<<<< HEAD
>>>>>>> 69e3273ac1 (GEOMESA-3100 Kafka layer views (#2784))
<<<<<<< HEAD
>>>>>>> 3977ecc140 (GEOMESA-3100 Kafka layer views (#2784))
=======
=======
=======
>>>>>>> ac0357d36 (GEOMESA-3100 Kafka layer views (#2784))
<<<<<<< HEAD
>>>>>>> 04f82bbc57 (GEOMESA-3100 Kafka layer views (#2784))
<<<<<<< HEAD
>>>>>>> 495a1efc9f (GEOMESA-3100 Kafka layer views (#2784))
=======
=======
=======
>>>>>>> a62b956fb (GEOMESA-3100 Kafka layer views (#2784))
<<<<<<< HEAD
>>>>>>> e0773a1bd7 (GEOMESA-3100 Kafka layer views (#2784))
<<<<<<< HEAD
>>>>>>> 5d8c5baea0 (GEOMESA-3100 Kafka layer views (#2784))
=======
=======
=======
=======
>>>>>>> ea3b40e18 (GEOMESA-3100 Kafka layer views (#2784))
>>>>>>> 4adaa7f47 (GEOMESA-3100 Kafka layer views (#2784))
<<<<<<< HEAD
>>>>>>> ae5eea67f1 (GEOMESA-3100 Kafka layer views (#2784))
<<<<<<< HEAD
>>>>>>> 7628960f66 (GEOMESA-3100 Kafka layer views (#2784))
=======
=======
=======
>>>>>>> 6af71ff43 (GEOMESA-3100 Kafka layer views (#2784))
<<<<<<< HEAD
>>>>>>> 23a7d9849f (GEOMESA-3100 Kafka layer views (#2784))
<<<<<<< HEAD
>>>>>>> 416a95a4c0 (GEOMESA-3100 Kafka layer views (#2784))
=======
=======
=======
>>>>>>> 17f13b3a7 (GEOMESA-3100 Kafka layer views (#2784))
<<<<<<< HEAD
>>>>>>> 6069aba6b4 (GEOMESA-3100 Kafka layer views (#2784))
<<<<<<< HEAD
>>>>>>> ccfb3bd95e (GEOMESA-3100 Kafka layer views (#2784))
=======
=======
=======
>>>>>>> f6e840b5d (GEOMESA-3100 Kafka layer views (#2784))
<<<<<<< HEAD
>>>>>>> 4480b2d1b9 (GEOMESA-3100 Kafka layer views (#2784))
<<<<<<< HEAD
>>>>>>> b5abc19ca4 (GEOMESA-3100 Kafka layer views (#2784))
=======
=======
=======
=======
>>>>>>> bddfdbea5 (GEOMESA-3100 Kafka layer views (#2784))
>>>>>>> c589b832a (GEOMESA-3100 Kafka layer views (#2784))
<<<<<<< HEAD
>>>>>>> 9e433ba57e (GEOMESA-3100 Kafka layer views (#2784))
<<<<<<< HEAD
>>>>>>> 2750a5beef (GEOMESA-3100 Kafka layer views (#2784))
=======
=======
=======
>>>>>>> ffbc2ce32 (GEOMESA-3100 Kafka layer views (#2784))
<<<<<<< HEAD
>>>>>>> 2df2640494 (GEOMESA-3100 Kafka layer views (#2784))
<<<<<<< HEAD
>>>>>>> cb4aa55ae3 (GEOMESA-3100 Kafka layer views (#2784))
=======
=======
=======
=======
>>>>>>> 95c83ca7f (GEOMESA-3100 Kafka layer views (#2784))
>>>>>>> fa68dd43c (GEOMESA-3100 Kafka layer views (#2784))
<<<<<<< HEAD
>>>>>>> 23f312535d (GEOMESA-3100 Kafka layer views (#2784))
<<<<<<< HEAD
>>>>>>> 468da42855 (GEOMESA-3100 Kafka layer views (#2784))
=======
=======
=======
>>>>>>> 54ece16d1 (GEOMESA-3100 Kafka layer views (#2784))
<<<<<<< HEAD
>>>>>>> 826636f69d (GEOMESA-3100 Kafka layer views (#2784))
<<<<<<< HEAD
>>>>>>> 5dd3eb3a6d (GEOMESA-3100 Kafka layer views (#2784))
=======
=======
=======
>>>>>>> c57b5f538 (GEOMESA-3100 Kafka layer views (#2784))
<<<<<<< HEAD
>>>>>>> 1e11ed51a6 (GEOMESA-3100 Kafka layer views (#2784))
<<<<<<< HEAD
>>>>>>> d530f7b24a (GEOMESA-3100 Kafka layer views (#2784))
=======
=======
=======
=======
>>>>>>> ea3b40e18 (GEOMESA-3100 Kafka layer views (#2784))
>>>>>>> 88ef67cdf (GEOMESA-3100 Kafka layer views (#2784))
<<<<<<< HEAD
>>>>>>> 976f319530 (GEOMESA-3100 Kafka layer views (#2784))
<<<<<<< HEAD
>>>>>>> 5e230912b1 (GEOMESA-3100 Kafka layer views (#2784))
=======
=======
=======
>>>>>>> 89fb9950e (GEOMESA-3100 Kafka layer views (#2784))
>>>>>>> bc97b07a31 (GEOMESA-3100 Kafka layer views (#2784))
>>>>>>> f340d6feab (GEOMESA-3100 Kafka layer views (#2784))
import java.io.{Closeable, IOException, StringReader}
=======
import java.io.{Closeable, IOException}
>>>>>>> af0a88eb1 (GEOMESA-3100 Kafka layer views (#2784))
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
=======
>>>>>>> 41df6a2aa3 (GEOMESA-3100 Kafka layer views (#2784))
=======
>>>>>>> fb32a36e0e (GEOMESA-3100 Kafka layer views (#2784))
=======
>>>>>>> 340134cdda (GEOMESA-3100 Kafka layer views (#2784))
=======
>>>>>>> ea8384d9b7 (GEOMESA-3100 Kafka layer views (#2784))
=======
>>>>>>> fe3378ccaa (GEOMESA-3100 Kafka layer views (#2784))
=======
>>>>>>> 79f56900f0 (GEOMESA-3100 Kafka layer views (#2784))
=======
>>>>>>> 72ec0b2107 (GEOMESA-3100 Kafka layer views (#2784))
<<<<<<< HEAD
>>>>>>> bddfdbea54 (GEOMESA-3100 Kafka layer views (#2784))
=======
<<<<<<< HEAD
=======
>>>>>>> 9361541304 (GEOMESA-3100 Kafka layer views (#2784))
=======
>>>>>>> 2f66072323 (GEOMESA-3100 Kafka layer views (#2784))
=======
=======
>>>>>>> 4231e686dd (GEOMESA-3100 Kafka layer views (#2784))
=======
>>>>>>> ac0357d362 (GEOMESA-3100 Kafka layer views (#2784))
=======
>>>>>>> a62b956fb6 (GEOMESA-3100 Kafka layer views (#2784))
=======
>>>>>>> 4adaa7f479 (GEOMESA-3100 Kafka layer views (#2784))
=======
>>>>>>> 6af71ff432 (GEOMESA-3100 Kafka layer views (#2784))
=======
>>>>>>> fa68dd43c6 (GEOMESA-3100 Kafka layer views (#2784))
=======
>>>>>>> 54ece16d15 (GEOMESA-3100 Kafka layer views (#2784))
=======
>>>>>>> c57b5f538a (GEOMESA-3100 Kafka layer views (#2784))
=======
>>>>>>> 88ef67cdfe (GEOMESA-3100 Kafka layer views (#2784))
=======
>>>>>>> 89fb9950ef (GEOMESA-3100 Kafka layer views (#2784))
=======
>>>>>>> 98e7bf59d2 (GEOMESA-3100 Kafka layer views (#2784))
=======
>>>>>>> e24613dc4a (GEOMESA-3100 Kafka layer views (#2784))
=======
>>>>>>> dae1cf3cef (GEOMESA-3100 Kafka layer views (#2784))
=======
>>>>>>> 50a71079c1 (GEOMESA-3100 Kafka layer views (#2784))
=======
=======
>>>>>>> 4c325746bd (GEOMESA-3100 Kafka layer views (#2784))
=======
>>>>>>> 3ebcdb99d9 (GEOMESA-3100 Kafka layer views (#2784))
=======
>>>>>>> fdf51402cf (GEOMESA-3100 Kafka layer views (#2784))
=======
>>>>>>> a377061090 (GEOMESA-3100 Kafka layer views (#2784))
=======
>>>>>>> eddb4eaca1 (GEOMESA-3100 Kafka layer views (#2784))
=======
>>>>>>> be0c9d161a (GEOMESA-3100 Kafka layer views (#2784))
=======
>>>>>>> 7bdc1feea8 (GEOMESA-3100 Kafka layer views (#2784))
=======
>>>>>>> 9b15c8e14c (GEOMESA-3100 Kafka layer views (#2784))
=======
>>>>>>> 3977ecc140 (GEOMESA-3100 Kafka layer views (#2784))
=======
>>>>>>> 495a1efc9f (GEOMESA-3100 Kafka layer views (#2784))
=======
>>>>>>> 5d8c5baea0 (GEOMESA-3100 Kafka layer views (#2784))
=======
>>>>>>> 7628960f66 (GEOMESA-3100 Kafka layer views (#2784))
=======
>>>>>>> 416a95a4c0 (GEOMESA-3100 Kafka layer views (#2784))
=======
>>>>>>> ccfb3bd95e (GEOMESA-3100 Kafka layer views (#2784))
=======
>>>>>>> b5abc19ca4 (GEOMESA-3100 Kafka layer views (#2784))
=======
>>>>>>> 2750a5beef (GEOMESA-3100 Kafka layer views (#2784))
=======
>>>>>>> cb4aa55ae3 (GEOMESA-3100 Kafka layer views (#2784))
=======
>>>>>>> 468da42855 (GEOMESA-3100 Kafka layer views (#2784))
=======
>>>>>>> 5dd3eb3a6d (GEOMESA-3100 Kafka layer views (#2784))
=======
>>>>>>> d530f7b24a (GEOMESA-3100 Kafka layer views (#2784))
=======
>>>>>>> 5e230912b1 (GEOMESA-3100 Kafka layer views (#2784))
=======
>>>>>>> f340d6feab (GEOMESA-3100 Kafka layer views (#2784))
=======
>>>>>>> 65a3a6e36 (GEOMESA-3100 Kafka layer views (#2784))
>>>>>>> 9e910620b3 (GEOMESA-3100 Kafka layer views (#2784))
=======
>>>>>>> 429ffc55e (GEOMESA-3100 Kafka layer views (#2784))
=======
>>>>>>> e7f3e6588 (GEOMESA-3100 Kafka layer views (#2784))
=======
>>>>>>> 6f6887eb8 (GEOMESA-3100 Kafka layer views (#2784))
=======
>>>>>>> 42549e8e3 (GEOMESA-3100 Kafka layer views (#2784))
=======
>>>>>>> 8ed2c9f7e5 (GEOMESA-3100 Kafka layer views (#2784))
=======
>>>>>>> c1d0543aac (GEOMESA-3100 Kafka layer views (#2784))
=======
>>>>>>> 8b9e99d11a (GEOMESA-3100 Kafka layer views (#2784))
=======
>>>>>>> 614fcb6bc3 (GEOMESA-3100 Kafka layer views (#2784))
=======
=======
>>>>>>> 04f82bbc57 (GEOMESA-3100 Kafka layer views (#2784))
=======
>>>>>>> e0773a1bd7 (GEOMESA-3100 Kafka layer views (#2784))
=======
>>>>>>> ae5eea67f1 (GEOMESA-3100 Kafka layer views (#2784))
=======
>>>>>>> 23a7d9849f (GEOMESA-3100 Kafka layer views (#2784))
=======
>>>>>>> 6069aba6b4 (GEOMESA-3100 Kafka layer views (#2784))
=======
>>>>>>> 4480b2d1b9 (GEOMESA-3100 Kafka layer views (#2784))
=======
=======
=======
>>>>>>> 23f312535d (GEOMESA-3100 Kafka layer views (#2784))
=======
>>>>>>> 826636f69d (GEOMESA-3100 Kafka layer views (#2784))
=======
>>>>>>> 1e11ed51a6 (GEOMESA-3100 Kafka layer views (#2784))
=======
>>>>>>> 976f319530 (GEOMESA-3100 Kafka layer views (#2784))
=======
>>>>>>> bc97b07a31 (GEOMESA-3100 Kafka layer views (#2784))
=======
=======
>>>>>>> d0dc799ff (GEOMESA-3100 Kafka layer views (#2784))
>>>>>>> ffbc2ce32 (GEOMESA-3100 Kafka layer views (#2784))
>>>>>>> 2df2640494 (GEOMESA-3100 Kafka layer views (#2784))
=======
>>>>>>> c589b832a (GEOMESA-3100 Kafka layer views (#2784))
>>>>>>> 9e433ba57e (GEOMESA-3100 Kafka layer views (#2784))
=======
>>>>>>> 4231e686d (GEOMESA-3100 Kafka layer views (#2784))
>>>>>>> 69e3273ac1 (GEOMESA-3100 Kafka layer views (#2784))
=======
>>>>>>> ac0357d36 (GEOMESA-3100 Kafka layer views (#2784))
=======
>>>>>>> a62b956fb (GEOMESA-3100 Kafka layer views (#2784))
=======
>>>>>>> 4adaa7f47 (GEOMESA-3100 Kafka layer views (#2784))
=======
>>>>>>> 6af71ff43 (GEOMESA-3100 Kafka layer views (#2784))
=======
>>>>>>> fa68dd43c (GEOMESA-3100 Kafka layer views (#2784))
=======
>>>>>>> 54ece16d1 (GEOMESA-3100 Kafka layer views (#2784))
=======
>>>>>>> c57b5f538 (GEOMESA-3100 Kafka layer views (#2784))
=======
>>>>>>> 88ef67cdf (GEOMESA-3100 Kafka layer views (#2784))
=======
>>>>>>> 89fb9950e (GEOMESA-3100 Kafka layer views (#2784))
=======
>>>>>>> d0dc799ff (GEOMESA-3100 Kafka layer views (#2784))
>>>>>>> ea3b40e187 (GEOMESA-3100 Kafka layer views (#2784))
=======
>>>>>>> 9236b02087 (GEOMESA-3100 Kafka layer views (#2784))
=======
>>>>>>> 862857ce2e (GEOMESA-3100 Kafka layer views (#2784))
=======
=======
>>>>>>> d0dc799ff (GEOMESA-3100 Kafka layer views (#2784))
>>>>>>> 28427dfd8f (GEOMESA-3100 Kafka layer views (#2784))
=======
>>>>>>> 936154130 (GEOMESA-3100 Kafka layer views (#2784))
=======
>>>>>>> 2f6607232 (GEOMESA-3100 Kafka layer views (#2784))
=======
=======
>>>>>>> d0dc799ff (GEOMESA-3100 Kafka layer views (#2784))
>>>>>>> ea3b40e18 (GEOMESA-3100 Kafka layer views (#2784))
=======
>>>>>>> f6e840b5dd (GEOMESA-3100 Kafka layer views (#2784))
=======
>>>>>>> c589b832a5 (GEOMESA-3100 Kafka layer views (#2784))
=======
=======
>>>>>>> d0dc799ff (GEOMESA-3100 Kafka layer views (#2784))
>>>>>>> ffbc2ce32a (GEOMESA-3100 Kafka layer views (#2784))
=======
>>>>>>> 936154130 (GEOMESA-3100 Kafka layer views (#2784))
=======
>>>>>>> 2f6607232 (GEOMESA-3100 Kafka layer views (#2784))
=======
=======
>>>>>>> d0dc799ff (GEOMESA-3100 Kafka layer views (#2784))
>>>>>>> ea3b40e18 (GEOMESA-3100 Kafka layer views (#2784))
=======
<<<<<<< HEAD
>>>>>>> 2f6607232 (GEOMESA-3100 Kafka layer views (#2784))
=======
=======
>>>>>>> d0dc799ff (GEOMESA-3100 Kafka layer views (#2784))
>>>>>>> ea3b40e18 (GEOMESA-3100 Kafka layer views (#2784))
=======
<<<<<<< HEAD
>>>>>>> 2f6607232 (GEOMESA-3100 Kafka layer views (#2784))
=======
=======
>>>>>>> d0dc799ff (GEOMESA-3100 Kafka layer views (#2784))
>>>>>>> ea3b40e18 (GEOMESA-3100 Kafka layer views (#2784))
=======
>>>>>>> 9236b0208 (GEOMESA-3100 Kafka layer views (#2784))
=======
>>>>>>> 862857ce2 (GEOMESA-3100 Kafka layer views (#2784))
=======
=======
>>>>>>> d0dc799ff (GEOMESA-3100 Kafka layer views (#2784))
>>>>>>> 28427dfd8 (GEOMESA-3100 Kafka layer views (#2784))
=======
=======
>>>>>>> ac0357d36 (GEOMESA-3100 Kafka layer views (#2784))
=======
=======
>>>>>>> f6e840b5d (GEOMESA-3100 Kafka layer views (#2784))
=======
>>>>>>> 54ece16d1 (GEOMESA-3100 Kafka layer views (#2784))
<<<<<<< HEAD
>>>>>>> 2f6607232 (GEOMESA-3100 Kafka layer views (#2784))
=======
=======
>>>>>>> d0dc799ff (GEOMESA-3100 Kafka layer views (#2784))
>>>>>>> ea3b40e18 (GEOMESA-3100 Kafka layer views (#2784))
=======
>>>>>>> 581f1dd15 (GEOMESA-3100 Kafka layer views (#2784))
=======
>>>>>>> 1a5f68233 (GEOMESA-3100 Kafka layer views (#2784))
=======
=======
>>>>>>> d0dc799ff (GEOMESA-3100 Kafka layer views (#2784))
>>>>>>> 73767737b (GEOMESA-3100 Kafka layer views (#2784))
=======
=======
>>>>>>> 429ffc55e (GEOMESA-3100 Kafka layer views (#2784))
<<<<<<< HEAD
>>>>>>> locationtech-main
=======
>>>>>>> 58286bfd3 (GEOMESA-3100 Kafka layer views (#2784))
>>>>>>> 5ca0cd6de (GEOMESA-3100 Kafka layer views (#2784))
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
>>>>>>> d0dc799ff1 (GEOMESA-3100 Kafka layer views (#2784))
=======
import java.io.{Closeable, IOException, StringReader}
=======
import java.io.{Closeable, IOException}
>>>>>>> af0a88eb1 (GEOMESA-3100 Kafka layer views (#2784))
>>>>>>> 0d5f6377de (GEOMESA-3100 Kafka layer views (#2784))
>>>>>>> 95c83ca7fa (GEOMESA-3100 Kafka layer views (#2784))
=======
>>>>>>> 9361541304 (GEOMESA-3100 Kafka layer views (#2784))
=======
=======
>>>>>>> bddfdbea5 (GEOMESA-3100 Kafka layer views (#2784))
>>>>>>> 2f66072323 (GEOMESA-3100 Kafka layer views (#2784))
=======
=======
>>>>>>> ac0357d362 (GEOMESA-3100 Kafka layer views (#2784))
=======
>>>>>>> a62b956fb6 (GEOMESA-3100 Kafka layer views (#2784))
=======
=======
>>>>>>> e24613dc4a (GEOMESA-3100 Kafka layer views (#2784))
=======
>>>>>>> dae1cf3cef (GEOMESA-3100 Kafka layer views (#2784))
=======
>>>>>>> 50a71079c1 (GEOMESA-3100 Kafka layer views (#2784))
=======
>>>>>>> 4c325746bd (GEOMESA-3100 Kafka layer views (#2784))
=======
>>>>>>> 3ebcdb99d9 (GEOMESA-3100 Kafka layer views (#2784))
=======
>>>>>>> fdf51402cf (GEOMESA-3100 Kafka layer views (#2784))
=======
=======
>>>>>>> 7bdc1feea8 (GEOMESA-3100 Kafka layer views (#2784))
=======
>>>>>>> 9b15c8e14c (GEOMESA-3100 Kafka layer views (#2784))
=======
>>>>>>> 495a1efc9f (GEOMESA-3100 Kafka layer views (#2784))
=======
>>>>>>> 5d8c5baea0 (GEOMESA-3100 Kafka layer views (#2784))
=======
>>>>>>> 7628960f66 (GEOMESA-3100 Kafka layer views (#2784))
=======
>>>>>>> b5abc19ca4 (GEOMESA-3100 Kafka layer views (#2784))
=======
<<<<<<< HEAD
<<<<<<< HEAD
>>>>>>> 2750a5beef (GEOMESA-3100 Kafka layer views (#2784))
=======
>>>>>>> cb4aa55ae3 (GEOMESA-3100 Kafka layer views (#2784))
=======
<<<<<<< HEAD
<<<<<<< HEAD
>>>>>>> 5dd3eb3a6d (GEOMESA-3100 Kafka layer views (#2784))
=======
>>>>>>> d530f7b24a (GEOMESA-3100 Kafka layer views (#2784))
=======
<<<<<<< HEAD
<<<<<<< HEAD
>>>>>>> 5e230912b1 (GEOMESA-3100 Kafka layer views (#2784))
=======
=======
>>>>>>> 0d5f6377de (GEOMESA-3100 Kafka layer views (#2784))
=======
>>>>>>> 2750a5beef (GEOMESA-3100 Kafka layer views (#2784))
=======
>>>>>>> 41df6a2aa3 (GEOMESA-3100 Kafka layer views (#2784))
=======
>>>>>>> fb32a36e0e (GEOMESA-3100 Kafka layer views (#2784))
=======
>>>>>>> 5dd3eb3a6d (GEOMESA-3100 Kafka layer views (#2784))
=======
>>>>>>> ea8384d9b7 (GEOMESA-3100 Kafka layer views (#2784))
=======
>>>>>>> fe3378ccaa (GEOMESA-3100 Kafka layer views (#2784))
=======
>>>>>>> 5e230912b1 (GEOMESA-3100 Kafka layer views (#2784))
=======
>>>>>>> 79f56900f0 (GEOMESA-3100 Kafka layer views (#2784))
>>>>>>> c1d0543aac (GEOMESA-3100 Kafka layer views (#2784))
>>>>>>> be0c9d161a (GEOMESA-3100 Kafka layer views (#2784))
=======
>>>>>>> 8b9e99d11a (GEOMESA-3100 Kafka layer views (#2784))
=======
>>>>>>> ea3b40e18 (GEOMESA-3100 Kafka layer views (#2784))
>>>>>>> 4adaa7f479 (GEOMESA-3100 Kafka layer views (#2784))
=======
>>>>>>> 54ece16d15 (GEOMESA-3100 Kafka layer views (#2784))
=======
>>>>>>> c57b5f538a (GEOMESA-3100 Kafka layer views (#2784))
=======
=======
>>>>>>> ea3b40e18 (GEOMESA-3100 Kafka layer views (#2784))
>>>>>>> 88ef67cdfe (GEOMESA-3100 Kafka layer views (#2784))
=======
>>>>>>> 73767737b (GEOMESA-3100 Kafka layer views (#2784))
=======
>>>>>>> 429ffc55e (GEOMESA-3100 Kafka layer views (#2784))
=======
>>>>>>> e7f3e6588 (GEOMESA-3100 Kafka layer views (#2784))
=======
=======
>>>>>>> ea3b40e18 (GEOMESA-3100 Kafka layer views (#2784))
>>>>>>> 6f6887eb8 (GEOMESA-3100 Kafka layer views (#2784))
=======
=======
>>>>>>> 04f82bbc57 (GEOMESA-3100 Kafka layer views (#2784))
=======
>>>>>>> e0773a1bd7 (GEOMESA-3100 Kafka layer views (#2784))
=======
>>>>>>> ae5eea67f1 (GEOMESA-3100 Kafka layer views (#2784))
=======
>>>>>>> 4480b2d1b9 (GEOMESA-3100 Kafka layer views (#2784))
=======
<<<<<<< HEAD
<<<<<<< HEAD
>>>>>>> 9e433ba57e (GEOMESA-3100 Kafka layer views (#2784))
=======
>>>>>>> 2df2640494 (GEOMESA-3100 Kafka layer views (#2784))
=======
<<<<<<< HEAD
<<<<<<< HEAD
>>>>>>> 826636f69d (GEOMESA-3100 Kafka layer views (#2784))
=======
>>>>>>> 1e11ed51a6 (GEOMESA-3100 Kafka layer views (#2784))
=======
<<<<<<< HEAD
<<<<<<< HEAD
>>>>>>> 976f319530 (GEOMESA-3100 Kafka layer views (#2784))
=======
=======
>>>>>>> 0d5f6377de (GEOMESA-3100 Kafka layer views (#2784))
=======
>>>>>>> 9e433ba57e (GEOMESA-3100 Kafka layer views (#2784))
=======
>>>>>>> 41df6a2aa3 (GEOMESA-3100 Kafka layer views (#2784))
=======
>>>>>>> fb32a36e0e (GEOMESA-3100 Kafka layer views (#2784))
=======
>>>>>>> 826636f69d (GEOMESA-3100 Kafka layer views (#2784))
=======
>>>>>>> ea8384d9b7 (GEOMESA-3100 Kafka layer views (#2784))
=======
>>>>>>> fe3378ccaa (GEOMESA-3100 Kafka layer views (#2784))
=======
>>>>>>> 976f319530 (GEOMESA-3100 Kafka layer views (#2784))
=======
>>>>>>> 79f56900f0 (GEOMESA-3100 Kafka layer views (#2784))
>>>>>>> ea3b40e18 (GEOMESA-3100 Kafka layer views (#2784))
=======
>>>>>>> 28427dfd8 (GEOMESA-3100 Kafka layer views (#2784))
>>>>>>> 614fcb6bc3 (GEOMESA-3100 Kafka layer views (#2784))
=======
>>>>>>> ac0357d36 (GEOMESA-3100 Kafka layer views (#2784))
=======
>>>>>>> a62b956fb (GEOMESA-3100 Kafka layer views (#2784))
=======
=======
>>>>>>> ea3b40e18 (GEOMESA-3100 Kafka layer views (#2784))
>>>>>>> 4adaa7f47 (GEOMESA-3100 Kafka layer views (#2784))
=======
>>>>>>> ffbc2ce32 (GEOMESA-3100 Kafka layer views (#2784))
=======
<<<<<<< HEAD
<<<<<<< HEAD
>>>>>>> 54ece16d1 (GEOMESA-3100 Kafka layer views (#2784))
=======
>>>>>>> c57b5f538 (GEOMESA-3100 Kafka layer views (#2784))
=======
<<<<<<< HEAD
<<<<<<< HEAD
=======
>>>>>>> 79f56900f0 (GEOMESA-3100 Kafka layer views (#2784))
=======
>>>>>>> ea3b40e18 (GEOMESA-3100 Kafka layer views (#2784))
>>>>>>> 88ef67cdf (GEOMESA-3100 Kafka layer views (#2784))
=======
<<<<<<< HEAD
>>>>>>> 626c8f9b93 (GEOMESA-3100 Kafka layer views (#2784))
=======
>>>>>>> 9a5d6d2815 (GEOMESA-3100 Kafka layer views (#2784))
=======
=======
>>>>>>> ea3b40e18 (GEOMESA-3100 Kafka layer views (#2784))
>>>>>>> f4b2369e9a (GEOMESA-3100 Kafka layer views (#2784))
=======
=======
>>>>>>> fb32a36e0e (GEOMESA-3100 Kafka layer views (#2784))
=======
>>>>>>> 54ece16d1 (GEOMESA-3100 Kafka layer views (#2784))
=======
>>>>>>> ea8384d9b7 (GEOMESA-3100 Kafka layer views (#2784))
=======
>>>>>>> fe3378ccaa (GEOMESA-3100 Kafka layer views (#2784))
=======
>>>>>>> 79f56900f0 (GEOMESA-3100 Kafka layer views (#2784))
>>>>>>> bddfdbea5 (GEOMESA-3100 Kafka layer views (#2784))
=======
>>>>>>> d0dc799ff (GEOMESA-3100 Kafka layer views (#2784))
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
>>>>>>> fb32a36e0e (GEOMESA-3100 Kafka layer views (#2784))
=======
>>>>>>> 340134cdda (GEOMESA-3100 Kafka layer views (#2784))
=======
>>>>>>> 79f56900f0 (GEOMESA-3100 Kafka layer views (#2784))
>>>>>>> ea3b40e187 (GEOMESA-3100 Kafka layer views (#2784))
=======
import java.io.{Closeable, IOException, StringReader}
=======
import java.io.{Closeable, IOException}
>>>>>>> af0a88eb1 (GEOMESA-3100 Kafka layer views (#2784))
>>>>>>> d2cb939f51 (GEOMESA-3100 Kafka layer views (#2784))
=======
import java.io.{Closeable, IOException, StringReader}
>>>>>>> 3be8d2a5a4 (Merge branch 'feature/postgis-fixes')
=======
import java.io.{Closeable, IOException, StringReader}
=======
import java.io.{Closeable, IOException}
>>>>>>> af0a88eb1 (GEOMESA-3100 Kafka layer views (#2784))
>>>>>>> a0314fb7ff (GEOMESA-3100 Kafka layer views (#2784))
=======
>>>>>>> 9236b02087 (GEOMESA-3100 Kafka layer views (#2784))
=======
=======
>>>>>>> bddfdbea5 (GEOMESA-3100 Kafka layer views (#2784))
>>>>>>> 862857ce2e (GEOMESA-3100 Kafka layer views (#2784))
=======
=======
>>>>>>> bddfdbea5 (GEOMESA-3100 Kafka layer views (#2784))
=======
>>>>>>> d0dc799ff (GEOMESA-3100 Kafka layer views (#2784))
>>>>>>> 28427dfd8f (GEOMESA-3100 Kafka layer views (#2784))
=======
=======
>>>>>>> 4adaa7f479 (GEOMESA-3100 Kafka layer views (#2784))
=======
>>>>>>> 88ef67cdfe (GEOMESA-3100 Kafka layer views (#2784))
=======
>>>>>>> 50a71079c1 (GEOMESA-3100 Kafka layer views (#2784))
=======
>>>>>>> 9e910620b3 (GEOMESA-3100 Kafka layer views (#2784))
=======
=======
>>>>>>> 9b15c8e14c (GEOMESA-3100 Kafka layer views (#2784))
=======
>>>>>>> 3977ecc140 (GEOMESA-3100 Kafka layer views (#2784))
=======
>>>>>>> 7628960f66 (GEOMESA-3100 Kafka layer views (#2784))
=======
>>>>>>> cb4aa55ae3 (GEOMESA-3100 Kafka layer views (#2784))
=======
<<<<<<< HEAD
<<<<<<< HEAD
>>>>>>> 468da42855 (GEOMESA-3100 Kafka layer views (#2784))
=======
>>>>>>> 5e230912b1 (GEOMESA-3100 Kafka layer views (#2784))
=======
<<<<<<< HEAD
=======
>>>>>>> fb32a36e0e (GEOMESA-3100 Kafka layer views (#2784))
=======
>>>>>>> 468da42855 (GEOMESA-3100 Kafka layer views (#2784))
=======
>>>>>>> 340134cdda (GEOMESA-3100 Kafka layer views (#2784))
=======
>>>>>>> 79f56900f0 (GEOMESA-3100 Kafka layer views (#2784))
>>>>>>> 6f6887eb8 (GEOMESA-3100 Kafka layer views (#2784))
>>>>>>> fdf51402cf (GEOMESA-3100 Kafka layer views (#2784))
=======
>>>>>>> 614fcb6bc3 (GEOMESA-3100 Kafka layer views (#2784))
=======
>>>>>>> 69e3273ac1 (GEOMESA-3100 Kafka layer views (#2784))
=======
=======
>>>>>>> 2df2640494 (GEOMESA-3100 Kafka layer views (#2784))
=======
<<<<<<< HEAD
<<<<<<< HEAD
>>>>>>> 23f312535d (GEOMESA-3100 Kafka layer views (#2784))
=======
>>>>>>> 976f319530 (GEOMESA-3100 Kafka layer views (#2784))
=======
<<<<<<< HEAD
=======
>>>>>>> fb32a36e0e (GEOMESA-3100 Kafka layer views (#2784))
=======
>>>>>>> 23f312535d (GEOMESA-3100 Kafka layer views (#2784))
=======
>>>>>>> 340134cdda (GEOMESA-3100 Kafka layer views (#2784))
=======
>>>>>>> 79f56900f0 (GEOMESA-3100 Kafka layer views (#2784))
>>>>>>> 4adaa7f47 (GEOMESA-3100 Kafka layer views (#2784))
>>>>>>> ae5eea67f1 (GEOMESA-3100 Kafka layer views (#2784))
=======
>>>>>>> 88ef67cdf (GEOMESA-3100 Kafka layer views (#2784))
=======
<<<<<<< HEAD
>>>>>>> f4b2369e9a (GEOMESA-3100 Kafka layer views (#2784))
=======
=======
>>>>>>> 79f56900f0 (GEOMESA-3100 Kafka layer views (#2784))
>>>>>>> 95c83ca7f (GEOMESA-3100 Kafka layer views (#2784))
<<<<<<< HEAD
<<<<<<< HEAD
<<<<<<< HEAD
>>>>>>> 4231e686dd (GEOMESA-3100 Kafka layer views (#2784))
=======
=======
>>>>>>> 936154130 (GEOMESA-3100 Kafka layer views (#2784))
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
>>>>>>> ea8384d9b7 (GEOMESA-3100 Kafka layer views (#2784))
=======
>>>>>>> fe3378ccaa (GEOMESA-3100 Kafka layer views (#2784))
>>>>>>> ac0357d362 (GEOMESA-3100 Kafka layer views (#2784))
=======
=======
>>>>>>> c57b5f538a (GEOMESA-3100 Kafka layer views (#2784))
=======
>>>>>>> 4c325746bd (GEOMESA-3100 Kafka layer views (#2784))
=======
=======
>>>>>>> 495a1efc9f (GEOMESA-3100 Kafka layer views (#2784))
=======
>>>>>>> 5d8c5baea0 (GEOMESA-3100 Kafka layer views (#2784))
=======
>>>>>>> 5dd3eb3a6d (GEOMESA-3100 Kafka layer views (#2784))
=======
<<<<<<< HEAD
<<<<<<< HEAD
>>>>>>> d530f7b24a (GEOMESA-3100 Kafka layer views (#2784))
=======
=======
>>>>>>> ea8384d9b7 (GEOMESA-3100 Kafka layer views (#2784))
=======
>>>>>>> d530f7b24a (GEOMESA-3100 Kafka layer views (#2784))
=======
>>>>>>> fe3378ccaa (GEOMESA-3100 Kafka layer views (#2784))
>>>>>>> e7f3e6588 (GEOMESA-3100 Kafka layer views (#2784))
>>>>>>> 3ebcdb99d9 (GEOMESA-3100 Kafka layer views (#2784))
=======
>>>>>>> 04f82bbc57 (GEOMESA-3100 Kafka layer views (#2784))
=======
=======
>>>>>>> 826636f69d (GEOMESA-3100 Kafka layer views (#2784))
=======
<<<<<<< HEAD
<<<<<<< HEAD
>>>>>>> 1e11ed51a6 (GEOMESA-3100 Kafka layer views (#2784))
=======
=======
>>>>>>> ea8384d9b7 (GEOMESA-3100 Kafka layer views (#2784))
=======
>>>>>>> 1e11ed51a6 (GEOMESA-3100 Kafka layer views (#2784))
=======
>>>>>>> fe3378ccaa (GEOMESA-3100 Kafka layer views (#2784))
>>>>>>> a62b956fb (GEOMESA-3100 Kafka layer views (#2784))
>>>>>>> e0773a1bd7 (GEOMESA-3100 Kafka layer views (#2784))
=======
>>>>>>> c57b5f538 (GEOMESA-3100 Kafka layer views (#2784))
=======
<<<<<<< HEAD
>>>>>>> 9a5d6d2815 (GEOMESA-3100 Kafka layer views (#2784))
=======
=======
>>>>>>> fe3378ccaa (GEOMESA-3100 Kafka layer views (#2784))
=======
>>>>>>> bddfdbea5 (GEOMESA-3100 Kafka layer views (#2784))
>>>>>>> 2f6607232 (GEOMESA-3100 Kafka layer views (#2784))
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
>>>>>>> fe3378ccaa (GEOMESA-3100 Kafka layer views (#2784))
=======
>>>>>>> 79f56900f0 (GEOMESA-3100 Kafka layer views (#2784))
>>>>>>> a62b956fb6 (GEOMESA-3100 Kafka layer views (#2784))
=======
=======
>>>>>>> 3ebcdb99d9 (GEOMESA-3100 Kafka layer views (#2784))
=======
>>>>>>> fdf51402cf (GEOMESA-3100 Kafka layer views (#2784))
=======
=======
>>>>>>> 7628960f66 (GEOMESA-3100 Kafka layer views (#2784))
=======
>>>>>>> d530f7b24a (GEOMESA-3100 Kafka layer views (#2784))
=======
<<<<<<< HEAD
<<<<<<< HEAD
>>>>>>> 5e230912b1 (GEOMESA-3100 Kafka layer views (#2784))
=======
=======
>>>>>>> fe3378ccaa (GEOMESA-3100 Kafka layer views (#2784))
=======
>>>>>>> 5e230912b1 (GEOMESA-3100 Kafka layer views (#2784))
=======
>>>>>>> 79f56900f0 (GEOMESA-3100 Kafka layer views (#2784))
>>>>>>> e0773a1bd7 (GEOMESA-3100 Kafka layer views (#2784))
>>>>>>> 5d8c5baea0 (GEOMESA-3100 Kafka layer views (#2784))
=======
>>>>>>> ae5eea67f1 (GEOMESA-3100 Kafka layer views (#2784))
=======
>>>>>>> 1e11ed51a6 (GEOMESA-3100 Kafka layer views (#2784))
=======
<<<<<<< HEAD
<<<<<<< HEAD
>>>>>>> 976f319530 (GEOMESA-3100 Kafka layer views (#2784))
=======
=======
>>>>>>> fe3378ccaa (GEOMESA-3100 Kafka layer views (#2784))
=======
>>>>>>> 976f319530 (GEOMESA-3100 Kafka layer views (#2784))
=======
>>>>>>> 79f56900f0 (GEOMESA-3100 Kafka layer views (#2784))
>>>>>>> ea3b40e18 (GEOMESA-3100 Kafka layer views (#2784))
<<<<<<< HEAD
<<<<<<< HEAD
<<<<<<< HEAD
>>>>>>> 4adaa7f479 (GEOMESA-3100 Kafka layer views (#2784))
=======
=======
>>>>>>> d2cb939f5 (GEOMESA-3100 Kafka layer views (#2784))
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
>>>>>>> 72ec0b2107 (GEOMESA-3100 Kafka layer views (#2784))
=======
>>>>>>> 30559ea5c9 (Merge branch 'feature/postgis-fixes')
>>>>>>> 6af71ff432 (GEOMESA-3100 Kafka layer views (#2784))
=======
=======
>>>>>>> a377061090 (GEOMESA-3100 Kafka layer views (#2784))
=======
>>>>>>> e944f1c88b (Merge branch 'feature/postgis-fixes')
=======
=======
>>>>>>> 26e5afc4ea (Merge branch 'feature/postgis-fixes')
=======
>>>>>>> f340d6feab (GEOMESA-3100 Kafka layer views (#2784))
=======
<<<<<<< HEAD
<<<<<<< HEAD
>>>>>>> c69897d7bd (Merge branch 'feature/postgis-fixes')
=======
=======
>>>>>>> 72ec0b2107 (GEOMESA-3100 Kafka layer views (#2784))
=======
>>>>>>> c69897d7bd (Merge branch 'feature/postgis-fixes')
=======
>>>>>>> 30559ea5c9 (Merge branch 'feature/postgis-fixes')
>>>>>>> 23a7d9849f (GEOMESA-3100 Kafka layer views (#2784))
>>>>>>> 416a95a4c0 (GEOMESA-3100 Kafka layer views (#2784))
=======
>>>>>>> cb6bda89b6 (Merge branch 'feature/postgis-fixes')
=======
>>>>>>> bc97b07a31 (GEOMESA-3100 Kafka layer views (#2784))
=======
<<<<<<< HEAD
<<<<<<< HEAD
>>>>>>> 699117eca9 (Merge branch 'feature/postgis-fixes')
=======
=======
>>>>>>> 72ec0b2107 (GEOMESA-3100 Kafka layer views (#2784))
=======
>>>>>>> 699117eca9 (Merge branch 'feature/postgis-fixes')
=======
>>>>>>> 30559ea5c9 (Merge branch 'feature/postgis-fixes')
import java.io.{Closeable, IOException, StringReader}
>>>>>>> 3be8d2a5a (Merge branch 'feature/postgis-fixes')
<<<<<<< HEAD
>>>>>>> db8d998aa2 (Merge branch 'feature/postgis-fixes')
=======
import java.io.{Closeable, IOException, StringReader}
>>>>>>> d845d7c1bd (GEOMESA-3254 Add Bloop build support)
=======
import java.io.{Closeable, IOException, StringReader}
=======
import java.io.{Closeable, IOException}
>>>>>>> af0a88eb1 (GEOMESA-3100 Kafka layer views (#2784))
>>>>>>> 17f13b3a7a (GEOMESA-3100 Kafka layer views (#2784))
=======
>>>>>>> f6e840b5dd (GEOMESA-3100 Kafka layer views (#2784))
=======
=======
>>>>>>> bddfdbea5 (GEOMESA-3100 Kafka layer views (#2784))
>>>>>>> c589b832a5 (GEOMESA-3100 Kafka layer views (#2784))
=======
=======
>>>>>>> bddfdbea5 (GEOMESA-3100 Kafka layer views (#2784))
=======
>>>>>>> d0dc799ff (GEOMESA-3100 Kafka layer views (#2784))
>>>>>>> ffbc2ce32a (GEOMESA-3100 Kafka layer views (#2784))
=======
=======
>>>>>>> 95c83ca7f (GEOMESA-3100 Kafka layer views (#2784))
>>>>>>> fa68dd43c6 (GEOMESA-3100 Kafka layer views (#2784))
=======
=======
>>>>>>> 936154130 (GEOMESA-3100 Kafka layer views (#2784))
>>>>>>> 54ece16d15 (GEOMESA-3100 Kafka layer views (#2784))
=======
>>>>>>> c57b5f538a (GEOMESA-3100 Kafka layer views (#2784))
=======
=======
>>>>>>> ea3b40e18 (GEOMESA-3100 Kafka layer views (#2784))
>>>>>>> 88ef67cdfe (GEOMESA-3100 Kafka layer views (#2784))
=======
=======
>>>>>>> d2cb939f5 (GEOMESA-3100 Kafka layer views (#2784))
>>>>>>> 89fb9950ef (GEOMESA-3100 Kafka layer views (#2784))
=======
=======
import java.io.{Closeable, IOException, StringReader}
>>>>>>> 3be8d2a5a (Merge branch 'feature/postgis-fixes')
>>>>>>> 1b25d7ddb4 (Merge branch 'feature/postgis-fixes')
=======
=======
<<<<<<< HEAD
>>>>>>> eecabb92a (GEOMESA-3100 Kafka layer views (#2784))
<<<<<<< HEAD
>>>>>>> 98e7bf59d2 (GEOMESA-3100 Kafka layer views (#2784))
=======
=======
>>>>>>> 581f1dd15 (GEOMESA-3100 Kafka layer views (#2784))
<<<<<<< HEAD
>>>>>>> e24613dc4a (GEOMESA-3100 Kafka layer views (#2784))
=======
=======
=======
>>>>>>> bddfdbea5 (GEOMESA-3100 Kafka layer views (#2784))
>>>>>>> 1a5f68233 (GEOMESA-3100 Kafka layer views (#2784))
<<<<<<< HEAD
>>>>>>> dae1cf3cef (GEOMESA-3100 Kafka layer views (#2784))
=======
=======
>>>>>>> 73767737b (GEOMESA-3100 Kafka layer views (#2784))
<<<<<<< HEAD
>>>>>>> 50a71079c1 (GEOMESA-3100 Kafka layer views (#2784))
=======
=======
=======
>>>>>>> 95c83ca7f (GEOMESA-3100 Kafka layer views (#2784))
>>>>>>> 65a3a6e36 (GEOMESA-3100 Kafka layer views (#2784))
<<<<<<< HEAD
>>>>>>> 9e910620b3 (GEOMESA-3100 Kafka layer views (#2784))
=======
=======
>>>>>>> 429ffc55e (GEOMESA-3100 Kafka layer views (#2784))
<<<<<<< HEAD
>>>>>>> 4c325746bd (GEOMESA-3100 Kafka layer views (#2784))
=======
=======
>>>>>>> e7f3e6588 (GEOMESA-3100 Kafka layer views (#2784))
<<<<<<< HEAD
>>>>>>> 3ebcdb99d9 (GEOMESA-3100 Kafka layer views (#2784))
=======
=======
=======
>>>>>>> ea3b40e18 (GEOMESA-3100 Kafka layer views (#2784))
>>>>>>> 6f6887eb8 (GEOMESA-3100 Kafka layer views (#2784))
<<<<<<< HEAD
>>>>>>> fdf51402cf (GEOMESA-3100 Kafka layer views (#2784))
=======
=======
>>>>>>> 42549e8e3 (GEOMESA-3100 Kafka layer views (#2784))
<<<<<<< HEAD
>>>>>>> a377061090 (GEOMESA-3100 Kafka layer views (#2784))
=======
=======
=======
import java.io.{Closeable, IOException, StringReader}
>>>>>>> 3be8d2a5a (Merge branch 'feature/postgis-fixes')
>>>>>>> e8cc4971c6 (Merge branch 'feature/postgis-fixes')
<<<<<<< HEAD
>>>>>>> e944f1c88b (Merge branch 'feature/postgis-fixes')
=======
=======
>>>>>>> a0314fb7f (GEOMESA-3100 Kafka layer views (#2784))
<<<<<<< HEAD
>>>>>>> 8ed2c9f7e5 (GEOMESA-3100 Kafka layer views (#2784))
<<<<<<< HEAD
>>>>>>> eddb4eaca1 (GEOMESA-3100 Kafka layer views (#2784))
=======
=======
=======
>>>>>>> 9236b0208 (GEOMESA-3100 Kafka layer views (#2784))
<<<<<<< HEAD
>>>>>>> c1d0543aac (GEOMESA-3100 Kafka layer views (#2784))
<<<<<<< HEAD
>>>>>>> be0c9d161a (GEOMESA-3100 Kafka layer views (#2784))
=======
=======
=======
=======
>>>>>>> bddfdbea5 (GEOMESA-3100 Kafka layer views (#2784))
>>>>>>> 862857ce2 (GEOMESA-3100 Kafka layer views (#2784))
<<<<<<< HEAD
>>>>>>> 8b9e99d11a (GEOMESA-3100 Kafka layer views (#2784))
<<<<<<< HEAD
>>>>>>> 7bdc1feea8 (GEOMESA-3100 Kafka layer views (#2784))
=======
=======
=======
>>>>>>> 28427dfd8 (GEOMESA-3100 Kafka layer views (#2784))
<<<<<<< HEAD
>>>>>>> 614fcb6bc3 (GEOMESA-3100 Kafka layer views (#2784))
<<<<<<< HEAD
>>>>>>> 9b15c8e14c (GEOMESA-3100 Kafka layer views (#2784))
=======
=======
=======
=======
>>>>>>> 95c83ca7f (GEOMESA-3100 Kafka layer views (#2784))
>>>>>>> 4231e686d (GEOMESA-3100 Kafka layer views (#2784))
<<<<<<< HEAD
>>>>>>> 69e3273ac1 (GEOMESA-3100 Kafka layer views (#2784))
<<<<<<< HEAD
>>>>>>> 3977ecc140 (GEOMESA-3100 Kafka layer views (#2784))
=======
=======
=======
>>>>>>> ac0357d36 (GEOMESA-3100 Kafka layer views (#2784))
<<<<<<< HEAD
>>>>>>> 04f82bbc57 (GEOMESA-3100 Kafka layer views (#2784))
<<<<<<< HEAD
>>>>>>> 495a1efc9f (GEOMESA-3100 Kafka layer views (#2784))
=======
=======
=======
>>>>>>> a62b956fb (GEOMESA-3100 Kafka layer views (#2784))
<<<<<<< HEAD
>>>>>>> e0773a1bd7 (GEOMESA-3100 Kafka layer views (#2784))
<<<<<<< HEAD
>>>>>>> 5d8c5baea0 (GEOMESA-3100 Kafka layer views (#2784))
=======
=======
=======
=======
>>>>>>> ea3b40e18 (GEOMESA-3100 Kafka layer views (#2784))
>>>>>>> 4adaa7f47 (GEOMESA-3100 Kafka layer views (#2784))
<<<<<<< HEAD
>>>>>>> ae5eea67f1 (GEOMESA-3100 Kafka layer views (#2784))
<<<<<<< HEAD
>>>>>>> 7628960f66 (GEOMESA-3100 Kafka layer views (#2784))
=======
=======
=======
>>>>>>> 6af71ff43 (GEOMESA-3100 Kafka layer views (#2784))
<<<<<<< HEAD
>>>>>>> 23a7d9849f (GEOMESA-3100 Kafka layer views (#2784))
<<<<<<< HEAD
>>>>>>> 416a95a4c0 (GEOMESA-3100 Kafka layer views (#2784))
=======
=======
=======
=======
import java.io.{Closeable, IOException, StringReader}
>>>>>>> 3be8d2a5a (Merge branch 'feature/postgis-fixes')
>>>>>>> db8d998aa (Merge branch 'feature/postgis-fixes')
<<<<<<< HEAD
>>>>>>> cb6bda89b6 (Merge branch 'feature/postgis-fixes')
<<<<<<< HEAD
>>>>>>> 26e5afc4ea (Merge branch 'feature/postgis-fixes')
=======
=======
=======
import java.io.{Closeable, IOException, StringReader}
>>>>>>> d845d7c1b (GEOMESA-3254 Add Bloop build support)
<<<<<<< HEAD
>>>>>>> 09d87762c5 (GEOMESA-3254 Add Bloop build support)
<<<<<<< HEAD
>>>>>>> 63a045a753 (GEOMESA-3254 Add Bloop build support)
=======
=======
=======
>>>>>>> 17f13b3a7 (GEOMESA-3100 Kafka layer views (#2784))
<<<<<<< HEAD
<<<<<<< HEAD
>>>>>>> 6069aba6b4 (GEOMESA-3100 Kafka layer views (#2784))
<<<<<<< HEAD
>>>>>>> ccfb3bd95e (GEOMESA-3100 Kafka layer views (#2784))
=======
=======
=======
>>>>>>> f6e840b5d (GEOMESA-3100 Kafka layer views (#2784))
<<<<<<< HEAD
<<<<<<< HEAD
>>>>>>> 4480b2d1b9 (GEOMESA-3100 Kafka layer views (#2784))
<<<<<<< HEAD
>>>>>>> b5abc19ca4 (GEOMESA-3100 Kafka layer views (#2784))
=======
=======
=======
=======
>>>>>>> bddfdbea5 (GEOMESA-3100 Kafka layer views (#2784))
>>>>>>> c589b832a (GEOMESA-3100 Kafka layer views (#2784))
<<<<<<< HEAD
<<<<<<< HEAD
>>>>>>> 9e433ba57e (GEOMESA-3100 Kafka layer views (#2784))
<<<<<<< HEAD
>>>>>>> 2750a5beef (GEOMESA-3100 Kafka layer views (#2784))
=======
=======
=======
>>>>>>> ffbc2ce32 (GEOMESA-3100 Kafka layer views (#2784))
<<<<<<< HEAD
<<<<<<< HEAD
>>>>>>> 2df2640494 (GEOMESA-3100 Kafka layer views (#2784))
<<<<<<< HEAD
>>>>>>> cb4aa55ae3 (GEOMESA-3100 Kafka layer views (#2784))
=======
=======
=======
=======
>>>>>>> 95c83ca7f (GEOMESA-3100 Kafka layer views (#2784))
>>>>>>> fa68dd43c (GEOMESA-3100 Kafka layer views (#2784))
<<<<<<< HEAD
<<<<<<< HEAD
>>>>>>> 23f312535d (GEOMESA-3100 Kafka layer views (#2784))
<<<<<<< HEAD
>>>>>>> 468da42855 (GEOMESA-3100 Kafka layer views (#2784))
=======
=======
=======
>>>>>>> 54ece16d1 (GEOMESA-3100 Kafka layer views (#2784))
<<<<<<< HEAD
<<<<<<< HEAD
>>>>>>> 826636f69d (GEOMESA-3100 Kafka layer views (#2784))
<<<<<<< HEAD
>>>>>>> 5dd3eb3a6d (GEOMESA-3100 Kafka layer views (#2784))
=======
=======
=======
>>>>>>> c57b5f538 (GEOMESA-3100 Kafka layer views (#2784))
<<<<<<< HEAD
<<<<<<< HEAD
>>>>>>> 1e11ed51a6 (GEOMESA-3100 Kafka layer views (#2784))
<<<<<<< HEAD
>>>>>>> d530f7b24a (GEOMESA-3100 Kafka layer views (#2784))
=======
=======
=======
=======
>>>>>>> ea3b40e18 (GEOMESA-3100 Kafka layer views (#2784))
>>>>>>> 88ef67cdf (GEOMESA-3100 Kafka layer views (#2784))
<<<<<<< HEAD
<<<<<<< HEAD
>>>>>>> 976f319530 (GEOMESA-3100 Kafka layer views (#2784))
<<<<<<< HEAD
>>>>>>> 5e230912b1 (GEOMESA-3100 Kafka layer views (#2784))
=======
=======
=======
>>>>>>> 89fb9950e (GEOMESA-3100 Kafka layer views (#2784))
<<<<<<< HEAD
<<<<<<< HEAD
>>>>>>> bc97b07a31 (GEOMESA-3100 Kafka layer views (#2784))
<<<<<<< HEAD
>>>>>>> f340d6feab (GEOMESA-3100 Kafka layer views (#2784))
=======
=======
=======
=======
import java.io.{Closeable, IOException, StringReader}
>>>>>>> 3be8d2a5a (Merge branch 'feature/postgis-fixes')
>>>>>>> 1b25d7ddb (Merge branch 'feature/postgis-fixes')
>>>>>>> 699117eca9 (Merge branch 'feature/postgis-fixes')
>>>>>>> c69897d7bd (Merge branch 'feature/postgis-fixes')
=======
import java.io.{Closeable, IOException, StringReader}
=======
import java.io.{Closeable, IOException}
>>>>>>> af0a88eb1 (GEOMESA-3100 Kafka layer views (#2784))
>>>>>>> 337ecd16e5 (GEOMESA-3100 Kafka layer views (#2784))
<<<<<<< HEAD
=======
>>>>>>> 64646d61ed (GEOMESA-3100 Kafka layer views (#2784))
=======
=======
>>>>>>> bddfdbea5 (GEOMESA-3100 Kafka layer views (#2784))
>>>>>>> 12fe94b860 (GEOMESA-3100 Kafka layer views (#2784))
=======
=======
>>>>>>> bddfdbea5 (GEOMESA-3100 Kafka layer views (#2784))
=======
>>>>>>> d0dc799ff (GEOMESA-3100 Kafka layer views (#2784))
>>>>>>> 0e42c51dc0 (GEOMESA-3100 Kafka layer views (#2784))
=======
=======
>>>>>>> 95c83ca7f (GEOMESA-3100 Kafka layer views (#2784))
>>>>>>> 19aa61c0de (GEOMESA-3100 Kafka layer views (#2784))
=======
=======
>>>>>>> 936154130 (GEOMESA-3100 Kafka layer views (#2784))
>>>>>>> 626c8f9b93 (GEOMESA-3100 Kafka layer views (#2784))
=======
>>>>>>> 9a5d6d2815 (GEOMESA-3100 Kafka layer views (#2784))
=======
=======
>>>>>>> ea3b40e18 (GEOMESA-3100 Kafka layer views (#2784))
>>>>>>> f4b2369e9a (GEOMESA-3100 Kafka layer views (#2784))
=======
=======
>>>>>>> d2cb939f5 (GEOMESA-3100 Kafka layer views (#2784))
>>>>>>> 305a9263eb (GEOMESA-3100 Kafka layer views (#2784))
=======
=======
import java.io.{Closeable, IOException, StringReader}
>>>>>>> 3be8d2a5a (Merge branch 'feature/postgis-fixes')
>>>>>>> da00c7bd68 (Merge branch 'feature/postgis-fixes')
=======
import java.io.{Closeable, IOException, StringReader}
=======
import java.io.{Closeable, IOException}
<<<<<<< HEAD
>>>>>>> af0a88eb17 (GEOMESA-3100 Kafka layer views (#2784))
<<<<<<< HEAD
>>>>>>> c860f21098 (GEOMESA-3100 Kafka layer views (#2784))
=======
=======
>>>>>>> af0a88eb1 (GEOMESA-3100 Kafka layer views (#2784))
>>>>>>> f7038468b7 (GEOMESA-3100 Kafka layer views (#2784))
>>>>>>> 984dd84de9 (GEOMESA-3100 Kafka layer views (#2784))
=======
>>>>>>> 770d928c15 (GEOMESA-3100 Kafka layer views (#2784))
=======
>>>>>>> bddfdbea54 (GEOMESA-3100 Kafka layer views (#2784))
>>>>>>> 5dc1f86700 (GEOMESA-3100 Kafka layer views (#2784))
=======
=======
>>>>>>> 0a0bf0292e (GEOMESA-3100 Kafka layer views (#2784))
=======
>>>>>>> f43f8303d3 (GEOMESA-3100 Kafka layer views (#2784))
=======
>>>>>>> 6368ee48e8 (GEOMESA-3100 Kafka layer views (#2784))
=======
>>>>>>> 4b0dd3e513 (GEOMESA-3100 Kafka layer views (#2784))
=======
>>>>>>> 6e453fd3d0 (GEOMESA-3100 Kafka layer views (#2784))
=======
>>>>>>> f187a4fcf9 (GEOMESA-3100 Kafka layer views (#2784))
=======
>>>>>>> d309fbbbbf (GEOMESA-3100 Kafka layer views (#2784))
=======
>>>>>>> d76a495d83 (GEOMESA-3100 Kafka layer views (#2784))
=======
>>>>>>> bbc8576d19 (GEOMESA-3100 Kafka layer views (#2784))
=======
>>>>>>> d3b123117a (GEOMESA-3100 Kafka layer views (#2784))
=======
>>>>>>> 885048dd7d (GEOMESA-3100 Kafka layer views (#2784))
=======
>>>>>>> 1c99a27679 (GEOMESA-3100 Kafka layer views (#2784))
=======
>>>>>>> 92dc7a8411 (GEOMESA-3100 Kafka layer views (#2784))
=======
>>>>>>> 2766fc9b5b (GEOMESA-3100 Kafka layer views (#2784))
=======
>>>>>>> de8804123e (GEOMESA-3100 Kafka layer views (#2784))
=======
>>>>>>> 2f673a268a (GEOMESA-3100 Kafka layer views (#2784))
=======
>>>>>>> c44e474495 (GEOMESA-3100 Kafka layer views (#2784))
=======
>>>>>>> c2a94543ba (GEOMESA-3100 Kafka layer views (#2784))
=======
>>>>>>> 117b13aaaa (GEOMESA-3100 Kafka layer views (#2784))
=======
>>>>>>> cf457d8543 (GEOMESA-3100 Kafka layer views (#2784))
=======
>>>>>>> 0cd029fb3b (GEOMESA-3100 Kafka layer views (#2784))
=======
>>>>>>> c61bffed00 (GEOMESA-3100 Kafka layer views (#2784))
=======
>>>>>>> 12f226f36d (GEOMESA-3100 Kafka layer views (#2784))
=======
>>>>>>> 89f0c9f2c3 (GEOMESA-3100 Kafka layer views (#2784))
=======
>>>>>>> 222e44653b (GEOMESA-3100 Kafka layer views (#2784))
=======
>>>>>>> 4f4ecaeb43 (GEOMESA-3100 Kafka layer views (#2784))
=======
>>>>>>> b4cd5a7733 (GEOMESA-3100 Kafka layer views (#2784))
=======
>>>>>>> 750ebbabe7 (GEOMESA-3100 Kafka layer views (#2784))
=======
>>>>>>> fc4546247e (GEOMESA-3100 Kafka layer views (#2784))
=======
>>>>>>> 65e544d20e (GEOMESA-3100 Kafka layer views (#2784))
=======
>>>>>>> c64e652363 (GEOMESA-3100 Kafka layer views (#2784))
=======
>>>>>>> 02eb81c815 (GEOMESA-3100 Kafka layer views (#2784))
=======
>>>>>>> 43ac4062d9 (GEOMESA-3100 Kafka layer views (#2784))
=======
>>>>>>> 30905e530b (GEOMESA-3100 Kafka layer views (#2784))
=======
>>>>>>> 121a1d3470 (GEOMESA-3100 Kafka layer views (#2784))
=======
>>>>>>> 297ca0be9c (GEOMESA-3100 Kafka layer views (#2784))
=======
>>>>>>> 39d28fffcb (GEOMESA-3100 Kafka layer views (#2784))
=======
>>>>>>> d4039e3d9a (GEOMESA-3100 Kafka layer views (#2784))
<<<<<<< HEAD
>>>>>>> bddfdbea54 (GEOMESA-3100 Kafka layer views (#2784))
=======
<<<<<<< HEAD
=======
>>>>>>> 9361541304 (GEOMESA-3100 Kafka layer views (#2784))
=======
>>>>>>> 2f66072323 (GEOMESA-3100 Kafka layer views (#2784))
=======
=======
>>>>>>> 4231e686dd (GEOMESA-3100 Kafka layer views (#2784))
=======
>>>>>>> ac0357d362 (GEOMESA-3100 Kafka layer views (#2784))
=======
>>>>>>> a62b956fb6 (GEOMESA-3100 Kafka layer views (#2784))
=======
>>>>>>> 4adaa7f479 (GEOMESA-3100 Kafka layer views (#2784))
=======
>>>>>>> 6af71ff432 (GEOMESA-3100 Kafka layer views (#2784))
=======
>>>>>>> fa68dd43c6 (GEOMESA-3100 Kafka layer views (#2784))
=======
>>>>>>> 54ece16d15 (GEOMESA-3100 Kafka layer views (#2784))
=======
>>>>>>> c57b5f538a (GEOMESA-3100 Kafka layer views (#2784))
=======
>>>>>>> 88ef67cdfe (GEOMESA-3100 Kafka layer views (#2784))
=======
>>>>>>> 89fb9950ef (GEOMESA-3100 Kafka layer views (#2784))
=======
>>>>>>> 98e7bf59d2 (GEOMESA-3100 Kafka layer views (#2784))
=======
>>>>>>> e24613dc4a (GEOMESA-3100 Kafka layer views (#2784))
=======
>>>>>>> dae1cf3cef (GEOMESA-3100 Kafka layer views (#2784))
=======
>>>>>>> 50a71079c1 (GEOMESA-3100 Kafka layer views (#2784))
=======
=======
>>>>>>> 4c325746bd (GEOMESA-3100 Kafka layer views (#2784))
=======
>>>>>>> 3ebcdb99d9 (GEOMESA-3100 Kafka layer views (#2784))
=======
>>>>>>> fdf51402cf (GEOMESA-3100 Kafka layer views (#2784))
=======
>>>>>>> a377061090 (GEOMESA-3100 Kafka layer views (#2784))
=======
>>>>>>> eddb4eaca1 (GEOMESA-3100 Kafka layer views (#2784))
=======
>>>>>>> be0c9d161a (GEOMESA-3100 Kafka layer views (#2784))
=======
>>>>>>> 7bdc1feea8 (GEOMESA-3100 Kafka layer views (#2784))
=======
>>>>>>> 9b15c8e14c (GEOMESA-3100 Kafka layer views (#2784))
=======
>>>>>>> 3977ecc140 (GEOMESA-3100 Kafka layer views (#2784))
=======
>>>>>>> 495a1efc9f (GEOMESA-3100 Kafka layer views (#2784))
=======
>>>>>>> 5d8c5baea0 (GEOMESA-3100 Kafka layer views (#2784))
=======
>>>>>>> 7628960f66 (GEOMESA-3100 Kafka layer views (#2784))
=======
>>>>>>> 416a95a4c0 (GEOMESA-3100 Kafka layer views (#2784))
=======
>>>>>>> ccfb3bd95e (GEOMESA-3100 Kafka layer views (#2784))
=======
>>>>>>> 65a3a6e36 (GEOMESA-3100 Kafka layer views (#2784))
>>>>>>> 9e910620b3 (GEOMESA-3100 Kafka layer views (#2784))
=======
>>>>>>> 429ffc55e (GEOMESA-3100 Kafka layer views (#2784))
=======
>>>>>>> e7f3e6588 (GEOMESA-3100 Kafka layer views (#2784))
=======
>>>>>>> 6f6887eb8 (GEOMESA-3100 Kafka layer views (#2784))
=======
>>>>>>> 42549e8e3 (GEOMESA-3100 Kafka layer views (#2784))
=======
>>>>>>> 8ed2c9f7e5 (GEOMESA-3100 Kafka layer views (#2784))
=======
>>>>>>> c1d0543aac (GEOMESA-3100 Kafka layer views (#2784))
=======
>>>>>>> 8b9e99d11a (GEOMESA-3100 Kafka layer views (#2784))
=======
>>>>>>> 614fcb6bc3 (GEOMESA-3100 Kafka layer views (#2784))
=======
=======
>>>>>>> 04f82bbc57 (GEOMESA-3100 Kafka layer views (#2784))
=======
>>>>>>> e0773a1bd7 (GEOMESA-3100 Kafka layer views (#2784))
=======
>>>>>>> ae5eea67f1 (GEOMESA-3100 Kafka layer views (#2784))
=======
>>>>>>> 23a7d9849f (GEOMESA-3100 Kafka layer views (#2784))
=======
>>>>>>> 6069aba6b4 (GEOMESA-3100 Kafka layer views (#2784))
=======
>>>>>>> 4231e686d (GEOMESA-3100 Kafka layer views (#2784))
>>>>>>> 69e3273ac1 (GEOMESA-3100 Kafka layer views (#2784))
=======
>>>>>>> ac0357d36 (GEOMESA-3100 Kafka layer views (#2784))
=======
>>>>>>> a62b956fb (GEOMESA-3100 Kafka layer views (#2784))
=======
>>>>>>> 4adaa7f47 (GEOMESA-3100 Kafka layer views (#2784))
=======
>>>>>>> 6af71ff43 (GEOMESA-3100 Kafka layer views (#2784))
=======
>>>>>>> d0dc799ff (GEOMESA-3100 Kafka layer views (#2784))
>>>>>>> ea3b40e187 (GEOMESA-3100 Kafka layer views (#2784))
=======
>>>>>>> 9236b02087 (GEOMESA-3100 Kafka layer views (#2784))
=======
>>>>>>> 862857ce2e (GEOMESA-3100 Kafka layer views (#2784))
=======
=======
>>>>>>> d0dc799ff (GEOMESA-3100 Kafka layer views (#2784))
>>>>>>> 28427dfd8f (GEOMESA-3100 Kafka layer views (#2784))
=======
>>>>>>> 936154130 (GEOMESA-3100 Kafka layer views (#2784))
=======
>>>>>>> 2f6607232 (GEOMESA-3100 Kafka layer views (#2784))
=======
=======
>>>>>>> d0dc799ff (GEOMESA-3100 Kafka layer views (#2784))
>>>>>>> ea3b40e18 (GEOMESA-3100 Kafka layer views (#2784))
=======
>>>>>>> f6e840b5dd (GEOMESA-3100 Kafka layer views (#2784))
=======
>>>>>>> c589b832a5 (GEOMESA-3100 Kafka layer views (#2784))
=======
=======
>>>>>>> d0dc799ff (GEOMESA-3100 Kafka layer views (#2784))
>>>>>>> ffbc2ce32a (GEOMESA-3100 Kafka layer views (#2784))
=======
>>>>>>> 936154130 (GEOMESA-3100 Kafka layer views (#2784))
=======
>>>>>>> 2f6607232 (GEOMESA-3100 Kafka layer views (#2784))
=======
=======
>>>>>>> d0dc799ff (GEOMESA-3100 Kafka layer views (#2784))
>>>>>>> ea3b40e18 (GEOMESA-3100 Kafka layer views (#2784))
=======
<<<<<<< HEAD
>>>>>>> 2f6607232 (GEOMESA-3100 Kafka layer views (#2784))
=======
=======
>>>>>>> d0dc799ff (GEOMESA-3100 Kafka layer views (#2784))
>>>>>>> ea3b40e18 (GEOMESA-3100 Kafka layer views (#2784))
=======
>>>>>>> 9236b0208 (GEOMESA-3100 Kafka layer views (#2784))
=======
>>>>>>> 862857ce2 (GEOMESA-3100 Kafka layer views (#2784))
=======
=======
>>>>>>> d0dc799ff (GEOMESA-3100 Kafka layer views (#2784))
>>>>>>> 28427dfd8 (GEOMESA-3100 Kafka layer views (#2784))
=======
=======
>>>>>>> ac0357d36 (GEOMESA-3100 Kafka layer views (#2784))
<<<<<<< HEAD
>>>>>>> 2f6607232 (GEOMESA-3100 Kafka layer views (#2784))
=======
=======
>>>>>>> d0dc799ff (GEOMESA-3100 Kafka layer views (#2784))
>>>>>>> ea3b40e18 (GEOMESA-3100 Kafka layer views (#2784))
=======
>>>>>>> 581f1dd15 (GEOMESA-3100 Kafka layer views (#2784))
=======
>>>>>>> 1a5f68233 (GEOMESA-3100 Kafka layer views (#2784))
=======
=======
>>>>>>> d0dc799ff (GEOMESA-3100 Kafka layer views (#2784))
>>>>>>> 73767737b (GEOMESA-3100 Kafka layer views (#2784))
=======
=======
>>>>>>> 429ffc55e (GEOMESA-3100 Kafka layer views (#2784))
<<<<<<< HEAD
>>>>>>> locationtech-main
=======
>>>>>>> 58286bfd3 (GEOMESA-3100 Kafka layer views (#2784))
>>>>>>> 5ca0cd6de (GEOMESA-3100 Kafka layer views (#2784))
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
>>>>>>> d0dc799ff1 (GEOMESA-3100 Kafka layer views (#2784))
<<<<<<< HEAD
>>>>>>> 808743e257 (GEOMESA-3100 Kafka layer views (#2784))
=======
=======
import java.io.{Closeable, IOException, StringReader}
=======
import java.io.{Closeable, IOException}
>>>>>>> af0a88eb1 (GEOMESA-3100 Kafka layer views (#2784))
>>>>>>> 95c83ca7fa (GEOMESA-3100 Kafka layer views (#2784))
<<<<<<< HEAD
>>>>>>> ad0d29873e (GEOMESA-3100 Kafka layer views (#2784))
=======
=======
>>>>>>> 9361541304 (GEOMESA-3100 Kafka layer views (#2784))
<<<<<<< HEAD
>>>>>>> 0a0bf0292e (GEOMESA-3100 Kafka layer views (#2784))
=======
=======
=======
>>>>>>> bddfdbea5 (GEOMESA-3100 Kafka layer views (#2784))
>>>>>>> 2f66072323 (GEOMESA-3100 Kafka layer views (#2784))
<<<<<<< HEAD
>>>>>>> f43f8303d3 (GEOMESA-3100 Kafka layer views (#2784))
=======
=======
=======
>>>>>>> ac0357d362 (GEOMESA-3100 Kafka layer views (#2784))
=======
>>>>>>> a62b956fb6 (GEOMESA-3100 Kafka layer views (#2784))
=======
=======
>>>>>>> e24613dc4a (GEOMESA-3100 Kafka layer views (#2784))
=======
>>>>>>> dae1cf3cef (GEOMESA-3100 Kafka layer views (#2784))
=======
>>>>>>> 50a71079c1 (GEOMESA-3100 Kafka layer views (#2784))
=======
>>>>>>> 4c325746bd (GEOMESA-3100 Kafka layer views (#2784))
=======
>>>>>>> 3ebcdb99d9 (GEOMESA-3100 Kafka layer views (#2784))
=======
>>>>>>> fdf51402cf (GEOMESA-3100 Kafka layer views (#2784))
=======
=======
>>>>>>> 7bdc1feea8 (GEOMESA-3100 Kafka layer views (#2784))
=======
>>>>>>> 9b15c8e14c (GEOMESA-3100 Kafka layer views (#2784))
=======
>>>>>>> 495a1efc9f (GEOMESA-3100 Kafka layer views (#2784))
=======
>>>>>>> 5d8c5baea0 (GEOMESA-3100 Kafka layer views (#2784))
=======
>>>>>>> 7628960f66 (GEOMESA-3100 Kafka layer views (#2784))
=======
>>>>>>> c1d0543aac (GEOMESA-3100 Kafka layer views (#2784))
>>>>>>> be0c9d161a (GEOMESA-3100 Kafka layer views (#2784))
=======
>>>>>>> 8b9e99d11a (GEOMESA-3100 Kafka layer views (#2784))
=======
>>>>>>> ea3b40e18 (GEOMESA-3100 Kafka layer views (#2784))
>>>>>>> 4adaa7f479 (GEOMESA-3100 Kafka layer views (#2784))
=======
>>>>>>> 54ece16d15 (GEOMESA-3100 Kafka layer views (#2784))
=======
>>>>>>> c57b5f538a (GEOMESA-3100 Kafka layer views (#2784))
=======
=======
>>>>>>> ea3b40e18 (GEOMESA-3100 Kafka layer views (#2784))
>>>>>>> 88ef67cdfe (GEOMESA-3100 Kafka layer views (#2784))
=======
>>>>>>> 73767737b (GEOMESA-3100 Kafka layer views (#2784))
=======
>>>>>>> 429ffc55e (GEOMESA-3100 Kafka layer views (#2784))
=======
>>>>>>> e7f3e6588 (GEOMESA-3100 Kafka layer views (#2784))
=======
=======
>>>>>>> ea3b40e18 (GEOMESA-3100 Kafka layer views (#2784))
>>>>>>> 6f6887eb8 (GEOMESA-3100 Kafka layer views (#2784))
=======
=======
>>>>>>> 04f82bbc57 (GEOMESA-3100 Kafka layer views (#2784))
=======
>>>>>>> e0773a1bd7 (GEOMESA-3100 Kafka layer views (#2784))
=======
>>>>>>> ae5eea67f1 (GEOMESA-3100 Kafka layer views (#2784))
=======
>>>>>>> ea3b40e18 (GEOMESA-3100 Kafka layer views (#2784))
=======
>>>>>>> 28427dfd8 (GEOMESA-3100 Kafka layer views (#2784))
>>>>>>> 614fcb6bc3 (GEOMESA-3100 Kafka layer views (#2784))
=======
>>>>>>> ac0357d36 (GEOMESA-3100 Kafka layer views (#2784))
=======
>>>>>>> a62b956fb (GEOMESA-3100 Kafka layer views (#2784))
=======
=======
>>>>>>> ea3b40e18 (GEOMESA-3100 Kafka layer views (#2784))
>>>>>>> 4adaa7f47 (GEOMESA-3100 Kafka layer views (#2784))
=======
>>>>>>> bddfdbea5 (GEOMESA-3100 Kafka layer views (#2784))
=======
>>>>>>> d0dc799ff (GEOMESA-3100 Kafka layer views (#2784))
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
>>>>>>> ea3b40e187 (GEOMESA-3100 Kafka layer views (#2784))
<<<<<<< HEAD
>>>>>>> 6368ee48e8 (GEOMESA-3100 Kafka layer views (#2784))
=======
=======
import java.io.{Closeable, IOException, StringReader}
=======
import java.io.{Closeable, IOException}
>>>>>>> af0a88eb1 (GEOMESA-3100 Kafka layer views (#2784))
>>>>>>> d2cb939f51 (GEOMESA-3100 Kafka layer views (#2784))
<<<<<<< HEAD
>>>>>>> 4516873dab (GEOMESA-3100 Kafka layer views (#2784))
=======
=======
import java.io.{Closeable, IOException, StringReader}
>>>>>>> 3be8d2a5a4 (Merge branch 'feature/postgis-fixes')
<<<<<<< HEAD
>>>>>>> 34472778d3 (Merge branch 'feature/postgis-fixes')
=======
=======
import java.io.{Closeable, IOException, StringReader}
=======
import java.io.{Closeable, IOException}
>>>>>>> af0a88eb1 (GEOMESA-3100 Kafka layer views (#2784))
>>>>>>> a0314fb7ff (GEOMESA-3100 Kafka layer views (#2784))
<<<<<<< HEAD
>>>>>>> 8ec26b8c2a (GEOMESA-3100 Kafka layer views (#2784))
=======
=======
>>>>>>> 9236b02087 (GEOMESA-3100 Kafka layer views (#2784))
<<<<<<< HEAD
>>>>>>> 4b0dd3e513 (GEOMESA-3100 Kafka layer views (#2784))
=======
=======
=======
>>>>>>> bddfdbea5 (GEOMESA-3100 Kafka layer views (#2784))
>>>>>>> 862857ce2e (GEOMESA-3100 Kafka layer views (#2784))
<<<<<<< HEAD
>>>>>>> 6e453fd3d0 (GEOMESA-3100 Kafka layer views (#2784))
=======
=======
=======
>>>>>>> bddfdbea5 (GEOMESA-3100 Kafka layer views (#2784))
=======
>>>>>>> d0dc799ff (GEOMESA-3100 Kafka layer views (#2784))
>>>>>>> 28427dfd8f (GEOMESA-3100 Kafka layer views (#2784))
<<<<<<< HEAD
>>>>>>> f187a4fcf9 (GEOMESA-3100 Kafka layer views (#2784))
=======
=======
=======
>>>>>>> 4adaa7f479 (GEOMESA-3100 Kafka layer views (#2784))
=======
>>>>>>> 88ef67cdfe (GEOMESA-3100 Kafka layer views (#2784))
=======
>>>>>>> 50a71079c1 (GEOMESA-3100 Kafka layer views (#2784))
=======
>>>>>>> 9e910620b3 (GEOMESA-3100 Kafka layer views (#2784))
=======
=======
>>>>>>> 9b15c8e14c (GEOMESA-3100 Kafka layer views (#2784))
=======
>>>>>>> 3977ecc140 (GEOMESA-3100 Kafka layer views (#2784))
=======
>>>>>>> 7628960f66 (GEOMESA-3100 Kafka layer views (#2784))
=======
>>>>>>> 6f6887eb8 (GEOMESA-3100 Kafka layer views (#2784))
>>>>>>> fdf51402cf (GEOMESA-3100 Kafka layer views (#2784))
=======
>>>>>>> 614fcb6bc3 (GEOMESA-3100 Kafka layer views (#2784))
=======
>>>>>>> 69e3273ac1 (GEOMESA-3100 Kafka layer views (#2784))
=======
=======
>>>>>>> 4adaa7f47 (GEOMESA-3100 Kafka layer views (#2784))
>>>>>>> ae5eea67f1 (GEOMESA-3100 Kafka layer views (#2784))
=======
>>>>>>> 95c83ca7f (GEOMESA-3100 Kafka layer views (#2784))
<<<<<<< HEAD
<<<<<<< HEAD
>>>>>>> 4231e686dd (GEOMESA-3100 Kafka layer views (#2784))
<<<<<<< HEAD
>>>>>>> d309fbbbbf (GEOMESA-3100 Kafka layer views (#2784))
=======
=======
=======
>>>>>>> 936154130 (GEOMESA-3100 Kafka layer views (#2784))
<<<<<<< HEAD
<<<<<<< HEAD
<<<<<<< HEAD
<<<<<<< HEAD
<<<<<<< HEAD
<<<<<<< HEAD
>>>>>>> ac0357d362 (GEOMESA-3100 Kafka layer views (#2784))
<<<<<<< HEAD
>>>>>>> d76a495d83 (GEOMESA-3100 Kafka layer views (#2784))
=======
=======
=======
>>>>>>> c57b5f538a (GEOMESA-3100 Kafka layer views (#2784))
=======
>>>>>>> 4c325746bd (GEOMESA-3100 Kafka layer views (#2784))
=======
=======
>>>>>>> 495a1efc9f (GEOMESA-3100 Kafka layer views (#2784))
=======
>>>>>>> 5d8c5baea0 (GEOMESA-3100 Kafka layer views (#2784))
=======
>>>>>>> e7f3e6588 (GEOMESA-3100 Kafka layer views (#2784))
>>>>>>> 3ebcdb99d9 (GEOMESA-3100 Kafka layer views (#2784))
=======
>>>>>>> 04f82bbc57 (GEOMESA-3100 Kafka layer views (#2784))
=======
=======
>>>>>>> a62b956fb (GEOMESA-3100 Kafka layer views (#2784))
>>>>>>> e0773a1bd7 (GEOMESA-3100 Kafka layer views (#2784))
=======
=======
>>>>>>> bddfdbea5 (GEOMESA-3100 Kafka layer views (#2784))
>>>>>>> 2f6607232 (GEOMESA-3100 Kafka layer views (#2784))
<<<<<<< HEAD
<<<<<<< HEAD
<<<<<<< HEAD
<<<<<<< HEAD
<<<<<<< HEAD
<<<<<<< HEAD
<<<<<<< HEAD
>>>>>>> a62b956fb6 (GEOMESA-3100 Kafka layer views (#2784))
<<<<<<< HEAD
>>>>>>> bbc8576d19 (GEOMESA-3100 Kafka layer views (#2784))
=======
=======
=======
>>>>>>> 3ebcdb99d9 (GEOMESA-3100 Kafka layer views (#2784))
=======
>>>>>>> fdf51402cf (GEOMESA-3100 Kafka layer views (#2784))
=======
=======
>>>>>>> 7628960f66 (GEOMESA-3100 Kafka layer views (#2784))
=======
>>>>>>> e0773a1bd7 (GEOMESA-3100 Kafka layer views (#2784))
>>>>>>> 5d8c5baea0 (GEOMESA-3100 Kafka layer views (#2784))
=======
>>>>>>> ae5eea67f1 (GEOMESA-3100 Kafka layer views (#2784))
=======
>>>>>>> ea3b40e18 (GEOMESA-3100 Kafka layer views (#2784))
<<<<<<< HEAD
<<<<<<< HEAD
>>>>>>> 4adaa7f479 (GEOMESA-3100 Kafka layer views (#2784))
<<<<<<< HEAD
>>>>>>> d3b123117a (GEOMESA-3100 Kafka layer views (#2784))
=======
=======
=======
>>>>>>> d2cb939f5 (GEOMESA-3100 Kafka layer views (#2784))
<<<<<<< HEAD
<<<<<<< HEAD
<<<<<<< HEAD
<<<<<<< HEAD
<<<<<<< HEAD
<<<<<<< HEAD
>>>>>>> 6af71ff432 (GEOMESA-3100 Kafka layer views (#2784))
<<<<<<< HEAD
>>>>>>> 885048dd7d (GEOMESA-3100 Kafka layer views (#2784))
=======
=======
=======
>>>>>>> a377061090 (GEOMESA-3100 Kafka layer views (#2784))
=======
>>>>>>> e944f1c88b (Merge branch 'feature/postgis-fixes')
=======
=======
>>>>>>> 26e5afc4ea (Merge branch 'feature/postgis-fixes')
=======
>>>>>>> 23a7d9849f (GEOMESA-3100 Kafka layer views (#2784))
>>>>>>> 416a95a4c0 (GEOMESA-3100 Kafka layer views (#2784))
=======
>>>>>>> cb6bda89b6 (Merge branch 'feature/postgis-fixes')
=======
import java.io.{Closeable, IOException, StringReader}
>>>>>>> 3be8d2a5a (Merge branch 'feature/postgis-fixes')
<<<<<<< HEAD
>>>>>>> db8d998aa2 (Merge branch 'feature/postgis-fixes')
<<<<<<< HEAD
>>>>>>> 42e8565e9b (Merge branch 'feature/postgis-fixes')
=======
=======
import java.io.{Closeable, IOException, StringReader}
>>>>>>> d845d7c1bd (GEOMESA-3254 Add Bloop build support)
<<<<<<< HEAD
>>>>>>> f1532f2313 (GEOMESA-3254 Add Bloop build support)
=======
=======
import java.io.{Closeable, IOException, StringReader}
=======
import java.io.{Closeable, IOException}
>>>>>>> af0a88eb1 (GEOMESA-3100 Kafka layer views (#2784))
>>>>>>> 17f13b3a7a (GEOMESA-3100 Kafka layer views (#2784))
<<<<<<< HEAD
>>>>>>> 3010fc384e (GEOMESA-3100 Kafka layer views (#2784))
=======
=======
>>>>>>> f6e840b5dd (GEOMESA-3100 Kafka layer views (#2784))
<<<<<<< HEAD
>>>>>>> 1c99a27679 (GEOMESA-3100 Kafka layer views (#2784))
=======
=======
=======
>>>>>>> bddfdbea5 (GEOMESA-3100 Kafka layer views (#2784))
>>>>>>> c589b832a5 (GEOMESA-3100 Kafka layer views (#2784))
<<<<<<< HEAD
>>>>>>> 92dc7a8411 (GEOMESA-3100 Kafka layer views (#2784))
=======
=======
=======
>>>>>>> bddfdbea5 (GEOMESA-3100 Kafka layer views (#2784))
=======
>>>>>>> d0dc799ff (GEOMESA-3100 Kafka layer views (#2784))
>>>>>>> ffbc2ce32a (GEOMESA-3100 Kafka layer views (#2784))
<<<<<<< HEAD
>>>>>>> 2766fc9b5b (GEOMESA-3100 Kafka layer views (#2784))
=======
=======
=======
>>>>>>> 95c83ca7f (GEOMESA-3100 Kafka layer views (#2784))
>>>>>>> fa68dd43c6 (GEOMESA-3100 Kafka layer views (#2784))
<<<<<<< HEAD
>>>>>>> de8804123e (GEOMESA-3100 Kafka layer views (#2784))
=======
=======
=======
>>>>>>> 936154130 (GEOMESA-3100 Kafka layer views (#2784))
>>>>>>> 54ece16d15 (GEOMESA-3100 Kafka layer views (#2784))
<<<<<<< HEAD
>>>>>>> 2f673a268a (GEOMESA-3100 Kafka layer views (#2784))
=======
=======
>>>>>>> c57b5f538a (GEOMESA-3100 Kafka layer views (#2784))
<<<<<<< HEAD
>>>>>>> c44e474495 (GEOMESA-3100 Kafka layer views (#2784))
=======
=======
=======
>>>>>>> ea3b40e18 (GEOMESA-3100 Kafka layer views (#2784))
>>>>>>> 88ef67cdfe (GEOMESA-3100 Kafka layer views (#2784))
<<<<<<< HEAD
>>>>>>> c2a94543ba (GEOMESA-3100 Kafka layer views (#2784))
=======
=======
=======
>>>>>>> d2cb939f5 (GEOMESA-3100 Kafka layer views (#2784))
>>>>>>> 89fb9950ef (GEOMESA-3100 Kafka layer views (#2784))
<<<<<<< HEAD
>>>>>>> 117b13aaaa (GEOMESA-3100 Kafka layer views (#2784))
=======
=======
=======
import java.io.{Closeable, IOException, StringReader}
>>>>>>> 3be8d2a5a (Merge branch 'feature/postgis-fixes')
>>>>>>> 1b25d7ddb4 (Merge branch 'feature/postgis-fixes')
<<<<<<< HEAD
>>>>>>> 67de3c3202 (Merge branch 'feature/postgis-fixes')
=======
=======
=======
<<<<<<< HEAD
>>>>>>> eecabb92a (GEOMESA-3100 Kafka layer views (#2784))
<<<<<<< HEAD
>>>>>>> 98e7bf59d2 (GEOMESA-3100 Kafka layer views (#2784))
<<<<<<< HEAD
>>>>>>> cf457d8543 (GEOMESA-3100 Kafka layer views (#2784))
=======
=======
=======
>>>>>>> 581f1dd15 (GEOMESA-3100 Kafka layer views (#2784))
<<<<<<< HEAD
>>>>>>> e24613dc4a (GEOMESA-3100 Kafka layer views (#2784))
<<<<<<< HEAD
>>>>>>> 0cd029fb3b (GEOMESA-3100 Kafka layer views (#2784))
=======
=======
=======
=======
>>>>>>> bddfdbea5 (GEOMESA-3100 Kafka layer views (#2784))
>>>>>>> 1a5f68233 (GEOMESA-3100 Kafka layer views (#2784))
<<<<<<< HEAD
>>>>>>> dae1cf3cef (GEOMESA-3100 Kafka layer views (#2784))
<<<<<<< HEAD
>>>>>>> c61bffed00 (GEOMESA-3100 Kafka layer views (#2784))
=======
=======
=======
>>>>>>> 73767737b (GEOMESA-3100 Kafka layer views (#2784))
<<<<<<< HEAD
>>>>>>> 50a71079c1 (GEOMESA-3100 Kafka layer views (#2784))
<<<<<<< HEAD
>>>>>>> 12f226f36d (GEOMESA-3100 Kafka layer views (#2784))
=======
=======
=======
=======
>>>>>>> 95c83ca7f (GEOMESA-3100 Kafka layer views (#2784))
>>>>>>> 65a3a6e36 (GEOMESA-3100 Kafka layer views (#2784))
<<<<<<< HEAD
>>>>>>> 9e910620b3 (GEOMESA-3100 Kafka layer views (#2784))
<<<<<<< HEAD
>>>>>>> 89f0c9f2c3 (GEOMESA-3100 Kafka layer views (#2784))
=======
=======
=======
>>>>>>> 429ffc55e (GEOMESA-3100 Kafka layer views (#2784))
<<<<<<< HEAD
>>>>>>> 4c325746bd (GEOMESA-3100 Kafka layer views (#2784))
<<<<<<< HEAD
>>>>>>> 222e44653b (GEOMESA-3100 Kafka layer views (#2784))
=======
=======
=======
>>>>>>> e7f3e6588 (GEOMESA-3100 Kafka layer views (#2784))
<<<<<<< HEAD
>>>>>>> 3ebcdb99d9 (GEOMESA-3100 Kafka layer views (#2784))
<<<<<<< HEAD
>>>>>>> 4f4ecaeb43 (GEOMESA-3100 Kafka layer views (#2784))
=======
=======
=======
=======
>>>>>>> ea3b40e18 (GEOMESA-3100 Kafka layer views (#2784))
>>>>>>> 6f6887eb8 (GEOMESA-3100 Kafka layer views (#2784))
<<<<<<< HEAD
>>>>>>> fdf51402cf (GEOMESA-3100 Kafka layer views (#2784))
<<<<<<< HEAD
>>>>>>> b4cd5a7733 (GEOMESA-3100 Kafka layer views (#2784))
=======
=======
=======
>>>>>>> 42549e8e3 (GEOMESA-3100 Kafka layer views (#2784))
<<<<<<< HEAD
>>>>>>> a377061090 (GEOMESA-3100 Kafka layer views (#2784))
<<<<<<< HEAD
>>>>>>> 750ebbabe7 (GEOMESA-3100 Kafka layer views (#2784))
=======
=======
=======
=======
import java.io.{Closeable, IOException, StringReader}
>>>>>>> 3be8d2a5a (Merge branch 'feature/postgis-fixes')
>>>>>>> e8cc4971c6 (Merge branch 'feature/postgis-fixes')
<<<<<<< HEAD
>>>>>>> e944f1c88b (Merge branch 'feature/postgis-fixes')
<<<<<<< HEAD
>>>>>>> 638b68d081 (Merge branch 'feature/postgis-fixes')
=======
=======
=======
>>>>>>> a0314fb7f (GEOMESA-3100 Kafka layer views (#2784))
<<<<<<< HEAD
>>>>>>> 8ed2c9f7e5 (GEOMESA-3100 Kafka layer views (#2784))
<<<<<<< HEAD
>>>>>>> eddb4eaca1 (GEOMESA-3100 Kafka layer views (#2784))
<<<<<<< HEAD
>>>>>>> fc4546247e (GEOMESA-3100 Kafka layer views (#2784))
=======
=======
=======
=======
>>>>>>> 9236b0208 (GEOMESA-3100 Kafka layer views (#2784))
<<<<<<< HEAD
>>>>>>> c1d0543aac (GEOMESA-3100 Kafka layer views (#2784))
<<<<<<< HEAD
>>>>>>> be0c9d161a (GEOMESA-3100 Kafka layer views (#2784))
<<<<<<< HEAD
>>>>>>> 65e544d20e (GEOMESA-3100 Kafka layer views (#2784))
=======
=======
=======
=======
=======
>>>>>>> bddfdbea5 (GEOMESA-3100 Kafka layer views (#2784))
>>>>>>> 862857ce2 (GEOMESA-3100 Kafka layer views (#2784))
<<<<<<< HEAD
>>>>>>> 8b9e99d11a (GEOMESA-3100 Kafka layer views (#2784))
<<<<<<< HEAD
>>>>>>> 7bdc1feea8 (GEOMESA-3100 Kafka layer views (#2784))
<<<<<<< HEAD
>>>>>>> c64e652363 (GEOMESA-3100 Kafka layer views (#2784))
=======
=======
=======
=======
>>>>>>> 28427dfd8 (GEOMESA-3100 Kafka layer views (#2784))
<<<<<<< HEAD
>>>>>>> 614fcb6bc3 (GEOMESA-3100 Kafka layer views (#2784))
<<<<<<< HEAD
>>>>>>> 9b15c8e14c (GEOMESA-3100 Kafka layer views (#2784))
<<<<<<< HEAD
>>>>>>> 02eb81c815 (GEOMESA-3100 Kafka layer views (#2784))
=======
=======
=======
=======
=======
>>>>>>> 95c83ca7f (GEOMESA-3100 Kafka layer views (#2784))
>>>>>>> 4231e686d (GEOMESA-3100 Kafka layer views (#2784))
<<<<<<< HEAD
>>>>>>> 69e3273ac1 (GEOMESA-3100 Kafka layer views (#2784))
<<<<<<< HEAD
>>>>>>> 3977ecc140 (GEOMESA-3100 Kafka layer views (#2784))
<<<<<<< HEAD
>>>>>>> 43ac4062d9 (GEOMESA-3100 Kafka layer views (#2784))
=======
=======
=======
=======
>>>>>>> ac0357d36 (GEOMESA-3100 Kafka layer views (#2784))
<<<<<<< HEAD
>>>>>>> 04f82bbc57 (GEOMESA-3100 Kafka layer views (#2784))
<<<<<<< HEAD
>>>>>>> 495a1efc9f (GEOMESA-3100 Kafka layer views (#2784))
<<<<<<< HEAD
>>>>>>> 30905e530b (GEOMESA-3100 Kafka layer views (#2784))
=======
=======
=======
=======
>>>>>>> a62b956fb (GEOMESA-3100 Kafka layer views (#2784))
<<<<<<< HEAD
>>>>>>> e0773a1bd7 (GEOMESA-3100 Kafka layer views (#2784))
<<<<<<< HEAD
>>>>>>> 5d8c5baea0 (GEOMESA-3100 Kafka layer views (#2784))
<<<<<<< HEAD
>>>>>>> 121a1d3470 (GEOMESA-3100 Kafka layer views (#2784))
=======
=======
=======
=======
=======
>>>>>>> ea3b40e18 (GEOMESA-3100 Kafka layer views (#2784))
>>>>>>> 4adaa7f47 (GEOMESA-3100 Kafka layer views (#2784))
<<<<<<< HEAD
>>>>>>> ae5eea67f1 (GEOMESA-3100 Kafka layer views (#2784))
<<<<<<< HEAD
>>>>>>> 7628960f66 (GEOMESA-3100 Kafka layer views (#2784))
<<<<<<< HEAD
>>>>>>> 297ca0be9c (GEOMESA-3100 Kafka layer views (#2784))
=======
=======
=======
=======
>>>>>>> 6af71ff43 (GEOMESA-3100 Kafka layer views (#2784))
<<<<<<< HEAD
>>>>>>> 23a7d9849f (GEOMESA-3100 Kafka layer views (#2784))
<<<<<<< HEAD
>>>>>>> 416a95a4c0 (GEOMESA-3100 Kafka layer views (#2784))
<<<<<<< HEAD
>>>>>>> 39d28fffcb (GEOMESA-3100 Kafka layer views (#2784))
=======
=======
=======
=======
=======
import java.io.{Closeable, IOException, StringReader}
>>>>>>> 3be8d2a5a (Merge branch 'feature/postgis-fixes')
>>>>>>> db8d998aa (Merge branch 'feature/postgis-fixes')
<<<<<<< HEAD
>>>>>>> cb6bda89b6 (Merge branch 'feature/postgis-fixes')
<<<<<<< HEAD
>>>>>>> 26e5afc4ea (Merge branch 'feature/postgis-fixes')
<<<<<<< HEAD
>>>>>>> 71adb695c5 (Merge branch 'feature/postgis-fixes')
=======
=======
=======
=======
import java.io.{Closeable, IOException, StringReader}
>>>>>>> d845d7c1b (GEOMESA-3254 Add Bloop build support)
<<<<<<< HEAD
>>>>>>> 09d87762c5 (GEOMESA-3254 Add Bloop build support)
<<<<<<< HEAD
>>>>>>> 63a045a753 (GEOMESA-3254 Add Bloop build support)
<<<<<<< HEAD
>>>>>>> 5a4c24e020 (GEOMESA-3254 Add Bloop build support)
=======
=======
=======
=======
>>>>>>> 17f13b3a7 (GEOMESA-3100 Kafka layer views (#2784))
=======
>>>>>>> 0d5f6377de (GEOMESA-3100 Kafka layer views (#2784))
>>>>>>> 6069aba6b4 (GEOMESA-3100 Kafka layer views (#2784))
<<<<<<< HEAD
>>>>>>> ccfb3bd95e (GEOMESA-3100 Kafka layer views (#2784))
<<<<<<< HEAD
>>>>>>> d4039e3d9a (GEOMESA-3100 Kafka layer views (#2784))
=======
=======
=======
=======
>>>>>>> f6e840b5d (GEOMESA-3100 Kafka layer views (#2784))
=======
>>>>>>> 41df6a2aa3 (GEOMESA-3100 Kafka layer views (#2784))
>>>>>>> 4480b2d1b9 (GEOMESA-3100 Kafka layer views (#2784))
<<<<<<< HEAD
>>>>>>> b5abc19ca4 (GEOMESA-3100 Kafka layer views (#2784))
<<<<<<< HEAD
>>>>>>> 0d5f6377de (GEOMESA-3100 Kafka layer views (#2784))
=======
=======
=======
=======
=======
>>>>>>> bddfdbea5 (GEOMESA-3100 Kafka layer views (#2784))
>>>>>>> c589b832a (GEOMESA-3100 Kafka layer views (#2784))
=======
>>>>>>> fb32a36e0e (GEOMESA-3100 Kafka layer views (#2784))
>>>>>>> 9e433ba57e (GEOMESA-3100 Kafka layer views (#2784))
<<<<<<< HEAD
>>>>>>> 2750a5beef (GEOMESA-3100 Kafka layer views (#2784))
<<<<<<< HEAD
>>>>>>> 41df6a2aa3 (GEOMESA-3100 Kafka layer views (#2784))
=======
=======
=======
=======
>>>>>>> ffbc2ce32 (GEOMESA-3100 Kafka layer views (#2784))
=======
>>>>>>> 340134cdda (GEOMESA-3100 Kafka layer views (#2784))
>>>>>>> 2df2640494 (GEOMESA-3100 Kafka layer views (#2784))
<<<<<<< HEAD
>>>>>>> cb4aa55ae3 (GEOMESA-3100 Kafka layer views (#2784))
<<<<<<< HEAD
>>>>>>> fb32a36e0e (GEOMESA-3100 Kafka layer views (#2784))
=======
=======
=======
=======
=======
>>>>>>> 95c83ca7f (GEOMESA-3100 Kafka layer views (#2784))
>>>>>>> fa68dd43c (GEOMESA-3100 Kafka layer views (#2784))
=======
>>>>>>> ea8384d9b7 (GEOMESA-3100 Kafka layer views (#2784))
>>>>>>> 23f312535d (GEOMESA-3100 Kafka layer views (#2784))
<<<<<<< HEAD
>>>>>>> 468da42855 (GEOMESA-3100 Kafka layer views (#2784))
<<<<<<< HEAD
>>>>>>> 340134cdda (GEOMESA-3100 Kafka layer views (#2784))
=======
=======
=======
=======
>>>>>>> 54ece16d1 (GEOMESA-3100 Kafka layer views (#2784))
=======
>>>>>>> fe3378ccaa (GEOMESA-3100 Kafka layer views (#2784))
>>>>>>> 826636f69d (GEOMESA-3100 Kafka layer views (#2784))
<<<<<<< HEAD
>>>>>>> 5dd3eb3a6d (GEOMESA-3100 Kafka layer views (#2784))
<<<<<<< HEAD
>>>>>>> ea8384d9b7 (GEOMESA-3100 Kafka layer views (#2784))
=======
=======
=======
=======
>>>>>>> c57b5f538 (GEOMESA-3100 Kafka layer views (#2784))
=======
>>>>>>> 79f56900f0 (GEOMESA-3100 Kafka layer views (#2784))
>>>>>>> 1e11ed51a6 (GEOMESA-3100 Kafka layer views (#2784))
<<<<<<< HEAD
>>>>>>> d530f7b24a (GEOMESA-3100 Kafka layer views (#2784))
<<<<<<< HEAD
>>>>>>> fe3378ccaa (GEOMESA-3100 Kafka layer views (#2784))
=======
=======
=======
=======
=======
>>>>>>> ea3b40e18 (GEOMESA-3100 Kafka layer views (#2784))
>>>>>>> 88ef67cdf (GEOMESA-3100 Kafka layer views (#2784))
=======
>>>>>>> 72ec0b2107 (GEOMESA-3100 Kafka layer views (#2784))
>>>>>>> 976f319530 (GEOMESA-3100 Kafka layer views (#2784))
<<<<<<< HEAD
>>>>>>> 5e230912b1 (GEOMESA-3100 Kafka layer views (#2784))
<<<<<<< HEAD
>>>>>>> 79f56900f0 (GEOMESA-3100 Kafka layer views (#2784))
=======
=======
=======
=======
>>>>>>> 89fb9950e (GEOMESA-3100 Kafka layer views (#2784))
=======
>>>>>>> 30559ea5c9 (Merge branch 'feature/postgis-fixes')
>>>>>>> bc97b07a31 (GEOMESA-3100 Kafka layer views (#2784))
<<<<<<< HEAD
>>>>>>> f340d6feab (GEOMESA-3100 Kafka layer views (#2784))
<<<<<<< HEAD
>>>>>>> 72ec0b2107 (GEOMESA-3100 Kafka layer views (#2784))
=======
=======
=======
=======
=======
import java.io.{Closeable, IOException, StringReader}
>>>>>>> 3be8d2a5a (Merge branch 'feature/postgis-fixes')
>>>>>>> 1b25d7ddb (Merge branch 'feature/postgis-fixes')
>>>>>>> 699117eca9 (Merge branch 'feature/postgis-fixes')
>>>>>>> c69897d7bd (Merge branch 'feature/postgis-fixes')
>>>>>>> 30559ea5c9 (Merge branch 'feature/postgis-fixes')
=======
>>>>>>> ad362b1341 (GEOMESA-3100 Kafka layer views (#2784))
import java.util.concurrent.{ConcurrentHashMap, ScheduledExecutorService}
import java.util.{Collections, Properties, UUID}
import scala.concurrent.duration.Duration
import scala.util.{Failure, Success, Try}

class KafkaDataStore(
    val config: KafkaDataStoreConfig,
    val metadata: GeoMesaMetadata[String],
    private[kafka] val serialization: GeoMessageSerializerFactory
<<<<<<< HEAD
  ) extends MetadataBackedDataStore(config) with HasGeoMesaStats with LocalLocking {
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
>>>>>>> f1532f2313 (GEOMESA-3254 Add Bloop build support)
=======
>>>>>>> 7564665969 (GEOMESA-3254 Add Bloop build support)
=======
>>>>>>> d4a13604e7 (GEOMESA-3198 Kafka streams integration (#2854))
=======
>>>>>>> 5a4c24e020 (GEOMESA-3254 Add Bloop build support)
=======
>>>>>>> c9a6fc453c (GEOMESA-3198 Kafka streams integration (#2854))
=======
>>>>>>> f9df175e9b (GEOMESA-3198 Kafka streams integration (#2854))
=======
  ) extends MetadataBackedDataStore(config) with HasGeoMesaStats with ZookeeperLocking {
<<<<<<< HEAD
>>>>>>> de758f45a6 (GEOMESA-3198 Kafka streams integration (#2854))
=======
>>>>>>> de758f45a (GEOMESA-3198 Kafka streams integration (#2854))
>>>>>>> 1b8cbf843d (GEOMESA-3198 Kafka streams integration (#2854))
=======
>>>>>>> d845d7c1bd (GEOMESA-3254 Add Bloop build support)
<<<<<<< HEAD
<<<<<<< HEAD
=======
>>>>>>> 58d14a257e (GEOMESA-3254 Add Bloop build support)
=======
=======
  ) extends MetadataBackedDataStore(config) with HasGeoMesaStats with ZookeeperLocking {
>>>>>>> de758f45a (GEOMESA-3198 Kafka streams integration (#2854))
>>>>>>> 73f3a8cb69 (GEOMESA-3198 Kafka streams integration (#2854))
<<<<<<< HEAD
<<<<<<< HEAD
=======
>>>>>>> 63a045a753 (GEOMESA-3254 Add Bloop build support)
=======
=======
  ) extends MetadataBackedDataStore(config) with HasGeoMesaStats with ZookeeperLocking {
>>>>>>> de758f45a (GEOMESA-3198 Kafka streams integration (#2854))
>>>>>>> 4ae16a2980 (GEOMESA-3198 Kafka streams integration (#2854))
<<<<<<< HEAD
<<<<<<< HEAD
=======
>>>>>>> f9df175e9b (GEOMESA-3198 Kafka streams integration (#2854))
=======
=======
  ) extends MetadataBackedDataStore(config) with HasGeoMesaStats with ZookeeperLocking {
>>>>>>> de758f45a (GEOMESA-3198 Kafka streams integration (#2854))
>>>>>>> b09307f5c0 (GEOMESA-3198 Kafka streams integration (#2854))
<<<<<<< HEAD
=======
=======
  ) extends MetadataBackedDataStore(config) with HasGeoMesaStats with ZookeeperLocking {
<<<<<<< HEAD
>>>>>>> de758f45a6 (GEOMESA-3198 Kafka streams integration (#2854))
<<<<<<< HEAD
>>>>>>> 03f3e71921 (GEOMESA-3198 Kafka streams integration (#2854))
=======
=======
>>>>>>> de758f45a (GEOMESA-3198 Kafka streams integration (#2854))
>>>>>>> 1b8cbf843d (GEOMESA-3198 Kafka streams integration (#2854))
>>>>>>> 030cd33877 (GEOMESA-3198 Kafka streams integration (#2854))
=======
>>>>>>> f1532f2313 (GEOMESA-3254 Add Bloop build support)
=======
=======
>>>>>>> 58d14a257e (GEOMESA-3254 Add Bloop build support)
>>>>>>> 7564665969 (GEOMESA-3254 Add Bloop build support)
=======
>>>>>>> d4a13604e7 (GEOMESA-3198 Kafka streams integration (#2854))
=======
=======
>>>>>>> 63a045a753 (GEOMESA-3254 Add Bloop build support)
>>>>>>> 5a4c24e020 (GEOMESA-3254 Add Bloop build support)
=======
>>>>>>> c9a6fc453c (GEOMESA-3198 Kafka streams integration (#2854))
=======
>>>>>>> f9df175e9b (GEOMESA-3198 Kafka streams integration (#2854))

  import KafkaDataStore.TopicKey
  import org.apache.kafka.clients.producer.ProducerConfig.TRANSACTIONAL_ID_CONFIG
  import org.locationtech.geomesa.utils.geotools.RichSimpleFeatureType.RichSimpleFeatureType

  import scala.collection.JavaConverters._

  override val stats: GeoMesaStats = new RunnableStats(this)

  // note: sharing a single producer is generally faster
  // http://kafka.apache.org/0110/javadoc/index.html?org/apache/kafka/clients/producer/KafkaProducer.html

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
=======
>>>>>>> 42e8565e9b (Merge branch 'feature/postgis-fixes')
=======
>>>>>>> f1532f2313 (GEOMESA-3254 Add Bloop build support)
=======
>>>>>>> 3010fc384e (GEOMESA-3100 Kafka layer views (#2784))
=======
>>>>>>> d4a13604e7 (GEOMESA-3198 Kafka streams integration (#2854))
=======
>>>>>>> 1c99a27679 (GEOMESA-3100 Kafka layer views (#2784))
=======
>>>>>>> 92dc7a8411 (GEOMESA-3100 Kafka layer views (#2784))
=======
>>>>>>> 5d02b8e414 (GEOMESA-3198 Kafka streams integration (#2854))
=======
>>>>>>> 2766fc9b5b (GEOMESA-3100 Kafka layer views (#2784))
=======
>>>>>>> de8804123e (GEOMESA-3100 Kafka layer views (#2784))
=======
>>>>>>> 7442d73a4d (GEOMESA-3198 Kafka streams integration (#2854))
=======
>>>>>>> 2f673a268a (GEOMESA-3100 Kafka layer views (#2784))
=======
>>>>>>> c44e474495 (GEOMESA-3100 Kafka layer views (#2784))
=======
>>>>>>> 38e75099c5 (GEOMESA-3198 Kafka streams integration (#2854))
=======
>>>>>>> c2a94543ba (GEOMESA-3100 Kafka layer views (#2784))
=======
>>>>>>> 117b13aaaa (GEOMESA-3100 Kafka layer views (#2784))
=======
>>>>>>> 67de3c3202 (Merge branch 'feature/postgis-fixes')
=======
>>>>>>> cf457d8543 (GEOMESA-3100 Kafka layer views (#2784))
=======
>>>>>>> e2a2dd4c2e (GEOMESA-3198 Kafka streams integration (#2854))
=======
>>>>>>> 0cd029fb3b (GEOMESA-3100 Kafka layer views (#2784))
=======
>>>>>>> c61bffed00 (GEOMESA-3100 Kafka layer views (#2784))
=======
>>>>>>> 12f226f36d (GEOMESA-3100 Kafka layer views (#2784))
=======
>>>>>>> 89f0c9f2c3 (GEOMESA-3100 Kafka layer views (#2784))
=======
>>>>>>> 222e44653b (GEOMESA-3100 Kafka layer views (#2784))
=======
>>>>>>> 4f4ecaeb43 (GEOMESA-3100 Kafka layer views (#2784))
=======
>>>>>>> b4cd5a7733 (GEOMESA-3100 Kafka layer views (#2784))
=======
>>>>>>> 750ebbabe7 (GEOMESA-3100 Kafka layer views (#2784))
=======
>>>>>>> 638b68d081 (Merge branch 'feature/postgis-fixes')
=======
>>>>>>> fc4546247e (GEOMESA-3100 Kafka layer views (#2784))
=======
>>>>>>> e792102d4b (GEOMESA-3198 Kafka streams integration (#2854))
=======
>>>>>>> 65e544d20e (GEOMESA-3100 Kafka layer views (#2784))
=======
>>>>>>> c64e652363 (GEOMESA-3100 Kafka layer views (#2784))
=======
>>>>>>> 2834875e9b (GEOMESA-3198 Kafka streams integration (#2854))
=======
>>>>>>> 02eb81c815 (GEOMESA-3100 Kafka layer views (#2784))
=======
>>>>>>> 43ac4062d9 (GEOMESA-3100 Kafka layer views (#2784))
=======
>>>>>>> cf6eae6fac (GEOMESA-3198 Kafka streams integration (#2854))
=======
>>>>>>> 30905e530b (GEOMESA-3100 Kafka layer views (#2784))
=======
>>>>>>> 121a1d3470 (GEOMESA-3100 Kafka layer views (#2784))
=======
>>>>>>> bb28efed75 (GEOMESA-3198 Kafka streams integration (#2854))
=======
>>>>>>> 297ca0be9c (GEOMESA-3100 Kafka layer views (#2784))
=======
>>>>>>> 39d28fffcb (GEOMESA-3100 Kafka layer views (#2784))
=======
>>>>>>> 71adb695c5 (Merge branch 'feature/postgis-fixes')
=======
>>>>>>> 5a4c24e020 (GEOMESA-3254 Add Bloop build support)
=======
>>>>>>> d4039e3d9a (GEOMESA-3100 Kafka layer views (#2784))
=======
>>>>>>> c9a6fc453c (GEOMESA-3198 Kafka streams integration (#2854))
=======
>>>>>>> 0d5f6377de (GEOMESA-3100 Kafka layer views (#2784))
=======
>>>>>>> 41df6a2aa3 (GEOMESA-3100 Kafka layer views (#2784))
=======
>>>>>>> 91aada60ab (GEOMESA-3198 Kafka streams integration (#2854))
=======
>>>>>>> fb32a36e0e (GEOMESA-3100 Kafka layer views (#2784))
=======
>>>>>>> 340134cdda (GEOMESA-3100 Kafka layer views (#2784))
=======
>>>>>>> 81cb3a1b74 (GEOMESA-3198 Kafka streams integration (#2854))
=======
>>>>>>> ea8384d9b7 (GEOMESA-3100 Kafka layer views (#2784))
=======
>>>>>>> fe3378ccaa (GEOMESA-3100 Kafka layer views (#2784))
=======
>>>>>>> 4934cb1a2a (GEOMESA-3198 Kafka streams integration (#2854))
=======
>>>>>>> 79f56900f0 (GEOMESA-3100 Kafka layer views (#2784))
=======
>>>>>>> 72ec0b2107 (GEOMESA-3100 Kafka layer views (#2784))
=======
>>>>>>> 30559ea5c9 (Merge branch 'feature/postgis-fixes')
=======
>>>>>>> ad362b1341 (GEOMESA-3100 Kafka layer views (#2784))
=======
=======
>>>>>>> b09307f5c0 (GEOMESA-3198 Kafka streams integration (#2854))
>>>>>>> f9df175e9b (GEOMESA-3198 Kafka streams integration (#2854))
=======
>>>>>>> 5ca0cd6de5 (GEOMESA-3100 Kafka layer views (#2784))
=======
>>>>>>> bddfdbea54 (GEOMESA-3100 Kafka layer views (#2784))
=======
>>>>>>> 4e12cd412d (GEOMESA-3198 Kafka streams integration (#2854))
>>>>>>> 885048dd7d (GEOMESA-3100 Kafka layer views (#2784))
=======
=======
>>>>>>> 12fe94b860 (GEOMESA-3100 Kafka layer views (#2784))
=======
>>>>>>> 90a582b4a6 (GEOMESA-3198 Kafka streams integration (#2854))
=======
>>>>>>> 0e42c51dc0 (GEOMESA-3100 Kafka layer views (#2784))
=======
>>>>>>> 19aa61c0de (GEOMESA-3100 Kafka layer views (#2784))
=======
>>>>>>> 60bcd014c8 (GEOMESA-3198 Kafka streams integration (#2854))
=======
>>>>>>> 626c8f9b93 (GEOMESA-3100 Kafka layer views (#2784))
=======
=======
>>>>>>> f716dd05cb (GEOMESA-3198 Kafka streams integration (#2854))
=======
>>>>>>> f4b2369e9a (GEOMESA-3100 Kafka layer views (#2784))
=======
>>>>>>> 305a9263eb (GEOMESA-3100 Kafka layer views (#2784))
=======
>>>>>>> da00c7bd68 (Merge branch 'feature/postgis-fixes')
=======
>>>>>>> 6af71ff432 (GEOMESA-3100 Kafka layer views (#2784))
=======
>>>>>>> 2f6607232 (GEOMESA-3100 Kafka layer views (#2784))
>>>>>>> 9a5d6d2815 (GEOMESA-3100 Kafka layer views (#2784))
=======
>>>>>>> fc2f65fc3 (GEOMESA-3198 Kafka streams integration (#2854))
=======
>>>>>>> ea3b40e18 (GEOMESA-3100 Kafka layer views (#2784))
=======
>>>>>>> 5ca0cd6de (GEOMESA-3100 Kafka layer views (#2784))
>>>>>>> 64646d61ed (GEOMESA-3100 Kafka layer views (#2784))
=======
<<<<<<< HEAD
>>>>>>> b09307f5c0 (GEOMESA-3198 Kafka streams integration (#2854))
=======
>>>>>>> 5dc1f86700 (GEOMESA-3100 Kafka layer views (#2784))
=======
>>>>>>> e01cda38b4 (GEOMESA-3198 Kafka streams integration (#2854))
=======
>>>>>>> 808743e257 (GEOMESA-3100 Kafka layer views (#2784))
=======
>>>>>>> ad0d29873e (GEOMESA-3100 Kafka layer views (#2784))
=======
>>>>>>> 1c64e1adc3 (GEOMESA-3198 Kafka streams integration (#2854))
=======
>>>>>>> 0a0bf0292e (GEOMESA-3100 Kafka layer views (#2784))
=======
>>>>>>> f43f8303d3 (GEOMESA-3100 Kafka layer views (#2784))
=======
>>>>>>> 6415d35ab4 (GEOMESA-3198 Kafka streams integration (#2854))
=======
>>>>>>> 6368ee48e8 (GEOMESA-3100 Kafka layer views (#2784))
=======
>>>>>>> 4516873dab (GEOMESA-3100 Kafka layer views (#2784))
=======
>>>>>>> 34472778d3 (Merge branch 'feature/postgis-fixes')
=======
>>>>>>> 8ec26b8c2a (GEOMESA-3100 Kafka layer views (#2784))
=======
>>>>>>> 030cd33877 (GEOMESA-3198 Kafka streams integration (#2854))
=======
>>>>>>> 4b0dd3e513 (GEOMESA-3100 Kafka layer views (#2784))
=======
>>>>>>> 6e453fd3d0 (GEOMESA-3100 Kafka layer views (#2784))
=======
>>>>>>> f90a7718ef (GEOMESA-3198 Kafka streams integration (#2854))
=======
>>>>>>> f187a4fcf9 (GEOMESA-3100 Kafka layer views (#2784))
=======
>>>>>>> d309fbbbbf (GEOMESA-3100 Kafka layer views (#2784))
=======
>>>>>>> 88e1e7d3ff (GEOMESA-3198 Kafka streams integration (#2854))
=======
>>>>>>> d76a495d83 (GEOMESA-3100 Kafka layer views (#2784))
=======
>>>>>>> bbc8576d19 (GEOMESA-3100 Kafka layer views (#2784))
=======
>>>>>>> 63ce2ed3e4 (GEOMESA-3198 Kafka streams integration (#2854))
=======
>>>>>>> d3b123117a (GEOMESA-3100 Kafka layer views (#2784))
=======
>>>>>>> 5ca0cd6de5 (GEOMESA-3100 Kafka layer views (#2784))
=======
>>>>>>> bddfdbea54 (GEOMESA-3100 Kafka layer views (#2784))
=======
<<<<<<< HEAD
<<<<<<< HEAD
>>>>>>> 4e12cd412d (GEOMESA-3198 Kafka streams integration (#2854))
=======
=======
<<<<<<< HEAD
<<<<<<< HEAD
>>>>>>> 2f66072323 (GEOMESA-3100 Kafka layer views (#2784))
=======
>>>>>>> fc2f65fc3b (GEOMESA-3198 Kafka streams integration (#2854))
=======
<<<<<<< HEAD
<<<<<<< HEAD
>>>>>>> ea3b40e187 (GEOMESA-3100 Kafka layer views (#2784))
=======
>>>>>>> 862857ce2e (GEOMESA-3100 Kafka layer views (#2784))
=======
<<<<<<< HEAD
<<<<<<< HEAD
>>>>>>> ecbc2cafc2 (GEOMESA-3198 Kafka streams integration (#2854))
=======
>>>>>>> 28427dfd8f (GEOMESA-3100 Kafka layer views (#2784))
=======
<<<<<<< HEAD
<<<<<<< HEAD
>>>>>>> 4231e686dd (GEOMESA-3100 Kafka layer views (#2784))
=======
>>>>>>> 3be3e5d3e0 (GEOMESA-3198 Kafka streams integration (#2854))
=======
<<<<<<< HEAD
<<<<<<< HEAD
>>>>>>> ac0357d362 (GEOMESA-3100 Kafka layer views (#2784))
=======
=======
<<<<<<< HEAD
<<<<<<< HEAD
>>>>>>> 7b8c9b548a (GEOMESA-3198 Kafka streams integration (#2854))
=======
>>>>>>> 4adaa7f479 (GEOMESA-3100 Kafka layer views (#2784))
=======
>>>>>>> 6af71ff432 (GEOMESA-3100 Kafka layer views (#2784))
=======
>>>>>>> db8d998aa2 (Merge branch 'feature/postgis-fixes')
=======
<<<<<<< HEAD
<<<<<<< HEAD
>>>>>>> 89fb9950ef (GEOMESA-3100 Kafka layer views (#2784))
=======
>>>>>>> 1b25d7ddb4 (Merge branch 'feature/postgis-fixes')
=======
<<<<<<< HEAD
<<<<<<< HEAD
>>>>>>> 98e7bf59d2 (GEOMESA-3100 Kafka layer views (#2784))
=======
=======
<<<<<<< HEAD
<<<<<<< HEAD
=======
>>>>>>> dae1cf3cef (GEOMESA-3100 Kafka layer views (#2784))
=======
>>>>>>> 50a71079c1 (GEOMESA-3100 Kafka layer views (#2784))
=======
>>>>>>> 9e910620b3 (GEOMESA-3100 Kafka layer views (#2784))
=======
>>>>>>> 4c325746bd (GEOMESA-3100 Kafka layer views (#2784))
=======
>>>>>>> 3ebcdb99d9 (GEOMESA-3100 Kafka layer views (#2784))
=======
>>>>>>> fdf51402cf (GEOMESA-3100 Kafka layer views (#2784))
=======
>>>>>>> a377061090 (GEOMESA-3100 Kafka layer views (#2784))
=======
>>>>>>> e944f1c88b (Merge branch 'feature/postgis-fixes')
=======
>>>>>>> eddb4eaca1 (GEOMESA-3100 Kafka layer views (#2784))
=======
>>>>>>> 8d7834ec11 (GEOMESA-3198 Kafka streams integration (#2854))
=======
>>>>>>> be0c9d161a (GEOMESA-3100 Kafka layer views (#2784))
=======
>>>>>>> 7bdc1feea8 (GEOMESA-3100 Kafka layer views (#2784))
=======
>>>>>>> 965120b3ca (GEOMESA-3198 Kafka streams integration (#2854))
=======
>>>>>>> 9b15c8e14c (GEOMESA-3100 Kafka layer views (#2784))
=======
>>>>>>> 3977ecc140 (GEOMESA-3100 Kafka layer views (#2784))
=======
>>>>>>> ec680351e0 (GEOMESA-3198 Kafka streams integration (#2854))
=======
>>>>>>> 495a1efc9f (GEOMESA-3100 Kafka layer views (#2784))
=======
>>>>>>> 5d8c5baea0 (GEOMESA-3100 Kafka layer views (#2784))
=======
>>>>>>> 8ce502793e (GEOMESA-3198 Kafka streams integration (#2854))
=======
>>>>>>> 7628960f66 (GEOMESA-3100 Kafka layer views (#2784))
=======
>>>>>>> 416a95a4c0 (GEOMESA-3100 Kafka layer views (#2784))
=======
>>>>>>> 26e5afc4ea (Merge branch 'feature/postgis-fixes')
=======
>>>>>>> 63a045a753 (GEOMESA-3254 Add Bloop build support)
=======
>>>>>>> ccfb3bd95e (GEOMESA-3100 Kafka layer views (#2784))
=======
>>>>>>> 4ae16a2980 (GEOMESA-3198 Kafka streams integration (#2854))
=======
>>>>>>> b5abc19ca4 (GEOMESA-3100 Kafka layer views (#2784))
=======
>>>>>>> 2750a5beef (GEOMESA-3100 Kafka layer views (#2784))
=======
>>>>>>> 3a0eb62fc5 (GEOMESA-3198 Kafka streams integration (#2854))
=======
>>>>>>> cb4aa55ae3 (GEOMESA-3100 Kafka layer views (#2784))
=======
>>>>>>> 468da42855 (GEOMESA-3100 Kafka layer views (#2784))
=======
>>>>>>> 320fc0eff4 (GEOMESA-3198 Kafka streams integration (#2854))
=======
>>>>>>> 5dd3eb3a6d (GEOMESA-3100 Kafka layer views (#2784))
=======
>>>>>>> d530f7b24a (GEOMESA-3100 Kafka layer views (#2784))
=======
>>>>>>> 55438fd78b (GEOMESA-3198 Kafka streams integration (#2854))
=======
>>>>>>> 5e230912b1 (GEOMESA-3100 Kafka layer views (#2784))
=======
>>>>>>> f340d6feab (GEOMESA-3100 Kafka layer views (#2784))
=======
>>>>>>> c69897d7bd (Merge branch 'feature/postgis-fixes')
=======
>>>>>>> 0cd029fb3b (GEOMESA-3100 Kafka layer views (#2784))
=======
>>>>>>> dae1cf3cef (GEOMESA-3100 Kafka layer views (#2784))
=======
>>>>>>> 50a71079c1 (GEOMESA-3100 Kafka layer views (#2784))
=======
>>>>>>> 9e910620b3 (GEOMESA-3100 Kafka layer views (#2784))
=======
>>>>>>> 4c325746bd (GEOMESA-3100 Kafka layer views (#2784))
=======
>>>>>>> 3ebcdb99d9 (GEOMESA-3100 Kafka layer views (#2784))
=======
>>>>>>> fdf51402cf (GEOMESA-3100 Kafka layer views (#2784))
=======
>>>>>>> a377061090 (GEOMESA-3100 Kafka layer views (#2784))
=======
>>>>>>> e944f1c88b (Merge branch 'feature/postgis-fixes')
=======
>>>>>>> eddb4eaca1 (GEOMESA-3100 Kafka layer views (#2784))
=======
>>>>>>> 8d7834ec11 (GEOMESA-3198 Kafka streams integration (#2854))
=======
>>>>>>> be0c9d161a (GEOMESA-3100 Kafka layer views (#2784))
=======
>>>>>>> 7bdc1feea8 (GEOMESA-3100 Kafka layer views (#2784))
=======
>>>>>>> 965120b3ca (GEOMESA-3198 Kafka streams integration (#2854))
=======
>>>>>>> 9b15c8e14c (GEOMESA-3100 Kafka layer views (#2784))
=======
>>>>>>> 3977ecc140 (GEOMESA-3100 Kafka layer views (#2784))
=======
>>>>>>> ec680351e0 (GEOMESA-3198 Kafka streams integration (#2854))
=======
>>>>>>> 495a1efc9f (GEOMESA-3100 Kafka layer views (#2784))
=======
>>>>>>> 5d8c5baea0 (GEOMESA-3100 Kafka layer views (#2784))
=======
>>>>>>> 8ce502793e (GEOMESA-3198 Kafka streams integration (#2854))
=======
>>>>>>> 7628960f66 (GEOMESA-3100 Kafka layer views (#2784))
=======
>>>>>>> 416a95a4c0 (GEOMESA-3100 Kafka layer views (#2784))
=======
>>>>>>> 26e5afc4ea (Merge branch 'feature/postgis-fixes')
=======
>>>>>>> 63a045a753 (GEOMESA-3254 Add Bloop build support)
=======
>>>>>>> ccfb3bd95e (GEOMESA-3100 Kafka layer views (#2784))
=======
>>>>>>> 4ae16a2980 (GEOMESA-3198 Kafka streams integration (#2854))
=======
>>>>>>> b5abc19ca4 (GEOMESA-3100 Kafka layer views (#2784))
=======
>>>>>>> 2750a5beef (GEOMESA-3100 Kafka layer views (#2784))
=======
>>>>>>> 3a0eb62fc5 (GEOMESA-3198 Kafka streams integration (#2854))
=======
>>>>>>> cb4aa55ae3 (GEOMESA-3100 Kafka layer views (#2784))
=======
>>>>>>> 468da42855 (GEOMESA-3100 Kafka layer views (#2784))
=======
>>>>>>> 320fc0eff4 (GEOMESA-3198 Kafka streams integration (#2854))
=======
>>>>>>> 5dd3eb3a6d (GEOMESA-3100 Kafka layer views (#2784))
=======
>>>>>>> d530f7b24a (GEOMESA-3100 Kafka layer views (#2784))
=======
>>>>>>> 55438fd78b (GEOMESA-3198 Kafka streams integration (#2854))
=======
>>>>>>> 5e230912b1 (GEOMESA-3100 Kafka layer views (#2784))
=======
>>>>>>> f340d6feab (GEOMESA-3100 Kafka layer views (#2784))
=======
>>>>>>> c69897d7bd (Merge branch 'feature/postgis-fixes')
=======
=======
>>>>>>> 5ca0cd6de (GEOMESA-3100 Kafka layer views (#2784))
>>>>>>> 581f1dd15 (GEOMESA-3100 Kafka layer views (#2784))
>>>>>>> e24613dc4a (GEOMESA-3100 Kafka layer views (#2784))
=======
>>>>>>> f01ac238e (GEOMESA-3198 Kafka streams integration (#2854))
>>>>>>> 0b3e844fc4 (GEOMESA-3198 Kafka streams integration (#2854))
=======
>>>>>>> 6f6887eb8 (GEOMESA-3100 Kafka layer views (#2784))
=======
<<<<<<< HEAD
<<<<<<< HEAD
>>>>>>> 42549e8e3 (GEOMESA-3100 Kafka layer views (#2784))
=======
>>>>>>> e8cc4971c6 (Merge branch 'feature/postgis-fixes')
=======
<<<<<<< HEAD
<<<<<<< HEAD
>>>>>>> 8ed2c9f7e5 (GEOMESA-3100 Kafka layer views (#2784))
=======
=======
<<<<<<< HEAD
<<<<<<< HEAD
=======
>>>>>>> 8b9e99d11a (GEOMESA-3100 Kafka layer views (#2784))
=======
>>>>>>> 41bda2df98 (GEOMESA-3198 Kafka streams integration (#2854))
=======
>>>>>>> 614fcb6bc3 (GEOMESA-3100 Kafka layer views (#2784))
=======
>>>>>>> 69e3273ac1 (GEOMESA-3100 Kafka layer views (#2784))
=======
>>>>>>> d98371fa50 (GEOMESA-3198 Kafka streams integration (#2854))
=======
>>>>>>> 04f82bbc57 (GEOMESA-3100 Kafka layer views (#2784))
=======
>>>>>>> e0773a1bd7 (GEOMESA-3100 Kafka layer views (#2784))
=======
>>>>>>> 5fa4cd5eac (GEOMESA-3198 Kafka streams integration (#2854))
=======
>>>>>>> ae5eea67f1 (GEOMESA-3100 Kafka layer views (#2784))
=======
>>>>>>> 23a7d9849f (GEOMESA-3100 Kafka layer views (#2784))
=======
>>>>>>> cb6bda89b6 (Merge branch 'feature/postgis-fixes')
=======
>>>>>>> 09d87762c5 (GEOMESA-3254 Add Bloop build support)
=======
>>>>>>> 6069aba6b4 (GEOMESA-3100 Kafka layer views (#2784))
=======
=======
=======
>>>>>>> 9e433ba57e (GEOMESA-3100 Kafka layer views (#2784))
=======
=======
=======
=======
=======
=======
=======
>>>>>>> 991d5c62a7 (GEOMESA-3198 Kafka streams integration (#2854))
=======
>>>>>>> 976f319530 (GEOMESA-3100 Kafka layer views (#2784))
=======
>>>>>>> bc97b07a31 (GEOMESA-3100 Kafka layer views (#2784))
=======
>>>>>>> 699117eca9 (Merge branch 'feature/postgis-fixes')
=======
=======
>>>>>>> 2f6607232 (GEOMESA-3100 Kafka layer views (#2784))
>>>>>>> c57b5f538 (GEOMESA-3100 Kafka layer views (#2784))
>>>>>>> 1e11ed51a6 (GEOMESA-3100 Kafka layer views (#2784))
=======
>>>>>>> 54ece16d1 (GEOMESA-3100 Kafka layer views (#2784))
>>>>>>> 826636f69d (GEOMESA-3100 Kafka layer views (#2784))
=======
>>>>>>> eef10da74 (GEOMESA-3198 Kafka streams integration (#2854))
>>>>>>> 769842a4bf (GEOMESA-3198 Kafka streams integration (#2854))
=======
>>>>>>> fa68dd43c (GEOMESA-3100 Kafka layer views (#2784))
>>>>>>> 23f312535d (GEOMESA-3100 Kafka layer views (#2784))
=======
>>>>>>> ffbc2ce32 (GEOMESA-3100 Kafka layer views (#2784))
>>>>>>> 2df2640494 (GEOMESA-3100 Kafka layer views (#2784))
=======
>>>>>>> 29a2fa060 (GEOMESA-3198 Kafka streams integration (#2854))
>>>>>>> 69fb98522c (GEOMESA-3198 Kafka streams integration (#2854))
=======
=======
>>>>>>> c589b832a (GEOMESA-3100 Kafka layer views (#2784))
=======
>>>>>>> 5ca0cd6de (GEOMESA-3100 Kafka layer views (#2784))
>>>>>>> f6e840b5d (GEOMESA-3100 Kafka layer views (#2784))
>>>>>>> 4480b2d1b9 (GEOMESA-3100 Kafka layer views (#2784))
=======
<<<<<<< HEAD
>>>>>>> 73f3a8cb6 (GEOMESA-3198 Kafka streams integration (#2854))
>>>>>>> c6591bc391 (GEOMESA-3198 Kafka streams integration (#2854))
=======
>>>>>>> 65e544d20e (GEOMESA-3100 Kafka layer views (#2784))
=======
>>>>>>> 8b9e99d11a (GEOMESA-3100 Kafka layer views (#2784))
=======
>>>>>>> 41bda2df98 (GEOMESA-3198 Kafka streams integration (#2854))
=======
>>>>>>> 614fcb6bc3 (GEOMESA-3100 Kafka layer views (#2784))
=======
>>>>>>> 69e3273ac1 (GEOMESA-3100 Kafka layer views (#2784))
=======
>>>>>>> d98371fa50 (GEOMESA-3198 Kafka streams integration (#2854))
=======
>>>>>>> 04f82bbc57 (GEOMESA-3100 Kafka layer views (#2784))
=======
>>>>>>> e0773a1bd7 (GEOMESA-3100 Kafka layer views (#2784))
=======
>>>>>>> 5fa4cd5eac (GEOMESA-3198 Kafka streams integration (#2854))
=======
>>>>>>> ae5eea67f1 (GEOMESA-3100 Kafka layer views (#2784))
=======
>>>>>>> 23a7d9849f (GEOMESA-3100 Kafka layer views (#2784))
=======
>>>>>>> cb6bda89b6 (Merge branch 'feature/postgis-fixes')
=======
>>>>>>> 09d87762c5 (GEOMESA-3254 Add Bloop build support)
=======
>>>>>>> 6069aba6b4 (GEOMESA-3100 Kafka layer views (#2784))
=======
=======
=======
>>>>>>> 9e433ba57e (GEOMESA-3100 Kafka layer views (#2784))
=======
=======
=======
=======
=======
=======
=======
>>>>>>> 991d5c62a7 (GEOMESA-3198 Kafka streams integration (#2854))
=======
>>>>>>> 976f319530 (GEOMESA-3100 Kafka layer views (#2784))
=======
>>>>>>> bc97b07a31 (GEOMESA-3100 Kafka layer views (#2784))
=======
>>>>>>> 699117eca9 (Merge branch 'feature/postgis-fixes')
=======
=======
>>>>>>> 2f6607232 (GEOMESA-3100 Kafka layer views (#2784))
>>>>>>> c57b5f538 (GEOMESA-3100 Kafka layer views (#2784))
>>>>>>> 1e11ed51a6 (GEOMESA-3100 Kafka layer views (#2784))
=======
>>>>>>> 54ece16d1 (GEOMESA-3100 Kafka layer views (#2784))
>>>>>>> 826636f69d (GEOMESA-3100 Kafka layer views (#2784))
=======
>>>>>>> eef10da74 (GEOMESA-3198 Kafka streams integration (#2854))
>>>>>>> 769842a4bf (GEOMESA-3198 Kafka streams integration (#2854))
=======
>>>>>>> fa68dd43c (GEOMESA-3100 Kafka layer views (#2784))
>>>>>>> 23f312535d (GEOMESA-3100 Kafka layer views (#2784))
=======
>>>>>>> ffbc2ce32 (GEOMESA-3100 Kafka layer views (#2784))
>>>>>>> 2df2640494 (GEOMESA-3100 Kafka layer views (#2784))
=======
>>>>>>> 29a2fa060 (GEOMESA-3198 Kafka streams integration (#2854))
>>>>>>> 69fb98522c (GEOMESA-3198 Kafka streams integration (#2854))
=======
=======
>>>>>>> c589b832a (GEOMESA-3100 Kafka layer views (#2784))
=======
>>>>>>> 5ca0cd6de (GEOMESA-3100 Kafka layer views (#2784))
>>>>>>> f6e840b5d (GEOMESA-3100 Kafka layer views (#2784))
>>>>>>> 4480b2d1b9 (GEOMESA-3100 Kafka layer views (#2784))
=======
<<<<<<< HEAD
>>>>>>> 73f3a8cb6 (GEOMESA-3198 Kafka streams integration (#2854))
>>>>>>> c6591bc391 (GEOMESA-3198 Kafka streams integration (#2854))
=======
=======
>>>>>>> 5ca0cd6de (GEOMESA-3100 Kafka layer views (#2784))
>>>>>>> 9236b0208 (GEOMESA-3100 Kafka layer views (#2784))
>>>>>>> c1d0543aac (GEOMESA-3100 Kafka layer views (#2784))
=======
>>>>>>> 1b8cbf843 (GEOMESA-3198 Kafka streams integration (#2854))
>>>>>>> 30fda14bf2 (GEOMESA-3198 Kafka streams integration (#2854))
=======
>>>>>>> 7b8c9b548 (GEOMESA-3198 Kafka streams integration (#2854))
=======
<<<<<<< HEAD
<<<<<<< HEAD
>>>>>>> 4adaa7f47 (GEOMESA-3100 Kafka layer views (#2784))
=======
>>>>>>> 6af71ff43 (GEOMESA-3100 Kafka layer views (#2784))
=======
<<<<<<< HEAD
<<<<<<< HEAD
>>>>>>> db8d998aa (Merge branch 'feature/postgis-fixes')
=======
>>>>>>> 8f51e1858 (GEOMESA-3198 Kafka streams integration (#2854))
=======
<<<<<<< HEAD
<<<<<<< HEAD
>>>>>>> 88ef67cdf (GEOMESA-3100 Kafka layer views (#2784))
=======
>>>>>>> 89fb9950e (GEOMESA-3100 Kafka layer views (#2784))
=======
<<<<<<< HEAD
<<<<<<< HEAD
>>>>>>> 1b25d7ddb (Merge branch 'feature/postgis-fixes')
=======
=======
>>>>>>> 7b8c9b548a (GEOMESA-3198 Kafka streams integration (#2854))
=======
<<<<<<< HEAD
>>>>>>> 63ce2ed3e4 (GEOMESA-3198 Kafka streams integration (#2854))
=======
>>>>>>> 4adaa7f479 (GEOMESA-3100 Kafka layer views (#2784))
=======
>>>>>>> d3b123117a (GEOMESA-3100 Kafka layer views (#2784))
=======
>>>>>>> 42e8565e9b (Merge branch 'feature/postgis-fixes')
=======
>>>>>>> 89fb9950ef (GEOMESA-3100 Kafka layer views (#2784))
=======
>>>>>>> 117b13aaaa (GEOMESA-3100 Kafka layer views (#2784))
=======
>>>>>>> 67de3c3202 (Merge branch 'feature/postgis-fixes')
=======
>>>>>>> 98e7bf59d2 (GEOMESA-3100 Kafka layer views (#2784))
=======
>>>>>>> cf457d8543 (GEOMESA-3100 Kafka layer views (#2784))
=======
>>>>>>> f01ac238e (GEOMESA-3198 Kafka streams integration (#2854))
>>>>>>> 0b3e844fc4 (GEOMESA-3198 Kafka streams integration (#2854))
=======
>>>>>>> e2a2dd4c2e (GEOMESA-3198 Kafka streams integration (#2854))
=======
>>>>>>> b4cd5a7733 (GEOMESA-3100 Kafka layer views (#2784))
=======
>>>>>>> 42549e8e3 (GEOMESA-3100 Kafka layer views (#2784))
=======
>>>>>>> 750ebbabe7 (GEOMESA-3100 Kafka layer views (#2784))
=======
>>>>>>> 638b68d081 (Merge branch 'feature/postgis-fixes')
=======
>>>>>>> 8ed2c9f7e5 (GEOMESA-3100 Kafka layer views (#2784))
=======
>>>>>>> fc4546247e (GEOMESA-3100 Kafka layer views (#2784))
=======
>>>>>>> 1b8cbf843 (GEOMESA-3198 Kafka streams integration (#2854))
>>>>>>> 30fda14bf2 (GEOMESA-3198 Kafka streams integration (#2854))
=======
>>>>>>> e792102d4b (GEOMESA-3198 Kafka streams integration (#2854))
=======
>>>>>>> bb28efed75 (GEOMESA-3198 Kafka streams integration (#2854))
=======
>>>>>>> 4adaa7f47 (GEOMESA-3100 Kafka layer views (#2784))
=======
>>>>>>> 297ca0be9c (GEOMESA-3100 Kafka layer views (#2784))
=======
>>>>>>> 39d28fffcb (GEOMESA-3100 Kafka layer views (#2784))
=======
>>>>>>> db8d998aa (Merge branch 'feature/postgis-fixes')
=======
>>>>>>> 71adb695c5 (Merge branch 'feature/postgis-fixes')
=======
>>>>>>> 4934cb1a2a (GEOMESA-3198 Kafka streams integration (#2854))
=======
>>>>>>> 88ef67cdf (GEOMESA-3100 Kafka layer views (#2784))
=======
>>>>>>> 79f56900f0 (GEOMESA-3100 Kafka layer views (#2784))
=======
>>>>>>> 72ec0b2107 (GEOMESA-3100 Kafka layer views (#2784))
=======
>>>>>>> 1b25d7ddb (Merge branch 'feature/postgis-fixes')
=======
>>>>>>> 30559ea5c9 (Merge branch 'feature/postgis-fixes')
>>>>>>> 2f6607232 (GEOMESA-3100 Kafka layer views (#2784))
>>>>>>> a62b956fb6 (GEOMESA-3100 Kafka layer views (#2784))
=======
>>>>>>> fc2f65fc3 (GEOMESA-3198 Kafka streams integration (#2854))
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
=======
>>>>>>> bb28efed75 (GEOMESA-3198 Kafka streams integration (#2854))
=======
>>>>>>> 297ca0be9c (GEOMESA-3100 Kafka layer views (#2784))
=======
>>>>>>> 4934cb1a2a (GEOMESA-3198 Kafka streams integration (#2854))
=======
>>>>>>> 79f56900f0 (GEOMESA-3100 Kafka layer views (#2784))
>>>>>>> ea3b40e18 (GEOMESA-3100 Kafka layer views (#2784))
=======
<<<<<<< HEAD
<<<<<<< HEAD
<<<<<<< HEAD
<<<<<<< HEAD
<<<<<<< HEAD
<<<<<<< HEAD
<<<<<<< HEAD
=======
>>>>>>> c61bffed00 (GEOMESA-3100 Kafka layer views (#2784))
=======
>>>>>>> b4cd5a7733 (GEOMESA-3100 Kafka layer views (#2784))
=======
>>>>>>> c64e652363 (GEOMESA-3100 Kafka layer views (#2784))
>>>>>>> c589b832a5 (GEOMESA-3100 Kafka layer views (#2784))
=======
>>>>>>> 29a2fa060e (GEOMESA-3198 Kafka streams integration (#2854))
=======
>>>>>>> ffbc2ce32a (GEOMESA-3100 Kafka layer views (#2784))
=======
<<<<<<< HEAD
<<<<<<< HEAD
>>>>>>> fa68dd43c6 (GEOMESA-3100 Kafka layer views (#2784))
=======
>>>>>>> eef10da741 (GEOMESA-3198 Kafka streams integration (#2854))
=======
<<<<<<< HEAD
<<<<<<< HEAD
>>>>>>> 54ece16d15 (GEOMESA-3100 Kafka layer views (#2784))
=======
=======
>>>>>>> 2f6607232 (GEOMESA-3100 Kafka layer views (#2784))
>>>>>>> c57b5f538a (GEOMESA-3100 Kafka layer views (#2784))
=======
<<<<<<< HEAD
<<<<<<< HEAD
<<<<<<< HEAD
=======
>>>>>>> fdf51402cf (GEOMESA-3100 Kafka layer views (#2784))
=======
>>>>>>> 7bdc1feea8 (GEOMESA-3100 Kafka layer views (#2784))
<<<<<<< HEAD
=======
=======
>>>>>>> fdf51402cf (GEOMESA-3100 Kafka layer views (#2784))
>>>>>>> b4cd5a7733 (GEOMESA-3100 Kafka layer views (#2784))
=======
>>>>>>> c64e652363 (GEOMESA-3100 Kafka layer views (#2784))
>>>>>>> 1a5f68233 (GEOMESA-3100 Kafka layer views (#2784))
>>>>>>> dae1cf3cef (GEOMESA-3100 Kafka layer views (#2784))
=======
>>>>>>> 73767737b (GEOMESA-3100 Kafka layer views (#2784))
=======
<<<<<<< HEAD
<<<<<<< HEAD
>>>>>>> 65a3a6e36 (GEOMESA-3100 Kafka layer views (#2784))
=======
>>>>>>> 429ffc55e (GEOMESA-3100 Kafka layer views (#2784))
=======
<<<<<<< HEAD
<<<<<<< HEAD
=======
>>>>>>> 4f4ecaeb43 (GEOMESA-3100 Kafka layer views (#2784))
=======
>>>>>>> 2f6607232 (GEOMESA-3100 Kafka layer views (#2784))
>>>>>>> e7f3e6588 (GEOMESA-3100 Kafka layer views (#2784))
=======
<<<<<<< HEAD
<<<<<<< HEAD
=======
>>>>>>> 6f6887eb8 (GEOMESA-3100 Kafka layer views (#2784))
=======
>>>>>>> 862857ce2 (GEOMESA-3100 Kafka layer views (#2784))
=======
<<<<<<< HEAD
<<<<<<< HEAD
<<<<<<< HEAD
=======
>>>>>>> 2834875e9b (GEOMESA-3198 Kafka streams integration (#2854))
>>>>>>> 8b9e99d11a (GEOMESA-3100 Kafka layer views (#2784))
=======
>>>>>>> ecbc2cafc (GEOMESA-3198 Kafka streams integration (#2854))
=======
<<<<<<< HEAD
<<<<<<< HEAD
<<<<<<< HEAD
=======
>>>>>>> 02eb81c815 (GEOMESA-3100 Kafka layer views (#2784))
>>>>>>> 41bda2df98 (GEOMESA-3198 Kafka streams integration (#2854))
=======
>>>>>>> 28427dfd8 (GEOMESA-3100 Kafka layer views (#2784))
=======
<<<<<<< HEAD
<<<<<<< HEAD
<<<<<<< HEAD
=======
>>>>>>> 43ac4062d9 (GEOMESA-3100 Kafka layer views (#2784))
>>>>>>> 614fcb6bc3 (GEOMESA-3100 Kafka layer views (#2784))
=======
>>>>>>> 4231e686d (GEOMESA-3100 Kafka layer views (#2784))
=======
<<<<<<< HEAD
<<<<<<< HEAD
<<<<<<< HEAD
=======
>>>>>>> cf6eae6fac (GEOMESA-3198 Kafka streams integration (#2854))
>>>>>>> 69e3273ac1 (GEOMESA-3100 Kafka layer views (#2784))
=======
>>>>>>> 3be3e5d3e (GEOMESA-3198 Kafka streams integration (#2854))
=======
<<<<<<< HEAD
<<<<<<< HEAD
<<<<<<< HEAD
=======
>>>>>>> 30905e530b (GEOMESA-3100 Kafka layer views (#2784))
>>>>>>> d98371fa50 (GEOMESA-3198 Kafka streams integration (#2854))
=======
>>>>>>> ac0357d36 (GEOMESA-3100 Kafka layer views (#2784))
=======
<<<<<<< HEAD
<<<<<<< HEAD
<<<<<<< HEAD
=======
>>>>>>> 121a1d3470 (GEOMESA-3100 Kafka layer views (#2784))
>>>>>>> 04f82bbc57 (GEOMESA-3100 Kafka layer views (#2784))
=======
=======
>>>>>>> 2f6607232 (GEOMESA-3100 Kafka layer views (#2784))
>>>>>>> a62b956fb (GEOMESA-3100 Kafka layer views (#2784))
=======
<<<<<<< HEAD
<<<<<<< HEAD
<<<<<<< HEAD
=======
>>>>>>> bb28efed75 (GEOMESA-3198 Kafka streams integration (#2854))
>>>>>>> e0773a1bd7 (GEOMESA-3100 Kafka layer views (#2784))
=======
=======
>>>>>>> 7b8c9b548 (GEOMESA-3198 Kafka streams integration (#2854))
<<<<<<< HEAD
<<<<<<< HEAD
<<<<<<< HEAD
=======
>>>>>>> 297ca0be9c (GEOMESA-3100 Kafka layer views (#2784))
>>>>>>> 5fa4cd5eac (GEOMESA-3198 Kafka streams integration (#2854))
=======
=======
>>>>>>> ea3b40e18 (GEOMESA-3100 Kafka layer views (#2784))
=======
>>>>>>> 4adaa7f47 (GEOMESA-3100 Kafka layer views (#2784))
<<<<<<< HEAD
<<<<<<< HEAD
<<<<<<< HEAD
=======
>>>>>>> 4934cb1a2a (GEOMESA-3198 Kafka streams integration (#2854))
>>>>>>> ae5eea67f1 (GEOMESA-3100 Kafka layer views (#2784))
=======
=======
>>>>>>> 8f51e1858 (GEOMESA-3198 Kafka streams integration (#2854))
<<<<<<< HEAD
<<<<<<< HEAD
<<<<<<< HEAD
=======
>>>>>>> 79f56900f0 (GEOMESA-3100 Kafka layer views (#2784))
>>>>>>> 991d5c62a7 (GEOMESA-3198 Kafka streams integration (#2854))
=======
=======
>>>>>>> ea3b40e18 (GEOMESA-3100 Kafka layer views (#2784))
=======
>>>>>>> 88ef67cdf (GEOMESA-3100 Kafka layer views (#2784))
>>>>>>> 976f319530 (GEOMESA-3100 Kafka layer views (#2784))
<<<<<<< HEAD
=======
>>>>>>> 2f66072323 (GEOMESA-3100 Kafka layer views (#2784))
=======
>>>>>>> f43f8303d3 (GEOMESA-3100 Kafka layer views (#2784))
=======
>>>>>>> 6415d35ab4 (GEOMESA-3198 Kafka streams integration (#2854))
=======
>>>>>>> ea3b40e187 (GEOMESA-3100 Kafka layer views (#2784))
=======
>>>>>>> 6368ee48e8 (GEOMESA-3100 Kafka layer views (#2784))
=======
>>>>>>> 6e453fd3d0 (GEOMESA-3100 Kafka layer views (#2784))
=======
>>>>>>> ecbc2cafc2 (GEOMESA-3198 Kafka streams integration (#2854))
=======
>>>>>>> f90a7718ef (GEOMESA-3198 Kafka streams integration (#2854))
=======
>>>>>>> f187a4fcf9 (GEOMESA-3100 Kafka layer views (#2784))
=======
>>>>>>> 4231e686dd (GEOMESA-3100 Kafka layer views (#2784))
=======
>>>>>>> d309fbbbbf (GEOMESA-3100 Kafka layer views (#2784))
=======
>>>>>>> 88e1e7d3ff (GEOMESA-3198 Kafka streams integration (#2854))
=======
>>>>>>> ac0357d362 (GEOMESA-3100 Kafka layer views (#2784))
=======
>>>>>>> d76a495d83 (GEOMESA-3100 Kafka layer views (#2784))
=======
>>>>>>> 2f6607232 (GEOMESA-3100 Kafka layer views (#2784))
>>>>>>> a62b956fb6 (GEOMESA-3100 Kafka layer views (#2784))
=======
>>>>>>> bbc8576d19 (GEOMESA-3100 Kafka layer views (#2784))
=======
>>>>>>> 63ce2ed3e4 (GEOMESA-3198 Kafka streams integration (#2854))
=======
>>>>>>> ea3b40e18 (GEOMESA-3100 Kafka layer views (#2784))
=======
>>>>>>> d3b123117a (GEOMESA-3100 Kafka layer views (#2784))
=======
>>>>>>> c589b832a5 (GEOMESA-3100 Kafka layer views (#2784))
=======
<<<<<<< HEAD
>>>>>>> 92dc7a8411 (GEOMESA-3100 Kafka layer views (#2784))
=======
>>>>>>> 29a2fa060e (GEOMESA-3198 Kafka streams integration (#2854))
=======
>>>>>>> 5d02b8e414 (GEOMESA-3198 Kafka streams integration (#2854))
=======
>>>>>>> 2766fc9b5b (GEOMESA-3100 Kafka layer views (#2784))
=======
>>>>>>> fa68dd43c6 (GEOMESA-3100 Kafka layer views (#2784))
=======
>>>>>>> de8804123e (GEOMESA-3100 Kafka layer views (#2784))
=======
>>>>>>> 7442d73a4d (GEOMESA-3198 Kafka streams integration (#2854))
=======
>>>>>>> 54ece16d15 (GEOMESA-3100 Kafka layer views (#2784))
=======
>>>>>>> 2f673a268a (GEOMESA-3100 Kafka layer views (#2784))
=======
>>>>>>> c44e474495 (GEOMESA-3100 Kafka layer views (#2784))
=======
>>>>>>> 1a5f68233 (GEOMESA-3100 Kafka layer views (#2784))
>>>>>>> dae1cf3cef (GEOMESA-3100 Kafka layer views (#2784))
=======
>>>>>>> c61bffed00 (GEOMESA-3100 Kafka layer views (#2784))
=======
>>>>>>> 12f226f36d (GEOMESA-3100 Kafka layer views (#2784))
=======
>>>>>>> 65a3a6e36 (GEOMESA-3100 Kafka layer views (#2784))
=======
>>>>>>> 89f0c9f2c3 (GEOMESA-3100 Kafka layer views (#2784))
=======
>>>>>>> 222e44653b (GEOMESA-3100 Kafka layer views (#2784))
=======
>>>>>>> 4f4ecaeb43 (GEOMESA-3100 Kafka layer views (#2784))
=======
=======
>>>>>>> 6f6887eb8 (GEOMESA-3100 Kafka layer views (#2784))
>>>>>>> b4cd5a7733 (GEOMESA-3100 Kafka layer views (#2784))
=======
>>>>>>> 8b9e99d11a (GEOMESA-3100 Kafka layer views (#2784))
>>>>>>> c64e652363 (GEOMESA-3100 Kafka layer views (#2784))
=======
>>>>>>> 41bda2df98 (GEOMESA-3198 Kafka streams integration (#2854))
>>>>>>> 2834875e9b (GEOMESA-3198 Kafka streams integration (#2854))
=======
>>>>>>> 614fcb6bc3 (GEOMESA-3100 Kafka layer views (#2784))
>>>>>>> 02eb81c815 (GEOMESA-3100 Kafka layer views (#2784))
=======
>>>>>>> 69e3273ac1 (GEOMESA-3100 Kafka layer views (#2784))
>>>>>>> 43ac4062d9 (GEOMESA-3100 Kafka layer views (#2784))
=======
>>>>>>> d98371fa50 (GEOMESA-3198 Kafka streams integration (#2854))
>>>>>>> cf6eae6fac (GEOMESA-3198 Kafka streams integration (#2854))
=======
>>>>>>> 04f82bbc57 (GEOMESA-3100 Kafka layer views (#2784))
>>>>>>> 30905e530b (GEOMESA-3100 Kafka layer views (#2784))
=======
>>>>>>> e0773a1bd7 (GEOMESA-3100 Kafka layer views (#2784))
>>>>>>> 121a1d3470 (GEOMESA-3100 Kafka layer views (#2784))
=======
>>>>>>> 5fa4cd5eac (GEOMESA-3198 Kafka streams integration (#2854))
>>>>>>> bb28efed75 (GEOMESA-3198 Kafka streams integration (#2854))
=======
>>>>>>> ae5eea67f1 (GEOMESA-3100 Kafka layer views (#2784))
>>>>>>> 297ca0be9c (GEOMESA-3100 Kafka layer views (#2784))
=======
>>>>>>> 991d5c62a7 (GEOMESA-3198 Kafka streams integration (#2854))
>>>>>>> 4934cb1a2a (GEOMESA-3198 Kafka streams integration (#2854))
=======
>>>>>>> 79f56900f0 (GEOMESA-3100 Kafka layer views (#2784))
>>>>>>> 5ca0cd6de (GEOMESA-3100 Kafka layer views (#2784))
>>>>>>> d0dc799ff1 (GEOMESA-3100 Kafka layer views (#2784))
=======
>>>>>>> 95c83ca7fa (GEOMESA-3100 Kafka layer views (#2784))
=======
>>>>>>> d657014c83 (GEOMESA-3198 Kafka streams integration (#2854))
=======
<<<<<<< HEAD
<<<<<<< HEAD
=======
>>>>>>> 0a0bf0292e (GEOMESA-3100 Kafka layer views (#2784))
=======
>>>>>>> 5ca0cd6de (GEOMESA-3100 Kafka layer views (#2784))
>>>>>>> 9361541304 (GEOMESA-3100 Kafka layer views (#2784))
=======
<<<<<<< HEAD
<<<<<<< HEAD
>>>>>>> bddfdbea5 (GEOMESA-3100 Kafka layer views (#2784))
=======
<<<<<<< HEAD
<<<<<<< HEAD
<<<<<<< HEAD
>>>>>>> 4e12cd412 (GEOMESA-3198 Kafka streams integration (#2854))
=======
<<<<<<< HEAD
<<<<<<< HEAD
=======
>>>>>>> 0e42c51dc0 (GEOMESA-3100 Kafka layer views (#2784))
=======
>>>>>>> 5ca0cd6de (GEOMESA-3100 Kafka layer views (#2784))
>>>>>>> d0dc799ff (GEOMESA-3100 Kafka layer views (#2784))
=======
<<<<<<< HEAD
>>>>>>> d2cb939f51 (GEOMESA-3100 Kafka layer views (#2784))
=======
>>>>>>> a0314fb7ff (GEOMESA-3100 Kafka layer views (#2784))
=======
>>>>>>> 1b8cbf843d (GEOMESA-3198 Kafka streams integration (#2854))
=======
=======
>>>>>>> 5ca0cd6de (GEOMESA-3100 Kafka layer views (#2784))
>>>>>>> 9236b02087 (GEOMESA-3100 Kafka layer views (#2784))
=======
<<<<<<< HEAD
<<<<<<< HEAD
>>>>>>> bddfdbea5 (GEOMESA-3100 Kafka layer views (#2784))
=======
<<<<<<< HEAD
<<<<<<< HEAD
<<<<<<< HEAD
<<<<<<< HEAD
<<<<<<< HEAD
=======
>>>>>>> bbc8576d19 (GEOMESA-3100 Kafka layer views (#2784))
=======
>>>>>>> 63ce2ed3e4 (GEOMESA-3198 Kafka streams integration (#2854))
>>>>>>> 4e12cd412 (GEOMESA-3198 Kafka streams integration (#2854))
=======
=======
>>>>>>> 5ca0cd6de (GEOMESA-3100 Kafka layer views (#2784))
>>>>>>> d0dc799ff (GEOMESA-3100 Kafka layer views (#2784))
=======
<<<<<<< HEAD
<<<<<<< HEAD
<<<<<<< HEAD
<<<<<<< HEAD
<<<<<<< HEAD
<<<<<<< HEAD
=======
>>>>>>> f4b2369e9a (GEOMESA-3100 Kafka layer views (#2784))
=======
>>>>>>> d3b123117a (GEOMESA-3100 Kafka layer views (#2784))
>>>>>>> 95c83ca7f (GEOMESA-3100 Kafka layer views (#2784))
=======
>>>>>>> d657014c8 (GEOMESA-3198 Kafka streams integration (#2854))
=======
<<<<<<< HEAD
<<<<<<< HEAD
<<<<<<< HEAD
<<<<<<< HEAD
=======
>>>>>>> 626c8f9b93 (GEOMESA-3100 Kafka layer views (#2784))
=======
>>>>>>> d76a495d83 (GEOMESA-3100 Kafka layer views (#2784))
=======
>>>>>>> 5ca0cd6de (GEOMESA-3100 Kafka layer views (#2784))
>>>>>>> 936154130 (GEOMESA-3100 Kafka layer views (#2784))
=======
<<<<<<< HEAD
<<<<<<< HEAD
<<<<<<< HEAD
<<<<<<< HEAD
=======
>>>>>>> 2f6607232 (GEOMESA-3100 Kafka layer views (#2784))
=======
>>>>>>> 4e12cd412 (GEOMESA-3198 Kafka streams integration (#2854))
=======
<<<<<<< HEAD
<<<<<<< HEAD
<<<<<<< HEAD
>>>>>>> fc2f65fc3 (GEOMESA-3198 Kafka streams integration (#2854))
<<<<<<< HEAD
<<<<<<< HEAD
<<<<<<< HEAD
=======
>>>>>>> ea3b40e18 (GEOMESA-3100 Kafka layer views (#2784))
=======
=======
>>>>>>> d2cb939f5 (GEOMESA-3100 Kafka layer views (#2784))
<<<<<<< HEAD
<<<<<<< HEAD
=======
>>>>>>> 5dc1f86700 (GEOMESA-3100 Kafka layer views (#2784))
=======
>>>>>>> 4e12cd412d (GEOMESA-3198 Kafka streams integration (#2854))
=======
>>>>>>> e01cda38b4 (GEOMESA-3198 Kafka streams integration (#2854))
=======
>>>>>>> 5ca0cd6de (GEOMESA-3100 Kafka layer views (#2784))
>>>>>>> d0dc799ff1 (GEOMESA-3100 Kafka layer views (#2784))
=======
<<<<<<< HEAD
>>>>>>> 808743e257 (GEOMESA-3100 Kafka layer views (#2784))
=======
>>>>>>> 95c83ca7fa (GEOMESA-3100 Kafka layer views (#2784))
=======
>>>>>>> ad0d29873e (GEOMESA-3100 Kafka layer views (#2784))
=======
>>>>>>> 1c64e1adc3 (GEOMESA-3198 Kafka streams integration (#2854))
=======
>>>>>>> 0a0bf0292e (GEOMESA-3100 Kafka layer views (#2784))
=======
>>>>>>> bddfdbea5 (GEOMESA-3100 Kafka layer views (#2784))
=======
>>>>>>> f43f8303d3 (GEOMESA-3100 Kafka layer views (#2784))
=======
>>>>>>> 4e12cd412 (GEOMESA-3198 Kafka streams integration (#2854))
=======
>>>>>>> 6415d35ab4 (GEOMESA-3198 Kafka streams integration (#2854))
=======
=======
>>>>>>> f187a4fcf9 (GEOMESA-3100 Kafka layer views (#2784))
=======
>>>>>>> 5ca0cd6de (GEOMESA-3100 Kafka layer views (#2784))
>>>>>>> d0dc799ff (GEOMESA-3100 Kafka layer views (#2784))
=======
<<<<<<< HEAD
>>>>>>> 6368ee48e8 (GEOMESA-3100 Kafka layer views (#2784))
=======
>>>>>>> d2cb939f51 (GEOMESA-3100 Kafka layer views (#2784))
=======
<<<<<<< HEAD
>>>>>>> 4516873dab (GEOMESA-3100 Kafka layer views (#2784))
=======
>>>>>>> a0314fb7ff (GEOMESA-3100 Kafka layer views (#2784))
=======
<<<<<<< HEAD
>>>>>>> 8ec26b8c2a (GEOMESA-3100 Kafka layer views (#2784))
=======
>>>>>>> 1b8cbf843d (GEOMESA-3198 Kafka streams integration (#2854))
=======
>>>>>>> 030cd33877 (GEOMESA-3198 Kafka streams integration (#2854))
=======
>>>>>>> 4b0dd3e513 (GEOMESA-3100 Kafka layer views (#2784))
=======
>>>>>>> bddfdbea5 (GEOMESA-3100 Kafka layer views (#2784))
=======
>>>>>>> 6e453fd3d0 (GEOMESA-3100 Kafka layer views (#2784))
=======
>>>>>>> 4e12cd412 (GEOMESA-3198 Kafka streams integration (#2854))
=======
>>>>>>> f90a7718ef (GEOMESA-3198 Kafka streams integration (#2854))
=======
>>>>>>> f187a4fcf9 (GEOMESA-3100 Kafka layer views (#2784))
=======
>>>>>>> 95c83ca7f (GEOMESA-3100 Kafka layer views (#2784))
=======
>>>>>>> d309fbbbbf (GEOMESA-3100 Kafka layer views (#2784))
=======
>>>>>>> 88e1e7d3ff (GEOMESA-3198 Kafka streams integration (#2854))
=======
>>>>>>> d76a495d83 (GEOMESA-3100 Kafka layer views (#2784))
=======
=======
>>>>>>> 2f6607232 (GEOMESA-3100 Kafka layer views (#2784))
>>>>>>> bbc8576d19 (GEOMESA-3100 Kafka layer views (#2784))
=======
>>>>>>> fc2f65fc3 (GEOMESA-3198 Kafka streams integration (#2854))
>>>>>>> 63ce2ed3e4 (GEOMESA-3198 Kafka streams integration (#2854))
=======
=======
>>>>>>> ea3b40e18 (GEOMESA-3100 Kafka layer views (#2784))
>>>>>>> d3b123117a (GEOMESA-3100 Kafka layer views (#2784))
=======
>>>>>>> 885048dd7d (GEOMESA-3100 Kafka layer views (#2784))
  @volatile
  private var producerInitialized = false

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
>>>>>>> 5dc1f86700 (GEOMESA-3100 Kafka layer views (#2784))
=======
>>>>>>> ad0d29873e (GEOMESA-3100 Kafka layer views (#2784))
=======
>>>>>>> 4516873dab (GEOMESA-3100 Kafka layer views (#2784))
=======
>>>>>>> 8ec26b8c2a (GEOMESA-3100 Kafka layer views (#2784))
>>>>>>> af0a88eb17 (GEOMESA-3100 Kafka layer views (#2784))
=======
>>>>>>> de758f45a6 (GEOMESA-3198 Kafka streams integration (#2854))
=======
>>>>>>> af0a88eb1 (GEOMESA-3100 Kafka layer views (#2784))
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
>>>>>>> e01cda38b4 (GEOMESA-3198 Kafka streams integration (#2854))
=======
>>>>>>> 808743e257 (GEOMESA-3100 Kafka layer views (#2784))
=======
>>>>>>> 1c64e1adc3 (GEOMESA-3198 Kafka streams integration (#2854))
=======
>>>>>>> 0a0bf0292e (GEOMESA-3100 Kafka layer views (#2784))
=======
>>>>>>> f43f8303d3 (GEOMESA-3100 Kafka layer views (#2784))
=======
>>>>>>> 6415d35ab4 (GEOMESA-3198 Kafka streams integration (#2854))
=======
>>>>>>> 6368ee48e8 (GEOMESA-3100 Kafka layer views (#2784))
=======
>>>>>>> 030cd33877 (GEOMESA-3198 Kafka streams integration (#2854))
=======
>>>>>>> 4b0dd3e513 (GEOMESA-3100 Kafka layer views (#2784))
=======
>>>>>>> 6e453fd3d0 (GEOMESA-3100 Kafka layer views (#2784))
=======
>>>>>>> f90a7718ef (GEOMESA-3198 Kafka streams integration (#2854))
=======
>>>>>>> f187a4fcf9 (GEOMESA-3100 Kafka layer views (#2784))
=======
>>>>>>> d309fbbbbf (GEOMESA-3100 Kafka layer views (#2784))
=======
>>>>>>> 88e1e7d3ff (GEOMESA-3198 Kafka streams integration (#2854))
=======
>>>>>>> d76a495d83 (GEOMESA-3100 Kafka layer views (#2784))
=======
>>>>>>> bbc8576d19 (GEOMESA-3100 Kafka layer views (#2784))
=======
>>>>>>> 63ce2ed3e4 (GEOMESA-3198 Kafka streams integration (#2854))
=======
>>>>>>> d3b123117a (GEOMESA-3100 Kafka layer views (#2784))
=======
>>>>>>> 885048dd7d (GEOMESA-3100 Kafka layer views (#2784))
>>>>>>> 5ca0cd6de5 (GEOMESA-3100 Kafka layer views (#2784))
=======
>>>>>>> af0a88eb1 (GEOMESA-3100 Kafka layer views (#2784))
>>>>>>> bddfdbea54 (GEOMESA-3100 Kafka layer views (#2784))
<<<<<<< HEAD
<<<<<<< HEAD
=======
>>>>>>> e01cda38b4 (GEOMESA-3198 Kafka streams integration (#2854))
=======
=======
>>>>>>> de758f45a (GEOMESA-3198 Kafka streams integration (#2854))
>>>>>>> 4e12cd412d (GEOMESA-3198 Kafka streams integration (#2854))
<<<<<<< HEAD
<<<<<<< HEAD
=======
=======
>>>>>>> 2f66072323 (GEOMESA-3100 Kafka layer views (#2784))
=======
<<<<<<< HEAD
<<<<<<< HEAD
>>>>>>> fc2f65fc3b (GEOMESA-3198 Kafka streams integration (#2854))
=======
=======
<<<<<<< HEAD
<<<<<<< HEAD
>>>>>>> 4231e686dd (GEOMESA-3100 Kafka layer views (#2784))
=======
>>>>>>> 3be3e5d3e0 (GEOMESA-3198 Kafka streams integration (#2854))
=======
>>>>>>> ac0357d362 (GEOMESA-3100 Kafka layer views (#2784))
=======
<<<<<<< HEAD
<<<<<<< HEAD
>>>>>>> a62b956fb6 (GEOMESA-3100 Kafka layer views (#2784))
=======
>>>>>>> 7b8c9b548a (GEOMESA-3198 Kafka streams integration (#2854))
=======
<<<<<<< HEAD
<<<<<<< HEAD
>>>>>>> 4adaa7f479 (GEOMESA-3100 Kafka layer views (#2784))
=======
>>>>>>> 6af71ff432 (GEOMESA-3100 Kafka layer views (#2784))
=======
<<<<<<< HEAD
=======
>>>>>>> 4231e686dd (GEOMESA-3100 Kafka layer views (#2784))
=======
<<<<<<< HEAD
>>>>>>> d309fbbbbf (GEOMESA-3100 Kafka layer views (#2784))
=======
>>>>>>> 3be3e5d3e0 (GEOMESA-3198 Kafka streams integration (#2854))
=======
>>>>>>> 88e1e7d3ff (GEOMESA-3198 Kafka streams integration (#2854))
=======
>>>>>>> d76a495d83 (GEOMESA-3100 Kafka layer views (#2784))
=======
>>>>>>> a62b956fb6 (GEOMESA-3100 Kafka layer views (#2784))
=======
>>>>>>> bbc8576d19 (GEOMESA-3100 Kafka layer views (#2784))
=======
>>>>>>> 63ce2ed3e4 (GEOMESA-3198 Kafka streams integration (#2854))
=======
>>>>>>> 4adaa7f479 (GEOMESA-3100 Kafka layer views (#2784))
=======
>>>>>>> d3b123117a (GEOMESA-3100 Kafka layer views (#2784))
=======
>>>>>>> 885048dd7d (GEOMESA-3100 Kafka layer views (#2784))
>>>>>>> d0dc799ff (GEOMESA-3100 Kafka layer views (#2784))
>>>>>>> ea3b40e187 (GEOMESA-3100 Kafka layer views (#2784))
=======
>>>>>>> 862857ce2e (GEOMESA-3100 Kafka layer views (#2784))
=======
<<<<<<< HEAD
<<<<<<< HEAD
>>>>>>> ecbc2cafc2 (GEOMESA-3198 Kafka streams integration (#2854))
=======
=======
>>>>>>> d0dc799ff (GEOMESA-3100 Kafka layer views (#2784))
>>>>>>> 28427dfd8f (GEOMESA-3100 Kafka layer views (#2784))
=======
<<<<<<< HEAD
<<<<<<< HEAD
>>>>>>> 936154130 (GEOMESA-3100 Kafka layer views (#2784))
=======
<<<<<<< HEAD
<<<<<<< HEAD
=======
>>>>>>> c2a94543ba (GEOMESA-3100 Kafka layer views (#2784))
>>>>>>> 88ef67cdfe (GEOMESA-3100 Kafka layer views (#2784))
=======
>>>>>>> 2f6607232 (GEOMESA-3100 Kafka layer views (#2784))
=======
>>>>>>> fc2f65fc3 (GEOMESA-3198 Kafka streams integration (#2854))
=======
<<<<<<< HEAD
<<<<<<< HEAD
<<<<<<< HEAD
<<<<<<< HEAD
=======
>>>>>>> d3b123117a (GEOMESA-3100 Kafka layer views (#2784))
=======
>>>>>>> c2a94543ba (GEOMESA-3100 Kafka layer views (#2784))
=======
>>>>>>> d0dc799ff (GEOMESA-3100 Kafka layer views (#2784))
>>>>>>> ea3b40e18 (GEOMESA-3100 Kafka layer views (#2784))
=======
<<<<<<< HEAD
=======
>>>>>>> f43f8303d3 (GEOMESA-3100 Kafka layer views (#2784))
=======
>>>>>>> fc2f65fc3b (GEOMESA-3198 Kafka streams integration (#2854))
=======
>>>>>>> 6415d35ab4 (GEOMESA-3198 Kafka streams integration (#2854))
=======
>>>>>>> d0dc799ff (GEOMESA-3100 Kafka layer views (#2784))
>>>>>>> ea3b40e187 (GEOMESA-3100 Kafka layer views (#2784))
=======
>>>>>>> 6368ee48e8 (GEOMESA-3100 Kafka layer views (#2784))
=======
>>>>>>> 6e453fd3d0 (GEOMESA-3100 Kafka layer views (#2784))
=======
>>>>>>> ecbc2cafc2 (GEOMESA-3198 Kafka streams integration (#2854))
=======
>>>>>>> f90a7718ef (GEOMESA-3198 Kafka streams integration (#2854))
=======
>>>>>>> f187a4fcf9 (GEOMESA-3100 Kafka layer views (#2784))
=======
>>>>>>> 936154130 (GEOMESA-3100 Kafka layer views (#2784))
=======
>>>>>>> d76a495d83 (GEOMESA-3100 Kafka layer views (#2784))
=======
>>>>>>> 2f6607232 (GEOMESA-3100 Kafka layer views (#2784))
=======
>>>>>>> bbc8576d19 (GEOMESA-3100 Kafka layer views (#2784))
=======
>>>>>>> 63ce2ed3e4 (GEOMESA-3198 Kafka streams integration (#2854))
=======
>>>>>>> d3b123117a (GEOMESA-3100 Kafka layer views (#2784))
>>>>>>> de758f45a (GEOMESA-3198 Kafka streams integration (#2854))
=======
=======
=======
>>>>>>> 2f6607232 (GEOMESA-3100 Kafka layer views (#2784))
=======
>>>>>>> fc2f65fc3 (GEOMESA-3198 Kafka streams integration (#2854))
=======
>>>>>>> 8f51e18588 (GEOMESA-3198 Kafka streams integration (#2854))
<<<<<<< HEAD
<<<<<<< HEAD
=======
>>>>>>> c2a94543ba (GEOMESA-3100 Kafka layer views (#2784))
=======
>>>>>>> ea3b40e18 (GEOMESA-3100 Kafka layer views (#2784))
=======
>>>>>>> 88ef67cdfe (GEOMESA-3100 Kafka layer views (#2784))
<<<<<<< HEAD
=======
>>>>>>> 38e75099c5 (GEOMESA-3198 Kafka streams integration (#2854))
=======
>>>>>>> c2a94543ba (GEOMESA-3100 Kafka layer views (#2784))
>>>>>>> 5ca0cd6de (GEOMESA-3100 Kafka layer views (#2784))
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
>>>>>>> f43f8303d3 (GEOMESA-3100 Kafka layer views (#2784))
=======
>>>>>>> 6368ee48e8 (GEOMESA-3100 Kafka layer views (#2784))
=======
>>>>>>> 6e453fd3d0 (GEOMESA-3100 Kafka layer views (#2784))
=======
>>>>>>> f187a4fcf9 (GEOMESA-3100 Kafka layer views (#2784))
=======
>>>>>>> d76a495d83 (GEOMESA-3100 Kafka layer views (#2784))
=======
>>>>>>> bbc8576d19 (GEOMESA-3100 Kafka layer views (#2784))
=======
>>>>>>> d3b123117a (GEOMESA-3100 Kafka layer views (#2784))
>>>>>>> d0dc799ff1 (GEOMESA-3100 Kafka layer views (#2784))
=======
>>>>>>> af0a88eb1 (GEOMESA-3100 Kafka layer views (#2784))
>>>>>>> 95c83ca7fa (GEOMESA-3100 Kafka layer views (#2784))
=======
=======
>>>>>>> de758f45a (GEOMESA-3198 Kafka streams integration (#2854))
>>>>>>> d657014c83 (GEOMESA-3198 Kafka streams integration (#2854))
=======
=======
>>>>>>> de758f45a (GEOMESA-3198 Kafka streams integration (#2854))
=======
>>>>>>> 5ca0cd6de (GEOMESA-3100 Kafka layer views (#2784))
>>>>>>> 9361541304 (GEOMESA-3100 Kafka layer views (#2784))
<<<<<<< HEAD
<<<<<<< HEAD
=======
=======
>>>>>>> ea3b40e187 (GEOMESA-3100 Kafka layer views (#2784))
=======
>>>>>>> 28427dfd8f (GEOMESA-3100 Kafka layer views (#2784))
=======
<<<<<<< HEAD
<<<<<<< HEAD
>>>>>>> ac0357d362 (GEOMESA-3100 Kafka layer views (#2784))
=======
>>>>>>> a62b956fb6 (GEOMESA-3100 Kafka layer views (#2784))
=======
<<<<<<< HEAD
<<<<<<< HEAD
=======
>>>>>>> d3b123117a (GEOMESA-3100 Kafka layer views (#2784))
=======
>>>>>>> ea3b40e18 (GEOMESA-3100 Kafka layer views (#2784))
>>>>>>> 4adaa7f479 (GEOMESA-3100 Kafka layer views (#2784))
=======
<<<<<<< HEAD
=======
>>>>>>> f187a4fcf9 (GEOMESA-3100 Kafka layer views (#2784))
=======
>>>>>>> ac0357d362 (GEOMESA-3100 Kafka layer views (#2784))
=======
>>>>>>> d76a495d83 (GEOMESA-3100 Kafka layer views (#2784))
=======
>>>>>>> bbc8576d19 (GEOMESA-3100 Kafka layer views (#2784))
=======
>>>>>>> d3b123117a (GEOMESA-3100 Kafka layer views (#2784))
>>>>>>> bddfdbea5 (GEOMESA-3100 Kafka layer views (#2784))
<<<<<<< HEAD
<<<<<<< HEAD
>>>>>>> 2f66072323 (GEOMESA-3100 Kafka layer views (#2784))
=======
=======
>>>>>>> ecbc2cafc2 (GEOMESA-3198 Kafka streams integration (#2854))
=======
=======
>>>>>>> de758f45a (GEOMESA-3198 Kafka streams integration (#2854))
>>>>>>> 4e12cd412 (GEOMESA-3198 Kafka streams integration (#2854))
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
>>>>>>> f90a7718ef (GEOMESA-3198 Kafka streams integration (#2854))
=======
>>>>>>> f187a4fcf9 (GEOMESA-3100 Kafka layer views (#2784))
=======
>>>>>>> 63ce2ed3e4 (GEOMESA-3198 Kafka streams integration (#2854))
=======
>>>>>>> d3b123117a (GEOMESA-3100 Kafka layer views (#2784))
>>>>>>> fc2f65fc3b (GEOMESA-3198 Kafka streams integration (#2854))
=======
=======
>>>>>>> 7b8c9b548a (GEOMESA-3198 Kafka streams integration (#2854))
=======
<<<<<<< HEAD
<<<<<<< HEAD
>>>>>>> 4adaa7f479 (GEOMESA-3100 Kafka layer views (#2784))
=======
=======
>>>>>>> 63ce2ed3e4 (GEOMESA-3198 Kafka streams integration (#2854))
=======
>>>>>>> 4adaa7f479 (GEOMESA-3100 Kafka layer views (#2784))
=======
>>>>>>> d3b123117a (GEOMESA-3100 Kafka layer views (#2784))
>>>>>>> d0dc799ff (GEOMESA-3100 Kafka layer views (#2784))
<<<<<<< HEAD
>>>>>>> ea3b40e187 (GEOMESA-3100 Kafka layer views (#2784))
=======
>>>>>>> af0a88eb1 (GEOMESA-3100 Kafka layer views (#2784))
>>>>>>> d2cb939f51 (GEOMESA-3100 Kafka layer views (#2784))
=======
>>>>>>> 3be8d2a5a4 (Merge branch 'feature/postgis-fixes')
=======
>>>>>>> af0a88eb1 (GEOMESA-3100 Kafka layer views (#2784))
>>>>>>> a0314fb7ff (GEOMESA-3100 Kafka layer views (#2784))
=======
=======
>>>>>>> de758f45a (GEOMESA-3198 Kafka streams integration (#2854))
>>>>>>> 1b8cbf843d (GEOMESA-3198 Kafka streams integration (#2854))
<<<<<<< HEAD
<<<<<<< HEAD
=======
>>>>>>> 4b0dd3e513 (GEOMESA-3100 Kafka layer views (#2784))
=======
=======
>>>>>>> de758f45a (GEOMESA-3198 Kafka streams integration (#2854))
=======
>>>>>>> 5ca0cd6de (GEOMESA-3100 Kafka layer views (#2784))
>>>>>>> 9236b02087 (GEOMESA-3100 Kafka layer views (#2784))
<<<<<<< HEAD
<<<<<<< HEAD
=======
>>>>>>> 6e453fd3d0 (GEOMESA-3100 Kafka layer views (#2784))
=======
=======
>>>>>>> bddfdbea5 (GEOMESA-3100 Kafka layer views (#2784))
>>>>>>> 862857ce2e (GEOMESA-3100 Kafka layer views (#2784))
<<<<<<< HEAD
<<<<<<< HEAD
=======
>>>>>>> ecbc2cafc2 (GEOMESA-3198 Kafka streams integration (#2854))
=======
=======
>>>>>>> d0dc799ff (GEOMESA-3100 Kafka layer views (#2784))
>>>>>>> 28427dfd8f (GEOMESA-3100 Kafka layer views (#2784))
<<<<<<< HEAD
<<<<<<< HEAD
=======
=======
>>>>>>> 95c83ca7f (GEOMESA-3100 Kafka layer views (#2784))
<<<<<<< HEAD
>>>>>>> 4231e686dd (GEOMESA-3100 Kafka layer views (#2784))
=======
=======
=======
>>>>>>> de758f45a (GEOMESA-3198 Kafka streams integration (#2854))
>>>>>>> d657014c8 (GEOMESA-3198 Kafka streams integration (#2854))
<<<<<<< HEAD
>>>>>>> 3be3e5d3e0 (GEOMESA-3198 Kafka streams integration (#2854))
=======
=======
>>>>>>> 936154130 (GEOMESA-3100 Kafka layer views (#2784))
<<<<<<< HEAD
<<<<<<< HEAD
<<<<<<< HEAD
=======
>>>>>>> bbc8576d19 (GEOMESA-3100 Kafka layer views (#2784))
>>>>>>> ac0357d362 (GEOMESA-3100 Kafka layer views (#2784))
=======
=======
=======
>>>>>>> bddfdbea5 (GEOMESA-3100 Kafka layer views (#2784))
>>>>>>> 2f6607232 (GEOMESA-3100 Kafka layer views (#2784))
<<<<<<< HEAD
<<<<<<< HEAD
<<<<<<< HEAD
=======
>>>>>>> 63ce2ed3e4 (GEOMESA-3198 Kafka streams integration (#2854))
>>>>>>> a62b956fb6 (GEOMESA-3100 Kafka layer views (#2784))
=======
=======
>>>>>>> fc2f65fc3 (GEOMESA-3198 Kafka streams integration (#2854))
<<<<<<< HEAD
<<<<<<< HEAD
<<<<<<< HEAD
=======
>>>>>>> d3b123117a (GEOMESA-3100 Kafka layer views (#2784))
>>>>>>> 7b8c9b548a (GEOMESA-3198 Kafka streams integration (#2854))
=======
=======
=======
>>>>>>> d0dc799ff (GEOMESA-3100 Kafka layer views (#2784))
>>>>>>> ea3b40e18 (GEOMESA-3100 Kafka layer views (#2784))
<<<<<<< HEAD
<<<<<<< HEAD
<<<<<<< HEAD
=======
>>>>>>> 885048dd7d (GEOMESA-3100 Kafka layer views (#2784))
>>>>>>> 4adaa7f479 (GEOMESA-3100 Kafka layer views (#2784))
=======
=======
>>>>>>> d2cb939f5 (GEOMESA-3100 Kafka layer views (#2784))
<<<<<<< HEAD
<<<<<<< HEAD
<<<<<<< HEAD
=======
>>>>>>> 42e8565e9b (Merge branch 'feature/postgis-fixes')
>>>>>>> 6af71ff432 (GEOMESA-3100 Kafka layer views (#2784))
=======
=======
>>>>>>> 3be8d2a5a (Merge branch 'feature/postgis-fixes')
>>>>>>> db8d998aa2 (Merge branch 'feature/postgis-fixes')
<<<<<<< HEAD
<<<<<<< HEAD
=======
>>>>>>> d845d7c1bd (GEOMESA-3254 Add Bloop build support)
=======
=======
<<<<<<< HEAD
<<<<<<< HEAD
>>>>>>> 73f3a8cb69 (GEOMESA-3198 Kafka streams integration (#2854))
=======
=======
>>>>>>> 5ca0cd6de (GEOMESA-3100 Kafka layer views (#2784))
>>>>>>> f6e840b5dd (GEOMESA-3100 Kafka layer views (#2784))
=======
<<<<<<< HEAD
<<<<<<< HEAD
>>>>>>> bddfdbea5 (GEOMESA-3100 Kafka layer views (#2784))
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
<<<<<<< HEAD
<<<<<<< HEAD
<<<<<<< HEAD
<<<<<<< HEAD
<<<<<<< HEAD
<<<<<<< HEAD
<<<<<<< HEAD
<<<<<<< HEAD
=======
>>>>>>> c64e652363 (GEOMESA-3100 Kafka layer views (#2784))
=======
>>>>>>> 2834875e9b (GEOMESA-3198 Kafka streams integration (#2854))
=======
>>>>>>> 121a1d3470 (GEOMESA-3100 Kafka layer views (#2784))
=======
>>>>>>> bb28efed75 (GEOMESA-3198 Kafka streams integration (#2854))
=======
>>>>>>> 91aada60ab (GEOMESA-3198 Kafka streams integration (#2854))
=======
>>>>>>> fe3378ccaa (GEOMESA-3100 Kafka layer views (#2784))
=======
>>>>>>> 4934cb1a2a (GEOMESA-3198 Kafka streams integration (#2854))
=======
>>>>>>> e7f3e6588 (GEOMESA-3100 Kafka layer views (#2784))
=======
>>>>>>> 8b9e99d11a (GEOMESA-3100 Kafka layer views (#2784))
<<<<<<< HEAD
<<<<<<< HEAD
=======
>>>>>>> 41bda2df98 (GEOMESA-3198 Kafka streams integration (#2854))
=======
=======
>>>>>>> a62b956fb (GEOMESA-3100 Kafka layer views (#2784))
>>>>>>> e0773a1bd7 (GEOMESA-3100 Kafka layer views (#2784))
<<<<<<< HEAD
<<<<<<< HEAD
=======
=======
>>>>>>> 69fb98522c (GEOMESA-3198 Kafka streams integration (#2854))
=======
>>>>>>> 1e11ed51a6 (GEOMESA-3100 Kafka layer views (#2784))
=======
>>>>>>> 991d5c62a7 (GEOMESA-3198 Kafka streams integration (#2854))
=======
>>>>>>> a62b956fb (GEOMESA-3100 Kafka layer views (#2784))
=======
>>>>>>> 7b8c9b548 (GEOMESA-3198 Kafka streams integration (#2854))
<<<<<<< HEAD
>>>>>>> 5fa4cd5eac (GEOMESA-3198 Kafka streams integration (#2854))
=======
=======
>>>>>>> c57b5f538 (GEOMESA-3100 Kafka layer views (#2784))
<<<<<<< HEAD
>>>>>>> 1e11ed51a6 (GEOMESA-3100 Kafka layer views (#2784))
=======
=======
>>>>>>> 8f51e1858 (GEOMESA-3198 Kafka streams integration (#2854))
>>>>>>> 991d5c62a7 (GEOMESA-3198 Kafka streams integration (#2854))
=======
>>>>>>> c44e474495 (GEOMESA-3100 Kafka layer views (#2784))
=======
>>>>>>> 38e75099c5 (GEOMESA-3198 Kafka streams integration (#2854))
=======
>>>>>>> c61bffed00 (GEOMESA-3100 Kafka layer views (#2784))
=======
=======
>>>>>>> e7f3e6588 (GEOMESA-3100 Kafka layer views (#2784))
>>>>>>> 4f4ecaeb43 (GEOMESA-3100 Kafka layer views (#2784))
=======
>>>>>>> c64e652363 (GEOMESA-3100 Kafka layer views (#2784))
=======
=======
>>>>>>> 41bda2df98 (GEOMESA-3198 Kafka streams integration (#2854))
>>>>>>> 2834875e9b (GEOMESA-3198 Kafka streams integration (#2854))
=======
>>>>>>> 121a1d3470 (GEOMESA-3100 Kafka layer views (#2784))
=======
=======
=======
>>>>>>> 69fb98522c (GEOMESA-3198 Kafka streams integration (#2854))
=======
>>>>>>> 1e11ed51a6 (GEOMESA-3100 Kafka layer views (#2784))
=======
>>>>>>> 991d5c62a7 (GEOMESA-3198 Kafka streams integration (#2854))
=======
>>>>>>> a62b956fb (GEOMESA-3100 Kafka layer views (#2784))
=======
>>>>>>> 7b8c9b548 (GEOMESA-3198 Kafka streams integration (#2854))
<<<<<<< HEAD
>>>>>>> 5fa4cd5eac (GEOMESA-3198 Kafka streams integration (#2854))
<<<<<<< HEAD
>>>>>>> bb28efed75 (GEOMESA-3198 Kafka streams integration (#2854))
=======
=======
=======
>>>>>>> c57b5f538 (GEOMESA-3100 Kafka layer views (#2784))
<<<<<<< HEAD
>>>>>>> 1e11ed51a6 (GEOMESA-3100 Kafka layer views (#2784))
<<<<<<< HEAD
>>>>>>> fe3378ccaa (GEOMESA-3100 Kafka layer views (#2784))
=======
=======
=======
>>>>>>> 8f51e1858 (GEOMESA-3198 Kafka streams integration (#2854))
>>>>>>> 991d5c62a7 (GEOMESA-3198 Kafka streams integration (#2854))
>>>>>>> 4934cb1a2a (GEOMESA-3198 Kafka streams integration (#2854))
>>>>>>> 4e12cd412 (GEOMESA-3198 Kafka streams integration (#2854))
=======
=======
>>>>>>> 5ca0cd6de (GEOMESA-3100 Kafka layer views (#2784))
>>>>>>> d0dc799ff (GEOMESA-3100 Kafka layer views (#2784))
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
<<<<<<< HEAD
<<<<<<< HEAD
<<<<<<< HEAD
<<<<<<< HEAD
<<<<<<< HEAD
<<<<<<< HEAD
=======
>>>>>>> 02eb81c815 (GEOMESA-3100 Kafka layer views (#2784))
=======
>>>>>>> 43ac4062d9 (GEOMESA-3100 Kafka layer views (#2784))
=======
>>>>>>> 297ca0be9c (GEOMESA-3100 Kafka layer views (#2784))
=======
>>>>>>> fb32a36e0e (GEOMESA-3100 Kafka layer views (#2784))
=======
>>>>>>> 340134cdda (GEOMESA-3100 Kafka layer views (#2784))
=======
>>>>>>> 79f56900f0 (GEOMESA-3100 Kafka layer views (#2784))
=======
>>>>>>> 6f6887eb8 (GEOMESA-3100 Kafka layer views (#2784))
=======
>>>>>>> 614fcb6bc3 (GEOMESA-3100 Kafka layer views (#2784))
<<<<<<< HEAD
<<<<<<< HEAD
=======
>>>>>>> 69e3273ac1 (GEOMESA-3100 Kafka layer views (#2784))
=======
=======
<<<<<<< HEAD
<<<<<<< HEAD
>>>>>>> 2df2640494 (GEOMESA-3100 Kafka layer views (#2784))
=======
>>>>>>> 23f312535d (GEOMESA-3100 Kafka layer views (#2784))
=======
<<<<<<< HEAD
=======
>>>>>>> 2df2640494 (GEOMESA-3100 Kafka layer views (#2784))
=======
>>>>>>> fb32a36e0e (GEOMESA-3100 Kafka layer views (#2784))
>>>>>>> 4adaa7f47 (GEOMESA-3100 Kafka layer views (#2784))
>>>>>>> ae5eea67f1 (GEOMESA-3100 Kafka layer views (#2784))
=======
=======
>>>>>>> 4adaa7f47 (GEOMESA-3100 Kafka layer views (#2784))
=======
>>>>>>> 88ef67cdf (GEOMESA-3100 Kafka layer views (#2784))
>>>>>>> 976f319530 (GEOMESA-3100 Kafka layer views (#2784))
<<<<<<< HEAD
=======
>>>>>>> c2a94543ba (GEOMESA-3100 Kafka layer views (#2784))
=======
>>>>>>> 12f226f36d (GEOMESA-3100 Kafka layer views (#2784))
=======
>>>>>>> 89f0c9f2c3 (GEOMESA-3100 Kafka layer views (#2784))
=======
=======
>>>>>>> 6f6887eb8 (GEOMESA-3100 Kafka layer views (#2784))
>>>>>>> b4cd5a7733 (GEOMESA-3100 Kafka layer views (#2784))
=======
>>>>>>> 02eb81c815 (GEOMESA-3100 Kafka layer views (#2784))
=======
=======
>>>>>>> 69e3273ac1 (GEOMESA-3100 Kafka layer views (#2784))
>>>>>>> 43ac4062d9 (GEOMESA-3100 Kafka layer views (#2784))
=======
=======
>>>>>>> 340134cdda (GEOMESA-3100 Kafka layer views (#2784))
>>>>>>> 4adaa7f47 (GEOMESA-3100 Kafka layer views (#2784))
>>>>>>> ae5eea67f1 (GEOMESA-3100 Kafka layer views (#2784))
>>>>>>> 297ca0be9c (GEOMESA-3100 Kafka layer views (#2784))
=======
>>>>>>> 79f56900f0 (GEOMESA-3100 Kafka layer views (#2784))
>>>>>>> 95c83ca7f (GEOMESA-3100 Kafka layer views (#2784))
=======
>>>>>>> d657014c8 (GEOMESA-3198 Kafka streams integration (#2854))
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
=======
>>>>>>> 81cb3a1b74 (GEOMESA-3198 Kafka streams integration (#2854))
=======
>>>>>>> ea8384d9b7 (GEOMESA-3100 Kafka layer views (#2784))
=======
>>>>>>> ac0357d36 (GEOMESA-3100 Kafka layer views (#2784))
=======
>>>>>>> 54ece16d1 (GEOMESA-3100 Kafka layer views (#2784))
=======
<<<<<<< HEAD
>>>>>>> 2f673a268a (GEOMESA-3100 Kafka layer views (#2784))
=======
>>>>>>> cf6eae6fac (GEOMESA-3198 Kafka streams integration (#2854))
=======
=======
>>>>>>> ac0357d36 (GEOMESA-3100 Kafka layer views (#2784))
>>>>>>> 30905e530b (GEOMESA-3100 Kafka layer views (#2784))
=======
=======
>>>>>>> ea8384d9b7 (GEOMESA-3100 Kafka layer views (#2784))
>>>>>>> 5ca0cd6de (GEOMESA-3100 Kafka layer views (#2784))
>>>>>>> 936154130 (GEOMESA-3100 Kafka layer views (#2784))
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
=======
>>>>>>> 121a1d3470 (GEOMESA-3100 Kafka layer views (#2784))
=======
>>>>>>> ea8384d9b7 (GEOMESA-3100 Kafka layer views (#2784))
=======
>>>>>>> fe3378ccaa (GEOMESA-3100 Kafka layer views (#2784))
=======
>>>>>>> 04f82bbc57 (GEOMESA-3100 Kafka layer views (#2784))
=======
>>>>>>> e0773a1bd7 (GEOMESA-3100 Kafka layer views (#2784))
=======
<<<<<<< HEAD
<<<<<<< HEAD
>>>>>>> 826636f69d (GEOMESA-3100 Kafka layer views (#2784))
=======
>>>>>>> 1e11ed51a6 (GEOMESA-3100 Kafka layer views (#2784))
=======
<<<<<<< HEAD
>>>>>>> 222e44653b (GEOMESA-3100 Kafka layer views (#2784))
=======
>>>>>>> 4f4ecaeb43 (GEOMESA-3100 Kafka layer views (#2784))
=======
=======
>>>>>>> 04f82bbc57 (GEOMESA-3100 Kafka layer views (#2784))
>>>>>>> 30905e530b (GEOMESA-3100 Kafka layer views (#2784))
=======
=======
>>>>>>> 121a1d3470 (GEOMESA-3100 Kafka layer views (#2784))
=======
>>>>>>> 826636f69d (GEOMESA-3100 Kafka layer views (#2784))
=======
>>>>>>> ea8384d9b7 (GEOMESA-3100 Kafka layer views (#2784))
=======
>>>>>>> fe3378ccaa (GEOMESA-3100 Kafka layer views (#2784))
>>>>>>> 2f6607232 (GEOMESA-3100 Kafka layer views (#2784))
=======
>>>>>>> 4e12cd412 (GEOMESA-3198 Kafka streams integration (#2854))
=======
<<<<<<< HEAD
<<<<<<< HEAD
>>>>>>> fc2f65fc3 (GEOMESA-3198 Kafka streams integration (#2854))
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
>>>>>>> bb28efed75 (GEOMESA-3198 Kafka streams integration (#2854))
=======
>>>>>>> 297ca0be9c (GEOMESA-3100 Kafka layer views (#2784))
=======
>>>>>>> 4934cb1a2a (GEOMESA-3198 Kafka streams integration (#2854))
=======
>>>>>>> 79f56900f0 (GEOMESA-3100 Kafka layer views (#2784))
=======
>>>>>>> ea3b40e18 (GEOMESA-3100 Kafka layer views (#2784))
<<<<<<< HEAD
<<<<<<< HEAD
<<<<<<< HEAD
<<<<<<< HEAD
<<<<<<< HEAD
=======
>>>>>>> b4cd5a7733 (GEOMESA-3100 Kafka layer views (#2784))
=======
>>>>>>> 750ebbabe7 (GEOMESA-3100 Kafka layer views (#2784))
=======
=======
>>>>>>> d2cb939f5 (GEOMESA-3100 Kafka layer views (#2784))
<<<<<<< HEAD
<<<<<<< HEAD
<<<<<<< HEAD
<<<<<<< HEAD
<<<<<<< HEAD
=======
>>>>>>> 39d28fffcb (GEOMESA-3100 Kafka layer views (#2784))
=======
>>>>>>> 72ec0b2107 (GEOMESA-3100 Kafka layer views (#2784))
=======
=======
<<<<<<< HEAD
>>>>>>> eecabb92a (GEOMESA-3100 Kafka layer views (#2784))
=======
>>>>>>> 1a5f68233 (GEOMESA-3100 Kafka layer views (#2784))
=======
>>>>>>> 73767737b (GEOMESA-3100 Kafka layer views (#2784))
<<<<<<< HEAD
<<<<<<< HEAD
=======
>>>>>>> 89f0c9f2c3 (GEOMESA-3100 Kafka layer views (#2784))
=======
>>>>>>> 95c83ca7f (GEOMESA-3100 Kafka layer views (#2784))
=======
>>>>>>> 65a3a6e36 (GEOMESA-3100 Kafka layer views (#2784))
<<<<<<< HEAD
<<<<<<< HEAD
=======
>>>>>>> 429ffc55e (GEOMESA-3100 Kafka layer views (#2784))
=======
=======
>>>>>>> 2f6607232 (GEOMESA-3100 Kafka layer views (#2784))
>>>>>>> e7f3e6588 (GEOMESA-3100 Kafka layer views (#2784))
<<<<<<< HEAD
<<<<<<< HEAD
=======
>>>>>>> 6f6887eb8 (GEOMESA-3100 Kafka layer views (#2784))
=======
=======
=======
>>>>>>> d2cb939f5 (GEOMESA-3100 Kafka layer views (#2784))
>>>>>>> 42549e8e3 (GEOMESA-3100 Kafka layer views (#2784))
<<<<<<< HEAD
<<<<<<< HEAD
=======
>>>>>>> a0314fb7f (GEOMESA-3100 Kafka layer views (#2784))
<<<<<<< HEAD
>>>>>>> 8ed2c9f7e5 (GEOMESA-3100 Kafka layer views (#2784))
=======
=======
>>>>>>> 862857ce2 (GEOMESA-3100 Kafka layer views (#2784))
<<<<<<< HEAD
>>>>>>> 8b9e99d11a (GEOMESA-3100 Kafka layer views (#2784))
=======
=======
>>>>>>> 4e12cd412 (GEOMESA-3198 Kafka streams integration (#2854))
=======
>>>>>>> ecbc2cafc (GEOMESA-3198 Kafka streams integration (#2854))
<<<<<<< HEAD
<<<<<<< HEAD
<<<<<<< HEAD
=======
>>>>>>> 02eb81c815 (GEOMESA-3100 Kafka layer views (#2784))
>>>>>>> 41bda2df98 (GEOMESA-3198 Kafka streams integration (#2854))
=======
=======
>>>>>>> 28427dfd8 (GEOMESA-3100 Kafka layer views (#2784))
<<<<<<< HEAD
<<<<<<< HEAD
<<<<<<< HEAD
=======
>>>>>>> 43ac4062d9 (GEOMESA-3100 Kafka layer views (#2784))
>>>>>>> 614fcb6bc3 (GEOMESA-3100 Kafka layer views (#2784))
=======
=======
>>>>>>> 95c83ca7f (GEOMESA-3100 Kafka layer views (#2784))
=======
>>>>>>> 4231e686d (GEOMESA-3100 Kafka layer views (#2784))
<<<<<<< HEAD
<<<<<<< HEAD
<<<<<<< HEAD
=======
>>>>>>> cf6eae6fac (GEOMESA-3198 Kafka streams integration (#2854))
>>>>>>> 69e3273ac1 (GEOMESA-3100 Kafka layer views (#2784))
=======
=======
>>>>>>> 3be3e5d3e (GEOMESA-3198 Kafka streams integration (#2854))
<<<<<<< HEAD
<<<<<<< HEAD
<<<<<<< HEAD
=======
>>>>>>> 30905e530b (GEOMESA-3100 Kafka layer views (#2784))
>>>>>>> d98371fa50 (GEOMESA-3198 Kafka streams integration (#2854))
=======
=======
>>>>>>> ac0357d36 (GEOMESA-3100 Kafka layer views (#2784))
<<<<<<< HEAD
<<<<<<< HEAD
<<<<<<< HEAD
=======
>>>>>>> 121a1d3470 (GEOMESA-3100 Kafka layer views (#2784))
>>>>>>> 04f82bbc57 (GEOMESA-3100 Kafka layer views (#2784))
=======
=======
=======
>>>>>>> 2f6607232 (GEOMESA-3100 Kafka layer views (#2784))
>>>>>>> a62b956fb (GEOMESA-3100 Kafka layer views (#2784))
<<<<<<< HEAD
<<<<<<< HEAD
<<<<<<< HEAD
=======
>>>>>>> bb28efed75 (GEOMESA-3198 Kafka streams integration (#2854))
>>>>>>> e0773a1bd7 (GEOMESA-3100 Kafka layer views (#2784))
=======
=======
>>>>>>> 7b8c9b548 (GEOMESA-3198 Kafka streams integration (#2854))
<<<<<<< HEAD
<<<<<<< HEAD
<<<<<<< HEAD
=======
>>>>>>> 297ca0be9c (GEOMESA-3100 Kafka layer views (#2784))
>>>>>>> 5fa4cd5eac (GEOMESA-3198 Kafka streams integration (#2854))
=======
=======
=======
>>>>>>> ea3b40e18 (GEOMESA-3100 Kafka layer views (#2784))
>>>>>>> 4adaa7f47 (GEOMESA-3100 Kafka layer views (#2784))
<<<<<<< HEAD
<<<<<<< HEAD
<<<<<<< HEAD
=======
>>>>>>> 39d28fffcb (GEOMESA-3100 Kafka layer views (#2784))
>>>>>>> ae5eea67f1 (GEOMESA-3100 Kafka layer views (#2784))
=======
=======
>>>>>>> 6af71ff43 (GEOMESA-3100 Kafka layer views (#2784))
<<<<<<< HEAD
<<<<<<< HEAD
<<<<<<< HEAD
=======
>>>>>>> d4039e3d9a (GEOMESA-3100 Kafka layer views (#2784))
>>>>>>> 23a7d9849f (GEOMESA-3100 Kafka layer views (#2784))
=======
=======
=======
>>>>>>> 17f13b3a7 (GEOMESA-3100 Kafka layer views (#2784))
<<<<<<< HEAD
<<<<<<< HEAD
<<<<<<< HEAD
=======
>>>>>>> 41df6a2aa3 (GEOMESA-3100 Kafka layer views (#2784))
>>>>>>> 6069aba6b4 (GEOMESA-3100 Kafka layer views (#2784))
=======
=======
>>>>>>> bddfdbea5 (GEOMESA-3100 Kafka layer views (#2784))
=======
>>>>>>> c589b832a (GEOMESA-3100 Kafka layer views (#2784))
<<<<<<< HEAD
<<<<<<< HEAD
<<<<<<< HEAD
=======
>>>>>>> 91aada60ab (GEOMESA-3198 Kafka streams integration (#2854))
>>>>>>> 9e433ba57e (GEOMESA-3100 Kafka layer views (#2784))
=======
=======
>>>>>>> 4e12cd412 (GEOMESA-3198 Kafka streams integration (#2854))
=======
>>>>>>> 29a2fa060 (GEOMESA-3198 Kafka streams integration (#2854))
<<<<<<< HEAD
<<<<<<< HEAD
<<<<<<< HEAD
=======
>>>>>>> fb32a36e0e (GEOMESA-3100 Kafka layer views (#2784))
>>>>>>> 69fb98522c (GEOMESA-3198 Kafka streams integration (#2854))
=======
=======
>>>>>>> ffbc2ce32 (GEOMESA-3100 Kafka layer views (#2784))
<<<<<<< HEAD
<<<<<<< HEAD
<<<<<<< HEAD
=======
>>>>>>> 340134cdda (GEOMESA-3100 Kafka layer views (#2784))
>>>>>>> 2df2640494 (GEOMESA-3100 Kafka layer views (#2784))
=======
=======
>>>>>>> 95c83ca7f (GEOMESA-3100 Kafka layer views (#2784))
=======
>>>>>>> fa68dd43c (GEOMESA-3100 Kafka layer views (#2784))
<<<<<<< HEAD
<<<<<<< HEAD
<<<<<<< HEAD
=======
>>>>>>> 81cb3a1b74 (GEOMESA-3198 Kafka streams integration (#2854))
>>>>>>> 23f312535d (GEOMESA-3100 Kafka layer views (#2784))
=======
=======
>>>>>>> eef10da74 (GEOMESA-3198 Kafka streams integration (#2854))
<<<<<<< HEAD
<<<<<<< HEAD
<<<<<<< HEAD
=======
>>>>>>> ea8384d9b7 (GEOMESA-3100 Kafka layer views (#2784))
>>>>>>> 769842a4bf (GEOMESA-3198 Kafka streams integration (#2854))
=======
=======
>>>>>>> 54ece16d1 (GEOMESA-3100 Kafka layer views (#2784))
<<<<<<< HEAD
<<<<<<< HEAD
<<<<<<< HEAD
=======
>>>>>>> fe3378ccaa (GEOMESA-3100 Kafka layer views (#2784))
>>>>>>> 826636f69d (GEOMESA-3100 Kafka layer views (#2784))
=======
=======
=======
>>>>>>> 2f6607232 (GEOMESA-3100 Kafka layer views (#2784))
>>>>>>> c57b5f538 (GEOMESA-3100 Kafka layer views (#2784))
<<<<<<< HEAD
<<<<<<< HEAD
<<<<<<< HEAD
=======
>>>>>>> 4934cb1a2a (GEOMESA-3198 Kafka streams integration (#2854))
>>>>>>> 1e11ed51a6 (GEOMESA-3100 Kafka layer views (#2784))
=======
=======
>>>>>>> 8f51e1858 (GEOMESA-3198 Kafka streams integration (#2854))
<<<<<<< HEAD
<<<<<<< HEAD
<<<<<<< HEAD
=======
>>>>>>> 79f56900f0 (GEOMESA-3100 Kafka layer views (#2784))
>>>>>>> 991d5c62a7 (GEOMESA-3198 Kafka streams integration (#2854))
=======
=======
=======
>>>>>>> ea3b40e18 (GEOMESA-3100 Kafka layer views (#2784))
>>>>>>> 88ef67cdf (GEOMESA-3100 Kafka layer views (#2784))
<<<<<<< HEAD
<<<<<<< HEAD
<<<<<<< HEAD
=======
>>>>>>> 72ec0b2107 (GEOMESA-3100 Kafka layer views (#2784))
>>>>>>> 976f319530 (GEOMESA-3100 Kafka layer views (#2784))
=======
=======
>>>>>>> 89fb9950e (GEOMESA-3100 Kafka layer views (#2784))
>>>>>>> bc97b07a31 (GEOMESA-3100 Kafka layer views (#2784))
<<<<<<< HEAD
<<<<<<< HEAD
=======
=======
>>>>>>> 337ecd16e5 (GEOMESA-3100 Kafka layer views (#2784))
=======
>>>>>>> bddfdbea5 (GEOMESA-3100 Kafka layer views (#2784))
=======
>>>>>>> 12fe94b860 (GEOMESA-3100 Kafka layer views (#2784))
=======
>>>>>>> 90a582b4a6 (GEOMESA-3198 Kafka streams integration (#2854))
=======
>>>>>>> 0e42c51dc0 (GEOMESA-3100 Kafka layer views (#2784))
=======
>>>>>>> 95c83ca7f (GEOMESA-3100 Kafka layer views (#2784))
=======
>>>>>>> 19aa61c0de (GEOMESA-3100 Kafka layer views (#2784))
=======
>>>>>>> 60bcd014c8 (GEOMESA-3198 Kafka streams integration (#2854))
=======
>>>>>>> 626c8f9b93 (GEOMESA-3100 Kafka layer views (#2784))
=======
=======
>>>>>>> 2f6607232 (GEOMESA-3100 Kafka layer views (#2784))
>>>>>>> 9a5d6d2815 (GEOMESA-3100 Kafka layer views (#2784))
=======
>>>>>>> f716dd05cb (GEOMESA-3198 Kafka streams integration (#2854))
=======
=======
>>>>>>> ea3b40e18 (GEOMESA-3100 Kafka layer views (#2784))
>>>>>>> f4b2369e9a (GEOMESA-3100 Kafka layer views (#2784))
=======
>>>>>>> 305a9263eb (GEOMESA-3100 Kafka layer views (#2784))
=======
>>>>>>> 3010fc384e (GEOMESA-3100 Kafka layer views (#2784))
=======
>>>>>>> 73f3a8cb69 (GEOMESA-3198 Kafka streams integration (#2854))
=======
>>>>>>> d4a13604e7 (GEOMESA-3198 Kafka streams integration (#2854))
=======
>>>>>>> 1c99a27679 (GEOMESA-3100 Kafka layer views (#2784))
=======
>>>>>>> bddfdbea5 (GEOMESA-3100 Kafka layer views (#2784))
=======
>>>>>>> 92dc7a8411 (GEOMESA-3100 Kafka layer views (#2784))
=======
>>>>>>> 4e12cd412 (GEOMESA-3198 Kafka streams integration (#2854))
=======
>>>>>>> 5d02b8e414 (GEOMESA-3198 Kafka streams integration (#2854))
=======
=======
>>>>>>> 5ca0cd6de (GEOMESA-3100 Kafka layer views (#2784))
>>>>>>> d0dc799ff (GEOMESA-3100 Kafka layer views (#2784))
=======
>>>>>>> 2766fc9b5b (GEOMESA-3100 Kafka layer views (#2784))
=======
>>>>>>> 95c83ca7f (GEOMESA-3100 Kafka layer views (#2784))
=======
>>>>>>> de8804123e (GEOMESA-3100 Kafka layer views (#2784))
=======
>>>>>>> 7442d73a4d (GEOMESA-3198 Kafka streams integration (#2854))
=======
>>>>>>> 2f673a268a (GEOMESA-3100 Kafka layer views (#2784))
=======
=======
>>>>>>> 2f6607232 (GEOMESA-3100 Kafka layer views (#2784))
>>>>>>> c44e474495 (GEOMESA-3100 Kafka layer views (#2784))
=======
>>>>>>> fc2f65fc3 (GEOMESA-3198 Kafka streams integration (#2854))
>>>>>>> 38e75099c5 (GEOMESA-3198 Kafka streams integration (#2854))
=======
=======
>>>>>>> ea3b40e18 (GEOMESA-3100 Kafka layer views (#2784))
>>>>>>> c2a94543ba (GEOMESA-3100 Kafka layer views (#2784))
=======
=======
=======
>>>>>>> d2cb939f5 (GEOMESA-3100 Kafka layer views (#2784))
>>>>>>> 117b13aaaa (GEOMESA-3100 Kafka layer views (#2784))
=======
=======
=======
>>>>>>> eecabb92a (GEOMESA-3100 Kafka layer views (#2784))
<<<<<<< HEAD
>>>>>>> cf457d8543 (GEOMESA-3100 Kafka layer views (#2784))
=======
=======
>>>>>>> 1a5f68233 (GEOMESA-3100 Kafka layer views (#2784))
>>>>>>> c61bffed00 (GEOMESA-3100 Kafka layer views (#2784))
=======
>>>>>>> 12f226f36d (GEOMESA-3100 Kafka layer views (#2784))
=======
>>>>>>> 89f0c9f2c3 (GEOMESA-3100 Kafka layer views (#2784))
=======
=======
>>>>>>> 429ffc55e (GEOMESA-3100 Kafka layer views (#2784))
>>>>>>> 222e44653b (GEOMESA-3100 Kafka layer views (#2784))
=======
>>>>>>> 4f4ecaeb43 (GEOMESA-3100 Kafka layer views (#2784))
=======
=======
>>>>>>> 6f6887eb8 (GEOMESA-3100 Kafka layer views (#2784))
>>>>>>> b4cd5a7733 (GEOMESA-3100 Kafka layer views (#2784))
=======
>>>>>>> 750ebbabe7 (GEOMESA-3100 Kafka layer views (#2784))
=======
=======
>>>>>>> a0314fb7f (GEOMESA-3100 Kafka layer views (#2784))
<<<<<<< HEAD
>>>>>>> 8ed2c9f7e5 (GEOMESA-3100 Kafka layer views (#2784))
<<<<<<< HEAD
>>>>>>> fc4546247e (GEOMESA-3100 Kafka layer views (#2784))
=======
=======
=======
>>>>>>> 862857ce2 (GEOMESA-3100 Kafka layer views (#2784))
>>>>>>> 8b9e99d11a (GEOMESA-3100 Kafka layer views (#2784))
>>>>>>> c64e652363 (GEOMESA-3100 Kafka layer views (#2784))
=======
>>>>>>> 41bda2df98 (GEOMESA-3198 Kafka streams integration (#2854))
>>>>>>> 2834875e9b (GEOMESA-3198 Kafka streams integration (#2854))
=======
>>>>>>> 614fcb6bc3 (GEOMESA-3100 Kafka layer views (#2784))
>>>>>>> 02eb81c815 (GEOMESA-3100 Kafka layer views (#2784))
=======
>>>>>>> 69e3273ac1 (GEOMESA-3100 Kafka layer views (#2784))
>>>>>>> 43ac4062d9 (GEOMESA-3100 Kafka layer views (#2784))
=======
>>>>>>> d98371fa50 (GEOMESA-3198 Kafka streams integration (#2854))
>>>>>>> cf6eae6fac (GEOMESA-3198 Kafka streams integration (#2854))
=======
>>>>>>> 04f82bbc57 (GEOMESA-3100 Kafka layer views (#2784))
>>>>>>> 30905e530b (GEOMESA-3100 Kafka layer views (#2784))
=======
>>>>>>> e0773a1bd7 (GEOMESA-3100 Kafka layer views (#2784))
>>>>>>> 121a1d3470 (GEOMESA-3100 Kafka layer views (#2784))
=======
>>>>>>> 5fa4cd5eac (GEOMESA-3198 Kafka streams integration (#2854))
>>>>>>> bb28efed75 (GEOMESA-3198 Kafka streams integration (#2854))
=======
>>>>>>> ae5eea67f1 (GEOMESA-3100 Kafka layer views (#2784))
>>>>>>> 297ca0be9c (GEOMESA-3100 Kafka layer views (#2784))
=======
>>>>>>> 23a7d9849f (GEOMESA-3100 Kafka layer views (#2784))
>>>>>>> 39d28fffcb (GEOMESA-3100 Kafka layer views (#2784))
=======
>>>>>>> 6069aba6b4 (GEOMESA-3100 Kafka layer views (#2784))
>>>>>>> d4039e3d9a (GEOMESA-3100 Kafka layer views (#2784))
=======
>>>>>>> 9e433ba57e (GEOMESA-3100 Kafka layer views (#2784))
>>>>>>> 41df6a2aa3 (GEOMESA-3100 Kafka layer views (#2784))
=======
>>>>>>> 69fb98522c (GEOMESA-3198 Kafka streams integration (#2854))
>>>>>>> 91aada60ab (GEOMESA-3198 Kafka streams integration (#2854))
=======
>>>>>>> 2df2640494 (GEOMESA-3100 Kafka layer views (#2784))
>>>>>>> fb32a36e0e (GEOMESA-3100 Kafka layer views (#2784))
=======
>>>>>>> 23f312535d (GEOMESA-3100 Kafka layer views (#2784))
>>>>>>> 340134cdda (GEOMESA-3100 Kafka layer views (#2784))
=======
>>>>>>> 769842a4bf (GEOMESA-3198 Kafka streams integration (#2854))
>>>>>>> 81cb3a1b74 (GEOMESA-3198 Kafka streams integration (#2854))
=======
>>>>>>> 826636f69d (GEOMESA-3100 Kafka layer views (#2784))
>>>>>>> ea8384d9b7 (GEOMESA-3100 Kafka layer views (#2784))
=======
>>>>>>> 1e11ed51a6 (GEOMESA-3100 Kafka layer views (#2784))
>>>>>>> fe3378ccaa (GEOMESA-3100 Kafka layer views (#2784))
=======
>>>>>>> 991d5c62a7 (GEOMESA-3198 Kafka streams integration (#2854))
>>>>>>> 4934cb1a2a (GEOMESA-3198 Kafka streams integration (#2854))
=======
>>>>>>> 976f319530 (GEOMESA-3100 Kafka layer views (#2784))
>>>>>>> 79f56900f0 (GEOMESA-3100 Kafka layer views (#2784))
=======
>>>>>>> 72ec0b2107 (GEOMESA-3100 Kafka layer views (#2784))
=======
=======
=======
>>>>>>> 337ecd16e5 (GEOMESA-3100 Kafka layer views (#2784))
>>>>>>> ad362b1341 (GEOMESA-3100 Kafka layer views (#2784))
  @volatile
  private var producerInitialized = false

>>>>>>> af0a88eb1 (GEOMESA-3100 Kafka layer views (#2784))
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
>>>>>>> 92dc7a8411 (GEOMESA-3100 Kafka layer views (#2784))
=======
>>>>>>> 5d02b8e414 (GEOMESA-3198 Kafka streams integration (#2854))
=======
>>>>>>> 2766fc9b5b (GEOMESA-3100 Kafka layer views (#2784))
=======
>>>>>>> de8804123e (GEOMESA-3100 Kafka layer views (#2784))
=======
>>>>>>> 7442d73a4d (GEOMESA-3198 Kafka streams integration (#2854))
=======
>>>>>>> 2f673a268a (GEOMESA-3100 Kafka layer views (#2784))
=======
>>>>>>> c44e474495 (GEOMESA-3100 Kafka layer views (#2784))
=======
>>>>>>> 38e75099c5 (GEOMESA-3198 Kafka streams integration (#2854))
=======
>>>>>>> c2a94543ba (GEOMESA-3100 Kafka layer views (#2784))
=======
>>>>>>> 117b13aaaa (GEOMESA-3100 Kafka layer views (#2784))
=======
>>>>>>> cf457d8543 (GEOMESA-3100 Kafka layer views (#2784))
=======
>>>>>>> e2a2dd4c2e (GEOMESA-3198 Kafka streams integration (#2854))
=======
>>>>>>> 0cd029fb3b (GEOMESA-3100 Kafka layer views (#2784))
=======
>>>>>>> c61bffed00 (GEOMESA-3100 Kafka layer views (#2784))
=======
>>>>>>> 12f226f36d (GEOMESA-3100 Kafka layer views (#2784))
=======
>>>>>>> 89f0c9f2c3 (GEOMESA-3100 Kafka layer views (#2784))
=======
>>>>>>> 222e44653b (GEOMESA-3100 Kafka layer views (#2784))
=======
>>>>>>> 4f4ecaeb43 (GEOMESA-3100 Kafka layer views (#2784))
=======
>>>>>>> b4cd5a7733 (GEOMESA-3100 Kafka layer views (#2784))
=======
>>>>>>> 750ebbabe7 (GEOMESA-3100 Kafka layer views (#2784))
=======
>>>>>>> fc4546247e (GEOMESA-3100 Kafka layer views (#2784))
=======
>>>>>>> e792102d4b (GEOMESA-3198 Kafka streams integration (#2854))
=======
>>>>>>> 65e544d20e (GEOMESA-3100 Kafka layer views (#2784))
=======
>>>>>>> c64e652363 (GEOMESA-3100 Kafka layer views (#2784))
=======
>>>>>>> 2834875e9b (GEOMESA-3198 Kafka streams integration (#2854))
=======
>>>>>>> 02eb81c815 (GEOMESA-3100 Kafka layer views (#2784))
=======
>>>>>>> 43ac4062d9 (GEOMESA-3100 Kafka layer views (#2784))
=======
>>>>>>> cf6eae6fac (GEOMESA-3198 Kafka streams integration (#2854))
=======
>>>>>>> 30905e530b (GEOMESA-3100 Kafka layer views (#2784))
=======
>>>>>>> 121a1d3470 (GEOMESA-3100 Kafka layer views (#2784))
=======
>>>>>>> bb28efed75 (GEOMESA-3198 Kafka streams integration (#2854))
=======
>>>>>>> 297ca0be9c (GEOMESA-3100 Kafka layer views (#2784))
=======
>>>>>>> 39d28fffcb (GEOMESA-3100 Kafka layer views (#2784))
=======
>>>>>>> d4039e3d9a (GEOMESA-3100 Kafka layer views (#2784))
=======
>>>>>>> c9a6fc453c (GEOMESA-3198 Kafka streams integration (#2854))
=======
>>>>>>> 0d5f6377de (GEOMESA-3100 Kafka layer views (#2784))
=======
>>>>>>> 41df6a2aa3 (GEOMESA-3100 Kafka layer views (#2784))
=======
>>>>>>> 91aada60ab (GEOMESA-3198 Kafka streams integration (#2854))
=======
>>>>>>> fb32a36e0e (GEOMESA-3100 Kafka layer views (#2784))
=======
>>>>>>> 340134cdda (GEOMESA-3100 Kafka layer views (#2784))
=======
>>>>>>> 81cb3a1b74 (GEOMESA-3198 Kafka streams integration (#2854))
=======
>>>>>>> ea8384d9b7 (GEOMESA-3100 Kafka layer views (#2784))
=======
>>>>>>> fe3378ccaa (GEOMESA-3100 Kafka layer views (#2784))
=======
>>>>>>> 4934cb1a2a (GEOMESA-3198 Kafka streams integration (#2854))
=======
>>>>>>> 79f56900f0 (GEOMESA-3100 Kafka layer views (#2784))
=======
>>>>>>> 72ec0b2107 (GEOMESA-3100 Kafka layer views (#2784))
=======
>>>>>>> ad362b1341 (GEOMESA-3100 Kafka layer views (#2784))
=======
>>>>>>> f9df175e9b (GEOMESA-3198 Kafka streams integration (#2854))
>>>>>>> 17f13b3a7a (GEOMESA-3100 Kafka layer views (#2784))
=======
=======
>>>>>>> 19aa61c0de (GEOMESA-3100 Kafka layer views (#2784))
=======
>>>>>>> 60bcd014c8 (GEOMESA-3198 Kafka streams integration (#2854))
=======
>>>>>>> 626c8f9b93 (GEOMESA-3100 Kafka layer views (#2784))
=======
>>>>>>> 9a5d6d2815 (GEOMESA-3100 Kafka layer views (#2784))
=======
>>>>>>> f716dd05cb (GEOMESA-3198 Kafka streams integration (#2854))
=======
>>>>>>> f4b2369e9a (GEOMESA-3100 Kafka layer views (#2784))
=======
>>>>>>> 305a9263eb (GEOMESA-3100 Kafka layer views (#2784))
=======
>>>>>>> d0dc799ff (GEOMESA-3100 Kafka layer views (#2784))
>>>>>>> 0e42c51dc0 (GEOMESA-3100 Kafka layer views (#2784))
=======
=======
>>>>>>> de758f45a (GEOMESA-3198 Kafka streams integration (#2854))
>>>>>>> 73f3a8cb69 (GEOMESA-3198 Kafka streams integration (#2854))
=======
=======
>>>>>>> c589b832a5 (GEOMESA-3100 Kafka layer views (#2784))
=======
<<<<<<< HEAD
<<<<<<< HEAD
>>>>>>> 29a2fa060e (GEOMESA-3198 Kafka streams integration (#2854))
=======
=======
<<<<<<< HEAD
<<<<<<< HEAD
>>>>>>> fa68dd43c6 (GEOMESA-3100 Kafka layer views (#2784))
=======
>>>>>>> eef10da741 (GEOMESA-3198 Kafka streams integration (#2854))
=======
>>>>>>> 54ece16d15 (GEOMESA-3100 Kafka layer views (#2784))
=======
<<<<<<< HEAD
<<<<<<< HEAD
>>>>>>> c57b5f538a (GEOMESA-3100 Kafka layer views (#2784))
=======
>>>>>>> 8f51e18588 (GEOMESA-3198 Kafka streams integration (#2854))
=======
<<<<<<< HEAD
<<<<<<< HEAD
>>>>>>> 88ef67cdfe (GEOMESA-3100 Kafka layer views (#2784))
=======
>>>>>>> 89fb9950ef (GEOMESA-3100 Kafka layer views (#2784))
=======
<<<<<<< HEAD
<<<<<<< HEAD
>>>>>>> 98e7bf59d2 (GEOMESA-3100 Kafka layer views (#2784))
=======
>>>>>>> 0b3e844fc4 (GEOMESA-3198 Kafka streams integration (#2854))
=======
<<<<<<< HEAD
<<<<<<< HEAD
>>>>>>> e24613dc4a (GEOMESA-3100 Kafka layer views (#2784))
=======
>>>>>>> dae1cf3cef (GEOMESA-3100 Kafka layer views (#2784))
=======
<<<<<<< HEAD
<<<<<<< HEAD
>>>>>>> 50a71079c1 (GEOMESA-3100 Kafka layer views (#2784))
=======
=======
<<<<<<< HEAD
<<<<<<< HEAD
>>>>>>> 4c325746bd (GEOMESA-3100 Kafka layer views (#2784))
=======
>>>>>>> 3ebcdb99d9 (GEOMESA-3100 Kafka layer views (#2784))
=======
>>>>>>> fdf51402cf (GEOMESA-3100 Kafka layer views (#2784))
=======
<<<<<<< HEAD
<<<<<<< HEAD
>>>>>>> a377061090 (GEOMESA-3100 Kafka layer views (#2784))
=======
>>>>>>> eddb4eaca1 (GEOMESA-3100 Kafka layer views (#2784))
=======
<<<<<<< HEAD
<<<<<<< HEAD
>>>>>>> 8d7834ec11 (GEOMESA-3198 Kafka streams integration (#2854))
=======
>>>>>>> be0c9d161a (GEOMESA-3100 Kafka layer views (#2784))
=======
<<<<<<< HEAD
<<<<<<< HEAD
>>>>>>> 7bdc1feea8 (GEOMESA-3100 Kafka layer views (#2784))
=======
>>>>>>> 965120b3ca (GEOMESA-3198 Kafka streams integration (#2854))
=======
<<<<<<< HEAD
<<<<<<< HEAD
>>>>>>> 9b15c8e14c (GEOMESA-3100 Kafka layer views (#2784))
=======
>>>>>>> 3977ecc140 (GEOMESA-3100 Kafka layer views (#2784))
=======
<<<<<<< HEAD
<<<<<<< HEAD
>>>>>>> ec680351e0 (GEOMESA-3198 Kafka streams integration (#2854))
=======
>>>>>>> 495a1efc9f (GEOMESA-3100 Kafka layer views (#2784))
=======
<<<<<<< HEAD
<<<<<<< HEAD
>>>>>>> 5d8c5baea0 (GEOMESA-3100 Kafka layer views (#2784))
=======
>>>>>>> 8ce502793e (GEOMESA-3198 Kafka streams integration (#2854))
=======
<<<<<<< HEAD
<<<<<<< HEAD
>>>>>>> 7628960f66 (GEOMESA-3100 Kafka layer views (#2784))
=======
>>>>>>> 416a95a4c0 (GEOMESA-3100 Kafka layer views (#2784))
=======
<<<<<<< HEAD
<<<<<<< HEAD
>>>>>>> ccfb3bd95e (GEOMESA-3100 Kafka layer views (#2784))
=======
>>>>>>> 4ae16a2980 (GEOMESA-3198 Kafka streams integration (#2854))
=======
<<<<<<< HEAD
<<<<<<< HEAD
>>>>>>> b5abc19ca4 (GEOMESA-3100 Kafka layer views (#2784))
=======
>>>>>>> 2750a5beef (GEOMESA-3100 Kafka layer views (#2784))
=======
<<<<<<< HEAD
<<<<<<< HEAD
>>>>>>> 3a0eb62fc5 (GEOMESA-3198 Kafka streams integration (#2854))
=======
>>>>>>> cb4aa55ae3 (GEOMESA-3100 Kafka layer views (#2784))
=======
<<<<<<< HEAD
<<<<<<< HEAD
>>>>>>> 468da42855 (GEOMESA-3100 Kafka layer views (#2784))
=======
>>>>>>> 320fc0eff4 (GEOMESA-3198 Kafka streams integration (#2854))
=======
<<<<<<< HEAD
<<<<<<< HEAD
>>>>>>> 5dd3eb3a6d (GEOMESA-3100 Kafka layer views (#2784))
=======
>>>>>>> d530f7b24a (GEOMESA-3100 Kafka layer views (#2784))
=======
<<<<<<< HEAD
<<<<<<< HEAD
>>>>>>> 55438fd78b (GEOMESA-3198 Kafka streams integration (#2854))
=======
>>>>>>> 5e230912b1 (GEOMESA-3100 Kafka layer views (#2784))
=======
<<<<<<< HEAD
<<<<<<< HEAD
>>>>>>> f340d6feab (GEOMESA-3100 Kafka layer views (#2784))
=======
=======
>>>>>>> 4c325746bd (GEOMESA-3100 Kafka layer views (#2784))
=======
<<<<<<< HEAD
>>>>>>> 222e44653b (GEOMESA-3100 Kafka layer views (#2784))
=======
>>>>>>> 3ebcdb99d9 (GEOMESA-3100 Kafka layer views (#2784))
=======
>>>>>>> 4f4ecaeb43 (GEOMESA-3100 Kafka layer views (#2784))
=======
>>>>>>> b4cd5a7733 (GEOMESA-3100 Kafka layer views (#2784))
=======
>>>>>>> a377061090 (GEOMESA-3100 Kafka layer views (#2784))
=======
>>>>>>> 750ebbabe7 (GEOMESA-3100 Kafka layer views (#2784))
=======
>>>>>>> fc4546247e (GEOMESA-3100 Kafka layer views (#2784))
=======
>>>>>>> 8d7834ec11 (GEOMESA-3198 Kafka streams integration (#2854))
=======
>>>>>>> e792102d4b (GEOMESA-3198 Kafka streams integration (#2854))
=======
>>>>>>> 65e544d20e (GEOMESA-3100 Kafka layer views (#2784))
=======
>>>>>>> 7bdc1feea8 (GEOMESA-3100 Kafka layer views (#2784))
=======
>>>>>>> c64e652363 (GEOMESA-3100 Kafka layer views (#2784))
=======
>>>>>>> 2834875e9b (GEOMESA-3198 Kafka streams integration (#2854))
=======
>>>>>>> 9b15c8e14c (GEOMESA-3100 Kafka layer views (#2784))
=======
>>>>>>> 02eb81c815 (GEOMESA-3100 Kafka layer views (#2784))
=======
>>>>>>> 43ac4062d9 (GEOMESA-3100 Kafka layer views (#2784))
=======
>>>>>>> ec680351e0 (GEOMESA-3198 Kafka streams integration (#2854))
=======
>>>>>>> cf6eae6fac (GEOMESA-3198 Kafka streams integration (#2854))
=======
>>>>>>> 30905e530b (GEOMESA-3100 Kafka layer views (#2784))
=======
>>>>>>> 5d8c5baea0 (GEOMESA-3100 Kafka layer views (#2784))
=======
>>>>>>> 121a1d3470 (GEOMESA-3100 Kafka layer views (#2784))
=======
>>>>>>> bb28efed75 (GEOMESA-3198 Kafka streams integration (#2854))
=======
>>>>>>> 7628960f66 (GEOMESA-3100 Kafka layer views (#2784))
=======
>>>>>>> 297ca0be9c (GEOMESA-3100 Kafka layer views (#2784))
=======
>>>>>>> 39d28fffcb (GEOMESA-3100 Kafka layer views (#2784))
=======
>>>>>>> ccfb3bd95e (GEOMESA-3100 Kafka layer views (#2784))
=======
>>>>>>> d4039e3d9a (GEOMESA-3100 Kafka layer views (#2784))
=======
>>>>>>> c9a6fc453c (GEOMESA-3198 Kafka streams integration (#2854))
=======
>>>>>>> b5abc19ca4 (GEOMESA-3100 Kafka layer views (#2784))
=======
>>>>>>> 0d5f6377de (GEOMESA-3100 Kafka layer views (#2784))
=======
>>>>>>> 41df6a2aa3 (GEOMESA-3100 Kafka layer views (#2784))
=======
>>>>>>> 3a0eb62fc5 (GEOMESA-3198 Kafka streams integration (#2854))
=======
>>>>>>> 91aada60ab (GEOMESA-3198 Kafka streams integration (#2854))
=======
>>>>>>> fb32a36e0e (GEOMESA-3100 Kafka layer views (#2784))
=======
>>>>>>> 468da42855 (GEOMESA-3100 Kafka layer views (#2784))
=======
>>>>>>> 340134cdda (GEOMESA-3100 Kafka layer views (#2784))
=======
>>>>>>> 81cb3a1b74 (GEOMESA-3198 Kafka streams integration (#2854))
=======
>>>>>>> 5dd3eb3a6d (GEOMESA-3100 Kafka layer views (#2784))
=======
>>>>>>> ea8384d9b7 (GEOMESA-3100 Kafka layer views (#2784))
=======
>>>>>>> fe3378ccaa (GEOMESA-3100 Kafka layer views (#2784))
=======
>>>>>>> 55438fd78b (GEOMESA-3198 Kafka streams integration (#2854))
=======
>>>>>>> 4934cb1a2a (GEOMESA-3198 Kafka streams integration (#2854))
=======
>>>>>>> 79f56900f0 (GEOMESA-3100 Kafka layer views (#2784))
=======
>>>>>>> f340d6feab (GEOMESA-3100 Kafka layer views (#2784))
=======
>>>>>>> 72ec0b2107 (GEOMESA-3100 Kafka layer views (#2784))
>>>>>>> 65a3a6e36 (GEOMESA-3100 Kafka layer views (#2784))
>>>>>>> 9e910620b3 (GEOMESA-3100 Kafka layer views (#2784))
=======
>>>>>>> 429ffc55e (GEOMESA-3100 Kafka layer views (#2784))
=======
<<<<<<< HEAD
<<<<<<< HEAD
>>>>>>> e7f3e6588 (GEOMESA-3100 Kafka layer views (#2784))
=======
>>>>>>> 6f6887eb8 (GEOMESA-3100 Kafka layer views (#2784))
=======
<<<<<<< HEAD
<<<<<<< HEAD
>>>>>>> 42549e8e3 (GEOMESA-3100 Kafka layer views (#2784))
=======
>>>>>>> 8ed2c9f7e5 (GEOMESA-3100 Kafka layer views (#2784))
=======
<<<<<<< HEAD
<<<<<<< HEAD
>>>>>>> 30fda14bf2 (GEOMESA-3198 Kafka streams integration (#2854))
=======
>>>>>>> c1d0543aac (GEOMESA-3100 Kafka layer views (#2784))
=======
<<<<<<< HEAD
<<<<<<< HEAD
>>>>>>> 8b9e99d11a (GEOMESA-3100 Kafka layer views (#2784))
=======
>>>>>>> 41bda2df98 (GEOMESA-3198 Kafka streams integration (#2854))
=======
<<<<<<< HEAD
<<<<<<< HEAD
>>>>>>> 614fcb6bc3 (GEOMESA-3100 Kafka layer views (#2784))
=======
=======
<<<<<<< HEAD
<<<<<<< HEAD
>>>>>>> d98371fa50 (GEOMESA-3198 Kafka streams integration (#2854))
=======
>>>>>>> 04f82bbc57 (GEOMESA-3100 Kafka layer views (#2784))
=======
>>>>>>> e0773a1bd7 (GEOMESA-3100 Kafka layer views (#2784))
=======
<<<<<<< HEAD
<<<<<<< HEAD
>>>>>>> 5fa4cd5eac (GEOMESA-3198 Kafka streams integration (#2854))
=======
>>>>>>> ae5eea67f1 (GEOMESA-3100 Kafka layer views (#2784))
=======
<<<<<<< HEAD
<<<<<<< HEAD
>>>>>>> 23a7d9849f (GEOMESA-3100 Kafka layer views (#2784))
=======
>>>>>>> 6069aba6b4 (GEOMESA-3100 Kafka layer views (#2784))
=======
<<<<<<< HEAD
<<<<<<< HEAD
>>>>>>> c6591bc391 (GEOMESA-3198 Kafka streams integration (#2854))
=======
>>>>>>> 4480b2d1b9 (GEOMESA-3100 Kafka layer views (#2784))
=======
<<<<<<< HEAD
<<<<<<< HEAD
>>>>>>> 9e433ba57e (GEOMESA-3100 Kafka layer views (#2784))
=======
>>>>>>> 69fb98522c (GEOMESA-3198 Kafka streams integration (#2854))
=======
<<<<<<< HEAD
<<<<<<< HEAD
=======
>>>>>>> 23f312535d (GEOMESA-3100 Kafka layer views (#2784))
=======
>>>>>>> 769842a4bf (GEOMESA-3198 Kafka streams integration (#2854))
=======
>>>>>>> 826636f69d (GEOMESA-3100 Kafka layer views (#2784))
=======
>>>>>>> 1e11ed51a6 (GEOMESA-3100 Kafka layer views (#2784))
=======
>>>>>>> 991d5c62a7 (GEOMESA-3198 Kafka streams integration (#2854))
=======
>>>>>>> 976f319530 (GEOMESA-3100 Kafka layer views (#2784))
=======
>>>>>>> bc97b07a31 (GEOMESA-3100 Kafka layer views (#2784))
=======
>>>>>>> fb32a36e0e (GEOMESA-3100 Kafka layer views (#2784))
=======
>>>>>>> 23f312535d (GEOMESA-3100 Kafka layer views (#2784))
=======
>>>>>>> 769842a4bf (GEOMESA-3198 Kafka streams integration (#2854))
=======
>>>>>>> 826636f69d (GEOMESA-3100 Kafka layer views (#2784))
=======
>>>>>>> 1e11ed51a6 (GEOMESA-3100 Kafka layer views (#2784))
=======
>>>>>>> 991d5c62a7 (GEOMESA-3198 Kafka streams integration (#2854))
=======
>>>>>>> 976f319530 (GEOMESA-3100 Kafka layer views (#2784))
=======
>>>>>>> bc97b07a31 (GEOMESA-3100 Kafka layer views (#2784))
=======
=======
>>>>>>> d0dc799ff (GEOMESA-3100 Kafka layer views (#2784))
>>>>>>> ffbc2ce32 (GEOMESA-3100 Kafka layer views (#2784))
>>>>>>> 2df2640494 (GEOMESA-3100 Kafka layer views (#2784))
=======
<<<<<<< HEAD
=======
>>>>>>> d98371fa50 (GEOMESA-3198 Kafka streams integration (#2854))
=======
<<<<<<< HEAD
>>>>>>> cf6eae6fac (GEOMESA-3198 Kafka streams integration (#2854))
=======
>>>>>>> 04f82bbc57 (GEOMESA-3100 Kafka layer views (#2784))
=======
>>>>>>> 30905e530b (GEOMESA-3100 Kafka layer views (#2784))
=======
>>>>>>> 121a1d3470 (GEOMESA-3100 Kafka layer views (#2784))
=======
>>>>>>> 5fa4cd5eac (GEOMESA-3198 Kafka streams integration (#2854))
=======
>>>>>>> bb28efed75 (GEOMESA-3198 Kafka streams integration (#2854))
=======
>>>>>>> 297ca0be9c (GEOMESA-3100 Kafka layer views (#2784))
=======
>>>>>>> 23a7d9849f (GEOMESA-3100 Kafka layer views (#2784))
=======
>>>>>>> 39d28fffcb (GEOMESA-3100 Kafka layer views (#2784))
=======
>>>>>>> d4039e3d9a (GEOMESA-3100 Kafka layer views (#2784))
=======
>>>>>>> c6591bc391 (GEOMESA-3198 Kafka streams integration (#2854))
=======
>>>>>>> c9a6fc453c (GEOMESA-3198 Kafka streams integration (#2854))
=======
>>>>>>> 0d5f6377de (GEOMESA-3100 Kafka layer views (#2784))
=======
>>>>>>> 9e433ba57e (GEOMESA-3100 Kafka layer views (#2784))
=======
>>>>>>> 41df6a2aa3 (GEOMESA-3100 Kafka layer views (#2784))
=======
>>>>>>> 91aada60ab (GEOMESA-3198 Kafka streams integration (#2854))
=======
>>>>>>> fb32a36e0e (GEOMESA-3100 Kafka layer views (#2784))
>>>>>>> 4231e686d (GEOMESA-3100 Kafka layer views (#2784))
>>>>>>> 69e3273ac1 (GEOMESA-3100 Kafka layer views (#2784))
=======
>>>>>>> 3be3e5d3e (GEOMESA-3198 Kafka streams integration (#2854))
=======
<<<<<<< HEAD
<<<<<<< HEAD
>>>>>>> ac0357d36 (GEOMESA-3100 Kafka layer views (#2784))
=======
>>>>>>> a62b956fb (GEOMESA-3100 Kafka layer views (#2784))
=======
<<<<<<< HEAD
<<<<<<< HEAD
>>>>>>> 7b8c9b548 (GEOMESA-3198 Kafka streams integration (#2854))
=======
>>>>>>> 4adaa7f47 (GEOMESA-3100 Kafka layer views (#2784))
=======
<<<<<<< HEAD
<<<<<<< HEAD
>>>>>>> 6af71ff43 (GEOMESA-3100 Kafka layer views (#2784))
=======
>>>>>>> fa68dd43c (GEOMESA-3100 Kafka layer views (#2784))
=======
<<<<<<< HEAD
<<<<<<< HEAD
>>>>>>> eef10da74 (GEOMESA-3198 Kafka streams integration (#2854))
=======
>>>>>>> 54ece16d1 (GEOMESA-3100 Kafka layer views (#2784))
=======
<<<<<<< HEAD
<<<<<<< HEAD
>>>>>>> c57b5f538 (GEOMESA-3100 Kafka layer views (#2784))
=======
>>>>>>> 8f51e1858 (GEOMESA-3198 Kafka streams integration (#2854))
=======
<<<<<<< HEAD
<<<<<<< HEAD
>>>>>>> 88ef67cdf (GEOMESA-3100 Kafka layer views (#2784))
=======
>>>>>>> 89fb9950e (GEOMESA-3100 Kafka layer views (#2784))
=======
<<<<<<< HEAD
=======
>>>>>>> fa68dd43c6 (GEOMESA-3100 Kafka layer views (#2784))
=======
<<<<<<< HEAD
>>>>>>> de8804123e (GEOMESA-3100 Kafka layer views (#2784))
=======
>>>>>>> eef10da741 (GEOMESA-3198 Kafka streams integration (#2854))
=======
>>>>>>> 7442d73a4d (GEOMESA-3198 Kafka streams integration (#2854))
=======
>>>>>>> 2f673a268a (GEOMESA-3100 Kafka layer views (#2784))
=======
>>>>>>> c57b5f538a (GEOMESA-3100 Kafka layer views (#2784))
=======
>>>>>>> c44e474495 (GEOMESA-3100 Kafka layer views (#2784))
=======
>>>>>>> 38e75099c5 (GEOMESA-3198 Kafka streams integration (#2854))
=======
>>>>>>> 88ef67cdfe (GEOMESA-3100 Kafka layer views (#2784))
=======
>>>>>>> c2a94543ba (GEOMESA-3100 Kafka layer views (#2784))
=======
>>>>>>> 98e7bf59d2 (GEOMESA-3100 Kafka layer views (#2784))
=======
>>>>>>> cf457d8543 (GEOMESA-3100 Kafka layer views (#2784))
=======
>>>>>>> e2a2dd4c2e (GEOMESA-3198 Kafka streams integration (#2854))
=======
>>>>>>> e24613dc4a (GEOMESA-3100 Kafka layer views (#2784))
=======
>>>>>>> 0cd029fb3b (GEOMESA-3100 Kafka layer views (#2784))
=======
>>>>>>> c61bffed00 (GEOMESA-3100 Kafka layer views (#2784))
=======
>>>>>>> 50a71079c1 (GEOMESA-3100 Kafka layer views (#2784))
=======
>>>>>>> 12f226f36d (GEOMESA-3100 Kafka layer views (#2784))
=======
>>>>>>> 65a3a6e36 (GEOMESA-3100 Kafka layer views (#2784))
>>>>>>> 9e910620b3 (GEOMESA-3100 Kafka layer views (#2784))
=======
>>>>>>> 89f0c9f2c3 (GEOMESA-3100 Kafka layer views (#2784))
=======
>>>>>>> 222e44653b (GEOMESA-3100 Kafka layer views (#2784))
=======
>>>>>>> e7f3e6588 (GEOMESA-3100 Kafka layer views (#2784))
=======
>>>>>>> 4f4ecaeb43 (GEOMESA-3100 Kafka layer views (#2784))
=======
>>>>>>> b4cd5a7733 (GEOMESA-3100 Kafka layer views (#2784))
=======
>>>>>>> 42549e8e3 (GEOMESA-3100 Kafka layer views (#2784))
=======
>>>>>>> 750ebbabe7 (GEOMESA-3100 Kafka layer views (#2784))
=======
>>>>>>> fc4546247e (GEOMESA-3100 Kafka layer views (#2784))
=======
>>>>>>> 30fda14bf2 (GEOMESA-3198 Kafka streams integration (#2854))
=======
>>>>>>> e792102d4b (GEOMESA-3198 Kafka streams integration (#2854))
=======
>>>>>>> 65e544d20e (GEOMESA-3100 Kafka layer views (#2784))
=======
>>>>>>> 8b9e99d11a (GEOMESA-3100 Kafka layer views (#2784))
=======
>>>>>>> c64e652363 (GEOMESA-3100 Kafka layer views (#2784))
=======
>>>>>>> 2834875e9b (GEOMESA-3198 Kafka streams integration (#2854))
=======
>>>>>>> 614fcb6bc3 (GEOMESA-3100 Kafka layer views (#2784))
=======
>>>>>>> 02eb81c815 (GEOMESA-3100 Kafka layer views (#2784))
=======
>>>>>>> 4231e686d (GEOMESA-3100 Kafka layer views (#2784))
>>>>>>> 69e3273ac1 (GEOMESA-3100 Kafka layer views (#2784))
=======
>>>>>>> 43ac4062d9 (GEOMESA-3100 Kafka layer views (#2784))
=======
>>>>>>> cf6eae6fac (GEOMESA-3198 Kafka streams integration (#2854))
=======
>>>>>>> ac0357d36 (GEOMESA-3100 Kafka layer views (#2784))
=======
>>>>>>> 30905e530b (GEOMESA-3100 Kafka layer views (#2784))
=======
>>>>>>> 121a1d3470 (GEOMESA-3100 Kafka layer views (#2784))
=======
>>>>>>> 7b8c9b548 (GEOMESA-3198 Kafka streams integration (#2854))
=======
>>>>>>> bb28efed75 (GEOMESA-3198 Kafka streams integration (#2854))
=======
>>>>>>> 297ca0be9c (GEOMESA-3100 Kafka layer views (#2784))
=======
>>>>>>> 6af71ff43 (GEOMESA-3100 Kafka layer views (#2784))
=======
>>>>>>> 39d28fffcb (GEOMESA-3100 Kafka layer views (#2784))
=======
>>>>>>> 340134cdda (GEOMESA-3100 Kafka layer views (#2784))
=======
>>>>>>> eef10da74 (GEOMESA-3198 Kafka streams integration (#2854))
=======
>>>>>>> 81cb3a1b74 (GEOMESA-3198 Kafka streams integration (#2854))
=======
>>>>>>> ea8384d9b7 (GEOMESA-3100 Kafka layer views (#2784))
=======
>>>>>>> c57b5f538 (GEOMESA-3100 Kafka layer views (#2784))
=======
>>>>>>> fe3378ccaa (GEOMESA-3100 Kafka layer views (#2784))
=======
>>>>>>> 4934cb1a2a (GEOMESA-3198 Kafka streams integration (#2854))
=======
>>>>>>> 88ef67cdf (GEOMESA-3100 Kafka layer views (#2784))
=======
>>>>>>> 79f56900f0 (GEOMESA-3100 Kafka layer views (#2784))
=======
>>>>>>> 72ec0b2107 (GEOMESA-3100 Kafka layer views (#2784))
>>>>>>> d0dc799ff (GEOMESA-3100 Kafka layer views (#2784))
>>>>>>> ffbc2ce32a (GEOMESA-3100 Kafka layer views (#2784))
=======
>>>>>>> 936154130 (GEOMESA-3100 Kafka layer views (#2784))
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
=======
>>>>>>> 121a1d3470 (GEOMESA-3100 Kafka layer views (#2784))
=======
>>>>>>> ea8384d9b7 (GEOMESA-3100 Kafka layer views (#2784))
=======
>>>>>>> fe3378ccaa (GEOMESA-3100 Kafka layer views (#2784))
=======
>>>>>>> 04f82bbc57 (GEOMESA-3100 Kafka layer views (#2784))
=======
>>>>>>> e0773a1bd7 (GEOMESA-3100 Kafka layer views (#2784))
<<<<<<< HEAD
<<<<<<< HEAD
=======
>>>>>>> 826636f69d (GEOMESA-3100 Kafka layer views (#2784))
=======
>>>>>>> 1e11ed51a6 (GEOMESA-3100 Kafka layer views (#2784))
<<<<<<< HEAD
=======
>>>>>>> 222e44653b (GEOMESA-3100 Kafka layer views (#2784))
=======
>>>>>>> 4f4ecaeb43 (GEOMESA-3100 Kafka layer views (#2784))
=======
=======
>>>>>>> 04f82bbc57 (GEOMESA-3100 Kafka layer views (#2784))
>>>>>>> 30905e530b (GEOMESA-3100 Kafka layer views (#2784))
=======
>>>>>>> 121a1d3470 (GEOMESA-3100 Kafka layer views (#2784))
=======
=======
>>>>>>> 826636f69d (GEOMESA-3100 Kafka layer views (#2784))
>>>>>>> ea8384d9b7 (GEOMESA-3100 Kafka layer views (#2784))
=======
>>>>>>> fe3378ccaa (GEOMESA-3100 Kafka layer views (#2784))
>>>>>>> 2f6607232 (GEOMESA-3100 Kafka layer views (#2784))
=======
>>>>>>> fc2f65fc3 (GEOMESA-3198 Kafka streams integration (#2854))
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
=======
>>>>>>> 4934cb1a2a (GEOMESA-3198 Kafka streams integration (#2854))
=======
>>>>>>> 79f56900f0 (GEOMESA-3100 Kafka layer views (#2784))
=======
>>>>>>> 4adaa7f47 (GEOMESA-3100 Kafka layer views (#2784))
=======
>>>>>>> 88ef67cdf (GEOMESA-3100 Kafka layer views (#2784))
=======
<<<<<<< HEAD
>>>>>>> c2a94543ba (GEOMESA-3100 Kafka layer views (#2784))
=======
>>>>>>> bb28efed75 (GEOMESA-3198 Kafka streams integration (#2854))
=======
=======
>>>>>>> 4adaa7f47 (GEOMESA-3100 Kafka layer views (#2784))
>>>>>>> 297ca0be9c (GEOMESA-3100 Kafka layer views (#2784))
=======
=======
>>>>>>> 79f56900f0 (GEOMESA-3100 Kafka layer views (#2784))
>>>>>>> d0dc799ff (GEOMESA-3100 Kafka layer views (#2784))
>>>>>>> ea3b40e18 (GEOMESA-3100 Kafka layer views (#2784))
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
=======
>>>>>>> b4cd5a7733 (GEOMESA-3100 Kafka layer views (#2784))
=======
>>>>>>> 65e544d20e (GEOMESA-3100 Kafka layer views (#2784))
=======
>>>>>>> 297ca0be9c (GEOMESA-3100 Kafka layer views (#2784))
=======
>>>>>>> 79f56900f0 (GEOMESA-3100 Kafka layer views (#2784))
>>>>>>> 581f1dd15 (GEOMESA-3100 Kafka layer views (#2784))
=======
>>>>>>> 1a5f68233 (GEOMESA-3100 Kafka layer views (#2784))
=======
=======
>>>>>>> d0dc799ff (GEOMESA-3100 Kafka layer views (#2784))
>>>>>>> 73767737b (GEOMESA-3100 Kafka layer views (#2784))
=======
<<<<<<< HEAD
<<<<<<< HEAD
=======
>>>>>>> 429ffc55e (GEOMESA-3100 Kafka layer views (#2784))
=======
>>>>>>> 2f6607232 (GEOMESA-3100 Kafka layer views (#2784))
=======
>>>>>>> e7f3e6588 (GEOMESA-3100 Kafka layer views (#2784))
<<<<<<< HEAD
<<<<<<< HEAD
=======
>>>>>>> 6f6887eb8 (GEOMESA-3100 Kafka layer views (#2784))
=======
<<<<<<< HEAD
<<<<<<< HEAD
=======
>>>>>>> ae5eea67f1 (GEOMESA-3100 Kafka layer views (#2784))
=======
>>>>>>> 976f319530 (GEOMESA-3100 Kafka layer views (#2784))
<<<<<<< HEAD
=======
=======
>>>>>>> ae5eea67f1 (GEOMESA-3100 Kafka layer views (#2784))
>>>>>>> 297ca0be9c (GEOMESA-3100 Kafka layer views (#2784))
=======
>>>>>>> 79f56900f0 (GEOMESA-3100 Kafka layer views (#2784))
>>>>>>> 9236b0208 (GEOMESA-3100 Kafka layer views (#2784))
=======
<<<<<<< HEAD
>>>>>>> c1d0543aac (GEOMESA-3100 Kafka layer views (#2784))
=======
>>>>>>> 862857ce2 (GEOMESA-3100 Kafka layer views (#2784))
=======
<<<<<<< HEAD
>>>>>>> 8b9e99d11a (GEOMESA-3100 Kafka layer views (#2784))
=======
>>>>>>> ecbc2cafc (GEOMESA-3198 Kafka streams integration (#2854))
=======
<<<<<<< HEAD
<<<<<<< HEAD
<<<<<<< HEAD
=======
>>>>>>> 02eb81c815 (GEOMESA-3100 Kafka layer views (#2784))
>>>>>>> 41bda2df98 (GEOMESA-3198 Kafka streams integration (#2854))
=======
=======
>>>>>>> d0dc799ff (GEOMESA-3100 Kafka layer views (#2784))
>>>>>>> 28427dfd8 (GEOMESA-3100 Kafka layer views (#2784))
=======
<<<<<<< HEAD
<<<<<<< HEAD
<<<<<<< HEAD
=======
>>>>>>> 30905e530b (GEOMESA-3100 Kafka layer views (#2784))
>>>>>>> 614fcb6bc3 (GEOMESA-3100 Kafka layer views (#2784))
=======
=======
>>>>>>> ac0357d36 (GEOMESA-3100 Kafka layer views (#2784))
<<<<<<< HEAD
<<<<<<< HEAD
<<<<<<< HEAD
=======
>>>>>>> 121a1d3470 (GEOMESA-3100 Kafka layer views (#2784))
>>>>>>> 04f82bbc57 (GEOMESA-3100 Kafka layer views (#2784))
=======
=======
>>>>>>> 2f6607232 (GEOMESA-3100 Kafka layer views (#2784))
=======
>>>>>>> a62b956fb (GEOMESA-3100 Kafka layer views (#2784))
<<<<<<< HEAD
<<<<<<< HEAD
<<<<<<< HEAD
=======
>>>>>>> bb28efed75 (GEOMESA-3198 Kafka streams integration (#2854))
>>>>>>> e0773a1bd7 (GEOMESA-3100 Kafka layer views (#2784))
=======
=======
>>>>>>> 7b8c9b548 (GEOMESA-3198 Kafka streams integration (#2854))
<<<<<<< HEAD
<<<<<<< HEAD
<<<<<<< HEAD
=======
>>>>>>> 297ca0be9c (GEOMESA-3100 Kafka layer views (#2784))
>>>>>>> 5fa4cd5eac (GEOMESA-3198 Kafka streams integration (#2854))
=======
=======
>>>>>>> 4adaa7f47 (GEOMESA-3100 Kafka layer views (#2784))
<<<<<<< HEAD
<<<<<<< HEAD
<<<<<<< HEAD
=======
>>>>>>> ea8384d9b7 (GEOMESA-3100 Kafka layer views (#2784))
>>>>>>> ae5eea67f1 (GEOMESA-3100 Kafka layer views (#2784))
=======
=======
>>>>>>> 54ece16d1 (GEOMESA-3100 Kafka layer views (#2784))
<<<<<<< HEAD
<<<<<<< HEAD
<<<<<<< HEAD
=======
>>>>>>> fe3378ccaa (GEOMESA-3100 Kafka layer views (#2784))
>>>>>>> 826636f69d (GEOMESA-3100 Kafka layer views (#2784))
=======
=======
>>>>>>> 2f6607232 (GEOMESA-3100 Kafka layer views (#2784))
=======
>>>>>>> c57b5f538 (GEOMESA-3100 Kafka layer views (#2784))
<<<<<<< HEAD
<<<<<<< HEAD
<<<<<<< HEAD
=======
>>>>>>> 4934cb1a2a (GEOMESA-3198 Kafka streams integration (#2854))
>>>>>>> 1e11ed51a6 (GEOMESA-3100 Kafka layer views (#2784))
=======
=======
>>>>>>> 8f51e1858 (GEOMESA-3198 Kafka streams integration (#2854))
<<<<<<< HEAD
<<<<<<< HEAD
<<<<<<< HEAD
=======
>>>>>>> 79f56900f0 (GEOMESA-3100 Kafka layer views (#2784))
>>>>>>> 991d5c62a7 (GEOMESA-3198 Kafka streams integration (#2854))
=======
=======
>>>>>>> 88ef67cdf (GEOMESA-3100 Kafka layer views (#2784))
>>>>>>> 976f319530 (GEOMESA-3100 Kafka layer views (#2784))
<<<<<<< HEAD
=======
=======
>>>>>>> 117b13aaaa (GEOMESA-3100 Kafka layer views (#2784))
>>>>>>> d0dc799ff (GEOMESA-3100 Kafka layer views (#2784))
>>>>>>> ffbc2ce32a (GEOMESA-3100 Kafka layer views (#2784))
=======
>>>>>>> 2766fc9b5b (GEOMESA-3100 Kafka layer views (#2784))
=======
>>>>>>> 2f673a268a (GEOMESA-3100 Kafka layer views (#2784))
=======
>>>>>>> 2f6607232 (GEOMESA-3100 Kafka layer views (#2784))
=======
>>>>>>> c44e474495 (GEOMESA-3100 Kafka layer views (#2784))
=======
>>>>>>> 38e75099c5 (GEOMESA-3198 Kafka streams integration (#2854))
=======
>>>>>>> c2a94543ba (GEOMESA-3100 Kafka layer views (#2784))
=======
>>>>>>> 12f226f36d (GEOMESA-3100 Kafka layer views (#2784))
=======
=======
>>>>>>> 429ffc55e (GEOMESA-3100 Kafka layer views (#2784))
>>>>>>> 222e44653b (GEOMESA-3100 Kafka layer views (#2784))
=======
>>>>>>> 4f4ecaeb43 (GEOMESA-3100 Kafka layer views (#2784))
=======
=======
>>>>>>> 6f6887eb8 (GEOMESA-3100 Kafka layer views (#2784))
>>>>>>> b4cd5a7733 (GEOMESA-3100 Kafka layer views (#2784))
=======
>>>>>>> 9236b0208 (GEOMESA-3100 Kafka layer views (#2784))
=======
<<<<<<< HEAD
>>>>>>> c1d0543aac (GEOMESA-3100 Kafka layer views (#2784))
<<<<<<< HEAD
>>>>>>> 65e544d20e (GEOMESA-3100 Kafka layer views (#2784))
=======
=======
>>>>>>> 862857ce2 (GEOMESA-3100 Kafka layer views (#2784))
=======
>>>>>>> 8b9e99d11a (GEOMESA-3100 Kafka layer views (#2784))
>>>>>>> c64e652363 (GEOMESA-3100 Kafka layer views (#2784))
=======
>>>>>>> 41bda2df98 (GEOMESA-3198 Kafka streams integration (#2854))
>>>>>>> 2834875e9b (GEOMESA-3198 Kafka streams integration (#2854))
=======
>>>>>>> 614fcb6bc3 (GEOMESA-3100 Kafka layer views (#2784))
>>>>>>> 02eb81c815 (GEOMESA-3100 Kafka layer views (#2784))
=======
>>>>>>> 04f82bbc57 (GEOMESA-3100 Kafka layer views (#2784))
>>>>>>> 30905e530b (GEOMESA-3100 Kafka layer views (#2784))
=======
>>>>>>> e0773a1bd7 (GEOMESA-3100 Kafka layer views (#2784))
>>>>>>> 121a1d3470 (GEOMESA-3100 Kafka layer views (#2784))
=======
>>>>>>> 5fa4cd5eac (GEOMESA-3198 Kafka streams integration (#2854))
>>>>>>> bb28efed75 (GEOMESA-3198 Kafka streams integration (#2854))
=======
>>>>>>> ae5eea67f1 (GEOMESA-3100 Kafka layer views (#2784))
>>>>>>> 297ca0be9c (GEOMESA-3100 Kafka layer views (#2784))
=======
>>>>>>> 826636f69d (GEOMESA-3100 Kafka layer views (#2784))
>>>>>>> ea8384d9b7 (GEOMESA-3100 Kafka layer views (#2784))
=======
>>>>>>> 1e11ed51a6 (GEOMESA-3100 Kafka layer views (#2784))
>>>>>>> fe3378ccaa (GEOMESA-3100 Kafka layer views (#2784))
=======
>>>>>>> 991d5c62a7 (GEOMESA-3198 Kafka streams integration (#2854))
>>>>>>> 4934cb1a2a (GEOMESA-3198 Kafka streams integration (#2854))
=======
>>>>>>> 79f56900f0 (GEOMESA-3100 Kafka layer views (#2784))
>>>>>>> de758f45a (GEOMESA-3198 Kafka streams integration (#2854))
=======
>>>>>>> 5ca0cd6de (GEOMESA-3100 Kafka layer views (#2784))
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
>>>>>>> 2766fc9b5b (GEOMESA-3100 Kafka layer views (#2784))
=======
>>>>>>> 2f673a268a (GEOMESA-3100 Kafka layer views (#2784))
=======
>>>>>>> c44e474495 (GEOMESA-3100 Kafka layer views (#2784))
=======
>>>>>>> c2a94543ba (GEOMESA-3100 Kafka layer views (#2784))
=======
>>>>>>> 12f226f36d (GEOMESA-3100 Kafka layer views (#2784))
=======
>>>>>>> 222e44653b (GEOMESA-3100 Kafka layer views (#2784))
=======
>>>>>>> 4f4ecaeb43 (GEOMESA-3100 Kafka layer views (#2784))
=======
>>>>>>> b4cd5a7733 (GEOMESA-3100 Kafka layer views (#2784))
=======
>>>>>>> 65e544d20e (GEOMESA-3100 Kafka layer views (#2784))
=======
>>>>>>> c64e652363 (GEOMESA-3100 Kafka layer views (#2784))
=======
>>>>>>> 02eb81c815 (GEOMESA-3100 Kafka layer views (#2784))
=======
>>>>>>> 30905e530b (GEOMESA-3100 Kafka layer views (#2784))
=======
>>>>>>> 121a1d3470 (GEOMESA-3100 Kafka layer views (#2784))
=======
>>>>>>> 297ca0be9c (GEOMESA-3100 Kafka layer views (#2784))
=======
>>>>>>> fb32a36e0e (GEOMESA-3100 Kafka layer views (#2784))
=======
>>>>>>> ea8384d9b7 (GEOMESA-3100 Kafka layer views (#2784))
=======
>>>>>>> fe3378ccaa (GEOMESA-3100 Kafka layer views (#2784))
=======
>>>>>>> 79f56900f0 (GEOMESA-3100 Kafka layer views (#2784))
>>>>>>> f6e840b5dd (GEOMESA-3100 Kafka layer views (#2784))
=======
=======
>>>>>>> ffbc2ce32a (GEOMESA-3100 Kafka layer views (#2784))
=======
<<<<<<< HEAD
<<<<<<< HEAD
>>>>>>> 54ece16d15 (GEOMESA-3100 Kafka layer views (#2784))
=======
>>>>>>> c57b5f538a (GEOMESA-3100 Kafka layer views (#2784))
=======
<<<<<<< HEAD
<<<<<<< HEAD
=======
>>>>>>> e24613dc4a (GEOMESA-3100 Kafka layer views (#2784))
=======
>>>>>>> dae1cf3cef (GEOMESA-3100 Kafka layer views (#2784))
=======
>>>>>>> 50a71079c1 (GEOMESA-3100 Kafka layer views (#2784))
=======
<<<<<<< HEAD
<<<<<<< HEAD
>>>>>>> 4c325746bd (GEOMESA-3100 Kafka layer views (#2784))
=======
>>>>>>> 3ebcdb99d9 (GEOMESA-3100 Kafka layer views (#2784))
=======
<<<<<<< HEAD
<<<<<<< HEAD
>>>>>>> fdf51402cf (GEOMESA-3100 Kafka layer views (#2784))
=======
=======
<<<<<<< HEAD
<<<<<<< HEAD
>>>>>>> 7bdc1feea8 (GEOMESA-3100 Kafka layer views (#2784))
=======
>>>>>>> 9b15c8e14c (GEOMESA-3100 Kafka layer views (#2784))
=======
>>>>>>> 495a1efc9f (GEOMESA-3100 Kafka layer views (#2784))
=======
<<<<<<< HEAD
<<<<<<< HEAD
>>>>>>> 5d8c5baea0 (GEOMESA-3100 Kafka layer views (#2784))
=======
>>>>>>> 7628960f66 (GEOMESA-3100 Kafka layer views (#2784))
=======
<<<<<<< HEAD
<<<<<<< HEAD
>>>>>>> cb4aa55ae3 (GEOMESA-3100 Kafka layer views (#2784))
=======
>>>>>>> 5dd3eb3a6d (GEOMESA-3100 Kafka layer views (#2784))
=======
<<<<<<< HEAD
<<<<<<< HEAD
>>>>>>> d530f7b24a (GEOMESA-3100 Kafka layer views (#2784))
=======
>>>>>>> 5e230912b1 (GEOMESA-3100 Kafka layer views (#2784))
=======
<<<<<<< HEAD
=======
>>>>>>> 7bdc1feea8 (GEOMESA-3100 Kafka layer views (#2784))
=======
<<<<<<< HEAD
>>>>>>> c64e652363 (GEOMESA-3100 Kafka layer views (#2784))
=======
>>>>>>> 9b15c8e14c (GEOMESA-3100 Kafka layer views (#2784))
=======
>>>>>>> 02eb81c815 (GEOMESA-3100 Kafka layer views (#2784))
=======
>>>>>>> 30905e530b (GEOMESA-3100 Kafka layer views (#2784))
=======
>>>>>>> 5d8c5baea0 (GEOMESA-3100 Kafka layer views (#2784))
=======
>>>>>>> 121a1d3470 (GEOMESA-3100 Kafka layer views (#2784))
=======
>>>>>>> 297ca0be9c (GEOMESA-3100 Kafka layer views (#2784))
=======
>>>>>>> cb4aa55ae3 (GEOMESA-3100 Kafka layer views (#2784))
=======
>>>>>>> fb32a36e0e (GEOMESA-3100 Kafka layer views (#2784))
=======
>>>>>>> ea8384d9b7 (GEOMESA-3100 Kafka layer views (#2784))
=======
>>>>>>> d530f7b24a (GEOMESA-3100 Kafka layer views (#2784))
=======
>>>>>>> fe3378ccaa (GEOMESA-3100 Kafka layer views (#2784))
=======
>>>>>>> 79f56900f0 (GEOMESA-3100 Kafka layer views (#2784))
>>>>>>> c1d0543aac (GEOMESA-3100 Kafka layer views (#2784))
>>>>>>> be0c9d161a (GEOMESA-3100 Kafka layer views (#2784))
=======
>>>>>>> 8b9e99d11a (GEOMESA-3100 Kafka layer views (#2784))
=======
<<<<<<< HEAD
>>>>>>> c2a94543ba (GEOMESA-3100 Kafka layer views (#2784))
=======
=======
>>>>>>> fdf51402cf (GEOMESA-3100 Kafka layer views (#2784))
=======
>>>>>>> b4cd5a7733 (GEOMESA-3100 Kafka layer views (#2784))
=======
>>>>>>> c1d0543aac (GEOMESA-3100 Kafka layer views (#2784))
>>>>>>> be0c9d161a (GEOMESA-3100 Kafka layer views (#2784))
=======
>>>>>>> 65e544d20e (GEOMESA-3100 Kafka layer views (#2784))
=======
>>>>>>> c64e652363 (GEOMESA-3100 Kafka layer views (#2784))
>>>>>>> ea3b40e18 (GEOMESA-3100 Kafka layer views (#2784))
>>>>>>> 88ef67cdfe (GEOMESA-3100 Kafka layer views (#2784))
=======
<<<<<<< HEAD
>>>>>>> 73767737b (GEOMESA-3100 Kafka layer views (#2784))
=======
>>>>>>> 429ffc55e (GEOMESA-3100 Kafka layer views (#2784))
=======
>>>>>>> e7f3e6588 (GEOMESA-3100 Kafka layer views (#2784))
=======
=======
>>>>>>> ea3b40e18 (GEOMESA-3100 Kafka layer views (#2784))
>>>>>>> 6f6887eb8 (GEOMESA-3100 Kafka layer views (#2784))
=======
<<<<<<< HEAD
<<<<<<< HEAD
=======
>>>>>>> 04f82bbc57 (GEOMESA-3100 Kafka layer views (#2784))
=======
>>>>>>> e0773a1bd7 (GEOMESA-3100 Kafka layer views (#2784))
=======
>>>>>>> ae5eea67f1 (GEOMESA-3100 Kafka layer views (#2784))
=======
>>>>>>> 2df2640494 (GEOMESA-3100 Kafka layer views (#2784))
=======
>>>>>>> 826636f69d (GEOMESA-3100 Kafka layer views (#2784))
=======
>>>>>>> 1e11ed51a6 (GEOMESA-3100 Kafka layer views (#2784))
=======
>>>>>>> 976f319530 (GEOMESA-3100 Kafka layer views (#2784))
=======
>>>>>>> 02eb81c815 (GEOMESA-3100 Kafka layer views (#2784))
=======
>>>>>>> 04f82bbc57 (GEOMESA-3100 Kafka layer views (#2784))
=======
>>>>>>> e0773a1bd7 (GEOMESA-3100 Kafka layer views (#2784))
=======
>>>>>>> ae5eea67f1 (GEOMESA-3100 Kafka layer views (#2784))
=======
>>>>>>> 2df2640494 (GEOMESA-3100 Kafka layer views (#2784))
=======
>>>>>>> 826636f69d (GEOMESA-3100 Kafka layer views (#2784))
=======
>>>>>>> 1e11ed51a6 (GEOMESA-3100 Kafka layer views (#2784))
=======
>>>>>>> 976f319530 (GEOMESA-3100 Kafka layer views (#2784))
=======
>>>>>>> ea3b40e18 (GEOMESA-3100 Kafka layer views (#2784))
=======
>>>>>>> 28427dfd8 (GEOMESA-3100 Kafka layer views (#2784))
>>>>>>> 614fcb6bc3 (GEOMESA-3100 Kafka layer views (#2784))
=======
<<<<<<< HEAD
<<<<<<< HEAD
>>>>>>> ac0357d36 (GEOMESA-3100 Kafka layer views (#2784))
=======
>>>>>>> a62b956fb (GEOMESA-3100 Kafka layer views (#2784))
=======
<<<<<<< HEAD
<<<<<<< HEAD
=======
>>>>>>> 297ca0be9c (GEOMESA-3100 Kafka layer views (#2784))
=======
>>>>>>> ea3b40e18 (GEOMESA-3100 Kafka layer views (#2784))
>>>>>>> 4adaa7f47 (GEOMESA-3100 Kafka layer views (#2784))
=======
<<<<<<< HEAD
<<<<<<< HEAD
>>>>>>> ffbc2ce32 (GEOMESA-3100 Kafka layer views (#2784))
=======
>>>>>>> 54ece16d1 (GEOMESA-3100 Kafka layer views (#2784))
=======
<<<<<<< HEAD
<<<<<<< HEAD
>>>>>>> c57b5f538 (GEOMESA-3100 Kafka layer views (#2784))
=======
=======
>>>>>>> ea3b40e18 (GEOMESA-3100 Kafka layer views (#2784))
>>>>>>> 88ef67cdf (GEOMESA-3100 Kafka layer views (#2784))
=======
<<<<<<< HEAD
>>>>>>> 0e42c51dc0 (GEOMESA-3100 Kafka layer views (#2784))
=======
=======
>>>>>>> 2766fc9b5b (GEOMESA-3100 Kafka layer views (#2784))
=======
>>>>>>> 54ece16d15 (GEOMESA-3100 Kafka layer views (#2784))
=======
>>>>>>> 2f673a268a (GEOMESA-3100 Kafka layer views (#2784))
=======
>>>>>>> c44e474495 (GEOMESA-3100 Kafka layer views (#2784))
=======
>>>>>>> c2a94543ba (GEOMESA-3100 Kafka layer views (#2784))
=======
=======
>>>>>>> 4c325746bd (GEOMESA-3100 Kafka layer views (#2784))
=======
>>>>>>> 222e44653b (GEOMESA-3100 Kafka layer views (#2784))
=======
>>>>>>> 4f4ecaeb43 (GEOMESA-3100 Kafka layer views (#2784))
>>>>>>> ea3b40e18 (GEOMESA-3100 Kafka layer views (#2784))
>>>>>>> 88ef67cdfe (GEOMESA-3100 Kafka layer views (#2784))
=======
>>>>>>> 73767737b (GEOMESA-3100 Kafka layer views (#2784))
=======
<<<<<<< HEAD
>>>>>>> 12f226f36d (GEOMESA-3100 Kafka layer views (#2784))
=======
>>>>>>> 429ffc55e (GEOMESA-3100 Kafka layer views (#2784))
=======
<<<<<<< HEAD
>>>>>>> 222e44653b (GEOMESA-3100 Kafka layer views (#2784))
=======
>>>>>>> e7f3e6588 (GEOMESA-3100 Kafka layer views (#2784))
=======
>>>>>>> 4f4ecaeb43 (GEOMESA-3100 Kafka layer views (#2784))
=======
>>>>>>> b4cd5a7733 (GEOMESA-3100 Kafka layer views (#2784))
=======
>>>>>>> 02eb81c815 (GEOMESA-3100 Kafka layer views (#2784))
=======
>>>>>>> ac0357d36 (GEOMESA-3100 Kafka layer views (#2784))
=======
>>>>>>> 30905e530b (GEOMESA-3100 Kafka layer views (#2784))
=======
>>>>>>> 121a1d3470 (GEOMESA-3100 Kafka layer views (#2784))
=======
>>>>>>> 297ca0be9c (GEOMESA-3100 Kafka layer views (#2784))
=======
>>>>>>> ffbc2ce32 (GEOMESA-3100 Kafka layer views (#2784))
=======
>>>>>>> fb32a36e0e (GEOMESA-3100 Kafka layer views (#2784))
=======
>>>>>>> ea8384d9b7 (GEOMESA-3100 Kafka layer views (#2784))
=======
>>>>>>> c57b5f538 (GEOMESA-3100 Kafka layer views (#2784))
=======
>>>>>>> fe3378ccaa (GEOMESA-3100 Kafka layer views (#2784))
=======
>>>>>>> 79f56900f0 (GEOMESA-3100 Kafka layer views (#2784))
>>>>>>> bddfdbea5 (GEOMESA-3100 Kafka layer views (#2784))
<<<<<<< HEAD
>>>>>>> c589b832a5 (GEOMESA-3100 Kafka layer views (#2784))
=======
=======
=======
>>>>>>> de758f45a (GEOMESA-3198 Kafka streams integration (#2854))
>>>>>>> 4e12cd412 (GEOMESA-3198 Kafka streams integration (#2854))
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
>>>>>>> 38e75099c5 (GEOMESA-3198 Kafka streams integration (#2854))
=======
>>>>>>> c2a94543ba (GEOMESA-3100 Kafka layer views (#2784))
=======
>>>>>>> 12f226f36d (GEOMESA-3100 Kafka layer views (#2784))
=======
>>>>>>> b4cd5a7733 (GEOMESA-3100 Kafka layer views (#2784))
=======
>>>>>>> 2834875e9b (GEOMESA-3198 Kafka streams integration (#2854))
=======
>>>>>>> 02eb81c815 (GEOMESA-3100 Kafka layer views (#2784))
=======
>>>>>>> bb28efed75 (GEOMESA-3198 Kafka streams integration (#2854))
=======
>>>>>>> 297ca0be9c (GEOMESA-3100 Kafka layer views (#2784))
=======
>>>>>>> fb32a36e0e (GEOMESA-3100 Kafka layer views (#2784))
=======
>>>>>>> 4934cb1a2a (GEOMESA-3198 Kafka streams integration (#2854))
=======
>>>>>>> 79f56900f0 (GEOMESA-3100 Kafka layer views (#2784))
>>>>>>> 29a2fa060e (GEOMESA-3198 Kafka streams integration (#2854))
=======
=======
>>>>>>> 8f51e18588 (GEOMESA-3198 Kafka streams integration (#2854))
=======
<<<<<<< HEAD
<<<<<<< HEAD
>>>>>>> 88ef67cdfe (GEOMESA-3100 Kafka layer views (#2784))
=======
>>>>>>> 50a71079c1 (GEOMESA-3100 Kafka layer views (#2784))
=======
<<<<<<< HEAD
<<<<<<< HEAD
=======
>>>>>>> 965120b3ca (GEOMESA-3198 Kafka streams integration (#2854))
=======
>>>>>>> 9b15c8e14c (GEOMESA-3100 Kafka layer views (#2784))
=======
>>>>>>> 8ce502793e (GEOMESA-3198 Kafka streams integration (#2854))
=======
>>>>>>> 7628960f66 (GEOMESA-3100 Kafka layer views (#2784))
=======
>>>>>>> cb4aa55ae3 (GEOMESA-3100 Kafka layer views (#2784))
=======
>>>>>>> 55438fd78b (GEOMESA-3198 Kafka streams integration (#2854))
=======
>>>>>>> 5e230912b1 (GEOMESA-3100 Kafka layer views (#2784))
=======
>>>>>>> b4cd5a7733 (GEOMESA-3100 Kafka layer views (#2784))
=======
>>>>>>> 965120b3ca (GEOMESA-3198 Kafka streams integration (#2854))
=======
>>>>>>> 9b15c8e14c (GEOMESA-3100 Kafka layer views (#2784))
=======
>>>>>>> 8ce502793e (GEOMESA-3198 Kafka streams integration (#2854))
=======
>>>>>>> 7628960f66 (GEOMESA-3100 Kafka layer views (#2784))
=======
>>>>>>> cb4aa55ae3 (GEOMESA-3100 Kafka layer views (#2784))
=======
>>>>>>> 55438fd78b (GEOMESA-3198 Kafka streams integration (#2854))
=======
>>>>>>> 5e230912b1 (GEOMESA-3100 Kafka layer views (#2784))
=======
>>>>>>> 6f6887eb8 (GEOMESA-3100 Kafka layer views (#2784))
>>>>>>> fdf51402cf (GEOMESA-3100 Kafka layer views (#2784))
=======
<<<<<<< HEAD
<<<<<<< HEAD
>>>>>>> 41bda2df98 (GEOMESA-3198 Kafka streams integration (#2854))
=======
>>>>>>> 614fcb6bc3 (GEOMESA-3100 Kafka layer views (#2784))
=======
<<<<<<< HEAD
<<<<<<< HEAD
=======
>>>>>>> ae5eea67f1 (GEOMESA-3100 Kafka layer views (#2784))
=======
>>>>>>> 2df2640494 (GEOMESA-3100 Kafka layer views (#2784))
=======
>>>>>>> 991d5c62a7 (GEOMESA-3198 Kafka streams integration (#2854))
=======
>>>>>>> 976f319530 (GEOMESA-3100 Kafka layer views (#2784))
=======
>>>>>>> bb28efed75 (GEOMESA-3198 Kafka streams integration (#2854))
=======
>>>>>>> ae5eea67f1 (GEOMESA-3100 Kafka layer views (#2784))
=======
>>>>>>> 2df2640494 (GEOMESA-3100 Kafka layer views (#2784))
=======
>>>>>>> 991d5c62a7 (GEOMESA-3198 Kafka streams integration (#2854))
=======
>>>>>>> 976f319530 (GEOMESA-3100 Kafka layer views (#2784))
=======
>>>>>>> 7b8c9b548 (GEOMESA-3198 Kafka streams integration (#2854))
>>>>>>> 5fa4cd5eac (GEOMESA-3198 Kafka streams integration (#2854))
=======
<<<<<<< HEAD
<<<<<<< HEAD
>>>>>>> 4adaa7f47 (GEOMESA-3100 Kafka layer views (#2784))
=======
>>>>>>> 8f51e1858 (GEOMESA-3198 Kafka streams integration (#2854))
=======
<<<<<<< HEAD
<<<<<<< HEAD
>>>>>>> 88ef67cdf (GEOMESA-3100 Kafka layer views (#2784))
=======
=======
>>>>>>> 38e75099c5 (GEOMESA-3198 Kafka streams integration (#2854))
=======
>>>>>>> 88ef67cdfe (GEOMESA-3100 Kafka layer views (#2784))
=======
>>>>>>> c2a94543ba (GEOMESA-3100 Kafka layer views (#2784))
=======
>>>>>>> 12f226f36d (GEOMESA-3100 Kafka layer views (#2784))
=======
>>>>>>> b4cd5a7733 (GEOMESA-3100 Kafka layer views (#2784))
=======
>>>>>>> 41bda2df98 (GEOMESA-3198 Kafka streams integration (#2854))
=======
>>>>>>> 2834875e9b (GEOMESA-3198 Kafka streams integration (#2854))
=======
>>>>>>> 02eb81c815 (GEOMESA-3100 Kafka layer views (#2784))
=======
>>>>>>> bb28efed75 (GEOMESA-3198 Kafka streams integration (#2854))
=======
>>>>>>> 4adaa7f47 (GEOMESA-3100 Kafka layer views (#2784))
=======
>>>>>>> 297ca0be9c (GEOMESA-3100 Kafka layer views (#2784))
=======
>>>>>>> 4934cb1a2a (GEOMESA-3198 Kafka streams integration (#2854))
=======
>>>>>>> 88ef67cdf (GEOMESA-3100 Kafka layer views (#2784))
=======
>>>>>>> 79f56900f0 (GEOMESA-3100 Kafka layer views (#2784))
>>>>>>> d0dc799ff (GEOMESA-3100 Kafka layer views (#2784))
<<<<<<< HEAD
>>>>>>> ffbc2ce32a (GEOMESA-3100 Kafka layer views (#2784))
=======
=======
>>>>>>> 95c83ca7f (GEOMESA-3100 Kafka layer views (#2784))
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
>>>>>>> 89f0c9f2c3 (GEOMESA-3100 Kafka layer views (#2784))
=======
>>>>>>> cf6eae6fac (GEOMESA-3198 Kafka streams integration (#2854))
=======
>>>>>>> 340134cdda (GEOMESA-3100 Kafka layer views (#2784))
=======
>>>>>>> 81cb3a1b74 (GEOMESA-3198 Kafka streams integration (#2854))
>>>>>>> fa68dd43c6 (GEOMESA-3100 Kafka layer views (#2784))
=======
=======
>>>>>>> 9e910620b3 (GEOMESA-3100 Kafka layer views (#2784))
=======
<<<<<<< HEAD
=======
>>>>>>> 468da42855 (GEOMESA-3100 Kafka layer views (#2784))
=======
>>>>>>> 320fc0eff4 (GEOMESA-3198 Kafka streams integration (#2854))
=======
>>>>>>> 3be3e5d3e (GEOMESA-3198 Kafka streams integration (#2854))
>>>>>>> ec680351e0 (GEOMESA-3198 Kafka streams integration (#2854))
=======
>>>>>>> eef10da74 (GEOMESA-3198 Kafka streams integration (#2854))
=======
=======
>>>>>>> 89f0c9f2c3 (GEOMESA-3100 Kafka layer views (#2784))
=======
>>>>>>> 468da42855 (GEOMESA-3100 Kafka layer views (#2784))
=======
>>>>>>> 320fc0eff4 (GEOMESA-3198 Kafka streams integration (#2854))
=======
>>>>>>> 3be3e5d3e (GEOMESA-3198 Kafka streams integration (#2854))
>>>>>>> ec680351e0 (GEOMESA-3198 Kafka streams integration (#2854))
=======
>>>>>>> eef10da74 (GEOMESA-3198 Kafka streams integration (#2854))
=======
=======
>>>>>>> de758f45a (GEOMESA-3198 Kafka streams integration (#2854))
>>>>>>> d657014c8 (GEOMESA-3198 Kafka streams integration (#2854))
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
>>>>>>> cf6eae6fac (GEOMESA-3198 Kafka streams integration (#2854))
=======
>>>>>>> 30905e530b (GEOMESA-3100 Kafka layer views (#2784))
=======
>>>>>>> 81cb3a1b74 (GEOMESA-3198 Kafka streams integration (#2854))
=======
>>>>>>> ea8384d9b7 (GEOMESA-3100 Kafka layer views (#2784))
>>>>>>> eef10da741 (GEOMESA-3198 Kafka streams integration (#2854))
=======
=======
>>>>>>> ec680351e0 (GEOMESA-3198 Kafka streams integration (#2854))
=======
<<<<<<< HEAD
<<<<<<< HEAD
>>>>>>> 495a1efc9f (GEOMESA-3100 Kafka layer views (#2784))
=======
>>>>>>> 320fc0eff4 (GEOMESA-3198 Kafka streams integration (#2854))
=======
<<<<<<< HEAD
<<<<<<< HEAD
>>>>>>> 5dd3eb3a6d (GEOMESA-3100 Kafka layer views (#2784))
=======
=======
>>>>>>> cf6eae6fac (GEOMESA-3198 Kafka streams integration (#2854))
=======
>>>>>>> 495a1efc9f (GEOMESA-3100 Kafka layer views (#2784))
=======
>>>>>>> 30905e530b (GEOMESA-3100 Kafka layer views (#2784))
=======
>>>>>>> 81cb3a1b74 (GEOMESA-3198 Kafka streams integration (#2854))
=======
>>>>>>> 5dd3eb3a6d (GEOMESA-3100 Kafka layer views (#2784))
=======
>>>>>>> ea8384d9b7 (GEOMESA-3100 Kafka layer views (#2784))
>>>>>>> 936154130 (GEOMESA-3100 Kafka layer views (#2784))
<<<<<<< HEAD
<<<<<<< HEAD
<<<<<<< HEAD
<<<<<<< HEAD
<<<<<<< HEAD
=======
>>>>>>> 222e44653b (GEOMESA-3100 Kafka layer views (#2784))
=======
>>>>>>> 4f4ecaeb43 (GEOMESA-3100 Kafka layer views (#2784))
>>>>>>> 54ece16d15 (GEOMESA-3100 Kafka layer views (#2784))
=======
=======
>>>>>>> 4c325746bd (GEOMESA-3100 Kafka layer views (#2784))
=======
<<<<<<< HEAD
=======
>>>>>>> e7f3e6588 (GEOMESA-3100 Kafka layer views (#2784))
>>>>>>> 3ebcdb99d9 (GEOMESA-3100 Kafka layer views (#2784))
=======
=======
>>>>>>> 222e44653b (GEOMESA-3100 Kafka layer views (#2784))
=======
>>>>>>> e7f3e6588 (GEOMESA-3100 Kafka layer views (#2784))
>>>>>>> 3ebcdb99d9 (GEOMESA-3100 Kafka layer views (#2784))
=======
=======
>>>>>>> bddfdbea5 (GEOMESA-3100 Kafka layer views (#2784))
>>>>>>> 2f6607232 (GEOMESA-3100 Kafka layer views (#2784))
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
>>>>>>> 4f4ecaeb43 (GEOMESA-3100 Kafka layer views (#2784))
=======
>>>>>>> bb28efed75 (GEOMESA-3198 Kafka streams integration (#2854))
=======
>>>>>>> fe3378ccaa (GEOMESA-3100 Kafka layer views (#2784))
=======
>>>>>>> 4934cb1a2a (GEOMESA-3198 Kafka streams integration (#2854))
>>>>>>> c57b5f538a (GEOMESA-3100 Kafka layer views (#2784))
=======
=======
>>>>>>> 3ebcdb99d9 (GEOMESA-3100 Kafka layer views (#2784))
=======
<<<<<<< HEAD
<<<<<<< HEAD
>>>>>>> 8ce502793e (GEOMESA-3198 Kafka streams integration (#2854))
=======
>>>>>>> d530f7b24a (GEOMESA-3100 Kafka layer views (#2784))
=======
<<<<<<< HEAD
<<<<<<< HEAD
>>>>>>> 55438fd78b (GEOMESA-3198 Kafka streams integration (#2854))
=======
=======
>>>>>>> 4f4ecaeb43 (GEOMESA-3100 Kafka layer views (#2784))
=======
>>>>>>> 8ce502793e (GEOMESA-3198 Kafka streams integration (#2854))
=======
>>>>>>> bb28efed75 (GEOMESA-3198 Kafka streams integration (#2854))
=======
>>>>>>> fe3378ccaa (GEOMESA-3100 Kafka layer views (#2784))
=======
>>>>>>> 55438fd78b (GEOMESA-3198 Kafka streams integration (#2854))
=======
>>>>>>> 4934cb1a2a (GEOMESA-3198 Kafka streams integration (#2854))
>>>>>>> fc2f65fc3 (GEOMESA-3198 Kafka streams integration (#2854))
<<<<<<< HEAD
>>>>>>> 8f51e18588 (GEOMESA-3198 Kafka streams integration (#2854))
=======
=======
=======
>>>>>>> d0dc799ff (GEOMESA-3100 Kafka layer views (#2784))
>>>>>>> ea3b40e18 (GEOMESA-3100 Kafka layer views (#2784))
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
>>>>>>> b4cd5a7733 (GEOMESA-3100 Kafka layer views (#2784))
=======
>>>>>>> 750ebbabe7 (GEOMESA-3100 Kafka layer views (#2784))
=======
>>>>>>> 297ca0be9c (GEOMESA-3100 Kafka layer views (#2784))
=======
>>>>>>> 39d28fffcb (GEOMESA-3100 Kafka layer views (#2784))
=======
>>>>>>> 79f56900f0 (GEOMESA-3100 Kafka layer views (#2784))
=======
>>>>>>> 72ec0b2107 (GEOMESA-3100 Kafka layer views (#2784))
>>>>>>> 88ef67cdfe (GEOMESA-3100 Kafka layer views (#2784))
=======
=======
>>>>>>> fdf51402cf (GEOMESA-3100 Kafka layer views (#2784))
=======
<<<<<<< HEAD
<<<<<<< HEAD
>>>>>>> a377061090 (GEOMESA-3100 Kafka layer views (#2784))
=======
=======
<<<<<<< HEAD
<<<<<<< HEAD
>>>>>>> 416a95a4c0 (GEOMESA-3100 Kafka layer views (#2784))
=======
>>>>>>> 5e230912b1 (GEOMESA-3100 Kafka layer views (#2784))
=======
>>>>>>> f340d6feab (GEOMESA-3100 Kafka layer views (#2784))
=======
<<<<<<< HEAD
=======
>>>>>>> 416a95a4c0 (GEOMESA-3100 Kafka layer views (#2784))
=======
<<<<<<< HEAD
>>>>>>> 39d28fffcb (GEOMESA-3100 Kafka layer views (#2784))
=======
>>>>>>> 5e230912b1 (GEOMESA-3100 Kafka layer views (#2784))
=======
>>>>>>> 79f56900f0 (GEOMESA-3100 Kafka layer views (#2784))
=======
>>>>>>> 72ec0b2107 (GEOMESA-3100 Kafka layer views (#2784))
>>>>>>> ae5eea67f1 (GEOMESA-3100 Kafka layer views (#2784))
>>>>>>> 7628960f66 (GEOMESA-3100 Kafka layer views (#2784))
=======
>>>>>>> 23a7d9849f (GEOMESA-3100 Kafka layer views (#2784))
=======
<<<<<<< HEAD
<<<<<<< HEAD
>>>>>>> 976f319530 (GEOMESA-3100 Kafka layer views (#2784))
=======
>>>>>>> bc97b07a31 (GEOMESA-3100 Kafka layer views (#2784))
=======
<<<<<<< HEAD
=======
>>>>>>> b4cd5a7733 (GEOMESA-3100 Kafka layer views (#2784))
=======
>>>>>>> a377061090 (GEOMESA-3100 Kafka layer views (#2784))
=======
>>>>>>> 750ebbabe7 (GEOMESA-3100 Kafka layer views (#2784))
=======
>>>>>>> ae5eea67f1 (GEOMESA-3100 Kafka layer views (#2784))
>>>>>>> 7628960f66 (GEOMESA-3100 Kafka layer views (#2784))
=======
>>>>>>> 297ca0be9c (GEOMESA-3100 Kafka layer views (#2784))
=======
>>>>>>> 39d28fffcb (GEOMESA-3100 Kafka layer views (#2784))
=======
>>>>>>> 976f319530 (GEOMESA-3100 Kafka layer views (#2784))
=======
>>>>>>> 79f56900f0 (GEOMESA-3100 Kafka layer views (#2784))
=======
>>>>>>> 72ec0b2107 (GEOMESA-3100 Kafka layer views (#2784))
>>>>>>> d2cb939f5 (GEOMESA-3100 Kafka layer views (#2784))
<<<<<<< HEAD
>>>>>>> 89fb9950ef (GEOMESA-3100 Kafka layer views (#2784))
=======
=======
>>>>>>> 3be8d2a5a (Merge branch 'feature/postgis-fixes')
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
>>>>>>> 638b68d081 (Merge branch 'feature/postgis-fixes')
=======
>>>>>>> fc4546247e (GEOMESA-3100 Kafka layer views (#2784))
=======
>>>>>>> 71adb695c5 (Merge branch 'feature/postgis-fixes')
=======
>>>>>>> 30559ea5c9 (Merge branch 'feature/postgis-fixes')
>>>>>>> 1b25d7ddb4 (Merge branch 'feature/postgis-fixes')
=======
=======
>>>>>>> e944f1c88b (Merge branch 'feature/postgis-fixes')
=======
<<<<<<< HEAD
<<<<<<< HEAD
>>>>>>> eddb4eaca1 (GEOMESA-3100 Kafka layer views (#2784))
=======
>>>>>>> 26e5afc4ea (Merge branch 'feature/postgis-fixes')
=======
<<<<<<< HEAD
<<<<<<< HEAD
>>>>>>> c69897d7bd (Merge branch 'feature/postgis-fixes')
=======
=======
>>>>>>> 638b68d081 (Merge branch 'feature/postgis-fixes')
=======
>>>>>>> eddb4eaca1 (GEOMESA-3100 Kafka layer views (#2784))
=======
>>>>>>> fc4546247e (GEOMESA-3100 Kafka layer views (#2784))
=======
>>>>>>> 71adb695c5 (Merge branch 'feature/postgis-fixes')
=======
>>>>>>> c69897d7bd (Merge branch 'feature/postgis-fixes')
=======
>>>>>>> 30559ea5c9 (Merge branch 'feature/postgis-fixes')
>>>>>>> eecabb92a (GEOMESA-3100 Kafka layer views (#2784))
<<<<<<< HEAD
>>>>>>> 98e7bf59d2 (GEOMESA-3100 Kafka layer views (#2784))
=======
=======
=======
>>>>>>> de758f45a (GEOMESA-3198 Kafka streams integration (#2854))
>>>>>>> f01ac238e (GEOMESA-3198 Kafka streams integration (#2854))
<<<<<<< HEAD
>>>>>>> 0b3e844fc4 (GEOMESA-3198 Kafka streams integration (#2854))
=======
=======
>>>>>>> 581f1dd15 (GEOMESA-3100 Kafka layer views (#2784))
<<<<<<< HEAD
>>>>>>> e24613dc4a (GEOMESA-3100 Kafka layer views (#2784))
=======
=======
=======
>>>>>>> bddfdbea5 (GEOMESA-3100 Kafka layer views (#2784))
>>>>>>> 1a5f68233 (GEOMESA-3100 Kafka layer views (#2784))
<<<<<<< HEAD
>>>>>>> dae1cf3cef (GEOMESA-3100 Kafka layer views (#2784))
=======
=======
=======
>>>>>>> d0dc799ff (GEOMESA-3100 Kafka layer views (#2784))
>>>>>>> 73767737b (GEOMESA-3100 Kafka layer views (#2784))
<<<<<<< HEAD
<<<<<<< HEAD
<<<<<<< HEAD
=======
>>>>>>> 89f0c9f2c3 (GEOMESA-3100 Kafka layer views (#2784))
>>>>>>> 50a71079c1 (GEOMESA-3100 Kafka layer views (#2784))
=======
=======
>>>>>>> 65a3a6e36 (GEOMESA-3100 Kafka layer views (#2784))
<<<<<<< HEAD
<<<<<<< HEAD
<<<<<<< HEAD
=======
>>>>>>> 222e44653b (GEOMESA-3100 Kafka layer views (#2784))
>>>>>>> 9e910620b3 (GEOMESA-3100 Kafka layer views (#2784))
=======
=======
>>>>>>> 429ffc55e (GEOMESA-3100 Kafka layer views (#2784))
<<<<<<< HEAD
<<<<<<< HEAD
<<<<<<< HEAD
=======
>>>>>>> 4f4ecaeb43 (GEOMESA-3100 Kafka layer views (#2784))
>>>>>>> 4c325746bd (GEOMESA-3100 Kafka layer views (#2784))
=======
=======
>>>>>>> e7f3e6588 (GEOMESA-3100 Kafka layer views (#2784))
<<<<<<< HEAD
<<<<<<< HEAD
<<<<<<< HEAD
=======
>>>>>>> b4cd5a7733 (GEOMESA-3100 Kafka layer views (#2784))
>>>>>>> 3ebcdb99d9 (GEOMESA-3100 Kafka layer views (#2784))
=======
=======
>>>>>>> 6f6887eb8 (GEOMESA-3100 Kafka layer views (#2784))
<<<<<<< HEAD
<<<<<<< HEAD
<<<<<<< HEAD
=======
>>>>>>> 750ebbabe7 (GEOMESA-3100 Kafka layer views (#2784))
>>>>>>> fdf51402cf (GEOMESA-3100 Kafka layer views (#2784))
=======
=======
=======
>>>>>>> d2cb939f5 (GEOMESA-3100 Kafka layer views (#2784))
>>>>>>> 42549e8e3 (GEOMESA-3100 Kafka layer views (#2784))
<<<<<<< HEAD
<<<<<<< HEAD
<<<<<<< HEAD
=======
>>>>>>> 638b68d081 (Merge branch 'feature/postgis-fixes')
>>>>>>> a377061090 (GEOMESA-3100 Kafka layer views (#2784))
=======
=======
>>>>>>> e8cc4971c6 (Merge branch 'feature/postgis-fixes')
<<<<<<< HEAD
<<<<<<< HEAD
<<<<<<< HEAD
=======
>>>>>>> fc4546247e (GEOMESA-3100 Kafka layer views (#2784))
>>>>>>> e944f1c88b (Merge branch 'feature/postgis-fixes')
=======
=======
=======
<<<<<<< HEAD
<<<<<<< HEAD
>>>>>>> cb6bda89b6 (Merge branch 'feature/postgis-fixes')
=======
>>>>>>> 699117eca9 (Merge branch 'feature/postgis-fixes')
=======
<<<<<<< HEAD
=======
>>>>>>> cb6bda89b6 (Merge branch 'feature/postgis-fixes')
=======
>>>>>>> 71adb695c5 (Merge branch 'feature/postgis-fixes')
=======
>>>>>>> 30559ea5c9 (Merge branch 'feature/postgis-fixes')
>>>>>>> a0314fb7f (GEOMESA-3100 Kafka layer views (#2784))
<<<<<<< HEAD
>>>>>>> 8ed2c9f7e5 (GEOMESA-3100 Kafka layer views (#2784))
<<<<<<< HEAD
>>>>>>> eddb4eaca1 (GEOMESA-3100 Kafka layer views (#2784))
=======
=======
=======
=======
>>>>>>> de758f45a (GEOMESA-3198 Kafka streams integration (#2854))
>>>>>>> 1b8cbf843 (GEOMESA-3198 Kafka streams integration (#2854))
<<<<<<< HEAD
<<<<<<< HEAD
>>>>>>> 30fda14bf2 (GEOMESA-3198 Kafka streams integration (#2854))
<<<<<<< HEAD
>>>>>>> 8d7834ec11 (GEOMESA-3198 Kafka streams integration (#2854))
=======
=======
=======
>>>>>>> 9236b0208 (GEOMESA-3100 Kafka layer views (#2784))
<<<<<<< HEAD
<<<<<<< HEAD
>>>>>>> c1d0543aac (GEOMESA-3100 Kafka layer views (#2784))
<<<<<<< HEAD
>>>>>>> be0c9d161a (GEOMESA-3100 Kafka layer views (#2784))
=======
=======
=======
=======
>>>>>>> bddfdbea5 (GEOMESA-3100 Kafka layer views (#2784))
>>>>>>> 862857ce2 (GEOMESA-3100 Kafka layer views (#2784))
<<<<<<< HEAD
<<<<<<< HEAD
>>>>>>> 8b9e99d11a (GEOMESA-3100 Kafka layer views (#2784))
<<<<<<< HEAD
>>>>>>> 7bdc1feea8 (GEOMESA-3100 Kafka layer views (#2784))
=======
=======
=======
>>>>>>> ecbc2cafc (GEOMESA-3198 Kafka streams integration (#2854))
<<<<<<< HEAD
<<<<<<< HEAD
>>>>>>> 41bda2df98 (GEOMESA-3198 Kafka streams integration (#2854))
<<<<<<< HEAD
>>>>>>> 965120b3ca (GEOMESA-3198 Kafka streams integration (#2854))
=======
=======
=======
=======
>>>>>>> d0dc799ff (GEOMESA-3100 Kafka layer views (#2784))
>>>>>>> 28427dfd8 (GEOMESA-3100 Kafka layer views (#2784))
<<<<<<< HEAD
<<<<<<< HEAD
>>>>>>> 614fcb6bc3 (GEOMESA-3100 Kafka layer views (#2784))
<<<<<<< HEAD
>>>>>>> 9b15c8e14c (GEOMESA-3100 Kafka layer views (#2784))
=======
=======
=======
>>>>>>> 4231e686d (GEOMESA-3100 Kafka layer views (#2784))
<<<<<<< HEAD
<<<<<<< HEAD
>>>>>>> 69e3273ac1 (GEOMESA-3100 Kafka layer views (#2784))
<<<<<<< HEAD
>>>>>>> 3977ecc140 (GEOMESA-3100 Kafka layer views (#2784))
=======
=======
=======
>>>>>>> 3be3e5d3e (GEOMESA-3198 Kafka streams integration (#2854))
<<<<<<< HEAD
<<<<<<< HEAD
>>>>>>> d98371fa50 (GEOMESA-3198 Kafka streams integration (#2854))
<<<<<<< HEAD
>>>>>>> ec680351e0 (GEOMESA-3198 Kafka streams integration (#2854))
=======
=======
=======
=======
>>>>>>> 936154130 (GEOMESA-3100 Kafka layer views (#2784))
>>>>>>> ac0357d36 (GEOMESA-3100 Kafka layer views (#2784))
<<<<<<< HEAD
<<<<<<< HEAD
>>>>>>> 04f82bbc57 (GEOMESA-3100 Kafka layer views (#2784))
<<<<<<< HEAD
>>>>>>> 495a1efc9f (GEOMESA-3100 Kafka layer views (#2784))
=======
=======
=======
>>>>>>> a62b956fb (GEOMESA-3100 Kafka layer views (#2784))
<<<<<<< HEAD
<<<<<<< HEAD
>>>>>>> e0773a1bd7 (GEOMESA-3100 Kafka layer views (#2784))
<<<<<<< HEAD
>>>>>>> 5d8c5baea0 (GEOMESA-3100 Kafka layer views (#2784))
=======
=======
=======
=======
>>>>>>> fc2f65fc3 (GEOMESA-3198 Kafka streams integration (#2854))
>>>>>>> 7b8c9b548 (GEOMESA-3198 Kafka streams integration (#2854))
<<<<<<< HEAD
<<<<<<< HEAD
>>>>>>> 5fa4cd5eac (GEOMESA-3198 Kafka streams integration (#2854))
<<<<<<< HEAD
>>>>>>> 8ce502793e (GEOMESA-3198 Kafka streams integration (#2854))
=======
=======
=======
>>>>>>> 4adaa7f47 (GEOMESA-3100 Kafka layer views (#2784))
<<<<<<< HEAD
<<<<<<< HEAD
>>>>>>> ae5eea67f1 (GEOMESA-3100 Kafka layer views (#2784))
<<<<<<< HEAD
>>>>>>> 7628960f66 (GEOMESA-3100 Kafka layer views (#2784))
=======
=======
=======
=======
>>>>>>> d2cb939f5 (GEOMESA-3100 Kafka layer views (#2784))
>>>>>>> 6af71ff43 (GEOMESA-3100 Kafka layer views (#2784))
<<<<<<< HEAD
<<<<<<< HEAD
>>>>>>> 23a7d9849f (GEOMESA-3100 Kafka layer views (#2784))
<<<<<<< HEAD
>>>>>>> 416a95a4c0 (GEOMESA-3100 Kafka layer views (#2784))
=======
=======
=======
>>>>>>> db8d998aa (Merge branch 'feature/postgis-fixes')
<<<<<<< HEAD
<<<<<<< HEAD
>>>>>>> cb6bda89b6 (Merge branch 'feature/postgis-fixes')
<<<<<<< HEAD
>>>>>>> 26e5afc4ea (Merge branch 'feature/postgis-fixes')
=======
=======
=======
>>>>>>> d845d7c1b (GEOMESA-3254 Add Bloop build support)
<<<<<<< HEAD
<<<<<<< HEAD
>>>>>>> 09d87762c5 (GEOMESA-3254 Add Bloop build support)
<<<<<<< HEAD
>>>>>>> 63a045a753 (GEOMESA-3254 Add Bloop build support)
=======
=======
=======
>>>>>>> 17f13b3a7 (GEOMESA-3100 Kafka layer views (#2784))
<<<<<<< HEAD
<<<<<<< HEAD
>>>>>>> 6069aba6b4 (GEOMESA-3100 Kafka layer views (#2784))
<<<<<<< HEAD
>>>>>>> ccfb3bd95e (GEOMESA-3100 Kafka layer views (#2784))
=======
=======
=======
=======
>>>>>>> de758f45a (GEOMESA-3198 Kafka streams integration (#2854))
>>>>>>> 73f3a8cb6 (GEOMESA-3198 Kafka streams integration (#2854))
<<<<<<< HEAD
<<<<<<< HEAD
>>>>>>> c6591bc391 (GEOMESA-3198 Kafka streams integration (#2854))
<<<<<<< HEAD
>>>>>>> 4ae16a2980 (GEOMESA-3198 Kafka streams integration (#2854))
=======
=======
=======
=======
>>>>>>> c589b832a (GEOMESA-3100 Kafka layer views (#2784))
=======
<<<<<<< HEAD
<<<<<<< HEAD
>>>>>>> 29a2fa060 (GEOMESA-3198 Kafka streams integration (#2854))
=======
>>>>>>> 12fe94b860 (GEOMESA-3100 Kafka layer views (#2784))
=======
>>>>>>> 90a582b4a6 (GEOMESA-3198 Kafka streams integration (#2854))
=======
>>>>>>> 936154130 (GEOMESA-3100 Kafka layer views (#2784))
=======
>>>>>>> 2f6607232 (GEOMESA-3100 Kafka layer views (#2784))
=======
>>>>>>> fc2f65fc3 (GEOMESA-3198 Kafka streams integration (#2854))
=======
=======
>>>>>>> d0dc799ff (GEOMESA-3100 Kafka layer views (#2784))
>>>>>>> ea3b40e18 (GEOMESA-3100 Kafka layer views (#2784))
=======
>>>>>>> 581f1dd15 (GEOMESA-3100 Kafka layer views (#2784))
=======
>>>>>>> 1a5f68233 (GEOMESA-3100 Kafka layer views (#2784))
=======
>>>>>>> de758f45a (GEOMESA-3198 Kafka streams integration (#2854))
=======
>>>>>>> 5ca0cd6de (GEOMESA-3100 Kafka layer views (#2784))
<<<<<<< HEAD
<<<<<<< HEAD
<<<<<<< HEAD
<<<<<<< HEAD
<<<<<<< HEAD
<<<<<<< HEAD
<<<<<<< HEAD
>>>>>>> f6e840b5d (GEOMESA-3100 Kafka layer views (#2784))
<<<<<<< HEAD
>>>>>>> 4480b2d1b9 (GEOMESA-3100 Kafka layer views (#2784))
<<<<<<< HEAD
>>>>>>> b5abc19ca4 (GEOMESA-3100 Kafka layer views (#2784))
=======
=======
>>>>>>> c61bffed00 (GEOMESA-3100 Kafka layer views (#2784))
<<<<<<< HEAD
>>>>>>> f6e840b5dd (GEOMESA-3100 Kafka layer views (#2784))
>>>>>>> 0cd029fb3b (GEOMESA-3100 Kafka layer views (#2784))
=======
=======
=======
=======
>>>>>>> 626c8f9b93 (GEOMESA-3100 Kafka layer views (#2784))
=======
>>>>>>> 9a5d6d2815 (GEOMESA-3100 Kafka layer views (#2784))
=======
=======
>>>>>>> e24613dc4a (GEOMESA-3100 Kafka layer views (#2784))
=======
>>>>>>> dae1cf3cef (GEOMESA-3100 Kafka layer views (#2784))
=======
>>>>>>> ea3b40e18 (GEOMESA-3100 Kafka layer views (#2784))
>>>>>>> f4b2369e9a (GEOMESA-3100 Kafka layer views (#2784))
=======
>>>>>>> bddfdbea5 (GEOMESA-3100 Kafka layer views (#2784))
<<<<<<< HEAD
<<<<<<< HEAD
>>>>>>> c589b832a (GEOMESA-3100 Kafka layer views (#2784))
<<<<<<< HEAD
>>>>>>> 9e433ba57e (GEOMESA-3100 Kafka layer views (#2784))
<<<<<<< HEAD
>>>>>>> 2750a5beef (GEOMESA-3100 Kafka layer views (#2784))
=======
=======
=======
=======
>>>>>>> 90a582b4a6 (GEOMESA-3198 Kafka streams integration (#2854))
=======
=======
>>>>>>> de758f45a (GEOMESA-3198 Kafka streams integration (#2854))
>>>>>>> 4e12cd412 (GEOMESA-3198 Kafka streams integration (#2854))
<<<<<<< HEAD
<<<<<<< HEAD
<<<<<<< HEAD
>>>>>>> 29a2fa060 (GEOMESA-3198 Kafka streams integration (#2854))
<<<<<<< HEAD
>>>>>>> 69fb98522c (GEOMESA-3198 Kafka streams integration (#2854))
<<<<<<< HEAD
>>>>>>> 3a0eb62fc5 (GEOMESA-3198 Kafka streams integration (#2854))
=======
=======
=======
=======
>>>>>>> f716dd05cb (GEOMESA-3198 Kafka streams integration (#2854))
=======
>>>>>>> f4b2369e9a (GEOMESA-3100 Kafka layer views (#2784))
=======
>>>>>>> d0dc799ff (GEOMESA-3100 Kafka layer views (#2784))
<<<<<<< HEAD
>>>>>>> ffbc2ce32 (GEOMESA-3100 Kafka layer views (#2784))
<<<<<<< HEAD
>>>>>>> 2df2640494 (GEOMESA-3100 Kafka layer views (#2784))
<<<<<<< HEAD
>>>>>>> cb4aa55ae3 (GEOMESA-3100 Kafka layer views (#2784))
=======
=======
=======
>>>>>>> fa68dd43c (GEOMESA-3100 Kafka layer views (#2784))
<<<<<<< HEAD
>>>>>>> 23f312535d (GEOMESA-3100 Kafka layer views (#2784))
<<<<<<< HEAD
>>>>>>> 468da42855 (GEOMESA-3100 Kafka layer views (#2784))
=======
=======
=======
>>>>>>> eef10da74 (GEOMESA-3198 Kafka streams integration (#2854))
<<<<<<< HEAD
<<<<<<< HEAD
>>>>>>> 769842a4bf (GEOMESA-3198 Kafka streams integration (#2854))
<<<<<<< HEAD
>>>>>>> 320fc0eff4 (GEOMESA-3198 Kafka streams integration (#2854))
=======
=======
=======
=======
>>>>>>> 936154130 (GEOMESA-3100 Kafka layer views (#2784))
>>>>>>> 54ece16d1 (GEOMESA-3100 Kafka layer views (#2784))
<<<<<<< HEAD
<<<<<<< HEAD
>>>>>>> 826636f69d (GEOMESA-3100 Kafka layer views (#2784))
<<<<<<< HEAD
>>>>>>> 5dd3eb3a6d (GEOMESA-3100 Kafka layer views (#2784))
=======
=======
=======
>>>>>>> c57b5f538 (GEOMESA-3100 Kafka layer views (#2784))
<<<<<<< HEAD
<<<<<<< HEAD
>>>>>>> 1e11ed51a6 (GEOMESA-3100 Kafka layer views (#2784))
<<<<<<< HEAD
>>>>>>> d530f7b24a (GEOMESA-3100 Kafka layer views (#2784))
=======
=======
=======
=======
>>>>>>> fc2f65fc3 (GEOMESA-3198 Kafka streams integration (#2854))
>>>>>>> 8f51e1858 (GEOMESA-3198 Kafka streams integration (#2854))
<<<<<<< HEAD
<<<<<<< HEAD
>>>>>>> 991d5c62a7 (GEOMESA-3198 Kafka streams integration (#2854))
<<<<<<< HEAD
>>>>>>> 55438fd78b (GEOMESA-3198 Kafka streams integration (#2854))
=======
=======
=======
>>>>>>> 88ef67cdf (GEOMESA-3100 Kafka layer views (#2784))
<<<<<<< HEAD
<<<<<<< HEAD
>>>>>>> 976f319530 (GEOMESA-3100 Kafka layer views (#2784))
<<<<<<< HEAD
>>>>>>> 5e230912b1 (GEOMESA-3100 Kafka layer views (#2784))
=======
=======
=======
=======
>>>>>>> d2cb939f5 (GEOMESA-3100 Kafka layer views (#2784))
>>>>>>> 89fb9950e (GEOMESA-3100 Kafka layer views (#2784))
<<<<<<< HEAD
<<<<<<< HEAD
>>>>>>> bc97b07a31 (GEOMESA-3100 Kafka layer views (#2784))
<<<<<<< HEAD
>>>>>>> f340d6feab (GEOMESA-3100 Kafka layer views (#2784))
=======
=======
=======
>>>>>>> 1b25d7ddb (Merge branch 'feature/postgis-fixes')
>>>>>>> 699117eca9 (Merge branch 'feature/postgis-fixes')
>>>>>>> c69897d7bd (Merge branch 'feature/postgis-fixes')
=======
>>>>>>> 337ecd16e5 (GEOMESA-3100 Kafka layer views (#2784))
<<<<<<< HEAD
<<<<<<< HEAD
=======
>>>>>>> f9df175e9b (GEOMESA-3198 Kafka streams integration (#2854))
=======
=======
>>>>>>> de758f45a (GEOMESA-3198 Kafka streams integration (#2854))
>>>>>>> b09307f5c0 (GEOMESA-3198 Kafka streams integration (#2854))
<<<<<<< HEAD
=======
=======
>>>>>>> de758f45a (GEOMESA-3198 Kafka streams integration (#2854))
=======
>>>>>>> 5ca0cd6de (GEOMESA-3100 Kafka layer views (#2784))
>>>>>>> 64646d61ed (GEOMESA-3100 Kafka layer views (#2784))
=======
=======
>>>>>>> bddfdbea5 (GEOMESA-3100 Kafka layer views (#2784))
>>>>>>> 12fe94b860 (GEOMESA-3100 Kafka layer views (#2784))
=======
>>>>>>> 90a582b4a6 (GEOMESA-3198 Kafka streams integration (#2854))
=======
=======
>>>>>>> d0dc799ff (GEOMESA-3100 Kafka layer views (#2784))
>>>>>>> 0e42c51dc0 (GEOMESA-3100 Kafka layer views (#2784))
=======
=======
>>>>>>> 95c83ca7f (GEOMESA-3100 Kafka layer views (#2784))
<<<<<<< HEAD
>>>>>>> 19aa61c0de (GEOMESA-3100 Kafka layer views (#2784))
=======
=======
=======
>>>>>>> de758f45a (GEOMESA-3198 Kafka streams integration (#2854))
>>>>>>> d657014c8 (GEOMESA-3198 Kafka streams integration (#2854))
<<<<<<< HEAD
>>>>>>> 60bcd014c8 (GEOMESA-3198 Kafka streams integration (#2854))
=======
=======
>>>>>>> 936154130 (GEOMESA-3100 Kafka layer views (#2784))
<<<<<<< HEAD
>>>>>>> 626c8f9b93 (GEOMESA-3100 Kafka layer views (#2784))
=======
=======
=======
>>>>>>> bddfdbea5 (GEOMESA-3100 Kafka layer views (#2784))
>>>>>>> 2f6607232 (GEOMESA-3100 Kafka layer views (#2784))
<<<<<<< HEAD
>>>>>>> 9a5d6d2815 (GEOMESA-3100 Kafka layer views (#2784))
=======
=======
>>>>>>> fc2f65fc3 (GEOMESA-3198 Kafka streams integration (#2854))
<<<<<<< HEAD
>>>>>>> f716dd05cb (GEOMESA-3198 Kafka streams integration (#2854))
=======
=======
=======
>>>>>>> d0dc799ff (GEOMESA-3100 Kafka layer views (#2784))
>>>>>>> ea3b40e18 (GEOMESA-3100 Kafka layer views (#2784))
<<<<<<< HEAD
>>>>>>> f4b2369e9a (GEOMESA-3100 Kafka layer views (#2784))
=======
=======
>>>>>>> d2cb939f5 (GEOMESA-3100 Kafka layer views (#2784))
<<<<<<< HEAD
>>>>>>> 305a9263eb (GEOMESA-3100 Kafka layer views (#2784))
=======
=======
>>>>>>> 3be8d2a5a (Merge branch 'feature/postgis-fixes')
>>>>>>> da00c7bd68 (Merge branch 'feature/postgis-fixes')
=======
=======
>>>>>>> 03f3e71921 (GEOMESA-3198 Kafka streams integration (#2854))
=======
=======
>>>>>>> 5ca0cd6de5 (GEOMESA-3100 Kafka layer views (#2784))
>>>>>>> 770d928c15 (GEOMESA-3100 Kafka layer views (#2784))
=======
  @volatile
  private var producerInitialized = false

<<<<<<< HEAD
>>>>>>> af0a88eb17 (GEOMESA-3100 Kafka layer views (#2784))
<<<<<<< HEAD
>>>>>>> c860f21098 (GEOMESA-3100 Kafka layer views (#2784))
=======
=======
>>>>>>> de758f45a6 (GEOMESA-3198 Kafka streams integration (#2854))
<<<<<<< HEAD
>>>>>>> 03f3e71921 (GEOMESA-3198 Kafka streams integration (#2854))
=======
=======
>>>>>>> af0a88eb1 (GEOMESA-3100 Kafka layer views (#2784))
>>>>>>> 5ca0cd6de5 (GEOMESA-3100 Kafka layer views (#2784))
>>>>>>> 770d928c15 (GEOMESA-3100 Kafka layer views (#2784))
=======
>>>>>>> 5dc1f86700 (GEOMESA-3100 Kafka layer views (#2784))
=======
>>>>>>> e01cda38b4 (GEOMESA-3198 Kafka streams integration (#2854))
=======
=======
=======
>>>>>>> de758f45a (GEOMESA-3198 Kafka streams integration (#2854))
=======
>>>>>>> 5ca0cd6de (GEOMESA-3100 Kafka layer views (#2784))
>>>>>>> d0dc799ff1 (GEOMESA-3100 Kafka layer views (#2784))
<<<<<<< HEAD
>>>>>>> 808743e257 (GEOMESA-3100 Kafka layer views (#2784))
=======
=======
>>>>>>> af0a88eb1 (GEOMESA-3100 Kafka layer views (#2784))
>>>>>>> 95c83ca7fa (GEOMESA-3100 Kafka layer views (#2784))
<<<<<<< HEAD
>>>>>>> ad0d29873e (GEOMESA-3100 Kafka layer views (#2784))
=======
=======
=======
>>>>>>> de758f45a (GEOMESA-3198 Kafka streams integration (#2854))
>>>>>>> d657014c83 (GEOMESA-3198 Kafka streams integration (#2854))
>>>>>>> 1c64e1adc3 (GEOMESA-3198 Kafka streams integration (#2854))
=======
>>>>>>> 0a0bf0292e (GEOMESA-3100 Kafka layer views (#2784))
=======
=======
=======
>>>>>>> ea3b40e187 (GEOMESA-3100 Kafka layer views (#2784))
=======
>>>>>>> bddfdbea5 (GEOMESA-3100 Kafka layer views (#2784))
<<<<<<< HEAD
>>>>>>> 2f66072323 (GEOMESA-3100 Kafka layer views (#2784))
<<<<<<< HEAD
>>>>>>> f43f8303d3 (GEOMESA-3100 Kafka layer views (#2784))
=======
=======
=======
=======
>>>>>>> de758f45a (GEOMESA-3198 Kafka streams integration (#2854))
>>>>>>> 4e12cd412 (GEOMESA-3198 Kafka streams integration (#2854))
<<<<<<< HEAD
>>>>>>> fc2f65fc3b (GEOMESA-3198 Kafka streams integration (#2854))
<<<<<<< HEAD
>>>>>>> 6415d35ab4 (GEOMESA-3198 Kafka streams integration (#2854))
=======
=======
=======
>>>>>>> d0dc799ff (GEOMESA-3100 Kafka layer views (#2784))
>>>>>>> ea3b40e187 (GEOMESA-3100 Kafka layer views (#2784))
<<<<<<< HEAD
>>>>>>> 6368ee48e8 (GEOMESA-3100 Kafka layer views (#2784))
=======
=======
>>>>>>> af0a88eb1 (GEOMESA-3100 Kafka layer views (#2784))
>>>>>>> d2cb939f51 (GEOMESA-3100 Kafka layer views (#2784))
<<<<<<< HEAD
>>>>>>> 4516873dab (GEOMESA-3100 Kafka layer views (#2784))
=======
=======
>>>>>>> 3be8d2a5a4 (Merge branch 'feature/postgis-fixes')
<<<<<<< HEAD
>>>>>>> 34472778d3 (Merge branch 'feature/postgis-fixes')
=======
=======
>>>>>>> af0a88eb1 (GEOMESA-3100 Kafka layer views (#2784))
>>>>>>> a0314fb7ff (GEOMESA-3100 Kafka layer views (#2784))
>>>>>>> 8ec26b8c2a (GEOMESA-3100 Kafka layer views (#2784))
=======
>>>>>>> 030cd33877 (GEOMESA-3198 Kafka streams integration (#2854))
=======
>>>>>>> 4b0dd3e513 (GEOMESA-3100 Kafka layer views (#2784))
=======
>>>>>>> 6e453fd3d0 (GEOMESA-3100 Kafka layer views (#2784))
=======
=======
>>>>>>> ecbc2cafc2 (GEOMESA-3198 Kafka streams integration (#2854))
>>>>>>> f90a7718ef (GEOMESA-3198 Kafka streams integration (#2854))
=======
>>>>>>> f187a4fcf9 (GEOMESA-3100 Kafka layer views (#2784))
=======
=======
=======
>>>>>>> 95c83ca7f (GEOMESA-3100 Kafka layer views (#2784))
<<<<<<< HEAD
>>>>>>> 4231e686dd (GEOMESA-3100 Kafka layer views (#2784))
<<<<<<< HEAD
>>>>>>> d309fbbbbf (GEOMESA-3100 Kafka layer views (#2784))
=======
=======
=======
=======
>>>>>>> de758f45a (GEOMESA-3198 Kafka streams integration (#2854))
>>>>>>> d657014c8 (GEOMESA-3198 Kafka streams integration (#2854))
>>>>>>> 3be3e5d3e0 (GEOMESA-3198 Kafka streams integration (#2854))
>>>>>>> 88e1e7d3ff (GEOMESA-3198 Kafka streams integration (#2854))
=======
>>>>>>> ac0357d362 (GEOMESA-3100 Kafka layer views (#2784))
>>>>>>> d76a495d83 (GEOMESA-3100 Kafka layer views (#2784))
=======
>>>>>>> a62b956fb6 (GEOMESA-3100 Kafka layer views (#2784))
>>>>>>> bbc8576d19 (GEOMESA-3100 Kafka layer views (#2784))
=======
>>>>>>> 7b8c9b548a (GEOMESA-3198 Kafka streams integration (#2854))
>>>>>>> 63ce2ed3e4 (GEOMESA-3198 Kafka streams integration (#2854))
=======
>>>>>>> 4adaa7f479 (GEOMESA-3100 Kafka layer views (#2784))
>>>>>>> d3b123117a (GEOMESA-3100 Kafka layer views (#2784))
=======
>>>>>>> 6af71ff432 (GEOMESA-3100 Kafka layer views (#2784))
>>>>>>> 885048dd7d (GEOMESA-3100 Kafka layer views (#2784))
=======
>>>>>>> 42e8565e9b (Merge branch 'feature/postgis-fixes')
=======
=======
>>>>>>> d845d7c1bd (GEOMESA-3254 Add Bloop build support)
>>>>>>> f1532f2313 (GEOMESA-3254 Add Bloop build support)
=======
>>>>>>> 17f13b3a7a (GEOMESA-3100 Kafka layer views (#2784))
>>>>>>> 3010fc384e (GEOMESA-3100 Kafka layer views (#2784))
=======
=======
>>>>>>> 1c99a27679 (GEOMESA-3100 Kafka layer views (#2784))
>>>>>>> 17f13b3a7a (GEOMESA-3100 Kafka layer views (#2784))
=======
=======
>>>>>>> de758f45a (GEOMESA-3198 Kafka streams integration (#2854))
>>>>>>> 73f3a8cb69 (GEOMESA-3198 Kafka streams integration (#2854))
<<<<<<< HEAD
>>>>>>> d4a13604e7 (GEOMESA-3198 Kafka streams integration (#2854))
=======
=======
=======
=======
>>>>>>> 92dc7a8411 (GEOMESA-3100 Kafka layer views (#2784))
=======
>>>>>>> 29a2fa060e (GEOMESA-3198 Kafka streams integration (#2854))
=======
>>>>>>> 5d02b8e414 (GEOMESA-3198 Kafka streams integration (#2854))
>>>>>>> de758f45a (GEOMESA-3198 Kafka streams integration (#2854))
=======
>>>>>>> 5ca0cd6de (GEOMESA-3100 Kafka layer views (#2784))
<<<<<<< HEAD
>>>>>>> f6e840b5dd (GEOMESA-3100 Kafka layer views (#2784))
<<<<<<< HEAD
>>>>>>> 1c99a27679 (GEOMESA-3100 Kafka layer views (#2784))
=======
=======
=======
>>>>>>> bddfdbea5 (GEOMESA-3100 Kafka layer views (#2784))
<<<<<<< HEAD
>>>>>>> c589b832a5 (GEOMESA-3100 Kafka layer views (#2784))
<<<<<<< HEAD
>>>>>>> 92dc7a8411 (GEOMESA-3100 Kafka layer views (#2784))
=======
=======
=======
=======
>>>>>>> de758f45a (GEOMESA-3198 Kafka streams integration (#2854))
>>>>>>> 4e12cd412 (GEOMESA-3198 Kafka streams integration (#2854))
>>>>>>> 29a2fa060e (GEOMESA-3198 Kafka streams integration (#2854))
>>>>>>> 5d02b8e414 (GEOMESA-3198 Kafka streams integration (#2854))
=======
>>>>>>> 29a2fa060e (GEOMESA-3198 Kafka streams integration (#2854))
=======
=======
>>>>>>> d0dc799ff (GEOMESA-3100 Kafka layer views (#2784))
<<<<<<< HEAD
>>>>>>> ffbc2ce32a (GEOMESA-3100 Kafka layer views (#2784))
<<<<<<< HEAD
>>>>>>> 2766fc9b5b (GEOMESA-3100 Kafka layer views (#2784))
=======
=======
=======
>>>>>>> 95c83ca7f (GEOMESA-3100 Kafka layer views (#2784))
>>>>>>> fa68dd43c6 (GEOMESA-3100 Kafka layer views (#2784))
>>>>>>> de8804123e (GEOMESA-3100 Kafka layer views (#2784))
=======
>>>>>>> fa68dd43c6 (GEOMESA-3100 Kafka layer views (#2784))
=======
=======
=======
>>>>>>> de758f45a (GEOMESA-3198 Kafka streams integration (#2854))
>>>>>>> d657014c8 (GEOMESA-3198 Kafka streams integration (#2854))
<<<<<<< HEAD
>>>>>>> eef10da741 (GEOMESA-3198 Kafka streams integration (#2854))
<<<<<<< HEAD
>>>>>>> 7442d73a4d (GEOMESA-3198 Kafka streams integration (#2854))
=======
=======
=======
>>>>>>> 936154130 (GEOMESA-3100 Kafka layer views (#2784))
<<<<<<< HEAD
>>>>>>> 54ece16d15 (GEOMESA-3100 Kafka layer views (#2784))
<<<<<<< HEAD
>>>>>>> 2f673a268a (GEOMESA-3100 Kafka layer views (#2784))
=======
=======
=======
=======
>>>>>>> bddfdbea5 (GEOMESA-3100 Kafka layer views (#2784))
>>>>>>> 2f6607232 (GEOMESA-3100 Kafka layer views (#2784))
<<<<<<< HEAD
>>>>>>> c57b5f538a (GEOMESA-3100 Kafka layer views (#2784))
<<<<<<< HEAD
>>>>>>> c44e474495 (GEOMESA-3100 Kafka layer views (#2784))
=======
=======
=======
>>>>>>> fc2f65fc3 (GEOMESA-3198 Kafka streams integration (#2854))
<<<<<<< HEAD
>>>>>>> 8f51e18588 (GEOMESA-3198 Kafka streams integration (#2854))
<<<<<<< HEAD
>>>>>>> 38e75099c5 (GEOMESA-3198 Kafka streams integration (#2854))
=======
=======
=======
=======
>>>>>>> d0dc799ff (GEOMESA-3100 Kafka layer views (#2784))
>>>>>>> ea3b40e18 (GEOMESA-3100 Kafka layer views (#2784))
<<<<<<< HEAD
>>>>>>> 88ef67cdfe (GEOMESA-3100 Kafka layer views (#2784))
<<<<<<< HEAD
>>>>>>> c2a94543ba (GEOMESA-3100 Kafka layer views (#2784))
=======
=======
=======
>>>>>>> d2cb939f5 (GEOMESA-3100 Kafka layer views (#2784))
<<<<<<< HEAD
>>>>>>> 89fb9950ef (GEOMESA-3100 Kafka layer views (#2784))
<<<<<<< HEAD
>>>>>>> 117b13aaaa (GEOMESA-3100 Kafka layer views (#2784))
=======
=======
=======
>>>>>>> 3be8d2a5a (Merge branch 'feature/postgis-fixes')
<<<<<<< HEAD
>>>>>>> 1b25d7ddb4 (Merge branch 'feature/postgis-fixes')
<<<<<<< HEAD
>>>>>>> 67de3c3202 (Merge branch 'feature/postgis-fixes')
=======
=======
=======
>>>>>>> eecabb92a (GEOMESA-3100 Kafka layer views (#2784))
<<<<<<< HEAD
>>>>>>> 98e7bf59d2 (GEOMESA-3100 Kafka layer views (#2784))
<<<<<<< HEAD
>>>>>>> cf457d8543 (GEOMESA-3100 Kafka layer views (#2784))
=======
=======
=======
=======
>>>>>>> de758f45a (GEOMESA-3198 Kafka streams integration (#2854))
>>>>>>> f01ac238e (GEOMESA-3198 Kafka streams integration (#2854))
<<<<<<< HEAD
>>>>>>> 0b3e844fc4 (GEOMESA-3198 Kafka streams integration (#2854))
<<<<<<< HEAD
>>>>>>> e2a2dd4c2e (GEOMESA-3198 Kafka streams integration (#2854))
=======
=======
=======
>>>>>>> 581f1dd15 (GEOMESA-3100 Kafka layer views (#2784))
<<<<<<< HEAD
>>>>>>> e24613dc4a (GEOMESA-3100 Kafka layer views (#2784))
<<<<<<< HEAD
>>>>>>> 0cd029fb3b (GEOMESA-3100 Kafka layer views (#2784))
=======
=======
=======
=======
>>>>>>> bddfdbea5 (GEOMESA-3100 Kafka layer views (#2784))
>>>>>>> 1a5f68233 (GEOMESA-3100 Kafka layer views (#2784))
>>>>>>> dae1cf3cef (GEOMESA-3100 Kafka layer views (#2784))
>>>>>>> c61bffed00 (GEOMESA-3100 Kafka layer views (#2784))
=======
>>>>>>> 50a71079c1 (GEOMESA-3100 Kafka layer views (#2784))
>>>>>>> 12f226f36d (GEOMESA-3100 Kafka layer views (#2784))
=======
>>>>>>> 9e910620b3 (GEOMESA-3100 Kafka layer views (#2784))
>>>>>>> 89f0c9f2c3 (GEOMESA-3100 Kafka layer views (#2784))
=======
>>>>>>> 4c325746bd (GEOMESA-3100 Kafka layer views (#2784))
>>>>>>> 222e44653b (GEOMESA-3100 Kafka layer views (#2784))
=======
>>>>>>> 3ebcdb99d9 (GEOMESA-3100 Kafka layer views (#2784))
>>>>>>> 4f4ecaeb43 (GEOMESA-3100 Kafka layer views (#2784))
=======
>>>>>>> fdf51402cf (GEOMESA-3100 Kafka layer views (#2784))
>>>>>>> b4cd5a7733 (GEOMESA-3100 Kafka layer views (#2784))
=======
>>>>>>> a377061090 (GEOMESA-3100 Kafka layer views (#2784))
>>>>>>> 750ebbabe7 (GEOMESA-3100 Kafka layer views (#2784))
=======
>>>>>>> e944f1c88b (Merge branch 'feature/postgis-fixes')
>>>>>>> 638b68d081 (Merge branch 'feature/postgis-fixes')
=======
>>>>>>> a0314fb7f (GEOMESA-3100 Kafka layer views (#2784))
<<<<<<< HEAD
>>>>>>> 8ed2c9f7e5 (GEOMESA-3100 Kafka layer views (#2784))
<<<<<<< HEAD
>>>>>>> eddb4eaca1 (GEOMESA-3100 Kafka layer views (#2784))
<<<<<<< HEAD
>>>>>>> fc4546247e (GEOMESA-3100 Kafka layer views (#2784))
=======
=======
=======
=======
=======
>>>>>>> de758f45a (GEOMESA-3198 Kafka streams integration (#2854))
>>>>>>> 1b8cbf843 (GEOMESA-3198 Kafka streams integration (#2854))
=======
>>>>>>> 65e544d20e (GEOMESA-3100 Kafka layer views (#2784))
>>>>>>> 30fda14bf2 (GEOMESA-3198 Kafka streams integration (#2854))
<<<<<<< HEAD
>>>>>>> 8d7834ec11 (GEOMESA-3198 Kafka streams integration (#2854))
<<<<<<< HEAD
>>>>>>> e792102d4b (GEOMESA-3198 Kafka streams integration (#2854))
=======
=======
=======
=======
>>>>>>> 9236b0208 (GEOMESA-3100 Kafka layer views (#2784))
=======
>>>>>>> c64e652363 (GEOMESA-3100 Kafka layer views (#2784))
>>>>>>> c1d0543aac (GEOMESA-3100 Kafka layer views (#2784))
<<<<<<< HEAD
>>>>>>> be0c9d161a (GEOMESA-3100 Kafka layer views (#2784))
<<<<<<< HEAD
>>>>>>> 65e544d20e (GEOMESA-3100 Kafka layer views (#2784))
=======
=======
=======
=======
=======
>>>>>>> bddfdbea5 (GEOMESA-3100 Kafka layer views (#2784))
>>>>>>> 862857ce2 (GEOMESA-3100 Kafka layer views (#2784))
=======
>>>>>>> 2834875e9b (GEOMESA-3198 Kafka streams integration (#2854))
>>>>>>> 8b9e99d11a (GEOMESA-3100 Kafka layer views (#2784))
<<<<<<< HEAD
>>>>>>> 7bdc1feea8 (GEOMESA-3100 Kafka layer views (#2784))
<<<<<<< HEAD
>>>>>>> c64e652363 (GEOMESA-3100 Kafka layer views (#2784))
=======
=======
=======
=======
>>>>>>> ecbc2cafc (GEOMESA-3198 Kafka streams integration (#2854))
=======
>>>>>>> 02eb81c815 (GEOMESA-3100 Kafka layer views (#2784))
>>>>>>> 41bda2df98 (GEOMESA-3198 Kafka streams integration (#2854))
<<<<<<< HEAD
>>>>>>> 965120b3ca (GEOMESA-3198 Kafka streams integration (#2854))
<<<<<<< HEAD
>>>>>>> 2834875e9b (GEOMESA-3198 Kafka streams integration (#2854))
=======
=======
=======
=======
=======
>>>>>>> d0dc799ff (GEOMESA-3100 Kafka layer views (#2784))
>>>>>>> 28427dfd8 (GEOMESA-3100 Kafka layer views (#2784))
=======
>>>>>>> 43ac4062d9 (GEOMESA-3100 Kafka layer views (#2784))
>>>>>>> 614fcb6bc3 (GEOMESA-3100 Kafka layer views (#2784))
<<<<<<< HEAD
>>>>>>> 9b15c8e14c (GEOMESA-3100 Kafka layer views (#2784))
<<<<<<< HEAD
>>>>>>> 02eb81c815 (GEOMESA-3100 Kafka layer views (#2784))
=======
=======
=======
=======
>>>>>>> 4231e686d (GEOMESA-3100 Kafka layer views (#2784))
=======
>>>>>>> cf6eae6fac (GEOMESA-3198 Kafka streams integration (#2854))
>>>>>>> 69e3273ac1 (GEOMESA-3100 Kafka layer views (#2784))
<<<<<<< HEAD
>>>>>>> 3977ecc140 (GEOMESA-3100 Kafka layer views (#2784))
<<<<<<< HEAD
>>>>>>> 43ac4062d9 (GEOMESA-3100 Kafka layer views (#2784))
=======
=======
=======
=======
>>>>>>> 3be3e5d3e (GEOMESA-3198 Kafka streams integration (#2854))
=======
>>>>>>> 30905e530b (GEOMESA-3100 Kafka layer views (#2784))
>>>>>>> d98371fa50 (GEOMESA-3198 Kafka streams integration (#2854))
<<<<<<< HEAD
>>>>>>> ec680351e0 (GEOMESA-3198 Kafka streams integration (#2854))
<<<<<<< HEAD
>>>>>>> cf6eae6fac (GEOMESA-3198 Kafka streams integration (#2854))
=======
=======
=======
=======
=======
>>>>>>> 936154130 (GEOMESA-3100 Kafka layer views (#2784))
>>>>>>> ac0357d36 (GEOMESA-3100 Kafka layer views (#2784))
=======
>>>>>>> 121a1d3470 (GEOMESA-3100 Kafka layer views (#2784))
>>>>>>> 04f82bbc57 (GEOMESA-3100 Kafka layer views (#2784))
<<<<<<< HEAD
>>>>>>> 495a1efc9f (GEOMESA-3100 Kafka layer views (#2784))
<<<<<<< HEAD
>>>>>>> 30905e530b (GEOMESA-3100 Kafka layer views (#2784))
=======
=======
=======
=======
>>>>>>> a62b956fb (GEOMESA-3100 Kafka layer views (#2784))
=======
>>>>>>> bb28efed75 (GEOMESA-3198 Kafka streams integration (#2854))
>>>>>>> e0773a1bd7 (GEOMESA-3100 Kafka layer views (#2784))
<<<<<<< HEAD
>>>>>>> 5d8c5baea0 (GEOMESA-3100 Kafka layer views (#2784))
<<<<<<< HEAD
>>>>>>> 121a1d3470 (GEOMESA-3100 Kafka layer views (#2784))
=======
=======
=======
=======
=======
>>>>>>> fc2f65fc3 (GEOMESA-3198 Kafka streams integration (#2854))
>>>>>>> 7b8c9b548 (GEOMESA-3198 Kafka streams integration (#2854))
=======
>>>>>>> 297ca0be9c (GEOMESA-3100 Kafka layer views (#2784))
>>>>>>> 5fa4cd5eac (GEOMESA-3198 Kafka streams integration (#2854))
<<<<<<< HEAD
>>>>>>> 8ce502793e (GEOMESA-3198 Kafka streams integration (#2854))
<<<<<<< HEAD
>>>>>>> bb28efed75 (GEOMESA-3198 Kafka streams integration (#2854))
=======
=======
=======
=======
>>>>>>> 4adaa7f47 (GEOMESA-3100 Kafka layer views (#2784))
=======
>>>>>>> 39d28fffcb (GEOMESA-3100 Kafka layer views (#2784))
>>>>>>> ae5eea67f1 (GEOMESA-3100 Kafka layer views (#2784))
<<<<<<< HEAD
>>>>>>> 7628960f66 (GEOMESA-3100 Kafka layer views (#2784))
<<<<<<< HEAD
>>>>>>> 297ca0be9c (GEOMESA-3100 Kafka layer views (#2784))
=======
=======
=======
=======
=======
>>>>>>> d2cb939f5 (GEOMESA-3100 Kafka layer views (#2784))
>>>>>>> 6af71ff43 (GEOMESA-3100 Kafka layer views (#2784))
=======
>>>>>>> 71adb695c5 (Merge branch 'feature/postgis-fixes')
>>>>>>> 23a7d9849f (GEOMESA-3100 Kafka layer views (#2784))
<<<<<<< HEAD
>>>>>>> 416a95a4c0 (GEOMESA-3100 Kafka layer views (#2784))
<<<<<<< HEAD
>>>>>>> 39d28fffcb (GEOMESA-3100 Kafka layer views (#2784))
=======
=======
=======
=======
>>>>>>> db8d998aa (Merge branch 'feature/postgis-fixes')
=======
>>>>>>> 5a4c24e020 (GEOMESA-3254 Add Bloop build support)
>>>>>>> cb6bda89b6 (Merge branch 'feature/postgis-fixes')
<<<<<<< HEAD
>>>>>>> 26e5afc4ea (Merge branch 'feature/postgis-fixes')
<<<<<<< HEAD
>>>>>>> 71adb695c5 (Merge branch 'feature/postgis-fixes')
=======
=======
=======
=======
>>>>>>> d845d7c1b (GEOMESA-3254 Add Bloop build support)
=======
>>>>>>> d4039e3d9a (GEOMESA-3100 Kafka layer views (#2784))
>>>>>>> 09d87762c5 (GEOMESA-3254 Add Bloop build support)
<<<<<<< HEAD
>>>>>>> 63a045a753 (GEOMESA-3254 Add Bloop build support)
<<<<<<< HEAD
>>>>>>> 5a4c24e020 (GEOMESA-3254 Add Bloop build support)
=======
=======
=======
=======
>>>>>>> 17f13b3a7 (GEOMESA-3100 Kafka layer views (#2784))
=======
>>>>>>> c9a6fc453c (GEOMESA-3198 Kafka streams integration (#2854))
>>>>>>> 6069aba6b4 (GEOMESA-3100 Kafka layer views (#2784))
<<<<<<< HEAD
>>>>>>> ccfb3bd95e (GEOMESA-3100 Kafka layer views (#2784))
<<<<<<< HEAD
>>>>>>> d4039e3d9a (GEOMESA-3100 Kafka layer views (#2784))
=======
=======
=======
=======
=======
>>>>>>> de758f45a (GEOMESA-3198 Kafka streams integration (#2854))
>>>>>>> 73f3a8cb6 (GEOMESA-3198 Kafka streams integration (#2854))
=======
>>>>>>> 0d5f6377de (GEOMESA-3100 Kafka layer views (#2784))
>>>>>>> c6591bc391 (GEOMESA-3198 Kafka streams integration (#2854))
<<<<<<< HEAD
>>>>>>> 4ae16a2980 (GEOMESA-3198 Kafka streams integration (#2854))
<<<<<<< HEAD
>>>>>>> c9a6fc453c (GEOMESA-3198 Kafka streams integration (#2854))
=======
=======
=======
=======
=======
=======
>>>>>>> 41df6a2aa3 (GEOMESA-3100 Kafka layer views (#2784))
=======
>>>>>>> 29a2fa060 (GEOMESA-3198 Kafka streams integration (#2854))
=======
>>>>>>> 91aada60ab (GEOMESA-3198 Kafka streams integration (#2854))
>>>>>>> de758f45a (GEOMESA-3198 Kafka streams integration (#2854))
=======
>>>>>>> 5ca0cd6de (GEOMESA-3100 Kafka layer views (#2784))
<<<<<<< HEAD
>>>>>>> f6e840b5d (GEOMESA-3100 Kafka layer views (#2784))
<<<<<<< HEAD
>>>>>>> 4480b2d1b9 (GEOMESA-3100 Kafka layer views (#2784))
<<<<<<< HEAD
>>>>>>> b5abc19ca4 (GEOMESA-3100 Kafka layer views (#2784))
<<<<<<< HEAD
>>>>>>> 0d5f6377de (GEOMESA-3100 Kafka layer views (#2784))
=======
=======
=======
=======
=======
>>>>>>> bddfdbea5 (GEOMESA-3100 Kafka layer views (#2784))
<<<<<<< HEAD
>>>>>>> c589b832a (GEOMESA-3100 Kafka layer views (#2784))
<<<<<<< HEAD
>>>>>>> 9e433ba57e (GEOMESA-3100 Kafka layer views (#2784))
<<<<<<< HEAD
>>>>>>> 2750a5beef (GEOMESA-3100 Kafka layer views (#2784))
<<<<<<< HEAD
>>>>>>> 41df6a2aa3 (GEOMESA-3100 Kafka layer views (#2784))
=======
=======
=======
=======
=======
=======
>>>>>>> de758f45a (GEOMESA-3198 Kafka streams integration (#2854))
>>>>>>> 4e12cd412 (GEOMESA-3198 Kafka streams integration (#2854))
>>>>>>> 29a2fa060 (GEOMESA-3198 Kafka streams integration (#2854))
<<<<<<< HEAD
>>>>>>> 69fb98522c (GEOMESA-3198 Kafka streams integration (#2854))
<<<<<<< HEAD
>>>>>>> 3a0eb62fc5 (GEOMESA-3198 Kafka streams integration (#2854))
<<<<<<< HEAD
>>>>>>> 91aada60ab (GEOMESA-3198 Kafka streams integration (#2854))
=======
=======
=======
=======
=======
>>>>>>> d0dc799ff (GEOMESA-3100 Kafka layer views (#2784))
>>>>>>> ffbc2ce32 (GEOMESA-3100 Kafka layer views (#2784))
<<<<<<< HEAD
>>>>>>> 2df2640494 (GEOMESA-3100 Kafka layer views (#2784))
<<<<<<< HEAD
>>>>>>> cb4aa55ae3 (GEOMESA-3100 Kafka layer views (#2784))
<<<<<<< HEAD
>>>>>>> fb32a36e0e (GEOMESA-3100 Kafka layer views (#2784))
=======
=======
=======
=======
>>>>>>> fa68dd43c (GEOMESA-3100 Kafka layer views (#2784))
<<<<<<< HEAD
>>>>>>> 23f312535d (GEOMESA-3100 Kafka layer views (#2784))
<<<<<<< HEAD
>>>>>>> 468da42855 (GEOMESA-3100 Kafka layer views (#2784))
<<<<<<< HEAD
>>>>>>> 340134cdda (GEOMESA-3100 Kafka layer views (#2784))
=======
=======
=======
=======
>>>>>>> eef10da74 (GEOMESA-3198 Kafka streams integration (#2854))
=======
>>>>>>> ea8384d9b7 (GEOMESA-3100 Kafka layer views (#2784))
>>>>>>> 769842a4bf (GEOMESA-3198 Kafka streams integration (#2854))
<<<<<<< HEAD
>>>>>>> 320fc0eff4 (GEOMESA-3198 Kafka streams integration (#2854))
<<<<<<< HEAD
>>>>>>> 81cb3a1b74 (GEOMESA-3198 Kafka streams integration (#2854))
=======
=======
=======
=======
=======
>>>>>>> 936154130 (GEOMESA-3100 Kafka layer views (#2784))
>>>>>>> 54ece16d1 (GEOMESA-3100 Kafka layer views (#2784))
=======
>>>>>>> fe3378ccaa (GEOMESA-3100 Kafka layer views (#2784))
>>>>>>> 826636f69d (GEOMESA-3100 Kafka layer views (#2784))
<<<<<<< HEAD
>>>>>>> 5dd3eb3a6d (GEOMESA-3100 Kafka layer views (#2784))
<<<<<<< HEAD
>>>>>>> ea8384d9b7 (GEOMESA-3100 Kafka layer views (#2784))
=======
=======
=======
=======
>>>>>>> c57b5f538 (GEOMESA-3100 Kafka layer views (#2784))
=======
>>>>>>> 4934cb1a2a (GEOMESA-3198 Kafka streams integration (#2854))
>>>>>>> 1e11ed51a6 (GEOMESA-3100 Kafka layer views (#2784))
<<<<<<< HEAD
>>>>>>> d530f7b24a (GEOMESA-3100 Kafka layer views (#2784))
<<<<<<< HEAD
>>>>>>> fe3378ccaa (GEOMESA-3100 Kafka layer views (#2784))
=======
=======
=======
=======
=======
>>>>>>> fc2f65fc3 (GEOMESA-3198 Kafka streams integration (#2854))
>>>>>>> 8f51e1858 (GEOMESA-3198 Kafka streams integration (#2854))
=======
>>>>>>> 79f56900f0 (GEOMESA-3100 Kafka layer views (#2784))
>>>>>>> 991d5c62a7 (GEOMESA-3198 Kafka streams integration (#2854))
<<<<<<< HEAD
>>>>>>> 55438fd78b (GEOMESA-3198 Kafka streams integration (#2854))
<<<<<<< HEAD
>>>>>>> 4934cb1a2a (GEOMESA-3198 Kafka streams integration (#2854))
=======
=======
=======
=======
>>>>>>> 88ef67cdf (GEOMESA-3100 Kafka layer views (#2784))
=======
>>>>>>> 72ec0b2107 (GEOMESA-3100 Kafka layer views (#2784))
>>>>>>> 976f319530 (GEOMESA-3100 Kafka layer views (#2784))
<<<<<<< HEAD
>>>>>>> 5e230912b1 (GEOMESA-3100 Kafka layer views (#2784))
<<<<<<< HEAD
>>>>>>> 79f56900f0 (GEOMESA-3100 Kafka layer views (#2784))
=======
=======
=======
=======
=======
>>>>>>> d2cb939f5 (GEOMESA-3100 Kafka layer views (#2784))
>>>>>>> 89fb9950e (GEOMESA-3100 Kafka layer views (#2784))
=======
>>>>>>> 30559ea5c9 (Merge branch 'feature/postgis-fixes')
>>>>>>> bc97b07a31 (GEOMESA-3100 Kafka layer views (#2784))
<<<<<<< HEAD
>>>>>>> f340d6feab (GEOMESA-3100 Kafka layer views (#2784))
<<<<<<< HEAD
>>>>>>> 72ec0b2107 (GEOMESA-3100 Kafka layer views (#2784))
=======
=======
=======
=======
>>>>>>> 1b25d7ddb (Merge branch 'feature/postgis-fixes')
>>>>>>> 699117eca9 (Merge branch 'feature/postgis-fixes')
>>>>>>> c69897d7bd (Merge branch 'feature/postgis-fixes')
>>>>>>> 30559ea5c9 (Merge branch 'feature/postgis-fixes')
=======
>>>>>>> ad362b1341 (GEOMESA-3100 Kafka layer views (#2784))
=======
>>>>>>> f9df175e9b (GEOMESA-3198 Kafka streams integration (#2854))
  // only instantiate the producer if needed
  private val defaultProducer = new LazyProducer(KafkaDataStore.producer(config.brokers, config.producers.properties))
  // noinspection ScalaDeprecation
  private val partitionedProducer = new LazyProducer(KafkaDataStore.producer(config))
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

  // view type name -> actual type name
  private val layerViewLookup =
    config.layerViewsConfig.flatMap { case (typeName, views) => views.map(_.typeName -> typeName).toMap }
=======
>>>>>>> de758f45a6 (GEOMESA-3198 Kafka streams integration (#2854))

  // view type name -> actual type name
  private val layerViewLookup =
    config.layerViewsConfig.flatMap { case (typeName, views) => views.map(_.typeName -> typeName).toMap }
=======
>>>>>>> 4e12cd412d (GEOMESA-3198 Kafka streams integration (#2854))

  // view type name -> actual type name
  private val layerViewLookup =
    config.layerViewsConfig.flatMap { case (typeName, views) => views.map(_.typeName -> typeName).toMap }
=======
>>>>>>> de758f45a (GEOMESA-3198 Kafka streams integration (#2854))

  // view type name -> actual type name
  private val layerViewLookup =
    config.layerViewsConfig.flatMap { case (typeName, views) => views.map(_.typeName -> typeName).toMap }
=======
>>>>>>> d657014c83 (GEOMESA-3198 Kafka streams integration (#2854))
=======
>>>>>>> fc2f65fc3b (GEOMESA-3198 Kafka streams integration (#2854))

  // view type name -> actual type name
  private val layerViewLookup =
    config.layerViewsConfig.flatMap { case (typeName, views) => views.map(_.typeName -> typeName).toMap }
=======
>>>>>>> de758f45a (GEOMESA-3198 Kafka streams integration (#2854))

  // view type name -> actual type name
  private val layerViewLookup =
    config.layerViewsConfig.flatMap { case (typeName, views) => views.map(_.typeName -> typeName).toMap }
=======
>>>>>>> 4e12cd412 (GEOMESA-3198 Kafka streams integration (#2854))

  // view type name -> actual type name
  private val layerViewLookup =
    config.layerViewsConfig.flatMap { case (typeName, views) => views.map(_.typeName -> typeName).toMap }
=======
>>>>>>> de758f45a (GEOMESA-3198 Kafka streams integration (#2854))

  // view type name -> actual type name
  private val layerViewLookup =
    config.layerViewsConfig.flatMap { case (typeName, views) => views.map(_.typeName -> typeName).toMap }

  // view type name -> actual type name
  private val layerViewLookup =
    config.layerViewsConfig.flatMap { case (typeName, views) => views.map(_.typeName -> typeName).toMap }
=======
>>>>>>> 3be8d2a5a4 (Merge branch 'feature/postgis-fixes')
=======
>>>>>>> 1b8cbf843d (GEOMESA-3198 Kafka streams integration (#2854))
=======
>>>>>>> ecbc2cafc2 (GEOMESA-3198 Kafka streams integration (#2854))
=======
>>>>>>> 3be3e5d3e0 (GEOMESA-3198 Kafka streams integration (#2854))
=======
>>>>>>> 7b8c9b548a (GEOMESA-3198 Kafka streams integration (#2854))
=======
>>>>>>> db8d998aa2 (Merge branch 'feature/postgis-fixes')

  // view type name -> actual type name
  private val layerViewLookup =
    config.layerViewsConfig.flatMap { case (typeName, views) => views.map(_.typeName -> typeName).toMap }
=======
>>>>>>> de758f45a (GEOMESA-3198 Kafka streams integration (#2854))

  // view type name -> actual type name
  private val layerViewLookup =
    config.layerViewsConfig.flatMap { case (typeName, views) => views.map(_.typeName -> typeName).toMap }
=======
>>>>>>> 4e12cd412 (GEOMESA-3198 Kafka streams integration (#2854))

  // view type name -> actual type name
  private val layerViewLookup =
    config.layerViewsConfig.flatMap { case (typeName, views) => views.map(_.typeName -> typeName).toMap }
=======
>>>>>>> de758f45a (GEOMESA-3198 Kafka streams integration (#2854))

  // view type name -> actual type name
  private val layerViewLookup =
    config.layerViewsConfig.flatMap { case (typeName, views) => views.map(_.typeName -> typeName).toMap }
=======
>>>>>>> d657014c8 (GEOMESA-3198 Kafka streams integration (#2854))
=======
>>>>>>> fc2f65fc3 (GEOMESA-3198 Kafka streams integration (#2854))

  // view type name -> actual type name
  private val layerViewLookup =
    config.layerViewsConfig.flatMap { case (typeName, views) => views.map(_.typeName -> typeName).toMap }
=======
>>>>>>> de758f45a (GEOMESA-3198 Kafka streams integration (#2854))

  // view type name -> actual type name
  private val layerViewLookup =
    config.layerViewsConfig.flatMap { case (typeName, views) => views.map(_.typeName -> typeName).toMap }
=======
>>>>>>> 4e12cd412 (GEOMESA-3198 Kafka streams integration (#2854))

  // view type name -> actual type name
  private val layerViewLookup =
    config.layerViewsConfig.flatMap { case (typeName, views) => views.map(_.typeName -> typeName).toMap }
=======
>>>>>>> de758f45a (GEOMESA-3198 Kafka streams integration (#2854))

  // view type name -> actual type name
  private val layerViewLookup =
    config.layerViewsConfig.flatMap { case (typeName, views) => views.map(_.typeName -> typeName).toMap }

  // view type name -> actual type name
  private val layerViewLookup =
    config.layerViewsConfig.flatMap { case (typeName, views) => views.map(_.typeName -> typeName).toMap }
=======
>>>>>>> 3be8d2a5a (Merge branch 'feature/postgis-fixes')
=======
>>>>>>> d845d7c1bd (GEOMESA-3254 Add Bloop build support)
=======
>>>>>>> 73f3a8cb69 (GEOMESA-3198 Kafka streams integration (#2854))
=======
>>>>>>> 29a2fa060e (GEOMESA-3198 Kafka streams integration (#2854))
=======
>>>>>>> eef10da741 (GEOMESA-3198 Kafka streams integration (#2854))
=======
>>>>>>> 8f51e18588 (GEOMESA-3198 Kafka streams integration (#2854))
=======
>>>>>>> 1b25d7ddb4 (Merge branch 'feature/postgis-fixes')
=======
>>>>>>> 0b3e844fc4 (GEOMESA-3198 Kafka streams integration (#2854))
=======
=======
>>>>>>> e8cc4971c6 (Merge branch 'feature/postgis-fixes')
>>>>>>> e944f1c88b (Merge branch 'feature/postgis-fixes')
=======
=======
>>>>>>> 965120b3ca (GEOMESA-3198 Kafka streams integration (#2854))
=======
>>>>>>> ec680351e0 (GEOMESA-3198 Kafka streams integration (#2854))
=======
>>>>>>> 8ce502793e (GEOMESA-3198 Kafka streams integration (#2854))
=======
>>>>>>> 26e5afc4ea (Merge branch 'feature/postgis-fixes')
=======
>>>>>>> 63a045a753 (GEOMESA-3254 Add Bloop build support)
=======
>>>>>>> 4ae16a2980 (GEOMESA-3198 Kafka streams integration (#2854))
=======
>>>>>>> 3a0eb62fc5 (GEOMESA-3198 Kafka streams integration (#2854))
=======
>>>>>>> 320fc0eff4 (GEOMESA-3198 Kafka streams integration (#2854))
=======
>>>>>>> 55438fd78b (GEOMESA-3198 Kafka streams integration (#2854))
=======
>>>>>>> c69897d7bd (Merge branch 'feature/postgis-fixes')
=======
>>>>>>> e8cc4971c6 (Merge branch 'feature/postgis-fixes')
=======
>>>>>>> 30fda14bf2 (GEOMESA-3198 Kafka streams integration (#2854))
<<<<<<< HEAD
>>>>>>> 8d7834ec11 (GEOMESA-3198 Kafka streams integration (#2854))
=======
=======
>>>>>>> 41bda2df98 (GEOMESA-3198 Kafka streams integration (#2854))
<<<<<<< HEAD
>>>>>>> 965120b3ca (GEOMESA-3198 Kafka streams integration (#2854))
=======
=======
>>>>>>> d98371fa50 (GEOMESA-3198 Kafka streams integration (#2854))
<<<<<<< HEAD
>>>>>>> ec680351e0 (GEOMESA-3198 Kafka streams integration (#2854))
=======
=======
>>>>>>> 5fa4cd5eac (GEOMESA-3198 Kafka streams integration (#2854))
<<<<<<< HEAD
>>>>>>> 8ce502793e (GEOMESA-3198 Kafka streams integration (#2854))
=======
=======
>>>>>>> cb6bda89b6 (Merge branch 'feature/postgis-fixes')
<<<<<<< HEAD
>>>>>>> 26e5afc4ea (Merge branch 'feature/postgis-fixes')
=======
=======
>>>>>>> 09d87762c5 (GEOMESA-3254 Add Bloop build support)
<<<<<<< HEAD
>>>>>>> 63a045a753 (GEOMESA-3254 Add Bloop build support)
=======
=======
>>>>>>> c6591bc391 (GEOMESA-3198 Kafka streams integration (#2854))
<<<<<<< HEAD
>>>>>>> 4ae16a2980 (GEOMESA-3198 Kafka streams integration (#2854))
=======
=======
>>>>>>> 69fb98522c (GEOMESA-3198 Kafka streams integration (#2854))
<<<<<<< HEAD
>>>>>>> 3a0eb62fc5 (GEOMESA-3198 Kafka streams integration (#2854))
=======
=======
>>>>>>> 769842a4bf (GEOMESA-3198 Kafka streams integration (#2854))
<<<<<<< HEAD
>>>>>>> 320fc0eff4 (GEOMESA-3198 Kafka streams integration (#2854))
=======
=======
>>>>>>> 991d5c62a7 (GEOMESA-3198 Kafka streams integration (#2854))
<<<<<<< HEAD
>>>>>>> 55438fd78b (GEOMESA-3198 Kafka streams integration (#2854))
=======
=======
>>>>>>> 699117eca9 (Merge branch 'feature/postgis-fixes')
>>>>>>> c69897d7bd (Merge branch 'feature/postgis-fixes')

  // view type name -> actual type name
  private val layerViewLookup =
    config.layerViewsConfig.flatMap { case (typeName, views) => views.map(_.typeName -> typeName).toMap }
=======
>>>>>>> de758f45a (GEOMESA-3198 Kafka streams integration (#2854))

  // view type name -> actual type name
  private val layerViewLookup =
    config.layerViewsConfig.flatMap { case (typeName, views) => views.map(_.typeName -> typeName).toMap }
=======
>>>>>>> 4e12cd412 (GEOMESA-3198 Kafka streams integration (#2854))

  // view type name -> actual type name
  private val layerViewLookup =
    config.layerViewsConfig.flatMap { case (typeName, views) => views.map(_.typeName -> typeName).toMap }
=======
>>>>>>> de758f45a (GEOMESA-3198 Kafka streams integration (#2854))

  // view type name -> actual type name
  private val layerViewLookup =
    config.layerViewsConfig.flatMap { case (typeName, views) => views.map(_.typeName -> typeName).toMap }
=======
>>>>>>> d657014c8 (GEOMESA-3198 Kafka streams integration (#2854))
=======
>>>>>>> fc2f65fc3 (GEOMESA-3198 Kafka streams integration (#2854))

  // view type name -> actual type name
  private val layerViewLookup =
    config.layerViewsConfig.flatMap { case (typeName, views) => views.map(_.typeName -> typeName).toMap }
=======
>>>>>>> de758f45a (GEOMESA-3198 Kafka streams integration (#2854))

  // view type name -> actual type name
  private val layerViewLookup =
    config.layerViewsConfig.flatMap { case (typeName, views) => views.map(_.typeName -> typeName).toMap }
=======
>>>>>>> 4e12cd412 (GEOMESA-3198 Kafka streams integration (#2854))

  // view type name -> actual type name
  private val layerViewLookup =
    config.layerViewsConfig.flatMap { case (typeName, views) => views.map(_.typeName -> typeName).toMap }
=======
>>>>>>> de758f45a (GEOMESA-3198 Kafka streams integration (#2854))

  // view type name -> actual type name
  private val layerViewLookup =
    config.layerViewsConfig.flatMap { case (typeName, views) => views.map(_.typeName -> typeName).toMap }

  // view type name -> actual type name
  private val layerViewLookup =
    config.layerViewsConfig.flatMap { case (typeName, views) => views.map(_.typeName -> typeName).toMap }
<<<<<<< HEAD
<<<<<<< HEAD
=======
>>>>>>> 3be8d2a5a (Merge branch 'feature/postgis-fixes')
=======
<<<<<<< HEAD
>>>>>>> f01ac238e (GEOMESA-3198 Kafka streams integration (#2854))

  // view type name -> actual type name
  private val layerViewLookup =
    config.layerViewsConfig.flatMap { case (typeName, views) => views.map(_.typeName -> typeName).toMap }
=======
>>>>>>> de758f45a (GEOMESA-3198 Kafka streams integration (#2854))

  // view type name -> actual type name
  private val layerViewLookup =
    config.layerViewsConfig.flatMap { case (typeName, views) => views.map(_.typeName -> typeName).toMap }

  // view type name -> actual type name
  private val layerViewLookup =
    config.layerViewsConfig.flatMap { case (typeName, views) => views.map(_.typeName -> typeName).toMap }

  // view type name -> actual type name
  private val layerViewLookup =
    config.layerViewsConfig.flatMap { case (typeName, views) => views.map(_.typeName -> typeName).toMap }

  // view type name -> actual type name
  private val layerViewLookup =
    config.layerViewsConfig.flatMap { case (typeName, views) => views.map(_.typeName -> typeName).toMap }

  // view type name -> actual type name
  private val layerViewLookup =
    config.layerViewsConfig.flatMap { case (typeName, views) => views.map(_.typeName -> typeName).toMap }

  // view type name -> actual type name
  private val layerViewLookup =
    config.layerViewsConfig.flatMap { case (typeName, views) => views.map(_.typeName -> typeName).toMap }

  // view type name -> actual type name
  private val layerViewLookup =
    config.layerViewsConfig.flatMap { case (typeName, views) => views.map(_.typeName -> typeName).toMap }
=======
>>>>>>> 6f6887eb8 (GEOMESA-3100 Kafka layer views (#2784))
=======
=======
>>>>>>> 3be8d2a5a (Merge branch 'feature/postgis-fixes')
>>>>>>> e8cc4971c6 (Merge branch 'feature/postgis-fixes')
=======
>>>>>>> 1b8cbf843 (GEOMESA-3198 Kafka streams integration (#2854))
<<<<<<< HEAD
>>>>>>> 30fda14bf2 (GEOMESA-3198 Kafka streams integration (#2854))
=======
=======
>>>>>>> ecbc2cafc (GEOMESA-3198 Kafka streams integration (#2854))
<<<<<<< HEAD
>>>>>>> 41bda2df98 (GEOMESA-3198 Kafka streams integration (#2854))
=======
=======
>>>>>>> 3be3e5d3e (GEOMESA-3198 Kafka streams integration (#2854))
<<<<<<< HEAD
>>>>>>> d98371fa50 (GEOMESA-3198 Kafka streams integration (#2854))
=======
=======
>>>>>>> 7b8c9b548 (GEOMESA-3198 Kafka streams integration (#2854))
<<<<<<< HEAD
>>>>>>> 5fa4cd5eac (GEOMESA-3198 Kafka streams integration (#2854))
=======
=======
>>>>>>> db8d998aa (Merge branch 'feature/postgis-fixes')
>>>>>>> cb6bda89b6 (Merge branch 'feature/postgis-fixes')

  // view type name -> actual type name
  private val layerViewLookup =
    config.layerViewsConfig.flatMap { case (typeName, views) => views.map(_.typeName -> typeName).toMap }
=======
>>>>>>> de758f45a (GEOMESA-3198 Kafka streams integration (#2854))

  // view type name -> actual type name
  private val layerViewLookup =
    config.layerViewsConfig.flatMap { case (typeName, views) => views.map(_.typeName -> typeName).toMap }
=======
>>>>>>> 4e12cd412 (GEOMESA-3198 Kafka streams integration (#2854))

  // view type name -> actual type name
  private val layerViewLookup =
    config.layerViewsConfig.flatMap { case (typeName, views) => views.map(_.typeName -> typeName).toMap }
=======
>>>>>>> de758f45a (GEOMESA-3198 Kafka streams integration (#2854))

  // view type name -> actual type name
  private val layerViewLookup =
    config.layerViewsConfig.flatMap { case (typeName, views) => views.map(_.typeName -> typeName).toMap }
=======
>>>>>>> d657014c8 (GEOMESA-3198 Kafka streams integration (#2854))
=======
>>>>>>> fc2f65fc3 (GEOMESA-3198 Kafka streams integration (#2854))

  // view type name -> actual type name
  private val layerViewLookup =
    config.layerViewsConfig.flatMap { case (typeName, views) => views.map(_.typeName -> typeName).toMap }
=======
>>>>>>> de758f45a (GEOMESA-3198 Kafka streams integration (#2854))

  // view type name -> actual type name
  private val layerViewLookup =
    config.layerViewsConfig.flatMap { case (typeName, views) => views.map(_.typeName -> typeName).toMap }
=======
>>>>>>> 4e12cd412 (GEOMESA-3198 Kafka streams integration (#2854))

  // view type name -> actual type name
  private val layerViewLookup =
    config.layerViewsConfig.flatMap { case (typeName, views) => views.map(_.typeName -> typeName).toMap }
=======
>>>>>>> de758f45a (GEOMESA-3198 Kafka streams integration (#2854))

  // view type name -> actual type name
  private val layerViewLookup =
    config.layerViewsConfig.flatMap { case (typeName, views) => views.map(_.typeName -> typeName).toMap }

  // view type name -> actual type name
  private val layerViewLookup =
    config.layerViewsConfig.flatMap { case (typeName, views) => views.map(_.typeName -> typeName).toMap }
=======
>>>>>>> 3be8d2a5a (Merge branch 'feature/postgis-fixes')
=======
>>>>>>> d845d7c1b (GEOMESA-3254 Add Bloop build support)
=======
>>>>>>> 73f3a8cb6 (GEOMESA-3198 Kafka streams integration (#2854))
=======
>>>>>>> 29a2fa060 (GEOMESA-3198 Kafka streams integration (#2854))
=======
>>>>>>> eef10da74 (GEOMESA-3198 Kafka streams integration (#2854))
=======
>>>>>>> 8f51e1858 (GEOMESA-3198 Kafka streams integration (#2854))
=======
>>>>>>> 1b25d7ddb (Merge branch 'feature/postgis-fixes')

  // view type name -> actual type name
  private val layerViewLookup =
    config.layerViewsConfig.flatMap { case (typeName, views) => views.map(_.typeName -> typeName).toMap }
=======
>>>>>>> de758f45a (GEOMESA-3198 Kafka streams integration (#2854))

  // view type name -> actual type name
  private val layerViewLookup =
    config.layerViewsConfig.flatMap { case (typeName, views) => views.map(_.typeName -> typeName).toMap }
=======
>>>>>>> 4e12cd412 (GEOMESA-3198 Kafka streams integration (#2854))

  // view type name -> actual type name
  private val layerViewLookup =
    config.layerViewsConfig.flatMap { case (typeName, views) => views.map(_.typeName -> typeName).toMap }
=======
>>>>>>> de758f45a (GEOMESA-3198 Kafka streams integration (#2854))

  // view type name -> actual type name
  private val layerViewLookup =
    config.layerViewsConfig.flatMap { case (typeName, views) => views.map(_.typeName -> typeName).toMap }
=======
>>>>>>> d657014c8 (GEOMESA-3198 Kafka streams integration (#2854))
=======
>>>>>>> fc2f65fc3 (GEOMESA-3198 Kafka streams integration (#2854))

  // view type name -> actual type name
  private val layerViewLookup =
    config.layerViewsConfig.flatMap { case (typeName, views) => views.map(_.typeName -> typeName).toMap }
=======
>>>>>>> de758f45a (GEOMESA-3198 Kafka streams integration (#2854))

  // view type name -> actual type name
  private val layerViewLookup =
    config.layerViewsConfig.flatMap { case (typeName, views) => views.map(_.typeName -> typeName).toMap }
=======
>>>>>>> 4e12cd412 (GEOMESA-3198 Kafka streams integration (#2854))

  // view type name -> actual type name
  private val layerViewLookup =
    config.layerViewsConfig.flatMap { case (typeName, views) => views.map(_.typeName -> typeName).toMap }
=======
>>>>>>> de758f45a (GEOMESA-3198 Kafka streams integration (#2854))

  // view type name -> actual type name
  private val layerViewLookup =
    config.layerViewsConfig.flatMap { case (typeName, views) => views.map(_.typeName -> typeName).toMap }

  // view type name -> actual type name
  private val layerViewLookup =
    config.layerViewsConfig.flatMap { case (typeName, views) => views.map(_.typeName -> typeName).toMap }
=======
>>>>>>> 3be8d2a5a (Merge branch 'feature/postgis-fixes')
=======
>>>>>>> b09307f5c0 (GEOMESA-3198 Kafka streams integration (#2854))
=======
>>>>>>> 90a582b4a6 (GEOMESA-3198 Kafka streams integration (#2854))
=======
>>>>>>> 60bcd014c8 (GEOMESA-3198 Kafka streams integration (#2854))
=======
>>>>>>> f716dd05cb (GEOMESA-3198 Kafka streams integration (#2854))
=======
>>>>>>> da00c7bd68 (Merge branch 'feature/postgis-fixes')

  // view type name -> actual type name
  private val layerViewLookup =
    config.layerViewsConfig.flatMap { case (typeName, views) => views.map(_.typeName -> typeName).toMap }
=======
>>>>>>> de758f45a (GEOMESA-3198 Kafka streams integration (#2854))

  // view type name -> actual type name
  private val layerViewLookup =
    config.layerViewsConfig.flatMap { case (typeName, views) => views.map(_.typeName -> typeName).toMap }
=======
>>>>>>> 4e12cd412 (GEOMESA-3198 Kafka streams integration (#2854))

  // view type name -> actual type name
  private val layerViewLookup =
    config.layerViewsConfig.flatMap { case (typeName, views) => views.map(_.typeName -> typeName).toMap }
=======
>>>>>>> de758f45a (GEOMESA-3198 Kafka streams integration (#2854))

  // view type name -> actual type name
  private val layerViewLookup =
    config.layerViewsConfig.flatMap { case (typeName, views) => views.map(_.typeName -> typeName).toMap }
=======
>>>>>>> d657014c8 (GEOMESA-3198 Kafka streams integration (#2854))
=======
>>>>>>> fc2f65fc3 (GEOMESA-3198 Kafka streams integration (#2854))

  // view type name -> actual type name
  private val layerViewLookup =
    config.layerViewsConfig.flatMap { case (typeName, views) => views.map(_.typeName -> typeName).toMap }
=======
>>>>>>> de758f45a (GEOMESA-3198 Kafka streams integration (#2854))

  // view type name -> actual type name
  private val layerViewLookup =
    config.layerViewsConfig.flatMap { case (typeName, views) => views.map(_.typeName -> typeName).toMap }
=======
>>>>>>> 4e12cd412 (GEOMESA-3198 Kafka streams integration (#2854))

  // view type name -> actual type name
  private val layerViewLookup =
    config.layerViewsConfig.flatMap { case (typeName, views) => views.map(_.typeName -> typeName).toMap }
=======
>>>>>>> de758f45a (GEOMESA-3198 Kafka streams integration (#2854))

  // view type name -> actual type name
  private val layerViewLookup =
    config.layerViewsConfig.flatMap { case (typeName, views) => views.map(_.typeName -> typeName).toMap }

  // view type name -> actual type name
  private val layerViewLookup =
    config.layerViewsConfig.flatMap { case (typeName, views) => views.map(_.typeName -> typeName).toMap }
=======
>>>>>>> 3be8d2a5a (Merge branch 'feature/postgis-fixes')
=======
>>>>>>> 03f3e71921 (GEOMESA-3198 Kafka streams integration (#2854))
=======
>>>>>>> e01cda38b4 (GEOMESA-3198 Kafka streams integration (#2854))
=======
>>>>>>> 1c64e1adc3 (GEOMESA-3198 Kafka streams integration (#2854))
=======
>>>>>>> 6415d35ab4 (GEOMESA-3198 Kafka streams integration (#2854))
=======
>>>>>>> 34472778d3 (Merge branch 'feature/postgis-fixes')
=======
>>>>>>> 030cd33877 (GEOMESA-3198 Kafka streams integration (#2854))
=======
>>>>>>> f90a7718ef (GEOMESA-3198 Kafka streams integration (#2854))
=======
>>>>>>> 88e1e7d3ff (GEOMESA-3198 Kafka streams integration (#2854))
=======
>>>>>>> 63ce2ed3e4 (GEOMESA-3198 Kafka streams integration (#2854))
=======
>>>>>>> 42e8565e9b (Merge branch 'feature/postgis-fixes')
=======
>>>>>>> f1532f2313 (GEOMESA-3254 Add Bloop build support)
=======
>>>>>>> d4a13604e7 (GEOMESA-3198 Kafka streams integration (#2854))
=======
>>>>>>> 5d02b8e414 (GEOMESA-3198 Kafka streams integration (#2854))
=======
>>>>>>> 7442d73a4d (GEOMESA-3198 Kafka streams integration (#2854))
=======
>>>>>>> 38e75099c5 (GEOMESA-3198 Kafka streams integration (#2854))
=======
>>>>>>> 67de3c3202 (Merge branch 'feature/postgis-fixes')
=======
>>>>>>> e2a2dd4c2e (GEOMESA-3198 Kafka streams integration (#2854))
=======
>>>>>>> 638b68d081 (Merge branch 'feature/postgis-fixes')
=======
>>>>>>> e792102d4b (GEOMESA-3198 Kafka streams integration (#2854))
=======
>>>>>>> 2834875e9b (GEOMESA-3198 Kafka streams integration (#2854))
=======
>>>>>>> cf6eae6fac (GEOMESA-3198 Kafka streams integration (#2854))
=======
>>>>>>> bb28efed75 (GEOMESA-3198 Kafka streams integration (#2854))
=======
>>>>>>> 71adb695c5 (Merge branch 'feature/postgis-fixes')
=======
>>>>>>> 5a4c24e020 (GEOMESA-3254 Add Bloop build support)
=======
>>>>>>> c9a6fc453c (GEOMESA-3198 Kafka streams integration (#2854))
=======
>>>>>>> 91aada60ab (GEOMESA-3198 Kafka streams integration (#2854))
=======
>>>>>>> 81cb3a1b74 (GEOMESA-3198 Kafka streams integration (#2854))
=======
>>>>>>> 4934cb1a2a (GEOMESA-3198 Kafka streams integration (#2854))
=======
>>>>>>> 30559ea5c9 (Merge branch 'feature/postgis-fixes')
=======
>>>>>>> f9df175e9b (GEOMESA-3198 Kafka streams integration (#2854))

  // view type name -> actual type name
  private val layerViewLookup =
    config.layerViewsConfig.flatMap { case (typeName, views) => views.map(_.typeName -> typeName).toMap }
=======
>>>>>>> de758f45a6 (GEOMESA-3198 Kafka streams integration (#2854))

  // view type name -> actual type name
  private val layerViewLookup =
    config.layerViewsConfig.flatMap { case (typeName, views) => views.map(_.typeName -> typeName).toMap }
=======
>>>>>>> 4e12cd412d (GEOMESA-3198 Kafka streams integration (#2854))

  // view type name -> actual type name
  private val layerViewLookup =
    config.layerViewsConfig.flatMap { case (typeName, views) => views.map(_.typeName -> typeName).toMap }
=======
>>>>>>> de758f45a (GEOMESA-3198 Kafka streams integration (#2854))

  // view type name -> actual type name
  private val layerViewLookup =
    config.layerViewsConfig.flatMap { case (typeName, views) => views.map(_.typeName -> typeName).toMap }
=======
>>>>>>> d657014c83 (GEOMESA-3198 Kafka streams integration (#2854))
=======
>>>>>>> fc2f65fc3b (GEOMESA-3198 Kafka streams integration (#2854))

  // view type name -> actual type name
  private val layerViewLookup =
    config.layerViewsConfig.flatMap { case (typeName, views) => views.map(_.typeName -> typeName).toMap }
=======
>>>>>>> de758f45a (GEOMESA-3198 Kafka streams integration (#2854))

  // view type name -> actual type name
  private val layerViewLookup =
    config.layerViewsConfig.flatMap { case (typeName, views) => views.map(_.typeName -> typeName).toMap }
=======
>>>>>>> 4e12cd412 (GEOMESA-3198 Kafka streams integration (#2854))

  // view type name -> actual type name
  private val layerViewLookup =
    config.layerViewsConfig.flatMap { case (typeName, views) => views.map(_.typeName -> typeName).toMap }
=======
>>>>>>> de758f45a (GEOMESA-3198 Kafka streams integration (#2854))

  // view type name -> actual type name
  private val layerViewLookup =
    config.layerViewsConfig.flatMap { case (typeName, views) => views.map(_.typeName -> typeName).toMap }

  // view type name -> actual type name
  private val layerViewLookup =
    config.layerViewsConfig.flatMap { case (typeName, views) => views.map(_.typeName -> typeName).toMap }
=======
>>>>>>> 3be8d2a5a4 (Merge branch 'feature/postgis-fixes')
=======
>>>>>>> 1b8cbf843d (GEOMESA-3198 Kafka streams integration (#2854))
=======
>>>>>>> ecbc2cafc2 (GEOMESA-3198 Kafka streams integration (#2854))
=======
>>>>>>> 3be3e5d3e0 (GEOMESA-3198 Kafka streams integration (#2854))
=======
>>>>>>> 7b8c9b548a (GEOMESA-3198 Kafka streams integration (#2854))
=======
>>>>>>> db8d998aa2 (Merge branch 'feature/postgis-fixes')

  // view type name -> actual type name
  private val layerViewLookup =
    config.layerViewsConfig.flatMap { case (typeName, views) => views.map(_.typeName -> typeName).toMap }
=======
>>>>>>> de758f45a (GEOMESA-3198 Kafka streams integration (#2854))

  // view type name -> actual type name
  private val layerViewLookup =
    config.layerViewsConfig.flatMap { case (typeName, views) => views.map(_.typeName -> typeName).toMap }
=======
>>>>>>> 4e12cd412 (GEOMESA-3198 Kafka streams integration (#2854))

  // view type name -> actual type name
  private val layerViewLookup =
    config.layerViewsConfig.flatMap { case (typeName, views) => views.map(_.typeName -> typeName).toMap }
=======
>>>>>>> de758f45a (GEOMESA-3198 Kafka streams integration (#2854))

  // view type name -> actual type name
  private val layerViewLookup =
    config.layerViewsConfig.flatMap { case (typeName, views) => views.map(_.typeName -> typeName).toMap }
=======
>>>>>>> d657014c8 (GEOMESA-3198 Kafka streams integration (#2854))
=======
>>>>>>> fc2f65fc3 (GEOMESA-3198 Kafka streams integration (#2854))

  // view type name -> actual type name
  private val layerViewLookup =
    config.layerViewsConfig.flatMap { case (typeName, views) => views.map(_.typeName -> typeName).toMap }
=======
>>>>>>> de758f45a (GEOMESA-3198 Kafka streams integration (#2854))

  // view type name -> actual type name
  private val layerViewLookup =
    config.layerViewsConfig.flatMap { case (typeName, views) => views.map(_.typeName -> typeName).toMap }
=======
>>>>>>> 4e12cd412 (GEOMESA-3198 Kafka streams integration (#2854))

  // view type name -> actual type name
  private val layerViewLookup =
    config.layerViewsConfig.flatMap { case (typeName, views) => views.map(_.typeName -> typeName).toMap }
=======
>>>>>>> de758f45a (GEOMESA-3198 Kafka streams integration (#2854))

  // view type name -> actual type name
  private val layerViewLookup =
    config.layerViewsConfig.flatMap { case (typeName, views) => views.map(_.typeName -> typeName).toMap }

  // view type name -> actual type name
  private val layerViewLookup =
    config.layerViewsConfig.flatMap { case (typeName, views) => views.map(_.typeName -> typeName).toMap }
=======
>>>>>>> 3be8d2a5a (Merge branch 'feature/postgis-fixes')
=======
>>>>>>> d845d7c1bd (GEOMESA-3254 Add Bloop build support)
=======
>>>>>>> 73f3a8cb69 (GEOMESA-3198 Kafka streams integration (#2854))
=======
>>>>>>> 29a2fa060e (GEOMESA-3198 Kafka streams integration (#2854))
=======
>>>>>>> eef10da741 (GEOMESA-3198 Kafka streams integration (#2854))
=======
>>>>>>> 8f51e18588 (GEOMESA-3198 Kafka streams integration (#2854))
=======
>>>>>>> 1b25d7ddb4 (Merge branch 'feature/postgis-fixes')
=======
>>>>>>> 0b3e844fc4 (GEOMESA-3198 Kafka streams integration (#2854))
=======
=======
>>>>>>> e8cc4971c6 (Merge branch 'feature/postgis-fixes')
>>>>>>> e944f1c88b (Merge branch 'feature/postgis-fixes')
=======
=======
>>>>>>> 965120b3ca (GEOMESA-3198 Kafka streams integration (#2854))
=======
>>>>>>> ec680351e0 (GEOMESA-3198 Kafka streams integration (#2854))
=======
>>>>>>> 8ce502793e (GEOMESA-3198 Kafka streams integration (#2854))
=======
>>>>>>> 26e5afc4ea (Merge branch 'feature/postgis-fixes')
=======
>>>>>>> 63a045a753 (GEOMESA-3254 Add Bloop build support)
=======
>>>>>>> 4ae16a2980 (GEOMESA-3198 Kafka streams integration (#2854))
=======
>>>>>>> 3a0eb62fc5 (GEOMESA-3198 Kafka streams integration (#2854))
=======
>>>>>>> 320fc0eff4 (GEOMESA-3198 Kafka streams integration (#2854))
=======
>>>>>>> 55438fd78b (GEOMESA-3198 Kafka streams integration (#2854))
=======
>>>>>>> c69897d7bd (Merge branch 'feature/postgis-fixes')
=======
>>>>>>> e8cc4971c6 (Merge branch 'feature/postgis-fixes')
=======
>>>>>>> 30fda14bf2 (GEOMESA-3198 Kafka streams integration (#2854))
<<<<<<< HEAD
>>>>>>> 8d7834ec11 (GEOMESA-3198 Kafka streams integration (#2854))
=======
=======
>>>>>>> 41bda2df98 (GEOMESA-3198 Kafka streams integration (#2854))
<<<<<<< HEAD
>>>>>>> 965120b3ca (GEOMESA-3198 Kafka streams integration (#2854))
=======
=======
>>>>>>> d98371fa50 (GEOMESA-3198 Kafka streams integration (#2854))
<<<<<<< HEAD
>>>>>>> ec680351e0 (GEOMESA-3198 Kafka streams integration (#2854))
=======
=======
>>>>>>> 5fa4cd5eac (GEOMESA-3198 Kafka streams integration (#2854))
<<<<<<< HEAD
>>>>>>> 8ce502793e (GEOMESA-3198 Kafka streams integration (#2854))
=======
=======
>>>>>>> cb6bda89b6 (Merge branch 'feature/postgis-fixes')
<<<<<<< HEAD
>>>>>>> 26e5afc4ea (Merge branch 'feature/postgis-fixes')
=======
=======
>>>>>>> 09d87762c5 (GEOMESA-3254 Add Bloop build support)
<<<<<<< HEAD
>>>>>>> 63a045a753 (GEOMESA-3254 Add Bloop build support)
=======
=======
>>>>>>> c6591bc391 (GEOMESA-3198 Kafka streams integration (#2854))
<<<<<<< HEAD
>>>>>>> 4ae16a2980 (GEOMESA-3198 Kafka streams integration (#2854))
=======
=======
>>>>>>> 69fb98522c (GEOMESA-3198 Kafka streams integration (#2854))
<<<<<<< HEAD
>>>>>>> 3a0eb62fc5 (GEOMESA-3198 Kafka streams integration (#2854))
=======
=======
>>>>>>> 769842a4bf (GEOMESA-3198 Kafka streams integration (#2854))
<<<<<<< HEAD
>>>>>>> 320fc0eff4 (GEOMESA-3198 Kafka streams integration (#2854))
=======
=======
>>>>>>> 991d5c62a7 (GEOMESA-3198 Kafka streams integration (#2854))
<<<<<<< HEAD
>>>>>>> 55438fd78b (GEOMESA-3198 Kafka streams integration (#2854))
=======
=======
>>>>>>> 699117eca9 (Merge branch 'feature/postgis-fixes')
>>>>>>> c69897d7bd (Merge branch 'feature/postgis-fixes')

  // view type name -> actual type name
  private val layerViewLookup =
    config.layerViewsConfig.flatMap { case (typeName, views) => views.map(_.typeName -> typeName).toMap }
=======
>>>>>>> de758f45a (GEOMESA-3198 Kafka streams integration (#2854))

  // view type name -> actual type name
  private val layerViewLookup =
    config.layerViewsConfig.flatMap { case (typeName, views) => views.map(_.typeName -> typeName).toMap }
=======
>>>>>>> 4e12cd412 (GEOMESA-3198 Kafka streams integration (#2854))

  // view type name -> actual type name
  private val layerViewLookup =
    config.layerViewsConfig.flatMap { case (typeName, views) => views.map(_.typeName -> typeName).toMap }
=======
>>>>>>> de758f45a (GEOMESA-3198 Kafka streams integration (#2854))

  // view type name -> actual type name
  private val layerViewLookup =
    config.layerViewsConfig.flatMap { case (typeName, views) => views.map(_.typeName -> typeName).toMap }
=======
>>>>>>> d657014c8 (GEOMESA-3198 Kafka streams integration (#2854))
=======
>>>>>>> fc2f65fc3 (GEOMESA-3198 Kafka streams integration (#2854))

  // view type name -> actual type name
  private val layerViewLookup =
    config.layerViewsConfig.flatMap { case (typeName, views) => views.map(_.typeName -> typeName).toMap }
=======
>>>>>>> de758f45a (GEOMESA-3198 Kafka streams integration (#2854))

  // view type name -> actual type name
  private val layerViewLookup =
    config.layerViewsConfig.flatMap { case (typeName, views) => views.map(_.typeName -> typeName).toMap }
=======
>>>>>>> 4e12cd412 (GEOMESA-3198 Kafka streams integration (#2854))

  // view type name -> actual type name
  private val layerViewLookup =
    config.layerViewsConfig.flatMap { case (typeName, views) => views.map(_.typeName -> typeName).toMap }
=======
>>>>>>> de758f45a (GEOMESA-3198 Kafka streams integration (#2854))

  // view type name -> actual type name
  private val layerViewLookup =
    config.layerViewsConfig.flatMap { case (typeName, views) => views.map(_.typeName -> typeName).toMap }

  // view type name -> actual type name
  private val layerViewLookup =
    config.layerViewsConfig.flatMap { case (typeName, views) => views.map(_.typeName -> typeName).toMap }
<<<<<<< HEAD
<<<<<<< HEAD
=======
>>>>>>> 3be8d2a5a (Merge branch 'feature/postgis-fixes')
=======
<<<<<<< HEAD
>>>>>>> f01ac238e (GEOMESA-3198 Kafka streams integration (#2854))

  // view type name -> actual type name
  private val layerViewLookup =
    config.layerViewsConfig.flatMap { case (typeName, views) => views.map(_.typeName -> typeName).toMap }
=======
>>>>>>> de758f45a (GEOMESA-3198 Kafka streams integration (#2854))

  // view type name -> actual type name
  private val layerViewLookup =
    config.layerViewsConfig.flatMap { case (typeName, views) => views.map(_.typeName -> typeName).toMap }

  // view type name -> actual type name
  private val layerViewLookup =
    config.layerViewsConfig.flatMap { case (typeName, views) => views.map(_.typeName -> typeName).toMap }

  // view type name -> actual type name
  private val layerViewLookup =
    config.layerViewsConfig.flatMap { case (typeName, views) => views.map(_.typeName -> typeName).toMap }

  // view type name -> actual type name
  private val layerViewLookup =
    config.layerViewsConfig.flatMap { case (typeName, views) => views.map(_.typeName -> typeName).toMap }

  // view type name -> actual type name
  private val layerViewLookup =
    config.layerViewsConfig.flatMap { case (typeName, views) => views.map(_.typeName -> typeName).toMap }

  // view type name -> actual type name
  private val layerViewLookup =
    config.layerViewsConfig.flatMap { case (typeName, views) => views.map(_.typeName -> typeName).toMap }

  // view type name -> actual type name
  private val layerViewLookup =
    config.layerViewsConfig.flatMap { case (typeName, views) => views.map(_.typeName -> typeName).toMap }
=======
>>>>>>> 6f6887eb8 (GEOMESA-3100 Kafka layer views (#2784))
=======
=======
>>>>>>> 3be8d2a5a (Merge branch 'feature/postgis-fixes')
>>>>>>> e8cc4971c6 (Merge branch 'feature/postgis-fixes')
=======
>>>>>>> 1b8cbf843 (GEOMESA-3198 Kafka streams integration (#2854))
<<<<<<< HEAD
>>>>>>> 30fda14bf2 (GEOMESA-3198 Kafka streams integration (#2854))
=======
=======
>>>>>>> ecbc2cafc (GEOMESA-3198 Kafka streams integration (#2854))
<<<<<<< HEAD
>>>>>>> 41bda2df98 (GEOMESA-3198 Kafka streams integration (#2854))
=======
=======
>>>>>>> 3be3e5d3e (GEOMESA-3198 Kafka streams integration (#2854))
<<<<<<< HEAD
>>>>>>> d98371fa50 (GEOMESA-3198 Kafka streams integration (#2854))
=======
=======
>>>>>>> 7b8c9b548 (GEOMESA-3198 Kafka streams integration (#2854))
<<<<<<< HEAD
>>>>>>> 5fa4cd5eac (GEOMESA-3198 Kafka streams integration (#2854))
=======
=======
>>>>>>> db8d998aa (Merge branch 'feature/postgis-fixes')
>>>>>>> cb6bda89b6 (Merge branch 'feature/postgis-fixes')

  // view type name -> actual type name
  private val layerViewLookup =
    config.layerViewsConfig.flatMap { case (typeName, views) => views.map(_.typeName -> typeName).toMap }
=======
>>>>>>> de758f45a (GEOMESA-3198 Kafka streams integration (#2854))

  // view type name -> actual type name
  private val layerViewLookup =
    config.layerViewsConfig.flatMap { case (typeName, views) => views.map(_.typeName -> typeName).toMap }
=======
>>>>>>> 4e12cd412 (GEOMESA-3198 Kafka streams integration (#2854))

  // view type name -> actual type name
  private val layerViewLookup =
    config.layerViewsConfig.flatMap { case (typeName, views) => views.map(_.typeName -> typeName).toMap }
=======
>>>>>>> de758f45a (GEOMESA-3198 Kafka streams integration (#2854))

  // view type name -> actual type name
  private val layerViewLookup =
    config.layerViewsConfig.flatMap { case (typeName, views) => views.map(_.typeName -> typeName).toMap }
=======
>>>>>>> d657014c8 (GEOMESA-3198 Kafka streams integration (#2854))
=======
>>>>>>> fc2f65fc3 (GEOMESA-3198 Kafka streams integration (#2854))

  // view type name -> actual type name
  private val layerViewLookup =
    config.layerViewsConfig.flatMap { case (typeName, views) => views.map(_.typeName -> typeName).toMap }
=======
>>>>>>> de758f45a (GEOMESA-3198 Kafka streams integration (#2854))

  // view type name -> actual type name
  private val layerViewLookup =
    config.layerViewsConfig.flatMap { case (typeName, views) => views.map(_.typeName -> typeName).toMap }
=======
>>>>>>> 4e12cd412 (GEOMESA-3198 Kafka streams integration (#2854))

  // view type name -> actual type name
  private val layerViewLookup =
    config.layerViewsConfig.flatMap { case (typeName, views) => views.map(_.typeName -> typeName).toMap }
=======
>>>>>>> de758f45a (GEOMESA-3198 Kafka streams integration (#2854))

  // view type name -> actual type name
  private val layerViewLookup =
    config.layerViewsConfig.flatMap { case (typeName, views) => views.map(_.typeName -> typeName).toMap }

  // view type name -> actual type name
  private val layerViewLookup =
    config.layerViewsConfig.flatMap { case (typeName, views) => views.map(_.typeName -> typeName).toMap }
=======
>>>>>>> 3be8d2a5a (Merge branch 'feature/postgis-fixes')
=======
>>>>>>> d845d7c1b (GEOMESA-3254 Add Bloop build support)
=======
>>>>>>> 73f3a8cb6 (GEOMESA-3198 Kafka streams integration (#2854))
=======
>>>>>>> 29a2fa060 (GEOMESA-3198 Kafka streams integration (#2854))
=======
>>>>>>> eef10da74 (GEOMESA-3198 Kafka streams integration (#2854))
=======
>>>>>>> 8f51e1858 (GEOMESA-3198 Kafka streams integration (#2854))
=======
>>>>>>> 1b25d7ddb (Merge branch 'feature/postgis-fixes')

  // view type name -> actual type name
  private val layerViewLookup =
    config.layerViewsConfig.flatMap { case (typeName, views) => views.map(_.typeName -> typeName).toMap }
=======
>>>>>>> de758f45a (GEOMESA-3198 Kafka streams integration (#2854))

  // view type name -> actual type name
  private val layerViewLookup =
    config.layerViewsConfig.flatMap { case (typeName, views) => views.map(_.typeName -> typeName).toMap }
=======
>>>>>>> 4e12cd412 (GEOMESA-3198 Kafka streams integration (#2854))

  // view type name -> actual type name
  private val layerViewLookup =
    config.layerViewsConfig.flatMap { case (typeName, views) => views.map(_.typeName -> typeName).toMap }
=======
>>>>>>> de758f45a (GEOMESA-3198 Kafka streams integration (#2854))

  // view type name -> actual type name
  private val layerViewLookup =
    config.layerViewsConfig.flatMap { case (typeName, views) => views.map(_.typeName -> typeName).toMap }
=======
>>>>>>> d657014c8 (GEOMESA-3198 Kafka streams integration (#2854))
=======
>>>>>>> fc2f65fc3 (GEOMESA-3198 Kafka streams integration (#2854))

  // view type name -> actual type name
  private val layerViewLookup =
    config.layerViewsConfig.flatMap { case (typeName, views) => views.map(_.typeName -> typeName).toMap }
=======
>>>>>>> de758f45a (GEOMESA-3198 Kafka streams integration (#2854))

  // view type name -> actual type name
  private val layerViewLookup =
    config.layerViewsConfig.flatMap { case (typeName, views) => views.map(_.typeName -> typeName).toMap }
=======
>>>>>>> 4e12cd412 (GEOMESA-3198 Kafka streams integration (#2854))

  // view type name -> actual type name
  private val layerViewLookup =
    config.layerViewsConfig.flatMap { case (typeName, views) => views.map(_.typeName -> typeName).toMap }
=======
>>>>>>> de758f45a (GEOMESA-3198 Kafka streams integration (#2854))

  // view type name -> actual type name
  private val layerViewLookup =
    config.layerViewsConfig.flatMap { case (typeName, views) => views.map(_.typeName -> typeName).toMap }

  // view type name -> actual type name
  private val layerViewLookup =
    config.layerViewsConfig.flatMap { case (typeName, views) => views.map(_.typeName -> typeName).toMap }
=======
>>>>>>> 3be8d2a5a (Merge branch 'feature/postgis-fixes')
=======
>>>>>>> b09307f5c0 (GEOMESA-3198 Kafka streams integration (#2854))

  // view type name -> actual type name
  private val layerViewLookup =
    config.layerViewsConfig.flatMap { case (typeName, views) => views.map(_.typeName -> typeName).toMap }
=======
>>>>>>> de758f45a (GEOMESA-3198 Kafka streams integration (#2854))

  // view type name -> actual type name
  private val layerViewLookup =
    config.layerViewsConfig.flatMap { case (typeName, views) => views.map(_.typeName -> typeName).toMap }

  private val cleared = Collections.newSetFromMap(new ConcurrentHashMap[String, java.lang.Boolean]())

  private val caches = Caffeine.newBuilder().build[String, KafkaCacheLoader](new CacheLoader[String, KafkaCacheLoader] {
    override def load(key: String): KafkaCacheLoader = {
      if (config.consumers.count < 1) {
        logger.info("Kafka consumers disabled for this data store instance")
        KafkaCacheLoader.NoOpLoader
      } else {
        val sft = KafkaDataStore.super.getSchema(key)
        val views = config.layerViewsConfig.getOrElse(key, Seq.empty).map(KafkaDataStore.createLayerView(sft, _))
        // if the expiry is zero, this will return a NoOpFeatureCache
        val cache = KafkaFeatureCache(sft, config.indices, views, config.metrics)
        val topic = KafkaDataStore.topic(sft)
        val consumers = KafkaDataStore.consumers(config.brokers, topic, config.consumers)
        val frequency = KafkaDataStore.LoadIntervalProperty.toDuration.get.toMillis
        val serializer = serialization.apply(sft)
        val initialLoad = config.consumers.readBack.isDefined
        val expiry = config.indices.expiry
        new KafkaCacheLoaderImpl(sft, cache, consumers, topic, frequency, serializer, initialLoad, expiry)
      }
    }
  })

  private val runner = new KafkaQueryRunner(this, cache)
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
>>>>>>> 5a4c24e020 (GEOMESA-3254 Add Bloop build support)
=======
>>>>>>> d4039e3d9a (GEOMESA-3100 Kafka layer views (#2784))
=======
>>>>>>> ad362b1341 (GEOMESA-3100 Kafka layer views (#2784))
=======
=======
=======
=======
=======
<<<<<<< HEAD
<<<<<<< HEAD
=======
=======
=======
=======
>>>>>>> f1532f2313 (GEOMESA-3254 Add Bloop build support)
=======

<<<<<<< HEAD
  // migrate old schemas, if any
  if (!metadata.read("migration", "check").exists(_.toBoolean)) {
    new MetadataMigration(this, config.catalog, config.zookeepers).run()
    metadata.insert("migration", "check", "true")
  }
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
=======
=======
>>>>>>> ad362b1341 (GEOMESA-3100 Kafka layer views (#2784))

  // migrate old schemas, if any
  if (!metadata.read("migration", "check").exists(_.toBoolean)) {
    new MetadataMigration(this, config.catalog, config.zookeepers).run()
    metadata.insert("migration", "check", "true")
  }
>>>>>>> af0a88eb1 (GEOMESA-3100 Kafka layer views (#2784))
>>>>>>> 337ecd16e5 (GEOMESA-3100 Kafka layer views (#2784))
<<<<<<< HEAD
=======
>>>>>>> d4039e3d9a (GEOMESA-3100 Kafka layer views (#2784))
=======
>>>>>>> ad362b1341 (GEOMESA-3100 Kafka layer views (#2784))

  // migrate old schemas, if any
  if (!metadata.read("migration", "check").exists(_.toBoolean)) {
    new MetadataMigration(this, config.catalog, config.zookeepers).run()
    metadata.insert("migration", "check", "true")
  }
>>>>>>> af0a88eb1 (GEOMESA-3100 Kafka layer views (#2784))
>>>>>>> ccfb3bd95e (GEOMESA-3100 Kafka layer views (#2784))
<<<<<<< HEAD
=======
=======
=======
=======
>>>>>>> 3010fc384e (GEOMESA-3100 Kafka layer views (#2784))
=======
>>>>>>> d4039e3d9a (GEOMESA-3100 Kafka layer views (#2784))

  // migrate old schemas, if any
  if (!metadata.read("migration", "check").exists(_.toBoolean)) {
    new MetadataMigration(this, config.catalog, config.zookeepers).run()
    metadata.insert("migration", "check", "true")
  }
>>>>>>> af0a88eb1 (GEOMESA-3100 Kafka layer views (#2784))
>>>>>>> 17f13b3a7a (GEOMESA-3100 Kafka layer views (#2784))
<<<<<<< HEAD
<<<<<<< HEAD
=======
>>>>>>> 63a045a753 (GEOMESA-3254 Add Bloop build support)
=======
>>>>>>> 3010fc384e (GEOMESA-3100 Kafka layer views (#2784))
=======
=======
>>>>>>> 63a045a753 (GEOMESA-3254 Add Bloop build support)
>>>>>>> 5a4c24e020 (GEOMESA-3254 Add Bloop build support)

<<<<<<< HEAD
  // migrate old schemas, if any
  if (!metadata.read("migration", "check").exists(_.toBoolean)) {
    new MetadataMigration(this, config.catalog, config.zookeepers).run()
    metadata.insert("migration", "check", "true")
  }
<<<<<<< HEAD
>>>>>>> af0a88eb17 (GEOMESA-3100 Kafka layer views (#2784))
=======
>>>>>>> af0a88eb1 (GEOMESA-3100 Kafka layer views (#2784))
>>>>>>> a0314fb7ff (GEOMESA-3100 Kafka layer views (#2784))
=======
>>>>>>> d845d7c1bd (GEOMESA-3254 Add Bloop build support)

=======
>>>>>>> 58d14a257e (GEOMESA-3254 Add Bloop build support)
  /**
    * Start consuming from all topics. Consumers are normally only started for a simple feature type
    * when it is first queried - this will start them immediately.
    */
  def startAllConsumers(): Unit = super.getTypeNames.foreach(caches.get)

  /**
   * Create a message consumer for the given feature type. This can be used for guaranteed at-least-once
   * message processing
   *
   * @param typeName type name
   * @param groupId consumer group id
   * @param processor message processor
   * @return
   */
  def createConsumer(typeName: String, groupId: String, processor: GeoMessageProcessor): Closeable =
    createConsumer(typeName, groupId, processor, None)

  /**
   * Create a message consumer for the given feature type. This can be used for guaranteed at-least-once
   * message processing
   *
   * @param typeName type name
   * @param groupId consumer group id
   * @param processor message processor
   * @param errorHandler error handler
   * @return
   */
  def createConsumer(
      typeName: String,
      groupId: String,
      processor: GeoMessageProcessor,
      errorHandler: Option[ConsumerErrorHandler]): Closeable = {
    val sft = getSchema(typeName)
    if (sft == null) {
      throw new IllegalArgumentException(s"Schema '$typeName' does not exist; call `createSchema` first")
    }
    val topic = KafkaDataStore.topic(sft)
    val consumers = {
      // add group id and
      // disable read-back so we don't trigger a re-balance listener that messes with group offset tracking
      val props = config.consumers.properties + (GROUP_ID_CONFIG -> groupId)
      val conf = config.consumers.copy(properties = props, readBack = None)
      KafkaDataStore.consumers(config.brokers, topic, conf)
    }
    val frequency = java.time.Duration.ofMillis(KafkaDataStore.LoadIntervalProperty.toDuration.get.toMillis)
    val serializer = serialization.apply(sft)
    val consumer = new GeoMessageConsumer(consumers, frequency, serializer, processor)
    consumer.startConsumers(errorHandler)
    consumer
  }

  override def getSchema(typeName: String): SimpleFeatureType = {
    layerViewLookup.get(typeName) match {
      case None => super.getSchema(typeName)
      case Some(orig) =>
        val parent = super.getSchema(orig)
        if (parent == null) {
          logger.warn(s"Backing schema '$orig' for configured layer view '$typeName' does not exist")
          null
        } else {
          val view = config.layerViewsConfig.get(orig).flatMap(_.find(_.typeName == typeName)).getOrElse {
            // this should be impossible since we created the lookup from the view config
            throw new IllegalStateException("Inconsistent layer view config")
          }
          KafkaDataStore.createLayerView(parent, view).viewSft
        }
    }
  }

  override def getTypeNames: Array[String] = {
    val nonViews = super.getTypeNames
    nonViews ++ layerViewLookup.toArray.flatMap { case (k, v) =>
      if (nonViews.contains(v)) {
        Some(k)
      } else {
        logger.warn(s"Backing schema '$v' for configured layer view '$k' does not exist")
        None
      }
    }
  }

  @throws(classOf[IllegalArgumentException])
  override protected def preSchemaCreate(sft: SimpleFeatureType): Unit = {
    // note: kafka doesn't allow slashes in topic names
    KafkaDataStore.topic(sft) match {
      case null  => KafkaDataStore.setTopic(sft, s"${config.catalog}-${sft.getTypeName}".replaceAll("/", "-"))
      case topic if topic.contains("/") => throw new IllegalArgumentException(s"Topic cannot contain '/': $topic")
      case topic => logger.debug(s"Using user-defined topic [$topic]")
    }
    // disable our custom partitioner by default, as it messes with Kafka streams co-partition joining
    // and it's not required since we switched our keys to be feature ids
    if (!sft.getUserData.containsKey(KafkaDataStore.PartitioningKey)) {
      sft.getUserData.put(KafkaDataStore.PartitioningKey, KafkaDataStore.PartitioningDefault)
    }
    // remove table sharing as it's not relevant
    sft.getUserData.remove(TableSharing)
    sft.getUserData.remove(TableSharingPrefix)
  }

  @throws(classOf[IllegalArgumentException])
  override protected def preSchemaUpdate(sft: SimpleFeatureType, previous: SimpleFeatureType): Unit = {
    if (layerViewLookup.contains(sft.getTypeName)) {
      throw new IllegalArgumentException(
        s"Schema '${sft.getTypeName}' is a read-only view of '${layerViewLookup(sft.getTypeName)}'")
    }
    val topic = KafkaDataStore.topic(sft)
    if (topic == null) {
      throw new IllegalArgumentException(s"Topic must be defined in user data under '$TopicKey'")
    } else if (topic != KafkaDataStore.topic(previous)) {
      if (topic.contains("/")) {
        throw new IllegalArgumentException(s"Topic cannot contain '/': $topic")
      }
      onSchemaDeleted(previous)
      onSchemaCreated(sft)
    }
  }

  // create kafka topic
  override protected def onSchemaCreated(sft: SimpleFeatureType): Unit = {
    val topic = KafkaDataStore.topic(sft)
    val props = new Properties()
    props.put(AdminClientConfig.BOOTSTRAP_SERVERS_CONFIG, config.brokers)
    config.producers.properties.foreach { case (k, v) => props.put(k, v) }

    WithClose(AdminClient.create(props)) { admin =>
      if (admin.listTopics().names().get.contains(topic)) {
        logger.warn(
          s"Topic [$topic] already exists - it may contain invalid data and/or not " +
              "match the expected topic configuration")
      } else {
        val newTopic =
          new NewTopic(topic, config.topics.partitions, config.topics.replication.toShort)
              .configs(KafkaDataStore.topicConfig(sft))
        admin.createTopics(Collections.singletonList(newTopic)).all().get
      }
    }
  }

  // invalidate any cached consumers in order to reload the new schema
  override protected def onSchemaUpdated(sft: SimpleFeatureType, previous: SimpleFeatureType): Unit = {
    Option(caches.getIfPresent(sft.getTypeName)).foreach { cache =>
      cache.close()
      caches.invalidate(sft.getTypeName)
    }
  }

  // stop consumers and delete kafka topic
  override protected def onSchemaDeleted(sft: SimpleFeatureType): Unit = {
    if (layerViewLookup.contains(sft.getTypeName)) {
      throw new IllegalArgumentException(
        s"Schema '${sft.getTypeName}' is a read-only view of '${layerViewLookup(sft.getTypeName)}'")
    }
    Option(caches.getIfPresent(sft.getTypeName)).foreach { cache =>
      cache.close()
      caches.invalidate(sft.getTypeName)
    }
    val topic = KafkaDataStore.topic(sft)
    val props = new Properties()
    props.put(AdminClientConfig.BOOTSTRAP_SERVERS_CONFIG, config.brokers)
    config.producers.properties.foreach { case (k, v) => props.put(k, v) }

    WithClose(AdminClient.create(props)) { admin =>
      if (admin.listTopics().names().get.contains(topic)) {
        admin.deleteTopics(Collections.singletonList(topic)).all().get
      } else {
        logger.warn(s"Topic [$topic] does not exist, can't delete it")
      }
    }
  }

  /**
    * @see org.geotools.api.data.DataStore#getFeatureSource(org.geotools.api.feature.type.Name)
    * @param typeName simple feature type name
    * @return featureStore, suitable for reading and writing
    */
  override def getFeatureSource(typeName: String): SimpleFeatureStore = {
    val sft = getSchema(typeName)
    if (sft == null) {
      throw new IOException(s"Schema '$typeName' has not been initialized. Please call 'createSchema' first.")
    }
<<<<<<< HEAD
    new KafkaFeatureStore(this, sft, cache(typeName))
  }

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
>>>>>>> 66bdd8fd8d (GEOMESA-3100 Kafka layer views (#2784))
=======
>>>>>>> 92dc7a8411 (GEOMESA-3100 Kafka layer views (#2784))
=======
>>>>>>> de8804123e (GEOMESA-3100 Kafka layer views (#2784))
=======
>>>>>>> 117b13aaaa (GEOMESA-3100 Kafka layer views (#2784))
=======
>>>>>>> 67de3c3202 (Merge branch 'feature/postgis-fixes')
=======
>>>>>>> a94a1be83c (GEOMESA-3100 Kafka layer views (#2784))
=======
>>>>>>> c61bffed00 (GEOMESA-3100 Kafka layer views (#2784))
=======
>>>>>>> 89f0c9f2c3 (GEOMESA-3100 Kafka layer views (#2784))
=======
>>>>>>> 750ebbabe7 (GEOMESA-3100 Kafka layer views (#2784))
=======
>>>>>>> 638b68d081 (Merge branch 'feature/postgis-fixes')
=======
>>>>>>> cc8b9d0320 (GEOMESA-3100 Kafka layer views (#2784))
=======
>>>>>>> c64e652363 (GEOMESA-3100 Kafka layer views (#2784))
=======
>>>>>>> 43ac4062d9 (GEOMESA-3100 Kafka layer views (#2784))
=======
>>>>>>> 39d28fffcb (GEOMESA-3100 Kafka layer views (#2784))
=======
>>>>>>> 71adb695c5 (Merge branch 'feature/postgis-fixes')
=======
>>>>>>> 5a4c24e020 (GEOMESA-3254 Add Bloop build support)
=======
>>>>>>> e74fa3f690 (GEOMESA-3254 Add Bloop build support)
=======
>>>>>>> 64b99590af (GEOMESA-3100 Kafka layer views (#2784))
=======
>>>>>>> 41df6a2aa3 (GEOMESA-3100 Kafka layer views (#2784))
=======
>>>>>>> 340134cdda (GEOMESA-3100 Kafka layer views (#2784))
=======
>>>>>>> 72ec0b2107 (GEOMESA-3100 Kafka layer views (#2784))
=======
>>>>>>> 30559ea5c9 (Merge branch 'feature/postgis-fixes')
=======
>>>>>>> 13347c6405 (GEOMESA-3100 Kafka layer views (#2784))
  override private[geomesa] def getFeatureReader(
=======
<<<<<<< HEAD
=======
>>>>>>> bddfdbea54 (GEOMESA-3100 Kafka layer views (#2784))
=======
>>>>>>> 95c83ca7fa (GEOMESA-3100 Kafka layer views (#2784))
=======
>>>>>>> d2cb939f51 (GEOMESA-3100 Kafka layer views (#2784))
=======
>>>>>>> 3be8d2a5a4 (Merge branch 'feature/postgis-fixes')
  private[geomesa] def getFeatureReader(
>>>>>>> f7038468b7 (GEOMESA-3100 Kafka layer views (#2784))
=======
  override private[geomesa] def getFeatureReader(
>>>>>>> 58d14a257e (GEOMESA-3254 Add Bloop build support)
      sft: SimpleFeatureType,
      transaction: Transaction,
      query: Query): GeoMesaFeatureReader = {
<<<<<<< HEAD
=======
=======
>>>>>>> 862857ce2e (GEOMESA-3100 Kafka layer views (#2784))
=======
>>>>>>> 4231e686dd (GEOMESA-3100 Kafka layer views (#2784))
=======
>>>>>>> 6af71ff432 (GEOMESA-3100 Kafka layer views (#2784))
=======
>>>>>>> db8d998aa2 (Merge branch 'feature/postgis-fixes')
=======
>>>>>>> d845d7c1bd (GEOMESA-3254 Add Bloop build support)
=======
>>>>>>> d2002b5afd (GEOMESA-3100 Kafka layer views (#2784))
<<<<<<< HEAD
<<<<<<< HEAD
=======
>>>>>>> c589b832a5 (GEOMESA-3100 Kafka layer views (#2784))
=======
>>>>>>> fa68dd43c6 (GEOMESA-3100 Kafka layer views (#2784))
<<<<<<< HEAD
<<<<<<< HEAD
=======
>>>>>>> 89fb9950ef (GEOMESA-3100 Kafka layer views (#2784))
=======
>>>>>>> 1b25d7ddb4 (Merge branch 'feature/postgis-fixes')
<<<<<<< HEAD
<<<<<<< HEAD
=======
>>>>>>> f3ae53295d (GEOMESA-3100 Kafka layer views (#2784))
=======
=======
>>>>>>> 1a5f68233 (GEOMESA-3100 Kafka layer views (#2784))
>>>>>>> dae1cf3cef (GEOMESA-3100 Kafka layer views (#2784))
<<<<<<< HEAD
<<<<<<< HEAD
=======
=======
>>>>>>> a377061090 (GEOMESA-3100 Kafka layer views (#2784))
=======
>>>>>>> e944f1c88b (Merge branch 'feature/postgis-fixes')
=======
<<<<<<< HEAD
<<<<<<< HEAD
>>>>>>> 814854c5db (GEOMESA-3100 Kafka layer views (#2784))
=======
>>>>>>> 7bdc1feea8 (GEOMESA-3100 Kafka layer views (#2784))
=======
<<<<<<< HEAD
<<<<<<< HEAD
>>>>>>> 3977ecc140 (GEOMESA-3100 Kafka layer views (#2784))
=======
>>>>>>> 416a95a4c0 (GEOMESA-3100 Kafka layer views (#2784))
=======
<<<<<<< HEAD
<<<<<<< HEAD
>>>>>>> 26e5afc4ea (Merge branch 'feature/postgis-fixes')
=======
>>>>>>> 63a045a753 (GEOMESA-3254 Add Bloop build support)
=======
<<<<<<< HEAD
<<<<<<< HEAD
>>>>>>> fa60953a42 (GEOMESA-3254 Add Bloop build support)
=======
>>>>>>> 314efe4dee (GEOMESA-3100 Kafka layer views (#2784))
=======
<<<<<<< HEAD
<<<<<<< HEAD
>>>>>>> 2750a5beef (GEOMESA-3100 Kafka layer views (#2784))
=======
>>>>>>> 468da42855 (GEOMESA-3100 Kafka layer views (#2784))
=======
<<<<<<< HEAD
<<<<<<< HEAD
>>>>>>> f340d6feab (GEOMESA-3100 Kafka layer views (#2784))
=======
>>>>>>> c69897d7bd (Merge branch 'feature/postgis-fixes')
=======
<<<<<<< HEAD
=======
>>>>>>> 638b68d081 (Merge branch 'feature/postgis-fixes')
=======
>>>>>>> 814854c5db (GEOMESA-3100 Kafka layer views (#2784))
=======
>>>>>>> cc8b9d0320 (GEOMESA-3100 Kafka layer views (#2784))
=======
>>>>>>> c64e652363 (GEOMESA-3100 Kafka layer views (#2784))
=======
>>>>>>> 3977ecc140 (GEOMESA-3100 Kafka layer views (#2784))
=======
>>>>>>> 43ac4062d9 (GEOMESA-3100 Kafka layer views (#2784))
=======
>>>>>>> 39d28fffcb (GEOMESA-3100 Kafka layer views (#2784))
=======
>>>>>>> 26e5afc4ea (Merge branch 'feature/postgis-fixes')
=======
>>>>>>> 71adb695c5 (Merge branch 'feature/postgis-fixes')
=======
>>>>>>> 5a4c24e020 (GEOMESA-3254 Add Bloop build support)
=======
>>>>>>> fa60953a42 (GEOMESA-3254 Add Bloop build support)
=======
>>>>>>> e74fa3f690 (GEOMESA-3254 Add Bloop build support)
=======
>>>>>>> 64b99590af (GEOMESA-3100 Kafka layer views (#2784))
=======
>>>>>>> 2750a5beef (GEOMESA-3100 Kafka layer views (#2784))
=======
>>>>>>> 41df6a2aa3 (GEOMESA-3100 Kafka layer views (#2784))
=======
>>>>>>> 340134cdda (GEOMESA-3100 Kafka layer views (#2784))
=======
>>>>>>> f340d6feab (GEOMESA-3100 Kafka layer views (#2784))
=======
>>>>>>> 72ec0b2107 (GEOMESA-3100 Kafka layer views (#2784))
=======
>>>>>>> 30559ea5c9 (Merge branch 'feature/postgis-fixes')
>>>>>>> 1a5f68233 (GEOMESA-3100 Kafka layer views (#2784))
=======
>>>>>>> 65a3a6e36 (GEOMESA-3100 Kafka layer views (#2784))
<<<<<<< HEAD
>>>>>>> 9e910620b3 (GEOMESA-3100 Kafka layer views (#2784))
=======
=======
>>>>>>> 42549e8e3 (GEOMESA-3100 Kafka layer views (#2784))
<<<<<<< HEAD
>>>>>>> a377061090 (GEOMESA-3100 Kafka layer views (#2784))
=======
=======
>>>>>>> e8cc4971c6 (Merge branch 'feature/postgis-fixes')
<<<<<<< HEAD
<<<<<<< HEAD
<<<<<<< HEAD
=======
>>>>>>> cc8b9d0320 (GEOMESA-3100 Kafka layer views (#2784))
>>>>>>> e944f1c88b (Merge branch 'feature/postgis-fixes')
=======
=======
>>>>>>> 06956ccf98 (GEOMESA-3100 Kafka layer views (#2784))
<<<<<<< HEAD
<<<<<<< HEAD
<<<<<<< HEAD
=======
>>>>>>> c64e652363 (GEOMESA-3100 Kafka layer views (#2784))
>>>>>>> 814854c5db (GEOMESA-3100 Kafka layer views (#2784))
=======
=======
=======
>>>>>>> 862857ce2 (GEOMESA-3100 Kafka layer views (#2784))
>>>>>>> 8b9e99d11a (GEOMESA-3100 Kafka layer views (#2784))
<<<<<<< HEAD
<<<<<<< HEAD
<<<<<<< HEAD
=======
>>>>>>> 43ac4062d9 (GEOMESA-3100 Kafka layer views (#2784))
>>>>>>> 7bdc1feea8 (GEOMESA-3100 Kafka layer views (#2784))
=======
=======
=======
<<<<<<< HEAD
<<<<<<< HEAD
>>>>>>> 23a7d9849f (GEOMESA-3100 Kafka layer views (#2784))
=======
>>>>>>> cb6bda89b6 (Merge branch 'feature/postgis-fixes')
=======
<<<<<<< HEAD
<<<<<<< HEAD
>>>>>>> 09d87762c5 (GEOMESA-3254 Add Bloop build support)
=======
>>>>>>> 1dae86c846 (GEOMESA-3254 Add Bloop build support)
=======
<<<<<<< HEAD
<<<<<<< HEAD
>>>>>>> d5f6f5af59 (GEOMESA-3100 Kafka layer views (#2784))
=======
>>>>>>> 9e433ba57e (GEOMESA-3100 Kafka layer views (#2784))
=======
<<<<<<< HEAD
<<<<<<< HEAD
>>>>>>> 23f312535d (GEOMESA-3100 Kafka layer views (#2784))
=======
>>>>>>> bc97b07a31 (GEOMESA-3100 Kafka layer views (#2784))
=======
<<<<<<< HEAD
<<<<<<< HEAD
>>>>>>> 699117eca9 (Merge branch 'feature/postgis-fixes')
=======
=======
>>>>>>> 71adb695c5 (Merge branch 'feature/postgis-fixes')
=======
>>>>>>> 09d87762c5 (GEOMESA-3254 Add Bloop build support)
=======
>>>>>>> 5a4c24e020 (GEOMESA-3254 Add Bloop build support)
=======
>>>>>>> e74fa3f690 (GEOMESA-3254 Add Bloop build support)
=======
>>>>>>> d5f6f5af59 (GEOMESA-3100 Kafka layer views (#2784))
=======
>>>>>>> 64b99590af (GEOMESA-3100 Kafka layer views (#2784))
=======
>>>>>>> 41df6a2aa3 (GEOMESA-3100 Kafka layer views (#2784))
=======
>>>>>>> 23f312535d (GEOMESA-3100 Kafka layer views (#2784))
=======
>>>>>>> 340134cdda (GEOMESA-3100 Kafka layer views (#2784))
=======
>>>>>>> 72ec0b2107 (GEOMESA-3100 Kafka layer views (#2784))
=======
>>>>>>> 699117eca9 (Merge branch 'feature/postgis-fixes')
=======
>>>>>>> 30559ea5c9 (Merge branch 'feature/postgis-fixes')
>>>>>>> 862857ce2 (GEOMESA-3100 Kafka layer views (#2784))
=======
>>>>>>> 4231e686d (GEOMESA-3100 Kafka layer views (#2784))
<<<<<<< HEAD
>>>>>>> 69e3273ac1 (GEOMESA-3100 Kafka layer views (#2784))
<<<<<<< HEAD
>>>>>>> 3977ecc140 (GEOMESA-3100 Kafka layer views (#2784))
=======
=======
=======
>>>>>>> 6af71ff43 (GEOMESA-3100 Kafka layer views (#2784))
<<<<<<< HEAD
<<<<<<< HEAD
>>>>>>> 23a7d9849f (GEOMESA-3100 Kafka layer views (#2784))
<<<<<<< HEAD
>>>>>>> 416a95a4c0 (GEOMESA-3100 Kafka layer views (#2784))
=======
=======
=======
>>>>>>> db8d998aa (Merge branch 'feature/postgis-fixes')
<<<<<<< HEAD
<<<<<<< HEAD
>>>>>>> cb6bda89b6 (Merge branch 'feature/postgis-fixes')
<<<<<<< HEAD
>>>>>>> 26e5afc4ea (Merge branch 'feature/postgis-fixes')
=======
=======
=======
>>>>>>> c589b832a (GEOMESA-3100 Kafka layer views (#2784))
<<<<<<< HEAD
<<<<<<< HEAD
>>>>>>> 9e433ba57e (GEOMESA-3100 Kafka layer views (#2784))
<<<<<<< HEAD
>>>>>>> 2750a5beef (GEOMESA-3100 Kafka layer views (#2784))
=======
=======
=======
>>>>>>> fa68dd43c (GEOMESA-3100 Kafka layer views (#2784))
<<<<<<< HEAD
<<<<<<< HEAD
>>>>>>> 23f312535d (GEOMESA-3100 Kafka layer views (#2784))
<<<<<<< HEAD
>>>>>>> 468da42855 (GEOMESA-3100 Kafka layer views (#2784))
=======
=======
=======
>>>>>>> 89fb9950e (GEOMESA-3100 Kafka layer views (#2784))
<<<<<<< HEAD
<<<<<<< HEAD
>>>>>>> bc97b07a31 (GEOMESA-3100 Kafka layer views (#2784))
<<<<<<< HEAD
>>>>>>> f340d6feab (GEOMESA-3100 Kafka layer views (#2784))
=======
=======
=======
>>>>>>> 1b25d7ddb (Merge branch 'feature/postgis-fixes')
>>>>>>> 699117eca9 (Merge branch 'feature/postgis-fixes')
>>>>>>> c69897d7bd (Merge branch 'feature/postgis-fixes')
  override private[geomesa] def getFeatureReader(
=======
<<<<<<< HEAD
=======
>>>>>>> bddfdbea5 (GEOMESA-3100 Kafka layer views (#2784))
<<<<<<< HEAD
<<<<<<< HEAD
<<<<<<< HEAD
<<<<<<< HEAD
<<<<<<< HEAD
<<<<<<< HEAD
=======
>>>>>>> 8b9e99d11a (GEOMESA-3100 Kafka layer views (#2784))
=======
>>>>>>> 69e3273ac1 (GEOMESA-3100 Kafka layer views (#2784))
=======
>>>>>>> 9e433ba57e (GEOMESA-3100 Kafka layer views (#2784))
=======
>>>>>>> 23f312535d (GEOMESA-3100 Kafka layer views (#2784))
=======
>>>>>>> 95c83ca7f (GEOMESA-3100 Kafka layer views (#2784))
=======
>>>>>>> d2cb939f5 (GEOMESA-3100 Kafka layer views (#2784))
<<<<<<< HEAD
<<<<<<< HEAD
<<<<<<< HEAD
<<<<<<< HEAD
<<<<<<< HEAD
<<<<<<< HEAD
=======
>>>>>>> 23a7d9849f (GEOMESA-3100 Kafka layer views (#2784))
=======
>>>>>>> cb6bda89b6 (Merge branch 'feature/postgis-fixes')
=======
>>>>>>> bc97b07a31 (GEOMESA-3100 Kafka layer views (#2784))
=======
>>>>>>> 699117eca9 (Merge branch 'feature/postgis-fixes')
=======
>>>>>>> 3be8d2a5a (Merge branch 'feature/postgis-fixes')
=======
  override private[geomesa] def getFeatureReader(
=======
<<<<<<< HEAD
<<<<<<< HEAD
>>>>>>> e1f939a3e (GEOMESA-3100 Kafka layer views (#2784))
=======
>>>>>>> 1a5f68233 (GEOMESA-3100 Kafka layer views (#2784))
=======
=======
>>>>>>> 95c83ca7f (GEOMESA-3100 Kafka layer views (#2784))
>>>>>>> 65a3a6e36 (GEOMESA-3100 Kafka layer views (#2784))
=======
>>>>>>> 42549e8e3 (GEOMESA-3100 Kafka layer views (#2784))
=======
=======
>>>>>>> 3be8d2a5a (Merge branch 'feature/postgis-fixes')
>>>>>>> e8cc4971c6 (Merge branch 'feature/postgis-fixes')
=======
>>>>>>> 9bda77cfe (GEOMESA-3100 Kafka layer views (#2784))
<<<<<<< HEAD
>>>>>>> 06956ccf98 (GEOMESA-3100 Kafka layer views (#2784))
=======
=======
>>>>>>> 862857ce2 (GEOMESA-3100 Kafka layer views (#2784))
<<<<<<< HEAD
>>>>>>> 8b9e99d11a (GEOMESA-3100 Kafka layer views (#2784))
=======
=======
=======
>>>>>>> 95c83ca7f (GEOMESA-3100 Kafka layer views (#2784))
>>>>>>> 4231e686d (GEOMESA-3100 Kafka layer views (#2784))
<<<<<<< HEAD
>>>>>>> 69e3273ac1 (GEOMESA-3100 Kafka layer views (#2784))
=======
=======
>>>>>>> 6af71ff43 (GEOMESA-3100 Kafka layer views (#2784))
<<<<<<< HEAD
>>>>>>> 23a7d9849f (GEOMESA-3100 Kafka layer views (#2784))
=======
=======
=======
>>>>>>> 3be8d2a5a (Merge branch 'feature/postgis-fixes')
>>>>>>> db8d998aa (Merge branch 'feature/postgis-fixes')
<<<<<<< HEAD
>>>>>>> cb6bda89b6 (Merge branch 'feature/postgis-fixes')
=======
=======
>>>>>>> c589b832a (GEOMESA-3100 Kafka layer views (#2784))
<<<<<<< HEAD
>>>>>>> 9e433ba57e (GEOMESA-3100 Kafka layer views (#2784))
=======
=======
=======
>>>>>>> 95c83ca7f (GEOMESA-3100 Kafka layer views (#2784))
>>>>>>> fa68dd43c (GEOMESA-3100 Kafka layer views (#2784))
<<<<<<< HEAD
>>>>>>> 23f312535d (GEOMESA-3100 Kafka layer views (#2784))
=======
=======
>>>>>>> 89fb9950e (GEOMESA-3100 Kafka layer views (#2784))
<<<<<<< HEAD
>>>>>>> bc97b07a31 (GEOMESA-3100 Kafka layer views (#2784))
=======
=======
=======
>>>>>>> 3be8d2a5a (Merge branch 'feature/postgis-fixes')
>>>>>>> 1b25d7ddb (Merge branch 'feature/postgis-fixes')
>>>>>>> 699117eca9 (Merge branch 'feature/postgis-fixes')
  private[geomesa] def getFeatureReader(
>>>>>>> f7038468b (GEOMESA-3100 Kafka layer views (#2784))
=======
  override private[geomesa] def getFeatureReader(
>>>>>>> 58d14a257 (GEOMESA-3254 Add Bloop build support)
      sft: SimpleFeatureType,
      transaction: Transaction,
      query: Query): GeoMesaFeatureReader = {
<<<<<<< HEAD
<<<<<<< HEAD
<<<<<<< HEAD
<<<<<<< HEAD
<<<<<<< HEAD
<<<<<<< HEAD
<<<<<<< HEAD
<<<<<<< HEAD
<<<<<<< HEAD
>>>>>>> 9bda77cfe3 (GEOMESA-3100 Kafka layer views (#2784))
=======
<<<<<<< HEAD
>>>>>>> db8d998aa2 (Merge branch 'feature/postgis-fixes')
=======
>>>>>>> d2002b5afd (GEOMESA-3100 Kafka layer views (#2784))
=======
>>>>>>> 1b25d7ddb4 (Merge branch 'feature/postgis-fixes')
=======
=======
>>>>>>> e944f1c88b (Merge branch 'feature/postgis-fixes')
=======
>>>>>>> 814854c5db (GEOMESA-3100 Kafka layer views (#2784))
=======
>>>>>>> 26e5afc4ea (Merge branch 'feature/postgis-fixes')
=======
>>>>>>> c69897d7bd (Merge branch 'feature/postgis-fixes')
=======
>>>>>>> e1f939a3e (GEOMESA-3100 Kafka layer views (#2784))
>>>>>>> f3ae53295d (GEOMESA-3100 Kafka layer views (#2784))
=======
>>>>>>> e8cc4971c6 (Merge branch 'feature/postgis-fixes')
=======
=======
>>>>>>> cb6bda89b6 (Merge branch 'feature/postgis-fixes')
=======
>>>>>>> 699117eca9 (Merge branch 'feature/postgis-fixes')
=======
>>>>>>> 9bda77cfe (GEOMESA-3100 Kafka layer views (#2784))
>>>>>>> 06956ccf98 (GEOMESA-3100 Kafka layer views (#2784))
=======
>>>>>>> db8d998aa (Merge branch 'feature/postgis-fixes')
=======
>>>>>>> 1b25d7ddb (Merge branch 'feature/postgis-fixes')
=======
<<<<<<< HEAD
=======
>>>>>>> 12fe94b860 (GEOMESA-3100 Kafka layer views (#2784))
=======
>>>>>>> 19aa61c0de (GEOMESA-3100 Kafka layer views (#2784))
=======
>>>>>>> 305a9263eb (GEOMESA-3100 Kafka layer views (#2784))
=======
>>>>>>> da00c7bd68 (Merge branch 'feature/postgis-fixes')
  override private[geomesa] def getFeatureReader(
=======
<<<<<<< HEAD
=======
>>>>>>> bddfdbea5 (GEOMESA-3100 Kafka layer views (#2784))
=======
>>>>>>> 95c83ca7f (GEOMESA-3100 Kafka layer views (#2784))
=======
>>>>>>> d2cb939f5 (GEOMESA-3100 Kafka layer views (#2784))
=======
>>>>>>> 3be8d2a5a (Merge branch 'feature/postgis-fixes')
=======
  override private[geomesa] def getFeatureReader(
=======
<<<<<<< HEAD
>>>>>>> 13347c6405 (GEOMESA-3100 Kafka layer views (#2784))
  private[geomesa] def getFeatureReader(
>>>>>>> f7038468b (GEOMESA-3100 Kafka layer views (#2784))
      sft: SimpleFeatureType,
      transaction: Transaction,
      query: Query): GeoMesaFeatureReader = {
<<<<<<< HEAD
<<<<<<< HEAD
>>>>>>> 69287f5812 (GEOMESA-3100 Kafka layer views (#2784))
=======
<<<<<<< HEAD
>>>>>>> da00c7bd68 (Merge branch 'feature/postgis-fixes')
=======
=======
>>>>>>> 5dc1f86700 (GEOMESA-3100 Kafka layer views (#2784))
=======
>>>>>>> ad0d29873e (GEOMESA-3100 Kafka layer views (#2784))
=======
>>>>>>> 4516873dab (GEOMESA-3100 Kafka layer views (#2784))
=======
>>>>>>> 34472778d3 (Merge branch 'feature/postgis-fixes')
=======
>>>>>>> 64da8137f1 (GEOMESA-3100 Kafka layer views (#2784))
=======
>>>>>>> 6e453fd3d0 (GEOMESA-3100 Kafka layer views (#2784))
=======
>>>>>>> d309fbbbbf (GEOMESA-3100 Kafka layer views (#2784))
=======
>>>>>>> 885048dd7d (GEOMESA-3100 Kafka layer views (#2784))
=======
>>>>>>> 42e8565e9b (Merge branch 'feature/postgis-fixes')
=======
>>>>>>> f1532f2313 (GEOMESA-3254 Add Bloop build support)
=======
>>>>>>> 7564665969 (GEOMESA-3254 Add Bloop build support)
  override private[geomesa] def getFeatureReader(
=======
<<<<<<< HEAD
=======
>>>>>>> bddfdbea54 (GEOMESA-3100 Kafka layer views (#2784))
=======
>>>>>>> 95c83ca7fa (GEOMESA-3100 Kafka layer views (#2784))
=======
>>>>>>> d2cb939f51 (GEOMESA-3100 Kafka layer views (#2784))
=======
>>>>>>> 3be8d2a5a4 (Merge branch 'feature/postgis-fixes')
  private[geomesa] def getFeatureReader(
>>>>>>> f7038468b7 (GEOMESA-3100 Kafka layer views (#2784))
=======
  override private[geomesa] def getFeatureReader(
>>>>>>> 58d14a257e (GEOMESA-3254 Add Bloop build support)
      sft: SimpleFeatureType,
      transaction: Transaction,
      query: Query): GeoMesaFeatureReader = {
<<<<<<< HEAD
>>>>>>> 984dd84de9 (GEOMESA-3100 Kafka layer views (#2784))
=======
<<<<<<< HEAD
>>>>>>> 34472778d3 (Merge branch 'feature/postgis-fixes')
=======
=======
>>>>>>> 862857ce2e (GEOMESA-3100 Kafka layer views (#2784))
=======
>>>>>>> 4231e686dd (GEOMESA-3100 Kafka layer views (#2784))
=======
>>>>>>> 6af71ff432 (GEOMESA-3100 Kafka layer views (#2784))
=======
>>>>>>> db8d998aa2 (Merge branch 'feature/postgis-fixes')
=======
>>>>>>> d845d7c1bd (GEOMESA-3254 Add Bloop build support)
=======
>>>>>>> 66bdd8fd8d (GEOMESA-3100 Kafka layer views (#2784))
=======
=======
>>>>>>> c589b832a5 (GEOMESA-3100 Kafka layer views (#2784))
>>>>>>> 92dc7a8411 (GEOMESA-3100 Kafka layer views (#2784))
=======
>>>>>>> de8804123e (GEOMESA-3100 Kafka layer views (#2784))
=======
=======
>>>>>>> 89fb9950ef (GEOMESA-3100 Kafka layer views (#2784))
>>>>>>> 117b13aaaa (GEOMESA-3100 Kafka layer views (#2784))
=======
>>>>>>> 67de3c3202 (Merge branch 'feature/postgis-fixes')
=======
=======
>>>>>>> f3ae53295d (GEOMESA-3100 Kafka layer views (#2784))
>>>>>>> a94a1be83c (GEOMESA-3100 Kafka layer views (#2784))
=======
>>>>>>> c61bffed00 (GEOMESA-3100 Kafka layer views (#2784))
=======
=======
=======
>>>>>>> a377061090 (GEOMESA-3100 Kafka layer views (#2784))
=======
>>>>>>> 1a5f68233 (GEOMESA-3100 Kafka layer views (#2784))
=======
>>>>>>> 65a3a6e36 (GEOMESA-3100 Kafka layer views (#2784))
<<<<<<< HEAD
>>>>>>> 9e910620b3 (GEOMESA-3100 Kafka layer views (#2784))
<<<<<<< HEAD
>>>>>>> 89f0c9f2c3 (GEOMESA-3100 Kafka layer views (#2784))
=======
=======
=======
>>>>>>> 42549e8e3 (GEOMESA-3100 Kafka layer views (#2784))
>>>>>>> a377061090 (GEOMESA-3100 Kafka layer views (#2784))
>>>>>>> 750ebbabe7 (GEOMESA-3100 Kafka layer views (#2784))
=======
>>>>>>> e944f1c88b (Merge branch 'feature/postgis-fixes')
>>>>>>> 638b68d081 (Merge branch 'feature/postgis-fixes')
=======
>>>>>>> 814854c5db (GEOMESA-3100 Kafka layer views (#2784))
>>>>>>> cc8b9d0320 (GEOMESA-3100 Kafka layer views (#2784))
=======
>>>>>>> 7bdc1feea8 (GEOMESA-3100 Kafka layer views (#2784))
>>>>>>> c64e652363 (GEOMESA-3100 Kafka layer views (#2784))
=======
=======
>>>>>>> 23a7d9849f (GEOMESA-3100 Kafka layer views (#2784))
=======
>>>>>>> 39d28fffcb (GEOMESA-3100 Kafka layer views (#2784))
>>>>>>> 862857ce2 (GEOMESA-3100 Kafka layer views (#2784))
=======
>>>>>>> 4231e686d (GEOMESA-3100 Kafka layer views (#2784))
<<<<<<< HEAD
>>>>>>> 69e3273ac1 (GEOMESA-3100 Kafka layer views (#2784))
<<<<<<< HEAD
>>>>>>> 3977ecc140 (GEOMESA-3100 Kafka layer views (#2784))
<<<<<<< HEAD
>>>>>>> 43ac4062d9 (GEOMESA-3100 Kafka layer views (#2784))
=======
=======
=======
=======
>>>>>>> 6af71ff43 (GEOMESA-3100 Kafka layer views (#2784))
=======
>>>>>>> 71adb695c5 (Merge branch 'feature/postgis-fixes')
>>>>>>> 23a7d9849f (GEOMESA-3100 Kafka layer views (#2784))
<<<<<<< HEAD
>>>>>>> 416a95a4c0 (GEOMESA-3100 Kafka layer views (#2784))
<<<<<<< HEAD
>>>>>>> 39d28fffcb (GEOMESA-3100 Kafka layer views (#2784))
=======
=======
=======
=======
>>>>>>> db8d998aa (Merge branch 'feature/postgis-fixes')
=======
>>>>>>> 41df6a2aa3 (GEOMESA-3100 Kafka layer views (#2784))
>>>>>>> cb6bda89b6 (Merge branch 'feature/postgis-fixes')
<<<<<<< HEAD
>>>>>>> 26e5afc4ea (Merge branch 'feature/postgis-fixes')
<<<<<<< HEAD
>>>>>>> 71adb695c5 (Merge branch 'feature/postgis-fixes')
=======
=======
=======
=======
>>>>>>> c589b832a (GEOMESA-3100 Kafka layer views (#2784))
=======
>>>>>>> 340134cdda (GEOMESA-3100 Kafka layer views (#2784))
>>>>>>> 9e433ba57e (GEOMESA-3100 Kafka layer views (#2784))
<<<<<<< HEAD
>>>>>>> 2750a5beef (GEOMESA-3100 Kafka layer views (#2784))
<<<<<<< HEAD
>>>>>>> 41df6a2aa3 (GEOMESA-3100 Kafka layer views (#2784))
=======
=======
=======
=======
>>>>>>> fa68dd43c (GEOMESA-3100 Kafka layer views (#2784))
=======
>>>>>>> 72ec0b2107 (GEOMESA-3100 Kafka layer views (#2784))
>>>>>>> 23f312535d (GEOMESA-3100 Kafka layer views (#2784))
<<<<<<< HEAD
>>>>>>> 468da42855 (GEOMESA-3100 Kafka layer views (#2784))
<<<<<<< HEAD
>>>>>>> 340134cdda (GEOMESA-3100 Kafka layer views (#2784))
=======
=======
=======
=======
>>>>>>> 89fb9950e (GEOMESA-3100 Kafka layer views (#2784))
=======
>>>>>>> 30559ea5c9 (Merge branch 'feature/postgis-fixes')
>>>>>>> bc97b07a31 (GEOMESA-3100 Kafka layer views (#2784))
<<<<<<< HEAD
>>>>>>> f340d6feab (GEOMESA-3100 Kafka layer views (#2784))
<<<<<<< HEAD
>>>>>>> 72ec0b2107 (GEOMESA-3100 Kafka layer views (#2784))
=======
=======
=======
=======
>>>>>>> 1b25d7ddb (Merge branch 'feature/postgis-fixes')
>>>>>>> 699117eca9 (Merge branch 'feature/postgis-fixes')
>>>>>>> c69897d7bd (Merge branch 'feature/postgis-fixes')
>>>>>>> 30559ea5c9 (Merge branch 'feature/postgis-fixes')
  override private[geomesa] def getFeatureReader(
=======
<<<<<<< HEAD
=======
>>>>>>> bddfdbea5 (GEOMESA-3100 Kafka layer views (#2784))
<<<<<<< HEAD
<<<<<<< HEAD
<<<<<<< HEAD
<<<<<<< HEAD
<<<<<<< HEAD
<<<<<<< HEAD
=======
>>>>>>> 8b9e99d11a (GEOMESA-3100 Kafka layer views (#2784))
=======
>>>>>>> 69e3273ac1 (GEOMESA-3100 Kafka layer views (#2784))
=======
>>>>>>> 9e433ba57e (GEOMESA-3100 Kafka layer views (#2784))
=======
>>>>>>> 23f312535d (GEOMESA-3100 Kafka layer views (#2784))
=======
>>>>>>> 95c83ca7f (GEOMESA-3100 Kafka layer views (#2784))
=======
>>>>>>> d2cb939f5 (GEOMESA-3100 Kafka layer views (#2784))
<<<<<<< HEAD
<<<<<<< HEAD
<<<<<<< HEAD
<<<<<<< HEAD
<<<<<<< HEAD
<<<<<<< HEAD
=======
>>>>>>> 23a7d9849f (GEOMESA-3100 Kafka layer views (#2784))
=======
>>>>>>> cb6bda89b6 (Merge branch 'feature/postgis-fixes')
=======
>>>>>>> bc97b07a31 (GEOMESA-3100 Kafka layer views (#2784))
=======
>>>>>>> 699117eca9 (Merge branch 'feature/postgis-fixes')
=======
>>>>>>> 3be8d2a5a (Merge branch 'feature/postgis-fixes')
=======
  override private[geomesa] def getFeatureReader(
=======
<<<<<<< HEAD
<<<<<<< HEAD
>>>>>>> e1f939a3e (GEOMESA-3100 Kafka layer views (#2784))
=======
>>>>>>> 1a5f68233 (GEOMESA-3100 Kafka layer views (#2784))
=======
=======
>>>>>>> 95c83ca7f (GEOMESA-3100 Kafka layer views (#2784))
>>>>>>> 65a3a6e36 (GEOMESA-3100 Kafka layer views (#2784))
=======
>>>>>>> 42549e8e3 (GEOMESA-3100 Kafka layer views (#2784))
=======
=======
>>>>>>> 3be8d2a5a (Merge branch 'feature/postgis-fixes')
>>>>>>> e8cc4971c6 (Merge branch 'feature/postgis-fixes')
=======
>>>>>>> 9bda77cfe (GEOMESA-3100 Kafka layer views (#2784))
<<<<<<< HEAD
>>>>>>> 06956ccf98 (GEOMESA-3100 Kafka layer views (#2784))
=======
=======
>>>>>>> 862857ce2 (GEOMESA-3100 Kafka layer views (#2784))
<<<<<<< HEAD
>>>>>>> 8b9e99d11a (GEOMESA-3100 Kafka layer views (#2784))
=======
=======
=======
>>>>>>> 95c83ca7f (GEOMESA-3100 Kafka layer views (#2784))
>>>>>>> 4231e686d (GEOMESA-3100 Kafka layer views (#2784))
<<<<<<< HEAD
>>>>>>> 69e3273ac1 (GEOMESA-3100 Kafka layer views (#2784))
=======
=======
>>>>>>> 6af71ff43 (GEOMESA-3100 Kafka layer views (#2784))
<<<<<<< HEAD
>>>>>>> 23a7d9849f (GEOMESA-3100 Kafka layer views (#2784))
=======
=======
=======
>>>>>>> 3be8d2a5a (Merge branch 'feature/postgis-fixes')
>>>>>>> db8d998aa (Merge branch 'feature/postgis-fixes')
<<<<<<< HEAD
>>>>>>> cb6bda89b6 (Merge branch 'feature/postgis-fixes')
=======
=======
>>>>>>> c589b832a (GEOMESA-3100 Kafka layer views (#2784))
<<<<<<< HEAD
>>>>>>> 9e433ba57e (GEOMESA-3100 Kafka layer views (#2784))
=======
=======
=======
>>>>>>> 95c83ca7f (GEOMESA-3100 Kafka layer views (#2784))
>>>>>>> fa68dd43c (GEOMESA-3100 Kafka layer views (#2784))
<<<<<<< HEAD
>>>>>>> 23f312535d (GEOMESA-3100 Kafka layer views (#2784))
=======
=======
>>>>>>> 89fb9950e (GEOMESA-3100 Kafka layer views (#2784))
<<<<<<< HEAD
>>>>>>> bc97b07a31 (GEOMESA-3100 Kafka layer views (#2784))
=======
=======
=======
>>>>>>> 3be8d2a5a (Merge branch 'feature/postgis-fixes')
>>>>>>> 1b25d7ddb (Merge branch 'feature/postgis-fixes')
>>>>>>> 699117eca9 (Merge branch 'feature/postgis-fixes')
  private[geomesa] def getFeatureReader(
>>>>>>> f7038468b (GEOMESA-3100 Kafka layer views (#2784))
=======
  override private[geomesa] def getFeatureReader(
>>>>>>> 58d14a257 (GEOMESA-3254 Add Bloop build support)
      sft: SimpleFeatureType,
      transaction: Transaction,
      query: Query): GeoMesaFeatureReader = {
<<<<<<< HEAD
<<<<<<< HEAD
<<<<<<< HEAD
<<<<<<< HEAD
<<<<<<< HEAD
<<<<<<< HEAD
<<<<<<< HEAD
<<<<<<< HEAD
<<<<<<< HEAD
>>>>>>> 9bda77cfe3 (GEOMESA-3100 Kafka layer views (#2784))
=======
<<<<<<< HEAD
>>>>>>> db8d998aa2 (Merge branch 'feature/postgis-fixes')
=======
>>>>>>> d2002b5afd (GEOMESA-3100 Kafka layer views (#2784))
=======
>>>>>>> 1b25d7ddb4 (Merge branch 'feature/postgis-fixes')
=======
=======
>>>>>>> e944f1c88b (Merge branch 'feature/postgis-fixes')
=======
>>>>>>> 814854c5db (GEOMESA-3100 Kafka layer views (#2784))
=======
>>>>>>> 26e5afc4ea (Merge branch 'feature/postgis-fixes')
=======
>>>>>>> c69897d7bd (Merge branch 'feature/postgis-fixes')
=======
>>>>>>> e1f939a3e (GEOMESA-3100 Kafka layer views (#2784))
>>>>>>> f3ae53295d (GEOMESA-3100 Kafka layer views (#2784))
=======
>>>>>>> e8cc4971c6 (Merge branch 'feature/postgis-fixes')
=======
=======
>>>>>>> cb6bda89b6 (Merge branch 'feature/postgis-fixes')
=======
>>>>>>> 699117eca9 (Merge branch 'feature/postgis-fixes')
=======
>>>>>>> 9bda77cfe (GEOMESA-3100 Kafka layer views (#2784))
>>>>>>> 06956ccf98 (GEOMESA-3100 Kafka layer views (#2784))
=======
>>>>>>> db8d998aa (Merge branch 'feature/postgis-fixes')
=======
>>>>>>> 1b25d7ddb (Merge branch 'feature/postgis-fixes')
=======
=======
>>>>>>> 69287f5812 (GEOMESA-3100 Kafka layer views (#2784))
=======
>>>>>>> 13347c6405 (GEOMESA-3100 Kafka layer views (#2784))
  override def getFeatureReader(query: Query, transaction: Transaction): SimpleFeatureReader = {
    val sft = getSchema(query.getTypeName)
    if (sft == null) {
      throw new IOException(s"Schema '${query.getTypeName}' has not been initialized. Please call 'createSchema' first.")
    }
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
>>>>>>> ad0d29873e (GEOMESA-3100 Kafka layer views (#2784))
=======
>>>>>>> 0a0bf0292e (GEOMESA-3100 Kafka layer views (#2784))
=======
>>>>>>> f43f8303d3 (GEOMESA-3100 Kafka layer views (#2784))
=======
>>>>>>> 6368ee48e8 (GEOMESA-3100 Kafka layer views (#2784))
=======
>>>>>>> 4516873dab (GEOMESA-3100 Kafka layer views (#2784))
=======
>>>>>>> 64da8137f1 (GEOMESA-3100 Kafka layer views (#2784))
=======
>>>>>>> 4b0dd3e513 (GEOMESA-3100 Kafka layer views (#2784))
=======
>>>>>>> 6e453fd3d0 (GEOMESA-3100 Kafka layer views (#2784))
=======
>>>>>>> f187a4fcf9 (GEOMESA-3100 Kafka layer views (#2784))
=======
>>>>>>> d309fbbbbf (GEOMESA-3100 Kafka layer views (#2784))
=======
>>>>>>> d76a495d83 (GEOMESA-3100 Kafka layer views (#2784))
=======
>>>>>>> bbc8576d19 (GEOMESA-3100 Kafka layer views (#2784))
=======
>>>>>>> d3b123117a (GEOMESA-3100 Kafka layer views (#2784))
=======
>>>>>>> 885048dd7d (GEOMESA-3100 Kafka layer views (#2784))
=======
>>>>>>> 66bdd8fd8d (GEOMESA-3100 Kafka layer views (#2784))
=======
>>>>>>> 1c99a27679 (GEOMESA-3100 Kafka layer views (#2784))
=======
>>>>>>> 92dc7a8411 (GEOMESA-3100 Kafka layer views (#2784))
=======
>>>>>>> 2766fc9b5b (GEOMESA-3100 Kafka layer views (#2784))
=======
>>>>>>> de8804123e (GEOMESA-3100 Kafka layer views (#2784))
=======
>>>>>>> 2f673a268a (GEOMESA-3100 Kafka layer views (#2784))
=======
>>>>>>> c44e474495 (GEOMESA-3100 Kafka layer views (#2784))
=======
>>>>>>> c2a94543ba (GEOMESA-3100 Kafka layer views (#2784))
=======
>>>>>>> 117b13aaaa (GEOMESA-3100 Kafka layer views (#2784))
=======
>>>>>>> a94a1be83c (GEOMESA-3100 Kafka layer views (#2784))
=======
>>>>>>> 0cd029fb3b (GEOMESA-3100 Kafka layer views (#2784))
=======
>>>>>>> c61bffed00 (GEOMESA-3100 Kafka layer views (#2784))
=======
>>>>>>> 12f226f36d (GEOMESA-3100 Kafka layer views (#2784))
=======
>>>>>>> 89f0c9f2c3 (GEOMESA-3100 Kafka layer views (#2784))
=======
>>>>>>> 222e44653b (GEOMESA-3100 Kafka layer views (#2784))
=======
>>>>>>> 4f4ecaeb43 (GEOMESA-3100 Kafka layer views (#2784))
=======
>>>>>>> b4cd5a7733 (GEOMESA-3100 Kafka layer views (#2784))
=======
>>>>>>> 750ebbabe7 (GEOMESA-3100 Kafka layer views (#2784))
=======
>>>>>>> cc8b9d0320 (GEOMESA-3100 Kafka layer views (#2784))
=======
>>>>>>> 65e544d20e (GEOMESA-3100 Kafka layer views (#2784))
=======
>>>>>>> c64e652363 (GEOMESA-3100 Kafka layer views (#2784))
=======
>>>>>>> 02eb81c815 (GEOMESA-3100 Kafka layer views (#2784))
=======
>>>>>>> 43ac4062d9 (GEOMESA-3100 Kafka layer views (#2784))
=======
>>>>>>> 30905e530b (GEOMESA-3100 Kafka layer views (#2784))
=======
>>>>>>> 121a1d3470 (GEOMESA-3100 Kafka layer views (#2784))
=======
>>>>>>> 297ca0be9c (GEOMESA-3100 Kafka layer views (#2784))
=======
>>>>>>> 39d28fffcb (GEOMESA-3100 Kafka layer views (#2784))
=======
>>>>>>> 0d5f6377de (GEOMESA-3100 Kafka layer views (#2784))
=======
>>>>>>> 41df6a2aa3 (GEOMESA-3100 Kafka layer views (#2784))
=======
>>>>>>> fb32a36e0e (GEOMESA-3100 Kafka layer views (#2784))
=======
>>>>>>> 340134cdda (GEOMESA-3100 Kafka layer views (#2784))
=======
>>>>>>> ea8384d9b7 (GEOMESA-3100 Kafka layer views (#2784))
=======
>>>>>>> fe3378ccaa (GEOMESA-3100 Kafka layer views (#2784))
=======
>>>>>>> 79f56900f0 (GEOMESA-3100 Kafka layer views (#2784))
=======
>>>>>>> 72ec0b2107 (GEOMESA-3100 Kafka layer views (#2784))
=======
>>>>>>> 13347c6405 (GEOMESA-3100 Kafka layer views (#2784))
=======
>>>>>>> d0dc799ff1 (GEOMESA-3100 Kafka layer views (#2784))
=======
>>>>>>> 9361541304 (GEOMESA-3100 Kafka layer views (#2784))
<<<<<<< HEAD
<<<<<<< HEAD
=======
>>>>>>> 2f66072323 (GEOMESA-3100 Kafka layer views (#2784))
=======
=======
<<<<<<< HEAD
<<<<<<< HEAD
>>>>>>> 4231e686dd (GEOMESA-3100 Kafka layer views (#2784))
=======
>>>>>>> fa68dd43c6 (GEOMESA-3100 Kafka layer views (#2784))
=======
<<<<<<< HEAD
>>>>>>> 19aa61c0de (GEOMESA-3100 Kafka layer views (#2784))
=======
=======
>>>>>>> 4231e686dd (GEOMESA-3100 Kafka layer views (#2784))
=======
>>>>>>> d309fbbbbf (GEOMESA-3100 Kafka layer views (#2784))
=======
>>>>>>> de8804123e (GEOMESA-3100 Kafka layer views (#2784))
>>>>>>> d0dc799ff (GEOMESA-3100 Kafka layer views (#2784))
>>>>>>> ea3b40e187 (GEOMESA-3100 Kafka layer views (#2784))
=======
>>>>>>> 9236b02087 (GEOMESA-3100 Kafka layer views (#2784))
<<<<<<< HEAD
<<<<<<< HEAD
=======
>>>>>>> 862857ce2e (GEOMESA-3100 Kafka layer views (#2784))
=======
=======
>>>>>>> d0dc799ff (GEOMESA-3100 Kafka layer views (#2784))
>>>>>>> 28427dfd8f (GEOMESA-3100 Kafka layer views (#2784))
<<<<<<< HEAD
<<<<<<< HEAD
=======
=======
>>>>>>> a62b956fb6 (GEOMESA-3100 Kafka layer views (#2784))
=======
>>>>>>> 4adaa7f479 (GEOMESA-3100 Kafka layer views (#2784))
=======
>>>>>>> 6af71ff432 (GEOMESA-3100 Kafka layer views (#2784))
=======
>>>>>>> c57b5f538a (GEOMESA-3100 Kafka layer views (#2784))
=======
<<<<<<< HEAD
<<<<<<< HEAD
>>>>>>> 88ef67cdfe (GEOMESA-3100 Kafka layer views (#2784))
=======
>>>>>>> 89fb9950ef (GEOMESA-3100 Kafka layer views (#2784))
=======
<<<<<<< HEAD
<<<<<<< HEAD
>>>>>>> f3ae53295d (GEOMESA-3100 Kafka layer views (#2784))
=======
>>>>>>> e24613dc4a (GEOMESA-3100 Kafka layer views (#2784))
=======
<<<<<<< HEAD
<<<<<<< HEAD
>>>>>>> dae1cf3cef (GEOMESA-3100 Kafka layer views (#2784))
=======
>>>>>>> 50a71079c1 (GEOMESA-3100 Kafka layer views (#2784))
=======
<<<<<<< HEAD
<<<<<<< HEAD
=======
>>>>>>> 4c325746bd (GEOMESA-3100 Kafka layer views (#2784))
=======
>>>>>>> 3ebcdb99d9 (GEOMESA-3100 Kafka layer views (#2784))
=======
>>>>>>> fdf51402cf (GEOMESA-3100 Kafka layer views (#2784))
=======
>>>>>>> a377061090 (GEOMESA-3100 Kafka layer views (#2784))
=======
>>>>>>> 814854c5db (GEOMESA-3100 Kafka layer views (#2784))
=======
>>>>>>> be0c9d161a (GEOMESA-3100 Kafka layer views (#2784))
=======
>>>>>>> 7bdc1feea8 (GEOMESA-3100 Kafka layer views (#2784))
=======
>>>>>>> 9b15c8e14c (GEOMESA-3100 Kafka layer views (#2784))
=======
>>>>>>> 3977ecc140 (GEOMESA-3100 Kafka layer views (#2784))
=======
>>>>>>> 495a1efc9f (GEOMESA-3100 Kafka layer views (#2784))
=======
>>>>>>> 5d8c5baea0 (GEOMESA-3100 Kafka layer views (#2784))
=======
>>>>>>> 7628960f66 (GEOMESA-3100 Kafka layer views (#2784))
=======
>>>>>>> 416a95a4c0 (GEOMESA-3100 Kafka layer views (#2784))
=======
>>>>>>> b5abc19ca4 (GEOMESA-3100 Kafka layer views (#2784))
=======
>>>>>>> 2750a5beef (GEOMESA-3100 Kafka layer views (#2784))
=======
>>>>>>> cb4aa55ae3 (GEOMESA-3100 Kafka layer views (#2784))
=======
>>>>>>> 468da42855 (GEOMESA-3100 Kafka layer views (#2784))
=======
>>>>>>> 5dd3eb3a6d (GEOMESA-3100 Kafka layer views (#2784))
=======
>>>>>>> d530f7b24a (GEOMESA-3100 Kafka layer views (#2784))
=======
>>>>>>> 5e230912b1 (GEOMESA-3100 Kafka layer views (#2784))
=======
>>>>>>> f340d6feab (GEOMESA-3100 Kafka layer views (#2784))
=======
>>>>>>> 89f0c9f2c3 (GEOMESA-3100 Kafka layer views (#2784))
=======
>>>>>>> 4c325746bd (GEOMESA-3100 Kafka layer views (#2784))
=======
>>>>>>> 3ebcdb99d9 (GEOMESA-3100 Kafka layer views (#2784))
=======
>>>>>>> fdf51402cf (GEOMESA-3100 Kafka layer views (#2784))
=======
>>>>>>> a377061090 (GEOMESA-3100 Kafka layer views (#2784))
=======
>>>>>>> 814854c5db (GEOMESA-3100 Kafka layer views (#2784))
=======
>>>>>>> be0c9d161a (GEOMESA-3100 Kafka layer views (#2784))
=======
>>>>>>> 7bdc1feea8 (GEOMESA-3100 Kafka layer views (#2784))
=======
>>>>>>> 9b15c8e14c (GEOMESA-3100 Kafka layer views (#2784))
=======
>>>>>>> 3977ecc140 (GEOMESA-3100 Kafka layer views (#2784))
=======
>>>>>>> 495a1efc9f (GEOMESA-3100 Kafka layer views (#2784))
=======
>>>>>>> 5d8c5baea0 (GEOMESA-3100 Kafka layer views (#2784))
=======
>>>>>>> 7628960f66 (GEOMESA-3100 Kafka layer views (#2784))
=======
>>>>>>> 416a95a4c0 (GEOMESA-3100 Kafka layer views (#2784))
=======
>>>>>>> b5abc19ca4 (GEOMESA-3100 Kafka layer views (#2784))
=======
>>>>>>> 2750a5beef (GEOMESA-3100 Kafka layer views (#2784))
=======
>>>>>>> cb4aa55ae3 (GEOMESA-3100 Kafka layer views (#2784))
=======
>>>>>>> 468da42855 (GEOMESA-3100 Kafka layer views (#2784))
=======
>>>>>>> 5dd3eb3a6d (GEOMESA-3100 Kafka layer views (#2784))
=======
>>>>>>> d530f7b24a (GEOMESA-3100 Kafka layer views (#2784))
=======
>>>>>>> 5e230912b1 (GEOMESA-3100 Kafka layer views (#2784))
=======
>>>>>>> f340d6feab (GEOMESA-3100 Kafka layer views (#2784))
=======
>>>>>>> 65a3a6e36 (GEOMESA-3100 Kafka layer views (#2784))
>>>>>>> 9e910620b3 (GEOMESA-3100 Kafka layer views (#2784))
=======
<<<<<<< HEAD
<<<<<<< HEAD
>>>>>>> 429ffc55e (GEOMESA-3100 Kafka layer views (#2784))
=======
>>>>>>> e7f3e6588 (GEOMESA-3100 Kafka layer views (#2784))
=======
<<<<<<< HEAD
<<<<<<< HEAD
>>>>>>> 6f6887eb8 (GEOMESA-3100 Kafka layer views (#2784))
=======
>>>>>>> 42549e8e3 (GEOMESA-3100 Kafka layer views (#2784))
=======
<<<<<<< HEAD
<<<<<<< HEAD
>>>>>>> 06956ccf98 (GEOMESA-3100 Kafka layer views (#2784))
=======
>>>>>>> c1d0543aac (GEOMESA-3100 Kafka layer views (#2784))
=======
<<<<<<< HEAD
<<<<<<< HEAD
>>>>>>> 8b9e99d11a (GEOMESA-3100 Kafka layer views (#2784))
=======
>>>>>>> 614fcb6bc3 (GEOMESA-3100 Kafka layer views (#2784))
=======
<<<<<<< HEAD
<<<<<<< HEAD
=======
>>>>>>> 04f82bbc57 (GEOMESA-3100 Kafka layer views (#2784))
=======
>>>>>>> e0773a1bd7 (GEOMESA-3100 Kafka layer views (#2784))
=======
>>>>>>> ae5eea67f1 (GEOMESA-3100 Kafka layer views (#2784))
=======
>>>>>>> 23a7d9849f (GEOMESA-3100 Kafka layer views (#2784))
=======
>>>>>>> 4480b2d1b9 (GEOMESA-3100 Kafka layer views (#2784))
=======
>>>>>>> 9e433ba57e (GEOMESA-3100 Kafka layer views (#2784))
=======
>>>>>>> 2df2640494 (GEOMESA-3100 Kafka layer views (#2784))
=======
>>>>>>> 23f312535d (GEOMESA-3100 Kafka layer views (#2784))
=======
>>>>>>> 826636f69d (GEOMESA-3100 Kafka layer views (#2784))
=======
>>>>>>> 1e11ed51a6 (GEOMESA-3100 Kafka layer views (#2784))
=======
>>>>>>> 976f319530 (GEOMESA-3100 Kafka layer views (#2784))
=======
>>>>>>> bc97b07a31 (GEOMESA-3100 Kafka layer views (#2784))
=======
>>>>>>> 43ac4062d9 (GEOMESA-3100 Kafka layer views (#2784))
=======
>>>>>>> 04f82bbc57 (GEOMESA-3100 Kafka layer views (#2784))
=======
>>>>>>> e0773a1bd7 (GEOMESA-3100 Kafka layer views (#2784))
=======
>>>>>>> ae5eea67f1 (GEOMESA-3100 Kafka layer views (#2784))
=======
>>>>>>> 23a7d9849f (GEOMESA-3100 Kafka layer views (#2784))
=======
>>>>>>> 4480b2d1b9 (GEOMESA-3100 Kafka layer views (#2784))
=======
>>>>>>> 9e433ba57e (GEOMESA-3100 Kafka layer views (#2784))
=======
>>>>>>> 2df2640494 (GEOMESA-3100 Kafka layer views (#2784))
=======
>>>>>>> 23f312535d (GEOMESA-3100 Kafka layer views (#2784))
=======
>>>>>>> 826636f69d (GEOMESA-3100 Kafka layer views (#2784))
=======
>>>>>>> 1e11ed51a6 (GEOMESA-3100 Kafka layer views (#2784))
=======
>>>>>>> 976f319530 (GEOMESA-3100 Kafka layer views (#2784))
=======
>>>>>>> bc97b07a31 (GEOMESA-3100 Kafka layer views (#2784))
=======
>>>>>>> 4231e686d (GEOMESA-3100 Kafka layer views (#2784))
>>>>>>> 69e3273ac1 (GEOMESA-3100 Kafka layer views (#2784))
=======
<<<<<<< HEAD
<<<<<<< HEAD
>>>>>>> ac0357d36 (GEOMESA-3100 Kafka layer views (#2784))
=======
>>>>>>> a62b956fb (GEOMESA-3100 Kafka layer views (#2784))
=======
<<<<<<< HEAD
<<<<<<< HEAD
>>>>>>> 4adaa7f47 (GEOMESA-3100 Kafka layer views (#2784))
=======
>>>>>>> 6af71ff43 (GEOMESA-3100 Kafka layer views (#2784))
=======
<<<<<<< HEAD
<<<<<<< HEAD
>>>>>>> fa68dd43c (GEOMESA-3100 Kafka layer views (#2784))
=======
>>>>>>> 54ece16d1 (GEOMESA-3100 Kafka layer views (#2784))
=======
<<<<<<< HEAD
<<<<<<< HEAD
>>>>>>> c57b5f538 (GEOMESA-3100 Kafka layer views (#2784))
=======
>>>>>>> 88ef67cdf (GEOMESA-3100 Kafka layer views (#2784))
=======
<<<<<<< HEAD
<<<<<<< HEAD
>>>>>>> 89fb9950e (GEOMESA-3100 Kafka layer views (#2784))
=======
>>>>>>> 9a5d6d2815 (GEOMESA-3100 Kafka layer views (#2784))
=======
>>>>>>> f4b2369e9a (GEOMESA-3100 Kafka layer views (#2784))
=======
>>>>>>> 305a9263eb (GEOMESA-3100 Kafka layer views (#2784))
=======
=======
>>>>>>> c44e474495 (GEOMESA-3100 Kafka layer views (#2784))
=======
>>>>>>> 88ef67cdfe (GEOMESA-3100 Kafka layer views (#2784))
=======
>>>>>>> c2a94543ba (GEOMESA-3100 Kafka layer views (#2784))
=======
>>>>>>> 117b13aaaa (GEOMESA-3100 Kafka layer views (#2784))
=======
>>>>>>> f3ae53295d (GEOMESA-3100 Kafka layer views (#2784))
=======
>>>>>>> a94a1be83c (GEOMESA-3100 Kafka layer views (#2784))
=======
>>>>>>> 0cd029fb3b (GEOMESA-3100 Kafka layer views (#2784))
=======
>>>>>>> dae1cf3cef (GEOMESA-3100 Kafka layer views (#2784))
=======
>>>>>>> c61bffed00 (GEOMESA-3100 Kafka layer views (#2784))
=======
>>>>>>> 12f226f36d (GEOMESA-3100 Kafka layer views (#2784))
=======
>>>>>>> 89f0c9f2c3 (GEOMESA-3100 Kafka layer views (#2784))
=======
>>>>>>> 429ffc55e (GEOMESA-3100 Kafka layer views (#2784))
=======
>>>>>>> 222e44653b (GEOMESA-3100 Kafka layer views (#2784))
=======
>>>>>>> 4f4ecaeb43 (GEOMESA-3100 Kafka layer views (#2784))
=======
>>>>>>> 6f6887eb8 (GEOMESA-3100 Kafka layer views (#2784))
=======
>>>>>>> b4cd5a7733 (GEOMESA-3100 Kafka layer views (#2784))
=======
>>>>>>> 750ebbabe7 (GEOMESA-3100 Kafka layer views (#2784))
=======
>>>>>>> 06956ccf98 (GEOMESA-3100 Kafka layer views (#2784))
=======
>>>>>>> cc8b9d0320 (GEOMESA-3100 Kafka layer views (#2784))
=======
>>>>>>> 65e544d20e (GEOMESA-3100 Kafka layer views (#2784))
=======
>>>>>>> 8b9e99d11a (GEOMESA-3100 Kafka layer views (#2784))
=======
>>>>>>> c64e652363 (GEOMESA-3100 Kafka layer views (#2784))
=======
>>>>>>> 02eb81c815 (GEOMESA-3100 Kafka layer views (#2784))
=======
>>>>>>> 43ac4062d9 (GEOMESA-3100 Kafka layer views (#2784))
=======
>>>>>>> ac0357d36 (GEOMESA-3100 Kafka layer views (#2784))
=======
>>>>>>> 30905e530b (GEOMESA-3100 Kafka layer views (#2784))
=======
>>>>>>> 121a1d3470 (GEOMESA-3100 Kafka layer views (#2784))
=======
>>>>>>> 4adaa7f47 (GEOMESA-3100 Kafka layer views (#2784))
=======
>>>>>>> 297ca0be9c (GEOMESA-3100 Kafka layer views (#2784))
=======
>>>>>>> 39d28fffcb (GEOMESA-3100 Kafka layer views (#2784))
=======
>>>>>>> fa68dd43c (GEOMESA-3100 Kafka layer views (#2784))
=======
>>>>>>> 340134cdda (GEOMESA-3100 Kafka layer views (#2784))
=======
>>>>>>> ea8384d9b7 (GEOMESA-3100 Kafka layer views (#2784))
=======
>>>>>>> c57b5f538 (GEOMESA-3100 Kafka layer views (#2784))
=======
>>>>>>> fe3378ccaa (GEOMESA-3100 Kafka layer views (#2784))
=======
>>>>>>> 79f56900f0 (GEOMESA-3100 Kafka layer views (#2784))
=======
>>>>>>> 89fb9950e (GEOMESA-3100 Kafka layer views (#2784))
=======
>>>>>>> 72ec0b2107 (GEOMESA-3100 Kafka layer views (#2784))
>>>>>>> d0dc799ff (GEOMESA-3100 Kafka layer views (#2784))
=======
>>>>>>> 936154130 (GEOMESA-3100 Kafka layer views (#2784))
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
>>>>>>> c44e474495 (GEOMESA-3100 Kafka layer views (#2784))
=======
>>>>>>> 222e44653b (GEOMESA-3100 Kafka layer views (#2784))
=======
>>>>>>> 4f4ecaeb43 (GEOMESA-3100 Kafka layer views (#2784))
=======
>>>>>>> 30905e530b (GEOMESA-3100 Kafka layer views (#2784))
=======
>>>>>>> 121a1d3470 (GEOMESA-3100 Kafka layer views (#2784))
=======
>>>>>>> ea8384d9b7 (GEOMESA-3100 Kafka layer views (#2784))
=======
>>>>>>> fe3378ccaa (GEOMESA-3100 Kafka layer views (#2784))
>>>>>>> ac0357d362 (GEOMESA-3100 Kafka layer views (#2784))
=======
=======
>>>>>>> 4c325746bd (GEOMESA-3100 Kafka layer views (#2784))
=======
<<<<<<< HEAD
<<<<<<< HEAD
>>>>>>> 3ebcdb99d9 (GEOMESA-3100 Kafka layer views (#2784))
=======
=======
<<<<<<< HEAD
<<<<<<< HEAD
>>>>>>> 5d8c5baea0 (GEOMESA-3100 Kafka layer views (#2784))
=======
>>>>>>> 5dd3eb3a6d (GEOMESA-3100 Kafka layer views (#2784))
=======
>>>>>>> d530f7b24a (GEOMESA-3100 Kafka layer views (#2784))
=======
<<<<<<< HEAD
=======
>>>>>>> 5d8c5baea0 (GEOMESA-3100 Kafka layer views (#2784))
=======
<<<<<<< HEAD
>>>>>>> 121a1d3470 (GEOMESA-3100 Kafka layer views (#2784))
=======
>>>>>>> 5dd3eb3a6d (GEOMESA-3100 Kafka layer views (#2784))
=======
>>>>>>> ea8384d9b7 (GEOMESA-3100 Kafka layer views (#2784))
=======
>>>>>>> fe3378ccaa (GEOMESA-3100 Kafka layer views (#2784))
>>>>>>> 04f82bbc57 (GEOMESA-3100 Kafka layer views (#2784))
>>>>>>> 495a1efc9f (GEOMESA-3100 Kafka layer views (#2784))
=======
>>>>>>> e0773a1bd7 (GEOMESA-3100 Kafka layer views (#2784))
=======
<<<<<<< HEAD
<<<<<<< HEAD
>>>>>>> 826636f69d (GEOMESA-3100 Kafka layer views (#2784))
=======
>>>>>>> 1e11ed51a6 (GEOMESA-3100 Kafka layer views (#2784))
=======
<<<<<<< HEAD
=======
>>>>>>> 222e44653b (GEOMESA-3100 Kafka layer views (#2784))
=======
>>>>>>> 3ebcdb99d9 (GEOMESA-3100 Kafka layer views (#2784))
=======
>>>>>>> 4f4ecaeb43 (GEOMESA-3100 Kafka layer views (#2784))
=======
>>>>>>> 04f82bbc57 (GEOMESA-3100 Kafka layer views (#2784))
>>>>>>> 495a1efc9f (GEOMESA-3100 Kafka layer views (#2784))
=======
>>>>>>> 30905e530b (GEOMESA-3100 Kafka layer views (#2784))
=======
>>>>>>> 121a1d3470 (GEOMESA-3100 Kafka layer views (#2784))
=======
>>>>>>> 826636f69d (GEOMESA-3100 Kafka layer views (#2784))
=======
>>>>>>> ea8384d9b7 (GEOMESA-3100 Kafka layer views (#2784))
=======
>>>>>>> fe3378ccaa (GEOMESA-3100 Kafka layer views (#2784))
>>>>>>> 2f6607232 (GEOMESA-3100 Kafka layer views (#2784))
<<<<<<< HEAD
<<<<<<< HEAD
<<<<<<< HEAD
<<<<<<< HEAD
=======
>>>>>>> c2a94543ba (GEOMESA-3100 Kafka layer views (#2784))
>>>>>>> a62b956fb6 (GEOMESA-3100 Kafka layer views (#2784))
=======
=======
>>>>>>> 88ef67cdfe (GEOMESA-3100 Kafka layer views (#2784))
=======
<<<<<<< HEAD
>>>>>>> f4b2369e9a (GEOMESA-3100 Kafka layer views (#2784))
=======
=======
>>>>>>> c2a94543ba (GEOMESA-3100 Kafka layer views (#2784))
=======
>>>>>>> d0dc799ff (GEOMESA-3100 Kafka layer views (#2784))
>>>>>>> ea3b40e18 (GEOMESA-3100 Kafka layer views (#2784))
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
>>>>>>> c2a94543ba (GEOMESA-3100 Kafka layer views (#2784))
=======
>>>>>>> 0cd029fb3b (GEOMESA-3100 Kafka layer views (#2784))
=======
>>>>>>> b4cd5a7733 (GEOMESA-3100 Kafka layer views (#2784))
=======
>>>>>>> 65e544d20e (GEOMESA-3100 Kafka layer views (#2784))
=======
>>>>>>> 297ca0be9c (GEOMESA-3100 Kafka layer views (#2784))
=======
>>>>>>> 79f56900f0 (GEOMESA-3100 Kafka layer views (#2784))
>>>>>>> 4adaa7f479 (GEOMESA-3100 Kafka layer views (#2784))
=======
>>>>>>> f6e840b5dd (GEOMESA-3100 Kafka layer views (#2784))
=======
>>>>>>> c589b832a5 (GEOMESA-3100 Kafka layer views (#2784))
=======
=======
>>>>>>> d0dc799ff (GEOMESA-3100 Kafka layer views (#2784))
>>>>>>> ffbc2ce32a (GEOMESA-3100 Kafka layer views (#2784))
=======
=======
>>>>>>> d0dc799ff (GEOMESA-3100 Kafka layer views (#2784))
=======
>>>>>>> 936154130 (GEOMESA-3100 Kafka layer views (#2784))
>>>>>>> 54ece16d15 (GEOMESA-3100 Kafka layer views (#2784))
=======
=======
>>>>>>> 2f6607232 (GEOMESA-3100 Kafka layer views (#2784))
>>>>>>> c57b5f538a (GEOMESA-3100 Kafka layer views (#2784))
<<<<<<< HEAD
<<<<<<< HEAD
=======
>>>>>>> 88ef67cdfe (GEOMESA-3100 Kafka layer views (#2784))
=======
=======
<<<<<<< HEAD
<<<<<<< HEAD
>>>>>>> fdf51402cf (GEOMESA-3100 Kafka layer views (#2784))
=======
>>>>>>> be0c9d161a (GEOMESA-3100 Kafka layer views (#2784))
=======
<<<<<<< HEAD
<<<<<<< HEAD
>>>>>>> 7628960f66 (GEOMESA-3100 Kafka layer views (#2784))
=======
>>>>>>> 5e230912b1 (GEOMESA-3100 Kafka layer views (#2784))
=======
<<<<<<< HEAD
=======
>>>>>>> fdf51402cf (GEOMESA-3100 Kafka layer views (#2784))
=======
>>>>>>> b4cd5a7733 (GEOMESA-3100 Kafka layer views (#2784))
=======
>>>>>>> 65e544d20e (GEOMESA-3100 Kafka layer views (#2784))
=======
>>>>>>> 7628960f66 (GEOMESA-3100 Kafka layer views (#2784))
=======
>>>>>>> 297ca0be9c (GEOMESA-3100 Kafka layer views (#2784))
=======
>>>>>>> 79f56900f0 (GEOMESA-3100 Kafka layer views (#2784))
>>>>>>> 581f1dd15 (GEOMESA-3100 Kafka layer views (#2784))
<<<<<<< HEAD
>>>>>>> e24613dc4a (GEOMESA-3100 Kafka layer views (#2784))
=======
=======
>>>>>>> 1a5f68233 (GEOMESA-3100 Kafka layer views (#2784))
<<<<<<< HEAD
>>>>>>> dae1cf3cef (GEOMESA-3100 Kafka layer views (#2784))
=======
=======
=======
>>>>>>> d0dc799ff (GEOMESA-3100 Kafka layer views (#2784))
>>>>>>> 73767737b (GEOMESA-3100 Kafka layer views (#2784))
<<<<<<< HEAD
<<<<<<< HEAD
<<<<<<< HEAD
=======
>>>>>>> 222e44653b (GEOMESA-3100 Kafka layer views (#2784))
>>>>>>> 50a71079c1 (GEOMESA-3100 Kafka layer views (#2784))
=======
=======
>>>>>>> 429ffc55e (GEOMESA-3100 Kafka layer views (#2784))
<<<<<<< HEAD
<<<<<<< HEAD
<<<<<<< HEAD
=======
>>>>>>> 4f4ecaeb43 (GEOMESA-3100 Kafka layer views (#2784))
>>>>>>> 4c325746bd (GEOMESA-3100 Kafka layer views (#2784))
=======
=======
=======
>>>>>>> 2f6607232 (GEOMESA-3100 Kafka layer views (#2784))
>>>>>>> e7f3e6588 (GEOMESA-3100 Kafka layer views (#2784))
<<<<<<< HEAD
<<<<<<< HEAD
<<<<<<< HEAD
=======
>>>>>>> b4cd5a7733 (GEOMESA-3100 Kafka layer views (#2784))
>>>>>>> 3ebcdb99d9 (GEOMESA-3100 Kafka layer views (#2784))
=======
=======
>>>>>>> 6f6887eb8 (GEOMESA-3100 Kafka layer views (#2784))
<<<<<<< HEAD
<<<<<<< HEAD
<<<<<<< HEAD
=======
>>>>>>> 65e544d20e (GEOMESA-3100 Kafka layer views (#2784))
>>>>>>> fdf51402cf (GEOMESA-3100 Kafka layer views (#2784))
=======
=======
=======
<<<<<<< HEAD
<<<<<<< HEAD
>>>>>>> ae5eea67f1 (GEOMESA-3100 Kafka layer views (#2784))
=======
>>>>>>> 976f319530 (GEOMESA-3100 Kafka layer views (#2784))
=======
<<<<<<< HEAD
=======
>>>>>>> ae5eea67f1 (GEOMESA-3100 Kafka layer views (#2784))
=======
>>>>>>> 297ca0be9c (GEOMESA-3100 Kafka layer views (#2784))
=======
>>>>>>> 79f56900f0 (GEOMESA-3100 Kafka layer views (#2784))
>>>>>>> 9236b0208 (GEOMESA-3100 Kafka layer views (#2784))
<<<<<<< HEAD
>>>>>>> c1d0543aac (GEOMESA-3100 Kafka layer views (#2784))
<<<<<<< HEAD
>>>>>>> be0c9d161a (GEOMESA-3100 Kafka layer views (#2784))
=======
=======
=======
>>>>>>> 862857ce2 (GEOMESA-3100 Kafka layer views (#2784))
<<<<<<< HEAD
<<<<<<< HEAD
>>>>>>> 8b9e99d11a (GEOMESA-3100 Kafka layer views (#2784))
<<<<<<< HEAD
>>>>>>> 7bdc1feea8 (GEOMESA-3100 Kafka layer views (#2784))
=======
=======
=======
=======
>>>>>>> d0dc799ff (GEOMESA-3100 Kafka layer views (#2784))
>>>>>>> 28427dfd8 (GEOMESA-3100 Kafka layer views (#2784))
<<<<<<< HEAD
<<<<<<< HEAD
>>>>>>> 614fcb6bc3 (GEOMESA-3100 Kafka layer views (#2784))
<<<<<<< HEAD
>>>>>>> 9b15c8e14c (GEOMESA-3100 Kafka layer views (#2784))
=======
=======
=======
>>>>>>> ac0357d36 (GEOMESA-3100 Kafka layer views (#2784))
<<<<<<< HEAD
<<<<<<< HEAD
>>>>>>> 04f82bbc57 (GEOMESA-3100 Kafka layer views (#2784))
<<<<<<< HEAD
>>>>>>> 495a1efc9f (GEOMESA-3100 Kafka layer views (#2784))
=======
=======
=======
=======
>>>>>>> 2f6607232 (GEOMESA-3100 Kafka layer views (#2784))
>>>>>>> a62b956fb (GEOMESA-3100 Kafka layer views (#2784))
<<<<<<< HEAD
<<<<<<< HEAD
>>>>>>> e0773a1bd7 (GEOMESA-3100 Kafka layer views (#2784))
<<<<<<< HEAD
>>>>>>> 5d8c5baea0 (GEOMESA-3100 Kafka layer views (#2784))
=======
=======
=======
>>>>>>> 4adaa7f47 (GEOMESA-3100 Kafka layer views (#2784))
<<<<<<< HEAD
<<<<<<< HEAD
>>>>>>> ae5eea67f1 (GEOMESA-3100 Kafka layer views (#2784))
<<<<<<< HEAD
>>>>>>> 7628960f66 (GEOMESA-3100 Kafka layer views (#2784))
=======
=======
=======
>>>>>>> f6e840b5d (GEOMESA-3100 Kafka layer views (#2784))
<<<<<<< HEAD
<<<<<<< HEAD
>>>>>>> 4480b2d1b9 (GEOMESA-3100 Kafka layer views (#2784))
<<<<<<< HEAD
>>>>>>> b5abc19ca4 (GEOMESA-3100 Kafka layer views (#2784))
=======
=======
=======
>>>>>>> c589b832a (GEOMESA-3100 Kafka layer views (#2784))
<<<<<<< HEAD
<<<<<<< HEAD
>>>>>>> 9e433ba57e (GEOMESA-3100 Kafka layer views (#2784))
<<<<<<< HEAD
>>>>>>> 2750a5beef (GEOMESA-3100 Kafka layer views (#2784))
=======
=======
=======
=======
>>>>>>> d0dc799ff (GEOMESA-3100 Kafka layer views (#2784))
>>>>>>> ffbc2ce32 (GEOMESA-3100 Kafka layer views (#2784))
<<<<<<< HEAD
<<<<<<< HEAD
>>>>>>> 2df2640494 (GEOMESA-3100 Kafka layer views (#2784))
<<<<<<< HEAD
>>>>>>> cb4aa55ae3 (GEOMESA-3100 Kafka layer views (#2784))
=======
=======
=======
>>>>>>> 54ece16d1 (GEOMESA-3100 Kafka layer views (#2784))
<<<<<<< HEAD
<<<<<<< HEAD
>>>>>>> 826636f69d (GEOMESA-3100 Kafka layer views (#2784))
<<<<<<< HEAD
>>>>>>> 5dd3eb3a6d (GEOMESA-3100 Kafka layer views (#2784))
=======
=======
=======
=======
>>>>>>> 2f6607232 (GEOMESA-3100 Kafka layer views (#2784))
>>>>>>> c57b5f538 (GEOMESA-3100 Kafka layer views (#2784))
<<<<<<< HEAD
<<<<<<< HEAD
>>>>>>> 1e11ed51a6 (GEOMESA-3100 Kafka layer views (#2784))
<<<<<<< HEAD
>>>>>>> d530f7b24a (GEOMESA-3100 Kafka layer views (#2784))
=======
=======
=======
>>>>>>> 88ef67cdf (GEOMESA-3100 Kafka layer views (#2784))
>>>>>>> 976f319530 (GEOMESA-3100 Kafka layer views (#2784))
>>>>>>> 5e230912b1 (GEOMESA-3100 Kafka layer views (#2784))
=======
>>>>>>> 64646d61ed (GEOMESA-3100 Kafka layer views (#2784))
=======
>>>>>>> 12fe94b860 (GEOMESA-3100 Kafka layer views (#2784))
=======
=======
>>>>>>> d0dc799ff (GEOMESA-3100 Kafka layer views (#2784))
>>>>>>> 0e42c51dc0 (GEOMESA-3100 Kafka layer views (#2784))
=======
=======
>>>>>>> d0dc799ff (GEOMESA-3100 Kafka layer views (#2784))
=======
>>>>>>> 936154130 (GEOMESA-3100 Kafka layer views (#2784))
>>>>>>> 626c8f9b93 (GEOMESA-3100 Kafka layer views (#2784))
=======
=======
>>>>>>> 2f6607232 (GEOMESA-3100 Kafka layer views (#2784))
>>>>>>> 9a5d6d2815 (GEOMESA-3100 Kafka layer views (#2784))
=======
>>>>>>> f4b2369e9a (GEOMESA-3100 Kafka layer views (#2784))
=======
>>>>>>> 770d928c15 (GEOMESA-3100 Kafka layer views (#2784))
=======
>>>>>>> 5dc1f86700 (GEOMESA-3100 Kafka layer views (#2784))
=======
=======
>>>>>>> d0dc799ff1 (GEOMESA-3100 Kafka layer views (#2784))
>>>>>>> 808743e257 (GEOMESA-3100 Kafka layer views (#2784))
=======
>>>>>>> 0a0bf0292e (GEOMESA-3100 Kafka layer views (#2784))
=======
=======
>>>>>>> 2f66072323 (GEOMESA-3100 Kafka layer views (#2784))
>>>>>>> f43f8303d3 (GEOMESA-3100 Kafka layer views (#2784))
=======
>>>>>>> d0dc799ff (GEOMESA-3100 Kafka layer views (#2784))
>>>>>>> ea3b40e187 (GEOMESA-3100 Kafka layer views (#2784))
>>>>>>> 6368ee48e8 (GEOMESA-3100 Kafka layer views (#2784))
=======
>>>>>>> 4b0dd3e513 (GEOMESA-3100 Kafka layer views (#2784))
=======
=======
>>>>>>> 862857ce2e (GEOMESA-3100 Kafka layer views (#2784))
>>>>>>> 6e453fd3d0 (GEOMESA-3100 Kafka layer views (#2784))
=======
>>>>>>> f187a4fcf9 (GEOMESA-3100 Kafka layer views (#2784))
=======
=======
=======
>>>>>>> a62b956fb6 (GEOMESA-3100 Kafka layer views (#2784))
=======
>>>>>>> 4adaa7f479 (GEOMESA-3100 Kafka layer views (#2784))
=======
>>>>>>> 6af71ff432 (GEOMESA-3100 Kafka layer views (#2784))
=======
>>>>>>> d0dc799ff (GEOMESA-3100 Kafka layer views (#2784))
=======
>>>>>>> 936154130 (GEOMESA-3100 Kafka layer views (#2784))
<<<<<<< HEAD
>>>>>>> ac0357d362 (GEOMESA-3100 Kafka layer views (#2784))
<<<<<<< HEAD
>>>>>>> d76a495d83 (GEOMESA-3100 Kafka layer views (#2784))
=======
=======
=======
>>>>>>> 2f6607232 (GEOMESA-3100 Kafka layer views (#2784))
<<<<<<< HEAD
>>>>>>> a62b956fb6 (GEOMESA-3100 Kafka layer views (#2784))
<<<<<<< HEAD
>>>>>>> bbc8576d19 (GEOMESA-3100 Kafka layer views (#2784))
=======
=======
=======
=======
>>>>>>> d0dc799ff (GEOMESA-3100 Kafka layer views (#2784))
>>>>>>> ea3b40e18 (GEOMESA-3100 Kafka layer views (#2784))
>>>>>>> 4adaa7f479 (GEOMESA-3100 Kafka layer views (#2784))
<<<<<<< HEAD
>>>>>>> d3b123117a (GEOMESA-3100 Kafka layer views (#2784))
=======
=======
>>>>>>> f6e840b5dd (GEOMESA-3100 Kafka layer views (#2784))
<<<<<<< HEAD
>>>>>>> 1c99a27679 (GEOMESA-3100 Kafka layer views (#2784))
=======
=======
>>>>>>> c589b832a5 (GEOMESA-3100 Kafka layer views (#2784))
<<<<<<< HEAD
>>>>>>> 92dc7a8411 (GEOMESA-3100 Kafka layer views (#2784))
=======
=======
=======
>>>>>>> d0dc799ff (GEOMESA-3100 Kafka layer views (#2784))
>>>>>>> ffbc2ce32a (GEOMESA-3100 Kafka layer views (#2784))
<<<<<<< HEAD
>>>>>>> 2766fc9b5b (GEOMESA-3100 Kafka layer views (#2784))
=======
=======
=======
>>>>>>> d0dc799ff (GEOMESA-3100 Kafka layer views (#2784))
=======
>>>>>>> 936154130 (GEOMESA-3100 Kafka layer views (#2784))
>>>>>>> 54ece16d15 (GEOMESA-3100 Kafka layer views (#2784))
>>>>>>> 2f673a268a (GEOMESA-3100 Kafka layer views (#2784))
=======
>>>>>>> c44e474495 (GEOMESA-3100 Kafka layer views (#2784))
=======
=======
>>>>>>> 88ef67cdfe (GEOMESA-3100 Kafka layer views (#2784))
>>>>>>> c2a94543ba (GEOMESA-3100 Kafka layer views (#2784))
=======
>>>>>>> 581f1dd15 (GEOMESA-3100 Kafka layer views (#2784))
<<<<<<< HEAD
>>>>>>> e24613dc4a (GEOMESA-3100 Kafka layer views (#2784))
<<<<<<< HEAD
>>>>>>> 0cd029fb3b (GEOMESA-3100 Kafka layer views (#2784))
=======
=======
=======
>>>>>>> 1a5f68233 (GEOMESA-3100 Kafka layer views (#2784))
>>>>>>> dae1cf3cef (GEOMESA-3100 Kafka layer views (#2784))
>>>>>>> c61bffed00 (GEOMESA-3100 Kafka layer views (#2784))
=======
>>>>>>> 50a71079c1 (GEOMESA-3100 Kafka layer views (#2784))
>>>>>>> 12f226f36d (GEOMESA-3100 Kafka layer views (#2784))
=======
>>>>>>> 4c325746bd (GEOMESA-3100 Kafka layer views (#2784))
>>>>>>> 222e44653b (GEOMESA-3100 Kafka layer views (#2784))
=======
>>>>>>> 3ebcdb99d9 (GEOMESA-3100 Kafka layer views (#2784))
>>>>>>> 4f4ecaeb43 (GEOMESA-3100 Kafka layer views (#2784))
=======
>>>>>>> fdf51402cf (GEOMESA-3100 Kafka layer views (#2784))
>>>>>>> b4cd5a7733 (GEOMESA-3100 Kafka layer views (#2784))
=======
>>>>>>> 9236b0208 (GEOMESA-3100 Kafka layer views (#2784))
<<<<<<< HEAD
>>>>>>> c1d0543aac (GEOMESA-3100 Kafka layer views (#2784))
<<<<<<< HEAD
>>>>>>> be0c9d161a (GEOMESA-3100 Kafka layer views (#2784))
<<<<<<< HEAD
>>>>>>> 65e544d20e (GEOMESA-3100 Kafka layer views (#2784))
=======
=======
=======
=======
>>>>>>> 862857ce2 (GEOMESA-3100 Kafka layer views (#2784))
=======
>>>>>>> 02eb81c815 (GEOMESA-3100 Kafka layer views (#2784))
>>>>>>> 8b9e99d11a (GEOMESA-3100 Kafka layer views (#2784))
<<<<<<< HEAD
>>>>>>> 7bdc1feea8 (GEOMESA-3100 Kafka layer views (#2784))
<<<<<<< HEAD
>>>>>>> c64e652363 (GEOMESA-3100 Kafka layer views (#2784))
=======
=======
=======
=======
=======
>>>>>>> d0dc799ff (GEOMESA-3100 Kafka layer views (#2784))
>>>>>>> 28427dfd8 (GEOMESA-3100 Kafka layer views (#2784))
=======
>>>>>>> 30905e530b (GEOMESA-3100 Kafka layer views (#2784))
>>>>>>> 614fcb6bc3 (GEOMESA-3100 Kafka layer views (#2784))
<<<<<<< HEAD
>>>>>>> 9b15c8e14c (GEOMESA-3100 Kafka layer views (#2784))
<<<<<<< HEAD
>>>>>>> 02eb81c815 (GEOMESA-3100 Kafka layer views (#2784))
=======
=======
=======
=======
>>>>>>> ac0357d36 (GEOMESA-3100 Kafka layer views (#2784))
=======
>>>>>>> 121a1d3470 (GEOMESA-3100 Kafka layer views (#2784))
>>>>>>> 04f82bbc57 (GEOMESA-3100 Kafka layer views (#2784))
<<<<<<< HEAD
>>>>>>> 495a1efc9f (GEOMESA-3100 Kafka layer views (#2784))
<<<<<<< HEAD
>>>>>>> 30905e530b (GEOMESA-3100 Kafka layer views (#2784))
=======
=======
=======
=======
=======
>>>>>>> 2f6607232 (GEOMESA-3100 Kafka layer views (#2784))
>>>>>>> a62b956fb (GEOMESA-3100 Kafka layer views (#2784))
=======
>>>>>>> 297ca0be9c (GEOMESA-3100 Kafka layer views (#2784))
>>>>>>> e0773a1bd7 (GEOMESA-3100 Kafka layer views (#2784))
<<<<<<< HEAD
>>>>>>> 5d8c5baea0 (GEOMESA-3100 Kafka layer views (#2784))
<<<<<<< HEAD
>>>>>>> 121a1d3470 (GEOMESA-3100 Kafka layer views (#2784))
=======
=======
=======
=======
>>>>>>> 4adaa7f47 (GEOMESA-3100 Kafka layer views (#2784))
=======
>>>>>>> 0d5f6377de (GEOMESA-3100 Kafka layer views (#2784))
>>>>>>> ae5eea67f1 (GEOMESA-3100 Kafka layer views (#2784))
<<<<<<< HEAD
>>>>>>> 7628960f66 (GEOMESA-3100 Kafka layer views (#2784))
<<<<<<< HEAD
>>>>>>> 297ca0be9c (GEOMESA-3100 Kafka layer views (#2784))
=======
=======
=======
=======
>>>>>>> f6e840b5d (GEOMESA-3100 Kafka layer views (#2784))
=======
>>>>>>> 41df6a2aa3 (GEOMESA-3100 Kafka layer views (#2784))
>>>>>>> 4480b2d1b9 (GEOMESA-3100 Kafka layer views (#2784))
<<<<<<< HEAD
>>>>>>> b5abc19ca4 (GEOMESA-3100 Kafka layer views (#2784))
<<<<<<< HEAD
>>>>>>> 0d5f6377de (GEOMESA-3100 Kafka layer views (#2784))
=======
=======
=======
=======
>>>>>>> c589b832a (GEOMESA-3100 Kafka layer views (#2784))
=======
>>>>>>> fb32a36e0e (GEOMESA-3100 Kafka layer views (#2784))
>>>>>>> 9e433ba57e (GEOMESA-3100 Kafka layer views (#2784))
<<<<<<< HEAD
>>>>>>> 2750a5beef (GEOMESA-3100 Kafka layer views (#2784))
<<<<<<< HEAD
>>>>>>> 41df6a2aa3 (GEOMESA-3100 Kafka layer views (#2784))
=======
=======
=======
=======
=======
>>>>>>> d0dc799ff (GEOMESA-3100 Kafka layer views (#2784))
>>>>>>> ffbc2ce32 (GEOMESA-3100 Kafka layer views (#2784))
=======
>>>>>>> ea8384d9b7 (GEOMESA-3100 Kafka layer views (#2784))
>>>>>>> 2df2640494 (GEOMESA-3100 Kafka layer views (#2784))
<<<<<<< HEAD
>>>>>>> cb4aa55ae3 (GEOMESA-3100 Kafka layer views (#2784))
<<<<<<< HEAD
>>>>>>> fb32a36e0e (GEOMESA-3100 Kafka layer views (#2784))
=======
=======
=======
=======
>>>>>>> 54ece16d1 (GEOMESA-3100 Kafka layer views (#2784))
=======
>>>>>>> fe3378ccaa (GEOMESA-3100 Kafka layer views (#2784))
>>>>>>> 826636f69d (GEOMESA-3100 Kafka layer views (#2784))
<<<<<<< HEAD
>>>>>>> 5dd3eb3a6d (GEOMESA-3100 Kafka layer views (#2784))
<<<<<<< HEAD
>>>>>>> ea8384d9b7 (GEOMESA-3100 Kafka layer views (#2784))
=======
=======
=======
=======
=======
>>>>>>> 2f6607232 (GEOMESA-3100 Kafka layer views (#2784))
>>>>>>> c57b5f538 (GEOMESA-3100 Kafka layer views (#2784))
=======
>>>>>>> 79f56900f0 (GEOMESA-3100 Kafka layer views (#2784))
>>>>>>> 1e11ed51a6 (GEOMESA-3100 Kafka layer views (#2784))
<<<<<<< HEAD
>>>>>>> d530f7b24a (GEOMESA-3100 Kafka layer views (#2784))
<<<<<<< HEAD
>>>>>>> fe3378ccaa (GEOMESA-3100 Kafka layer views (#2784))
=======
=======
=======
=======
>>>>>>> 88ef67cdf (GEOMESA-3100 Kafka layer views (#2784))
>>>>>>> 976f319530 (GEOMESA-3100 Kafka layer views (#2784))
>>>>>>> 5e230912b1 (GEOMESA-3100 Kafka layer views (#2784))
>>>>>>> 79f56900f0 (GEOMESA-3100 Kafka layer views (#2784))
>>>>>>> af0a88eb1 (GEOMESA-3100 Kafka layer views (#2784))
=======
<<<<<<< HEAD
<<<<<<< HEAD
=======
>>>>>>> af0a88eb1 (GEOMESA-3100 Kafka layer views (#2784))
>>>>>>> locationtech-main
=======
>>>>>>> af0a88eb1 (GEOMESA-3100 Kafka layer views (#2784))
>>>>>>> 58286bfd3 (GEOMESA-3100 Kafka layer views (#2784))
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
>>>>>>> 808743e257 (GEOMESA-3100 Kafka layer views (#2784))
=======
>>>>>>> 0a0bf0292e (GEOMESA-3100 Kafka layer views (#2784))
=======
>>>>>>> 4b0dd3e513 (GEOMESA-3100 Kafka layer views (#2784))
=======
>>>>>>> 1c99a27679 (GEOMESA-3100 Kafka layer views (#2784))
>>>>>>> 5ca0cd6de5 (GEOMESA-3100 Kafka layer views (#2784))
=======
>>>>>>> af0a88eb1 (GEOMESA-3100 Kafka layer views (#2784))
>>>>>>> bddfdbea54 (GEOMESA-3100 Kafka layer views (#2784))
<<<<<<< HEAD
<<<<<<< HEAD
=======
>>>>>>> 5ca0cd6de (GEOMESA-3100 Kafka layer views (#2784))
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
>>>>>>> 6e453fd3d0 (GEOMESA-3100 Kafka layer views (#2784))
=======
>>>>>>> f187a4fcf9 (GEOMESA-3100 Kafka layer views (#2784))
=======
>>>>>>> d76a495d83 (GEOMESA-3100 Kafka layer views (#2784))
=======
>>>>>>> bbc8576d19 (GEOMESA-3100 Kafka layer views (#2784))
=======
>>>>>>> d3b123117a (GEOMESA-3100 Kafka layer views (#2784))
=======
>>>>>>> 92dc7a8411 (GEOMESA-3100 Kafka layer views (#2784))
=======
>>>>>>> 2766fc9b5b (GEOMESA-3100 Kafka layer views (#2784))
=======
>>>>>>> 2f673a268a (GEOMESA-3100 Kafka layer views (#2784))
=======
>>>>>>> c44e474495 (GEOMESA-3100 Kafka layer views (#2784))
=======
>>>>>>> c2a94543ba (GEOMESA-3100 Kafka layer views (#2784))
>>>>>>> d0dc799ff1 (GEOMESA-3100 Kafka layer views (#2784))
=======
>>>>>>> af0a88eb1 (GEOMESA-3100 Kafka layer views (#2784))
>>>>>>> 95c83ca7fa (GEOMESA-3100 Kafka layer views (#2784))
=======
>>>>>>> 5ca0cd6de (GEOMESA-3100 Kafka layer views (#2784))
>>>>>>> 9361541304 (GEOMESA-3100 Kafka layer views (#2784))
<<<<<<< HEAD
=======
=======
>>>>>>> af0a88eb1 (GEOMESA-3100 Kafka layer views (#2784))
>>>>>>> bddfdbea5 (GEOMESA-3100 Kafka layer views (#2784))
>>>>>>> 2f66072323 (GEOMESA-3100 Kafka layer views (#2784))
=======
=======
>>>>>>> ac0357d362 (GEOMESA-3100 Kafka layer views (#2784))
=======
<<<<<<< HEAD
<<<<<<< HEAD
>>>>>>> a62b956fb6 (GEOMESA-3100 Kafka layer views (#2784))
=======
=======
>>>>>>> ea3b40e18 (GEOMESA-3100 Kafka layer views (#2784))
>>>>>>> 4adaa7f479 (GEOMESA-3100 Kafka layer views (#2784))
=======
<<<<<<< HEAD
<<<<<<< HEAD
>>>>>>> 54ece16d15 (GEOMESA-3100 Kafka layer views (#2784))
=======
>>>>>>> c57b5f538a (GEOMESA-3100 Kafka layer views (#2784))
=======
<<<<<<< HEAD
<<<<<<< HEAD
=======
>>>>>>> c2a94543ba (GEOMESA-3100 Kafka layer views (#2784))
=======
>>>>>>> ea3b40e18 (GEOMESA-3100 Kafka layer views (#2784))
>>>>>>> 88ef67cdfe (GEOMESA-3100 Kafka layer views (#2784))
=======
<<<<<<< HEAD
>>>>>>> 626c8f9b93 (GEOMESA-3100 Kafka layer views (#2784))
=======
>>>>>>> 9a5d6d2815 (GEOMESA-3100 Kafka layer views (#2784))
=======
=======
>>>>>>> ea3b40e18 (GEOMESA-3100 Kafka layer views (#2784))
>>>>>>> f4b2369e9a (GEOMESA-3100 Kafka layer views (#2784))
=======
=======
>>>>>>> d76a495d83 (GEOMESA-3100 Kafka layer views (#2784))
=======
>>>>>>> a62b956fb6 (GEOMESA-3100 Kafka layer views (#2784))
=======
>>>>>>> bbc8576d19 (GEOMESA-3100 Kafka layer views (#2784))
=======
>>>>>>> d3b123117a (GEOMESA-3100 Kafka layer views (#2784))
=======
>>>>>>> 54ece16d15 (GEOMESA-3100 Kafka layer views (#2784))
=======
>>>>>>> 2f673a268a (GEOMESA-3100 Kafka layer views (#2784))
=======
>>>>>>> c44e474495 (GEOMESA-3100 Kafka layer views (#2784))
=======
>>>>>>> c2a94543ba (GEOMESA-3100 Kafka layer views (#2784))
>>>>>>> af0a88eb1 (GEOMESA-3100 Kafka layer views (#2784))
>>>>>>> bddfdbea5 (GEOMESA-3100 Kafka layer views (#2784))
=======
>>>>>>> d0dc799ff (GEOMESA-3100 Kafka layer views (#2784))
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
>>>>>>> d309fbbbbf (GEOMESA-3100 Kafka layer views (#2784))
=======
>>>>>>> d3b123117a (GEOMESA-3100 Kafka layer views (#2784))
=======
>>>>>>> de8804123e (GEOMESA-3100 Kafka layer views (#2784))
=======
>>>>>>> c2a94543ba (GEOMESA-3100 Kafka layer views (#2784))
>>>>>>> ea3b40e187 (GEOMESA-3100 Kafka layer views (#2784))
=======
>>>>>>> af0a88eb1 (GEOMESA-3100 Kafka layer views (#2784))
>>>>>>> d2cb939f51 (GEOMESA-3100 Kafka layer views (#2784))
=======
>>>>>>> 3be8d2a5a4 (Merge branch 'feature/postgis-fixes')
=======
>>>>>>> af0a88eb1 (GEOMESA-3100 Kafka layer views (#2784))
>>>>>>> 9bda77cfe3 (GEOMESA-3100 Kafka layer views (#2784))
<<<<<<< HEAD
<<<<<<< HEAD
=======
>>>>>>> 5ca0cd6de (GEOMESA-3100 Kafka layer views (#2784))
>>>>>>> 9236b02087 (GEOMESA-3100 Kafka layer views (#2784))
=======
=======
>>>>>>> af0a88eb1 (GEOMESA-3100 Kafka layer views (#2784))
>>>>>>> bddfdbea5 (GEOMESA-3100 Kafka layer views (#2784))
>>>>>>> 862857ce2e (GEOMESA-3100 Kafka layer views (#2784))
<<<<<<< HEAD
<<<<<<< HEAD
=======
>>>>>>> f187a4fcf9 (GEOMESA-3100 Kafka layer views (#2784))
=======
=======
>>>>>>> af0a88eb1 (GEOMESA-3100 Kafka layer views (#2784))
>>>>>>> bddfdbea5 (GEOMESA-3100 Kafka layer views (#2784))
=======
>>>>>>> d0dc799ff (GEOMESA-3100 Kafka layer views (#2784))
>>>>>>> 28427dfd8f (GEOMESA-3100 Kafka layer views (#2784))
<<<<<<< HEAD
<<<<<<< HEAD
=======
=======
>>>>>>> 4adaa7f479 (GEOMESA-3100 Kafka layer views (#2784))
=======
<<<<<<< HEAD
<<<<<<< HEAD
>>>>>>> 88ef67cdfe (GEOMESA-3100 Kafka layer views (#2784))
=======
>>>>>>> f4b2369e9a (GEOMESA-3100 Kafka layer views (#2784))
=======
=======
>>>>>>> d3b123117a (GEOMESA-3100 Kafka layer views (#2784))
=======
>>>>>>> 88ef67cdfe (GEOMESA-3100 Kafka layer views (#2784))
=======
>>>>>>> c2a94543ba (GEOMESA-3100 Kafka layer views (#2784))
>>>>>>> af0a88eb1 (GEOMESA-3100 Kafka layer views (#2784))
>>>>>>> 95c83ca7f (GEOMESA-3100 Kafka layer views (#2784))
<<<<<<< HEAD
<<<<<<< HEAD
<<<<<<< HEAD
<<<<<<< HEAD
=======
>>>>>>> 2f673a268a (GEOMESA-3100 Kafka layer views (#2784))
>>>>>>> 4231e686dd (GEOMESA-3100 Kafka layer views (#2784))
=======
=======
>>>>>>> 936154130 (GEOMESA-3100 Kafka layer views (#2784))
<<<<<<< HEAD
<<<<<<< HEAD
<<<<<<< HEAD
<<<<<<< HEAD
=======
>>>>>>> c44e474495 (GEOMESA-3100 Kafka layer views (#2784))
>>>>>>> ac0357d362 (GEOMESA-3100 Kafka layer views (#2784))
=======
=======
>>>>>>> c57b5f538a (GEOMESA-3100 Kafka layer views (#2784))
=======
<<<<<<< HEAD
>>>>>>> 9a5d6d2815 (GEOMESA-3100 Kafka layer views (#2784))
=======
=======
>>>>>>> c44e474495 (GEOMESA-3100 Kafka layer views (#2784))
=======
>>>>>>> af0a88eb1 (GEOMESA-3100 Kafka layer views (#2784))
>>>>>>> bddfdbea5 (GEOMESA-3100 Kafka layer views (#2784))
>>>>>>> 2f6607232 (GEOMESA-3100 Kafka layer views (#2784))
<<<<<<< HEAD
<<<<<<< HEAD
<<<<<<< HEAD
<<<<<<< HEAD
<<<<<<< HEAD
<<<<<<< HEAD
<<<<<<< HEAD
=======
>>>>>>> c44e474495 (GEOMESA-3100 Kafka layer views (#2784))
=======
>>>>>>> c2a94543ba (GEOMESA-3100 Kafka layer views (#2784))
>>>>>>> a62b956fb6 (GEOMESA-3100 Kafka layer views (#2784))
=======
=======
>>>>>>> ea3b40e18 (GEOMESA-3100 Kafka layer views (#2784))
<<<<<<< HEAD
>>>>>>> 4adaa7f479 (GEOMESA-3100 Kafka layer views (#2784))
=======
=======
>>>>>>> af0a88eb1 (GEOMESA-3100 Kafka layer views (#2784))
>>>>>>> d2cb939f5 (GEOMESA-3100 Kafka layer views (#2784))
<<<<<<< HEAD
>>>>>>> 6af71ff432 (GEOMESA-3100 Kafka layer views (#2784))
=======
=======
>>>>>>> 3be8d2a5a (Merge branch 'feature/postgis-fixes')
>>>>>>> db8d998aa2 (Merge branch 'feature/postgis-fixes')
<<<<<<< HEAD
<<<<<<< HEAD
=======
>>>>>>> d845d7c1bd (GEOMESA-3254 Add Bloop build support)
=======
>>>>>>> af0a88eb1 (GEOMESA-3100 Kafka layer views (#2784))
>>>>>>> d2002b5afd (GEOMESA-3100 Kafka layer views (#2784))
<<<<<<< HEAD
<<<<<<< HEAD
=======
>>>>>>> 5ca0cd6de (GEOMESA-3100 Kafka layer views (#2784))
>>>>>>> f6e840b5dd (GEOMESA-3100 Kafka layer views (#2784))
=======
=======
>>>>>>> af0a88eb1 (GEOMESA-3100 Kafka layer views (#2784))
>>>>>>> bddfdbea5 (GEOMESA-3100 Kafka layer views (#2784))
>>>>>>> c589b832a5 (GEOMESA-3100 Kafka layer views (#2784))
<<<<<<< HEAD
<<<<<<< HEAD
=======
>>>>>>> 2766fc9b5b (GEOMESA-3100 Kafka layer views (#2784))
=======
=======
>>>>>>> af0a88eb1 (GEOMESA-3100 Kafka layer views (#2784))
>>>>>>> bddfdbea5 (GEOMESA-3100 Kafka layer views (#2784))
=======
>>>>>>> d0dc799ff (GEOMESA-3100 Kafka layer views (#2784))
>>>>>>> ffbc2ce32a (GEOMESA-3100 Kafka layer views (#2784))
<<<<<<< HEAD
<<<<<<< HEAD
=======
>>>>>>> de8804123e (GEOMESA-3100 Kafka layer views (#2784))
=======
=======
>>>>>>> af0a88eb1 (GEOMESA-3100 Kafka layer views (#2784))
>>>>>>> 95c83ca7f (GEOMESA-3100 Kafka layer views (#2784))
>>>>>>> fa68dd43c6 (GEOMESA-3100 Kafka layer views (#2784))
<<<<<<< HEAD
<<<<<<< HEAD
=======
>>>>>>> 2f673a268a (GEOMESA-3100 Kafka layer views (#2784))
=======
=======
>>>>>>> 936154130 (GEOMESA-3100 Kafka layer views (#2784))
>>>>>>> 54ece16d15 (GEOMESA-3100 Kafka layer views (#2784))
<<<<<<< HEAD
<<<<<<< HEAD
=======
>>>>>>> c57b5f538a (GEOMESA-3100 Kafka layer views (#2784))
=======
=======
>>>>>>> ea3b40e18 (GEOMESA-3100 Kafka layer views (#2784))
>>>>>>> 88ef67cdfe (GEOMESA-3100 Kafka layer views (#2784))
<<<<<<< HEAD
<<<<<<< HEAD
=======
>>>>>>> af0a88eb1 (GEOMESA-3100 Kafka layer views (#2784))
>>>>>>> 69287f5812 (GEOMESA-3100 Kafka layer views (#2784))
=======
>>>>>>> 5ca0cd6de (GEOMESA-3100 Kafka layer views (#2784))
>>>>>>> 64646d61ed (GEOMESA-3100 Kafka layer views (#2784))
=======
=======
>>>>>>> af0a88eb1 (GEOMESA-3100 Kafka layer views (#2784))
>>>>>>> bddfdbea5 (GEOMESA-3100 Kafka layer views (#2784))
>>>>>>> 12fe94b860 (GEOMESA-3100 Kafka layer views (#2784))
=======
=======
>>>>>>> af0a88eb1 (GEOMESA-3100 Kafka layer views (#2784))
>>>>>>> bddfdbea5 (GEOMESA-3100 Kafka layer views (#2784))
=======
>>>>>>> d0dc799ff (GEOMESA-3100 Kafka layer views (#2784))
>>>>>>> 0e42c51dc0 (GEOMESA-3100 Kafka layer views (#2784))
=======
=======
>>>>>>> af0a88eb1 (GEOMESA-3100 Kafka layer views (#2784))
>>>>>>> 95c83ca7f (GEOMESA-3100 Kafka layer views (#2784))
>>>>>>> 19aa61c0de (GEOMESA-3100 Kafka layer views (#2784))
=======
=======
>>>>>>> 936154130 (GEOMESA-3100 Kafka layer views (#2784))
>>>>>>> 626c8f9b93 (GEOMESA-3100 Kafka layer views (#2784))
=======
>>>>>>> 9a5d6d2815 (GEOMESA-3100 Kafka layer views (#2784))
=======
=======
>>>>>>> ea3b40e18 (GEOMESA-3100 Kafka layer views (#2784))
>>>>>>> f4b2369e9a (GEOMESA-3100 Kafka layer views (#2784))
=======
>>>>>>> af0a88eb1 (GEOMESA-3100 Kafka layer views (#2784))
>>>>>>> 984dd84de9 (GEOMESA-3100 Kafka layer views (#2784))
=======
>>>>>>> 5ca0cd6de5 (GEOMESA-3100 Kafka layer views (#2784))
>>>>>>> 770d928c15 (GEOMESA-3100 Kafka layer views (#2784))
=======
>>>>>>> 5dc1f86700 (GEOMESA-3100 Kafka layer views (#2784))
=======
=======
>>>>>>> 5ca0cd6de (GEOMESA-3100 Kafka layer views (#2784))
>>>>>>> d0dc799ff1 (GEOMESA-3100 Kafka layer views (#2784))
<<<<<<< HEAD
>>>>>>> 808743e257 (GEOMESA-3100 Kafka layer views (#2784))
=======
=======
>>>>>>> af0a88eb1 (GEOMESA-3100 Kafka layer views (#2784))
>>>>>>> 95c83ca7fa (GEOMESA-3100 Kafka layer views (#2784))
>>>>>>> ad0d29873e (GEOMESA-3100 Kafka layer views (#2784))
=======
>>>>>>> 0a0bf0292e (GEOMESA-3100 Kafka layer views (#2784))
=======
>>>>>>> 64da8137f1 (GEOMESA-3100 Kafka layer views (#2784))
=======
=======
>>>>>>> 5ca0cd6de (GEOMESA-3100 Kafka layer views (#2784))
>>>>>>> 9236b02087 (GEOMESA-3100 Kafka layer views (#2784))
>>>>>>> 4b0dd3e513 (GEOMESA-3100 Kafka layer views (#2784))
=======
>>>>>>> 6e453fd3d0 (GEOMESA-3100 Kafka layer views (#2784))
=======
>>>>>>> f187a4fcf9 (GEOMESA-3100 Kafka layer views (#2784))
=======
=======
=======
>>>>>>> af0a88eb1 (GEOMESA-3100 Kafka layer views (#2784))
>>>>>>> 95c83ca7f (GEOMESA-3100 Kafka layer views (#2784))
<<<<<<< HEAD
>>>>>>> 4231e686dd (GEOMESA-3100 Kafka layer views (#2784))
<<<<<<< HEAD
>>>>>>> d309fbbbbf (GEOMESA-3100 Kafka layer views (#2784))
=======
=======
=======
>>>>>>> 936154130 (GEOMESA-3100 Kafka layer views (#2784))
<<<<<<< HEAD
>>>>>>> ac0357d362 (GEOMESA-3100 Kafka layer views (#2784))
<<<<<<< HEAD
>>>>>>> d76a495d83 (GEOMESA-3100 Kafka layer views (#2784))
=======
=======
=======
=======
>>>>>>> af0a88eb1 (GEOMESA-3100 Kafka layer views (#2784))
>>>>>>> bddfdbea5 (GEOMESA-3100 Kafka layer views (#2784))
>>>>>>> 2f6607232 (GEOMESA-3100 Kafka layer views (#2784))
<<<<<<< HEAD
>>>>>>> a62b956fb6 (GEOMESA-3100 Kafka layer views (#2784))
<<<<<<< HEAD
>>>>>>> bbc8576d19 (GEOMESA-3100 Kafka layer views (#2784))
=======
=======
=======
>>>>>>> ea3b40e18 (GEOMESA-3100 Kafka layer views (#2784))
<<<<<<< HEAD
>>>>>>> 4adaa7f479 (GEOMESA-3100 Kafka layer views (#2784))
<<<<<<< HEAD
>>>>>>> d3b123117a (GEOMESA-3100 Kafka layer views (#2784))
=======
=======
=======
>>>>>>> af0a88eb1 (GEOMESA-3100 Kafka layer views (#2784))
>>>>>>> d2cb939f5 (GEOMESA-3100 Kafka layer views (#2784))
>>>>>>> 6af71ff432 (GEOMESA-3100 Kafka layer views (#2784))
>>>>>>> 885048dd7d (GEOMESA-3100 Kafka layer views (#2784))
=======
>>>>>>> 42e8565e9b (Merge branch 'feature/postgis-fixes')
=======
=======
>>>>>>> d845d7c1bd (GEOMESA-3254 Add Bloop build support)
>>>>>>> f1532f2313 (GEOMESA-3254 Add Bloop build support)
=======
>>>>>>> 66bdd8fd8d (GEOMESA-3100 Kafka layer views (#2784))
=======
=======
>>>>>>> 5ca0cd6de (GEOMESA-3100 Kafka layer views (#2784))
>>>>>>> f6e840b5dd (GEOMESA-3100 Kafka layer views (#2784))
>>>>>>> 1c99a27679 (GEOMESA-3100 Kafka layer views (#2784))
=======
>>>>>>> 92dc7a8411 (GEOMESA-3100 Kafka layer views (#2784))
=======
>>>>>>> 2766fc9b5b (GEOMESA-3100 Kafka layer views (#2784))
=======
>>>>>>> de8804123e (GEOMESA-3100 Kafka layer views (#2784))
=======
>>>>>>> 2f673a268a (GEOMESA-3100 Kafka layer views (#2784))
=======
=======
>>>>>>> c57b5f538a (GEOMESA-3100 Kafka layer views (#2784))
>>>>>>> c44e474495 (GEOMESA-3100 Kafka layer views (#2784))
=======
>>>>>>> c2a94543ba (GEOMESA-3100 Kafka layer views (#2784))
=======
=======
>>>>>>> af0a88eb1 (GEOMESA-3100 Kafka layer views (#2784))
>>>>>>> 69287f5812 (GEOMESA-3100 Kafka layer views (#2784))
>>>>>>> 13347c6405 (GEOMESA-3100 Kafka layer views (#2784))
    // kick off the kafka consumers for this sft, if not already started
    caches.get(layerViewLookup.getOrElse(query.getTypeName, query.getTypeName))
    GeoMesaFeatureReader(sft, query, runner, config.audit)
  }

<<<<<<< HEAD
  override private[geomesa] def getFeatureWriter(
      sft: SimpleFeatureType,
      transaction: Transaction,
      filter: Option[Filter]): FlushableFeatureWriter = {
    if (layerViewLookup.contains(sft.getTypeName)) {
      throw new IllegalArgumentException(
        s"Schema '${sft.getTypeName}' is a read-only view of '${layerViewLookup(sft.getTypeName)}'")
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
<<<<<<< HEAD
<<<<<<< HEAD
<<<<<<< HEAD
>>>>>>> 3010fc384e (GEOMESA-3100 Kafka layer views (#2784))
=======
>>>>>>> f1532f2313 (GEOMESA-3254 Add Bloop build support)
=======
=======
>>>>>>> db8d998aa2 (Merge branch 'feature/postgis-fixes')
>>>>>>> 42e8565e9b (Merge branch 'feature/postgis-fixes')
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
>>>>>>> 66bdd8fd8d (GEOMESA-3100 Kafka layer views (#2784))
=======
>>>>>>> 92dc7a8411 (GEOMESA-3100 Kafka layer views (#2784))
=======
>>>>>>> de8804123e (GEOMESA-3100 Kafka layer views (#2784))
=======
>>>>>>> 13347c6405 (GEOMESA-3100 Kafka layer views (#2784))
<<<<<<< HEAD
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
=======
>>>>>>> 64da8137f1 (GEOMESA-3100 Kafka layer views (#2784))
=======
>>>>>>> 6e453fd3d0 (GEOMESA-3100 Kafka layer views (#2784))
=======
>>>>>>> d309fbbbbf (GEOMESA-3100 Kafka layer views (#2784))
=======
>>>>>>> 885048dd7d (GEOMESA-3100 Kafka layer views (#2784))
=======
=======
>>>>>>> a0314fb7ff (GEOMESA-3100 Kafka layer views (#2784))
=======
>>>>>>> 9bda77cfe3 (GEOMESA-3100 Kafka layer views (#2784))
<<<<<<< HEAD
<<<<<<< HEAD
=======
>>>>>>> 862857ce2e (GEOMESA-3100 Kafka layer views (#2784))
=======
>>>>>>> 4231e686dd (GEOMESA-3100 Kafka layer views (#2784))
<<<<<<< HEAD
<<<<<<< HEAD
=======
>>>>>>> 6af71ff432 (GEOMESA-3100 Kafka layer views (#2784))
=======
=======
>>>>>>> 17f13b3a7a (GEOMESA-3100 Kafka layer views (#2784))
<<<<<<< HEAD
<<<<<<< HEAD
=======
<<<<<<< HEAD
>>>>>>> d2002b5afd (GEOMESA-3100 Kafka layer views (#2784))
=======
<<<<<<< HEAD
>>>>>>> c589b832a5 (GEOMESA-3100 Kafka layer views (#2784))
<<<<<<< HEAD
<<<<<<< HEAD
=======
<<<<<<< HEAD
>>>>>>> fa68dd43c6 (GEOMESA-3100 Kafka layer views (#2784))
=======
>>>>>>> 69287f5812 (GEOMESA-3100 Kafka layer views (#2784))
<<<<<<< HEAD
=======
>>>>>>> 12fe94b860 (GEOMESA-3100 Kafka layer views (#2784))
=======
>>>>>>> 19aa61c0de (GEOMESA-3100 Kafka layer views (#2784))
=======
>>>>>>> 984dd84de9 (GEOMESA-3100 Kafka layer views (#2784))
=======
>>>>>>> 5dc1f86700 (GEOMESA-3100 Kafka layer views (#2784))
=======
>>>>>>> ad0d29873e (GEOMESA-3100 Kafka layer views (#2784))
=======
>>>>>>> 64da8137f1 (GEOMESA-3100 Kafka layer views (#2784))
=======
=======
>>>>>>> 862857ce2e (GEOMESA-3100 Kafka layer views (#2784))
>>>>>>> 6e453fd3d0 (GEOMESA-3100 Kafka layer views (#2784))
=======
>>>>>>> d309fbbbbf (GEOMESA-3100 Kafka layer views (#2784))
=======
=======
>>>>>>> 6af71ff432 (GEOMESA-3100 Kafka layer views (#2784))
>>>>>>> 885048dd7d (GEOMESA-3100 Kafka layer views (#2784))
=======
>>>>>>> 3010fc384e (GEOMESA-3100 Kafka layer views (#2784))
=======
=======
<<<<<<< HEAD
>>>>>>> d2002b5afd (GEOMESA-3100 Kafka layer views (#2784))
>>>>>>> 66bdd8fd8d (GEOMESA-3100 Kafka layer views (#2784))
=======
>>>>>>> 92dc7a8411 (GEOMESA-3100 Kafka layer views (#2784))
=======
=======
<<<<<<< HEAD
>>>>>>> fa68dd43c6 (GEOMESA-3100 Kafka layer views (#2784))
>>>>>>> de8804123e (GEOMESA-3100 Kafka layer views (#2784))
=======
>>>>>>> 13347c6405 (GEOMESA-3100 Kafka layer views (#2784))
    new KafkaFeatureStore(this, sft, runner, cache(typeName))
  }

  override def getFeatureReader(query: Query, transaction: Transaction): SimpleFeatureReader = {
    val sft = getSchema(query.getTypeName)
    if (sft == null) {
      throw new IOException(s"Schema '${query.getTypeName}' has not been initialized. Please call 'createSchema' first.")
    }
    // kick off the kafka consumers for this sft, if not already started
    caches.get(layerViewLookup.getOrElse(query.getTypeName, query.getTypeName))
    GeoMesaFeatureReader(sft, query, runner, None, config.audit)
  }

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
>>>>>>> 64da8137f1 (GEOMESA-3100 Kafka layer views (#2784))
=======
>>>>>>> 3010fc384e (GEOMESA-3100 Kafka layer views (#2784))
=======
>>>>>>> 66bdd8fd8d (GEOMESA-3100 Kafka layer views (#2784))
=======
>>>>>>> 13347c6405 (GEOMESA-3100 Kafka layer views (#2784))
=======
>>>>>>> f7038468b7 (GEOMESA-3100 Kafka layer views (#2784))
=======
>>>>>>> bddfdbea54 (GEOMESA-3100 Kafka layer views (#2784))
<<<<<<< HEAD
<<<<<<< HEAD
=======
>>>>>>> 95c83ca7fa (GEOMESA-3100 Kafka layer views (#2784))
=======
>>>>>>> d2cb939f51 (GEOMESA-3100 Kafka layer views (#2784))
=======
>>>>>>> a0314fb7ff (GEOMESA-3100 Kafka layer views (#2784))
=======
=======
>>>>>>> f7038468b (GEOMESA-3100 Kafka layer views (#2784))
<<<<<<< HEAD
<<<<<<< HEAD
<<<<<<< HEAD
<<<<<<< HEAD
<<<<<<< HEAD
<<<<<<< HEAD
=======
>>>>>>> 6e453fd3d0 (GEOMESA-3100 Kafka layer views (#2784))
=======
>>>>>>> 92dc7a8411 (GEOMESA-3100 Kafka layer views (#2784))
>>>>>>> 9bda77cfe3 (GEOMESA-3100 Kafka layer views (#2784))
=======
=======
>>>>>>> bddfdbea5 (GEOMESA-3100 Kafka layer views (#2784))
<<<<<<< HEAD
<<<<<<< HEAD
<<<<<<< HEAD
<<<<<<< HEAD
<<<<<<< HEAD
<<<<<<< HEAD
=======
>>>>>>> d309fbbbbf (GEOMESA-3100 Kafka layer views (#2784))
=======
>>>>>>> de8804123e (GEOMESA-3100 Kafka layer views (#2784))
>>>>>>> 862857ce2e (GEOMESA-3100 Kafka layer views (#2784))
=======
=======
>>>>>>> 95c83ca7f (GEOMESA-3100 Kafka layer views (#2784))
<<<<<<< HEAD
<<<<<<< HEAD
<<<<<<< HEAD
=======
>>>>>>> 885048dd7d (GEOMESA-3100 Kafka layer views (#2784))
>>>>>>> 4231e686dd (GEOMESA-3100 Kafka layer views (#2784))
=======
=======
>>>>>>> d2cb939f5 (GEOMESA-3100 Kafka layer views (#2784))
>>>>>>> 6af71ff432 (GEOMESA-3100 Kafka layer views (#2784))
<<<<<<< HEAD
<<<<<<< HEAD
=======
>>>>>>> 17f13b3a7a (GEOMESA-3100 Kafka layer views (#2784))
=======
=======
>>>>>>> f7038468b (GEOMESA-3100 Kafka layer views (#2784))
>>>>>>> d2002b5afd (GEOMESA-3100 Kafka layer views (#2784))
<<<<<<< HEAD
<<<<<<< HEAD
=======
>>>>>>> 92dc7a8411 (GEOMESA-3100 Kafka layer views (#2784))
=======
=======
>>>>>>> bddfdbea5 (GEOMESA-3100 Kafka layer views (#2784))
>>>>>>> c589b832a5 (GEOMESA-3100 Kafka layer views (#2784))
<<<<<<< HEAD
<<<<<<< HEAD
=======
>>>>>>> de8804123e (GEOMESA-3100 Kafka layer views (#2784))
=======
=======
>>>>>>> 95c83ca7f (GEOMESA-3100 Kafka layer views (#2784))
>>>>>>> fa68dd43c6 (GEOMESA-3100 Kafka layer views (#2784))
<<<<<<< HEAD
<<<<<<< HEAD
=======
>>>>>>> 13347c6405 (GEOMESA-3100 Kafka layer views (#2784))
=======
=======
>>>>>>> f7038468b (GEOMESA-3100 Kafka layer views (#2784))
>>>>>>> 69287f5812 (GEOMESA-3100 Kafka layer views (#2784))
<<<<<<< HEAD
=======
=======
>>>>>>> bddfdbea5 (GEOMESA-3100 Kafka layer views (#2784))
>>>>>>> 12fe94b860 (GEOMESA-3100 Kafka layer views (#2784))
=======
=======
>>>>>>> 95c83ca7f (GEOMESA-3100 Kafka layer views (#2784))
>>>>>>> 19aa61c0de (GEOMESA-3100 Kafka layer views (#2784))
=======
=======
>>>>>>> f7038468b7 (GEOMESA-3100 Kafka layer views (#2784))
>>>>>>> 984dd84de9 (GEOMESA-3100 Kafka layer views (#2784))
=======
>>>>>>> 5dc1f86700 (GEOMESA-3100 Kafka layer views (#2784))
=======
=======
>>>>>>> 95c83ca7fa (GEOMESA-3100 Kafka layer views (#2784))
>>>>>>> ad0d29873e (GEOMESA-3100 Kafka layer views (#2784))
=======
>>>>>>> 9bda77cfe3 (GEOMESA-3100 Kafka layer views (#2784))
>>>>>>> 64da8137f1 (GEOMESA-3100 Kafka layer views (#2784))
=======
>>>>>>> 862857ce2e (GEOMESA-3100 Kafka layer views (#2784))
>>>>>>> 6e453fd3d0 (GEOMESA-3100 Kafka layer views (#2784))
=======
>>>>>>> 4231e686dd (GEOMESA-3100 Kafka layer views (#2784))
>>>>>>> d309fbbbbf (GEOMESA-3100 Kafka layer views (#2784))
=======
>>>>>>> 885048dd7d (GEOMESA-3100 Kafka layer views (#2784))
=======
=======
>>>>>>> 17f13b3a7a (GEOMESA-3100 Kafka layer views (#2784))
>>>>>>> 3010fc384e (GEOMESA-3100 Kafka layer views (#2784))
=======
>>>>>>> 66bdd8fd8d (GEOMESA-3100 Kafka layer views (#2784))
=======
>>>>>>> 92dc7a8411 (GEOMESA-3100 Kafka layer views (#2784))
=======
>>>>>>> de8804123e (GEOMESA-3100 Kafka layer views (#2784))
=======
>>>>>>> 13347c6405 (GEOMESA-3100 Kafka layer views (#2784))
  override def getFeatureWriter(typeName: String, filter: Filter, transaction: Transaction): KafkaFeatureWriter = {
    val sft = getSchema(typeName)
    if (sft == null) {
      throw new IOException(s"Schema '$typeName' has not been initialized. Please call 'createSchema' first.")
    } else if (layerViewLookup.contains(typeName)) {
      throw new IllegalArgumentException(s"Schema '$typeName' is a read-only view of '${layerViewLookup(typeName)}'")
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
>>>>>>> 984dd84de9 (GEOMESA-3100 Kafka layer views (#2784))
=======
>>>>>>> 770d928c15 (GEOMESA-3100 Kafka layer views (#2784))
=======
>>>>>>> 5dc1f86700 (GEOMESA-3100 Kafka layer views (#2784))
=======
>>>>>>> 808743e257 (GEOMESA-3100 Kafka layer views (#2784))
=======
>>>>>>> 0a0bf0292e (GEOMESA-3100 Kafka layer views (#2784))
=======
>>>>>>> 4b0dd3e513 (GEOMESA-3100 Kafka layer views (#2784))
=======
>>>>>>> 6e453fd3d0 (GEOMESA-3100 Kafka layer views (#2784))
=======
>>>>>>> f187a4fcf9 (GEOMESA-3100 Kafka layer views (#2784))
=======
>>>>>>> d309fbbbbf (GEOMESA-3100 Kafka layer views (#2784))
=======
>>>>>>> d76a495d83 (GEOMESA-3100 Kafka layer views (#2784))
=======
>>>>>>> bbc8576d19 (GEOMESA-3100 Kafka layer views (#2784))
=======
>>>>>>> d3b123117a (GEOMESA-3100 Kafka layer views (#2784))
=======
>>>>>>> 885048dd7d (GEOMESA-3100 Kafka layer views (#2784))
=======
>>>>>>> 3010fc384e (GEOMESA-3100 Kafka layer views (#2784))
=======
>>>>>>> 1c99a27679 (GEOMESA-3100 Kafka layer views (#2784))
=======
>>>>>>> 92dc7a8411 (GEOMESA-3100 Kafka layer views (#2784))
=======
>>>>>>> 2766fc9b5b (GEOMESA-3100 Kafka layer views (#2784))
=======
>>>>>>> de8804123e (GEOMESA-3100 Kafka layer views (#2784))
=======
>>>>>>> 2f673a268a (GEOMESA-3100 Kafka layer views (#2784))
=======
>>>>>>> c44e474495 (GEOMESA-3100 Kafka layer views (#2784))
=======
>>>>>>> c2a94543ba (GEOMESA-3100 Kafka layer views (#2784))
>>>>>>> af0a88eb17 (GEOMESA-3100 Kafka layer views (#2784))
=======
=======
>>>>>>> 9361541304 (GEOMESA-3100 Kafka layer views (#2784))
<<<<<<< HEAD
=======
>>>>>>> 2f66072323 (GEOMESA-3100 Kafka layer views (#2784))
=======
>>>>>>> ea3b40e187 (GEOMESA-3100 Kafka layer views (#2784))
=======
>>>>>>> 9236b02087 (GEOMESA-3100 Kafka layer views (#2784))
<<<<<<< HEAD
<<<<<<< HEAD
=======
>>>>>>> 862857ce2e (GEOMESA-3100 Kafka layer views (#2784))
=======
>>>>>>> 28427dfd8f (GEOMESA-3100 Kafka layer views (#2784))
<<<<<<< HEAD
<<<<<<< HEAD
=======
>>>>>>> f6e840b5dd (GEOMESA-3100 Kafka layer views (#2784))
=======
>>>>>>> c589b832a5 (GEOMESA-3100 Kafka layer views (#2784))
<<<<<<< HEAD
<<<<<<< HEAD
=======
>>>>>>> ffbc2ce32a (GEOMESA-3100 Kafka layer views (#2784))
=======
>>>>>>> 64646d61ed (GEOMESA-3100 Kafka layer views (#2784))
=======
>>>>>>> 12fe94b860 (GEOMESA-3100 Kafka layer views (#2784))
=======
>>>>>>> 0e42c51dc0 (GEOMESA-3100 Kafka layer views (#2784))
=======
>>>>>>> 0a0bf0292e (GEOMESA-3100 Kafka layer views (#2784))
=======
>>>>>>> 4b0dd3e513 (GEOMESA-3100 Kafka layer views (#2784))
=======
=======
>>>>>>> 862857ce2e (GEOMESA-3100 Kafka layer views (#2784))
>>>>>>> 6e453fd3d0 (GEOMESA-3100 Kafka layer views (#2784))
=======
>>>>>>> f187a4fcf9 (GEOMESA-3100 Kafka layer views (#2784))
=======
=======
>>>>>>> f6e840b5dd (GEOMESA-3100 Kafka layer views (#2784))
>>>>>>> 1c99a27679 (GEOMESA-3100 Kafka layer views (#2784))
=======
>>>>>>> 92dc7a8411 (GEOMESA-3100 Kafka layer views (#2784))
=======
=======
>>>>>>> ffbc2ce32a (GEOMESA-3100 Kafka layer views (#2784))
>>>>>>> 2766fc9b5b (GEOMESA-3100 Kafka layer views (#2784))
>>>>>>> af0a88eb1 (GEOMESA-3100 Kafka layer views (#2784))
<<<<<<< HEAD
<<<<<<< HEAD
<<<<<<< HEAD
<<<<<<< HEAD
<<<<<<< HEAD
<<<<<<< HEAD
<<<<<<< HEAD
<<<<<<< HEAD
=======
>>>>>>> 64da8137f1 (GEOMESA-3100 Kafka layer views (#2784))
=======
>>>>>>> 66bdd8fd8d (GEOMESA-3100 Kafka layer views (#2784))
=======
>>>>>>> 13347c6405 (GEOMESA-3100 Kafka layer views (#2784))
>>>>>>> 95c83ca7fa (GEOMESA-3100 Kafka layer views (#2784))
=======
<<<<<<< HEAD
>>>>>>> 890b70c869 (GEOMESA-3100 Kafka layer views (#2784))
=======
>>>>>>> af0a88eb1 (GEOMESA-3100 Kafka layer views (#2784))
>>>>>>> d2cb939f51 (GEOMESA-3100 Kafka layer views (#2784))
=======
>>>>>>> 4d37d5ef54 (GEOMESA-3100 Kafka layer views (#2784))
=======
>>>>>>> 3be8d2a5a4 (Merge branch 'feature/postgis-fixes')
=======
>>>>>>> af0a88eb1 (GEOMESA-3100 Kafka layer views (#2784))
>>>>>>> a0314fb7ff (GEOMESA-3100 Kafka layer views (#2784))
=======
>>>>>>> 9bda77cfe3 (GEOMESA-3100 Kafka layer views (#2784))
<<<<<<< HEAD
<<<<<<< HEAD
=======
=======
=======
>>>>>>> 936154130 (GEOMESA-3100 Kafka layer views (#2784))
>>>>>>> ac0357d362 (GEOMESA-3100 Kafka layer views (#2784))
<<<<<<< HEAD
<<<<<<< HEAD
=======
=======
>>>>>>> 4adaa7f479 (GEOMESA-3100 Kafka layer views (#2784))
=======
>>>>>>> 6af71ff432 (GEOMESA-3100 Kafka layer views (#2784))
=======
>>>>>>> 88ef67cdfe (GEOMESA-3100 Kafka layer views (#2784))
=======
>>>>>>> f4b2369e9a (GEOMESA-3100 Kafka layer views (#2784))
=======
>>>>>>> 936154130 (GEOMESA-3100 Kafka layer views (#2784))
=======
>>>>>>> 2f6607232 (GEOMESA-3100 Kafka layer views (#2784))
<<<<<<< HEAD
<<<<<<< HEAD
<<<<<<< HEAD
>>>>>>> a62b956fb6 (GEOMESA-3100 Kafka layer views (#2784))
=======
=======
>>>>>>> ea3b40e18 (GEOMESA-3100 Kafka layer views (#2784))
>>>>>>> 4adaa7f479 (GEOMESA-3100 Kafka layer views (#2784))
=======
>>>>>>> d76a495d83 (GEOMESA-3100 Kafka layer views (#2784))
=======
=======
=======
>>>>>>> 4adaa7f479 (GEOMESA-3100 Kafka layer views (#2784))
=======
>>>>>>> 6af71ff432 (GEOMESA-3100 Kafka layer views (#2784))
=======
>>>>>>> 88ef67cdfe (GEOMESA-3100 Kafka layer views (#2784))
=======
>>>>>>> 936154130 (GEOMESA-3100 Kafka layer views (#2784))
=======
>>>>>>> 2f6607232 (GEOMESA-3100 Kafka layer views (#2784))
<<<<<<< HEAD
<<<<<<< HEAD
>>>>>>> a62b956fb6 (GEOMESA-3100 Kafka layer views (#2784))
<<<<<<< HEAD
>>>>>>> bbc8576d19 (GEOMESA-3100 Kafka layer views (#2784))
=======
=======
=======
>>>>>>> ea3b40e18 (GEOMESA-3100 Kafka layer views (#2784))
>>>>>>> 4adaa7f479 (GEOMESA-3100 Kafka layer views (#2784))
>>>>>>> d3b123117a (GEOMESA-3100 Kafka layer views (#2784))
>>>>>>> af0a88eb1 (GEOMESA-3100 Kafka layer views (#2784))
<<<<<<< HEAD
<<<<<<< HEAD
<<<<<<< HEAD
=======
>>>>>>> af0a88eb1 (GEOMESA-3100 Kafka layer views (#2784))
>>>>>>> 95c83ca7f (GEOMESA-3100 Kafka layer views (#2784))
<<<<<<< HEAD
>>>>>>> 4231e686dd (GEOMESA-3100 Kafka layer views (#2784))
=======
=======
>>>>>>> 890b70c86 (GEOMESA-3100 Kafka layer views (#2784))
<<<<<<< HEAD
>>>>>>> 8347f5d271 (GEOMESA-3100 Kafka layer views (#2784))
=======
=======
>>>>>>> af0a88eb1 (GEOMESA-3100 Kafka layer views (#2784))
>>>>>>> d2cb939f5 (GEOMESA-3100 Kafka layer views (#2784))
<<<<<<< HEAD
<<<<<<< HEAD
<<<<<<< HEAD
=======
>>>>>>> e8dd13fa26 (GEOMESA-3100 Kafka layer views (#2784))
>>>>>>> 6af71ff432 (GEOMESA-3100 Kafka layer views (#2784))
=======
=======
>>>>>>> 4d37d5ef5 (GEOMESA-3100 Kafka layer views (#2784))
<<<<<<< HEAD
<<<<<<< HEAD
<<<<<<< HEAD
=======
>>>>>>> 42e8565e9b (Merge branch 'feature/postgis-fixes')
>>>>>>> b4c6267f1c (GEOMESA-3100 Kafka layer views (#2784))
=======
=======
>>>>>>> 3be8d2a5a (Merge branch 'feature/postgis-fixes')
>>>>>>> db8d998aa2 (Merge branch 'feature/postgis-fixes')
<<<<<<< HEAD
<<<<<<< HEAD
=======
>>>>>>> d845d7c1bd (GEOMESA-3254 Add Bloop build support)
=======
>>>>>>> af0a88eb1 (GEOMESA-3100 Kafka layer views (#2784))
>>>>>>> 17f13b3a7a (GEOMESA-3100 Kafka layer views (#2784))
<<<<<<< HEAD
<<<<<<< HEAD
=======
>>>>>>> d2002b5afd (GEOMESA-3100 Kafka layer views (#2784))
=======
<<<<<<< HEAD
<<<<<<< HEAD
=======
>>>>>>> 2f673a268a (GEOMESA-3100 Kafka layer views (#2784))
=======
=======
>>>>>>> 936154130 (GEOMESA-3100 Kafka layer views (#2784))
>>>>>>> 54ece16d15 (GEOMESA-3100 Kafka layer views (#2784))
<<<<<<< HEAD
<<<<<<< HEAD
=======
>>>>>>> c44e474495 (GEOMESA-3100 Kafka layer views (#2784))
=======
=======
>>>>>>> 936154130 (GEOMESA-3100 Kafka layer views (#2784))
=======
>>>>>>> 2f6607232 (GEOMESA-3100 Kafka layer views (#2784))
>>>>>>> c57b5f538a (GEOMESA-3100 Kafka layer views (#2784))
<<<<<<< HEAD
<<<<<<< HEAD
=======
>>>>>>> c2a94543ba (GEOMESA-3100 Kafka layer views (#2784))
=======
=======
>>>>>>> ea3b40e18 (GEOMESA-3100 Kafka layer views (#2784))
>>>>>>> 88ef67cdfe (GEOMESA-3100 Kafka layer views (#2784))
<<<<<<< HEAD
=======
=======
>>>>>>> 936154130 (GEOMESA-3100 Kafka layer views (#2784))
>>>>>>> 626c8f9b93 (GEOMESA-3100 Kafka layer views (#2784))
=======
=======
>>>>>>> 936154130 (GEOMESA-3100 Kafka layer views (#2784))
=======
>>>>>>> 2f6607232 (GEOMESA-3100 Kafka layer views (#2784))
>>>>>>> 9a5d6d2815 (GEOMESA-3100 Kafka layer views (#2784))
=======
=======
>>>>>>> ea3b40e18 (GEOMESA-3100 Kafka layer views (#2784))
>>>>>>> f4b2369e9a (GEOMESA-3100 Kafka layer views (#2784))
=======
>>>>>>> 2f673a268a (GEOMESA-3100 Kafka layer views (#2784))
=======
>>>>>>> c44e474495 (GEOMESA-3100 Kafka layer views (#2784))
=======
>>>>>>> c2a94543ba (GEOMESA-3100 Kafka layer views (#2784))
>>>>>>> af0a88eb1 (GEOMESA-3100 Kafka layer views (#2784))
<<<<<<< HEAD
<<<<<<< HEAD
=======
>>>>>>> af0a88eb1 (GEOMESA-3100 Kafka layer views (#2784))
>>>>>>> 95c83ca7f (GEOMESA-3100 Kafka layer views (#2784))
<<<<<<< HEAD
>>>>>>> fa68dd43c6 (GEOMESA-3100 Kafka layer views (#2784))
=======
=======
>>>>>>> 890b70c86 (GEOMESA-3100 Kafka layer views (#2784))
>>>>>>> 0fde036fa7 (GEOMESA-3100 Kafka layer views (#2784))
=======
>>>>>>> 69287f5812 (GEOMESA-3100 Kafka layer views (#2784))
<<<<<<< HEAD
=======
>>>>>>> af0a88eb1 (GEOMESA-3100 Kafka layer views (#2784))
<<<<<<< HEAD
<<<<<<< HEAD
=======
>>>>>>> af0a88eb1 (GEOMESA-3100 Kafka layer views (#2784))
>>>>>>> 95c83ca7f (GEOMESA-3100 Kafka layer views (#2784))
<<<<<<< HEAD
>>>>>>> 19aa61c0de (GEOMESA-3100 Kafka layer views (#2784))
=======
=======
>>>>>>> 890b70c86 (GEOMESA-3100 Kafka layer views (#2784))
>>>>>>> 96f945c352 (GEOMESA-3100 Kafka layer views (#2784))
=======
>>>>>>> af0a88eb17 (GEOMESA-3100 Kafka layer views (#2784))
=======
>>>>>>> af0a88eb1 (GEOMESA-3100 Kafka layer views (#2784))
<<<<<<< HEAD
>>>>>>> 95c83ca7fa (GEOMESA-3100 Kafka layer views (#2784))
<<<<<<< HEAD
>>>>>>> ad0d29873e (GEOMESA-3100 Kafka layer views (#2784))
=======
=======
<<<<<<< HEAD
>>>>>>> 890b70c869 (GEOMESA-3100 Kafka layer views (#2784))
>>>>>>> c3ab11ea86 (GEOMESA-3100 Kafka layer views (#2784))
=======
>>>>>>> 64da8137f1 (GEOMESA-3100 Kafka layer views (#2784))
=======
=======
>>>>>>> af0a88eb1 (GEOMESA-3100 Kafka layer views (#2784))
<<<<<<< HEAD
<<<<<<< HEAD
=======
>>>>>>> af0a88eb1 (GEOMESA-3100 Kafka layer views (#2784))
>>>>>>> 95c83ca7f (GEOMESA-3100 Kafka layer views (#2784))
<<<<<<< HEAD
>>>>>>> 4231e686dd (GEOMESA-3100 Kafka layer views (#2784))
<<<<<<< HEAD
>>>>>>> d309fbbbbf (GEOMESA-3100 Kafka layer views (#2784))
=======
=======
=======
>>>>>>> 890b70c86 (GEOMESA-3100 Kafka layer views (#2784))
>>>>>>> 8347f5d271 (GEOMESA-3100 Kafka layer views (#2784))
>>>>>>> 77fda9e6a0 (GEOMESA-3100 Kafka layer views (#2784))
=======
>>>>>>> 6af71ff432 (GEOMESA-3100 Kafka layer views (#2784))
>>>>>>> 885048dd7d (GEOMESA-3100 Kafka layer views (#2784))
=======
>>>>>>> b4c6267f1c (GEOMESA-3100 Kafka layer views (#2784))
>>>>>>> e8dd13fa26 (GEOMESA-3100 Kafka layer views (#2784))
=======
>>>>>>> 42e8565e9b (Merge branch 'feature/postgis-fixes')
=======
=======
>>>>>>> d845d7c1bd (GEOMESA-3254 Add Bloop build support)
>>>>>>> f1532f2313 (GEOMESA-3254 Add Bloop build support)
=======
>>>>>>> 3010fc384e (GEOMESA-3100 Kafka layer views (#2784))
=======
=======
>>>>>>> d2002b5afd (GEOMESA-3100 Kafka layer views (#2784))
>>>>>>> 66bdd8fd8d (GEOMESA-3100 Kafka layer views (#2784))
=======
>>>>>>> af0a88eb1 (GEOMESA-3100 Kafka layer views (#2784))
<<<<<<< HEAD
<<<<<<< HEAD
=======
>>>>>>> af0a88eb1 (GEOMESA-3100 Kafka layer views (#2784))
>>>>>>> 95c83ca7f (GEOMESA-3100 Kafka layer views (#2784))
<<<<<<< HEAD
>>>>>>> fa68dd43c6 (GEOMESA-3100 Kafka layer views (#2784))
<<<<<<< HEAD
>>>>>>> de8804123e (GEOMESA-3100 Kafka layer views (#2784))
=======
=======
=======
>>>>>>> 890b70c86 (GEOMESA-3100 Kafka layer views (#2784))
>>>>>>> 0fde036fa7 (GEOMESA-3100 Kafka layer views (#2784))
>>>>>>> 44b3849076 (GEOMESA-3100 Kafka layer views (#2784))
=======
>>>>>>> 13347c6405 (GEOMESA-3100 Kafka layer views (#2784))
    }
    val producer = getTransactionalProducer(sft, transaction)
    val vis = sft.isVisibilityRequired
    val serializer = serialization.apply(sft)
    val writer = filter match {
      case None if vis    => new AppendKafkaFeatureWriter(sft, producer, serializer) with RequiredVisibilityWriter
      case None           => new AppendKafkaFeatureWriter(sft, producer, serializer)
      case Some(f) if vis => new ModifyKafkaFeatureWriter(sft, producer, serializer, f) with RequiredVisibilityWriter
      case Some(f)        => new ModifyKafkaFeatureWriter(sft, producer, serializer, f)
    }
<<<<<<< HEAD
    if (config.clearOnStart && cleared.add(sft.getTypeName)) {
<<<<<<< HEAD
<<<<<<< HEAD
<<<<<<< HEAD
<<<<<<< HEAD
<<<<<<< HEAD
<<<<<<< HEAD
<<<<<<< HEAD
<<<<<<< HEAD
=======
>>>>>>> a0314fb7ff (GEOMESA-3100 Kafka layer views (#2784))
=======
>>>>>>> 17f13b3a7a (GEOMESA-3100 Kafka layer views (#2784))
=======
    writer
  }

  override def getFeatureWriterAppend(typeName: String, transaction: Transaction): KafkaFeatureWriter = {
    val sft = getSchema(typeName)
    if (sft == null) {
      throw new IOException(s"Schema '$typeName' has not been initialized. Please call 'createSchema' first.")
    } else if (layerViewLookup.contains(typeName)) {
      throw new IllegalArgumentException(s"Schema '$typeName' is a read-only view of '${layerViewLookup(typeName)}'")
    }
    val producer = getTransactionalProducer(transaction)
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
>>>>>>> af0a88eb1 (GEOMESA-3100 Kafka layer views (#2784))
=======
<<<<<<< HEAD
=======
>>>>>>> af0a88eb1 (GEOMESA-3100 Kafka layer views (#2784))
=======
<<<<<<< HEAD
<<<<<<< HEAD
>>>>>>> d0dc799ff1 (GEOMESA-3100 Kafka layer views (#2784))
=======
=======
>>>>>>> af0a88eb1 (GEOMESA-3100 Kafka layer views (#2784))
>>>>>>> d0dc799ff (GEOMESA-3100 Kafka layer views (#2784))
=======
<<<<<<< HEAD
<<<<<<< HEAD
>>>>>>> 9361541304 (GEOMESA-3100 Kafka layer views (#2784))
=======
>>>>>>> af0a88eb1 (GEOMESA-3100 Kafka layer views (#2784))
>>>>>>> locationtech-main
=======
>>>>>>> af0a88eb1 (GEOMESA-3100 Kafka layer views (#2784))
>>>>>>> 58286bfd3 (GEOMESA-3100 Kafka layer views (#2784))
<<<<<<< HEAD
<<<<<<< HEAD
>>>>>>> 5ca0cd6de5 (GEOMESA-3100 Kafka layer views (#2784))
=======
>>>>>>> af0a88eb1 (GEOMESA-3100 Kafka layer views (#2784))
>>>>>>> bddfdbea54 (GEOMESA-3100 Kafka layer views (#2784))
=======
>>>>>>> 5ca0cd6de (GEOMESA-3100 Kafka layer views (#2784))
<<<<<<< HEAD
<<<<<<< HEAD
<<<<<<< HEAD
<<<<<<< HEAD
=======
>>>>>>> d0dc799ff1 (GEOMESA-3100 Kafka layer views (#2784))
>>>>>>> 6368ee48e8 (GEOMESA-3100 Kafka layer views (#2784))
=======
>>>>>>> f43f8303d3 (GEOMESA-3100 Kafka layer views (#2784))
>>>>>>> d0dc799ff1 (GEOMESA-3100 Kafka layer views (#2784))
=======
>>>>>>> 5ca0cd6de (GEOMESA-3100 Kafka layer views (#2784))
>>>>>>> 9361541304 (GEOMESA-3100 Kafka layer views (#2784))
=======
=======
>>>>>>> af0a88eb1 (GEOMESA-3100 Kafka layer views (#2784))
>>>>>>> bddfdbea5 (GEOMESA-3100 Kafka layer views (#2784))
>>>>>>> 2f66072323 (GEOMESA-3100 Kafka layer views (#2784))
<<<<<<< HEAD
<<<<<<< HEAD
=======
>>>>>>> 6368ee48e8 (GEOMESA-3100 Kafka layer views (#2784))
=======
=======
>>>>>>> af0a88eb1 (GEOMESA-3100 Kafka layer views (#2784))
>>>>>>> bddfdbea5 (GEOMESA-3100 Kafka layer views (#2784))
=======
>>>>>>> d0dc799ff (GEOMESA-3100 Kafka layer views (#2784))
>>>>>>> ea3b40e187 (GEOMESA-3100 Kafka layer views (#2784))
<<<<<<< HEAD
<<<<<<< HEAD
    }
    val producer = getTransactionalProducer(sft, transaction)
=======
=======
>>>>>>> 19aa61c0de (GEOMESA-3100 Kafka layer views (#2784))
=======
>>>>>>> 96f945c352 (GEOMESA-3100 Kafka layer views (#2784))
=======
=======
>>>>>>> af0a88eb1 (GEOMESA-3100 Kafka layer views (#2784))
>>>>>>> d0dc799ff (GEOMESA-3100 Kafka layer views (#2784))
=======
<<<<<<< HEAD
>>>>>>> af0a88eb1 (GEOMESA-3100 Kafka layer views (#2784))
>>>>>>> d0dc799ff (GEOMESA-3100 Kafka layer views (#2784))
=======
=======
>>>>>>> 936154130 (GEOMESA-3100 Kafka layer views (#2784))
<<<<<<< HEAD
<<<<<<< HEAD
=======
>>>>>>> af0a88eb1 (GEOMESA-3100 Kafka layer views (#2784))
>>>>>>> locationtech-main
=======
>>>>>>> af0a88eb1 (GEOMESA-3100 Kafka layer views (#2784))
>>>>>>> 58286bfd3 (GEOMESA-3100 Kafka layer views (#2784))
>>>>>>> 5ca0cd6de (GEOMESA-3100 Kafka layer views (#2784))
<<<<<<< HEAD
<<<<<<< HEAD
<<<<<<< HEAD
<<<<<<< HEAD
=======
>>>>>>> ea3b40e18 (GEOMESA-3100 Kafka layer views (#2784))
=======
>>>>>>> af0a88eb1 (GEOMESA-3100 Kafka layer views (#2784))
>>>>>>> bddfdbea5 (GEOMESA-3100 Kafka layer views (#2784))
=======
>>>>>>> d0dc799ff (GEOMESA-3100 Kafka layer views (#2784))
<<<<<<< HEAD
=======
>>>>>>> 936154130 (GEOMESA-3100 Kafka layer views (#2784))
=======
=======
>>>>>>> af0a88eb1 (GEOMESA-3100 Kafka layer views (#2784))
>>>>>>> bddfdbea5 (GEOMESA-3100 Kafka layer views (#2784))
>>>>>>> 2f6607232 (GEOMESA-3100 Kafka layer views (#2784))
=======
>>>>>>> ea3b40e18 (GEOMESA-3100 Kafka layer views (#2784))
<<<<<<< HEAD
    }
<<<<<<< HEAD
    val producer = getTransactionalProducer(transaction)
>>>>>>> 890b70c869 (GEOMESA-3100 Kafka layer views (#2784))
=======
    val producer = getTransactionalProducer(sft, transaction)
>>>>>>> d657014c83 (GEOMESA-3198 Kafka streams integration (#2854))
=======
=======
    }
<<<<<<< HEAD
    val producer = getTransactionalProducer(transaction)
>>>>>>> 4d37d5ef54 (GEOMESA-3100 Kafka layer views (#2784))
    val vis = sft.isVisibilityRequired
    val writer = filter match {
      case None if vis    => new AppendKafkaFeatureWriter(sft, producer, config.serialization) with RequiredVisibilityWriter
      case None           => new AppendKafkaFeatureWriter(sft, producer, config.serialization)
      case Some(f) if vis => new ModifyKafkaFeatureWriter(sft, producer, config.serialization, f) with RequiredVisibilityWriter
      case Some(f)        => new ModifyKafkaFeatureWriter(sft, producer, config.serialization, f)
    }
<<<<<<< HEAD
    if (config.clearOnStart && cleared.add(sft.getTypeName)) {
=======
>>>>>>> db8d998aa2 (Merge branch 'feature/postgis-fixes')
=======
    writer
  }

  override def getFeatureWriterAppend(typeName: String, transaction: Transaction): KafkaFeatureWriter = {
    val sft = getSchema(typeName)
    if (sft == null) {
      throw new IOException(s"Schema '$typeName' has not been initialized. Please call 'createSchema' first.")
    } else if (layerViewLookup.contains(typeName)) {
      throw new IllegalArgumentException(s"Schema '$typeName' is a read-only view of '${layerViewLookup(typeName)}'")
    }
    val producer = getTransactionalProducer(transaction)
<<<<<<< HEAD
<<<<<<< HEAD
<<<<<<< HEAD
<<<<<<< HEAD
<<<<<<< HEAD
<<<<<<< HEAD
<<<<<<< HEAD
<<<<<<< HEAD
<<<<<<< HEAD
>>>>>>> f7038468b7 (GEOMESA-3100 Kafka layer views (#2784))
=======
>>>>>>> bddfdbea54 (GEOMESA-3100 Kafka layer views (#2784))
=======
>>>>>>> 95c83ca7fa (GEOMESA-3100 Kafka layer views (#2784))
=======
>>>>>>> f7038468b (GEOMESA-3100 Kafka layer views (#2784))
>>>>>>> 890b70c869 (GEOMESA-3100 Kafka layer views (#2784))
=======
>>>>>>> f7038468b (GEOMESA-3100 Kafka layer views (#2784))
=======
>>>>>>> bddfdbea5 (GEOMESA-3100 Kafka layer views (#2784))
>>>>>>> 2f66072323 (GEOMESA-3100 Kafka layer views (#2784))
=======
>>>>>>> d2cb939f51 (GEOMESA-3100 Kafka layer views (#2784))
=======
>>>>>>> f7038468b (GEOMESA-3100 Kafka layer views (#2784))
>>>>>>> 4d37d5ef54 (GEOMESA-3100 Kafka layer views (#2784))
=======
>>>>>>> a0314fb7ff (GEOMESA-3100 Kafka layer views (#2784))
=======
=======
>>>>>>> 4231e686dd (GEOMESA-3100 Kafka layer views (#2784))
=======
>>>>>>> 8347f5d271 (GEOMESA-3100 Kafka layer views (#2784))
=======
>>>>>>> 6af71ff432 (GEOMESA-3100 Kafka layer views (#2784))
=======
>>>>>>> b4c6267f1c (GEOMESA-3100 Kafka layer views (#2784))
=======
=======
>>>>>>> af0a88eb1 (GEOMESA-3100 Kafka layer views (#2784))
>>>>>>> d0dc799ff (GEOMESA-3100 Kafka layer views (#2784))
=======
<<<<<<< HEAD
>>>>>>> af0a88eb1 (GEOMESA-3100 Kafka layer views (#2784))
>>>>>>> d0dc799ff (GEOMESA-3100 Kafka layer views (#2784))
=======
=======
>>>>>>> 936154130 (GEOMESA-3100 Kafka layer views (#2784))
<<<<<<< HEAD
<<<<<<< HEAD
=======
>>>>>>> af0a88eb1 (GEOMESA-3100 Kafka layer views (#2784))
>>>>>>> locationtech-main
=======
>>>>>>> af0a88eb1 (GEOMESA-3100 Kafka layer views (#2784))
>>>>>>> 58286bfd3 (GEOMESA-3100 Kafka layer views (#2784))
>>>>>>> 5ca0cd6de (GEOMESA-3100 Kafka layer views (#2784))
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
>>>>>>> c1d0543aac (GEOMESA-3100 Kafka layer views (#2784))
=======
>>>>>>> 8b9e99d11a (GEOMESA-3100 Kafka layer views (#2784))
=======
>>>>>>> ea3b40e18 (GEOMESA-3100 Kafka layer views (#2784))
=======
>>>>>>> 73767737b (GEOMESA-3100 Kafka layer views (#2784))
=======
>>>>>>> 429ffc55e (GEOMESA-3100 Kafka layer views (#2784))
=======
>>>>>>> e7f3e6588 (GEOMESA-3100 Kafka layer views (#2784))
=======
=======
>>>>>>> ea3b40e18 (GEOMESA-3100 Kafka layer views (#2784))
>>>>>>> 6f6887eb8 (GEOMESA-3100 Kafka layer views (#2784))
=======
=======
>>>>>>> 04f82bbc57 (GEOMESA-3100 Kafka layer views (#2784))
=======
>>>>>>> e0773a1bd7 (GEOMESA-3100 Kafka layer views (#2784))
=======
>>>>>>> ae5eea67f1 (GEOMESA-3100 Kafka layer views (#2784))
=======
>>>>>>> 4480b2d1b9 (GEOMESA-3100 Kafka layer views (#2784))
=======
>>>>>>> 9e433ba57e (GEOMESA-3100 Kafka layer views (#2784))
=======
>>>>>>> 2df2640494 (GEOMESA-3100 Kafka layer views (#2784))
=======
>>>>>>> 826636f69d (GEOMESA-3100 Kafka layer views (#2784))
=======
>>>>>>> 1e11ed51a6 (GEOMESA-3100 Kafka layer views (#2784))
=======
>>>>>>> 976f319530 (GEOMESA-3100 Kafka layer views (#2784))
=======
>>>>>>> ea3b40e18 (GEOMESA-3100 Kafka layer views (#2784))
=======
>>>>>>> 28427dfd8 (GEOMESA-3100 Kafka layer views (#2784))
>>>>>>> 614fcb6bc3 (GEOMESA-3100 Kafka layer views (#2784))
=======
>>>>>>> ac0357d36 (GEOMESA-3100 Kafka layer views (#2784))
=======
>>>>>>> a62b956fb (GEOMESA-3100 Kafka layer views (#2784))
=======
=======
>>>>>>> ea3b40e18 (GEOMESA-3100 Kafka layer views (#2784))
>>>>>>> 4adaa7f47 (GEOMESA-3100 Kafka layer views (#2784))
=======
>>>>>>> ffbc2ce32 (GEOMESA-3100 Kafka layer views (#2784))
=======
>>>>>>> 54ece16d1 (GEOMESA-3100 Kafka layer views (#2784))
=======
>>>>>>> c57b5f538 (GEOMESA-3100 Kafka layer views (#2784))
=======
=======
>>>>>>> ea3b40e18 (GEOMESA-3100 Kafka layer views (#2784))
>>>>>>> 88ef67cdf (GEOMESA-3100 Kafka layer views (#2784))
=======
>>>>>>> af0a88eb1 (GEOMESA-3100 Kafka layer views (#2784))
>>>>>>> bddfdbea5 (GEOMESA-3100 Kafka layer views (#2784))
=======
>>>>>>> d0dc799ff (GEOMESA-3100 Kafka layer views (#2784))
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
>>>>>>> 6f6887eb8 (GEOMESA-3100 Kafka layer views (#2784))
=======
<<<<<<< HEAD
=======
>>>>>>> 614fcb6bc3 (GEOMESA-3100 Kafka layer views (#2784))
=======
>>>>>>> 69e3273ac1 (GEOMESA-3100 Kafka layer views (#2784))
=======
=======
>>>>>>> 2df2640494 (GEOMESA-3100 Kafka layer views (#2784))
=======
>>>>>>> 23f312535d (GEOMESA-3100 Kafka layer views (#2784))
=======
>>>>>>> 976f319530 (GEOMESA-3100 Kafka layer views (#2784))
=======
>>>>>>> 4adaa7f47 (GEOMESA-3100 Kafka layer views (#2784))
>>>>>>> ae5eea67f1 (GEOMESA-3100 Kafka layer views (#2784))
=======
>>>>>>> 88ef67cdf (GEOMESA-3100 Kafka layer views (#2784))
=======
>>>>>>> af0a88eb1 (GEOMESA-3100 Kafka layer views (#2784))
>>>>>>> 95c83ca7f (GEOMESA-3100 Kafka layer views (#2784))
=======
>>>>>>> 9b15c8e14c (GEOMESA-3100 Kafka layer views (#2784))
>>>>>>> 936154130 (GEOMESA-3100 Kafka layer views (#2784))
<<<<<<< HEAD
<<<<<<< HEAD
<<<<<<< HEAD
<<<<<<< HEAD
<<<<<<< HEAD
<<<<<<< HEAD
=======
>>>>>>> e7f3e6588 (GEOMESA-3100 Kafka layer views (#2784))
=======
>>>>>>> 04f82bbc57 (GEOMESA-3100 Kafka layer views (#2784))
=======
=======
>>>>>>> 826636f69d (GEOMESA-3100 Kafka layer views (#2784))
=======
>>>>>>> 1e11ed51a6 (GEOMESA-3100 Kafka layer views (#2784))
=======
>>>>>>> a62b956fb (GEOMESA-3100 Kafka layer views (#2784))
>>>>>>> e0773a1bd7 (GEOMESA-3100 Kafka layer views (#2784))
=======
>>>>>>> c57b5f538 (GEOMESA-3100 Kafka layer views (#2784))
=======
=======
>>>>>>> af0a88eb1 (GEOMESA-3100 Kafka layer views (#2784))
>>>>>>> bddfdbea5 (GEOMESA-3100 Kafka layer views (#2784))
>>>>>>> 2f6607232 (GEOMESA-3100 Kafka layer views (#2784))
<<<<<<< HEAD
<<<<<<< HEAD
<<<<<<< HEAD
<<<<<<< HEAD
<<<<<<< HEAD
<<<<<<< HEAD
=======
>>>>>>> e0773a1bd7 (GEOMESA-3100 Kafka layer views (#2784))
=======
>>>>>>> ae5eea67f1 (GEOMESA-3100 Kafka layer views (#2784))
=======
>>>>>>> 1e11ed51a6 (GEOMESA-3100 Kafka layer views (#2784))
=======
>>>>>>> 976f319530 (GEOMESA-3100 Kafka layer views (#2784))
=======
>>>>>>> ea3b40e18 (GEOMESA-3100 Kafka layer views (#2784))
<<<<<<< HEAD
=======
=======
>>>>>>> af0a88eb1 (GEOMESA-3100 Kafka layer views (#2784))
>>>>>>> d2cb939f5 (GEOMESA-3100 Kafka layer views (#2784))
<<<<<<< HEAD
<<<<<<< HEAD
<<<<<<< HEAD
=======
>>>>>>> 3be8d2a5a (Merge branch 'feature/postgis-fixes')
=======
>>>>>>> af0a88eb1 (GEOMESA-3100 Kafka layer views (#2784))
<<<<<<< HEAD
>>>>>>> e1f939a3e (GEOMESA-3100 Kafka layer views (#2784))
=======
>>>>>>> 581f1dd15 (GEOMESA-3100 Kafka layer views (#2784))
=======
=======
>>>>>>> af0a88eb1 (GEOMESA-3100 Kafka layer views (#2784))
>>>>>>> bddfdbea5 (GEOMESA-3100 Kafka layer views (#2784))
>>>>>>> 1a5f68233 (GEOMESA-3100 Kafka layer views (#2784))
=======
>>>>>>> 73767737b (GEOMESA-3100 Kafka layer views (#2784))
=======
=======
>>>>>>> af0a88eb1 (GEOMESA-3100 Kafka layer views (#2784))
>>>>>>> 95c83ca7f (GEOMESA-3100 Kafka layer views (#2784))
>>>>>>> 65a3a6e36 (GEOMESA-3100 Kafka layer views (#2784))
=======
>>>>>>> 429ffc55e (GEOMESA-3100 Kafka layer views (#2784))
=======
>>>>>>> e7f3e6588 (GEOMESA-3100 Kafka layer views (#2784))
=======
=======
>>>>>>> ea3b40e18 (GEOMESA-3100 Kafka layer views (#2784))
>>>>>>> 6f6887eb8 (GEOMESA-3100 Kafka layer views (#2784))
=======
>>>>>>> 42549e8e3 (GEOMESA-3100 Kafka layer views (#2784))
=======
=======
>>>>>>> 3be8d2a5a (Merge branch 'feature/postgis-fixes')
>>>>>>> e8cc4971c6 (Merge branch 'feature/postgis-fixes')
=======
>>>>>>> 9bda77cfe (GEOMESA-3100 Kafka layer views (#2784))
<<<<<<< HEAD
>>>>>>> 06956ccf98 (GEOMESA-3100 Kafka layer views (#2784))
=======
=======
>>>>>>> 9236b0208 (GEOMESA-3100 Kafka layer views (#2784))
<<<<<<< HEAD
>>>>>>> c1d0543aac (GEOMESA-3100 Kafka layer views (#2784))
=======
=======
=======
>>>>>>> af0a88eb1 (GEOMESA-3100 Kafka layer views (#2784))
>>>>>>> bddfdbea5 (GEOMESA-3100 Kafka layer views (#2784))
>>>>>>> 862857ce2 (GEOMESA-3100 Kafka layer views (#2784))
<<<<<<< HEAD
>>>>>>> 8b9e99d11a (GEOMESA-3100 Kafka layer views (#2784))
=======
=======
>>>>>>> 28427dfd8 (GEOMESA-3100 Kafka layer views (#2784))
<<<<<<< HEAD
>>>>>>> 614fcb6bc3 (GEOMESA-3100 Kafka layer views (#2784))
=======
=======
=======
>>>>>>> af0a88eb1 (GEOMESA-3100 Kafka layer views (#2784))
>>>>>>> 95c83ca7f (GEOMESA-3100 Kafka layer views (#2784))
>>>>>>> 4231e686d (GEOMESA-3100 Kafka layer views (#2784))
<<<<<<< HEAD
>>>>>>> 69e3273ac1 (GEOMESA-3100 Kafka layer views (#2784))
=======
=======
>>>>>>> ac0357d36 (GEOMESA-3100 Kafka layer views (#2784))
<<<<<<< HEAD
>>>>>>> 04f82bbc57 (GEOMESA-3100 Kafka layer views (#2784))
=======
=======
>>>>>>> a62b956fb (GEOMESA-3100 Kafka layer views (#2784))
<<<<<<< HEAD
>>>>>>> e0773a1bd7 (GEOMESA-3100 Kafka layer views (#2784))
=======
=======
=======
>>>>>>> ea3b40e18 (GEOMESA-3100 Kafka layer views (#2784))
>>>>>>> 4adaa7f47 (GEOMESA-3100 Kafka layer views (#2784))
<<<<<<< HEAD
>>>>>>> ae5eea67f1 (GEOMESA-3100 Kafka layer views (#2784))
=======
=======
>>>>>>> f6e840b5d (GEOMESA-3100 Kafka layer views (#2784))
<<<<<<< HEAD
>>>>>>> 4480b2d1b9 (GEOMESA-3100 Kafka layer views (#2784))
=======
=======
=======
>>>>>>> af0a88eb1 (GEOMESA-3100 Kafka layer views (#2784))
>>>>>>> bddfdbea5 (GEOMESA-3100 Kafka layer views (#2784))
>>>>>>> c589b832a (GEOMESA-3100 Kafka layer views (#2784))
<<<<<<< HEAD
>>>>>>> 9e433ba57e (GEOMESA-3100 Kafka layer views (#2784))
=======
=======
>>>>>>> ffbc2ce32 (GEOMESA-3100 Kafka layer views (#2784))
<<<<<<< HEAD
>>>>>>> 2df2640494 (GEOMESA-3100 Kafka layer views (#2784))
=======
=======
=======
>>>>>>> af0a88eb1 (GEOMESA-3100 Kafka layer views (#2784))
>>>>>>> 95c83ca7f (GEOMESA-3100 Kafka layer views (#2784))
>>>>>>> fa68dd43c (GEOMESA-3100 Kafka layer views (#2784))
<<<<<<< HEAD
>>>>>>> 23f312535d (GEOMESA-3100 Kafka layer views (#2784))
=======
=======
>>>>>>> 54ece16d1 (GEOMESA-3100 Kafka layer views (#2784))
<<<<<<< HEAD
>>>>>>> 826636f69d (GEOMESA-3100 Kafka layer views (#2784))
=======
=======
>>>>>>> c57b5f538 (GEOMESA-3100 Kafka layer views (#2784))
<<<<<<< HEAD
>>>>>>> 1e11ed51a6 (GEOMESA-3100 Kafka layer views (#2784))
=======
=======
=======
>>>>>>> ea3b40e18 (GEOMESA-3100 Kafka layer views (#2784))
>>>>>>> 88ef67cdf (GEOMESA-3100 Kafka layer views (#2784))
>>>>>>> 976f319530 (GEOMESA-3100 Kafka layer views (#2784))
=======
=======
>>>>>>> af0a88eb1 (GEOMESA-3100 Kafka layer views (#2784))
>>>>>>> d2cb939f5 (GEOMESA-3100 Kafka layer views (#2784))
>>>>>>> 305a9263eb (GEOMESA-3100 Kafka layer views (#2784))
=======
=======
>>>>>>> 3be8d2a5a (Merge branch 'feature/postgis-fixes')
>>>>>>> da00c7bd68 (Merge branch 'feature/postgis-fixes')
=======
>>>>>>> f43f8303d3 (GEOMESA-3100 Kafka layer views (#2784))
=======
>>>>>>> 6368ee48e8 (GEOMESA-3100 Kafka layer views (#2784))
=======
=======
>>>>>>> af0a88eb1 (GEOMESA-3100 Kafka layer views (#2784))
>>>>>>> d2cb939f51 (GEOMESA-3100 Kafka layer views (#2784))
<<<<<<< HEAD
>>>>>>> 4516873dab (GEOMESA-3100 Kafka layer views (#2784))
=======
=======
>>>>>>> 3be8d2a5a4 (Merge branch 'feature/postgis-fixes')
>>>>>>> 34472778d3 (Merge branch 'feature/postgis-fixes')
    // kick off the kafka consumers for this sft, if not already started
    caches.get(layerViewLookup.getOrElse(query.getTypeName, query.getTypeName))
    GeoMesaFeatureReader(sft, query, runner, config.audit)
  }

  override private[geomesa] def getFeatureWriter(
      sft: SimpleFeatureType,
      transaction: Transaction,
      filter: Option[Filter]): FlushableFeatureWriter = {
    if (layerViewLookup.contains(sft.getTypeName)) {
      throw new IllegalArgumentException(
        s"Schema '${sft.getTypeName}' is a read-only view of '${layerViewLookup(sft.getTypeName)}'")
<<<<<<< HEAD
<<<<<<< HEAD
<<<<<<< HEAD
<<<<<<< HEAD
<<<<<<< HEAD
<<<<<<< HEAD
<<<<<<< HEAD
<<<<<<< HEAD
=======
>>>>>>> e8cc4971c6 (Merge branch 'feature/postgis-fixes')
=======
>>>>>>> 8ed2c9f7e5 (GEOMESA-3100 Kafka layer views (#2784))
=======
>>>>>>> da00c7bd68 (Merge branch 'feature/postgis-fixes')
=======
>>>>>>> 34472778d3 (Merge branch 'feature/postgis-fixes')
=======
>>>>>>> 8ec26b8c2a (GEOMESA-3100 Kafka layer views (#2784))
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
<<<<<<< HEAD
<<<<<<< HEAD
=======
=======
>>>>>>> eecabb92a (GEOMESA-3100 Kafka layer views (#2784))
=======
>>>>>>> e1f939a3e (GEOMESA-3100 Kafka layer views (#2784))
=======
>>>>>>> 1a5f68233 (GEOMESA-3100 Kafka layer views (#2784))
=======
>>>>>>> 65a3a6e36 (GEOMESA-3100 Kafka layer views (#2784))
=======
>>>>>>> 42549e8e3 (GEOMESA-3100 Kafka layer views (#2784))
=======
=======
=======
>>>>>>> a0314fb7f (GEOMESA-3100 Kafka layer views (#2784))
>>>>>>> 8ed2c9f7e5 (GEOMESA-3100 Kafka layer views (#2784))
=======
=======
>>>>>>> 8b9e99d11a (GEOMESA-3100 Kafka layer views (#2784))
=======
>>>>>>> 69e3273ac1 (GEOMESA-3100 Kafka layer views (#2784))
=======
>>>>>>> 9e433ba57e (GEOMESA-3100 Kafka layer views (#2784))
=======
>>>>>>> 23f312535d (GEOMESA-3100 Kafka layer views (#2784))
=======
=======
>>>>>>> a0314fb7f (GEOMESA-3100 Kafka layer views (#2784))
=======
>>>>>>> 9bda77cfe (GEOMESA-3100 Kafka layer views (#2784))
<<<<<<< HEAD
>>>>>>> 06956ccf98 (GEOMESA-3100 Kafka layer views (#2784))
=======
=======
>>>>>>> 862857ce2 (GEOMESA-3100 Kafka layer views (#2784))
<<<<<<< HEAD
>>>>>>> 8b9e99d11a (GEOMESA-3100 Kafka layer views (#2784))
=======
=======
>>>>>>> 4231e686d (GEOMESA-3100 Kafka layer views (#2784))
>>>>>>> 69e3273ac1 (GEOMESA-3100 Kafka layer views (#2784))
=======
>>>>>>> 305a9263eb (GEOMESA-3100 Kafka layer views (#2784))
=======
=======
>>>>>>> c860f21098 (GEOMESA-3100 Kafka layer views (#2784))
=======
>>>>>>> 4516873dab (GEOMESA-3100 Kafka layer views (#2784))
=======
=======
=======
>>>>>>> a0314fb7ff (GEOMESA-3100 Kafka layer views (#2784))
>>>>>>> 8ec26b8c2a (GEOMESA-3100 Kafka layer views (#2784))
    new KafkaFeatureStore(this, sft, runner, cache(typeName))
  }

  override def getFeatureReader(query: Query, transaction: Transaction): SimpleFeatureReader = {
    val sft = getSchema(query.getTypeName)
    if (sft == null) {
      throw new IOException(s"Schema '${query.getTypeName}' has not been initialized. Please call 'createSchema' first.")
    }
    // kick off the kafka consumers for this sft, if not already started
    caches.get(layerViewLookup.getOrElse(query.getTypeName, query.getTypeName))
<<<<<<< HEAD
    GeoMesaFeatureReader(sft, query, runner, config.audit)
  }

<<<<<<< HEAD
<<<<<<< HEAD
<<<<<<< HEAD
<<<<<<< HEAD
=======
>>>>>>> 8ed2c9f7e5 (GEOMESA-3100 Kafka layer views (#2784))
=======
>>>>>>> 06956ccf98 (GEOMESA-3100 Kafka layer views (#2784))
=======
>>>>>>> f7038468b (GEOMESA-3100 Kafka layer views (#2784))
=======
>>>>>>> bddfdbea5 (GEOMESA-3100 Kafka layer views (#2784))
<<<<<<< HEAD
<<<<<<< HEAD
<<<<<<< HEAD
<<<<<<< HEAD
=======
>>>>>>> 8b9e99d11a (GEOMESA-3100 Kafka layer views (#2784))
=======
>>>>>>> 69e3273ac1 (GEOMESA-3100 Kafka layer views (#2784))
=======
>>>>>>> 95c83ca7f (GEOMESA-3100 Kafka layer views (#2784))
=======
>>>>>>> d2cb939f5 (GEOMESA-3100 Kafka layer views (#2784))
<<<<<<< HEAD
<<<<<<< HEAD
<<<<<<< HEAD
=======
>>>>>>> eecabb92a (GEOMESA-3100 Kafka layer views (#2784))
=======
=======
>>>>>>> f7038468b (GEOMESA-3100 Kafka layer views (#2784))
>>>>>>> e1f939a3e (GEOMESA-3100 Kafka layer views (#2784))
=======
>>>>>>> 1a5f68233 (GEOMESA-3100 Kafka layer views (#2784))
=======
=======
>>>>>>> 95c83ca7f (GEOMESA-3100 Kafka layer views (#2784))
>>>>>>> 65a3a6e36 (GEOMESA-3100 Kafka layer views (#2784))
=======
>>>>>>> 42549e8e3 (GEOMESA-3100 Kafka layer views (#2784))
=======
=======
>>>>>>> a0314fb7f (GEOMESA-3100 Kafka layer views (#2784))
<<<<<<< HEAD
>>>>>>> 8ed2c9f7e5 (GEOMESA-3100 Kafka layer views (#2784))
=======
=======
=======
>>>>>>> f7038468b (GEOMESA-3100 Kafka layer views (#2784))
>>>>>>> 9bda77cfe (GEOMESA-3100 Kafka layer views (#2784))
<<<<<<< HEAD
>>>>>>> 06956ccf98 (GEOMESA-3100 Kafka layer views (#2784))
=======
=======
>>>>>>> 862857ce2 (GEOMESA-3100 Kafka layer views (#2784))
<<<<<<< HEAD
>>>>>>> 8b9e99d11a (GEOMESA-3100 Kafka layer views (#2784))
=======
=======
=======
>>>>>>> 95c83ca7f (GEOMESA-3100 Kafka layer views (#2784))
>>>>>>> 4231e686d (GEOMESA-3100 Kafka layer views (#2784))
>>>>>>> 69e3273ac1 (GEOMESA-3100 Kafka layer views (#2784))
=======
>>>>>>> 305a9263eb (GEOMESA-3100 Kafka layer views (#2784))
=======
    GeoMesaFeatureReader(sft, query, runner, None, config.audit)
  }

<<<<<<< HEAD
<<<<<<< HEAD
>>>>>>> c860f21098 (GEOMESA-3100 Kafka layer views (#2784))
=======
=======
>>>>>>> 8ec26b8c2a (GEOMESA-3100 Kafka layer views (#2784))
=======
>>>>>>> f7038468b7 (GEOMESA-3100 Kafka layer views (#2784))
=======
>>>>>>> bddfdbea54 (GEOMESA-3100 Kafka layer views (#2784))
=======
>>>>>>> 95c83ca7fa (GEOMESA-3100 Kafka layer views (#2784))
=======
>>>>>>> d2cb939f51 (GEOMESA-3100 Kafka layer views (#2784))
<<<<<<< HEAD
>>>>>>> 4516873dab (GEOMESA-3100 Kafka layer views (#2784))
=======
=======
>>>>>>> a0314fb7ff (GEOMESA-3100 Kafka layer views (#2784))
>>>>>>> 8ec26b8c2a (GEOMESA-3100 Kafka layer views (#2784))
  override def getFeatureWriter(typeName: String, filter: Filter, transaction: Transaction): KafkaFeatureWriter = {
    val sft = getSchema(typeName)
    if (sft == null) {
      throw new IOException(s"Schema '$typeName' has not been initialized. Please call 'createSchema' first.")
    } else if (layerViewLookup.contains(typeName)) {
      throw new IllegalArgumentException(s"Schema '$typeName' is a read-only view of '${layerViewLookup(typeName)}'")
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
>>>>>>> e7f3e6588 (GEOMESA-3100 Kafka layer views (#2784))
=======
>>>>>>> 6f6887eb8 (GEOMESA-3100 Kafka layer views (#2784))
=======
>>>>>>> 42549e8e3 (GEOMESA-3100 Kafka layer views (#2784))
=======
>>>>>>> 8ed2c9f7e5 (GEOMESA-3100 Kafka layer views (#2784))
=======
>>>>>>> c1d0543aac (GEOMESA-3100 Kafka layer views (#2784))
=======
>>>>>>> 8b9e99d11a (GEOMESA-3100 Kafka layer views (#2784))
=======
>>>>>>> 614fcb6bc3 (GEOMESA-3100 Kafka layer views (#2784))
=======
>>>>>>> 69e3273ac1 (GEOMESA-3100 Kafka layer views (#2784))
=======
>>>>>>> 04f82bbc57 (GEOMESA-3100 Kafka layer views (#2784))
=======
=======
>>>>>>> ae5eea67f1 (GEOMESA-3100 Kafka layer views (#2784))
=======
>>>>>>> a62b956fb (GEOMESA-3100 Kafka layer views (#2784))
>>>>>>> e0773a1bd7 (GEOMESA-3100 Kafka layer views (#2784))
=======
>>>>>>> 4adaa7f47 (GEOMESA-3100 Kafka layer views (#2784))
=======
>>>>>>> 305a9263eb (GEOMESA-3100 Kafka layer views (#2784))
=======
>>>>>>> 936154130 (GEOMESA-3100 Kafka layer views (#2784))
=======
>>>>>>> 2f6607232 (GEOMESA-3100 Kafka layer views (#2784))
<<<<<<< HEAD
<<<<<<< HEAD
<<<<<<< HEAD
<<<<<<< HEAD
=======
>>>>>>> e0773a1bd7 (GEOMESA-3100 Kafka layer views (#2784))
=======
>>>>>>> ae5eea67f1 (GEOMESA-3100 Kafka layer views (#2784))
=======
>>>>>>> ea3b40e18 (GEOMESA-3100 Kafka layer views (#2784))
=======
<<<<<<< HEAD
>>>>>>> 581f1dd15 (GEOMESA-3100 Kafka layer views (#2784))
=======
>>>>>>> 1a5f68233 (GEOMESA-3100 Kafka layer views (#2784))
=======
>>>>>>> 73767737b (GEOMESA-3100 Kafka layer views (#2784))
=======
=======
>>>>>>> 936154130 (GEOMESA-3100 Kafka layer views (#2784))
>>>>>>> 429ffc55e (GEOMESA-3100 Kafka layer views (#2784))
=======
>>>>>>> e7f3e6588 (GEOMESA-3100 Kafka layer views (#2784))
=======
=======
>>>>>>> ea3b40e18 (GEOMESA-3100 Kafka layer views (#2784))
>>>>>>> 6f6887eb8 (GEOMESA-3100 Kafka layer views (#2784))
=======
>>>>>>> 9236b0208 (GEOMESA-3100 Kafka layer views (#2784))
<<<<<<< HEAD
>>>>>>> c1d0543aac (GEOMESA-3100 Kafka layer views (#2784))
=======
=======
>>>>>>> 862857ce2 (GEOMESA-3100 Kafka layer views (#2784))
<<<<<<< HEAD
>>>>>>> 8b9e99d11a (GEOMESA-3100 Kafka layer views (#2784))
=======
=======
>>>>>>> 28427dfd8 (GEOMESA-3100 Kafka layer views (#2784))
<<<<<<< HEAD
>>>>>>> 614fcb6bc3 (GEOMESA-3100 Kafka layer views (#2784))
=======
=======
=======
>>>>>>> 936154130 (GEOMESA-3100 Kafka layer views (#2784))
>>>>>>> ac0357d36 (GEOMESA-3100 Kafka layer views (#2784))
<<<<<<< HEAD
>>>>>>> 04f82bbc57 (GEOMESA-3100 Kafka layer views (#2784))
=======
=======
>>>>>>> a62b956fb (GEOMESA-3100 Kafka layer views (#2784))
<<<<<<< HEAD
>>>>>>> e0773a1bd7 (GEOMESA-3100 Kafka layer views (#2784))
=======
=======
=======
>>>>>>> ea3b40e18 (GEOMESA-3100 Kafka layer views (#2784))
>>>>>>> 4adaa7f47 (GEOMESA-3100 Kafka layer views (#2784))
>>>>>>> ae5eea67f1 (GEOMESA-3100 Kafka layer views (#2784))
>>>>>>> af0a88eb1 (GEOMESA-3100 Kafka layer views (#2784))
<<<<<<< HEAD
<<<<<<< HEAD
<<<<<<< HEAD
<<<<<<< HEAD
<<<<<<< HEAD
=======
>>>>>>> 649f2f9c22 (GEOMESA-3100 Kafka layer views (#2784))
=======
>>>>>>> af0a88eb1 (GEOMESA-3100 Kafka layer views (#2784))
>>>>>>> 95c83ca7f (GEOMESA-3100 Kafka layer views (#2784))
=======
>>>>>>> 890b70c86 (GEOMESA-3100 Kafka layer views (#2784))
=======
>>>>>>> af0a88eb1 (GEOMESA-3100 Kafka layer views (#2784))
>>>>>>> d2cb939f5 (GEOMESA-3100 Kafka layer views (#2784))
<<<<<<< HEAD
<<<<<<< HEAD
<<<<<<< HEAD
<<<<<<< HEAD
>>>>>>> 89fb9950ef (GEOMESA-3100 Kafka layer views (#2784))
=======
=======
>>>>>>> a377061090 (GEOMESA-3100 Kafka layer views (#2784))
=======
>>>>>>> 4d37d5ef5 (GEOMESA-3100 Kafka layer views (#2784))
<<<<<<< HEAD
<<<<<<< HEAD
>>>>>>> e7bfe001dd (GEOMESA-3100 Kafka layer views (#2784))
=======
=======
>>>>>>> 3be8d2a5a (Merge branch 'feature/postgis-fixes')
<<<<<<< HEAD
<<<<<<< HEAD
<<<<<<< HEAD
>>>>>>> 1b25d7ddb4 (Merge branch 'feature/postgis-fixes')
=======
=======
>>>>>>> e944f1c88b (Merge branch 'feature/postgis-fixes')
=======
>>>>>>> eddb4eaca1 (GEOMESA-3100 Kafka layer views (#2784))
=======
>>>>>>> af0a88eb1 (GEOMESA-3100 Kafka layer views (#2784))
>>>>>>> eecabb92a (GEOMESA-3100 Kafka layer views (#2784))
<<<<<<< HEAD
>>>>>>> 98e7bf59d2 (GEOMESA-3100 Kafka layer views (#2784))
=======
=======
>>>>>>> e1f939a3e (GEOMESA-3100 Kafka layer views (#2784))
<<<<<<< HEAD
>>>>>>> f3ae53295d (GEOMESA-3100 Kafka layer views (#2784))
=======
=======
>>>>>>> af0a88eb1 (GEOMESA-3100 Kafka layer views (#2784))
<<<<<<< HEAD
=======
>>>>>>> af0a88eb1 (GEOMESA-3100 Kafka layer views (#2784))
>>>>>>> 95c83ca7f (GEOMESA-3100 Kafka layer views (#2784))
>>>>>>> 65a3a6e36 (GEOMESA-3100 Kafka layer views (#2784))
<<<<<<< HEAD
>>>>>>> 9e910620b3 (GEOMESA-3100 Kafka layer views (#2784))
=======
=======
>>>>>>> 42549e8e3 (GEOMESA-3100 Kafka layer views (#2784))
<<<<<<< HEAD
>>>>>>> a377061090 (GEOMESA-3100 Kafka layer views (#2784))
=======
=======
>>>>>>> e8cc4971c6 (Merge branch 'feature/postgis-fixes')
<<<<<<< HEAD
>>>>>>> e944f1c88b (Merge branch 'feature/postgis-fixes')
=======
=======
=======
>>>>>>> af0a88eb1 (GEOMESA-3100 Kafka layer views (#2784))
>>>>>>> a0314fb7f (GEOMESA-3100 Kafka layer views (#2784))
<<<<<<< HEAD
>>>>>>> 8ed2c9f7e5 (GEOMESA-3100 Kafka layer views (#2784))
<<<<<<< HEAD
>>>>>>> eddb4eaca1 (GEOMESA-3100 Kafka layer views (#2784))
=======
=======
=======
>>>>>>> 9bda77cfe (GEOMESA-3100 Kafka layer views (#2784))
<<<<<<< HEAD
>>>>>>> 06956ccf98 (GEOMESA-3100 Kafka layer views (#2784))
<<<<<<< HEAD
>>>>>>> 814854c5db (GEOMESA-3100 Kafka layer views (#2784))
=======
=======
=======
>>>>>>> af0a88eb1 (GEOMESA-3100 Kafka layer views (#2784))
<<<<<<< HEAD
<<<<<<< HEAD
=======
>>>>>>> af0a88eb1 (GEOMESA-3100 Kafka layer views (#2784))
>>>>>>> 95c83ca7f (GEOMESA-3100 Kafka layer views (#2784))
<<<<<<< HEAD
>>>>>>> 4231e686d (GEOMESA-3100 Kafka layer views (#2784))
<<<<<<< HEAD
>>>>>>> 69e3273ac1 (GEOMESA-3100 Kafka layer views (#2784))
<<<<<<< HEAD
>>>>>>> 3977ecc140 (GEOMESA-3100 Kafka layer views (#2784))
=======
=======
=======
=======
>>>>>>> 890b70c86 (GEOMESA-3100 Kafka layer views (#2784))
>>>>>>> 8347f5d27 (GEOMESA-3100 Kafka layer views (#2784))
>>>>>>> 17d152a893 (GEOMESA-3100 Kafka layer views (#2784))
>>>>>>> 7691783a57 (GEOMESA-3100 Kafka layer views (#2784))
=======
>>>>>>> 305a9263eb (GEOMESA-3100 Kafka layer views (#2784))
=======
=======
>>>>>>> 4d37d5ef5 (GEOMESA-3100 Kafka layer views (#2784))
>>>>>>> 649f2f9c22 (GEOMESA-3100 Kafka layer views (#2784))
=======
=======
>>>>>>> 3be8d2a5a (Merge branch 'feature/postgis-fixes')
>>>>>>> da00c7bd68 (Merge branch 'feature/postgis-fixes')
=======
>>>>>>> af0a88eb17 (GEOMESA-3100 Kafka layer views (#2784))
>>>>>>> c860f21098 (GEOMESA-3100 Kafka layer views (#2784))
    }
    val producer = getTransactionalProducer(sft, transaction)
=======
=======
    }
<<<<<<< HEAD
    val producer = getTransactionalProducer(transaction)
>>>>>>> 890b70c86 (GEOMESA-3100 Kafka layer views (#2784))
=======
    val producer = getTransactionalProducer(sft, transaction)
>>>>>>> d657014c8 (GEOMESA-3198 Kafka streams integration (#2854))
=======
=======
    }
    val producer = getTransactionalProducer(transaction)
>>>>>>> 4d37d5ef5 (GEOMESA-3100 Kafka layer views (#2784))
    val vis = sft.isVisibilityRequired
    val writer = filter match {
      case None if vis    => new AppendKafkaFeatureWriter(sft, producer, config.serialization) with RequiredVisibilityWriter
      case None           => new AppendKafkaFeatureWriter(sft, producer, config.serialization)
      case Some(f) if vis => new ModifyKafkaFeatureWriter(sft, producer, config.serialization, f) with RequiredVisibilityWriter
      case Some(f)        => new ModifyKafkaFeatureWriter(sft, producer, config.serialization, f)
    }
<<<<<<< HEAD
    if (config.clearOnStart && cleared.add(sft.getTypeName)) {
<<<<<<< HEAD
<<<<<<< HEAD
<<<<<<< HEAD
<<<<<<< HEAD
=======
>>>>>>> eecabb92a (GEOMESA-3100 Kafka layer views (#2784))
=======
>>>>>>> e8cc4971c6 (Merge branch 'feature/postgis-fixes')
=======
=======
>>>>>>> a0314fb7f (GEOMESA-3100 Kafka layer views (#2784))
>>>>>>> 8ed2c9f7e5 (GEOMESA-3100 Kafka layer views (#2784))
=======
    writer
  }

  override def getFeatureWriterAppend(typeName: String, transaction: Transaction): KafkaFeatureWriter = {
    val sft = getSchema(typeName)
    if (sft == null) {
      throw new IOException(s"Schema '$typeName' has not been initialized. Please call 'createSchema' first.")
    } else if (layerViewLookup.contains(typeName)) {
      throw new IllegalArgumentException(s"Schema '$typeName' is a read-only view of '${layerViewLookup(typeName)}'")
    }
    val producer = getTransactionalProducer(transaction)
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
>>>>>>> f7038468b (GEOMESA-3100 Kafka layer views (#2784))
<<<<<<< HEAD
>>>>>>> 9bda77cfe3 (GEOMESA-3100 Kafka layer views (#2784))
=======
=======
>>>>>>> bddfdbea5 (GEOMESA-3100 Kafka layer views (#2784))
<<<<<<< HEAD
>>>>>>> 862857ce2e (GEOMESA-3100 Kafka layer views (#2784))
=======
=======
>>>>>>> 95c83ca7f (GEOMESA-3100 Kafka layer views (#2784))
<<<<<<< HEAD
>>>>>>> 4231e686dd (GEOMESA-3100 Kafka layer views (#2784))
=======
=======
>>>>>>> f7038468b (GEOMESA-3100 Kafka layer views (#2784))
>>>>>>> 890b70c86 (GEOMESA-3100 Kafka layer views (#2784))
<<<<<<< HEAD
>>>>>>> 8347f5d271 (GEOMESA-3100 Kafka layer views (#2784))
=======
=======
>>>>>>> f7038468b (GEOMESA-3100 Kafka layer views (#2784))
=======
>>>>>>> bddfdbea5 (GEOMESA-3100 Kafka layer views (#2784))
>>>>>>> 2f6607232 (GEOMESA-3100 Kafka layer views (#2784))
<<<<<<< HEAD
>>>>>>> a62b956fb6 (GEOMESA-3100 Kafka layer views (#2784))
=======
=======
>>>>>>> d2cb939f5 (GEOMESA-3100 Kafka layer views (#2784))
<<<<<<< HEAD
>>>>>>> 6af71ff432 (GEOMESA-3100 Kafka layer views (#2784))
=======
=======
>>>>>>> f7038468b (GEOMESA-3100 Kafka layer views (#2784))
>>>>>>> 4d37d5ef5 (GEOMESA-3100 Kafka layer views (#2784))
>>>>>>> b4c6267f1c (GEOMESA-3100 Kafka layer views (#2784))
=======
>>>>>>> 17f13b3a7a (GEOMESA-3100 Kafka layer views (#2784))
=======
=======
>>>>>>> fa68dd43c6 (GEOMESA-3100 Kafka layer views (#2784))
=======
>>>>>>> 0fde036fa7 (GEOMESA-3100 Kafka layer views (#2784))
=======
>>>>>>> 89fb9950ef (GEOMESA-3100 Kafka layer views (#2784))
=======
>>>>>>> e7bfe001dd (GEOMESA-3100 Kafka layer views (#2784))
=======
>>>>>>> 98e7bf59d2 (GEOMESA-3100 Kafka layer views (#2784))
=======
=======
>>>>>>> eddb4eaca1 (GEOMESA-3100 Kafka layer views (#2784))
=======
>>>>>>> 42549e8e3 (GEOMESA-3100 Kafka layer views (#2784))
>>>>>>> a377061090 (GEOMESA-3100 Kafka layer views (#2784))
=======
>>>>>>> 8ed2c9f7e5 (GEOMESA-3100 Kafka layer views (#2784))
=======
=======
>>>>>>> af0a88eb1 (GEOMESA-3100 Kafka layer views (#2784))
>>>>>>> d0dc799ff (GEOMESA-3100 Kafka layer views (#2784))
=======
<<<<<<< HEAD
>>>>>>> af0a88eb1 (GEOMESA-3100 Kafka layer views (#2784))
>>>>>>> d0dc799ff (GEOMESA-3100 Kafka layer views (#2784))
=======
=======
>>>>>>> 936154130 (GEOMESA-3100 Kafka layer views (#2784))
<<<<<<< HEAD
>>>>>>> af0a88eb1 (GEOMESA-3100 Kafka layer views (#2784))
>>>>>>> d0dc799ff (GEOMESA-3100 Kafka layer views (#2784))
=======
=======
>>>>>>> 936154130 (GEOMESA-3100 Kafka layer views (#2784))
<<<<<<< HEAD
<<<<<<< HEAD
=======
>>>>>>> af0a88eb1 (GEOMESA-3100 Kafka layer views (#2784))
>>>>>>> locationtech-main
=======
>>>>>>> af0a88eb1 (GEOMESA-3100 Kafka layer views (#2784))
>>>>>>> 58286bfd3 (GEOMESA-3100 Kafka layer views (#2784))
>>>>>>> 5ca0cd6de (GEOMESA-3100 Kafka layer views (#2784))
<<<<<<< HEAD
<<<<<<< HEAD
<<<<<<< HEAD
<<<<<<< HEAD
<<<<<<< HEAD
<<<<<<< HEAD
<<<<<<< HEAD
=======
>>>>>>> ea3b40e18 (GEOMESA-3100 Kafka layer views (#2784))
=======
>>>>>>> 429ffc55e (GEOMESA-3100 Kafka layer views (#2784))
=======
>>>>>>> e7f3e6588 (GEOMESA-3100 Kafka layer views (#2784))
=======
=======
>>>>>>> ea3b40e18 (GEOMESA-3100 Kafka layer views (#2784))
>>>>>>> 6f6887eb8 (GEOMESA-3100 Kafka layer views (#2784))
=======
>>>>>>> af0a88eb1 (GEOMESA-3100 Kafka layer views (#2784))
>>>>>>> bddfdbea5 (GEOMESA-3100 Kafka layer views (#2784))
=======
>>>>>>> d0dc799ff (GEOMESA-3100 Kafka layer views (#2784))
<<<<<<< HEAD
<<<<<<< HEAD
<<<<<<< HEAD
=======
>>>>>>> 6f6887eb8 (GEOMESA-3100 Kafka layer views (#2784))
=======
>>>>>>> 936154130 (GEOMESA-3100 Kafka layer views (#2784))
=======
=======
>>>>>>> af0a88eb1 (GEOMESA-3100 Kafka layer views (#2784))
>>>>>>> bddfdbea5 (GEOMESA-3100 Kafka layer views (#2784))
>>>>>>> 2f6607232 (GEOMESA-3100 Kafka layer views (#2784))
<<<<<<< HEAD
<<<<<<< HEAD
=======
>>>>>>> ea3b40e18 (GEOMESA-3100 Kafka layer views (#2784))
<<<<<<< HEAD
<<<<<<< HEAD
=======
=======
>>>>>>> 936154130 (GEOMESA-3100 Kafka layer views (#2784))
>>>>>>> 429ffc55e (GEOMESA-3100 Kafka layer views (#2784))
=======
>>>>>>> e7f3e6588 (GEOMESA-3100 Kafka layer views (#2784))
=======
=======
>>>>>>> ea3b40e18 (GEOMESA-3100 Kafka layer views (#2784))
>>>>>>> 6f6887eb8 (GEOMESA-3100 Kafka layer views (#2784))
=======
<<<<<<< HEAD
=======
=======
>>>>>>> af0a88eb1 (GEOMESA-3100 Kafka layer views (#2784))
>>>>>>> d2cb939f5 (GEOMESA-3100 Kafka layer views (#2784))
=======
>>>>>>> 3be8d2a5a (Merge branch 'feature/postgis-fixes')
<<<<<<< HEAD
=======
=======
>>>>>>> d2002b5af (GEOMESA-3100 Kafka layer views (#2784))
  override private[geomesa] def getFeatureReader(
=======
<<<<<<< HEAD
  private[geomesa] def getFeatureReader(
>>>>>>> f7038468b (GEOMESA-3100 Kafka layer views (#2784))
      sft: SimpleFeatureType,
      transaction: Transaction,
      query: Query): GeoMesaFeatureReader = {
<<<<<<< HEAD
>>>>>>> d845d7c1b (GEOMESA-3254 Add Bloop build support)
=======
=======
  override def getFeatureReader(query: Query, transaction: Transaction): SimpleFeatureReader = {
    val sft = getSchema(query.getTypeName)
    if (sft == null) {
      throw new IOException(s"Schema '${query.getTypeName}' has not been initialized. Please call 'createSchema' first.")
    }
>>>>>>> af0a88eb1 (GEOMESA-3100 Kafka layer views (#2784))
>>>>>>> d2002b5af (GEOMESA-3100 Kafka layer views (#2784))
=======
=======
>>>>>>> af0a88eb1 (GEOMESA-3100 Kafka layer views (#2784))
>>>>>>> d2cb939f5 (GEOMESA-3100 Kafka layer views (#2784))
>>>>>>> 89fb9950e (GEOMESA-3100 Kafka layer views (#2784))
=======
>>>>>>> 1b25d7ddb (Merge branch 'feature/postgis-fixes')
    // kick off the kafka consumers for this sft, if not already started
    caches.get(layerViewLookup.getOrElse(query.getTypeName, query.getTypeName))
    GeoMesaFeatureReader(sft, query, runner, config.audit)
  }

  override private[geomesa] def getFeatureWriter(
      sft: SimpleFeatureType,
      transaction: Transaction,
      filter: Option[Filter]): FlushableFeatureWriter = {
    if (layerViewLookup.contains(sft.getTypeName)) {
      throw new IllegalArgumentException(
        s"Schema '${sft.getTypeName}' is a read-only view of '${layerViewLookup(sft.getTypeName)}'")
<<<<<<< HEAD
<<<<<<< HEAD
<<<<<<< HEAD
<<<<<<< HEAD
<<<<<<< HEAD
<<<<<<< HEAD
<<<<<<< HEAD
=======
>>>>>>> 30559ea5c9 (Merge branch 'feature/postgis-fixes')
=======
>>>>>>> ad362b1341 (GEOMESA-3100 Kafka layer views (#2784))
=======
>>>>>>> 1b25d7ddb (Merge branch 'feature/postgis-fixes')
=======
<<<<<<< HEAD
<<<<<<< HEAD
<<<<<<< HEAD
<<<<<<< HEAD
<<<<<<< HEAD
<<<<<<< HEAD
=======
=======
>>>>>>> 17f13b3a7 (GEOMESA-3100 Kafka layer views (#2784))
=======
>>>>>>> d2002b5af (GEOMESA-3100 Kafka layer views (#2784))
=======
>>>>>>> c589b832a (GEOMESA-3100 Kafka layer views (#2784))
=======
>>>>>>> fa68dd43c (GEOMESA-3100 Kafka layer views (#2784))
=======
>>>>>>> 89fb9950e (GEOMESA-3100 Kafka layer views (#2784))
=======
=======
>>>>>>> 337ecd16e5 (GEOMESA-3100 Kafka layer views (#2784))
    new KafkaFeatureStore(this, sft, runner, cache(typeName))
  }

  override def getFeatureReader(query: Query, transaction: Transaction): SimpleFeatureReader = {
    val sft = getSchema(query.getTypeName)
    if (sft == null) {
      throw new IOException(s"Schema '${query.getTypeName}' has not been initialized. Please call 'createSchema' first.")
    }
    // kick off the kafka consumers for this sft, if not already started
    caches.get(layerViewLookup.getOrElse(query.getTypeName, query.getTypeName))
    GeoMesaFeatureReader(sft, query, runner, None, config.audit)
  }

<<<<<<< HEAD
<<<<<<< HEAD
<<<<<<< HEAD
=======
>>>>>>> f7038468b (GEOMESA-3100 Kafka layer views (#2784))
=======
>>>>>>> bddfdbea5 (GEOMESA-3100 Kafka layer views (#2784))
<<<<<<< HEAD
<<<<<<< HEAD
=======
>>>>>>> 95c83ca7f (GEOMESA-3100 Kafka layer views (#2784))
=======
>>>>>>> d2cb939f5 (GEOMESA-3100 Kafka layer views (#2784))
<<<<<<< HEAD
=======
>>>>>>> 17f13b3a7 (GEOMESA-3100 Kafka layer views (#2784))
=======
=======
>>>>>>> f7038468b (GEOMESA-3100 Kafka layer views (#2784))
>>>>>>> d2002b5af (GEOMESA-3100 Kafka layer views (#2784))
=======
>>>>>>> c589b832a (GEOMESA-3100 Kafka layer views (#2784))
=======
=======
>>>>>>> 95c83ca7f (GEOMESA-3100 Kafka layer views (#2784))
>>>>>>> fa68dd43c (GEOMESA-3100 Kafka layer views (#2784))
=======
>>>>>>> 89fb9950e (GEOMESA-3100 Kafka layer views (#2784))
=======
>>>>>>> 337ecd16e5 (GEOMESA-3100 Kafka layer views (#2784))
  override def getFeatureWriter(typeName: String, filter: Filter, transaction: Transaction): KafkaFeatureWriter = {
    val sft = getSchema(typeName)
    if (sft == null) {
      throw new IOException(s"Schema '$typeName' has not been initialized. Please call 'createSchema' first.")
    } else if (layerViewLookup.contains(typeName)) {
      throw new IllegalArgumentException(s"Schema '$typeName' is a read-only view of '${layerViewLookup(typeName)}'")
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
>>>>>>> ad362b1341 (GEOMESA-3100 Kafka layer views (#2784))
=======
>>>>>>> c57b5f538 (GEOMESA-3100 Kafka layer views (#2784))
=======
>>>>>>> 88ef67cdf (GEOMESA-3100 Kafka layer views (#2784))
=======
>>>>>>> 89fb9950e (GEOMESA-3100 Kafka layer views (#2784))
=======
>>>>>>> 936154130 (GEOMESA-3100 Kafka layer views (#2784))
=======
>>>>>>> 2f6607232 (GEOMESA-3100 Kafka layer views (#2784))
<<<<<<< HEAD
<<<<<<< HEAD
=======
>>>>>>> ea3b40e18 (GEOMESA-3100 Kafka layer views (#2784))
=======
>>>>>>> f6e840b5d (GEOMESA-3100 Kafka layer views (#2784))
=======
>>>>>>> c589b832a (GEOMESA-3100 Kafka layer views (#2784))
=======
>>>>>>> ffbc2ce32 (GEOMESA-3100 Kafka layer views (#2784))
=======
=======
>>>>>>> 936154130 (GEOMESA-3100 Kafka layer views (#2784))
>>>>>>> 54ece16d1 (GEOMESA-3100 Kafka layer views (#2784))
=======
>>>>>>> c57b5f538 (GEOMESA-3100 Kafka layer views (#2784))
=======
=======
>>>>>>> ea3b40e18 (GEOMESA-3100 Kafka layer views (#2784))
>>>>>>> 88ef67cdf (GEOMESA-3100 Kafka layer views (#2784))
=======
=======
>>>>>>> 6368ee48e8 (GEOMESA-3100 Kafka layer views (#2784))
=======
>>>>>>> 4516873dab (GEOMESA-3100 Kafka layer views (#2784))
=======
>>>>>>> 8ec26b8c2a (GEOMESA-3100 Kafka layer views (#2784))
>>>>>>> af0a88eb17 (GEOMESA-3100 Kafka layer views (#2784))
=======
=======
>>>>>>> 9361541304 (GEOMESA-3100 Kafka layer views (#2784))
=======
>>>>>>> 2f66072323 (GEOMESA-3100 Kafka layer views (#2784))
<<<<<<< HEAD
>>>>>>> f43f8303d3 (GEOMESA-3100 Kafka layer views (#2784))
=======
=======
>>>>>>> ea3b40e187 (GEOMESA-3100 Kafka layer views (#2784))
>>>>>>> 6368ee48e8 (GEOMESA-3100 Kafka layer views (#2784))
>>>>>>> af0a88eb1 (GEOMESA-3100 Kafka layer views (#2784))
<<<<<<< HEAD
<<<<<<< HEAD
=======
<<<<<<< HEAD
>>>>>>> 95c83ca7fa (GEOMESA-3100 Kafka layer views (#2784))
=======
>>>>>>> 2db2756651 (GEOMESA-3100 Kafka layer views (#2784))
<<<<<<< HEAD
<<<<<<< HEAD
<<<<<<< HEAD
<<<<<<< HEAD
<<<<<<< HEAD
=======
>>>>>>> e7bfe001d (GEOMESA-3100 Kafka layer views (#2784))
=======
>>>>>>> af0a88eb1 (GEOMESA-3100 Kafka layer views (#2784))
>>>>>>> 95c83ca7f (GEOMESA-3100 Kafka layer views (#2784))
=======
>>>>>>> 890b70c86 (GEOMESA-3100 Kafka layer views (#2784))
=======
>>>>>>> af0a88eb1 (GEOMESA-3100 Kafka layer views (#2784))
>>>>>>> d2cb939f5 (GEOMESA-3100 Kafka layer views (#2784))
<<<<<<< HEAD
<<<<<<< HEAD
<<<<<<< HEAD
>>>>>>> 6af71ff43 (GEOMESA-3100 Kafka layer views (#2784))
<<<<<<< HEAD
>>>>>>> 23a7d9849f (GEOMESA-3100 Kafka layer views (#2784))
=======
=======
=======
>>>>>>> 4d37d5ef5 (GEOMESA-3100 Kafka layer views (#2784))
<<<<<<< HEAD
<<<<<<< HEAD
>>>>>>> b4c6267f1 (GEOMESA-3100 Kafka layer views (#2784))
<<<<<<< HEAD
>>>>>>> dc84900201 (GEOMESA-3100 Kafka layer views (#2784))
=======
=======
=======
>>>>>>> 3be8d2a5a (Merge branch 'feature/postgis-fixes')
>>>>>>> db8d998aa (Merge branch 'feature/postgis-fixes')
<<<<<<< HEAD
>>>>>>> cb6bda89b6 (Merge branch 'feature/postgis-fixes')
=======
=======
>>>>>>> d845d7c1b (GEOMESA-3254 Add Bloop build support)
<<<<<<< HEAD
>>>>>>> 09d87762c5 (GEOMESA-3254 Add Bloop build support)
=======
=======
>>>>>>> af0a88eb1 (GEOMESA-3100 Kafka layer views (#2784))
>>>>>>> 17f13b3a7 (GEOMESA-3100 Kafka layer views (#2784))
<<<<<<< HEAD
>>>>>>> 6069aba6b4 (GEOMESA-3100 Kafka layer views (#2784))
=======
=======
>>>>>>> d2002b5af (GEOMESA-3100 Kafka layer views (#2784))
<<<<<<< HEAD
>>>>>>> d5f6f5af59 (GEOMESA-3100 Kafka layer views (#2784))
=======
=======
>>>>>>> af0a88eb1 (GEOMESA-3100 Kafka layer views (#2784))
<<<<<<< HEAD
<<<<<<< HEAD
=======
>>>>>>> af0a88eb1 (GEOMESA-3100 Kafka layer views (#2784))
>>>>>>> 95c83ca7f (GEOMESA-3100 Kafka layer views (#2784))
<<<<<<< HEAD
>>>>>>> fa68dd43c (GEOMESA-3100 Kafka layer views (#2784))
<<<<<<< HEAD
>>>>>>> 23f312535d (GEOMESA-3100 Kafka layer views (#2784))
=======
=======
=======
>>>>>>> 890b70c86 (GEOMESA-3100 Kafka layer views (#2784))
>>>>>>> 0fde036fa (GEOMESA-3100 Kafka layer views (#2784))
<<<<<<< HEAD
>>>>>>> 4f05dea44b (GEOMESA-3100 Kafka layer views (#2784))
=======
=======
>>>>>>> 89fb9950e (GEOMESA-3100 Kafka layer views (#2784))
<<<<<<< HEAD
>>>>>>> bc97b07a31 (GEOMESA-3100 Kafka layer views (#2784))
=======
=======
=======
>>>>>>> 4d37d5ef5 (GEOMESA-3100 Kafka layer views (#2784))
>>>>>>> e7bfe001d (GEOMESA-3100 Kafka layer views (#2784))
<<<<<<< HEAD
>>>>>>> a09ef82d36 (GEOMESA-3100 Kafka layer views (#2784))
=======
=======
=======
>>>>>>> 3be8d2a5a (Merge branch 'feature/postgis-fixes')
>>>>>>> 1b25d7ddb (Merge branch 'feature/postgis-fixes')
>>>>>>> 699117eca9 (Merge branch 'feature/postgis-fixes')
<<<<<<< HEAD
=======
>>>>>>> 890b70c869 (GEOMESA-3100 Kafka layer views (#2784))
=======
>>>>>>> af0a88eb1 (GEOMESA-3100 Kafka layer views (#2784))
>>>>>>> d2cb939f51 (GEOMESA-3100 Kafka layer views (#2784))
<<<<<<< HEAD
>>>>>>> 4516873dab (GEOMESA-3100 Kafka layer views (#2784))
=======
=======
>>>>>>> 4d37d5ef54 (GEOMESA-3100 Kafka layer views (#2784))
<<<<<<< HEAD
>>>>>>> 2db2756651 (GEOMESA-3100 Kafka layer views (#2784))
=======
=======
>>>>>>> 3be8d2a5a4 (Merge branch 'feature/postgis-fixes')
<<<<<<< HEAD
>>>>>>> 34472778d3 (Merge branch 'feature/postgis-fixes')
=======
=======
>>>>>>> af0a88eb1 (GEOMESA-3100 Kafka layer views (#2784))
>>>>>>> a0314fb7ff (GEOMESA-3100 Kafka layer views (#2784))
>>>>>>> 8ec26b8c2a (GEOMESA-3100 Kafka layer views (#2784))
=======
>>>>>>> 30559ea5c9 (Merge branch 'feature/postgis-fixes')
    }
    val producer = getTransactionalProducer(sft, transaction)
=======
=======
    }
<<<<<<< HEAD
    val producer = getTransactionalProducer(transaction)
>>>>>>> 890b70c86 (GEOMESA-3100 Kafka layer views (#2784))
=======
    val producer = getTransactionalProducer(sft, transaction)
>>>>>>> d657014c8 (GEOMESA-3198 Kafka streams integration (#2854))
=======
=======
    }
    val producer = getTransactionalProducer(transaction)
>>>>>>> 4d37d5ef5 (GEOMESA-3100 Kafka layer views (#2784))
    val vis = sft.isVisibilityRequired
<<<<<<< HEAD
=======
    val serializer = serialization.apply(sft)
>>>>>>> 58d14a257 (GEOMESA-3254 Add Bloop build support)
    val writer = filter match {
      case None if vis    => new AppendKafkaFeatureWriter(sft, producer, config.serialization) with RequiredVisibilityWriter
      case None           => new AppendKafkaFeatureWriter(sft, producer, config.serialization)
      case Some(f) if vis => new ModifyKafkaFeatureWriter(sft, producer, config.serialization, f) with RequiredVisibilityWriter
      case Some(f)        => new ModifyKafkaFeatureWriter(sft, producer, config.serialization, f)
    }
<<<<<<< HEAD
    if (config.clearOnStart && cleared.add(sft.getTypeName)) {
<<<<<<< HEAD
<<<<<<< HEAD
<<<<<<< HEAD
=======
>>>>>>> 17f13b3a7 (GEOMESA-3100 Kafka layer views (#2784))
=======
    writer
  }

  override def getFeatureWriterAppend(typeName: String, transaction: Transaction): KafkaFeatureWriter = {
    val sft = getSchema(typeName)
    if (sft == null) {
      throw new IOException(s"Schema '$typeName' has not been initialized. Please call 'createSchema' first.")
    } else if (layerViewLookup.contains(typeName)) {
      throw new IllegalArgumentException(s"Schema '$typeName' is a read-only view of '${layerViewLookup(typeName)}'")
    }
    val producer = getTransactionalProducer(transaction)
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
>>>>>>> e7f3e6588 (GEOMESA-3100 Kafka layer views (#2784))
=======
>>>>>>> 06956ccf98 (GEOMESA-3100 Kafka layer views (#2784))
=======
>>>>>>> 69e3273ac1 (GEOMESA-3100 Kafka layer views (#2784))
=======
>>>>>>> 17d152a893 (GEOMESA-3100 Kafka layer views (#2784))
=======
>>>>>>> 23a7d9849f (GEOMESA-3100 Kafka layer views (#2784))
=======
>>>>>>> dc84900201 (GEOMESA-3100 Kafka layer views (#2784))
=======
>>>>>>> 6069aba6b4 (GEOMESA-3100 Kafka layer views (#2784))
>>>>>>> f7038468b (GEOMESA-3100 Kafka layer views (#2784))
<<<<<<< HEAD
>>>>>>> d2002b5afd (GEOMESA-3100 Kafka layer views (#2784))
=======
=======
>>>>>>> bddfdbea5 (GEOMESA-3100 Kafka layer views (#2784))
<<<<<<< HEAD
>>>>>>> c589b832a5 (GEOMESA-3100 Kafka layer views (#2784))
=======
=======
>>>>>>> 95c83ca7f (GEOMESA-3100 Kafka layer views (#2784))
<<<<<<< HEAD
>>>>>>> fa68dd43c6 (GEOMESA-3100 Kafka layer views (#2784))
=======
=======
>>>>>>> f7038468b (GEOMESA-3100 Kafka layer views (#2784))
>>>>>>> 890b70c86 (GEOMESA-3100 Kafka layer views (#2784))
<<<<<<< HEAD
>>>>>>> 0fde036fa7 (GEOMESA-3100 Kafka layer views (#2784))
=======
=======
>>>>>>> f7038468b (GEOMESA-3100 Kafka layer views (#2784))
=======
>>>>>>> bddfdbea5 (GEOMESA-3100 Kafka layer views (#2784))
>>>>>>> 2f6607232 (GEOMESA-3100 Kafka layer views (#2784))
<<<<<<< HEAD
<<<<<<< HEAD
<<<<<<< HEAD
>>>>>>> c57b5f538a (GEOMESA-3100 Kafka layer views (#2784))
=======
=======
>>>>>>> 3ebcdb99d9 (GEOMESA-3100 Kafka layer views (#2784))
=======
>>>>>>> a377061090 (GEOMESA-3100 Kafka layer views (#2784))
=======
>>>>>>> d2cb939f5 (GEOMESA-3100 Kafka layer views (#2784))
<<<<<<< HEAD
>>>>>>> 89fb9950ef (GEOMESA-3100 Kafka layer views (#2784))
=======
=======
>>>>>>> f7038468b (GEOMESA-3100 Kafka layer views (#2784))
>>>>>>> 4d37d5ef5 (GEOMESA-3100 Kafka layer views (#2784))
<<<<<<< HEAD
>>>>>>> e7bfe001dd (GEOMESA-3100 Kafka layer views (#2784))
=======
=======
<<<<<<< HEAD
>>>>>>> eecabb92a (GEOMESA-3100 Kafka layer views (#2784))
<<<<<<< HEAD
>>>>>>> 98e7bf59d2 (GEOMESA-3100 Kafka layer views (#2784))
=======
=======
=======
>>>>>>> 65a3a6e36 (GEOMESA-3100 Kafka layer views (#2784))
=======
=======
>>>>>>> af0a88eb1 (GEOMESA-3100 Kafka layer views (#2784))
>>>>>>> d0dc799ff (GEOMESA-3100 Kafka layer views (#2784))
=======
<<<<<<< HEAD
<<<<<<< HEAD
=======
>>>>>>> af0a88eb1 (GEOMESA-3100 Kafka layer views (#2784))
>>>>>>> locationtech-main
=======
>>>>>>> af0a88eb1 (GEOMESA-3100 Kafka layer views (#2784))
>>>>>>> 58286bfd3 (GEOMESA-3100 Kafka layer views (#2784))
>>>>>>> 5ca0cd6de (GEOMESA-3100 Kafka layer views (#2784))
<<<<<<< HEAD
=======
>>>>>>> af0a88eb1 (GEOMESA-3100 Kafka layer views (#2784))
>>>>>>> bddfdbea5 (GEOMESA-3100 Kafka layer views (#2784))
=======
>>>>>>> d0dc799ff (GEOMESA-3100 Kafka layer views (#2784))
=======
>>>>>>> af0a88eb1 (GEOMESA-3100 Kafka layer views (#2784))
>>>>>>> 337ecd16e5 (GEOMESA-3100 Kafka layer views (#2784))
    }
=======
>>>>>>> b09307f5c0 (GEOMESA-3198 Kafka streams integration (#2854))
    val producer = getTransactionalProducer(sft, transaction)
=======
=======
    }
<<<<<<< HEAD
    val producer = getTransactionalProducer(transaction)
>>>>>>> 890b70c86 (GEOMESA-3100 Kafka layer views (#2784))
=======
    val producer = getTransactionalProducer(sft, transaction)
>>>>>>> d657014c8 (GEOMESA-3198 Kafka streams integration (#2854))
    val vis = sft.isVisibilityRequired
    val writer = filter match {
      case None if vis    => new AppendKafkaFeatureWriter(sft, producer, config.serialization) with RequiredVisibilityWriter
      case None           => new AppendKafkaFeatureWriter(sft, producer, config.serialization)
      case Some(f) if vis => new ModifyKafkaFeatureWriter(sft, producer, config.serialization, f) with RequiredVisibilityWriter
      case Some(f)        => new ModifyKafkaFeatureWriter(sft, producer, config.serialization, f)
    }
<<<<<<< HEAD
    if (config.clearOnStart && cleared.add(sft.getTypeName)) {
<<<<<<< HEAD
<<<<<<< HEAD
=======
>>>>>>> c860f21098 (GEOMESA-3100 Kafka layer views (#2784))
=======
    writer
  }

  override def getFeatureWriterAppend(typeName: String, transaction: Transaction): KafkaFeatureWriter = {
    val sft = getSchema(typeName)
    if (sft == null) {
      throw new IOException(s"Schema '$typeName' has not been initialized. Please call 'createSchema' first.")
    } else if (layerViewLookup.contains(typeName)) {
      throw new IllegalArgumentException(s"Schema '$typeName' is a read-only view of '${layerViewLookup(typeName)}'")
    }
    val producer = getTransactionalProducer(transaction)
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
>>>>>>> 9a5d6d2815 (GEOMESA-3100 Kafka layer views (#2784))
=======
>>>>>>> 13347c6405 (GEOMESA-3100 Kafka layer views (#2784))
>>>>>>> f7038468b (GEOMESA-3100 Kafka layer views (#2784))
<<<<<<< HEAD
>>>>>>> e1f939a3e (GEOMESA-3100 Kafka layer views (#2784))
<<<<<<< HEAD
>>>>>>> f3ae53295d (GEOMESA-3100 Kafka layer views (#2784))
=======
=======
=======
>>>>>>> bddfdbea5 (GEOMESA-3100 Kafka layer views (#2784))
<<<<<<< HEAD
>>>>>>> 1a5f68233 (GEOMESA-3100 Kafka layer views (#2784))
<<<<<<< HEAD
>>>>>>> dae1cf3cef (GEOMESA-3100 Kafka layer views (#2784))
=======
=======
=======
>>>>>>> 95c83ca7f (GEOMESA-3100 Kafka layer views (#2784))
>>>>>>> 65a3a6e36 (GEOMESA-3100 Kafka layer views (#2784))
<<<<<<< HEAD
>>>>>>> 9e910620b3 (GEOMESA-3100 Kafka layer views (#2784))
=======
=======
>>>>>>> e7f3e6588 (GEOMESA-3100 Kafka layer views (#2784))
<<<<<<< HEAD
>>>>>>> 3ebcdb99d9 (GEOMESA-3100 Kafka layer views (#2784))
=======
=======
=======
>>>>>>> d2cb939f5 (GEOMESA-3100 Kafka layer views (#2784))
>>>>>>> 42549e8e3 (GEOMESA-3100 Kafka layer views (#2784))
<<<<<<< HEAD
>>>>>>> a377061090 (GEOMESA-3100 Kafka layer views (#2784))
=======
=======
>>>>>>> a0314fb7f (GEOMESA-3100 Kafka layer views (#2784))
<<<<<<< HEAD
>>>>>>> 8ed2c9f7e5 (GEOMESA-3100 Kafka layer views (#2784))
<<<<<<< HEAD
>>>>>>> eddb4eaca1 (GEOMESA-3100 Kafka layer views (#2784))
=======
=======
=======
=======
>>>>>>> 4231e686d (GEOMESA-3100 Kafka layer views (#2784))
=======
>>>>>>> 8347f5d27 (GEOMESA-3100 Kafka layer views (#2784))
=======
>>>>>>> 6af71ff43 (GEOMESA-3100 Kafka layer views (#2784))
=======
>>>>>>> b4c6267f1 (GEOMESA-3100 Kafka layer views (#2784))
=======
>>>>>>> 305a9263eb (GEOMESA-3100 Kafka layer views (#2784))
=======
>>>>>>> 649f2f9c22 (GEOMESA-3100 Kafka layer views (#2784))
=======
=======
>>>>>>> af0a88eb1 (GEOMESA-3100 Kafka layer views (#2784))
>>>>>>> d0dc799ff (GEOMESA-3100 Kafka layer views (#2784))
=======
<<<<<<< HEAD
>>>>>>> af0a88eb1 (GEOMESA-3100 Kafka layer views (#2784))
>>>>>>> d0dc799ff (GEOMESA-3100 Kafka layer views (#2784))
=======
=======
>>>>>>> 936154130 (GEOMESA-3100 Kafka layer views (#2784))
<<<<<<< HEAD
<<<<<<< HEAD
=======
>>>>>>> af0a88eb1 (GEOMESA-3100 Kafka layer views (#2784))
>>>>>>> locationtech-main
=======
>>>>>>> af0a88eb1 (GEOMESA-3100 Kafka layer views (#2784))
>>>>>>> 58286bfd3 (GEOMESA-3100 Kafka layer views (#2784))
>>>>>>> 5ca0cd6de (GEOMESA-3100 Kafka layer views (#2784))
<<<<<<< HEAD
<<<<<<< HEAD
<<<<<<< HEAD
<<<<<<< HEAD
=======
>>>>>>> ea3b40e18 (GEOMESA-3100 Kafka layer views (#2784))
=======
>>>>>>> af0a88eb1 (GEOMESA-3100 Kafka layer views (#2784))
>>>>>>> bddfdbea5 (GEOMESA-3100 Kafka layer views (#2784))
=======
>>>>>>> d0dc799ff (GEOMESA-3100 Kafka layer views (#2784))
<<<<<<< HEAD
=======
>>>>>>> 936154130 (GEOMESA-3100 Kafka layer views (#2784))
=======
=======
>>>>>>> af0a88eb1 (GEOMESA-3100 Kafka layer views (#2784))
>>>>>>> bddfdbea5 (GEOMESA-3100 Kafka layer views (#2784))
>>>>>>> 2f6607232 (GEOMESA-3100 Kafka layer views (#2784))
=======
>>>>>>> ea3b40e18 (GEOMESA-3100 Kafka layer views (#2784))
    }
    val producer = getTransactionalProducer(sft, transaction)
=======
=======
    }
<<<<<<< HEAD
    val producer = getTransactionalProducer(transaction)
>>>>>>> 890b70c86 (GEOMESA-3100 Kafka layer views (#2784))
=======
    val producer = getTransactionalProducer(sft, transaction)
>>>>>>> d657014c8 (GEOMESA-3198 Kafka streams integration (#2854))
=======
=======
    }
    val producer = getTransactionalProducer(transaction)
>>>>>>> 4d37d5ef5 (GEOMESA-3100 Kafka layer views (#2784))
<<<<<<< HEAD
    val vis = sft.isVisibilityRequired
    val writer = filter match {
      case None if vis    => new AppendKafkaFeatureWriter(sft, producer, config.serialization) with RequiredVisibilityWriter
      case None           => new AppendKafkaFeatureWriter(sft, producer, config.serialization)
      case Some(f) if vis => new ModifyKafkaFeatureWriter(sft, producer, config.serialization, f) with RequiredVisibilityWriter
      case Some(f)        => new ModifyKafkaFeatureWriter(sft, producer, config.serialization, f)
    }
<<<<<<< HEAD
    if (config.clearOnStart && cleared.add(sft.getTypeName)) {
<<<<<<< HEAD
<<<<<<< HEAD
<<<<<<< HEAD
<<<<<<< HEAD
=======
>>>>>>> 337ecd16e5 (GEOMESA-3100 Kafka layer views (#2784))
=======
>>>>>>> 30559ea5c9 (Merge branch 'feature/postgis-fixes')
=======
=======
>>>>>>> 337ecd16e5 (GEOMESA-3100 Kafka layer views (#2784))
>>>>>>> ad362b1341 (GEOMESA-3100 Kafka layer views (#2784))
=======
    writer
  }

  override def getFeatureWriterAppend(typeName: String, transaction: Transaction): KafkaFeatureWriter = {
    val sft = getSchema(typeName)
    if (sft == null) {
      throw new IOException(s"Schema '$typeName' has not been initialized. Please call 'createSchema' first.")
    } else if (layerViewLookup.contains(typeName)) {
      throw new IllegalArgumentException(s"Schema '$typeName' is a read-only view of '${layerViewLookup(typeName)}'")
    }
    val producer = getTransactionalProducer(transaction)
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
>>>>>>> f7038468b (GEOMESA-3100 Kafka layer views (#2784))
<<<<<<< HEAD
>>>>>>> 9bda77cfe (GEOMESA-3100 Kafka layer views (#2784))
<<<<<<< HEAD
>>>>>>> 06956ccf98 (GEOMESA-3100 Kafka layer views (#2784))
<<<<<<< HEAD
>>>>>>> 814854c5db (GEOMESA-3100 Kafka layer views (#2784))
=======
=======
=======
=======
>>>>>>> bddfdbea5 (GEOMESA-3100 Kafka layer views (#2784))
<<<<<<< HEAD
>>>>>>> 862857ce2 (GEOMESA-3100 Kafka layer views (#2784))
<<<<<<< HEAD
>>>>>>> 8b9e99d11a (GEOMESA-3100 Kafka layer views (#2784))
<<<<<<< HEAD
>>>>>>> 7bdc1feea8 (GEOMESA-3100 Kafka layer views (#2784))
=======
=======
=======
=======
>>>>>>> 95c83ca7f (GEOMESA-3100 Kafka layer views (#2784))
<<<<<<< HEAD
>>>>>>> 4231e686d (GEOMESA-3100 Kafka layer views (#2784))
<<<<<<< HEAD
>>>>>>> 69e3273ac1 (GEOMESA-3100 Kafka layer views (#2784))
<<<<<<< HEAD
>>>>>>> 3977ecc140 (GEOMESA-3100 Kafka layer views (#2784))
=======
=======
=======
=======
>>>>>>> f7038468b (GEOMESA-3100 Kafka layer views (#2784))
>>>>>>> 890b70c86 (GEOMESA-3100 Kafka layer views (#2784))
<<<<<<< HEAD
<<<<<<< HEAD
>>>>>>> 8347f5d27 (GEOMESA-3100 Kafka layer views (#2784))
<<<<<<< HEAD
>>>>>>> 17d152a893 (GEOMESA-3100 Kafka layer views (#2784))
<<<<<<< HEAD
>>>>>>> 7691783a57 (GEOMESA-3100 Kafka layer views (#2784))
=======
=======
=======
=======
=======
>>>>>>> 96f945c352 (GEOMESA-3100 Kafka layer views (#2784))
>>>>>>> f7038468b (GEOMESA-3100 Kafka layer views (#2784))
=======
>>>>>>> bddfdbea5 (GEOMESA-3100 Kafka layer views (#2784))
<<<<<<< HEAD
>>>>>>> 2f6607232 (GEOMESA-3100 Kafka layer views (#2784))
<<<<<<< HEAD
>>>>>>> a62b956fb (GEOMESA-3100 Kafka layer views (#2784))
<<<<<<< HEAD
>>>>>>> e0773a1bd7 (GEOMESA-3100 Kafka layer views (#2784))
<<<<<<< HEAD
>>>>>>> 5d8c5baea0 (GEOMESA-3100 Kafka layer views (#2784))
=======
=======
=======
=======
>>>>>>> d2cb939f5 (GEOMESA-3100 Kafka layer views (#2784))
<<<<<<< HEAD
>>>>>>> 6af71ff43 (GEOMESA-3100 Kafka layer views (#2784))
<<<<<<< HEAD
>>>>>>> 23a7d9849f (GEOMESA-3100 Kafka layer views (#2784))
<<<<<<< HEAD
>>>>>>> 416a95a4c0 (GEOMESA-3100 Kafka layer views (#2784))
=======
=======
=======
=======
>>>>>>> f7038468b (GEOMESA-3100 Kafka layer views (#2784))
>>>>>>> 4d37d5ef5 (GEOMESA-3100 Kafka layer views (#2784))
>>>>>>> b4c6267f1 (GEOMESA-3100 Kafka layer views (#2784))
<<<<<<< HEAD
>>>>>>> dc84900201 (GEOMESA-3100 Kafka layer views (#2784))
<<<<<<< HEAD
>>>>>>> 4bc781ae0d (GEOMESA-3100 Kafka layer views (#2784))
=======
=======
=======
>>>>>>> 17f13b3a7 (GEOMESA-3100 Kafka layer views (#2784))
<<<<<<< HEAD
>>>>>>> 6069aba6b4 (GEOMESA-3100 Kafka layer views (#2784))
<<<<<<< HEAD
>>>>>>> ccfb3bd95e (GEOMESA-3100 Kafka layer views (#2784))
=======
=======
=======
=======
>>>>>>> fa68dd43c (GEOMESA-3100 Kafka layer views (#2784))
=======
>>>>>>> 0fde036fa (GEOMESA-3100 Kafka layer views (#2784))
=======
>>>>>>> 89fb9950e (GEOMESA-3100 Kafka layer views (#2784))
=======
>>>>>>> e7bfe001d (GEOMESA-3100 Kafka layer views (#2784))
=======
=======
>>>>>>> af0a88eb1 (GEOMESA-3100 Kafka layer views (#2784))
>>>>>>> d0dc799ff (GEOMESA-3100 Kafka layer views (#2784))
=======
<<<<<<< HEAD
>>>>>>> af0a88eb1 (GEOMESA-3100 Kafka layer views (#2784))
>>>>>>> d0dc799ff (GEOMESA-3100 Kafka layer views (#2784))
=======
=======
>>>>>>> 936154130 (GEOMESA-3100 Kafka layer views (#2784))
<<<<<<< HEAD
<<<<<<< HEAD
=======
>>>>>>> af0a88eb1 (GEOMESA-3100 Kafka layer views (#2784))
>>>>>>> locationtech-main
=======
>>>>>>> af0a88eb1 (GEOMESA-3100 Kafka layer views (#2784))
>>>>>>> 58286bfd3 (GEOMESA-3100 Kafka layer views (#2784))
>>>>>>> 5ca0cd6de (GEOMESA-3100 Kafka layer views (#2784))
<<<<<<< HEAD
<<<<<<< HEAD
<<<<<<< HEAD
<<<<<<< HEAD
=======
>>>>>>> ea3b40e18 (GEOMESA-3100 Kafka layer views (#2784))
=======
>>>>>>> af0a88eb1 (GEOMESA-3100 Kafka layer views (#2784))
>>>>>>> bddfdbea5 (GEOMESA-3100 Kafka layer views (#2784))
=======
>>>>>>> d0dc799ff (GEOMESA-3100 Kafka layer views (#2784))
<<<<<<< HEAD
=======
>>>>>>> 936154130 (GEOMESA-3100 Kafka layer views (#2784))
=======
=======
>>>>>>> af0a88eb1 (GEOMESA-3100 Kafka layer views (#2784))
>>>>>>> bddfdbea5 (GEOMESA-3100 Kafka layer views (#2784))
>>>>>>> 2f6607232 (GEOMESA-3100 Kafka layer views (#2784))
=======
>>>>>>> ea3b40e18 (GEOMESA-3100 Kafka layer views (#2784))
    }
    val producer = getTransactionalProducer(sft, transaction)
=======
=======
    }
<<<<<<< HEAD
    val producer = getTransactionalProducer(transaction)
>>>>>>> 890b70c86 (GEOMESA-3100 Kafka layer views (#2784))
=======
    val producer = getTransactionalProducer(sft, transaction)
>>>>>>> d657014c8 (GEOMESA-3198 Kafka streams integration (#2854))
=======
=======
    }
    val producer = getTransactionalProducer(transaction)
>>>>>>> 4d37d5ef5 (GEOMESA-3100 Kafka layer views (#2784))
=======
=======
    }
    val producer = getTransactionalProducer(transaction)
>>>>>>> 69287f5812 (GEOMESA-3100 Kafka layer views (#2784))
<<<<<<< HEAD
=======
>>>>>>> 649f2f9c22 (GEOMESA-3100 Kafka layer views (#2784))
    val vis = sft.isVisibilityRequired
    val writer = filter match {
      case None if vis    => new AppendKafkaFeatureWriter(sft, producer, config.serialization) with RequiredVisibilityWriter
      case None           => new AppendKafkaFeatureWriter(sft, producer, config.serialization)
      case Some(f) if vis => new ModifyKafkaFeatureWriter(sft, producer, config.serialization, f) with RequiredVisibilityWriter
      case Some(f)        => new ModifyKafkaFeatureWriter(sft, producer, config.serialization, f)
    }
<<<<<<< HEAD
    if (config.clearOnStart && cleared.add(sft.getTypeName)) {
<<<<<<< HEAD
<<<<<<< HEAD
=======
>>>>>>> 42e8565e9b (Merge branch 'feature/postgis-fixes')
=======
>>>>>>> f1532f2313 (GEOMESA-3254 Add Bloop build support)
=======
>>>>>>> 3010fc384e (GEOMESA-3100 Kafka layer views (#2784))
=======
>>>>>>> a0314fb7ff (GEOMESA-3100 Kafka layer views (#2784))
=======
>>>>>>> 17f13b3a7a (GEOMESA-3100 Kafka layer views (#2784))
=======
    writer
  }

  override def getFeatureWriterAppend(typeName: String, transaction: Transaction): KafkaFeatureWriter = {
    val sft = getSchema(typeName)
    if (sft == null) {
      throw new IOException(s"Schema '$typeName' has not been initialized. Please call 'createSchema' first.")
    } else if (layerViewLookup.contains(typeName)) {
      throw new IllegalArgumentException(s"Schema '$typeName' is a read-only view of '${layerViewLookup(typeName)}'")
    }
    val producer = getTransactionalProducer(transaction)
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
>>>>>>> 649f2f9c22 (GEOMESA-3100 Kafka layer views (#2784))
>>>>>>> f7038468b (GEOMESA-3100 Kafka layer views (#2784))
<<<<<<< HEAD
>>>>>>> d2002b5af (GEOMESA-3100 Kafka layer views (#2784))
<<<<<<< HEAD
>>>>>>> d5f6f5af59 (GEOMESA-3100 Kafka layer views (#2784))
<<<<<<< HEAD
>>>>>>> 314efe4dee (GEOMESA-3100 Kafka layer views (#2784))
=======
=======
=======
=======
>>>>>>> bddfdbea5 (GEOMESA-3100 Kafka layer views (#2784))
<<<<<<< HEAD
>>>>>>> c589b832a (GEOMESA-3100 Kafka layer views (#2784))
<<<<<<< HEAD
>>>>>>> 9e433ba57e (GEOMESA-3100 Kafka layer views (#2784))
<<<<<<< HEAD
>>>>>>> 2750a5beef (GEOMESA-3100 Kafka layer views (#2784))
=======
=======
=======
=======
>>>>>>> 95c83ca7f (GEOMESA-3100 Kafka layer views (#2784))
<<<<<<< HEAD
<<<<<<< HEAD
>>>>>>> fa68dd43c (GEOMESA-3100 Kafka layer views (#2784))
<<<<<<< HEAD
>>>>>>> 23f312535d (GEOMESA-3100 Kafka layer views (#2784))
<<<<<<< HEAD
>>>>>>> 468da42855 (GEOMESA-3100 Kafka layer views (#2784))
=======
=======
=======
=======
>>>>>>> f7038468b (GEOMESA-3100 Kafka layer views (#2784))
>>>>>>> 890b70c86 (GEOMESA-3100 Kafka layer views (#2784))
<<<<<<< HEAD
>>>>>>> 0fde036fa (GEOMESA-3100 Kafka layer views (#2784))
<<<<<<< HEAD
>>>>>>> 4f05dea44b (GEOMESA-3100 Kafka layer views (#2784))
<<<<<<< HEAD
>>>>>>> ae2a886e4b (GEOMESA-3100 Kafka layer views (#2784))
=======
=======
=======
=======
>>>>>>> 9a5d6d2815 (GEOMESA-3100 Kafka layer views (#2784))
=======
>>>>>>> f7038468b (GEOMESA-3100 Kafka layer views (#2784))
=======
>>>>>>> bddfdbea5 (GEOMESA-3100 Kafka layer views (#2784))
>>>>>>> 2f6607232 (GEOMESA-3100 Kafka layer views (#2784))
<<<<<<< HEAD
<<<<<<< HEAD
<<<<<<< HEAD
>>>>>>> c57b5f538 (GEOMESA-3100 Kafka layer views (#2784))
<<<<<<< HEAD
>>>>>>> 1e11ed51a6 (GEOMESA-3100 Kafka layer views (#2784))
<<<<<<< HEAD
>>>>>>> d530f7b24a (GEOMESA-3100 Kafka layer views (#2784))
=======
=======
=======
=======
>>>>>>> d2cb939f5 (GEOMESA-3100 Kafka layer views (#2784))
<<<<<<< HEAD
<<<<<<< HEAD
>>>>>>> 89fb9950e (GEOMESA-3100 Kafka layer views (#2784))
<<<<<<< HEAD
>>>>>>> bc97b07a31 (GEOMESA-3100 Kafka layer views (#2784))
<<<<<<< HEAD
>>>>>>> f340d6feab (GEOMESA-3100 Kafka layer views (#2784))
=======
=======
=======
=======
>>>>>>> f7038468b (GEOMESA-3100 Kafka layer views (#2784))
>>>>>>> 4d37d5ef5 (GEOMESA-3100 Kafka layer views (#2784))
>>>>>>> e7bfe001d (GEOMESA-3100 Kafka layer views (#2784))
>>>>>>> a09ef82d36 (GEOMESA-3100 Kafka layer views (#2784))
>>>>>>> 882c4b4793 (GEOMESA-3100 Kafka layer views (#2784))
=======
>>>>>>> 337ecd16e5 (GEOMESA-3100 Kafka layer views (#2784))
=======
>>>>>>> f7038468b (GEOMESA-3100 Kafka layer views (#2784))
>>>>>>> 69287f5812 (GEOMESA-3100 Kafka layer views (#2784))
=======
>>>>>>> f7038468b (GEOMESA-3100 Kafka layer views (#2784))
=======
>>>>>>> bddfdbea5 (GEOMESA-3100 Kafka layer views (#2784))
>>>>>>> 12fe94b860 (GEOMESA-3100 Kafka layer views (#2784))
=======
=======
>>>>>>> 95c83ca7f (GEOMESA-3100 Kafka layer views (#2784))
>>>>>>> 19aa61c0de (GEOMESA-3100 Kafka layer views (#2784))
=======
=======
>>>>>>> f7038468b (GEOMESA-3100 Kafka layer views (#2784))
>>>>>>> 890b70c86 (GEOMESA-3100 Kafka layer views (#2784))
>>>>>>> 96f945c352 (GEOMESA-3100 Kafka layer views (#2784))
=======
>>>>>>> 9a5d6d2815 (GEOMESA-3100 Kafka layer views (#2784))
=======
=======
>>>>>>> d2cb939f5 (GEOMESA-3100 Kafka layer views (#2784))
>>>>>>> 305a9263eb (GEOMESA-3100 Kafka layer views (#2784))
=======
=======
>>>>>>> f7038468b (GEOMESA-3100 Kafka layer views (#2784))
>>>>>>> 4d37d5ef5 (GEOMESA-3100 Kafka layer views (#2784))
>>>>>>> 649f2f9c22 (GEOMESA-3100 Kafka layer views (#2784))
=======
>>>>>>> c860f21098 (GEOMESA-3100 Kafka layer views (#2784))
=======
=======
>>>>>>> ad0d29873e (GEOMESA-3100 Kafka layer views (#2784))
=======
>>>>>>> c3ab11ea86 (GEOMESA-3100 Kafka layer views (#2784))
=======
>>>>>>> 4516873dab (GEOMESA-3100 Kafka layer views (#2784))
=======
>>>>>>> 2db2756651 (GEOMESA-3100 Kafka layer views (#2784))
=======
>>>>>>> 8ec26b8c2a (GEOMESA-3100 Kafka layer views (#2784))
=======
>>>>>>> 3010fc384e (GEOMESA-3100 Kafka layer views (#2784))
=======
<<<<<<< HEAD
>>>>>>> af0a88eb1 (GEOMESA-3100 Kafka layer views (#2784))
=======
<<<<<<< HEAD
=======
>>>>>>> af0a88eb1 (GEOMESA-3100 Kafka layer views (#2784))
=======
<<<<<<< HEAD
<<<<<<< HEAD
>>>>>>> d0dc799ff1 (GEOMESA-3100 Kafka layer views (#2784))
=======
=======
>>>>>>> af0a88eb1 (GEOMESA-3100 Kafka layer views (#2784))
>>>>>>> d0dc799ff (GEOMESA-3100 Kafka layer views (#2784))
=======
<<<<<<< HEAD
<<<<<<< HEAD
>>>>>>> 9361541304 (GEOMESA-3100 Kafka layer views (#2784))
=======
>>>>>>> af0a88eb1 (GEOMESA-3100 Kafka layer views (#2784))
>>>>>>> locationtech-main
=======
>>>>>>> af0a88eb1 (GEOMESA-3100 Kafka layer views (#2784))
>>>>>>> 58286bfd3 (GEOMESA-3100 Kafka layer views (#2784))
<<<<<<< HEAD
<<<<<<< HEAD
>>>>>>> 5ca0cd6de5 (GEOMESA-3100 Kafka layer views (#2784))
=======
>>>>>>> af0a88eb1 (GEOMESA-3100 Kafka layer views (#2784))
>>>>>>> bddfdbea54 (GEOMESA-3100 Kafka layer views (#2784))
=======
>>>>>>> 5ca0cd6de (GEOMESA-3100 Kafka layer views (#2784))
<<<<<<< HEAD
<<<<<<< HEAD
>>>>>>> d0dc799ff1 (GEOMESA-3100 Kafka layer views (#2784))
=======
>>>>>>> 5ca0cd6de (GEOMESA-3100 Kafka layer views (#2784))
>>>>>>> 9361541304 (GEOMESA-3100 Kafka layer views (#2784))
=======
=======
>>>>>>> af0a88eb1 (GEOMESA-3100 Kafka layer views (#2784))
>>>>>>> bddfdbea5 (GEOMESA-3100 Kafka layer views (#2784))
>>>>>>> 2f66072323 (GEOMESA-3100 Kafka layer views (#2784))
=======
=======
>>>>>>> af0a88eb1 (GEOMESA-3100 Kafka layer views (#2784))
>>>>>>> bddfdbea5 (GEOMESA-3100 Kafka layer views (#2784))
=======
>>>>>>> d0dc799ff (GEOMESA-3100 Kafka layer views (#2784))
>>>>>>> ea3b40e187 (GEOMESA-3100 Kafka layer views (#2784))
    }
    val producer = getTransactionalProducer(sft, transaction)
=======
=======
    }
<<<<<<< HEAD
    val producer = getTransactionalProducer(transaction)
>>>>>>> 890b70c869 (GEOMESA-3100 Kafka layer views (#2784))
=======
    val producer = getTransactionalProducer(sft, transaction)
>>>>>>> d657014c83 (GEOMESA-3198 Kafka streams integration (#2854))
=======
=======
    }
    val producer = getTransactionalProducer(transaction)
>>>>>>> 4d37d5ef54 (GEOMESA-3100 Kafka layer views (#2784))
    val vis = sft.isVisibilityRequired
    val writer = filter match {
      case None if vis    => new AppendKafkaFeatureWriter(sft, producer, config.serialization) with RequiredVisibilityWriter
      case None           => new AppendKafkaFeatureWriter(sft, producer, config.serialization)
      case Some(f) if vis => new ModifyKafkaFeatureWriter(sft, producer, config.serialization, f) with RequiredVisibilityWriter
      case Some(f)        => new ModifyKafkaFeatureWriter(sft, producer, config.serialization, f)
    }
<<<<<<< HEAD
    if (config.clearOnStart && cleared.add(sft.getTypeName)) {
=======
>>>>>>> db8d998aa2 (Merge branch 'feature/postgis-fixes')
=======
    writer
  }

  override def getFeatureWriterAppend(typeName: String, transaction: Transaction): KafkaFeatureWriter = {
    val sft = getSchema(typeName)
    if (sft == null) {
      throw new IOException(s"Schema '$typeName' has not been initialized. Please call 'createSchema' first.")
    } else if (layerViewLookup.contains(typeName)) {
      throw new IllegalArgumentException(s"Schema '$typeName' is a read-only view of '${layerViewLookup(typeName)}'")
    }
    val producer = getTransactionalProducer(transaction)
<<<<<<< HEAD
<<<<<<< HEAD
<<<<<<< HEAD
<<<<<<< HEAD
<<<<<<< HEAD
<<<<<<< HEAD
<<<<<<< HEAD
<<<<<<< HEAD
<<<<<<< HEAD
>>>>>>> f7038468b7 (GEOMESA-3100 Kafka layer views (#2784))
<<<<<<< HEAD
>>>>>>> 984dd84de9 (GEOMESA-3100 Kafka layer views (#2784))
=======
=======
>>>>>>> bddfdbea54 (GEOMESA-3100 Kafka layer views (#2784))
<<<<<<< HEAD
>>>>>>> 5dc1f86700 (GEOMESA-3100 Kafka layer views (#2784))
=======
=======
>>>>>>> 95c83ca7fa (GEOMESA-3100 Kafka layer views (#2784))
<<<<<<< HEAD
>>>>>>> ad0d29873e (GEOMESA-3100 Kafka layer views (#2784))
=======
=======
>>>>>>> f7038468b (GEOMESA-3100 Kafka layer views (#2784))
>>>>>>> 890b70c869 (GEOMESA-3100 Kafka layer views (#2784))
<<<<<<< HEAD
>>>>>>> c3ab11ea86 (GEOMESA-3100 Kafka layer views (#2784))
=======
=======
>>>>>>> f7038468b (GEOMESA-3100 Kafka layer views (#2784))
=======
>>>>>>> bddfdbea5 (GEOMESA-3100 Kafka layer views (#2784))
>>>>>>> 2f66072323 (GEOMESA-3100 Kafka layer views (#2784))
<<<<<<< HEAD
>>>>>>> f43f8303d3 (GEOMESA-3100 Kafka layer views (#2784))
=======
=======
>>>>>>> d2cb939f51 (GEOMESA-3100 Kafka layer views (#2784))
<<<<<<< HEAD
>>>>>>> 4516873dab (GEOMESA-3100 Kafka layer views (#2784))
=======
=======
>>>>>>> f7038468b (GEOMESA-3100 Kafka layer views (#2784))
>>>>>>> 4d37d5ef54 (GEOMESA-3100 Kafka layer views (#2784))
<<<<<<< HEAD
>>>>>>> 2db2756651 (GEOMESA-3100 Kafka layer views (#2784))
=======
=======
>>>>>>> a0314fb7ff (GEOMESA-3100 Kafka layer views (#2784))
<<<<<<< HEAD
>>>>>>> 8ec26b8c2a (GEOMESA-3100 Kafka layer views (#2784))
=======
=======
=======
>>>>>>> 4231e686dd (GEOMESA-3100 Kafka layer views (#2784))
=======
>>>>>>> 8347f5d271 (GEOMESA-3100 Kafka layer views (#2784))
=======
>>>>>>> 6af71ff432 (GEOMESA-3100 Kafka layer views (#2784))
=======
>>>>>>> b4c6267f1c (GEOMESA-3100 Kafka layer views (#2784))
=======
=======
>>>>>>> af0a88eb1 (GEOMESA-3100 Kafka layer views (#2784))
>>>>>>> d0dc799ff (GEOMESA-3100 Kafka layer views (#2784))
=======
<<<<<<< HEAD
>>>>>>> af0a88eb1 (GEOMESA-3100 Kafka layer views (#2784))
>>>>>>> d0dc799ff (GEOMESA-3100 Kafka layer views (#2784))
=======
=======
>>>>>>> 936154130 (GEOMESA-3100 Kafka layer views (#2784))
<<<<<<< HEAD
<<<<<<< HEAD
=======
>>>>>>> af0a88eb1 (GEOMESA-3100 Kafka layer views (#2784))
>>>>>>> locationtech-main
=======
>>>>>>> af0a88eb1 (GEOMESA-3100 Kafka layer views (#2784))
>>>>>>> 58286bfd3 (GEOMESA-3100 Kafka layer views (#2784))
>>>>>>> 5ca0cd6de (GEOMESA-3100 Kafka layer views (#2784))
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
>>>>>>> c1d0543aac (GEOMESA-3100 Kafka layer views (#2784))
=======
>>>>>>> 8b9e99d11a (GEOMESA-3100 Kafka layer views (#2784))
=======
>>>>>>> ea3b40e18 (GEOMESA-3100 Kafka layer views (#2784))
=======
>>>>>>> 73767737b (GEOMESA-3100 Kafka layer views (#2784))
=======
>>>>>>> 429ffc55e (GEOMESA-3100 Kafka layer views (#2784))
=======
>>>>>>> e7f3e6588 (GEOMESA-3100 Kafka layer views (#2784))
=======
=======
>>>>>>> ea3b40e18 (GEOMESA-3100 Kafka layer views (#2784))
>>>>>>> 6f6887eb8 (GEOMESA-3100 Kafka layer views (#2784))
=======
=======
>>>>>>> 04f82bbc57 (GEOMESA-3100 Kafka layer views (#2784))
=======
>>>>>>> e0773a1bd7 (GEOMESA-3100 Kafka layer views (#2784))
=======
>>>>>>> ae5eea67f1 (GEOMESA-3100 Kafka layer views (#2784))
=======
>>>>>>> 4480b2d1b9 (GEOMESA-3100 Kafka layer views (#2784))
=======
>>>>>>> 9e433ba57e (GEOMESA-3100 Kafka layer views (#2784))
=======
>>>>>>> 2df2640494 (GEOMESA-3100 Kafka layer views (#2784))
=======
>>>>>>> 826636f69d (GEOMESA-3100 Kafka layer views (#2784))
=======
>>>>>>> 1e11ed51a6 (GEOMESA-3100 Kafka layer views (#2784))
=======
>>>>>>> 976f319530 (GEOMESA-3100 Kafka layer views (#2784))
=======
>>>>>>> ea3b40e18 (GEOMESA-3100 Kafka layer views (#2784))
=======
>>>>>>> 28427dfd8 (GEOMESA-3100 Kafka layer views (#2784))
>>>>>>> 614fcb6bc3 (GEOMESA-3100 Kafka layer views (#2784))
=======
>>>>>>> ac0357d36 (GEOMESA-3100 Kafka layer views (#2784))
=======
>>>>>>> a62b956fb (GEOMESA-3100 Kafka layer views (#2784))
=======
=======
>>>>>>> ea3b40e18 (GEOMESA-3100 Kafka layer views (#2784))
>>>>>>> 4adaa7f47 (GEOMESA-3100 Kafka layer views (#2784))
=======
>>>>>>> ffbc2ce32 (GEOMESA-3100 Kafka layer views (#2784))
=======
>>>>>>> 54ece16d1 (GEOMESA-3100 Kafka layer views (#2784))
=======
>>>>>>> c57b5f538 (GEOMESA-3100 Kafka layer views (#2784))
=======
=======
>>>>>>> ea3b40e18 (GEOMESA-3100 Kafka layer views (#2784))
>>>>>>> 88ef67cdf (GEOMESA-3100 Kafka layer views (#2784))
=======
>>>>>>> af0a88eb1 (GEOMESA-3100 Kafka layer views (#2784))
>>>>>>> bddfdbea5 (GEOMESA-3100 Kafka layer views (#2784))
=======
>>>>>>> d0dc799ff (GEOMESA-3100 Kafka layer views (#2784))
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
>>>>>>> 6f6887eb8 (GEOMESA-3100 Kafka layer views (#2784))
=======
<<<<<<< HEAD
=======
>>>>>>> 614fcb6bc3 (GEOMESA-3100 Kafka layer views (#2784))
=======
>>>>>>> 69e3273ac1 (GEOMESA-3100 Kafka layer views (#2784))
=======
=======
>>>>>>> 2df2640494 (GEOMESA-3100 Kafka layer views (#2784))
=======
>>>>>>> 23f312535d (GEOMESA-3100 Kafka layer views (#2784))
=======
>>>>>>> 976f319530 (GEOMESA-3100 Kafka layer views (#2784))
=======
>>>>>>> 4adaa7f47 (GEOMESA-3100 Kafka layer views (#2784))
>>>>>>> ae5eea67f1 (GEOMESA-3100 Kafka layer views (#2784))
=======
>>>>>>> 88ef67cdf (GEOMESA-3100 Kafka layer views (#2784))
=======
>>>>>>> af0a88eb1 (GEOMESA-3100 Kafka layer views (#2784))
>>>>>>> 95c83ca7f (GEOMESA-3100 Kafka layer views (#2784))
=======
>>>>>>> 9b15c8e14c (GEOMESA-3100 Kafka layer views (#2784))
>>>>>>> 936154130 (GEOMESA-3100 Kafka layer views (#2784))
<<<<<<< HEAD
<<<<<<< HEAD
<<<<<<< HEAD
<<<<<<< HEAD
<<<<<<< HEAD
<<<<<<< HEAD
=======
>>>>>>> e7f3e6588 (GEOMESA-3100 Kafka layer views (#2784))
=======
>>>>>>> 04f82bbc57 (GEOMESA-3100 Kafka layer views (#2784))
=======
=======
>>>>>>> 826636f69d (GEOMESA-3100 Kafka layer views (#2784))
=======
>>>>>>> 1e11ed51a6 (GEOMESA-3100 Kafka layer views (#2784))
=======
>>>>>>> a62b956fb (GEOMESA-3100 Kafka layer views (#2784))
>>>>>>> e0773a1bd7 (GEOMESA-3100 Kafka layer views (#2784))
=======
>>>>>>> c57b5f538 (GEOMESA-3100 Kafka layer views (#2784))
=======
=======
>>>>>>> af0a88eb1 (GEOMESA-3100 Kafka layer views (#2784))
>>>>>>> bddfdbea5 (GEOMESA-3100 Kafka layer views (#2784))
>>>>>>> 2f6607232 (GEOMESA-3100 Kafka layer views (#2784))
<<<<<<< HEAD
<<<<<<< HEAD
<<<<<<< HEAD
<<<<<<< HEAD
<<<<<<< HEAD
<<<<<<< HEAD
=======
>>>>>>> e0773a1bd7 (GEOMESA-3100 Kafka layer views (#2784))
=======
>>>>>>> ae5eea67f1 (GEOMESA-3100 Kafka layer views (#2784))
=======
>>>>>>> 1e11ed51a6 (GEOMESA-3100 Kafka layer views (#2784))
=======
>>>>>>> 976f319530 (GEOMESA-3100 Kafka layer views (#2784))
=======
>>>>>>> ea3b40e18 (GEOMESA-3100 Kafka layer views (#2784))
<<<<<<< HEAD
=======
=======
>>>>>>> af0a88eb1 (GEOMESA-3100 Kafka layer views (#2784))
>>>>>>> d2cb939f5 (GEOMESA-3100 Kafka layer views (#2784))
<<<<<<< HEAD
<<<<<<< HEAD
=======
>>>>>>> 3be8d2a5a (Merge branch 'feature/postgis-fixes')
=======
>>>>>>> af0a88eb1 (GEOMESA-3100 Kafka layer views (#2784))
<<<<<<< HEAD
>>>>>>> e1f939a3e (GEOMESA-3100 Kafka layer views (#2784))
=======
>>>>>>> 581f1dd15 (GEOMESA-3100 Kafka layer views (#2784))
=======
=======
>>>>>>> af0a88eb1 (GEOMESA-3100 Kafka layer views (#2784))
>>>>>>> bddfdbea5 (GEOMESA-3100 Kafka layer views (#2784))
>>>>>>> 1a5f68233 (GEOMESA-3100 Kafka layer views (#2784))
=======
>>>>>>> 73767737b (GEOMESA-3100 Kafka layer views (#2784))
=======
=======
>>>>>>> af0a88eb1 (GEOMESA-3100 Kafka layer views (#2784))
>>>>>>> 95c83ca7f (GEOMESA-3100 Kafka layer views (#2784))
>>>>>>> 65a3a6e36 (GEOMESA-3100 Kafka layer views (#2784))
=======
>>>>>>> 429ffc55e (GEOMESA-3100 Kafka layer views (#2784))
=======
>>>>>>> e7f3e6588 (GEOMESA-3100 Kafka layer views (#2784))
=======
=======
>>>>>>> ea3b40e18 (GEOMESA-3100 Kafka layer views (#2784))
>>>>>>> 6f6887eb8 (GEOMESA-3100 Kafka layer views (#2784))
=======
>>>>>>> 42549e8e3 (GEOMESA-3100 Kafka layer views (#2784))
=======
=======
>>>>>>> 3be8d2a5a (Merge branch 'feature/postgis-fixes')
>>>>>>> e8cc4971c6 (Merge branch 'feature/postgis-fixes')
=======
>>>>>>> 9bda77cfe (GEOMESA-3100 Kafka layer views (#2784))
<<<<<<< HEAD
>>>>>>> 06956ccf98 (GEOMESA-3100 Kafka layer views (#2784))
=======
=======
>>>>>>> 9236b0208 (GEOMESA-3100 Kafka layer views (#2784))
<<<<<<< HEAD
>>>>>>> c1d0543aac (GEOMESA-3100 Kafka layer views (#2784))
=======
=======
=======
>>>>>>> af0a88eb1 (GEOMESA-3100 Kafka layer views (#2784))
>>>>>>> bddfdbea5 (GEOMESA-3100 Kafka layer views (#2784))
>>>>>>> 862857ce2 (GEOMESA-3100 Kafka layer views (#2784))
<<<<<<< HEAD
>>>>>>> 8b9e99d11a (GEOMESA-3100 Kafka layer views (#2784))
=======
=======
>>>>>>> 28427dfd8 (GEOMESA-3100 Kafka layer views (#2784))
<<<<<<< HEAD
>>>>>>> 614fcb6bc3 (GEOMESA-3100 Kafka layer views (#2784))
=======
=======
=======
>>>>>>> af0a88eb1 (GEOMESA-3100 Kafka layer views (#2784))
>>>>>>> 95c83ca7f (GEOMESA-3100 Kafka layer views (#2784))
>>>>>>> 4231e686d (GEOMESA-3100 Kafka layer views (#2784))
<<<<<<< HEAD
>>>>>>> 69e3273ac1 (GEOMESA-3100 Kafka layer views (#2784))
=======
=======
>>>>>>> ac0357d36 (GEOMESA-3100 Kafka layer views (#2784))
<<<<<<< HEAD
>>>>>>> 04f82bbc57 (GEOMESA-3100 Kafka layer views (#2784))
=======
=======
>>>>>>> a62b956fb (GEOMESA-3100 Kafka layer views (#2784))
<<<<<<< HEAD
>>>>>>> e0773a1bd7 (GEOMESA-3100 Kafka layer views (#2784))
=======
=======
=======
>>>>>>> ea3b40e18 (GEOMESA-3100 Kafka layer views (#2784))
>>>>>>> 4adaa7f47 (GEOMESA-3100 Kafka layer views (#2784))
<<<<<<< HEAD
>>>>>>> ae5eea67f1 (GEOMESA-3100 Kafka layer views (#2784))
=======
=======
>>>>>>> f6e840b5d (GEOMESA-3100 Kafka layer views (#2784))
<<<<<<< HEAD
>>>>>>> 4480b2d1b9 (GEOMESA-3100 Kafka layer views (#2784))
=======
=======
=======
>>>>>>> af0a88eb1 (GEOMESA-3100 Kafka layer views (#2784))
>>>>>>> bddfdbea5 (GEOMESA-3100 Kafka layer views (#2784))
>>>>>>> c589b832a (GEOMESA-3100 Kafka layer views (#2784))
<<<<<<< HEAD
>>>>>>> 9e433ba57e (GEOMESA-3100 Kafka layer views (#2784))
=======
=======
>>>>>>> ffbc2ce32 (GEOMESA-3100 Kafka layer views (#2784))
<<<<<<< HEAD
>>>>>>> 2df2640494 (GEOMESA-3100 Kafka layer views (#2784))
=======
=======
=======
>>>>>>> af0a88eb1 (GEOMESA-3100 Kafka layer views (#2784))
>>>>>>> 95c83ca7f (GEOMESA-3100 Kafka layer views (#2784))
>>>>>>> fa68dd43c (GEOMESA-3100 Kafka layer views (#2784))
<<<<<<< HEAD
>>>>>>> 23f312535d (GEOMESA-3100 Kafka layer views (#2784))
=======
=======
>>>>>>> 54ece16d1 (GEOMESA-3100 Kafka layer views (#2784))
<<<<<<< HEAD
>>>>>>> 826636f69d (GEOMESA-3100 Kafka layer views (#2784))
=======
=======
>>>>>>> c57b5f538 (GEOMESA-3100 Kafka layer views (#2784))
<<<<<<< HEAD
>>>>>>> 1e11ed51a6 (GEOMESA-3100 Kafka layer views (#2784))
=======
=======
=======
>>>>>>> ea3b40e18 (GEOMESA-3100 Kafka layer views (#2784))
>>>>>>> 88ef67cdf (GEOMESA-3100 Kafka layer views (#2784))
>>>>>>> 976f319530 (GEOMESA-3100 Kafka layer views (#2784))
    // kick off the kafka consumers for this sft, if not already started
    caches.get(layerViewLookup.getOrElse(query.getTypeName, query.getTypeName))
    GeoMesaFeatureReader(sft, query, runner, config.audit)
  }

<<<<<<< HEAD
  override private[geomesa] def getFeatureWriter(
      sft: SimpleFeatureType,
      transaction: Transaction,
      filter: Option[Filter]): FlushableFeatureWriter = {
    if (layerViewLookup.contains(sft.getTypeName)) {
      throw new IllegalArgumentException(
        s"Schema '${sft.getTypeName}' is a read-only view of '${layerViewLookup(sft.getTypeName)}'")
<<<<<<< HEAD
<<<<<<< HEAD
<<<<<<< HEAD
<<<<<<< HEAD
=======
>>>>>>> e8cc4971c6 (Merge branch 'feature/postgis-fixes')
=======
>>>>>>> 8ed2c9f7e5 (GEOMESA-3100 Kafka layer views (#2784))
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
=======
=======
>>>>>>> eecabb92a (GEOMESA-3100 Kafka layer views (#2784))
=======
>>>>>>> e1f939a3e (GEOMESA-3100 Kafka layer views (#2784))
=======
>>>>>>> 1a5f68233 (GEOMESA-3100 Kafka layer views (#2784))
=======
>>>>>>> 65a3a6e36 (GEOMESA-3100 Kafka layer views (#2784))
=======
>>>>>>> 42549e8e3 (GEOMESA-3100 Kafka layer views (#2784))
=======
=======
=======
>>>>>>> a0314fb7f (GEOMESA-3100 Kafka layer views (#2784))
>>>>>>> 8ed2c9f7e5 (GEOMESA-3100 Kafka layer views (#2784))
=======
=======
>>>>>>> 8b9e99d11a (GEOMESA-3100 Kafka layer views (#2784))
=======
>>>>>>> 69e3273ac1 (GEOMESA-3100 Kafka layer views (#2784))
=======
>>>>>>> 9e433ba57e (GEOMESA-3100 Kafka layer views (#2784))
=======
>>>>>>> 23f312535d (GEOMESA-3100 Kafka layer views (#2784))
=======
=======
>>>>>>> a0314fb7f (GEOMESA-3100 Kafka layer views (#2784))
=======
>>>>>>> 9bda77cfe (GEOMESA-3100 Kafka layer views (#2784))
<<<<<<< HEAD
>>>>>>> 06956ccf98 (GEOMESA-3100 Kafka layer views (#2784))
=======
=======
>>>>>>> 862857ce2 (GEOMESA-3100 Kafka layer views (#2784))
<<<<<<< HEAD
>>>>>>> 8b9e99d11a (GEOMESA-3100 Kafka layer views (#2784))
=======
=======
>>>>>>> 4231e686d (GEOMESA-3100 Kafka layer views (#2784))
>>>>>>> 69e3273ac1 (GEOMESA-3100 Kafka layer views (#2784))
    new KafkaFeatureStore(this, sft, runner, cache(typeName))
  }

  override def getFeatureReader(query: Query, transaction: Transaction): SimpleFeatureReader = {
    val sft = getSchema(query.getTypeName)
    if (sft == null) {
      throw new IOException(s"Schema '${query.getTypeName}' has not been initialized. Please call 'createSchema' first.")
    }
    // kick off the kafka consumers for this sft, if not already started
    caches.get(layerViewLookup.getOrElse(query.getTypeName, query.getTypeName))
    GeoMesaFeatureReader(sft, query, runner, config.audit)
  }

<<<<<<< HEAD
<<<<<<< HEAD
<<<<<<< HEAD
<<<<<<< HEAD
=======
>>>>>>> 8ed2c9f7e5 (GEOMESA-3100 Kafka layer views (#2784))
=======
>>>>>>> 06956ccf98 (GEOMESA-3100 Kafka layer views (#2784))
=======
>>>>>>> f7038468b (GEOMESA-3100 Kafka layer views (#2784))
=======
>>>>>>> bddfdbea5 (GEOMESA-3100 Kafka layer views (#2784))
<<<<<<< HEAD
<<<<<<< HEAD
<<<<<<< HEAD
<<<<<<< HEAD
=======
>>>>>>> 8b9e99d11a (GEOMESA-3100 Kafka layer views (#2784))
=======
>>>>>>> 69e3273ac1 (GEOMESA-3100 Kafka layer views (#2784))
=======
>>>>>>> 95c83ca7f (GEOMESA-3100 Kafka layer views (#2784))
=======
>>>>>>> d2cb939f5 (GEOMESA-3100 Kafka layer views (#2784))
<<<<<<< HEAD
<<<<<<< HEAD
=======
>>>>>>> eecabb92a (GEOMESA-3100 Kafka layer views (#2784))
=======
=======
>>>>>>> f7038468b (GEOMESA-3100 Kafka layer views (#2784))
>>>>>>> e1f939a3e (GEOMESA-3100 Kafka layer views (#2784))
=======
>>>>>>> 1a5f68233 (GEOMESA-3100 Kafka layer views (#2784))
=======
=======
>>>>>>> 95c83ca7f (GEOMESA-3100 Kafka layer views (#2784))
>>>>>>> 65a3a6e36 (GEOMESA-3100 Kafka layer views (#2784))
=======
>>>>>>> 42549e8e3 (GEOMESA-3100 Kafka layer views (#2784))
=======
=======
>>>>>>> a0314fb7f (GEOMESA-3100 Kafka layer views (#2784))
<<<<<<< HEAD
>>>>>>> 8ed2c9f7e5 (GEOMESA-3100 Kafka layer views (#2784))
=======
=======
=======
>>>>>>> f7038468b (GEOMESA-3100 Kafka layer views (#2784))
>>>>>>> 9bda77cfe (GEOMESA-3100 Kafka layer views (#2784))
<<<<<<< HEAD
>>>>>>> 06956ccf98 (GEOMESA-3100 Kafka layer views (#2784))
=======
=======
>>>>>>> 862857ce2 (GEOMESA-3100 Kafka layer views (#2784))
<<<<<<< HEAD
>>>>>>> 8b9e99d11a (GEOMESA-3100 Kafka layer views (#2784))
=======
=======
=======
>>>>>>> 95c83ca7f (GEOMESA-3100 Kafka layer views (#2784))
>>>>>>> 4231e686d (GEOMESA-3100 Kafka layer views (#2784))
>>>>>>> 69e3273ac1 (GEOMESA-3100 Kafka layer views (#2784))
  override def getFeatureWriter(typeName: String, filter: Filter, transaction: Transaction): KafkaFeatureWriter = {
    val sft = getSchema(typeName)
    if (sft == null) {
      throw new IOException(s"Schema '$typeName' has not been initialized. Please call 'createSchema' first.")
    } else if (layerViewLookup.contains(typeName)) {
      throw new IllegalArgumentException(s"Schema '$typeName' is a read-only view of '${layerViewLookup(typeName)}'")
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
>>>>>>> e7f3e6588 (GEOMESA-3100 Kafka layer views (#2784))
=======
>>>>>>> 6f6887eb8 (GEOMESA-3100 Kafka layer views (#2784))
=======
>>>>>>> 42549e8e3 (GEOMESA-3100 Kafka layer views (#2784))
=======
>>>>>>> 8ed2c9f7e5 (GEOMESA-3100 Kafka layer views (#2784))
=======
>>>>>>> c1d0543aac (GEOMESA-3100 Kafka layer views (#2784))
=======
>>>>>>> 8b9e99d11a (GEOMESA-3100 Kafka layer views (#2784))
=======
>>>>>>> 614fcb6bc3 (GEOMESA-3100 Kafka layer views (#2784))
=======
>>>>>>> 69e3273ac1 (GEOMESA-3100 Kafka layer views (#2784))
=======
>>>>>>> 04f82bbc57 (GEOMESA-3100 Kafka layer views (#2784))
=======
=======
>>>>>>> ae5eea67f1 (GEOMESA-3100 Kafka layer views (#2784))
=======
>>>>>>> a62b956fb (GEOMESA-3100 Kafka layer views (#2784))
>>>>>>> e0773a1bd7 (GEOMESA-3100 Kafka layer views (#2784))
=======
>>>>>>> 4adaa7f47 (GEOMESA-3100 Kafka layer views (#2784))
=======
>>>>>>> 936154130 (GEOMESA-3100 Kafka layer views (#2784))
=======
>>>>>>> 2f6607232 (GEOMESA-3100 Kafka layer views (#2784))
<<<<<<< HEAD
<<<<<<< HEAD
<<<<<<< HEAD
<<<<<<< HEAD
=======
>>>>>>> e0773a1bd7 (GEOMESA-3100 Kafka layer views (#2784))
=======
>>>>>>> ae5eea67f1 (GEOMESA-3100 Kafka layer views (#2784))
=======
>>>>>>> ea3b40e18 (GEOMESA-3100 Kafka layer views (#2784))
=======
<<<<<<< HEAD
>>>>>>> 581f1dd15 (GEOMESA-3100 Kafka layer views (#2784))
=======
>>>>>>> 1a5f68233 (GEOMESA-3100 Kafka layer views (#2784))
=======
>>>>>>> 73767737b (GEOMESA-3100 Kafka layer views (#2784))
=======
=======
>>>>>>> 936154130 (GEOMESA-3100 Kafka layer views (#2784))
>>>>>>> 429ffc55e (GEOMESA-3100 Kafka layer views (#2784))
=======
>>>>>>> e7f3e6588 (GEOMESA-3100 Kafka layer views (#2784))
=======
=======
>>>>>>> ea3b40e18 (GEOMESA-3100 Kafka layer views (#2784))
>>>>>>> 6f6887eb8 (GEOMESA-3100 Kafka layer views (#2784))
=======
>>>>>>> 9236b0208 (GEOMESA-3100 Kafka layer views (#2784))
<<<<<<< HEAD
>>>>>>> c1d0543aac (GEOMESA-3100 Kafka layer views (#2784))
=======
=======
>>>>>>> 862857ce2 (GEOMESA-3100 Kafka layer views (#2784))
<<<<<<< HEAD
>>>>>>> 8b9e99d11a (GEOMESA-3100 Kafka layer views (#2784))
=======
=======
>>>>>>> 28427dfd8 (GEOMESA-3100 Kafka layer views (#2784))
<<<<<<< HEAD
>>>>>>> 614fcb6bc3 (GEOMESA-3100 Kafka layer views (#2784))
=======
=======
=======
>>>>>>> 936154130 (GEOMESA-3100 Kafka layer views (#2784))
>>>>>>> ac0357d36 (GEOMESA-3100 Kafka layer views (#2784))
<<<<<<< HEAD
>>>>>>> 04f82bbc57 (GEOMESA-3100 Kafka layer views (#2784))
=======
=======
>>>>>>> a62b956fb (GEOMESA-3100 Kafka layer views (#2784))
<<<<<<< HEAD
>>>>>>> e0773a1bd7 (GEOMESA-3100 Kafka layer views (#2784))
=======
=======
=======
>>>>>>> ea3b40e18 (GEOMESA-3100 Kafka layer views (#2784))
>>>>>>> 4adaa7f47 (GEOMESA-3100 Kafka layer views (#2784))
>>>>>>> ae5eea67f1 (GEOMESA-3100 Kafka layer views (#2784))
>>>>>>> af0a88eb1 (GEOMESA-3100 Kafka layer views (#2784))
<<<<<<< HEAD
<<<<<<< HEAD
<<<<<<< HEAD
<<<<<<< HEAD
=======
>>>>>>> af0a88eb1 (GEOMESA-3100 Kafka layer views (#2784))
>>>>>>> 95c83ca7f (GEOMESA-3100 Kafka layer views (#2784))
=======
>>>>>>> 890b70c86 (GEOMESA-3100 Kafka layer views (#2784))
=======
>>>>>>> af0a88eb1 (GEOMESA-3100 Kafka layer views (#2784))
>>>>>>> d2cb939f5 (GEOMESA-3100 Kafka layer views (#2784))
<<<<<<< HEAD
<<<<<<< HEAD
>>>>>>> 89fb9950ef (GEOMESA-3100 Kafka layer views (#2784))
=======
=======
>>>>>>> a377061090 (GEOMESA-3100 Kafka layer views (#2784))
=======
>>>>>>> 4d37d5ef5 (GEOMESA-3100 Kafka layer views (#2784))
<<<<<<< HEAD
>>>>>>> e7bfe001dd (GEOMESA-3100 Kafka layer views (#2784))
=======
=======
>>>>>>> 3be8d2a5a (Merge branch 'feature/postgis-fixes')
<<<<<<< HEAD
<<<<<<< HEAD
<<<<<<< HEAD
>>>>>>> 1b25d7ddb4 (Merge branch 'feature/postgis-fixes')
=======
=======
>>>>>>> e944f1c88b (Merge branch 'feature/postgis-fixes')
=======
>>>>>>> eddb4eaca1 (GEOMESA-3100 Kafka layer views (#2784))
=======
>>>>>>> af0a88eb1 (GEOMESA-3100 Kafka layer views (#2784))
>>>>>>> eecabb92a (GEOMESA-3100 Kafka layer views (#2784))
<<<<<<< HEAD
>>>>>>> 98e7bf59d2 (GEOMESA-3100 Kafka layer views (#2784))
=======
=======
>>>>>>> e1f939a3e (GEOMESA-3100 Kafka layer views (#2784))
<<<<<<< HEAD
>>>>>>> f3ae53295d (GEOMESA-3100 Kafka layer views (#2784))
=======
=======
>>>>>>> af0a88eb1 (GEOMESA-3100 Kafka layer views (#2784))
<<<<<<< HEAD
=======
>>>>>>> af0a88eb1 (GEOMESA-3100 Kafka layer views (#2784))
>>>>>>> 95c83ca7f (GEOMESA-3100 Kafka layer views (#2784))
>>>>>>> 65a3a6e36 (GEOMESA-3100 Kafka layer views (#2784))
<<<<<<< HEAD
>>>>>>> 9e910620b3 (GEOMESA-3100 Kafka layer views (#2784))
=======
=======
>>>>>>> 42549e8e3 (GEOMESA-3100 Kafka layer views (#2784))
<<<<<<< HEAD
>>>>>>> a377061090 (GEOMESA-3100 Kafka layer views (#2784))
=======
=======
>>>>>>> e8cc4971c6 (Merge branch 'feature/postgis-fixes')
<<<<<<< HEAD
>>>>>>> e944f1c88b (Merge branch 'feature/postgis-fixes')
=======
=======
=======
>>>>>>> af0a88eb1 (GEOMESA-3100 Kafka layer views (#2784))
>>>>>>> a0314fb7f (GEOMESA-3100 Kafka layer views (#2784))
<<<<<<< HEAD
>>>>>>> 8ed2c9f7e5 (GEOMESA-3100 Kafka layer views (#2784))
<<<<<<< HEAD
>>>>>>> eddb4eaca1 (GEOMESA-3100 Kafka layer views (#2784))
=======
=======
=======
>>>>>>> 9bda77cfe (GEOMESA-3100 Kafka layer views (#2784))
<<<<<<< HEAD
>>>>>>> 06956ccf98 (GEOMESA-3100 Kafka layer views (#2784))
<<<<<<< HEAD
>>>>>>> 814854c5db (GEOMESA-3100 Kafka layer views (#2784))
=======
=======
=======
>>>>>>> af0a88eb1 (GEOMESA-3100 Kafka layer views (#2784))
<<<<<<< HEAD
<<<<<<< HEAD
=======
>>>>>>> af0a88eb1 (GEOMESA-3100 Kafka layer views (#2784))
>>>>>>> 95c83ca7f (GEOMESA-3100 Kafka layer views (#2784))
<<<<<<< HEAD
>>>>>>> 4231e686d (GEOMESA-3100 Kafka layer views (#2784))
<<<<<<< HEAD
>>>>>>> 69e3273ac1 (GEOMESA-3100 Kafka layer views (#2784))
<<<<<<< HEAD
>>>>>>> 3977ecc140 (GEOMESA-3100 Kafka layer views (#2784))
=======
=======
=======
=======
>>>>>>> 890b70c86 (GEOMESA-3100 Kafka layer views (#2784))
>>>>>>> 8347f5d27 (GEOMESA-3100 Kafka layer views (#2784))
>>>>>>> 17d152a893 (GEOMESA-3100 Kafka layer views (#2784))
>>>>>>> 7691783a57 (GEOMESA-3100 Kafka layer views (#2784))
    }
    val producer = getTransactionalProducer(sft, transaction)
=======
=======
    }
<<<<<<< HEAD
    val producer = getTransactionalProducer(transaction)
>>>>>>> 890b70c86 (GEOMESA-3100 Kafka layer views (#2784))
=======
    val producer = getTransactionalProducer(sft, transaction)
>>>>>>> d657014c8 (GEOMESA-3198 Kafka streams integration (#2854))
=======
=======
    }
    val producer = getTransactionalProducer(transaction)
>>>>>>> 4d37d5ef5 (GEOMESA-3100 Kafka layer views (#2784))
    val vis = sft.isVisibilityRequired
    val writer = filter match {
      case None if vis    => new AppendKafkaFeatureWriter(sft, producer, config.serialization) with RequiredVisibilityWriter
      case None           => new AppendKafkaFeatureWriter(sft, producer, config.serialization)
      case Some(f) if vis => new ModifyKafkaFeatureWriter(sft, producer, config.serialization, f) with RequiredVisibilityWriter
      case Some(f)        => new ModifyKafkaFeatureWriter(sft, producer, config.serialization, f)
    }
<<<<<<< HEAD
    if (config.clearOnStart && cleared.add(sft.getTypeName)) {
<<<<<<< HEAD
<<<<<<< HEAD
<<<<<<< HEAD
<<<<<<< HEAD
=======
>>>>>>> eecabb92a (GEOMESA-3100 Kafka layer views (#2784))
=======
>>>>>>> e8cc4971c6 (Merge branch 'feature/postgis-fixes')
=======
=======
>>>>>>> a0314fb7f (GEOMESA-3100 Kafka layer views (#2784))
>>>>>>> 8ed2c9f7e5 (GEOMESA-3100 Kafka layer views (#2784))
=======
    writer
  }

  override def getFeatureWriterAppend(typeName: String, transaction: Transaction): KafkaFeatureWriter = {
    val sft = getSchema(typeName)
    if (sft == null) {
      throw new IOException(s"Schema '$typeName' has not been initialized. Please call 'createSchema' first.")
    } else if (layerViewLookup.contains(typeName)) {
      throw new IllegalArgumentException(s"Schema '$typeName' is a read-only view of '${layerViewLookup(typeName)}'")
    }
    val producer = getTransactionalProducer(transaction)
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
>>>>>>> f7038468b (GEOMESA-3100 Kafka layer views (#2784))
<<<<<<< HEAD
>>>>>>> 9bda77cfe3 (GEOMESA-3100 Kafka layer views (#2784))
<<<<<<< HEAD
>>>>>>> 64da8137f1 (GEOMESA-3100 Kafka layer views (#2784))
=======
=======
=======
>>>>>>> bddfdbea5 (GEOMESA-3100 Kafka layer views (#2784))
<<<<<<< HEAD
>>>>>>> 862857ce2e (GEOMESA-3100 Kafka layer views (#2784))
<<<<<<< HEAD
>>>>>>> 6e453fd3d0 (GEOMESA-3100 Kafka layer views (#2784))
=======
=======
=======
>>>>>>> 95c83ca7f (GEOMESA-3100 Kafka layer views (#2784))
<<<<<<< HEAD
>>>>>>> 4231e686dd (GEOMESA-3100 Kafka layer views (#2784))
<<<<<<< HEAD
>>>>>>> d309fbbbbf (GEOMESA-3100 Kafka layer views (#2784))
=======
=======
=======
>>>>>>> f7038468b (GEOMESA-3100 Kafka layer views (#2784))
>>>>>>> 890b70c86 (GEOMESA-3100 Kafka layer views (#2784))
<<<<<<< HEAD
>>>>>>> 8347f5d271 (GEOMESA-3100 Kafka layer views (#2784))
<<<<<<< HEAD
>>>>>>> 77fda9e6a0 (GEOMESA-3100 Kafka layer views (#2784))
=======
=======
=======
>>>>>>> f7038468b (GEOMESA-3100 Kafka layer views (#2784))
=======
>>>>>>> bddfdbea5 (GEOMESA-3100 Kafka layer views (#2784))
>>>>>>> 2f6607232 (GEOMESA-3100 Kafka layer views (#2784))
<<<<<<< HEAD
>>>>>>> a62b956fb6 (GEOMESA-3100 Kafka layer views (#2784))
<<<<<<< HEAD
>>>>>>> bbc8576d19 (GEOMESA-3100 Kafka layer views (#2784))
=======
=======
=======
>>>>>>> d2cb939f5 (GEOMESA-3100 Kafka layer views (#2784))
<<<<<<< HEAD
>>>>>>> 6af71ff432 (GEOMESA-3100 Kafka layer views (#2784))
<<<<<<< HEAD
>>>>>>> 885048dd7d (GEOMESA-3100 Kafka layer views (#2784))
=======
=======
=======
>>>>>>> f7038468b (GEOMESA-3100 Kafka layer views (#2784))
>>>>>>> 4d37d5ef5 (GEOMESA-3100 Kafka layer views (#2784))
>>>>>>> b4c6267f1c (GEOMESA-3100 Kafka layer views (#2784))
<<<<<<< HEAD
>>>>>>> e8dd13fa26 (GEOMESA-3100 Kafka layer views (#2784))
=======
=======
>>>>>>> 17f13b3a7a (GEOMESA-3100 Kafka layer views (#2784))
<<<<<<< HEAD
>>>>>>> 3010fc384e (GEOMESA-3100 Kafka layer views (#2784))
=======
=======
=======
>>>>>>> fa68dd43c6 (GEOMESA-3100 Kafka layer views (#2784))
=======
>>>>>>> 0fde036fa7 (GEOMESA-3100 Kafka layer views (#2784))
=======
>>>>>>> 89fb9950ef (GEOMESA-3100 Kafka layer views (#2784))
=======
>>>>>>> e7bfe001dd (GEOMESA-3100 Kafka layer views (#2784))
=======
>>>>>>> 98e7bf59d2 (GEOMESA-3100 Kafka layer views (#2784))
=======
=======
>>>>>>> eddb4eaca1 (GEOMESA-3100 Kafka layer views (#2784))
=======
>>>>>>> 42549e8e3 (GEOMESA-3100 Kafka layer views (#2784))
>>>>>>> a377061090 (GEOMESA-3100 Kafka layer views (#2784))
=======
>>>>>>> 8ed2c9f7e5 (GEOMESA-3100 Kafka layer views (#2784))
=======
=======
>>>>>>> af0a88eb1 (GEOMESA-3100 Kafka layer views (#2784))
>>>>>>> d0dc799ff (GEOMESA-3100 Kafka layer views (#2784))
=======
<<<<<<< HEAD
>>>>>>> af0a88eb1 (GEOMESA-3100 Kafka layer views (#2784))
>>>>>>> d0dc799ff (GEOMESA-3100 Kafka layer views (#2784))
=======
=======
>>>>>>> 936154130 (GEOMESA-3100 Kafka layer views (#2784))
<<<<<<< HEAD
>>>>>>> af0a88eb1 (GEOMESA-3100 Kafka layer views (#2784))
>>>>>>> d0dc799ff (GEOMESA-3100 Kafka layer views (#2784))
=======
=======
>>>>>>> 936154130 (GEOMESA-3100 Kafka layer views (#2784))
<<<<<<< HEAD
<<<<<<< HEAD
=======
>>>>>>> af0a88eb1 (GEOMESA-3100 Kafka layer views (#2784))
>>>>>>> locationtech-main
=======
>>>>>>> af0a88eb1 (GEOMESA-3100 Kafka layer views (#2784))
>>>>>>> 58286bfd3 (GEOMESA-3100 Kafka layer views (#2784))
>>>>>>> 5ca0cd6de (GEOMESA-3100 Kafka layer views (#2784))
<<<<<<< HEAD
<<<<<<< HEAD
<<<<<<< HEAD
<<<<<<< HEAD
<<<<<<< HEAD
<<<<<<< HEAD
<<<<<<< HEAD
=======
>>>>>>> ea3b40e18 (GEOMESA-3100 Kafka layer views (#2784))
=======
>>>>>>> 429ffc55e (GEOMESA-3100 Kafka layer views (#2784))
=======
>>>>>>> e7f3e6588 (GEOMESA-3100 Kafka layer views (#2784))
=======
=======
>>>>>>> ea3b40e18 (GEOMESA-3100 Kafka layer views (#2784))
>>>>>>> 6f6887eb8 (GEOMESA-3100 Kafka layer views (#2784))
=======
>>>>>>> af0a88eb1 (GEOMESA-3100 Kafka layer views (#2784))
>>>>>>> bddfdbea5 (GEOMESA-3100 Kafka layer views (#2784))
=======
>>>>>>> d0dc799ff (GEOMESA-3100 Kafka layer views (#2784))
<<<<<<< HEAD
<<<<<<< HEAD
<<<<<<< HEAD
=======
>>>>>>> 6f6887eb8 (GEOMESA-3100 Kafka layer views (#2784))
=======
>>>>>>> 936154130 (GEOMESA-3100 Kafka layer views (#2784))
=======
=======
>>>>>>> af0a88eb1 (GEOMESA-3100 Kafka layer views (#2784))
>>>>>>> bddfdbea5 (GEOMESA-3100 Kafka layer views (#2784))
>>>>>>> 2f6607232 (GEOMESA-3100 Kafka layer views (#2784))
<<<<<<< HEAD
<<<<<<< HEAD
=======
>>>>>>> ea3b40e18 (GEOMESA-3100 Kafka layer views (#2784))
<<<<<<< HEAD
<<<<<<< HEAD
=======
=======
>>>>>>> 936154130 (GEOMESA-3100 Kafka layer views (#2784))
>>>>>>> 429ffc55e (GEOMESA-3100 Kafka layer views (#2784))
=======
>>>>>>> e7f3e6588 (GEOMESA-3100 Kafka layer views (#2784))
=======
=======
>>>>>>> ea3b40e18 (GEOMESA-3100 Kafka layer views (#2784))
>>>>>>> 6f6887eb8 (GEOMESA-3100 Kafka layer views (#2784))
=======
<<<<<<< HEAD
=======
=======
>>>>>>> af0a88eb1 (GEOMESA-3100 Kafka layer views (#2784))
>>>>>>> d2cb939f5 (GEOMESA-3100 Kafka layer views (#2784))
=======
>>>>>>> 3be8d2a5a (Merge branch 'feature/postgis-fixes')
=======
=======
>>>>>>> d2002b5af (GEOMESA-3100 Kafka layer views (#2784))
  override private[geomesa] def getFeatureReader(
=======
<<<<<<< HEAD
  private[geomesa] def getFeatureReader(
>>>>>>> f7038468b (GEOMESA-3100 Kafka layer views (#2784))
      sft: SimpleFeatureType,
      transaction: Transaction,
      query: Query): GeoMesaFeatureReader = {
<<<<<<< HEAD
>>>>>>> d845d7c1b (GEOMESA-3254 Add Bloop build support)
=======
=======
  override def getFeatureReader(query: Query, transaction: Transaction): SimpleFeatureReader = {
    val sft = getSchema(query.getTypeName)
    if (sft == null) {
      throw new IOException(s"Schema '${query.getTypeName}' has not been initialized. Please call 'createSchema' first.")
    }
>>>>>>> af0a88eb1 (GEOMESA-3100 Kafka layer views (#2784))
>>>>>>> d2002b5af (GEOMESA-3100 Kafka layer views (#2784))
=======
=======
>>>>>>> af0a88eb1 (GEOMESA-3100 Kafka layer views (#2784))
>>>>>>> d2cb939f5 (GEOMESA-3100 Kafka layer views (#2784))
>>>>>>> 89fb9950e (GEOMESA-3100 Kafka layer views (#2784))
    // kick off the kafka consumers for this sft, if not already started
    caches.get(layerViewLookup.getOrElse(query.getTypeName, query.getTypeName))
    GeoMesaFeatureReader(sft, query, runner, config.audit)
  }

<<<<<<< HEAD
  override private[geomesa] def getFeatureWriter(
      sft: SimpleFeatureType,
      transaction: Transaction,
      filter: Option[Filter]): FlushableFeatureWriter = {
    if (layerViewLookup.contains(sft.getTypeName)) {
      throw new IllegalArgumentException(
        s"Schema '${sft.getTypeName}' is a read-only view of '${layerViewLookup(sft.getTypeName)}'")
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
=======
=======
>>>>>>> 17f13b3a7 (GEOMESA-3100 Kafka layer views (#2784))
=======
>>>>>>> d2002b5af (GEOMESA-3100 Kafka layer views (#2784))
=======
>>>>>>> c589b832a (GEOMESA-3100 Kafka layer views (#2784))
=======
>>>>>>> fa68dd43c (GEOMESA-3100 Kafka layer views (#2784))
=======
>>>>>>> 89fb9950e (GEOMESA-3100 Kafka layer views (#2784))
    new KafkaFeatureStore(this, sft, runner, cache(typeName))
  }

  override def getFeatureReader(query: Query, transaction: Transaction): SimpleFeatureReader = {
    val sft = getSchema(query.getTypeName)
    if (sft == null) {
      throw new IOException(s"Schema '${query.getTypeName}' has not been initialized. Please call 'createSchema' first.")
    }
    // kick off the kafka consumers for this sft, if not already started
    caches.get(layerViewLookup.getOrElse(query.getTypeName, query.getTypeName))
    GeoMesaFeatureReader(sft, query, runner, None, config.audit)
  }

<<<<<<< HEAD
<<<<<<< HEAD
=======
>>>>>>> f7038468b (GEOMESA-3100 Kafka layer views (#2784))
=======
>>>>>>> bddfdbea5 (GEOMESA-3100 Kafka layer views (#2784))
<<<<<<< HEAD
<<<<<<< HEAD
=======
>>>>>>> 95c83ca7f (GEOMESA-3100 Kafka layer views (#2784))
=======
>>>>>>> d2cb939f5 (GEOMESA-3100 Kafka layer views (#2784))
<<<<<<< HEAD
=======
>>>>>>> 17f13b3a7 (GEOMESA-3100 Kafka layer views (#2784))
=======
=======
>>>>>>> f7038468b (GEOMESA-3100 Kafka layer views (#2784))
>>>>>>> d2002b5af (GEOMESA-3100 Kafka layer views (#2784))
=======
>>>>>>> c589b832a (GEOMESA-3100 Kafka layer views (#2784))
=======
=======
>>>>>>> 95c83ca7f (GEOMESA-3100 Kafka layer views (#2784))
>>>>>>> fa68dd43c (GEOMESA-3100 Kafka layer views (#2784))
=======
>>>>>>> 89fb9950e (GEOMESA-3100 Kafka layer views (#2784))
  override def getFeatureWriter(typeName: String, filter: Filter, transaction: Transaction): KafkaFeatureWriter = {
    val sft = getSchema(typeName)
    if (sft == null) {
      throw new IOException(s"Schema '$typeName' has not been initialized. Please call 'createSchema' first.")
    } else if (layerViewLookup.contains(typeName)) {
      throw new IllegalArgumentException(s"Schema '$typeName' is a read-only view of '${layerViewLookup(typeName)}'")
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
>>>>>>> c57b5f538 (GEOMESA-3100 Kafka layer views (#2784))
=======
>>>>>>> 88ef67cdf (GEOMESA-3100 Kafka layer views (#2784))
=======
>>>>>>> 89fb9950e (GEOMESA-3100 Kafka layer views (#2784))
=======
>>>>>>> 936154130 (GEOMESA-3100 Kafka layer views (#2784))
=======
>>>>>>> 2f6607232 (GEOMESA-3100 Kafka layer views (#2784))
<<<<<<< HEAD
<<<<<<< HEAD
=======
>>>>>>> ea3b40e18 (GEOMESA-3100 Kafka layer views (#2784))
=======
>>>>>>> f6e840b5d (GEOMESA-3100 Kafka layer views (#2784))
=======
>>>>>>> c589b832a (GEOMESA-3100 Kafka layer views (#2784))
=======
>>>>>>> ffbc2ce32 (GEOMESA-3100 Kafka layer views (#2784))
=======
=======
>>>>>>> 936154130 (GEOMESA-3100 Kafka layer views (#2784))
>>>>>>> 54ece16d1 (GEOMESA-3100 Kafka layer views (#2784))
=======
>>>>>>> c57b5f538 (GEOMESA-3100 Kafka layer views (#2784))
=======
=======
>>>>>>> ea3b40e18 (GEOMESA-3100 Kafka layer views (#2784))
>>>>>>> 88ef67cdf (GEOMESA-3100 Kafka layer views (#2784))
>>>>>>> af0a88eb1 (GEOMESA-3100 Kafka layer views (#2784))
<<<<<<< HEAD
<<<<<<< HEAD
<<<<<<< HEAD
<<<<<<< HEAD
<<<<<<< HEAD
=======
>>>>>>> e7bfe001d (GEOMESA-3100 Kafka layer views (#2784))
=======
>>>>>>> af0a88eb1 (GEOMESA-3100 Kafka layer views (#2784))
>>>>>>> 95c83ca7f (GEOMESA-3100 Kafka layer views (#2784))
=======
>>>>>>> 890b70c86 (GEOMESA-3100 Kafka layer views (#2784))
=======
>>>>>>> af0a88eb1 (GEOMESA-3100 Kafka layer views (#2784))
>>>>>>> d2cb939f5 (GEOMESA-3100 Kafka layer views (#2784))
<<<<<<< HEAD
<<<<<<< HEAD
<<<<<<< HEAD
>>>>>>> 6af71ff43 (GEOMESA-3100 Kafka layer views (#2784))
<<<<<<< HEAD
>>>>>>> 23a7d9849f (GEOMESA-3100 Kafka layer views (#2784))
=======
=======
=======
>>>>>>> 4d37d5ef5 (GEOMESA-3100 Kafka layer views (#2784))
<<<<<<< HEAD
>>>>>>> b4c6267f1 (GEOMESA-3100 Kafka layer views (#2784))
<<<<<<< HEAD
>>>>>>> dc84900201 (GEOMESA-3100 Kafka layer views (#2784))
=======
=======
=======
>>>>>>> 3be8d2a5a (Merge branch 'feature/postgis-fixes')
>>>>>>> db8d998aa (Merge branch 'feature/postgis-fixes')
<<<<<<< HEAD
>>>>>>> cb6bda89b6 (Merge branch 'feature/postgis-fixes')
=======
=======
>>>>>>> d845d7c1b (GEOMESA-3254 Add Bloop build support)
<<<<<<< HEAD
>>>>>>> 09d87762c5 (GEOMESA-3254 Add Bloop build support)
=======
=======
>>>>>>> af0a88eb1 (GEOMESA-3100 Kafka layer views (#2784))
>>>>>>> 17f13b3a7 (GEOMESA-3100 Kafka layer views (#2784))
<<<<<<< HEAD
>>>>>>> 6069aba6b4 (GEOMESA-3100 Kafka layer views (#2784))
=======
=======
>>>>>>> d2002b5af (GEOMESA-3100 Kafka layer views (#2784))
<<<<<<< HEAD
>>>>>>> d5f6f5af59 (GEOMESA-3100 Kafka layer views (#2784))
=======
=======
>>>>>>> af0a88eb1 (GEOMESA-3100 Kafka layer views (#2784))
<<<<<<< HEAD
<<<<<<< HEAD
=======
>>>>>>> af0a88eb1 (GEOMESA-3100 Kafka layer views (#2784))
>>>>>>> 95c83ca7f (GEOMESA-3100 Kafka layer views (#2784))
<<<<<<< HEAD
>>>>>>> fa68dd43c (GEOMESA-3100 Kafka layer views (#2784))
<<<<<<< HEAD
>>>>>>> 23f312535d (GEOMESA-3100 Kafka layer views (#2784))
=======
=======
=======
>>>>>>> 890b70c86 (GEOMESA-3100 Kafka layer views (#2784))
>>>>>>> 0fde036fa (GEOMESA-3100 Kafka layer views (#2784))
<<<<<<< HEAD
>>>>>>> 4f05dea44b (GEOMESA-3100 Kafka layer views (#2784))
=======
=======
>>>>>>> 89fb9950e (GEOMESA-3100 Kafka layer views (#2784))
<<<<<<< HEAD
>>>>>>> bc97b07a31 (GEOMESA-3100 Kafka layer views (#2784))
=======
=======
=======
>>>>>>> 4d37d5ef5 (GEOMESA-3100 Kafka layer views (#2784))
>>>>>>> e7bfe001d (GEOMESA-3100 Kafka layer views (#2784))
>>>>>>> a09ef82d36 (GEOMESA-3100 Kafka layer views (#2784))
    }
    val producer = getTransactionalProducer(sft, transaction)
=======
=======
    }
<<<<<<< HEAD
    val producer = getTransactionalProducer(transaction)
>>>>>>> 890b70c86 (GEOMESA-3100 Kafka layer views (#2784))
=======
    val producer = getTransactionalProducer(sft, transaction)
>>>>>>> d657014c8 (GEOMESA-3198 Kafka streams integration (#2854))
=======
=======
    }
    val producer = getTransactionalProducer(transaction)
>>>>>>> 4d37d5ef5 (GEOMESA-3100 Kafka layer views (#2784))
    val vis = sft.isVisibilityRequired
<<<<<<< HEAD
=======
    val serializer = serialization.apply(sft)
>>>>>>> 58d14a257 (GEOMESA-3254 Add Bloop build support)
    val writer = filter match {
      case None if vis    => new AppendKafkaFeatureWriter(sft, producer, config.serialization) with RequiredVisibilityWriter
      case None           => new AppendKafkaFeatureWriter(sft, producer, config.serialization)
      case Some(f) if vis => new ModifyKafkaFeatureWriter(sft, producer, config.serialization, f) with RequiredVisibilityWriter
      case Some(f)        => new ModifyKafkaFeatureWriter(sft, producer, config.serialization, f)
    }
<<<<<<< HEAD
    if (config.clearOnStart && cleared.add(sft.getTypeName)) {
<<<<<<< HEAD
<<<<<<< HEAD
<<<<<<< HEAD
=======
>>>>>>> 17f13b3a7 (GEOMESA-3100 Kafka layer views (#2784))
=======
    writer
  }

  override def getFeatureWriterAppend(typeName: String, transaction: Transaction): KafkaFeatureWriter = {
    val sft = getSchema(typeName)
    if (sft == null) {
      throw new IOException(s"Schema '$typeName' has not been initialized. Please call 'createSchema' first.")
    } else if (layerViewLookup.contains(typeName)) {
      throw new IllegalArgumentException(s"Schema '$typeName' is a read-only view of '${layerViewLookup(typeName)}'")
    }
    val producer = getTransactionalProducer(transaction)
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
>>>>>>> e7f3e6588 (GEOMESA-3100 Kafka layer views (#2784))
=======
>>>>>>> 06956ccf98 (GEOMESA-3100 Kafka layer views (#2784))
=======
>>>>>>> 69e3273ac1 (GEOMESA-3100 Kafka layer views (#2784))
=======
>>>>>>> 17d152a893 (GEOMESA-3100 Kafka layer views (#2784))
=======
>>>>>>> 23a7d9849f (GEOMESA-3100 Kafka layer views (#2784))
=======
>>>>>>> dc84900201 (GEOMESA-3100 Kafka layer views (#2784))
=======
>>>>>>> 6069aba6b4 (GEOMESA-3100 Kafka layer views (#2784))
>>>>>>> f7038468b (GEOMESA-3100 Kafka layer views (#2784))
<<<<<<< HEAD
>>>>>>> d2002b5afd (GEOMESA-3100 Kafka layer views (#2784))
<<<<<<< HEAD
>>>>>>> 66bdd8fd8d (GEOMESA-3100 Kafka layer views (#2784))
=======
=======
=======
>>>>>>> bddfdbea5 (GEOMESA-3100 Kafka layer views (#2784))
<<<<<<< HEAD
>>>>>>> c589b832a5 (GEOMESA-3100 Kafka layer views (#2784))
<<<<<<< HEAD
>>>>>>> 92dc7a8411 (GEOMESA-3100 Kafka layer views (#2784))
=======
=======
=======
>>>>>>> 95c83ca7f (GEOMESA-3100 Kafka layer views (#2784))
<<<<<<< HEAD
>>>>>>> fa68dd43c6 (GEOMESA-3100 Kafka layer views (#2784))
<<<<<<< HEAD
>>>>>>> de8804123e (GEOMESA-3100 Kafka layer views (#2784))
=======
=======
=======
>>>>>>> f7038468b (GEOMESA-3100 Kafka layer views (#2784))
>>>>>>> 890b70c86 (GEOMESA-3100 Kafka layer views (#2784))
<<<<<<< HEAD
>>>>>>> 0fde036fa7 (GEOMESA-3100 Kafka layer views (#2784))
<<<<<<< HEAD
>>>>>>> 44b3849076 (GEOMESA-3100 Kafka layer views (#2784))
=======
=======
=======
>>>>>>> f7038468b (GEOMESA-3100 Kafka layer views (#2784))
=======
>>>>>>> bddfdbea5 (GEOMESA-3100 Kafka layer views (#2784))
>>>>>>> 2f6607232 (GEOMESA-3100 Kafka layer views (#2784))
<<<<<<< HEAD
<<<<<<< HEAD
<<<<<<< HEAD
>>>>>>> c57b5f538a (GEOMESA-3100 Kafka layer views (#2784))
<<<<<<< HEAD
>>>>>>> c44e474495 (GEOMESA-3100 Kafka layer views (#2784))
=======
=======
=======
>>>>>>> 3ebcdb99d9 (GEOMESA-3100 Kafka layer views (#2784))
=======
>>>>>>> a377061090 (GEOMESA-3100 Kafka layer views (#2784))
=======
>>>>>>> d2cb939f5 (GEOMESA-3100 Kafka layer views (#2784))
<<<<<<< HEAD
>>>>>>> 89fb9950ef (GEOMESA-3100 Kafka layer views (#2784))
<<<<<<< HEAD
>>>>>>> 117b13aaaa (GEOMESA-3100 Kafka layer views (#2784))
=======
=======
=======
>>>>>>> f7038468b (GEOMESA-3100 Kafka layer views (#2784))
>>>>>>> 4d37d5ef5 (GEOMESA-3100 Kafka layer views (#2784))
<<<<<<< HEAD
>>>>>>> e7bfe001dd (GEOMESA-3100 Kafka layer views (#2784))
<<<<<<< HEAD
>>>>>>> c1bc2bba7f (GEOMESA-3100 Kafka layer views (#2784))
=======
=======
=======
<<<<<<< HEAD
>>>>>>> eecabb92a (GEOMESA-3100 Kafka layer views (#2784))
<<<<<<< HEAD
>>>>>>> 98e7bf59d2 (GEOMESA-3100 Kafka layer views (#2784))
<<<<<<< HEAD
>>>>>>> cf457d8543 (GEOMESA-3100 Kafka layer views (#2784))
=======
=======
=======
=======
>>>>>>> 65a3a6e36 (GEOMESA-3100 Kafka layer views (#2784))
=======
=======
>>>>>>> af0a88eb1 (GEOMESA-3100 Kafka layer views (#2784))
>>>>>>> d0dc799ff (GEOMESA-3100 Kafka layer views (#2784))
=======
<<<<<<< HEAD
<<<<<<< HEAD
=======
>>>>>>> af0a88eb1 (GEOMESA-3100 Kafka layer views (#2784))
>>>>>>> locationtech-main
=======
>>>>>>> af0a88eb1 (GEOMESA-3100 Kafka layer views (#2784))
>>>>>>> 58286bfd3 (GEOMESA-3100 Kafka layer views (#2784))
>>>>>>> 5ca0cd6de (GEOMESA-3100 Kafka layer views (#2784))
<<<<<<< HEAD
=======
>>>>>>> af0a88eb1 (GEOMESA-3100 Kafka layer views (#2784))
>>>>>>> bddfdbea5 (GEOMESA-3100 Kafka layer views (#2784))
=======
>>>>>>> d0dc799ff (GEOMESA-3100 Kafka layer views (#2784))
    }
    val producer = getTransactionalProducer(sft, transaction)
    val vis = sft.isVisibilityRequired
    val writer = filter match {
      case None if vis    => new AppendKafkaFeatureWriter(sft, producer, config.serialization) with RequiredVisibilityWriter
      case None           => new AppendKafkaFeatureWriter(sft, producer, config.serialization)
      case Some(f) if vis => new ModifyKafkaFeatureWriter(sft, producer, config.serialization, f) with RequiredVisibilityWriter
      case Some(f)        => new ModifyKafkaFeatureWriter(sft, producer, config.serialization, f)
    }
<<<<<<< HEAD
    if (config.clearOnStart && cleared.add(sft.getTypeName)) {
=======
    writer
  }

  override def getFeatureWriterAppend(typeName: String, transaction: Transaction): KafkaFeatureWriter = {
    val sft = getSchema(typeName)
    if (sft == null) {
      throw new IOException(s"Schema '$typeName' has not been initialized. Please call 'createSchema' first.")
    } else if (layerViewLookup.contains(typeName)) {
      throw new IllegalArgumentException(s"Schema '$typeName' is a read-only view of '${layerViewLookup(typeName)}'")
    }
    val producer = getTransactionalProducer(transaction)
<<<<<<< HEAD
>>>>>>> f7038468b (GEOMESA-3100 Kafka layer views (#2784))
<<<<<<< HEAD
>>>>>>> e1f939a3e (GEOMESA-3100 Kafka layer views (#2784))
<<<<<<< HEAD
>>>>>>> f3ae53295d (GEOMESA-3100 Kafka layer views (#2784))
<<<<<<< HEAD
>>>>>>> a94a1be83c (GEOMESA-3100 Kafka layer views (#2784))
=======
=======
=======
=======
>>>>>>> bddfdbea5 (GEOMESA-3100 Kafka layer views (#2784))
<<<<<<< HEAD
>>>>>>> 1a5f68233 (GEOMESA-3100 Kafka layer views (#2784))
<<<<<<< HEAD
>>>>>>> dae1cf3cef (GEOMESA-3100 Kafka layer views (#2784))
<<<<<<< HEAD
>>>>>>> c61bffed00 (GEOMESA-3100 Kafka layer views (#2784))
=======
=======
=======
=======
>>>>>>> 95c83ca7f (GEOMESA-3100 Kafka layer views (#2784))
>>>>>>> 65a3a6e36 (GEOMESA-3100 Kafka layer views (#2784))
<<<<<<< HEAD
>>>>>>> 9e910620b3 (GEOMESA-3100 Kafka layer views (#2784))
<<<<<<< HEAD
>>>>>>> 89f0c9f2c3 (GEOMESA-3100 Kafka layer views (#2784))
=======
=======
=======
>>>>>>> e7f3e6588 (GEOMESA-3100 Kafka layer views (#2784))
<<<<<<< HEAD
>>>>>>> 3ebcdb99d9 (GEOMESA-3100 Kafka layer views (#2784))
<<<<<<< HEAD
>>>>>>> 4f4ecaeb43 (GEOMESA-3100 Kafka layer views (#2784))
=======
=======
=======
=======
>>>>>>> d2cb939f5 (GEOMESA-3100 Kafka layer views (#2784))
>>>>>>> 42549e8e3 (GEOMESA-3100 Kafka layer views (#2784))
<<<<<<< HEAD
>>>>>>> a377061090 (GEOMESA-3100 Kafka layer views (#2784))
<<<<<<< HEAD
>>>>>>> 750ebbabe7 (GEOMESA-3100 Kafka layer views (#2784))
=======
=======
=======
>>>>>>> a0314fb7f (GEOMESA-3100 Kafka layer views (#2784))
<<<<<<< HEAD
>>>>>>> 8ed2c9f7e5 (GEOMESA-3100 Kafka layer views (#2784))
<<<<<<< HEAD
>>>>>>> eddb4eaca1 (GEOMESA-3100 Kafka layer views (#2784))
<<<<<<< HEAD
>>>>>>> fc4546247e (GEOMESA-3100 Kafka layer views (#2784))
=======
=======
=======
=======
=======
>>>>>>> 4231e686d (GEOMESA-3100 Kafka layer views (#2784))
=======
>>>>>>> 8347f5d27 (GEOMESA-3100 Kafka layer views (#2784))
=======
>>>>>>> 6af71ff43 (GEOMESA-3100 Kafka layer views (#2784))
=======
>>>>>>> b4c6267f1 (GEOMESA-3100 Kafka layer views (#2784))
=======
=======
>>>>>>> af0a88eb1 (GEOMESA-3100 Kafka layer views (#2784))
>>>>>>> d0dc799ff (GEOMESA-3100 Kafka layer views (#2784))
=======
<<<<<<< HEAD
>>>>>>> af0a88eb1 (GEOMESA-3100 Kafka layer views (#2784))
>>>>>>> d0dc799ff (GEOMESA-3100 Kafka layer views (#2784))
=======
=======
>>>>>>> 936154130 (GEOMESA-3100 Kafka layer views (#2784))
<<<<<<< HEAD
<<<<<<< HEAD
=======
>>>>>>> af0a88eb1 (GEOMESA-3100 Kafka layer views (#2784))
>>>>>>> locationtech-main
=======
>>>>>>> af0a88eb1 (GEOMESA-3100 Kafka layer views (#2784))
>>>>>>> 58286bfd3 (GEOMESA-3100 Kafka layer views (#2784))
>>>>>>> 5ca0cd6de (GEOMESA-3100 Kafka layer views (#2784))
<<<<<<< HEAD
<<<<<<< HEAD
<<<<<<< HEAD
<<<<<<< HEAD
=======
>>>>>>> ea3b40e18 (GEOMESA-3100 Kafka layer views (#2784))
=======
>>>>>>> af0a88eb1 (GEOMESA-3100 Kafka layer views (#2784))
>>>>>>> bddfdbea5 (GEOMESA-3100 Kafka layer views (#2784))
=======
>>>>>>> d0dc799ff (GEOMESA-3100 Kafka layer views (#2784))
<<<<<<< HEAD
=======
>>>>>>> 936154130 (GEOMESA-3100 Kafka layer views (#2784))
=======
=======
>>>>>>> af0a88eb1 (GEOMESA-3100 Kafka layer views (#2784))
>>>>>>> bddfdbea5 (GEOMESA-3100 Kafka layer views (#2784))
>>>>>>> 2f6607232 (GEOMESA-3100 Kafka layer views (#2784))
=======
>>>>>>> ea3b40e18 (GEOMESA-3100 Kafka layer views (#2784))
    }
    val producer = getTransactionalProducer(sft, transaction)
=======
=======
    }
<<<<<<< HEAD
    val producer = getTransactionalProducer(transaction)
>>>>>>> 890b70c86 (GEOMESA-3100 Kafka layer views (#2784))
=======
    val producer = getTransactionalProducer(sft, transaction)
>>>>>>> d657014c8 (GEOMESA-3198 Kafka streams integration (#2854))
=======
=======
    }
    val producer = getTransactionalProducer(transaction)
>>>>>>> 4d37d5ef5 (GEOMESA-3100 Kafka layer views (#2784))
    val vis = sft.isVisibilityRequired
    val writer = filter match {
      case None if vis    => new AppendKafkaFeatureWriter(sft, producer, config.serialization) with RequiredVisibilityWriter
      case None           => new AppendKafkaFeatureWriter(sft, producer, config.serialization)
      case Some(f) if vis => new ModifyKafkaFeatureWriter(sft, producer, config.serialization, f) with RequiredVisibilityWriter
      case Some(f)        => new ModifyKafkaFeatureWriter(sft, producer, config.serialization, f)
    }
<<<<<<< HEAD
    if (config.clearOnStart && cleared.add(sft.getTypeName)) {
=======
    writer
  }

  override def getFeatureWriterAppend(typeName: String, transaction: Transaction): KafkaFeatureWriter = {
    val sft = getSchema(typeName)
    if (sft == null) {
      throw new IOException(s"Schema '$typeName' has not been initialized. Please call 'createSchema' first.")
    } else if (layerViewLookup.contains(typeName)) {
      throw new IllegalArgumentException(s"Schema '$typeName' is a read-only view of '${layerViewLookup(typeName)}'")
    }
    val producer = getTransactionalProducer(transaction)
<<<<<<< HEAD
<<<<<<< HEAD
<<<<<<< HEAD
<<<<<<< HEAD
<<<<<<< HEAD
<<<<<<< HEAD
<<<<<<< HEAD
<<<<<<< HEAD
<<<<<<< HEAD
>>>>>>> f7038468b (GEOMESA-3100 Kafka layer views (#2784))
<<<<<<< HEAD
>>>>>>> 9bda77cfe (GEOMESA-3100 Kafka layer views (#2784))
<<<<<<< HEAD
>>>>>>> 06956ccf98 (GEOMESA-3100 Kafka layer views (#2784))
<<<<<<< HEAD
>>>>>>> 814854c5db (GEOMESA-3100 Kafka layer views (#2784))
<<<<<<< HEAD
>>>>>>> cc8b9d0320 (GEOMESA-3100 Kafka layer views (#2784))
=======
=======
=======
=======
=======
>>>>>>> bddfdbea5 (GEOMESA-3100 Kafka layer views (#2784))
<<<<<<< HEAD
>>>>>>> 862857ce2 (GEOMESA-3100 Kafka layer views (#2784))
<<<<<<< HEAD
>>>>>>> 8b9e99d11a (GEOMESA-3100 Kafka layer views (#2784))
<<<<<<< HEAD
>>>>>>> 7bdc1feea8 (GEOMESA-3100 Kafka layer views (#2784))
<<<<<<< HEAD
>>>>>>> c64e652363 (GEOMESA-3100 Kafka layer views (#2784))
=======
=======
=======
=======
=======
>>>>>>> 95c83ca7f (GEOMESA-3100 Kafka layer views (#2784))
<<<<<<< HEAD
>>>>>>> 4231e686d (GEOMESA-3100 Kafka layer views (#2784))
<<<<<<< HEAD
>>>>>>> 69e3273ac1 (GEOMESA-3100 Kafka layer views (#2784))
<<<<<<< HEAD
>>>>>>> 3977ecc140 (GEOMESA-3100 Kafka layer views (#2784))
<<<<<<< HEAD
>>>>>>> 43ac4062d9 (GEOMESA-3100 Kafka layer views (#2784))
=======
=======
=======
=======
=======
>>>>>>> f7038468b (GEOMESA-3100 Kafka layer views (#2784))
>>>>>>> 890b70c86 (GEOMESA-3100 Kafka layer views (#2784))
<<<<<<< HEAD
>>>>>>> 8347f5d27 (GEOMESA-3100 Kafka layer views (#2784))
<<<<<<< HEAD
>>>>>>> 17d152a893 (GEOMESA-3100 Kafka layer views (#2784))
<<<<<<< HEAD
>>>>>>> 7691783a57 (GEOMESA-3100 Kafka layer views (#2784))
<<<<<<< HEAD
>>>>>>> 14fb82f440 (GEOMESA-3100 Kafka layer views (#2784))
=======
=======
=======
=======
=======
>>>>>>> f7038468b (GEOMESA-3100 Kafka layer views (#2784))
=======
>>>>>>> bddfdbea5 (GEOMESA-3100 Kafka layer views (#2784))
>>>>>>> 2f6607232 (GEOMESA-3100 Kafka layer views (#2784))
<<<<<<< HEAD
>>>>>>> a62b956fb (GEOMESA-3100 Kafka layer views (#2784))
<<<<<<< HEAD
>>>>>>> e0773a1bd7 (GEOMESA-3100 Kafka layer views (#2784))
<<<<<<< HEAD
>>>>>>> 5d8c5baea0 (GEOMESA-3100 Kafka layer views (#2784))
<<<<<<< HEAD
>>>>>>> 121a1d3470 (GEOMESA-3100 Kafka layer views (#2784))
=======
=======
=======
=======
=======
>>>>>>> d2cb939f5 (GEOMESA-3100 Kafka layer views (#2784))
<<<<<<< HEAD
>>>>>>> 6af71ff43 (GEOMESA-3100 Kafka layer views (#2784))
<<<<<<< HEAD
>>>>>>> 23a7d9849f (GEOMESA-3100 Kafka layer views (#2784))
<<<<<<< HEAD
>>>>>>> 416a95a4c0 (GEOMESA-3100 Kafka layer views (#2784))
<<<<<<< HEAD
>>>>>>> 39d28fffcb (GEOMESA-3100 Kafka layer views (#2784))
=======
=======
=======
=======
=======
>>>>>>> f7038468b (GEOMESA-3100 Kafka layer views (#2784))
>>>>>>> 4d37d5ef5 (GEOMESA-3100 Kafka layer views (#2784))
>>>>>>> b4c6267f1 (GEOMESA-3100 Kafka layer views (#2784))
<<<<<<< HEAD
>>>>>>> dc84900201 (GEOMESA-3100 Kafka layer views (#2784))
<<<<<<< HEAD
>>>>>>> 4bc781ae0d (GEOMESA-3100 Kafka layer views (#2784))
<<<<<<< HEAD
>>>>>>> 357e15e582 (GEOMESA-3100 Kafka layer views (#2784))
=======
=======
=======
=======
>>>>>>> 17f13b3a7 (GEOMESA-3100 Kafka layer views (#2784))
<<<<<<< HEAD
>>>>>>> 6069aba6b4 (GEOMESA-3100 Kafka layer views (#2784))
<<<<<<< HEAD
>>>>>>> ccfb3bd95e (GEOMESA-3100 Kafka layer views (#2784))
<<<<<<< HEAD
>>>>>>> d4039e3d9a (GEOMESA-3100 Kafka layer views (#2784))
=======
=======
=======
=======
=======
>>>>>>> fa68dd43c (GEOMESA-3100 Kafka layer views (#2784))
=======
>>>>>>> 0fde036fa (GEOMESA-3100 Kafka layer views (#2784))
=======
>>>>>>> 89fb9950e (GEOMESA-3100 Kafka layer views (#2784))
=======
>>>>>>> e7bfe001d (GEOMESA-3100 Kafka layer views (#2784))
=======
=======
>>>>>>> af0a88eb1 (GEOMESA-3100 Kafka layer views (#2784))
>>>>>>> d0dc799ff (GEOMESA-3100 Kafka layer views (#2784))
=======
<<<<<<< HEAD
>>>>>>> af0a88eb1 (GEOMESA-3100 Kafka layer views (#2784))
>>>>>>> d0dc799ff (GEOMESA-3100 Kafka layer views (#2784))
=======
=======
>>>>>>> 936154130 (GEOMESA-3100 Kafka layer views (#2784))
<<<<<<< HEAD
<<<<<<< HEAD
=======
>>>>>>> af0a88eb1 (GEOMESA-3100 Kafka layer views (#2784))
>>>>>>> locationtech-main
=======
>>>>>>> af0a88eb1 (GEOMESA-3100 Kafka layer views (#2784))
>>>>>>> 58286bfd3 (GEOMESA-3100 Kafka layer views (#2784))
>>>>>>> 5ca0cd6de (GEOMESA-3100 Kafka layer views (#2784))
<<<<<<< HEAD
<<<<<<< HEAD
<<<<<<< HEAD
<<<<<<< HEAD
=======
>>>>>>> ea3b40e18 (GEOMESA-3100 Kafka layer views (#2784))
=======
>>>>>>> af0a88eb1 (GEOMESA-3100 Kafka layer views (#2784))
>>>>>>> bddfdbea5 (GEOMESA-3100 Kafka layer views (#2784))
=======
>>>>>>> d0dc799ff (GEOMESA-3100 Kafka layer views (#2784))
<<<<<<< HEAD
=======
>>>>>>> 936154130 (GEOMESA-3100 Kafka layer views (#2784))
=======
=======
>>>>>>> af0a88eb1 (GEOMESA-3100 Kafka layer views (#2784))
>>>>>>> bddfdbea5 (GEOMESA-3100 Kafka layer views (#2784))
>>>>>>> 2f6607232 (GEOMESA-3100 Kafka layer views (#2784))
=======
>>>>>>> ea3b40e18 (GEOMESA-3100 Kafka layer views (#2784))
    }
    val producer = getTransactionalProducer(sft, transaction)
=======
=======
    }
<<<<<<< HEAD
    val producer = getTransactionalProducer(transaction)
>>>>>>> 890b70c86 (GEOMESA-3100 Kafka layer views (#2784))
=======
    val producer = getTransactionalProducer(sft, transaction)
>>>>>>> d657014c8 (GEOMESA-3198 Kafka streams integration (#2854))
=======
=======
    }
    val producer = getTransactionalProducer(transaction)
>>>>>>> 4d37d5ef5 (GEOMESA-3100 Kafka layer views (#2784))
=======
>>>>>>> 13347c6405 (GEOMESA-3100 Kafka layer views (#2784))
    val vis = sft.isVisibilityRequired
    val writer = filter match {
      case None if vis    => new AppendKafkaFeatureWriter(sft, producer, config.serialization) with RequiredVisibilityWriter
      case None           => new AppendKafkaFeatureWriter(sft, producer, config.serialization)
      case Some(f) if vis => new ModifyKafkaFeatureWriter(sft, producer, config.serialization, f) with RequiredVisibilityWriter
      case Some(f)        => new ModifyKafkaFeatureWriter(sft, producer, config.serialization, f)
    }
<<<<<<< HEAD
    if (config.clearOnStart && cleared.add(sft.getTypeName)) {
=======
    writer
  }

  override def getFeatureWriterAppend(typeName: String, transaction: Transaction): KafkaFeatureWriter = {
    val sft = getSchema(typeName)
    if (sft == null) {
      throw new IOException(s"Schema '$typeName' has not been initialized. Please call 'createSchema' first.")
    } else if (layerViewLookup.contains(typeName)) {
      throw new IllegalArgumentException(s"Schema '$typeName' is a read-only view of '${layerViewLookup(typeName)}'")
    }
    val producer = getTransactionalProducer(transaction)
<<<<<<< HEAD
<<<<<<< HEAD
<<<<<<< HEAD
<<<<<<< HEAD
<<<<<<< HEAD
>>>>>>> f7038468b (GEOMESA-3100 Kafka layer views (#2784))
<<<<<<< HEAD
>>>>>>> d2002b5af (GEOMESA-3100 Kafka layer views (#2784))
<<<<<<< HEAD
>>>>>>> d5f6f5af59 (GEOMESA-3100 Kafka layer views (#2784))
<<<<<<< HEAD
>>>>>>> 314efe4dee (GEOMESA-3100 Kafka layer views (#2784))
<<<<<<< HEAD
>>>>>>> 64b99590af (GEOMESA-3100 Kafka layer views (#2784))
=======
=======
=======
=======
=======
>>>>>>> bddfdbea5 (GEOMESA-3100 Kafka layer views (#2784))
<<<<<<< HEAD
>>>>>>> c589b832a (GEOMESA-3100 Kafka layer views (#2784))
<<<<<<< HEAD
>>>>>>> 9e433ba57e (GEOMESA-3100 Kafka layer views (#2784))
<<<<<<< HEAD
>>>>>>> 2750a5beef (GEOMESA-3100 Kafka layer views (#2784))
<<<<<<< HEAD
>>>>>>> 41df6a2aa3 (GEOMESA-3100 Kafka layer views (#2784))
=======
=======
=======
=======
=======
>>>>>>> 95c83ca7f (GEOMESA-3100 Kafka layer views (#2784))
<<<<<<< HEAD
>>>>>>> fa68dd43c (GEOMESA-3100 Kafka layer views (#2784))
<<<<<<< HEAD
>>>>>>> 23f312535d (GEOMESA-3100 Kafka layer views (#2784))
<<<<<<< HEAD
>>>>>>> 468da42855 (GEOMESA-3100 Kafka layer views (#2784))
<<<<<<< HEAD
>>>>>>> 340134cdda (GEOMESA-3100 Kafka layer views (#2784))
=======
=======
=======
=======
=======
>>>>>>> f7038468b (GEOMESA-3100 Kafka layer views (#2784))
>>>>>>> 890b70c86 (GEOMESA-3100 Kafka layer views (#2784))
<<<<<<< HEAD
>>>>>>> 0fde036fa (GEOMESA-3100 Kafka layer views (#2784))
<<<<<<< HEAD
>>>>>>> 4f05dea44b (GEOMESA-3100 Kafka layer views (#2784))
<<<<<<< HEAD
>>>>>>> ae2a886e4b (GEOMESA-3100 Kafka layer views (#2784))
<<<<<<< HEAD
>>>>>>> d451bccb18 (GEOMESA-3100 Kafka layer views (#2784))
=======
=======
=======
=======
=======
>>>>>>> f7038468b (GEOMESA-3100 Kafka layer views (#2784))
=======
>>>>>>> bddfdbea5 (GEOMESA-3100 Kafka layer views (#2784))
>>>>>>> 2f6607232 (GEOMESA-3100 Kafka layer views (#2784))
<<<<<<< HEAD
>>>>>>> c57b5f538 (GEOMESA-3100 Kafka layer views (#2784))
<<<<<<< HEAD
>>>>>>> 1e11ed51a6 (GEOMESA-3100 Kafka layer views (#2784))
<<<<<<< HEAD
>>>>>>> d530f7b24a (GEOMESA-3100 Kafka layer views (#2784))
<<<<<<< HEAD
>>>>>>> fe3378ccaa (GEOMESA-3100 Kafka layer views (#2784))
=======
=======
=======
=======
=======
>>>>>>> d2cb939f5 (GEOMESA-3100 Kafka layer views (#2784))
<<<<<<< HEAD
>>>>>>> 89fb9950e (GEOMESA-3100 Kafka layer views (#2784))
<<<<<<< HEAD
>>>>>>> bc97b07a31 (GEOMESA-3100 Kafka layer views (#2784))
<<<<<<< HEAD
>>>>>>> f340d6feab (GEOMESA-3100 Kafka layer views (#2784))
<<<<<<< HEAD
>>>>>>> 72ec0b2107 (GEOMESA-3100 Kafka layer views (#2784))
=======
=======
=======
=======
=======
>>>>>>> f7038468b (GEOMESA-3100 Kafka layer views (#2784))
>>>>>>> 4d37d5ef5 (GEOMESA-3100 Kafka layer views (#2784))
>>>>>>> e7bfe001d (GEOMESA-3100 Kafka layer views (#2784))
>>>>>>> a09ef82d36 (GEOMESA-3100 Kafka layer views (#2784))
>>>>>>> 882c4b4793 (GEOMESA-3100 Kafka layer views (#2784))
<<<<<<< HEAD
>>>>>>> 304d8d4049 (GEOMESA-3100 Kafka layer views (#2784))
=======
=======
>>>>>>> 337ecd16e5 (GEOMESA-3100 Kafka layer views (#2784))
<<<<<<< HEAD
>>>>>>> ad362b1341 (GEOMESA-3100 Kafka layer views (#2784))
=======
=======
>>>>>>> f7038468b (GEOMESA-3100 Kafka layer views (#2784))
>>>>>>> 69287f5812 (GEOMESA-3100 Kafka layer views (#2784))
>>>>>>> 13347c6405 (GEOMESA-3100 Kafka layer views (#2784))
    val writer =
      if (sft.isVisibilityRequired) {
        new AppendKafkaFeatureWriter(sft, producer, config.serialization) with RequiredVisibilityWriter
      } else {
        new AppendKafkaFeatureWriter(sft, producer, config.serialization)
      }
    if (config.clearOnStart && cleared.add(typeName)) {
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
>>>>>>> ad0d29873e (GEOMESA-3100 Kafka layer views (#2784))
=======
>>>>>>> 4516873dab (GEOMESA-3100 Kafka layer views (#2784))
=======
>>>>>>> 8ec26b8c2a (GEOMESA-3100 Kafka layer views (#2784))
=======
>>>>>>> 3010fc384e (GEOMESA-3100 Kafka layer views (#2784))
=======
>>>>>>> ad362b1341 (GEOMESA-3100 Kafka layer views (#2784))
>>>>>>> af0a88eb17 (GEOMESA-3100 Kafka layer views (#2784))
=======
>>>>>>> af0a88eb1 (GEOMESA-3100 Kafka layer views (#2784))
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
>>>>>>> 42e8565e9b (Merge branch 'feature/postgis-fixes')
=======
>>>>>>> 67de3c3202 (Merge branch 'feature/postgis-fixes')
=======
>>>>>>> cf457d8543 (GEOMESA-3100 Kafka layer views (#2784))
=======
>>>>>>> 638b68d081 (Merge branch 'feature/postgis-fixes')
=======
>>>>>>> fc4546247e (GEOMESA-3100 Kafka layer views (#2784))
=======
>>>>>>> 71adb695c5 (Merge branch 'feature/postgis-fixes')
=======
>>>>>>> d4039e3d9a (GEOMESA-3100 Kafka layer views (#2784))
=======
>>>>>>> 30559ea5c9 (Merge branch 'feature/postgis-fixes')
>>>>>>> f7038468b7 (GEOMESA-3100 Kafka layer views (#2784))
=======
>>>>>>> af0a88eb1 (GEOMESA-3100 Kafka layer views (#2784))
>>>>>>> bddfdbea54 (GEOMESA-3100 Kafka layer views (#2784))
=======
>>>>>>> af0a88eb1 (GEOMESA-3100 Kafka layer views (#2784))
>>>>>>> 95c83ca7fa (GEOMESA-3100 Kafka layer views (#2784))
<<<<<<< HEAD
<<<<<<< HEAD
=======
>>>>>>> af0a88eb1 (GEOMESA-3100 Kafka layer views (#2784))
>>>>>>> d2cb939f51 (GEOMESA-3100 Kafka layer views (#2784))
=======
>>>>>>> 3be8d2a5a4 (Merge branch 'feature/postgis-fixes')
<<<<<<< HEAD
<<<<<<< HEAD
=======
>>>>>>> af0a88eb1 (GEOMESA-3100 Kafka layer views (#2784))
>>>>>>> a0314fb7ff (GEOMESA-3100 Kafka layer views (#2784))
=======
=======
>>>>>>> 3be8d2a5a (Merge branch 'feature/postgis-fixes')
>>>>>>> db8d998aa2 (Merge branch 'feature/postgis-fixes')
<<<<<<< HEAD
<<<<<<< HEAD
=======
>>>>>>> d845d7c1bd (GEOMESA-3254 Add Bloop build support)
=======
>>>>>>> af0a88eb1 (GEOMESA-3100 Kafka layer views (#2784))
>>>>>>> 17f13b3a7a (GEOMESA-3100 Kafka layer views (#2784))
<<<<<<< HEAD
<<<<<<< HEAD
=======
>>>>>>> 67de3c3202 (Merge branch 'feature/postgis-fixes')
=======
=======
>>>>>>> 3be8d2a5a (Merge branch 'feature/postgis-fixes')
>>>>>>> 1b25d7ddb4 (Merge branch 'feature/postgis-fixes')
<<<<<<< HEAD
<<<<<<< HEAD
=======
=======
>>>>>>> e944f1c88b (Merge branch 'feature/postgis-fixes')
=======
>>>>>>> eddb4eaca1 (GEOMESA-3100 Kafka layer views (#2784))
=======
<<<<<<< HEAD
<<<<<<< HEAD
>>>>>>> 26e5afc4ea (Merge branch 'feature/postgis-fixes')
=======
>>>>>>> ccfb3bd95e (GEOMESA-3100 Kafka layer views (#2784))
=======
<<<<<<< HEAD
<<<<<<< HEAD
>>>>>>> c69897d7bd (Merge branch 'feature/postgis-fixes')
=======
=======
>>>>>>> fc4546247e (GEOMESA-3100 Kafka layer views (#2784))
=======
>>>>>>> 26e5afc4ea (Merge branch 'feature/postgis-fixes')
=======
>>>>>>> 71adb695c5 (Merge branch 'feature/postgis-fixes')
=======
>>>>>>> d4039e3d9a (GEOMESA-3100 Kafka layer views (#2784))
=======
>>>>>>> c69897d7bd (Merge branch 'feature/postgis-fixes')
=======
>>>>>>> 30559ea5c9 (Merge branch 'feature/postgis-fixes')
>>>>>>> 3be8d2a5a (Merge branch 'feature/postgis-fixes')
=======
>>>>>>> eecabb92a (GEOMESA-3100 Kafka layer views (#2784))
<<<<<<< HEAD
>>>>>>> 98e7bf59d2 (GEOMESA-3100 Kafka layer views (#2784))
=======
=======
=======
>>>>>>> 3be8d2a5a (Merge branch 'feature/postgis-fixes')
>>>>>>> e8cc4971c6 (Merge branch 'feature/postgis-fixes')
<<<<<<< HEAD
>>>>>>> e944f1c88b (Merge branch 'feature/postgis-fixes')
=======
=======
=======
<<<<<<< HEAD
<<<<<<< HEAD
>>>>>>> cb6bda89b6 (Merge branch 'feature/postgis-fixes')
=======
>>>>>>> 6069aba6b4 (GEOMESA-3100 Kafka layer views (#2784))
=======
<<<<<<< HEAD
<<<<<<< HEAD
>>>>>>> 699117eca9 (Merge branch 'feature/postgis-fixes')
=======
=======
>>>>>>> d4039e3d9a (GEOMESA-3100 Kafka layer views (#2784))
=======
>>>>>>> 699117eca9 (Merge branch 'feature/postgis-fixes')
=======
>>>>>>> 30559ea5c9 (Merge branch 'feature/postgis-fixes')
>>>>>>> 3be8d2a5a (Merge branch 'feature/postgis-fixes')
=======
>>>>>>> a0314fb7f (GEOMESA-3100 Kafka layer views (#2784))
<<<<<<< HEAD
>>>>>>> 8ed2c9f7e5 (GEOMESA-3100 Kafka layer views (#2784))
<<<<<<< HEAD
>>>>>>> eddb4eaca1 (GEOMESA-3100 Kafka layer views (#2784))
=======
=======
=======
=======
>>>>>>> 3be8d2a5a (Merge branch 'feature/postgis-fixes')
>>>>>>> db8d998aa (Merge branch 'feature/postgis-fixes')
<<<<<<< HEAD
<<<<<<< HEAD
>>>>>>> cb6bda89b6 (Merge branch 'feature/postgis-fixes')
<<<<<<< HEAD
>>>>>>> 26e5afc4ea (Merge branch 'feature/postgis-fixes')
=======
=======
=======
>>>>>>> d845d7c1b (GEOMESA-3254 Add Bloop build support)
<<<<<<< HEAD
<<<<<<< HEAD
>>>>>>> 09d87762c5 (GEOMESA-3254 Add Bloop build support)
<<<<<<< HEAD
>>>>>>> 63a045a753 (GEOMESA-3254 Add Bloop build support)
=======
=======
=======
>>>>>>> 17f13b3a7 (GEOMESA-3100 Kafka layer views (#2784))
<<<<<<< HEAD
<<<<<<< HEAD
>>>>>>> 6069aba6b4 (GEOMESA-3100 Kafka layer views (#2784))
<<<<<<< HEAD
>>>>>>> ccfb3bd95e (GEOMESA-3100 Kafka layer views (#2784))
=======
=======
=======
=======
>>>>>>> 3be8d2a5a (Merge branch 'feature/postgis-fixes')
>>>>>>> 1b25d7ddb (Merge branch 'feature/postgis-fixes')
>>>>>>> 699117eca9 (Merge branch 'feature/postgis-fixes')
>>>>>>> c69897d7bd (Merge branch 'feature/postgis-fixes')
=======
>>>>>>> af0a88eb1 (GEOMESA-3100 Kafka layer views (#2784))
>>>>>>> 337ecd16e5 (GEOMESA-3100 Kafka layer views (#2784))
<<<<<<< HEAD
=======
=======
>>>>>>> 3be8d2a5a (Merge branch 'feature/postgis-fixes')
>>>>>>> da00c7bd68 (Merge branch 'feature/postgis-fixes')
=======
>>>>>>> af0a88eb17 (GEOMESA-3100 Kafka layer views (#2784))
>>>>>>> c860f21098 (GEOMESA-3100 Kafka layer views (#2784))
=======
=======
>>>>>>> 5dc1f86700 (GEOMESA-3100 Kafka layer views (#2784))
>>>>>>> af0a88eb17 (GEOMESA-3100 Kafka layer views (#2784))
=======
>>>>>>> af0a88eb1 (GEOMESA-3100 Kafka layer views (#2784))
>>>>>>> f7038468b7 (GEOMESA-3100 Kafka layer views (#2784))
<<<<<<< HEAD
>>>>>>> 984dd84de9 (GEOMESA-3100 Kafka layer views (#2784))
=======
=======
>>>>>>> af0a88eb1 (GEOMESA-3100 Kafka layer views (#2784))
>>>>>>> bddfdbea54 (GEOMESA-3100 Kafka layer views (#2784))
>>>>>>> 5dc1f86700 (GEOMESA-3100 Kafka layer views (#2784))
=======
>>>>>>> ad0d29873e (GEOMESA-3100 Kafka layer views (#2784))
=======
=======
>>>>>>> af0a88eb1 (GEOMESA-3100 Kafka layer views (#2784))
>>>>>>> d2cb939f51 (GEOMESA-3100 Kafka layer views (#2784))
>>>>>>> 4516873dab (GEOMESA-3100 Kafka layer views (#2784))
=======
>>>>>>> 34472778d3 (Merge branch 'feature/postgis-fixes')
=======
=======
>>>>>>> af0a88eb1 (GEOMESA-3100 Kafka layer views (#2784))
>>>>>>> a0314fb7ff (GEOMESA-3100 Kafka layer views (#2784))
>>>>>>> 8ec26b8c2a (GEOMESA-3100 Kafka layer views (#2784))
=======
>>>>>>> 42e8565e9b (Merge branch 'feature/postgis-fixes')
=======
=======
>>>>>>> d845d7c1bd (GEOMESA-3254 Add Bloop build support)
>>>>>>> f1532f2313 (GEOMESA-3254 Add Bloop build support)
=======
>>>>>>> 3010fc384e (GEOMESA-3100 Kafka layer views (#2784))
=======
>>>>>>> 67de3c3202 (Merge branch 'feature/postgis-fixes')
=======
=======
=======
>>>>>>> e944f1c88b (Merge branch 'feature/postgis-fixes')
=======
>>>>>>> 3be8d2a5a (Merge branch 'feature/postgis-fixes')
=======
>>>>>>> eecabb92a (GEOMESA-3100 Kafka layer views (#2784))
<<<<<<< HEAD
>>>>>>> 98e7bf59d2 (GEOMESA-3100 Kafka layer views (#2784))
<<<<<<< HEAD
>>>>>>> cf457d8543 (GEOMESA-3100 Kafka layer views (#2784))
=======
=======
=======
=======
>>>>>>> 3be8d2a5a (Merge branch 'feature/postgis-fixes')
>>>>>>> e8cc4971c6 (Merge branch 'feature/postgis-fixes')
>>>>>>> e944f1c88b (Merge branch 'feature/postgis-fixes')
>>>>>>> 638b68d081 (Merge branch 'feature/postgis-fixes')
=======
=======
>>>>>>> cb6bda89b6 (Merge branch 'feature/postgis-fixes')
=======
>>>>>>> 71adb695c5 (Merge branch 'feature/postgis-fixes')
>>>>>>> 3be8d2a5a (Merge branch 'feature/postgis-fixes')
=======
>>>>>>> a0314fb7f (GEOMESA-3100 Kafka layer views (#2784))
<<<<<<< HEAD
>>>>>>> 8ed2c9f7e5 (GEOMESA-3100 Kafka layer views (#2784))
<<<<<<< HEAD
>>>>>>> eddb4eaca1 (GEOMESA-3100 Kafka layer views (#2784))
<<<<<<< HEAD
>>>>>>> fc4546247e (GEOMESA-3100 Kafka layer views (#2784))
=======
=======
=======
=======
=======
>>>>>>> 3be8d2a5a (Merge branch 'feature/postgis-fixes')
>>>>>>> db8d998aa (Merge branch 'feature/postgis-fixes')
=======
>>>>>>> 5a4c24e020 (GEOMESA-3254 Add Bloop build support)
>>>>>>> cb6bda89b6 (Merge branch 'feature/postgis-fixes')
<<<<<<< HEAD
>>>>>>> 26e5afc4ea (Merge branch 'feature/postgis-fixes')
<<<<<<< HEAD
>>>>>>> 71adb695c5 (Merge branch 'feature/postgis-fixes')
=======
=======
=======
=======
>>>>>>> d845d7c1b (GEOMESA-3254 Add Bloop build support)
=======
>>>>>>> d4039e3d9a (GEOMESA-3100 Kafka layer views (#2784))
>>>>>>> 09d87762c5 (GEOMESA-3254 Add Bloop build support)
<<<<<<< HEAD
>>>>>>> 63a045a753 (GEOMESA-3254 Add Bloop build support)
<<<<<<< HEAD
>>>>>>> 5a4c24e020 (GEOMESA-3254 Add Bloop build support)
=======
=======
=======
=======
>>>>>>> 17f13b3a7 (GEOMESA-3100 Kafka layer views (#2784))
=======
>>>>>>> 30559ea5c9 (Merge branch 'feature/postgis-fixes')
>>>>>>> 6069aba6b4 (GEOMESA-3100 Kafka layer views (#2784))
<<<<<<< HEAD
>>>>>>> ccfb3bd95e (GEOMESA-3100 Kafka layer views (#2784))
<<<<<<< HEAD
>>>>>>> d4039e3d9a (GEOMESA-3100 Kafka layer views (#2784))
=======
=======
=======
=======
=======
>>>>>>> 3be8d2a5a (Merge branch 'feature/postgis-fixes')
>>>>>>> 1b25d7ddb (Merge branch 'feature/postgis-fixes')
>>>>>>> 699117eca9 (Merge branch 'feature/postgis-fixes')
>>>>>>> c69897d7bd (Merge branch 'feature/postgis-fixes')
>>>>>>> 30559ea5c9 (Merge branch 'feature/postgis-fixes')
=======
>>>>>>> ad362b1341 (GEOMESA-3100 Kafka layer views (#2784))
      writer.clear()
    }
    writer
  }

  override def dispose(): Unit = {
    CloseWithLogging(defaultProducer)
    CloseWithLogging(partitionedProducer)
    CloseWithLogging(caches.asMap.asScala.values)
    CloseWithLogging(config.metrics)
    caches.invalidateAll()
    super.dispose()
  }

  private def getTransactionalProducer(sft: SimpleFeatureType, transaction: Transaction): KafkaFeatureProducer = {
    val useDefaultPartitioning = KafkaDataStore.usesDefaultPartitioning(sft)

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
>>>>>>> e2a2dd4c2e (GEOMESA-3198 Kafka streams integration (#2854))
=======
>>>>>>> e792102d4b (GEOMESA-3198 Kafka streams integration (#2854))
=======
>>>>>>> 5a4c24e020 (GEOMESA-3254 Add Bloop build support)
=======
>>>>>>> f9df175e9b (GEOMESA-3198 Kafka streams integration (#2854))
=======
=======
>>>>>>> 0b3e844fc4 (GEOMESA-3198 Kafka streams integration (#2854))
=======
<<<<<<< HEAD
<<<<<<< HEAD
>>>>>>> 8d7834ec11 (GEOMESA-3198 Kafka streams integration (#2854))
=======
>>>>>>> 63a045a753 (GEOMESA-3254 Add Bloop build support)
=======
<<<<<<< HEAD
<<<<<<< HEAD
<<<<<<< HEAD
=======
=======
>>>>>>> c6591bc391 (GEOMESA-3198 Kafka streams integration (#2854))
=======
=======
>>>>>>> b09307f5c0 (GEOMESA-3198 Kafka streams integration (#2854))
<<<<<<< HEAD
=======
=======
=======
>>>>>>> d4a13604e7 (GEOMESA-3198 Kafka streams integration (#2854))
=======
>>>>>>> e2a2dd4c2e (GEOMESA-3198 Kafka streams integration (#2854))
=======
>>>>>>> 8d7834ec11 (GEOMESA-3198 Kafka streams integration (#2854))
=======
>>>>>>> e792102d4b (GEOMESA-3198 Kafka streams integration (#2854))
=======
>>>>>>> 5a4c24e020 (GEOMESA-3254 Add Bloop build support)
=======
=======
=======
>>>>>>> c6591bc391 (GEOMESA-3198 Kafka streams integration (#2854))
>>>>>>> c9a6fc453c (GEOMESA-3198 Kafka streams integration (#2854))
=======
>>>>>>> f9df175e9b (GEOMESA-3198 Kafka streams integration (#2854))
  private def getTransactionalProducer(sft: SimpleFeatureType, transaction: Transaction): KafkaFeatureProducer = {
    val useDefaultPartitioning = KafkaDataStore.usesDefaultPartitioning(sft)

>>>>>>> de758f45a (GEOMESA-3198 Kafka streams integration (#2854))
<<<<<<< HEAD
<<<<<<< HEAD
<<<<<<< HEAD
<<<<<<< HEAD
<<<<<<< HEAD
<<<<<<< HEAD
<<<<<<< HEAD
=======
>>>>>>> e2a2dd4c2e (GEOMESA-3198 Kafka streams integration (#2854))
=======
>>>>>>> c9a6fc453c (GEOMESA-3198 Kafka streams integration (#2854))
>>>>>>> 73f3a8cb69 (GEOMESA-3198 Kafka streams integration (#2854))
=======
>>>>>>> b09307f5c0 (GEOMESA-3198 Kafka streams integration (#2854))
=======
>>>>>>> 73f3a8cb69 (GEOMESA-3198 Kafka streams integration (#2854))
>>>>>>> d4a13604e7 (GEOMESA-3198 Kafka streams integration (#2854))
=======
>>>>>>> 73f3a8cb69 (GEOMESA-3198 Kafka streams integration (#2854))
=======
>>>>>>> b09307f5c0 (GEOMESA-3198 Kafka streams integration (#2854))
>>>>>>> f9df175e9b (GEOMESA-3198 Kafka streams integration (#2854))
    if (transaction == null || transaction == Transaction.AUTO_COMMIT) {
      val producer = if (useDefaultPartitioning) { defaultProducer.instance } else { partitionedProducer.instance }
=======
>>>>>>> 1b8cbf843d (GEOMESA-3198 Kafka streams integration (#2854))
=======
  private def getTransactionalProducer(sft: SimpleFeatureType, transaction: Transaction): KafkaFeatureProducer = {
    val useDefaultPartitioning = KafkaDataStore.usesDefaultPartitioning(sft)

<<<<<<< HEAD
=======
>>>>>>> de758f45a (GEOMESA-3198 Kafka streams integration (#2854))
>>>>>>> 1b8cbf843d (GEOMESA-3198 Kafka streams integration (#2854))
=======
>>>>>>> d845d7c1bd (GEOMESA-3254 Add Bloop build support)
    if (transaction == null || transaction == Transaction.AUTO_COMMIT) {
      val producer = if (useDefaultPartitioning) { defaultProducer.producer } else { partitionedProducer.producer }
>>>>>>> de758f45a6 (GEOMESA-3198 Kafka streams integration (#2854))
=======
=======
<<<<<<< HEAD
<<<<<<< HEAD
=======
>>>>>>> c9a6fc453c (GEOMESA-3198 Kafka streams integration (#2854))
>>>>>>> 4ae16a2980 (GEOMESA-3198 Kafka streams integration (#2854))
=======
>>>>>>> f01ac238e (GEOMESA-3198 Kafka streams integration (#2854))
=======
>>>>>>> 30fda14bf2 (GEOMESA-3198 Kafka streams integration (#2854))
=======
>>>>>>> 09d87762c5 (GEOMESA-3254 Add Bloop build support)
<<<<<<< HEAD
<<<<<<< HEAD
=======
>>>>>>> 73f3a8cb6 (GEOMESA-3198 Kafka streams integration (#2854))
>>>>>>> c6591bc391 (GEOMESA-3198 Kafka streams integration (#2854))
=======
>>>>>>> 5a4c24e020 (GEOMESA-3254 Add Bloop build support)
=======
=======
>>>>>>> 73f3a8cb6 (GEOMESA-3198 Kafka streams integration (#2854))
>>>>>>> c6591bc391 (GEOMESA-3198 Kafka streams integration (#2854))
>>>>>>> c9a6fc453c (GEOMESA-3198 Kafka streams integration (#2854))
    if (transaction == null || transaction == Transaction.AUTO_COMMIT) {
      val producer = if (useDefaultPartitioning) { defaultProducer.instance } else { partitionedProducer.instance }
=======
>>>>>>> 1b8cbf843 (GEOMESA-3198 Kafka streams integration (#2854))
=======
  private def getTransactionalProducer(sft: SimpleFeatureType, transaction: Transaction): KafkaFeatureProducer = {
    val useDefaultPartitioning = KafkaDataStore.usesDefaultPartitioning(sft)

<<<<<<< HEAD
=======
>>>>>>> de758f45a (GEOMESA-3198 Kafka streams integration (#2854))
>>>>>>> 1b8cbf843 (GEOMESA-3198 Kafka streams integration (#2854))
=======
>>>>>>> d845d7c1b (GEOMESA-3254 Add Bloop build support)
<<<<<<< HEAD
=======
>>>>>>> f01ac238e (GEOMESA-3198 Kafka streams integration (#2854))
=======
>>>>>>> 30fda14bf2 (GEOMESA-3198 Kafka streams integration (#2854))
    if (transaction == null || transaction == Transaction.AUTO_COMMIT) {
      val producer = if (useDefaultPartitioning) { defaultProducer.instance } else { partitionedProducer.instance }
=======
>>>>>>> 1b8cbf843 (GEOMESA-3198 Kafka streams integration (#2854))
=======
  private def getTransactionalProducer(sft: SimpleFeatureType, transaction: Transaction): KafkaFeatureProducer = {
    val useDefaultPartitioning = KafkaDataStore.usesDefaultPartitioning(sft)

<<<<<<< HEAD
>>>>>>> e2a2dd4c2e (GEOMESA-3198 Kafka streams integration (#2854))
=======
<<<<<<< HEAD
=======
>>>>>>> de758f45a (GEOMESA-3198 Kafka streams integration (#2854))
>>>>>>> 1b8cbf843 (GEOMESA-3198 Kafka streams integration (#2854))
>>>>>>> e792102d4b (GEOMESA-3198 Kafka streams integration (#2854))
=======
>>>>>>> 5a4c24e020 (GEOMESA-3254 Add Bloop build support)
    if (transaction == null || transaction == Transaction.AUTO_COMMIT) {
      val producer = if (useDefaultPartitioning) { defaultProducer.producer } else { partitionedProducer.producer }
>>>>>>> de758f45a (GEOMESA-3198 Kafka streams integration (#2854))
>>>>>>> 0b3e844fc4 (GEOMESA-3198 Kafka streams integration (#2854))
<<<<<<< HEAD
=======
=======
>>>>>>> 030cd33877 (GEOMESA-3198 Kafka streams integration (#2854))
=======
>>>>>>> f1532f2313 (GEOMESA-3254 Add Bloop build support)
    if (transaction == null || transaction == Transaction.AUTO_COMMIT) {
      val producer = if (useDefaultPartitioning) { defaultProducer.instance } else { partitionedProducer.instance }
=======
>>>>>>> 1b8cbf843d (GEOMESA-3198 Kafka streams integration (#2854))
=======
  private def getTransactionalProducer(sft: SimpleFeatureType, transaction: Transaction): KafkaFeatureProducer = {
    val useDefaultPartitioning = KafkaDataStore.usesDefaultPartitioning(sft)

<<<<<<< HEAD
=======
>>>>>>> de758f45a (GEOMESA-3198 Kafka streams integration (#2854))
>>>>>>> 1b8cbf843d (GEOMESA-3198 Kafka streams integration (#2854))
=======
>>>>>>> d845d7c1bd (GEOMESA-3254 Add Bloop build support)
    if (transaction == null || transaction == Transaction.AUTO_COMMIT) {
      val producer = if (useDefaultPartitioning) { defaultProducer.producer } else { partitionedProducer.producer }
>>>>>>> de758f45a6 (GEOMESA-3198 Kafka streams integration (#2854))
>>>>>>> 03f3e71921 (GEOMESA-3198 Kafka streams integration (#2854))
=======
>>>>>>> e2a2dd4c2e (GEOMESA-3198 Kafka streams integration (#2854))
      return AutoCommitProducer(producer)
    }

    val state = transaction.getState(KafkaDataStore.TransactionStateKey)
    if (state == null) {
      val partitioner = if (useDefaultPartitioning) { Map.empty } else {
        Map(PARTITIONER_CLASS_CONFIG -> classOf[GeoMessagePartitioner].getName)
      }
      // add kafka transactional id if it's not set, but force acks to "all" as required by kafka
      val props =
        Map(TRANSACTIONAL_ID_CONFIG -> UUID.randomUUID().toString) ++
            partitioner ++
            config.producers.properties ++
            Map(ACKS_CONFIG -> "all")
      val producer = KafkaTransactionState(KafkaDataStore.producer(config.brokers, props))
      transaction.putState(KafkaDataStore.TransactionStateKey, producer)
      producer
    } else {
      state match {
        case p: KafkaTransactionState => p
        case _ => throw new IllegalArgumentException(s"Found non-kafka state in transaction: $state")
      }
    }
  }

  /**
   * Get the feature cache for the type name, which may be a real feature type or a view
   *
   * @param typeName type name
   * @return
   */
  private def cache(typeName: String): KafkaFeatureCache = {
    layerViewLookup.get(typeName) match {
      case None => caches.get(typeName).cache
      case Some(orig) =>
        caches.get(orig).cache.views.find(_.sft.getTypeName == typeName).getOrElse {
          throw new IllegalStateException(
            s"Could not find layer view for typeName '$typeName' in cache ${caches.get(orig)}")
        }
    }
  }
}

object KafkaDataStore extends LazyLogging {

  val TopicKey = "geomesa.kafka.topic"
  val TopicConfigKey = "kafka.topic.config"
  val PartitioningKey = "geomesa.kafka.partitioning"

  val MetadataPath = "metadata"

  val TransactionStateKey = "geomesa.kafka.state"

  val PartitioningDefault = "default"

  val LoadIntervalProperty: SystemProperty = SystemProperty("geomesa.kafka.load.interval", "1s")

  // marker to trigger the cq engine index when using the deprecated enable flag
  private[kafka] val CqIndexFlag: (String, CQIndexType) = null

  def topic(sft: SimpleFeatureType): String = sft.getUserData.get(TopicKey).asInstanceOf[String]

  def setTopic(sft: SimpleFeatureType, topic: String): Unit = sft.getUserData.put(TopicKey, topic)

  def topicConfig(sft: SimpleFeatureType): java.util.Map[String, String] = {
    val props = new Properties()
    val config = sft.getUserData.get(TopicConfigKey).asInstanceOf[String]
    if (config != null) {
      props.load(new StringReader(config))
    }
    props.asInstanceOf[java.util.Map[String, String]]
  }

  def usesDefaultPartitioning(sft: SimpleFeatureType): Boolean =
    sft.getUserData.get(PartitioningKey) == PartitioningDefault

  @deprecated("Uses a custom partitioner which creates issues with Kafka streams. Use `producer(String, Map[String, String]) instead")
  def producer(config: KafkaDataStoreConfig): Producer[Array[Byte], Array[Byte]] = {
    val props =
      if (config.producers.properties.contains(PARTITIONER_CLASS_CONFIG)) {
        config.producers.properties
      } else {
        config.producers.properties + (PARTITIONER_CLASS_CONFIG -> classOf[GeoMessagePartitioner].getName)
      }
    producer(config.brokers, props)
  }

  /**
   * Create a Kafka producer
   *
   * @param bootstrapServers Kafka bootstrap servers config
   * @param properties Kafka producer properties
   * @return
   */
  def producer(bootstrapServers: String, properties: Map[String, String]): Producer[Array[Byte], Array[Byte]] = {
    import org.apache.kafka.clients.producer.ProducerConfig._

    val props = new Properties()
    // set some defaults but allow them to be overridden
    props.put(ACKS_CONFIG, "1") // mix of reliability and performance
    props.put(RETRIES_CONFIG, Int.box(3))
    props.put(LINGER_MS_CONFIG, Int.box(3)) // helps improve batching at the expense of slight delays in write
    props.put(KEY_SERIALIZER_CLASS_CONFIG, classOf[ByteArraySerializer].getName)
    props.put(VALUE_SERIALIZER_CLASS_CONFIG, classOf[ByteArraySerializer].getName)
    props.put(BOOTSTRAP_SERVERS_CONFIG, bootstrapServers)
    properties.foreach { case (k, v) => props.put(k, v) }
    new KafkaProducer[Array[Byte], Array[Byte]](props)
  }

  def consumer(config: KafkaDataStoreConfig, group: String): Consumer[Array[Byte], Array[Byte]] =
    consumer(config.brokers, Map(GROUP_ID_CONFIG -> group) ++ config.consumers.properties)

  def consumer(brokers: String, properties: Map[String, String]): Consumer[Array[Byte], Array[Byte]] = {
    import org.apache.kafka.clients.consumer.ConsumerConfig._

    val props = new Properties()
    props.put(BOOTSTRAP_SERVERS_CONFIG, brokers)
    props.put(ENABLE_AUTO_COMMIT_CONFIG, "false")
    props.put(KEY_DESERIALIZER_CLASS_CONFIG, classOf[ByteArrayDeserializer].getName)
    props.put(VALUE_DESERIALIZER_CLASS_CONFIG, classOf[ByteArrayDeserializer].getName)
    properties.foreach { case (k, v) => props.put(k, v) }

    new KafkaConsumer[Array[Byte], Array[Byte]](props)
  }

  // creates a consumer and sets to the latest offsets
  private[kafka] def consumers(
      brokers: String,
      topic: String,
      config: ConsumerConfig): Seq[Consumer[Array[Byte], Array[Byte]]] = {
    require(config.count > 0, "Number of consumers must be greater than 0")

    val props = Map(GROUP_ID_CONFIG -> s"${config.groupPrefix}${UUID.randomUUID()}") ++ config.properties
    lazy val partitions = Collections.newSetFromMap(new ConcurrentHashMap[Int, java.lang.Boolean])

    logger.debug(s"Creating ${config.count} consumers for topic [$topic] with group-id [${props(GROUP_ID_CONFIG)}]")

    Seq.fill(config.count) {
      val consumer = KafkaDataStore.consumer(brokers, props)
      config.readBack match {
        case None    => KafkaConsumerVersions.subscribe(consumer, topic)
        case Some(d) => KafkaConsumerVersions.subscribe(consumer, topic, new ReadBackRebalanceListener(consumer, partitions, d))
      }
      consumer
    }
  }

  /**
   * Create a layer view based on a config and the actual feature type
   *
   * @param sft simple feature type the view is based on
   * @param config layer view config
   * @return
   */
  private[kafka] def createLayerView(sft: SimpleFeatureType, config: LayerViewConfig): LayerView = {
    val viewSft = SimpleFeatureTypes.renameSft(sft, config.typeName)
    val filter = config.filter.map(FastFilterFactory.optimize(viewSft, _))
    val transform = config.transform.map(Transforms(viewSft, _))
    val finalSft = transform.map(Transforms.schema(viewSft, _)).getOrElse(viewSft)
    LayerView(finalSft, filter, transform)
  }

  /**
    * Rebalance listener that seeks the consumer to the an offset based on a read-back duration
    *
    * @param consumer consumer
    * @param partitions shared partition map, to ensure we only read-back once per partition. For subsequent
    *                   rebalances, we should have committed offsets that will be used
    * @param readBack duration to read back, or Duration.Inf to go to the beginning
    */
  private [kafka] class ReadBackRebalanceListener(consumer: Consumer[Array[Byte], Array[Byte]],
                                                  partitions: java.util.Set[Int],
                                                  readBack: Duration)
      extends ConsumerRebalanceListener with LazyLogging {

    import scala.collection.JavaConverters._

    override def onPartitionsRevoked(topicPartitions: java.util.Collection[TopicPartition]): Unit = {}

    override def onPartitionsAssigned(topicPartitions: java.util.Collection[TopicPartition]): Unit = {
      topicPartitions.asScala.foreach { tp =>
        if (partitions.add(tp.partition())) {
          KafkaConsumerVersions.pause(consumer, tp)
          try {
            if (readBack.isFinite) {
              val offset = Try {
                val time = System.currentTimeMillis() - readBack.toMillis
                KafkaConsumerVersions.offsetsForTimes(consumer, tp.topic, Seq(tp.partition), time).get(tp.partition)
              }
              offset match {
                case Success(Some(o)) =>
                  logger.debug(s"Seeking to offset $o for read-back $readBack on [${tp.topic}:${tp.partition}]")
                  consumer.seek(tp, o)

                case Success(None) =>
                  logger.debug(s"No prior offset found for read-back $readBack on [${tp.topic}:${tp.partition}], " +
                      "reading from head of queue")

                case Failure(e) =>
                  logger.warn(s"Error finding initial offset: [${tp.topic}:${tp.partition}], seeking to beginning", e)
                  KafkaConsumerVersions.seekToBeginning(consumer, tp)
              }
            } else {
              KafkaConsumerVersions.seekToBeginning(consumer, tp)
            }
          } finally {
            KafkaConsumerVersions.resume(consumer, tp)
          }
        }
      }
    }
  }

  class KafkaDataStoreWithZk(
      config: KafkaDataStoreConfig,
      metadata: GeoMesaMetadata[String],
      serialization: GeoMessageSerializerFactory,
      override protected val zookeepers: String
    ) extends KafkaDataStore(config, metadata, serialization) with ZookeeperLocking

  case class KafkaDataStoreConfig(
      catalog: String,
      brokers: String,
      zookeepers: Option[String],
      consumers: ConsumerConfig,
      producers: ProducerConfig,
      clearOnStart: Boolean,
      topics: TopicConfig,
      @deprecated("unused")
      serialization: SerializationType,
      indices: IndexConfig,
      looseBBox: Boolean,
      layerViewsConfig: Map[String, Seq[LayerViewConfig]],
      authProvider: AuthorizationsProvider,
      audit: Option[(AuditWriter, AuditProvider, String)],
      metrics: Option[GeoMesaMetrics],
      namespace: Option[String]) extends NamespaceConfig

  case class ConsumerConfig(
      count: Int,
      groupPrefix: String,
      properties: Map[String, String],
      readBack: Option[Duration]
    )

  case class ProducerConfig(properties: Map[String, String])

  case class TopicConfig(partitions: Int, replication: Int)

  case class IndexConfig(
      expiry: ExpiryTimeConfig,
      resolution: IndexResolution,
      ssiTiers: Seq[(Double, Double)],
      cqAttributes: Seq[(String, CQIndexType)],
      @deprecated("unused")
      lazyDeserialization: Boolean,
      executor: Option[(ScheduledExecutorService, Ticker)]
    )

  case class IndexResolution(x: Int, y: Int)

  sealed trait ExpiryTimeConfig
  case object NeverExpireConfig extends ExpiryTimeConfig
  case object ImmediatelyExpireConfig extends ExpiryTimeConfig
  case class IngestTimeConfig(expiry: Duration) extends ExpiryTimeConfig
  case class EventTimeConfig(expiry: Duration, expression: String, ordered: Boolean) extends ExpiryTimeConfig
  case class FilteredExpiryConfig(expiry: Seq[(String, ExpiryTimeConfig)]) extends ExpiryTimeConfig

  case class LayerViewConfig(typeName: String, filter: Option[Filter], transform: Option[Seq[String]])
  case class LayerView(viewSft: SimpleFeatureType, filter: Option[Filter], transform: Option[Seq[Transform]])
}
