package az.coders.ada_students.lessons.lesson_16.leetcode;

import java.util.Arrays;

public class ReverseArray {
    public static void main(String[] args) {
        int[][] image = {{1,1,0}, {1,0,1}, {0,0,0}};
        Solution1 solution = new Solution1();
        System.out.println(Arrays.deepToString(solution.flipAndInvertImage(image)));
    }
}

class Solution1 {
    public int[][] flipAndInvertImage(int[][] image) {
        int[][] reverse = new int[image.length][image.length];

        for (int i = 0; i < image.length; i++)  {
            for (int j = 0; j < image.length; j++) {
                if(image[i][j] == 0) image[i][j] = 1;
                else image[i][j] = 0;

                reverse[i][image.length-1-j] = image[i][j];
            }
        }
        return reverse;
    }
}
