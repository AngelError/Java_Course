package az.coders.ada_students.lessons.projects.geometria;

public class Triangle extends Geometry{
    private final double height;

    public Triangle(double side, double height) {
        super(side);
        this.height = height;
    }

    @Override
    public double findArea() {
        return 0.5 * height * side;
    }

    @Override
    public String toString() {
        return "Triangle{ " +
                "side=" + side +
                ", height=" + height +
                ", area= " + findArea() +
                " }";
    }
}
