package az.coders.ada_students.lessons.exercises.recursion;

import java.util.Scanner;

public class EndX {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String str = scanner.next();

        System.out.println(endX(str));
    }

    public static String endX(String str) {
        if (!str.equals("")) {
            if (str.charAt(0) == 'x')
                return endX(str.substring(1)) + 'x';
            else
                return str.substring(0,1) + endX(str.substring(1));
        }
        return "";
    }
}
