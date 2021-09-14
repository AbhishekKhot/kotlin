interface Dimensione{
    val length:Double
    val breath:Double
}

interface CalculateParameters:Dimensione{
    fun area()
    fun perimeter()
} 

class XYZ:CalculateParameters{
    override val length:Double
    get()=10.0
    override val breath:Double
    get()=15.0
    override fun area(){
        println("area is ${length*breath}")
    }
    override fun perimeter(){
        println("perimeter is ${2*(length+breath)}")
    }
}

fun main(){
    val obj=XYZ()
    obj.area()
    obj.perimeter()
}