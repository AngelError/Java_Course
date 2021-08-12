package az.coders.ada_students.lessons.lesson_15.project;

import java.util.Scanner;

public class User {
    public static void main(String[] args) {

        String username;
        String usersurname;
        String userfathername;
        int userage;
        String userspecialty;
        int userinternship;
        String userlanguage;
        String useraddress;





        Scanner scanner = new Scanner(System.in);
        System.out.println("---------------- > Job Application < ----------------");
        System.out.println();

        System.out.print("Please enter your name: ");
        username = scanner.nextLine();

        System.out.print("Please enter your surname: ");
        usersurname = scanner.nextLine();

        System.out.print("Please enter your father name: ");
        userfathername = scanner.nextLine();

        System.out.print("Please enter your age: ");
        userage = scanner.nextInt();
        scanner.nextLine();

        System.out.print("Please enter your specialty: ");
        userspecialty = scanner.nextLine();

        System.out.print("Please enter your internship (year): ");
        userinternship = scanner.nextInt();
        scanner.nextLine();

        System.out.print("Please enter one of your better-language-skill: ");
        userlanguage = scanner.nextLine();

        System.out.print("Please enter your address or residential address: ");
        useraddress = scanner.nextLine();

        Data data = new Data();

        data.setName(username);
        data.setSurname(usersurname);
        data.setFathername(userfathername);
        data.setAge(userage);
        data.setSpecialty(userspecialty);
        data.setInternship(userinternship);
        data.setLanguage(userlanguage);
        data.setAddress(useraddress);

        Checker checker = new Checker(data.specialty);

        System.out.println("---------------- > Applicant < ----------------");
        System.out.println(data);
        System.out.println("-----------------------------------------------");

        System.out.println();

        System.out.println("---------------- > Vacancies < ----------------");
        System.out.println(checker);
        System.out.println("-----------------------------------------------");

    }
}
