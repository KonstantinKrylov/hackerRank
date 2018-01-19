package introduction;

import java.util.Scanner;

public class JavaLoops1 {
    /**
     * Objective
     * In this challenge, we're going to use loops to help us do some simple math.
     * <p>
     * Task
     * Given an integer, N, print its first 10 multiples.
     */

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        for (int i = 1; i <= 10; i++) {
            System.out.println(n + " x " + i + " = " + n * i);
        }
    }
}
