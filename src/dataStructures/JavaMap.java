package dataStructures;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class JavaMap {
    /**
     * https://www.hackerrank.com/challenges/phone-book/problem
     */

    public static void main(String[] argh) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        in.nextLine();

        Map<String, Integer> yellowPages = new HashMap<String, Integer>();

        for (int i = 0; i < n; i++) {
            String name = in.nextLine();
            int phone = in.nextInt();
            yellowPages.put(name, phone);
            in.nextLine();
        }
        while (in.hasNext()) {
            String s = in.nextLine();
            if (!yellowPages.containsKey(s)) {
                System.out.println("Not found");
                continue;
            }
            System.out.println(s + "=" + yellowPages.get(s));

        }
    }
}
