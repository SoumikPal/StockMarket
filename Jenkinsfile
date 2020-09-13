pipeline {
    agent any
        tools{
            maven 'maven3'
        }
    stages {
        stage('Clone the project'){
	        steps{
	            git 'https://github.com/SoumikPal/StockMarket.git'
	            
	            
	        }
        }
        stage('Build') { 
            steps {
                dir('login')
	            {
	                sh 'mvn  clean compile'
	               
	            } 
            }
        }
    }
}
