pipeline {
    agent any
    stages {
        stage("Build Gradle") {
            steps {
                sh 'gradle clean build'
            }
        }
        stage("Run Tests") {
            steps {
                sh 'gradle test'
            }
            }
        }
    }
