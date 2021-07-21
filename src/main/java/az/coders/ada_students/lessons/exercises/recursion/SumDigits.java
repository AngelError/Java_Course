package az.coders.ada_students.lessons.exercises.recursion;

import java.util.Scanner;

public class SumDigits {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int n = scanner.nextInt();

        System.out.println(sumDigits(n));
    }

    public static int sumDigits(int n) {
        int forSum = 0;
        if(n > 0) {
            if(n < 10)
                return n;
            else {
                forSum += (n%10);
                return forSum + sumDigits(n/10);
            }
        }
        return 0;
    }
}
