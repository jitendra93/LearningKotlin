package functional

/**
 * Created by Jitendra Alekar on 9/23/2017.
 * Project Name : LearningKotlin
 */


// a polynomial operation for polynomial x  + f1(x) + f2(x)
// polynomialOperation is a higher order function

fun polynomialOperation(x: Int, f1: (Int) -> Int, f2: (Int) -> Int): Int {
    return f1(x) + f2(x) + 2 * x;
}

fun cube(x: Int): Int = x * x * x
fun square(x: Int): Int = x * x

fun main(args: Array<String>) {
    for (i in 1..20 step 5) {
        println(polynomialOperation(i, ::cube, ::square))
    }


    // we can also pass functions by writing lambda expressions
    println(polynomialOperation(5, { x -> x * x * x }, { x -> x * x }))


    val sumLambda: (Int, Int) -> Int = { x, y -> x + y }

    println(sumLambda(2, 3))


    //lambda with single parameter. For single parameter we can directly refer to the parameter as it
    val square: (Int) -> Int = { it * it }

    // here the data type of it is automatically infered by the compiler.
    val poly = polynomialOperation(5, { it * it * it }, { it * it })


    //Passing anonymous functions
    // Anonymous functions have one advantage over lambda; they allow multiple return points.

    polynomialOperation(5,
            fun(x: Int): Int {
                if (x / 2 > 0) {
                    return x / 2
                } else {
                    return 1
                }
            }, fun(x: Int): Int {    return x * 100    })


}

