package az.coders.ada_students.lessons.lesson_17.car;

public class Car{
    String carName;

    public Car(String carName) {
        this.carName = carName;
    }

    Interface car;

    public String checkCarName() {
        if (carName.equalsIgnoreCase("BMW"))
            car = new BMW();
        else if (carName.equalsIgnoreCase("Tesla"))
            car = new Tesla();
        else if (carName.equalsIgnoreCase("Mercedes"))
            car = new Mercedes();
        else if (carName.equalsIgnoreCase("Jeep"))
            car = new Jeep();
        else
            return carName + " is not found!";
        return car.toString();
    }

    @Override
    public String toString() {
        return "Car: " + checkCarName();
    }
}
