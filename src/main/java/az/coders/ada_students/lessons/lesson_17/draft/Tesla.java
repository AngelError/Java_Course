package az.coders.ada_students.lessons.lesson_17.draft;

public class Tesla extends Car {

    int numberOfCars = 2500;

    public Tesla(String carName) {
        super(carName);
    }

    @Override
    public String getData() {
        return "There are " + Car.numberOfCars + " cars of 4 different types in the depot!";
    }

    public String getTeslaData() {
        return "There are " + numberOfCars + " Tesla in the depot!";
    }

    @Override
    public String getColor() {
        return "Bot";
    }

    @Override
    public String getWheel() {
        return "Riken";
    }

    @Override
    public int getYear() {
        return 2018;
    }

    @Override
    public String getMotor() {
        return "503 hp@6.1502pm (375 km)";
    }

    @Override
    public String getUniqueness() {
        return "Tesla has ... ";
    }

    @Override
    public String toString() {
        return "Tesla \n" + "Color : " + getColor() + "\n" +
                "Wheel : " + getWheel() + "\n" +
                "Year : " + getYear() + "\n" +
                "Motor : " + getMotor() + "\n" +
                "More : \n" + getUniqueness() + "\n" +
                getData() + "\n" + getTeslaData();
    }
}
