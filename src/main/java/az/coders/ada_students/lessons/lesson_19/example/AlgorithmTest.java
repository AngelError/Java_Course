package az.coders.ada_students.lessons.lesson_19.example;

import java.util.Scanner;

public class AlgorithmTest {
        //the Algorithm Class
        enum Algorithm
        {
            monkey, elephant, lion, tiger
        }

        public  static void main(String a[])
        {
            Scanner sc = new Scanner(System.in);
            for (Algorithm algo : Algorithm.values())
                System.out.println(algo);
            while(true)
                // read strings from Scanner - display Algorithm value or throw exception
                try
                {
                    System.out.print ("enter value ? ");
                    System.out.println(" algorithm value " + Algorithm.valueOf(sc.next()));
                }
                catch (IllegalArgumentException m)
                { System.out.println("  Error: " + m);
                }
        }
    }
