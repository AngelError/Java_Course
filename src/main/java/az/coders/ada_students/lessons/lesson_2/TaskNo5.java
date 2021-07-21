package az.coders.ada_students.lessons.lesson_2;

import java.util.Scanner;

public class TaskNo5 {
    public static void main(String[] args) {
        Scanner alpha = new Scanner(System.in);

        System.out.println("Input an alphabet: ");
        char Alp = alpha.next().charAt(0);
        Message(Alp);
    }

    public static void Message(char Alp) {
        if((Alp >= 'a' && Alp <= 'z') || (Alp >= 'A' && Alp <= 'Z')) {
            if (Alp == 'a' || Alp == 'e' || Alp == 'i' || Alp == 'o' || Alp == 'u'
                    || Alp == 'A' || Alp == 'E' || Alp == 'I' || Alp == 'O' || Alp == 'U')
                System.out.println("Input letter is vowel");
            else
                System.out.println("Input letter is consonant");
        }
        else
            System.out.println("Error");
    }

}