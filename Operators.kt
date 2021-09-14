// Operators
// similar to every other language kotlin suppotrs following operators
// Arithmatic operator(+,-,*,/,%)
// Relation operator(=,<=,>=)
// Assignment operator(=,!=)
// Unary operator(increment++,decrement--)
// Bitwise operator

fun Arithmatic_operators(a:Int,b:Int):Unit{
    println("a-b="+(a-b))
    println("a*b="+(a.times(b)))
    println("a/b="+(a/b))
    println("a%b="+(a.rem(b)))
}

fun Bitwise_operators(a:Int,b:Int):Unit{
    print("a signed shift left by 1 bit: "+a.shl(1))
    println("a signed shift right by 2 bit:"+a.shr(2))
    println("a bitwise and b is: "+a.and(b))
    println("a bitwise or b is: "+a.or(b))
    println("a bitwise xor b is:"+a.xor(b))
    println("a bitwise inverse is:"+a.inv())
    println("b bitwise inverse is:"+b.inv())
}

fun Logical_operators(a:Int,b:Int,c:Int):Unit{
    var result=false
    if(a>b && a>c)println(a)
    if(a<b || a<c)println(b)
    if(result.not()){
        println("logical operators")
    }
}

fun Unary_operators(x:Int):Unit{
    var a=x
    println("first print then increment: "+ a++)
    println("first increment then print: "+ ++a)
    println("first print then decrement: "+ a--)
    println("first decrement then print: "+ --a)
}


fun Assignment_operators(x:Int,y:Int):Unit{
    var a=x
    var b=y
    a+=b
    println(a)
    a-=b
    println(a)
    a*=b
    println(a)
    a/=b
    println(a)
    a%=b
    println(a)
}

fun Relational_Operators(a:Int,b:Int):Unit{
    println("a>b= "+(a>b))
    println("a<b= "+(a.compareTo(b)<0))
    println("a>=b= "+(a>=b))
    println("a<=b= "+(a.compareTo(b)<=0))
    println("a==b= "+(a==b))
    println("a !=b "+(!(a?.equals(b)?:(b==null))))
}


fun main(){
    Arithmatic_operators(2,5)
    println("\n")
    Assignment_operators(2,5)
    println("\n")
    Bitwise_operators(10,20)
    println("\n")
    Relational_Operators(100,200)
    println("\n")
    Logical_operators(900,888,888)
    println("\n")
    Unary_operators(1)
}