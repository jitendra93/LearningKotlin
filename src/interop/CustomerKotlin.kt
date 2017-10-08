package interop

/**
 * Created by Jitendra Alekar on 10/8/2017.
 * Project Name : LearningKotlin
 */
class CustomerKotlin{

    var id : Int = 0
    var name : String = ""


    @JvmField var isLearning : Boolean = true

    /**
     * The JVMOverloads annotation creates an overloaded method for passing the default parameters
     * */
    @JvmOverloads fun build(id: Int, name: String, isLearning : Boolean = true) {
        this.id = id
        this.name = name
    }

    @JvmName("preferential") fun makereferential(){

    }

}

fun CustomerKotlin.drop(){

}