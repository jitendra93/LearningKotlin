package basics

/**
 * Created by Jitendra Alekar on 9/9/2017.
 * Project Name : LearningKotlin
 */
fun main(args: Array<String>) {


    loop@ for (j in 100..1 step 1) {
        for (i in 49 downTo 7 step 7) {
            if (j % i == 0) {
                break@loop
            }
        }
    }

    var colors = listOf<String>("Violet", "Indigo", "Blue", "Green", "Yellow", "Orange", "Red")

    var msg = " The colors of rainbow are "
    for (c in colors) {
        print(c)
    }
    println()
    var listOfFruitsAndColors = listOf(Pair("Grapes", "Green"), "Banana" to "yellow")
    for ((fruit, color) in listOfFruitsAndColors) {
        println("The color of $fruit is $color")
    }


}