package com.tianyongwei.algorithm.leetcode;

public class LeetCode0069SqrtX {
  public int mySqrt(int x) {
    long lo = 0;
    long hi = x;
    while (lo <= hi) {
      long mid = lo + (hi - lo) / 2;
      long sqrt = mid * mid;
      long sqrt_plus_1 = (mid+1) * (mid+1);

      if(sqrt <= x && x < sqrt_plus_1) {
        return (int) mid;
      }
      else if(sqrt_plus_1 <= x) {
        lo = mid + 1;
      }
      else if (x < sqrt) {
        hi = mid - 1;
      }
    }

    return 0;
  }
}
