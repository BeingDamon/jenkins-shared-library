#!/usr/bin/env groovy
package ace.jenkins

class Constants {
    // Major version number used by all jobs.
    // Corresponds with the sprint number; update this at the start of each sprint.
    static final MAJOR_VERSION_NUMBER = '1';
    static final kubeConfigDev = credentials("Kubeconfig-modops1-ddtc")
    static final kubeConfigStaging = credentials("Kubeconfig-modops2-ddtc")
    static final kubeConfigProd = credentials("Kubeconfig")
    static final ENVIRONMENT_DOMAIN_NAME = '.tld'
    static final ENVIRONMENT_TENANT = 'foobar';
}
