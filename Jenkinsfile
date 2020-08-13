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
                  image: maven:3.6.3-jdk-11
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
                    sh "java -v"
                    //sh "./mvnw package -DskipTests"
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