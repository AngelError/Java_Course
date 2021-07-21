package az.coders.ada_students.lessons.lesson_4.Class;

import java.util.Scanner;

//3. Take three numbers from the user and print the greatest number
//
//        Test Data
//        Input the 1st number: 25
//        Input the 2nd number: 78
//        Input the 3rd number: 87
//        Expected Output :
//        The greatest: 87
public class Task1 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter Three Numbers: ");
        System.out.print("Input the 1st: ");
        int num1 = scan.nextInt();
        System.out.print("Input the 2nd: ");
        int num2 = scan.nextInt();
        System.out.print("Input the 3rd: ");
        int num3 = scan.nextInt();

        CompareNumbers(num1,num2);
        System.out.print("The Greatest Number: ");
        System.out.println(Math.max(CompareNumbers(num1,num2), num3));

    }

    public static int CompareNumbers(int num1, int num2) {
        return Math.max(num1, num2);
    }
}
