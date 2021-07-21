package az.coders.ada_students.lessons.lesson_11.recursion;

import java.util.Scanner;

//Given n of 1 or more, return the factorial of n,
// which is n * (n-1) * (n-2) ... 1. Compute the result recursively (without loops).
//
//
//        factorial(1) → 1
//        factorial(2) → 2
//        factorial(3) → 6

public class Factorial {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();

    }
    public static int factorial(int n) {

        int f = 1;

        if(n != 1) {
            f = n * factorial(n-1);
        }

        return f;
    }
}
