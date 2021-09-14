// you can take input from user with help of the 

// readline() method
// Scanner Class


// fun main(){
//     print("enter test:")
//     var input=readLine()
//     print("You entered: $input")
// }


// Another way of taking the user input is using Scanner class 
// for that you need to import the Scanner class java 

// import java.util.Scanner

// fun main(){
//     val number1=Scanner(System.`in`)
//     println("enter an integer: ")
//     var enterNumber1:Int=number1.nextInt()
//     println("You entered : $enterNumber1")

//     val number2=Scanner(System.`in`)
//     println("enter an float:")
//     var enterNumber2:Float=number2.nextFloat()
//     println("You entered:$enterNumber2")

//     val booleanVale=Scanner(System.`in`)
//     println("enter an boolean:")
//     var enterNumber3:Boolean=booleanVale.nextBoolean()
//     println("You entered:$enterNumber3")
// }


// In kotline to take user input by using readLine we use redaLine method
// by using this there is no need for the importing the Scanner class

// readLine()!! take the input as a string and followed by(!1) 
// to ensure that the input value is not null

fun main(){
    println("Enter the no: ")
    val string1=readLine()!!
    //>toInt() function converts the string into Integer in kotlin
    var num1:Int=string1.toInt()
    println("You entered:$num1")

    println("Enter a double value: ")
    val string2=readLine()!!
    var num2:Double=string2.toDouble()
    println("You entered:$num2")
}