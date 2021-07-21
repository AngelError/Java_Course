package az.coders.ada_students.lessons.lesson_5;

import java.util.Scanner;

public class Task2 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int num = scan.nextInt();
        int sum = 1 + num;

        System.out.println(Output(num,sum));
    }

    public static int Output(int num, int sum) {
        for (int i = 2; i < num; i++) {
            if (num % i == 0) {
                sum += i;
            }
        }
        return sum;
    }

}
