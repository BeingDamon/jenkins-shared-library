#!/usr/bin/env groovy

def call{
    def buildName = currentBuild.buildName
    return buildName
}