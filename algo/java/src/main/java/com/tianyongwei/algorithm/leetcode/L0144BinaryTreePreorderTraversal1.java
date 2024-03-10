package com.tianyongwei.algorithm.leetcode;

import com.tianyongwei.algorithm.leetcode.common.TreeNode;

import java.util.LinkedList;
import java.util.List;

public class L0144BinaryTreePreorderTraversal1 {

  List<Integer> stack = new LinkedList<>();

  public List<Integer> preorderTraversal(TreeNode root) {
    preorder(root);
    return stack;
  }

  private void preorder(TreeNode root) {
    if(root != null) {
      stack.add(root.val);
      if(root.left != null)
        preorder(root.left);
      if(root.right != null)
        preorder(root.right);
    }
  }

}