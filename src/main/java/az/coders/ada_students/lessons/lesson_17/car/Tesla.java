package az.coders.ada_students.lessons.lesson_17.car;

public class Tesla implements Interface{
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
                "More : \n" + getUniqueness();
    }
}
