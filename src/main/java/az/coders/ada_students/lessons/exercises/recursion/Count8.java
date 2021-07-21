package az.coders.ada_students.lessons.exercises.recursion;

import java.util.Scanner;

public class Count8 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        System.out.println(count8(n));
    }

    public static int count8(int n) {
        if(n > 0) {
            if (n % 10 == 8) {
                if ((n / 10) % 10 == 8)
                    return 2 + count8(n / 10);
                    return 1 + count8(n / 10);
            }
        }
        return 0;
    }
}
