class Circle() : Shape() {

    private val PI = 3.14
    private var r: Double
    init {
        r = super.dim
    }
    constructor(r : Double) : this(){
        this.r = r
    }

    override fun calcArea(): Double {
        return PI * r * r
    }
}