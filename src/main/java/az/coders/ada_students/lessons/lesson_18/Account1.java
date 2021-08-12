//package az.coders.ada_students.lessons.lesson_18;
//
//import java.util.Random;
//
//public class Account1 {
//    public String user = "";
//    public String mail;
//    public String password;
//
//    Student student = new Student("Nadir", "Jabbarli", 12123);
//
////    public Account(String name, String surname, int id) {
////        super(name, surname, id);
////    }
//
//    public String getUser() {
//        return user.concat(String.valueOf(student.getName().charAt(0))).concat(student.getName()).concat(String.valueOf(student.id));
//    }
//
//    public String getMail() {
//        return getUser().concat("@ada.edu.az");
//    }
//
//    public String getPassword() {
//        Random random = new Random();
//        return getUser().concat(String.valueOf(random.nextInt(100)));
//    }
//
//    @Override
//    public String toString() {
//        return "Account" + '\n' +
//                "user= " + getUser() + '\n' +
//                "mail= " + getMail() + '\n' +
//                "password= " + getPassword();
//    }
//}
