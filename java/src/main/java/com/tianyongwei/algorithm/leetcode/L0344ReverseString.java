package com.tianyongwei.algorithm.leetcode;

public class L0344ReverseString {
    public void reverseString(char[] s) {
        // System.out.println(s);
        int lo = 0, hi = s.length-1;
        char tmp = ' ';
        while (lo <= hi) {
            tmp = s[lo];
            s[lo] = s[hi];
            s[hi] = tmp;

            lo++;hi--;
        }

        // System.out.println(s);
    }
}
