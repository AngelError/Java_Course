package az.coders.ada_students.lessons.lesson_16;

import java.util.Random;

public class ForEachExample {
    public static void main(String[] args) {
        int[] arrayForI = generateArray(10);
        printWithForI(arrayForI);
        System.out.println();
        int[] arrayForE = generateArray(15);
        printWithForE(arrayForE);
    }

    // the principle of this method is
    // filling array with random numbers
    // length should be 10
    private static int[] generateArray(int length) {
        int[] arr = new int[length];
        Random random = new Random();

        for (int i = 0; i < length; i++) {
            arr[i] = random.nextInt(100);
        }
        return arr;
    }

    private static void printWithForI(int[] arrayForI) {
        System.out.println("Standard ForI method: ");
        for (int i = 0; i < arrayForI.length; i++) {
            System.out.print(arrayForI[i] + " ");
        }
    }

    private static void printWithForE(int[] arrayForE) {
        System.out.println("For-Each method: ");
        for (int i : arrayForE)
            System.out.print(i + " ");
    }
}
