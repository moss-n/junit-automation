pipeline {

    agent any
    stages {

        stage('Checkout Codebase') {
            steps{
                checkout scm: [$class: 'GitSCM',userRemoteConfigs: [[credentialsId: 'github-ssh-key', url: 'git@github.com:mnorm88/junit-automation.git']]]
            }
        }

        stage('Build') {
            steps {
                sh 'mkdir lib ; cd lib/'
                sh 'wget https://repo1.maven.org/maven2/org/junit/platform/junit-platform-console-standalone/1.7.0/junit-platform-console-standalone-1.7.0-all.jar'
                sh 'cd ../src/'
                sh 'javac -cp "../lib/junit-platform-console-standalone-1.7.0-all.jar" CarTest.java Car.java App.java'
            }
        }

        stage('Test'){
            steps{
                sh 'java -jar ../lib/junit-platform-console-standalone-1.7.0-all.jar --select-class CarTest --reports-dir="reports"'
            }
        }

        stage('Deploy'){
            steps{
                sh 'java App.java' 
            }
        }
    }
}