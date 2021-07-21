package az.coders.ada_students.lessons.lesson_13.eolimp;

import java.util.Scanner;

public class Circle {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        ForCalculating C = new ForCalculating();

        System.out.println("If R = 1.234, Perimeter of Circle:");
        C.getAreaOfCircle(1.234);

        System.out.println("If R = 1.234, Area of Circle:");
        C.getLengthOfCircle(1.234);
    }
}
