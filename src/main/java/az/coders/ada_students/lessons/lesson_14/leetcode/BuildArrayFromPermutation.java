package az.coders.ada_students.lessons.lesson_14.leetcode;

import java.util.Scanner;

public class BuildArrayFromPermutation {
    public static void main(String[] args) {
        int[] nums = {0, 2, 1, 5, 3, 4};
        Solution6 solution6 = new Solution6();
        for (int i = 0; i < nums.length; i++) {
            System.out.println(solution6.buildArray(nums));
        }
    }
}

class Solution6 {
    public int[] buildArray(int[] nums) {
        int[] ans = new int[nums.length];
        for (int i = 0; i < nums.length ; i++) {
            ans[i] = nums[nums[i]];
        }
        return ans;
    }
}
