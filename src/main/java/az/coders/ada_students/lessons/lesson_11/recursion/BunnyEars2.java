package az.coders.ada_students.lessons.lesson_11.recursion;

import java.util.Scanner;

public class BunnyEars2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int bunnies = scanner.nextInt();
        System.out.println(bunnyEars2(bunnies));
    }

    public static int bunnyEars2(int bunnies) {
        int ears = 0;
        if(bunnies != 0) {
            if (bunnies % 2 == 0) {
                ears = 3 + bunnyEars2(bunnies-1);;
            } else {
                ears = 2 + bunnyEars2(bunnies-1);;
            }
        }
        return ears;
    }
}
