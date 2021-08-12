package az.coders.ada_students.lessons.lesson_17.draft;

public class Mercedes extends Car {

    int numberOfCars = 1500;

    public Mercedes(String carName) {
        super(carName);
    }

    @Override
    public String getData() {
        return "There are " + Car.numberOfCars + " cars of 4 different types in the depot!";
    }

    public String getMercedesData() {
        return "There are " + numberOfCars + " Mercedes in the depot!";
    }

    @Override
    public String getColor() {
        return "White";
    }

    @Override
    public String getWheel() {
        return "Wexen";
    }

    @Override
    public int getYear() {
        return 2019;
    }

    @Override
    public String getMotor() {
        return "4.0 l biturbo V8";
    }

    @Override
    public String getUniqueness() {
        return "Mercedes has ... ";
    }

    public String toString() {
        return "Mercedes \n" + "Color : " + getColor() + "\n" +
                "Wheel : " + getWheel() + "\n" +
                "Year : " + getYear() + "\n" +
                "Motor : " + getMotor() + "\n" +
                "More : \n" + getUniqueness() + "\n" +
                getData() + "\n" + getMercedesData();
    }
}
