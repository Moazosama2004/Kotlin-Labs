fun main(args:Array<String>){
    print("Enter your first name : ")
    val firstName : String = readLine()?.trim() ?: ""
    print("Enter your last name : ")
    val lastName : String = readLine()?.trim() ?: ""

    println("$firstName $lastName")

}