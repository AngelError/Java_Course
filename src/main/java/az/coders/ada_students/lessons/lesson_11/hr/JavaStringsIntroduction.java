package az.coders.ada_students.lessons.lesson_11.hr;

import java.util.Locale;
import java.util.Scanner;

public class JavaStringsIntroduction {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        String A=sc.next();
        String B=sc.next();

        int length = 0;

        length = A.length() + B.length();
        System.out.println(length);

        if (A.charAt(0) > B.charAt(0)) System.out.println("Yes");
        else System.out.println("NO");

        String firstLetterUpperA = A.substring(0,1);

        System.out.print(firstLetterUpperA.toUpperCase() + A.substring(1) + " ");

        String firstLetterUpperB  = B.substring(0,1);

        System.out.println(firstLetterUpperB.toUpperCase()+B.substring(1));

    }
}
