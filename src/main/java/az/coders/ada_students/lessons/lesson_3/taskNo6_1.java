package az.coders.ada_students.lessons.lesson_3;
//Write a program to enter the numbers till the user wants
// and at the end it should display the count of positive,
// negative and zeros entered

import java.util.Scanner;

public class taskNo6_1 {
    public static void main(String[] args) {
        int positive = 0, negative = 0, zero = 0;
        Scanner scan = new Scanner(System.in);
        while(scan.hasNextInt()) {
            int num = scan.nextInt();
            if(num > 0) positive++;
            else if (num < 0) negative++;
            else zero++;
        }
        System.out.println("Number of Positive Numbers: " + positive);
        System.out.println("Number of Negative Numbers: " + negative);
        System.out.println("Number of Zero: " + zero);
    }
}
