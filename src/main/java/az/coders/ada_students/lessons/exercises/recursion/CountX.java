package az.coders.ada_students.lessons.exercises.recursion;

import java.util.Scanner;

//Given a string, compute recursively (no loops) the number of lowercase 'x' chars in the string.
//
//
//        countX("xxhixx") → 4
//        countX("xhixhix") → 3
//        countX("hi") → 0

public class CountX {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String str = scanner.nextLine();
        System.out.println(countX(str));
    }

    public static int countX(String str) {
        int cnt = 0;
        int length = str.length();
        if(length != 0) {
            if (str.charAt(0) == 'x') {
                length -= 1;
                return (cnt + 1) + countX(str.substring(1));
            } else{
                length -= 1;
                return countX(str.substring(1));
            }
        }
        return cnt;
    }

}

