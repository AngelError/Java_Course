package az.coders.ada_students.lessons.lesson_15.leetcode.array;

import java.util.Arrays;

public class ShuffledArray {
    public static void main(String[] args) {
        Solution3 solution3 = new Solution3(new int[] {2,5,1,3,4,7}, 3);
        System.out.println(Arrays.toString(solution3.shuffle())); //2,3,5,4,1,7
    }
}

class Solution3 {
    private final int[] nums;
    private int n;

    public Solution3(int[] nums, int n) {
        this.nums = nums;
        this.n = n;
    }

    public int[] shuffle() {
        int[] str = new int[nums.length];
        for (int i = 0; i < nums.length; i++) {
            if(i == 0) str[i] = nums[i];
            else if (i == nums.length-1) str[i] = nums[i];
            else if(i % 2 != 0) {
                str[i] = nums[n];
                n++;
            }
            else
                str[i] = nums[i/2];
        }
        return str;
    }
}