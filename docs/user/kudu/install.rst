Installing GeoMesa Kudu
=======================

.. note::

    GeoMesa currently supports Kudu version |kudu_version|.

<<<<<<< HEAD
<<<<<<< HEAD
=======
>>>>>>> 7813a31aa (GEOMESA-3176 Docs - fix download links in install instructions)
.. note::

    The examples below expect a version to be set in the environment:

    .. parsed-literal::

        $ export TAG="|release_version|"
        # note: |scala_binary_version| is the Scala build version
        $ export VERSION="|scala_binary_version|-${TAG}"

<<<<<<< HEAD
=======
>>>>>>> 87bf55340 (GEOMESA-3061 Converters - support bytes in Avro top-level union types (#2762))
=======
>>>>>>> 7813a31aa (GEOMESA-3176 Docs - fix download links in install instructions)
Installing the Binary Distribution
----------------------------------

GeoMesa Kudu artifacts are available for download or can be built from source.
The easiest way to get started is to download the most recent binary version from `GitHub`__.

__ https://github.com/locationtech/geomesa/releases

<<<<<<< HEAD
<<<<<<< HEAD
<<<<<<< HEAD
<<<<<<< HEAD
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
>>>>>>> f71fa3c0e (GEOMESA-3061 Converters - support bytes in Avro top-level union types (#2762))
=======
>>>>>>> 0e68e9f4c (GEOMESA-3061 Converters - support bytes in Avro top-level union types (#2762))
=======
>>>>>>> 15e998504 (GEOMESA-3176 Docs - fix download links in install instructions)
=======
=======
>>>>>>> f71fa3c0e (GEOMESA-3061 Converters - support bytes in Avro top-level union types (#2762))
>>>>>>> 07a6a5c29 (GEOMESA-3061 Converters - support bytes in Avro top-level union types (#2762))
=======
=======
>>>>>>> 63db7d154 (GEOMESA-3176 Docs - fix download links in install instructions)
=======
>>>>>>> 28e2bfa2d (GEOMESA-3061 Converters - support bytes in Avro top-level union types (#2762))
=======
>>>>>>> f71fa3c0e (GEOMESA-3061 Converters - support bytes in Avro top-level union types (#2762))
=======
>>>>>>> cdb410251 (GEOMESA-3061 Converters - support bytes in Avro top-level union types (#2762))
<<<<<<< HEAD
>>>>>>> 67b361c85 (GEOMESA-3061 Converters - support bytes in Avro top-level union types (#2762))
=======
=======
>>>>>>> 90ec70f55 (GEOMESA-3176 Docs - fix download links in install instructions)
<<<<<<< HEAD
>>>>>>> 63db7d154 (GEOMESA-3176 Docs - fix download links in install instructions)
=======
=======
=======
>>>>>>> f71fa3c0e (GEOMESA-3061 Converters - support bytes in Avro top-level union types (#2762))
>>>>>>> 6eb31fb65 (GEOMESA-3061 Converters - support bytes in Avro top-level union types (#2762))
>>>>>>> 28e2bfa2d (GEOMESA-3061 Converters - support bytes in Avro top-level union types (#2762))
=======
>>>>>>> b4320946b (GEOMESA-3061 Converters - support bytes in Avro top-level union types (#2762))
Download and extract it somewhere convenient:
=======
=======
>>>>>>> 87bf55340 (GEOMESA-3061 Converters - support bytes in Avro top-level union types (#2762))
.. note::

  In the following examples, replace ``${TAG}`` with the corresponding GeoMesa version (e.g. |release_version|), and
  ``${VERSION}`` with the appropriate Scala plus GeoMesa versions (e.g. |scala_release_version|).

Extract it somewhere convenient:
<<<<<<< HEAD
>>>>>>> b9bdd406e (GEOMESA-3061 Converters - support bytes in Avro top-level union types (#2762))
<<<<<<< HEAD
<<<<<<< HEAD
<<<<<<< HEAD
<<<<<<< HEAD
<<<<<<< HEAD
<<<<<<< HEAD
<<<<<<< HEAD
<<<<<<< HEAD
=======
>>>>>>> 07a6a5c29 (GEOMESA-3061 Converters - support bytes in Avro top-level union types (#2762))
=======
>>>>>>> 67b361c85 (GEOMESA-3061 Converters - support bytes in Avro top-level union types (#2762))
=======
>>>>>>> 63db7d154 (GEOMESA-3176 Docs - fix download links in install instructions)
=======
=======
>>>>>>> 6eb31fb65 (GEOMESA-3061 Converters - support bytes in Avro top-level union types (#2762))
>>>>>>> 28e2bfa2d (GEOMESA-3061 Converters - support bytes in Avro top-level union types (#2762))
=======
Download and extract it somewhere convenient:
>>>>>>> 16b2e83f2 (GEOMESA-3176 Docs - fix download links in install instructions)
=======
>>>>>>> f71fa3c0e (GEOMESA-3061 Converters - support bytes in Avro top-level union types (#2762))
<<<<<<< HEAD
<<<<<<< HEAD
<<<<<<< HEAD
=======
>>>>>>> 0e68e9f4c (GEOMESA-3061 Converters - support bytes in Avro top-level union types (#2762))
=======
=======
Download and extract it somewhere convenient:
>>>>>>> 16b2e83f2 (GEOMESA-3176 Docs - fix download links in install instructions)
>>>>>>> 15e998504 (GEOMESA-3176 Docs - fix download links in install instructions)
=======
>>>>>>> 07a6a5c29 (GEOMESA-3061 Converters - support bytes in Avro top-level union types (#2762))
=======
=======
>>>>>>> 28e2bfa2d (GEOMESA-3061 Converters - support bytes in Avro top-level union types (#2762))
=======
>>>>>>> cdb410251 (GEOMESA-3061 Converters - support bytes in Avro top-level union types (#2762))
<<<<<<< HEAD
>>>>>>> 67b361c85 (GEOMESA-3061 Converters - support bytes in Avro top-level union types (#2762))
=======
=======
=======
Download and extract it somewhere convenient:
>>>>>>> 16b2e83f2 (GEOMESA-3176 Docs - fix download links in install instructions)
>>>>>>> 90ec70f55 (GEOMESA-3176 Docs - fix download links in install instructions)
<<<<<<< HEAD
>>>>>>> 63db7d154 (GEOMESA-3176 Docs - fix download links in install instructions)
=======
=======
>>>>>>> 6eb31fb65 (GEOMESA-3061 Converters - support bytes in Avro top-level union types (#2762))
>>>>>>> 28e2bfa2d (GEOMESA-3061 Converters - support bytes in Avro top-level union types (#2762))
=======
>>>>>>> b4320946b (GEOMESA-3061 Converters - support bytes in Avro top-level union types (#2762))
=======
Download and extract it somewhere convenient:
>>>>>>> 3be8d2a5a (Merge branch 'feature/postgis-fixes')
=======
>>>>>>> 87bf55340 (GEOMESA-3061 Converters - support bytes in Avro top-level union types (#2762))
=======
Download and extract it somewhere convenient:
>>>>>>> 7813a31aa (GEOMESA-3176 Docs - fix download links in install instructions)

.. code-block:: bash

    # download and unpackage the most recent distribution:
    $ wget "https://github.com/locationtech/geomesa/releases/download/geomesa-${TAG}/geomesa-kudu_${VERSION}-bin.tar.gz"
    $ tar xvf geomesa-kudu_${VERSION}-bin.tar.gz
    $ cd geomesa-kudu_${VERSION}
<<<<<<< HEAD
<<<<<<< HEAD
<<<<<<< HEAD
<<<<<<< HEAD
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
>>>>>>> f71fa3c0e (GEOMESA-3061 Converters - support bytes in Avro top-level union types (#2762))
=======
>>>>>>> 0e68e9f4c (GEOMESA-3061 Converters - support bytes in Avro top-level union types (#2762))
=======
>>>>>>> 15e998504 (GEOMESA-3176 Docs - fix download links in install instructions)
=======
=======
>>>>>>> f71fa3c0e (GEOMESA-3061 Converters - support bytes in Avro top-level union types (#2762))
>>>>>>> 07a6a5c29 (GEOMESA-3061 Converters - support bytes in Avro top-level union types (#2762))
=======
=======
>>>>>>> 63db7d154 (GEOMESA-3176 Docs - fix download links in install instructions)
=======
>>>>>>> 28e2bfa2d (GEOMESA-3061 Converters - support bytes in Avro top-level union types (#2762))
=======
>>>>>>> f71fa3c0e (GEOMESA-3061 Converters - support bytes in Avro top-level union types (#2762))
=======
>>>>>>> cdb410251 (GEOMESA-3061 Converters - support bytes in Avro top-level union types (#2762))
>>>>>>> 67b361c85 (GEOMESA-3061 Converters - support bytes in Avro top-level union types (#2762))
=======
>>>>>>> 90ec70f55 (GEOMESA-3176 Docs - fix download links in install instructions)
=======
=======
>>>>>>> f71fa3c0e (GEOMESA-3061 Converters - support bytes in Avro top-level union types (#2762))
>>>>>>> 6eb31fb65 (GEOMESA-3061 Converters - support bytes in Avro top-level union types (#2762))
=======
>>>>>>> b4320946b (GEOMESA-3061 Converters - support bytes in Avro top-level union types (#2762))
=======
    $ ls
    bin/  conf/  dist/  docs/  examples/  lib/  LICENSE.txt  logs/
>>>>>>> b9bdd406e (GEOMESA-3061 Converters - support bytes in Avro top-level union types (#2762))
<<<<<<< HEAD
<<<<<<< HEAD
<<<<<<< HEAD
<<<<<<< HEAD
<<<<<<< HEAD
<<<<<<< HEAD
<<<<<<< HEAD
<<<<<<< HEAD
=======
>>>>>>> 07a6a5c29 (GEOMESA-3061 Converters - support bytes in Avro top-level union types (#2762))
=======
>>>>>>> 67b361c85 (GEOMESA-3061 Converters - support bytes in Avro top-level union types (#2762))
=======
>>>>>>> 63db7d154 (GEOMESA-3176 Docs - fix download links in install instructions)
=======
=======
>>>>>>> 6eb31fb65 (GEOMESA-3061 Converters - support bytes in Avro top-level union types (#2762))
>>>>>>> 28e2bfa2d (GEOMESA-3061 Converters - support bytes in Avro top-level union types (#2762))
=======
>>>>>>> 16b2e83f2 (GEOMESA-3176 Docs - fix download links in install instructions)
=======
>>>>>>> f71fa3c0e (GEOMESA-3061 Converters - support bytes in Avro top-level union types (#2762))
<<<<<<< HEAD
<<<<<<< HEAD
<<<<<<< HEAD
=======
>>>>>>> 0e68e9f4c (GEOMESA-3061 Converters - support bytes in Avro top-level union types (#2762))
=======
=======
>>>>>>> 16b2e83f2 (GEOMESA-3176 Docs - fix download links in install instructions)
>>>>>>> 15e998504 (GEOMESA-3176 Docs - fix download links in install instructions)
=======
>>>>>>> 07a6a5c29 (GEOMESA-3061 Converters - support bytes in Avro top-level union types (#2762))
=======
=======
>>>>>>> 28e2bfa2d (GEOMESA-3061 Converters - support bytes in Avro top-level union types (#2762))
=======
>>>>>>> cdb410251 (GEOMESA-3061 Converters - support bytes in Avro top-level union types (#2762))
<<<<<<< HEAD
>>>>>>> 67b361c85 (GEOMESA-3061 Converters - support bytes in Avro top-level union types (#2762))
=======
=======
=======
>>>>>>> 16b2e83f2 (GEOMESA-3176 Docs - fix download links in install instructions)
>>>>>>> 90ec70f55 (GEOMESA-3176 Docs - fix download links in install instructions)
<<<<<<< HEAD
>>>>>>> 63db7d154 (GEOMESA-3176 Docs - fix download links in install instructions)
=======
=======
>>>>>>> 6eb31fb65 (GEOMESA-3061 Converters - support bytes in Avro top-level union types (#2762))
>>>>>>> 28e2bfa2d (GEOMESA-3061 Converters - support bytes in Avro top-level union types (#2762))
=======
>>>>>>> b4320946b (GEOMESA-3061 Converters - support bytes in Avro top-level union types (#2762))
=======
>>>>>>> 3be8d2a5a (Merge branch 'feature/postgis-fixes')
=======
    $ ls
    bin/  conf/  dist/  docs/  examples/  lib/  LICENSE.txt  logs/
>>>>>>> 87bf55340 (GEOMESA-3061 Converters - support bytes in Avro top-level union types (#2762))
=======
>>>>>>> 7813a31aa (GEOMESA-3176 Docs - fix download links in install instructions)

.. _kudu_install_source:

Building from Source
--------------------

GeoMesa Kudu may also be built from source. For more information refer to :ref:`building_from_source`
in the developer manual, or to the ``README.md`` file in the the source distribution.
The remainder of the instructions in this chapter assume the use of the binary GeoMesa Kudu
distribution. If you have built from source, the distribution is created in the ``target`` directory of
``geomesa-kudu/geomesa-kudu-dist``.

More information about developing with GeoMesa may be found in the :doc:`/developer/index`.

.. _setting_up_kudu_commandline:

Setting up the Kudu Command Line Tools
--------------------------------------

GeoMesa comes with a set of command line tools for managing Kudu features located in
``geomesa-kudu_${VERSION}/bin/`` of the binary distribution.

Configuring the Classpath
^^^^^^^^^^^^^^^^^^^^^^^^^

GeoMesa needs Hadoop JARs on the classpath. These are not bundled by default, as they should match
the versions installed on the target system.

If the environment variable ``HADOOP_HOME`` is set, then GeoMesa will load the appropriate
JARs and configuration files from those locations and no further configuration is required. Otherwise, you will
be prompted to download the appropriate JARs the first time you invoke the tools. Environment variables can be
specified in ``conf/*-env.sh`` and dependency versions can be specified in ``conf/dependencies.sh``.

In order to run map/reduce jobs, the Hadoop ``*-site.xml`` configuration files from your Hadoop installation
must be on the classpath. If ``HADOOP_HOME`` is not set, then copy them into ``geomesa-kudu_${VERSION}/conf``.

GeoMesa also provides the ability to add additional JARs to the classpath using the environmental variable
``$GEOMESA_EXTRA_CLASSPATHS``. GeoMesa will prepend the contents of this environmental variable  to the computed
classpath, giving it highest precedence in the classpath. Users can provide directories of jar files or individual
files using a colon (``:``) as a delimiter. These entries will also be added the the map-reduce libjars variable.

Use the ``geomesa-kudu classpath`` command in order to see what JARs are being used.

Due to licensing restrictions, dependencies for shape file support must be separately installed.
Do this with the following command:

.. code-block:: bash

    $ ./bin/install-shapefile-support.sh

.. note::

    See :ref:`slf4j_configuration` for information about configuring the SLF4J implementation.

Test the command that invokes the GeoMesa Tools:

<<<<<<< HEAD
<<<<<<< HEAD
.. code-block:: bash

    $ bin/geomesa-kudu

The output should look like this::

=======
.. code::

    $ bin/geomesa-kudu
>>>>>>> 87bf55340 (GEOMESA-3061 Converters - support bytes in Avro top-level union types (#2762))
=======
.. code-block:: bash

    $ bin/geomesa-kudu

The output should look like this::

>>>>>>> 7813a31aa (GEOMESA-3176 Docs - fix download links in install instructions)
    INFO  Usage: geomesa-kudu [command] [command options]
      Commands:
      ...

For more details, see :ref:`kudu_tools`.

.. _install_kudu_geoserver:

Installing GeoMesa Kudu in GeoServer
------------------------------------

.. warning::

    See :ref:`geoserver_versions` to ensure that GeoServer is compatible with your GeoMesa version.

The Kudu GeoServer plugin is bundled by default in a GeoMesa binary distribution. To install, extract
``$GEOMESA_KUDU_HOME/dist/gs-plugins/geomesa-kudu-gs-plugin_${VERSION}-install.tar.gz`` into GeoServer's
``WEB-INF/lib`` directory.

Restart GeoServer after the JARs are installed.
