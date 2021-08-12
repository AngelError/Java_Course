package az.coders.ada_students.lessons.lesson_15.leetcode.array;

import java.util.Arrays;

public class Concatenation {
    public static void main(String[] args) {
        Solution1 solution1 = new Solution1(new int[] {1,2,3});
            System.out.println(Arrays.toString(solution1.getConcatenation()));
    }
}

class Solution1 {
    private int[] str;

    public Solution1(int[] str) {
        this.str = str;
    }

    public int[] getConcatenation() {
        int [] ints = new int[2 * str.length];
        int k = 0;

        for (int i = 0; i < 2; i++) {
            for (int j = 0; j < str.length; j++) {
                ints[k] = str[j];
                k++;
            }
        }
        return ints;
    }
}
