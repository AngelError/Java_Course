package az.coders.ada_students.lessons.projects.draft;

public class Type extends Side {
    double greatest;

    public Type(Side side) {
        super(side.sideOne, side.sideTwo, side.sideThree);
    }

    public double findGreatestSide() {
        greatest = Math.max((Math.max(sideOne, sideTwo)), sideThree);
        return greatest;
    }

    public String checkTriangle() {
        if(2 * Math.pow(greatest,2) == (Math.pow(sideOne,2) + Math.pow(sideTwo,2) + Math.pow(sideThree,2))) {
            return "It is Right Triangle!";
        }
        else if(2 * Math.pow(greatest,2) > (Math.pow(sideOne,2) + Math.pow(sideTwo,2) + Math.pow(sideThree,2))) {
            return "It is Obtuse Triangle!";
        }
        else
            return "It is Acute Triangle!";
    }
}
