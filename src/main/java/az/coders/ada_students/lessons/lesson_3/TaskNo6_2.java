package az.coders.ada_students.lessons.lesson_3;
//Capture the numbers between 1000 and 10,000 that
// are equal to the sum of the first two digits and
// the last two digits

public class TaskNo6_2 {
    public static void main(String[] args) {

        for(int num = 1000; num <= 10000; num++) {
            int first = num / 1000;
            int second = num / 100 % 10;
            int third = num % 100 / 10;
            int fourth = num % 10;

            if ((first + second) == (third + fourth)) System.out.println(num);
        }
    }
}
