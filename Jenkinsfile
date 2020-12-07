#!groovy
build('three-ds-server-client', 'docker-host') {
    checkoutRepo()
    loadBuildUtils()

    env.JAVA_HOME = sh(returnStdout: true, script: 'java-config --select-vm openjdk-bin-11 --jdk-home').trim()

    def javaLibPipeline
    runStage('load JavaLib pipeline') {
        javaLibPipeline = load("build_utils/jenkins_lib/pipeJavaLib.groovy")
    }

    def buildImageTag = "fcf116dd775cc2e91bffb6a36835754e3f2d5321"
    javaLibPipeline(buildImageTag)
}
