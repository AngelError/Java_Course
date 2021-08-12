package az.coders.ada_students.lessons.lesson_17.draft;

public class Jeep extends Car {

    int numberOfCars = 3000;

    public Jeep(String carName) {
        super(carName);
    }

    @Override
    public String getData() {
        return "There are " + Car.numberOfCars + " cars of 4 different types in the depot!";
    }

    public String getJeepData() {
        return "There are " + numberOfCars + " Jeep in the depot!";
    }

    @Override
    public String getColor() {
        return "Blue";
    }

    @Override
    public String getWheel() {
        return "Marshal";
    }

    @Override
    public int getYear() {
        return 2015;
    }

    @Override
    public String getMotor() {
        return "3.0 l V6 diesel";
    }

    @Override
    public String getUniqueness() {
        return "Jeep has ...";
    }

    @Override
    public String toString() {
        return "Jeep \n" + "Color : " + getColor() + "\n" +
                "Wheel : " + getWheel() + "\n" +
                "Year : " + getYear() + "\n" +
                "Motor : " + getMotor() + "\n" +
                "More : \n" + getUniqueness() + "\n" +
                getData() + "\n" + getJeepData();
    }
}
