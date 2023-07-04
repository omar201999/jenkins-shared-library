@Library('sprints_pipeline')_
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
                echo "Building project in ${params.BUILD_ENV} environment"
           
            }
        }
        
        stage('Test') {
           when {
                expression{
                    params.test== true 
                }
            }
            steps {
                echo "Running tests"
            }
        }
        
        stage('Deploy') {
            steps {
                echo "Deploying to ${params.BUILD_ENV}"
                echo "this build number $BUILD_NUMBER"
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
