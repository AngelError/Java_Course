package az.coders.ada_students.lessons.lesson_17.car;

public class Mercedes implements Interface {
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
                "More : \n" + getUniqueness();
    }
}
