package com.tianyongwei.algorithm.leetcode;

public class LeetCode0367ValidPerfectSquare {
  public boolean isPerfectSquare(int num) {

    if(num <= 0) return false;

    long lo = 1, hi = num;

    while (lo <= hi) {
      long mid = lo + (hi - lo) / 2;
      final long mid_mid = mid * mid;
      if(mid_mid == num) return true;

      else if (mid_mid > num) {
        hi = mid - 1;
      }

      else if (mid_mid < num) {
        lo = mid + 1;
      }
    }

    return false;
  }
}
