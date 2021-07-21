package az.coders.ada_students.lessons.lesson_13.eolimp;

public class ForCalculating {
    // area per
    int a;
    int b;
    int p;
    int area;

    double r;

    double x1, x2, x3, y1, y2, y3;

    public void getPerimeterOfRectangle(int a, int b) {
//        ForCalculating z = new ForCalculating();
        this.a = 2 * (a + b);
        System.out.println("Perimeter of rectangle is " + this.a);
    }

    public void getAreaOfRectangle(int a, int b) {
        area = a * b;
        System.out.println("Area of Rectangle is " + area);
    }

    public void getAreaOfCircle(double r) {
        System.out.println(Math.PI * Math.pow(r,2));
    }

    public void getLengthOfCircle(double r) {
        System.out.println(2 * Math.PI * r);
    }

    public void getAreaOfSquare(int a) {
        System.out.print("Area is " + (int)Math.pow(a,2));
    }

    public void getPerimeterOfSquare(int a) {
        System.out.println(", and perimeter is " + 4 * a + ".");
    }

    private void getPerimeterOfTriangle(double x1, double y1, double x2, double y2, double x3, double y3) {
        double first, second, third;

        first = Math.sqrt(Math.pow((x2 - x1), 2)) + Math.sqrt(Math.pow((y2 - y1), 2));
        second = Math.sqrt(Math.pow((x3 - x2), 2)) + Math.sqrt(Math.pow((y3 - y2), 2));
        third = Math.sqrt(Math.pow((x3 - x1), 2)) + Math.sqrt(Math.pow((y3 - y1), 2));

        System.out.println("Perimeter of Triangle is " + (first + second + third));

    }

    public void getAreaOfTriangle() {

    }

    public void useHeron(double x1, double y1, double x2, double y2, double z) {
        double first, second, F, S;

        first = (x1 + y1 + z) / 2;
            F = Math.sqrt(first * (first - x1) * (first - y1) * (first - z));

        second = (x2 + y2 + z) / 2;
            S = Math.sqrt(second * (second - x2) * (second - y2) * (second - z));

        System.out.println("Area of Rectangle with Heron is " + (F + S));
    }



}
