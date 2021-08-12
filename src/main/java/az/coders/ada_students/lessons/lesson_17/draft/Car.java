package az.coders.ada_students.lessons.lesson_17.draft;

public class Car{
    public static final int numberOfCars = 15000;
    String carName;

    public String getData() {
        return "";
    }

    public Car(String carName) {
        this.carName = carName;
    }


    public String getColor() {
        return null;
    }

    public String getWheel() {
        return null;
    }

    public int getYear() {
        return 0;
    }

    public String getMotor() {
        return null;
    }

    public String getUniqueness() {
        return null;
    }

    public String checkCarName() {
        if (carName.equalsIgnoreCase("BMW")) {
            BMW bmw = new BMW(carName);
            return bmw.toString();
        }
        else if (carName.equalsIgnoreCase("Tesla")) {
            Tesla tesla = new Tesla(carName);
            return tesla.toString();
        }
        else if (carName.equalsIgnoreCase("Mercedes")) {
            Mercedes mercedes = new Mercedes(carName);
            return mercedes.toString();
        }
        else if (carName.equalsIgnoreCase("Jeep")) {
            Jeep jeep = new Jeep(carName);
            return jeep.toString();
        }
        else
            return carName + " is not found!";
    }

    @Override
    public String toString() {
        return "Car: " + checkCarName();
    }
}
