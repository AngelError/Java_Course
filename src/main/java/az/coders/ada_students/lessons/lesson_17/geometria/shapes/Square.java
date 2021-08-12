package az.coders.ada_students.lessons.lesson_17.geometria.shapes;

import az.coders.ada_students.lessons.lesson_17.geometria.Ability;
import az.coders.ada_students.lessons.lesson_17.geometria.Parameter;

public class Square extends Parameter implements Ability {

    public Square(double sideOne) {
        super(sideOne);
    }

    @Override
    protected double getArea() {
        return Math.pow(sideOne, 2);
    }

    @Override
    protected double getPerimeter() {
        return 4 * sideOne;
    }

    @Override
    protected double getDiagonal() {
        return Math.sqrt(2) * sideOne;
    }

    @Override
    public String toString() {
        return "=========>    Square    <=========" + '\n' +
                "Side: " + sideOne + '\n' +
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
        return "It is possible to draw a circle inside all squares.";
    }

    @Override
    public String drawCircleOutside() {
        return "It is possible to draw a circle outside all squares.";
    }

    @Override
    public double getInsideRadius() {
        return sideOne / 2;
    }

    @Override
    public double getOutsideRadius() {
        return getDiagonal() / 2;
    }

    @Override
    public String checkSymmetry() {
        return "Square has four lines of symmetry.";
    }
}
