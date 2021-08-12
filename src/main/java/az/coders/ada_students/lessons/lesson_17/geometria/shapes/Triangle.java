package az.coders.ada_students.lessons.lesson_17.geometria.shapes;

import az.coders.ada_students.lessons.lesson_17.geometria.Ability;
import az.coders.ada_students.lessons.lesson_17.geometria.Parameter;
import az.coders.ada_students.lessons.projects.draft.Type;

public class Triangle extends Parameter implements Ability {

    private double p;

    public Triangle(double sideOne, double sideTwo, double sideThree) {
        super(sideOne, sideTwo, sideThree);
    }

    @Override
    protected double getPerimeter() {
        return sideOne + sideTwo + sideThree;
    }

    @Override
    protected double getArea() {
        p = getPerimeter() / 2;
        return Math.sqrt(p * (p-sideOne) * (p-sideTwo) * (p-sideThree));
    }

    @Override
    protected double getGreatSide() {
        return Math.max(sideOne, Math.max(sideTwo, sideThree));
    }

    private String checkAngle() {
        if(2 * Math.pow(getGreatSide(),2) == (Math.pow(sideOne,2) + Math.pow(sideTwo,2) + Math.pow(sideThree,2))) {
            return "Right Triangle!";
        }
        else if(2 * Math.pow(getGreatSide(),2) > (Math.pow(sideOne,2) + Math.pow(sideTwo,2) + Math.pow(sideThree,2))) {
            return "Obtuse Triangle!";
        }
        else
            return "Acute Triangle!";
    }

    private String checkType() {
        if(sideOne == sideTwo && sideOne == sideThree)
            return "Equivalent Triangle";
        else if (sideOne != sideTwo && sideOne != sideThree && sideTwo != sideThree)
            return "Scalene Triangle";
        else
            return "Isosceles Triangle";
    }

    @Override
    public String toString() {
        return "=========>   Triangle   <=========" + '\n' +
                "First side: " + sideOne + '\n' +
                "Second side: " + sideTwo + '\n' +
                "Third side: " + sideThree + '\n' +
                "Area: " + getArea() + '\n' +
                "Perimeter: " + getPerimeter() + '\n' +
                "Type by side: " + checkType() + '\n' +
                "Type by angle: " + checkAngle() + '\n' +
                "More: " + '\n' +
                drawCircleOutside() + ", R= " + getOutsideRadius() + '\n' +
                drawCircleInside() + ", r= " + getInsideRadius() + '\n' +
                checkSymmetry() + '\n';
    }

    @Override
    public String drawCircleInside() {
        return "It is possible to draw a circle inside all types of triangles.";
    }

    @Override
    public String drawCircleOutside() {
        return "It is possible to draw a circle outside all types of triangles.";
    }

    @Override
    public double getInsideRadius() {
        return getArea() / (getPerimeter() / 2);
    }

    @Override
    public double getOutsideRadius() {
        return (sideOne * sideTwo * sideThree) / (4 * getArea());
    }

    @Override
    public String checkSymmetry() {
        if(checkType().contains("Equivalent"))
            return checkType() + " has three lines of symmetry.";
        else if (checkType().contains("Scalene"))
            return checkType() + " has no line of symmetry.";
        else
            return checkType() + " has two lines of symmetry" ;
    }
}
