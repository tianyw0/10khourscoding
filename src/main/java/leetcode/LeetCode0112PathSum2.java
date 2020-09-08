package leetcode;

import leetcode.common.TreeNode;

import java.util.LinkedList;
import java.util.Queue;

public class LeetCode0112PathSum2 {

    public boolean hasPathSum(TreeNode root, int sum) {

        if (root == null) {
            return false;
        }
        // 完全模仿计算机的递归实现

        // 初始化队列
        Queue<TreeNode> nodes = new LinkedList<>();
        nodes.add(root);

        // 需要双队列
        Queue<Integer> sums = new LinkedList<>();
        sums.add(root.val);
        while (!nodes.isEmpty()){
            TreeNode node = nodes.poll();
            Integer curr = sums.poll();
            if(node.left != null || node.right != null) {
                // 有子节点，入队
                if(node.left != null) {
                    nodes.add(node.left);
                    sums.add(curr + node.left.val);
                }
                if (node.right != null) {
                    nodes.add(node.right);
                    sums.add(curr + node.right.val);
                }
            } else {
                // 无子节点，出队
                if(curr == sum) return true;
            }
        }

        return false;
    }
}
