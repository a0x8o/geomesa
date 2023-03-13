/***********************************************************************
<<<<<<< HEAD:geomesa-utils-parent/geomesa-zk-utils/src/main/scala/org/locationtech/geomesa/utils/zk/CuratorHelper.scala
<<<<<<< HEAD:geomesa-utils-parent/geomesa-zk-utils/src/main/scala/org/locationtech/geomesa/utils/zk/CuratorHelper.scala
 * Copyright (c) 2013-2023 Commonwealth Computer Research, Inc.
=======
<<<<<<< HEAD
<<<<<<< HEAD
<<<<<<< HEAD
 * Copyright (c) 2013-2022 Commonwealth Computer Research, Inc.
=======
 * Copyright (c) 2013-2021 Commonwealth Computer Research, Inc.
>>>>>>> 1a21a3c30 (GEOMESA-3113 Add system property to managing HBase deletes with visibilities (#2792))
<<<<<<< HEAD:geomesa-utils-parent/geomesa-zk-utils/src/main/scala/org/locationtech/geomesa/utils/zk/CuratorHelper.scala
>>>>>>> 425a920af (GEOMESA-3113 Add system property to managing HBase deletes with visibilities (#2792)):geomesa-zk-utils/src/main/scala/org/locationtech/geomesa/utils/zk/CuratorHelper.scala
=======
=======
 * Copyright (c) 2013-2022 Commonwealth Computer Research, Inc.
>>>>>>> 3be8d2a5a (Merge branch 'feature/postgis-fixes')
>>>>>>> db8d998aa (Merge branch 'feature/postgis-fixes'):geomesa-zk-utils/src/main/scala/org/locationtech/geomesa/utils/zk/CuratorHelper.scala
=======
 * Copyright (c) 2013-2021 Commonwealth Computer Research, Inc.
>>>>>>> 1a21a3c30 (GEOMESA-3113 Add system property to managing HBase deletes with visibilities (#2792)):geomesa-zk-utils/src/main/scala/org/locationtech/geomesa/utils/zk/CuratorHelper.scala
<<<<<<< HEAD
>>>>>>> c6103aab4 (GEOMESA-3113 Add system property to managing HBase deletes with visibilities (#2792))
=======
=======
<<<<<<< HEAD
 * Copyright (c) 2013-2022 Commonwealth Computer Research, Inc.
=======
 * Copyright (c) 2013-2021 Commonwealth Computer Research, Inc.
>>>>>>> 1a21a3c30 (GEOMESA-3113 Add system property to managing HBase deletes with visibilities (#2792))
>>>>>>> 595c43086 (GEOMESA-3113 Add system property to managing HBase deletes with visibilities (#2792)):geomesa-zk-utils/src/main/scala/org/locationtech/geomesa/utils/zk/CuratorHelper.scala
>>>>>>> ad8d1be45 (GEOMESA-3113 Add system property to managing HBase deletes with visibilities (#2792))
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Apache License, Version 2.0
 * which accompanies this distribution and is available at
 * http://www.opensource.org/licenses/apache2.0.php.
 ***********************************************************************/

package org.locationtech.geomesa.utils.zk

import org.apache.curator.framework.CuratorFrameworkFactory
import org.apache.curator.retry.ExponentialBackoffRetry

object CuratorHelper {

  /**
   * Create a curator client that works with both zk 3.4 and 3.5
   *
   * @param zookeepers connection string
   * @return
   */
  def client(zookeepers: String): CuratorFrameworkFactory.Builder =
    CuratorFrameworkFactory.builder()
        .connectString(zookeepers)
        .retryPolicy(new ExponentialBackoffRetry(1000, 3))
        .zk34CompatibilityMode(true)
        .dontUseContainerParents()
}
