package az.coders.ada_students.lessons.lesson_7;

import java.util.Scanner;

public class Array3D {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        int n = scan.nextInt();
        int m = 0;

        int [] [] [] arr = new int[n][n][n];

        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                for (int k = 0; k < n; k++) {
                    System.out.print(m++ + " ");
                }
                System.out.println("***********");
            }
            System.out.println("-------------");
        }
    }
}
