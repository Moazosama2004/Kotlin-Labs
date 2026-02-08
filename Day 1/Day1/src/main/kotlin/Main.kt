fun main(args: Array<String>) {
    println("Hello World!")

    // Try adding program arguments via Run/Debug configuration.
    // Learn more about running applications: https://www.jetbrains.com/help/idea/running-applications.html.
    println("Program arguments: ${args.joinToString()}")

     var x = 1_000
    println(x)
    println("moaz $x")

    println(if (false) true else false)

//    var a = if(true){
//        println(10)
//        x
//    }
    when(x) {
        1000 -> println("HI")
        else -> println("else")
    }

    while (true) {
        println(" i")
    }

    var names = arrayOf("moaz" , "osama")
//
//    for (i in  ) {
//       print("$i ")
//    }
}

fun doSomeThing(){

}