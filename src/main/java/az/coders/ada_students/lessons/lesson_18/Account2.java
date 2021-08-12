//package az.coders.ada_students.lessons.lesson_18;
//
//import java.util.Random;
//
//public class Account2 extends Student{
//    public String user = "";
////    public String mail;
////    public String password;
//
//    public Account2(String name, String surname, int id) {
//        super(name, surname, id);
//    }
//
//    public String getUser() {
//        return user.concat(String.valueOf(getName().charAt(0))).concat(getName()).concat(String.valueOf(id));
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
