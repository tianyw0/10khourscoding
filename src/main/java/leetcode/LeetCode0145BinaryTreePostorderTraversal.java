package leetcode;

import leetcode.common.TreeNode;

import java.util.LinkedList;
import java.util.List;

public class LeetCode0145BinaryTreePostorderTraversal {
    public List<Integer> postorderTraversal(TreeNode root) {
        LinkedList<Integer> ans = new LinkedList<>();
        post(root, ans);
        return ans;
    }

    private void post(TreeNode root, LinkedList<Integer> ans) {
        if(root == null) return;
        if(root.right != null) {
            post(root.left, ans);
        }
        if(root.left != null) {
            post(root.left, ans);
        }
        ans.add(root.val);
    }
}
