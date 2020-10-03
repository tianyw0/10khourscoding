package leetcode;

public class LeetCode0034FindFirstandLastPositionofElementinSortedArray {
  public int[] searchRange(int[] nums, int target) {
    if(nums.length == 0) return new int[]{-1,-1};

    int first = -1, last = -1;
    if(nums[0] == target) first = 0;
    else {
      int lo = 1, hi = nums.length - 1;
      while (lo <= hi) {
        int mid = lo + (hi - lo) / 2;
        /**
         * 1. nums[mid-1] < nums[mid]
         *    1.1 3种情况
         * 2. nums[mid-1] = nums[mid]
         *    2.1 3种情况
         */
        if(nums[mid - 1] < nums[mid]) {
          if(nums[mid] == target) {
            lo = mid;
            break;
          } else if(nums[mid - 1] < target && target < nums[mid] ) {
            return new int[] {-1, -1};
          } else if(target <= nums[mid - 1]) {
            hi = mid - 1;
          }
        } else if(nums[mid - 1] == nums[mid]) {
          if(nums[mid] == target) {
            hi = mid - 1;
          } else if(nums[mid] > target) {
            hi = mid - 1;
          } else if(nums[mid] < target) {
            lo = mid + 1;
          }
        }
      }
    }

    if(nums[nums.length - 1] == target) {
      last = nums.length - 1;
    } else {
      int lo = 0, hi = nums.length - 2;
      while (lo <= hi) {
        int mid = lo + (hi - lo) / 2;
        if(nums[mid] == target && target < nums[mid+1]) {
          last = mid;
          break;
        }

        else if(target < nums[mid]) {
          hi = mid - 1;
        }

        else if(nums[mid] <= target) {
          lo = mid + 1;
        }
      }
    }

    return new int[]{first, last};
  }
}
