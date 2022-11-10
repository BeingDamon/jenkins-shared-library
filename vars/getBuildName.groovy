#!/usr/bin/env groovy

String getBuildName(){
    String buildName = currentBuild.buildName
    return buildName
}