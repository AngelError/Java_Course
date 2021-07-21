package az.coders.ada_students.lessons.exercises.recursion;

import java.util.Scanner;

public class Count11 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String str = scanner.next();
        System.out.println(count11(str));
    }

    public static int count11(String str){
        int cnt = 0;
        if (str.length() >= 2) {
            if (str.substring(0,2).equals("11")) {
                cnt += 1;
                return cnt + count11(str.substring(2));
            }
            else
                return count11(str.substring(1));
        }
        return 0;
    }

}

