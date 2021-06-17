package az.coders.ada_students.hackerrank;

import java.util.Scanner;

public class JavaLoopsII {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int t=in.nextInt();
        for(int i=0;i<t;i++){
            int a = in.nextInt();
            int b = in.nextInt();
            int n = in.nextInt();

            for (int j = 1; j <= n; j+=2) {
                a += (j * b);
                System.out.print(a + " ");
            }
        }
        in.close();


    }
}
