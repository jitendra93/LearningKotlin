package classes

import java.util.*

/**
 * Created by Jitendra Alekar on 9/9/2017.
 * Project Name : LearningKotlin
 */

class Fruit {
    var id : Int = 0;
    var color : String =""
}

class Movie( name : String, year : Int = 2000){

}
class Phone (var model : String){
    init {
        model = model.toUpperCase()
    }
}
class Decorator(val yearOfBirth: Int) {
    val age : Int
        get() = (Calendar.getInstance().get(Calendar.YEAR) - yearOfBirth)

    var id : String = ""
    set(value) {
        if(!value.startsWith("_")){
            throw IllegalArgumentException("Dont start with _")
        }
        field = value
    }

    fun ageAsString() : String{
        return " Age is $age"
    }
}

fun main(args: Array<String>) {
    val fruit = Fruit()
    val movie = Movie("Lawrence Of Arabia", 1962)
    val phone = Phone("Asus")
    val age = Decorator(1993).ageAsString()
    println(age)
}