package leetcode;

import java.util.Stack;

public class LeetCode0050Pow_x_n_2 {
    public double myPow(double x, int n) {
        if(n == 0) return 1;

        if(n < 0) {
            x = 1 / x;
            n = -n;
        }
        // 模拟递归
        Stack<Integer> stack = new Stack<>();
        stack.add(n);

        double res = 1d;
        while (!stack.isEmpty()) {
            Integer pop = stack.pop();
            int div_2 = pop / 2;
            int mod_2 = pop % 2;

            if(div_2 == 0) {
                div_2 =
            }

            stack.add(div_2);
            res *= (mod_2 == 0 ? 1 : x);
        }
    }
}
