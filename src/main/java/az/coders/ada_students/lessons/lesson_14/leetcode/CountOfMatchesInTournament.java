package az.coders.ada_students.lessons.lesson_14.leetcode;

public class CountOfMatchesInTournament {
    int n;

    public static void main(String[] args) {

        Solution4 solution4 = new Solution4(7);
        System.out.println(solution4.numberOfMatches());

    }
}

class Solution4 {

    private int n;

    public Solution4(int n) {
        this.n = n;
    }

    public int numberOfMatches() {
        int cnt = 0;
        while (n != 1) {
            cnt += (n/2);
            n -= (n/2);
        }
        return cnt;
    }
}
