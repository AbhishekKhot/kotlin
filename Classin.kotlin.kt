// to define a class use the class keyword

//class Shape
// this is how we define class in kotlin it is class of name Shape

// properties of class can be listed in body/decleration of the class

class Rectangle(var height: Double, var length:Double){
    //this is make the class inheritable
    
    open class Shape
    
    // the default constructor with parameter listed in class
    // decleration are available automatically

    var perimeter = (height*length)*2

    // inheritence between classes is defined by colon(:)
    // classes are final by default to make inheritable mark it as open
    // using the keyword open


}

fun main(){
    val rectangle = Rectangle(5.0,9.0)
    println("The perimeter of the rectangle is: ${rectangle.perimeter}") 
}