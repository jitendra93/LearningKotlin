package interop;

import org.jetbrains.annotations.NotNull;

import java.util.List;

/**
 * Created by Jitendra Alekar on 10/8/2017.
 * Project Name : LearningKotlin
 */
public interface CustomerRepository {

    CustomerJava getById(int id);

    List<CustomerJava> getAll ();
}
