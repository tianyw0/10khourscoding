package leetcode;

public class LeetCode0278FirstBadVersion {
  public int firstBadVersion(int n) {

    int lo = 0;
    int hi = n;

    while (lo <= hi) {
      int mid = lo + (hi - lo) / 2;
      if(isBadVersion(mid)) {

      }
    }

    return 0;
  }

  private boolean isBadVersion(int mid) {
    return false;
  }
}
