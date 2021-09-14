// an abstract member of an abstract class can be overriden in all the derived
// class in the program we overrides the cal in three derived class of calculator

abstract class Calculator{
    abstract fun cal(x:Int, y:Int):Int
}

class Add:Calculator(){
    override fun cal(x:Int,y:Int):Int{
        return x+y
    }
}

class Sub:Calculator(){
    override fun cal(x:Int,y:Int):Int{
        return x-y
    }
}

class Mul:Calculator(){
    override fun cal(x:Int,y:Int):Int{
        return x*y
    }
}

fun main(){
    var add:Calculator=Add()
    var x1=add.cal(4,6)
    var mul:Calculator=Mul()
    var x2=mul.cal(4,6)
    var sub:Calculator=Sub()
    var x3=sub.cal(4,6)
    println("Addition of the two numbres is $x1")
    println("substraction of the two numbres is $x2")
    println("multiplication of the two numbres is $x3")
}