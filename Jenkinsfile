pipeline {
    agent any

    stages {
        stage('Build') {
            steps {
                
                sh './gradlew assemble'
            }
        }
        stage('Test') {
            steps {
                
                sh './gradlew test'
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
