package az.coders.ada_students.lessons.lesson_13.eolimp;

import java.util.Scanner;

public class Rectangle {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        ForCalculating P = new ForCalculating();
        System.out.println("If a = 10 and b = 30 :");
        P.getPerimeterOfRectangle(10,30);
        P.getAreaOfRectangle(10,30);

        System.out.println("---------------------------------------------------------");

        System.out.println("Enter the 4 sides and diagonal of Rectangle for calculating its area with Heron: ");

        int x1, y1, x2, y2, z;

        System.out.println("The top side of rectangle is:");
        x1 = scanner.nextInt();
        System.out.println("The right side of rectangle is:");
        y1 = scanner.nextInt();
        System.out.println("The bottom side of rectangle is:");
        x2 = scanner.nextInt();
        System.out.println("The left side of rectangle is:");
        y2 = scanner.nextInt();
        System.out.println("The diagonal of rectangle from 'left-top' to 'right-bottom' is:");
        z = scanner.nextInt();

        P.useHeron(x1,y1,x2,y2,z);

        System.out.println("---------------------------------------------------------");

        System.out.println("If you want to initialize the value of a and b, enter them: ");
        while (scanner.hasNext()) {
            P.getPerimeterOfRectangle(scanner.nextInt(), scanner.nextInt());
            P.getAreaOfRectangle(scanner.nextInt(), scanner.nextInt());
        }

        System.out.println("---------------------------------------------------------");


    }
}
