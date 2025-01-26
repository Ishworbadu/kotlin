// in kotlin class is defined within paranthesis () like function
class Form(/*constructor starts*/var age:Int, var college:String/*constructor ends */) {

    var name="harry"
    var place="india"
}

// to create object

val details=Form(29,"iit")

fun main()
{
    println("my details are")
    println("my name is " +details.name)
    println("my place is" + details.place)
    println("my age  is" + details.age)
    println("my college is "+ details.college)
    


}