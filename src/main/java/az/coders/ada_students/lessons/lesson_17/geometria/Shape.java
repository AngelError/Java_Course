package az.coders.ada_students.lessons.lesson_17.geometria;

import az.coders.ada_students.lessons.lesson_17.geometria.shapes.Parallelogram;
import az.coders.ada_students.lessons.lesson_17.geometria.shapes.Rectangle;
import az.coders.ada_students.lessons.lesson_17.geometria.shapes.Square;
import az.coders.ada_students.lessons.lesson_17.geometria.shapes.Triangle;

public class Shape {
    public static void main(String[] args) {
        Square square = new Square(10);
        System.out.println(square);

        Rectangle rectangle = new Rectangle(5, 10);
        System.out.println(rectangle);

        Triangle triangle = new Triangle(3, 4, 5);
        System.out.println(triangle);

        Parallelogram parallelogram = new Parallelogram(10,20,60);
        System.out.println(parallelogram);
    }
}
