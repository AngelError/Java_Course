package az.coders.ada_students.lessons.lesson_17.assignment.geometry;

public class Point {
    float x;
    float y;

    Point p;

    public Point(float x, float y) {
        this.x = x;
        this.y = y;
    }

    public Point() {
    }

    public float getX() {
        return x;
    }

    public float getY() {
        return y;
    }

    void translate(float dX, float dY) {
        this.x = dX;
        this.y = dY;
    }

    Point distance(Point p) {
        return p;
    }

//    static double distance(Point p1, Point p2) {
//
//    }

    int inWhichQuadrant() {
        if (x > 0 && y > 0) return 1;
        else if (x > 0 && y < 0) return 4;
        else if (x < 0 && y > 0) return 2;
        else if (x < 0 && y < 0) return 3;
        else return 0;
    }

    static int inWhichQuadrant(Point p) {
        if (p.x > 0 && p.y > 0) return 1;
        else if (p.x > 0 && p.y < 0) return 4;
        else if (p.x < 0 && p.y > 0) return 2;
        else if (p.x < 0 && p.y < 0) return 3;
        else return 0;
    }

    @Override
    public String toString() {
        return "Point{" +
                "x=" + x +
                ", y=" + y +
                '}';
    }

//    boolean equals(Point p) {
//
//    }
}
