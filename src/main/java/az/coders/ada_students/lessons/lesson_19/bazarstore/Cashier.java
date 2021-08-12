package az.coders.ada_students.lessons.lesson_19.bazarstore;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

public class Cashier implements Personal {
    public String getTerminal() {
        return "Terminal#1";
    }

    public String getDate() {
        LocalDateTime now = LocalDateTime.now();
        DateTimeFormatter format = DateTimeFormatter.ofPattern("dd-MM-yyyy HH:mm:ss");
        return now.format(format);
    }

    @Override
    public String name() {
        return "John";
    }

    @Override
    public String surname() {
        return "Smith";
    }

    @Override
    public String toString() {
        return getTerminal() + '\n' + "Cashier " + name() + " " + surname() + '\n' +
                "----------------------------" + '\n'
                + getDate() + '\n' +
                "----------------------------";
    }
}
