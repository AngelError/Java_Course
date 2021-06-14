package az.coders.ada_students.lessons.lesson_5.HomeTasks;

import java.util.Scanner;

//20. Write a program in Java to print the Floyd's Triangle. Go to the editor
//        Test Data
//        Input number of rows : 5
//        Expected Output :
//        Input number of rows :  5
//        1
//        2 3
//        4 5 6
//        7 8 9 10
//        11 12 13 14 15
public class Task_3 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Input number of rows :");
        int num = scan.nextInt();
        int n = 1;

        for (int i = 1; i <= num; i++) {
            for (int j = 1; j <= i; j++) {
                System.out.print(n + " ");
                n++;
            }
            System.out.println();
        }
    }
}
