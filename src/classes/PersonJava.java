package classes;

/**
 * Created by Jitendra Alekar on 9/9/2017.
 * Project Name : LearningKotlin
 */
public class PersonJava {

    String id;
    String name;

    public PersonJava() {
    }

    public PersonJava(String id, String name) {
        this.id = id;
        this.name = name;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Override
    public String toString() {
        return "PersonJava{" +
                "id='" + id + '\'' +
                ", name='" + name + '\'' +
                '}';
    }
}
