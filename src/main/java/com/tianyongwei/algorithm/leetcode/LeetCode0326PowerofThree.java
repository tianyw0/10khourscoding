package com.tianyongwei.algorithm.leetcode;

public class LeetCode0326PowerofThree {
    public boolean isPowerOfThree(int n) {
        String radix3 = Integer.toString(n, 3);

        if(n < 0) return false;

        if(radix3.contains("2")) return false;

        if(radix3.contains("1") && radix3.indexOf("1") == radix3.lastIndexOf("1")) {
            return true;
        }
        return false;
    }
}
