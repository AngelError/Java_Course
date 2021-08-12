package az.coders.ada_students.lessons.projects.draft;

public class Area extends Perimeter{

    public Area(Side side) {
        super(side);
    }

    public double findArea() {
        double p = findPerimeter() / 2;
        return Math.sqrt(p * (p-sideOne) * (p-sideTwo) * (p-sideThree));
    }

    @Override
    public String toString() {
        return "Area is equal to " +  findArea();
    }
}
