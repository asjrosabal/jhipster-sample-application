pipeline {
    agent any

    stages {
          stage('SonarQube') {
                    steps {
                        echo 'SonarQube..'

                        sh 'pwd;'
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
