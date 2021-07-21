package az.coders.ada_students.lessons.exercises.recursion;

import java.util.Scanner;

public class NoX {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String str = scanner.next();

        System.out.println(noX(str));
    }

    public static String noX(String str) {
        if (!str.equals("")) {
            if (str.charAt(0) == 'x')
                return noX(str.substring(1));
            else
                return str.charAt(0) + noX(str.substring(1));
        }
            return "";
    }
}
