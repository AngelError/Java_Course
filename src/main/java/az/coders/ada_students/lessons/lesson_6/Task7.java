package az.coders.ada_students.lessons.lesson_6;

import java.util.Scanner;

public class Task7 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Please enter the number for row : ");
        int num = scan.nextInt();

        for (int i = 1; i <= num; i++) {
            Method_1(num,i);
            Stars(i);

            System.out.println();
        }

        for (int i = num; i >= 1; i--) {

            Method_2(i,num);
            Stars(i);

            System.out.println();
        }
    }

    public static void Stars(int i) {
        for (int j = 1; j <= i; j++) {
            System.out.print("* ");
        }
    }

    public static void Method_1(int num, int i) {
        for (int j = num - i; j >= 1; j--) {
            System.out.print(" ");
        }
    }

    public static void Method_2(int i, int num) {
        for (int j = i - num; j < 0; j++) {
            System.out.print(" ");
        }
    }
}
