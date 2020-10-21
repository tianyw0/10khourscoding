package com.tianyongwei.algorithm.leetcode;

import com.tianyongwei.algorithm.leetcode.common.TreeNode;

import java.util.LinkedList;
import java.util.List;
import java.util.Stack;

public class LeetCode0094BinaryTreeInorderTraversal2 {
    public List<Integer> inorderTraversal(TreeNode root) {
        List<Integer> ans = new LinkedList<>();
        Stack<TreeNode> stack = new Stack<>();

        if(root == null) return ans;

        // 下面完全模仿计算机处理递归的过程

        // 初始化栈
        stack.add(root);
        while (!stack.isEmpty()) {
            TreeNode node = stack.pop();
            if(node != null) {
                // 压栈
                // 压栈顺序是右中左
                if(node.right != null) stack.add(node.right);
                stack.add(node);
                stack.add(null);
                if(node.left != null) stack.add(node.left);
            } else {
                // 访问
                ans.add(stack.pop().val);
            }
        }
        System.out.println(ans);
        return ans;
    }

}
