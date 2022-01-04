pipeline {
	agent any
	stages {
		stage ('Build Step') {
				steps {
				 echo "Build Step is running.";
				}
		}

		stage ('Test Step') {
			steps {
				echo "Test step is running.";

			}
		}

		stage ('QA Deploy') {
			steps {
				echo "QA Deploy";
			}
		}

		stage ('Prod Deploy') {
			steps {
				echo 'Prod Deploy';
			}
		}
	}
}
