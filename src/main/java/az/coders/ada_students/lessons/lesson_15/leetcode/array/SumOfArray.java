package az.coders.ada_students.lessons.lesson_15.leetcode.array;

import java.util.Arrays;

public class SumOfArray {
    public static void main(String[] args) {
        Solution2 solution2 = new Solution2(new int[] {1,2,3,4});
        System.out.println(Arrays.toString(solution2.runningSum()));
    }
}

class Solution2 {
    private int[] nums;

    public Solution2(int[] nums) {
        this.nums = nums;
    }

    public int[] runningSum() {
        int l = nums.length, i = 1;
        for (i = 1; i < l; i++)
            nums[i] += nums[i-1];
        return nums;
    }
}
