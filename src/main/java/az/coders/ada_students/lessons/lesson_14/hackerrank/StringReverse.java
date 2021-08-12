package az.coders.ada_students.lessons.lesson_14.hackerrank;

import java.util.Scanner;

public class StringReverse {
    public static void main(String[] args) {

        Scanner sc=new Scanner(System.in);
        String A=sc.next();
        /* Enter your code here. Print output to STDOUT. */

        int cnt = 0;
        for (int i = 0; i < A.length()/2; i++) {
            if (A.charAt(i) == A.charAt(A.length()-i-1))
                cnt += 1;
        }
        if(cnt == A.length()/2) System.out.println("Yes");
        else System.out.println("No");
    }
}
