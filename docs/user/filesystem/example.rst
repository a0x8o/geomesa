FileSystem Data Store Example
=============================

In this simple example we will ingest a small CSV into a local filesystem data store partitioned by an daily,z2-2bit
scheme. To begin, start by untaring the geomesa-fs distribution. Inside this distribution you will find an examples
folder which contains an example csv file that we will ingest. First set the version you want to use:
<<<<<<< HEAD
<<<<<<< HEAD
<<<<<<< HEAD
<<<<<<< HEAD
<<<<<<< HEAD
<<<<<<< HEAD
<<<<<<< HEAD
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
=======
<<<<<<< HEAD
<<<<<<< HEAD
<<<<<<< HEAD
>>>>>>> locatelli-main
=======
=======
>>>>>>> locatelli-main
=======
>>>>>>> locatelli-main
>>>>>>> 3be8d2a5a (Merge branch 'feature/postgis-fixes')
=======
>>>>>>> 7813a31aa (GEOMESA-3176 Docs - fix download links in install instructions)
=======
=======
>>>>>>> 3be8d2a5a (Merge branch 'feature/postgis-fixes')
>>>>>>> e8cc4971c6 (Merge branch 'feature/postgis-fixes')
=======
=======
>>>>>>> cb6bda89b6 (Merge branch 'feature/postgis-fixes')
=======
>>>>>>> 09d87762c5 (GEOMESA-3254 Add Bloop build support)
=======
>>>>>>> 703374130f (GEOMESA-3176 Docs - fix download links in install instructions)
=======
>>>>>>> 699117eca9 (Merge branch 'feature/postgis-fixes')
=======
>>>>>>> 3be8d2a5a (Merge branch 'feature/postgis-fixes')
=======
>>>>>>> 2aa923cc9 (GEOMESA-3176 Docs - fix download links in install instructions)
<<<<<<< HEAD
<<<<<<< HEAD
<<<<<<< HEAD
<<<<<<< HEAD
>>>>>>> bdcaf0ab5e (GEOMESA-3176 Docs - fix download links in install instructions)
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
>>>>>>> 09d87762c5 (GEOMESA-3254 Add Bloop build support)
=======
=======
>>>>>>> 3be8d2a5a (Merge branch 'feature/postgis-fixes')
>>>>>>> locationtech-main
=======
=======
=======
>>>>>>> locatelli-main
=======
>>>>>>> locatelli-main
>>>>>>> f561a0faec (GEOMESA-3176 Docs - fix download links in install instructions)
<<<<<<< HEAD
<<<<<<< HEAD
<<<<<<< HEAD
<<<<<<< HEAD
<<<<<<< HEAD
<<<<<<< HEAD
<<<<<<< HEAD
<<<<<<< HEAD
<<<<<<< HEAD
<<<<<<< HEAD
<<<<<<< HEAD
<<<<<<< HEAD
<<<<<<< HEAD
<<<<<<< HEAD
<<<<<<< HEAD
<<<<<<< HEAD
<<<<<<< HEAD
<<<<<<< HEAD
<<<<<<< HEAD
<<<<<<< HEAD
<<<<<<< HEAD
<<<<<<< HEAD
<<<<<<< HEAD
<<<<<<< HEAD
<<<<<<< HEAD
<<<<<<< HEAD
<<<<<<< HEAD
<<<<<<< HEAD
<<<<<<< HEAD
<<<<<<< HEAD
<<<<<<< HEAD
<<<<<<< HEAD
<<<<<<< HEAD
<<<<<<< HEAD
<<<<<<< HEAD
<<<<<<< HEAD
<<<<<<< HEAD
<<<<<<< HEAD
<<<<<<< HEAD
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
=======
>>>>>>> 264c9fa240 (Merge branch 'feature/postgis-fixes')
=======
>>>>>>> c738f63bd9 (GEOMESA-3254 Add Bloop build support)
=======
>>>>>>> 3f60902092 (GEOMESA-3176 Docs - fix download links in install instructions)
=======
>>>>>>> 217b7d1cb9 (Merge branch 'feature/postgis-fixes')
=======
>>>>>>> 682ce8edbb (GEOMESA-3176 Docs - fix download links in install instructions)
=======
>>>>>>> b6e56a9e80 (Merge branch 'feature/postgis-fixes')
=======
>>>>>>> 7f7083f095 (GEOMESA-3176 Docs - fix download links in install instructions)
=======
>>>>>>> 0a5b74c946 (Merge branch 'feature/postgis-fixes')
=======
>>>>>>> 13656f5052 (GEOMESA-3254 Add Bloop build support)
=======
>>>>>>> c04d2a7e80 (GEOMESA-3176 Docs - fix download links in install instructions)
=======
>>>>>>> a30a0c1a2a (Merge branch 'feature/postgis-fixes')
=======
>>>>>>> fbb5e06c6a (GEOMESA-3176 Docs - fix download links in install instructions)
=======
>>>>>>> cc93e0930d (Merge branch 'feature/postgis-fixes')
<<<<<<< HEAD
<<<<<<< HEAD
>>>>>>> locatelli-main
=======
>>>>>>> locatelli-main
=======
>>>>>>> locatelli-main
=======
>>>>>>> 419e2b9752 (GEOMESA-3176 Docs - fix download links in install instructions)
=======
>>>>>>> 42e8565e9b (Merge branch 'feature/postgis-fixes')
=======
<<<<<<< HEAD
<<<<<<< HEAD
<<<<<<< HEAD
=======
<<<<<<< HEAD
<<<<<<< HEAD
>>>>>>> locatelli-main
=======
<<<<<<< HEAD
>>>>>>> locatelli-main
=======
>>>>>>> locatelli-main
>>>>>>> f1532f2313 (GEOMESA-3254 Add Bloop build support)
=======
>>>>>>> 86bc039842 (GEOMESA-3176 Docs - fix download links in install instructions)
=======
<<<<<<< HEAD
<<<<<<< HEAD
<<<<<<< HEAD
=======
<<<<<<< HEAD
<<<<<<< HEAD
>>>>>>> locatelli-main
=======
<<<<<<< HEAD
>>>>>>> locatelli-main
=======
>>>>>>> locatelli-main
>>>>>>> 67de3c3202 (Merge branch 'feature/postgis-fixes')
=======
>>>>>>> e007dde981 (GEOMESA-3176 Docs - fix download links in install instructions)
=======
<<<<<<< HEAD
<<<<<<< HEAD
<<<<<<< HEAD
=======
<<<<<<< HEAD
<<<<<<< HEAD
>>>>>>> locatelli-main
=======
<<<<<<< HEAD
>>>>>>> locatelli-main
=======
>>>>>>> locatelli-main
>>>>>>> 638b68d081 (Merge branch 'feature/postgis-fixes')
=======
>>>>>>> 7b2b25cc3c (GEOMESA-3176 Docs - fix download links in install instructions)
=======
<<<<<<< HEAD
<<<<<<< HEAD
<<<<<<< HEAD
=======
<<<<<<< HEAD
<<<<<<< HEAD
>>>>>>> locatelli-main
=======
<<<<<<< HEAD
>>>>>>> locatelli-main
=======
>>>>>>> locatelli-main
>>>>>>> 71adb695c5 (Merge branch 'feature/postgis-fixes')
=======
>>>>>>> 5a4c24e020 (GEOMESA-3254 Add Bloop build support)
=======
<<<<<<< HEAD
<<<<<<< HEAD
<<<<<<< HEAD
=======
<<<<<<< HEAD
<<<<<<< HEAD
>>>>>>> locatelli-main
=======
<<<<<<< HEAD
>>>>>>> locatelli-main
=======
>>>>>>> locatelli-main
>>>>>>> 8dec77199d (GEOMESA-3176 Docs - fix download links in install instructions)
=======
>>>>>>> 30559ea5c9 (Merge branch 'feature/postgis-fixes')
=======
<<<<<<< HEAD
<<<<<<< HEAD
>>>>>>> 1f19a648d1 (GEOMESA-3176 Docs - fix download links in install instructions)
=======
>>>>>>> ec6d06b576 (Merge branch 'feature/postgis-fixes')
<<<<<<< HEAD
>>>>>>> locationtech-main
=======
=======
<<<<<<< HEAD
=======
>>>>>>> locatelli-main
<<<<<<< HEAD
>>>>>>> 1f19a648d1 (GEOMESA-3176 Docs - fix download links in install instructions)
=======
>>>>>>> ec6d06b576 (Merge branch 'feature/postgis-fixes')
=======
>>>>>>> locatelli-main
=======
<<<<<<< HEAD
>>>>>>> f1fe65810a (GEOMESA-3176 Docs - fix download links in install instructions)
=======
>>>>>>> 6e0709aba8 (Merge branch 'feature/postgis-fixes')
=======
>>>>>>> 7a84c9d22d (GEOMESA-3254 Add Bloop build support)
=======
>>>>>>> 165fb93a09 (GEOMESA-3176 Docs - fix download links in install instructions)
=======
>>>>>>> ed25decdd5 (Merge branch 'feature/postgis-fixes')
=======
>>>>>>> 80c85285b7 (GEOMESA-3176 Docs - fix download links in install instructions)
=======
>>>>>>> f893d9a594 (Merge branch 'feature/postgis-fixes')
=======
>>>>>>> 77f446aa59 (GEOMESA-3176 Docs - fix download links in install instructions)
=======
>>>>>>> 964e86145a (Merge branch 'feature/postgis-fixes')
=======
>>>>>>> b298e017f1 (GEOMESA-3254 Add Bloop build support)
=======
>>>>>>> 088d9e36a5 (GEOMESA-3176 Docs - fix download links in install instructions)
=======
>>>>>>> bf6bde0830 (Merge branch 'feature/postgis-fixes')
=======
>>>>>>> 731987cbc8 (GEOMESA-3176 Docs - fix download links in install instructions)
=======
>>>>>>> 354b5e5ae5 (Merge branch 'feature/postgis-fixes')
=======
>>>>>>> 4fd46f4f99 (GEOMESA-3176 Docs - fix download links in install instructions)
=======
>>>>>>> d581fa3e8f (Merge branch 'feature/postgis-fixes')
=======
=======
>>>>>>> 419e2b9752 (GEOMESA-3176 Docs - fix download links in install instructions)
>>>>>>> b68ae6197f (GEOMESA-3176 Docs - fix download links in install instructions)
=======
=======
>>>>>>> 264c9fa240 (Merge branch 'feature/postgis-fixes')
=======
>>>>>>> f1532f2313 (GEOMESA-3254 Add Bloop build support)
=======
>>>>>>> c738f63bd9 (GEOMESA-3254 Add Bloop build support)
=======
>>>>>>> 3f60902092 (GEOMESA-3176 Docs - fix download links in install instructions)
=======
>>>>>>> 67de3c3202 (Merge branch 'feature/postgis-fixes')
=======
>>>>>>> 217b7d1cb9 (Merge branch 'feature/postgis-fixes')
=======
>>>>>>> 682ce8edbb (GEOMESA-3176 Docs - fix download links in install instructions)
=======
>>>>>>> 638b68d081 (Merge branch 'feature/postgis-fixes')
=======
>>>>>>> b6e56a9e80 (Merge branch 'feature/postgis-fixes')
=======
>>>>>>> 7f7083f095 (GEOMESA-3176 Docs - fix download links in install instructions)
=======
>>>>>>> 71adb695c5 (Merge branch 'feature/postgis-fixes')
=======
>>>>>>> 0a5b74c946 (Merge branch 'feature/postgis-fixes')
=======
>>>>>>> 13656f5052 (GEOMESA-3254 Add Bloop build support)
=======
>>>>>>> 8dec77199d (GEOMESA-3176 Docs - fix download links in install instructions)
=======
>>>>>>> c04d2a7e80 (GEOMESA-3176 Docs - fix download links in install instructions)
=======
>>>>>>> a30a0c1a2a (Merge branch 'feature/postgis-fixes')
=======
>>>>>>> 1f19a648d1 (GEOMESA-3176 Docs - fix download links in install instructions)
=======
>>>>>>> fbb5e06c6a (GEOMESA-3176 Docs - fix download links in install instructions)
=======
>>>>>>> cc93e0930d (Merge branch 'feature/postgis-fixes')
<<<<<<< HEAD
<<<<<<< HEAD
>>>>>>> locatelli-main
=======
>>>>>>> locatelli-main
=======
>>>>>>> locatelli-main
>>>>>>> 3be8d2a5a4 (Merge branch 'feature/postgis-fixes')
=======
>>>>>>> 2aa923cc97 (GEOMESA-3176 Docs - fix download links in install instructions)
<<<<<<< HEAD
<<<<<<< HEAD
<<<<<<< HEAD
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
>>>>>>> 42e8565e9b (Merge branch 'feature/postgis-fixes')
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
>>>>>>> 42e8565e9b (Merge branch 'feature/postgis-fixes')
<<<<<<< HEAD
>>>>>>> locatelli-main
=======
>>>>>>> locatelli-main
=======
>>>>>>> 6e0709aba8 (Merge branch 'feature/postgis-fixes')
=======
>>>>>>> b68ae6197f (GEOMESA-3176 Docs - fix download links in install instructions)
=======
=======
>>>>>>> 42e8565e9b (Merge branch 'feature/postgis-fixes')
>>>>>>> 264c9fa240 (Merge branch 'feature/postgis-fixes')
<<<<<<< HEAD
<<<<<<< HEAD
>>>>>>> locatelli-main
=======
>>>>>>> locatelli-main
=======
>>>>>>> locatelli-main
=======
=======
>>>>>>> 3be8d2a5a (Merge branch 'feature/postgis-fixes')
>>>>>>> db8d998aa2 (Merge branch 'feature/postgis-fixes')
<<<<<<< HEAD
<<<<<<< HEAD
<<<<<<< HEAD
<<<<<<< HEAD
=======
<<<<<<< HEAD
<<<<<<< HEAD
>>>>>>> locationtech-main
=======
<<<<<<< HEAD
=======
>>>>>>> locatelli-main
<<<<<<< HEAD
=======
>>>>>>> locatelli-main
<<<<<<< HEAD
<<<<<<< HEAD
<<<<<<< HEAD
=======
>>>>>>> 264c9fa240 (Merge branch 'feature/postgis-fixes')
=======
>>>>>>> c738f63bd9 (GEOMESA-3254 Add Bloop build support)
<<<<<<< HEAD
<<<<<<< HEAD
>>>>>>> locatelli-main
=======
>>>>>>> locatelli-main
=======
>>>>>>> locatelli-main
=======
>>>>>>> d845d7c1bd (GEOMESA-3254 Add Bloop build support)
=======
>>>>>>> 308738bcef (GEOMESA-3176 Docs - fix download links in install instructions)
<<<<<<< HEAD
<<<<<<< HEAD
<<<<<<< HEAD
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
>>>>>>> ec6d06b576 (Merge branch 'feature/postgis-fixes')
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
>>>>>>> ec6d06b576 (Merge branch 'feature/postgis-fixes')
<<<<<<< HEAD
>>>>>>> locatelli-main
=======
>>>>>>> locatelli-main
=======
>>>>>>> 354b5e5ae5 (Merge branch 'feature/postgis-fixes')
=======
>>>>>>> fbb5e06c6a (GEOMESA-3176 Docs - fix download links in install instructions)
=======
=======
>>>>>>> ec6d06b576 (Merge branch 'feature/postgis-fixes')
>>>>>>> cc93e0930d (Merge branch 'feature/postgis-fixes')
<<<<<<< HEAD
<<<<<<< HEAD
>>>>>>> locatelli-main
=======
>>>>>>> locatelli-main
=======
>>>>>>> locatelli-main
=======
=======
>>>>>>> 3be8d2a5a (Merge branch 'feature/postgis-fixes')
>>>>>>> da00c7bd68 (Merge branch 'feature/postgis-fixes')
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
>>>>>>> cc93e0930d (Merge branch 'feature/postgis-fixes')
<<<<<<< HEAD
>>>>>>> locatelli-main
=======
>>>>>>> locatelli-main
=======
<<<<<<< HEAD
=======
>>>>>>> cc93e0930d (Merge branch 'feature/postgis-fixes')
>>>>>>> locatelli-main
=======
>>>>>>> 983d0b0983 (GEOMESA-3176 Docs - fix download links in install instructions)
=======
=======
>>>>>>> 3be8d2a5a4 (Merge branch 'feature/postgis-fixes')
>>>>>>> 34472778d3 (Merge branch 'feature/postgis-fixes')
<<<<<<< HEAD
<<<<<<< HEAD
=======
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
>>>>>>> 419e2b9752 (GEOMESA-3176 Docs - fix download links in install instructions)
=======
>>>>>>> 42e8565e9b (Merge branch 'feature/postgis-fixes')
<<<<<<< HEAD
<<<<<<< HEAD
=======
<<<<<<< HEAD
<<<<<<< HEAD
<<<<<<< HEAD
=======
>>>>>>> c738f63bd9 (GEOMESA-3254 Add Bloop build support)
>>>>>>> locatelli-main
=======
<<<<<<< HEAD
=======
>>>>>>> c738f63bd9 (GEOMESA-3254 Add Bloop build support)
>>>>>>> locatelli-main
=======
>>>>>>> c738f63bd9 (GEOMESA-3254 Add Bloop build support)
>>>>>>> locatelli-main
=======
=======
>>>>>>> d845d7c1bd (GEOMESA-3254 Add Bloop build support)
>>>>>>> f1532f2313 (GEOMESA-3254 Add Bloop build support)
<<<<<<< HEAD
<<<<<<< HEAD
=======
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
>>>>>>> 1f19a648d1 (GEOMESA-3176 Docs - fix download links in install instructions)
=======
>>>>>>> ec6d06b576 (Merge branch 'feature/postgis-fixes')
<<<<<<< HEAD
<<<<<<< HEAD
<<<<<<< HEAD
>>>>>>> locationtech-main
=======
>>>>>>> baeb44a4a8 (GEOMESA-3176 Docs - fix download links in install instructions)
=======
<<<<<<< HEAD
=======
>>>>>>> locatelli-main
<<<<<<< HEAD
=======
>>>>>>> locatelli-main
=======
>>>>>>> d13d2eab26 (GEOMESA-3176 Docs - fix download links in install instructions)
=======
=======
>>>>>>> 3be8d2a5a4 (Merge branch 'feature/postgis-fixes')
>>>>>>> 4c41429da9 (Merge branch 'feature/postgis-fixes')
=======
>>>>>>> f1fe65810a (GEOMESA-3176 Docs - fix download links in install instructions)
=======
>>>>>>> 6e0709aba8 (Merge branch 'feature/postgis-fixes')
=======
=======
>>>>>>> d845d7c1bd (GEOMESA-3254 Add Bloop build support)
>>>>>>> 7a84c9d22d (GEOMESA-3254 Add Bloop build support)
=======
>>>>>>> 731987cbc8 (GEOMESA-3176 Docs - fix download links in install instructions)
=======
>>>>>>> 354b5e5ae5 (Merge branch 'feature/postgis-fixes')
=======
=======
>>>>>>> 983d0b0983 (GEOMESA-3176 Docs - fix download links in install instructions)
>>>>>>> 4fd46f4f99 (GEOMESA-3176 Docs - fix download links in install instructions)
=======
>>>>>>> d581fa3e8f (Merge branch 'feature/postgis-fixes')
=======
=======
>>>>>>> 419e2b9752 (GEOMESA-3176 Docs - fix download links in install instructions)
>>>>>>> b68ae6197f (GEOMESA-3176 Docs - fix download links in install instructions)
=======
>>>>>>> 264c9fa240 (Merge branch 'feature/postgis-fixes')
=======
>>>>>>> c738f63bd9 (GEOMESA-3254 Add Bloop build support)
=======
=======
>>>>>>> 1f19a648d1 (GEOMESA-3176 Docs - fix download links in install instructions)
>>>>>>> fbb5e06c6a (GEOMESA-3176 Docs - fix download links in install instructions)
=======
>>>>>>> cc93e0930d (Merge branch 'feature/postgis-fixes')
=======
>>>>>>> locationtech-main
=======
>>>>>>> baeb44a4a8 (GEOMESA-3176 Docs - fix download links in install instructions)
<<<<<<< HEAD
>>>>>>> f561a0faec (GEOMESA-3176 Docs - fix download links in install instructions)
=======
=======
=======
>>>>>>> 3be8d2a5a (Merge branch 'feature/postgis-fixes')
>>>>>>> 64eaf6b132 (Merge branch 'feature/postgis-fixes')
>>>>>>> 79bf541ac8 (Merge branch 'feature/postgis-fixes')
=======
>>>>>>> baeb44a4a8 (GEOMESA-3176 Docs - fix download links in install instructions)
<<<<<<< HEAD
<<<<<<< HEAD
>>>>>>> locatelli-main
=======
>>>>>>> locatelli-main
=======
>>>>>>> locatelli-main
=======
=======
>>>>>>> 3be8d2a5a (Merge branch 'feature/postgis-fixes')
>>>>>>> 64eaf6b132 (Merge branch 'feature/postgis-fixes')
<<<<<<< HEAD
<<<<<<< HEAD
<<<<<<< HEAD
=======
=======
>>>>>>> 3be8d2a5a (Merge branch 'feature/postgis-fixes')
>>>>>>> locationtech-main
=======
>>>>>>> locatelli-main
=======
>>>>>>> locatelli-main
=======
>>>>>>> locatelli-main

.. parsed-literal::

    $ export TAG="|release_version|"
<<<<<<< HEAD
<<<<<<< HEAD
<<<<<<< HEAD
<<<<<<< HEAD
<<<<<<< HEAD
<<<<<<< HEAD
<<<<<<< HEAD
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
=======
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
<<<<<<< HEAD
<<<<<<< HEAD
<<<<<<< HEAD
<<<<<<< HEAD
<<<<<<< HEAD
=======
>>>>>>> 0ba49a2fd7 (GEOMESA-3176 Docs - fix download links in install instructions)
=======
>>>>>>> 91879d2d87 (GEOMESA-3176 Docs - fix download links in install instructions)
=======
>>>>>>> c738f63bd9 (GEOMESA-3254 Add Bloop build support)
=======
>>>>>>> 64a722e2a7 (GEOMESA-3176 Docs - fix download links in install instructions)
=======
>>>>>>> 341ef96c9a (GEOMESA-3176 Docs - fix download links in install instructions)
<<<<<<< HEAD
<<<<<<< HEAD
>>>>>>> locatelli-main
=======
>>>>>>> locatelli-main
=======
>>>>>>> locatelli-main
=======
>>>>>>> 17c1f8a18c (GEOMESA-3176 Docs - fix download links in install instructions)
=======
>>>>>>> f1532f2313 (GEOMESA-3254 Add Bloop build support)
=======
<<<<<<< HEAD
<<<<<<< HEAD
<<<<<<< HEAD
=======
<<<<<<< HEAD
<<<<<<< HEAD
>>>>>>> locatelli-main
=======
<<<<<<< HEAD
>>>>>>> locatelli-main
=======
>>>>>>> locatelli-main
>>>>>>> 4492950388 (GEOMESA-3176 Docs - fix download links in install instructions)
=======
>>>>>>> aff2787fc2 (GEOMESA-3176 Docs - fix download links in install instructions)
=======
<<<<<<< HEAD
<<<<<<< HEAD
<<<<<<< HEAD
=======
<<<<<<< HEAD
=======
>>>>>>> locatelli-main
=======
>>>>>>> locatelli-main
>>>>>>> 1ce7179e65 (GEOMESA-3176 Docs - fix download links in install instructions)
=======
>>>>>>> 7a84c9d22d (GEOMESA-3254 Add Bloop build support)
=======
>>>>>>> 13325d17c4 (GEOMESA-3176 Docs - fix download links in install instructions)
=======
>>>>>>> e5cf96e863 (GEOMESA-3176 Docs - fix download links in install instructions)
=======
>>>>>>> 2de4be5460 (GEOMESA-3176 Docs - fix download links in install instructions)
=======
>>>>>>> 6f1e1da646 (GEOMESA-3176 Docs - fix download links in install instructions)
=======
>>>>>>> b47097b7bb (GEOMESA-3176 Docs - fix download links in install instructions)
=======
=======
>>>>>>> 17c1f8a18c (GEOMESA-3176 Docs - fix download links in install instructions)
>>>>>>> 95f020af8c (GEOMESA-3176 Docs - fix download links in install instructions)
=======
=======
>>>>>>> c738f63bd9 (GEOMESA-3254 Add Bloop build support)
=======
>>>>>>> 4492950388 (GEOMESA-3176 Docs - fix download links in install instructions)
=======
>>>>>>> 64a722e2a7 (GEOMESA-3176 Docs - fix download links in install instructions)
=======
>>>>>>> 341ef96c9a (GEOMESA-3176 Docs - fix download links in install instructions)
<<<<<<< HEAD
<<<<<<< HEAD
>>>>>>> locatelli-main
=======
>>>>>>> locatelli-main
=======
>>>>>>> locatelli-main
>>>>>>> 8cbe155de6 (GEOMESA-3176 Docs - fix download links in install instructions)
=======
>>>>>>> 0fbf9e83e2 (GEOMESA-3176 Docs - fix download links in install instructions)
<<<<<<< HEAD
<<<<<<< HEAD
<<<<<<< HEAD
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
<<<<<<< HEAD
=======
>>>>>>> 95f020af8c (GEOMESA-3176 Docs - fix download links in install instructions)
=======
>>>>>>> c738f63bd9 (GEOMESA-3254 Add Bloop build support)
<<<<<<< HEAD
<<<<<<< HEAD
>>>>>>> locatelli-main
=======
>>>>>>> locatelli-main
=======
>>>>>>> locatelli-main
=======
>>>>>>> d845d7c1bd (GEOMESA-3254 Add Bloop build support)
=======
>>>>>>> 8b8075f529 (GEOMESA-3176 Docs - fix download links in install instructions)
<<<<<<< HEAD
<<<<<<< HEAD
<<<<<<< HEAD
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
<<<<<<< HEAD
=======
>>>>>>> 64a722e2a7 (GEOMESA-3176 Docs - fix download links in install instructions)
=======
>>>>>>> 341ef96c9a (GEOMESA-3176 Docs - fix download links in install instructions)
<<<<<<< HEAD
<<<<<<< HEAD
>>>>>>> locatelli-main
=======
>>>>>>> locatelli-main
=======
>>>>>>> locatelli-main
=======
>>>>>>> 64e2e43818 (GEOMESA-3176 Docs - fix download links in install instructions)
=======
>>>>>>> 610d4a0e13 (GEOMESA-3176 Docs - fix download links in install instructions)
<<<<<<< HEAD
<<<<<<< HEAD
=======
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
>>>>>>> d25af58f86 (GEOMESA-3176 Docs - fix download links in install instructions)
=======
=======
>>>>>>> 8cbe155de6 (GEOMESA-3176 Docs - fix download links in install instructions)
>>>>>>> 3b4f3da2e1 (GEOMESA-3176 Docs - fix download links in install instructions)
<<<<<<< HEAD
<<<<<<< HEAD
=======
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
>>>>>>> 17c1f8a18c (GEOMESA-3176 Docs - fix download links in install instructions)
=======
>>>>>>> 4492950388 (GEOMESA-3176 Docs - fix download links in install instructions)
<<<<<<< HEAD
<<<<<<< HEAD
=======
<<<<<<< HEAD
<<<<<<< HEAD
<<<<<<< HEAD
=======
>>>>>>> 341ef96c9a (GEOMESA-3176 Docs - fix download links in install instructions)
>>>>>>> locatelli-main
=======
<<<<<<< HEAD
=======
>>>>>>> 341ef96c9a (GEOMESA-3176 Docs - fix download links in install instructions)
>>>>>>> locatelli-main
=======
>>>>>>> 341ef96c9a (GEOMESA-3176 Docs - fix download links in install instructions)
>>>>>>> locatelli-main
=======
=======
>>>>>>> 64e2e43818 (GEOMESA-3176 Docs - fix download links in install instructions)
>>>>>>> aff2787fc2 (GEOMESA-3176 Docs - fix download links in install instructions)
<<<<<<< HEAD
<<<<<<< HEAD
=======
<<<<<<< HEAD
>>>>>>> b4c1ea8881 (GEOMESA-3176 Docs - fix download links in install instructions)
=======
>>>>>>> locationtech-main
=======
<<<<<<< HEAD
=======
>>>>>>> locatelli-main
<<<<<<< HEAD
=======
=======
>>>>>>> locatelli-main
>>>>>>> 13325d17c4 (GEOMESA-3176 Docs - fix download links in install instructions)
=======
=======
>>>>>>> 64e2e43818 (GEOMESA-3176 Docs - fix download links in install instructions)
>>>>>>> e5cf96e863 (GEOMESA-3176 Docs - fix download links in install instructions)
=======
>>>>>>> 2de4be5460 (GEOMESA-3176 Docs - fix download links in install instructions)
=======
=======
>>>>>>> d25af58f86 (GEOMESA-3176 Docs - fix download links in install instructions)
>>>>>>> 6f1e1da646 (GEOMESA-3176 Docs - fix download links in install instructions)
=======
>>>>>>> b47097b7bb (GEOMESA-3176 Docs - fix download links in install instructions)
=======
=======
>>>>>>> 17c1f8a18c (GEOMESA-3176 Docs - fix download links in install instructions)
>>>>>>> 95f020af8c (GEOMESA-3176 Docs - fix download links in install instructions)
=======
>>>>>>> 64a722e2a7 (GEOMESA-3176 Docs - fix download links in install instructions)
=======
>>>>>>> 341ef96c9a (GEOMESA-3176 Docs - fix download links in install instructions)
=======
=======
>>>>>>> b4c1ea8881 (GEOMESA-3176 Docs - fix download links in install instructions)
>>>>>>> 91879d2d87 (GEOMESA-3176 Docs - fix download links in install instructions)
=======
>>>>>>> b4c1ea8881 (GEOMESA-3176 Docs - fix download links in install instructions)
=======
>>>>>>> fdf0e4fe88 (GEOMESA-3176 Docs - fix download links in install instructions)
<<<<<<< HEAD
<<<<<<< HEAD
=======
=======
    $ export VERSION="|scala_binary_version|-${TAG}" # note: |scala_binary_version| is the Scala build version
=======
    # note: |scala_binary_version| is the Scala build version
    $ export VERSION="|scala_binary_version|-${TAG}"
>>>>>>> 90ec70f55 (GEOMESA-3176 Docs - fix download links in install instructions)
<<<<<<< HEAD
<<<<<<< HEAD
<<<<<<< HEAD
<<<<<<< HEAD
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
>>>>>>> 64a722e2a7 (GEOMESA-3176 Docs - fix download links in install instructions)
=======
>>>>>>> 341ef96c9a (GEOMESA-3176 Docs - fix download links in install instructions)
=======
>>>>>>> 91879d2d87 (GEOMESA-3176 Docs - fix download links in install instructions)
=======
>>>>>>> 17c1f8a18c (GEOMESA-3176 Docs - fix download links in install instructions)
=======
>>>>>>> aff2787fc2 (GEOMESA-3176 Docs - fix download links in install instructions)
=======
<<<<<<< HEAD
>>>>>>> e5cf96e863 (GEOMESA-3176 Docs - fix download links in install instructions)
=======
>>>>>>> b47097b7bb (GEOMESA-3176 Docs - fix download links in install instructions)
=======
=======
>>>>>>> 17c1f8a18c (GEOMESA-3176 Docs - fix download links in install instructions)
>>>>>>> 95f020af8c (GEOMESA-3176 Docs - fix download links in install instructions)
=======
=======
>>>>>>> 341ef96c9a (GEOMESA-3176 Docs - fix download links in install instructions)
    # note: |scala_binary_version| is the Scala build version
    $ export VERSION="|scala_binary_version|-${TAG}"
>>>>>>> 15e998504 (GEOMESA-3176 Docs - fix download links in install instructions)
<<<<<<< HEAD
<<<<<<< HEAD
<<<<<<< HEAD
<<<<<<< HEAD
<<<<<<< HEAD
<<<<<<< HEAD
=======
>>>>>>> 95f020af8c (GEOMESA-3176 Docs - fix download links in install instructions)
=======
>>>>>>> 341ef96c9a (GEOMESA-3176 Docs - fix download links in install instructions)
=======
>>>>>>> 3b4f3da2e1 (GEOMESA-3176 Docs - fix download links in install instructions)
=======
>>>>>>> 17c1f8a18c (GEOMESA-3176 Docs - fix download links in install instructions)
<<<<<<< HEAD
<<<<<<< HEAD
=======
>>>>>>> 4492950388 (GEOMESA-3176 Docs - fix download links in install instructions)
=======
>>>>>>> aff2787fc2 (GEOMESA-3176 Docs - fix download links in install instructions)
<<<<<<< HEAD
<<<<<<< HEAD
=======
>>>>>>> 13325d17c4 (GEOMESA-3176 Docs - fix download links in install instructions)
=======
>>>>>>> e5cf96e863 (GEOMESA-3176 Docs - fix download links in install instructions)
=======
=======
>>>>>>> 3b4f3da2e1 (GEOMESA-3176 Docs - fix download links in install instructions)
>>>>>>> b47097b7bb (GEOMESA-3176 Docs - fix download links in install instructions)
=======
>>>>>>> 95f020af8c (GEOMESA-3176 Docs - fix download links in install instructions)
=======
=======
>>>>>>> 4492950388 (GEOMESA-3176 Docs - fix download links in install instructions)
>>>>>>> 64a722e2a7 (GEOMESA-3176 Docs - fix download links in install instructions)
=======
>>>>>>> 341ef96c9a (GEOMESA-3176 Docs - fix download links in install instructions)
=======
=======
>>>>>>> b4c1ea8881 (GEOMESA-3176 Docs - fix download links in install instructions)
>>>>>>> 91879d2d87 (GEOMESA-3176 Docs - fix download links in install instructions)
=======
>>>>>>> b4c1ea8881 (GEOMESA-3176 Docs - fix download links in install instructions)
=======
=======
    # note: |scala_binary_version| is the Scala build version
    $ export VERSION="|scala_binary_version|-${TAG}"
>>>>>>> 15e998504 (GEOMESA-3176 Docs - fix download links in install instructions)
>>>>>>> fdf0e4fe88 (GEOMESA-3176 Docs - fix download links in install instructions)

Then download and extract the binary distribution:
<<<<<<< HEAD
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
>>>>>>> f561a0faec (GEOMESA-3176 Docs - fix download links in install instructions)
=======
>>>>>>> 1f19a648d1 (GEOMESA-3176 Docs - fix download links in install instructions)
=======
>>>>>>> 731987cbc8 (GEOMESA-3176 Docs - fix download links in install instructions)
=======
>>>>>>> 4fd46f4f99 (GEOMESA-3176 Docs - fix download links in install instructions)
=======
=======
>>>>>>> 1f19a648d1 (GEOMESA-3176 Docs - fix download links in install instructions)
>>>>>>> fbb5e06c6a (GEOMESA-3176 Docs - fix download links in install instructions)
=======
<<<<<<< HEAD
>>>>>>> 16b2e83f22 (GEOMESA-3176 Docs - fix download links in install instructions)
=======
=======
>>>>>>> 15e9985047 (GEOMESA-3176 Docs - fix download links in install instructions)
    # note: |scala_binary_version| is the Scala build version
    $ export VERSION="|scala_binary_version|-${TAG}"

<<<<<<< HEAD
Then download and extract the binary distribution:
<<<<<<< HEAD
=======
>>>>>>> 16b2e83f2 (GEOMESA-3176 Docs - fix download links in install instructions)
<<<<<<< HEAD
>>>>>>> 90ec70f559 (GEOMESA-3176 Docs - fix download links in install instructions)
=======
>>>>>>> 15e9985047 (GEOMESA-3176 Docs - fix download links in install instructions)
=======
>>>>>>> 10ade3dcd1 (GEOMESA-3176 Docs - fix download links in install instructions)
=======
=======
>>>>>>> 3be8d2a5a (Merge branch 'feature/postgis-fixes')
>>>>>>> 1b25d7ddb4 (Merge branch 'feature/postgis-fixes')
=======
=======
>>>>>>> e944f1c88b (Merge branch 'feature/postgis-fixes')
=======
>>>>>>> 235bc2820d (GEOMESA-3176 Docs - fix download links in install instructions)
=======
>>>>>>> 26e5afc4ea (Merge branch 'feature/postgis-fixes')
=======
>>>>>>> 63a045a753 (GEOMESA-3254 Add Bloop build support)
=======
>>>>>>> 93fa8c797f (GEOMESA-3176 Docs - fix download links in install instructions)
=======
>>>>>>> c69897d7bd (Merge branch 'feature/postgis-fixes')
=======
>>>>>>> 3be8d2a5a (Merge branch 'feature/postgis-fixes')
=======
>>>>>>> 7813a31aa (GEOMESA-3176 Docs - fix download links in install instructions)
<<<<<<< HEAD
>>>>>>> 71c56e6b77 (GEOMESA-3176 Docs - fix download links in install instructions)
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
>>>>>>> cb6bda89b6 (Merge branch 'feature/postgis-fixes')
=======
>>>>>>> 09d87762c5 (GEOMESA-3254 Add Bloop build support)
=======
>>>>>>> 703374130f (GEOMESA-3176 Docs - fix download links in install instructions)
=======
>>>>>>> 699117eca9 (Merge branch 'feature/postgis-fixes')
=======
>>>>>>> 3be8d2a5a (Merge branch 'feature/postgis-fixes')
=======
>>>>>>> 2aa923cc9 (GEOMESA-3176 Docs - fix download links in install instructions)
<<<<<<< HEAD
>>>>>>> bdcaf0ab5e (GEOMESA-3176 Docs - fix download links in install instructions)
<<<<<<< HEAD
>>>>>>> 235bc2820d (GEOMESA-3176 Docs - fix download links in install instructions)
=======
=======
=======
=======
>>>>>>> 3be8d2a5a (Merge branch 'feature/postgis-fixes')
>>>>>>> db8d998aa (Merge branch 'feature/postgis-fixes')
<<<<<<< HEAD
>>>>>>> cb6bda89b6 (Merge branch 'feature/postgis-fixes')
<<<<<<< HEAD
>>>>>>> 26e5afc4ea (Merge branch 'feature/postgis-fixes')
=======
=======
=======
>>>>>>> d845d7c1b (GEOMESA-3254 Add Bloop build support)
>>>>>>> 09d87762c5 (GEOMESA-3254 Add Bloop build support)
>>>>>>> 63a045a753 (GEOMESA-3254 Add Bloop build support)

.. parsed-literal::

    $ export TAG="|release_version|"
<<<<<<< HEAD
<<<<<<< HEAD
<<<<<<< HEAD
<<<<<<< HEAD
<<<<<<< HEAD
<<<<<<< HEAD
<<<<<<< HEAD
=======
>>>>>>> 6a26990f7 (GEOMESA-3176 Docs - fix download links in install instructions)
=======
>>>>>>> baa90e85a (GEOMESA-3176 Docs - fix download links in install instructions)
=======
=======
>>>>>>> 8cbe155de (GEOMESA-3176 Docs - fix download links in install instructions)
>>>>>>> 8150bc0e65 (GEOMESA-3176 Docs - fix download links in install instructions)
=======
=======
>>>>>>> 09d87762c5 (GEOMESA-3254 Add Bloop build support)
=======
>>>>>>> 8cbe155de (GEOMESA-3176 Docs - fix download links in install instructions)
=======
>>>>>>> 0fbf9e83e (GEOMESA-3176 Docs - fix download links in install instructions)
>>>>>>> 4d9f87a514 (GEOMESA-3176 Docs - fix download links in install instructions)
    $ export VERSION="|scala_binary_version|-${TAG}" # note: |scala_binary_version| is the Scala build version
=======
    # note: |scala_binary_version| is the Scala build version
    $ export VERSION="|scala_binary_version|-${TAG}"
>>>>>>> 90ec70f55 (GEOMESA-3176 Docs - fix download links in install instructions)
<<<<<<< HEAD
<<<<<<< HEAD
<<<<<<< HEAD
<<<<<<< HEAD
=======
>>>>>>> baa90e85a (GEOMESA-3176 Docs - fix download links in install instructions)
=======
>>>>>>> 8150bc0e65 (GEOMESA-3176 Docs - fix download links in install instructions)
=======
=======
>>>>>>> 0fbf9e83e (GEOMESA-3176 Docs - fix download links in install instructions)
>>>>>>> 4d9f87a514 (GEOMESA-3176 Docs - fix download links in install instructions)
=======
    # note: |scala_binary_version| is the Scala build version
    $ export VERSION="|scala_binary_version|-${TAG}"
>>>>>>> 15e998504 (GEOMESA-3176 Docs - fix download links in install instructions)
<<<<<<< HEAD
<<<<<<< HEAD
<<<<<<< HEAD
=======
>>>>>>> 6a26990f7 (GEOMESA-3176 Docs - fix download links in install instructions)
=======
>>>>>>> baa90e85a (GEOMESA-3176 Docs - fix download links in install instructions)
=======
=======
>>>>>>> 8cbe155de (GEOMESA-3176 Docs - fix download links in install instructions)
>>>>>>> 8150bc0e65 (GEOMESA-3176 Docs - fix download links in install instructions)
=======
=======
>>>>>>> 8cbe155de (GEOMESA-3176 Docs - fix download links in install instructions)
=======
>>>>>>> 0fbf9e83e (GEOMESA-3176 Docs - fix download links in install instructions)
>>>>>>> 4d9f87a514 (GEOMESA-3176 Docs - fix download links in install instructions)

Then download and extract the binary distribution:
<<<<<<< HEAD
<<<<<<< HEAD
<<<<<<< HEAD
<<<<<<< HEAD
<<<<<<< HEAD
=======
>>>>>>> e8cc4971c6 (Merge branch 'feature/postgis-fixes')
=======
>>>>>>> bdcaf0ab5e (GEOMESA-3176 Docs - fix download links in install instructions)
=======
=======
>>>>>>> db8d998aa (Merge branch 'feature/postgis-fixes')
>>>>>>> cb6bda89b6 (Merge branch 'feature/postgis-fixes')
=======
>>>>>>> 16b2e83f2 (GEOMESA-3176 Docs - fix download links in install instructions)
=======
>>>>>>> 10ade3dcd (GEOMESA-3176 Docs - fix download links in install instructions)
=======
=======
>>>>>>> 3be8d2a5a (Merge branch 'feature/postgis-fixes')
>>>>>>> 1b25d7ddb (Merge branch 'feature/postgis-fixes')

.. parsed-literal::

<<<<<<< HEAD
  In the following examples, replace ``${TAG}`` with the corresponding GeoMesa version (e.g. |release_version|), and
  ``${VERSION}`` with the appropriate Scala plus GeoMesa versions (e.g. |scala_release_version|).
<<<<<<< HEAD
=======
>>>>>>> 3be8d2a5a4 (Merge branch 'feature/postgis-fixes')
=======
>>>>>>> 16b2e83f2 (GEOMESA-3176 Docs - fix download links in install instructions)
>>>>>>> 2aa923cc97 (GEOMESA-3176 Docs - fix download links in install instructions)

.. parsed-literal::

=======
>>>>>>> 10ade3dcd1 (GEOMESA-3176 Docs - fix download links in install instructions)
    $ export TAG="|release_version|"
<<<<<<< HEAD
<<<<<<< HEAD
=======
=======
>>>>>>> d845d7c1bd (GEOMESA-3254 Add Bloop build support)
>>>>>>> f1532f2313 (GEOMESA-3254 Add Bloop build support)
<<<<<<< HEAD
=======
>>>>>>> 31ac28fff4 (GEOMESA-3176 Docs - fix download links in install instructions)
=======
>>>>>>> 26bf3ffae4 (GEOMESA-3176 Docs - fix download links in install instructions)
=======
=======
>>>>>>> 8cbe155de6 (GEOMESA-3176 Docs - fix download links in install instructions)
>>>>>>> 9b83a71a1e (GEOMESA-3176 Docs - fix download links in install instructions)
=======
>>>>>>> 1ce7179e65 (GEOMESA-3176 Docs - fix download links in install instructions)
=======
<<<<<<< HEAD
=======
>>>>>>> 16b2e83f2 (GEOMESA-3176 Docs - fix download links in install instructions)
<<<<<<< HEAD
>>>>>>> 90ec70f559 (GEOMESA-3176 Docs - fix download links in install instructions)
=======
>>>>>>> 15e9985047 (GEOMESA-3176 Docs - fix download links in install instructions)
=======
>>>>>>> 10ade3dcd1 (GEOMESA-3176 Docs - fix download links in install instructions)
=======
=======
>>>>>>> 3be8d2a5a (Merge branch 'feature/postgis-fixes')
>>>>>>> 1b25d7ddb4 (Merge branch 'feature/postgis-fixes')
=======
=======
>>>>>>> e944f1c88b (Merge branch 'feature/postgis-fixes')
=======
>>>>>>> 235bc2820d (GEOMESA-3176 Docs - fix download links in install instructions)
=======
>>>>>>> 26e5afc4ea (Merge branch 'feature/postgis-fixes')
=======
>>>>>>> 63a045a753 (GEOMESA-3254 Add Bloop build support)
=======
>>>>>>> 93fa8c797f (GEOMESA-3176 Docs - fix download links in install instructions)
=======
>>>>>>> c69897d7bd (Merge branch 'feature/postgis-fixes')
=======
>>>>>>> 3be8d2a5a (Merge branch 'feature/postgis-fixes')
=======
>>>>>>> 7813a31aa (GEOMESA-3176 Docs - fix download links in install instructions)
<<<<<<< HEAD
>>>>>>> 71c56e6b77 (GEOMESA-3176 Docs - fix download links in install instructions)
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
>>>>>>> cb6bda89b6 (Merge branch 'feature/postgis-fixes')
=======
>>>>>>> 09d87762c5 (GEOMESA-3254 Add Bloop build support)
=======
>>>>>>> 703374130f (GEOMESA-3176 Docs - fix download links in install instructions)
=======
>>>>>>> 699117eca9 (Merge branch 'feature/postgis-fixes')
=======
>>>>>>> 3be8d2a5a (Merge branch 'feature/postgis-fixes')
=======
>>>>>>> 2aa923cc9 (GEOMESA-3176 Docs - fix download links in install instructions)
<<<<<<< HEAD
>>>>>>> bdcaf0ab5e (GEOMESA-3176 Docs - fix download links in install instructions)
<<<<<<< HEAD
>>>>>>> 235bc2820d (GEOMESA-3176 Docs - fix download links in install instructions)
=======
=======
=======
=======
>>>>>>> 3be8d2a5a (Merge branch 'feature/postgis-fixes')
>>>>>>> db8d998aa (Merge branch 'feature/postgis-fixes')
<<<<<<< HEAD
>>>>>>> cb6bda89b6 (Merge branch 'feature/postgis-fixes')
<<<<<<< HEAD
>>>>>>> 26e5afc4ea (Merge branch 'feature/postgis-fixes')
=======
=======
=======
>>>>>>> d845d7c1b (GEOMESA-3254 Add Bloop build support)
>>>>>>> 09d87762c5 (GEOMESA-3254 Add Bloop build support)
>>>>>>> 63a045a753 (GEOMESA-3254 Add Bloop build support)

.. parsed-literal::

    $ export TAG="|release_version|"
<<<<<<< HEAD
<<<<<<< HEAD
<<<<<<< HEAD
<<<<<<< HEAD
<<<<<<< HEAD
<<<<<<< HEAD
<<<<<<< HEAD
=======
>>>>>>> 6a26990f7 (GEOMESA-3176 Docs - fix download links in install instructions)
=======
>>>>>>> baa90e85a (GEOMESA-3176 Docs - fix download links in install instructions)
=======
=======
>>>>>>> 8cbe155de (GEOMESA-3176 Docs - fix download links in install instructions)
>>>>>>> 8150bc0e65 (GEOMESA-3176 Docs - fix download links in install instructions)
=======
=======
>>>>>>> 09d87762c5 (GEOMESA-3254 Add Bloop build support)
=======
>>>>>>> 8cbe155de (GEOMESA-3176 Docs - fix download links in install instructions)
=======
>>>>>>> 0fbf9e83e (GEOMESA-3176 Docs - fix download links in install instructions)
>>>>>>> 4d9f87a514 (GEOMESA-3176 Docs - fix download links in install instructions)
    $ export VERSION="|scala_binary_version|-${TAG}" # note: |scala_binary_version| is the Scala build version
=======
    # note: |scala_binary_version| is the Scala build version
    $ export VERSION="|scala_binary_version|-${TAG}"
>>>>>>> 90ec70f55 (GEOMESA-3176 Docs - fix download links in install instructions)
<<<<<<< HEAD
<<<<<<< HEAD
>>>>>>> location-main
<<<<<<< HEAD
<<<<<<< HEAD
=======
>>>>>>> baa90e85a (GEOMESA-3176 Docs - fix download links in install instructions)
=======
>>>>>>> 8150bc0e65 (GEOMESA-3176 Docs - fix download links in install instructions)
=======
=======
>>>>>>> 0fbf9e83e (GEOMESA-3176 Docs - fix download links in install instructions)
>>>>>>> 4d9f87a514 (GEOMESA-3176 Docs - fix download links in install instructions)
=======
    # note: |scala_binary_version| is the Scala build version
    $ export VERSION="|scala_binary_version|-${TAG}"
>>>>>>> 15e998504 (GEOMESA-3176 Docs - fix download links in install instructions)
<<<<<<< HEAD
<<<<<<< HEAD
<<<<<<< HEAD
=======
>>>>>>> 6a26990f7 (GEOMESA-3176 Docs - fix download links in install instructions)
=======
>>>>>>> baa90e85a (GEOMESA-3176 Docs - fix download links in install instructions)
=======
=======
>>>>>>> 8cbe155de (GEOMESA-3176 Docs - fix download links in install instructions)
>>>>>>> 8150bc0e65 (GEOMESA-3176 Docs - fix download links in install instructions)
=======
=======
>>>>>>> 8cbe155de (GEOMESA-3176 Docs - fix download links in install instructions)
=======
>>>>>>> 0fbf9e83e (GEOMESA-3176 Docs - fix download links in install instructions)
>>>>>>> 4d9f87a514 (GEOMESA-3176 Docs - fix download links in install instructions)

Then download and extract the binary distribution:
<<<<<<< HEAD
<<<<<<< HEAD
<<<<<<< HEAD
<<<<<<< HEAD
<<<<<<< HEAD
=======
>>>>>>> e8cc4971c6 (Merge branch 'feature/postgis-fixes')
=======
>>>>>>> bdcaf0ab5e (GEOMESA-3176 Docs - fix download links in install instructions)
=======
=======
>>>>>>> db8d998aa (Merge branch 'feature/postgis-fixes')
>>>>>>> cb6bda89b6 (Merge branch 'feature/postgis-fixes')
=======
>>>>>>> 16b2e83f2 (GEOMESA-3176 Docs - fix download links in install instructions)
=======
>>>>>>> 10ade3dcd (GEOMESA-3176 Docs - fix download links in install instructions)
=======
=======
>>>>>>> 3be8d2a5a (Merge branch 'feature/postgis-fixes')
>>>>>>> 1b25d7ddb (Merge branch 'feature/postgis-fixes')

.. parsed-literal::

<<<<<<< HEAD
=======
<<<<<<< HEAD
  In the following examples, replace ``${TAG}`` with the corresponding GeoMesa version (e.g. |release_version|), and
  ``${VERSION}`` with the appropriate Scala plus GeoMesa versions (e.g. |scala_release_version|).
<<<<<<< HEAD
=======
>>>>>>> 3be8d2a5a4 (Merge branch 'feature/postgis-fixes')
=======
>>>>>>> 16b2e83f2 (GEOMESA-3176 Docs - fix download links in install instructions)
>>>>>>> 2aa923cc97 (GEOMESA-3176 Docs - fix download links in install instructions)

.. parsed-literal::

=======
>>>>>>> 10ade3dcd1 (GEOMESA-3176 Docs - fix download links in install instructions)
>>>>>>> location-main
    $ export TAG="|release_version|"
<<<<<<< HEAD
<<<<<<< HEAD
=======
>>>>>>> fdf0e4fe88 (GEOMESA-3176 Docs - fix download links in install instructions)
    $ export VERSION="|scala_binary_version|-${TAG}" # note: |scala_binary_version| is the Scala build version
=======
    # note: |scala_binary_version| is the Scala build version
    $ export VERSION="|scala_binary_version|-${TAG}"
>>>>>>> 90ec70f55 (GEOMESA-3176 Docs - fix download links in install instructions)
=======
<<<<<<< HEAD
<<<<<<< HEAD
>>>>>>> locationtech-main
=======
    # note: |scala_binary_version| is the Scala build version
    $ export VERSION="|scala_binary_version|-${TAG}"
>>>>>>> 15e998504 (GEOMESA-3176 Docs - fix download links in install instructions)
<<<<<<< HEAD
=======
    # note: |scala_binary_version| is the Scala build version
    $ export VERSION="|scala_binary_version|-${TAG}"
>>>>>>> 15e998504 (GEOMESA-3176 Docs - fix download links in install instructions)
>>>>>>> fdf0e4fe88 (GEOMESA-3176 Docs - fix download links in install instructions)

Then download and extract the binary distribution:
<<<<<<< HEAD
=======
>>>>>>> 16b2e83f2 (GEOMESA-3176 Docs - fix download links in install instructions)

=======
    # note: |scala_binary_version| is the Scala build version
    $ export VERSION="|scala_binary_version|-${TAG}"
>>>>>>> 15e998504 (GEOMESA-3176 Docs - fix download links in install instructions)

Then download and extract the binary distribution:
<<<<<<< HEAD
<<<<<<< HEAD
<<<<<<< HEAD
<<<<<<< HEAD

=======
>>>>>>> f0b9bd8121 (GEOMESA-3061 Converters - support bytes in Avro top-level union types (#2762))
.. note::

  In the following examples, replace ``${TAG}`` with the corresponding GeoMesa version (e.g. |release_version|), and
  ``${VERSION}`` with the appropriate Scala plus GeoMesa versions (e.g. |scala_release_version|).
<<<<<<< HEAD
=======
>>>>>>> 3be8d2a5a (Merge branch 'feature/postgis-fixes')
>>>>>>> 0ba49a2fd7 (GEOMESA-3176 Docs - fix download links in install instructions)
=======
>>>>>>> d845d7c1bd (GEOMESA-3254 Add Bloop build support)
>>>>>>> 7a84c9d22d (GEOMESA-3254 Add Bloop build support)
=======
<<<<<<< HEAD
>>>>>>> c738f63bd9 (GEOMESA-3254 Add Bloop build support)
=======
>>>>>>> 6d9a5b626c (GEOMESA-3061 Converters - support bytes in Avro top-level union types (#2762))
=======
>>>>>>> 10ade3dcd1 (GEOMESA-3176 Docs - fix download links in install instructions)
=======
=======
>>>>>>> c69897d7bd (Merge branch 'feature/postgis-fixes')
=======
>>>>>>> 16b2e83f2 (GEOMESA-3176 Docs - fix download links in install instructions)
>>>>>>> 93fa8c797f (GEOMESA-3176 Docs - fix download links in install instructions)
=======
=======
>>>>>>> da00c7bd68 (Merge branch 'feature/postgis-fixes')
=======
>>>>>>> 16b2e83f2 (GEOMESA-3176 Docs - fix download links in install instructions)
=======
=======
>>>>>>> 16b2e83f2 (GEOMESA-3176 Docs - fix download links in install instructions)
=======
=======
>>>>>>> 16b2e83f2 (GEOMESA-3176 Docs - fix download links in install instructions)

.. parsed-literal::

    $ export TAG="|release_version|"
    # note: |scala_binary_version| is the Scala build version
    $ export VERSION="|scala_binary_version|-${TAG}"

Then download and extract the binary distribution:
>>>>>>> baeb44a4a8 (GEOMESA-3176 Docs - fix download links in install instructions)

<<<<<<< HEAD
<<<<<<< HEAD
<<<<<<< HEAD
<<<<<<< HEAD
.. parsed-literal::

    $ export TAG="|release_version|"
    # note: |scala_binary_version| is the Scala build version
    $ export VERSION="|scala_binary_version|-${TAG}"

Then download and extract the binary distribution:
>>>>>>> baeb44a4a8 (GEOMESA-3176 Docs - fix download links in install instructions)

<<<<<<< HEAD
<<<<<<< HEAD
<<<<<<< HEAD
<<<<<<< HEAD
.. parsed-literal::

    $ export TAG="|release_version|"
    # note: |scala_binary_version| is the Scala build version
    $ export VERSION="|scala_binary_version|-${TAG}"

Then download and extract the binary distribution:
>>>>>>> 308738bcef (GEOMESA-3176 Docs - fix download links in install instructions)

<<<<<<< HEAD
<<<<<<< HEAD
<<<<<<< HEAD
<<<<<<< HEAD
<<<<<<< HEAD
<<<<<<< HEAD
<<<<<<< HEAD
>>>>>>> location-main
<<<<<<< HEAD
<<<<<<< HEAD
<<<<<<< HEAD
<<<<<<< HEAD
<<<<<<< HEAD
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
>>>>>>> 3dd99aed4 (GEOMESA-3061 Converters - support bytes in Avro top-level union types (#2762))
=======
>>>>>>> 4524373ac (GEOMESA-3061 Converters - support bytes in Avro top-level union types (#2762))
=======
>>>>>>> 4fbe39c62 (GEOMESA-3061 Converters - support bytes in Avro top-level union types (#2762))
=======
>>>>>>> 8150bc0e65 (GEOMESA-3176 Docs - fix download links in install instructions)
=======
=======
>>>>>>> 4d9f87a514 (GEOMESA-3176 Docs - fix download links in install instructions)
=======
>>>>>>> 5f428db97 (GEOMESA-3061 Converters - support bytes in Avro top-level union types (#2762))
>>>>>>> 6a2cd10c1c (GEOMESA-3061 Converters - support bytes in Avro top-level union types (#2762))
=======
=======
>>>>>>> bd3233180f (GEOMESA-3176 Docs - fix download links in install instructions)
=======
>>>>>>> 0c734cda2b (GEOMESA-3061 Converters - support bytes in Avro top-level union types (#2762))
=======
>>>>>>> 67e4c1354f (GEOMESA-3061 Converters - support bytes in Avro top-level union types (#2762))
=======
>>>>>>> 703374130f (GEOMESA-3176 Docs - fix download links in install instructions)
=======
>>>>>>> 5f428db97 (GEOMESA-3061 Converters - support bytes in Avro top-level union types (#2762))
=======
>>>>>>> 89bdd3013 (GEOMESA-3061 Converters - support bytes in Avro top-level union types (#2762))
<<<<<<< HEAD
>>>>>>> 8a6a96234b (GEOMESA-3061 Converters - support bytes in Avro top-level union types (#2762))
=======
=======
>>>>>>> 72bafaf54 (GEOMESA-3061 Converters - support bytes in Avro top-level union types (#2762))
<<<<<<< HEAD
>>>>>>> 0c734cda2b (GEOMESA-3061 Converters - support bytes in Avro top-level union types (#2762))
=======
=======
>>>>>>> 6d9a5b626 (GEOMESA-3061 Converters - support bytes in Avro top-level union types (#2762))
>>>>>>> 67e4c1354f (GEOMESA-3061 Converters - support bytes in Avro top-level union types (#2762))
<<<<<<< HEAD
=======
=======
>>>>>>> c1f99f4bcb (GEOMESA-3061 Converters - support bytes in Avro top-level union types (#2762))
=======
>>>>>>> 338d952d43 (GEOMESA-3061 Converters - support bytes in Avro top-level union types (#2762))
=======
>>>>>>> 9627a2de6a (GEOMESA-3061 Converters - support bytes in Avro top-level union types (#2762))
=======
>>>>>>> 76908c410a (GEOMESA-3061 Converters - support bytes in Avro top-level union types (#2762))
>>>>>>> location-main
=======
>>>>>>> 49a5a0454f (GEOMESA-3061 Converters - support bytes in Avro top-level union types (#2762))
=======
>>>>>>> b03141c1bb (GEOMESA-3061 Converters - support bytes in Avro top-level union types (#2762))
=======
>>>>>>> 49a5a0454f (GEOMESA-3061 Converters - support bytes in Avro top-level union types (#2762))
=======
>>>>>>> b03141c1bb (GEOMESA-3061 Converters - support bytes in Avro top-level union types (#2762))
.. note::

  In the following examples, replace ``${TAG}`` with the corresponding GeoMesa version (e.g. |release_version|), and
  ``${VERSION}`` with the appropriate Scala plus GeoMesa versions (e.g. |scala_release_version|).
<<<<<<< HEAD
<<<<<<< HEAD
<<<<<<< HEAD
<<<<<<< HEAD
<<<<<<< HEAD
<<<<<<< HEAD
<<<<<<< HEAD
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
>>>>>>> location-main
=======
>>>>>>> f9f6fde40b (GEOMESA-3061 Converters - support bytes in Avro top-level union types (#2762))
=======
>>>>>>> 6a2cd10c1c (GEOMESA-3061 Converters - support bytes in Avro top-level union types (#2762))
=======
>>>>>>> 8a6a96234b (GEOMESA-3061 Converters - support bytes in Avro top-level union types (#2762))
=======
>>>>>>> 0c734cda2b (GEOMESA-3061 Converters - support bytes in Avro top-level union types (#2762))
=======
>>>>>>> cb6bda89b6 (Merge branch 'feature/postgis-fixes')
=======
>>>>>>> 67e4c1354f (GEOMESA-3061 Converters - support bytes in Avro top-level union types (#2762))
=======
>>>>>>> 3be8d2a5a (Merge branch 'feature/postgis-fixes')
=======
=======
>>>>>>> 16b2e83f2 (GEOMESA-3176 Docs - fix download links in install instructions)
<<<<<<< HEAD
<<<<<<< HEAD
>>>>>>> 7813a31aa (GEOMESA-3176 Docs - fix download links in install instructions)
=======
=======
>>>>>>> 3be8d2a5a (Merge branch 'feature/postgis-fixes')
>>>>>>> e8cc4971c6 (Merge branch 'feature/postgis-fixes')
=======
>>>>>>> 2aa923cc9 (GEOMESA-3176 Docs - fix download links in install instructions)
=======
=======
>>>>>>> 3be8d2a5a (Merge branch 'feature/postgis-fixes')
>>>>>>> db8d998aa (Merge branch 'feature/postgis-fixes')
<<<<<<< HEAD
>>>>>>> cb6bda89b6 (Merge branch 'feature/postgis-fixes')
=======
=======
>>>>>>> f561a0faec (GEOMESA-3176 Docs - fix download links in install instructions)
>>>>>>> locatelli-main
    $ export VERSION="|scala_binary_version|-${TAG}" # note: |scala_binary_version| is the Scala build version
=======
    # note: |scala_binary_version| is the Scala build version
    $ export VERSION="|scala_binary_version|-${TAG}"
>>>>>>> 90ec70f55 (GEOMESA-3176 Docs - fix download links in install instructions)
<<<<<<< HEAD
<<<<<<< HEAD
<<<<<<< HEAD
<<<<<<< HEAD
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
>>>>>>> 64a722e2a7 (GEOMESA-3176 Docs - fix download links in install instructions)
=======
>>>>>>> 341ef96c9a (GEOMESA-3176 Docs - fix download links in install instructions)
=======
>>>>>>> 91879d2d87 (GEOMESA-3176 Docs - fix download links in install instructions)
=======
>>>>>>> 17c1f8a18c (GEOMESA-3176 Docs - fix download links in install instructions)
=======
>>>>>>> aff2787fc2 (GEOMESA-3176 Docs - fix download links in install instructions)
=======
<<<<<<< HEAD
>>>>>>> e5cf96e863 (GEOMESA-3176 Docs - fix download links in install instructions)
=======
>>>>>>> b47097b7bb (GEOMESA-3176 Docs - fix download links in install instructions)
=======
=======
>>>>>>> 17c1f8a18c (GEOMESA-3176 Docs - fix download links in install instructions)
>>>>>>> 95f020af8c (GEOMESA-3176 Docs - fix download links in install instructions)
=======
=======
>>>>>>> 341ef96c9a (GEOMESA-3176 Docs - fix download links in install instructions)
    # note: |scala_binary_version| is the Scala build version
    $ export VERSION="|scala_binary_version|-${TAG}"
>>>>>>> 15e998504 (GEOMESA-3176 Docs - fix download links in install instructions)
<<<<<<< HEAD
<<<<<<< HEAD
<<<<<<< HEAD
<<<<<<< HEAD
<<<<<<< HEAD
<<<<<<< HEAD
=======
>>>>>>> 95f020af8c (GEOMESA-3176 Docs - fix download links in install instructions)
=======
>>>>>>> 341ef96c9a (GEOMESA-3176 Docs - fix download links in install instructions)
=======
>>>>>>> 3b4f3da2e1 (GEOMESA-3176 Docs - fix download links in install instructions)
=======
>>>>>>> 17c1f8a18c (GEOMESA-3176 Docs - fix download links in install instructions)
<<<<<<< HEAD
<<<<<<< HEAD
=======
>>>>>>> 4492950388 (GEOMESA-3176 Docs - fix download links in install instructions)
=======
>>>>>>> aff2787fc2 (GEOMESA-3176 Docs - fix download links in install instructions)
<<<<<<< HEAD
<<<<<<< HEAD
=======
>>>>>>> 13325d17c4 (GEOMESA-3176 Docs - fix download links in install instructions)
=======
>>>>>>> e5cf96e863 (GEOMESA-3176 Docs - fix download links in install instructions)
=======
=======
>>>>>>> 3b4f3da2e1 (GEOMESA-3176 Docs - fix download links in install instructions)
>>>>>>> b47097b7bb (GEOMESA-3176 Docs - fix download links in install instructions)
=======
>>>>>>> 95f020af8c (GEOMESA-3176 Docs - fix download links in install instructions)
=======
=======
>>>>>>> 4492950388 (GEOMESA-3176 Docs - fix download links in install instructions)
>>>>>>> 64a722e2a7 (GEOMESA-3176 Docs - fix download links in install instructions)
=======
>>>>>>> 341ef96c9a (GEOMESA-3176 Docs - fix download links in install instructions)
=======
=======
>>>>>>> b4c1ea8881 (GEOMESA-3176 Docs - fix download links in install instructions)
>>>>>>> 91879d2d87 (GEOMESA-3176 Docs - fix download links in install instructions)
=======
>>>>>>> b4c1ea8881 (GEOMESA-3176 Docs - fix download links in install instructions)
=======
=======
    # note: |scala_binary_version| is the Scala build version
    $ export VERSION="|scala_binary_version|-${TAG}"
>>>>>>> 15e998504 (GEOMESA-3176 Docs - fix download links in install instructions)
>>>>>>> fdf0e4fe88 (GEOMESA-3176 Docs - fix download links in install instructions)

Then download and extract the binary distribution:
<<<<<<< HEAD
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
>>>>>>> f561a0faec (GEOMESA-3176 Docs - fix download links in install instructions)
=======
>>>>>>> 1f19a648d1 (GEOMESA-3176 Docs - fix download links in install instructions)
=======
>>>>>>> 731987cbc8 (GEOMESA-3176 Docs - fix download links in install instructions)
=======
>>>>>>> 4fd46f4f99 (GEOMESA-3176 Docs - fix download links in install instructions)
=======
=======
>>>>>>> 1f19a648d1 (GEOMESA-3176 Docs - fix download links in install instructions)
>>>>>>> fbb5e06c6a (GEOMESA-3176 Docs - fix download links in install instructions)
=======
<<<<<<< HEAD
>>>>>>> 16b2e83f22 (GEOMESA-3176 Docs - fix download links in install instructions)
=======
=======
>>>>>>> 15e9985047 (GEOMESA-3176 Docs - fix download links in install instructions)
    # note: |scala_binary_version| is the Scala build version
    $ export VERSION="|scala_binary_version|-${TAG}"

<<<<<<< HEAD
Then download and extract the binary distribution:
<<<<<<< HEAD
=======
>>>>>>> 16b2e83f2 (GEOMESA-3176 Docs - fix download links in install instructions)
<<<<<<< HEAD
>>>>>>> 90ec70f559 (GEOMESA-3176 Docs - fix download links in install instructions)
=======
>>>>>>> 15e9985047 (GEOMESA-3176 Docs - fix download links in install instructions)
=======
>>>>>>> 10ade3dcd1 (GEOMESA-3176 Docs - fix download links in install instructions)
=======
=======
>>>>>>> 3be8d2a5a (Merge branch 'feature/postgis-fixes')
>>>>>>> 1b25d7ddb4 (Merge branch 'feature/postgis-fixes')
=======
=======
>>>>>>> e944f1c88b (Merge branch 'feature/postgis-fixes')
=======
>>>>>>> 235bc2820d (GEOMESA-3176 Docs - fix download links in install instructions)
=======
>>>>>>> 26e5afc4ea (Merge branch 'feature/postgis-fixes')
=======
>>>>>>> 63a045a753 (GEOMESA-3254 Add Bloop build support)
=======
>>>>>>> 93fa8c797f (GEOMESA-3176 Docs - fix download links in install instructions)
=======
>>>>>>> c69897d7bd (Merge branch 'feature/postgis-fixes')
=======
>>>>>>> 3be8d2a5a (Merge branch 'feature/postgis-fixes')
=======
>>>>>>> 7813a31aa (GEOMESA-3176 Docs - fix download links in install instructions)
<<<<<<< HEAD
>>>>>>> 71c56e6b77 (GEOMESA-3176 Docs - fix download links in install instructions)
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
>>>>>>> cb6bda89b6 (Merge branch 'feature/postgis-fixes')
=======
>>>>>>> 09d87762c5 (GEOMESA-3254 Add Bloop build support)
=======
>>>>>>> 703374130f (GEOMESA-3176 Docs - fix download links in install instructions)
=======
>>>>>>> 699117eca9 (Merge branch 'feature/postgis-fixes')
=======
>>>>>>> 3be8d2a5a (Merge branch 'feature/postgis-fixes')
=======
>>>>>>> 2aa923cc9 (GEOMESA-3176 Docs - fix download links in install instructions)
<<<<<<< HEAD
>>>>>>> bdcaf0ab5e (GEOMESA-3176 Docs - fix download links in install instructions)
<<<<<<< HEAD
>>>>>>> 235bc2820d (GEOMESA-3176 Docs - fix download links in install instructions)
=======
=======
=======
=======
>>>>>>> 3be8d2a5a (Merge branch 'feature/postgis-fixes')
>>>>>>> db8d998aa (Merge branch 'feature/postgis-fixes')
<<<<<<< HEAD
>>>>>>> cb6bda89b6 (Merge branch 'feature/postgis-fixes')
<<<<<<< HEAD
>>>>>>> 26e5afc4ea (Merge branch 'feature/postgis-fixes')
=======
=======
=======
>>>>>>> d845d7c1b (GEOMESA-3254 Add Bloop build support)
>>>>>>> 09d87762c5 (GEOMESA-3254 Add Bloop build support)
>>>>>>> 63a045a753 (GEOMESA-3254 Add Bloop build support)

.. parsed-literal::

    $ export TAG="|release_version|"
<<<<<<< HEAD
<<<<<<< HEAD
<<<<<<< HEAD
<<<<<<< HEAD
<<<<<<< HEAD
<<<<<<< HEAD
<<<<<<< HEAD
=======
>>>>>>> 6a26990f7 (GEOMESA-3176 Docs - fix download links in install instructions)
=======
>>>>>>> baa90e85a (GEOMESA-3176 Docs - fix download links in install instructions)
=======
=======
>>>>>>> 8cbe155de (GEOMESA-3176 Docs - fix download links in install instructions)
>>>>>>> 8150bc0e65 (GEOMESA-3176 Docs - fix download links in install instructions)
=======
=======
>>>>>>> 09d87762c5 (GEOMESA-3254 Add Bloop build support)
=======
>>>>>>> 8cbe155de (GEOMESA-3176 Docs - fix download links in install instructions)
=======
>>>>>>> 0fbf9e83e (GEOMESA-3176 Docs - fix download links in install instructions)
>>>>>>> 4d9f87a514 (GEOMESA-3176 Docs - fix download links in install instructions)
    $ export VERSION="|scala_binary_version|-${TAG}" # note: |scala_binary_version| is the Scala build version
=======
    # note: |scala_binary_version| is the Scala build version
    $ export VERSION="|scala_binary_version|-${TAG}"
>>>>>>> 90ec70f55 (GEOMESA-3176 Docs - fix download links in install instructions)
<<<<<<< HEAD
<<<<<<< HEAD
<<<<<<< HEAD
<<<<<<< HEAD
=======
>>>>>>> baa90e85a (GEOMESA-3176 Docs - fix download links in install instructions)
=======
>>>>>>> 8150bc0e65 (GEOMESA-3176 Docs - fix download links in install instructions)
=======
=======
>>>>>>> 0fbf9e83e (GEOMESA-3176 Docs - fix download links in install instructions)
>>>>>>> 4d9f87a514 (GEOMESA-3176 Docs - fix download links in install instructions)
=======
    # note: |scala_binary_version| is the Scala build version
    $ export VERSION="|scala_binary_version|-${TAG}"
>>>>>>> 15e998504 (GEOMESA-3176 Docs - fix download links in install instructions)
<<<<<<< HEAD
<<<<<<< HEAD
<<<<<<< HEAD
=======
>>>>>>> 6a26990f7 (GEOMESA-3176 Docs - fix download links in install instructions)
=======
>>>>>>> baa90e85a (GEOMESA-3176 Docs - fix download links in install instructions)
=======
=======
>>>>>>> 8cbe155de (GEOMESA-3176 Docs - fix download links in install instructions)
>>>>>>> 8150bc0e65 (GEOMESA-3176 Docs - fix download links in install instructions)
=======
=======
>>>>>>> 8cbe155de (GEOMESA-3176 Docs - fix download links in install instructions)
=======
>>>>>>> 0fbf9e83e (GEOMESA-3176 Docs - fix download links in install instructions)
>>>>>>> 4d9f87a514 (GEOMESA-3176 Docs - fix download links in install instructions)

Then download and extract the binary distribution:
<<<<<<< HEAD
<<<<<<< HEAD
<<<<<<< HEAD
<<<<<<< HEAD
<<<<<<< HEAD
=======
>>>>>>> e8cc4971c6 (Merge branch 'feature/postgis-fixes')
=======
>>>>>>> bdcaf0ab5e (GEOMESA-3176 Docs - fix download links in install instructions)
=======
=======
>>>>>>> db8d998aa (Merge branch 'feature/postgis-fixes')
>>>>>>> cb6bda89b6 (Merge branch 'feature/postgis-fixes')
=======
>>>>>>> 16b2e83f2 (GEOMESA-3176 Docs - fix download links in install instructions)
=======
>>>>>>> 10ade3dcd (GEOMESA-3176 Docs - fix download links in install instructions)
=======
=======
>>>>>>> 3be8d2a5a (Merge branch 'feature/postgis-fixes')
>>>>>>> 1b25d7ddb (Merge branch 'feature/postgis-fixes')

.. parsed-literal::

<<<<<<< HEAD
  In the following examples, replace ``${TAG}`` with the corresponding GeoMesa version (e.g. |release_version|), and
  ``${VERSION}`` with the appropriate Scala plus GeoMesa versions (e.g. |scala_release_version|).
<<<<<<< HEAD
=======
>>>>>>> 3be8d2a5a4 (Merge branch 'feature/postgis-fixes')
=======
>>>>>>> 16b2e83f2 (GEOMESA-3176 Docs - fix download links in install instructions)
>>>>>>> 2aa923cc97 (GEOMESA-3176 Docs - fix download links in install instructions)

.. parsed-literal::

=======
>>>>>>> 10ade3dcd1 (GEOMESA-3176 Docs - fix download links in install instructions)
    $ export TAG="|release_version|"
<<<<<<< HEAD
<<<<<<< HEAD
=======
=======
>>>>>>> d845d7c1bd (GEOMESA-3254 Add Bloop build support)
>>>>>>> f1532f2313 (GEOMESA-3254 Add Bloop build support)
<<<<<<< HEAD
=======
>>>>>>> 31ac28fff4 (GEOMESA-3176 Docs - fix download links in install instructions)
=======
>>>>>>> 26bf3ffae4 (GEOMESA-3176 Docs - fix download links in install instructions)
=======
=======
>>>>>>> 8cbe155de6 (GEOMESA-3176 Docs - fix download links in install instructions)
>>>>>>> 9b83a71a1e (GEOMESA-3176 Docs - fix download links in install instructions)
=======
>>>>>>> 1ce7179e65 (GEOMESA-3176 Docs - fix download links in install instructions)
=======
<<<<<<< HEAD
=======
>>>>>>> 16b2e83f2 (GEOMESA-3176 Docs - fix download links in install instructions)
<<<<<<< HEAD
>>>>>>> 90ec70f559 (GEOMESA-3176 Docs - fix download links in install instructions)
=======
>>>>>>> 15e9985047 (GEOMESA-3176 Docs - fix download links in install instructions)
=======
>>>>>>> 10ade3dcd1 (GEOMESA-3176 Docs - fix download links in install instructions)
=======
=======
>>>>>>> 3be8d2a5a (Merge branch 'feature/postgis-fixes')
>>>>>>> 1b25d7ddb4 (Merge branch 'feature/postgis-fixes')
=======
=======
>>>>>>> e944f1c88b (Merge branch 'feature/postgis-fixes')
=======
>>>>>>> 235bc2820d (GEOMESA-3176 Docs - fix download links in install instructions)
=======
>>>>>>> 26e5afc4ea (Merge branch 'feature/postgis-fixes')
=======
>>>>>>> 63a045a753 (GEOMESA-3254 Add Bloop build support)
=======
>>>>>>> 93fa8c797f (GEOMESA-3176 Docs - fix download links in install instructions)
=======
>>>>>>> c69897d7bd (Merge branch 'feature/postgis-fixes')
=======
>>>>>>> 3be8d2a5a (Merge branch 'feature/postgis-fixes')
=======
>>>>>>> 7813a31aa (GEOMESA-3176 Docs - fix download links in install instructions)
<<<<<<< HEAD
>>>>>>> 71c56e6b77 (GEOMESA-3176 Docs - fix download links in install instructions)
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
>>>>>>> cb6bda89b6 (Merge branch 'feature/postgis-fixes')
=======
>>>>>>> 09d87762c5 (GEOMESA-3254 Add Bloop build support)
=======
>>>>>>> 703374130f (GEOMESA-3176 Docs - fix download links in install instructions)
=======
>>>>>>> 699117eca9 (Merge branch 'feature/postgis-fixes')
=======
>>>>>>> 3be8d2a5a (Merge branch 'feature/postgis-fixes')
=======
>>>>>>> 2aa923cc9 (GEOMESA-3176 Docs - fix download links in install instructions)
<<<<<<< HEAD
>>>>>>> bdcaf0ab5e (GEOMESA-3176 Docs - fix download links in install instructions)
<<<<<<< HEAD
>>>>>>> 235bc2820d (GEOMESA-3176 Docs - fix download links in install instructions)
=======
=======
=======
=======
>>>>>>> 3be8d2a5a (Merge branch 'feature/postgis-fixes')
>>>>>>> db8d998aa (Merge branch 'feature/postgis-fixes')
<<<<<<< HEAD
>>>>>>> cb6bda89b6 (Merge branch 'feature/postgis-fixes')
<<<<<<< HEAD
>>>>>>> 26e5afc4ea (Merge branch 'feature/postgis-fixes')
=======
=======
=======
>>>>>>> d845d7c1b (GEOMESA-3254 Add Bloop build support)
>>>>>>> 09d87762c5 (GEOMESA-3254 Add Bloop build support)
>>>>>>> 63a045a753 (GEOMESA-3254 Add Bloop build support)

.. parsed-literal::

    $ export TAG="|release_version|"
<<<<<<< HEAD
<<<<<<< HEAD
<<<<<<< HEAD
<<<<<<< HEAD
<<<<<<< HEAD
<<<<<<< HEAD
<<<<<<< HEAD
=======
>>>>>>> 6a26990f7 (GEOMESA-3176 Docs - fix download links in install instructions)
=======
>>>>>>> baa90e85a (GEOMESA-3176 Docs - fix download links in install instructions)
=======
=======
>>>>>>> 8cbe155de (GEOMESA-3176 Docs - fix download links in install instructions)
>>>>>>> 8150bc0e65 (GEOMESA-3176 Docs - fix download links in install instructions)
=======
=======
>>>>>>> 09d87762c5 (GEOMESA-3254 Add Bloop build support)
=======
>>>>>>> 8cbe155de (GEOMESA-3176 Docs - fix download links in install instructions)
=======
>>>>>>> 0fbf9e83e (GEOMESA-3176 Docs - fix download links in install instructions)
>>>>>>> 4d9f87a514 (GEOMESA-3176 Docs - fix download links in install instructions)
    $ export VERSION="|scala_binary_version|-${TAG}" # note: |scala_binary_version| is the Scala build version
=======
    # note: |scala_binary_version| is the Scala build version
    $ export VERSION="|scala_binary_version|-${TAG}"
>>>>>>> 90ec70f55 (GEOMESA-3176 Docs - fix download links in install instructions)
<<<<<<< HEAD
<<<<<<< HEAD
>>>>>>> location-main
<<<<<<< HEAD
<<<<<<< HEAD
=======
>>>>>>> baa90e85a (GEOMESA-3176 Docs - fix download links in install instructions)
=======
>>>>>>> 8150bc0e65 (GEOMESA-3176 Docs - fix download links in install instructions)
=======
=======
>>>>>>> 0fbf9e83e (GEOMESA-3176 Docs - fix download links in install instructions)
>>>>>>> 4d9f87a514 (GEOMESA-3176 Docs - fix download links in install instructions)
=======
    # note: |scala_binary_version| is the Scala build version
    $ export VERSION="|scala_binary_version|-${TAG}"
>>>>>>> 15e998504 (GEOMESA-3176 Docs - fix download links in install instructions)
<<<<<<< HEAD
<<<<<<< HEAD
<<<<<<< HEAD
=======
>>>>>>> 6a26990f7 (GEOMESA-3176 Docs - fix download links in install instructions)
=======
>>>>>>> baa90e85a (GEOMESA-3176 Docs - fix download links in install instructions)
=======
=======
>>>>>>> 8cbe155de (GEOMESA-3176 Docs - fix download links in install instructions)
>>>>>>> 8150bc0e65 (GEOMESA-3176 Docs - fix download links in install instructions)
=======
=======
>>>>>>> 8cbe155de (GEOMESA-3176 Docs - fix download links in install instructions)
=======
>>>>>>> 0fbf9e83e (GEOMESA-3176 Docs - fix download links in install instructions)
>>>>>>> 4d9f87a514 (GEOMESA-3176 Docs - fix download links in install instructions)

Then download and extract the binary distribution:
<<<<<<< HEAD
<<<<<<< HEAD
<<<<<<< HEAD
<<<<<<< HEAD
<<<<<<< HEAD
=======
>>>>>>> e8cc4971c6 (Merge branch 'feature/postgis-fixes')
=======
>>>>>>> bdcaf0ab5e (GEOMESA-3176 Docs - fix download links in install instructions)
=======
=======
>>>>>>> db8d998aa (Merge branch 'feature/postgis-fixes')
>>>>>>> cb6bda89b6 (Merge branch 'feature/postgis-fixes')
=======
>>>>>>> 16b2e83f2 (GEOMESA-3176 Docs - fix download links in install instructions)
=======
>>>>>>> 10ade3dcd (GEOMESA-3176 Docs - fix download links in install instructions)
=======
=======
>>>>>>> 3be8d2a5a (Merge branch 'feature/postgis-fixes')
>>>>>>> 1b25d7ddb (Merge branch 'feature/postgis-fixes')

.. parsed-literal::

<<<<<<< HEAD
=======
<<<<<<< HEAD
  In the following examples, replace ``${TAG}`` with the corresponding GeoMesa version (e.g. |release_version|), and
  ``${VERSION}`` with the appropriate Scala plus GeoMesa versions (e.g. |scala_release_version|).
<<<<<<< HEAD
=======
>>>>>>> 3be8d2a5a4 (Merge branch 'feature/postgis-fixes')
=======
>>>>>>> 16b2e83f2 (GEOMESA-3176 Docs - fix download links in install instructions)
>>>>>>> 2aa923cc97 (GEOMESA-3176 Docs - fix download links in install instructions)

.. parsed-literal::

=======
>>>>>>> 10ade3dcd1 (GEOMESA-3176 Docs - fix download links in install instructions)
>>>>>>> location-main
    $ export TAG="|release_version|"
<<<<<<< HEAD
<<<<<<< HEAD
=======
>>>>>>> fdf0e4fe88 (GEOMESA-3176 Docs - fix download links in install instructions)
    $ export VERSION="|scala_binary_version|-${TAG}" # note: |scala_binary_version| is the Scala build version
=======
    # note: |scala_binary_version| is the Scala build version
    $ export VERSION="|scala_binary_version|-${TAG}"
>>>>>>> 90ec70f55 (GEOMESA-3176 Docs - fix download links in install instructions)
=======
<<<<<<< HEAD
<<<<<<< HEAD
>>>>>>> locationtech-main
=======
    # note: |scala_binary_version| is the Scala build version
    $ export VERSION="|scala_binary_version|-${TAG}"
>>>>>>> 15e998504 (GEOMESA-3176 Docs - fix download links in install instructions)
<<<<<<< HEAD
=======
    # note: |scala_binary_version| is the Scala build version
    $ export VERSION="|scala_binary_version|-${TAG}"
>>>>>>> 15e998504 (GEOMESA-3176 Docs - fix download links in install instructions)
>>>>>>> fdf0e4fe88 (GEOMESA-3176 Docs - fix download links in install instructions)

Then download and extract the binary distribution:
<<<<<<< HEAD
=======
>>>>>>> 16b2e83f2 (GEOMESA-3176 Docs - fix download links in install instructions)

=======
    # note: |scala_binary_version| is the Scala build version
    $ export VERSION="|scala_binary_version|-${TAG}"
>>>>>>> 15e998504 (GEOMESA-3176 Docs - fix download links in install instructions)

Then download and extract the binary distribution:
<<<<<<< HEAD
<<<<<<< HEAD
<<<<<<< HEAD
<<<<<<< HEAD

=======
>>>>>>> f0b9bd8121 (GEOMESA-3061 Converters - support bytes in Avro top-level union types (#2762))
.. note::

  In the following examples, replace ``${TAG}`` with the corresponding GeoMesa version (e.g. |release_version|), and
  ``${VERSION}`` with the appropriate Scala plus GeoMesa versions (e.g. |scala_release_version|).
<<<<<<< HEAD
=======
>>>>>>> 3be8d2a5a (Merge branch 'feature/postgis-fixes')
>>>>>>> 0ba49a2fd7 (GEOMESA-3176 Docs - fix download links in install instructions)
=======
>>>>>>> d845d7c1bd (GEOMESA-3254 Add Bloop build support)
>>>>>>> 7a84c9d22d (GEOMESA-3254 Add Bloop build support)
=======
<<<<<<< HEAD
>>>>>>> c738f63bd9 (GEOMESA-3254 Add Bloop build support)
=======
>>>>>>> 6d9a5b626c (GEOMESA-3061 Converters - support bytes in Avro top-level union types (#2762))
=======
>>>>>>> 10ade3dcd1 (GEOMESA-3176 Docs - fix download links in install instructions)
=======
=======
>>>>>>> c69897d7bd (Merge branch 'feature/postgis-fixes')
=======
>>>>>>> 16b2e83f2 (GEOMESA-3176 Docs - fix download links in install instructions)
>>>>>>> 93fa8c797f (GEOMESA-3176 Docs - fix download links in install instructions)
=======
=======
>>>>>>> da00c7bd68 (Merge branch 'feature/postgis-fixes')
=======
>>>>>>> 16b2e83f2 (GEOMESA-3176 Docs - fix download links in install instructions)
=======
=======
>>>>>>> 16b2e83f2 (GEOMESA-3176 Docs - fix download links in install instructions)
=======
=======
>>>>>>> 16b2e83f2 (GEOMESA-3176 Docs - fix download links in install instructions)

.. parsed-literal::

    $ export TAG="|release_version|"
    # note: |scala_binary_version| is the Scala build version
    $ export VERSION="|scala_binary_version|-${TAG}"

Then download and extract the binary distribution:
>>>>>>> baeb44a4a8 (GEOMESA-3176 Docs - fix download links in install instructions)

<<<<<<< HEAD
<<<<<<< HEAD
<<<<<<< HEAD
<<<<<<< HEAD
.. parsed-literal::

    $ export TAG="|release_version|"
    # note: |scala_binary_version| is the Scala build version
    $ export VERSION="|scala_binary_version|-${TAG}"

Then download and extract the binary distribution:
>>>>>>> baeb44a4a8 (GEOMESA-3176 Docs - fix download links in install instructions)

<<<<<<< HEAD
<<<<<<< HEAD
<<<<<<< HEAD
<<<<<<< HEAD
.. parsed-literal::

    $ export TAG="|release_version|"
    # note: |scala_binary_version| is the Scala build version
    $ export VERSION="|scala_binary_version|-${TAG}"

Then download and extract the binary distribution:
>>>>>>> 308738bcef (GEOMESA-3176 Docs - fix download links in install instructions)

<<<<<<< HEAD
<<<<<<< HEAD
<<<<<<< HEAD
<<<<<<< HEAD
<<<<<<< HEAD
<<<<<<< HEAD
<<<<<<< HEAD
>>>>>>> location-main
<<<<<<< HEAD
<<<<<<< HEAD
<<<<<<< HEAD
<<<<<<< HEAD
<<<<<<< HEAD
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
>>>>>>> 3dd99aed4 (GEOMESA-3061 Converters - support bytes in Avro top-level union types (#2762))
=======
>>>>>>> 4524373ac (GEOMESA-3061 Converters - support bytes in Avro top-level union types (#2762))
=======
>>>>>>> 4fbe39c62 (GEOMESA-3061 Converters - support bytes in Avro top-level union types (#2762))
=======
>>>>>>> 8150bc0e65 (GEOMESA-3176 Docs - fix download links in install instructions)
=======
=======
>>>>>>> 4d9f87a514 (GEOMESA-3176 Docs - fix download links in install instructions)
=======
>>>>>>> 5f428db97 (GEOMESA-3061 Converters - support bytes in Avro top-level union types (#2762))
>>>>>>> 6a2cd10c1c (GEOMESA-3061 Converters - support bytes in Avro top-level union types (#2762))
=======
=======
>>>>>>> bd3233180f (GEOMESA-3176 Docs - fix download links in install instructions)
=======
>>>>>>> 0c734cda2b (GEOMESA-3061 Converters - support bytes in Avro top-level union types (#2762))
=======
>>>>>>> 67e4c1354f (GEOMESA-3061 Converters - support bytes in Avro top-level union types (#2762))
=======
>>>>>>> 703374130f (GEOMESA-3176 Docs - fix download links in install instructions)
=======
>>>>>>> 5f428db97 (GEOMESA-3061 Converters - support bytes in Avro top-level union types (#2762))
=======
>>>>>>> 89bdd3013 (GEOMESA-3061 Converters - support bytes in Avro top-level union types (#2762))
<<<<<<< HEAD
>>>>>>> 8a6a96234b (GEOMESA-3061 Converters - support bytes in Avro top-level union types (#2762))
=======
=======
>>>>>>> 72bafaf54 (GEOMESA-3061 Converters - support bytes in Avro top-level union types (#2762))
<<<<<<< HEAD
>>>>>>> 0c734cda2b (GEOMESA-3061 Converters - support bytes in Avro top-level union types (#2762))
=======
=======
>>>>>>> 6d9a5b626 (GEOMESA-3061 Converters - support bytes in Avro top-level union types (#2762))
>>>>>>> 67e4c1354f (GEOMESA-3061 Converters - support bytes in Avro top-level union types (#2762))
<<<<<<< HEAD
=======
=======
>>>>>>> c1f99f4bcb (GEOMESA-3061 Converters - support bytes in Avro top-level union types (#2762))
=======
>>>>>>> 338d952d43 (GEOMESA-3061 Converters - support bytes in Avro top-level union types (#2762))
=======
>>>>>>> 9627a2de6a (GEOMESA-3061 Converters - support bytes in Avro top-level union types (#2762))
=======
>>>>>>> 76908c410a (GEOMESA-3061 Converters - support bytes in Avro top-level union types (#2762))
>>>>>>> location-main
=======
>>>>>>> 49a5a0454f (GEOMESA-3061 Converters - support bytes in Avro top-level union types (#2762))
=======
>>>>>>> b03141c1bb (GEOMESA-3061 Converters - support bytes in Avro top-level union types (#2762))
=======
>>>>>>> 49a5a0454f (GEOMESA-3061 Converters - support bytes in Avro top-level union types (#2762))
=======
>>>>>>> b03141c1bb (GEOMESA-3061 Converters - support bytes in Avro top-level union types (#2762))
.. note::

  In the following examples, replace ``${TAG}`` with the corresponding GeoMesa version (e.g. |release_version|), and
  ``${VERSION}`` with the appropriate Scala plus GeoMesa versions (e.g. |scala_release_version|).
<<<<<<< HEAD
<<<<<<< HEAD
<<<<<<< HEAD
<<<<<<< HEAD
<<<<<<< HEAD
<<<<<<< HEAD
<<<<<<< HEAD
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
>>>>>>> location-main
=======
>>>>>>> f9f6fde40b (GEOMESA-3061 Converters - support bytes in Avro top-level union types (#2762))
=======
>>>>>>> 6a2cd10c1c (GEOMESA-3061 Converters - support bytes in Avro top-level union types (#2762))
=======
>>>>>>> 8a6a96234b (GEOMESA-3061 Converters - support bytes in Avro top-level union types (#2762))
=======
>>>>>>> 0c734cda2b (GEOMESA-3061 Converters - support bytes in Avro top-level union types (#2762))
=======
>>>>>>> cb6bda89b6 (Merge branch 'feature/postgis-fixes')
=======
>>>>>>> 67e4c1354f (GEOMESA-3061 Converters - support bytes in Avro top-level union types (#2762))
=======
>>>>>>> 3be8d2a5a (Merge branch 'feature/postgis-fixes')
=======
=======
>>>>>>> 16b2e83f2 (GEOMESA-3176 Docs - fix download links in install instructions)
<<<<<<< HEAD
<<<<<<< HEAD
>>>>>>> 7813a31aa (GEOMESA-3176 Docs - fix download links in install instructions)
=======
=======
>>>>>>> 3be8d2a5a (Merge branch 'feature/postgis-fixes')
>>>>>>> e8cc4971c6 (Merge branch 'feature/postgis-fixes')
=======
>>>>>>> 2aa923cc9 (GEOMESA-3176 Docs - fix download links in install instructions)
=======
=======
>>>>>>> 3be8d2a5a (Merge branch 'feature/postgis-fixes')
>>>>>>> db8d998aa (Merge branch 'feature/postgis-fixes')
<<<<<<< HEAD
>>>>>>> cb6bda89b6 (Merge branch 'feature/postgis-fixes')
=======
=======
>>>>>>> f561a0faec (GEOMESA-3176 Docs - fix download links in install instructions)
>>>>>>> locatelli-main
    $ export VERSION="|scala_binary_version|-${TAG}" # note: |scala_binary_version| is the Scala build version
=======
    # note: |scala_binary_version| is the Scala build version
    $ export VERSION="|scala_binary_version|-${TAG}"
>>>>>>> 90ec70f55 (GEOMESA-3176 Docs - fix download links in install instructions)
<<<<<<< HEAD
<<<<<<< HEAD
<<<<<<< HEAD
<<<<<<< HEAD
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
>>>>>>> 64a722e2a7 (GEOMESA-3176 Docs - fix download links in install instructions)
=======
>>>>>>> 341ef96c9a (GEOMESA-3176 Docs - fix download links in install instructions)
=======
>>>>>>> 91879d2d87 (GEOMESA-3176 Docs - fix download links in install instructions)
=======
>>>>>>> 17c1f8a18c (GEOMESA-3176 Docs - fix download links in install instructions)
=======
>>>>>>> aff2787fc2 (GEOMESA-3176 Docs - fix download links in install instructions)
=======
<<<<<<< HEAD
>>>>>>> e5cf96e863 (GEOMESA-3176 Docs - fix download links in install instructions)
=======
>>>>>>> b47097b7bb (GEOMESA-3176 Docs - fix download links in install instructions)
=======
=======
>>>>>>> 17c1f8a18c (GEOMESA-3176 Docs - fix download links in install instructions)
>>>>>>> 95f020af8c (GEOMESA-3176 Docs - fix download links in install instructions)
=======
=======
>>>>>>> 341ef96c9a (GEOMESA-3176 Docs - fix download links in install instructions)
    # note: |scala_binary_version| is the Scala build version
    $ export VERSION="|scala_binary_version|-${TAG}"
>>>>>>> 15e998504 (GEOMESA-3176 Docs - fix download links in install instructions)
<<<<<<< HEAD
<<<<<<< HEAD
<<<<<<< HEAD
<<<<<<< HEAD
<<<<<<< HEAD
<<<<<<< HEAD
=======
>>>>>>> 95f020af8c (GEOMESA-3176 Docs - fix download links in install instructions)
=======
>>>>>>> 341ef96c9a (GEOMESA-3176 Docs - fix download links in install instructions)
=======
>>>>>>> 3b4f3da2e1 (GEOMESA-3176 Docs - fix download links in install instructions)
=======
>>>>>>> 17c1f8a18c (GEOMESA-3176 Docs - fix download links in install instructions)
<<<<<<< HEAD
<<<<<<< HEAD
=======
>>>>>>> 4492950388 (GEOMESA-3176 Docs - fix download links in install instructions)
=======
>>>>>>> aff2787fc2 (GEOMESA-3176 Docs - fix download links in install instructions)
<<<<<<< HEAD
<<<<<<< HEAD
=======
>>>>>>> 13325d17c4 (GEOMESA-3176 Docs - fix download links in install instructions)
=======
>>>>>>> e5cf96e863 (GEOMESA-3176 Docs - fix download links in install instructions)
=======
=======
>>>>>>> 3b4f3da2e1 (GEOMESA-3176 Docs - fix download links in install instructions)
>>>>>>> b47097b7bb (GEOMESA-3176 Docs - fix download links in install instructions)
=======
>>>>>>> 95f020af8c (GEOMESA-3176 Docs - fix download links in install instructions)
=======
=======
>>>>>>> 4492950388 (GEOMESA-3176 Docs - fix download links in install instructions)
>>>>>>> 64a722e2a7 (GEOMESA-3176 Docs - fix download links in install instructions)
=======
>>>>>>> 341ef96c9a (GEOMESA-3176 Docs - fix download links in install instructions)
=======
=======
>>>>>>> b4c1ea8881 (GEOMESA-3176 Docs - fix download links in install instructions)
>>>>>>> 91879d2d87 (GEOMESA-3176 Docs - fix download links in install instructions)
=======
>>>>>>> b4c1ea8881 (GEOMESA-3176 Docs - fix download links in install instructions)
=======
=======
    # note: |scala_binary_version| is the Scala build version
    $ export VERSION="|scala_binary_version|-${TAG}"
>>>>>>> 15e998504 (GEOMESA-3176 Docs - fix download links in install instructions)
>>>>>>> fdf0e4fe88 (GEOMESA-3176 Docs - fix download links in install instructions)

Then download and extract the binary distribution:
<<<<<<< HEAD
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
>>>>>>> f561a0faec (GEOMESA-3176 Docs - fix download links in install instructions)
=======
>>>>>>> 1f19a648d1 (GEOMESA-3176 Docs - fix download links in install instructions)
=======
>>>>>>> 731987cbc8 (GEOMESA-3176 Docs - fix download links in install instructions)
=======
>>>>>>> 4fd46f4f99 (GEOMESA-3176 Docs - fix download links in install instructions)
=======
=======
>>>>>>> 1f19a648d1 (GEOMESA-3176 Docs - fix download links in install instructions)
>>>>>>> fbb5e06c6a (GEOMESA-3176 Docs - fix download links in install instructions)
=======
<<<<<<< HEAD
>>>>>>> 16b2e83f22 (GEOMESA-3176 Docs - fix download links in install instructions)
=======
=======
>>>>>>> 15e9985047 (GEOMESA-3176 Docs - fix download links in install instructions)
    # note: |scala_binary_version| is the Scala build version
    $ export VERSION="|scala_binary_version|-${TAG}"

<<<<<<< HEAD
Then download and extract the binary distribution:
<<<<<<< HEAD
=======
>>>>>>> 16b2e83f2 (GEOMESA-3176 Docs - fix download links in install instructions)
<<<<<<< HEAD
>>>>>>> 90ec70f559 (GEOMESA-3176 Docs - fix download links in install instructions)
=======
>>>>>>> 15e9985047 (GEOMESA-3176 Docs - fix download links in install instructions)
=======
>>>>>>> 10ade3dcd1 (GEOMESA-3176 Docs - fix download links in install instructions)
=======
=======
>>>>>>> 3be8d2a5a (Merge branch 'feature/postgis-fixes')
>>>>>>> 1b25d7ddb4 (Merge branch 'feature/postgis-fixes')
=======
=======
>>>>>>> e944f1c88b (Merge branch 'feature/postgis-fixes')
=======
>>>>>>> 235bc2820d (GEOMESA-3176 Docs - fix download links in install instructions)
=======
>>>>>>> 26e5afc4ea (Merge branch 'feature/postgis-fixes')
=======
>>>>>>> 63a045a753 (GEOMESA-3254 Add Bloop build support)
=======
>>>>>>> 93fa8c797f (GEOMESA-3176 Docs - fix download links in install instructions)
=======
>>>>>>> c69897d7bd (Merge branch 'feature/postgis-fixes')
=======
>>>>>>> 3be8d2a5a (Merge branch 'feature/postgis-fixes')
=======
>>>>>>> 7813a31aa (GEOMESA-3176 Docs - fix download links in install instructions)
<<<<<<< HEAD
>>>>>>> 71c56e6b77 (GEOMESA-3176 Docs - fix download links in install instructions)
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
>>>>>>> cb6bda89b6 (Merge branch 'feature/postgis-fixes')
=======
>>>>>>> 09d87762c5 (GEOMESA-3254 Add Bloop build support)
=======
>>>>>>> 703374130f (GEOMESA-3176 Docs - fix download links in install instructions)
=======
>>>>>>> 699117eca9 (Merge branch 'feature/postgis-fixes')
=======
>>>>>>> 3be8d2a5a (Merge branch 'feature/postgis-fixes')
=======
>>>>>>> 2aa923cc9 (GEOMESA-3176 Docs - fix download links in install instructions)
<<<<<<< HEAD
>>>>>>> bdcaf0ab5e (GEOMESA-3176 Docs - fix download links in install instructions)
<<<<<<< HEAD
>>>>>>> 235bc2820d (GEOMESA-3176 Docs - fix download links in install instructions)
=======
=======
=======
=======
>>>>>>> 3be8d2a5a (Merge branch 'feature/postgis-fixes')
>>>>>>> db8d998aa (Merge branch 'feature/postgis-fixes')
<<<<<<< HEAD
>>>>>>> cb6bda89b6 (Merge branch 'feature/postgis-fixes')
<<<<<<< HEAD
>>>>>>> 26e5afc4ea (Merge branch 'feature/postgis-fixes')
=======
=======
=======
>>>>>>> d845d7c1b (GEOMESA-3254 Add Bloop build support)
>>>>>>> 09d87762c5 (GEOMESA-3254 Add Bloop build support)
>>>>>>> 63a045a753 (GEOMESA-3254 Add Bloop build support)

.. parsed-literal::

    $ export TAG="|release_version|"
<<<<<<< HEAD
<<<<<<< HEAD
<<<<<<< HEAD
<<<<<<< HEAD
<<<<<<< HEAD
<<<<<<< HEAD
<<<<<<< HEAD
=======
>>>>>>> 6a26990f7 (GEOMESA-3176 Docs - fix download links in install instructions)
=======
>>>>>>> baa90e85a (GEOMESA-3176 Docs - fix download links in install instructions)
=======
=======
>>>>>>> 8cbe155de (GEOMESA-3176 Docs - fix download links in install instructions)
>>>>>>> 8150bc0e65 (GEOMESA-3176 Docs - fix download links in install instructions)
=======
=======
>>>>>>> 09d87762c5 (GEOMESA-3254 Add Bloop build support)
=======
>>>>>>> 8cbe155de (GEOMESA-3176 Docs - fix download links in install instructions)
=======
>>>>>>> 0fbf9e83e (GEOMESA-3176 Docs - fix download links in install instructions)
>>>>>>> 4d9f87a514 (GEOMESA-3176 Docs - fix download links in install instructions)
    $ export VERSION="|scala_binary_version|-${TAG}" # note: |scala_binary_version| is the Scala build version
=======
    # note: |scala_binary_version| is the Scala build version
    $ export VERSION="|scala_binary_version|-${TAG}"
>>>>>>> 90ec70f55 (GEOMESA-3176 Docs - fix download links in install instructions)
<<<<<<< HEAD
<<<<<<< HEAD
<<<<<<< HEAD
<<<<<<< HEAD
=======
>>>>>>> baa90e85a (GEOMESA-3176 Docs - fix download links in install instructions)
=======
>>>>>>> 8150bc0e65 (GEOMESA-3176 Docs - fix download links in install instructions)
=======
=======
>>>>>>> 0fbf9e83e (GEOMESA-3176 Docs - fix download links in install instructions)
>>>>>>> 4d9f87a514 (GEOMESA-3176 Docs - fix download links in install instructions)
=======
    # note: |scala_binary_version| is the Scala build version
    $ export VERSION="|scala_binary_version|-${TAG}"
>>>>>>> 15e998504 (GEOMESA-3176 Docs - fix download links in install instructions)
<<<<<<< HEAD
<<<<<<< HEAD
<<<<<<< HEAD
=======
>>>>>>> 6a26990f7 (GEOMESA-3176 Docs - fix download links in install instructions)
=======
>>>>>>> baa90e85a (GEOMESA-3176 Docs - fix download links in install instructions)
=======
=======
>>>>>>> 8cbe155de (GEOMESA-3176 Docs - fix download links in install instructions)
>>>>>>> 8150bc0e65 (GEOMESA-3176 Docs - fix download links in install instructions)
=======
=======
>>>>>>> 8cbe155de (GEOMESA-3176 Docs - fix download links in install instructions)
=======
>>>>>>> 0fbf9e83e (GEOMESA-3176 Docs - fix download links in install instructions)
>>>>>>> 4d9f87a514 (GEOMESA-3176 Docs - fix download links in install instructions)

Then download and extract the binary distribution:
<<<<<<< HEAD
<<<<<<< HEAD
<<<<<<< HEAD
<<<<<<< HEAD
<<<<<<< HEAD
=======
>>>>>>> e8cc4971c6 (Merge branch 'feature/postgis-fixes')
=======
>>>>>>> bdcaf0ab5e (GEOMESA-3176 Docs - fix download links in install instructions)
=======
=======
>>>>>>> db8d998aa (Merge branch 'feature/postgis-fixes')
>>>>>>> cb6bda89b6 (Merge branch 'feature/postgis-fixes')
=======
>>>>>>> 16b2e83f2 (GEOMESA-3176 Docs - fix download links in install instructions)
=======
>>>>>>> 10ade3dcd (GEOMESA-3176 Docs - fix download links in install instructions)
=======
=======
>>>>>>> 3be8d2a5a (Merge branch 'feature/postgis-fixes')
>>>>>>> 1b25d7ddb (Merge branch 'feature/postgis-fixes')

.. parsed-literal::

<<<<<<< HEAD
  In the following examples, replace ``${TAG}`` with the corresponding GeoMesa version (e.g. |release_version|), and
  ``${VERSION}`` with the appropriate Scala plus GeoMesa versions (e.g. |scala_release_version|).
<<<<<<< HEAD
=======
>>>>>>> 3be8d2a5a4 (Merge branch 'feature/postgis-fixes')
=======
>>>>>>> 16b2e83f2 (GEOMESA-3176 Docs - fix download links in install instructions)
>>>>>>> 2aa923cc97 (GEOMESA-3176 Docs - fix download links in install instructions)

.. parsed-literal::

=======
>>>>>>> 10ade3dcd1 (GEOMESA-3176 Docs - fix download links in install instructions)
    $ export TAG="|release_version|"
<<<<<<< HEAD
<<<<<<< HEAD
=======
=======
>>>>>>> d845d7c1bd (GEOMESA-3254 Add Bloop build support)
>>>>>>> f1532f2313 (GEOMESA-3254 Add Bloop build support)
<<<<<<< HEAD
=======
>>>>>>> 31ac28fff4 (GEOMESA-3176 Docs - fix download links in install instructions)
=======
>>>>>>> 26bf3ffae4 (GEOMESA-3176 Docs - fix download links in install instructions)
=======
=======
>>>>>>> 8cbe155de6 (GEOMESA-3176 Docs - fix download links in install instructions)
>>>>>>> 9b83a71a1e (GEOMESA-3176 Docs - fix download links in install instructions)
=======
>>>>>>> 1ce7179e65 (GEOMESA-3176 Docs - fix download links in install instructions)
=======
<<<<<<< HEAD
=======
>>>>>>> 16b2e83f2 (GEOMESA-3176 Docs - fix download links in install instructions)
<<<<<<< HEAD
>>>>>>> 90ec70f559 (GEOMESA-3176 Docs - fix download links in install instructions)
=======
>>>>>>> 15e9985047 (GEOMESA-3176 Docs - fix download links in install instructions)
=======
>>>>>>> 10ade3dcd1 (GEOMESA-3176 Docs - fix download links in install instructions)
=======
=======
>>>>>>> 3be8d2a5a (Merge branch 'feature/postgis-fixes')
>>>>>>> 1b25d7ddb4 (Merge branch 'feature/postgis-fixes')
=======
=======
>>>>>>> e944f1c88b (Merge branch 'feature/postgis-fixes')
=======
>>>>>>> 235bc2820d (GEOMESA-3176 Docs - fix download links in install instructions)
=======
>>>>>>> 26e5afc4ea (Merge branch 'feature/postgis-fixes')
=======
>>>>>>> 63a045a753 (GEOMESA-3254 Add Bloop build support)
=======
>>>>>>> 93fa8c797f (GEOMESA-3176 Docs - fix download links in install instructions)
=======
>>>>>>> c69897d7bd (Merge branch 'feature/postgis-fixes')
=======
>>>>>>> 3be8d2a5a (Merge branch 'feature/postgis-fixes')
=======
>>>>>>> 7813a31aa (GEOMESA-3176 Docs - fix download links in install instructions)
<<<<<<< HEAD
>>>>>>> 71c56e6b77 (GEOMESA-3176 Docs - fix download links in install instructions)
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
>>>>>>> cb6bda89b6 (Merge branch 'feature/postgis-fixes')
=======
>>>>>>> 09d87762c5 (GEOMESA-3254 Add Bloop build support)
=======
>>>>>>> 703374130f (GEOMESA-3176 Docs - fix download links in install instructions)
=======
>>>>>>> 699117eca9 (Merge branch 'feature/postgis-fixes')
=======
>>>>>>> 3be8d2a5a (Merge branch 'feature/postgis-fixes')
=======
>>>>>>> 2aa923cc9 (GEOMESA-3176 Docs - fix download links in install instructions)
<<<<<<< HEAD
>>>>>>> bdcaf0ab5e (GEOMESA-3176 Docs - fix download links in install instructions)
<<<<<<< HEAD
>>>>>>> 235bc2820d (GEOMESA-3176 Docs - fix download links in install instructions)
=======
=======
=======
=======
>>>>>>> 3be8d2a5a (Merge branch 'feature/postgis-fixes')
>>>>>>> db8d998aa (Merge branch 'feature/postgis-fixes')
<<<<<<< HEAD
>>>>>>> cb6bda89b6 (Merge branch 'feature/postgis-fixes')
<<<<<<< HEAD
>>>>>>> 26e5afc4ea (Merge branch 'feature/postgis-fixes')
=======
=======
=======
>>>>>>> d845d7c1b (GEOMESA-3254 Add Bloop build support)
>>>>>>> 09d87762c5 (GEOMESA-3254 Add Bloop build support)
>>>>>>> 63a045a753 (GEOMESA-3254 Add Bloop build support)

.. parsed-literal::

    $ export TAG="|release_version|"
<<<<<<< HEAD
<<<<<<< HEAD
<<<<<<< HEAD
<<<<<<< HEAD
<<<<<<< HEAD
<<<<<<< HEAD
<<<<<<< HEAD
=======
>>>>>>> 6a26990f7 (GEOMESA-3176 Docs - fix download links in install instructions)
=======
>>>>>>> baa90e85a (GEOMESA-3176 Docs - fix download links in install instructions)
=======
=======
>>>>>>> 8cbe155de (GEOMESA-3176 Docs - fix download links in install instructions)
>>>>>>> 8150bc0e65 (GEOMESA-3176 Docs - fix download links in install instructions)
=======
=======
>>>>>>> 09d87762c5 (GEOMESA-3254 Add Bloop build support)
=======
>>>>>>> 8cbe155de (GEOMESA-3176 Docs - fix download links in install instructions)
=======
>>>>>>> 0fbf9e83e (GEOMESA-3176 Docs - fix download links in install instructions)
>>>>>>> 4d9f87a514 (GEOMESA-3176 Docs - fix download links in install instructions)
    $ export VERSION="|scala_binary_version|-${TAG}" # note: |scala_binary_version| is the Scala build version
=======
    # note: |scala_binary_version| is the Scala build version
    $ export VERSION="|scala_binary_version|-${TAG}"
>>>>>>> 90ec70f55 (GEOMESA-3176 Docs - fix download links in install instructions)
<<<<<<< HEAD
<<<<<<< HEAD
>>>>>>> location-main
<<<<<<< HEAD
<<<<<<< HEAD
=======
>>>>>>> baa90e85a (GEOMESA-3176 Docs - fix download links in install instructions)
=======
>>>>>>> 8150bc0e65 (GEOMESA-3176 Docs - fix download links in install instructions)
=======
=======
>>>>>>> 0fbf9e83e (GEOMESA-3176 Docs - fix download links in install instructions)
>>>>>>> 4d9f87a514 (GEOMESA-3176 Docs - fix download links in install instructions)
=======
    # note: |scala_binary_version| is the Scala build version
    $ export VERSION="|scala_binary_version|-${TAG}"
>>>>>>> 15e998504 (GEOMESA-3176 Docs - fix download links in install instructions)
<<<<<<< HEAD
<<<<<<< HEAD
<<<<<<< HEAD
=======
>>>>>>> 6a26990f7 (GEOMESA-3176 Docs - fix download links in install instructions)
=======
>>>>>>> baa90e85a (GEOMESA-3176 Docs - fix download links in install instructions)
=======
=======
>>>>>>> 8cbe155de (GEOMESA-3176 Docs - fix download links in install instructions)
>>>>>>> 8150bc0e65 (GEOMESA-3176 Docs - fix download links in install instructions)
=======
=======
>>>>>>> 8cbe155de (GEOMESA-3176 Docs - fix download links in install instructions)
=======
>>>>>>> 0fbf9e83e (GEOMESA-3176 Docs - fix download links in install instructions)
>>>>>>> 4d9f87a514 (GEOMESA-3176 Docs - fix download links in install instructions)

Then download and extract the binary distribution:
<<<<<<< HEAD
<<<<<<< HEAD
<<<<<<< HEAD
<<<<<<< HEAD
<<<<<<< HEAD
=======
>>>>>>> e8cc4971c6 (Merge branch 'feature/postgis-fixes')
=======
>>>>>>> bdcaf0ab5e (GEOMESA-3176 Docs - fix download links in install instructions)
=======
=======
>>>>>>> db8d998aa (Merge branch 'feature/postgis-fixes')
>>>>>>> cb6bda89b6 (Merge branch 'feature/postgis-fixes')
=======
>>>>>>> 16b2e83f2 (GEOMESA-3176 Docs - fix download links in install instructions)
=======
>>>>>>> 10ade3dcd (GEOMESA-3176 Docs - fix download links in install instructions)
=======
=======
>>>>>>> 3be8d2a5a (Merge branch 'feature/postgis-fixes')
>>>>>>> 1b25d7ddb (Merge branch 'feature/postgis-fixes')

.. parsed-literal::

<<<<<<< HEAD
=======
<<<<<<< HEAD
  In the following examples, replace ``${TAG}`` with the corresponding GeoMesa version (e.g. |release_version|), and
  ``${VERSION}`` with the appropriate Scala plus GeoMesa versions (e.g. |scala_release_version|).
<<<<<<< HEAD
=======
>>>>>>> 3be8d2a5a4 (Merge branch 'feature/postgis-fixes')
=======
>>>>>>> 16b2e83f2 (GEOMESA-3176 Docs - fix download links in install instructions)
>>>>>>> 2aa923cc97 (GEOMESA-3176 Docs - fix download links in install instructions)

.. parsed-literal::

=======
>>>>>>> 10ade3dcd1 (GEOMESA-3176 Docs - fix download links in install instructions)
>>>>>>> location-main
    $ export TAG="|release_version|"
<<<<<<< HEAD
<<<<<<< HEAD
=======
>>>>>>> fdf0e4fe88 (GEOMESA-3176 Docs - fix download links in install instructions)
    $ export VERSION="|scala_binary_version|-${TAG}" # note: |scala_binary_version| is the Scala build version
=======
    # note: |scala_binary_version| is the Scala build version
    $ export VERSION="|scala_binary_version|-${TAG}"
>>>>>>> 90ec70f55 (GEOMESA-3176 Docs - fix download links in install instructions)
=======
<<<<<<< HEAD
<<<<<<< HEAD
>>>>>>> locationtech-main
=======
    # note: |scala_binary_version| is the Scala build version
    $ export VERSION="|scala_binary_version|-${TAG}"
>>>>>>> 15e998504 (GEOMESA-3176 Docs - fix download links in install instructions)
<<<<<<< HEAD
=======
    # note: |scala_binary_version| is the Scala build version
    $ export VERSION="|scala_binary_version|-${TAG}"
>>>>>>> 15e998504 (GEOMESA-3176 Docs - fix download links in install instructions)
>>>>>>> fdf0e4fe88 (GEOMESA-3176 Docs - fix download links in install instructions)

Then download and extract the binary distribution:
<<<<<<< HEAD
=======
>>>>>>> 16b2e83f2 (GEOMESA-3176 Docs - fix download links in install instructions)

=======
    # note: |scala_binary_version| is the Scala build version
    $ export VERSION="|scala_binary_version|-${TAG}"
>>>>>>> 15e998504 (GEOMESA-3176 Docs - fix download links in install instructions)

Then download and extract the binary distribution:
<<<<<<< HEAD
<<<<<<< HEAD
<<<<<<< HEAD
<<<<<<< HEAD

=======
>>>>>>> f0b9bd8121 (GEOMESA-3061 Converters - support bytes in Avro top-level union types (#2762))
.. note::

  In the following examples, replace ``${TAG}`` with the corresponding GeoMesa version (e.g. |release_version|), and
  ``${VERSION}`` with the appropriate Scala plus GeoMesa versions (e.g. |scala_release_version|).
<<<<<<< HEAD
=======
>>>>>>> 3be8d2a5a (Merge branch 'feature/postgis-fixes')
>>>>>>> 0ba49a2fd7 (GEOMESA-3176 Docs - fix download links in install instructions)
=======
>>>>>>> d845d7c1bd (GEOMESA-3254 Add Bloop build support)
>>>>>>> 7a84c9d22d (GEOMESA-3254 Add Bloop build support)
=======
<<<<<<< HEAD
>>>>>>> c738f63bd9 (GEOMESA-3254 Add Bloop build support)
=======
>>>>>>> 6d9a5b626c (GEOMESA-3061 Converters - support bytes in Avro top-level union types (#2762))
=======
>>>>>>> 10ade3dcd1 (GEOMESA-3176 Docs - fix download links in install instructions)
=======
=======
>>>>>>> c69897d7bd (Merge branch 'feature/postgis-fixes')
=======
>>>>>>> 16b2e83f2 (GEOMESA-3176 Docs - fix download links in install instructions)
>>>>>>> 93fa8c797f (GEOMESA-3176 Docs - fix download links in install instructions)
=======
=======
>>>>>>> da00c7bd68 (Merge branch 'feature/postgis-fixes')
=======
>>>>>>> 16b2e83f2 (GEOMESA-3176 Docs - fix download links in install instructions)
=======
=======
>>>>>>> 16b2e83f2 (GEOMESA-3176 Docs - fix download links in install instructions)
=======
=======
>>>>>>> 16b2e83f2 (GEOMESA-3176 Docs - fix download links in install instructions)

.. parsed-literal::

    $ export TAG="|release_version|"
    # note: |scala_binary_version| is the Scala build version
    $ export VERSION="|scala_binary_version|-${TAG}"

Then download and extract the binary distribution:
>>>>>>> baeb44a4a8 (GEOMESA-3176 Docs - fix download links in install instructions)

<<<<<<< HEAD
<<<<<<< HEAD
<<<<<<< HEAD
<<<<<<< HEAD
.. parsed-literal::

    $ export TAG="|release_version|"
    # note: |scala_binary_version| is the Scala build version
    $ export VERSION="|scala_binary_version|-${TAG}"

Then download and extract the binary distribution:
>>>>>>> baeb44a4a8 (GEOMESA-3176 Docs - fix download links in install instructions)

<<<<<<< HEAD
<<<<<<< HEAD
<<<<<<< HEAD
<<<<<<< HEAD
.. parsed-literal::

    $ export TAG="|release_version|"
    # note: |scala_binary_version| is the Scala build version
    $ export VERSION="|scala_binary_version|-${TAG}"

Then download and extract the binary distribution:
>>>>>>> 308738bcef (GEOMESA-3176 Docs - fix download links in install instructions)

<<<<<<< HEAD
<<<<<<< HEAD
<<<<<<< HEAD
<<<<<<< HEAD
<<<<<<< HEAD
<<<<<<< HEAD
<<<<<<< HEAD
>>>>>>> location-main
<<<<<<< HEAD
<<<<<<< HEAD
<<<<<<< HEAD
<<<<<<< HEAD
<<<<<<< HEAD
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
>>>>>>> 3dd99aed4 (GEOMESA-3061 Converters - support bytes in Avro top-level union types (#2762))
=======
>>>>>>> 4524373ac (GEOMESA-3061 Converters - support bytes in Avro top-level union types (#2762))
=======
>>>>>>> 4fbe39c62 (GEOMESA-3061 Converters - support bytes in Avro top-level union types (#2762))
=======
>>>>>>> 8150bc0e65 (GEOMESA-3176 Docs - fix download links in install instructions)
=======
=======
>>>>>>> 4d9f87a514 (GEOMESA-3176 Docs - fix download links in install instructions)
=======
>>>>>>> 5f428db97 (GEOMESA-3061 Converters - support bytes in Avro top-level union types (#2762))
>>>>>>> 6a2cd10c1c (GEOMESA-3061 Converters - support bytes in Avro top-level union types (#2762))
=======
=======
>>>>>>> bd3233180f (GEOMESA-3176 Docs - fix download links in install instructions)
=======
>>>>>>> 0c734cda2b (GEOMESA-3061 Converters - support bytes in Avro top-level union types (#2762))
=======
>>>>>>> 67e4c1354f (GEOMESA-3061 Converters - support bytes in Avro top-level union types (#2762))
=======
>>>>>>> 703374130f (GEOMESA-3176 Docs - fix download links in install instructions)
=======
>>>>>>> 5f428db97 (GEOMESA-3061 Converters - support bytes in Avro top-level union types (#2762))
=======
>>>>>>> 89bdd3013 (GEOMESA-3061 Converters - support bytes in Avro top-level union types (#2762))
<<<<<<< HEAD
>>>>>>> 8a6a96234b (GEOMESA-3061 Converters - support bytes in Avro top-level union types (#2762))
=======
=======
>>>>>>> 72bafaf54 (GEOMESA-3061 Converters - support bytes in Avro top-level union types (#2762))
<<<<<<< HEAD
>>>>>>> 0c734cda2b (GEOMESA-3061 Converters - support bytes in Avro top-level union types (#2762))
=======
=======
>>>>>>> 6d9a5b626 (GEOMESA-3061 Converters - support bytes in Avro top-level union types (#2762))
>>>>>>> 67e4c1354f (GEOMESA-3061 Converters - support bytes in Avro top-level union types (#2762))
<<<<<<< HEAD
=======
=======
>>>>>>> c1f99f4bcb (GEOMESA-3061 Converters - support bytes in Avro top-level union types (#2762))
=======
>>>>>>> 338d952d43 (GEOMESA-3061 Converters - support bytes in Avro top-level union types (#2762))
=======
>>>>>>> 9627a2de6a (GEOMESA-3061 Converters - support bytes in Avro top-level union types (#2762))
=======
>>>>>>> 76908c410a (GEOMESA-3061 Converters - support bytes in Avro top-level union types (#2762))
>>>>>>> location-main
=======
>>>>>>> 49a5a0454f (GEOMESA-3061 Converters - support bytes in Avro top-level union types (#2762))
=======
>>>>>>> b03141c1bb (GEOMESA-3061 Converters - support bytes in Avro top-level union types (#2762))
=======
>>>>>>> 49a5a0454f (GEOMESA-3061 Converters - support bytes in Avro top-level union types (#2762))
=======
>>>>>>> b03141c1bb (GEOMESA-3061 Converters - support bytes in Avro top-level union types (#2762))
.. note::

  In the following examples, replace ``${TAG}`` with the corresponding GeoMesa version (e.g. |release_version|), and
  ``${VERSION}`` with the appropriate Scala plus GeoMesa versions (e.g. |scala_release_version|).
<<<<<<< HEAD
<<<<<<< HEAD
<<<<<<< HEAD
<<<<<<< HEAD
<<<<<<< HEAD
<<<<<<< HEAD
<<<<<<< HEAD
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
>>>>>>> location-main
=======
>>>>>>> f9f6fde40b (GEOMESA-3061 Converters - support bytes in Avro top-level union types (#2762))
=======
>>>>>>> 6a2cd10c1c (GEOMESA-3061 Converters - support bytes in Avro top-level union types (#2762))
=======
>>>>>>> 8a6a96234b (GEOMESA-3061 Converters - support bytes in Avro top-level union types (#2762))
=======
>>>>>>> 0c734cda2b (GEOMESA-3061 Converters - support bytes in Avro top-level union types (#2762))
=======
>>>>>>> cb6bda89b6 (Merge branch 'feature/postgis-fixes')
=======
>>>>>>> 67e4c1354f (GEOMESA-3061 Converters - support bytes in Avro top-level union types (#2762))
=======
>>>>>>> 3be8d2a5a (Merge branch 'feature/postgis-fixes')
=======
=======
>>>>>>> 16b2e83f2 (GEOMESA-3176 Docs - fix download links in install instructions)
<<<<<<< HEAD
<<<<<<< HEAD
>>>>>>> 7813a31aa (GEOMESA-3176 Docs - fix download links in install instructions)
=======
=======
>>>>>>> 3be8d2a5a (Merge branch 'feature/postgis-fixes')
>>>>>>> e8cc4971c6 (Merge branch 'feature/postgis-fixes')
=======
>>>>>>> 2aa923cc9 (GEOMESA-3176 Docs - fix download links in install instructions)
=======
=======
>>>>>>> 3be8d2a5a (Merge branch 'feature/postgis-fixes')
>>>>>>> db8d998aa (Merge branch 'feature/postgis-fixes')
<<<<<<< HEAD
>>>>>>> cb6bda89b6 (Merge branch 'feature/postgis-fixes')
=======
=======
>>>>>>> f561a0faec (GEOMESA-3176 Docs - fix download links in install instructions)
>>>>>>> locatelli-main
    $ export VERSION="|scala_binary_version|-${TAG}" # note: |scala_binary_version| is the Scala build version
=======
    # note: |scala_binary_version| is the Scala build version
    $ export VERSION="|scala_binary_version|-${TAG}"
>>>>>>> 90ec70f55 (GEOMESA-3176 Docs - fix download links in install instructions)
<<<<<<< HEAD
<<<<<<< HEAD
<<<<<<< HEAD
<<<<<<< HEAD
<<<<<<< HEAD
<<<<<<< HEAD
=======
>>>>>>> 17c1f8a18c (GEOMESA-3176 Docs - fix download links in install instructions)
=======
>>>>>>> aff2787fc2 (GEOMESA-3176 Docs - fix download links in install instructions)
=======
    # note: |scala_binary_version| is the Scala build version
    $ export VERSION="|scala_binary_version|-${TAG}"
>>>>>>> 15e998504 (GEOMESA-3176 Docs - fix download links in install instructions)
<<<<<<< HEAD
<<<<<<< HEAD
=======
>>>>>>> 3b4f3da2e1 (GEOMESA-3176 Docs - fix download links in install instructions)
=======
>>>>>>> 17c1f8a18c (GEOMESA-3176 Docs - fix download links in install instructions)
=======
>>>>>>> 4492950388 (GEOMESA-3176 Docs - fix download links in install instructions)
=======
>>>>>>> aff2787fc2 (GEOMESA-3176 Docs - fix download links in install instructions)
=======
>>>>>>> b4c1ea8881 (GEOMESA-3176 Docs - fix download links in install instructions)

Then download and extract the binary distribution:
<<<<<<< HEAD
<<<<<<< HEAD
<<<<<<< HEAD
<<<<<<< HEAD
<<<<<<< HEAD
<<<<<<< HEAD
=======
>>>>>>> 1f19a648d1 (GEOMESA-3176 Docs - fix download links in install instructions)
=======
<<<<<<< HEAD
>>>>>>> 16b2e83f22 (GEOMESA-3176 Docs - fix download links in install instructions)
=======
=======
>>>>>>> 15e9985047 (GEOMESA-3176 Docs - fix download links in install instructions)
    # note: |scala_binary_version| is the Scala build version
    $ export VERSION="|scala_binary_version|-${TAG}"

<<<<<<< HEAD
Then download and extract the binary distribution:
<<<<<<< HEAD
=======
>>>>>>> 16b2e83f2 (GEOMESA-3176 Docs - fix download links in install instructions)
<<<<<<< HEAD
>>>>>>> 90ec70f559 (GEOMESA-3176 Docs - fix download links in install instructions)
=======
>>>>>>> 15e9985047 (GEOMESA-3176 Docs - fix download links in install instructions)
=======
>>>>>>> 10ade3dcd1 (GEOMESA-3176 Docs - fix download links in install instructions)
=======
=======
>>>>>>> 3be8d2a5a (Merge branch 'feature/postgis-fixes')
>>>>>>> 1b25d7ddb4 (Merge branch 'feature/postgis-fixes')
=======
=======
>>>>>>> e944f1c88b (Merge branch 'feature/postgis-fixes')
=======
>>>>>>> 235bc2820d (GEOMESA-3176 Docs - fix download links in install instructions)
=======
>>>>>>> 26e5afc4ea (Merge branch 'feature/postgis-fixes')
=======
>>>>>>> 63a045a753 (GEOMESA-3254 Add Bloop build support)
=======
>>>>>>> 93fa8c797f (GEOMESA-3176 Docs - fix download links in install instructions)
=======
>>>>>>> c69897d7bd (Merge branch 'feature/postgis-fixes')
=======
>>>>>>> 3be8d2a5a (Merge branch 'feature/postgis-fixes')
=======
>>>>>>> 7813a31aa (GEOMESA-3176 Docs - fix download links in install instructions)
<<<<<<< HEAD
>>>>>>> 71c56e6b77 (GEOMESA-3176 Docs - fix download links in install instructions)
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
>>>>>>> cb6bda89b6 (Merge branch 'feature/postgis-fixes')
=======
>>>>>>> 09d87762c5 (GEOMESA-3254 Add Bloop build support)
=======
>>>>>>> 703374130f (GEOMESA-3176 Docs - fix download links in install instructions)
=======
>>>>>>> 699117eca9 (Merge branch 'feature/postgis-fixes')
=======
>>>>>>> 3be8d2a5a (Merge branch 'feature/postgis-fixes')
=======
>>>>>>> 2aa923cc9 (GEOMESA-3176 Docs - fix download links in install instructions)
<<<<<<< HEAD
>>>>>>> bdcaf0ab5e (GEOMESA-3176 Docs - fix download links in install instructions)
<<<<<<< HEAD
>>>>>>> 235bc2820d (GEOMESA-3176 Docs - fix download links in install instructions)
=======
=======
=======
=======
>>>>>>> 3be8d2a5a (Merge branch 'feature/postgis-fixes')
>>>>>>> db8d998aa (Merge branch 'feature/postgis-fixes')
<<<<<<< HEAD
>>>>>>> cb6bda89b6 (Merge branch 'feature/postgis-fixes')
<<<<<<< HEAD
>>>>>>> 26e5afc4ea (Merge branch 'feature/postgis-fixes')
=======
=======
=======
>>>>>>> d845d7c1b (GEOMESA-3254 Add Bloop build support)
>>>>>>> 09d87762c5 (GEOMESA-3254 Add Bloop build support)
>>>>>>> 63a045a753 (GEOMESA-3254 Add Bloop build support)

.. parsed-literal::

    $ export TAG="|release_version|"
<<<<<<< HEAD
<<<<<<< HEAD
<<<<<<< HEAD
<<<<<<< HEAD
<<<<<<< HEAD
<<<<<<< HEAD
<<<<<<< HEAD
>>>>>>> locationtech-main
=======
>>>>>>> 6a26990f7 (GEOMESA-3176 Docs - fix download links in install instructions)
=======
>>>>>>> baa90e85a (GEOMESA-3176 Docs - fix download links in install instructions)
=======
=======
>>>>>>> 8cbe155de (GEOMESA-3176 Docs - fix download links in install instructions)
>>>>>>> 8150bc0e65 (GEOMESA-3176 Docs - fix download links in install instructions)
=======
=======
>>>>>>> 09d87762c5 (GEOMESA-3254 Add Bloop build support)
=======
>>>>>>> 8cbe155de (GEOMESA-3176 Docs - fix download links in install instructions)
=======
>>>>>>> 0fbf9e83e (GEOMESA-3176 Docs - fix download links in install instructions)
>>>>>>> 4d9f87a514 (GEOMESA-3176 Docs - fix download links in install instructions)
<<<<<<< HEAD
=======
>>>>>>> locationtech-main
=======
=======
>>>>>>> 8cbe155de6 (GEOMESA-3176 Docs - fix download links in install instructions)
=======
>>>>>>> 0fbf9e83e2 (GEOMESA-3176 Docs - fix download links in install instructions)
=======
>>>>>>> d845d7c1bd (GEOMESA-3254 Add Bloop build support)
=======
>>>>>>> 8b8075f529 (GEOMESA-3176 Docs - fix download links in install instructions)
=======
>>>>>>> 64e2e43818 (GEOMESA-3176 Docs - fix download links in install instructions)
>>>>>>> location-main
=======
    $ export VERSION="|scala_binary_version|-${TAG}" # note: |scala_binary_version| is the Scala build version
=======
    # note: |scala_binary_version| is the Scala build version
    $ export VERSION="|scala_binary_version|-${TAG}"
>>>>>>> 90ec70f55 (GEOMESA-3176 Docs - fix download links in install instructions)
<<<<<<< HEAD
<<<<<<< HEAD
<<<<<<< HEAD
<<<<<<< HEAD
=======
>>>>>>> baa90e85a (GEOMESA-3176 Docs - fix download links in install instructions)
=======
>>>>>>> 8150bc0e65 (GEOMESA-3176 Docs - fix download links in install instructions)
=======
=======
>>>>>>> 0fbf9e83e (GEOMESA-3176 Docs - fix download links in install instructions)
>>>>>>> 4d9f87a514 (GEOMESA-3176 Docs - fix download links in install instructions)
=======
    # note: |scala_binary_version| is the Scala build version
    $ export VERSION="|scala_binary_version|-${TAG}"
>>>>>>> 15e998504 (GEOMESA-3176 Docs - fix download links in install instructions)
<<<<<<< HEAD
<<<<<<< HEAD
<<<<<<< HEAD
=======
>>>>>>> 6a26990f7 (GEOMESA-3176 Docs - fix download links in install instructions)
=======
>>>>>>> baa90e85a (GEOMESA-3176 Docs - fix download links in install instructions)
=======
=======
>>>>>>> 8cbe155de (GEOMESA-3176 Docs - fix download links in install instructions)
>>>>>>> 8150bc0e65 (GEOMESA-3176 Docs - fix download links in install instructions)
=======
=======
>>>>>>> 8cbe155de (GEOMESA-3176 Docs - fix download links in install instructions)
=======
>>>>>>> 0fbf9e83e (GEOMESA-3176 Docs - fix download links in install instructions)
>>>>>>> 4d9f87a514 (GEOMESA-3176 Docs - fix download links in install instructions)

Then download and extract the binary distribution:
<<<<<<< HEAD
<<<<<<< HEAD
<<<<<<< HEAD
<<<<<<< HEAD
<<<<<<< HEAD
=======
>>>>>>> e8cc4971c6 (Merge branch 'feature/postgis-fixes')
=======
>>>>>>> bdcaf0ab5e (GEOMESA-3176 Docs - fix download links in install instructions)
=======
=======
>>>>>>> db8d998aa (Merge branch 'feature/postgis-fixes')
>>>>>>> cb6bda89b6 (Merge branch 'feature/postgis-fixes')
=======
>>>>>>> 16b2e83f2 (GEOMESA-3176 Docs - fix download links in install instructions)
=======
>>>>>>> 10ade3dcd (GEOMESA-3176 Docs - fix download links in install instructions)
=======
=======
>>>>>>> 3be8d2a5a (Merge branch 'feature/postgis-fixes')
>>>>>>> 1b25d7ddb (Merge branch 'feature/postgis-fixes')

.. parsed-literal::

<<<<<<< HEAD
  In the following examples, replace ``${TAG}`` with the corresponding GeoMesa version (e.g. |release_version|), and
  ``${VERSION}`` with the appropriate Scala plus GeoMesa versions (e.g. |scala_release_version|).
<<<<<<< HEAD
=======
>>>>>>> 3be8d2a5a4 (Merge branch 'feature/postgis-fixes')
=======
>>>>>>> 16b2e83f2 (GEOMESA-3176 Docs - fix download links in install instructions)
>>>>>>> 2aa923cc97 (GEOMESA-3176 Docs - fix download links in install instructions)

.. parsed-literal::

=======
>>>>>>> 10ade3dcd1 (GEOMESA-3176 Docs - fix download links in install instructions)
    $ export TAG="|release_version|"
<<<<<<< HEAD
<<<<<<< HEAD
=======
=======
>>>>>>> d845d7c1bd (GEOMESA-3254 Add Bloop build support)
>>>>>>> f1532f2313 (GEOMESA-3254 Add Bloop build support)
>>>>>>> locationtech-main
    $ export VERSION="|scala_binary_version|-${TAG}" # note: |scala_binary_version| is the Scala build version
=======
    # note: |scala_binary_version| is the Scala build version
    $ export VERSION="|scala_binary_version|-${TAG}"
>>>>>>> 90ec70f55 (GEOMESA-3176 Docs - fix download links in install instructions)
<<<<<<< HEAD
<<<<<<< HEAD
<<<<<<< HEAD
<<<<<<< HEAD
=======
=======
    # note: |scala_binary_version| is the Scala build version
    $ export VERSION="|scala_binary_version|-${TAG}"
>>>>>>> 15e998504 (GEOMESA-3176 Docs - fix download links in install instructions)

Then download and extract the binary distribution:
<<<<<<< HEAD
<<<<<<< HEAD
<<<<<<< HEAD
=======
<<<<<<< HEAD
>>>>>>> 16b2e83f22 (GEOMESA-3176 Docs - fix download links in install instructions)
=======
=======
>>>>>>> 15e9985047 (GEOMESA-3176 Docs - fix download links in install instructions)
    # note: |scala_binary_version| is the Scala build version
    $ export VERSION="|scala_binary_version|-${TAG}"

<<<<<<< HEAD
Then download and extract the binary distribution:
<<<<<<< HEAD
=======
>>>>>>> 16b2e83f2 (GEOMESA-3176 Docs - fix download links in install instructions)
<<<<<<< HEAD
>>>>>>> 90ec70f559 (GEOMESA-3176 Docs - fix download links in install instructions)
=======
>>>>>>> 15e9985047 (GEOMESA-3176 Docs - fix download links in install instructions)
=======
>>>>>>> 10ade3dcd1 (GEOMESA-3176 Docs - fix download links in install instructions)
=======
=======
>>>>>>> 3be8d2a5a (Merge branch 'feature/postgis-fixes')
>>>>>>> 1b25d7ddb4 (Merge branch 'feature/postgis-fixes')
=======
=======
>>>>>>> e944f1c88b (Merge branch 'feature/postgis-fixes')
=======
>>>>>>> 235bc2820d (GEOMESA-3176 Docs - fix download links in install instructions)
=======
>>>>>>> 26e5afc4ea (Merge branch 'feature/postgis-fixes')
=======
>>>>>>> 63a045a753 (GEOMESA-3254 Add Bloop build support)
=======
>>>>>>> 93fa8c797f (GEOMESA-3176 Docs - fix download links in install instructions)
=======
>>>>>>> c69897d7bd (Merge branch 'feature/postgis-fixes')
=======
>>>>>>> 3be8d2a5a (Merge branch 'feature/postgis-fixes')
=======
>>>>>>> 7813a31aa (GEOMESA-3176 Docs - fix download links in install instructions)
<<<<<<< HEAD
>>>>>>> 71c56e6b77 (GEOMESA-3176 Docs - fix download links in install instructions)
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
>>>>>>> cb6bda89b6 (Merge branch 'feature/postgis-fixes')
=======
>>>>>>> 09d87762c5 (GEOMESA-3254 Add Bloop build support)
=======
>>>>>>> 703374130f (GEOMESA-3176 Docs - fix download links in install instructions)
=======
>>>>>>> 699117eca9 (Merge branch 'feature/postgis-fixes')
=======
>>>>>>> 3be8d2a5a (Merge branch 'feature/postgis-fixes')
=======
>>>>>>> 2aa923cc9 (GEOMESA-3176 Docs - fix download links in install instructions)
<<<<<<< HEAD
>>>>>>> bdcaf0ab5e (GEOMESA-3176 Docs - fix download links in install instructions)
<<<<<<< HEAD
>>>>>>> 235bc2820d (GEOMESA-3176 Docs - fix download links in install instructions)
=======
=======
=======
=======
>>>>>>> 3be8d2a5a (Merge branch 'feature/postgis-fixes')
>>>>>>> db8d998aa (Merge branch 'feature/postgis-fixes')
<<<<<<< HEAD
>>>>>>> cb6bda89b6 (Merge branch 'feature/postgis-fixes')
<<<<<<< HEAD
>>>>>>> 26e5afc4ea (Merge branch 'feature/postgis-fixes')
=======
=======
=======
>>>>>>> d845d7c1b (GEOMESA-3254 Add Bloop build support)
>>>>>>> 09d87762c5 (GEOMESA-3254 Add Bloop build support)
>>>>>>> 63a045a753 (GEOMESA-3254 Add Bloop build support)

.. parsed-literal::

    $ export TAG="|release_version|"
<<<<<<< HEAD
<<<<<<< HEAD
<<<<<<< HEAD
<<<<<<< HEAD
<<<<<<< HEAD
<<<<<<< HEAD
<<<<<<< HEAD
=======
>>>>>>> 6a26990f7 (GEOMESA-3176 Docs - fix download links in install instructions)
=======
>>>>>>> baa90e85a (GEOMESA-3176 Docs - fix download links in install instructions)
=======
=======
>>>>>>> 8cbe155de (GEOMESA-3176 Docs - fix download links in install instructions)
>>>>>>> 8150bc0e65 (GEOMESA-3176 Docs - fix download links in install instructions)
=======
=======
>>>>>>> 09d87762c5 (GEOMESA-3254 Add Bloop build support)
=======
>>>>>>> 8cbe155de (GEOMESA-3176 Docs - fix download links in install instructions)
=======
>>>>>>> 0fbf9e83e (GEOMESA-3176 Docs - fix download links in install instructions)
>>>>>>> 4d9f87a514 (GEOMESA-3176 Docs - fix download links in install instructions)
    $ export VERSION="|scala_binary_version|-${TAG}" # note: |scala_binary_version| is the Scala build version
=======
    # note: |scala_binary_version| is the Scala build version
    $ export VERSION="|scala_binary_version|-${TAG}"
>>>>>>> 90ec70f55 (GEOMESA-3176 Docs - fix download links in install instructions)
<<<<<<< HEAD
<<<<<<< HEAD
>>>>>>> location-main
<<<<<<< HEAD
<<<<<<< HEAD
=======
>>>>>>> baa90e85a (GEOMESA-3176 Docs - fix download links in install instructions)
=======
>>>>>>> 8150bc0e65 (GEOMESA-3176 Docs - fix download links in install instructions)
=======
=======
>>>>>>> 0fbf9e83e (GEOMESA-3176 Docs - fix download links in install instructions)
>>>>>>> 4d9f87a514 (GEOMESA-3176 Docs - fix download links in install instructions)
=======
    # note: |scala_binary_version| is the Scala build version
    $ export VERSION="|scala_binary_version|-${TAG}"
>>>>>>> 15e998504 (GEOMESA-3176 Docs - fix download links in install instructions)
<<<<<<< HEAD
<<<<<<< HEAD
<<<<<<< HEAD
=======
>>>>>>> 6a26990f7 (GEOMESA-3176 Docs - fix download links in install instructions)
=======
>>>>>>> baa90e85a (GEOMESA-3176 Docs - fix download links in install instructions)
=======
=======
>>>>>>> 8cbe155de (GEOMESA-3176 Docs - fix download links in install instructions)
>>>>>>> 8150bc0e65 (GEOMESA-3176 Docs - fix download links in install instructions)
=======
=======
>>>>>>> 8cbe155de (GEOMESA-3176 Docs - fix download links in install instructions)
=======
>>>>>>> 0fbf9e83e (GEOMESA-3176 Docs - fix download links in install instructions)
>>>>>>> 4d9f87a514 (GEOMESA-3176 Docs - fix download links in install instructions)

Then download and extract the binary distribution:
<<<<<<< HEAD
<<<<<<< HEAD
<<<<<<< HEAD
<<<<<<< HEAD
<<<<<<< HEAD
=======
>>>>>>> e8cc4971c6 (Merge branch 'feature/postgis-fixes')
=======
>>>>>>> bdcaf0ab5e (GEOMESA-3176 Docs - fix download links in install instructions)
=======
=======
>>>>>>> db8d998aa (Merge branch 'feature/postgis-fixes')
>>>>>>> cb6bda89b6 (Merge branch 'feature/postgis-fixes')
=======
>>>>>>> 16b2e83f2 (GEOMESA-3176 Docs - fix download links in install instructions)
=======
>>>>>>> 10ade3dcd (GEOMESA-3176 Docs - fix download links in install instructions)
=======
=======
>>>>>>> 3be8d2a5a (Merge branch 'feature/postgis-fixes')
>>>>>>> 1b25d7ddb (Merge branch 'feature/postgis-fixes')

.. parsed-literal::

<<<<<<< HEAD
=======
<<<<<<< HEAD
  In the following examples, replace ``${TAG}`` with the corresponding GeoMesa version (e.g. |release_version|), and
  ``${VERSION}`` with the appropriate Scala plus GeoMesa versions (e.g. |scala_release_version|).
<<<<<<< HEAD
=======
>>>>>>> 3be8d2a5a4 (Merge branch 'feature/postgis-fixes')
=======
>>>>>>> 16b2e83f2 (GEOMESA-3176 Docs - fix download links in install instructions)
>>>>>>> 2aa923cc97 (GEOMESA-3176 Docs - fix download links in install instructions)

.. parsed-literal::

=======
>>>>>>> 10ade3dcd1 (GEOMESA-3176 Docs - fix download links in install instructions)
>>>>>>> location-main
    $ export TAG="|release_version|"
<<<<<<< HEAD
<<<<<<< HEAD
=======
>>>>>>> fdf0e4fe88 (GEOMESA-3176 Docs - fix download links in install instructions)
    $ export VERSION="|scala_binary_version|-${TAG}" # note: |scala_binary_version| is the Scala build version
=======
    # note: |scala_binary_version| is the Scala build version
    $ export VERSION="|scala_binary_version|-${TAG}"
>>>>>>> 90ec70f55 (GEOMESA-3176 Docs - fix download links in install instructions)
=======
<<<<<<< HEAD
<<<<<<< HEAD
>>>>>>> locationtech-main
=======
>>>>>>> locationtech-main
=======
    # note: |scala_binary_version| is the Scala build version
    $ export VERSION="|scala_binary_version|-${TAG}"
>>>>>>> 15e998504 (GEOMESA-3176 Docs - fix download links in install instructions)
<<<<<<< HEAD
<<<<<<< HEAD
=======
    # note: |scala_binary_version| is the Scala build version
    $ export VERSION="|scala_binary_version|-${TAG}"
>>>>>>> 15e998504 (GEOMESA-3176 Docs - fix download links in install instructions)
>>>>>>> fdf0e4fe88 (GEOMESA-3176 Docs - fix download links in install instructions)

Then download and extract the binary distribution:
<<<<<<< HEAD
=======
>>>>>>> 16b2e83f2 (GEOMESA-3176 Docs - fix download links in install instructions)

=======
    # note: |scala_binary_version| is the Scala build version
    $ export VERSION="|scala_binary_version|-${TAG}"
>>>>>>> 15e998504 (GEOMESA-3176 Docs - fix download links in install instructions)

Then download and extract the binary distribution:
<<<<<<< HEAD
<<<<<<< HEAD
<<<<<<< HEAD
<<<<<<< HEAD

=======
>>>>>>> f0b9bd8121 (GEOMESA-3061 Converters - support bytes in Avro top-level union types (#2762))
.. note::

  In the following examples, replace ``${TAG}`` with the corresponding GeoMesa version (e.g. |release_version|), and
  ``${VERSION}`` with the appropriate Scala plus GeoMesa versions (e.g. |scala_release_version|).
<<<<<<< HEAD
=======
>>>>>>> 3be8d2a5a (Merge branch 'feature/postgis-fixes')
=======
>>>>>>> d845d7c1bd (GEOMESA-3254 Add Bloop build support)
=======
>>>>>>> 6d9a5b626c (GEOMESA-3061 Converters - support bytes in Avro top-level union types (#2762))
=======
>>>>>>> 10ade3dcd1 (GEOMESA-3176 Docs - fix download links in install instructions)
=======
=======
>>>>>>> c69897d7bd (Merge branch 'feature/postgis-fixes')
=======
>>>>>>> 16b2e83f2 (GEOMESA-3176 Docs - fix download links in install instructions)
>>>>>>> 93fa8c797f (GEOMESA-3176 Docs - fix download links in install instructions)
=======
=======
>>>>>>> da00c7bd68 (Merge branch 'feature/postgis-fixes')
=======
>>>>>>> 16b2e83f2 (GEOMESA-3176 Docs - fix download links in install instructions)
=======
=======
>>>>>>> 16b2e83f2 (GEOMESA-3176 Docs - fix download links in install instructions)

.. parsed-literal::

    $ export TAG="|release_version|"
    # note: |scala_binary_version| is the Scala build version
    $ export VERSION="|scala_binary_version|-${TAG}"

Then download and extract the binary distribution:
>>>>>>> baeb44a4a8 (GEOMESA-3176 Docs - fix download links in install instructions)

<<<<<<< HEAD
<<<<<<< HEAD
<<<<<<< HEAD
<<<<<<< HEAD
.. parsed-literal::

    $ export TAG="|release_version|"
    # note: |scala_binary_version| is the Scala build version
    $ export VERSION="|scala_binary_version|-${TAG}"

Then download and extract the binary distribution:
>>>>>>> 308738bcef (GEOMESA-3176 Docs - fix download links in install instructions)

<<<<<<< HEAD
<<<<<<< HEAD
<<<<<<< HEAD
<<<<<<< HEAD
<<<<<<< HEAD
<<<<<<< HEAD
<<<<<<< HEAD
>>>>>>> location-main
<<<<<<< HEAD
<<<<<<< HEAD
<<<<<<< HEAD
<<<<<<< HEAD
<<<<<<< HEAD
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
>>>>>>> 3dd99aed4 (GEOMESA-3061 Converters - support bytes in Avro top-level union types (#2762))
=======
>>>>>>> 4524373ac (GEOMESA-3061 Converters - support bytes in Avro top-level union types (#2762))
=======
>>>>>>> 4fbe39c62 (GEOMESA-3061 Converters - support bytes in Avro top-level union types (#2762))
=======
>>>>>>> 8150bc0e65 (GEOMESA-3176 Docs - fix download links in install instructions)
=======
=======
>>>>>>> 4d9f87a514 (GEOMESA-3176 Docs - fix download links in install instructions)
=======
>>>>>>> 5f428db97 (GEOMESA-3061 Converters - support bytes in Avro top-level union types (#2762))
>>>>>>> 6a2cd10c1c (GEOMESA-3061 Converters - support bytes in Avro top-level union types (#2762))
=======
=======
>>>>>>> bd3233180f (GEOMESA-3176 Docs - fix download links in install instructions)
=======
>>>>>>> 0c734cda2b (GEOMESA-3061 Converters - support bytes in Avro top-level union types (#2762))
=======
>>>>>>> 67e4c1354f (GEOMESA-3061 Converters - support bytes in Avro top-level union types (#2762))
=======
>>>>>>> 703374130f (GEOMESA-3176 Docs - fix download links in install instructions)
=======
>>>>>>> 5f428db97 (GEOMESA-3061 Converters - support bytes in Avro top-level union types (#2762))
=======
>>>>>>> 89bdd3013 (GEOMESA-3061 Converters - support bytes in Avro top-level union types (#2762))
<<<<<<< HEAD
>>>>>>> 8a6a96234b (GEOMESA-3061 Converters - support bytes in Avro top-level union types (#2762))
=======
=======
>>>>>>> 72bafaf54 (GEOMESA-3061 Converters - support bytes in Avro top-level union types (#2762))
<<<<<<< HEAD
>>>>>>> 0c734cda2b (GEOMESA-3061 Converters - support bytes in Avro top-level union types (#2762))
=======
=======
>>>>>>> 6d9a5b626 (GEOMESA-3061 Converters - support bytes in Avro top-level union types (#2762))
>>>>>>> 67e4c1354f (GEOMESA-3061 Converters - support bytes in Avro top-level union types (#2762))
<<<<<<< HEAD
=======
=======
>>>>>>> c1f99f4bcb (GEOMESA-3061 Converters - support bytes in Avro top-level union types (#2762))
=======
>>>>>>> 338d952d43 (GEOMESA-3061 Converters - support bytes in Avro top-level union types (#2762))
=======
>>>>>>> 9627a2de6a (GEOMESA-3061 Converters - support bytes in Avro top-level union types (#2762))
=======
>>>>>>> 76908c410a (GEOMESA-3061 Converters - support bytes in Avro top-level union types (#2762))
>>>>>>> location-main
=======
>>>>>>> 49a5a0454f (GEOMESA-3061 Converters - support bytes in Avro top-level union types (#2762))
=======
>>>>>>> b03141c1bb (GEOMESA-3061 Converters - support bytes in Avro top-level union types (#2762))
.. note::

  In the following examples, replace ``${TAG}`` with the corresponding GeoMesa version (e.g. |release_version|), and
  ``${VERSION}`` with the appropriate Scala plus GeoMesa versions (e.g. |scala_release_version|).
<<<<<<< HEAD
<<<<<<< HEAD
<<<<<<< HEAD
<<<<<<< HEAD
<<<<<<< HEAD
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
>>>>>>> location-main
=======
>>>>>>> f9f6fde40b (GEOMESA-3061 Converters - support bytes in Avro top-level union types (#2762))
=======
>>>>>>> 6a2cd10c1c (GEOMESA-3061 Converters - support bytes in Avro top-level union types (#2762))
=======
>>>>>>> 8a6a96234b (GEOMESA-3061 Converters - support bytes in Avro top-level union types (#2762))
=======
>>>>>>> 0c734cda2b (GEOMESA-3061 Converters - support bytes in Avro top-level union types (#2762))
=======
>>>>>>> cb6bda89b6 (Merge branch 'feature/postgis-fixes')
=======
>>>>>>> 67e4c1354f (GEOMESA-3061 Converters - support bytes in Avro top-level union types (#2762))
=======
>>>>>>> 3be8d2a5a (Merge branch 'feature/postgis-fixes')
=======
=======
>>>>>>> 16b2e83f2 (GEOMESA-3176 Docs - fix download links in install instructions)
<<<<<<< HEAD
<<<<<<< HEAD
>>>>>>> 7813a31aa (GEOMESA-3176 Docs - fix download links in install instructions)
=======
=======
>>>>>>> 3be8d2a5a (Merge branch 'feature/postgis-fixes')
>>>>>>> e8cc4971c6 (Merge branch 'feature/postgis-fixes')
=======
>>>>>>> 2aa923cc9 (GEOMESA-3176 Docs - fix download links in install instructions)
=======
=======
>>>>>>> 3be8d2a5a (Merge branch 'feature/postgis-fixes')
>>>>>>> db8d998aa (Merge branch 'feature/postgis-fixes')
<<<<<<< HEAD
>>>>>>> cb6bda89b6 (Merge branch 'feature/postgis-fixes')
=======
=======
    $ export VERSION="|scala_binary_version|-${TAG}" # note: |scala_binary_version| is the Scala build version
=======
.. parsed-literal::
<<<<<<< HEAD
=======
=======
=======
>>>>>>> 3be8d2a5a (Merge branch 'feature/postgis-fixes')
>>>>>>> da00c7bd68 (Merge branch 'feature/postgis-fixes')
>>>>>>> location-main

    $ export TAG="|release_version|"
    # note: |scala_binary_version| is the Scala build version
    $ export VERSION="|scala_binary_version|-${TAG}"

Then download and extract the binary distribution:
>>>>>>> 10ade3dcd (GEOMESA-3176 Docs - fix download links in install instructions)

<<<<<<< HEAD
<<<<<<< HEAD
<<<<<<< HEAD
<<<<<<< HEAD
<<<<<<< HEAD
<<<<<<< HEAD
<<<<<<< HEAD
Then download and extract the binary distribution:
>>>>>>> d845d7c1b (GEOMESA-3254 Add Bloop build support)
>>>>>>> 09d87762c5 (GEOMESA-3254 Add Bloop build support)

<<<<<<< HEAD
.. parsed-literal::

    $ export TAG="|release_version|"
    # note: |scala_binary_version| is the Scala build version
    $ export VERSION="|scala_binary_version|-${TAG}"

Then download and extract the binary distribution:
=======
<<<<<<< HEAD
>>>>>>> e847488d8 (GEOMESA-3061 Converters - support bytes in Avro top-level union types (#2762))
=======
>>>>>>> c5e182765 (GEOMESA-3061 Converters - support bytes in Avro top-level union types (#2762))
>>>>>>> f9f6fde40b (GEOMESA-3061 Converters - support bytes in Avro top-level union types (#2762))

=======
<<<<<<< HEAD
>>>>>>> 6a26990f7 (GEOMESA-3176 Docs - fix download links in install instructions)
=======

>>>>>>> 3dd99aed4 (GEOMESA-3061 Converters - support bytes in Avro top-level union types (#2762))
=======
>>>>>>> baa90e85a (GEOMESA-3176 Docs - fix download links in install instructions)
=======

>>>>>>> 4524373ac (GEOMESA-3061 Converters - support bytes in Avro top-level union types (#2762))
=======
>>>>>>> 46c05fed5 (GEOMESA-3176 Docs - fix download links in install instructions)
=======

>>>>>>> 4fbe39c62 (GEOMESA-3061 Converters - support bytes in Avro top-level union types (#2762))
=======
.. note::
=======
>>>>>>> 2aa923cc9 (GEOMESA-3176 Docs - fix download links in install instructions)

.. parsed-literal::
>>>>>>> bdcaf0ab5e (GEOMESA-3176 Docs - fix download links in install instructions)

    $ export TAG="|release_version|"
    # note: |scala_binary_version| is the Scala build version
    $ export VERSION="|scala_binary_version|-${TAG}"
<<<<<<< HEAD
=======
>>>>>>> locationtech-main

Then download and extract the binary distribution:
<<<<<<< HEAD
=======
>>>>>>> 16b2e83f2 (GEOMESA-3176 Docs - fix download links in install instructions)

.. parsed-literal::

    $ export TAG="|release_version|"
    # note: |scala_binary_version| is the Scala build version
    $ export VERSION="|scala_binary_version|-${TAG}"

Then download and extract the binary distribution:
<<<<<<< HEAD
<<<<<<< HEAD
<<<<<<< HEAD
<<<<<<< HEAD
<<<<<<< HEAD
<<<<<<< HEAD
<<<<<<< HEAD
=======
>>>>>>> ec6d06b576 (Merge branch 'feature/postgis-fixes')

<<<<<<< HEAD
=======
=======
>>>>>>> f0b9bd8121 (GEOMESA-3061 Converters - support bytes in Avro top-level union types (#2762))
>>>>>>> locationtech-main
.. note::

  In the following examples, replace ``${TAG}`` with the corresponding GeoMesa version (e.g. |release_version|), and
  ``${VERSION}`` with the appropriate Scala plus GeoMesa versions (e.g. |scala_release_version|).
<<<<<<< HEAD
=======
>>>>>>> 3be8d2a5a (Merge branch 'feature/postgis-fixes')

=======
=======
>>>>>>> locationtech-main

Then download and extract the binary distribution:
<<<<<<< HEAD
=======
>>>>>>> 16b2e83f2 (GEOMESA-3176 Docs - fix download links in install instructions)

.. parsed-literal::

    $ export TAG="|release_version|"
    # note: |scala_binary_version| is the Scala build version
    $ export VERSION="|scala_binary_version|-${TAG}"

Then download and extract the binary distribution:
<<<<<<< HEAD
<<<<<<< HEAD
<<<<<<< HEAD
<<<<<<< HEAD
<<<<<<< HEAD
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
>>>>>>> ec6d06b576 (Merge branch 'feature/postgis-fixes')
=======
>>>>>>> 354b5e5ae5 (Merge branch 'feature/postgis-fixes')
=======
>>>>>>> 264c9fa240 (Merge branch 'feature/postgis-fixes')
=======
>>>>>>> c738f63bd9 (GEOMESA-3254 Add Bloop build support)
=======
=======
>>>>>>> ec6d06b576 (Merge branch 'feature/postgis-fixes')
>>>>>>> cc93e0930d (Merge branch 'feature/postgis-fixes')

<<<<<<< HEAD
=======
<<<<<<< HEAD
<<<<<<< HEAD
<<<<<<< HEAD
=======
>>>>>>> f0b9bd8121 (GEOMESA-3061 Converters - support bytes in Avro top-level union types (#2762))
=======
>>>>>>> 3d5144418e (GEOMESA-3061 Converters - support bytes in Avro top-level union types (#2762))
=======
=======
>>>>>>> f0b9bd8121 (GEOMESA-3061 Converters - support bytes in Avro top-level union types (#2762))
>>>>>>> 9293965a7d (GEOMESA-3061 Converters - support bytes in Avro top-level union types (#2762))
=======
>>>>>>> 66dbbce00d (GEOMESA-3061 Converters - support bytes in Avro top-level union types (#2762))
>>>>>>> locatelli-main
.. note::

  In the following examples, replace ``${TAG}`` with the corresponding GeoMesa version (e.g. |release_version|), and
  ``${VERSION}`` with the appropriate Scala plus GeoMesa versions (e.g. |scala_release_version|).
<<<<<<< HEAD
=======
>>>>>>> 3be8d2a5a (Merge branch 'feature/postgis-fixes')

<<<<<<< HEAD
>>>>>>> location-main
=======
<<<<<<< HEAD
=======
<<<<<<< HEAD
<<<<<<< HEAD
<<<<<<< HEAD
=======
=======
>>>>>>> 3be8d2a5a (Merge branch 'feature/postgis-fixes')

=======

Then download and extract the binary distribution:
<<<<<<< HEAD
<<<<<<< HEAD
<<<<<<< HEAD
<<<<<<< HEAD
<<<<<<< HEAD
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
>>>>>>> ec6d06b576 (Merge branch 'feature/postgis-fixes')
=======
>>>>>>> 354b5e5ae5 (Merge branch 'feature/postgis-fixes')
=======
>>>>>>> 264c9fa240 (Merge branch 'feature/postgis-fixes')
=======
>>>>>>> c738f63bd9 (GEOMESA-3254 Add Bloop build support)
=======
=======
>>>>>>> ec6d06b576 (Merge branch 'feature/postgis-fixes')
>>>>>>> cc93e0930d (Merge branch 'feature/postgis-fixes')

<<<<<<< HEAD
<<<<<<< HEAD
=======
<<<<<<< HEAD
<<<<<<< HEAD
=======
>>>>>>> f0b9bd8121 (GEOMESA-3061 Converters - support bytes in Avro top-level union types (#2762))
=======
>>>>>>> 3d5144418e (GEOMESA-3061 Converters - support bytes in Avro top-level union types (#2762))
=======
=======
>>>>>>> f0b9bd8121 (GEOMESA-3061 Converters - support bytes in Avro top-level union types (#2762))
>>>>>>> 9293965a7d (GEOMESA-3061 Converters - support bytes in Avro top-level union types (#2762))
=======
>>>>>>> 66dbbce00d (GEOMESA-3061 Converters - support bytes in Avro top-level union types (#2762))
.. note::

  In the following examples, replace ``${TAG}`` with the corresponding GeoMesa version (e.g. |release_version|), and
  ``${VERSION}`` with the appropriate Scala plus GeoMesa versions (e.g. |scala_release_version|).
<<<<<<< HEAD
<<<<<<< HEAD
<<<<<<< HEAD
=======
=======
>>>>>>> 3be8d2a5a (Merge branch 'feature/postgis-fixes')

=======

Then download and extract the binary distribution:
<<<<<<< HEAD
<<<<<<< HEAD
<<<<<<< HEAD
<<<<<<< HEAD
<<<<<<< HEAD
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
>>>>>>> ec6d06b576 (Merge branch 'feature/postgis-fixes')
=======
>>>>>>> 354b5e5ae5 (Merge branch 'feature/postgis-fixes')
=======
>>>>>>> 264c9fa240 (Merge branch 'feature/postgis-fixes')
=======
>>>>>>> c738f63bd9 (GEOMESA-3254 Add Bloop build support)
=======
=======
>>>>>>> ec6d06b576 (Merge branch 'feature/postgis-fixes')
>>>>>>> cc93e0930d (Merge branch 'feature/postgis-fixes')

<<<<<<< HEAD
<<<<<<< HEAD
>>>>>>> locatelli-main
=======
<<<<<<< HEAD
<<<<<<< HEAD
=======
>>>>>>> f0b9bd8121 (GEOMESA-3061 Converters - support bytes in Avro top-level union types (#2762))
=======
>>>>>>> 3d5144418e (GEOMESA-3061 Converters - support bytes in Avro top-level union types (#2762))
=======
=======
>>>>>>> f0b9bd8121 (GEOMESA-3061 Converters - support bytes in Avro top-level union types (#2762))
>>>>>>> 9293965a7d (GEOMESA-3061 Converters - support bytes in Avro top-level union types (#2762))
=======
>>>>>>> 66dbbce00d (GEOMESA-3061 Converters - support bytes in Avro top-level union types (#2762))
.. note::

  In the following examples, replace ``${TAG}`` with the corresponding GeoMesa version (e.g. |release_version|), and
  ``${VERSION}`` with the appropriate Scala plus GeoMesa versions (e.g. |scala_release_version|).
<<<<<<< HEAD
<<<<<<< HEAD
<<<<<<< HEAD
=======
=======
>>>>>>> 3be8d2a5a (Merge branch 'feature/postgis-fixes')

=======

Then download and extract the binary distribution:

<<<<<<< HEAD
>>>>>>> locatelli-main
>>>>>>> location-main
=======
>>>>>>> fcfc8ed547 (GEOMESA-3061 Converters - support bytes in Avro top-level union types (#2762))
<<<<<<< HEAD
<<<<<<< HEAD
=======
>>>>>>> 9293965a7d (GEOMESA-3061 Converters - support bytes in Avro top-level union types (#2762))
<<<<<<< HEAD
<<<<<<< HEAD
>>>>>>> locatelli-main
=======
>>>>>>> locatelli-main
=======
>>>>>>> locatelli-main
=======
>>>>>>> 3be8d2a5a (Merge branch 'feature/postgis-fixes')
=======
>>>>>>> d845d7c1bd (GEOMESA-3254 Add Bloop build support)
=======
>>>>>>> 6d9a5b626c (GEOMESA-3061 Converters - support bytes in Avro top-level union types (#2762))
=======
>>>>>>> 10ade3dcd1 (GEOMESA-3176 Docs - fix download links in install instructions)
=======
=======
>>>>>>> c69897d7bd (Merge branch 'feature/postgis-fixes')
=======
>>>>>>> 16b2e83f2 (GEOMESA-3176 Docs - fix download links in install instructions)
>>>>>>> 93fa8c797f (GEOMESA-3176 Docs - fix download links in install instructions)
=======
=======
<<<<<<< HEAD
<<<<<<< HEAD
<<<<<<< HEAD
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
<<<<<<< HEAD
=======
>>>>>>> fbb5e06c6a (GEOMESA-3176 Docs - fix download links in install instructions)
=======
>>>>>>> cc93e0930d (Merge branch 'feature/postgis-fixes')
<<<<<<< HEAD
<<<<<<< HEAD
>>>>>>> locatelli-main
=======
>>>>>>> locatelli-main
=======
>>>>>>> locatelli-main
>>>>>>> da00c7bd68 (Merge branch 'feature/postgis-fixes')
=======
>>>>>>> 16b2e83f2 (GEOMESA-3176 Docs - fix download links in install instructions)
=======
=======
>>>>>>> 42e8565e9b (Merge branch 'feature/postgis-fixes')
=======
>>>>>>> f1532f2313 (GEOMESA-3254 Add Bloop build support)
=======
<<<<<<< HEAD
<<<<<<< HEAD
<<<<<<< HEAD
<<<<<<< HEAD
=======
<<<<<<< HEAD
=======
>>>>>>> locatelli-main
=======
>>>>>>> locatelli-main
>>>>>>> 42e8565e9b (Merge branch 'feature/postgis-fixes')
=======
>>>>>>> f1532f2313 (GEOMESA-3254 Add Bloop build support)
=======
<<<<<<< HEAD
>>>>>>> 16b2e83f22 (GEOMESA-3176 Docs - fix download links in install instructions)
=======
=======
>>>>>>> 15e9985047 (GEOMESA-3176 Docs - fix download links in install instructions)
    # note: |scala_binary_version| is the Scala build version
    $ export VERSION="|scala_binary_version|-${TAG}"
=======
=======
>>>>>>> da00c7bd68 (Merge branch 'feature/postgis-fixes')
=======
>>>>>>> ec6d06b576 (Merge branch 'feature/postgis-fixes')
>>>>>>> 16b2e83f2 (GEOMESA-3176 Docs - fix download links in install instructions)
=======
=======
>>>>>>> 6e0709aba8 (Merge branch 'feature/postgis-fixes')
=======
>>>>>>> 7a84c9d22d (GEOMESA-3254 Add Bloop build support)
=======
<<<<<<< HEAD
>>>>>>> 16b2e83f22 (GEOMESA-3176 Docs - fix download links in install instructions)
=======
=======
>>>>>>> 15e9985047 (GEOMESA-3176 Docs - fix download links in install instructions)
    # note: |scala_binary_version| is the Scala build version
    $ export VERSION="|scala_binary_version|-${TAG}"
=======
=======
>>>>>>> da00c7bd68 (Merge branch 'feature/postgis-fixes')
=======
>>>>>>> 354b5e5ae5 (Merge branch 'feature/postgis-fixes')
>>>>>>> 16b2e83f2 (GEOMESA-3176 Docs - fix download links in install instructions)
=======
=======
>>>>>>> b68ae6197f (GEOMESA-3176 Docs - fix download links in install instructions)
<<<<<<< HEAD
<<<<<<< HEAD
>>>>>>> locatelli-main
=======
>>>>>>> locatelli-main
=======
>>>>>>> locatelli-main
>>>>>>> 16b2e83f22 (GEOMESA-3176 Docs - fix download links in install instructions)
=======
=======
>>>>>>> 15e9985047 (GEOMESA-3176 Docs - fix download links in install instructions)
    # note: |scala_binary_version| is the Scala build version
    $ export VERSION="|scala_binary_version|-${TAG}"
=======
=======
>>>>>>> da00c7bd68 (Merge branch 'feature/postgis-fixes')
=======
>>>>>>> ec6d06b576 (Merge branch 'feature/postgis-fixes')
>>>>>>> 16b2e83f2 (GEOMESA-3176 Docs - fix download links in install instructions)

.. parsed-literal::

    $ export TAG="|release_version|"
    # note: |scala_binary_version| is the Scala build version
    $ export VERSION="|scala_binary_version|-${TAG}"

Then download and extract the binary distribution:
>>>>>>> 308738bcef (GEOMESA-3176 Docs - fix download links in install instructions)
>>>>>>> 1f19a648d1 (GEOMESA-3176 Docs - fix download links in install instructions)

Then download and extract the binary distribution:
<<<<<<< HEAD
=======
>>>>>>> 16b2e83f2 (GEOMESA-3176 Docs - fix download links in install instructions)
<<<<<<< HEAD
>>>>>>> 90ec70f559 (GEOMESA-3176 Docs - fix download links in install instructions)
=======
>>>>>>> 15e9985047 (GEOMESA-3176 Docs - fix download links in install instructions)
=======
>>>>>>> 10ade3dcd1 (GEOMESA-3176 Docs - fix download links in install instructions)
=======
=======
>>>>>>> 3be8d2a5a (Merge branch 'feature/postgis-fixes')
>>>>>>> 1b25d7ddb4 (Merge branch 'feature/postgis-fixes')
=======
=======
>>>>>>> e944f1c88b (Merge branch 'feature/postgis-fixes')
=======
>>>>>>> 235bc2820d (GEOMESA-3176 Docs - fix download links in install instructions)
=======
>>>>>>> 26e5afc4ea (Merge branch 'feature/postgis-fixes')
=======
>>>>>>> 63a045a753 (GEOMESA-3254 Add Bloop build support)
=======
>>>>>>> 93fa8c797f (GEOMESA-3176 Docs - fix download links in install instructions)
=======
>>>>>>> c69897d7bd (Merge branch 'feature/postgis-fixes')
=======
>>>>>>> 3be8d2a5a (Merge branch 'feature/postgis-fixes')
=======
>>>>>>> 7813a31aa (GEOMESA-3176 Docs - fix download links in install instructions)
<<<<<<< HEAD
>>>>>>> 71c56e6b77 (GEOMESA-3176 Docs - fix download links in install instructions)
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
>>>>>>> cb6bda89b6 (Merge branch 'feature/postgis-fixes')
=======
>>>>>>> 09d87762c5 (GEOMESA-3254 Add Bloop build support)
=======
>>>>>>> 703374130f (GEOMESA-3176 Docs - fix download links in install instructions)
=======
>>>>>>> 699117eca9 (Merge branch 'feature/postgis-fixes')
=======
>>>>>>> 3be8d2a5a (Merge branch 'feature/postgis-fixes')
=======
>>>>>>> 2aa923cc9 (GEOMESA-3176 Docs - fix download links in install instructions)
<<<<<<< HEAD
>>>>>>> bdcaf0ab5e (GEOMESA-3176 Docs - fix download links in install instructions)
<<<<<<< HEAD
>>>>>>> 235bc2820d (GEOMESA-3176 Docs - fix download links in install instructions)
=======
=======
=======
=======
>>>>>>> 3be8d2a5a (Merge branch 'feature/postgis-fixes')
>>>>>>> db8d998aa (Merge branch 'feature/postgis-fixes')
<<<<<<< HEAD
>>>>>>> cb6bda89b6 (Merge branch 'feature/postgis-fixes')
<<<<<<< HEAD
>>>>>>> 26e5afc4ea (Merge branch 'feature/postgis-fixes')
=======
=======
=======
>>>>>>> d845d7c1b (GEOMESA-3254 Add Bloop build support)
>>>>>>> 09d87762c5 (GEOMESA-3254 Add Bloop build support)
>>>>>>> 63a045a753 (GEOMESA-3254 Add Bloop build support)

.. parsed-literal::

    $ export TAG="|release_version|"
<<<<<<< HEAD
<<<<<<< HEAD
<<<<<<< HEAD
<<<<<<< HEAD
<<<<<<< HEAD
<<<<<<< HEAD
<<<<<<< HEAD
=======
>>>>>>> 6a26990f7 (GEOMESA-3176 Docs - fix download links in install instructions)
=======
>>>>>>> baa90e85a (GEOMESA-3176 Docs - fix download links in install instructions)
=======
=======
>>>>>>> 8cbe155de (GEOMESA-3176 Docs - fix download links in install instructions)
>>>>>>> 8150bc0e65 (GEOMESA-3176 Docs - fix download links in install instructions)
=======
=======
>>>>>>> 09d87762c5 (GEOMESA-3254 Add Bloop build support)
=======
>>>>>>> 8cbe155de (GEOMESA-3176 Docs - fix download links in install instructions)
=======
>>>>>>> 0fbf9e83e (GEOMESA-3176 Docs - fix download links in install instructions)
>>>>>>> 4d9f87a514 (GEOMESA-3176 Docs - fix download links in install instructions)
    $ export VERSION="|scala_binary_version|-${TAG}" # note: |scala_binary_version| is the Scala build version
=======
    # note: |scala_binary_version| is the Scala build version
    $ export VERSION="|scala_binary_version|-${TAG}"
>>>>>>> 90ec70f55 (GEOMESA-3176 Docs - fix download links in install instructions)
<<<<<<< HEAD
<<<<<<< HEAD
<<<<<<< HEAD
<<<<<<< HEAD
=======
>>>>>>> baa90e85a (GEOMESA-3176 Docs - fix download links in install instructions)
=======
>>>>>>> 8150bc0e65 (GEOMESA-3176 Docs - fix download links in install instructions)
=======
=======
>>>>>>> 0fbf9e83e (GEOMESA-3176 Docs - fix download links in install instructions)
>>>>>>> 4d9f87a514 (GEOMESA-3176 Docs - fix download links in install instructions)
=======
    # note: |scala_binary_version| is the Scala build version
    $ export VERSION="|scala_binary_version|-${TAG}"
>>>>>>> 15e998504 (GEOMESA-3176 Docs - fix download links in install instructions)
<<<<<<< HEAD
<<<<<<< HEAD
<<<<<<< HEAD
=======
>>>>>>> 6a26990f7 (GEOMESA-3176 Docs - fix download links in install instructions)
=======
>>>>>>> baa90e85a (GEOMESA-3176 Docs - fix download links in install instructions)
=======
=======
>>>>>>> 8cbe155de (GEOMESA-3176 Docs - fix download links in install instructions)
>>>>>>> 8150bc0e65 (GEOMESA-3176 Docs - fix download links in install instructions)
=======
=======
>>>>>>> 8cbe155de (GEOMESA-3176 Docs - fix download links in install instructions)
=======
>>>>>>> 0fbf9e83e (GEOMESA-3176 Docs - fix download links in install instructions)
>>>>>>> 4d9f87a514 (GEOMESA-3176 Docs - fix download links in install instructions)

Then download and extract the binary distribution:
<<<<<<< HEAD
<<<<<<< HEAD
<<<<<<< HEAD
<<<<<<< HEAD
<<<<<<< HEAD
<<<<<<< HEAD
>>>>>>> 983d0b0983 (GEOMESA-3176 Docs - fix download links in install instructions)
<<<<<<< HEAD
<<<<<<< HEAD
<<<<<<< HEAD
=======
<<<<<<< HEAD
>>>>>>> 4fd46f4f99 (GEOMESA-3176 Docs - fix download links in install instructions)
=======
>>>>>>> locatelli-main
=======
>>>>>>> 4fd46f4f99 (GEOMESA-3176 Docs - fix download links in install instructions)
=======
>>>>>>> locatelli-main
=======
>>>>>>> 4fd46f4f99 (GEOMESA-3176 Docs - fix download links in install instructions)
=======
>>>>>>> locatelli-main
=======
=======
>>>>>>> e8cc4971c6 (Merge branch 'feature/postgis-fixes')
=======
>>>>>>> bdcaf0ab5e (GEOMESA-3176 Docs - fix download links in install instructions)
=======
=======
>>>>>>> db8d998aa (Merge branch 'feature/postgis-fixes')
>>>>>>> cb6bda89b6 (Merge branch 'feature/postgis-fixes')
=======
>>>>>>> 16b2e83f2 (GEOMESA-3176 Docs - fix download links in install instructions)
=======
>>>>>>> 10ade3dcd (GEOMESA-3176 Docs - fix download links in install instructions)
=======
=======
>>>>>>> 3be8d2a5a (Merge branch 'feature/postgis-fixes')
>>>>>>> 1b25d7ddb (Merge branch 'feature/postgis-fixes')

.. parsed-literal::
>>>>>>> 71adb695c5 (Merge branch 'feature/postgis-fixes')
<<<<<<< HEAD
<<<<<<< HEAD
<<<<<<< HEAD
=======
=======
>>>>>>> locatelli-main
=======
>>>>>>> locatelli-main
>>>>>>> 0a5b74c946 (Merge branch 'feature/postgis-fixes')

<<<<<<< HEAD
<<<<<<< HEAD
<<<<<<< HEAD
<<<<<<< HEAD
<<<<<<< HEAD
<<<<<<< HEAD
<<<<<<< HEAD
.. parsed-literal::

    $ export TAG="|release_version|"
<<<<<<< HEAD
<<<<<<< HEAD
    $ export VERSION="|scala_binary_version|-${TAG}" # note: |scala_binary_version| is the Scala build version
=======
    # note: |scala_binary_version| is the Scala build version
    $ export VERSION="|scala_binary_version|-${TAG}"
>>>>>>> 90ec70f55 (GEOMESA-3176 Docs - fix download links in install instructions)
=======
    # note: |scala_binary_version| is the Scala build version
    $ export VERSION="|scala_binary_version|-${TAG}"
>>>>>>> 15e998504 (GEOMESA-3176 Docs - fix download links in install instructions)

Then download and extract the binary distribution:
<<<<<<< HEAD
>>>>>>> 308738bcef (GEOMESA-3176 Docs - fix download links in install instructions)
>>>>>>> 731987cbc8 (GEOMESA-3176 Docs - fix download links in install instructions)

Then download and extract the binary distribution:
=======
>>>>>>> 64eaf6b132 (Merge branch 'feature/postgis-fixes')
<<<<<<< HEAD
=======
>>>>>>> 16b2e83f2 (GEOMESA-3176 Docs - fix download links in install instructions)
<<<<<<< HEAD
>>>>>>> 90ec70f559 (GEOMESA-3176 Docs - fix download links in install instructions)
=======
>>>>>>> 15e9985047 (GEOMESA-3176 Docs - fix download links in install instructions)
=======
>>>>>>> 10ade3dcd1 (GEOMESA-3176 Docs - fix download links in install instructions)
=======
=======
>>>>>>> 3be8d2a5a (Merge branch 'feature/postgis-fixes')
>>>>>>> 1b25d7ddb4 (Merge branch 'feature/postgis-fixes')
=======
=======
>>>>>>> e944f1c88b (Merge branch 'feature/postgis-fixes')
=======
>>>>>>> 235bc2820d (GEOMESA-3176 Docs - fix download links in install instructions)
=======
>>>>>>> 26e5afc4ea (Merge branch 'feature/postgis-fixes')
=======
>>>>>>> 63a045a753 (GEOMESA-3254 Add Bloop build support)
=======
>>>>>>> 93fa8c797f (GEOMESA-3176 Docs - fix download links in install instructions)
=======
>>>>>>> c69897d7bd (Merge branch 'feature/postgis-fixes')
=======
>>>>>>> 3be8d2a5a (Merge branch 'feature/postgis-fixes')
=======
>>>>>>> 7813a31aa (GEOMESA-3176 Docs - fix download links in install instructions)
<<<<<<< HEAD
>>>>>>> 71c56e6b77 (GEOMESA-3176 Docs - fix download links in install instructions)
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
>>>>>>> cb6bda89b6 (Merge branch 'feature/postgis-fixes')
=======
>>>>>>> 09d87762c5 (GEOMESA-3254 Add Bloop build support)
=======
>>>>>>> 703374130f (GEOMESA-3176 Docs - fix download links in install instructions)
=======
>>>>>>> 699117eca9 (Merge branch 'feature/postgis-fixes')
=======
>>>>>>> 3be8d2a5a (Merge branch 'feature/postgis-fixes')
=======
>>>>>>> 2aa923cc9 (GEOMESA-3176 Docs - fix download links in install instructions)
<<<<<<< HEAD
>>>>>>> bdcaf0ab5e (GEOMESA-3176 Docs - fix download links in install instructions)
<<<<<<< HEAD
>>>>>>> 235bc2820d (GEOMESA-3176 Docs - fix download links in install instructions)
=======
=======
=======
=======
>>>>>>> 3be8d2a5a (Merge branch 'feature/postgis-fixes')
>>>>>>> db8d998aa (Merge branch 'feature/postgis-fixes')
<<<<<<< HEAD
>>>>>>> cb6bda89b6 (Merge branch 'feature/postgis-fixes')
<<<<<<< HEAD
>>>>>>> 26e5afc4ea (Merge branch 'feature/postgis-fixes')
=======
=======
=======
>>>>>>> d845d7c1b (GEOMESA-3254 Add Bloop build support)
>>>>>>> 09d87762c5 (GEOMESA-3254 Add Bloop build support)
>>>>>>> 63a045a753 (GEOMESA-3254 Add Bloop build support)

.. parsed-literal::

    $ export TAG="|release_version|"
<<<<<<< HEAD
<<<<<<< HEAD
<<<<<<< HEAD
<<<<<<< HEAD
<<<<<<< HEAD
<<<<<<< HEAD
<<<<<<< HEAD
=======
>>>>>>> 6a26990f7 (GEOMESA-3176 Docs - fix download links in install instructions)
=======
>>>>>>> baa90e85a (GEOMESA-3176 Docs - fix download links in install instructions)
=======
=======
>>>>>>> 8cbe155de (GEOMESA-3176 Docs - fix download links in install instructions)
>>>>>>> 8150bc0e65 (GEOMESA-3176 Docs - fix download links in install instructions)
=======
=======
>>>>>>> 09d87762c5 (GEOMESA-3254 Add Bloop build support)
=======
>>>>>>> 8cbe155de (GEOMESA-3176 Docs - fix download links in install instructions)
=======
>>>>>>> 0fbf9e83e (GEOMESA-3176 Docs - fix download links in install instructions)
>>>>>>> 4d9f87a514 (GEOMESA-3176 Docs - fix download links in install instructions)
    $ export VERSION="|scala_binary_version|-${TAG}" # note: |scala_binary_version| is the Scala build version
=======
    # note: |scala_binary_version| is the Scala build version
    $ export VERSION="|scala_binary_version|-${TAG}"
>>>>>>> 90ec70f55 (GEOMESA-3176 Docs - fix download links in install instructions)
<<<<<<< HEAD
<<<<<<< HEAD
<<<<<<< HEAD
<<<<<<< HEAD
=======
>>>>>>> baa90e85a (GEOMESA-3176 Docs - fix download links in install instructions)
=======
>>>>>>> 8150bc0e65 (GEOMESA-3176 Docs - fix download links in install instructions)
=======
=======
>>>>>>> 0fbf9e83e (GEOMESA-3176 Docs - fix download links in install instructions)
>>>>>>> 4d9f87a514 (GEOMESA-3176 Docs - fix download links in install instructions)
=======
    # note: |scala_binary_version| is the Scala build version
    $ export VERSION="|scala_binary_version|-${TAG}"
>>>>>>> 15e998504 (GEOMESA-3176 Docs - fix download links in install instructions)
<<<<<<< HEAD
<<<<<<< HEAD
<<<<<<< HEAD
=======
>>>>>>> 6a26990f7 (GEOMESA-3176 Docs - fix download links in install instructions)
=======
>>>>>>> baa90e85a (GEOMESA-3176 Docs - fix download links in install instructions)
=======
=======
>>>>>>> 8cbe155de (GEOMESA-3176 Docs - fix download links in install instructions)
>>>>>>> 8150bc0e65 (GEOMESA-3176 Docs - fix download links in install instructions)
=======
=======
>>>>>>> 8cbe155de (GEOMESA-3176 Docs - fix download links in install instructions)
=======
>>>>>>> 0fbf9e83e (GEOMESA-3176 Docs - fix download links in install instructions)
>>>>>>> 4d9f87a514 (GEOMESA-3176 Docs - fix download links in install instructions)

Then download and extract the binary distribution:
<<<<<<< HEAD
<<<<<<< HEAD
<<<<<<< HEAD
<<<<<<< HEAD
<<<<<<< HEAD
<<<<<<< HEAD
>>>>>>> d13d2eab26 (GEOMESA-3176 Docs - fix download links in install instructions)
=======
=======
>>>>>>> e8cc4971c6 (Merge branch 'feature/postgis-fixes')
=======
>>>>>>> bdcaf0ab5e (GEOMESA-3176 Docs - fix download links in install instructions)
=======
=======
>>>>>>> db8d998aa (Merge branch 'feature/postgis-fixes')
>>>>>>> cb6bda89b6 (Merge branch 'feature/postgis-fixes')
=======
>>>>>>> 16b2e83f2 (GEOMESA-3176 Docs - fix download links in install instructions)
=======
>>>>>>> 10ade3dcd (GEOMESA-3176 Docs - fix download links in install instructions)
=======
=======
>>>>>>> 3be8d2a5a (Merge branch 'feature/postgis-fixes')
>>>>>>> 1b25d7ddb (Merge branch 'feature/postgis-fixes')

.. parsed-literal::
>>>>>>> 964e86145a (Merge branch 'feature/postgis-fixes')

<<<<<<< HEAD
<<<<<<< HEAD
<<<<<<< HEAD
<<<<<<< HEAD
<<<<<<< HEAD
<<<<<<< HEAD
<<<<<<< HEAD
.. parsed-literal::

    $ export TAG="|release_version|"
<<<<<<< HEAD
<<<<<<< HEAD
    $ export VERSION="|scala_binary_version|-${TAG}" # note: |scala_binary_version| is the Scala build version
=======
    # note: |scala_binary_version| is the Scala build version
    $ export VERSION="|scala_binary_version|-${TAG}"
>>>>>>> 90ec70f55 (GEOMESA-3176 Docs - fix download links in install instructions)
=======
    # note: |scala_binary_version| is the Scala build version
    $ export VERSION="|scala_binary_version|-${TAG}"
>>>>>>> 15e998504 (GEOMESA-3176 Docs - fix download links in install instructions)

Then download and extract the binary distribution:
<<<<<<< HEAD
>>>>>>> 308738bcef (GEOMESA-3176 Docs - fix download links in install instructions)
>>>>>>> 1f19a648d1 (GEOMESA-3176 Docs - fix download links in install instructions)
=======
<<<<<<< HEAD
<<<<<<< HEAD
<<<<<<< HEAD
>>>>>>> bf6bde0830 (Merge branch 'feature/postgis-fixes')

Then download and extract the binary distribution:
<<<<<<< HEAD
<<<<<<< HEAD
=======
>>>>>>> 16b2e83f2 (GEOMESA-3176 Docs - fix download links in install instructions)
<<<<<<< HEAD
>>>>>>> 90ec70f559 (GEOMESA-3176 Docs - fix download links in install instructions)
=======
>>>>>>> 15e9985047 (GEOMESA-3176 Docs - fix download links in install instructions)
=======
>>>>>>> 10ade3dcd1 (GEOMESA-3176 Docs - fix download links in install instructions)
=======
=======
>>>>>>> 3be8d2a5a (Merge branch 'feature/postgis-fixes')
>>>>>>> 1b25d7ddb4 (Merge branch 'feature/postgis-fixes')
=======
=======
>>>>>>> e944f1c88b (Merge branch 'feature/postgis-fixes')
=======
>>>>>>> 235bc2820d (GEOMESA-3176 Docs - fix download links in install instructions)
=======
>>>>>>> 26e5afc4ea (Merge branch 'feature/postgis-fixes')
=======
>>>>>>> 63a045a753 (GEOMESA-3254 Add Bloop build support)
=======
>>>>>>> 93fa8c797f (GEOMESA-3176 Docs - fix download links in install instructions)
=======
>>>>>>> c69897d7bd (Merge branch 'feature/postgis-fixes')
=======
>>>>>>> 3be8d2a5a (Merge branch 'feature/postgis-fixes')
=======
>>>>>>> 7813a31aa (GEOMESA-3176 Docs - fix download links in install instructions)
<<<<<<< HEAD
>>>>>>> 71c56e6b77 (GEOMESA-3176 Docs - fix download links in install instructions)
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
>>>>>>> cb6bda89b6 (Merge branch 'feature/postgis-fixes')
=======
>>>>>>> 09d87762c5 (GEOMESA-3254 Add Bloop build support)
=======
>>>>>>> 703374130f (GEOMESA-3176 Docs - fix download links in install instructions)
=======
>>>>>>> 699117eca9 (Merge branch 'feature/postgis-fixes')
=======
>>>>>>> 3be8d2a5a (Merge branch 'feature/postgis-fixes')
=======
>>>>>>> 2aa923cc9 (GEOMESA-3176 Docs - fix download links in install instructions)
<<<<<<< HEAD
>>>>>>> bdcaf0ab5e (GEOMESA-3176 Docs - fix download links in install instructions)
<<<<<<< HEAD
>>>>>>> 235bc2820d (GEOMESA-3176 Docs - fix download links in install instructions)
=======
=======
=======
=======
>>>>>>> 3be8d2a5a (Merge branch 'feature/postgis-fixes')
>>>>>>> db8d998aa (Merge branch 'feature/postgis-fixes')
<<<<<<< HEAD
>>>>>>> cb6bda89b6 (Merge branch 'feature/postgis-fixes')
<<<<<<< HEAD
>>>>>>> 26e5afc4ea (Merge branch 'feature/postgis-fixes')
=======
=======
=======
>>>>>>> d845d7c1b (GEOMESA-3254 Add Bloop build support)
>>>>>>> 09d87762c5 (GEOMESA-3254 Add Bloop build support)
>>>>>>> 63a045a753 (GEOMESA-3254 Add Bloop build support)
=======
<<<<<<< HEAD
>>>>>>> 088d9e36a5 (GEOMESA-3176 Docs - fix download links in install instructions)

.. parsed-literal::

    $ export TAG="|release_version|"
<<<<<<< HEAD
<<<<<<< HEAD
<<<<<<< HEAD
<<<<<<< HEAD
<<<<<<< HEAD
<<<<<<< HEAD
<<<<<<< HEAD
=======
>>>>>>> 6a26990f7 (GEOMESA-3176 Docs - fix download links in install instructions)
=======
>>>>>>> baa90e85a (GEOMESA-3176 Docs - fix download links in install instructions)
=======
=======
>>>>>>> 8cbe155de (GEOMESA-3176 Docs - fix download links in install instructions)
>>>>>>> 8150bc0e65 (GEOMESA-3176 Docs - fix download links in install instructions)
=======
=======
>>>>>>> 09d87762c5 (GEOMESA-3254 Add Bloop build support)
=======
>>>>>>> 8cbe155de (GEOMESA-3176 Docs - fix download links in install instructions)
=======
>>>>>>> 0fbf9e83e (GEOMESA-3176 Docs - fix download links in install instructions)
>>>>>>> 4d9f87a514 (GEOMESA-3176 Docs - fix download links in install instructions)
    $ export VERSION="|scala_binary_version|-${TAG}" # note: |scala_binary_version| is the Scala build version
=======
    # note: |scala_binary_version| is the Scala build version
    $ export VERSION="|scala_binary_version|-${TAG}"
>>>>>>> 90ec70f55 (GEOMESA-3176 Docs - fix download links in install instructions)
<<<<<<< HEAD
<<<<<<< HEAD
<<<<<<< HEAD
<<<<<<< HEAD
=======
>>>>>>> baa90e85a (GEOMESA-3176 Docs - fix download links in install instructions)
=======
>>>>>>> 8150bc0e65 (GEOMESA-3176 Docs - fix download links in install instructions)
=======
=======
>>>>>>> 0fbf9e83e (GEOMESA-3176 Docs - fix download links in install instructions)
>>>>>>> 4d9f87a514 (GEOMESA-3176 Docs - fix download links in install instructions)
=======
    # note: |scala_binary_version| is the Scala build version
    $ export VERSION="|scala_binary_version|-${TAG}"
>>>>>>> 15e998504 (GEOMESA-3176 Docs - fix download links in install instructions)
<<<<<<< HEAD
<<<<<<< HEAD
<<<<<<< HEAD
=======
>>>>>>> 6a26990f7 (GEOMESA-3176 Docs - fix download links in install instructions)
=======
>>>>>>> baa90e85a (GEOMESA-3176 Docs - fix download links in install instructions)
=======
=======
>>>>>>> 8cbe155de (GEOMESA-3176 Docs - fix download links in install instructions)
>>>>>>> 8150bc0e65 (GEOMESA-3176 Docs - fix download links in install instructions)
=======
=======
>>>>>>> 8cbe155de (GEOMESA-3176 Docs - fix download links in install instructions)
=======
>>>>>>> 0fbf9e83e (GEOMESA-3176 Docs - fix download links in install instructions)
>>>>>>> 4d9f87a514 (GEOMESA-3176 Docs - fix download links in install instructions)

Then download and extract the binary distribution:
<<<<<<< HEAD
<<<<<<< HEAD
<<<<<<< HEAD
<<<<<<< HEAD
<<<<<<< HEAD
<<<<<<< HEAD
>>>>>>> 983d0b0983 (GEOMESA-3176 Docs - fix download links in install instructions)
=======
=======
>>>>>>> 77f446aa59 (GEOMESA-3176 Docs - fix download links in install instructions)
=======
>>>>>>> e8cc4971c6 (Merge branch 'feature/postgis-fixes')
=======
>>>>>>> bdcaf0ab5e (GEOMESA-3176 Docs - fix download links in install instructions)
=======
<<<<<<< HEAD
=======
>>>>>>> db8d998aa (Merge branch 'feature/postgis-fixes')
>>>>>>> cb6bda89b6 (Merge branch 'feature/postgis-fixes')
=======
>>>>>>> 16b2e83f2 (GEOMESA-3176 Docs - fix download links in install instructions)
=======
>>>>>>> 10ade3dcd (GEOMESA-3176 Docs - fix download links in install instructions)
=======
=======
>>>>>>> 3be8d2a5a (Merge branch 'feature/postgis-fixes')
>>>>>>> 1b25d7ddb (Merge branch 'feature/postgis-fixes')

.. parsed-literal::
>>>>>>> 71adb695c5 (Merge branch 'feature/postgis-fixes')
<<<<<<< HEAD
<<<<<<< HEAD
>>>>>>> locatelli-main
=======
>>>>>>> locatelli-main
=======
>>>>>>> locatelli-main

<<<<<<< HEAD
<<<<<<< HEAD
<<<<<<< HEAD
<<<<<<< HEAD
<<<<<<< HEAD
<<<<<<< HEAD
<<<<<<< HEAD
.. parsed-literal::

    $ export TAG="|release_version|"
<<<<<<< HEAD
<<<<<<< HEAD
    $ export VERSION="|scala_binary_version|-${TAG}" # note: |scala_binary_version| is the Scala build version
=======
    # note: |scala_binary_version| is the Scala build version
    $ export VERSION="|scala_binary_version|-${TAG}"
>>>>>>> 90ec70f55 (GEOMESA-3176 Docs - fix download links in install instructions)
=======
    # note: |scala_binary_version| is the Scala build version
    $ export VERSION="|scala_binary_version|-${TAG}"
>>>>>>> 15e998504 (GEOMESA-3176 Docs - fix download links in install instructions)

Then download and extract the binary distribution:
<<<<<<< HEAD
>>>>>>> 308738bcef (GEOMESA-3176 Docs - fix download links in install instructions)

<<<<<<< HEAD
<<<<<<< HEAD
<<<<<<< HEAD
<<<<<<< HEAD
<<<<<<< HEAD
<<<<<<< HEAD
<<<<<<< HEAD
<<<<<<< HEAD
<<<<<<< HEAD
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
=======
<<<<<<< HEAD
<<<<<<< HEAD
<<<<<<< HEAD
=======
=======
>>>>>>> locatelli-main
=======
>>>>>>> locatelli-main
>>>>>>> 30559ea5c9 (Merge branch 'feature/postgis-fixes')

=======
>>>>>>> f0b9bd8121 (GEOMESA-3061 Converters - support bytes in Avro top-level union types (#2762))
=======
>>>>>>> c7403e8a5f (GEOMESA-3061 Converters - support bytes in Avro top-level union types (#2762))
=======
>>>>>>> 4ac5af223d (GEOMESA-3061 Converters - support bytes in Avro top-level union types (#2762))
=======
>>>>>>> 62a28bf2e7 (GEOMESA-3061 Converters - support bytes in Avro top-level union types (#2762))
=======
>>>>>>> 72919d0f84 (GEOMESA-3061 Converters - support bytes in Avro top-level union types (#2762))
.. note::
=======
=======
>>>>>>> ed25decdd5 (Merge branch 'feature/postgis-fixes')
=======
>>>>>>> 80c85285b7 (GEOMESA-3176 Docs - fix download links in install instructions)
=======
=======
>>>>>>> e8cc4971c6 (Merge branch 'feature/postgis-fixes')
>>>>>>> f893d9a594 (Merge branch 'feature/postgis-fixes')
=======
=======
>>>>>>> 77f446aa59 (GEOMESA-3176 Docs - fix download links in install instructions)
>>>>>>> 16b2e83f2 (GEOMESA-3176 Docs - fix download links in install instructions)

.. parsed-literal::
>>>>>>> 165fb93a09 (GEOMESA-3176 Docs - fix download links in install instructions)

<<<<<<< HEAD
  In the following examples, replace ``${TAG}`` with the corresponding GeoMesa version (e.g. |release_version|), and
  ``${VERSION}`` with the appropriate Scala plus GeoMesa versions (e.g. |scala_release_version|).
<<<<<<< HEAD
<<<<<<< HEAD
<<<<<<< HEAD
<<<<<<< HEAD
<<<<<<< HEAD
<<<<<<< HEAD
<<<<<<< HEAD
=======
>>>>>>> 3be8d2a5a (Merge branch 'feature/postgis-fixes')
=======
>>>>>>> d845d7c1bd (GEOMESA-3254 Add Bloop build support)
=======
>>>>>>> 6d9a5b626c (GEOMESA-3061 Converters - support bytes in Avro top-level union types (#2762))
=======
>>>>>>> 10ade3dcd1 (GEOMESA-3176 Docs - fix download links in install instructions)
=======
=======
<<<<<<< HEAD
<<<<<<< HEAD
=======
>>>>>>> bf6bde0830 (Merge branch 'feature/postgis-fixes')
>>>>>>> c69897d7bd (Merge branch 'feature/postgis-fixes')
=======
>>>>>>> 16b2e83f2 (GEOMESA-3176 Docs - fix download links in install instructions)
>>>>>>> 93fa8c797f (GEOMESA-3176 Docs - fix download links in install instructions)
=======
=======
>>>>>>> 3be8d2a5a4 (Merge branch 'feature/postgis-fixes')
>>>>>>> 4c41429da9 (Merge branch 'feature/postgis-fixes')
=======
>>>>>>> 16b2e83f2 (GEOMESA-3176 Docs - fix download links in install instructions)
>>>>>>> 93fa8c797f (GEOMESA-3176 Docs - fix download links in install instructions)
>>>>>>> 088d9e36a5 (GEOMESA-3176 Docs - fix download links in install instructions)

>>>>>>> 8dec77199d (GEOMESA-3176 Docs - fix download links in install instructions)
<<<<<<< HEAD
<<<<<<< HEAD
<<<<<<< HEAD
<<<<<<< HEAD
<<<<<<< HEAD
<<<<<<< HEAD
<<<<<<< HEAD
<<<<<<< HEAD
<<<<<<< HEAD
<<<<<<< HEAD
<<<<<<< HEAD
<<<<<<< HEAD
<<<<<<< HEAD
<<<<<<< HEAD
<<<<<<< HEAD
<<<<<<< HEAD
<<<<<<< HEAD
<<<<<<< HEAD
<<<<<<< HEAD
<<<<<<< HEAD
<<<<<<< HEAD
<<<<<<< HEAD
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
>>>>>>> a30a0c1a2a (Merge branch 'feature/postgis-fixes')
<<<<<<< HEAD
<<<<<<< HEAD
>>>>>>> locatelli-main
=======
>>>>>>> locatelli-main
=======
>>>>>>> locatelli-main
=======
<<<<<<< HEAD
=======
>>>>>>> 30559ea5c9 (Merge branch 'feature/postgis-fixes')

=======
>>>>>>> f0b9bd8121 (GEOMESA-3061 Converters - support bytes in Avro top-level union types (#2762))
=======
>>>>>>> 66dbbce00d (GEOMESA-3061 Converters - support bytes in Avro top-level union types (#2762))
.. note::

  In the following examples, replace ``${TAG}`` with the corresponding GeoMesa version (e.g. |release_version|), and
  ``${VERSION}`` with the appropriate Scala plus GeoMesa versions (e.g. |scala_release_version|).
<<<<<<< HEAD
<<<<<<< HEAD
=======
>>>>>>> 3be8d2a5a (Merge branch 'feature/postgis-fixes')
=======
>>>>>>> d845d7c1bd (GEOMESA-3254 Add Bloop build support)
=======
>>>>>>> 6d9a5b626c (GEOMESA-3061 Converters - support bytes in Avro top-level union types (#2762))
=======
>>>>>>> 10ade3dcd1 (GEOMESA-3176 Docs - fix download links in install instructions)
=======
=======
>>>>>>> c69897d7bd (Merge branch 'feature/postgis-fixes')
=======
>>>>>>> 16b2e83f2 (GEOMESA-3176 Docs - fix download links in install instructions)
>>>>>>> 93fa8c797f (GEOMESA-3176 Docs - fix download links in install instructions)

>>>>>>> 8dec77199d (GEOMESA-3176 Docs - fix download links in install instructions)
<<<<<<< HEAD
<<<<<<< HEAD
<<<<<<< HEAD
<<<<<<< HEAD
<<<<<<< HEAD
<<<<<<< HEAD
<<<<<<< HEAD
<<<<<<< HEAD
<<<<<<< HEAD
<<<<<<< HEAD
<<<<<<< HEAD
<<<<<<< HEAD
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
>>>>>>> 3dd99aed4 (GEOMESA-3061 Converters - support bytes in Avro top-level union types (#2762))
=======
>>>>>>> 4524373ac (GEOMESA-3061 Converters - support bytes in Avro top-level union types (#2762))
=======
>>>>>>> 4fbe39c62 (GEOMESA-3061 Converters - support bytes in Avro top-level union types (#2762))
=======
>>>>>>> 8150bc0e65 (GEOMESA-3176 Docs - fix download links in install instructions)
<<<<<<< HEAD
<<<<<<< HEAD
<<<<<<< HEAD
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
<<<<<<< HEAD
=======
>>>>>>> 0b168af9c8 (GEOMESA-3176 Docs - fix download links in install instructions)
=======
>>>>>>> dcbf9c4320 (GEOMESA-3061 Converters - support bytes in Avro top-level union types (#2762))
<<<<<<< HEAD
<<<<<<< HEAD
>>>>>>> locatelli-main
=======
>>>>>>> locatelli-main
=======
>>>>>>> locatelli-main
=======
=======
>>>>>>> 4d9f87a514 (GEOMESA-3176 Docs - fix download links in install instructions)
=======
>>>>>>> 5f428db97 (GEOMESA-3061 Converters - support bytes in Avro top-level union types (#2762))
>>>>>>> 6a2cd10c1c (GEOMESA-3061 Converters - support bytes in Avro top-level union types (#2762))
=======
=======
<<<<<<< HEAD
<<<<<<< HEAD
<<<<<<< HEAD
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
<<<<<<< HEAD
=======
>>>>>>> ce19d9c8bd (GEOMESA-3061 Converters - support bytes in Avro top-level union types (#2762))
=======
>>>>>>> dcc9d7f708 (GEOMESA-3176 Docs - fix download links in install instructions)
<<<<<<< HEAD
<<<<<<< HEAD
>>>>>>> locatelli-main
=======
>>>>>>> locatelli-main
=======
>>>>>>> locatelli-main
>>>>>>> bd3233180f (GEOMESA-3176 Docs - fix download links in install instructions)
=======
>>>>>>> 0c734cda2b (GEOMESA-3061 Converters - support bytes in Avro top-level union types (#2762))
=======
<<<<<<< HEAD
<<<<<<< HEAD
<<<<<<< HEAD
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
<<<<<<< HEAD
=======
>>>>>>> 8a2d92d131 (GEOMESA-3061 Converters - support bytes in Avro top-level union types (#2762))
=======
>>>>>>> f7b6b53d97 (GEOMESA-3061 Converters - support bytes in Avro top-level union types (#2762))
<<<<<<< HEAD
<<<<<<< HEAD
>>>>>>> locatelli-main
=======
>>>>>>> locatelli-main
=======
>>>>>>> locatelli-main
>>>>>>> 67e4c1354f (GEOMESA-3061 Converters - support bytes in Avro top-level union types (#2762))
=======
>>>>>>> 703374130f (GEOMESA-3176 Docs - fix download links in install instructions)
=======
<<<<<<< HEAD
<<<<<<< HEAD
<<<<<<< HEAD
<<<<<<< HEAD
=======
<<<<<<< HEAD
=======
>>>>>>> locatelli-main
<<<<<<< HEAD
<<<<<<< HEAD
=======
>>>>>>> c04d2a7e80 (GEOMESA-3176 Docs - fix download links in install instructions)
<<<<<<< HEAD
>>>>>>> locatelli-main
=======
>>>>>>> locatelli-main
=======
<<<<<<< HEAD
=======
>>>>>>> c04d2a7e80 (GEOMESA-3176 Docs - fix download links in install instructions)
>>>>>>> locatelli-main
=======
>>>>>>> c91f823574 (GEOMESA-3061 Converters - support bytes in Avro top-level union types (#2762))
=======
>>>>>>> 67e4c1354f (GEOMESA-3061 Converters - support bytes in Avro top-level union types (#2762))
=======
>>>>>>> a52e4429be (GEOMESA-3061 Converters - support bytes in Avro top-level union types (#2762))
<<<<<<< HEAD
<<<<<<< HEAD
=======
>>>>>>> 8dec77199d (GEOMESA-3176 Docs - fix download links in install instructions)
=======
<<<<<<< HEAD
<<<<<<< HEAD
=======
>>>>>>> locatelli-main
<<<<<<< HEAD
=======
>>>>>>> 8dec77199d (GEOMESA-3176 Docs - fix download links in install instructions)
=======
=======
>>>>>>> locatelli-main
>>>>>>> 67e4c1354f (GEOMESA-3061 Converters - support bytes in Avro top-level union types (#2762))
=======
>>>>>>> 1ea8b10ac7 (GEOMESA-3061 Converters - support bytes in Avro top-level union types (#2762))
=======
>>>>>>> 088d9e36a5 (GEOMESA-3176 Docs - fix download links in install instructions)
=======
=======
>>>>>>> c91f823574 (GEOMESA-3061 Converters - support bytes in Avro top-level union types (#2762))
>>>>>>> 8a2d92d131 (GEOMESA-3061 Converters - support bytes in Avro top-level union types (#2762))
=======
>>>>>>> f7b6b53d97 (GEOMESA-3061 Converters - support bytes in Avro top-level union types (#2762))
=======
=======
>>>>>>> 8dec77199d (GEOMESA-3176 Docs - fix download links in install instructions)
>>>>>>> c04d2a7e80 (GEOMESA-3176 Docs - fix download links in install instructions)
<<<<<<< HEAD
<<<<<<< HEAD
>>>>>>> locatelli-main
=======
>>>>>>> locatelli-main
=======
>>>>>>> locatelli-main
>>>>>>> 5f428db97 (GEOMESA-3061 Converters - support bytes in Avro top-level union types (#2762))
=======
>>>>>>> 89bdd3013 (GEOMESA-3061 Converters - support bytes in Avro top-level union types (#2762))
<<<<<<< HEAD
>>>>>>> 8a6a96234b (GEOMESA-3061 Converters - support bytes in Avro top-level union types (#2762))
=======
=======
>>>>>>> 72bafaf54 (GEOMESA-3061 Converters - support bytes in Avro top-level union types (#2762))
<<<<<<< HEAD
<<<<<<< HEAD
<<<<<<< HEAD
<<<<<<< HEAD
<<<<<<< HEAD
<<<<<<< HEAD
=======
>>>>>>> a52e4429be (GEOMESA-3061 Converters - support bytes in Avro top-level union types (#2762))
=======
<<<<<<< HEAD
=======
>>>>>>> locatelli-main
<<<<<<< HEAD
=======
>>>>>>> locatelli-main
<<<<<<< HEAD
=======
>>>>>>> a52e4429be (GEOMESA-3061 Converters - support bytes in Avro top-level union types (#2762))
=======
>>>>>>> 1ea8b10ac7 (GEOMESA-3061 Converters - support bytes in Avro top-level union types (#2762))
=======
>>>>>>> 8a2d92d131 (GEOMESA-3061 Converters - support bytes in Avro top-level union types (#2762))
=======
=======
>>>>>>> a52e4429be (GEOMESA-3061 Converters - support bytes in Avro top-level union types (#2762))
>>>>>>> f7b6b53d97 (GEOMESA-3061 Converters - support bytes in Avro top-level union types (#2762))
<<<<<<< HEAD
<<<<<<< HEAD
>>>>>>> locatelli-main
=======
>>>>>>> locatelli-main
=======
>>>>>>> locatelli-main
>>>>>>> 0c734cda2b (GEOMESA-3061 Converters - support bytes in Avro top-level union types (#2762))
=======
=======
>>>>>>> 6d9a5b626 (GEOMESA-3061 Converters - support bytes in Avro top-level union types (#2762))
>>>>>>> 67e4c1354f (GEOMESA-3061 Converters - support bytes in Avro top-level union types (#2762))
<<<<<<< HEAD
<<<<<<< HEAD
<<<<<<< HEAD
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
<<<<<<< HEAD
=======
>>>>>>> f7b6b53d97 (GEOMESA-3061 Converters - support bytes in Avro top-level union types (#2762))
=======
>>>>>>> b8545eda8f (GEOMESA-3061 Converters - support bytes in Avro top-level union types (#2762))
<<<<<<< HEAD
<<<<<<< HEAD
>>>>>>> locatelli-main
=======
>>>>>>> locatelli-main
=======
>>>>>>> locatelli-main
=======
>>>>>>> c1f99f4bcb (GEOMESA-3061 Converters - support bytes in Avro top-level union types (#2762))
=======
>>>>>>> 338d952d43 (GEOMESA-3061 Converters - support bytes in Avro top-level union types (#2762))
<<<<<<< HEAD
<<<<<<< HEAD
<<<<<<< HEAD
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
<<<<<<< HEAD
=======
>>>>>>> 420027bc3f (GEOMESA-3061 Converters - support bytes in Avro top-level union types (#2762))
=======
>>>>>>> fc1024de7e (GEOMESA-3061 Converters - support bytes in Avro top-level union types (#2762))
<<<<<<< HEAD
<<<<<<< HEAD
>>>>>>> locatelli-main
=======
>>>>>>> locatelli-main
=======
>>>>>>> locatelli-main
=======
>>>>>>> 9627a2de6a (GEOMESA-3061 Converters - support bytes in Avro top-level union types (#2762))
=======
>>>>>>> 76908c410a (GEOMESA-3061 Converters - support bytes in Avro top-level union types (#2762))
<<<<<<< HEAD
<<<<<<< HEAD
<<<<<<< HEAD
<<<<<<< HEAD
=======
<<<<<<< HEAD
=======
>>>>>>> locatelli-main
<<<<<<< HEAD
<<<<<<< HEAD
=======
>>>>>>> 8435590eee (GEOMESA-3061 Converters - support bytes in Avro top-level union types (#2762))
<<<<<<< HEAD
>>>>>>> locatelli-main
=======
>>>>>>> locatelli-main
=======
<<<<<<< HEAD
=======
>>>>>>> 8435590eee (GEOMESA-3061 Converters - support bytes in Avro top-level union types (#2762))
>>>>>>> locatelli-main
=======
>>>>>>> 30cd5ab927 (GEOMESA-3061 Converters - support bytes in Avro top-level union types (#2762))
=======
>>>>>>> ffe4f9fd41 (GEOMESA-3061 Converters - support bytes in Avro top-level union types (#2762))
<<<<<<< HEAD
<<<<<<< HEAD
=======
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
>>>>>>> ecddd8c3e7 (GEOMESA-3061 Converters - support bytes in Avro top-level union types (#2762))
=======
>>>>>>> 036a470d76 (GEOMESA-3061 Converters - support bytes in Avro top-level union types (#2762))
<<<<<<< HEAD
<<<<<<< HEAD
=======
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
>>>>>>> ecd45f2c3e (GEOMESA-3176 Docs - fix download links in install instructions)
=======
=======
=======
<<<<<<< HEAD
<<<<<<< HEAD
=======
<<<<<<< HEAD
<<<<<<< HEAD
<<<<<<< HEAD
=======
>>>>>>> 84e5c6b001 (GEOMESA-3176 Docs - fix download links in install instructions)
>>>>>>> locatelli-main
=======
<<<<<<< HEAD
=======
>>>>>>> 84e5c6b001 (GEOMESA-3176 Docs - fix download links in install instructions)
>>>>>>> locatelli-main
=======
>>>>>>> 84e5c6b001 (GEOMESA-3176 Docs - fix download links in install instructions)
>>>>>>> locatelli-main
>>>>>>> 4d9f87a514 (GEOMESA-3176 Docs - fix download links in install instructions)
=======
>>>>>>> 5f428db97 (GEOMESA-3061 Converters - support bytes in Avro top-level union types (#2762))
>>>>>>> 6a2cd10c1c (GEOMESA-3061 Converters - support bytes in Avro top-level union types (#2762))
>>>>>>> 6fc8851879 (GEOMESA-3061 Converters - support bytes in Avro top-level union types (#2762))
=======
=======
>>>>>>> bd3233180f (GEOMESA-3176 Docs - fix download links in install instructions)
=======
>>>>>>> cabde54511 (GEOMESA-3176 Docs - fix download links in install instructions)
<<<<<<< HEAD
<<<<<<< HEAD
<<<<<<< HEAD
>>>>>>> 5f428db97 (GEOMESA-3061 Converters - support bytes in Avro top-level union types (#2762))
=======
>>>>>>> 89bdd3013 (GEOMESA-3061 Converters - support bytes in Avro top-level union types (#2762))
>>>>>>> 8a6a96234b (GEOMESA-3061 Converters - support bytes in Avro top-level union types (#2762))
=======
=======
>>>>>>> locatelli-main
=======
>>>>>>> locatelli-main
=======
>>>>>>> 9d2bdda5fd (GEOMESA-3061 Converters - support bytes in Avro top-level union types (#2762))
=======
>>>>>>> bd3233180f (GEOMESA-3176 Docs - fix download links in install instructions)
=======
>>>>>>> 96b5e91bc8 (GEOMESA-3176 Docs - fix download links in install instructions)
=======
>>>>>>> 6e48efcdc2 (GEOMESA-3061 Converters - support bytes in Avro top-level union types (#2762))
>>>>>>> 5f428db97 (GEOMESA-3061 Converters - support bytes in Avro top-level union types (#2762))
=======
>>>>>>> 89bdd3013 (GEOMESA-3061 Converters - support bytes in Avro top-level union types (#2762))
<<<<<<< HEAD
>>>>>>> 8a6a96234b (GEOMESA-3061 Converters - support bytes in Avro top-level union types (#2762))
<<<<<<< HEAD
<<<<<<< HEAD
<<<<<<< HEAD
<<<<<<< HEAD
>>>>>>> locatelli-main
=======
>>>>>>> locatelli-main
=======
>>>>>>> locatelli-main
>>>>>>> 6514df9383 (GEOMESA-3061 Converters - support bytes in Avro top-level union types (#2762))
=======
>>>>>>> 0c734cda2b (GEOMESA-3061 Converters - support bytes in Avro top-level union types (#2762))
>>>>>>> c91f823574 (GEOMESA-3061 Converters - support bytes in Avro top-level union types (#2762))
=======
>>>>>>> a52e4429be (GEOMESA-3061 Converters - support bytes in Avro top-level union types (#2762))
=======
=======
>>>>>>> c1f99f4bcb (GEOMESA-3061 Converters - support bytes in Avro top-level union types (#2762))
>>>>>>> c9c24ca3d7 (GEOMESA-3061 Converters - support bytes in Avro top-level union types (#2762))
<<<<<<< HEAD
<<<<<<< HEAD
=======
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
>>>>>>> b9c0fc77b9 (GEOMESA-3061 Converters - support bytes in Avro top-level union types (#2762))
=======
=======
>>>>>>> 9627a2de6a (GEOMESA-3061 Converters - support bytes in Avro top-level union types (#2762))
>>>>>>> d69216810e (GEOMESA-3061 Converters - support bytes in Avro top-level union types (#2762))
<<<<<<< HEAD
<<<<<<< HEAD
=======
>>>>>>> 17f16286aa (GEOMESA-3061 Converters - support bytes in Avro top-level union types (#2762))
<<<<<<< HEAD
.. note::
=======
=======
=======
<<<<<<< HEAD
=======
>>>>>>> locatelli-main
<<<<<<< HEAD
=======
>>>>>>> 17f16286aa (GEOMESA-3061 Converters - support bytes in Avro top-level union types (#2762))
=======
>>>>>>> locatelli-main
=======
>>>>>>> eff03389ef (GEOMESA-3176 Docs - fix download links in install instructions)
=======
=======
=======
>>>>>>> 4d9f87a514 (GEOMESA-3176 Docs - fix download links in install instructions)
=======
>>>>>>> 5f428db97 (GEOMESA-3061 Converters - support bytes in Avro top-level union types (#2762))
>>>>>>> 6a2cd10c1c (GEOMESA-3061 Converters - support bytes in Avro top-level union types (#2762))
>>>>>>> 65b9e1925e (GEOMESA-3061 Converters - support bytes in Avro top-level union types (#2762))
=======
>>>>>>> 9d2bdda5fd (GEOMESA-3061 Converters - support bytes in Avro top-level union types (#2762))
=======
=======
=======
>>>>>>> 72bafaf54 (GEOMESA-3061 Converters - support bytes in Avro top-level union types (#2762))
>>>>>>> 0c734cda2b (GEOMESA-3061 Converters - support bytes in Avro top-level union types (#2762))
>>>>>>> 6e48efcdc2 (GEOMESA-3061 Converters - support bytes in Avro top-level union types (#2762))
=======
>>>>>>> 1ea8b10ac7 (GEOMESA-3061 Converters - support bytes in Avro top-level union types (#2762))
=======
=======
>>>>>>> c1f99f4bcb (GEOMESA-3061 Converters - support bytes in Avro top-level union types (#2762))
>>>>>>> 2bce465a3f (GEOMESA-3061 Converters - support bytes in Avro top-level union types (#2762))
=======
>>>>>>> 1f17117603 (GEOMESA-3061 Converters - support bytes in Avro top-level union types (#2762))
=======
=======
>>>>>>> 9627a2de6a (GEOMESA-3061 Converters - support bytes in Avro top-level union types (#2762))
>>>>>>> 732efe4910 (GEOMESA-3061 Converters - support bytes in Avro top-level union types (#2762))
=======
>>>>>>> f91e29a57f (GEOMESA-3061 Converters - support bytes in Avro top-level union types (#2762))
=======
=======
>>>>>>> 30cd5ab927 (GEOMESA-3061 Converters - support bytes in Avro top-level union types (#2762))
>>>>>>> b8be7d30a1 (GEOMESA-3061 Converters - support bytes in Avro top-level union types (#2762))
=======
>>>>>>> 789f6eba49 (GEOMESA-3061 Converters - support bytes in Avro top-level union types (#2762))
=======
=======
>>>>>>> ecddd8c3e7 (GEOMESA-3061 Converters - support bytes in Avro top-level union types (#2762))
>>>>>>> 4fc0f66d4f (GEOMESA-3061 Converters - support bytes in Avro top-level union types (#2762))
=======
>>>>>>> 437d0aab1c (GEOMESA-3061 Converters - support bytes in Avro top-level union types (#2762))
=======
=======
>>>>>>> ecd45f2c3e (GEOMESA-3176 Docs - fix download links in install instructions)
>>>>>>> 0b168af9c8 (GEOMESA-3176 Docs - fix download links in install instructions)
=======
>>>>>>> 5f428db97 (GEOMESA-3061 Converters - support bytes in Avro top-level union types (#2762))
>>>>>>> 6a2cd10c1c (GEOMESA-3061 Converters - support bytes in Avro top-level union types (#2762))
>>>>>>> 6fc8851879 (GEOMESA-3061 Converters - support bytes in Avro top-level union types (#2762))
<<<<<<< HEAD
>>>>>>> dcbf9c4320 (GEOMESA-3061 Converters - support bytes in Avro top-level union types (#2762))
=======
=======
=======
>>>>>>> bd3233180f (GEOMESA-3176 Docs - fix download links in install instructions)
=======
>>>>>>> cabde54511 (GEOMESA-3176 Docs - fix download links in install instructions)
>>>>>>> 5f428db97 (GEOMESA-3061 Converters - support bytes in Avro top-level union types (#2762))
=======
>>>>>>> 89bdd3013 (GEOMESA-3061 Converters - support bytes in Avro top-level union types (#2762))
>>>>>>> 8a6a96234b (GEOMESA-3061 Converters - support bytes in Avro top-level union types (#2762))
>>>>>>> 6514df9383 (GEOMESA-3061 Converters - support bytes in Avro top-level union types (#2762))
<<<<<<< HEAD
>>>>>>> ce19d9c8bd (GEOMESA-3061 Converters - support bytes in Avro top-level union types (#2762))
=======
=======
>>>>>>> 0c734cda2b (GEOMESA-3061 Converters - support bytes in Avro top-level union types (#2762))
>>>>>>> c91f823574 (GEOMESA-3061 Converters - support bytes in Avro top-level union types (#2762))
<<<<<<< HEAD
>>>>>>> 8a2d92d131 (GEOMESA-3061 Converters - support bytes in Avro top-level union types (#2762))
=======
=======
>>>>>>> a52e4429be (GEOMESA-3061 Converters - support bytes in Avro top-level union types (#2762))
>>>>>>> f7b6b53d97 (GEOMESA-3061 Converters - support bytes in Avro top-level union types (#2762))
=======
>>>>>>> b8545eda8f (GEOMESA-3061 Converters - support bytes in Avro top-level union types (#2762))
=======
=======
>>>>>>> b9c0fc77b9 (GEOMESA-3061 Converters - support bytes in Avro top-level union types (#2762))
>>>>>>> 420027bc3f (GEOMESA-3061 Converters - support bytes in Avro top-level union types (#2762))
=======
>>>>>>> fc1024de7e (GEOMESA-3061 Converters - support bytes in Avro top-level union types (#2762))
=======
=======
>>>>>>> 17f16286aa (GEOMESA-3061 Converters - support bytes in Avro top-level union types (#2762))
>>>>>>> 8435590eee (GEOMESA-3061 Converters - support bytes in Avro top-level union types (#2762))
.. note::
=======
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
>>>>>>> 67de3c3202 (Merge branch 'feature/postgis-fixes')
=======
>>>>>>> e007dde981 (GEOMESA-3176 Docs - fix download links in install instructions)
=======
<<<<<<< HEAD
<<<<<<< HEAD
=======
<<<<<<< HEAD
<<<<<<< HEAD
=======
>>>>>>> locatelli-main
<<<<<<< HEAD
=======
>>>>>>> 7b2b25cc3c (GEOMESA-3176 Docs - fix download links in install instructions)
=======
>>>>>>> b6e56a9e80 (Merge branch 'feature/postgis-fixes')
<<<<<<< HEAD
>>>>>>> locatelli-main
=======
>>>>>>> locatelli-main
=======
>>>>>>> 7b2b25cc3c (GEOMESA-3176 Docs - fix download links in install instructions)
=======
>>>>>>> b6e56a9e80 (Merge branch 'feature/postgis-fixes')
>>>>>>> locatelli-main
=======
>>>>>>> 7b2b25cc3c (GEOMESA-3176 Docs - fix download links in install instructions)
=======
>>>>>>> e8cc4971c6 (Merge branch 'feature/postgis-fixes')
>>>>>>> 638b68d081 (Merge branch 'feature/postgis-fixes')
=======
<<<<<<< HEAD
<<<<<<< HEAD
>>>>>>> bdcaf0ab5e (GEOMESA-3176 Docs - fix download links in install instructions)
=======
<<<<<<< HEAD
<<<<<<< HEAD
>>>>>>> 64eaf6b132 (Merge branch 'feature/postgis-fixes')
=======
=======
<<<<<<< HEAD
=======
>>>>>>> locatelli-main
<<<<<<< HEAD
>>>>>>> bdcaf0ab5e (GEOMESA-3176 Docs - fix download links in install instructions)
=======
<<<<<<< HEAD
=======
>>>>>>> locatelli-main
=======
>>>>>>> 3f60902092 (GEOMESA-3176 Docs - fix download links in install instructions)
=======
>>>>>>> 67de3c3202 (Merge branch 'feature/postgis-fixes')
=======
>>>>>>> 217b7d1cb9 (Merge branch 'feature/postgis-fixes')
=======
>>>>>>> 682ce8edbb (GEOMESA-3176 Docs - fix download links in install instructions)
=======
>>>>>>> b6e56a9e80 (Merge branch 'feature/postgis-fixes')
=======
>>>>>>> bdcaf0ab5e (GEOMESA-3176 Docs - fix download links in install instructions)
=======
>>>>>>> 7f7083f095 (GEOMESA-3176 Docs - fix download links in install instructions)
=======
<<<<<<< HEAD
>>>>>>> 64eaf6b132 (Merge branch 'feature/postgis-fixes')
=======
>>>>>>> 79bf541ac8 (Merge branch 'feature/postgis-fixes')
<<<<<<< HEAD
<<<<<<< HEAD
>>>>>>> locatelli-main
=======
>>>>>>> locatelli-main
=======
>>>>>>> locatelli-main
>>>>>>> 16b2e83f2 (GEOMESA-3176 Docs - fix download links in install instructions)

.. parsed-literal::
>>>>>>> 86bc039842 (GEOMESA-3176 Docs - fix download links in install instructions)

<<<<<<< HEAD
  In the following examples, replace ``${TAG}`` with the corresponding GeoMesa version (e.g. |release_version|), and
  ``${VERSION}`` with the appropriate Scala plus GeoMesa versions (e.g. |scala_release_version|).
<<<<<<< HEAD
<<<<<<< HEAD
<<<<<<< HEAD
<<<<<<< HEAD
<<<<<<< HEAD
<<<<<<< HEAD
<<<<<<< HEAD
<<<<<<< HEAD
<<<<<<< HEAD
<<<<<<< HEAD
<<<<<<< HEAD
<<<<<<< HEAD
<<<<<<< HEAD
<<<<<<< HEAD
<<<<<<< HEAD
<<<<<<< HEAD
<<<<<<< HEAD
<<<<<<< HEAD
<<<<<<< HEAD
<<<<<<< HEAD
<<<<<<< HEAD
<<<<<<< HEAD
<<<<<<< HEAD
<<<<<<< HEAD
<<<<<<< HEAD
<<<<<<< HEAD
<<<<<<< HEAD
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
<<<<<<< HEAD
<<<<<<< HEAD
<<<<<<< HEAD
<<<<<<< HEAD
<<<<<<< HEAD
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
>>>>>>> f9f6fde40b (GEOMESA-3061 Converters - support bytes in Avro top-level union types (#2762))
>>>>>>> 16e2b07c5b (GEOMESA-3061 Converters - support bytes in Avro top-level union types (#2762))
=======
>>>>>>> ce19d9c8bd (GEOMESA-3061 Converters - support bytes in Avro top-level union types (#2762))
=======
>>>>>>> 8a2d92d131 (GEOMESA-3061 Converters - support bytes in Avro top-level union types (#2762))
=======
>>>>>>> 0a5b74c946 (Merge branch 'feature/postgis-fixes')
=======
>>>>>>> f7b6b53d97 (GEOMESA-3061 Converters - support bytes in Avro top-level union types (#2762))
=======
>>>>>>> b8545eda8f (GEOMESA-3061 Converters - support bytes in Avro top-level union types (#2762))
=======
>>>>>>> 420027bc3f (GEOMESA-3061 Converters - support bytes in Avro top-level union types (#2762))
=======
>>>>>>> fc1024de7e (GEOMESA-3061 Converters - support bytes in Avro top-level union types (#2762))
=======
>>>>>>> 8435590eee (GEOMESA-3061 Converters - support bytes in Avro top-level union types (#2762))
=======
>>>>>>> cc93e0930d (Merge branch 'feature/postgis-fixes')
<<<<<<< HEAD
<<<<<<< HEAD
>>>>>>> locatelli-main
=======
>>>>>>> locatelli-main
=======
>>>>>>> locatelli-main
=======
>>>>>>> 6fc8851879 (GEOMESA-3061 Converters - support bytes in Avro top-level union types (#2762))
=======
>>>>>>> 6514df9383 (GEOMESA-3061 Converters - support bytes in Avro top-level union types (#2762))
=======
<<<<<<< HEAD
<<<<<<< HEAD
<<<<<<< HEAD
=======
<<<<<<< HEAD
<<<<<<< HEAD
>>>>>>> locatelli-main
=======
<<<<<<< HEAD
>>>>>>> locatelli-main
=======
>>>>>>> locatelli-main
>>>>>>> c91f823574 (GEOMESA-3061 Converters - support bytes in Avro top-level union types (#2762))
=======
>>>>>>> 71adb695c5 (Merge branch 'feature/postgis-fixes')
=======
<<<<<<< HEAD
<<<<<<< HEAD
<<<<<<< HEAD
=======
<<<<<<< HEAD
<<<<<<< HEAD
>>>>>>> locatelli-main
=======
<<<<<<< HEAD
>>>>>>> locatelli-main
=======
>>>>>>> locatelli-main
>>>>>>> a52e4429be (GEOMESA-3061 Converters - support bytes in Avro top-level union types (#2762))
=======
>>>>>>> c9c24ca3d7 (GEOMESA-3061 Converters - support bytes in Avro top-level union types (#2762))
=======
<<<<<<< HEAD
<<<<<<< HEAD
<<<<<<< HEAD
=======
<<<<<<< HEAD
<<<<<<< HEAD
>>>>>>> locatelli-main
=======
<<<<<<< HEAD
>>>>>>> locatelli-main
=======
>>>>>>> locatelli-main
>>>>>>> b9c0fc77b9 (GEOMESA-3061 Converters - support bytes in Avro top-level union types (#2762))
=======
>>>>>>> d69216810e (GEOMESA-3061 Converters - support bytes in Avro top-level union types (#2762))
=======
<<<<<<< HEAD
<<<<<<< HEAD
<<<<<<< HEAD
=======
<<<<<<< HEAD
<<<<<<< HEAD
>>>>>>> locatelli-main
=======
<<<<<<< HEAD
>>>>>>> locatelli-main
=======
>>>>>>> locatelli-main
>>>>>>> 17f16286aa (GEOMESA-3061 Converters - support bytes in Avro top-level union types (#2762))
=======
>>>>>>> ec6d06b576 (Merge branch 'feature/postgis-fixes')
=======
<<<<<<< HEAD
<<<<<<< HEAD
<<<<<<< HEAD
=======
<<<<<<< HEAD
=======
>>>>>>> locatelli-main
=======
>>>>>>> locatelli-main
>>>>>>> 65b9e1925e (GEOMESA-3061 Converters - support bytes in Avro top-level union types (#2762))
=======
>>>>>>> 9d2bdda5fd (GEOMESA-3061 Converters - support bytes in Avro top-level union types (#2762))
=======
>>>>>>> 6e48efcdc2 (GEOMESA-3061 Converters - support bytes in Avro top-level union types (#2762))
=======
>>>>>>> 964e86145a (Merge branch 'feature/postgis-fixes')
=======
>>>>>>> 1ea8b10ac7 (GEOMESA-3061 Converters - support bytes in Avro top-level union types (#2762))
=======
>>>>>>> 2bce465a3f (GEOMESA-3061 Converters - support bytes in Avro top-level union types (#2762))
=======
>>>>>>> 1f17117603 (GEOMESA-3061 Converters - support bytes in Avro top-level union types (#2762))
=======
>>>>>>> 732efe4910 (GEOMESA-3061 Converters - support bytes in Avro top-level union types (#2762))
=======
>>>>>>> f91e29a57f (GEOMESA-3061 Converters - support bytes in Avro top-level union types (#2762))
=======
>>>>>>> 354b5e5ae5 (Merge branch 'feature/postgis-fixes')
=======
>>>>>>> b8be7d30a1 (GEOMESA-3061 Converters - support bytes in Avro top-level union types (#2762))
=======
>>>>>>> 789f6eba49 (GEOMESA-3061 Converters - support bytes in Avro top-level union types (#2762))
=======
>>>>>>> 4fc0f66d4f (GEOMESA-3061 Converters - support bytes in Avro top-level union types (#2762))
=======
>>>>>>> 437d0aab1c (GEOMESA-3061 Converters - support bytes in Avro top-level union types (#2762))
=======
>>>>>>> d581fa3e8f (Merge branch 'feature/postgis-fixes')
=======
>>>>>>> 3676d4e56a (GEOMESA-3061 Converters - support bytes in Avro top-level union types (#2762))
=======
>>>>>>> a38834fade (GEOMESA-3061 Converters - support bytes in Avro top-level union types (#2762))
=======
=======
>>>>>>> 6fc8851879 (GEOMESA-3061 Converters - support bytes in Avro top-level union types (#2762))
>>>>>>> dcbf9c4320 (GEOMESA-3061 Converters - support bytes in Avro top-level union types (#2762))
=======
=======
>>>>>>> ce19d9c8bd (GEOMESA-3061 Converters - support bytes in Avro top-level union types (#2762))
=======
>>>>>>> c91f823574 (GEOMESA-3061 Converters - support bytes in Avro top-level union types (#2762))
=======
>>>>>>> 8a2d92d131 (GEOMESA-3061 Converters - support bytes in Avro top-level union types (#2762))
=======
>>>>>>> 0a5b74c946 (Merge branch 'feature/postgis-fixes')
=======
>>>>>>> a52e4429be (GEOMESA-3061 Converters - support bytes in Avro top-level union types (#2762))
=======
>>>>>>> f7b6b53d97 (GEOMESA-3061 Converters - support bytes in Avro top-level union types (#2762))
=======
>>>>>>> b8545eda8f (GEOMESA-3061 Converters - support bytes in Avro top-level union types (#2762))
=======
>>>>>>> b9c0fc77b9 (GEOMESA-3061 Converters - support bytes in Avro top-level union types (#2762))
=======
>>>>>>> 420027bc3f (GEOMESA-3061 Converters - support bytes in Avro top-level union types (#2762))
=======
>>>>>>> fc1024de7e (GEOMESA-3061 Converters - support bytes in Avro top-level union types (#2762))
=======
>>>>>>> 17f16286aa (GEOMESA-3061 Converters - support bytes in Avro top-level union types (#2762))
=======
>>>>>>> 8435590eee (GEOMESA-3061 Converters - support bytes in Avro top-level union types (#2762))
=======
>>>>>>> cc93e0930d (Merge branch 'feature/postgis-fixes')
<<<<<<< HEAD
<<<<<<< HEAD
>>>>>>> locatelli-main
=======
>>>>>>> locatelli-main
=======
>>>>>>> locatelli-main
>>>>>>> f9f6fde40b (GEOMESA-3061 Converters - support bytes in Avro top-level union types (#2762))
=======
>>>>>>> 6a2cd10c1c (GEOMESA-3061 Converters - support bytes in Avro top-level union types (#2762))
=======
<<<<<<< HEAD
<<<<<<< HEAD
<<<<<<< HEAD
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
<<<<<<< HEAD
=======
>>>>>>> dcbf9c4320 (GEOMESA-3061 Converters - support bytes in Avro top-level union types (#2762))
=======
>>>>>>> ce19d9c8bd (GEOMESA-3061 Converters - support bytes in Avro top-level union types (#2762))
<<<<<<< HEAD
<<<<<<< HEAD
>>>>>>> locatelli-main
=======
>>>>>>> locatelli-main
=======
>>>>>>> locatelli-main
>>>>>>> 8a6a96234b (GEOMESA-3061 Converters - support bytes in Avro top-level union types (#2762))
=======
>>>>>>> 0c734cda2b (GEOMESA-3061 Converters - support bytes in Avro top-level union types (#2762))
=======
<<<<<<< HEAD
<<<<<<< HEAD
<<<<<<< HEAD
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
<<<<<<< HEAD
=======
>>>>>>> 8a2d92d131 (GEOMESA-3061 Converters - support bytes in Avro top-level union types (#2762))
=======
>>>>>>> 0a5b74c946 (Merge branch 'feature/postgis-fixes')
<<<<<<< HEAD
<<<<<<< HEAD
>>>>>>> locatelli-main
=======
>>>>>>> locatelli-main
=======
>>>>>>> locatelli-main
>>>>>>> cb6bda89b6 (Merge branch 'feature/postgis-fixes')
=======
>>>>>>> 67e4c1354f (GEOMESA-3061 Converters - support bytes in Avro top-level union types (#2762))
=======
<<<<<<< HEAD
<<<<<<< HEAD
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
>>>>>>> a38834fade (GEOMESA-3061 Converters - support bytes in Avro top-level union types (#2762))
=======
>>>>>>> f7b6b53d97 (GEOMESA-3061 Converters - support bytes in Avro top-level union types (#2762))
<<<<<<< HEAD
<<<<<<< HEAD
>>>>>>> locatelli-main
=======
>>>>>>> locatelli-main
=======
>>>>>>> locatelli-main
=======
>>>>>>> f9f6fde40b (GEOMESA-3061 Converters - support bytes in Avro top-level union types (#2762))
>>>>>>> 1d03325c29 (GEOMESA-3061 Converters - support bytes in Avro top-level union types (#2762))
=======
<<<<<<< HEAD
<<<<<<< HEAD
=======
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
>>>>>>> 6fc8851879 (GEOMESA-3061 Converters - support bytes in Avro top-level union types (#2762))
=======
>>>>>>> 8a6a96234b (GEOMESA-3061 Converters - support bytes in Avro top-level union types (#2762))
=======
>>>>>>> 6514df9383 (GEOMESA-3061 Converters - support bytes in Avro top-level union types (#2762))
<<<<<<< HEAD
<<<<<<< HEAD
=======
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
>>>>>>> c91f823574 (GEOMESA-3061 Converters - support bytes in Avro top-level union types (#2762))
=======
>>>>>>> cb6bda89b6 (Merge branch 'feature/postgis-fixes')
=======
>>>>>>> 71adb695c5 (Merge branch 'feature/postgis-fixes')
<<<<<<< HEAD
<<<<<<< HEAD
=======
>>>>>>> a52e4429be (GEOMESA-3061 Converters - support bytes in Avro top-level union types (#2762))
=======
<<<<<<< HEAD
<<<<<<< HEAD
=======
>>>>>>> locatelli-main
<<<<<<< HEAD
=======
>>>>>>> a52e4429be (GEOMESA-3061 Converters - support bytes in Avro top-level union types (#2762))
=======
=======
>>>>>>> locatelli-main
>>>>>>> 65b9e1925e (GEOMESA-3061 Converters - support bytes in Avro top-level union types (#2762))
=======
>>>>>>> 8a6a96234b (GEOMESA-3061 Converters - support bytes in Avro top-level union types (#2762))
=======
>>>>>>> 9d2bdda5fd (GEOMESA-3061 Converters - support bytes in Avro top-level union types (#2762))
=======
>>>>>>> 6e48efcdc2 (GEOMESA-3061 Converters - support bytes in Avro top-level union types (#2762))
=======
>>>>>>> cb6bda89b6 (Merge branch 'feature/postgis-fixes')
=======
>>>>>>> 964e86145a (Merge branch 'feature/postgis-fixes')
=======
>>>>>>> 1ea8b10ac7 (GEOMESA-3061 Converters - support bytes in Avro top-level union types (#2762))
=======
>>>>>>> a38834fade (GEOMESA-3061 Converters - support bytes in Avro top-level union types (#2762))
=======
=======
>>>>>>> 6fc8851879 (GEOMESA-3061 Converters - support bytes in Avro top-level union types (#2762))
>>>>>>> dcbf9c4320 (GEOMESA-3061 Converters - support bytes in Avro top-level union types (#2762))
=======
>>>>>>> ce19d9c8bd (GEOMESA-3061 Converters - support bytes in Avro top-level union types (#2762))
=======
=======
>>>>>>> c91f823574 (GEOMESA-3061 Converters - support bytes in Avro top-level union types (#2762))
>>>>>>> 8a2d92d131 (GEOMESA-3061 Converters - support bytes in Avro top-level union types (#2762))
=======
>>>>>>> 0a5b74c946 (Merge branch 'feature/postgis-fixes')
=======
=======
>>>>>>> a52e4429be (GEOMESA-3061 Converters - support bytes in Avro top-level union types (#2762))
>>>>>>> f7b6b53d97 (GEOMESA-3061 Converters - support bytes in Avro top-level union types (#2762))
<<<<<<< HEAD
<<<<<<< HEAD
>>>>>>> locatelli-main
=======
>>>>>>> locatelli-main
=======
>>>>>>> locatelli-main
>>>>>>> 3be8d2a5a (Merge branch 'feature/postgis-fixes')
=======
=======
>>>>>>> 16b2e83f2 (GEOMESA-3176 Docs - fix download links in install instructions)
<<<<<<< HEAD
<<<<<<< HEAD
>>>>>>> 7813a31aa (GEOMESA-3176 Docs - fix download links in install instructions)
=======
=======
>>>>>>> 3be8d2a5a (Merge branch 'feature/postgis-fixes')
>>>>>>> e8cc4971c6 (Merge branch 'feature/postgis-fixes')
=======
>>>>>>> 2aa923cc9 (GEOMESA-3176 Docs - fix download links in install instructions)
=======
=======
>>>>>>> 3be8d2a5a (Merge branch 'feature/postgis-fixes')
>>>>>>> db8d998aa (Merge branch 'feature/postgis-fixes')
<<<<<<< HEAD
<<<<<<< HEAD
<<<<<<< HEAD
<<<<<<< HEAD
<<<<<<< HEAD
<<<<<<< HEAD
=======
>>>>>>> 5a4c24e020 (GEOMESA-3254 Add Bloop build support)
=======
<<<<<<< HEAD
=======
>>>>>>> locatelli-main
<<<<<<< HEAD
=======
>>>>>>> locatelli-main
<<<<<<< HEAD
<<<<<<< HEAD
=======
>>>>>>> 5a4c24e020 (GEOMESA-3254 Add Bloop build support)
=======
>>>>>>> b298e017f1 (GEOMESA-3254 Add Bloop build support)
=======
>>>>>>> 0a5b74c946 (Merge branch 'feature/postgis-fixes')
=======
=======
>>>>>>> 5a4c24e020 (GEOMESA-3254 Add Bloop build support)
>>>>>>> 13656f5052 (GEOMESA-3254 Add Bloop build support)
<<<<<<< HEAD
<<<<<<< HEAD
>>>>>>> locatelli-main
=======
>>>>>>> locatelli-main
=======
>>>>>>> locatelli-main
>>>>>>> cb6bda89b6 (Merge branch 'feature/postgis-fixes')
=======
=======
    $ export VERSION="|scala_binary_version|-${TAG}" # note: |scala_binary_version| is the Scala build version
<<<<<<< HEAD
<<<<<<< HEAD
<<<<<<< HEAD
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
<<<<<<< HEAD
=======
>>>>>>> 13656f5052 (GEOMESA-3254 Add Bloop build support)
=======
>>>>>>> c04d2a7e80 (GEOMESA-3176 Docs - fix download links in install instructions)
<<<<<<< HEAD
<<<<<<< HEAD
>>>>>>> locatelli-main
=======
>>>>>>> locatelli-main
=======
>>>>>>> locatelli-main
=======
.. parsed-literal::
=======
=======
>>>>>>> 3be8d2a5a (Merge branch 'feature/postgis-fixes')
>>>>>>> da00c7bd68 (Merge branch 'feature/postgis-fixes')
=======
=======
>>>>>>> 96d5d442fa (GEOMESA-3061 Converters - support bytes in Avro top-level union types (#2762))
=======
>>>>>>> 3be8d2a5a4 (Merge branch 'feature/postgis-fixes')
<<<<<<< HEAD
>>>>>>> 34472778d3 (Merge branch 'feature/postgis-fixes')

<<<<<<< HEAD
=======
=======
.. parsed-literal::
<<<<<<< HEAD
<<<<<<< HEAD
=======
<<<<<<< HEAD
<<<<<<< HEAD
=======
>>>>>>> locatelli-main
<<<<<<< HEAD
=======
=======
>>>>>>> locatelli-main
>>>>>>> cc93e0930d (Merge branch 'feature/postgis-fixes')
=======
=======
>>>>>>> 3be8d2a5a (Merge branch 'feature/postgis-fixes')
>>>>>>> da00c7bd68 (Merge branch 'feature/postgis-fixes')
<<<<<<< HEAD
=======
=======
>>>>>>> 96d5d442fa (GEOMESA-3061 Converters - support bytes in Avro top-level union types (#2762))
=======
>>>>>>> 3be8d2a5a4 (Merge branch 'feature/postgis-fixes')
<<<<<<< HEAD
>>>>>>> 34472778d3 (Merge branch 'feature/postgis-fixes')

<<<<<<< HEAD
>>>>>>> 8dec77199d (GEOMESA-3176 Docs - fix download links in install instructions)
=======
=======
.. parsed-literal::
<<<<<<< HEAD
<<<<<<< HEAD
>>>>>>> locatelli-main
=======
>>>>>>> locatelli-main
=======
>>>>>>> locatelli-main
=======
=======
>>>>>>> 3be8d2a5a (Merge branch 'feature/postgis-fixes')
>>>>>>> da00c7bd68 (Merge branch 'feature/postgis-fixes')

<<<<<<< HEAD
<<<<<<< HEAD
<<<<<<< HEAD
>>>>>>> 8dec77199d (GEOMESA-3176 Docs - fix download links in install instructions)
=======
=======
>>>>>>> locatelli-main
=======
>>>>>>> locatelli-main
>>>>>>> 088d9e36a5 (GEOMESA-3176 Docs - fix download links in install instructions)
=======
<<<<<<< HEAD
>>>>>>> 5a55bf9756 (GEOMESA-3061 Converters - support bytes in Avro top-level union types (#2762))
=======
=======
>>>>>>> cc93e0930d (Merge branch 'feature/postgis-fixes')

>>>>>>> 8dec77199d (GEOMESA-3176 Docs - fix download links in install instructions)
>>>>>>> c04d2a7e80 (GEOMESA-3176 Docs - fix download links in install instructions)
<<<<<<< HEAD
<<<<<<< HEAD
>>>>>>> locatelli-main
=======
>>>>>>> locatelli-main
=======
>>>>>>> locatelli-main
    $ export TAG="|release_version|"
    # note: |scala_binary_version| is the Scala build version
    $ export VERSION="|scala_binary_version|-${TAG}"

Then download and extract the binary distribution:
>>>>>>> 10ade3dcd (GEOMESA-3176 Docs - fix download links in install instructions)
<<<<<<< HEAD
<<<<<<< HEAD
<<<<<<< HEAD
=======
<<<<<<< HEAD
<<<<<<< HEAD
<<<<<<< HEAD
=======
>>>>>>> c04d2a7e80 (GEOMESA-3176 Docs - fix download links in install instructions)
>>>>>>> locatelli-main
=======
<<<<<<< HEAD
=======
>>>>>>> c04d2a7e80 (GEOMESA-3176 Docs - fix download links in install instructions)
>>>>>>> locatelli-main
=======
>>>>>>> c04d2a7e80 (GEOMESA-3176 Docs - fix download links in install instructions)
>>>>>>> locatelli-main

<<<<<<< HEAD
<<<<<<< HEAD
<<<<<<< HEAD
<<<<<<< HEAD
<<<<<<< HEAD
<<<<<<< HEAD
<<<<<<< HEAD
Then download and extract the binary distribution:
>>>>>>> d845d7c1b (GEOMESA-3254 Add Bloop build support)
>>>>>>> 09d87762c5 (GEOMESA-3254 Add Bloop build support)
=======
>>>>>>> cb6bda89b6 (Merge branch 'feature/postgis-fixes')
>>>>>>> 71adb695c5 (Merge branch 'feature/postgis-fixes')
<<<<<<< HEAD
<<<<<<< HEAD
=======
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
>>>>>>> 8dec77199d (GEOMESA-3176 Docs - fix download links in install instructions)

<<<<<<< HEAD
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
=======
=======
=======
>>>>>>> 8dec77199d (GEOMESA-3176 Docs - fix download links in install instructions)

>>>>>>> 13656f5052 (GEOMESA-3254 Add Bloop build support)
=======
>>>>>>> 7c052f66eb (GEOMESA-3061 Converters - support bytes in Avro top-level union types (#2762))
=======
>>>>>>> 79d78e33bb (GEOMESA-3176 Docs - fix download links in install instructions)
=======
>>>>>>> 411f3fc089 (GEOMESA-3061 Converters - support bytes in Avro top-level union types (#2762))
=======
>>>>>>> 72c7cd55e5 (GEOMESA-3176 Docs - fix download links in install instructions)
=======
>>>>>>> 992ed6b1bf (GEOMESA-3061 Converters - support bytes in Avro top-level union types (#2762))
=======
>>>>>>> d025f79392 (GEOMESA-3176 Docs - fix download links in install instructions)
=======
>>>>>>> 8171686fd2 (GEOMESA-3061 Converters - support bytes in Avro top-level union types (#2762))
<<<<<<< HEAD
<<<<<<< HEAD
>>>>>>> locatelli-main
=======
>>>>>>> locatelli-main
=======
>>>>>>> locatelli-main
Then download and extract the binary distribution:
>>>>>>> d845d7c1b (GEOMESA-3254 Add Bloop build support)
>>>>>>> 09d87762c5 (GEOMESA-3254 Add Bloop build support)
>>>>>>> 5a4c24e020 (GEOMESA-3254 Add Bloop build support)
<<<<<<< HEAD
=======
<<<<<<< HEAD
<<<<<<< HEAD
<<<<<<< HEAD
=======
=======
>>>>>>> locatelli-main
=======
>>>>>>> locatelli-main
>>>>>>> cb6bda89b6 (Merge branch 'feature/postgis-fixes')
>>>>>>> 964e86145a (Merge branch 'feature/postgis-fixes')
=======
=======
>>>>>>> 088d9e36a5 (GEOMESA-3176 Docs - fix download links in install instructions)

<<<<<<< HEAD
<<<<<<< HEAD
<<<<<<< HEAD
<<<<<<< HEAD
<<<<<<< HEAD
<<<<<<< HEAD
<<<<<<< HEAD
Then download and extract the binary distribution:
>>>>>>> d845d7c1b (GEOMESA-3254 Add Bloop build support)
>>>>>>> 09d87762c5 (GEOMESA-3254 Add Bloop build support)
>>>>>>> b298e017f1 (GEOMESA-3254 Add Bloop build support)
=======
>>>>>>> 0a5b74c946 (Merge branch 'feature/postgis-fixes')
=======
>>>>>>> 13656f5052 (GEOMESA-3254 Add Bloop build support)
<<<<<<< HEAD
<<<<<<< HEAD
>>>>>>> locatelli-main
=======
>>>>>>> locatelli-main
=======
>>>>>>> locatelli-main

<<<<<<< HEAD
.. parsed-literal::

    $ export TAG="|release_version|"
    # note: |scala_binary_version| is the Scala build version
    $ export VERSION="|scala_binary_version|-${TAG}"

Then download and extract the binary distribution:
=======
<<<<<<< HEAD
>>>>>>> e847488d8 (GEOMESA-3061 Converters - support bytes in Avro top-level union types (#2762))
=======
>>>>>>> c5e182765 (GEOMESA-3061 Converters - support bytes in Avro top-level union types (#2762))
>>>>>>> f9f6fde40b (GEOMESA-3061 Converters - support bytes in Avro top-level union types (#2762))

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
>>>>>>> locatelli-main
=======
<<<<<<< HEAD
<<<<<<< HEAD
>>>>>>> locatelli-main
=======
<<<<<<< HEAD
>>>>>>> locatelli-main
=======
<<<<<<< HEAD
>>>>>>> 6a26990f7 (GEOMESA-3176 Docs - fix download links in install instructions)
=======

>>>>>>> 3dd99aed4 (GEOMESA-3061 Converters - support bytes in Avro top-level union types (#2762))
=======
>>>>>>> baa90e85a (GEOMESA-3176 Docs - fix download links in install instructions)
=======

>>>>>>> 4524373ac (GEOMESA-3061 Converters - support bytes in Avro top-level union types (#2762))
=======
>>>>>>> 46c05fed5 (GEOMESA-3176 Docs - fix download links in install instructions)
=======

>>>>>>> 4fbe39c62 (GEOMESA-3061 Converters - support bytes in Avro top-level union types (#2762))
=======
.. note::
=======
>>>>>>> 2aa923cc9 (GEOMESA-3176 Docs - fix download links in install instructions)

.. parsed-literal::
>>>>>>> bdcaf0ab5e (GEOMESA-3176 Docs - fix download links in install instructions)

    $ export TAG="|release_version|"
    # note: |scala_binary_version| is the Scala build version
    $ export VERSION="|scala_binary_version|-${TAG}"

Then download and extract the binary distribution:

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
>>>>>>> 81ee66102b (GEOMESA-3061 Converters - support bytes in Avro top-level union types (#2762))
=======
>>>>>>> 8cbe155de (GEOMESA-3176 Docs - fix download links in install instructions)
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
>>>>>>> locatelli-main
<<<<<<< HEAD
<<<<<<< HEAD
=======
>>>>>>> 6fc8851879 (GEOMESA-3061 Converters - support bytes in Avro top-level union types (#2762))
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
>>>>>>> 6fc8851879 (GEOMESA-3061 Converters - support bytes in Avro top-level union types (#2762))
<<<<<<< HEAD
>>>>>>> locatelli-main
=======
>>>>>>> locatelli-main
=======
>>>>>>> 65b9e1925e (GEOMESA-3061 Converters - support bytes in Avro top-level union types (#2762))
=======
>>>>>>> 0b168af9c8 (GEOMESA-3176 Docs - fix download links in install instructions)
=======
=======
>>>>>>> 6fc8851879 (GEOMESA-3061 Converters - support bytes in Avro top-level union types (#2762))
>>>>>>> dcbf9c4320 (GEOMESA-3061 Converters - support bytes in Avro top-level union types (#2762))
<<<<<<< HEAD
<<<<<<< HEAD
>>>>>>> locatelli-main
=======
>>>>>>> locatelli-main
=======
>>>>>>> locatelli-main
>>>>>>> 8150bc0e65 (GEOMESA-3176 Docs - fix download links in install instructions)
=======
=======

>>>>>>> 5f428db97 (GEOMESA-3061 Converters - support bytes in Avro top-level union types (#2762))
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
>>>>>>> locatelli-main
<<<<<<< HEAD
<<<<<<< HEAD
=======
>>>>>>> 3995e6a61c (GEOMESA-3176 Docs - fix download links in install instructions)
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
>>>>>>> 3995e6a61c (GEOMESA-3176 Docs - fix download links in install instructions)
<<<<<<< HEAD
>>>>>>> locatelli-main
=======
>>>>>>> locatelli-main
=======
>>>>>>> 033543c609 (GEOMESA-3176 Docs - fix download links in install instructions)
=======
>>>>>>> dcbf9c4320 (GEOMESA-3061 Converters - support bytes in Avro top-level union types (#2762))
=======
=======
>>>>>>> 3995e6a61c (GEOMESA-3176 Docs - fix download links in install instructions)
>>>>>>> 84e5c6b001 (GEOMESA-3176 Docs - fix download links in install instructions)
<<<<<<< HEAD
<<<<<<< HEAD
>>>>>>> locatelli-main
=======
>>>>>>> locatelli-main
=======
>>>>>>> locatelli-main
>>>>>>> 6a2cd10c1c (GEOMESA-3061 Converters - support bytes in Avro top-level union types (#2762))
=======
=======
>>>>>>> 0fbf9e83e (GEOMESA-3176 Docs - fix download links in install instructions)
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
>>>>>>> locatelli-main
<<<<<<< HEAD
<<<<<<< HEAD
=======
>>>>>>> 6514df9383 (GEOMESA-3061 Converters - support bytes in Avro top-level union types (#2762))
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
>>>>>>> 6514df9383 (GEOMESA-3061 Converters - support bytes in Avro top-level union types (#2762))
<<<<<<< HEAD
>>>>>>> locatelli-main
=======
>>>>>>> locatelli-main
=======
>>>>>>> 9d2bdda5fd (GEOMESA-3061 Converters - support bytes in Avro top-level union types (#2762))
=======
>>>>>>> 84e5c6b001 (GEOMESA-3176 Docs - fix download links in install instructions)
=======
=======
>>>>>>> 6514df9383 (GEOMESA-3061 Converters - support bytes in Avro top-level union types (#2762))
>>>>>>> ce19d9c8bd (GEOMESA-3061 Converters - support bytes in Avro top-level union types (#2762))
<<<<<<< HEAD
<<<<<<< HEAD
>>>>>>> locatelli-main
=======
>>>>>>> locatelli-main
=======
>>>>>>> locatelli-main
>>>>>>> 4d9f87a514 (GEOMESA-3176 Docs - fix download links in install instructions)
=======
=======

>>>>>>> 89bdd3013 (GEOMESA-3061 Converters - support bytes in Avro top-level union types (#2762))
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
>>>>>>> locatelli-main
<<<<<<< HEAD
<<<<<<< HEAD
=======
>>>>>>> cabde54511 (GEOMESA-3176 Docs - fix download links in install instructions)
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
>>>>>>> cabde54511 (GEOMESA-3176 Docs - fix download links in install instructions)
<<<<<<< HEAD
>>>>>>> locatelli-main
=======
>>>>>>> locatelli-main
=======
>>>>>>> 96b5e91bc8 (GEOMESA-3176 Docs - fix download links in install instructions)
=======
>>>>>>> ce19d9c8bd (GEOMESA-3061 Converters - support bytes in Avro top-level union types (#2762))
=======
=======
>>>>>>> cabde54511 (GEOMESA-3176 Docs - fix download links in install instructions)
>>>>>>> dcc9d7f708 (GEOMESA-3176 Docs - fix download links in install instructions)
<<<<<<< HEAD
<<<<<<< HEAD
>>>>>>> locatelli-main
=======
>>>>>>> locatelli-main
=======
>>>>>>> locatelli-main
>>>>>>> 8a6a96234b (GEOMESA-3061 Converters - support bytes in Avro top-level union types (#2762))
=======
=======
>>>>>>> f9e8439b0 (GEOMESA-3176 Docs - fix download links in install instructions)
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
>>>>>>> locatelli-main
<<<<<<< HEAD
<<<<<<< HEAD
=======
>>>>>>> c91f823574 (GEOMESA-3061 Converters - support bytes in Avro top-level union types (#2762))
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
>>>>>>> c91f823574 (GEOMESA-3061 Converters - support bytes in Avro top-level union types (#2762))
<<<<<<< HEAD
>>>>>>> locatelli-main
=======
>>>>>>> locatelli-main
=======
>>>>>>> 6e48efcdc2 (GEOMESA-3061 Converters - support bytes in Avro top-level union types (#2762))
=======
>>>>>>> dcc9d7f708 (GEOMESA-3176 Docs - fix download links in install instructions)
=======
=======
>>>>>>> c91f823574 (GEOMESA-3061 Converters - support bytes in Avro top-level union types (#2762))
>>>>>>> 8a2d92d131 (GEOMESA-3061 Converters - support bytes in Avro top-level union types (#2762))
<<<<<<< HEAD
<<<<<<< HEAD
>>>>>>> locatelli-main
=======
>>>>>>> locatelli-main
=======
>>>>>>> locatelli-main
>>>>>>> bd3233180f (GEOMESA-3176 Docs - fix download links in install instructions)
=======
=======

>>>>>>> 72bafaf54 (GEOMESA-3061 Converters - support bytes in Avro top-level union types (#2762))
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
>>>>>>> locatelli-main
<<<<<<< HEAD
<<<<<<< HEAD
=======
>>>>>>> a52e4429be (GEOMESA-3061 Converters - support bytes in Avro top-level union types (#2762))
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
>>>>>>> a52e4429be (GEOMESA-3061 Converters - support bytes in Avro top-level union types (#2762))
<<<<<<< HEAD
>>>>>>> locatelli-main
=======
>>>>>>> locatelli-main
=======
>>>>>>> 1ea8b10ac7 (GEOMESA-3061 Converters - support bytes in Avro top-level union types (#2762))
=======
>>>>>>> 8a2d92d131 (GEOMESA-3061 Converters - support bytes in Avro top-level union types (#2762))
=======
=======
>>>>>>> a52e4429be (GEOMESA-3061 Converters - support bytes in Avro top-level union types (#2762))
>>>>>>> f7b6b53d97 (GEOMESA-3061 Converters - support bytes in Avro top-level union types (#2762))
<<<<<<< HEAD
<<<<<<< HEAD
>>>>>>> locatelli-main
=======
>>>>>>> locatelli-main
=======
>>>>>>> locatelli-main
>>>>>>> 0c734cda2b (GEOMESA-3061 Converters - support bytes in Avro top-level union types (#2762))
=======
=======

>>>>>>> 6d9a5b626 (GEOMESA-3061 Converters - support bytes in Avro top-level union types (#2762))
<<<<<<< HEAD
<<<<<<< HEAD
<<<<<<< HEAD
<<<<<<< HEAD
<<<<<<< HEAD
=======
<<<<<<< HEAD
<<<<<<< HEAD
>>>>>>> locationtech-main
=======
<<<<<<< HEAD
=======
>>>>>>> locatelli-main
<<<<<<< HEAD
=======
>>>>>>> locatelli-main
<<<<<<< HEAD
<<<<<<< HEAD
<<<<<<< HEAD
=======
>>>>>>> f7b6b53d97 (GEOMESA-3061 Converters - support bytes in Avro top-level union types (#2762))
=======
>>>>>>> 7c052f66eb (GEOMESA-3061 Converters - support bytes in Avro top-level union types (#2762))
<<<<<<< HEAD
<<<<<<< HEAD
>>>>>>> locatelli-main
=======
>>>>>>> locatelli-main
=======
>>>>>>> locatelli-main
>>>>>>> 67e4c1354f (GEOMESA-3061 Converters - support bytes in Avro top-level union types (#2762))
=======
=======
=======
>>>>>>> 23c024179 (GEOMESA-3061 Converters - support bytes in Avro top-level union types (#2762))
<<<<<<< HEAD
<<<<<<< HEAD
<<<<<<< HEAD
<<<<<<< HEAD
=======
<<<<<<< HEAD
<<<<<<< HEAD
>>>>>>> locationtech-main
=======
<<<<<<< HEAD
=======
>>>>>>> locatelli-main
<<<<<<< HEAD
=======
>>>>>>> locatelli-main
<<<<<<< HEAD
<<<<<<< HEAD
<<<<<<< HEAD
=======
>>>>>>> 411f3fc089 (GEOMESA-3061 Converters - support bytes in Avro top-level union types (#2762))
=======
>>>>>>> 992ed6b1bf (GEOMESA-3061 Converters - support bytes in Avro top-level union types (#2762))
<<<<<<< HEAD
<<<<<<< HEAD
>>>>>>> locatelli-main
=======
>>>>>>> locatelli-main
=======
>>>>>>> locatelli-main
=======
>>>>>>> 85663f71c (GEOMESA-3061 Converters - support bytes in Avro top-level union types (#2762))
=======
>>>>>>> d4c5768cf (GEOMESA-3061 Converters - support bytes in Avro top-level union types (#2762))
<<<<<<< HEAD
<<<<<<< HEAD
<<<<<<< HEAD
<<<<<<< HEAD
=======
<<<<<<< HEAD
=======
<<<<<<< HEAD
=======
>>>>>>> locatelli-main
<<<<<<< HEAD
<<<<<<< HEAD
=======
>>>>>>> 8171686fd2 (GEOMESA-3061 Converters - support bytes in Avro top-level union types (#2762))
<<<<<<< HEAD
>>>>>>> locatelli-main
=======
>>>>>>> locatelli-main
=======
<<<<<<< HEAD
=======
>>>>>>> 8171686fd2 (GEOMESA-3061 Converters - support bytes in Avro top-level union types (#2762))
>>>>>>> locatelli-main
=======
>>>>>>> 59a1fbb96e (GEOMESA-3061 Converters - support bytes in Avro top-level union types (#2762))
=======
>>>>>>> 810876750d (GEOMESA-3061 Converters - support bytes in Avro top-level union types (#2762))
<<<<<<< HEAD
<<<<<<< HEAD
=======
<<<<<<< HEAD
<<<<<<< HEAD
<<<<<<< HEAD
=======
>>>>>>> 7c052f66eb (GEOMESA-3061 Converters - support bytes in Avro top-level union types (#2762))
>>>>>>> locatelli-main
=======
<<<<<<< HEAD
=======
>>>>>>> 7c052f66eb (GEOMESA-3061 Converters - support bytes in Avro top-level union types (#2762))
>>>>>>> locatelli-main
=======
>>>>>>> 7c052f66eb (GEOMESA-3061 Converters - support bytes in Avro top-level union types (#2762))
>>>>>>> locatelli-main
=======
>>>>>>> 67e4c1354f (GEOMESA-3061 Converters - support bytes in Avro top-level union types (#2762))
=======
=======
>>>>>>> bc73cc4d41 (GEOMESA-3061 Converters - support bytes in Avro top-level union types (#2762))
<<<<<<< HEAD
<<<<<<< HEAD
=======
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
>>>>>>> 98eacc8492 (GEOMESA-3061 Converters - support bytes in Avro top-level union types (#2762))
=======
=======
>>>>>>> 85663f71c (GEOMESA-3061 Converters - support bytes in Avro top-level union types (#2762))
>>>>>>> 664350d86f (GEOMESA-3061 Converters - support bytes in Avro top-level union types (#2762))
<<<<<<< HEAD
<<<<<<< HEAD
=======
>>>>>>> a85aff60b3 (GEOMESA-3061 Converters - support bytes in Avro top-level union types (#2762))
<<<<<<< HEAD
>>>>>>> locationtech-main
=======
>>>>>>> 32234db855 (GEOMESA-3061 Converters - support bytes in Avro top-level union types (#2762))
=======
<<<<<<< HEAD
=======
>>>>>>> locatelli-main
<<<<<<< HEAD
=======
>>>>>>> a85aff60b3 (GEOMESA-3061 Converters - support bytes in Avro top-level union types (#2762))
=======
>>>>>>> locatelli-main
<<<<<<< HEAD
=======
>>>>>>> 67e4c1354f (GEOMESA-3061 Converters - support bytes in Avro top-level union types (#2762))
=======
=======
>>>>>>> 37ee765e9b (GEOMESA-3061 Converters - support bytes in Avro top-level union types (#2762))
=======
>>>>>>> 83b11fa843 (GEOMESA-3061 Converters - support bytes in Avro top-level union types (#2762))
=======
=======
>>>>>>> 85663f71c (GEOMESA-3061 Converters - support bytes in Avro top-level union types (#2762))
>>>>>>> 1c9a51a667 (GEOMESA-3061 Converters - support bytes in Avro top-level union types (#2762))
=======
>>>>>>> f958055259 (GEOMESA-3061 Converters - support bytes in Avro top-level union types (#2762))
=======
=======
>>>>>>> 59a1fbb96e (GEOMESA-3061 Converters - support bytes in Avro top-level union types (#2762))
>>>>>>> ac217b392d (GEOMESA-3061 Converters - support bytes in Avro top-level union types (#2762))
=======
>>>>>>> 5a55bf9756 (GEOMESA-3061 Converters - support bytes in Avro top-level union types (#2762))
=======
>>>>>>> 7c052f66eb (GEOMESA-3061 Converters - support bytes in Avro top-level union types (#2762))
=======
=======
>>>>>>> 98eacc8492 (GEOMESA-3061 Converters - support bytes in Avro top-level union types (#2762))
>>>>>>> 411f3fc089 (GEOMESA-3061 Converters - support bytes in Avro top-level union types (#2762))
=======
>>>>>>> 992ed6b1bf (GEOMESA-3061 Converters - support bytes in Avro top-level union types (#2762))
=======
=======
>>>>>>> a85aff60b3 (GEOMESA-3061 Converters - support bytes in Avro top-level union types (#2762))
>>>>>>> 8171686fd2 (GEOMESA-3061 Converters - support bytes in Avro top-level union types (#2762))
=======
>>>>>>> locationtech-main
=======
>>>>>>> 32234db855 (GEOMESA-3061 Converters - support bytes in Avro top-level union types (#2762))
<<<<<<< HEAD
>>>>>>> 12443df272 (GEOMESA-3061 Converters - support bytes in Avro top-level union types (#2762))
=======
=======
>>>>>>> 86dd18aa73 (GEOMESA-3061 Converters - support bytes in Avro top-level union types (#2762))
>>>>>>> b488e79fc5 (GEOMESA-3061 Converters - support bytes in Avro top-level union types (#2762))
=======
>>>>>>> 32234db855 (GEOMESA-3061 Converters - support bytes in Avro top-level union types (#2762))
<<<<<<< HEAD
<<<<<<< HEAD
>>>>>>> locatelli-main
=======
>>>>>>> locatelli-main
=======
>>>>>>> locatelli-main
=======
>>>>>>> 86dd18aa73 (GEOMESA-3061 Converters - support bytes in Avro top-level union types (#2762))
.. note::

  In the following examples, replace ``${TAG}`` with the corresponding GeoMesa version (e.g. |release_version|), and
  ``${VERSION}`` with the appropriate Scala plus GeoMesa versions (e.g. |scala_release_version|).
<<<<<<< HEAD
<<<<<<< HEAD
<<<<<<< HEAD
<<<<<<< HEAD
<<<<<<< HEAD
<<<<<<< HEAD
<<<<<<< HEAD
=======
>>>>>>> 3be8d2a5a (Merge branch 'feature/postgis-fixes')
=======
<<<<<<< HEAD
<<<<<<< HEAD
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
>>>>>>> 79bf541ac8 (Merge branch 'feature/postgis-fixes')
=======
>>>>>>> b488e79fc5 (GEOMESA-3061 Converters - support bytes in Avro top-level union types (#2762))
=======
>>>>>>> 12443df272 (GEOMESA-3061 Converters - support bytes in Avro top-level union types (#2762))
=======
>>>>>>> ac217b392d (GEOMESA-3061 Converters - support bytes in Avro top-level union types (#2762))
=======
>>>>>>> 5a55bf9756 (GEOMESA-3061 Converters - support bytes in Avro top-level union types (#2762))
=======
>>>>>>> 7c052f66eb (GEOMESA-3061 Converters - support bytes in Avro top-level union types (#2762))
=======
>>>>>>> a30a0c1a2a (Merge branch 'feature/postgis-fixes')
<<<<<<< HEAD
<<<<<<< HEAD
>>>>>>> locatelli-main
=======
>>>>>>> locatelli-main
=======
>>>>>>> locatelli-main
=======
>>>>>>> 3be8d2a5a (Merge branch 'feature/postgis-fixes')
=======
=======
>>>>>>> 16b2e83f2 (GEOMESA-3176 Docs - fix download links in install instructions)
>>>>>>> 2aa923cc97 (GEOMESA-3176 Docs - fix download links in install instructions)
<<<<<<< HEAD
<<<<<<< HEAD
=======
<<<<<<< HEAD
<<<<<<< HEAD
<<<<<<< HEAD
=======
>>>>>>> a30a0c1a2a (Merge branch 'feature/postgis-fixes')
>>>>>>> locatelli-main
=======
<<<<<<< HEAD
=======
>>>>>>> a30a0c1a2a (Merge branch 'feature/postgis-fixes')
>>>>>>> locatelli-main
=======
>>>>>>> a30a0c1a2a (Merge branch 'feature/postgis-fixes')
>>>>>>> locatelli-main
=======
=======
>>>>>>> 3be8d2a5a (Merge branch 'feature/postgis-fixes')
>>>>>>> 30559ea5c9 (Merge branch 'feature/postgis-fixes')
<<<<<<< HEAD
<<<<<<< HEAD
<<<<<<< HEAD
>>>>>>> locationtech-main
=======
<<<<<<< HEAD
=======
>>>>>>> locatelli-main
<<<<<<< HEAD
=======
>>>>>>> locatelli-main
=======
=======
>>>>>>> 3be8d2a5a (Merge branch 'feature/postgis-fixes')
>>>>>>> bf6bde0830 (Merge branch 'feature/postgis-fixes')
=======
=======
>>>>>>> a30a0c1a2a (Merge branch 'feature/postgis-fixes')
<<<<<<< HEAD
<<<<<<< HEAD
>>>>>>> locatelli-main
=======
>>>>>>> locatelli-main
=======
>>>>>>> locatelli-main
=======
=======
>>>>>>> 3be8d2a5a (Merge branch 'feature/postgis-fixes')
>>>>>>> 64eaf6b132 (Merge branch 'feature/postgis-fixes')

<<<<<<< HEAD
<<<<<<< HEAD
<<<<<<< HEAD
<<<<<<< HEAD
<<<<<<< HEAD
<<<<<<< HEAD
<<<<<<< HEAD
=======
=======
=======
>>>>>>> locatelli-main
=======
>>>>>>> locatelli-main
.. parsed-literal::

=======
>>>>>>> 10ade3dcd1 (GEOMESA-3176 Docs - fix download links in install instructions)
    $ export TAG="|release_version|"
    # note: |scala_binary_version| is the Scala build version
    $ export VERSION="|scala_binary_version|-${TAG}"

Then download and extract the binary distribution:
<<<<<<< HEAD
>>>>>>> 419e2b9752 (GEOMESA-3176 Docs - fix download links in install instructions)
<<<<<<< HEAD
>>>>>>> b68ae6197f (GEOMESA-3176 Docs - fix download links in install instructions)
=======
=======
<<<<<<< HEAD
>>>>>>> 86bc039842 (GEOMESA-3176 Docs - fix download links in install instructions)
>>>>>>> 3f60902092 (GEOMESA-3176 Docs - fix download links in install instructions)
=======
>>>>>>> locationtech-main
=======
=======
>>>>>>> 3be8d2a5a (Merge branch 'feature/postgis-fixes')
>>>>>>> 64eaf6b132 (Merge branch 'feature/postgis-fixes')
>>>>>>> 79bf541ac8 (Merge branch 'feature/postgis-fixes')

<<<<<<< HEAD
<<<<<<< HEAD
<<<<<<< HEAD
<<<<<<< HEAD
<<<<<<< HEAD
<<<<<<< HEAD
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
.. parsed-literal::

=======
>>>>>>> 10ade3dcd1 (GEOMESA-3176 Docs - fix download links in install instructions)
    $ export TAG="|release_version|"
    # note: |scala_binary_version| is the Scala build version
    $ export VERSION="|scala_binary_version|-${TAG}"

Then download and extract the binary distribution:
<<<<<<< HEAD
>>>>>>> 419e2b9752 (GEOMESA-3176 Docs - fix download links in install instructions)
=======
<<<<<<< HEAD
>>>>>>> 86bc039842 (GEOMESA-3176 Docs - fix download links in install instructions)

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
>>>>>>> 98eacc8492 (GEOMESA-3061 Converters - support bytes in Avro top-level union types (#2762))
=======
>>>>>>> 664350d86f (GEOMESA-3061 Converters - support bytes in Avro top-level union types (#2762))
=======
>>>>>>> a85aff60b3 (GEOMESA-3061 Converters - support bytes in Avro top-level union types (#2762))
<<<<<<< HEAD
<<<<<<< HEAD
<<<<<<< HEAD
<<<<<<< HEAD
>>>>>>> locationtech-main
=======
=======
>>>>>>> locatelli-main
=======
>>>>>>> locatelli-main
=======
>>>>>>> 664350d86f (GEOMESA-3061 Converters - support bytes in Avro top-level union types (#2762))
=======
>>>>>>> a85aff60b3 (GEOMESA-3061 Converters - support bytes in Avro top-level union types (#2762))
=======
>>>>>>> 411f3fc089 (GEOMESA-3061 Converters - support bytes in Avro top-level union types (#2762))
<<<<<<< HEAD
=======
>>>>>>> 83b11fa843 (GEOMESA-3061 Converters - support bytes in Avro top-level union types (#2762))
=======
>>>>>>> 1c9a51a667 (GEOMESA-3061 Converters - support bytes in Avro top-level union types (#2762))
=======
>>>>>>> f958055259 (GEOMESA-3061 Converters - support bytes in Avro top-level union types (#2762))
=======
>>>>>>> 23fc8cb805 (GEOMESA-3061 Converters - support bytes in Avro top-level union types (#2762))
=======
>>>>>>> b47097b7bb (GEOMESA-3176 Docs - fix download links in install instructions)
=======
>>>>>>> 99a32a726d (GEOMESA-3061 Converters - support bytes in Avro top-level union types (#2762))
=======
>>>>>>> 95f020af8c (GEOMESA-3176 Docs - fix download links in install instructions)
=======
>>>>>>> 02bb344987 (GEOMESA-3061 Converters - support bytes in Avro top-level union types (#2762))
=======
>>>>>>> 26c7d06850 (GEOMESA-3176 Docs - fix download links in install instructions)
=======
>>>>>>> a512d6b917 (GEOMESA-3061 Converters - support bytes in Avro top-level union types (#2762))
<<<<<<< HEAD
<<<<<<< HEAD
>>>>>>> locatelli-main
=======
>>>>>>> locatelli-main
=======
>>>>>>> locatelli-main
>>>>>>> 947a867d1 (GEOMESA-3061 Converters - support bytes in Avro top-level union types (#2762))
<<<<<<< HEAD
>>>>>>> 748532d2db (GEOMESA-3061 Converters - support bytes in Avro top-level union types (#2762))
=======
=======
>>>>>>> 279de44d3 (GEOMESA-3176 Docs - fix download links in install instructions)
<<<<<<< HEAD
>>>>>>> b7c6b904be (GEOMESA-3176 Docs - fix download links in install instructions)
=======
=======
>>>>>>> 23c024179 (GEOMESA-3061 Converters - support bytes in Avro top-level union types (#2762))
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
>>>>>>> locatelli-main
<<<<<<< HEAD
<<<<<<< HEAD
=======
>>>>>>> 1a737b13ed (GEOMESA-3176 Docs - fix download links in install instructions)
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
>>>>>>> 1a737b13ed (GEOMESA-3176 Docs - fix download links in install instructions)
<<<<<<< HEAD
>>>>>>> locatelli-main
=======
>>>>>>> locatelli-main
=======
>>>>>>> 2e65415d49 (GEOMESA-3176 Docs - fix download links in install instructions)
=======
>>>>>>> 411f3fc089 (GEOMESA-3061 Converters - support bytes in Avro top-level union types (#2762))
=======
=======
>>>>>>> 1a737b13ed (GEOMESA-3176 Docs - fix download links in install instructions)
>>>>>>> 72c7cd55e5 (GEOMESA-3176 Docs - fix download links in install instructions)
<<<<<<< HEAD
<<<<<<< HEAD
>>>>>>> locatelli-main
=======
>>>>>>> locatelli-main
=======
>>>>>>> locatelli-main
>>>>>>> 250f01786f (GEOMESA-3061 Converters - support bytes in Avro top-level union types (#2762))
=======
=======
>>>>>>> 4b70e7f8f (GEOMESA-3176 Docs - fix download links in install instructions)
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
>>>>>>> locatelli-main
<<<<<<< HEAD
<<<<<<< HEAD
=======
>>>>>>> 664350d86f (GEOMESA-3061 Converters - support bytes in Avro top-level union types (#2762))
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
>>>>>>> 664350d86f (GEOMESA-3061 Converters - support bytes in Avro top-level union types (#2762))
<<<<<<< HEAD
>>>>>>> locatelli-main
=======
>>>>>>> locatelli-main
=======
>>>>>>> 1c9a51a667 (GEOMESA-3061 Converters - support bytes in Avro top-level union types (#2762))
=======
>>>>>>> 72c7cd55e5 (GEOMESA-3176 Docs - fix download links in install instructions)
=======
=======
>>>>>>> 664350d86f (GEOMESA-3061 Converters - support bytes in Avro top-level union types (#2762))
>>>>>>> 992ed6b1bf (GEOMESA-3061 Converters - support bytes in Avro top-level union types (#2762))
<<<<<<< HEAD
<<<<<<< HEAD
>>>>>>> locatelli-main
=======
>>>>>>> locatelli-main
=======
>>>>>>> locatelli-main
>>>>>>> b42125fac1 (GEOMESA-3176 Docs - fix download links in install instructions)
=======
=======
>>>>>>> 85663f71c (GEOMESA-3061 Converters - support bytes in Avro top-level union types (#2762))
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
>>>>>>> locatelli-main
<<<<<<< HEAD
<<<<<<< HEAD
=======
>>>>>>> 3e34d2451e (GEOMESA-3176 Docs - fix download links in install instructions)
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
>>>>>>> 3e34d2451e (GEOMESA-3176 Docs - fix download links in install instructions)
<<<<<<< HEAD
>>>>>>> locatelli-main
=======
>>>>>>> locatelli-main
=======
>>>>>>> 5603dc69a0 (GEOMESA-3176 Docs - fix download links in install instructions)
=======
>>>>>>> 992ed6b1bf (GEOMESA-3061 Converters - support bytes in Avro top-level union types (#2762))
=======
=======
>>>>>>> 3e34d2451e (GEOMESA-3176 Docs - fix download links in install instructions)
>>>>>>> d025f79392 (GEOMESA-3176 Docs - fix download links in install instructions)
<<<<<<< HEAD
<<<<<<< HEAD
>>>>>>> locatelli-main
=======
>>>>>>> locatelli-main
=======
>>>>>>> locatelli-main
>>>>>>> 813488e18c (GEOMESA-3061 Converters - support bytes in Avro top-level union types (#2762))
=======
=======
>>>>>>> a12ea194c (GEOMESA-3176 Docs - fix download links in install instructions)
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
>>>>>>> locatelli-main
<<<<<<< HEAD
<<<<<<< HEAD
=======
>>>>>>> a85aff60b3 (GEOMESA-3061 Converters - support bytes in Avro top-level union types (#2762))
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
>>>>>>> a85aff60b3 (GEOMESA-3061 Converters - support bytes in Avro top-level union types (#2762))
<<<<<<< HEAD
>>>>>>> locatelli-main
=======
>>>>>>> locatelli-main
=======
>>>>>>> f958055259 (GEOMESA-3061 Converters - support bytes in Avro top-level union types (#2762))
=======
>>>>>>> d025f79392 (GEOMESA-3176 Docs - fix download links in install instructions)
=======
=======
>>>>>>> a85aff60b3 (GEOMESA-3061 Converters - support bytes in Avro top-level union types (#2762))
>>>>>>> 8171686fd2 (GEOMESA-3061 Converters - support bytes in Avro top-level union types (#2762))
<<<<<<< HEAD
<<<<<<< HEAD
>>>>>>> locatelli-main
=======
>>>>>>> locatelli-main
=======
>>>>>>> locatelli-main
>>>>>>> 5c3f315bc0 (GEOMESA-3176 Docs - fix download links in install instructions)
=======
=======
>>>>>>> d4c5768cf (GEOMESA-3061 Converters - support bytes in Avro top-level union types (#2762))
>>>>>>> fe51719bc6 (GEOMESA-3061 Converters - support bytes in Avro top-level union types (#2762))
<<<<<<< HEAD
<<<<<<< HEAD
<<<<<<< HEAD
<<<<<<< HEAD
<<<<<<< HEAD
=======
=======
<<<<<<< HEAD
>>>>>>> locationtech-main
=======
<<<<<<< HEAD
=======
>>>>>>> locatelli-main
<<<<<<< HEAD
=======
>>>>>>> locatelli-main
<<<<<<< HEAD
<<<<<<< HEAD
=======
>>>>>>> 8171686fd2 (GEOMESA-3061 Converters - support bytes in Avro top-level union types (#2762))
=======
>>>>>>> 9d0ea08871 (GEOMESA-3061 Converters - support bytes in Avro top-level union types (#2762))
<<<<<<< HEAD
<<<<<<< HEAD
>>>>>>> locatelli-main
=======
>>>>>>> locatelli-main
=======
>>>>>>> locatelli-main
=======

>>>>>>> f0b9bd8121 (GEOMESA-3061 Converters - support bytes in Avro top-level union types (#2762))
=======

>>>>>>> c1f99f4bcb (GEOMESA-3061 Converters - support bytes in Avro top-level union types (#2762))
<<<<<<< HEAD
<<<<<<< HEAD
<<<<<<< HEAD
<<<<<<< HEAD
=======
<<<<<<< HEAD
<<<<<<< HEAD
>>>>>>> locationtech-main
=======
<<<<<<< HEAD
=======
>>>>>>> locatelli-main
<<<<<<< HEAD
=======
>>>>>>> locatelli-main
<<<<<<< HEAD
<<<<<<< HEAD
<<<<<<< HEAD
=======
>>>>>>> b8545eda8f (GEOMESA-3061 Converters - support bytes in Avro top-level union types (#2762))
=======
>>>>>>> 64a722e2a7 (GEOMESA-3176 Docs - fix download links in install instructions)
<<<<<<< HEAD
<<<<<<< HEAD
>>>>>>> locatelli-main
=======
>>>>>>> locatelli-main
=======
>>>>>>> locatelli-main
=======
>>>>>>> 8b8075f529 (GEOMESA-3176 Docs - fix download links in install instructions)
=======

>>>>>>> 338d952d43 (GEOMESA-3061 Converters - support bytes in Avro top-level union types (#2762))
<<<<<<< HEAD
<<<<<<< HEAD
<<<<<<< HEAD
<<<<<<< HEAD
=======
<<<<<<< HEAD
<<<<<<< HEAD
>>>>>>> locationtech-main
=======
<<<<<<< HEAD
=======
>>>>>>> locatelli-main
<<<<<<< HEAD
=======
>>>>>>> locatelli-main
<<<<<<< HEAD
<<<<<<< HEAD
<<<<<<< HEAD
=======
>>>>>>> 420027bc3f (GEOMESA-3061 Converters - support bytes in Avro top-level union types (#2762))
=======
>>>>>>> 341ef96c9a (GEOMESA-3176 Docs - fix download links in install instructions)
<<<<<<< HEAD
<<<<<<< HEAD
>>>>>>> locatelli-main
=======
>>>>>>> locatelli-main
=======
>>>>>>> locatelli-main
=======
>>>>>>> 64e2e43818 (GEOMESA-3176 Docs - fix download links in install instructions)
=======

>>>>>>> 9627a2de6a (GEOMESA-3061 Converters - support bytes in Avro top-level union types (#2762))
<<<<<<< HEAD
<<<<<<< HEAD
<<<<<<< HEAD
<<<<<<< HEAD
=======
<<<<<<< HEAD
<<<<<<< HEAD
>>>>>>> locationtech-main
=======
<<<<<<< HEAD
=======
>>>>>>> locatelli-main
<<<<<<< HEAD
=======
>>>>>>> locatelli-main
<<<<<<< HEAD
<<<<<<< HEAD
<<<<<<< HEAD
=======
>>>>>>> fc1024de7e (GEOMESA-3061 Converters - support bytes in Avro top-level union types (#2762))
=======
>>>>>>> 5712753579 (GEOMESA-3176 Docs - fix download links in install instructions)
<<<<<<< HEAD
<<<<<<< HEAD
>>>>>>> locatelli-main
=======
>>>>>>> locatelli-main
=======
>>>>>>> locatelli-main
=======
>>>>>>> b046434188 (GEOMESA-3176 Docs - fix download links in install instructions)
=======

>>>>>>> 76908c410a (GEOMESA-3061 Converters - support bytes in Avro top-level union types (#2762))
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
>>>>>>> 8435590eee (GEOMESA-3061 Converters - support bytes in Avro top-level union types (#2762))
<<<<<<< HEAD
>>>>>>> locatelli-main
=======
>>>>>>> locatelli-main
=======
<<<<<<< HEAD
=======
>>>>>>> 8435590eee (GEOMESA-3061 Converters - support bytes in Avro top-level union types (#2762))
>>>>>>> locatelli-main
=======

>>>>>>> 59a1fbb96e (GEOMESA-3061 Converters - support bytes in Avro top-level union types (#2762))
=======

>>>>>>> 30cd5ab927 (GEOMESA-3061 Converters - support bytes in Avro top-level union types (#2762))
<<<<<<< HEAD
<<<<<<< HEAD
=======
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
>>>>>>> 610d4a0e13 (GEOMESA-3176 Docs - fix download links in install instructions)
=======

>>>>>>> ffe4f9fd41 (GEOMESA-3061 Converters - support bytes in Avro top-level union types (#2762))
<<<<<<< HEAD
<<<<<<< HEAD
=======
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
>>>>>>> d25af58f86 (GEOMESA-3176 Docs - fix download links in install instructions)
=======

>>>>>>> ecddd8c3e7 (GEOMESA-3061 Converters - support bytes in Avro top-level union types (#2762))
<<<<<<< HEAD
<<<<<<< HEAD
=======
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
>>>>>>> 9c39003417 (GEOMESA-3176 Docs - fix download links in install instructions)
=======

>>>>>>> 036a470d76 (GEOMESA-3061 Converters - support bytes in Avro top-level union types (#2762))
<<<<<<< HEAD
<<<<<<< HEAD
=======
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

>>>>>>> 810876750d (GEOMESA-3061 Converters - support bytes in Avro top-level union types (#2762))
=======
<<<<<<< HEAD
<<<<<<< HEAD
=======
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
>>>>>>> ad7067b815 (GEOMESA-3061 Converters - support bytes in Avro top-level union types (#2762))
=======
>>>>>>> e3976d40bc (GEOMESA-3061 Converters - support bytes in Avro top-level union types (#2762))
<<<<<<< HEAD
<<<<<<< HEAD
=======
>>>>>>> 7dfac253b4 (GEOMESA-3061 Converters - support bytes in Avro top-level union types (#2762))
=======
<<<<<<< HEAD
<<<<<<< HEAD
=======
>>>>>>> locatelli-main
<<<<<<< HEAD
=======
>>>>>>> 7dfac253b4 (GEOMESA-3061 Converters - support bytes in Avro top-level union types (#2762))
=======
=======
>>>>>>> locatelli-main
>>>>>>> 23fc8cb805 (GEOMESA-3061 Converters - support bytes in Avro top-level union types (#2762))
=======
=======
>>>>>>> ad7067b815 (GEOMESA-3061 Converters - support bytes in Avro top-level union types (#2762))
>>>>>>> 99a32a726d (GEOMESA-3061 Converters - support bytes in Avro top-level union types (#2762))
=======
>>>>>>> 02bb344987 (GEOMESA-3061 Converters - support bytes in Avro top-level union types (#2762))
=======
=======
>>>>>>> 7dfac253b4 (GEOMESA-3061 Converters - support bytes in Avro top-level union types (#2762))
>>>>>>> a512d6b917 (GEOMESA-3061 Converters - support bytes in Avro top-level union types (#2762))
<<<<<<< HEAD
<<<<<<< HEAD
>>>>>>> locatelli-main
=======
>>>>>>> locatelli-main
=======
>>>>>>> locatelli-main
.. note::

  In the following examples, replace ``${TAG}`` with the corresponding GeoMesa version (e.g. |release_version|), and
  ``${VERSION}`` with the appropriate Scala plus GeoMesa versions (e.g. |scala_release_version|).
<<<<<<< HEAD
<<<<<<< HEAD
=======
<<<<<<< HEAD
=======
<<<<<<< HEAD
<<<<<<< HEAD
=======
<<<<<<< HEAD
>>>>>>> locatelli-main
=======
<<<<<<< HEAD
=======
<<<<<<< HEAD
>>>>>>> locatelli-main
=======
<<<<<<< HEAD
>>>>>>> locatelli-main
>>>>>>> 3be8d2a5a (Merge branch 'feature/postgis-fixes')
=======
>>>>>>> d845d7c1bd (GEOMESA-3254 Add Bloop build support)
=======
>>>>>>> 6d9a5b626c (GEOMESA-3061 Converters - support bytes in Avro top-level union types (#2762))
=======
>>>>>>> 10ade3dcd1 (GEOMESA-3176 Docs - fix download links in install instructions)
<<<<<<< HEAD
<<<<<<< HEAD
<<<<<<< HEAD
=======
=======
>>>>>>> locatelli-main
=======
>>>>>>> locatelli-main
=======
=======
>>>>>>> 3be8d2a5a (Merge branch 'feature/postgis-fixes')
>>>>>>> 264c9fa240 (Merge branch 'feature/postgis-fixes')
<<<<<<< HEAD
<<<<<<< HEAD
>>>>>>> locatelli-main
=======
>>>>>>> locatelli-main
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
<<<<<<< HEAD
<<<<<<< HEAD
<<<<<<< HEAD
<<<<<<< HEAD
<<<<<<< HEAD
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
<<<<<<< HEAD
=======
>>>>>>> 99a32a726d (GEOMESA-3061 Converters - support bytes in Avro top-level union types (#2762))
=======
>>>>>>> 02bb344987 (GEOMESA-3061 Converters - support bytes in Avro top-level union types (#2762))
=======
>>>>>>> a512d6b917 (GEOMESA-3061 Converters - support bytes in Avro top-level union types (#2762))
<<<<<<< HEAD
<<<<<<< HEAD
>>>>>>> locatelli-main
=======
>>>>>>> locatelli-main
=======
>>>>>>> locatelli-main
>>>>>>> 269558cf9e (GEOMESA-3061 Converters - support bytes in Avro top-level union types (#2762))
=======
>>>>>>> 3b4f3da2e1 (GEOMESA-3176 Docs - fix download links in install instructions)
=======
>>>>>>> ad7067b815 (GEOMESA-3061 Converters - support bytes in Avro top-level union types (#2762))
<<<<<<< HEAD
<<<<<<< HEAD
=======
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
>>>>>>> 17c1f8a18c (GEOMESA-3176 Docs - fix download links in install instructions)
=======
>>>>>>> e3976d40bc (GEOMESA-3061 Converters - support bytes in Avro top-level union types (#2762))
<<<<<<< HEAD
<<<<<<< HEAD
=======
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
>>>>>>> 82d93995e4 (GEOMESA-3176 Docs - fix download links in install instructions)
=======
>>>>>>> 7dfac253b4 (GEOMESA-3061 Converters - support bytes in Avro top-level union types (#2762))
<<<<<<< HEAD
=======
<<<<<<< HEAD
<<<<<<< HEAD
<<<<<<< HEAD
>>>>>>> locatelli-main
=======
=======
>>>>>>> locatelli-main
=======
>>>>>>> locatelli-main
=======
>>>>>>> 9d1506029d (GEOMESA-3061 Converters - support bytes in Avro top-level union types (#2762))
=======
>>>>>>> 7ec7e43c91 (GEOMESA-3061 Converters - support bytes in Avro top-level union types (#2762))
=======
>>>>>>> 2586fa6a40 (GEOMESA-3061 Converters - support bytes in Avro top-level union types (#2762))
=======
>>>>>>> 760781f8dd (GEOMESA-3176 Docs - fix download links in install instructions)
=======
=======
>>>>>>> a0befba4ce (GEOMESA-3176 Docs - fix download links in install instructions)
=======
>>>>>>> 3dd99aed4 (GEOMESA-3061 Converters - support bytes in Avro top-level union types (#2762))
>>>>>>> f7f4f4a836 (GEOMESA-3061 Converters - support bytes in Avro top-level union types (#2762))
=======
=======
>>>>>>> bcf78618df (GEOMESA-3176 Docs - fix download links in install instructions)
=======
>>>>>>> 31f6953312 (GEOMESA-3061 Converters - support bytes in Avro top-level union types (#2762))
=======
>>>>>>> 3dd99aed4 (GEOMESA-3061 Converters - support bytes in Avro top-level union types (#2762))
=======
>>>>>>> 4524373ac (GEOMESA-3061 Converters - support bytes in Avro top-level union types (#2762))
<<<<<<< HEAD
>>>>>>> df644ff83d (GEOMESA-3061 Converters - support bytes in Avro top-level union types (#2762))
=======
=======
>>>>>>> 4fbe39c62 (GEOMESA-3061 Converters - support bytes in Avro top-level union types (#2762))
>>>>>>> 31f6953312 (GEOMESA-3061 Converters - support bytes in Avro top-level union types (#2762))
<<<<<<< HEAD
<<<<<<< HEAD
<<<<<<< HEAD
=======
=======
>>>>>>> d498bef1ce (GEOMESA-3061 Converters - support bytes in Avro top-level union types (#2762))
>>>>>>> locatelli-main
=======
=======
>>>>>>> d498bef1ce (GEOMESA-3061 Converters - support bytes in Avro top-level union types (#2762))
>>>>>>> locatelli-main
=======
=======
>>>>>>> d498bef1ce (GEOMESA-3061 Converters - support bytes in Avro top-level union types (#2762))
>>>>>>> locatelli-main
.. note::

  In the following examples, replace ``${TAG}`` with the corresponding GeoMesa version (e.g. |release_version|), and
  ``${VERSION}`` with the appropriate Scala plus GeoMesa versions (e.g. |scala_release_version|).
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
>>>>>>> locatelli-main
=======
=======
>>>>>>> locatelli-main
=======
>>>>>>> locatelli-main
>>>>>>> 3be8d2a5a (Merge branch 'feature/postgis-fixes')
=======
=======
>>>>>>> 16b2e83f2 (GEOMESA-3176 Docs - fix download links in install instructions)
<<<<<<< HEAD
>>>>>>> 7813a31aa (GEOMESA-3176 Docs - fix download links in install instructions)
=======
=======
>>>>>>> 3be8d2a5a (Merge branch 'feature/postgis-fixes')
>>>>>>> e8cc4971c6 (Merge branch 'feature/postgis-fixes')
<<<<<<< HEAD
<<<<<<< HEAD
<<<<<<< HEAD

=======
=======
>>>>>>> locatelli-main
=======
>>>>>>> locatelli-main
=======
>>>>>>> 7fbbd56493 (GEOMESA-3061 Converters - support bytes in Avro top-level union types (#2762))
=======
>>>>>>> 3be8d2a5a4 (Merge branch 'feature/postgis-fixes')
=======
>>>>>>> 16b2e83f2 (GEOMESA-3176 Docs - fix download links in install instructions)
>>>>>>> 2aa923cc97 (GEOMESA-3176 Docs - fix download links in install instructions)

.. parsed-literal::

=======
>>>>>>> 10ade3dcd1 (GEOMESA-3176 Docs - fix download links in install instructions)
    $ export TAG="|release_version|"
    # note: |scala_binary_version| is the Scala build version
    $ export VERSION="|scala_binary_version|-${TAG}"

Then download and extract the binary distribution:
<<<<<<< HEAD
>>>>>>> f1fe65810a (GEOMESA-3176 Docs - fix download links in install instructions)
=======
<<<<<<< HEAD
>>>>>>> 165fb93a09 (GEOMESA-3176 Docs - fix download links in install instructions)

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
<<<<<<< HEAD
=======
>>>>>>> locatelli-main
<<<<<<< HEAD
<<<<<<< HEAD
<<<<<<< HEAD
<<<<<<< HEAD
<<<<<<< HEAD
>>>>>>> 6150564577 (GEOMESA-3061 Converters - support bytes in Avro top-level union types (#2762))
=======
>>>>>>> 449fb2085b (GEOMESA-3176 Docs - fix download links in install instructions)
=======
>>>>>>> 9d1506029d (GEOMESA-3061 Converters - support bytes in Avro top-level union types (#2762))
=======
>>>>>>> bc622ff59f (GEOMESA-3176 Docs - fix download links in install instructions)
=======
>>>>>>> 7ec7e43c91 (GEOMESA-3061 Converters - support bytes in Avro top-level union types (#2762))
=======
>>>>>>> 1cc4dadf2e (GEOMESA-3176 Docs - fix download links in install instructions)
=======
>>>>>>> 2586fa6a40 (GEOMESA-3061 Converters - support bytes in Avro top-level union types (#2762))
=======
.. note::
=======
=======
>>>>>>> a1f15598cb (GEOMESA-3061 Converters - support bytes in Avro top-level union types (#2762))
.. parsed-literal::
>>>>>>> e007dde981 (GEOMESA-3176 Docs - fix download links in install instructions)

    $ export TAG="|release_version|"
    # note: |scala_binary_version| is the Scala build version
    $ export VERSION="|scala_binary_version|-${TAG}"

Then download and extract the binary distribution:
=======
>>>>>>> e847488d8 (GEOMESA-3061 Converters - support bytes in Avro top-level union types (#2762))

<<<<<<< HEAD
>>>>>>> 1bb69524c2 (GEOMESA-3061 Converters - support bytes in Avro top-level union types (#2762))
=======
=======
>>>>>>> 6a26990f7 (GEOMESA-3176 Docs - fix download links in install instructions)
<<<<<<< HEAD
>>>>>>> 760781f8dd (GEOMESA-3176 Docs - fix download links in install instructions)
=======
=======

>>>>>>> 3dd99aed4 (GEOMESA-3061 Converters - support bytes in Avro top-level union types (#2762))
<<<<<<< HEAD
>>>>>>> f7f4f4a836 (GEOMESA-3061 Converters - support bytes in Avro top-level union types (#2762))
=======
=======
>>>>>>> baa90e85a (GEOMESA-3176 Docs - fix download links in install instructions)
<<<<<<< HEAD
>>>>>>> a0befba4ce (GEOMESA-3176 Docs - fix download links in install instructions)
=======
=======

>>>>>>> 4524373ac (GEOMESA-3061 Converters - support bytes in Avro top-level union types (#2762))
<<<<<<< HEAD
>>>>>>> df644ff83d (GEOMESA-3061 Converters - support bytes in Avro top-level union types (#2762))
=======
=======
>>>>>>> 46c05fed5 (GEOMESA-3176 Docs - fix download links in install instructions)
<<<<<<< HEAD
>>>>>>> bcf78618df (GEOMESA-3176 Docs - fix download links in install instructions)
=======
=======

>>>>>>> 4fbe39c62 (GEOMESA-3061 Converters - support bytes in Avro top-level union types (#2762))
<<<<<<< HEAD
>>>>>>> 31f6953312 (GEOMESA-3061 Converters - support bytes in Avro top-level union types (#2762))
=======
=======
.. note::
=======
>>>>>>> 2aa923cc9 (GEOMESA-3176 Docs - fix download links in install instructions)
<<<<<<< HEAD
<<<<<<< HEAD
<<<<<<< HEAD
=======
<<<<<<< HEAD
>>>>>>> locatelli-main
=======
>>>>>>> locatelli-main
=======
>>>>>>> locatelli-main

.. parsed-literal::
>>>>>>> bdcaf0ab5e (GEOMESA-3176 Docs - fix download links in install instructions)

    $ export TAG="|release_version|"
    # note: |scala_binary_version| is the Scala build version
    $ export VERSION="|scala_binary_version|-${TAG}"

Then download and extract the binary distribution:

>>>>>>> 81ee66102b (GEOMESA-3061 Converters - support bytes in Avro top-level union types (#2762))
>>>>>>> a1f15598cb (GEOMESA-3061 Converters - support bytes in Avro top-level union types (#2762))
=======
>>>>>>> 8150bc0e65 (GEOMESA-3176 Docs - fix download links in install instructions)
>>>>>>> ecd45f2c3e (GEOMESA-3176 Docs - fix download links in install instructions)
<<<<<<< HEAD
<<<<<<< HEAD
=======
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
>>>>>>> 6a2cd10c1c (GEOMESA-3061 Converters - support bytes in Avro top-level union types (#2762))
>>>>>>> 6fc8851879 (GEOMESA-3061 Converters - support bytes in Avro top-level union types (#2762))
=======
>>>>>>> 4d9f87a514 (GEOMESA-3176 Docs - fix download links in install instructions)
>>>>>>> 3995e6a61c (GEOMESA-3176 Docs - fix download links in install instructions)
<<<<<<< HEAD
<<<<<<< HEAD
=======
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
>>>>>>> 8a6a96234b (GEOMESA-3061 Converters - support bytes in Avro top-level union types (#2762))
>>>>>>> 6514df9383 (GEOMESA-3061 Converters - support bytes in Avro top-level union types (#2762))
=======
>>>>>>> bd3233180f (GEOMESA-3176 Docs - fix download links in install instructions)
>>>>>>> cabde54511 (GEOMESA-3176 Docs - fix download links in install instructions)
<<<<<<< HEAD
<<<<<<< HEAD
=======
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
>>>>>>> 0c734cda2b (GEOMESA-3061 Converters - support bytes in Avro top-level union types (#2762))
>>>>>>> c91f823574 (GEOMESA-3061 Converters - support bytes in Avro top-level union types (#2762))
=======
>>>>>>> 67e4c1354f (GEOMESA-3061 Converters - support bytes in Avro top-level union types (#2762))
>>>>>>> a52e4429be (GEOMESA-3061 Converters - support bytes in Avro top-level union types (#2762))
<<<<<<< HEAD
<<<<<<< HEAD
=======
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

>>>>>>> 947a867d1 (GEOMESA-3061 Converters - support bytes in Avro top-level union types (#2762))
<<<<<<< HEAD
>>>>>>> 748532d2db (GEOMESA-3061 Converters - support bytes in Avro top-level union types (#2762))
<<<<<<< HEAD
>>>>>>> bc73cc4d41 (GEOMESA-3061 Converters - support bytes in Avro top-level union types (#2762))
=======
=======
=======
>>>>>>> 279de44d3 (GEOMESA-3176 Docs - fix download links in install instructions)
>>>>>>> b7c6b904be (GEOMESA-3176 Docs - fix download links in install instructions)
>>>>>>> 813f24c01d (GEOMESA-3176 Docs - fix download links in install instructions)
=======
>>>>>>> 250f01786f (GEOMESA-3061 Converters - support bytes in Avro top-level union types (#2762))
>>>>>>> 98eacc8492 (GEOMESA-3061 Converters - support bytes in Avro top-level union types (#2762))
<<<<<<< HEAD
<<<<<<< HEAD
=======
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
>>>>>>> b42125fac1 (GEOMESA-3176 Docs - fix download links in install instructions)
>>>>>>> 1a737b13ed (GEOMESA-3176 Docs - fix download links in install instructions)
=======
>>>>>>> 813488e18c (GEOMESA-3061 Converters - support bytes in Avro top-level union types (#2762))
>>>>>>> 664350d86f (GEOMESA-3061 Converters - support bytes in Avro top-level union types (#2762))
<<<<<<< HEAD
<<<<<<< HEAD
=======
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
>>>>>>> 5c3f315bc0 (GEOMESA-3176 Docs - fix download links in install instructions)
>>>>>>> 3e34d2451e (GEOMESA-3176 Docs - fix download links in install instructions)
=======
>>>>>>> a85aff60b3 (GEOMESA-3061 Converters - support bytes in Avro top-level union types (#2762))
<<<<<<< HEAD
<<<<<<< HEAD
=======
<<<<<<< HEAD
<<<<<<< HEAD
<<<<<<< HEAD
=======
>>>>>>> 9d0ea08871 (GEOMESA-3061 Converters - support bytes in Avro top-level union types (#2762))
>>>>>>> locatelli-main
=======
<<<<<<< HEAD
=======
>>>>>>> 9d0ea08871 (GEOMESA-3061 Converters - support bytes in Avro top-level union types (#2762))
>>>>>>> locatelli-main
=======
>>>>>>> 9d0ea08871 (GEOMESA-3061 Converters - support bytes in Avro top-level union types (#2762))
>>>>>>> locatelli-main
=======
=======

>>>>>>> f0b9bd8121 (GEOMESA-3061 Converters - support bytes in Avro top-level union types (#2762))
>>>>>>> 0104fb37e4 (GEOMESA-3061 Converters - support bytes in Avro top-level union types (#2762))
<<<<<<< HEAD
<<<<<<< HEAD
=======
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
>>>>>>> c9c24ca3d7 (GEOMESA-3061 Converters - support bytes in Avro top-level union types (#2762))
=======
=======
>>>>>>> 8b8075f529 (GEOMESA-3176 Docs - fix download links in install instructions)
>>>>>>> 4492950388 (GEOMESA-3176 Docs - fix download links in install instructions)
<<<<<<< HEAD
<<<<<<< HEAD
=======
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
>>>>>>> b9c0fc77b9 (GEOMESA-3061 Converters - support bytes in Avro top-level union types (#2762))
=======
=======
>>>>>>> 64e2e43818 (GEOMESA-3176 Docs - fix download links in install instructions)
>>>>>>> aff2787fc2 (GEOMESA-3176 Docs - fix download links in install instructions)
<<<<<<< HEAD
<<<<<<< HEAD
=======
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
>>>>>>> d69216810e (GEOMESA-3061 Converters - support bytes in Avro top-level union types (#2762))
=======
=======
>>>>>>> b046434188 (GEOMESA-3176 Docs - fix download links in install instructions)
>>>>>>> 0753bfcbe4 (GEOMESA-3176 Docs - fix download links in install instructions)
<<<<<<< HEAD
<<<<<<< HEAD
=======
>>>>>>> 17f16286aa (GEOMESA-3061 Converters - support bytes in Avro top-level union types (#2762))
<<<<<<< HEAD
=======
<<<<<<< HEAD
=======
>>>>>>> locatelli-main
<<<<<<< HEAD
=======
>>>>>>> 17f16286aa (GEOMESA-3061 Converters - support bytes in Avro top-level union types (#2762))
=======
>>>>>>> locatelli-main
<<<<<<< HEAD
=======

>>>>>>> 3d5144418e (GEOMESA-3061 Converters - support bytes in Avro top-level union types (#2762))
=======

>>>>>>> c7403e8a5f (GEOMESA-3061 Converters - support bytes in Avro top-level union types (#2762))
=======
>>>>>>> 31ac28fff4 (GEOMESA-3176 Docs - fix download links in install instructions)
=======

>>>>>>> 4ac5af223d (GEOMESA-3061 Converters - support bytes in Avro top-level union types (#2762))
=======
>>>>>>> 26bf3ffae4 (GEOMESA-3176 Docs - fix download links in install instructions)
=======

>>>>>>> 62a28bf2e7 (GEOMESA-3061 Converters - support bytes in Avro top-level union types (#2762))
=======
>>>>>>> 42adcd38ba (GEOMESA-3176 Docs - fix download links in install instructions)
=======

>>>>>>> 72919d0f84 (GEOMESA-3061 Converters - support bytes in Avro top-level union types (#2762))
=======

>>>>>>> d498bef1ce (GEOMESA-3061 Converters - support bytes in Avro top-level union types (#2762))
=======
=======
>>>>>>> 107726440b (GEOMESA-3061 Converters - support bytes in Avro top-level union types (#2762))
=======
>>>>>>> 211b96b2ed (GEOMESA-3061 Converters - support bytes in Avro top-level union types (#2762))
=======
>>>>>>> 7ca1082a3f (GEOMESA-3061 Converters - support bytes in Avro top-level union types (#2762))
.. note::

  In the following examples, replace ``${TAG}`` with the corresponding GeoMesa version (e.g. |release_version|), and
  ``${VERSION}`` with the appropriate Scala plus GeoMesa versions (e.g. |scala_release_version|).
=======
>>>>>>> 3be8d2a5a (Merge branch 'feature/postgis-fixes')
=======
>>>>>>> d845d7c1bd (GEOMESA-3254 Add Bloop build support)
<<<<<<< HEAD
<<<<<<< HEAD
=======
>>>>>>> 6d9a5b626c (GEOMESA-3061 Converters - support bytes in Avro top-level union types (#2762))
=======
>>>>>>> 10ade3dcd1 (GEOMESA-3176 Docs - fix download links in install instructions)
<<<<<<< HEAD
=======
>>>>>>> c738f63bd9 (GEOMESA-3254 Add Bloop build support)
=======
=======
>>>>>>> 6d9a5b626c (GEOMESA-3061 Converters - support bytes in Avro top-level union types (#2762))
>>>>>>> 3676d4e56a (GEOMESA-3061 Converters - support bytes in Avro top-level union types (#2762))
=======
>>>>>>> 3f60902092 (GEOMESA-3176 Docs - fix download links in install instructions)

<<<<<<< HEAD
<<<<<<< HEAD
<<<<<<< HEAD
<<<<<<< HEAD
<<<<<<< HEAD
<<<<<<< HEAD
<<<<<<< HEAD
<<<<<<< HEAD
<<<<<<< HEAD
<<<<<<< HEAD
<<<<<<< HEAD
<<<<<<< HEAD
<<<<<<< HEAD
<<<<<<< HEAD
<<<<<<< HEAD
<<<<<<< HEAD
<<<<<<< HEAD
<<<<<<< HEAD
<<<<<<< HEAD
<<<<<<< HEAD
<<<<<<< HEAD
<<<<<<< HEAD
<<<<<<< HEAD
<<<<<<< HEAD
<<<<<<< HEAD
<<<<<<< HEAD
<<<<<<< HEAD
<<<<<<< HEAD
<<<<<<< HEAD
>>>>>>> 64536d7b4a (GEOMESA-3061 Converters - support bytes in Avro top-level union types (#2762))
=======
>>>>>>> 9b83a71a1e (GEOMESA-3176 Docs - fix download links in install instructions)
=======
>>>>>>> 107726440b (GEOMESA-3061 Converters - support bytes in Avro top-level union types (#2762))
=======
>>>>>>> 1ce7179e65 (GEOMESA-3176 Docs - fix download links in install instructions)
=======
>>>>>>> 211b96b2ed (GEOMESA-3061 Converters - support bytes in Avro top-level union types (#2762))
=======
>>>>>>> 798faeb761 (GEOMESA-3176 Docs - fix download links in install instructions)
=======
>>>>>>> 7ca1082a3f (GEOMESA-3061 Converters - support bytes in Avro top-level union types (#2762))
=======
=======
>>>>>>> 07e2884d79 (GEOMESA-3061 Converters - support bytes in Avro top-level union types (#2762))
=======
>>>>>>> d6730faea6 (GEOMESA-3061 Converters - support bytes in Avro top-level union types (#2762))
=======
>>>>>>> 3382f42b39 (GEOMESA-3061 Converters - support bytes in Avro top-level union types (#2762))
=======
>>>>>>> f05d4ba95a (GEOMESA-3176 Docs - fix download links in install instructions)
=======
=======
>>>>>>> 2de87fb23b (GEOMESA-3176 Docs - fix download links in install instructions)
=======
>>>>>>> 3dd99aed4 (GEOMESA-3061 Converters - support bytes in Avro top-level union types (#2762))
>>>>>>> 3bbe93d6c5 (GEOMESA-3061 Converters - support bytes in Avro top-level union types (#2762))
=======
=======
>>>>>>> cd86312814 (GEOMESA-3176 Docs - fix download links in install instructions)
=======
>>>>>>> 11763b5af8 (GEOMESA-3061 Converters - support bytes in Avro top-level union types (#2762))
=======
>>>>>>> 3dd99aed4 (GEOMESA-3061 Converters - support bytes in Avro top-level union types (#2762))
=======
>>>>>>> 4524373ac (GEOMESA-3061 Converters - support bytes in Avro top-level union types (#2762))
<<<<<<< HEAD
>>>>>>> c6cc684d8c (GEOMESA-3061 Converters - support bytes in Avro top-level union types (#2762))
=======
=======
>>>>>>> 4fbe39c62 (GEOMESA-3061 Converters - support bytes in Avro top-level union types (#2762))
>>>>>>> 11763b5af8 (GEOMESA-3061 Converters - support bytes in Avro top-level union types (#2762))
.. note::

  In the following examples, replace ``${TAG}`` with the corresponding GeoMesa version (e.g. |release_version|), and
  ``${VERSION}`` with the appropriate Scala plus GeoMesa versions (e.g. |scala_release_version|).
<<<<<<< HEAD
<<<<<<< HEAD
<<<<<<< HEAD
<<<<<<< HEAD
<<<<<<< HEAD
=======
>>>>>>> 3be8d2a5a (Merge branch 'feature/postgis-fixes')
=======
=======
>>>>>>> 16b2e83f2 (GEOMESA-3176 Docs - fix download links in install instructions)
<<<<<<< HEAD
>>>>>>> 7813a31aa (GEOMESA-3176 Docs - fix download links in install instructions)
=======
=======
>>>>>>> 3be8d2a5a (Merge branch 'feature/postgis-fixes')
>>>>>>> e8cc4971c6 (Merge branch 'feature/postgis-fixes')

<<<<<<< HEAD
<<<<<<< HEAD
<<<<<<< HEAD
<<<<<<< HEAD
<<<<<<< HEAD
<<<<<<< HEAD
>>>>>>> 930f10d338 (GEOMESA-3061 Converters - support bytes in Avro top-level union types (#2762))
=======
>>>>>>> dc2038e108 (GEOMESA-3176 Docs - fix download links in install instructions)
=======
>>>>>>> 07e2884d79 (GEOMESA-3061 Converters - support bytes in Avro top-level union types (#2762))
=======
>>>>>>> 4431c091e2 (GEOMESA-3176 Docs - fix download links in install instructions)
=======
>>>>>>> d6730faea6 (GEOMESA-3061 Converters - support bytes in Avro top-level union types (#2762))
=======
>>>>>>> 312769c8d4 (GEOMESA-3176 Docs - fix download links in install instructions)
=======
>>>>>>> 3382f42b39 (GEOMESA-3061 Converters - support bytes in Avro top-level union types (#2762))
=======
.. note::
=======
=======
>>>>>>> b8ebbf6083 (GEOMESA-3061 Converters - support bytes in Avro top-level union types (#2762))
.. parsed-literal::
>>>>>>> 80c85285b7 (GEOMESA-3176 Docs - fix download links in install instructions)

    $ export TAG="|release_version|"
    # note: |scala_binary_version| is the Scala build version
    $ export VERSION="|scala_binary_version|-${TAG}"

Then download and extract the binary distribution:
=======
>>>>>>> e847488d8 (GEOMESA-3061 Converters - support bytes in Avro top-level union types (#2762))

<<<<<<< HEAD
>>>>>>> 27afb28ab6 (GEOMESA-3061 Converters - support bytes in Avro top-level union types (#2762))
=======
=======
>>>>>>> 6a26990f7 (GEOMESA-3176 Docs - fix download links in install instructions)
<<<<<<< HEAD
>>>>>>> f05d4ba95a (GEOMESA-3176 Docs - fix download links in install instructions)
=======
=======

>>>>>>> 3dd99aed4 (GEOMESA-3061 Converters - support bytes in Avro top-level union types (#2762))
<<<<<<< HEAD
>>>>>>> 3bbe93d6c5 (GEOMESA-3061 Converters - support bytes in Avro top-level union types (#2762))
=======
=======
>>>>>>> baa90e85a (GEOMESA-3176 Docs - fix download links in install instructions)
<<<<<<< HEAD
>>>>>>> 2de87fb23b (GEOMESA-3176 Docs - fix download links in install instructions)
=======
=======

>>>>>>> 4524373ac (GEOMESA-3061 Converters - support bytes in Avro top-level union types (#2762))
<<<<<<< HEAD
>>>>>>> c6cc684d8c (GEOMESA-3061 Converters - support bytes in Avro top-level union types (#2762))
=======
=======
>>>>>>> 46c05fed5 (GEOMESA-3176 Docs - fix download links in install instructions)
<<<<<<< HEAD
>>>>>>> cd86312814 (GEOMESA-3176 Docs - fix download links in install instructions)
=======
=======

>>>>>>> 4fbe39c62 (GEOMESA-3061 Converters - support bytes in Avro top-level union types (#2762))
<<<<<<< HEAD
>>>>>>> 11763b5af8 (GEOMESA-3061 Converters - support bytes in Avro top-level union types (#2762))
=======
=======
.. note::
=======
>>>>>>> 2aa923cc9 (GEOMESA-3176 Docs - fix download links in install instructions)

.. parsed-literal::
>>>>>>> bdcaf0ab5e (GEOMESA-3176 Docs - fix download links in install instructions)

    $ export TAG="|release_version|"
    # note: |scala_binary_version| is the Scala build version
    $ export VERSION="|scala_binary_version|-${TAG}"

Then download and extract the binary distribution:

>>>>>>> 81ee66102b (GEOMESA-3061 Converters - support bytes in Avro top-level union types (#2762))
>>>>>>> b8ebbf6083 (GEOMESA-3061 Converters - support bytes in Avro top-level union types (#2762))
=======
>>>>>>> 8150bc0e65 (GEOMESA-3176 Docs - fix download links in install instructions)
>>>>>>> eff03389ef (GEOMESA-3176 Docs - fix download links in install instructions)
=======
>>>>>>> 6a2cd10c1c (GEOMESA-3061 Converters - support bytes in Avro top-level union types (#2762))
>>>>>>> 65b9e1925e (GEOMESA-3061 Converters - support bytes in Avro top-level union types (#2762))
=======
>>>>>>> 4d9f87a514 (GEOMESA-3176 Docs - fix download links in install instructions)
>>>>>>> 033543c609 (GEOMESA-3176 Docs - fix download links in install instructions)
=======
>>>>>>> 8a6a96234b (GEOMESA-3061 Converters - support bytes in Avro top-level union types (#2762))
>>>>>>> 9d2bdda5fd (GEOMESA-3061 Converters - support bytes in Avro top-level union types (#2762))
=======
>>>>>>> bd3233180f (GEOMESA-3176 Docs - fix download links in install instructions)
>>>>>>> 96b5e91bc8 (GEOMESA-3176 Docs - fix download links in install instructions)
=======
>>>>>>> 0c734cda2b (GEOMESA-3061 Converters - support bytes in Avro top-level union types (#2762))
>>>>>>> 6e48efcdc2 (GEOMESA-3061 Converters - support bytes in Avro top-level union types (#2762))
=======
>>>>>>> 67e4c1354f (GEOMESA-3061 Converters - support bytes in Avro top-level union types (#2762))
>>>>>>> 1ea8b10ac7 (GEOMESA-3061 Converters - support bytes in Avro top-level union types (#2762))
=======

>>>>>>> 947a867d1 (GEOMESA-3061 Converters - support bytes in Avro top-level union types (#2762))
<<<<<<< HEAD
>>>>>>> 748532d2db (GEOMESA-3061 Converters - support bytes in Avro top-level union types (#2762))
<<<<<<< HEAD
>>>>>>> 37ee765e9b (GEOMESA-3061 Converters - support bytes in Avro top-level union types (#2762))
=======
=======
=======
>>>>>>> 279de44d3 (GEOMESA-3176 Docs - fix download links in install instructions)
>>>>>>> b7c6b904be (GEOMESA-3176 Docs - fix download links in install instructions)
>>>>>>> b7b8a67dc7 (GEOMESA-3176 Docs - fix download links in install instructions)
=======
>>>>>>> 250f01786f (GEOMESA-3061 Converters - support bytes in Avro top-level union types (#2762))
>>>>>>> 83b11fa843 (GEOMESA-3061 Converters - support bytes in Avro top-level union types (#2762))
=======
>>>>>>> b42125fac1 (GEOMESA-3176 Docs - fix download links in install instructions)
>>>>>>> 2e65415d49 (GEOMESA-3176 Docs - fix download links in install instructions)
=======
>>>>>>> 813488e18c (GEOMESA-3061 Converters - support bytes in Avro top-level union types (#2762))
>>>>>>> 1c9a51a667 (GEOMESA-3061 Converters - support bytes in Avro top-level union types (#2762))
=======
>>>>>>> 5c3f315bc0 (GEOMESA-3176 Docs - fix download links in install instructions)
>>>>>>> 5603dc69a0 (GEOMESA-3176 Docs - fix download links in install instructions)
=======
>>>>>>> f958055259 (GEOMESA-3061 Converters - support bytes in Avro top-level union types (#2762))
=======
=======

>>>>>>> f0b9bd8121 (GEOMESA-3061 Converters - support bytes in Avro top-level union types (#2762))
>>>>>>> 9293965a7d (GEOMESA-3061 Converters - support bytes in Avro top-level union types (#2762))
=======
>>>>>>> 2bce465a3f (GEOMESA-3061 Converters - support bytes in Avro top-level union types (#2762))
=======
=======
>>>>>>> 8b8075f529 (GEOMESA-3176 Docs - fix download links in install instructions)
>>>>>>> 13325d17c4 (GEOMESA-3176 Docs - fix download links in install instructions)
=======
>>>>>>> 1f17117603 (GEOMESA-3061 Converters - support bytes in Avro top-level union types (#2762))
=======
=======
>>>>>>> 64e2e43818 (GEOMESA-3176 Docs - fix download links in install instructions)
>>>>>>> e5cf96e863 (GEOMESA-3176 Docs - fix download links in install instructions)
=======
>>>>>>> 732efe4910 (GEOMESA-3061 Converters - support bytes in Avro top-level union types (#2762))
=======
=======
>>>>>>> b046434188 (GEOMESA-3176 Docs - fix download links in install instructions)
>>>>>>> d72089513c (GEOMESA-3176 Docs - fix download links in install instructions)
=======
>>>>>>> f91e29a57f (GEOMESA-3061 Converters - support bytes in Avro top-level union types (#2762))
=======
=======

>>>>>>> 59a1fbb96e (GEOMESA-3061 Converters - support bytes in Avro top-level union types (#2762))
>>>>>>> ac217b392d (GEOMESA-3061 Converters - support bytes in Avro top-level union types (#2762))
=======
>>>>>>> b8be7d30a1 (GEOMESA-3061 Converters - support bytes in Avro top-level union types (#2762))
=======
=======
>>>>>>> 610d4a0e13 (GEOMESA-3176 Docs - fix download links in install instructions)
>>>>>>> 2de4be5460 (GEOMESA-3176 Docs - fix download links in install instructions)
=======
>>>>>>> 789f6eba49 (GEOMESA-3061 Converters - support bytes in Avro top-level union types (#2762))
=======
=======
>>>>>>> d25af58f86 (GEOMESA-3176 Docs - fix download links in install instructions)
>>>>>>> 6f1e1da646 (GEOMESA-3176 Docs - fix download links in install instructions)
=======
>>>>>>> 4fc0f66d4f (GEOMESA-3061 Converters - support bytes in Avro top-level union types (#2762))
=======
=======
>>>>>>> 9c39003417 (GEOMESA-3176 Docs - fix download links in install instructions)
>>>>>>> ef8de676d3 (GEOMESA-3176 Docs - fix download links in install instructions)
=======
>>>>>>> 437d0aab1c (GEOMESA-3061 Converters - support bytes in Avro top-level union types (#2762))
=======
=======

>>>>>>> 810876750d (GEOMESA-3061 Converters - support bytes in Avro top-level union types (#2762))
>>>>>>> 5a55bf9756 (GEOMESA-3061 Converters - support bytes in Avro top-level union types (#2762))
=======

=======
>>>>>>> 8111fd4732 (GEOMESA-3061 Converters - support bytes in Avro top-level union types (#2762))
=======
>>>>>>> 5fa9f37061 (GEOMESA-3176 Docs - fix download links in install instructions)
=======
>>>>>>> b2177e9015 (GEOMESA-3061 Converters - support bytes in Avro top-level union types (#2762))
=======
>>>>>>> 955de6bfcc (GEOMESA-3176 Docs - fix download links in install instructions)
=======
>>>>>>> 897de97047 (GEOMESA-3061 Converters - support bytes in Avro top-level union types (#2762))
=======
>>>>>>> 057f644239 (GEOMESA-3176 Docs - fix download links in install instructions)
=======
>>>>>>> d329320e6a (GEOMESA-3061 Converters - support bytes in Avro top-level union types (#2762))
=======
>>>>>>> a2ed7a128d (GEOMESA-3176 Docs - fix download links in install instructions)
=======
>>>>>>> 5a365695e1 (GEOMESA-3061 Converters - support bytes in Avro top-level union types (#2762))
=======
>>>>>>> f40ce84a61 (GEOMESA-3176 Docs - fix download links in install instructions)
=======
>>>>>>> 3ae7021103 (GEOMESA-3061 Converters - support bytes in Avro top-level union types (#2762))
=======
>>>>>>> e4f52faffa (GEOMESA-3176 Docs - fix download links in install instructions)
=======
>>>>>>> 14cf946af4 (GEOMESA-3061 Converters - support bytes in Avro top-level union types (#2762))
>>>>>>> 269558cf9e (GEOMESA-3061 Converters - support bytes in Avro top-level union types (#2762))
<<<<<<< HEAD
>>>>>>> 23fc8cb805 (GEOMESA-3061 Converters - support bytes in Avro top-level union types (#2762))
=======
=======
>>>>>>> 3b4f3da2e1 (GEOMESA-3176 Docs - fix download links in install instructions)
>>>>>>> b47097b7bb (GEOMESA-3176 Docs - fix download links in install instructions)
=======
>>>>>>> 99a32a726d (GEOMESA-3061 Converters - support bytes in Avro top-level union types (#2762))
=======
=======
>>>>>>> 17c1f8a18c (GEOMESA-3176 Docs - fix download links in install instructions)
>>>>>>> 95f020af8c (GEOMESA-3176 Docs - fix download links in install instructions)
=======
>>>>>>> 02bb344987 (GEOMESA-3061 Converters - support bytes in Avro top-level union types (#2762))
=======
=======
>>>>>>> 82d93995e4 (GEOMESA-3176 Docs - fix download links in install instructions)
>>>>>>> 26c7d06850 (GEOMESA-3176 Docs - fix download links in install instructions)
=======
<<<<<<< HEAD
>>>>>>> a512d6b917 (GEOMESA-3061 Converters - support bytes in Avro top-level union types (#2762))
=======
>>>>>>> 7dfac253b4 (GEOMESA-3061 Converters - support bytes in Avro top-level union types (#2762))
=======
=======
>>>>>>> 9d1506029d (GEOMESA-3061 Converters - support bytes in Avro top-level union types (#2762))
=======
>>>>>>> 7ec7e43c91 (GEOMESA-3061 Converters - support bytes in Avro top-level union types (#2762))
=======
>>>>>>> 2586fa6a40 (GEOMESA-3061 Converters - support bytes in Avro top-level union types (#2762))
=======
>>>>>>> 760781f8dd (GEOMESA-3176 Docs - fix download links in install instructions)
=======
=======
>>>>>>> a0befba4ce (GEOMESA-3176 Docs - fix download links in install instructions)
=======
>>>>>>> 3dd99aed4 (GEOMESA-3061 Converters - support bytes in Avro top-level union types (#2762))
>>>>>>> f7f4f4a836 (GEOMESA-3061 Converters - support bytes in Avro top-level union types (#2762))
=======
=======
>>>>>>> bcf78618df (GEOMESA-3176 Docs - fix download links in install instructions)
=======
>>>>>>> 31f6953312 (GEOMESA-3061 Converters - support bytes in Avro top-level union types (#2762))
=======
>>>>>>> 3dd99aed4 (GEOMESA-3061 Converters - support bytes in Avro top-level union types (#2762))
=======
>>>>>>> 4524373ac (GEOMESA-3061 Converters - support bytes in Avro top-level union types (#2762))
<<<<<<< HEAD
>>>>>>> df644ff83d (GEOMESA-3061 Converters - support bytes in Avro top-level union types (#2762))
=======
=======
>>>>>>> 4fbe39c62 (GEOMESA-3061 Converters - support bytes in Avro top-level union types (#2762))
>>>>>>> 31f6953312 (GEOMESA-3061 Converters - support bytes in Avro top-level union types (#2762))
.. note::

  In the following examples, replace ``${TAG}`` with the corresponding GeoMesa version (e.g. |release_version|), and
  ``${VERSION}`` with the appropriate Scala plus GeoMesa versions (e.g. |scala_release_version|).
<<<<<<< HEAD
<<<<<<< HEAD
<<<<<<< HEAD
<<<<<<< HEAD
<<<<<<< HEAD
=======
>>>>>>> 3be8d2a5a (Merge branch 'feature/postgis-fixes')
=======
=======
>>>>>>> 16b2e83f2 (GEOMESA-3176 Docs - fix download links in install instructions)
>>>>>>> 7813a31aa (GEOMESA-3176 Docs - fix download links in install instructions)
=======
=======
>>>>>>> 3be8d2a5a (Merge branch 'feature/postgis-fixes')
>>>>>>> e8cc4971c6 (Merge branch 'feature/postgis-fixes')

<<<<<<< HEAD
<<<<<<< HEAD
<<<<<<< HEAD
<<<<<<< HEAD
<<<<<<< HEAD
<<<<<<< HEAD
>>>>>>> 6150564577 (GEOMESA-3061 Converters - support bytes in Avro top-level union types (#2762))
<<<<<<< HEAD
>>>>>>> 8111fd4732 (GEOMESA-3061 Converters - support bytes in Avro top-level union types (#2762))
=======
=======
>>>>>>> 449fb2085b (GEOMESA-3176 Docs - fix download links in install instructions)
<<<<<<< HEAD
>>>>>>> 5fa9f37061 (GEOMESA-3176 Docs - fix download links in install instructions)
=======
=======
>>>>>>> 9d1506029d (GEOMESA-3061 Converters - support bytes in Avro top-level union types (#2762))
<<<<<<< HEAD
>>>>>>> b2177e9015 (GEOMESA-3061 Converters - support bytes in Avro top-level union types (#2762))
=======
=======
>>>>>>> bc622ff59f (GEOMESA-3176 Docs - fix download links in install instructions)
<<<<<<< HEAD
>>>>>>> 955de6bfcc (GEOMESA-3176 Docs - fix download links in install instructions)
=======
=======
>>>>>>> 7ec7e43c91 (GEOMESA-3061 Converters - support bytes in Avro top-level union types (#2762))
<<<<<<< HEAD
>>>>>>> 897de97047 (GEOMESA-3061 Converters - support bytes in Avro top-level union types (#2762))
=======
=======
>>>>>>> 1cc4dadf2e (GEOMESA-3176 Docs - fix download links in install instructions)
<<<<<<< HEAD
>>>>>>> 057f644239 (GEOMESA-3176 Docs - fix download links in install instructions)
=======
=======
>>>>>>> 2586fa6a40 (GEOMESA-3061 Converters - support bytes in Avro top-level union types (#2762))
<<<<<<< HEAD
>>>>>>> d329320e6a (GEOMESA-3061 Converters - support bytes in Avro top-level union types (#2762))
=======
=======
.. note::
=======
=======
>>>>>>> a1f15598cb (GEOMESA-3061 Converters - support bytes in Avro top-level union types (#2762))
.. parsed-literal::
>>>>>>> e007dde981 (GEOMESA-3176 Docs - fix download links in install instructions)

    $ export TAG="|release_version|"
    # note: |scala_binary_version| is the Scala build version
    $ export VERSION="|scala_binary_version|-${TAG}"

Then download and extract the binary distribution:
=======
>>>>>>> e847488d8 (GEOMESA-3061 Converters - support bytes in Avro top-level union types (#2762))

<<<<<<< HEAD
>>>>>>> 1bb69524c2 (GEOMESA-3061 Converters - support bytes in Avro top-level union types (#2762))
<<<<<<< HEAD
>>>>>>> a5b0374ee2 (GEOMESA-3061 Converters - support bytes in Avro top-level union types (#2762))
=======
=======
=======
>>>>>>> 6a26990f7 (GEOMESA-3176 Docs - fix download links in install instructions)
<<<<<<< HEAD
>>>>>>> 760781f8dd (GEOMESA-3176 Docs - fix download links in install instructions)
<<<<<<< HEAD
>>>>>>> a2ed7a128d (GEOMESA-3176 Docs - fix download links in install instructions)
=======
=======
=======

>>>>>>> 3dd99aed4 (GEOMESA-3061 Converters - support bytes in Avro top-level union types (#2762))
<<<<<<< HEAD
>>>>>>> f7f4f4a836 (GEOMESA-3061 Converters - support bytes in Avro top-level union types (#2762))
<<<<<<< HEAD
>>>>>>> 5a365695e1 (GEOMESA-3061 Converters - support bytes in Avro top-level union types (#2762))
=======
=======
=======
>>>>>>> baa90e85a (GEOMESA-3176 Docs - fix download links in install instructions)
<<<<<<< HEAD
>>>>>>> a0befba4ce (GEOMESA-3176 Docs - fix download links in install instructions)
<<<<<<< HEAD
>>>>>>> f40ce84a61 (GEOMESA-3176 Docs - fix download links in install instructions)
=======
=======
=======

>>>>>>> 4524373ac (GEOMESA-3061 Converters - support bytes in Avro top-level union types (#2762))
<<<<<<< HEAD
>>>>>>> df644ff83d (GEOMESA-3061 Converters - support bytes in Avro top-level union types (#2762))
<<<<<<< HEAD
>>>>>>> 3ae7021103 (GEOMESA-3061 Converters - support bytes in Avro top-level union types (#2762))
=======
=======
=======
>>>>>>> 46c05fed5 (GEOMESA-3176 Docs - fix download links in install instructions)
<<<<<<< HEAD
>>>>>>> bcf78618df (GEOMESA-3176 Docs - fix download links in install instructions)
<<<<<<< HEAD
>>>>>>> e4f52faffa (GEOMESA-3176 Docs - fix download links in install instructions)
=======
=======
=======

>>>>>>> 4fbe39c62 (GEOMESA-3061 Converters - support bytes in Avro top-level union types (#2762))
<<<<<<< HEAD
>>>>>>> 31f6953312 (GEOMESA-3061 Converters - support bytes in Avro top-level union types (#2762))
<<<<<<< HEAD
>>>>>>> 14cf946af4 (GEOMESA-3061 Converters - support bytes in Avro top-level union types (#2762))
=======
=======
=======
.. note::
=======
>>>>>>> 7f7083f095 (GEOMESA-3176 Docs - fix download links in install instructions)

.. parsed-literal::
>>>>>>> bdcaf0ab5e (GEOMESA-3176 Docs - fix download links in install instructions)

    $ export TAG="|release_version|"
    # note: |scala_binary_version| is the Scala build version
    $ export VERSION="|scala_binary_version|-${TAG}"

Then download and extract the binary distribution:

>>>>>>> 81ee66102b (GEOMESA-3061 Converters - support bytes in Avro top-level union types (#2762))
>>>>>>> a1f15598cb (GEOMESA-3061 Converters - support bytes in Avro top-level union types (#2762))
>>>>>>> b1f71c0764 (GEOMESA-3061 Converters - support bytes in Avro top-level union types (#2762))
=======
>>>>>>> 0b168af9c8 (GEOMESA-3176 Docs - fix download links in install instructions)
=======
=======
>>>>>>> 6a2cd10c1c (GEOMESA-3061 Converters - support bytes in Avro top-level union types (#2762))
>>>>>>> 6fc8851879 (GEOMESA-3061 Converters - support bytes in Avro top-level union types (#2762))
>>>>>>> dcbf9c4320 (GEOMESA-3061 Converters - support bytes in Avro top-level union types (#2762))
=======
>>>>>>> 84e5c6b001 (GEOMESA-3176 Docs - fix download links in install instructions)
=======
=======
>>>>>>> 8a6a96234b (GEOMESA-3061 Converters - support bytes in Avro top-level union types (#2762))
>>>>>>> 6514df9383 (GEOMESA-3061 Converters - support bytes in Avro top-level union types (#2762))
>>>>>>> ce19d9c8bd (GEOMESA-3061 Converters - support bytes in Avro top-level union types (#2762))
=======
>>>>>>> dcc9d7f708 (GEOMESA-3176 Docs - fix download links in install instructions)
=======
=======
>>>>>>> 0c734cda2b (GEOMESA-3061 Converters - support bytes in Avro top-level union types (#2762))
>>>>>>> c91f823574 (GEOMESA-3061 Converters - support bytes in Avro top-level union types (#2762))
>>>>>>> 8a2d92d131 (GEOMESA-3061 Converters - support bytes in Avro top-level union types (#2762))
=======
>>>>>>> f7b6b53d97 (GEOMESA-3061 Converters - support bytes in Avro top-level union types (#2762))
=======
=======

>>>>>>> 947a867d1 (GEOMESA-3061 Converters - support bytes in Avro top-level union types (#2762))
<<<<<<< HEAD
>>>>>>> 748532d2db (GEOMESA-3061 Converters - support bytes in Avro top-level union types (#2762))
<<<<<<< HEAD
>>>>>>> bc73cc4d41 (GEOMESA-3061 Converters - support bytes in Avro top-level union types (#2762))
<<<<<<< HEAD
>>>>>>> 7c052f66eb (GEOMESA-3061 Converters - support bytes in Avro top-level union types (#2762))
=======
=======
=======
=======
>>>>>>> 279de44d3 (GEOMESA-3176 Docs - fix download links in install instructions)
>>>>>>> b7c6b904be (GEOMESA-3176 Docs - fix download links in install instructions)
>>>>>>> 813f24c01d (GEOMESA-3176 Docs - fix download links in install instructions)
>>>>>>> 79d78e33bb (GEOMESA-3176 Docs - fix download links in install instructions)
=======
>>>>>>> 411f3fc089 (GEOMESA-3061 Converters - support bytes in Avro top-level union types (#2762))
=======
=======
>>>>>>> b42125fac1 (GEOMESA-3176 Docs - fix download links in install instructions)
>>>>>>> 1a737b13ed (GEOMESA-3176 Docs - fix download links in install instructions)
>>>>>>> 72c7cd55e5 (GEOMESA-3176 Docs - fix download links in install instructions)
=======
>>>>>>> 992ed6b1bf (GEOMESA-3061 Converters - support bytes in Avro top-level union types (#2762))
=======
=======
>>>>>>> 5c3f315bc0 (GEOMESA-3176 Docs - fix download links in install instructions)
>>>>>>> 3e34d2451e (GEOMESA-3176 Docs - fix download links in install instructions)
>>>>>>> d025f79392 (GEOMESA-3176 Docs - fix download links in install instructions)
=======
>>>>>>> 8171686fd2 (GEOMESA-3061 Converters - support bytes in Avro top-level union types (#2762))
=======
>>>>>>> 9d0ea08871 (GEOMESA-3061 Converters - support bytes in Avro top-level union types (#2762))
=======
=======
>>>>>>> c9c24ca3d7 (GEOMESA-3061 Converters - support bytes in Avro top-level union types (#2762))
>>>>>>> b8545eda8f (GEOMESA-3061 Converters - support bytes in Avro top-level union types (#2762))
=======
>>>>>>> 64a722e2a7 (GEOMESA-3176 Docs - fix download links in install instructions)
=======
=======
>>>>>>> b9c0fc77b9 (GEOMESA-3061 Converters - support bytes in Avro top-level union types (#2762))
>>>>>>> 420027bc3f (GEOMESA-3061 Converters - support bytes in Avro top-level union types (#2762))
=======
>>>>>>> 341ef96c9a (GEOMESA-3176 Docs - fix download links in install instructions)
=======
=======
>>>>>>> d69216810e (GEOMESA-3061 Converters - support bytes in Avro top-level union types (#2762))
>>>>>>> fc1024de7e (GEOMESA-3061 Converters - support bytes in Avro top-level union types (#2762))
=======
>>>>>>> 5712753579 (GEOMESA-3176 Docs - fix download links in install instructions)
=======
=======
>>>>>>> 17f16286aa (GEOMESA-3061 Converters - support bytes in Avro top-level union types (#2762))
>>>>>>> 8435590eee (GEOMESA-3061 Converters - support bytes in Avro top-level union types (#2762))
=======
<<<<<<< HEAD
<<<<<<< HEAD
>>>>>>> locatelli-main
=======
>>>>>>> locatelli-main
=======
>>>>>>> locatelli-main
>>>>>>> locationtech-main
=======

>>>>>>> 66dbbce00d (GEOMESA-3061 Converters - support bytes in Avro top-level union types (#2762))
<<<<<<< HEAD
<<<<<<< HEAD
<<<<<<< HEAD
=======
<<<<<<< HEAD
=======
>>>>>>> locatelli-main
=======
>>>>>>> locatelli-main
>>>>>>> fcfc8ed547 (GEOMESA-3061 Converters - support bytes in Avro top-level union types (#2762))
=======
=======

>>>>>>> 49a5a0454f (GEOMESA-3061 Converters - support bytes in Avro top-level union types (#2762))
<<<<<<< HEAD
>>>>>>> a75dd93dd3 (GEOMESA-3061 Converters - support bytes in Avro top-level union types (#2762))
=======
=======
>>>>>>> b4c1ea8881 (GEOMESA-3176 Docs - fix download links in install instructions)
<<<<<<< HEAD
>>>>>>> 91879d2d87 (GEOMESA-3176 Docs - fix download links in install instructions)
=======
=======

>>>>>>> b03141c1bb (GEOMESA-3061 Converters - support bytes in Avro top-level union types (#2762))
<<<<<<< HEAD
>>>>>>> 879d736345 (GEOMESA-3061 Converters - support bytes in Avro top-level union types (#2762))
=======
=======
>>>>>>> fdf0e4fe88 (GEOMESA-3176 Docs - fix download links in install instructions)
<<<<<<< HEAD
>>>>>>> 0ba49a2fd7 (GEOMESA-3176 Docs - fix download links in install instructions)
=======
=======

>>>>>>> 32234db855 (GEOMESA-3061 Converters - support bytes in Avro top-level union types (#2762))
<<<<<<< HEAD
>>>>>>> 12443df272 (GEOMESA-3061 Converters - support bytes in Avro top-level union types (#2762))
=======
=======
>>>>>>> f2943650ff (GEOMESA-3176 Docs - fix download links in install instructions)
<<<<<<< HEAD
>>>>>>> d7ba054c6c (GEOMESA-3176 Docs - fix download links in install instructions)
=======
=======

>>>>>>> 86dd18aa73 (GEOMESA-3061 Converters - support bytes in Avro top-level union types (#2762))
>>>>>>> b488e79fc5 (GEOMESA-3061 Converters - support bytes in Avro top-level union types (#2762))
=======

>>>>>>> 66dbbce00d (GEOMESA-3061 Converters - support bytes in Avro top-level union types (#2762))
<<<<<<< HEAD
<<<<<<< HEAD
>>>>>>> locatelli-main
=======
>>>>>>> locatelli-main
=======
>>>>>>> locatelli-main
=======

>>>>>>> 49a5a0454f (GEOMESA-3061 Converters - support bytes in Avro top-level union types (#2762))
=======
>>>>>>> b4c1ea8881 (GEOMESA-3176 Docs - fix download links in install instructions)
=======

>>>>>>> b03141c1bb (GEOMESA-3061 Converters - support bytes in Avro top-level union types (#2762))
=======
>>>>>>> fdf0e4fe88 (GEOMESA-3176 Docs - fix download links in install instructions)
=======

>>>>>>> 32234db855 (GEOMESA-3061 Converters - support bytes in Avro top-level union types (#2762))
=======
>>>>>>> f2943650ff (GEOMESA-3176 Docs - fix download links in install instructions)
=======

>>>>>>> 86dd18aa73 (GEOMESA-3061 Converters - support bytes in Avro top-level union types (#2762))
.. code-block:: bash

    # download and unpackage the most recent distribution:
    $ wget "https://github.com/locationtech/geomesa/releases/download/geomesa-${TAG}/geomesa-fs_${VERSION}-bin.tar.gz"
    $ tar xvf geomesa-fs_${VERSION}-bin.tar.gz
    $ cd geomesa-fs_${VERSION}
<<<<<<< HEAD
<<<<<<< HEAD
<<<<<<< HEAD
<<<<<<< HEAD
<<<<<<< HEAD
<<<<<<< HEAD
<<<<<<< HEAD
<<<<<<< HEAD
<<<<<<< HEAD
<<<<<<< HEAD
<<<<<<< HEAD
<<<<<<< HEAD
<<<<<<< HEAD
<<<<<<< HEAD
<<<<<<< HEAD
<<<<<<< HEAD
<<<<<<< HEAD
<<<<<<< HEAD
<<<<<<< HEAD
<<<<<<< HEAD
<<<<<<< HEAD
<<<<<<< HEAD
<<<<<<< HEAD
<<<<<<< HEAD
<<<<<<< HEAD
<<<<<<< HEAD
<<<<<<< HEAD
<<<<<<< HEAD
<<<<<<< HEAD
<<<<<<< HEAD
<<<<<<< HEAD
<<<<<<< HEAD
<<<<<<< HEAD
<<<<<<< HEAD
<<<<<<< HEAD
<<<<<<< HEAD
<<<<<<< HEAD
<<<<<<< HEAD
<<<<<<< HEAD
<<<<<<< HEAD
<<<<<<< HEAD
<<<<<<< HEAD
<<<<<<< HEAD
<<<<<<< HEAD
<<<<<<< HEAD
<<<<<<< HEAD
<<<<<<< HEAD
<<<<<<< HEAD
<<<<<<< HEAD
<<<<<<< HEAD
<<<<<<< HEAD
<<<<<<< HEAD
<<<<<<< HEAD
<<<<<<< HEAD
<<<<<<< HEAD
<<<<<<< HEAD
<<<<<<< HEAD
<<<<<<< HEAD
<<<<<<< HEAD
<<<<<<< HEAD
<<<<<<< HEAD
<<<<<<< HEAD
<<<<<<< HEAD
<<<<<<< HEAD
<<<<<<< HEAD
<<<<<<< HEAD
<<<<<<< HEAD
<<<<<<< HEAD
<<<<<<< HEAD
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
=======
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
<<<<<<< HEAD
<<<<<<< HEAD
<<<<<<< HEAD
<<<<<<< HEAD
<<<<<<< HEAD
<<<<<<< HEAD
<<<<<<< HEAD
<<<<<<< HEAD
<<<<<<< HEAD
<<<<<<< HEAD
<<<<<<< HEAD
<<<<<<< HEAD
<<<<<<< HEAD
<<<<<<< HEAD
<<<<<<< HEAD
<<<<<<< HEAD
<<<<<<< HEAD
<<<<<<< HEAD
<<<<<<< HEAD
<<<<<<< HEAD
<<<<<<< HEAD
<<<<<<< HEAD
<<<<<<< HEAD
<<<<<<< HEAD
<<<<<<< HEAD
<<<<<<< HEAD
<<<<<<< HEAD
<<<<<<< HEAD
<<<<<<< HEAD
<<<<<<< HEAD
<<<<<<< HEAD
<<<<<<< HEAD
<<<<<<< HEAD
<<<<<<< HEAD
<<<<<<< HEAD
<<<<<<< HEAD
<<<<<<< HEAD
<<<<<<< HEAD
<<<<<<< HEAD
<<<<<<< HEAD
<<<<<<< HEAD
<<<<<<< HEAD
<<<<<<< HEAD
<<<<<<< HEAD
<<<<<<< HEAD
<<<<<<< HEAD
<<<<<<< HEAD
<<<<<<< HEAD
<<<<<<< HEAD
<<<<<<< HEAD
<<<<<<< HEAD
<<<<<<< HEAD
<<<<<<< HEAD
<<<<<<< HEAD
<<<<<<< HEAD
<<<<<<< HEAD
<<<<<<< HEAD
<<<<<<< HEAD
<<<<<<< HEAD
<<<<<<< HEAD
<<<<<<< HEAD
<<<<<<< HEAD
<<<<<<< HEAD
<<<<<<< HEAD
<<<<<<< HEAD
<<<<<<< HEAD
<<<<<<< HEAD
<<<<<<< HEAD
<<<<<<< HEAD
<<<<<<< HEAD
<<<<<<< HEAD
<<<<<<< HEAD
<<<<<<< HEAD
<<<<<<< HEAD
<<<<<<< HEAD
<<<<<<< HEAD
<<<<<<< HEAD
<<<<<<< HEAD
<<<<<<< HEAD
<<<<<<< HEAD
<<<<<<< HEAD
<<<<<<< HEAD
<<<<<<< HEAD
<<<<<<< HEAD
<<<<<<< HEAD
<<<<<<< HEAD
<<<<<<< HEAD
<<<<<<< HEAD
<<<<<<< HEAD
<<<<<<< HEAD
<<<<<<< HEAD
<<<<<<< HEAD
<<<<<<< HEAD
<<<<<<< HEAD
<<<<<<< HEAD
<<<<<<< HEAD
<<<<<<< HEAD
<<<<<<< HEAD
<<<<<<< HEAD
<<<<<<< HEAD
<<<<<<< HEAD
<<<<<<< HEAD
<<<<<<< HEAD
<<<<<<< HEAD
<<<<<<< HEAD
<<<<<<< HEAD
<<<<<<< HEAD
<<<<<<< HEAD
<<<<<<< HEAD
<<<<<<< HEAD
<<<<<<< HEAD
<<<<<<< HEAD
<<<<<<< HEAD
<<<<<<< HEAD
<<<<<<< HEAD
<<<<<<< HEAD
<<<<<<< HEAD
<<<<<<< HEAD
<<<<<<< HEAD
<<<<<<< HEAD
<<<<<<< HEAD
<<<<<<< HEAD
<<<<<<< HEAD
<<<<<<< HEAD
<<<<<<< HEAD
<<<<<<< HEAD
<<<<<<< HEAD
<<<<<<< HEAD
<<<<<<< HEAD
<<<<<<< HEAD
<<<<<<< HEAD
<<<<<<< HEAD
<<<<<<< HEAD
<<<<<<< HEAD
<<<<<<< HEAD
<<<<<<< HEAD
<<<<<<< HEAD
<<<<<<< HEAD
<<<<<<< HEAD
<<<<<<< HEAD
<<<<<<< HEAD
<<<<<<< HEAD
<<<<<<< HEAD
<<<<<<< HEAD
<<<<<<< HEAD
<<<<<<< HEAD
<<<<<<< HEAD
<<<<<<< HEAD
<<<<<<< HEAD
<<<<<<< HEAD
<<<<<<< HEAD
<<<<<<< HEAD
<<<<<<< HEAD
<<<<<<< HEAD
<<<<<<< HEAD
<<<<<<< HEAD
<<<<<<< HEAD
<<<<<<< HEAD
<<<<<<< HEAD
<<<<<<< HEAD
<<<<<<< HEAD
<<<<<<< HEAD
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
>>>>>>> b03141c1bb (GEOMESA-3061 Converters - support bytes in Avro top-level union types (#2762))
=======
>>>>>>> 0833709340 (GEOMESA-3061 Converters - support bytes in Avro top-level union types (#2762))
=======
>>>>>>> fdf0e4fe88 (GEOMESA-3176 Docs - fix download links in install instructions)
=======
>>>>>>> 32234db855 (GEOMESA-3061 Converters - support bytes in Avro top-level union types (#2762))
=======
>>>>>>> cec40638c2 (GEOMESA-3061 Converters - support bytes in Avro top-level union types (#2762))
=======
>>>>>>> f2943650ff (GEOMESA-3176 Docs - fix download links in install instructions)
=======
=======
>>>>>>> 28e2bfa2d (GEOMESA-3061 Converters - support bytes in Avro top-level union types (#2762))
>>>>>>> 86dd18aa73 (GEOMESA-3061 Converters - support bytes in Avro top-level union types (#2762))
=======
<<<<<<< HEAD
<<<<<<< HEAD
>>>>>>> locatelli-main
=======
>>>>>>> locatelli-main
=======
>>>>>>> locatelli-main
>>>>>>> 90ec70f55 (GEOMESA-3176 Docs - fix download links in install instructions)
>>>>>>> b4c1ea8881 (GEOMESA-3176 Docs - fix download links in install instructions)
=======
>>>>>>> 5f807ff388 (GEOMESA-3061 Converters - support bytes in Avro top-level union types (#2762))
=======
<<<<<<< HEAD
<<<<<<< HEAD
<<<<<<< HEAD
=======
=======
>>>>>>> locatelli-main
=======
>>>>>>> locatelli-main
=======
=======
>>>>>>> 879d736345 (GEOMESA-3061 Converters - support bytes in Avro top-level union types (#2762))
=======
>>>>>>> aa7b9bf205 (GEOMESA-3061 Converters - support bytes in Avro top-level union types (#2762))
=======
>>>>>>> 0ba49a2fd7 (GEOMESA-3176 Docs - fix download links in install instructions)
=======
>>>>>>> 12443df272 (GEOMESA-3061 Converters - support bytes in Avro top-level union types (#2762))
=======
>>>>>>> 51ac295632 (GEOMESA-3061 Converters - support bytes in Avro top-level union types (#2762))
=======
>>>>>>> d7ba054c6c (GEOMESA-3176 Docs - fix download links in install instructions)
=======
>>>>>>> b488e79fc5 (GEOMESA-3061 Converters - support bytes in Avro top-level union types (#2762))
=======
>>>>>>> feadc324d3 (GEOMESA-3061 Converters - support bytes in Avro top-level union types (#2762))
=======
>>>>>>> 79bf541ac8 (Merge branch 'feature/postgis-fixes')
=======
=======
>>>>>>> 90ec70f55 (GEOMESA-3176 Docs - fix download links in install instructions)
>>>>>>> b4c1ea8881 (GEOMESA-3176 Docs - fix download links in install instructions)
>>>>>>> 91879d2d87 (GEOMESA-3176 Docs - fix download links in install instructions)
=======
>>>>>>> 5f807ff388 (GEOMESA-3061 Converters - support bytes in Avro top-level union types (#2762))
=======
>>>>>>> 5bf82177df (GEOMESA-3061 Converters - support bytes in Avro top-level union types (#2762))
<<<<<<< HEAD
<<<<<<< HEAD
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
<<<<<<< HEAD
<<<<<<< HEAD
<<<<<<< HEAD
<<<<<<< HEAD
<<<<<<< HEAD
<<<<<<< HEAD
<<<<<<< HEAD
<<<<<<< HEAD
<<<<<<< HEAD
<<<<<<< HEAD
<<<<<<< HEAD
<<<<<<< HEAD
<<<<<<< HEAD
<<<<<<< HEAD
<<<<<<< HEAD
<<<<<<< HEAD
<<<<<<< HEAD
<<<<<<< HEAD
<<<<<<< HEAD
<<<<<<< HEAD
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
=======
=======
>>>>>>> a75dd93dd3 (GEOMESA-3061 Converters - support bytes in Avro top-level union types (#2762))
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
<<<<<<< HEAD
<<<<<<< HEAD
<<<<<<< HEAD
<<<<<<< HEAD
<<<<<<< HEAD
<<<<<<< HEAD
<<<<<<< HEAD
<<<<<<< HEAD
<<<<<<< HEAD
<<<<<<< HEAD
<<<<<<< HEAD
<<<<<<< HEAD
<<<<<<< HEAD
<<<<<<< HEAD
<<<<<<< HEAD
<<<<<<< HEAD
<<<<<<< HEAD
<<<<<<< HEAD
<<<<<<< HEAD
<<<<<<< HEAD
<<<<<<< HEAD
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
<<<<<<< HEAD
=======
>>>>>>> f561a0faec (GEOMESA-3176 Docs - fix download links in install instructions)
>>>>>>> locatelli-main
=======
>>>>>>> locatelli-main
=======
>>>>>>> a75dd93dd3 (GEOMESA-3061 Converters - support bytes in Avro top-level union types (#2762))
<<<<<<< HEAD
<<<<<<< HEAD
<<<<<<< HEAD
<<<<<<< HEAD
<<<<<<< HEAD
<<<<<<< HEAD
<<<<<<< HEAD
<<<<<<< HEAD
<<<<<<< HEAD
<<<<<<< HEAD
<<<<<<< HEAD
<<<<<<< HEAD
<<<<<<< HEAD
<<<<<<< HEAD
<<<<<<< HEAD
<<<<<<< HEAD
<<<<<<< HEAD
<<<<<<< HEAD
<<<<<<< HEAD
<<<<<<< HEAD
<<<<<<< HEAD
<<<<<<< HEAD
<<<<<<< HEAD
<<<<<<< HEAD
<<<<<<< HEAD
<<<<<<< HEAD
<<<<<<< HEAD
<<<<<<< HEAD
<<<<<<< HEAD
<<<<<<< HEAD
<<<<<<< HEAD
<<<<<<< HEAD
<<<<<<< HEAD
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
>>>>>>> f561a0faec (GEOMESA-3176 Docs - fix download links in install instructions)
<<<<<<< HEAD
>>>>>>> locatelli-main
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
<<<<<<< HEAD
<<<<<<< HEAD
<<<<<<< HEAD
<<<<<<< HEAD
<<<<<<< HEAD
<<<<<<< HEAD
<<<<<<< HEAD
<<<<<<< HEAD
<<<<<<< HEAD
<<<<<<< HEAD
<<<<<<< HEAD
<<<<<<< HEAD
<<<<<<< HEAD
<<<<<<< HEAD
<<<<<<< HEAD
<<<<<<< HEAD
<<<<<<< HEAD
<<<<<<< HEAD
<<<<<<< HEAD
<<<<<<< HEAD
<<<<<<< HEAD
<<<<<<< HEAD
<<<<<<< HEAD
<<<<<<< HEAD
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
=======
>>>>>>> fcfc8ed547 (GEOMESA-3061 Converters - support bytes in Avro top-level union types (#2762))
>>>>>>> locatelli-main
=======
=======
=======
>>>>>>> fcfc8ed547 (GEOMESA-3061 Converters - support bytes in Avro top-level union types (#2762))
>>>>>>> locatelli-main
=======
=======
=======
>>>>>>> fcfc8ed547 (GEOMESA-3061 Converters - support bytes in Avro top-level union types (#2762))
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
<<<<<<< HEAD
<<<<<<< HEAD
<<<<<<< HEAD
<<<<<<< HEAD
<<<<<<< HEAD
<<<<<<< HEAD
<<<<<<< HEAD
<<<<<<< HEAD
<<<<<<< HEAD
<<<<<<< HEAD
<<<<<<< HEAD
<<<<<<< HEAD
<<<<<<< HEAD
<<<<<<< HEAD
<<<<<<< HEAD
<<<<<<< HEAD
<<<<<<< HEAD
<<<<<<< HEAD
<<<<<<< HEAD
<<<<<<< HEAD
<<<<<<< HEAD
<<<<<<< HEAD
<<<<<<< HEAD
<<<<<<< HEAD
<<<<<<< HEAD
<<<<<<< HEAD
<<<<<<< HEAD
<<<<<<< HEAD
<<<<<<< HEAD
<<<<<<< HEAD
<<<<<<< HEAD
<<<<<<< HEAD
<<<<<<< HEAD
<<<<<<< HEAD
<<<<<<< HEAD
<<<<<<< HEAD
<<<<<<< HEAD
<<<<<<< HEAD
<<<<<<< HEAD
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
>>>>>>> locatelli-main
=======
>>>>>>> locatelli-main
=======
>>>>>>> 39c52cab32 (GEOMESA-3061 Converters - support bytes in Avro top-level union types (#2762))
=======
>>>>>>> 341ef96c9a (GEOMESA-3176 Docs - fix download links in install instructions)
=======
>>>>>>> fc1024de7e (GEOMESA-3061 Converters - support bytes in Avro top-level union types (#2762))
=======
>>>>>>> 27c0ee7e6d (GEOMESA-3061 Converters - support bytes in Avro top-level union types (#2762))
=======
>>>>>>> 5712753579 (GEOMESA-3176 Docs - fix download links in install instructions)
=======
>>>>>>> 8435590eee (GEOMESA-3061 Converters - support bytes in Avro top-level union types (#2762))
=======
>>>>>>> 7fa3b8d23f (GEOMESA-3061 Converters - support bytes in Avro top-level union types (#2762))
=======
>>>>>>> cc93e0930d (Merge branch 'feature/postgis-fixes')
<<<<<<< HEAD
<<<<<<< HEAD
>>>>>>> locatelli-main
=======
>>>>>>> locatelli-main
=======
>>>>>>> locatelli-main
=======
>>>>>>> b9c0fc77b9 (GEOMESA-3061 Converters - support bytes in Avro top-level union types (#2762))
=======
>>>>>>> f110463a26 (GEOMESA-3061 Converters - support bytes in Avro top-level union types (#2762))
=======
<<<<<<< HEAD
<<<<<<< HEAD
<<<<<<< HEAD
=======
<<<<<<< HEAD
<<<<<<< HEAD
>>>>>>> locatelli-main
=======
<<<<<<< HEAD
>>>>>>> locatelli-main
=======
>>>>>>> locatelli-main
>>>>>>> aff2787fc2 (GEOMESA-3176 Docs - fix download links in install instructions)
=======
>>>>>>> d69216810e (GEOMESA-3061 Converters - support bytes in Avro top-level union types (#2762))
=======
<<<<<<< HEAD
<<<<<<< HEAD
<<<<<<< HEAD
=======
<<<<<<< HEAD
<<<<<<< HEAD
>>>>>>> locatelli-main
=======
<<<<<<< HEAD
>>>>>>> locatelli-main
=======
>>>>>>> locatelli-main
>>>>>>> 86ec77f9cb (GEOMESA-3061 Converters - support bytes in Avro top-level union types (#2762))
=======
>>>>>>> 0753bfcbe4 (GEOMESA-3176 Docs - fix download links in install instructions)
=======
<<<<<<< HEAD
<<<<<<< HEAD
<<<<<<< HEAD
=======
<<<<<<< HEAD
<<<<<<< HEAD
>>>>>>> locatelli-main
=======
<<<<<<< HEAD
>>>>>>> locatelli-main
=======
>>>>>>> locatelli-main
>>>>>>> 17f16286aa (GEOMESA-3061 Converters - support bytes in Avro top-level union types (#2762))
=======
>>>>>>> 1bcc513539 (GEOMESA-3061 Converters - support bytes in Avro top-level union types (#2762))
=======
<<<<<<< HEAD
<<<<<<< HEAD
>>>>>>> ec6d06b576 (Merge branch 'feature/postgis-fixes')
<<<<<<< HEAD
>>>>>>> locationtech-main
=======
=======
<<<<<<< HEAD
=======
>>>>>>> locatelli-main
<<<<<<< HEAD
>>>>>>> ec6d06b576 (Merge branch 'feature/postgis-fixes')
=======
>>>>>>> locatelli-main
=======
>>>>>>> 1f17117603 (GEOMESA-3061 Converters - support bytes in Avro top-level union types (#2762))
=======
>>>>>>> c22ecd64c3 (GEOMESA-3061 Converters - support bytes in Avro top-level union types (#2762))
=======
>>>>>>> e5cf96e863 (GEOMESA-3176 Docs - fix download links in install instructions)
=======
>>>>>>> 732efe4910 (GEOMESA-3061 Converters - support bytes in Avro top-level union types (#2762))
=======
>>>>>>> 2a887f75bf (GEOMESA-3061 Converters - support bytes in Avro top-level union types (#2762))
=======
>>>>>>> d72089513c (GEOMESA-3176 Docs - fix download links in install instructions)
=======
>>>>>>> f91e29a57f (GEOMESA-3061 Converters - support bytes in Avro top-level union types (#2762))
=======
>>>>>>> b08cb4d818 (GEOMESA-3061 Converters - support bytes in Avro top-level union types (#2762))
=======
>>>>>>> 354b5e5ae5 (Merge branch 'feature/postgis-fixes')
=======
>>>>>>> ac217b392d (GEOMESA-3061 Converters - support bytes in Avro top-level union types (#2762))
=======
>>>>>>> 4fd46f4f99 (GEOMESA-3176 Docs - fix download links in install instructions)
=======
>>>>>>> b8be7d30a1 (GEOMESA-3061 Converters - support bytes in Avro top-level union types (#2762))
=======
>>>>>>> e7d6b701c8 (GEOMESA-3061 Converters - support bytes in Avro top-level union types (#2762))
=======
>>>>>>> 2de4be5460 (GEOMESA-3176 Docs - fix download links in install instructions)
=======
>>>>>>> 789f6eba49 (GEOMESA-3061 Converters - support bytes in Avro top-level union types (#2762))
=======
>>>>>>> 95e52e061e (GEOMESA-3061 Converters - support bytes in Avro top-level union types (#2762))
=======
>>>>>>> 6f1e1da646 (GEOMESA-3176 Docs - fix download links in install instructions)
=======
>>>>>>> 4fc0f66d4f (GEOMESA-3061 Converters - support bytes in Avro top-level union types (#2762))
=======
>>>>>>> 988874c83e (GEOMESA-3061 Converters - support bytes in Avro top-level union types (#2762))
=======
>>>>>>> ef8de676d3 (GEOMESA-3176 Docs - fix download links in install instructions)
=======
>>>>>>> 437d0aab1c (GEOMESA-3061 Converters - support bytes in Avro top-level union types (#2762))
=======
>>>>>>> aea9fbe131 (GEOMESA-3061 Converters - support bytes in Avro top-level union types (#2762))
=======
>>>>>>> d581fa3e8f (Merge branch 'feature/postgis-fixes')
=======
>>>>>>> 5a55bf9756 (GEOMESA-3061 Converters - support bytes in Avro top-level union types (#2762))
=======
>>>>>>> b68ae6197f (GEOMESA-3176 Docs - fix download links in install instructions)
=======
>>>>>>> 23fc8cb805 (GEOMESA-3061 Converters - support bytes in Avro top-level union types (#2762))
=======
>>>>>>> e0c2527549 (GEOMESA-3061 Converters - support bytes in Avro top-level union types (#2762))
=======
>>>>>>> b47097b7bb (GEOMESA-3176 Docs - fix download links in install instructions)
=======
>>>>>>> 99a32a726d (GEOMESA-3061 Converters - support bytes in Avro top-level union types (#2762))
=======
>>>>>>> cb5e2daf2b (GEOMESA-3061 Converters - support bytes in Avro top-level union types (#2762))
=======
>>>>>>> 95f020af8c (GEOMESA-3176 Docs - fix download links in install instructions)
=======
>>>>>>> 02bb344987 (GEOMESA-3061 Converters - support bytes in Avro top-level union types (#2762))
=======
>>>>>>> 00e61f4b70 (GEOMESA-3061 Converters - support bytes in Avro top-level union types (#2762))
=======
>>>>>>> 26c7d06850 (GEOMESA-3176 Docs - fix download links in install instructions)
=======
>>>>>>> a512d6b917 (GEOMESA-3061 Converters - support bytes in Avro top-level union types (#2762))
=======
>>>>>>> 4864cfc581 (GEOMESA-3061 Converters - support bytes in Avro top-level union types (#2762))
=======
>>>>>>> 264c9fa240 (Merge branch 'feature/postgis-fixes')
=======
>>>>>>> c738f63bd9 (GEOMESA-3254 Add Bloop build support)
=======
>>>>>>> 3676d4e56a (GEOMESA-3061 Converters - support bytes in Avro top-level union types (#2762))
=======
>>>>>>> 3f60902092 (GEOMESA-3176 Docs - fix download links in install instructions)
=======
>>>>>>> 8111fd4732 (GEOMESA-3061 Converters - support bytes in Avro top-level union types (#2762))
=======
>>>>>>> 60b4637548 (GEOMESA-3061 Converters - support bytes in Avro top-level union types (#2762))
=======
>>>>>>> 5fa9f37061 (GEOMESA-3176 Docs - fix download links in install instructions)
=======
>>>>>>> b2177e9015 (GEOMESA-3061 Converters - support bytes in Avro top-level union types (#2762))
=======
>>>>>>> 009a284072 (GEOMESA-3061 Converters - support bytes in Avro top-level union types (#2762))
=======
>>>>>>> 955de6bfcc (GEOMESA-3176 Docs - fix download links in install instructions)
=======
>>>>>>> 897de97047 (GEOMESA-3061 Converters - support bytes in Avro top-level union types (#2762))
=======
>>>>>>> 7b8c8dcc3d (GEOMESA-3061 Converters - support bytes in Avro top-level union types (#2762))
=======
>>>>>>> 057f644239 (GEOMESA-3176 Docs - fix download links in install instructions)
=======
>>>>>>> d329320e6a (GEOMESA-3061 Converters - support bytes in Avro top-level union types (#2762))
=======
>>>>>>> c029a43a6c (GEOMESA-3061 Converters - support bytes in Avro top-level union types (#2762))
=======
>>>>>>> 217b7d1cb9 (Merge branch 'feature/postgis-fixes')
=======
>>>>>>> a5b0374ee2 (GEOMESA-3061 Converters - support bytes in Avro top-level union types (#2762))
=======
>>>>>>> 682ce8edbb (GEOMESA-3176 Docs - fix download links in install instructions)
=======
>>>>>>> d196efd6f7 (GEOMESA-3061 Converters - support bytes in Avro top-level union types (#2762))
=======
>>>>>>> 4f51687745 (GEOMESA-3061 Converters - support bytes in Avro top-level union types (#2762))
=======
>>>>>>> a2ed7a128d (GEOMESA-3176 Docs - fix download links in install instructions)
=======
>>>>>>> 5a365695e1 (GEOMESA-3061 Converters - support bytes in Avro top-level union types (#2762))
=======
>>>>>>> 9a2d40c613 (GEOMESA-3061 Converters - support bytes in Avro top-level union types (#2762))
=======
>>>>>>> f40ce84a61 (GEOMESA-3176 Docs - fix download links in install instructions)
=======
>>>>>>> 3ae7021103 (GEOMESA-3061 Converters - support bytes in Avro top-level union types (#2762))
=======
>>>>>>> 73770612e0 (GEOMESA-3061 Converters - support bytes in Avro top-level union types (#2762))
=======
>>>>>>> e4f52faffa (GEOMESA-3176 Docs - fix download links in install instructions)
=======
>>>>>>> 14cf946af4 (GEOMESA-3061 Converters - support bytes in Avro top-level union types (#2762))
=======
>>>>>>> 6c83981af3 (GEOMESA-3061 Converters - support bytes in Avro top-level union types (#2762))
=======
>>>>>>> b6e56a9e80 (Merge branch 'feature/postgis-fixes')
=======
>>>>>>> b1f71c0764 (GEOMESA-3061 Converters - support bytes in Avro top-level union types (#2762))
=======
>>>>>>> 7f7083f095 (GEOMESA-3176 Docs - fix download links in install instructions)
=======
>>>>>>> a38834fade (GEOMESA-3061 Converters - support bytes in Avro top-level union types (#2762))
=======
>>>>>>> cc89a73032 (GEOMESA-3061 Converters - support bytes in Avro top-level union types (#2762))
=======
>>>>>>> 0b168af9c8 (GEOMESA-3176 Docs - fix download links in install instructions)
=======
>>>>>>> dcbf9c4320 (GEOMESA-3061 Converters - support bytes in Avro top-level union types (#2762))
=======
>>>>>>> 36b890ce98 (GEOMESA-3061 Converters - support bytes in Avro top-level union types (#2762))
=======
>>>>>>> 84e5c6b001 (GEOMESA-3176 Docs - fix download links in install instructions)
=======
>>>>>>> ce19d9c8bd (GEOMESA-3061 Converters - support bytes in Avro top-level union types (#2762))
=======
>>>>>>> 98c12ce706 (GEOMESA-3061 Converters - support bytes in Avro top-level union types (#2762))
=======
>>>>>>> dcc9d7f708 (GEOMESA-3176 Docs - fix download links in install instructions)
=======
>>>>>>> 8a2d92d131 (GEOMESA-3061 Converters - support bytes in Avro top-level union types (#2762))
=======
>>>>>>> 72962fe615 (GEOMESA-3061 Converters - support bytes in Avro top-level union types (#2762))
=======
>>>>>>> 0a5b74c946 (Merge branch 'feature/postgis-fixes')
=======
>>>>>>> 13656f5052 (GEOMESA-3254 Add Bloop build support)
=======
>>>>>>> f7b6b53d97 (GEOMESA-3061 Converters - support bytes in Avro top-level union types (#2762))
=======
>>>>>>> c04d2a7e80 (GEOMESA-3176 Docs - fix download links in install instructions)
=======
>>>>>>> 7c052f66eb (GEOMESA-3061 Converters - support bytes in Avro top-level union types (#2762))
=======
>>>>>>> ecfd546311 (GEOMESA-3061 Converters - support bytes in Avro top-level union types (#2762))
=======
>>>>>>> 79d78e33bb (GEOMESA-3176 Docs - fix download links in install instructions)
=======
>>>>>>> 411f3fc089 (GEOMESA-3061 Converters - support bytes in Avro top-level union types (#2762))
=======
>>>>>>> db389b4b99 (GEOMESA-3061 Converters - support bytes in Avro top-level union types (#2762))
=======
>>>>>>> 72c7cd55e5 (GEOMESA-3176 Docs - fix download links in install instructions)
=======
>>>>>>> 992ed6b1bf (GEOMESA-3061 Converters - support bytes in Avro top-level union types (#2762))
=======
>>>>>>> acc6bdccf3 (GEOMESA-3061 Converters - support bytes in Avro top-level union types (#2762))
=======
>>>>>>> d025f79392 (GEOMESA-3176 Docs - fix download links in install instructions)
=======
>>>>>>> 8171686fd2 (GEOMESA-3061 Converters - support bytes in Avro top-level union types (#2762))
=======
>>>>>>> 7925093789 (GEOMESA-3061 Converters - support bytes in Avro top-level union types (#2762))
=======
>>>>>>> a30a0c1a2a (Merge branch 'feature/postgis-fixes')
=======
>>>>>>> 9d0ea08871 (GEOMESA-3061 Converters - support bytes in Avro top-level union types (#2762))
=======
>>>>>>> fbb5e06c6a (GEOMESA-3176 Docs - fix download links in install instructions)
=======
>>>>>>> b8545eda8f (GEOMESA-3061 Converters - support bytes in Avro top-level union types (#2762))
=======
>>>>>>> e6703260b7 (GEOMESA-3061 Converters - support bytes in Avro top-level union types (#2762))
=======
>>>>>>> 64a722e2a7 (GEOMESA-3176 Docs - fix download links in install instructions)
=======
=======
>>>>>>> b9c0fc77b9 (GEOMESA-3061 Converters - support bytes in Avro top-level union types (#2762))
>>>>>>> 420027bc3f (GEOMESA-3061 Converters - support bytes in Avro top-level union types (#2762))
=======
=======
>>>>>>> 39c52cab32 (GEOMESA-3061 Converters - support bytes in Avro top-level union types (#2762))
=======
>>>>>>> aff2787fc2 (GEOMESA-3176 Docs - fix download links in install instructions)
=======
>>>>>>> 341ef96c9a (GEOMESA-3176 Docs - fix download links in install instructions)
=======
>>>>>>> fc1024de7e (GEOMESA-3061 Converters - support bytes in Avro top-level union types (#2762))
=======
>>>>>>> 86ec77f9cb (GEOMESA-3061 Converters - support bytes in Avro top-level union types (#2762))
=======
>>>>>>> 27c0ee7e6d (GEOMESA-3061 Converters - support bytes in Avro top-level union types (#2762))
=======
>>>>>>> 5712753579 (GEOMESA-3176 Docs - fix download links in install instructions)
=======
>>>>>>> 17f16286aa (GEOMESA-3061 Converters - support bytes in Avro top-level union types (#2762))
=======
>>>>>>> 8435590eee (GEOMESA-3061 Converters - support bytes in Avro top-level union types (#2762))
=======
>>>>>>> 7fa3b8d23f (GEOMESA-3061 Converters - support bytes in Avro top-level union types (#2762))
=======
>>>>>>> ec6d06b576 (Merge branch 'feature/postgis-fixes')
=======
>>>>>>> cc93e0930d (Merge branch 'feature/postgis-fixes')
<<<<<<< HEAD
<<<<<<< HEAD
>>>>>>> locatelli-main
=======
>>>>>>> locatelli-main
=======
>>>>>>> locatelli-main
=======
>>>>>>> 338d952d43 (GEOMESA-3061 Converters - support bytes in Avro top-level union types (#2762))
=======
<<<<<<< HEAD
<<<<<<< HEAD
<<<<<<< HEAD
<<<<<<< HEAD
=======
<<<<<<< HEAD
<<<<<<< HEAD
>>>>>>> locationtech-main
=======
<<<<<<< HEAD
=======
>>>>>>> locatelli-main
<<<<<<< HEAD
=======
>>>>>>> locatelli-main
<<<<<<< HEAD
<<<<<<< HEAD
<<<<<<< HEAD
=======
>>>>>>> 420027bc3f (GEOMESA-3061 Converters - support bytes in Avro top-level union types (#2762))
=======
>>>>>>> 39c52cab32 (GEOMESA-3061 Converters - support bytes in Avro top-level union types (#2762))
<<<<<<< HEAD
<<<<<<< HEAD
>>>>>>> locatelli-main
=======
>>>>>>> locatelli-main
=======
>>>>>>> locatelli-main
>>>>>>> 4c361f07da (GEOMESA-3061 Converters - support bytes in Avro top-level union types (#2762))
=======
>>>>>>> 64e2e43818 (GEOMESA-3176 Docs - fix download links in install instructions)
=======
<<<<<<< HEAD
<<<<<<< HEAD
<<<<<<< HEAD
<<<<<<< HEAD
=======
<<<<<<< HEAD
<<<<<<< HEAD
>>>>>>> locationtech-main
=======
<<<<<<< HEAD
=======
>>>>>>> locatelli-main
<<<<<<< HEAD
=======
>>>>>>> locatelli-main
<<<<<<< HEAD
<<<<<<< HEAD
<<<<<<< HEAD
=======
>>>>>>> 341ef96c9a (GEOMESA-3176 Docs - fix download links in install instructions)
=======
>>>>>>> fc1024de7e (GEOMESA-3061 Converters - support bytes in Avro top-level union types (#2762))
<<<<<<< HEAD
<<<<<<< HEAD
>>>>>>> locatelli-main
=======
>>>>>>> locatelli-main
=======
>>>>>>> locatelli-main
>>>>>>> 9627a2de6a (GEOMESA-3061 Converters - support bytes in Avro top-level union types (#2762))
=======
>>>>>>> f302a54949 (GEOMESA-3061 Converters - support bytes in Avro top-level union types (#2762))
=======
<<<<<<< HEAD
<<<<<<< HEAD
<<<<<<< HEAD
<<<<<<< HEAD
>>>>>>> b046434188 (GEOMESA-3176 Docs - fix download links in install instructions)
=======
=======
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
<<<<<<< HEAD
<<<<<<< HEAD
=======
>>>>>>> 27c0ee7e6d (GEOMESA-3061 Converters - support bytes in Avro top-level union types (#2762))
=======
>>>>>>> 5712753579 (GEOMESA-3176 Docs - fix download links in install instructions)
<<<<<<< HEAD
<<<<<<< HEAD
>>>>>>> locatelli-main
=======
>>>>>>> locatelli-main
=======
>>>>>>> locatelli-main
>>>>>>> b046434188 (GEOMESA-3176 Docs - fix download links in install instructions)
=======
=======
<<<<<<< HEAD
<<<<<<< HEAD
<<<<<<< HEAD
<<<<<<< HEAD
<<<<<<< HEAD
>>>>>>> locationtech-main
=======
<<<<<<< HEAD
=======
>>>>>>> locatelli-main
<<<<<<< HEAD
=======
>>>>>>> locatelli-main
<<<<<<< HEAD
<<<<<<< HEAD
=======
>>>>>>> 8435590eee (GEOMESA-3061 Converters - support bytes in Avro top-level union types (#2762))
=======
>>>>>>> 7fa3b8d23f (GEOMESA-3061 Converters - support bytes in Avro top-level union types (#2762))
<<<<<<< HEAD
<<<<<<< HEAD
>>>>>>> locatelli-main
=======
>>>>>>> locatelli-main
=======
>>>>>>> locatelli-main
>>>>>>> a788dfac03 (GEOMESA-3061 Converters - support bytes in Avro top-level union types (#2762))
=======
>>>>>>> da00c7bd68 (Merge branch 'feature/postgis-fixes')
=======
<<<<<<< HEAD
<<<<<<< HEAD
<<<<<<< HEAD
<<<<<<< HEAD
>>>>>>> 28e2bfa2d (GEOMESA-3061 Converters - support bytes in Avro top-level union types (#2762))
>>>>>>> 76908c410a (GEOMESA-3061 Converters - support bytes in Avro top-level union types (#2762))
=======
=======
=======
>>>>>>> locatelli-main
=======
>>>>>>> locatelli-main
=======
>>>>>>> locatelli-main
=======
>>>>>>> a788dfac03 (GEOMESA-3061 Converters - support bytes in Avro top-level union types (#2762))
=======
<<<<<<< HEAD
<<<<<<< HEAD
<<<<<<< HEAD
<<<<<<< HEAD
=======
<<<<<<< HEAD
=======
>>>>>>> locatelli-main
<<<<<<< HEAD
<<<<<<< HEAD
=======
>>>>>>> cc93e0930d (Merge branch 'feature/postgis-fixes')
<<<<<<< HEAD
>>>>>>> locatelli-main
=======
>>>>>>> locatelli-main
=======
<<<<<<< HEAD
=======
>>>>>>> cc93e0930d (Merge branch 'feature/postgis-fixes')
>>>>>>> locatelli-main
>>>>>>> 1bcc513539 (GEOMESA-3061 Converters - support bytes in Avro top-level union types (#2762))
=======
>>>>>>> da00c7bd68 (Merge branch 'feature/postgis-fixes')
=======
>>>>>>> ec6d06b576 (Merge branch 'feature/postgis-fixes')
<<<<<<< HEAD
=======
<<<<<<< HEAD
<<<<<<< HEAD
<<<<<<< HEAD
=======
=======
>>>>>>> locatelli-main
=======
>>>>>>> locatelli-main
>>>>>>> da00c7bd68 (Merge branch 'feature/postgis-fixes')
=======
>>>>>>> 354b5e5ae5 (Merge branch 'feature/postgis-fixes')
=======
>>>>>>> 1bcc513539 (GEOMESA-3061 Converters - support bytes in Avro top-level union types (#2762))
>>>>>>> 7fa3b8d23f (GEOMESA-3061 Converters - support bytes in Avro top-level union types (#2762))
=======
>>>>>>> cc93e0930d (Merge branch 'feature/postgis-fixes')
<<<<<<< HEAD
<<<<<<< HEAD
>>>>>>> locatelli-main
=======
>>>>>>> locatelli-main
=======
>>>>>>> locatelli-main
>>>>>>> 28e2bfa2d (GEOMESA-3061 Converters - support bytes in Avro top-level union types (#2762))
>>>>>>> 76908c410a (GEOMESA-3061 Converters - support bytes in Avro top-level union types (#2762))
=======
=======
=======
=======
>>>>>>> 4492950388 (GEOMESA-3176 Docs - fix download links in install instructions)
<<<<<<< HEAD
<<<<<<< HEAD
=======
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
>>>>>>> b9c0fc77b9 (GEOMESA-3061 Converters - support bytes in Avro top-level union types (#2762))
=======
>>>>>>> 4c361f07da (GEOMESA-3061 Converters - support bytes in Avro top-level union types (#2762))
=======
>>>>>>> f110463a26 (GEOMESA-3061 Converters - support bytes in Avro top-level union types (#2762))
<<<<<<< HEAD
<<<<<<< HEAD
=======
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
>>>>>>> aff2787fc2 (GEOMESA-3176 Docs - fix download links in install instructions)
=======
>>>>>>> 9627a2de6a (GEOMESA-3061 Converters - support bytes in Avro top-level union types (#2762))
=======
>>>>>>> d69216810e (GEOMESA-3061 Converters - support bytes in Avro top-level union types (#2762))
<<<<<<< HEAD
<<<<<<< HEAD
=======
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
>>>>>>> 86ec77f9cb (GEOMESA-3061 Converters - support bytes in Avro top-level union types (#2762))
=======
>>>>>>> b046434188 (GEOMESA-3176 Docs - fix download links in install instructions)
=======
>>>>>>> 0753bfcbe4 (GEOMESA-3176 Docs - fix download links in install instructions)
<<<<<<< HEAD
<<<<<<< HEAD
=======
=======
<<<<<<< HEAD
<<<<<<< HEAD
=======
>>>>>>> locatelli-main
<<<<<<< HEAD
=======
=======
=======
>>>>>>> locatelli-main
>>>>>>> a788dfac03 (GEOMESA-3061 Converters - support bytes in Avro top-level union types (#2762))
=======
>>>>>>> b08cb4d818 (GEOMESA-3061 Converters - support bytes in Avro top-level union types (#2762))
=======
=======
>>>>>>> 8435590eee (GEOMESA-3061 Converters - support bytes in Avro top-level union types (#2762))
<<<<<<< HEAD
<<<<<<< HEAD
>>>>>>> locatelli-main
=======
>>>>>>> locatelli-main
=======
>>>>>>> locatelli-main
>>>>>>> 28e2bfa2d (GEOMESA-3061 Converters - support bytes in Avro top-level union types (#2762))
>>>>>>> 76908c410a (GEOMESA-3061 Converters - support bytes in Avro top-level union types (#2762))
=======
>>>>>>> 17f16286aa (GEOMESA-3061 Converters - support bytes in Avro top-level union types (#2762))
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
=======
=======
>>>>>>> 13325d17c4 (GEOMESA-3176 Docs - fix download links in install instructions)
=======
>>>>>>> 1f17117603 (GEOMESA-3061 Converters - support bytes in Avro top-level union types (#2762))
=======
>>>>>>> 4c361f07da (GEOMESA-3061 Converters - support bytes in Avro top-level union types (#2762))
=======
>>>>>>> c22ecd64c3 (GEOMESA-3061 Converters - support bytes in Avro top-level union types (#2762))
=======
>>>>>>> e5cf96e863 (GEOMESA-3176 Docs - fix download links in install instructions)
=======
>>>>>>> 9627a2de6a (GEOMESA-3061 Converters - support bytes in Avro top-level union types (#2762))
=======
>>>>>>> 732efe4910 (GEOMESA-3061 Converters - support bytes in Avro top-level union types (#2762))
=======
>>>>>>> 2a887f75bf (GEOMESA-3061 Converters - support bytes in Avro top-level union types (#2762))
=======
>>>>>>> b046434188 (GEOMESA-3176 Docs - fix download links in install instructions)
=======
>>>>>>> d72089513c (GEOMESA-3176 Docs - fix download links in install instructions)
=======
>>>>>>> 28e2bfa2d (GEOMESA-3061 Converters - support bytes in Avro top-level union types (#2762))
>>>>>>> 76908c410a (GEOMESA-3061 Converters - support bytes in Avro top-level union types (#2762))
=======
>>>>>>> f91e29a57f (GEOMESA-3061 Converters - support bytes in Avro top-level union types (#2762))
=======
>>>>>>> 64a722e2a7 (GEOMESA-3176 Docs - fix download links in install instructions)
=======
=======
>>>>>>> b9c0fc77b9 (GEOMESA-3061 Converters - support bytes in Avro top-level union types (#2762))
>>>>>>> 420027bc3f (GEOMESA-3061 Converters - support bytes in Avro top-level union types (#2762))
=======
>>>>>>> 39c52cab32 (GEOMESA-3061 Converters - support bytes in Avro top-level union types (#2762))
=======
=======
>>>>>>> aff2787fc2 (GEOMESA-3176 Docs - fix download links in install instructions)
>>>>>>> 341ef96c9a (GEOMESA-3176 Docs - fix download links in install instructions)
=======
>>>>>>> fc1024de7e (GEOMESA-3061 Converters - support bytes in Avro top-level union types (#2762))
=======
=======
>>>>>>> 86ec77f9cb (GEOMESA-3061 Converters - support bytes in Avro top-level union types (#2762))
>>>>>>> 27c0ee7e6d (GEOMESA-3061 Converters - support bytes in Avro top-level union types (#2762))
=======
>>>>>>> 5712753579 (GEOMESA-3176 Docs - fix download links in install instructions)
=======
>>>>>>> 8435590eee (GEOMESA-3061 Converters - support bytes in Avro top-level union types (#2762))
<<<<<<< HEAD
<<<<<<< HEAD
>>>>>>> locatelli-main
=======
>>>>>>> locatelli-main
=======
>>>>>>> locatelli-main
>>>>>>> 90ec70f55 (GEOMESA-3176 Docs - fix download links in install instructions)
>>>>>>> 8b8075f529 (GEOMESA-3176 Docs - fix download links in install instructions)
=======
>>>>>>> c3c5dd0ebb (GEOMESA-3061 Converters - support bytes in Avro top-level union types (#2762))
=======
<<<<<<< HEAD
<<<<<<< HEAD
<<<<<<< HEAD
<<<<<<< HEAD
=======
>>>>>>> 92674ff9d4 (GEOMESA-3061 Converters - support bytes in Avro top-level union types (#2762))
=======
=======
=======
>>>>>>> locatelli-main
=======
>>>>>>> locatelli-main
>>>>>>> 92674ff9d4 (GEOMESA-3061 Converters - support bytes in Avro top-level union types (#2762))
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
>>>>>>> bc622ff59f (GEOMESA-3176 Docs - fix download links in install instructions)
=======
>>>>>>> 7ec7e43c91 (GEOMESA-3061 Converters - support bytes in Avro top-level union types (#2762))
=======
<<<<<<< HEAD
<<<<<<< HEAD
<<<<<<< HEAD
=======
<<<<<<< HEAD
<<<<<<< HEAD
>>>>>>> locatelli-main
=======
<<<<<<< HEAD
>>>>>>> locatelli-main
=======
>>>>>>> locatelli-main
>>>>>>> 9a4dff9e4f (GEOMESA-3061 Converters - support bytes in Avro top-level union types (#2762))
=======
>>>>>>> 1cc4dadf2e (GEOMESA-3176 Docs - fix download links in install instructions)
=======
<<<<<<< HEAD
<<<<<<< HEAD
<<<<<<< HEAD
=======
<<<<<<< HEAD
<<<<<<< HEAD
>>>>>>> locatelli-main
=======
<<<<<<< HEAD
>>>>>>> locatelli-main
=======
>>>>>>> locatelli-main
>>>>>>> 2586fa6a40 (GEOMESA-3061 Converters - support bytes in Avro top-level union types (#2762))
=======
>>>>>>> 0fc6650ecf (GEOMESA-3061 Converters - support bytes in Avro top-level union types (#2762))
=======
<<<<<<< HEAD
<<<<<<< HEAD
<<<<<<< HEAD
=======
<<<<<<< HEAD
<<<<<<< HEAD
>>>>>>> locatelli-main
=======
<<<<<<< HEAD
>>>>>>> locatelli-main
=======
>>>>>>> locatelli-main
>>>>>>> 67de3c3202 (Merge branch 'feature/postgis-fixes')
=======
>>>>>>> 1bb69524c2 (GEOMESA-3061 Converters - support bytes in Avro top-level union types (#2762))
=======
<<<<<<< HEAD
<<<<<<< HEAD
<<<<<<< HEAD
=======
<<<<<<< HEAD
<<<<<<< HEAD
>>>>>>> locatelli-main
=======
<<<<<<< HEAD
>>>>>>> locatelli-main
=======
>>>>>>> locatelli-main
>>>>>>> e007dde981 (GEOMESA-3176 Docs - fix download links in install instructions)
=======
>>>>>>> 66c2e4df7e (GEOMESA-3061 Converters - support bytes in Avro top-level union types (#2762))
=======
<<<<<<< HEAD
<<<<<<< HEAD
<<<<<<< HEAD
=======
<<<<<<< HEAD
<<<<<<< HEAD
>>>>>>> locatelli-main
=======
<<<<<<< HEAD
>>>>>>> locatelli-main
=======
>>>>>>> locatelli-main
>>>>>>> 8c9ca1211a (GEOMESA-3061 Converters - support bytes in Avro top-level union types (#2762))
=======
>>>>>>> 760781f8dd (GEOMESA-3176 Docs - fix download links in install instructions)
=======
<<<<<<< HEAD
<<<<<<< HEAD
<<<<<<< HEAD
=======
<<<<<<< HEAD
<<<<<<< HEAD
>>>>>>> locatelli-main
=======
<<<<<<< HEAD
>>>>>>> locatelli-main
=======
>>>>>>> locatelli-main
>>>>>>> f7f4f4a836 (GEOMESA-3061 Converters - support bytes in Avro top-level union types (#2762))
=======
>>>>>>> a22efb4d66 (GEOMESA-3061 Converters - support bytes in Avro top-level union types (#2762))
=======
<<<<<<< HEAD
<<<<<<< HEAD
<<<<<<< HEAD
=======
<<<<<<< HEAD
<<<<<<< HEAD
>>>>>>> locatelli-main
=======
<<<<<<< HEAD
>>>>>>> locatelli-main
=======
>>>>>>> locatelli-main
>>>>>>> a0befba4ce (GEOMESA-3176 Docs - fix download links in install instructions)
=======
>>>>>>> df644ff83d (GEOMESA-3061 Converters - support bytes in Avro top-level union types (#2762))
=======
<<<<<<< HEAD
<<<<<<< HEAD
<<<<<<< HEAD
=======
<<<<<<< HEAD
<<<<<<< HEAD
>>>>>>> locatelli-main
=======
<<<<<<< HEAD
>>>>>>> locatelli-main
=======
>>>>>>> locatelli-main
>>>>>>> 1cad375176 (GEOMESA-3061 Converters - support bytes in Avro top-level union types (#2762))
=======
>>>>>>> bcf78618df (GEOMESA-3176 Docs - fix download links in install instructions)
=======
<<<<<<< HEAD
<<<<<<< HEAD
<<<<<<< HEAD
=======
<<<<<<< HEAD
<<<<<<< HEAD
>>>>>>> locatelli-main
=======
<<<<<<< HEAD
>>>>>>> locatelli-main
=======
>>>>>>> locatelli-main
>>>>>>> 31f6953312 (GEOMESA-3061 Converters - support bytes in Avro top-level union types (#2762))
=======
>>>>>>> 1e39c0c27d (GEOMESA-3061 Converters - support bytes in Avro top-level union types (#2762))
=======
<<<<<<< HEAD
<<<<<<< HEAD
<<<<<<< HEAD
=======
<<<<<<< HEAD
<<<<<<< HEAD
>>>>>>> locatelli-main
=======
<<<<<<< HEAD
>>>>>>> locatelli-main
=======
>>>>>>> locatelli-main
>>>>>>> 638b68d081 (Merge branch 'feature/postgis-fixes')
=======
>>>>>>> a1f15598cb (GEOMESA-3061 Converters - support bytes in Avro top-level union types (#2762))
=======
<<<<<<< HEAD
<<<<<<< HEAD
<<<<<<< HEAD
=======
<<<<<<< HEAD
<<<<<<< HEAD
>>>>>>> locatelli-main
=======
<<<<<<< HEAD
>>>>>>> locatelli-main
=======
>>>>>>> locatelli-main
>>>>>>> 7b2b25cc3c (GEOMESA-3176 Docs - fix download links in install instructions)
=======
>>>>>>> 1d03325c29 (GEOMESA-3061 Converters - support bytes in Avro top-level union types (#2762))
=======
<<<<<<< HEAD
<<<<<<< HEAD
<<<<<<< HEAD
=======
<<<<<<< HEAD
<<<<<<< HEAD
>>>>>>> locatelli-main
=======
<<<<<<< HEAD
>>>>>>> locatelli-main
=======
>>>>>>> locatelli-main
>>>>>>> 963feec660 (GEOMESA-3061 Converters - support bytes in Avro top-level union types (#2762))
=======
>>>>>>> ecd45f2c3e (GEOMESA-3176 Docs - fix download links in install instructions)
=======
<<<<<<< HEAD
<<<<<<< HEAD
<<<<<<< HEAD
=======
<<<<<<< HEAD
<<<<<<< HEAD
>>>>>>> locatelli-main
=======
<<<<<<< HEAD
>>>>>>> locatelli-main
=======
>>>>>>> locatelli-main
>>>>>>> 6fc8851879 (GEOMESA-3061 Converters - support bytes in Avro top-level union types (#2762))
=======
>>>>>>> 84ac051f28 (GEOMESA-3061 Converters - support bytes in Avro top-level union types (#2762))
=======
<<<<<<< HEAD
<<<<<<< HEAD
<<<<<<< HEAD
=======
<<<<<<< HEAD
<<<<<<< HEAD
>>>>>>> locatelli-main
=======
<<<<<<< HEAD
>>>>>>> locatelli-main
=======
>>>>>>> locatelli-main
>>>>>>> 3995e6a61c (GEOMESA-3176 Docs - fix download links in install instructions)
=======
>>>>>>> 6514df9383 (GEOMESA-3061 Converters - support bytes in Avro top-level union types (#2762))
=======
<<<<<<< HEAD
<<<<<<< HEAD
<<<<<<< HEAD
=======
<<<<<<< HEAD
<<<<<<< HEAD
>>>>>>> locatelli-main
=======
<<<<<<< HEAD
>>>>>>> locatelli-main
=======
>>>>>>> locatelli-main
>>>>>>> fe3de10f11 (GEOMESA-3061 Converters - support bytes in Avro top-level union types (#2762))
=======
>>>>>>> cabde54511 (GEOMESA-3176 Docs - fix download links in install instructions)
=======
<<<<<<< HEAD
<<<<<<< HEAD
<<<<<<< HEAD
=======
<<<<<<< HEAD
<<<<<<< HEAD
>>>>>>> locatelli-main
=======
<<<<<<< HEAD
>>>>>>> locatelli-main
=======
>>>>>>> locatelli-main
>>>>>>> c91f823574 (GEOMESA-3061 Converters - support bytes in Avro top-level union types (#2762))
=======
>>>>>>> d0785cf307 (GEOMESA-3061 Converters - support bytes in Avro top-level union types (#2762))
=======
<<<<<<< HEAD
<<<<<<< HEAD
<<<<<<< HEAD
=======
<<<<<<< HEAD
<<<<<<< HEAD
>>>>>>> locatelli-main
=======
<<<<<<< HEAD
>>>>>>> locatelli-main
=======
>>>>>>> locatelli-main
>>>>>>> 71adb695c5 (Merge branch 'feature/postgis-fixes')
=======
>>>>>>> 5a4c24e020 (GEOMESA-3254 Add Bloop build support)
=======
<<<<<<< HEAD
<<<<<<< HEAD
<<<<<<< HEAD
=======
<<<<<<< HEAD
<<<<<<< HEAD
>>>>>>> locatelli-main
=======
<<<<<<< HEAD
>>>>>>> locatelli-main
=======
>>>>>>> locatelli-main
>>>>>>> a52e4429be (GEOMESA-3061 Converters - support bytes in Avro top-level union types (#2762))
=======
>>>>>>> 8dec77199d (GEOMESA-3176 Docs - fix download links in install instructions)
=======
<<<<<<< HEAD
<<<<<<< HEAD
<<<<<<< HEAD
=======
<<<<<<< HEAD
<<<<<<< HEAD
>>>>>>> locatelli-main
=======
<<<<<<< HEAD
>>>>>>> locatelli-main
=======
>>>>>>> locatelli-main
>>>>>>> bc73cc4d41 (GEOMESA-3061 Converters - support bytes in Avro top-level union types (#2762))
=======
>>>>>>> 5c6b9f1f8b (GEOMESA-3061 Converters - support bytes in Avro top-level union types (#2762))
=======
<<<<<<< HEAD
<<<<<<< HEAD
<<<<<<< HEAD
=======
<<<<<<< HEAD
<<<<<<< HEAD
>>>>>>> locatelli-main
=======
<<<<<<< HEAD
>>>>>>> locatelli-main
=======
>>>>>>> locatelli-main
>>>>>>> 813f24c01d (GEOMESA-3176 Docs - fix download links in install instructions)
=======
>>>>>>> 98eacc8492 (GEOMESA-3061 Converters - support bytes in Avro top-level union types (#2762))
=======
<<<<<<< HEAD
<<<<<<< HEAD
<<<<<<< HEAD
=======
<<<<<<< HEAD
<<<<<<< HEAD
>>>>>>> locatelli-main
=======
<<<<<<< HEAD
>>>>>>> locatelli-main
=======
>>>>>>> locatelli-main
>>>>>>> 9d44ff473d (GEOMESA-3061 Converters - support bytes in Avro top-level union types (#2762))
=======
>>>>>>> 1a737b13ed (GEOMESA-3176 Docs - fix download links in install instructions)
=======
<<<<<<< HEAD
<<<<<<< HEAD
<<<<<<< HEAD
=======
<<<<<<< HEAD
<<<<<<< HEAD
>>>>>>> locatelli-main
=======
<<<<<<< HEAD
>>>>>>> locatelli-main
=======
>>>>>>> locatelli-main
>>>>>>> 664350d86f (GEOMESA-3061 Converters - support bytes in Avro top-level union types (#2762))
=======
>>>>>>> a35efac12e (GEOMESA-3061 Converters - support bytes in Avro top-level union types (#2762))
=======
<<<<<<< HEAD
<<<<<<< HEAD
<<<<<<< HEAD
=======
<<<<<<< HEAD
<<<<<<< HEAD
>>>>>>> locatelli-main
=======
<<<<<<< HEAD
>>>>>>> locatelli-main
=======
>>>>>>> locatelli-main
>>>>>>> 3e34d2451e (GEOMESA-3176 Docs - fix download links in install instructions)
=======
>>>>>>> a85aff60b3 (GEOMESA-3061 Converters - support bytes in Avro top-level union types (#2762))
=======
<<<<<<< HEAD
<<<<<<< HEAD
<<<<<<< HEAD
=======
<<<<<<< HEAD
<<<<<<< HEAD
>>>>>>> locatelli-main
=======
<<<<<<< HEAD
>>>>>>> locatelli-main
=======
>>>>>>> locatelli-main
>>>>>>> fd5565dfba (GEOMESA-3061 Converters - support bytes in Avro top-level union types (#2762))
=======
>>>>>>> 30559ea5c9 (Merge branch 'feature/postgis-fixes')
=======
<<<<<<< HEAD
<<<<<<< HEAD
<<<<<<< HEAD
=======
<<<<<<< HEAD
<<<<<<< HEAD
>>>>>>> locatelli-main
=======
<<<<<<< HEAD
>>>>>>> locatelli-main
=======
>>>>>>> locatelli-main
>>>>>>> 0104fb37e4 (GEOMESA-3061 Converters - support bytes in Avro top-level union types (#2762))
=======
>>>>>>> 1f19a648d1 (GEOMESA-3176 Docs - fix download links in install instructions)
=======
<<<<<<< HEAD
<<<<<<< HEAD
<<<<<<< HEAD
=======
<<<<<<< HEAD
<<<<<<< HEAD
>>>>>>> locatelli-main
=======
<<<<<<< HEAD
>>>>>>> locatelli-main
=======
>>>>>>> locatelli-main
>>>>>>> c9c24ca3d7 (GEOMESA-3061 Converters - support bytes in Avro top-level union types (#2762))
=======
=======
>>>>>>> c3c5dd0ebb (GEOMESA-3061 Converters - support bytes in Avro top-level union types (#2762))
>>>>>>> 2654d9c120 (GEOMESA-3061 Converters - support bytes in Avro top-level union types (#2762))
=======
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
>>>>>>> 4ccd6f6b1f (GEOMESA-3061 Converters - support bytes in Avro top-level union types (#2762))
=======
>>>>>>> 4431c091e2 (GEOMESA-3176 Docs - fix download links in install instructions)
=======
>>>>>>> d6730faea6 (GEOMESA-3061 Converters - support bytes in Avro top-level union types (#2762))
=======
>>>>>>> 35b69b8f2f (GEOMESA-3061 Converters - support bytes in Avro top-level union types (#2762))
=======
>>>>>>> 312769c8d4 (GEOMESA-3176 Docs - fix download links in install instructions)
=======
>>>>>>> 3382f42b39 (GEOMESA-3061 Converters - support bytes in Avro top-level union types (#2762))
=======
>>>>>>> db8a3a22b2 (GEOMESA-3061 Converters - support bytes in Avro top-level union types (#2762))
=======
>>>>>>> ed25decdd5 (Merge branch 'feature/postgis-fixes')
=======
>>>>>>> 27afb28ab6 (GEOMESA-3061 Converters - support bytes in Avro top-level union types (#2762))
=======
>>>>>>> 80c85285b7 (GEOMESA-3176 Docs - fix download links in install instructions)
=======
>>>>>>> d79f0b5741 (GEOMESA-3061 Converters - support bytes in Avro top-level union types (#2762))
=======
>>>>>>> 26a09ee6c2 (GEOMESA-3061 Converters - support bytes in Avro top-level union types (#2762))
=======
>>>>>>> f05d4ba95a (GEOMESA-3176 Docs - fix download links in install instructions)
=======
>>>>>>> 3bbe93d6c5 (GEOMESA-3061 Converters - support bytes in Avro top-level union types (#2762))
=======
>>>>>>> 194ad4e5c0 (GEOMESA-3061 Converters - support bytes in Avro top-level union types (#2762))
=======
>>>>>>> 2de87fb23b (GEOMESA-3176 Docs - fix download links in install instructions)
=======
>>>>>>> c6cc684d8c (GEOMESA-3061 Converters - support bytes in Avro top-level union types (#2762))
=======
>>>>>>> 7b3c90c53f (GEOMESA-3061 Converters - support bytes in Avro top-level union types (#2762))
=======
>>>>>>> cd86312814 (GEOMESA-3176 Docs - fix download links in install instructions)
=======
>>>>>>> 11763b5af8 (GEOMESA-3061 Converters - support bytes in Avro top-level union types (#2762))
=======
>>>>>>> db9dfb6f14 (GEOMESA-3061 Converters - support bytes in Avro top-level union types (#2762))
=======
>>>>>>> f893d9a594 (Merge branch 'feature/postgis-fixes')
=======
>>>>>>> b8ebbf6083 (GEOMESA-3061 Converters - support bytes in Avro top-level union types (#2762))
=======
>>>>>>> 77f446aa59 (GEOMESA-3176 Docs - fix download links in install instructions)
=======
>>>>>>> 16e2b07c5b (GEOMESA-3061 Converters - support bytes in Avro top-level union types (#2762))
=======
>>>>>>> 3e7fb62639 (GEOMESA-3061 Converters - support bytes in Avro top-level union types (#2762))
=======
>>>>>>> eff03389ef (GEOMESA-3176 Docs - fix download links in install instructions)
=======
>>>>>>> 65b9e1925e (GEOMESA-3061 Converters - support bytes in Avro top-level union types (#2762))
=======
>>>>>>> c2cfc968d2 (GEOMESA-3061 Converters - support bytes in Avro top-level union types (#2762))
=======
>>>>>>> 033543c609 (GEOMESA-3176 Docs - fix download links in install instructions)
=======
>>>>>>> 9d2bdda5fd (GEOMESA-3061 Converters - support bytes in Avro top-level union types (#2762))
=======
>>>>>>> 0fa73844a1 (GEOMESA-3061 Converters - support bytes in Avro top-level union types (#2762))
=======
>>>>>>> 96b5e91bc8 (GEOMESA-3176 Docs - fix download links in install instructions)
=======
>>>>>>> 6e48efcdc2 (GEOMESA-3061 Converters - support bytes in Avro top-level union types (#2762))
=======
>>>>>>> 63546aacdc (GEOMESA-3061 Converters - support bytes in Avro top-level union types (#2762))
=======
>>>>>>> 964e86145a (Merge branch 'feature/postgis-fixes')
=======
>>>>>>> b298e017f1 (GEOMESA-3254 Add Bloop build support)
=======
>>>>>>> 1ea8b10ac7 (GEOMESA-3061 Converters - support bytes in Avro top-level union types (#2762))
=======
>>>>>>> 088d9e36a5 (GEOMESA-3176 Docs - fix download links in install instructions)
=======
>>>>>>> 37ee765e9b (GEOMESA-3061 Converters - support bytes in Avro top-level union types (#2762))
=======
>>>>>>> b800c052cc (GEOMESA-3061 Converters - support bytes in Avro top-level union types (#2762))
=======
>>>>>>> b7b8a67dc7 (GEOMESA-3176 Docs - fix download links in install instructions)
=======
>>>>>>> 83b11fa843 (GEOMESA-3061 Converters - support bytes in Avro top-level union types (#2762))
=======
>>>>>>> 9dbe1503e8 (GEOMESA-3061 Converters - support bytes in Avro top-level union types (#2762))
=======
>>>>>>> 2e65415d49 (GEOMESA-3176 Docs - fix download links in install instructions)
=======
>>>>>>> 1c9a51a667 (GEOMESA-3061 Converters - support bytes in Avro top-level union types (#2762))
=======
>>>>>>> 6e30236dd2 (GEOMESA-3061 Converters - support bytes in Avro top-level union types (#2762))
=======
>>>>>>> 5603dc69a0 (GEOMESA-3176 Docs - fix download links in install instructions)
=======
>>>>>>> f958055259 (GEOMESA-3061 Converters - support bytes in Avro top-level union types (#2762))
=======
>>>>>>> dbd932fed6 (GEOMESA-3061 Converters - support bytes in Avro top-level union types (#2762))
=======
>>>>>>> bf6bde0830 (Merge branch 'feature/postgis-fixes')
=======
>>>>>>> 9293965a7d (GEOMESA-3061 Converters - support bytes in Avro top-level union types (#2762))
=======
>>>>>>> 731987cbc8 (GEOMESA-3176 Docs - fix download links in install instructions)
=======
>>>>>>> 2bce465a3f (GEOMESA-3061 Converters - support bytes in Avro top-level union types (#2762))
=======
=======
>>>>>>> c3c5dd0ebb (GEOMESA-3061 Converters - support bytes in Avro top-level union types (#2762))
>>>>>>> 058fd96baa (GEOMESA-3061 Converters - support bytes in Avro top-level union types (#2762))
=======
=======
>>>>>>> 009a284072 (GEOMESA-3061 Converters - support bytes in Avro top-level union types (#2762))
=======
>>>>>>> bc622ff59f (GEOMESA-3176 Docs - fix download links in install instructions)
=======
>>>>>>> 955de6bfcc (GEOMESA-3176 Docs - fix download links in install instructions)
=======
>>>>>>> 897de97047 (GEOMESA-3061 Converters - support bytes in Avro top-level union types (#2762))
=======
>>>>>>> 9a4dff9e4f (GEOMESA-3061 Converters - support bytes in Avro top-level union types (#2762))
=======
>>>>>>> 7b8c8dcc3d (GEOMESA-3061 Converters - support bytes in Avro top-level union types (#2762))
=======
>>>>>>> 057f644239 (GEOMESA-3176 Docs - fix download links in install instructions)
=======
>>>>>>> 2586fa6a40 (GEOMESA-3061 Converters - support bytes in Avro top-level union types (#2762))
=======
>>>>>>> d329320e6a (GEOMESA-3061 Converters - support bytes in Avro top-level union types (#2762))
=======
>>>>>>> c029a43a6c (GEOMESA-3061 Converters - support bytes in Avro top-level union types (#2762))
=======
>>>>>>> 67de3c3202 (Merge branch 'feature/postgis-fixes')
=======
>>>>>>> 217b7d1cb9 (Merge branch 'feature/postgis-fixes')
=======
>>>>>>> a5b0374ee2 (GEOMESA-3061 Converters - support bytes in Avro top-level union types (#2762))
=======
>>>>>>> e007dde981 (GEOMESA-3176 Docs - fix download links in install instructions)
=======
>>>>>>> 682ce8edbb (GEOMESA-3176 Docs - fix download links in install instructions)
=======
>>>>>>> d196efd6f7 (GEOMESA-3061 Converters - support bytes in Avro top-level union types (#2762))
=======
>>>>>>> 8c9ca1211a (GEOMESA-3061 Converters - support bytes in Avro top-level union types (#2762))
=======
>>>>>>> 4f51687745 (GEOMESA-3061 Converters - support bytes in Avro top-level union types (#2762))
=======
>>>>>>> a2ed7a128d (GEOMESA-3176 Docs - fix download links in install instructions)
=======
>>>>>>> f7f4f4a836 (GEOMESA-3061 Converters - support bytes in Avro top-level union types (#2762))
=======
>>>>>>> 5a365695e1 (GEOMESA-3061 Converters - support bytes in Avro top-level union types (#2762))
=======
>>>>>>> 9a2d40c613 (GEOMESA-3061 Converters - support bytes in Avro top-level union types (#2762))
=======
>>>>>>> a0befba4ce (GEOMESA-3176 Docs - fix download links in install instructions)
=======
>>>>>>> f40ce84a61 (GEOMESA-3176 Docs - fix download links in install instructions)
=======
>>>>>>> 3ae7021103 (GEOMESA-3061 Converters - support bytes in Avro top-level union types (#2762))
=======
>>>>>>> 1cad375176 (GEOMESA-3061 Converters - support bytes in Avro top-level union types (#2762))
=======
>>>>>>> 73770612e0 (GEOMESA-3061 Converters - support bytes in Avro top-level union types (#2762))
=======
>>>>>>> e4f52faffa (GEOMESA-3176 Docs - fix download links in install instructions)
=======
>>>>>>> 31f6953312 (GEOMESA-3061 Converters - support bytes in Avro top-level union types (#2762))
=======
>>>>>>> 14cf946af4 (GEOMESA-3061 Converters - support bytes in Avro top-level union types (#2762))
=======
>>>>>>> 6c83981af3 (GEOMESA-3061 Converters - support bytes in Avro top-level union types (#2762))
=======
>>>>>>> 638b68d081 (Merge branch 'feature/postgis-fixes')
=======
>>>>>>> b6e56a9e80 (Merge branch 'feature/postgis-fixes')
=======
>>>>>>> b1f71c0764 (GEOMESA-3061 Converters - support bytes in Avro top-level union types (#2762))
=======
>>>>>>> 7b2b25cc3c (GEOMESA-3176 Docs - fix download links in install instructions)
=======
>>>>>>> 7f7083f095 (GEOMESA-3176 Docs - fix download links in install instructions)
=======
>>>>>>> a38834fade (GEOMESA-3061 Converters - support bytes in Avro top-level union types (#2762))
=======
>>>>>>> 963feec660 (GEOMESA-3061 Converters - support bytes in Avro top-level union types (#2762))
=======
>>>>>>> cc89a73032 (GEOMESA-3061 Converters - support bytes in Avro top-level union types (#2762))
=======
>>>>>>> 0b168af9c8 (GEOMESA-3176 Docs - fix download links in install instructions)
=======
>>>>>>> 6fc8851879 (GEOMESA-3061 Converters - support bytes in Avro top-level union types (#2762))
=======
>>>>>>> dcbf9c4320 (GEOMESA-3061 Converters - support bytes in Avro top-level union types (#2762))
=======
>>>>>>> 36b890ce98 (GEOMESA-3061 Converters - support bytes in Avro top-level union types (#2762))
=======
>>>>>>> 3995e6a61c (GEOMESA-3176 Docs - fix download links in install instructions)
=======
>>>>>>> 84e5c6b001 (GEOMESA-3176 Docs - fix download links in install instructions)
=======
>>>>>>> ce19d9c8bd (GEOMESA-3061 Converters - support bytes in Avro top-level union types (#2762))
=======
>>>>>>> fe3de10f11 (GEOMESA-3061 Converters - support bytes in Avro top-level union types (#2762))
=======
>>>>>>> 98c12ce706 (GEOMESA-3061 Converters - support bytes in Avro top-level union types (#2762))
=======
>>>>>>> dcc9d7f708 (GEOMESA-3176 Docs - fix download links in install instructions)
=======
>>>>>>> c91f823574 (GEOMESA-3061 Converters - support bytes in Avro top-level union types (#2762))
=======
>>>>>>> 8a2d92d131 (GEOMESA-3061 Converters - support bytes in Avro top-level union types (#2762))
=======
>>>>>>> 72962fe615 (GEOMESA-3061 Converters - support bytes in Avro top-level union types (#2762))
=======
>>>>>>> 71adb695c5 (Merge branch 'feature/postgis-fixes')
=======
>>>>>>> 0a5b74c946 (Merge branch 'feature/postgis-fixes')
=======
>>>>>>> 13656f5052 (GEOMESA-3254 Add Bloop build support)
=======
>>>>>>> a52e4429be (GEOMESA-3061 Converters - support bytes in Avro top-level union types (#2762))
=======
>>>>>>> f7b6b53d97 (GEOMESA-3061 Converters - support bytes in Avro top-level union types (#2762))
=======
>>>>>>> c04d2a7e80 (GEOMESA-3176 Docs - fix download links in install instructions)
=======
>>>>>>> bc73cc4d41 (GEOMESA-3061 Converters - support bytes in Avro top-level union types (#2762))
=======
>>>>>>> 7c052f66eb (GEOMESA-3061 Converters - support bytes in Avro top-level union types (#2762))
=======
>>>>>>> ecfd546311 (GEOMESA-3061 Converters - support bytes in Avro top-level union types (#2762))
=======
>>>>>>> 813f24c01d (GEOMESA-3176 Docs - fix download links in install instructions)
=======
>>>>>>> 79d78e33bb (GEOMESA-3176 Docs - fix download links in install instructions)
=======
>>>>>>> 411f3fc089 (GEOMESA-3061 Converters - support bytes in Avro top-level union types (#2762))
=======
>>>>>>> 9d44ff473d (GEOMESA-3061 Converters - support bytes in Avro top-level union types (#2762))
=======
>>>>>>> db389b4b99 (GEOMESA-3061 Converters - support bytes in Avro top-level union types (#2762))
=======
>>>>>>> 72c7cd55e5 (GEOMESA-3176 Docs - fix download links in install instructions)
=======
>>>>>>> 664350d86f (GEOMESA-3061 Converters - support bytes in Avro top-level union types (#2762))
=======
>>>>>>> 992ed6b1bf (GEOMESA-3061 Converters - support bytes in Avro top-level union types (#2762))
=======
>>>>>>> acc6bdccf3 (GEOMESA-3061 Converters - support bytes in Avro top-level union types (#2762))
=======
>>>>>>> 3e34d2451e (GEOMESA-3176 Docs - fix download links in install instructions)
=======
>>>>>>> d025f79392 (GEOMESA-3176 Docs - fix download links in install instructions)
=======
>>>>>>> 8171686fd2 (GEOMESA-3061 Converters - support bytes in Avro top-level union types (#2762))
=======
>>>>>>> fd5565dfba (GEOMESA-3061 Converters - support bytes in Avro top-level union types (#2762))
=======
>>>>>>> 7925093789 (GEOMESA-3061 Converters - support bytes in Avro top-level union types (#2762))
=======
>>>>>>> a30a0c1a2a (Merge branch 'feature/postgis-fixes')
=======
>>>>>>> 0104fb37e4 (GEOMESA-3061 Converters - support bytes in Avro top-level union types (#2762))
=======
>>>>>>> 9d0ea08871 (GEOMESA-3061 Converters - support bytes in Avro top-level union types (#2762))
=======
>>>>>>> fbb5e06c6a (GEOMESA-3176 Docs - fix download links in install instructions)
=======
>>>>>>> c9c24ca3d7 (GEOMESA-3061 Converters - support bytes in Avro top-level union types (#2762))
=======
>>>>>>> b8545eda8f (GEOMESA-3061 Converters - support bytes in Avro top-level union types (#2762))
=======
>>>>>>> e6703260b7 (GEOMESA-3061 Converters - support bytes in Avro top-level union types (#2762))
<<<<<<< HEAD
<<<<<<< HEAD
>>>>>>> locatelli-main
=======
>>>>>>> locatelli-main
=======
>>>>>>> locatelli-main
=======
>>>>>>> 23c0241798 (GEOMESA-3061 Converters - support bytes in Avro top-level union types (#2762))
=======
>>>>>>> a910ae135f (GEOMESA-3061 Converters - support bytes in Avro top-level union types (#2762))
=======
<<<<<<< HEAD
<<<<<<< HEAD
<<<<<<< HEAD
<<<<<<< HEAD
=======
<<<<<<< HEAD
<<<<<<< HEAD
>>>>>>> locationtech-main
=======
<<<<<<< HEAD
=======
>>>>>>> locatelli-main
<<<<<<< HEAD
=======
>>>>>>> locatelli-main
<<<<<<< HEAD
<<<<<<< HEAD
<<<<<<< HEAD
=======
>>>>>>> 009a284072 (GEOMESA-3061 Converters - support bytes in Avro top-level union types (#2762))
=======
>>>>>>> 955de6bfcc (GEOMESA-3176 Docs - fix download links in install instructions)
<<<<<<< HEAD
<<<<<<< HEAD
>>>>>>> locatelli-main
=======
>>>>>>> locatelli-main
=======
>>>>>>> locatelli-main
>>>>>>> 4b70e7f8fb (GEOMESA-3176 Docs - fix download links in install instructions)
=======
>>>>>>> 85663f71c4 (GEOMESA-3061 Converters - support bytes in Avro top-level union types (#2762))
=======
<<<<<<< HEAD
<<<<<<< HEAD
<<<<<<< HEAD
<<<<<<< HEAD
=======
<<<<<<< HEAD
<<<<<<< HEAD
>>>>>>> locationtech-main
=======
<<<<<<< HEAD
=======
>>>>>>> locatelli-main
<<<<<<< HEAD
=======
>>>>>>> locatelli-main
<<<<<<< HEAD
<<<<<<< HEAD
<<<<<<< HEAD
=======
>>>>>>> 897de97047 (GEOMESA-3061 Converters - support bytes in Avro top-level union types (#2762))
=======
>>>>>>> 7b8c8dcc3d (GEOMESA-3061 Converters - support bytes in Avro top-level union types (#2762))
<<<<<<< HEAD
<<<<<<< HEAD
>>>>>>> locatelli-main
=======
>>>>>>> locatelli-main
=======
>>>>>>> locatelli-main
>>>>>>> ad3cedc4db (GEOMESA-3061 Converters - support bytes in Avro top-level union types (#2762))
=======
>>>>>>> a12ea194c8 (GEOMESA-3176 Docs - fix download links in install instructions)
=======
<<<<<<< HEAD
<<<<<<< HEAD
<<<<<<< HEAD
<<<<<<< HEAD
=======
<<<<<<< HEAD
<<<<<<< HEAD
>>>>>>> locationtech-main
=======
=======
>>>>>>> locatelli-main
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
<<<<<<< HEAD
<<<<<<< HEAD
<<<<<<< HEAD
>>>>>>> locatelli-main
=======
>>>>>>> bdbced26d4 (GEOMESA-3061 Converters - support bytes in Avro top-level union types (#2762))
=======
>>>>>>> 1b25d7ddb4 (Merge branch 'feature/postgis-fixes')
=======
>>>>>>> 0dbede148d (GEOMESA-3061 Converters - support bytes in Avro top-level union types (#2762))
=======
>>>>>>> 71c56e6b77 (GEOMESA-3176 Docs - fix download links in install instructions)
=======
>>>>>>> e27137ff78 (GEOMESA-3061 Converters - support bytes in Avro top-level union types (#2762))
=======
=======
=======
>>>>>>> dddc42e265 (GEOMESA-3061 Converters - support bytes in Avro top-level union types (#2762))
=======
>>>>>>> b009fd23f4 (GEOMESA-3061 Converters - support bytes in Avro top-level union types (#2762))
=======
>>>>>>> d969b4c2d5 (GEOMESA-3176 Docs - fix download links in install instructions)
=======
>>>>>>> 4564a1634e (GEOMESA-3061 Converters - support bytes in Avro top-level union types (#2762))
=======
>>>>>>> 238945d4b3 (GEOMESA-3061 Converters - support bytes in Avro top-level union types (#2762))
=======
>>>>>>> f73ef99f1e (GEOMESA-3176 Docs - fix download links in install instructions)
=======
>>>>>>> be05354746 (GEOMESA-3061 Converters - support bytes in Avro top-level union types (#2762))
=======
>>>>>>> bc4062951d (GEOMESA-3061 Converters - support bytes in Avro top-level union types (#2762))
=======
>>>>>>> e944f1c88b (Merge branch 'feature/postgis-fixes')
=======
>>>>>>> 8adfab65bb (GEOMESA-3061 Converters - support bytes in Avro top-level union types (#2762))
=======
>>>>>>> 235bc2820d (GEOMESA-3176 Docs - fix download links in install instructions)
=======
>>>>>>> 4a05f27ba4 (GEOMESA-3061 Converters - support bytes in Avro top-level union types (#2762))
=======
>>>>>>> 7b0539b808 (GEOMESA-3061 Converters - support bytes in Avro top-level union types (#2762))
=======
>>>>>>> 256a642cc1 (GEOMESA-3176 Docs - fix download links in install instructions)
=======
>>>>>>> aceaf3bd81 (GEOMESA-3061 Converters - support bytes in Avro top-level union types (#2762))
=======
>>>>>>> 0086b292ba (GEOMESA-3061 Converters - support bytes in Avro top-level union types (#2762))
=======
>>>>>>> 7efa8bf5c8 (GEOMESA-3176 Docs - fix download links in install instructions)
=======
>>>>>>> 93c8cf1b3a (GEOMESA-3061 Converters - support bytes in Avro top-level union types (#2762))
=======
>>>>>>> e15d50d7d3 (GEOMESA-3061 Converters - support bytes in Avro top-level union types (#2762))
=======
>>>>>>> 94efcf84c2 (GEOMESA-3176 Docs - fix download links in install instructions)
=======
>>>>>>> 8929cbff5b (GEOMESA-3061 Converters - support bytes in Avro top-level union types (#2762))
=======
>>>>>>> 8de43cccf6 (GEOMESA-3061 Converters - support bytes in Avro top-level union types (#2762))
=======
>>>>>>> 26e5afc4ea (Merge branch 'feature/postgis-fixes')
=======
>>>>>>> 63a045a753 (GEOMESA-3254 Add Bloop build support)
=======
>>>>>>> 12e3a588fc (GEOMESA-3061 Converters - support bytes in Avro top-level union types (#2762))
=======
>>>>>>> 93fa8c797f (GEOMESA-3176 Docs - fix download links in install instructions)
=======
>>>>>>> c82dea9d29 (GEOMESA-3061 Converters - support bytes in Avro top-level union types (#2762))
=======
>>>>>>> 1890b11217 (GEOMESA-3061 Converters - support bytes in Avro top-level union types (#2762))
=======
>>>>>>> 2142d07ded (GEOMESA-3176 Docs - fix download links in install instructions)
=======
>>>>>>> a398ab1183 (GEOMESA-3061 Converters - support bytes in Avro top-level union types (#2762))
=======
>>>>>>> 9c28193a91 (GEOMESA-3061 Converters - support bytes in Avro top-level union types (#2762))
=======
>>>>>>> a8d6366d72 (GEOMESA-3176 Docs - fix download links in install instructions)
=======
>>>>>>> 6f30a087ee (GEOMESA-3061 Converters - support bytes in Avro top-level union types (#2762))
=======
>>>>>>> d294ce49e2 (GEOMESA-3061 Converters - support bytes in Avro top-level union types (#2762))
=======
>>>>>>> b041fcc3eb (GEOMESA-3176 Docs - fix download links in install instructions)
=======
>>>>>>> 3acb47e615 (GEOMESA-3061 Converters - support bytes in Avro top-level union types (#2762))
=======
>>>>>>> 1df8328338 (GEOMESA-3061 Converters - support bytes in Avro top-level union types (#2762))
=======
>>>>>>> c69897d7bd (Merge branch 'feature/postgis-fixes')
<<<<<<< HEAD
<<<<<<< HEAD
<<<<<<< HEAD
<<<<<<< HEAD
>>>>>>> location-main
=======
>>>>>>> locationtech-main
=======
>>>>>>> locatelli-main
=======
>>>>>>> locatelli-main
=======
>>>>>>> locatelli-main
=======
=======
>>>>>>> 3dd99aed4 (GEOMESA-3061 Converters - support bytes in Avro top-level union types (#2762))
=======
>>>>>>> 45ad5d11f (GEOMESA-3061 Converters - support bytes in Avro top-level union types (#2762))
=======
>>>>>>> baa90e85a (GEOMESA-3176 Docs - fix download links in install instructions)
=======
>>>>>>> 4524373ac (GEOMESA-3061 Converters - support bytes in Avro top-level union types (#2762))
=======
>>>>>>> dace2085b (GEOMESA-3061 Converters - support bytes in Avro top-level union types (#2762))
=======
>>>>>>> 46c05fed5 (GEOMESA-3176 Docs - fix download links in install instructions)
=======
=======
>>>>>>> 28e2bfa2d (GEOMESA-3061 Converters - support bytes in Avro top-level union types (#2762))
>>>>>>> 4fbe39c62 (GEOMESA-3061 Converters - support bytes in Avro top-level union types (#2762))
=======
>>>>>>> 90ec70f55 (GEOMESA-3176 Docs - fix download links in install instructions)
>>>>>>> 6a26990f7 (GEOMESA-3176 Docs - fix download links in install instructions)
<<<<<<< HEAD
<<<<<<< HEAD
<<<<<<< HEAD
<<<<<<< HEAD
<<<<<<< HEAD
=======
>>>>>>> 240977229 (GEOMESA-3061 Converters - support bytes in Avro top-level union types (#2762))
=======
=======
>>>>>>> locationtech-main
=======
>>>>>>> locatelli-main
=======
>>>>>>> locatelli-main
=======
>>>>>>> locatelli-main
>>>>>>> 0b36b46b5f (GEOMESA-3176 Docs - fix download links in install instructions)
=======
>>>>>>> 240977229 (GEOMESA-3061 Converters - support bytes in Avro top-level union types (#2762))
>>>>>>> 22dcc8170f (GEOMESA-3061 Converters - support bytes in Avro top-level union types (#2762))
<<<<<<< HEAD
<<<<<<< HEAD
<<<<<<< HEAD
<<<<<<< HEAD
>>>>>>> location-main
=======
>>>>>>> locationtech-main
=======
=======
>>>>>>> locatelli-main
=======
>>>>>>> locatelli-main
=======
>>>>>>> 516fe7e9c (GEOMESA-3061 Converters - support bytes in Avro top-level union types (#2762))
=======
>>>>>>> e8cc4971c6 (Merge branch 'feature/postgis-fixes')
=======
>>>>>>> 81ee66102b (GEOMESA-3061 Converters - support bytes in Avro top-level union types (#2762))
=======
>>>>>>> bdcaf0ab5e (GEOMESA-3176 Docs - fix download links in install instructions)
=======
>>>>>>> f9f6fde40b (GEOMESA-3061 Converters - support bytes in Avro top-level union types (#2762))
=======
=======
=======
>>>>>>> 6a2cd10c1c (GEOMESA-3061 Converters - support bytes in Avro top-level union types (#2762))
=======
>>>>>>> 947761ec9b (GEOMESA-3061 Converters - support bytes in Avro top-level union types (#2762))
=======
>>>>>>> 4d9f87a514 (GEOMESA-3176 Docs - fix download links in install instructions)
=======
>>>>>>> 8a6a96234b (GEOMESA-3061 Converters - support bytes in Avro top-level union types (#2762))
=======
>>>>>>> c9328eddce (GEOMESA-3061 Converters - support bytes in Avro top-level union types (#2762))
=======
>>>>>>> bd3233180f (GEOMESA-3176 Docs - fix download links in install instructions)
=======
>>>>>>> 0c734cda2b (GEOMESA-3061 Converters - support bytes in Avro top-level union types (#2762))
=======
>>>>>>> d94c03a98e (GEOMESA-3061 Converters - support bytes in Avro top-level union types (#2762))
=======
>>>>>>> cb6bda89b6 (Merge branch 'feature/postgis-fixes')
=======
>>>>>>> 09d87762c5 (GEOMESA-3254 Add Bloop build support)
=======
>>>>>>> 67e4c1354f (GEOMESA-3061 Converters - support bytes in Avro top-level union types (#2762))
=======
>>>>>>> 703374130f (GEOMESA-3176 Docs - fix download links in install instructions)
=======
>>>>>>> 748532d2db (GEOMESA-3061 Converters - support bytes in Avro top-level union types (#2762))
=======
=======
=======
>>>>>>> 250f01786f (GEOMESA-3061 Converters - support bytes in Avro top-level union types (#2762))
=======
>>>>>>> 07161eaaa6 (GEOMESA-3061 Converters - support bytes in Avro top-level union types (#2762))
=======
>>>>>>> b42125fac1 (GEOMESA-3176 Docs - fix download links in install instructions)
=======
>>>>>>> 813488e18c (GEOMESA-3061 Converters - support bytes in Avro top-level union types (#2762))
=======
>>>>>>> 9abc630fdf (GEOMESA-3061 Converters - support bytes in Avro top-level union types (#2762))
=======
>>>>>>> 5c3f315bc0 (GEOMESA-3176 Docs - fix download links in install instructions)
=======
>>>>>>> fe51719bc6 (GEOMESA-3061 Converters - support bytes in Avro top-level union types (#2762))
=======
>>>>>>> 25063957fc (GEOMESA-3061 Converters - support bytes in Avro top-level union types (#2762))
=======
>>>>>>> 699117eca9 (Merge branch 'feature/postgis-fixes')
=======
=======
>>>>>>> 23c024179 (GEOMESA-3061 Converters - support bytes in Avro top-level union types (#2762))
=======
>>>>>>> a910ae135 (GEOMESA-3061 Converters - support bytes in Avro top-level union types (#2762))
=======
>>>>>>> 4b70e7f8f (GEOMESA-3176 Docs - fix download links in install instructions)
=======
>>>>>>> 85663f71c (GEOMESA-3061 Converters - support bytes in Avro top-level union types (#2762))
=======
>>>>>>> ad3cedc4d (GEOMESA-3061 Converters - support bytes in Avro top-level union types (#2762))
=======
>>>>>>> a12ea194c (GEOMESA-3176 Docs - fix download links in install instructions)
=======
=======
>>>>>>> 28e2bfa2d (GEOMESA-3061 Converters - support bytes in Avro top-level union types (#2762))
>>>>>>> d4c5768cf (GEOMESA-3061 Converters - support bytes in Avro top-level union types (#2762))
=======
>>>>>>> 90ec70f55 (GEOMESA-3176 Docs - fix download links in install instructions)
>>>>>>> 279de44d3 (GEOMESA-3176 Docs - fix download links in install instructions)
>>>>>>> b7c6b904be (GEOMESA-3176 Docs - fix download links in install instructions)
=======
>>>>>>> e6e1f4bdd (GEOMESA-3061 Converters - support bytes in Avro top-level union types (#2762))
>>>>>>> 8035cc5893 (GEOMESA-3061 Converters - support bytes in Avro top-level union types (#2762))
=======
=======
>>>>>>> 5f428db97 (GEOMESA-3061 Converters - support bytes in Avro top-level union types (#2762))
=======
>>>>>>> 76618c8da (GEOMESA-3061 Converters - support bytes in Avro top-level union types (#2762))
=======
>>>>>>> 0fbf9e83e (GEOMESA-3176 Docs - fix download links in install instructions)
=======
>>>>>>> 89bdd3013 (GEOMESA-3061 Converters - support bytes in Avro top-level union types (#2762))
=======
>>>>>>> c8a325e13 (GEOMESA-3061 Converters - support bytes in Avro top-level union types (#2762))
=======
>>>>>>> f9e8439b0 (GEOMESA-3176 Docs - fix download links in install instructions)
=======
=======
>>>>>>> 28e2bfa2d (GEOMESA-3061 Converters - support bytes in Avro top-level union types (#2762))
>>>>>>> 72bafaf54 (GEOMESA-3061 Converters - support bytes in Avro top-level union types (#2762))
=======
>>>>>>> 90ec70f55 (GEOMESA-3176 Docs - fix download links in install instructions)
>>>>>>> 8cbe155de (GEOMESA-3176 Docs - fix download links in install instructions)
>>>>>>> 8150bc0e65 (GEOMESA-3176 Docs - fix download links in install instructions)
=======
>>>>>>> 9d708b240 (GEOMESA-3061 Converters - support bytes in Avro top-level union types (#2762))
>>>>>>> 53a3e72cbf (GEOMESA-3061 Converters - support bytes in Avro top-level union types (#2762))
=======
>>>>>>> 97ec7d864 (GEOMESA-3061 Converters - support bytes in Avro top-level union types (#2762))
=======
>>>>>>> db8d998aa (Merge branch 'feature/postgis-fixes')
=======
>>>>>>> bdbced26d (GEOMESA-3061 Converters - support bytes in Avro top-level union types (#2762))
=======
>>>>>>> 1b25d7ddb (Merge branch 'feature/postgis-fixes')
=======
>>>>>>> 2586fa6a40 (GEOMESA-3061 Converters - support bytes in Avro top-level union types (#2762))
=======
>>>>>>> bdbced26d4 (GEOMESA-3061 Converters - support bytes in Avro top-level union types (#2762))
=======
>>>>>>> 1b25d7ddb4 (Merge branch 'feature/postgis-fixes')
=======
>>>>>>> 0dbede148d (GEOMESA-3061 Converters - support bytes in Avro top-level union types (#2762))
=======
>>>>>>> 71c56e6b77 (GEOMESA-3176 Docs - fix download links in install instructions)
=======
>>>>>>> e27137ff78 (GEOMESA-3061 Converters - support bytes in Avro top-level union types (#2762))
=======
=======
=======
>>>>>>> dddc42e265 (GEOMESA-3061 Converters - support bytes in Avro top-level union types (#2762))
=======
>>>>>>> b009fd23f4 (GEOMESA-3061 Converters - support bytes in Avro top-level union types (#2762))
=======
>>>>>>> d969b4c2d5 (GEOMESA-3176 Docs - fix download links in install instructions)
=======
>>>>>>> 4564a1634e (GEOMESA-3061 Converters - support bytes in Avro top-level union types (#2762))
=======
>>>>>>> 238945d4b3 (GEOMESA-3061 Converters - support bytes in Avro top-level union types (#2762))
=======
>>>>>>> f73ef99f1e (GEOMESA-3176 Docs - fix download links in install instructions)
=======
>>>>>>> be05354746 (GEOMESA-3061 Converters - support bytes in Avro top-level union types (#2762))
=======
>>>>>>> bc4062951d (GEOMESA-3061 Converters - support bytes in Avro top-level union types (#2762))
=======
>>>>>>> e944f1c88b (Merge branch 'feature/postgis-fixes')
=======
>>>>>>> 8adfab65bb (GEOMESA-3061 Converters - support bytes in Avro top-level union types (#2762))
=======
>>>>>>> 235bc2820d (GEOMESA-3176 Docs - fix download links in install instructions)
=======
>>>>>>> 4a05f27ba4 (GEOMESA-3061 Converters - support bytes in Avro top-level union types (#2762))
=======
>>>>>>> 7b0539b808 (GEOMESA-3061 Converters - support bytes in Avro top-level union types (#2762))
=======
>>>>>>> 256a642cc1 (GEOMESA-3176 Docs - fix download links in install instructions)
=======
>>>>>>> aceaf3bd81 (GEOMESA-3061 Converters - support bytes in Avro top-level union types (#2762))
=======
>>>>>>> 0086b292ba (GEOMESA-3061 Converters - support bytes in Avro top-level union types (#2762))
=======
>>>>>>> 7efa8bf5c8 (GEOMESA-3176 Docs - fix download links in install instructions)
=======
>>>>>>> 93c8cf1b3a (GEOMESA-3061 Converters - support bytes in Avro top-level union types (#2762))
=======
>>>>>>> e15d50d7d3 (GEOMESA-3061 Converters - support bytes in Avro top-level union types (#2762))
=======
>>>>>>> 94efcf84c2 (GEOMESA-3176 Docs - fix download links in install instructions)
=======
>>>>>>> 8929cbff5b (GEOMESA-3061 Converters - support bytes in Avro top-level union types (#2762))
=======
>>>>>>> 8de43cccf6 (GEOMESA-3061 Converters - support bytes in Avro top-level union types (#2762))
=======
>>>>>>> 26e5afc4ea (Merge branch 'feature/postgis-fixes')
=======
>>>>>>> 63a045a753 (GEOMESA-3254 Add Bloop build support)
=======
>>>>>>> 12e3a588fc (GEOMESA-3061 Converters - support bytes in Avro top-level union types (#2762))
=======
>>>>>>> 93fa8c797f (GEOMESA-3176 Docs - fix download links in install instructions)
=======
>>>>>>> c82dea9d29 (GEOMESA-3061 Converters - support bytes in Avro top-level union types (#2762))
=======
>>>>>>> 1890b11217 (GEOMESA-3061 Converters - support bytes in Avro top-level union types (#2762))
=======
>>>>>>> 2142d07ded (GEOMESA-3176 Docs - fix download links in install instructions)
=======
>>>>>>> a398ab1183 (GEOMESA-3061 Converters - support bytes in Avro top-level union types (#2762))
=======
>>>>>>> 9c28193a91 (GEOMESA-3061 Converters - support bytes in Avro top-level union types (#2762))
=======
>>>>>>> a8d6366d72 (GEOMESA-3176 Docs - fix download links in install instructions)
=======
>>>>>>> 6f30a087ee (GEOMESA-3061 Converters - support bytes in Avro top-level union types (#2762))
=======
>>>>>>> d294ce49e2 (GEOMESA-3061 Converters - support bytes in Avro top-level union types (#2762))
=======
>>>>>>> b041fcc3eb (GEOMESA-3176 Docs - fix download links in install instructions)
=======
>>>>>>> 3acb47e615 (GEOMESA-3061 Converters - support bytes in Avro top-level union types (#2762))
=======
>>>>>>> 1df8328338 (GEOMESA-3061 Converters - support bytes in Avro top-level union types (#2762))
=======
>>>>>>> c69897d7bd (Merge branch 'feature/postgis-fixes')
=======
=======
>>>>>>> 3dd99aed4 (GEOMESA-3061 Converters - support bytes in Avro top-level union types (#2762))
=======
>>>>>>> 45ad5d11f (GEOMESA-3061 Converters - support bytes in Avro top-level union types (#2762))
=======
>>>>>>> baa90e85a (GEOMESA-3176 Docs - fix download links in install instructions)
=======
>>>>>>> 4524373ac (GEOMESA-3061 Converters - support bytes in Avro top-level union types (#2762))
=======
>>>>>>> dace2085b (GEOMESA-3061 Converters - support bytes in Avro top-level union types (#2762))
=======
>>>>>>> 46c05fed5 (GEOMESA-3176 Docs - fix download links in install instructions)
=======
=======
>>>>>>> 28e2bfa2d (GEOMESA-3061 Converters - support bytes in Avro top-level union types (#2762))
>>>>>>> 4fbe39c62 (GEOMESA-3061 Converters - support bytes in Avro top-level union types (#2762))
=======
>>>>>>> 90ec70f55 (GEOMESA-3176 Docs - fix download links in install instructions)
>>>>>>> 6a26990f7 (GEOMESA-3176 Docs - fix download links in install instructions)
>>>>>>> 0b36b46b5f (GEOMESA-3176 Docs - fix download links in install instructions)
=======
>>>>>>> 240977229 (GEOMESA-3061 Converters - support bytes in Avro top-level union types (#2762))
>>>>>>> 22dcc8170f (GEOMESA-3061 Converters - support bytes in Avro top-level union types (#2762))
=======
>>>>>>> 516fe7e9c (GEOMESA-3061 Converters - support bytes in Avro top-level union types (#2762))
=======
>>>>>>> e8cc4971c6 (Merge branch 'feature/postgis-fixes')
=======
>>>>>>> 81ee66102b (GEOMESA-3061 Converters - support bytes in Avro top-level union types (#2762))
=======
>>>>>>> bdcaf0ab5e (GEOMESA-3176 Docs - fix download links in install instructions)
=======
>>>>>>> f9f6fde40b (GEOMESA-3061 Converters - support bytes in Avro top-level union types (#2762))
=======
=======
=======
>>>>>>> 6a2cd10c1c (GEOMESA-3061 Converters - support bytes in Avro top-level union types (#2762))
=======
>>>>>>> 947761ec9b (GEOMESA-3061 Converters - support bytes in Avro top-level union types (#2762))
=======
>>>>>>> 4d9f87a514 (GEOMESA-3176 Docs - fix download links in install instructions)
=======
>>>>>>> 8a6a96234b (GEOMESA-3061 Converters - support bytes in Avro top-level union types (#2762))
=======
>>>>>>> c9328eddce (GEOMESA-3061 Converters - support bytes in Avro top-level union types (#2762))
=======
>>>>>>> bd3233180f (GEOMESA-3176 Docs - fix download links in install instructions)
=======
>>>>>>> 0c734cda2b (GEOMESA-3061 Converters - support bytes in Avro top-level union types (#2762))
=======
>>>>>>> d94c03a98e (GEOMESA-3061 Converters - support bytes in Avro top-level union types (#2762))
=======
>>>>>>> cb6bda89b6 (Merge branch 'feature/postgis-fixes')
=======
>>>>>>> 09d87762c5 (GEOMESA-3254 Add Bloop build support)
=======
>>>>>>> 67e4c1354f (GEOMESA-3061 Converters - support bytes in Avro top-level union types (#2762))
=======
>>>>>>> 703374130f (GEOMESA-3176 Docs - fix download links in install instructions)
=======
>>>>>>> 748532d2db (GEOMESA-3061 Converters - support bytes in Avro top-level union types (#2762))
=======
=======
=======
>>>>>>> 250f01786f (GEOMESA-3061 Converters - support bytes in Avro top-level union types (#2762))
=======
>>>>>>> 07161eaaa6 (GEOMESA-3061 Converters - support bytes in Avro top-level union types (#2762))
=======
>>>>>>> b42125fac1 (GEOMESA-3176 Docs - fix download links in install instructions)
=======
>>>>>>> 813488e18c (GEOMESA-3061 Converters - support bytes in Avro top-level union types (#2762))
=======
>>>>>>> 9abc630fdf (GEOMESA-3061 Converters - support bytes in Avro top-level union types (#2762))
=======
>>>>>>> 5c3f315bc0 (GEOMESA-3176 Docs - fix download links in install instructions)
=======
>>>>>>> fe51719bc6 (GEOMESA-3061 Converters - support bytes in Avro top-level union types (#2762))
=======
>>>>>>> 25063957fc (GEOMESA-3061 Converters - support bytes in Avro top-level union types (#2762))
=======
>>>>>>> 699117eca9 (Merge branch 'feature/postgis-fixes')
=======
=======
>>>>>>> 23c024179 (GEOMESA-3061 Converters - support bytes in Avro top-level union types (#2762))
=======
>>>>>>> a910ae135 (GEOMESA-3061 Converters - support bytes in Avro top-level union types (#2762))
=======
>>>>>>> 4b70e7f8f (GEOMESA-3176 Docs - fix download links in install instructions)
=======
>>>>>>> 85663f71c (GEOMESA-3061 Converters - support bytes in Avro top-level union types (#2762))
=======
>>>>>>> ad3cedc4d (GEOMESA-3061 Converters - support bytes in Avro top-level union types (#2762))
=======
>>>>>>> a12ea194c (GEOMESA-3176 Docs - fix download links in install instructions)
=======
=======
>>>>>>> 28e2bfa2d (GEOMESA-3061 Converters - support bytes in Avro top-level union types (#2762))
>>>>>>> d4c5768cf (GEOMESA-3061 Converters - support bytes in Avro top-level union types (#2762))
=======
>>>>>>> 90ec70f55 (GEOMESA-3176 Docs - fix download links in install instructions)
>>>>>>> 279de44d3 (GEOMESA-3176 Docs - fix download links in install instructions)
>>>>>>> b7c6b904be (GEOMESA-3176 Docs - fix download links in install instructions)
=======
>>>>>>> e6e1f4bdd (GEOMESA-3061 Converters - support bytes in Avro top-level union types (#2762))
>>>>>>> 8035cc5893 (GEOMESA-3061 Converters - support bytes in Avro top-level union types (#2762))
=======
=======
>>>>>>> 5f428db97 (GEOMESA-3061 Converters - support bytes in Avro top-level union types (#2762))
=======
>>>>>>> 76618c8da (GEOMESA-3061 Converters - support bytes in Avro top-level union types (#2762))
=======
>>>>>>> 0fbf9e83e (GEOMESA-3176 Docs - fix download links in install instructions)
=======
>>>>>>> 89bdd3013 (GEOMESA-3061 Converters - support bytes in Avro top-level union types (#2762))
=======
>>>>>>> c8a325e13 (GEOMESA-3061 Converters - support bytes in Avro top-level union types (#2762))
=======
>>>>>>> f9e8439b0 (GEOMESA-3176 Docs - fix download links in install instructions)
=======
=======
>>>>>>> 28e2bfa2d (GEOMESA-3061 Converters - support bytes in Avro top-level union types (#2762))
>>>>>>> 72bafaf54 (GEOMESA-3061 Converters - support bytes in Avro top-level union types (#2762))
=======
>>>>>>> 90ec70f55 (GEOMESA-3176 Docs - fix download links in install instructions)
>>>>>>> 8cbe155de (GEOMESA-3176 Docs - fix download links in install instructions)
>>>>>>> 8150bc0e65 (GEOMESA-3176 Docs - fix download links in install instructions)
=======
>>>>>>> 9d708b240 (GEOMESA-3061 Converters - support bytes in Avro top-level union types (#2762))
>>>>>>> 53a3e72cbf (GEOMESA-3061 Converters - support bytes in Avro top-level union types (#2762))
=======
>>>>>>> 97ec7d864 (GEOMESA-3061 Converters - support bytes in Avro top-level union types (#2762))
=======
>>>>>>> db8d998aa (Merge branch 'feature/postgis-fixes')
=======
>>>>>>> bdbced26d (GEOMESA-3061 Converters - support bytes in Avro top-level union types (#2762))
=======
>>>>>>> 1b25d7ddb (Merge branch 'feature/postgis-fixes')
=======
>>>>>>> 3382f42b39 (GEOMESA-3061 Converters - support bytes in Avro top-level union types (#2762))
=======
>>>>>>> 057f644239 (GEOMESA-3176 Docs - fix download links in install instructions)
=======
>>>>>>> d329320e6a (GEOMESA-3061 Converters - support bytes in Avro top-level union types (#2762))
=======
>>>>>>> bdbced26d4 (GEOMESA-3061 Converters - support bytes in Avro top-level union types (#2762))
=======
>>>>>>> 1b25d7ddb4 (Merge branch 'feature/postgis-fixes')
=======
>>>>>>> 0dbede148d (GEOMESA-3061 Converters - support bytes in Avro top-level union types (#2762))
=======
>>>>>>> 71c56e6b77 (GEOMESA-3176 Docs - fix download links in install instructions)
=======
>>>>>>> e27137ff78 (GEOMESA-3061 Converters - support bytes in Avro top-level union types (#2762))
=======
=======
=======
>>>>>>> dddc42e265 (GEOMESA-3061 Converters - support bytes in Avro top-level union types (#2762))
=======
>>>>>>> b009fd23f4 (GEOMESA-3061 Converters - support bytes in Avro top-level union types (#2762))
=======
>>>>>>> d969b4c2d5 (GEOMESA-3176 Docs - fix download links in install instructions)
=======
>>>>>>> 4564a1634e (GEOMESA-3061 Converters - support bytes in Avro top-level union types (#2762))
=======
>>>>>>> 238945d4b3 (GEOMESA-3061 Converters - support bytes in Avro top-level union types (#2762))
=======
>>>>>>> f73ef99f1e (GEOMESA-3176 Docs - fix download links in install instructions)
=======
>>>>>>> be05354746 (GEOMESA-3061 Converters - support bytes in Avro top-level union types (#2762))
=======
>>>>>>> bc4062951d (GEOMESA-3061 Converters - support bytes in Avro top-level union types (#2762))
=======
>>>>>>> e944f1c88b (Merge branch 'feature/postgis-fixes')
=======
>>>>>>> 8adfab65bb (GEOMESA-3061 Converters - support bytes in Avro top-level union types (#2762))
=======
>>>>>>> 235bc2820d (GEOMESA-3176 Docs - fix download links in install instructions)
=======
>>>>>>> 4a05f27ba4 (GEOMESA-3061 Converters - support bytes in Avro top-level union types (#2762))
=======
>>>>>>> 7b0539b808 (GEOMESA-3061 Converters - support bytes in Avro top-level union types (#2762))
=======
>>>>>>> 256a642cc1 (GEOMESA-3176 Docs - fix download links in install instructions)
=======
>>>>>>> aceaf3bd81 (GEOMESA-3061 Converters - support bytes in Avro top-level union types (#2762))
=======
>>>>>>> 0086b292ba (GEOMESA-3061 Converters - support bytes in Avro top-level union types (#2762))
=======
>>>>>>> 7efa8bf5c8 (GEOMESA-3176 Docs - fix download links in install instructions)
=======
>>>>>>> 93c8cf1b3a (GEOMESA-3061 Converters - support bytes in Avro top-level union types (#2762))
=======
>>>>>>> e15d50d7d3 (GEOMESA-3061 Converters - support bytes in Avro top-level union types (#2762))
=======
>>>>>>> 94efcf84c2 (GEOMESA-3176 Docs - fix download links in install instructions)
=======
>>>>>>> 8929cbff5b (GEOMESA-3061 Converters - support bytes in Avro top-level union types (#2762))
=======
>>>>>>> 8de43cccf6 (GEOMESA-3061 Converters - support bytes in Avro top-level union types (#2762))
=======
>>>>>>> 26e5afc4ea (Merge branch 'feature/postgis-fixes')
=======
>>>>>>> 63a045a753 (GEOMESA-3254 Add Bloop build support)
=======
>>>>>>> 12e3a588fc (GEOMESA-3061 Converters - support bytes in Avro top-level union types (#2762))
=======
>>>>>>> 93fa8c797f (GEOMESA-3176 Docs - fix download links in install instructions)
=======
>>>>>>> c82dea9d29 (GEOMESA-3061 Converters - support bytes in Avro top-level union types (#2762))
=======
>>>>>>> 1890b11217 (GEOMESA-3061 Converters - support bytes in Avro top-level union types (#2762))
=======
>>>>>>> 2142d07ded (GEOMESA-3176 Docs - fix download links in install instructions)
=======
>>>>>>> a398ab1183 (GEOMESA-3061 Converters - support bytes in Avro top-level union types (#2762))
=======
>>>>>>> 9c28193a91 (GEOMESA-3061 Converters - support bytes in Avro top-level union types (#2762))
=======
>>>>>>> a8d6366d72 (GEOMESA-3176 Docs - fix download links in install instructions)
=======
>>>>>>> 6f30a087ee (GEOMESA-3061 Converters - support bytes in Avro top-level union types (#2762))
=======
>>>>>>> d294ce49e2 (GEOMESA-3061 Converters - support bytes in Avro top-level union types (#2762))
=======
>>>>>>> b041fcc3eb (GEOMESA-3176 Docs - fix download links in install instructions)
=======
>>>>>>> 3acb47e615 (GEOMESA-3061 Converters - support bytes in Avro top-level union types (#2762))
=======
>>>>>>> 1df8328338 (GEOMESA-3061 Converters - support bytes in Avro top-level union types (#2762))
=======
>>>>>>> c69897d7bd (Merge branch 'feature/postgis-fixes')
=======
=======
>>>>>>> 3dd99aed4 (GEOMESA-3061 Converters - support bytes in Avro top-level union types (#2762))
=======
>>>>>>> 45ad5d11f (GEOMESA-3061 Converters - support bytes in Avro top-level union types (#2762))
=======
>>>>>>> baa90e85a (GEOMESA-3176 Docs - fix download links in install instructions)
=======
>>>>>>> 4524373ac (GEOMESA-3061 Converters - support bytes in Avro top-level union types (#2762))
=======
>>>>>>> dace2085b (GEOMESA-3061 Converters - support bytes in Avro top-level union types (#2762))
=======
>>>>>>> 46c05fed5 (GEOMESA-3176 Docs - fix download links in install instructions)
=======
=======
>>>>>>> 28e2bfa2d (GEOMESA-3061 Converters - support bytes in Avro top-level union types (#2762))
>>>>>>> 4fbe39c62 (GEOMESA-3061 Converters - support bytes in Avro top-level union types (#2762))
=======
>>>>>>> 90ec70f55 (GEOMESA-3176 Docs - fix download links in install instructions)
>>>>>>> 6a26990f7 (GEOMESA-3176 Docs - fix download links in install instructions)
>>>>>>> 0b36b46b5f (GEOMESA-3176 Docs - fix download links in install instructions)
=======
>>>>>>> 240977229 (GEOMESA-3061 Converters - support bytes in Avro top-level union types (#2762))
>>>>>>> 22dcc8170f (GEOMESA-3061 Converters - support bytes in Avro top-level union types (#2762))
<<<<<<< HEAD
<<<<<<< HEAD
>>>>>>> locatelli-main
=======
>>>>>>> locatelli-main
=======
>>>>>>> locatelli-main
=======
>>>>>>> 516fe7e9c (GEOMESA-3061 Converters - support bytes in Avro top-level union types (#2762))
=======
>>>>>>> e8cc4971c6 (Merge branch 'feature/postgis-fixes')
=======
>>>>>>> 81ee66102b (GEOMESA-3061 Converters - support bytes in Avro top-level union types (#2762))
=======
>>>>>>> bdcaf0ab5e (GEOMESA-3176 Docs - fix download links in install instructions)
=======
>>>>>>> f9f6fde40b (GEOMESA-3061 Converters - support bytes in Avro top-level union types (#2762))
=======
=======
=======
>>>>>>> 6a2cd10c1c (GEOMESA-3061 Converters - support bytes in Avro top-level union types (#2762))
=======
>>>>>>> 947761ec9b (GEOMESA-3061 Converters - support bytes in Avro top-level union types (#2762))
=======
>>>>>>> 4d9f87a514 (GEOMESA-3176 Docs - fix download links in install instructions)
=======
>>>>>>> 8a6a96234b (GEOMESA-3061 Converters - support bytes in Avro top-level union types (#2762))
=======
>>>>>>> c9328eddce (GEOMESA-3061 Converters - support bytes in Avro top-level union types (#2762))
=======
>>>>>>> bd3233180f (GEOMESA-3176 Docs - fix download links in install instructions)
=======
>>>>>>> 0c734cda2b (GEOMESA-3061 Converters - support bytes in Avro top-level union types (#2762))
=======
>>>>>>> d94c03a98e (GEOMESA-3061 Converters - support bytes in Avro top-level union types (#2762))
=======
>>>>>>> cb6bda89b6 (Merge branch 'feature/postgis-fixes')
=======
>>>>>>> 09d87762c5 (GEOMESA-3254 Add Bloop build support)
=======
>>>>>>> 67e4c1354f (GEOMESA-3061 Converters - support bytes in Avro top-level union types (#2762))
=======
>>>>>>> 703374130f (GEOMESA-3176 Docs - fix download links in install instructions)
=======
>>>>>>> 748532d2db (GEOMESA-3061 Converters - support bytes in Avro top-level union types (#2762))
=======
=======
=======
>>>>>>> 250f01786f (GEOMESA-3061 Converters - support bytes in Avro top-level union types (#2762))
=======
>>>>>>> 07161eaaa6 (GEOMESA-3061 Converters - support bytes in Avro top-level union types (#2762))
=======
>>>>>>> b42125fac1 (GEOMESA-3176 Docs - fix download links in install instructions)
=======
>>>>>>> 813488e18c (GEOMESA-3061 Converters - support bytes in Avro top-level union types (#2762))
=======
>>>>>>> 9abc630fdf (GEOMESA-3061 Converters - support bytes in Avro top-level union types (#2762))
=======
>>>>>>> 5c3f315bc0 (GEOMESA-3176 Docs - fix download links in install instructions)
=======
>>>>>>> fe51719bc6 (GEOMESA-3061 Converters - support bytes in Avro top-level union types (#2762))
=======
>>>>>>> 25063957fc (GEOMESA-3061 Converters - support bytes in Avro top-level union types (#2762))
=======
>>>>>>> 699117eca9 (Merge branch 'feature/postgis-fixes')
=======
=======
>>>>>>> 23c024179 (GEOMESA-3061 Converters - support bytes in Avro top-level union types (#2762))
=======
>>>>>>> a910ae135 (GEOMESA-3061 Converters - support bytes in Avro top-level union types (#2762))
=======
>>>>>>> 4b70e7f8f (GEOMESA-3176 Docs - fix download links in install instructions)
=======
>>>>>>> 85663f71c (GEOMESA-3061 Converters - support bytes in Avro top-level union types (#2762))
=======
>>>>>>> ad3cedc4d (GEOMESA-3061 Converters - support bytes in Avro top-level union types (#2762))
=======
>>>>>>> a12ea194c (GEOMESA-3176 Docs - fix download links in install instructions)
=======
=======
>>>>>>> 28e2bfa2d (GEOMESA-3061 Converters - support bytes in Avro top-level union types (#2762))
>>>>>>> d4c5768cf (GEOMESA-3061 Converters - support bytes in Avro top-level union types (#2762))
=======
>>>>>>> 90ec70f55 (GEOMESA-3176 Docs - fix download links in install instructions)
>>>>>>> 279de44d3 (GEOMESA-3176 Docs - fix download links in install instructions)
>>>>>>> b7c6b904be (GEOMESA-3176 Docs - fix download links in install instructions)
=======
>>>>>>> e6e1f4bdd (GEOMESA-3061 Converters - support bytes in Avro top-level union types (#2762))
>>>>>>> 8035cc5893 (GEOMESA-3061 Converters - support bytes in Avro top-level union types (#2762))
=======
=======
>>>>>>> 5f428db97 (GEOMESA-3061 Converters - support bytes in Avro top-level union types (#2762))
=======
>>>>>>> 76618c8da (GEOMESA-3061 Converters - support bytes in Avro top-level union types (#2762))
=======
>>>>>>> 0fbf9e83e (GEOMESA-3176 Docs - fix download links in install instructions)
=======
>>>>>>> 89bdd3013 (GEOMESA-3061 Converters - support bytes in Avro top-level union types (#2762))
=======
>>>>>>> c8a325e13 (GEOMESA-3061 Converters - support bytes in Avro top-level union types (#2762))
=======
>>>>>>> f9e8439b0 (GEOMESA-3176 Docs - fix download links in install instructions)
=======
=======
>>>>>>> 28e2bfa2d (GEOMESA-3061 Converters - support bytes in Avro top-level union types (#2762))
>>>>>>> 72bafaf54 (GEOMESA-3061 Converters - support bytes in Avro top-level union types (#2762))
=======
>>>>>>> 90ec70f55 (GEOMESA-3176 Docs - fix download links in install instructions)
>>>>>>> 8cbe155de (GEOMESA-3176 Docs - fix download links in install instructions)
>>>>>>> 8150bc0e65 (GEOMESA-3176 Docs - fix download links in install instructions)
=======
>>>>>>> 9d708b240 (GEOMESA-3061 Converters - support bytes in Avro top-level union types (#2762))
>>>>>>> 53a3e72cbf (GEOMESA-3061 Converters - support bytes in Avro top-level union types (#2762))
=======
>>>>>>> 97ec7d864 (GEOMESA-3061 Converters - support bytes in Avro top-level union types (#2762))
=======
>>>>>>> db8d998aa (Merge branch 'feature/postgis-fixes')
=======
>>>>>>> bdbced26d (GEOMESA-3061 Converters - support bytes in Avro top-level union types (#2762))
=======
>>>>>>> 1b25d7ddb (Merge branch 'feature/postgis-fixes')
=======
<<<<<<< HEAD
<<<<<<< HEAD
<<<<<<< HEAD
<<<<<<< HEAD
=======
=======
<<<<<<< HEAD
>>>>>>> locatelli-main
=======
=======
<<<<<<< HEAD
>>>>>>> locatelli-main
=======
=======
<<<<<<< HEAD
>>>>>>> locatelli-main
<<<<<<< HEAD
>>>>>>> locationtech-main
=======
>>>>>>> 498d1c9c26 (GEOMESA-3061 Converters - support bytes in Avro top-level union types (#2762))
=======
>>>>>>> 64eaf6b132 (Merge branch 'feature/postgis-fixes')
=======
<<<<<<< HEAD
<<<<<<< HEAD
<<<<<<< HEAD
=======
=======
>>>>>>> locatelli-main
=======
>>>>>>> locatelli-main
>>>>>>> 498d1c9c26 (GEOMESA-3061 Converters - support bytes in Avro top-level union types (#2762))
=======
>>>>>>> 64eaf6b132 (Merge branch 'feature/postgis-fixes')
=======
<<<<<<< HEAD
<<<<<<< HEAD
>>>>>>> locatelli-main
=======
>>>>>>> locatelli-main
=======
>>>>>>> locatelli-main
>>>>>>> 28e2bfa2d (GEOMESA-3061 Converters - support bytes in Avro top-level union types (#2762))
=======
>>>>>>> f2943650ff (GEOMESA-3176 Docs - fix download links in install instructions)
=======
=======
>>>>>>> 28e2bfa2d (GEOMESA-3061 Converters - support bytes in Avro top-level union types (#2762))
>>>>>>> 86dd18aa73 (GEOMESA-3061 Converters - support bytes in Avro top-level union types (#2762))
=======
>>>>>>> 90ec70f55 (GEOMESA-3176 Docs - fix download links in install instructions)
=======
<<<<<<< HEAD
<<<<<<< HEAD
<<<<<<< HEAD
=======
>>>>>>> d7ba054c6c (GEOMESA-3176 Docs - fix download links in install instructions)
>>>>>>> locatelli-main
=======
>>>>>>> d7ba054c6c (GEOMESA-3176 Docs - fix download links in install instructions)
>>>>>>> locatelli-main
=======
>>>>>>> d7ba054c6c (GEOMESA-3176 Docs - fix download links in install instructions)
>>>>>>> locatelli-main
>>>>>>> 2586fa6a40 (GEOMESA-3061 Converters - support bytes in Avro top-level union types (#2762))
=======
>>>>>>> bdbced26d4 (GEOMESA-3061 Converters - support bytes in Avro top-level union types (#2762))
=======
>>>>>>> 1b25d7ddb4 (Merge branch 'feature/postgis-fixes')
=======
>>>>>>> 0dbede148d (GEOMESA-3061 Converters - support bytes in Avro top-level union types (#2762))
=======
>>>>>>> 71c56e6b77 (GEOMESA-3176 Docs - fix download links in install instructions)
=======
>>>>>>> e27137ff78 (GEOMESA-3061 Converters - support bytes in Avro top-level union types (#2762))
=======
=======
=======
>>>>>>> dddc42e265 (GEOMESA-3061 Converters - support bytes in Avro top-level union types (#2762))
=======
>>>>>>> b009fd23f4 (GEOMESA-3061 Converters - support bytes in Avro top-level union types (#2762))
=======
>>>>>>> d969b4c2d5 (GEOMESA-3176 Docs - fix download links in install instructions)
=======
>>>>>>> 4564a1634e (GEOMESA-3061 Converters - support bytes in Avro top-level union types (#2762))
=======
>>>>>>> 238945d4b3 (GEOMESA-3061 Converters - support bytes in Avro top-level union types (#2762))
=======
>>>>>>> f73ef99f1e (GEOMESA-3176 Docs - fix download links in install instructions)
=======
>>>>>>> be05354746 (GEOMESA-3061 Converters - support bytes in Avro top-level union types (#2762))
=======
>>>>>>> bc4062951d (GEOMESA-3061 Converters - support bytes in Avro top-level union types (#2762))
=======
>>>>>>> e944f1c88b (Merge branch 'feature/postgis-fixes')
=======
>>>>>>> 8adfab65bb (GEOMESA-3061 Converters - support bytes in Avro top-level union types (#2762))
=======
>>>>>>> 235bc2820d (GEOMESA-3176 Docs - fix download links in install instructions)
=======
>>>>>>> 4a05f27ba4 (GEOMESA-3061 Converters - support bytes in Avro top-level union types (#2762))
=======
>>>>>>> 7b0539b808 (GEOMESA-3061 Converters - support bytes in Avro top-level union types (#2762))
=======
>>>>>>> 256a642cc1 (GEOMESA-3176 Docs - fix download links in install instructions)
=======
>>>>>>> aceaf3bd81 (GEOMESA-3061 Converters - support bytes in Avro top-level union types (#2762))
=======
>>>>>>> 0086b292ba (GEOMESA-3061 Converters - support bytes in Avro top-level union types (#2762))
=======
>>>>>>> 7efa8bf5c8 (GEOMESA-3176 Docs - fix download links in install instructions)
=======
>>>>>>> 93c8cf1b3a (GEOMESA-3061 Converters - support bytes in Avro top-level union types (#2762))
=======
>>>>>>> e15d50d7d3 (GEOMESA-3061 Converters - support bytes in Avro top-level union types (#2762))
=======
>>>>>>> 94efcf84c2 (GEOMESA-3176 Docs - fix download links in install instructions)
=======
>>>>>>> 8929cbff5b (GEOMESA-3061 Converters - support bytes in Avro top-level union types (#2762))
=======
>>>>>>> 8de43cccf6 (GEOMESA-3061 Converters - support bytes in Avro top-level union types (#2762))
=======
>>>>>>> 26e5afc4ea (Merge branch 'feature/postgis-fixes')
=======
>>>>>>> 63a045a753 (GEOMESA-3254 Add Bloop build support)
=======
>>>>>>> 12e3a588fc (GEOMESA-3061 Converters - support bytes in Avro top-level union types (#2762))
=======
>>>>>>> 93fa8c797f (GEOMESA-3176 Docs - fix download links in install instructions)
=======
>>>>>>> c82dea9d29 (GEOMESA-3061 Converters - support bytes in Avro top-level union types (#2762))
=======
>>>>>>> 1890b11217 (GEOMESA-3061 Converters - support bytes in Avro top-level union types (#2762))
=======
>>>>>>> 2142d07ded (GEOMESA-3176 Docs - fix download links in install instructions)
=======
>>>>>>> a398ab1183 (GEOMESA-3061 Converters - support bytes in Avro top-level union types (#2762))
=======
>>>>>>> 9c28193a91 (GEOMESA-3061 Converters - support bytes in Avro top-level union types (#2762))
=======
>>>>>>> a8d6366d72 (GEOMESA-3176 Docs - fix download links in install instructions)
=======
>>>>>>> 6f30a087ee (GEOMESA-3061 Converters - support bytes in Avro top-level union types (#2762))
=======
>>>>>>> d294ce49e2 (GEOMESA-3061 Converters - support bytes in Avro top-level union types (#2762))
=======
>>>>>>> b041fcc3eb (GEOMESA-3176 Docs - fix download links in install instructions)
=======
>>>>>>> 3acb47e615 (GEOMESA-3061 Converters - support bytes in Avro top-level union types (#2762))
=======
>>>>>>> 1df8328338 (GEOMESA-3061 Converters - support bytes in Avro top-level union types (#2762))
=======
>>>>>>> c69897d7bd (Merge branch 'feature/postgis-fixes')
=======
=======
>>>>>>> 3dd99aed4 (GEOMESA-3061 Converters - support bytes in Avro top-level union types (#2762))
=======
>>>>>>> 45ad5d11f (GEOMESA-3061 Converters - support bytes in Avro top-level union types (#2762))
=======
>>>>>>> baa90e85a (GEOMESA-3176 Docs - fix download links in install instructions)
=======
>>>>>>> 4524373ac (GEOMESA-3061 Converters - support bytes in Avro top-level union types (#2762))
=======
>>>>>>> dace2085b (GEOMESA-3061 Converters - support bytes in Avro top-level union types (#2762))
=======
>>>>>>> 46c05fed5 (GEOMESA-3176 Docs - fix download links in install instructions)
=======
=======
>>>>>>> 28e2bfa2d (GEOMESA-3061 Converters - support bytes in Avro top-level union types (#2762))
>>>>>>> 4fbe39c62 (GEOMESA-3061 Converters - support bytes in Avro top-level union types (#2762))
=======
>>>>>>> 90ec70f55 (GEOMESA-3176 Docs - fix download links in install instructions)
>>>>>>> 6a26990f7 (GEOMESA-3176 Docs - fix download links in install instructions)
>>>>>>> 0b36b46b5f (GEOMESA-3176 Docs - fix download links in install instructions)
=======
>>>>>>> 240977229 (GEOMESA-3061 Converters - support bytes in Avro top-level union types (#2762))
>>>>>>> 22dcc8170f (GEOMESA-3061 Converters - support bytes in Avro top-level union types (#2762))
=======
>>>>>>> 516fe7e9c (GEOMESA-3061 Converters - support bytes in Avro top-level union types (#2762))
=======
>>>>>>> e8cc4971c6 (Merge branch 'feature/postgis-fixes')
=======
>>>>>>> 81ee66102b (GEOMESA-3061 Converters - support bytes in Avro top-level union types (#2762))
=======
>>>>>>> bdcaf0ab5e (GEOMESA-3176 Docs - fix download links in install instructions)
=======
>>>>>>> f9f6fde40b (GEOMESA-3061 Converters - support bytes in Avro top-level union types (#2762))
=======
=======
=======
>>>>>>> 6a2cd10c1c (GEOMESA-3061 Converters - support bytes in Avro top-level union types (#2762))
=======
>>>>>>> 947761ec9b (GEOMESA-3061 Converters - support bytes in Avro top-level union types (#2762))
=======
>>>>>>> 4d9f87a514 (GEOMESA-3176 Docs - fix download links in install instructions)
=======
>>>>>>> 8a6a96234b (GEOMESA-3061 Converters - support bytes in Avro top-level union types (#2762))
=======
>>>>>>> c9328eddce (GEOMESA-3061 Converters - support bytes in Avro top-level union types (#2762))
=======
>>>>>>> bd3233180f (GEOMESA-3176 Docs - fix download links in install instructions)
=======
>>>>>>> 0c734cda2b (GEOMESA-3061 Converters - support bytes in Avro top-level union types (#2762))
=======
>>>>>>> d94c03a98e (GEOMESA-3061 Converters - support bytes in Avro top-level union types (#2762))
=======
>>>>>>> cb6bda89b6 (Merge branch 'feature/postgis-fixes')
=======
>>>>>>> 09d87762c5 (GEOMESA-3254 Add Bloop build support)
=======
>>>>>>> 67e4c1354f (GEOMESA-3061 Converters - support bytes in Avro top-level union types (#2762))
=======
>>>>>>> 703374130f (GEOMESA-3176 Docs - fix download links in install instructions)
=======
>>>>>>> 748532d2db (GEOMESA-3061 Converters - support bytes in Avro top-level union types (#2762))
=======
=======
=======
>>>>>>> 250f01786f (GEOMESA-3061 Converters - support bytes in Avro top-level union types (#2762))
=======
>>>>>>> 07161eaaa6 (GEOMESA-3061 Converters - support bytes in Avro top-level union types (#2762))
=======
>>>>>>> b42125fac1 (GEOMESA-3176 Docs - fix download links in install instructions)
=======
>>>>>>> 813488e18c (GEOMESA-3061 Converters - support bytes in Avro top-level union types (#2762))
=======
>>>>>>> 9abc630fdf (GEOMESA-3061 Converters - support bytes in Avro top-level union types (#2762))
=======
>>>>>>> 5c3f315bc0 (GEOMESA-3176 Docs - fix download links in install instructions)
=======
>>>>>>> fe51719bc6 (GEOMESA-3061 Converters - support bytes in Avro top-level union types (#2762))
=======
>>>>>>> 25063957fc (GEOMESA-3061 Converters - support bytes in Avro top-level union types (#2762))
=======
>>>>>>> 699117eca9 (Merge branch 'feature/postgis-fixes')
=======
=======
>>>>>>> 23c024179 (GEOMESA-3061 Converters - support bytes in Avro top-level union types (#2762))
=======
>>>>>>> a910ae135 (GEOMESA-3061 Converters - support bytes in Avro top-level union types (#2762))
=======
>>>>>>> 4b70e7f8f (GEOMESA-3176 Docs - fix download links in install instructions)
=======
>>>>>>> 85663f71c (GEOMESA-3061 Converters - support bytes in Avro top-level union types (#2762))
=======
>>>>>>> ad3cedc4d (GEOMESA-3061 Converters - support bytes in Avro top-level union types (#2762))
=======
>>>>>>> a12ea194c (GEOMESA-3176 Docs - fix download links in install instructions)
=======
=======
>>>>>>> 28e2bfa2d (GEOMESA-3061 Converters - support bytes in Avro top-level union types (#2762))
>>>>>>> d4c5768cf (GEOMESA-3061 Converters - support bytes in Avro top-level union types (#2762))
=======
>>>>>>> 90ec70f55 (GEOMESA-3176 Docs - fix download links in install instructions)
>>>>>>> 279de44d3 (GEOMESA-3176 Docs - fix download links in install instructions)
>>>>>>> b7c6b904be (GEOMESA-3176 Docs - fix download links in install instructions)
=======
>>>>>>> e6e1f4bdd (GEOMESA-3061 Converters - support bytes in Avro top-level union types (#2762))
>>>>>>> 8035cc5893 (GEOMESA-3061 Converters - support bytes in Avro top-level union types (#2762))
=======
=======
>>>>>>> 5f428db97 (GEOMESA-3061 Converters - support bytes in Avro top-level union types (#2762))
=======
>>>>>>> 76618c8da (GEOMESA-3061 Converters - support bytes in Avro top-level union types (#2762))
=======
>>>>>>> 0fbf9e83e (GEOMESA-3176 Docs - fix download links in install instructions)
=======
>>>>>>> 89bdd3013 (GEOMESA-3061 Converters - support bytes in Avro top-level union types (#2762))
=======
>>>>>>> c8a325e13 (GEOMESA-3061 Converters - support bytes in Avro top-level union types (#2762))
=======
>>>>>>> f9e8439b0 (GEOMESA-3176 Docs - fix download links in install instructions)
=======
=======
>>>>>>> 28e2bfa2d (GEOMESA-3061 Converters - support bytes in Avro top-level union types (#2762))
>>>>>>> 72bafaf54 (GEOMESA-3061 Converters - support bytes in Avro top-level union types (#2762))
=======
>>>>>>> 90ec70f55 (GEOMESA-3176 Docs - fix download links in install instructions)
>>>>>>> 8cbe155de (GEOMESA-3176 Docs - fix download links in install instructions)
>>>>>>> 8150bc0e65 (GEOMESA-3176 Docs - fix download links in install instructions)
=======
>>>>>>> 9d708b240 (GEOMESA-3061 Converters - support bytes in Avro top-level union types (#2762))
>>>>>>> 53a3e72cbf (GEOMESA-3061 Converters - support bytes in Avro top-level union types (#2762))
=======
>>>>>>> 97ec7d864 (GEOMESA-3061 Converters - support bytes in Avro top-level union types (#2762))
=======
>>>>>>> db8d998aa (Merge branch 'feature/postgis-fixes')
=======
>>>>>>> bdbced26d (GEOMESA-3061 Converters - support bytes in Avro top-level union types (#2762))
=======
>>>>>>> 1b25d7ddb (Merge branch 'feature/postgis-fixes')
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
>>>>>>> 28e2bfa2d (GEOMESA-3061 Converters - support bytes in Avro top-level union types (#2762))
>>>>>>> d4c5768cfa (GEOMESA-3061 Converters - support bytes in Avro top-level union types (#2762))
=======
<<<<<<< HEAD
<<<<<<< HEAD
<<<<<<< HEAD
<<<<<<< HEAD
=======
<<<<<<< HEAD
=======
<<<<<<< HEAD
=======
>>>>>>> locatelli-main
<<<<<<< HEAD
<<<<<<< HEAD
=======
>>>>>>> d329320e6a (GEOMESA-3061 Converters - support bytes in Avro top-level union types (#2762))
<<<<<<< HEAD
>>>>>>> locatelli-main
=======
>>>>>>> locatelli-main
=======
<<<<<<< HEAD
=======
>>>>>>> d329320e6a (GEOMESA-3061 Converters - support bytes in Avro top-level union types (#2762))
>>>>>>> locatelli-main
=======
>>>>>>> 449fb2085b (GEOMESA-3176 Docs - fix download links in install instructions)
=======
=======
=======
=======
>>>>>>> 23c0241798 (GEOMESA-3061 Converters - support bytes in Avro top-level union types (#2762))
=======
>>>>>>> 9d1506029d (GEOMESA-3061 Converters - support bytes in Avro top-level union types (#2762))
<<<<<<< HEAD
<<<<<<< HEAD
=======
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
>>>>>>> 92674ff9d4 (GEOMESA-3061 Converters - support bytes in Avro top-level union types (#2762))
=======
>>>>>>> 4b70e7f8fb (GEOMESA-3176 Docs - fix download links in install instructions)
=======
>>>>>>> bc622ff59f (GEOMESA-3176 Docs - fix download links in install instructions)
<<<<<<< HEAD
<<<<<<< HEAD
=======
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
>>>>>>> 7ec7e43c91 (GEOMESA-3061 Converters - support bytes in Avro top-level union types (#2762))
=======
>>>>>>> ad3cedc4db (GEOMESA-3061 Converters - support bytes in Avro top-level union types (#2762))
=======
>>>>>>> 9a4dff9e4f (GEOMESA-3061 Converters - support bytes in Avro top-level union types (#2762))
<<<<<<< HEAD
<<<<<<< HEAD
=======
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
>>>>>>> 1cc4dadf2e (GEOMESA-3176 Docs - fix download links in install instructions)
=======
>>>>>>> 2586fa6a40 (GEOMESA-3061 Converters - support bytes in Avro top-level union types (#2762))
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
=======
=======
>>>>>>> dc2038e108 (GEOMESA-3176 Docs - fix download links in install instructions)
=======
=======
=======
>>>>>>> 23c0241798 (GEOMESA-3061 Converters - support bytes in Avro top-level union types (#2762))
=======
>>>>>>> 07e2884d79 (GEOMESA-3061 Converters - support bytes in Avro top-level union types (#2762))
=======
>>>>>>> 4ccd6f6b1f (GEOMESA-3061 Converters - support bytes in Avro top-level union types (#2762))
=======
>>>>>>> 4b70e7f8fb (GEOMESA-3176 Docs - fix download links in install instructions)
=======
>>>>>>> 4431c091e2 (GEOMESA-3176 Docs - fix download links in install instructions)
=======
>>>>>>> d6730faea6 (GEOMESA-3061 Converters - support bytes in Avro top-level union types (#2762))
=======
>>>>>>> ad3cedc4db (GEOMESA-3061 Converters - support bytes in Avro top-level union types (#2762))
=======
>>>>>>> 35b69b8f2f (GEOMESA-3061 Converters - support bytes in Avro top-level union types (#2762))
=======
>>>>>>> 312769c8d4 (GEOMESA-3176 Docs - fix download links in install instructions)
=======
>>>>>>> 3382f42b39 (GEOMESA-3061 Converters - support bytes in Avro top-level union types (#2762))
=======
=======
>>>>>>> 449fb2085b (GEOMESA-3176 Docs - fix download links in install instructions)
=======
>>>>>>> 5fa9f37061 (GEOMESA-3176 Docs - fix download links in install instructions)
=======
>>>>>>> b2177e9015 (GEOMESA-3061 Converters - support bytes in Avro top-level union types (#2762))
=======
=======
>>>>>>> 92674ff9d4 (GEOMESA-3061 Converters - support bytes in Avro top-level union types (#2762))
>>>>>>> 009a284072 (GEOMESA-3061 Converters - support bytes in Avro top-level union types (#2762))
=======
>>>>>>> 955de6bfcc (GEOMESA-3176 Docs - fix download links in install instructions)
=======
=======
>>>>>>> 7ec7e43c91 (GEOMESA-3061 Converters - support bytes in Avro top-level union types (#2762))
>>>>>>> 897de97047 (GEOMESA-3061 Converters - support bytes in Avro top-level union types (#2762))
=======
>>>>>>> 7b8c8dcc3d (GEOMESA-3061 Converters - support bytes in Avro top-level union types (#2762))
=======
=======
>>>>>>> 1cc4dadf2e (GEOMESA-3176 Docs - fix download links in install instructions)
>>>>>>> 057f644239 (GEOMESA-3176 Docs - fix download links in install instructions)
=======
>>>>>>> d329320e6a (GEOMESA-3061 Converters - support bytes in Avro top-level union types (#2762))
<<<<<<< HEAD
<<<<<<< HEAD
>>>>>>> locatelli-main
=======
>>>>>>> locatelli-main
=======
>>>>>>> locatelli-main
>>>>>>> 90ec70f55 (GEOMESA-3176 Docs - fix download links in install instructions)
>>>>>>> 279de44d3f (GEOMESA-3176 Docs - fix download links in install instructions)
=======
>>>>>>> e6e1f4bdd5 (GEOMESA-3061 Converters - support bytes in Avro top-level union types (#2762))
=======
<<<<<<< HEAD
<<<<<<< HEAD
<<<<<<< HEAD
<<<<<<< HEAD
=======
>>>>>>> 983d0b0983 (GEOMESA-3176 Docs - fix download links in install instructions)
=======
=======
=======
>>>>>>> locatelli-main
=======
>>>>>>> locatelli-main
>>>>>>> 983d0b0983 (GEOMESA-3176 Docs - fix download links in install instructions)
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
>>>>>>> 30cd5ab927 (GEOMESA-3061 Converters - support bytes in Avro top-level union types (#2762))
=======
>>>>>>> d1fa26b39d (GEOMESA-3061 Converters - support bytes in Avro top-level union types (#2762))
=======
<<<<<<< HEAD
<<<<<<< HEAD
<<<<<<< HEAD
=======
<<<<<<< HEAD
<<<<<<< HEAD
>>>>>>> locatelli-main
=======
<<<<<<< HEAD
>>>>>>> locatelli-main
=======
>>>>>>> locatelli-main
>>>>>>> 610d4a0e13 (GEOMESA-3176 Docs - fix download links in install instructions)
=======
>>>>>>> ffe4f9fd41 (GEOMESA-3061 Converters - support bytes in Avro top-level union types (#2762))
=======
<<<<<<< HEAD
<<<<<<< HEAD
<<<<<<< HEAD
=======
<<<<<<< HEAD
<<<<<<< HEAD
>>>>>>> locatelli-main
=======
<<<<<<< HEAD
>>>>>>> locatelli-main
=======
>>>>>>> locatelli-main
>>>>>>> f67dd3371e (GEOMESA-3061 Converters - support bytes in Avro top-level union types (#2762))
=======
>>>>>>> d25af58f86 (GEOMESA-3176 Docs - fix download links in install instructions)
=======
<<<<<<< HEAD
<<<<<<< HEAD
<<<<<<< HEAD
=======
<<<<<<< HEAD
<<<<<<< HEAD
>>>>>>> locatelli-main
=======
<<<<<<< HEAD
>>>>>>> locatelli-main
=======
>>>>>>> locatelli-main
>>>>>>> ecddd8c3e7 (GEOMESA-3061 Converters - support bytes in Avro top-level union types (#2762))
=======
>>>>>>> f7cef54062 (GEOMESA-3061 Converters - support bytes in Avro top-level union types (#2762))
=======
<<<<<<< HEAD
<<<<<<< HEAD
<<<<<<< HEAD
=======
<<<<<<< HEAD
<<<<<<< HEAD
>>>>>>> locatelli-main
=======
<<<<<<< HEAD
>>>>>>> locatelli-main
=======
>>>>>>> locatelli-main
>>>>>>> 9c39003417 (GEOMESA-3176 Docs - fix download links in install instructions)
=======
>>>>>>> 036a470d76 (GEOMESA-3061 Converters - support bytes in Avro top-level union types (#2762))
=======
<<<<<<< HEAD
<<<<<<< HEAD
<<<<<<< HEAD
=======
<<<<<<< HEAD
<<<<<<< HEAD
>>>>>>> locatelli-main
=======
<<<<<<< HEAD
>>>>>>> locatelli-main
=======
>>>>>>> locatelli-main
>>>>>>> a16b64a4d1 (GEOMESA-3061 Converters - support bytes in Avro top-level union types (#2762))
=======
>>>>>>> 34472778d3 (Merge branch 'feature/postgis-fixes')
=======
<<<<<<< HEAD
<<<<<<< HEAD
<<<<<<< HEAD
=======
<<<<<<< HEAD
<<<<<<< HEAD
>>>>>>> locatelli-main
=======
<<<<<<< HEAD
>>>>>>> locatelli-main
=======
>>>>>>> locatelli-main
>>>>>>> 810876750d (GEOMESA-3061 Converters - support bytes in Avro top-level union types (#2762))
=======
>>>>>>> 419e2b9752 (GEOMESA-3176 Docs - fix download links in install instructions)
=======
<<<<<<< HEAD
<<<<<<< HEAD
<<<<<<< HEAD
=======
<<<<<<< HEAD
<<<<<<< HEAD
>>>>>>> locatelli-main
=======
<<<<<<< HEAD
>>>>>>> locatelli-main
=======
>>>>>>> locatelli-main
>>>>>>> 269558cf9e (GEOMESA-3061 Converters - support bytes in Avro top-level union types (#2762))
=======
>>>>>>> d206a68a13 (GEOMESA-3061 Converters - support bytes in Avro top-level union types (#2762))
=======
<<<<<<< HEAD
<<<<<<< HEAD
<<<<<<< HEAD
=======
<<<<<<< HEAD
<<<<<<< HEAD
>>>>>>> locatelli-main
=======
<<<<<<< HEAD
>>>>>>> locatelli-main
=======
>>>>>>> locatelli-main
>>>>>>> 3b4f3da2e1 (GEOMESA-3176 Docs - fix download links in install instructions)
=======
>>>>>>> ad7067b815 (GEOMESA-3061 Converters - support bytes in Avro top-level union types (#2762))
=======
<<<<<<< HEAD
<<<<<<< HEAD
<<<<<<< HEAD
=======
<<<<<<< HEAD
<<<<<<< HEAD
>>>>>>> locatelli-main
=======
<<<<<<< HEAD
>>>>>>> locatelli-main
=======
>>>>>>> locatelli-main
>>>>>>> 694bcd3776 (GEOMESA-3061 Converters - support bytes in Avro top-level union types (#2762))
=======
>>>>>>> 17c1f8a18c (GEOMESA-3176 Docs - fix download links in install instructions)
=======
<<<<<<< HEAD
<<<<<<< HEAD
<<<<<<< HEAD
=======
<<<<<<< HEAD
<<<<<<< HEAD
>>>>>>> locatelli-main
=======
<<<<<<< HEAD
>>>>>>> locatelli-main
=======
>>>>>>> locatelli-main
>>>>>>> e3976d40bc (GEOMESA-3061 Converters - support bytes in Avro top-level union types (#2762))
=======
>>>>>>> 6cd1151639 (GEOMESA-3061 Converters - support bytes in Avro top-level union types (#2762))
=======
<<<<<<< HEAD
<<<<<<< HEAD
<<<<<<< HEAD
=======
<<<<<<< HEAD
<<<<<<< HEAD
>>>>>>> locatelli-main
=======
<<<<<<< HEAD
>>>>>>> locatelli-main
=======
>>>>>>> locatelli-main
>>>>>>> 82d93995e4 (GEOMESA-3176 Docs - fix download links in install instructions)
=======
>>>>>>> 7dfac253b4 (GEOMESA-3061 Converters - support bytes in Avro top-level union types (#2762))
=======
<<<<<<< HEAD
<<<<<<< HEAD
<<<<<<< HEAD
=======
<<<<<<< HEAD
<<<<<<< HEAD
>>>>>>> locatelli-main
=======
<<<<<<< HEAD
>>>>>>> locatelli-main
=======
>>>>>>> locatelli-main
>>>>>>> 1973f72e77 (GEOMESA-3061 Converters - support bytes in Avro top-level union types (#2762))
=======
>>>>>>> 42e8565e9b (Merge branch 'feature/postgis-fixes')
=======
<<<<<<< HEAD
<<<<<<< HEAD
<<<<<<< HEAD
=======
<<<<<<< HEAD
<<<<<<< HEAD
>>>>>>> locatelli-main
=======
<<<<<<< HEAD
>>>>>>> locatelli-main
=======
>>>>>>> locatelli-main
>>>>>>> f1532f2313 (GEOMESA-3254 Add Bloop build support)
=======
>>>>>>> 96d5d442fa (GEOMESA-3061 Converters - support bytes in Avro top-level union types (#2762))
=======
<<<<<<< HEAD
<<<<<<< HEAD
<<<<<<< HEAD
=======
<<<<<<< HEAD
<<<<<<< HEAD
>>>>>>> locatelli-main
=======
<<<<<<< HEAD
>>>>>>> locatelli-main
=======
>>>>>>> locatelli-main
>>>>>>> 86bc039842 (GEOMESA-3176 Docs - fix download links in install instructions)
=======
>>>>>>> 6150564577 (GEOMESA-3061 Converters - support bytes in Avro top-level union types (#2762))
=======
<<<<<<< HEAD
<<<<<<< HEAD
=======
<<<<<<< HEAD
<<<<<<< HEAD
<<<<<<< HEAD
=======
>>>>>>> 60b4637548 (GEOMESA-3061 Converters - support bytes in Avro top-level union types (#2762))
>>>>>>> locatelli-main
=======
<<<<<<< HEAD
=======
>>>>>>> 60b4637548 (GEOMESA-3061 Converters - support bytes in Avro top-level union types (#2762))
>>>>>>> locatelli-main
=======
>>>>>>> 60b4637548 (GEOMESA-3061 Converters - support bytes in Avro top-level union types (#2762))
>>>>>>> locatelli-main
=======
>>>>>>> e6e1f4bdd5 (GEOMESA-3061 Converters - support bytes in Avro top-level union types (#2762))
>>>>>>> 5dcf23da52 (GEOMESA-3061 Converters - support bytes in Avro top-level union types (#2762))
=======
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
>>>>>>> d13d2eab26 (GEOMESA-3176 Docs - fix download links in install instructions)
=======
>>>>>>> c7403e8a5f (GEOMESA-3061 Converters - support bytes in Avro top-level union types (#2762))
=======
>>>>>>> 7bdbfa5524 (GEOMESA-3061 Converters - support bytes in Avro top-level union types (#2762))
=======
>>>>>>> 31ac28fff4 (GEOMESA-3176 Docs - fix download links in install instructions)
=======
>>>>>>> 4ac5af223d (GEOMESA-3061 Converters - support bytes in Avro top-level union types (#2762))
=======
>>>>>>> 7bff4d0018 (GEOMESA-3061 Converters - support bytes in Avro top-level union types (#2762))
=======
>>>>>>> 26bf3ffae4 (GEOMESA-3176 Docs - fix download links in install instructions)
=======
>>>>>>> 62a28bf2e7 (GEOMESA-3061 Converters - support bytes in Avro top-level union types (#2762))
=======
>>>>>>> e8b736ee96 (GEOMESA-3061 Converters - support bytes in Avro top-level union types (#2762))
=======
>>>>>>> 42adcd38ba (GEOMESA-3176 Docs - fix download links in install instructions)
=======
>>>>>>> 72919d0f84 (GEOMESA-3061 Converters - support bytes in Avro top-level union types (#2762))
=======
>>>>>>> 0efbfe547e (GEOMESA-3061 Converters - support bytes in Avro top-level union types (#2762))
=======
>>>>>>> 4c41429da9 (Merge branch 'feature/postgis-fixes')
=======
>>>>>>> d498bef1ce (GEOMESA-3061 Converters - support bytes in Avro top-level union types (#2762))
=======
>>>>>>> f1fe65810a (GEOMESA-3176 Docs - fix download links in install instructions)
=======
>>>>>>> 64536d7b4a (GEOMESA-3061 Converters - support bytes in Avro top-level union types (#2762))
=======
>>>>>>> a5b160f47b (GEOMESA-3061 Converters - support bytes in Avro top-level union types (#2762))
=======
>>>>>>> 9b83a71a1e (GEOMESA-3176 Docs - fix download links in install instructions)
=======
>>>>>>> 107726440b (GEOMESA-3061 Converters - support bytes in Avro top-level union types (#2762))
=======
>>>>>>> 5cf31d21f3 (GEOMESA-3061 Converters - support bytes in Avro top-level union types (#2762))
=======
>>>>>>> 1ce7179e65 (GEOMESA-3176 Docs - fix download links in install instructions)
=======
>>>>>>> 211b96b2ed (GEOMESA-3061 Converters - support bytes in Avro top-level union types (#2762))
=======
>>>>>>> 94fecee1d8 (GEOMESA-3061 Converters - support bytes in Avro top-level union types (#2762))
=======
>>>>>>> 798faeb761 (GEOMESA-3176 Docs - fix download links in install instructions)
=======
>>>>>>> 7ca1082a3f (GEOMESA-3061 Converters - support bytes in Avro top-level union types (#2762))
=======
>>>>>>> 4599715c51 (d)
=======
>>>>>>> 6e0709aba8 (Merge branch 'feature/postgis-fixes')
=======
>>>>>>> 7a84c9d22d (GEOMESA-3254 Add Bloop build support)
=======
>>>>>>> 7fbbd56493 (GEOMESA-3061 Converters - support bytes in Avro top-level union types (#2762))
=======
>>>>>>> 165fb93a09 (GEOMESA-3176 Docs - fix download links in install instructions)
=======
>>>>>>> 930f10d338 (GEOMESA-3061 Converters - support bytes in Avro top-level union types (#2762))
=======
=======
>>>>>>> e6e1f4bdd5 (GEOMESA-3061 Converters - support bytes in Avro top-level union types (#2762))
>>>>>>> 3eb12f79a9 (GEOMESA-3061 Converters - support bytes in Avro top-level union types (#2762))
=======
=======
>>>>>>> 4fd46f4f99 (GEOMESA-3176 Docs - fix download links in install instructions)
=======
>>>>>>> 30cd5ab927 (GEOMESA-3061 Converters - support bytes in Avro top-level union types (#2762))
=======
>>>>>>> b8be7d30a1 (GEOMESA-3061 Converters - support bytes in Avro top-level union types (#2762))
=======
>>>>>>> e7d6b701c8 (GEOMESA-3061 Converters - support bytes in Avro top-level union types (#2762))
=======
>>>>>>> 610d4a0e13 (GEOMESA-3176 Docs - fix download links in install instructions)
=======
>>>>>>> 2de4be5460 (GEOMESA-3176 Docs - fix download links in install instructions)
=======
>>>>>>> 789f6eba49 (GEOMESA-3061 Converters - support bytes in Avro top-level union types (#2762))
=======
>>>>>>> f67dd3371e (GEOMESA-3061 Converters - support bytes in Avro top-level union types (#2762))
=======
>>>>>>> 95e52e061e (GEOMESA-3061 Converters - support bytes in Avro top-level union types (#2762))
=======
>>>>>>> 6f1e1da646 (GEOMESA-3176 Docs - fix download links in install instructions)
=======
>>>>>>> ecddd8c3e7 (GEOMESA-3061 Converters - support bytes in Avro top-level union types (#2762))
=======
>>>>>>> 4fc0f66d4f (GEOMESA-3061 Converters - support bytes in Avro top-level union types (#2762))
=======
>>>>>>> 988874c83e (GEOMESA-3061 Converters - support bytes in Avro top-level union types (#2762))
=======
>>>>>>> 9c39003417 (GEOMESA-3176 Docs - fix download links in install instructions)
=======
>>>>>>> ef8de676d3 (GEOMESA-3176 Docs - fix download links in install instructions)
=======
>>>>>>> 437d0aab1c (GEOMESA-3061 Converters - support bytes in Avro top-level union types (#2762))
=======
>>>>>>> a16b64a4d1 (GEOMESA-3061 Converters - support bytes in Avro top-level union types (#2762))
=======
>>>>>>> aea9fbe131 (GEOMESA-3061 Converters - support bytes in Avro top-level union types (#2762))
=======
>>>>>>> d581fa3e8f (Merge branch 'feature/postgis-fixes')
=======
>>>>>>> 810876750d (GEOMESA-3061 Converters - support bytes in Avro top-level union types (#2762))
=======
>>>>>>> 5a55bf9756 (GEOMESA-3061 Converters - support bytes in Avro top-level union types (#2762))
=======
>>>>>>> b68ae6197f (GEOMESA-3176 Docs - fix download links in install instructions)
=======
>>>>>>> 269558cf9e (GEOMESA-3061 Converters - support bytes in Avro top-level union types (#2762))
=======
>>>>>>> 23fc8cb805 (GEOMESA-3061 Converters - support bytes in Avro top-level union types (#2762))
=======
>>>>>>> e0c2527549 (GEOMESA-3061 Converters - support bytes in Avro top-level union types (#2762))
=======
>>>>>>> 3b4f3da2e1 (GEOMESA-3176 Docs - fix download links in install instructions)
=======
>>>>>>> b47097b7bb (GEOMESA-3176 Docs - fix download links in install instructions)
=======
>>>>>>> 99a32a726d (GEOMESA-3061 Converters - support bytes in Avro top-level union types (#2762))
=======
>>>>>>> 694bcd3776 (GEOMESA-3061 Converters - support bytes in Avro top-level union types (#2762))
=======
>>>>>>> cb5e2daf2b (GEOMESA-3061 Converters - support bytes in Avro top-level union types (#2762))
=======
>>>>>>> 95f020af8c (GEOMESA-3176 Docs - fix download links in install instructions)
=======
>>>>>>> e3976d40bc (GEOMESA-3061 Converters - support bytes in Avro top-level union types (#2762))
=======
>>>>>>> 02bb344987 (GEOMESA-3061 Converters - support bytes in Avro top-level union types (#2762))
=======
>>>>>>> 00e61f4b70 (GEOMESA-3061 Converters - support bytes in Avro top-level union types (#2762))
=======
>>>>>>> 82d93995e4 (GEOMESA-3176 Docs - fix download links in install instructions)
=======
>>>>>>> 26c7d06850 (GEOMESA-3176 Docs - fix download links in install instructions)
=======
>>>>>>> a512d6b917 (GEOMESA-3061 Converters - support bytes in Avro top-level union types (#2762))
=======
>>>>>>> 1973f72e77 (GEOMESA-3061 Converters - support bytes in Avro top-level union types (#2762))
=======
>>>>>>> 4864cfc581 (GEOMESA-3061 Converters - support bytes in Avro top-level union types (#2762))
=======
>>>>>>> 264c9fa240 (Merge branch 'feature/postgis-fixes')
=======
>>>>>>> f1532f2313 (GEOMESA-3254 Add Bloop build support)
=======
>>>>>>> c738f63bd9 (GEOMESA-3254 Add Bloop build support)
=======
>>>>>>> 3676d4e56a (GEOMESA-3061 Converters - support bytes in Avro top-level union types (#2762))
=======
>>>>>>> 86bc039842 (GEOMESA-3176 Docs - fix download links in install instructions)
=======
>>>>>>> 3f60902092 (GEOMESA-3176 Docs - fix download links in install instructions)
=======
>>>>>>> 8111fd4732 (GEOMESA-3061 Converters - support bytes in Avro top-level union types (#2762))
=======
>>>>>>> 60b4637548 (GEOMESA-3061 Converters - support bytes in Avro top-level union types (#2762))
<<<<<<< HEAD
<<<<<<< HEAD
>>>>>>> locatelli-main
=======
>>>>>>> locatelli-main
=======
>>>>>>> locatelli-main

>>>>>>> b9bdd406e3 (GEOMESA-3061 Converters - support bytes in Avro top-level union types (#2762))
=======
>>>>>>> 16b2e83f22 (GEOMESA-3176 Docs - fix download links in install instructions)
<<<<<<< HEAD
<<<<<<< HEAD
<<<<<<< HEAD
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
>>>>>>> 30cd5ab927 (GEOMESA-3061 Converters - support bytes in Avro top-level union types (#2762))
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
>>>>>>> 30cd5ab927 (GEOMESA-3061 Converters - support bytes in Avro top-level union types (#2762))
<<<<<<< HEAD
>>>>>>> locatelli-main
=======
>>>>>>> locatelli-main
=======
>>>>>>> c7403e8a5f (GEOMESA-3061 Converters - support bytes in Avro top-level union types (#2762))
=======
>>>>>>> 4fd46f4f99 (GEOMESA-3176 Docs - fix download links in install instructions)
=======
=======
>>>>>>> 30cd5ab927 (GEOMESA-3061 Converters - support bytes in Avro top-level union types (#2762))
>>>>>>> b8be7d30a1 (GEOMESA-3061 Converters - support bytes in Avro top-level union types (#2762))
<<<<<<< HEAD
<<<<<<< HEAD
>>>>>>> locatelli-main
=======
>>>>>>> locatelli-main
=======
>>>>>>> locatelli-main
=======
=======

>>>>>>> b9bdd406e (GEOMESA-3061 Converters - support bytes in Avro top-level union types (#2762))
>>>>>>> f71fa3c0e1 (GEOMESA-3061 Converters - support bytes in Avro top-level union types (#2762))
<<<<<<< HEAD
<<<<<<< HEAD
<<<<<<< HEAD
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
>>>>>>> d1fa26b39d (GEOMESA-3061 Converters - support bytes in Avro top-level union types (#2762))
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
>>>>>>> d1fa26b39d (GEOMESA-3061 Converters - support bytes in Avro top-level union types (#2762))
<<<<<<< HEAD
>>>>>>> locatelli-main
=======
>>>>>>> locatelli-main
=======
>>>>>>> 7bdbfa5524 (GEOMESA-3061 Converters - support bytes in Avro top-level union types (#2762))
=======
>>>>>>> b8be7d30a1 (GEOMESA-3061 Converters - support bytes in Avro top-level union types (#2762))
=======
=======
>>>>>>> d1fa26b39d (GEOMESA-3061 Converters - support bytes in Avro top-level union types (#2762))
>>>>>>> e7d6b701c8 (GEOMESA-3061 Converters - support bytes in Avro top-level union types (#2762))
<<<<<<< HEAD
<<<<<<< HEAD
>>>>>>> locatelli-main
=======
>>>>>>> locatelli-main
=======
>>>>>>> locatelli-main
=======
=======

>>>>>>> b9bdd406e (GEOMESA-3061 Converters - support bytes in Avro top-level union types (#2762))
>>>>>>> cdb4102515 (GEOMESA-3061 Converters - support bytes in Avro top-level union types (#2762))
<<<<<<< HEAD
<<<<<<< HEAD
<<<<<<< HEAD
<<<<<<< HEAD
=======
<<<<<<< HEAD
<<<<<<< HEAD
>>>>>>> locationtech-main
=======
<<<<<<< HEAD
=======
>>>>>>> locatelli-main
<<<<<<< HEAD
=======
>>>>>>> locatelli-main
<<<<<<< HEAD
<<<<<<< HEAD
<<<<<<< HEAD
=======
>>>>>>> e7d6b701c8 (GEOMESA-3061 Converters - support bytes in Avro top-level union types (#2762))
=======
>>>>>>> 2de4be5460 (GEOMESA-3176 Docs - fix download links in install instructions)
<<<<<<< HEAD
<<<<<<< HEAD
>>>>>>> locatelli-main
=======
>>>>>>> locatelli-main
=======
>>>>>>> locatelli-main
=======
=======
>>>>>>> 6eb31fb652 (GEOMESA-3061 Converters - support bytes in Avro top-level union types (#2762))
=======
>>>>>>> 07a6a5c291 (GEOMESA-3061 Converters - support bytes in Avro top-level union types (#2762))
=======
>>>>>>> 67b361c856 (GEOMESA-3061 Converters - support bytes in Avro top-level union types (#2762))
=======
=======
>>>>>>> 28e2bfa2dc (GEOMESA-3061 Converters - support bytes in Avro top-level union types (#2762))
=======
<<<<<<< HEAD
<<<<<<< HEAD
<<<<<<< HEAD
=======
<<<<<<< HEAD
<<<<<<< HEAD
>>>>>>> locatelli-main
=======
<<<<<<< HEAD
>>>>>>> locatelli-main
=======
>>>>>>> locatelli-main
>>>>>>> 5f428db977 (GEOMESA-3061 Converters - support bytes in Avro top-level union types (#2762))
=======
>>>>>>> 76618c8da3 (GEOMESA-3061 Converters - support bytes in Avro top-level union types (#2762))
=======
<<<<<<< HEAD
<<<<<<< HEAD
<<<<<<< HEAD
=======
<<<<<<< HEAD
<<<<<<< HEAD
>>>>>>> locatelli-main
=======
<<<<<<< HEAD
>>>>>>> locatelli-main
=======
>>>>>>> locatelli-main
>>>>>>> 0fbf9e83e2 (GEOMESA-3176 Docs - fix download links in install instructions)
=======
>>>>>>> 89bdd3013e (GEOMESA-3061 Converters - support bytes in Avro top-level union types (#2762))
=======
<<<<<<< HEAD
<<<<<<< HEAD
<<<<<<< HEAD
=======
<<<<<<< HEAD
>>>>>>> locatelli-main
=======
>>>>>>> locatelli-main
=======
>>>>>>> locatelli-main
>>>>>>> c8a325e13c (GEOMESA-3061 Converters - support bytes in Avro top-level union types (#2762))
=======
>>>>>>> f9e8439b09 (GEOMESA-3176 Docs - fix download links in install instructions)
=======
=======
>>>>>>> 97ec7d864a (GEOMESA-3061 Converters - support bytes in Avro top-level union types (#2762))
=======
<<<<<<< HEAD
<<<<<<< HEAD
>>>>>>> db8d998aa2 (Merge branch 'feature/postgis-fixes')
=======
<<<<<<< HEAD
>>>>>>> 28e2bfa2d (GEOMESA-3061 Converters - support bytes in Avro top-level union types (#2762))
>>>>>>> 72bafaf54b (GEOMESA-3061 Converters - support bytes in Avro top-level union types (#2762))
=======
>>>>>>> 90ec70f55 (GEOMESA-3176 Docs - fix download links in install instructions)
>>>>>>> 63db7d154a (GEOMESA-3176 Docs - fix download links in install instructions)
=======
=======
>>>>>>> 28e2bfa2d (GEOMESA-3061 Converters - support bytes in Avro top-level union types (#2762))
=======
>>>>>>> 90ec70f55 (GEOMESA-3176 Docs - fix download links in install instructions)
>>>>>>> locationtech-main
=======
=======
<<<<<<< HEAD
=======
>>>>>>> locatelli-main
<<<<<<< HEAD
>>>>>>> db8d998aa2 (Merge branch 'feature/postgis-fixes')
=======
=======
>>>>>>> locatelli-main
=======
>>>>>>> 4599715c51 (d)
=======
>>>>>>> db8d998aa2 (Merge branch 'feature/postgis-fixes')
=======
>>>>>>> 6e0709aba8 (Merge branch 'feature/postgis-fixes')
>>>>>>> 28e2bfa2d (GEOMESA-3061 Converters - support bytes in Avro top-level union types (#2762))
>>>>>>> 72bafaf54b (GEOMESA-3061 Converters - support bytes in Avro top-level union types (#2762))
=======
=======
>>>>>>> 72919d0f84 (GEOMESA-3061 Converters - support bytes in Avro top-level union types (#2762))
=======
>>>>>>> 5f428db977 (GEOMESA-3061 Converters - support bytes in Avro top-level union types (#2762))
=======
>>>>>>> 107726440b (GEOMESA-3061 Converters - support bytes in Avro top-level union types (#2762))
=======
>>>>>>> 5cf31d21f3 (GEOMESA-3061 Converters - support bytes in Avro top-level union types (#2762))
=======
>>>>>>> 0fbf9e83e2 (GEOMESA-3176 Docs - fix download links in install instructions)
=======
>>>>>>> 1ce7179e65 (GEOMESA-3176 Docs - fix download links in install instructions)
=======
>>>>>>> 211b96b2ed (GEOMESA-3061 Converters - support bytes in Avro top-level union types (#2762))
>>>>>>> 90ec70f55 (GEOMESA-3176 Docs - fix download links in install instructions)
>>>>>>> 63db7d154a (GEOMESA-3176 Docs - fix download links in install instructions)
=======
<<<<<<< HEAD
<<<<<<< HEAD
>>>>>>> locatelli-main
=======
>>>>>>> locatelli-main
=======
>>>>>>> locatelli-main
>>>>>>> 6eb31fb65 (GEOMESA-3061 Converters - support bytes in Avro top-level union types (#2762))
=======
<<<<<<< HEAD
<<<<<<< HEAD
<<<<<<< HEAD
=======
<<<<<<< HEAD
<<<<<<< HEAD
<<<<<<< HEAD
=======
>>>>>>> b488e79fc5 (GEOMESA-3061 Converters - support bytes in Avro top-level union types (#2762))
>>>>>>> locatelli-main
=======
>>>>>>> b488e79fc5 (GEOMESA-3061 Converters - support bytes in Avro top-level union types (#2762))
>>>>>>> locatelli-main
=======
>>>>>>> b488e79fc5 (GEOMESA-3061 Converters - support bytes in Avro top-level union types (#2762))
>>>>>>> locatelli-main
>>>>>>> c5e1827657 (GEOMESA-3061 Converters - support bytes in Avro top-level union types (#2762))
=======
>>>>>>> 9d708b240a (GEOMESA-3061 Converters - support bytes in Avro top-level union types (#2762))
=======
<<<<<<< HEAD
<<<<<<< HEAD
=======
<<<<<<< HEAD
>>>>>>> 90ec70f55 (GEOMESA-3176 Docs - fix download links in install instructions)
>>>>>>> 8cbe155de6 (GEOMESA-3176 Docs - fix download links in install instructions)
<<<<<<< HEAD
>>>>>>> location-main
=======
>>>>>>> locationtech-main
=======
=======
<<<<<<< HEAD
=======
>>>>>>> locatelli-main
<<<<<<< HEAD
=======
=======
>>>>>>> locatelli-main
>>>>>>> 9b83a71a1e (GEOMESA-3176 Docs - fix download links in install instructions)
=======
>>>>>>> 90ec70f55 (GEOMESA-3176 Docs - fix download links in install instructions)
>>>>>>> 8cbe155de6 (GEOMESA-3176 Docs - fix download links in install instructions)
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
>>>>>>> 6eb31fb65 (GEOMESA-3061 Converters - support bytes in Avro top-level union types (#2762))
=======
=======
>>>>>>> 86dd18aa73 (GEOMESA-3061 Converters - support bytes in Avro top-level union types (#2762))
<<<<<<< HEAD
<<<<<<< HEAD
<<<<<<< HEAD
<<<<<<< HEAD
=======
>>>>>>> locationtech-main
=======
<<<<<<< HEAD
>>>>>>> locatelli-main
=======
>>>>>>> locatelli-main
=======
>>>>>>> locatelli-main
>>>>>>> 15e998504 (GEOMESA-3176 Docs - fix download links in install instructions)
=======
>>>>>>> 07a6a5c29 (GEOMESA-3061 Converters - support bytes in Avro top-level union types (#2762))
=======
>>>>>>> 67b361c85 (GEOMESA-3061 Converters - support bytes in Avro top-level union types (#2762))
=======
=======
>>>>>>> 90ec70f55 (GEOMESA-3176 Docs - fix download links in install instructions)
>>>>>>> 63db7d154 (GEOMESA-3176 Docs - fix download links in install instructions)
=======
<<<<<<< HEAD
<<<<<<< HEAD
<<<<<<< HEAD
<<<<<<< HEAD
<<<<<<< HEAD
<<<<<<< HEAD
=======
>>>>>>> 28e2bfa2d (GEOMESA-3061 Converters - support bytes in Avro top-level union types (#2762))
<<<<<<< HEAD
=======
=======
=======
>>>>>>> 28e2bfa2d (GEOMESA-3061 Converters - support bytes in Avro top-level union types (#2762))
>>>>>>> locatelli-main
=======
=======
>>>>>>> 28e2bfa2d (GEOMESA-3061 Converters - support bytes in Avro top-level union types (#2762))
>>>>>>> locatelli-main
=======
=======
>>>>>>> 28e2bfa2d (GEOMESA-3061 Converters - support bytes in Avro top-level union types (#2762))
>>>>>>> locatelli-main
=======
=======
=======
>>>>>>> 610d4a0e13 (GEOMESA-3176 Docs - fix download links in install instructions)
<<<<<<< HEAD
<<<<<<< HEAD
<<<<<<< HEAD
>>>>>>> locationtech-main
=======
=======
>>>>>>> 28e2bfa2d (GEOMESA-3061 Converters - support bytes in Avro top-level union types (#2762))
>>>>>>> locationtech-main
=======
<<<<<<< HEAD
=======
>>>>>>> locatelli-main
=======
>>>>>>> locatelli-main
=======
=======
=======
>>>>>>> 31ac28fff4 (GEOMESA-3176 Docs - fix download links in install instructions)
=======
>>>>>>> 72919d0f84 (GEOMESA-3061 Converters - support bytes in Avro top-level union types (#2762))
=======
>>>>>>> c5e1827657 (GEOMESA-3061 Converters - support bytes in Avro top-level union types (#2762))
=======
>>>>>>> 64536d7b4a (GEOMESA-3061 Converters - support bytes in Avro top-level union types (#2762))
=======
>>>>>>> a5b160f47b (GEOMESA-3061 Converters - support bytes in Avro top-level union types (#2762))
=======
>>>>>>> 9b83a71a1e (GEOMESA-3176 Docs - fix download links in install instructions)
=======
>>>>>>> 6eb31fb65 (GEOMESA-3061 Converters - support bytes in Avro top-level union types (#2762))
=======
>>>>>>> 107726440b (GEOMESA-3061 Converters - support bytes in Avro top-level union types (#2762))
=======
>>>>>>> 15e998504 (GEOMESA-3176 Docs - fix download links in install instructions)
=======
<<<<<<< HEAD
>>>>>>> 1ce7179e65 (GEOMESA-3176 Docs - fix download links in install instructions)
=======
>>>>>>> 07a6a5c29 (GEOMESA-3061 Converters - support bytes in Avro top-level union types (#2762))
=======
>>>>>>> 211b96b2ed (GEOMESA-3061 Converters - support bytes in Avro top-level union types (#2762))
=======
>>>>>>> 2de4be5460 (GEOMESA-3176 Docs - fix download links in install instructions)
<<<<<<< HEAD
<<<<<<< HEAD
>>>>>>> locatelli-main
=======
>>>>>>> locatelli-main
=======
>>>>>>> locatelli-main

>>>>>>> b9bdd406e (GEOMESA-3061 Converters - support bytes in Avro top-level union types (#2762))
=======
>>>>>>> 16b2e83f2 (GEOMESA-3176 Docs - fix download links in install instructions)
<<<<<<< HEAD
<<<<<<< HEAD
<<<<<<< HEAD
<<<<<<< HEAD
<<<<<<< HEAD
<<<<<<< HEAD
<<<<<<< HEAD
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
>>>>>>> a2ed7a128d (GEOMESA-3176 Docs - fix download links in install instructions)
=======
>>>>>>> 79d78e33bb (GEOMESA-3176 Docs - fix download links in install instructions)
=======
>>>>>>> 64a722e2a7 (GEOMESA-3176 Docs - fix download links in install instructions)
=======
>>>>>>> 449fb2085b (GEOMESA-3176 Docs - fix download links in install instructions)
=======
>>>>>>> 760781f8dd (GEOMESA-3176 Docs - fix download links in install instructions)
<<<<<<< HEAD
<<<<<<< HEAD
=======
>>>>>>> 813f24c01d (GEOMESA-3176 Docs - fix download links in install instructions)
=======
>>>>>>> 4492950388 (GEOMESA-3176 Docs - fix download links in install instructions)
<<<<<<< HEAD
=======
>>>>>>> 72919d0f84 (GEOMESA-3061 Converters - support bytes in Avro top-level union types (#2762))
=======
>>>>>>> 64536d7b4a (GEOMESA-3061 Converters - support bytes in Avro top-level union types (#2762))
=======
>>>>>>> 9b83a71a1e (GEOMESA-3176 Docs - fix download links in install instructions)
=======
>>>>>>> 107726440b (GEOMESA-3061 Converters - support bytes in Avro top-level union types (#2762))
=======
>>>>>>> 1ce7179e65 (GEOMESA-3176 Docs - fix download links in install instructions)
=======
>>>>>>> 211b96b2ed (GEOMESA-3061 Converters - support bytes in Avro top-level union types (#2762))
=======
>>>>>>> f05d4ba95a (GEOMESA-3176 Docs - fix download links in install instructions)
=======
>>>>>>> b7b8a67dc7 (GEOMESA-3176 Docs - fix download links in install instructions)
=======
>>>>>>> 13325d17c4 (GEOMESA-3176 Docs - fix download links in install instructions)
=======
>>>>>>> 2de4be5460 (GEOMESA-3176 Docs - fix download links in install instructions)
=======
=======
>>>>>>> 449fb2085b (GEOMESA-3176 Docs - fix download links in install instructions)
>>>>>>> 5fa9f37061 (GEOMESA-3176 Docs - fix download links in install instructions)
=======
>>>>>>> a2ed7a128d (GEOMESA-3176 Docs - fix download links in install instructions)
=======
=======
>>>>>>> 813f24c01d (GEOMESA-3176 Docs - fix download links in install instructions)
>>>>>>> 79d78e33bb (GEOMESA-3176 Docs - fix download links in install instructions)
=======
>>>>>>> 64a722e2a7 (GEOMESA-3176 Docs - fix download links in install instructions)
>>>>>>> 90ec70f559 (GEOMESA-3176 Docs - fix download links in install instructions)
=======
=======
>>>>>>> 07a6a5c291 (GEOMESA-3061 Converters - support bytes in Avro top-level union types (#2762))
=======
>>>>>>> 63db7d154a (GEOMESA-3176 Docs - fix download links in install instructions)
=======
=======
<<<<<<< HEAD
<<<<<<< HEAD
>>>>>>> 0fbf9e83e2 (GEOMESA-3176 Docs - fix download links in install instructions)
=======
>>>>>>> 89bdd3013e (GEOMESA-3061 Converters - support bytes in Avro top-level union types (#2762))
=======
<<<<<<< HEAD
>>>>>>> f9e8439b09 (GEOMESA-3176 Docs - fix download links in install instructions)
=======
>>>>>>> 72bafaf54b (GEOMESA-3061 Converters - support bytes in Avro top-level union types (#2762))
=======
>>>>>>> 0b36b46b5f (GEOMESA-3176 Docs - fix download links in install instructions)
=======
<<<<<<< HEAD
<<<<<<< HEAD
<<<<<<< HEAD
<<<<<<< HEAD
<<<<<<< HEAD
<<<<<<< HEAD
=======
>>>>>>> a2ed7a128d (GEOMESA-3176 Docs - fix download links in install instructions)
=======
>>>>>>> 79d78e33bb (GEOMESA-3176 Docs - fix download links in install instructions)
>>>>>>> 2142d07ded (GEOMESA-3176 Docs - fix download links in install instructions)
=======
=======
>>>>>>> 760781f8dd (GEOMESA-3176 Docs - fix download links in install instructions)
<<<<<<< HEAD
<<<<<<< HEAD
=======
>>>>>>> 79d78e33bb (GEOMESA-3176 Docs - fix download links in install instructions)
=======
>>>>>>> 2142d07ded (GEOMESA-3176 Docs - fix download links in install instructions)
=======
>>>>>>> 813f24c01d (GEOMESA-3176 Docs - fix download links in install instructions)
<<<<<<< HEAD
=======
>>>>>>> 0fbf9e83e2 (GEOMESA-3176 Docs - fix download links in install instructions)
=======
>>>>>>> 1ce7179e65 (GEOMESA-3176 Docs - fix download links in install instructions)
=======
>>>>>>> 211b96b2ed (GEOMESA-3061 Converters - support bytes in Avro top-level union types (#2762))
=======
>>>>>>> f05d4ba95a (GEOMESA-3176 Docs - fix download links in install instructions)
=======
>>>>>>> 2142d07ded (GEOMESA-3176 Docs - fix download links in install instructions)
=======
>>>>>>> b7b8a67dc7 (GEOMESA-3176 Docs - fix download links in install instructions)
=======
>>>>>>> a2ed7a128d (GEOMESA-3176 Docs - fix download links in install instructions)
=======
>>>>>>> 79d78e33bb (GEOMESA-3176 Docs - fix download links in install instructions)
>>>>>>> 6eb31fb65 (GEOMESA-3061 Converters - support bytes in Avro top-level union types (#2762))
>>>>>>> 28e2bfa2dc (GEOMESA-3061 Converters - support bytes in Avro top-level union types (#2762))
=======
>>>>>>> c5e1827657 (GEOMESA-3061 Converters - support bytes in Avro top-level union types (#2762))
=======
<<<<<<< HEAD
<<<<<<< HEAD
>>>>>>> 8cbe155de6 (GEOMESA-3176 Docs - fix download links in install instructions)
=======
=======
>>>>>>> 6eb31fb65 (GEOMESA-3061 Converters - support bytes in Avro top-level union types (#2762))
>>>>>>> 5f428db977 (GEOMESA-3061 Converters - support bytes in Avro top-level union types (#2762))
=======
<<<<<<< HEAD
<<<<<<< HEAD
>>>>>>> 07a6a5c29 (GEOMESA-3061 Converters - support bytes in Avro top-level union types (#2762))
=======
>>>>>>> 63db7d154 (GEOMESA-3176 Docs - fix download links in install instructions)
=======
=======
>>>>>>> 6eb31fb65 (GEOMESA-3061 Converters - support bytes in Avro top-level union types (#2762))
>>>>>>> 28e2bfa2d (GEOMESA-3061 Converters - support bytes in Avro top-level union types (#2762))
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
>>>>>>> 0b168af9c8 (GEOMESA-3176 Docs - fix download links in install instructions)
=======
>>>>>>> 760781f8dd (GEOMESA-3176 Docs - fix download links in install instructions)
=======
>>>>>>> ecd45f2c3e (GEOMESA-3176 Docs - fix download links in install instructions)
<<<<<<< HEAD
=======
>>>>>>> f05d4ba95a (GEOMESA-3176 Docs - fix download links in install instructions)
=======
>>>>>>> eff03389ef (GEOMESA-3176 Docs - fix download links in install instructions)
=======
>>>>>>> 5fa9f37061 (GEOMESA-3176 Docs - fix download links in install instructions)
=======
=======
>>>>>>> 760781f8dd (GEOMESA-3176 Docs - fix download links in install instructions)
>>>>>>> a2ed7a128d (GEOMESA-3176 Docs - fix download links in install instructions)
=======
>>>>>>> 0b168af9c8 (GEOMESA-3176 Docs - fix download links in install instructions)
>>>>>>> 279de44d3f (GEOMESA-3176 Docs - fix download links in install instructions)
=======
>>>>>>> 8b8075f529 (GEOMESA-3176 Docs - fix download links in install instructions)
=======
<<<<<<< HEAD
<<<<<<< HEAD
<<<<<<< HEAD
=======
>>>>>>> 279de44d3f (GEOMESA-3176 Docs - fix download links in install instructions)
=======
>>>>>>> 449fb2085b (GEOMESA-3176 Docs - fix download links in install instructions)
=======
>>>>>>> 4492950388 (GEOMESA-3176 Docs - fix download links in install instructions)
=======
>>>>>>> 6eb31fb65 (GEOMESA-3061 Converters - support bytes in Avro top-level union types (#2762))
>>>>>>> 28e2bfa2dc (GEOMESA-3061 Converters - support bytes in Avro top-level union types (#2762))
=======
>>>>>>> 72919d0f84 (GEOMESA-3061 Converters - support bytes in Avro top-level union types (#2762))
=======
>>>>>>> 64536d7b4a (GEOMESA-3061 Converters - support bytes in Avro top-level union types (#2762))
=======
>>>>>>> 8cbe155de6 (GEOMESA-3176 Docs - fix download links in install instructions)
=======
>>>>>>> 9b83a71a1e (GEOMESA-3176 Docs - fix download links in install instructions)
=======
>>>>>>> 107726440b (GEOMESA-3061 Converters - support bytes in Avro top-level union types (#2762))
=======
>>>>>>> 07a6a5c29 (GEOMESA-3061 Converters - support bytes in Avro top-level union types (#2762))
=======
>>>>>>> 211b96b2ed (GEOMESA-3061 Converters - support bytes in Avro top-level union types (#2762))
=======
>>>>>>> 13325d17c4 (GEOMESA-3176 Docs - fix download links in install instructions)
=======
>>>>>>> 64a722e2a7 (GEOMESA-3176 Docs - fix download links in install instructions)
=======
>>>>>>> 279de44d3f (GEOMESA-3176 Docs - fix download links in install instructions)
=======
>>>>>>> 449fb2085b (GEOMESA-3176 Docs - fix download links in install instructions)
=======
>>>>>>> 4492950388 (GEOMESA-3176 Docs - fix download links in install instructions)
=======

>>>>>>> b9bdd406e (GEOMESA-3061 Converters - support bytes in Avro top-level union types (#2762))
>>>>>>> f71fa3c0e (GEOMESA-3061 Converters - support bytes in Avro top-level union types (#2762))
<<<<<<< HEAD
<<<<<<< HEAD
<<<<<<< HEAD
<<<<<<< HEAD
<<<<<<< HEAD
<<<<<<< HEAD
<<<<<<< HEAD
<<<<<<< HEAD
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
>>>>>>> 72919d0f84 (GEOMESA-3061 Converters - support bytes in Avro top-level union types (#2762))
=======
>>>>>>> 64536d7b4a (GEOMESA-3061 Converters - support bytes in Avro top-level union types (#2762))
=======
>>>>>>> a5b160f47b (GEOMESA-3061 Converters - support bytes in Avro top-level union types (#2762))
=======
>>>>>>> 107726440b (GEOMESA-3061 Converters - support bytes in Avro top-level union types (#2762))
=======
>>>>>>> 211b96b2ed (GEOMESA-3061 Converters - support bytes in Avro top-level union types (#2762))
=======
>>>>>>> 058fd96baa (GEOMESA-3061 Converters - support bytes in Avro top-level union types (#2762))
>>>>>>> 6eb31fb652 (GEOMESA-3061 Converters - support bytes in Avro top-level union types (#2762))
=======
>>>>>>> 67b361c856 (GEOMESA-3061 Converters - support bytes in Avro top-level union types (#2762))
=======
>>>>>>> 28e2bfa2dc (GEOMESA-3061 Converters - support bytes in Avro top-level union types (#2762))
=======
<<<<<<< HEAD
<<<<<<< HEAD
>>>>>>> 9d708b240a (GEOMESA-3061 Converters - support bytes in Avro top-level union types (#2762))
=======
>>>>>>> 5f428db977 (GEOMESA-3061 Converters - support bytes in Avro top-level union types (#2762))
=======
<<<<<<< HEAD
<<<<<<< HEAD
>>>>>>> 89bdd3013e (GEOMESA-3061 Converters - support bytes in Avro top-level union types (#2762))
=======
=======
>>>>>>> 72bafaf54b (GEOMESA-3061 Converters - support bytes in Avro top-level union types (#2762))
=======
>>>>>>> 67b361c85 (GEOMESA-3061 Converters - support bytes in Avro top-level union types (#2762))
>>>>>>> c8a325e13c (GEOMESA-3061 Converters - support bytes in Avro top-level union types (#2762))
=======
>>>>>>> 28e2bfa2d (GEOMESA-3061 Converters - support bytes in Avro top-level union types (#2762))
=======
>>>>>>> e6e1f4bdd5 (GEOMESA-3061 Converters - support bytes in Avro top-level union types (#2762))
=======
=======
>>>>>>> 9d708b240a (GEOMESA-3061 Converters - support bytes in Avro top-level union types (#2762))
=======
>>>>>>> a5b160f47b (GEOMESA-3061 Converters - support bytes in Avro top-level union types (#2762))
=======
>>>>>>> 107726440b (GEOMESA-3061 Converters - support bytes in Avro top-level union types (#2762))
=======
>>>>>>> 89bdd3013e (GEOMESA-3061 Converters - support bytes in Avro top-level union types (#2762))
=======
>>>>>>> 211b96b2ed (GEOMESA-3061 Converters - support bytes in Avro top-level union types (#2762))
=======

>>>>>>> b9bdd406e (GEOMESA-3061 Converters - support bytes in Avro top-level union types (#2762))
<<<<<<< HEAD
<<<<<<< HEAD
<<<<<<< HEAD
<<<<<<< HEAD
=======
>>>>>>> a5b160f47b (GEOMESA-3061 Converters - support bytes in Avro top-level union types (#2762))
>>>>>>> 0e68e9f4cc (GEOMESA-3061 Converters - support bytes in Avro top-level union types (#2762))
=======
=======
>>>>>>> 947a867d1c (GEOMESA-3061 Converters - support bytes in Avro top-level union types (#2762))
<<<<<<< HEAD
<<<<<<< HEAD
>>>>>>> locatelli-main
=======
>>>>>>> locatelli-main
=======
>>>>>>> locatelli-main
=======
>>>>>>> 6eb31fb65 (GEOMESA-3061 Converters - support bytes in Avro top-level union types (#2762))
=======
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
=======
<<<<<<< HEAD
=======
=======
>>>>>>> locatelli-main
=======
>>>>>>> locatelli-main
>>>>>>> 2586fa6a40 (GEOMESA-3061 Converters - support bytes in Avro top-level union types (#2762))
>>>>>>> 15e998504 (GEOMESA-3176 Docs - fix download links in install instructions)
=======
>>>>>>> 07a6a5c29 (GEOMESA-3061 Converters - support bytes in Avro top-level union types (#2762))
=======
<<<<<<< HEAD
<<<<<<< HEAD
>>>>>>> 67b361c85 (GEOMESA-3061 Converters - support bytes in Avro top-level union types (#2762))
=======
=======
>>>>>>> 90ec70f55 (GEOMESA-3176 Docs - fix download links in install instructions)
>>>>>>> 63db7d154 (GEOMESA-3176 Docs - fix download links in install instructions)
=======
<<<<<<< HEAD
<<<<<<< HEAD
=======
>>>>>>> 28e2bfa2d (GEOMESA-3061 Converters - support bytes in Avro top-level union types (#2762))
=======
>>>>>>> 9d1506029d (GEOMESA-3061 Converters - support bytes in Avro top-level union types (#2762))
=======
>>>>>>> 15e998504 (GEOMESA-3176 Docs - fix download links in install instructions)
=======
>>>>>>> bc622ff59f (GEOMESA-3176 Docs - fix download links in install instructions)
=======
>>>>>>> 7ec7e43c91 (GEOMESA-3061 Converters - support bytes in Avro top-level union types (#2762))
=======
>>>>>>> 67b361c85 (GEOMESA-3061 Converters - support bytes in Avro top-level union types (#2762))
=======
>>>>>>> 9a4dff9e4f (GEOMESA-3061 Converters - support bytes in Avro top-level union types (#2762))
=======
>>>>>>> 1cc4dadf2e (GEOMESA-3176 Docs - fix download links in install instructions)
=======
=======
>>>>>>> 28e2bfa2d (GEOMESA-3061 Converters - support bytes in Avro top-level union types (#2762))
>>>>>>> 2586fa6a40 (GEOMESA-3061 Converters - support bytes in Avro top-level union types (#2762))

>>>>>>> b9bdd406e (GEOMESA-3061 Converters - support bytes in Avro top-level union types (#2762))
=======
>>>>>>> 16b2e83f2 (GEOMESA-3176 Docs - fix download links in install instructions)
<<<<<<< HEAD
<<<<<<< HEAD
<<<<<<< HEAD
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
>>>>>>> bc622ff59f (GEOMESA-3176 Docs - fix download links in install instructions)
=======
>>>>>>> 7ec7e43c91 (GEOMESA-3061 Converters - support bytes in Avro top-level union types (#2762))
=======
>>>>>>> 1cc4dadf2e (GEOMESA-3176 Docs - fix download links in install instructions)
=======
>>>>>>> 2586fa6a40 (GEOMESA-3061 Converters - support bytes in Avro top-level union types (#2762))
>>>>>>> 15e9985047 (GEOMESA-3176 Docs - fix download links in install instructions)
=======
=======
>>>>>>> 4b70e7f8fb (GEOMESA-3176 Docs - fix download links in install instructions)
=======
>>>>>>> 85663f71c4 (GEOMESA-3061 Converters - support bytes in Avro top-level union types (#2762))
=======
>>>>>>> a12ea194c8 (GEOMESA-3176 Docs - fix download links in install instructions)
=======
>>>>>>> d4c5768cfa (GEOMESA-3061 Converters - support bytes in Avro top-level union types (#2762))
<<<<<<< HEAD
=======
>>>>>>> 85663f71c4 (GEOMESA-3061 Converters - support bytes in Avro top-level union types (#2762))
=======
>>>>>>> a12ea194c8 (GEOMESA-3176 Docs - fix download links in install instructions)
=======
>>>>>>> d4c5768cfa (GEOMESA-3061 Converters - support bytes in Avro top-level union types (#2762))
=======
>>>>>>> 15e9985047 (GEOMESA-3176 Docs - fix download links in install instructions)
=======
>>>>>>> 9d1506029d (GEOMESA-3061 Converters - support bytes in Avro top-level union types (#2762))
=======
>>>>>>> bc622ff59f (GEOMESA-3176 Docs - fix download links in install instructions)
<<<<<<< HEAD
=======
>>>>>>> 6eb31fb65 (GEOMESA-3061 Converters - support bytes in Avro top-level union types (#2762))
>>>>>>> 23c0241798 (GEOMESA-3061 Converters - support bytes in Avro top-level union types (#2762))
=======
<<<<<<< HEAD
<<<<<<< HEAD
<<<<<<< HEAD
=======
>>>>>>> 9d1506029d (GEOMESA-3061 Converters - support bytes in Avro top-level union types (#2762))
=======
>>>>>>> 7ec7e43c91 (GEOMESA-3061 Converters - support bytes in Avro top-level union types (#2762))
>>>>>>> 07a6a5c291 (GEOMESA-3061 Converters - support bytes in Avro top-level union types (#2762))
=======
<<<<<<< HEAD
=======
<<<<<<< HEAD
<<<<<<< HEAD
>>>>>>> 07a6a5c29 (GEOMESA-3061 Converters - support bytes in Avro top-level union types (#2762))
=======
<<<<<<< HEAD
>>>>>>> 85663f71c4 (GEOMESA-3061 Converters - support bytes in Avro top-level union types (#2762))
=======
>>>>>>> 63db7d154 (GEOMESA-3176 Docs - fix download links in install instructions)
=======
>>>>>>> a12ea194c8 (GEOMESA-3176 Docs - fix download links in install instructions)
=======
>>>>>>> 6eb31fb65 (GEOMESA-3061 Converters - support bytes in Avro top-level union types (#2762))
>>>>>>> 28e2bfa2d (GEOMESA-3061 Converters - support bytes in Avro top-level union types (#2762))
=======
=======
<<<<<<< HEAD
>>>>>>> 256a642cc1 (GEOMESA-3176 Docs - fix download links in install instructions)
>>>>>>> 6a26990f7 (GEOMESA-3176 Docs - fix download links in install instructions)
>>>>>>> 0b36b46b5f (GEOMESA-3176 Docs - fix download links in install instructions)
=======
>>>>>>> 8cbe155de (GEOMESA-3176 Docs - fix download links in install instructions)
>>>>>>> 8150bc0e65 (GEOMESA-3176 Docs - fix download links in install instructions)
=======
>>>>>>> 279de44d3 (GEOMESA-3176 Docs - fix download links in install instructions)
=======
=======
=======
>>>>>>> 9d1506029d (GEOMESA-3061 Converters - support bytes in Avro top-level union types (#2762))
=======
>>>>>>> 07a6a5c29 (GEOMESA-3061 Converters - support bytes in Avro top-level union types (#2762))
=======
<<<<<<< HEAD
>>>>>>> 85663f71c4 (GEOMESA-3061 Converters - support bytes in Avro top-level union types (#2762))
=======
<<<<<<< HEAD
>>>>>>> 7ec7e43c91 (GEOMESA-3061 Converters - support bytes in Avro top-level union types (#2762))
=======
>>>>>>> 63db7d154 (GEOMESA-3176 Docs - fix download links in install instructions)
=======
>>>>>>> a12ea194c8 (GEOMESA-3176 Docs - fix download links in install instructions)
=======
>>>>>>> 1cc4dadf2e (GEOMESA-3176 Docs - fix download links in install instructions)
=======
>>>>>>> 2586fa6a40 (GEOMESA-3061 Converters - support bytes in Avro top-level union types (#2762))

>>>>>>> b9bdd406e (GEOMESA-3061 Converters - support bytes in Avro top-level union types (#2762))
>>>>>>> f71fa3c0e (GEOMESA-3061 Converters - support bytes in Avro top-level union types (#2762))
<<<<<<< HEAD
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
>>>>>>> 2586fa6a40 (GEOMESA-3061 Converters - support bytes in Avro top-level union types (#2762))
=======
>>>>>>> 67b361c85 (GEOMESA-3061 Converters - support bytes in Avro top-level union types (#2762))
=======
>>>>>>> 28e2bfa2d (GEOMESA-3061 Converters - support bytes in Avro top-level union types (#2762))
=======
<<<<<<< HEAD
<<<<<<< HEAD
>>>>>>> 240977229 (GEOMESA-3061 Converters - support bytes in Avro top-level union types (#2762))
=======
>>>>>>> 9d708b240 (GEOMESA-3061 Converters - support bytes in Avro top-level union types (#2762))
>>>>>>> 53a3e72cbf (GEOMESA-3061 Converters - support bytes in Avro top-level union types (#2762))
=======
>>>>>>> e6e1f4bdd (GEOMESA-3061 Converters - support bytes in Avro top-level union types (#2762))
=======
>>>>>>> 9d1506029d (GEOMESA-3061 Converters - support bytes in Avro top-level union types (#2762))
=======
>>>>>>> 7ec7e43c91 (GEOMESA-3061 Converters - support bytes in Avro top-level union types (#2762))
=======
=======
>>>>>>> 67b361c85 (GEOMESA-3061 Converters - support bytes in Avro top-level union types (#2762))
>>>>>>> 9a4dff9e4f (GEOMESA-3061 Converters - support bytes in Avro top-level union types (#2762))
=======
=======
>>>>>>> 2586fa6a40 (GEOMESA-3061 Converters - support bytes in Avro top-level union types (#2762))
=======

>>>>>>> b9bdd406e (GEOMESA-3061 Converters - support bytes in Avro top-level union types (#2762))
>>>>>>> 23c0241798 (GEOMESA-3061 Converters - support bytes in Avro top-level union types (#2762))
>>>>>>> cdb410251 (GEOMESA-3061 Converters - support bytes in Avro top-level union types (#2762))
<<<<<<< HEAD
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
=======
>>>>>>> 449fb2085b (GEOMESA-3176 Docs - fix download links in install instructions)
=======
<<<<<<< HEAD
<<<<<<< HEAD
<<<<<<< HEAD
>>>>>>> 760781f8dd (GEOMESA-3176 Docs - fix download links in install instructions)
=======
>>>>>>> 813f24c01d (GEOMESA-3176 Docs - fix download links in install instructions)
=======
>>>>>>> 4492950388 (GEOMESA-3176 Docs - fix download links in install instructions)
>>>>>>> locationtech-main
=======
=======
>>>>>>> locatelli-main
=======
>>>>>>> locatelli-main
>>>>>>> 9a4dff9e4f (GEOMESA-3061 Converters - support bytes in Avro top-level union types (#2762))
=======
>>>>>>> 1cc4dadf2e (GEOMESA-3176 Docs - fix download links in install instructions)
=======
>>>>>>> 9b83a71a1e (GEOMESA-3176 Docs - fix download links in install instructions)
>>>>>>> 67b361c856 (GEOMESA-3061 Converters - support bytes in Avro top-level union types (#2762))
=======
=======
>>>>>>> c8a325e13c (GEOMESA-3061 Converters - support bytes in Avro top-level union types (#2762))
=======
>>>>>>> f9e8439b09 (GEOMESA-3176 Docs - fix download links in install instructions)
=======
>>>>>>> ad3cedc4db (GEOMESA-3061 Converters - support bytes in Avro top-level union types (#2762))
=======
<<<<<<< HEAD
<<<<<<< HEAD
>>>>>>> a12ea194c8 (GEOMESA-3176 Docs - fix download links in install instructions)
=======
>>>>>>> 22dcc8170f (GEOMESA-3061 Converters - support bytes in Avro top-level union types (#2762))
=======
>>>>>>> 0b36b46b5f (GEOMESA-3176 Docs - fix download links in install instructions)
=======
=======
>>>>>>> 256a642cc1 (GEOMESA-3176 Docs - fix download links in install instructions)
=======
>>>>>>> 1890b11217 (GEOMESA-3061 Converters - support bytes in Avro top-level union types (#2762))
=======
>>>>>>> 2142d07ded (GEOMESA-3176 Docs - fix download links in install instructions)
=======
>>>>>>> 53a3e72cbf (GEOMESA-3061 Converters - support bytes in Avro top-level union types (#2762))
>>>>>>> 7b0539b808 (GEOMESA-3061 Converters - support bytes in Avro top-level union types (#2762))
=======
>>>>>>> 8150bc0e65 (GEOMESA-3176 Docs - fix download links in install instructions)
=======
>>>>>>> 8035cc5893 (GEOMESA-3061 Converters - support bytes in Avro top-level union types (#2762))
=======
>>>>>>> b7c6b904be (GEOMESA-3176 Docs - fix download links in install instructions)
=======
=======
>>>>>>> 9a4dff9e4f (GEOMESA-3061 Converters - support bytes in Avro top-level union types (#2762))
=======
>>>>>>> a12ea194c8 (GEOMESA-3176 Docs - fix download links in install instructions)
=======
>>>>>>> 1cc4dadf2e (GEOMESA-3176 Docs - fix download links in install instructions)
>>>>>>> 90ec70f55 (GEOMESA-3176 Docs - fix download links in install instructions)
<<<<<<< HEAD
<<<<<<< HEAD
<<<<<<< HEAD
<<<<<<< HEAD
=======
>>>>>>> 107726440b (GEOMESA-3061 Converters - support bytes in Avro top-level union types (#2762))
>>>>>>> 63db7d154a (GEOMESA-3176 Docs - fix download links in install instructions)
=======
=======
>>>>>>> 6eb31fb65 (GEOMESA-3061 Converters - support bytes in Avro top-level union types (#2762))
<<<<<<< HEAD
<<<<<<< HEAD
<<<<<<< HEAD
<<<<<<< HEAD
<<<<<<< HEAD
<<<<<<< HEAD
=======
>>>>>>> 92674ff9d4 (GEOMESA-3061 Converters - support bytes in Avro top-level union types (#2762))
=======
>>>>>>> 2586fa6a40 (GEOMESA-3061 Converters - support bytes in Avro top-level union types (#2762))
>>>>>>> 28e2bfa2dc (GEOMESA-3061 Converters - support bytes in Avro top-level union types (#2762))
=======
>>>>>>> 76618c8da3 (GEOMESA-3061 Converters - support bytes in Avro top-level union types (#2762))
=======
>>>>>>> 72bafaf54b (GEOMESA-3061 Converters - support bytes in Avro top-level union types (#2762))
=======
>>>>>>> 947a867d1c (GEOMESA-3061 Converters - support bytes in Avro top-level union types (#2762))
=======
>>>>>>> a910ae135f (GEOMESA-3061 Converters - support bytes in Avro top-level union types (#2762))
=======
<<<<<<< HEAD
<<<<<<< HEAD
>>>>>>> d4c5768cfa (GEOMESA-3061 Converters - support bytes in Avro top-level union types (#2762))
=======
=======
>>>>>>> 92674ff9d4 (GEOMESA-3061 Converters - support bytes in Avro top-level union types (#2762))
=======
>>>>>>> d4c5768cfa (GEOMESA-3061 Converters - support bytes in Avro top-level union types (#2762))
=======
>>>>>>> 2586fa6a40 (GEOMESA-3061 Converters - support bytes in Avro top-level union types (#2762))
=======

>>>>>>> b9bdd406e (GEOMESA-3061 Converters - support bytes in Avro top-level union types (#2762))
<<<<<<< HEAD
<<<<<<< HEAD
<<<<<<< HEAD
>>>>>>> b4320946b4 (GEOMESA-3061 Converters - support bytes in Avro top-level union types (#2762))
=======
>>>>>>> 3be8d2a5a4 (Merge branch 'feature/postgis-fixes')
=======
=======

>>>>>>> b9bdd406e (GEOMESA-3061 Converters - support bytes in Avro top-level union types (#2762))
>>>>>>> d9ed077cd1 (GEOMESA-3061 Converters - support bytes in Avro top-level union types (#2762))
=======
=======
<<<<<<< HEAD
>>>>>>> c1f99f4bcb (GEOMESA-3061 Converters - support bytes in Avro top-level union types (#2762))
=======
>>>>>>> 6eb31fb65 (GEOMESA-3061 Converters - support bytes in Avro top-level union types (#2762))
=======
<<<<<<< HEAD
=======
>>>>>>> b2177e9015 (GEOMESA-3061 Converters - support bytes in Avro top-level union types (#2762))
=======
>>>>>>> 955de6bfcc (GEOMESA-3176 Docs - fix download links in install instructions)
=======
=======
>>>>>>> 2586fa6a40 (GEOMESA-3061 Converters - support bytes in Avro top-level union types (#2762))
>>>>>>> d329320e6a (GEOMESA-3061 Converters - support bytes in Avro top-level union types (#2762))
>>>>>>> 15e998504 (GEOMESA-3176 Docs - fix download links in install instructions)
=======
>>>>>>> 07a6a5c29 (GEOMESA-3061 Converters - support bytes in Avro top-level union types (#2762))
=======
<<<<<<< HEAD
<<<<<<< HEAD
>>>>>>> 67b361c85 (GEOMESA-3061 Converters - support bytes in Avro top-level union types (#2762))
=======
=======
>>>>>>> 90ec70f55 (GEOMESA-3176 Docs - fix download links in install instructions)
>>>>>>> 63db7d154 (GEOMESA-3176 Docs - fix download links in install instructions)
=======
<<<<<<< HEAD
<<<<<<< HEAD
=======
>>>>>>> 28e2bfa2d (GEOMESA-3061 Converters - support bytes in Avro top-level union types (#2762))
=======
>>>>>>> 9d1506029d (GEOMESA-3061 Converters - support bytes in Avro top-level union types (#2762))
=======
>>>>>>> 15e998504 (GEOMESA-3176 Docs - fix download links in install instructions)
=======
>>>>>>> bc622ff59f (GEOMESA-3176 Docs - fix download links in install instructions)
=======
>>>>>>> 7ec7e43c91 (GEOMESA-3061 Converters - support bytes in Avro top-level union types (#2762))
=======
>>>>>>> 67b361c85 (GEOMESA-3061 Converters - support bytes in Avro top-level union types (#2762))
=======
>>>>>>> 9a4dff9e4f (GEOMESA-3061 Converters - support bytes in Avro top-level union types (#2762))
=======
>>>>>>> 1cc4dadf2e (GEOMESA-3176 Docs - fix download links in install instructions)
=======
=======
>>>>>>> 28e2bfa2d (GEOMESA-3061 Converters - support bytes in Avro top-level union types (#2762))
>>>>>>> 2586fa6a40 (GEOMESA-3061 Converters - support bytes in Avro top-level union types (#2762))

>>>>>>> b9bdd406e (GEOMESA-3061 Converters - support bytes in Avro top-level union types (#2762))
=======
>>>>>>> 16b2e83f2 (GEOMESA-3176 Docs - fix download links in install instructions)
<<<<<<< HEAD
<<<<<<< HEAD
<<<<<<< HEAD
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
=======
>>>>>>> b2177e9015 (GEOMESA-3061 Converters - support bytes in Avro top-level union types (#2762))
=======
>>>>>>> bc622ff59f (GEOMESA-3176 Docs - fix download links in install instructions)
<<<<<<< HEAD
>>>>>>> 955de6bfcc (GEOMESA-3176 Docs - fix download links in install instructions)
=======
=======
>>>>>>> 7ec7e43c91 (GEOMESA-3061 Converters - support bytes in Avro top-level union types (#2762))
<<<<<<< HEAD
>>>>>>> 897de97047 (GEOMESA-3061 Converters - support bytes in Avro top-level union types (#2762))
=======
=======
>>>>>>> 1cc4dadf2e (GEOMESA-3176 Docs - fix download links in install instructions)
<<<<<<< HEAD
>>>>>>> 057f644239 (GEOMESA-3176 Docs - fix download links in install instructions)
=======
=======
>>>>>>> 2586fa6a40 (GEOMESA-3061 Converters - support bytes in Avro top-level union types (#2762))
>>>>>>> d329320e6a (GEOMESA-3061 Converters - support bytes in Avro top-level union types (#2762))
=======
=======
>>>>>>> 4f51687745 (GEOMESA-3061 Converters - support bytes in Avro top-level union types (#2762))
>>>>>>> 15e9985047 (GEOMESA-3176 Docs - fix download links in install instructions)
=======
=======
>>>>>>> 4b70e7f8fb (GEOMESA-3176 Docs - fix download links in install instructions)
=======
>>>>>>> 85663f71c4 (GEOMESA-3061 Converters - support bytes in Avro top-level union types (#2762))
=======
>>>>>>> a12ea194c8 (GEOMESA-3176 Docs - fix download links in install instructions)
=======
>>>>>>> d4c5768cfa (GEOMESA-3061 Converters - support bytes in Avro top-level union types (#2762))
<<<<<<< HEAD
=======
<<<<<<< HEAD
>>>>>>> 85663f71c4 (GEOMESA-3061 Converters - support bytes in Avro top-level union types (#2762))
=======
>>>>>>> a12ea194c8 (GEOMESA-3176 Docs - fix download links in install instructions)
=======
>>>>>>> d4c5768cfa (GEOMESA-3061 Converters - support bytes in Avro top-level union types (#2762))
=======
>>>>>>> 15e9985047 (GEOMESA-3176 Docs - fix download links in install instructions)
=======
>>>>>>> 9d1506029d (GEOMESA-3061 Converters - support bytes in Avro top-level union types (#2762))
=======
>>>>>>> bc622ff59f (GEOMESA-3176 Docs - fix download links in install instructions)
<<<<<<< HEAD
=======
=======
>>>>>>> 4f51687745 (GEOMESA-3061 Converters - support bytes in Avro top-level union types (#2762))
>>>>>>> 6eb31fb65 (GEOMESA-3061 Converters - support bytes in Avro top-level union types (#2762))
>>>>>>> 23c0241798 (GEOMESA-3061 Converters - support bytes in Avro top-level union types (#2762))
=======
<<<<<<< HEAD
<<<<<<< HEAD
<<<<<<< HEAD
<<<<<<< HEAD
=======
>>>>>>> 9d1506029d (GEOMESA-3061 Converters - support bytes in Avro top-level union types (#2762))
=======
>>>>>>> 7ec7e43c91 (GEOMESA-3061 Converters - support bytes in Avro top-level union types (#2762))
=======
>>>>>>> 4f51687745 (GEOMESA-3061 Converters - support bytes in Avro top-level union types (#2762))
>>>>>>> 07a6a5c291 (GEOMESA-3061 Converters - support bytes in Avro top-level union types (#2762))
=======
<<<<<<< HEAD
=======
<<<<<<< HEAD
<<<<<<< HEAD
<<<<<<< HEAD
=======
>>>>>>> 4f51687745 (GEOMESA-3061 Converters - support bytes in Avro top-level union types (#2762))
>>>>>>> 07a6a5c29 (GEOMESA-3061 Converters - support bytes in Avro top-level union types (#2762))
=======
<<<<<<< HEAD
>>>>>>> 85663f71c4 (GEOMESA-3061 Converters - support bytes in Avro top-level union types (#2762))
=======
>>>>>>> 63db7d154 (GEOMESA-3176 Docs - fix download links in install instructions)
=======
>>>>>>> a12ea194c8 (GEOMESA-3176 Docs - fix download links in install instructions)
=======
>>>>>>> 6eb31fb65 (GEOMESA-3061 Converters - support bytes in Avro top-level union types (#2762))
>>>>>>> 28e2bfa2d (GEOMESA-3061 Converters - support bytes in Avro top-level union types (#2762))
=======
=======
>>>>>>> 256a642cc1 (GEOMESA-3176 Docs - fix download links in install instructions)
>>>>>>> 6a26990f7 (GEOMESA-3176 Docs - fix download links in install instructions)
>>>>>>> 0b36b46b5f (GEOMESA-3176 Docs - fix download links in install instructions)
=======
>>>>>>> 8cbe155de (GEOMESA-3176 Docs - fix download links in install instructions)
>>>>>>> 8150bc0e65 (GEOMESA-3176 Docs - fix download links in install instructions)
=======
>>>>>>> 279de44d3 (GEOMESA-3176 Docs - fix download links in install instructions)
=======
=======
<<<<<<< HEAD
<<<<<<< HEAD
>>>>>>> 256a642cc1 (GEOMESA-3176 Docs - fix download links in install instructions)
>>>>>>> 6a26990f7 (GEOMESA-3176 Docs - fix download links in install instructions)
>>>>>>> 0b36b46b5f (GEOMESA-3176 Docs - fix download links in install instructions)
=======
>>>>>>> 8cbe155de (GEOMESA-3176 Docs - fix download links in install instructions)
>>>>>>> 8150bc0e65 (GEOMESA-3176 Docs - fix download links in install instructions)
=======
>>>>>>> 279de44d3 (GEOMESA-3176 Docs - fix download links in install instructions)
=======
=======
<<<<<<< HEAD
>>>>>>> 256a642cc1 (GEOMESA-3176 Docs - fix download links in install instructions)
>>>>>>> 6a26990f7 (GEOMESA-3176 Docs - fix download links in install instructions)
>>>>>>> 0b36b46b5f (GEOMESA-3176 Docs - fix download links in install instructions)
=======
>>>>>>> 8cbe155de (GEOMESA-3176 Docs - fix download links in install instructions)
>>>>>>> 8150bc0e65 (GEOMESA-3176 Docs - fix download links in install instructions)
=======
>>>>>>> 279de44d3 (GEOMESA-3176 Docs - fix download links in install instructions)
=======
=======
=======
=======
>>>>>>> 9d1506029d (GEOMESA-3061 Converters - support bytes in Avro top-level union types (#2762))
<<<<<<< HEAD
>>>>>>> b2177e9015 (GEOMESA-3061 Converters - support bytes in Avro top-level union types (#2762))
=======
=======
>>>>>>> 07a6a5c29 (GEOMESA-3061 Converters - support bytes in Avro top-level union types (#2762))
=======
<<<<<<< HEAD
>>>>>>> 85663f71c4 (GEOMESA-3061 Converters - support bytes in Avro top-level union types (#2762))
=======
<<<<<<< HEAD
>>>>>>> 7ec7e43c91 (GEOMESA-3061 Converters - support bytes in Avro top-level union types (#2762))
<<<<<<< HEAD
>>>>>>> 897de97047 (GEOMESA-3061 Converters - support bytes in Avro top-level union types (#2762))
=======
=======
>>>>>>> 63db7d154 (GEOMESA-3176 Docs - fix download links in install instructions)
=======
>>>>>>> a12ea194c8 (GEOMESA-3176 Docs - fix download links in install instructions)
=======
>>>>>>> 1cc4dadf2e (GEOMESA-3176 Docs - fix download links in install instructions)
<<<<<<< HEAD
>>>>>>> 057f644239 (GEOMESA-3176 Docs - fix download links in install instructions)
=======
=======
>>>>>>> 2586fa6a40 (GEOMESA-3061 Converters - support bytes in Avro top-level union types (#2762))
>>>>>>> d329320e6a (GEOMESA-3061 Converters - support bytes in Avro top-level union types (#2762))
=======
>>>>>>> 4f51687745 (GEOMESA-3061 Converters - support bytes in Avro top-level union types (#2762))

>>>>>>> b9bdd406e (GEOMESA-3061 Converters - support bytes in Avro top-level union types (#2762))
>>>>>>> f71fa3c0e (GEOMESA-3061 Converters - support bytes in Avro top-level union types (#2762))
<<<<<<< HEAD
<<<<<<< HEAD
<<<<<<< HEAD
<<<<<<< HEAD
<<<<<<< HEAD
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
>>>>>>> b800c052cc (GEOMESA-3061 Converters - support bytes in Avro top-level union types (#2762))
=======
>>>>>>> b2177e9015 (GEOMESA-3061 Converters - support bytes in Avro top-level union types (#2762))
=======
>>>>>>> 897de97047 (GEOMESA-3061 Converters - support bytes in Avro top-level union types (#2762))
=======
>>>>>>> 7b8c8dcc3d (GEOMESA-3061 Converters - support bytes in Avro top-level union types (#2762))
=======
=======
>>>>>>> 2586fa6a40 (GEOMESA-3061 Converters - support bytes in Avro top-level union types (#2762))
>>>>>>> d329320e6a (GEOMESA-3061 Converters - support bytes in Avro top-level union types (#2762))
=======
>>>>>>> 4f51687745 (GEOMESA-3061 Converters - support bytes in Avro top-level union types (#2762))
=======
>>>>>>> ecfd546311 (GEOMESA-3061 Converters - support bytes in Avro top-level union types (#2762))
=======
>>>>>>> 67b361c85 (GEOMESA-3061 Converters - support bytes in Avro top-level union types (#2762))
=======
>>>>>>> 28e2bfa2d (GEOMESA-3061 Converters - support bytes in Avro top-level union types (#2762))
=======
<<<<<<< HEAD
<<<<<<< HEAD
<<<<<<< HEAD
<<<<<<< HEAD
=======
>>>>>>> cc89a73032 (GEOMESA-3061 Converters - support bytes in Avro top-level union types (#2762))
>>>>>>> 240977229 (GEOMESA-3061 Converters - support bytes in Avro top-level union types (#2762))
=======
>>>>>>> 9d708b240 (GEOMESA-3061 Converters - support bytes in Avro top-level union types (#2762))
>>>>>>> 53a3e72cbf (GEOMESA-3061 Converters - support bytes in Avro top-level union types (#2762))
=======
<<<<<<< HEAD
<<<<<<< HEAD
<<<<<<< HEAD
<<<<<<< HEAD
>>>>>>> e6e1f4bdd (GEOMESA-3061 Converters - support bytes in Avro top-level union types (#2762))
=======
>>>>>>> 9d1506029d (GEOMESA-3061 Converters - support bytes in Avro top-level union types (#2762))
=======
>>>>>>> 7ec7e43c91 (GEOMESA-3061 Converters - support bytes in Avro top-level union types (#2762))
=======
=======
<<<<<<< HEAD
>>>>>>> 3e7fb62639 (GEOMESA-3061 Converters - support bytes in Avro top-level union types (#2762))
=======
>>>>>>> e6e1f4bdd (GEOMESA-3061 Converters - support bytes in Avro top-level union types (#2762))
=======
>>>>>>> b800c052cc (GEOMESA-3061 Converters - support bytes in Avro top-level union types (#2762))
=======
>>>>>>> 67b361c85 (GEOMESA-3061 Converters - support bytes in Avro top-level union types (#2762))
>>>>>>> 9a4dff9e4f (GEOMESA-3061 Converters - support bytes in Avro top-level union types (#2762))
=======
>>>>>>> 7b8c8dcc3d (GEOMESA-3061 Converters - support bytes in Avro top-level union types (#2762))
=======
>>>>>>> 2586fa6a40 (GEOMESA-3061 Converters - support bytes in Avro top-level union types (#2762))
=======
>>>>>>> 240977229 (GEOMESA-3061 Converters - support bytes in Avro top-level union types (#2762))
=======
>>>>>>> 4f51687745 (GEOMESA-3061 Converters - support bytes in Avro top-level union types (#2762))
=======
>>>>>>> cc89a73032 (GEOMESA-3061 Converters - support bytes in Avro top-level union types (#2762))
=======
>>>>>>> e6e1f4bdd (GEOMESA-3061 Converters - support bytes in Avro top-level union types (#2762))
=======
>>>>>>> ecfd546311 (GEOMESA-3061 Converters - support bytes in Avro top-level union types (#2762))
=======

>>>>>>> b9bdd406e (GEOMESA-3061 Converters - support bytes in Avro top-level union types (#2762))
>>>>>>> 23c0241798 (GEOMESA-3061 Converters - support bytes in Avro top-level union types (#2762))
>>>>>>> cdb410251 (GEOMESA-3061 Converters - support bytes in Avro top-level union types (#2762))
<<<<<<< HEAD
<<<<<<< HEAD
<<<<<<< HEAD
<<<<<<< HEAD
<<<<<<< HEAD
<<<<<<< HEAD
<<<<<<< HEAD
<<<<<<< HEAD
<<<<<<< HEAD
<<<<<<< HEAD
<<<<<<< HEAD
<<<<<<< HEAD
<<<<<<< HEAD
<<<<<<< HEAD
<<<<<<< HEAD
<<<<<<< HEAD
<<<<<<< HEAD
<<<<<<< HEAD
<<<<<<< HEAD
<<<<<<< HEAD
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
>>>>>>> 3e7fb62639 (GEOMESA-3061 Converters - support bytes in Avro top-level union types (#2762))
=======
>>>>>>> eff03389ef (GEOMESA-3176 Docs - fix download links in install instructions)
=======
>>>>>>> b800c052cc (GEOMESA-3061 Converters - support bytes in Avro top-level union types (#2762))
=======
>>>>>>> b7b8a67dc7 (GEOMESA-3176 Docs - fix download links in install instructions)
=======
>>>>>>> 13325d17c4 (GEOMESA-3176 Docs - fix download links in install instructions)
=======
=======
>>>>>>> 449fb2085b (GEOMESA-3176 Docs - fix download links in install instructions)
>>>>>>> 5fa9f37061 (GEOMESA-3176 Docs - fix download links in install instructions)
=======
=======
>>>>>>> 057f644239 (GEOMESA-3176 Docs - fix download links in install instructions)
=======
>>>>>>> 449fb2085b (GEOMESA-3176 Docs - fix download links in install instructions)
=======
>>>>>>> 9a4dff9e4f (GEOMESA-3061 Converters - support bytes in Avro top-level union types (#2762))
<<<<<<< HEAD
>>>>>>> 7b8c8dcc3d (GEOMESA-3061 Converters - support bytes in Avro top-level union types (#2762))
=======
=======
>>>>>>> 1cc4dadf2e (GEOMESA-3176 Docs - fix download links in install instructions)
>>>>>>> 057f644239 (GEOMESA-3176 Docs - fix download links in install instructions)
=======
>>>>>>> 4f51687745 (GEOMESA-3061 Converters - support bytes in Avro top-level union types (#2762))
=======
>>>>>>> a2ed7a128d (GEOMESA-3176 Docs - fix download links in install instructions)
=======
>>>>>>> cc89a73032 (GEOMESA-3061 Converters - support bytes in Avro top-level union types (#2762))
=======
>>>>>>> 0b168af9c8 (GEOMESA-3176 Docs - fix download links in install instructions)
=======
>>>>>>> ecfd546311 (GEOMESA-3061 Converters - support bytes in Avro top-level union types (#2762))
=======
>>>>>>> 79d78e33bb (GEOMESA-3176 Docs - fix download links in install instructions)
=======
>>>>>>> 64a722e2a7 (GEOMESA-3176 Docs - fix download links in install instructions)
>>>>>>> 67b361c856 (GEOMESA-3061 Converters - support bytes in Avro top-level union types (#2762))
=======
=======
>>>>>>> c8a325e13c (GEOMESA-3061 Converters - support bytes in Avro top-level union types (#2762))
=======
>>>>>>> f9e8439b09 (GEOMESA-3176 Docs - fix download links in install instructions)
=======
>>>>>>> ad3cedc4db (GEOMESA-3061 Converters - support bytes in Avro top-level union types (#2762))
=======
<<<<<<< HEAD
<<<<<<< HEAD
<<<<<<< HEAD
=======
>>>>>>> 4f51687745 (GEOMESA-3061 Converters - support bytes in Avro top-level union types (#2762))
>>>>>>> a12ea194c8 (GEOMESA-3176 Docs - fix download links in install instructions)
=======
>>>>>>> 22dcc8170f (GEOMESA-3061 Converters - support bytes in Avro top-level union types (#2762))
=======
<<<<<<< HEAD
<<<<<<< HEAD
>>>>>>> 0b36b46b5f (GEOMESA-3176 Docs - fix download links in install instructions)
=======
=======
<<<<<<< HEAD
<<<<<<< HEAD
<<<<<<< HEAD
<<<<<<< HEAD
>>>>>>> 256a642cc1 (GEOMESA-3176 Docs - fix download links in install instructions)
=======
>>>>>>> 1890b11217 (GEOMESA-3061 Converters - support bytes in Avro top-level union types (#2762))
=======
<<<<<<< HEAD
<<<<<<< HEAD
>>>>>>> 2142d07ded (GEOMESA-3176 Docs - fix download links in install instructions)
=======
=======
>>>>>>> 256a642cc1 (GEOMESA-3176 Docs - fix download links in install instructions)
=======
>>>>>>> eff03389ef (GEOMESA-3176 Docs - fix download links in install instructions)
=======
>>>>>>> b800c052cc (GEOMESA-3061 Converters - support bytes in Avro top-level union types (#2762))
=======
>>>>>>> 2142d07ded (GEOMESA-3176 Docs - fix download links in install instructions)
=======
>>>>>>> b7b8a67dc7 (GEOMESA-3176 Docs - fix download links in install instructions)
>>>>>>> 53a3e72cbf (GEOMESA-3061 Converters - support bytes in Avro top-level union types (#2762))
>>>>>>> 7b0539b808 (GEOMESA-3061 Converters - support bytes in Avro top-level union types (#2762))
=======
>>>>>>> 8150bc0e65 (GEOMESA-3176 Docs - fix download links in install instructions)
=======
<<<<<<< HEAD
<<<<<<< HEAD
>>>>>>> 8035cc5893 (GEOMESA-3061 Converters - support bytes in Avro top-level union types (#2762))
=======
>>>>>>> b7c6b904be (GEOMESA-3176 Docs - fix download links in install instructions)
=======
<<<<<<< HEAD
<<<<<<< HEAD
=======
>>>>>>> 53a3e72cbf (GEOMESA-3061 Converters - support bytes in Avro top-level union types (#2762))
>>>>>>> 7b0539b808 (GEOMESA-3061 Converters - support bytes in Avro top-level union types (#2762))
=======
>>>>>>> 3e7fb62639 (GEOMESA-3061 Converters - support bytes in Avro top-level union types (#2762))
=======
>>>>>>> eff03389ef (GEOMESA-3176 Docs - fix download links in install instructions)
=======
>>>>>>> 8035cc5893 (GEOMESA-3061 Converters - support bytes in Avro top-level union types (#2762))
=======
>>>>>>> b800c052cc (GEOMESA-3061 Converters - support bytes in Avro top-level union types (#2762))
=======
>>>>>>> b7b8a67dc7 (GEOMESA-3176 Docs - fix download links in install instructions)
=======
=======
>>>>>>> 9a4dff9e4f (GEOMESA-3061 Converters - support bytes in Avro top-level union types (#2762))
<<<<<<< HEAD
>>>>>>> 7b8c8dcc3d (GEOMESA-3061 Converters - support bytes in Avro top-level union types (#2762))
=======
=======
>>>>>>> a12ea194c8 (GEOMESA-3176 Docs - fix download links in install instructions)
=======
>>>>>>> 1cc4dadf2e (GEOMESA-3176 Docs - fix download links in install instructions)
>>>>>>> 057f644239 (GEOMESA-3176 Docs - fix download links in install instructions)
=======
>>>>>>> 4f51687745 (GEOMESA-3061 Converters - support bytes in Avro top-level union types (#2762))
=======
>>>>>>> 0b36b46b5f (GEOMESA-3176 Docs - fix download links in install instructions)
=======
>>>>>>> a2ed7a128d (GEOMESA-3176 Docs - fix download links in install instructions)
=======
>>>>>>> 53a3e72cbf (GEOMESA-3061 Converters - support bytes in Avro top-level union types (#2762))
>>>>>>> 7b0539b808 (GEOMESA-3061 Converters - support bytes in Avro top-level union types (#2762))
=======
>>>>>>> cc89a73032 (GEOMESA-3061 Converters - support bytes in Avro top-level union types (#2762))
=======
>>>>>>> 256a642cc1 (GEOMESA-3176 Docs - fix download links in install instructions)
=======
>>>>>>> 1890b11217 (GEOMESA-3061 Converters - support bytes in Avro top-level union types (#2762))
=======
>>>>>>> 2142d07ded (GEOMESA-3176 Docs - fix download links in install instructions)
=======
>>>>>>> 53a3e72cbf (GEOMESA-3061 Converters - support bytes in Avro top-level union types (#2762))
>>>>>>> 7b0539b808 (GEOMESA-3061 Converters - support bytes in Avro top-level union types (#2762))
=======
>>>>>>> 8150bc0e65 (GEOMESA-3176 Docs - fix download links in install instructions)
=======
<<<<<<< HEAD
>>>>>>> 0b168af9c8 (GEOMESA-3176 Docs - fix download links in install instructions)
=======
>>>>>>> 8035cc5893 (GEOMESA-3061 Converters - support bytes in Avro top-level union types (#2762))
=======
<<<<<<< HEAD
>>>>>>> ecfd546311 (GEOMESA-3061 Converters - support bytes in Avro top-level union types (#2762))
=======
>>>>>>> b7c6b904be (GEOMESA-3176 Docs - fix download links in install instructions)
=======
>>>>>>> 79d78e33bb (GEOMESA-3176 Docs - fix download links in install instructions)
>>>>>>> 90ec70f55 (GEOMESA-3176 Docs - fix download links in install instructions)
<<<<<<< HEAD
<<<<<<< HEAD
<<<<<<< HEAD
>>>>>>> 63db7d154a (GEOMESA-3176 Docs - fix download links in install instructions)
=======
=======
>>>>>>> 6eb31fb65 (GEOMESA-3061 Converters - support bytes in Avro top-level union types (#2762))
<<<<<<< HEAD
<<<<<<< HEAD
<<<<<<< HEAD
<<<<<<< HEAD
<<<<<<< HEAD
<<<<<<< HEAD
<<<<<<< HEAD
=======
<<<<<<< HEAD
>>>>>>> 5cf31d21f3 (GEOMESA-3061 Converters - support bytes in Avro top-level union types (#2762))
=======
>>>>>>> 92674ff9d4 (GEOMESA-3061 Converters - support bytes in Avro top-level union types (#2762))
<<<<<<< HEAD
>>>>>>> 009a284072 (GEOMESA-3061 Converters - support bytes in Avro top-level union types (#2762))
=======
=======
>>>>>>> 2586fa6a40 (GEOMESA-3061 Converters - support bytes in Avro top-level union types (#2762))
>>>>>>> d329320e6a (GEOMESA-3061 Converters - support bytes in Avro top-level union types (#2762))
=======
>>>>>>> 4f51687745 (GEOMESA-3061 Converters - support bytes in Avro top-level union types (#2762))
>>>>>>> 28e2bfa2dc (GEOMESA-3061 Converters - support bytes in Avro top-level union types (#2762))
=======
>>>>>>> 76618c8da3 (GEOMESA-3061 Converters - support bytes in Avro top-level union types (#2762))
=======
<<<<<<< HEAD
<<<<<<< HEAD
=======
>>>>>>> 4f51687745 (GEOMESA-3061 Converters - support bytes in Avro top-level union types (#2762))
>>>>>>> 72bafaf54b (GEOMESA-3061 Converters - support bytes in Avro top-level union types (#2762))
=======
>>>>>>> 947a867d1c (GEOMESA-3061 Converters - support bytes in Avro top-level union types (#2762))
=======
>>>>>>> a910ae135f (GEOMESA-3061 Converters - support bytes in Avro top-level union types (#2762))
=======
<<<<<<< HEAD
<<<<<<< HEAD
<<<<<<< HEAD
>>>>>>> d4c5768cfa (GEOMESA-3061 Converters - support bytes in Avro top-level union types (#2762))
=======
=======
<<<<<<< HEAD
>>>>>>> 5cf31d21f3 (GEOMESA-3061 Converters - support bytes in Avro top-level union types (#2762))
=======
>>>>>>> 92674ff9d4 (GEOMESA-3061 Converters - support bytes in Avro top-level union types (#2762))
>>>>>>> 009a284072 (GEOMESA-3061 Converters - support bytes in Avro top-level union types (#2762))
=======
>>>>>>> d4c5768cfa (GEOMESA-3061 Converters - support bytes in Avro top-level union types (#2762))
=======
>>>>>>> 2586fa6a40 (GEOMESA-3061 Converters - support bytes in Avro top-level union types (#2762))
=======
=======
>>>>>>> d4c5768cfa (GEOMESA-3061 Converters - support bytes in Avro top-level union types (#2762))
=======
=======
>>>>>>> 4f51687745 (GEOMESA-3061 Converters - support bytes in Avro top-level union types (#2762))

>>>>>>> b9bdd406e (GEOMESA-3061 Converters - support bytes in Avro top-level union types (#2762))
<<<<<<< HEAD
<<<<<<< HEAD
<<<<<<< HEAD
<<<<<<< HEAD
<<<<<<< HEAD
=======
>>>>>>> 5cf31d21f3 (GEOMESA-3061 Converters - support bytes in Avro top-level union types (#2762))
=======
>>>>>>> 4f51687745 (GEOMESA-3061 Converters - support bytes in Avro top-level union types (#2762))
>>>>>>> b4320946b4 (GEOMESA-3061 Converters - support bytes in Avro top-level union types (#2762))
=======
>>>>>>> 3be8d2a5a4 (Merge branch 'feature/postgis-fixes')
=======
=======

>>>>>>> b9bdd406e (GEOMESA-3061 Converters - support bytes in Avro top-level union types (#2762))
>>>>>>> d9ed077cd1 (GEOMESA-3061 Converters - support bytes in Avro top-level union types (#2762))
=======
=======
<<<<<<< HEAD
<<<<<<< HEAD
>>>>>>> c1f99f4bcb (GEOMESA-3061 Converters - support bytes in Avro top-level union types (#2762))
=======
<<<<<<< HEAD
<<<<<<< HEAD
<<<<<<< HEAD
>>>>>>> 6eb31fb65 (GEOMESA-3061 Converters - support bytes in Avro top-level union types (#2762))
=======
<<<<<<< HEAD
<<<<<<< HEAD
<<<<<<< HEAD
<<<<<<< HEAD
=======
>>>>>>> f91e29a57f (GEOMESA-3061 Converters - support bytes in Avro top-level union types (#2762))
=======
>>>>>>> 8435590eee (GEOMESA-3061 Converters - support bytes in Avro top-level union types (#2762))
>>>>>>> 15e998504 (GEOMESA-3176 Docs - fix download links in install instructions)
=======
>>>>>>> 07a6a5c29 (GEOMESA-3061 Converters - support bytes in Avro top-level union types (#2762))
=======
>>>>>>> 67b361c85 (GEOMESA-3061 Converters - support bytes in Avro top-level union types (#2762))
=======
<<<<<<< HEAD
<<<<<<< HEAD
<<<<<<< HEAD
<<<<<<< HEAD
=======
>>>>>>> d72089513c (GEOMESA-3176 Docs - fix download links in install instructions)
=======
>>>>>>> 5712753579 (GEOMESA-3176 Docs - fix download links in install instructions)
=======
>>>>>>> 90ec70f55 (GEOMESA-3176 Docs - fix download links in install instructions)
>>>>>>> 63db7d154 (GEOMESA-3176 Docs - fix download links in install instructions)
=======
<<<<<<< HEAD
<<<<<<< HEAD
<<<<<<< HEAD
<<<<<<< HEAD
=======
>>>>>>> 28e2bfa2d (GEOMESA-3061 Converters - support bytes in Avro top-level union types (#2762))
=======
>>>>>>> 2bce465a3f (GEOMESA-3061 Converters - support bytes in Avro top-level union types (#2762))
=======
>>>>>>> 6eb31fb65 (GEOMESA-3061 Converters - support bytes in Avro top-level union types (#2762))
=======
<<<<<<< HEAD
>>>>>>> 1f17117603 (GEOMESA-3061 Converters - support bytes in Avro top-level union types (#2762))
=======
>>>>>>> 15e998504 (GEOMESA-3176 Docs - fix download links in install instructions)
=======
<<<<<<< HEAD
<<<<<<< HEAD
>>>>>>> e5cf96e863 (GEOMESA-3176 Docs - fix download links in install instructions)
=======
>>>>>>> 07a6a5c29 (GEOMESA-3061 Converters - support bytes in Avro top-level union types (#2762))
=======
>>>>>>> 732efe4910 (GEOMESA-3061 Converters - support bytes in Avro top-level union types (#2762))
=======
>>>>>>> 2a887f75bf (GEOMESA-3061 Converters - support bytes in Avro top-level union types (#2762))
=======
>>>>>>> d72089513c (GEOMESA-3176 Docs - fix download links in install instructions)
=======
=======
>>>>>>> 28e2bfa2d (GEOMESA-3061 Converters - support bytes in Avro top-level union types (#2762))
>>>>>>> f91e29a57f (GEOMESA-3061 Converters - support bytes in Avro top-level union types (#2762))
=======
>>>>>>> 4f51687745 (GEOMESA-3061 Converters - support bytes in Avro top-level union types (#2762))
=======
>>>>>>> c1f99f4bcb (GEOMESA-3061 Converters - support bytes in Avro top-level union types (#2762))
=======
>>>>>>> b8545eda8f (GEOMESA-3061 Converters - support bytes in Avro top-level union types (#2762))
=======
>>>>>>> 6eb31fb65 (GEOMESA-3061 Converters - support bytes in Avro top-level union types (#2762))
=======
>>>>>>> 420027bc3f (GEOMESA-3061 Converters - support bytes in Avro top-level union types (#2762))
=======
>>>>>>> 15e998504 (GEOMESA-3176 Docs - fix download links in install instructions)
=======
>>>>>>> 341ef96c9a (GEOMESA-3176 Docs - fix download links in install instructions)
=======
>>>>>>> 07a6a5c29 (GEOMESA-3061 Converters - support bytes in Avro top-level union types (#2762))
=======
>>>>>>> fc1024de7e (GEOMESA-3061 Converters - support bytes in Avro top-level union types (#2762))
=======
>>>>>>> 27c0ee7e6d (GEOMESA-3061 Converters - support bytes in Avro top-level union types (#2762))
=======
>>>>>>> 5712753579 (GEOMESA-3176 Docs - fix download links in install instructions)
=======
=======
>>>>>>> 28e2bfa2d (GEOMESA-3061 Converters - support bytes in Avro top-level union types (#2762))
>>>>>>> 8435590eee (GEOMESA-3061 Converters - support bytes in Avro top-level union types (#2762))

>>>>>>> b9bdd406e (GEOMESA-3061 Converters - support bytes in Avro top-level union types (#2762))
=======
>>>>>>> 16b2e83f2 (GEOMESA-3176 Docs - fix download links in install instructions)
<<<<<<< HEAD
<<<<<<< HEAD
<<<<<<< HEAD
<<<<<<< HEAD
<<<<<<< HEAD
<<<<<<< HEAD
<<<<<<< HEAD
<<<<<<< HEAD
<<<<<<< HEAD
<<<<<<< HEAD
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
>>>>>>> b8545eda8f (GEOMESA-3061 Converters - support bytes in Avro top-level union types (#2762))
=======
>>>>>>> 420027bc3f (GEOMESA-3061 Converters - support bytes in Avro top-level union types (#2762))
=======
>>>>>>> 341ef96c9a (GEOMESA-3176 Docs - fix download links in install instructions)
=======
>>>>>>> fc1024de7e (GEOMESA-3061 Converters - support bytes in Avro top-level union types (#2762))
=======
>>>>>>> 5712753579 (GEOMESA-3176 Docs - fix download links in install instructions)
=======
>>>>>>> 8435590eee (GEOMESA-3061 Converters - support bytes in Avro top-level union types (#2762))
>>>>>>> 8c9ca1211a (GEOMESA-3061 Converters - support bytes in Avro top-level union types (#2762))
=======
<<<<<<< HEAD
>>>>>>> c9c24ca3d7 (GEOMESA-3061 Converters - support bytes in Avro top-level union types (#2762))
<<<<<<< HEAD
<<<<<<< HEAD
=======
<<<<<<< HEAD
>>>>>>> b9c0fc77b9 (GEOMESA-3061 Converters - support bytes in Avro top-level union types (#2762))
=======
<<<<<<< HEAD
>>>>>>> aff2787fc2 (GEOMESA-3176 Docs - fix download links in install instructions)
<<<<<<< HEAD
<<<<<<< HEAD
=======
<<<<<<< HEAD
>>>>>>> d69216810e (GEOMESA-3061 Converters - support bytes in Avro top-level union types (#2762))
=======
<<<<<<< HEAD
>>>>>>> 0753bfcbe4 (GEOMESA-3176 Docs - fix download links in install instructions)
<<<<<<< HEAD
<<<<<<< HEAD
=======
<<<<<<< HEAD
>>>>>>> 17f16286aa (GEOMESA-3061 Converters - support bytes in Avro top-level union types (#2762))
=======
>>>>>>> 2bce465a3f (GEOMESA-3061 Converters - support bytes in Avro top-level union types (#2762))
=======
>>>>>>> 1f17117603 (GEOMESA-3061 Converters - support bytes in Avro top-level union types (#2762))
=======
>>>>>>> e5cf96e863 (GEOMESA-3176 Docs - fix download links in install instructions)
=======
>>>>>>> 732efe4910 (GEOMESA-3061 Converters - support bytes in Avro top-level union types (#2762))
=======
>>>>>>> d72089513c (GEOMESA-3176 Docs - fix download links in install instructions)
=======
>>>>>>> f91e29a57f (GEOMESA-3061 Converters - support bytes in Avro top-level union types (#2762))
=======
>>>>>>> 8c9ca1211a (GEOMESA-3061 Converters - support bytes in Avro top-level union types (#2762))
>>>>>>> 4f51687745 (GEOMESA-3061 Converters - support bytes in Avro top-level union types (#2762))
=======
>>>>>>> b8545eda8f (GEOMESA-3061 Converters - support bytes in Avro top-level union types (#2762))
=======
=======
<<<<<<< HEAD
>>>>>>> b9c0fc77b9 (GEOMESA-3061 Converters - support bytes in Avro top-level union types (#2762))
>>>>>>> 420027bc3f (GEOMESA-3061 Converters - support bytes in Avro top-level union types (#2762))
=======
>>>>>>> 341ef96c9a (GEOMESA-3176 Docs - fix download links in install instructions)
=======
=======
<<<<<<< HEAD
>>>>>>> d69216810e (GEOMESA-3061 Converters - support bytes in Avro top-level union types (#2762))
>>>>>>> fc1024de7e (GEOMESA-3061 Converters - support bytes in Avro top-level union types (#2762))
=======
>>>>>>> 5712753579 (GEOMESA-3176 Docs - fix download links in install instructions)
=======
=======
<<<<<<< HEAD
>>>>>>> 17f16286aa (GEOMESA-3061 Converters - support bytes in Avro top-level union types (#2762))
>>>>>>> 8435590eee (GEOMESA-3061 Converters - support bytes in Avro top-level union types (#2762))
>>>>>>> 2aa923cc97 (GEOMESA-3176 Docs - fix download links in install instructions)
=======
>>>>>>> c5e1827657 (GEOMESA-3061 Converters - support bytes in Avro top-level union types (#2762))
=======
>>>>>>> cdb410251 (GEOMESA-3061 Converters - support bytes in Avro top-level union types (#2762))
>>>>>>> 9d708b240a (GEOMESA-3061 Converters - support bytes in Avro top-level union types (#2762))
=======
=======
>>>>>>> 90ec70f55 (GEOMESA-3176 Docs - fix download links in install instructions)
>>>>>>> 8cbe155de6 (GEOMESA-3176 Docs - fix download links in install instructions)
<<<<<<< HEAD
<<<<<<< HEAD
=======
=======
<<<<<<< HEAD
>>>>>>> 64e2e43818 (GEOMESA-3176 Docs - fix download links in install instructions)
=======
<<<<<<< HEAD
<<<<<<< HEAD
<<<<<<< HEAD
<<<<<<< HEAD
<<<<<<< HEAD
<<<<<<< HEAD
<<<<<<< HEAD
=======
>>>>>>> 341ef96c9a (GEOMESA-3176 Docs - fix download links in install instructions)
=======
>>>>>>> fc1024de7e (GEOMESA-3061 Converters - support bytes in Avro top-level union types (#2762))
>>>>>>> 9627a2de6a (GEOMESA-3061 Converters - support bytes in Avro top-level union types (#2762))
=======
<<<<<<< HEAD
>>>>>>> b046434188 (GEOMESA-3176 Docs - fix download links in install instructions)
=======
<<<<<<< HEAD
<<<<<<< HEAD
<<<<<<< HEAD
<<<<<<< HEAD
<<<<<<< HEAD
<<<<<<< HEAD
<<<<<<< HEAD
=======
>>>>>>> 5712753579 (GEOMESA-3176 Docs - fix download links in install instructions)
=======
>>>>>>> 8435590eee (GEOMESA-3061 Converters - support bytes in Avro top-level union types (#2762))
>>>>>>> 76908c410a (GEOMESA-3061 Converters - support bytes in Avro top-level union types (#2762))
=======
=======
>>>>>>> aff2787fc2 (GEOMESA-3176 Docs - fix download links in install instructions)
<<<<<<< HEAD
<<<<<<< HEAD
=======
>>>>>>> fc1024de7e (GEOMESA-3061 Converters - support bytes in Avro top-level union types (#2762))
=======
>>>>>>> 9627a2de6a (GEOMESA-3061 Converters - support bytes in Avro top-level union types (#2762))
=======
>>>>>>> d69216810e (GEOMESA-3061 Converters - support bytes in Avro top-level union types (#2762))
<<<<<<< HEAD
<<<<<<< HEAD
=======
>>>>>>> 0753bfcbe4 (GEOMESA-3176 Docs - fix download links in install instructions)
=======
>>>>>>> 76908c410a (GEOMESA-3061 Converters - support bytes in Avro top-level union types (#2762))
=======
>>>>>>> 17f16286aa (GEOMESA-3061 Converters - support bytes in Avro top-level union types (#2762))
<<<<<<< HEAD
=======
>>>>>>> e5cf96e863 (GEOMESA-3176 Docs - fix download links in install instructions)
=======
>>>>>>> 9627a2de6a (GEOMESA-3061 Converters - support bytes in Avro top-level union types (#2762))
=======
>>>>>>> 732efe4910 (GEOMESA-3061 Converters - support bytes in Avro top-level union types (#2762))
=======
>>>>>>> d72089513c (GEOMESA-3176 Docs - fix download links in install instructions)
=======
>>>>>>> 76908c410a (GEOMESA-3061 Converters - support bytes in Avro top-level union types (#2762))
=======
>>>>>>> f91e29a57f (GEOMESA-3061 Converters - support bytes in Avro top-level union types (#2762))
=======
>>>>>>> 341ef96c9a (GEOMESA-3176 Docs - fix download links in install instructions)
=======
>>>>>>> fc1024de7e (GEOMESA-3061 Converters - support bytes in Avro top-level union types (#2762))
=======
=======
>>>>>>> 0753bfcbe4 (GEOMESA-3176 Docs - fix download links in install instructions)
>>>>>>> 5712753579 (GEOMESA-3176 Docs - fix download links in install instructions)
=======
>>>>>>> 8435590eee (GEOMESA-3061 Converters - support bytes in Avro top-level union types (#2762))
>>>>>>> 6eb31fb65 (GEOMESA-3061 Converters - support bytes in Avro top-level union types (#2762))
>>>>>>> 5f428db977 (GEOMESA-3061 Converters - support bytes in Avro top-level union types (#2762))
=======
>>>>>>> 0e68e9f4c (GEOMESA-3061 Converters - support bytes in Avro top-level union types (#2762))
<<<<<<< HEAD
<<<<<<< HEAD
<<<<<<< HEAD
=======
>>>>>>> 1ce7179e65 (GEOMESA-3176 Docs - fix download links in install instructions)
>>>>>>> 76618c8da3 (GEOMESA-3061 Converters - support bytes in Avro top-level union types (#2762))
=======
=======
>>>>>>> 15e998504 (GEOMESA-3176 Docs - fix download links in install instructions)
<<<<<<< HEAD
<<<<<<< HEAD
<<<<<<< HEAD
<<<<<<< HEAD
=======
>>>>>>> 211b96b2ed (GEOMESA-3061 Converters - support bytes in Avro top-level union types (#2762))
>>>>>>> 0fbf9e83e2 (GEOMESA-3176 Docs - fix download links in install instructions)
=======
=======
>>>>>>> 07a6a5c29 (GEOMESA-3061 Converters - support bytes in Avro top-level union types (#2762))
<<<<<<< HEAD
<<<<<<< HEAD
<<<<<<< HEAD
>>>>>>> 89bdd3013e (GEOMESA-3061 Converters - support bytes in Avro top-level union types (#2762))
=======
=======
>>>>>>> 67b361c85 (GEOMESA-3061 Converters - support bytes in Avro top-level union types (#2762))
<<<<<<< HEAD
<<<<<<< HEAD
>>>>>>> c8a325e13c (GEOMESA-3061 Converters - support bytes in Avro top-level union types (#2762))
=======
=======
>>>>>>> a12ea194c8 (GEOMESA-3176 Docs - fix download links in install instructions)
=======
=======
>>>>>>> 90ec70f55 (GEOMESA-3176 Docs - fix download links in install instructions)
>>>>>>> 63db7d154 (GEOMESA-3176 Docs - fix download links in install instructions)
<<<<<<< HEAD
<<<<<<< HEAD
<<<<<<< HEAD
<<<<<<< HEAD
<<<<<<< HEAD
<<<<<<< HEAD
<<<<<<< HEAD
=======
>>>>>>> d329320e6a (GEOMESA-3061 Converters - support bytes in Avro top-level union types (#2762))
=======
>>>>>>> 1cc4dadf2e (GEOMESA-3176 Docs - fix download links in install instructions)
=======
>>>>>>> 2586fa6a40 (GEOMESA-3061 Converters - support bytes in Avro top-level union types (#2762))
<<<<<<< HEAD
=======
=======
>>>>>>> 1cc4dadf2e (GEOMESA-3176 Docs - fix download links in install instructions)
>>>>>>> 057f644239 (GEOMESA-3176 Docs - fix download links in install instructions)
=======
>>>>>>> d329320e6a (GEOMESA-3061 Converters - support bytes in Avro top-level union types (#2762))
>>>>>>> f9e8439b09 (GEOMESA-3176 Docs - fix download links in install instructions)
=======
=======
>>>>>>> 28e2bfa2d (GEOMESA-3061 Converters - support bytes in Avro top-level union types (#2762))
<<<<<<< HEAD
<<<<<<< HEAD
>>>>>>> 72bafaf54b (GEOMESA-3061 Converters - support bytes in Avro top-level union types (#2762))
=======
=======
>>>>>>> bdbced26d4 (GEOMESA-3061 Converters - support bytes in Avro top-level union types (#2762))
=======
=======

>>>>>>> b9bdd406e (GEOMESA-3061 Converters - support bytes in Avro top-level union types (#2762))
>>>>>>> b4320946b (GEOMESA-3061 Converters - support bytes in Avro top-level union types (#2762))
<<<<<<< HEAD
<<<<<<< HEAD
<<<<<<< HEAD
<<<<<<< HEAD
<<<<<<< HEAD
<<<<<<< HEAD
<<<<<<< HEAD
<<<<<<< HEAD
<<<<<<< HEAD
<<<<<<< HEAD
<<<<<<< HEAD
<<<<<<< HEAD
<<<<<<< HEAD
<<<<<<< HEAD
<<<<<<< HEAD
<<<<<<< HEAD
<<<<<<< HEAD
<<<<<<< HEAD
<<<<<<< HEAD
<<<<<<< HEAD
<<<<<<< HEAD
<<<<<<< HEAD
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
>>>>>>> 217b7d1cb9 (Merge branch 'feature/postgis-fixes')
=======
>>>>>>> 6c83981af3 (GEOMESA-3061 Converters - support bytes in Avro top-level union types (#2762))
=======
>>>>>>> b6e56a9e80 (Merge branch 'feature/postgis-fixes')
=======
>>>>>>> 72962fe615 (GEOMESA-3061 Converters - support bytes in Avro top-level union types (#2762))
=======
>>>>>>> 0a5b74c946 (Merge branch 'feature/postgis-fixes')
=======
>>>>>>> 7925093789 (GEOMESA-3061 Converters - support bytes in Avro top-level union types (#2762))
=======
>>>>>>> a30a0c1a2a (Merge branch 'feature/postgis-fixes')
=======
>>>>>>> 0fc6650ecf (GEOMESA-3061 Converters - support bytes in Avro top-level union types (#2762))
=======
>>>>>>> 67de3c3202 (Merge branch 'feature/postgis-fixes')
<<<<<<< HEAD
<<<<<<< HEAD
=======
>>>>>>> 1e39c0c27d (GEOMESA-3061 Converters - support bytes in Avro top-level union types (#2762))
=======
>>>>>>> 638b68d081 (Merge branch 'feature/postgis-fixes')
<<<<<<< HEAD
<<<<<<< HEAD
=======
>>>>>>> d0785cf307 (GEOMESA-3061 Converters - support bytes in Avro top-level union types (#2762))
=======
>>>>>>> 71adb695c5 (Merge branch 'feature/postgis-fixes')
<<<<<<< HEAD
<<<<<<< HEAD
=======
>>>>>>> fd5565dfba (GEOMESA-3061 Converters - support bytes in Avro top-level union types (#2762))
=======
>>>>>>> 30559ea5c9 (Merge branch 'feature/postgis-fixes')
<<<<<<< HEAD
=======
>>>>>>> db9dfb6f14 (GEOMESA-3061 Converters - support bytes in Avro top-level union types (#2762))
=======
>>>>>>> f893d9a594 (Merge branch 'feature/postgis-fixes')
=======
>>>>>>> 63546aacdc (GEOMESA-3061 Converters - support bytes in Avro top-level union types (#2762))
=======
>>>>>>> 964e86145a (Merge branch 'feature/postgis-fixes')
=======
>>>>>>> dbd932fed6 (GEOMESA-3061 Converters - support bytes in Avro top-level union types (#2762))
=======
>>>>>>> bf6bde0830 (Merge branch 'feature/postgis-fixes')
=======
=======
>>>>>>> 0fc6650ecf (GEOMESA-3061 Converters - support bytes in Avro top-level union types (#2762))
>>>>>>> c029a43a6c (GEOMESA-3061 Converters - support bytes in Avro top-level union types (#2762))
=======
>>>>>>> 217b7d1cb9 (Merge branch 'feature/postgis-fixes')
=======
=======
>>>>>>> 1e39c0c27d (GEOMESA-3061 Converters - support bytes in Avro top-level union types (#2762))
>>>>>>> 6c83981af3 (GEOMESA-3061 Converters - support bytes in Avro top-level union types (#2762))
=======
>>>>>>> b6e56a9e80 (Merge branch 'feature/postgis-fixes')
=======
=======
>>>>>>> d0785cf307 (GEOMESA-3061 Converters - support bytes in Avro top-level union types (#2762))
>>>>>>> 72962fe615 (GEOMESA-3061 Converters - support bytes in Avro top-level union types (#2762))
=======
>>>>>>> 0a5b74c946 (Merge branch 'feature/postgis-fixes')
=======
=======
>>>>>>> fd5565dfba (GEOMESA-3061 Converters - support bytes in Avro top-level union types (#2762))
>>>>>>> 7925093789 (GEOMESA-3061 Converters - support bytes in Avro top-level union types (#2762))
=======
>>>>>>> a30a0c1a2a (Merge branch 'feature/postgis-fixes')
>>>>>>> 97ec7d864a (GEOMESA-3061 Converters - support bytes in Avro top-level union types (#2762))
=======
=======
>>>>>>> bc4062951d (GEOMESA-3061 Converters - support bytes in Avro top-level union types (#2762))
=======
<<<<<<< HEAD
<<<<<<< HEAD
<<<<<<< HEAD
<<<<<<< HEAD
<<<<<<< HEAD
<<<<<<< HEAD
=======
>>>>>>> 6c83981af3 (GEOMESA-3061 Converters - support bytes in Avro top-level union types (#2762))
=======
>>>>>>> b6e56a9e80 (Merge branch 'feature/postgis-fixes')
>>>>>>> e944f1c88b (Merge branch 'feature/postgis-fixes')
=======
=======
<<<<<<< HEAD
<<<<<<< HEAD
<<<<<<< HEAD
<<<<<<< HEAD
<<<<<<< HEAD
<<<<<<< HEAD
>>>>>>> 26e5afc4ea (Merge branch 'feature/postgis-fixes')
=======
>>>>>>> 1df8328338 (GEOMESA-3061 Converters - support bytes in Avro top-level union types (#2762))
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
>>>>>>> 1df8328338 (GEOMESA-3061 Converters - support bytes in Avro top-level union types (#2762))
=======
>>>>>>> fd5565dfba (GEOMESA-3061 Converters - support bytes in Avro top-level union types (#2762))
=======
>>>>>>> 30559ea5c9 (Merge branch 'feature/postgis-fixes')
>>>>>>> d94c03a98e (GEOMESA-3061 Converters - support bytes in Avro top-level union types (#2762))
>>>>>>> 8de43cccf6 (GEOMESA-3061 Converters - support bytes in Avro top-level union types (#2762))
=======
>>>>>>> cb6bda89b6 (Merge branch 'feature/postgis-fixes')
=======
<<<<<<< HEAD
<<<<<<< HEAD
>>>>>>> 25063957fc (GEOMESA-3061 Converters - support bytes in Avro top-level union types (#2762))
=======
>>>>>>> 699117eca9 (Merge branch 'feature/postgis-fixes')
=======
<<<<<<< HEAD
=======
>>>>>>> 1e39c0c27d (GEOMESA-3061 Converters - support bytes in Avro top-level union types (#2762))
=======
>>>>>>> e944f1c88b (Merge branch 'feature/postgis-fixes')
=======
>>>>>>> 638b68d081 (Merge branch 'feature/postgis-fixes')
=======
>>>>>>> d94c03a98e (GEOMESA-3061 Converters - support bytes in Avro top-level union types (#2762))
>>>>>>> 8de43cccf6 (GEOMESA-3061 Converters - support bytes in Avro top-level union types (#2762))
=======
>>>>>>> d0785cf307 (GEOMESA-3061 Converters - support bytes in Avro top-level union types (#2762))
=======
>>>>>>> 71adb695c5 (Merge branch 'feature/postgis-fixes')
=======
>>>>>>> 25063957fc (GEOMESA-3061 Converters - support bytes in Avro top-level union types (#2762))
=======
>>>>>>> fd5565dfba (GEOMESA-3061 Converters - support bytes in Avro top-level union types (#2762))
=======
>>>>>>> 30559ea5c9 (Merge branch 'feature/postgis-fixes')
=======
>>>>>>> db9dfb6f14 (GEOMESA-3061 Converters - support bytes in Avro top-level union types (#2762))
=======
>>>>>>> e944f1c88b (Merge branch 'feature/postgis-fixes')
=======
>>>>>>> f893d9a594 (Merge branch 'feature/postgis-fixes')
=======
>>>>>>> d94c03a98e (GEOMESA-3061 Converters - support bytes in Avro top-level union types (#2762))
>>>>>>> 8de43cccf6 (GEOMESA-3061 Converters - support bytes in Avro top-level union types (#2762))
=======
>>>>>>> 63546aacdc (GEOMESA-3061 Converters - support bytes in Avro top-level union types (#2762))
=======
=======
>>>>>>> 72962fe615 (GEOMESA-3061 Converters - support bytes in Avro top-level union types (#2762))
=======
>>>>>>> 0a5b74c946 (Merge branch 'feature/postgis-fixes')
>>>>>>> 26e5afc4ea (Merge branch 'feature/postgis-fixes')
=======
>>>>>>> 1df8328338 (GEOMESA-3061 Converters - support bytes in Avro top-level union types (#2762))
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
>>>>>>> 1df8328338 (GEOMESA-3061 Converters - support bytes in Avro top-level union types (#2762))
=======
>>>>>>> fd5565dfba (GEOMESA-3061 Converters - support bytes in Avro top-level union types (#2762))
=======
>>>>>>> 30559ea5c9 (Merge branch 'feature/postgis-fixes')
>>>>>>> d94c03a98e (GEOMESA-3061 Converters - support bytes in Avro top-level union types (#2762))
>>>>>>> 8de43cccf6 (GEOMESA-3061 Converters - support bytes in Avro top-level union types (#2762))
=======
>>>>>>> cb6bda89b6 (Merge branch 'feature/postgis-fixes')
=======
<<<<<<< HEAD
<<<<<<< HEAD
<<<<<<< HEAD
>>>>>>> 964e86145a (Merge branch 'feature/postgis-fixes')
=======
=======
>>>>>>> 0a5b74c946 (Merge branch 'feature/postgis-fixes')
=======
>>>>>>> 7925093789 (GEOMESA-3061 Converters - support bytes in Avro top-level union types (#2762))
>>>>>>> 25063957fc (GEOMESA-3061 Converters - support bytes in Avro top-level union types (#2762))
=======
<<<<<<< HEAD
>>>>>>> dbd932fed6 (GEOMESA-3061 Converters - support bytes in Avro top-level union types (#2762))
=======
>>>>>>> 699117eca9 (Merge branch 'feature/postgis-fixes')
=======
<<<<<<< HEAD
<<<<<<< HEAD
>>>>>>> bf6bde0830 (Merge branch 'feature/postgis-fixes')
=======
=======
>>>>>>> a30a0c1a2a (Merge branch 'feature/postgis-fixes')
=======
>>>>>>> 1e39c0c27d (GEOMESA-3061 Converters - support bytes in Avro top-level union types (#2762))
<<<<<<< HEAD
>>>>>>> 6c83981af3 (GEOMESA-3061 Converters - support bytes in Avro top-level union types (#2762))
=======
=======
>>>>>>> e944f1c88b (Merge branch 'feature/postgis-fixes')
=======
>>>>>>> 638b68d081 (Merge branch 'feature/postgis-fixes')
<<<<<<< HEAD
>>>>>>> b6e56a9e80 (Merge branch 'feature/postgis-fixes')
=======
=======
>>>>>>> d94c03a98e (GEOMESA-3061 Converters - support bytes in Avro top-level union types (#2762))
>>>>>>> 8de43cccf6 (GEOMESA-3061 Converters - support bytes in Avro top-level union types (#2762))
=======
>>>>>>> d0785cf307 (GEOMESA-3061 Converters - support bytes in Avro top-level union types (#2762))
<<<<<<< HEAD
>>>>>>> 72962fe615 (GEOMESA-3061 Converters - support bytes in Avro top-level union types (#2762))
=======
=======
>>>>>>> 71adb695c5 (Merge branch 'feature/postgis-fixes')
<<<<<<< HEAD
>>>>>>> 0a5b74c946 (Merge branch 'feature/postgis-fixes')
=======
=======
>>>>>>> 25063957fc (GEOMESA-3061 Converters - support bytes in Avro top-level union types (#2762))
=======
>>>>>>> fd5565dfba (GEOMESA-3061 Converters - support bytes in Avro top-level union types (#2762))
<<<<<<< HEAD
>>>>>>> 7925093789 (GEOMESA-3061 Converters - support bytes in Avro top-level union types (#2762))
=======
=======
>>>>>>> 30559ea5c9 (Merge branch 'feature/postgis-fixes')
>>>>>>> a30a0c1a2a (Merge branch 'feature/postgis-fixes')
>>>>>>> 3be8d2a5a (Merge branch 'feature/postgis-fixes')
<<<<<<< HEAD
>>>>>>> db8d998aa2 (Merge branch 'feature/postgis-fixes')
=======
>>>>>>> d845d7c1bd (GEOMESA-3254 Add Bloop build support)
=======
>>>>>>> 0dbede148d (GEOMESA-3061 Converters - support bytes in Avro top-level union types (#2762))
=======
=======

>>>>>>> b9bdd406e (GEOMESA-3061 Converters - support bytes in Avro top-level union types (#2762))
<<<<<<< HEAD
<<<<<<< HEAD
<<<<<<< HEAD
<<<<<<< HEAD
<<<<<<< HEAD
<<<<<<< HEAD
<<<<<<< HEAD
=======
>>>>>>> b1f71c0764 (GEOMESA-3061 Converters - support bytes in Avro top-level union types (#2762))
=======
>>>>>>> 1bb69524c2 (GEOMESA-3061 Converters - support bytes in Avro top-level union types (#2762))
=======
>>>>>>> a1f15598cb (GEOMESA-3061 Converters - support bytes in Avro top-level union types (#2762))
<<<<<<< HEAD
=======
>>>>>>> b8ebbf6083 (GEOMESA-3061 Converters - support bytes in Avro top-level union types (#2762))
=======
=======
>>>>>>> 1bb69524c2 (GEOMESA-3061 Converters - support bytes in Avro top-level union types (#2762))
>>>>>>> a5b0374ee2 (GEOMESA-3061 Converters - support bytes in Avro top-level union types (#2762))
=======
>>>>>>> b1f71c0764 (GEOMESA-3061 Converters - support bytes in Avro top-level union types (#2762))
>>>>>>> 6d9a5b626c (GEOMESA-3061 Converters - support bytes in Avro top-level union types (#2762))
=======
=======
>>>>>>> 6eb31fb652 (GEOMESA-3061 Converters - support bytes in Avro top-level union types (#2762))
=======
<<<<<<< HEAD
<<<<<<< HEAD
>>>>>>> 07a6a5c291 (GEOMESA-3061 Converters - support bytes in Avro top-level union types (#2762))
=======
>>>>>>> 67b361c856 (GEOMESA-3061 Converters - support bytes in Avro top-level union types (#2762))
=======
<<<<<<< HEAD
<<<<<<< HEAD
=======
>>>>>>> 28e2bfa2dc (GEOMESA-3061 Converters - support bytes in Avro top-level union types (#2762))
=======
>>>>>>> 5f428db977 (GEOMESA-3061 Converters - support bytes in Avro top-level union types (#2762))
=======
<<<<<<< HEAD
<<<<<<< HEAD
>>>>>>> 76618c8da3 (GEOMESA-3061 Converters - support bytes in Avro top-level union types (#2762))
=======
>>>>>>> 0fbf9e83e2 (GEOMESA-3176 Docs - fix download links in install instructions)
=======
<<<<<<< HEAD
<<<<<<< HEAD
>>>>>>> 89bdd3013e (GEOMESA-3061 Converters - support bytes in Avro top-level union types (#2762))
=======
>>>>>>> c8a325e13c (GEOMESA-3061 Converters - support bytes in Avro top-level union types (#2762))
=======
<<<<<<< HEAD
<<<<<<< HEAD
<<<<<<< HEAD
<<<<<<< HEAD
>>>>>>> f9e8439b09 (GEOMESA-3176 Docs - fix download links in install instructions)
=======
=======
<<<<<<< HEAD
<<<<<<< HEAD
<<<<<<< HEAD
>>>>>>> 97ec7d864a (GEOMESA-3061 Converters - support bytes in Avro top-level union types (#2762))
=======
>>>>>>> db8d998aa2 (Merge branch 'feature/postgis-fixes')
=======
=======
>>>>>>> 97ec7d864a (GEOMESA-3061 Converters - support bytes in Avro top-level union types (#2762))
=======
<<<<<<< HEAD
>>>>>>> 4864cfc581 (GEOMESA-3061 Converters - support bytes in Avro top-level union types (#2762))
=======
>>>>>>> db8d998aa2 (Merge branch 'feature/postgis-fixes')
=======
>>>>>>> 264c9fa240 (Merge branch 'feature/postgis-fixes')
>>>>>>> 28e2bfa2d (GEOMESA-3061 Converters - support bytes in Avro top-level union types (#2762))
>>>>>>> 72bafaf54b (GEOMESA-3061 Converters - support bytes in Avro top-level union types (#2762))
=======
=======
>>>>>>> 94fecee1d8 (GEOMESA-3061 Converters - support bytes in Avro top-level union types (#2762))
=======
>>>>>>> f9e8439b09 (GEOMESA-3176 Docs - fix download links in install instructions)
=======
>>>>>>> 798faeb761 (GEOMESA-3176 Docs - fix download links in install instructions)
=======
>>>>>>> 28e2bfa2d (GEOMESA-3061 Converters - support bytes in Avro top-level union types (#2762))
>>>>>>> 72bafaf54b (GEOMESA-3061 Converters - support bytes in Avro top-level union types (#2762))
=======
>>>>>>> 7ca1082a3f (GEOMESA-3061 Converters - support bytes in Avro top-level union types (#2762))
=======
>>>>>>> 99a32a726d (GEOMESA-3061 Converters - support bytes in Avro top-level union types (#2762))
=======
>>>>>>> 76618c8da3 (GEOMESA-3061 Converters - support bytes in Avro top-level union types (#2762))
=======
>>>>>>> cb5e2daf2b (GEOMESA-3061 Converters - support bytes in Avro top-level union types (#2762))
=======
>>>>>>> 95f020af8c (GEOMESA-3176 Docs - fix download links in install instructions)
=======
>>>>>>> 89bdd3013e (GEOMESA-3061 Converters - support bytes in Avro top-level union types (#2762))
=======
>>>>>>> 02bb344987 (GEOMESA-3061 Converters - support bytes in Avro top-level union types (#2762))
=======
>>>>>>> 00e61f4b70 (GEOMESA-3061 Converters - support bytes in Avro top-level union types (#2762))
=======
>>>>>>> f9e8439b09 (GEOMESA-3176 Docs - fix download links in install instructions)
=======
>>>>>>> 26c7d06850 (GEOMESA-3176 Docs - fix download links in install instructions)
=======
>>>>>>> 28e2bfa2d (GEOMESA-3061 Converters - support bytes in Avro top-level union types (#2762))
>>>>>>> 72bafaf54b (GEOMESA-3061 Converters - support bytes in Avro top-level union types (#2762))
=======
>>>>>>> a512d6b917 (GEOMESA-3061 Converters - support bytes in Avro top-level union types (#2762))
>>>>>>> 90ec70f55 (GEOMESA-3176 Docs - fix download links in install instructions)
>>>>>>> 63db7d154a (GEOMESA-3176 Docs - fix download links in install instructions)
=======
>>>>>>> 6eb31fb65 (GEOMESA-3061 Converters - support bytes in Avro top-level union types (#2762))
=======
>>>>>>> c5e1827657 (GEOMESA-3061 Converters - support bytes in Avro top-level union types (#2762))
=======
>>>>>>> 9d708b240a (GEOMESA-3061 Converters - support bytes in Avro top-level union types (#2762))
=======
<<<<<<< HEAD
<<<<<<< HEAD
=======
>>>>>>> b47097b7bb (GEOMESA-3176 Docs - fix download links in install instructions)
=======
>>>>>>> 90ec70f55 (GEOMESA-3176 Docs - fix download links in install instructions)
>>>>>>> 8cbe155de6 (GEOMESA-3176 Docs - fix download links in install instructions)
=======
<<<<<<< HEAD
<<<<<<< HEAD
>>>>>>> 6eb31fb65 (GEOMESA-3061 Converters - support bytes in Avro top-level union types (#2762))
=======
<<<<<<< HEAD
<<<<<<< HEAD
<<<<<<< HEAD
=======
>>>>>>> a512d6b917 (GEOMESA-3061 Converters - support bytes in Avro top-level union types (#2762))
>>>>>>> 15e998504 (GEOMESA-3176 Docs - fix download links in install instructions)
=======
>>>>>>> 07a6a5c29 (GEOMESA-3061 Converters - support bytes in Avro top-level union types (#2762))
=======
>>>>>>> 67b361c85 (GEOMESA-3061 Converters - support bytes in Avro top-level union types (#2762))
=======
<<<<<<< HEAD
<<<<<<< HEAD
<<<<<<< HEAD
<<<<<<< HEAD
=======
>>>>>>> 798faeb761 (GEOMESA-3176 Docs - fix download links in install instructions)
=======
>>>>>>> 26c7d06850 (GEOMESA-3176 Docs - fix download links in install instructions)
=======
>>>>>>> 90ec70f55 (GEOMESA-3176 Docs - fix download links in install instructions)
>>>>>>> 63db7d154 (GEOMESA-3176 Docs - fix download links in install instructions)
=======
<<<<<<< HEAD
<<<<<<< HEAD
<<<<<<< HEAD
<<<<<<< HEAD
=======
>>>>>>> 28e2bfa2d (GEOMESA-3061 Converters - support bytes in Avro top-level union types (#2762))
=======
>>>>>>> 94fecee1d8 (GEOMESA-3061 Converters - support bytes in Avro top-level union types (#2762))
=======
>>>>>>> 798faeb761 (GEOMESA-3176 Docs - fix download links in install instructions)
=======
=======
>>>>>>> 28e2bfa2d (GEOMESA-3061 Converters - support bytes in Avro top-level union types (#2762))
>>>>>>> 7ca1082a3f (GEOMESA-3061 Converters - support bytes in Avro top-level union types (#2762))
=======
>>>>>>> 789f6eba49 (GEOMESA-3061 Converters - support bytes in Avro top-level union types (#2762))
=======
>>>>>>> 07a6a5c291 (GEOMESA-3061 Converters - support bytes in Avro top-level union types (#2762))
=======
>>>>>>> 4fc0f66d4f (GEOMESA-3061 Converters - support bytes in Avro top-level union types (#2762))
=======
>>>>>>> 988874c83e (GEOMESA-3061 Converters - support bytes in Avro top-level union types (#2762))
=======
=======
>>>>>>> 28e2bfa2dc (GEOMESA-3061 Converters - support bytes in Avro top-level union types (#2762))
=======
>>>>>>> 90ec70f55 (GEOMESA-3176 Docs - fix download links in install instructions)
>>>>>>> 63db7d154a (GEOMESA-3176 Docs - fix download links in install instructions)
=======
<<<<<<< HEAD
>>>>>>> ef8de676d3 (GEOMESA-3176 Docs - fix download links in install instructions)
=======
>>>>>>> 6eb31fb65 (GEOMESA-3061 Converters - support bytes in Avro top-level union types (#2762))
=======
<<<<<<< HEAD
>>>>>>> 437d0aab1c (GEOMESA-3061 Converters - support bytes in Avro top-level union types (#2762))
=======
>>>>>>> c5e1827657 (GEOMESA-3061 Converters - support bytes in Avro top-level union types (#2762))
=======
>>>>>>> 23fc8cb805 (GEOMESA-3061 Converters - support bytes in Avro top-level union types (#2762))
=======
>>>>>>> e0c2527549 (GEOMESA-3061 Converters - support bytes in Avro top-level union types (#2762))
=======
>>>>>>> b47097b7bb (GEOMESA-3176 Docs - fix download links in install instructions)
=======
>>>>>>> 6eb31fb65 (GEOMESA-3061 Converters - support bytes in Avro top-level union types (#2762))
=======
>>>>>>> 99a32a726d (GEOMESA-3061 Converters - support bytes in Avro top-level union types (#2762))
=======
>>>>>>> 15e998504 (GEOMESA-3176 Docs - fix download links in install instructions)
=======
<<<<<<< HEAD
>>>>>>> 95f020af8c (GEOMESA-3176 Docs - fix download links in install instructions)
=======
>>>>>>> 07a6a5c29 (GEOMESA-3061 Converters - support bytes in Avro top-level union types (#2762))
=======
>>>>>>> 02bb344987 (GEOMESA-3061 Converters - support bytes in Avro top-level union types (#2762))
=======
>>>>>>> 00e61f4b70 (GEOMESA-3061 Converters - support bytes in Avro top-level union types (#2762))
=======
>>>>>>> 26c7d06850 (GEOMESA-3176 Docs - fix download links in install instructions)
=======
=======
>>>>>>> 28e2bfa2d (GEOMESA-3061 Converters - support bytes in Avro top-level union types (#2762))
>>>>>>> a512d6b917 (GEOMESA-3061 Converters - support bytes in Avro top-level union types (#2762))

>>>>>>> b9bdd406e (GEOMESA-3061 Converters - support bytes in Avro top-level union types (#2762))
=======
>>>>>>> 16b2e83f2 (GEOMESA-3176 Docs - fix download links in install instructions)
<<<<<<< HEAD
<<<<<<< HEAD
<<<<<<< HEAD
<<<<<<< HEAD
<<<<<<< HEAD
<<<<<<< HEAD
<<<<<<< HEAD
<<<<<<< HEAD
<<<<<<< HEAD
<<<<<<< HEAD
<<<<<<< HEAD
<<<<<<< HEAD
<<<<<<< HEAD
<<<<<<< HEAD
<<<<<<< HEAD
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
>>>>>>> 789f6eba49 (GEOMESA-3061 Converters - support bytes in Avro top-level union types (#2762))
=======
>>>>>>> 4fc0f66d4f (GEOMESA-3061 Converters - support bytes in Avro top-level union types (#2762))
=======
>>>>>>> ef8de676d3 (GEOMESA-3176 Docs - fix download links in install instructions)
=======
>>>>>>> 437d0aab1c (GEOMESA-3061 Converters - support bytes in Avro top-level union types (#2762))
=======
>>>>>>> 23fc8cb805 (GEOMESA-3061 Converters - support bytes in Avro top-level union types (#2762))
=======
>>>>>>> b47097b7bb (GEOMESA-3176 Docs - fix download links in install instructions)
=======
>>>>>>> 99a32a726d (GEOMESA-3061 Converters - support bytes in Avro top-level union types (#2762))
=======
>>>>>>> 95f020af8c (GEOMESA-3176 Docs - fix download links in install instructions)
=======
>>>>>>> 02bb344987 (GEOMESA-3061 Converters - support bytes in Avro top-level union types (#2762))
=======
>>>>>>> 26c7d06850 (GEOMESA-3176 Docs - fix download links in install instructions)
=======
>>>>>>> a512d6b917 (GEOMESA-3061 Converters - support bytes in Avro top-level union types (#2762))
>>>>>>> 10ade3dcd1 (GEOMESA-3176 Docs - fix download links in install instructions)
=======
>>>>>>> f71fa3c0e (GEOMESA-3061 Converters - support bytes in Avro top-level union types (#2762))
>>>>>>> 947a867d1c (GEOMESA-3061 Converters - support bytes in Avro top-level union types (#2762))
=======
>>>>>>> cdb410251 (GEOMESA-3061 Converters - support bytes in Avro top-level union types (#2762))
>>>>>>> e6e1f4bdd5 (GEOMESA-3061 Converters - support bytes in Avro top-level union types (#2762))
=======
=======
>>>>>>> 90ec70f55 (GEOMESA-3176 Docs - fix download links in install instructions)
>>>>>>> 279de44d3f (GEOMESA-3176 Docs - fix download links in install instructions)
=======
=======
>>>>>>> 7ca1082a3f (GEOMESA-3061 Converters - support bytes in Avro top-level union types (#2762))
=======
>>>>>>> dc2038e108 (GEOMESA-3176 Docs - fix download links in install instructions)
<<<<<<< HEAD
<<<<<<< HEAD
>>>>>>> locatelli-main
=======
>>>>>>> locatelli-main
=======
>>>>>>> locatelli-main
>>>>>>> 90ec70f559 (GEOMESA-3176 Docs - fix download links in install instructions)
=======
=======
>>>>>>> 07a6a5c291 (GEOMESA-3061 Converters - support bytes in Avro top-level union types (#2762))
=======
>>>>>>> 63db7d154a (GEOMESA-3176 Docs - fix download links in install instructions)
=======
=======
>>>>>>> 0fbf9e83e2 (GEOMESA-3176 Docs - fix download links in install instructions)
=======
>>>>>>> 89bdd3013e (GEOMESA-3061 Converters - support bytes in Avro top-level union types (#2762))
=======
>>>>>>> f9e8439b09 (GEOMESA-3176 Docs - fix download links in install instructions)
=======
>>>>>>> 72bafaf54b (GEOMESA-3061 Converters - support bytes in Avro top-level union types (#2762))
=======
<<<<<<< HEAD
<<<<<<< HEAD
<<<<<<< HEAD
>>>>>>> 0b36b46b5f (GEOMESA-3176 Docs - fix download links in install instructions)
=======
<<<<<<< HEAD
>>>>>>> 2142d07ded (GEOMESA-3176 Docs - fix download links in install instructions)
=======
=======
<<<<<<< HEAD
<<<<<<< HEAD
>>>>>>> 2142d07ded (GEOMESA-3176 Docs - fix download links in install instructions)
=======
=======
>>>>>>> 760781f8dd (GEOMESA-3176 Docs - fix download links in install instructions)
=======
>>>>>>> 2142d07ded (GEOMESA-3176 Docs - fix download links in install instructions)
=======
>>>>>>> 813f24c01d (GEOMESA-3176 Docs - fix download links in install instructions)
>>>>>>> locationtech-main
=======
>>>>>>> locatelli-main
=======
>>>>>>> locatelli-main
=======
>>>>>>> locatelli-main
>>>>>>> 6eb31fb65 (GEOMESA-3061 Converters - support bytes in Avro top-level union types (#2762))
>>>>>>> 28e2bfa2dc (GEOMESA-3061 Converters - support bytes in Avro top-level union types (#2762))
=======
>>>>>>> c5e1827657 (GEOMESA-3061 Converters - support bytes in Avro top-level union types (#2762))
=======
>>>>>>> 8cbe155de6 (GEOMESA-3176 Docs - fix download links in install instructions)
<<<<<<< HEAD
<<<<<<< HEAD
<<<<<<< HEAD
=======
<<<<<<< HEAD
>>>>>>> 798faeb761 (GEOMESA-3176 Docs - fix download links in install instructions)
=======
>>>>>>> locatelli-main
=======
>>>>>>> 798faeb761 (GEOMESA-3176 Docs - fix download links in install instructions)
=======
>>>>>>> locatelli-main
=======
>>>>>>> 798faeb761 (GEOMESA-3176 Docs - fix download links in install instructions)
=======
>>>>>>> locatelli-main
=======
=======
>>>>>>> 6eb31fb65 (GEOMESA-3061 Converters - support bytes in Avro top-level union types (#2762))
>>>>>>> 5f428db977 (GEOMESA-3061 Converters - support bytes in Avro top-level union types (#2762))
<<<<<<< HEAD
>>>>>>> location-main
=======
>>>>>>> locationtech-main
=======
<<<<<<< HEAD
<<<<<<< HEAD
<<<<<<< HEAD
=======
=======
>>>>>>> 6eb31fb65 (GEOMESA-3061 Converters - support bytes in Avro top-level union types (#2762))
=======
>>>>>>> locationtech-main
=======
>>>>>>> locatelli-main
=======
>>>>>>> locatelli-main
=======
>>>>>>> locatelli-main
>>>>>>> 07a6a5c29 (GEOMESA-3061 Converters - support bytes in Avro top-level union types (#2762))
=======
>>>>>>> 63db7d154 (GEOMESA-3176 Docs - fix download links in install instructions)
=======
=======
>>>>>>> 6eb31fb65 (GEOMESA-3061 Converters - support bytes in Avro top-level union types (#2762))
>>>>>>> 28e2bfa2d (GEOMESA-3061 Converters - support bytes in Avro top-level union types (#2762))
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
>>>>>>> locatelli-main
=======
>>>>>>> locatelli-main
>>>>>>> 6a26990f7 (GEOMESA-3176 Docs - fix download links in install instructions)
=======
>>>>>>> 8cbe155de (GEOMESA-3176 Docs - fix download links in install instructions)
>>>>>>> 8150bc0e65 (GEOMESA-3176 Docs - fix download links in install instructions)
=======
>>>>>>> 279de44d3 (GEOMESA-3176 Docs - fix download links in install instructions)
=======
=======
>>>>>>> locationtech-main
=======
=======
<<<<<<< HEAD
<<<<<<< HEAD
=======
>>>>>>> 760781f8dd (GEOMESA-3176 Docs - fix download links in install instructions)
=======
>>>>>>> ecd45f2c3e (GEOMESA-3176 Docs - fix download links in install instructions)
>>>>>>> locationtech-main
>>>>>>> 279de44d3f (GEOMESA-3176 Docs - fix download links in install instructions)
=======
>>>>>>> 8b8075f529 (GEOMESA-3176 Docs - fix download links in install instructions)
=======
<<<<<<< HEAD
>>>>>>> location-main
=======
<<<<<<< HEAD
=======
>>>>>>> 279de44d3f (GEOMESA-3176 Docs - fix download links in install instructions)
=======
>>>>>>> 449fb2085b (GEOMESA-3176 Docs - fix download links in install instructions)
=======
>>>>>>> 4492950388 (GEOMESA-3176 Docs - fix download links in install instructions)
>>>>>>> locationtech-main
=======
<<<<<<< HEAD
<<<<<<< HEAD
<<<<<<< HEAD
>>>>>>> locationtech-main
=======
=======
>>>>>>> locatelli-main
=======
>>>>>>> locatelli-main
=======
>>>>>>> locatelli-main

>>>>>>> b9bdd406e (GEOMESA-3061 Converters - support bytes in Avro top-level union types (#2762))
>>>>>>> f71fa3c0e (GEOMESA-3061 Converters - support bytes in Avro top-level union types (#2762))
<<<<<<< HEAD
<<<<<<< HEAD
<<<<<<< HEAD
<<<<<<< HEAD
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
>>>>>>> locatelli-main
=======
>>>>>>> locatelli-main
=======
>>>>>>> locatelli-main
=======
>>>>>>> locationtech-main
=======
>>>>>>> 67b361c85 (GEOMESA-3061 Converters - support bytes in Avro top-level union types (#2762))
=======
>>>>>>> 28e2bfa2d (GEOMESA-3061 Converters - support bytes in Avro top-level union types (#2762))
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
>>>>>>> locatelli-main
=======
>>>>>>> locatelli-main
>>>>>>> 240977229 (GEOMESA-3061 Converters - support bytes in Avro top-level union types (#2762))
=======
>>>>>>> 9d708b240 (GEOMESA-3061 Converters - support bytes in Avro top-level union types (#2762))
>>>>>>> 53a3e72cbf (GEOMESA-3061 Converters - support bytes in Avro top-level union types (#2762))
=======
>>>>>>> e6e1f4bdd (GEOMESA-3061 Converters - support bytes in Avro top-level union types (#2762))
=======
=======
>>>>>>> locationtech-main
=======
<<<<<<< HEAD
<<<<<<< HEAD
<<<<<<< HEAD
>>>>>>> locationtech-main
=======
=======
>>>>>>> locatelli-main
=======
>>>>>>> locatelli-main
=======
>>>>>>> locatelli-main

>>>>>>> b9bdd406e (GEOMESA-3061 Converters - support bytes in Avro top-level union types (#2762))
>>>>>>> cdb410251 (GEOMESA-3061 Converters - support bytes in Avro top-level union types (#2762))
<<<<<<< HEAD
<<<<<<< HEAD
<<<<<<< HEAD
<<<<<<< HEAD
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
>>>>>>> locatelli-main
=======
>>>>>>> locatelli-main
=======
>>>>>>> 53a3e72cbf (GEOMESA-3061 Converters - support bytes in Avro top-level union types (#2762))
=======
>>>>>>> 8150bc0e65 (GEOMESA-3176 Docs - fix download links in install instructions)
=======
>>>>>>> 8035cc5893 (GEOMESA-3061 Converters - support bytes in Avro top-level union types (#2762))
=======
>>>>>>> b7c6b904be (GEOMESA-3176 Docs - fix download links in install instructions)
=======
>>>>>>> locationtech-main
=======
<<<<<<< HEAD
<<<<<<< HEAD
<<<<<<< HEAD
>>>>>>> locationtech-main
=======
=======
>>>>>>> locatelli-main
=======
>>>>>>> locatelli-main
=======
>>>>>>> locatelli-main
>>>>>>> 90ec70f55 (GEOMESA-3176 Docs - fix download links in install instructions)
=======
>>>>>>> 6eb31fb65 (GEOMESA-3061 Converters - support bytes in Avro top-level union types (#2762))
<<<<<<< HEAD
=======
=======

>>>>>>> b9bdd406e (GEOMESA-3061 Converters - support bytes in Avro top-level union types (#2762))
>>>>>>> 0e68e9f4c (GEOMESA-3061 Converters - support bytes in Avro top-level union types (#2762))
=======
<<<<<<< HEAD
<<<<<<< HEAD
<<<<<<< HEAD
<<<<<<< HEAD
=======
>>>>>>> locatelli-main
=======
>>>>>>> locatelli-main
=======
>>>>>>> locatelli-main
=======
<<<<<<< HEAD
=======
>>>>>>> locationtech-main
<<<<<<< HEAD
<<<<<<< HEAD
<<<<<<< HEAD
>>>>>>> 6eb31fb652 (GEOMESA-3061 Converters - support bytes in Avro top-level union types (#2762))
=======
>>>>>>> 67b361c856 (GEOMESA-3061 Converters - support bytes in Avro top-level union types (#2762))
=======
>>>>>>> 28e2bfa2dc (GEOMESA-3061 Converters - support bytes in Avro top-level union types (#2762))
=======
>>>>>>> 9d708b240a (GEOMESA-3061 Converters - support bytes in Avro top-level union types (#2762))
=======
>>>>>>> 5f428db977 (GEOMESA-3061 Converters - support bytes in Avro top-level union types (#2762))
=======
>>>>>>> 89bdd3013e (GEOMESA-3061 Converters - support bytes in Avro top-level union types (#2762))
=======
=======
>>>>>>> 72bafaf54b (GEOMESA-3061 Converters - support bytes in Avro top-level union types (#2762))
=======
>>>>>>> 67b361c85 (GEOMESA-3061 Converters - support bytes in Avro top-level union types (#2762))
>>>>>>> c8a325e13c (GEOMESA-3061 Converters - support bytes in Avro top-level union types (#2762))
=======
>>>>>>> 28e2bfa2d (GEOMESA-3061 Converters - support bytes in Avro top-level union types (#2762))
=======
>>>>>>> e6e1f4bdd5 (GEOMESA-3061 Converters - support bytes in Avro top-level union types (#2762))
=======
=======

>>>>>>> b9bdd406e (GEOMESA-3061 Converters - support bytes in Avro top-level union types (#2762))
<<<<<<< HEAD
<<<<<<< HEAD
<<<<<<< HEAD
>>>>>>> 0e68e9f4cc (GEOMESA-3061 Converters - support bytes in Avro top-level union types (#2762))
=======
=======
>>>>>>> 947a867d1c (GEOMESA-3061 Converters - support bytes in Avro top-level union types (#2762))
=======
>>>>>>> 6eb31fb65 (GEOMESA-3061 Converters - support bytes in Avro top-level union types (#2762))
=======
<<<<<<< HEAD
<<<<<<< HEAD
>>>>>>> location-main
=======
<<<<<<< HEAD
<<<<<<< HEAD
<<<<<<< HEAD
=======
>>>>>>> 2586fa6a40 (GEOMESA-3061 Converters - support bytes in Avro top-level union types (#2762))
>>>>>>> 15e998504 (GEOMESA-3176 Docs - fix download links in install instructions)
=======
>>>>>>> 07a6a5c29 (GEOMESA-3061 Converters - support bytes in Avro top-level union types (#2762))
=======
<<<<<<< HEAD
<<<<<<< HEAD
>>>>>>> 67b361c85 (GEOMESA-3061 Converters - support bytes in Avro top-level union types (#2762))
=======
=======
>>>>>>> 90ec70f55 (GEOMESA-3176 Docs - fix download links in install instructions)
>>>>>>> 63db7d154 (GEOMESA-3176 Docs - fix download links in install instructions)
=======
<<<<<<< HEAD
<<<<<<< HEAD
=======
>>>>>>> 28e2bfa2d (GEOMESA-3061 Converters - support bytes in Avro top-level union types (#2762))
=======
>>>>>>> 9d1506029d (GEOMESA-3061 Converters - support bytes in Avro top-level union types (#2762))
=======
>>>>>>> 15e998504 (GEOMESA-3176 Docs - fix download links in install instructions)
=======
>>>>>>> bc622ff59f (GEOMESA-3176 Docs - fix download links in install instructions)
=======
>>>>>>> 7ec7e43c91 (GEOMESA-3061 Converters - support bytes in Avro top-level union types (#2762))
=======
>>>>>>> 67b361c85 (GEOMESA-3061 Converters - support bytes in Avro top-level union types (#2762))
=======
>>>>>>> 9a4dff9e4f (GEOMESA-3061 Converters - support bytes in Avro top-level union types (#2762))
=======
>>>>>>> 1cc4dadf2e (GEOMESA-3176 Docs - fix download links in install instructions)
=======
=======
>>>>>>> 28e2bfa2d (GEOMESA-3061 Converters - support bytes in Avro top-level union types (#2762))
>>>>>>> 2586fa6a40 (GEOMESA-3061 Converters - support bytes in Avro top-level union types (#2762))

>>>>>>> b9bdd406e (GEOMESA-3061 Converters - support bytes in Avro top-level union types (#2762))
=======
>>>>>>> 16b2e83f2 (GEOMESA-3176 Docs - fix download links in install instructions)
<<<<<<< HEAD
<<<<<<< HEAD
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
>>>>>>> bc622ff59f (GEOMESA-3176 Docs - fix download links in install instructions)
=======
>>>>>>> 7ec7e43c91 (GEOMESA-3061 Converters - support bytes in Avro top-level union types (#2762))
=======
>>>>>>> 1cc4dadf2e (GEOMESA-3176 Docs - fix download links in install instructions)
=======
>>>>>>> 2586fa6a40 (GEOMESA-3061 Converters - support bytes in Avro top-level union types (#2762))
>>>>>>> 15e9985047 (GEOMESA-3176 Docs - fix download links in install instructions)
=======
=======
>>>>>>> 4b70e7f8fb (GEOMESA-3176 Docs - fix download links in install instructions)
=======
>>>>>>> 85663f71c4 (GEOMESA-3061 Converters - support bytes in Avro top-level union types (#2762))
=======
>>>>>>> a12ea194c8 (GEOMESA-3176 Docs - fix download links in install instructions)
=======
>>>>>>> d4c5768cfa (GEOMESA-3061 Converters - support bytes in Avro top-level union types (#2762))
<<<<<<< HEAD
=======
>>>>>>> 85663f71c4 (GEOMESA-3061 Converters - support bytes in Avro top-level union types (#2762))
=======
>>>>>>> a12ea194c8 (GEOMESA-3176 Docs - fix download links in install instructions)
=======
>>>>>>> d4c5768cfa (GEOMESA-3061 Converters - support bytes in Avro top-level union types (#2762))
=======
>>>>>>> 15e9985047 (GEOMESA-3176 Docs - fix download links in install instructions)
=======
>>>>>>> 9d1506029d (GEOMESA-3061 Converters - support bytes in Avro top-level union types (#2762))
=======
>>>>>>> bc622ff59f (GEOMESA-3176 Docs - fix download links in install instructions)
<<<<<<< HEAD
=======
>>>>>>> 6eb31fb65 (GEOMESA-3061 Converters - support bytes in Avro top-level union types (#2762))
>>>>>>> 23c0241798 (GEOMESA-3061 Converters - support bytes in Avro top-level union types (#2762))
=======
<<<<<<< HEAD
<<<<<<< HEAD
<<<<<<< HEAD
=======
>>>>>>> 9d1506029d (GEOMESA-3061 Converters - support bytes in Avro top-level union types (#2762))
=======
>>>>>>> 7ec7e43c91 (GEOMESA-3061 Converters - support bytes in Avro top-level union types (#2762))
>>>>>>> 07a6a5c291 (GEOMESA-3061 Converters - support bytes in Avro top-level union types (#2762))
=======
<<<<<<< HEAD
=======
<<<<<<< HEAD
<<<<<<< HEAD
>>>>>>> 07a6a5c29 (GEOMESA-3061 Converters - support bytes in Avro top-level union types (#2762))
=======
<<<<<<< HEAD
>>>>>>> 85663f71c4 (GEOMESA-3061 Converters - support bytes in Avro top-level union types (#2762))
=======
>>>>>>> 63db7d154 (GEOMESA-3176 Docs - fix download links in install instructions)
=======
>>>>>>> a12ea194c8 (GEOMESA-3176 Docs - fix download links in install instructions)
=======
>>>>>>> 6eb31fb65 (GEOMESA-3061 Converters - support bytes in Avro top-level union types (#2762))
>>>>>>> 28e2bfa2d (GEOMESA-3061 Converters - support bytes in Avro top-level union types (#2762))
=======
=======
<<<<<<< HEAD
>>>>>>> 256a642cc1 (GEOMESA-3176 Docs - fix download links in install instructions)
>>>>>>> 6a26990f7 (GEOMESA-3176 Docs - fix download links in install instructions)
>>>>>>> 0b36b46b5f (GEOMESA-3176 Docs - fix download links in install instructions)
=======
>>>>>>> 8cbe155de (GEOMESA-3176 Docs - fix download links in install instructions)
>>>>>>> 8150bc0e65 (GEOMESA-3176 Docs - fix download links in install instructions)
=======
>>>>>>> 279de44d3 (GEOMESA-3176 Docs - fix download links in install instructions)
=======
=======
=======
>>>>>>> 9d1506029d (GEOMESA-3061 Converters - support bytes in Avro top-level union types (#2762))
=======
>>>>>>> 07a6a5c29 (GEOMESA-3061 Converters - support bytes in Avro top-level union types (#2762))
=======
<<<<<<< HEAD
>>>>>>> 85663f71c4 (GEOMESA-3061 Converters - support bytes in Avro top-level union types (#2762))
=======
<<<<<<< HEAD
>>>>>>> 7ec7e43c91 (GEOMESA-3061 Converters - support bytes in Avro top-level union types (#2762))
=======
>>>>>>> 63db7d154 (GEOMESA-3176 Docs - fix download links in install instructions)
=======
>>>>>>> a12ea194c8 (GEOMESA-3176 Docs - fix download links in install instructions)
=======
>>>>>>> 1cc4dadf2e (GEOMESA-3176 Docs - fix download links in install instructions)
=======
>>>>>>> 2586fa6a40 (GEOMESA-3061 Converters - support bytes in Avro top-level union types (#2762))

>>>>>>> b9bdd406e (GEOMESA-3061 Converters - support bytes in Avro top-level union types (#2762))
>>>>>>> f71fa3c0e (GEOMESA-3061 Converters - support bytes in Avro top-level union types (#2762))
<<<<<<< HEAD
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
>>>>>>> 2586fa6a40 (GEOMESA-3061 Converters - support bytes in Avro top-level union types (#2762))
=======
>>>>>>> 67b361c85 (GEOMESA-3061 Converters - support bytes in Avro top-level union types (#2762))
=======
>>>>>>> 28e2bfa2d (GEOMESA-3061 Converters - support bytes in Avro top-level union types (#2762))
=======
<<<<<<< HEAD
<<<<<<< HEAD
>>>>>>> 240977229 (GEOMESA-3061 Converters - support bytes in Avro top-level union types (#2762))
=======
>>>>>>> 9d708b240 (GEOMESA-3061 Converters - support bytes in Avro top-level union types (#2762))
>>>>>>> 53a3e72cbf (GEOMESA-3061 Converters - support bytes in Avro top-level union types (#2762))
=======
>>>>>>> e6e1f4bdd (GEOMESA-3061 Converters - support bytes in Avro top-level union types (#2762))
=======
>>>>>>> 9d1506029d (GEOMESA-3061 Converters - support bytes in Avro top-level union types (#2762))
=======
>>>>>>> 7ec7e43c91 (GEOMESA-3061 Converters - support bytes in Avro top-level union types (#2762))
=======
=======
>>>>>>> 67b361c85 (GEOMESA-3061 Converters - support bytes in Avro top-level union types (#2762))
>>>>>>> 9a4dff9e4f (GEOMESA-3061 Converters - support bytes in Avro top-level union types (#2762))
=======
=======
>>>>>>> 2586fa6a40 (GEOMESA-3061 Converters - support bytes in Avro top-level union types (#2762))
=======

>>>>>>> b9bdd406e (GEOMESA-3061 Converters - support bytes in Avro top-level union types (#2762))
>>>>>>> 23c0241798 (GEOMESA-3061 Converters - support bytes in Avro top-level union types (#2762))
>>>>>>> cdb410251 (GEOMESA-3061 Converters - support bytes in Avro top-level union types (#2762))
<<<<<<< HEAD
<<<<<<< HEAD
<<<<<<< HEAD
<<<<<<< HEAD
<<<<<<< HEAD
<<<<<<< HEAD
<<<<<<< HEAD
<<<<<<< HEAD
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
>>>>>>> 449fb2085b (GEOMESA-3176 Docs - fix download links in install instructions)
=======
>>>>>>> 9a4dff9e4f (GEOMESA-3061 Converters - support bytes in Avro top-level union types (#2762))
=======
>>>>>>> 1cc4dadf2e (GEOMESA-3176 Docs - fix download links in install instructions)
>>>>>>> 67b361c856 (GEOMESA-3061 Converters - support bytes in Avro top-level union types (#2762))
=======
=======
>>>>>>> c8a325e13c (GEOMESA-3061 Converters - support bytes in Avro top-level union types (#2762))
=======
>>>>>>> f9e8439b09 (GEOMESA-3176 Docs - fix download links in install instructions)
=======
>>>>>>> ad3cedc4db (GEOMESA-3061 Converters - support bytes in Avro top-level union types (#2762))
=======
<<<<<<< HEAD
<<<<<<< HEAD
>>>>>>> a12ea194c8 (GEOMESA-3176 Docs - fix download links in install instructions)
=======
>>>>>>> 22dcc8170f (GEOMESA-3061 Converters - support bytes in Avro top-level union types (#2762))
=======
>>>>>>> 0b36b46b5f (GEOMESA-3176 Docs - fix download links in install instructions)
=======
=======
>>>>>>> 256a642cc1 (GEOMESA-3176 Docs - fix download links in install instructions)
=======
>>>>>>> 1890b11217 (GEOMESA-3061 Converters - support bytes in Avro top-level union types (#2762))
=======
>>>>>>> 2142d07ded (GEOMESA-3176 Docs - fix download links in install instructions)
=======
>>>>>>> 53a3e72cbf (GEOMESA-3061 Converters - support bytes in Avro top-level union types (#2762))
>>>>>>> 7b0539b808 (GEOMESA-3061 Converters - support bytes in Avro top-level union types (#2762))
=======
>>>>>>> 8150bc0e65 (GEOMESA-3176 Docs - fix download links in install instructions)
=======
>>>>>>> 8035cc5893 (GEOMESA-3061 Converters - support bytes in Avro top-level union types (#2762))
=======
>>>>>>> b7c6b904be (GEOMESA-3176 Docs - fix download links in install instructions)
=======
=======
>>>>>>> 9a4dff9e4f (GEOMESA-3061 Converters - support bytes in Avro top-level union types (#2762))
=======
>>>>>>> a12ea194c8 (GEOMESA-3176 Docs - fix download links in install instructions)
=======
>>>>>>> 1cc4dadf2e (GEOMESA-3176 Docs - fix download links in install instructions)
>>>>>>> 90ec70f55 (GEOMESA-3176 Docs - fix download links in install instructions)
<<<<<<< HEAD
<<<<<<< HEAD
<<<<<<< HEAD
>>>>>>> 63db7d154a (GEOMESA-3176 Docs - fix download links in install instructions)
=======
=======
>>>>>>> 6eb31fb65 (GEOMESA-3061 Converters - support bytes in Avro top-level union types (#2762))
<<<<<<< HEAD
<<<<<<< HEAD
<<<<<<< HEAD
<<<<<<< HEAD
<<<<<<< HEAD
<<<<<<< HEAD
=======
>>>>>>> 92674ff9d4 (GEOMESA-3061 Converters - support bytes in Avro top-level union types (#2762))
=======
>>>>>>> 2586fa6a40 (GEOMESA-3061 Converters - support bytes in Avro top-level union types (#2762))
>>>>>>> 28e2bfa2dc (GEOMESA-3061 Converters - support bytes in Avro top-level union types (#2762))
=======
>>>>>>> 76618c8da3 (GEOMESA-3061 Converters - support bytes in Avro top-level union types (#2762))
=======
>>>>>>> 72bafaf54b (GEOMESA-3061 Converters - support bytes in Avro top-level union types (#2762))
=======
>>>>>>> 947a867d1c (GEOMESA-3061 Converters - support bytes in Avro top-level union types (#2762))
=======
>>>>>>> a910ae135f (GEOMESA-3061 Converters - support bytes in Avro top-level union types (#2762))
=======
<<<<<<< HEAD
<<<<<<< HEAD
>>>>>>> d4c5768cfa (GEOMESA-3061 Converters - support bytes in Avro top-level union types (#2762))
=======
=======
>>>>>>> 92674ff9d4 (GEOMESA-3061 Converters - support bytes in Avro top-level union types (#2762))
=======
>>>>>>> d4c5768cfa (GEOMESA-3061 Converters - support bytes in Avro top-level union types (#2762))
=======
>>>>>>> 2586fa6a40 (GEOMESA-3061 Converters - support bytes in Avro top-level union types (#2762))
=======

>>>>>>> b9bdd406e (GEOMESA-3061 Converters - support bytes in Avro top-level union types (#2762))
<<<<<<< HEAD
<<<<<<< HEAD
<<<<<<< HEAD
>>>>>>> b4320946b4 (GEOMESA-3061 Converters - support bytes in Avro top-level union types (#2762))
=======
>>>>>>> 3be8d2a5a4 (Merge branch 'feature/postgis-fixes')
=======
=======

>>>>>>> b9bdd406e (GEOMESA-3061 Converters - support bytes in Avro top-level union types (#2762))
>>>>>>> d9ed077cd1 (GEOMESA-3061 Converters - support bytes in Avro top-level union types (#2762))
=======
=======
>>>>>>> c1f99f4bcb (GEOMESA-3061 Converters - support bytes in Avro top-level union types (#2762))
=======
>>>>>>> 6eb31fb65 (GEOMESA-3061 Converters - support bytes in Avro top-level union types (#2762))
=======
<<<<<<< HEAD
>>>>>>> locationtech-main
<<<<<<< HEAD
<<<<<<< HEAD
<<<<<<< HEAD
=======
>>>>>>> locationtech-main
=======
>>>>>>> locatelli-main
=======
>>>>>>> locatelli-main
=======
>>>>>>> locatelli-main
>>>>>>> 15e998504 (GEOMESA-3176 Docs - fix download links in install instructions)
=======
>>>>>>> 07a6a5c29 (GEOMESA-3061 Converters - support bytes in Avro top-level union types (#2762))
=======
>>>>>>> 67b361c85 (GEOMESA-3061 Converters - support bytes in Avro top-level union types (#2762))
=======
=======
>>>>>>> 90ec70f55 (GEOMESA-3176 Docs - fix download links in install instructions)
>>>>>>> 63db7d154 (GEOMESA-3176 Docs - fix download links in install instructions)
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
>>>>>>> locatelli-main
=======
>>>>>>> locatelli-main
>>>>>>> 28e2bfa2d (GEOMESA-3061 Converters - support bytes in Avro top-level union types (#2762))
=======
=======
>>>>>>> locationtech-main
=======
>>>>>>> 28e2bfa2d (GEOMESA-3061 Converters - support bytes in Avro top-level union types (#2762))

>>>>>>> b9bdd406e (GEOMESA-3061 Converters - support bytes in Avro top-level union types (#2762))
=======
>>>>>>> 16b2e83f2 (GEOMESA-3176 Docs - fix download links in install instructions)
<<<<<<< HEAD
<<<<<<< HEAD
<<<<<<< HEAD
<<<<<<< HEAD
<<<<<<< HEAD
<<<<<<< HEAD
<<<<<<< HEAD
=======
<<<<<<< HEAD
=======
>>>>>>> locationtech-main
>>>>>>> 15e9985047 (GEOMESA-3176 Docs - fix download links in install instructions)
=======
=======
>>>>>>> 4b70e7f8fb (GEOMESA-3176 Docs - fix download links in install instructions)
=======
>>>>>>> 85663f71c4 (GEOMESA-3061 Converters - support bytes in Avro top-level union types (#2762))
=======
>>>>>>> a12ea194c8 (GEOMESA-3176 Docs - fix download links in install instructions)
=======
>>>>>>> d4c5768cfa (GEOMESA-3061 Converters - support bytes in Avro top-level union types (#2762))
<<<<<<< HEAD
=======
>>>>>>> 6eb31fb65 (GEOMESA-3061 Converters - support bytes in Avro top-level union types (#2762))
>>>>>>> 23c0241798 (GEOMESA-3061 Converters - support bytes in Avro top-level union types (#2762))
=======
<<<<<<< HEAD
>>>>>>> 07a6a5c291 (GEOMESA-3061 Converters - support bytes in Avro top-level union types (#2762))
=======
<<<<<<< HEAD
=======
>>>>>>> 07a6a5c29 (GEOMESA-3061 Converters - support bytes in Avro top-level union types (#2762))
=======
<<<<<<< HEAD
>>>>>>> 85663f71c4 (GEOMESA-3061 Converters - support bytes in Avro top-level union types (#2762))
=======
>>>>>>> 63db7d154 (GEOMESA-3176 Docs - fix download links in install instructions)
=======
>>>>>>> a12ea194c8 (GEOMESA-3176 Docs - fix download links in install instructions)
=======
>>>>>>> 6eb31fb65 (GEOMESA-3061 Converters - support bytes in Avro top-level union types (#2762))
>>>>>>> 28e2bfa2d (GEOMESA-3061 Converters - support bytes in Avro top-level union types (#2762))
=======
=======
>>>>>>> 256a642cc1 (GEOMESA-3176 Docs - fix download links in install instructions)
>>>>>>> 6a26990f7 (GEOMESA-3176 Docs - fix download links in install instructions)
>>>>>>> 0b36b46b5f (GEOMESA-3176 Docs - fix download links in install instructions)
=======
>>>>>>> 8cbe155de (GEOMESA-3176 Docs - fix download links in install instructions)
>>>>>>> 8150bc0e65 (GEOMESA-3176 Docs - fix download links in install instructions)
=======
>>>>>>> 279de44d3 (GEOMESA-3176 Docs - fix download links in install instructions)
=======
>>>>>>> b4c1ea8881 (GEOMESA-3176 Docs - fix download links in install instructions)
=======
<<<<<<< HEAD
<<<<<<< HEAD
<<<<<<< HEAD
=======
>>>>>>> b4c1ea8881 (GEOMESA-3176 Docs - fix download links in install instructions)
=======
>>>>>>> locatelli-main
=======
>>>>>>> b4c1ea8881 (GEOMESA-3176 Docs - fix download links in install instructions)
=======
>>>>>>> locatelli-main
=======
>>>>>>> b4c1ea8881 (GEOMESA-3176 Docs - fix download links in install instructions)
=======
>>>>>>> locatelli-main
=======

>>>>>>> b9bdd406e (GEOMESA-3061 Converters - support bytes in Avro top-level union types (#2762))
>>>>>>> f71fa3c0e (GEOMESA-3061 Converters - support bytes in Avro top-level union types (#2762))
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
>>>>>>> locatelli-main
=======
=======
>>>>>>> locatelli-main
=======
>>>>>>> locatelli-main
>>>>>>> 67b361c85 (GEOMESA-3061 Converters - support bytes in Avro top-level union types (#2762))
=======
>>>>>>> 28e2bfa2d (GEOMESA-3061 Converters - support bytes in Avro top-level union types (#2762))
=======
<<<<<<< HEAD
>>>>>>> 240977229 (GEOMESA-3061 Converters - support bytes in Avro top-level union types (#2762))
=======
>>>>>>> 9d708b240 (GEOMESA-3061 Converters - support bytes in Avro top-level union types (#2762))
>>>>>>> 53a3e72cbf (GEOMESA-3061 Converters - support bytes in Avro top-level union types (#2762))
=======
>>>>>>> e6e1f4bdd (GEOMESA-3061 Converters - support bytes in Avro top-level union types (#2762))
=======
=======

>>>>>>> b9bdd406e (GEOMESA-3061 Converters - support bytes in Avro top-level union types (#2762))
>>>>>>> 23c0241798 (GEOMESA-3061 Converters - support bytes in Avro top-level union types (#2762))
>>>>>>> cdb410251 (GEOMESA-3061 Converters - support bytes in Avro top-level union types (#2762))
<<<<<<< HEAD
<<<<<<< HEAD
<<<<<<< HEAD
<<<<<<< HEAD
<<<<<<< HEAD
<<<<<<< HEAD
<<<<<<< HEAD
<<<<<<< HEAD
<<<<<<< HEAD
<<<<<<< HEAD
<<<<<<< HEAD
<<<<<<< HEAD
<<<<<<< HEAD
<<<<<<< HEAD
<<<<<<< HEAD
>>>>>>> 67b361c856 (GEOMESA-3061 Converters - support bytes in Avro top-level union types (#2762))
=======
=======
>>>>>>> c8a325e13c (GEOMESA-3061 Converters - support bytes in Avro top-level union types (#2762))
=======
>>>>>>> f9e8439b09 (GEOMESA-3176 Docs - fix download links in install instructions)
=======
>>>>>>> ad3cedc4db (GEOMESA-3061 Converters - support bytes in Avro top-level union types (#2762))
=======
>>>>>>> a12ea194c8 (GEOMESA-3176 Docs - fix download links in install instructions)
=======
>>>>>>> 22dcc8170f (GEOMESA-3061 Converters - support bytes in Avro top-level union types (#2762))
=======
>>>>>>> 0b36b46b5f (GEOMESA-3176 Docs - fix download links in install instructions)
=======
=======
>>>>>>> 256a642cc1 (GEOMESA-3176 Docs - fix download links in install instructions)
=======
>>>>>>> 1890b11217 (GEOMESA-3061 Converters - support bytes in Avro top-level union types (#2762))
=======
>>>>>>> 2142d07ded (GEOMESA-3176 Docs - fix download links in install instructions)
=======
>>>>>>> 53a3e72cbf (GEOMESA-3061 Converters - support bytes in Avro top-level union types (#2762))
>>>>>>> 7b0539b808 (GEOMESA-3061 Converters - support bytes in Avro top-level union types (#2762))
=======
>>>>>>> 8150bc0e65 (GEOMESA-3176 Docs - fix download links in install instructions)
=======
>>>>>>> 8035cc5893 (GEOMESA-3061 Converters - support bytes in Avro top-level union types (#2762))
=======
>>>>>>> b7c6b904be (GEOMESA-3176 Docs - fix download links in install instructions)
=======
>>>>>>> 90ec70f55 (GEOMESA-3176 Docs - fix download links in install instructions)
<<<<<<< HEAD
<<<<<<< HEAD
<<<<<<< HEAD
>>>>>>> 63db7d154a (GEOMESA-3176 Docs - fix download links in install instructions)
=======
=======
>>>>>>> 6eb31fb65 (GEOMESA-3061 Converters - support bytes in Avro top-level union types (#2762))
<<<<<<< HEAD
<<<<<<< HEAD
<<<<<<< HEAD
<<<<<<< HEAD
>>>>>>> 28e2bfa2dc (GEOMESA-3061 Converters - support bytes in Avro top-level union types (#2762))
=======
>>>>>>> 76618c8da3 (GEOMESA-3061 Converters - support bytes in Avro top-level union types (#2762))
=======
>>>>>>> 72bafaf54b (GEOMESA-3061 Converters - support bytes in Avro top-level union types (#2762))
=======
>>>>>>> 947a867d1c (GEOMESA-3061 Converters - support bytes in Avro top-level union types (#2762))
=======
>>>>>>> a910ae135f (GEOMESA-3061 Converters - support bytes in Avro top-level union types (#2762))
=======
>>>>>>> d4c5768cfa (GEOMESA-3061 Converters - support bytes in Avro top-level union types (#2762))
=======
=======

>>>>>>> b9bdd406e (GEOMESA-3061 Converters - support bytes in Avro top-level union types (#2762))
<<<<<<< HEAD
<<<<<<< HEAD
<<<<<<< HEAD
>>>>>>> b4320946b4 (GEOMESA-3061 Converters - support bytes in Avro top-level union types (#2762))
=======
>>>>>>> 3be8d2a5a4 (Merge branch 'feature/postgis-fixes')
=======
=======

>>>>>>> b9bdd406e (GEOMESA-3061 Converters - support bytes in Avro top-level union types (#2762))
>>>>>>> d9ed077cd1 (GEOMESA-3061 Converters - support bytes in Avro top-level union types (#2762))
=======
=======
>>>>>>> c1f99f4bcb (GEOMESA-3061 Converters - support bytes in Avro top-level union types (#2762))
=======
>>>>>>> 6eb31fb65 (GEOMESA-3061 Converters - support bytes in Avro top-level union types (#2762))
=======
<<<<<<< HEAD
>>>>>>> 15e998504 (GEOMESA-3176 Docs - fix download links in install instructions)
=======
>>>>>>> 07a6a5c29 (GEOMESA-3061 Converters - support bytes in Avro top-level union types (#2762))
=======
>>>>>>> 67b361c85 (GEOMESA-3061 Converters - support bytes in Avro top-level union types (#2762))
=======
=======
>>>>>>> 90ec70f55 (GEOMESA-3176 Docs - fix download links in install instructions)
>>>>>>> 63db7d154 (GEOMESA-3176 Docs - fix download links in install instructions)
=======
=======
>>>>>>> 28e2bfa2d (GEOMESA-3061 Converters - support bytes in Avro top-level union types (#2762))

>>>>>>> b9bdd406e (GEOMESA-3061 Converters - support bytes in Avro top-level union types (#2762))
=======
>>>>>>> 16b2e83f2 (GEOMESA-3176 Docs - fix download links in install instructions)
<<<<<<< HEAD
<<<<<<< HEAD
<<<<<<< HEAD
<<<<<<< HEAD
<<<<<<< HEAD
<<<<<<< HEAD
<<<<<<< HEAD
=======
>>>>>>> 8c9ca1211a (GEOMESA-3061 Converters - support bytes in Avro top-level union types (#2762))
=======
<<<<<<< HEAD
>>>>>>> c9c24ca3d7 (GEOMESA-3061 Converters - support bytes in Avro top-level union types (#2762))
=======
<<<<<<< HEAD
>>>>>>> b9c0fc77b9 (GEOMESA-3061 Converters - support bytes in Avro top-level union types (#2762))
=======
<<<<<<< HEAD
>>>>>>> aff2787fc2 (GEOMESA-3176 Docs - fix download links in install instructions)
=======
<<<<<<< HEAD
>>>>>>> d69216810e (GEOMESA-3061 Converters - support bytes in Avro top-level union types (#2762))
=======
<<<<<<< HEAD
>>>>>>> 0753bfcbe4 (GEOMESA-3176 Docs - fix download links in install instructions)
=======
<<<<<<< HEAD
>>>>>>> 17f16286aa (GEOMESA-3061 Converters - support bytes in Avro top-level union types (#2762))
>>>>>>> locationtech-main
>>>>>>> 2aa923cc97 (GEOMESA-3176 Docs - fix download links in install instructions)
=======
>>>>>>> c5e1827657 (GEOMESA-3061 Converters - support bytes in Avro top-level union types (#2762))
=======
>>>>>>> cdb410251 (GEOMESA-3061 Converters - support bytes in Avro top-level union types (#2762))
>>>>>>> 9d708b240a (GEOMESA-3061 Converters - support bytes in Avro top-level union types (#2762))
=======
=======
>>>>>>> 90ec70f55 (GEOMESA-3176 Docs - fix download links in install instructions)
>>>>>>> 8cbe155de6 (GEOMESA-3176 Docs - fix download links in install instructions)
=======
=======
<<<<<<< HEAD
>>>>>>> 64e2e43818 (GEOMESA-3176 Docs - fix download links in install instructions)
=======
<<<<<<< HEAD
<<<<<<< HEAD
=======
<<<<<<< HEAD
<<<<<<< HEAD
>>>>>>> locationtech-main
>>>>>>> 9627a2de6a (GEOMESA-3061 Converters - support bytes in Avro top-level union types (#2762))
=======
<<<<<<< HEAD
>>>>>>> b046434188 (GEOMESA-3176 Docs - fix download links in install instructions)
=======
<<<<<<< HEAD
<<<<<<< HEAD
>>>>>>> 76908c410a (GEOMESA-3061 Converters - support bytes in Avro top-level union types (#2762))
=======
=======
<<<<<<< HEAD
<<<<<<< HEAD
>>>>>>> 76908c410a (GEOMESA-3061 Converters - support bytes in Avro top-level union types (#2762))
=======
=======
>>>>>>> aff2787fc2 (GEOMESA-3176 Docs - fix download links in install instructions)
=======
>>>>>>> 9627a2de6a (GEOMESA-3061 Converters - support bytes in Avro top-level union types (#2762))
=======
>>>>>>> d69216810e (GEOMESA-3061 Converters - support bytes in Avro top-level union types (#2762))
=======
>>>>>>> 0753bfcbe4 (GEOMESA-3176 Docs - fix download links in install instructions)
=======
>>>>>>> 76908c410a (GEOMESA-3061 Converters - support bytes in Avro top-level union types (#2762))
=======
>>>>>>> 17f16286aa (GEOMESA-3061 Converters - support bytes in Avro top-level union types (#2762))
>>>>>>> locationtech-main
>>>>>>> 6eb31fb65 (GEOMESA-3061 Converters - support bytes in Avro top-level union types (#2762))
>>>>>>> 5f428db977 (GEOMESA-3061 Converters - support bytes in Avro top-level union types (#2762))
=======
>>>>>>> 0e68e9f4c (GEOMESA-3061 Converters - support bytes in Avro top-level union types (#2762))
<<<<<<< HEAD
<<<<<<< HEAD
>>>>>>> 76618c8da3 (GEOMESA-3061 Converters - support bytes in Avro top-level union types (#2762))
=======
=======
>>>>>>> 15e998504 (GEOMESA-3176 Docs - fix download links in install instructions)
<<<<<<< HEAD
<<<<<<< HEAD
>>>>>>> 0fbf9e83e2 (GEOMESA-3176 Docs - fix download links in install instructions)
=======
=======
>>>>>>> 07a6a5c29 (GEOMESA-3061 Converters - support bytes in Avro top-level union types (#2762))
<<<<<<< HEAD
<<<<<<< HEAD
>>>>>>> 89bdd3013e (GEOMESA-3061 Converters - support bytes in Avro top-level union types (#2762))
=======
=======
>>>>>>> 67b361c85 (GEOMESA-3061 Converters - support bytes in Avro top-level union types (#2762))
<<<<<<< HEAD
<<<<<<< HEAD
>>>>>>> c8a325e13c (GEOMESA-3061 Converters - support bytes in Avro top-level union types (#2762))
=======
=======
>>>>>>> a12ea194c8 (GEOMESA-3176 Docs - fix download links in install instructions)
=======
=======
>>>>>>> 90ec70f55 (GEOMESA-3176 Docs - fix download links in install instructions)
>>>>>>> 63db7d154 (GEOMESA-3176 Docs - fix download links in install instructions)
<<<<<<< HEAD
<<<<<<< HEAD
<<<<<<< HEAD
<<<<<<< HEAD
=======
<<<<<<< HEAD
<<<<<<< HEAD
=======
>>>>>>> 1cc4dadf2e (GEOMESA-3176 Docs - fix download links in install instructions)
=======
>>>>>>> 2586fa6a40 (GEOMESA-3061 Converters - support bytes in Avro top-level union types (#2762))
>>>>>>> locationtech-main
>>>>>>> f9e8439b09 (GEOMESA-3176 Docs - fix download links in install instructions)
=======
=======
>>>>>>> 28e2bfa2d (GEOMESA-3061 Converters - support bytes in Avro top-level union types (#2762))
<<<<<<< HEAD
<<<<<<< HEAD
>>>>>>> 72bafaf54b (GEOMESA-3061 Converters - support bytes in Avro top-level union types (#2762))
=======
=======
>>>>>>> bdbced26d4 (GEOMESA-3061 Converters - support bytes in Avro top-level union types (#2762))
<<<<<<< HEAD
>>>>>>> location-main
=======
>>>>>>> locationtech-main
=======
=======

>>>>>>> b9bdd406e (GEOMESA-3061 Converters - support bytes in Avro top-level union types (#2762))
>>>>>>> b4320946b (GEOMESA-3061 Converters - support bytes in Avro top-level union types (#2762))
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
>>>>>>> d94c03a98e (GEOMESA-3061 Converters - support bytes in Avro top-level union types (#2762))
=======
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
=======
>>>>>>> 0fc6650ecf (GEOMESA-3061 Converters - support bytes in Avro top-level union types (#2762))
=======
>>>>>>> 67de3c3202 (Merge branch 'feature/postgis-fixes')
=======
>>>>>>> 1e39c0c27d (GEOMESA-3061 Converters - support bytes in Avro top-level union types (#2762))
=======
>>>>>>> 638b68d081 (Merge branch 'feature/postgis-fixes')
=======
>>>>>>> d0785cf307 (GEOMESA-3061 Converters - support bytes in Avro top-level union types (#2762))
=======
>>>>>>> 71adb695c5 (Merge branch 'feature/postgis-fixes')
=======
>>>>>>> fd5565dfba (GEOMESA-3061 Converters - support bytes in Avro top-level union types (#2762))
=======
>>>>>>> 30559ea5c9 (Merge branch 'feature/postgis-fixes')
>>>>>>> locationtech-main
>>>>>>> 97ec7d864a (GEOMESA-3061 Converters - support bytes in Avro top-level union types (#2762))
=======
=======
>>>>>>> bc4062951d (GEOMESA-3061 Converters - support bytes in Avro top-level union types (#2762))
=======
<<<<<<< HEAD
>>>>>>> e944f1c88b (Merge branch 'feature/postgis-fixes')
=======
=======
=======
<<<<<<< HEAD
<<<<<<< HEAD
>>>>>>> e944f1c88b (Merge branch 'feature/postgis-fixes')
=======
=======
<<<<<<< HEAD
<<<<<<< HEAD
>>>>>>> locationtech-main
>>>>>>> 26e5afc4ea (Merge branch 'feature/postgis-fixes')
=======
>>>>>>> 1df8328338 (GEOMESA-3061 Converters - support bytes in Avro top-level union types (#2762))
=======
>>>>>>> c69897d7bd (Merge branch 'feature/postgis-fixes')
=======
<<<<<<< HEAD
>>>>>>> d94c03a98e (GEOMESA-3061 Converters - support bytes in Avro top-level union types (#2762))
>>>>>>> 8de43cccf6 (GEOMESA-3061 Converters - support bytes in Avro top-level union types (#2762))
>>>>>>> location-main
=======
>>>>>>> cb6bda89b6 (Merge branch 'feature/postgis-fixes')
=======
=======
<<<<<<< HEAD
=======
>>>>>>> 26e5afc4ea (Merge branch 'feature/postgis-fixes')
=======
<<<<<<< HEAD
>>>>>>> 71adb695c5 (Merge branch 'feature/postgis-fixes')
=======
>>>>>>> 1df8328338 (GEOMESA-3061 Converters - support bytes in Avro top-level union types (#2762))
=======
>>>>>>> fd5565dfba (GEOMESA-3061 Converters - support bytes in Avro top-level union types (#2762))
=======
>>>>>>> 30559ea5c9 (Merge branch 'feature/postgis-fixes')
>>>>>>> d94c03a98e (GEOMESA-3061 Converters - support bytes in Avro top-level union types (#2762))
>>>>>>> 8de43cccf6 (GEOMESA-3061 Converters - support bytes in Avro top-level union types (#2762))
=======
>>>>>>> cb6bda89b6 (Merge branch 'feature/postgis-fixes')
=======
<<<<<<< HEAD
<<<<<<< HEAD
>>>>>>> locationtech-main
>>>>>>> 25063957fc (GEOMESA-3061 Converters - support bytes in Avro top-level union types (#2762))
=======
>>>>>>> 699117eca9 (Merge branch 'feature/postgis-fixes')
=======
<<<<<<< HEAD
>>>>>>> 3be8d2a5a (Merge branch 'feature/postgis-fixes')
<<<<<<< HEAD
=======
=======
<<<<<<< HEAD
=======
>>>>>>> 1e39c0c27d (GEOMESA-3061 Converters - support bytes in Avro top-level union types (#2762))
=======
>>>>>>> e944f1c88b (Merge branch 'feature/postgis-fixes')
=======
>>>>>>> 638b68d081 (Merge branch 'feature/postgis-fixes')
=======
>>>>>>> d94c03a98e (GEOMESA-3061 Converters - support bytes in Avro top-level union types (#2762))
>>>>>>> 8de43cccf6 (GEOMESA-3061 Converters - support bytes in Avro top-level union types (#2762))
=======
>>>>>>> d0785cf307 (GEOMESA-3061 Converters - support bytes in Avro top-level union types (#2762))
=======
>>>>>>> 71adb695c5 (Merge branch 'feature/postgis-fixes')
=======
>>>>>>> 25063957fc (GEOMESA-3061 Converters - support bytes in Avro top-level union types (#2762))
=======
>>>>>>> fd5565dfba (GEOMESA-3061 Converters - support bytes in Avro top-level union types (#2762))
=======
>>>>>>> 30559ea5c9 (Merge branch 'feature/postgis-fixes')
>>>>>>> 3be8d2a5a (Merge branch 'feature/postgis-fixes')
>>>>>>> locationtech-main
<<<<<<< HEAD
>>>>>>> db8d998aa2 (Merge branch 'feature/postgis-fixes')
=======
>>>>>>> d845d7c1bd (GEOMESA-3254 Add Bloop build support)
=======
>>>>>>> 0dbede148d (GEOMESA-3061 Converters - support bytes in Avro top-level union types (#2762))
<<<<<<< HEAD
>>>>>>> location-main
=======
>>>>>>> locationtech-main
=======
=======

>>>>>>> b9bdd406e (GEOMESA-3061 Converters - support bytes in Avro top-level union types (#2762))
<<<<<<< HEAD
<<<<<<< HEAD
<<<<<<< HEAD
>>>>>>> 87bf55340 (GEOMESA-3061 Converters - support bytes in Avro top-level union types (#2762))
=======
<<<<<<< HEAD
>>>>>>> 6d9a5b626c (GEOMESA-3061 Converters - support bytes in Avro top-level union types (#2762))
=======
=======
=======
<<<<<<< HEAD
<<<<<<< HEAD
=======
>>>>>>> 1bb69524c2 (GEOMESA-3061 Converters - support bytes in Avro top-level union types (#2762))
=======
>>>>>>> a1f15598cb (GEOMESA-3061 Converters - support bytes in Avro top-level union types (#2762))
>>>>>>> 6d9a5b626c (GEOMESA-3061 Converters - support bytes in Avro top-level union types (#2762))
=======
=======
>>>>>>> 6eb31fb652 (GEOMESA-3061 Converters - support bytes in Avro top-level union types (#2762))
=======
>>>>>>> 07a6a5c291 (GEOMESA-3061 Converters - support bytes in Avro top-level union types (#2762))
=======
>>>>>>> 67b361c856 (GEOMESA-3061 Converters - support bytes in Avro top-level union types (#2762))
=======
=======
>>>>>>> 28e2bfa2dc (GEOMESA-3061 Converters - support bytes in Avro top-level union types (#2762))
=======
>>>>>>> 5f428db977 (GEOMESA-3061 Converters - support bytes in Avro top-level union types (#2762))
=======
>>>>>>> 76618c8da3 (GEOMESA-3061 Converters - support bytes in Avro top-level union types (#2762))
=======
>>>>>>> 0fbf9e83e2 (GEOMESA-3176 Docs - fix download links in install instructions)
=======
>>>>>>> 89bdd3013e (GEOMESA-3061 Converters - support bytes in Avro top-level union types (#2762))
=======
>>>>>>> c8a325e13c (GEOMESA-3061 Converters - support bytes in Avro top-level union types (#2762))
=======
>>>>>>> f9e8439b09 (GEOMESA-3176 Docs - fix download links in install instructions)
=======
=======
>>>>>>> 97ec7d864a (GEOMESA-3061 Converters - support bytes in Avro top-level union types (#2762))
=======
>>>>>>> db8d998aa2 (Merge branch 'feature/postgis-fixes')
=======
>>>>>>> 28e2bfa2d (GEOMESA-3061 Converters - support bytes in Avro top-level union types (#2762))
>>>>>>> 72bafaf54b (GEOMESA-3061 Converters - support bytes in Avro top-level union types (#2762))
=======
>>>>>>> 90ec70f55 (GEOMESA-3176 Docs - fix download links in install instructions)
>>>>>>> 63db7d154a (GEOMESA-3176 Docs - fix download links in install instructions)
=======
>>>>>>> 6eb31fb65 (GEOMESA-3061 Converters - support bytes in Avro top-level union types (#2762))
=======
>>>>>>> c5e1827657 (GEOMESA-3061 Converters - support bytes in Avro top-level union types (#2762))
=======
>>>>>>> 9d708b240a (GEOMESA-3061 Converters - support bytes in Avro top-level union types (#2762))
=======
=======
>>>>>>> 90ec70f55 (GEOMESA-3176 Docs - fix download links in install instructions)
>>>>>>> 8cbe155de6 (GEOMESA-3176 Docs - fix download links in install instructions)
=======
>>>>>>> 6eb31fb65 (GEOMESA-3061 Converters - support bytes in Avro top-level union types (#2762))
=======
<<<<<<< HEAD
>>>>>>> 15e998504 (GEOMESA-3176 Docs - fix download links in install instructions)
=======
>>>>>>> 07a6a5c29 (GEOMESA-3061 Converters - support bytes in Avro top-level union types (#2762))
=======
>>>>>>> 67b361c85 (GEOMESA-3061 Converters - support bytes in Avro top-level union types (#2762))
=======
=======
>>>>>>> 90ec70f55 (GEOMESA-3176 Docs - fix download links in install instructions)
>>>>>>> 63db7d154 (GEOMESA-3176 Docs - fix download links in install instructions)
=======
=======
>>>>>>> 28e2bfa2d (GEOMESA-3061 Converters - support bytes in Avro top-level union types (#2762))
>>>>>>> locationtech-main
=======
=======
>>>>>>> 0833709340 (GEOMESA-3061 Converters - support bytes in Avro top-level union types (#2762))
=======
>>>>>>> fdf0e4fe88 (GEOMESA-3176 Docs - fix download links in install instructions)
=======
>>>>>>> 32234db855 (GEOMESA-3061 Converters - support bytes in Avro top-level union types (#2762))
=======
>>>>>>> cec40638c2 (GEOMESA-3061 Converters - support bytes in Avro top-level union types (#2762))
=======
>>>>>>> 90ec70f55 (GEOMESA-3176 Docs - fix download links in install instructions)
=======
>>>>>>> 6eb31fb65 (GEOMESA-3061 Converters - support bytes in Avro top-level union types (#2762))
=======
<<<<<<< HEAD
>>>>>>> b03141c1bb (GEOMESA-3061 Converters - support bytes in Avro top-level union types (#2762))
=======
>>>>>>> 15e998504 (GEOMESA-3176 Docs - fix download links in install instructions)
=======
<<<<<<< HEAD
>>>>>>> fdf0e4fe88 (GEOMESA-3176 Docs - fix download links in install instructions)
=======
>>>>>>> 07a6a5c29 (GEOMESA-3061 Converters - support bytes in Avro top-level union types (#2762))
=======
<<<<<<< HEAD
>>>>>>> 32234db855 (GEOMESA-3061 Converters - support bytes in Avro top-level union types (#2762))
=======
>>>>>>> 67b361c85 (GEOMESA-3061 Converters - support bytes in Avro top-level union types (#2762))
=======
>>>>>>> cec40638c2 (GEOMESA-3061 Converters - support bytes in Avro top-level union types (#2762))
=======
>>>>>>> f2943650ff (GEOMESA-3176 Docs - fix download links in install instructions)
=======
=======
>>>>>>> 28e2bfa2d (GEOMESA-3061 Converters - support bytes in Avro top-level union types (#2762))
>>>>>>> 86dd18aa73 (GEOMESA-3061 Converters - support bytes in Avro top-level union types (#2762))

>>>>>>> b9bdd406e (GEOMESA-3061 Converters - support bytes in Avro top-level union types (#2762))
=======
>>>>>>> 16b2e83f2 (GEOMESA-3176 Docs - fix download links in install instructions)
<<<<<<< HEAD
<<<<<<< HEAD
<<<<<<< HEAD
<<<<<<< HEAD
<<<<<<< HEAD
<<<<<<< HEAD
=======
>>>>>>> 6eb31fb65 (GEOMESA-3061 Converters - support bytes in Avro top-level union types (#2762))
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
>>>>>>> locationtech-main
>>>>>>> 10ade3dcd1 (GEOMESA-3176 Docs - fix download links in install instructions)
=======
>>>>>>> f71fa3c0e (GEOMESA-3061 Converters - support bytes in Avro top-level union types (#2762))
>>>>>>> 947a867d1c (GEOMESA-3061 Converters - support bytes in Avro top-level union types (#2762))
=======
>>>>>>> cdb410251 (GEOMESA-3061 Converters - support bytes in Avro top-level union types (#2762))
>>>>>>> e6e1f4bdd5 (GEOMESA-3061 Converters - support bytes in Avro top-level union types (#2762))
=======
=======
>>>>>>> 90ec70f55 (GEOMESA-3176 Docs - fix download links in install instructions)
>>>>>>> 279de44d3f (GEOMESA-3176 Docs - fix download links in install instructions)
<<<<<<< HEAD
<<<<<<< HEAD
<<<<<<< HEAD
=======
>>>>>>> 5bf82177df (GEOMESA-3061 Converters - support bytes in Avro top-level union types (#2762))
>>>>>>> locatelli-main
=======
>>>>>>> 5bf82177df (GEOMESA-3061 Converters - support bytes in Avro top-level union types (#2762))
>>>>>>> locatelli-main
=======
>>>>>>> 5bf82177df (GEOMESA-3061 Converters - support bytes in Avro top-level union types (#2762))
>>>>>>> locatelli-main
=======
=======
>>>>>>> 6eb31fb65 (GEOMESA-3061 Converters - support bytes in Avro top-level union types (#2762))
>>>>>>> 23c0241798 (GEOMESA-3061 Converters - support bytes in Avro top-level union types (#2762))
=======
>>>>>>> 0e68e9f4c (GEOMESA-3061 Converters - support bytes in Avro top-level union types (#2762))
>>>>>>> a910ae135f (GEOMESA-3061 Converters - support bytes in Avro top-level union types (#2762))
<<<<<<< HEAD
<<<<<<< HEAD
<<<<<<< HEAD
<<<<<<< HEAD
=======
=======
<<<<<<< HEAD
>>>>>>> locatelli-main
=======
>>>>>>> locatelli-main
<<<<<<< HEAD
<<<<<<< HEAD
=======
>>>>>>> bc622ff59f (GEOMESA-3176 Docs - fix download links in install instructions)
<<<<<<< HEAD
<<<<<<< HEAD
>>>>>>> locationtech-main
=======
=======
>>>>>>> locatelli-main
=======
<<<<<<< HEAD
=======
>>>>>>> bc622ff59f (GEOMESA-3176 Docs - fix download links in install instructions)
>>>>>>> locatelli-main
=======
>>>>>>> 009a284072 (GEOMESA-3061 Converters - support bytes in Avro top-level union types (#2762))
=======
=======
>>>>>>> bc622ff59f (GEOMESA-3176 Docs - fix download links in install instructions)
>>>>>>> 955de6bfcc (GEOMESA-3176 Docs - fix download links in install instructions)
<<<<<<< HEAD
<<<<<<< HEAD
>>>>>>> locatelli-main
=======
>>>>>>> locatelli-main
=======
>>>>>>> locatelli-main
=======
=======
>>>>>>> 15e998504 (GEOMESA-3176 Docs - fix download links in install instructions)
>>>>>>> 4b70e7f8fb (GEOMESA-3176 Docs - fix download links in install instructions)
<<<<<<< HEAD
<<<<<<< HEAD
<<<<<<< HEAD
<<<<<<< HEAD
=======
=======
<<<<<<< HEAD
>>>>>>> locatelli-main
=======
>>>>>>> locatelli-main
<<<<<<< HEAD
<<<<<<< HEAD
=======
>>>>>>> 7ec7e43c91 (GEOMESA-3061 Converters - support bytes in Avro top-level union types (#2762))
<<<<<<< HEAD
<<<<<<< HEAD
>>>>>>> locationtech-main
=======
=======
>>>>>>> locatelli-main
=======
<<<<<<< HEAD
=======
>>>>>>> 7ec7e43c91 (GEOMESA-3061 Converters - support bytes in Avro top-level union types (#2762))
>>>>>>> locatelli-main
=======
>>>>>>> 955de6bfcc (GEOMESA-3176 Docs - fix download links in install instructions)
=======
=======
>>>>>>> 7ec7e43c91 (GEOMESA-3061 Converters - support bytes in Avro top-level union types (#2762))
>>>>>>> 897de97047 (GEOMESA-3061 Converters - support bytes in Avro top-level union types (#2762))
<<<<<<< HEAD
<<<<<<< HEAD
>>>>>>> locatelli-main
=======
>>>>>>> locatelli-main
=======
>>>>>>> locatelli-main
=======
=======
>>>>>>> 07a6a5c29 (GEOMESA-3061 Converters - support bytes in Avro top-level union types (#2762))
>>>>>>> 85663f71c4 (GEOMESA-3061 Converters - support bytes in Avro top-level union types (#2762))
<<<<<<< HEAD
<<<<<<< HEAD
<<<<<<< HEAD
<<<<<<< HEAD
=======
=======
<<<<<<< HEAD
>>>>>>> locatelli-main
=======
>>>>>>> locatelli-main
<<<<<<< HEAD
<<<<<<< HEAD
=======
>>>>>>> 9a4dff9e4f (GEOMESA-3061 Converters - support bytes in Avro top-level union types (#2762))
<<<<<<< HEAD
<<<<<<< HEAD
>>>>>>> locationtech-main
=======
=======
>>>>>>> locatelli-main
=======
<<<<<<< HEAD
=======
>>>>>>> 9a4dff9e4f (GEOMESA-3061 Converters - support bytes in Avro top-level union types (#2762))
>>>>>>> locatelli-main
=======
>>>>>>> 897de97047 (GEOMESA-3061 Converters - support bytes in Avro top-level union types (#2762))
=======
=======
>>>>>>> 9a4dff9e4f (GEOMESA-3061 Converters - support bytes in Avro top-level union types (#2762))
>>>>>>> 7b8c8dcc3d (GEOMESA-3061 Converters - support bytes in Avro top-level union types (#2762))
<<<<<<< HEAD
<<<<<<< HEAD
>>>>>>> locatelli-main
=======
>>>>>>> locatelli-main
=======
>>>>>>> locatelli-main
=======
=======
>>>>>>> 67b361c85 (GEOMESA-3061 Converters - support bytes in Avro top-level union types (#2762))
>>>>>>> ad3cedc4db (GEOMESA-3061 Converters - support bytes in Avro top-level union types (#2762))
<<<<<<< HEAD
<<<<<<< HEAD
<<<<<<< HEAD
<<<<<<< HEAD
=======
<<<<<<< HEAD
<<<<<<< HEAD
>>>>>>> locationtech-main
=======
<<<<<<< HEAD
=======
>>>>>>> locatelli-main
<<<<<<< HEAD
=======
>>>>>>> locatelli-main
<<<<<<< HEAD
=======
>>>>>>> 7b8c8dcc3d (GEOMESA-3061 Converters - support bytes in Avro top-level union types (#2762))
=======
>>>>>>> 057f644239 (GEOMESA-3176 Docs - fix download links in install instructions)
<<<<<<< HEAD
<<<<<<< HEAD
>>>>>>> locatelli-main
=======
>>>>>>> locatelli-main
=======
>>>>>>> locatelli-main
=======
>>>>>>> a12ea194c8 (GEOMESA-3176 Docs - fix download links in install instructions)
=======
=======
>>>>>>> 28e2bfa2d (GEOMESA-3061 Converters - support bytes in Avro top-level union types (#2762))
>>>>>>> d4c5768cfa (GEOMESA-3061 Converters - support bytes in Avro top-level union types (#2762))
<<<<<<< HEAD
<<<<<<< HEAD
<<<<<<< HEAD
<<<<<<< HEAD
=======
<<<<<<< HEAD
<<<<<<< HEAD
>>>>>>> locationtech-main
=======
<<<<<<< HEAD
=======
>>>>>>> locatelli-main
<<<<<<< HEAD
=======
>>>>>>> locatelli-main
<<<<<<< HEAD
=======
>>>>>>> d329320e6a (GEOMESA-3061 Converters - support bytes in Avro top-level union types (#2762))
=======
>>>>>>> c029a43a6c (GEOMESA-3061 Converters - support bytes in Avro top-level union types (#2762))
<<<<<<< HEAD
<<<<<<< HEAD
>>>>>>> locatelli-main
=======
>>>>>>> locatelli-main
=======
>>>>>>> locatelli-main
=======
>>>>>>> bdbced26d4 (GEOMESA-3061 Converters - support bytes in Avro top-level union types (#2762))
=======
=======
>>>>>>> 3be8d2a5a (Merge branch 'feature/postgis-fixes')
>>>>>>> 1b25d7ddb4 (Merge branch 'feature/postgis-fixes')
<<<<<<< HEAD
<<<<<<< HEAD
<<<<<<< HEAD
<<<<<<< HEAD
=======
<<<<<<< HEAD
<<<<<<< HEAD
>>>>>>> locationtech-main
=======
<<<<<<< HEAD
=======
>>>>>>> locatelli-main
<<<<<<< HEAD
=======
>>>>>>> locatelli-main
<<<<<<< HEAD
=======
>>>>>>> 217b7d1cb9 (Merge branch 'feature/postgis-fixes')
=======
>>>>>>> a5b0374ee2 (GEOMESA-3061 Converters - support bytes in Avro top-level union types (#2762))
<<<<<<< HEAD
<<<<<<< HEAD
>>>>>>> locatelli-main
=======
>>>>>>> locatelli-main
=======
>>>>>>> locatelli-main
=======
=======
>>>>>>> 8adfab65bb (GEOMESA-3061 Converters - support bytes in Avro top-level union types (#2762))
>>>>>>> 87bf55340 (GEOMESA-3061 Converters - support bytes in Avro top-level union types (#2762))
<<<<<<< HEAD
>>>>>>> 0dbede148d (GEOMESA-3061 Converters - support bytes in Avro top-level union types (#2762))
=======
<<<<<<< HEAD
<<<<<<< HEAD
<<<<<<< HEAD
<<<<<<< HEAD
>>>>>>> location-main
=======
>>>>>>> locationtech-main
=======
>>>>>>> locatelli-main
=======
>>>>>>> locatelli-main
=======
>>>>>>> locatelli-main
=======
=======
>>>>>>> e847488d8 (GEOMESA-3061 Converters - support bytes in Avro top-level union types (#2762))
=======
>>>>>>> 6eb31fb65 (GEOMESA-3061 Converters - support bytes in Avro top-level union types (#2762))
=======
<<<<<<< HEAD
>>>>>>> 15e998504 (GEOMESA-3176 Docs - fix download links in install instructions)
=======
>>>>>>> 07a6a5c29 (GEOMESA-3061 Converters - support bytes in Avro top-level union types (#2762))
=======
>>>>>>> 67b361c85 (GEOMESA-3061 Converters - support bytes in Avro top-level union types (#2762))
=======
=======
>>>>>>> 90ec70f55 (GEOMESA-3176 Docs - fix download links in install instructions)
>>>>>>> 63db7d154 (GEOMESA-3176 Docs - fix download links in install instructions)
=======
=======
>>>>>>> 28e2bfa2d (GEOMESA-3061 Converters - support bytes in Avro top-level union types (#2762))

>>>>>>> b9bdd406e (GEOMESA-3061 Converters - support bytes in Avro top-level union types (#2762))
=======
>>>>>>> 16b2e83f2 (GEOMESA-3176 Docs - fix download links in install instructions)
<<<<<<< HEAD
<<<<<<< HEAD
<<<<<<< HEAD
<<<<<<< HEAD
<<<<<<< HEAD
<<<<<<< HEAD
>>>>>>> 7813a31aa (GEOMESA-3176 Docs - fix download links in install instructions)
<<<<<<< HEAD
<<<<<<< HEAD
<<<<<<< HEAD
<<<<<<< HEAD
<<<<<<< HEAD
=======
<<<<<<< HEAD
>>>>>>> 71c56e6b77 (GEOMESA-3176 Docs - fix download links in install instructions)
=======
>>>>>>> location-main
=======
>>>>>>> 71c56e6b77 (GEOMESA-3176 Docs - fix download links in install instructions)
=======
>>>>>>> locationtech-main
=======
>>>>>>> 71c56e6b77 (GEOMESA-3176 Docs - fix download links in install instructions)
=======
>>>>>>> locatelli-main
=======
>>>>>>> 71c56e6b77 (GEOMESA-3176 Docs - fix download links in install instructions)
=======
>>>>>>> locatelli-main
=======
>>>>>>> 71c56e6b77 (GEOMESA-3176 Docs - fix download links in install instructions)
=======
>>>>>>> locatelli-main
=======
=======
=======
>>>>>>> baa90e85a (GEOMESA-3176 Docs - fix download links in install instructions)
=======
>>>>>>> 4524373ac (GEOMESA-3061 Converters - support bytes in Avro top-level union types (#2762))
=======
>>>>>>> 46c05fed5 (GEOMESA-3176 Docs - fix download links in install instructions)
=======
>>>>>>> 4fbe39c62 (GEOMESA-3061 Converters - support bytes in Avro top-level union types (#2762))
<<<<<<< HEAD
=======
>>>>>>> 6eb31fb65 (GEOMESA-3061 Converters - support bytes in Avro top-level union types (#2762))
>>>>>>> 3dd99aed4 (GEOMESA-3061 Converters - support bytes in Avro top-level union types (#2762))
=======
>>>>>>> 07a6a5c29 (GEOMESA-3061 Converters - support bytes in Avro top-level union types (#2762))
=======
>>>>>>> 63db7d154 (GEOMESA-3176 Docs - fix download links in install instructions)
=======
=======
>>>>>>> 6eb31fb65 (GEOMESA-3061 Converters - support bytes in Avro top-level union types (#2762))
>>>>>>> 28e2bfa2d (GEOMESA-3061 Converters - support bytes in Avro top-level union types (#2762))
=======
<<<<<<< HEAD
<<<<<<< HEAD
<<<<<<< HEAD
<<<<<<< HEAD
<<<<<<< HEAD
=======
>>>>>>> c1f99f4bcb (GEOMESA-3061 Converters - support bytes in Avro top-level union types (#2762))
=======
<<<<<<< HEAD
=======
>>>>>>> c1f99f4bcb (GEOMESA-3061 Converters - support bytes in Avro top-level union types (#2762))
=======
=======
=======
>>>>>>> locatelli-main
=======
>>>>>>> locatelli-main
>>>>>>> c1f99f4bcb (GEOMESA-3061 Converters - support bytes in Avro top-level union types (#2762))
=======
<<<<<<< HEAD
<<<<<<< HEAD
<<<<<<< HEAD
<<<<<<< HEAD
<<<<<<< HEAD
<<<<<<< HEAD
>>>>>>> locatelli-main
=======
>>>>>>> locatelli-main
<<<<<<< HEAD
=======
>>>>>>> locatelli-main
<<<<<<< HEAD
<<<<<<< HEAD
=======
>>>>>>> b9c0fc77b9 (GEOMESA-3061 Converters - support bytes in Avro top-level union types (#2762))
<<<<<<< HEAD
<<<<<<< HEAD
<<<<<<< HEAD
>>>>>>> locationtech-main
=======
=======
>>>>>>> locatelli-main
=======
>>>>>>> locatelli-main
=======
>>>>>>> 1f17117603 (GEOMESA-3061 Converters - support bytes in Avro top-level union types (#2762))
=======
>>>>>>> b8545eda8f (GEOMESA-3061 Converters - support bytes in Avro top-level union types (#2762))
=======
=======
>>>>>>> b9c0fc77b9 (GEOMESA-3061 Converters - support bytes in Avro top-level union types (#2762))
>>>>>>> 420027bc3f (GEOMESA-3061 Converters - support bytes in Avro top-level union types (#2762))
<<<<<<< HEAD
<<<<<<< HEAD
>>>>>>> locatelli-main
=======
>>>>>>> locatelli-main
=======
>>>>>>> locatelli-main
=======
>>>>>>> 6eb31fb65 (GEOMESA-3061 Converters - support bytes in Avro top-level union types (#2762))
>>>>>>> 338d952d43 (GEOMESA-3061 Converters - support bytes in Avro top-level union types (#2762))
=======
<<<<<<< HEAD
<<<<<<< HEAD
<<<<<<< HEAD
<<<<<<< HEAD
=======
<<<<<<< HEAD
<<<<<<< HEAD
>>>>>>> locationtech-main
=======
<<<<<<< HEAD
=======
>>>>>>> locatelli-main
<<<<<<< HEAD
=======
>>>>>>> locatelli-main
<<<<<<< HEAD
<<<<<<< HEAD
<<<<<<< HEAD
=======
>>>>>>> 420027bc3f (GEOMESA-3061 Converters - support bytes in Avro top-level union types (#2762))
=======
>>>>>>> fc1024de7e (GEOMESA-3061 Converters - support bytes in Avro top-level union types (#2762))
<<<<<<< HEAD
<<<<<<< HEAD
>>>>>>> locatelli-main
=======
>>>>>>> locatelli-main
=======
>>>>>>> locatelli-main
>>>>>>> 07a6a5c29 (GEOMESA-3061 Converters - support bytes in Avro top-level union types (#2762))
=======
>>>>>>> 63db7d154 (GEOMESA-3176 Docs - fix download links in install instructions)
=======
<<<<<<< HEAD
<<<<<<< HEAD
<<<<<<< HEAD
=======
<<<<<<< HEAD
=======
<<<<<<< HEAD
>>>>>>> locatelli-main
=======
>>>>>>> locatelli-main
<<<<<<< HEAD
=======
=======
>>>>>>> locatelli-main
>>>>>>> 6eb31fb65 (GEOMESA-3061 Converters - support bytes in Avro top-level union types (#2762))
>>>>>>> 28e2bfa2d (GEOMESA-3061 Converters - support bytes in Avro top-level union types (#2762))
=======
=======
>>>>>>> c9c24ca3d7 (GEOMESA-3061 Converters - support bytes in Avro top-level union types (#2762))
=======
>>>>>>> b9c0fc77b9 (GEOMESA-3061 Converters - support bytes in Avro top-level union types (#2762))
=======
>>>>>>> 07a6a5c29 (GEOMESA-3061 Converters - support bytes in Avro top-level union types (#2762))
=======
>>>>>>> d69216810e (GEOMESA-3061 Converters - support bytes in Avro top-level union types (#2762))
=======
>>>>>>> 0753bfcbe4 (GEOMESA-3176 Docs - fix download links in install instructions)
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
>>>>>>> 6eb31fb65 (GEOMESA-3061 Converters - support bytes in Avro top-level union types (#2762))
>>>>>>> 28e2bfa2d (GEOMESA-3061 Converters - support bytes in Avro top-level union types (#2762))
=======
<<<<<<< HEAD
<<<<<<< HEAD
<<<<<<< HEAD
<<<<<<< HEAD
>>>>>>> location-main
=======
>>>>>>> locationtech-main
=======
=======
>>>>>>> locatelli-main
=======
>>>>>>> locatelli-main
>>>>>>> 63db7d154 (GEOMESA-3176 Docs - fix download links in install instructions)
=======
=======
>>>>>>> 6eb31fb65 (GEOMESA-3061 Converters - support bytes in Avro top-level union types (#2762))
>>>>>>> 28e2bfa2d (GEOMESA-3061 Converters - support bytes in Avro top-level union types (#2762))
=======
>>>>>>> 279de44d3f (GEOMESA-3176 Docs - fix download links in install instructions)
=======
=======
>>>>>>> 2bce465a3f (GEOMESA-3061 Converters - support bytes in Avro top-level union types (#2762))
=======
>>>>>>> 1f17117603 (GEOMESA-3061 Converters - support bytes in Avro top-level union types (#2762))
=======
>>>>>>> 07a6a5c29 (GEOMESA-3061 Converters - support bytes in Avro top-level union types (#2762))
=======
>>>>>>> 732efe4910 (GEOMESA-3061 Converters - support bytes in Avro top-level union types (#2762))
=======
>>>>>>> d72089513c (GEOMESA-3176 Docs - fix download links in install instructions)
=======
>>>>>>> 5712753579 (GEOMESA-3176 Docs - fix download links in install instructions)
=======
>>>>>>> 6eb31fb65 (GEOMESA-3061 Converters - support bytes in Avro top-level union types (#2762))
>>>>>>> 28e2bfa2d (GEOMESA-3061 Converters - support bytes in Avro top-level union types (#2762))
=======
=======
>>>>>>> c9c24ca3d7 (GEOMESA-3061 Converters - support bytes in Avro top-level union types (#2762))
=======
>>>>>>> b9c0fc77b9 (GEOMESA-3061 Converters - support bytes in Avro top-level union types (#2762))
=======
>>>>>>> 07a6a5c29 (GEOMESA-3061 Converters - support bytes in Avro top-level union types (#2762))
=======
>>>>>>> d69216810e (GEOMESA-3061 Converters - support bytes in Avro top-level union types (#2762))
=======
>>>>>>> 0753bfcbe4 (GEOMESA-3176 Docs - fix download links in install instructions)
=======
>>>>>>> 6eb31fb65 (GEOMESA-3061 Converters - support bytes in Avro top-level union types (#2762))
>>>>>>> 28e2bfa2d (GEOMESA-3061 Converters - support bytes in Avro top-level union types (#2762))
=======
<<<<<<< HEAD
<<<<<<< HEAD
>>>>>>> locatelli-main
=======
>>>>>>> locatelli-main
=======
>>>>>>> locatelli-main
=======
>>>>>>> 07a6a5c29 (GEOMESA-3061 Converters - support bytes in Avro top-level union types (#2762))
=======
>>>>>>> 32234db855 (GEOMESA-3061 Converters - support bytes in Avro top-level union types (#2762))
=======

>>>>>>> b9bdd406e (GEOMESA-3061 Converters - support bytes in Avro top-level union types (#2762))
>>>>>>> f71fa3c0e (GEOMESA-3061 Converters - support bytes in Avro top-level union types (#2762))
<<<<<<< HEAD
<<<<<<< HEAD
<<<<<<< HEAD
<<<<<<< HEAD
<<<<<<< HEAD
<<<<<<< HEAD
<<<<<<< HEAD
<<<<<<< HEAD
<<<<<<< HEAD
<<<<<<< HEAD
<<<<<<< HEAD
>>>>>>> e847488d8 (GEOMESA-3061 Converters - support bytes in Avro top-level union types (#2762))
=======
=======
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
<<<<<<< HEAD
<<<<<<< HEAD
=======
=======
>>>>>>> 12443df272 (GEOMESA-3061 Converters - support bytes in Avro top-level union types (#2762))
>>>>>>> e847488d8 (GEOMESA-3061 Converters - support bytes in Avro top-level union types (#2762))
=======
>>>>>>> 879d736345 (GEOMESA-3061 Converters - support bytes in Avro top-level union types (#2762))
<<<<<<< HEAD
<<<<<<< HEAD
>>>>>>> locatelli-main
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
=======
>>>>>>> locatelli-main
<<<<<<< HEAD
=======
>>>>>>> locatelli-main
<<<<<<< HEAD
<<<<<<< HEAD
<<<<<<< HEAD
<<<<<<< HEAD
=======
>>>>>>> 420027bc3f (GEOMESA-3061 Converters - support bytes in Avro top-level union types (#2762))
=======
>>>>>>> fc1024de7e (GEOMESA-3061 Converters - support bytes in Avro top-level union types (#2762))
=======
>>>>>>> 27c0ee7e6d (GEOMESA-3061 Converters - support bytes in Avro top-level union types (#2762))
=======
>>>>>>> 8435590eee (GEOMESA-3061 Converters - support bytes in Avro top-level union types (#2762))
<<<<<<< HEAD
<<<<<<< HEAD
>>>>>>> locatelli-main
=======
>>>>>>> locatelli-main
=======
>>>>>>> locatelli-main
=======
>>>>>>> c9c24ca3d7 (GEOMESA-3061 Converters - support bytes in Avro top-level union types (#2762))
=======
>>>>>>> b9c0fc77b9 (GEOMESA-3061 Converters - support bytes in Avro top-level union types (#2762))
<<<<<<< HEAD
<<<<<<< HEAD
=======
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
>>>>>>> d69216810e (GEOMESA-3061 Converters - support bytes in Avro top-level union types (#2762))
=======
>>>>>>> 86ec77f9cb (GEOMESA-3061 Converters - support bytes in Avro top-level union types (#2762))
<<<<<<< HEAD
<<<<<<< HEAD
=======
>>>>>>> 17f16286aa (GEOMESA-3061 Converters - support bytes in Avro top-level union types (#2762))
<<<<<<< HEAD
>>>>>>> locationtech-main
=======
<<<<<<< HEAD
=======
>>>>>>> locatelli-main
<<<<<<< HEAD
=======
>>>>>>> 17f16286aa (GEOMESA-3061 Converters - support bytes in Avro top-level union types (#2762))
=======
>>>>>>> locatelli-main
=======
>>>>>>> 2bce465a3f (GEOMESA-3061 Converters - support bytes in Avro top-level union types (#2762))
=======
>>>>>>> 1f17117603 (GEOMESA-3061 Converters - support bytes in Avro top-level union types (#2762))
=======
>>>>>>> 732efe4910 (GEOMESA-3061 Converters - support bytes in Avro top-level union types (#2762))
=======
>>>>>>> 2a887f75bf (GEOMESA-3061 Converters - support bytes in Avro top-level union types (#2762))
=======
>>>>>>> f91e29a57f (GEOMESA-3061 Converters - support bytes in Avro top-level union types (#2762))
=======
=======
>>>>>>> c9c24ca3d7 (GEOMESA-3061 Converters - support bytes in Avro top-level union types (#2762))
>>>>>>> b8545eda8f (GEOMESA-3061 Converters - support bytes in Avro top-level union types (#2762))
=======
>>>>>>> 420027bc3f (GEOMESA-3061 Converters - support bytes in Avro top-level union types (#2762))
=======
=======
>>>>>>> d69216810e (GEOMESA-3061 Converters - support bytes in Avro top-level union types (#2762))
>>>>>>> fc1024de7e (GEOMESA-3061 Converters - support bytes in Avro top-level union types (#2762))
=======
>>>>>>> 27c0ee7e6d (GEOMESA-3061 Converters - support bytes in Avro top-level union types (#2762))
=======
=======
>>>>>>> 17f16286aa (GEOMESA-3061 Converters - support bytes in Avro top-level union types (#2762))
>>>>>>> 8435590eee (GEOMESA-3061 Converters - support bytes in Avro top-level union types (#2762))
<<<<<<< HEAD
<<<<<<< HEAD
>>>>>>> locatelli-main
=======
>>>>>>> locatelli-main
=======
>>>>>>> locatelli-main
>>>>>>> e847488d8 (GEOMESA-3061 Converters - support bytes in Avro top-level union types (#2762))
<<<<<<< HEAD
>>>>>>> e27137ff78 (GEOMESA-3061 Converters - support bytes in Avro top-level union types (#2762))
=======
=======
>>>>>>> 76908c410a (GEOMESA-3061 Converters - support bytes in Avro top-level union types (#2762))
=======
>>>>>>> 67b361c85 (GEOMESA-3061 Converters - support bytes in Avro top-level union types (#2762))
>>>>>>> f302a54949 (GEOMESA-3061 Converters - support bytes in Avro top-level union types (#2762))
=======
<<<<<<< HEAD
>>>>>>> 9627a2de6a (GEOMESA-3061 Converters - support bytes in Avro top-level union types (#2762))
=======
>>>>>>> 338d952d43 (GEOMESA-3061 Converters - support bytes in Avro top-level union types (#2762))
=======
<<<<<<< HEAD
<<<<<<< HEAD
<<<<<<< HEAD
<<<<<<< HEAD
>>>>>>> location-main
=======
=======
>>>>>>> locatelli-main
=======
>>>>>>> 76908c410a (GEOMESA-3061 Converters - support bytes in Avro top-level union types (#2762))
=======
>>>>>>> 67b361c85 (GEOMESA-3061 Converters - support bytes in Avro top-level union types (#2762))
>>>>>>> f302a54949 (GEOMESA-3061 Converters - support bytes in Avro top-level union types (#2762))
=======
<<<<<<< HEAD
>>>>>>> 9627a2de6a (GEOMESA-3061 Converters - support bytes in Avro top-level union types (#2762))
=======
>>>>>>> 338d952d43 (GEOMESA-3061 Converters - support bytes in Avro top-level union types (#2762))
<<<<<<< HEAD
>>>>>>> locatelli-main
=======
>>>>>>> locatelli-main
=======
=======
>>>>>>> 76908c410a (GEOMESA-3061 Converters - support bytes in Avro top-level union types (#2762))
=======
>>>>>>> 67b361c85 (GEOMESA-3061 Converters - support bytes in Avro top-level union types (#2762))
>>>>>>> f302a54949 (GEOMESA-3061 Converters - support bytes in Avro top-level union types (#2762))
=======
<<<<<<< HEAD
>>>>>>> 9627a2de6a (GEOMESA-3061 Converters - support bytes in Avro top-level union types (#2762))
=======
>>>>>>> 338d952d43 (GEOMESA-3061 Converters - support bytes in Avro top-level union types (#2762))
=======
=======
>>>>>>> 76908c410a (GEOMESA-3061 Converters - support bytes in Avro top-level union types (#2762))
=======
>>>>>>> 67b361c85 (GEOMESA-3061 Converters - support bytes in Avro top-level union types (#2762))
>>>>>>> f302a54949 (GEOMESA-3061 Converters - support bytes in Avro top-level union types (#2762))
=======
<<<<<<< HEAD
>>>>>>> 9627a2de6a (GEOMESA-3061 Converters - support bytes in Avro top-level union types (#2762))
=======
>>>>>>> 338d952d43 (GEOMESA-3061 Converters - support bytes in Avro top-level union types (#2762))
<<<<<<< HEAD
<<<<<<< HEAD
>>>>>>> locatelli-main
=======
=======
>>>>>>> 76908c410a (GEOMESA-3061 Converters - support bytes in Avro top-level union types (#2762))
=======
>>>>>>> 67b361c85 (GEOMESA-3061 Converters - support bytes in Avro top-level union types (#2762))
>>>>>>> f302a54949 (GEOMESA-3061 Converters - support bytes in Avro top-level union types (#2762))
=======
<<<<<<< HEAD
>>>>>>> 9627a2de6a (GEOMESA-3061 Converters - support bytes in Avro top-level union types (#2762))
=======
>>>>>>> 338d952d43 (GEOMESA-3061 Converters - support bytes in Avro top-level union types (#2762))
=======
<<<<<<< HEAD
>>>>>>> locationtech-main
=======
>>>>>>> locatelli-main
=======
=======
=======
=======
>>>>>>> locatelli-main
=======
=======
=======
>>>>>>> locatelli-main
=======
>>>>>>> 4fbe39c62 (GEOMESA-3061 Converters - support bytes in Avro top-level union types (#2762))
<<<<<<< HEAD
=======
>>>>>>> 67b361c85 (GEOMESA-3061 Converters - support bytes in Avro top-level union types (#2762))
>>>>>>> dace2085b (GEOMESA-3061 Converters - support bytes in Avro top-level union types (#2762))
=======
<<<<<<< HEAD
<<<<<<< HEAD
>>>>>>> 4524373ac (GEOMESA-3061 Converters - support bytes in Avro top-level union types (#2762))
=======
<<<<<<< HEAD
>>>>>>> 3dd99aed4 (GEOMESA-3061 Converters - support bytes in Avro top-level union types (#2762))
=======
>>>>>>> 240977229 (GEOMESA-3061 Converters - support bytes in Avro top-level union types (#2762))
<<<<<<< HEAD
<<<<<<< HEAD
<<<<<<< HEAD
<<<<<<< HEAD
<<<<<<< HEAD
=======
<<<<<<< HEAD
>>>>>>> 22dcc8170f (GEOMESA-3061 Converters - support bytes in Avro top-level union types (#2762))
=======
>>>>>>> location-main
=======
>>>>>>> 22dcc8170f (GEOMESA-3061 Converters - support bytes in Avro top-level union types (#2762))
=======
>>>>>>> locationtech-main
=======
>>>>>>> 22dcc8170f (GEOMESA-3061 Converters - support bytes in Avro top-level union types (#2762))
=======
>>>>>>> locatelli-main
=======
>>>>>>> 22dcc8170f (GEOMESA-3061 Converters - support bytes in Avro top-level union types (#2762))
=======
>>>>>>> locatelli-main
=======
>>>>>>> 22dcc8170f (GEOMESA-3061 Converters - support bytes in Avro top-level union types (#2762))
=======
>>>>>>> locatelli-main
=======
<<<<<<< HEAD
=======
>>>>>>> 28e2bfa2d (GEOMESA-3061 Converters - support bytes in Avro top-level union types (#2762))
=======
>>>>>>> 4fbe39c62 (GEOMESA-3061 Converters - support bytes in Avro top-level union types (#2762))
=======
<<<<<<< HEAD
<<<<<<< HEAD
<<<<<<< HEAD
<<<<<<< HEAD
<<<<<<< HEAD
=======
=======
>>>>>>> c3c5dd0ebb (GEOMESA-3061 Converters - support bytes in Avro top-level union types (#2762))
=======
=======
=======
>>>>>>> locatelli-main
=======
>>>>>>> locatelli-main
=======
>>>>>>> locatelli-main
=======
>>>>>>> c3c5dd0ebb (GEOMESA-3061 Converters - support bytes in Avro top-level union types (#2762))
=======
<<<<<<< HEAD
<<<<<<< HEAD
<<<<<<< HEAD
<<<<<<< HEAD
<<<<<<< HEAD
=======
>>>>>>> 17f16286aa (GEOMESA-3061 Converters - support bytes in Avro top-level union types (#2762))
>>>>>>> locationtech-main
=======
<<<<<<< HEAD
=======
>>>>>>> locatelli-main
<<<<<<< HEAD
=======
>>>>>>> locatelli-main
<<<<<<< HEAD
<<<<<<< HEAD
=======
>>>>>>> 17f16286aa (GEOMESA-3061 Converters - support bytes in Avro top-level union types (#2762))
=======
>>>>>>> f91e29a57f (GEOMESA-3061 Converters - support bytes in Avro top-level union types (#2762))
=======
>>>>>>> e6703260b7 (GEOMESA-3061 Converters - support bytes in Avro top-level union types (#2762))
=======
=======
>>>>>>> 17f16286aa (GEOMESA-3061 Converters - support bytes in Avro top-level union types (#2762))
>>>>>>> 8435590eee (GEOMESA-3061 Converters - support bytes in Avro top-level union types (#2762))
<<<<<<< HEAD
<<<<<<< HEAD
>>>>>>> locatelli-main
=======
>>>>>>> locatelli-main
=======
>>>>>>> locatelli-main
>>>>>>> 28e2bfa2d (GEOMESA-3061 Converters - support bytes in Avro top-level union types (#2762))
=======
>>>>>>> 76908c410a (GEOMESA-3061 Converters - support bytes in Avro top-level union types (#2762))
=======
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
>>>>>>> 8435590eee (GEOMESA-3061 Converters - support bytes in Avro top-level union types (#2762))
<<<<<<< HEAD
>>>>>>> locatelli-main
=======
>>>>>>> locatelli-main
=======
<<<<<<< HEAD
=======
>>>>>>> 8435590eee (GEOMESA-3061 Converters - support bytes in Avro top-level union types (#2762))
>>>>>>> locatelli-main
=======
>>>>>>> 2654d9c120 (GEOMESA-3061 Converters - support bytes in Avro top-level union types (#2762))
=======
>>>>>>> 17f16286aa (GEOMESA-3061 Converters - support bytes in Avro top-level union types (#2762))
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
>>>>>>> 058fd96baa (GEOMESA-3061 Converters - support bytes in Avro top-level union types (#2762))
=======
>>>>>>> f91e29a57f (GEOMESA-3061 Converters - support bytes in Avro top-level union types (#2762))
=======
=======
>>>>>>> 2654d9c120 (GEOMESA-3061 Converters - support bytes in Avro top-level union types (#2762))
>>>>>>> e6703260b7 (GEOMESA-3061 Converters - support bytes in Avro top-level union types (#2762))
=======
>>>>>>> 8435590eee (GEOMESA-3061 Converters - support bytes in Avro top-level union types (#2762))
<<<<<<< HEAD
<<<<<<< HEAD
>>>>>>> locatelli-main
=======
>>>>>>> locatelli-main
=======
>>>>>>> locatelli-main

>>>>>>> b9bdd406e (GEOMESA-3061 Converters - support bytes in Avro top-level union types (#2762))
>>>>>>> cdb410251 (GEOMESA-3061 Converters - support bytes in Avro top-level union types (#2762))
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
>>>>>>> location-main
=======
<<<<<<< HEAD
<<<<<<< HEAD
<<<<<<< HEAD
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
<<<<<<< HEAD
<<<<<<< HEAD
<<<<<<< HEAD
<<<<<<< HEAD
<<<<<<< HEAD
<<<<<<< HEAD
<<<<<<< HEAD
=======
>>>>>>> 27c0ee7e6d (GEOMESA-3061 Converters - support bytes in Avro top-level union types (#2762))
=======
>>>>>>> 5712753579 (GEOMESA-3176 Docs - fix download links in install instructions)
<<<<<<< HEAD
<<<<<<< HEAD
>>>>>>> locatelli-main
=======
>>>>>>> locatelli-main
=======
>>>>>>> locatelli-main
=======
>>>>>>> 2654d9c120 (GEOMESA-3061 Converters - support bytes in Avro top-level union types (#2762))
=======
>>>>>>> 86ec77f9cb (GEOMESA-3061 Converters - support bytes in Avro top-level union types (#2762))
<<<<<<< HEAD
<<<<<<< HEAD
=======
>>>>>>> 0753bfcbe4 (GEOMESA-3176 Docs - fix download links in install instructions)
<<<<<<< HEAD
>>>>>>> locationtech-main
=======
<<<<<<< HEAD
=======
>>>>>>> locatelli-main
<<<<<<< HEAD
=======
>>>>>>> 0753bfcbe4 (GEOMESA-3176 Docs - fix download links in install instructions)
=======
>>>>>>> locatelli-main
=======
>>>>>>> 058fd96baa (GEOMESA-3061 Converters - support bytes in Avro top-level union types (#2762))
=======
>>>>>>> 2a887f75bf (GEOMESA-3061 Converters - support bytes in Avro top-level union types (#2762))
=======
>>>>>>> d72089513c (GEOMESA-3176 Docs - fix download links in install instructions)
=======
=======
>>>>>>> 2654d9c120 (GEOMESA-3061 Converters - support bytes in Avro top-level union types (#2762))
>>>>>>> e6703260b7 (GEOMESA-3061 Converters - support bytes in Avro top-level union types (#2762))
=======
>>>>>>> 27c0ee7e6d (GEOMESA-3061 Converters - support bytes in Avro top-level union types (#2762))
=======
=======
>>>>>>> 0753bfcbe4 (GEOMESA-3176 Docs - fix download links in install instructions)
>>>>>>> 5712753579 (GEOMESA-3176 Docs - fix download links in install instructions)
<<<<<<< HEAD
<<<<<<< HEAD
>>>>>>> locatelli-main
=======
>>>>>>> locatelli-main
=======
>>>>>>> locatelli-main
>>>>>>> dace2085b (GEOMESA-3061 Converters - support bytes in Avro top-level union types (#2762))
=======
<<<<<<< HEAD
>>>>>>> 46c05fed5 (GEOMESA-3176 Docs - fix download links in install instructions)
=======
<<<<<<< HEAD
<<<<<<< HEAD
<<<<<<< HEAD
<<<<<<< HEAD
<<<<<<< HEAD
>>>>>>> 90ec70f55 (GEOMESA-3176 Docs - fix download links in install instructions)
<<<<<<< HEAD
>>>>>>> 6a26990f7 (GEOMESA-3176 Docs - fix download links in install instructions)
=======
>>>>>>> f302a54949 (GEOMESA-3061 Converters - support bytes in Avro top-level union types (#2762))
=======
>>>>>>> b046434188 (GEOMESA-3176 Docs - fix download links in install instructions)
=======
=======
=======
>>>>>>> locatelli-main
=======
>>>>>>> locatelli-main
=======
>>>>>>> locatelli-main
>>>>>>> f302a54949 (GEOMESA-3061 Converters - support bytes in Avro top-level union types (#2762))
=======
<<<<<<< HEAD
<<<<<<< HEAD
<<<<<<< HEAD
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
<<<<<<< HEAD
=======
>>>>>>> 27c0ee7e6d (GEOMESA-3061 Converters - support bytes in Avro top-level union types (#2762))
=======
>>>>>>> 5712753579 (GEOMESA-3176 Docs - fix download links in install instructions)
<<<<<<< HEAD
<<<<<<< HEAD
>>>>>>> locatelli-main
=======
>>>>>>> locatelli-main
=======
>>>>>>> locatelli-main
>>>>>>> b046434188 (GEOMESA-3176 Docs - fix download links in install instructions)
=======
=======
>>>>>>> 86ec77f9cb (GEOMESA-3061 Converters - support bytes in Avro top-level union types (#2762))
<<<<<<< HEAD
<<<<<<< HEAD
=======
<<<<<<< HEAD
<<<<<<< HEAD
<<<<<<< HEAD
=======
>>>>>>> 5712753579 (GEOMESA-3176 Docs - fix download links in install instructions)
>>>>>>> locatelli-main
=======
<<<<<<< HEAD
=======
>>>>>>> 5712753579 (GEOMESA-3176 Docs - fix download links in install instructions)
>>>>>>> locatelli-main
=======
>>>>>>> 5712753579 (GEOMESA-3176 Docs - fix download links in install instructions)
>>>>>>> locatelli-main
=======
>>>>>>> b046434188 (GEOMESA-3176 Docs - fix download links in install instructions)
=======
>>>>>>> 0753bfcbe4 (GEOMESA-3176 Docs - fix download links in install instructions)
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
>>>>>>> 2a887f75bf (GEOMESA-3061 Converters - support bytes in Avro top-level union types (#2762))
=======
>>>>>>> b046434188 (GEOMESA-3176 Docs - fix download links in install instructions)
=======
>>>>>>> d72089513c (GEOMESA-3176 Docs - fix download links in install instructions)
=======
>>>>>>> 27c0ee7e6d (GEOMESA-3061 Converters - support bytes in Avro top-level union types (#2762))
=======
>>>>>>> 5712753579 (GEOMESA-3176 Docs - fix download links in install instructions)
<<<<<<< HEAD
<<<<<<< HEAD
>>>>>>> locatelli-main
=======
>>>>>>> locatelli-main
=======
>>>>>>> locatelli-main
>>>>>>> 90ec70f55 (GEOMESA-3176 Docs - fix download links in install instructions)
<<<<<<< HEAD
<<<<<<< HEAD
>>>>>>> 6a26990f7 (GEOMESA-3176 Docs - fix download links in install instructions)
<<<<<<< HEAD
>>>>>>> 0b36b46b5f (GEOMESA-3176 Docs - fix download links in install instructions)
=======
<<<<<<< HEAD
<<<<<<< HEAD
<<<<<<< HEAD
<<<<<<< HEAD
>>>>>>> location-main
=======
>>>>>>> locationtech-main
=======
>>>>>>> locatelli-main
=======
>>>>>>> locatelli-main
=======
>>>>>>> locatelli-main
=======
=======
>>>>>>> 6eb31fb65 (GEOMESA-3061 Converters - support bytes in Avro top-level union types (#2762))
<<<<<<< HEAD
<<<<<<< HEAD
<<<<<<< HEAD
<<<<<<< HEAD
<<<<<<< HEAD
<<<<<<< HEAD
<<<<<<< HEAD
>>>>>>> 3dd99aed4 (GEOMESA-3061 Converters - support bytes in Avro top-level union types (#2762))
=======
<<<<<<< HEAD
<<<<<<< HEAD
=======
<<<<<<< HEAD
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
<<<<<<< HEAD
<<<<<<< HEAD
<<<<<<< HEAD
=======
>>>>>>> 8435590eee (GEOMESA-3061 Converters - support bytes in Avro top-level union types (#2762))
<<<<<<< HEAD
<<<<<<< HEAD
>>>>>>> locatelli-main
=======
>>>>>>> locatelli-main
=======
>>>>>>> locatelli-main
=======
>>>>>>> f110463a26 (GEOMESA-3061 Converters - support bytes in Avro top-level union types (#2762))
=======
>>>>>>> 17f16286aa (GEOMESA-3061 Converters - support bytes in Avro top-level union types (#2762))
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
>>>>>>> c22ecd64c3 (GEOMESA-3061 Converters - support bytes in Avro top-level union types (#2762))
=======
>>>>>>> f91e29a57f (GEOMESA-3061 Converters - support bytes in Avro top-level union types (#2762))
=======
=======
>>>>>>> f110463a26 (GEOMESA-3061 Converters - support bytes in Avro top-level union types (#2762))
>>>>>>> 39c52cab32 (GEOMESA-3061 Converters - support bytes in Avro top-level union types (#2762))
=======
>>>>>>> 8435590eee (GEOMESA-3061 Converters - support bytes in Avro top-level union types (#2762))
<<<<<<< HEAD
<<<<<<< HEAD
>>>>>>> locatelli-main
=======
>>>>>>> locatelli-main
=======
>>>>>>> locatelli-main
>>>>>>> 3dd99aed4 (GEOMESA-3061 Converters - support bytes in Avro top-level union types (#2762))
<<<<<<< HEAD
>>>>>>> dddc42e265 (GEOMESA-3061 Converters - support bytes in Avro top-level union types (#2762))
=======
<<<<<<< HEAD
<<<<<<< HEAD
<<<<<<< HEAD
<<<<<<< HEAD
>>>>>>> location-main
=======
>>>>>>> locationtech-main
=======
>>>>>>> locatelli-main
=======
>>>>>>> locatelli-main
=======
>>>>>>> locatelli-main
=======
=======
>>>>>>> 4fbe39c62 (GEOMESA-3061 Converters - support bytes in Avro top-level union types (#2762))
=======
<<<<<<< HEAD
<<<<<<< HEAD
<<<<<<< HEAD
<<<<<<< HEAD
<<<<<<< HEAD
=======
>>>>>>> 4c361f07da (GEOMESA-3061 Converters - support bytes in Avro top-level union types (#2762))
=======
>>>>>>> 76908c410a (GEOMESA-3061 Converters - support bytes in Avro top-level union types (#2762))
=======
>>>>>>> location-main
=======
=======
>>>>>>> locatelli-main
=======
>>>>>>> locatelli-main
=======
>>>>>>> locatelli-main
>>>>>>> 4c361f07da (GEOMESA-3061 Converters - support bytes in Avro top-level union types (#2762))
=======
<<<<<<< HEAD
<<<<<<< HEAD
<<<<<<< HEAD
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
<<<<<<< HEAD
=======
>>>>>>> 39c52cab32 (GEOMESA-3061 Converters - support bytes in Avro top-level union types (#2762))
=======
>>>>>>> 8435590eee (GEOMESA-3061 Converters - support bytes in Avro top-level union types (#2762))
<<<<<<< HEAD
<<<<<<< HEAD
>>>>>>> locatelli-main
=======
>>>>>>> locatelli-main
=======
>>>>>>> locatelli-main
>>>>>>> 76908c410a (GEOMESA-3061 Converters - support bytes in Avro top-level union types (#2762))
=======
=======
>>>>>>> f110463a26 (GEOMESA-3061 Converters - support bytes in Avro top-level union types (#2762))
=======
<<<<<<< HEAD
<<<<<<< HEAD
<<<<<<< HEAD
>>>>>>> 76908c410a (GEOMESA-3061 Converters - support bytes in Avro top-level union types (#2762))
=======
>>>>>>> 17f16286aa (GEOMESA-3061 Converters - support bytes in Avro top-level union types (#2762))
>>>>>>> locationtech-main
=======
=======
<<<<<<< HEAD
=======
>>>>>>> locatelli-main
<<<<<<< HEAD
=======
>>>>>>> locatelli-main
=======
>>>>>>> 8435590eee (GEOMESA-3061 Converters - support bytes in Avro top-level union types (#2762))
>>>>>>> 76908c410a (GEOMESA-3061 Converters - support bytes in Avro top-level union types (#2762))
=======
>>>>>>> 17f16286aa (GEOMESA-3061 Converters - support bytes in Avro top-level union types (#2762))
=======
<<<<<<< HEAD
>>>>>>> c22ecd64c3 (GEOMESA-3061 Converters - support bytes in Avro top-level union types (#2762))
=======
>>>>>>> 76908c410a (GEOMESA-3061 Converters - support bytes in Avro top-level union types (#2762))
=======
>>>>>>> f91e29a57f (GEOMESA-3061 Converters - support bytes in Avro top-level union types (#2762))
=======
=======
>>>>>>> 39c52cab32 (GEOMESA-3061 Converters - support bytes in Avro top-level union types (#2762))
=======
>>>>>>> 8435590eee (GEOMESA-3061 Converters - support bytes in Avro top-level union types (#2762))
<<<<<<< HEAD
<<<<<<< HEAD
>>>>>>> locatelli-main
=======
>>>>>>> locatelli-main
=======
>>>>>>> locatelli-main

>>>>>>> b9bdd406e (GEOMESA-3061 Converters - support bytes in Avro top-level union types (#2762))
>>>>>>> 0e68e9f4c (GEOMESA-3061 Converters - support bytes in Avro top-level union types (#2762))
<<<<<<< HEAD
<<<<<<< HEAD
<<<<<<< HEAD
<<<<<<< HEAD
<<<<<<< HEAD
<<<<<<< HEAD
>>>>>>> 45ad5d11f (GEOMESA-3061 Converters - support bytes in Avro top-level union types (#2762))
=======
<<<<<<< HEAD
<<<<<<< HEAD
=======
<<<<<<< HEAD
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
<<<<<<< HEAD
<<<<<<< HEAD
<<<<<<< HEAD
=======
>>>>>>> 341ef96c9a (GEOMESA-3176 Docs - fix download links in install instructions)
<<<<<<< HEAD
<<<<<<< HEAD
>>>>>>> locatelli-main
=======
>>>>>>> locatelli-main
=======
>>>>>>> locatelli-main
=======
>>>>>>> f110463a26 (GEOMESA-3061 Converters - support bytes in Avro top-level union types (#2762))
=======
>>>>>>> aff2787fc2 (GEOMESA-3176 Docs - fix download links in install instructions)
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
>>>>>>> c22ecd64c3 (GEOMESA-3061 Converters - support bytes in Avro top-level union types (#2762))
=======
>>>>>>> e5cf96e863 (GEOMESA-3176 Docs - fix download links in install instructions)
=======
=======
>>>>>>> f110463a26 (GEOMESA-3061 Converters - support bytes in Avro top-level union types (#2762))
>>>>>>> 39c52cab32 (GEOMESA-3061 Converters - support bytes in Avro top-level union types (#2762))
=======
>>>>>>> 341ef96c9a (GEOMESA-3176 Docs - fix download links in install instructions)
<<<<<<< HEAD
<<<<<<< HEAD
>>>>>>> locatelli-main
=======
>>>>>>> locatelli-main
=======
>>>>>>> locatelli-main
>>>>>>> 45ad5d11f (GEOMESA-3061 Converters - support bytes in Avro top-level union types (#2762))
<<<<<<< HEAD
>>>>>>> b009fd23f4 (GEOMESA-3061 Converters - support bytes in Avro top-level union types (#2762))
=======
<<<<<<< HEAD
<<<<<<< HEAD
<<<<<<< HEAD
<<<<<<< HEAD
>>>>>>> location-main
=======
>>>>>>> locationtech-main
=======
>>>>>>> locatelli-main
=======
>>>>>>> locatelli-main
=======
>>>>>>> locatelli-main
=======
=======
>>>>>>> 15e998504 (GEOMESA-3176 Docs - fix download links in install instructions)
<<<<<<< HEAD
<<<<<<< HEAD
>>>>>>> baa90e85a (GEOMESA-3176 Docs - fix download links in install instructions)
<<<<<<< HEAD
<<<<<<< HEAD
<<<<<<< HEAD
<<<<<<< HEAD
=======
<<<<<<< HEAD
>>>>>>> baa90e85a (GEOMESA-3176 Docs - fix download links in install instructions)
<<<<<<< HEAD
>>>>>>> d969b4c2d5 (GEOMESA-3176 Docs - fix download links in install instructions)
=======
>>>>>>> location-main
=======
<<<<<<< HEAD
>>>>>>> d969b4c2d5 (GEOMESA-3176 Docs - fix download links in install instructions)
=======
>>>>>>> locationtech-main
=======
>>>>>>> d969b4c2d5 (GEOMESA-3176 Docs - fix download links in install instructions)
=======
>>>>>>> locatelli-main
=======
>>>>>>> d969b4c2d5 (GEOMESA-3176 Docs - fix download links in install instructions)
=======
>>>>>>> locatelli-main
=======
>>>>>>> d969b4c2d5 (GEOMESA-3176 Docs - fix download links in install instructions)
=======
>>>>>>> locatelli-main
=======
=======
>>>>>>> 07a6a5c29 (GEOMESA-3061 Converters - support bytes in Avro top-level union types (#2762))
<<<<<<< HEAD
>>>>>>> 4524373ac (GEOMESA-3061 Converters - support bytes in Avro top-level union types (#2762))
<<<<<<< HEAD
<<<<<<< HEAD
<<<<<<< HEAD
<<<<<<< HEAD
<<<<<<< HEAD
=======
<<<<<<< HEAD
>>>>>>> 4564a1634e (GEOMESA-3061 Converters - support bytes in Avro top-level union types (#2762))
=======
>>>>>>> location-main
=======
>>>>>>> 4564a1634e (GEOMESA-3061 Converters - support bytes in Avro top-level union types (#2762))
=======
>>>>>>> locationtech-main
=======
>>>>>>> 4564a1634e (GEOMESA-3061 Converters - support bytes in Avro top-level union types (#2762))
=======
>>>>>>> locatelli-main
=======
>>>>>>> 4564a1634e (GEOMESA-3061 Converters - support bytes in Avro top-level union types (#2762))
=======
>>>>>>> locatelli-main
=======
>>>>>>> 4564a1634e (GEOMESA-3061 Converters - support bytes in Avro top-level union types (#2762))
=======
>>>>>>> locatelli-main
=======
=======
>>>>>>> 67b361c85 (GEOMESA-3061 Converters - support bytes in Avro top-level union types (#2762))
<<<<<<< HEAD
>>>>>>> dace2085b (GEOMESA-3061 Converters - support bytes in Avro top-level union types (#2762))
<<<<<<< HEAD
<<<<<<< HEAD
<<<<<<< HEAD
<<<<<<< HEAD
<<<<<<< HEAD
=======
<<<<<<< HEAD
>>>>>>> 238945d4b3 (GEOMESA-3061 Converters - support bytes in Avro top-level union types (#2762))
=======
>>>>>>> location-main
=======
>>>>>>> 238945d4b3 (GEOMESA-3061 Converters - support bytes in Avro top-level union types (#2762))
=======
>>>>>>> locationtech-main
=======
>>>>>>> 238945d4b3 (GEOMESA-3061 Converters - support bytes in Avro top-level union types (#2762))
=======
>>>>>>> locatelli-main
=======
>>>>>>> 238945d4b3 (GEOMESA-3061 Converters - support bytes in Avro top-level union types (#2762))
=======
>>>>>>> locatelli-main
=======
>>>>>>> 238945d4b3 (GEOMESA-3061 Converters - support bytes in Avro top-level union types (#2762))
=======
>>>>>>> locatelli-main
=======
=======
=======
>>>>>>> 90ec70f55 (GEOMESA-3176 Docs - fix download links in install instructions)
>>>>>>> 63db7d154 (GEOMESA-3176 Docs - fix download links in install instructions)
<<<<<<< HEAD
>>>>>>> 46c05fed5 (GEOMESA-3176 Docs - fix download links in install instructions)
<<<<<<< HEAD
<<<<<<< HEAD
<<<<<<< HEAD
<<<<<<< HEAD
<<<<<<< HEAD
=======
<<<<<<< HEAD
>>>>>>> f73ef99f1e (GEOMESA-3176 Docs - fix download links in install instructions)
=======
>>>>>>> location-main
=======
>>>>>>> f73ef99f1e (GEOMESA-3176 Docs - fix download links in install instructions)
=======
>>>>>>> locationtech-main
=======
>>>>>>> f73ef99f1e (GEOMESA-3176 Docs - fix download links in install instructions)
=======
>>>>>>> locatelli-main
=======
>>>>>>> f73ef99f1e (GEOMESA-3176 Docs - fix download links in install instructions)
=======
>>>>>>> locatelli-main
=======
>>>>>>> f73ef99f1e (GEOMESA-3176 Docs - fix download links in install instructions)
=======
>>>>>>> locatelli-main
=======
=======
>>>>>>> 28e2bfa2d (GEOMESA-3061 Converters - support bytes in Avro top-level union types (#2762))
>>>>>>> 4fbe39c62 (GEOMESA-3061 Converters - support bytes in Avro top-level union types (#2762))
<<<<<<< HEAD
<<<<<<< HEAD
<<<<<<< HEAD
<<<<<<< HEAD
<<<<<<< HEAD
=======
>>>>>>> 516fe7e9c (GEOMESA-3061 Converters - support bytes in Avro top-level union types (#2762))
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
>>>>>>> be05354746 (GEOMESA-3061 Converters - support bytes in Avro top-level union types (#2762))
=======
=======
>>>>>>> 516fe7e9c (GEOMESA-3061 Converters - support bytes in Avro top-level union types (#2762))
<<<<<<< HEAD
<<<<<<< HEAD
<<<<<<< HEAD
<<<<<<< HEAD
<<<<<<< HEAD
>>>>>>> bc4062951d (GEOMESA-3061 Converters - support bytes in Avro top-level union types (#2762))
=======
>>>>>>> location-main
=======
=======
<<<<<<< HEAD
<<<<<<< HEAD
<<<<<<< HEAD
>>>>>>> locatelli-main
<<<<<<< HEAD
<<<<<<< HEAD
=======
>>>>>>> 638b68d081 (Merge branch 'feature/postgis-fixes')
<<<<<<< HEAD
>>>>>>> bc4062951d (GEOMESA-3061 Converters - support bytes in Avro top-level union types (#2762))
=======
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
>>>>>>> 638b68d081 (Merge branch 'feature/postgis-fixes')
<<<<<<< HEAD
>>>>>>> locatelli-main
=======
>>>>>>> locatelli-main
=======
>>>>>>> f893d9a594 (Merge branch 'feature/postgis-fixes')
=======
>>>>>>> 6c83981af3 (GEOMESA-3061 Converters - support bytes in Avro top-level union types (#2762))
=======
=======
>>>>>>> 638b68d081 (Merge branch 'feature/postgis-fixes')
>>>>>>> b6e56a9e80 (Merge branch 'feature/postgis-fixes')
>>>>>>> bc4062951d (GEOMESA-3061 Converters - support bytes in Avro top-level union types (#2762))
=======
<<<<<<< HEAD
<<<<<<< HEAD
>>>>>>> locatelli-main
=======
>>>>>>> locatelli-main
=======
>>>>>>> locatelli-main
=======
=======
>>>>>>> 3be8d2a5a (Merge branch 'feature/postgis-fixes')
>>>>>>> e8cc4971c6 (Merge branch 'feature/postgis-fixes')
<<<<<<< HEAD
<<<<<<< HEAD
<<<<<<< HEAD
<<<<<<< HEAD
<<<<<<< HEAD
=======
<<<<<<< HEAD
>>>>>>> e944f1c88b (Merge branch 'feature/postgis-fixes')
=======
>>>>>>> location-main
=======
>>>>>>> d9ed077cd (GEOMESA-3061 Converters - support bytes in Avro top-level union types (#2762))
<<<<<<< HEAD
>>>>>>> 81ee66102b (GEOMESA-3061 Converters - support bytes in Avro top-level union types (#2762))
<<<<<<< HEAD
=======
<<<<<<< HEAD
>>>>>>> 8adfab65bb (GEOMESA-3061 Converters - support bytes in Avro top-level union types (#2762))
=======
>>>>>>> location-main
=======
=======
<<<<<<< HEAD
<<<<<<< HEAD
<<<<<<< HEAD
>>>>>>> locatelli-main
<<<<<<< HEAD
<<<<<<< HEAD
=======
>>>>>>> a1f15598cb (GEOMESA-3061 Converters - support bytes in Avro top-level union types (#2762))
<<<<<<< HEAD
=======
=======
<<<<<<< HEAD
=======
>>>>>>> locatelli-main
<<<<<<< HEAD
<<<<<<< HEAD
<<<<<<< HEAD
=======
>>>>>>> a1f15598cb (GEOMESA-3061 Converters - support bytes in Avro top-level union types (#2762))
<<<<<<< HEAD
>>>>>>> locatelli-main
=======
>>>>>>> locatelli-main
=======
>>>>>>> b8ebbf6083 (GEOMESA-3061 Converters - support bytes in Avro top-level union types (#2762))
=======
>>>>>>> b6e56a9e80 (Merge branch 'feature/postgis-fixes')
=======
=======
>>>>>>> a1f15598cb (GEOMESA-3061 Converters - support bytes in Avro top-level union types (#2762))
>>>>>>> b1f71c0764 (GEOMESA-3061 Converters - support bytes in Avro top-level union types (#2762))
<<<<<<< HEAD
<<<<<<< HEAD
>>>>>>> locatelli-main
=======
>>>>>>> locatelli-main
=======
>>>>>>> locatelli-main
>>>>>>> e944f1c88b (Merge branch 'feature/postgis-fixes')
=======
=======
>>>>>>> d9ed077cd (GEOMESA-3061 Converters - support bytes in Avro top-level union types (#2762))
<<<<<<< HEAD
<<<<<<< HEAD
<<<<<<< HEAD
<<<<<<< HEAD
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
<<<<<<< HEAD
=======
>>>>>>> b1f71c0764 (GEOMESA-3061 Converters - support bytes in Avro top-level union types (#2762))
=======
>>>>>>> 7f7083f095 (GEOMESA-3176 Docs - fix download links in install instructions)
<<<<<<< HEAD
<<<<<<< HEAD
>>>>>>> locatelli-main
=======
>>>>>>> locatelli-main
=======
>>>>>>> locatelli-main
>>>>>>> 81ee66102b (GEOMESA-3061 Converters - support bytes in Avro top-level union types (#2762))
<<<<<<< HEAD
>>>>>>> 8adfab65bb (GEOMESA-3061 Converters - support bytes in Avro top-level union types (#2762))
=======
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
=======
=======
>>>>>>> c5e182765 (GEOMESA-3061 Converters - support bytes in Avro top-level union types (#2762))
=======
<<<<<<< HEAD
<<<<<<< HEAD
<<<<<<< HEAD
<<<<<<< HEAD
>>>>>>> 6eb31fb65 (GEOMESA-3061 Converters - support bytes in Avro top-level union types (#2762))
=======
<<<<<<< HEAD
=======
<<<<<<< HEAD
<<<<<<< HEAD
>>>>>>> 6eb31fb65 (GEOMESA-3061 Converters - support bytes in Avro top-level union types (#2762))
=======
=======
<<<<<<< HEAD
=======
>>>>>>> locatelli-main
<<<<<<< HEAD
=======
>>>>>>> locatelli-main
<<<<<<< HEAD
<<<<<<< HEAD
<<<<<<< HEAD
=======
>>>>>>> a38834fade (GEOMESA-3061 Converters - support bytes in Avro top-level union types (#2762))
=======
>>>>>>> dcbf9c4320 (GEOMESA-3061 Converters - support bytes in Avro top-level union types (#2762))
>>>>>>> 6eb31fb65 (GEOMESA-3061 Converters - support bytes in Avro top-level union types (#2762))
=======
<<<<<<< HEAD
<<<<<<< HEAD
<<<<<<< HEAD
<<<<<<< HEAD
<<<<<<< HEAD
<<<<<<< HEAD
>>>>>>> locatelli-main
=======
>>>>>>> locatelli-main
<<<<<<< HEAD
=======
>>>>>>> locatelli-main
<<<<<<< HEAD
<<<<<<< HEAD
=======
>>>>>>> c91f823574 (GEOMESA-3061 Converters - support bytes in Avro top-level union types (#2762))
<<<<<<< HEAD
<<<<<<< HEAD
<<<<<<< HEAD
>>>>>>> locationtech-main
=======
=======
>>>>>>> locatelli-main
=======
>>>>>>> locatelli-main
=======
>>>>>>> 6e48efcdc2 (GEOMESA-3061 Converters - support bytes in Avro top-level union types (#2762))
=======
>>>>>>> 84e5c6b001 (GEOMESA-3176 Docs - fix download links in install instructions)
=======
=======
>>>>>>> c91f823574 (GEOMESA-3061 Converters - support bytes in Avro top-level union types (#2762))
>>>>>>> 8a2d92d131 (GEOMESA-3061 Converters - support bytes in Avro top-level union types (#2762))
<<<<<<< HEAD
<<<<<<< HEAD
>>>>>>> locatelli-main
=======
>>>>>>> locatelli-main
=======
>>>>>>> locatelli-main
>>>>>>> 15e998504 (GEOMESA-3176 Docs - fix download links in install instructions)
=======
>>>>>>> 07a6a5c29 (GEOMESA-3061 Converters - support bytes in Avro top-level union types (#2762))
=======
>>>>>>> 67b361c85 (GEOMESA-3061 Converters - support bytes in Avro top-level union types (#2762))
<<<<<<< HEAD
<<<<<<< HEAD
<<<<<<< HEAD
<<<<<<< HEAD
<<<<<<< HEAD
=======
<<<<<<< HEAD
<<<<<<< HEAD
=======
>>>>>>> b046434188 (GEOMESA-3176 Docs - fix download links in install instructions)
>>>>>>> location-main
=======
=======
=======
>>>>>>> locatelli-main
=======
>>>>>>> locatelli-main
<<<<<<< HEAD
<<<<<<< HEAD
<<<<<<< HEAD
<<<<<<< HEAD
<<<<<<< HEAD
<<<<<<< HEAD
<<<<<<< HEAD
>>>>>>> locatelli-main
<<<<<<< HEAD
<<<<<<< HEAD
<<<<<<< HEAD
<<<<<<< HEAD
=======
<<<<<<< HEAD
=======
<<<<<<< HEAD
<<<<<<< HEAD
<<<<<<< HEAD
>>>>>>> locatelli-main
=======
<<<<<<< HEAD
>>>>>>> locatelli-main
=======
>>>>>>> 5712753579 (GEOMESA-3176 Docs - fix download links in install instructions)
=======
>>>>>>> 27c0ee7e6d (GEOMESA-3061 Converters - support bytes in Avro top-level union types (#2762))
=======
<<<<<<< HEAD
>>>>>>> 98c12ce706 (GEOMESA-3061 Converters - support bytes in Avro top-level union types (#2762))
=======
<<<<<<< HEAD
=======
>>>>>>> dcc9d7f708 (GEOMESA-3176 Docs - fix download links in install instructions)
<<<<<<< HEAD
<<<<<<< HEAD
>>>>>>> locatelli-main
=======
>>>>>>> locatelli-main
<<<<<<< HEAD
=======
>>>>>>> locatelli-main
>>>>>>> b046434188 (GEOMESA-3176 Docs - fix download links in install instructions)
=======
=======
>>>>>>> 90ec70f55 (GEOMESA-3176 Docs - fix download links in install instructions)
>>>>>>> 63db7d154 (GEOMESA-3176 Docs - fix download links in install instructions)
<<<<<<< HEAD
=======
=======
>>>>>>> 28e2bfa2d (GEOMESA-3061 Converters - support bytes in Avro top-level union types (#2762))
=======
=======
>>>>>>> fe3de10f11 (GEOMESA-3061 Converters - support bytes in Avro top-level union types (#2762))
<<<<<<< HEAD
<<<<<<< HEAD
=======
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
>>>>>>> 86ec77f9cb (GEOMESA-3061 Converters - support bytes in Avro top-level union types (#2762))
=======
=======
>>>>>>> b046434188 (GEOMESA-3176 Docs - fix download links in install instructions)
>>>>>>> 0753bfcbe4 (GEOMESA-3176 Docs - fix download links in install instructions)
<<<<<<< HEAD
<<<<<<< HEAD
<<<<<<< HEAD
>>>>>>> locationtech-main
=======
=======
>>>>>>> locatelli-main
=======
>>>>>>> locatelli-main
=======
>>>>>>> dcc9d7f708 (GEOMESA-3176 Docs - fix download links in install instructions)
=======
>>>>>>> 86ec77f9cb (GEOMESA-3061 Converters - support bytes in Avro top-level union types (#2762))
=======
=======
>>>>>>> b046434188 (GEOMESA-3176 Docs - fix download links in install instructions)
>>>>>>> 0753bfcbe4 (GEOMESA-3176 Docs - fix download links in install instructions)
=======
=======
>>>>>>> 90ec70f55 (GEOMESA-3176 Docs - fix download links in install instructions)
>>>>>>> 63db7d154 (GEOMESA-3176 Docs - fix download links in install instructions)
<<<<<<< HEAD
<<<<<<< HEAD
<<<<<<< HEAD
=======
>>>>>>> 5712753579 (GEOMESA-3176 Docs - fix download links in install instructions)
=======
<<<<<<< HEAD
>>>>>>> cabde54511 (GEOMESA-3176 Docs - fix download links in install instructions)
=======
=======
>>>>>>> 28e2bfa2d (GEOMESA-3061 Converters - support bytes in Avro top-level union types (#2762))
>>>>>>> c91f823574 (GEOMESA-3061 Converters - support bytes in Avro top-level union types (#2762))
=======
=======
>>>>>>> 0fa73844a1 (GEOMESA-3061 Converters - support bytes in Avro top-level union types (#2762))
=======
>>>>>>> 2a887f75bf (GEOMESA-3061 Converters - support bytes in Avro top-level union types (#2762))
=======
=======
>>>>>>> b046434188 (GEOMESA-3176 Docs - fix download links in install instructions)
>>>>>>> d72089513c (GEOMESA-3176 Docs - fix download links in install instructions)
<<<<<<< HEAD
<<<<<<< HEAD
>>>>>>> locatelli-main
=======
>>>>>>> locatelli-main
=======
>>>>>>> locatelli-main
=======
=======
>>>>>>> 90ec70f55 (GEOMESA-3176 Docs - fix download links in install instructions)
>>>>>>> 63db7d154 (GEOMESA-3176 Docs - fix download links in install instructions)
<<<<<<< HEAD
=======
<<<<<<< HEAD
<<<<<<< HEAD
<<<<<<< HEAD
<<<<<<< HEAD
<<<<<<< HEAD
>>>>>>> location-main
=======
=======
>>>>>>> 28e2bfa2d (GEOMESA-3061 Converters - support bytes in Avro top-level union types (#2762))
=======
>>>>>>> cabde54511 (GEOMESA-3176 Docs - fix download links in install instructions)
=======
=======
>>>>>>> locatelli-main
=======
>>>>>>> locatelli-main
>>>>>>> 96b5e91bc8 (GEOMESA-3176 Docs - fix download links in install instructions)
=======
=======
>>>>>>> 28e2bfa2d (GEOMESA-3061 Converters - support bytes in Avro top-level union types (#2762))
>>>>>>> 6e48efcdc2 (GEOMESA-3061 Converters - support bytes in Avro top-level union types (#2762))
=======
>>>>>>> 98c12ce706 (GEOMESA-3061 Converters - support bytes in Avro top-level union types (#2762))
=======
=======
<<<<<<< HEAD
>>>>>>> cabde54511 (GEOMESA-3176 Docs - fix download links in install instructions)
<<<<<<< HEAD
>>>>>>> dcc9d7f708 (GEOMESA-3176 Docs - fix download links in install instructions)
=======
<<<<<<< HEAD
<<<<<<< HEAD
>>>>>>> locatelli-main
=======
>>>>>>> locatelli-main
=======
>>>>>>> locatelli-main
=======
=======
>>>>>>> 28e2bfa2d (GEOMESA-3061 Converters - support bytes in Avro top-level union types (#2762))
>>>>>>> c91f823574 (GEOMESA-3061 Converters - support bytes in Avro top-level union types (#2762))
<<<<<<< HEAD
<<<<<<< HEAD
<<<<<<< HEAD
>>>>>>> locationtech-main
=======
>>>>>>> 8a2d92d131 (GEOMESA-3061 Converters - support bytes in Avro top-level union types (#2762))
>>>>>>> locatelli-main
=======
>>>>>>> 8a2d92d131 (GEOMESA-3061 Converters - support bytes in Avro top-level union types (#2762))
>>>>>>> locatelli-main
=======
>>>>>>> 8a2d92d131 (GEOMESA-3061 Converters - support bytes in Avro top-level union types (#2762))
>>>>>>> locatelli-main

>>>>>>> b9bdd406e (GEOMESA-3061 Converters - support bytes in Avro top-level union types (#2762))
=======
>>>>>>> 16b2e83f2 (GEOMESA-3176 Docs - fix download links in install instructions)
<<<<<<< HEAD
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
=======
<<<<<<< HEAD
=======
>>>>>>> locatelli-main
<<<<<<< HEAD
=======
>>>>>>> locatelli-main
<<<<<<< HEAD
<<<<<<< HEAD
<<<<<<< HEAD
=======
>>>>>>> 8a2d92d131 (GEOMESA-3061 Converters - support bytes in Avro top-level union types (#2762))
<<<<<<< HEAD
<<<<<<< HEAD
>>>>>>> locatelli-main
=======
>>>>>>> locatelli-main
=======
>>>>>>> locatelli-main
=======
>>>>>>> cabde54511 (GEOMESA-3176 Docs - fix download links in install instructions)
=======
>>>>>>> c91f823574 (GEOMESA-3061 Converters - support bytes in Avro top-level union types (#2762))
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
>>>>>>> 96b5e91bc8 (GEOMESA-3176 Docs - fix download links in install instructions)
=======
>>>>>>> 6e48efcdc2 (GEOMESA-3061 Converters - support bytes in Avro top-level union types (#2762))
=======
=======
>>>>>>> cabde54511 (GEOMESA-3176 Docs - fix download links in install instructions)
>>>>>>> dcc9d7f708 (GEOMESA-3176 Docs - fix download links in install instructions)
=======
>>>>>>> 8a2d92d131 (GEOMESA-3061 Converters - support bytes in Avro top-level union types (#2762))
<<<<<<< HEAD
<<<<<<< HEAD
>>>>>>> locatelli-main
=======
>>>>>>> locatelli-main
=======
>>>>>>> locatelli-main
>>>>>>> 2aa923cc9 (GEOMESA-3176 Docs - fix download links in install instructions)
<<<<<<< HEAD
>>>>>>> bdcaf0ab5e (GEOMESA-3176 Docs - fix download links in install instructions)
<<<<<<< HEAD
<<<<<<< HEAD
<<<<<<< HEAD
<<<<<<< HEAD
<<<<<<< HEAD
=======
<<<<<<< HEAD
>>>>>>> 235bc2820d (GEOMESA-3176 Docs - fix download links in install instructions)
=======
>>>>>>> location-main
=======
>>>>>>> 235bc2820d (GEOMESA-3176 Docs - fix download links in install instructions)
=======
>>>>>>> locationtech-main
=======
>>>>>>> 235bc2820d (GEOMESA-3176 Docs - fix download links in install instructions)
=======
>>>>>>> locatelli-main
=======
>>>>>>> 235bc2820d (GEOMESA-3176 Docs - fix download links in install instructions)
=======
>>>>>>> locatelli-main
=======
>>>>>>> 235bc2820d (GEOMESA-3176 Docs - fix download links in install instructions)
=======
>>>>>>> locatelli-main
=======
=======
=======
=======
>>>>>>> 0fbf9e83e (GEOMESA-3176 Docs - fix download links in install instructions)
=======
>>>>>>> 89bdd3013 (GEOMESA-3061 Converters - support bytes in Avro top-level union types (#2762))
=======
>>>>>>> f9e8439b0 (GEOMESA-3176 Docs - fix download links in install instructions)
=======
>>>>>>> 72bafaf54 (GEOMESA-3061 Converters - support bytes in Avro top-level union types (#2762))
<<<<<<< HEAD
=======
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
>>>>>>> 72bafaf54 (GEOMESA-3061 Converters - support bytes in Avro top-level union types (#2762))
=======
>>>>>>> cabde54511 (GEOMESA-3176 Docs - fix download links in install instructions)
<<<<<<< HEAD
=======
<<<<<<< HEAD
<<<<<<< HEAD
<<<<<<< HEAD
>>>>>>> locationtech-main
=======
=======
>>>>>>> locatelli-main
=======
>>>>>>> locatelli-main
>>>>>>> 72bafaf54 (GEOMESA-3061 Converters - support bytes in Avro top-level union types (#2762))
<<<<<<< HEAD
=======
>>>>>>> 72bafaf54 (GEOMESA-3061 Converters - support bytes in Avro top-level union types (#2762))
=======
>>>>>>> cabde54511 (GEOMESA-3176 Docs - fix download links in install instructions)
=======
>>>>>>> 96b5e91bc8 (GEOMESA-3176 Docs - fix download links in install instructions)
<<<<<<< HEAD
=======
<<<<<<< HEAD
<<<<<<< HEAD
>>>>>>> locatelli-main
=======
>>>>>>> locatelli-main
=======
>>>>>>> locatelli-main
>>>>>>> 6eb31fb65 (GEOMESA-3061 Converters - support bytes in Avro top-level union types (#2762))
>>>>>>> 5f428db97 (GEOMESA-3061 Converters - support bytes in Avro top-level union types (#2762))
=======
>>>>>>> 07a6a5c29 (GEOMESA-3061 Converters - support bytes in Avro top-level union types (#2762))
=======
>>>>>>> 63db7d154 (GEOMESA-3176 Docs - fix download links in install instructions)
=======
<<<<<<< HEAD
<<<<<<< HEAD
<<<<<<< HEAD
=======
<<<<<<< HEAD
=======
<<<<<<< HEAD
>>>>>>> locatelli-main
=======
>>>>>>> locatelli-main
<<<<<<< HEAD
=======
=======
>>>>>>> locatelli-main
>>>>>>> 6eb31fb65 (GEOMESA-3061 Converters - support bytes in Avro top-level union types (#2762))
>>>>>>> 28e2bfa2d (GEOMESA-3061 Converters - support bytes in Avro top-level union types (#2762))
=======
=======
>>>>>>> cabde54511 (GEOMESA-3176 Docs - fix download links in install instructions)
<<<<<<< HEAD
<<<<<<< HEAD
<<<<<<< HEAD
>>>>>>> locationtech-main
=======
=======
>>>>>>> locatelli-main
=======
>>>>>>> locatelli-main
=======
>>>>>>> 6eb31fb65 (GEOMESA-3061 Converters - support bytes in Avro top-level union types (#2762))
>>>>>>> 28e2bfa2d (GEOMESA-3061 Converters - support bytes in Avro top-level union types (#2762))
=======
=======
>>>>>>> 96b5e91bc8 (GEOMESA-3176 Docs - fix download links in install instructions)
=======
>>>>>>> dcc9d7f708 (GEOMESA-3176 Docs - fix download links in install instructions)
=======
>>>>>>> 6eb31fb65 (GEOMESA-3061 Converters - support bytes in Avro top-level union types (#2762))
>>>>>>> 28e2bfa2d (GEOMESA-3061 Converters - support bytes in Avro top-level union types (#2762))
=======
=======
>>>>>>> cabde54511 (GEOMESA-3176 Docs - fix download links in install instructions)
<<<<<<< HEAD
<<<<<<< HEAD
>>>>>>> locatelli-main
=======
>>>>>>> locatelli-main
=======
>>>>>>> locatelli-main
=======
>>>>>>> 6eb31fb65 (GEOMESA-3061 Converters - support bytes in Avro top-level union types (#2762))
>>>>>>> 28e2bfa2d (GEOMESA-3061 Converters - support bytes in Avro top-level union types (#2762))
=======
>>>>>>> b03141c1bb (GEOMESA-3061 Converters - support bytes in Avro top-level union types (#2762))
=======
>>>>>>> 32234db855 (GEOMESA-3061 Converters - support bytes in Avro top-level union types (#2762))
=======
=======

>>>>>>> b9bdd406e (GEOMESA-3061 Converters - support bytes in Avro top-level union types (#2762))
>>>>>>> f71fa3c0e (GEOMESA-3061 Converters - support bytes in Avro top-level union types (#2762))
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
=======
<<<<<<< HEAD
=======
>>>>>>> locatelli-main
<<<<<<< HEAD
=======
>>>>>>> locatelli-main
<<<<<<< HEAD
<<<<<<< HEAD
<<<<<<< HEAD
=======
>>>>>>> 8a2d92d131 (GEOMESA-3061 Converters - support bytes in Avro top-level union types (#2762))
<<<<<<< HEAD
<<<<<<< HEAD
>>>>>>> locatelli-main
=======
>>>>>>> locatelli-main
=======
>>>>>>> locatelli-main
=======
>>>>>>> fe3de10f11 (GEOMESA-3061 Converters - support bytes in Avro top-level union types (#2762))
=======
>>>>>>> c91f823574 (GEOMESA-3061 Converters - support bytes in Avro top-level union types (#2762))
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
>>>>>>> 0fa73844a1 (GEOMESA-3061 Converters - support bytes in Avro top-level union types (#2762))
=======
>>>>>>> 6e48efcdc2 (GEOMESA-3061 Converters - support bytes in Avro top-level union types (#2762))
=======
=======
>>>>>>> fe3de10f11 (GEOMESA-3061 Converters - support bytes in Avro top-level union types (#2762))
>>>>>>> 98c12ce706 (GEOMESA-3061 Converters - support bytes in Avro top-level union types (#2762))
=======
>>>>>>> 8a2d92d131 (GEOMESA-3061 Converters - support bytes in Avro top-level union types (#2762))
<<<<<<< HEAD
<<<<<<< HEAD
>>>>>>> locatelli-main
=======
>>>>>>> locatelli-main
=======
>>>>>>> locatelli-main
>>>>>>> c5e182765 (GEOMESA-3061 Converters - support bytes in Avro top-level union types (#2762))
<<<<<<< HEAD
>>>>>>> f9f6fde40b (GEOMESA-3061 Converters - support bytes in Avro top-level union types (#2762))
<<<<<<< HEAD
<<<<<<< HEAD
<<<<<<< HEAD
<<<<<<< HEAD
<<<<<<< HEAD
=======
<<<<<<< HEAD
>>>>>>> 4a05f27ba4 (GEOMESA-3061 Converters - support bytes in Avro top-level union types (#2762))
=======
>>>>>>> location-main
=======
>>>>>>> 4a05f27ba4 (GEOMESA-3061 Converters - support bytes in Avro top-level union types (#2762))
=======
>>>>>>> locationtech-main
=======
>>>>>>> 4a05f27ba4 (GEOMESA-3061 Converters - support bytes in Avro top-level union types (#2762))
=======
>>>>>>> locatelli-main
=======
>>>>>>> 4a05f27ba4 (GEOMESA-3061 Converters - support bytes in Avro top-level union types (#2762))
=======
>>>>>>> locatelli-main
=======
>>>>>>> 4a05f27ba4 (GEOMESA-3061 Converters - support bytes in Avro top-level union types (#2762))
=======
>>>>>>> locatelli-main
=======
=======
=======
>>>>>>> 72bafaf54 (GEOMESA-3061 Converters - support bytes in Avro top-level union types (#2762))
<<<<<<< HEAD
<<<<<<< HEAD
<<<<<<< HEAD
<<<<<<< HEAD
=======
<<<<<<< HEAD
=======
<<<<<<< HEAD
=======
>>>>>>> locatelli-main
<<<<<<< HEAD
=======
=======
>>>>>>> locatelli-main
>>>>>>> 67b361c85 (GEOMESA-3061 Converters - support bytes in Avro top-level union types (#2762))
>>>>>>> c8a325e13 (GEOMESA-3061 Converters - support bytes in Avro top-level union types (#2762))
=======
<<<<<<< HEAD
=======
>>>>>>> c91f823574 (GEOMESA-3061 Converters - support bytes in Avro top-level union types (#2762))
<<<<<<< HEAD
=======
>>>>>>> 67b361c85 (GEOMESA-3061 Converters - support bytes in Avro top-level union types (#2762))
>>>>>>> c8a325e13 (GEOMESA-3061 Converters - support bytes in Avro top-level union types (#2762))
=======
<<<<<<< HEAD
=======
>>>>>>> 6e48efcdc2 (GEOMESA-3061 Converters - support bytes in Avro top-level union types (#2762))
<<<<<<< HEAD
=======
>>>>>>> 67b361c85 (GEOMESA-3061 Converters - support bytes in Avro top-level union types (#2762))
>>>>>>> c8a325e13 (GEOMESA-3061 Converters - support bytes in Avro top-level union types (#2762))
=======
<<<<<<< HEAD
=======
>>>>>>> 8a2d92d131 (GEOMESA-3061 Converters - support bytes in Avro top-level union types (#2762))
<<<<<<< HEAD
<<<<<<< HEAD
>>>>>>> locatelli-main
=======
>>>>>>> locatelli-main
<<<<<<< HEAD
=======
>>>>>>> locatelli-main
=======
>>>>>>> 67b361c85 (GEOMESA-3061 Converters - support bytes in Avro top-level union types (#2762))
>>>>>>> c8a325e13 (GEOMESA-3061 Converters - support bytes in Avro top-level union types (#2762))
=======
<<<<<<< HEAD
=======
>>>>>>> c91f823574 (GEOMESA-3061 Converters - support bytes in Avro top-level union types (#2762))
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
>>>>>>> 67b361c85 (GEOMESA-3061 Converters - support bytes in Avro top-level union types (#2762))
>>>>>>> c8a325e13 (GEOMESA-3061 Converters - support bytes in Avro top-level union types (#2762))
=======
<<<<<<< HEAD
<<<<<<< HEAD
>>>>>>> 89bdd3013 (GEOMESA-3061 Converters - support bytes in Avro top-level union types (#2762))
=======
<<<<<<< HEAD
>>>>>>> 5f428db97 (GEOMESA-3061 Converters - support bytes in Avro top-level union types (#2762))
=======
>>>>>>> 9d708b240 (GEOMESA-3061 Converters - support bytes in Avro top-level union types (#2762))
<<<<<<< HEAD
>>>>>>> 53a3e72cbf (GEOMESA-3061 Converters - support bytes in Avro top-level union types (#2762))
<<<<<<< HEAD
<<<<<<< HEAD
<<<<<<< HEAD
<<<<<<< HEAD
<<<<<<< HEAD
=======
<<<<<<< HEAD
>>>>>>> 7b0539b808 (GEOMESA-3061 Converters - support bytes in Avro top-level union types (#2762))
=======
>>>>>>> location-main
=======
>>>>>>> 7b0539b808 (GEOMESA-3061 Converters - support bytes in Avro top-level union types (#2762))
=======
>>>>>>> locationtech-main
=======
=======
<<<<<<< HEAD
=======
<<<<<<< HEAD
=======
=======
=======
>>>>>>> locatelli-main
=======
>>>>>>> locatelli-main
>>>>>>> 7b0539b808 (GEOMESA-3061 Converters - support bytes in Avro top-level union types (#2762))
=======
=======
=======
<<<<<<< HEAD
<<<<<<< HEAD
=======
=======
<<<<<<< HEAD
<<<<<<< HEAD
>>>>>>> locatelli-main
=======
>>>>>>> locatelli-main
<<<<<<< HEAD
<<<<<<< HEAD
=======
>>>>>>> c91f823574 (GEOMESA-3061 Converters - support bytes in Avro top-level union types (#2762))
<<<<<<< HEAD
<<<<<<< HEAD
>>>>>>> locationtech-main
=======
>>>>>>> locatelli-main
=======
>>>>>>> locatelli-main
=======
<<<<<<< HEAD
=======
>>>>>>> c91f823574 (GEOMESA-3061 Converters - support bytes in Avro top-level union types (#2762))
>>>>>>> locatelli-main
>>>>>>> 28e2bfa2d (GEOMESA-3061 Converters - support bytes in Avro top-level union types (#2762))
=======
>>>>>>> 72bafaf54 (GEOMESA-3061 Converters - support bytes in Avro top-level union types (#2762))
=======
<<<<<<< HEAD
=======
<<<<<<< HEAD
<<<<<<< HEAD
<<<<<<< HEAD
<<<<<<< HEAD
=======
>>>>>>> fe3de10f11 (GEOMESA-3061 Converters - support bytes in Avro top-level union types (#2762))
=======
>>>>>>> c91f823574 (GEOMESA-3061 Converters - support bytes in Avro top-level union types (#2762))
>>>>>>> locationtech-main
=======
>>>>>>> fe3de10f11 (GEOMESA-3061 Converters - support bytes in Avro top-level union types (#2762))
=======
>>>>>>> c91f823574 (GEOMESA-3061 Converters - support bytes in Avro top-level union types (#2762))
>>>>>>> locatelli-main
=======
>>>>>>> fe3de10f11 (GEOMESA-3061 Converters - support bytes in Avro top-level union types (#2762))
=======
>>>>>>> c91f823574 (GEOMESA-3061 Converters - support bytes in Avro top-level union types (#2762))
>>>>>>> locatelli-main
=======
>>>>>>> fe3de10f11 (GEOMESA-3061 Converters - support bytes in Avro top-level union types (#2762))
=======
>>>>>>> c91f823574 (GEOMESA-3061 Converters - support bytes in Avro top-level union types (#2762))
>>>>>>> locatelli-main

>>>>>>> b9bdd406e (GEOMESA-3061 Converters - support bytes in Avro top-level union types (#2762))
>>>>>>> cdb410251 (GEOMESA-3061 Converters - support bytes in Avro top-level union types (#2762))
<<<<<<< HEAD
<<<<<<< HEAD
<<<<<<< HEAD
<<<<<<< HEAD
=======
<<<<<<< HEAD
<<<<<<< HEAD
=======
<<<<<<< HEAD
=======
=======
>>>>>>> locatelli-main
=======
>>>>>>> locatelli-main
>>>>>>> cabde54511 (GEOMESA-3176 Docs - fix download links in install instructions)
>>>>>>> c8a325e13 (GEOMESA-3061 Converters - support bytes in Avro top-level union types (#2762))
>>>>>>> 0fa73844a1 (GEOMESA-3061 Converters - support bytes in Avro top-level union types (#2762))
=======
<<<<<<< HEAD
<<<<<<< HEAD
<<<<<<< HEAD
=======
>>>>>>> c91f823574 (GEOMESA-3061 Converters - support bytes in Avro top-level union types (#2762))
>>>>>>> 28e2bfa2d (GEOMESA-3061 Converters - support bytes in Avro top-level union types (#2762))
=======
>>>>>>> 72bafaf54 (GEOMESA-3061 Converters - support bytes in Avro top-level union types (#2762))
=======
<<<<<<< HEAD
=======
>>>>>>> fe3de10f11 (GEOMESA-3061 Converters - support bytes in Avro top-level union types (#2762))
=======
>>>>>>> c91f823574 (GEOMESA-3061 Converters - support bytes in Avro top-level union types (#2762))

>>>>>>> b9bdd406e (GEOMESA-3061 Converters - support bytes in Avro top-level union types (#2762))
>>>>>>> cdb410251 (GEOMESA-3061 Converters - support bytes in Avro top-level union types (#2762))
<<<<<<< HEAD
<<<<<<< HEAD
<<<<<<< HEAD
<<<<<<< HEAD
>>>>>>> locatelli-main
=======
>>>>>>> locatelli-main
<<<<<<< HEAD
<<<<<<< HEAD
=======
>>>>>>> cabde54511 (GEOMESA-3176 Docs - fix download links in install instructions)
<<<<<<< HEAD
<<<<<<< HEAD
>>>>>>> locationtech-main
=======
>>>>>>> locatelli-main
=======
>>>>>>> locatelli-main
=======
<<<<<<< HEAD
=======
>>>>>>> cabde54511 (GEOMESA-3176 Docs - fix download links in install instructions)
>>>>>>> locatelli-main
>>>>>>> c8a325e13 (GEOMESA-3061 Converters - support bytes in Avro top-level union types (#2762))
=======
<<<<<<< HEAD
>>>>>>> f9e8439b0 (GEOMESA-3176 Docs - fix download links in install instructions)
=======
<<<<<<< HEAD
<<<<<<< HEAD
<<<<<<< HEAD
=======
<<<<<<< HEAD
<<<<<<< HEAD
=======
<<<<<<< HEAD
<<<<<<< HEAD
=======
>>>>>>> dcc9d7f708 (GEOMESA-3176 Docs - fix download links in install instructions)
>>>>>>> locatelli-main
=======
<<<<<<< HEAD
=======
>>>>>>> dcc9d7f708 (GEOMESA-3176 Docs - fix download links in install instructions)
>>>>>>> locatelli-main
=======
>>>>>>> dcc9d7f708 (GEOMESA-3176 Docs - fix download links in install instructions)
>>>>>>> locatelli-main
>>>>>>> c8a325e13 (GEOMESA-3061 Converters - support bytes in Avro top-level union types (#2762))
>>>>>>> fe3de10f11 (GEOMESA-3061 Converters - support bytes in Avro top-level union types (#2762))
=======
=======
>>>>>>> cabde54511 (GEOMESA-3176 Docs - fix download links in install instructions)
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
>>>>>>> f9e8439b0 (GEOMESA-3176 Docs - fix download links in install instructions)
=======
>>>>>>> 96b5e91bc8 (GEOMESA-3176 Docs - fix download links in install instructions)
=======
>>>>>>> c8a325e13 (GEOMESA-3061 Converters - support bytes in Avro top-level union types (#2762))
>>>>>>> fe3de10f11 (GEOMESA-3061 Converters - support bytes in Avro top-level union types (#2762))
=======
>>>>>>> 98c12ce706 (GEOMESA-3061 Converters - support bytes in Avro top-level union types (#2762))
=======
>>>>>>> dcc9d7f708 (GEOMESA-3176 Docs - fix download links in install instructions)
<<<<<<< HEAD
<<<<<<< HEAD
>>>>>>> locatelli-main
=======
>>>>>>> locatelli-main
=======
>>>>>>> locatelli-main
>>>>>>> 90ec70f55 (GEOMESA-3176 Docs - fix download links in install instructions)
<<<<<<< HEAD
>>>>>>> 8cbe155de (GEOMESA-3176 Docs - fix download links in install instructions)
<<<<<<< HEAD
>>>>>>> 8150bc0e65 (GEOMESA-3176 Docs - fix download links in install instructions)
<<<<<<< HEAD
<<<<<<< HEAD
<<<<<<< HEAD
<<<<<<< HEAD
<<<<<<< HEAD
=======
<<<<<<< HEAD
>>>>>>> 256a642cc1 (GEOMESA-3176 Docs - fix download links in install instructions)
=======
>>>>>>> location-main
=======
>>>>>>> 256a642cc1 (GEOMESA-3176 Docs - fix download links in install instructions)
=======
>>>>>>> locationtech-main
=======
>>>>>>> 256a642cc1 (GEOMESA-3176 Docs - fix download links in install instructions)
=======
>>>>>>> locatelli-main
=======
>>>>>>> 256a642cc1 (GEOMESA-3176 Docs - fix download links in install instructions)
=======
>>>>>>> locatelli-main
=======
>>>>>>> 256a642cc1 (GEOMESA-3176 Docs - fix download links in install instructions)
=======
>>>>>>> locatelli-main
=======
=======
=======
>>>>>>> 6eb31fb65 (GEOMESA-3061 Converters - support bytes in Avro top-level union types (#2762))
<<<<<<< HEAD
<<<<<<< HEAD
<<<<<<< HEAD
>>>>>>> 5f428db97 (GEOMESA-3061 Converters - support bytes in Avro top-level union types (#2762))
<<<<<<< HEAD
>>>>>>> 6a2cd10c1c (GEOMESA-3061 Converters - support bytes in Avro top-level union types (#2762))
<<<<<<< HEAD
<<<<<<< HEAD
<<<<<<< HEAD
<<<<<<< HEAD
<<<<<<< HEAD
=======
<<<<<<< HEAD
>>>>>>> aceaf3bd81 (GEOMESA-3061 Converters - support bytes in Avro top-level union types (#2762))
=======
>>>>>>> location-main
=======
>>>>>>> aceaf3bd81 (GEOMESA-3061 Converters - support bytes in Avro top-level union types (#2762))
=======
>>>>>>> locationtech-main
=======
>>>>>>> aceaf3bd81 (GEOMESA-3061 Converters - support bytes in Avro top-level union types (#2762))
=======
>>>>>>> locatelli-main
=======
>>>>>>> aceaf3bd81 (GEOMESA-3061 Converters - support bytes in Avro top-level union types (#2762))
=======
>>>>>>> locatelli-main
=======
>>>>>>> aceaf3bd81 (GEOMESA-3061 Converters - support bytes in Avro top-level union types (#2762))
=======
>>>>>>> locatelli-main
=======
=======
=======
>>>>>>> 72bafaf54 (GEOMESA-3061 Converters - support bytes in Avro top-level union types (#2762))
=======
>>>>>>> 0833709340 (GEOMESA-3061 Converters - support bytes in Avro top-level union types (#2762))
=======
=======

>>>>>>> b9bdd406e (GEOMESA-3061 Converters - support bytes in Avro top-level union types (#2762))
>>>>>>> 0e68e9f4c (GEOMESA-3061 Converters - support bytes in Avro top-level union types (#2762))
<<<<<<< HEAD
<<<<<<< HEAD
<<<<<<< HEAD
>>>>>>> 76618c8da (GEOMESA-3061 Converters - support bytes in Avro top-level union types (#2762))
<<<<<<< HEAD
>>>>>>> 947761ec9b (GEOMESA-3061 Converters - support bytes in Avro top-level union types (#2762))
<<<<<<< HEAD
<<<<<<< HEAD
<<<<<<< HEAD
<<<<<<< HEAD
<<<<<<< HEAD
=======
<<<<<<< HEAD
>>>>>>> 0086b292ba (GEOMESA-3061 Converters - support bytes in Avro top-level union types (#2762))
=======
>>>>>>> location-main
=======
>>>>>>> 0086b292ba (GEOMESA-3061 Converters - support bytes in Avro top-level union types (#2762))
=======
>>>>>>> locationtech-main
=======
>>>>>>> 0086b292ba (GEOMESA-3061 Converters - support bytes in Avro top-level union types (#2762))
=======
>>>>>>> locatelli-main
=======
>>>>>>> 0086b292ba (GEOMESA-3061 Converters - support bytes in Avro top-level union types (#2762))
=======
>>>>>>> locatelli-main
=======
>>>>>>> 0086b292ba (GEOMESA-3061 Converters - support bytes in Avro top-level union types (#2762))
=======
>>>>>>> locatelli-main
=======
=======
=======
>>>>>>> 15e998504 (GEOMESA-3176 Docs - fix download links in install instructions)
<<<<<<< HEAD
<<<<<<< HEAD
>>>>>>> 0fbf9e83e (GEOMESA-3176 Docs - fix download links in install instructions)
<<<<<<< HEAD
>>>>>>> 4d9f87a514 (GEOMESA-3176 Docs - fix download links in install instructions)
<<<<<<< HEAD
<<<<<<< HEAD
<<<<<<< HEAD
<<<<<<< HEAD
<<<<<<< HEAD
=======
<<<<<<< HEAD
>>>>>>> 7efa8bf5c8 (GEOMESA-3176 Docs - fix download links in install instructions)
=======
>>>>>>> location-main
=======
>>>>>>> 7efa8bf5c8 (GEOMESA-3176 Docs - fix download links in install instructions)
=======
>>>>>>> locationtech-main
=======
>>>>>>> 7efa8bf5c8 (GEOMESA-3176 Docs - fix download links in install instructions)
=======
>>>>>>> locatelli-main
=======
>>>>>>> 7efa8bf5c8 (GEOMESA-3176 Docs - fix download links in install instructions)
=======
>>>>>>> locatelli-main
=======
>>>>>>> 7efa8bf5c8 (GEOMESA-3176 Docs - fix download links in install instructions)
=======
>>>>>>> locatelli-main
=======
=======
=======
>>>>>>> 07a6a5c29 (GEOMESA-3061 Converters - support bytes in Avro top-level union types (#2762))
<<<<<<< HEAD
<<<<<<< HEAD
<<<<<<< HEAD
<<<<<<< HEAD
=======
<<<<<<< HEAD
<<<<<<< HEAD
>>>>>>> locationtech-main
=======
<<<<<<< HEAD
<<<<<<< HEAD
=======
>>>>>>> 98c12ce706 (GEOMESA-3061 Converters - support bytes in Avro top-level union types (#2762))
>>>>>>> locatelli-main
=======
<<<<<<< HEAD
=======
>>>>>>> 98c12ce706 (GEOMESA-3061 Converters - support bytes in Avro top-level union types (#2762))
>>>>>>> locatelli-main
=======
>>>>>>> 98c12ce706 (GEOMESA-3061 Converters - support bytes in Avro top-level union types (#2762))
>>>>>>> locatelli-main
>>>>>>> 89bdd3013 (GEOMESA-3061 Converters - support bytes in Avro top-level union types (#2762))
<<<<<<< HEAD
>>>>>>> 8a6a96234b (GEOMESA-3061 Converters - support bytes in Avro top-level union types (#2762))
<<<<<<< HEAD
<<<<<<< HEAD
<<<<<<< HEAD
<<<<<<< HEAD
<<<<<<< HEAD
=======
<<<<<<< HEAD
>>>>>>> 93c8cf1b3a (GEOMESA-3061 Converters - support bytes in Avro top-level union types (#2762))
=======
>>>>>>> location-main
=======
>>>>>>> 93c8cf1b3a (GEOMESA-3061 Converters - support bytes in Avro top-level union types (#2762))
=======
>>>>>>> locationtech-main
=======
>>>>>>> 93c8cf1b3a (GEOMESA-3061 Converters - support bytes in Avro top-level union types (#2762))
=======
>>>>>>> locatelli-main
=======
>>>>>>> 93c8cf1b3a (GEOMESA-3061 Converters - support bytes in Avro top-level union types (#2762))
=======
>>>>>>> locatelli-main
=======
>>>>>>> 93c8cf1b3a (GEOMESA-3061 Converters - support bytes in Avro top-level union types (#2762))
=======
>>>>>>> locatelli-main
=======
=======
=======
>>>>>>> 67b361c85 (GEOMESA-3061 Converters - support bytes in Avro top-level union types (#2762))
<<<<<<< HEAD
<<<<<<< HEAD
<<<<<<< HEAD
<<<<<<< HEAD
=======
<<<<<<< HEAD
<<<<<<< HEAD
>>>>>>> locationtech-main
=======
<<<<<<< HEAD
<<<<<<< HEAD
=======
>>>>>>> dcc9d7f708 (GEOMESA-3176 Docs - fix download links in install instructions)
>>>>>>> locatelli-main
=======
<<<<<<< HEAD
=======
>>>>>>> dcc9d7f708 (GEOMESA-3176 Docs - fix download links in install instructions)
>>>>>>> locatelli-main
=======
>>>>>>> dcc9d7f708 (GEOMESA-3176 Docs - fix download links in install instructions)
>>>>>>> locatelli-main
>>>>>>> c8a325e13 (GEOMESA-3061 Converters - support bytes in Avro top-level union types (#2762))
<<<<<<< HEAD
>>>>>>> c9328eddce (GEOMESA-3061 Converters - support bytes in Avro top-level union types (#2762))
<<<<<<< HEAD
<<<<<<< HEAD
<<<<<<< HEAD
<<<<<<< HEAD
<<<<<<< HEAD
=======
<<<<<<< HEAD
>>>>>>> e15d50d7d3 (GEOMESA-3061 Converters - support bytes in Avro top-level union types (#2762))
=======
>>>>>>> location-main
=======
>>>>>>> e15d50d7d3 (GEOMESA-3061 Converters - support bytes in Avro top-level union types (#2762))
=======
>>>>>>> locationtech-main
=======
>>>>>>> e15d50d7d3 (GEOMESA-3061 Converters - support bytes in Avro top-level union types (#2762))
=======
>>>>>>> locatelli-main
=======
>>>>>>> e15d50d7d3 (GEOMESA-3061 Converters - support bytes in Avro top-level union types (#2762))
=======
>>>>>>> locatelli-main
=======
>>>>>>> e15d50d7d3 (GEOMESA-3061 Converters - support bytes in Avro top-level union types (#2762))
=======
>>>>>>> locatelli-main
=======
=======
=======
=======
>>>>>>> 90ec70f55 (GEOMESA-3176 Docs - fix download links in install instructions)
<<<<<<< HEAD
>>>>>>> 63db7d154 (GEOMESA-3176 Docs - fix download links in install instructions)
<<<<<<< HEAD
<<<<<<< HEAD
<<<<<<< HEAD
<<<<<<< HEAD
=======
<<<<<<< HEAD
<<<<<<< HEAD
>>>>>>> locationtech-main
=======
<<<<<<< HEAD
<<<<<<< HEAD
=======
>>>>>>> 8a2d92d131 (GEOMESA-3061 Converters - support bytes in Avro top-level union types (#2762))
>>>>>>> locatelli-main
=======
<<<<<<< HEAD
=======
>>>>>>> 8a2d92d131 (GEOMESA-3061 Converters - support bytes in Avro top-level union types (#2762))
>>>>>>> locatelli-main
=======
>>>>>>> 8a2d92d131 (GEOMESA-3061 Converters - support bytes in Avro top-level union types (#2762))
>>>>>>> locatelli-main
>>>>>>> f9e8439b0 (GEOMESA-3176 Docs - fix download links in install instructions)
<<<<<<< HEAD
>>>>>>> bd3233180f (GEOMESA-3176 Docs - fix download links in install instructions)
<<<<<<< HEAD
<<<<<<< HEAD
<<<<<<< HEAD
<<<<<<< HEAD
<<<<<<< HEAD
=======
<<<<<<< HEAD
>>>>>>> 94efcf84c2 (GEOMESA-3176 Docs - fix download links in install instructions)
=======
>>>>>>> location-main
=======
>>>>>>> 94efcf84c2 (GEOMESA-3176 Docs - fix download links in install instructions)
=======
>>>>>>> locationtech-main
=======
>>>>>>> 94efcf84c2 (GEOMESA-3176 Docs - fix download links in install instructions)
=======
>>>>>>> locatelli-main
=======
>>>>>>> 94efcf84c2 (GEOMESA-3176 Docs - fix download links in install instructions)
=======
>>>>>>> locatelli-main
=======
>>>>>>> 94efcf84c2 (GEOMESA-3176 Docs - fix download links in install instructions)
=======
>>>>>>> locatelli-main
=======
=======
=======
>>>>>>> 28e2bfa2d (GEOMESA-3061 Converters - support bytes in Avro top-level union types (#2762))
>>>>>>> 72bafaf54 (GEOMESA-3061 Converters - support bytes in Avro top-level union types (#2762))
<<<<<<< HEAD
<<<<<<< HEAD
<<<<<<< HEAD
<<<<<<< HEAD
<<<<<<< HEAD
>>>>>>> 0c734cda2b (GEOMESA-3061 Converters - support bytes in Avro top-level union types (#2762))
<<<<<<< HEAD
=======
<<<<<<< HEAD
>>>>>>> 8929cbff5b (GEOMESA-3061 Converters - support bytes in Avro top-level union types (#2762))
=======
>>>>>>> location-main
=======
<<<<<<< HEAD
=======
<<<<<<< HEAD
<<<<<<< HEAD
=======
>>>>>>> 72962fe615 (GEOMESA-3061 Converters - support bytes in Avro top-level union types (#2762))
>>>>>>> locatelli-main
=======
<<<<<<< HEAD
=======
>>>>>>> 72962fe615 (GEOMESA-3061 Converters - support bytes in Avro top-level union types (#2762))
>>>>>>> locatelli-main
=======
=======
>>>>>>> 72962fe615 (GEOMESA-3061 Converters - support bytes in Avro top-level union types (#2762))
>>>>>>> locatelli-main
>>>>>>> 0c734cda2b (GEOMESA-3061 Converters - support bytes in Avro top-level union types (#2762))
<<<<<<< HEAD
>>>>>>> 8929cbff5b (GEOMESA-3061 Converters - support bytes in Avro top-level union types (#2762))
=======
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
=======
>>>>>>> 97ec7d864 (GEOMESA-3061 Converters - support bytes in Avro top-level union types (#2762))
<<<<<<< HEAD
<<<<<<< HEAD
<<<<<<< HEAD
<<<<<<< HEAD
<<<<<<< HEAD
>>>>>>> d94c03a98e (GEOMESA-3061 Converters - support bytes in Avro top-level union types (#2762))
<<<<<<< HEAD
=======
<<<<<<< HEAD
>>>>>>> 8de43cccf6 (GEOMESA-3061 Converters - support bytes in Avro top-level union types (#2762))
=======
>>>>>>> location-main
=======
<<<<<<< HEAD
=======
<<<<<<< HEAD
<<<<<<< HEAD
=======
>>>>>>> 0a5b74c946 (Merge branch 'feature/postgis-fixes')
>>>>>>> locatelli-main
=======
<<<<<<< HEAD
=======
>>>>>>> 0a5b74c946 (Merge branch 'feature/postgis-fixes')
>>>>>>> locatelli-main
=======
=======
>>>>>>> 0a5b74c946 (Merge branch 'feature/postgis-fixes')
>>>>>>> locatelli-main
>>>>>>> d94c03a98e (GEOMESA-3061 Converters - support bytes in Avro top-level union types (#2762))
<<<<<<< HEAD
>>>>>>> 8de43cccf6 (GEOMESA-3061 Converters - support bytes in Avro top-level union types (#2762))
=======
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
=======
=======
>>>>>>> 3be8d2a5a (Merge branch 'feature/postgis-fixes')
>>>>>>> db8d998aa (Merge branch 'feature/postgis-fixes')
<<<<<<< HEAD
<<<<<<< HEAD
<<<<<<< HEAD
<<<<<<< HEAD
<<<<<<< HEAD
>>>>>>> cb6bda89b6 (Merge branch 'feature/postgis-fixes')
<<<<<<< HEAD
=======
<<<<<<< HEAD
>>>>>>> 26e5afc4ea (Merge branch 'feature/postgis-fixes')
=======
>>>>>>> location-main
=======
<<<<<<< HEAD
=======
<<<<<<< HEAD
<<<<<<< HEAD
=======
>>>>>>> 13656f5052 (GEOMESA-3254 Add Bloop build support)
>>>>>>> locatelli-main
=======
<<<<<<< HEAD
=======
>>>>>>> 13656f5052 (GEOMESA-3254 Add Bloop build support)
>>>>>>> locatelli-main
=======
=======
>>>>>>> 13656f5052 (GEOMESA-3254 Add Bloop build support)
>>>>>>> locatelli-main
>>>>>>> cb6bda89b6 (Merge branch 'feature/postgis-fixes')
<<<<<<< HEAD
>>>>>>> 26e5afc4ea (Merge branch 'feature/postgis-fixes')
=======
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
=======
>>>>>>> d845d7c1b (GEOMESA-3254 Add Bloop build support)
<<<<<<< HEAD
<<<<<<< HEAD
<<<<<<< HEAD
<<<<<<< HEAD
<<<<<<< HEAD
>>>>>>> 09d87762c5 (GEOMESA-3254 Add Bloop build support)
<<<<<<< HEAD
=======
<<<<<<< HEAD
>>>>>>> 63a045a753 (GEOMESA-3254 Add Bloop build support)
=======
>>>>>>> location-main
=======
<<<<<<< HEAD
=======
<<<<<<< HEAD
<<<<<<< HEAD
=======
>>>>>>> f7b6b53d97 (GEOMESA-3061 Converters - support bytes in Avro top-level union types (#2762))
>>>>>>> locatelli-main
=======
<<<<<<< HEAD
=======
>>>>>>> f7b6b53d97 (GEOMESA-3061 Converters - support bytes in Avro top-level union types (#2762))
>>>>>>> locatelli-main
=======
=======
>>>>>>> f7b6b53d97 (GEOMESA-3061 Converters - support bytes in Avro top-level union types (#2762))
>>>>>>> locatelli-main
>>>>>>> 09d87762c5 (GEOMESA-3254 Add Bloop build support)
<<<<<<< HEAD
>>>>>>> 63a045a753 (GEOMESA-3254 Add Bloop build support)
=======
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
=======
=======

>>>>>>> b9bdd406e (GEOMESA-3061 Converters - support bytes in Avro top-level union types (#2762))
>>>>>>> 6d9a5b626 (GEOMESA-3061 Converters - support bytes in Avro top-level union types (#2762))
<<<<<<< HEAD
<<<<<<< HEAD
<<<<<<< HEAD
<<<<<<< HEAD
<<<<<<< HEAD
>>>>>>> 67e4c1354f (GEOMESA-3061 Converters - support bytes in Avro top-level union types (#2762))
<<<<<<< HEAD
=======
<<<<<<< HEAD
>>>>>>> 12e3a588fc (GEOMESA-3061 Converters - support bytes in Avro top-level union types (#2762))
=======
>>>>>>> location-main
=======
<<<<<<< HEAD
=======
<<<<<<< HEAD
<<<<<<< HEAD
=======
>>>>>>> c04d2a7e80 (GEOMESA-3176 Docs - fix download links in install instructions)
>>>>>>> locatelli-main
=======
<<<<<<< HEAD
=======
>>>>>>> c04d2a7e80 (GEOMESA-3176 Docs - fix download links in install instructions)
>>>>>>> locatelli-main
=======
=======
>>>>>>> c04d2a7e80 (GEOMESA-3176 Docs - fix download links in install instructions)
>>>>>>> locatelli-main
>>>>>>> 67e4c1354f (GEOMESA-3061 Converters - support bytes in Avro top-level union types (#2762))
<<<<<<< HEAD
>>>>>>> 12e3a588fc (GEOMESA-3061 Converters - support bytes in Avro top-level union types (#2762))
=======
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
=======
=======
>>>>>>> 947a867d1 (GEOMESA-3061 Converters - support bytes in Avro top-level union types (#2762))
=======
<<<<<<< HEAD
<<<<<<< HEAD
<<<<<<< HEAD
<<<<<<< HEAD
>>>>>>> 6eb31fb65 (GEOMESA-3061 Converters - support bytes in Avro top-level union types (#2762))
=======
<<<<<<< HEAD
=======
<<<<<<< HEAD
<<<<<<< HEAD
>>>>>>> 6eb31fb65 (GEOMESA-3061 Converters - support bytes in Avro top-level union types (#2762))
=======
=======
<<<<<<< HEAD
=======
>>>>>>> locatelli-main
<<<<<<< HEAD
=======
>>>>>>> locatelli-main
<<<<<<< HEAD
<<<<<<< HEAD
<<<<<<< HEAD
=======
>>>>>>> 7c052f66eb (GEOMESA-3061 Converters - support bytes in Avro top-level union types (#2762))
=======
>>>>>>> 411f3fc089 (GEOMESA-3061 Converters - support bytes in Avro top-level union types (#2762))
>>>>>>> 6eb31fb65 (GEOMESA-3061 Converters - support bytes in Avro top-level union types (#2762))
=======
<<<<<<< HEAD
<<<<<<< HEAD
<<<<<<< HEAD
<<<<<<< HEAD
<<<<<<< HEAD
<<<<<<< HEAD
>>>>>>> locatelli-main
=======
>>>>>>> locatelli-main
<<<<<<< HEAD
=======
>>>>>>> locatelli-main
<<<<<<< HEAD
<<<<<<< HEAD
=======
>>>>>>> a85aff60b3 (GEOMESA-3061 Converters - support bytes in Avro top-level union types (#2762))
<<<<<<< HEAD
<<<<<<< HEAD
<<<<<<< HEAD
>>>>>>> locationtech-main
=======
=======
>>>>>>> locatelli-main
=======
>>>>>>> locatelli-main
=======
>>>>>>> f958055259 (GEOMESA-3061 Converters - support bytes in Avro top-level union types (#2762))
=======
>>>>>>> 72c7cd55e5 (GEOMESA-3176 Docs - fix download links in install instructions)
=======
=======
>>>>>>> a85aff60b3 (GEOMESA-3061 Converters - support bytes in Avro top-level union types (#2762))
>>>>>>> 8171686fd2 (GEOMESA-3061 Converters - support bytes in Avro top-level union types (#2762))
<<<<<<< HEAD
<<<<<<< HEAD
>>>>>>> locatelli-main
=======
>>>>>>> locatelli-main
=======
>>>>>>> locatelli-main
>>>>>>> 15e998504 (GEOMESA-3176 Docs - fix download links in install instructions)
=======
>>>>>>> 07a6a5c29 (GEOMESA-3061 Converters - support bytes in Avro top-level union types (#2762))
=======
>>>>>>> 67b361c85 (GEOMESA-3061 Converters - support bytes in Avro top-level union types (#2762))
=======
<<<<<<< HEAD
<<<<<<< HEAD
<<<<<<< HEAD
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
>>>>>>> 3e34d2451e (GEOMESA-3176 Docs - fix download links in install instructions)
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
>>>>>>> 3e34d2451e (GEOMESA-3176 Docs - fix download links in install instructions)
<<<<<<< HEAD
>>>>>>> locatelli-main
=======
>>>>>>> locatelli-main
=======
>>>>>>> 5603dc69a0 (GEOMESA-3176 Docs - fix download links in install instructions)
=======
>>>>>>> acc6bdccf3 (GEOMESA-3061 Converters - support bytes in Avro top-level union types (#2762))
=======
=======
>>>>>>> 3e34d2451e (GEOMESA-3176 Docs - fix download links in install instructions)
>>>>>>> d025f79392 (GEOMESA-3176 Docs - fix download links in install instructions)
<<<<<<< HEAD
<<<<<<< HEAD
>>>>>>> locatelli-main
=======
>>>>>>> locatelli-main
=======
>>>>>>> locatelli-main
=======
>>>>>>> 90ec70f55 (GEOMESA-3176 Docs - fix download links in install instructions)
>>>>>>> 63db7d154 (GEOMESA-3176 Docs - fix download links in install instructions)
=======
<<<<<<< HEAD
<<<<<<< HEAD
<<<<<<< HEAD
<<<<<<< HEAD
<<<<<<< HEAD
=======
>>>>>>> 28e2bfa2d (GEOMESA-3061 Converters - support bytes in Avro top-level union types (#2762))
=======
<<<<<<< HEAD
=======
>>>>>>> 28e2bfa2d (GEOMESA-3061 Converters - support bytes in Avro top-level union types (#2762))
<<<<<<< HEAD
>>>>>>> location-main
=======
=======
=======
>>>>>>> locatelli-main
=======
>>>>>>> locatelli-main
<<<<<<< HEAD
<<<<<<< HEAD
<<<<<<< HEAD
<<<<<<< HEAD
<<<<<<< HEAD
<<<<<<< HEAD
<<<<<<< HEAD
>>>>>>> locatelli-main
<<<<<<< HEAD
=======
>>>>>>> locatelli-main
<<<<<<< HEAD
<<<<<<< HEAD
=======
>>>>>>> 17f16286aa (GEOMESA-3061 Converters - support bytes in Avro top-level union types (#2762))
=======
<<<<<<< HEAD
<<<<<<< HEAD
>>>>>>> 28e2bfa2d (GEOMESA-3061 Converters - support bytes in Avro top-level union types (#2762))
<<<<<<< HEAD
<<<<<<< HEAD
=======
=======
>>>>>>> locatelli-main
=======
=======
>>>>>>> 17f16286aa (GEOMESA-3061 Converters - support bytes in Avro top-level union types (#2762))
=======
>>>>>>> locatelli-main
>>>>>>> f91e29a57f (GEOMESA-3061 Converters - support bytes in Avro top-level union types (#2762))
=======
>>>>>>> d025f79392 (GEOMESA-3176 Docs - fix download links in install instructions)
=======
>>>>>>> 8171686fd2 (GEOMESA-3061 Converters - support bytes in Avro top-level union types (#2762))
=======
=======
>>>>>>> 17f16286aa (GEOMESA-3061 Converters - support bytes in Avro top-level union types (#2762))
>>>>>>> 8435590eee (GEOMESA-3061 Converters - support bytes in Avro top-level union types (#2762))
=======
>>>>>>> 28e2bfa2d (GEOMESA-3061 Converters - support bytes in Avro top-level union types (#2762))
<<<<<<< HEAD
<<<<<<< HEAD
<<<<<<< HEAD
<<<<<<< HEAD
<<<<<<< HEAD
=======
>>>>>>> 7fa3b8d23f (GEOMESA-3061 Converters - support bytes in Avro top-level union types (#2762))
<<<<<<< HEAD
<<<<<<< HEAD
>>>>>>> locatelli-main
=======
>>>>>>> locatelli-main
=======
>>>>>>> locatelli-main
=======
>>>>>>> a35efac12e (GEOMESA-3061 Converters - support bytes in Avro top-level union types (#2762))
=======
>>>>>>> 3e34d2451e (GEOMESA-3176 Docs - fix download links in install instructions)
<<<<<<< HEAD
<<<<<<< HEAD
=======
<<<<<<< HEAD
<<<<<<< HEAD
<<<<<<< HEAD
=======
>>>>>>> 8171686fd2 (GEOMESA-3061 Converters - support bytes in Avro top-level union types (#2762))
>>>>>>> locatelli-main
=======
<<<<<<< HEAD
=======
>>>>>>> 8171686fd2 (GEOMESA-3061 Converters - support bytes in Avro top-level union types (#2762))
>>>>>>> locatelli-main
=======
>>>>>>> 8171686fd2 (GEOMESA-3061 Converters - support bytes in Avro top-level union types (#2762))
>>>>>>> locatelli-main
=======
=======
>>>>>>> 28e2bfa2d (GEOMESA-3061 Converters - support bytes in Avro top-level union types (#2762))
>>>>>>> a85aff60b3 (GEOMESA-3061 Converters - support bytes in Avro top-level union types (#2762))
<<<<<<< HEAD
<<<<<<< HEAD
=======
>>>>>>> 1bcc513539 (GEOMESA-3061 Converters - support bytes in Avro top-level union types (#2762))
<<<<<<< HEAD
>>>>>>> locationtech-main
=======
<<<<<<< HEAD
=======
>>>>>>> locatelli-main
<<<<<<< HEAD
=======
>>>>>>> 1bcc513539 (GEOMESA-3061 Converters - support bytes in Avro top-level union types (#2762))
=======
>>>>>>> locatelli-main
=======
>>>>>>> 6e30236dd2 (GEOMESA-3061 Converters - support bytes in Avro top-level union types (#2762))
=======
>>>>>>> 5603dc69a0 (GEOMESA-3176 Docs - fix download links in install instructions)
=======
=======
>>>>>>> 28e2bfa2d (GEOMESA-3061 Converters - support bytes in Avro top-level union types (#2762))
>>>>>>> f958055259 (GEOMESA-3061 Converters - support bytes in Avro top-level union types (#2762))
=======
>>>>>>> b08cb4d818 (GEOMESA-3061 Converters - support bytes in Avro top-level union types (#2762))
=======
=======
>>>>>>> a35efac12e (GEOMESA-3061 Converters - support bytes in Avro top-level union types (#2762))
>>>>>>> acc6bdccf3 (GEOMESA-3061 Converters - support bytes in Avro top-level union types (#2762))
=======
>>>>>>> d025f79392 (GEOMESA-3176 Docs - fix download links in install instructions)
=======
>>>>>>> 8171686fd2 (GEOMESA-3061 Converters - support bytes in Avro top-level union types (#2762))
=======
=======
>>>>>>> 1bcc513539 (GEOMESA-3061 Converters - support bytes in Avro top-level union types (#2762))
>>>>>>> 7fa3b8d23f (GEOMESA-3061 Converters - support bytes in Avro top-level union types (#2762))
<<<<<<< HEAD
<<<<<<< HEAD
>>>>>>> locatelli-main
=======
>>>>>>> locatelli-main
=======
>>>>>>> locatelli-main

>>>>>>> b9bdd406e (GEOMESA-3061 Converters - support bytes in Avro top-level union types (#2762))
=======
>>>>>>> 16b2e83f2 (GEOMESA-3176 Docs - fix download links in install instructions)
<<<<<<< HEAD
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
=======
<<<<<<< HEAD
=======
>>>>>>> locatelli-main
<<<<<<< HEAD
=======
>>>>>>> locatelli-main
<<<<<<< HEAD
<<<<<<< HEAD
<<<<<<< HEAD
=======
>>>>>>> 8171686fd2 (GEOMESA-3061 Converters - support bytes in Avro top-level union types (#2762))
<<<<<<< HEAD
<<<<<<< HEAD
>>>>>>> locatelli-main
=======
>>>>>>> locatelli-main
=======
>>>>>>> locatelli-main
=======
>>>>>>> 3e34d2451e (GEOMESA-3176 Docs - fix download links in install instructions)
=======
>>>>>>> a85aff60b3 (GEOMESA-3061 Converters - support bytes in Avro top-level union types (#2762))
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
>>>>>>> 5603dc69a0 (GEOMESA-3176 Docs - fix download links in install instructions)
=======
>>>>>>> f958055259 (GEOMESA-3061 Converters - support bytes in Avro top-level union types (#2762))
=======
=======
>>>>>>> 3e34d2451e (GEOMESA-3176 Docs - fix download links in install instructions)
>>>>>>> d025f79392 (GEOMESA-3176 Docs - fix download links in install instructions)
=======
>>>>>>> 8171686fd2 (GEOMESA-3061 Converters - support bytes in Avro top-level union types (#2762))
<<<<<<< HEAD
<<<<<<< HEAD
>>>>>>> locatelli-main
=======
>>>>>>> locatelli-main
=======
>>>>>>> locatelli-main
>>>>>>> 10ade3dcd (GEOMESA-3176 Docs - fix download links in install instructions)
<<<<<<< HEAD
>>>>>>> 703374130f (GEOMESA-3176 Docs - fix download links in install instructions)
<<<<<<< HEAD
<<<<<<< HEAD
<<<<<<< HEAD
<<<<<<< HEAD
<<<<<<< HEAD
=======
<<<<<<< HEAD
>>>>>>> 93fa8c797f (GEOMESA-3176 Docs - fix download links in install instructions)
=======
>>>>>>> location-main
=======
>>>>>>> 93fa8c797f (GEOMESA-3176 Docs - fix download links in install instructions)
=======
>>>>>>> locationtech-main
=======
>>>>>>> 93fa8c797f (GEOMESA-3176 Docs - fix download links in install instructions)
=======
>>>>>>> locatelli-main
=======
>>>>>>> 93fa8c797f (GEOMESA-3176 Docs - fix download links in install instructions)
=======
>>>>>>> locatelli-main
=======
>>>>>>> 93fa8c797f (GEOMESA-3176 Docs - fix download links in install instructions)
=======
>>>>>>> locatelli-main
=======
=======
=======
=======
>>>>>>> 4b70e7f8f (GEOMESA-3176 Docs - fix download links in install instructions)
=======
>>>>>>> 85663f71c (GEOMESA-3061 Converters - support bytes in Avro top-level union types (#2762))
=======
>>>>>>> a12ea194c (GEOMESA-3176 Docs - fix download links in install instructions)
=======
>>>>>>> d4c5768cf (GEOMESA-3061 Converters - support bytes in Avro top-level union types (#2762))
<<<<<<< HEAD
=======
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
>>>>>>> d4c5768cf (GEOMESA-3061 Converters - support bytes in Avro top-level union types (#2762))
=======
>>>>>>> 3e34d2451e (GEOMESA-3176 Docs - fix download links in install instructions)
<<<<<<< HEAD
=======
<<<<<<< HEAD
<<<<<<< HEAD
<<<<<<< HEAD
>>>>>>> locationtech-main
=======
=======
>>>>>>> locatelli-main
=======
>>>>>>> locatelli-main
>>>>>>> d4c5768cf (GEOMESA-3061 Converters - support bytes in Avro top-level union types (#2762))
<<<<<<< HEAD
=======
>>>>>>> d4c5768cf (GEOMESA-3061 Converters - support bytes in Avro top-level union types (#2762))
=======
>>>>>>> 3e34d2451e (GEOMESA-3176 Docs - fix download links in install instructions)
=======
>>>>>>> 5603dc69a0 (GEOMESA-3176 Docs - fix download links in install instructions)
<<<<<<< HEAD
=======
<<<<<<< HEAD
<<<<<<< HEAD
>>>>>>> locatelli-main
=======
>>>>>>> locatelli-main
=======
>>>>>>> locatelli-main
>>>>>>> 6eb31fb65 (GEOMESA-3061 Converters - support bytes in Avro top-level union types (#2762))
>>>>>>> 23c024179 (GEOMESA-3061 Converters - support bytes in Avro top-level union types (#2762))
=======
>>>>>>> 07a6a5c29 (GEOMESA-3061 Converters - support bytes in Avro top-level union types (#2762))
=======
>>>>>>> 63db7d154 (GEOMESA-3176 Docs - fix download links in install instructions)
=======
<<<<<<< HEAD
<<<<<<< HEAD
<<<<<<< HEAD
=======
<<<<<<< HEAD
<<<<<<< HEAD
>>>>>>> locationtech-main
=======
<<<<<<< HEAD
=======
>>>>>>> locatelli-main
<<<<<<< HEAD
=======
=======
>>>>>>> locatelli-main
>>>>>>> 6eb31fb65 (GEOMESA-3061 Converters - support bytes in Avro top-level union types (#2762))
>>>>>>> 28e2bfa2d (GEOMESA-3061 Converters - support bytes in Avro top-level union types (#2762))
=======
>>>>>>> a788dfac03 (GEOMESA-3061 Converters - support bytes in Avro top-level union types (#2762))
=======
=======
>>>>>>> 3e34d2451e (GEOMESA-3176 Docs - fix download links in install instructions)
=======
>>>>>>> 6eb31fb65 (GEOMESA-3061 Converters - support bytes in Avro top-level union types (#2762))
>>>>>>> 28e2bfa2d (GEOMESA-3061 Converters - support bytes in Avro top-level union types (#2762))
=======
>>>>>>> a788dfac03 (GEOMESA-3061 Converters - support bytes in Avro top-level union types (#2762))
=======
=======
>>>>>>> 5603dc69a0 (GEOMESA-3176 Docs - fix download links in install instructions)
=======
>>>>>>> d025f79392 (GEOMESA-3176 Docs - fix download links in install instructions)
<<<<<<< HEAD
<<<<<<< HEAD
>>>>>>> locatelli-main
=======
>>>>>>> locatelli-main
=======
>>>>>>> locatelli-main
=======
>>>>>>> 6eb31fb65 (GEOMESA-3061 Converters - support bytes in Avro top-level union types (#2762))
>>>>>>> 28e2bfa2d (GEOMESA-3061 Converters - support bytes in Avro top-level union types (#2762))
=======
<<<<<<< HEAD
<<<<<<< HEAD
<<<<<<< HEAD
<<<<<<< HEAD
<<<<<<< HEAD
=======

>>>>>>> b9bdd406e (GEOMESA-3061 Converters - support bytes in Avro top-level union types (#2762))
=======
=======
>>>>>>> locatelli-main
=======
>>>>>>> locatelli-main
=======
>>>>>>> locatelli-main
>>>>>>> a788dfac03 (GEOMESA-3061 Converters - support bytes in Avro top-level union types (#2762))
=======
=======
>>>>>>> 3e34d2451e (GEOMESA-3176 Docs - fix download links in install instructions)
=======
>>>>>>> 6eb31fb65 (GEOMESA-3061 Converters - support bytes in Avro top-level union types (#2762))
>>>>>>> 28e2bfa2d (GEOMESA-3061 Converters - support bytes in Avro top-level union types (#2762))
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
>>>>>>> a788dfac03 (GEOMESA-3061 Converters - support bytes in Avro top-level union types (#2762))
=======
=======

>>>>>>> b9bdd406e (GEOMESA-3061 Converters - support bytes in Avro top-level union types (#2762))
<<<<<<< HEAD
<<<<<<< HEAD
<<<<<<< HEAD
<<<<<<< HEAD
<<<<<<< HEAD
>>>>>>> location-main
=======
>>>>>>> locationtech-main
=======
>>>>>>> locatelli-main
=======
>>>>>>> locatelli-main
=======
>>>>>>> locatelli-main
>>>>>>> f71fa3c0e (GEOMESA-3061 Converters - support bytes in Avro top-level union types (#2762))
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
=======
<<<<<<< HEAD
=======
>>>>>>> locatelli-main
<<<<<<< HEAD
=======
>>>>>>> locatelli-main
<<<<<<< HEAD
<<<<<<< HEAD
<<<<<<< HEAD
=======
>>>>>>> 8171686fd2 (GEOMESA-3061 Converters - support bytes in Avro top-level union types (#2762))
<<<<<<< HEAD
<<<<<<< HEAD
>>>>>>> locatelli-main
=======
>>>>>>> locatelli-main
=======
>>>>>>> locatelli-main
=======
>>>>>>> a35efac12e (GEOMESA-3061 Converters - support bytes in Avro top-level union types (#2762))
=======
>>>>>>> a85aff60b3 (GEOMESA-3061 Converters - support bytes in Avro top-level union types (#2762))
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
>>>>>>> 6e30236dd2 (GEOMESA-3061 Converters - support bytes in Avro top-level union types (#2762))
=======
>>>>>>> f958055259 (GEOMESA-3061 Converters - support bytes in Avro top-level union types (#2762))
=======
=======
>>>>>>> a35efac12e (GEOMESA-3061 Converters - support bytes in Avro top-level union types (#2762))
>>>>>>> acc6bdccf3 (GEOMESA-3061 Converters - support bytes in Avro top-level union types (#2762))
=======
>>>>>>> 8171686fd2 (GEOMESA-3061 Converters - support bytes in Avro top-level union types (#2762))
<<<<<<< HEAD
<<<<<<< HEAD
>>>>>>> locatelli-main
=======
>>>>>>> locatelli-main
=======
>>>>>>> locatelli-main
>>>>>>> 947a867d1 (GEOMESA-3061 Converters - support bytes in Avro top-level union types (#2762))
<<<<<<< HEAD
>>>>>>> 748532d2db (GEOMESA-3061 Converters - support bytes in Avro top-level union types (#2762))
<<<<<<< HEAD
<<<<<<< HEAD
<<<<<<< HEAD
<<<<<<< HEAD
<<<<<<< HEAD
=======
<<<<<<< HEAD
>>>>>>> c82dea9d29 (GEOMESA-3061 Converters - support bytes in Avro top-level union types (#2762))
=======
>>>>>>> location-main
=======
>>>>>>> c82dea9d29 (GEOMESA-3061 Converters - support bytes in Avro top-level union types (#2762))
=======
>>>>>>> locationtech-main
=======
>>>>>>> c82dea9d29 (GEOMESA-3061 Converters - support bytes in Avro top-level union types (#2762))
=======
>>>>>>> locatelli-main
=======
>>>>>>> c82dea9d29 (GEOMESA-3061 Converters - support bytes in Avro top-level union types (#2762))
=======
>>>>>>> locatelli-main
=======
>>>>>>> c82dea9d29 (GEOMESA-3061 Converters - support bytes in Avro top-level union types (#2762))
=======
>>>>>>> locatelli-main
=======
=======
=======
>>>>>>> d4c5768cf (GEOMESA-3061 Converters - support bytes in Avro top-level union types (#2762))
<<<<<<< HEAD
<<<<<<< HEAD
<<<<<<< HEAD
<<<<<<< HEAD
=======
<<<<<<< HEAD
=======
<<<<<<< HEAD
=======
>>>>>>> locatelli-main
<<<<<<< HEAD
=======
=======
>>>>>>> locatelli-main
>>>>>>> 67b361c85 (GEOMESA-3061 Converters - support bytes in Avro top-level union types (#2762))
>>>>>>> ad3cedc4d (GEOMESA-3061 Converters - support bytes in Avro top-level union types (#2762))
=======
<<<<<<< HEAD
=======
>>>>>>> a85aff60b3 (GEOMESA-3061 Converters - support bytes in Avro top-level union types (#2762))
<<<<<<< HEAD
=======
>>>>>>> 67b361c85 (GEOMESA-3061 Converters - support bytes in Avro top-level union types (#2762))
>>>>>>> ad3cedc4d (GEOMESA-3061 Converters - support bytes in Avro top-level union types (#2762))
=======
<<<<<<< HEAD
=======
>>>>>>> f958055259 (GEOMESA-3061 Converters - support bytes in Avro top-level union types (#2762))
<<<<<<< HEAD
=======
>>>>>>> 67b361c85 (GEOMESA-3061 Converters - support bytes in Avro top-level union types (#2762))
>>>>>>> ad3cedc4d (GEOMESA-3061 Converters - support bytes in Avro top-level union types (#2762))
=======
<<<<<<< HEAD
=======
>>>>>>> 8171686fd2 (GEOMESA-3061 Converters - support bytes in Avro top-level union types (#2762))
<<<<<<< HEAD
<<<<<<< HEAD
>>>>>>> locatelli-main
=======
>>>>>>> locatelli-main
<<<<<<< HEAD
=======
>>>>>>> locatelli-main
=======
>>>>>>> 67b361c85 (GEOMESA-3061 Converters - support bytes in Avro top-level union types (#2762))
>>>>>>> ad3cedc4d (GEOMESA-3061 Converters - support bytes in Avro top-level union types (#2762))
=======
<<<<<<< HEAD
=======
>>>>>>> a85aff60b3 (GEOMESA-3061 Converters - support bytes in Avro top-level union types (#2762))
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
>>>>>>> 67b361c85 (GEOMESA-3061 Converters - support bytes in Avro top-level union types (#2762))
>>>>>>> ad3cedc4d (GEOMESA-3061 Converters - support bytes in Avro top-level union types (#2762))
=======
<<<<<<< HEAD
<<<<<<< HEAD
>>>>>>> 85663f71c (GEOMESA-3061 Converters - support bytes in Avro top-level union types (#2762))
=======
<<<<<<< HEAD
>>>>>>> 23c024179 (GEOMESA-3061 Converters - support bytes in Avro top-level union types (#2762))
=======
>>>>>>> e6e1f4bdd (GEOMESA-3061 Converters - support bytes in Avro top-level union types (#2762))
<<<<<<< HEAD
>>>>>>> 8035cc5893 (GEOMESA-3061 Converters - support bytes in Avro top-level union types (#2762))
<<<<<<< HEAD
<<<<<<< HEAD
<<<<<<< HEAD
<<<<<<< HEAD
<<<<<<< HEAD
=======
<<<<<<< HEAD
>>>>>>> 1890b11217 (GEOMESA-3061 Converters - support bytes in Avro top-level union types (#2762))
=======
>>>>>>> location-main
=======
>>>>>>> 1890b11217 (GEOMESA-3061 Converters - support bytes in Avro top-level union types (#2762))
=======
>>>>>>> locationtech-main
=======
=======
<<<<<<< HEAD
=======
<<<<<<< HEAD
=======
=======
=======
>>>>>>> locatelli-main
=======
>>>>>>> locatelli-main
>>>>>>> 1890b11217 (GEOMESA-3061 Converters - support bytes in Avro top-level union types (#2762))
=======
=======
=======
<<<<<<< HEAD
<<<<<<< HEAD
=======
=======
<<<<<<< HEAD
<<<<<<< HEAD
>>>>>>> locatelli-main
=======
>>>>>>> locatelli-main
<<<<<<< HEAD
<<<<<<< HEAD
=======
>>>>>>> a85aff60b3 (GEOMESA-3061 Converters - support bytes in Avro top-level union types (#2762))
<<<<<<< HEAD
<<<<<<< HEAD
>>>>>>> locationtech-main
=======
>>>>>>> locatelli-main
=======
>>>>>>> locatelli-main
=======
<<<<<<< HEAD
=======
>>>>>>> a85aff60b3 (GEOMESA-3061 Converters - support bytes in Avro top-level union types (#2762))
>>>>>>> locatelli-main
>>>>>>> 28e2bfa2d (GEOMESA-3061 Converters - support bytes in Avro top-level union types (#2762))
=======
>>>>>>> d4c5768cf (GEOMESA-3061 Converters - support bytes in Avro top-level union types (#2762))
=======
<<<<<<< HEAD
=======
<<<<<<< HEAD
<<<<<<< HEAD
<<<<<<< HEAD
<<<<<<< HEAD
=======
>>>>>>> a35efac12e (GEOMESA-3061 Converters - support bytes in Avro top-level union types (#2762))
=======
>>>>>>> a85aff60b3 (GEOMESA-3061 Converters - support bytes in Avro top-level union types (#2762))
>>>>>>> locationtech-main
=======
>>>>>>> a35efac12e (GEOMESA-3061 Converters - support bytes in Avro top-level union types (#2762))
=======
>>>>>>> a85aff60b3 (GEOMESA-3061 Converters - support bytes in Avro top-level union types (#2762))
>>>>>>> locatelli-main
=======
>>>>>>> a35efac12e (GEOMESA-3061 Converters - support bytes in Avro top-level union types (#2762))
=======
>>>>>>> a85aff60b3 (GEOMESA-3061 Converters - support bytes in Avro top-level union types (#2762))
>>>>>>> locatelli-main
=======
>>>>>>> a35efac12e (GEOMESA-3061 Converters - support bytes in Avro top-level union types (#2762))
=======
>>>>>>> a85aff60b3 (GEOMESA-3061 Converters - support bytes in Avro top-level union types (#2762))
>>>>>>> locatelli-main

>>>>>>> b9bdd406e (GEOMESA-3061 Converters - support bytes in Avro top-level union types (#2762))
>>>>>>> cdb410251 (GEOMESA-3061 Converters - support bytes in Avro top-level union types (#2762))
<<<<<<< HEAD
<<<<<<< HEAD
<<<<<<< HEAD
<<<<<<< HEAD
=======
<<<<<<< HEAD
<<<<<<< HEAD
=======
<<<<<<< HEAD
=======
=======
>>>>>>> locatelli-main
=======
>>>>>>> locatelli-main
>>>>>>> 3e34d2451e (GEOMESA-3176 Docs - fix download links in install instructions)
>>>>>>> ad3cedc4d (GEOMESA-3061 Converters - support bytes in Avro top-level union types (#2762))
>>>>>>> 6e30236dd2 (GEOMESA-3061 Converters - support bytes in Avro top-level union types (#2762))
=======
<<<<<<< HEAD
<<<<<<< HEAD
<<<<<<< HEAD
=======
>>>>>>> a85aff60b3 (GEOMESA-3061 Converters - support bytes in Avro top-level union types (#2762))
>>>>>>> 28e2bfa2d (GEOMESA-3061 Converters - support bytes in Avro top-level union types (#2762))
=======
>>>>>>> d4c5768cf (GEOMESA-3061 Converters - support bytes in Avro top-level union types (#2762))
=======
<<<<<<< HEAD
=======
>>>>>>> a35efac12e (GEOMESA-3061 Converters - support bytes in Avro top-level union types (#2762))
=======
>>>>>>> a85aff60b3 (GEOMESA-3061 Converters - support bytes in Avro top-level union types (#2762))

>>>>>>> b9bdd406e (GEOMESA-3061 Converters - support bytes in Avro top-level union types (#2762))
>>>>>>> cdb410251 (GEOMESA-3061 Converters - support bytes in Avro top-level union types (#2762))
<<<<<<< HEAD
<<<<<<< HEAD
<<<<<<< HEAD
<<<<<<< HEAD
>>>>>>> locatelli-main
=======
>>>>>>> locatelli-main
<<<<<<< HEAD
<<<<<<< HEAD
=======
>>>>>>> 3e34d2451e (GEOMESA-3176 Docs - fix download links in install instructions)
<<<<<<< HEAD
<<<<<<< HEAD
>>>>>>> locationtech-main
=======
>>>>>>> locatelli-main
=======
>>>>>>> locatelli-main
=======
<<<<<<< HEAD
=======
>>>>>>> 3e34d2451e (GEOMESA-3176 Docs - fix download links in install instructions)
>>>>>>> locatelli-main
>>>>>>> ad3cedc4d (GEOMESA-3061 Converters - support bytes in Avro top-level union types (#2762))
=======
<<<<<<< HEAD
>>>>>>> a12ea194c (GEOMESA-3176 Docs - fix download links in install instructions)
=======
<<<<<<< HEAD
<<<<<<< HEAD
<<<<<<< HEAD
=======
<<<<<<< HEAD
<<<<<<< HEAD
=======
<<<<<<< HEAD
<<<<<<< HEAD
=======
>>>>>>> d025f79392 (GEOMESA-3176 Docs - fix download links in install instructions)
>>>>>>> locatelli-main
=======
<<<<<<< HEAD
=======
>>>>>>> d025f79392 (GEOMESA-3176 Docs - fix download links in install instructions)
>>>>>>> locatelli-main
=======
>>>>>>> d025f79392 (GEOMESA-3176 Docs - fix download links in install instructions)
>>>>>>> locatelli-main
>>>>>>> ad3cedc4d (GEOMESA-3061 Converters - support bytes in Avro top-level union types (#2762))
>>>>>>> a35efac12e (GEOMESA-3061 Converters - support bytes in Avro top-level union types (#2762))
=======
=======
>>>>>>> 3e34d2451e (GEOMESA-3176 Docs - fix download links in install instructions)
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
>>>>>>> a12ea194c (GEOMESA-3176 Docs - fix download links in install instructions)
=======
>>>>>>> 5603dc69a0 (GEOMESA-3176 Docs - fix download links in install instructions)
=======
>>>>>>> ad3cedc4d (GEOMESA-3061 Converters - support bytes in Avro top-level union types (#2762))
>>>>>>> a35efac12e (GEOMESA-3061 Converters - support bytes in Avro top-level union types (#2762))
=======
>>>>>>> acc6bdccf3 (GEOMESA-3061 Converters - support bytes in Avro top-level union types (#2762))
=======
>>>>>>> d025f79392 (GEOMESA-3176 Docs - fix download links in install instructions)
<<<<<<< HEAD
<<<<<<< HEAD
>>>>>>> locatelli-main
=======
>>>>>>> locatelli-main
=======
>>>>>>> locatelli-main
>>>>>>> 90ec70f55 (GEOMESA-3176 Docs - fix download links in install instructions)
<<<<<<< HEAD
>>>>>>> 279de44d3 (GEOMESA-3176 Docs - fix download links in install instructions)
<<<<<<< HEAD
>>>>>>> b7c6b904be (GEOMESA-3176 Docs - fix download links in install instructions)
<<<<<<< HEAD
<<<<<<< HEAD
<<<<<<< HEAD
<<<<<<< HEAD
<<<<<<< HEAD
=======
<<<<<<< HEAD
>>>>>>> 2142d07ded (GEOMESA-3176 Docs - fix download links in install instructions)
=======
>>>>>>> location-main
=======
>>>>>>> 2142d07ded (GEOMESA-3176 Docs - fix download links in install instructions)
=======
>>>>>>> locationtech-main
=======
>>>>>>> 2142d07ded (GEOMESA-3176 Docs - fix download links in install instructions)
=======
>>>>>>> locatelli-main
=======
>>>>>>> 2142d07ded (GEOMESA-3176 Docs - fix download links in install instructions)
=======
>>>>>>> locatelli-main
=======
>>>>>>> 2142d07ded (GEOMESA-3176 Docs - fix download links in install instructions)
=======
>>>>>>> locatelli-main
=======
=======
=======
>>>>>>> 6eb31fb65 (GEOMESA-3061 Converters - support bytes in Avro top-level union types (#2762))
<<<<<<< HEAD
<<<<<<< HEAD
>>>>>>> 23c024179 (GEOMESA-3061 Converters - support bytes in Avro top-level union types (#2762))
<<<<<<< HEAD
>>>>>>> 250f01786f (GEOMESA-3061 Converters - support bytes in Avro top-level union types (#2762))
<<<<<<< HEAD
<<<<<<< HEAD
<<<<<<< HEAD
<<<<<<< HEAD
<<<<<<< HEAD
=======
<<<<<<< HEAD
>>>>>>> a398ab1183 (GEOMESA-3061 Converters - support bytes in Avro top-level union types (#2762))
=======
>>>>>>> location-main
=======
>>>>>>> a398ab1183 (GEOMESA-3061 Converters - support bytes in Avro top-level union types (#2762))
=======
>>>>>>> locationtech-main
=======
>>>>>>> a398ab1183 (GEOMESA-3061 Converters - support bytes in Avro top-level union types (#2762))
=======
>>>>>>> locatelli-main
=======
>>>>>>> a398ab1183 (GEOMESA-3061 Converters - support bytes in Avro top-level union types (#2762))
=======
>>>>>>> locatelli-main
=======
>>>>>>> a398ab1183 (GEOMESA-3061 Converters - support bytes in Avro top-level union types (#2762))
=======
>>>>>>> locatelli-main
=======
=======
=======
>>>>>>> d4c5768cf (GEOMESA-3061 Converters - support bytes in Avro top-level union types (#2762))
=======
=======

>>>>>>> b9bdd406e (GEOMESA-3061 Converters - support bytes in Avro top-level union types (#2762))
>>>>>>> 0e68e9f4c (GEOMESA-3061 Converters - support bytes in Avro top-level union types (#2762))
<<<<<<< HEAD
>>>>>>> a910ae135 (GEOMESA-3061 Converters - support bytes in Avro top-level union types (#2762))
<<<<<<< HEAD
>>>>>>> 07161eaaa6 (GEOMESA-3061 Converters - support bytes in Avro top-level union types (#2762))
<<<<<<< HEAD
<<<<<<< HEAD
<<<<<<< HEAD
<<<<<<< HEAD
<<<<<<< HEAD
=======
<<<<<<< HEAD
>>>>>>> 9c28193a91 (GEOMESA-3061 Converters - support bytes in Avro top-level union types (#2762))
=======
>>>>>>> location-main
=======
>>>>>>> 9c28193a91 (GEOMESA-3061 Converters - support bytes in Avro top-level union types (#2762))
=======
>>>>>>> locationtech-main
=======
>>>>>>> 9c28193a91 (GEOMESA-3061 Converters - support bytes in Avro top-level union types (#2762))
=======
>>>>>>> locatelli-main
=======
>>>>>>> 9c28193a91 (GEOMESA-3061 Converters - support bytes in Avro top-level union types (#2762))
=======
>>>>>>> locatelli-main
=======
>>>>>>> 9c28193a91 (GEOMESA-3061 Converters - support bytes in Avro top-level union types (#2762))
=======
>>>>>>> locatelli-main
=======
=======
=======
>>>>>>> 15e998504 (GEOMESA-3176 Docs - fix download links in install instructions)
<<<<<<< HEAD
>>>>>>> 4b70e7f8f (GEOMESA-3176 Docs - fix download links in install instructions)
<<<<<<< HEAD
>>>>>>> b42125fac1 (GEOMESA-3176 Docs - fix download links in install instructions)
<<<<<<< HEAD
<<<<<<< HEAD
<<<<<<< HEAD
<<<<<<< HEAD
<<<<<<< HEAD
=======
<<<<<<< HEAD
>>>>>>> a8d6366d72 (GEOMESA-3176 Docs - fix download links in install instructions)
=======
>>>>>>> location-main
=======
>>>>>>> a8d6366d72 (GEOMESA-3176 Docs - fix download links in install instructions)
=======
>>>>>>> locationtech-main
=======
>>>>>>> a8d6366d72 (GEOMESA-3176 Docs - fix download links in install instructions)
=======
>>>>>>> locatelli-main
=======
>>>>>>> a8d6366d72 (GEOMESA-3176 Docs - fix download links in install instructions)
=======
>>>>>>> locatelli-main
=======
>>>>>>> a8d6366d72 (GEOMESA-3176 Docs - fix download links in install instructions)
=======
>>>>>>> locatelli-main
=======
=======
=======
>>>>>>> 07a6a5c29 (GEOMESA-3061 Converters - support bytes in Avro top-level union types (#2762))
<<<<<<< HEAD
<<<<<<< HEAD
<<<<<<< HEAD
<<<<<<< HEAD
=======
<<<<<<< HEAD
<<<<<<< HEAD
>>>>>>> locationtech-main
=======
<<<<<<< HEAD
<<<<<<< HEAD
=======
>>>>>>> acc6bdccf3 (GEOMESA-3061 Converters - support bytes in Avro top-level union types (#2762))
>>>>>>> locatelli-main
=======
<<<<<<< HEAD
=======
>>>>>>> acc6bdccf3 (GEOMESA-3061 Converters - support bytes in Avro top-level union types (#2762))
>>>>>>> locatelli-main
=======
>>>>>>> acc6bdccf3 (GEOMESA-3061 Converters - support bytes in Avro top-level union types (#2762))
>>>>>>> locatelli-main
>>>>>>> 85663f71c (GEOMESA-3061 Converters - support bytes in Avro top-level union types (#2762))
<<<<<<< HEAD
>>>>>>> 813488e18c (GEOMESA-3061 Converters - support bytes in Avro top-level union types (#2762))
<<<<<<< HEAD
<<<<<<< HEAD
<<<<<<< HEAD
<<<<<<< HEAD
<<<<<<< HEAD
=======
<<<<<<< HEAD
>>>>>>> 6f30a087ee (GEOMESA-3061 Converters - support bytes in Avro top-level union types (#2762))
=======
>>>>>>> location-main
=======
>>>>>>> 6f30a087ee (GEOMESA-3061 Converters - support bytes in Avro top-level union types (#2762))
=======
>>>>>>> locationtech-main
=======
>>>>>>> 6f30a087ee (GEOMESA-3061 Converters - support bytes in Avro top-level union types (#2762))
=======
>>>>>>> locatelli-main
=======
>>>>>>> 6f30a087ee (GEOMESA-3061 Converters - support bytes in Avro top-level union types (#2762))
=======
>>>>>>> locatelli-main
=======
>>>>>>> 6f30a087ee (GEOMESA-3061 Converters - support bytes in Avro top-level union types (#2762))
=======
>>>>>>> locatelli-main
=======
=======
=======
>>>>>>> 67b361c85 (GEOMESA-3061 Converters - support bytes in Avro top-level union types (#2762))
<<<<<<< HEAD
<<<<<<< HEAD
<<<<<<< HEAD
<<<<<<< HEAD
=======
<<<<<<< HEAD
<<<<<<< HEAD
>>>>>>> locationtech-main
=======
<<<<<<< HEAD
<<<<<<< HEAD
=======
>>>>>>> d025f79392 (GEOMESA-3176 Docs - fix download links in install instructions)
>>>>>>> locatelli-main
=======
<<<<<<< HEAD
=======
>>>>>>> d025f79392 (GEOMESA-3176 Docs - fix download links in install instructions)
>>>>>>> locatelli-main
=======
>>>>>>> d025f79392 (GEOMESA-3176 Docs - fix download links in install instructions)
>>>>>>> locatelli-main
>>>>>>> ad3cedc4d (GEOMESA-3061 Converters - support bytes in Avro top-level union types (#2762))
<<<<<<< HEAD
>>>>>>> 9abc630fdf (GEOMESA-3061 Converters - support bytes in Avro top-level union types (#2762))
<<<<<<< HEAD
<<<<<<< HEAD
<<<<<<< HEAD
<<<<<<< HEAD
<<<<<<< HEAD
=======
<<<<<<< HEAD
>>>>>>> d294ce49e2 (GEOMESA-3061 Converters - support bytes in Avro top-level union types (#2762))
=======
>>>>>>> location-main
=======
>>>>>>> d294ce49e2 (GEOMESA-3061 Converters - support bytes in Avro top-level union types (#2762))
=======
>>>>>>> locationtech-main
=======
>>>>>>> d294ce49e2 (GEOMESA-3061 Converters - support bytes in Avro top-level union types (#2762))
=======
>>>>>>> locatelli-main
=======
>>>>>>> d294ce49e2 (GEOMESA-3061 Converters - support bytes in Avro top-level union types (#2762))
=======
>>>>>>> locatelli-main
=======
>>>>>>> d294ce49e2 (GEOMESA-3061 Converters - support bytes in Avro top-level union types (#2762))
=======
>>>>>>> locatelli-main
=======
=======
=======
=======
>>>>>>> 90ec70f55 (GEOMESA-3176 Docs - fix download links in install instructions)
>>>>>>> 63db7d154 (GEOMESA-3176 Docs - fix download links in install instructions)
<<<<<<< HEAD
<<<<<<< HEAD
<<<<<<< HEAD
<<<<<<< HEAD
=======
<<<<<<< HEAD
<<<<<<< HEAD
>>>>>>> locationtech-main
=======
<<<<<<< HEAD
<<<<<<< HEAD
=======
>>>>>>> 8171686fd2 (GEOMESA-3061 Converters - support bytes in Avro top-level union types (#2762))
>>>>>>> locatelli-main
=======
<<<<<<< HEAD
=======
>>>>>>> 8171686fd2 (GEOMESA-3061 Converters - support bytes in Avro top-level union types (#2762))
>>>>>>> locatelli-main
=======
>>>>>>> 8171686fd2 (GEOMESA-3061 Converters - support bytes in Avro top-level union types (#2762))
>>>>>>> locatelli-main
>>>>>>> a12ea194c (GEOMESA-3176 Docs - fix download links in install instructions)
<<<<<<< HEAD
>>>>>>> 5c3f315bc0 (GEOMESA-3176 Docs - fix download links in install instructions)
<<<<<<< HEAD
<<<<<<< HEAD
<<<<<<< HEAD
<<<<<<< HEAD
<<<<<<< HEAD
=======
<<<<<<< HEAD
>>>>>>> b041fcc3eb (GEOMESA-3176 Docs - fix download links in install instructions)
=======
>>>>>>> location-main
=======
>>>>>>> b041fcc3eb (GEOMESA-3176 Docs - fix download links in install instructions)
=======
>>>>>>> locationtech-main
=======
>>>>>>> b041fcc3eb (GEOMESA-3176 Docs - fix download links in install instructions)
=======
>>>>>>> locatelli-main
=======
>>>>>>> b041fcc3eb (GEOMESA-3176 Docs - fix download links in install instructions)
=======
>>>>>>> locatelli-main
=======
>>>>>>> b041fcc3eb (GEOMESA-3176 Docs - fix download links in install instructions)
=======
>>>>>>> locatelli-main
=======
=======
=======
>>>>>>> 28e2bfa2d (GEOMESA-3061 Converters - support bytes in Avro top-level union types (#2762))
>>>>>>> d4c5768cf (GEOMESA-3061 Converters - support bytes in Avro top-level union types (#2762))
<<<<<<< HEAD
<<<<<<< HEAD
<<<<<<< HEAD
<<<<<<< HEAD
<<<<<<< HEAD
>>>>>>> fe51719bc6 (GEOMESA-3061 Converters - support bytes in Avro top-level union types (#2762))
<<<<<<< HEAD
=======
<<<<<<< HEAD
>>>>>>> 3acb47e615 (GEOMESA-3061 Converters - support bytes in Avro top-level union types (#2762))
=======
>>>>>>> location-main
=======
<<<<<<< HEAD
=======
<<<<<<< HEAD
<<<<<<< HEAD
=======
>>>>>>> 7925093789 (GEOMESA-3061 Converters - support bytes in Avro top-level union types (#2762))
>>>>>>> locatelli-main
=======
<<<<<<< HEAD
=======
>>>>>>> 7925093789 (GEOMESA-3061 Converters - support bytes in Avro top-level union types (#2762))
>>>>>>> locatelli-main
=======
=======
>>>>>>> 7925093789 (GEOMESA-3061 Converters - support bytes in Avro top-level union types (#2762))
>>>>>>> locatelli-main
>>>>>>> fe51719bc6 (GEOMESA-3061 Converters - support bytes in Avro top-level union types (#2762))
<<<<<<< HEAD
>>>>>>> 3acb47e615 (GEOMESA-3061 Converters - support bytes in Avro top-level union types (#2762))
=======
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
=======
>>>>>>> bdbced26d (GEOMESA-3061 Converters - support bytes in Avro top-level union types (#2762))
<<<<<<< HEAD
<<<<<<< HEAD
<<<<<<< HEAD
<<<<<<< HEAD
<<<<<<< HEAD
>>>>>>> 25063957fc (GEOMESA-3061 Converters - support bytes in Avro top-level union types (#2762))
<<<<<<< HEAD
=======
<<<<<<< HEAD
>>>>>>> 1df8328338 (GEOMESA-3061 Converters - support bytes in Avro top-level union types (#2762))
=======
>>>>>>> location-main
=======
<<<<<<< HEAD
=======
<<<<<<< HEAD
<<<<<<< HEAD
=======
>>>>>>> a30a0c1a2a (Merge branch 'feature/postgis-fixes')
>>>>>>> locatelli-main
=======
<<<<<<< HEAD
=======
>>>>>>> a30a0c1a2a (Merge branch 'feature/postgis-fixes')
>>>>>>> locatelli-main
=======
=======
>>>>>>> a30a0c1a2a (Merge branch 'feature/postgis-fixes')
>>>>>>> locatelli-main
>>>>>>> 25063957fc (GEOMESA-3061 Converters - support bytes in Avro top-level union types (#2762))
<<<<<<< HEAD
>>>>>>> 1df8328338 (GEOMESA-3061 Converters - support bytes in Avro top-level union types (#2762))
=======
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
=======
=======
>>>>>>> 3be8d2a5a (Merge branch 'feature/postgis-fixes')
>>>>>>> 1b25d7ddb (Merge branch 'feature/postgis-fixes')
>>>>>>> 699117eca9 (Merge branch 'feature/postgis-fixes')
<<<<<<< HEAD
<<<<<<< HEAD
<<<<<<< HEAD
<<<<<<< HEAD
<<<<<<< HEAD
=======
=======
>>>>>>> 3be8d2a5a (Merge branch 'feature/postgis-fixes')
>>>>>>> locationtech-main
=======
=======
>>>>>>> locationtech-main
=======
>>>>>>> locatelli-main
=======
>>>>>>> locatelli-main
=======
>>>>>>> locatelli-main
>>>>>>> c69897d7bd (Merge branch 'feature/postgis-fixes')
=======
=======

>>>>>>> b9bdd406e (GEOMESA-3061 Converters - support bytes in Avro top-level union types (#2762))
>>>>>>> f0b9bd8121 (GEOMESA-3061 Converters - support bytes in Avro top-level union types (#2762))
<<<<<<< HEAD
<<<<<<< HEAD
<<<<<<< HEAD
<<<<<<< HEAD
=======
<<<<<<< HEAD
<<<<<<< HEAD
=======
>>>>>>> 1f19a648d1 (GEOMESA-3176 Docs - fix download links in install instructions)
>>>>>>> locationtech-main
=======
=======
>>>>>>> 49a5a0454f (GEOMESA-3061 Converters - support bytes in Avro top-level union types (#2762))
=======
=======
<<<<<<< HEAD
=======
>>>>>>> locatelli-main
<<<<<<< HEAD
=======
>>>>>>> locatelli-main
<<<<<<< HEAD
<<<<<<< HEAD
<<<<<<< HEAD
=======
=======
>>>>>>> 1f19a648d1 (GEOMESA-3176 Docs - fix download links in install instructions)
>>>>>>> fbb5e06c6a (GEOMESA-3176 Docs - fix download links in install instructions)
=======
>>>>>>> 9d0ea08871 (GEOMESA-3061 Converters - support bytes in Avro top-level union types (#2762))
=======
>>>>>>> 1f19a648d1 (GEOMESA-3176 Docs - fix download links in install instructions)
=======
=======
=======
>>>>>>> 94fecee1d8 (GEOMESA-3061 Converters - support bytes in Avro top-level union types (#2762))
=======
>>>>>>> 7ca1082a3f (GEOMESA-3061 Converters - support bytes in Avro top-level union types (#2762))
>>>>>>> 6eb31fb652 (GEOMESA-3061 Converters - support bytes in Avro top-level union types (#2762))
=======
>>>>>>> 07a6a5c291 (GEOMESA-3061 Converters - support bytes in Avro top-level union types (#2762))
=======
>>>>>>> 67b361c856 (GEOMESA-3061 Converters - support bytes in Avro top-level union types (#2762))
=======
=======
>>>>>>> 90ec70f55 (GEOMESA-3176 Docs - fix download links in install instructions)
>>>>>>> 63db7d154a (GEOMESA-3176 Docs - fix download links in install instructions)
=======
=======
>>>>>>> 731987cbc8 (GEOMESA-3176 Docs - fix download links in install instructions)
=======
>>>>>>> 49a5a0454f (GEOMESA-3061 Converters - support bytes in Avro top-level union types (#2762))
=======
>>>>>>> 49a5a0454f (GEOMESA-3061 Converters - support bytes in Avro top-level union types (#2762))
=======
>>>>>>> 6eb31fb65 (GEOMESA-3061 Converters - support bytes in Avro top-level union types (#2762))
=======
<<<<<<< HEAD
>>>>>>> 15e998504 (GEOMESA-3176 Docs - fix download links in install instructions)
=======
>>>>>>> 07a6a5c29 (GEOMESA-3061 Converters - support bytes in Avro top-level union types (#2762))
=======
>>>>>>> 67b361c85 (GEOMESA-3061 Converters - support bytes in Avro top-level union types (#2762))
=======
=======
>>>>>>> 90ec70f55 (GEOMESA-3176 Docs - fix download links in install instructions)
>>>>>>> 63db7d154 (GEOMESA-3176 Docs - fix download links in install instructions)
=======
=======
>>>>>>> 28e2bfa2d (GEOMESA-3061 Converters - support bytes in Avro top-level union types (#2762))
<<<<<<< HEAD
<<<<<<< HEAD
>>>>>>> locatelli-main
=======
>>>>>>> locatelli-main
=======
>>>>>>> locatelli-main

>>>>>>> b9bdd406e (GEOMESA-3061 Converters - support bytes in Avro top-level union types (#2762))
=======
>>>>>>> 16b2e83f2 (GEOMESA-3176 Docs - fix download links in install instructions)
<<<<<<< HEAD
<<<<<<< HEAD
<<<<<<< HEAD
<<<<<<< HEAD
>>>>>>> 308738bcef (GEOMESA-3176 Docs - fix download links in install instructions)
<<<<<<< HEAD
=======
<<<<<<< HEAD
<<<<<<< HEAD
>>>>>>> locationtech-main
=======
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
=======
>>>>>>> a75dd93dd3 (GEOMESA-3061 Converters - support bytes in Avro top-level union types (#2762))
>>>>>>> 308738bcef (GEOMESA-3176 Docs - fix download links in install instructions)
<<<<<<< HEAD
<<<<<<< HEAD
<<<<<<< HEAD
<<<<<<< HEAD
=======
>>>>>>> fbb5e06c6a (GEOMESA-3176 Docs - fix download links in install instructions)
=======
>>>>>>> b8545eda8f (GEOMESA-3061 Converters - support bytes in Avro top-level union types (#2762))
<<<<<<< HEAD
<<<<<<< HEAD
>>>>>>> locatelli-main
=======
>>>>>>> locatelli-main
=======
>>>>>>> locatelli-main
=======
>>>>>>> c1f99f4bcb (GEOMESA-3061 Converters - support bytes in Avro top-level union types (#2762))
=======
>>>>>>> c3c5dd0ebb (GEOMESA-3061 Converters - support bytes in Avro top-level union types (#2762))
<<<<<<< HEAD
<<<<<<< HEAD
<<<<<<< HEAD
<<<<<<< HEAD
=======
=======
<<<<<<< HEAD
>>>>>>> locatelli-main
=======
>>>>>>> locatelli-main
<<<<<<< HEAD
<<<<<<< HEAD
=======
>>>>>>> 4492950388 (GEOMESA-3176 Docs - fix download links in install instructions)
<<<<<<< HEAD
<<<<<<< HEAD
>>>>>>> locationtech-main
=======
=======
>>>>>>> locatelli-main
=======
<<<<<<< HEAD
=======
>>>>>>> 4492950388 (GEOMESA-3176 Docs - fix download links in install instructions)
>>>>>>> locatelli-main
=======
>>>>>>> e6703260b7 (GEOMESA-3061 Converters - support bytes in Avro top-level union types (#2762))
=======
=======
>>>>>>> 4492950388 (GEOMESA-3176 Docs - fix download links in install instructions)
>>>>>>> 64a722e2a7 (GEOMESA-3176 Docs - fix download links in install instructions)
<<<<<<< HEAD
<<<<<<< HEAD
>>>>>>> locatelli-main
=======
>>>>>>> locatelli-main
=======
>>>>>>> locatelli-main
=======
=======
>>>>>>> 90ec70f55 (GEOMESA-3176 Docs - fix download links in install instructions)
>>>>>>> 8b8075f529 (GEOMESA-3176 Docs - fix download links in install instructions)
<<<<<<< HEAD
<<<<<<< HEAD
<<<<<<< HEAD
<<<<<<< HEAD
=======
=======
<<<<<<< HEAD
>>>>>>> locatelli-main
=======
>>>>>>> locatelli-main
<<<<<<< HEAD
<<<<<<< HEAD
=======
>>>>>>> b9c0fc77b9 (GEOMESA-3061 Converters - support bytes in Avro top-level union types (#2762))
<<<<<<< HEAD
<<<<<<< HEAD
>>>>>>> locationtech-main
=======
=======
=======
>>>>>>> locatelli-main
=======
<<<<<<< HEAD
=======
>>>>>>> b9c0fc77b9 (GEOMESA-3061 Converters - support bytes in Avro top-level union types (#2762))
>>>>>>> locatelli-main
=======
>>>>>>> 64a722e2a7 (GEOMESA-3176 Docs - fix download links in install instructions)
=======
=======
>>>>>>> b9c0fc77b9 (GEOMESA-3061 Converters - support bytes in Avro top-level union types (#2762))
>>>>>>> 420027bc3f (GEOMESA-3061 Converters - support bytes in Avro top-level union types (#2762))
=======
=======
>>>>>>> fdf0e4fe88 (GEOMESA-3176 Docs - fix download links in install instructions)
=======
>>>>>>> 32234db855 (GEOMESA-3061 Converters - support bytes in Avro top-level union types (#2762))
=======
>>>>>>> f2943650ff (GEOMESA-3176 Docs - fix download links in install instructions)
=======
>>>>>>> 86dd18aa73 (GEOMESA-3061 Converters - support bytes in Avro top-level union types (#2762))
<<<<<<< HEAD
<<<<<<< HEAD
>>>>>>> locatelli-main
=======
>>>>>>> locatelli-main
=======
>>>>>>> locatelli-main
=======
>>>>>>> 6eb31fb65 (GEOMESA-3061 Converters - support bytes in Avro top-level union types (#2762))
>>>>>>> 338d952d43 (GEOMESA-3061 Converters - support bytes in Avro top-level union types (#2762))
<<<<<<< HEAD
<<<<<<< HEAD
<<<<<<< HEAD
<<<<<<< HEAD
=======
<<<<<<< HEAD
<<<<<<< HEAD
>>>>>>> locationtech-main
=======
<<<<<<< HEAD
=======
>>>>>>> locatelli-main
<<<<<<< HEAD
=======
>>>>>>> locatelli-main
<<<<<<< HEAD
=======
>>>>>>> 420027bc3f (GEOMESA-3061 Converters - support bytes in Avro top-level union types (#2762))
=======
>>>>>>> 39c52cab32 (GEOMESA-3061 Converters - support bytes in Avro top-level union types (#2762))
<<<<<<< HEAD
<<<<<<< HEAD
>>>>>>> locatelli-main
=======
>>>>>>> locatelli-main
=======
>>>>>>> locatelli-main
=======
>>>>>>> 4c361f07da (GEOMESA-3061 Converters - support bytes in Avro top-level union types (#2762))
=======
=======
>>>>>>> 15e998504 (GEOMESA-3176 Docs - fix download links in install instructions)
>>>>>>> 64e2e43818 (GEOMESA-3176 Docs - fix download links in install instructions)
<<<<<<< HEAD
<<<<<<< HEAD
<<<<<<< HEAD
<<<<<<< HEAD
=======
=======
<<<<<<< HEAD
<<<<<<< HEAD
>>>>>>> locatelli-main
=======
>>>>>>> locatelli-main
<<<<<<< HEAD
<<<<<<< HEAD
=======
>>>>>>> d69216810e (GEOMESA-3061 Converters - support bytes in Avro top-level union types (#2762))
<<<<<<< HEAD
<<<<<<< HEAD
>>>>>>> locationtech-main
=======
=======
<<<<<<< HEAD
<<<<<<< HEAD
<<<<<<< HEAD
=======
>>>>>>> d69216810e (GEOMESA-3061 Converters - support bytes in Avro top-level union types (#2762))
>>>>>>> locatelli-main
=======
>>>>>>> locatelli-main
=======
>>>>>>> 732efe4910 (GEOMESA-3061 Converters - support bytes in Avro top-level union types (#2762))
=======
>>>>>>> 341ef96c9a (GEOMESA-3176 Docs - fix download links in install instructions)
=======
=======
>>>>>>> d69216810e (GEOMESA-3061 Converters - support bytes in Avro top-level union types (#2762))
>>>>>>> fc1024de7e (GEOMESA-3061 Converters - support bytes in Avro top-level union types (#2762))
<<<<<<< HEAD
<<<<<<< HEAD
>>>>>>> locatelli-main
=======
>>>>>>> locatelli-main
=======
>>>>>>> locatelli-main
=======
=======
>>>>>>> 07a6a5c29 (GEOMESA-3061 Converters - support bytes in Avro top-level union types (#2762))
>>>>>>> 9627a2de6a (GEOMESA-3061 Converters - support bytes in Avro top-level union types (#2762))
<<<<<<< HEAD
<<<<<<< HEAD
<<<<<<< HEAD
<<<<<<< HEAD
=======
<<<<<<< HEAD
<<<<<<< HEAD
>>>>>>> locationtech-main
=======
<<<<<<< HEAD
=======
>>>>>>> locatelli-main
<<<<<<< HEAD
=======
>>>>>>> locatelli-main
<<<<<<< HEAD
<<<<<<< HEAD
<<<<<<< HEAD
=======
>>>>>>> fc1024de7e (GEOMESA-3061 Converters - support bytes in Avro top-level union types (#2762))
=======
>>>>>>> 27c0ee7e6d (GEOMESA-3061 Converters - support bytes in Avro top-level union types (#2762))
<<<<<<< HEAD
<<<<<<< HEAD
>>>>>>> locatelli-main
=======
>>>>>>> locatelli-main
=======
>>>>>>> locatelli-main
=======
>>>>>>> f302a54949 (GEOMESA-3061 Converters - support bytes in Avro top-level union types (#2762))
=======
>>>>>>> b046434188 (GEOMESA-3176 Docs - fix download links in install instructions)
<<<<<<< HEAD
<<<<<<< HEAD
<<<<<<< HEAD
<<<<<<< HEAD
=======
<<<<<<< HEAD
<<<<<<< HEAD
>>>>>>> locationtech-main
=======
<<<<<<< HEAD
=======
>>>>>>> locatelli-main
<<<<<<< HEAD
=======
>>>>>>> locatelli-main
<<<<<<< HEAD
<<<<<<< HEAD
<<<<<<< HEAD
=======
>>>>>>> 5712753579 (GEOMESA-3176 Docs - fix download links in install instructions)
=======
>>>>>>> 8435590eee (GEOMESA-3061 Converters - support bytes in Avro top-level union types (#2762))
<<<<<<< HEAD
<<<<<<< HEAD
>>>>>>> locatelli-main
=======
>>>>>>> locatelli-main
=======
>>>>>>> locatelli-main
=======
>>>>>>> 28e2bfa2d (GEOMESA-3061 Converters - support bytes in Avro top-level union types (#2762))
>>>>>>> 76908c410a (GEOMESA-3061 Converters - support bytes in Avro top-level union types (#2762))
=======
>>>>>>> b4320946b (GEOMESA-3061 Converters - support bytes in Avro top-level union types (#2762))
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
>>>>>>> locatelli-main
<<<<<<< HEAD
<<<<<<< HEAD
=======
>>>>>>> ec6d06b576 (Merge branch 'feature/postgis-fixes')
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
>>>>>>> ec6d06b576 (Merge branch 'feature/postgis-fixes')
<<<<<<< HEAD
>>>>>>> locatelli-main
=======
>>>>>>> locatelli-main
=======
>>>>>>> 354b5e5ae5 (Merge branch 'feature/postgis-fixes')
=======
>>>>>>> 7fa3b8d23f (GEOMESA-3061 Converters - support bytes in Avro top-level union types (#2762))
=======
=======
>>>>>>> ec6d06b576 (Merge branch 'feature/postgis-fixes')
>>>>>>> cc93e0930d (Merge branch 'feature/postgis-fixes')
<<<<<<< HEAD
<<<<<<< HEAD
>>>>>>> locatelli-main
=======
>>>>>>> locatelli-main
=======
>>>>>>> locatelli-main
>>>>>>> a788dfac03 (GEOMESA-3061 Converters - support bytes in Avro top-level union types (#2762))
=======
=======
>>>>>>> 3be8d2a5a (Merge branch 'feature/postgis-fixes')
>>>>>>> da00c7bd68 (Merge branch 'feature/postgis-fixes')
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
=======
>>>>>>> locatelli-main
<<<<<<< HEAD
=======
>>>>>>> ac217b392d (GEOMESA-3061 Converters - support bytes in Avro top-level union types (#2762))
=======
>>>>>>> cc93e0930d (Merge branch 'feature/postgis-fixes')
<<<<<<< HEAD
<<<<<<< HEAD
>>>>>>> locatelli-main
=======
>>>>>>> locatelli-main
=======
>>>>>>> locatelli-main
=======
=======

>>>>>>> b9bdd406e3 (GEOMESA-3061 Converters - support bytes in Avro top-level union types (#2762))
>>>>>>> 59a1fbb96e (GEOMESA-3061 Converters - support bytes in Avro top-level union types (#2762))
<<<<<<< HEAD
<<<<<<< HEAD
=======
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
>>>>>>> 983d0b0983 (GEOMESA-3176 Docs - fix download links in install instructions)
=======
>>>>>>> 30cd5ab927 (GEOMESA-3061 Converters - support bytes in Avro top-level union types (#2762))
<<<<<<< HEAD
<<<<<<< HEAD
=======
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
>>>>>>> d1fa26b39d (GEOMESA-3061 Converters - support bytes in Avro top-level union types (#2762))
=======
>>>>>>> 90ec70f559 (GEOMESA-3176 Docs - fix download links in install instructions)
>>>>>>> 610d4a0e13 (GEOMESA-3176 Docs - fix download links in install instructions)
<<<<<<< HEAD
<<<<<<< HEAD
=======
<<<<<<< HEAD
<<<<<<< HEAD
=======
>>>>>>> locatelli-main
<<<<<<< HEAD
=======
=======
>>>>>>> locatelli-main
=======
>>>>>>> ecddd8c3e7 (GEOMESA-3061 Converters - support bytes in Avro top-level union types (#2762))
=======
>>>>>>> 9c39003417 (GEOMESA-3176 Docs - fix download links in install instructions)
=======
>>>>>>> 036a470d76 (GEOMESA-3061 Converters - support bytes in Avro top-level union types (#2762))
=======
>>>>>>> 269558cf9e (GEOMESA-3061 Converters - support bytes in Avro top-level union types (#2762))
=======
>>>>>>> 3b4f3da2e1 (GEOMESA-3176 Docs - fix download links in install instructions)
=======
>>>>>>> ad7067b815 (GEOMESA-3061 Converters - support bytes in Avro top-level union types (#2762))
=======
>>>>>>> 17c1f8a18c (GEOMESA-3176 Docs - fix download links in install instructions)
=======
>>>>>>> e3976d40bc (GEOMESA-3061 Converters - support bytes in Avro top-level union types (#2762))
=======
>>>>>>> 82d93995e4 (GEOMESA-3176 Docs - fix download links in install instructions)
=======
>>>>>>> 7dfac253b4 (GEOMESA-3061 Converters - support bytes in Avro top-level union types (#2762))
=======
>>>>>>> 62a28bf2e7 (GEOMESA-3061 Converters - support bytes in Avro top-level union types (#2762))
=======
>>>>>>> 42adcd38ba (GEOMESA-3176 Docs - fix download links in install instructions)
<<<<<<< HEAD
>>>>>>> 90ec70f559 (GEOMESA-3176 Docs - fix download links in install instructions)
=======
=======
>>>>>>> 07a6a5c291 (GEOMESA-3061 Converters - support bytes in Avro top-level union types (#2762))
=======
<<<<<<< HEAD
<<<<<<< HEAD
>>>>>>> 63db7d154a (GEOMESA-3176 Docs - fix download links in install instructions)
=======
=======
>>>>>>> 0fbf9e83e2 (GEOMESA-3176 Docs - fix download links in install instructions)
=======
>>>>>>> 89bdd3013e (GEOMESA-3061 Converters - support bytes in Avro top-level union types (#2762))
=======
>>>>>>> f9e8439b09 (GEOMESA-3176 Docs - fix download links in install instructions)
=======
>>>>>>> 72bafaf54b (GEOMESA-3061 Converters - support bytes in Avro top-level union types (#2762))
=======
>>>>>>> 6eb31fb65 (GEOMESA-3061 Converters - support bytes in Avro top-level union types (#2762))
>>>>>>> 28e2bfa2dc (GEOMESA-3061 Converters - support bytes in Avro top-level union types (#2762))
=======
>>>>>>> c5e1827657 (GEOMESA-3061 Converters - support bytes in Avro top-level union types (#2762))
=======
>>>>>>> 8cbe155de6 (GEOMESA-3176 Docs - fix download links in install instructions)
=======
>>>>>>> 107726440b (GEOMESA-3061 Converters - support bytes in Avro top-level union types (#2762))
=======
=======
>>>>>>> 6eb31fb65 (GEOMESA-3061 Converters - support bytes in Avro top-level union types (#2762))
>>>>>>> 5f428db977 (GEOMESA-3061 Converters - support bytes in Avro top-level union types (#2762))
<<<<<<< HEAD
<<<<<<< HEAD
=======
>>>>>>> 07a6a5c29 (GEOMESA-3061 Converters - support bytes in Avro top-level union types (#2762))
=======
>>>>>>> 63db7d154 (GEOMESA-3176 Docs - fix download links in install instructions)
=======
=======
>>>>>>> 6eb31fb65 (GEOMESA-3061 Converters - support bytes in Avro top-level union types (#2762))
>>>>>>> 28e2bfa2d (GEOMESA-3061 Converters - support bytes in Avro top-level union types (#2762))
=======
=======
>>>>>>> 789f6eba49 (GEOMESA-3061 Converters - support bytes in Avro top-level union types (#2762))
<<<<<<< HEAD
<<<<<<< HEAD
>>>>>>> locatelli-main
=======
>>>>>>> locatelli-main
=======
>>>>>>> locatelli-main
=======
=======
>>>>>>> ecddd8c3e7 (GEOMESA-3061 Converters - support bytes in Avro top-level union types (#2762))
=======
>>>>>>> 9c39003417 (GEOMESA-3176 Docs - fix download links in install instructions)
=======
>>>>>>> 036a470d76 (GEOMESA-3061 Converters - support bytes in Avro top-level union types (#2762))
=======
>>>>>>> 269558cf9e (GEOMESA-3061 Converters - support bytes in Avro top-level union types (#2762))
=======
>>>>>>> 3b4f3da2e1 (GEOMESA-3176 Docs - fix download links in install instructions)
=======
>>>>>>> ad7067b815 (GEOMESA-3061 Converters - support bytes in Avro top-level union types (#2762))
=======
>>>>>>> 17c1f8a18c (GEOMESA-3176 Docs - fix download links in install instructions)
=======
>>>>>>> e3976d40bc (GEOMESA-3061 Converters - support bytes in Avro top-level union types (#2762))
=======
>>>>>>> 82d93995e4 (GEOMESA-3176 Docs - fix download links in install instructions)
=======
>>>>>>> 7dfac253b4 (GEOMESA-3061 Converters - support bytes in Avro top-level union types (#2762))
<<<<<<< HEAD
>>>>>>> 90ec70f559 (GEOMESA-3176 Docs - fix download links in install instructions)
=======
=======
<<<<<<< HEAD
<<<<<<< HEAD
<<<<<<< HEAD
>>>>>>> 07a6a5c291 (GEOMESA-3061 Converters - support bytes in Avro top-level union types (#2762))
=======
>>>>>>> 63db7d154a (GEOMESA-3176 Docs - fix download links in install instructions)
=======
<<<<<<< HEAD
=======
>>>>>>> locatelli-main
<<<<<<< HEAD
=======
>>>>>>> locatelli-main
>>>>>>> 4ac5af223d (GEOMESA-3061 Converters - support bytes in Avro top-level union types (#2762))
=======
>>>>>>> 789f6eba49 (GEOMESA-3061 Converters - support bytes in Avro top-level union types (#2762))
=======
>>>>>>> 07a6a5c291 (GEOMESA-3061 Converters - support bytes in Avro top-level union types (#2762))
=======
<<<<<<< HEAD
>>>>>>> 4fc0f66d4f (GEOMESA-3061 Converters - support bytes in Avro top-level union types (#2762))
=======

>>>>>>> b9bdd406e (GEOMESA-3061 Converters - support bytes in Avro top-level union types (#2762))
>>>>>>> f71fa3c0e (GEOMESA-3061 Converters - support bytes in Avro top-level union types (#2762))
<<<<<<< HEAD
<<<<<<< HEAD
<<<<<<< HEAD
<<<<<<< HEAD
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
>>>>>>> 3eb12f79a9 (GEOMESA-3061 Converters - support bytes in Avro top-level union types (#2762))
=======
>>>>>>> 4fc0f66d4f (GEOMESA-3061 Converters - support bytes in Avro top-level union types (#2762))
>>>>>>> 6eb31fb652 (GEOMESA-3061 Converters - support bytes in Avro top-level union types (#2762))
<<<<<<< HEAD
>>>>>>> ffe4f9fd41 (GEOMESA-3061 Converters - support bytes in Avro top-level union types (#2762))
=======
=======
>>>>>>> 67b361c856 (GEOMESA-3061 Converters - support bytes in Avro top-level union types (#2762))
=======
>>>>>>> 28e2bfa2dc (GEOMESA-3061 Converters - support bytes in Avro top-level union types (#2762))
=======
>>>>>>> 9d708b240a (GEOMESA-3061 Converters - support bytes in Avro top-level union types (#2762))
=======
>>>>>>> 5f428db977 (GEOMESA-3061 Converters - support bytes in Avro top-level union types (#2762))
=======
>>>>>>> 89bdd3013e (GEOMESA-3061 Converters - support bytes in Avro top-level union types (#2762))
=======
=======
<<<<<<< HEAD
<<<<<<< HEAD
=======
>>>>>>> 7ca1082a3f (GEOMESA-3061 Converters - support bytes in Avro top-level union types (#2762))
>>>>>>> 72bafaf54b (GEOMESA-3061 Converters - support bytes in Avro top-level union types (#2762))
=======
>>>>>>> 67b361c85 (GEOMESA-3061 Converters - support bytes in Avro top-level union types (#2762))
>>>>>>> c8a325e13c (GEOMESA-3061 Converters - support bytes in Avro top-level union types (#2762))
=======
>>>>>>> 28e2bfa2d (GEOMESA-3061 Converters - support bytes in Avro top-level union types (#2762))
=======
<<<<<<< HEAD
<<<<<<< HEAD
>>>>>>> e6e1f4bdd5 (GEOMESA-3061 Converters - support bytes in Avro top-level union types (#2762))
=======
=======
>>>>>>> 67b361c85 (GEOMESA-3061 Converters - support bytes in Avro top-level union types (#2762))
>>>>>>> c8a325e13c (GEOMESA-3061 Converters - support bytes in Avro top-level union types (#2762))
=======
>>>>>>> 94fecee1d8 (GEOMESA-3061 Converters - support bytes in Avro top-level union types (#2762))
=======
>>>>>>> 7ca1082a3f (GEOMESA-3061 Converters - support bytes in Avro top-level union types (#2762))
=======
>>>>>>> e6e1f4bdd5 (GEOMESA-3061 Converters - support bytes in Avro top-level union types (#2762))
=======
>>>>>>> 3eb12f79a9 (GEOMESA-3061 Converters - support bytes in Avro top-level union types (#2762))
=======

>>>>>>> b9bdd406e (GEOMESA-3061 Converters - support bytes in Avro top-level union types (#2762))
<<<<<<< HEAD
<<<<<<< HEAD
<<<<<<< HEAD
>>>>>>> 0e68e9f4cc (GEOMESA-3061 Converters - support bytes in Avro top-level union types (#2762))
<<<<<<< HEAD
>>>>>>> f67dd3371e (GEOMESA-3061 Converters - support bytes in Avro top-level union types (#2762))
=======
=======
<<<<<<< HEAD
=======
=======
>>>>>>> 930f10d338 (GEOMESA-3061 Converters - support bytes in Avro top-level union types (#2762))
>>>>>>> 947a867d1c (GEOMESA-3061 Converters - support bytes in Avro top-level union types (#2762))
=======
>>>>>>> 6eb31fb65 (GEOMESA-3061 Converters - support bytes in Avro top-level union types (#2762))
=======
<<<<<<< HEAD
>>>>>>> 15e998504 (GEOMESA-3176 Docs - fix download links in install instructions)
=======
>>>>>>> 07a6a5c29 (GEOMESA-3061 Converters - support bytes in Avro top-level union types (#2762))
=======
>>>>>>> 67b361c85 (GEOMESA-3061 Converters - support bytes in Avro top-level union types (#2762))
=======
=======
>>>>>>> 90ec70f55 (GEOMESA-3176 Docs - fix download links in install instructions)
>>>>>>> 63db7d154 (GEOMESA-3176 Docs - fix download links in install instructions)
=======
=======
>>>>>>> 28e2bfa2d (GEOMESA-3061 Converters - support bytes in Avro top-level union types (#2762))

>>>>>>> b9bdd406e (GEOMESA-3061 Converters - support bytes in Avro top-level union types (#2762))
=======
>>>>>>> 16b2e83f2 (GEOMESA-3176 Docs - fix download links in install instructions)
<<<<<<< HEAD
<<<<<<< HEAD
<<<<<<< HEAD
<<<<<<< HEAD
<<<<<<< HEAD
<<<<<<< HEAD
>>>>>>> 15e9985047 (GEOMESA-3176 Docs - fix download links in install instructions)
<<<<<<< HEAD
>>>>>>> d25af58f86 (GEOMESA-3176 Docs - fix download links in install instructions)
=======
=======
=======
>>>>>>> 4b70e7f8fb (GEOMESA-3176 Docs - fix download links in install instructions)
=======
>>>>>>> 85663f71c4 (GEOMESA-3061 Converters - support bytes in Avro top-level union types (#2762))
=======
>>>>>>> a12ea194c8 (GEOMESA-3176 Docs - fix download links in install instructions)
=======
>>>>>>> d4c5768cfa (GEOMESA-3061 Converters - support bytes in Avro top-level union types (#2762))
<<<<<<< HEAD
=======
>>>>>>> 6eb31fb65 (GEOMESA-3061 Converters - support bytes in Avro top-level union types (#2762))
>>>>>>> 23c0241798 (GEOMESA-3061 Converters - support bytes in Avro top-level union types (#2762))
=======
<<<<<<< HEAD
>>>>>>> 07a6a5c291 (GEOMESA-3061 Converters - support bytes in Avro top-level union types (#2762))
<<<<<<< HEAD
>>>>>>> ecddd8c3e7 (GEOMESA-3061 Converters - support bytes in Avro top-level union types (#2762))
=======
=======
<<<<<<< HEAD
=======
>>>>>>> 07a6a5c29 (GEOMESA-3061 Converters - support bytes in Avro top-level union types (#2762))
=======
<<<<<<< HEAD
>>>>>>> 85663f71c4 (GEOMESA-3061 Converters - support bytes in Avro top-level union types (#2762))
=======
>>>>>>> 63db7d154 (GEOMESA-3176 Docs - fix download links in install instructions)
=======
>>>>>>> a12ea194c8 (GEOMESA-3176 Docs - fix download links in install instructions)
=======
>>>>>>> 6eb31fb65 (GEOMESA-3061 Converters - support bytes in Avro top-level union types (#2762))
>>>>>>> 28e2bfa2d (GEOMESA-3061 Converters - support bytes in Avro top-level union types (#2762))
=======
>>>>>>> 63db7d154a (GEOMESA-3176 Docs - fix download links in install instructions)
>>>>>>> ef8de676d3 (GEOMESA-3176 Docs - fix download links in install instructions)
<<<<<<< HEAD
<<<<<<< HEAD
>>>>>>> locatelli-main
=======
>>>>>>> locatelli-main
=======
>>>>>>> locatelli-main
=======
=======
>>>>>>> 0fbf9e83e2 (GEOMESA-3176 Docs - fix download links in install instructions)
=======
>>>>>>> 89bdd3013e (GEOMESA-3061 Converters - support bytes in Avro top-level union types (#2762))
=======
>>>>>>> f9e8439b09 (GEOMESA-3176 Docs - fix download links in install instructions)
=======
>>>>>>> 72bafaf54b (GEOMESA-3061 Converters - support bytes in Avro top-level union types (#2762))
=======
>>>>>>> 6eb31fb65 (GEOMESA-3061 Converters - support bytes in Avro top-level union types (#2762))
>>>>>>> 28e2bfa2dc (GEOMESA-3061 Converters - support bytes in Avro top-level union types (#2762))
=======
>>>>>>> c5e1827657 (GEOMESA-3061 Converters - support bytes in Avro top-level union types (#2762))
=======
>>>>>>> 8cbe155de6 (GEOMESA-3176 Docs - fix download links in install instructions)
=======
=======
>>>>>>> 6eb31fb65 (GEOMESA-3061 Converters - support bytes in Avro top-level union types (#2762))
>>>>>>> 5f428db977 (GEOMESA-3061 Converters - support bytes in Avro top-level union types (#2762))
=======
>>>>>>> 07a6a5c29 (GEOMESA-3061 Converters - support bytes in Avro top-level union types (#2762))
=======
>>>>>>> 63db7d154 (GEOMESA-3176 Docs - fix download links in install instructions)
=======
=======
>>>>>>> 6eb31fb65 (GEOMESA-3061 Converters - support bytes in Avro top-level union types (#2762))
>>>>>>> 28e2bfa2d (GEOMESA-3061 Converters - support bytes in Avro top-level union types (#2762))
=======
>>>>>>> 49a5a0454f (GEOMESA-3061 Converters - support bytes in Avro top-level union types (#2762))
=======
<<<<<<< HEAD
<<<<<<< HEAD
<<<<<<< HEAD
=======
=======
>>>>>>> locatelli-main
=======
>>>>>>> locatelli-main
>>>>>>> 49a5a0454f (GEOMESA-3061 Converters - support bytes in Avro top-level union types (#2762))
=======
=======
>>>>>>> 6eb31fb65 (GEOMESA-3061 Converters - support bytes in Avro top-level union types (#2762))
>>>>>>> b03141c1bb (GEOMESA-3061 Converters - support bytes in Avro top-level union types (#2762))
=======
>>>>>>> 07a6a5c29 (GEOMESA-3061 Converters - support bytes in Avro top-level union types (#2762))
=======
>>>>>>> 63db7d154 (GEOMESA-3176 Docs - fix download links in install instructions)
=======
=======
>>>>>>> 6eb31fb65 (GEOMESA-3061 Converters - support bytes in Avro top-level union types (#2762))
>>>>>>> 28e2bfa2d (GEOMESA-3061 Converters - support bytes in Avro top-level union types (#2762))
=======
<<<<<<< HEAD
<<<<<<< HEAD
>>>>>>> locatelli-main
=======
>>>>>>> locatelli-main
=======
>>>>>>> locatelli-main
=======

>>>>>>> b9bdd406e (GEOMESA-3061 Converters - support bytes in Avro top-level union types (#2762))
>>>>>>> f71fa3c0e (GEOMESA-3061 Converters - support bytes in Avro top-level union types (#2762))
<<<<<<< HEAD
<<<<<<< HEAD
<<<<<<< HEAD
<<<<<<< HEAD
<<<<<<< HEAD
<<<<<<< HEAD
<<<<<<< HEAD
<<<<<<< HEAD
<<<<<<< HEAD
<<<<<<< HEAD
<<<<<<< HEAD
<<<<<<< HEAD
<<<<<<< HEAD
<<<<<<< HEAD
>>>>>>> 6eb31fb652 (GEOMESA-3061 Converters - support bytes in Avro top-level union types (#2762))
<<<<<<< HEAD
>>>>>>> ffe4f9fd41 (GEOMESA-3061 Converters - support bytes in Avro top-level union types (#2762))
=======
=======
>>>>>>> 67b361c856 (GEOMESA-3061 Converters - support bytes in Avro top-level union types (#2762))
=======
>>>>>>> 28e2bfa2dc (GEOMESA-3061 Converters - support bytes in Avro top-level union types (#2762))
=======
<<<<<<< HEAD
=======
>>>>>>> locatelli-main
<<<<<<< HEAD
=======
>>>>>>> locatelli-main
<<<<<<< HEAD
<<<<<<< HEAD
<<<<<<< HEAD
=======
=======
>>>>>>> e0c2527549 (GEOMESA-3061 Converters - support bytes in Avro top-level union types (#2762))
=======
=======
<<<<<<< HEAD
>>>>>>> 6eb31fb652 (GEOMESA-3061 Converters - support bytes in Avro top-level union types (#2762))
>>>>>>> a75dd93dd3 (GEOMESA-3061 Converters - support bytes in Avro top-level union types (#2762))
<<<<<<< HEAD
>>>>>>> 6eb31fb652 (GEOMESA-3061 Converters - support bytes in Avro top-level union types (#2762))
>>>>>>> 60b4637548 (GEOMESA-3061 Converters - support bytes in Avro top-level union types (#2762))
<<<<<<< HEAD
>>>>>>> 6eb31fb652 (GEOMESA-3061 Converters - support bytes in Avro top-level union types (#2762))
>>>>>>> 23fc8cb805 (GEOMESA-3061 Converters - support bytes in Avro top-level union types (#2762))
=======
<<<<<<< HEAD
>>>>>>> 6eb31fb652 (GEOMESA-3061 Converters - support bytes in Avro top-level union types (#2762))
>>>>>>> a512d6b917 (GEOMESA-3061 Converters - support bytes in Avro top-level union types (#2762))
<<<<<<< HEAD
=======
<<<<<<< HEAD
>>>>>>> 6eb31fb652 (GEOMESA-3061 Converters - support bytes in Avro top-level union types (#2762))
>>>>>>> 00e61f4b70 (GEOMESA-3061 Converters - support bytes in Avro top-level union types (#2762))
<<<<<<< HEAD
=======
<<<<<<< HEAD
>>>>>>> 6eb31fb652 (GEOMESA-3061 Converters - support bytes in Avro top-level union types (#2762))
>>>>>>> 02bb344987 (GEOMESA-3061 Converters - support bytes in Avro top-level union types (#2762))
<<<<<<< HEAD
=======
<<<<<<< HEAD
>>>>>>> 6eb31fb652 (GEOMESA-3061 Converters - support bytes in Avro top-level union types (#2762))
>>>>>>> 99a32a726d (GEOMESA-3061 Converters - support bytes in Avro top-level union types (#2762))
<<<<<<< HEAD
=======
>>>>>>> 86dd18aa73 (GEOMESA-3061 Converters - support bytes in Avro top-level union types (#2762))
=======
>>>>>>> 67b361c85 (GEOMESA-3061 Converters - support bytes in Avro top-level union types (#2762))
=======
>>>>>>> 28e2bfa2d (GEOMESA-3061 Converters - support bytes in Avro top-level union types (#2762))
=======
<<<<<<< HEAD
>>>>>>> 240977229 (GEOMESA-3061 Converters - support bytes in Avro top-level union types (#2762))
<<<<<<< HEAD
<<<<<<< HEAD
>>>>>>> locatelli-main
=======
>>>>>>> locatelli-main
=======
>>>>>>> locatelli-main
=======
>>>>>>> 9d708b240a (GEOMESA-3061 Converters - support bytes in Avro top-level union types (#2762))
=======
>>>>>>> 5f428db977 (GEOMESA-3061 Converters - support bytes in Avro top-level union types (#2762))
=======
>>>>>>> 89bdd3013e (GEOMESA-3061 Converters - support bytes in Avro top-level union types (#2762))
=======
=======
>>>>>>> 72bafaf54b (GEOMESA-3061 Converters - support bytes in Avro top-level union types (#2762))
=======
>>>>>>> 67b361c85 (GEOMESA-3061 Converters - support bytes in Avro top-level union types (#2762))
>>>>>>> c8a325e13c (GEOMESA-3061 Converters - support bytes in Avro top-level union types (#2762))
=======
>>>>>>> 28e2bfa2d (GEOMESA-3061 Converters - support bytes in Avro top-level union types (#2762))
=======
>>>>>>> e6e1f4bdd5 (GEOMESA-3061 Converters - support bytes in Avro top-level union types (#2762))
=======
=======

>>>>>>> b9bdd406e (GEOMESA-3061 Converters - support bytes in Avro top-level union types (#2762))
<<<<<<< HEAD
<<<<<<< HEAD
<<<<<<< HEAD
<<<<<<< HEAD
=======
>>>>>>> 23c0241798 (GEOMESA-3061 Converters - support bytes in Avro top-level union types (#2762))
=======
<<<<<<< HEAD
>>>>>>> locatelli-main
=======
>>>>>>> 23c0241798 (GEOMESA-3061 Converters - support bytes in Avro top-level union types (#2762))
=======
<<<<<<< HEAD
>>>>>>> locatelli-main
=======
>>>>>>> 23c0241798 (GEOMESA-3061 Converters - support bytes in Avro top-level union types (#2762))
=======
<<<<<<< HEAD
>>>>>>> locatelli-main
<<<<<<< HEAD
<<<<<<< HEAD
>>>>>>> 0e68e9f4cc (GEOMESA-3061 Converters - support bytes in Avro top-level union types (#2762))
<<<<<<< HEAD
>>>>>>> f67dd3371e (GEOMESA-3061 Converters - support bytes in Avro top-level union types (#2762))
=======
=======
=======
>>>>>>> 947a867d1c (GEOMESA-3061 Converters - support bytes in Avro top-level union types (#2762))
=======

>>>>>>> b9bdd406e (GEOMESA-3061 Converters - support bytes in Avro top-level union types (#2762))
=======
>>>>>>> 16b2e83f2 (GEOMESA-3176 Docs - fix download links in install instructions)
<<<<<<< HEAD
>>>>>>> 15e9985047 (GEOMESA-3176 Docs - fix download links in install instructions)
<<<<<<< HEAD
>>>>>>> d25af58f86 (GEOMESA-3176 Docs - fix download links in install instructions)
=======
=======
>>>>>>> 07a6a5c291 (GEOMESA-3061 Converters - support bytes in Avro top-level union types (#2762))
<<<<<<< HEAD
>>>>>>> ecddd8c3e7 (GEOMESA-3061 Converters - support bytes in Avro top-level union types (#2762))
=======
=======
<<<<<<< HEAD
<<<<<<< HEAD
<<<<<<< HEAD
=======
>>>>>>> e0c2527549 (GEOMESA-3061 Converters - support bytes in Avro top-level union types (#2762))
>>>>>>> locatelli-main
=======
>>>>>>> e0c2527549 (GEOMESA-3061 Converters - support bytes in Avro top-level union types (#2762))
>>>>>>> locatelli-main
=======
>>>>>>> e0c2527549 (GEOMESA-3061 Converters - support bytes in Avro top-level union types (#2762))
>>>>>>> locatelli-main
>>>>>>> cdb410251 (GEOMESA-3061 Converters - support bytes in Avro top-level union types (#2762))
<<<<<<< HEAD
<<<<<<< HEAD
<<<<<<< HEAD
<<<<<<< HEAD
<<<<<<< HEAD
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
<<<<<<< HEAD
<<<<<<< HEAD
<<<<<<< HEAD
<<<<<<< HEAD
<<<<<<< HEAD
=======
>>>>>>> b47097b7bb (GEOMESA-3176 Docs - fix download links in install instructions)
=======
>>>>>>> 00e61f4b70 (GEOMESA-3061 Converters - support bytes in Avro top-level union types (#2762))
=======
>>>>>>> 26c7d06850 (GEOMESA-3176 Docs - fix download links in install instructions)
<<<<<<< HEAD
<<<<<<< HEAD
>>>>>>> locatelli-main
=======
>>>>>>> locatelli-main
=======
>>>>>>> locatelli-main
>>>>>>> 67b361c856 (GEOMESA-3061 Converters - support bytes in Avro top-level union types (#2762))
<<<<<<< HEAD
>>>>>>> f7cef54062 (GEOMESA-3061 Converters - support bytes in Avro top-level union types (#2762))
=======
=======
=======
>>>>>>> c8a325e13c (GEOMESA-3061 Converters - support bytes in Avro top-level union types (#2762))
=======
<<<<<<< HEAD
<<<<<<< HEAD
>>>>>>> f9e8439b09 (GEOMESA-3176 Docs - fix download links in install instructions)
=======
<<<<<<< HEAD
=======
<<<<<<< HEAD
=======
>>>>>>> locatelli-main
<<<<<<< HEAD
>>>>>>> f9e8439b09 (GEOMESA-3176 Docs - fix download links in install instructions)
=======
=======
>>>>>>> locatelli-main
>>>>>>> ad3cedc4db (GEOMESA-3061 Converters - support bytes in Avro top-level union types (#2762))
=======
>>>>>>> a12ea194c8 (GEOMESA-3176 Docs - fix download links in install instructions)
=======
>>>>>>> 22dcc8170f (GEOMESA-3061 Converters - support bytes in Avro top-level union types (#2762))
=======
>>>>>>> 0b36b46b5f (GEOMESA-3176 Docs - fix download links in install instructions)
=======
=======
>>>>>>> 00e61f4b70 (GEOMESA-3061 Converters - support bytes in Avro top-level union types (#2762))
=======
>>>>>>> f9e8439b09 (GEOMESA-3176 Docs - fix download links in install instructions)
=======
>>>>>>> 26c7d06850 (GEOMESA-3176 Docs - fix download links in install instructions)
<<<<<<< HEAD
<<<<<<< HEAD
>>>>>>> locatelli-main
=======
>>>>>>> locatelli-main
=======
>>>>>>> locatelli-main
>>>>>>> 90ec70f55 (GEOMESA-3176 Docs - fix download links in install instructions)
<<<<<<< HEAD
<<<<<<< HEAD
<<<<<<< HEAD
<<<<<<< HEAD
<<<<<<< HEAD
=======
<<<<<<< HEAD
<<<<<<< HEAD
=======
>>>>>>> locatelli-main
<<<<<<< HEAD
=======
>>>>>>> 99a32a726d (GEOMESA-3061 Converters - support bytes in Avro top-level union types (#2762))
=======
>>>>>>> b2177e9015 (GEOMESA-3061 Converters - support bytes in Avro top-level union types (#2762))
<<<<<<< HEAD
>>>>>>> locatelli-main
=======
>>>>>>> locatelli-main
=======
>>>>>>> 99a32a726d (GEOMESA-3061 Converters - support bytes in Avro top-level union types (#2762))
=======
>>>>>>> b2177e9015 (GEOMESA-3061 Converters - support bytes in Avro top-level union types (#2762))
>>>>>>> locatelli-main
>>>>>>> 63db7d154a (GEOMESA-3176 Docs - fix download links in install instructions)
<<<<<<< HEAD
>>>>>>> 9c39003417 (GEOMESA-3176 Docs - fix download links in install instructions)
=======
=======
=======
>>>>>>> 6eb31fb65 (GEOMESA-3061 Converters - support bytes in Avro top-level union types (#2762))
<<<<<<< HEAD
<<<<<<< HEAD
<<<<<<< HEAD
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
<<<<<<< HEAD
=======
>>>>>>> cb5e2daf2b (GEOMESA-3061 Converters - support bytes in Avro top-level union types (#2762))
=======
>>>>>>> a512d6b917 (GEOMESA-3061 Converters - support bytes in Avro top-level union types (#2762))
<<<<<<< HEAD
<<<<<<< HEAD
>>>>>>> locatelli-main
=======
>>>>>>> locatelli-main
=======
>>>>>>> locatelli-main
>>>>>>> 28e2bfa2dc (GEOMESA-3061 Converters - support bytes in Avro top-level union types (#2762))
<<<<<<< HEAD
>>>>>>> 036a470d76 (GEOMESA-3061 Converters - support bytes in Avro top-level union types (#2762))
=======
=======
>>>>>>> 76618c8da3 (GEOMESA-3061 Converters - support bytes in Avro top-level union types (#2762))
=======
<<<<<<< HEAD
<<<<<<< HEAD
>>>>>>> 72bafaf54b (GEOMESA-3061 Converters - support bytes in Avro top-level union types (#2762))
=======
<<<<<<< HEAD
>>>>>>> 947a867d1c (GEOMESA-3061 Converters - support bytes in Avro top-level union types (#2762))
=======
=======
<<<<<<< HEAD
=======
>>>>>>> locatelli-main
<<<<<<< HEAD
>>>>>>> 72bafaf54b (GEOMESA-3061 Converters - support bytes in Avro top-level union types (#2762))
=======
=======
>>>>>>> locatelli-main
<<<<<<< HEAD
<<<<<<< HEAD
<<<<<<< HEAD
>>>>>>> 947a867d1c (GEOMESA-3061 Converters - support bytes in Avro top-level union types (#2762))
=======
>>>>>>> a910ae135f (GEOMESA-3061 Converters - support bytes in Avro top-level union types (#2762))
=======
>>>>>>> d4c5768cfa (GEOMESA-3061 Converters - support bytes in Avro top-level union types (#2762))
=======
=======
>>>>>>> 7ca1082a3f (GEOMESA-3061 Converters - support bytes in Avro top-level union types (#2762))
=======
>>>>>>> 947a867d1c (GEOMESA-3061 Converters - support bytes in Avro top-level union types (#2762))
=======
>>>>>>> 930f10d338 (GEOMESA-3061 Converters - support bytes in Avro top-level union types (#2762))
=======
>>>>>>> cb5e2daf2b (GEOMESA-3061 Converters - support bytes in Avro top-level union types (#2762))
=======
>>>>>>> 72bafaf54b (GEOMESA-3061 Converters - support bytes in Avro top-level union types (#2762))
=======
>>>>>>> a512d6b917 (GEOMESA-3061 Converters - support bytes in Avro top-level union types (#2762))
=======
>>>>>>> 947a867d1c (GEOMESA-3061 Converters - support bytes in Avro top-level union types (#2762))
=======
>>>>>>> 8111fd4732 (GEOMESA-3061 Converters - support bytes in Avro top-level union types (#2762))
<<<<<<< HEAD
<<<<<<< HEAD
>>>>>>> locatelli-main
=======
>>>>>>> locatelli-main
=======
>>>>>>> locatelli-main
=======

>>>>>>> b9bdd406e (GEOMESA-3061 Converters - support bytes in Avro top-level union types (#2762))
<<<<<<< HEAD
<<<<<<< HEAD
<<<<<<< HEAD
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
>>>>>>> cb5e2daf2b (GEOMESA-3061 Converters - support bytes in Avro top-level union types (#2762))
=======
>>>>>>> 8111fd4732 (GEOMESA-3061 Converters - support bytes in Avro top-level union types (#2762))
<<<<<<< HEAD
<<<<<<< HEAD
>>>>>>> locatelli-main
=======
>>>>>>> locatelli-main
=======
>>>>>>> locatelli-main
>>>>>>> b4320946b4 (GEOMESA-3061 Converters - support bytes in Avro top-level union types (#2762))
<<<<<<< HEAD
>>>>>>> a16b64a4d1 (GEOMESA-3061 Converters - support bytes in Avro top-level union types (#2762))
=======
=======
>>>>>>> 3be8d2a5a4 (Merge branch 'feature/postgis-fixes')
<<<<<<< HEAD
>>>>>>> 34472778d3 (Merge branch 'feature/postgis-fixes')
=======
=======
=======

>>>>>>> b9bdd406e (GEOMESA-3061 Converters - support bytes in Avro top-level union types (#2762))
>>>>>>> d9ed077cd1 (GEOMESA-3061 Converters - support bytes in Avro top-level union types (#2762))
<<<<<<< HEAD
>>>>>>> 810876750d (GEOMESA-3061 Converters - support bytes in Avro top-level union types (#2762))
=======
=======
=======
<<<<<<< HEAD
=======
<<<<<<< HEAD
<<<<<<< HEAD
<<<<<<< HEAD
=======
>>>>>>> f1fe65810a (GEOMESA-3176 Docs - fix download links in install instructions)
=======
>>>>>>> b68ae6197f (GEOMESA-3176 Docs - fix download links in install instructions)
>>>>>>> locatelli-main
=======
>>>>>>> f1fe65810a (GEOMESA-3176 Docs - fix download links in install instructions)
=======
>>>>>>> b68ae6197f (GEOMESA-3176 Docs - fix download links in install instructions)
>>>>>>> locatelli-main
=======
>>>>>>> f1fe65810a (GEOMESA-3176 Docs - fix download links in install instructions)
=======
>>>>>>> b68ae6197f (GEOMESA-3176 Docs - fix download links in install instructions)
>>>>>>> locatelli-main

>>>>>>> b9bdd406e (GEOMESA-3061 Converters - support bytes in Avro top-level union types (#2762))
=======
>>>>>>> 16b2e83f2 (GEOMESA-3176 Docs - fix download links in install instructions)
>>>>>>> 2aa923cc97 (GEOMESA-3176 Docs - fix download links in install instructions)
<<<<<<< HEAD
<<<<<<< HEAD
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
<<<<<<< HEAD
=======
>>>>>>> 23fc8cb805 (GEOMESA-3061 Converters - support bytes in Avro top-level union types (#2762))
<<<<<<< HEAD
<<<<<<< HEAD
>>>>>>> locatelli-main
=======
>>>>>>> locatelli-main
=======
>>>>>>> locatelli-main
>>>>>>> 419e2b9752 (GEOMESA-3176 Docs - fix download links in install instructions)
=======
=======
>>>>>>> c5e1827657 (GEOMESA-3061 Converters - support bytes in Avro top-level union types (#2762))
<<<<<<< HEAD
<<<<<<< HEAD
<<<<<<< HEAD
<<<<<<< HEAD
=======
<<<<<<< HEAD
=======
>>>>>>> locatelli-main
<<<<<<< HEAD
<<<<<<< HEAD
=======
>>>>>>> e0c2527549 (GEOMESA-3061 Converters - support bytes in Avro top-level union types (#2762))
<<<<<<< HEAD
>>>>>>> locatelli-main
=======
>>>>>>> locatelli-main
=======
<<<<<<< HEAD
=======
>>>>>>> e0c2527549 (GEOMESA-3061 Converters - support bytes in Avro top-level union types (#2762))
>>>>>>> locatelli-main
>>>>>>> 269558cf9e (GEOMESA-3061 Converters - support bytes in Avro top-level union types (#2762))
=======
=======
>>>>>>> cdb410251 (GEOMESA-3061 Converters - support bytes in Avro top-level union types (#2762))
>>>>>>> 9d708b240a (GEOMESA-3061 Converters - support bytes in Avro top-level union types (#2762))
<<<<<<< HEAD
<<<<<<< HEAD
<<<<<<< HEAD
=======
<<<<<<< HEAD
<<<<<<< HEAD
<<<<<<< HEAD
=======
>>>>>>> b47097b7bb (GEOMESA-3176 Docs - fix download links in install instructions)
>>>>>>> locatelli-main
=======
<<<<<<< HEAD
=======
>>>>>>> b47097b7bb (GEOMESA-3176 Docs - fix download links in install instructions)
>>>>>>> locatelli-main
=======
>>>>>>> b47097b7bb (GEOMESA-3176 Docs - fix download links in install instructions)
>>>>>>> locatelli-main
>>>>>>> d206a68a13 (GEOMESA-3061 Converters - support bytes in Avro top-level union types (#2762))
=======
=======
=======
>>>>>>> 90ec70f55 (GEOMESA-3176 Docs - fix download links in install instructions)
>>>>>>> 8cbe155de6 (GEOMESA-3176 Docs - fix download links in install instructions)
<<<<<<< HEAD
<<<<<<< HEAD
<<<<<<< HEAD
=======
<<<<<<< HEAD
<<<<<<< HEAD
<<<<<<< HEAD
=======
>>>>>>> 99a32a726d (GEOMESA-3061 Converters - support bytes in Avro top-level union types (#2762))
>>>>>>> locatelli-main
=======
<<<<<<< HEAD
=======
>>>>>>> 99a32a726d (GEOMESA-3061 Converters - support bytes in Avro top-level union types (#2762))
>>>>>>> locatelli-main
=======
>>>>>>> 99a32a726d (GEOMESA-3061 Converters - support bytes in Avro top-level union types (#2762))
>>>>>>> locatelli-main
>>>>>>> 3b4f3da2e1 (GEOMESA-3176 Docs - fix download links in install instructions)
=======
=======
=======
>>>>>>> 6eb31fb65 (GEOMESA-3061 Converters - support bytes in Avro top-level union types (#2762))
>>>>>>> 5f428db977 (GEOMESA-3061 Converters - support bytes in Avro top-level union types (#2762))
<<<<<<< HEAD
<<<<<<< HEAD
<<<<<<< HEAD
=======
<<<<<<< HEAD
<<<<<<< HEAD
<<<<<<< HEAD
=======
>>>>>>> cb5e2daf2b (GEOMESA-3061 Converters - support bytes in Avro top-level union types (#2762))
>>>>>>> locatelli-main
=======
<<<<<<< HEAD
=======
>>>>>>> cb5e2daf2b (GEOMESA-3061 Converters - support bytes in Avro top-level union types (#2762))
>>>>>>> locatelli-main
=======
>>>>>>> cb5e2daf2b (GEOMESA-3061 Converters - support bytes in Avro top-level union types (#2762))
>>>>>>> locatelli-main
>>>>>>> ad7067b815 (GEOMESA-3061 Converters - support bytes in Avro top-level union types (#2762))
=======
=======
>>>>>>> 0e68e9f4c (GEOMESA-3061 Converters - support bytes in Avro top-level union types (#2762))
<<<<<<< HEAD
<<<<<<< HEAD
<<<<<<< HEAD
<<<<<<< HEAD
=======
<<<<<<< HEAD
<<<<<<< HEAD
>>>>>>> locatelli-main
=======
<<<<<<< HEAD
>>>>>>> locatelli-main
=======
>>>>>>> locatelli-main
>>>>>>> 76618c8da3 (GEOMESA-3061 Converters - support bytes in Avro top-level union types (#2762))
<<<<<<< HEAD
>>>>>>> 694bcd3776 (GEOMESA-3061 Converters - support bytes in Avro top-level union types (#2762))
=======
=======
=======
>>>>>>> 15e998504 (GEOMESA-3176 Docs - fix download links in install instructions)
<<<<<<< HEAD
<<<<<<< HEAD
<<<<<<< HEAD
<<<<<<< HEAD
=======
<<<<<<< HEAD
>>>>>>> locatelli-main
=======
>>>>>>> locatelli-main
=======
>>>>>>> locatelli-main
>>>>>>> 0fbf9e83e2 (GEOMESA-3176 Docs - fix download links in install instructions)
<<<<<<< HEAD
>>>>>>> 17c1f8a18c (GEOMESA-3176 Docs - fix download links in install instructions)
=======
=======
=======
>>>>>>> 07a6a5c29 (GEOMESA-3061 Converters - support bytes in Avro top-level union types (#2762))
<<<<<<< HEAD
<<<<<<< HEAD
<<<<<<< HEAD
<<<<<<< HEAD
=======
<<<<<<< HEAD
>>>>>>> locatelli-main
=======
>>>>>>> locatelli-main
=======
>>>>>>> locatelli-main
>>>>>>> 89bdd3013e (GEOMESA-3061 Converters - support bytes in Avro top-level union types (#2762))
<<<<<<< HEAD
>>>>>>> e3976d40bc (GEOMESA-3061 Converters - support bytes in Avro top-level union types (#2762))
=======
=======
=======
>>>>>>> 67b361c85 (GEOMESA-3061 Converters - support bytes in Avro top-level union types (#2762))
<<<<<<< HEAD
<<<<<<< HEAD
<<<<<<< HEAD
<<<<<<< HEAD
=======
<<<<<<< HEAD
>>>>>>> locatelli-main
=======
>>>>>>> locatelli-main
=======
>>>>>>> locatelli-main
>>>>>>> c8a325e13c (GEOMESA-3061 Converters - support bytes in Avro top-level union types (#2762))
<<<<<<< HEAD
>>>>>>> 6cd1151639 (GEOMESA-3061 Converters - support bytes in Avro top-level union types (#2762))
=======
=======
=======
=======
>>>>>>> 90ec70f55 (GEOMESA-3176 Docs - fix download links in install instructions)
>>>>>>> 63db7d154 (GEOMESA-3176 Docs - fix download links in install instructions)
<<<<<<< HEAD
<<<<<<< HEAD
<<<<<<< HEAD
<<<<<<< HEAD
=======
<<<<<<< HEAD
>>>>>>> locatelli-main
=======
>>>>>>> locatelli-main
=======
>>>>>>> locatelli-main
>>>>>>> f9e8439b09 (GEOMESA-3176 Docs - fix download links in install instructions)
<<<<<<< HEAD
>>>>>>> 82d93995e4 (GEOMESA-3176 Docs - fix download links in install instructions)
=======
=======
=======
>>>>>>> 28e2bfa2d (GEOMESA-3061 Converters - support bytes in Avro top-level union types (#2762))
<<<<<<< HEAD
<<<<<<< HEAD
<<<<<<< HEAD
<<<<<<< HEAD
=======
<<<<<<< HEAD
>>>>>>> locatelli-main
=======
>>>>>>> locatelli-main
=======
>>>>>>> locatelli-main
>>>>>>> 72bafaf54b (GEOMESA-3061 Converters - support bytes in Avro top-level union types (#2762))
<<<<<<< HEAD
>>>>>>> 7dfac253b4 (GEOMESA-3061 Converters - support bytes in Avro top-level union types (#2762))
=======
=======
=======
=======

>>>>>>> b9bdd406e (GEOMESA-3061 Converters - support bytes in Avro top-level union types (#2762))
>>>>>>> b4320946b (GEOMESA-3061 Converters - support bytes in Avro top-level union types (#2762))
<<<<<<< HEAD
<<<<<<< HEAD
<<<<<<< HEAD
<<<<<<< HEAD
=======
<<<<<<< HEAD
>>>>>>> locatelli-main
=======
>>>>>>> locatelli-main
=======
>>>>>>> locatelli-main
>>>>>>> 97ec7d864a (GEOMESA-3061 Converters - support bytes in Avro top-level union types (#2762))
<<<<<<< HEAD
>>>>>>> 1973f72e77 (GEOMESA-3061 Converters - support bytes in Avro top-level union types (#2762))
=======
=======
=======
>>>>>>> 3be8d2a5a (Merge branch 'feature/postgis-fixes')
>>>>>>> db8d998aa2 (Merge branch 'feature/postgis-fixes')
<<<<<<< HEAD
>>>>>>> 42e8565e9b (Merge branch 'feature/postgis-fixes')
=======
=======
>>>>>>> d845d7c1bd (GEOMESA-3254 Add Bloop build support)
<<<<<<< HEAD
<<<<<<< HEAD
<<<<<<< HEAD
=======
<<<<<<< HEAD
<<<<<<< HEAD
<<<<<<< HEAD
=======
>>>>>>> 3676d4e56a (GEOMESA-3061 Converters - support bytes in Avro top-level union types (#2762))
>>>>>>> locatelli-main
=======
<<<<<<< HEAD
=======
>>>>>>> 3676d4e56a (GEOMESA-3061 Converters - support bytes in Avro top-level union types (#2762))
>>>>>>> locatelli-main
=======
>>>>>>> 3676d4e56a (GEOMESA-3061 Converters - support bytes in Avro top-level union types (#2762))
>>>>>>> locatelli-main
>>>>>>> f1532f2313 (GEOMESA-3254 Add Bloop build support)
=======
=======
=======

>>>>>>> b9bdd406e (GEOMESA-3061 Converters - support bytes in Avro top-level union types (#2762))
>>>>>>> 6d9a5b626c (GEOMESA-3061 Converters - support bytes in Avro top-level union types (#2762))
<<<<<<< HEAD
<<<<<<< HEAD
<<<<<<< HEAD
=======
<<<<<<< HEAD
<<<<<<< HEAD
<<<<<<< HEAD
=======
>>>>>>> 3f60902092 (GEOMESA-3176 Docs - fix download links in install instructions)
>>>>>>> locatelli-main
=======
<<<<<<< HEAD
=======
>>>>>>> 3f60902092 (GEOMESA-3176 Docs - fix download links in install instructions)
>>>>>>> locatelli-main
=======
>>>>>>> 3f60902092 (GEOMESA-3176 Docs - fix download links in install instructions)
>>>>>>> locatelli-main
>>>>>>> 96d5d442fa (GEOMESA-3061 Converters - support bytes in Avro top-level union types (#2762))
=======
=======
=======

>>>>>>> b9bdd406e (GEOMESA-3061 Converters - support bytes in Avro top-level union types (#2762))
=======
>>>>>>> 16b2e83f2 (GEOMESA-3176 Docs - fix download links in install instructions)
>>>>>>> 10ade3dcd1 (GEOMESA-3176 Docs - fix download links in install instructions)
<<<<<<< HEAD
<<<<<<< HEAD
<<<<<<< HEAD
=======
<<<<<<< HEAD
<<<<<<< HEAD
<<<<<<< HEAD
=======
>>>>>>> 8111fd4732 (GEOMESA-3061 Converters - support bytes in Avro top-level union types (#2762))
>>>>>>> locatelli-main
=======
<<<<<<< HEAD
=======
>>>>>>> 8111fd4732 (GEOMESA-3061 Converters - support bytes in Avro top-level union types (#2762))
>>>>>>> locatelli-main
=======
>>>>>>> 8111fd4732 (GEOMESA-3061 Converters - support bytes in Avro top-level union types (#2762))
>>>>>>> locatelli-main
>>>>>>> 86bc039842 (GEOMESA-3176 Docs - fix download links in install instructions)
=======
=======
>>>>>>> f71fa3c0e (GEOMESA-3061 Converters - support bytes in Avro top-level union types (#2762))
>>>>>>> 947a867d1c (GEOMESA-3061 Converters - support bytes in Avro top-level union types (#2762))
<<<<<<< HEAD
<<<<<<< HEAD
<<<<<<< HEAD
=======
<<<<<<< HEAD
<<<<<<< HEAD
<<<<<<< HEAD
=======
>>>>>>> 60b4637548 (GEOMESA-3061 Converters - support bytes in Avro top-level union types (#2762))
>>>>>>> locatelli-main
=======
<<<<<<< HEAD
=======
>>>>>>> 60b4637548 (GEOMESA-3061 Converters - support bytes in Avro top-level union types (#2762))
>>>>>>> locatelli-main
=======
>>>>>>> 60b4637548 (GEOMESA-3061 Converters - support bytes in Avro top-level union types (#2762))
>>>>>>> locatelli-main
>>>>>>> 6150564577 (GEOMESA-3061 Converters - support bytes in Avro top-level union types (#2762))
=======
=======
>>>>>>> cdb410251 (GEOMESA-3061 Converters - support bytes in Avro top-level union types (#2762))
>>>>>>> e6e1f4bdd5 (GEOMESA-3061 Converters - support bytes in Avro top-level union types (#2762))
<<<<<<< HEAD
<<<<<<< HEAD
<<<<<<< HEAD
=======
<<<<<<< HEAD
<<<<<<< HEAD
<<<<<<< HEAD
=======
>>>>>>> 5fa9f37061 (GEOMESA-3176 Docs - fix download links in install instructions)
>>>>>>> locatelli-main
=======
<<<<<<< HEAD
=======
>>>>>>> 5fa9f37061 (GEOMESA-3176 Docs - fix download links in install instructions)
>>>>>>> locatelli-main
=======
>>>>>>> 5fa9f37061 (GEOMESA-3176 Docs - fix download links in install instructions)
>>>>>>> locatelli-main
>>>>>>> 5dcf23da52 (GEOMESA-3061 Converters - support bytes in Avro top-level union types (#2762))
=======
=======
=======
>>>>>>> 90ec70f55 (GEOMESA-3176 Docs - fix download links in install instructions)
>>>>>>> 279de44d3f (GEOMESA-3176 Docs - fix download links in install instructions)
<<<<<<< HEAD
<<<<<<< HEAD
<<<<<<< HEAD
=======
<<<<<<< HEAD
<<<<<<< HEAD
<<<<<<< HEAD
=======
>>>>>>> b2177e9015 (GEOMESA-3061 Converters - support bytes in Avro top-level union types (#2762))
>>>>>>> locatelli-main
=======
<<<<<<< HEAD
=======
>>>>>>> b2177e9015 (GEOMESA-3061 Converters - support bytes in Avro top-level union types (#2762))
>>>>>>> locatelli-main
=======
>>>>>>> b2177e9015 (GEOMESA-3061 Converters - support bytes in Avro top-level union types (#2762))
>>>>>>> locatelli-main
>>>>>>> 449fb2085b (GEOMESA-3176 Docs - fix download links in install instructions)
=======
=======
=======
>>>>>>> 6eb31fb65 (GEOMESA-3061 Converters - support bytes in Avro top-level union types (#2762))
>>>>>>> 23c0241798 (GEOMESA-3061 Converters - support bytes in Avro top-level union types (#2762))
>>>>>>> 9d1506029d (GEOMESA-3061 Converters - support bytes in Avro top-level union types (#2762))
<<<<<<< HEAD
<<<<<<< HEAD
=======
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
>>>>>>> 92674ff9d4 (GEOMESA-3061 Converters - support bytes in Avro top-level union types (#2762))
=======
>>>>>>> bc622ff59f (GEOMESA-3176 Docs - fix download links in install instructions)
<<<<<<< HEAD
<<<<<<< HEAD
=======
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
>>>>>>> 7ec7e43c91 (GEOMESA-3061 Converters - support bytes in Avro top-level union types (#2762))
=======
>>>>>>> 9a4dff9e4f (GEOMESA-3061 Converters - support bytes in Avro top-level union types (#2762))
<<<<<<< HEAD
<<<<<<< HEAD
=======
<<<<<<< HEAD
<<<<<<< HEAD
<<<<<<< HEAD
=======
>>>>>>> 057f644239 (GEOMESA-3176 Docs - fix download links in install instructions)
>>>>>>> locatelli-main
=======
<<<<<<< HEAD
=======
>>>>>>> 057f644239 (GEOMESA-3176 Docs - fix download links in install instructions)
>>>>>>> locatelli-main
=======
>>>>>>> 057f644239 (GEOMESA-3176 Docs - fix download links in install instructions)
>>>>>>> locatelli-main
=======
=======
>>>>>>> a12ea194c8 (GEOMESA-3176 Docs - fix download links in install instructions)
>>>>>>> 1cc4dadf2e (GEOMESA-3176 Docs - fix download links in install instructions)
<<<<<<< HEAD
<<<<<<< HEAD
=======
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
>>>>>>> 2586fa6a40 (GEOMESA-3061 Converters - support bytes in Avro top-level union types (#2762))
=======
=======
>>>>>>> bdbced26d4 (GEOMESA-3061 Converters - support bytes in Avro top-level union types (#2762))
>>>>>>> 0fc6650ecf (GEOMESA-3061 Converters - support bytes in Avro top-level union types (#2762))
<<<<<<< HEAD
<<<<<<< HEAD
=======
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
>>>>>>> 67de3c3202 (Merge branch 'feature/postgis-fixes')
=======
=======
>>>>>>> 87bf55340 (GEOMESA-3061 Converters - support bytes in Avro top-level union types (#2762))
<<<<<<< HEAD
<<<<<<< HEAD
<<<<<<< HEAD
<<<<<<< HEAD
=======
<<<<<<< HEAD
<<<<<<< HEAD
>>>>>>> locatelli-main
=======
<<<<<<< HEAD
>>>>>>> locatelli-main
=======
>>>>>>> locatelli-main
>>>>>>> 0dbede148d (GEOMESA-3061 Converters - support bytes in Avro top-level union types (#2762))
<<<<<<< HEAD
>>>>>>> 1bb69524c2 (GEOMESA-3061 Converters - support bytes in Avro top-level union types (#2762))
=======
=======
=======
=======
>>>>>>> e847488d8 (GEOMESA-3061 Converters - support bytes in Avro top-level union types (#2762))
=======
<<<<<<< HEAD
<<<<<<< HEAD
>>>>>>> 6eb31fb65 (GEOMESA-3061 Converters - support bytes in Avro top-level union types (#2762))
=======
<<<<<<< HEAD
<<<<<<< HEAD
=======
<<<<<<< HEAD
=======
>>>>>>> locatelli-main
<<<<<<< HEAD
>>>>>>> 6eb31fb65 (GEOMESA-3061 Converters - support bytes in Avro top-level union types (#2762))
=======
<<<<<<< HEAD
=======
>>>>>>> locatelli-main
<<<<<<< HEAD
<<<<<<< HEAD
=======
>>>>>>> 14cf946af4 (GEOMESA-3061 Converters - support bytes in Avro top-level union types (#2762))
<<<<<<< HEAD
<<<<<<< HEAD
>>>>>>> locatelli-main
=======
>>>>>>> locatelli-main
=======
>>>>>>> locatelli-main
>>>>>>> 15e998504 (GEOMESA-3176 Docs - fix download links in install instructions)
=======
>>>>>>> 07a6a5c29 (GEOMESA-3061 Converters - support bytes in Avro top-level union types (#2762))
=======
>>>>>>> 67b361c85 (GEOMESA-3061 Converters - support bytes in Avro top-level union types (#2762))
=======
<<<<<<< HEAD
<<<<<<< HEAD
=======
<<<<<<< HEAD
<<<<<<< HEAD
<<<<<<< HEAD
=======
>>>>>>> e4f52faffa (GEOMESA-3176 Docs - fix download links in install instructions)
>>>>>>> locatelli-main
=======
<<<<<<< HEAD
=======
>>>>>>> e4f52faffa (GEOMESA-3176 Docs - fix download links in install instructions)
>>>>>>> locatelli-main
=======
>>>>>>> e4f52faffa (GEOMESA-3176 Docs - fix download links in install instructions)
>>>>>>> locatelli-main
=======
>>>>>>> 90ec70f55 (GEOMESA-3176 Docs - fix download links in install instructions)
>>>>>>> 63db7d154 (GEOMESA-3176 Docs - fix download links in install instructions)
=======
<<<<<<< HEAD
<<<<<<< HEAD
=======
<<<<<<< HEAD
<<<<<<< HEAD
<<<<<<< HEAD
=======
>>>>>>> 14cf946af4 (GEOMESA-3061 Converters - support bytes in Avro top-level union types (#2762))
>>>>>>> locatelli-main
=======
<<<<<<< HEAD
=======
>>>>>>> 14cf946af4 (GEOMESA-3061 Converters - support bytes in Avro top-level union types (#2762))
>>>>>>> locatelli-main
=======
>>>>>>> 14cf946af4 (GEOMESA-3061 Converters - support bytes in Avro top-level union types (#2762))
>>>>>>> locatelli-main
=======
>>>>>>> 28e2bfa2d (GEOMESA-3061 Converters - support bytes in Avro top-level union types (#2762))

>>>>>>> b9bdd406e (GEOMESA-3061 Converters - support bytes in Avro top-level union types (#2762))
=======
>>>>>>> 16b2e83f2 (GEOMESA-3176 Docs - fix download links in install instructions)
<<<<<<< HEAD
<<<<<<< HEAD
<<<<<<< HEAD
<<<<<<< HEAD
<<<<<<< HEAD
<<<<<<< HEAD
>>>>>>> 7813a31aa (GEOMESA-3176 Docs - fix download links in install instructions)
<<<<<<< HEAD
>>>>>>> 71c56e6b77 (GEOMESA-3176 Docs - fix download links in install instructions)
<<<<<<< HEAD
>>>>>>> e007dde981 (GEOMESA-3176 Docs - fix download links in install instructions)
=======
=======
=======
=======
=======
>>>>>>> baa90e85a (GEOMESA-3176 Docs - fix download links in install instructions)
=======
>>>>>>> 4524373ac (GEOMESA-3061 Converters - support bytes in Avro top-level union types (#2762))
=======
>>>>>>> 46c05fed5 (GEOMESA-3176 Docs - fix download links in install instructions)
=======
>>>>>>> 4fbe39c62 (GEOMESA-3061 Converters - support bytes in Avro top-level union types (#2762))
<<<<<<< HEAD
=======
>>>>>>> 6eb31fb65 (GEOMESA-3061 Converters - support bytes in Avro top-level union types (#2762))
>>>>>>> 3dd99aed4 (GEOMESA-3061 Converters - support bytes in Avro top-level union types (#2762))
=======
>>>>>>> 07a6a5c29 (GEOMESA-3061 Converters - support bytes in Avro top-level union types (#2762))
=======
>>>>>>> 63db7d154 (GEOMESA-3176 Docs - fix download links in install instructions)
=======
=======
>>>>>>> 6eb31fb65 (GEOMESA-3061 Converters - support bytes in Avro top-level union types (#2762))
>>>>>>> 28e2bfa2d (GEOMESA-3061 Converters - support bytes in Avro top-level union types (#2762))
=======
=======
<<<<<<< HEAD
<<<<<<< HEAD
<<<<<<< HEAD
=======
<<<<<<< HEAD
=======
>>>>>>> locatelli-main
=======
>>>>>>> locatelli-main
>>>>>>> 62a28bf2e7 (GEOMESA-3061 Converters - support bytes in Avro top-level union types (#2762))
=======
=======
>>>>>>> 14cf946af4 (GEOMESA-3061 Converters - support bytes in Avro top-level union types (#2762))
<<<<<<< HEAD
<<<<<<< HEAD
>>>>>>> locatelli-main
=======
>>>>>>> locatelli-main
=======
>>>>>>> locatelli-main

>>>>>>> b9bdd406e (GEOMESA-3061 Converters - support bytes in Avro top-level union types (#2762))
>>>>>>> f71fa3c0e (GEOMESA-3061 Converters - support bytes in Avro top-level union types (#2762))
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
>>>>>>> 14cf946af4 (GEOMESA-3061 Converters - support bytes in Avro top-level union types (#2762))
>>>>>>> locatelli-main
=======
<<<<<<< HEAD
=======
>>>>>>> 14cf946af4 (GEOMESA-3061 Converters - support bytes in Avro top-level union types (#2762))
>>>>>>> locatelli-main
=======
>>>>>>> 14cf946af4 (GEOMESA-3061 Converters - support bytes in Avro top-level union types (#2762))
>>>>>>> locatelli-main
>>>>>>> e847488d8 (GEOMESA-3061 Converters - support bytes in Avro top-level union types (#2762))
<<<<<<< HEAD
>>>>>>> e27137ff78 (GEOMESA-3061 Converters - support bytes in Avro top-level union types (#2762))
<<<<<<< HEAD
>>>>>>> 66c2e4df7e (GEOMESA-3061 Converters - support bytes in Avro top-level union types (#2762))
=======
=======
=======
=======
>>>>>>> 4fbe39c62 (GEOMESA-3061 Converters - support bytes in Avro top-level union types (#2762))
<<<<<<< HEAD
=======
>>>>>>> 67b361c85 (GEOMESA-3061 Converters - support bytes in Avro top-level union types (#2762))
>>>>>>> dace2085b (GEOMESA-3061 Converters - support bytes in Avro top-level union types (#2762))
=======
<<<<<<< HEAD
<<<<<<< HEAD
>>>>>>> 4524373ac (GEOMESA-3061 Converters - support bytes in Avro top-level union types (#2762))
=======
<<<<<<< HEAD
>>>>>>> 3dd99aed4 (GEOMESA-3061 Converters - support bytes in Avro top-level union types (#2762))
=======
>>>>>>> 240977229 (GEOMESA-3061 Converters - support bytes in Avro top-level union types (#2762))
<<<<<<< HEAD
>>>>>>> 22dcc8170f (GEOMESA-3061 Converters - support bytes in Avro top-level union types (#2762))
<<<<<<< HEAD
>>>>>>> 8c9ca1211a (GEOMESA-3061 Converters - support bytes in Avro top-level union types (#2762))
=======
=======
=======
<<<<<<< HEAD
=======
>>>>>>> 28e2bfa2d (GEOMESA-3061 Converters - support bytes in Avro top-level union types (#2762))
=======
>>>>>>> 4fbe39c62 (GEOMESA-3061 Converters - support bytes in Avro top-level union types (#2762))
=======
=======
>>>>>>> 5f807ff388 (GEOMESA-3061 Converters - support bytes in Avro top-level union types (#2762))
=======

>>>>>>> b9bdd406e (GEOMESA-3061 Converters - support bytes in Avro top-level union types (#2762))
>>>>>>> cdb410251 (GEOMESA-3061 Converters - support bytes in Avro top-level union types (#2762))
<<<<<<< HEAD
<<<<<<< HEAD
<<<<<<< HEAD
>>>>>>> dace2085b (GEOMESA-3061 Converters - support bytes in Avro top-level union types (#2762))
=======
<<<<<<< HEAD
>>>>>>> 46c05fed5 (GEOMESA-3176 Docs - fix download links in install instructions)
=======
>>>>>>> 90ec70f55 (GEOMESA-3176 Docs - fix download links in install instructions)
<<<<<<< HEAD
>>>>>>> 6a26990f7 (GEOMESA-3176 Docs - fix download links in install instructions)
<<<<<<< HEAD
>>>>>>> 0b36b46b5f (GEOMESA-3176 Docs - fix download links in install instructions)
<<<<<<< HEAD
>>>>>>> 760781f8dd (GEOMESA-3176 Docs - fix download links in install instructions)
=======
=======
=======
=======
>>>>>>> 6eb31fb65 (GEOMESA-3061 Converters - support bytes in Avro top-level union types (#2762))
<<<<<<< HEAD
<<<<<<< HEAD
>>>>>>> 3dd99aed4 (GEOMESA-3061 Converters - support bytes in Avro top-level union types (#2762))
<<<<<<< HEAD
>>>>>>> dddc42e265 (GEOMESA-3061 Converters - support bytes in Avro top-level union types (#2762))
<<<<<<< HEAD
>>>>>>> f7f4f4a836 (GEOMESA-3061 Converters - support bytes in Avro top-level union types (#2762))
=======
=======
=======
=======
>>>>>>> 4fbe39c62 (GEOMESA-3061 Converters - support bytes in Avro top-level union types (#2762))
=======
=======

>>>>>>> b9bdd406e (GEOMESA-3061 Converters - support bytes in Avro top-level union types (#2762))
>>>>>>> 0e68e9f4c (GEOMESA-3061 Converters - support bytes in Avro top-level union types (#2762))
<<<<<<< HEAD
<<<<<<< HEAD
<<<<<<< HEAD
<<<<<<< HEAD
=======
<<<<<<< HEAD
<<<<<<< HEAD
>>>>>>> locatelli-main
=======
<<<<<<< HEAD
>>>>>>> locatelli-main
=======
>>>>>>> locatelli-main
>>>>>>> 45ad5d11f (GEOMESA-3061 Converters - support bytes in Avro top-level union types (#2762))
<<<<<<< HEAD
>>>>>>> b009fd23f4 (GEOMESA-3061 Converters - support bytes in Avro top-level union types (#2762))
<<<<<<< HEAD
>>>>>>> a22efb4d66 (GEOMESA-3061 Converters - support bytes in Avro top-level union types (#2762))
=======
=======
=======
<<<<<<< HEAD
<<<<<<< HEAD
<<<<<<< HEAD
=======
>>>>>>> 15e998504 (GEOMESA-3176 Docs - fix download links in install instructions)
<<<<<<< HEAD
=======
<<<<<<< HEAD
=======
>>>>>>> locatelli-main
=======
>>>>>>> locatelli-main
>>>>>>> 76618c8da3 (GEOMESA-3061 Converters - support bytes in Avro top-level union types (#2762))
>>>>>>> 4431c091e2 (GEOMESA-3176 Docs - fix download links in install instructions)
=======
=======
>>>>>>> 15e998504 (GEOMESA-3176 Docs - fix download links in install instructions)
<<<<<<< HEAD
<<<<<<< HEAD
<<<<<<< HEAD
<<<<<<< HEAD
>>>>>>> locatelli-main
=======
>>>>>>> locatelli-main
=======
>>>>>>> locatelli-main
>>>>>>> baa90e85a (GEOMESA-3176 Docs - fix download links in install instructions)
<<<<<<< HEAD
>>>>>>> d969b4c2d5 (GEOMESA-3176 Docs - fix download links in install instructions)
<<<<<<< HEAD
>>>>>>> a0befba4ce (GEOMESA-3176 Docs - fix download links in install instructions)
=======
=======
=======
=======
>>>>>>> 07a6a5c29 (GEOMESA-3061 Converters - support bytes in Avro top-level union types (#2762))
<<<<<<< HEAD
>>>>>>> 4524373ac (GEOMESA-3061 Converters - support bytes in Avro top-level union types (#2762))
<<<<<<< HEAD
>>>>>>> 4564a1634e (GEOMESA-3061 Converters - support bytes in Avro top-level union types (#2762))
<<<<<<< HEAD
>>>>>>> df644ff83d (GEOMESA-3061 Converters - support bytes in Avro top-level union types (#2762))
=======
=======
=======
=======
>>>>>>> 67b361c85 (GEOMESA-3061 Converters - support bytes in Avro top-level union types (#2762))
<<<<<<< HEAD
>>>>>>> dace2085b (GEOMESA-3061 Converters - support bytes in Avro top-level union types (#2762))
<<<<<<< HEAD
>>>>>>> 238945d4b3 (GEOMESA-3061 Converters - support bytes in Avro top-level union types (#2762))
<<<<<<< HEAD
>>>>>>> 1cad375176 (GEOMESA-3061 Converters - support bytes in Avro top-level union types (#2762))
=======
=======
=======
=======
=======
>>>>>>> 90ec70f55 (GEOMESA-3176 Docs - fix download links in install instructions)
>>>>>>> 63db7d154 (GEOMESA-3176 Docs - fix download links in install instructions)
<<<<<<< HEAD
<<<<<<< HEAD
<<<<<<< HEAD
<<<<<<< HEAD
=======
<<<<<<< HEAD
>>>>>>> locatelli-main
=======
>>>>>>> locatelli-main
=======
>>>>>>> locatelli-main
>>>>>>> 46c05fed5 (GEOMESA-3176 Docs - fix download links in install instructions)
<<<<<<< HEAD
>>>>>>> f73ef99f1e (GEOMESA-3176 Docs - fix download links in install instructions)
<<<<<<< HEAD
>>>>>>> bcf78618df (GEOMESA-3176 Docs - fix download links in install instructions)
=======
=======
=======
=======
>>>>>>> 28e2bfa2d (GEOMESA-3061 Converters - support bytes in Avro top-level union types (#2762))
>>>>>>> 4fbe39c62 (GEOMESA-3061 Converters - support bytes in Avro top-level union types (#2762))
>>>>>>> be05354746 (GEOMESA-3061 Converters - support bytes in Avro top-level union types (#2762))
>>>>>>> 31f6953312 (GEOMESA-3061 Converters - support bytes in Avro top-level union types (#2762))
=======
>>>>>>> bc4062951d (GEOMESA-3061 Converters - support bytes in Avro top-level union types (#2762))
>>>>>>> 1e39c0c27d (GEOMESA-3061 Converters - support bytes in Avro top-level union types (#2762))
<<<<<<< HEAD
<<<<<<< HEAD
=======
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
>>>>>>> e944f1c88b (Merge branch 'feature/postgis-fixes')
>>>>>>> 638b68d081 (Merge branch 'feature/postgis-fixes')
=======
<<<<<<< HEAD
<<<<<<< HEAD
=======
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
>>>>>>> 7b2b25cc3c (GEOMESA-3176 Docs - fix download links in install instructions)
>>>>>>> 81ee66102b (GEOMESA-3061 Converters - support bytes in Avro top-level union types (#2762))
<<<<<<< HEAD
>>>>>>> 8adfab65bb (GEOMESA-3061 Converters - support bytes in Avro top-level union types (#2762))
<<<<<<< HEAD
>>>>>>> a1f15598cb (GEOMESA-3061 Converters - support bytes in Avro top-level union types (#2762))
=======
=======
=======
=======
=======
=======
>>>>>>> 1d03325c29 (GEOMESA-3061 Converters - support bytes in Avro top-level union types (#2762))
<<<<<<< HEAD
<<<<<<< HEAD
=======
<<<<<<< HEAD
<<<<<<< HEAD
<<<<<<< HEAD
=======
>>>>>>> dcbf9c4320 (GEOMESA-3061 Converters - support bytes in Avro top-level union types (#2762))
>>>>>>> locatelli-main
=======
<<<<<<< HEAD
=======
>>>>>>> dcbf9c4320 (GEOMESA-3061 Converters - support bytes in Avro top-level union types (#2762))
>>>>>>> locatelli-main
=======
>>>>>>> dcbf9c4320 (GEOMESA-3061 Converters - support bytes in Avro top-level union types (#2762))
>>>>>>> locatelli-main
=======
>>>>>>> 6eb31fb65 (GEOMESA-3061 Converters - support bytes in Avro top-level union types (#2762))
=======
>>>>>>> 6fc8851879 (GEOMESA-3061 Converters - support bytes in Avro top-level union types (#2762))
<<<<<<< HEAD
<<<<<<< HEAD
=======
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
>>>>>>> 15e998504 (GEOMESA-3176 Docs - fix download links in install instructions)
=======
<<<<<<< HEAD
<<<<<<< HEAD
<<<<<<< HEAD
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
<<<<<<< HEAD
=======
>>>>>>> 992ed6b1bf (GEOMESA-3061 Converters - support bytes in Avro top-level union types (#2762))
<<<<<<< HEAD
<<<<<<< HEAD
>>>>>>> locatelli-main
=======
>>>>>>> locatelli-main
=======
>>>>>>> locatelli-main
>>>>>>> 3995e6a61c (GEOMESA-3176 Docs - fix download links in install instructions)
=======
>>>>>>> 07a6a5c29 (GEOMESA-3061 Converters - support bytes in Avro top-level union types (#2762))
=======
>>>>>>> 6514df9383 (GEOMESA-3061 Converters - support bytes in Avro top-level union types (#2762))
<<<<<<< HEAD
<<<<<<< HEAD
<<<<<<< HEAD
=======
=======
>>>>>>> locatelli-main
=======
>>>>>>> locatelli-main
=======
=======
>>>>>>> 15e998504 (GEOMESA-3176 Docs - fix download links in install instructions)
=======
<<<<<<< HEAD
>>>>>>> 3995e6a61c (GEOMESA-3176 Docs - fix download links in install instructions)
<<<<<<< HEAD
>>>>>>> 84e5c6b001 (GEOMESA-3176 Docs - fix download links in install instructions)
=======
=======
>>>>>>> 07a6a5c29 (GEOMESA-3061 Converters - support bytes in Avro top-level union types (#2762))
=======
>>>>>>> 6514df9383 (GEOMESA-3061 Converters - support bytes in Avro top-level union types (#2762))
>>>>>>> ce19d9c8bd (GEOMESA-3061 Converters - support bytes in Avro top-level union types (#2762))
<<<<<<< HEAD
<<<<<<< HEAD
>>>>>>> locatelli-main
=======
>>>>>>> locatelli-main
=======
>>>>>>> locatelli-main

>>>>>>> b9bdd406e (GEOMESA-3061 Converters - support bytes in Avro top-level union types (#2762))
=======
>>>>>>> 16b2e83f2 (GEOMESA-3176 Docs - fix download links in install instructions)
<<<<<<< HEAD
<<<<<<< HEAD
<<<<<<< HEAD
<<<<<<< HEAD
<<<<<<< HEAD
<<<<<<< HEAD
=======
<<<<<<< HEAD
<<<<<<< HEAD
=======
>>>>>>> locatelli-main
<<<<<<< HEAD
=======
>>>>>>> 84e5c6b001 (GEOMESA-3176 Docs - fix download links in install instructions)
=======
>>>>>>> ce19d9c8bd (GEOMESA-3061 Converters - support bytes in Avro top-level union types (#2762))
<<<<<<< HEAD
>>>>>>> locatelli-main
=======
>>>>>>> locatelli-main
=======
>>>>>>> 84e5c6b001 (GEOMESA-3176 Docs - fix download links in install instructions)
=======
>>>>>>> ce19d9c8bd (GEOMESA-3061 Converters - support bytes in Avro top-level union types (#2762))
>>>>>>> locatelli-main
>>>>>>> 2aa923cc9 (GEOMESA-3176 Docs - fix download links in install instructions)
<<<<<<< HEAD
>>>>>>> bdcaf0ab5e (GEOMESA-3176 Docs - fix download links in install instructions)
<<<<<<< HEAD
>>>>>>> 235bc2820d (GEOMESA-3176 Docs - fix download links in install instructions)
<<<<<<< HEAD
>>>>>>> 7b2b25cc3c (GEOMESA-3176 Docs - fix download links in install instructions)
=======
=======
=======
=======
=======
=======
>>>>>>> 0fbf9e83e (GEOMESA-3176 Docs - fix download links in install instructions)
=======
>>>>>>> 89bdd3013 (GEOMESA-3061 Converters - support bytes in Avro top-level union types (#2762))
<<<<<<< HEAD
=======
<<<<<<< HEAD
<<<<<<< HEAD
<<<<<<< HEAD
=======
=======
>>>>>>> locatelli-main
=======
>>>>>>> locatelli-main
>>>>>>> 89bdd3013 (GEOMESA-3061 Converters - support bytes in Avro top-level union types (#2762))
=======
>>>>>>> 84e5c6b001 (GEOMESA-3176 Docs - fix download links in install instructions)
<<<<<<< HEAD
=======
<<<<<<< HEAD
<<<<<<< HEAD
>>>>>>> locatelli-main
=======
>>>>>>> locatelli-main
=======
>>>>>>> locatelli-main
>>>>>>> 6eb31fb65 (GEOMESA-3061 Converters - support bytes in Avro top-level union types (#2762))
>>>>>>> 5f428db97 (GEOMESA-3061 Converters - support bytes in Avro top-level union types (#2762))
=======
>>>>>>> 07a6a5c29 (GEOMESA-3061 Converters - support bytes in Avro top-level union types (#2762))
=======
<<<<<<< HEAD
<<<<<<< HEAD
<<<<<<< HEAD
>>>>>>> 63db7d154 (GEOMESA-3176 Docs - fix download links in install instructions)
=======
=======
<<<<<<< HEAD
=======
>>>>>>> locatelli-main
<<<<<<< HEAD
=======
>>>>>>> locatelli-main
=======
>>>>>>> 63db7d154a (GEOMESA-3176 Docs - fix download links in install instructions)
=======
>>>>>>> 42adcd38ba (GEOMESA-3176 Docs - fix download links in install instructions)
=======
>>>>>>> ce19d9c8bd (GEOMESA-3061 Converters - support bytes in Avro top-level union types (#2762))
=======
>>>>>>> 63db7d154 (GEOMESA-3176 Docs - fix download links in install instructions)
=======
>>>>>>> d7ba054c6c (GEOMESA-3176 Docs - fix download links in install instructions)
<<<<<<< HEAD
<<<<<<< HEAD
>>>>>>> locatelli-main
=======
>>>>>>> locatelli-main
=======
>>>>>>> locatelli-main
=======
>>>>>>> 6eb31fb65 (GEOMESA-3061 Converters - support bytes in Avro top-level union types (#2762))
>>>>>>> 28e2bfa2d (GEOMESA-3061 Converters - support bytes in Avro top-level union types (#2762))
=======
=======

>>>>>>> b9bdd406e (GEOMESA-3061 Converters - support bytes in Avro top-level union types (#2762))
>>>>>>> f71fa3c0e (GEOMESA-3061 Converters - support bytes in Avro top-level union types (#2762))
<<<<<<< HEAD
<<<<<<< HEAD
<<<<<<< HEAD
<<<<<<< HEAD
<<<<<<< HEAD
<<<<<<< HEAD
=======
<<<<<<< HEAD
<<<<<<< HEAD
=======
>>>>>>> locatelli-main
<<<<<<< HEAD
=======
=======
>>>>>>> locatelli-main
>>>>>>> ce19d9c8bd (GEOMESA-3061 Converters - support bytes in Avro top-level union types (#2762))
=======
>>>>>>> 51ac295632 (GEOMESA-3061 Converters - support bytes in Avro top-level union types (#2762))
=======
>>>>>>> b488e79fc5 (GEOMESA-3061 Converters - support bytes in Avro top-level union types (#2762))
<<<<<<< HEAD
<<<<<<< HEAD
>>>>>>> locatelli-main
=======
>>>>>>> locatelli-main
=======
>>>>>>> locatelli-main
>>>>>>> c5e182765 (GEOMESA-3061 Converters - support bytes in Avro top-level union types (#2762))
<<<<<<< HEAD
>>>>>>> f9f6fde40b (GEOMESA-3061 Converters - support bytes in Avro top-level union types (#2762))
<<<<<<< HEAD
>>>>>>> 4a05f27ba4 (GEOMESA-3061 Converters - support bytes in Avro top-level union types (#2762))
<<<<<<< HEAD
>>>>>>> 1d03325c29 (GEOMESA-3061 Converters - support bytes in Avro top-level union types (#2762))
=======
=======
=======
=======
<<<<<<< HEAD
>>>>>>> 89bdd3013 (GEOMESA-3061 Converters - support bytes in Avro top-level union types (#2762))
=======
<<<<<<< HEAD
>>>>>>> 5f428db97 (GEOMESA-3061 Converters - support bytes in Avro top-level union types (#2762))
=======
>>>>>>> 9d708b240 (GEOMESA-3061 Converters - support bytes in Avro top-level union types (#2762))
<<<<<<< HEAD
>>>>>>> 53a3e72cbf (GEOMESA-3061 Converters - support bytes in Avro top-level union types (#2762))
<<<<<<< HEAD
>>>>>>> 7b0539b808 (GEOMESA-3061 Converters - support bytes in Avro top-level union types (#2762))
<<<<<<< HEAD
>>>>>>> 963feec660 (GEOMESA-3061 Converters - support bytes in Avro top-level union types (#2762))
=======
=======
=======
=======
=======
=======
>>>>>>> 86dd18aa73 (GEOMESA-3061 Converters - support bytes in Avro top-level union types (#2762))
<<<<<<< HEAD
=======
>>>>>>> 67b361c85 (GEOMESA-3061 Converters - support bytes in Avro top-level union types (#2762))
=======
>>>>>>> 28e2bfa2d (GEOMESA-3061 Converters - support bytes in Avro top-level union types (#2762))
=======
<<<<<<< HEAD
<<<<<<< HEAD
<<<<<<< HEAD
=======
=======
>>>>>>> locatelli-main
=======
>>>>>>> locatelli-main
>>>>>>> 5f807ff388 (GEOMESA-3061 Converters - support bytes in Avro top-level union types (#2762))
=======
>>>>>>> b03141c1bb (GEOMESA-3061 Converters - support bytes in Avro top-level union types (#2762))
=======
>>>>>>> 32234db855 (GEOMESA-3061 Converters - support bytes in Avro top-level union types (#2762))
=======
=======
>>>>>>> 67b361c85 (GEOMESA-3061 Converters - support bytes in Avro top-level union types (#2762))
>>>>>>> cec40638c2 (GEOMESA-3061 Converters - support bytes in Avro top-level union types (#2762))
=======
=======
>>>>>>> 86dd18aa73 (GEOMESA-3061 Converters - support bytes in Avro top-level union types (#2762))
<<<<<<< HEAD
<<<<<<< HEAD
>>>>>>> locatelli-main
=======
>>>>>>> locatelli-main
=======
>>>>>>> locatelli-main
=======

>>>>>>> b9bdd406e (GEOMESA-3061 Converters - support bytes in Avro top-level union types (#2762))
>>>>>>> cdb410251 (GEOMESA-3061 Converters - support bytes in Avro top-level union types (#2762))
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
<<<<<<< HEAD
<<<<<<< HEAD
<<<<<<< HEAD
>>>>>>> locatelli-main
=======
<<<<<<< HEAD
<<<<<<< HEAD
>>>>>>> locatelli-main
>>>>>>> cec40638c2 (GEOMESA-3061 Converters - support bytes in Avro top-level union types (#2762))
=======
<<<<<<< HEAD
>>>>>>> f2943650ff (GEOMESA-3176 Docs - fix download links in install instructions)
=======
<<<<<<< HEAD
<<<<<<< HEAD
<<<<<<< HEAD
>>>>>>> 90ec70f55 (GEOMESA-3176 Docs - fix download links in install instructions)
<<<<<<< HEAD
=======
=======
>>>>>>> locatelli-main
=======
>>>>>>> locatelli-main
>>>>>>> cec40638c2 (GEOMESA-3061 Converters - support bytes in Avro top-level union types (#2762))
=======
>>>>>>> f2943650ff (GEOMESA-3176 Docs - fix download links in install instructions)
=======
>>>>>>> 90ec70f55 (GEOMESA-3176 Docs - fix download links in install instructions)
<<<<<<< HEAD
<<<<<<< HEAD
<<<<<<< HEAD
<<<<<<< HEAD
>>>>>>> locatelli-main
=======
>>>>>>> locatelli-main
=======
>>>>>>> locatelli-main
>>>>>>> 8cbe155de (GEOMESA-3176 Docs - fix download links in install instructions)
<<<<<<< HEAD
>>>>>>> 8150bc0e65 (GEOMESA-3176 Docs - fix download links in install instructions)
<<<<<<< HEAD
>>>>>>> 256a642cc1 (GEOMESA-3176 Docs - fix download links in install instructions)
<<<<<<< HEAD
>>>>>>> ecd45f2c3e (GEOMESA-3176 Docs - fix download links in install instructions)
=======
=======
=======
=======
=======
>>>>>>> 6eb31fb65 (GEOMESA-3061 Converters - support bytes in Avro top-level union types (#2762))
<<<<<<< HEAD
<<<<<<< HEAD
<<<<<<< HEAD
<<<<<<< HEAD
<<<<<<< HEAD
=======
<<<<<<< HEAD
<<<<<<< HEAD
>>>>>>> locatelli-main
=======
<<<<<<< HEAD
>>>>>>> locatelli-main
=======
>>>>>>> locatelli-main
>>>>>>> 5f428db97 (GEOMESA-3061 Converters - support bytes in Avro top-level union types (#2762))
<<<<<<< HEAD
>>>>>>> 6a2cd10c1c (GEOMESA-3061 Converters - support bytes in Avro top-level union types (#2762))
<<<<<<< HEAD
>>>>>>> aceaf3bd81 (GEOMESA-3061 Converters - support bytes in Avro top-level union types (#2762))
<<<<<<< HEAD
>>>>>>> 6fc8851879 (GEOMESA-3061 Converters - support bytes in Avro top-level union types (#2762))
=======
=======
=======
=======
=======
>>>>>>> 86dd18aa73 (GEOMESA-3061 Converters - support bytes in Avro top-level union types (#2762))
=======
<<<<<<< HEAD
<<<<<<< HEAD
<<<<<<< HEAD
=======
=======
>>>>>>> locatelli-main
=======
>>>>>>> locatelli-main
>>>>>>> 0833709340 (GEOMESA-3061 Converters - support bytes in Avro top-level union types (#2762))
=======
>>>>>>> 86dd18aa73 (GEOMESA-3061 Converters - support bytes in Avro top-level union types (#2762))
=======
<<<<<<< HEAD
<<<<<<< HEAD
>>>>>>> locatelli-main
=======
>>>>>>> locatelli-main
=======
>>>>>>> locatelli-main
=======

>>>>>>> b9bdd406e (GEOMESA-3061 Converters - support bytes in Avro top-level union types (#2762))
>>>>>>> 0e68e9f4c (GEOMESA-3061 Converters - support bytes in Avro top-level union types (#2762))
<<<<<<< HEAD
<<<<<<< HEAD
<<<<<<< HEAD
<<<<<<< HEAD
=======
<<<<<<< HEAD
<<<<<<< HEAD
>>>>>>> locatelli-main
=======
<<<<<<< HEAD
>>>>>>> locatelli-main
=======
>>>>>>> locatelli-main
>>>>>>> 76618c8da (GEOMESA-3061 Converters - support bytes in Avro top-level union types (#2762))
<<<<<<< HEAD
>>>>>>> 947761ec9b (GEOMESA-3061 Converters - support bytes in Avro top-level union types (#2762))
<<<<<<< HEAD
>>>>>>> 0086b292ba (GEOMESA-3061 Converters - support bytes in Avro top-level union types (#2762))
<<<<<<< HEAD
>>>>>>> 84ac051f28 (GEOMESA-3061 Converters - support bytes in Avro top-level union types (#2762))
=======
=======
=======
=======
=======
>>>>>>> 15e998504 (GEOMESA-3176 Docs - fix download links in install instructions)
<<<<<<< HEAD
<<<<<<< HEAD
<<<<<<< HEAD
<<<<<<< HEAD
=======
<<<<<<< HEAD
>>>>>>> locatelli-main
=======
>>>>>>> locatelli-main
=======
>>>>>>> locatelli-main
>>>>>>> 0fbf9e83e (GEOMESA-3176 Docs - fix download links in install instructions)
<<<<<<< HEAD
>>>>>>> 4d9f87a514 (GEOMESA-3176 Docs - fix download links in install instructions)
<<<<<<< HEAD
>>>>>>> 7efa8bf5c8 (GEOMESA-3176 Docs - fix download links in install instructions)
<<<<<<< HEAD
>>>>>>> 3995e6a61c (GEOMESA-3176 Docs - fix download links in install instructions)
=======
=======
=======
=======
=======
>>>>>>> 07a6a5c29 (GEOMESA-3061 Converters - support bytes in Avro top-level union types (#2762))
=======
>>>>>>> fe3de10f11 (GEOMESA-3061 Converters - support bytes in Avro top-level union types (#2762))
<<<<<<< HEAD
<<<<<<< HEAD
<<<<<<< HEAD
=======
<<<<<<< HEAD
>>>>>>> locatelli-main
=======
>>>>>>> locatelli-main
=======
>>>>>>> locatelli-main
>>>>>>> 89bdd3013 (GEOMESA-3061 Converters - support bytes in Avro top-level union types (#2762))
<<<<<<< HEAD
>>>>>>> 8a6a96234b (GEOMESA-3061 Converters - support bytes in Avro top-level union types (#2762))
<<<<<<< HEAD
>>>>>>> 93c8cf1b3a (GEOMESA-3061 Converters - support bytes in Avro top-level union types (#2762))
<<<<<<< HEAD
>>>>>>> 6514df9383 (GEOMESA-3061 Converters - support bytes in Avro top-level union types (#2762))
=======
=======
=======
=======
=======
>>>>>>> 67b361c85 (GEOMESA-3061 Converters - support bytes in Avro top-level union types (#2762))
=======
<<<<<<< HEAD
>>>>>>> cabde54511 (GEOMESA-3176 Docs - fix download links in install instructions)
<<<<<<< HEAD
<<<<<<< HEAD
<<<<<<< HEAD
=======
<<<<<<< HEAD
>>>>>>> locatelli-main
=======
>>>>>>> locatelli-main
=======
>>>>>>> locatelli-main
>>>>>>> c8a325e13 (GEOMESA-3061 Converters - support bytes in Avro top-level union types (#2762))
<<<<<<< HEAD
>>>>>>> c9328eddce (GEOMESA-3061 Converters - support bytes in Avro top-level union types (#2762))
<<<<<<< HEAD
>>>>>>> e15d50d7d3 (GEOMESA-3061 Converters - support bytes in Avro top-level union types (#2762))
<<<<<<< HEAD
>>>>>>> fe3de10f11 (GEOMESA-3061 Converters - support bytes in Avro top-level union types (#2762))
=======
=======
=======
=======
=======
=======
>>>>>>> 90ec70f55 (GEOMESA-3176 Docs - fix download links in install instructions)
>>>>>>> 63db7d154 (GEOMESA-3176 Docs - fix download links in install instructions)
=======
<<<<<<< HEAD
>>>>>>> c91f823574 (GEOMESA-3061 Converters - support bytes in Avro top-level union types (#2762))
<<<<<<< HEAD
<<<<<<< HEAD
<<<<<<< HEAD
=======
<<<<<<< HEAD
>>>>>>> locatelli-main
=======
>>>>>>> locatelli-main
=======
>>>>>>> locatelli-main
>>>>>>> f9e8439b0 (GEOMESA-3176 Docs - fix download links in install instructions)
<<<<<<< HEAD
>>>>>>> bd3233180f (GEOMESA-3176 Docs - fix download links in install instructions)
<<<<<<< HEAD
>>>>>>> 94efcf84c2 (GEOMESA-3176 Docs - fix download links in install instructions)
<<<<<<< HEAD
>>>>>>> cabde54511 (GEOMESA-3176 Docs - fix download links in install instructions)
=======
=======
=======
=======
=======
>>>>>>> 28e2bfa2d (GEOMESA-3061 Converters - support bytes in Avro top-level union types (#2762))
<<<<<<< HEAD
>>>>>>> 72bafaf54 (GEOMESA-3061 Converters - support bytes in Avro top-level union types (#2762))
=======
>>>>>>> d0785cf307 (GEOMESA-3061 Converters - support bytes in Avro top-level union types (#2762))
<<<<<<< HEAD
<<<<<<< HEAD
<<<<<<< HEAD
=======
<<<<<<< HEAD
>>>>>>> locatelli-main
=======
>>>>>>> locatelli-main
=======
>>>>>>> locatelli-main
>>>>>>> 0c734cda2b (GEOMESA-3061 Converters - support bytes in Avro top-level union types (#2762))
<<<<<<< HEAD
>>>>>>> 8929cbff5b (GEOMESA-3061 Converters - support bytes in Avro top-level union types (#2762))
<<<<<<< HEAD
>>>>>>> c91f823574 (GEOMESA-3061 Converters - support bytes in Avro top-level union types (#2762))
=======
=======
=======
=======
>>>>>>> 97ec7d864 (GEOMESA-3061 Converters - support bytes in Avro top-level union types (#2762))
=======
>>>>>>> 71adb695c5 (Merge branch 'feature/postgis-fixes')
<<<<<<< HEAD
<<<<<<< HEAD
<<<<<<< HEAD
=======
<<<<<<< HEAD
>>>>>>> locatelli-main
=======
>>>>>>> locatelli-main
=======
>>>>>>> locatelli-main
>>>>>>> d94c03a98e (GEOMESA-3061 Converters - support bytes in Avro top-level union types (#2762))
<<<<<<< HEAD
>>>>>>> 8de43cccf6 (GEOMESA-3061 Converters - support bytes in Avro top-level union types (#2762))
<<<<<<< HEAD
>>>>>>> d0785cf307 (GEOMESA-3061 Converters - support bytes in Avro top-level union types (#2762))
=======
=======
=======
=======
=======
>>>>>>> 3be8d2a5a (Merge branch 'feature/postgis-fixes')
>>>>>>> db8d998aa (Merge branch 'feature/postgis-fixes')
=======
>>>>>>> 5a4c24e020 (GEOMESA-3254 Add Bloop build support)
<<<<<<< HEAD
<<<<<<< HEAD
<<<<<<< HEAD
=======
<<<<<<< HEAD
>>>>>>> locatelli-main
=======
>>>>>>> locatelli-main
=======
>>>>>>> locatelli-main
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
>>>>>>> a52e4429be (GEOMESA-3061 Converters - support bytes in Avro top-level union types (#2762))
<<<<<<< HEAD
<<<<<<< HEAD
<<<<<<< HEAD
=======
<<<<<<< HEAD
>>>>>>> locatelli-main
=======
>>>>>>> locatelli-main
=======
>>>>>>> locatelli-main
>>>>>>> 09d87762c5 (GEOMESA-3254 Add Bloop build support)
<<<<<<< HEAD
>>>>>>> 63a045a753 (GEOMESA-3254 Add Bloop build support)
<<<<<<< HEAD
>>>>>>> 5a4c24e020 (GEOMESA-3254 Add Bloop build support)
=======
=======
=======
=======
>>>>>>> 498d1c9c26 (GEOMESA-3061 Converters - support bytes in Avro top-level union types (#2762))
=======
=======

>>>>>>> b9bdd406e (GEOMESA-3061 Converters - support bytes in Avro top-level union types (#2762))
<<<<<<< HEAD
>>>>>>> 6d9a5b626 (GEOMESA-3061 Converters - support bytes in Avro top-level union types (#2762))
=======
>>>>>>> 8dec77199d (GEOMESA-3176 Docs - fix download links in install instructions)
<<<<<<< HEAD
<<<<<<< HEAD
<<<<<<< HEAD
=======
<<<<<<< HEAD
>>>>>>> locatelli-main
=======
>>>>>>> locatelli-main
=======
>>>>>>> locatelli-main
>>>>>>> 67e4c1354f (GEOMESA-3061 Converters - support bytes in Avro top-level union types (#2762))
<<<<<<< HEAD
>>>>>>> 12e3a588fc (GEOMESA-3061 Converters - support bytes in Avro top-level union types (#2762))
<<<<<<< HEAD
>>>>>>> a52e4429be (GEOMESA-3061 Converters - support bytes in Avro top-level union types (#2762))
=======
=======
=======
=======
=======
=======
>>>>>>> bc73cc4d41 (GEOMESA-3061 Converters - support bytes in Avro top-level union types (#2762))
<<<<<<< HEAD
<<<<<<< HEAD
=======
<<<<<<< HEAD
<<<<<<< HEAD
<<<<<<< HEAD
=======
>>>>>>> 411f3fc089 (GEOMESA-3061 Converters - support bytes in Avro top-level union types (#2762))
>>>>>>> locatelli-main
=======
<<<<<<< HEAD
=======
>>>>>>> 411f3fc089 (GEOMESA-3061 Converters - support bytes in Avro top-level union types (#2762))
>>>>>>> locatelli-main
=======
>>>>>>> 411f3fc089 (GEOMESA-3061 Converters - support bytes in Avro top-level union types (#2762))
>>>>>>> locatelli-main
=======
>>>>>>> 6eb31fb65 (GEOMESA-3061 Converters - support bytes in Avro top-level union types (#2762))
=======
>>>>>>> 98eacc8492 (GEOMESA-3061 Converters - support bytes in Avro top-level union types (#2762))
<<<<<<< HEAD
<<<<<<< HEAD
=======
<<<<<<< HEAD
<<<<<<< HEAD
<<<<<<< HEAD
=======
>>>>>>> 72c7cd55e5 (GEOMESA-3176 Docs - fix download links in install instructions)
>>>>>>> locatelli-main
=======
<<<<<<< HEAD
=======
>>>>>>> 72c7cd55e5 (GEOMESA-3176 Docs - fix download links in install instructions)
>>>>>>> locatelli-main
=======
>>>>>>> 72c7cd55e5 (GEOMESA-3176 Docs - fix download links in install instructions)
>>>>>>> locatelli-main
=======
>>>>>>> 15e998504 (GEOMESA-3176 Docs - fix download links in install instructions)
=======
>>>>>>> 1a737b13ed (GEOMESA-3176 Docs - fix download links in install instructions)
<<<<<<< HEAD
<<<<<<< HEAD
=======
<<<<<<< HEAD
<<<<<<< HEAD
<<<<<<< HEAD
=======
>>>>>>> 992ed6b1bf (GEOMESA-3061 Converters - support bytes in Avro top-level union types (#2762))
>>>>>>> locatelli-main
=======
<<<<<<< HEAD
=======
>>>>>>> 992ed6b1bf (GEOMESA-3061 Converters - support bytes in Avro top-level union types (#2762))
>>>>>>> locatelli-main
=======
>>>>>>> 992ed6b1bf (GEOMESA-3061 Converters - support bytes in Avro top-level union types (#2762))
>>>>>>> locatelli-main
=======
>>>>>>> 07a6a5c29 (GEOMESA-3061 Converters - support bytes in Avro top-level union types (#2762))
=======
<<<<<<< HEAD
>>>>>>> 664350d86f (GEOMESA-3061 Converters - support bytes in Avro top-level union types (#2762))
<<<<<<< HEAD
=======
<<<<<<< HEAD
<<<<<<< HEAD
<<<<<<< HEAD
=======
>>>>>>> 72c7cd55e5 (GEOMESA-3176 Docs - fix download links in install instructions)
=======
>>>>>>> 992ed6b1bf (GEOMESA-3061 Converters - support bytes in Avro top-level union types (#2762))
>>>>>>> locatelli-main
=======
>>>>>>> 72c7cd55e5 (GEOMESA-3176 Docs - fix download links in install instructions)
=======
>>>>>>> 992ed6b1bf (GEOMESA-3061 Converters - support bytes in Avro top-level union types (#2762))
>>>>>>> locatelli-main
=======
>>>>>>> 72c7cd55e5 (GEOMESA-3176 Docs - fix download links in install instructions)
=======
>>>>>>> 992ed6b1bf (GEOMESA-3061 Converters - support bytes in Avro top-level union types (#2762))
>>>>>>> locatelli-main

>>>>>>> b9bdd406e (GEOMESA-3061 Converters - support bytes in Avro top-level union types (#2762))
=======
>>>>>>> 16b2e83f2 (GEOMESA-3176 Docs - fix download links in install instructions)
<<<<<<< HEAD
<<<<<<< HEAD
<<<<<<< HEAD
<<<<<<< HEAD
<<<<<<< HEAD
<<<<<<< HEAD
=======
<<<<<<< HEAD
<<<<<<< HEAD
=======
>>>>>>> locatelli-main
<<<<<<< HEAD
=======
>>>>>>> 72c7cd55e5 (GEOMESA-3176 Docs - fix download links in install instructions)
=======
>>>>>>> 992ed6b1bf (GEOMESA-3061 Converters - support bytes in Avro top-level union types (#2762))
<<<<<<< HEAD
>>>>>>> locatelli-main
=======
>>>>>>> locatelli-main
=======
>>>>>>> 72c7cd55e5 (GEOMESA-3176 Docs - fix download links in install instructions)
=======
>>>>>>> 992ed6b1bf (GEOMESA-3061 Converters - support bytes in Avro top-level union types (#2762))
>>>>>>> locatelli-main
>>>>>>> 10ade3dcd (GEOMESA-3176 Docs - fix download links in install instructions)
<<<<<<< HEAD
>>>>>>> 703374130f (GEOMESA-3176 Docs - fix download links in install instructions)
<<<<<<< HEAD
>>>>>>> 93fa8c797f (GEOMESA-3176 Docs - fix download links in install instructions)
<<<<<<< HEAD
>>>>>>> 8dec77199d (GEOMESA-3176 Docs - fix download links in install instructions)
=======
=======
=======
=======
=======
=======
>>>>>>> 4b70e7f8f (GEOMESA-3176 Docs - fix download links in install instructions)
=======
>>>>>>> 85663f71c (GEOMESA-3061 Converters - support bytes in Avro top-level union types (#2762))
<<<<<<< HEAD
=======
<<<<<<< HEAD
<<<<<<< HEAD
<<<<<<< HEAD
=======
=======
>>>>>>> locatelli-main
=======
>>>>>>> locatelli-main
>>>>>>> 85663f71c (GEOMESA-3061 Converters - support bytes in Avro top-level union types (#2762))
=======
>>>>>>> 72c7cd55e5 (GEOMESA-3176 Docs - fix download links in install instructions)
<<<<<<< HEAD
=======
<<<<<<< HEAD
<<<<<<< HEAD
>>>>>>> locatelli-main
=======
>>>>>>> locatelli-main
=======
>>>>>>> locatelli-main
>>>>>>> 6eb31fb65 (GEOMESA-3061 Converters - support bytes in Avro top-level union types (#2762))
>>>>>>> 23c024179 (GEOMESA-3061 Converters - support bytes in Avro top-level union types (#2762))
=======
>>>>>>> 07a6a5c29 (GEOMESA-3061 Converters - support bytes in Avro top-level union types (#2762))
=======
=======

>>>>>>> b9bdd406e (GEOMESA-3061 Converters - support bytes in Avro top-level union types (#2762))
>>>>>>> f71fa3c0e (GEOMESA-3061 Converters - support bytes in Avro top-level union types (#2762))
<<<<<<< HEAD
<<<<<<< HEAD
>>>>>>> 947a867d1 (GEOMESA-3061 Converters - support bytes in Avro top-level union types (#2762))
<<<<<<< HEAD
>>>>>>> 748532d2db (GEOMESA-3061 Converters - support bytes in Avro top-level union types (#2762))
<<<<<<< HEAD
>>>>>>> c82dea9d29 (GEOMESA-3061 Converters - support bytes in Avro top-level union types (#2762))
<<<<<<< HEAD
>>>>>>> bc73cc4d41 (GEOMESA-3061 Converters - support bytes in Avro top-level union types (#2762))
=======
=======
=======
=======
<<<<<<< HEAD
>>>>>>> 85663f71c (GEOMESA-3061 Converters - support bytes in Avro top-level union types (#2762))
=======
<<<<<<< HEAD
>>>>>>> 23c024179 (GEOMESA-3061 Converters - support bytes in Avro top-level union types (#2762))
=======
>>>>>>> e6e1f4bdd (GEOMESA-3061 Converters - support bytes in Avro top-level union types (#2762))
<<<<<<< HEAD
>>>>>>> 8035cc5893 (GEOMESA-3061 Converters - support bytes in Avro top-level union types (#2762))
<<<<<<< HEAD
>>>>>>> 1890b11217 (GEOMESA-3061 Converters - support bytes in Avro top-level union types (#2762))
<<<<<<< HEAD
>>>>>>> 5c6b9f1f8b (GEOMESA-3061 Converters - support bytes in Avro top-level union types (#2762))
=======
=======
=======
=======
=======
>>>>>>> 90ec70f55 (GEOMESA-3176 Docs - fix download links in install instructions)
<<<<<<< HEAD
>>>>>>> 279de44d3 (GEOMESA-3176 Docs - fix download links in install instructions)
<<<<<<< HEAD
>>>>>>> b7c6b904be (GEOMESA-3176 Docs - fix download links in install instructions)
<<<<<<< HEAD
>>>>>>> 2142d07ded (GEOMESA-3176 Docs - fix download links in install instructions)
<<<<<<< HEAD
>>>>>>> 813f24c01d (GEOMESA-3176 Docs - fix download links in install instructions)
=======
=======
=======
=======
=======
>>>>>>> 6eb31fb65 (GEOMESA-3061 Converters - support bytes in Avro top-level union types (#2762))
<<<<<<< HEAD
<<<<<<< HEAD
<<<<<<< HEAD
<<<<<<< HEAD
=======
<<<<<<< HEAD
>>>>>>> locatelli-main
=======
>>>>>>> locatelli-main
=======
>>>>>>> locatelli-main
>>>>>>> 23c024179 (GEOMESA-3061 Converters - support bytes in Avro top-level union types (#2762))
<<<<<<< HEAD
>>>>>>> 250f01786f (GEOMESA-3061 Converters - support bytes in Avro top-level union types (#2762))
<<<<<<< HEAD
>>>>>>> a398ab1183 (GEOMESA-3061 Converters - support bytes in Avro top-level union types (#2762))
<<<<<<< HEAD
>>>>>>> 98eacc8492 (GEOMESA-3061 Converters - support bytes in Avro top-level union types (#2762))
=======
=======
=======
=======
=======
=======

>>>>>>> b9bdd406e (GEOMESA-3061 Converters - support bytes in Avro top-level union types (#2762))
>>>>>>> 0e68e9f4c (GEOMESA-3061 Converters - support bytes in Avro top-level union types (#2762))
<<<<<<< HEAD
<<<<<<< HEAD
<<<<<<< HEAD
<<<<<<< HEAD
=======
<<<<<<< HEAD
>>>>>>> locatelli-main
=======
>>>>>>> locatelli-main
=======
>>>>>>> locatelli-main
>>>>>>> a910ae135 (GEOMESA-3061 Converters - support bytes in Avro top-level union types (#2762))
<<<<<<< HEAD
>>>>>>> 07161eaaa6 (GEOMESA-3061 Converters - support bytes in Avro top-level union types (#2762))
<<<<<<< HEAD
>>>>>>> 9c28193a91 (GEOMESA-3061 Converters - support bytes in Avro top-level union types (#2762))
<<<<<<< HEAD
>>>>>>> 9d44ff473d (GEOMESA-3061 Converters - support bytes in Avro top-level union types (#2762))
=======
=======
=======
=======
=======
>>>>>>> 15e998504 (GEOMESA-3176 Docs - fix download links in install instructions)
<<<<<<< HEAD
<<<<<<< HEAD
<<<<<<< HEAD
<<<<<<< HEAD
=======
<<<<<<< HEAD
>>>>>>> locatelli-main
=======
>>>>>>> locatelli-main
=======
>>>>>>> locatelli-main
>>>>>>> 4b70e7f8f (GEOMESA-3176 Docs - fix download links in install instructions)
<<<<<<< HEAD
>>>>>>> b42125fac1 (GEOMESA-3176 Docs - fix download links in install instructions)
<<<<<<< HEAD
>>>>>>> a8d6366d72 (GEOMESA-3176 Docs - fix download links in install instructions)
<<<<<<< HEAD
>>>>>>> 1a737b13ed (GEOMESA-3176 Docs - fix download links in install instructions)
=======
=======
=======
=======
=======
>>>>>>> 07a6a5c29 (GEOMESA-3061 Converters - support bytes in Avro top-level union types (#2762))
=======
>>>>>>> a35efac12e (GEOMESA-3061 Converters - support bytes in Avro top-level union types (#2762))
<<<<<<< HEAD
<<<<<<< HEAD
<<<<<<< HEAD
=======
<<<<<<< HEAD
>>>>>>> locatelli-main
=======
>>>>>>> locatelli-main
=======
>>>>>>> locatelli-main
>>>>>>> 85663f71c (GEOMESA-3061 Converters - support bytes in Avro top-level union types (#2762))
<<<<<<< HEAD
>>>>>>> 813488e18c (GEOMESA-3061 Converters - support bytes in Avro top-level union types (#2762))
<<<<<<< HEAD
>>>>>>> 6f30a087ee (GEOMESA-3061 Converters - support bytes in Avro top-level union types (#2762))
<<<<<<< HEAD
>>>>>>> 664350d86f (GEOMESA-3061 Converters - support bytes in Avro top-level union types (#2762))
=======
=======
=======
=======
=======
>>>>>>> 67b361c85 (GEOMESA-3061 Converters - support bytes in Avro top-level union types (#2762))
=======
>>>>>>> 3e34d2451e (GEOMESA-3176 Docs - fix download links in install instructions)
<<<<<<< HEAD
<<<<<<< HEAD
<<<<<<< HEAD
=======
<<<<<<< HEAD
>>>>>>> locatelli-main
=======
>>>>>>> locatelli-main
=======
>>>>>>> locatelli-main
>>>>>>> ad3cedc4d (GEOMESA-3061 Converters - support bytes in Avro top-level union types (#2762))
<<<<<<< HEAD
>>>>>>> 9abc630fdf (GEOMESA-3061 Converters - support bytes in Avro top-level union types (#2762))
<<<<<<< HEAD
>>>>>>> d294ce49e2 (GEOMESA-3061 Converters - support bytes in Avro top-level union types (#2762))
<<<<<<< HEAD
>>>>>>> a35efac12e (GEOMESA-3061 Converters - support bytes in Avro top-level union types (#2762))
=======
=======
=======
=======
=======
=======
>>>>>>> 90ec70f55 (GEOMESA-3176 Docs - fix download links in install instructions)
>>>>>>> 63db7d154 (GEOMESA-3176 Docs - fix download links in install instructions)
=======
>>>>>>> a85aff60b3 (GEOMESA-3061 Converters - support bytes in Avro top-level union types (#2762))
<<<<<<< HEAD
<<<<<<< HEAD
<<<<<<< HEAD
=======
<<<<<<< HEAD
>>>>>>> locatelli-main
=======
>>>>>>> locatelli-main
=======
>>>>>>> locatelli-main
>>>>>>> a12ea194c (GEOMESA-3176 Docs - fix download links in install instructions)
<<<<<<< HEAD
>>>>>>> 5c3f315bc0 (GEOMESA-3176 Docs - fix download links in install instructions)
<<<<<<< HEAD
>>>>>>> b041fcc3eb (GEOMESA-3176 Docs - fix download links in install instructions)
<<<<<<< HEAD
>>>>>>> 3e34d2451e (GEOMESA-3176 Docs - fix download links in install instructions)
=======
=======
=======
=======
=======
>>>>>>> 28e2bfa2d (GEOMESA-3061 Converters - support bytes in Avro top-level union types (#2762))
>>>>>>> d4c5768cf (GEOMESA-3061 Converters - support bytes in Avro top-level union types (#2762))
=======
>>>>>>> fd5565dfba (GEOMESA-3061 Converters - support bytes in Avro top-level union types (#2762))
<<<<<<< HEAD
<<<<<<< HEAD
<<<<<<< HEAD
=======
<<<<<<< HEAD
>>>>>>> locatelli-main
=======
>>>>>>> locatelli-main
=======
>>>>>>> locatelli-main
>>>>>>> fe51719bc6 (GEOMESA-3061 Converters - support bytes in Avro top-level union types (#2762))
<<<<<<< HEAD
>>>>>>> 3acb47e615 (GEOMESA-3061 Converters - support bytes in Avro top-level union types (#2762))
<<<<<<< HEAD
>>>>>>> a85aff60b3 (GEOMESA-3061 Converters - support bytes in Avro top-level union types (#2762))
=======
=======
=======
=======
>>>>>>> bdbced26d (GEOMESA-3061 Converters - support bytes in Avro top-level union types (#2762))
=======
>>>>>>> 30559ea5c9 (Merge branch 'feature/postgis-fixes')
<<<<<<< HEAD
<<<<<<< HEAD
<<<<<<< HEAD
=======
<<<<<<< HEAD
>>>>>>> locatelli-main
=======
>>>>>>> locatelli-main
=======
>>>>>>> locatelli-main
>>>>>>> 25063957fc (GEOMESA-3061 Converters - support bytes in Avro top-level union types (#2762))
<<<<<<< HEAD
>>>>>>> 1df8328338 (GEOMESA-3061 Converters - support bytes in Avro top-level union types (#2762))
<<<<<<< HEAD
>>>>>>> fd5565dfba (GEOMESA-3061 Converters - support bytes in Avro top-level union types (#2762))
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
>>>>>>> 0104fb37e4 (GEOMESA-3061 Converters - support bytes in Avro top-level union types (#2762))
<<<<<<< HEAD
<<<<<<< HEAD
=======
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
>>>>>>> 1f19a648d1 (GEOMESA-3176 Docs - fix download links in install instructions)
=======
=======
>>>>>>> c1f99f4bcb (GEOMESA-3061 Converters - support bytes in Avro top-level union types (#2762))
<<<<<<< HEAD
<<<<<<< HEAD
>>>>>>> c9c24ca3d7 (GEOMESA-3061 Converters - support bytes in Avro top-level union types (#2762))
=======
>>>>>>> 2654d9c120 (GEOMESA-3061 Converters - support bytes in Avro top-level union types (#2762))
<<<<<<< HEAD
=======
<<<<<<< HEAD
=======
>>>>>>> locatelli-main
<<<<<<< HEAD
>>>>>>> c9c24ca3d7 (GEOMESA-3061 Converters - support bytes in Avro top-level union types (#2762))
=======
>>>>>>> 2654d9c120 (GEOMESA-3061 Converters - support bytes in Avro top-level union types (#2762))
<<<<<<< HEAD
<<<<<<< HEAD
<<<<<<< HEAD
>>>>>>> locatelli-main
=======
>>>>>>> locatelli-main
=======
<<<<<<< HEAD
<<<<<<< HEAD
>>>>>>> locatelli-main
=======
>>>>>>> 4492950388 (GEOMESA-3176 Docs - fix download links in install instructions)
=======
>>>>>>> b9c0fc77b9 (GEOMESA-3061 Converters - support bytes in Avro top-level union types (#2762))
<<<<<<< HEAD
<<<<<<< HEAD
=======
<<<<<<< HEAD
<<<<<<< HEAD
<<<<<<< HEAD
=======
>>>>>>> 39c52cab32 (GEOMESA-3061 Converters - support bytes in Avro top-level union types (#2762))
>>>>>>> locatelli-main
=======
<<<<<<< HEAD
=======
>>>>>>> 39c52cab32 (GEOMESA-3061 Converters - support bytes in Avro top-level union types (#2762))
>>>>>>> locatelli-main
=======
>>>>>>> 39c52cab32 (GEOMESA-3061 Converters - support bytes in Avro top-level union types (#2762))
>>>>>>> locatelli-main
=======
=======
>>>>>>> 4c361f07da (GEOMESA-3061 Converters - support bytes in Avro top-level union types (#2762))
>>>>>>> f110463a26 (GEOMESA-3061 Converters - support bytes in Avro top-level union types (#2762))
<<<<<<< HEAD
<<<<<<< HEAD
=======
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
>>>>>>> aff2787fc2 (GEOMESA-3176 Docs - fix download links in install instructions)
=======
>>>>>>> d69216810e (GEOMESA-3061 Converters - support bytes in Avro top-level union types (#2762))
<<<<<<< HEAD
<<<<<<< HEAD
=======
<<<<<<< HEAD
<<<<<<< HEAD
<<<<<<< HEAD
=======
>>>>>>> 27c0ee7e6d (GEOMESA-3061 Converters - support bytes in Avro top-level union types (#2762))
>>>>>>> locatelli-main
=======
<<<<<<< HEAD
=======
>>>>>>> 27c0ee7e6d (GEOMESA-3061 Converters - support bytes in Avro top-level union types (#2762))
>>>>>>> locatelli-main
=======
>>>>>>> 27c0ee7e6d (GEOMESA-3061 Converters - support bytes in Avro top-level union types (#2762))
>>>>>>> locatelli-main
=======
=======
>>>>>>> f302a54949 (GEOMESA-3061 Converters - support bytes in Avro top-level union types (#2762))
>>>>>>> 86ec77f9cb (GEOMESA-3061 Converters - support bytes in Avro top-level union types (#2762))
<<<<<<< HEAD
<<<<<<< HEAD
=======
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
>>>>>>> 0753bfcbe4 (GEOMESA-3176 Docs - fix download links in install instructions)
=======
=======
>>>>>>> 28e2bfa2d (GEOMESA-3061 Converters - support bytes in Avro top-level union types (#2762))
>>>>>>> 76908c410a (GEOMESA-3061 Converters - support bytes in Avro top-level union types (#2762))
>>>>>>> 17f16286aa (GEOMESA-3061 Converters - support bytes in Avro top-level union types (#2762))
<<<<<<< HEAD
<<<<<<< HEAD
=======
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
>>>>>>> a788dfac03 (GEOMESA-3061 Converters - support bytes in Avro top-level union types (#2762))
>>>>>>> 1bcc513539 (GEOMESA-3061 Converters - support bytes in Avro top-level union types (#2762))
=======
>>>>>>> ec6d06b576 (Merge branch 'feature/postgis-fixes')
<<<<<<< HEAD
<<<<<<< HEAD
<<<<<<< HEAD
>>>>>>> locationtech-main
=======
<<<<<<< HEAD
=======
>>>>>>> locatelli-main
<<<<<<< HEAD
=======
>>>>>>> locatelli-main
=======
=======

>>>>>>> b9bdd406e3 (GEOMESA-3061 Converters - support bytes in Avro top-level union types (#2762))
>>>>>>> 3d5144418e (GEOMESA-3061 Converters - support bytes in Avro top-level union types (#2762))
=======
>>>>>>> d13d2eab26 (GEOMESA-3176 Docs - fix download links in install instructions)
=======
>>>>>>> c7403e8a5f (GEOMESA-3061 Converters - support bytes in Avro top-level union types (#2762))
=======
>>>>>>> 7bdbfa5524 (GEOMESA-3061 Converters - support bytes in Avro top-level union types (#2762))
=======
>>>>>>> 90ec70f559 (GEOMESA-3176 Docs - fix download links in install instructions)
>>>>>>> 31ac28fff4 (GEOMESA-3176 Docs - fix download links in install instructions)
=======
=======
>>>>>>> 62a28bf2e7 (GEOMESA-3061 Converters - support bytes in Avro top-level union types (#2762))
=======
>>>>>>> e8b736ee96 (GEOMESA-3061 Converters - support bytes in Avro top-level union types (#2762))
>>>>>>> 6eb31fb652 (GEOMESA-3061 Converters - support bytes in Avro top-level union types (#2762))
<<<<<<< HEAD
>>>>>>> 4ac5af223d (GEOMESA-3061 Converters - support bytes in Avro top-level union types (#2762))
=======
=======
>>>>>>> 67b361c856 (GEOMESA-3061 Converters - support bytes in Avro top-level union types (#2762))
=======
=======
>>>>>>> 72919d0f84 (GEOMESA-3061 Converters - support bytes in Avro top-level union types (#2762))
=======

>>>>>>> b9bdd406e (GEOMESA-3061 Converters - support bytes in Avro top-level union types (#2762))
<<<<<<< HEAD
>>>>>>> 0e68e9f4cc (GEOMESA-3061 Converters - support bytes in Avro top-level union types (#2762))
<<<<<<< HEAD
>>>>>>> 7bff4d0018 (GEOMESA-3061 Converters - support bytes in Avro top-level union types (#2762))
=======
=======
>>>>>>> locationtech-main
>>>>>>> fcfc8ed547 (GEOMESA-3061 Converters - support bytes in Avro top-level union types (#2762))
=======
=======

>>>>>>> b9bdd406e (GEOMESA-3061 Converters - support bytes in Avro top-level union types (#2762))
<<<<<<< HEAD
=======
>>>>>>> 16b2e83f2 (GEOMESA-3176 Docs - fix download links in install instructions)
>>>>>>> 15e9985047 (GEOMESA-3176 Docs - fix download links in install instructions)
<<<<<<< HEAD
>>>>>>> 26bf3ffae4 (GEOMESA-3176 Docs - fix download links in install instructions)
=======
=======
>>>>>>> 07a6a5c291 (GEOMESA-3061 Converters - support bytes in Avro top-level union types (#2762))
<<<<<<< HEAD
>>>>>>> 62a28bf2e7 (GEOMESA-3061 Converters - support bytes in Avro top-level union types (#2762))
=======
=======
>>>>>>> cdb410251 (GEOMESA-3061 Converters - support bytes in Avro top-level union types (#2762))
<<<<<<< HEAD
<<<<<<< HEAD
=======
<<<<<<< HEAD
<<<<<<< HEAD
<<<<<<< HEAD
>>>>>>> 94fecee1d8 (GEOMESA-3061 Converters - support bytes in Avro top-level union types (#2762))
=======
>>>>>>> 798faeb761 (GEOMESA-3176 Docs - fix download links in install instructions)
>>>>>>> 67b361c856 (GEOMESA-3061 Converters - support bytes in Avro top-level union types (#2762))
<<<<<<< HEAD
>>>>>>> e8b736ee96 (GEOMESA-3061 Converters - support bytes in Avro top-level union types (#2762))
=======
=======
=======
>>>>>>> c8a325e13c (GEOMESA-3061 Converters - support bytes in Avro top-level union types (#2762))
=======
>>>>>>> f9e8439b09 (GEOMESA-3176 Docs - fix download links in install instructions)
=======
>>>>>>> 90ec70f55 (GEOMESA-3176 Docs - fix download links in install instructions)
<<<<<<< HEAD
>>>>>>> 63db7d154a (GEOMESA-3176 Docs - fix download links in install instructions)
<<<<<<< HEAD
>>>>>>> 42adcd38ba (GEOMESA-3176 Docs - fix download links in install instructions)
=======
=======
=======
>>>>>>> 6eb31fb65 (GEOMESA-3061 Converters - support bytes in Avro top-level union types (#2762))
>>>>>>> 28e2bfa2dc (GEOMESA-3061 Converters - support bytes in Avro top-level union types (#2762))
<<<<<<< HEAD
>>>>>>> 72919d0f84 (GEOMESA-3061 Converters - support bytes in Avro top-level union types (#2762))
=======
=======
=======

>>>>>>> b9bdd406e (GEOMESA-3061 Converters - support bytes in Avro top-level union types (#2762))
>>>>>>> b4320946b4 (GEOMESA-3061 Converters - support bytes in Avro top-level union types (#2762))
<<<<<<< HEAD
>>>>>>> 0efbfe547e (GEOMESA-3061 Converters - support bytes in Avro top-level union types (#2762))
=======
=======
>>>>>>> 3be8d2a5a4 (Merge branch 'feature/postgis-fixes')
<<<<<<< HEAD
>>>>>>> 4c41429da9 (Merge branch 'feature/postgis-fixes')
=======
=======
=======

>>>>>>> b9bdd406e (GEOMESA-3061 Converters - support bytes in Avro top-level union types (#2762))
>>>>>>> d9ed077cd1 (GEOMESA-3061 Converters - support bytes in Avro top-level union types (#2762))
>>>>>>> d498bef1ce (GEOMESA-3061 Converters - support bytes in Avro top-level union types (#2762))
=======
>>>>>>> f1fe65810a (GEOMESA-3176 Docs - fix download links in install instructions)
=======
=======
>>>>>>> c5e1827657 (GEOMESA-3061 Converters - support bytes in Avro top-level union types (#2762))
>>>>>>> 64536d7b4a (GEOMESA-3061 Converters - support bytes in Avro top-level union types (#2762))
=======
=======
>>>>>>> cdb410251 (GEOMESA-3061 Converters - support bytes in Avro top-level union types (#2762))
>>>>>>> 9d708b240a (GEOMESA-3061 Converters - support bytes in Avro top-level union types (#2762))
>>>>>>> a5b160f47b (GEOMESA-3061 Converters - support bytes in Avro top-level union types (#2762))
=======
>>>>>>> 9b83a71a1e (GEOMESA-3176 Docs - fix download links in install instructions)
=======
>>>>>>> 107726440b (GEOMESA-3061 Converters - support bytes in Avro top-level union types (#2762))
=======
=======
>>>>>>> 0e68e9f4c (GEOMESA-3061 Converters - support bytes in Avro top-level union types (#2762))
>>>>>>> 76618c8da3 (GEOMESA-3061 Converters - support bytes in Avro top-level union types (#2762))
>>>>>>> 5cf31d21f3 (GEOMESA-3061 Converters - support bytes in Avro top-level union types (#2762))
=======
=======
<<<<<<< HEAD
>>>>>>> d6730faea6 (GEOMESA-3061 Converters - support bytes in Avro top-level union types (#2762))
>>>>>>> 0fbf9e83e2 (GEOMESA-3176 Docs - fix download links in install instructions)
>>>>>>> 1ce7179e65 (GEOMESA-3176 Docs - fix download links in install instructions)
=======
<<<<<<< HEAD
>>>>>>> 89bdd3013e (GEOMESA-3061 Converters - support bytes in Avro top-level union types (#2762))
>>>>>>> 211b96b2ed (GEOMESA-3061 Converters - support bytes in Avro top-level union types (#2762))
=======
=======
>>>>>>> 07a6a5c29 (GEOMESA-3061 Converters - support bytes in Avro top-level union types (#2762))
<<<<<<< HEAD
<<<<<<< HEAD
>>>>>>> 89bdd3013e (GEOMESA-3061 Converters - support bytes in Avro top-level union types (#2762))
=======
=======
>>>>>>> 67b361c85 (GEOMESA-3061 Converters - support bytes in Avro top-level union types (#2762))
<<<<<<< HEAD
<<<<<<< HEAD
>>>>>>> c8a325e13c (GEOMESA-3061 Converters - support bytes in Avro top-level union types (#2762))
<<<<<<< HEAD
>>>>>>> 94fecee1d8 (GEOMESA-3061 Converters - support bytes in Avro top-level union types (#2762))
=======
=======
=======
>>>>>>> a12ea194c8 (GEOMESA-3176 Docs - fix download links in install instructions)
=======
=======
>>>>>>> 90ec70f55 (GEOMESA-3176 Docs - fix download links in install instructions)
>>>>>>> 63db7d154 (GEOMESA-3176 Docs - fix download links in install instructions)
<<<<<<< HEAD
<<<<<<< HEAD
<<<<<<< HEAD
>>>>>>> f9e8439b09 (GEOMESA-3176 Docs - fix download links in install instructions)
<<<<<<< HEAD
>>>>>>> 798faeb761 (GEOMESA-3176 Docs - fix download links in install instructions)
=======
=======
=======
>>>>>>> 28e2bfa2d (GEOMESA-3061 Converters - support bytes in Avro top-level union types (#2762))
<<<<<<< HEAD
<<<<<<< HEAD
>>>>>>> 72bafaf54b (GEOMESA-3061 Converters - support bytes in Avro top-level union types (#2762))
<<<<<<< HEAD
>>>>>>> 7ca1082a3f (GEOMESA-3061 Converters - support bytes in Avro top-level union types (#2762))
=======
=======
=======
>>>>>>> bdbced26d4 (GEOMESA-3061 Converters - support bytes in Avro top-level union types (#2762))
=======
=======

>>>>>>> b9bdd406e (GEOMESA-3061 Converters - support bytes in Avro top-level union types (#2762))
>>>>>>> b4320946b (GEOMESA-3061 Converters - support bytes in Avro top-level union types (#2762))
<<<<<<< HEAD
<<<<<<< HEAD
<<<<<<< HEAD
>>>>>>> 97ec7d864a (GEOMESA-3061 Converters - support bytes in Avro top-level union types (#2762))
<<<<<<< HEAD
>>>>>>> 4599715c51 (d)
=======
=======
=======
>>>>>>> 3be8d2a5a (Merge branch 'feature/postgis-fixes')
<<<<<<< HEAD
>>>>>>> db8d998aa2 (Merge branch 'feature/postgis-fixes')
<<<<<<< HEAD
>>>>>>> 6e0709aba8 (Merge branch 'feature/postgis-fixes')
=======
=======
>>>>>>> d845d7c1bd (GEOMESA-3254 Add Bloop build support)
<<<<<<< HEAD
>>>>>>> 7a84c9d22d (GEOMESA-3254 Add Bloop build support)
=======
=======
>>>>>>> 0dbede148d (GEOMESA-3061 Converters - support bytes in Avro top-level union types (#2762))
=======
=======

>>>>>>> b9bdd406e (GEOMESA-3061 Converters - support bytes in Avro top-level union types (#2762))
<<<<<<< HEAD
>>>>>>> 6d9a5b626c (GEOMESA-3061 Converters - support bytes in Avro top-level union types (#2762))
<<<<<<< HEAD
>>>>>>> 7fbbd56493 (GEOMESA-3061 Converters - support bytes in Avro top-level union types (#2762))
=======
=======
=======

>>>>>>> b9bdd406e (GEOMESA-3061 Converters - support bytes in Avro top-level union types (#2762))
=======
>>>>>>> 16b2e83f2 (GEOMESA-3176 Docs - fix download links in install instructions)
>>>>>>> 10ade3dcd1 (GEOMESA-3176 Docs - fix download links in install instructions)
<<<<<<< HEAD
>>>>>>> 165fb93a09 (GEOMESA-3176 Docs - fix download links in install instructions)
=======
=======
>>>>>>> f71fa3c0e (GEOMESA-3061 Converters - support bytes in Avro top-level union types (#2762))
>>>>>>> 947a867d1c (GEOMESA-3061 Converters - support bytes in Avro top-level union types (#2762))
<<<<<<< HEAD
>>>>>>> 930f10d338 (GEOMESA-3061 Converters - support bytes in Avro top-level union types (#2762))
=======
=======
>>>>>>> cdb410251 (GEOMESA-3061 Converters - support bytes in Avro top-level union types (#2762))
>>>>>>> e6e1f4bdd5 (GEOMESA-3061 Converters - support bytes in Avro top-level union types (#2762))
<<<<<<< HEAD
>>>>>>> 3eb12f79a9 (GEOMESA-3061 Converters - support bytes in Avro top-level union types (#2762))
=======
=======
=======
>>>>>>> 90ec70f55 (GEOMESA-3176 Docs - fix download links in install instructions)
>>>>>>> 279de44d3f (GEOMESA-3176 Docs - fix download links in install instructions)
<<<<<<< HEAD
>>>>>>> dc2038e108 (GEOMESA-3176 Docs - fix download links in install instructions)
=======
=======
=======
>>>>>>> 6eb31fb65 (GEOMESA-3061 Converters - support bytes in Avro top-level union types (#2762))
>>>>>>> 23c0241798 (GEOMESA-3061 Converters - support bytes in Avro top-level union types (#2762))
<<<<<<< HEAD
>>>>>>> 07e2884d79 (GEOMESA-3061 Converters - support bytes in Avro top-level union types (#2762))
=======
=======
>>>>>>> 0e68e9f4c (GEOMESA-3061 Converters - support bytes in Avro top-level union types (#2762))
>>>>>>> a910ae135f (GEOMESA-3061 Converters - support bytes in Avro top-level union types (#2762))
<<<<<<< HEAD
>>>>>>> 4ccd6f6b1f (GEOMESA-3061 Converters - support bytes in Avro top-level union types (#2762))
=======
=======
=======
>>>>>>> 15e998504 (GEOMESA-3176 Docs - fix download links in install instructions)
>>>>>>> 4b70e7f8fb (GEOMESA-3176 Docs - fix download links in install instructions)
<<<<<<< HEAD
>>>>>>> 4431c091e2 (GEOMESA-3176 Docs - fix download links in install instructions)
=======
=======
=======
>>>>>>> 07a6a5c29 (GEOMESA-3061 Converters - support bytes in Avro top-level union types (#2762))
>>>>>>> 85663f71c4 (GEOMESA-3061 Converters - support bytes in Avro top-level union types (#2762))
<<<<<<< HEAD
>>>>>>> d6730faea6 (GEOMESA-3061 Converters - support bytes in Avro top-level union types (#2762))
=======
=======
=======
>>>>>>> 67b361c85 (GEOMESA-3061 Converters - support bytes in Avro top-level union types (#2762))
>>>>>>> ad3cedc4db (GEOMESA-3061 Converters - support bytes in Avro top-level union types (#2762))
<<<<<<< HEAD
>>>>>>> 35b69b8f2f (GEOMESA-3061 Converters - support bytes in Avro top-level union types (#2762))
=======
=======
>>>>>>> a12ea194c8 (GEOMESA-3176 Docs - fix download links in install instructions)
<<<<<<< HEAD
>>>>>>> 312769c8d4 (GEOMESA-3176 Docs - fix download links in install instructions)
=======
=======
=======
>>>>>>> 28e2bfa2d (GEOMESA-3061 Converters - support bytes in Avro top-level union types (#2762))
>>>>>>> d4c5768cfa (GEOMESA-3061 Converters - support bytes in Avro top-level union types (#2762))
<<<<<<< HEAD
>>>>>>> 3382f42b39 (GEOMESA-3061 Converters - support bytes in Avro top-level union types (#2762))
=======
=======
>>>>>>> bdbced26d4 (GEOMESA-3061 Converters - support bytes in Avro top-level union types (#2762))
<<<<<<< HEAD
>>>>>>> db8a3a22b2 (GEOMESA-3061 Converters - support bytes in Avro top-level union types (#2762))
=======
=======
=======
>>>>>>> 3be8d2a5a (Merge branch 'feature/postgis-fixes')
>>>>>>> 1b25d7ddb4 (Merge branch 'feature/postgis-fixes')
<<<<<<< HEAD
>>>>>>> ed25decdd5 (Merge branch 'feature/postgis-fixes')
=======
=======
>>>>>>> 87bf55340 (GEOMESA-3061 Converters - support bytes in Avro top-level union types (#2762))
<<<<<<< HEAD
>>>>>>> 0dbede148d (GEOMESA-3061 Converters - support bytes in Avro top-level union types (#2762))
<<<<<<< HEAD
>>>>>>> 27afb28ab6 (GEOMESA-3061 Converters - support bytes in Avro top-level union types (#2762))
=======
=======
=======
=======
>>>>>>> e847488d8 (GEOMESA-3061 Converters - support bytes in Avro top-level union types (#2762))
=======
>>>>>>> 6eb31fb65 (GEOMESA-3061 Converters - support bytes in Avro top-level union types (#2762))
=======
<<<<<<< HEAD
>>>>>>> 15e998504 (GEOMESA-3176 Docs - fix download links in install instructions)
=======
>>>>>>> 07a6a5c29 (GEOMESA-3061 Converters - support bytes in Avro top-level union types (#2762))
=======
>>>>>>> 67b361c85 (GEOMESA-3061 Converters - support bytes in Avro top-level union types (#2762))
=======
=======
>>>>>>> 90ec70f55 (GEOMESA-3176 Docs - fix download links in install instructions)
>>>>>>> 63db7d154 (GEOMESA-3176 Docs - fix download links in install instructions)
=======
<<<<<<< HEAD
=======
>>>>>>> 28e2bfa2d (GEOMESA-3061 Converters - support bytes in Avro top-level union types (#2762))
<<<<<<< HEAD

>>>>>>> b9bdd406e (GEOMESA-3061 Converters - support bytes in Avro top-level union types (#2762))
=======
>>>>>>> 16b2e83f2 (GEOMESA-3176 Docs - fix download links in install instructions)
<<<<<<< HEAD
<<<<<<< HEAD
<<<<<<< HEAD
<<<<<<< HEAD
<<<<<<< HEAD
<<<<<<< HEAD
>>>>>>> 7813a31aa (GEOMESA-3176 Docs - fix download links in install instructions)
<<<<<<< HEAD
>>>>>>> 71c56e6b77 (GEOMESA-3176 Docs - fix download links in install instructions)
<<<<<<< HEAD
>>>>>>> 80c85285b7 (GEOMESA-3176 Docs - fix download links in install instructions)
=======
=======
=======
=======
=======
>>>>>>> baa90e85a (GEOMESA-3176 Docs - fix download links in install instructions)
=======
>>>>>>> 4524373ac (GEOMESA-3061 Converters - support bytes in Avro top-level union types (#2762))
=======
>>>>>>> 46c05fed5 (GEOMESA-3176 Docs - fix download links in install instructions)
=======
>>>>>>> 4fbe39c62 (GEOMESA-3061 Converters - support bytes in Avro top-level union types (#2762))
<<<<<<< HEAD
=======
>>>>>>> 6eb31fb65 (GEOMESA-3061 Converters - support bytes in Avro top-level union types (#2762))
>>>>>>> 3dd99aed4 (GEOMESA-3061 Converters - support bytes in Avro top-level union types (#2762))
=======
>>>>>>> 07a6a5c29 (GEOMESA-3061 Converters - support bytes in Avro top-level union types (#2762))
=======
>>>>>>> 63db7d154 (GEOMESA-3176 Docs - fix download links in install instructions)
=======
=======
>>>>>>> 6eb31fb65 (GEOMESA-3061 Converters - support bytes in Avro top-level union types (#2762))
>>>>>>> 28e2bfa2d (GEOMESA-3061 Converters - support bytes in Avro top-level union types (#2762))
=======
=======

>>>>>>> b9bdd406e (GEOMESA-3061 Converters - support bytes in Avro top-level union types (#2762))
>>>>>>> f71fa3c0e (GEOMESA-3061 Converters - support bytes in Avro top-level union types (#2762))
<<<<<<< HEAD
<<<<<<< HEAD
<<<<<<< HEAD
<<<<<<< HEAD
>>>>>>> e847488d8 (GEOMESA-3061 Converters - support bytes in Avro top-level union types (#2762))
<<<<<<< HEAD
>>>>>>> e27137ff78 (GEOMESA-3061 Converters - support bytes in Avro top-level union types (#2762))
<<<<<<< HEAD
>>>>>>> d79f0b5741 (GEOMESA-3061 Converters - support bytes in Avro top-level union types (#2762))
=======
=======
=======
=======
>>>>>>> 4fbe39c62 (GEOMESA-3061 Converters - support bytes in Avro top-level union types (#2762))
<<<<<<< HEAD
=======
>>>>>>> 67b361c85 (GEOMESA-3061 Converters - support bytes in Avro top-level union types (#2762))
>>>>>>> dace2085b (GEOMESA-3061 Converters - support bytes in Avro top-level union types (#2762))
=======
<<<<<<< HEAD
<<<<<<< HEAD
>>>>>>> 4524373ac (GEOMESA-3061 Converters - support bytes in Avro top-level union types (#2762))
=======
<<<<<<< HEAD
>>>>>>> 3dd99aed4 (GEOMESA-3061 Converters - support bytes in Avro top-level union types (#2762))
=======
>>>>>>> 240977229 (GEOMESA-3061 Converters - support bytes in Avro top-level union types (#2762))
<<<<<<< HEAD
>>>>>>> 22dcc8170f (GEOMESA-3061 Converters - support bytes in Avro top-level union types (#2762))
<<<<<<< HEAD
>>>>>>> 26a09ee6c2 (GEOMESA-3061 Converters - support bytes in Avro top-level union types (#2762))
=======
=======
=======
<<<<<<< HEAD
=======
>>>>>>> 28e2bfa2d (GEOMESA-3061 Converters - support bytes in Avro top-level union types (#2762))
=======
>>>>>>> 4fbe39c62 (GEOMESA-3061 Converters - support bytes in Avro top-level union types (#2762))
=======

>>>>>>> b9bdd406e (GEOMESA-3061 Converters - support bytes in Avro top-level union types (#2762))
>>>>>>> cdb410251 (GEOMESA-3061 Converters - support bytes in Avro top-level union types (#2762))
<<<<<<< HEAD
<<<<<<< HEAD
>>>>>>> dace2085b (GEOMESA-3061 Converters - support bytes in Avro top-level union types (#2762))
=======
<<<<<<< HEAD
>>>>>>> 46c05fed5 (GEOMESA-3176 Docs - fix download links in install instructions)
=======
>>>>>>> 90ec70f55 (GEOMESA-3176 Docs - fix download links in install instructions)
<<<<<<< HEAD
>>>>>>> 6a26990f7 (GEOMESA-3176 Docs - fix download links in install instructions)
<<<<<<< HEAD
>>>>>>> 0b36b46b5f (GEOMESA-3176 Docs - fix download links in install instructions)
<<<<<<< HEAD
>>>>>>> f05d4ba95a (GEOMESA-3176 Docs - fix download links in install instructions)
=======
=======
=======
=======
>>>>>>> 6eb31fb65 (GEOMESA-3061 Converters - support bytes in Avro top-level union types (#2762))
<<<<<<< HEAD
<<<<<<< HEAD
>>>>>>> 3dd99aed4 (GEOMESA-3061 Converters - support bytes in Avro top-level union types (#2762))
<<<<<<< HEAD
>>>>>>> dddc42e265 (GEOMESA-3061 Converters - support bytes in Avro top-level union types (#2762))
<<<<<<< HEAD
>>>>>>> 3bbe93d6c5 (GEOMESA-3061 Converters - support bytes in Avro top-level union types (#2762))
=======
=======
=======
=======
>>>>>>> 4fbe39c62 (GEOMESA-3061 Converters - support bytes in Avro top-level union types (#2762))
=======
=======

>>>>>>> b9bdd406e (GEOMESA-3061 Converters - support bytes in Avro top-level union types (#2762))
>>>>>>> 0e68e9f4c (GEOMESA-3061 Converters - support bytes in Avro top-level union types (#2762))
<<<<<<< HEAD
>>>>>>> 45ad5d11f (GEOMESA-3061 Converters - support bytes in Avro top-level union types (#2762))
<<<<<<< HEAD
>>>>>>> b009fd23f4 (GEOMESA-3061 Converters - support bytes in Avro top-level union types (#2762))
<<<<<<< HEAD
>>>>>>> 194ad4e5c0 (GEOMESA-3061 Converters - support bytes in Avro top-level union types (#2762))
=======
=======
=======
=======
>>>>>>> 15e998504 (GEOMESA-3176 Docs - fix download links in install instructions)
<<<<<<< HEAD
>>>>>>> baa90e85a (GEOMESA-3176 Docs - fix download links in install instructions)
<<<<<<< HEAD
>>>>>>> d969b4c2d5 (GEOMESA-3176 Docs - fix download links in install instructions)
<<<<<<< HEAD
>>>>>>> 2de87fb23b (GEOMESA-3176 Docs - fix download links in install instructions)
=======
=======
=======
=======
>>>>>>> 07a6a5c29 (GEOMESA-3061 Converters - support bytes in Avro top-level union types (#2762))
<<<<<<< HEAD
>>>>>>> 4524373ac (GEOMESA-3061 Converters - support bytes in Avro top-level union types (#2762))
<<<<<<< HEAD
>>>>>>> 4564a1634e (GEOMESA-3061 Converters - support bytes in Avro top-level union types (#2762))
<<<<<<< HEAD
>>>>>>> c6cc684d8c (GEOMESA-3061 Converters - support bytes in Avro top-level union types (#2762))
=======
=======
=======
=======
>>>>>>> 67b361c85 (GEOMESA-3061 Converters - support bytes in Avro top-level union types (#2762))
<<<<<<< HEAD
>>>>>>> dace2085b (GEOMESA-3061 Converters - support bytes in Avro top-level union types (#2762))
<<<<<<< HEAD
>>>>>>> 238945d4b3 (GEOMESA-3061 Converters - support bytes in Avro top-level union types (#2762))
<<<<<<< HEAD
>>>>>>> 7b3c90c53f (GEOMESA-3061 Converters - support bytes in Avro top-level union types (#2762))
=======
=======
=======
=======
=======
>>>>>>> 90ec70f55 (GEOMESA-3176 Docs - fix download links in install instructions)
>>>>>>> 63db7d154 (GEOMESA-3176 Docs - fix download links in install instructions)
<<<<<<< HEAD
>>>>>>> 46c05fed5 (GEOMESA-3176 Docs - fix download links in install instructions)
<<<<<<< HEAD
>>>>>>> f73ef99f1e (GEOMESA-3176 Docs - fix download links in install instructions)
<<<<<<< HEAD
>>>>>>> cd86312814 (GEOMESA-3176 Docs - fix download links in install instructions)
=======
=======
=======
=======
>>>>>>> 28e2bfa2d (GEOMESA-3061 Converters - support bytes in Avro top-level union types (#2762))
>>>>>>> 4fbe39c62 (GEOMESA-3061 Converters - support bytes in Avro top-level union types (#2762))
>>>>>>> be05354746 (GEOMESA-3061 Converters - support bytes in Avro top-level union types (#2762))
>>>>>>> 11763b5af8 (GEOMESA-3061 Converters - support bytes in Avro top-level union types (#2762))
=======
>>>>>>> bc4062951d (GEOMESA-3061 Converters - support bytes in Avro top-level union types (#2762))
>>>>>>> db9dfb6f14 (GEOMESA-3061 Converters - support bytes in Avro top-level union types (#2762))
=======
>>>>>>> e944f1c88b (Merge branch 'feature/postgis-fixes')
>>>>>>> f893d9a594 (Merge branch 'feature/postgis-fixes')
=======
=======
>>>>>>> 77f446aa59 (GEOMESA-3176 Docs - fix download links in install instructions)
>>>>>>> 81ee66102b (GEOMESA-3061 Converters - support bytes in Avro top-level union types (#2762))
<<<<<<< HEAD
>>>>>>> 8adfab65bb (GEOMESA-3061 Converters - support bytes in Avro top-level union types (#2762))
<<<<<<< HEAD
>>>>>>> b8ebbf6083 (GEOMESA-3061 Converters - support bytes in Avro top-level union types (#2762))
=======
=======
=======
=======
=======
=======
>>>>>>> 16e2b07c5b (GEOMESA-3061 Converters - support bytes in Avro top-level union types (#2762))
=======
>>>>>>> 6eb31fb65 (GEOMESA-3061 Converters - support bytes in Avro top-level union types (#2762))
=======
>>>>>>> 65b9e1925e (GEOMESA-3061 Converters - support bytes in Avro top-level union types (#2762))
=======
>>>>>>> 15e998504 (GEOMESA-3176 Docs - fix download links in install instructions)
=======
>>>>>>> 033543c609 (GEOMESA-3176 Docs - fix download links in install instructions)
=======
>>>>>>> 07a6a5c29 (GEOMESA-3061 Converters - support bytes in Avro top-level union types (#2762))
=======
>>>>>>> 9d2bdda5fd (GEOMESA-3061 Converters - support bytes in Avro top-level union types (#2762))

>>>>>>> b9bdd406e (GEOMESA-3061 Converters - support bytes in Avro top-level union types (#2762))
=======
>>>>>>> 16b2e83f2 (GEOMESA-3176 Docs - fix download links in install instructions)
<<<<<<< HEAD
<<<<<<< HEAD
<<<<<<< HEAD
<<<<<<< HEAD
>>>>>>> 2aa923cc9 (GEOMESA-3176 Docs - fix download links in install instructions)
<<<<<<< HEAD
>>>>>>> bdcaf0ab5e (GEOMESA-3176 Docs - fix download links in install instructions)
<<<<<<< HEAD
>>>>>>> 235bc2820d (GEOMESA-3176 Docs - fix download links in install instructions)
<<<<<<< HEAD
>>>>>>> 77f446aa59 (GEOMESA-3176 Docs - fix download links in install instructions)
=======
=======
=======
=======
=======
=======
>>>>>>> 0fbf9e83e (GEOMESA-3176 Docs - fix download links in install instructions)
=======
>>>>>>> 89bdd3013 (GEOMESA-3061 Converters - support bytes in Avro top-level union types (#2762))
<<<<<<< HEAD
=======
>>>>>>> 6eb31fb65 (GEOMESA-3061 Converters - support bytes in Avro top-level union types (#2762))
>>>>>>> 5f428db97 (GEOMESA-3061 Converters - support bytes in Avro top-level union types (#2762))
=======
>>>>>>> 07a6a5c29 (GEOMESA-3061 Converters - support bytes in Avro top-level union types (#2762))
=======
=======

>>>>>>> b9bdd406e (GEOMESA-3061 Converters - support bytes in Avro top-level union types (#2762))
>>>>>>> f71fa3c0e (GEOMESA-3061 Converters - support bytes in Avro top-level union types (#2762))
<<<<<<< HEAD
<<<<<<< HEAD
>>>>>>> c5e182765 (GEOMESA-3061 Converters - support bytes in Avro top-level union types (#2762))
<<<<<<< HEAD
>>>>>>> f9f6fde40b (GEOMESA-3061 Converters - support bytes in Avro top-level union types (#2762))
<<<<<<< HEAD
>>>>>>> 4a05f27ba4 (GEOMESA-3061 Converters - support bytes in Avro top-level union types (#2762))
<<<<<<< HEAD
>>>>>>> 16e2b07c5b (GEOMESA-3061 Converters - support bytes in Avro top-level union types (#2762))
=======
=======
=======
=======
<<<<<<< HEAD
>>>>>>> 89bdd3013 (GEOMESA-3061 Converters - support bytes in Avro top-level union types (#2762))
=======
<<<<<<< HEAD
>>>>>>> 5f428db97 (GEOMESA-3061 Converters - support bytes in Avro top-level union types (#2762))
=======
>>>>>>> 9d708b240 (GEOMESA-3061 Converters - support bytes in Avro top-level union types (#2762))
<<<<<<< HEAD
>>>>>>> 53a3e72cbf (GEOMESA-3061 Converters - support bytes in Avro top-level union types (#2762))
<<<<<<< HEAD
>>>>>>> 7b0539b808 (GEOMESA-3061 Converters - support bytes in Avro top-level union types (#2762))
<<<<<<< HEAD
>>>>>>> 3e7fb62639 (GEOMESA-3061 Converters - support bytes in Avro top-level union types (#2762))
=======
=======
=======
=======
=======
>>>>>>> 90ec70f55 (GEOMESA-3176 Docs - fix download links in install instructions)
<<<<<<< HEAD
>>>>>>> 8cbe155de (GEOMESA-3176 Docs - fix download links in install instructions)
<<<<<<< HEAD
>>>>>>> 8150bc0e65 (GEOMESA-3176 Docs - fix download links in install instructions)
<<<<<<< HEAD
>>>>>>> 256a642cc1 (GEOMESA-3176 Docs - fix download links in install instructions)
<<<<<<< HEAD
>>>>>>> eff03389ef (GEOMESA-3176 Docs - fix download links in install instructions)
=======
=======
=======
=======
=======
>>>>>>> 6eb31fb65 (GEOMESA-3061 Converters - support bytes in Avro top-level union types (#2762))
<<<<<<< HEAD
>>>>>>> 5f428db97 (GEOMESA-3061 Converters - support bytes in Avro top-level union types (#2762))
<<<<<<< HEAD
>>>>>>> 6a2cd10c1c (GEOMESA-3061 Converters - support bytes in Avro top-level union types (#2762))
<<<<<<< HEAD
>>>>>>> aceaf3bd81 (GEOMESA-3061 Converters - support bytes in Avro top-level union types (#2762))
<<<<<<< HEAD
>>>>>>> 65b9e1925e (GEOMESA-3061 Converters - support bytes in Avro top-level union types (#2762))
=======
=======
=======
=======
=======
=======

>>>>>>> b9bdd406e (GEOMESA-3061 Converters - support bytes in Avro top-level union types (#2762))
>>>>>>> 0e68e9f4c (GEOMESA-3061 Converters - support bytes in Avro top-level union types (#2762))
<<<<<<< HEAD
>>>>>>> 76618c8da (GEOMESA-3061 Converters - support bytes in Avro top-level union types (#2762))
<<<<<<< HEAD
>>>>>>> 947761ec9b (GEOMESA-3061 Converters - support bytes in Avro top-level union types (#2762))
<<<<<<< HEAD
>>>>>>> 0086b292ba (GEOMESA-3061 Converters - support bytes in Avro top-level union types (#2762))
<<<<<<< HEAD
>>>>>>> c2cfc968d2 (GEOMESA-3061 Converters - support bytes in Avro top-level union types (#2762))
=======
=======
=======
=======
=======
>>>>>>> 15e998504 (GEOMESA-3176 Docs - fix download links in install instructions)
<<<<<<< HEAD
>>>>>>> 0fbf9e83e (GEOMESA-3176 Docs - fix download links in install instructions)
<<<<<<< HEAD
>>>>>>> 4d9f87a514 (GEOMESA-3176 Docs - fix download links in install instructions)
<<<<<<< HEAD
>>>>>>> 7efa8bf5c8 (GEOMESA-3176 Docs - fix download links in install instructions)
<<<<<<< HEAD
>>>>>>> 033543c609 (GEOMESA-3176 Docs - fix download links in install instructions)
=======
=======
=======
=======
=======
>>>>>>> 07a6a5c29 (GEOMESA-3061 Converters - support bytes in Avro top-level union types (#2762))
=======
>>>>>>> 0fa73844a1 (GEOMESA-3061 Converters - support bytes in Avro top-level union types (#2762))
>>>>>>> 89bdd3013 (GEOMESA-3061 Converters - support bytes in Avro top-level union types (#2762))
<<<<<<< HEAD
>>>>>>> 8a6a96234b (GEOMESA-3061 Converters - support bytes in Avro top-level union types (#2762))
<<<<<<< HEAD
>>>>>>> 93c8cf1b3a (GEOMESA-3061 Converters - support bytes in Avro top-level union types (#2762))
<<<<<<< HEAD
>>>>>>> 9d2bdda5fd (GEOMESA-3061 Converters - support bytes in Avro top-level union types (#2762))
=======
=======
=======
=======
=======
>>>>>>> 67b361c85 (GEOMESA-3061 Converters - support bytes in Avro top-level union types (#2762))
=======
>>>>>>> 96b5e91bc8 (GEOMESA-3176 Docs - fix download links in install instructions)
>>>>>>> c8a325e13 (GEOMESA-3061 Converters - support bytes in Avro top-level union types (#2762))
<<<<<<< HEAD
>>>>>>> c9328eddce (GEOMESA-3061 Converters - support bytes in Avro top-level union types (#2762))
<<<<<<< HEAD
>>>>>>> e15d50d7d3 (GEOMESA-3061 Converters - support bytes in Avro top-level union types (#2762))
<<<<<<< HEAD
>>>>>>> 0fa73844a1 (GEOMESA-3061 Converters - support bytes in Avro top-level union types (#2762))
=======
=======
=======
=======
=======
=======
>>>>>>> 90ec70f55 (GEOMESA-3176 Docs - fix download links in install instructions)
>>>>>>> 63db7d154 (GEOMESA-3176 Docs - fix download links in install instructions)
=======
>>>>>>> 6e48efcdc2 (GEOMESA-3061 Converters - support bytes in Avro top-level union types (#2762))
>>>>>>> f9e8439b0 (GEOMESA-3176 Docs - fix download links in install instructions)
<<<<<<< HEAD
>>>>>>> bd3233180f (GEOMESA-3176 Docs - fix download links in install instructions)
<<<<<<< HEAD
>>>>>>> 94efcf84c2 (GEOMESA-3176 Docs - fix download links in install instructions)
<<<<<<< HEAD
>>>>>>> 96b5e91bc8 (GEOMESA-3176 Docs - fix download links in install instructions)
=======
=======
=======
=======
=======
>>>>>>> 28e2bfa2d (GEOMESA-3061 Converters - support bytes in Avro top-level union types (#2762))
>>>>>>> 72bafaf54 (GEOMESA-3061 Converters - support bytes in Avro top-level union types (#2762))
=======
>>>>>>> 63546aacdc (GEOMESA-3061 Converters - support bytes in Avro top-level union types (#2762))
>>>>>>> 0c734cda2b (GEOMESA-3061 Converters - support bytes in Avro top-level union types (#2762))
<<<<<<< HEAD
>>>>>>> 8929cbff5b (GEOMESA-3061 Converters - support bytes in Avro top-level union types (#2762))
<<<<<<< HEAD
>>>>>>> 6e48efcdc2 (GEOMESA-3061 Converters - support bytes in Avro top-level union types (#2762))
=======
=======
=======
=======
>>>>>>> 97ec7d864 (GEOMESA-3061 Converters - support bytes in Avro top-level union types (#2762))
=======
>>>>>>> 964e86145a (Merge branch 'feature/postgis-fixes')
>>>>>>> d94c03a98e (GEOMESA-3061 Converters - support bytes in Avro top-level union types (#2762))
<<<<<<< HEAD
>>>>>>> 8de43cccf6 (GEOMESA-3061 Converters - support bytes in Avro top-level union types (#2762))
<<<<<<< HEAD
>>>>>>> 63546aacdc (GEOMESA-3061 Converters - support bytes in Avro top-level union types (#2762))
=======
=======
=======
=======
=======
>>>>>>> 3be8d2a5a (Merge branch 'feature/postgis-fixes')
>>>>>>> db8d998aa (Merge branch 'feature/postgis-fixes')
=======
>>>>>>> b298e017f1 (GEOMESA-3254 Add Bloop build support)
>>>>>>> cb6bda89b6 (Merge branch 'feature/postgis-fixes')
<<<<<<< HEAD
>>>>>>> 26e5afc4ea (Merge branch 'feature/postgis-fixes')
<<<<<<< HEAD
>>>>>>> 964e86145a (Merge branch 'feature/postgis-fixes')
=======
=======
=======
=======
>>>>>>> d845d7c1b (GEOMESA-3254 Add Bloop build support)
=======
>>>>>>> 1ea8b10ac7 (GEOMESA-3061 Converters - support bytes in Avro top-level union types (#2762))
>>>>>>> 09d87762c5 (GEOMESA-3254 Add Bloop build support)
<<<<<<< HEAD
>>>>>>> 63a045a753 (GEOMESA-3254 Add Bloop build support)
<<<<<<< HEAD
>>>>>>> b298e017f1 (GEOMESA-3254 Add Bloop build support)
=======
=======
=======
=======
=======

>>>>>>> b9bdd406e (GEOMESA-3061 Converters - support bytes in Avro top-level union types (#2762))
>>>>>>> 6d9a5b626 (GEOMESA-3061 Converters - support bytes in Avro top-level union types (#2762))
=======
>>>>>>> 088d9e36a5 (GEOMESA-3176 Docs - fix download links in install instructions)
>>>>>>> 67e4c1354f (GEOMESA-3061 Converters - support bytes in Avro top-level union types (#2762))
<<<<<<< HEAD
>>>>>>> 12e3a588fc (GEOMESA-3061 Converters - support bytes in Avro top-level union types (#2762))
<<<<<<< HEAD
>>>>>>> 1ea8b10ac7 (GEOMESA-3061 Converters - support bytes in Avro top-level union types (#2762))
=======
=======
=======
=======
=======
=======
>>>>>>> 37ee765e9b (GEOMESA-3061 Converters - support bytes in Avro top-level union types (#2762))
=======
>>>>>>> 6eb31fb65 (GEOMESA-3061 Converters - support bytes in Avro top-level union types (#2762))
=======
>>>>>>> 83b11fa843 (GEOMESA-3061 Converters - support bytes in Avro top-level union types (#2762))
=======
>>>>>>> 15e998504 (GEOMESA-3176 Docs - fix download links in install instructions)
=======
>>>>>>> 2e65415d49 (GEOMESA-3176 Docs - fix download links in install instructions)
=======
>>>>>>> 07a6a5c29 (GEOMESA-3061 Converters - support bytes in Avro top-level union types (#2762))
=======
>>>>>>> 1c9a51a667 (GEOMESA-3061 Converters - support bytes in Avro top-level union types (#2762))

>>>>>>> b9bdd406e (GEOMESA-3061 Converters - support bytes in Avro top-level union types (#2762))
=======
>>>>>>> 16b2e83f2 (GEOMESA-3176 Docs - fix download links in install instructions)
<<<<<<< HEAD
<<<<<<< HEAD
<<<<<<< HEAD
<<<<<<< HEAD
>>>>>>> 10ade3dcd (GEOMESA-3176 Docs - fix download links in install instructions)
<<<<<<< HEAD
>>>>>>> 703374130f (GEOMESA-3176 Docs - fix download links in install instructions)
<<<<<<< HEAD
>>>>>>> 93fa8c797f (GEOMESA-3176 Docs - fix download links in install instructions)
<<<<<<< HEAD
>>>>>>> 088d9e36a5 (GEOMESA-3176 Docs - fix download links in install instructions)
=======
=======
=======
=======
=======
=======
>>>>>>> 4b70e7f8f (GEOMESA-3176 Docs - fix download links in install instructions)
=======
>>>>>>> 85663f71c (GEOMESA-3061 Converters - support bytes in Avro top-level union types (#2762))
<<<<<<< HEAD
=======
>>>>>>> 6eb31fb65 (GEOMESA-3061 Converters - support bytes in Avro top-level union types (#2762))
>>>>>>> 23c024179 (GEOMESA-3061 Converters - support bytes in Avro top-level union types (#2762))
=======
>>>>>>> 07a6a5c29 (GEOMESA-3061 Converters - support bytes in Avro top-level union types (#2762))
=======
=======

>>>>>>> b9bdd406e (GEOMESA-3061 Converters - support bytes in Avro top-level union types (#2762))
>>>>>>> f71fa3c0e (GEOMESA-3061 Converters - support bytes in Avro top-level union types (#2762))
<<<<<<< HEAD
<<<<<<< HEAD
>>>>>>> 947a867d1 (GEOMESA-3061 Converters - support bytes in Avro top-level union types (#2762))
<<<<<<< HEAD
>>>>>>> 748532d2db (GEOMESA-3061 Converters - support bytes in Avro top-level union types (#2762))
<<<<<<< HEAD
>>>>>>> c82dea9d29 (GEOMESA-3061 Converters - support bytes in Avro top-level union types (#2762))
<<<<<<< HEAD
>>>>>>> 37ee765e9b (GEOMESA-3061 Converters - support bytes in Avro top-level union types (#2762))
=======
=======
=======
=======
<<<<<<< HEAD
>>>>>>> 85663f71c (GEOMESA-3061 Converters - support bytes in Avro top-level union types (#2762))
=======
<<<<<<< HEAD
>>>>>>> 23c024179 (GEOMESA-3061 Converters - support bytes in Avro top-level union types (#2762))
=======
>>>>>>> e6e1f4bdd (GEOMESA-3061 Converters - support bytes in Avro top-level union types (#2762))
<<<<<<< HEAD
>>>>>>> 8035cc5893 (GEOMESA-3061 Converters - support bytes in Avro top-level union types (#2762))
<<<<<<< HEAD
>>>>>>> 1890b11217 (GEOMESA-3061 Converters - support bytes in Avro top-level union types (#2762))
<<<<<<< HEAD
>>>>>>> b800c052cc (GEOMESA-3061 Converters - support bytes in Avro top-level union types (#2762))
=======
=======
=======
=======
=======
>>>>>>> 90ec70f55 (GEOMESA-3176 Docs - fix download links in install instructions)
<<<<<<< HEAD
>>>>>>> 279de44d3 (GEOMESA-3176 Docs - fix download links in install instructions)
<<<<<<< HEAD
>>>>>>> b7c6b904be (GEOMESA-3176 Docs - fix download links in install instructions)
<<<<<<< HEAD
>>>>>>> 2142d07ded (GEOMESA-3176 Docs - fix download links in install instructions)
<<<<<<< HEAD
>>>>>>> b7b8a67dc7 (GEOMESA-3176 Docs - fix download links in install instructions)
=======
=======
=======
=======
=======
>>>>>>> 6eb31fb65 (GEOMESA-3061 Converters - support bytes in Avro top-level union types (#2762))
<<<<<<< HEAD
>>>>>>> 23c024179 (GEOMESA-3061 Converters - support bytes in Avro top-level union types (#2762))
<<<<<<< HEAD
>>>>>>> 250f01786f (GEOMESA-3061 Converters - support bytes in Avro top-level union types (#2762))
<<<<<<< HEAD
>>>>>>> a398ab1183 (GEOMESA-3061 Converters - support bytes in Avro top-level union types (#2762))
<<<<<<< HEAD
>>>>>>> 83b11fa843 (GEOMESA-3061 Converters - support bytes in Avro top-level union types (#2762))
=======
=======
=======
=======
=======
=======

>>>>>>> b9bdd406e (GEOMESA-3061 Converters - support bytes in Avro top-level union types (#2762))
>>>>>>> 0e68e9f4c (GEOMESA-3061 Converters - support bytes in Avro top-level union types (#2762))
<<<<<<< HEAD
>>>>>>> a910ae135 (GEOMESA-3061 Converters - support bytes in Avro top-level union types (#2762))
<<<<<<< HEAD
>>>>>>> 07161eaaa6 (GEOMESA-3061 Converters - support bytes in Avro top-level union types (#2762))
<<<<<<< HEAD
>>>>>>> 9c28193a91 (GEOMESA-3061 Converters - support bytes in Avro top-level union types (#2762))
<<<<<<< HEAD
>>>>>>> 9dbe1503e8 (GEOMESA-3061 Converters - support bytes in Avro top-level union types (#2762))
=======
=======
=======
=======
=======
>>>>>>> 15e998504 (GEOMESA-3176 Docs - fix download links in install instructions)
<<<<<<< HEAD
>>>>>>> 4b70e7f8f (GEOMESA-3176 Docs - fix download links in install instructions)
<<<<<<< HEAD
>>>>>>> b42125fac1 (GEOMESA-3176 Docs - fix download links in install instructions)
<<<<<<< HEAD
>>>>>>> a8d6366d72 (GEOMESA-3176 Docs - fix download links in install instructions)
<<<<<<< HEAD
>>>>>>> 2e65415d49 (GEOMESA-3176 Docs - fix download links in install instructions)
=======
=======
=======
=======
=======
>>>>>>> 07a6a5c29 (GEOMESA-3061 Converters - support bytes in Avro top-level union types (#2762))
=======
>>>>>>> 6e30236dd2 (GEOMESA-3061 Converters - support bytes in Avro top-level union types (#2762))
>>>>>>> 85663f71c (GEOMESA-3061 Converters - support bytes in Avro top-level union types (#2762))
<<<<<<< HEAD
>>>>>>> 813488e18c (GEOMESA-3061 Converters - support bytes in Avro top-level union types (#2762))
<<<<<<< HEAD
>>>>>>> 6f30a087ee (GEOMESA-3061 Converters - support bytes in Avro top-level union types (#2762))
<<<<<<< HEAD
>>>>>>> 1c9a51a667 (GEOMESA-3061 Converters - support bytes in Avro top-level union types (#2762))
=======
=======
=======
=======
=======
>>>>>>> 67b361c85 (GEOMESA-3061 Converters - support bytes in Avro top-level union types (#2762))
=======
>>>>>>> 5603dc69a0 (GEOMESA-3176 Docs - fix download links in install instructions)
>>>>>>> ad3cedc4d (GEOMESA-3061 Converters - support bytes in Avro top-level union types (#2762))
<<<<<<< HEAD
>>>>>>> 9abc630fdf (GEOMESA-3061 Converters - support bytes in Avro top-level union types (#2762))
<<<<<<< HEAD
>>>>>>> d294ce49e2 (GEOMESA-3061 Converters - support bytes in Avro top-level union types (#2762))
<<<<<<< HEAD
>>>>>>> 6e30236dd2 (GEOMESA-3061 Converters - support bytes in Avro top-level union types (#2762))
=======
=======
=======
=======
=======
=======
>>>>>>> 90ec70f55 (GEOMESA-3176 Docs - fix download links in install instructions)
>>>>>>> 63db7d154 (GEOMESA-3176 Docs - fix download links in install instructions)
=======
>>>>>>> f958055259 (GEOMESA-3061 Converters - support bytes in Avro top-level union types (#2762))
>>>>>>> a12ea194c (GEOMESA-3176 Docs - fix download links in install instructions)
<<<<<<< HEAD
>>>>>>> 5c3f315bc0 (GEOMESA-3176 Docs - fix download links in install instructions)
<<<<<<< HEAD
>>>>>>> b041fcc3eb (GEOMESA-3176 Docs - fix download links in install instructions)
<<<<<<< HEAD
>>>>>>> 5603dc69a0 (GEOMESA-3176 Docs - fix download links in install instructions)
=======
=======
=======
=======
=======
>>>>>>> 28e2bfa2d (GEOMESA-3061 Converters - support bytes in Avro top-level union types (#2762))
>>>>>>> d4c5768cf (GEOMESA-3061 Converters - support bytes in Avro top-level union types (#2762))
=======
>>>>>>> dbd932fed6 (GEOMESA-3061 Converters - support bytes in Avro top-level union types (#2762))
>>>>>>> fe51719bc6 (GEOMESA-3061 Converters - support bytes in Avro top-level union types (#2762))
<<<<<<< HEAD
>>>>>>> 3acb47e615 (GEOMESA-3061 Converters - support bytes in Avro top-level union types (#2762))
<<<<<<< HEAD
>>>>>>> f958055259 (GEOMESA-3061 Converters - support bytes in Avro top-level union types (#2762))
=======
=======
=======
=======
>>>>>>> bdbced26d (GEOMESA-3061 Converters - support bytes in Avro top-level union types (#2762))
=======
>>>>>>> bf6bde0830 (Merge branch 'feature/postgis-fixes')
>>>>>>> 25063957fc (GEOMESA-3061 Converters - support bytes in Avro top-level union types (#2762))
<<<<<<< HEAD
>>>>>>> 1df8328338 (GEOMESA-3061 Converters - support bytes in Avro top-level union types (#2762))
<<<<<<< HEAD
>>>>>>> dbd932fed6 (GEOMESA-3061 Converters - support bytes in Avro top-level union types (#2762))
=======
=======
=======
=======
=======
>>>>>>> 3be8d2a5a (Merge branch 'feature/postgis-fixes')
>>>>>>> 1b25d7ddb (Merge branch 'feature/postgis-fixes')
>>>>>>> 699117eca9 (Merge branch 'feature/postgis-fixes')
>>>>>>> c69897d7bd (Merge branch 'feature/postgis-fixes')
>>>>>>> bf6bde0830 (Merge branch 'feature/postgis-fixes')
=======
>>>>>>> 9293965a7d (GEOMESA-3061 Converters - support bytes in Avro top-level union types (#2762))
=======
>>>>>>> 308738bcef (GEOMESA-3176 Docs - fix download links in install instructions)
<<<<<<< HEAD
>>>>>>> 731987cbc8 (GEOMESA-3176 Docs - fix download links in install instructions)
=======
=======
>>>>>>> c1f99f4bcb (GEOMESA-3061 Converters - support bytes in Avro top-level union types (#2762))
>>>>>>> 2bce465a3f (GEOMESA-3061 Converters - support bytes in Avro top-level union types (#2762))
=======
=======
>>>>>>> c3c5dd0ebb (GEOMESA-3061 Converters - support bytes in Avro top-level union types (#2762))
<<<<<<< HEAD
>>>>>>> 058fd96baa (GEOMESA-3061 Converters - support bytes in Avro top-level union types (#2762))
=======
=======
=======
>>>>>>> 90ec70f55 (GEOMESA-3176 Docs - fix download links in install instructions)
>>>>>>> 8b8075f529 (GEOMESA-3176 Docs - fix download links in install instructions)
<<<<<<< HEAD
>>>>>>> 13325d17c4 (GEOMESA-3176 Docs - fix download links in install instructions)
=======
=======
=======
>>>>>>> 6eb31fb65 (GEOMESA-3061 Converters - support bytes in Avro top-level union types (#2762))
>>>>>>> 338d952d43 (GEOMESA-3061 Converters - support bytes in Avro top-level union types (#2762))
<<<<<<< HEAD
>>>>>>> 1f17117603 (GEOMESA-3061 Converters - support bytes in Avro top-level union types (#2762))
=======
=======
>>>>>>> 4c361f07da (GEOMESA-3061 Converters - support bytes in Avro top-level union types (#2762))
<<<<<<< HEAD
>>>>>>> c22ecd64c3 (GEOMESA-3061 Converters - support bytes in Avro top-level union types (#2762))
=======
=======
=======
>>>>>>> 15e998504 (GEOMESA-3176 Docs - fix download links in install instructions)
>>>>>>> 64e2e43818 (GEOMESA-3176 Docs - fix download links in install instructions)
>>>>>>> e5cf96e863 (GEOMESA-3176 Docs - fix download links in install instructions)
=======
>>>>>>> 732efe4910 (GEOMESA-3061 Converters - support bytes in Avro top-level union types (#2762))
=======
=======
>>>>>>> f302a54949 (GEOMESA-3061 Converters - support bytes in Avro top-level union types (#2762))
>>>>>>> 2a887f75bf (GEOMESA-3061 Converters - support bytes in Avro top-level union types (#2762))
=======
>>>>>>> d72089513c (GEOMESA-3176 Docs - fix download links in install instructions)
=======
=======
>>>>>>> 28e2bfa2d (GEOMESA-3061 Converters - support bytes in Avro top-level union types (#2762))
>>>>>>> 76908c410a (GEOMESA-3061 Converters - support bytes in Avro top-level union types (#2762))
>>>>>>> f91e29a57f (GEOMESA-3061 Converters - support bytes in Avro top-level union types (#2762))
=======
>>>>>>> a788dfac03 (GEOMESA-3061 Converters - support bytes in Avro top-level union types (#2762))
>>>>>>> b08cb4d818 (GEOMESA-3061 Converters - support bytes in Avro top-level union types (#2762))
=======
>>>>>>> 354b5e5ae5 (Merge branch 'feature/postgis-fixes')
=======
>>>>>>> ac217b392d (GEOMESA-3061 Converters - support bytes in Avro top-level union types (#2762))
=======
=======
>>>>>>> 983d0b0983 (GEOMESA-3176 Docs - fix download links in install instructions)
>>>>>>> 4fd46f4f99 (GEOMESA-3176 Docs - fix download links in install instructions)
=======
>>>>>>> b8be7d30a1 (GEOMESA-3061 Converters - support bytes in Avro top-level union types (#2762))
=======
=======
>>>>>>> d1fa26b39d (GEOMESA-3061 Converters - support bytes in Avro top-level union types (#2762))
>>>>>>> e7d6b701c8 (GEOMESA-3061 Converters - support bytes in Avro top-level union types (#2762))
=======
>>>>>>> 2de4be5460 (GEOMESA-3176 Docs - fix download links in install instructions)
=======
=======
>>>>>>> 988874c83e (GEOMESA-3061 Converters - support bytes in Avro top-level union types (#2762))
=======
>>>>>>> 437d0aab1c (GEOMESA-3061 Converters - support bytes in Avro top-level union types (#2762))
>>>>>>> 6eb31fb652 (GEOMESA-3061 Converters - support bytes in Avro top-level union types (#2762))
<<<<<<< HEAD
>>>>>>> ffe4f9fd41 (GEOMESA-3061 Converters - support bytes in Avro top-level union types (#2762))
<<<<<<< HEAD
>>>>>>> 789f6eba49 (GEOMESA-3061 Converters - support bytes in Avro top-level union types (#2762))
=======
=======
=======
>>>>>>> 67b361c856 (GEOMESA-3061 Converters - support bytes in Avro top-level union types (#2762))
=======
>>>>>>> 28e2bfa2dc (GEOMESA-3061 Converters - support bytes in Avro top-level union types (#2762))
=======
=======

>>>>>>> b9bdd406e (GEOMESA-3061 Converters - support bytes in Avro top-level union types (#2762))
<<<<<<< HEAD
>>>>>>> 0e68e9f4cc (GEOMESA-3061 Converters - support bytes in Avro top-level union types (#2762))
<<<<<<< HEAD
>>>>>>> f67dd3371e (GEOMESA-3061 Converters - support bytes in Avro top-level union types (#2762))
<<<<<<< HEAD
>>>>>>> 95e52e061e (GEOMESA-3061 Converters - support bytes in Avro top-level union types (#2762))
=======
=======
=======
=======

>>>>>>> b9bdd406e (GEOMESA-3061 Converters - support bytes in Avro top-level union types (#2762))
=======
>>>>>>> 16b2e83f2 (GEOMESA-3176 Docs - fix download links in install instructions)
>>>>>>> 15e9985047 (GEOMESA-3176 Docs - fix download links in install instructions)
<<<<<<< HEAD
>>>>>>> d25af58f86 (GEOMESA-3176 Docs - fix download links in install instructions)
<<<<<<< HEAD
>>>>>>> 6f1e1da646 (GEOMESA-3176 Docs - fix download links in install instructions)
=======
=======
=======
>>>>>>> 07a6a5c291 (GEOMESA-3061 Converters - support bytes in Avro top-level union types (#2762))
<<<<<<< HEAD
>>>>>>> ecddd8c3e7 (GEOMESA-3061 Converters - support bytes in Avro top-level union types (#2762))
<<<<<<< HEAD
>>>>>>> 4fc0f66d4f (GEOMESA-3061 Converters - support bytes in Avro top-level union types (#2762))
=======
=======
=======
>>>>>>> cdb410251 (GEOMESA-3061 Converters - support bytes in Avro top-level union types (#2762))
<<<<<<< HEAD
>>>>>>> 67b361c856 (GEOMESA-3061 Converters - support bytes in Avro top-level union types (#2762))
<<<<<<< HEAD
>>>>>>> f7cef54062 (GEOMESA-3061 Converters - support bytes in Avro top-level union types (#2762))
<<<<<<< HEAD
>>>>>>> 988874c83e (GEOMESA-3061 Converters - support bytes in Avro top-level union types (#2762))
=======
=======
=======
=======
>>>>>>> 90ec70f55 (GEOMESA-3176 Docs - fix download links in install instructions)
<<<<<<< HEAD
>>>>>>> 63db7d154a (GEOMESA-3176 Docs - fix download links in install instructions)
<<<<<<< HEAD
>>>>>>> 9c39003417 (GEOMESA-3176 Docs - fix download links in install instructions)
<<<<<<< HEAD
>>>>>>> ef8de676d3 (GEOMESA-3176 Docs - fix download links in install instructions)
=======
=======
=======
=======
>>>>>>> 6eb31fb65 (GEOMESA-3061 Converters - support bytes in Avro top-level union types (#2762))
>>>>>>> 28e2bfa2dc (GEOMESA-3061 Converters - support bytes in Avro top-level union types (#2762))
<<<<<<< HEAD
>>>>>>> 036a470d76 (GEOMESA-3061 Converters - support bytes in Avro top-level union types (#2762))
<<<<<<< HEAD
>>>>>>> 437d0aab1c (GEOMESA-3061 Converters - support bytes in Avro top-level union types (#2762))
=======
=======
=======
=======

>>>>>>> b9bdd406e (GEOMESA-3061 Converters - support bytes in Avro top-level union types (#2762))
>>>>>>> b4320946b4 (GEOMESA-3061 Converters - support bytes in Avro top-level union types (#2762))
<<<<<<< HEAD
>>>>>>> a16b64a4d1 (GEOMESA-3061 Converters - support bytes in Avro top-level union types (#2762))
<<<<<<< HEAD
>>>>>>> aea9fbe131 (GEOMESA-3061 Converters - support bytes in Avro top-level union types (#2762))
=======
=======
=======
>>>>>>> 3be8d2a5a4 (Merge branch 'feature/postgis-fixes')
<<<<<<< HEAD
>>>>>>> 34472778d3 (Merge branch 'feature/postgis-fixes')
<<<<<<< HEAD
>>>>>>> d581fa3e8f (Merge branch 'feature/postgis-fixes')
=======
=======
=======
=======

>>>>>>> b9bdd406e (GEOMESA-3061 Converters - support bytes in Avro top-level union types (#2762))
>>>>>>> d9ed077cd1 (GEOMESA-3061 Converters - support bytes in Avro top-level union types (#2762))
>>>>>>> 810876750d (GEOMESA-3061 Converters - support bytes in Avro top-level union types (#2762))
>>>>>>> 5a55bf9756 (GEOMESA-3061 Converters - support bytes in Avro top-level union types (#2762))
=======
>>>>>>> 419e2b9752 (GEOMESA-3176 Docs - fix download links in install instructions)
>>>>>>> b68ae6197f (GEOMESA-3176 Docs - fix download links in install instructions)
=======
>>>>>>> 269558cf9e (GEOMESA-3061 Converters - support bytes in Avro top-level union types (#2762))
>>>>>>> 23fc8cb805 (GEOMESA-3061 Converters - support bytes in Avro top-level union types (#2762))
=======
>>>>>>> d206a68a13 (GEOMESA-3061 Converters - support bytes in Avro top-level union types (#2762))
>>>>>>> e0c2527549 (GEOMESA-3061 Converters - support bytes in Avro top-level union types (#2762))
=======
>>>>>>> 3b4f3da2e1 (GEOMESA-3176 Docs - fix download links in install instructions)
>>>>>>> b47097b7bb (GEOMESA-3176 Docs - fix download links in install instructions)
=======
>>>>>>> ad7067b815 (GEOMESA-3061 Converters - support bytes in Avro top-level union types (#2762))
>>>>>>> 99a32a726d (GEOMESA-3061 Converters - support bytes in Avro top-level union types (#2762))
=======
=======
>>>>>>> 95f020af8c (GEOMESA-3176 Docs - fix download links in install instructions)
>>>>>>> 76618c8da3 (GEOMESA-3061 Converters - support bytes in Avro top-level union types (#2762))
<<<<<<< HEAD
>>>>>>> 694bcd3776 (GEOMESA-3061 Converters - support bytes in Avro top-level union types (#2762))
<<<<<<< HEAD
>>>>>>> cb5e2daf2b (GEOMESA-3061 Converters - support bytes in Avro top-level union types (#2762))
=======
=======
=======
=======
>>>>>>> 15e998504 (GEOMESA-3176 Docs - fix download links in install instructions)
=======
>>>>>>> 02bb344987 (GEOMESA-3061 Converters - support bytes in Avro top-level union types (#2762))
>>>>>>> 0fbf9e83e2 (GEOMESA-3176 Docs - fix download links in install instructions)
<<<<<<< HEAD
>>>>>>> 17c1f8a18c (GEOMESA-3176 Docs - fix download links in install instructions)
<<<<<<< HEAD
>>>>>>> 95f020af8c (GEOMESA-3176 Docs - fix download links in install instructions)
=======
=======
=======
=======
>>>>>>> 07a6a5c29 (GEOMESA-3061 Converters - support bytes in Avro top-level union types (#2762))
=======
>>>>>>> 00e61f4b70 (GEOMESA-3061 Converters - support bytes in Avro top-level union types (#2762))
>>>>>>> 89bdd3013e (GEOMESA-3061 Converters - support bytes in Avro top-level union types (#2762))
<<<<<<< HEAD
>>>>>>> e3976d40bc (GEOMESA-3061 Converters - support bytes in Avro top-level union types (#2762))
<<<<<<< HEAD
>>>>>>> 02bb344987 (GEOMESA-3061 Converters - support bytes in Avro top-level union types (#2762))
=======
=======
=======
=======
>>>>>>> 67b361c85 (GEOMESA-3061 Converters - support bytes in Avro top-level union types (#2762))
=======
>>>>>>> 26c7d06850 (GEOMESA-3176 Docs - fix download links in install instructions)
>>>>>>> c8a325e13c (GEOMESA-3061 Converters - support bytes in Avro top-level union types (#2762))
<<<<<<< HEAD
>>>>>>> 6cd1151639 (GEOMESA-3061 Converters - support bytes in Avro top-level union types (#2762))
<<<<<<< HEAD
>>>>>>> 00e61f4b70 (GEOMESA-3061 Converters - support bytes in Avro top-level union types (#2762))
=======
=======
=======
=======
=======
>>>>>>> 90ec70f55 (GEOMESA-3176 Docs - fix download links in install instructions)
>>>>>>> 63db7d154 (GEOMESA-3176 Docs - fix download links in install instructions)
=======
>>>>>>> a512d6b917 (GEOMESA-3061 Converters - support bytes in Avro top-level union types (#2762))
>>>>>>> f9e8439b09 (GEOMESA-3176 Docs - fix download links in install instructions)
<<<<<<< HEAD
>>>>>>> 82d93995e4 (GEOMESA-3176 Docs - fix download links in install instructions)
<<<<<<< HEAD
>>>>>>> 26c7d06850 (GEOMESA-3176 Docs - fix download links in install instructions)
=======
=======
=======
=======
>>>>>>> 28e2bfa2d (GEOMESA-3061 Converters - support bytes in Avro top-level union types (#2762))
=======
>>>>>>> 4864cfc581 (GEOMESA-3061 Converters - support bytes in Avro top-level union types (#2762))
>>>>>>> 72bafaf54b (GEOMESA-3061 Converters - support bytes in Avro top-level union types (#2762))
<<<<<<< HEAD
>>>>>>> 7dfac253b4 (GEOMESA-3061 Converters - support bytes in Avro top-level union types (#2762))
<<<<<<< HEAD
>>>>>>> a512d6b917 (GEOMESA-3061 Converters - support bytes in Avro top-level union types (#2762))
=======
=======
=======
=======
>>>>>>> 498d1c9c26 (GEOMESA-3061 Converters - support bytes in Avro top-level union types (#2762))
=======
=======

>>>>>>> b9bdd406e (GEOMESA-3061 Converters - support bytes in Avro top-level union types (#2762))
>>>>>>> b4320946b (GEOMESA-3061 Converters - support bytes in Avro top-level union types (#2762))
<<<<<<< HEAD
<<<<<<< HEAD
=======
>>>>>>> 264c9fa240 (Merge branch 'feature/postgis-fixes')
>>>>>>> 97ec7d864a (GEOMESA-3061 Converters - support bytes in Avro top-level union types (#2762))
<<<<<<< HEAD
>>>>>>> 1973f72e77 (GEOMESA-3061 Converters - support bytes in Avro top-level union types (#2762))
<<<<<<< HEAD
>>>>>>> 4864cfc581 (GEOMESA-3061 Converters - support bytes in Avro top-level union types (#2762))
=======
=======
=======
=======
>>>>>>> 3be8d2a5a (Merge branch 'feature/postgis-fixes')
>>>>>>> db8d998aa2 (Merge branch 'feature/postgis-fixes')
>>>>>>> 42e8565e9b (Merge branch 'feature/postgis-fixes')
>>>>>>> 264c9fa240 (Merge branch 'feature/postgis-fixes')
=======
>>>>>>> f1532f2313 (GEOMESA-3254 Add Bloop build support)
>>>>>>> c738f63bd9 (GEOMESA-3254 Add Bloop build support)
=======
>>>>>>> 96d5d442fa (GEOMESA-3061 Converters - support bytes in Avro top-level union types (#2762))
>>>>>>> 3676d4e56a (GEOMESA-3061 Converters - support bytes in Avro top-level union types (#2762))
=======
>>>>>>> 86bc039842 (GEOMESA-3176 Docs - fix download links in install instructions)
>>>>>>> 3f60902092 (GEOMESA-3176 Docs - fix download links in install instructions)
=======
>>>>>>> 6150564577 (GEOMESA-3061 Converters - support bytes in Avro top-level union types (#2762))
>>>>>>> 8111fd4732 (GEOMESA-3061 Converters - support bytes in Avro top-level union types (#2762))
=======
>>>>>>> 5dcf23da52 (GEOMESA-3061 Converters - support bytes in Avro top-level union types (#2762))
>>>>>>> 60b4637548 (GEOMESA-3061 Converters - support bytes in Avro top-level union types (#2762))
=======
>>>>>>> 449fb2085b (GEOMESA-3176 Docs - fix download links in install instructions)
>>>>>>> 5fa9f37061 (GEOMESA-3176 Docs - fix download links in install instructions)
=======
>>>>>>> b2177e9015 (GEOMESA-3061 Converters - support bytes in Avro top-level union types (#2762))
=======
=======
>>>>>>> 92674ff9d4 (GEOMESA-3061 Converters - support bytes in Avro top-level union types (#2762))
>>>>>>> 009a284072 (GEOMESA-3061 Converters - support bytes in Avro top-level union types (#2762))
=======
>>>>>>> 955de6bfcc (GEOMESA-3176 Docs - fix download links in install instructions)
=======
=======
>>>>>>> 7ec7e43c91 (GEOMESA-3061 Converters - support bytes in Avro top-level union types (#2762))
>>>>>>> 897de97047 (GEOMESA-3061 Converters - support bytes in Avro top-level union types (#2762))
=======
>>>>>>> 7b8c8dcc3d (GEOMESA-3061 Converters - support bytes in Avro top-level union types (#2762))
=======
>>>>>>> 057f644239 (GEOMESA-3176 Docs - fix download links in install instructions)
=======
=======
>>>>>>> 2586fa6a40 (GEOMESA-3061 Converters - support bytes in Avro top-level union types (#2762))
>>>>>>> d329320e6a (GEOMESA-3061 Converters - support bytes in Avro top-level union types (#2762))
=======
>>>>>>> c029a43a6c (GEOMESA-3061 Converters - support bytes in Avro top-level union types (#2762))
=======
=======
>>>>>>> 67de3c3202 (Merge branch 'feature/postgis-fixes')
>>>>>>> 217b7d1cb9 (Merge branch 'feature/postgis-fixes')
=======
=======
>>>>>>> 682ce8edbb (GEOMESA-3176 Docs - fix download links in install instructions)
>>>>>>> 0dbede148d (GEOMESA-3061 Converters - support bytes in Avro top-level union types (#2762))
<<<<<<< HEAD
>>>>>>> 1bb69524c2 (GEOMESA-3061 Converters - support bytes in Avro top-level union types (#2762))
<<<<<<< HEAD
>>>>>>> a5b0374ee2 (GEOMESA-3061 Converters - support bytes in Avro top-level union types (#2762))
=======
=======
=======
=======
=======
=======
>>>>>>> d196efd6f7 (GEOMESA-3061 Converters - support bytes in Avro top-level union types (#2762))
=======
>>>>>>> 6eb31fb65 (GEOMESA-3061 Converters - support bytes in Avro top-level union types (#2762))
=======
>>>>>>> 5a365695e1 (GEOMESA-3061 Converters - support bytes in Avro top-level union types (#2762))
=======
>>>>>>> 15e998504 (GEOMESA-3176 Docs - fix download links in install instructions)
=======
>>>>>>> f40ce84a61 (GEOMESA-3176 Docs - fix download links in install instructions)
=======
>>>>>>> 07a6a5c29 (GEOMESA-3061 Converters - support bytes in Avro top-level union types (#2762))
=======
>>>>>>> 3ae7021103 (GEOMESA-3061 Converters - support bytes in Avro top-level union types (#2762))
=======
>>>>>>> 73770612e0 (GEOMESA-3061 Converters - support bytes in Avro top-level union types (#2762))
=======
>>>>>>> e4f52faffa (GEOMESA-3176 Docs - fix download links in install instructions)

>>>>>>> b9bdd406e (GEOMESA-3061 Converters - support bytes in Avro top-level union types (#2762))
=======
>>>>>>> 16b2e83f2 (GEOMESA-3176 Docs - fix download links in install instructions)
<<<<<<< HEAD
<<<<<<< HEAD
<<<<<<< HEAD
<<<<<<< HEAD
<<<<<<< HEAD
>>>>>>> 7813a31aa (GEOMESA-3176 Docs - fix download links in install instructions)
<<<<<<< HEAD
>>>>>>> 71c56e6b77 (GEOMESA-3176 Docs - fix download links in install instructions)
<<<<<<< HEAD
>>>>>>> e007dde981 (GEOMESA-3176 Docs - fix download links in install instructions)
<<<<<<< HEAD
>>>>>>> 682ce8edbb (GEOMESA-3176 Docs - fix download links in install instructions)
=======
=======
=======
=======
=======
=======
>>>>>>> baa90e85a (GEOMESA-3176 Docs - fix download links in install instructions)
=======
>>>>>>> 4524373ac (GEOMESA-3061 Converters - support bytes in Avro top-level union types (#2762))
=======
>>>>>>> 46c05fed5 (GEOMESA-3176 Docs - fix download links in install instructions)
<<<<<<< HEAD
=======
>>>>>>> 6eb31fb65 (GEOMESA-3061 Converters - support bytes in Avro top-level union types (#2762))
>>>>>>> 3dd99aed4 (GEOMESA-3061 Converters - support bytes in Avro top-level union types (#2762))
=======
>>>>>>> 07a6a5c29 (GEOMESA-3061 Converters - support bytes in Avro top-level union types (#2762))
=======
>>>>>>> 63db7d154 (GEOMESA-3176 Docs - fix download links in install instructions)
=======
=======

>>>>>>> b9bdd406e (GEOMESA-3061 Converters - support bytes in Avro top-level union types (#2762))
>>>>>>> f71fa3c0e (GEOMESA-3061 Converters - support bytes in Avro top-level union types (#2762))
<<<<<<< HEAD
<<<<<<< HEAD
<<<<<<< HEAD
>>>>>>> e847488d8 (GEOMESA-3061 Converters - support bytes in Avro top-level union types (#2762))
<<<<<<< HEAD
>>>>>>> e27137ff78 (GEOMESA-3061 Converters - support bytes in Avro top-level union types (#2762))
<<<<<<< HEAD
>>>>>>> 66c2e4df7e (GEOMESA-3061 Converters - support bytes in Avro top-level union types (#2762))
<<<<<<< HEAD
>>>>>>> d196efd6f7 (GEOMESA-3061 Converters - support bytes in Avro top-level union types (#2762))
=======
=======
=======
=======
<<<<<<< HEAD
=======
>>>>>>> 67b361c85 (GEOMESA-3061 Converters - support bytes in Avro top-level union types (#2762))
>>>>>>> dace2085b (GEOMESA-3061 Converters - support bytes in Avro top-level union types (#2762))
=======
<<<<<<< HEAD
>>>>>>> 4524373ac (GEOMESA-3061 Converters - support bytes in Avro top-level union types (#2762))
=======
<<<<<<< HEAD
>>>>>>> 3dd99aed4 (GEOMESA-3061 Converters - support bytes in Avro top-level union types (#2762))
=======
>>>>>>> 240977229 (GEOMESA-3061 Converters - support bytes in Avro top-level union types (#2762))
<<<<<<< HEAD
>>>>>>> 22dcc8170f (GEOMESA-3061 Converters - support bytes in Avro top-level union types (#2762))
<<<<<<< HEAD
>>>>>>> 8c9ca1211a (GEOMESA-3061 Converters - support bytes in Avro top-level union types (#2762))
<<<<<<< HEAD
>>>>>>> 4f51687745 (GEOMESA-3061 Converters - support bytes in Avro top-level union types (#2762))
=======
=======
=======
=======
<<<<<<< HEAD
=======

>>>>>>> b9bdd406e (GEOMESA-3061 Converters - support bytes in Avro top-level union types (#2762))
>>>>>>> cdb410251 (GEOMESA-3061 Converters - support bytes in Avro top-level union types (#2762))
<<<<<<< HEAD
<<<<<<< HEAD
>>>>>>> dace2085b (GEOMESA-3061 Converters - support bytes in Avro top-level union types (#2762))
=======
<<<<<<< HEAD
>>>>>>> 46c05fed5 (GEOMESA-3176 Docs - fix download links in install instructions)
=======
>>>>>>> 90ec70f55 (GEOMESA-3176 Docs - fix download links in install instructions)
<<<<<<< HEAD
>>>>>>> 6a26990f7 (GEOMESA-3176 Docs - fix download links in install instructions)
<<<<<<< HEAD
>>>>>>> 0b36b46b5f (GEOMESA-3176 Docs - fix download links in install instructions)
<<<<<<< HEAD
>>>>>>> 760781f8dd (GEOMESA-3176 Docs - fix download links in install instructions)
<<<<<<< HEAD
>>>>>>> a2ed7a128d (GEOMESA-3176 Docs - fix download links in install instructions)
=======
=======
=======
=======
=======
>>>>>>> 6eb31fb65 (GEOMESA-3061 Converters - support bytes in Avro top-level union types (#2762))
<<<<<<< HEAD
>>>>>>> 3dd99aed4 (GEOMESA-3061 Converters - support bytes in Avro top-level union types (#2762))
<<<<<<< HEAD
>>>>>>> dddc42e265 (GEOMESA-3061 Converters - support bytes in Avro top-level union types (#2762))
<<<<<<< HEAD
>>>>>>> f7f4f4a836 (GEOMESA-3061 Converters - support bytes in Avro top-level union types (#2762))
<<<<<<< HEAD
>>>>>>> 5a365695e1 (GEOMESA-3061 Converters - support bytes in Avro top-level union types (#2762))
=======
=======
=======
=======
=======
=======

>>>>>>> b9bdd406e (GEOMESA-3061 Converters - support bytes in Avro top-level union types (#2762))
>>>>>>> 0e68e9f4c (GEOMESA-3061 Converters - support bytes in Avro top-level union types (#2762))
<<<<<<< HEAD
>>>>>>> 45ad5d11f (GEOMESA-3061 Converters - support bytes in Avro top-level union types (#2762))
<<<<<<< HEAD
>>>>>>> b009fd23f4 (GEOMESA-3061 Converters - support bytes in Avro top-level union types (#2762))
<<<<<<< HEAD
>>>>>>> a22efb4d66 (GEOMESA-3061 Converters - support bytes in Avro top-level union types (#2762))
<<<<<<< HEAD
>>>>>>> 9a2d40c613 (GEOMESA-3061 Converters - support bytes in Avro top-level union types (#2762))
=======
=======
=======
=======
=======
>>>>>>> 15e998504 (GEOMESA-3176 Docs - fix download links in install instructions)
<<<<<<< HEAD
>>>>>>> baa90e85a (GEOMESA-3176 Docs - fix download links in install instructions)
<<<<<<< HEAD
>>>>>>> d969b4c2d5 (GEOMESA-3176 Docs - fix download links in install instructions)
<<<<<<< HEAD
>>>>>>> a0befba4ce (GEOMESA-3176 Docs - fix download links in install instructions)
<<<<<<< HEAD
>>>>>>> f40ce84a61 (GEOMESA-3176 Docs - fix download links in install instructions)
=======
=======
=======
=======
=======
>>>>>>> 07a6a5c29 (GEOMESA-3061 Converters - support bytes in Avro top-level union types (#2762))
<<<<<<< HEAD
>>>>>>> 4524373ac (GEOMESA-3061 Converters - support bytes in Avro top-level union types (#2762))
<<<<<<< HEAD
>>>>>>> 4564a1634e (GEOMESA-3061 Converters - support bytes in Avro top-level union types (#2762))
<<<<<<< HEAD
>>>>>>> df644ff83d (GEOMESA-3061 Converters - support bytes in Avro top-level union types (#2762))
<<<<<<< HEAD
>>>>>>> 3ae7021103 (GEOMESA-3061 Converters - support bytes in Avro top-level union types (#2762))
=======
=======
=======
=======
=======
>>>>>>> 67b361c85 (GEOMESA-3061 Converters - support bytes in Avro top-level union types (#2762))
<<<<<<< HEAD
>>>>>>> dace2085b (GEOMESA-3061 Converters - support bytes in Avro top-level union types (#2762))
<<<<<<< HEAD
>>>>>>> 238945d4b3 (GEOMESA-3061 Converters - support bytes in Avro top-level union types (#2762))
<<<<<<< HEAD
>>>>>>> 1cad375176 (GEOMESA-3061 Converters - support bytes in Avro top-level union types (#2762))
<<<<<<< HEAD
>>>>>>> 73770612e0 (GEOMESA-3061 Converters - support bytes in Avro top-level union types (#2762))
=======
=======
=======
=======
=======
=======
>>>>>>> 90ec70f55 (GEOMESA-3176 Docs - fix download links in install instructions)
>>>>>>> 63db7d154 (GEOMESA-3176 Docs - fix download links in install instructions)
=======
>>>>>>> 14cf946af4 (GEOMESA-3061 Converters - support bytes in Avro top-level union types (#2762))
>>>>>>> 46c05fed5 (GEOMESA-3176 Docs - fix download links in install instructions)
<<<<<<< HEAD
>>>>>>> f73ef99f1e (GEOMESA-3176 Docs - fix download links in install instructions)
<<<<<<< HEAD
>>>>>>> bcf78618df (GEOMESA-3176 Docs - fix download links in install instructions)
<<<<<<< HEAD
>>>>>>> e4f52faffa (GEOMESA-3176 Docs - fix download links in install instructions)
=======
=======
=======
=======
=======
>>>>>>> 28e2bfa2d (GEOMESA-3061 Converters - support bytes in Avro top-level union types (#2762))
>>>>>>> 4fbe39c62 (GEOMESA-3061 Converters - support bytes in Avro top-level union types (#2762))
>>>>>>> be05354746 (GEOMESA-3061 Converters - support bytes in Avro top-level union types (#2762))
>>>>>>> 31f6953312 (GEOMESA-3061 Converters - support bytes in Avro top-level union types (#2762))
>>>>>>> 14cf946af4 (GEOMESA-3061 Converters - support bytes in Avro top-level union types (#2762))
=======
>>>>>>> 6c83981af3 (GEOMESA-3061 Converters - support bytes in Avro top-level union types (#2762))
=======
=======
>>>>>>> e944f1c88b (Merge branch 'feature/postgis-fixes')
>>>>>>> 638b68d081 (Merge branch 'feature/postgis-fixes')
>>>>>>> b6e56a9e80 (Merge branch 'feature/postgis-fixes')
=======
=======
=======
>>>>>>> 7b2b25cc3c (GEOMESA-3176 Docs - fix download links in install instructions)
>>>>>>> 7f7083f095 (GEOMESA-3176 Docs - fix download links in install instructions)
>>>>>>> 81ee66102b (GEOMESA-3061 Converters - support bytes in Avro top-level union types (#2762))
<<<<<<< HEAD
>>>>>>> 8adfab65bb (GEOMESA-3061 Converters - support bytes in Avro top-level union types (#2762))
<<<<<<< HEAD
>>>>>>> a1f15598cb (GEOMESA-3061 Converters - support bytes in Avro top-level union types (#2762))
<<<<<<< HEAD
>>>>>>> b1f71c0764 (GEOMESA-3061 Converters - support bytes in Avro top-level union types (#2762))
=======
=======
=======
=======
=======
=======
=======
>>>>>>> a38834fade (GEOMESA-3061 Converters - support bytes in Avro top-level union types (#2762))
=======
>>>>>>> dcbf9c4320 (GEOMESA-3061 Converters - support bytes in Avro top-level union types (#2762))

>>>>>>> b9bdd406e (GEOMESA-3061 Converters - support bytes in Avro top-level union types (#2762))
=======
>>>>>>> 16b2e83f2 (GEOMESA-3176 Docs - fix download links in install instructions)
<<<<<<< HEAD
<<<<<<< HEAD
>>>>>>> 2aa923cc9 (GEOMESA-3176 Docs - fix download links in install instructions)
<<<<<<< HEAD
>>>>>>> bdcaf0ab5e (GEOMESA-3176 Docs - fix download links in install instructions)
<<<<<<< HEAD
>>>>>>> 235bc2820d (GEOMESA-3176 Docs - fix download links in install instructions)
<<<<<<< HEAD
>>>>>>> 7b2b25cc3c (GEOMESA-3176 Docs - fix download links in install instructions)
<<<<<<< HEAD
>>>>>>> 7f7083f095 (GEOMESA-3176 Docs - fix download links in install instructions)
=======
=======
=======
=======
=======
=======
<<<<<<< HEAD
=======
>>>>>>> 6eb31fb65 (GEOMESA-3061 Converters - support bytes in Avro top-level union types (#2762))
>>>>>>> 5f428db97 (GEOMESA-3061 Converters - support bytes in Avro top-level union types (#2762))
=======
=======

>>>>>>> b9bdd406e (GEOMESA-3061 Converters - support bytes in Avro top-level union types (#2762))
>>>>>>> f71fa3c0e (GEOMESA-3061 Converters - support bytes in Avro top-level union types (#2762))
<<<<<<< HEAD
>>>>>>> c5e182765 (GEOMESA-3061 Converters - support bytes in Avro top-level union types (#2762))
<<<<<<< HEAD
>>>>>>> f9f6fde40b (GEOMESA-3061 Converters - support bytes in Avro top-level union types (#2762))
<<<<<<< HEAD
>>>>>>> 4a05f27ba4 (GEOMESA-3061 Converters - support bytes in Avro top-level union types (#2762))
<<<<<<< HEAD
>>>>>>> 1d03325c29 (GEOMESA-3061 Converters - support bytes in Avro top-level union types (#2762))
<<<<<<< HEAD
>>>>>>> a38834fade (GEOMESA-3061 Converters - support bytes in Avro top-level union types (#2762))
=======
=======
=======
=======
=======
<<<<<<< HEAD
>>>>>>> 5f428db97 (GEOMESA-3061 Converters - support bytes in Avro top-level union types (#2762))
=======
>>>>>>> 9d708b240 (GEOMESA-3061 Converters - support bytes in Avro top-level union types (#2762))
<<<<<<< HEAD
>>>>>>> 53a3e72cbf (GEOMESA-3061 Converters - support bytes in Avro top-level union types (#2762))
<<<<<<< HEAD
>>>>>>> 7b0539b808 (GEOMESA-3061 Converters - support bytes in Avro top-level union types (#2762))
<<<<<<< HEAD
>>>>>>> 963feec660 (GEOMESA-3061 Converters - support bytes in Avro top-level union types (#2762))
<<<<<<< HEAD
>>>>>>> cc89a73032 (GEOMESA-3061 Converters - support bytes in Avro top-level union types (#2762))
=======
=======
=======
=======
=======
=======
>>>>>>> 90ec70f55 (GEOMESA-3176 Docs - fix download links in install instructions)
<<<<<<< HEAD
>>>>>>> 8cbe155de (GEOMESA-3176 Docs - fix download links in install instructions)
<<<<<<< HEAD
>>>>>>> 8150bc0e65 (GEOMESA-3176 Docs - fix download links in install instructions)
<<<<<<< HEAD
>>>>>>> 256a642cc1 (GEOMESA-3176 Docs - fix download links in install instructions)
<<<<<<< HEAD
>>>>>>> ecd45f2c3e (GEOMESA-3176 Docs - fix download links in install instructions)
<<<<<<< HEAD
>>>>>>> 0b168af9c8 (GEOMESA-3176 Docs - fix download links in install instructions)
=======
=======
=======
=======
=======
=======
>>>>>>> 6eb31fb65 (GEOMESA-3061 Converters - support bytes in Avro top-level union types (#2762))
=======
>>>>>>> 36b890ce98 (GEOMESA-3061 Converters - support bytes in Avro top-level union types (#2762))
>>>>>>> 5f428db97 (GEOMESA-3061 Converters - support bytes in Avro top-level union types (#2762))
<<<<<<< HEAD
>>>>>>> 6a2cd10c1c (GEOMESA-3061 Converters - support bytes in Avro top-level union types (#2762))
<<<<<<< HEAD
>>>>>>> aceaf3bd81 (GEOMESA-3061 Converters - support bytes in Avro top-level union types (#2762))
<<<<<<< HEAD
>>>>>>> 6fc8851879 (GEOMESA-3061 Converters - support bytes in Avro top-level union types (#2762))
<<<<<<< HEAD
>>>>>>> dcbf9c4320 (GEOMESA-3061 Converters - support bytes in Avro top-level union types (#2762))
=======
=======
=======
=======
=======
=======
=======

>>>>>>> b9bdd406e (GEOMESA-3061 Converters - support bytes in Avro top-level union types (#2762))
>>>>>>> 0e68e9f4c (GEOMESA-3061 Converters - support bytes in Avro top-level union types (#2762))
=======
>>>>>>> 84e5c6b001 (GEOMESA-3176 Docs - fix download links in install instructions)
>>>>>>> 76618c8da (GEOMESA-3061 Converters - support bytes in Avro top-level union types (#2762))
<<<<<<< HEAD
>>>>>>> 947761ec9b (GEOMESA-3061 Converters - support bytes in Avro top-level union types (#2762))
<<<<<<< HEAD
>>>>>>> 0086b292ba (GEOMESA-3061 Converters - support bytes in Avro top-level union types (#2762))
<<<<<<< HEAD
>>>>>>> 84ac051f28 (GEOMESA-3061 Converters - support bytes in Avro top-level union types (#2762))
<<<<<<< HEAD
>>>>>>> 36b890ce98 (GEOMESA-3061 Converters - support bytes in Avro top-level union types (#2762))
=======
=======
=======
=======
=======
=======
>>>>>>> 15e998504 (GEOMESA-3176 Docs - fix download links in install instructions)
=======
<<<<<<< HEAD
>>>>>>> ce19d9c8bd (GEOMESA-3061 Converters - support bytes in Avro top-level union types (#2762))
>>>>>>> 0fbf9e83e (GEOMESA-3176 Docs - fix download links in install instructions)
<<<<<<< HEAD
>>>>>>> 4d9f87a514 (GEOMESA-3176 Docs - fix download links in install instructions)
<<<<<<< HEAD
>>>>>>> 7efa8bf5c8 (GEOMESA-3176 Docs - fix download links in install instructions)
<<<<<<< HEAD
>>>>>>> 3995e6a61c (GEOMESA-3176 Docs - fix download links in install instructions)
<<<<<<< HEAD
>>>>>>> 84e5c6b001 (GEOMESA-3176 Docs - fix download links in install instructions)
=======
=======
=======
=======
=======
=======
>>>>>>> 07a6a5c29 (GEOMESA-3061 Converters - support bytes in Avro top-level union types (#2762))
=======
<<<<<<< HEAD
>>>>>>> 98c12ce706 (GEOMESA-3061 Converters - support bytes in Avro top-level union types (#2762))
>>>>>>> 89bdd3013 (GEOMESA-3061 Converters - support bytes in Avro top-level union types (#2762))
<<<<<<< HEAD
>>>>>>> 8a6a96234b (GEOMESA-3061 Converters - support bytes in Avro top-level union types (#2762))
<<<<<<< HEAD
>>>>>>> 93c8cf1b3a (GEOMESA-3061 Converters - support bytes in Avro top-level union types (#2762))
<<<<<<< HEAD
>>>>>>> 6514df9383 (GEOMESA-3061 Converters - support bytes in Avro top-level union types (#2762))
<<<<<<< HEAD
>>>>>>> ce19d9c8bd (GEOMESA-3061 Converters - support bytes in Avro top-level union types (#2762))
=======
=======
=======
=======
=======
=======
>>>>>>> 67b361c85 (GEOMESA-3061 Converters - support bytes in Avro top-level union types (#2762))
=======
<<<<<<< HEAD
>>>>>>> dcc9d7f708 (GEOMESA-3176 Docs - fix download links in install instructions)
>>>>>>> c8a325e13 (GEOMESA-3061 Converters - support bytes in Avro top-level union types (#2762))
<<<<<<< HEAD
>>>>>>> c9328eddce (GEOMESA-3061 Converters - support bytes in Avro top-level union types (#2762))
<<<<<<< HEAD
>>>>>>> e15d50d7d3 (GEOMESA-3061 Converters - support bytes in Avro top-level union types (#2762))
<<<<<<< HEAD
>>>>>>> fe3de10f11 (GEOMESA-3061 Converters - support bytes in Avro top-level union types (#2762))
<<<<<<< HEAD
>>>>>>> 98c12ce706 (GEOMESA-3061 Converters - support bytes in Avro top-level union types (#2762))
=======
=======
=======
=======
=======
=======
=======
>>>>>>> 90ec70f55 (GEOMESA-3176 Docs - fix download links in install instructions)
>>>>>>> 63db7d154 (GEOMESA-3176 Docs - fix download links in install instructions)
=======
>>>>>>> 8a2d92d131 (GEOMESA-3061 Converters - support bytes in Avro top-level union types (#2762))
>>>>>>> f9e8439b0 (GEOMESA-3176 Docs - fix download links in install instructions)
<<<<<<< HEAD
>>>>>>> bd3233180f (GEOMESA-3176 Docs - fix download links in install instructions)
<<<<<<< HEAD
>>>>>>> 94efcf84c2 (GEOMESA-3176 Docs - fix download links in install instructions)
<<<<<<< HEAD
>>>>>>> cabde54511 (GEOMESA-3176 Docs - fix download links in install instructions)
<<<<<<< HEAD
>>>>>>> dcc9d7f708 (GEOMESA-3176 Docs - fix download links in install instructions)
=======
=======
=======
=======
=======
=======
>>>>>>> 28e2bfa2d (GEOMESA-3061 Converters - support bytes in Avro top-level union types (#2762))
>>>>>>> 72bafaf54 (GEOMESA-3061 Converters - support bytes in Avro top-level union types (#2762))
=======
>>>>>>> 72962fe615 (GEOMESA-3061 Converters - support bytes in Avro top-level union types (#2762))
>>>>>>> 0c734cda2b (GEOMESA-3061 Converters - support bytes in Avro top-level union types (#2762))
<<<<<<< HEAD
>>>>>>> 8929cbff5b (GEOMESA-3061 Converters - support bytes in Avro top-level union types (#2762))
<<<<<<< HEAD
>>>>>>> c91f823574 (GEOMESA-3061 Converters - support bytes in Avro top-level union types (#2762))
<<<<<<< HEAD
>>>>>>> 8a2d92d131 (GEOMESA-3061 Converters - support bytes in Avro top-level union types (#2762))
=======
=======
=======
=======
=======
>>>>>>> 97ec7d864 (GEOMESA-3061 Converters - support bytes in Avro top-level union types (#2762))
=======
>>>>>>> 0a5b74c946 (Merge branch 'feature/postgis-fixes')
>>>>>>> d94c03a98e (GEOMESA-3061 Converters - support bytes in Avro top-level union types (#2762))
<<<<<<< HEAD
>>>>>>> 8de43cccf6 (GEOMESA-3061 Converters - support bytes in Avro top-level union types (#2762))
<<<<<<< HEAD
>>>>>>> d0785cf307 (GEOMESA-3061 Converters - support bytes in Avro top-level union types (#2762))
<<<<<<< HEAD
>>>>>>> 72962fe615 (GEOMESA-3061 Converters - support bytes in Avro top-level union types (#2762))
=======
=======
=======
=======
=======
=======
>>>>>>> 3be8d2a5a (Merge branch 'feature/postgis-fixes')
>>>>>>> db8d998aa (Merge branch 'feature/postgis-fixes')
=======
>>>>>>> 13656f5052 (GEOMESA-3254 Add Bloop build support)
>>>>>>> cb6bda89b6 (Merge branch 'feature/postgis-fixes')
<<<<<<< HEAD
>>>>>>> 26e5afc4ea (Merge branch 'feature/postgis-fixes')
<<<<<<< HEAD
>>>>>>> 71adb695c5 (Merge branch 'feature/postgis-fixes')
<<<<<<< HEAD
>>>>>>> 0a5b74c946 (Merge branch 'feature/postgis-fixes')
=======
=======
=======
=======
=======
>>>>>>> d845d7c1b (GEOMESA-3254 Add Bloop build support)
=======
>>>>>>> f7b6b53d97 (GEOMESA-3061 Converters - support bytes in Avro top-level union types (#2762))
>>>>>>> 09d87762c5 (GEOMESA-3254 Add Bloop build support)
<<<<<<< HEAD
>>>>>>> 63a045a753 (GEOMESA-3254 Add Bloop build support)
<<<<<<< HEAD
>>>>>>> 5a4c24e020 (GEOMESA-3254 Add Bloop build support)
<<<<<<< HEAD
>>>>>>> 13656f5052 (GEOMESA-3254 Add Bloop build support)
=======
=======
=======
=======
=======
=======

>>>>>>> b9bdd406e (GEOMESA-3061 Converters - support bytes in Avro top-level union types (#2762))
>>>>>>> 6d9a5b626 (GEOMESA-3061 Converters - support bytes in Avro top-level union types (#2762))
=======
>>>>>>> c04d2a7e80 (GEOMESA-3176 Docs - fix download links in install instructions)
>>>>>>> 67e4c1354f (GEOMESA-3061 Converters - support bytes in Avro top-level union types (#2762))
<<<<<<< HEAD
>>>>>>> 12e3a588fc (GEOMESA-3061 Converters - support bytes in Avro top-level union types (#2762))
<<<<<<< HEAD
>>>>>>> a52e4429be (GEOMESA-3061 Converters - support bytes in Avro top-level union types (#2762))
<<<<<<< HEAD
>>>>>>> f7b6b53d97 (GEOMESA-3061 Converters - support bytes in Avro top-level union types (#2762))
=======
=======
=======
=======
=======
=======
=======
>>>>>>> 7c052f66eb (GEOMESA-3061 Converters - support bytes in Avro top-level union types (#2762))
=======
>>>>>>> 411f3fc089 (GEOMESA-3061 Converters - support bytes in Avro top-level union types (#2762))

>>>>>>> b9bdd406e (GEOMESA-3061 Converters - support bytes in Avro top-level union types (#2762))
=======
>>>>>>> 16b2e83f2 (GEOMESA-3176 Docs - fix download links in install instructions)
<<<<<<< HEAD
<<<<<<< HEAD
>>>>>>> 10ade3dcd (GEOMESA-3176 Docs - fix download links in install instructions)
<<<<<<< HEAD
>>>>>>> 703374130f (GEOMESA-3176 Docs - fix download links in install instructions)
<<<<<<< HEAD
>>>>>>> 93fa8c797f (GEOMESA-3176 Docs - fix download links in install instructions)
<<<<<<< HEAD
>>>>>>> 8dec77199d (GEOMESA-3176 Docs - fix download links in install instructions)
<<<<<<< HEAD
>>>>>>> c04d2a7e80 (GEOMESA-3176 Docs - fix download links in install instructions)
=======
=======
=======
=======
=======
=======
<<<<<<< HEAD
=======
>>>>>>> 6eb31fb65 (GEOMESA-3061 Converters - support bytes in Avro top-level union types (#2762))
>>>>>>> 23c024179 (GEOMESA-3061 Converters - support bytes in Avro top-level union types (#2762))
=======
=======

>>>>>>> b9bdd406e (GEOMESA-3061 Converters - support bytes in Avro top-level union types (#2762))
>>>>>>> f71fa3c0e (GEOMESA-3061 Converters - support bytes in Avro top-level union types (#2762))
<<<<<<< HEAD
>>>>>>> 947a867d1 (GEOMESA-3061 Converters - support bytes in Avro top-level union types (#2762))
<<<<<<< HEAD
>>>>>>> 748532d2db (GEOMESA-3061 Converters - support bytes in Avro top-level union types (#2762))
<<<<<<< HEAD
>>>>>>> c82dea9d29 (GEOMESA-3061 Converters - support bytes in Avro top-level union types (#2762))
<<<<<<< HEAD
>>>>>>> bc73cc4d41 (GEOMESA-3061 Converters - support bytes in Avro top-level union types (#2762))
<<<<<<< HEAD
>>>>>>> 7c052f66eb (GEOMESA-3061 Converters - support bytes in Avro top-level union types (#2762))
=======
=======
=======
=======
=======
<<<<<<< HEAD
>>>>>>> 23c024179 (GEOMESA-3061 Converters - support bytes in Avro top-level union types (#2762))
=======
>>>>>>> e6e1f4bdd (GEOMESA-3061 Converters - support bytes in Avro top-level union types (#2762))
<<<<<<< HEAD
>>>>>>> 8035cc5893 (GEOMESA-3061 Converters - support bytes in Avro top-level union types (#2762))
<<<<<<< HEAD
>>>>>>> 1890b11217 (GEOMESA-3061 Converters - support bytes in Avro top-level union types (#2762))
<<<<<<< HEAD
>>>>>>> 5c6b9f1f8b (GEOMESA-3061 Converters - support bytes in Avro top-level union types (#2762))
<<<<<<< HEAD
>>>>>>> ecfd546311 (GEOMESA-3061 Converters - support bytes in Avro top-level union types (#2762))
=======
=======
=======
=======
=======
=======
>>>>>>> 90ec70f55 (GEOMESA-3176 Docs - fix download links in install instructions)
<<<<<<< HEAD
>>>>>>> 279de44d3 (GEOMESA-3176 Docs - fix download links in install instructions)
<<<<<<< HEAD
>>>>>>> b7c6b904be (GEOMESA-3176 Docs - fix download links in install instructions)
<<<<<<< HEAD
>>>>>>> 2142d07ded (GEOMESA-3176 Docs - fix download links in install instructions)
<<<<<<< HEAD
>>>>>>> 813f24c01d (GEOMESA-3176 Docs - fix download links in install instructions)
<<<<<<< HEAD
>>>>>>> 79d78e33bb (GEOMESA-3176 Docs - fix download links in install instructions)
=======
=======
=======
=======
=======
=======
>>>>>>> 6eb31fb65 (GEOMESA-3061 Converters - support bytes in Avro top-level union types (#2762))
=======
>>>>>>> db389b4b99 (GEOMESA-3061 Converters - support bytes in Avro top-level union types (#2762))
>>>>>>> 23c024179 (GEOMESA-3061 Converters - support bytes in Avro top-level union types (#2762))
<<<<<<< HEAD
>>>>>>> 250f01786f (GEOMESA-3061 Converters - support bytes in Avro top-level union types (#2762))
<<<<<<< HEAD
>>>>>>> a398ab1183 (GEOMESA-3061 Converters - support bytes in Avro top-level union types (#2762))
<<<<<<< HEAD
>>>>>>> 98eacc8492 (GEOMESA-3061 Converters - support bytes in Avro top-level union types (#2762))
<<<<<<< HEAD
>>>>>>> 411f3fc089 (GEOMESA-3061 Converters - support bytes in Avro top-level union types (#2762))
=======
=======
=======
=======
=======
=======
=======

>>>>>>> b9bdd406e (GEOMESA-3061 Converters - support bytes in Avro top-level union types (#2762))
>>>>>>> 0e68e9f4c (GEOMESA-3061 Converters - support bytes in Avro top-level union types (#2762))
=======
>>>>>>> 72c7cd55e5 (GEOMESA-3176 Docs - fix download links in install instructions)
>>>>>>> a910ae135 (GEOMESA-3061 Converters - support bytes in Avro top-level union types (#2762))
<<<<<<< HEAD
>>>>>>> 07161eaaa6 (GEOMESA-3061 Converters - support bytes in Avro top-level union types (#2762))
<<<<<<< HEAD
>>>>>>> 9c28193a91 (GEOMESA-3061 Converters - support bytes in Avro top-level union types (#2762))
<<<<<<< HEAD
>>>>>>> 9d44ff473d (GEOMESA-3061 Converters - support bytes in Avro top-level union types (#2762))
<<<<<<< HEAD
>>>>>>> db389b4b99 (GEOMESA-3061 Converters - support bytes in Avro top-level union types (#2762))
=======
=======
=======
=======
=======
=======
>>>>>>> 15e998504 (GEOMESA-3176 Docs - fix download links in install instructions)
=======
>>>>>>> 992ed6b1bf (GEOMESA-3061 Converters - support bytes in Avro top-level union types (#2762))
>>>>>>> 4b70e7f8f (GEOMESA-3176 Docs - fix download links in install instructions)
<<<<<<< HEAD
>>>>>>> b42125fac1 (GEOMESA-3176 Docs - fix download links in install instructions)
<<<<<<< HEAD
>>>>>>> a8d6366d72 (GEOMESA-3176 Docs - fix download links in install instructions)
<<<<<<< HEAD
>>>>>>> 1a737b13ed (GEOMESA-3176 Docs - fix download links in install instructions)
<<<<<<< HEAD
>>>>>>> 72c7cd55e5 (GEOMESA-3176 Docs - fix download links in install instructions)
=======
=======
=======
=======
=======
=======
>>>>>>> 07a6a5c29 (GEOMESA-3061 Converters - support bytes in Avro top-level union types (#2762))
=======
>>>>>>> acc6bdccf3 (GEOMESA-3061 Converters - support bytes in Avro top-level union types (#2762))
>>>>>>> 85663f71c (GEOMESA-3061 Converters - support bytes in Avro top-level union types (#2762))
<<<<<<< HEAD
>>>>>>> 813488e18c (GEOMESA-3061 Converters - support bytes in Avro top-level union types (#2762))
<<<<<<< HEAD
>>>>>>> 6f30a087ee (GEOMESA-3061 Converters - support bytes in Avro top-level union types (#2762))
<<<<<<< HEAD
>>>>>>> 664350d86f (GEOMESA-3061 Converters - support bytes in Avro top-level union types (#2762))
<<<<<<< HEAD
>>>>>>> 992ed6b1bf (GEOMESA-3061 Converters - support bytes in Avro top-level union types (#2762))
=======
=======
=======
=======
=======
=======
>>>>>>> 67b361c85 (GEOMESA-3061 Converters - support bytes in Avro top-level union types (#2762))
=======
>>>>>>> d025f79392 (GEOMESA-3176 Docs - fix download links in install instructions)
>>>>>>> ad3cedc4d (GEOMESA-3061 Converters - support bytes in Avro top-level union types (#2762))
<<<<<<< HEAD
>>>>>>> 9abc630fdf (GEOMESA-3061 Converters - support bytes in Avro top-level union types (#2762))
<<<<<<< HEAD
>>>>>>> d294ce49e2 (GEOMESA-3061 Converters - support bytes in Avro top-level union types (#2762))
<<<<<<< HEAD
>>>>>>> a35efac12e (GEOMESA-3061 Converters - support bytes in Avro top-level union types (#2762))
<<<<<<< HEAD
>>>>>>> acc6bdccf3 (GEOMESA-3061 Converters - support bytes in Avro top-level union types (#2762))
=======
=======
=======
=======
=======
=======
=======
>>>>>>> 90ec70f55 (GEOMESA-3176 Docs - fix download links in install instructions)
>>>>>>> 63db7d154 (GEOMESA-3176 Docs - fix download links in install instructions)
=======
>>>>>>> 8171686fd2 (GEOMESA-3061 Converters - support bytes in Avro top-level union types (#2762))
>>>>>>> a12ea194c (GEOMESA-3176 Docs - fix download links in install instructions)
<<<<<<< HEAD
>>>>>>> 5c3f315bc0 (GEOMESA-3176 Docs - fix download links in install instructions)
<<<<<<< HEAD
>>>>>>> b041fcc3eb (GEOMESA-3176 Docs - fix download links in install instructions)
<<<<<<< HEAD
>>>>>>> 3e34d2451e (GEOMESA-3176 Docs - fix download links in install instructions)
<<<<<<< HEAD
>>>>>>> d025f79392 (GEOMESA-3176 Docs - fix download links in install instructions)
=======
=======
=======
=======
=======
=======
>>>>>>> 28e2bfa2d (GEOMESA-3061 Converters - support bytes in Avro top-level union types (#2762))
>>>>>>> d4c5768cf (GEOMESA-3061 Converters - support bytes in Avro top-level union types (#2762))
=======
>>>>>>> 7925093789 (GEOMESA-3061 Converters - support bytes in Avro top-level union types (#2762))
>>>>>>> fe51719bc6 (GEOMESA-3061 Converters - support bytes in Avro top-level union types (#2762))
<<<<<<< HEAD
>>>>>>> 3acb47e615 (GEOMESA-3061 Converters - support bytes in Avro top-level union types (#2762))
<<<<<<< HEAD
>>>>>>> a85aff60b3 (GEOMESA-3061 Converters - support bytes in Avro top-level union types (#2762))
<<<<<<< HEAD
>>>>>>> 8171686fd2 (GEOMESA-3061 Converters - support bytes in Avro top-level union types (#2762))
=======
=======
=======
=======
=======
>>>>>>> bdbced26d (GEOMESA-3061 Converters - support bytes in Avro top-level union types (#2762))
=======
>>>>>>> a30a0c1a2a (Merge branch 'feature/postgis-fixes')
>>>>>>> 25063957fc (GEOMESA-3061 Converters - support bytes in Avro top-level union types (#2762))
<<<<<<< HEAD
>>>>>>> 1df8328338 (GEOMESA-3061 Converters - support bytes in Avro top-level union types (#2762))
<<<<<<< HEAD
>>>>>>> fd5565dfba (GEOMESA-3061 Converters - support bytes in Avro top-level union types (#2762))
<<<<<<< HEAD
>>>>>>> 7925093789 (GEOMESA-3061 Converters - support bytes in Avro top-level union types (#2762))
=======
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
>>>>>>> a30a0c1a2a (Merge branch 'feature/postgis-fixes')
=======
>>>>>>> 9d0ea08871 (GEOMESA-3061 Converters - support bytes in Avro top-level union types (#2762))
=======
=======
>>>>>>> 1f19a648d1 (GEOMESA-3176 Docs - fix download links in install instructions)
>>>>>>> fbb5e06c6a (GEOMESA-3176 Docs - fix download links in install instructions)
=======
>>>>>>> c9c24ca3d7 (GEOMESA-3061 Converters - support bytes in Avro top-level union types (#2762))
>>>>>>> b8545eda8f (GEOMESA-3061 Converters - support bytes in Avro top-level union types (#2762))
=======
>>>>>>> e6703260b7 (GEOMESA-3061 Converters - support bytes in Avro top-level union types (#2762))
=======
=======
>>>>>>> 4492950388 (GEOMESA-3176 Docs - fix download links in install instructions)
>>>>>>> 64a722e2a7 (GEOMESA-3176 Docs - fix download links in install instructions)
=======
>>>>>>> 420027bc3f (GEOMESA-3061 Converters - support bytes in Avro top-level union types (#2762))
=======
>>>>>>> 39c52cab32 (GEOMESA-3061 Converters - support bytes in Avro top-level union types (#2762))
=======
=======
>>>>>>> aff2787fc2 (GEOMESA-3176 Docs - fix download links in install instructions)
>>>>>>> 341ef96c9a (GEOMESA-3176 Docs - fix download links in install instructions)
=======
>>>>>>> fc1024de7e (GEOMESA-3061 Converters - support bytes in Avro top-level union types (#2762))
=======
>>>>>>> 27c0ee7e6d (GEOMESA-3061 Converters - support bytes in Avro top-level union types (#2762))
=======
=======
>>>>>>> 0753bfcbe4 (GEOMESA-3176 Docs - fix download links in install instructions)
>>>>>>> 5712753579 (GEOMESA-3176 Docs - fix download links in install instructions)
=======
>>>>>>> 8435590eee (GEOMESA-3061 Converters - support bytes in Avro top-level union types (#2762))
=======
=======
>>>>>>> a788dfac03 (GEOMESA-3061 Converters - support bytes in Avro top-level union types (#2762))
>>>>>>> 1bcc513539 (GEOMESA-3061 Converters - support bytes in Avro top-level union types (#2762))
>>>>>>> 7fa3b8d23f (GEOMESA-3061 Converters - support bytes in Avro top-level union types (#2762))
=======
>>>>>>> cc93e0930d (Merge branch 'feature/postgis-fixes')
=======
>>>>>>> 66dbbce00d (GEOMESA-3061 Converters - support bytes in Avro top-level union types (#2762))
<<<<<<< HEAD
>>>>>>> fcfc8ed547 (GEOMESA-3061 Converters - support bytes in Avro top-level union types (#2762))
=======
=======
=======

>>>>>>> b9bdd406e (GEOMESA-3061 Converters - support bytes in Avro top-level union types (#2762))
=======
>>>>>>> 16b2e83f2 (GEOMESA-3176 Docs - fix download links in install instructions)
>>>>>>> baeb44a4a8 (GEOMESA-3176 Docs - fix download links in install instructions)
<<<<<<< HEAD
>>>>>>> f561a0faec (GEOMESA-3176 Docs - fix download links in install instructions)
=======
=======
>>>>>>> 49a5a0454f (GEOMESA-3061 Converters - support bytes in Avro top-level union types (#2762))
<<<<<<< HEAD
>>>>>>> a75dd93dd3 (GEOMESA-3061 Converters - support bytes in Avro top-level union types (#2762))
=======
=======
>>>>>>> 5f807ff388 (GEOMESA-3061 Converters - support bytes in Avro top-level union types (#2762))
<<<<<<< HEAD
>>>>>>> 5bf82177df (GEOMESA-3061 Converters - support bytes in Avro top-level union types (#2762))
=======
=======
=======
>>>>>>> 90ec70f55 (GEOMESA-3176 Docs - fix download links in install instructions)
>>>>>>> b4c1ea8881 (GEOMESA-3176 Docs - fix download links in install instructions)
<<<<<<< HEAD
>>>>>>> 91879d2d87 (GEOMESA-3176 Docs - fix download links in install instructions)
=======
=======
=======
>>>>>>> 6eb31fb65 (GEOMESA-3061 Converters - support bytes in Avro top-level union types (#2762))
>>>>>>> b03141c1bb (GEOMESA-3061 Converters - support bytes in Avro top-level union types (#2762))
<<<<<<< HEAD
>>>>>>> 879d736345 (GEOMESA-3061 Converters - support bytes in Avro top-level union types (#2762))
=======
=======
>>>>>>> 0833709340 (GEOMESA-3061 Converters - support bytes in Avro top-level union types (#2762))
<<<<<<< HEAD
>>>>>>> aa7b9bf205 (GEOMESA-3061 Converters - support bytes in Avro top-level union types (#2762))
=======
=======
=======
>>>>>>> 15e998504 (GEOMESA-3176 Docs - fix download links in install instructions)
>>>>>>> fdf0e4fe88 (GEOMESA-3176 Docs - fix download links in install instructions)
<<<<<<< HEAD
>>>>>>> 0ba49a2fd7 (GEOMESA-3176 Docs - fix download links in install instructions)
=======
=======
=======
>>>>>>> 07a6a5c29 (GEOMESA-3061 Converters - support bytes in Avro top-level union types (#2762))
>>>>>>> 32234db855 (GEOMESA-3061 Converters - support bytes in Avro top-level union types (#2762))
<<<<<<< HEAD
>>>>>>> 12443df272 (GEOMESA-3061 Converters - support bytes in Avro top-level union types (#2762))
=======
=======
>>>>>>> 67b361c85 (GEOMESA-3061 Converters - support bytes in Avro top-level union types (#2762))
>>>>>>> cec40638c2 (GEOMESA-3061 Converters - support bytes in Avro top-level union types (#2762))
<<<<<<< HEAD
>>>>>>> 51ac295632 (GEOMESA-3061 Converters - support bytes in Avro top-level union types (#2762))
=======
=======
=======
>>>>>>> 90ec70f55 (GEOMESA-3176 Docs - fix download links in install instructions)
>>>>>>> 63db7d154 (GEOMESA-3176 Docs - fix download links in install instructions)
>>>>>>> f2943650ff (GEOMESA-3176 Docs - fix download links in install instructions)
<<<<<<< HEAD
>>>>>>> d7ba054c6c (GEOMESA-3176 Docs - fix download links in install instructions)
=======
=======
>>>>>>> 28e2bfa2d (GEOMESA-3061 Converters - support bytes in Avro top-level union types (#2762))
>>>>>>> 86dd18aa73 (GEOMESA-3061 Converters - support bytes in Avro top-level union types (#2762))
<<<<<<< HEAD
>>>>>>> b488e79fc5 (GEOMESA-3061 Converters - support bytes in Avro top-level union types (#2762))
=======
=======
>>>>>>> b4320946b (GEOMESA-3061 Converters - support bytes in Avro top-level union types (#2762))
<<<<<<< HEAD
>>>>>>> 498d1c9c26 (GEOMESA-3061 Converters - support bytes in Avro top-level union types (#2762))
<<<<<<< HEAD
>>>>>>> feadc324d3 (GEOMESA-3061 Converters - support bytes in Avro top-level union types (#2762))
=======
=======
=======
>>>>>>> 3be8d2a5a (Merge branch 'feature/postgis-fixes')
>>>>>>> 64eaf6b132 (Merge branch 'feature/postgis-fixes')
>>>>>>> 79bf541ac8 (Merge branch 'feature/postgis-fixes')
<<<<<<< HEAD
<<<<<<< HEAD
>>>>>>> locatelli-main
=======
>>>>>>> locatelli-main
=======
>>>>>>> locatelli-main
=======
=======

>>>>>>> b9bdd406e (GEOMESA-3061 Converters - support bytes in Avro top-level union types (#2762))
>>>>>>> 66dbbce00d (GEOMESA-3061 Converters - support bytes in Avro top-level union types (#2762))
=======
=======

>>>>>>> b9bdd406e (GEOMESA-3061 Converters - support bytes in Avro top-level union types (#2762))
=======
>>>>>>> 16b2e83f2 (GEOMESA-3176 Docs - fix download links in install instructions)
>>>>>>> baeb44a4a8 (GEOMESA-3176 Docs - fix download links in install instructions)
=======
>>>>>>> 49a5a0454f (GEOMESA-3061 Converters - support bytes in Avro top-level union types (#2762))
=======
>>>>>>> 5f807ff388 (GEOMESA-3061 Converters - support bytes in Avro top-level union types (#2762))
=======
=======
>>>>>>> 90ec70f55 (GEOMESA-3176 Docs - fix download links in install instructions)
>>>>>>> b4c1ea8881 (GEOMESA-3176 Docs - fix download links in install instructions)
=======
=======
>>>>>>> 6eb31fb65 (GEOMESA-3061 Converters - support bytes in Avro top-level union types (#2762))
>>>>>>> b03141c1bb (GEOMESA-3061 Converters - support bytes in Avro top-level union types (#2762))
=======
>>>>>>> 0833709340 (GEOMESA-3061 Converters - support bytes in Avro top-level union types (#2762))
=======
=======
>>>>>>> 15e998504 (GEOMESA-3176 Docs - fix download links in install instructions)
>>>>>>> fdf0e4fe88 (GEOMESA-3176 Docs - fix download links in install instructions)
=======
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
>>>>>>> 07a6a5c29 (GEOMESA-3061 Converters - support bytes in Avro top-level union types (#2762))
>>>>>>> 32234db855 (GEOMESA-3061 Converters - support bytes in Avro top-level union types (#2762))
=======
>>>>>>> 67b361c85 (GEOMESA-3061 Converters - support bytes in Avro top-level union types (#2762))
>>>>>>> cec40638c2 (GEOMESA-3061 Converters - support bytes in Avro top-level union types (#2762))
=======
=======
>>>>>>> 90ec70f55 (GEOMESA-3176 Docs - fix download links in install instructions)
>>>>>>> 63db7d154 (GEOMESA-3176 Docs - fix download links in install instructions)
>>>>>>> f2943650ff (GEOMESA-3176 Docs - fix download links in install instructions)
=======
>>>>>>> 28e2bfa2d (GEOMESA-3061 Converters - support bytes in Avro top-level union types (#2762))
>>>>>>> 86dd18aa73 (GEOMESA-3061 Converters - support bytes in Avro top-level union types (#2762))
=======
<<<<<<< HEAD
<<<<<<< HEAD
<<<<<<< HEAD
>>>>>>> b4320946b (GEOMESA-3061 Converters - support bytes in Avro top-level union types (#2762))
<<<<<<< HEAD
=======
>>>>>>> locatelli-main
=======
>>>>>>> locatelli-main
=======
>>>>>>> locatelli-main
>>>>>>> 498d1c9c26 (GEOMESA-3061 Converters - support bytes in Avro top-level union types (#2762))
=======
=======
>>>>>>> 3be8d2a5a (Merge branch 'feature/postgis-fixes')
>>>>>>> 64eaf6b132 (Merge branch 'feature/postgis-fixes')
<<<<<<< HEAD
<<<<<<< HEAD
<<<<<<< HEAD
=======
>>>>>>> 28e2bfa2d (GEOMESA-3061 Converters - support bytes in Avro top-level union types (#2762))
=======
=======

>>>>>>> b9bdd406e (GEOMESA-3061 Converters - support bytes in Avro top-level union types (#2762))
>>>>>>> b4320946b (GEOMESA-3061 Converters - support bytes in Avro top-level union types (#2762))
=======
>>>>>>> 3be8d2a5a (Merge branch 'feature/postgis-fixes')
>>>>>>> locationtech-main
=======
>>>>>>> locatelli-main
=======
>>>>>>> locatelli-main
=======
>>>>>>> locatelli-main
    $ cat examples/ingest/csv/example.csv

The output should look like::

    ID,Name,Age,LastSeen,Friends,Lon,Lat,Vis
    23623,Harry,20,2015-05-06,"Will, Mark, Suzan","patronus->10,expelliarmus->9",-100.236523,23,user
    26236,Hermione,25,2015-06-07,"Edward, Bill, Harry","accio->10",40.232,-53.2356,user
    3233,Severus,30,2015-10-23,"Tom, Riddle, Voldemort","potions->10",3,-62.23,user&admin

As you can see, there are 3 records in the file. GeoMesa ships with a pre-installed SimpleFeatureType and converter
for this example file which can be found in the ``conf/application.conf`` file. Running ``bin/geomesa-fs env`` will
show that there is an ``example-csv`` type and converter installed along with many other types including twitter, gdelt,
osm, etc:

.. code-block:: bash

    $ bin/geomesa-fs env

The output should look like::

    Simple Feature Types:
    example-avro
    example-csv
    example-csv-complex
    ...

    Simple Feature Type Converters:
    example-avro-header
    example-avro-no-header
    example-csv
    ...

For this example we'll ingest the three rows to a local filesystem. Note that the records are all on different days::

    2015-05-06
    2015-06-07
    2015-10-23

and that the geometries fall into two quadrants of the world. The first record is in the upper left quadrant and the
second and third records are in the lower right quadrant::

    Lon          Lat
    -100.236523  23
    40.232      -53.2356
    3           -62.23

Now lets ingest.

.. code-block:: bash

    $ bin/geomesa-fs ingest -p /tmp/dstest -e parquet -s example-csv -C example-csv \
    --partition-scheme daily,z2-2bit examples/ingest/csv/example.csv

The output should look like::

    INFO  Creating schema example-csv
    INFO  Running ingestion in local mode
    INFO  Ingesting 1 file with 1 thread
    [============================================================] 100% complete 3 ingested 0 failed in 00:00:01
    INFO  Local ingestion complete in 00:00:01
    INFO  Ingested 3 features with no failures.

We can verify our ingest by running an export:

.. code-block:: bash

    $ bin/geomesa-fs export -p /tmp/dstest -f example-csv

The output should look like::

    id,fid:Integer:index=false,name:String:index=true,age:Integer:index=false,lastseen:Date:default=true:index=false,*geom:Point:srid=4326
    26236,26236,Hermione,25,2015-06-07T00:00:00.000Z,POINT (40.232 -53.2356)
    3233,3233,Severus,30,2015-10-23T00:00:00.000Z,POINT (3 -62.23)
    23623,23623,Harry,20,2015-05-06T00:00:00.000Z,POINT (-100.236523 23)
    INFO  Feature export complete to standard out in 1676ms for 3 features

Now lets inspect the filesystem:

.. code-block:: bash

    $ find /tmp/dstest | sort

The output should look like::

    /tmp/dstest/
    /tmp/dstest/example-csv
    /tmp/dstest/example-csv/2015
    /tmp/dstest/example-csv/2015/05
    /tmp/dstest/example-csv/2015/05/06
    /tmp/dstest/example-csv/2015/05/06/2_Wcec6a2ec594a4a2eb7c7980a1baf4ab3.parquet
    /tmp/dstest/example-csv/2015/05/06/.2_Wcec6a2ec594a4a2eb7c7980a1baf4ab3.parquet.crc
    /tmp/dstest/example-csv/2015/06
    /tmp/dstest/example-csv/2015/06/07
    /tmp/dstest/example-csv/2015/06/07/1_Wcc082b9cf9bc4965b4cbf64741fee5b6.parquet
    /tmp/dstest/example-csv/2015/06/07/.1_Wcc082b9cf9bc4965b4cbf64741fee5b6.parquet.crc
    /tmp/dstest/example-csv/2015/10
    /tmp/dstest/example-csv/2015/10/23
    /tmp/dstest/example-csv/2015/10/23/1_W741f2151a4ed4eec97461a174a8588b7.parquet
    /tmp/dstest/example-csv/2015/10/23/.1_W741f2151a4ed4eec97461a174a8588b7.parquet.crc
    /tmp/dstest/example-csv/metadata
    /tmp/dstest/example-csv/metadata/storage.json
    /tmp/dstest/example-csv/metadata/.storage.json.crc
    /tmp/dstest/example-csv/metadata/update-2015-05-06-2-12240906-4171-4ab0-acfe-d2ce9c5fff76.json
    /tmp/dstest/example-csv/metadata/.update-2015-05-06-2-12240906-4171-4ab0-acfe-d2ce9c5fff76.json.crc
    /tmp/dstest/example-csv/metadata/update-2015-06-07-1-ecd68700-88e3-4f04-9438-84b6ab935907.json
    /tmp/dstest/example-csv/metadata/.update-2015-06-07-1-ecd68700-88e3-4f04-9438-84b6ab935907.json.crc
    /tmp/dstest/example-csv/metadata/update-2015-10-23-1-667f27a7-4f64-472a-80ed-82e8f1e65575.json
    /tmp/dstest/example-csv/metadata/.update-2015-10-23-1-667f27a7-4f64-472a-80ed-82e8f1e65575.json.crc

Notice that we have a directory structure laid out based on our ``daily,z2-2bit`` scheme. Notice the first parquet
file path is composed of a date path ``2016/05/06`` and then a z2 ordinate of ``2``, which is part of the file name ::

    /tmp/dstest/example-csv/2015/05/06/2/2_Wcec6a2ec594a4a2eb7c7980a1baf4ab3.parquet

The rest of the parquet file name is a UUID, which allows for multiple threads to write different files at once
without interference. If we ingested additional data, another file would be created under the partition, and
GeoMesa would scan them both at query time.

Each new file (or file deletion) will create a separate metadata file, which contains details on the file:

.. code-block:: bash

    $ cat /tmp/dstest/example-csv/metadata/update-2015-05-06-629788a4-6a70-4009-ae20-c45602a88483.json

The output should look like::

    {
        "action" : "Add",
        "count" : 1,
        "envelope" : {
            "xmax" : -100.2365,
            "xmin" : -100.2365,
            "ymax" : 23.0,
            "ymin" : 23.0
        },
        "files" : [
            "2_Wcec6a2ec594a4a2eb7c7980a1baf4ab3.parquet"
        ],
        "name" : "2015/05/06/2",
        "timestamp" : 1538148168948
    }
