// in kotlin we can override the non-abstract function of the open class
// using overide keyword followed by an abstract in the abstract class in below
// program we will do it

open class LivingThings{
    open fun breathe(){
        println("All living things breathe")
    }
}
abstract class Animal:LivingThings(){
    override abstract fun breathe()
}
class Dog:Animal(){
    override fun breathe(){
        println("Dog can also breathe")
    }
}
fun main(){
    val obj=LivingThings()
    obj.breathe()
    val d=Dog()
    d.breathe()
}