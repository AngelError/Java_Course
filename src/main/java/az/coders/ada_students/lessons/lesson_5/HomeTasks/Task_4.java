package az.coders.ada_students.lessons.lesson_5.HomeTasks;

import java.util.Scanner;

//29. Write a Java program that reads an positive integer and count the number of digits the number (less than ten billion) has. Go to the editor
//          Test Data
//        Input an integer number less than ten billion: 125463
//        Expected Output :
//          Number of digits in the number: 6
public class Task_4 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Input an integer number less than ten billion:");
        int num = scan.nextInt();

        Message_1(num);

        System.out.print(Output(num));
    }

    public static void Message_1(int num) {
        if(num <= 0) {
            System.out.println("Please enter Positive Integer!");
        }
    }

    public static int Output(int num) {
        int cnt = 0;
        while (num != 0) {
            num /= 10;
            cnt ++;
        }
        System.out.print("Number of digits in the number: ");
        return cnt;
    }


}
