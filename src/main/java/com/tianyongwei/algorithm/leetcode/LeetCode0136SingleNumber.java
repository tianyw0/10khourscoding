package com.tianyongwei.algorithm.leetcode;

import java.util.HashSet;
import java.util.Set;

public class LeetCode0136SingleNumber {
    public int searchInsert(int[] nums) {
        Set<Integer> set = new HashSet<>();
        for (int i = 0; i < nums.length; i++) {
            Integer curr = nums[i];
            if(set.contains(curr)) {
                set.remove(curr);
            } else {
                set.add(curr);
            }
        }
        return set.iterator().next();
    }
}