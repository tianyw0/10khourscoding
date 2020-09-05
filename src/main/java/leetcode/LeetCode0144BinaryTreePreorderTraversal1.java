package leetcode;

import leetcode.common.TreeNode;

import java.util.LinkedList;
import java.util.List;

public class LeetCode0144BinaryTreePreorderTraversal1 {

  List<Integer> stack = new LinkedList<>();

  public List<Integer> preorderTraversal(TreeNode root) {
    printTreeNode_digui(root);
    return stack;
  }

  private void printTreeNode_digui(TreeNode root) {
    if(root != null) {
      stack.add(root.val);
      if(root.left != null)
        printTreeNode_digui(root.left);
      if(root.right != null)
        printTreeNode_digui(root.right);
    }
  }

}