package strings;

import java.util.Scanner;

public class JavaRegex {
    /**
     * https://www.hackerrank.com/challenges/java-regex/problem
     */

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        while (in.hasNext()) {
            String IP = in.next();
            System.out.println(IP.matches(new MyRegex().pattern));
        }

    }
}

class MyRegex {
    private static String p = "((0|1)\\d{2}|[0-2][0-4][0-9]|[0-2]5[0-5]|\\d{1,2})";
    static String pattern = p + "\\." + p + "\\." + p + "\\." + p;
}
