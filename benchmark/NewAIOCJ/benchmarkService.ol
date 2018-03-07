include "console.iol"
include "file.iol"
include "time.iol"



inputPort In {
Location: "socket://localhost:8000"
Protocol: soap
RequestResponse:
  start( undefined )( undefined ),
  getN( undefined )( undefined ),
  end( undefined )( undefined ),
  close( undefined )( undefined )
}

outputPort Number {
  Location: "local"
  Protocol: sodep
  RequestResponse: getNumber(void)(int)
}

embedded {
  Jolie: "number.ol" in Number
}


execution { concurrent }

init
{
  file.filename = "log.txt";
  file.content = "";
  file.append = 1;
  writeFile@File(file)()
}

main
{
  [getN ( reqN )( resN ) {
    getNumber@Number()(global.n);
    resN = global.n
    // resN = 1
  } ]

  [ start ( reqStart )( resStart ) { //segna tempo di start della sessione di benchmark
    getCurrentTimeMillis@Time()(global.start);
    //getTimestampFromString@Time(req)(ts);
    println@Console(global.start)();
    resStart = global.n
    // resStart = 90;
    // getCurrentTimeMillis@Time()(a);
    // println@Console("start: " + a)()
  } ]

  [end ( reqEnd )( resEnd ) {
    getCurrentTimeMillis@Time()(global.end);
    w.filename = file.filename;
    synchronized (diffToken) {
      diff = global.end - global.start
    };
    wClean.filename = "clean_log" + global.n + ".txt";
    wClean.append = 1;
    w.append = 1;
    { wClean.content = diff + "\n" | w.content =  "Execution Time for n = " + global.n + ": " + diff + " ms \n"} ;
    { writeFile@File(w)() | writeFile@File(wClean)()};
    println@Console( w.content )();
    resEnd = 1
    //  resEnd = 1;
    // getCurrentTimeMillis@Time()(b);
    // println@Console("end: " + b)()
    } ]

    [close ( reqC )( resC ){
      resC = 0  ;
      w.filename = file.filename;
      w.content = "--------- Test Session Ended ---------\n";
      w.append = 1;
      writeFile@File(w)();
      println@Console( w.content )()
    }]

}
