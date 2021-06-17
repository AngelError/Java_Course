package az.coders.ada_students.lessons.lesson7;

import java.util.Scanner;

public class Task4 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        int num = scan.nextInt();
        System.out.println();
        int sum1 = 0;
        int sum2 = 0;
        int sum3 = 0;

        int [] [] arr = new int [num] [num];

        for (int i = 0; i < num; i++) {
            for (int j = 0; j < num; j++) {
                if (i != j && i + j != num -1 && j != num / 2 && i != num /2) {
                    System.out.print("   ");
                } else {
                    int a = (int)(Math.random()*(100));
                    arr[i][j] = a;

                    if (i == j) {
                        sum1 += a;
                    } if (i + j == num - 1){
                        sum2 += a;
                    } if (num % 2 == 1 && i == num / 2 || j == num / 2) {
                        sum3 += a;
                    }

                    if (a / 10 == 0)
                        System.out.print(a + "  ");
                    else
                        System.out.print(a + " ");
                }
            }
            System.out.println();
        }
        System.out.println("\n" + "================");
        System.out.println("Sum of First (Left) Diagonal : " + sum1);
        System.out.println("Sum of Second (Right) Diagonal : " + sum2);
        System.out.println("Sum of Center Diagonals : " + sum3);
        System.out.println("================");
    }
}
