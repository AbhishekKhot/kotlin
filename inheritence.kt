open class baseclass{
    val name="kotlin"
    fun A(){
        println("Base class")
    }
}

class derivedClass:baseclass(){
    fun B(){
        println(name) //inherited  name property
        println("derived class")
    }
}

fun main(){
    val derived =derivedClass()
    derived.A()
    derived.B()
}
