package az.coders.ada_students.lessons.exercises.recursion;

import java.util.Scanner;

public class Array6 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int [] nums = new int[10];

        for (int i = 0; i<10; i++) {
            nums[i] = scanner.nextInt();
        }

        int index = scanner.nextInt();

        System.out.println(array6(nums,index));

    }

    public static boolean array6(int[] nums, int index) {
        int cnt = 0;
        if(nums.length > index) {
            if(nums[index] == 6)
                return true;
            else
            return array6(nums,index+1);
        }
            return false;
    }
}
