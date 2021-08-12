package az.coders.ada_students.lessons.lesson_17.registration;

import java.util.Scanner;

public class Registrar {
    public static void main(String[] args) {

        String name;
        String surname;
        String fatherName;
        String gender;
        int age;
        String position;

        Scanner scanner = new Scanner(System.in);

        System.out.println("=======> Registration For Thomas Jefferson High School for Science and Technology <=======");

        System.out.println("Enter your name: ");
        name = scanner.nextLine();
        System.out.println("Enter your surname: ");
        surname = scanner.nextLine();
        System.out.println("Enter your father name: ");
        fatherName = scanner.nextLine();
        System.out.println("Enter your gender: ");
        gender = scanner.nextLine();
        System.out.println("Enter your age: ");
        age = scanner.nextInt();
        scanner.nextLine();
        System.out.println("Enter your position: ");
        position = scanner.nextLine();

        Person person = new Person();
        person.setName(name);
        person.setSurname(surname);
        person.setFatherName(fatherName);
        person.setGender(gender);
        person.setAge(age);
        person.setPosition(position);

        Student student = new Student();
        Teacher teacher = new Teacher();

        if(position.equalsIgnoreCase("teacher")) {
            teacher.person = person;
            System.out.println("Enter your Specialty: ");
            teacher.setSpecialty(scanner.nextLine());
            System.out.println("Enter your year that work from^ ");
            teacher.setFromWork(scanner.nextInt());
            System.out.println(teacher);
        }
        else if (position.equalsIgnoreCase("student")) {
            student.person = person;
            System.out.println("Enter your Class: ");
            student.setClassNo(scanner.nextInt());
            scanner.nextLine();
            System.out.println("Enter your ID: ");
            student.setId(scanner.nextLine());
            System.out.println(student);
        } else
            System.out.println("Position is not found! Check it and try again!");

        System.out.println("==========================================================================================");
    }
}