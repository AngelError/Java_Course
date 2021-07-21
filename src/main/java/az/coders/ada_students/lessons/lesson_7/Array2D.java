package az.coders.ada_students.lessons.lesson_7;

import javax.security.sasl.SaslClient;
import java.util.Scanner;

public class Array2D {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        int num = scan.nextInt();
        int m = 0;

        int [] [] arr = new int[num][num];

        for (int i = 0; i < num; i++) {
            for (int j = 0; j < num; j++) {
                System.out.print(m++);
            }
            System.out.println();
        }
    }
}
