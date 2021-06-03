package az.coders.ada_students.lessons.lesson_2;

import java.util.Scanner;

public class TaskNo5_2 {
        public static void main(String[] args) {
            Scanner num = new Scanner(System.in);

            System.out.println("Input an number: ");
            int Alp = num.nextInt();

            if (Alp == 1 || Alp == 2 || Alp == 3 || Alp == 4 || Alp == 15)
                System.out.println("SUSpenso");
            else if (Alp == 7 || Alp == 8)
                System.out.print("Notable");
            else if (Alp == 9 || Alp == 10)
                System.out.print("Sobresaliente");

            switch (Alp) {
                case 5:
                    System.out.println("Aprobado");
                case 6:
                    System.out.print("Bien");
            }
        }
}
