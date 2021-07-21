package az.coders.ada_students.lessons.exercises.recursion;

import java.util.Scanner;

public class ChangeXY {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String str = scanner.next();

        System.out.println(changeXY(str));
    }
    public static String changeXY(String str) {
        if(str.contains("x")) {
            return changeXY(str.replace("x","y"));
        }
        return str;
    }
}
