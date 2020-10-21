package com.tianyongwei.algorithm.leetcode;

public class LeetCode0268MissingNumber {
    public int missingNumber(int[] nums) {
        int sum = (nums.length * (nums.length+1)) >> 1;
        for (int i = 0; i < nums.length; i++) {
            sum -= nums[i];
        }
        return sum;
    }
}
