package az.coders.ada_students.lessons.lesson_18.draft;


import java.util.Random;

public class Account extends Student{

    String user = "";

    public Account(String name, String surname, int id) {
        super(name, surname, id);
    }

    public String getUser() {
        user = user.concat(String.valueOf(name.charAt(0))).concat(surname).concat(String.valueOf(id)).toLowerCase();
        return user;
    }

    public String getMail() {
        return user.concat("@ada.edu.az");
    }
//
    public String getPassword() {
        Random random = new Random();
        return user.concat(String.valueOf(random.nextInt(100)));
    }

    @Override
    public String toString() {
        return "Account is created for " + getName() + " " + getSurname() +"!\n" +
                "user= " + getUser() + '\n' +
                "mail= " + getMail() + '\n' +
                "password= " + getPassword();
    }
}
