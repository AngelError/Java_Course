package az.coders.ada_students.lessons.lesson_17.leetcode;

import java.util.Scanner;

//https://www.hackerrank.com/contests/codewhiz-java/challenges/weird-numbers

public class WeirdNumbers {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int N = scan.nextInt();
        if(N % 2 == 1 || (N % 2 == 0 && N >= 6 && N <= 20)) System.out.println("Weird");
        else System.out.println("Not Weird");
    }
}
