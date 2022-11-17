package com.tianyongwei.algorithm.leetcode;

public class L0278FirstBadVersion {
  public int firstBadVersion(int n) {

    int lo = 0;
    int hi = n;

    while (lo <= hi) {
      int mid = lo + (hi - lo) / 2;
      if (!isBadVersion(mid) && isBadVersion(mid + 1)) {
        return mid + 1;
      } else if (isBadVersion(mid)) {
        hi = mid - 1;
      } else if (!isBadVersion(mid + 1)) {
        lo = mid + 1;
      }
    }

    return 0;
  }

  private boolean isBadVersion(int mid) {
    return mid > 7;
  }
}
