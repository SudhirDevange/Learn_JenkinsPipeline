pipeline {
  agent any
  environment {
    DISABLE_AUTH= 'true';
  }
  stages {
    stage ("Local Environment Variables") {
      environment {
        ENABLE_AUTH= 'false';
          }

          steps {
            echo env.DISABLE_AUTH;
            echo env.ENABLE_AUTH;
          }

    }
  }
}
