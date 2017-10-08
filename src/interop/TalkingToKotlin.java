package interop;

/**
 * Created by Jitendra Alekar on 10/8/2017.
 * Project Name : LearningKotlin
 */
public class TalkingToKotlin {
    public static void main(String[] args) {
        CustomerKotlin customerKotlin = new CustomerKotlin();
        customerKotlin.build(1, "Jitendra Alekar");


        customerKotlin.getName(); //kotlin properties accesssed via getter and setter

        System.out.print(customerKotlin.isLearning); // JVMfield

        customerKotlin.preferential(); // JVMName, kinda creates an alias for a function

        CustomerKotlinKt.drop(customerKotlin); // Accessing extension function

        DontNameMeUtility.bing();
    }

}
