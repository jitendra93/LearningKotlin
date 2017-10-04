package functional

/**
 * Created by Jitendra Alekar on 9/24/2017.
 * Project Name : LearningKotlin
 */
fun outsideFunc(){

    val number = 20

    println(polynomialOperation( 25, { x -> x*number  }, { x -> x*number*number}))


    for (n in 1..10 step  3){
        polynomialOperation(56,
                {
                    x->
                    println(x*n)
                    x*n

                },
                {
                    x->
                    println(x*n*n)
                    x*n*n})
    }


}

fun main(args: Array<String>) {
    outsideFunc()
}