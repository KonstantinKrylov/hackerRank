package dataStructures;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;

public class JavaArraylist {
    /**
     * https://www.hackerrank.com/challenges/java-arraylist/problem
     */

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int leng = sc.nextInt();
        sc.nextLine();
        List[] arrayOfLines = new List[leng];

        for (int i = 0; i < leng; i++) {
            arrayOfLines[i] = new ArrayList();
            Collections.addAll(arrayOfLines[i], sc.nextLine().split(" "));
        }

        int queries = sc.nextInt();


        for (int i = 0; i < queries; i++) {

            int line = sc.nextInt();
            int position = sc.nextInt();


            if (position > arrayOfLines[line - 1].size() - 1) {
                System.out.println("ERROR!");
                continue;
            }

            System.out.println(arrayOfLines[line - 1].get(position));

        }

    }
}
