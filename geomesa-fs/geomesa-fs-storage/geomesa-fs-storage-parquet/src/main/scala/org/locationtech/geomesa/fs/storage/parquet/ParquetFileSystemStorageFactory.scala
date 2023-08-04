/***********************************************************************
<<<<<<< HEAD
 * Copyright (c) 2013-2023 Commonwealth Computer Research, Inc.
=======
 * Copyright (c) 2013-2022 Commonwealth Computer Research, Inc.
<<<<<<< HEAD
<<<<<<< HEAD
>>>>>>> 58d14a257 (GEOMESA-3254 Add Bloop build support)
=======
<<<<<<< HEAD
=======
<<<<<<< HEAD
<<<<<<< HEAD
=======
>>>>>>> e74fa3f690 (GEOMESA-3254 Add Bloop build support)
>>>>>>> locationtech-main
>>>>>>> 58d14a257e (GEOMESA-3254 Add Bloop build support)
=======
>>>>>>> 58d14a257 (GEOMESA-3254 Add Bloop build support)
>>>>>>> fa60953a42 (GEOMESA-3254 Add Bloop build support)
<<<<<<< HEAD
>>>>>>> location-main
=======
<<<<<<< HEAD
=======
>>>>>>> 58d14a257e (GEOMESA-3254 Add Bloop build support)
>>>>>>> 7564665969 (GEOMESA-3254 Add Bloop build support)
=======
>>>>>>> e74fa3f690 (GEOMESA-3254 Add Bloop build support)
>>>>>>> locationtech-main
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Apache License, Version 2.0
 * which accompanies this distribution and is available at
 * http://www.opensource.org/licenses/apache2.0.php.
 ***********************************************************************/

package org.locationtech.geomesa.fs.storage.parquet

import org.locationtech.geomesa.fs.storage.api._
import org.locationtech.geomesa.fs.storage.parquet.ParquetFileSystemStorage.ParquetCompressionOpt

class ParquetFileSystemStorageFactory extends FileSystemStorageFactory {

  override def encoding: String = ParquetFileSystemStorage.Encoding

  override def apply(context: FileSystemContext, metadata: StorageMetadata): ParquetFileSystemStorage = {
    if (context.conf.get(ParquetCompressionOpt) == null) {
      Option(System.getProperty(ParquetCompressionOpt)).foreach(context.conf.set(ParquetCompressionOpt, _))
    }
    context.conf.set("parquet.filter.dictionary.enabled", "true")
    new ParquetFileSystemStorage(context, metadata)
  }
}
