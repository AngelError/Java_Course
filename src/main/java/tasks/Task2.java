package tasks;

public class Task2 {
    static final int[][] A = {{5, 4, 4}, {4, 3, 4}, {3, 2, 4}, {2, 2, 2}, {3, 3, 4}, {1, 4, 4}, {4, 1, 1}};
    static final int N = A.length;
    static final int M = A[0].length;

    public static void main(String[] args) {
        System.out.println(countCountry(A));
    }

    public static int countCountry(int[][] A) {
        int sum = 0;
        int[][] B = A; // we need 2 same array

        for (int i = 0; i < N; i++) {
            for (int j = 0; j < M; j++) {
                if (B[i][j] > 0) {
                    if (checker(A, B,N, M,  i, j) != 1)
                        sum += 1;
                }
            }
        }
        return sum - 2;
    }

    public static int checker(int[][] A, int[][] B, int N, int M, int i, int j) {
        int cnt = 0;
        if (B[i][j] == 0) return cnt;

        B[i][j] = 0;
        if (N - i > 1) {
            if (A[i + 1][j] == A[i][j]) {
                checker(A, B,  N, M, i + 1, j);
                cnt += 1;
            }
        }
        if (i >= 1) {
            if (A[i - 1][j] == A[i][j]) {
                checker(A, B, N, M, i - 1, j);
                cnt += 1;
            }
        }
        if (M - j > 1) {
            if (A[i][j + 1] == A[i][j]) {
                checker(A, B, N, M, i, j + 1);
                cnt += 1;
            }
        }
        if (j >= 1) {
            if (A[i][j - 1] == A[i][j]) {
                checker(A, B, N, M, i, j - 1);
                cnt += 1;
            }
        }
        return cnt;
    }
}
