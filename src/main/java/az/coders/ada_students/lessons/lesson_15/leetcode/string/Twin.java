package az.coders.ada_students.lessons.lesson_15.leetcode.string;

public class Twin {
    public static void main(String[] args) {
        String s = "ababab";
        Solution1 solution1 = new Solution1();
        System.out.println(solution1.repeatedSubstringPattern(s));
    }
}

class Solution1 {
    public boolean repeatedSubstringPattern(String s) {
        return s.substring(0, s.length() / 2).equals(s.substring(s.length() / 2));
    }
}
