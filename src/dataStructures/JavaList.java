package dataStructures;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class JavaList {
    /**
     * https://www.hackerrank.com/challenges/java-list/problem
     */

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        List list = new ArrayList(sc.nextInt());
        sc.nextLine();
        String[] arr = sc.nextLine().split(" ");

        for (String s : arr) {
            list.add(Integer.parseInt(s));
        }

        int queries = sc.nextInt();
        sc.nextLine();

        while (--queries >= 0) {
            if (sc.next().equals("Insert")) {
                list.add(sc.nextInt(), sc.nextInt());
            } else {
                sc.nextLine();
                list.remove(sc.nextInt());
            }
        }

        for (Object o : list) {
            System.out.print(o + " ");
        }
    }
}
