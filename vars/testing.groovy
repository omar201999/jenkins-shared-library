#!/usr/bin/env groovy
def call() {
    when {
          expression{
                    params.test== true 
          }
      }
      steps {
        echo "Running tests"
    }
}
