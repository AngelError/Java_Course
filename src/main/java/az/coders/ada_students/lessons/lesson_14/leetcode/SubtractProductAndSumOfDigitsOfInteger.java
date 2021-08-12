package az.coders.ada_students.lessons.lesson_14.leetcode;

import java.util.Scanner;

public class SubtractProductAndSumOfDigitsOfInteger {

    int n;

    public static void main(String[] args) {

        Solution1 solution = new Solution1(234);

        System.out.println(solution.subtractProductAndSum());

    }
}

class Solution1 {

    private int num;

    public Solution1(int n ) {
        this.num = n;
    }

    public int subtractProductAndSum() {
        int multiplication = 1;
        int sum = 0;
        while (num != 0) {
            multiplication *= num%10;
            sum += num%10;
            num /= 10;
        }
        return (multiplication - sum);
    }
}
