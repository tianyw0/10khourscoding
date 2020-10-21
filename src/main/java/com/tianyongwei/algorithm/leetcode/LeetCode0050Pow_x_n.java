package com.tianyongwei.algorithm.leetcode;

public class LeetCode0050Pow_x_n {
    public double myPow(double x, int n) {
        if(n == 0) return 1;

        if(n < 0) {
            x = 1 / x;
            n = -n;
        }

        return myPow(x, n / 2) * myPow(x, n / 2) * (n % 2 == 0 ? 1 : x);
    }
}
