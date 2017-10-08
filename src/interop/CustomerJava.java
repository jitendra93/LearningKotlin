package interop;

import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/**
 * Created by Jitendra Alekar on 10/8/2017.
 * Project Name : LearningKotlin
 */
public class CustomerJava {

    private int id;

    private String name;


    public void prettyPrint(){
        System.out.println("name ->"+name);
    }

    public   String sometimesNull(){ return null;}

    public  @NotNull String neverNull(){ return "A Str";}


    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
