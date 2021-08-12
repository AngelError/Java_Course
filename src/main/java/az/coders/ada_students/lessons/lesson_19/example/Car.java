package az.coders.ada_students.lessons.lesson_19.example;

public class Car {
    Arabalar name;
    String color;

    public Car(Arabalar name, String color) {
        this.name = name;
        this.color = color;
    }

    public Arabalar getName() {
        return name;
    }

    public void setName(Arabalar name) {
        this.name = name;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    @Override
    public String toString() {
        return "Car{" +
                "name='" + name + '\'' +
                "hiz='" + name.hiz + '\'' +
                ", color='" + color + '\'' +
                '}';
    }
}
