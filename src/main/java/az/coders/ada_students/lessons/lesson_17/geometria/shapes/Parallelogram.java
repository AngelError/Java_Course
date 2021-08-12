package az.coders.ada_students.lessons.lesson_17.geometria.shapes;

import az.coders.ada_students.lessons.lesson_17.geometria.Ability;
import az.coders.ada_students.lessons.lesson_17.geometria.Parameter;

public class Parallelogram extends Parameter implements Ability {
    private final double degree;

    public Parallelogram(double sideOne, double sideTwo, double degree) {
        super(sideOne, sideTwo);
        this.degree = degree;
    }

    @Override
    protected double getPerimeter() {
        return 2 * (sideOne + sideTwo);
    }

    @Override
    protected double getArea() {
        return sideOne * sideTwo * Math.sin(degree);
    }

//    private String getDiagonals() {
//        double d1, d2;
//        d1 = Math.sqrt(Math.pow(sideOne,2) + Math.pow(sideTwo,2) - 2 * sideOne * sideTwo * Math.cos(degree));
//        d2 = Math.sqrt(Math.pow(sideOne,2) + Math.pow(sideTwo,2) - 2 * sideOne * sideTwo * Math.sin(degree));
//        return "First diagonal : " + d1 + ", Second diagonal: " + d2;
//    }


    @Override
    protected double getDiagonal() {
        return Math.sqrt(Math.pow(sideOne,2) + Math.pow(sideTwo,2) - 2 * sideOne * sideTwo * Math.cos(Math.toRadians(degree)));
    }

    private double getSecondDiagonal() {
        return Math.sqrt(Math.pow(sideOne,2) + Math.pow(sideTwo,2) - 2 * sideOne * sideTwo * Math.sin(Math.toRadians(degree)));
    }

    @Override
    public String toString() {
        return "=========> Parallelogram <=========" + '\n' +
                "First side: " + sideOne + '\n' +
                "Second side: " + sideTwo + '\n' +
                "Degree between sides:" + degree + '\n' +
                "Area: " + getArea() + '\n' +
                "Perimeter: " + getPerimeter() + '\n' +
                "First Diagonal: " + getDiagonal() + '\n' +
                "Second Diagonal: " + getSecondDiagonal() + '\n' +
                "More: " + '\n' +
                drawCircleOutside() + ", R= " + getOutsideRadius() + '\n' +
                drawCircleInside() + ", r= " + getInsideRadius() + '\n' +
                checkSymmetry() + '\n';
    }

    @Override
    public String drawCircleInside() {
        return "It is not possible to draw a circle inside the parallelogram.";
    }

    @Override
    public String drawCircleOutside() {
        return "It is not possible to draw a circle outside the parallelogram.";
    }

    @Override
    public double getInsideRadius() {
        return 0;
    }

    @Override
    public double getOutsideRadius() {
        return 0;
    }

    @Override
    public String checkSymmetry() {
        return "Parallelogram has no lines of symmetry.";
    }
}
