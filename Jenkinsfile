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
                echo "I'm testing, my lord"
            }
        }

        stage('Deploy') {
            steps {
                echo "Here's is your artifact"
            }
        }
    }
}
