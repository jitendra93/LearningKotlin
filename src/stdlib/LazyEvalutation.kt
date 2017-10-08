package stdlib

/**
 * Created by Jitendra Alekar on 10/8/2017.
 * Project Name : LearningKotlin
 */


fun main(args: Array<String>) {
    val nums = 1..100000000

    nums.asSequence().filter { it< 30 }.map { Pair("The number is ",it) }.forEach { println(it) }

   println( nums.asSequence().take(30).sum())

    println(generateSequence(1) { it -> it +1}.take(30).sum())

    val x : Int by lazy {  10 }


}