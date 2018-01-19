package dataStructures;

import java.util.Scanner;

public class Java1DArrayPart2 {
    /**
     * https://www.hackerrank.com/challenges/java-1d-array/problem
     */

    public static boolean canWin(int i, int leap, int[] game) {
        if (i < 0) return false;
        if (game[i] != 0) return false;
        if (i == game.length - 1) return true;
        if (i + leap > game.length - 1) return true;

        game[i] = 1;
        return canWin(i + 1, leap, game) || canWin(i - 1, leap, game) || canWin(i + leap, leap, game);

    }

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int q = scan.nextInt();
        while (q-- > 0) {
            int n = scan.nextInt();
            int leap = scan.nextInt();

            int[] game = new int[n];
            for (int i = 0; i < n; i++) {
                game[i] = scan.nextInt();
            }

            System.out.println((canWin(0, leap, game)) ? "YES" : "NO");
        }
        scan.close();
    }
}
