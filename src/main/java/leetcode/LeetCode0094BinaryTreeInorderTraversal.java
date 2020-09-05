package leetcode;

import leetcode.common.TreeNode;

import java.util.LinkedList;
import java.util.List;

public class LeetCode0094BinaryTreeInorderTraversal {
    public List<Integer> inorderTraversal(TreeNode root) {
        List<Integer> ans = new LinkedList<>();
        getInorderElement(root, ans);
        return ans;
    }

    private void getInorderElement(TreeNode root, List<Integer> ans) {
        if(root == null) return;
        if(root.left != null) {
            getInorderElement(root.left, ans);
        }
        ans.add(root.val);
        if(root.right != null) {
            getInorderElement(root.right, ans);
        }
    }
}
