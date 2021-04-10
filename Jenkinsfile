pipeline {
    agent any

    stages {
          stage('SonarQube') {
                    steps {
                        echo 'SonarQube..'
                    }
                }

        stage('Build') {
            steps {
                echo 'Building..'
            }
        }
        stage('Test') {
            steps {
                echo 'Testing..'
            }
        }
        stage('Deploy') {
            steps {
                echo 'Deploying....'
            }
        }
    }
}
