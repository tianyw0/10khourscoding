package com.tianyongwei.algorithm.leetcode;

import com.tianyongwei.algorithm.leetcode.common.TreeNode;
import org.junit.jupiter.api.Test;

import java.util.LinkedList;

import static org.junit.jupiter.api.Assertions.assertIterableEquals;

class L0094BinaryTreeInorderTraversal2Test {

    L0094BinaryTreeInorderTraversal2 binaryTreeInorderTraversal2
            = new L0094BinaryTreeInorderTraversal2();
    @Test
    void inorderTraversal() {
        TreeNode node = new TreeNode(1, null, new TreeNode(2, new TreeNode(3), null));
        assertIterableEquals(new LinkedList<Integer>(){{
            add(1);
            add(3);
            add(2);
        }}, binaryTreeInorderTraversal2.inorderTraversal(node));
    }

    @Test
    void inorderTraversal2() {

        TreeNode node = new TreeNode(1,  new TreeNode(2), new TreeNode(3));
        assertIterableEquals(new LinkedList<Integer>(){{
            add(2);
            add(1);
            add(3);
        }}, binaryTreeInorderTraversal2.inorderTraversal(node));
    }

    @Test
    void inorderTraversal3() {
        TreeNode node = new TreeNode(1,  null, new TreeNode(2, new TreeNode(3), new TreeNode(4)));
        assertIterableEquals(new LinkedList<Integer>(){{
            add(1);
            add(3);
            add(2);
            add(4);
        }}, binaryTreeInorderTraversal2.inorderTraversal(node));
    }
}