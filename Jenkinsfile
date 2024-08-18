pipeline {
    agent any

    environment {
        NODE_OPTIONS = '--openssl-legacy-provider'
    }

    stages {
        stage('Checkout') {
            steps {
                // Checkout the code from the repository
                git 'https://github.com/meyamaria/mock-company-webapp.git'
            }
        }

        stage('Build Frontend') {
            steps {
                dir('client-app') {
                    bat 'yarn install'
                    bat 'yarn build'
                }
            }
        }

        stage('Build Backend') {
            steps {
                bat './gradlew assemble'
            }
        }

        stage('Test') {
            steps {
                bat './gradlew test'
            }
        }
    }

    post {
        success {
            echo 'Build and tests succeeded!'
        }
        failure {
            echo 'Build or tests failed.'
        }
    }
}
