// properties of copy() function is used
// it copies all argument of members defined in primary constructor
// two objects can have same primary parameter values and different class
// body values defined

fun main(){
    data class man(val name:String, val age:Int){
        var height:Int=0
    }
    val man1=man("jeff",55)
    val man2=man1.copy()
    val man3=man1.copy()
    man1.height=100
    man2.height=90
    man3.height=110

    println("${man1} has ${man1.height} cm height")
    println("${man2} has ${man2.height} cm height")
    println("${man3} has ${man3.height} cm height")

}