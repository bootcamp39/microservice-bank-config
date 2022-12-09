#!/usr/bin/env bash

cd $PROJECT_PATH
npm run coverage
sed -i .bak 's/:.*\/src/:\/usr\/src\/src/g' ${PROJECT_PATH}/coverage/lcov.info

docker run --rm -v ${PROJECT_PATH}:/usr/src \
        newtmitch/sonar-scanner \
        -Dsonar.host.url=${SONAR_URI} \
        -Dsonar.login=${SONAR_USER} \
        -Dsonar.password=${SONAR_PASSWORD}
