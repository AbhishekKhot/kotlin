// data class should fullfill the follwoing requirement to ensure the consistency
// the primary constructor needs to have at least one parameter
// all primary constrctor cannot be abstract, open, sealed or inner
// data class may only implement interfaces

fun main(){
    // data class man(val roll:Int, val name:String, val height:Int)
    // val man1=man(1,"man",165)
    // println(man1.toString());

    data class man(val name:String){
        var height:Int=0
    }

    val man1=man("jeff")
    man1.height=70
    println(man1.toString())
    println(man1.height)
}