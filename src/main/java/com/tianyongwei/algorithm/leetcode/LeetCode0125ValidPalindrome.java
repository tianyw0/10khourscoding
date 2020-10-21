package com.tianyongwei.algorithm.leetcode;

public class LeetCode0125ValidPalindrome {
    public boolean isPalindrome(String s) {
        int len = s.length();
        if(len == 0) return true;

        // double point
        int lo = 0, hi = len-1;
        while (lo <= hi) {
            char loChar = s.charAt(lo);
            char hiChar = s.charAt(hi);
            if(!Character.isLetterOrDigit(loChar)) {
                lo++;
                continue;
            }
            if(!Character.isLetterOrDigit(hiChar)) {
                hi--;
                continue;
            }

            if(Character.toLowerCase(loChar) != Character.toLowerCase(hiChar)) {
                return false;
            } else {
                lo++;
                hi--;
            }
        }
        return true;
    }
}
