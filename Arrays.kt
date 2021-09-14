// there are two ways to declare the array in kotlin
// val num=arrayOf(1,2,3,4) //implicit type declaretion
// val num=arrayOf<int>(1,2,3,4) //explicit type declaretion


fun main(){
    val arr1=arrayOf(1,2,3,4,5)
    for(i in 0..arr1.size-1){
        print(" "+arr1[i])
    }
    println()
    int ind=0;
    val arr2=arrayOf<Int>(1,2,3,4,5)
    for(i in 0..arr2.size-1){
        print({ind->arr2[i]})
    }


    // Since array is a class in kotlin we scn also use the array constructor to declare array
    // the constructor takes two parameters:
    // 1.The size of the array 
    // 2.A function which accepts the index of a given element and returns initial
    // value of that element

    // Syntax
    // val num=array(3,i->i*1)

    val arr3=Array(5,{i->i*1})
    for(i in 0..arr3.size-1){
        println(arr3[i])
    }

    // set and get method in array since array is class we call the function declarred under array
    

    val v=arrayOf(1,2,3,4,5)
    v.set(0,10)
    println(v.get(0))

    al arrayname=arrayOf(1,2,3,4,5)
    arrv.forEach(ind+1,ptin;;)
}