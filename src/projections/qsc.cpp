/*
 * This implements the Quadrilateralized Spherical Cube (QSC) projection.
 *
 * Copyright (c) 2011, 2012  Martin Lambers <marlam@marlam.de>
 *
 * The QSC projection was introduced in:
 * [OL76]
 * E.M. O'Neill and R.E. Laubscher, "Extended Studies of a Quadrilateralized
 * Spherical Cube Earth Data Base", Naval Environmental Prediction Research
 * Facility Tech. Report NEPRF 3-76 (CSC), May 1976.
 *
 * The preceding shift from an ellipsoid to a sphere, which allows to apply
 * this projection to ellipsoids as used in the Ellipsoidal Cube Map model,
 * is described in
 * [LK12]
 * M. Lambers and A. Kolb, "Ellipsoidal Cube Maps for Accurate Rendering of
 * Planetary-Scale Terrain Data", Proc. Pacific Graphics (Short Papers), Sep.
 * 2012
 *
 * You have to choose one of the following projection centers,
 * corresponding to the centers of the six cube faces:
 * phi0 = 0.0, lam0 = 0.0       ("front" face)
 * phi0 = 0.0, lam0 = 90.0      ("right" face)
 * phi0 = 0.0, lam0 = 180.0     ("back" face)
 * phi0 = 0.0, lam0 = -90.0     ("left" face)
 * phi0 = 90.0                  ("top" face)
 * phi0 = -90.0                 ("bottom" face)
 * Other projection centers will not work!
 *
 * In the projection code below, each cube face is handled differently.
 * See the computation of the face parameter in the PROJECTION(qsc) function
 * and the handling of different face values (FACE_*) in the forward and
 * inverse projections.
 *
 * Furthermore, the projection is originally only defined for theta angles
 * between (-1/4 * PI) and (+1/4 * PI) on the current cube face. This area
 * of definition is named AREA_0 in the projection code below. The other
 * three areas of a cube face are handled by rotation of AREA_0.
 */

#define PJ_LIB_

#include <errno.h>
#include <math.h>

#include "proj.h"
#include "proj_internal.h"

/* The six cube faces. */
namespace { // anonymous namespace
enum Face {
    FACE_FRONT  = 0,
    FACE_RIGHT  = 1,
    FACE_BACK   = 2,
    FACE_LEFT   = 3,
    FACE_TOP    = 4,
    FACE_BOTTOM = 5
};
} // anonymous namespace

namespace { // anonymous namespace
struct pj_opaque {
        enum Face face;
        double a_squared;
        double b;
        double one_minus_f;
        double one_minus_f_squared;
};
} // anonymous namespace
PROJ_HEAD(qsc, "Quadrilateralized Spherical Cube") "\n\tAzi, Sph";

#define EPS10 1.e-10

/* The four areas on a cube face. AREA_0 is the area of definition,
 * the other three areas are counted counterclockwise. */
namespace { // anonymous namespace
enum Area {
    AREA_0 = 0,
    AREA_1 = 1,
    AREA_2 = 2,
    AREA_3 = 3
};
} // anonymous namespace

/* Helper function for forward projection: compute the theta angle
 * and determine the area number. */
static double qsc_fwd_equat_face_theta(double phi, double y, double x, enum Area *area) {
    double theta;
    if (phi < EPS10) {
        *area = AREA_0;
        theta = 0.0;
    } else {
        theta = atan2(y, x);
        if (fabs(theta) <= M_FORTPI) {
            *area = AREA_0;
        } else if (theta > M_FORTPI && theta <= M_HALFPI + M_FORTPI) {
            *area = AREA_1;
            theta -= M_HALFPI;
        } else if (theta > M_HALFPI + M_FORTPI || theta <= -(M_HALFPI + M_FORTPI)) {
            *area = AREA_2;
            theta = (theta >= 0.0 ? theta - M_PI : theta + M_PI);
        } else {
            *area = AREA_3;
            theta += M_HALFPI;
        }
    }
    return theta;
}

/* Helper function: shift the longitude. */
<<<<<<< HEAD
<<<<<<< HEAD
<<<<<<< HEAD
<<<<<<< HEAD
<<<<<<< HEAD
<<<<<<< HEAD
<<<<<<< HEAD
<<<<<<< HEAD
<<<<<<< HEAD
<<<<<<< HEAD
<<<<<<< HEAD
<<<<<<< HEAD
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
>>>>>>> 3771d4aec1 (Merge pull request #3524 from cffk/merid-update-fix)
=======
>>>>>>> 885e4882b8 (Merge pull request #3524 from cffk/merid-update-fix)
<<<<<<< HEAD
<<<<<<< HEAD
<<<<<<< HEAD
<<<<<<< HEAD
<<<<<<< HEAD
<<<<<<< HEAD
<<<<<<< HEAD
=======
>>>>>>> ebd1587dc5 (Merge pull request #3524 from cffk/merid-update-fix)
=======
>>>>>>> 6e4203f66c (Merge pull request #3524 from cffk/merid-update-fix)
=======
>>>>>>> 80ac813585 (Merge pull request #3524 from cffk/merid-update-fix)
=======
>>>>>>> d8e8090c80 (typo fixes)
=======
>>>>>>> 3bd0f77d39 (Merge pull request #3524 from cffk/merid-update-fix)
=======
>>>>>>> f00ffe609e (Merge pull request #3524 from cffk/merid-update-fix)
=======
>>>>>>> 48ae38528d (typo fixes)
=======
>>>>>>> 25ac262782 (Merge pull request #3524 from cffk/merid-update-fix)
=======
=======
>>>>>>> ebd1587dc5 (Merge pull request #3524 from cffk/merid-update-fix)
>>>>>>> dbc4ff68b0 (Merge pull request #3524 from cffk/merid-update-fix)
=======
>>>>>>> 3771d4aec1 (Merge pull request #3524 from cffk/merid-update-fix)
=======
>>>>>>> c63e6e91bd (Merge pull request #3524 from cffk/merid-update-fix)
<<<<<<< HEAD
<<<<<<< HEAD
=======
>>>>>>> 10b5e77237 (Merge pull request #3524 from cffk/merid-update-fix)
=======
>>>>>>> 74eac2217b (typo fixes)
<<<<<<< HEAD
<<<<<<< HEAD
=======
>>>>>>> 25ac262782 (Merge pull request #3524 from cffk/merid-update-fix)
=======
=======
>>>>>>> 3771d4aec1 (Merge pull request #3524 from cffk/merid-update-fix)
>>>>>>> c8fb3456cf (Merge pull request #3524 from cffk/merid-update-fix)
<<<<<<< HEAD
=======
>>>>>>> a029d873e8 (Merge pull request #3524 from cffk/merid-update-fix)
=======
>>>>>>> bb15f534d5 (Merge pull request #3524 from cffk/merid-update-fix)
=======
>>>>>>> a4391c6673 (typo fixes)
=======
=======
>>>>>>> 3771d4aec1 (Merge pull request #3524 from cffk/merid-update-fix)
>>>>>>> 8a24938f25 (Merge pull request #3524 from cffk/merid-update-fix)
=======
>>>>>>> 3bd0f77d39 (Merge pull request #3524 from cffk/merid-update-fix)
=======
=======
>>>>>>> 10b5e77237 (Merge pull request #3524 from cffk/merid-update-fix)
>>>>>>> f00ffe609e (Merge pull request #3524 from cffk/merid-update-fix)
=======
>>>>>>> 48ae38528d (typo fixes)
=======
>>>>>>> 25ac262782 (Merge pull request #3524 from cffk/merid-update-fix)
static double qsc_shift_longitude_origin(double longitude, double offset) {
    double slon = longitude + offset;
=======
static double qsc_shift_lon_origin(double lon, double offset) {
    double slon = lon + offset;
<<<<<<< HEAD
<<<<<<< HEAD
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
>>>>>>> c8fb3456cf (Merge pull request #3524 from cffk/merid-update-fix)
=======
>>>>>>> 8a24938f25 (Merge pull request #3524 from cffk/merid-update-fix)
=======
>>>>>>> 3bd0f77d39 (Merge pull request #3524 from cffk/merid-update-fix)
=======
>>>>>>> f00ffe609e (Merge pull request #3524 from cffk/merid-update-fix)
=======
=======
>>>>>>> c8fb3456cf (Merge pull request #3524 from cffk/merid-update-fix)
>>>>>>> 25ac262782 (Merge pull request #3524 from cffk/merid-update-fix)
>>>>>>> 360db021b6 (Merge pull request #3524 from cffk/merid-update-fix)
=======
=======
>>>>>>> b5f4d47b2b (Merge pull request #3524 from cffk/merid-update-fix)
<<<<<<< HEAD
<<<<<<< HEAD
<<<<<<< HEAD
<<<<<<< HEAD
=======
>>>>>>> f00ffe609e (Merge pull request #3524 from cffk/merid-update-fix)
=======
>>>>>>> 25ac262782 (Merge pull request #3524 from cffk/merid-update-fix)
=======
>>>>>>> 360db021b6 (Merge pull request #3524 from cffk/merid-update-fix)
=======
>>>>>>> 10b5e77237 (Merge pull request #3524 from cffk/merid-update-fix)
<<<<<<< HEAD
<<<<<<< HEAD
=======
>>>>>>> c8fb3456cf (Merge pull request #3524 from cffk/merid-update-fix)
=======
>>>>>>> 360db021b6 (Merge pull request #3524 from cffk/merid-update-fix)
=======
>>>>>>> bb15f534d5 (Merge pull request #3524 from cffk/merid-update-fix)
=======
>>>>>>> 8a24938f25 (Merge pull request #3524 from cffk/merid-update-fix)
=======
>>>>>>> f00ffe609e (Merge pull request #3524 from cffk/merid-update-fix)
=======
=======
>>>>>>> c8fb3456cf (Merge pull request #3524 from cffk/merid-update-fix)
>>>>>>> 25ac262782 (Merge pull request #3524 from cffk/merid-update-fix)
>>>>>>> locationtech-main
=======
static double qsc_shift_lon_origin(double lon, double offset) {
    double slon = lon + offset;
>>>>>>> 748ccdbcc6 (Merge pull request #3524 from cffk/merid-update-fix)
<<<<<<< HEAD
<<<<<<< HEAD
<<<<<<< HEAD
<<<<<<< HEAD
<<<<<<< HEAD
<<<<<<< HEAD
<<<<<<< HEAD
=======
>>>>>>> 74eac2217b (typo fixes)
=======
>>>>>>> a4391c6673 (typo fixes)
=======
>>>>>>> f00ffe609e (Merge pull request #3524 from cffk/merid-update-fix)
=======
=======
>>>>>>> 74eac2217b (typo fixes)
>>>>>>> 48ae38528d (typo fixes)
>>>>>>> a8fbb11965 (Merge pull request #3524 from cffk/merid-update-fix)
=======
=======
static double qsc_shift_longitude_origin(double longitude, double offset) {
    double slon = longitude + offset;
>>>>>>> e4a6fd6d75 (typo fixes)
<<<<<<< HEAD
<<<<<<< HEAD
<<<<<<< HEAD
<<<<<<< HEAD
<<<<<<< HEAD
<<<<<<< HEAD
<<<<<<< HEAD
=======
>>>>>>> c8fb3456cf (Merge pull request #3524 from cffk/merid-update-fix)
=======
>>>>>>> 8a24938f25 (Merge pull request #3524 from cffk/merid-update-fix)
=======
>>>>>>> 48ae38528d (typo fixes)
=======
=======
>>>>>>> c8fb3456cf (Merge pull request #3524 from cffk/merid-update-fix)
>>>>>>> 25ac262782 (Merge pull request #3524 from cffk/merid-update-fix)
>>>>>>> aa21c6fa76 (typo fixes)
=======
=======
>>>>>>> 360db021b (Merge pull request #3524 from cffk/merid-update-fix)
>>>>>>> 3771d4aec1 (Merge pull request #3524 from cffk/merid-update-fix)
>>>>>>> b5f4d47b2b (Merge pull request #3524 from cffk/merid-update-fix)
<<<<<<< HEAD
<<<<<<< HEAD
<<<<<<< HEAD
<<<<<<< HEAD
<<<<<<< HEAD
<<<<<<< HEAD
=======
>>>>>>> ebd1587dc5 (Merge pull request #3524 from cffk/merid-update-fix)
=======
>>>>>>> 6e4203f66c (Merge pull request #3524 from cffk/merid-update-fix)
=======
>>>>>>> 25ac262782 (Merge pull request #3524 from cffk/merid-update-fix)
=======
=======
>>>>>>> ebd1587dc5 (Merge pull request #3524 from cffk/merid-update-fix)
>>>>>>> dbc4ff68b0 (Merge pull request #3524 from cffk/merid-update-fix)
=======
static double qsc_shift_lon_origin(double lon, double offset) {
    double slon = lon + offset;
>>>>>>> 153df87aaa (Merge pull request #3524 from cffk/merid-update-fix)
<<<<<<< HEAD
<<<<<<< HEAD
<<<<<<< HEAD
<<<<<<< HEAD
=======
>>>>>>> 80ac813585 (Merge pull request #3524 from cffk/merid-update-fix)
=======
>>>>>>> dbc4ff68b0 (Merge pull request #3524 from cffk/merid-update-fix)
=======
static double qsc_shift_lon_origin(double lon, double offset) {
    double slon = lon + offset;
>>>>>>> b609c280f5 (Merge pull request #3524 from cffk/merid-update-fix)
<<<<<<< HEAD
<<<<<<< HEAD
=======
>>>>>>> d8e8090c80 (typo fixes)
=======
static double qsc_shift_longitude_origin(double longitude, double offset) {
    double slon = longitude + offset;
>>>>>>> 86ade66356 (typo fixes)
<<<<<<< HEAD
<<<<<<< HEAD
=======
>>>>>>> 360db021b6 (Merge pull request #3524 from cffk/merid-update-fix)
>>>>>>> c63e6e91bd (Merge pull request #3524 from cffk/merid-update-fix)
=======
>>>>>>> a8fbb11965 (Merge pull request #3524 from cffk/merid-update-fix)
>>>>>>> 10b5e77237 (Merge pull request #3524 from cffk/merid-update-fix)
<<<<<<< HEAD
<<<<<<< HEAD
=======
>>>>>>> aa21c6fa76 (typo fixes)
>>>>>>> 74eac2217b (typo fixes)
=======
>>>>>>> c8fb3456cf (Merge pull request #3524 from cffk/merid-update-fix)
<<<<<<< HEAD
<<<<<<< HEAD
=======
>>>>>>> ebd1587dc5 (Merge pull request #3524 from cffk/merid-update-fix)
<<<<<<< HEAD
=======
static double qsc_shift_lon_origin(double lon, double offset) {
    double slon = lon + offset;
>>>>>>> 208fcbd5e7 (Merge pull request #3524 from cffk/merid-update-fix)
=======
static double qsc_shift_longitude_origin(double longitude, double offset) {
    double slon = longitude + offset;
>>>>>>> bf1dfe8af6 (typo fixes)
=======
>>>>>>> 360db021b6 (Merge pull request #3524 from cffk/merid-update-fix)
>>>>>>> a029d873e8 (Merge pull request #3524 from cffk/merid-update-fix)
=======
>>>>>>> a8fbb11965 (Merge pull request #3524 from cffk/merid-update-fix)
>>>>>>> bb15f534d5 (Merge pull request #3524 from cffk/merid-update-fix)
=======
>>>>>>> aa21c6fa76 (typo fixes)
>>>>>>> a4391c6673 (typo fixes)
=======
>>>>>>> 8a24938f25 (Merge pull request #3524 from cffk/merid-update-fix)
=======
>>>>>>> 6e4203f66c (Merge pull request #3524 from cffk/merid-update-fix)
=======
>>>>>>> 80ac813585 (Merge pull request #3524 from cffk/merid-update-fix)
=======
>>>>>>> d8e8090c80 (typo fixes)
=======
=======
>>>>>>> 360db021b6 (Merge pull request #3524 from cffk/merid-update-fix)
>>>>>>> c63e6e91bd (Merge pull request #3524 from cffk/merid-update-fix)
>>>>>>> 3bd0f77d39 (Merge pull request #3524 from cffk/merid-update-fix)
=======
>>>>>>> f00ffe609e (Merge pull request #3524 from cffk/merid-update-fix)
=======
=======
>>>>>>> aa21c6fa76 (typo fixes)
>>>>>>> 74eac2217b (typo fixes)
>>>>>>> 48ae38528d (typo fixes)
=======
>>>>>>> 25ac262782 (Merge pull request #3524 from cffk/merid-update-fix)
=======
=======
>>>>>>> ebd1587dc5 (Merge pull request #3524 from cffk/merid-update-fix)
>>>>>>> dbc4ff68b0 (Merge pull request #3524 from cffk/merid-update-fix)
=======
>>>>>>> locationtech-main
=======
static double qsc_shift_lon_origin(double lon, double offset) {
    double slon = lon + offset;
>>>>>>> 0a2f6458d1 (Merge pull request #3524 from cffk/merid-update-fix)
>>>>>>> 885e4882b8 (Merge pull request #3524 from cffk/merid-update-fix)
=======
static double qsc_shift_lon_origin(double lon, double offset) {
    double slon = lon + offset;
>>>>>>> 0a2f6458d1 (Merge pull request #3524 from cffk/merid-update-fix)
    if (slon < -M_PI) {
        slon += M_TWOPI;
    } else if (slon > +M_PI) {
        slon -= M_TWOPI;
    }
    return slon;
}


static PJ_XY qsc_e_forward (PJ_LP lp, PJ *P) {          /* Ellipsoidal, forward */
    PJ_XY xy = {0.0,0.0};
    struct pj_opaque *Q = static_cast<struct pj_opaque*>(P->opaque);
<<<<<<< HEAD
<<<<<<< HEAD
<<<<<<< HEAD
<<<<<<< HEAD
<<<<<<< HEAD
<<<<<<< HEAD
<<<<<<< HEAD
<<<<<<< HEAD
<<<<<<< HEAD
<<<<<<< HEAD
<<<<<<< HEAD
<<<<<<< HEAD
<<<<<<< HEAD
<<<<<<< HEAD
<<<<<<< HEAD
<<<<<<< HEAD
<<<<<<< HEAD
<<<<<<< HEAD
<<<<<<< HEAD
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
>>>>>>> 885e4882b8 (Merge pull request #3524 from cffk/merid-update-fix)
=======
>>>>>>> 25ac262782 (Merge pull request #3524 from cffk/merid-update-fix)
=======
>>>>>>> dbc4ff68b0 (Merge pull request #3524 from cffk/merid-update-fix)
=======
>>>>>>> 74eac2217b (typo fixes)
=======
>>>>>>> c8fb3456cf (Merge pull request #3524 from cffk/merid-update-fix)
<<<<<<< HEAD
<<<<<<< HEAD
=======
>>>>>>> ebd1587dc5 (Merge pull request #3524 from cffk/merid-update-fix)
=======
>>>>>>> a4391c6673 (typo fixes)
=======
>>>>>>> 8a24938f25 (Merge pull request #3524 from cffk/merid-update-fix)
=======
>>>>>>> 6e4203f66c (Merge pull request #3524 from cffk/merid-update-fix)
=======
>>>>>>> 80ac813585 (Merge pull request #3524 from cffk/merid-update-fix)
=======
>>>>>>> d8e8090c80 (typo fixes)
=======
>>>>>>> 3bd0f77d39 (Merge pull request #3524 from cffk/merid-update-fix)
=======
>>>>>>> f00ffe609e (Merge pull request #3524 from cffk/merid-update-fix)
=======
=======
>>>>>>> 74eac2217b (typo fixes)
>>>>>>> 48ae38528d (typo fixes)
=======
>>>>>>> 25ac262782 (Merge pull request #3524 from cffk/merid-update-fix)
=======
=======
>>>>>>> ebd1587dc5 (Merge pull request #3524 from cffk/merid-update-fix)
>>>>>>> dbc4ff68b0 (Merge pull request #3524 from cffk/merid-update-fix)
    double lat, longitude;
=======
    double lat, lon;
<<<<<<< HEAD
>>>>>>> 360db021b6 (Merge pull request #3524 from cffk/merid-update-fix)
=======
>>>>>>> locationtech-main
=======
    double lat, lon;
>>>>>>> 748ccdbcc6 (Merge pull request #3524 from cffk/merid-update-fix)
<<<<<<< HEAD
>>>>>>> a8fbb11965 (Merge pull request #3524 from cffk/merid-update-fix)
=======
=======
    double lat, longitude;
>>>>>>> e4a6fd6d75 (typo fixes)
<<<<<<< HEAD
<<<<<<< HEAD
<<<<<<< HEAD
<<<<<<< HEAD
<<<<<<< HEAD
<<<<<<< HEAD
<<<<<<< HEAD
=======
>>>>>>> c8fb3456cf (Merge pull request #3524 from cffk/merid-update-fix)
=======
>>>>>>> 8a24938f25 (Merge pull request #3524 from cffk/merid-update-fix)
=======
>>>>>>> 48ae38528d (typo fixes)
=======
=======
>>>>>>> c8fb3456cf (Merge pull request #3524 from cffk/merid-update-fix)
>>>>>>> 25ac262782 (Merge pull request #3524 from cffk/merid-update-fix)
>>>>>>> aa21c6fa76 (typo fixes)
=======
=======
    double lat, longitude;
=======
    double lat, lon;
>>>>>>> 360db021b (Merge pull request #3524 from cffk/merid-update-fix)
>>>>>>> 3771d4aec1 (Merge pull request #3524 from cffk/merid-update-fix)
>>>>>>> b5f4d47b2b (Merge pull request #3524 from cffk/merid-update-fix)
<<<<<<< HEAD
<<<<<<< HEAD
<<<<<<< HEAD
<<<<<<< HEAD
<<<<<<< HEAD
<<<<<<< HEAD
=======
>>>>>>> 25ac262782 (Merge pull request #3524 from cffk/merid-update-fix)
=======
>>>>>>> dbc4ff68b0 (Merge pull request #3524 from cffk/merid-update-fix)
=======
    double lat, lon;
>>>>>>> 153df87aaa (Merge pull request #3524 from cffk/merid-update-fix)
=======
    double lat, lon;
>>>>>>> b609c280f5 (Merge pull request #3524 from cffk/merid-update-fix)
<<<<<<< HEAD
<<<<<<< HEAD
=======
    double lat, longitude;
>>>>>>> 86ade66356 (typo fixes)
=======
<<<<<<< HEAD
<<<<<<< HEAD
=======
>>>>>>> 10b5e77237 (Merge pull request #3524 from cffk/merid-update-fix)
    double lat, longitude;
=======
    double lat, lon;
<<<<<<< HEAD
>>>>>>> 360db021b6 (Merge pull request #3524 from cffk/merid-update-fix)
<<<<<<< HEAD
>>>>>>> c63e6e91bd (Merge pull request #3524 from cffk/merid-update-fix)
=======
=======
>>>>>>> locationtech-main
=======
    double lat, lon;
>>>>>>> 748ccdbcc6 (Merge pull request #3524 from cffk/merid-update-fix)
>>>>>>> a8fbb11965 (Merge pull request #3524 from cffk/merid-update-fix)
>>>>>>> 10b5e77237 (Merge pull request #3524 from cffk/merid-update-fix)
=======
>>>>>>> aa21c6fa76 (typo fixes)
>>>>>>> 74eac2217b (typo fixes)
<<<<<<< HEAD
<<<<<<< HEAD
=======
>>>>>>> c8fb3456cf (Merge pull request #3524 from cffk/merid-update-fix)
=======
=======
    double lat, lon;
>>>>>>> 153df87aaa (Merge pull request #3524 from cffk/merid-update-fix)
>>>>>>> ebd1587dc5 (Merge pull request #3524 from cffk/merid-update-fix)
<<<<<<< HEAD
=======
    double lat, lon;
>>>>>>> 208fcbd5e7 (Merge pull request #3524 from cffk/merid-update-fix)
=======
    double lat, longitude;
>>>>>>> bf1dfe8af6 (typo fixes)
=======
=======
>>>>>>> bb15f534d5 (Merge pull request #3524 from cffk/merid-update-fix)
    double lat, longitude;
=======
    double lat, lon;
<<<<<<< HEAD
>>>>>>> 360db021b6 (Merge pull request #3524 from cffk/merid-update-fix)
<<<<<<< HEAD
>>>>>>> a029d873e8 (Merge pull request #3524 from cffk/merid-update-fix)
=======
=======
>>>>>>> locationtech-main
=======
    double lat, lon;
<<<<<<< HEAD
>>>>>>> 748ccdbcc6 (Merge pull request #3524 from cffk/merid-update-fix)
>>>>>>> a8fbb11965 (Merge pull request #3524 from cffk/merid-update-fix)
>>>>>>> bb15f534d5 (Merge pull request #3524 from cffk/merid-update-fix)
=======
>>>>>>> aa21c6fa76 (typo fixes)
>>>>>>> a4391c6673 (typo fixes)
=======
>>>>>>> 8a24938f25 (Merge pull request #3524 from cffk/merid-update-fix)
=======
=======
    double lat, lon;
>>>>>>> 153df87aaa (Merge pull request #3524 from cffk/merid-update-fix)
>>>>>>> 6e4203f66c (Merge pull request #3524 from cffk/merid-update-fix)
=======
>>>>>>> 80ac813585 (Merge pull request #3524 from cffk/merid-update-fix)
=======
=======
    double lat, longitude;
>>>>>>> 86ade66356 (typo fixes)
>>>>>>> d8e8090c80 (typo fixes)
=======
=======
=======
>>>>>>> 10b5e77237 (Merge pull request #3524 from cffk/merid-update-fix)
>>>>>>> f00ffe609e (Merge pull request #3524 from cffk/merid-update-fix)
    double lat, longitude;
=======
    double lat, lon;
<<<<<<< HEAD
>>>>>>> 360db021b6 (Merge pull request #3524 from cffk/merid-update-fix)
<<<<<<< HEAD
>>>>>>> c63e6e91bd (Merge pull request #3524 from cffk/merid-update-fix)
<<<<<<< HEAD
>>>>>>> 3bd0f77d39 (Merge pull request #3524 from cffk/merid-update-fix)
=======
=======
=======
>>>>>>> locationtech-main
=======
    double lat, lon;
>>>>>>> 748ccdbcc6 (Merge pull request #3524 from cffk/merid-update-fix)
>>>>>>> a8fbb11965 (Merge pull request #3524 from cffk/merid-update-fix)
>>>>>>> 10b5e77237 (Merge pull request #3524 from cffk/merid-update-fix)
>>>>>>> f00ffe609e (Merge pull request #3524 from cffk/merid-update-fix)
=======
>>>>>>> 48ae38528d (typo fixes)
=======
=======
>>>>>>> c8fb3456cf (Merge pull request #3524 from cffk/merid-update-fix)
>>>>>>> 25ac262782 (Merge pull request #3524 from cffk/merid-update-fix)
=======
>>>>>>> dbc4ff68b0 (Merge pull request #3524 from cffk/merid-update-fix)
=======
>>>>>>> 0a2f6458d1 (Merge pull request #3524 from cffk/merid-update-fix)
>>>>>>> 885e4882b8 (Merge pull request #3524 from cffk/merid-update-fix)
=======
    double lat, lon;
>>>>>>> 0a2f6458d1 (Merge pull request #3524 from cffk/merid-update-fix)
    double theta, phi;
    double t, mu; /* nu; */
    enum Area area;

    /* Convert the geodetic latitude to a geocentric latitude.
     * This corresponds to the shift from the ellipsoid to the sphere
     * described in [LK12]. */
    if (P->es != 0.0) {
        lat = atan(Q->one_minus_f_squared * tan(lp.phi));
    } else {
        lat = lp.phi;
    }

<<<<<<< HEAD
<<<<<<< HEAD
<<<<<<< HEAD
<<<<<<< HEAD
<<<<<<< HEAD
<<<<<<< HEAD
<<<<<<< HEAD
<<<<<<< HEAD
<<<<<<< HEAD
<<<<<<< HEAD
<<<<<<< HEAD
<<<<<<< HEAD
<<<<<<< HEAD
<<<<<<< HEAD
<<<<<<< HEAD
<<<<<<< HEAD
<<<<<<< HEAD
<<<<<<< HEAD
<<<<<<< HEAD
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
>>>>>>> 885e4882b8 (Merge pull request #3524 from cffk/merid-update-fix)
=======
>>>>>>> 25ac262782 (Merge pull request #3524 from cffk/merid-update-fix)
=======
>>>>>>> dbc4ff68b0 (Merge pull request #3524 from cffk/merid-update-fix)
=======
>>>>>>> 74eac2217b (typo fixes)
=======
>>>>>>> c8fb3456cf (Merge pull request #3524 from cffk/merid-update-fix)
<<<<<<< HEAD
<<<<<<< HEAD
=======
>>>>>>> ebd1587dc5 (Merge pull request #3524 from cffk/merid-update-fix)
=======
>>>>>>> a4391c6673 (typo fixes)
=======
>>>>>>> 8a24938f25 (Merge pull request #3524 from cffk/merid-update-fix)
=======
>>>>>>> 6e4203f66c (Merge pull request #3524 from cffk/merid-update-fix)
=======
>>>>>>> 80ac813585 (Merge pull request #3524 from cffk/merid-update-fix)
=======
>>>>>>> d8e8090c80 (typo fixes)
=======
>>>>>>> 3bd0f77d39 (Merge pull request #3524 from cffk/merid-update-fix)
=======
>>>>>>> f00ffe609e (Merge pull request #3524 from cffk/merid-update-fix)
=======
=======
>>>>>>> 74eac2217b (typo fixes)
>>>>>>> 48ae38528d (typo fixes)
=======
>>>>>>> 25ac262782 (Merge pull request #3524 from cffk/merid-update-fix)
=======
=======
>>>>>>> ebd1587dc5 (Merge pull request #3524 from cffk/merid-update-fix)
>>>>>>> dbc4ff68b0 (Merge pull request #3524 from cffk/merid-update-fix)
    /* Convert the input lat, longitude into theta, phi as used by QSC.
=======
    /* Convert the input lat, lon into theta, phi as used by QSC.
<<<<<<< HEAD
>>>>>>> 360db021b6 (Merge pull request #3524 from cffk/merid-update-fix)
=======
>>>>>>> locationtech-main
=======
    /* Convert the input lat, lon into theta, phi as used by QSC.
>>>>>>> 748ccdbcc6 (Merge pull request #3524 from cffk/merid-update-fix)
<<<<<<< HEAD
>>>>>>> a8fbb11965 (Merge pull request #3524 from cffk/merid-update-fix)
=======
=======
    /* Convert the input lat, longitude into theta, phi as used by QSC.
>>>>>>> e4a6fd6d75 (typo fixes)
<<<<<<< HEAD
<<<<<<< HEAD
<<<<<<< HEAD
<<<<<<< HEAD
<<<<<<< HEAD
<<<<<<< HEAD
<<<<<<< HEAD
=======
>>>>>>> c8fb3456cf (Merge pull request #3524 from cffk/merid-update-fix)
=======
>>>>>>> 8a24938f25 (Merge pull request #3524 from cffk/merid-update-fix)
=======
>>>>>>> 48ae38528d (typo fixes)
=======
=======
>>>>>>> c8fb3456cf (Merge pull request #3524 from cffk/merid-update-fix)
>>>>>>> 25ac262782 (Merge pull request #3524 from cffk/merid-update-fix)
>>>>>>> aa21c6fa76 (typo fixes)
=======
=======
    /* Convert the input lat, longitude into theta, phi as used by QSC.
=======
    /* Convert the input lat, lon into theta, phi as used by QSC.
>>>>>>> 360db021b (Merge pull request #3524 from cffk/merid-update-fix)
>>>>>>> 3771d4aec1 (Merge pull request #3524 from cffk/merid-update-fix)
>>>>>>> b5f4d47b2b (Merge pull request #3524 from cffk/merid-update-fix)
<<<<<<< HEAD
<<<<<<< HEAD
<<<<<<< HEAD
<<<<<<< HEAD
<<<<<<< HEAD
<<<<<<< HEAD
=======
>>>>>>> 25ac262782 (Merge pull request #3524 from cffk/merid-update-fix)
=======
>>>>>>> dbc4ff68b0 (Merge pull request #3524 from cffk/merid-update-fix)
=======
    /* Convert the input lat, lon into theta, phi as used by QSC.
>>>>>>> 153df87aaa (Merge pull request #3524 from cffk/merid-update-fix)
=======
    /* Convert the input lat, lon into theta, phi as used by QSC.
>>>>>>> b609c280f5 (Merge pull request #3524 from cffk/merid-update-fix)
<<<<<<< HEAD
<<<<<<< HEAD
=======
    /* Convert the input lat, longitude into theta, phi as used by QSC.
>>>>>>> 86ade66356 (typo fixes)
=======
<<<<<<< HEAD
<<<<<<< HEAD
=======
>>>>>>> 10b5e77237 (Merge pull request #3524 from cffk/merid-update-fix)
    /* Convert the input lat, longitude into theta, phi as used by QSC.
=======
    /* Convert the input lat, lon into theta, phi as used by QSC.
<<<<<<< HEAD
>>>>>>> 360db021b6 (Merge pull request #3524 from cffk/merid-update-fix)
<<<<<<< HEAD
>>>>>>> c63e6e91bd (Merge pull request #3524 from cffk/merid-update-fix)
=======
=======
>>>>>>> locationtech-main
=======
    /* Convert the input lat, lon into theta, phi as used by QSC.
>>>>>>> 748ccdbcc6 (Merge pull request #3524 from cffk/merid-update-fix)
>>>>>>> a8fbb11965 (Merge pull request #3524 from cffk/merid-update-fix)
>>>>>>> 10b5e77237 (Merge pull request #3524 from cffk/merid-update-fix)
=======
>>>>>>> aa21c6fa76 (typo fixes)
>>>>>>> 74eac2217b (typo fixes)
<<<<<<< HEAD
<<<<<<< HEAD
=======
>>>>>>> c8fb3456cf (Merge pull request #3524 from cffk/merid-update-fix)
=======
=======
    /* Convert the input lat, lon into theta, phi as used by QSC.
>>>>>>> 153df87aaa (Merge pull request #3524 from cffk/merid-update-fix)
>>>>>>> ebd1587dc5 (Merge pull request #3524 from cffk/merid-update-fix)
<<<<<<< HEAD
=======
    /* Convert the input lat, lon into theta, phi as used by QSC.
>>>>>>> 208fcbd5e7 (Merge pull request #3524 from cffk/merid-update-fix)
=======
    /* Convert the input lat, longitude into theta, phi as used by QSC.
>>>>>>> bf1dfe8af6 (typo fixes)
=======
=======
>>>>>>> bb15f534d5 (Merge pull request #3524 from cffk/merid-update-fix)
    /* Convert the input lat, longitude into theta, phi as used by QSC.
=======
    /* Convert the input lat, lon into theta, phi as used by QSC.
<<<<<<< HEAD
>>>>>>> 360db021b6 (Merge pull request #3524 from cffk/merid-update-fix)
<<<<<<< HEAD
>>>>>>> a029d873e8 (Merge pull request #3524 from cffk/merid-update-fix)
=======
=======
>>>>>>> locationtech-main
=======
    /* Convert the input lat, lon into theta, phi as used by QSC.
<<<<<<< HEAD
>>>>>>> 748ccdbcc6 (Merge pull request #3524 from cffk/merid-update-fix)
>>>>>>> a8fbb11965 (Merge pull request #3524 from cffk/merid-update-fix)
>>>>>>> bb15f534d5 (Merge pull request #3524 from cffk/merid-update-fix)
=======
>>>>>>> aa21c6fa76 (typo fixes)
>>>>>>> a4391c6673 (typo fixes)
=======
>>>>>>> 8a24938f25 (Merge pull request #3524 from cffk/merid-update-fix)
=======
=======
    /* Convert the input lat, lon into theta, phi as used by QSC.
>>>>>>> 153df87aaa (Merge pull request #3524 from cffk/merid-update-fix)
>>>>>>> 6e4203f66c (Merge pull request #3524 from cffk/merid-update-fix)
=======
>>>>>>> 80ac813585 (Merge pull request #3524 from cffk/merid-update-fix)
=======
=======
    /* Convert the input lat, longitude into theta, phi as used by QSC.
>>>>>>> 86ade66356 (typo fixes)
>>>>>>> d8e8090c80 (typo fixes)
=======
=======
=======
>>>>>>> 10b5e77237 (Merge pull request #3524 from cffk/merid-update-fix)
>>>>>>> f00ffe609e (Merge pull request #3524 from cffk/merid-update-fix)
    /* Convert the input lat, longitude into theta, phi as used by QSC.
=======
    /* Convert the input lat, lon into theta, phi as used by QSC.
<<<<<<< HEAD
>>>>>>> 360db021b6 (Merge pull request #3524 from cffk/merid-update-fix)
<<<<<<< HEAD
>>>>>>> c63e6e91bd (Merge pull request #3524 from cffk/merid-update-fix)
<<<<<<< HEAD
>>>>>>> 3bd0f77d39 (Merge pull request #3524 from cffk/merid-update-fix)
=======
=======
=======
>>>>>>> locationtech-main
=======
    /* Convert the input lat, lon into theta, phi as used by QSC.
>>>>>>> 748ccdbcc6 (Merge pull request #3524 from cffk/merid-update-fix)
>>>>>>> a8fbb11965 (Merge pull request #3524 from cffk/merid-update-fix)
>>>>>>> 10b5e77237 (Merge pull request #3524 from cffk/merid-update-fix)
>>>>>>> f00ffe609e (Merge pull request #3524 from cffk/merid-update-fix)
=======
>>>>>>> 48ae38528d (typo fixes)
=======
=======
>>>>>>> c8fb3456cf (Merge pull request #3524 from cffk/merid-update-fix)
>>>>>>> 25ac262782 (Merge pull request #3524 from cffk/merid-update-fix)
=======
>>>>>>> dbc4ff68b0 (Merge pull request #3524 from cffk/merid-update-fix)
=======
>>>>>>> 0a2f6458d1 (Merge pull request #3524 from cffk/merid-update-fix)
>>>>>>> 885e4882b8 (Merge pull request #3524 from cffk/merid-update-fix)
=======
    /* Convert the input lat, lon into theta, phi as used by QSC.
>>>>>>> 0a2f6458d1 (Merge pull request #3524 from cffk/merid-update-fix)
     * This depends on the cube face and the area on it.
     * For the top and bottom face, we can compute theta and phi
     * directly from phi, lam. For the other faces, we must use
     * unit sphere cartesian coordinates as an intermediate step. */
<<<<<<< HEAD
<<<<<<< HEAD
<<<<<<< HEAD
<<<<<<< HEAD
<<<<<<< HEAD
<<<<<<< HEAD
<<<<<<< HEAD
<<<<<<< HEAD
<<<<<<< HEAD
<<<<<<< HEAD
<<<<<<< HEAD
<<<<<<< HEAD
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
>>>>>>> 3771d4aec1 (Merge pull request #3524 from cffk/merid-update-fix)
=======
>>>>>>> 885e4882b8 (Merge pull request #3524 from cffk/merid-update-fix)
<<<<<<< HEAD
<<<<<<< HEAD
<<<<<<< HEAD
<<<<<<< HEAD
<<<<<<< HEAD
<<<<<<< HEAD
<<<<<<< HEAD
=======
>>>>>>> ebd1587dc5 (Merge pull request #3524 from cffk/merid-update-fix)
=======
>>>>>>> 6e4203f66c (Merge pull request #3524 from cffk/merid-update-fix)
=======
>>>>>>> 80ac813585 (Merge pull request #3524 from cffk/merid-update-fix)
=======
>>>>>>> d8e8090c80 (typo fixes)
=======
>>>>>>> 3bd0f77d39 (Merge pull request #3524 from cffk/merid-update-fix)
=======
>>>>>>> f00ffe609e (Merge pull request #3524 from cffk/merid-update-fix)
=======
>>>>>>> 48ae38528d (typo fixes)
=======
>>>>>>> 25ac262782 (Merge pull request #3524 from cffk/merid-update-fix)
=======
=======
>>>>>>> ebd1587dc5 (Merge pull request #3524 from cffk/merid-update-fix)
>>>>>>> dbc4ff68b0 (Merge pull request #3524 from cffk/merid-update-fix)
=======
>>>>>>> 3771d4aec1 (Merge pull request #3524 from cffk/merid-update-fix)
=======
>>>>>>> c63e6e91bd (Merge pull request #3524 from cffk/merid-update-fix)
<<<<<<< HEAD
<<<<<<< HEAD
=======
>>>>>>> 10b5e77237 (Merge pull request #3524 from cffk/merid-update-fix)
=======
>>>>>>> 74eac2217b (typo fixes)
<<<<<<< HEAD
<<<<<<< HEAD
=======
>>>>>>> 25ac262782 (Merge pull request #3524 from cffk/merid-update-fix)
=======
=======
>>>>>>> 3771d4aec1 (Merge pull request #3524 from cffk/merid-update-fix)
>>>>>>> c8fb3456cf (Merge pull request #3524 from cffk/merid-update-fix)
<<<<<<< HEAD
=======
>>>>>>> a029d873e8 (Merge pull request #3524 from cffk/merid-update-fix)
=======
>>>>>>> bb15f534d5 (Merge pull request #3524 from cffk/merid-update-fix)
=======
>>>>>>> a4391c6673 (typo fixes)
=======
=======
>>>>>>> 3771d4aec1 (Merge pull request #3524 from cffk/merid-update-fix)
>>>>>>> 8a24938f25 (Merge pull request #3524 from cffk/merid-update-fix)
=======
>>>>>>> 3bd0f77d39 (Merge pull request #3524 from cffk/merid-update-fix)
=======
=======
>>>>>>> 10b5e77237 (Merge pull request #3524 from cffk/merid-update-fix)
>>>>>>> f00ffe609e (Merge pull request #3524 from cffk/merid-update-fix)
=======
>>>>>>> 48ae38528d (typo fixes)
=======
>>>>>>> 25ac262782 (Merge pull request #3524 from cffk/merid-update-fix)
    longitude = lp.lam;
    if (Q->face == FACE_TOP) {
        phi = M_HALFPI - lat;
        if (longitude >= M_FORTPI && longitude <= M_HALFPI + M_FORTPI) {
            area = AREA_0;
            theta = longitude - M_HALFPI;
        } else if (longitude > M_HALFPI + M_FORTPI || longitude <= -(M_HALFPI + M_FORTPI)) {
            area = AREA_1;
            theta = (longitude > 0.0 ? longitude - M_PI : longitude + M_PI);
        } else if (longitude > -(M_HALFPI + M_FORTPI) && longitude <= -M_FORTPI) {
            area = AREA_2;
            theta = longitude + M_HALFPI;
        } else {
            area = AREA_3;
            theta = longitude;
        }
    } else if (Q->face == FACE_BOTTOM) {
        phi = M_HALFPI + lat;
        if (longitude >= M_FORTPI && longitude <= M_HALFPI + M_FORTPI) {
            area = AREA_0;
            theta = -longitude + M_HALFPI;
        } else if (longitude < M_FORTPI && longitude >= -M_FORTPI) {
            area = AREA_1;
            theta = -longitude;
        } else if (longitude < -M_FORTPI && longitude >= -(M_HALFPI + M_FORTPI)) {
            area = AREA_2;
            theta = -longitude - M_HALFPI;
        } else {
            area = AREA_3;
            theta = (longitude > 0.0 ? -longitude + M_PI : -longitude - M_PI);
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
>>>>>>> c8fb3456cf (Merge pull request #3524 from cffk/merid-update-fix)
=======
>>>>>>> 8a24938f25 (Merge pull request #3524 from cffk/merid-update-fix)
=======
>>>>>>> 3bd0f77d39 (Merge pull request #3524 from cffk/merid-update-fix)
=======
>>>>>>> f00ffe609e (Merge pull request #3524 from cffk/merid-update-fix)
=======
=======
>>>>>>> c8fb3456cf (Merge pull request #3524 from cffk/merid-update-fix)
>>>>>>> 25ac262782 (Merge pull request #3524 from cffk/merid-update-fix)
=======
>>>>>>> 748ccdbcc6 (Merge pull request #3524 from cffk/merid-update-fix)
    lon = lp.lam;
=======
    longitude = lp.lam;
>>>>>>> e4a6fd6d75 (typo fixes)
<<<<<<< HEAD
<<<<<<< HEAD
<<<<<<< HEAD
=======
>>>>>>> 48ae38528d (typo fixes)
    if (Q->face == FACE_TOP) {
        phi = M_HALFPI - lat;
        if (longitude >= M_FORTPI && longitude <= M_HALFPI + M_FORTPI) {
            area = AREA_0;
            theta = longitude - M_HALFPI;
        } else if (longitude > M_HALFPI + M_FORTPI || longitude <= -(M_HALFPI + M_FORTPI)) {
            area = AREA_1;
            theta = (longitude > 0.0 ? longitude - M_PI : longitude + M_PI);
        } else if (longitude > -(M_HALFPI + M_FORTPI) && longitude <= -M_FORTPI) {
            area = AREA_2;
            theta = longitude + M_HALFPI;
        } else {
            area = AREA_3;
            theta = longitude;
        }
    } else if (Q->face == FACE_BOTTOM) {
        phi = M_HALFPI + lat;
        if (longitude >= M_FORTPI && longitude <= M_HALFPI + M_FORTPI) {
            area = AREA_0;
            theta = -longitude + M_HALFPI;
        } else if (longitude < M_FORTPI && longitude >= -M_FORTPI) {
            area = AREA_1;
            theta = -longitude;
        } else if (longitude < -M_FORTPI && longitude >= -(M_HALFPI + M_FORTPI)) {
            area = AREA_2;
            theta = -longitude - M_HALFPI;
        } else {
            area = AREA_3;
<<<<<<< HEAD
            theta = (lon > 0.0 ? -lon + M_PI : -lon - M_PI);
<<<<<<< HEAD
>>>>>>> 360db021b6 (Merge pull request #3524 from cffk/merid-update-fix)
=======
<<<<<<< HEAD
>>>>>>> locationtech-main
=======
>>>>>>> 748ccdbcc6 (Merge pull request #3524 from cffk/merid-update-fix)
<<<<<<< HEAD
>>>>>>> a8fbb11965 (Merge pull request #3524 from cffk/merid-update-fix)
=======
=======
            theta = (longitude > 0.0 ? -longitude + M_PI : -longitude - M_PI);
>>>>>>> e4a6fd6d75 (typo fixes)
<<<<<<< HEAD
>>>>>>> aa21c6fa76 (typo fixes)
=======
=======
<<<<<<< HEAD
<<<<<<< HEAD
<<<<<<< HEAD
<<<<<<< HEAD
<<<<<<< HEAD
<<<<<<< HEAD
=======
>>>>>>> 25ac262782 (Merge pull request #3524 from cffk/merid-update-fix)
=======
>>>>>>> dbc4ff68b0 (Merge pull request #3524 from cffk/merid-update-fix)
=======
>>>>>>> 153df87aaa (Merge pull request #3524 from cffk/merid-update-fix)
=======
>>>>>>> b609c280f5 (Merge pull request #3524 from cffk/merid-update-fix)
<<<<<<< HEAD
    lon = lp.lam;
=======
    longitude = lp.lam;
>>>>>>> 86ade66356 (typo fixes)
    if (Q->face == FACE_TOP) {
        phi = M_HALFPI - lat;
        if (longitude >= M_FORTPI && longitude <= M_HALFPI + M_FORTPI) {
            area = AREA_0;
            theta = longitude - M_HALFPI;
        } else if (longitude > M_HALFPI + M_FORTPI || longitude <= -(M_HALFPI + M_FORTPI)) {
            area = AREA_1;
            theta = (longitude > 0.0 ? longitude - M_PI : longitude + M_PI);
        } else if (longitude > -(M_HALFPI + M_FORTPI) && longitude <= -M_FORTPI) {
            area = AREA_2;
            theta = longitude + M_HALFPI;
        } else {
            area = AREA_3;
            theta = longitude;
        }
    } else if (Q->face == FACE_BOTTOM) {
        phi = M_HALFPI + lat;
        if (longitude >= M_FORTPI && longitude <= M_HALFPI + M_FORTPI) {
            area = AREA_0;
            theta = -longitude + M_HALFPI;
        } else if (longitude < M_FORTPI && longitude >= -M_FORTPI) {
            area = AREA_1;
            theta = -longitude;
        } else if (longitude < -M_FORTPI && longitude >= -(M_HALFPI + M_FORTPI)) {
            area = AREA_2;
            theta = -longitude - M_HALFPI;
        } else {
            area = AREA_3;
<<<<<<< HEAD
            theta = (lon > 0.0 ? -lon + M_PI : -lon - M_PI);
<<<<<<< HEAD
<<<<<<< HEAD
>>>>>>> 360db021b (Merge pull request #3524 from cffk/merid-update-fix)
>>>>>>> 3771d4aec1 (Merge pull request #3524 from cffk/merid-update-fix)
>>>>>>> b5f4d47b2b (Merge pull request #3524 from cffk/merid-update-fix)
=======
>>>>>>> 153df87aaa (Merge pull request #3524 from cffk/merid-update-fix)
=======
>>>>>>> b609c280f5 (Merge pull request #3524 from cffk/merid-update-fix)
=======
            theta = (longitude > 0.0 ? -longitude + M_PI : -longitude - M_PI);
>>>>>>> 86ade66356 (typo fixes)
=======
<<<<<<< HEAD
<<<<<<< HEAD
=======
>>>>>>> f00ffe609e (Merge pull request #3524 from cffk/merid-update-fix)
=======
=======
>>>>>>> 748ccdbcc6 (Merge pull request #3524 from cffk/merid-update-fix)
>>>>>>> 10b5e77237 (Merge pull request #3524 from cffk/merid-update-fix)
<<<<<<< HEAD
    lon = lp.lam;
=======
>>>>>>> 74eac2217b (typo fixes)
    if (Q->face == FACE_TOP) {
        phi = M_HALFPI - lat;
        if (longitude >= M_FORTPI && longitude <= M_HALFPI + M_FORTPI) {
            area = AREA_0;
            theta = longitude - M_HALFPI;
        } else if (longitude > M_HALFPI + M_FORTPI || longitude <= -(M_HALFPI + M_FORTPI)) {
            area = AREA_1;
            theta = (longitude > 0.0 ? longitude - M_PI : longitude + M_PI);
        } else if (longitude > -(M_HALFPI + M_FORTPI) && longitude <= -M_FORTPI) {
            area = AREA_2;
            theta = longitude + M_HALFPI;
        } else {
            area = AREA_3;
            theta = longitude;
        }
    } else if (Q->face == FACE_BOTTOM) {
        phi = M_HALFPI + lat;
        if (longitude >= M_FORTPI && longitude <= M_HALFPI + M_FORTPI) {
            area = AREA_0;
            theta = -longitude + M_HALFPI;
        } else if (longitude < M_FORTPI && longitude >= -M_FORTPI) {
            area = AREA_1;
            theta = -longitude;
        } else if (longitude < -M_FORTPI && longitude >= -(M_HALFPI + M_FORTPI)) {
            area = AREA_2;
            theta = -longitude - M_HALFPI;
        } else {
            area = AREA_3;
<<<<<<< HEAD
            theta = (lon > 0.0 ? -lon + M_PI : -lon - M_PI);
<<<<<<< HEAD
>>>>>>> 360db021b6 (Merge pull request #3524 from cffk/merid-update-fix)
<<<<<<< HEAD
>>>>>>> c63e6e91bd (Merge pull request #3524 from cffk/merid-update-fix)
=======
=======
<<<<<<< HEAD
>>>>>>> locationtech-main
=======
>>>>>>> 748ccdbcc6 (Merge pull request #3524 from cffk/merid-update-fix)
<<<<<<< HEAD
>>>>>>> a8fbb11965 (Merge pull request #3524 from cffk/merid-update-fix)
<<<<<<< HEAD
>>>>>>> 10b5e77237 (Merge pull request #3524 from cffk/merid-update-fix)
=======
=======
=======
            theta = (longitude > 0.0 ? -longitude + M_PI : -longitude - M_PI);
>>>>>>> e4a6fd6d75 (typo fixes)
>>>>>>> aa21c6fa76 (typo fixes)
>>>>>>> 74eac2217b (typo fixes)
=======
<<<<<<< HEAD
<<<<<<< HEAD
=======
>>>>>>> dbc4ff68b0 (Merge pull request #3524 from cffk/merid-update-fix)
=======
=======
>>>>>>> 153df87aaa (Merge pull request #3524 from cffk/merid-update-fix)
>>>>>>> ebd1587dc5 (Merge pull request #3524 from cffk/merid-update-fix)
<<<<<<< HEAD
=======
>>>>>>> 208fcbd5e7 (Merge pull request #3524 from cffk/merid-update-fix)
    lon = lp.lam;
=======
    longitude = lp.lam;
>>>>>>> bf1dfe8af6 (typo fixes)
    if (Q->face == FACE_TOP) {
        phi = M_HALFPI - lat;
        if (longitude >= M_FORTPI && longitude <= M_HALFPI + M_FORTPI) {
            area = AREA_0;
            theta = longitude - M_HALFPI;
        } else if (longitude > M_HALFPI + M_FORTPI || longitude <= -(M_HALFPI + M_FORTPI)) {
            area = AREA_1;
            theta = (longitude > 0.0 ? longitude - M_PI : longitude + M_PI);
        } else if (longitude > -(M_HALFPI + M_FORTPI) && longitude <= -M_FORTPI) {
            area = AREA_2;
            theta = longitude + M_HALFPI;
        } else {
            area = AREA_3;
            theta = longitude;
        }
    } else if (Q->face == FACE_BOTTOM) {
        phi = M_HALFPI + lat;
        if (longitude >= M_FORTPI && longitude <= M_HALFPI + M_FORTPI) {
            area = AREA_0;
            theta = -longitude + M_HALFPI;
        } else if (longitude < M_FORTPI && longitude >= -M_FORTPI) {
            area = AREA_1;
            theta = -longitude;
        } else if (longitude < -M_FORTPI && longitude >= -(M_HALFPI + M_FORTPI)) {
            area = AREA_2;
            theta = -longitude - M_HALFPI;
        } else {
            area = AREA_3;
<<<<<<< HEAD
            theta = (lon > 0.0 ? -lon + M_PI : -lon - M_PI);
<<<<<<< HEAD
<<<<<<< HEAD
>>>>>>> 360db021b (Merge pull request #3524 from cffk/merid-update-fix)
>>>>>>> 3771d4aec1 (Merge pull request #3524 from cffk/merid-update-fix)
>>>>>>> b5f4d47b2b (Merge pull request #3524 from cffk/merid-update-fix)
<<<<<<< HEAD
>>>>>>> c8fb3456cf (Merge pull request #3524 from cffk/merid-update-fix)
=======
=======
>>>>>>> 153df87aaa (Merge pull request #3524 from cffk/merid-update-fix)
>>>>>>> ebd1587dc5 (Merge pull request #3524 from cffk/merid-update-fix)
=======
>>>>>>> 208fcbd5e7 (Merge pull request #3524 from cffk/merid-update-fix)
=======
            theta = (longitude > 0.0 ? -longitude + M_PI : -longitude - M_PI);
>>>>>>> bf1dfe8af6 (typo fixes)
=======
=======
=======
>>>>>>> 748ccdbcc6 (Merge pull request #3524 from cffk/merid-update-fix)
>>>>>>> bb15f534d5 (Merge pull request #3524 from cffk/merid-update-fix)
    lon = lp.lam;
=======
>>>>>>> a4391c6673 (typo fixes)
    if (Q->face == FACE_TOP) {
        phi = M_HALFPI - lat;
        if (longitude >= M_FORTPI && longitude <= M_HALFPI + M_FORTPI) {
            area = AREA_0;
            theta = longitude - M_HALFPI;
        } else if (longitude > M_HALFPI + M_FORTPI || longitude <= -(M_HALFPI + M_FORTPI)) {
            area = AREA_1;
            theta = (longitude > 0.0 ? longitude - M_PI : longitude + M_PI);
        } else if (longitude > -(M_HALFPI + M_FORTPI) && longitude <= -M_FORTPI) {
            area = AREA_2;
            theta = longitude + M_HALFPI;
        } else {
            area = AREA_3;
            theta = longitude;
        }
    } else if (Q->face == FACE_BOTTOM) {
        phi = M_HALFPI + lat;
        if (longitude >= M_FORTPI && longitude <= M_HALFPI + M_FORTPI) {
            area = AREA_0;
            theta = -longitude + M_HALFPI;
        } else if (longitude < M_FORTPI && longitude >= -M_FORTPI) {
            area = AREA_1;
            theta = -longitude;
        } else if (longitude < -M_FORTPI && longitude >= -(M_HALFPI + M_FORTPI)) {
            area = AREA_2;
            theta = -longitude - M_HALFPI;
        } else {
            area = AREA_3;
<<<<<<< HEAD
            theta = (lon > 0.0 ? -lon + M_PI : -lon - M_PI);
<<<<<<< HEAD
>>>>>>> 360db021b6 (Merge pull request #3524 from cffk/merid-update-fix)
<<<<<<< HEAD
>>>>>>> a029d873e8 (Merge pull request #3524 from cffk/merid-update-fix)
=======
=======
<<<<<<< HEAD
>>>>>>> locationtech-main
=======
>>>>>>> 748ccdbcc6 (Merge pull request #3524 from cffk/merid-update-fix)
<<<<<<< HEAD
>>>>>>> a8fbb11965 (Merge pull request #3524 from cffk/merid-update-fix)
<<<<<<< HEAD
>>>>>>> bb15f534d5 (Merge pull request #3524 from cffk/merid-update-fix)
=======
=======
=======
            theta = (longitude > 0.0 ? -longitude + M_PI : -longitude - M_PI);
>>>>>>> e4a6fd6d75 (typo fixes)
>>>>>>> aa21c6fa76 (typo fixes)
>>>>>>> a4391c6673 (typo fixes)
=======
=======
=======
>>>>>>> 153df87aaa (Merge pull request #3524 from cffk/merid-update-fix)
>>>>>>> 6e4203f66c (Merge pull request #3524 from cffk/merid-update-fix)
=======
>>>>>>> 80ac813585 (Merge pull request #3524 from cffk/merid-update-fix)
    lon = lp.lam;
=======
    longitude = lp.lam;
>>>>>>> 86ade66356 (typo fixes)
    if (Q->face == FACE_TOP) {
        phi = M_HALFPI - lat;
        if (longitude >= M_FORTPI && longitude <= M_HALFPI + M_FORTPI) {
            area = AREA_0;
            theta = longitude - M_HALFPI;
        } else if (longitude > M_HALFPI + M_FORTPI || longitude <= -(M_HALFPI + M_FORTPI)) {
            area = AREA_1;
            theta = (longitude > 0.0 ? longitude - M_PI : longitude + M_PI);
        } else if (longitude > -(M_HALFPI + M_FORTPI) && longitude <= -M_FORTPI) {
            area = AREA_2;
            theta = longitude + M_HALFPI;
        } else {
            area = AREA_3;
            theta = longitude;
        }
    } else if (Q->face == FACE_BOTTOM) {
        phi = M_HALFPI + lat;
        if (longitude >= M_FORTPI && longitude <= M_HALFPI + M_FORTPI) {
            area = AREA_0;
            theta = -longitude + M_HALFPI;
        } else if (longitude < M_FORTPI && longitude >= -M_FORTPI) {
            area = AREA_1;
            theta = -longitude;
        } else if (longitude < -M_FORTPI && longitude >= -(M_HALFPI + M_FORTPI)) {
            area = AREA_2;
            theta = -longitude - M_HALFPI;
        } else {
            area = AREA_3;
<<<<<<< HEAD
            theta = (lon > 0.0 ? -lon + M_PI : -lon - M_PI);
<<<<<<< HEAD
<<<<<<< HEAD
>>>>>>> 360db021b (Merge pull request #3524 from cffk/merid-update-fix)
>>>>>>> 3771d4aec1 (Merge pull request #3524 from cffk/merid-update-fix)
>>>>>>> b5f4d47b2b (Merge pull request #3524 from cffk/merid-update-fix)
<<<<<<< HEAD
>>>>>>> 8a24938f25 (Merge pull request #3524 from cffk/merid-update-fix)
=======
=======
>>>>>>> 153df87aaa (Merge pull request #3524 from cffk/merid-update-fix)
<<<<<<< HEAD
>>>>>>> 6e4203f66c (Merge pull request #3524 from cffk/merid-update-fix)
=======
=======
>>>>>>> b609c280f5 (Merge pull request #3524 from cffk/merid-update-fix)
<<<<<<< HEAD
>>>>>>> 80ac813585 (Merge pull request #3524 from cffk/merid-update-fix)
=======
=======
            theta = (longitude > 0.0 ? -longitude + M_PI : -longitude - M_PI);
>>>>>>> 86ade66356 (typo fixes)
>>>>>>> d8e8090c80 (typo fixes)
=======
=======
>>>>>>> f00ffe609e (Merge pull request #3524 from cffk/merid-update-fix)
    lon = lp.lam;
=======
>>>>>>> 74eac2217b (typo fixes)
    if (Q->face == FACE_TOP) {
        phi = M_HALFPI - lat;
        if (longitude >= M_FORTPI && longitude <= M_HALFPI + M_FORTPI) {
            area = AREA_0;
            theta = longitude - M_HALFPI;
        } else if (longitude > M_HALFPI + M_FORTPI || longitude <= -(M_HALFPI + M_FORTPI)) {
            area = AREA_1;
            theta = (longitude > 0.0 ? longitude - M_PI : longitude + M_PI);
        } else if (longitude > -(M_HALFPI + M_FORTPI) && longitude <= -M_FORTPI) {
            area = AREA_2;
            theta = longitude + M_HALFPI;
        } else {
            area = AREA_3;
            theta = longitude;
        }
    } else if (Q->face == FACE_BOTTOM) {
        phi = M_HALFPI + lat;
        if (longitude >= M_FORTPI && longitude <= M_HALFPI + M_FORTPI) {
            area = AREA_0;
            theta = -longitude + M_HALFPI;
        } else if (longitude < M_FORTPI && longitude >= -M_FORTPI) {
            area = AREA_1;
            theta = -longitude;
        } else if (longitude < -M_FORTPI && longitude >= -(M_HALFPI + M_FORTPI)) {
            area = AREA_2;
            theta = -longitude - M_HALFPI;
        } else {
            area = AREA_3;
<<<<<<< HEAD
            theta = (lon > 0.0 ? -lon + M_PI : -lon - M_PI);
<<<<<<< HEAD
>>>>>>> 360db021b6 (Merge pull request #3524 from cffk/merid-update-fix)
<<<<<<< HEAD
>>>>>>> c63e6e91bd (Merge pull request #3524 from cffk/merid-update-fix)
<<<<<<< HEAD
>>>>>>> 3bd0f77d39 (Merge pull request #3524 from cffk/merid-update-fix)
=======
=======
=======
<<<<<<< HEAD
>>>>>>> locationtech-main
=======
<<<<<<< HEAD
>>>>>>> 748ccdbcc6 (Merge pull request #3524 from cffk/merid-update-fix)
<<<<<<< HEAD
>>>>>>> a8fbb11965 (Merge pull request #3524 from cffk/merid-update-fix)
<<<<<<< HEAD
>>>>>>> 10b5e77237 (Merge pull request #3524 from cffk/merid-update-fix)
<<<<<<< HEAD
>>>>>>> f00ffe609e (Merge pull request #3524 from cffk/merid-update-fix)
=======
=======
=======
=======
            theta = (longitude > 0.0 ? -longitude + M_PI : -longitude - M_PI);
>>>>>>> e4a6fd6d75 (typo fixes)
>>>>>>> aa21c6fa76 (typo fixes)
>>>>>>> 74eac2217b (typo fixes)
>>>>>>> 48ae38528d (typo fixes)
=======
=======
>>>>>>> dbc4ff68b0 (Merge pull request #3524 from cffk/merid-update-fix)
=======
>>>>>>> 0a2f6458d1 (Merge pull request #3524 from cffk/merid-update-fix)
>>>>>>> 885e4882b8 (Merge pull request #3524 from cffk/merid-update-fix)
=======
>>>>>>> 0a2f6458d1 (Merge pull request #3524 from cffk/merid-update-fix)
    lon = lp.lam;
    if (Q->face == FACE_TOP) {
        phi = M_HALFPI - lat;
        if (lon >= M_FORTPI && lon <= M_HALFPI + M_FORTPI) {
            area = AREA_0;
            theta = lon - M_HALFPI;
        } else if (lon > M_HALFPI + M_FORTPI || lon <= -(M_HALFPI + M_FORTPI)) {
            area = AREA_1;
            theta = (lon > 0.0 ? lon - M_PI : lon + M_PI);
        } else if (lon > -(M_HALFPI + M_FORTPI) && lon <= -M_FORTPI) {
            area = AREA_2;
            theta = lon + M_HALFPI;
        } else {
            area = AREA_3;
            theta = lon;
        }
    } else if (Q->face == FACE_BOTTOM) {
        phi = M_HALFPI + lat;
        if (lon >= M_FORTPI && lon <= M_HALFPI + M_FORTPI) {
            area = AREA_0;
            theta = -lon + M_HALFPI;
        } else if (lon < M_FORTPI && lon >= -M_FORTPI) {
            area = AREA_1;
            theta = -lon;
        } else if (lon < -M_FORTPI && lon >= -(M_HALFPI + M_FORTPI)) {
            area = AREA_2;
            theta = -lon - M_HALFPI;
        } else {
            area = AREA_3;
            theta = (lon > 0.0 ? -lon + M_PI : -lon - M_PI);
<<<<<<< HEAD
<<<<<<< HEAD
<<<<<<< HEAD
>>>>>>> 360db021b (Merge pull request #3524 from cffk/merid-update-fix)
>>>>>>> 3771d4aec1 (Merge pull request #3524 from cffk/merid-update-fix)
>>>>>>> b5f4d47b2b (Merge pull request #3524 from cffk/merid-update-fix)
<<<<<<< HEAD
>>>>>>> c8fb3456cf (Merge pull request #3524 from cffk/merid-update-fix)
<<<<<<< HEAD
>>>>>>> 25ac262782 (Merge pull request #3524 from cffk/merid-update-fix)
=======
=======
=======
>>>>>>> 153df87aaa (Merge pull request #3524 from cffk/merid-update-fix)
>>>>>>> ebd1587dc5 (Merge pull request #3524 from cffk/merid-update-fix)
<<<<<<< HEAD
>>>>>>> dbc4ff68b0 (Merge pull request #3524 from cffk/merid-update-fix)
=======
>>>>>>> locationtech-main
=======
>>>>>>> 0a2f6458d1 (Merge pull request #3524 from cffk/merid-update-fix)
>>>>>>> 885e4882b8 (Merge pull request #3524 from cffk/merid-update-fix)
=======
>>>>>>> 0a2f6458d1 (Merge pull request #3524 from cffk/merid-update-fix)
        }
    } else {
        double q, r, s;
        double sinlat, coslat;
        double sinlon, coslon;

        if (Q->face == FACE_RIGHT) {
<<<<<<< HEAD
<<<<<<< HEAD
<<<<<<< HEAD
<<<<<<< HEAD
<<<<<<< HEAD
<<<<<<< HEAD
<<<<<<< HEAD
<<<<<<< HEAD
<<<<<<< HEAD
<<<<<<< HEAD
<<<<<<< HEAD
<<<<<<< HEAD
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
>>>>>>> 3771d4aec1 (Merge pull request #3524 from cffk/merid-update-fix)
=======
>>>>>>> 885e4882b8 (Merge pull request #3524 from cffk/merid-update-fix)
<<<<<<< HEAD
<<<<<<< HEAD
<<<<<<< HEAD
<<<<<<< HEAD
<<<<<<< HEAD
<<<<<<< HEAD
<<<<<<< HEAD
=======
>>>>>>> ebd1587dc5 (Merge pull request #3524 from cffk/merid-update-fix)
=======
>>>>>>> 6e4203f66c (Merge pull request #3524 from cffk/merid-update-fix)
=======
>>>>>>> 80ac813585 (Merge pull request #3524 from cffk/merid-update-fix)
=======
>>>>>>> d8e8090c80 (typo fixes)
=======
>>>>>>> 3bd0f77d39 (Merge pull request #3524 from cffk/merid-update-fix)
=======
>>>>>>> f00ffe609e (Merge pull request #3524 from cffk/merid-update-fix)
=======
>>>>>>> 48ae38528d (typo fixes)
=======
>>>>>>> 25ac262782 (Merge pull request #3524 from cffk/merid-update-fix)
=======
=======
>>>>>>> ebd1587dc5 (Merge pull request #3524 from cffk/merid-update-fix)
>>>>>>> dbc4ff68b0 (Merge pull request #3524 from cffk/merid-update-fix)
=======
>>>>>>> 3771d4aec1 (Merge pull request #3524 from cffk/merid-update-fix)
=======
>>>>>>> c63e6e91bd (Merge pull request #3524 from cffk/merid-update-fix)
<<<<<<< HEAD
<<<<<<< HEAD
=======
>>>>>>> 10b5e77237 (Merge pull request #3524 from cffk/merid-update-fix)
=======
>>>>>>> 74eac2217b (typo fixes)
<<<<<<< HEAD
<<<<<<< HEAD
=======
>>>>>>> 25ac262782 (Merge pull request #3524 from cffk/merid-update-fix)
=======
=======
>>>>>>> 3771d4aec1 (Merge pull request #3524 from cffk/merid-update-fix)
>>>>>>> c8fb3456cf (Merge pull request #3524 from cffk/merid-update-fix)
<<<<<<< HEAD
=======
>>>>>>> a029d873e8 (Merge pull request #3524 from cffk/merid-update-fix)
=======
>>>>>>> bb15f534d5 (Merge pull request #3524 from cffk/merid-update-fix)
=======
>>>>>>> a4391c6673 (typo fixes)
=======
=======
>>>>>>> 3771d4aec1 (Merge pull request #3524 from cffk/merid-update-fix)
>>>>>>> 8a24938f25 (Merge pull request #3524 from cffk/merid-update-fix)
=======
>>>>>>> 3bd0f77d39 (Merge pull request #3524 from cffk/merid-update-fix)
=======
=======
>>>>>>> 10b5e77237 (Merge pull request #3524 from cffk/merid-update-fix)
>>>>>>> f00ffe609e (Merge pull request #3524 from cffk/merid-update-fix)
=======
>>>>>>> 48ae38528d (typo fixes)
=======
>>>>>>> 25ac262782 (Merge pull request #3524 from cffk/merid-update-fix)
            longitude = qsc_shift_longitude_origin(longitude, +M_HALFPI);
        } else if (Q->face == FACE_BACK) {
            longitude = qsc_shift_longitude_origin(longitude, +M_PI);
        } else if (Q->face == FACE_LEFT) {
            longitude = qsc_shift_longitude_origin(longitude, -M_HALFPI);
        }
        sinlat = sin(lat);
        coslat = cos(lat);
        sinlon = sin(longitude);
        coslon = cos(longitude);
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
>>>>>>> c8fb3456cf (Merge pull request #3524 from cffk/merid-update-fix)
=======
>>>>>>> 8a24938f25 (Merge pull request #3524 from cffk/merid-update-fix)
=======
>>>>>>> 3bd0f77d39 (Merge pull request #3524 from cffk/merid-update-fix)
=======
>>>>>>> f00ffe609e (Merge pull request #3524 from cffk/merid-update-fix)
=======
=======
>>>>>>> c8fb3456cf (Merge pull request #3524 from cffk/merid-update-fix)
>>>>>>> 25ac262782 (Merge pull request #3524 from cffk/merid-update-fix)
=======
>>>>>>> 748ccdbcc6 (Merge pull request #3524 from cffk/merid-update-fix)
            lon = qsc_shift_lon_origin(lon, +M_HALFPI);
=======
            longitude = qsc_shift_longitude_origin(longitude, +M_HALFPI);
>>>>>>> e4a6fd6d75 (typo fixes)
<<<<<<< HEAD
<<<<<<< HEAD
<<<<<<< HEAD
=======
>>>>>>> 48ae38528d (typo fixes)
        } else if (Q->face == FACE_BACK) {
            longitude = qsc_shift_longitude_origin(longitude, +M_PI);
        } else if (Q->face == FACE_LEFT) {
            longitude = qsc_shift_longitude_origin(longitude, -M_HALFPI);
        }
        sinlat = sin(lat);
        coslat = cos(lat);
<<<<<<< HEAD
        sinlon = sin(lon);
        coslon = cos(lon);
<<<<<<< HEAD
>>>>>>> 360db021b6 (Merge pull request #3524 from cffk/merid-update-fix)
=======
<<<<<<< HEAD
>>>>>>> locationtech-main
=======
>>>>>>> 748ccdbcc6 (Merge pull request #3524 from cffk/merid-update-fix)
<<<<<<< HEAD
>>>>>>> a8fbb11965 (Merge pull request #3524 from cffk/merid-update-fix)
=======
=======
        sinlon = sin(longitude);
        coslon = cos(longitude);
>>>>>>> e4a6fd6d75 (typo fixes)
<<<<<<< HEAD
>>>>>>> aa21c6fa76 (typo fixes)
=======
=======
<<<<<<< HEAD
<<<<<<< HEAD
<<<<<<< HEAD
<<<<<<< HEAD
<<<<<<< HEAD
<<<<<<< HEAD
=======
>>>>>>> 25ac262782 (Merge pull request #3524 from cffk/merid-update-fix)
=======
>>>>>>> dbc4ff68b0 (Merge pull request #3524 from cffk/merid-update-fix)
=======
>>>>>>> 153df87aaa (Merge pull request #3524 from cffk/merid-update-fix)
=======
>>>>>>> b609c280f5 (Merge pull request #3524 from cffk/merid-update-fix)
<<<<<<< HEAD
            lon = qsc_shift_lon_origin(lon, +M_HALFPI);
=======
            longitude = qsc_shift_longitude_origin(longitude, +M_HALFPI);
>>>>>>> 86ade66356 (typo fixes)
        } else if (Q->face == FACE_BACK) {
            longitude = qsc_shift_longitude_origin(longitude, +M_PI);
        } else if (Q->face == FACE_LEFT) {
            longitude = qsc_shift_longitude_origin(longitude, -M_HALFPI);
        }
        sinlat = sin(lat);
        coslat = cos(lat);
<<<<<<< HEAD
        sinlon = sin(lon);
        coslon = cos(lon);
<<<<<<< HEAD
<<<<<<< HEAD
>>>>>>> 360db021b (Merge pull request #3524 from cffk/merid-update-fix)
>>>>>>> 3771d4aec1 (Merge pull request #3524 from cffk/merid-update-fix)
>>>>>>> b5f4d47b2b (Merge pull request #3524 from cffk/merid-update-fix)
=======
>>>>>>> 153df87aaa (Merge pull request #3524 from cffk/merid-update-fix)
=======
>>>>>>> b609c280f5 (Merge pull request #3524 from cffk/merid-update-fix)
=======
        sinlon = sin(longitude);
        coslon = cos(longitude);
>>>>>>> 86ade66356 (typo fixes)
=======
<<<<<<< HEAD
<<<<<<< HEAD
=======
>>>>>>> f00ffe609e (Merge pull request #3524 from cffk/merid-update-fix)
=======
=======
>>>>>>> 748ccdbcc6 (Merge pull request #3524 from cffk/merid-update-fix)
>>>>>>> 10b5e77237 (Merge pull request #3524 from cffk/merid-update-fix)
<<<<<<< HEAD
            lon = qsc_shift_lon_origin(lon, +M_HALFPI);
=======
>>>>>>> 74eac2217b (typo fixes)
        } else if (Q->face == FACE_BACK) {
            longitude = qsc_shift_longitude_origin(longitude, +M_PI);
        } else if (Q->face == FACE_LEFT) {
            longitude = qsc_shift_longitude_origin(longitude, -M_HALFPI);
        }
        sinlat = sin(lat);
        coslat = cos(lat);
<<<<<<< HEAD
        sinlon = sin(lon);
        coslon = cos(lon);
<<<<<<< HEAD
>>>>>>> 360db021b6 (Merge pull request #3524 from cffk/merid-update-fix)
<<<<<<< HEAD
>>>>>>> c63e6e91bd (Merge pull request #3524 from cffk/merid-update-fix)
=======
=======
<<<<<<< HEAD
>>>>>>> locationtech-main
=======
>>>>>>> 748ccdbcc6 (Merge pull request #3524 from cffk/merid-update-fix)
<<<<<<< HEAD
>>>>>>> a8fbb11965 (Merge pull request #3524 from cffk/merid-update-fix)
<<<<<<< HEAD
>>>>>>> 10b5e77237 (Merge pull request #3524 from cffk/merid-update-fix)
=======
=======
=======
        sinlon = sin(longitude);
        coslon = cos(longitude);
>>>>>>> e4a6fd6d75 (typo fixes)
>>>>>>> aa21c6fa76 (typo fixes)
>>>>>>> 74eac2217b (typo fixes)
=======
<<<<<<< HEAD
<<<<<<< HEAD
=======
>>>>>>> dbc4ff68b0 (Merge pull request #3524 from cffk/merid-update-fix)
=======
=======
>>>>>>> 153df87aaa (Merge pull request #3524 from cffk/merid-update-fix)
>>>>>>> ebd1587dc5 (Merge pull request #3524 from cffk/merid-update-fix)
<<<<<<< HEAD
=======
>>>>>>> 208fcbd5e7 (Merge pull request #3524 from cffk/merid-update-fix)
            lon = qsc_shift_lon_origin(lon, +M_HALFPI);
=======
            longitude = qsc_shift_longitude_origin(longitude, +M_HALFPI);
>>>>>>> bf1dfe8af6 (typo fixes)
        } else if (Q->face == FACE_BACK) {
            longitude = qsc_shift_longitude_origin(longitude, +M_PI);
        } else if (Q->face == FACE_LEFT) {
            longitude = qsc_shift_longitude_origin(longitude, -M_HALFPI);
        }
        sinlat = sin(lat);
        coslat = cos(lat);
<<<<<<< HEAD
        sinlon = sin(lon);
        coslon = cos(lon);
<<<<<<< HEAD
<<<<<<< HEAD
>>>>>>> 360db021b (Merge pull request #3524 from cffk/merid-update-fix)
>>>>>>> 3771d4aec1 (Merge pull request #3524 from cffk/merid-update-fix)
>>>>>>> b5f4d47b2b (Merge pull request #3524 from cffk/merid-update-fix)
<<<<<<< HEAD
>>>>>>> c8fb3456cf (Merge pull request #3524 from cffk/merid-update-fix)
=======
=======
>>>>>>> 153df87aaa (Merge pull request #3524 from cffk/merid-update-fix)
>>>>>>> ebd1587dc5 (Merge pull request #3524 from cffk/merid-update-fix)
=======
>>>>>>> 208fcbd5e7 (Merge pull request #3524 from cffk/merid-update-fix)
=======
        sinlon = sin(longitude);
        coslon = cos(longitude);
>>>>>>> bf1dfe8af6 (typo fixes)
=======
=======
=======
>>>>>>> 748ccdbcc6 (Merge pull request #3524 from cffk/merid-update-fix)
>>>>>>> bb15f534d5 (Merge pull request #3524 from cffk/merid-update-fix)
            lon = qsc_shift_lon_origin(lon, +M_HALFPI);
=======
>>>>>>> a4391c6673 (typo fixes)
        } else if (Q->face == FACE_BACK) {
            longitude = qsc_shift_longitude_origin(longitude, +M_PI);
        } else if (Q->face == FACE_LEFT) {
            longitude = qsc_shift_longitude_origin(longitude, -M_HALFPI);
        }
        sinlat = sin(lat);
        coslat = cos(lat);
<<<<<<< HEAD
        sinlon = sin(lon);
        coslon = cos(lon);
<<<<<<< HEAD
>>>>>>> 360db021b6 (Merge pull request #3524 from cffk/merid-update-fix)
<<<<<<< HEAD
>>>>>>> a029d873e8 (Merge pull request #3524 from cffk/merid-update-fix)
=======
=======
<<<<<<< HEAD
>>>>>>> locationtech-main
=======
>>>>>>> 748ccdbcc6 (Merge pull request #3524 from cffk/merid-update-fix)
<<<<<<< HEAD
>>>>>>> a8fbb11965 (Merge pull request #3524 from cffk/merid-update-fix)
<<<<<<< HEAD
>>>>>>> bb15f534d5 (Merge pull request #3524 from cffk/merid-update-fix)
=======
=======
=======
        sinlon = sin(longitude);
        coslon = cos(longitude);
>>>>>>> e4a6fd6d75 (typo fixes)
>>>>>>> aa21c6fa76 (typo fixes)
>>>>>>> a4391c6673 (typo fixes)
=======
=======
=======
>>>>>>> 153df87aaa (Merge pull request #3524 from cffk/merid-update-fix)
>>>>>>> 6e4203f66c (Merge pull request #3524 from cffk/merid-update-fix)
=======
>>>>>>> 80ac813585 (Merge pull request #3524 from cffk/merid-update-fix)
            lon = qsc_shift_lon_origin(lon, +M_HALFPI);
=======
            longitude = qsc_shift_longitude_origin(longitude, +M_HALFPI);
>>>>>>> 86ade66356 (typo fixes)
        } else if (Q->face == FACE_BACK) {
            longitude = qsc_shift_longitude_origin(longitude, +M_PI);
        } else if (Q->face == FACE_LEFT) {
            longitude = qsc_shift_longitude_origin(longitude, -M_HALFPI);
        }
        sinlat = sin(lat);
        coslat = cos(lat);
<<<<<<< HEAD
        sinlon = sin(lon);
        coslon = cos(lon);
<<<<<<< HEAD
<<<<<<< HEAD
>>>>>>> 360db021b (Merge pull request #3524 from cffk/merid-update-fix)
>>>>>>> 3771d4aec1 (Merge pull request #3524 from cffk/merid-update-fix)
>>>>>>> b5f4d47b2b (Merge pull request #3524 from cffk/merid-update-fix)
<<<<<<< HEAD
>>>>>>> 8a24938f25 (Merge pull request #3524 from cffk/merid-update-fix)
=======
=======
>>>>>>> 153df87aaa (Merge pull request #3524 from cffk/merid-update-fix)
<<<<<<< HEAD
>>>>>>> 6e4203f66c (Merge pull request #3524 from cffk/merid-update-fix)
=======
=======
>>>>>>> b609c280f5 (Merge pull request #3524 from cffk/merid-update-fix)
<<<<<<< HEAD
>>>>>>> 80ac813585 (Merge pull request #3524 from cffk/merid-update-fix)
=======
=======
        sinlon = sin(longitude);
        coslon = cos(longitude);
>>>>>>> 86ade66356 (typo fixes)
>>>>>>> d8e8090c80 (typo fixes)
=======
=======
>>>>>>> f00ffe609e (Merge pull request #3524 from cffk/merid-update-fix)
            lon = qsc_shift_lon_origin(lon, +M_HALFPI);
=======
>>>>>>> 74eac2217b (typo fixes)
        } else if (Q->face == FACE_BACK) {
            longitude = qsc_shift_longitude_origin(longitude, +M_PI);
        } else if (Q->face == FACE_LEFT) {
            longitude = qsc_shift_longitude_origin(longitude, -M_HALFPI);
        }
        sinlat = sin(lat);
        coslat = cos(lat);
<<<<<<< HEAD
        sinlon = sin(lon);
        coslon = cos(lon);
<<<<<<< HEAD
>>>>>>> 360db021b6 (Merge pull request #3524 from cffk/merid-update-fix)
<<<<<<< HEAD
>>>>>>> c63e6e91bd (Merge pull request #3524 from cffk/merid-update-fix)
<<<<<<< HEAD
>>>>>>> 3bd0f77d39 (Merge pull request #3524 from cffk/merid-update-fix)
=======
=======
=======
<<<<<<< HEAD
>>>>>>> locationtech-main
=======
<<<<<<< HEAD
>>>>>>> 748ccdbcc6 (Merge pull request #3524 from cffk/merid-update-fix)
<<<<<<< HEAD
>>>>>>> a8fbb11965 (Merge pull request #3524 from cffk/merid-update-fix)
<<<<<<< HEAD
>>>>>>> 10b5e77237 (Merge pull request #3524 from cffk/merid-update-fix)
<<<<<<< HEAD
>>>>>>> f00ffe609e (Merge pull request #3524 from cffk/merid-update-fix)
=======
=======
=======
=======
        sinlon = sin(longitude);
        coslon = cos(longitude);
>>>>>>> e4a6fd6d75 (typo fixes)
>>>>>>> aa21c6fa76 (typo fixes)
>>>>>>> 74eac2217b (typo fixes)
>>>>>>> 48ae38528d (typo fixes)
=======
=======
>>>>>>> dbc4ff68b0 (Merge pull request #3524 from cffk/merid-update-fix)
=======
>>>>>>> 0a2f6458d1 (Merge pull request #3524 from cffk/merid-update-fix)
>>>>>>> 885e4882b8 (Merge pull request #3524 from cffk/merid-update-fix)
=======
>>>>>>> 0a2f6458d1 (Merge pull request #3524 from cffk/merid-update-fix)
            lon = qsc_shift_lon_origin(lon, +M_HALFPI);
        } else if (Q->face == FACE_BACK) {
            lon = qsc_shift_lon_origin(lon, +M_PI);
        } else if (Q->face == FACE_LEFT) {
            lon = qsc_shift_lon_origin(lon, -M_HALFPI);
        }
        sinlat = sin(lat);
        coslat = cos(lat);
        sinlon = sin(lon);
        coslon = cos(lon);
<<<<<<< HEAD
<<<<<<< HEAD
<<<<<<< HEAD
>>>>>>> 360db021b (Merge pull request #3524 from cffk/merid-update-fix)
>>>>>>> 3771d4aec1 (Merge pull request #3524 from cffk/merid-update-fix)
>>>>>>> b5f4d47b2b (Merge pull request #3524 from cffk/merid-update-fix)
<<<<<<< HEAD
>>>>>>> c8fb3456cf (Merge pull request #3524 from cffk/merid-update-fix)
<<<<<<< HEAD
>>>>>>> 25ac262782 (Merge pull request #3524 from cffk/merid-update-fix)
=======
=======
=======
>>>>>>> 153df87aaa (Merge pull request #3524 from cffk/merid-update-fix)
>>>>>>> ebd1587dc5 (Merge pull request #3524 from cffk/merid-update-fix)
<<<<<<< HEAD
>>>>>>> dbc4ff68b0 (Merge pull request #3524 from cffk/merid-update-fix)
=======
>>>>>>> locationtech-main
=======
>>>>>>> 0a2f6458d1 (Merge pull request #3524 from cffk/merid-update-fix)
>>>>>>> 885e4882b8 (Merge pull request #3524 from cffk/merid-update-fix)
=======
>>>>>>> 0a2f6458d1 (Merge pull request #3524 from cffk/merid-update-fix)
        q = coslat * coslon;
        r = coslat * sinlon;
        s = sinlat;

        if (Q->face == FACE_FRONT) {
            phi = acos(q);
            theta = qsc_fwd_equat_face_theta(phi, s, r, &area);
        } else if (Q->face == FACE_RIGHT) {
            phi = acos(r);
            theta = qsc_fwd_equat_face_theta(phi, s, -q, &area);
        } else if (Q->face == FACE_BACK) {
            phi = acos(-q);
            theta = qsc_fwd_equat_face_theta(phi, s, -r, &area);
        } else if (Q->face == FACE_LEFT) {
            phi = acos(-r);
            theta = qsc_fwd_equat_face_theta(phi, s, q, &area);
        } else {
            /* Impossible */
            phi = theta = 0.0;
            area = AREA_0;
        }
    }

    /* Compute mu and nu for the area of definition.
     * For mu, see Eq. (3-21) in [OL76], but note the typos:
     * compare with Eq. (3-14). For nu, see Eq. (3-38). */
    mu = atan((12.0 / M_PI) * (theta + acos(sin(theta) * cos(M_FORTPI)) - M_HALFPI));
    t = sqrt((1.0 - cos(phi)) / (cos(mu) * cos(mu)) / (1.0 - cos(atan(1.0 / cos(theta)))));
    /* nu = atan(t);        We don't really need nu, just t, see below. */

    /* Apply the result to the real area. */
    if (area == AREA_1) {
        mu += M_HALFPI;
    } else if (area == AREA_2) {
        mu += M_PI;
    } else if (area == AREA_3) {
        mu += M_PI_HALFPI;
    }

    /* Now compute x, y from mu and nu */
    /* t = tan(nu); */
    xy.x = t * cos(mu);
    xy.y = t * sin(mu);
    return xy;
}


static PJ_LP qsc_e_inverse (PJ_XY xy, PJ *P) {          /* Ellipsoidal, inverse */
    PJ_LP lp = {0.0,0.0};
    struct pj_opaque *Q = static_cast<struct pj_opaque*>(P->opaque);
    double mu, nu, cosmu, tannu;
    double tantheta, theta, cosphi, phi;
    double t;
    int area;

    /* Convert the input x, y to the mu and nu angles as used by QSC.
     * This depends on the area of the cube face. */
    nu = atan(sqrt(xy.x * xy.x + xy.y * xy.y));
    mu = atan2(xy.y, xy.x);
    if (xy.x >= 0.0 && xy.x >= fabs(xy.y)) {
        area = AREA_0;
    } else if (xy.y >= 0.0 && xy.y >= fabs(xy.x)) {
        area = AREA_1;
        mu -= M_HALFPI;
    } else if (xy.x < 0.0 && -xy.x >= fabs(xy.y)) {
        area = AREA_2;
        mu = (mu < 0.0 ? mu + M_PI : mu - M_PI);
    } else {
        area = AREA_3;
        mu += M_HALFPI;
    }

    /* Compute phi and theta for the area of definition.
     * The inverse projection is not described in the original paper, but some
     * good hints can be found here (as of 2011-12-14):
     * http://fits.gsfc.nasa.gov/fitsbits/saf.93/saf.9302
     * (search for "Message-Id: <9302181759.AA25477 at fits.cv.nrao.edu>") */
    t = (M_PI / 12.0) * tan(mu);
    tantheta = sin(t) / (cos(t) - (1.0 / sqrt(2.0)));
    theta = atan(tantheta);
    cosmu = cos(mu);
    tannu = tan(nu);
    cosphi = 1.0 - cosmu * cosmu * tannu * tannu * (1.0 - cos(atan(1.0 / cos(theta))));
    if (cosphi < -1.0) {
        cosphi = -1.0;
    } else if (cosphi > +1.0) {
        cosphi = +1.0;
    }

    /* Apply the result to the real area on the cube face.
     * For the top and bottom face, we can compute phi and lam directly.
     * For the other faces, we must use unit sphere cartesian coordinates
     * as an intermediate step. */
    if (Q->face == FACE_TOP) {
        phi = acos(cosphi);
        lp.phi = M_HALFPI - phi;
        if (area == AREA_0) {
            lp.lam = theta + M_HALFPI;
        } else if (area == AREA_1) {
            lp.lam = (theta < 0.0 ? theta + M_PI : theta - M_PI);
        } else if (area == AREA_2) {
            lp.lam = theta - M_HALFPI;
        } else /* area == AREA_3 */ {
            lp.lam = theta;
        }
    } else if (Q->face == FACE_BOTTOM) {
        phi = acos(cosphi);
        lp.phi = phi - M_HALFPI;
        if (area == AREA_0) {
            lp.lam = -theta + M_HALFPI;
        } else if (area == AREA_1) {
            lp.lam = -theta;
        } else if (area == AREA_2) {
            lp.lam = -theta - M_HALFPI;
        } else /* area == AREA_3 */ {
            lp.lam = (theta < 0.0 ? -theta - M_PI : -theta + M_PI);
        }
    } else {
        /* Compute phi and lam via cartesian unit sphere coordinates. */
        double q, r, s;
        q = cosphi;
        t = q * q;
        if (t >= 1.0) {
            s = 0.0;
        } else {
            s = sqrt(1.0 - t) * sin(theta);
        }
        t += s * s;
        if (t >= 1.0) {
            r = 0.0;
        } else {
            r = sqrt(1.0 - t);
        }
        /* Rotate q,r,s into the correct area. */
        if (area == AREA_1) {
            t = r;
            r = -s;
            s = t;
        } else if (area == AREA_2) {
            r = -r;
            s = -s;
        } else if (area == AREA_3) {
            t = r;
            r = s;
            s = -t;
        }
        /* Rotate q,r,s into the correct cube face. */
        if (Q->face == FACE_RIGHT) {
            t = q;
            q = -r;
            r = t;
        } else if (Q->face == FACE_BACK) {
            q = -q;
            r = -r;
        } else if (Q->face == FACE_LEFT) {
            t = q;
            q = r;
            r = -t;
        }
        /* Now compute phi and lam from the unit sphere coordinates. */
        lp.phi = acos(-s) - M_HALFPI;
        lp.lam = atan2(r, q);
        if (Q->face == FACE_RIGHT) {
<<<<<<< HEAD
<<<<<<< HEAD
<<<<<<< HEAD
<<<<<<< HEAD
<<<<<<< HEAD
<<<<<<< HEAD
<<<<<<< HEAD
<<<<<<< HEAD
<<<<<<< HEAD
<<<<<<< HEAD
<<<<<<< HEAD
<<<<<<< HEAD
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
>>>>>>> 3771d4aec1 (Merge pull request #3524 from cffk/merid-update-fix)
=======
>>>>>>> 885e4882b8 (Merge pull request #3524 from cffk/merid-update-fix)
<<<<<<< HEAD
<<<<<<< HEAD
<<<<<<< HEAD
<<<<<<< HEAD
<<<<<<< HEAD
<<<<<<< HEAD
<<<<<<< HEAD
=======
>>>>>>> ebd1587dc5 (Merge pull request #3524 from cffk/merid-update-fix)
=======
>>>>>>> 6e4203f66c (Merge pull request #3524 from cffk/merid-update-fix)
=======
>>>>>>> 80ac813585 (Merge pull request #3524 from cffk/merid-update-fix)
=======
>>>>>>> d8e8090c80 (typo fixes)
=======
>>>>>>> 3bd0f77d39 (Merge pull request #3524 from cffk/merid-update-fix)
=======
>>>>>>> f00ffe609e (Merge pull request #3524 from cffk/merid-update-fix)
=======
>>>>>>> 48ae38528d (typo fixes)
=======
>>>>>>> 25ac262782 (Merge pull request #3524 from cffk/merid-update-fix)
=======
=======
>>>>>>> ebd1587dc5 (Merge pull request #3524 from cffk/merid-update-fix)
>>>>>>> dbc4ff68b0 (Merge pull request #3524 from cffk/merid-update-fix)
=======
>>>>>>> 3771d4aec1 (Merge pull request #3524 from cffk/merid-update-fix)
=======
>>>>>>> c63e6e91bd (Merge pull request #3524 from cffk/merid-update-fix)
<<<<<<< HEAD
<<<<<<< HEAD
=======
>>>>>>> 10b5e77237 (Merge pull request #3524 from cffk/merid-update-fix)
=======
>>>>>>> 74eac2217b (typo fixes)
<<<<<<< HEAD
<<<<<<< HEAD
=======
>>>>>>> 25ac262782 (Merge pull request #3524 from cffk/merid-update-fix)
=======
=======
>>>>>>> 3771d4aec1 (Merge pull request #3524 from cffk/merid-update-fix)
>>>>>>> c8fb3456cf (Merge pull request #3524 from cffk/merid-update-fix)
<<<<<<< HEAD
=======
>>>>>>> a029d873e8 (Merge pull request #3524 from cffk/merid-update-fix)
=======
>>>>>>> bb15f534d5 (Merge pull request #3524 from cffk/merid-update-fix)
=======
>>>>>>> a4391c6673 (typo fixes)
=======
=======
>>>>>>> 3771d4aec1 (Merge pull request #3524 from cffk/merid-update-fix)
>>>>>>> 8a24938f25 (Merge pull request #3524 from cffk/merid-update-fix)
=======
>>>>>>> 3bd0f77d39 (Merge pull request #3524 from cffk/merid-update-fix)
=======
=======
>>>>>>> 10b5e77237 (Merge pull request #3524 from cffk/merid-update-fix)
>>>>>>> f00ffe609e (Merge pull request #3524 from cffk/merid-update-fix)
=======
>>>>>>> 48ae38528d (typo fixes)
=======
>>>>>>> 25ac262782 (Merge pull request #3524 from cffk/merid-update-fix)
            lp.lam = qsc_shift_longitude_origin(lp.lam, -M_HALFPI);
        } else if (Q->face == FACE_BACK) {
            lp.lam = qsc_shift_longitude_origin(lp.lam, -M_PI);
        } else if (Q->face == FACE_LEFT) {
            lp.lam = qsc_shift_longitude_origin(lp.lam, +M_HALFPI);
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
>>>>>>> c8fb3456cf (Merge pull request #3524 from cffk/merid-update-fix)
=======
>>>>>>> 8a24938f25 (Merge pull request #3524 from cffk/merid-update-fix)
=======
>>>>>>> 3bd0f77d39 (Merge pull request #3524 from cffk/merid-update-fix)
=======
>>>>>>> f00ffe609e (Merge pull request #3524 from cffk/merid-update-fix)
=======
=======
>>>>>>> c8fb3456cf (Merge pull request #3524 from cffk/merid-update-fix)
>>>>>>> 25ac262782 (Merge pull request #3524 from cffk/merid-update-fix)
=======
>>>>>>> 748ccdbcc6 (Merge pull request #3524 from cffk/merid-update-fix)
            lp.lam = qsc_shift_lon_origin(lp.lam, -M_HALFPI);
=======
            lp.lam = qsc_shift_longitude_origin(lp.lam, -M_HALFPI);
>>>>>>> e4a6fd6d75 (typo fixes)
        } else if (Q->face == FACE_BACK) {
            lp.lam = qsc_shift_longitude_origin(lp.lam, -M_PI);
        } else if (Q->face == FACE_LEFT) {
<<<<<<< HEAD
            lp.lam = qsc_shift_lon_origin(lp.lam, +M_HALFPI);
<<<<<<< HEAD
>>>>>>> 360db021b6 (Merge pull request #3524 from cffk/merid-update-fix)
=======
<<<<<<< HEAD
>>>>>>> locationtech-main
=======
>>>>>>> 748ccdbcc6 (Merge pull request #3524 from cffk/merid-update-fix)
<<<<<<< HEAD
>>>>>>> a8fbb11965 (Merge pull request #3524 from cffk/merid-update-fix)
=======
=======
            lp.lam = qsc_shift_longitude_origin(lp.lam, +M_HALFPI);
>>>>>>> e4a6fd6d75 (typo fixes)
<<<<<<< HEAD
<<<<<<< HEAD
<<<<<<< HEAD
<<<<<<< HEAD
<<<<<<< HEAD
<<<<<<< HEAD
<<<<<<< HEAD
=======
>>>>>>> 48ae38528d (typo fixes)
=======
>>>>>>> 25ac262782 (Merge pull request #3524 from cffk/merid-update-fix)
>>>>>>> aa21c6fa76 (typo fixes)
=======
=======
=======
>>>>>>> 153df87aaa (Merge pull request #3524 from cffk/merid-update-fix)
<<<<<<< HEAD
<<<<<<< HEAD
<<<<<<< HEAD
<<<<<<< HEAD
=======
>>>>>>> 80ac813585 (Merge pull request #3524 from cffk/merid-update-fix)
=======
>>>>>>> dbc4ff68b0 (Merge pull request #3524 from cffk/merid-update-fix)
=======
>>>>>>> b609c280f5 (Merge pull request #3524 from cffk/merid-update-fix)
            lp.lam = qsc_shift_lon_origin(lp.lam, -M_HALFPI);
=======
            lp.lam = qsc_shift_longitude_origin(lp.lam, -M_HALFPI);
>>>>>>> 86ade66356 (typo fixes)
        } else if (Q->face == FACE_BACK) {
            lp.lam = qsc_shift_longitude_origin(lp.lam, -M_PI);
        } else if (Q->face == FACE_LEFT) {
<<<<<<< HEAD
            lp.lam = qsc_shift_lon_origin(lp.lam, +M_HALFPI);
<<<<<<< HEAD
<<<<<<< HEAD
>>>>>>> 360db021b (Merge pull request #3524 from cffk/merid-update-fix)
>>>>>>> 3771d4aec1 (Merge pull request #3524 from cffk/merid-update-fix)
>>>>>>> b5f4d47b2b (Merge pull request #3524 from cffk/merid-update-fix)
=======
>>>>>>> 153df87aaa (Merge pull request #3524 from cffk/merid-update-fix)
=======
>>>>>>> b609c280f5 (Merge pull request #3524 from cffk/merid-update-fix)
<<<<<<< HEAD
<<<<<<< HEAD
=======
            lp.lam = qsc_shift_longitude_origin(lp.lam, +M_HALFPI);
>>>>>>> 86ade66356 (typo fixes)
=======
<<<<<<< HEAD
<<<<<<< HEAD
=======
>>>>>>> f00ffe609e (Merge pull request #3524 from cffk/merid-update-fix)
=======
=======
>>>>>>> 748ccdbcc6 (Merge pull request #3524 from cffk/merid-update-fix)
>>>>>>> 10b5e77237 (Merge pull request #3524 from cffk/merid-update-fix)
<<<<<<< HEAD
<<<<<<< HEAD
=======
>>>>>>> 25ac262782 (Merge pull request #3524 from cffk/merid-update-fix)
=======
>>>>>>> aa21c6fa76 (typo fixes)
=======
=======
>>>>>>> c8fb3456cf (Merge pull request #3524 from cffk/merid-update-fix)
<<<<<<< HEAD
<<<<<<< HEAD
=======
>>>>>>> ebd1587dc5 (Merge pull request #3524 from cffk/merid-update-fix)
=======
>>>>>>> 208fcbd5e7 (Merge pull request #3524 from cffk/merid-update-fix)
=======
>>>>>>> 25ac262782 (Merge pull request #3524 from cffk/merid-update-fix)
            lp.lam = qsc_shift_lon_origin(lp.lam, -M_HALFPI);
=======
            lp.lam = qsc_shift_longitude_origin(lp.lam, -M_HALFPI);
>>>>>>> bf1dfe8af6 (typo fixes)
        } else if (Q->face == FACE_BACK) {
            lp.lam = qsc_shift_longitude_origin(lp.lam, -M_PI);
        } else if (Q->face == FACE_LEFT) {
<<<<<<< HEAD
            lp.lam = qsc_shift_lon_origin(lp.lam, +M_HALFPI);
<<<<<<< HEAD
<<<<<<< HEAD
<<<<<<< HEAD
<<<<<<< HEAD
<<<<<<< HEAD
=======
>>>>>>> 25ac262782 (Merge pull request #3524 from cffk/merid-update-fix)
>>>>>>> 360db021b6 (Merge pull request #3524 from cffk/merid-update-fix)
<<<<<<< HEAD
>>>>>>> c63e6e91bd (Merge pull request #3524 from cffk/merid-update-fix)
=======
=======
<<<<<<< HEAD
>>>>>>> locationtech-main
=======
<<<<<<< HEAD
>>>>>>> 748ccdbcc6 (Merge pull request #3524 from cffk/merid-update-fix)
>>>>>>> a8fbb11965 (Merge pull request #3524 from cffk/merid-update-fix)
>>>>>>> 10b5e77237 (Merge pull request #3524 from cffk/merid-update-fix)
=======
>>>>>>> aa21c6fa76 (typo fixes)
>>>>>>> 74eac2217b (typo fixes)
<<<<<<< HEAD
<<<<<<< HEAD
=======
>>>>>>> 25ac262782 (Merge pull request #3524 from cffk/merid-update-fix)
=======
>>>>>>> 360db021b (Merge pull request #3524 from cffk/merid-update-fix)
>>>>>>> 3771d4aec1 (Merge pull request #3524 from cffk/merid-update-fix)
>>>>>>> b5f4d47b2b (Merge pull request #3524 from cffk/merid-update-fix)
>>>>>>> c8fb3456cf (Merge pull request #3524 from cffk/merid-update-fix)
<<<<<<< HEAD
=======
>>>>>>> 360db021b (Merge pull request #3524 from cffk/merid-update-fix)
>>>>>>> 3771d4aec1 (Merge pull request #3524 from cffk/merid-update-fix)
>>>>>>> b5f4d47b2b (Merge pull request #3524 from cffk/merid-update-fix)
=======
>>>>>>> 153df87aaa (Merge pull request #3524 from cffk/merid-update-fix)
>>>>>>> ebd1587dc5 (Merge pull request #3524 from cffk/merid-update-fix)
=======
>>>>>>> 208fcbd5e7 (Merge pull request #3524 from cffk/merid-update-fix)
=======
            lp.lam = qsc_shift_longitude_origin(lp.lam, +M_HALFPI);
>>>>>>> bf1dfe8af6 (typo fixes)
=======
=======
=======
>>>>>>> 748ccdbcc6 (Merge pull request #3524 from cffk/merid-update-fix)
>>>>>>> bb15f534d5 (Merge pull request #3524 from cffk/merid-update-fix)
=======
>>>>>>> aa21c6fa76 (typo fixes)
=======
=======
>>>>>>> 8a24938f25 (Merge pull request #3524 from cffk/merid-update-fix)
=======
>>>>>>> 6e4203f66c (Merge pull request #3524 from cffk/merid-update-fix)
=======
>>>>>>> 3bd0f77d39 (Merge pull request #3524 from cffk/merid-update-fix)
=======
>>>>>>> f00ffe609e (Merge pull request #3524 from cffk/merid-update-fix)
=======
=======
>>>>>>> ebd1587dc5 (Merge pull request #3524 from cffk/merid-update-fix)
>>>>>>> dbc4ff68b0 (Merge pull request #3524 from cffk/merid-update-fix)
=======
>>>>>>> 0a2f6458d1 (Merge pull request #3524 from cffk/merid-update-fix)
>>>>>>> 885e4882b8 (Merge pull request #3524 from cffk/merid-update-fix)
=======
>>>>>>> 0a2f6458d1 (Merge pull request #3524 from cffk/merid-update-fix)
            lp.lam = qsc_shift_lon_origin(lp.lam, -M_HALFPI);
        } else if (Q->face == FACE_BACK) {
            lp.lam = qsc_shift_lon_origin(lp.lam, -M_PI);
        } else if (Q->face == FACE_LEFT) {
            lp.lam = qsc_shift_lon_origin(lp.lam, +M_HALFPI);
<<<<<<< HEAD
<<<<<<< HEAD
<<<<<<< HEAD
<<<<<<< HEAD
=======
<<<<<<< HEAD
>>>>>>> 360db021b (Merge pull request #3524 from cffk/merid-update-fix)
>>>>>>> 3771d4aec1 (Merge pull request #3524 from cffk/merid-update-fix)
>>>>>>> 885e4882b8 (Merge pull request #3524 from cffk/merid-update-fix)
<<<<<<< HEAD
<<<<<<< HEAD
<<<<<<< HEAD
<<<<<<< HEAD
>>>>>>> 360db021b6 (Merge pull request #3524 from cffk/merid-update-fix)
<<<<<<< HEAD
>>>>>>> a029d873e8 (Merge pull request #3524 from cffk/merid-update-fix)
=======
=======
<<<<<<< HEAD
>>>>>>> locationtech-main
=======
>>>>>>> 748ccdbcc6 (Merge pull request #3524 from cffk/merid-update-fix)
>>>>>>> a8fbb11965 (Merge pull request #3524 from cffk/merid-update-fix)
>>>>>>> bb15f534d5 (Merge pull request #3524 from cffk/merid-update-fix)
=======
>>>>>>> aa21c6fa76 (typo fixes)
>>>>>>> a4391c6673 (typo fixes)
=======
>>>>>>> 360db021b (Merge pull request #3524 from cffk/merid-update-fix)
>>>>>>> 3771d4aec1 (Merge pull request #3524 from cffk/merid-update-fix)
>>>>>>> b5f4d47b2b (Merge pull request #3524 from cffk/merid-update-fix)
>>>>>>> 8a24938f25 (Merge pull request #3524 from cffk/merid-update-fix)
=======
>>>>>>> 360db021b (Merge pull request #3524 from cffk/merid-update-fix)
>>>>>>> 3771d4aec1 (Merge pull request #3524 from cffk/merid-update-fix)
>>>>>>> b5f4d47b2b (Merge pull request #3524 from cffk/merid-update-fix)
=======
>>>>>>> 153df87aaa (Merge pull request #3524 from cffk/merid-update-fix)
>>>>>>> 6e4203f66c (Merge pull request #3524 from cffk/merid-update-fix)
=======
>>>>>>> 80ac813585 (Merge pull request #3524 from cffk/merid-update-fix)
=======
=======
            lp.lam = qsc_shift_longitude_origin(lp.lam, +M_HALFPI);
>>>>>>> 86ade66356 (typo fixes)
>>>>>>> d8e8090c80 (typo fixes)
=======
=======
>>>>>>> f00ffe609e (Merge pull request #3524 from cffk/merid-update-fix)
=======
>>>>>>> dbc4ff68b0 (Merge pull request #3524 from cffk/merid-update-fix)
>>>>>>> 360db021b6 (Merge pull request #3524 from cffk/merid-update-fix)
<<<<<<< HEAD
>>>>>>> c63e6e91bd (Merge pull request #3524 from cffk/merid-update-fix)
<<<<<<< HEAD
>>>>>>> 3bd0f77d39 (Merge pull request #3524 from cffk/merid-update-fix)
=======
=======
=======
<<<<<<< HEAD
>>>>>>> locationtech-main
=======
>>>>>>> 748ccdbcc6 (Merge pull request #3524 from cffk/merid-update-fix)
>>>>>>> a8fbb11965 (Merge pull request #3524 from cffk/merid-update-fix)
>>>>>>> 10b5e77237 (Merge pull request #3524 from cffk/merid-update-fix)
>>>>>>> f00ffe609e (Merge pull request #3524 from cffk/merid-update-fix)
=======
>>>>>>> 48ae38528d (typo fixes)
=======
<<<<<<< HEAD
>>>>>>> 25ac262782 (Merge pull request #3524 from cffk/merid-update-fix)
=======
>>>>>>> 360db021b (Merge pull request #3524 from cffk/merid-update-fix)
>>>>>>> 3771d4aec1 (Merge pull request #3524 from cffk/merid-update-fix)
>>>>>>> b5f4d47b2b (Merge pull request #3524 from cffk/merid-update-fix)
>>>>>>> c8fb3456cf (Merge pull request #3524 from cffk/merid-update-fix)
=======
>>>>>>> 360db021b (Merge pull request #3524 from cffk/merid-update-fix)
>>>>>>> 3771d4aec1 (Merge pull request #3524 from cffk/merid-update-fix)
>>>>>>> b5f4d47b2b (Merge pull request #3524 from cffk/merid-update-fix)
=======
>>>>>>> 153df87aaa (Merge pull request #3524 from cffk/merid-update-fix)
>>>>>>> ebd1587dc5 (Merge pull request #3524 from cffk/merid-update-fix)
<<<<<<< HEAD
>>>>>>> dbc4ff68b0 (Merge pull request #3524 from cffk/merid-update-fix)
=======
>>>>>>> locationtech-main
=======
>>>>>>> 0a2f6458d1 (Merge pull request #3524 from cffk/merid-update-fix)
>>>>>>> 885e4882b8 (Merge pull request #3524 from cffk/merid-update-fix)
=======
>>>>>>> 0a2f6458d1 (Merge pull request #3524 from cffk/merid-update-fix)
        }
    }

    /* Apply the shift from the sphere to the ellipsoid as described
     * in [LK12]. */
    if (P->es != 0.0) {
        int invert_sign;
        double tanphi, xa;
        invert_sign = (lp.phi < 0.0 ? 1 : 0);
        tanphi = tan(lp.phi);
        xa = Q->b / sqrt(tanphi * tanphi + Q->one_minus_f_squared);
        lp.phi = atan(sqrt(P->a * P->a - xa * xa) / (Q->one_minus_f * xa));
        if (invert_sign) {
            lp.phi = -lp.phi;
        }
    }
    return lp;
}


PJ *PROJECTION(qsc) {
    struct pj_opaque *Q = static_cast<struct pj_opaque*>(calloc (1, sizeof (struct pj_opaque)));
    if (nullptr==Q)
        return pj_default_destructor (P, PROJ_ERR_OTHER /*ENOMEM*/);
    P->opaque = Q;

    P->inv = qsc_e_inverse;
    P->fwd = qsc_e_forward;
    /* Determine the cube face from the center of projection. */
    if (P->phi0 >= M_HALFPI - M_FORTPI / 2.0) {
        Q->face = FACE_TOP;
    } else if (P->phi0 <= -(M_HALFPI - M_FORTPI / 2.0)) {
        Q->face = FACE_BOTTOM;
    } else if (fabs(P->lam0) <= M_FORTPI) {
        Q->face = FACE_FRONT;
    } else if (fabs(P->lam0) <= M_HALFPI + M_FORTPI) {
        Q->face = (P->lam0 > 0.0 ? FACE_RIGHT : FACE_LEFT);
    } else {
        Q->face = FACE_BACK;
    }
    /* Fill in useful values for the ellipsoid <-> sphere shift
     * described in [LK12]. */
    if (P->es != 0.0) {
        Q->a_squared = P->a * P->a;
        Q->b = P->a * sqrt(1.0 - P->es);
        Q->one_minus_f = 1.0 - (P->a - Q->b) / P->a;
        Q->one_minus_f_squared = Q->one_minus_f * Q->one_minus_f;
    }

    return P;
}
