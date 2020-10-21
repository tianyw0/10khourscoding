package com.tianyongwei.algorithm.leetcode;

public class LeetCode0238ProductofArrayExceptSelf {
  public int[] productExceptSelf(int[] nums) {
    // 思路：一个位置上的的乘积 = 这个位置上左边数的乘积 * 这个位置右边数的乘积；
    // 算出所有位置左边的乘积；
    int[] lf = new int[nums.length];
    for (int i = 0; i < nums.length; i++) {
      if(i == 0) {
        lf[i] = 1;
      } else {
        lf[i] = nums[i-1] * lf[i-1];
      }
    }

    int[] rg = new int[nums.length];
    for (int i = nums.length-1; i >= 0; i--) {
      if(i == nums.length-1) {
        rg[i] = 1;
      } else {
        rg[i] = rg[i+1] * nums[i+1];
      }
    }

    // System.out.println(Arrays.toString(nums));
    // System.out.println(Arrays.toString(lf));
    // System.out.println(Arrays.toString(rg));

    int[] ans = new int[nums.length];
    for (int i = 0; i < ans.length; i++) {
      ans[i] = lf[i] * rg[i];
    }
    return ans;
  }
}
