package dataStructures;

import java.util.BitSet;
import java.util.Scanner;

public class JavaBitSet {
    /**
     * https://www.hackerrank.com/challenges/java-bitset/problem
     */

    public static void main(String[] ars) {
        Scanner sc = new Scanner(System.in);
        int howLong = sc.nextInt();

        BitSet[] bsArr = {new BitSet(), new BitSet(howLong), new BitSet(howLong)};

        int deals = sc.nextInt();

        while (--deals >= 0) {
            String operation = sc.next();
            int operand1 = sc.nextInt();
            int operand2 = sc.nextInt();

            switch (operation) {
                default:
                case "AND": {
                    bsArr[operand1].and(bsArr[operand2]);
                    print(bsArr);
                    break;
                }
                case "OR": {
                    bsArr[operand1].or(bsArr[operand2]);
                    print(bsArr);
                    break;
                }
                case "XOR": {
                    bsArr[operand1].xor(bsArr[operand2]);
                    print(bsArr);
                    break;
                }
                case "SET": {
                    bsArr[operand1].set(operand2);
                    print(bsArr);
                    break;
                }
                case "FLIP": {
                    bsArr[operand1].flip(operand2);
                    print(bsArr);
                    break;
                }
            }
        }
    }

    public static void print(BitSet[] bsArr) {
        System.out.print(bsArr[1].cardinality() + " " + bsArr[2].cardinality());
        System.out.println();
    }
}
