package az.coders.ada_students.lessons.lesson_13.eolimp;

import java.util.Scanner;

public class Square {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        ForCalculating S = new ForCalculating();

        System.out.println("Enter the side of square for getting area and perimeter:");
        int a = scanner.nextInt();
        S.getAreaOfSquare(a);
        S.getPerimeterOfSquare(a);
    }
}
