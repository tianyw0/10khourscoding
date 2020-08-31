package leetcode;

public class LeetCode0035SearchInsertPosition {
    public int searchInsert(int[] nums, int target) {
        if(target <= nums[0]) return 0;
        if(target > nums[nums.length-1]) return nums.length;

        // 从1开始
        int lo = 1, hi = nums.length-1;
        int mid = 0;

        // 确定好初始的单调区间，期望在这个区间的终点找到目标
        // 重复这个动作
        while(lo <= hi) {
            mid = lo + (hi - lo) / 2;
            if(nums[mid-1] < target && target <= nums[mid]) {
                return mid;
            } else if(target <= nums[mid-1]) {
                hi = mid-1; // 重新从[lo,mid-1]区间寻找
            } else if(nums[mid] < target) {
                lo = mid+1; // 重新从[mid+1, hi]区间寻找
            }
        }
        return 0; // 不可能走到这里
    }
}
