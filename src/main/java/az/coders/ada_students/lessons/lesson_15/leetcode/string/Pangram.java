package az.coders.ada_students.lessons.lesson_15.leetcode.string;

public class Pangram {
    public static void main(String[] args) {
        String sentence= "thequickbrownfoxjumpsoverthelazydog";
        Solution7 solution7 = new Solution7();
        System.out.println(solution7.checkIfPangram(sentence));
    }
}

class Solution7 {
    public boolean checkIfPangram(String sentence) {
        int cnt = 0;
            for (char i = 'a'; i <= 'z'; i++) {
                for (int j = 0; j < sentence.length(); j++) {
                    if(sentence.charAt(j) == i) {
                        cnt++;
                        break;
                    }
                }
            }
        return cnt == 26;
    }
}