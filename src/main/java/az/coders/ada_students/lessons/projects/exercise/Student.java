package az.coders.ada_students.lessons.projects.exercise;

public class Student extends Person{
    double money;

    public Student(String id, String name, String job, double money) {
        super(id, name, job);
        this.money = money;
    }

    public void talk() {

    }
}
