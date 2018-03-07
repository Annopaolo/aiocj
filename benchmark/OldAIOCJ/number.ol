include "console.iol"

inputPort Number {
  Location: "local"
  Protocol: sodep
  RequestResponse: getNumber(void)(int)
}

execution{ concurrent }

init
{
  global.counter = 4
}

main
{
  getNumber()(res){
    println@Console( global.counter )();
    global.counter++;
    println@Console( global.counter )();
    res = int(global.counter/5) * 10
  }
}
