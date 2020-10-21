package com.tianyongwei.algorithm.leetcode;

import java.util.HashMap;
import java.util.Map;

public class LeetCode0387FirstUniqueCharacterinaString {
    public int firstUniqChar(String s) {
        Map<Character, Integer> map = new HashMap();
        for (int i = 0; i < s.length(); i++) {
            map.put(s.charAt(i), map.getOrDefault(s.charAt(i), 0) + 1);
        }

        for (int i = 0; i < s.length(); i++) {
            if(map.get(s.charAt(i)).intValue() == 1) {
                return i;
            }
        }
        return -1;
    }
}
