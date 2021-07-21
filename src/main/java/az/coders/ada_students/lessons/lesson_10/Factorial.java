package az.coders.ada_students.lessons.lesson_10;

public class Factorial {
    public static void main(String[] args) {
        long factorialNum=1;

        for (int i = 1; i<=10; i++) {
            factorialNum *= i;
        }

        System.out.println(factorialNum);
    }
}
