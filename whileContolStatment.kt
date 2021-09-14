//while loop in kotlin it check condition every time it enter the condition

fun main(){
    var num=2
    while(num<10){
        println(num)
        num++
    }

    var names=arrayOf("maharashtrs","karanataka","gujrat","kerla","uttar pradesh","goa","kolkata","haryana")
    var ind=0;
    while(ind<names.size){
        print(names[ind]+" ")
        ind++;
    }

    // do-while loops is a control flow statments which executs the block of code
    // at least one's without checking the condition,and then repeatedly excutes the 
    // block of code totally dependes upon a boolean condition at end of the do-while loop

    // while loop only excute the code only when condition is true
    // but d-while loop once's excutes the code then check for the 
    // condition is true or false

    var no=6
    var fact=1
    do{
        fact=fact*no
        no--
    }
    while(no>0)
    println("factorial of 6 is $fact")


    //table of 2 using do-while in kotlin

    var t=2
    var i=1
    do{
        println("2*$i = "+t*i)
        i++
    }
    while(i<11)
}