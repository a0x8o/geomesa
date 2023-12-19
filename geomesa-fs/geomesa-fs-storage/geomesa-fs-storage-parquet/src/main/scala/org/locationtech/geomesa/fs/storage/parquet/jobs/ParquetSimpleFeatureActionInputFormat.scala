/***********************************************************************
<<<<<<< HEAD
 * Copyright (c) 2013-2023 Commonwealth Computer Research, Inc.
=======
 * Copyright (c) 2013-2022 Commonwealth Computer Research, Inc.
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
<<<<<<< HEAD
<<<<<<< HEAD
=======
>>>>>>> e74fa3f690 (GEOMESA-3254 Add Bloop build support)
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
>>>>>>> 3e610250ce (GEOMESA-3254 Add Bloop build support)
=======
>>>>>>> f586fec5a3 (GEOMESA-3254 Add Bloop build support)
=======
=======
>>>>>>> e74fa3f690 (GEOMESA-3254 Add Bloop build support)
>>>>>>> b39bd292d4 (GEOMESA-3254 Add Bloop build support)
<<<<<<< HEAD
<<<<<<< HEAD
>>>>>>> locatelli-main
=======
>>>>>>> locatelli-main
=======
>>>>>>> locatelli-main
>>>>>>> 58d14a257e (GEOMESA-3254 Add Bloop build support)
=======
>>>>>>> 58d14a257 (GEOMESA-3254 Add Bloop build support)
>>>>>>> fa60953a42 (GEOMESA-3254 Add Bloop build support)
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
>>>>>>> 58d14a257e (GEOMESA-3254 Add Bloop build support)
>>>>>>> 7564665969 (GEOMESA-3254 Add Bloop build support)
=======
>>>>>>> e74fa3f690 (GEOMESA-3254 Add Bloop build support)
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
=======
>>>>>>> 58d14a257e (GEOMESA-3254 Add Bloop build support)
>>>>>>> 7564665969 (GEOMESA-3254 Add Bloop build support)
>>>>>>> f586fec5a3 (GEOMESA-3254 Add Bloop build support)
=======
>>>>>>> b39bd292d4 (GEOMESA-3254 Add Bloop build support)
<<<<<<< HEAD
<<<<<<< HEAD
>>>>>>> locatelli-main
=======
>>>>>>> locatelli-main
=======
>>>>>>> locatelli-main
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Apache License, Version 2.0
 * which accompanies this distribution and is available at
 * http://www.opensource.org/licenses/apache2.0.php.
 ***********************************************************************/

package org.locationtech.geomesa.fs.storage.parquet.jobs

import org.apache.hadoop.conf.Configuration
import org.apache.hadoop.mapreduce.RecordReader
import org.apache.hadoop.mapreduce.lib.input.FileSplit
import org.locationtech.geomesa.fs.storage.api.StorageMetadata.StorageFileAction.StorageFileAction
import org.locationtech.geomesa.fs.storage.common.jobs.StorageConfiguration
import org.locationtech.geomesa.fs.storage.common.jobs.StorageConfiguration.SimpleFeatureAction
import org.locationtech.geomesa.fs.storage.parquet.jobs.ParquetSimpleFeatureInputFormat.{ParquetSimpleFeatureInputFormatBase, ParquetSimpleFeatureRecordReaderBase, ParquetSimpleFeatureTransformRecordReaderBase}
import org.opengis.feature.simple.{SimpleFeature, SimpleFeatureType}
import org.opengis.filter.Filter

/**
  * Input format for parquet files that tracks the action and timestamp associated with each feature
  */
class ParquetSimpleFeatureActionInputFormat extends ParquetSimpleFeatureInputFormatBase[SimpleFeatureAction] {

  override protected def createRecordReader(
      delegate: RecordReader[Void, SimpleFeature],
      conf: Configuration,
      split: FileSplit,
      sft: SimpleFeatureType,
      filter: Option[Filter],
      transform: Option[(String, SimpleFeatureType)]): RecordReader[SimpleFeatureAction, SimpleFeature] = {
    val (timestamp, action) = StorageConfiguration.getPathAction(conf, split.getPath)
    transform match {
      case None => new ParquetSimpleFeatureActionRecordReader(delegate, filter, timestamp, action)
      case Some((tdefs, tsft)) =>
        new ParquetSimpleFeatureActionTransformRecordReader(delegate, filter, sft, tsft, tdefs, timestamp, action)
    }
  }

  class ParquetSimpleFeatureActionRecordReader(
      delegate: RecordReader[Void, SimpleFeature],
      filter: Option[Filter],
      timestamp: Long,
      action: StorageFileAction
    ) extends ParquetSimpleFeatureRecordReaderBase[SimpleFeatureAction](delegate, filter) {
    override def getCurrentKey: SimpleFeatureAction =
      new SimpleFeatureAction(getCurrentValue.getID, timestamp, action)
  }

  class ParquetSimpleFeatureActionTransformRecordReader(
      delegate: RecordReader[Void, SimpleFeature],
      filter: Option[Filter],
      sft: SimpleFeatureType,
      tsft: SimpleFeatureType,
      tdefs: String,
      timestamp: Long,
      action: StorageFileAction
    ) extends ParquetSimpleFeatureTransformRecordReaderBase[SimpleFeatureAction](delegate, filter, sft, tsft, tdefs) {
    override def getCurrentKey: SimpleFeatureAction =
      new SimpleFeatureAction(getCurrentValue.getID, timestamp, action)
  }
}
