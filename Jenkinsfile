@Library('jenkins-shared-library')_
pipeline {
    agent any
    
    parameters {
        string(name: 'BUILD_ENV', defaultValue: 'dev', description: 'Build environment')
        booleanParam(name:'test', defaultValue: true, description:'')
        choice(name: 'BUILD_TYPE', choices: ['debug', 'release'], description: 'Build type')
    }
    stages {
        stage('Build') {
            steps {
                building()
            }
        }
        
        stage('Test') {
           testing()
        }
        
        stage('Deploy') {
            steps {
               deploying()
            }
        }
    }
    
    post {
        success {
            echo 'Pipeline completed successfully'
        }
        
        failure {
            echo 'Pipeline failed'
        }
    }
}
