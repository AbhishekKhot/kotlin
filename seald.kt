// compile time restriction that is the functionationally
//provided by the sealded class

sealed class Demo{
    class A:Demo(){
        fun display(){
            println("subclass a of sealed class Demo")
        }
    }
    class B:Demo(){
        fun display(){
            println("subclass B of sealed class Demo")
        }
    }
}

fun main(){
    val obj=Demo.B()
    obj.display()

    val obj1=Demo.A()
    obj1.display()
}