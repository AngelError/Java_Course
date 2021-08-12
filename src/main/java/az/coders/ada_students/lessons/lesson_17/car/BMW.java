package az.coders.ada_students.lessons.lesson_17.car;

public class BMW implements Interface{
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
                "More : \n" + getUniqueness();
    }
}
