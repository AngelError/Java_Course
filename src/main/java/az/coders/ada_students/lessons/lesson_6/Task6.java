package az.coders.ada_students.lessons.lesson_6;

import java.util.Scanner;

//Write a Java method (takes a number n as input) to displays an n-by-n matrix.
public class Task6 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        int num = scan.nextInt();
        int cnt = 0;
            CNT(num,cnt);
    }

    public static void CNT(int num, int cnt) {
        for(int i = 0; i < num; i++) {
            for (int j = 0; j < num; j++) {
                System.out.print(cnt++ + " ");
            }
            System.out.println();
        }
    }
}
