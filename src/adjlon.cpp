/* reduce argument to range +/- PI */
#include <math.h>

#include "proj.h"
#include "proj_internal.h"

<<<<<<< HEAD
<<<<<<< HEAD
<<<<<<< HEAD
=======
>>>>>>> e4a6fd6d75 (typo fixes)
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
=======
>>>>>>> 748ccdbcc6 (Merge pull request #3524 from cffk/merid-update-fix)
double adjlon (double lon) {
    /* Let lon slightly overshoot, to avoid spurious sign switching at the date line */
    if (fabs (lon) < M_PI + 1e-12)
        return lon;
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
>>>>>>> locationtech-main
=======
>>>>>>> 748ccdbcc6 (Merge pull request #3524 from cffk/merid-update-fix)
=======
    return longitude;
>>>>>>> e4a6fd6d75 (typo fixes)
}
