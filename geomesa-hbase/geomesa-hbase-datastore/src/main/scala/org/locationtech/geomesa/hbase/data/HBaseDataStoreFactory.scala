/***********************************************************************
 * Copyright (c) 2013-2024 Commonwealth Computer Research, Inc.
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Apache License, Version 2.0
 * which accompanies this distribution and is available at
 * http://www.opensource.org/licenses/apache2.0.php.
 ***********************************************************************/

package org.locationtech.geomesa.hbase.data

import com.typesafe.scalalogging.LazyLogging
import org.apache.hadoop.fs.Path
import org.apache.hadoop.hbase.HBaseConfiguration
import org.apache.hadoop.hbase.client.Connection
import org.apache.hadoop.hbase.security.visibility.VisibilityClient
import org.apache.hadoop.security.UserGroupInformation
<<<<<<< HEAD
import org.geotools.api.data.DataAccessFactory.Param
import org.geotools.api.data.{DataStore, DataStoreFactorySpi}
=======
import org.geotools.data.DataAccessFactory.Param
import org.geotools.data.{DataStore, DataStoreFactorySpi}
<<<<<<< HEAD
<<<<<<< HEAD
<<<<<<< HEAD
<<<<<<< HEAD
<<<<<<< HEAD
<<<<<<< HEAD
<<<<<<< HEAD
<<<<<<< HEAD
<<<<<<< HEAD
<<<<<<< HEAD
>>>>>>> 69a1e5094b5 (GEOMESA-3092 Support Lambda NiFi processor (#2777))
=======
<<<<<<< HEAD
>>>>>>> 276558f47d3 (GEOMESA-3092 Support Lambda NiFi processor (#2777))
=======
<<<<<<< HEAD
>>>>>>> 0884e75348d (GEOMESA-3254 Add Bloop build support)
=======
<<<<<<< HEAD
>>>>>>> 4a4bbd8ec03 (GEOMESA-3254 Add Bloop build support)
=======
<<<<<<< HEAD
>>>>>>> a76720eebac (GEOMESA-3092 Support Lambda NiFi processor (#2777))
=======
<<<<<<< HEAD
>>>>>>> 76c1a24bd97 (GEOMESA-3267 HBase, Accumulo - Fix potential deadlocks in data store factory)
=======
<<<<<<< HEAD
>>>>>>> 86b0d1c7db5 (GEOMESA-3092 Support Lambda NiFi processor (#2777))
=======
<<<<<<< HEAD
>>>>>>> a7f5e1b710f (GEOMESA-3092 Support Lambda NiFi processor (#2777))
=======
<<<<<<< HEAD
>>>>>>> 15b6bf02d15 (GEOMESA-3254 Add Bloop build support)
=======
<<<<<<< HEAD
>>>>>>> eb0bd279638 (GEOMESA-3254 Add Bloop build support)
import org.locationtech.geomesa.hbase.HBaseSystemProperties
=======
import org.locationtech.geomesa.hbase.data.HBaseConnectionPool.ConnectionWrapper
>>>>>>> 51a90e7f04 (GEOMESA-3092 Support Lambda NiFi processor (#2777))
=======
=======
import org.locationtech.geomesa.hbase.data.HBaseConnectionPool.ConnectionWrapper
>>>>>>> 51a90e7f0 (GEOMESA-3092 Support Lambda NiFi processor (#2777))
>>>>>>> 120815d0b0 (GEOMESA-3092 Support Lambda NiFi processor (#2777))
=======
>>>>>>> d845d7c1bd (GEOMESA-3254 Add Bloop build support)
=======
>>>>>>> 58d14a257e (GEOMESA-3254 Add Bloop build support)
=======
=======
import org.locationtech.geomesa.hbase.data.HBaseConnectionPool.ConnectionWrapper
>>>>>>> 51a90e7f0 (GEOMESA-3092 Support Lambda NiFi processor (#2777))
>>>>>>> 234aacdc12 (GEOMESA-3092 Support Lambda NiFi processor (#2777))
=======
=======
>>>>>>> 16f912e1ef (GEOMESA-3092 Support Lambda NiFi processor (#2777))
=======
>>>>>>> fd675cc6b6 (GEOMESA-3092 Support Lambda NiFi processor (#2777))
=======
>>>>>>> 63a045a753 (GEOMESA-3254 Add Bloop build support)
=======
>>>>>>> fa60953a42 (GEOMESA-3254 Add Bloop build support)
=======
import org.locationtech.geomesa.hbase.data.HBaseConnectionPool.ConnectionWrapper
>>>>>>> 51a90e7f0 (GEOMESA-3092 Support Lambda NiFi processor (#2777))
=======
import org.locationtech.geomesa.hbase.HBaseSystemProperties
>>>>>>> 8c776df44 (GEOMESA-3267 HBase, Accumulo - Fix potential deadlocks in data store factory)
<<<<<<< HEAD
>>>>>>> 585c5638c0 (GEOMESA-3267 HBase, Accumulo - Fix potential deadlocks in data store factory)
=======
=======
=======
>>>>>>> b54485f5a2 (GEOMESA-3092 Support Lambda NiFi processor (#2777))
=======
>>>>>>> 09d87762c5 (GEOMESA-3254 Add Bloop build support)
=======
>>>>>>> 1dae86c846 (GEOMESA-3254 Add Bloop build support)
import org.locationtech.geomesa.hbase.HBaseSystemProperties
=======
>>>>>>> 120815d0b (GEOMESA-3092 Support Lambda NiFi processor (#2777))
=======
import org.locationtech.geomesa.hbase.data.HBaseConnectionPool.ConnectionWrapper
>>>>>>> 51a90e7f0 (GEOMESA-3092 Support Lambda NiFi processor (#2777))
<<<<<<< HEAD
>>>>>>> 468ab7139 (GEOMESA-3092 Support Lambda NiFi processor (#2777))
<<<<<<< HEAD
>>>>>>> 16f912e1ef (GEOMESA-3092 Support Lambda NiFi processor (#2777))
=======
=======
=======
>>>>>>> d845d7c1b (GEOMESA-3254 Add Bloop build support)
<<<<<<< HEAD
>>>>>>> 09d87762c5 (GEOMESA-3254 Add Bloop build support)
<<<<<<< HEAD
>>>>>>> 63a045a753 (GEOMESA-3254 Add Bloop build support)
=======
=======
=======
>>>>>>> 58d14a257 (GEOMESA-3254 Add Bloop build support)
>>>>>>> 1dae86c846 (GEOMESA-3254 Add Bloop build support)
>>>>>>> fa60953a42 (GEOMESA-3254 Add Bloop build support)
import org.locationtech.geomesa.hbase.data.HBaseDataStore.NoAuthsProvider
import org.locationtech.geomesa.hbase.data.HBaseDataStoreFactory.{CoprocessorConfig, EnabledCoprocessors, HBaseDataStoreConfig, HBaseQueryConfig}
import org.locationtech.geomesa.index.geotools.GeoMesaDataStore
import org.locationtech.geomesa.index.geotools.GeoMesaDataStoreFactory.{DataStoreQueryConfig, GeoMesaDataStoreConfig, GeoMesaDataStoreInfo}
import org.locationtech.geomesa.security.{AuthUtils, AuthorizationsProvider}
import org.locationtech.geomesa.utils.audit.{AuditLogger, AuditProvider, AuditWriter, NoOpAuditProvider}
import org.locationtech.geomesa.utils.conf.GeoMesaSystemProperties.SystemProperty
import org.locationtech.geomesa.utils.geotools.GeoMesaParam

import java.awt.RenderingHints

class HBaseDataStoreFactory extends DataStoreFactorySpi with LazyLogging {

  import HBaseDataStoreParams._

  // this is a pass-through required of the ancestor interface
  override def createNewDataStore(params: java.util.Map[String, _]): DataStore = createDataStore(params)

  override def createDataStore(params: java.util.Map[String, _]): DataStore = {
    val connection = HBaseConnectionPool.getConnection(params, validateConnection)

    val remoteFilters = RemoteFilteringParam.lookup(params).booleanValue

    val audit = if (!AuditQueriesParam.lookup(params)) { None } else {
      Some(AuditLogger, Option(AuditProvider.Loader.load(params)).getOrElse(NoOpAuditProvider), "hbase")
    }
    val auths = if (!EnableSecurityParam.lookup(params)) { NoAuthsProvider } else {
      HBaseDataStoreFactory.buildAuthsProvider(connection.connection, params)
    }
    val queries = HBaseQueryConfig(
      threads = QueryThreadsParam.lookup(params),
      timeout = QueryTimeoutParam.lookupOpt(params).map(_.toMillis),
      looseBBox = LooseBBoxParam.lookup(params),
      parallelPartitionScans = PartitionParallelScansParam.lookup(params),
      maxRangesPerExtendedScan = MaxRangesPerExtendedScanParam.lookup(params)
    )
    val enabledCoprocessors = EnabledCoprocessors(
      arrow = ArrowCoprocessorParam.lookup(params),
      bin = BinCoprocessorParam.lookup(params),
      density = DensityCoprocessorParam.lookup(params),
      stats = StatsCoprocessorParam.lookup(params)
    )
    val coprocessors = CoprocessorConfig(
      enabled = enabledCoprocessors,
      threads = CoprocessorThreadsParam.lookup(params),
      yieldPartialResults = YieldPartialResultsParam.lookup(params),
      maxRangesPerExtendedScan = MaxRangesPerCoprocessorScanParam.lookup(params),
      url = CoprocessorUrlParam.lookupOpt(params)
    )
    val config = HBaseDataStoreConfig(
      catalog = HBaseCatalogParam.lookup(params),
      remoteFilter = remoteFilters,
      generateStats = GenerateStatsParam.lookup(params),
      queries = queries,
      coprocessors = coprocessors,
      authProvider = auths,
      audit = audit,
      namespace = NamespaceParam.lookupOpt(params)
    )

    logger.debug(s"Using ${if (remoteFilters) "remote" else "local" } filtering")
    lazy val enabled =
      Seq(ArrowCoprocessorParam, BinCoprocessorParam, DensityCoprocessorParam, StatsCoprocessorParam).collect {
        case p if p.exists(params) && p.lookup(params).booleanValue() => p.key
      }
    if (!remoteFilters && enabled.nonEmpty) {
      logger.warn(s"Ignoring configs '${enabled.mkString("', '")}' due to remote filtering being disabled")
    }

    val ds = new HBaseDataStore(connection, config)
    GeoMesaDataStore.initRemoteVersion(ds)
    ds
  }

  protected def validateConnection: Boolean = true

  override def isAvailable = true

  override def getDisplayName: String = HBaseDataStoreFactory.DisplayName

  override def getDescription: String = HBaseDataStoreFactory.Description

  override def getParametersInfo: Array[Param] = Array(HBaseDataStoreFactory.ParameterInfo :+ NamespaceParam: _*)

  override def canProcess(params: java.util.Map[String, _]): Boolean =
    HBaseDataStoreFactory.canProcess(params)

  override def getImplementationHints: java.util.Map[RenderingHints.Key, _] = null
}

object HBaseDataStoreFactory extends GeoMesaDataStoreInfo with LazyLogging {

  import HBaseDataStoreParams._

  import scala.collection.JavaConverters._

  val HBaseGeoMesaPrincipal = "hbase.geomesa.principal"
  val HBaseGeoMesaKeyTab    = "hbase.geomesa.keytab"

  @deprecated("moved to org.locationtech.geomesa.hbase.HBaseSystemProperties")
  val ConfigPathProperty: SystemProperty = HBaseSystemProperties.ConfigPathProperty
  @deprecated("moved to org.locationtech.geomesa.hbase.HBaseSystemProperties")
  val RemoteFilterProperty: SystemProperty = HBaseSystemProperties.RemoteFilterProperty
  @deprecated("moved to org.locationtech.geomesa.hbase.HBaseSystemProperties")
  val RemoteArrowProperty: SystemProperty = HBaseSystemProperties.RemoteArrowProperty
  @deprecated("moved to org.locationtech.geomesa.hbase.HBaseSystemProperties")
  val RemoteBinProperty: SystemProperty = HBaseSystemProperties.RemoteBinProperty
  @deprecated("moved to org.locationtech.geomesa.hbase.HBaseSystemProperties")
  val RemoteDensityProperty: SystemProperty = HBaseSystemProperties.RemoteDensityProperty
  @deprecated("moved to org.locationtech.geomesa.hbase.HBaseSystemProperties")
  val RemoteStatsProperty: SystemProperty = HBaseSystemProperties.RemoteStatsProperty
  @deprecated("moved to org.locationtech.geomesa.hbase.HBaseSystemProperties")
  val YieldPartialResultsProperty: SystemProperty = HBaseSystemProperties.YieldPartialResultsProperty

  override val DisplayName = "HBase (GeoMesa)"
  override val Description = "Apache HBase\u2122 distributed key/value store"

  override val ParameterInfo: Array[GeoMesaParam[_ <: AnyRef]] =
    Array(
      HBaseCatalogParam,
      ZookeeperParam,
      ConfigPathsParam,
      ConfigsParam,
      CoprocessorUrlParam,
      QueryThreadsParam,
      CoprocessorThreadsParam,
      QueryTimeoutParam,
      MaxRangesPerExtendedScanParam,
      MaxRangesPerCoprocessorScanParam,
      CacheConnectionsParam,
      RemoteFilteringParam,
      ArrowCoprocessorParam,
      BinCoprocessorParam,
      DensityCoprocessorParam,
      StatsCoprocessorParam,
      YieldPartialResultsParam,
      EnableSecurityParam,
      GenerateStatsParam,
      AuditQueriesParam,
      LooseBBoxParam,
      PartitionParallelScansParam,
      AuthsParam,
      ForceEmptyAuthsParam
    )

  private [geomesa] val BigTableParamCheck = "google.bigtable.instance.id"

  // check that the hbase-site.xml does not have bigtable keys
  override def canProcess(params: java.util.Map[String, _]): Boolean = {
    HBaseCatalogParam.exists(params) &&
        Option(HBaseConfiguration.create().get(BigTableParamCheck)).forall(_.trim.isEmpty)
  }

  case class HBaseDataStoreConfig(
      catalog: String,
      remoteFilter: Boolean,
      generateStats: Boolean,
      queries: HBaseQueryConfig,
      coprocessors: CoprocessorConfig,
      authProvider: AuthorizationsProvider,
      audit: Option[(AuditWriter, AuditProvider, String)],
      namespace: Option[String]
    ) extends GeoMesaDataStoreConfig

  case class HBaseQueryConfig(
      threads: Int,
      timeout: Option[Long],
      looseBBox: Boolean,
      parallelPartitionScans: Boolean,
      maxRangesPerExtendedScan: Int
    ) extends DataStoreQueryConfig

  case class CoprocessorConfig(
      enabled: EnabledCoprocessors,
      threads: Int,
      yieldPartialResults: Boolean,
      maxRangesPerExtendedScan: Int,
      url: Option[Path]
    )

  case class EnabledCoprocessors(arrow: Boolean, bin: Boolean, density: Boolean, stats: Boolean)

  def buildAuthsProvider(connection: Connection, params: java.util.Map[String, _]): AuthorizationsProvider = {
    val forceEmptyOpt: Option[java.lang.Boolean] = ForceEmptyAuthsParam.lookupOpt(params)
    val forceEmptyAuths = forceEmptyOpt.getOrElse(java.lang.Boolean.FALSE).asInstanceOf[Boolean]

    if (!VisibilityClient.isCellVisibilityEnabled(connection)) {
      throw new IllegalArgumentException("HBase cell visibility is not enabled on cluster")
    }

    // master auths is the superset of auths this connector/user can support
    val userName = UserGroupInformation.getLoginUser.getUserName
    val masterAuths = VisibilityClient.getAuths(connection, userName).getAuthList.asScala.map(_.toStringUtf8)

    // get the auth params passed in as a comma-delimited string
    val configuredAuths = AuthsParam.lookupOpt(params).getOrElse("").split(",").filterNot(_.isEmpty)

    // verify that the configured auths are valid for the connector we are using (fail-fast)
    val invalidAuths = configuredAuths.filterNot(masterAuths.contains)
    if (invalidAuths.nonEmpty) {
      val msg = s"The authorizations '${invalidAuths.mkString("', '")}' are not valid for the HBase user '$userName'"
      if (masterAuths.isEmpty) {
        // looking up auths requires a system-level user - likely the user does not have permission
        logger.warn(s"$msg. This may be due to the user not having permissions" +
            " to read its own authorizations, in which case this warning can be ignored.")
      } else {
        throw new IllegalArgumentException(s"$msg. Available authorizations are: ${masterAuths.mkString(", ")}")
      }
    }

    // if the caller provided any non-null string for authorizations, use it;
    // otherwise, grab all authorizations to which the user is entitled
    if (configuredAuths.length != 0 && forceEmptyAuths) {
      throw new IllegalArgumentException("Forcing empty auths is checked, but explicit auths are provided")
    }
    val auths = if (forceEmptyAuths || configuredAuths.nonEmpty) { configuredAuths.toList } else { masterAuths.toList }

    AuthUtils.getProvider(params, auths)
  }
}
