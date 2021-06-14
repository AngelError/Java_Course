package az.coders.ada_students.lessons.lesson_6;

import java.util.Scanner;

public class Task2 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        String str = scan.nextLine();
        int cnt = 0;
        int a = str.length()-1;

        while (a >= 0) {
            if (str.charAt(a) == 'a'|| str.charAt(a) == 'e' || str.charAt(a) == 'u' || str.charAt(a) == 'i' || str.charAt(a) == 'o')
                cnt++;
            a--;
        }
        System.out.println(cnt);
    }
}
