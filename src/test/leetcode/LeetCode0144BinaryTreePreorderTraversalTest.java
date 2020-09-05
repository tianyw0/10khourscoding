package leetcode;

import leetcode.common.TreeNode;
import org.junit.jupiter.api.Test;

class LeetCode0144BinaryTreePreorderTraversalTest {

  LeetCode0144BinaryTreePreorderTraversal binaryTreePreorderTraversal
          = new LeetCode0144BinaryTreePreorderTraversal();

  @Test
  void preorderTraversal() {
    TreeNode treeNode = new TreeNode(1);
    binaryTreePreorderTraversal.preorderTraversal(treeNode);
  }
}