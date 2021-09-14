// there are two types of functions
// 1.user defined function
// 2.build in function

//user defined function
fun student(name:String,Grade:Char,roll_no:Int){
    println("Name of the student is:$name")
    println("Grade of the student is:$Grade")
    println("roll no of the student is:$roll_no")
}

fun main(){
    val name="java"
    val roll_no=27
    val Grade='A'
    student(name,Grade,roll_no)
    student("kotlin",'O',1)

    //here sum is the build in function that return the sum of the 
    //elements in a particular range in array
    var sum=arrayOf(1,2,3,4,5,6,7,8,9,10).sum()
    println("the sum of all the elements of an array is: $sum")

    // list of standard function and their use
    // 1.rem()-gives remainder of a/b
    // 2.sqrt()-gives square root of the no
    // 3.toInt()-to compare no to integer value
    // 4.readLine()-used for standard input
    // 5.comapreTo()-to compare two numbers and return boolean value
    
    // general way to declare a function
    // fun fun_name(a:data_type,b:data_type):return_type{
    //     //code
    //     return
    // }

    
}