pipeline {
    agent any
     tools {
        maven 'Maven 3.8.1'
    }
    stages {
        stage('Clean') {
            steps {
               sh "mvn clean"
             }
         }
        stage('Build') {
            steps {
               sh "mvn compile"
             } 
         } 
        stage('Test') {
            steps {
               sh "mvn test"
             }
         } 
        stage('Verify') {
            steps {
               sh "mvn verify"
            }
         }
     }
}


