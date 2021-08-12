package az.coders.ada_students.lessons.lesson_17.geometria;

public class Parameter {
    protected double sideOne;
    protected double sideTwo;
    protected double sideThree;

    // for Square
    public Parameter(double sideOne) {
        this.sideOne = sideOne;
    }

    // for rectangle
    public Parameter(double sideOne, double sideTwo) {
        this.sideOne = sideOne;
        this.sideTwo = sideTwo;
    }

    // for all types of triangle
    public Parameter(double sideOne, double sideTwo, double sideThree) {
        this.sideOne = sideOne;
        this.sideTwo = sideTwo;
        this.sideThree = sideThree;
    }

    public double getSideOne() {
        return sideOne;
    }

    public void setSideOne(double sideOne) {
        this.sideOne = sideOne;
    }

    public double getSideTwo() {
        return sideTwo;
    }

    public void setSideTwo(double sideTwo) {
        this.sideTwo = sideTwo;
    }

    public double getSideThree() {
        return sideThree;
    }

    public void setSideThree(double sideThree) {
        this.sideThree = sideThree;
    }

    protected double getPerimeter() {
        return 0.0;
    }

    protected double getArea() {
        return 0.0;
    }

    protected double getDiagonal() {
        return 0.0;
    }

    protected double getGreatSide() {
        return 0.0;
    }
}
