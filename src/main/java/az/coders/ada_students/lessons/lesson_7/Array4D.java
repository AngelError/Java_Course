package az.coders.ada_students.lessons.lesson_7;

import java.util.Scanner;

public class Array4D {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        int num = scan.nextInt();
        int m = 1;

        int[][][][] arr = new int[num][num][num][num];

        for (int i = 0; i < num; i++) {
            for (int j = 0; j < num; j++) {
                for (int k = 0; k < num; k++) {
                    for (int l = 0; l < num; l++) {
                        System.out.print(m++ + " ");
                    }
                    System.out.println("**********");
                }
                System.out.println("-----------");
            }
            System.out.println("++++++++++++");
        }
    }
}