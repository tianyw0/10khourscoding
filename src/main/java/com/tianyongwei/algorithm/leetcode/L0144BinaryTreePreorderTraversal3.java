package com.tianyongwei.algorithm.leetcode;

import com.tianyongwei.algorithm.leetcode.common.TreeNode;

import java.util.LinkedList;
import java.util.List;
import java.util.Stack;

public class L0144BinaryTreePreorderTraversal3 {

  public List<Integer> preorderTraversal(TreeNode root) {
    Stack<TreeNode> stack = new Stack<TreeNode>();
    LinkedList<Integer> ans = new LinkedList<>();
    if (root == null) {
      return ans;
    }

    // 完全模拟计算机处理递归的过程

    // 初始化栈
    stack.add(root);
    while (!stack.isEmpty()) {
      TreeNode node = stack.pop();

      if(node != null) {
        // 压栈

        // 顺序：右左中
        if(node.right != null) stack.add(node.right);
        if(node.left != null) stack.add(node.left);
        stack.add(node);
        stack.add(null);
      } else {
        // 出栈，读取
        ans.add(stack.pop().val);
      }
    }
    System.out.println(ans);
    return ans;
  }
}