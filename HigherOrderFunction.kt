var lambda={println("hello")}

fun add(a:Int,b:Int):Int{
    var sum=a+b;
    return sum;
}

fun test(lmbd: () -> Unit){
    lmbd()
}

fun higher_func(add:(Int,Int)->Int){
    var ans=add(10,20)
    println("the sum of a and b is: $ans")
}
fun main(){
    test(lambda)
    higher_func(::add)

}
