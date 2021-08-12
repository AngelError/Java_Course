package az.coders.ada_students.lessons.projects.geometria;

public class Geometry {
    public double side;

    public Geometry(double side) {
        this.side = side;
    }

    public double getSide() {
        return side;
    }

    public void setSide(double side) {
        this.side = side;
    }

    public double findArea() {
        return 0;
    }


    public void geo() {
        System.out.println("djjddkd");
    }

    @Override
    public String toString() {
        return "Geometry{ " +
                "side=" + side +
                " }";
    }
}
