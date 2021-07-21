package az.coders.ada_students.lessons.exercises.recursion;

import java.util.Scanner;

public class Array220 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int [] nums = new int[10];

        for (int i = 0; i<10; i++) {
            nums[i] = scanner.nextInt();
        }

        int index = scanner.nextInt();

        System.out.println(array220(nums,index));

    }

    public static boolean array220(int[] nums, int index) {
        if(index <= nums.length - 2) {
            if(nums[index + 1] == 10 * nums[index])
                return true;
            else
                return array220(nums, index+1);
        }
        return false;
    }
}
