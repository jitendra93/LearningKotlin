package interop

/**
 * Created by Jitendra Alekar on 10/8/2017.
 * Project Name : LearningKotlin
 */


fun main(args: Array<String>) {

    val cj :CustomerJava = CustomerJava()

    cj.id = 1
    cj.name = "Jitendra"

    Runnable {
        val unit =  cj.prettyPrint()

        println("Is unit a Unit ->  ${unit is Unit}")
    }.run()

    val neverNull : String  = cj.neverNull()

    val sometimesNull : String?  = cj.sometimesNull()


    println(sometimesNull)

}


class CustomerDB : CustomerRepository{
    override fun getById(id: Int): CustomerJava {
        TODO("not implemented") //To change body of created functions use File | Settings | File Templates.
    }

    override fun getAll(): MutableList<CustomerJava> {
        TODO("not implemented") //To change body of created functions use File | Settings | File Templates.
    }

}