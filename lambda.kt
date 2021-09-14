fun main(){
    println("Main function starts")
    inlinedFunc({println("lambda expression 1")return},{println("Lambda expression 2")})
    //inlined expression allow return statments in lambda expression
    // so does not gives compile time errorr
    println("main function ends")   
}

inline fun inlinedFunc(lmbd1 : () -> Unit, lmbd2 : () -> Unit){
    lmbd1()
    lmbd2()
}



