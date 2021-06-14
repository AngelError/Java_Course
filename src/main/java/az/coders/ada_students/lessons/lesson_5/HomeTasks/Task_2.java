package az.coders.ada_students.lessons.lesson_5.HomeTasks;

import java.util.Scanner;

//19. Write a program in Java to make such a pattern like a pyramid with a number
// which will repeat the number in the same row. Go to the editor
//           1
//          2 2
//         3 3 3
//        4 4 4 4
public class Task_2 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Please enter the number for row : ");
        int num = scan.nextInt();

        for (int i = 1; i <= num; i++) {

            for (int j = num - i; j >= 1; j--) {
                System.out.print(" ");
            }

            for (int j = 1; j <= i; j++) {
                System.out.print(i + " ");
            }

                System.out.println();
        }
    }
}

