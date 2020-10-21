package com.tianyongwei.algorithm.leetcode;

import com.tianyongwei.algorithm.leetcode.common.TreeNode;

import java.util.LinkedList;
import java.util.List;

public class LeetCode0145BinaryTreePostorderTraversal1 {
    public List<Integer> postorderTraversal(TreeNode root) {
        LinkedList<Integer> ans = new LinkedList<>();
        postorder(root, ans);
        return ans;
    }

    private void postorder(TreeNode root, LinkedList<Integer> ans) {
        if(root == null) return;
        if(root.left != null) {
            postorder(root.left, ans);
        }
        if(root.right != null) {
            postorder(root.right, ans);
        }
        ans.add(root.val);
    }
}
