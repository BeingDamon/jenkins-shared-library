void setBuildName(String majorVersion, String minorVersion, String branch) {
    currentBuild.displayName = majorVersion + minorVersion
    currentBuild.displayName = currentBuild.displayName + "# ${env.BUILD_NUMBER}"
}