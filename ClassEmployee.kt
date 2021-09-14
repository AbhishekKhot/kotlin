class employee{
    var name: String = ""
    var age: Int=0
    var gender: Char='M'
    var salary: Double=0.toDouble()

    fun insert_value(n:String,a:Int,g:Char,s:Double){
        name=n
        age=a
        gender=gender
        salary=s
        println("name if the employee:$name")
        println("age of the employee:$age")
        println("gender:$g")
        println("salary of the employee:$salary")
    }

    fun insert_name(n:String){
        this.name=n;
    }
}

fun main(){
    var obj1=employee()
    var obj2=employee()
    obj1.insert_value("Ram",50,'M',50000.00)
    obj2.insert_name("Alex")
    obj1.insert_name("David")
    println("name of the new employee:${obj2.name}")
    
    println("name of the new employee:${obj1.name}")
}