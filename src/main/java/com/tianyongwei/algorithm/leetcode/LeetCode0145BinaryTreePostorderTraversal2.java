package com.tianyongwei.algorithm.leetcode;

import com.tianyongwei.algorithm.leetcode.common.TreeNode;

import java.util.LinkedList;
import java.util.List;
import java.util.Stack;

public class LeetCode0145BinaryTreePostorderTraversal2 {
    public List<Integer> postorderTraversal(TreeNode root) {
        LinkedList<Integer> ans = new LinkedList<>();
        Stack<TreeNode> stack = new Stack<>();

        if(root == null) return ans;

        // 完全按照计算机处理递归的方式处理

        // 初始化栈
        stack.add(root);
        while (!stack.isEmpty()) {
            TreeNode node = stack.pop();
            if(node != null) {
                // 压栈

                // 顺序中右左
                stack.add(node);
                stack.add(null);
                if(node.right != null) {
                    stack.add(node.right);
                }
                if (node.left != null) {
                    stack.add(node.left);
                }
            } else {
                // 出栈，读取
                ans.add(stack.pop().val);
            }
        }
        System.out.println(ans);
        return ans;
    }
}
