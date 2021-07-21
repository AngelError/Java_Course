package az.coders.ada_students.lessons.exercises.recursion;

import java.util.Scanner;

public class ChangePi {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String str = scanner.next();
        System.out.println(changePi(str));
    }

    public static String changePi(String str) {
        if(str.contains("pi")) {
            return changePi(str.replace("pi","3.14"));
        }
        return str;
    }
}
