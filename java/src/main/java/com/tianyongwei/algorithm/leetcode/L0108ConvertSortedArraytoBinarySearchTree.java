package com.tianyongwei.algorithm.leetcode;

import com.tianyongwei.algorithm.leetcode.common.TreeNode;

public class L0108ConvertSortedArraytoBinarySearchTree {
    public TreeNode sortedArrayToBST(int[] nums) {
        if(nums == null || nums.length == 0)
            return null;

        return getTreeNode(nums, 0, nums.length-1);
    }

    private TreeNode getTreeNode(int[] nums, int lo, int hi) {
        if(lo > hi) return null;

        int mid = lo + ((hi-lo) >> 1);
        TreeNode root = new TreeNode(nums[mid]);
        root.left = getTreeNode(nums, lo, mid-1);
        root.right = getTreeNode(nums, mid+1, hi);
        return root;
    }
}
