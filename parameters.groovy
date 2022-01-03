pipeline {
  agent any
  parameters {
    string(name: 'BuildPipeline', description: 'Pipeline for repository.');
    text(name: 'DESC', description: 'Pipleline description');
    booleanParam(name: 'Skip_Test', description: 'Do you want to skp the test stage for this Pipleline.');
    choice(name: 'Branch', choices:['Master','Dev'], description: 'Choose branch.');
    password(name: 'FrontierPassword', description: 'Frontier server password');
  }

  stages {
    stage ('Printing parameters') {
      steps {
        echo "Hello: ${params.BuildPipeline}";
        echo "Job Description: ${params.DESC}";
        echo "Skipping tunning Test case: ${params.Skip_Test}";
        echo "Branch Choice: ${params.Branch}";
        echo "Frontier Password: ${FrontierPassword}";
      }
    }
  }

}
