package com.tianyongwei.algorithm.leetcode;

import java.util.HashMap;
import java.util.Map;

public class LeetCode0001TwoSum {
	public int[] solution1(int[] nums, int target) {
		int[] result = new int[2];
		Map<Integer, Integer> flags = new HashMap<Integer, Integer>();
		for (int i = 0; i < nums.length; i++) {
			int num = nums[i];
			if (flags.containsKey(num)) {
				result[0] = flags.get(num) - 1;
				result[1] = i;
				return result;
			}
			flags.put(target - num, i + 1);
		}
		return result;
	}
}
