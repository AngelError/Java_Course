package az.coders.ada_students.lessons.lesson_19.example;

import java.util.Scanner;

enum Directions{
    NORTH(1),
    SOUTH(2),
    EAST(3),
    WEST(4);

    public int n;

    Directions(int n) {
        this.n = n;
    }
}

public class StringToEnum {

        public static void main(String[] args) {
            StringToEnum ste = new StringToEnum();
            Scanner sc = new Scanner(System.in);
            String str;
            System.out.println("Enter string ");
            str = sc.nextLine();
            convert(str);

        }

        public static void convert(String str)
        {
            int dr = Directions.valueOf(str.toUpperCase()).n;
            System.out.println("The corresponding enum constant is " +dr);

        }
    }
