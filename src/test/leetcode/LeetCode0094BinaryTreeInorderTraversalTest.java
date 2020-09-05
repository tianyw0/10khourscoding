package leetcode;

import leetcode.common.TreeNode;
import org.junit.jupiter.api.Test;

import java.util.LinkedList;
import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

class LeetCode0094BinaryTreeInorderTraversalTest {
    LeetCode0094BinaryTreeInorderTraversal binaryTreeInorderTraversal
            = new LeetCode0094BinaryTreeInorderTraversal();


    @Test
    void preorderTraversal() {
        TreeNode treeNode = new TreeNode(1);
        TreeNode node = new TreeNode(2);
        node.left = new TreeNode(3);
        treeNode.right = node;

        List<Integer> list = binaryTreeInorderTraversal.inorderTraversal(treeNode);
        assertIterableEquals(new LinkedList<Integer>(){{
            add(1);
            add(3);
            add(2);
        }}, list);
    }

    @Test
    void preorderTraversal2() {
        TreeNode treeNode = new TreeNode(1);
        TreeNode node = new TreeNode(5);
        node.left = new TreeNode(3);
        node.right = new TreeNode(6);
        treeNode.right = node;

        List<Integer> list = binaryTreeInorderTraversal.inorderTraversal(treeNode);
        assertIterableEquals(new LinkedList<Integer>(){{
            add(1);
            add(3);
            add(5);
            add(6);
        }}, list);
    }
}