package az.coders.ada_students.lessons.exercises.recursion;

import java.util.Scanner;

public class AllStars {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String str = scanner.next();

        System.out.println(allStars(str));
    }

    public static String allStars(String str) {
        if (str.equals(""))
            return str;
        else if (str.length() == 1)
            return str;
        else {
            return str.substring(0,1) + '*' + allStars(str.substring(1));
        }
    }
}


