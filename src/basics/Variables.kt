package basics

import kotlin.reflect.jvm.internal.impl.load.kotlin.JvmType

/**
 * Created by Jitendra Alekar on 9/9/2017.
 * Project Name : LearningKotlin
 */
fun main(args: Array<String>) {

    //Handling variables

    // declaration with data type
    var firstName : String = "Jitendra"
    var lastName = "Alekar"

    var hungry = "always" // can leave out type declaration
//        hungry = true; //cant change data type
    hungry = "duh!"

    // immutable variables
    val age = 24
    // age = 25 well, val wont let me age ;P


    // exploring data types : all primitives are Objects
//    Primitives.kt
    var myInt  = 10
    val myLong = myInt.toLong()

    val long2 = 10L
    val float1 = 23f
    val hexaNumber = 0x0F
    val myBinary = 0xb01


    val msg = "Hi, my name is $firstName $lastName"

    val msg2 = " The number of letters in $firstName is ${firstName.length}"

}