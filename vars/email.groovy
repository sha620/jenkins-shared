def call(Sring from,String toto){
        script{
            emailext from: "${from}",
            to: "${toto}",
            subject: "pass",
            body: "pass"
        }
  
}
