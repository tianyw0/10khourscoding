package com.tianyongwei.algorithm.leetcode.interview;

class Leetcode0198HouseRobber {
    // 滚动数组
    public int rob(int[] nums) {
        if(nums == null || nums.length == 0)
            return 0;
        if(nums.length == 1)
            return nums[0];

        int max = 0;
        int currMax = 0;

        int firstMax = nums[0], secondMax = Math.max(firstMax, nums[1]);
        max = secondMax;

        // 大于两个的情况
        for (int i = 2; i < nums.length; i++) {
            int robIt = firstMax + nums[i];
            int unRobIt = secondMax;

            firstMax = secondMax;
            secondMax = Math.max(robIt, unRobIt);
            max = Math.max(secondMax, max);
        }
        return max;
    }
}