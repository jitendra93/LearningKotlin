package inheritance

/**
 * Created by Jitendra Alekar on 9/10/2017.
 * Project Name : LearningKotlin
 */


interface Repo<T>{
    fun getById(id : String) : T

    fun getAll() : List<T>
}

class RepoImpl<T> : Repo<T>{
    override fun getById(id: String): T {
        TODO("not implemented") //To change body of created functions use File | Settings | File Templates.
    }

    override fun getAll(): List<T> {
        TODO("not implemented") //To change body of created functions use File | Settings | File Templates.
    }
}
interface IRep<T>{
    fun <T> getSome() : T
    fun <R> getSomethingElse() : R
}
fun main(args: Array<String>) {
    val a = RepoImpl<Customer>()
    val b = RepoImpl<Person>()
}