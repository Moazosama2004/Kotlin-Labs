fun main() {

    print("Enter Number 1: ")
    val n1 : Int = try {
        readLine()?.toInt() ?: 0
    } catch (e: Exception) {
        0
    }

    print("Enter Operator from (+ - * /): ")
    val operator = readLine()?.trim() ?: "+"

    print("Enter Number 2: ")
    val n2 : Int = try {
        readLine()?.toInt() ?: 0
    } catch (e: Exception) {
        0
    }

    print("The Result: ")
    when (operator) {
        "+" -> println("$n1 + $n2 = ${n1 + n2}")
        "-" -> println("$n1 - $n2 = ${n1 - n2}")
        "*" -> println("$n1 * $n2 = ${n1 * n2}")
        "/" -> if (n2 == 0) println("Cannot divide by zero") else println("$n1 / $n2 = ${n1 / n2}")
        else -> println("Please enter a valid operator")
    }
}
