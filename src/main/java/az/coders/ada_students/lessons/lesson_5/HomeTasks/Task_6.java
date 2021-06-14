package az.coders.ada_students.lessons.lesson_5.HomeTasks;

import java.util.Scanner;

//31. Write a program that accepts three numbers from the user and prints "increasing" if the numbers
//        are in increasing order, "decreasing" if the numbers are in decreasing order, and
//        "Neither increasing or decreasing order" otherwise. Go to the editor
//        Input first number: 1524
//        Input second number: 2345
//        Input third number: 3321
//        Expected Output :
//        Increasing order
public class Task_6 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int newNumMin = Integer.MIN_VALUE;
        int cnt = 0;
        int cntMin = 0;
        int cntMax = 0;

        while (cnt < 3) {
            int num = scan.nextInt();
            if (newNumMin <= num) {
                newNumMin = num;
                cntMin++;
            } else cntMax++;
            cnt++;
        }
        scan.close();
        if (cntMin == 3) System.out.println("increasing");
        else if (cntMax == 2) System.out.println("decreasing");
        else System.out.println("Neither increasing or decreasing order");
    }
}
