package az.coders.ada_students.lessons.lesson_6;

import java.util.Scanner;

public class Task4 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int year = scan.nextInt();

        if (year % 4 == 0 && year % 100 == 0 && year % 400 == 0)
            System.out.println(year + " is Leap Year!");
        System.out.println(year + " is not Leap Year!");
    }
}
