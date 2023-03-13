.. _gnom:

********************************************************************************
Gnomonic
********************************************************************************

<<<<<<< HEAD
For a sphere, the gnomonic projection is a projection from the center of
the sphere onto a plane tangent to the center point of the projection.
This projects great circles to straight lines.  For an ellipsoid, it is
the limit of a doubly azimuthal projection, a projection where the
azimuths from 2 points are preserved, as the two points merge into the
center point.  In this case, geodesics project to approximately straight
lines (these are exactly straight if the geodesic includes the center
point).  For details, see Section 8 of :cite:`Karney2013`.

+---------------------+----------------------------------------------------------+
| **Classification**  | Azimuthal                                                |
+---------------------+----------------------------------------------------------+
| **Available forms** | Forward and inverse, spherical and ellipsoidal           |
+---------------------+----------------------------------------------------------+
| **Defined area**    | Within a quarter circumference of the center point       |
=======
+---------------------+----------------------------------------------------------+
| **Classification**  | Pseudocylindrical                                        |
+---------------------+----------------------------------------------------------+
| **Available forms** | Forward and inverse, spherical projection                |
+---------------------+----------------------------------------------------------+
| **Defined area**    | Global                                                   |
>>>>>>> 748ccdbcc6 (Merge pull request #3524 from cffk/merid-update-fix)
+---------------------+----------------------------------------------------------+
| **Alias**           | gnom                                                     |
+---------------------+----------------------------------------------------------+
| **Domain**          | 2D                                                       |
+---------------------+----------------------------------------------------------+
| **Input type**      | Geodetic coordinates                                     |
+---------------------+----------------------------------------------------------+
| **Output type**     | Projected coordinates                                    |
+---------------------+----------------------------------------------------------+


.. figure:: ./images/gnom.png
   :width: 500 px
   :align: center
   :alt:   Gnomonic

<<<<<<< HEAD
   proj-string: ``+proj=gnom +lat_0=90 +lon_0=-50 +R=6.4e6``
=======
   proj-string: ``+proj=gnom +lat_0=90 +lon_0=-50``
>>>>>>> 748ccdbcc6 (Merge pull request #3524 from cffk/merid-update-fix)

Parameters
################################################################################

.. note:: All parameters are optional for the Gnomonic projection.

.. include:: ../options/lon_0.rst

.. include:: ../options/lat_0.rst

<<<<<<< HEAD
.. include:: ../options/x_0.rst

.. include:: ../options/y_0.rst

.. include:: ../options/ellps.rst

.. include:: ../options/R.rst
=======
.. include:: ../options/R.rst

.. include:: ../options/x_0.rst

.. include:: ../options/y_0.rst
>>>>>>> 748ccdbcc6 (Merge pull request #3524 from cffk/merid-update-fix)
