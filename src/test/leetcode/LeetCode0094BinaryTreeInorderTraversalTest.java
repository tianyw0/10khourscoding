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
        TreeNode rootNode = new TreeNode(1, null,
                new TreeNode(2, new TreeNode(3), null));

        List<Integer> list = binaryTreeInorderTraversal.inorderTraversal(rootNode);
        assertIterableEquals(new LinkedList<Integer>(){{
            add(1);
            add(3);
            add(2);
        }}, list);
    }

    @Test
    void preorderTraversal2() {
        TreeNode rootNode = new TreeNode(1, null,
                new TreeNode(3, new TreeNode(5), new TreeNode(6)));

        List<Integer> list = binaryTreeInorderTraversal.inorderTraversal(rootNode);
        assertIterableEquals(new LinkedList<Integer>(){{
            add(1);
            add(5);
            add(3);
            add(6);
        }}, list);
    }
}