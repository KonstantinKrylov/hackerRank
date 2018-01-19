package dataStructures;

import java.util.Scanner;
import java.util.Stack;

public class JavaStack {
    /**
     * https://www.hackerrank.com/challenges/java-stack/problem
     */

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        Stack<String> stack = new Stack<>();
        while (sc.hasNext()) {
            String input = sc.next();
            for (int i = 0; i < input.length(); i++) {
                if (stack.empty()) {
                    stack.push(input.substring(i, i + 1));
                } else {
                    String stackTop = stack.peek();
                    String currentSc = input.substring(i, i + 1);
                    if (stackTop.equals("(") && currentSc.equals(")") ||
                            stackTop.equals("[") && currentSc.equals("]") ||
                            stackTop.equals("{") && currentSc.equals("}")) {
                        stack.pop();
                    } else stack.push(currentSc);
                }
            }
            System.out.println(stack.empty());
            stack.clear();

        }

    }
}
