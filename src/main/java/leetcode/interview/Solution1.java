package leetcode.interview;

import java.util.*;

public class Solution1 {
    public List<Integer> addToArrayForm(int[] A, int K) {
        Queue<Integer> queue = new LinkedList<>();
        while (K != 0) {
            int mod = K % 10;
            queue.add(mod);
            K = K / 10;
        }

        Stack<Integer> stack = new Stack<>();
        int step = 0;
        for (int i = A.length - 1; i >= 0; i--) {
            Integer poll = queue.poll();
            int sum = A[i] + step;
            if(poll != null) {
                sum += poll;
            }
            int mod = sum % 10;
            stack.add(mod);
            step = sum / 10;
        }

        while (!queue.isEmpty()) {
            Integer poll = queue.poll();
            int sum = poll + step;
            int mod = sum % 10;
            stack.add(mod);
            step = sum / 10;
        }

        if(step != 0) stack.add(step);

        List<Integer> res = new ArrayList<>();
        while (!stack.isEmpty()) {
            res.add(stack.pop());
        }
        return res;
    }
}
