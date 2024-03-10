package com.tianyongwei.algorithm.leetcode;

import com.tianyongwei.algorithm.leetcode.common.TreeNode;

import java.util.LinkedList;
import java.util.List;
import java.util.Queue;

public class L0102BinaryTreeLevelOrderTraversal {
    public List<List<Integer>> levelOrder(TreeNode root) {
        List<List<Integer>> ans = new LinkedList<>();
        Queue<TreeNode> queue = new LinkedList<>();

        if(root == null) return ans;

        // 初始化队列
        // 一层层处理
        queue.add(root);
        while (!queue.isEmpty()) {
            int size = queue.size();
            LinkedList<Integer> list = new LinkedList<>();
            for (int i = 0; i < size; i++) {
                TreeNode node = queue.poll();
                list.add(node.val);
                if(node.left != null) queue.add(node.left);
                if(node.right != null) queue.add(node.right);
            }
            ans.add(list);
        }
        System.out.println(ans);
        return ans;
    }
}
