#!/usr/bin/env groovy
def call() {
   echo "Deploying to ${params.BUILD_ENV}"
   echo "this build number $BUILD_NUMBER"
}
