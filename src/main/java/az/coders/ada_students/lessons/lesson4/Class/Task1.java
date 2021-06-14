package az.coders.ada_students.lessons.lesson4.Class;

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

        System.out.print("The Greatest Number: ");
        if(num1 >= num2 && num1 >= num3) System.out.println(num1);
        else if (num2 >= num3 && num2 >= num1) System.out.println(num2);
        else System.out.println(num3);
    }
}
