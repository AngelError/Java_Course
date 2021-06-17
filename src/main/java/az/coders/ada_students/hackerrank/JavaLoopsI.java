package az.coders.ada_students.hackerrank;

import java.util.Scanner;

public class JavaLoopsI {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        int num = scan.nextInt();
        int result;

        for (int i = 1; i <= 10; i++) {
            result = num * i;
            System.out.println(num + " x " + i + " = " + result);
        }
    }
}
