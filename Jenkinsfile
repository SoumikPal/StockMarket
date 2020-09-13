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
        stage('Building FIrst MicroService') { 
            steps {
                dir('login')
	            {
	                sh 'mvn  clean compile'
	               
	            } 
            }
        }
        stage('Building 2nd MicroService') { 
            steps {
                dir('stockexchange')
	            {
	                sh 'mvn  clean compile'
	               
	            } 
            }
        }
        stage('Building 3rd MicroService') { 
            steps {
                dir('stockmarket')
	            {
	                sh 'mvn  clean compile'
	               
	            } 
            }
        }
    }
}
