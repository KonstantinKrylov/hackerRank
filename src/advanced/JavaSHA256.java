package advanced;

import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;
import java.security.*;

/**
 * https://www.hackerrank.com/challenges/sha-256/problem
 */

public class JavaSHA256 {
    public static void main(String[] args) throws NoSuchAlgorithmException {
        Scanner sc = new Scanner(System.in);
        String s = sc.next();
        sc.close();

        MessageDigest message = MessageDigest.getInstance("SHA-256");
        message.update(s.getBytes());
        byte[] digest = message.digest();

        for (byte b : digest) {
            System.out.format("%02x", b);
        }
    }
}
