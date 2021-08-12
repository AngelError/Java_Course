package az.coders.ada_students.lessons.lesson_5;

import java.util.Scanner;

public class Task1 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int num = scan.nextInt();
        int cnt = 0;

        Message_1(num);

        if(CNT(num,cnt) == 1 ) System.out.println(num + " is Prime number!");
        else System.out.println(num +" is Composite number");
    }

    public static void Message_1(int num) {
        if(num <= 0) System.out.println("Please enter a number greater than 0!");
        else if(num == 1) System.out.println(num + " is Prime number!");
    }

    public static int CNT(int num, int cnt) {
        for(int i = 2; i<=num; i++) {
            if((num % i == 0)){
                cnt++;
            }
        }
        return cnt;
    }
}

