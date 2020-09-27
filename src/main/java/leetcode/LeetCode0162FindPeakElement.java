package leetcode;

public class LeetCode0162FindPeakElement {
    public int findPeakElement(int[] nums) {
        // 三种波峰的情况
        if(nums.length == 0) {
            return -1;
        }

        if(nums.length == 1) {
            return 0;
        }

        if(nums[0] > nums[1]) return 0;
        if(nums[nums.length-1] > nums[nums.length - 2]) return nums.length - 1;
        if(nums.length == 2 && nums[1] == nums[0]) {
            return -1;
        }

        int lo = 0;
        int hi = nums.length - 1;

        while (lo <= hi) {
            int mid = lo + (hi - lo) / 2;
            if(nums[mid-1] < nums[mid] && nums[mid] < nums[mid+1]) {
                return mid;
            }

            else if (nums[mid] <= nums[mid - 1]) {

            }

            else if (nums[mid+1] <= nums[mid]) {

            }
        }

        return -1;
    }
}
