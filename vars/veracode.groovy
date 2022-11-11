#!/usr/bin/env groovy
def call(String applicationName, String canJobFail){
    currentBuildName = setBuildName("1", "0")
    withCredentials([[$class: 'usernamePassword', credentialsId: Constants.veracode_credID, usernameVariable: 'USERNAME', passwordVariable: 'token']]) {
    sh"""
        veracode applicationName: "${applicationName}",
        canFailJob: "${canJobFail}",
        createSandbox: true,
        criticality: 'VeryHigh',
        debug: true,
        fileNamePattern: '',
        replacementPattern: '',
        sandboxName: 'Enterprise-Jenkins-infra',
        scanIncludesPattern: '',
        uploadExcludesPattern: '',
        uploadIncludesPattern: '',
        scanName: "${currentBuildName}",
        team: 'ACE',
        timeout: '60',
        vid: '${VERACODE_ESCM_ID}',
        vkey: '${VERACODE_ESCM_KEY}',
        waitForScan: 'true'
    """
}
}