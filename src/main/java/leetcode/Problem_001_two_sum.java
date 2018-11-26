package leetcode;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

public class Problem_001_two_sum {
	public static int[] twoSum(int[] nums, int target) {
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
	
	public static void main(String[] args) {
		int[] sums = { -3, 4, 3, 90 };
		int[] ddd = twoSum(sums, 90);
		System.out.println(Arrays.toString(ddd));
	}
}
