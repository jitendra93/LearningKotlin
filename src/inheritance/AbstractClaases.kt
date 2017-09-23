package inheritance

/**
 * Created by Jitendra Alekar on 9/10/2017.
 * Project Name : LearningKotlin
 */
abstract class Idea {
    var isNew = true;
    abstract fun summary() : String
}

class Implementation : Idea() {
    override fun summary() : String{
       return "What an idea "
    }

}

fun main(args: Array<String>) {
    val i = Implementation()
    println(i.isNew)
    println(i.summary())

}