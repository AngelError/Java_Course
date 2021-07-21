package az.coders.ada_students.lessons.lesson_2;

import java.util.Scanner;

public class TaskNo4 {
        /*
    With the help of java.util.Random the program makes a random number in a range [0-100] and invites the player through a console to enter the name which is saved in the variable name.
    Before the beginning, show up given text on screen: Let the game begin!.
    The whole process of the game is processed in an infinite cycle.
    The player is invited to enter the number in the console, after which the program compares the hidden number with the fact that the user has entered.
    If the entered number is less than a random number which the program has generated, you should to display the text: Your number is too small. Please, try again.. If the entered number is more than the number which the program has generated, you should display the text: Your number is too big. Please, try again..
    If the entered number is equal to the number which the program has generated, it is necessary to display the text on the screen: Congratulations, {name}!.
     */
        public static void main(String[] args) {
            int max = 100;                                                             // according to the instruction
            int min = 0;
                                    // for calculating random number

            Scanner taskNo4 = new Scanner(System.in);                                  // scanning user number

            System.out.println("Let the game begin!");                                  // according to the instruction
            System.out.println("Enter Your Number: ");

            while (taskNo4.hasNextByte()) {
                byte number = taskNo4.nextByte();

                if (number == RandomNum(max,min)) {
                    Output1();
                    break;
                }
                else {
                    if(number > RandomNum(max,min)) {
                        Output2();
                    }
                    else if (number < RandomNum(max,min)){
                        Output3();
                    }
                    Output4();
                }
            }
        }

        public static byte RandomNum(int max, int min) {
            byte difference = (byte) (max - min);
            byte randomNumber = (byte) Math.floor(Math.random() * (difference + 1) + min);
            return randomNumber;
        }

        public static void Output1() {
            System.out.println("Congratulations, Nabat!");
        }

        public static void Output2() {
            System.out.println("Your number is too big. Please, try again!");
        }

        public static void Output3() {
            System.out.println("Your number is too small. Please, try again!");
        }

        public static void Output4() {
            System.out.println("Enter Your New Number:");
        }
    }

