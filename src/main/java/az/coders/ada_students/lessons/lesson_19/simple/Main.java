package az.coders.ada_students.lessons.lesson_19.simple;

import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        Person person = new Person();

        person.setName("Nabat");
        person.setSurname("Gasimzadada");
        person.setFatherName("Elkhan");
        person.setId(11993);
        person.setAverageGPA(2.82);

//        person.beAwarded(person.name + " is not awarded!");

        System.out.print("Student " + person.name + " ");
        System.out.print(person.surname +  " ");
        System.out.println(person.fatherName);

        // object of abstract class can not be called
//        System.out.println(person.id);
//        System.out.println(person.averageGPA);

        System.out.println(person.getId());
        System.out.println(person.getAverageGPA());

        // methods of Talanted
        System.out.println(person.beAwarded());
        System.out.println(person.getHonorsDiploma());
        System.out.println(person.getOfferFromAbroad());

        System.out.println("---------------------------------------------");
        System.out.println(person);
    }
}
