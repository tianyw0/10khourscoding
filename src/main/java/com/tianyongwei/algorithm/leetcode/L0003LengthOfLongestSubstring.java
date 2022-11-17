package com.tianyongwei.algorithm.leetcode;

public class L0003LengthOfLongestSubstring {
    public int lengthOfLongestSubstring(String s) {
        if (s == null || s.length() == 0)
            return 0;
        var a = s.toCharArray();
        for (char c : a) {
            System.out.println(c);
        }
        return s.length();
    }
}
