package az.coders.ada_students.lessons.lesson_15.leetcode.array;

public class SingleNumber {
    public static void main(String[] args) {
        Solution4 solution4 = new Solution4(new int[] {4,1,2,1,2});
        System.out.println(solution4.singleNumber());
    }
}

class Solution4 {
    private final int[] nums;

    public Solution4(int[] nums) {
        this.nums = nums;
    }

    public int singleNumber() {
        int cnt = 0;
        int num = 0;
        int length = nums.length;
        for (int i = 0; i < length; i++) {
            for (int j = 0; j < length; j++) {
                if(i != j && nums[i] == nums[j]) {
                    cnt++;
                }
            }
            if(cnt == 0) num = nums[i];
            else cnt = 0;
        }
        return num;
    }
}
