package com.tianyongwei.algorithm.leetcode;

public class LeetCode0034FindFirstandLastPositionofElementinSortedArray {
  public int[] searchRange(int[] nums, int target) {
    if(nums.length == 0) return new int[]{-1,-1};

    int first = findFirst(nums, target);
    int last = findLast(nums, target);

    return new int[]{first, last};
  }

  private int findLast(int[] nums, int target) {
    int index = -1;

    int lo = 0, hi = nums.length - 1;
    while(lo <= hi) {
      int mid = lo + ((hi - lo) >> 1);
      if(nums[mid] == target) {
        index = mid;
        lo = mid + 1;
      }
      else if(nums[mid] > target) {
        hi = mid - 1;
      }
      else if(nums[mid] < target) {
        lo = mid + 1;
      }
    }
    return index;
  }

  private int findFirst(int[] nums, int target) {
    int index = -1;

    int lo = 0, hi = nums.length - 1;
    while(lo <= hi) {
      int mid = lo + ((hi - lo) >> 1);
      if(nums[mid] == target) {
        index = mid;
        hi = mid - 1;
      }
      else if(nums[mid] > target) {
        hi = mid - 1;
      }
      else if(nums[mid] < target) {
        lo = mid + 1;
      }
    }
    return index;
  }
}
