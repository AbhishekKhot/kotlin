// interfaces are the costum types provided by kotin that cannot be instanited directly 
// these defin a form of behavior that the implementing types have follow with the interfaces
// you can define a set of properties and methods that the concert types
// must follow and implement

// the interface defination in kotlin begins with the interface keyword followed by the 
// name of the interfce followed by the curly braces within which the members of the interface reside
// the difference is that the membres will have no defination of their own these
// defination will be provided by the conforming types

// interface Vehicle(){
//     fun start()
//     fun stop()
// }

// an interface can be implemented by class or object when implementing an interface
// the conforming type must provide the defination fro all its membes to implement an interface 
// the name of the custom type is followed by the colon and the name of the interface which is to implemented

// class Car:Vehicle


// override:
// In any object-oriented programming language, Overriding is a feature that allows a subclass or child class to provide a specific implementation of a
// method that is already provided by one of its super-classes or parent classes.

interface Vehicle{
    fun start()
    fun stop()
}

class Car:Vehicle{
    override fun start(){
        println("Car started")
    }
    override fun stop(){
        println("Car stopped")
    }
}

fun main(){
    val obj=Car()
    obj.start()
    obj.stop()
}

