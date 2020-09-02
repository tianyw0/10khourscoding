package leetcode;

import java.util.Random;

public class LeetCode0384ShuffleanArray {

    int[] oriNums, nums;
    Random random = new Random();
    public LeetCode0384ShuffleanArray(int[] nums) {
        this.oriNums = nums.clone();
        this.nums = nums;
    }

    /** Resets the array to its original configuration and return it. */
    public int[] reset() {
        return oriNums;
    }

    /** 洗牌算法 */
    public int[] shuffle() {
        for (int i = 0; i < nums.length; i++) {
            int target = random.nextInt(nums.length - i);
            int tmp = nums[i];
            nums[i] = nums[target];
            nums[target] = tmp;
        }
        return nums;
    }
}
