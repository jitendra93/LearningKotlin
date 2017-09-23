package classes

/**
 * Created by Jitendra Alekar on 9/9/2017.
 * Project Name : LearningKotlin
 */
data class PersonKotlin(val id : String, var name : String){
    override fun toString(): String {
        return "{\"id\" : \"$id\", \"name\" : \"$name\"}"
    }
}

fun main(args: Array<String>) {
    val person1 = PersonKotlin("1", "Jitendra")
    var person2 = PersonKotlin("2", "Jitu")
    val person3 = person1.copy(id = "3")

    if (person1 != person3){
        println("Different")
    }
    println(person1)
    println(person2)
    println(person3)

}