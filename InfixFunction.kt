// infix function means calling without parathesis and dot

// there are two types of infix function notation in kotlin
// 1.Standard libary infix function notation
// 2.User defined infix function notation

// for user defined infix function
// it must be member function or extension function
// it must accepts a single parameter
// the parameter must not accepts varibale number of arguments and must have value
// it must be marked with infix keyword

class math{
    infix fun square(n:Int):Int{
        val num=n*n
    }
    return num
}

fun main(){
    var a=15
    var b=12
    var c=11
    //normal call
    var result1=(a>b).and(a>c)
    println("Boolean result1 = $result1")
    //infix notation
    var result2=(a>b)and(a>c)
    println("Boolean result1 = $result2")
    var x=8
    var res1=x shr 2
    println("signed shift right by 2:$res1")
    var res2=x.shr(1)
    println("signed shift right by 1:$res2")

    val m=math()
    val res4=m square 3
    println("The square of a is: "+res4)
     
}