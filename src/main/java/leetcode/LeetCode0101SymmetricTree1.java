package leetcode;

import leetcode.common.TreeNode;

public class LeetCode0101SymmetricTree1 {
    public boolean isSymmetric(TreeNode root) {
        // 递归实现
        return check(root, root);
    }

    private boolean check(TreeNode left, TreeNode right) {

        if(left == null && right == null) {
            return true;
        }
        if(left == null) return false;
        if(right == null) return false;

        if(left.val == right.val && check(left.left, right.right) && check(left.right, right.left)) {
            return true;
        } else {
            return false;
        }
    }
}
