package az.coders.ada_students.lessons.lesson_17.draft;

public class BMW extends Car {

    int numberOfCars = 8000;

    public BMW(String carName) {
        super(carName);
    }

    @Override
    public String getData() {
        return "There are " + Car.numberOfCars + " cars of 4 different types in the depot!";
    }

    public String getBMWData() {
        return "There are " + numberOfCars + " BMW in the depot!";
    }

    @Override
    public String getColor() {
        return "Black";
    }

    @Override
    public String getWheel() {
        return "Lassa";
    }

    @Override
    public int getYear() {
        return 2021;
    }

    @Override
    public String getMotor() {
        return "4.4V8 twin turbo ";
    }

    @Override
    public String getUniqueness() {
        return "BMW has ... ";
    }

    @Override
    public String toString() {
        return "BMW \n" + "Color : " + getColor() + "\n" +
                "Wheel : " + getWheel() + "\n" +
                "Year : " + getYear() + "\n" +
                "Motor : " + getMotor() + "\n" +
                "More : \n" + getUniqueness() + "\n" +
                getData() + "\n" + getBMWData();
    }
}
