package inheritance

/**
 * Created by Jitendra Alekar on 9/10/2017.
 * Project Name : LearningKotlin
 */

interface Shape{
    fun shape() :String{
        return "Amorphous"
    }
    fun sameName(){
        println("I am a ${this.javaClass.simpleName}")
    }
}

interface Color{
    fun color() : String{
        return "White"
    }
    fun sameName(){
        println("I am a ${this.javaClass.simpleName}")
    }
}

interface Round : Shape{
    override fun shape(): String {
        return "Round"
    }
}

class Fruit1 : Shape , Color{
    override fun sameName() {
        super<Shape>.sameName()
    }

}
class Fruit2 : Shape , Color{
    override fun sameName() {
        println("Fruit 2 ")
        super<Shape>.sameName()
        super<Color>.sameName()
    }

}
class Fruit3 : Shape , Color{
    override fun sameName() {
        super<Shape>.sameName()
    }
}

fun main(args: Array<String>) {
    val a = Fruit1()
    val a2 = Fruit2()
    val a3 = Fruit3()

    a.sameName()
    a2.sameName()
    a3.sameName()
}