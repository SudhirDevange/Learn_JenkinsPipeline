pipeline {
  agent any
    stages {
      stage ('Capturing Batch Command in Local Environment variable.') {
        steps {
          script {
            env.HOSTNAME= bat(script:'hostname', returnStdout:true).trim();
            echo "${env:HOSTNAME};
          }
        }
      }
    }
}
