package com.tianyongwei.algorithm.leetcode;

import java.util.Arrays;

public class LeetCode0204CountPrimes {
    public int countPrimes(int n) {
        // 排除法（1. 所有偶数都不要 2. 所有质数的奇数倍
        boolean flags[] = new boolean[n];
        init(flags);

        int count = 0;
        for (int i = 2; i < n; i++) {
            if(flags[i]) {
                count++;
                influence(i, flags);
            }
        }
        return count;
    }

    private void init(boolean[] flags) {
        Arrays.fill(flags, true);
        for (int i = 0; i < flags.length; i++) {
            if(i % 2 == 0) flags[i] = false;
        }
        if(flags.length > 1)
            flags[1] = false;
        if(flags.length > 2)
            flags[2] = true;
    }

    private void influence(int idx, boolean[] flags) {
        if(idx % 2 != 0) {
            // 只有奇数需要扩散
            for (int i = idx * 2; i < flags.length; i+=idx) {
                flags[i] = false;
            }
        }
    }

}

