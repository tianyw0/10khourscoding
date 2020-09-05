package leetcode;

import leetcode.common.TreeNode;

import java.util.LinkedList;
import java.util.List;

public class LeetCode0094BinaryTreeInorderTraversal1 {
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
