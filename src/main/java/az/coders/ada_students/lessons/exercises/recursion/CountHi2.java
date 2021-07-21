package az.coders.ada_students.lessons.exercises.recursion;

import java.util.Scanner;

public class CountHi2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String str = scanner.next();

        System.out.println(countHi2(str));
    }

    public static int countHi2(String str) {
        int cnt = 0;
        if (str.length() >= 2) {
            if (str.substring(0, 2).equals("hi")) { // equals and ==
                cnt += 1;
                return cnt + countHi2(str.substring(2));
            }
            else
                return countHi2(str.substring(1));
        }
        else return 0;
    }
}
