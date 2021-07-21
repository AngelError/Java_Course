package az.coders.ada_students.lessons.lesson_13.project;

import java.util.Arrays;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        String[] names = {"Nick", "James", "Tom", "Juliet"};
        String[] surnames = {"Thomas", "Rockefeller", "Williams", "Rockefeller"};
        String[] positions = {"instructor", "programmer", "doctor", "student"};

        int[] ages = {38, 24, 32, 20};
        String[] universities = {"METU", "Standford", "Oxford", "METU"};


        System.out.println("Names:\nNick , James, Tom , or Juliet");
        System.out.println("Choose one name for getting information about him or her:");

        try {
            Scanner scanner = new Scanner(System.in);
            String selected = scanner.next();

            int index = Arrays.asList(names).indexOf(selected);

            Members member = new Members();
            Education education = new Education();

            member.setName(selected);
            member.setSurname(surnames[index]);
            member.setPosition(positions[index]);

            education.setAge(ages[index]);
            education.setUniversity(universities[index]);

            member.edu = education;

            System.out.println(member);
        } catch (Exception exception) {
            System.out.println("Something went wrong! Check it again!");
        }
    }
}
