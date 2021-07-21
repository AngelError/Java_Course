package az.coders.ada_students.lessons.projects;

import java.util.Scanner;

public class Project {
    public static void main(String[] args) {
        
        double A = 1,B,C, a,b,c;
        String message_1 = "No real Answer";
        String message_2 = "Infinite Answer";

        double numerator;
        double denominator;

        double x = 0, y = 0;

        Scanner scan = new Scanner(System.in);

        System.out.println("Formula: ");
        System.out.println("Ax + By = C");
        System.out.println("ax + by = c");

        System.out.println("Enter A, B, and C: ");
        A = scan.nextDouble();
        B = scan.nextDouble();
        C = scan.nextDouble();

        System.out.println("Enter a, b, and c: ");
        a = scan.nextDouble();
        b = scan.nextDouble();
        c = scan.nextDouble();

        System.out.println("------------------------------------------");
        System.out.println("Your Formula: ");
        System.out.println((int)A+"x + "+(int)B+"y = "+(int)C+"");
        System.out.println((int)a+"x + "+(int)b+"y = "+(int)c+"");

        if ((A/a) == (B/b)) {
            if ((A/a) != (C/c)) System.out.println(message_1);
            else System.out.println(message_2);
        }
        else {
            numerator = (-1) * (C/A) * a + c;
            denominator = (B/A) * a + b;
            y = numerator/denominator;
            x = (C/A) + (B/A) * y;
        }

        System.out.println("Answers of Formula: ");
        System.out.print("Value of x : " + x + " ");
        System.out.println("and value of y : " + y);

    }
}
