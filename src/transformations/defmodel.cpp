/******************************************************************************
 * Project:  PROJ
 * Purpose:  Functionality related to deformation model
 * Author:   Even Rouault, <even.rouault at spatialys.com>
 *
 ******************************************************************************
 * Copyright (c) 2020, Even Rouault, <even.rouault at spatialys.com>
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

#define PJ_LIB_
#define PROJ_COMPILATION

#include "defmodel.hpp"
#include "filemanager.hpp"
#include "grids.hpp"
#include "proj_internal.h"

#include <assert.h>

#include <map>
#include <memory>
#include <utility>

PROJ_HEAD(defmodel, "Deformation model");

using namespace DeformationModel;

namespace {

struct Grid : public GridPrototype {
    PJ_CONTEXT *ctx;
    const NS_PROJ::GenericShiftGrid *realGrid;
    mutable bool checkedHorizontal = false;
    mutable bool checkedVertical = false;
    mutable int sampleX = 0;
    mutable int sampleY = 1;
    mutable int sampleZ = 2;

    Grid(PJ_CONTEXT *ctxIn, const NS_PROJ::GenericShiftGrid *realGridIn)
        : ctx(ctxIn), realGrid(realGridIn) {
        minx = realGridIn->extentAndRes().west;
        miny = realGridIn->extentAndRes().south;
        resx = realGridIn->extentAndRes().resX;
        resy = realGridIn->extentAndRes().resY;
        width = realGridIn->width();
        height = realGridIn->height();
    }

    bool checkHorizontal(const std::string &expectedUnit) const {
        if (!checkedHorizontal) {
            const auto samplesPerPixel = realGrid->samplesPerPixel();
            if (samplesPerPixel < 2) {
                pj_log(ctx, PJ_LOG_ERROR, "grid %s has not enough samples",
                       realGrid->name().c_str());
                return false;
            }
            bool foundDescX = false;
            bool foundDescY = false;
            bool foundDesc = false;
            for (int i = 0; i < samplesPerPixel; i++) {
                const auto desc = realGrid->description(i);
                if (desc == "east_offset") {
                    sampleX = i;
                    foundDescX = true;
                } else if (desc == "north_offset") {
                    sampleY = i;
                    foundDescY = true;
                }
                if (!desc.empty()) {
                    foundDesc = true;
                }
            }
            if (foundDesc && (!foundDescX || !foundDescY)) {
                pj_log(ctx, PJ_LOG_ERROR,
                       "grid %s : Found band description, "
                       "but not the ones expected",
                       realGrid->name().c_str());
                return false;
            }
            const auto unit = realGrid->unit(sampleX);
            if (!unit.empty() && unit != expectedUnit) {
                pj_log(ctx, PJ_LOG_ERROR,
                       "grid %s : Only unit=%s "
                       "currently handled for this mode",
                       realGrid->name().c_str(), expectedUnit.c_str());
                return false;
            }
            checkedHorizontal = true;
        }
        return true;
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
>>>>>>> 3771d4aec1 (Merge pull request #3524 from cffk/merid-update-fix)
=======
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
<<<<<<< HEAD
<<<<<<< HEAD
<<<<<<< HEAD
<<<<<<< HEAD
<<<<<<< HEAD
<<<<<<< HEAD
<<<<<<< HEAD
<<<<<<< HEAD
<<<<<<< HEAD
<<<<<<< HEAD
<<<<<<< HEAD
<<<<<<< HEAD
<<<<<<< HEAD
<<<<<<< HEAD
<<<<<<< HEAD
<<<<<<< HEAD
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
>>>>>>> locatelli-main
<<<<<<< HEAD
=======
>>>>>>> ebd1587dc5 (Merge pull request #3524 from cffk/merid-update-fix)
=======
<<<<<<< HEAD
<<<<<<< HEAD
<<<<<<< HEAD
<<<<<<< HEAD
<<<<<<< HEAD
<<<<<<< HEAD
<<<<<<< HEAD
<<<<<<< HEAD
>>>>>>> 3771d4aec1 (Merge pull request #3524 from cffk/merid-update-fix)
=======
>>>>>>> c63e6e91bd (Merge pull request #3524 from cffk/merid-update-fix)
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
=======
>>>>>>> ebd1587dc5 (Merge pull request #3524 from cffk/merid-update-fix)
=======
>>>>>>> locatelli-main
=======
=======
>>>>>>> ebd1587dc5 (Merge pull request #3524 from cffk/merid-update-fix)
=======
>>>>>>> locatelli-main
=======
=======
>>>>>>> ebd1587dc5 (Merge pull request #3524 from cffk/merid-update-fix)
=======
>>>>>>> locatelli-main
=======
=======
>>>>>>> ebd1587dc5 (Merge pull request #3524 from cffk/merid-update-fix)
=======
>>>>>>> locatelli-main
=======
=======
>>>>>>> ebd1587dc5 (Merge pull request #3524 from cffk/merid-update-fix)
=======
>>>>>>> locatelli-main
=======
=======
>>>>>>> ebd1587dc5 (Merge pull request #3524 from cffk/merid-update-fix)
=======
>>>>>>> locatelli-main
=======
=======
>>>>>>> ebd1587dc5 (Merge pull request #3524 from cffk/merid-update-fix)
=======
>>>>>>> locatelli-main
=======
=======
>>>>>>> ebd1587dc5 (Merge pull request #3524 from cffk/merid-update-fix)
=======
>>>>>>> locatelli-main
=======
=======
>>>>>>> ebd1587dc5 (Merge pull request #3524 from cffk/merid-update-fix)
=======
>>>>>>> locatelli-main
=======
=======
>>>>>>> ebd1587dc5 (Merge pull request #3524 from cffk/merid-update-fix)
=======
>>>>>>> locatelli-main
=======
=======
>>>>>>> ebd1587dc5 (Merge pull request #3524 from cffk/merid-update-fix)
=======
>>>>>>> locatelli-main
=======
=======
>>>>>>> ebd1587dc5 (Merge pull request #3524 from cffk/merid-update-fix)
=======
>>>>>>> locatelli-main
=======
=======
>>>>>>> ebd1587dc5 (Merge pull request #3524 from cffk/merid-update-fix)
=======
>>>>>>> locatelli-main
=======
=======
>>>>>>> ebd1587dc5 (Merge pull request #3524 from cffk/merid-update-fix)
=======
>>>>>>> locatelli-main
=======
=======
>>>>>>> ebd1587dc5 (Merge pull request #3524 from cffk/merid-update-fix)
=======
>>>>>>> locatelli-main
=======
=======
>>>>>>> ebd1587dc5 (Merge pull request #3524 from cffk/merid-update-fix)
=======
>>>>>>> locatelli-main
=======
=======
>>>>>>> ebd1587dc5 (Merge pull request #3524 from cffk/merid-update-fix)
=======
>>>>>>> locatelli-main
=======
=======
>>>>>>> ebd1587dc5 (Merge pull request #3524 from cffk/merid-update-fix)
=======
>>>>>>> locatelli-main
=======
=======
>>>>>>> ebd1587dc5 (Merge pull request #3524 from cffk/merid-update-fix)
=======
>>>>>>> locatelli-main
=======
=======
>>>>>>> ebd1587dc5 (Merge pull request #3524 from cffk/merid-update-fix)
=======
>>>>>>> locatelli-main
=======
=======
>>>>>>> ebd1587dc5 (Merge pull request #3524 from cffk/merid-update-fix)
=======
>>>>>>> locatelli-main
=======
=======
>>>>>>> ebd1587dc5 (Merge pull request #3524 from cffk/merid-update-fix)
=======
>>>>>>> locatelli-main
=======
=======
>>>>>>> ebd1587dc5 (Merge pull request #3524 from cffk/merid-update-fix)
=======
>>>>>>> locatelli-main
=======
=======
>>>>>>> ebd1587dc5 (Merge pull request #3524 from cffk/merid-update-fix)
=======
>>>>>>> locatelli-main
=======
=======
>>>>>>> ebd1587dc5 (Merge pull request #3524 from cffk/merid-update-fix)
=======
>>>>>>> locatelli-main
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
<<<<<<< HEAD
<<<<<<< HEAD
<<<<<<< HEAD
<<<<<<< HEAD
<<<<<<< HEAD
<<<<<<< HEAD
<<<<<<< HEAD
<<<<<<< HEAD
<<<<<<< HEAD
<<<<<<< HEAD
<<<<<<< HEAD
<<<<<<< HEAD
<<<<<<< HEAD
<<<<<<< HEAD
<<<<<<< HEAD
<<<<<<< HEAD
<<<<<<< HEAD
<<<<<<< HEAD
<<<<<<< HEAD
<<<<<<< HEAD
<<<<<<< HEAD
<<<<<<< HEAD
<<<<<<< HEAD
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
>>>>>>> 10b5e77237 (Merge pull request #3524 from cffk/merid-update-fix)
=======
>>>>>>> 74eac2217b (typo fixes)
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
=======
>>>>>>> 25ac262782 (Merge pull request #3524 from cffk/merid-update-fix)
>>>>>>> locatelli-main
=======
<<<<<<< HEAD
=======
>>>>>>> 25ac262782 (Merge pull request #3524 from cffk/merid-update-fix)
>>>>>>> locatelli-main
=======
>>>>>>> 25ac262782 (Merge pull request #3524 from cffk/merid-update-fix)
>>>>>>> locatelli-main
=======
>>>>>>> 25ac262782 (Merge pull request #3524 from cffk/merid-update-fix)
>>>>>>> locatelli-main
=======
>>>>>>> 25ac262782 (Merge pull request #3524 from cffk/merid-update-fix)
>>>>>>> locatelli-main
=======
>>>>>>> 25ac262782 (Merge pull request #3524 from cffk/merid-update-fix)
>>>>>>> locatelli-main
=======
>>>>>>> 25ac262782 (Merge pull request #3524 from cffk/merid-update-fix)
>>>>>>> locatelli-main
=======
>>>>>>> 25ac262782 (Merge pull request #3524 from cffk/merid-update-fix)
>>>>>>> locatelli-main
=======
>>>>>>> 25ac262782 (Merge pull request #3524 from cffk/merid-update-fix)
>>>>>>> locatelli-main
=======
>>>>>>> 25ac262782 (Merge pull request #3524 from cffk/merid-update-fix)
>>>>>>> locatelli-main
=======
>>>>>>> 25ac262782 (Merge pull request #3524 from cffk/merid-update-fix)
>>>>>>> locatelli-main
=======
>>>>>>> 25ac262782 (Merge pull request #3524 from cffk/merid-update-fix)
>>>>>>> locatelli-main
=======
>>>>>>> 25ac262782 (Merge pull request #3524 from cffk/merid-update-fix)
>>>>>>> locatelli-main
=======
>>>>>>> 25ac262782 (Merge pull request #3524 from cffk/merid-update-fix)
>>>>>>> locatelli-main
=======
>>>>>>> 25ac262782 (Merge pull request #3524 from cffk/merid-update-fix)
>>>>>>> locatelli-main
=======
>>>>>>> 25ac262782 (Merge pull request #3524 from cffk/merid-update-fix)
>>>>>>> locatelli-main
=======
>>>>>>> 25ac262782 (Merge pull request #3524 from cffk/merid-update-fix)
>>>>>>> locatelli-main
=======
>>>>>>> 25ac262782 (Merge pull request #3524 from cffk/merid-update-fix)
>>>>>>> locatelli-main
=======
>>>>>>> 25ac262782 (Merge pull request #3524 from cffk/merid-update-fix)
>>>>>>> locatelli-main
=======
>>>>>>> 25ac262782 (Merge pull request #3524 from cffk/merid-update-fix)
>>>>>>> locatelli-main
=======
>>>>>>> 25ac262782 (Merge pull request #3524 from cffk/merid-update-fix)
>>>>>>> locatelli-main
=======
>>>>>>> 25ac262782 (Merge pull request #3524 from cffk/merid-update-fix)
>>>>>>> locatelli-main
=======
>>>>>>> 25ac262782 (Merge pull request #3524 from cffk/merid-update-fix)
>>>>>>> locatelli-main
=======
>>>>>>> 25ac262782 (Merge pull request #3524 from cffk/merid-update-fix)
>>>>>>> locatelli-main
=======
>>>>>>> 25ac262782 (Merge pull request #3524 from cffk/merid-update-fix)
>>>>>>> locatelli-main
=======
>>>>>>> 25ac262782 (Merge pull request #3524 from cffk/merid-update-fix)
>>>>>>> locatelli-main
=======
>>>>>>> 25ac262782 (Merge pull request #3524 from cffk/merid-update-fix)
>>>>>>> locatelli-main
=======
>>>>>>> 25ac262782 (Merge pull request #3524 from cffk/merid-update-fix)
>>>>>>> locatelli-main
=======
>>>>>>> 25ac262782 (Merge pull request #3524 from cffk/merid-update-fix)
>>>>>>> locatelli-main
=======
>>>>>>> 25ac262782 (Merge pull request #3524 from cffk/merid-update-fix)
>>>>>>> locatelli-main
=======
>>>>>>> 25ac262782 (Merge pull request #3524 from cffk/merid-update-fix)
>>>>>>> locatelli-main
=======
>>>>>>> 25ac262782 (Merge pull request #3524 from cffk/merid-update-fix)
>>>>>>> locatelli-main
=======
>>>>>>> 25ac262782 (Merge pull request #3524 from cffk/merid-update-fix)
>>>>>>> locatelli-main
=======
=======
>>>>>>> 3771d4aec1 (Merge pull request #3524 from cffk/merid-update-fix)
>>>>>>> c8fb3456cf (Merge pull request #3524 from cffk/merid-update-fix)
<<<<<<< HEAD
<<<<<<< HEAD
<<<<<<< HEAD
<<<<<<< HEAD
<<<<<<< HEAD
<<<<<<< HEAD
<<<<<<< HEAD
<<<<<<< HEAD
<<<<<<< HEAD
<<<<<<< HEAD
<<<<<<< HEAD
<<<<<<< HEAD
<<<<<<< HEAD
<<<<<<< HEAD
<<<<<<< HEAD
<<<<<<< HEAD
<<<<<<< HEAD
<<<<<<< HEAD
<<<<<<< HEAD
<<<<<<< HEAD
<<<<<<< HEAD
<<<<<<< HEAD
<<<<<<< HEAD
<<<<<<< HEAD
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
<<<<<<< HEAD
<<<<<<< HEAD
<<<<<<< HEAD
<<<<<<< HEAD
<<<<<<< HEAD
<<<<<<< HEAD
<<<<<<< HEAD
<<<<<<< HEAD
<<<<<<< HEAD
<<<<<<< HEAD
<<<<<<< HEAD
<<<<<<< HEAD
<<<<<<< HEAD
<<<<<<< HEAD
<<<<<<< HEAD
<<<<<<< HEAD
<<<<<<< HEAD
<<<<<<< HEAD
<<<<<<< HEAD
<<<<<<< HEAD
<<<<<<< HEAD
<<<<<<< HEAD
<<<<<<< HEAD
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
    bool getLongLatOffset(int ix, int iy, double &longOffsetRadian,
                          double &latOffsetRadian) const {
        if (!checkHorizontal(STR_DEGREE)) {
            return false;
        }
        float longOffsetDeg;
        float latOffsetDeg;
        if (!realGrid->valueAt(ix, iy, sampleX, longOffsetDeg) ||
            !realGrid->valueAt(ix, iy, sampleY, latOffsetDeg)) {
            return false;
        }
        longOffsetRadian = longOffsetDeg * DEG_TO_RAD;
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
<<<<<<< HEAD
<<<<<<< HEAD
<<<<<<< HEAD
<<<<<<< HEAD
<<<<<<< HEAD
<<<<<<< HEAD
<<<<<<< HEAD
<<<<<<< HEAD
<<<<<<< HEAD
<<<<<<< HEAD
<<<<<<< HEAD
<<<<<<< HEAD
<<<<<<< HEAD
<<<<<<< HEAD
<<<<<<< HEAD
<<<<<<< HEAD
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
>>>>>>> locatelli-main
<<<<<<< HEAD
=======
>>>>>>> locatelli-main
=======
>>>>>>> locatelli-main
<<<<<<< HEAD
<<<<<<< HEAD
=======
>>>>>>> c8fb3456cf (Merge pull request #3524 from cffk/merid-update-fix)
<<<<<<< HEAD
<<<<<<< HEAD
<<<<<<< HEAD
>>>>>>> locationtech-main
=======
=======
>>>>>>> locatelli-main
=======
=======
>>>>>>> c8fb3456cf (Merge pull request #3524 from cffk/merid-update-fix)
>>>>>>> locatelli-main
=======
=======
>>>>>>> c8fb3456cf (Merge pull request #3524 from cffk/merid-update-fix)
>>>>>>> locatelli-main
=======
=======
>>>>>>> c8fb3456cf (Merge pull request #3524 from cffk/merid-update-fix)
>>>>>>> locatelli-main
=======
<<<<<<< HEAD
<<<<<<< HEAD
<<<<<<< HEAD
=======
>>>>>>> c8fb3456cf (Merge pull request #3524 from cffk/merid-update-fix)
>>>>>>> locatelli-main
=======
>>>>>>> locatelli-main
=======
<<<<<<< HEAD
=======
>>>>>>> c8fb3456cf (Merge pull request #3524 from cffk/merid-update-fix)
>>>>>>> locatelli-main
=======
>>>>>>> c8fb3456cf (Merge pull request #3524 from cffk/merid-update-fix)
>>>>>>> locatelli-main
=======
>>>>>>> c8fb3456cf (Merge pull request #3524 from cffk/merid-update-fix)
>>>>>>> locatelli-main
=======
>>>>>>> c8fb3456cf (Merge pull request #3524 from cffk/merid-update-fix)
>>>>>>> locatelli-main
=======
>>>>>>> c8fb3456cf (Merge pull request #3524 from cffk/merid-update-fix)
>>>>>>> locatelli-main
=======
>>>>>>> c8fb3456cf (Merge pull request #3524 from cffk/merid-update-fix)
>>>>>>> locatelli-main
=======
>>>>>>> c8fb3456cf (Merge pull request #3524 from cffk/merid-update-fix)
>>>>>>> locatelli-main
=======
>>>>>>> c8fb3456cf (Merge pull request #3524 from cffk/merid-update-fix)
>>>>>>> locatelli-main
=======
>>>>>>> c8fb3456cf (Merge pull request #3524 from cffk/merid-update-fix)
>>>>>>> locatelli-main
=======
>>>>>>> c8fb3456cf (Merge pull request #3524 from cffk/merid-update-fix)
>>>>>>> locatelli-main
=======
>>>>>>> c8fb3456cf (Merge pull request #3524 from cffk/merid-update-fix)
>>>>>>> locatelli-main
=======
>>>>>>> c8fb3456cf (Merge pull request #3524 from cffk/merid-update-fix)
>>>>>>> locatelli-main
=======
>>>>>>> c8fb3456cf (Merge pull request #3524 from cffk/merid-update-fix)
>>>>>>> locatelli-main
=======
>>>>>>> c8fb3456cf (Merge pull request #3524 from cffk/merid-update-fix)
>>>>>>> locatelli-main
=======
>>>>>>> c8fb3456cf (Merge pull request #3524 from cffk/merid-update-fix)
>>>>>>> locatelli-main
=======
>>>>>>> c8fb3456cf (Merge pull request #3524 from cffk/merid-update-fix)
>>>>>>> locatelli-main
=======
>>>>>>> c8fb3456cf (Merge pull request #3524 from cffk/merid-update-fix)
>>>>>>> locatelli-main
=======
>>>>>>> c8fb3456cf (Merge pull request #3524 from cffk/merid-update-fix)
>>>>>>> locatelli-main
=======
>>>>>>> c8fb3456cf (Merge pull request #3524 from cffk/merid-update-fix)
>>>>>>> locatelli-main
=======
>>>>>>> c8fb3456cf (Merge pull request #3524 from cffk/merid-update-fix)
>>>>>>> locatelli-main
=======
>>>>>>> c8fb3456cf (Merge pull request #3524 from cffk/merid-update-fix)
>>>>>>> locatelli-main
=======
>>>>>>> c8fb3456cf (Merge pull request #3524 from cffk/merid-update-fix)
>>>>>>> locatelli-main
=======
>>>>>>> c8fb3456cf (Merge pull request #3524 from cffk/merid-update-fix)
>>>>>>> locatelli-main
=======
>>>>>>> c8fb3456cf (Merge pull request #3524 from cffk/merid-update-fix)
>>>>>>> locatelli-main
=======
>>>>>>> c8fb3456cf (Merge pull request #3524 from cffk/merid-update-fix)
>>>>>>> locatelli-main
=======
>>>>>>> c8fb3456cf (Merge pull request #3524 from cffk/merid-update-fix)
>>>>>>> locatelli-main
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
<<<<<<< HEAD
<<<<<<< HEAD
<<<<<<< HEAD
<<<<<<< HEAD
<<<<<<< HEAD
<<<<<<< HEAD
<<<<<<< HEAD
<<<<<<< HEAD
<<<<<<< HEAD
<<<<<<< HEAD
<<<<<<< HEAD
<<<<<<< HEAD
<<<<<<< HEAD
<<<<<<< HEAD
<<<<<<< HEAD
<<<<<<< HEAD
<<<<<<< HEAD
<<<<<<< HEAD
<<<<<<< HEAD
<<<<<<< HEAD
<<<<<<< HEAD
<<<<<<< HEAD
<<<<<<< HEAD
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
>>>>>>> 748ccdbcc6 (Merge pull request #3524 from cffk/merid-update-fix)
    bool getLonLatOffset(int ix, int iy, double &lonOffsetRadian,
                         double &latOffsetRadian) const {
=======
    bool getLongLatOffset(int ix, int iy, double &longOffsetRadian,
                          double &latOffsetRadian) const {
>>>>>>> e4a6fd6d75 (typo fixes)
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
>>>>>>> locationtech-main
=======
<<<<<<< HEAD
<<<<<<< HEAD
=======
>>>>>>> 48ae38528d (typo fixes)
>>>>>>> locatelli-main
=======
<<<<<<< HEAD
=======
>>>>>>> 48ae38528d (typo fixes)
>>>>>>> locatelli-main
=======
>>>>>>> 48ae38528d (typo fixes)
>>>>>>> locatelli-main
=======
>>>>>>> 48ae38528d (typo fixes)
>>>>>>> locatelli-main
=======
>>>>>>> 48ae38528d (typo fixes)
>>>>>>> locatelli-main
=======
>>>>>>> 48ae38528d (typo fixes)
>>>>>>> locatelli-main
=======
>>>>>>> 48ae38528d (typo fixes)
>>>>>>> locatelli-main
=======
>>>>>>> 48ae38528d (typo fixes)
>>>>>>> locatelli-main
=======
>>>>>>> 48ae38528d (typo fixes)
>>>>>>> locatelli-main
=======
>>>>>>> 48ae38528d (typo fixes)
>>>>>>> locatelli-main
=======
>>>>>>> 48ae38528d (typo fixes)
>>>>>>> locatelli-main
=======
>>>>>>> 48ae38528d (typo fixes)
>>>>>>> locatelli-main
=======
>>>>>>> 48ae38528d (typo fixes)
>>>>>>> locatelli-main
=======
>>>>>>> 48ae38528d (typo fixes)
>>>>>>> locatelli-main
=======
>>>>>>> 48ae38528d (typo fixes)
>>>>>>> locatelli-main
=======
>>>>>>> 48ae38528d (typo fixes)
>>>>>>> locatelli-main
=======
>>>>>>> 48ae38528d (typo fixes)
>>>>>>> locatelli-main
=======
>>>>>>> 48ae38528d (typo fixes)
>>>>>>> locatelli-main
=======
>>>>>>> 48ae38528d (typo fixes)
>>>>>>> locatelli-main
=======
>>>>>>> 48ae38528d (typo fixes)
>>>>>>> locatelli-main
=======
>>>>>>> 48ae38528d (typo fixes)
>>>>>>> locatelli-main
=======
>>>>>>> 48ae38528d (typo fixes)
>>>>>>> locatelli-main
=======
>>>>>>> 48ae38528d (typo fixes)
>>>>>>> locatelli-main
=======
>>>>>>> 48ae38528d (typo fixes)
>>>>>>> locatelli-main
=======
>>>>>>> 48ae38528d (typo fixes)
>>>>>>> locatelli-main
=======
>>>>>>> 48ae38528d (typo fixes)
>>>>>>> locatelli-main
=======
>>>>>>> 48ae38528d (typo fixes)
>>>>>>> locatelli-main
=======
>>>>>>> 48ae38528d (typo fixes)
>>>>>>> locatelli-main
=======
>>>>>>> 48ae38528d (typo fixes)
>>>>>>> locatelli-main
=======
>>>>>>> 48ae38528d (typo fixes)
>>>>>>> locatelli-main
=======
>>>>>>> 48ae38528d (typo fixes)
>>>>>>> locatelli-main
=======
>>>>>>> 48ae38528d (typo fixes)
>>>>>>> locatelli-main
=======
>>>>>>> 48ae38528d (typo fixes)
>>>>>>> locatelli-main
        if (!checkHorizontal(STR_DEGREE)) {
            return false;
        }
        float longOffsetDeg;
        float latOffsetDeg;
        if (!realGrid->valueAt(ix, iy, sampleX, longOffsetDeg) ||
            !realGrid->valueAt(ix, iy, sampleY, latOffsetDeg)) {
            return false;
        }
<<<<<<< HEAD
        lonOffsetRadian = lonOffsetDeg * DEG_TO_RAD;
<<<<<<< HEAD
<<<<<<< HEAD
<<<<<<< HEAD
<<<<<<< HEAD
<<<<<<< HEAD
<<<<<<< HEAD
<<<<<<< HEAD
<<<<<<< HEAD
<<<<<<< HEAD
<<<<<<< HEAD
<<<<<<< HEAD
<<<<<<< HEAD
<<<<<<< HEAD
<<<<<<< HEAD
<<<<<<< HEAD
<<<<<<< HEAD
<<<<<<< HEAD
<<<<<<< HEAD
<<<<<<< HEAD
<<<<<<< HEAD
<<<<<<< HEAD
<<<<<<< HEAD
<<<<<<< HEAD
<<<<<<< HEAD
<<<<<<< HEAD
<<<<<<< HEAD
<<<<<<< HEAD
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
>>>>>>> 748ccdbcc6 (Merge pull request #3524 from cffk/merid-update-fix)
=======
        longOffsetRadian = longOffsetDeg * DEG_TO_RAD;
>>>>>>> e4a6fd6d75 (typo fixes)
=======
=======
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
        longOffsetRadian = longOffsetDeg * DEG_TO_RAD;
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
<<<<<<< HEAD
<<<<<<< HEAD
<<<<<<< HEAD
<<<<<<< HEAD
<<<<<<< HEAD
<<<<<<< HEAD
<<<<<<< HEAD
<<<<<<< HEAD
<<<<<<< HEAD
<<<<<<< HEAD
<<<<<<< HEAD
<<<<<<< HEAD
<<<<<<< HEAD
<<<<<<< HEAD
<<<<<<< HEAD
<<<<<<< HEAD
<<<<<<< HEAD
<<<<<<< HEAD
<<<<<<< HEAD
<<<<<<< HEAD
<<<<<<< HEAD
<<<<<<< HEAD
<<<<<<< HEAD
<<<<<<< HEAD
<<<<<<< HEAD
<<<<<<< HEAD
<<<<<<< HEAD
<<<<<<< HEAD
>>>>>>> 153df87aaa (Merge pull request #3524 from cffk/merid-update-fix)
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
>>>>>>> 25ac262782 (Merge pull request #3524 from cffk/merid-update-fix)
=======
>>>>>>> dbc4ff68b0 (Merge pull request #3524 from cffk/merid-update-fix)
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
>>>>>>> 25ac262782 (Merge pull request #3524 from cffk/merid-update-fix)
=======
>>>>>>> dbc4ff68b0 (Merge pull request #3524 from cffk/merid-update-fix)
>>>>>>> locatelli-main
=======
>>>>>>> 25ac262782 (Merge pull request #3524 from cffk/merid-update-fix)
=======
>>>>>>> dbc4ff68b0 (Merge pull request #3524 from cffk/merid-update-fix)
>>>>>>> locatelli-main
=======
>>>>>>> 25ac262782 (Merge pull request #3524 from cffk/merid-update-fix)
=======
>>>>>>> dbc4ff68b0 (Merge pull request #3524 from cffk/merid-update-fix)
>>>>>>> locatelli-main
=======
>>>>>>> 25ac262782 (Merge pull request #3524 from cffk/merid-update-fix)
=======
>>>>>>> dbc4ff68b0 (Merge pull request #3524 from cffk/merid-update-fix)
>>>>>>> locatelli-main
=======
>>>>>>> 25ac262782 (Merge pull request #3524 from cffk/merid-update-fix)
=======
>>>>>>> dbc4ff68b0 (Merge pull request #3524 from cffk/merid-update-fix)
>>>>>>> locatelli-main
=======
>>>>>>> 25ac262782 (Merge pull request #3524 from cffk/merid-update-fix)
=======
>>>>>>> dbc4ff68b0 (Merge pull request #3524 from cffk/merid-update-fix)
>>>>>>> locatelli-main
=======
>>>>>>> 25ac262782 (Merge pull request #3524 from cffk/merid-update-fix)
=======
>>>>>>> dbc4ff68b0 (Merge pull request #3524 from cffk/merid-update-fix)
>>>>>>> locatelli-main
=======
>>>>>>> 25ac262782 (Merge pull request #3524 from cffk/merid-update-fix)
=======
>>>>>>> dbc4ff68b0 (Merge pull request #3524 from cffk/merid-update-fix)
>>>>>>> locatelli-main
=======
>>>>>>> 25ac262782 (Merge pull request #3524 from cffk/merid-update-fix)
=======
>>>>>>> dbc4ff68b0 (Merge pull request #3524 from cffk/merid-update-fix)
>>>>>>> locatelli-main
=======
>>>>>>> 25ac262782 (Merge pull request #3524 from cffk/merid-update-fix)
=======
>>>>>>> dbc4ff68b0 (Merge pull request #3524 from cffk/merid-update-fix)
>>>>>>> locatelli-main
=======
>>>>>>> 25ac262782 (Merge pull request #3524 from cffk/merid-update-fix)
=======
>>>>>>> dbc4ff68b0 (Merge pull request #3524 from cffk/merid-update-fix)
>>>>>>> locatelli-main
=======
>>>>>>> 25ac262782 (Merge pull request #3524 from cffk/merid-update-fix)
=======
>>>>>>> dbc4ff68b0 (Merge pull request #3524 from cffk/merid-update-fix)
>>>>>>> locatelli-main
=======
>>>>>>> 25ac262782 (Merge pull request #3524 from cffk/merid-update-fix)
=======
>>>>>>> dbc4ff68b0 (Merge pull request #3524 from cffk/merid-update-fix)
>>>>>>> locatelli-main
=======
>>>>>>> 25ac262782 (Merge pull request #3524 from cffk/merid-update-fix)
=======
>>>>>>> dbc4ff68b0 (Merge pull request #3524 from cffk/merid-update-fix)
>>>>>>> locatelli-main
=======
>>>>>>> 25ac262782 (Merge pull request #3524 from cffk/merid-update-fix)
=======
>>>>>>> dbc4ff68b0 (Merge pull request #3524 from cffk/merid-update-fix)
>>>>>>> locatelli-main
=======
>>>>>>> 25ac262782 (Merge pull request #3524 from cffk/merid-update-fix)
=======
>>>>>>> dbc4ff68b0 (Merge pull request #3524 from cffk/merid-update-fix)
>>>>>>> locatelli-main
=======
>>>>>>> 25ac262782 (Merge pull request #3524 from cffk/merid-update-fix)
=======
>>>>>>> dbc4ff68b0 (Merge pull request #3524 from cffk/merid-update-fix)
>>>>>>> locatelli-main
=======
>>>>>>> 25ac262782 (Merge pull request #3524 from cffk/merid-update-fix)
=======
>>>>>>> dbc4ff68b0 (Merge pull request #3524 from cffk/merid-update-fix)
>>>>>>> locatelli-main
=======
>>>>>>> 25ac262782 (Merge pull request #3524 from cffk/merid-update-fix)
=======
>>>>>>> dbc4ff68b0 (Merge pull request #3524 from cffk/merid-update-fix)
>>>>>>> locatelli-main
=======
>>>>>>> 25ac262782 (Merge pull request #3524 from cffk/merid-update-fix)
=======
>>>>>>> dbc4ff68b0 (Merge pull request #3524 from cffk/merid-update-fix)
>>>>>>> locatelli-main
=======
>>>>>>> 25ac262782 (Merge pull request #3524 from cffk/merid-update-fix)
=======
>>>>>>> dbc4ff68b0 (Merge pull request #3524 from cffk/merid-update-fix)
>>>>>>> locatelli-main
=======
>>>>>>> 25ac262782 (Merge pull request #3524 from cffk/merid-update-fix)
=======
>>>>>>> dbc4ff68b0 (Merge pull request #3524 from cffk/merid-update-fix)
>>>>>>> locatelli-main
=======
>>>>>>> 25ac262782 (Merge pull request #3524 from cffk/merid-update-fix)
=======
>>>>>>> dbc4ff68b0 (Merge pull request #3524 from cffk/merid-update-fix)
>>>>>>> locatelli-main
=======
>>>>>>> 25ac262782 (Merge pull request #3524 from cffk/merid-update-fix)
=======
>>>>>>> dbc4ff68b0 (Merge pull request #3524 from cffk/merid-update-fix)
>>>>>>> locatelli-main
=======
>>>>>>> 25ac262782 (Merge pull request #3524 from cffk/merid-update-fix)
=======
>>>>>>> dbc4ff68b0 (Merge pull request #3524 from cffk/merid-update-fix)
>>>>>>> locatelli-main
=======
>>>>>>> 25ac262782 (Merge pull request #3524 from cffk/merid-update-fix)
=======
>>>>>>> dbc4ff68b0 (Merge pull request #3524 from cffk/merid-update-fix)
>>>>>>> locatelli-main
=======
>>>>>>> 25ac262782 (Merge pull request #3524 from cffk/merid-update-fix)
=======
>>>>>>> dbc4ff68b0 (Merge pull request #3524 from cffk/merid-update-fix)
>>>>>>> locatelli-main
=======
>>>>>>> 25ac262782 (Merge pull request #3524 from cffk/merid-update-fix)
=======
>>>>>>> dbc4ff68b0 (Merge pull request #3524 from cffk/merid-update-fix)
>>>>>>> locatelli-main
=======
>>>>>>> 153df87aaa (Merge pull request #3524 from cffk/merid-update-fix)
=======
>>>>>>> b609c280f5 (Merge pull request #3524 from cffk/merid-update-fix)
<<<<<<< HEAD
<<<<<<< HEAD
<<<<<<< HEAD
<<<<<<< HEAD
<<<<<<< HEAD
<<<<<<< HEAD
<<<<<<< HEAD
<<<<<<< HEAD
<<<<<<< HEAD
<<<<<<< HEAD
<<<<<<< HEAD
<<<<<<< HEAD
<<<<<<< HEAD
<<<<<<< HEAD
<<<<<<< HEAD
<<<<<<< HEAD
<<<<<<< HEAD
<<<<<<< HEAD
<<<<<<< HEAD
<<<<<<< HEAD
<<<<<<< HEAD
<<<<<<< HEAD
<<<<<<< HEAD
<<<<<<< HEAD
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
    bool getLonLatOffset(int ix, int iy, double &lonOffsetRadian,
                         double &latOffsetRadian) const {
=======
    bool getLongLatOffset(int ix, int iy, double &longOffsetRadian,
                          double &latOffsetRadian) const {
>>>>>>> 86ade66356 (typo fixes)
        if (!checkHorizontal(STR_DEGREE)) {
            return false;
        }
        float longOffsetDeg;
        float latOffsetDeg;
        if (!realGrid->valueAt(ix, iy, sampleX, longOffsetDeg) ||
            !realGrid->valueAt(ix, iy, sampleY, latOffsetDeg)) {
            return false;
        }
<<<<<<< HEAD
        lonOffsetRadian = lonOffsetDeg * DEG_TO_RAD;
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
        longOffsetRadian = longOffsetDeg * DEG_TO_RAD;
>>>>>>> 86ade66356 (typo fixes)
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
<<<<<<< HEAD
<<<<<<< HEAD
<<<<<<< HEAD
<<<<<<< HEAD
<<<<<<< HEAD
<<<<<<< HEAD
<<<<<<< HEAD
<<<<<<< HEAD
<<<<<<< HEAD
<<<<<<< HEAD
<<<<<<< HEAD
<<<<<<< HEAD
<<<<<<< HEAD
<<<<<<< HEAD
<<<<<<< HEAD
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
>>>>>>> f00ffe609e (Merge pull request #3524 from cffk/merid-update-fix)
>>>>>>> locatelli-main
=======
<<<<<<< HEAD
=======
>>>>>>> f00ffe609e (Merge pull request #3524 from cffk/merid-update-fix)
>>>>>>> locatelli-main
=======
>>>>>>> f00ffe609e (Merge pull request #3524 from cffk/merid-update-fix)
>>>>>>> locatelli-main
=======
>>>>>>> f00ffe609e (Merge pull request #3524 from cffk/merid-update-fix)
>>>>>>> locatelli-main
=======
>>>>>>> f00ffe609e (Merge pull request #3524 from cffk/merid-update-fix)
>>>>>>> locatelli-main
=======
>>>>>>> f00ffe609e (Merge pull request #3524 from cffk/merid-update-fix)
>>>>>>> locatelli-main
=======
>>>>>>> f00ffe609e (Merge pull request #3524 from cffk/merid-update-fix)
>>>>>>> locatelli-main
=======
>>>>>>> f00ffe609e (Merge pull request #3524 from cffk/merid-update-fix)
>>>>>>> locatelli-main
=======
>>>>>>> f00ffe609e (Merge pull request #3524 from cffk/merid-update-fix)
>>>>>>> locatelli-main
=======
>>>>>>> f00ffe609e (Merge pull request #3524 from cffk/merid-update-fix)
>>>>>>> locatelli-main
=======
>>>>>>> f00ffe609e (Merge pull request #3524 from cffk/merid-update-fix)
>>>>>>> locatelli-main
=======
>>>>>>> f00ffe609e (Merge pull request #3524 from cffk/merid-update-fix)
>>>>>>> locatelli-main
=======
>>>>>>> f00ffe609e (Merge pull request #3524 from cffk/merid-update-fix)
>>>>>>> locatelli-main
=======
>>>>>>> f00ffe609e (Merge pull request #3524 from cffk/merid-update-fix)
>>>>>>> locatelli-main
=======
>>>>>>> f00ffe609e (Merge pull request #3524 from cffk/merid-update-fix)
>>>>>>> locatelli-main
=======
>>>>>>> f00ffe609e (Merge pull request #3524 from cffk/merid-update-fix)
>>>>>>> locatelli-main
=======
>>>>>>> f00ffe609e (Merge pull request #3524 from cffk/merid-update-fix)
>>>>>>> locatelli-main
=======
>>>>>>> f00ffe609e (Merge pull request #3524 from cffk/merid-update-fix)
>>>>>>> locatelli-main
=======
>>>>>>> f00ffe609e (Merge pull request #3524 from cffk/merid-update-fix)
>>>>>>> locatelli-main
=======
>>>>>>> f00ffe609e (Merge pull request #3524 from cffk/merid-update-fix)
>>>>>>> locatelli-main
=======
>>>>>>> f00ffe609e (Merge pull request #3524 from cffk/merid-update-fix)
>>>>>>> locatelli-main
=======
>>>>>>> f00ffe609e (Merge pull request #3524 from cffk/merid-update-fix)
>>>>>>> locatelli-main
=======
>>>>>>> f00ffe609e (Merge pull request #3524 from cffk/merid-update-fix)
>>>>>>> locatelli-main
=======
>>>>>>> f00ffe609e (Merge pull request #3524 from cffk/merid-update-fix)
>>>>>>> locatelli-main
=======
>>>>>>> f00ffe609e (Merge pull request #3524 from cffk/merid-update-fix)
>>>>>>> locatelli-main
=======
>>>>>>> f00ffe609e (Merge pull request #3524 from cffk/merid-update-fix)
>>>>>>> locatelli-main
=======
>>>>>>> f00ffe609e (Merge pull request #3524 from cffk/merid-update-fix)
>>>>>>> locatelli-main
=======
>>>>>>> f00ffe609e (Merge pull request #3524 from cffk/merid-update-fix)
>>>>>>> locatelli-main
=======
>>>>>>> f00ffe609e (Merge pull request #3524 from cffk/merid-update-fix)
>>>>>>> locatelli-main
=======
>>>>>>> f00ffe609e (Merge pull request #3524 from cffk/merid-update-fix)
>>>>>>> locatelli-main
=======
>>>>>>> f00ffe609e (Merge pull request #3524 from cffk/merid-update-fix)
>>>>>>> locatelli-main
=======
>>>>>>> f00ffe609e (Merge pull request #3524 from cffk/merid-update-fix)
>>>>>>> locatelli-main
=======
>>>>>>> f00ffe609e (Merge pull request #3524 from cffk/merid-update-fix)
>>>>>>> locatelli-main
=======
=======
>>>>>>> 748ccdbcc6 (Merge pull request #3524 from cffk/merid-update-fix)
>>>>>>> 10b5e77237 (Merge pull request #3524 from cffk/merid-update-fix)
<<<<<<< HEAD
<<<<<<< HEAD
<<<<<<< HEAD
<<<<<<< HEAD
<<<<<<< HEAD
<<<<<<< HEAD
<<<<<<< HEAD
<<<<<<< HEAD
<<<<<<< HEAD
<<<<<<< HEAD
<<<<<<< HEAD
<<<<<<< HEAD
<<<<<<< HEAD
<<<<<<< HEAD
<<<<<<< HEAD
<<<<<<< HEAD
<<<<<<< HEAD
<<<<<<< HEAD
<<<<<<< HEAD
<<<<<<< HEAD
<<<<<<< HEAD
<<<<<<< HEAD
<<<<<<< HEAD
<<<<<<< HEAD
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
    bool getLonLatOffset(int ix, int iy, double &lonOffsetRadian,
                         double &latOffsetRadian) const {
=======
>>>>>>> 74eac2217b (typo fixes)
        if (!checkHorizontal(STR_DEGREE)) {
            return false;
        }
        float longOffsetDeg;
        float latOffsetDeg;
        if (!realGrid->valueAt(ix, iy, sampleX, longOffsetDeg) ||
            !realGrid->valueAt(ix, iy, sampleY, latOffsetDeg)) {
            return false;
        }
<<<<<<< HEAD
        lonOffsetRadian = lonOffsetDeg * DEG_TO_RAD;
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
        longOffsetRadian = longOffsetDeg * DEG_TO_RAD;
>>>>>>> e4a6fd6d75 (typo fixes)
>>>>>>> aa21c6fa76 (typo fixes)
>>>>>>> 74eac2217b (typo fixes)
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
<<<<<<< HEAD
<<<<<<< HEAD
<<<<<<< HEAD
<<<<<<< HEAD
<<<<<<< HEAD
<<<<<<< HEAD
<<<<<<< HEAD
<<<<<<< HEAD
<<<<<<< HEAD
<<<<<<< HEAD
<<<<<<< HEAD
<<<<<<< HEAD
<<<<<<< HEAD
<<<<<<< HEAD
<<<<<<< HEAD
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
>>>>>>> dbc4ff68b0 (Merge pull request #3524 from cffk/merid-update-fix)
>>>>>>> locatelli-main
=======
<<<<<<< HEAD
=======
>>>>>>> dbc4ff68b0 (Merge pull request #3524 from cffk/merid-update-fix)
>>>>>>> locatelli-main
=======
>>>>>>> dbc4ff68b0 (Merge pull request #3524 from cffk/merid-update-fix)
>>>>>>> locatelli-main
=======
>>>>>>> dbc4ff68b0 (Merge pull request #3524 from cffk/merid-update-fix)
>>>>>>> locatelli-main
=======
>>>>>>> dbc4ff68b0 (Merge pull request #3524 from cffk/merid-update-fix)
>>>>>>> locatelli-main
=======
>>>>>>> dbc4ff68b0 (Merge pull request #3524 from cffk/merid-update-fix)
>>>>>>> locatelli-main
=======
>>>>>>> dbc4ff68b0 (Merge pull request #3524 from cffk/merid-update-fix)
>>>>>>> locatelli-main
=======
>>>>>>> dbc4ff68b0 (Merge pull request #3524 from cffk/merid-update-fix)
>>>>>>> locatelli-main
=======
>>>>>>> dbc4ff68b0 (Merge pull request #3524 from cffk/merid-update-fix)
>>>>>>> locatelli-main
=======
>>>>>>> dbc4ff68b0 (Merge pull request #3524 from cffk/merid-update-fix)
>>>>>>> locatelli-main
=======
>>>>>>> dbc4ff68b0 (Merge pull request #3524 from cffk/merid-update-fix)
>>>>>>> locatelli-main
=======
>>>>>>> dbc4ff68b0 (Merge pull request #3524 from cffk/merid-update-fix)
>>>>>>> locatelli-main
=======
>>>>>>> dbc4ff68b0 (Merge pull request #3524 from cffk/merid-update-fix)
>>>>>>> locatelli-main
=======
>>>>>>> dbc4ff68b0 (Merge pull request #3524 from cffk/merid-update-fix)
>>>>>>> locatelli-main
=======
>>>>>>> dbc4ff68b0 (Merge pull request #3524 from cffk/merid-update-fix)
>>>>>>> locatelli-main
=======
>>>>>>> dbc4ff68b0 (Merge pull request #3524 from cffk/merid-update-fix)
>>>>>>> locatelli-main
=======
>>>>>>> dbc4ff68b0 (Merge pull request #3524 from cffk/merid-update-fix)
>>>>>>> locatelli-main
=======
>>>>>>> dbc4ff68b0 (Merge pull request #3524 from cffk/merid-update-fix)
>>>>>>> locatelli-main
=======
>>>>>>> dbc4ff68b0 (Merge pull request #3524 from cffk/merid-update-fix)
>>>>>>> locatelli-main
=======
>>>>>>> dbc4ff68b0 (Merge pull request #3524 from cffk/merid-update-fix)
>>>>>>> locatelli-main
=======
>>>>>>> dbc4ff68b0 (Merge pull request #3524 from cffk/merid-update-fix)
>>>>>>> locatelli-main
=======
>>>>>>> dbc4ff68b0 (Merge pull request #3524 from cffk/merid-update-fix)
>>>>>>> locatelli-main
=======
>>>>>>> dbc4ff68b0 (Merge pull request #3524 from cffk/merid-update-fix)
>>>>>>> locatelli-main
=======
>>>>>>> dbc4ff68b0 (Merge pull request #3524 from cffk/merid-update-fix)
>>>>>>> locatelli-main
=======
>>>>>>> dbc4ff68b0 (Merge pull request #3524 from cffk/merid-update-fix)
>>>>>>> locatelli-main
=======
>>>>>>> dbc4ff68b0 (Merge pull request #3524 from cffk/merid-update-fix)
>>>>>>> locatelli-main
=======
>>>>>>> dbc4ff68b0 (Merge pull request #3524 from cffk/merid-update-fix)
>>>>>>> locatelli-main
=======
>>>>>>> dbc4ff68b0 (Merge pull request #3524 from cffk/merid-update-fix)
>>>>>>> locatelli-main
=======
>>>>>>> dbc4ff68b0 (Merge pull request #3524 from cffk/merid-update-fix)
>>>>>>> locatelli-main
=======
>>>>>>> dbc4ff68b0 (Merge pull request #3524 from cffk/merid-update-fix)
>>>>>>> locatelli-main
=======
>>>>>>> dbc4ff68b0 (Merge pull request #3524 from cffk/merid-update-fix)
>>>>>>> locatelli-main
=======
>>>>>>> dbc4ff68b0 (Merge pull request #3524 from cffk/merid-update-fix)
>>>>>>> locatelli-main
=======
>>>>>>> dbc4ff68b0 (Merge pull request #3524 from cffk/merid-update-fix)
>>>>>>> locatelli-main
=======
=======
>>>>>>> 153df87aaa (Merge pull request #3524 from cffk/merid-update-fix)
>>>>>>> ebd1587dc5 (Merge pull request #3524 from cffk/merid-update-fix)
<<<<<<< HEAD
<<<<<<< HEAD
<<<<<<< HEAD
<<<<<<< HEAD
<<<<<<< HEAD
<<<<<<< HEAD
<<<<<<< HEAD
<<<<<<< HEAD
<<<<<<< HEAD
<<<<<<< HEAD
<<<<<<< HEAD
<<<<<<< HEAD
<<<<<<< HEAD
<<<<<<< HEAD
<<<<<<< HEAD
<<<<<<< HEAD
<<<<<<< HEAD
<<<<<<< HEAD
<<<<<<< HEAD
<<<<<<< HEAD
<<<<<<< HEAD
<<<<<<< HEAD
<<<<<<< HEAD
<<<<<<< HEAD
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
>>>>>>> 0a2f6458d1 (Merge pull request #3524 from cffk/merid-update-fix)
=======
>>>>>>> locationtech-main
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
>>>>>>> 208fcbd5e7 (Merge pull request #3524 from cffk/merid-update-fix)
    bool getLonLatOffset(int ix, int iy, double &lonOffsetRadian,
                         double &latOffsetRadian) const {
=======
    bool getLongLatOffset(int ix, int iy, double &longOffsetRadian,
                          double &latOffsetRadian) const {
>>>>>>> bf1dfe8af6 (typo fixes)
        if (!checkHorizontal(STR_DEGREE)) {
            return false;
        }
        float longOffsetDeg;
        float latOffsetDeg;
        if (!realGrid->valueAt(ix, iy, sampleX, longOffsetDeg) ||
            !realGrid->valueAt(ix, iy, sampleY, latOffsetDeg)) {
            return false;
        }
<<<<<<< HEAD
        lonOffsetRadian = lonOffsetDeg * DEG_TO_RAD;
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
        longOffsetRadian = longOffsetDeg * DEG_TO_RAD;
>>>>>>> bf1dfe8af6 (typo fixes)
=======
=======
=======
>>>>>>> 748ccdbcc6 (Merge pull request #3524 from cffk/merid-update-fix)
>>>>>>> bb15f534d5 (Merge pull request #3524 from cffk/merid-update-fix)
    bool getLonLatOffset(int ix, int iy, double &lonOffsetRadian,
                         double &latOffsetRadian) const {
=======
>>>>>>> a4391c6673 (typo fixes)
        if (!checkHorizontal(STR_DEGREE)) {
            return false;
        }
        float longOffsetDeg;
        float latOffsetDeg;
        if (!realGrid->valueAt(ix, iy, sampleX, longOffsetDeg) ||
            !realGrid->valueAt(ix, iy, sampleY, latOffsetDeg)) {
            return false;
        }
<<<<<<< HEAD
        lonOffsetRadian = lonOffsetDeg * DEG_TO_RAD;
<<<<<<< HEAD
>>>>>>> 360db021b6 (Merge pull request #3524 from cffk/merid-update-fix)
<<<<<<< HEAD
>>>>>>> a029d873e8 (Merge pull request #3524 from cffk/merid-update-fix)
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
>>>>>>> bb15f534d5 (Merge pull request #3524 from cffk/merid-update-fix)
=======
=======
=======
        longOffsetRadian = longOffsetDeg * DEG_TO_RAD;
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
    bool getLonLatOffset(int ix, int iy, double &lonOffsetRadian,
                         double &latOffsetRadian) const {
=======
    bool getLongLatOffset(int ix, int iy, double &longOffsetRadian,
                          double &latOffsetRadian) const {
>>>>>>> 86ade66356 (typo fixes)
        if (!checkHorizontal(STR_DEGREE)) {
            return false;
        }
        float longOffsetDeg;
        float latOffsetDeg;
        if (!realGrid->valueAt(ix, iy, sampleX, longOffsetDeg) ||
            !realGrid->valueAt(ix, iy, sampleY, latOffsetDeg)) {
            return false;
        }
<<<<<<< HEAD
        lonOffsetRadian = lonOffsetDeg * DEG_TO_RAD;
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
        longOffsetRadian = longOffsetDeg * DEG_TO_RAD;
>>>>>>> 86ade66356 (typo fixes)
>>>>>>> d8e8090c80 (typo fixes)
=======
=======
>>>>>>> f00ffe609e (Merge pull request #3524 from cffk/merid-update-fix)
    bool getLonLatOffset(int ix, int iy, double &lonOffsetRadian,
                         double &latOffsetRadian) const {
=======
>>>>>>> 74eac2217b (typo fixes)
        if (!checkHorizontal(STR_DEGREE)) {
            return false;
        }
        float longOffsetDeg;
        float latOffsetDeg;
        if (!realGrid->valueAt(ix, iy, sampleX, longOffsetDeg) ||
            !realGrid->valueAt(ix, iy, sampleY, latOffsetDeg)) {
            return false;
        }
<<<<<<< HEAD
        lonOffsetRadian = lonOffsetDeg * DEG_TO_RAD;
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
        longOffsetRadian = longOffsetDeg * DEG_TO_RAD;
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
<<<<<<< HEAD
<<<<<<< HEAD
<<<<<<< HEAD
<<<<<<< HEAD
<<<<<<< HEAD
<<<<<<< HEAD
<<<<<<< HEAD
<<<<<<< HEAD
<<<<<<< HEAD
<<<<<<< HEAD
<<<<<<< HEAD
<<<<<<< HEAD
<<<<<<< HEAD
<<<<<<< HEAD
<<<<<<< HEAD
<<<<<<< HEAD
<<<<<<< HEAD
<<<<<<< HEAD
<<<<<<< HEAD
<<<<<<< HEAD
<<<<<<< HEAD
<<<<<<< HEAD
<<<<<<< HEAD
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
    bool getLonLatOffset(int ix, int iy, double &lonOffsetRadian,
                         double &latOffsetRadian) const {
        if (!checkHorizontal(STR_DEGREE)) {
            return false;
        }
        float lonOffsetDeg;
        float latOffsetDeg;
        if (!realGrid->valueAt(ix, iy, sampleX, lonOffsetDeg) ||
            !realGrid->valueAt(ix, iy, sampleY, latOffsetDeg)) {
            return false;
        }
        lonOffsetRadian = lonOffsetDeg * DEG_TO_RAD;
<<<<<<< HEAD
<<<<<<< HEAD
<<<<<<< HEAD
>>>>>>> 360db021b (Merge pull request #3524 from cffk/merid-update-fix)
>>>>>>> 3771d4aec1 (Merge pull request #3524 from cffk/merid-update-fix)
<<<<<<< HEAD
<<<<<<< HEAD
<<<<<<< HEAD
<<<<<<< HEAD
<<<<<<< HEAD
<<<<<<< HEAD
<<<<<<< HEAD
<<<<<<< HEAD
<<<<<<< HEAD
<<<<<<< HEAD
<<<<<<< HEAD
<<<<<<< HEAD
<<<<<<< HEAD
<<<<<<< HEAD
<<<<<<< HEAD
<<<<<<< HEAD
<<<<<<< HEAD
<<<<<<< HEAD
<<<<<<< HEAD
<<<<<<< HEAD
<<<<<<< HEAD
<<<<<<< HEAD
<<<<<<< HEAD
<<<<<<< HEAD
<<<<<<< HEAD
<<<<<<< HEAD
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
>>>>>>> b5f4d47b2b (Merge pull request #3524 from cffk/merid-update-fix)
=======
>>>>>>> 153df87aaa (Merge pull request #3524 from cffk/merid-update-fix)
>>>>>>> location-main
=======
>>>>>>> b5f4d47b2b (Merge pull request #3524 from cffk/merid-update-fix)
<<<<<<< HEAD
>>>>>>> c8fb3456cf (Merge pull request #3524 from cffk/merid-update-fix)
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
>>>>>>> b5f4d47b2b (Merge pull request #3524 from cffk/merid-update-fix)
<<<<<<< HEAD
>>>>>>> c8fb3456cf (Merge pull request #3524 from cffk/merid-update-fix)
<<<<<<< HEAD
>>>>>>> 25ac262782 (Merge pull request #3524 from cffk/merid-update-fix)
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
=======
>>>>>>> 153df87aaa (Merge pull request #3524 from cffk/merid-update-fix)
>>>>>>> ebd1587dc5 (Merge pull request #3524 from cffk/merid-update-fix)
<<<<<<< HEAD
<<<<<<< HEAD
<<<<<<< HEAD
<<<<<<< HEAD
<<<<<<< HEAD
<<<<<<< HEAD
<<<<<<< HEAD
<<<<<<< HEAD
<<<<<<< HEAD
<<<<<<< HEAD
<<<<<<< HEAD
<<<<<<< HEAD
<<<<<<< HEAD
<<<<<<< HEAD
<<<<<<< HEAD
<<<<<<< HEAD
<<<<<<< HEAD
<<<<<<< HEAD
<<<<<<< HEAD
<<<<<<< HEAD
<<<<<<< HEAD
<<<<<<< HEAD
<<<<<<< HEAD
<<<<<<< HEAD
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
>>>>>>> 0a2f6458d1 (Merge pull request #3524 from cffk/merid-update-fix)
=======
>>>>>>> locationtech-main
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
>>>>>>> dbc4ff68b0 (Merge pull request #3524 from cffk/merid-update-fix)
=======
>>>>>>> locationtech-main
=======
>>>>>>> 0a2f6458d1 (Merge pull request #3524 from cffk/merid-update-fix)
>>>>>>> 885e4882b8 (Merge pull request #3524 from cffk/merid-update-fix)
=======
>>>>>>> 0a2f6458d1 (Merge pull request #3524 from cffk/merid-update-fix)
<<<<<<< HEAD
<<<<<<< HEAD
<<<<<<< HEAD
<<<<<<< HEAD
<<<<<<< HEAD
<<<<<<< HEAD
<<<<<<< HEAD
<<<<<<< HEAD
<<<<<<< HEAD
<<<<<<< HEAD
<<<<<<< HEAD
<<<<<<< HEAD
<<<<<<< HEAD
<<<<<<< HEAD
<<<<<<< HEAD
<<<<<<< HEAD
<<<<<<< HEAD
<<<<<<< HEAD
<<<<<<< HEAD
<<<<<<< HEAD
<<<<<<< HEAD
<<<<<<< HEAD
<<<<<<< HEAD
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
        latOffsetRadian = latOffsetDeg * DEG_TO_RAD;
        return true;
    }

    bool getZOffset(int ix, int iy, double &zOffset) const {
        if (!checkedVertical) {
            const auto samplesPerPixel = realGrid->samplesPerPixel();
            if (samplesPerPixel == 1) {
                sampleZ = 0;
            } else if (samplesPerPixel < 3) {
                pj_log(ctx, PJ_LOG_ERROR, "grid %s has not enough samples",
                       realGrid->name().c_str());
                return false;
            }
            bool foundDesc = false;
            bool foundDescZ = false;
            for (int i = 0; i < samplesPerPixel; i++) {
                const auto desc = realGrid->description(i);
                if (desc == "vertical_offset") {
                    sampleZ = i;
                    foundDescZ = true;
                }
                if (!desc.empty()) {
                    foundDesc = true;
                }
            }
            if (foundDesc && !foundDescZ) {
                pj_log(ctx, PJ_LOG_ERROR,
                       "grid %s : Found band description, "
                       "but not the ones expected",
                       realGrid->name().c_str());
                return false;
            }
            const auto unit = realGrid->unit(sampleZ);
            if (!unit.empty() && unit != STR_METRE) {
                pj_log(ctx, PJ_LOG_ERROR,
                       "grid %s : Only unit=metre currently "
                       "handled for this mode",
                       realGrid->name().c_str());
                return false;
            }
            checkedVertical = true;
        }
        float zOffsetFloat = 0.0f;
        const bool ret = realGrid->valueAt(ix, iy, sampleZ, zOffsetFloat);
        zOffset = zOffsetFloat;
        return ret;
    }

    bool getEastingNorthingOffset(int ix, int iy, double &eastingOffset,
                                  double &northingOffset) const {
        if (!checkHorizontal(STR_METRE)) {
            return false;
        }
        float eastingOffsetFloat = 0.0f;
        float northingOffsetFloat = 0.0f;
        const bool ret =
            realGrid->valueAt(ix, iy, sampleX, eastingOffsetFloat) &&
            realGrid->valueAt(ix, iy, sampleY, northingOffsetFloat);
        eastingOffset = eastingOffsetFloat;
        northingOffset = northingOffsetFloat;
        return ret;
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
>>>>>>> 3771d4aec1 (Merge pull request #3524 from cffk/merid-update-fix)
=======
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
<<<<<<< HEAD
<<<<<<< HEAD
<<<<<<< HEAD
<<<<<<< HEAD
<<<<<<< HEAD
<<<<<<< HEAD
<<<<<<< HEAD
<<<<<<< HEAD
<<<<<<< HEAD
<<<<<<< HEAD
<<<<<<< HEAD
<<<<<<< HEAD
<<<<<<< HEAD
<<<<<<< HEAD
<<<<<<< HEAD
<<<<<<< HEAD
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
>>>>>>> locatelli-main
<<<<<<< HEAD
=======
>>>>>>> ebd1587dc5 (Merge pull request #3524 from cffk/merid-update-fix)
=======
<<<<<<< HEAD
<<<<<<< HEAD
<<<<<<< HEAD
<<<<<<< HEAD
<<<<<<< HEAD
<<<<<<< HEAD
<<<<<<< HEAD
<<<<<<< HEAD
>>>>>>> 3771d4aec1 (Merge pull request #3524 from cffk/merid-update-fix)
=======
>>>>>>> c63e6e91bd (Merge pull request #3524 from cffk/merid-update-fix)
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
=======
>>>>>>> ebd1587dc5 (Merge pull request #3524 from cffk/merid-update-fix)
=======
>>>>>>> locatelli-main
=======
=======
>>>>>>> ebd1587dc5 (Merge pull request #3524 from cffk/merid-update-fix)
=======
>>>>>>> locatelli-main
=======
=======
>>>>>>> ebd1587dc5 (Merge pull request #3524 from cffk/merid-update-fix)
=======
>>>>>>> locatelli-main
=======
=======
>>>>>>> ebd1587dc5 (Merge pull request #3524 from cffk/merid-update-fix)
=======
>>>>>>> locatelli-main
=======
=======
>>>>>>> ebd1587dc5 (Merge pull request #3524 from cffk/merid-update-fix)
=======
>>>>>>> locatelli-main
=======
=======
>>>>>>> ebd1587dc5 (Merge pull request #3524 from cffk/merid-update-fix)
=======
>>>>>>> locatelli-main
=======
=======
>>>>>>> ebd1587dc5 (Merge pull request #3524 from cffk/merid-update-fix)
=======
>>>>>>> locatelli-main
=======
=======
>>>>>>> ebd1587dc5 (Merge pull request #3524 from cffk/merid-update-fix)
=======
>>>>>>> locatelli-main
=======
=======
>>>>>>> ebd1587dc5 (Merge pull request #3524 from cffk/merid-update-fix)
=======
>>>>>>> locatelli-main
=======
=======
>>>>>>> ebd1587dc5 (Merge pull request #3524 from cffk/merid-update-fix)
=======
>>>>>>> locatelli-main
=======
=======
>>>>>>> ebd1587dc5 (Merge pull request #3524 from cffk/merid-update-fix)
=======
>>>>>>> locatelli-main
=======
=======
>>>>>>> ebd1587dc5 (Merge pull request #3524 from cffk/merid-update-fix)
=======
>>>>>>> locatelli-main
=======
=======
>>>>>>> ebd1587dc5 (Merge pull request #3524 from cffk/merid-update-fix)
=======
>>>>>>> locatelli-main
=======
=======
>>>>>>> ebd1587dc5 (Merge pull request #3524 from cffk/merid-update-fix)
=======
>>>>>>> locatelli-main
=======
=======
>>>>>>> ebd1587dc5 (Merge pull request #3524 from cffk/merid-update-fix)
=======
>>>>>>> locatelli-main
=======
=======
>>>>>>> ebd1587dc5 (Merge pull request #3524 from cffk/merid-update-fix)
=======
>>>>>>> locatelli-main
=======
=======
>>>>>>> ebd1587dc5 (Merge pull request #3524 from cffk/merid-update-fix)
=======
>>>>>>> locatelli-main
=======
=======
>>>>>>> ebd1587dc5 (Merge pull request #3524 from cffk/merid-update-fix)
=======
>>>>>>> locatelli-main
=======
=======
>>>>>>> ebd1587dc5 (Merge pull request #3524 from cffk/merid-update-fix)
=======
>>>>>>> locatelli-main
=======
=======
>>>>>>> ebd1587dc5 (Merge pull request #3524 from cffk/merid-update-fix)
=======
>>>>>>> locatelli-main
=======
=======
>>>>>>> ebd1587dc5 (Merge pull request #3524 from cffk/merid-update-fix)
=======
>>>>>>> locatelli-main
=======
=======
>>>>>>> ebd1587dc5 (Merge pull request #3524 from cffk/merid-update-fix)
=======
>>>>>>> locatelli-main
=======
=======
>>>>>>> ebd1587dc5 (Merge pull request #3524 from cffk/merid-update-fix)
=======
>>>>>>> locatelli-main
=======
=======
>>>>>>> ebd1587dc5 (Merge pull request #3524 from cffk/merid-update-fix)
=======
>>>>>>> locatelli-main
=======
=======
>>>>>>> ebd1587dc5 (Merge pull request #3524 from cffk/merid-update-fix)
=======
>>>>>>> locatelli-main
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
<<<<<<< HEAD
<<<<<<< HEAD
<<<<<<< HEAD
<<<<<<< HEAD
<<<<<<< HEAD
<<<<<<< HEAD
<<<<<<< HEAD
<<<<<<< HEAD
<<<<<<< HEAD
<<<<<<< HEAD
<<<<<<< HEAD
<<<<<<< HEAD
<<<<<<< HEAD
<<<<<<< HEAD
<<<<<<< HEAD
<<<<<<< HEAD
<<<<<<< HEAD
<<<<<<< HEAD
<<<<<<< HEAD
<<<<<<< HEAD
<<<<<<< HEAD
<<<<<<< HEAD
<<<<<<< HEAD
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
>>>>>>> 10b5e77237 (Merge pull request #3524 from cffk/merid-update-fix)
=======
>>>>>>> 74eac2217b (typo fixes)
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
=======
>>>>>>> 25ac262782 (Merge pull request #3524 from cffk/merid-update-fix)
>>>>>>> locatelli-main
=======
<<<<<<< HEAD
=======
>>>>>>> 25ac262782 (Merge pull request #3524 from cffk/merid-update-fix)
>>>>>>> locatelli-main
=======
>>>>>>> 25ac262782 (Merge pull request #3524 from cffk/merid-update-fix)
>>>>>>> locatelli-main
=======
>>>>>>> 25ac262782 (Merge pull request #3524 from cffk/merid-update-fix)
>>>>>>> locatelli-main
=======
>>>>>>> 25ac262782 (Merge pull request #3524 from cffk/merid-update-fix)
>>>>>>> locatelli-main
=======
>>>>>>> 25ac262782 (Merge pull request #3524 from cffk/merid-update-fix)
>>>>>>> locatelli-main
=======
>>>>>>> 25ac262782 (Merge pull request #3524 from cffk/merid-update-fix)
>>>>>>> locatelli-main
=======
>>>>>>> 25ac262782 (Merge pull request #3524 from cffk/merid-update-fix)
>>>>>>> locatelli-main
=======
>>>>>>> 25ac262782 (Merge pull request #3524 from cffk/merid-update-fix)
>>>>>>> locatelli-main
=======
>>>>>>> 25ac262782 (Merge pull request #3524 from cffk/merid-update-fix)
>>>>>>> locatelli-main
=======
>>>>>>> 25ac262782 (Merge pull request #3524 from cffk/merid-update-fix)
>>>>>>> locatelli-main
=======
>>>>>>> 25ac262782 (Merge pull request #3524 from cffk/merid-update-fix)
>>>>>>> locatelli-main
=======
>>>>>>> 25ac262782 (Merge pull request #3524 from cffk/merid-update-fix)
>>>>>>> locatelli-main
=======
>>>>>>> 25ac262782 (Merge pull request #3524 from cffk/merid-update-fix)
>>>>>>> locatelli-main
=======
>>>>>>> 25ac262782 (Merge pull request #3524 from cffk/merid-update-fix)
>>>>>>> locatelli-main
=======
>>>>>>> 25ac262782 (Merge pull request #3524 from cffk/merid-update-fix)
>>>>>>> locatelli-main
=======
>>>>>>> 25ac262782 (Merge pull request #3524 from cffk/merid-update-fix)
>>>>>>> locatelli-main
=======
>>>>>>> 25ac262782 (Merge pull request #3524 from cffk/merid-update-fix)
>>>>>>> locatelli-main
=======
>>>>>>> 25ac262782 (Merge pull request #3524 from cffk/merid-update-fix)
>>>>>>> locatelli-main
=======
>>>>>>> 25ac262782 (Merge pull request #3524 from cffk/merid-update-fix)
>>>>>>> locatelli-main
=======
>>>>>>> 25ac262782 (Merge pull request #3524 from cffk/merid-update-fix)
>>>>>>> locatelli-main
=======
>>>>>>> 25ac262782 (Merge pull request #3524 from cffk/merid-update-fix)
>>>>>>> locatelli-main
=======
>>>>>>> 25ac262782 (Merge pull request #3524 from cffk/merid-update-fix)
>>>>>>> locatelli-main
=======
>>>>>>> 25ac262782 (Merge pull request #3524 from cffk/merid-update-fix)
>>>>>>> locatelli-main
=======
>>>>>>> 25ac262782 (Merge pull request #3524 from cffk/merid-update-fix)
>>>>>>> locatelli-main
=======
>>>>>>> 25ac262782 (Merge pull request #3524 from cffk/merid-update-fix)
>>>>>>> locatelli-main
=======
>>>>>>> 25ac262782 (Merge pull request #3524 from cffk/merid-update-fix)
>>>>>>> locatelli-main
=======
>>>>>>> 25ac262782 (Merge pull request #3524 from cffk/merid-update-fix)
>>>>>>> locatelli-main
=======
>>>>>>> 25ac262782 (Merge pull request #3524 from cffk/merid-update-fix)
>>>>>>> locatelli-main
=======
>>>>>>> 25ac262782 (Merge pull request #3524 from cffk/merid-update-fix)
>>>>>>> locatelli-main
=======
>>>>>>> 25ac262782 (Merge pull request #3524 from cffk/merid-update-fix)
>>>>>>> locatelli-main
=======
>>>>>>> 25ac262782 (Merge pull request #3524 from cffk/merid-update-fix)
>>>>>>> locatelli-main
=======
>>>>>>> 25ac262782 (Merge pull request #3524 from cffk/merid-update-fix)
>>>>>>> locatelli-main
=======
=======
>>>>>>> 3771d4aec1 (Merge pull request #3524 from cffk/merid-update-fix)
>>>>>>> c8fb3456cf (Merge pull request #3524 from cffk/merid-update-fix)
<<<<<<< HEAD
<<<<<<< HEAD
<<<<<<< HEAD
<<<<<<< HEAD
<<<<<<< HEAD
<<<<<<< HEAD
<<<<<<< HEAD
<<<<<<< HEAD
<<<<<<< HEAD
<<<<<<< HEAD
<<<<<<< HEAD
<<<<<<< HEAD
<<<<<<< HEAD
<<<<<<< HEAD
<<<<<<< HEAD
<<<<<<< HEAD
<<<<<<< HEAD
<<<<<<< HEAD
<<<<<<< HEAD
<<<<<<< HEAD
<<<<<<< HEAD
<<<<<<< HEAD
<<<<<<< HEAD
<<<<<<< HEAD
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
<<<<<<< HEAD
<<<<<<< HEAD
<<<<<<< HEAD
<<<<<<< HEAD
<<<<<<< HEAD
<<<<<<< HEAD
<<<<<<< HEAD
<<<<<<< HEAD
<<<<<<< HEAD
<<<<<<< HEAD
<<<<<<< HEAD
<<<<<<< HEAD
<<<<<<< HEAD
<<<<<<< HEAD
<<<<<<< HEAD
<<<<<<< HEAD
<<<<<<< HEAD
<<<<<<< HEAD
<<<<<<< HEAD
<<<<<<< HEAD
<<<<<<< HEAD
<<<<<<< HEAD
<<<<<<< HEAD
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
    bool getLongLatZOffset(int ix, int iy, double &longOffsetRadian,
                           double &latOffsetRadian, double &zOffset) const {
        return getLongLatOffset(ix, iy, longOffsetRadian, latOffsetRadian) &&
=======
    bool getLonLatZOffset(int ix, int iy, double &lonOffsetRadian,
                          double &latOffsetRadian, double &zOffset) const {
        return getLonLatOffset(ix, iy, lonOffsetRadian, latOffsetRadian) &&
<<<<<<< HEAD
<<<<<<< HEAD
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
>>>>>>> locatelli-main
=======
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
>>>>>>> locatelli-main
<<<<<<< HEAD
=======
>>>>>>> locatelli-main
=======
<<<<<<< HEAD
>>>>>>> locatelli-main
=======
>>>>>>> locatelli-main
<<<<<<< HEAD
<<<<<<< HEAD
=======
>>>>>>> c8fb3456cf (Merge pull request #3524 from cffk/merid-update-fix)
<<<<<<< HEAD
<<<<<<< HEAD
<<<<<<< HEAD
<<<<<<< HEAD
>>>>>>> locationtech-main
=======
=======
>>>>>>> locatelli-main
=======
=======
>>>>>>> c8fb3456cf (Merge pull request #3524 from cffk/merid-update-fix)
>>>>>>> locatelli-main
=======
=======
>>>>>>> c8fb3456cf (Merge pull request #3524 from cffk/merid-update-fix)
>>>>>>> locatelli-main
=======
=======
>>>>>>> c8fb3456cf (Merge pull request #3524 from cffk/merid-update-fix)
>>>>>>> locatelli-main
=======
>>>>>>> locatelli-main
=======
>>>>>>> locatelli-main
=======
<<<<<<< HEAD
=======
>>>>>>> c8fb3456cf (Merge pull request #3524 from cffk/merid-update-fix)
>>>>>>> locatelli-main
=======
>>>>>>> c8fb3456cf (Merge pull request #3524 from cffk/merid-update-fix)
>>>>>>> locatelli-main
=======
>>>>>>> c8fb3456cf (Merge pull request #3524 from cffk/merid-update-fix)
>>>>>>> locatelli-main
=======
>>>>>>> c8fb3456cf (Merge pull request #3524 from cffk/merid-update-fix)
>>>>>>> locatelli-main
=======
>>>>>>> c8fb3456cf (Merge pull request #3524 from cffk/merid-update-fix)
>>>>>>> locatelli-main
=======
>>>>>>> c8fb3456cf (Merge pull request #3524 from cffk/merid-update-fix)
>>>>>>> locatelli-main
=======
>>>>>>> c8fb3456cf (Merge pull request #3524 from cffk/merid-update-fix)
>>>>>>> locatelli-main
=======
>>>>>>> c8fb3456cf (Merge pull request #3524 from cffk/merid-update-fix)
>>>>>>> locatelli-main
=======
>>>>>>> c8fb3456cf (Merge pull request #3524 from cffk/merid-update-fix)
>>>>>>> locatelli-main
=======
>>>>>>> c8fb3456cf (Merge pull request #3524 from cffk/merid-update-fix)
>>>>>>> locatelli-main
=======
>>>>>>> c8fb3456cf (Merge pull request #3524 from cffk/merid-update-fix)
>>>>>>> locatelli-main
=======
>>>>>>> c8fb3456cf (Merge pull request #3524 from cffk/merid-update-fix)
>>>>>>> locatelli-main
=======
>>>>>>> c8fb3456cf (Merge pull request #3524 from cffk/merid-update-fix)
>>>>>>> locatelli-main
=======
>>>>>>> c8fb3456cf (Merge pull request #3524 from cffk/merid-update-fix)
>>>>>>> locatelli-main
=======
>>>>>>> c8fb3456cf (Merge pull request #3524 from cffk/merid-update-fix)
>>>>>>> locatelli-main
=======
>>>>>>> c8fb3456cf (Merge pull request #3524 from cffk/merid-update-fix)
>>>>>>> locatelli-main
=======
>>>>>>> c8fb3456cf (Merge pull request #3524 from cffk/merid-update-fix)
>>>>>>> locatelli-main
=======
>>>>>>> c8fb3456cf (Merge pull request #3524 from cffk/merid-update-fix)
>>>>>>> locatelli-main
=======
>>>>>>> c8fb3456cf (Merge pull request #3524 from cffk/merid-update-fix)
>>>>>>> locatelli-main
=======
>>>>>>> c8fb3456cf (Merge pull request #3524 from cffk/merid-update-fix)
>>>>>>> locatelli-main
=======
>>>>>>> c8fb3456cf (Merge pull request #3524 from cffk/merid-update-fix)
>>>>>>> locatelli-main
=======
>>>>>>> c8fb3456cf (Merge pull request #3524 from cffk/merid-update-fix)
>>>>>>> locatelli-main
=======
>>>>>>> c8fb3456cf (Merge pull request #3524 from cffk/merid-update-fix)
>>>>>>> locatelli-main
=======
>>>>>>> c8fb3456cf (Merge pull request #3524 from cffk/merid-update-fix)
>>>>>>> locatelli-main
=======
>>>>>>> c8fb3456cf (Merge pull request #3524 from cffk/merid-update-fix)
>>>>>>> locatelli-main
=======
>>>>>>> c8fb3456cf (Merge pull request #3524 from cffk/merid-update-fix)
>>>>>>> locatelli-main
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
<<<<<<< HEAD
<<<<<<< HEAD
<<<<<<< HEAD
<<<<<<< HEAD
<<<<<<< HEAD
<<<<<<< HEAD
<<<<<<< HEAD
<<<<<<< HEAD
<<<<<<< HEAD
<<<<<<< HEAD
<<<<<<< HEAD
<<<<<<< HEAD
<<<<<<< HEAD
<<<<<<< HEAD
<<<<<<< HEAD
<<<<<<< HEAD
<<<<<<< HEAD
<<<<<<< HEAD
<<<<<<< HEAD
<<<<<<< HEAD
<<<<<<< HEAD
<<<<<<< HEAD
<<<<<<< HEAD
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
>>>>>>> 360db021b6 (Merge pull request #3524 from cffk/merid-update-fix)
=======
=======
>>>>>>> b5f4d47b2b (Merge pull request #3524 from cffk/merid-update-fix)
<<<<<<< HEAD
<<<<<<< HEAD
<<<<<<< HEAD
<<<<<<< HEAD
<<<<<<< HEAD
<<<<<<< HEAD
<<<<<<< HEAD
<<<<<<< HEAD
<<<<<<< HEAD
<<<<<<< HEAD
<<<<<<< HEAD
<<<<<<< HEAD
<<<<<<< HEAD
<<<<<<< HEAD
<<<<<<< HEAD
<<<<<<< HEAD
<<<<<<< HEAD
<<<<<<< HEAD
<<<<<<< HEAD
<<<<<<< HEAD
<<<<<<< HEAD
<<<<<<< HEAD
<<<<<<< HEAD
<<<<<<< HEAD
<<<<<<< HEAD
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
>>>>>>> f00ffe609e (Merge pull request #3524 from cffk/merid-update-fix)
=======
>>>>>>> 25ac262782 (Merge pull request #3524 from cffk/merid-update-fix)
<<<<<<< HEAD
<<<<<<< HEAD
<<<<<<< HEAD
<<<<<<< HEAD
<<<<<<< HEAD
<<<<<<< HEAD
<<<<<<< HEAD
<<<<<<< HEAD
<<<<<<< HEAD
<<<<<<< HEAD
<<<<<<< HEAD
<<<<<<< HEAD
<<<<<<< HEAD
<<<<<<< HEAD
<<<<<<< HEAD
<<<<<<< HEAD
<<<<<<< HEAD
<<<<<<< HEAD
<<<<<<< HEAD
<<<<<<< HEAD
<<<<<<< HEAD
<<<<<<< HEAD
<<<<<<< HEAD
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
>>>>>>> 360db021b6 (Merge pull request #3524 from cffk/merid-update-fix)
=======
>>>>>>> 10b5e77237 (Merge pull request #3524 from cffk/merid-update-fix)
<<<<<<< HEAD
<<<<<<< HEAD
=======
>>>>>>> c8fb3456cf (Merge pull request #3524 from cffk/merid-update-fix)
<<<<<<< HEAD
<<<<<<< HEAD
<<<<<<< HEAD
<<<<<<< HEAD
<<<<<<< HEAD
<<<<<<< HEAD
<<<<<<< HEAD
<<<<<<< HEAD
<<<<<<< HEAD
<<<<<<< HEAD
<<<<<<< HEAD
<<<<<<< HEAD
<<<<<<< HEAD
<<<<<<< HEAD
<<<<<<< HEAD
<<<<<<< HEAD
<<<<<<< HEAD
<<<<<<< HEAD
<<<<<<< HEAD
<<<<<<< HEAD
<<<<<<< HEAD
<<<<<<< HEAD
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
<<<<<<< HEAD
=======
>>>>>>> locatelli-main
<<<<<<< HEAD
=======
>>>>>>> c8fb3456cf (Merge pull request #3524 from cffk/merid-update-fix)
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
<<<<<<< HEAD
<<<<<<< HEAD
<<<<<<< HEAD
<<<<<<< HEAD
<<<<<<< HEAD
<<<<<<< HEAD
<<<<<<< HEAD
<<<<<<< HEAD
<<<<<<< HEAD
<<<<<<< HEAD
<<<<<<< HEAD
<<<<<<< HEAD
<<<<<<< HEAD
<<<<<<< HEAD
<<<<<<< HEAD
<<<<<<< HEAD
<<<<<<< HEAD
<<<<<<< HEAD
<<<<<<< HEAD
<<<<<<< HEAD
<<<<<<< HEAD
<<<<<<< HEAD
<<<<<<< HEAD
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
>>>>>>> locationtech-main
=======
    bool getLonLatZOffset(int ix, int iy, double &lonOffsetRadian,
                          double &latOffsetRadian, double &zOffset) const {
        return getLonLatOffset(ix, iy, lonOffsetRadian, latOffsetRadian) &&
>>>>>>> 748ccdbcc6 (Merge pull request #3524 from cffk/merid-update-fix)
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
<<<<<<< HEAD
<<<<<<< HEAD
<<<<<<< HEAD
<<<<<<< HEAD
<<<<<<< HEAD
<<<<<<< HEAD
<<<<<<< HEAD
<<<<<<< HEAD
<<<<<<< HEAD
<<<<<<< HEAD
<<<<<<< HEAD
>>>>>>> a8fbb11965 (Merge pull request #3524 from cffk/merid-update-fix)
=======
>>>>>>> location-main
=======
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
>>>>>>> 74eac2217b (typo fixes)
<<<<<<< HEAD
<<<<<<< HEAD
>>>>>>> a8fbb11965 (Merge pull request #3524 from cffk/merid-update-fix)
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
>>>>>>> 74eac2217b (typo fixes)
<<<<<<< HEAD
>>>>>>> locatelli-main
=======
>>>>>>> locatelli-main
=======
>>>>>>> locatelli-main
=======
<<<<<<< HEAD
=======
>>>>>>> 74eac2217b (typo fixes)
>>>>>>> locatelli-main
=======
>>>>>>> 74eac2217b (typo fixes)
>>>>>>> locatelli-main
=======
>>>>>>> 74eac2217b (typo fixes)
>>>>>>> locatelli-main
=======
>>>>>>> 74eac2217b (typo fixes)
>>>>>>> locatelli-main
=======
>>>>>>> 74eac2217b (typo fixes)
>>>>>>> locatelli-main
=======
>>>>>>> 74eac2217b (typo fixes)
>>>>>>> locatelli-main
=======
>>>>>>> 74eac2217b (typo fixes)
>>>>>>> locatelli-main
=======
>>>>>>> 74eac2217b (typo fixes)
>>>>>>> locatelli-main
=======
>>>>>>> 74eac2217b (typo fixes)
>>>>>>> locatelli-main
=======
>>>>>>> 74eac2217b (typo fixes)
>>>>>>> locatelli-main
=======
>>>>>>> 74eac2217b (typo fixes)
>>>>>>> locatelli-main
=======
>>>>>>> 74eac2217b (typo fixes)
>>>>>>> locatelli-main
=======
>>>>>>> 74eac2217b (typo fixes)
>>>>>>> locatelli-main
=======
>>>>>>> 74eac2217b (typo fixes)
>>>>>>> locatelli-main
=======
>>>>>>> 74eac2217b (typo fixes)
>>>>>>> locatelli-main
=======
>>>>>>> 74eac2217b (typo fixes)
>>>>>>> locatelli-main
=======
>>>>>>> 74eac2217b (typo fixes)
>>>>>>> locatelli-main
=======
>>>>>>> 74eac2217b (typo fixes)
>>>>>>> locatelli-main
=======
>>>>>>> 74eac2217b (typo fixes)
>>>>>>> locatelli-main
=======
>>>>>>> 74eac2217b (typo fixes)
>>>>>>> locatelli-main
=======
>>>>>>> 74eac2217b (typo fixes)
>>>>>>> locatelli-main
=======
>>>>>>> 74eac2217b (typo fixes)
>>>>>>> locatelli-main
=======
>>>>>>> 74eac2217b (typo fixes)
>>>>>>> locatelli-main
=======
>>>>>>> 74eac2217b (typo fixes)
>>>>>>> locatelli-main
=======
>>>>>>> 74eac2217b (typo fixes)
>>>>>>> locatelli-main
=======
>>>>>>> 74eac2217b (typo fixes)
>>>>>>> locatelli-main
=======
>>>>>>> 74eac2217b (typo fixes)
>>>>>>> locatelli-main
=======
>>>>>>> 74eac2217b (typo fixes)
>>>>>>> locatelli-main
=======
>>>>>>> 74eac2217b (typo fixes)
>>>>>>> locatelli-main
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
<<<<<<< HEAD
<<<<<<< HEAD
<<<<<<< HEAD
<<<<<<< HEAD
<<<<<<< HEAD
<<<<<<< HEAD
<<<<<<< HEAD
<<<<<<< HEAD
<<<<<<< HEAD
<<<<<<< HEAD
<<<<<<< HEAD
<<<<<<< HEAD
<<<<<<< HEAD
<<<<<<< HEAD
<<<<<<< HEAD
<<<<<<< HEAD
<<<<<<< HEAD
<<<<<<< HEAD
<<<<<<< HEAD
<<<<<<< HEAD
<<<<<<< HEAD
<<<<<<< HEAD
<<<<<<< HEAD
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
    bool getLongLatZOffset(int ix, int iy, double &longOffsetRadian,
                           double &latOffsetRadian, double &zOffset) const {
        return getLongLatOffset(ix, iy, longOffsetRadian, latOffsetRadian) &&
>>>>>>> e4a6fd6d75 (typo fixes)
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
<<<<<<< HEAD
<<<<<<< HEAD
<<<<<<< HEAD
<<<<<<< HEAD
<<<<<<< HEAD
<<<<<<< HEAD
<<<<<<< HEAD
<<<<<<< HEAD
<<<<<<< HEAD
<<<<<<< HEAD
>>>>>>> 360db021b (Merge pull request #3524 from cffk/merid-update-fix)
>>>>>>> 3771d4aec1 (Merge pull request #3524 from cffk/merid-update-fix)
=======
<<<<<<< HEAD
=======
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
>>>>>>> c8fb3456cf (Merge pull request #3524 from cffk/merid-update-fix)
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
>>>>>>> c8fb3456cf (Merge pull request #3524 from cffk/merid-update-fix)
<<<<<<< HEAD
>>>>>>> locatelli-main
=======
>>>>>>> locatelli-main
=======
>>>>>>> locatelli-main
=======
<<<<<<< HEAD
=======
>>>>>>> c8fb3456cf (Merge pull request #3524 from cffk/merid-update-fix)
>>>>>>> locatelli-main
=======
>>>>>>> c8fb3456cf (Merge pull request #3524 from cffk/merid-update-fix)
>>>>>>> locatelli-main
=======
>>>>>>> c8fb3456cf (Merge pull request #3524 from cffk/merid-update-fix)
>>>>>>> locatelli-main
=======
>>>>>>> c8fb3456cf (Merge pull request #3524 from cffk/merid-update-fix)
>>>>>>> locatelli-main
=======
>>>>>>> c8fb3456cf (Merge pull request #3524 from cffk/merid-update-fix)
>>>>>>> locatelli-main
=======
>>>>>>> c8fb3456cf (Merge pull request #3524 from cffk/merid-update-fix)
>>>>>>> locatelli-main
=======
>>>>>>> c8fb3456cf (Merge pull request #3524 from cffk/merid-update-fix)
>>>>>>> locatelli-main
=======
>>>>>>> c8fb3456cf (Merge pull request #3524 from cffk/merid-update-fix)
>>>>>>> locatelli-main
=======
>>>>>>> c8fb3456cf (Merge pull request #3524 from cffk/merid-update-fix)
>>>>>>> locatelli-main
=======
>>>>>>> c8fb3456cf (Merge pull request #3524 from cffk/merid-update-fix)
>>>>>>> locatelli-main
=======
>>>>>>> c8fb3456cf (Merge pull request #3524 from cffk/merid-update-fix)
>>>>>>> locatelli-main
=======
>>>>>>> c8fb3456cf (Merge pull request #3524 from cffk/merid-update-fix)
>>>>>>> locatelli-main
=======
>>>>>>> c8fb3456cf (Merge pull request #3524 from cffk/merid-update-fix)
>>>>>>> locatelli-main
=======
>>>>>>> c8fb3456cf (Merge pull request #3524 from cffk/merid-update-fix)
>>>>>>> locatelli-main
=======
>>>>>>> c8fb3456cf (Merge pull request #3524 from cffk/merid-update-fix)
>>>>>>> locatelli-main
=======
>>>>>>> c8fb3456cf (Merge pull request #3524 from cffk/merid-update-fix)
>>>>>>> locatelli-main
=======
>>>>>>> c8fb3456cf (Merge pull request #3524 from cffk/merid-update-fix)
>>>>>>> locatelli-main
=======
>>>>>>> c8fb3456cf (Merge pull request #3524 from cffk/merid-update-fix)
>>>>>>> locatelli-main
=======
>>>>>>> c8fb3456cf (Merge pull request #3524 from cffk/merid-update-fix)
>>>>>>> locatelli-main
=======
>>>>>>> c8fb3456cf (Merge pull request #3524 from cffk/merid-update-fix)
>>>>>>> locatelli-main
=======
>>>>>>> c8fb3456cf (Merge pull request #3524 from cffk/merid-update-fix)
>>>>>>> locatelli-main
=======
>>>>>>> c8fb3456cf (Merge pull request #3524 from cffk/merid-update-fix)
>>>>>>> locatelli-main
=======
>>>>>>> c8fb3456cf (Merge pull request #3524 from cffk/merid-update-fix)
>>>>>>> locatelli-main
=======
>>>>>>> c8fb3456cf (Merge pull request #3524 from cffk/merid-update-fix)
>>>>>>> locatelli-main
=======
>>>>>>> c8fb3456cf (Merge pull request #3524 from cffk/merid-update-fix)
>>>>>>> locatelli-main
=======
>>>>>>> c8fb3456cf (Merge pull request #3524 from cffk/merid-update-fix)
>>>>>>> locatelli-main
=======
>>>>>>> c8fb3456cf (Merge pull request #3524 from cffk/merid-update-fix)
>>>>>>> locatelli-main
=======
>>>>>>> c8fb3456cf (Merge pull request #3524 from cffk/merid-update-fix)
>>>>>>> locatelli-main
=======
>>>>>>> c8fb3456cf (Merge pull request #3524 from cffk/merid-update-fix)
>>>>>>> locatelli-main
=======
>>>>>>> 8a24938f25 (Merge pull request #3524 from cffk/merid-update-fix)
=======
>>>>>>> 48ae38528d (typo fixes)
=======
=======
>>>>>>> c8fb3456cf (Merge pull request #3524 from cffk/merid-update-fix)
>>>>>>> 25ac262782 (Merge pull request #3524 from cffk/merid-update-fix)
<<<<<<< HEAD
<<<<<<< HEAD
<<<<<<< HEAD
<<<<<<< HEAD
<<<<<<< HEAD
<<<<<<< HEAD
<<<<<<< HEAD
<<<<<<< HEAD
<<<<<<< HEAD
<<<<<<< HEAD
<<<<<<< HEAD
<<<<<<< HEAD
<<<<<<< HEAD
<<<<<<< HEAD
<<<<<<< HEAD
<<<<<<< HEAD
<<<<<<< HEAD
<<<<<<< HEAD
<<<<<<< HEAD
<<<<<<< HEAD
<<<<<<< HEAD
<<<<<<< HEAD
<<<<<<< HEAD
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
<<<<<<< HEAD
<<<<<<< HEAD
<<<<<<< HEAD
<<<<<<< HEAD
<<<<<<< HEAD
<<<<<<< HEAD
<<<<<<< HEAD
<<<<<<< HEAD
<<<<<<< HEAD
<<<<<<< HEAD
<<<<<<< HEAD
<<<<<<< HEAD
<<<<<<< HEAD
<<<<<<< HEAD
<<<<<<< HEAD
<<<<<<< HEAD
<<<<<<< HEAD
<<<<<<< HEAD
<<<<<<< HEAD
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
<<<<<<< HEAD
<<<<<<< HEAD
<<<<<<< HEAD
>>>>>>> locatelli-main
=======
>>>>>>> locatelli-main
<<<<<<< HEAD
<<<<<<< HEAD
=======
>>>>>>> ebd1587dc5 (Merge pull request #3524 from cffk/merid-update-fix)
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
>>>>>>> ebd1587dc5 (Merge pull request #3524 from cffk/merid-update-fix)
<<<<<<< HEAD
>>>>>>> locatelli-main
=======
>>>>>>> locatelli-main
=======
>>>>>>> locatelli-main
=======
<<<<<<< HEAD
=======
>>>>>>> ebd1587dc5 (Merge pull request #3524 from cffk/merid-update-fix)
>>>>>>> locatelli-main
=======
=======
>>>>>>> ebd1587dc5 (Merge pull request #3524 from cffk/merid-update-fix)
>>>>>>> locatelli-main
=======
=======
>>>>>>> ebd1587dc5 (Merge pull request #3524 from cffk/merid-update-fix)
>>>>>>> locatelli-main
=======
=======
>>>>>>> ebd1587dc5 (Merge pull request #3524 from cffk/merid-update-fix)
>>>>>>> locatelli-main
=======
=======
>>>>>>> ebd1587dc5 (Merge pull request #3524 from cffk/merid-update-fix)
>>>>>>> locatelli-main
=======
=======
>>>>>>> ebd1587dc5 (Merge pull request #3524 from cffk/merid-update-fix)
>>>>>>> locatelli-main
=======
=======
>>>>>>> ebd1587dc5 (Merge pull request #3524 from cffk/merid-update-fix)
>>>>>>> locatelli-main
=======
=======
>>>>>>> ebd1587dc5 (Merge pull request #3524 from cffk/merid-update-fix)
>>>>>>> locatelli-main
=======
=======
>>>>>>> ebd1587dc5 (Merge pull request #3524 from cffk/merid-update-fix)
>>>>>>> locatelli-main
=======
=======
>>>>>>> ebd1587dc5 (Merge pull request #3524 from cffk/merid-update-fix)
>>>>>>> locatelli-main
=======
=======
>>>>>>> ebd1587dc5 (Merge pull request #3524 from cffk/merid-update-fix)
>>>>>>> locatelli-main
=======
=======
>>>>>>> ebd1587dc5 (Merge pull request #3524 from cffk/merid-update-fix)
>>>>>>> locatelli-main
=======
=======
>>>>>>> ebd1587dc5 (Merge pull request #3524 from cffk/merid-update-fix)
>>>>>>> locatelli-main
=======
=======
>>>>>>> ebd1587dc5 (Merge pull request #3524 from cffk/merid-update-fix)
>>>>>>> locatelli-main
=======
=======
>>>>>>> ebd1587dc5 (Merge pull request #3524 from cffk/merid-update-fix)
>>>>>>> locatelli-main
=======
=======
>>>>>>> ebd1587dc5 (Merge pull request #3524 from cffk/merid-update-fix)
>>>>>>> locatelli-main
=======
=======
>>>>>>> ebd1587dc5 (Merge pull request #3524 from cffk/merid-update-fix)
>>>>>>> locatelli-main
=======
=======
>>>>>>> ebd1587dc5 (Merge pull request #3524 from cffk/merid-update-fix)
>>>>>>> locatelli-main
=======
=======
>>>>>>> ebd1587dc5 (Merge pull request #3524 from cffk/merid-update-fix)
>>>>>>> locatelli-main
=======
=======
>>>>>>> ebd1587dc5 (Merge pull request #3524 from cffk/merid-update-fix)
>>>>>>> locatelli-main
=======
=======
>>>>>>> ebd1587dc5 (Merge pull request #3524 from cffk/merid-update-fix)
>>>>>>> locatelli-main
=======
=======
>>>>>>> ebd1587dc5 (Merge pull request #3524 from cffk/merid-update-fix)
>>>>>>> locatelli-main
=======
=======
>>>>>>> ebd1587dc5 (Merge pull request #3524 from cffk/merid-update-fix)
>>>>>>> locatelli-main
=======
=======
>>>>>>> ebd1587dc5 (Merge pull request #3524 from cffk/merid-update-fix)
>>>>>>> locatelli-main
=======
=======
>>>>>>> ebd1587dc5 (Merge pull request #3524 from cffk/merid-update-fix)
>>>>>>> locatelli-main
=======
=======
>>>>>>> ebd1587dc5 (Merge pull request #3524 from cffk/merid-update-fix)
>>>>>>> locatelli-main
=======
=======
>>>>>>> ebd1587dc5 (Merge pull request #3524 from cffk/merid-update-fix)
>>>>>>> locatelli-main
=======
=======
>>>>>>> ebd1587dc5 (Merge pull request #3524 from cffk/merid-update-fix)
>>>>>>> locatelli-main
=======
=======
>>>>>>> ebd1587dc5 (Merge pull request #3524 from cffk/merid-update-fix)
>>>>>>> locatelli-main
=======
>>>>>>> 6e4203f66c (Merge pull request #3524 from cffk/merid-update-fix)
=======
>>>>>>> 25ac262782 (Merge pull request #3524 from cffk/merid-update-fix)
=======
=======
>>>>>>> ebd1587dc5 (Merge pull request #3524 from cffk/merid-update-fix)
>>>>>>> dbc4ff68b0 (Merge pull request #3524 from cffk/merid-update-fix)
<<<<<<< HEAD
<<<<<<< HEAD
<<<<<<< HEAD
<<<<<<< HEAD
<<<<<<< HEAD
<<<<<<< HEAD
<<<<<<< HEAD
<<<<<<< HEAD
<<<<<<< HEAD
<<<<<<< HEAD
<<<<<<< HEAD
<<<<<<< HEAD
<<<<<<< HEAD
<<<<<<< HEAD
<<<<<<< HEAD
<<<<<<< HEAD
<<<<<<< HEAD
<<<<<<< HEAD
<<<<<<< HEAD
<<<<<<< HEAD
<<<<<<< HEAD
<<<<<<< HEAD
<<<<<<< HEAD
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
    bool getLonLatZOffset(int ix, int iy, double &lonOffsetRadian,
                          double &latOffsetRadian, double &zOffset) const {
        return getLonLatOffset(ix, iy, lonOffsetRadian, latOffsetRadian) &&
<<<<<<< HEAD
<<<<<<< HEAD
<<<<<<< HEAD
<<<<<<< HEAD
<<<<<<< HEAD
<<<<<<< HEAD
<<<<<<< HEAD
<<<<<<< HEAD
<<<<<<< HEAD
<<<<<<< HEAD
<<<<<<< HEAD
<<<<<<< HEAD
<<<<<<< HEAD
<<<<<<< HEAD
<<<<<<< HEAD
<<<<<<< HEAD
<<<<<<< HEAD
<<<<<<< HEAD
<<<<<<< HEAD
<<<<<<< HEAD
<<<<<<< HEAD
<<<<<<< HEAD
<<<<<<< HEAD
<<<<<<< HEAD
<<<<<<< HEAD
<<<<<<< HEAD
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
>>>>>>> 153df87aaa (Merge pull request #3524 from cffk/merid-update-fix)
>>>>>>> location-main
=======
>>>>>>> 153df87aaa (Merge pull request #3524 from cffk/merid-update-fix)
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
>>>>>>> 153df87aaa (Merge pull request #3524 from cffk/merid-update-fix)
<<<<<<< HEAD
<<<<<<< HEAD
<<<<<<< HEAD
<<<<<<< HEAD
=======
>>>>>>> 80ac813585 (Merge pull request #3524 from cffk/merid-update-fix)
=======
>>>>>>> dbc4ff68b0 (Merge pull request #3524 from cffk/merid-update-fix)
<<<<<<< HEAD
<<<<<<< HEAD
<<<<<<< HEAD
<<<<<<< HEAD
<<<<<<< HEAD
<<<<<<< HEAD
<<<<<<< HEAD
<<<<<<< HEAD
<<<<<<< HEAD
<<<<<<< HEAD
<<<<<<< HEAD
<<<<<<< HEAD
<<<<<<< HEAD
<<<<<<< HEAD
<<<<<<< HEAD
<<<<<<< HEAD
<<<<<<< HEAD
<<<<<<< HEAD
<<<<<<< HEAD
<<<<<<< HEAD
<<<<<<< HEAD
<<<<<<< HEAD
<<<<<<< HEAD
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
    bool getLonLatZOffset(int ix, int iy, double &lonOffsetRadian,
                          double &latOffsetRadian, double &zOffset) const {
        return getLonLatOffset(ix, iy, lonOffsetRadian, latOffsetRadian) &&
>>>>>>> b609c280f5 (Merge pull request #3524 from cffk/merid-update-fix)
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
=======
>>>>>>> d8e8090c80 (typo fixes)
>>>>>>> locatelli-main
=======
<<<<<<< HEAD
=======
>>>>>>> d8e8090c80 (typo fixes)
>>>>>>> locatelli-main
=======
>>>>>>> d8e8090c80 (typo fixes)
>>>>>>> locatelli-main
=======
>>>>>>> d8e8090c80 (typo fixes)
>>>>>>> locatelli-main
=======
>>>>>>> d8e8090c80 (typo fixes)
>>>>>>> locatelli-main
=======
>>>>>>> d8e8090c80 (typo fixes)
>>>>>>> locatelli-main
=======
>>>>>>> d8e8090c80 (typo fixes)
>>>>>>> locatelli-main
=======
>>>>>>> d8e8090c80 (typo fixes)
>>>>>>> locatelli-main
=======
>>>>>>> d8e8090c80 (typo fixes)
>>>>>>> locatelli-main
=======
>>>>>>> d8e8090c80 (typo fixes)
>>>>>>> locatelli-main
=======
>>>>>>> d8e8090c80 (typo fixes)
>>>>>>> locatelli-main
=======
>>>>>>> d8e8090c80 (typo fixes)
>>>>>>> locatelli-main
=======
>>>>>>> d8e8090c80 (typo fixes)
>>>>>>> locatelli-main
=======
>>>>>>> d8e8090c80 (typo fixes)
>>>>>>> locatelli-main
=======
>>>>>>> d8e8090c80 (typo fixes)
>>>>>>> locatelli-main
=======
>>>>>>> d8e8090c80 (typo fixes)
>>>>>>> locatelli-main
=======
>>>>>>> d8e8090c80 (typo fixes)
>>>>>>> locatelli-main
=======
>>>>>>> d8e8090c80 (typo fixes)
>>>>>>> locatelli-main
=======
>>>>>>> d8e8090c80 (typo fixes)
>>>>>>> locatelli-main
=======
>>>>>>> d8e8090c80 (typo fixes)
>>>>>>> locatelli-main
=======
>>>>>>> d8e8090c80 (typo fixes)
>>>>>>> locatelli-main
=======
>>>>>>> d8e8090c80 (typo fixes)
>>>>>>> locatelli-main
=======
>>>>>>> d8e8090c80 (typo fixes)
>>>>>>> locatelli-main
=======
>>>>>>> d8e8090c80 (typo fixes)
>>>>>>> locatelli-main
=======
>>>>>>> d8e8090c80 (typo fixes)
>>>>>>> locatelli-main
=======
>>>>>>> d8e8090c80 (typo fixes)
>>>>>>> locatelli-main
=======
>>>>>>> d8e8090c80 (typo fixes)
>>>>>>> locatelli-main
=======
>>>>>>> d8e8090c80 (typo fixes)
>>>>>>> locatelli-main
=======
>>>>>>> d8e8090c80 (typo fixes)
>>>>>>> locatelli-main
=======
>>>>>>> d8e8090c80 (typo fixes)
>>>>>>> locatelli-main
=======
>>>>>>> d8e8090c80 (typo fixes)
>>>>>>> locatelli-main
=======
>>>>>>> d8e8090c80 (typo fixes)
>>>>>>> locatelli-main
=======
>>>>>>> d8e8090c80 (typo fixes)
>>>>>>> locatelli-main
=======
    bool getLongLatZOffset(int ix, int iy, double &longOffsetRadian,
                           double &latOffsetRadian, double &zOffset) const {
        return getLongLatOffset(ix, iy, longOffsetRadian, latOffsetRadian) &&
>>>>>>> 86ade66356 (typo fixes)
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
>>>>>>> 360db021b6 (Merge pull request #3524 from cffk/merid-update-fix)
>>>>>>> c63e6e91bd (Merge pull request #3524 from cffk/merid-update-fix)
=======
>>>>>>> a8fbb11965 (Merge pull request #3524 from cffk/merid-update-fix)
>>>>>>> 10b5e77237 (Merge pull request #3524 from cffk/merid-update-fix)
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
>>>>>>> aa21c6fa76 (typo fixes)
>>>>>>> 74eac2217b (typo fixes)
=======
>>>>>>> c8fb3456cf (Merge pull request #3524 from cffk/merid-update-fix)
<<<<<<< HEAD
<<<<<<< HEAD
=======
>>>>>>> ebd1587dc5 (Merge pull request #3524 from cffk/merid-update-fix)
<<<<<<< HEAD
<<<<<<< HEAD
<<<<<<< HEAD
<<<<<<< HEAD
<<<<<<< HEAD
<<<<<<< HEAD
<<<<<<< HEAD
<<<<<<< HEAD
<<<<<<< HEAD
<<<<<<< HEAD
<<<<<<< HEAD
<<<<<<< HEAD
<<<<<<< HEAD
<<<<<<< HEAD
<<<<<<< HEAD
<<<<<<< HEAD
<<<<<<< HEAD
<<<<<<< HEAD
<<<<<<< HEAD
<<<<<<< HEAD
<<<<<<< HEAD
<<<<<<< HEAD
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
<<<<<<< HEAD
=======
>>>>>>> locatelli-main
<<<<<<< HEAD
=======
>>>>>>> ebd1587dc5 (Merge pull request #3524 from cffk/merid-update-fix)
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
>>>>>>> 885e4882b8 (Merge pull request #3524 from cffk/merid-update-fix)
=======
    bool getLonLatZOffset(int ix, int iy, double &lonOffsetRadian,
                          double &latOffsetRadian, double &zOffset) const {
        return getLonLatOffset(ix, iy, lonOffsetRadian, latOffsetRadian) &&
<<<<<<< HEAD
>>>>>>> 208fcbd5e7 (Merge pull request #3524 from cffk/merid-update-fix)
=======
    bool getLongLatZOffset(int ix, int iy, double &longOffsetRadian,
                           double &latOffsetRadian, double &zOffset) const {
        return getLongLatOffset(ix, iy, longOffsetRadian, latOffsetRadian) &&
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
>>>>>>> 0a2f6458d1 (Merge pull request #3524 from cffk/merid-update-fix)
>>>>>>> 885e4882b8 (Merge pull request #3524 from cffk/merid-update-fix)
<<<<<<< HEAD
<<<<<<< HEAD
<<<<<<< HEAD
<<<<<<< HEAD
<<<<<<< HEAD
<<<<<<< HEAD
<<<<<<< HEAD
<<<<<<< HEAD
<<<<<<< HEAD
<<<<<<< HEAD
<<<<<<< HEAD
<<<<<<< HEAD
<<<<<<< HEAD
<<<<<<< HEAD
<<<<<<< HEAD
<<<<<<< HEAD
<<<<<<< HEAD
<<<<<<< HEAD
<<<<<<< HEAD
<<<<<<< HEAD
<<<<<<< HEAD
<<<<<<< HEAD
<<<<<<< HEAD
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
    bool getLonLatZOffset(int ix, int iy, double &lonOffsetRadian,
                          double &latOffsetRadian, double &zOffset) const {
        return getLonLatOffset(ix, iy, lonOffsetRadian, latOffsetRadian) &&
>>>>>>> 0a2f6458d1 (Merge pull request #3524 from cffk/merid-update-fix)
<<<<<<< HEAD
<<<<<<< HEAD
<<<<<<< HEAD
<<<<<<< HEAD
<<<<<<< HEAD
<<<<<<< HEAD
<<<<<<< HEAD
<<<<<<< HEAD
<<<<<<< HEAD
<<<<<<< HEAD
<<<<<<< HEAD
<<<<<<< HEAD
<<<<<<< HEAD
<<<<<<< HEAD
<<<<<<< HEAD
<<<<<<< HEAD
<<<<<<< HEAD
<<<<<<< HEAD
<<<<<<< HEAD
<<<<<<< HEAD
<<<<<<< HEAD
<<<<<<< HEAD
<<<<<<< HEAD
<<<<<<< HEAD
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
    bool getLonLatZOffset(int ix, int iy, double &lonOffsetRadian,
                          double &latOffsetRadian, double &zOffset) const {
        return getLonLatOffset(ix, iy, lonOffsetRadian, latOffsetRadian) &&
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
               getZOffset(ix, iy, zOffset);
    }

    bool getEastingNorthingZOffset(int ix, int iy, double &eastingOffset,
                                   double &northingOffset,
                                   double &zOffset) const {
        return getEastingNorthingOffset(ix, iy, eastingOffset,
                                        northingOffset) &&
               getZOffset(ix, iy, zOffset);
    }

#ifdef DEBUG_DEFMODEL
    std::string name() const { return realGrid->name(); }
#endif

  private:
    Grid(const Grid &) = delete;
    Grid &operator=(const Grid &) = delete;
};

struct GridSet : public GridSetPrototype<Grid> {

    PJ_CONTEXT *ctx;
    std::unique_ptr<NS_PROJ::GenericShiftGridSet> realGridSet;
    std::map<const NS_PROJ::GenericShiftGrid *, std::unique_ptr<Grid>>
        mapGrids{};

    GridSet(PJ_CONTEXT *ctxIn,
            std::unique_ptr<NS_PROJ::GenericShiftGridSet> &&realGridSetIn)
        : ctx(ctxIn), realGridSet(std::move(realGridSetIn)) {}

    const Grid *gridAt(double x, double y) {
        const NS_PROJ::GenericShiftGrid *realGrid = realGridSet->gridAt(x, y);
        if (!realGrid) {
            return nullptr;
        }
        auto iter = mapGrids.find(realGrid);
        if (iter == mapGrids.end()) {
            iter = mapGrids
                       .insert(std::pair<const NS_PROJ::GenericShiftGrid *,
                                         std::unique_ptr<Grid>>(
                           realGrid,
                           std::unique_ptr<Grid>(new Grid(ctx, realGrid))))
                       .first;
        }
        return iter->second.get();
    }

  private:
    GridSet(const GridSet &) = delete;
    GridSet &operator=(const GridSet &) = delete;
};

struct EvaluatorIface : public EvaluatorIfacePrototype<Grid, GridSet> {

    PJ_CONTEXT *ctx;
    PJ *cart;

    EvaluatorIface(PJ_CONTEXT *ctxIn, PJ *cartIn) : ctx(ctxIn), cart(cartIn) {}

    ~EvaluatorIface() {
        if (cart)
            cart->destructor(cart, 0);
    }

    std::unique_ptr<GridSet> open(const std::string &filename) {
        auto realGridSet = NS_PROJ::GenericShiftGridSet::open(ctx, filename);
        if (!realGridSet) {
            pj_log(ctx, PJ_LOG_ERROR, "cannot open %s", filename.c_str());
            return nullptr;
        }
        return std::unique_ptr<GridSet>(
            new GridSet(ctx, std::move(realGridSet)));
    }

    bool isGeographicCRS(const std::string &crsDef) {
        PJ *P = proj_create(ctx, crsDef.c_str());
        if (P == nullptr) {
            return true; // reasonable default value
        }
        const auto type = proj_get_type(P);
        bool ret = (type == PJ_TYPE_GEOGRAPHIC_2D_CRS ||
                    type == PJ_TYPE_GEOGRAPHIC_3D_CRS);
        proj_destroy(P);
        return ret;
    }

    void geographicToGeocentric(double lam, double phi, double height, double a,
                                double b, double /*es*/, double &X, double &Y,
                                double &Z) {
        (void)a;
        (void)b;
        assert(cart->a == a);
        assert(cart->b == b);
        PJ_LPZ lpz;
        lpz.lam = lam;
        lpz.phi = phi;
        lpz.z = height;
        PJ_XYZ xyz = cart->fwd3d(lpz, cart);
        X = xyz.x;
        Y = xyz.y;
        Z = xyz.z;
    }

    void geocentricToGeographic(double X, double Y, double Z, double a,
                                double b, double /*es*/, double &lam,
                                double &phi, double &height) {
        (void)a;
        (void)b;
        assert(cart->a == a);
        assert(cart->b == b);
        PJ_XYZ xyz;
        xyz.x = X;
        xyz.y = Y;
        xyz.z = Z;
        PJ_LPZ lpz = cart->inv3d(xyz, cart);
        lam = lpz.lam;
        phi = lpz.phi;
        height = lpz.z;
    }

#ifdef DEBUG_DEFMODEL
    void log(const std::string &msg) {
        pj_log(ctx, PJ_LOG_TRACE, "%s", msg.c_str());
    }
#endif

  private:
    EvaluatorIface(const EvaluatorIface &) = delete;
    EvaluatorIface &operator=(const EvaluatorIface &) = delete;
};

struct defmodelData {
    std::unique_ptr<Evaluator<Grid, GridSet, EvaluatorIface>> evaluator{};
    EvaluatorIface evaluatorIface;

    explicit defmodelData(PJ_CONTEXT *ctx, PJ *cart)
        : evaluatorIface(ctx, cart) {}

    defmodelData(const defmodelData &) = delete;
    defmodelData &operator=(const defmodelData &) = delete;
};

} // namespace

static PJ *destructor(PJ *P, int errlev) {
    if (nullptr == P)
        return nullptr;

    auto Q = static_cast<struct defmodelData *>(P->opaque);
    delete Q;
    P->opaque = nullptr;

    return pj_default_destructor(P, errlev);
}

static void forward_4d(PJ_COORD &coo, PJ *P) {
    auto *Q = (struct defmodelData *)P->opaque;

    if (!Q->evaluator->forward(Q->evaluatorIface, coo.xyzt.x, coo.xyzt.y,
                               coo.xyzt.z, coo.xyzt.t, coo.xyzt.x, coo.xyzt.y,
                               coo.xyzt.z)) {
        coo = proj_coord_error();
    }
}

static void reverse_4d(PJ_COORD &coo, PJ *P) {
    auto *Q = (struct defmodelData *)P->opaque;

    if (!Q->evaluator->inverse(Q->evaluatorIface, coo.xyzt.x, coo.xyzt.y,
                               coo.xyzt.z, coo.xyzt.t, coo.xyzt.x, coo.xyzt.y,
                               coo.xyzt.z)) {
        coo = proj_coord_error();
    }
}

// Function called by proj_assign_context() when a new context is assigned to
// an existing PJ object. Mostly to deal with objects being passed between
// threads.
static void reassign_context(PJ *P, PJ_CONTEXT *ctx) {
    auto *Q = (struct defmodelData *)P->opaque;
    if (Q->evaluatorIface.ctx != ctx) {
        Q->evaluator->clearGridCache();
        Q->evaluatorIface.ctx = ctx;
    }
}

PJ *TRANSFORMATION(defmodel, 1) {
    // Pass a dummy ellipsoid definition that will be overridden just afterwards
    auto cart = proj_create(P->ctx, "+proj=cart +a=1");
    if (cart == nullptr)
        return destructor(P, PROJ_ERR_OTHER /*ENOMEM*/);

    /* inherit ellipsoid definition from P to Q->cart */
    pj_inherit_ellipsoid_def(P, cart);

    auto Q = new defmodelData(P->ctx, cart);
    P->opaque = (void *)Q;
    P->destructor = destructor;
    P->reassign_context = reassign_context;

    const char *model = pj_param(P->ctx, P->params, "smodel").s;
    if (!model) {
        proj_log_error(P, _("+model= should be specified."));
        return destructor(P, PROJ_ERR_INVALID_OP_MISSING_ARG);
    }

    auto file = NS_PROJ::FileManager::open_resource_file(P->ctx, model);
    if (nullptr == file) {
        proj_log_error(P, _("Cannot open %s"), model);
        return destructor(P, PROJ_ERR_INVALID_OP_FILE_NOT_FOUND_OR_INVALID);
    }
    file->seek(0, SEEK_END);
    unsigned long long size = file->tell();
    // Arbitrary threshold to avoid ingesting an arbitrarily large JSON file,
    // that could be a denial of service risk. 10 MB should be sufficiently
    // large for any valid use !
    if (size > 10 * 1024 * 1024) {
        proj_log_error(P, _("File %s too large"), model);
        return destructor(P, PROJ_ERR_INVALID_OP_FILE_NOT_FOUND_OR_INVALID);
    }
    file->seek(0);
    std::string jsonStr;
    jsonStr.resize(static_cast<size_t>(size));
    if (file->read(&jsonStr[0], jsonStr.size()) != jsonStr.size()) {
        proj_log_error(P, _("Cannot read %s"), model);
        return destructor(P, PROJ_ERR_INVALID_OP_FILE_NOT_FOUND_OR_INVALID);
    }

    try {
        Q->evaluator.reset(new Evaluator<Grid, GridSet, EvaluatorIface>(
            MasterFile::parse(jsonStr), Q->evaluatorIface, P->a, P->b));
    } catch (const std::exception &e) {
        proj_log_error(P, _("invalid model: %s"), e.what());
        return destructor(P, PROJ_ERR_INVALID_OP_FILE_NOT_FOUND_OR_INVALID);
    }

    P->fwd4d = forward_4d;
    P->inv4d = reverse_4d;

    if (Q->evaluator->isGeographicCRS()) {
        P->left = PJ_IO_UNITS_RADIANS;
        P->right = PJ_IO_UNITS_RADIANS;
    } else {
        P->left = PJ_IO_UNITS_PROJECTED;
        P->right = PJ_IO_UNITS_PROJECTED;
    }

    return P;
}
