package az.coders.ada_students.lessons.lesson_17.registration;

public class Student implements Ability{
    String id;
    int classNo;

    public void setId(String id) {
        this.id = id;
    }

    public void setClassNo(int classNo) {
        this.classNo = classNo;
    }

    Person person;

    @Override
    public String toString() {
        return person +
                "İD: " + id + '\n' +
                "Class: " + classNo;
    }

    @Override
    public String englishDegree() {
        return person.name + " has english degree!";
    }

    @Override
    public String achievement() {
        return person.name + " has " + person.position + " achievement!";
    }
}
