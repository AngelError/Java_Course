package az.coders.ada_students.lessons.lesson_15.leetcode.string;

public class Replacement {
    public static void main(String[] args) {
        String s = "a1b2c3d4e"; // abbccd
        Solution9 solution9 = new Solution9();
        System.out.println(solution9.replaceDigits(s));
    }
}

class Solution9 {
    public String replaceDigits(String s) {

        char[] arr = s.toCharArray();
        for (int i = 1; i < s.length(); i+=2) {
            arr[i] += arr[i-1] - '0';
        }
        return String.valueOf(arr);
//        char ch;
//        for (int i = 1; i < s.length(); i++) {
//            if(Character.isDigit(s.charAt(i))) {
//                ch = s.charAt(i-1);
//                ch += s.charAt(i);
//                s = s.replace(s.charAt(i), ch);
//            }
//        }
//        return s;
    }
}