package com.tianyongwei.algorithm.leetcode;

import java.util.HashSet;
import java.util.Set;

public class LeetCode0028ImplementstrStr {
    public int strStr(String haystack, String needle) {
        if(needle.length() == 0) return 0;
        if(haystack.length() == 0) return -1;
        if(needle.length() > haystack.length()) return -1;

        Set<String> set = new HashSet<>();
        set.add(needle);
        char[] chars = haystack.toCharArray();
        for (int i = 0; i < haystack.length()-needle.length()+1; i++) {
            String s = String.valueOf(chars, i, needle.length());
            if(set.contains(s)) {
                return i;
            }
        }
        return -1;
    }
}
