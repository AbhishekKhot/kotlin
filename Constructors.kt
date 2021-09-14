// the class decleration consist of the name class header parameter
// the primary constructor and some other things and the class body by curly braces
// both the header and the body are optional if the classes have no bpdy
// the curly breces can be ommited

// if the constructor does not have any annotations or visibility modifires the
// constructor keyword can be ommitted

// class Person(firstname: String){
    
//     // the primary constructor can not constain any code
//     // initialization code can be placed in initializer bolcks
//     // predefined with the init keyword

//     // during the initialization of an instance the initializer blocks are excuted in the
//     // same order as they appear in the class body, interleved with the property initializers
// }

// primary constructor parameter can be used in the initalizer blocksthsy can 
// also be used in perperty initialzer declred in the class body

class InitOrderDemo(name:String){
    val firstProperty="first property:$name".also(::println)
    init{
        println("first initializer block that prints ${name}")
    }

    val secondProperty="Second prperty:${name.length}.also(::println)"

    init{
        println("second initializer block that prints ${name.length}")
    }
}

fun main(){
    InitOrderDemo("hello")
}