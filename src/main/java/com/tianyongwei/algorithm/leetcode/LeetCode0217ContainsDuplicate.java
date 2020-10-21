package com.tianyongwei.algorithm.leetcode;

import java.util.HashSet;

public class LeetCode0217ContainsDuplicate {
    public boolean containsDuplicate(int[] nums) {
        HashSet set = new HashSet();
        for (int i = 0; i < nums.length; i++) {
            if(set.contains(nums[i])) {
                return true;
            } else {
                set.add(nums[i]);
            }
        }
        return false;
    }
}
