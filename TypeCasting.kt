// Type conversion or type casting refers to changing the 
// entity of one data type variable into another data type

// as java supports implict type conversion as we can assign the 
// smaller data type value to larger data type value,but kotlin
// does not supports the implict type conversion as the that is can't
// assign the value of larger data type to smaller data type

// in Kotlin helperFunction can be used to explicity convert one data
// type to another data type

// the following helper function can be used to convert one data type
// to another data type

// toByte()
// toShort()
// toInt()
// toLong()
// toFloat()
// toDouble()
// toChar()

// there is no helper function available to convert boolean type

fun main(){
    println("3000 to byte: "+(10.toByte()));
    println("3000 to byte: "+(3000.toByte()))
    println("238746564765 to int: "+(10L.toInt()))
    println("22.54 to Int:"+(22.toInt()))
    println("22 to float:"+(22.toFloat()))
    println("65 to char:"+(65.toChar()))
    println("A to Int:"+('A'.toInt()))
}