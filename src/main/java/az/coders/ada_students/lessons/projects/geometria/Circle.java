package az.coders.ada_students.lessons.projects.geometria;

public class Circle extends Geometry{
    private final double rotate;

    public Circle(double side, double rotate) {
        super(side);
        this.rotate = rotate;
    }

    @Override
    public double findArea() {
        return Math.PI * Math.pow(side,2);
    }

    private double findSector() {
        return findArea() * rotate / 360;
    }

    public void geo() {
        System.out.println("lslsls");
    }

    @Override
    public String toString() {
        return "Circle{ " +
                "rotate=" + rotate +
                ", side=" + side +
                ", area=" + findArea() +
                ", area of a Sector=" + findSector() +
                " }";
    }
}
