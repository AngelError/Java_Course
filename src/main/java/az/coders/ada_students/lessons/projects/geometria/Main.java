package az.coders.ada_students.lessons.projects.geometria;

public class Main {
    public static void main(String[] args) {
        Geometry geometry = new Geometry(10);
        System.out.println(geometry);

        Rectangle rectangle = new Rectangle(geometry.side, 12.5);
        System.out.println(rectangle);

        Triangle triangle = new Triangle(geometry.side, 8);
        System.out.println(triangle);

        Circle circle = new Circle(geometry.side, 120);
        System.out.println(circle);

        Geometry geometry1 = new Circle(geometry.side, 360);
        geometry1.geo();

        Geometry rect = new Rectangle(geometry.side, 12.5);
        System.out.println(rect.findArea());

        rect = new Circle(geometry.side, 120);
        System.out.println(rect.findArea());


    }
}
