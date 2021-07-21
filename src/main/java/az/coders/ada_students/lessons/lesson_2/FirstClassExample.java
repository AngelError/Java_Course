package az.coders.ada_students.lessons.lesson_2;

public class FirstClassExample {
    public static void main(String[] args) { //esas giriş java üçün

        Hello1();
        Hello2();
        System.out.println(Hello2());
        HellO3();
        System.out.println(HellO3());
    }

    public static void Hello1() {
        System.out.println("* Hello ADA Students");
    }

    public static String Hello2() {
        return "** Hello ADA Students";
    }

    public static String HellO3() {
        String str = "*** Hello ADA Students";
        return str;
    }
}

