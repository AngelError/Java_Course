package az.coders.ada_students.lessons.lesson_4.Class;

//11. Write a program in Java to display n terms of natural numbers and their sum. Go to the editor

import java.util.Scanner;

public class Task5 {
    public static void main(String[] args) {
        Scanner scan =  new Scanner(System.in);
        System.out.print("Enter The number for displaying:");
        int n = scan.nextInt();
        System.out.print("Enter The numbers for sum:");

//        SumOfNumbers(n,scan);

        System.out.println(SumOfNumbers(n,scan));
    }

    public static int SumOfNumbers(int n, Scanner scan) {

        int sum = 0;
        for (int i = 0; i < n; i++) {
            int num = scan.nextInt();
            sum += num;
        }
        System.out.print("The sum of numbers: ");
        return sum;
    }
}
