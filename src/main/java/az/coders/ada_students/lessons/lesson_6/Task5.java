package az.coders.ada_students.lessons.lesson_6;

import java.util.Scanner;

public class Task5 {
    public static void main(String[] args) {
        System.out.println("Please enter the password:");

        Scanner scan = new Scanner(System.in);
        String str = scan.nextLine();

        int cnt = 0, cntt = 0, i = 0;

        Message_1(str);

        for (i = 0; i < str.length(); i++) {
            CNT(str,i,cnt);
            CNTT(str,i,cnt);
        }

        if (CNT(str,i,cnt)== 0 || CNTT(str,i,cnt) == 0)
            System.out.println("A password consists of only letters and digits.");

        if (CNT(str,i,cnt) <= 2)
            System.out.println("A password must contain at least two digits.");
    }

    public static void Message_1(String str) {
        if (str.length() <= 10)
            System.out.println("A password must have at least ten characters.");
    }

    public static int CNT(String str, int i, int cnt) {
        if (Character.isDigit(str.charAt(i)))
            cnt++;
        return cnt;
    }

    public static int CNTT(String str, int i, int cntt) {
        if (Character.isUpperCase(str.charAt(i)) || Character.isLowerCase(str.charAt(i))) {
            cntt++;
        }
        return cntt;
    }

}


