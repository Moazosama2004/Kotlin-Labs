fun main() {
    val name = readlnOrNull()?.trim()
    println(
        if (name.isNullOrEmpty()) "Where is your name?"
        else "Hello, $name"
    )
}