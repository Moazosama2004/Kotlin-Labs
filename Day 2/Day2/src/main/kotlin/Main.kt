
fun main(args: Array<String>) {
    // Circle
    var c1 = Circle()
    println("Circle() : ${c1.calcArea()}")
    var c2 = Circle(5.0)
    println("Circle(5) : ${c2.calcArea()}") // 3.14 * 5 * 5

    println()

    // Triangle
    var t1 = Triangle()
    println("Triangle() : ${t1.calcArea()}")
    var t2 = Triangle(5.0,10.0)
    println("Triangle(5,10) : ${t2.calcArea()}") // 5 * 10 * 0.5 = 25

    println()

    // Rectangle
    var r1 = Rectangle()
    println("Rectangle() : ${r1.calcArea()}")
    var r2 = Rectangle(50.0,10.0)
    println("Rectangle(5,10) : ${r2.calcArea()}") // 50 * 10  = 500


    println()

    // Picture (Sum Of Areas)
    var p = Picture()
    println("Sum Of Areas : ${p.sumAreas(c2,t2,r2)}")

}