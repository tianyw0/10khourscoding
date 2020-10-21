package com.tianyongwei.algorithm.leetcode;

import com.tianyongwei.algorithm.leetcode.common.TreeNode;

public class LeetCode0236LowestCommonAncestorofaBinaryTree {
    public TreeNode lowestCommonAncestor(TreeNode root, TreeNode p, TreeNode q) {
        return dp(root, p, q);
    }

    // 返回的结果要么pq中的一个，要么pq的父节点，也就是祖先节点
    private TreeNode dp(TreeNode root, TreeNode p, TreeNode q) {
        if(root == null) return null;
        if(root.val == p.val) return root;
        if(root.val == q.val) return root;

        TreeNode left = dp(root.left, p, q);
        TreeNode right = dp(root.right, p, q);

        if(left != null && right != null) {
            return root;
        }
        return left != null ? left : right;
    }
}
