package com.tianyongwei.algorithm.leetcode;

public class L0033SearchinRotatedSortedArray {
  public int search(int[] nums, int target) {

    int lo = 0, hi = nums.length - 1;
    while (lo <= hi) {
      int mid = lo + ((hi - lo) >> 1);
      if(nums[mid] == target) return mid;

      else if(nums[mid] > target) {
        // 左边有序
        if(nums[lo] <= nums[mid]) {
          if(nums[lo] <= target) {
            hi = mid - 1;
          } else {
            lo = mid + 1;
          }
        }
        // 右边有序
        else if(nums[mid] < nums[hi]) {
          hi = mid - 1;
        }
      }
      else if(nums[mid] < target) {
        // 左边有序
        if(nums[lo] <= nums[mid]) {
          lo = mid + 1;
        }

        // 右边有序
        else if(nums[mid] < nums[hi]) {
          if(nums[hi] >= target) {
            lo = mid + 1;
          }
          else {
            hi = mid - 1;
          }
        }
      }
    }
    return -1;
  }
}
