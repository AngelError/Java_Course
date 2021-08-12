package az.coders.ada_students.lessons.lesson_19.bazarstore;

public class Customer implements Personal {

    @Override
    public String name() {
        return "Rosalee";
    }

    @Override
    public String surname() {
        return "Calvert";
    }

    @Override
    public String toString() {
        return "Customer " + name() + " " + surname() + '\n' +
                "----------------------------" ;
    }
}
