package functional

import com.sun.org.apache.xpath.internal.operations.Or

/**
 * Created by Jitendra Alekar on 10/7/2017.
 * Project Name : LearningKotlin
 *
 *
 * Extension Functions : Add extended functionality to a class. Even pre defined classes like String
 */


fun String.exclamate(){
    println("$this!")
}

fun String.toTitleCase(prefix : String) : String{
    return this.split(" ").joinToString { it-> it.capitalize()}
}

fun main(args: Array<String>) {
    "Hi, How are you".exclamate()
    println("Hi How are you".toTitleCase(""))

    val orangeReference : Orange = Orange()
    orangeReference.makeJuice()

    val fruitRef : Fruit = Fruit()
    fruitRef.makeJuice()

    orangeReference.slice()

    val fruitRef2 : Fruit
    fruitRef2 = Orange()
    fruitRef2.makeJuice()//kake base juice

}

open class Fruit{
    fun makeJuice(){
        println("Make base Juice")
    }
}

class Orange : Fruit(){

}

fun Orange.makeJuice(){  // Overshadowed by the inherited method.
    println("Make Orange Juice")
}

fun Orange.slice(){
    println(" Lets slice the oranges ")
}