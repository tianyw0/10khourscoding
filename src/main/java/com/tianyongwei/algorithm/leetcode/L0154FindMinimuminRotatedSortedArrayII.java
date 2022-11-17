package com.tianyongwei.algorithm.leetcode;

public class L0154FindMinimuminRotatedSortedArrayII {
    // https://leetcode-cn.com/problems/find-minimum-in-rotated-sorted-array-ii/solution/tong-guo-hua-tu-lai-shen-ke-li-jie-er-fen-fa-by-ch/
    public int findMin(int[] nums) {
        int lo = 0, hi = nums.length - 1;
        while (lo <= hi) {
            int mid = lo + ((hi - lo) >> 1);
            int midVal = nums[mid];
            if(midVal > nums[hi]) {
                lo = mid + 1;
            } else if(midVal < nums[hi]) {
                hi = mid;
            } else if(midVal == nums[hi]){
                hi--;
            }
        }
        return nums[lo];
    }
}
