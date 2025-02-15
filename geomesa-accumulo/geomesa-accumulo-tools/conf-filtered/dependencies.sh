#! /usr/bin/env bash
#
# Copyright (c) 2013-%%copyright.year%% Commonwealth Computer Research, Inc.
# All rights reserved. This program and the accompanying materials
# are made available under the terms of the Apache License, Version 2.0 which
# accompanies this distribution and is available at
# http://www.opensource.org/licenses/apache2.0.php.
#

# This file lists the dependencies required for running the geomesa-accumulo command-line tools.
# Usually these dependencies will be provided by the environment (e.g. ACCUMULO_HOME).
# Update the versions as required to match the target environment.

accumulo_install_version="%%accumulo.version.recommended%%"
hadoop_install_version="%%hadoop.version.recommended%%"
zookeeper_install_version="%%zookeeper.version.recommended%%"
# required for hadoop - make sure it corresponds to the hadoop installed version
guava_install_version="%%accumulo.guava.version%%"

# gets the dependencies for this module
# args:
#   $1 - current classpath
function dependencies() {
  local classpath="$1"

  local accumulo_version="$accumulo_install_version"
  local hadoop_version="$hadoop_install_version"
  local zk_version="$zookeeper_install_version"

  if [[ -n "$classpath" ]]; then
    accumulo_version="$(get_classpath_version accumulo-core "$classpath" "$accumulo_version")"
    hadoop_version="$(get_classpath_version hadoop-common "$classpath" "$hadoop_version")"
    zk_version="$(get_classpath_version zookeeper "$classpath" "$zk_version")"
  fi

  declare -a gavs=(
    "org.apache.accumulo:accumulo-core:${accumulo_version}:jar"
    "org.apache.accumulo:accumulo-server-base:${accumulo_version}:jar"
    "org.apache.accumulo:accumulo-start:${accumulo_version}:jar"
    "org.apache.accumulo:accumulo-hadoop-mapreduce:${accumulo_version}:jar"
    "org.apache.zookeeper:zookeeper:${zk_version}:jar"
    "org.apache.commons:commons-configuration2:2.10.1:jar"
    "org.apache.commons:commons-text:1.11.0:jar"
    "org.apache.commons:commons-collections4:4.4:jar"
    "org.apache.commons:commons-vfs2:2.9.0:jar"
    "commons-logging:commons-logging:1.3.3:jar"
    "org.apache.hadoop:hadoop-auth:${hadoop_version}:jar"
    "org.apache.hadoop:hadoop-common:${hadoop_version}:jar"
    "org.apache.hadoop:hadoop-hdfs:${hadoop_version}:jar"
    "com.fasterxml.woodstox:woodstox-core:5.3.0:jar"
    "org.codehaus.woodstox:stax2-api:4.2.1:jar"
    "com.google.guava:guava:${guava_install_version}:jar"
    "io.netty:netty-codec:%%netty.version%%:jar"
    "io.netty:netty-handler:%%netty.version%%:jar"
    "io.netty:netty-resolver:%%netty.version%%:jar"
    "io.netty:netty-transport:%%netty.version%%:jar"
    "io.netty:netty-transport-classes-epoll:%%netty.version%%:jar"
    "io.netty:netty-transport-native-epoll:%%netty.version%%:jar:linux-x86_64"
    "io.netty:netty-transport-native-unix-common:%%netty.version%%:jar"
  )

  # add accumulo 2.1 jars if needed
  if version_ge "${accumulo_version}" 2.1.0; then
    local micrometer_version
    local opentelemetry_version

    if version_ge "${accumulo_version}" 2.1.3; then
      micrometer_version="1.12.2"
      opentelemetry_version="1.34.1"
    else
      # these versions seem compatible even though they're not the exact versions shipped
      micrometer_version="1.11.1"
      opentelemetry_version="1.27.0"
      gavs+=(
        "io.opentelemetry:opentelemetry-semconv:${opentelemetry_version}-alpha:jar"
      )
    fi

    gavs+=(
      "org.apache.thrift:libthrift:%%thrift.version%%:jar"
      "io.micrometer:micrometer-core:${micrometer_version}:jar"
      "io.micrometer:micrometer-commons:${micrometer_version}:jar"
      "io.opentelemetry:opentelemetry-api:${opentelemetry_version}:jar"
      "io.opentelemetry:opentelemetry-context:${opentelemetry_version}:jar"
    )
  else
    gavs+=(
<<<<<<< HEAD
<<<<<<< HEAD
<<<<<<< HEAD
<<<<<<< HEAD
<<<<<<< HEAD
<<<<<<< HEAD
<<<<<<< HEAD
<<<<<<< HEAD
<<<<<<< HEAD
<<<<<<< HEAD
<<<<<<< HEAD
<<<<<<< HEAD
<<<<<<< HEAD
<<<<<<< HEAD
<<<<<<< HEAD
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
<<<<<<< HEAD
<<<<<<< HEAD
<<<<<<< HEAD
<<<<<<< HEAD
<<<<<<< HEAD
<<<<<<< HEAD
<<<<<<< HEAD
<<<<<<< HEAD
<<<<<<< HEAD
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
>>>>>>> locatelli-main
<<<<<<< HEAD
=======
>>>>>>> locatelli-main
<<<<<<< HEAD
=======
>>>>>>> locatelli-main
<<<<<<< HEAD
=======
>>>>>>> locatelli-main
<<<<<<< HEAD
<<<<<<< HEAD
<<<<<<< HEAD
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
<<<<<<< HEAD
<<<<<<< HEAD
<<<<<<< HEAD
<<<<<<< HEAD
>>>>>>> locatelli-main
=======
>>>>>>> locatelli-main
=======
>>>>>>> locatelli-main
=======
>>>>>>> locatelli-main
=======
>>>>>>> locatelli-main
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
=======
>>>>>>> locatelli-main
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
>>>>>>> locatelli-main
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
>>>>>>> locatelli-main
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
>>>>>>> locatelli-main
=======
<<<<<<< HEAD
<<<<<<< HEAD
<<<<<<< HEAD
<<<<<<< HEAD
<<<<<<< HEAD
<<<<<<< HEAD
<<<<<<< HEAD
=======
>>>>>>> locatelli-main
=======
<<<<<<< HEAD
<<<<<<< HEAD
<<<<<<< HEAD
<<<<<<< HEAD
<<<<<<< HEAD
<<<<<<< HEAD
=======
>>>>>>> locatelli-main
=======
<<<<<<< HEAD
<<<<<<< HEAD
<<<<<<< HEAD
<<<<<<< HEAD
<<<<<<< HEAD
=======
>>>>>>> locatelli-main
=======
<<<<<<< HEAD
<<<<<<< HEAD
<<<<<<< HEAD
<<<<<<< HEAD
=======
>>>>>>> locatelli-main
=======
<<<<<<< HEAD
<<<<<<< HEAD
<<<<<<< HEAD
=======
>>>>>>> locatelli-main
=======
<<<<<<< HEAD
<<<<<<< HEAD
=======
>>>>>>> locatelli-main
=======
<<<<<<< HEAD
=======
>>>>>>> locatelli-main
=======
>>>>>>> locatelli-main
=======
>>>>>>> locatelli-main
=======
>>>>>>> locatelli-main
=======
>>>>>>> locatelli-main
=======
>>>>>>> locatelli-main
=======
>>>>>>> locatelli-main
=======
>>>>>>> locatelli-main
=======
>>>>>>> locatelli-main
=======
>>>>>>> locatelli-main
=======
>>>>>>> locatelli-main
=======
>>>>>>> locatelli-main
=======
>>>>>>> locatelli-main
=======
>>>>>>> locatelli-main
=======
>>>>>>> locatelli-main
=======
>>>>>>> locatelli-main
=======
>>>>>>> locatelli-main
=======
>>>>>>> locatelli-main
=======
>>>>>>> 234aacdc1 (GEOMESA-3092 Support Lambda NiFi processor (#2777))
=======
>>>>>>> locationtech-main
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
<<<<<<< HEAD
<<<<<<< HEAD
<<<<<<< HEAD
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
<<<<<<< HEAD
<<<<<<< HEAD
<<<<<<< HEAD
<<<<<<< HEAD
<<<<<<< HEAD
<<<<<<< HEAD
<<<<<<< HEAD
=======
=======
>>>>>>> locatelli-main
=======
>>>>>>> locatelli-main
=======
>>>>>>> locatelli-main
=======
>>>>>>> locatelli-main
=======
>>>>>>> locatelli-main
=======
>>>>>>> locatelli-main
=======
>>>>>>> locatelli-main
>>>>>>> 1b3a148b37 (GEOMESA-3092 Support Lambda NiFi processor (#2777))
<<<<<<< HEAD
<<<<<<< HEAD
=======
>>>>>>> 38df2fe8ca (GEOMESA-3092 Support Lambda NiFi processor (#2777))
=======
>>>>>>> 1765bd4159 (GEOMESA-3092 Support Lambda NiFi processor (#2777))
<<<<<<< HEAD
<<<<<<< HEAD
<<<<<<< HEAD
<<<<<<< HEAD
<<<<<<< HEAD
<<<<<<< HEAD
<<<<<<< HEAD
>>>>>>> locatelli-main
=======
>>>>>>> locatelli-main
=======
>>>>>>> locatelli-main
=======
>>>>>>> locatelli-main
=======
>>>>>>> locatelli-main
=======
>>>>>>> locatelli-main
=======
>>>>>>> locatelli-main
=======
>>>>>>> locatelli-main
=======
>>>>>>> 5a4c24e020 (GEOMESA-3254 Add Bloop build support)
=======
>>>>>>> 89085e28b8 (GEOMESA-3092 Support Lambda NiFi processor (#2777))
=======
<<<<<<< HEAD
<<<<<<< HEAD
>>>>>>> 541079bbd0 (GEOMESA-3092 Support Lambda NiFi processor (#2777))
<<<<<<< HEAD
<<<<<<< HEAD
<<<<<<< HEAD
<<<<<<< HEAD
<<<<<<< HEAD
<<<<<<< HEAD
>>>>>>> locationtech-main
=======
=======
<<<<<<< HEAD
=======
>>>>>>> locatelli-main
<<<<<<< HEAD
>>>>>>> 541079bbd0 (GEOMESA-3092 Support Lambda NiFi processor (#2777))
=======
>>>>>>> locatelli-main
=======
>>>>>>> locatelli-main
=======
>>>>>>> locatelli-main
=======
>>>>>>> locatelli-main
=======
>>>>>>> locatelli-main
=======
>>>>>>> locatelli-main
=======
>>>>>>> b298e017f1 (GEOMESA-3254 Add Bloop build support)
=======
>>>>>>> 991f10e2a4 (GEOMESA-3092 Support Lambda NiFi processor (#2777))
=======
>>>>>>> ce026b5c8a (GEOMESA-3092 Support Lambda NiFi processor (#2777))
=======
>>>>>>> 0283274bf0 (GEOMESA-3092 Support Lambda NiFi processor (#2777))
=======
>>>>>>> c738f63bd9 (GEOMESA-3254 Add Bloop build support)
=======
>>>>>>> 0b090a0ead (GEOMESA-3092 Support Lambda NiFi processor (#2777))
=======
=======
>>>>>>> 5a4c24e020 (GEOMESA-3254 Add Bloop build support)
>>>>>>> 13656f5052 (GEOMESA-3254 Add Bloop build support)
=======
=======
>>>>>>> 38df2fe8ca (GEOMESA-3092 Support Lambda NiFi processor (#2777))
=======
>>>>>>> 541079bbd0 (GEOMESA-3092 Support Lambda NiFi processor (#2777))
=======
>>>>>>> 1765bd4159 (GEOMESA-3092 Support Lambda NiFi processor (#2777))
<<<<<<< HEAD
<<<<<<< HEAD
<<<<<<< HEAD
<<<<<<< HEAD
<<<<<<< HEAD
<<<<<<< HEAD
<<<<<<< HEAD
>>>>>>> locatelli-main
=======
>>>>>>> locatelli-main
=======
>>>>>>> locatelli-main
=======
>>>>>>> locatelli-main
=======
>>>>>>> locatelli-main
=======
>>>>>>> locatelli-main
=======
>>>>>>> locatelli-main
=======
>>>>>>> locatelli-main
>>>>>>> 234aacdc12 (GEOMESA-3092 Support Lambda NiFi processor (#2777))
=======
>>>>>>> 63a045a753 (GEOMESA-3254 Add Bloop build support)
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
=======
<<<<<<< HEAD
<<<<<<< HEAD
<<<<<<< HEAD
>>>>>>> locatelli-main
=======
>>>>>>> locatelli-main
<<<<<<< HEAD
<<<<<<< HEAD
=======
>>>>>>> 89085e28b8 (GEOMESA-3092 Support Lambda NiFi processor (#2777))
<<<<<<< HEAD
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
>>>>>>> 89085e28b8 (GEOMESA-3092 Support Lambda NiFi processor (#2777))
<<<<<<< HEAD
>>>>>>> locatelli-main
=======
>>>>>>> locatelli-main
=======
>>>>>>> locatelli-main
=======
<<<<<<< HEAD
=======
>>>>>>> 89085e28b8 (GEOMESA-3092 Support Lambda NiFi processor (#2777))
>>>>>>> locatelli-main
=======
>>>>>>> 89085e28b8 (GEOMESA-3092 Support Lambda NiFi processor (#2777))
>>>>>>> locatelli-main
=======
>>>>>>> 89085e28b8 (GEOMESA-3092 Support Lambda NiFi processor (#2777))
>>>>>>> locatelli-main
=======
>>>>>>> 89085e28b8 (GEOMESA-3092 Support Lambda NiFi processor (#2777))
>>>>>>> locatelli-main
=======
>>>>>>> 991f10e2a4 (GEOMESA-3092 Support Lambda NiFi processor (#2777))
=======
>>>>>>> 13656f5052 (GEOMESA-3254 Add Bloop build support)
=======
=======
>>>>>>> 89085e28b8 (GEOMESA-3092 Support Lambda NiFi processor (#2777))
>>>>>>> 38df2fe8ca (GEOMESA-3092 Support Lambda NiFi processor (#2777))
<<<<<<< HEAD
<<<<<<< HEAD
<<<<<<< HEAD
<<<<<<< HEAD
<<<<<<< HEAD
<<<<<<< HEAD
<<<<<<< HEAD
>>>>>>> locatelli-main
=======
>>>>>>> locatelli-main
=======
>>>>>>> locatelli-main
=======
>>>>>>> locatelli-main
=======
>>>>>>> locatelli-main
=======
>>>>>>> locatelli-main
=======
>>>>>>> locatelli-main
=======
>>>>>>> locatelli-main
=======
=======
>>>>>>> 234aacdc1 (GEOMESA-3092 Support Lambda NiFi processor (#2777))
>>>>>>> 19646771be (GEOMESA-3092 Support Lambda NiFi processor (#2777))
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
>>>>>>> 5e469d5cd9 (GEOMESA-3092 Support Lambda NiFi processor (#2777))
>>>>>>> location-main
=======
<<<<<<< HEAD
<<<<<<< HEAD
=======
<<<<<<< HEAD
=======
>>>>>>> locatelli-main
<<<<<<< HEAD
=======
>>>>>>> locatelli-main
<<<<<<< HEAD
=======
>>>>>>> locatelli-main
<<<<<<< HEAD
=======
>>>>>>> locatelli-main
<<<<<<< HEAD
=======
>>>>>>> 38df2fe8ca (GEOMESA-3092 Support Lambda NiFi processor (#2777))
=======
>>>>>>> 1765bd4159 (GEOMESA-3092 Support Lambda NiFi processor (#2777))
<<<<<<< HEAD
<<<<<<< HEAD
<<<<<<< HEAD
<<<<<<< HEAD
>>>>>>> locatelli-main
=======
>>>>>>> locatelli-main
=======
>>>>>>> locatelli-main
=======
>>>>>>> locatelli-main
=======
>>>>>>> locatelli-main
=======
>>>>>>> 38df2fe8ca (GEOMESA-3092 Support Lambda NiFi processor (#2777))
=======
>>>>>>> 1765bd4159 (GEOMESA-3092 Support Lambda NiFi processor (#2777))
>>>>>>> locatelli-main
=======
>>>>>>> 38df2fe8ca (GEOMESA-3092 Support Lambda NiFi processor (#2777))
=======
>>>>>>> 1765bd4159 (GEOMESA-3092 Support Lambda NiFi processor (#2777))
>>>>>>> locatelli-main
=======
>>>>>>> 38df2fe8ca (GEOMESA-3092 Support Lambda NiFi processor (#2777))
=======
>>>>>>> 1765bd4159 (GEOMESA-3092 Support Lambda NiFi processor (#2777))
>>>>>>> locatelli-main
=======
>>>>>>> 5e469d5cd9 (GEOMESA-3092 Support Lambda NiFi processor (#2777))
=======
>>>>>>> 87ab0f22da (GEOMESA-3092 Support Lambda NiFi processor (#2777))
<<<<<<< HEAD
<<<<<<< HEAD
=======
<<<<<<< HEAD
<<<<<<< HEAD
<<<<<<< HEAD
<<<<<<< HEAD
<<<<<<< HEAD
<<<<<<< HEAD
<<<<<<< HEAD
<<<<<<< HEAD
>>>>>>> locatelli-main
=======
<<<<<<< HEAD
>>>>>>> locatelli-main
=======
=======
>>>>>>> locatelli-main
=======
>>>>>>> locatelli-main
=======
>>>>>>> locatelli-main
=======
>>>>>>> locatelli-main
=======
>>>>>>> locatelli-main
=======
>>>>>>> locatelli-main
>>>>>>> f1532f2313 (GEOMESA-3254 Add Bloop build support)
=======
=======
>>>>>>> 234aacdc12 (GEOMESA-3092 Support Lambda NiFi processor (#2777))
>>>>>>> 60be59afe8 (GEOMESA-3092 Support Lambda NiFi processor (#2777))
<<<<<<< HEAD
<<<<<<< HEAD
=======
<<<<<<< HEAD
<<<<<<< HEAD
<<<<<<< HEAD
<<<<<<< HEAD
<<<<<<< HEAD
<<<<<<< HEAD
<<<<<<< HEAD
<<<<<<< HEAD
>>>>>>> locatelli-main
=======
<<<<<<< HEAD
>>>>>>> locatelli-main
=======
=======
>>>>>>> locatelli-main
=======
>>>>>>> locatelli-main
=======
>>>>>>> locatelli-main
=======
>>>>>>> locatelli-main
=======
>>>>>>> locatelli-main
=======
>>>>>>> locatelli-main
>>>>>>> 5a4c24e020 (GEOMESA-3254 Add Bloop build support)
=======
>>>>>>> 89085e28b8 (GEOMESA-3092 Support Lambda NiFi processor (#2777))
<<<<<<< HEAD
<<<<<<< HEAD
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
>>>>>>> 1765bd4159 (GEOMESA-3092 Support Lambda NiFi processor (#2777))
>>>>>>> locatelli-main
=======
<<<<<<< HEAD
=======
>>>>>>> 1765bd4159 (GEOMESA-3092 Support Lambda NiFi processor (#2777))
>>>>>>> locatelli-main
=======
>>>>>>> 1765bd4159 (GEOMESA-3092 Support Lambda NiFi processor (#2777))
>>>>>>> locatelli-main
=======
>>>>>>> 1765bd4159 (GEOMESA-3092 Support Lambda NiFi processor (#2777))
>>>>>>> locatelli-main
=======
>>>>>>> 1765bd4159 (GEOMESA-3092 Support Lambda NiFi processor (#2777))
>>>>>>> locatelli-main
=======
>>>>>>> 1765bd4159 (GEOMESA-3092 Support Lambda NiFi processor (#2777))
>>>>>>> locatelli-main
=======
>>>>>>> 1765bd4159 (GEOMESA-3092 Support Lambda NiFi processor (#2777))
>>>>>>> locatelli-main
=======
>>>>>>> 1765bd4159 (GEOMESA-3092 Support Lambda NiFi processor (#2777))
>>>>>>> locatelli-main
=======
=======
>>>>>>> 5e469d5cd9 (GEOMESA-3092 Support Lambda NiFi processor (#2777))
>>>>>>> 541079bbd0 (GEOMESA-3092 Support Lambda NiFi processor (#2777))
<<<<<<< HEAD
<<<<<<< HEAD
<<<<<<< HEAD
<<<<<<< HEAD
<<<<<<< HEAD
<<<<<<< HEAD
<<<<<<< HEAD
<<<<<<< HEAD
>>>>>>> locationtech-main
=======
>>>>>>> 1a04676d44 (GEOMESA-3092 Support Lambda NiFi processor (#2777))
=======
>>>>>>> locationtech-main
=======
<<<<<<< HEAD
=======
>>>>>>> locatelli-main
<<<<<<< HEAD
=======
>>>>>>> locatelli-main
=======
>>>>>>> locatelli-main
=======
>>>>>>> locatelli-main
=======
>>>>>>> locatelli-main
=======
>>>>>>> locatelli-main
=======
>>>>>>> locatelli-main
=======
>>>>>>> a154b4927b (GEOMESA-3092 Support Lambda NiFi processor (#2777))
=======
>>>>>>> 7a84c9d22d (GEOMESA-3254 Add Bloop build support)
=======
=======
>>>>>>> 234aacdc12 (GEOMESA-3092 Support Lambda NiFi processor (#2777))
>>>>>>> 7fff0a6154 (GEOMESA-3092 Support Lambda NiFi processor (#2777))
=======
>>>>>>> b298e017f1 (GEOMESA-3254 Add Bloop build support)
=======
>>>>>>> 991f10e2a4 (GEOMESA-3092 Support Lambda NiFi processor (#2777))
=======
=======
>>>>>>> 5e469d5cd9 (GEOMESA-3092 Support Lambda NiFi processor (#2777))
>>>>>>> ce026b5c8a (GEOMESA-3092 Support Lambda NiFi processor (#2777))
=======
>>>>>>> 0283274bf0 (GEOMESA-3092 Support Lambda NiFi processor (#2777))
=======
=======
>>>>>>> f1532f2313 (GEOMESA-3254 Add Bloop build support)
>>>>>>> c738f63bd9 (GEOMESA-3254 Add Bloop build support)
=======
>>>>>>> 0b090a0ead (GEOMESA-3092 Support Lambda NiFi processor (#2777))
=======
=======
>>>>>>> 5a4c24e020 (GEOMESA-3254 Add Bloop build support)
>>>>>>> 13656f5052 (GEOMESA-3254 Add Bloop build support)
=======
>>>>>>> 38df2fe8ca (GEOMESA-3092 Support Lambda NiFi processor (#2777))
=======
>>>>>>> 1765bd4159 (GEOMESA-3092 Support Lambda NiFi processor (#2777))
=======
>>>>>>> locationtech-main
=======
>>>>>>> 1a04676d44 (GEOMESA-3092 Support Lambda NiFi processor (#2777))
>>>>>>> 1b3a148b37 (GEOMESA-3092 Support Lambda NiFi processor (#2777))
=======
>>>>>>> 1a04676d44 (GEOMESA-3092 Support Lambda NiFi processor (#2777))
<<<<<<< HEAD
<<<<<<< HEAD
<<<<<<< HEAD
<<<<<<< HEAD
<<<<<<< HEAD
<<<<<<< HEAD
<<<<<<< HEAD
>>>>>>> locatelli-main
=======
>>>>>>> locatelli-main
=======
>>>>>>> locatelli-main
=======
>>>>>>> locatelli-main
=======
>>>>>>> locatelli-main
=======
>>>>>>> locatelli-main
=======
>>>>>>> locatelli-main
=======
>>>>>>> locatelli-main
      "org.apache.thrift:libthrift:%%thrift.version%%:jar"
=======
=======
>>>>>>> locatelli-main
=======
>>>>>>> locatelli-main
=======
>>>>>>> locatelli-main
=======
>>>>>>> locatelli-main
=======
>>>>>>> locatelli-main
=======
>>>>>>> locatelli-main
=======
>>>>>>> locatelli-main
=======
>>>>>>> locatelli-main
=======
>>>>>>> locatelli-main
=======
>>>>>>> locatelli-main
=======
>>>>>>> locatelli-main
=======
>>>>>>> locatelli-main
=======
>>>>>>> locatelli-main
=======
>>>>>>> locatelli-main
=======
>>>>>>> locatelli-main
=======
>>>>>>> locatelli-main
=======
>>>>>>> locatelli-main
=======
>>>>>>> locatelli-main
=======
>>>>>>> locatelli-main
=======
>>>>>>> locatelli-main
=======
>>>>>>> locatelli-main
=======
>>>>>>> locatelli-main
=======
>>>>>>> locatelli-main
=======
>>>>>>> locatelli-main
>>>>>>> 1b3a148b37 (GEOMESA-3092 Support Lambda NiFi processor (#2777))
<<<<<<< HEAD
<<<<<<< HEAD
      "org.apache.thrift:libthrift:0.12.0:jar"
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
<<<<<<< HEAD
      "org.apache.htrace:htrace-core:3.1.0-incubating:jar"
=======
>>>>>>> locatelli-main
=======
      "org.apache.htrace:htrace-core:3.1.0-incubating:jar"
=======
>>>>>>> locatelli-main
=======
      "org.apache.htrace:htrace-core:3.1.0-incubating:jar"
=======
>>>>>>> locatelli-main
=======
      "org.apache.htrace:htrace-core:3.1.0-incubating:jar"
=======
>>>>>>> locatelli-main
=======
      "org.apache.htrace:htrace-core:3.1.0-incubating:jar"
=======
>>>>>>> locatelli-main
=======
      "org.apache.htrace:htrace-core:3.1.0-incubating:jar"
=======
>>>>>>> locatelli-main
=======
      "org.apache.htrace:htrace-core:3.1.0-incubating:jar"
=======
>>>>>>> locatelli-main
=======
      "org.apache.htrace:htrace-core:3.1.0-incubating:jar"
=======
>>>>>>> locatelli-main
=======
      "org.apache.htrace:htrace-core:3.1.0-incubating:jar"
=======
>>>>>>> locatelli-main
=======
=======
>>>>>>> 0884e75348d (GEOMESA-3254 Add Bloop build support)
<<<<<<< HEAD
      "org.apache.thrift:libthrift:%%thrift.version%%:jar"
>>>>>>> 276558f47d3 (GEOMESA-3092 Support Lambda NiFi processor (#2777))
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
<<<<<<< HEAD
>>>>>>> 7e635f57dc2 (GEOMESA-3092 Support Lambda NiFi processor (#2777))
=======
>>>>>>> locatelli-main
=======
>>>>>>> 7e635f57dc2 (GEOMESA-3092 Support Lambda NiFi processor (#2777))
=======
>>>>>>> locatelli-main
=======
>>>>>>> 7e635f57dc2 (GEOMESA-3092 Support Lambda NiFi processor (#2777))
=======
>>>>>>> locatelli-main
=======
>>>>>>> 7e635f57dc2 (GEOMESA-3092 Support Lambda NiFi processor (#2777))
=======
>>>>>>> locatelli-main
=======
>>>>>>> 7e635f57dc2 (GEOMESA-3092 Support Lambda NiFi processor (#2777))
=======
>>>>>>> locatelli-main
=======
>>>>>>> 7e635f57dc2 (GEOMESA-3092 Support Lambda NiFi processor (#2777))
=======
>>>>>>> locatelli-main
=======
>>>>>>> 7e635f57dc2 (GEOMESA-3092 Support Lambda NiFi processor (#2777))
=======
>>>>>>> locatelli-main
=======
>>>>>>> 7e635f57dc2 (GEOMESA-3092 Support Lambda NiFi processor (#2777))
=======
>>>>>>> locatelli-main
=======
>>>>>>> 7e635f57dc2 (GEOMESA-3092 Support Lambda NiFi processor (#2777))
=======
>>>>>>> locatelli-main
=======
=======
>>>>>>> 15b6bf02d15 (GEOMESA-3254 Add Bloop build support)
=======
>>>>>>> 9b5b23eb090 (GEOMESA-3092 Support Lambda NiFi processor (#2777))
=======
>>>>>>> 2af63e167d9 (GEOMESA-3092 Support Lambda NiFi processor (#2777))
=======
>>>>>>> 57082641bc6 (GEOMESA-3092 Support Lambda NiFi processor (#2777))
=======
>>>>>>> 7c6dac7c346 (GEOMESA-3254 Add Bloop build support)
=======
>>>>>>> 5ba80a089cc (GEOMESA-3092 Support Lambda NiFi processor (#2777))
<<<<<<< HEAD
=======
=======
>>>>>>> 29826bdce01 (GEOMESA-3092 Support Lambda NiFi processor (#2777))
=======
>>>>>>> f5016115b5a (GEOMESA-3092 Support Lambda NiFi processor (#2777))
=======
>>>>>>> 2bf9294f93e (GEOMESA-3092 Support Lambda NiFi processor (#2777))
=======
>>>>>>> 75ae649304a (GEOMESA-3254 Add Bloop build support)
=======
>>>>>>> e4edd3d6ceb (GEOMESA-3092 Support Lambda NiFi processor (#2777))
=======
>>>>>>> 9f1e983c633 (GEOMESA-3254 Add Bloop build support)
=======
>>>>>>> de3e5a3cc80 (GEOMESA-3092 Support Lambda NiFi processor (#2777))
=======
>>>>>>> bde70962716 (GEOMESA-3092 Support Lambda NiFi processor (#2777))
=======
>>>>>>> 1079b681475 (GEOMESA-3092 Support Lambda NiFi processor (#2777))
=======
>>>>>>> 37636fb3b99 (GEOMESA-3254 Add Bloop build support)
=======
>>>>>>> ab5ec6e2ea7 (GEOMESA-3092 Support Lambda NiFi processor (#2777))
=======
>>>>>>> 8f244c4b80a (GEOMESA-3254 Add Bloop build support)
<<<<<<< HEAD
=======
=======
>>>>>>> 9a2786a041b (GEOMESA-3092 Support Lambda NiFi processor (#2777))
<<<<<<< HEAD
=======
>>>>>>> 38df2fe8ca (GEOMESA-3092 Support Lambda NiFi processor (#2777))
>>>>>>> 2cebad934f2 (GEOMESA-3092 Support Lambda NiFi processor (#2777))
=======
>>>>>>> 1765bd4159 (GEOMESA-3092 Support Lambda NiFi processor (#2777))
=======
>>>>>>> 5a4c24e020 (GEOMESA-3254 Add Bloop build support)
>>>>>>> a104e87b93f (GEOMESA-3254 Add Bloop build support)
=======
>>>>>>> 89085e28b8 (GEOMESA-3092 Support Lambda NiFi processor (#2777))
=======
<<<<<<< HEAD
<<<<<<< HEAD
>>>>>>> 541079bbd0 (GEOMESA-3092 Support Lambda NiFi processor (#2777))
=======
>>>>>>> b298e017f1 (GEOMESA-3254 Add Bloop build support)
=======
>>>>>>> 991f10e2a4 (GEOMESA-3092 Support Lambda NiFi processor (#2777))
=======
>>>>>>> ce026b5c8a (GEOMESA-3092 Support Lambda NiFi processor (#2777))
=======
>>>>>>> 0283274bf0 (GEOMESA-3092 Support Lambda NiFi processor (#2777))
=======
>>>>>>> c738f63bd9 (GEOMESA-3254 Add Bloop build support)
=======
>>>>>>> 0b090a0ead (GEOMESA-3092 Support Lambda NiFi processor (#2777))
=======
=======
>>>>>>> 5a4c24e020 (GEOMESA-3254 Add Bloop build support)
>>>>>>> 13656f5052 (GEOMESA-3254 Add Bloop build support)
=======
=======
>>>>>>> 38df2fe8ca (GEOMESA-3092 Support Lambda NiFi processor (#2777))
=======
>>>>>>> 541079bbd0 (GEOMESA-3092 Support Lambda NiFi processor (#2777))
=======
>>>>>>> 1765bd4159 (GEOMESA-3092 Support Lambda NiFi processor (#2777))
>>>>>>> 234aacdc12 (GEOMESA-3092 Support Lambda NiFi processor (#2777))
=======
>>>>>>> 63a045a753 (GEOMESA-3254 Add Bloop build support)
<<<<<<< HEAD
<<<<<<< HEAD
<<<<<<< HEAD
<<<<<<< HEAD
<<<<<<< HEAD
<<<<<<< HEAD
=======
>>>>>>> 89085e28b8 (GEOMESA-3092 Support Lambda NiFi processor (#2777))
=======
>>>>>>> 991f10e2a4 (GEOMESA-3092 Support Lambda NiFi processor (#2777))
=======
>>>>>>> 13656f5052 (GEOMESA-3254 Add Bloop build support)
=======
=======
>>>>>>> 89085e28b8 (GEOMESA-3092 Support Lambda NiFi processor (#2777))
>>>>>>> 38df2fe8ca (GEOMESA-3092 Support Lambda NiFi processor (#2777))
=======
=======
>>>>>>> 234aacdc1 (GEOMESA-3092 Support Lambda NiFi processor (#2777))
>>>>>>> 19646771be (GEOMESA-3092 Support Lambda NiFi processor (#2777))
<<<<<<< HEAD
<<<<<<< HEAD
<<<<<<< HEAD
<<<<<<< HEAD
<<<<<<< HEAD
<<<<<<< HEAD
=======
>>>>>>> 38df2fe8ca (GEOMESA-3092 Support Lambda NiFi processor (#2777))
=======
>>>>>>> 1765bd4159 (GEOMESA-3092 Support Lambda NiFi processor (#2777))
=======
>>>>>>> 5e469d5cd9 (GEOMESA-3092 Support Lambda NiFi processor (#2777))
=======
>>>>>>> 87ab0f22da (GEOMESA-3092 Support Lambda NiFi processor (#2777))
<<<<<<< HEAD
<<<<<<< HEAD
=======
>>>>>>> f1532f2313 (GEOMESA-3254 Add Bloop build support)
=======
=======
>>>>>>> 234aacdc12 (GEOMESA-3092 Support Lambda NiFi processor (#2777))
>>>>>>> 60be59afe8 (GEOMESA-3092 Support Lambda NiFi processor (#2777))
<<<<<<< HEAD
<<<<<<< HEAD
=======
>>>>>>> 5a4c24e020 (GEOMESA-3254 Add Bloop build support)
=======
>>>>>>> 89085e28b8 (GEOMESA-3092 Support Lambda NiFi processor (#2777))
<<<<<<< HEAD
<<<<<<< HEAD
=======
>>>>>>> 1765bd4159 (GEOMESA-3092 Support Lambda NiFi processor (#2777))
=======
=======
>>>>>>> 5e469d5cd9 (GEOMESA-3092 Support Lambda NiFi processor (#2777))
>>>>>>> 541079bbd0 (GEOMESA-3092 Support Lambda NiFi processor (#2777))
<<<<<<< HEAD
<<<<<<< HEAD
=======
>>>>>>> a154b4927b (GEOMESA-3092 Support Lambda NiFi processor (#2777))
=======
>>>>>>> 7a84c9d22d (GEOMESA-3254 Add Bloop build support)
=======
=======
>>>>>>> 234aacdc12 (GEOMESA-3092 Support Lambda NiFi processor (#2777))
>>>>>>> 7fff0a6154 (GEOMESA-3092 Support Lambda NiFi processor (#2777))
=======
>>>>>>> b298e017f1 (GEOMESA-3254 Add Bloop build support)
=======
>>>>>>> 991f10e2a4 (GEOMESA-3092 Support Lambda NiFi processor (#2777))
=======
=======
>>>>>>> 5e469d5cd9 (GEOMESA-3092 Support Lambda NiFi processor (#2777))
>>>>>>> ce026b5c8a (GEOMESA-3092 Support Lambda NiFi processor (#2777))
=======
>>>>>>> 0283274bf0 (GEOMESA-3092 Support Lambda NiFi processor (#2777))
=======
=======
>>>>>>> f1532f2313 (GEOMESA-3254 Add Bloop build support)
>>>>>>> c738f63bd9 (GEOMESA-3254 Add Bloop build support)
=======
>>>>>>> 0b090a0ead (GEOMESA-3092 Support Lambda NiFi processor (#2777))
=======
=======
>>>>>>> 5a4c24e020 (GEOMESA-3254 Add Bloop build support)
>>>>>>> 13656f5052 (GEOMESA-3254 Add Bloop build support)
=======
>>>>>>> 38df2fe8ca (GEOMESA-3092 Support Lambda NiFi processor (#2777))
=======
>>>>>>> 1765bd4159 (GEOMESA-3092 Support Lambda NiFi processor (#2777))
=======
>>>>>>> locationtech-main
=======
>>>>>>> 1a04676d44 (GEOMESA-3092 Support Lambda NiFi processor (#2777))
>>>>>>> 1b3a148b37 (GEOMESA-3092 Support Lambda NiFi processor (#2777))
=======
>>>>>>> 1a04676d44 (GEOMESA-3092 Support Lambda NiFi processor (#2777))
      "org.apache.thrift:libthrift:%%thrift.version%%:jar"
<<<<<<< HEAD
<<<<<<< HEAD
<<<<<<< HEAD
<<<<<<< HEAD
<<<<<<< HEAD
<<<<<<< HEAD
<<<<<<< HEAD
<<<<<<< HEAD
<<<<<<< HEAD
<<<<<<< HEAD
<<<<<<< HEAD
<<<<<<< HEAD
<<<<<<< HEAD
<<<<<<< HEAD
<<<<<<< HEAD
<<<<<<< HEAD
<<<<<<< HEAD
<<<<<<< HEAD
<<<<<<< HEAD
<<<<<<< HEAD
<<<<<<< HEAD
<<<<<<< HEAD
<<<<<<< HEAD
<<<<<<< HEAD
>>>>>>> locatelli-main
=======
>>>>>>> locatelli-main
=======
>>>>>>> locatelli-main
=======
>>>>>>> locatelli-main
=======
>>>>>>> locatelli-main
=======
>>>>>>> locatelli-main
=======
>>>>>>> locatelli-main
=======
>>>>>>> locatelli-main
=======
>>>>>>> locatelli-main
=======
>>>>>>> locatelli-main
=======
>>>>>>> locatelli-main
=======
>>>>>>> locatelli-main
=======
>>>>>>> locatelli-main
=======
>>>>>>> locatelli-main
=======
>>>>>>> locatelli-main
=======
>>>>>>> locatelli-main
=======
>>>>>>> locatelli-main
=======
>>>>>>> locatelli-main
=======
>>>>>>> locatelli-main
=======
>>>>>>> locatelli-main
=======
>>>>>>> locatelli-main
=======
>>>>>>> locatelli-main
=======
>>>>>>> locatelli-main
=======
>>>>>>> locatelli-main
=======
>>>>>>> locatelli-main
=======
<<<<<<< HEAD
      "org.apache.commons:commons-collections4:4.4:jar"
=======
      "org.apache.commons:commons-collections4:4.3:jar"
>>>>>>> 51a90e7f0 (GEOMESA-3092 Support Lambda NiFi processor (#2777))
      "org.apache.accumulo:accumulo-hadoop-mapreduce:${accumulo_version}:jar"
>>>>>>> 120815d0b (GEOMESA-3092 Support Lambda NiFi processor (#2777))
<<<<<<< HEAD
<<<<<<< HEAD
<<<<<<< HEAD
<<<<<<< HEAD
<<<<<<< HEAD
<<<<<<< HEAD
<<<<<<< HEAD
=======
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
<<<<<<< HEAD
<<<<<<< HEAD
<<<<<<< HEAD
<<<<<<< HEAD
<<<<<<< HEAD
<<<<<<< HEAD
<<<<<<< HEAD
<<<<<<< HEAD
=======
>>>>>>> locatelli-main
<<<<<<< HEAD
=======
>>>>>>> locatelli-main
<<<<<<< HEAD
=======
=======
>>>>>>> 1b3a148b37 (GEOMESA-3092 Support Lambda NiFi processor (#2777))
<<<<<<< HEAD
<<<<<<< HEAD
>>>>>>> locatelli-main
=======
>>>>>>> locatelli-main
<<<<<<< HEAD
=======
>>>>>>> locatelli-main
<<<<<<< HEAD
=======
>>>>>>> 1b3a148b37 (GEOMESA-3092 Support Lambda NiFi processor (#2777))
<<<<<<< HEAD
<<<<<<< HEAD
>>>>>>> locatelli-main
=======
>>>>>>> 1b3a148b37 (GEOMESA-3092 Support Lambda NiFi processor (#2777))
<<<<<<< HEAD
<<<<<<< HEAD
>>>>>>> locatelli-main
=======
>>>>>>> 1b3a148b37 (GEOMESA-3092 Support Lambda NiFi processor (#2777))
<<<<<<< HEAD
<<<<<<< HEAD
>>>>>>> locatelli-main
=======
>>>>>>> 1b3a148b37 (GEOMESA-3092 Support Lambda NiFi processor (#2777))
<<<<<<< HEAD
<<<<<<< HEAD
>>>>>>> locatelli-main
=======
>>>>>>> 1b3a148b37 (GEOMESA-3092 Support Lambda NiFi processor (#2777))
<<<<<<< HEAD
<<<<<<< HEAD
>>>>>>> locatelli-main
=======
=======
>>>>>>> locatelli-main
=======
>>>>>>> locatelli-main
=======
>>>>>>> locatelli-main
=======
>>>>>>> locatelli-main
=======
>>>>>>> locatelli-main
=======
>>>>>>> locatelli-main
=======
>>>>>>> locatelli-main
=======
>>>>>>> locatelli-main
=======
>>>>>>> locatelli-main
=======
>>>>>>> locatelli-main
=======
>>>>>>> locatelli-main
=======
>>>>>>> locatelli-main
=======
>>>>>>> locatelli-main
=======
>>>>>>> locatelli-main
=======
>>>>>>> locatelli-main
=======
>>>>>>> locatelli-main
=======
>>>>>>> locatelli-main
=======
>>>>>>> locatelli-main
=======
>>>>>>> locatelli-main
=======
>>>>>>> locatelli-main
=======
>>>>>>> locatelli-main
=======
>>>>>>> locatelli-main
=======
>>>>>>> locatelli-main
=======
>>>>>>> locatelli-main
>>>>>>> 1b3a148b37 (GEOMESA-3092 Support Lambda NiFi processor (#2777))
<<<<<<< HEAD
<<<<<<< HEAD
>>>>>>> a76720eebac (GEOMESA-3092 Support Lambda NiFi processor (#2777))
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
<<<<<<< HEAD
>>>>>>> 2af63e167d9 (GEOMESA-3092 Support Lambda NiFi processor (#2777))
=======
<<<<<<< HEAD
>>>>>>> 5ba80a089cc (GEOMESA-3092 Support Lambda NiFi processor (#2777))
=======
<<<<<<< HEAD
>>>>>>> f5016115b5a (GEOMESA-3092 Support Lambda NiFi processor (#2777))
=======
<<<<<<< HEAD
>>>>>>> e4edd3d6ceb (GEOMESA-3092 Support Lambda NiFi processor (#2777))
=======
<<<<<<< HEAD
>>>>>>> bde70962716 (GEOMESA-3092 Support Lambda NiFi processor (#2777))
=======
<<<<<<< HEAD
>>>>>>> ab5ec6e2ea7 (GEOMESA-3092 Support Lambda NiFi processor (#2777))
=======
<<<<<<< HEAD
>>>>>>> 9a2786a041b (GEOMESA-3092 Support Lambda NiFi processor (#2777))
<<<<<<< HEAD
<<<<<<< HEAD
<<<<<<< HEAD
<<<<<<< HEAD
<<<<<<< HEAD
<<<<<<< HEAD
<<<<<<< HEAD
<<<<<<< HEAD
<<<<<<< HEAD
<<<<<<< HEAD
<<<<<<< HEAD
<<<<<<< HEAD
<<<<<<< HEAD
<<<<<<< HEAD
<<<<<<< HEAD
>>>>>>> locatelli-main
=======
>>>>>>> locatelli-main
=======
>>>>>>> locatelli-main
=======
>>>>>>> locatelli-main
=======
>>>>>>> locatelli-main
=======
>>>>>>> locatelli-main
=======
>>>>>>> locatelli-main
=======
>>>>>>> locatelli-main
=======
>>>>>>> locatelli-main
=======
>>>>>>> locatelli-main
=======
>>>>>>> locatelli-main
=======
>>>>>>> locatelli-main
=======
>>>>>>> locatelli-main
=======
>>>>>>> locatelli-main
=======
>>>>>>> locatelli-main
=======
>>>>>>> locatelli-main
=======
<<<<<<< HEAD
=======
>>>>>>> locatelli-main
=======
>>>>>>> locatelli-main
=======
>>>>>>> locatelli-main
=======
>>>>>>> locatelli-main
=======
>>>>>>> locatelli-main
=======
>>>>>>> locatelli-main
=======
>>>>>>> locatelli-main
=======
>>>>>>> locatelli-main
>>>>>>> e036868938d (GEOMESA-3092 Support Lambda NiFi processor (#2777))
=======
=======
<<<<<<< HEAD
>>>>>>> 2af63e167d9 (GEOMESA-3092 Support Lambda NiFi processor (#2777))
<<<<<<< HEAD
>>>>>>> 66b921818ec (GEOMESA-3092 Support Lambda NiFi processor (#2777))
=======
=======
<<<<<<< HEAD
>>>>>>> 5ba80a089cc (GEOMESA-3092 Support Lambda NiFi processor (#2777))
<<<<<<< HEAD
>>>>>>> 7637d3be360 (GEOMESA-3092 Support Lambda NiFi processor (#2777))
=======
=======
<<<<<<< HEAD
>>>>>>> f5016115b5a (GEOMESA-3092 Support Lambda NiFi processor (#2777))
<<<<<<< HEAD
>>>>>>> d89d2359882 (GEOMESA-3092 Support Lambda NiFi processor (#2777))
=======
=======
<<<<<<< HEAD
>>>>>>> e4edd3d6ceb (GEOMESA-3092 Support Lambda NiFi processor (#2777))
<<<<<<< HEAD
>>>>>>> 1c8989f8064 (GEOMESA-3092 Support Lambda NiFi processor (#2777))
=======
=======
<<<<<<< HEAD
>>>>>>> bde70962716 (GEOMESA-3092 Support Lambda NiFi processor (#2777))
<<<<<<< HEAD
>>>>>>> 56a09e4eb9e (GEOMESA-3092 Support Lambda NiFi processor (#2777))
=======
=======
<<<<<<< HEAD
>>>>>>> ab5ec6e2ea7 (GEOMESA-3092 Support Lambda NiFi processor (#2777))
<<<<<<< HEAD
>>>>>>> 22cf13ed9be (GEOMESA-3092 Support Lambda NiFi processor (#2777))
=======
=======
<<<<<<< HEAD
>>>>>>> 9a2786a041b (GEOMESA-3092 Support Lambda NiFi processor (#2777))
>>>>>>> 92ec02ac2b8 (GEOMESA-3092 Support Lambda NiFi processor (#2777))
<<<<<<< HEAD
<<<<<<< HEAD
<<<<<<< HEAD
<<<<<<< HEAD
<<<<<<< HEAD
<<<<<<< HEAD
<<<<<<< HEAD
<<<<<<< HEAD
>>>>>>> locatelli-main
=======
>>>>>>> locatelli-main
=======
>>>>>>> locatelli-main
=======
>>>>>>> locatelli-main
=======
>>>>>>> locatelli-main
=======
>>>>>>> locatelli-main
=======
>>>>>>> locatelli-main
=======
>>>>>>> locatelli-main
=======
>>>>>>> locatelli-main
    )
  else
    gavs+=(
<<<<<<< HEAD
<<<<<<< HEAD
<<<<<<< HEAD
=======
>>>>>>> fa60953a42 (GEOMESA-3254 Add Bloop build support)
      "org.apache.commons:commons-collections4:4.3:jar"
=======
<<<<<<< HEAD
      "org.apache.commons:commons-collections4:4.4:jar"
=======
      "org.apache.commons:commons-collections4:4.3:jar"
>>>>>>> 51a90e7f0 (GEOMESA-3092 Support Lambda NiFi processor (#2777))
<<<<<<< HEAD
>>>>>>> 120815d0b0 (GEOMESA-3092 Support Lambda NiFi processor (#2777))
=======
      "org.apache.commons:commons-collections4:4.4:jar"
>>>>>>> d845d7c1bd (GEOMESA-3254 Add Bloop build support)
=======
      "org.apache.commons:commons-collections4:4.4:jar"
>>>>>>> 58d14a257e (GEOMESA-3254 Add Bloop build support)
=======
      "org.apache.commons:commons-collections4:4.3:jar"
>>>>>>> 16f912e1ef (GEOMESA-3092 Support Lambda NiFi processor (#2777))
=======
>>>>>>> 120815d0b (GEOMESA-3092 Support Lambda NiFi processor (#2777))
<<<<<<< HEAD
>>>>>>> fd675cc6b6 (GEOMESA-3092 Support Lambda NiFi processor (#2777))
=======
=======
      "org.apache.commons:commons-collections4:4.4:jar"
>>>>>>> d845d7c1b (GEOMESA-3254 Add Bloop build support)
<<<<<<< HEAD
>>>>>>> 63a045a753 (GEOMESA-3254 Add Bloop build support)
=======
=======
      "org.apache.commons:commons-collections4:4.4:jar"
>>>>>>> 58d14a257 (GEOMESA-3254 Add Bloop build support)
>>>>>>> fa60953a42 (GEOMESA-3254 Add Bloop build support)
      "org.apache.accumulo:accumulo-hadoop-mapreduce:${accumulo_version}:jar"
=======
>>>>>>> 5e469d5cd9 (GEOMESA-3092 Support Lambda NiFi processor (#2777))
=======
>>>>>>> 60be59afe8 (GEOMESA-3092 Support Lambda NiFi processor (#2777))
=======
>>>>>>> 541079bbd0 (GEOMESA-3092 Support Lambda NiFi processor (#2777))
<<<<<<< HEAD
<<<<<<< HEAD
<<<<<<< HEAD
<<<<<<< HEAD
<<<<<<< HEAD
<<<<<<< HEAD
<<<<<<< HEAD
<<<<<<< HEAD
<<<<<<< HEAD
<<<<<<< HEAD
<<<<<<< HEAD
<<<<<<< HEAD
<<<<<<< HEAD
<<<<<<< HEAD
<<<<<<< HEAD
<<<<<<< HEAD
<<<<<<< HEAD
<<<<<<< HEAD
<<<<<<< HEAD
<<<<<<< HEAD
<<<<<<< HEAD
<<<<<<< HEAD
<<<<<<< HEAD
<<<<<<< HEAD
<<<<<<< HEAD
<<<<<<< HEAD
<<<<<<< HEAD
<<<<<<< HEAD
<<<<<<< HEAD
<<<<<<< HEAD
<<<<<<< HEAD
<<<<<<< HEAD
<<<<<<< HEAD
>>>>>>> locationtech-main
=======
>>>>>>> locatelli-main
=======
>>>>>>> locatelli-main
=======
>>>>>>> locatelli-main
=======
>>>>>>> locatelli-main
=======
>>>>>>> locatelli-main
=======
>>>>>>> locatelli-main
=======
>>>>>>> locatelli-main
=======
>>>>>>> locatelli-main
=======
>>>>>>> locatelli-main
=======
>>>>>>> locatelli-main
=======
>>>>>>> locatelli-main
=======
>>>>>>> locatelli-main
=======
>>>>>>> locatelli-main
=======
>>>>>>> locatelli-main
=======
>>>>>>> locatelli-main
=======
>>>>>>> locatelli-main
=======
>>>>>>> locatelli-main
=======
>>>>>>> locatelli-main
=======
>>>>>>> locatelli-main
=======
>>>>>>> locatelli-main
=======
>>>>>>> locatelli-main
=======
>>>>>>> locatelli-main
=======
>>>>>>> locatelli-main
=======
>>>>>>> locatelli-main
=======
>>>>>>> locatelli-main
=======
>>>>>>> locatelli-main
=======
>>>>>>> locatelli-main
=======
>>>>>>> locatelli-main
=======
>>>>>>> locatelli-main
=======
>>>>>>> locatelli-main
=======
>>>>>>> locatelli-main
=======
>>>>>>> locatelli-main
=======
>>>>>>> locatelli-main
    )
  else
    gavs+=(
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
<<<<<<< HEAD
<<<<<<< HEAD
<<<<<<< HEAD
<<<<<<< HEAD
<<<<<<< HEAD
<<<<<<< HEAD
<<<<<<< HEAD
<<<<<<< HEAD
<<<<<<< HEAD
<<<<<<< HEAD
<<<<<<< HEAD
<<<<<<< HEAD
<<<<<<< HEAD
<<<<<<< HEAD
<<<<<<< HEAD
<<<<<<< HEAD
<<<<<<< HEAD
<<<<<<< HEAD
<<<<<<< HEAD
<<<<<<< HEAD
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
>>>>>>> fa60953a42 (GEOMESA-3254 Add Bloop build support)
>>>>>>> location-main
=======
<<<<<<< HEAD
=======
>>>>>>> fa60953a42 (GEOMESA-3254 Add Bloop build support)
>>>>>>> locationtech-main
=======
>>>>>>> fa60953a42 (GEOMESA-3254 Add Bloop build support)
>>>>>>> locatelli-main
=======
>>>>>>> fa60953a42 (GEOMESA-3254 Add Bloop build support)
>>>>>>> locatelli-main
=======
>>>>>>> fa60953a42 (GEOMESA-3254 Add Bloop build support)
>>>>>>> locatelli-main
=======
>>>>>>> fa60953a42 (GEOMESA-3254 Add Bloop build support)
>>>>>>> locatelli-main
=======
>>>>>>> fa60953a42 (GEOMESA-3254 Add Bloop build support)
>>>>>>> locatelli-main
=======
>>>>>>> fa60953a42 (GEOMESA-3254 Add Bloop build support)
>>>>>>> locatelli-main
=======
>>>>>>> fa60953a42 (GEOMESA-3254 Add Bloop build support)
>>>>>>> locatelli-main
=======
>>>>>>> fa60953a42 (GEOMESA-3254 Add Bloop build support)
>>>>>>> locatelli-main
=======
>>>>>>> fa60953a42 (GEOMESA-3254 Add Bloop build support)
>>>>>>> locatelli-main
=======
>>>>>>> fa60953a42 (GEOMESA-3254 Add Bloop build support)
>>>>>>> locatelli-main
=======
>>>>>>> fa60953a42 (GEOMESA-3254 Add Bloop build support)
>>>>>>> locatelli-main
=======
>>>>>>> fa60953a42 (GEOMESA-3254 Add Bloop build support)
>>>>>>> locatelli-main
=======
>>>>>>> fa60953a42 (GEOMESA-3254 Add Bloop build support)
>>>>>>> locatelli-main
=======
>>>>>>> fa60953a42 (GEOMESA-3254 Add Bloop build support)
>>>>>>> locatelli-main
=======
>>>>>>> fa60953a42 (GEOMESA-3254 Add Bloop build support)
>>>>>>> locatelli-main
=======
>>>>>>> fa60953a42 (GEOMESA-3254 Add Bloop build support)
>>>>>>> locatelli-main
=======
>>>>>>> fa60953a42 (GEOMESA-3254 Add Bloop build support)
>>>>>>> locatelli-main
=======
>>>>>>> fa60953a42 (GEOMESA-3254 Add Bloop build support)
>>>>>>> locatelli-main
=======
>>>>>>> fa60953a42 (GEOMESA-3254 Add Bloop build support)
>>>>>>> locatelli-main
=======
>>>>>>> fa60953a42 (GEOMESA-3254 Add Bloop build support)
>>>>>>> locatelli-main
=======
>>>>>>> fa60953a42 (GEOMESA-3254 Add Bloop build support)
>>>>>>> locatelli-main
=======
>>>>>>> fa60953a42 (GEOMESA-3254 Add Bloop build support)
>>>>>>> locatelli-main
=======
>>>>>>> fa60953a42 (GEOMESA-3254 Add Bloop build support)
>>>>>>> locatelli-main
=======
>>>>>>> fa60953a42 (GEOMESA-3254 Add Bloop build support)
>>>>>>> locatelli-main
=======
>>>>>>> fa60953a42 (GEOMESA-3254 Add Bloop build support)
>>>>>>> locatelli-main
=======
>>>>>>> fa60953a42 (GEOMESA-3254 Add Bloop build support)
>>>>>>> locatelli-main
=======
>>>>>>> fa60953a42 (GEOMESA-3254 Add Bloop build support)
>>>>>>> locatelli-main
=======
>>>>>>> fa60953a42 (GEOMESA-3254 Add Bloop build support)
>>>>>>> locatelli-main
=======
>>>>>>> fa60953a42 (GEOMESA-3254 Add Bloop build support)
>>>>>>> locatelli-main
=======
>>>>>>> fa60953a42 (GEOMESA-3254 Add Bloop build support)
>>>>>>> locatelli-main
=======
>>>>>>> fa60953a42 (GEOMESA-3254 Add Bloop build support)
>>>>>>> locatelli-main
=======
>>>>>>> fa60953a42 (GEOMESA-3254 Add Bloop build support)
>>>>>>> locatelli-main
=======
>>>>>>> fa60953a42 (GEOMESA-3254 Add Bloop build support)
>>>>>>> locatelli-main
      "org.apache.commons:commons-collections4:4.3:jar"
=======
<<<<<<< HEAD
      "org.apache.commons:commons-collections4:4.4:jar"
=======
      "org.apache.commons:commons-collections4:4.3:jar"
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
<<<<<<< HEAD
<<<<<<< HEAD
<<<<<<< HEAD
<<<<<<< HEAD
<<<<<<< HEAD
>>>>>>> 120815d0b (GEOMESA-3092 Support Lambda NiFi processor (#2777))
=======
      "org.apache.commons:commons-collections4:4.4:jar"
>>>>>>> d845d7c1b (GEOMESA-3254 Add Bloop build support)
=======
      "org.apache.commons:commons-collections4:4.4:jar"
>>>>>>> 58d14a257 (GEOMESA-3254 Add Bloop build support)
      "org.apache.accumulo:accumulo-hadoop-mapreduce:${accumulo_version}:jar"
=======
>>>>>>> locationtech-main
=======
<<<<<<< HEAD
=======
>>>>>>> locationtech-main
=======
>>>>>>> locatelli-main
=======
>>>>>>> locatelli-main
=======
>>>>>>> locatelli-main
=======
>>>>>>> locatelli-main
=======
>>>>>>> locatelli-main
=======
>>>>>>> locatelli-main
=======
>>>>>>> locatelli-main
=======
>>>>>>> locatelli-main
=======
>>>>>>> locatelli-main
=======
>>>>>>> locatelli-main
=======
>>>>>>> locatelli-main
=======
>>>>>>> locatelli-main
=======
>>>>>>> locatelli-main
=======
>>>>>>> locatelli-main
=======
>>>>>>> locatelli-main
=======
>>>>>>> locatelli-main
=======
>>>>>>> locatelli-main
=======
>>>>>>> locatelli-main
=======
>>>>>>> locatelli-main
=======
>>>>>>> locatelli-main
=======
>>>>>>> locatelli-main
=======
>>>>>>> locatelli-main
=======
>>>>>>> locatelli-main
=======
>>>>>>> locatelli-main
=======
>>>>>>> locatelli-main
=======
>>>>>>> locatelli-main
=======
>>>>>>> locatelli-main
=======
>>>>>>> locatelli-main
=======
>>>>>>> locatelli-main
=======
>>>>>>> locatelli-main
=======
>>>>>>> locatelli-main
=======
>>>>>>> locatelli-main
=======
>>>>>>> locatelli-main
>>>>>>> 120815d0b0 (GEOMESA-3092 Support Lambda NiFi processor (#2777))
=======
      "org.apache.commons:commons-collections4:4.4:jar"
>>>>>>> d845d7c1bd (GEOMESA-3254 Add Bloop build support)
=======
      "org.apache.commons:commons-collections4:4.4:jar"
>>>>>>> 58d14a257e (GEOMESA-3254 Add Bloop build support)
=======
      "org.apache.commons:commons-collections4:4.3:jar"
>>>>>>> 16f912e1ef (GEOMESA-3092 Support Lambda NiFi processor (#2777))
=======
>>>>>>> 120815d0b (GEOMESA-3092 Support Lambda NiFi processor (#2777))
<<<<<<< HEAD
>>>>>>> fd675cc6b6 (GEOMESA-3092 Support Lambda NiFi processor (#2777))
=======
=======
      "org.apache.commons:commons-collections4:4.4:jar"
>>>>>>> d845d7c1b (GEOMESA-3254 Add Bloop build support)
<<<<<<< HEAD
>>>>>>> 63a045a753 (GEOMESA-3254 Add Bloop build support)
=======
=======
      "org.apache.commons:commons-collections4:4.4:jar"
>>>>>>> 58d14a257 (GEOMESA-3254 Add Bloop build support)
>>>>>>> fa60953a42 (GEOMESA-3254 Add Bloop build support)
      "org.apache.accumulo:accumulo-hadoop-mapreduce:${accumulo_version}:jar"
=======
>>>>>>> 5e469d5cd9 (GEOMESA-3092 Support Lambda NiFi processor (#2777))
<<<<<<< HEAD
<<<<<<< HEAD
<<<<<<< HEAD
<<<<<<< HEAD
<<<<<<< HEAD
<<<<<<< HEAD
<<<<<<< HEAD
<<<<<<< HEAD
<<<<<<< HEAD
<<<<<<< HEAD
<<<<<<< HEAD
<<<<<<< HEAD
<<<<<<< HEAD
<<<<<<< HEAD
<<<<<<< HEAD
<<<<<<< HEAD
<<<<<<< HEAD
<<<<<<< HEAD
<<<<<<< HEAD
<<<<<<< HEAD
<<<<<<< HEAD
<<<<<<< HEAD
<<<<<<< HEAD
<<<<<<< HEAD
<<<<<<< HEAD
<<<<<<< HEAD
<<<<<<< HEAD
<<<<<<< HEAD
<<<<<<< HEAD
<<<<<<< HEAD
<<<<<<< HEAD
<<<<<<< HEAD
<<<<<<< HEAD
<<<<<<< HEAD
>>>>>>> location-main
=======
=======
>>>>>>> locatelli-main
=======
>>>>>>> locatelli-main
=======
>>>>>>> locatelli-main
=======
>>>>>>> locatelli-main
=======
>>>>>>> locatelli-main
=======
>>>>>>> locatelli-main
=======
>>>>>>> locatelli-main
=======
>>>>>>> locatelli-main
=======
>>>>>>> locatelli-main
=======
>>>>>>> locatelli-main
=======
>>>>>>> locatelli-main
=======
>>>>>>> locatelli-main
=======
>>>>>>> locatelli-main
=======
>>>>>>> locatelli-main
=======
>>>>>>> locatelli-main
=======
>>>>>>> locatelli-main
=======
>>>>>>> locatelli-main
=======
>>>>>>> locatelli-main
=======
>>>>>>> locatelli-main
=======
>>>>>>> locatelli-main
=======
>>>>>>> locatelli-main
=======
>>>>>>> locatelli-main
=======
>>>>>>> locatelli-main
=======
>>>>>>> locatelli-main
=======
>>>>>>> locatelli-main
=======
>>>>>>> locatelli-main
=======
>>>>>>> locatelli-main
=======
>>>>>>> locatelli-main
=======
>>>>>>> locatelli-main
=======
>>>>>>> locatelli-main
=======
>>>>>>> locatelli-main
=======
>>>>>>> locatelli-main
=======
<<<<<<< HEAD
>>>>>>> 7fff0a6154 (GEOMESA-3092 Support Lambda NiFi processor (#2777))
=======
>>>>>>> ce026b5c8a (GEOMESA-3092 Support Lambda NiFi processor (#2777))
=======
>>>>>>> 0b090a0ead (GEOMESA-3092 Support Lambda NiFi processor (#2777))
=======
>>>>>>> 1765bd4159 (GEOMESA-3092 Support Lambda NiFi processor (#2777))
    )
  else
    gavs+=(
<<<<<<< HEAD
<<<<<<< HEAD
<<<<<<< HEAD
=======
>>>>>>> fa60953a42 (GEOMESA-3254 Add Bloop build support)
      "org.apache.commons:commons-collections4:4.3:jar"
=======
<<<<<<< HEAD
      "org.apache.commons:commons-collections4:4.4:jar"
=======
      "org.apache.commons:commons-collections4:4.3:jar"
>>>>>>> 51a90e7f0 (GEOMESA-3092 Support Lambda NiFi processor (#2777))
<<<<<<< HEAD
>>>>>>> 120815d0b0 (GEOMESA-3092 Support Lambda NiFi processor (#2777))
=======
      "org.apache.commons:commons-collections4:4.4:jar"
>>>>>>> d845d7c1bd (GEOMESA-3254 Add Bloop build support)
=======
      "org.apache.commons:commons-collections4:4.4:jar"
>>>>>>> 58d14a257e (GEOMESA-3254 Add Bloop build support)
=======
      "org.apache.commons:commons-collections4:4.3:jar"
>>>>>>> 16f912e1ef (GEOMESA-3092 Support Lambda NiFi processor (#2777))
=======
>>>>>>> 120815d0b (GEOMESA-3092 Support Lambda NiFi processor (#2777))
<<<<<<< HEAD
>>>>>>> fd675cc6b6 (GEOMESA-3092 Support Lambda NiFi processor (#2777))
=======
=======
      "org.apache.commons:commons-collections4:4.4:jar"
>>>>>>> d845d7c1b (GEOMESA-3254 Add Bloop build support)
<<<<<<< HEAD
>>>>>>> 63a045a753 (GEOMESA-3254 Add Bloop build support)
=======
=======
      "org.apache.commons:commons-collections4:4.4:jar"
>>>>>>> 58d14a257 (GEOMESA-3254 Add Bloop build support)
>>>>>>> fa60953a42 (GEOMESA-3254 Add Bloop build support)
      "org.apache.accumulo:accumulo-hadoop-mapreduce:${accumulo_version}:jar"
=======
>>>>>>> 5e469d5cd9 (GEOMESA-3092 Support Lambda NiFi processor (#2777))
=======
>>>>>>> 60be59afe8 (GEOMESA-3092 Support Lambda NiFi processor (#2777))
=======
>>>>>>> 541079bbd0 (GEOMESA-3092 Support Lambda NiFi processor (#2777))
    )
  else
    gavs+=(
<<<<<<< HEAD
<<<<<<< HEAD
<<<<<<< HEAD
=======
>>>>>>> fa60953a42 (GEOMESA-3254 Add Bloop build support)
      "org.apache.commons:commons-collections4:4.3:jar"
=======
<<<<<<< HEAD
      "org.apache.commons:commons-collections4:4.4:jar"
=======
      "org.apache.commons:commons-collections4:4.3:jar"
>>>>>>> 51a90e7f0 (GEOMESA-3092 Support Lambda NiFi processor (#2777))
<<<<<<< HEAD
>>>>>>> 120815d0b0 (GEOMESA-3092 Support Lambda NiFi processor (#2777))
=======
      "org.apache.commons:commons-collections4:4.4:jar"
>>>>>>> d845d7c1bd (GEOMESA-3254 Add Bloop build support)
=======
      "org.apache.commons:commons-collections4:4.4:jar"
>>>>>>> 58d14a257e (GEOMESA-3254 Add Bloop build support)
=======
      "org.apache.commons:commons-collections4:4.3:jar"
>>>>>>> 16f912e1ef (GEOMESA-3092 Support Lambda NiFi processor (#2777))
=======
>>>>>>> 120815d0b (GEOMESA-3092 Support Lambda NiFi processor (#2777))
<<<<<<< HEAD
>>>>>>> fd675cc6b6 (GEOMESA-3092 Support Lambda NiFi processor (#2777))
=======
=======
      "org.apache.commons:commons-collections4:4.4:jar"
>>>>>>> d845d7c1b (GEOMESA-3254 Add Bloop build support)
<<<<<<< HEAD
>>>>>>> 63a045a753 (GEOMESA-3254 Add Bloop build support)
=======
=======
      "org.apache.commons:commons-collections4:4.4:jar"
>>>>>>> 58d14a257 (GEOMESA-3254 Add Bloop build support)
>>>>>>> fa60953a42 (GEOMESA-3254 Add Bloop build support)
      "org.apache.accumulo:accumulo-hadoop-mapreduce:${accumulo_version}:jar"
=======
>>>>>>> 5e469d5cd9 (GEOMESA-3092 Support Lambda NiFi processor (#2777))
<<<<<<< HEAD
<<<<<<< HEAD
<<<<<<< HEAD
<<<<<<< HEAD
<<<<<<< HEAD
<<<<<<< HEAD
<<<<<<< HEAD
<<<<<<< HEAD
<<<<<<< HEAD
<<<<<<< HEAD
<<<<<<< HEAD
<<<<<<< HEAD
<<<<<<< HEAD
<<<<<<< HEAD
<<<<<<< HEAD
<<<<<<< HEAD
<<<<<<< HEAD
<<<<<<< HEAD
<<<<<<< HEAD
<<<<<<< HEAD
<<<<<<< HEAD
<<<<<<< HEAD
<<<<<<< HEAD
<<<<<<< HEAD
<<<<<<< HEAD
<<<<<<< HEAD
<<<<<<< HEAD
<<<<<<< HEAD
<<<<<<< HEAD
<<<<<<< HEAD
<<<<<<< HEAD
<<<<<<< HEAD
>>>>>>> locatelli-main
=======
>>>>>>> locatelli-main
=======
>>>>>>> locatelli-main
=======
>>>>>>> locatelli-main
=======
>>>>>>> locatelli-main
=======
>>>>>>> locatelli-main
=======
>>>>>>> locatelli-main
=======
>>>>>>> locatelli-main
=======
>>>>>>> locatelli-main
=======
>>>>>>> locatelli-main
=======
>>>>>>> locatelli-main
=======
>>>>>>> locatelli-main
=======
>>>>>>> locatelli-main
=======
>>>>>>> locatelli-main
=======
>>>>>>> locatelli-main
=======
>>>>>>> locatelli-main
=======
>>>>>>> locatelli-main
=======
>>>>>>> locatelli-main
=======
>>>>>>> locatelli-main
=======
>>>>>>> locatelli-main
=======
>>>>>>> locatelli-main
=======
>>>>>>> locatelli-main
=======
>>>>>>> locatelli-main
=======
>>>>>>> locatelli-main
=======
>>>>>>> locatelli-main
=======
>>>>>>> locatelli-main
=======
>>>>>>> locatelli-main
=======
>>>>>>> locatelli-main
=======
>>>>>>> locatelli-main
=======
>>>>>>> locatelli-main
=======
>>>>>>> locatelli-main
=======
>>>>>>> locatelli-main
=======
>>>>>>> locatelli-main
=======
>>>>>>> locationtech-main
=======
>>>>>>> 1a04676d44 (GEOMESA-3092 Support Lambda NiFi processor (#2777))
<<<<<<< HEAD
<<<<<<< HEAD
<<<<<<< HEAD
<<<<<<< HEAD
<<<<<<< HEAD
<<<<<<< HEAD
<<<<<<< HEAD
<<<<<<< HEAD
<<<<<<< HEAD
<<<<<<< HEAD
<<<<<<< HEAD
<<<<<<< HEAD
<<<<<<< HEAD
<<<<<<< HEAD
<<<<<<< HEAD
<<<<<<< HEAD
<<<<<<< HEAD
<<<<<<< HEAD
<<<<<<< HEAD
<<<<<<< HEAD
<<<<<<< HEAD
<<<<<<< HEAD
<<<<<<< HEAD
<<<<<<< HEAD
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
>>>>>>> locationtech-main
=======
>>>>>>> 1b3a148b37 (GEOMESA-3092 Support Lambda NiFi processor (#2777))
=======
>>>>>>> 1a04676d44 (GEOMESA-3092 Support Lambda NiFi processor (#2777))
>>>>>>> locatelli-main
=======
>>>>>>> 1b3a148b37 (GEOMESA-3092 Support Lambda NiFi processor (#2777))
=======
>>>>>>> 1a04676d44 (GEOMESA-3092 Support Lambda NiFi processor (#2777))
>>>>>>> locatelli-main
=======
>>>>>>> 1b3a148b37 (GEOMESA-3092 Support Lambda NiFi processor (#2777))
=======
>>>>>>> 1a04676d44 (GEOMESA-3092 Support Lambda NiFi processor (#2777))
>>>>>>> locatelli-main
=======
>>>>>>> 1b3a148b37 (GEOMESA-3092 Support Lambda NiFi processor (#2777))
=======
>>>>>>> 1a04676d44 (GEOMESA-3092 Support Lambda NiFi processor (#2777))
>>>>>>> locatelli-main
=======
>>>>>>> 1b3a148b37 (GEOMESA-3092 Support Lambda NiFi processor (#2777))
=======
>>>>>>> 1a04676d44 (GEOMESA-3092 Support Lambda NiFi processor (#2777))
>>>>>>> locatelli-main
=======
>>>>>>> 1b3a148b37 (GEOMESA-3092 Support Lambda NiFi processor (#2777))
=======
>>>>>>> 1a04676d44 (GEOMESA-3092 Support Lambda NiFi processor (#2777))
>>>>>>> locatelli-main
=======
>>>>>>> 1b3a148b37 (GEOMESA-3092 Support Lambda NiFi processor (#2777))
=======
>>>>>>> 1a04676d44 (GEOMESA-3092 Support Lambda NiFi processor (#2777))
>>>>>>> locatelli-main
=======
>>>>>>> 1b3a148b37 (GEOMESA-3092 Support Lambda NiFi processor (#2777))
=======
>>>>>>> 1a04676d44 (GEOMESA-3092 Support Lambda NiFi processor (#2777))
>>>>>>> locatelli-main
=======
>>>>>>> 1b3a148b37 (GEOMESA-3092 Support Lambda NiFi processor (#2777))
=======
>>>>>>> 1a04676d44 (GEOMESA-3092 Support Lambda NiFi processor (#2777))
>>>>>>> locatelli-main
=======
>>>>>>> 1b3a148b37 (GEOMESA-3092 Support Lambda NiFi processor (#2777))
=======
>>>>>>> 1a04676d44 (GEOMESA-3092 Support Lambda NiFi processor (#2777))
>>>>>>> locatelli-main
=======
>>>>>>> 1b3a148b37 (GEOMESA-3092 Support Lambda NiFi processor (#2777))
=======
>>>>>>> 1a04676d44 (GEOMESA-3092 Support Lambda NiFi processor (#2777))
>>>>>>> locatelli-main
=======
>>>>>>> 1b3a148b37 (GEOMESA-3092 Support Lambda NiFi processor (#2777))
=======
>>>>>>> 1a04676d44 (GEOMESA-3092 Support Lambda NiFi processor (#2777))
>>>>>>> locatelli-main
=======
>>>>>>> 1b3a148b37 (GEOMESA-3092 Support Lambda NiFi processor (#2777))
=======
>>>>>>> 1a04676d44 (GEOMESA-3092 Support Lambda NiFi processor (#2777))
>>>>>>> locatelli-main
=======
>>>>>>> 1b3a148b37 (GEOMESA-3092 Support Lambda NiFi processor (#2777))
=======
>>>>>>> 1a04676d44 (GEOMESA-3092 Support Lambda NiFi processor (#2777))
>>>>>>> locatelli-main
=======
>>>>>>> 1b3a148b37 (GEOMESA-3092 Support Lambda NiFi processor (#2777))
=======
>>>>>>> 1a04676d44 (GEOMESA-3092 Support Lambda NiFi processor (#2777))
>>>>>>> locatelli-main
=======
>>>>>>> 1b3a148b37 (GEOMESA-3092 Support Lambda NiFi processor (#2777))
=======
>>>>>>> 1a04676d44 (GEOMESA-3092 Support Lambda NiFi processor (#2777))
>>>>>>> locatelli-main
=======
>>>>>>> 1b3a148b37 (GEOMESA-3092 Support Lambda NiFi processor (#2777))
=======
>>>>>>> 1a04676d44 (GEOMESA-3092 Support Lambda NiFi processor (#2777))
>>>>>>> locatelli-main
=======
>>>>>>> 1b3a148b37 (GEOMESA-3092 Support Lambda NiFi processor (#2777))
=======
>>>>>>> 1a04676d44 (GEOMESA-3092 Support Lambda NiFi processor (#2777))
>>>>>>> locatelli-main
=======
>>>>>>> 1b3a148b37 (GEOMESA-3092 Support Lambda NiFi processor (#2777))
=======
>>>>>>> 1a04676d44 (GEOMESA-3092 Support Lambda NiFi processor (#2777))
>>>>>>> locatelli-main
=======
>>>>>>> 1b3a148b37 (GEOMESA-3092 Support Lambda NiFi processor (#2777))
=======
>>>>>>> 1a04676d44 (GEOMESA-3092 Support Lambda NiFi processor (#2777))
>>>>>>> locatelli-main
=======
>>>>>>> 1b3a148b37 (GEOMESA-3092 Support Lambda NiFi processor (#2777))
=======
>>>>>>> 1a04676d44 (GEOMESA-3092 Support Lambda NiFi processor (#2777))
>>>>>>> locatelli-main
=======
>>>>>>> 1b3a148b37 (GEOMESA-3092 Support Lambda NiFi processor (#2777))
=======
>>>>>>> 1a04676d44 (GEOMESA-3092 Support Lambda NiFi processor (#2777))
>>>>>>> locatelli-main
=======
>>>>>>> 1b3a148b37 (GEOMESA-3092 Support Lambda NiFi processor (#2777))
=======
>>>>>>> 1a04676d44 (GEOMESA-3092 Support Lambda NiFi processor (#2777))
>>>>>>> locatelli-main
=======
>>>>>>> 1b3a148b37 (GEOMESA-3092 Support Lambda NiFi processor (#2777))
=======
>>>>>>> 1a04676d44 (GEOMESA-3092 Support Lambda NiFi processor (#2777))
>>>>>>> locatelli-main
=======
>>>>>>> 1b3a148b37 (GEOMESA-3092 Support Lambda NiFi processor (#2777))
=======
>>>>>>> 1a04676d44 (GEOMESA-3092 Support Lambda NiFi processor (#2777))
>>>>>>> locatelli-main
=======
>>>>>>> 1b3a148b37 (GEOMESA-3092 Support Lambda NiFi processor (#2777))
=======
>>>>>>> 1a04676d44 (GEOMESA-3092 Support Lambda NiFi processor (#2777))
>>>>>>> locatelli-main
=======
>>>>>>> 1b3a148b37 (GEOMESA-3092 Support Lambda NiFi processor (#2777))
=======
>>>>>>> 1a04676d44 (GEOMESA-3092 Support Lambda NiFi processor (#2777))
>>>>>>> locatelli-main
=======
>>>>>>> 1b3a148b37 (GEOMESA-3092 Support Lambda NiFi processor (#2777))
=======
>>>>>>> 1a04676d44 (GEOMESA-3092 Support Lambda NiFi processor (#2777))
>>>>>>> locatelli-main
=======
>>>>>>> 1b3a148b37 (GEOMESA-3092 Support Lambda NiFi processor (#2777))
=======
>>>>>>> 1a04676d44 (GEOMESA-3092 Support Lambda NiFi processor (#2777))
>>>>>>> locatelli-main
=======
>>>>>>> 1b3a148b37 (GEOMESA-3092 Support Lambda NiFi processor (#2777))
=======
>>>>>>> 1a04676d44 (GEOMESA-3092 Support Lambda NiFi processor (#2777))
>>>>>>> locatelli-main
=======
>>>>>>> 1b3a148b37 (GEOMESA-3092 Support Lambda NiFi processor (#2777))
=======
>>>>>>> 1a04676d44 (GEOMESA-3092 Support Lambda NiFi processor (#2777))
>>>>>>> locatelli-main
=======
>>>>>>> 1b3a148b37 (GEOMESA-3092 Support Lambda NiFi processor (#2777))
=======
>>>>>>> 1a04676d44 (GEOMESA-3092 Support Lambda NiFi processor (#2777))
>>>>>>> locatelli-main
=======
>>>>>>> 1b3a148b37 (GEOMESA-3092 Support Lambda NiFi processor (#2777))
=======
>>>>>>> 1a04676d44 (GEOMESA-3092 Support Lambda NiFi processor (#2777))
>>>>>>> locatelli-main
    )
  fi

  # add hadoop 3+ jars if needed
  if version_ge "${hadoop_version}" 3.0.0; then
    gavs+=(
      "org.apache.hadoop:hadoop-client-api:${hadoop_version}:jar"
      "org.apache.hadoop:hadoop-client-runtime:${hadoop_version}:jar"
    )
  else
    gavs+=(
      "commons-configuration:commons-configuration:1.6:jar"
    )
  fi
  if ! version_ge "${hadoop_version}" 3.4.0; then
    gavs+=(
      "commons-collections:commons-collections:3.2.2:jar"
    )
  fi

  # compare the version of zookeeper to determine if we need zookeeper-jute (version >= 3.5.5)
  JUTE_FROM_VERSION="3.5.5"
  if version_ge "${zk_version}" $JUTE_FROM_VERSION; then
    gavs+=(
      "org.apache.zookeeper:zookeeper-jute:${zk_version}:jar"
    )
  fi

  echo "${gavs[@]}" | tr ' ' '\n' | sort | tr '\n' ' '
}

# gets any dependencies that should be removed from the classpath for this module
# args:
#   $1 - current classpath
function exclude_dependencies() {
  echo "commons-text-1.4.jar"
}
