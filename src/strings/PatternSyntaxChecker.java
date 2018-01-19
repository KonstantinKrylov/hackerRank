package strings;

import java.util.Scanner;
import java.util.regex.Pattern;

public class PatternSyntaxChecker {
    /**
     * https://www.hackerrank.com/challenges/pattern-syntax-checker/problem
     */

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int testCases = Integer.parseInt(in.nextLine());
        while (testCases > 0) {
            String pattern = in.nextLine();

            try {
                Pattern p = Pattern.compile(pattern);
                System.out.println("Valid");
            } catch (Exception e) {
                System.out.println("Invalid");
            }
            testCases--;
        }
    }
}
