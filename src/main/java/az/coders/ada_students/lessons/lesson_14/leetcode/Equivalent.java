package az.coders.ada_students.lessons.lesson_14.leetcode;

public class Equivalent {
    public static void main(String[] args) {
        String[] word1 = {"ab", "c"};
        String[] word2 = {"a", "bc"};

        Solution7 solution7 = new Solution7();
        System.out.println(solution7.arrayStringsAreEqual(word1,word2));

    }
}

class Solution7 {
    public boolean arrayStringsAreEqual(String[] word1, String[] word2) {
        String str1 = "";
        String str2 = "";

        for (String value : word1) {
            str1 = str1.concat(value);
        }
        for (String s : word2) {
            str2 = str2.concat(s);
        }

        return str1.equals(str2);
    }
}
