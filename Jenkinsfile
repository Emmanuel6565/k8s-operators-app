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
        stage("build and package app") {
            steps {
                container('maven') {
                    sh "mvn clean compile"
                    sh "mvn package -DskipTests"
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