package com.tianyongwei.algorithm.leetcode;

import com.tianyongwei.algorithm.leetcode.common.TreeNode;
import org.junit.jupiter.api.Test;

import java.util.LinkedList;
import java.util.List;

import static org.junit.jupiter.api.Assertions.assertIterableEquals;

class LeetCode0145BinaryTreePostorderTraversal1Test {

    LeetCode0145BinaryTreePostorderTraversal1 binaryTreePostorderTraversal
            = new LeetCode0145BinaryTreePostorderTraversal1();

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