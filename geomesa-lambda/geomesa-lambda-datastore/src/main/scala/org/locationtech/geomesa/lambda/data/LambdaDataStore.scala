/***********************************************************************
 * Copyright (c) 2013-2023 Commonwealth Computer Research, Inc.
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Apache License, Version 2.0
 * which accompanies this distribution and is available at
 * http://www.opensource.org/licenses/apache2.0.php.
 ***********************************************************************/

package org.locationtech.geomesa.lambda.data

import com.github.benmanes.caffeine.cache.{CacheLoader, Caffeine}
import com.typesafe.scalalogging.LazyLogging
import org.apache.kafka.clients.admin.{AdminClient, NewTopic}
import org.geotools.data._
import org.geotools.data.simple.{SimpleFeatureReader, SimpleFeatureSource, SimpleFeatureWriter}
import org.geotools.feature.FeatureTypes
<<<<<<< HEAD
import org.locationtech.geomesa.index.geotools.GeoMesaFeatureReader.HasGeoMesaFeatureReader
=======
>>>>>>> 51a90e7f0 (GEOMESA-3092 Support Lambda NiFi processor (#2777))
import org.locationtech.geomesa.index.geotools.{GeoMesaDataStore, GeoMesaFeatureReader, GeoMesaFeatureStore}
import org.locationtech.geomesa.index.stats.{GeoMesaStats, HasGeoMesaStats, NoopStats}
import org.locationtech.geomesa.lambda.data.LambdaDataStore.LambdaConfig
import org.locationtech.geomesa.lambda.data.LambdaFeatureWriter.{AppendLambdaFeatureWriter, ModifyLambdaFeatureWriter, RequiredVisibilityWriter}
import org.locationtech.geomesa.lambda.stream.kafka.KafkaStore
import org.locationtech.geomesa.lambda.stream.{OffsetManager, TransientStore}
import org.locationtech.geomesa.security.AuthorizationsProvider
import org.locationtech.geomesa.utils.collection.SelfClosingIterator
import org.locationtech.geomesa.utils.conf.GeoMesaSystemProperties.SystemProperty
import org.locationtech.geomesa.utils.geotools.FeatureUtils
import org.locationtech.geomesa.utils.io.{CloseWithLogging, WithClose}
import org.opengis.feature.`type`.Name
import org.opengis.feature.simple.SimpleFeatureType
import org.opengis.filter.Filter

import java.time.Clock
import java.util.{Collections, Properties}
import scala.concurrent.duration.Duration

class LambdaDataStore(val persistence: DataStore, config: LambdaConfig)(implicit clock: Clock = Clock.systemUTC())
<<<<<<< HEAD
    extends DataStore with HasGeoMesaStats with HasGeoMesaFeatureReader with LazyLogging {
=======
    extends DataStore with HasGeoMesaStats with LazyLogging {
>>>>>>> 51a90e7f0 (GEOMESA-3092 Support Lambda NiFi processor (#2777))

  import org.locationtech.geomesa.utils.geotools.RichSimpleFeatureType.RichSimpleFeatureType

  import scala.collection.JavaConverters._

  private val authProvider: Option[AuthorizationsProvider] = persistence match {
    // this is a bit of a hack to work around hbase null vs empty auths
    case ds: GeoMesaDataStore[_] if ds.config.authProvider.getAuthorizations != null => Some(ds.config.authProvider)
    case _ => None
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
=======
>>>>>>> 7ab33423d (GEOMESA-3113 Add system property to managing HBase deletes with visibilities (#2792))
=======
>>>>>>> 40667d637 (GEOMESA-3092 Support Lambda NiFi processor (#2777))
=======
>>>>>>> ee3aea1cd (GEOMESA-3113 Add system property to managing HBase deletes with visibilities (#2792))
=======
>>>>>>> a1362333c (GEOMESA-3113 Add system property to managing HBase deletes with visibilities (#2792))
=======
>>>>>>> 3f50ce5c7 (GEOMESA-3092 Support Lambda NiFi processor (#2777))
=======
>>>>>>> 84634d919 (GEOMESA-3113 Add system property to managing HBase deletes with visibilities (#2792))
=======
>>>>>>> de3e57f03 (GEOMESA-3113 Add system property to managing HBase deletes with visibilities (#2792))
=======
>>>>>>> 113b056da (GEOMESA-3113 Add system property to managing HBase deletes with visibilities (#2792))
=======
=======
>>>>>>> ee3aea1cd (GEOMESA-3113 Add system property to managing HBase deletes with visibilities (#2792))
>>>>>>> 58f72e76c (GEOMESA-3113 Add system property to managing HBase deletes with visibilities (#2792))
=======
>>>>>>> 30d431265 (GEOMESA-3092 Support Lambda NiFi processor (#2777))
=======
>>>>>>> dc17df6c0 (GEOMESA-3113 Add system property to managing HBase deletes with visibilities (#2792))
=======
<<<<<<< HEAD
<<<<<<< HEAD
<<<<<<< HEAD
=======
>>>>>>> 58f72e76c (GEOMESA-3113 Add system property to managing HBase deletes with visibilities (#2792))
>>>>>>> eee5d7ae1 (GEOMESA-3092 Support Lambda NiFi processor (#2777))
=======
>>>>>>> 374ba65da (GEOMESA-3113 Add system property to managing HBase deletes with visibilities (#2792))
=======
<<<<<<< HEAD
>>>>>>> 99fd8486a (GEOMESA-3092 Support Lambda NiFi processor (#2777))
=======
>>>>>>> 5d898c0c5 (GEOMESA-3113 Add system property to managing HBase deletes with visibilities (#2792))
=======
<<<<<<< HEAD
=======
>>>>>>> 30d431265 (GEOMESA-3092 Support Lambda NiFi processor (#2777))
>>>>>>> 98a03c586 (GEOMESA-3092 Support Lambda NiFi processor (#2777))
=======
=======
>>>>>>> ee3aea1cd (GEOMESA-3113 Add system property to managing HBase deletes with visibilities (#2792))
<<<<<<< HEAD
=======
>>>>>>> a1362333c (GEOMESA-3113 Add system property to managing HBase deletes with visibilities (#2792))
=======
>>>>>>> de3e57f03 (GEOMESA-3113 Add system property to managing HBase deletes with visibilities (#2792))
=======
>>>>>>> 113b056da (GEOMESA-3113 Add system property to managing HBase deletes with visibilities (#2792))
=======
>>>>>>> 58f72e76c (GEOMESA-3113 Add system property to managing HBase deletes with visibilities (#2792))
>>>>>>> 1a21a3c30 (GEOMESA-3113 Add system property to managing HBase deletes with visibilities (#2792))
=======
>>>>>>> 9cdd96d1c (GEOMESA-3092 Support Lambda NiFi processor (#2777))
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
>>>>>>> de3e57f03 (GEOMESA-3113 Add system property to managing HBase deletes with visibilities (#2792))
=======
>>>>>>> 58f72e76c (GEOMESA-3113 Add system property to managing HBase deletes with visibilities (#2792))
=======
>>>>>>> dc17df6c0 (GEOMESA-3113 Add system property to managing HBase deletes with visibilities (#2792))
=======
>>>>>>> 374ba65da (GEOMESA-3113 Add system property to managing HBase deletes with visibilities (#2792))
=======
<<<<<<< HEAD
>>>>>>> 98a03c586 (GEOMESA-3092 Support Lambda NiFi processor (#2777))
=======
=======
>>>>>>> dc17df6c0 (GEOMESA-3113 Add system property to managing HBase deletes with visibilities (#2792))
>>>>>>> ee3aea1cd (GEOMESA-3113 Add system property to managing HBase deletes with visibilities (#2792))
=======
=======
<<<<<<< HEAD
>>>>>>> dc17df6c0 (GEOMESA-3113 Add system property to managing HBase deletes with visibilities (#2792))
>>>>>>> a1362333c (GEOMESA-3113 Add system property to managing HBase deletes with visibilities (#2792))
=======
=======
>>>>>>> de3e57f03 (GEOMESA-3113 Add system property to managing HBase deletes with visibilities (#2792))
=======
=======
>>>>>>> 58f72e76c (GEOMESA-3113 Add system property to managing HBase deletes with visibilities (#2792))
>>>>>>> 1a21a3c30 (GEOMESA-3113 Add system property to managing HBase deletes with visibilities (#2792))
>>>>>>> 595c43086 (GEOMESA-3113 Add system property to managing HBase deletes with visibilities (#2792))
<<<<<<< HEAD
<<<<<<< HEAD
<<<<<<< HEAD
<<<<<<< HEAD
<<<<<<< HEAD
<<<<<<< HEAD
<<<<<<< HEAD
<<<<<<< HEAD
=======
>>>>>>> ee3aea1cd (GEOMESA-3113 Add system property to managing HBase deletes with visibilities (#2792))
=======
>>>>>>> a1362333c (GEOMESA-3113 Add system property to managing HBase deletes with visibilities (#2792))
=======
>>>>>>> de3e57f03 (GEOMESA-3113 Add system property to managing HBase deletes with visibilities (#2792))
=======
=======
>>>>>>> ee3aea1cd (GEOMESA-3113 Add system property to managing HBase deletes with visibilities (#2792))
>>>>>>> 58f72e76c (GEOMESA-3113 Add system property to managing HBase deletes with visibilities (#2792))
=======
>>>>>>> 92dccb4d7 (GEOMESA-3092 Support Lambda NiFi processor (#2777))
=======
=======
>>>>>>> 1a21a3c30 (GEOMESA-3113 Add system property to managing HBase deletes with visibilities (#2792))
>>>>>>> 45dca3e07 (GEOMESA-3113 Add system property to managing HBase deletes with visibilities (#2792))
<<<<<<< HEAD
<<<<<<< HEAD
<<<<<<< HEAD
<<<<<<< HEAD
=======
>>>>>>> 113b056da (GEOMESA-3113 Add system property to managing HBase deletes with visibilities (#2792))
=======
>>>>>>> 30d431265 (GEOMESA-3092 Support Lambda NiFi processor (#2777))
=======
>>>>>>> dc17df6c0 (GEOMESA-3113 Add system property to managing HBase deletes with visibilities (#2792))
<<<<<<< HEAD
<<<<<<< HEAD
<<<<<<< HEAD
<<<<<<< HEAD
=======
>>>>>>> 58f72e76c (GEOMESA-3113 Add system property to managing HBase deletes with visibilities (#2792))
=======
>>>>>>> f487c279d (GEOMESA-3092 Support Lambda NiFi processor (#2777))
=======
=======
>>>>>>> 1a21a3c30 (GEOMESA-3113 Add system property to managing HBase deletes with visibilities (#2792))
>>>>>>> 3cb02b7b0 (GEOMESA-3113 Add system property to managing HBase deletes with visibilities (#2792))
<<<<<<< HEAD
=======
>>>>>>> eee5d7ae1 (GEOMESA-3092 Support Lambda NiFi processor (#2777))
=======
>>>>>>> 374ba65da (GEOMESA-3113 Add system property to managing HBase deletes with visibilities (#2792))
<<<<<<< HEAD
=======
=======
>>>>>>> 92dccb4d7 (GEOMESA-3092 Support Lambda NiFi processor (#2777))
>>>>>>> 99fd8486a (GEOMESA-3092 Support Lambda NiFi processor (#2777))
=======
>>>>>>> 5d898c0c5 (GEOMESA-3113 Add system property to managing HBase deletes with visibilities (#2792))
<<<<<<< HEAD
=======
=======
>>>>>>> 30d431265 (GEOMESA-3092 Support Lambda NiFi processor (#2777))
>>>>>>> 98a03c586 (GEOMESA-3092 Support Lambda NiFi processor (#2777))
=======
>>>>>>> ee3aea1cd (GEOMESA-3113 Add system property to managing HBase deletes with visibilities (#2792))
<<<<<<< HEAD
=======
>>>>>>> b36757a53 (GEOMESA-3092 Support Lambda NiFi processor (#2777))
=======
=======
>>>>>>> 1a21a3c30 (GEOMESA-3113 Add system property to managing HBase deletes with visibilities (#2792))
>>>>>>> f8f49130b (GEOMESA-3113 Add system property to managing HBase deletes with visibilities (#2792))
=======
=======
>>>>>>> 0cdf3f267 (GEOMESA-3113 Add system property to managing HBase deletes with visibilities (#2792))
=======
>>>>>>> ad8d1be45 (GEOMESA-3113 Add system property to managing HBase deletes with visibilities (#2792))
=======
>>>>>>> 1a21a3c30 (GEOMESA-3113 Add system property to managing HBase deletes with visibilities (#2792))
=======
>>>>>>> 9cdd96d1c (GEOMESA-3092 Support Lambda NiFi processor (#2777))
<<<<<<< HEAD
<<<<<<< HEAD
>>>>>>> b5c172e61 (GEOMESA-3092 Support Lambda NiFi processor (#2777))
=======
=======
>>>>>>> ad8d1be45 (GEOMESA-3113 Add system property to managing HBase deletes with visibilities (#2792))
=======
=======
>>>>>>> 1a21a3c30 (GEOMESA-3113 Add system property to managing HBase deletes with visibilities (#2792))
>>>>>>> 595c43086 (GEOMESA-3113 Add system property to managing HBase deletes with visibilities (#2792))
<<<<<<< HEAD
>>>>>>> 0cdf3f267 (GEOMESA-3113 Add system property to managing HBase deletes with visibilities (#2792))
=======
>>>>>>> 3be8d2a5a (Merge branch 'feature/postgis-fixes')
=======
>>>>>>> 468ab7139 (GEOMESA-3092 Support Lambda NiFi processor (#2777))
=======
=======
>>>>>>> 1a21a3c30 (GEOMESA-3113 Add system property to managing HBase deletes with visibilities (#2792))
>>>>>>> c6103aab4 (GEOMESA-3113 Add system property to managing HBase deletes with visibilities (#2792))
=======
=======
>>>>>>> 1a21a3c30 (GEOMESA-3113 Add system property to managing HBase deletes with visibilities (#2792))
=======
>>>>>>> 9cdd96d1c (GEOMESA-3092 Support Lambda NiFi processor (#2777))
>>>>>>> 1cc1e5df3 (GEOMESA-3092 Support Lambda NiFi processor (#2777))
=======
>>>>>>> ad8d1be45 (GEOMESA-3113 Add system property to managing HBase deletes with visibilities (#2792))
=======
=======
>>>>>>> 92dccb4d7 (GEOMESA-3092 Support Lambda NiFi processor (#2777))
>>>>>>> 40667d637 (GEOMESA-3092 Support Lambda NiFi processor (#2777))
=======
>>>>>>> 7ab33423d (GEOMESA-3113 Add system property to managing HBase deletes with visibilities (#2792))
=======
>>>>>>> a1362333c (GEOMESA-3113 Add system property to managing HBase deletes with visibilities (#2792))
=======
=======
>>>>>>> f487c279d (GEOMESA-3092 Support Lambda NiFi processor (#2777))
>>>>>>> 3f50ce5c7 (GEOMESA-3092 Support Lambda NiFi processor (#2777))
=======
>>>>>>> 84634d919 (GEOMESA-3113 Add system property to managing HBase deletes with visibilities (#2792))
=======
>>>>>>> de3e57f03 (GEOMESA-3113 Add system property to managing HBase deletes with visibilities (#2792))
=======
>>>>>>> 113b056da (GEOMESA-3113 Add system property to managing HBase deletes with visibilities (#2792))
=======
>>>>>>> 58f72e76c (GEOMESA-3113 Add system property to managing HBase deletes with visibilities (#2792))
  private [lambda] val transients = Caffeine.newBuilder().build[String, TransientStore](
    new CacheLoader[String, TransientStore] {
      override def load(key: String): TransientStore =
        new KafkaStore(persistence, persistence.getSchema(key), authProvider, config)
    }
  )
<<<<<<< HEAD
<<<<<<< HEAD
<<<<<<< HEAD
<<<<<<< HEAD
<<<<<<< HEAD
<<<<<<< HEAD
<<<<<<< HEAD
<<<<<<< HEAD
<<<<<<< HEAD
<<<<<<< HEAD
<<<<<<< HEAD
<<<<<<< HEAD
<<<<<<< HEAD
<<<<<<< HEAD
<<<<<<< HEAD
<<<<<<< HEAD
<<<<<<< HEAD
<<<<<<< HEAD
<<<<<<< HEAD
<<<<<<< HEAD
<<<<<<< HEAD
<<<<<<< HEAD
<<<<<<< HEAD
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
>>>>>>> 9cdd96d1c (GEOMESA-3092 Support Lambda NiFi processor (#2777))
>>>>>>> 1cc1e5df3 (GEOMESA-3092 Support Lambda NiFi processor (#2777))
=======
>>>>>>> c6103aab4 (GEOMESA-3113 Add system property to managing HBase deletes with visibilities (#2792))
=======
=======
>>>>>>> 9cdd96d1c (GEOMESA-3092 Support Lambda NiFi processor (#2777))
>>>>>>> b5c172e61 (GEOMESA-3092 Support Lambda NiFi processor (#2777))
=======
>>>>>>> f8f49130b (GEOMESA-3113 Add system property to managing HBase deletes with visibilities (#2792))
=======
>>>>>>> de3e57f03 (GEOMESA-3113 Add system property to managing HBase deletes with visibilities (#2792))
=======
>>>>>>> 113b056da (GEOMESA-3113 Add system property to managing HBase deletes with visibilities (#2792))
=======
>>>>>>> 58f72e76c (GEOMESA-3113 Add system property to managing HBase deletes with visibilities (#2792))
=======
=======
>>>>>>> 9cdd96d1c (GEOMESA-3092 Support Lambda NiFi processor (#2777))
>>>>>>> eee5d7ae1 (GEOMESA-3092 Support Lambda NiFi processor (#2777))
=======
>>>>>>> 3cb02b7b0 (GEOMESA-3113 Add system property to managing HBase deletes with visibilities (#2792))
=======
>>>>>>> 3f50ce5c7 (GEOMESA-3092 Support Lambda NiFi processor (#2777))
=======
=======
>>>>>>> 3cb02b7b0 (GEOMESA-3113 Add system property to managing HBase deletes with visibilities (#2792))
>>>>>>> 84634d919 (GEOMESA-3113 Add system property to managing HBase deletes with visibilities (#2792))
=======
>>>>>>> dc17df6c0 (GEOMESA-3113 Add system property to managing HBase deletes with visibilities (#2792))
=======
>>>>>>> 374ba65da (GEOMESA-3113 Add system property to managing HBase deletes with visibilities (#2792))
=======
<<<<<<< HEAD
>>>>>>> 99fd8486a (GEOMESA-3092 Support Lambda NiFi processor (#2777))
=======
>>>>>>> 5d898c0c5 (GEOMESA-3113 Add system property to managing HBase deletes with visibilities (#2792))
=======
<<<<<<< HEAD
>>>>>>> 98a03c586 (GEOMESA-3092 Support Lambda NiFi processor (#2777))
=======
=======
>>>>>>> dc17df6c0 (GEOMESA-3113 Add system property to managing HBase deletes with visibilities (#2792))
>>>>>>> ee3aea1cd (GEOMESA-3113 Add system property to managing HBase deletes with visibilities (#2792))
=======
<<<<<<< HEAD
>>>>>>> 0cdf3f267 (GEOMESA-3113 Add system property to managing HBase deletes with visibilities (#2792))
=======
>>>>>>> ad8d1be45 (GEOMESA-3113 Add system property to managing HBase deletes with visibilities (#2792))
=======
>>>>>>> 40667d637 (GEOMESA-3092 Support Lambda NiFi processor (#2777))
=======
>>>>>>> 7ab33423d (GEOMESA-3113 Add system property to managing HBase deletes with visibilities (#2792))
=======
=======
>>>>>>> dc17df6c0 (GEOMESA-3113 Add system property to managing HBase deletes with visibilities (#2792))
>>>>>>> a1362333c (GEOMESA-3113 Add system property to managing HBase deletes with visibilities (#2792))
=======
=======
>>>>>>> de3e57f03 (GEOMESA-3113 Add system property to managing HBase deletes with visibilities (#2792))
=======
>>>>>>> 113b056da (GEOMESA-3113 Add system property to managing HBase deletes with visibilities (#2792))
=======
>>>>>>> 58f72e76c (GEOMESA-3113 Add system property to managing HBase deletes with visibilities (#2792))
>>>>>>> 9cdd96d1c (GEOMESA-3092 Support Lambda NiFi processor (#2777))
=======
>>>>>>> 595c43086 (GEOMESA-3113 Add system property to managing HBase deletes with visibilities (#2792))
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
>>>>>>> ee3aea1cd (GEOMESA-3113 Add system property to managing HBase deletes with visibilities (#2792))
=======
>>>>>>> a1362333c (GEOMESA-3113 Add system property to managing HBase deletes with visibilities (#2792))
=======
>>>>>>> de3e57f03 (GEOMESA-3113 Add system property to managing HBase deletes with visibilities (#2792))
=======
=======
>>>>>>> ee3aea1cd (GEOMESA-3113 Add system property to managing HBase deletes with visibilities (#2792))
>>>>>>> 58f72e76c (GEOMESA-3113 Add system property to managing HBase deletes with visibilities (#2792))
>>>>>>> 92dccb4d7 (GEOMESA-3092 Support Lambda NiFi processor (#2777))
=======
>>>>>>> 45dca3e07 (GEOMESA-3113 Add system property to managing HBase deletes with visibilities (#2792))
=======
<<<<<<< HEAD
<<<<<<< HEAD
<<<<<<< HEAD
<<<<<<< HEAD
=======
>>>>>>> 98a03c586 (GEOMESA-3092 Support Lambda NiFi processor (#2777))
=======
>>>>>>> 113b056da (GEOMESA-3113 Add system property to managing HBase deletes with visibilities (#2792))
=======
>>>>>>> 9cdd96d1c (GEOMESA-3092 Support Lambda NiFi processor (#2777))
>>>>>>> 30d431265 (GEOMESA-3092 Support Lambda NiFi processor (#2777))
=======
<<<<<<< HEAD
<<<<<<< HEAD
<<<<<<< HEAD
<<<<<<< HEAD
=======
>>>>>>> 58f72e76c (GEOMESA-3113 Add system property to managing HBase deletes with visibilities (#2792))
=======
>>>>>>> dc17df6c0 (GEOMESA-3113 Add system property to managing HBase deletes with visibilities (#2792))
=======
=======
>>>>>>> f487c279d (GEOMESA-3092 Support Lambda NiFi processor (#2777))
<<<<<<< HEAD
<<<<<<< HEAD
=======
>>>>>>> 374ba65da (GEOMESA-3113 Add system property to managing HBase deletes with visibilities (#2792))
=======
>>>>>>> 92dccb4d7 (GEOMESA-3092 Support Lambda NiFi processor (#2777))
=======
>>>>>>> 99fd8486a (GEOMESA-3092 Support Lambda NiFi processor (#2777))
=======
>>>>>>> 5d898c0c5 (GEOMESA-3113 Add system property to managing HBase deletes with visibilities (#2792))
<<<<<<< HEAD
=======
>>>>>>> 98a03c586 (GEOMESA-3092 Support Lambda NiFi processor (#2777))
=======
=======
>>>>>>> dc17df6c0 (GEOMESA-3113 Add system property to managing HBase deletes with visibilities (#2792))
>>>>>>> ee3aea1cd (GEOMESA-3113 Add system property to managing HBase deletes with visibilities (#2792))
<<<<<<< HEAD
=======
=======
>>>>>>> b36757a53 (GEOMESA-3092 Support Lambda NiFi processor (#2777))
=======
>>>>>>> 0cdf3f267 (GEOMESA-3113 Add system property to managing HBase deletes with visibilities (#2792))
=======
=======
>>>>>>> 468ab7139 (GEOMESA-3092 Support Lambda NiFi processor (#2777))
=======
>>>>>>> ad8d1be45 (GEOMESA-3113 Add system property to managing HBase deletes with visibilities (#2792))
=======
>>>>>>> 92dccb4d7 (GEOMESA-3092 Support Lambda NiFi processor (#2777))
=======
>>>>>>> 40667d637 (GEOMESA-3092 Support Lambda NiFi processor (#2777))
=======
>>>>>>> 7ab33423d (GEOMESA-3113 Add system property to managing HBase deletes with visibilities (#2792))
=======
=======
>>>>>>> dc17df6c0 (GEOMESA-3113 Add system property to managing HBase deletes with visibilities (#2792))
>>>>>>> a1362333c (GEOMESA-3113 Add system property to managing HBase deletes with visibilities (#2792))
=======
>>>>>>> 3f50ce5c7 (GEOMESA-3092 Support Lambda NiFi processor (#2777))
=======
=======
>>>>>>> 374ba65da (GEOMESA-3113 Add system property to managing HBase deletes with visibilities (#2792))
>>>>>>> de3e57f03 (GEOMESA-3113 Add system property to managing HBase deletes with visibilities (#2792))
=======
>>>>>>> 113b056da (GEOMESA-3113 Add system property to managing HBase deletes with visibilities (#2792))
=======
>>>>>>> 58f72e76c (GEOMESA-3113 Add system property to managing HBase deletes with visibilities (#2792))
  private [lambda] val transients = Caffeine.newBuilder().build(new CacheLoader[String, TransientStore] {
    override def load(key: String): TransientStore =
      new KafkaStore(persistence, persistence.getSchema(key), authProvider, config)
  })
>>>>>>> 51a90e7f0 (GEOMESA-3092 Support Lambda NiFi processor (#2777))
<<<<<<< HEAD
<<<<<<< HEAD
<<<<<<< HEAD
<<<<<<< HEAD
<<<<<<< HEAD
<<<<<<< HEAD
<<<<<<< HEAD
<<<<<<< HEAD
<<<<<<< HEAD
<<<<<<< HEAD
<<<<<<< HEAD
<<<<<<< HEAD
<<<<<<< HEAD
<<<<<<< HEAD
<<<<<<< HEAD
<<<<<<< HEAD
<<<<<<< HEAD
<<<<<<< HEAD
<<<<<<< HEAD
<<<<<<< HEAD
<<<<<<< HEAD
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
>>>>>>> 7ab33423d (GEOMESA-3113 Add system property to managing HBase deletes with visibilities (#2792))
=======
>>>>>>> 40667d637 (GEOMESA-3092 Support Lambda NiFi processor (#2777))
=======
>>>>>>> ee3aea1cd (GEOMESA-3113 Add system property to managing HBase deletes with visibilities (#2792))
=======
>>>>>>> a1362333c (GEOMESA-3113 Add system property to managing HBase deletes with visibilities (#2792))
=======
>>>>>>> 3f50ce5c7 (GEOMESA-3092 Support Lambda NiFi processor (#2777))
=======
>>>>>>> 84634d919 (GEOMESA-3113 Add system property to managing HBase deletes with visibilities (#2792))
=======
>>>>>>> de3e57f03 (GEOMESA-3113 Add system property to managing HBase deletes with visibilities (#2792))
=======
>>>>>>> 113b056da (GEOMESA-3113 Add system property to managing HBase deletes with visibilities (#2792))
=======
=======
>>>>>>> ee3aea1cd (GEOMESA-3113 Add system property to managing HBase deletes with visibilities (#2792))
>>>>>>> 58f72e76c (GEOMESA-3113 Add system property to managing HBase deletes with visibilities (#2792))
=======
>>>>>>> 30d431265 (GEOMESA-3092 Support Lambda NiFi processor (#2777))
=======
>>>>>>> dc17df6c0 (GEOMESA-3113 Add system property to managing HBase deletes with visibilities (#2792))
=======
<<<<<<< HEAD
<<<<<<< HEAD
<<<<<<< HEAD
=======
>>>>>>> 58f72e76c (GEOMESA-3113 Add system property to managing HBase deletes with visibilities (#2792))
>>>>>>> eee5d7ae1 (GEOMESA-3092 Support Lambda NiFi processor (#2777))
=======
>>>>>>> 374ba65da (GEOMESA-3113 Add system property to managing HBase deletes with visibilities (#2792))
=======
<<<<<<< HEAD
>>>>>>> 99fd8486a (GEOMESA-3092 Support Lambda NiFi processor (#2777))
=======
>>>>>>> 5d898c0c5 (GEOMESA-3113 Add system property to managing HBase deletes with visibilities (#2792))
=======
<<<<<<< HEAD
=======
>>>>>>> 30d431265 (GEOMESA-3092 Support Lambda NiFi processor (#2777))
>>>>>>> 98a03c586 (GEOMESA-3092 Support Lambda NiFi processor (#2777))
=======
=======
>>>>>>> ee3aea1cd (GEOMESA-3113 Add system property to managing HBase deletes with visibilities (#2792))
<<<<<<< HEAD
=======
>>>>>>> a1362333c (GEOMESA-3113 Add system property to managing HBase deletes with visibilities (#2792))
=======
>>>>>>> de3e57f03 (GEOMESA-3113 Add system property to managing HBase deletes with visibilities (#2792))
=======
>>>>>>> 113b056da (GEOMESA-3113 Add system property to managing HBase deletes with visibilities (#2792))
=======
>>>>>>> 58f72e76c (GEOMESA-3113 Add system property to managing HBase deletes with visibilities (#2792))
>>>>>>> 1a21a3c30 (GEOMESA-3113 Add system property to managing HBase deletes with visibilities (#2792))
=======
>>>>>>> 9cdd96d1c (GEOMESA-3092 Support Lambda NiFi processor (#2777))
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
>>>>>>> de3e57f03 (GEOMESA-3113 Add system property to managing HBase deletes with visibilities (#2792))
=======
>>>>>>> 58f72e76c (GEOMESA-3113 Add system property to managing HBase deletes with visibilities (#2792))
=======
>>>>>>> dc17df6c0 (GEOMESA-3113 Add system property to managing HBase deletes with visibilities (#2792))
=======
>>>>>>> 374ba65da (GEOMESA-3113 Add system property to managing HBase deletes with visibilities (#2792))
=======
<<<<<<< HEAD
>>>>>>> 98a03c586 (GEOMESA-3092 Support Lambda NiFi processor (#2777))
=======
=======
>>>>>>> dc17df6c0 (GEOMESA-3113 Add system property to managing HBase deletes with visibilities (#2792))
>>>>>>> ee3aea1cd (GEOMESA-3113 Add system property to managing HBase deletes with visibilities (#2792))
=======
=======
<<<<<<< HEAD
>>>>>>> dc17df6c0 (GEOMESA-3113 Add system property to managing HBase deletes with visibilities (#2792))
>>>>>>> a1362333c (GEOMESA-3113 Add system property to managing HBase deletes with visibilities (#2792))
=======
=======
>>>>>>> de3e57f03 (GEOMESA-3113 Add system property to managing HBase deletes with visibilities (#2792))
=======
=======
>>>>>>> 58f72e76c (GEOMESA-3113 Add system property to managing HBase deletes with visibilities (#2792))
>>>>>>> 1a21a3c30 (GEOMESA-3113 Add system property to managing HBase deletes with visibilities (#2792))
>>>>>>> 595c43086 (GEOMESA-3113 Add system property to managing HBase deletes with visibilities (#2792))
<<<<<<< HEAD
<<<<<<< HEAD
<<<<<<< HEAD
<<<<<<< HEAD
<<<<<<< HEAD
<<<<<<< HEAD
<<<<<<< HEAD
<<<<<<< HEAD
=======
>>>>>>> ee3aea1cd (GEOMESA-3113 Add system property to managing HBase deletes with visibilities (#2792))
=======
>>>>>>> a1362333c (GEOMESA-3113 Add system property to managing HBase deletes with visibilities (#2792))
=======
>>>>>>> de3e57f03 (GEOMESA-3113 Add system property to managing HBase deletes with visibilities (#2792))
=======
=======
>>>>>>> ee3aea1cd (GEOMESA-3113 Add system property to managing HBase deletes with visibilities (#2792))
>>>>>>> 58f72e76c (GEOMESA-3113 Add system property to managing HBase deletes with visibilities (#2792))
=======
>>>>>>> 92dccb4d7 (GEOMESA-3092 Support Lambda NiFi processor (#2777))
=======
=======
>>>>>>> 1a21a3c30 (GEOMESA-3113 Add system property to managing HBase deletes with visibilities (#2792))
>>>>>>> 45dca3e07 (GEOMESA-3113 Add system property to managing HBase deletes with visibilities (#2792))
<<<<<<< HEAD
<<<<<<< HEAD
<<<<<<< HEAD
<<<<<<< HEAD
=======
>>>>>>> 113b056da (GEOMESA-3113 Add system property to managing HBase deletes with visibilities (#2792))
=======
>>>>>>> 30d431265 (GEOMESA-3092 Support Lambda NiFi processor (#2777))
=======
>>>>>>> dc17df6c0 (GEOMESA-3113 Add system property to managing HBase deletes with visibilities (#2792))
<<<<<<< HEAD
<<<<<<< HEAD
<<<<<<< HEAD
<<<<<<< HEAD
=======
>>>>>>> 58f72e76c (GEOMESA-3113 Add system property to managing HBase deletes with visibilities (#2792))
=======
>>>>>>> f487c279d (GEOMESA-3092 Support Lambda NiFi processor (#2777))
=======
=======
>>>>>>> 1a21a3c30 (GEOMESA-3113 Add system property to managing HBase deletes with visibilities (#2792))
>>>>>>> 3cb02b7b0 (GEOMESA-3113 Add system property to managing HBase deletes with visibilities (#2792))
<<<<<<< HEAD
=======
>>>>>>> eee5d7ae1 (GEOMESA-3092 Support Lambda NiFi processor (#2777))
=======
>>>>>>> 374ba65da (GEOMESA-3113 Add system property to managing HBase deletes with visibilities (#2792))
<<<<<<< HEAD
=======
=======
>>>>>>> 92dccb4d7 (GEOMESA-3092 Support Lambda NiFi processor (#2777))
>>>>>>> 99fd8486a (GEOMESA-3092 Support Lambda NiFi processor (#2777))
=======
>>>>>>> 5d898c0c5 (GEOMESA-3113 Add system property to managing HBase deletes with visibilities (#2792))
<<<<<<< HEAD
=======
=======
>>>>>>> 30d431265 (GEOMESA-3092 Support Lambda NiFi processor (#2777))
>>>>>>> 98a03c586 (GEOMESA-3092 Support Lambda NiFi processor (#2777))
=======
>>>>>>> ee3aea1cd (GEOMESA-3113 Add system property to managing HBase deletes with visibilities (#2792))
<<<<<<< HEAD
=======
>>>>>>> b36757a53 (GEOMESA-3092 Support Lambda NiFi processor (#2777))
=======
=======
>>>>>>> 1a21a3c30 (GEOMESA-3113 Add system property to managing HBase deletes with visibilities (#2792))
>>>>>>> f8f49130b (GEOMESA-3113 Add system property to managing HBase deletes with visibilities (#2792))
=======
=======
>>>>>>> 0cdf3f267 (GEOMESA-3113 Add system property to managing HBase deletes with visibilities (#2792))
=======
>>>>>>> ad8d1be45 (GEOMESA-3113 Add system property to managing HBase deletes with visibilities (#2792))
=======
>>>>>>> 1a21a3c30 (GEOMESA-3113 Add system property to managing HBase deletes with visibilities (#2792))
=======
>>>>>>> 9cdd96d1c (GEOMESA-3092 Support Lambda NiFi processor (#2777))
<<<<<<< HEAD
<<<<<<< HEAD
>>>>>>> b5c172e61 (GEOMESA-3092 Support Lambda NiFi processor (#2777))
=======
=======
>>>>>>> ad8d1be45 (GEOMESA-3113 Add system property to managing HBase deletes with visibilities (#2792))
=======
=======
>>>>>>> 1a21a3c30 (GEOMESA-3113 Add system property to managing HBase deletes with visibilities (#2792))
>>>>>>> 595c43086 (GEOMESA-3113 Add system property to managing HBase deletes with visibilities (#2792))
<<<<<<< HEAD
>>>>>>> 0cdf3f267 (GEOMESA-3113 Add system property to managing HBase deletes with visibilities (#2792))
=======
>>>>>>> 3be8d2a5a (Merge branch 'feature/postgis-fixes')
=======
>>>>>>> 468ab7139 (GEOMESA-3092 Support Lambda NiFi processor (#2777))
=======
=======
>>>>>>> 1a21a3c30 (GEOMESA-3113 Add system property to managing HBase deletes with visibilities (#2792))
>>>>>>> c6103aab4 (GEOMESA-3113 Add system property to managing HBase deletes with visibilities (#2792))
=======
=======
>>>>>>> 1a21a3c30 (GEOMESA-3113 Add system property to managing HBase deletes with visibilities (#2792))
=======
>>>>>>> 9cdd96d1c (GEOMESA-3092 Support Lambda NiFi processor (#2777))
>>>>>>> 1cc1e5df3 (GEOMESA-3092 Support Lambda NiFi processor (#2777))
=======
>>>>>>> ad8d1be45 (GEOMESA-3113 Add system property to managing HBase deletes with visibilities (#2792))
=======
=======
>>>>>>> 92dccb4d7 (GEOMESA-3092 Support Lambda NiFi processor (#2777))
>>>>>>> 40667d637 (GEOMESA-3092 Support Lambda NiFi processor (#2777))
=======
>>>>>>> 7ab33423d (GEOMESA-3113 Add system property to managing HBase deletes with visibilities (#2792))
=======
>>>>>>> a1362333c (GEOMESA-3113 Add system property to managing HBase deletes with visibilities (#2792))
=======
=======
>>>>>>> f487c279d (GEOMESA-3092 Support Lambda NiFi processor (#2777))
>>>>>>> 3f50ce5c7 (GEOMESA-3092 Support Lambda NiFi processor (#2777))
=======
>>>>>>> 84634d919 (GEOMESA-3113 Add system property to managing HBase deletes with visibilities (#2792))
=======
>>>>>>> de3e57f03 (GEOMESA-3113 Add system property to managing HBase deletes with visibilities (#2792))
=======
>>>>>>> 113b056da (GEOMESA-3113 Add system property to managing HBase deletes with visibilities (#2792))
=======
>>>>>>> 58f72e76c (GEOMESA-3113 Add system property to managing HBase deletes with visibilities (#2792))

  override val stats: GeoMesaStats = persistence match {
    case p: HasGeoMesaStats => new LambdaStats(p.stats, transients)
    case _ => NoopStats
  }

  private val runner = new LambdaQueryRunner(this, persistence, transients)

  def persist(typeName: String): Unit = transients.get(typeName).persist()

  override def getTypeNames: Array[String] = persistence.getTypeNames

  override def getNames: java.util.List[Name] = persistence.getNames

  override def createSchema(sft: SimpleFeatureType): Unit = {
    persistence.createSchema(sft)
    // TODO for some reason lambda qs consumers don't rebalance when the topic is created after the consumers...
    // transients.get(sft.getTypeName).createSchema()
    val topic = KafkaStore.topic(config.zkNamespace, sft)
    val props = new Properties()
    config.producerConfig.foreach { case (k, v) => props.put(k, v) }

    WithClose(AdminClient.create(props)) { admin =>
      if (admin.listTopics().names().get.contains(topic)) {
        logger.warn(s"Topic [$topic] already exists - it may contain stale data")
      } else {
        val replication = SystemProperty("geomesa.kafka.replication").option.map(_.toInt).getOrElse(1)
        val newTopic = new NewTopic(topic, config.partitions, replication.toShort)
        admin.createTopics(Collections.singletonList(newTopic)).all().get
      }
    }
  }

  override def getSchema(typeName: Name): SimpleFeatureType = getSchema(typeName.getLocalPart)

  override def getSchema(typeName: String): SimpleFeatureType = {
    val sft = persistence.getSchema(typeName)
    if (sft != null) {
      // load our transient store so it starts caching features, etc
      transients.get(typeName)
    }
    sft
  }

  override def updateSchema(typeName: Name, featureType: SimpleFeatureType): Unit =
    updateSchema(typeName.getLocalPart, featureType)

  override def updateSchema(typeName: String, featureType: SimpleFeatureType): Unit = {
    val transient = transients.get(typeName)
    if (typeName != featureType.getTypeName) {
      // ensure that we've loaded the entire kafka topic
      logger.debug("Update schema: entering quiet period")
      Thread.sleep(SystemProperty("geomesa.lambda.update.quiet.period", "10 seconds").toDuration.get.toMillis)
      WithClose(transient.read().iterator()) { toPersist =>
        if (toPersist.nonEmpty) {
          logger.debug("Update schema: persisting transient features")
          WithClose(persistence.getFeatureWriter(typeName, Transaction.AUTO_COMMIT)) { writer =>
            toPersist.foreach(FeatureUtils.write(writer, _, useProvidedFid = true))
          }
        }
      }
    }
    CloseWithLogging(transient)
    transients.invalidate(typeName)
    persistence.updateSchema(typeName, featureType)
  }

  override def removeSchema(typeName: Name): Unit = removeSchema(typeName.getLocalPart)

  override def removeSchema(typeName: String): Unit = {
    // note: call transient first, as it may rely on the schema being present
    val transient = transients.get(typeName)
    transient.removeSchema()
    CloseWithLogging(transient)
    transients.invalidate(typeName)
    persistence.removeSchema(typeName)
  }

  override def getFeatureSource(typeName: Name): SimpleFeatureSource = getFeatureSource(typeName.getLocalPart)

  override def getFeatureSource(typeName: String): SimpleFeatureSource =
    new GeoMesaFeatureStore(this, getSchema(typeName))

  override def getFeatureReader(query: Query, transaction: Transaction): SimpleFeatureReader =
    getFeatureReader(getSchema(query.getTypeName), transaction, query).reader()

  override private[geomesa] def getFeatureReader(
      sft: SimpleFeatureType,
      transaction: Transaction,
      query: Query): GeoMesaFeatureReader = {
    GeoMesaFeatureReader(sft, query, runner, None)
  }

  override def getFeatureWriterAppend(typeName: String, transaction: Transaction): SimpleFeatureWriter = {
    val transient = transients.get(typeName)
    if (transient.sft.isVisibilityRequired) {
      new AppendLambdaFeatureWriter(transient) with RequiredVisibilityWriter
    } else {
      new AppendLambdaFeatureWriter(transient)
    }
  }

  override def getFeatureWriter(typeName: String, transaction: Transaction): SimpleFeatureWriter =
    getFeatureWriter(typeName, Filter.INCLUDE, transaction)

  override def getFeatureWriter(typeName: String,
                                filter: Filter,
                                transaction: Transaction): SimpleFeatureWriter= {
    val query = new Query(typeName, filter)
    val features = SelfClosingIterator(getFeatureReader(query, transaction))
    val transient = transients.get(typeName)
    if (transient.sft.isVisibilityRequired) {
      new ModifyLambdaFeatureWriter(transient, features) with RequiredVisibilityWriter
    } else {
      new ModifyLambdaFeatureWriter(transient, features)
    }
  }

  override def dispose(): Unit = {
    CloseWithLogging(transients.asMap.asScala.values)
    transients.invalidateAll()
    CloseWithLogging(config.offsetManager)
    persistence.dispose()
  }

  override def getInfo: ServiceInfo = {
    val info = new DefaultServiceInfo()
    info.setDescription(s"Features from ${getClass.getSimpleName}")
    info.setSchema(FeatureTypes.DEFAULT_NAMESPACE)
    info
  }

  override def getLockingManager: LockingManager = null
}

object LambdaDataStore {
  case class LambdaConfig(
      zookeepers: String,
      zkNamespace: String,
      producerConfig: Map[String, String],
      consumerConfig: Map[String, String],
      partitions: Int,
      consumers: Int,
      expiry: Duration,
      persist: Boolean,
      offsetManager: OffsetManager
    )
}
