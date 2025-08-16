def call(Sring from,String toto){
success{
        script{
            emailext from: "${from}",
            to: "${toto}",
            subject: "pass",
            body: "pass"
        }
    }
    failure{
        script{
            emailext from: "${from}",
            to: "${toto}",
            subject: "fail",
            body: "fail"
        }
    }
  
}
