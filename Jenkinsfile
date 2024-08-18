pipeline {
    agent any

    stages {
        stage('Build') {
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
