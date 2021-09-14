import java.util.Scanner

//nested if-else statments in kotlin

fun main(){
    val reader=Scanner(System.`in`)
    print("enter three numbers: ")

    val num1=reader.nextInt()
    val num2=reader.nextInt()
    val num3=reader.nextInt()
    
    var max=if(num1>num2){
        if(num1>num3){
            "$num1 is the largest number"
        }
        else{
            "$num3 is the largest number"
        }
    }
    else if(num2>num3){
        "$num2 is the larget number"
    }
    else{
        "$num3 is the largest number"
    }
    println(max)
}