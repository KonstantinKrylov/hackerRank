package strings;

import java.util.Scanner;

public class JavaStringReverse {
    /**
     * https://www.hackerrank.com/challenges/java-string-reverse/problem
     */

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        String A = sc.next();
        StringBuilder b = new StringBuilder(A);
        if (A.compareTo(b.reverse().toString()) == 0) System.out.println("Yes");
        else System.out.println("No");

    }
}
