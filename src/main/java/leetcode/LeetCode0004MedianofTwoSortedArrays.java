package leetcode;

import java.util.Stack;

public class LeetCode0004MedianofTwoSortedArrays {
    public double findMedianSortedArrays(int[] nums1, int[] nums2) {
        int lengthSum = nums1.length + nums2.length;
        int num1 = getKthNum(nums1, nums2, lengthSum / 2);
        int num2 = getKthNum(nums1, nums2, lengthSum % 2 == 1 ? lengthSum / 2 : lengthSum / 2 -1);
        return (num1 + num2) / 2.0;
    }

    private int getKthNum(int[] nums1, int[] nums2, int kth) {
        // 双指针
        int point1 = 0;
        int point2 = 0;

        Stack<Integer> stack = new Stack<>();
        while (stack.size() < kth+1) {
            if(point1 == nums1.length) {
                stack.add(nums2[point2]);
                point2++;
            }
            else if(point2 == nums2.length) {
                stack.add(nums1[point1]);
                point1++;
            }

            else if(nums1[point1] < nums2[point2]) {
                stack.add(nums1[point1]);
                point1++;
            } else {
                stack.add(nums2[point2]);
                point2++;
            }
        }

        return stack.pop();
    }
}
