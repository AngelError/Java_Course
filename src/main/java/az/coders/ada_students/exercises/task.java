package az.coders.ada_students.exercises;

import java.util.Scanner;

public class task {
    public static void main(String[] args) {
        Scanner alpha = new Scanner(System.in);

        System.out.println("Input an alphabet: ");
        char Alp = alpha.next().charAt(0);

        if (Alp == '1' || Alp == '2' || Alp == '3' || Alp == '4') System.out.println("Suspenso");
        else if (Alp == '5') System.out.println("Aprobado");
        else if (Alp == '6') System.out.print("Bien");
        else if (Alp == '7' || Alp == '8') System.out.print("Notable");
        else if (Alp == '9') System.out.print("Sobresaliente");
        else if ((Alp >= 'a' && Alp <= 'z') || (Alp >= 'A' && Alp <= 'Z')) {
            if (Alp == 'a' || Alp == 'e' || Alp == 'i' || Alp == 'o' || Alp == 'u')
                System.out.println("Input letter is vowel");
            else
                System.out.println("Input letter is consonant");
        }
        else
            System.out.println("Error");
    }
}
