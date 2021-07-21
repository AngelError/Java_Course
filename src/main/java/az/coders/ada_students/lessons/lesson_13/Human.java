package az.coders.ada_students.lessons.lesson_13;

import java.util.Arrays;
import java.util.Stack;

public class Human {

    public String name;
    public String surname;
    public int year;
    public int iq;
    public Pet pet;
    public String mother;
    public String father;
//    Human mother = new Human();
//    Human father = new Human();

    public int[][] schedule;

    public void greetPet() {
        System.out.println("Hello, " + pet.nickname);
    }

    public void describePet() {
        System.out.print("I have a " + pet.species + ", he is " + pet.age + " years old, he is ");
        if(pet.age > 50) System.out.println("very sly.");
        else System.out.println("almost not sly.");
    }

    @Override
    public String toString() {
        return "Human{" +
                "name='" + name + '\'' +
                ", surname='" + surname + '\'' +
                ", year=" + year +
                ", iq=" + iq +
                ", mother='" + mother + '\'' +
                ", father='" + father + '\'' +
                "pet=" + pet +
                '}';
    }

    public void getBasicInformation(String humanName, String humanSurname, int birthYear) {
        name = humanName;
        surname = humanSurname;
        year = birthYear;
    }

    public void printBasicInfo(String father, String mother) {
        getBasicInformation("Michael", "Karleone", 1977);
        father = "Vito Karleone";
        mother =  "Jane Karleone";
    }

    public void printExtraInformation(int iq) {
        iq = 90;
    }
}
