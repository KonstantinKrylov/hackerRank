package introduction;

import java.util.Scanner;

public class JavaLoops2 {
    /**
     * https://www.hackerrank.com/challenges/java-loops/problem
     */
    public static void main(String[] argh) {
        Scanner in = new Scanner(System.in);
        int t = in.nextInt();
        for (int i = 0; i < t; i++) {
            int a = in.nextInt();
            int b = in.nextInt();
            int n = in.nextInt();
            for (int j = 0; j <= n - 1; j++) {
                int sum = a;

                for (int k = 0; k < j + 1; k++) {
                    sum += Math.pow(2, k) * b;
                }
                System.out.print(sum + " ");
                sum = 0;
            }
            System.out.println();
        }
        in.close();
    }
}
