// Objects expression starts with the object keyword

fun main(){
    val helloWorld =object{
        val hello="Hello"
        val world="World"
        //objet expression extended any 
        //so override is required on toString()
        override fun toString()="$hello $world"
    }
    print(helloWorld)
}