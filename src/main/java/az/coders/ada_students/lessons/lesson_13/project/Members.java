package az.coders.ada_students.lessons.lesson_13.project;

public class Members {
        String name;
        String surname;
        String position;

        Education edu;


    public void setName(String name) {
        this.name = name;
    }

    public void setSurname(String surname) {
        this.surname = surname;
    }

    public void setPosition(String position) {
        this.position = position;
    }

    @Override
    public String toString() {
        return "Members{" +
                "name='" + name + '\'' +
                ", surname='" + surname + '\'' +
                ", position='" + position + "\', " +
                edu +
                '}';
    }
}
