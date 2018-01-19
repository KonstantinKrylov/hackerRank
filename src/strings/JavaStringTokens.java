package strings;

import java.util.Scanner;

public class JavaStringTokens {
    /**
     * https://www.hackerrank.com/challenges/java-string-tokens/problem
     */

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        String s = scan.nextLine();

        String[] arrS = s.trim().split("[^a-zA-Z]+");
        if (arrS.length == 0 || arrS[0].length() == 0 || arrS[0].charAt(0) == ' ') {
            System.out.println(0);
        } else {
            System.out.println(arrS.length);
            for (String str : arrS) {
                System.out.println(str);
            }
            scan.close();
        }

    }
}
