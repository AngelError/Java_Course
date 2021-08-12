package az.coders.ada_students.lessons.lesson_19.education;

public abstract class Student {
    private int id;
    private double averageGPA;

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

    @Override
    public String toString() {
        return "Id : " + id + '\n' +
                "Average GPA : " + averageGPA;
    }
}
