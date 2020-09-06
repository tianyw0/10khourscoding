package leetcode;

import leetcode.common.TreeNode;

public class LeetCode0104MaximumDepthofBinaryTree1 {
    public int maxDepth(TreeNode root) {
        if(root == null) {
            return 0;
        }

        int ans = 1;
        ans += Math.max(maxDepth(root.left), maxDepth(root.right));
        return ans;
    }
}
