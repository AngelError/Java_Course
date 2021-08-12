package az.coders.ada_students.lessons.lesson_19.simple;

public abstract class Student {
    private int id;
    private double averageGPA;
    private String str;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public double getAverageGPA() {
        return averageGPA;
    }

    public void setAverageGPA(double averageGPA) {
        this.averageGPA = averageGPA;
    }

    public abstract void beAwarded(String s);
}
