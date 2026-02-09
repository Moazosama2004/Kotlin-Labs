class Rectangle() : Shape() {
    private var height : Double
    private var width : Double
    init{
        height  = super.dim
        width = super.dim
    }

    constructor(height : Double , width : Double) : this() {
        this.height = height
        this.width = width
    }

    override fun calcArea(): Double {
        return  width * height
    }
}