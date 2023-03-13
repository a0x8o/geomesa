/******************************************************************************
 *
 * Derived from GDAL port/cpl_strtod.cpp
 * Purpose:  Functions to convert ASCII string to floating point number.
 * Author:   Andrey Kiselev, dron@ak4719.spb.edu.
 *
 ******************************************************************************
 * Copyright (c) 2006, Andrey Kiselev
 * Copyright (c) 2008-2012, Even Rouault <even dot rouault at mines-paris dot org>
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
 ****************************************************************************/

#include <errno.h>
#include <locale.h>
#include <stdlib.h>
#include <string.h>

#include "proj.h"
#include "proj_config.h"
#include "proj_internal.h"

<<<<<<< HEAD
<<<<<<< HEAD
<<<<<<< HEAD
<<<<<<< HEAD
<<<<<<< HEAD
=======
#define PJ_STRTOD_WORK_BUFFER_SIZE 64

>>>>>>> locationtech-main
=======
#define PJ_STRTOD_WORK_BUFFER_SIZE 64

>>>>>>> 748ccdbcc6 (Merge pull request #3524 from cffk/merid-update-fix)
=======
>>>>>>> e4a6fd6d75 (typo fixes)
=======
=======
#define PJ_STRTOD_WORK_BUFFER_SIZE 64

>>>>>>> 360db021b (Merge pull request #3524 from cffk/merid-update-fix)
>>>>>>> 3771d4aec1 (Merge pull request #3524 from cffk/merid-update-fix)
=======
#define PJ_STRTOD_WORK_BUFFER_SIZE 64

>>>>>>> locationtech-main
/************************************************************************/
/*                              pj_atof()                               */
/************************************************************************/

/**
 * Converts ASCII string to floating point number.
 *
 * This function converts the initial portion of the string pointed to
 * by nptr to double floating point representation. The behavior is the
 * same as
 *
<<<<<<< HEAD
<<<<<<< HEAD
<<<<<<< HEAD
<<<<<<< HEAD
<<<<<<< HEAD
 *   pj_strtod(nptr, nullptr);
=======
 *   pj_strtod(nptr, (char **)NULL);
>>>>>>> locationtech-main
=======
 *   pj_strtod(nptr, (char **)NULL);
>>>>>>> 748ccdbcc6 (Merge pull request #3524 from cffk/merid-update-fix)
=======
 *   pj_strtod(nptr, nullptr);
>>>>>>> e4a6fd6d75 (typo fixes)
=======
 *   pj_strtod(nptr, nullptr);
=======
 *   pj_strtod(nptr, (char **)NULL);
>>>>>>> 360db021b (Merge pull request #3524 from cffk/merid-update-fix)
>>>>>>> 3771d4aec1 (Merge pull request #3524 from cffk/merid-update-fix)
=======
 *   pj_strtod(nptr, (char **)NULL);
>>>>>>> locationtech-main
 *
 * This function does the same as standard atof(3), but does not take
 * locale in account. That means, the decimal delimiter is always '.'
 * (decimal point).
 *
 * @param nptr Pointer to string to convert.
 *
 * @return Converted value.
 */
double pj_atof( const char* nptr )
{
    return pj_strtod(nptr, nullptr);
}


/************************************************************************/
/*                     replace_point_by_locale_point()               */
/************************************************************************/

<<<<<<< HEAD
<<<<<<< HEAD
<<<<<<< HEAD
<<<<<<< HEAD
<<<<<<< HEAD
=======
>>>>>>> 3771d4aec1 (Merge pull request #3524 from cffk/merid-update-fix)
static char* replace_point_by_locale_point(const char* pszNumber, char point)
=======
static char* replace_point_by_locale_point(const char* pszNumber, char point,
                                              char* pszWorkBuffer)
<<<<<<< HEAD
>>>>>>> locationtech-main
=======
static char* replace_point_by_locale_point(const char* pszNumber, char point,
                                              char* pszWorkBuffer)
>>>>>>> 748ccdbcc6 (Merge pull request #3524 from cffk/merid-update-fix)
=======
static char* replace_point_by_locale_point(const char* pszNumber, char point)
>>>>>>> e4a6fd6d75 (typo fixes)
=======
>>>>>>> 360db021b (Merge pull request #3524 from cffk/merid-update-fix)
>>>>>>> 3771d4aec1 (Merge pull request #3524 from cffk/merid-update-fix)
=======
static char* replace_point_by_locale_point(const char* pszNumber, char point,
                                              char* pszWorkBuffer)
>>>>>>> locationtech-main
{
#if !defined(HAVE_LOCALECONV)

#if defined(_MSC_VER)  /* Visual C++ */
#pragma message("localeconv not available")
#else
#warning "localeconv not available"
#endif

    static char byPoint = 0;
    if (byPoint == 0)
    {
        char szBuf[16];
        snprintf(szBuf, sizeof(szBuf), "%.1f", 1.0);
        byPoint = szBuf[1];
    }
    if (point != byPoint)
    {
        const char* pszPoint = strchr(pszNumber, point);
        if (pszPoint)
        {
<<<<<<< HEAD
<<<<<<< HEAD
<<<<<<< HEAD
<<<<<<< HEAD
<<<<<<< HEAD
=======
>>>>>>> 3771d4aec1 (Merge pull request #3524 from cffk/merid-update-fix)
            char* pszNew = pj_strdup(pszNumber);
            if (!pszNew)
                return nullptr;
=======
<<<<<<< HEAD
=======
>>>>>>> 748ccdbcc6 (Merge pull request #3524 from cffk/merid-update-fix)
=======
>>>>>>> 3771d4aec1 (Merge pull request #3524 from cffk/merid-update-fix)
=======
>>>>>>> locationtech-main
            char* pszNew;
            if( strlen(pszNumber) < PJ_STRTOD_WORK_BUFFER_SIZE )
            {
                strcpy(pszWorkBuffer, pszNumber);
                pszNew = pszWorkBuffer;
            }
            else {
                pszNew = pj_strdup(pszNumber);
                if (!pszNew)
                    return NULL;
            }
<<<<<<< HEAD
<<<<<<< HEAD
<<<<<<< HEAD
>>>>>>> locationtech-main
=======
>>>>>>> 748ccdbcc6 (Merge pull request #3524 from cffk/merid-update-fix)
=======
            char* pszNew = pj_strdup(pszNumber);
            if (!pszNew)
                return nullptr;
>>>>>>> e4a6fd6d75 (typo fixes)
=======
>>>>>>> 360db021b (Merge pull request #3524 from cffk/merid-update-fix)
>>>>>>> 3771d4aec1 (Merge pull request #3524 from cffk/merid-update-fix)
=======
>>>>>>> locationtech-main
            pszNew[pszPoint - pszNumber] = byPoint;
            return pszNew;
        }
    }
<<<<<<< HEAD
<<<<<<< HEAD
<<<<<<< HEAD
<<<<<<< HEAD
<<<<<<< HEAD
=======
>>>>>>> 3771d4aec1 (Merge pull request #3524 from cffk/merid-update-fix)

    return nullptr;

#else

    const struct lconv *poLconv = localeconv();
=======
#else
    struct lconv *poLconv = localeconv();
<<<<<<< HEAD
>>>>>>> locationtech-main
=======
#else
    struct lconv *poLconv = localeconv();
>>>>>>> 748ccdbcc6 (Merge pull request #3524 from cffk/merid-update-fix)
=======

    return nullptr;

#else

    const struct lconv *poLconv = localeconv();
>>>>>>> e4a6fd6d75 (typo fixes)
=======
>>>>>>> 360db021b (Merge pull request #3524 from cffk/merid-update-fix)
>>>>>>> 3771d4aec1 (Merge pull request #3524 from cffk/merid-update-fix)
=======
#else
    struct lconv *poLconv = localeconv();
>>>>>>> locationtech-main
    if ( poLconv
         && poLconv->decimal_point
         && poLconv->decimal_point[0] != '\0' )
    {
        char    byPoint = poLconv->decimal_point[0];

        if (point != byPoint)
        {
            const char* pszLocalePoint = strchr(pszNumber, byPoint);
            const char* pszPoint = strchr(pszNumber, point);
            if (pszPoint || pszLocalePoint)
            {
<<<<<<< HEAD
<<<<<<< HEAD
<<<<<<< HEAD
<<<<<<< HEAD
<<<<<<< HEAD
=======
>>>>>>> 3771d4aec1 (Merge pull request #3524 from cffk/merid-update-fix)
                char* pszNew = pj_strdup(pszNumber);
                if (!pszNew)
                    return nullptr;
=======
<<<<<<< HEAD
=======
>>>>>>> 748ccdbcc6 (Merge pull request #3524 from cffk/merid-update-fix)
=======
>>>>>>> 3771d4aec1 (Merge pull request #3524 from cffk/merid-update-fix)
=======
>>>>>>> locationtech-main
                char* pszNew;
                if( strlen(pszNumber) < PJ_STRTOD_WORK_BUFFER_SIZE )
                {
                    strcpy(pszWorkBuffer, pszNumber);
                    pszNew = pszWorkBuffer;
                }
                else {
                    pszNew = pj_strdup(pszNumber);
                    if (!pszNew)
                        return nullptr;
                }
<<<<<<< HEAD
<<<<<<< HEAD
<<<<<<< HEAD
>>>>>>> locationtech-main
=======
>>>>>>> 748ccdbcc6 (Merge pull request #3524 from cffk/merid-update-fix)
=======
                char* pszNew = pj_strdup(pszNumber);
                if (!pszNew)
                    return nullptr;
>>>>>>> e4a6fd6d75 (typo fixes)
=======
>>>>>>> 360db021b (Merge pull request #3524 from cffk/merid-update-fix)
>>>>>>> 3771d4aec1 (Merge pull request #3524 from cffk/merid-update-fix)
=======
>>>>>>> locationtech-main
                if( pszLocalePoint )
                    pszNew[pszLocalePoint - pszNumber] = ' ';
                if( pszPoint )
                    pszNew[pszPoint - pszNumber] = byPoint;
                return pszNew;
            }
        }
    }
<<<<<<< HEAD
<<<<<<< HEAD
<<<<<<< HEAD
<<<<<<< HEAD
<<<<<<< HEAD
=======
>>>>>>> 3771d4aec1 (Merge pull request #3524 from cffk/merid-update-fix)

    return nullptr;

#endif
=======
#endif
    return (char*) pszNumber;
<<<<<<< HEAD
>>>>>>> locationtech-main
=======
#endif
    return (char*) pszNumber;
>>>>>>> 748ccdbcc6 (Merge pull request #3524 from cffk/merid-update-fix)
=======

    return nullptr;

#endif
>>>>>>> e4a6fd6d75 (typo fixes)
=======
>>>>>>> 360db021b (Merge pull request #3524 from cffk/merid-update-fix)
>>>>>>> 3771d4aec1 (Merge pull request #3524 from cffk/merid-update-fix)
=======
#endif
    return (char*) pszNumber;
>>>>>>> locationtech-main
}

/************************************************************************/
/*                            pj_strtod()                               */
/************************************************************************/

/**
 * Converts ASCII string to floating point number.
 *
 * This function converts the initial portion of the string pointed to
 * by nptr to double floating point representation. This function does the
 * same as standard strtod(3), but does not take locale in account and use
 * decimal point.
 *
 * @param nptr Pointer to string to convert.
 * @param endptr If is not NULL, a pointer to the character after the last
 * character used in the conversion is stored in the location referenced
 * by endptr.
 *
 * @return Converted value.
 */
double pj_strtod( const char *nptr, char **endptr )
{
/* -------------------------------------------------------------------- */
/*  We are implementing a simple method here: copy the input string     */
<<<<<<< HEAD
<<<<<<< HEAD
<<<<<<< HEAD
<<<<<<< HEAD
<<<<<<< HEAD
=======
>>>>>>> 3771d4aec1 (Merge pull request #3524 from cffk/merid-update-fix)
/*  into the temporary buffer, replace the specified decimal delimiter (.)  */
/*  with the one taken from locale settings (ex ',') and then use standard strtod()  */
/*  on that buffer.                                                     */
/* -------------------------------------------------------------------- */
    char *pszNumber = replace_point_by_locale_point( nptr, '.' );
    if ( pszNumber )
    {
        char *pszNumberEnd;
        double dfValue = strtod( pszNumber, &pszNumberEnd );

        int nError = errno;

        if ( endptr )
        {
            ptrdiff_t offset = pszNumberEnd - pszNumber;
            *endptr = const_cast<char*>( nptr + offset );
        }

        free( pszNumber );

        errno = nError;

        return dfValue;
    }
    else
    {
        return strtod( nptr, endptr );
    }
=======
<<<<<<< HEAD
=======
>>>>>>> 748ccdbcc6 (Merge pull request #3524 from cffk/merid-update-fix)
/*  into the temporary buffer, replace the specified decimal delimiter  */
/*  with the one, taken from locale settings and use standard strtod()  */
=======
/*  into the temporary buffer, replace the specified decimal delimiter (.)  */
/*  with the one taken from locale settings (ex ',') and then use standard strtod()  */
>>>>>>> e4a6fd6d75 (typo fixes)
/*  on that buffer.                                                     */
/* -------------------------------------------------------------------- */
    char *pszNumber = replace_point_by_locale_point( nptr, '.' );
    if ( pszNumber )
    {
        char *pszNumberEnd;
        double dfValue = strtod( pszNumber, &pszNumberEnd );

        int nError = errno;

        if ( endptr )
        {
            ptrdiff_t offset = pszNumberEnd - pszNumber;
            *endptr = const_cast<char*>( nptr + offset );
        }

        free( pszNumber );

<<<<<<< HEAD
    errno = nError;
    return dfValue;
<<<<<<< HEAD
>>>>>>> locationtech-main
=======
>>>>>>> 748ccdbcc6 (Merge pull request #3524 from cffk/merid-update-fix)
=======
        errno = nError;

        return dfValue;
    }
    else
    {
        return strtod( nptr, endptr );
    }
>>>>>>> e4a6fd6d75 (typo fixes)
=======
=======
>>>>>>> locationtech-main
/*  into the temporary buffer, replace the specified decimal delimiter  */
/*  with the one, taken from locale settings and use standard strtod()  */
/*  on that buffer.                                                     */
/* -------------------------------------------------------------------- */
    double      dfValue;
    int         nError;
    char        szWorkBuffer[PJ_STRTOD_WORK_BUFFER_SIZE];

    char*       pszNumber = replace_point_by_locale_point(nptr, '.', szWorkBuffer);

    dfValue = strtod( pszNumber, endptr );
    nError = errno;

    if ( endptr )
        *endptr = (char *)nptr + (*endptr - pszNumber);

    if (pszNumber != (char*) nptr && pszNumber != szWorkBuffer )
        free( pszNumber );

    errno = nError;
    return dfValue;
<<<<<<< HEAD
>>>>>>> 360db021b (Merge pull request #3524 from cffk/merid-update-fix)
>>>>>>> 3771d4aec1 (Merge pull request #3524 from cffk/merid-update-fix)
=======
>>>>>>> locationtech-main
}
