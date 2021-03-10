pipeline {
    agent any

    triggers {
        pollSCM('* * * * 1-5')
    }

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
                sh "./gradlew lib:jar"
                archiveArtifacts artifacts: '**/build/**/*.jar'
            }
        }
    }
    
    post {
        always {
            junit '**/test-results/**/*.xml'
        }
    }
}
