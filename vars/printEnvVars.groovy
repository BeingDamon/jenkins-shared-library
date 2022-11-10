#!/usr/bin/env groovy

void printEnvVars(){
    sh "print env | sort"
}