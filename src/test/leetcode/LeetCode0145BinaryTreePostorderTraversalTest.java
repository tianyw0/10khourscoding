package leetcode;

import leetcode.common.TreeNode;
import org.junit.jupiter.api.Test;

import java.util.LinkedList;
import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

class LeetCode0145BinaryTreePostorderTraversalTest {

    LeetCode0145BinaryTreePostorderTraversal binaryTreePostorderTraversal
            = new LeetCode0145BinaryTreePostorderTraversal();

    @Test
    void preorderTraversal() {
        TreeNode rootNode = new TreeNode(1, null,
                new TreeNode(2, new TreeNode(3), null));

        List<Integer> list = binaryTreePostorderTraversal.postorderTraversal(rootNode);
        assertIterableEquals(new LinkedList<Integer>(){{
            add(3);
            add(2);
            add(1);
        }}, list);
    }

    @Test
    void preorderTraversal2() {
        TreeNode rootNode = new TreeNode(1, null,
                new TreeNode(3, new TreeNode(5), new TreeNode(6)));

        List<Integer> list = binaryTreePostorderTraversal.postorderTraversal(rootNode);
        assertIterableEquals(new LinkedList<Integer>(){{
            add(5);
            add(6);
            add(3);
            add(1);
        }}, list);
    }
}