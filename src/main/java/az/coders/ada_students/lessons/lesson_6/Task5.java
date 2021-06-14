package az.coders.ada_students.lessons.lesson_6;

import java.util.Scanner;

public class Task5 {
    public static void main(String[] args) {
        System.out.println("Please enter the password:");

        Scanner scan = new Scanner(System.in);
        String str = scan.nextLine();

        int cnt = 0, cntt = 0;

        if (str.length() <= 10) System.out.println("A password must have at least ten characters.");

        for (int i = 0; i < str.length(); i++) {
            if (Character.isDigit(str.charAt(i)))
                cnt++;
            else if (Character.isUpperCase(str.charAt(i)) || Character.isLowerCase(str.charAt(i))) {
                cntt++;
            }
        }

        if (cnt == 0 || cntt == 0)
            System.out.println("A password consists of only letters and digits.");

        if (cnt <= 2)
            System.out.println("A password must contain at least two digits.");
    }
}
