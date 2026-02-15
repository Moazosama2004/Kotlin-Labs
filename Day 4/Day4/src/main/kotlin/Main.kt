fun main(args: Array<String>) {
    /*
        Complex
        1. primary and secondary constructor ✅
        2· Operator overloading for +, - ✅
        3. Print function as extension function ✅
        4· Try to use named parameters ,and default parameters when working with
           functions ✅
    */

    val c1 = Complex(img = 2.0, real = 3.0)
    val c2 = Complex(img = 5.0, real = -1.0)
    val cZero = Complex()

    println("=== Individual numbers ===")
    c1.print()
    c2.print()
    cZero.print()

    val sum = c1 + c2
    val diff = c1 - c2

    println("\n=== Results of + and - ===")
    sum.print()
    diff.print()

    c1.print()

    }

