class Triangle() : Shape() {

    private var h : Double
    private var b : Double
    init {
        h = super.dim
        b = super.dim
    }

    constructor(b : Double, h : Double) : this() {
        this.b = b;
        this.h = h
    }

    override fun calcArea(): Double {
        return 0.5 * h * b
    }
}