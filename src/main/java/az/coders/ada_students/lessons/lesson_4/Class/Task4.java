package az.coders.ada_students.lessons.lesson_4.Class;
//Write a program in Java to display the first 10 natural numbers. Go to the editor

public class Task4 {
    public static void main(String[] args) {

        System.out.println("The First 10 Natural Numbers:");
        Numbers();
    }

    public static void Numbers() {
        for (int i = 1; i <= 10; i++)
            System.out.println(i);
    }
}
