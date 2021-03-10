pipeline {
    agent any

    stages {
        stage('Build') {
            steps {
                sh "./gradlew build"
            }
        }

        stage('Testing') {
            steps {
                sh "./gradlew test"
            }
        }

        stage('Deploy') {
            steps {
                echo "Here's is your artifact"
            }
        }
    }
}
