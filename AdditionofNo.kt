//in this we demonstrate how to add tow no in kotlin

//this is the sum function that sum up the givnn two no
fun sum(a: Int, b: Int): Int{
    return a+b;
}

//another form wrriting the same sum function is

fun sum2(a:Int, b:Int) = a+b

//function that return no meanongful values

fun sum3(a: Int, b: Int) : Unit{
    println("sum of the a and b is:{a+b}")
}

//main function
fun main(){
    println("sum of the no a and b is: ")
    println(sum(100,200))
    println("sum of the a and b is another way:")
    println(sum2(100,200))
    println(sum3(100,200))

    //decleration of the different varible in kotlin
    val a:Int=1
    val b=2
    val c:Int
    c=3
    println("a=$a, b=$b, c=$c")

    // only local variables are defined using keyword val and they are defined only once
    // redefination of the variable that are defined using val keyword in kotlin is not paossiable

    // varables that can be reassigned uses the var keyword

    var x=5
    println("value of the x before the modification is:$x")
    x+=1
    println("value of the x after the modification is:$x")
}