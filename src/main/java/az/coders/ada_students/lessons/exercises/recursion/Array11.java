package az.coders.ada_students.lessons.exercises.recursion;

import java.util.Scanner;

public class Array11 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int [] nums = new int[10];

        for (int i = 0; i<10; i++) {
            nums[i] = scanner.nextInt();
        }

        int index = scanner.nextInt();

        System.out.println(array11(nums,index));

    }

    public static int array11(int[] nums, int index) {
        int cnt = 0;

        if(index < nums.length) {
            if(nums[index] == 11) {
                return 1 + array11(nums, index + 1);
            }
            else return array11(nums, index + 1);
        }
        if(index >= nums.length) return 0;

        return cnt;
    }
}
