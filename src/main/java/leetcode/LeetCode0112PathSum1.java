package leetcode;

import leetcode.common.TreeNode;

import java.util.Stack;

public class LeetCode0112PathSum1 {

    public boolean hasPathSum(TreeNode root, int sum) {
        return equal(root, sum);
    }

    private boolean equal(TreeNode node, int sum) {
        if(node == null) {
            return false;
        }

        if(node.left == null && node.right == null && node.val == sum) {
            return true;
        }

        return equal(node.left, sum - node.val) || equal(node.right, sum - node.val);
    }
}
