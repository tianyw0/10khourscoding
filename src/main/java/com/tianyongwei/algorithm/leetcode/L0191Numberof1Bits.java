package com.tianyongwei.algorithm.leetcode;

public class L0191Numberof1Bits {
    public int hammingWeight(int n) {
        int res = 0;
        int mask = 1;
        for (int i = 0; i < 32; i++) {
            if((n & mask) == 1) {
                res ++;
            }
            n >>= 1;
        }
        return res;
    }
}
