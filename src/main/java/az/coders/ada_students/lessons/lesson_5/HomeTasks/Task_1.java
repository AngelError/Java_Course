package az.coders.ada_students.lessons.lesson_5.HomeTasks;

import java.util.Scanner;

//16. Write a program in Java to display the pattern like right angle triangle with a number. Go to the editor
//        Input number of rows : 10
//        Expected Output :
//        1
//        12
//        123
//        1234
//        12345
//        123456
//        1234567
//        12345678
//        123456789
//        12345678910
public class Task_1 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.print("Input number of rows : ");
        int num = scan.nextInt();
        Alg(num);
    }

    public static void Alg(int num){
        for(int i = 1; i <= num; i++) {
            for (int j = 1; j <= i; j++) {
                System.out.print(j);
            }
            System.out.println();
        }
    }
}
