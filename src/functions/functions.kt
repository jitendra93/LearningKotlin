package functions

/**
 * Created by Jitendra Alekar on 9/9/2017.
 * Project Name : LearningKotlin
 */
fun hello(): Unit {
    println("hellow there")
}
fun bello() : Nothing{
    throw Exception("Get out")
}

fun unlimitedArguments(vararg string: String){
    varargConsumer(*string)
}

fun varargConsumer(vararg string : String){
    for (s  in string){
        print(s)
    }
    println()
}

fun summer (a : Int, b: Int) : Int {
    return a+b
}

fun sum (a :Int ,b : Int) = a+b

fun defaulter( a : Int, b : Int  , c : Int = 23 ) : Int{
    return a + b+ c;
}


fun main(args: Array<String>) {
    var h = when(hello()){
        is Unit -> "Its a Unit"
        is Nothing -> "Its nothing"
        else ->{
            "Whatever"
        }
    }

    print(h)

    val x = defaulter(a=30, b =34, c=34)

    val y = defaulter(3,4)

    unlimitedArguments("A","B")
    unlimitedArguments("A","B","C")
    unlimitedArguments("A","B","C","D")


}