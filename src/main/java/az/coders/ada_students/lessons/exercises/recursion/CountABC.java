package az.coders.ada_students.lessons.exercises.recursion;

import java.util.Scanner;

public class CountABC {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String str = scanner.next();

        System.out.println();
    }
    public static int countAbc(String str) {

        if (str.length() > 2) {
            if (str.substring(0,3).equals("abc")){
                return 1 + countAbc(str.substring(1));
            }
            else if(str.substring(0,3).equals("aba")) {
                return 1 + countAbc(str.substring(1));
            }
            else
                countAbc(str.substring(1));
        }
        return 0;
    }
}
