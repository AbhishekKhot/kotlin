// there are different types of if-else expression in kotlin
// if expression
// if-else expression
// if-else-if ladder expression
// nested if expression
import java.util.Scanner

fun main(){
    var x=300;
    //if statment
    if(x>100){
        println("Yes,number is positive")
    }
    //if else atatments
    var a=5
    var b=10
    if(a>b){
        println("number a is larger than b")
    }
    else{
        println("number b is larger than a")
    }

    var aa=100
    var bb=500

    //if-else statments
    var max=if(a>b){
        println("maximum no is: ")
        aa
    }
    else{
        println("maximum no is: ")
        bb
    }
    println(max)

    //if-else if-else statments
    val reader=Scanner(System.`in`)
    println("enter the number: ")
    var nums=reader.nextInt()
    var result=if(nums>0){
        println("$nums is positive number")
    }
    else if(nums<0){
        println("$nums is negative number")
    }
    else{
        "$nums is equals to zero"
    }
    println(result)
}