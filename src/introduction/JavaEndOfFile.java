package introduction;

import java.util.Scanner;

public class JavaEndOfFile {
    /**
     * https://www.hackerrank.com/challenges/java-end-of-file/problem
     */

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int i=1;
        while(sc.hasNext()){
            System.out.println(i+" "+sc.nextLine());
            i++;
        }
        sc.close();
    }
}
