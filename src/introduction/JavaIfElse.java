package introduction;

import java.util.Scanner;

public class JavaIfElse {
    /**
     * Task
     * Given an integer, , perform the following conditional actions:
     * <p>
     * If  is odd, print Weird
     * If  is even and in the inclusive range of  to , print Not Weird
     * If  is even and in the inclusive range of  to , print Weird
     * If  is even and greater than , print Not Weird
     * Complete the stub code provided in your editor to print whether or not  is weird.
     * <p>
     * Input Format
     * <p>
     * A single line containing a positive integer, .
     */

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        String ans = "";
        if (n % 2 == 1) {
            ans = "Weird";
        } else {

            if (2 <= n && 5 > n) ans = "Not Weird";
            if (6 <= n && 20 >= n) ans = "Weird";
            if (20 < n) ans = "Not Weird";

        }
        System.out.println(ans);

    }
}
