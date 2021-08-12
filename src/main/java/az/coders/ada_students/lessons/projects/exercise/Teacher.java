package az.coders.ada_students.lessons.projects.exercise;

public class Teacher extends Person{
    double salary;

    public Teacher(String id, String name, String job, double salary) {
        super(id, name, job);
        this.salary = salary;
    }

    public void talk() {

    }
}
