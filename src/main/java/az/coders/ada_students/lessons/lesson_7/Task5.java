package az.coders.ada_students.lessons.lesson_7;

import java.util.Scanner;

public class Task5 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Please enter odd number for row:");
        int num = scan.nextInt();
        if (num % 2 == 0) {
            System.out.println("Try again and enter odd number for row!");
        } else {
            System.out.println();

            int[][] arr = new int[num][num];

            for (int i = 0; i < num; i++) {
                for (int j = 0; j < num; j++) {
                    Method_1(i,j,num);
                }
                System.out.println();
            }
        }
    }
    public static void Method_1(int i, int j, int num) {
        if (i != j && i + j != num - 1 && j != num / 2 && i != num / 2) {
            System.out.print("  ");
        } else {
            System.out.print("* ");
        }
    }
}
