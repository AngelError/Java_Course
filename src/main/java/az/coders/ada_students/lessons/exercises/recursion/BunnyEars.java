package az.coders.ada_students.lessons.exercises.recursion;


import java.util.Scanner;

public class BunnyEars {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int bunnies = scanner.nextInt();
        System.out.println(bunnyEars(bunnies));
    }

    public static int bunnyEars(int bunnies) {
        int ears = 0;
        if (bunnies != 0) {
                ears = 2 + bunnyEars(bunnies - 1);

        }
        return ears;
    }
}


