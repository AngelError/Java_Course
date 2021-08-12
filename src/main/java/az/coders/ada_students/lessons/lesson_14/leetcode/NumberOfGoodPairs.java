package az.coders.ada_students.lessons.lesson_14.leetcode;

public class NumberOfGoodPairs {
    public static void main(String[] args) {

        Solutions solution = new Solutions(new int[]{1,2,3,1,1,3});


        System.out.println(solution.numIdenticalPairs());
    }
}

class Solutions {

    private int[] num;

    public Solutions(int[] nums) {
        int[] num = nums;
    }

    public int numIdenticalPairs() {
        int cnt=0;
        for (int i = 0; i <num.length ; i++) {
            for (int j = 0; j < i ; j++) {
                if (num[i] == num[j])
                    cnt += 1;
            }
        }
        return cnt;
    }
}
