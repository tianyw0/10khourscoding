package leetcode;

import java.util.HashSet;
import java.util.Set;

public class LeetCode0287FindtheDuplicateNumber {
  public int findDuplicate(int[] nums) {

    Set<Integer> set = new HashSet<>();
    for (int i = 0; i < nums.length; i++) {
      if(set.contains(Integer.valueOf(nums[i]))) return nums[i];
      else set.add(Integer.valueOf(nums[i]));
    }
    return 0;
  }
}
