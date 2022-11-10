#!/usr/bin/env groovy


def call(){
    def envVars = sh "print env | sort"
    echo "$envVars"
}

