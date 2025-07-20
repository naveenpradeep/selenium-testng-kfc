pipeline {
    agent any

    tools {
        maven 'MAVEN3.9'
        jdk 'JDK17'
    }

    stages {
        stage('Checkout') {
            steps {
                git url: 'https://github.com/naveenpradeep/selenium-testng-kfc.git', branch: 'main'
            }
        }

        stage('Build & Test') {
            steps {
                bat 'mvn clean test'
            }
        }

        stage('Archive Reports') {
            steps {
                junit '**/target/surefire-reports/*.xml'
                archiveArtifacts artifacts: '**/target/*.jar', fingerprint: true
            }
        }
    }

    post {
        always {
            echo 'Cleaning up...'
            cleanWs()
        }
        success {
            echo 'Build succeeded!'
        }
        failure {
            echo 'Build failed!'
        }
    }
}
