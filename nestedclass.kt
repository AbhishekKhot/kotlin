// a class declered within another class then it is called a nested class
// by default nested classes are static we can access the nested class
// property or variables without creating objects just dot(.) notation

// outer class declaration
class outerClass {
	var str = "Outer class"
	// nested class declaration
	class nestedClass {
		val firstName = "Praveen"
		val lastName = "Ruhil"
	}
}
fun main(args: Array<String>) {
	// accessing member of Nested class
	print(outerClass.nestedClass().firstName)
	print(" ")
	println(outerClass.nestedClass().lastName)
}
