pipeline {
    agent {
        kubernetes {
            yaml """
            apiVersion: v1
            kind: Pod
            metadata:
              name: Jenkins-pod
            spec:
              containers:
                - name: maven
                  image: maven:alpine
                  command:
                  - cat
                  tty: true
                 
            """
        }
    }
    stages {
        stage("Checkout SCM") {
            checkout SCM
        }
        stage("build and package app") {
            steps {
                container('maven') {
                    mvn clean compile
                    mvn package -DskipTests
                }
            }
        }

        stage("build docker image") {
            steps {
               echo "hello" 
            }
        }
    }

}