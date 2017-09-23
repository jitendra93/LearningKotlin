package tidbits

/**
 * Created by Jitendra Alekar on 9/10/2017.
 * Project Name : LearningKotlin
 */
class NotANumberException(message : String) : Throwable(message){

}


fun checkIsANumber(obj : Any){
    when(obj) {
        !is Int, Long, Float, Double -> throw NotANumberException("Its not a number.")
    }
}

fun main(args: Array<String>) {
    val result =try{
        checkIsANumber("A")
        "TRY"
    }   catch (e : NotANumberException){
        println(e.message)
        "CATCH"
    }finally {
        println("Phew! Finnaly")
        "FINALLY"
    }
    println(result)
}