package strings;

import java.util.Arrays;
import java.util.Scanner;

public class JavaAnagrams {
    /**
     * https://www.hackerrank.com/challenges/java-anagrams/problem
     */

    static boolean isAnagram(String a, String b) {
        if (a.length() != b.length()) return false;
        String[] arrA = a.toLowerCase().split("");
        String[] arrB = b.toLowerCase().split("");
        Arrays.sort(arrA);
        Arrays.sort(arrB);
        for (int i = 0; i < arrA.length; i++) {
            if (!arrA[i].equals(arrB[i])) return false;
        }
        return true;
    }

    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        String a = scan.next();
        String b = scan.next();
        scan.close();
        boolean ret = isAnagram(a, b);
        System.out.println((ret) ? "Anagrams" : "Not Anagrams");
    }
}
