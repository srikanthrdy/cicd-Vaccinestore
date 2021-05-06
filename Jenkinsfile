pipeline {
    agent any
    stages {
        stage('Clean') {
            steps {
               sh "/Users/srikanthgirimaiahgari/Downloads/apache-maven-3.8.1/bin/mvn clean"
             }
         }
        stage('Build') {
            steps {
               sh "/Users/srikanthgirimaiahgari/Downloads/apache-maven-3.8.1/bin/mvn compile"
             } 
         } 
        stage('Test') {
            steps {
               sh "/Users/srikanthgirimaiahgari/Downloads/apache-maven-3.8.1/bin/mvn  test -DskipTests=true"
             }
         } 
        stage('Verify') {
            steps {
               sh "/Users/srikanthgirimaiahgari/Downloads/apache-maven-3.8.1/bin/mvn  verify"
            }
         }
     }
}


