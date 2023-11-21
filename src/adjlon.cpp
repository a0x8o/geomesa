/* reduce argument to range +/- PI */
#include <math.h>

#include "proj.h"
#include "proj_internal.h"

<<<<<<< HEAD
<<<<<<< HEAD
<<<<<<< HEAD
<<<<<<< HEAD
=======
>>>>>>> e4a6fd6d75 (typo fixes)
=======
>>>>>>> 3771d4aec1 (Merge pull request #3524 from cffk/merid-update-fix)
double adjlon (double longitude) {
    /* Let longitude slightly overshoot, to avoid spurious sign switching at the date line */
    if (fabs (longitude) < M_PI + 1e-12)
        return longitude;
<<<<<<< HEAD

    /* adjust to 0..2pi range */
    longitude += M_PI;

    /* remove integral # of 'revolutions'*/
    longitude -= M_TWOPI * floor(longitude / M_TWOPI);

    /* adjust back to -pi..pi range */
    longitude -= M_PI;

    return longitude;
=======
<<<<<<< HEAD
=======
>>>>>>> 748ccdbcc6 (Merge pull request #3524 from cffk/merid-update-fix)
=======
>>>>>>> 3771d4aec1 (Merge pull request #3524 from cffk/merid-update-fix)
double adjlon (double lon) {
    /* Let lon slightly overshoot, to avoid spurious sign switching at the date line */
    if (fabs (lon) < M_PI + 1e-12)
        return lon;
<<<<<<< HEAD
=======
>>>>>>> e4a6fd6d75 (typo fixes)

    /* adjust to 0..2pi range */
    longitude += M_PI;

    /* remove integral # of 'revolutions'*/
    longitude -= M_TWOPI * floor(longitude / M_TWOPI);

    /* adjust back to -pi..pi range */
    longitude -= M_PI;

<<<<<<< HEAD
    return lon;
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
    return longitude;
>>>>>>> e4a6fd6d75 (typo fixes)
<<<<<<< HEAD
>>>>>>> aa21c6fa76 (typo fixes)
=======
=======

    /* adjust to 0..2pi range */
    lon += M_PI;

    /* remove integral # of 'revolutions'*/
    lon -= M_TWOPI * floor(lon / M_TWOPI);

    /* adjust back to -pi..pi range */
    lon -= M_PI;

    return lon;
>>>>>>> 360db021b (Merge pull request #3524 from cffk/merid-update-fix)
>>>>>>> 3771d4aec1 (Merge pull request #3524 from cffk/merid-update-fix)
>>>>>>> b5f4d47b2b (Merge pull request #3524 from cffk/merid-update-fix)
}
