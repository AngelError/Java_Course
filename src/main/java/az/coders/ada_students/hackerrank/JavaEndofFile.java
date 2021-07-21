package az.coders.ada_students.hackerrank;

import java.util.Scanner;

public class JavaEndofFile {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int i = 1;
        while (scan.hasNextLine()) {
            String str = scan.nextLine();
            System.out.println(i + " " + str);
            i++;
        }
    }
}
