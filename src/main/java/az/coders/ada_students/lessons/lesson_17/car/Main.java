package az.coders.ada_students.lessons.lesson_17.car;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter the type of Car for searching:");
        String carName = scanner.next();

        Car car = new Car(carName);
        System.out.println(car);
    }
}
