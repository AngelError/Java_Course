package az.coders.ada_students.lessons.exercises.recursion;

import java.util.Scanner;

public class CountHi {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String str = scanner.next();

        System.out.println(countHi(str));
    }

    public static int countHi(String str) {
        int cnt = 0;
        if (str.length() >= 2) {
            if (str.substring(0, 2).equals("hi")) { // equals and ==
                cnt += 1;
                return cnt + countHi(str.substring(1));
            }
            else
                return countHi(str.substring(1));
        }
        else return 0;
    }
}
