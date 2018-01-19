package dataStructures;

import java.util.*;

public class JavaDequeue {
    /**
     * https://www.hackerrank.com/challenges/java-dequeue/problem
     */

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        Deque<Integer> deque = new ArrayDeque<>();
        Set<Integer> set = new HashSet<>();

        int n = in.nextInt();
        int m = in.nextInt();
        int maxUniq = 0;

        for (int i = 0; i < n; i++) {
            int num = in.nextInt();

            deque.add(num);
            set.add(num);

            if (deque.size() == m) {
                if (set.size() > maxUniq) maxUniq = set.size();
                int temp = deque.remove();
                if (!deque.contains(temp)) set.remove(temp);
            }

        }
        System.out.println(maxUniq);
    }
}
