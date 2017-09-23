package classes

import java.util.*

/**
 * Created by Jitendra Alekar on 9/9/2017.
 * Project Name : LearningKotlin
 */
object Global {
    val PI = 3.14
}

fun main(args: Array<String>) {
    println(Global.PI)


    val localObject = object {
        val PI = 22f/7
    }
    println(localObject.PI)
}