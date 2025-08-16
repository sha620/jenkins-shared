def call(){
  sh "trivy fs . -o resutls.json"
}
