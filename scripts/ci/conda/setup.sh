#!/bin/bash

conda update -n base -c defaults conda -y
conda install conda-build ninja compilers -y

pwd
ls
git clone https://github.com/conda-forge/proj.4-feedstock.git

cd proj.4-feedstock
cat > recipe/recipe_clobber.yaml <<EOL
source:
  git_url: https://github.com/OSGeo/PROJ.git
  git_rev: ${GITHUB_SHA}
  url:
  sha256:
<<<<<<< HEAD
<<<<<<< HEAD
<<<<<<< HEAD
  patches:
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
  patches:
>>>>>>> e4a6fd6d75 (typo fixes)
>>>>>>> aa21c6fa76 (typo fixes)

build:
  number: 2112
EOL

ls recipe
