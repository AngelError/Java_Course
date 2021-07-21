package az.coders.ada_students.lessons.lesson_5;

import java.util.Scanner;

public class Task3 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int num = scan.nextInt();

        for(int i = 0; i < num; i++) {
           Stars(num);
            System.out.println();
        }
    }

    public static void Stars(int num) {
        for (int j = 0; j < num; j++){
            System.out.print("* ");
        }
    }
}
