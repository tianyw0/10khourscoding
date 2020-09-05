package leetcode;

import leetcode.common.TreeNode;
import org.junit.jupiter.api.Test;

import java.util.LinkedList;
import java.util.List;
import static org.junit.jupiter.api.Assertions.*;

class LeetCode0144BinaryTreePreorderTraversal1Test {

  LeetCode0144BinaryTreePreorderTraversal1 binaryTreePreorderTraversal
          = new LeetCode0144BinaryTreePreorderTraversal1();

  @Test
  void preorderTraversal() {
    TreeNode treeNode = new TreeNode(1);
    treeNode.left = null;
    TreeNode node = new TreeNode(2);
    node.left = new TreeNode(3);
    treeNode.right = node;

    List<Integer> list = binaryTreePreorderTraversal.preorderTraversal(treeNode);
    assertIterableEquals(new LinkedList<Integer>(){{
      add(1);
      add(2);
      add(3);
    }}, list);
  }

  @Test
  void preorderTraversal2() {
    TreeNode treeNode = new TreeNode(1);
    TreeNode node = new TreeNode(5);
    node.left = new TreeNode(3);
    node.right = new TreeNode(6);
    treeNode.right = node;

    List<Integer> list = binaryTreePreorderTraversal.preorderTraversal(treeNode);
    assertIterableEquals(new LinkedList<Integer>(){{
      add(1);
      add(5);
      add(3);
      add(6);
    }}, list);
  }
}