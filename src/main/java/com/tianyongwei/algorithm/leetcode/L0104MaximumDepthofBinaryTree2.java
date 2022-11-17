package com.tianyongwei.algorithm.leetcode;

import com.tianyongwei.algorithm.leetcode.common.TreeNode;

import java.util.LinkedList;
import java.util.Queue;

public class L0104MaximumDepthofBinaryTree2 {

    public int maxDepth(TreeNode root) {
        if (root == null) {
            return 0;
        }
        // 采用广度优先搜索的方式
        // 初始化队列
        Queue<TreeNode> queue = new LinkedList<>();
        queue.add(root);

        // 一层层遍历，每一层+1
        int ans = 0;
        while(!queue.isEmpty()) {
            int size = queue.size();
            for (int i = 0; i < size; i++) {
                TreeNode node = queue.poll();
                if (node.left != null) {
                    queue.add(node.left);
                }
                if (node.right != null) {
                    queue.add(node.right);
                }
            }
            ans++;
        }

        return ans;
    }
}
