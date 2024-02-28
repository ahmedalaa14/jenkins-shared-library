#!/usr/bin/env groovy

def call() {
    echo "building the docker image..."
    withCredentials([usernamePassword(credentialsId: 'DockerHub-Credentail', passwordVariable: 'PASS', usernameVariable: 'USER')]) {
        sh 'docker build -t ahmedalaa14/demo-app:1.0.'
        sh "echo $PASS | docker login -u $USER --password-stdin"
        sh 'docker push ahmedalaa14/demo-app:1.0'

    }

}