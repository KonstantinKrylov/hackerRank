package exceptionHandling;

import java.util.InputMismatchException;
import java.util.Scanner;

public class JavaExceptionHandlingTryCatch {
    /**
     * https://www.hackerrank.com/challenges/java-exception-handling-try-catch/problem
     */
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        try {
            int x = sc.nextInt();
            sc.nextLine();
            int y = sc.nextInt();
            if (y == 0) throw new java.lang.ArithmeticException();
            System.out.println(x / y);
        } catch (InputMismatchException e) {
            System.out.println("java.util.InputMismatchException");
        } catch (ArithmeticException e) {
            System.out.println(e + ": / by zero");
        }

    }
}
