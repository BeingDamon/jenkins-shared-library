#!/usr/bin/env groovy
def call(){
    withCredentials([usernamePassword(
    credentialsId: kubeConfigStaging,
    passwordVariable: 'GIT_PASSWORD',
    usernameVariable: 'GIT_USERNAME'
    )]) {
    // tag repository
    sh """
    
    """
  }

}
