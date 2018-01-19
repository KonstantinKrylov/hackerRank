package dataStructures;

import java.util.Scanner;

public class Java2DArray {
    /**
     * https://www.hackerrank.com/challenges/java-2d-array/problem
     */

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int arr[][] = new int[6][6];
        for (int i = 0; i < 6; i++) {
            for (int j = 0; j < 6; j++) {
                arr[i][j] = in.nextInt();
            }
        }

        int maxHours = Integer.MIN_VALUE;
        for (int i = 0; i < 4; i++) {
            for (int j = 0; j < 4; j++) {
                int probablyMax = arr[i][j] + arr[i][j + 1] + arr[i][j + 2] + arr[i + 1][j + 1] + arr[i + 2][j] + arr[i + 2][j + 1] + arr[i + 2][j + 2];
                if (probablyMax > maxHours) maxHours = probablyMax;
            }
        }
        System.out.println(maxHours);
    }
}
