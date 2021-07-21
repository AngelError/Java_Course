package az.coders.ada_students.lessons.exercises.recursion;

import java.util.Scanner;

public class CountPairs {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String str = scanner.next();

        System.out.println(countPairs(str));
    }

    public static int countPairs(String str) {
        int cnt = 0;
        if (str.equals(""))
            return 0;
        else if (str.length() < 3)
            return 0;
        else {
            if (str.substring(0,1).equals(str.substring(2,3))) {
                cnt += 1;
                return cnt + countPairs(str.substring(1));
            }
            else
                return countPairs(str.substring(1));
        }

    }
}

