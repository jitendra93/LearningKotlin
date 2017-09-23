package nulls

/**
 * Created by Jitendra Alekar on 9/10/2017.
 * Project Name : LearningKotlin
 */
fun main(args: Array<String>) {

    var nullMsg : String?  = null
    var msg :String = "Hi"

//    var letItBeNull : String = nullMsg   // Type mismatch String vs String?
    var letItBeNull : String? = nullMsg

    println(nullMsg?.length)
//    println(letItBeNull!!.length) // Hey compiler! I know what I am doing. just Chi!! : NullPointerException


    val serviceMessageKotlin : String? = getServiceMessageKotlinWay()
    val serviceMessageJava : String? = getServiceMessageJavaWay()

    println(serviceMessageKotlin)
    println(serviceMessageJava)

}

fun getServiceMessageJavaWay(): String? {

    var s : ServiceRepo? = createServiceRepo()
    if(s != null){
        var s1 = s.createService()
        if(s1!=  null){
            return s1.getServed()
        }
    }
    return null
}

fun getServiceMessageKotlinWay(): String? {
    return createServiceRepo()?.createService()?.getServed()
}


class Service{
    fun getServed() : String?{
        return " You just got Served"
    }
}

class ServiceRepo{
    fun createService() : Service?{
        return Service()
    }
}

fun createServiceRepo() : ServiceRepo?{
    return ServiceRepo()
}