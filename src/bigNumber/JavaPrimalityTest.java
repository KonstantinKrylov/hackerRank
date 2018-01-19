package bigNumber;

import java.math.BigInteger;
import java.util.Scanner;

public class JavaPrimalityTest {
    /**
     * https://www.hackerrank.com/challenges/java-primality-test/problem
     */

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        BigInteger n = in.nextBigInteger();
        in.close();
        System.out.println(n.isProbablePrime(999) ? "prime" :"not prime");
    }
}
