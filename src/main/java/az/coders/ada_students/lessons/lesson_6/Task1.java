package az.coders.ada_students.lessons.lesson_6;

import java.util.Scanner;

public class Task1 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        String str = scan.nextLine();
        int a = str.length()/2;
        if (str.length() % 2 != 0)
            System.out.println(str.substring(a, a+1));
        else
            System.out.println(str.substring(a-1, a+1));
    }
}
