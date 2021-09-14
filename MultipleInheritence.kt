// since classes in kotlin follow the concept of single inheritece
// that is each can inherite only class, however in case of interface 
// a class can implemented more than one interface provided that it
// provides a defination for all the menbres of the the interface

interface Interfaceproperties1{
    val a:Int
    val b:String
    get()="Hello"
}

interface Interfaceproperties2{
    fun description()
}

class MultipleInterface:InterfaceProperties1,Interfaceproperties2{
    override val a:Int
    get()=50

    override fun description(){
        println("Multiple Interfaces implemented")
    }
}

fun main(){
    val obj=MultipleInterface()
    obj.description()
}