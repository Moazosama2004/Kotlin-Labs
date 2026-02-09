fun main() {

    val rows = 4

    repeat(rows) {
        val currentRow = it + 1

        repeat(currentRow) {
            print("*")
        }

        print("    ")

        repeat(rows - currentRow) {
            print("  ")
        }

        repeat(currentRow) {
            print(" *")
        }

        println()
    }
}
