package az.coders.ada_students.lessons.projects.draft;

public class Perimeter extends Side{


    public Perimeter(Side side) {
        super(side.sideOne, side.sideTwo, side.sideThree);
    }

    public double findPerimeter() {
        return getSideOne() + getSideTwo() + getSideThree();
    }



}
