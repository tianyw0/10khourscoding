package com.tianyongwei.algorithm.leetcode;

public class L0172FactorialTrailingZeroes {
    public int trailingZeroes(int n) {
        int count5 = 0;
        for (int i = 1; i <= n; i++) {
            int curr = i;
            while (curr % 5 == 0) {
                count5++;
                curr /= 5;
            }
        }
        return count5;
    }
}
