package az.coders.ada_students.lessons.lesson_15.leetcode.string;

public class TruncatedSentence {
    public static void main(String[] args) {
        String s = "Hello how are you Contestant";
        int k = 4;
        Solution8 solution8 = new Solution8();
        System.out.println(solution8.truncateSentence(s,k));
    }
}

class Solution8 {
    public String truncateSentence(String s, int k) {
        String[] arr = s.split(" ");
        String string = "";
        for (int i = 0; i < k; i++) {
            string += arr[i] + " ";
        }
        return string;
    }
}