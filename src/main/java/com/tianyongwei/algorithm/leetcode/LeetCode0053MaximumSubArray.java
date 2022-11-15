package com.tianyongwei.algorithm.leetcode;

public class LeetCode0053MaximumSubArray {
	public int maxSubArray(int[] numbs) {
		int max = Integer.MIN_VALUE;
		int curr = 0;
		for (final int num : numbs) {
			curr = Math.max(curr + num, num);
			max = Math.max(curr, max);
		}
		return max;
	}
}
