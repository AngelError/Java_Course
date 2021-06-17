package az.coders.ada_students.lessons.lesson7;

import java.util.Scanner;

public class Task1 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        int num = scan.nextInt();

        int [] [] arr = new int [num] [num];

        for (int i = 0; i < num; i++) {
            for (int j = 0; j < num; j++) {
                int a = (int)(Math.random()*(100));
                arr[i][j] = a;
                if (a / 10 == 0)
                    System.out.print(a + "  ");
                else
                    System.out.print(a + " ");
            }
            System.out.println();
        }
    }
}
