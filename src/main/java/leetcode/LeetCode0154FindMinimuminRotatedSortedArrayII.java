package leetcode;

public class LeetCode0154FindMinimuminRotatedSortedArrayII {
    public int findMin(int[] nums) {
        int lo = 0, hi = nums.length - 1;
        int minVal = Integer.MAX_VALUE;
        while (lo <= hi) {
            int mid = lo + ((hi - lo) >> 1);
            int midVal = nums[mid];
            if(midVal <= minVal) {
                minVal = midVal;
                // left ordered
                // 1,3,3
                // 3,3,1
                // 3,3,3
                // 01x
                // 0: 00 01 0x 88812
                // 1: 10 11 1x
                // x: x0 x1
                if(nums[lo] <= nums[mid] && nums[mid] > nums[hi]) {
                    lo = mid + 1;
                } else {
                    hi = mid - 1;
                }
            }

            else if(midVal > minVal) {
                // left ordered
                if(nums[lo] <= nums[mid] && nums[mid] >= nums[hi]) {
                    lo = mid + 1;
                } else {
                    hi = mid - 1;
                }
            }
        }

        return minVal;
    }
}
