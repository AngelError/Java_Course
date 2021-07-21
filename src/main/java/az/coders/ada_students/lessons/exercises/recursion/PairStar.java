package az.coders.ada_students.lessons.exercises.recursion;

import java.util.Scanner;

public class PairStar {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String str = scanner.next();

        System.out.println(pairStar(str));
    }

    public static String pairStar(String str) {
        if (str.equals(""))
            return str;
        else if (str.length() == 1)
            return str;
        else {
            if (str.substring(0,1).equals(str.substring(1,2))) {
                return str.substring(0,1) + '*' + pairStar(str.substring(1));
            }
            else
                return str.substring(0,1) + pairStar(str.substring(1));
        }

    }
}
