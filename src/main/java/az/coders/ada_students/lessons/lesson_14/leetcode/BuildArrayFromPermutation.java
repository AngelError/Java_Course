package az.coders.ada_students.lessons.lesson_14.leetcode;

import java.util.Scanner;

public class BuildArrayFromPermutation {
    public static void main(String[] args) {

        Solution6 solution6 = new Solution6(new int[]{0, 2, 1, 5, 3, 4});
        for (int i = 0; i < 6; i++) {
            System.out.println(solution6.buildArray()[i]);
        }
    }
}

class Solution6 {

    private final int[] arr;

    public Solution6(int[] arr) {
        this.arr = arr;
    }

    public int[] buildArray() {
        int[] ans = new int[arr.length];
        for (int i = 0; i < arr.length; i++) {
            ans[i] = arr[arr[i]];
        }
        return ans;
    }
}
