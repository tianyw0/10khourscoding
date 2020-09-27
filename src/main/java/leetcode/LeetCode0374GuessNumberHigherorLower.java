package leetcode;

public class LeetCode0374GuessNumberHigherorLower {
  public int guessNumber(int n) {
    int lo = 1;
    int hi = n;
    while(lo <= hi) {
      int mid = lo + (hi - lo) / 2;
      int result = guess(mid);
      if(result == 0) {
        return mid;
      }
      else if (result == -1) {// 大于系统选择
        hi = mid - 1;
      }
      else if (result == 1) {
        lo = mid + 1;
      }
    }
    return 0;
  }

  private int guess(int mid) {
    int pick = 6;
    return mid == pick ? 0 : mid > pick ? -1 : 1;
  }
}
