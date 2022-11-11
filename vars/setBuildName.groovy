#!/usr/bin/env groovy


def call(String majorVersion, String minorVersion){
    currentBuild.displayName = majorVersion + minorVersion
    currentBuild.displayName = currentBuild.displayName + "# ${env.BUILD_NUMBER}"
    echo "$currentBuild.displayName"
    return currentBuild.displayName
}
