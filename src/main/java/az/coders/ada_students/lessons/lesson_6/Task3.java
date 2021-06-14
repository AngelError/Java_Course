package az.coders.ada_students.lessons.lesson_6;

import java.util.Scanner;

public class Task3 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);


        int cnt = 1;
        long pentagon = 1;

        for (int i = 1; i <= 50; i++) {
            System.out.print(i + " number: ");
            System.out.println(pentagon);
            pentagon += cnt += 3;
        }

    }
}
