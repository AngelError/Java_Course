package az.coders.ada_students.lessons.lesson_14.leetcode;

public class NumberOfStepsToReduceNumberToZero {
    public static void main(String[] args) {
        int num = 14;

        Solution2 solution2 = new Solution2();

        System.out.println(solution2.numberOfSteps(num));
    }
}

class Solution2 {
    public int numberOfSteps(int num) {
        int cnt = 0;
        while (num != 0){
            if(num % 2 != 0) {
                num -= 1;
                cnt += 1;
            }
            else {
                num /= 2;
                cnt += 1;
            }
        }
        return cnt;
    }
}
