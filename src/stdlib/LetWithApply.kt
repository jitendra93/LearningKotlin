package stdlib

import java.io.File

/**
 * Created by Jitendra Alekar on 10/8/2017.
 * Project Name : LearningKotlin
 */
fun main(args: Array<String>) {
    val file = File("input.txt")

    with(file) {
        println(name)
        println(readText())

        writeText(Math.random().toString())
    }


    var name : String? = "To "


    println(name?.let { it.length })

//    println(name)
}