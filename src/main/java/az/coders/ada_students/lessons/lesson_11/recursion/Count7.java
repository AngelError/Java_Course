package az.coders.ada_students.lessons.lesson_11.recursion;

//        count7(717) → 2
//        count7(7) → 1
//        count7(123) → 0

import java.util.Scanner;

public class Count7 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        System.out.println(count7(n));
    }

    public static int count7(int n){
        int cnt = 0;
        if(n < 0) return 0;

        if(n > 0) {
            if(n % 10 == 7) {
                cnt = 1 + count7(n / 10);
            } else cnt = count7(n / 10);

        }
        return cnt;
    }

}
