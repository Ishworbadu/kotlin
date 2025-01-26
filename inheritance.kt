// in kotlin to make class as superclass use open keyword infront of class

open class Father{
    open var name="Daddy"
    open var age=20
}

class Child:Father(){
    override var name="son"//in child and parent class no two variable be with same name
    override var age=20
}

// to create object
fun main()
{
    val papa=Father()
    val beta=Child()
    println(beta.name)
    println(beta.age)
}