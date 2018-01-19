package dataStructures;

import java.util.Scanner;

public class JavaSubarray {
    /**
     * https://www.hackerrank.com/challenges/java-negative-subarray/problem
     */

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[] arr = new int[sc.nextInt()];
        for (int i = 0; i < arr.length; i++) {
            arr[i] = sc.nextInt();
        }

        int negativeCount = 0;

        for (int i = 0; i < arr.length; i++) {
            if (arr[i] < 0) negativeCount++;
            int tempSum = arr[i];
            for (int j = i + 1; j < arr.length; j++) {
                tempSum += arr[j];
                if (tempSum < 0) negativeCount++;
            }
        }

        System.out.println(negativeCount);

    }
}
