package az.coders.ada_students.lessons.lesson_16.leetcode;

public class Wealth {
    public static void main(String[] args) {
        int[][] accounts = {{1,2,3},{3,2,1}};
        Solution solution = new Solution();
        System.out.println(solution.maximumWealth(accounts));
    }
}

class Solution {
    public int maximumWealth(int[][] accounts) {
        int max = Integer.MIN_VALUE;
        int cnt = 0;
        for (int[] i : accounts) {
            for (int j = 0; j < i.length; j++) {
                cnt += i[j];
            }
            if(cnt >= max) max = cnt;
            cnt = 0;
        }
        return max;
    }
}
