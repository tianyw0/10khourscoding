package com.tianyongwei.algorithm.leetcode;

import com.tianyongwei.algorithm.leetcode.common.TreeNode;

import java.util.LinkedList;
import java.util.List;

public class L0094BinaryTreeInorderTraversal1 {
    public List<Integer> inorderTraversal(TreeNode root) {
        List<Integer> ans = new LinkedList<>();
        inorder(root, ans);
        return ans;
    }

    private void inorder(TreeNode root, List<Integer> ans) {
        if(root == null) return;
        if(root.left != null) {
            inorder(root.left, ans);
        }
        ans.add(root.val);
        if(root.right != null) {
            inorder(root.right, ans);
        }
    }
}
