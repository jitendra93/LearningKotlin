package basics

/**
 * Created by Jitendra Alekar on 9/9/2017.
 * Project Name : LearningKotlin
 */


fun main(args: Array<String>) {
    var myString = "Banana"
    var result = if(myString.startsWith("B")){
            "Fruit"
    }else{
        "Not Fruit"
    }

    var msg = when (result){
        "Fruit" -> "Yay its a fruit, lets eat"
        is String -> "Thats weird. Dont eat that"
        else -> {
            "when must be exhaustive, so we need a default"
        }
    }
    print(msg)
}