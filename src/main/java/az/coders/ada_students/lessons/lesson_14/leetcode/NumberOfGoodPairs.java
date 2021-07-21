package az.coders.ada_students.lessons.lesson_14.leetcode;

import java.util.Scanner;

public class NumberOfGoodPairs {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        Solutions solution = new Solutions();

        int[] nums = {1, 2, 3, 1, 1, 3};
        System.out.println(solution.numIdenticalPairs(nums));
    }
}

class Solutions {
    public int numIdenticalPairs(int[] nums) {
        int cnt=0;
        for (int i = 0; i <nums.length ; i++) {
            for (int j = 0; j < i ; j++) {
                if (nums[i] == nums[j])
                    cnt += 1;
            }
        }
        return cnt;
    }
}
