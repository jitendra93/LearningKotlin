package stdlib

/**
 * Created by Jitendra Alekar on 10/8/2017.
 * Project Name : LearningKotlin
 */
fun main(args: Array<String>) {
    val immutableListOfCities = listOf<String>("Madrid","Mumbai")
//        immutableListOfCities.add add method not available
    println("immutableListOfCities is of type ${immutableListOfCities.javaClass}")

    val mutableListOfCities = mutableListOf<String>("Madrid")
    mutableListOfCities.add("Mumbai")
    println("mutableListOfCities is of type ${mutableListOfCities.javaClass}")

    val emptyList = emptyList<String>()
    println("emptyList is of type ${emptyList.javaClass}")


    val arrayOfInts = intArrayOf(1,2,3)


    val hashSetsOf = hashSetOf(mutableListOfCities)

}