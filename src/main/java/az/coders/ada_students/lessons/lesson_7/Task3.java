package az.coders.ada_students.lessons.lesson_7;

import java.util.Scanner;

public class Task3 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        int num = scan.nextInt();
        System.out.println();
        int sum1 = 0;
        int sum2 = 0;

        int [] [] arr = new int [num] [num];

        for (int i = 0; i < num; i++) {
            for (int j = 0; j < num; j++) {

                Method_1(i,j,num);
                Method_2(arr,num,j,i,sum1,sum2);
            }
            System.out.println();
        }
        System.out.println("\n" + "================");
        System.out.println("Sum of First Diagonal : " + sum1);
        System.out.println("Sum of Second Diagonal : " + sum2);
        System.out.println("================");
    }

    public static void Method_2(int arr[][], int num, int j, int i, int sum1, int sum2){
        if (i == j || i + j == num -1) {
            int a = (int)(Math.random()*(100));
            arr[i][j] = a;

            if (i == j) {
                sum1 += a;
            } if (i + j == num - 1){
                sum2 += a;
            }

            if (a / 10 == 0)
                System.out.print(a + "  ");
            else
                System.out.print(a + " ");
        }
    }

    public static void Method_1(int i, int j, int num) {
        if (i != j && i + j != num -1) {
            System.out.print("   ");
        }
    }
}
