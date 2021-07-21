package az.coders.ada_students.hackerrank;

import java.util.Scanner;

public class JavaStringReverse {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String str = scanner.next();

        StringBuilder reverse = new StringBuilder();
        String clean = str.replaceAll("\\s+", "").toLowerCase();
        char[] plain = clean.toCharArray();
        for (int i = plain.length - 1; i >= 0; i--) {
            reverse.append(plain[i]);
        }
        if((reverse.toString()).equals(clean))
        System.out.println("Yes");
        else System.out.println("No");

    }
}
