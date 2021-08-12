package az.coders.ada_students.lessons.projects.geometria;

public class Rectangle extends Geometry{
    private final double diagonal;

    public Rectangle(double side, double diagonal) {
        super(side);
        this.diagonal = diagonal;
    }

    private double getSecondSide() {
        return Math.sqrt(Math.pow(diagonal,2) - Math.pow(side,2));
    }

    @Override
    public double findArea() {
        return getSecondSide() * side;
    }

    //this angle is located between diagonals
    private double findAngle() {
        return Math.asin(2 * findArea() / Math.pow(diagonal,2));
    }

    @Override
    public String toString() {
        return "Rectangle{ " +
                "side=" + side +
                ", diagonal=" + diagonal +
                ", other side= " + getSecondSide() +
                ", area= " + findArea() +
                ", angle between diagonals= " + findAngle() +
                " }";
    }
}
