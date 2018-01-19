package strings;

import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class TagContentExtractor {
    /**
     * https://www.hackerrank.com/challenges/tag-content-extractor/problem
     */

    public static void main(String[] args) {

        Scanner in = new Scanner(System.in);
        int testCases = Integer.parseInt(in.nextLine());
        while (testCases > 0) {
            String line = in.nextLine();
            Pattern p = Pattern.compile("<(.+)>([^<]+)</\\1>");
            Matcher m = p.matcher(line);

            int hasMatch = 0;

            while (m.find()) {
                hasMatch = 1;
                System.out.println(m.group(2));
            }

            if (hasMatch == 0) System.out.println("None");
            testCases--;
        }
    }
}
