package az.coders.ada_students.lessons.lesson_14.leetcode;

public class CountOfMatchesInTournament {
    public static void main(String[] args) {
        int n = 14;
        Solution4 solution4 = new Solution4();
        System.out.println(solution4.numberOfMatches(n));

    }
}

class Solution4 {
    public int numberOfMatches(int n) {
        int cnt = 0;
        while (n != 1) {
            cnt += (n/2);
            n -= (n/2);
        }
        return cnt;
    }
}
