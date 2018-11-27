package leetcode.code;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

/**
 * 寻找连个加起来等于target的数字
 *
 * @author: tianyongwei
 * @date: 2018/11/26 20:49
 */
public class TwoSum {

	/**
	 *
	 * @param nums
	 * @param target
	 * @return
	 */
	public int[] solution(int[] nums, int target) {
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
		int[] ddd = new TwoSum().solution(sums, 93);
		System.out.println(Arrays.toString(ddd));
	}
}
