package az.coders.ada_students.lessons.lesson_5.HomeTasks;

import java.util.Scanner;

//30. Write a Java program that accepts three numbers and prints "All numbers are equal" if all three numbers
//        are equal, "All numbers are different" if all three numbers are different and
//        "Neither all are equal or different" otherwise. Go to the editor
//        Test Data
//        Input first number: 2564
//        Input second number: 3526
//        Input third number: 2456
//        Expected Output :
//        All numbers are different
public class Task_5 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

//        ==================================> Solution 1 <=======================================
        System.out.println("Input first number:");
        int num1 = scan.nextInt();
        System.out.println("Input second number:");
        int num2 = scan.nextInt();
        System.out.println("Input third number:");
        int num3 = scan.nextInt();

        scan.close();

        Message(num1, num2, num3);
    }
    public static void Message(int num1, int num2, int num3) {
        if(num1 == num2 && num2 == num3) {
            System.out.println("All numbers are equal");
        } else if (num1 != num2 && num1 != num3 && num2 != num3) {
            System.out.println("All numbers are different");
        } else System.out.println("Neither all are equal or different");
    }
}
