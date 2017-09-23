package inheritance

import classes.PersonJava as Alias

/**
 * Created by Jitendra Alekar on 9/10/2017.
 * Project Name : LearningKotlin
 */


// The default access modifier is public.
open class Person() : Alias() {
    open fun validate(){

    }

     fun boss(){

    }
}

// By default the classes are closed,  everything is final

open class Customer  : Person{
    override fun validate(){

    }
    constructor() : super(){

    }
}



data class CustomerEntity(var a : String, var b : String) : Person(){
    constructor( a : String) : this(a,"D")
}

fun main(args: Array<String>) {
    var cust = CustomerEntity("A","B")
    var cust2 = CustomerEntity("A")
}