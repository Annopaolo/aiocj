include "console.iol"
include "file.iol"
include "semaphore_utils.iol"
include "time.iol"



inputPort In {
Location: "socket://localhost:8001"
Protocol: soap
RequestResponse:
  getNthLetter( undefined )( undefined )
}


execution { concurrent }

init
{
  global.letter = "a";
  letter -> global.letter
}

main
{

  [getNthLetter ( reqN )( resN ) {

    resN = letter
   }]

}
