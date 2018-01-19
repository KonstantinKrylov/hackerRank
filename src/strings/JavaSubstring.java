package strings;

import java.util.Scanner;

public class JavaSubstring {
    /**
     * https://www.hackerrank.com/challenges/java-substring/problem
     */

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        String S = in.next();
        int start = in.nextInt();
        int end = in.nextInt();
        System.out.println(S.substring(start, end));
    }
}
