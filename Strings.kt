// String is the sequence of the character in kotlin
// The string class in kotlin is defined as:

// class String : comparable<String>, charSequence

//to declare string in kotlin we nedd to use double quotes(" ")
// single quotes are not allowed to define string

// There are three ways in which you can access string elements in kotlin
// 1.using index returns the character at specified index 
// 2.using get function return character at specified index passed as argument to function
// 3.iterating over the string using loops to access the character in the string

fun main(){
    // var str1="Hello"
    // println(str1[0])
    // println(str1[1])
    // println(str1[2])
    // println(str1[3])
    // println(str1[4])

    // //this will give the StringouOgBoundException in java similier in kotlin

    // //println(str1[5])

    // //accessing the string elements using loop
    // var str2="showcasing"
    // for(i in str2.indices){
    //     print(str2[i]+ " ")
    // } 
    // println()
    // var no=900
    // println("The value of no is $no")
    // val s="StringTemplate"
    // println("$s is a string which length is ${s.length}")
    // println("${s.subSequence(1,5)}")


    // //Escaped string
    // val str="word \n is \n amazing"
    // println(str)


    // some of the escape characters are-
    // \":for double quote
    // \r:for carriage return
    // \n:for newline
    // \':for single quote
    // \\:for backslash
    // \t:for tab
    // \b:for backspace

    // we can compare two string in two different ways in kotlin
    // Structural Equality
    // Referntial Equality

    // Structural equality is checked through the == operator and inverse != operator
    // this equality return true if both the instance of a type point to the same string
    // and vise varsa for inequality

    var x="java"
    var y="kotlin"
    var z="javascript"
    println(x==y)
    println(x==z)
    println(x===z)
    println(x!=z)
}