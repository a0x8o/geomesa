/******************************************************************************
 * Project:  PROJ.4
 * Purpose:  Apply datum definition to PJ structure from initialization string.
 * Author:   Frank Warmerdam, warmerda@home.com
 *
 ******************************************************************************
 * Copyright (c) 2000, Frank Warmerdam
 *
 * Permission is hereby granted, free of charge, to any person obtaining a
 * copy of this software and associated documentation files (the "Software"),
 * to deal in the Software without restriction, including without limitation
 * the rights to use, copy, modify, merge, publish, distribute, sublicense,
 * and/or sell copies of the Software, and to permit persons to whom the
 * Software is furnished to do so, subject to the following conditions:
 *
 * The above copyright notice and this permission notice shall be included
 * in all copies or substantial portions of the Software.
 *
 * THE SOFTWARE IS PROVIDED "AS IS", WITHOUT WARRANTY OF ANY KIND, EXPRESS
 * OR IMPLIED, INCLUDING BUT NOT LIMITED TO THE WARRANTIES OF MERCHANTABILITY,
 * FITNESS FOR A PARTICULAR PURPOSE AND NONINFRINGEMENT. IN NO EVENT SHALL
 * THE AUTHORS OR COPYRIGHT HOLDERS BE LIABLE FOR ANY CLAIM, DAMAGES OR OTHER
 * LIABILITY, WHETHER IN AN ACTION OF CONTRACT, TORT OR OTHERWISE, ARISING
 * FROM, OUT OF OR IN CONNECTION WITH THE SOFTWARE OR THE USE OR OTHER
 * DEALINGS IN THE SOFTWARE.
 *****************************************************************************/

#include <string.h>

#include "proj.h"
#include "proj_internal.h"

/* SEC_TO_RAD = Pi/180/3600 */
#define SEC_TO_RAD 4.84813681109535993589914102357e-6

/************************************************************************/
/*                            pj_datum_set()                            */
/************************************************************************/

int pj_datum_set(PJ_CONTEXT *ctx, paralist *pl, PJ *projdef)

{
    const char *name, *towgs84, *nadgrids;

    projdef->datum_type = PJD_UNKNOWN;

/* -------------------------------------------------------------------- */
/*      Is there a datum definition in the parameters list?  If so,     */
/*      add the defining values to the parameter list.  Note that       */
/*      this will append the ellipse definition as well as the          */
/*      towgs84= and related parameters.  It should also be pointed     */
/*      out that the addition is permanent rather than temporary        */
/*      like most other keyword expansion so that the ellipse           */
/*      definition will last into the pj_ell_set() function called      */
/*      after this one.                                                 */
/* -------------------------------------------------------------------- */
    if( (name = pj_param(ctx, pl,"sdatum").s) != nullptr )
    {
        paralist *curr;
        const char *s;
        int i;

        /* find the end of the list, so we can add to it */
        for (curr = pl; curr && curr->next ; curr = curr->next) {}

        /* cannot happen in practice, but makes static analyzers happy */
        if( !curr ) return -1;

        /* find the datum definition */
<<<<<<< HEAD
<<<<<<< HEAD
<<<<<<< HEAD
<<<<<<< HEAD
<<<<<<< HEAD
<<<<<<< HEAD
<<<<<<< HEAD
<<<<<<< HEAD
<<<<<<< HEAD
<<<<<<< HEAD
<<<<<<< HEAD
<<<<<<< HEAD
<<<<<<< HEAD
<<<<<<< HEAD
<<<<<<< HEAD
<<<<<<< HEAD
<<<<<<< HEAD
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
        const struct PJ_DATUMS * pj_datums = pj_get_datums_ref();
=======
<<<<<<< HEAD
>>>>>>> 360db021b6 (Merge pull request #3524 from cffk/merid-update-fix)
=======
>>>>>>> locationtech-main
=======
>>>>>>> 748ccdbcc6 (Merge pull request #3524 from cffk/merid-update-fix)
<<<<<<< HEAD
>>>>>>> a8fbb11965 (Merge pull request #3524 from cffk/merid-update-fix)
=======
=======
        const struct PJ_DATUMS * pj_datums = pj_get_datums_ref();
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
        const struct PJ_DATUMS * pj_datums = pj_get_datums_ref();
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
>>>>>>> 25ac262782 (Merge pull request #3524 from cffk/merid-update-fix)
=======
>>>>>>> dbc4ff68b0 (Merge pull request #3524 from cffk/merid-update-fix)
=======
>>>>>>> 153df87aaa (Merge pull request #3524 from cffk/merid-update-fix)
=======
>>>>>>> b609c280f5 (Merge pull request #3524 from cffk/merid-update-fix)
<<<<<<< HEAD
<<<<<<< HEAD
=======
        const struct PJ_DATUMS * pj_datums = pj_get_datums_ref();
>>>>>>> 86ade66356 (typo fixes)
=======
<<<<<<< HEAD
<<<<<<< HEAD
=======
>>>>>>> 10b5e77237 (Merge pull request #3524 from cffk/merid-update-fix)
        const struct PJ_DATUMS * pj_datums = pj_get_datums_ref();
=======
<<<<<<< HEAD
>>>>>>> 360db021b6 (Merge pull request #3524 from cffk/merid-update-fix)
<<<<<<< HEAD
>>>>>>> c63e6e91bd (Merge pull request #3524 from cffk/merid-update-fix)
=======
=======
>>>>>>> locationtech-main
=======
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
>>>>>>> 153df87aaa (Merge pull request #3524 from cffk/merid-update-fix)
>>>>>>> ebd1587dc5 (Merge pull request #3524 from cffk/merid-update-fix)
<<<<<<< HEAD
=======
>>>>>>> 208fcbd5e7 (Merge pull request #3524 from cffk/merid-update-fix)
=======
        const struct PJ_DATUMS * pj_datums = pj_get_datums_ref();
>>>>>>> bf1dfe8af6 (typo fixes)
=======
=======
>>>>>>> bb15f534d5 (Merge pull request #3524 from cffk/merid-update-fix)
        const struct PJ_DATUMS * pj_datums = pj_get_datums_ref();
=======
<<<<<<< HEAD
>>>>>>> 360db021b6 (Merge pull request #3524 from cffk/merid-update-fix)
<<<<<<< HEAD
>>>>>>> a029d873e8 (Merge pull request #3524 from cffk/merid-update-fix)
=======
=======
>>>>>>> locationtech-main
=======
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
>>>>>>> 153df87aaa (Merge pull request #3524 from cffk/merid-update-fix)
>>>>>>> 6e4203f66c (Merge pull request #3524 from cffk/merid-update-fix)
=======
>>>>>>> 80ac813585 (Merge pull request #3524 from cffk/merid-update-fix)
=======
=======
        const struct PJ_DATUMS * pj_datums = pj_get_datums_ref();
>>>>>>> 86ade66356 (typo fixes)
>>>>>>> d8e8090c80 (typo fixes)
=======
=======
=======
>>>>>>> 10b5e77237 (Merge pull request #3524 from cffk/merid-update-fix)
>>>>>>> f00ffe609e (Merge pull request #3524 from cffk/merid-update-fix)
        const struct PJ_DATUMS * pj_datums = pj_get_datums_ref();
=======
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
        for (i = 0; (s = pj_datums[i].id) && strcmp(name, s) ; ++i) {}

        if (!s) {
            pj_log (ctx, PJ_LOG_ERROR, _("Unknown value for datum"));
            proj_context_errno_set(ctx, PROJ_ERR_INVALID_OP_ILLEGAL_ARG_VALUE);
            return 1;
        }

        if( pj_datums[i].ellipse_id && strlen(pj_datums[i].ellipse_id) > 0 )
        {
            char	entry[100];
            
            strcpy( entry, "ellps=" );
            strncpy( entry + strlen(entry), pj_datums[i].ellipse_id,
                     sizeof(entry) - 1 - strlen(entry) );
            entry[ sizeof(entry) - 1 ] = '\0';

            auto param = pj_mkparam(entry);
            if (nullptr == param)
            {
                proj_context_errno_set(ctx, PROJ_ERR_OTHER /*ENOMEM*/);
                return 1;
            }
            curr->next = param;
            curr = param;
        }
        
        if( pj_datums[i].defn && strlen(pj_datums[i].defn) > 0 )
        {
            auto param = pj_mkparam(pj_datums[i].defn);
            if (nullptr == param)
            {
                proj_context_errno_set(ctx, PROJ_ERR_OTHER /*ENOMEM*/);
                return 1;
            }
            curr->next = param;
            /* curr = param; */
        }
    }

/* -------------------------------------------------------------------- */
/*      Check for nadgrids parameter.                                   */
/* -------------------------------------------------------------------- */
    nadgrids = pj_param(ctx, pl,"snadgrids").s;
    if( nadgrids != nullptr )
    {
        /* We don't actually save the value separately.  It will continue
           to exist int he param list for use in pj_apply_gridshift.c */

        projdef->datum_type = PJD_GRIDSHIFT;
    }

/* -------------------------------------------------------------------- */
/*      Check for towgs84 parameter.                                    */
/* -------------------------------------------------------------------- */
    else if( (towgs84 = pj_param(ctx, pl,"stowgs84").s) != nullptr )
    {
        int    parm_count = 0;
        const char *s;

        memset( projdef->datum_params, 0, sizeof(double) * 7);

        /* parse out the parameters */
        for( s = towgs84; *s != '\0' && parm_count < 7; ) 
        {
            projdef->datum_params[parm_count++] = pj_atof(s);
            while( *s != '\0' && *s != ',' )
                s++;
            if( *s == ',' )
                s++;
        }

        if( projdef->datum_params[3] != 0.0 
            || projdef->datum_params[4] != 0.0 
            || projdef->datum_params[5] != 0.0 
            || projdef->datum_params[6] != 0.0 )
        {
            projdef->datum_type = PJD_7PARAM;

            /* transform from arc seconds to radians */
            projdef->datum_params[3] *= SEC_TO_RAD;
            projdef->datum_params[4] *= SEC_TO_RAD;
            projdef->datum_params[5] *= SEC_TO_RAD;
            /* transform from parts per million to scaling factor */
            projdef->datum_params[6] = 
                (projdef->datum_params[6]/1000000.0) + 1;
        }
        else 
            projdef->datum_type = PJD_3PARAM;

        /* Note that pj_init() will later switch datum_type to 
           PJD_WGS84 if shifts are all zero, and ellipsoid is WGS84 or GRS80 */
    }

    return 0;
}
