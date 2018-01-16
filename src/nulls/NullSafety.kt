package nulls

/**
 * Created by Jitendra Alekar on 1/16/2018.
 * Project Name : LearningKotlin
 */
fun main(args: Array<String>){

    val message : String = "Hello World";// By default types cannot be null
    println(message)



 /*   var nullMessage : String? = null;

    println(nullMessage.length)

    if (nullMessage != null){
        println(nullMessage.length)  //square one
    }
*/

    var personJava = PersonJava()
    if(personJava != null){
        if(personJava.name != null){
            println(personJava.name.length)
        }
    }

    println(personJava?.name?.length)

    println(personJava?.name?.length ?: "Default")


}
