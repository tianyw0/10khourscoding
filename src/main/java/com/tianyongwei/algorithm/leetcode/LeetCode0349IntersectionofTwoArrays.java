package com.tianyongwei.algorithm.leetcode;

import java.util.HashSet;
import java.util.Set;

public class LeetCode0349IntersectionofTwoArrays {
    public int[] intersection(int[] nums1, int[] nums2) {
        Set<Integer> set1 = new HashSet<Integer>();
        Set<Integer> set2 = new HashSet<Integer>();
        for (Integer n1 : nums1) set1.add(n1);

        for (Integer n2 : nums2) {
            if(set1.contains(n2)) {
                set2.add(n2);
            }
        }

        int[] res = new int[set2.size()];
        int idx = 0;
        for (Integer s2 : set2) {
            res[idx++] = s2;
        }
        return res;
    }
}
