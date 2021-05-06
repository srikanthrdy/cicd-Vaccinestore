pipeline {
    agent any
     tools {
        maven 'MAVEN_HOME'
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


