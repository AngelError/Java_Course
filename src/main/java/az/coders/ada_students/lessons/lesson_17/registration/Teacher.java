package az.coders.ada_students.lessons.lesson_17.registration;

public class Teacher {
    String specialty;
    int fromWork;

    public void setSpecialty(String specialty) {
        this.specialty = specialty;
    }

    public void setFromWork(int fromWork) {
        this.fromWork = fromWork;
    }
    Person person;

    @Override
    public String toString() {
        return person +
                "Specialty: " + specialty + '\n' +
                "FromWork: " + fromWork;
    }
}
