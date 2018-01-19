package introduction;

import java.util.Scanner;

public class JavaStaticInitializerBlock {
    /**
     * https://www.hackerrank.com/challenges/java-static-initializer-block/problem
     */

    static boolean flag;
    static int B;
    static int H;

    static {
        Scanner sc = new Scanner(System.in);
        B = sc.nextInt();
        H = sc.nextInt();

        try {
            if (B > 0 && H > 0) {
                flag = true;
            } else {
                flag = false;
                throw new Exception("Breadth and height must be positive");
            }
        } catch (Exception e) {
            System.out.println(e);
        }
    }

    public static void main(String[] args) {
        if (flag) {
            int area = B * H;
            System.out.print(area);
        }

    }//end of main

}//end of class
