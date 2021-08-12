package az.coders.ada_students.lessons.lesson_17.geometria.shapes;

import az.coders.ada_students.lessons.lesson_17.geometria.Ability;
import az.coders.ada_students.lessons.lesson_17.geometria.Parameter;

public class Rectangle extends Parameter implements Ability {

    public Rectangle(double sideOne, double sideTwo) {
        super(sideOne, sideTwo);
    }

    @Override
    protected double getGreatSide() {
        return Math.max(sideOne, sideTwo);
    }

    private double getWidth() {
        return  (sideOne == getGreatSide()) ? sideTwo : sideOne;
    }

    @Override
    protected double getArea() {
        return sideOne * sideTwo;
    }

    @Override
    protected double getPerimeter() {
        return 2 * (sideOne + sideTwo);
    }

    @Override
    protected double getDiagonal() {
        return Math.sqrt(Math.pow(sideOne,2) + Math.pow(sideTwo,2));
    }

    @Override
    public String toString() {
        return "=========>   Rectangle   <=========" + '\n' +
                "Length: " + getGreatSide() + '\n' +
                "Width: " + getWidth() + '\n' +
                "Area: " + getArea() + '\n' +
                "Perimeter: " + getPerimeter() + '\n' +
                "Diagonal: " + getDiagonal() + '\n' +
                "More: " + '\n' +
                drawCircleOutside() + ", R= " + getOutsideRadius() + '\n' +
                drawCircleInside() + ", r= " + getInsideRadius() + '\n' +
                checkSymmetry() + '\n';
    }

    @Override
    public String drawCircleInside() {
        return "It is not possible to draw a circle inside the rectangle.";
    }

    @Override
    public String drawCircleOutside() {
        return "All rectangles can be inscribed in the circle.";
    }

    @Override
    public double getInsideRadius() {
        return 0;
    }

    @Override
    public double getOutsideRadius() {
        return getDiagonal() / 2;
    }

    @Override
    public String checkSymmetry() {
        return "Rectangle has two lines of symmetry.";
    }
}
