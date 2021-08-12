package az.coders.ada_students.lessons.lesson_14.leetcode;

public class NumberOfStepsToReduceNumberToZero {

    int num;

    public static void main(String[] args) {

        Solution2 solution2 = new Solution2(14);

        System.out.println(solution2.numberOfSteps());

    }
}

class Solution2 {

    private int num;

    public Solution2(int num) {
        this.num = num;
    }

    public int numberOfSteps() {
        int cnt = 0;
        while (num != 0){
            if(num % 2 != 0) {
                num -= 1;
            }
            else {
                num /= 2;
            }
            cnt += 1;
        }
        return cnt;
    }
}
