/***********************************************************************
 * Copyright (c) 2013-2024 Commonwealth Computer Research, Inc.
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Apache License, Version 2.0
 * which accompanies this distribution and is available at
 * http://www.opensource.org/licenses/apache2.0.php.
 ***********************************************************************/

package org.locationtech.geomesa.convert.jdbc

import com.typesafe.config.ConfigFactory
<<<<<<< HEAD
<<<<<<< HEAD
<<<<<<< HEAD
<<<<<<< HEAD
<<<<<<< HEAD
<<<<<<< HEAD
<<<<<<< HEAD
<<<<<<< HEAD
<<<<<<< HEAD
<<<<<<< HEAD
<<<<<<< HEAD
<<<<<<< HEAD
<<<<<<< HEAD
<<<<<<< HEAD
<<<<<<< HEAD
<<<<<<< HEAD
<<<<<<< HEAD
<<<<<<< HEAD
<<<<<<< HEAD
<<<<<<< HEAD
<<<<<<< HEAD
<<<<<<< HEAD
<<<<<<< HEAD
<<<<<<< HEAD
<<<<<<< HEAD
<<<<<<< HEAD
<<<<<<< HEAD
<<<<<<< HEAD
<<<<<<< HEAD
<<<<<<< HEAD
<<<<<<< HEAD
<<<<<<< HEAD
<<<<<<< HEAD
<<<<<<< HEAD
<<<<<<< HEAD
<<<<<<< HEAD
<<<<<<< HEAD
import com.typesafe.scalalogging.LazyLogging
=======
=======
<<<<<<< HEAD
<<<<<<< HEAD
import com.typesafe.scalalogging.LazyLogging
=======
=======
<<<<<<< HEAD
<<<<<<< HEAD
<<<<<<< HEAD
<<<<<<< HEAD
<<<<<<< HEAD
=======
>>>>>>> 6c49bcd685 (GEOMESA-3246 Upgrade Arrow to 11.0.0)
=======
>>>>>>> e74fa3f690 (GEOMESA-3254 Add Bloop build support)
=======
>>>>>>> d18777a94f (GEOMESA-3246 Upgrade Arrow to 11.0.0)
import com.typesafe.scalalogging.LazyLogging
=======
>>>>>>> locationtech-main
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
=======
>>>>>>> b39bd292d4 (GEOMESA-3254 Add Bloop build support)
=======
>>>>>>> 556d966249 (GEOMESA-3246 Upgrade Arrow to 11.0.0)
=======
>>>>>>> 6c49bcd685 (GEOMESA-3246 Upgrade Arrow to 11.0.0)
=======
>>>>>>> e74fa3f690 (GEOMESA-3254 Add Bloop build support)
<<<<<<< HEAD
<<<<<<< HEAD
=======
>>>>>>> d18777a94f (GEOMESA-3246 Upgrade Arrow to 11.0.0)
=======
>>>>>>> 630900cfbb (GEOMESA-3246 Upgrade Arrow to 11.0.0)
=======
>>>>>>> 3e610250ce (GEOMESA-3254 Add Bloop build support)
=======
>>>>>>> 320759d5d3 (GEOMESA-3246 Upgrade Arrow to 11.0.0)
=======
>>>>>>> f586fec5a3 (GEOMESA-3254 Add Bloop build support)
=======
=======
>>>>>>> 6c49bcd685 (GEOMESA-3246 Upgrade Arrow to 11.0.0)
>>>>>>> 52579ffb37 (GEOMESA-3246 Upgrade Arrow to 11.0.0)
=======
>>>>>>> b39bd292d4 (GEOMESA-3254 Add Bloop build support)
=======
=======
>>>>>>> d18777a94f (GEOMESA-3246 Upgrade Arrow to 11.0.0)
>>>>>>> 556d966249 (GEOMESA-3246 Upgrade Arrow to 11.0.0)
import com.typesafe.scalalogging.LazyLogging
=======
>>>>>>> locatelli-main
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
=======
>>>>>>> b39bd292d4 (GEOMESA-3254 Add Bloop build support)
=======
>>>>>>> 556d966249 (GEOMESA-3246 Upgrade Arrow to 11.0.0)
=======
>>>>>>> 6c49bcd685 (GEOMESA-3246 Upgrade Arrow to 11.0.0)
=======
>>>>>>> e74fa3f690 (GEOMESA-3254 Add Bloop build support)
<<<<<<< HEAD
<<<<<<< HEAD
=======
>>>>>>> d18777a94f (GEOMESA-3246 Upgrade Arrow to 11.0.0)
=======
>>>>>>> 630900cfbb (GEOMESA-3246 Upgrade Arrow to 11.0.0)
=======
>>>>>>> 3e610250ce (GEOMESA-3254 Add Bloop build support)
=======
>>>>>>> 320759d5d3 (GEOMESA-3246 Upgrade Arrow to 11.0.0)
=======
>>>>>>> f586fec5a3 (GEOMESA-3254 Add Bloop build support)
=======
=======
>>>>>>> 6c49bcd685 (GEOMESA-3246 Upgrade Arrow to 11.0.0)
>>>>>>> 52579ffb37 (GEOMESA-3246 Upgrade Arrow to 11.0.0)
=======
>>>>>>> b39bd292d4 (GEOMESA-3254 Add Bloop build support)
=======
=======
>>>>>>> d18777a94f (GEOMESA-3246 Upgrade Arrow to 11.0.0)
>>>>>>> 556d966249 (GEOMESA-3246 Upgrade Arrow to 11.0.0)
import com.typesafe.scalalogging.LazyLogging
=======
>>>>>>> locatelli-main
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
>>>>>>> b39bd292d4 (GEOMESA-3254 Add Bloop build support)
=======
>>>>>>> 556d966249 (GEOMESA-3246 Upgrade Arrow to 11.0.0)
=======
>>>>>>> 6c49bcd685 (GEOMESA-3246 Upgrade Arrow to 11.0.0)
=======
>>>>>>> e74fa3f690 (GEOMESA-3254 Add Bloop build support)
<<<<<<< HEAD
<<<<<<< HEAD
=======
>>>>>>> d18777a94f (GEOMESA-3246 Upgrade Arrow to 11.0.0)
=======
>>>>>>> 630900cfbb (GEOMESA-3246 Upgrade Arrow to 11.0.0)
=======
>>>>>>> 3e610250ce (GEOMESA-3254 Add Bloop build support)
=======
>>>>>>> 320759d5d3 (GEOMESA-3246 Upgrade Arrow to 11.0.0)
=======
>>>>>>> f586fec5a3 (GEOMESA-3254 Add Bloop build support)
=======
=======
>>>>>>> 6c49bcd685 (GEOMESA-3246 Upgrade Arrow to 11.0.0)
>>>>>>> 52579ffb37 (GEOMESA-3246 Upgrade Arrow to 11.0.0)
=======
>>>>>>> b39bd292d4 (GEOMESA-3254 Add Bloop build support)
=======
=======
>>>>>>> d18777a94f (GEOMESA-3246 Upgrade Arrow to 11.0.0)
>>>>>>> 556d966249 (GEOMESA-3246 Upgrade Arrow to 11.0.0)
import com.typesafe.scalalogging.LazyLogging
=======
>>>>>>> locatelli-main
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
>>>>>>> b39bd292d4 (GEOMESA-3254 Add Bloop build support)
=======
>>>>>>> 556d966249 (GEOMESA-3246 Upgrade Arrow to 11.0.0)
=======
>>>>>>> 6c49bcd685 (GEOMESA-3246 Upgrade Arrow to 11.0.0)
=======
>>>>>>> e74fa3f690 (GEOMESA-3254 Add Bloop build support)
<<<<<<< HEAD
<<<<<<< HEAD
=======
>>>>>>> d18777a94f (GEOMESA-3246 Upgrade Arrow to 11.0.0)
=======
>>>>>>> 630900cfbb (GEOMESA-3246 Upgrade Arrow to 11.0.0)
=======
>>>>>>> 3e610250ce (GEOMESA-3254 Add Bloop build support)
=======
>>>>>>> 320759d5d3 (GEOMESA-3246 Upgrade Arrow to 11.0.0)
=======
>>>>>>> f586fec5a3 (GEOMESA-3254 Add Bloop build support)
=======
=======
>>>>>>> 6c49bcd685 (GEOMESA-3246 Upgrade Arrow to 11.0.0)
>>>>>>> 52579ffb37 (GEOMESA-3246 Upgrade Arrow to 11.0.0)
=======
>>>>>>> b39bd292d4 (GEOMESA-3254 Add Bloop build support)
=======
=======
>>>>>>> d18777a94f (GEOMESA-3246 Upgrade Arrow to 11.0.0)
>>>>>>> 556d966249 (GEOMESA-3246 Upgrade Arrow to 11.0.0)
import com.typesafe.scalalogging.LazyLogging
=======
>>>>>>> locatelli-main
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
>>>>>>> b39bd292d4 (GEOMESA-3254 Add Bloop build support)
=======
>>>>>>> 556d966249 (GEOMESA-3246 Upgrade Arrow to 11.0.0)
=======
>>>>>>> 6c49bcd685 (GEOMESA-3246 Upgrade Arrow to 11.0.0)
=======
>>>>>>> e74fa3f690 (GEOMESA-3254 Add Bloop build support)
<<<<<<< HEAD
<<<<<<< HEAD
=======
>>>>>>> d18777a94f (GEOMESA-3246 Upgrade Arrow to 11.0.0)
=======
>>>>>>> 630900cfbb (GEOMESA-3246 Upgrade Arrow to 11.0.0)
=======
>>>>>>> 3e610250ce (GEOMESA-3254 Add Bloop build support)
=======
>>>>>>> 320759d5d3 (GEOMESA-3246 Upgrade Arrow to 11.0.0)
=======
>>>>>>> f586fec5a3 (GEOMESA-3254 Add Bloop build support)
=======
=======
>>>>>>> 6c49bcd685 (GEOMESA-3246 Upgrade Arrow to 11.0.0)
>>>>>>> 52579ffb37 (GEOMESA-3246 Upgrade Arrow to 11.0.0)
=======
>>>>>>> b39bd292d4 (GEOMESA-3254 Add Bloop build support)
=======
=======
>>>>>>> d18777a94f (GEOMESA-3246 Upgrade Arrow to 11.0.0)
>>>>>>> 556d966249 (GEOMESA-3246 Upgrade Arrow to 11.0.0)
import com.typesafe.scalalogging.LazyLogging
=======
>>>>>>> locatelli-main
=======
<<<<<<< HEAD
<<<<<<< HEAD
<<<<<<< HEAD
<<<<<<< HEAD
<<<<<<< HEAD
<<<<<<< HEAD
<<<<<<< HEAD
=======
>>>>>>> b39bd292d4 (GEOMESA-3254 Add Bloop build support)
=======
>>>>>>> 556d966249 (GEOMESA-3246 Upgrade Arrow to 11.0.0)
=======
>>>>>>> 6c49bcd685 (GEOMESA-3246 Upgrade Arrow to 11.0.0)
=======
>>>>>>> e74fa3f690 (GEOMESA-3254 Add Bloop build support)
<<<<<<< HEAD
<<<<<<< HEAD
=======
>>>>>>> d18777a94f (GEOMESA-3246 Upgrade Arrow to 11.0.0)
=======
>>>>>>> 630900cfbb (GEOMESA-3246 Upgrade Arrow to 11.0.0)
=======
>>>>>>> 3e610250ce (GEOMESA-3254 Add Bloop build support)
=======
>>>>>>> 320759d5d3 (GEOMESA-3246 Upgrade Arrow to 11.0.0)
=======
>>>>>>> f586fec5a3 (GEOMESA-3254 Add Bloop build support)
=======
=======
>>>>>>> 6c49bcd685 (GEOMESA-3246 Upgrade Arrow to 11.0.0)
>>>>>>> 52579ffb37 (GEOMESA-3246 Upgrade Arrow to 11.0.0)
=======
>>>>>>> b39bd292d4 (GEOMESA-3254 Add Bloop build support)
=======
=======
>>>>>>> d18777a94f (GEOMESA-3246 Upgrade Arrow to 11.0.0)
>>>>>>> 556d966249 (GEOMESA-3246 Upgrade Arrow to 11.0.0)
import com.typesafe.scalalogging.LazyLogging
=======
>>>>>>> locatelli-main
=======
<<<<<<< HEAD
<<<<<<< HEAD
<<<<<<< HEAD
<<<<<<< HEAD
<<<<<<< HEAD
<<<<<<< HEAD
=======
>>>>>>> b39bd292d4 (GEOMESA-3254 Add Bloop build support)
=======
>>>>>>> 556d966249 (GEOMESA-3246 Upgrade Arrow to 11.0.0)
=======
>>>>>>> 6c49bcd685 (GEOMESA-3246 Upgrade Arrow to 11.0.0)
=======
>>>>>>> e74fa3f690 (GEOMESA-3254 Add Bloop build support)
<<<<<<< HEAD
<<<<<<< HEAD
=======
>>>>>>> d18777a94f (GEOMESA-3246 Upgrade Arrow to 11.0.0)
=======
>>>>>>> 630900cfbb (GEOMESA-3246 Upgrade Arrow to 11.0.0)
=======
>>>>>>> 3e610250ce (GEOMESA-3254 Add Bloop build support)
=======
>>>>>>> 320759d5d3 (GEOMESA-3246 Upgrade Arrow to 11.0.0)
=======
>>>>>>> f586fec5a3 (GEOMESA-3254 Add Bloop build support)
=======
=======
>>>>>>> 6c49bcd685 (GEOMESA-3246 Upgrade Arrow to 11.0.0)
>>>>>>> 52579ffb37 (GEOMESA-3246 Upgrade Arrow to 11.0.0)
=======
>>>>>>> b39bd292d4 (GEOMESA-3254 Add Bloop build support)
=======
=======
>>>>>>> d18777a94f (GEOMESA-3246 Upgrade Arrow to 11.0.0)
>>>>>>> 556d966249 (GEOMESA-3246 Upgrade Arrow to 11.0.0)
import com.typesafe.scalalogging.LazyLogging
=======
>>>>>>> locatelli-main
=======
<<<<<<< HEAD
<<<<<<< HEAD
<<<<<<< HEAD
<<<<<<< HEAD
<<<<<<< HEAD
=======
>>>>>>> b39bd292d4 (GEOMESA-3254 Add Bloop build support)
=======
>>>>>>> 556d966249 (GEOMESA-3246 Upgrade Arrow to 11.0.0)
=======
>>>>>>> 6c49bcd685 (GEOMESA-3246 Upgrade Arrow to 11.0.0)
=======
>>>>>>> e74fa3f690 (GEOMESA-3254 Add Bloop build support)
<<<<<<< HEAD
<<<<<<< HEAD
=======
>>>>>>> d18777a94f (GEOMESA-3246 Upgrade Arrow to 11.0.0)
=======
>>>>>>> 630900cfbb (GEOMESA-3246 Upgrade Arrow to 11.0.0)
=======
>>>>>>> 3e610250ce (GEOMESA-3254 Add Bloop build support)
=======
>>>>>>> 320759d5d3 (GEOMESA-3246 Upgrade Arrow to 11.0.0)
=======
>>>>>>> f586fec5a3 (GEOMESA-3254 Add Bloop build support)
=======
=======
>>>>>>> 6c49bcd685 (GEOMESA-3246 Upgrade Arrow to 11.0.0)
>>>>>>> 52579ffb37 (GEOMESA-3246 Upgrade Arrow to 11.0.0)
=======
>>>>>>> b39bd292d4 (GEOMESA-3254 Add Bloop build support)
=======
=======
>>>>>>> d18777a94f (GEOMESA-3246 Upgrade Arrow to 11.0.0)
>>>>>>> 556d966249 (GEOMESA-3246 Upgrade Arrow to 11.0.0)
import com.typesafe.scalalogging.LazyLogging
=======
>>>>>>> locatelli-main
=======
<<<<<<< HEAD
<<<<<<< HEAD
<<<<<<< HEAD
<<<<<<< HEAD
=======
>>>>>>> b39bd292d4 (GEOMESA-3254 Add Bloop build support)
=======
>>>>>>> 556d966249 (GEOMESA-3246 Upgrade Arrow to 11.0.0)
=======
>>>>>>> 6c49bcd685 (GEOMESA-3246 Upgrade Arrow to 11.0.0)
=======
>>>>>>> e74fa3f690 (GEOMESA-3254 Add Bloop build support)
<<<<<<< HEAD
<<<<<<< HEAD
=======
>>>>>>> d18777a94f (GEOMESA-3246 Upgrade Arrow to 11.0.0)
=======
>>>>>>> 630900cfbb (GEOMESA-3246 Upgrade Arrow to 11.0.0)
=======
>>>>>>> 3e610250ce (GEOMESA-3254 Add Bloop build support)
=======
>>>>>>> 320759d5d3 (GEOMESA-3246 Upgrade Arrow to 11.0.0)
=======
>>>>>>> f586fec5a3 (GEOMESA-3254 Add Bloop build support)
=======
=======
>>>>>>> 6c49bcd685 (GEOMESA-3246 Upgrade Arrow to 11.0.0)
>>>>>>> 52579ffb37 (GEOMESA-3246 Upgrade Arrow to 11.0.0)
=======
>>>>>>> b39bd292d4 (GEOMESA-3254 Add Bloop build support)
=======
=======
>>>>>>> d18777a94f (GEOMESA-3246 Upgrade Arrow to 11.0.0)
>>>>>>> 556d966249 (GEOMESA-3246 Upgrade Arrow to 11.0.0)
import com.typesafe.scalalogging.LazyLogging
=======
>>>>>>> locatelli-main
=======
<<<<<<< HEAD
<<<<<<< HEAD
<<<<<<< HEAD
=======
>>>>>>> b39bd292d4 (GEOMESA-3254 Add Bloop build support)
=======
>>>>>>> 556d966249 (GEOMESA-3246 Upgrade Arrow to 11.0.0)
=======
>>>>>>> 6c49bcd685 (GEOMESA-3246 Upgrade Arrow to 11.0.0)
=======
>>>>>>> e74fa3f690 (GEOMESA-3254 Add Bloop build support)
<<<<<<< HEAD
<<<<<<< HEAD
=======
>>>>>>> d18777a94f (GEOMESA-3246 Upgrade Arrow to 11.0.0)
=======
>>>>>>> 630900cfbb (GEOMESA-3246 Upgrade Arrow to 11.0.0)
=======
>>>>>>> 3e610250ce (GEOMESA-3254 Add Bloop build support)
=======
>>>>>>> 320759d5d3 (GEOMESA-3246 Upgrade Arrow to 11.0.0)
=======
>>>>>>> f586fec5a3 (GEOMESA-3254 Add Bloop build support)
=======
=======
>>>>>>> 6c49bcd685 (GEOMESA-3246 Upgrade Arrow to 11.0.0)
>>>>>>> 52579ffb37 (GEOMESA-3246 Upgrade Arrow to 11.0.0)
=======
>>>>>>> b39bd292d4 (GEOMESA-3254 Add Bloop build support)
=======
=======
>>>>>>> d18777a94f (GEOMESA-3246 Upgrade Arrow to 11.0.0)
>>>>>>> 556d966249 (GEOMESA-3246 Upgrade Arrow to 11.0.0)
import com.typesafe.scalalogging.LazyLogging
=======
>>>>>>> locatelli-main
=======
<<<<<<< HEAD
<<<<<<< HEAD
=======
>>>>>>> b39bd292d4 (GEOMESA-3254 Add Bloop build support)
=======
>>>>>>> 556d966249 (GEOMESA-3246 Upgrade Arrow to 11.0.0)
=======
>>>>>>> 6c49bcd685 (GEOMESA-3246 Upgrade Arrow to 11.0.0)
=======
>>>>>>> e74fa3f690 (GEOMESA-3254 Add Bloop build support)
<<<<<<< HEAD
<<<<<<< HEAD
=======
>>>>>>> d18777a94f (GEOMESA-3246 Upgrade Arrow to 11.0.0)
=======
>>>>>>> 630900cfbb (GEOMESA-3246 Upgrade Arrow to 11.0.0)
=======
>>>>>>> 3e610250ce (GEOMESA-3254 Add Bloop build support)
=======
>>>>>>> 320759d5d3 (GEOMESA-3246 Upgrade Arrow to 11.0.0)
=======
>>>>>>> f586fec5a3 (GEOMESA-3254 Add Bloop build support)
=======
=======
>>>>>>> 6c49bcd685 (GEOMESA-3246 Upgrade Arrow to 11.0.0)
>>>>>>> 52579ffb37 (GEOMESA-3246 Upgrade Arrow to 11.0.0)
=======
>>>>>>> b39bd292d4 (GEOMESA-3254 Add Bloop build support)
=======
=======
>>>>>>> d18777a94f (GEOMESA-3246 Upgrade Arrow to 11.0.0)
>>>>>>> 556d966249 (GEOMESA-3246 Upgrade Arrow to 11.0.0)
import com.typesafe.scalalogging.LazyLogging
=======
>>>>>>> locatelli-main
=======
<<<<<<< HEAD
=======
>>>>>>> b39bd292d4 (GEOMESA-3254 Add Bloop build support)
=======
>>>>>>> 556d966249 (GEOMESA-3246 Upgrade Arrow to 11.0.0)
=======
>>>>>>> 6c49bcd685 (GEOMESA-3246 Upgrade Arrow to 11.0.0)
=======
>>>>>>> e74fa3f690 (GEOMESA-3254 Add Bloop build support)
<<<<<<< HEAD
<<<<<<< HEAD
=======
>>>>>>> d18777a94f (GEOMESA-3246 Upgrade Arrow to 11.0.0)
=======
>>>>>>> 630900cfbb (GEOMESA-3246 Upgrade Arrow to 11.0.0)
=======
>>>>>>> 3e610250ce (GEOMESA-3254 Add Bloop build support)
=======
>>>>>>> 320759d5d3 (GEOMESA-3246 Upgrade Arrow to 11.0.0)
=======
>>>>>>> f586fec5a3 (GEOMESA-3254 Add Bloop build support)
=======
=======
>>>>>>> 6c49bcd685 (GEOMESA-3246 Upgrade Arrow to 11.0.0)
>>>>>>> 52579ffb37 (GEOMESA-3246 Upgrade Arrow to 11.0.0)
=======
>>>>>>> b39bd292d4 (GEOMESA-3254 Add Bloop build support)
=======
=======
>>>>>>> d18777a94f (GEOMESA-3246 Upgrade Arrow to 11.0.0)
>>>>>>> 556d966249 (GEOMESA-3246 Upgrade Arrow to 11.0.0)
import com.typesafe.scalalogging.LazyLogging
=======
>>>>>>> locatelli-main
=======
=======
>>>>>>> b39bd292d4 (GEOMESA-3254 Add Bloop build support)
=======
>>>>>>> 556d966249 (GEOMESA-3246 Upgrade Arrow to 11.0.0)
=======
>>>>>>> 6c49bcd685 (GEOMESA-3246 Upgrade Arrow to 11.0.0)
=======
>>>>>>> e74fa3f690 (GEOMESA-3254 Add Bloop build support)
<<<<<<< HEAD
<<<<<<< HEAD
=======
>>>>>>> d18777a94f (GEOMESA-3246 Upgrade Arrow to 11.0.0)
=======
>>>>>>> 630900cfbb (GEOMESA-3246 Upgrade Arrow to 11.0.0)
=======
>>>>>>> 3e610250ce (GEOMESA-3254 Add Bloop build support)
=======
>>>>>>> 320759d5d3 (GEOMESA-3246 Upgrade Arrow to 11.0.0)
=======
>>>>>>> f586fec5a3 (GEOMESA-3254 Add Bloop build support)
=======
=======
>>>>>>> 6c49bcd685 (GEOMESA-3246 Upgrade Arrow to 11.0.0)
>>>>>>> 52579ffb37 (GEOMESA-3246 Upgrade Arrow to 11.0.0)
=======
>>>>>>> b39bd292d4 (GEOMESA-3254 Add Bloop build support)
=======
=======
>>>>>>> d18777a94f (GEOMESA-3246 Upgrade Arrow to 11.0.0)
>>>>>>> 556d966249 (GEOMESA-3246 Upgrade Arrow to 11.0.0)
import com.typesafe.scalalogging.LazyLogging
=======
>>>>>>> locatelli-main
=======
=======
>>>>>>> b39bd292d4 (GEOMESA-3254 Add Bloop build support)
=======
>>>>>>> 556d966249 (GEOMESA-3246 Upgrade Arrow to 11.0.0)
=======
>>>>>>> 6c49bcd685 (GEOMESA-3246 Upgrade Arrow to 11.0.0)
=======
>>>>>>> e74fa3f690 (GEOMESA-3254 Add Bloop build support)
<<<<<<< HEAD
<<<<<<< HEAD
=======
>>>>>>> d18777a94f (GEOMESA-3246 Upgrade Arrow to 11.0.0)
=======
>>>>>>> 630900cfbb (GEOMESA-3246 Upgrade Arrow to 11.0.0)
=======
>>>>>>> 3e610250ce (GEOMESA-3254 Add Bloop build support)
=======
>>>>>>> 320759d5d3 (GEOMESA-3246 Upgrade Arrow to 11.0.0)
=======
>>>>>>> f586fec5a3 (GEOMESA-3254 Add Bloop build support)
=======
=======
>>>>>>> 6c49bcd685 (GEOMESA-3246 Upgrade Arrow to 11.0.0)
>>>>>>> 52579ffb37 (GEOMESA-3246 Upgrade Arrow to 11.0.0)
=======
>>>>>>> b39bd292d4 (GEOMESA-3254 Add Bloop build support)
=======
=======
>>>>>>> d18777a94f (GEOMESA-3246 Upgrade Arrow to 11.0.0)
>>>>>>> 556d966249 (GEOMESA-3246 Upgrade Arrow to 11.0.0)
import com.typesafe.scalalogging.LazyLogging
=======
>>>>>>> locatelli-main
=======
=======
>>>>>>> b39bd292d4 (GEOMESA-3254 Add Bloop build support)
=======
>>>>>>> 556d966249 (GEOMESA-3246 Upgrade Arrow to 11.0.0)
=======
>>>>>>> 6c49bcd685 (GEOMESA-3246 Upgrade Arrow to 11.0.0)
=======
>>>>>>> e74fa3f690 (GEOMESA-3254 Add Bloop build support)
<<<<<<< HEAD
<<<<<<< HEAD
=======
>>>>>>> d18777a94f (GEOMESA-3246 Upgrade Arrow to 11.0.0)
=======
>>>>>>> 630900cfbb (GEOMESA-3246 Upgrade Arrow to 11.0.0)
=======
>>>>>>> 3e610250ce (GEOMESA-3254 Add Bloop build support)
=======
>>>>>>> 320759d5d3 (GEOMESA-3246 Upgrade Arrow to 11.0.0)
=======
>>>>>>> f586fec5a3 (GEOMESA-3254 Add Bloop build support)
=======
=======
>>>>>>> 6c49bcd685 (GEOMESA-3246 Upgrade Arrow to 11.0.0)
>>>>>>> 52579ffb37 (GEOMESA-3246 Upgrade Arrow to 11.0.0)
=======
>>>>>>> b39bd292d4 (GEOMESA-3254 Add Bloop build support)
=======
=======
>>>>>>> d18777a94f (GEOMESA-3246 Upgrade Arrow to 11.0.0)
>>>>>>> 556d966249 (GEOMESA-3246 Upgrade Arrow to 11.0.0)
import com.typesafe.scalalogging.LazyLogging
=======
>>>>>>> locatelli-main
=======
=======
>>>>>>> b39bd292d4 (GEOMESA-3254 Add Bloop build support)
=======
>>>>>>> 556d966249 (GEOMESA-3246 Upgrade Arrow to 11.0.0)
=======
>>>>>>> 6c49bcd685 (GEOMESA-3246 Upgrade Arrow to 11.0.0)
=======
>>>>>>> e74fa3f690 (GEOMESA-3254 Add Bloop build support)
<<<<<<< HEAD
<<<<<<< HEAD
=======
>>>>>>> d18777a94f (GEOMESA-3246 Upgrade Arrow to 11.0.0)
=======
>>>>>>> 630900cfbb (GEOMESA-3246 Upgrade Arrow to 11.0.0)
=======
>>>>>>> 3e610250ce (GEOMESA-3254 Add Bloop build support)
=======
>>>>>>> 320759d5d3 (GEOMESA-3246 Upgrade Arrow to 11.0.0)
=======
>>>>>>> f586fec5a3 (GEOMESA-3254 Add Bloop build support)
=======
=======
>>>>>>> 6c49bcd685 (GEOMESA-3246 Upgrade Arrow to 11.0.0)
>>>>>>> 52579ffb37 (GEOMESA-3246 Upgrade Arrow to 11.0.0)
=======
>>>>>>> b39bd292d4 (GEOMESA-3254 Add Bloop build support)
=======
=======
>>>>>>> d18777a94f (GEOMESA-3246 Upgrade Arrow to 11.0.0)
>>>>>>> 556d966249 (GEOMESA-3246 Upgrade Arrow to 11.0.0)
import com.typesafe.scalalogging.LazyLogging
=======
>>>>>>> locatelli-main
=======
=======
>>>>>>> b39bd292d4 (GEOMESA-3254 Add Bloop build support)
=======
>>>>>>> 556d966249 (GEOMESA-3246 Upgrade Arrow to 11.0.0)
=======
>>>>>>> 6c49bcd685 (GEOMESA-3246 Upgrade Arrow to 11.0.0)
=======
>>>>>>> e74fa3f690 (GEOMESA-3254 Add Bloop build support)
<<<<<<< HEAD
<<<<<<< HEAD
=======
>>>>>>> d18777a94f (GEOMESA-3246 Upgrade Arrow to 11.0.0)
=======
>>>>>>> 630900cfbb (GEOMESA-3246 Upgrade Arrow to 11.0.0)
=======
>>>>>>> 3e610250ce (GEOMESA-3254 Add Bloop build support)
=======
>>>>>>> 320759d5d3 (GEOMESA-3246 Upgrade Arrow to 11.0.0)
=======
>>>>>>> f586fec5a3 (GEOMESA-3254 Add Bloop build support)
=======
=======
>>>>>>> 6c49bcd685 (GEOMESA-3246 Upgrade Arrow to 11.0.0)
>>>>>>> 52579ffb37 (GEOMESA-3246 Upgrade Arrow to 11.0.0)
=======
>>>>>>> b39bd292d4 (GEOMESA-3254 Add Bloop build support)
=======
=======
>>>>>>> d18777a94f (GEOMESA-3246 Upgrade Arrow to 11.0.0)
>>>>>>> 556d966249 (GEOMESA-3246 Upgrade Arrow to 11.0.0)
import com.typesafe.scalalogging.LazyLogging
=======
>>>>>>> locatelli-main
=======
=======
>>>>>>> b39bd292d4 (GEOMESA-3254 Add Bloop build support)
=======
>>>>>>> 556d966249 (GEOMESA-3246 Upgrade Arrow to 11.0.0)
=======
>>>>>>> 6c49bcd685 (GEOMESA-3246 Upgrade Arrow to 11.0.0)
=======
>>>>>>> e74fa3f690 (GEOMESA-3254 Add Bloop build support)
<<<<<<< HEAD
<<<<<<< HEAD
=======
>>>>>>> d18777a94f (GEOMESA-3246 Upgrade Arrow to 11.0.0)
=======
>>>>>>> 630900cfbb (GEOMESA-3246 Upgrade Arrow to 11.0.0)
=======
>>>>>>> 3e610250ce (GEOMESA-3254 Add Bloop build support)
=======
>>>>>>> 320759d5d3 (GEOMESA-3246 Upgrade Arrow to 11.0.0)
=======
>>>>>>> f586fec5a3 (GEOMESA-3254 Add Bloop build support)
=======
=======
>>>>>>> 6c49bcd685 (GEOMESA-3246 Upgrade Arrow to 11.0.0)
>>>>>>> 52579ffb37 (GEOMESA-3246 Upgrade Arrow to 11.0.0)
=======
>>>>>>> b39bd292d4 (GEOMESA-3254 Add Bloop build support)
=======
=======
>>>>>>> d18777a94f (GEOMESA-3246 Upgrade Arrow to 11.0.0)
>>>>>>> 556d966249 (GEOMESA-3246 Upgrade Arrow to 11.0.0)
import com.typesafe.scalalogging.LazyLogging
=======
>>>>>>> locatelli-main
=======
=======
>>>>>>> b39bd292d4 (GEOMESA-3254 Add Bloop build support)
=======
>>>>>>> 556d966249 (GEOMESA-3246 Upgrade Arrow to 11.0.0)
=======
>>>>>>> 6c49bcd685 (GEOMESA-3246 Upgrade Arrow to 11.0.0)
=======
>>>>>>> e74fa3f690 (GEOMESA-3254 Add Bloop build support)
<<<<<<< HEAD
<<<<<<< HEAD
=======
>>>>>>> d18777a94f (GEOMESA-3246 Upgrade Arrow to 11.0.0)
=======
>>>>>>> 630900cfbb (GEOMESA-3246 Upgrade Arrow to 11.0.0)
=======
>>>>>>> 3e610250ce (GEOMESA-3254 Add Bloop build support)
=======
>>>>>>> 320759d5d3 (GEOMESA-3246 Upgrade Arrow to 11.0.0)
=======
>>>>>>> f586fec5a3 (GEOMESA-3254 Add Bloop build support)
=======
=======
>>>>>>> 6c49bcd685 (GEOMESA-3246 Upgrade Arrow to 11.0.0)
>>>>>>> 52579ffb37 (GEOMESA-3246 Upgrade Arrow to 11.0.0)
=======
>>>>>>> b39bd292d4 (GEOMESA-3254 Add Bloop build support)
=======
=======
>>>>>>> d18777a94f (GEOMESA-3246 Upgrade Arrow to 11.0.0)
>>>>>>> 556d966249 (GEOMESA-3246 Upgrade Arrow to 11.0.0)
import com.typesafe.scalalogging.LazyLogging
=======
>>>>>>> locatelli-main
=======
=======
>>>>>>> b39bd292d4 (GEOMESA-3254 Add Bloop build support)
=======
>>>>>>> 556d966249 (GEOMESA-3246 Upgrade Arrow to 11.0.0)
=======
>>>>>>> 6c49bcd685 (GEOMESA-3246 Upgrade Arrow to 11.0.0)
=======
>>>>>>> e74fa3f690 (GEOMESA-3254 Add Bloop build support)
<<<<<<< HEAD
<<<<<<< HEAD
=======
>>>>>>> d18777a94f (GEOMESA-3246 Upgrade Arrow to 11.0.0)
=======
>>>>>>> 630900cfbb (GEOMESA-3246 Upgrade Arrow to 11.0.0)
=======
>>>>>>> 3e610250ce (GEOMESA-3254 Add Bloop build support)
=======
>>>>>>> 320759d5d3 (GEOMESA-3246 Upgrade Arrow to 11.0.0)
=======
>>>>>>> f586fec5a3 (GEOMESA-3254 Add Bloop build support)
=======
=======
>>>>>>> 6c49bcd685 (GEOMESA-3246 Upgrade Arrow to 11.0.0)
>>>>>>> 52579ffb37 (GEOMESA-3246 Upgrade Arrow to 11.0.0)
=======
>>>>>>> b39bd292d4 (GEOMESA-3254 Add Bloop build support)
=======
=======
>>>>>>> d18777a94f (GEOMESA-3246 Upgrade Arrow to 11.0.0)
>>>>>>> 556d966249 (GEOMESA-3246 Upgrade Arrow to 11.0.0)
import com.typesafe.scalalogging.LazyLogging
=======
>>>>>>> locatelli-main
=======
=======
>>>>>>> b39bd292d4 (GEOMESA-3254 Add Bloop build support)
=======
>>>>>>> 556d966249 (GEOMESA-3246 Upgrade Arrow to 11.0.0)
=======
>>>>>>> 6c49bcd685 (GEOMESA-3246 Upgrade Arrow to 11.0.0)
=======
>>>>>>> e74fa3f690 (GEOMESA-3254 Add Bloop build support)
<<<<<<< HEAD
<<<<<<< HEAD
=======
>>>>>>> d18777a94f (GEOMESA-3246 Upgrade Arrow to 11.0.0)
=======
>>>>>>> 630900cfbb (GEOMESA-3246 Upgrade Arrow to 11.0.0)
=======
>>>>>>> 3e610250ce (GEOMESA-3254 Add Bloop build support)
=======
>>>>>>> 320759d5d3 (GEOMESA-3246 Upgrade Arrow to 11.0.0)
=======
>>>>>>> f586fec5a3 (GEOMESA-3254 Add Bloop build support)
=======
=======
>>>>>>> 6c49bcd685 (GEOMESA-3246 Upgrade Arrow to 11.0.0)
>>>>>>> 52579ffb37 (GEOMESA-3246 Upgrade Arrow to 11.0.0)
=======
>>>>>>> b39bd292d4 (GEOMESA-3254 Add Bloop build support)
=======
=======
>>>>>>> d18777a94f (GEOMESA-3246 Upgrade Arrow to 11.0.0)
>>>>>>> 556d966249 (GEOMESA-3246 Upgrade Arrow to 11.0.0)
import com.typesafe.scalalogging.LazyLogging
=======
>>>>>>> locatelli-main
=======
=======
>>>>>>> b39bd292d4 (GEOMESA-3254 Add Bloop build support)
=======
>>>>>>> 556d966249 (GEOMESA-3246 Upgrade Arrow to 11.0.0)
=======
>>>>>>> 6c49bcd685 (GEOMESA-3246 Upgrade Arrow to 11.0.0)
=======
>>>>>>> e74fa3f690 (GEOMESA-3254 Add Bloop build support)
<<<<<<< HEAD
<<<<<<< HEAD
=======
>>>>>>> d18777a94f (GEOMESA-3246 Upgrade Arrow to 11.0.0)
=======
>>>>>>> 630900cfbb (GEOMESA-3246 Upgrade Arrow to 11.0.0)
=======
>>>>>>> 3e610250ce (GEOMESA-3254 Add Bloop build support)
=======
>>>>>>> 320759d5d3 (GEOMESA-3246 Upgrade Arrow to 11.0.0)
=======
>>>>>>> f586fec5a3 (GEOMESA-3254 Add Bloop build support)
=======
=======
>>>>>>> 6c49bcd685 (GEOMESA-3246 Upgrade Arrow to 11.0.0)
>>>>>>> 52579ffb37 (GEOMESA-3246 Upgrade Arrow to 11.0.0)
=======
>>>>>>> b39bd292d4 (GEOMESA-3254 Add Bloop build support)
=======
=======
>>>>>>> d18777a94f (GEOMESA-3246 Upgrade Arrow to 11.0.0)
>>>>>>> 556d966249 (GEOMESA-3246 Upgrade Arrow to 11.0.0)
import com.typesafe.scalalogging.LazyLogging
=======
>>>>>>> locatelli-main
=======
=======
>>>>>>> b39bd292d4 (GEOMESA-3254 Add Bloop build support)
=======
>>>>>>> 556d966249 (GEOMESA-3246 Upgrade Arrow to 11.0.0)
=======
>>>>>>> 6c49bcd685 (GEOMESA-3246 Upgrade Arrow to 11.0.0)
=======
>>>>>>> e74fa3f690 (GEOMESA-3254 Add Bloop build support)
<<<<<<< HEAD
<<<<<<< HEAD
=======
>>>>>>> d18777a94f (GEOMESA-3246 Upgrade Arrow to 11.0.0)
=======
>>>>>>> 630900cfbb (GEOMESA-3246 Upgrade Arrow to 11.0.0)
=======
>>>>>>> 3e610250ce (GEOMESA-3254 Add Bloop build support)
=======
>>>>>>> 320759d5d3 (GEOMESA-3246 Upgrade Arrow to 11.0.0)
=======
>>>>>>> f586fec5a3 (GEOMESA-3254 Add Bloop build support)
=======
=======
>>>>>>> 6c49bcd685 (GEOMESA-3246 Upgrade Arrow to 11.0.0)
>>>>>>> 52579ffb37 (GEOMESA-3246 Upgrade Arrow to 11.0.0)
=======
>>>>>>> b39bd292d4 (GEOMESA-3254 Add Bloop build support)
=======
=======
>>>>>>> d18777a94f (GEOMESA-3246 Upgrade Arrow to 11.0.0)
>>>>>>> 556d966249 (GEOMESA-3246 Upgrade Arrow to 11.0.0)
import com.typesafe.scalalogging.LazyLogging
=======
>>>>>>> locatelli-main
=======
=======
>>>>>>> b39bd292d4 (GEOMESA-3254 Add Bloop build support)
=======
>>>>>>> 556d966249 (GEOMESA-3246 Upgrade Arrow to 11.0.0)
=======
>>>>>>> 6c49bcd685 (GEOMESA-3246 Upgrade Arrow to 11.0.0)
=======
>>>>>>> e74fa3f690 (GEOMESA-3254 Add Bloop build support)
<<<<<<< HEAD
<<<<<<< HEAD
=======
>>>>>>> d18777a94f (GEOMESA-3246 Upgrade Arrow to 11.0.0)
=======
>>>>>>> 630900cfbb (GEOMESA-3246 Upgrade Arrow to 11.0.0)
=======
>>>>>>> 3e610250ce (GEOMESA-3254 Add Bloop build support)
=======
>>>>>>> 320759d5d3 (GEOMESA-3246 Upgrade Arrow to 11.0.0)
=======
>>>>>>> f586fec5a3 (GEOMESA-3254 Add Bloop build support)
=======
=======
>>>>>>> 6c49bcd685 (GEOMESA-3246 Upgrade Arrow to 11.0.0)
>>>>>>> 52579ffb37 (GEOMESA-3246 Upgrade Arrow to 11.0.0)
=======
>>>>>>> b39bd292d4 (GEOMESA-3254 Add Bloop build support)
=======
=======
>>>>>>> d18777a94f (GEOMESA-3246 Upgrade Arrow to 11.0.0)
>>>>>>> 556d966249 (GEOMESA-3246 Upgrade Arrow to 11.0.0)
import com.typesafe.scalalogging.LazyLogging
=======
>>>>>>> locatelli-main
=======
=======
>>>>>>> b39bd292d4 (GEOMESA-3254 Add Bloop build support)
=======
>>>>>>> 556d966249 (GEOMESA-3246 Upgrade Arrow to 11.0.0)
=======
>>>>>>> 6c49bcd685 (GEOMESA-3246 Upgrade Arrow to 11.0.0)
=======
>>>>>>> e74fa3f690 (GEOMESA-3254 Add Bloop build support)
<<<<<<< HEAD
<<<<<<< HEAD
=======
>>>>>>> d18777a94f (GEOMESA-3246 Upgrade Arrow to 11.0.0)
=======
>>>>>>> 630900cfbb (GEOMESA-3246 Upgrade Arrow to 11.0.0)
=======
>>>>>>> 3e610250ce (GEOMESA-3254 Add Bloop build support)
=======
>>>>>>> 320759d5d3 (GEOMESA-3246 Upgrade Arrow to 11.0.0)
=======
>>>>>>> f586fec5a3 (GEOMESA-3254 Add Bloop build support)
=======
=======
>>>>>>> 6c49bcd685 (GEOMESA-3246 Upgrade Arrow to 11.0.0)
>>>>>>> 52579ffb37 (GEOMESA-3246 Upgrade Arrow to 11.0.0)
=======
>>>>>>> b39bd292d4 (GEOMESA-3254 Add Bloop build support)
=======
=======
>>>>>>> d18777a94f (GEOMESA-3246 Upgrade Arrow to 11.0.0)
>>>>>>> 556d966249 (GEOMESA-3246 Upgrade Arrow to 11.0.0)
import com.typesafe.scalalogging.LazyLogging
=======
>>>>>>> locatelli-main
=======
=======
>>>>>>> b39bd292d4 (GEOMESA-3254 Add Bloop build support)
=======
>>>>>>> 556d966249 (GEOMESA-3246 Upgrade Arrow to 11.0.0)
=======
>>>>>>> 6c49bcd685 (GEOMESA-3246 Upgrade Arrow to 11.0.0)
=======
>>>>>>> e74fa3f690 (GEOMESA-3254 Add Bloop build support)
<<<<<<< HEAD
<<<<<<< HEAD
=======
>>>>>>> d18777a94f (GEOMESA-3246 Upgrade Arrow to 11.0.0)
=======
>>>>>>> 630900cfbb (GEOMESA-3246 Upgrade Arrow to 11.0.0)
=======
>>>>>>> 3e610250ce (GEOMESA-3254 Add Bloop build support)
=======
>>>>>>> 320759d5d3 (GEOMESA-3246 Upgrade Arrow to 11.0.0)
=======
>>>>>>> f586fec5a3 (GEOMESA-3254 Add Bloop build support)
=======
=======
>>>>>>> 6c49bcd685 (GEOMESA-3246 Upgrade Arrow to 11.0.0)
>>>>>>> 52579ffb37 (GEOMESA-3246 Upgrade Arrow to 11.0.0)
=======
>>>>>>> b39bd292d4 (GEOMESA-3254 Add Bloop build support)
=======
=======
>>>>>>> d18777a94f (GEOMESA-3246 Upgrade Arrow to 11.0.0)
>>>>>>> 556d966249 (GEOMESA-3246 Upgrade Arrow to 11.0.0)
import com.typesafe.scalalogging.LazyLogging
=======
>>>>>>> locatelli-main
=======
=======
>>>>>>> b39bd292d4 (GEOMESA-3254 Add Bloop build support)
=======
>>>>>>> 556d966249 (GEOMESA-3246 Upgrade Arrow to 11.0.0)
=======
>>>>>>> 6c49bcd685 (GEOMESA-3246 Upgrade Arrow to 11.0.0)
=======
>>>>>>> e74fa3f690 (GEOMESA-3254 Add Bloop build support)
<<<<<<< HEAD
<<<<<<< HEAD
=======
>>>>>>> d18777a94f (GEOMESA-3246 Upgrade Arrow to 11.0.0)
=======
>>>>>>> 630900cfbb (GEOMESA-3246 Upgrade Arrow to 11.0.0)
=======
>>>>>>> 3e610250ce (GEOMESA-3254 Add Bloop build support)
=======
>>>>>>> 320759d5d3 (GEOMESA-3246 Upgrade Arrow to 11.0.0)
=======
>>>>>>> f586fec5a3 (GEOMESA-3254 Add Bloop build support)
=======
=======
>>>>>>> 6c49bcd685 (GEOMESA-3246 Upgrade Arrow to 11.0.0)
>>>>>>> 52579ffb37 (GEOMESA-3246 Upgrade Arrow to 11.0.0)
=======
>>>>>>> b39bd292d4 (GEOMESA-3254 Add Bloop build support)
=======
=======
>>>>>>> d18777a94f (GEOMESA-3246 Upgrade Arrow to 11.0.0)
>>>>>>> 556d966249 (GEOMESA-3246 Upgrade Arrow to 11.0.0)
import com.typesafe.scalalogging.LazyLogging
=======
>>>>>>> locatelli-main
=======
=======
>>>>>>> b39bd292d4 (GEOMESA-3254 Add Bloop build support)
=======
>>>>>>> 556d966249 (GEOMESA-3246 Upgrade Arrow to 11.0.0)
=======
>>>>>>> 6c49bcd685 (GEOMESA-3246 Upgrade Arrow to 11.0.0)
=======
>>>>>>> e74fa3f690 (GEOMESA-3254 Add Bloop build support)
<<<<<<< HEAD
<<<<<<< HEAD
=======
>>>>>>> d18777a94f (GEOMESA-3246 Upgrade Arrow to 11.0.0)
=======
>>>>>>> 630900cfbb (GEOMESA-3246 Upgrade Arrow to 11.0.0)
=======
>>>>>>> 3e610250ce (GEOMESA-3254 Add Bloop build support)
=======
>>>>>>> 320759d5d3 (GEOMESA-3246 Upgrade Arrow to 11.0.0)
=======
>>>>>>> f586fec5a3 (GEOMESA-3254 Add Bloop build support)
=======
=======
>>>>>>> 6c49bcd685 (GEOMESA-3246 Upgrade Arrow to 11.0.0)
>>>>>>> 52579ffb37 (GEOMESA-3246 Upgrade Arrow to 11.0.0)
=======
>>>>>>> b39bd292d4 (GEOMESA-3254 Add Bloop build support)
=======
=======
>>>>>>> d18777a94f (GEOMESA-3246 Upgrade Arrow to 11.0.0)
>>>>>>> 556d966249 (GEOMESA-3246 Upgrade Arrow to 11.0.0)
import com.typesafe.scalalogging.LazyLogging
=======
>>>>>>> locatelli-main
=======
=======
>>>>>>> b39bd292d4 (GEOMESA-3254 Add Bloop build support)
=======
>>>>>>> 556d966249 (GEOMESA-3246 Upgrade Arrow to 11.0.0)
=======
>>>>>>> 6c49bcd685 (GEOMESA-3246 Upgrade Arrow to 11.0.0)
=======
>>>>>>> e74fa3f690 (GEOMESA-3254 Add Bloop build support)
<<<<<<< HEAD
<<<<<<< HEAD
=======
>>>>>>> d18777a94f (GEOMESA-3246 Upgrade Arrow to 11.0.0)
=======
>>>>>>> 630900cfbb (GEOMESA-3246 Upgrade Arrow to 11.0.0)
=======
>>>>>>> 3e610250ce (GEOMESA-3254 Add Bloop build support)
=======
>>>>>>> 320759d5d3 (GEOMESA-3246 Upgrade Arrow to 11.0.0)
=======
>>>>>>> f586fec5a3 (GEOMESA-3254 Add Bloop build support)
=======
=======
>>>>>>> 6c49bcd685 (GEOMESA-3246 Upgrade Arrow to 11.0.0)
>>>>>>> 52579ffb37 (GEOMESA-3246 Upgrade Arrow to 11.0.0)
=======
>>>>>>> b39bd292d4 (GEOMESA-3254 Add Bloop build support)
=======
=======
>>>>>>> d18777a94f (GEOMESA-3246 Upgrade Arrow to 11.0.0)
>>>>>>> 556d966249 (GEOMESA-3246 Upgrade Arrow to 11.0.0)
import com.typesafe.scalalogging.LazyLogging
=======
>>>>>>> locatelli-main
=======
=======
>>>>>>> b39bd292d4 (GEOMESA-3254 Add Bloop build support)
=======
>>>>>>> 556d966249 (GEOMESA-3246 Upgrade Arrow to 11.0.0)
=======
>>>>>>> 6c49bcd685 (GEOMESA-3246 Upgrade Arrow to 11.0.0)
=======
>>>>>>> e74fa3f690 (GEOMESA-3254 Add Bloop build support)
<<<<<<< HEAD
<<<<<<< HEAD
=======
>>>>>>> d18777a94f (GEOMESA-3246 Upgrade Arrow to 11.0.0)
=======
>>>>>>> 630900cfbb (GEOMESA-3246 Upgrade Arrow to 11.0.0)
=======
>>>>>>> 3e610250ce (GEOMESA-3254 Add Bloop build support)
=======
>>>>>>> 320759d5d3 (GEOMESA-3246 Upgrade Arrow to 11.0.0)
=======
>>>>>>> f586fec5a3 (GEOMESA-3254 Add Bloop build support)
=======
=======
>>>>>>> 6c49bcd685 (GEOMESA-3246 Upgrade Arrow to 11.0.0)
>>>>>>> 52579ffb37 (GEOMESA-3246 Upgrade Arrow to 11.0.0)
=======
>>>>>>> b39bd292d4 (GEOMESA-3254 Add Bloop build support)
=======
=======
>>>>>>> d18777a94f (GEOMESA-3246 Upgrade Arrow to 11.0.0)
>>>>>>> 556d966249 (GEOMESA-3246 Upgrade Arrow to 11.0.0)
import com.typesafe.scalalogging.LazyLogging
=======
>>>>>>> locatelli-main
=======
=======
>>>>>>> b39bd292d4 (GEOMESA-3254 Add Bloop build support)
=======
>>>>>>> 556d966249 (GEOMESA-3246 Upgrade Arrow to 11.0.0)
=======
>>>>>>> 6c49bcd685 (GEOMESA-3246 Upgrade Arrow to 11.0.0)
=======
>>>>>>> e74fa3f690 (GEOMESA-3254 Add Bloop build support)
<<<<<<< HEAD
<<<<<<< HEAD
=======
>>>>>>> d18777a94f (GEOMESA-3246 Upgrade Arrow to 11.0.0)
=======
>>>>>>> 630900cfbb (GEOMESA-3246 Upgrade Arrow to 11.0.0)
=======
>>>>>>> 3e610250ce (GEOMESA-3254 Add Bloop build support)
=======
>>>>>>> 320759d5d3 (GEOMESA-3246 Upgrade Arrow to 11.0.0)
=======
>>>>>>> f586fec5a3 (GEOMESA-3254 Add Bloop build support)
=======
=======
>>>>>>> 6c49bcd685 (GEOMESA-3246 Upgrade Arrow to 11.0.0)
>>>>>>> 52579ffb37 (GEOMESA-3246 Upgrade Arrow to 11.0.0)
=======
>>>>>>> b39bd292d4 (GEOMESA-3254 Add Bloop build support)
=======
=======
>>>>>>> d18777a94f (GEOMESA-3246 Upgrade Arrow to 11.0.0)
>>>>>>> 556d966249 (GEOMESA-3246 Upgrade Arrow to 11.0.0)
import com.typesafe.scalalogging.LazyLogging
=======
>>>>>>> locatelli-main
=======
=======
>>>>>>> b39bd292d4 (GEOMESA-3254 Add Bloop build support)
=======
>>>>>>> 556d966249 (GEOMESA-3246 Upgrade Arrow to 11.0.0)
=======
>>>>>>> 6c49bcd685 (GEOMESA-3246 Upgrade Arrow to 11.0.0)
=======
>>>>>>> e74fa3f690 (GEOMESA-3254 Add Bloop build support)
<<<<<<< HEAD
<<<<<<< HEAD
=======
>>>>>>> d18777a94f (GEOMESA-3246 Upgrade Arrow to 11.0.0)
=======
>>>>>>> 630900cfbb (GEOMESA-3246 Upgrade Arrow to 11.0.0)
=======
>>>>>>> 3e610250ce (GEOMESA-3254 Add Bloop build support)
=======
>>>>>>> 320759d5d3 (GEOMESA-3246 Upgrade Arrow to 11.0.0)
=======
>>>>>>> f586fec5a3 (GEOMESA-3254 Add Bloop build support)
=======
=======
>>>>>>> 6c49bcd685 (GEOMESA-3246 Upgrade Arrow to 11.0.0)
>>>>>>> 52579ffb37 (GEOMESA-3246 Upgrade Arrow to 11.0.0)
=======
>>>>>>> b39bd292d4 (GEOMESA-3254 Add Bloop build support)
=======
=======
>>>>>>> d18777a94f (GEOMESA-3246 Upgrade Arrow to 11.0.0)
>>>>>>> 556d966249 (GEOMESA-3246 Upgrade Arrow to 11.0.0)
import com.typesafe.scalalogging.LazyLogging
=======
>>>>>>> locatelli-main
=======
=======
>>>>>>> b39bd292d4 (GEOMESA-3254 Add Bloop build support)
=======
>>>>>>> 556d966249 (GEOMESA-3246 Upgrade Arrow to 11.0.0)
=======
>>>>>>> 6c49bcd685 (GEOMESA-3246 Upgrade Arrow to 11.0.0)
=======
>>>>>>> e74fa3f690 (GEOMESA-3254 Add Bloop build support)
<<<<<<< HEAD
<<<<<<< HEAD
=======
>>>>>>> d18777a94f (GEOMESA-3246 Upgrade Arrow to 11.0.0)
=======
>>>>>>> 630900cfbb (GEOMESA-3246 Upgrade Arrow to 11.0.0)
=======
>>>>>>> 3e610250ce (GEOMESA-3254 Add Bloop build support)
=======
>>>>>>> 320759d5d3 (GEOMESA-3246 Upgrade Arrow to 11.0.0)
=======
>>>>>>> f586fec5a3 (GEOMESA-3254 Add Bloop build support)
=======
=======
>>>>>>> 6c49bcd685 (GEOMESA-3246 Upgrade Arrow to 11.0.0)
>>>>>>> 52579ffb37 (GEOMESA-3246 Upgrade Arrow to 11.0.0)
=======
>>>>>>> b39bd292d4 (GEOMESA-3254 Add Bloop build support)
=======
=======
>>>>>>> d18777a94f (GEOMESA-3246 Upgrade Arrow to 11.0.0)
>>>>>>> 556d966249 (GEOMESA-3246 Upgrade Arrow to 11.0.0)
import com.typesafe.scalalogging.LazyLogging
=======
>>>>>>> locatelli-main
>>>>>>> 58d14a257e (GEOMESA-3254 Add Bloop build support)
=======
import com.typesafe.scalalogging.LazyLogging
>>>>>>> a928f2f739 (GEOMESA-3246 Upgrade Arrow to 11.0.0)
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
>>>>>>> e74fa3f690 (GEOMESA-3254 Add Bloop build support)
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
>>>>>>> e74fa3f690 (GEOMESA-3254 Add Bloop build support)
<<<<<<< HEAD
>>>>>>> locatelli-main
=======
>>>>>>> locatelli-main
=======
>>>>>>> locatelli-main
=======
<<<<<<< HEAD
=======
>>>>>>> e74fa3f690 (GEOMESA-3254 Add Bloop build support)
>>>>>>> locatelli-main
=======
>>>>>>> e74fa3f690 (GEOMESA-3254 Add Bloop build support)
>>>>>>> locatelli-main
=======
>>>>>>> e74fa3f690 (GEOMESA-3254 Add Bloop build support)
>>>>>>> locatelli-main
=======
>>>>>>> e74fa3f690 (GEOMESA-3254 Add Bloop build support)
>>>>>>> locatelli-main
=======
>>>>>>> e74fa3f690 (GEOMESA-3254 Add Bloop build support)
>>>>>>> locatelli-main
=======
>>>>>>> e74fa3f690 (GEOMESA-3254 Add Bloop build support)
>>>>>>> locatelli-main
=======
>>>>>>> e74fa3f690 (GEOMESA-3254 Add Bloop build support)
>>>>>>> locatelli-main
=======
>>>>>>> e74fa3f690 (GEOMESA-3254 Add Bloop build support)
>>>>>>> locatelli-main
=======
>>>>>>> e74fa3f690 (GEOMESA-3254 Add Bloop build support)
>>>>>>> locatelli-main
=======
>>>>>>> e74fa3f690 (GEOMESA-3254 Add Bloop build support)
>>>>>>> locatelli-main
=======
>>>>>>> e74fa3f690 (GEOMESA-3254 Add Bloop build support)
>>>>>>> locatelli-main
=======
>>>>>>> e74fa3f690 (GEOMESA-3254 Add Bloop build support)
>>>>>>> locatelli-main
=======
>>>>>>> e74fa3f690 (GEOMESA-3254 Add Bloop build support)
>>>>>>> locatelli-main
=======
>>>>>>> e74fa3f690 (GEOMESA-3254 Add Bloop build support)
>>>>>>> locatelli-main
=======
>>>>>>> e74fa3f690 (GEOMESA-3254 Add Bloop build support)
>>>>>>> locatelli-main
=======
>>>>>>> e74fa3f690 (GEOMESA-3254 Add Bloop build support)
>>>>>>> locatelli-main
=======
>>>>>>> e74fa3f690 (GEOMESA-3254 Add Bloop build support)
>>>>>>> locatelli-main
=======
>>>>>>> e74fa3f690 (GEOMESA-3254 Add Bloop build support)
>>>>>>> locatelli-main
=======
>>>>>>> e74fa3f690 (GEOMESA-3254 Add Bloop build support)
>>>>>>> locatelli-main
=======
>>>>>>> e74fa3f690 (GEOMESA-3254 Add Bloop build support)
>>>>>>> locatelli-main
=======
>>>>>>> e74fa3f690 (GEOMESA-3254 Add Bloop build support)
>>>>>>> locatelli-main
=======
>>>>>>> e74fa3f690 (GEOMESA-3254 Add Bloop build support)
>>>>>>> locatelli-main
=======
>>>>>>> e74fa3f690 (GEOMESA-3254 Add Bloop build support)
>>>>>>> locatelli-main
=======
>>>>>>> e74fa3f690 (GEOMESA-3254 Add Bloop build support)
>>>>>>> locatelli-main
=======
>>>>>>> e74fa3f690 (GEOMESA-3254 Add Bloop build support)
>>>>>>> locatelli-main
=======
>>>>>>> e74fa3f690 (GEOMESA-3254 Add Bloop build support)
>>>>>>> locatelli-main
=======
>>>>>>> e74fa3f690 (GEOMESA-3254 Add Bloop build support)
>>>>>>> locatelli-main
=======
>>>>>>> e74fa3f690 (GEOMESA-3254 Add Bloop build support)
>>>>>>> locatelli-main
=======
>>>>>>> e74fa3f690 (GEOMESA-3254 Add Bloop build support)
>>>>>>> locatelli-main
=======
>>>>>>> 3e610250ce (GEOMESA-3254 Add Bloop build support)
=======
>>>>>>> 52579ffb37 (GEOMESA-3246 Upgrade Arrow to 11.0.0)
=======
=======
>>>>>>> e74fa3f690 (GEOMESA-3254 Add Bloop build support)
>>>>>>> b39bd292d4 (GEOMESA-3254 Add Bloop build support)
<<<<<<< HEAD
<<<<<<< HEAD
<<<<<<< HEAD
<<<<<<< HEAD
<<<<<<< HEAD
<<<<<<< HEAD
<<<<<<< HEAD
<<<<<<< HEAD
<<<<<<< HEAD
<<<<<<< HEAD
<<<<<<< HEAD
<<<<<<< HEAD
<<<<<<< HEAD
<<<<<<< HEAD
<<<<<<< HEAD
<<<<<<< HEAD
<<<<<<< HEAD
<<<<<<< HEAD
<<<<<<< HEAD
<<<<<<< HEAD
<<<<<<< HEAD
<<<<<<< HEAD
<<<<<<< HEAD
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
import com.typesafe.scalalogging.LazyLogging
=======
>>>>>>> 58d14a257 (GEOMESA-3254 Add Bloop build support)
>>>>>>> fa60953a42 (GEOMESA-3254 Add Bloop build support)
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
import com.typesafe.scalalogging.LazyLogging
=======
>>>>>>> location-main
=======
=======
<<<<<<< HEAD
<<<<<<< HEAD
<<<<<<< HEAD
>>>>>>> locatelli-main
<<<<<<< HEAD
=======
<<<<<<< HEAD
<<<<<<< HEAD
<<<<<<< HEAD
>>>>>>> locatelli-main
=======
>>>>>>> locatelli-main
<<<<<<< HEAD
=======
>>>>>>> d18777a94f (GEOMESA-3246 Upgrade Arrow to 11.0.0)
=======
<<<<<<< HEAD
<<<<<<< HEAD
<<<<<<< HEAD
import com.typesafe.scalalogging.LazyLogging
=======
>>>>>>> locationtech-main
=======
=======
>>>>>>> locatelli-main
=======
<<<<<<< HEAD
=======
>>>>>>> locatelli-main
<<<<<<< HEAD
<<<<<<< HEAD
=======
>>>>>>> d18777a94f (GEOMESA-3246 Upgrade Arrow to 11.0.0)
=======
<<<<<<< HEAD
>>>>>>> locatelli-main
=======
>>>>>>> locatelli-main
=======
>>>>>>> locatelli-main
=======
>>>>>>> d18777a94f (GEOMESA-3246 Upgrade Arrow to 11.0.0)
=======
>>>>>>> locatelli-main
=======
>>>>>>> d18777a94f (GEOMESA-3246 Upgrade Arrow to 11.0.0)
=======
>>>>>>> locatelli-main
=======
>>>>>>> d18777a94f (GEOMESA-3246 Upgrade Arrow to 11.0.0)
=======
>>>>>>> locatelli-main
=======
>>>>>>> d18777a94f (GEOMESA-3246 Upgrade Arrow to 11.0.0)
=======
>>>>>>> locatelli-main
=======
>>>>>>> d18777a94f (GEOMESA-3246 Upgrade Arrow to 11.0.0)
=======
>>>>>>> locatelli-main
=======
>>>>>>> d18777a94f (GEOMESA-3246 Upgrade Arrow to 11.0.0)
=======
>>>>>>> locatelli-main
=======
>>>>>>> d18777a94f (GEOMESA-3246 Upgrade Arrow to 11.0.0)
=======
>>>>>>> locatelli-main
=======
>>>>>>> d18777a94f (GEOMESA-3246 Upgrade Arrow to 11.0.0)
=======
>>>>>>> locatelli-main
=======
>>>>>>> d18777a94f (GEOMESA-3246 Upgrade Arrow to 11.0.0)
=======
>>>>>>> locatelli-main
=======
>>>>>>> d18777a94f (GEOMESA-3246 Upgrade Arrow to 11.0.0)
=======
>>>>>>> locatelli-main
=======
>>>>>>> d18777a94f (GEOMESA-3246 Upgrade Arrow to 11.0.0)
=======
>>>>>>> locatelli-main
=======
>>>>>>> d18777a94f (GEOMESA-3246 Upgrade Arrow to 11.0.0)
=======
>>>>>>> locatelli-main
=======
>>>>>>> d18777a94f (GEOMESA-3246 Upgrade Arrow to 11.0.0)
=======
>>>>>>> locatelli-main
=======
>>>>>>> d18777a94f (GEOMESA-3246 Upgrade Arrow to 11.0.0)
=======
>>>>>>> locatelli-main
=======
>>>>>>> d18777a94f (GEOMESA-3246 Upgrade Arrow to 11.0.0)
=======
>>>>>>> locatelli-main
=======
>>>>>>> d18777a94f (GEOMESA-3246 Upgrade Arrow to 11.0.0)
=======
>>>>>>> locatelli-main
=======
>>>>>>> d18777a94f (GEOMESA-3246 Upgrade Arrow to 11.0.0)
=======
>>>>>>> locatelli-main
=======
>>>>>>> d18777a94f (GEOMESA-3246 Upgrade Arrow to 11.0.0)
=======
>>>>>>> locatelli-main
=======
>>>>>>> d18777a94f (GEOMESA-3246 Upgrade Arrow to 11.0.0)
=======
>>>>>>> locatelli-main
=======
>>>>>>> d18777a94f (GEOMESA-3246 Upgrade Arrow to 11.0.0)
=======
>>>>>>> locatelli-main
=======
>>>>>>> d18777a94f (GEOMESA-3246 Upgrade Arrow to 11.0.0)
=======
>>>>>>> locatelli-main
=======
>>>>>>> d18777a94f (GEOMESA-3246 Upgrade Arrow to 11.0.0)
=======
>>>>>>> locatelli-main
=======
>>>>>>> d18777a94f (GEOMESA-3246 Upgrade Arrow to 11.0.0)
=======
>>>>>>> locatelli-main
=======
>>>>>>> d18777a94f (GEOMESA-3246 Upgrade Arrow to 11.0.0)
=======
>>>>>>> locatelli-main
=======
>>>>>>> d18777a94f (GEOMESA-3246 Upgrade Arrow to 11.0.0)
=======
>>>>>>> locatelli-main
=======
>>>>>>> d18777a94f (GEOMESA-3246 Upgrade Arrow to 11.0.0)
=======
>>>>>>> locatelli-main
=======
>>>>>>> d18777a94f (GEOMESA-3246 Upgrade Arrow to 11.0.0)
=======
>>>>>>> locatelli-main
=======
>>>>>>> d18777a94f (GEOMESA-3246 Upgrade Arrow to 11.0.0)
=======
>>>>>>> locatelli-main
>>>>>>> 320759d5d3 (GEOMESA-3246 Upgrade Arrow to 11.0.0)
=======
>>>>>>> b39bd292d4 (GEOMESA-3254 Add Bloop build support)
=======
=======
>>>>>>> d18777a94f (GEOMESA-3246 Upgrade Arrow to 11.0.0)
>>>>>>> 556d966249 (GEOMESA-3246 Upgrade Arrow to 11.0.0)
=======
import com.typesafe.scalalogging.LazyLogging
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
>>>>>>> 58d14a257 (GEOMESA-3254 Add Bloop build support)
=======
import com.typesafe.scalalogging.LazyLogging
>>>>>>> a928f2f73 (GEOMESA-3246 Upgrade Arrow to 11.0.0)
<<<<<<< HEAD
<<<<<<< HEAD
<<<<<<< HEAD
<<<<<<< HEAD
<<<<<<< HEAD
<<<<<<< HEAD
<<<<<<< HEAD
<<<<<<< HEAD
<<<<<<< HEAD
<<<<<<< HEAD
<<<<<<< HEAD
<<<<<<< HEAD
<<<<<<< HEAD
<<<<<<< HEAD
<<<<<<< HEAD
<<<<<<< HEAD
<<<<<<< HEAD
<<<<<<< HEAD
<<<<<<< HEAD
<<<<<<< HEAD
<<<<<<< HEAD
<<<<<<< HEAD
<<<<<<< HEAD
<<<<<<< HEAD
<<<<<<< HEAD
<<<<<<< HEAD
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
>>>>>>> 05a1868e90 (GEOMESA-3246 Upgrade Arrow to 11.0.0)
>>>>>>> location-main
=======
>>>>>>> 05a1868e90 (GEOMESA-3246 Upgrade Arrow to 11.0.0)
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
>>>>>>> 05a1868e90 (GEOMESA-3246 Upgrade Arrow to 11.0.0)
<<<<<<< HEAD
<<<<<<< HEAD
<<<<<<< HEAD
<<<<<<< HEAD
=======
>>>>>>> f586fec5a3 (GEOMESA-3254 Add Bloop build support)
=======
>>>>>>> 556d966249 (GEOMESA-3246 Upgrade Arrow to 11.0.0)
<<<<<<< HEAD
<<<<<<< HEAD
<<<<<<< HEAD
<<<<<<< HEAD
<<<<<<< HEAD
<<<<<<< HEAD
<<<<<<< HEAD
<<<<<<< HEAD
<<<<<<< HEAD
<<<<<<< HEAD
<<<<<<< HEAD
<<<<<<< HEAD
<<<<<<< HEAD
<<<<<<< HEAD
<<<<<<< HEAD
<<<<<<< HEAD
<<<<<<< HEAD
<<<<<<< HEAD
<<<<<<< HEAD
<<<<<<< HEAD
<<<<<<< HEAD
<<<<<<< HEAD
<<<<<<< HEAD
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
import com.typesafe.scalalogging.LazyLogging
=======
>>>>>>> 58d14a257e (GEOMESA-3254 Add Bloop build support)
>>>>>>> 7564665969 (GEOMESA-3254 Add Bloop build support)
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
>>>>>>> 6c49bcd685 (GEOMESA-3246 Upgrade Arrow to 11.0.0)
=======
>>>>>>> e74fa3f690 (GEOMESA-3254 Add Bloop build support)
<<<<<<< HEAD
<<<<<<< HEAD
=======
>>>>>>> d18777a94f (GEOMESA-3246 Upgrade Arrow to 11.0.0)
<<<<<<< HEAD
<<<<<<< HEAD
<<<<<<< HEAD
<<<<<<< HEAD
<<<<<<< HEAD
<<<<<<< HEAD
<<<<<<< HEAD
<<<<<<< HEAD
<<<<<<< HEAD
<<<<<<< HEAD
<<<<<<< HEAD
<<<<<<< HEAD
<<<<<<< HEAD
<<<<<<< HEAD
<<<<<<< HEAD
<<<<<<< HEAD
<<<<<<< HEAD
<<<<<<< HEAD
<<<<<<< HEAD
<<<<<<< HEAD
<<<<<<< HEAD
<<<<<<< HEAD
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
>>>>>>> d18777a94f (GEOMESA-3246 Upgrade Arrow to 11.0.0)
=======
>>>>>>> locatelli-main
=======
>>>>>>> locatelli-main
=======
>>>>>>> locatelli-main
=======
>>>>>>> locatelli-main
=======
>>>>>>> locatelli-main
=======
>>>>>>> locatelli-main
=======
>>>>>>> locatelli-main
=======
>>>>>>> locatelli-main
=======
>>>>>>> locatelli-main
=======
>>>>>>> locatelli-main
=======
>>>>>>> locatelli-main
=======
>>>>>>> locatelli-main
=======
>>>>>>> locatelli-main
=======
>>>>>>> locatelli-main
=======
>>>>>>> locatelli-main
=======
>>>>>>> locatelli-main
=======
>>>>>>> locatelli-main
=======
>>>>>>> locatelli-main
=======
>>>>>>> locatelli-main
=======
>>>>>>> locatelli-main
=======
>>>>>>> locatelli-main
=======
>>>>>>> locatelli-main
=======
>>>>>>> locatelli-main
=======
>>>>>>> locatelli-main
=======
>>>>>>> locatelli-main
=======
>>>>>>> locatelli-main
=======
>>>>>>> locatelli-main
=======
>>>>>>> locatelli-main
=======
>>>>>>> locatelli-main
=======
>>>>>>> locatelli-main
=======
>>>>>>> locatelli-main
=======
import com.typesafe.scalalogging.LazyLogging
=======
>>>>>>> 58d14a257e (GEOMESA-3254 Add Bloop build support)
>>>>>>> 9e49c1aac7 (GEOMESA-3254 Add Bloop build support)
=======
>>>>>>> 630900cfbb (GEOMESA-3246 Upgrade Arrow to 11.0.0)
=======
>>>>>>> 3e610250ce (GEOMESA-3254 Add Bloop build support)
=======
>>>>>>> 320759d5d3 (GEOMESA-3246 Upgrade Arrow to 11.0.0)
=======
>>>>>>> f586fec5a3 (GEOMESA-3254 Add Bloop build support)
=======
=======
>>>>>>> 6c49bcd685 (GEOMESA-3246 Upgrade Arrow to 11.0.0)
>>>>>>> 52579ffb37 (GEOMESA-3246 Upgrade Arrow to 11.0.0)
=======
>>>>>>> b39bd292d4 (GEOMESA-3254 Add Bloop build support)
=======
=======
>>>>>>> d18777a94f (GEOMESA-3246 Upgrade Arrow to 11.0.0)
>>>>>>> 556d966249 (GEOMESA-3246 Upgrade Arrow to 11.0.0)
<<<<<<< HEAD
<<<<<<< HEAD
<<<<<<< HEAD
<<<<<<< HEAD
<<<<<<< HEAD
<<<<<<< HEAD
<<<<<<< HEAD
<<<<<<< HEAD
<<<<<<< HEAD
<<<<<<< HEAD
<<<<<<< HEAD
<<<<<<< HEAD
<<<<<<< HEAD
<<<<<<< HEAD
<<<<<<< HEAD
<<<<<<< HEAD
<<<<<<< HEAD
<<<<<<< HEAD
<<<<<<< HEAD
<<<<<<< HEAD
<<<<<<< HEAD
<<<<<<< HEAD
<<<<<<< HEAD
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
import org.junit.runner.RunWith
import org.locationtech.geomesa.convert2.SimpleFeatureConverter
import org.locationtech.geomesa.features.ScalaSimpleFeature
import org.locationtech.geomesa.utils.geotools.SimpleFeatureTypes
<<<<<<< HEAD
<<<<<<< HEAD
<<<<<<< HEAD
<<<<<<< HEAD
<<<<<<< HEAD
<<<<<<< HEAD
<<<<<<< HEAD
<<<<<<< HEAD
<<<<<<< HEAD
<<<<<<< HEAD
<<<<<<< HEAD
<<<<<<< HEAD
<<<<<<< HEAD
<<<<<<< HEAD
<<<<<<< HEAD
<<<<<<< HEAD
<<<<<<< HEAD
<<<<<<< HEAD
<<<<<<< HEAD
<<<<<<< HEAD
<<<<<<< HEAD
<<<<<<< HEAD
<<<<<<< HEAD
<<<<<<< HEAD
<<<<<<< HEAD
<<<<<<< HEAD
<<<<<<< HEAD
<<<<<<< HEAD
<<<<<<< HEAD
<<<<<<< HEAD
<<<<<<< HEAD
<<<<<<< HEAD
<<<<<<< HEAD
<<<<<<< HEAD
<<<<<<< HEAD
<<<<<<< HEAD
<<<<<<< HEAD
import org.locationtech.geomesa.utils.io.WithClose
=======
import org.locationtech.geomesa.utils.io.{PathUtils, WithClose}
>>>>>>> 58d14a257 (GEOMESA-3254 Add Bloop build support)
=======
import org.locationtech.geomesa.utils.io.WithClose
>>>>>>> a928f2f73 (GEOMESA-3246 Upgrade Arrow to 11.0.0)
=======
<<<<<<< HEAD
<<<<<<< HEAD
import org.locationtech.geomesa.utils.io.WithClose
=======
import org.locationtech.geomesa.utils.io.{PathUtils, WithClose}
>>>>>>> 58d14a257e (GEOMESA-3254 Add Bloop build support)
=======
<<<<<<< HEAD
<<<<<<< HEAD
<<<<<<< HEAD
<<<<<<< HEAD
<<<<<<< HEAD
=======
>>>>>>> 7564665969 (GEOMESA-3254 Add Bloop build support)
=======
>>>>>>> 6c49bcd685 (GEOMESA-3246 Upgrade Arrow to 11.0.0)
=======
>>>>>>> e74fa3f690 (GEOMESA-3254 Add Bloop build support)
=======
>>>>>>> d18777a94f (GEOMESA-3246 Upgrade Arrow to 11.0.0)
import org.locationtech.geomesa.utils.io.WithClose
=======
import org.locationtech.geomesa.utils.io.{PathUtils, WithClose}
>>>>>>> 58d14a257e (GEOMESA-3254 Add Bloop build support)
<<<<<<< HEAD
<<<<<<< HEAD
>>>>>>> locationtech-main
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
=======
>>>>>>> 52579ffb37 (GEOMESA-3246 Upgrade Arrow to 11.0.0)
=======
>>>>>>> b39bd292d4 (GEOMESA-3254 Add Bloop build support)
=======
>>>>>>> 556d966249 (GEOMESA-3246 Upgrade Arrow to 11.0.0)
=======
>>>>>>> 7564665969 (GEOMESA-3254 Add Bloop build support)
=======
>>>>>>> 6c49bcd685 (GEOMESA-3246 Upgrade Arrow to 11.0.0)
<<<<<<< HEAD
<<<<<<< HEAD
=======
>>>>>>> e74fa3f690 (GEOMESA-3254 Add Bloop build support)
=======
>>>>>>> d18777a94f (GEOMESA-3246 Upgrade Arrow to 11.0.0)
<<<<<<< HEAD
=======
>>>>>>> 9e49c1aac7 (GEOMESA-3254 Add Bloop build support)
=======
>>>>>>> 630900cfbb (GEOMESA-3246 Upgrade Arrow to 11.0.0)
=======
>>>>>>> 3e610250ce (GEOMESA-3254 Add Bloop build support)
=======
>>>>>>> 320759d5d3 (GEOMESA-3246 Upgrade Arrow to 11.0.0)
=======
=======
>>>>>>> 7564665969 (GEOMESA-3254 Add Bloop build support)
>>>>>>> f586fec5a3 (GEOMESA-3254 Add Bloop build support)
=======
>>>>>>> 52579ffb37 (GEOMESA-3246 Upgrade Arrow to 11.0.0)
=======
=======
>>>>>>> e74fa3f690 (GEOMESA-3254 Add Bloop build support)
>>>>>>> b39bd292d4 (GEOMESA-3254 Add Bloop build support)
=======
>>>>>>> 556d966249 (GEOMESA-3246 Upgrade Arrow to 11.0.0)
import org.locationtech.geomesa.utils.io.WithClose
=======
import org.locationtech.geomesa.utils.io.{PathUtils, WithClose}
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
=======
>>>>>>> 52579ffb37 (GEOMESA-3246 Upgrade Arrow to 11.0.0)
=======
>>>>>>> b39bd292d4 (GEOMESA-3254 Add Bloop build support)
=======
>>>>>>> 556d966249 (GEOMESA-3246 Upgrade Arrow to 11.0.0)
=======
>>>>>>> 7564665969 (GEOMESA-3254 Add Bloop build support)
=======
>>>>>>> 6c49bcd685 (GEOMESA-3246 Upgrade Arrow to 11.0.0)
<<<<<<< HEAD
<<<<<<< HEAD
=======
>>>>>>> e74fa3f690 (GEOMESA-3254 Add Bloop build support)
=======
>>>>>>> d18777a94f (GEOMESA-3246 Upgrade Arrow to 11.0.0)
<<<<<<< HEAD
=======
>>>>>>> 9e49c1aac7 (GEOMESA-3254 Add Bloop build support)
=======
>>>>>>> 630900cfbb (GEOMESA-3246 Upgrade Arrow to 11.0.0)
=======
>>>>>>> 3e610250ce (GEOMESA-3254 Add Bloop build support)
=======
>>>>>>> 320759d5d3 (GEOMESA-3246 Upgrade Arrow to 11.0.0)
=======
=======
>>>>>>> 7564665969 (GEOMESA-3254 Add Bloop build support)
>>>>>>> f586fec5a3 (GEOMESA-3254 Add Bloop build support)
=======
>>>>>>> 52579ffb37 (GEOMESA-3246 Upgrade Arrow to 11.0.0)
=======
=======
>>>>>>> e74fa3f690 (GEOMESA-3254 Add Bloop build support)
>>>>>>> b39bd292d4 (GEOMESA-3254 Add Bloop build support)
=======
>>>>>>> 556d966249 (GEOMESA-3246 Upgrade Arrow to 11.0.0)
import org.locationtech.geomesa.utils.io.WithClose
=======
import org.locationtech.geomesa.utils.io.{PathUtils, WithClose}
>>>>>>> locatelli-main
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
>>>>>>> 52579ffb37 (GEOMESA-3246 Upgrade Arrow to 11.0.0)
=======
>>>>>>> b39bd292d4 (GEOMESA-3254 Add Bloop build support)
=======
>>>>>>> 556d966249 (GEOMESA-3246 Upgrade Arrow to 11.0.0)
=======
>>>>>>> 7564665969 (GEOMESA-3254 Add Bloop build support)
=======
>>>>>>> 6c49bcd685 (GEOMESA-3246 Upgrade Arrow to 11.0.0)
<<<<<<< HEAD
<<<<<<< HEAD
=======
>>>>>>> e74fa3f690 (GEOMESA-3254 Add Bloop build support)
=======
>>>>>>> d18777a94f (GEOMESA-3246 Upgrade Arrow to 11.0.0)
<<<<<<< HEAD
=======
>>>>>>> 9e49c1aac7 (GEOMESA-3254 Add Bloop build support)
=======
>>>>>>> 630900cfbb (GEOMESA-3246 Upgrade Arrow to 11.0.0)
=======
>>>>>>> 3e610250ce (GEOMESA-3254 Add Bloop build support)
=======
>>>>>>> 320759d5d3 (GEOMESA-3246 Upgrade Arrow to 11.0.0)
=======
=======
>>>>>>> 7564665969 (GEOMESA-3254 Add Bloop build support)
>>>>>>> f586fec5a3 (GEOMESA-3254 Add Bloop build support)
=======
>>>>>>> 52579ffb37 (GEOMESA-3246 Upgrade Arrow to 11.0.0)
=======
=======
>>>>>>> e74fa3f690 (GEOMESA-3254 Add Bloop build support)
>>>>>>> b39bd292d4 (GEOMESA-3254 Add Bloop build support)
=======
>>>>>>> 556d966249 (GEOMESA-3246 Upgrade Arrow to 11.0.0)
import org.locationtech.geomesa.utils.io.WithClose
=======
import org.locationtech.geomesa.utils.io.{PathUtils, WithClose}
>>>>>>> locatelli-main
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
>>>>>>> 52579ffb37 (GEOMESA-3246 Upgrade Arrow to 11.0.0)
=======
>>>>>>> b39bd292d4 (GEOMESA-3254 Add Bloop build support)
=======
>>>>>>> 556d966249 (GEOMESA-3246 Upgrade Arrow to 11.0.0)
=======
>>>>>>> 7564665969 (GEOMESA-3254 Add Bloop build support)
=======
>>>>>>> 6c49bcd685 (GEOMESA-3246 Upgrade Arrow to 11.0.0)
<<<<<<< HEAD
<<<<<<< HEAD
=======
>>>>>>> e74fa3f690 (GEOMESA-3254 Add Bloop build support)
=======
>>>>>>> d18777a94f (GEOMESA-3246 Upgrade Arrow to 11.0.0)
<<<<<<< HEAD
=======
>>>>>>> 9e49c1aac7 (GEOMESA-3254 Add Bloop build support)
=======
>>>>>>> 630900cfbb (GEOMESA-3246 Upgrade Arrow to 11.0.0)
=======
>>>>>>> 3e610250ce (GEOMESA-3254 Add Bloop build support)
=======
>>>>>>> 320759d5d3 (GEOMESA-3246 Upgrade Arrow to 11.0.0)
=======
=======
>>>>>>> 7564665969 (GEOMESA-3254 Add Bloop build support)
>>>>>>> f586fec5a3 (GEOMESA-3254 Add Bloop build support)
=======
>>>>>>> 52579ffb37 (GEOMESA-3246 Upgrade Arrow to 11.0.0)
=======
=======
>>>>>>> e74fa3f690 (GEOMESA-3254 Add Bloop build support)
>>>>>>> b39bd292d4 (GEOMESA-3254 Add Bloop build support)
=======
>>>>>>> 556d966249 (GEOMESA-3246 Upgrade Arrow to 11.0.0)
import org.locationtech.geomesa.utils.io.WithClose
=======
import org.locationtech.geomesa.utils.io.{PathUtils, WithClose}
>>>>>>> locatelli-main
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
>>>>>>> 52579ffb37 (GEOMESA-3246 Upgrade Arrow to 11.0.0)
=======
>>>>>>> b39bd292d4 (GEOMESA-3254 Add Bloop build support)
=======
>>>>>>> 556d966249 (GEOMESA-3246 Upgrade Arrow to 11.0.0)
=======
>>>>>>> 7564665969 (GEOMESA-3254 Add Bloop build support)
=======
>>>>>>> 6c49bcd685 (GEOMESA-3246 Upgrade Arrow to 11.0.0)
<<<<<<< HEAD
<<<<<<< HEAD
=======
>>>>>>> e74fa3f690 (GEOMESA-3254 Add Bloop build support)
=======
>>>>>>> d18777a94f (GEOMESA-3246 Upgrade Arrow to 11.0.0)
<<<<<<< HEAD
=======
>>>>>>> 9e49c1aac7 (GEOMESA-3254 Add Bloop build support)
=======
>>>>>>> 630900cfbb (GEOMESA-3246 Upgrade Arrow to 11.0.0)
=======
>>>>>>> 3e610250ce (GEOMESA-3254 Add Bloop build support)
=======
>>>>>>> 320759d5d3 (GEOMESA-3246 Upgrade Arrow to 11.0.0)
=======
=======
>>>>>>> 7564665969 (GEOMESA-3254 Add Bloop build support)
>>>>>>> f586fec5a3 (GEOMESA-3254 Add Bloop build support)
=======
>>>>>>> 52579ffb37 (GEOMESA-3246 Upgrade Arrow to 11.0.0)
=======
=======
>>>>>>> e74fa3f690 (GEOMESA-3254 Add Bloop build support)
>>>>>>> b39bd292d4 (GEOMESA-3254 Add Bloop build support)
=======
>>>>>>> 556d966249 (GEOMESA-3246 Upgrade Arrow to 11.0.0)
import org.locationtech.geomesa.utils.io.WithClose
=======
import org.locationtech.geomesa.utils.io.{PathUtils, WithClose}
>>>>>>> locatelli-main
=======
<<<<<<< HEAD
<<<<<<< HEAD
<<<<<<< HEAD
<<<<<<< HEAD
<<<<<<< HEAD
<<<<<<< HEAD
<<<<<<< HEAD
=======
>>>>>>> 52579ffb37 (GEOMESA-3246 Upgrade Arrow to 11.0.0)
=======
>>>>>>> b39bd292d4 (GEOMESA-3254 Add Bloop build support)
=======
>>>>>>> 556d966249 (GEOMESA-3246 Upgrade Arrow to 11.0.0)
=======
>>>>>>> 7564665969 (GEOMESA-3254 Add Bloop build support)
=======
>>>>>>> 6c49bcd685 (GEOMESA-3246 Upgrade Arrow to 11.0.0)
<<<<<<< HEAD
<<<<<<< HEAD
=======
>>>>>>> e74fa3f690 (GEOMESA-3254 Add Bloop build support)
=======
>>>>>>> d18777a94f (GEOMESA-3246 Upgrade Arrow to 11.0.0)
<<<<<<< HEAD
=======
>>>>>>> 9e49c1aac7 (GEOMESA-3254 Add Bloop build support)
=======
>>>>>>> 630900cfbb (GEOMESA-3246 Upgrade Arrow to 11.0.0)
=======
>>>>>>> 3e610250ce (GEOMESA-3254 Add Bloop build support)
=======
>>>>>>> 320759d5d3 (GEOMESA-3246 Upgrade Arrow to 11.0.0)
=======
=======
>>>>>>> 7564665969 (GEOMESA-3254 Add Bloop build support)
>>>>>>> f586fec5a3 (GEOMESA-3254 Add Bloop build support)
=======
>>>>>>> 52579ffb37 (GEOMESA-3246 Upgrade Arrow to 11.0.0)
=======
=======
>>>>>>> e74fa3f690 (GEOMESA-3254 Add Bloop build support)
>>>>>>> b39bd292d4 (GEOMESA-3254 Add Bloop build support)
=======
>>>>>>> 556d966249 (GEOMESA-3246 Upgrade Arrow to 11.0.0)
import org.locationtech.geomesa.utils.io.WithClose
=======
import org.locationtech.geomesa.utils.io.{PathUtils, WithClose}
>>>>>>> locatelli-main
=======
<<<<<<< HEAD
<<<<<<< HEAD
<<<<<<< HEAD
<<<<<<< HEAD
<<<<<<< HEAD
<<<<<<< HEAD
=======
>>>>>>> 52579ffb37 (GEOMESA-3246 Upgrade Arrow to 11.0.0)
=======
>>>>>>> b39bd292d4 (GEOMESA-3254 Add Bloop build support)
=======
>>>>>>> 556d966249 (GEOMESA-3246 Upgrade Arrow to 11.0.0)
=======
>>>>>>> 7564665969 (GEOMESA-3254 Add Bloop build support)
=======
>>>>>>> 6c49bcd685 (GEOMESA-3246 Upgrade Arrow to 11.0.0)
<<<<<<< HEAD
<<<<<<< HEAD
=======
>>>>>>> e74fa3f690 (GEOMESA-3254 Add Bloop build support)
=======
>>>>>>> d18777a94f (GEOMESA-3246 Upgrade Arrow to 11.0.0)
<<<<<<< HEAD
=======
>>>>>>> 9e49c1aac7 (GEOMESA-3254 Add Bloop build support)
=======
>>>>>>> 630900cfbb (GEOMESA-3246 Upgrade Arrow to 11.0.0)
=======
>>>>>>> 3e610250ce (GEOMESA-3254 Add Bloop build support)
=======
>>>>>>> 320759d5d3 (GEOMESA-3246 Upgrade Arrow to 11.0.0)
=======
=======
>>>>>>> 7564665969 (GEOMESA-3254 Add Bloop build support)
>>>>>>> f586fec5a3 (GEOMESA-3254 Add Bloop build support)
=======
>>>>>>> 52579ffb37 (GEOMESA-3246 Upgrade Arrow to 11.0.0)
=======
=======
>>>>>>> e74fa3f690 (GEOMESA-3254 Add Bloop build support)
>>>>>>> b39bd292d4 (GEOMESA-3254 Add Bloop build support)
=======
>>>>>>> 556d966249 (GEOMESA-3246 Upgrade Arrow to 11.0.0)
import org.locationtech.geomesa.utils.io.WithClose
=======
import org.locationtech.geomesa.utils.io.{PathUtils, WithClose}
>>>>>>> locatelli-main
=======
<<<<<<< HEAD
<<<<<<< HEAD
<<<<<<< HEAD
<<<<<<< HEAD
<<<<<<< HEAD
=======
>>>>>>> 52579ffb37 (GEOMESA-3246 Upgrade Arrow to 11.0.0)
=======
>>>>>>> b39bd292d4 (GEOMESA-3254 Add Bloop build support)
=======
>>>>>>> 556d966249 (GEOMESA-3246 Upgrade Arrow to 11.0.0)
=======
>>>>>>> 7564665969 (GEOMESA-3254 Add Bloop build support)
=======
>>>>>>> 6c49bcd685 (GEOMESA-3246 Upgrade Arrow to 11.0.0)
<<<<<<< HEAD
<<<<<<< HEAD
=======
>>>>>>> e74fa3f690 (GEOMESA-3254 Add Bloop build support)
=======
>>>>>>> d18777a94f (GEOMESA-3246 Upgrade Arrow to 11.0.0)
<<<<<<< HEAD
=======
>>>>>>> 9e49c1aac7 (GEOMESA-3254 Add Bloop build support)
=======
>>>>>>> 630900cfbb (GEOMESA-3246 Upgrade Arrow to 11.0.0)
=======
>>>>>>> 3e610250ce (GEOMESA-3254 Add Bloop build support)
=======
>>>>>>> 320759d5d3 (GEOMESA-3246 Upgrade Arrow to 11.0.0)
=======
=======
>>>>>>> 7564665969 (GEOMESA-3254 Add Bloop build support)
>>>>>>> f586fec5a3 (GEOMESA-3254 Add Bloop build support)
=======
>>>>>>> 52579ffb37 (GEOMESA-3246 Upgrade Arrow to 11.0.0)
=======
=======
>>>>>>> e74fa3f690 (GEOMESA-3254 Add Bloop build support)
>>>>>>> b39bd292d4 (GEOMESA-3254 Add Bloop build support)
=======
>>>>>>> 556d966249 (GEOMESA-3246 Upgrade Arrow to 11.0.0)
import org.locationtech.geomesa.utils.io.WithClose
=======
import org.locationtech.geomesa.utils.io.{PathUtils, WithClose}
>>>>>>> locatelli-main
=======
<<<<<<< HEAD
<<<<<<< HEAD
<<<<<<< HEAD
<<<<<<< HEAD
=======
>>>>>>> 52579ffb37 (GEOMESA-3246 Upgrade Arrow to 11.0.0)
=======
>>>>>>> b39bd292d4 (GEOMESA-3254 Add Bloop build support)
=======
>>>>>>> 556d966249 (GEOMESA-3246 Upgrade Arrow to 11.0.0)
=======
>>>>>>> 7564665969 (GEOMESA-3254 Add Bloop build support)
=======
>>>>>>> 6c49bcd685 (GEOMESA-3246 Upgrade Arrow to 11.0.0)
<<<<<<< HEAD
<<<<<<< HEAD
=======
>>>>>>> e74fa3f690 (GEOMESA-3254 Add Bloop build support)
=======
>>>>>>> d18777a94f (GEOMESA-3246 Upgrade Arrow to 11.0.0)
<<<<<<< HEAD
=======
>>>>>>> 9e49c1aac7 (GEOMESA-3254 Add Bloop build support)
=======
>>>>>>> 630900cfbb (GEOMESA-3246 Upgrade Arrow to 11.0.0)
=======
>>>>>>> 3e610250ce (GEOMESA-3254 Add Bloop build support)
=======
>>>>>>> 320759d5d3 (GEOMESA-3246 Upgrade Arrow to 11.0.0)
=======
=======
>>>>>>> 7564665969 (GEOMESA-3254 Add Bloop build support)
>>>>>>> f586fec5a3 (GEOMESA-3254 Add Bloop build support)
=======
>>>>>>> 52579ffb37 (GEOMESA-3246 Upgrade Arrow to 11.0.0)
=======
=======
>>>>>>> e74fa3f690 (GEOMESA-3254 Add Bloop build support)
>>>>>>> b39bd292d4 (GEOMESA-3254 Add Bloop build support)
=======
>>>>>>> 556d966249 (GEOMESA-3246 Upgrade Arrow to 11.0.0)
import org.locationtech.geomesa.utils.io.WithClose
=======
import org.locationtech.geomesa.utils.io.{PathUtils, WithClose}
>>>>>>> locatelli-main
=======
<<<<<<< HEAD
<<<<<<< HEAD
<<<<<<< HEAD
=======
>>>>>>> 52579ffb37 (GEOMESA-3246 Upgrade Arrow to 11.0.0)
=======
>>>>>>> b39bd292d4 (GEOMESA-3254 Add Bloop build support)
=======
>>>>>>> 556d966249 (GEOMESA-3246 Upgrade Arrow to 11.0.0)
=======
>>>>>>> 7564665969 (GEOMESA-3254 Add Bloop build support)
=======
>>>>>>> 6c49bcd685 (GEOMESA-3246 Upgrade Arrow to 11.0.0)
<<<<<<< HEAD
<<<<<<< HEAD
=======
>>>>>>> e74fa3f690 (GEOMESA-3254 Add Bloop build support)
=======
>>>>>>> d18777a94f (GEOMESA-3246 Upgrade Arrow to 11.0.0)
<<<<<<< HEAD
=======
>>>>>>> 9e49c1aac7 (GEOMESA-3254 Add Bloop build support)
=======
>>>>>>> 630900cfbb (GEOMESA-3246 Upgrade Arrow to 11.0.0)
=======
>>>>>>> 3e610250ce (GEOMESA-3254 Add Bloop build support)
=======
>>>>>>> 320759d5d3 (GEOMESA-3246 Upgrade Arrow to 11.0.0)
=======
=======
>>>>>>> 7564665969 (GEOMESA-3254 Add Bloop build support)
>>>>>>> f586fec5a3 (GEOMESA-3254 Add Bloop build support)
=======
>>>>>>> 52579ffb37 (GEOMESA-3246 Upgrade Arrow to 11.0.0)
=======
=======
>>>>>>> e74fa3f690 (GEOMESA-3254 Add Bloop build support)
>>>>>>> b39bd292d4 (GEOMESA-3254 Add Bloop build support)
=======
>>>>>>> 556d966249 (GEOMESA-3246 Upgrade Arrow to 11.0.0)
import org.locationtech.geomesa.utils.io.WithClose
=======
import org.locationtech.geomesa.utils.io.{PathUtils, WithClose}
>>>>>>> locatelli-main
=======
<<<<<<< HEAD
<<<<<<< HEAD
=======
>>>>>>> 52579ffb37 (GEOMESA-3246 Upgrade Arrow to 11.0.0)
=======
>>>>>>> b39bd292d4 (GEOMESA-3254 Add Bloop build support)
=======
>>>>>>> 556d966249 (GEOMESA-3246 Upgrade Arrow to 11.0.0)
=======
>>>>>>> 7564665969 (GEOMESA-3254 Add Bloop build support)
=======
>>>>>>> 6c49bcd685 (GEOMESA-3246 Upgrade Arrow to 11.0.0)
<<<<<<< HEAD
<<<<<<< HEAD
=======
>>>>>>> e74fa3f690 (GEOMESA-3254 Add Bloop build support)
=======
>>>>>>> d18777a94f (GEOMESA-3246 Upgrade Arrow to 11.0.0)
<<<<<<< HEAD
=======
>>>>>>> 9e49c1aac7 (GEOMESA-3254 Add Bloop build support)
=======
>>>>>>> 630900cfbb (GEOMESA-3246 Upgrade Arrow to 11.0.0)
=======
>>>>>>> 3e610250ce (GEOMESA-3254 Add Bloop build support)
=======
>>>>>>> 320759d5d3 (GEOMESA-3246 Upgrade Arrow to 11.0.0)
=======
=======
>>>>>>> 7564665969 (GEOMESA-3254 Add Bloop build support)
>>>>>>> f586fec5a3 (GEOMESA-3254 Add Bloop build support)
=======
>>>>>>> 52579ffb37 (GEOMESA-3246 Upgrade Arrow to 11.0.0)
=======
=======
>>>>>>> e74fa3f690 (GEOMESA-3254 Add Bloop build support)
>>>>>>> b39bd292d4 (GEOMESA-3254 Add Bloop build support)
=======
>>>>>>> 556d966249 (GEOMESA-3246 Upgrade Arrow to 11.0.0)
import org.locationtech.geomesa.utils.io.WithClose
=======
import org.locationtech.geomesa.utils.io.{PathUtils, WithClose}
>>>>>>> locatelli-main
=======
<<<<<<< HEAD
=======
>>>>>>> 52579ffb37 (GEOMESA-3246 Upgrade Arrow to 11.0.0)
=======
>>>>>>> b39bd292d4 (GEOMESA-3254 Add Bloop build support)
=======
>>>>>>> 556d966249 (GEOMESA-3246 Upgrade Arrow to 11.0.0)
=======
>>>>>>> 7564665969 (GEOMESA-3254 Add Bloop build support)
=======
>>>>>>> 6c49bcd685 (GEOMESA-3246 Upgrade Arrow to 11.0.0)
<<<<<<< HEAD
<<<<<<< HEAD
=======
>>>>>>> e74fa3f690 (GEOMESA-3254 Add Bloop build support)
=======
>>>>>>> d18777a94f (GEOMESA-3246 Upgrade Arrow to 11.0.0)
<<<<<<< HEAD
=======
>>>>>>> 9e49c1aac7 (GEOMESA-3254 Add Bloop build support)
=======
>>>>>>> 630900cfbb (GEOMESA-3246 Upgrade Arrow to 11.0.0)
=======
>>>>>>> 3e610250ce (GEOMESA-3254 Add Bloop build support)
=======
>>>>>>> 320759d5d3 (GEOMESA-3246 Upgrade Arrow to 11.0.0)
=======
=======
>>>>>>> 7564665969 (GEOMESA-3254 Add Bloop build support)
>>>>>>> f586fec5a3 (GEOMESA-3254 Add Bloop build support)
=======
>>>>>>> 52579ffb37 (GEOMESA-3246 Upgrade Arrow to 11.0.0)
=======
=======
>>>>>>> e74fa3f690 (GEOMESA-3254 Add Bloop build support)
>>>>>>> b39bd292d4 (GEOMESA-3254 Add Bloop build support)
=======
>>>>>>> 556d966249 (GEOMESA-3246 Upgrade Arrow to 11.0.0)
import org.locationtech.geomesa.utils.io.WithClose
=======
import org.locationtech.geomesa.utils.io.{PathUtils, WithClose}
>>>>>>> locatelli-main
=======
=======
>>>>>>> 52579ffb37 (GEOMESA-3246 Upgrade Arrow to 11.0.0)
=======
>>>>>>> b39bd292d4 (GEOMESA-3254 Add Bloop build support)
=======
>>>>>>> 556d966249 (GEOMESA-3246 Upgrade Arrow to 11.0.0)
=======
>>>>>>> 7564665969 (GEOMESA-3254 Add Bloop build support)
=======
>>>>>>> 6c49bcd685 (GEOMESA-3246 Upgrade Arrow to 11.0.0)
<<<<<<< HEAD
<<<<<<< HEAD
=======
>>>>>>> e74fa3f690 (GEOMESA-3254 Add Bloop build support)
=======
>>>>>>> d18777a94f (GEOMESA-3246 Upgrade Arrow to 11.0.0)
<<<<<<< HEAD
=======
>>>>>>> 9e49c1aac7 (GEOMESA-3254 Add Bloop build support)
=======
>>>>>>> 630900cfbb (GEOMESA-3246 Upgrade Arrow to 11.0.0)
=======
>>>>>>> 3e610250ce (GEOMESA-3254 Add Bloop build support)
=======
>>>>>>> 320759d5d3 (GEOMESA-3246 Upgrade Arrow to 11.0.0)
=======
=======
>>>>>>> 7564665969 (GEOMESA-3254 Add Bloop build support)
>>>>>>> f586fec5a3 (GEOMESA-3254 Add Bloop build support)
=======
>>>>>>> 52579ffb37 (GEOMESA-3246 Upgrade Arrow to 11.0.0)
=======
=======
>>>>>>> e74fa3f690 (GEOMESA-3254 Add Bloop build support)
>>>>>>> b39bd292d4 (GEOMESA-3254 Add Bloop build support)
=======
>>>>>>> 556d966249 (GEOMESA-3246 Upgrade Arrow to 11.0.0)
import org.locationtech.geomesa.utils.io.WithClose
=======
import org.locationtech.geomesa.utils.io.{PathUtils, WithClose}
>>>>>>> locatelli-main
=======
=======
>>>>>>> 52579ffb37 (GEOMESA-3246 Upgrade Arrow to 11.0.0)
=======
>>>>>>> b39bd292d4 (GEOMESA-3254 Add Bloop build support)
=======
>>>>>>> 556d966249 (GEOMESA-3246 Upgrade Arrow to 11.0.0)
=======
>>>>>>> 7564665969 (GEOMESA-3254 Add Bloop build support)
=======
>>>>>>> 6c49bcd685 (GEOMESA-3246 Upgrade Arrow to 11.0.0)
<<<<<<< HEAD
<<<<<<< HEAD
=======
>>>>>>> e74fa3f690 (GEOMESA-3254 Add Bloop build support)
=======
>>>>>>> d18777a94f (GEOMESA-3246 Upgrade Arrow to 11.0.0)
<<<<<<< HEAD
=======
>>>>>>> 9e49c1aac7 (GEOMESA-3254 Add Bloop build support)
=======
>>>>>>> 630900cfbb (GEOMESA-3246 Upgrade Arrow to 11.0.0)
=======
>>>>>>> 3e610250ce (GEOMESA-3254 Add Bloop build support)
=======
>>>>>>> 320759d5d3 (GEOMESA-3246 Upgrade Arrow to 11.0.0)
=======
=======
>>>>>>> 7564665969 (GEOMESA-3254 Add Bloop build support)
>>>>>>> f586fec5a3 (GEOMESA-3254 Add Bloop build support)
=======
>>>>>>> 52579ffb37 (GEOMESA-3246 Upgrade Arrow to 11.0.0)
=======
=======
>>>>>>> e74fa3f690 (GEOMESA-3254 Add Bloop build support)
>>>>>>> b39bd292d4 (GEOMESA-3254 Add Bloop build support)
=======
>>>>>>> 556d966249 (GEOMESA-3246 Upgrade Arrow to 11.0.0)
import org.locationtech.geomesa.utils.io.WithClose
=======
import org.locationtech.geomesa.utils.io.{PathUtils, WithClose}
>>>>>>> locatelli-main
=======
=======
>>>>>>> 52579ffb37 (GEOMESA-3246 Upgrade Arrow to 11.0.0)
=======
>>>>>>> b39bd292d4 (GEOMESA-3254 Add Bloop build support)
=======
>>>>>>> 556d966249 (GEOMESA-3246 Upgrade Arrow to 11.0.0)
=======
>>>>>>> 7564665969 (GEOMESA-3254 Add Bloop build support)
=======
>>>>>>> 6c49bcd685 (GEOMESA-3246 Upgrade Arrow to 11.0.0)
<<<<<<< HEAD
<<<<<<< HEAD
=======
>>>>>>> e74fa3f690 (GEOMESA-3254 Add Bloop build support)
=======
>>>>>>> d18777a94f (GEOMESA-3246 Upgrade Arrow to 11.0.0)
<<<<<<< HEAD
=======
>>>>>>> 9e49c1aac7 (GEOMESA-3254 Add Bloop build support)
=======
>>>>>>> 630900cfbb (GEOMESA-3246 Upgrade Arrow to 11.0.0)
=======
>>>>>>> 3e610250ce (GEOMESA-3254 Add Bloop build support)
=======
>>>>>>> 320759d5d3 (GEOMESA-3246 Upgrade Arrow to 11.0.0)
=======
=======
>>>>>>> 7564665969 (GEOMESA-3254 Add Bloop build support)
>>>>>>> f586fec5a3 (GEOMESA-3254 Add Bloop build support)
=======
>>>>>>> 52579ffb37 (GEOMESA-3246 Upgrade Arrow to 11.0.0)
=======
=======
>>>>>>> e74fa3f690 (GEOMESA-3254 Add Bloop build support)
>>>>>>> b39bd292d4 (GEOMESA-3254 Add Bloop build support)
=======
>>>>>>> 556d966249 (GEOMESA-3246 Upgrade Arrow to 11.0.0)
import org.locationtech.geomesa.utils.io.WithClose
=======
import org.locationtech.geomesa.utils.io.{PathUtils, WithClose}
>>>>>>> locatelli-main
=======
=======
>>>>>>> 52579ffb37 (GEOMESA-3246 Upgrade Arrow to 11.0.0)
=======
>>>>>>> b39bd292d4 (GEOMESA-3254 Add Bloop build support)
=======
>>>>>>> 556d966249 (GEOMESA-3246 Upgrade Arrow to 11.0.0)
=======
>>>>>>> 7564665969 (GEOMESA-3254 Add Bloop build support)
=======
>>>>>>> 6c49bcd685 (GEOMESA-3246 Upgrade Arrow to 11.0.0)
<<<<<<< HEAD
<<<<<<< HEAD
=======
>>>>>>> e74fa3f690 (GEOMESA-3254 Add Bloop build support)
=======
>>>>>>> d18777a94f (GEOMESA-3246 Upgrade Arrow to 11.0.0)
<<<<<<< HEAD
=======
>>>>>>> 9e49c1aac7 (GEOMESA-3254 Add Bloop build support)
=======
>>>>>>> 630900cfbb (GEOMESA-3246 Upgrade Arrow to 11.0.0)
=======
>>>>>>> 3e610250ce (GEOMESA-3254 Add Bloop build support)
=======
>>>>>>> 320759d5d3 (GEOMESA-3246 Upgrade Arrow to 11.0.0)
=======
=======
>>>>>>> 7564665969 (GEOMESA-3254 Add Bloop build support)
>>>>>>> f586fec5a3 (GEOMESA-3254 Add Bloop build support)
=======
>>>>>>> 52579ffb37 (GEOMESA-3246 Upgrade Arrow to 11.0.0)
=======
=======
>>>>>>> e74fa3f690 (GEOMESA-3254 Add Bloop build support)
>>>>>>> b39bd292d4 (GEOMESA-3254 Add Bloop build support)
=======
>>>>>>> 556d966249 (GEOMESA-3246 Upgrade Arrow to 11.0.0)
import org.locationtech.geomesa.utils.io.WithClose
=======
import org.locationtech.geomesa.utils.io.{PathUtils, WithClose}
>>>>>>> locatelli-main
=======
=======
>>>>>>> 52579ffb37 (GEOMESA-3246 Upgrade Arrow to 11.0.0)
=======
>>>>>>> b39bd292d4 (GEOMESA-3254 Add Bloop build support)
=======
>>>>>>> 556d966249 (GEOMESA-3246 Upgrade Arrow to 11.0.0)
=======
>>>>>>> 7564665969 (GEOMESA-3254 Add Bloop build support)
=======
>>>>>>> 6c49bcd685 (GEOMESA-3246 Upgrade Arrow to 11.0.0)
<<<<<<< HEAD
<<<<<<< HEAD
=======
>>>>>>> e74fa3f690 (GEOMESA-3254 Add Bloop build support)
=======
>>>>>>> d18777a94f (GEOMESA-3246 Upgrade Arrow to 11.0.0)
<<<<<<< HEAD
=======
>>>>>>> 9e49c1aac7 (GEOMESA-3254 Add Bloop build support)
=======
>>>>>>> 630900cfbb (GEOMESA-3246 Upgrade Arrow to 11.0.0)
=======
>>>>>>> 3e610250ce (GEOMESA-3254 Add Bloop build support)
=======
>>>>>>> 320759d5d3 (GEOMESA-3246 Upgrade Arrow to 11.0.0)
=======
=======
>>>>>>> 7564665969 (GEOMESA-3254 Add Bloop build support)
>>>>>>> f586fec5a3 (GEOMESA-3254 Add Bloop build support)
=======
>>>>>>> 52579ffb37 (GEOMESA-3246 Upgrade Arrow to 11.0.0)
=======
=======
>>>>>>> e74fa3f690 (GEOMESA-3254 Add Bloop build support)
>>>>>>> b39bd292d4 (GEOMESA-3254 Add Bloop build support)
=======
>>>>>>> 556d966249 (GEOMESA-3246 Upgrade Arrow to 11.0.0)
import org.locationtech.geomesa.utils.io.WithClose
=======
import org.locationtech.geomesa.utils.io.{PathUtils, WithClose}
>>>>>>> locatelli-main
=======
=======
>>>>>>> 52579ffb37 (GEOMESA-3246 Upgrade Arrow to 11.0.0)
=======
>>>>>>> b39bd292d4 (GEOMESA-3254 Add Bloop build support)
=======
>>>>>>> 556d966249 (GEOMESA-3246 Upgrade Arrow to 11.0.0)
=======
>>>>>>> 7564665969 (GEOMESA-3254 Add Bloop build support)
=======
>>>>>>> 6c49bcd685 (GEOMESA-3246 Upgrade Arrow to 11.0.0)
<<<<<<< HEAD
<<<<<<< HEAD
=======
>>>>>>> e74fa3f690 (GEOMESA-3254 Add Bloop build support)
=======
>>>>>>> d18777a94f (GEOMESA-3246 Upgrade Arrow to 11.0.0)
<<<<<<< HEAD
=======
>>>>>>> 9e49c1aac7 (GEOMESA-3254 Add Bloop build support)
=======
>>>>>>> 630900cfbb (GEOMESA-3246 Upgrade Arrow to 11.0.0)
=======
>>>>>>> 3e610250ce (GEOMESA-3254 Add Bloop build support)
=======
>>>>>>> 320759d5d3 (GEOMESA-3246 Upgrade Arrow to 11.0.0)
=======
=======
>>>>>>> 7564665969 (GEOMESA-3254 Add Bloop build support)
>>>>>>> f586fec5a3 (GEOMESA-3254 Add Bloop build support)
=======
>>>>>>> 52579ffb37 (GEOMESA-3246 Upgrade Arrow to 11.0.0)
=======
=======
>>>>>>> e74fa3f690 (GEOMESA-3254 Add Bloop build support)
>>>>>>> b39bd292d4 (GEOMESA-3254 Add Bloop build support)
=======
>>>>>>> 556d966249 (GEOMESA-3246 Upgrade Arrow to 11.0.0)
import org.locationtech.geomesa.utils.io.WithClose
=======
import org.locationtech.geomesa.utils.io.{PathUtils, WithClose}
>>>>>>> locatelli-main
=======
=======
>>>>>>> 52579ffb37 (GEOMESA-3246 Upgrade Arrow to 11.0.0)
=======
>>>>>>> b39bd292d4 (GEOMESA-3254 Add Bloop build support)
=======
>>>>>>> 556d966249 (GEOMESA-3246 Upgrade Arrow to 11.0.0)
=======
>>>>>>> 7564665969 (GEOMESA-3254 Add Bloop build support)
=======
>>>>>>> 6c49bcd685 (GEOMESA-3246 Upgrade Arrow to 11.0.0)
<<<<<<< HEAD
<<<<<<< HEAD
=======
>>>>>>> e74fa3f690 (GEOMESA-3254 Add Bloop build support)
=======
>>>>>>> d18777a94f (GEOMESA-3246 Upgrade Arrow to 11.0.0)
<<<<<<< HEAD
=======
>>>>>>> 9e49c1aac7 (GEOMESA-3254 Add Bloop build support)
=======
>>>>>>> 630900cfbb (GEOMESA-3246 Upgrade Arrow to 11.0.0)
=======
>>>>>>> 3e610250ce (GEOMESA-3254 Add Bloop build support)
=======
>>>>>>> 320759d5d3 (GEOMESA-3246 Upgrade Arrow to 11.0.0)
=======
=======
>>>>>>> 7564665969 (GEOMESA-3254 Add Bloop build support)
>>>>>>> f586fec5a3 (GEOMESA-3254 Add Bloop build support)
=======
>>>>>>> 52579ffb37 (GEOMESA-3246 Upgrade Arrow to 11.0.0)
=======
=======
>>>>>>> e74fa3f690 (GEOMESA-3254 Add Bloop build support)
>>>>>>> b39bd292d4 (GEOMESA-3254 Add Bloop build support)
=======
>>>>>>> 556d966249 (GEOMESA-3246 Upgrade Arrow to 11.0.0)
import org.locationtech.geomesa.utils.io.WithClose
=======
import org.locationtech.geomesa.utils.io.{PathUtils, WithClose}
>>>>>>> locatelli-main
=======
=======
>>>>>>> 52579ffb37 (GEOMESA-3246 Upgrade Arrow to 11.0.0)
=======
>>>>>>> b39bd292d4 (GEOMESA-3254 Add Bloop build support)
=======
>>>>>>> 556d966249 (GEOMESA-3246 Upgrade Arrow to 11.0.0)
=======
>>>>>>> 7564665969 (GEOMESA-3254 Add Bloop build support)
=======
>>>>>>> 6c49bcd685 (GEOMESA-3246 Upgrade Arrow to 11.0.0)
<<<<<<< HEAD
<<<<<<< HEAD
=======
>>>>>>> e74fa3f690 (GEOMESA-3254 Add Bloop build support)
=======
>>>>>>> d18777a94f (GEOMESA-3246 Upgrade Arrow to 11.0.0)
<<<<<<< HEAD
=======
>>>>>>> 9e49c1aac7 (GEOMESA-3254 Add Bloop build support)
=======
>>>>>>> 630900cfbb (GEOMESA-3246 Upgrade Arrow to 11.0.0)
=======
>>>>>>> 3e610250ce (GEOMESA-3254 Add Bloop build support)
=======
>>>>>>> 320759d5d3 (GEOMESA-3246 Upgrade Arrow to 11.0.0)
=======
=======
>>>>>>> 7564665969 (GEOMESA-3254 Add Bloop build support)
>>>>>>> f586fec5a3 (GEOMESA-3254 Add Bloop build support)
=======
>>>>>>> 52579ffb37 (GEOMESA-3246 Upgrade Arrow to 11.0.0)
=======
=======
>>>>>>> e74fa3f690 (GEOMESA-3254 Add Bloop build support)
>>>>>>> b39bd292d4 (GEOMESA-3254 Add Bloop build support)
=======
>>>>>>> 556d966249 (GEOMESA-3246 Upgrade Arrow to 11.0.0)
import org.locationtech.geomesa.utils.io.WithClose
=======
import org.locationtech.geomesa.utils.io.{PathUtils, WithClose}
>>>>>>> locatelli-main
=======
=======
>>>>>>> 52579ffb37 (GEOMESA-3246 Upgrade Arrow to 11.0.0)
=======
>>>>>>> b39bd292d4 (GEOMESA-3254 Add Bloop build support)
=======
>>>>>>> 556d966249 (GEOMESA-3246 Upgrade Arrow to 11.0.0)
=======
>>>>>>> 7564665969 (GEOMESA-3254 Add Bloop build support)
=======
>>>>>>> 6c49bcd685 (GEOMESA-3246 Upgrade Arrow to 11.0.0)
<<<<<<< HEAD
<<<<<<< HEAD
=======
>>>>>>> e74fa3f690 (GEOMESA-3254 Add Bloop build support)
=======
>>>>>>> d18777a94f (GEOMESA-3246 Upgrade Arrow to 11.0.0)
<<<<<<< HEAD
=======
>>>>>>> 9e49c1aac7 (GEOMESA-3254 Add Bloop build support)
=======
>>>>>>> 630900cfbb (GEOMESA-3246 Upgrade Arrow to 11.0.0)
=======
>>>>>>> 3e610250ce (GEOMESA-3254 Add Bloop build support)
=======
>>>>>>> 320759d5d3 (GEOMESA-3246 Upgrade Arrow to 11.0.0)
=======
=======
>>>>>>> 7564665969 (GEOMESA-3254 Add Bloop build support)
>>>>>>> f586fec5a3 (GEOMESA-3254 Add Bloop build support)
=======
>>>>>>> 52579ffb37 (GEOMESA-3246 Upgrade Arrow to 11.0.0)
=======
=======
>>>>>>> e74fa3f690 (GEOMESA-3254 Add Bloop build support)
>>>>>>> b39bd292d4 (GEOMESA-3254 Add Bloop build support)
=======
>>>>>>> 556d966249 (GEOMESA-3246 Upgrade Arrow to 11.0.0)
import org.locationtech.geomesa.utils.io.WithClose
=======
import org.locationtech.geomesa.utils.io.{PathUtils, WithClose}
>>>>>>> locatelli-main
=======
=======
>>>>>>> 52579ffb37 (GEOMESA-3246 Upgrade Arrow to 11.0.0)
=======
>>>>>>> b39bd292d4 (GEOMESA-3254 Add Bloop build support)
=======
>>>>>>> 556d966249 (GEOMESA-3246 Upgrade Arrow to 11.0.0)
=======
>>>>>>> 7564665969 (GEOMESA-3254 Add Bloop build support)
=======
>>>>>>> 6c49bcd685 (GEOMESA-3246 Upgrade Arrow to 11.0.0)
<<<<<<< HEAD
<<<<<<< HEAD
=======
>>>>>>> e74fa3f690 (GEOMESA-3254 Add Bloop build support)
=======
>>>>>>> d18777a94f (GEOMESA-3246 Upgrade Arrow to 11.0.0)
<<<<<<< HEAD
=======
>>>>>>> 9e49c1aac7 (GEOMESA-3254 Add Bloop build support)
=======
>>>>>>> 630900cfbb (GEOMESA-3246 Upgrade Arrow to 11.0.0)
=======
>>>>>>> 3e610250ce (GEOMESA-3254 Add Bloop build support)
=======
>>>>>>> 320759d5d3 (GEOMESA-3246 Upgrade Arrow to 11.0.0)
=======
=======
>>>>>>> 7564665969 (GEOMESA-3254 Add Bloop build support)
>>>>>>> f586fec5a3 (GEOMESA-3254 Add Bloop build support)
=======
>>>>>>> 52579ffb37 (GEOMESA-3246 Upgrade Arrow to 11.0.0)
=======
=======
>>>>>>> e74fa3f690 (GEOMESA-3254 Add Bloop build support)
>>>>>>> b39bd292d4 (GEOMESA-3254 Add Bloop build support)
=======
>>>>>>> 556d966249 (GEOMESA-3246 Upgrade Arrow to 11.0.0)
import org.locationtech.geomesa.utils.io.WithClose
=======
import org.locationtech.geomesa.utils.io.{PathUtils, WithClose}
>>>>>>> locatelli-main
=======
=======
>>>>>>> 52579ffb37 (GEOMESA-3246 Upgrade Arrow to 11.0.0)
=======
>>>>>>> b39bd292d4 (GEOMESA-3254 Add Bloop build support)
=======
>>>>>>> 556d966249 (GEOMESA-3246 Upgrade Arrow to 11.0.0)
=======
>>>>>>> 7564665969 (GEOMESA-3254 Add Bloop build support)
=======
>>>>>>> 6c49bcd685 (GEOMESA-3246 Upgrade Arrow to 11.0.0)
<<<<<<< HEAD
<<<<<<< HEAD
=======
>>>>>>> e74fa3f690 (GEOMESA-3254 Add Bloop build support)
=======
>>>>>>> d18777a94f (GEOMESA-3246 Upgrade Arrow to 11.0.0)
<<<<<<< HEAD
=======
>>>>>>> 9e49c1aac7 (GEOMESA-3254 Add Bloop build support)
=======
>>>>>>> 630900cfbb (GEOMESA-3246 Upgrade Arrow to 11.0.0)
=======
>>>>>>> 3e610250ce (GEOMESA-3254 Add Bloop build support)
=======
>>>>>>> 320759d5d3 (GEOMESA-3246 Upgrade Arrow to 11.0.0)
=======
=======
>>>>>>> 7564665969 (GEOMESA-3254 Add Bloop build support)
>>>>>>> f586fec5a3 (GEOMESA-3254 Add Bloop build support)
=======
>>>>>>> 52579ffb37 (GEOMESA-3246 Upgrade Arrow to 11.0.0)
=======
=======
>>>>>>> e74fa3f690 (GEOMESA-3254 Add Bloop build support)
>>>>>>> b39bd292d4 (GEOMESA-3254 Add Bloop build support)
=======
>>>>>>> 556d966249 (GEOMESA-3246 Upgrade Arrow to 11.0.0)
import org.locationtech.geomesa.utils.io.WithClose
=======
import org.locationtech.geomesa.utils.io.{PathUtils, WithClose}
>>>>>>> locatelli-main
=======
=======
>>>>>>> 52579ffb37 (GEOMESA-3246 Upgrade Arrow to 11.0.0)
=======
>>>>>>> b39bd292d4 (GEOMESA-3254 Add Bloop build support)
=======
>>>>>>> 556d966249 (GEOMESA-3246 Upgrade Arrow to 11.0.0)
=======
>>>>>>> 7564665969 (GEOMESA-3254 Add Bloop build support)
=======
>>>>>>> 6c49bcd685 (GEOMESA-3246 Upgrade Arrow to 11.0.0)
<<<<<<< HEAD
<<<<<<< HEAD
=======
>>>>>>> e74fa3f690 (GEOMESA-3254 Add Bloop build support)
=======
>>>>>>> d18777a94f (GEOMESA-3246 Upgrade Arrow to 11.0.0)
<<<<<<< HEAD
=======
>>>>>>> 9e49c1aac7 (GEOMESA-3254 Add Bloop build support)
=======
>>>>>>> 630900cfbb (GEOMESA-3246 Upgrade Arrow to 11.0.0)
=======
>>>>>>> 3e610250ce (GEOMESA-3254 Add Bloop build support)
=======
>>>>>>> 320759d5d3 (GEOMESA-3246 Upgrade Arrow to 11.0.0)
=======
=======
>>>>>>> 7564665969 (GEOMESA-3254 Add Bloop build support)
>>>>>>> f586fec5a3 (GEOMESA-3254 Add Bloop build support)
=======
>>>>>>> 52579ffb37 (GEOMESA-3246 Upgrade Arrow to 11.0.0)
=======
=======
>>>>>>> e74fa3f690 (GEOMESA-3254 Add Bloop build support)
>>>>>>> b39bd292d4 (GEOMESA-3254 Add Bloop build support)
=======
>>>>>>> 556d966249 (GEOMESA-3246 Upgrade Arrow to 11.0.0)
import org.locationtech.geomesa.utils.io.WithClose
=======
import org.locationtech.geomesa.utils.io.{PathUtils, WithClose}
>>>>>>> locatelli-main
=======
=======
>>>>>>> 52579ffb37 (GEOMESA-3246 Upgrade Arrow to 11.0.0)
=======
>>>>>>> b39bd292d4 (GEOMESA-3254 Add Bloop build support)
=======
>>>>>>> 556d966249 (GEOMESA-3246 Upgrade Arrow to 11.0.0)
=======
>>>>>>> 7564665969 (GEOMESA-3254 Add Bloop build support)
=======
>>>>>>> 6c49bcd685 (GEOMESA-3246 Upgrade Arrow to 11.0.0)
<<<<<<< HEAD
<<<<<<< HEAD
=======
>>>>>>> e74fa3f690 (GEOMESA-3254 Add Bloop build support)
=======
>>>>>>> d18777a94f (GEOMESA-3246 Upgrade Arrow to 11.0.0)
<<<<<<< HEAD
=======
>>>>>>> 9e49c1aac7 (GEOMESA-3254 Add Bloop build support)
=======
>>>>>>> 630900cfbb (GEOMESA-3246 Upgrade Arrow to 11.0.0)
=======
>>>>>>> 3e610250ce (GEOMESA-3254 Add Bloop build support)
=======
>>>>>>> 320759d5d3 (GEOMESA-3246 Upgrade Arrow to 11.0.0)
=======
=======
>>>>>>> 7564665969 (GEOMESA-3254 Add Bloop build support)
>>>>>>> f586fec5a3 (GEOMESA-3254 Add Bloop build support)
=======
>>>>>>> 52579ffb37 (GEOMESA-3246 Upgrade Arrow to 11.0.0)
=======
=======
>>>>>>> e74fa3f690 (GEOMESA-3254 Add Bloop build support)
>>>>>>> b39bd292d4 (GEOMESA-3254 Add Bloop build support)
=======
>>>>>>> 556d966249 (GEOMESA-3246 Upgrade Arrow to 11.0.0)
import org.locationtech.geomesa.utils.io.WithClose
=======
import org.locationtech.geomesa.utils.io.{PathUtils, WithClose}
>>>>>>> locatelli-main
=======
=======
>>>>>>> 52579ffb37 (GEOMESA-3246 Upgrade Arrow to 11.0.0)
=======
>>>>>>> b39bd292d4 (GEOMESA-3254 Add Bloop build support)
=======
>>>>>>> 556d966249 (GEOMESA-3246 Upgrade Arrow to 11.0.0)
=======
>>>>>>> 7564665969 (GEOMESA-3254 Add Bloop build support)
=======
>>>>>>> 6c49bcd685 (GEOMESA-3246 Upgrade Arrow to 11.0.0)
<<<<<<< HEAD
<<<<<<< HEAD
=======
>>>>>>> e74fa3f690 (GEOMESA-3254 Add Bloop build support)
=======
>>>>>>> d18777a94f (GEOMESA-3246 Upgrade Arrow to 11.0.0)
<<<<<<< HEAD
=======
>>>>>>> 9e49c1aac7 (GEOMESA-3254 Add Bloop build support)
=======
>>>>>>> 630900cfbb (GEOMESA-3246 Upgrade Arrow to 11.0.0)
=======
>>>>>>> 3e610250ce (GEOMESA-3254 Add Bloop build support)
=======
>>>>>>> 320759d5d3 (GEOMESA-3246 Upgrade Arrow to 11.0.0)
=======
=======
>>>>>>> 7564665969 (GEOMESA-3254 Add Bloop build support)
>>>>>>> f586fec5a3 (GEOMESA-3254 Add Bloop build support)
=======
>>>>>>> 52579ffb37 (GEOMESA-3246 Upgrade Arrow to 11.0.0)
=======
=======
>>>>>>> e74fa3f690 (GEOMESA-3254 Add Bloop build support)
>>>>>>> b39bd292d4 (GEOMESA-3254 Add Bloop build support)
=======
>>>>>>> 556d966249 (GEOMESA-3246 Upgrade Arrow to 11.0.0)
import org.locationtech.geomesa.utils.io.WithClose
=======
import org.locationtech.geomesa.utils.io.{PathUtils, WithClose}
>>>>>>> locatelli-main
=======
=======
>>>>>>> 52579ffb37 (GEOMESA-3246 Upgrade Arrow to 11.0.0)
=======
>>>>>>> b39bd292d4 (GEOMESA-3254 Add Bloop build support)
=======
>>>>>>> 556d966249 (GEOMESA-3246 Upgrade Arrow to 11.0.0)
=======
>>>>>>> 7564665969 (GEOMESA-3254 Add Bloop build support)
=======
>>>>>>> 6c49bcd685 (GEOMESA-3246 Upgrade Arrow to 11.0.0)
<<<<<<< HEAD
<<<<<<< HEAD
=======
>>>>>>> e74fa3f690 (GEOMESA-3254 Add Bloop build support)
=======
>>>>>>> d18777a94f (GEOMESA-3246 Upgrade Arrow to 11.0.0)
<<<<<<< HEAD
=======
>>>>>>> 9e49c1aac7 (GEOMESA-3254 Add Bloop build support)
=======
>>>>>>> 630900cfbb (GEOMESA-3246 Upgrade Arrow to 11.0.0)
=======
>>>>>>> 3e610250ce (GEOMESA-3254 Add Bloop build support)
=======
>>>>>>> 320759d5d3 (GEOMESA-3246 Upgrade Arrow to 11.0.0)
=======
=======
>>>>>>> 7564665969 (GEOMESA-3254 Add Bloop build support)
>>>>>>> f586fec5a3 (GEOMESA-3254 Add Bloop build support)
=======
>>>>>>> 52579ffb37 (GEOMESA-3246 Upgrade Arrow to 11.0.0)
=======
=======
>>>>>>> e74fa3f690 (GEOMESA-3254 Add Bloop build support)
>>>>>>> b39bd292d4 (GEOMESA-3254 Add Bloop build support)
=======
>>>>>>> 556d966249 (GEOMESA-3246 Upgrade Arrow to 11.0.0)
import org.locationtech.geomesa.utils.io.WithClose
=======
import org.locationtech.geomesa.utils.io.{PathUtils, WithClose}
>>>>>>> locatelli-main
=======
=======
>>>>>>> 52579ffb37 (GEOMESA-3246 Upgrade Arrow to 11.0.0)
=======
>>>>>>> b39bd292d4 (GEOMESA-3254 Add Bloop build support)
=======
>>>>>>> 556d966249 (GEOMESA-3246 Upgrade Arrow to 11.0.0)
=======
>>>>>>> 7564665969 (GEOMESA-3254 Add Bloop build support)
=======
>>>>>>> 6c49bcd685 (GEOMESA-3246 Upgrade Arrow to 11.0.0)
<<<<<<< HEAD
<<<<<<< HEAD
=======
>>>>>>> e74fa3f690 (GEOMESA-3254 Add Bloop build support)
=======
>>>>>>> d18777a94f (GEOMESA-3246 Upgrade Arrow to 11.0.0)
<<<<<<< HEAD
=======
>>>>>>> 9e49c1aac7 (GEOMESA-3254 Add Bloop build support)
=======
>>>>>>> 630900cfbb (GEOMESA-3246 Upgrade Arrow to 11.0.0)
=======
>>>>>>> 3e610250ce (GEOMESA-3254 Add Bloop build support)
=======
>>>>>>> 320759d5d3 (GEOMESA-3246 Upgrade Arrow to 11.0.0)
=======
=======
>>>>>>> 7564665969 (GEOMESA-3254 Add Bloop build support)
>>>>>>> f586fec5a3 (GEOMESA-3254 Add Bloop build support)
=======
>>>>>>> 52579ffb37 (GEOMESA-3246 Upgrade Arrow to 11.0.0)
=======
=======
>>>>>>> e74fa3f690 (GEOMESA-3254 Add Bloop build support)
>>>>>>> b39bd292d4 (GEOMESA-3254 Add Bloop build support)
=======
>>>>>>> 556d966249 (GEOMESA-3246 Upgrade Arrow to 11.0.0)
import org.locationtech.geomesa.utils.io.WithClose
=======
import org.locationtech.geomesa.utils.io.{PathUtils, WithClose}
>>>>>>> locatelli-main
=======
=======
>>>>>>> 52579ffb37 (GEOMESA-3246 Upgrade Arrow to 11.0.0)
=======
>>>>>>> b39bd292d4 (GEOMESA-3254 Add Bloop build support)
=======
>>>>>>> 556d966249 (GEOMESA-3246 Upgrade Arrow to 11.0.0)
=======
>>>>>>> 7564665969 (GEOMESA-3254 Add Bloop build support)
=======
>>>>>>> 6c49bcd685 (GEOMESA-3246 Upgrade Arrow to 11.0.0)
<<<<<<< HEAD
<<<<<<< HEAD
=======
>>>>>>> e74fa3f690 (GEOMESA-3254 Add Bloop build support)
=======
>>>>>>> d18777a94f (GEOMESA-3246 Upgrade Arrow to 11.0.0)
<<<<<<< HEAD
=======
>>>>>>> 9e49c1aac7 (GEOMESA-3254 Add Bloop build support)
=======
>>>>>>> 630900cfbb (GEOMESA-3246 Upgrade Arrow to 11.0.0)
=======
>>>>>>> 3e610250ce (GEOMESA-3254 Add Bloop build support)
=======
>>>>>>> 320759d5d3 (GEOMESA-3246 Upgrade Arrow to 11.0.0)
=======
=======
>>>>>>> 7564665969 (GEOMESA-3254 Add Bloop build support)
>>>>>>> f586fec5a3 (GEOMESA-3254 Add Bloop build support)
=======
>>>>>>> 52579ffb37 (GEOMESA-3246 Upgrade Arrow to 11.0.0)
=======
=======
>>>>>>> e74fa3f690 (GEOMESA-3254 Add Bloop build support)
>>>>>>> b39bd292d4 (GEOMESA-3254 Add Bloop build support)
=======
>>>>>>> 556d966249 (GEOMESA-3246 Upgrade Arrow to 11.0.0)
import org.locationtech.geomesa.utils.io.WithClose
=======
import org.locationtech.geomesa.utils.io.{PathUtils, WithClose}
>>>>>>> locatelli-main
=======
=======
>>>>>>> 52579ffb37 (GEOMESA-3246 Upgrade Arrow to 11.0.0)
=======
>>>>>>> b39bd292d4 (GEOMESA-3254 Add Bloop build support)
=======
>>>>>>> 556d966249 (GEOMESA-3246 Upgrade Arrow to 11.0.0)
=======
>>>>>>> 7564665969 (GEOMESA-3254 Add Bloop build support)
=======
>>>>>>> 6c49bcd685 (GEOMESA-3246 Upgrade Arrow to 11.0.0)
<<<<<<< HEAD
<<<<<<< HEAD
=======
>>>>>>> e74fa3f690 (GEOMESA-3254 Add Bloop build support)
=======
>>>>>>> d18777a94f (GEOMESA-3246 Upgrade Arrow to 11.0.0)
<<<<<<< HEAD
=======
>>>>>>> 9e49c1aac7 (GEOMESA-3254 Add Bloop build support)
=======
>>>>>>> 630900cfbb (GEOMESA-3246 Upgrade Arrow to 11.0.0)
=======
>>>>>>> 3e610250ce (GEOMESA-3254 Add Bloop build support)
=======
>>>>>>> 320759d5d3 (GEOMESA-3246 Upgrade Arrow to 11.0.0)
=======
=======
>>>>>>> 7564665969 (GEOMESA-3254 Add Bloop build support)
>>>>>>> f586fec5a3 (GEOMESA-3254 Add Bloop build support)
=======
>>>>>>> 52579ffb37 (GEOMESA-3246 Upgrade Arrow to 11.0.0)
=======
=======
>>>>>>> e74fa3f690 (GEOMESA-3254 Add Bloop build support)
>>>>>>> b39bd292d4 (GEOMESA-3254 Add Bloop build support)
=======
>>>>>>> 556d966249 (GEOMESA-3246 Upgrade Arrow to 11.0.0)
import org.locationtech.geomesa.utils.io.WithClose
=======
import org.locationtech.geomesa.utils.io.{PathUtils, WithClose}
>>>>>>> locatelli-main
=======
=======
>>>>>>> 52579ffb37 (GEOMESA-3246 Upgrade Arrow to 11.0.0)
=======
>>>>>>> b39bd292d4 (GEOMESA-3254 Add Bloop build support)
=======
>>>>>>> 556d966249 (GEOMESA-3246 Upgrade Arrow to 11.0.0)
=======
>>>>>>> 7564665969 (GEOMESA-3254 Add Bloop build support)
=======
>>>>>>> 6c49bcd685 (GEOMESA-3246 Upgrade Arrow to 11.0.0)
<<<<<<< HEAD
<<<<<<< HEAD
=======
>>>>>>> e74fa3f690 (GEOMESA-3254 Add Bloop build support)
=======
>>>>>>> d18777a94f (GEOMESA-3246 Upgrade Arrow to 11.0.0)
<<<<<<< HEAD
=======
>>>>>>> 9e49c1aac7 (GEOMESA-3254 Add Bloop build support)
=======
>>>>>>> 630900cfbb (GEOMESA-3246 Upgrade Arrow to 11.0.0)
=======
>>>>>>> 3e610250ce (GEOMESA-3254 Add Bloop build support)
=======
>>>>>>> 320759d5d3 (GEOMESA-3246 Upgrade Arrow to 11.0.0)
=======
=======
>>>>>>> 7564665969 (GEOMESA-3254 Add Bloop build support)
>>>>>>> f586fec5a3 (GEOMESA-3254 Add Bloop build support)
=======
>>>>>>> 52579ffb37 (GEOMESA-3246 Upgrade Arrow to 11.0.0)
=======
=======
>>>>>>> e74fa3f690 (GEOMESA-3254 Add Bloop build support)
>>>>>>> b39bd292d4 (GEOMESA-3254 Add Bloop build support)
=======
>>>>>>> 556d966249 (GEOMESA-3246 Upgrade Arrow to 11.0.0)
import org.locationtech.geomesa.utils.io.WithClose
=======
import org.locationtech.geomesa.utils.io.{PathUtils, WithClose}
>>>>>>> locatelli-main
=======
=======
>>>>>>> 52579ffb37 (GEOMESA-3246 Upgrade Arrow to 11.0.0)
=======
>>>>>>> b39bd292d4 (GEOMESA-3254 Add Bloop build support)
=======
>>>>>>> 556d966249 (GEOMESA-3246 Upgrade Arrow to 11.0.0)
=======
>>>>>>> 7564665969 (GEOMESA-3254 Add Bloop build support)
=======
>>>>>>> 6c49bcd685 (GEOMESA-3246 Upgrade Arrow to 11.0.0)
<<<<<<< HEAD
<<<<<<< HEAD
=======
>>>>>>> e74fa3f690 (GEOMESA-3254 Add Bloop build support)
=======
>>>>>>> d18777a94f (GEOMESA-3246 Upgrade Arrow to 11.0.0)
<<<<<<< HEAD
=======
>>>>>>> 9e49c1aac7 (GEOMESA-3254 Add Bloop build support)
=======
>>>>>>> 630900cfbb (GEOMESA-3246 Upgrade Arrow to 11.0.0)
=======
>>>>>>> 3e610250ce (GEOMESA-3254 Add Bloop build support)
=======
>>>>>>> 320759d5d3 (GEOMESA-3246 Upgrade Arrow to 11.0.0)
=======
=======
>>>>>>> 7564665969 (GEOMESA-3254 Add Bloop build support)
>>>>>>> f586fec5a3 (GEOMESA-3254 Add Bloop build support)
=======
>>>>>>> 52579ffb37 (GEOMESA-3246 Upgrade Arrow to 11.0.0)
=======
=======
>>>>>>> e74fa3f690 (GEOMESA-3254 Add Bloop build support)
>>>>>>> b39bd292d4 (GEOMESA-3254 Add Bloop build support)
=======
>>>>>>> 556d966249 (GEOMESA-3246 Upgrade Arrow to 11.0.0)
import org.locationtech.geomesa.utils.io.WithClose
=======
import org.locationtech.geomesa.utils.io.{PathUtils, WithClose}
>>>>>>> locatelli-main
=======
=======
>>>>>>> 52579ffb37 (GEOMESA-3246 Upgrade Arrow to 11.0.0)
=======
>>>>>>> b39bd292d4 (GEOMESA-3254 Add Bloop build support)
=======
>>>>>>> 556d966249 (GEOMESA-3246 Upgrade Arrow to 11.0.0)
=======
>>>>>>> 7564665969 (GEOMESA-3254 Add Bloop build support)
=======
>>>>>>> 6c49bcd685 (GEOMESA-3246 Upgrade Arrow to 11.0.0)
<<<<<<< HEAD
<<<<<<< HEAD
=======
>>>>>>> e74fa3f690 (GEOMESA-3254 Add Bloop build support)
=======
>>>>>>> d18777a94f (GEOMESA-3246 Upgrade Arrow to 11.0.0)
<<<<<<< HEAD
=======
>>>>>>> 9e49c1aac7 (GEOMESA-3254 Add Bloop build support)
=======
>>>>>>> 630900cfbb (GEOMESA-3246 Upgrade Arrow to 11.0.0)
=======
>>>>>>> 3e610250ce (GEOMESA-3254 Add Bloop build support)
=======
>>>>>>> 320759d5d3 (GEOMESA-3246 Upgrade Arrow to 11.0.0)
=======
=======
>>>>>>> 7564665969 (GEOMESA-3254 Add Bloop build support)
>>>>>>> f586fec5a3 (GEOMESA-3254 Add Bloop build support)
=======
>>>>>>> 52579ffb37 (GEOMESA-3246 Upgrade Arrow to 11.0.0)
=======
=======
>>>>>>> e74fa3f690 (GEOMESA-3254 Add Bloop build support)
>>>>>>> b39bd292d4 (GEOMESA-3254 Add Bloop build support)
=======
>>>>>>> 556d966249 (GEOMESA-3246 Upgrade Arrow to 11.0.0)
import org.locationtech.geomesa.utils.io.WithClose
=======
import org.locationtech.geomesa.utils.io.{PathUtils, WithClose}
>>>>>>> locatelli-main
>>>>>>> 58d14a257e (GEOMESA-3254 Add Bloop build support)
<<<<<<< HEAD
<<<<<<< HEAD
<<<<<<< HEAD
<<<<<<< HEAD
<<<<<<< HEAD
<<<<<<< HEAD
=======
>>>>>>> f586fec5a3 (GEOMESA-3254 Add Bloop build support)
=======
>>>>>>> 52579ffb37 (GEOMESA-3246 Upgrade Arrow to 11.0.0)
<<<<<<< HEAD
<<<<<<< HEAD
<<<<<<< HEAD
<<<<<<< HEAD
<<<<<<< HEAD
<<<<<<< HEAD
<<<<<<< HEAD
<<<<<<< HEAD
<<<<<<< HEAD
<<<<<<< HEAD
<<<<<<< HEAD
<<<<<<< HEAD
<<<<<<< HEAD
<<<<<<< HEAD
<<<<<<< HEAD
<<<<<<< HEAD
<<<<<<< HEAD
<<<<<<< HEAD
<<<<<<< HEAD
<<<<<<< HEAD
<<<<<<< HEAD
<<<<<<< HEAD
<<<<<<< HEAD
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
import org.locationtech.geomesa.utils.io.WithClose
>>>>>>> a928f2f739 (GEOMESA-3246 Upgrade Arrow to 11.0.0)
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
>>>>>>> 05a1868e90 (GEOMESA-3246 Upgrade Arrow to 11.0.0)
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
>>>>>>> b39bd292d4 (GEOMESA-3254 Add Bloop build support)
=======
>>>>>>> 556d966249 (GEOMESA-3246 Upgrade Arrow to 11.0.0)
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
>>>>>>> b39bd292d4 (GEOMESA-3254 Add Bloop build support)
=======
>>>>>>> 556d966249 (GEOMESA-3246 Upgrade Arrow to 11.0.0)
>>>>>>> locatelli-main
=======
>>>>>>> b39bd292d4 (GEOMESA-3254 Add Bloop build support)
=======
>>>>>>> 556d966249 (GEOMESA-3246 Upgrade Arrow to 11.0.0)
>>>>>>> locatelli-main
=======
>>>>>>> b39bd292d4 (GEOMESA-3254 Add Bloop build support)
=======
>>>>>>> 556d966249 (GEOMESA-3246 Upgrade Arrow to 11.0.0)
>>>>>>> locatelli-main
=======
>>>>>>> b39bd292d4 (GEOMESA-3254 Add Bloop build support)
=======
>>>>>>> 556d966249 (GEOMESA-3246 Upgrade Arrow to 11.0.0)
>>>>>>> locatelli-main
=======
>>>>>>> b39bd292d4 (GEOMESA-3254 Add Bloop build support)
=======
>>>>>>> 556d966249 (GEOMESA-3246 Upgrade Arrow to 11.0.0)
>>>>>>> locatelli-main
=======
>>>>>>> b39bd292d4 (GEOMESA-3254 Add Bloop build support)
=======
>>>>>>> 556d966249 (GEOMESA-3246 Upgrade Arrow to 11.0.0)
>>>>>>> locatelli-main
=======
>>>>>>> b39bd292d4 (GEOMESA-3254 Add Bloop build support)
=======
>>>>>>> 556d966249 (GEOMESA-3246 Upgrade Arrow to 11.0.0)
>>>>>>> locatelli-main
=======
>>>>>>> b39bd292d4 (GEOMESA-3254 Add Bloop build support)
=======
>>>>>>> 556d966249 (GEOMESA-3246 Upgrade Arrow to 11.0.0)
>>>>>>> locatelli-main
=======
>>>>>>> b39bd292d4 (GEOMESA-3254 Add Bloop build support)
=======
>>>>>>> 556d966249 (GEOMESA-3246 Upgrade Arrow to 11.0.0)
>>>>>>> locatelli-main
=======
>>>>>>> b39bd292d4 (GEOMESA-3254 Add Bloop build support)
=======
>>>>>>> 556d966249 (GEOMESA-3246 Upgrade Arrow to 11.0.0)
>>>>>>> locatelli-main
=======
>>>>>>> b39bd292d4 (GEOMESA-3254 Add Bloop build support)
=======
>>>>>>> 556d966249 (GEOMESA-3246 Upgrade Arrow to 11.0.0)
>>>>>>> locatelli-main
=======
>>>>>>> b39bd292d4 (GEOMESA-3254 Add Bloop build support)
=======
>>>>>>> 556d966249 (GEOMESA-3246 Upgrade Arrow to 11.0.0)
>>>>>>> locatelli-main
=======
>>>>>>> b39bd292d4 (GEOMESA-3254 Add Bloop build support)
=======
>>>>>>> 556d966249 (GEOMESA-3246 Upgrade Arrow to 11.0.0)
>>>>>>> locatelli-main
=======
>>>>>>> b39bd292d4 (GEOMESA-3254 Add Bloop build support)
=======
>>>>>>> 556d966249 (GEOMESA-3246 Upgrade Arrow to 11.0.0)
>>>>>>> locatelli-main
=======
>>>>>>> b39bd292d4 (GEOMESA-3254 Add Bloop build support)
=======
>>>>>>> 556d966249 (GEOMESA-3246 Upgrade Arrow to 11.0.0)
>>>>>>> locatelli-main
=======
>>>>>>> b39bd292d4 (GEOMESA-3254 Add Bloop build support)
=======
>>>>>>> 556d966249 (GEOMESA-3246 Upgrade Arrow to 11.0.0)
>>>>>>> locatelli-main
=======
>>>>>>> b39bd292d4 (GEOMESA-3254 Add Bloop build support)
=======
>>>>>>> 556d966249 (GEOMESA-3246 Upgrade Arrow to 11.0.0)
>>>>>>> locatelli-main
=======
>>>>>>> b39bd292d4 (GEOMESA-3254 Add Bloop build support)
=======
>>>>>>> 556d966249 (GEOMESA-3246 Upgrade Arrow to 11.0.0)
>>>>>>> locatelli-main
=======
>>>>>>> b39bd292d4 (GEOMESA-3254 Add Bloop build support)
=======
>>>>>>> 556d966249 (GEOMESA-3246 Upgrade Arrow to 11.0.0)
>>>>>>> locatelli-main
=======
>>>>>>> b39bd292d4 (GEOMESA-3254 Add Bloop build support)
=======
>>>>>>> 556d966249 (GEOMESA-3246 Upgrade Arrow to 11.0.0)
>>>>>>> locatelli-main
=======
>>>>>>> b39bd292d4 (GEOMESA-3254 Add Bloop build support)
=======
>>>>>>> 556d966249 (GEOMESA-3246 Upgrade Arrow to 11.0.0)
>>>>>>> locatelli-main
=======
>>>>>>> b39bd292d4 (GEOMESA-3254 Add Bloop build support)
=======
>>>>>>> 556d966249 (GEOMESA-3246 Upgrade Arrow to 11.0.0)
>>>>>>> locatelli-main
=======
>>>>>>> b39bd292d4 (GEOMESA-3254 Add Bloop build support)
=======
>>>>>>> 556d966249 (GEOMESA-3246 Upgrade Arrow to 11.0.0)
>>>>>>> locatelli-main
=======
>>>>>>> b39bd292d4 (GEOMESA-3254 Add Bloop build support)
=======
>>>>>>> 556d966249 (GEOMESA-3246 Upgrade Arrow to 11.0.0)
>>>>>>> locatelli-main
=======
>>>>>>> b39bd292d4 (GEOMESA-3254 Add Bloop build support)
=======
>>>>>>> 556d966249 (GEOMESA-3246 Upgrade Arrow to 11.0.0)
>>>>>>> locatelli-main
=======
>>>>>>> b39bd292d4 (GEOMESA-3254 Add Bloop build support)
=======
>>>>>>> 556d966249 (GEOMESA-3246 Upgrade Arrow to 11.0.0)
>>>>>>> locatelli-main
=======
>>>>>>> b39bd292d4 (GEOMESA-3254 Add Bloop build support)
=======
>>>>>>> 556d966249 (GEOMESA-3246 Upgrade Arrow to 11.0.0)
>>>>>>> locatelli-main
=======
>>>>>>> b39bd292d4 (GEOMESA-3254 Add Bloop build support)
=======
>>>>>>> 556d966249 (GEOMESA-3246 Upgrade Arrow to 11.0.0)
>>>>>>> locatelli-main
=======
>>>>>>> 05a1868e90 (GEOMESA-3246 Upgrade Arrow to 11.0.0)
=======
>>>>>>> e74fa3f690 (GEOMESA-3254 Add Bloop build support)
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
>>>>>>> 556d966249 (GEOMESA-3246 Upgrade Arrow to 11.0.0)
>>>>>>> locatelli-main
=======
<<<<<<< HEAD
=======
>>>>>>> 556d966249 (GEOMESA-3246 Upgrade Arrow to 11.0.0)
>>>>>>> locatelli-main
=======
>>>>>>> 556d966249 (GEOMESA-3246 Upgrade Arrow to 11.0.0)
>>>>>>> locatelli-main
=======
>>>>>>> 556d966249 (GEOMESA-3246 Upgrade Arrow to 11.0.0)
>>>>>>> locatelli-main
=======
>>>>>>> 556d966249 (GEOMESA-3246 Upgrade Arrow to 11.0.0)
>>>>>>> locatelli-main
=======
>>>>>>> 556d966249 (GEOMESA-3246 Upgrade Arrow to 11.0.0)
>>>>>>> locatelli-main
=======
>>>>>>> 556d966249 (GEOMESA-3246 Upgrade Arrow to 11.0.0)
>>>>>>> locatelli-main
=======
>>>>>>> 556d966249 (GEOMESA-3246 Upgrade Arrow to 11.0.0)
>>>>>>> locatelli-main
=======
>>>>>>> 556d966249 (GEOMESA-3246 Upgrade Arrow to 11.0.0)
>>>>>>> locatelli-main
=======
>>>>>>> 556d966249 (GEOMESA-3246 Upgrade Arrow to 11.0.0)
>>>>>>> locatelli-main
=======
>>>>>>> 556d966249 (GEOMESA-3246 Upgrade Arrow to 11.0.0)
>>>>>>> locatelli-main
=======
>>>>>>> 556d966249 (GEOMESA-3246 Upgrade Arrow to 11.0.0)
>>>>>>> locatelli-main
=======
>>>>>>> 556d966249 (GEOMESA-3246 Upgrade Arrow to 11.0.0)
>>>>>>> locatelli-main
=======
>>>>>>> 556d966249 (GEOMESA-3246 Upgrade Arrow to 11.0.0)
>>>>>>> locatelli-main
=======
>>>>>>> 556d966249 (GEOMESA-3246 Upgrade Arrow to 11.0.0)
>>>>>>> locatelli-main
=======
>>>>>>> 556d966249 (GEOMESA-3246 Upgrade Arrow to 11.0.0)
>>>>>>> locatelli-main
=======
>>>>>>> 556d966249 (GEOMESA-3246 Upgrade Arrow to 11.0.0)
>>>>>>> locatelli-main
=======
>>>>>>> 556d966249 (GEOMESA-3246 Upgrade Arrow to 11.0.0)
>>>>>>> locatelli-main
=======
>>>>>>> 556d966249 (GEOMESA-3246 Upgrade Arrow to 11.0.0)
>>>>>>> locatelli-main
=======
>>>>>>> 556d966249 (GEOMESA-3246 Upgrade Arrow to 11.0.0)
>>>>>>> locatelli-main
=======
>>>>>>> 556d966249 (GEOMESA-3246 Upgrade Arrow to 11.0.0)
>>>>>>> locatelli-main
=======
>>>>>>> 556d966249 (GEOMESA-3246 Upgrade Arrow to 11.0.0)
>>>>>>> locatelli-main
=======
>>>>>>> 556d966249 (GEOMESA-3246 Upgrade Arrow to 11.0.0)
>>>>>>> locatelli-main
=======
>>>>>>> 556d966249 (GEOMESA-3246 Upgrade Arrow to 11.0.0)
>>>>>>> locatelli-main
=======
>>>>>>> 556d966249 (GEOMESA-3246 Upgrade Arrow to 11.0.0)
>>>>>>> locatelli-main
=======
>>>>>>> 556d966249 (GEOMESA-3246 Upgrade Arrow to 11.0.0)
>>>>>>> locatelli-main
=======
>>>>>>> 556d966249 (GEOMESA-3246 Upgrade Arrow to 11.0.0)
>>>>>>> locatelli-main
=======
>>>>>>> 556d966249 (GEOMESA-3246 Upgrade Arrow to 11.0.0)
>>>>>>> locatelli-main
=======
>>>>>>> 556d966249 (GEOMESA-3246 Upgrade Arrow to 11.0.0)
>>>>>>> locatelli-main
=======
>>>>>>> 556d966249 (GEOMESA-3246 Upgrade Arrow to 11.0.0)
>>>>>>> locatelli-main
=======
>>>>>>> 556d966249 (GEOMESA-3246 Upgrade Arrow to 11.0.0)
>>>>>>> locatelli-main
=======
>>>>>>> 556d966249 (GEOMESA-3246 Upgrade Arrow to 11.0.0)
>>>>>>> locatelli-main
=======
>>>>>>> 556d966249 (GEOMESA-3246 Upgrade Arrow to 11.0.0)
>>>>>>> locatelli-main
=======
=======
>>>>>>> 05a1868e90 (GEOMESA-3246 Upgrade Arrow to 11.0.0)
>>>>>>> d18777a94f (GEOMESA-3246 Upgrade Arrow to 11.0.0)
<<<<<<< HEAD
<<<<<<< HEAD
<<<<<<< HEAD
<<<<<<< HEAD
<<<<<<< HEAD
<<<<<<< HEAD
<<<<<<< HEAD
<<<<<<< HEAD
<<<<<<< HEAD
<<<<<<< HEAD
<<<<<<< HEAD
<<<<<<< HEAD
<<<<<<< HEAD
<<<<<<< HEAD
<<<<<<< HEAD
<<<<<<< HEAD
<<<<<<< HEAD
<<<<<<< HEAD
<<<<<<< HEAD
<<<<<<< HEAD
<<<<<<< HEAD
<<<<<<< HEAD
<<<<<<< HEAD
<<<<<<< HEAD
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
>>>>>>> 3e610250ce (GEOMESA-3254 Add Bloop build support)
=======
=======
>>>>>>> 05a1868e90 (GEOMESA-3246 Upgrade Arrow to 11.0.0)
>>>>>>> 320759d5d3 (GEOMESA-3246 Upgrade Arrow to 11.0.0)
=======
>>>>>>> b39bd292d4 (GEOMESA-3254 Add Bloop build support)
=======
>>>>>>> 556d966249 (GEOMESA-3246 Upgrade Arrow to 11.0.0)
<<<<<<< HEAD
<<<<<<< HEAD
<<<<<<< HEAD
<<<<<<< HEAD
<<<<<<< HEAD
<<<<<<< HEAD
<<<<<<< HEAD
<<<<<<< HEAD
<<<<<<< HEAD
<<<<<<< HEAD
<<<<<<< HEAD
<<<<<<< HEAD
<<<<<<< HEAD
<<<<<<< HEAD
<<<<<<< HEAD
<<<<<<< HEAD
<<<<<<< HEAD
<<<<<<< HEAD
<<<<<<< HEAD
<<<<<<< HEAD
<<<<<<< HEAD
<<<<<<< HEAD
<<<<<<< HEAD
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
import org.locationtech.geomesa.utils.io.WithClose
=======
import org.locationtech.geomesa.utils.io.{PathUtils, WithClose}
>>>>>>> 58d14a257 (GEOMESA-3254 Add Bloop build support)
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
>>>>>>> d18777a94f (GEOMESA-3246 Upgrade Arrow to 11.0.0)
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
>>>>>>> d18777a94f (GEOMESA-3246 Upgrade Arrow to 11.0.0)
<<<<<<< HEAD
>>>>>>> locatelli-main
=======
>>>>>>> locatelli-main
=======
>>>>>>> locatelli-main
=======
<<<<<<< HEAD
=======
>>>>>>> d18777a94f (GEOMESA-3246 Upgrade Arrow to 11.0.0)
>>>>>>> locatelli-main
=======
>>>>>>> d18777a94f (GEOMESA-3246 Upgrade Arrow to 11.0.0)
>>>>>>> locatelli-main
=======
>>>>>>> d18777a94f (GEOMESA-3246 Upgrade Arrow to 11.0.0)
>>>>>>> locatelli-main
=======
>>>>>>> d18777a94f (GEOMESA-3246 Upgrade Arrow to 11.0.0)
>>>>>>> locatelli-main
=======
>>>>>>> d18777a94f (GEOMESA-3246 Upgrade Arrow to 11.0.0)
>>>>>>> locatelli-main
=======
>>>>>>> d18777a94f (GEOMESA-3246 Upgrade Arrow to 11.0.0)
>>>>>>> locatelli-main
=======
>>>>>>> d18777a94f (GEOMESA-3246 Upgrade Arrow to 11.0.0)
>>>>>>> locatelli-main
=======
>>>>>>> d18777a94f (GEOMESA-3246 Upgrade Arrow to 11.0.0)
>>>>>>> locatelli-main
=======
>>>>>>> d18777a94f (GEOMESA-3246 Upgrade Arrow to 11.0.0)
>>>>>>> locatelli-main
=======
>>>>>>> d18777a94f (GEOMESA-3246 Upgrade Arrow to 11.0.0)
>>>>>>> locatelli-main
=======
>>>>>>> d18777a94f (GEOMESA-3246 Upgrade Arrow to 11.0.0)
>>>>>>> locatelli-main
=======
>>>>>>> d18777a94f (GEOMESA-3246 Upgrade Arrow to 11.0.0)
>>>>>>> locatelli-main
=======
>>>>>>> d18777a94f (GEOMESA-3246 Upgrade Arrow to 11.0.0)
>>>>>>> locatelli-main
=======
>>>>>>> d18777a94f (GEOMESA-3246 Upgrade Arrow to 11.0.0)
>>>>>>> locatelli-main
=======
>>>>>>> d18777a94f (GEOMESA-3246 Upgrade Arrow to 11.0.0)
>>>>>>> locatelli-main
=======
>>>>>>> d18777a94f (GEOMESA-3246 Upgrade Arrow to 11.0.0)
>>>>>>> locatelli-main
=======
>>>>>>> d18777a94f (GEOMESA-3246 Upgrade Arrow to 11.0.0)
>>>>>>> locatelli-main
=======
>>>>>>> d18777a94f (GEOMESA-3246 Upgrade Arrow to 11.0.0)
>>>>>>> locatelli-main
=======
>>>>>>> d18777a94f (GEOMESA-3246 Upgrade Arrow to 11.0.0)
>>>>>>> locatelli-main
=======
>>>>>>> d18777a94f (GEOMESA-3246 Upgrade Arrow to 11.0.0)
>>>>>>> locatelli-main
=======
>>>>>>> d18777a94f (GEOMESA-3246 Upgrade Arrow to 11.0.0)
>>>>>>> locatelli-main
=======
>>>>>>> d18777a94f (GEOMESA-3246 Upgrade Arrow to 11.0.0)
>>>>>>> locatelli-main
=======
>>>>>>> d18777a94f (GEOMESA-3246 Upgrade Arrow to 11.0.0)
>>>>>>> locatelli-main
=======
>>>>>>> d18777a94f (GEOMESA-3246 Upgrade Arrow to 11.0.0)
>>>>>>> locatelli-main
=======
>>>>>>> d18777a94f (GEOMESA-3246 Upgrade Arrow to 11.0.0)
>>>>>>> locatelli-main
=======
>>>>>>> d18777a94f (GEOMESA-3246 Upgrade Arrow to 11.0.0)
>>>>>>> locatelli-main
=======
>>>>>>> d18777a94f (GEOMESA-3246 Upgrade Arrow to 11.0.0)
>>>>>>> locatelli-main
=======
>>>>>>> d18777a94f (GEOMESA-3246 Upgrade Arrow to 11.0.0)
>>>>>>> locatelli-main
=======
>>>>>>> d18777a94f (GEOMESA-3246 Upgrade Arrow to 11.0.0)
>>>>>>> locatelli-main
=======
>>>>>>> 320759d5d3 (GEOMESA-3246 Upgrade Arrow to 11.0.0)
=======
>>>>>>> b39bd292d4 (GEOMESA-3254 Add Bloop build support)
=======
=======
>>>>>>> d18777a94f (GEOMESA-3246 Upgrade Arrow to 11.0.0)
>>>>>>> 556d966249 (GEOMESA-3246 Upgrade Arrow to 11.0.0)
<<<<<<< HEAD
<<<<<<< HEAD
<<<<<<< HEAD
<<<<<<< HEAD
<<<<<<< HEAD
<<<<<<< HEAD
<<<<<<< HEAD
<<<<<<< HEAD
<<<<<<< HEAD
<<<<<<< HEAD
<<<<<<< HEAD
<<<<<<< HEAD
<<<<<<< HEAD
<<<<<<< HEAD
<<<<<<< HEAD
<<<<<<< HEAD
<<<<<<< HEAD
<<<<<<< HEAD
<<<<<<< HEAD
<<<<<<< HEAD
<<<<<<< HEAD
<<<<<<< HEAD
<<<<<<< HEAD
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
>>>>>>> fa60953a42 (GEOMESA-3254 Add Bloop build support)
=======
=======
import org.locationtech.geomesa.utils.io.WithClose
>>>>>>> a928f2f73 (GEOMESA-3246 Upgrade Arrow to 11.0.0)
>>>>>>> 05a1868e90 (GEOMESA-3246 Upgrade Arrow to 11.0.0)
<<<<<<< HEAD
<<<<<<< HEAD
<<<<<<< HEAD
<<<<<<< HEAD
<<<<<<< HEAD
<<<<<<< HEAD
<<<<<<< HEAD
<<<<<<< HEAD
<<<<<<< HEAD
<<<<<<< HEAD
<<<<<<< HEAD
<<<<<<< HEAD
<<<<<<< HEAD
<<<<<<< HEAD
<<<<<<< HEAD
<<<<<<< HEAD
<<<<<<< HEAD
<<<<<<< HEAD
<<<<<<< HEAD
<<<<<<< HEAD
<<<<<<< HEAD
<<<<<<< HEAD
<<<<<<< HEAD
<<<<<<< HEAD
<<<<<<< HEAD
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
<<<<<<< HEAD
=======
>>>>>>> 556d966249 (GEOMESA-3246 Upgrade Arrow to 11.0.0)
<<<<<<< HEAD
>>>>>>> locatelli-main
=======
>>>>>>> locatelli-main
=======
<<<<<<< HEAD
=======
>>>>>>> 556d966249 (GEOMESA-3246 Upgrade Arrow to 11.0.0)
>>>>>>> locatelli-main
=======
=======
>>>>>>> 556d966249 (GEOMESA-3246 Upgrade Arrow to 11.0.0)
>>>>>>> locatelli-main
=======
=======
>>>>>>> 556d966249 (GEOMESA-3246 Upgrade Arrow to 11.0.0)
>>>>>>> locatelli-main
=======
=======
>>>>>>> 556d966249 (GEOMESA-3246 Upgrade Arrow to 11.0.0)
>>>>>>> locatelli-main
=======
=======
>>>>>>> 556d966249 (GEOMESA-3246 Upgrade Arrow to 11.0.0)
>>>>>>> locatelli-main
=======
=======
>>>>>>> 556d966249 (GEOMESA-3246 Upgrade Arrow to 11.0.0)
>>>>>>> locatelli-main
=======
=======
>>>>>>> 556d966249 (GEOMESA-3246 Upgrade Arrow to 11.0.0)
>>>>>>> locatelli-main
=======
=======
>>>>>>> 556d966249 (GEOMESA-3246 Upgrade Arrow to 11.0.0)
>>>>>>> locatelli-main
=======
=======
>>>>>>> 556d966249 (GEOMESA-3246 Upgrade Arrow to 11.0.0)
>>>>>>> locatelli-main
=======
=======
>>>>>>> 556d966249 (GEOMESA-3246 Upgrade Arrow to 11.0.0)
>>>>>>> locatelli-main
=======
=======
>>>>>>> 556d966249 (GEOMESA-3246 Upgrade Arrow to 11.0.0)
>>>>>>> locatelli-main
=======
=======
>>>>>>> 556d966249 (GEOMESA-3246 Upgrade Arrow to 11.0.0)
>>>>>>> locatelli-main
=======
=======
>>>>>>> 556d966249 (GEOMESA-3246 Upgrade Arrow to 11.0.0)
>>>>>>> locatelli-main
=======
=======
>>>>>>> 556d966249 (GEOMESA-3246 Upgrade Arrow to 11.0.0)
>>>>>>> locatelli-main
=======
=======
>>>>>>> 556d966249 (GEOMESA-3246 Upgrade Arrow to 11.0.0)
>>>>>>> locatelli-main
=======
=======
>>>>>>> 556d966249 (GEOMESA-3246 Upgrade Arrow to 11.0.0)
>>>>>>> locatelli-main
=======
=======
>>>>>>> 556d966249 (GEOMESA-3246 Upgrade Arrow to 11.0.0)
>>>>>>> locatelli-main
=======
=======
>>>>>>> 556d966249 (GEOMESA-3246 Upgrade Arrow to 11.0.0)
>>>>>>> locatelli-main
=======
=======
>>>>>>> 556d966249 (GEOMESA-3246 Upgrade Arrow to 11.0.0)
>>>>>>> locatelli-main
=======
=======
>>>>>>> 556d966249 (GEOMESA-3246 Upgrade Arrow to 11.0.0)
>>>>>>> locatelli-main
=======
=======
>>>>>>> 556d966249 (GEOMESA-3246 Upgrade Arrow to 11.0.0)
>>>>>>> locatelli-main
=======
=======
>>>>>>> 556d966249 (GEOMESA-3246 Upgrade Arrow to 11.0.0)
>>>>>>> locatelli-main
=======
=======
>>>>>>> 556d966249 (GEOMESA-3246 Upgrade Arrow to 11.0.0)
>>>>>>> locatelli-main
=======
=======
>>>>>>> 556d966249 (GEOMESA-3246 Upgrade Arrow to 11.0.0)
>>>>>>> locatelli-main
=======
=======
>>>>>>> 556d966249 (GEOMESA-3246 Upgrade Arrow to 11.0.0)
>>>>>>> locatelli-main
=======
=======
>>>>>>> 556d966249 (GEOMESA-3246 Upgrade Arrow to 11.0.0)
>>>>>>> locatelli-main
=======
=======
>>>>>>> 556d966249 (GEOMESA-3246 Upgrade Arrow to 11.0.0)
>>>>>>> locatelli-main
=======
=======
>>>>>>> 556d966249 (GEOMESA-3246 Upgrade Arrow to 11.0.0)
>>>>>>> locatelli-main
=======
=======
>>>>>>> 556d966249 (GEOMESA-3246 Upgrade Arrow to 11.0.0)
>>>>>>> locatelli-main
=======
=======
>>>>>>> 556d966249 (GEOMESA-3246 Upgrade Arrow to 11.0.0)
>>>>>>> locatelli-main
=======
=======
>>>>>>> 556d966249 (GEOMESA-3246 Upgrade Arrow to 11.0.0)
>>>>>>> locatelli-main
=======
>>>>>>> 7564665969 (GEOMESA-3254 Add Bloop build support)
=======
=======
import org.locationtech.geomesa.utils.io.WithClose
>>>>>>> a928f2f739 (GEOMESA-3246 Upgrade Arrow to 11.0.0)
>>>>>>> 6c49bcd685 (GEOMESA-3246 Upgrade Arrow to 11.0.0)
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
>>>>>>> fa60953a42 (GEOMESA-3254 Add Bloop build support)
>>>>>>> e74fa3f690 (GEOMESA-3254 Add Bloop build support)
=======
>>>>>>> d18777a94f (GEOMESA-3246 Upgrade Arrow to 11.0.0)
<<<<<<< HEAD
<<<<<<< HEAD
<<<<<<< HEAD
<<<<<<< HEAD
<<<<<<< HEAD
<<<<<<< HEAD
<<<<<<< HEAD
<<<<<<< HEAD
<<<<<<< HEAD
<<<<<<< HEAD
<<<<<<< HEAD
<<<<<<< HEAD
<<<<<<< HEAD
<<<<<<< HEAD
<<<<<<< HEAD
<<<<<<< HEAD
<<<<<<< HEAD
<<<<<<< HEAD
<<<<<<< HEAD
<<<<<<< HEAD
<<<<<<< HEAD
<<<<<<< HEAD
<<<<<<< HEAD
<<<<<<< HEAD
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
>>>>>>> 9e49c1aac7 (GEOMESA-3254 Add Bloop build support)
=======
=======
import org.locationtech.geomesa.utils.io.WithClose
>>>>>>> a928f2f739 (GEOMESA-3246 Upgrade Arrow to 11.0.0)
>>>>>>> 630900cfbb (GEOMESA-3246 Upgrade Arrow to 11.0.0)
=======
>>>>>>> fa60953a42 (GEOMESA-3254 Add Bloop build support)
>>>>>>> 3e610250ce (GEOMESA-3254 Add Bloop build support)
=======
>>>>>>> 320759d5d3 (GEOMESA-3246 Upgrade Arrow to 11.0.0)
=======
=======
>>>>>>> 7564665969 (GEOMESA-3254 Add Bloop build support)
>>>>>>> f586fec5a3 (GEOMESA-3254 Add Bloop build support)
=======
>>>>>>> 52579ffb37 (GEOMESA-3246 Upgrade Arrow to 11.0.0)
=======
=======
>>>>>>> fa60953a42 (GEOMESA-3254 Add Bloop build support)
>>>>>>> e74fa3f690 (GEOMESA-3254 Add Bloop build support)
>>>>>>> b39bd292d4 (GEOMESA-3254 Add Bloop build support)
=======
>>>>>>> 556d966249 (GEOMESA-3246 Upgrade Arrow to 11.0.0)
<<<<<<< HEAD
<<<<<<< HEAD
<<<<<<< HEAD
<<<<<<< HEAD
<<<<<<< HEAD
<<<<<<< HEAD
<<<<<<< HEAD
<<<<<<< HEAD
<<<<<<< HEAD
<<<<<<< HEAD
<<<<<<< HEAD
<<<<<<< HEAD
<<<<<<< HEAD
<<<<<<< HEAD
<<<<<<< HEAD
<<<<<<< HEAD
<<<<<<< HEAD
<<<<<<< HEAD
<<<<<<< HEAD
<<<<<<< HEAD
<<<<<<< HEAD
<<<<<<< HEAD
<<<<<<< HEAD
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
import org.locationtech.jts.geom.Point
import org.specs2.mutable.Specification
import org.specs2.runner.JUnitRunner
import org.specs2.specification.BeforeAfterAll
import org.testcontainers.containers.PostgreSQLContainer
import org.testcontainers.containers.output.Slf4jLogConsumer
import org.testcontainers.utility.DockerImageName
<<<<<<< HEAD
<<<<<<< HEAD
<<<<<<< HEAD
<<<<<<< HEAD
<<<<<<< HEAD
<<<<<<< HEAD
<<<<<<< HEAD
<<<<<<< HEAD
<<<<<<< HEAD
<<<<<<< HEAD
<<<<<<< HEAD
<<<<<<< HEAD
<<<<<<< HEAD
<<<<<<< HEAD
<<<<<<< HEAD
<<<<<<< HEAD
<<<<<<< HEAD
<<<<<<< HEAD
<<<<<<< HEAD
<<<<<<< HEAD
<<<<<<< HEAD
<<<<<<< HEAD
<<<<<<< HEAD
<<<<<<< HEAD
<<<<<<< HEAD
<<<<<<< HEAD
<<<<<<< HEAD
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
>>>>>>> locationtech-main
=======
=======
>>>>>>> locatelli-main
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
>>>>>>> locatelli-main
=======
>>>>>>> locatelli-main
=======
>>>>>>> locatelli-main
=======
>>>>>>> locatelli-main
=======
>>>>>>> locatelli-main
=======
>>>>>>> locatelli-main
=======
>>>>>>> locatelli-main
=======
>>>>>>> locatelli-main
=======
>>>>>>> locatelli-main
=======
>>>>>>> locatelli-main
=======
>>>>>>> locatelli-main
=======
>>>>>>> locatelli-main
=======
>>>>>>> locatelli-main
=======
>>>>>>> locatelli-main
=======
>>>>>>> locatelli-main
=======
>>>>>>> locatelli-main
=======
>>>>>>> locatelli-main
=======
>>>>>>> locatelli-main
=======
>>>>>>> locatelli-main
=======
>>>>>>> locatelli-main
=======
>>>>>>> locatelli-main
=======
>>>>>>> locatelli-main
=======
>>>>>>> locatelli-main
=======
>>>>>>> locatelli-main
=======
>>>>>>> locatelli-main
=======
>>>>>>> locatelli-main
=======
>>>>>>> locatelli-main
=======
>>>>>>> locatelli-main

import java.io.ByteArrayInputStream
import java.nio.charset.StandardCharsets
import java.sql.{Connection, DriverManager}
import java.util.Date
=======
>>>>>>> a928f2f739 (GEOMESA-3246 Upgrade Arrow to 11.0.0)
=======
>>>>>>> 05a1868e90 (GEOMESA-3246 Upgrade Arrow to 11.0.0)
<<<<<<< HEAD
<<<<<<< HEAD
<<<<<<< HEAD
<<<<<<< HEAD
<<<<<<< HEAD
<<<<<<< HEAD
<<<<<<< HEAD
<<<<<<< HEAD
<<<<<<< HEAD
<<<<<<< HEAD
<<<<<<< HEAD
<<<<<<< HEAD
<<<<<<< HEAD
<<<<<<< HEAD
<<<<<<< HEAD
<<<<<<< HEAD
<<<<<<< HEAD
<<<<<<< HEAD
<<<<<<< HEAD
<<<<<<< HEAD
<<<<<<< HEAD
<<<<<<< HEAD
<<<<<<< HEAD
<<<<<<< HEAD
<<<<<<< HEAD
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
>>>>>>> locatelli-main
=======
>>>>>>> locatelli-main
=======
>>>>>>> locatelli-main
=======
>>>>>>> locatelli-main
=======
>>>>>>> locatelli-main
=======
>>>>>>> locatelli-main
=======
>>>>>>> locatelli-main
=======
>>>>>>> locatelli-main
=======
>>>>>>> locatelli-main
=======
>>>>>>> locatelli-main
=======
>>>>>>> locatelli-main
=======
>>>>>>> locatelli-main
=======
>>>>>>> locatelli-main
=======
>>>>>>> locatelli-main
=======
>>>>>>> locatelli-main
=======
>>>>>>> locatelli-main
=======
>>>>>>> locatelli-main
=======
>>>>>>> locatelli-main
=======
>>>>>>> locatelli-main
=======
>>>>>>> locatelli-main
=======
>>>>>>> locatelli-main
=======
>>>>>>> locatelli-main
=======
>>>>>>> locatelli-main
=======
>>>>>>> locatelli-main
=======
>>>>>>> locatelli-main
=======
>>>>>>> locatelli-main
=======
>>>>>>> locatelli-main
=======
>>>>>>> locatelli-main
=======
>>>>>>> locatelli-main
=======
>>>>>>> locatelli-main
=======
>>>>>>> locatelli-main
=======
>>>>>>> locatelli-main
=======
>>>>>>> locatelli-main

import java.io.ByteArrayInputStream
import java.nio.charset.StandardCharsets
import java.sql.{Connection, DriverManager}
import java.util.Date
=======
>>>>>>> a928f2f73 (GEOMESA-3246 Upgrade Arrow to 11.0.0)
=======
>>>>>>> 6c49bcd685 (GEOMESA-3246 Upgrade Arrow to 11.0.0)
=======
>>>>>>> d18777a94f (GEOMESA-3246 Upgrade Arrow to 11.0.0)

import java.io.ByteArrayInputStream
import java.nio.charset.StandardCharsets
import java.sql.{Connection, DriverManager}
import java.util.Date
=======
>>>>>>> a928f2f739 (GEOMESA-3246 Upgrade Arrow to 11.0.0)
=======
>>>>>>> 05a1868e90 (GEOMESA-3246 Upgrade Arrow to 11.0.0)
<<<<<<< HEAD
<<<<<<< HEAD
<<<<<<< HEAD
<<<<<<< HEAD
<<<<<<< HEAD
<<<<<<< HEAD
<<<<<<< HEAD
<<<<<<< HEAD
<<<<<<< HEAD
<<<<<<< HEAD
<<<<<<< HEAD
<<<<<<< HEAD
<<<<<<< HEAD
<<<<<<< HEAD
<<<<<<< HEAD
<<<<<<< HEAD
<<<<<<< HEAD
<<<<<<< HEAD
<<<<<<< HEAD
<<<<<<< HEAD
<<<<<<< HEAD
<<<<<<< HEAD
<<<<<<< HEAD
<<<<<<< HEAD
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
=======
>>>>>>> locatelli-main
=======
>>>>>>> locatelli-main
=======
>>>>>>> locatelli-main
=======
>>>>>>> locatelli-main
=======
>>>>>>> locatelli-main
=======
>>>>>>> locatelli-main
=======
>>>>>>> locatelli-main
=======
>>>>>>> locatelli-main
=======
>>>>>>> locatelli-main
=======
>>>>>>> locatelli-main
=======
>>>>>>> locatelli-main
=======
>>>>>>> locatelli-main
=======
>>>>>>> locatelli-main
=======
>>>>>>> locatelli-main
=======
>>>>>>> locatelli-main
=======
>>>>>>> locatelli-main
=======
>>>>>>> locatelli-main
=======
>>>>>>> locatelli-main
=======
>>>>>>> locatelli-main
=======
>>>>>>> locatelli-main
=======
>>>>>>> locatelli-main
=======
>>>>>>> locatelli-main
=======
>>>>>>> locatelli-main
=======
>>>>>>> locatelli-main
=======
>>>>>>> locatelli-main
=======
>>>>>>> locatelli-main
=======
>>>>>>> locatelli-main
=======
>>>>>>> locatelli-main
=======
>>>>>>> locatelli-main
=======
>>>>>>> locatelli-main
=======
>>>>>>> locatelli-main
=======
>>>>>>> locatelli-main

import java.io.ByteArrayInputStream
import java.nio.charset.StandardCharsets
import java.sql.{Connection, DriverManager}
import java.util.Date
=======
>>>>>>> a928f2f73 (GEOMESA-3246 Upgrade Arrow to 11.0.0)
=======
>>>>>>> 630900cfbb (GEOMESA-3246 Upgrade Arrow to 11.0.0)
=======
>>>>>>> 320759d5d3 (GEOMESA-3246 Upgrade Arrow to 11.0.0)
=======
>>>>>>> 52579ffb37 (GEOMESA-3246 Upgrade Arrow to 11.0.0)
=======
>>>>>>> 556d966249 (GEOMESA-3246 Upgrade Arrow to 11.0.0)

import java.io.ByteArrayInputStream
import java.nio.charset.StandardCharsets
import java.sql.{Connection, DriverManager}
import java.util.Date
=======
>>>>>>> a928f2f739 (GEOMESA-3246 Upgrade Arrow to 11.0.0)
=======
>>>>>>> 05a1868e90 (GEOMESA-3246 Upgrade Arrow to 11.0.0)

import java.io.ByteArrayInputStream
import java.nio.charset.StandardCharsets
import java.sql.{Connection, DriverManager}
import java.util.Date
=======
>>>>>>> a928f2f73 (GEOMESA-3246 Upgrade Arrow to 11.0.0)
=======
>>>>>>> 6c49bcd685 (GEOMESA-3246 Upgrade Arrow to 11.0.0)
=======
>>>>>>> d18777a94f (GEOMESA-3246 Upgrade Arrow to 11.0.0)

import java.io.ByteArrayInputStream
import java.nio.charset.StandardCharsets
import java.sql.{Connection, DriverManager}
import java.util.Date
=======
>>>>>>> a928f2f739 (GEOMESA-3246 Upgrade Arrow to 11.0.0)
=======
>>>>>>> 05a1868e90 (GEOMESA-3246 Upgrade Arrow to 11.0.0)
<<<<<<< HEAD
<<<<<<< HEAD
<<<<<<< HEAD
<<<<<<< HEAD
<<<<<<< HEAD
<<<<<<< HEAD
<<<<<<< HEAD
<<<<<<< HEAD
<<<<<<< HEAD
<<<<<<< HEAD
<<<<<<< HEAD
<<<<<<< HEAD
<<<<<<< HEAD
<<<<<<< HEAD
<<<<<<< HEAD
<<<<<<< HEAD
<<<<<<< HEAD
<<<<<<< HEAD
<<<<<<< HEAD
<<<<<<< HEAD
<<<<<<< HEAD
<<<<<<< HEAD
<<<<<<< HEAD
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

import java.io.ByteArrayInputStream
import java.nio.charset.StandardCharsets
import java.sql.{Connection, DriverManager}
import java.util.Date
=======
>>>>>>> a928f2f73 (GEOMESA-3246 Upgrade Arrow to 11.0.0)

import java.io.ByteArrayInputStream
import java.nio.charset.StandardCharsets
import java.sql.{Connection, DriverManager}
import java.util.Date

@RunWith(classOf[JUnitRunner])
class JdbcConverterTest extends Specification with BeforeAfterAll with LazyLogging {

  sequential

  var connection: Connection = _

  val sft = SimpleFeatureTypes.createType("example", "name:String,dtg:Date,*geom:Point:srid=4326")
  val features = (0 until 10).map { i =>
    ScalaSimpleFeature.create(sft, s"$i", s"name$i", s"2017-02-03T00:0$i:01.000Z", s"POINT(40 6$i)")
  }

  var container: PostgreSQLContainer[_] = _

  lazy val url = s"${container.getJdbcUrl}&user=${container.getUsername}&password=${container.getPassword}"

  override def beforeAll(): Unit = {
    val image = DockerImageName.parse("postgres").withTag(sys.props.getOrElse("postgres.docker.tag", "15.1"))
    container = new PostgreSQLContainer(image)
    // if we don't set the default db/name to postgres, the startup check fails as it restarts 3 times instead of the expected 2
    container.withDatabaseName("postgres")
    container.withUsername("postgres")
    container.start()
    container.followOutput(new Slf4jLogConsumer(logger.underlying))

    val create = "create table example(id BIGINT NOT NULL PRIMARY KEY, name VARCHAR, dtg TIMESTAMP, lat DOUBLE PRECISION, lon DOUBLE PRECISION);"
    val insert = "INSERT INTO example(id, name, dtg, lat, lon) VALUES (?, ?, ?, ?, ?);"

    WithClose(DriverManager.getConnection(url)) { connection =>
      WithClose(connection.prepareStatement(create))(_.execute)
      WithClose(connection.prepareStatement(insert)) { statement =>
        features.foreach { feature =>
          statement.setObject(1, feature.getID.toInt)
          statement.setObject(2, feature.getAttribute("name"))
          statement.setObject(3, new java.sql.Timestamp(feature.getAttribute("dtg").asInstanceOf[Date].getTime))
          statement.setObject(4, feature.getAttribute("geom").asInstanceOf[Point].getY)
          statement.setObject(5, feature.getAttribute("geom").asInstanceOf[Point].getX)
          statement.executeUpdate()
        }
      }
    }

  }

  override def afterAll(): Unit = {
    if (container != null) {
      container.stop()
    }
  }

  "JdbcConverter" should {
    "process select statements" >> {
      val conf = ConfigFactory.parseString(
        s"""
          | {
          |   type       = "jdbc",
          |   id-field   = "$$1::string",
          |   connection = "$url"
          |   fields = [
          |     { name = "name", transform = "$$2" },
          |     { name = "dtg",  transform = "$$3" },
          |     { name = "lat",  transform = "$$4" },
          |     { name = "lon",  transform = "$$5" },
          |     { name = "geom", transform = "point($$lon, $$lat)" }
          |   ]
          | }
        """.stripMargin)

      WithClose(SimpleFeatureConverter(sft, conf)) { converter =>
        converter must not(beNull)

        val sql = new ByteArrayInputStream("select * from example".getBytes(StandardCharsets.UTF_8))
        val res = WithClose(converter.process(sql))(_.toList)
        // note: comparison has to be done backwards,
        // as java.util.Date.equals(java.sql.Timestamp) != java.sql.Timestamp.equals(java.util.Date)
        features mustEqual res
      }
    }
  }
}
