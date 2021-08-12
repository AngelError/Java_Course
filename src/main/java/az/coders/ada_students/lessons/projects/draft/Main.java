package az.coders.ada_students.lessons.projects.draft;

public class Main {
    public static void main(String[] args) {
        Side sides = new Side(3, 5, 4);

        System.out.println(sides);

        Perimeter perimeter = new Perimeter(sides);
        System.out.println(perimeter.findPerimeter());

        Type types = new Type(sides);
        System.out.println(types.findGreatestSide());
        System.out.println(types.checkTriangle());

        Perimeter area = new Area(sides);
        System.out.println(area);
    }
}
