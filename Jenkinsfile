pipeline {
    agent any
    stages {
        stage("Build Gradle") {
            steps {
                sh 'gradle clean'
            }
        }
        stage("Run Acceptance Tests") {
            steps {
                sh 'gradle clean'
            }
        }
        stage("Run Gatling") {
            steps {
                sh 'gradle gatlingRun'
            }
            post {
                always {
                    gatlingArchive()
                }
            }
        }
    }
}