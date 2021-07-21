package az.coders.ada_students.lessons.exercises.recursion;

import java.util.Scanner;

public class Triangle {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int rows = scanner.nextInt();
        System.out.println(triangle(rows));
    }
    public static int triangle(int rows) {
        if(rows != 0) {
            return rows + triangle(rows-1);
        }
        return 0;
    }
}
