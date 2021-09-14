// we can't create an object for abstrct class
// all the variables and members functions of an abstract class
// are by default non-abstract So,if we want to override these members in the child class
// use open keyword
// if we declare a member function as abstract then we does not need to annotate
// keyword beacuse these are open by default
// an abstract member function dosen't have a body and it must be implemented in the derived class

abstract class Employee(val name:String, val experience:Int){
    abstract var salary:Double
    abstract fun dateOfBirth(date:String)
    fun employeeDetails(){
        println("Name of the employee:$name")
        println("Experience in years:$experience")
        println("Annual salary:$salary")
    }
}

class Engineer(name:String,experience:Int):Employee(name,experience){
    override var salary=50000.00
    override fun dateOfBirth(date:String){
        println("Date of birth is:$date")
    }
}

fun main(){
    val eng=Engineer("kotlin",2)
    eng.employeeDetails()
    eng.dateOfBirth("02 December 1994")
}
