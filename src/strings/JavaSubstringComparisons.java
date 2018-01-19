package strings;

import java.util.Scanner;

public class JavaSubstringComparisons {
    /**
     * https://www.hackerrank.com/challenges/java-string-compare/problem
     */

    public static String getSmallestAndLargest(String s, int k) {
        String smallest = s.substring(0, k);
        String largest = "";
        for (int i = 0; i <= s.length() - k; i++) {
            if (smallest.compareTo(s.substring(i, i + k)) > 0) smallest = s.substring(i, i + k);
            if (largest.compareTo(s.substring(i, i + k)) < 0) largest = s.substring(i, i + k);
        }

        return smallest + "\n" + largest;
    }

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        String s = scan.next();
        int k = scan.nextInt();
        scan.close();

        System.out.println(getSmallestAndLargest(s, k));
    }
}
