pipeline {
  agent any
  stages {
    stage ('Reading Jenkins Environment Variables') {
      steps {
        echo "The build number is ${env.BUILD_NUMBER}.";
        echo "The build ID is ${env.BUILD_ID}.";
        echo "The build Tag is ${env.BUILD_TAG}.";
        echo "The Job name is ${env.JOB_NAME}.";
        echo "The Job URL is ${env.JOB_URL}.";
      }
    }
  }
}
