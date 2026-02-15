class Complex (var img : Double, var real : Double ){
    constructor() : this(real = 0.0,img = 0.0)

    operator fun plus(other: Complex) : Complex{
        return Complex(real =  this.real + other.real , img = this.img + other.img )
    }

    operator fun minus(other: Complex) : Complex{
        return Complex(real = this.real - other.real , img =  this.img - other.img)
    }

    fun printString(){}

}

fun Complex.print(){
    when {
        real == 0.0 && img == 0.0 -> println("0")
        real == 0.0 -> {
            when {
                img == 1.0 -> println("i")
                img == -1.0 -> println("-i")
                else -> println("${img}i")
            }
        }
        img == 0.0 -> println(real)
        img == 1.0 -> println("$real+i")
        img == -1.0 -> println("$real-i")
        img > 0.0 -> println("$real+${img}i")
        else -> println("$real${img}i")
    }
}