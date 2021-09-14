val sum1={a: Int,b: Int -> a+b}
val sum2:(Int,Int)-> Int = {a,b -> a+b}

fun main(){
    val result1=sum1(2,3)
    val result2=sum2(3,4)
    println("The sum of two numbres is: $result1")
    println("The sum of the numbres is: $result2")

    println(sum1(5,7))
    
    
    
    // val com={println("kotlin anonymous")}
    // //invkoing function method1
    // com()
    // //invoking function method2
    // com.invoke()
}

// Syntax for lambda expression
// val lambda_name:data_type={arguments_list -> code_body}


