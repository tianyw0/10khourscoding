package com.tianyongwei.algorithm.leetcode;

public class LeetCode0171ExcelSheetColumnNumber {
    public int titleToNumber(String s) {
        if(s == null) return 0;

        int res = 0;
        int unit = 1;
        for (int i = s.length()-1; i >= 0 ; i--) {
            res += (s.charAt(i)-64) * unit;
            unit *= 26;
        }
        return res;
    }
}
