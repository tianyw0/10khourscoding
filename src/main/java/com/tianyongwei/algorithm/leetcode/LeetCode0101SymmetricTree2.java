package com.tianyongwei.algorithm.leetcode;

import com.tianyongwei.algorithm.leetcode.common.TreeNode;

import java.util.LinkedList;
import java.util.Queue;

public class LeetCode0101SymmetricTree2 {
    public boolean isSymmetric(TreeNode root) {
        // 使用队列模拟递归实现
        // 初始化队列
        Queue<TreeNode> queue = new LinkedList<>();
        queue.add(root);
        queue.add(root);

        while(!queue.isEmpty()) {
            TreeNode left = queue.poll();
            TreeNode right = queue.poll();

            if(left == null && right == null) continue;

            // 根节点不等
            if(left == null) {
                return false;
            }
            if(right == null) {
                return false;
            }
            if(left.val != right.val) {
                return false;
            }

            queue.add(left.left);
            queue.add(right.right);

            queue.add(left.right);
            queue.add(right.left);
        }
        return true;
    }
}
