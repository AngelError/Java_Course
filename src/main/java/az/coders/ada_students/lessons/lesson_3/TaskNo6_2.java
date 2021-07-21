package az.coders.ada_students.lessons.lesson_3;
//Capture the numbers between 1000 and 10,000 that
// are equal to the sum of the first two digits and
// the last two digits

import java.util.Scanner;

public class TaskNo6_2 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int num = scanner.nextInt();
        int first = 0, second = 0, third = 0, fourth = 0;

        first = num / 1000;
        second = num / 100 % 10;
        third = num % 100 / 10;
        fourth = num % 10;

        int A = (first + second);
        int B = (third + fourth);

        if(TrueFalse(A,B) == true){
            System.out.println(num);
        }
    }

    public static boolean TrueFalse(int A, int B) {
            boolean C;
            return A==B;
    }
}
