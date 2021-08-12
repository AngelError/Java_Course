package az.coders.ada_students.lessons.lesson_16.leetcode;

public class NegativeNumber {
    public static void main(String[] args) {
        int[][] grid = {{5,1,1}, {-55,-5,-5}};
        Solution3 solution3 = new Solution3();
        System.out.println(solution3.countNegatives(grid));
    }
}

class Solution3 {
    public int countNegatives(int[][] grid) {
        int cnt = 0;
        for (int i = 0; i < grid.length; i++) {
            for (int j = 0; j < grid[i].length; j++) {
                if(grid[i][j] < 0)
                    cnt++;
            }
        }
        return cnt;
    }
}