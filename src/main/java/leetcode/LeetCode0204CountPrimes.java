package leetcode;

import java.util.Arrays;

public class LeetCode0204CountPrimes {
    public int countPrimes(int n) {
        // 排除法（1. 所有偶数都不要 2. 所有质数的奇数倍
        boolean flags[] = new boolean[n];
        init(flags);

        int count = 0;
        for (int i = 0; i < n; i++) {
            if(judge(i, flags)) {
                count++;
                influence(i, flags);
            }
        }
        return count;
    }

    private void init(boolean[] flags) {
        Arrays.fill(flags, true);
        if(idx % 2 == 0) return false;
        if(idx == 1) return false;
    }

    private void influence(int idx, boolean[] flags) {
        for (int i = idx * 2; i < flags.length; i++) {
            flags[i] = false;
        }
    }

}

