.. _aeqd:

********************************************************************************
Azimuthal Equidistant
********************************************************************************
+---------------------+----------------------------------------------------------+
| **Classification**  | Azimuthal                                                |
+---------------------+----------------------------------------------------------+
| **Available forms** | Forward and inverse, spherical and ellipsoidal           |
+---------------------+----------------------------------------------------------+
<<<<<<< HEAD
<<<<<<< HEAD
<<<<<<< HEAD
| **Defined area**    | Global                                                   |
+---------------------+----------------------------------------------------------+
=======
<<<<<<< HEAD
>>>>>>> 748ccdbcc6 (Merge pull request #3524 from cffk/merid-update-fix)
=======
>>>>>>> c59e00e4f (Merge pull request #3524 from cffk/merid-update-fix)
<<<<<<< HEAD
>>>>>>> 21f069ac96 (Merge pull request #3524 from cffk/merid-update-fix)
=======
=======
| **Defined area**    | Global                                                   |
+---------------------+----------------------------------------------------------+
>>>>>>> 13395ba73 (Fix build with -DPROJ_INTERNAL_CPP_NAMESPACE)
<<<<<<< HEAD
>>>>>>> 69116cc937 (Fix build with -DPROJ_INTERNAL_CPP_NAMESPACE)
=======
=======
>>>>>>> 360db021b (Merge pull request #3524 from cffk/merid-update-fix)
>>>>>>> 3771d4aec1 (Merge pull request #3524 from cffk/merid-update-fix)
| **Alias**           | aeqd                                                     |
+---------------------+----------------------------------------------------------+
| **Domain**          | 2D                                                       |
+---------------------+----------------------------------------------------------+
| **Input type**      | Geodetic coordinates                                     |
+---------------------+----------------------------------------------------------+
| **Output type**     | Projected coordinates                                    |
+---------------------+----------------------------------------------------------+


.. figure:: ./images/aeqd.png
   :width: 500 px
   :align: center
   :alt:   Azimuthal Equidistant

   proj-string: ``+proj=aeqd``


Options
################################################################################

.. note:: All options are optional for the Azimuthal Equidistant projection.

.. option:: +guam

    Use Guam ellipsoidal formulas. Only accurate near the Island of Guam
    (:math:`\lambda\approx 144.5^{\circ}`, :math:`\phi\approx 13.5^{\circ}`)

.. include:: ../options/lat_0.rst

.. include:: ../options/lon_0.rst

.. include:: ../options/x_0.rst

.. include:: ../options/y_0.rst

.. include:: ../options/ellps.rst

.. include:: ../options/R.rst
