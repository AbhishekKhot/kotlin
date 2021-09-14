// interface are also contains properties however since the interface
// dosen't have a safe state that is they can't be instained, so there are no
// backing fields to their values hence fields in the interface are either left 
// abstract or provided implementation


interface InterfaceProperties{
    val a:Int
    val b:String
    get()="Hello"
}

class PropertiesDemo:InterfaceProperties{
    override val a:Int=5000
    override val b:String="property Overridden"
}

fun main(){
    val x=PropertiesDemo()
    println(x.a)
    println(x.b)
}