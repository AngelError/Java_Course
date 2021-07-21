package az.coders.ada_students.lessons.exercises.leetcode;

import java.util.Scanner;

public class Adress {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String address = scanner.next();
        Solution class2 = new Solution();
        System.out.println(class2.defangIPaddr(address));
    }
}
class Solution {
    public String defangIPaddr(String address) {
        return address.contains(".") ? address.replace(".", "[.]") : " ";
    }
}
