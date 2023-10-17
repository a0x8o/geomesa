/***********************************************************************
 * Copyright (c) 2013-2023 Commonwealth Computer Research, Inc.
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Apache License, Version 2.0
 * which accompanies this distribution and is available at
 * http://www.opensource.org/licenses/apache2.0.php.
 ***********************************************************************/

package org.locationtech.geomesa

import org.locationtech.geomesa.utils.conf.GeoMesaSystemProperties.SystemProperty

package object hbase {

  object HBaseSystemProperties {
<<<<<<< HEAD
<<<<<<< HEAD
<<<<<<< HEAD
=======
>>>>>>> 585c5638c0 (GEOMESA-3267 HBase, Accumulo - Fix potential deadlocks in data store factory)
=======
>>>>>>> 8effb11c46 (GEOMESA-3113 Add system property to managing HBase deletes with visibilities (#2792))
    val CoprocessorUrl             : SystemProperty = SystemProperty("geomesa.hbase.coprocessor.url")
    val CoprocessorMaxThreads      : SystemProperty = SystemProperty("geomesa.hbase.coprocessor.maximize.threads", "true")
    val WriteBatchSize             : SystemProperty = SystemProperty("geomesa.hbase.write.batch")
    val WriteFlushTimeout          : SystemProperty = SystemProperty("geomesa.hbase.write.flush.timeout.millis")
    val WalDurability              : SystemProperty = SystemProperty("geomesa.hbase.wal.durability")
    val ScannerCaching             : SystemProperty = SystemProperty("geomesa.hbase.client.scanner.caching.size")
    val ScannerBlockCaching        : SystemProperty = SystemProperty("geomesa.hbase.query.block.caching.enabled", "true")
    val ScanBufferSize             : SystemProperty = SystemProperty("geomesa.hbase.scan.buffer", "100000")
    val TableAvailabilityTimeout   : SystemProperty = SystemProperty("geomesa.hbase.table.availability.timeout", "30 minutes")
    val DeleteVis                  : SystemProperty = SystemProperty("geomesa.hbase.delete.vis")
    val ConfigPathProperty         : SystemProperty = SystemProperty("geomesa.hbase.config.paths")
    val RemoteFilterProperty       : SystemProperty = SystemProperty("geomesa.hbase.remote.filtering", "true")
    val RemoteArrowProperty        : SystemProperty = SystemProperty("geomesa.hbase.coprocessor.arrow.enable")
    val RemoteBinProperty          : SystemProperty = SystemProperty("geomesa.hbase.coprocessor.bin.enable")
    val RemoteDensityProperty      : SystemProperty = SystemProperty("geomesa.hbase.coprocessor.density.enable")
    val RemoteStatsProperty        : SystemProperty = SystemProperty("geomesa.hbase.coprocessor.stats.enable")
    val YieldPartialResultsProperty: SystemProperty = SystemProperty("geomesa.hbase.coprocessor.yield.partial.results")
<<<<<<< HEAD
<<<<<<< HEAD
=======
>>>>>>> 8effb11c46 (GEOMESA-3113 Add system property to managing HBase deletes with visibilities (#2792))
=======
    val CoprocessorUrl           : SystemProperty = SystemProperty("geomesa.hbase.coprocessor.url")
    val CoprocessorMaxThreads    : SystemProperty = SystemProperty("geomesa.hbase.coprocessor.maximize.threads", "true")
    val WriteBatchSize           : SystemProperty = SystemProperty("geomesa.hbase.write.batch")
<<<<<<< HEAD
    val WriteFlushTimeout        : SystemProperty = SystemProperty("geomesa.hbase.write.flush.timeout.millis")
=======
>>>>>>> 8effb11c46 (GEOMESA-3113 Add system property to managing HBase deletes with visibilities (#2792))
    val WalDurability            : SystemProperty = SystemProperty("geomesa.hbase.wal.durability")
    val ScannerCaching           : SystemProperty = SystemProperty("geomesa.hbase.client.scanner.caching.size")
    val ScannerBlockCaching      : SystemProperty = SystemProperty("geomesa.hbase.query.block.caching.enabled", "true")
    val ScanBufferSize           : SystemProperty = SystemProperty("geomesa.hbase.scan.buffer", "100000")
    val TableAvailabilityTimeout : SystemProperty = SystemProperty("geomesa.hbase.table.availability.timeout", "30 minutes")
    val DeleteVis                : SystemProperty = SystemProperty("geomesa.hbase.delete.vis")
<<<<<<< HEAD
>>>>>>> 1a21a3c300 (GEOMESA-3113 Add system property to managing HBase deletes with visibilities (#2792))
=======
>>>>>>> 585c5638c0 (GEOMESA-3267 HBase, Accumulo - Fix potential deadlocks in data store factory)
=======
>>>>>>> 1a21a3c30 (GEOMESA-3113 Add system property to managing HBase deletes with visibilities (#2792))
>>>>>>> 8effb11c46 (GEOMESA-3113 Add system property to managing HBase deletes with visibilities (#2792))

    @deprecated("Use coprocessor url")
    val CoprocessorPath: SystemProperty = SystemProperty("geomesa.hbase.coprocessor.path")
  }
}
