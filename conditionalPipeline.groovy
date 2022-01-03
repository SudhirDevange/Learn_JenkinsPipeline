pipeline {
  agent any
  parameters {
      string(name: 'NAME', description: 'Name value');
      choice(name: 'GENDER', choices:['MALE','FEMALE'], description: 'Gender value');
  }

  stages {
    stage ('INITIALIZATION') {
      steps{
        script {
          def name= "${params.NAME}";
          def gender= "${params.GENDER}";
          echo "Input Name: $name";
          echo "Input Gender: $gender";
            if (gender == 'MALE') {
              echo "Hello Mr. ${params.NAME}";
            }
            else {
              echo "Helloo Mrs. ${params.NAME}";
            }
        }
      }
    }
  }
}
