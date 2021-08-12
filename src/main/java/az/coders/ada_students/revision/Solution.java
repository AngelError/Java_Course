package az.coders.ada_students.revision;

public class Solution {
    public int[] smallerNumbersThanCurrent(int[] nums) {
        int[] count = new int[nums.length];
        for (int i = 0; i < nums.length; i++) {
            int cnt = 0;
            for (int num : nums) {
                if (nums[i] > num)
                    cnt++;
            }
            count[i] = cnt;
        }
        return count;
    }

    public int[] countSmaller(int[] num) {
        int[] count = new int[num.length];
        for (int i = 0; i < num.length; i++) {
            int cnt = 0;
            for (int j = i; j < num.length; j++) {
                if (num[i] > num[j])
                    cnt++;
            }
            count[i] = cnt;
        }
        return count;
    }

    public boolean halvesAreAlike(String s) {
        int cnt1 = 0, cnt2 = 0;
        final String vowel = "a e i o u A E I O U";
        for (int i = 0; i < s.length() / 2; i++) {
            if (vowel.contains(s.charAt(i) + ""))
                cnt1++;
        }
        for (int i = s.length() / 2; i < s.length(); i++) {
            if (vowel.contains(s.charAt(i) + ""))
                cnt2++;
        }
        return cnt1 == cnt2;
    }

    public String makeLargestSpecial(String ss) {
        String reverse = "";
        for (int i = ss.length() - 1; i >= 0; i--) {
            if ((ss.charAt(i) == '1'))
                reverse = reverse.concat("0");
            else
                reverse = reverse.concat("1");
        }
        return reverse;
    }

    public int countPrimes(int n) {
        int prime = 0;
        if( n == 1) return prime;
        else if (n == 2) return prime+1;
        else {
            for (int i = 3; i <= n; i+=2) {
                int cnt = 0;
                for (int j = 1; j <= i; j++) {
                    if(i % j == 0)
                        cnt++;
                }
                System.out.println(cnt);
                if (cnt == 2) prime++;
            }
        }
        return prime;
    }

    public int addDigits(int numm) {
        while (numm > 9) {
            numm = (numm / 10) + (numm % 10);
        }
        return numm;
    }

    public int getLucky(String s1, int k) {
        int sum = 0;
            for (int j = 0; j < s1.length(); j++) {
                int num = (s1.charAt(j) - '`');
                    sum += (num/10) + (num%10);
            }


        int total = 0;
        for (int i = 0; i < k - 1; i++) {
            int digit = 0;
            while (sum > 9) {
                digit = sum % 10;
                sum = sum / 10;
                total = sum + digit;
            }
        }
        return total;
    }

    public int nthUglyNumber(int n, int a, int b, int c) {

        int min = Integer.min(a, Integer.min(b,c));
        int cnt = 0;
        int num = 0;
            for (int i = 1; i <= min * n; i++) {
                if (i % a == 0 || i % b == 0 || i % c == 0) {
                    num = i;
                    cnt++;
                    if(cnt == n) break;
                }

        }
        return num;
    }
}
