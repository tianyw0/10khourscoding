package com.tianyongwei.algorithm.leetcode;

import com.tianyongwei.algorithm.leetcode.common.TreeNode;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

class LeetCode0104MaximumDepthofBinaryTree2Test {

    LeetCode0104MaximumDepthofBinaryTree2 maximumDepthofBinaryTree
            = new LeetCode0104MaximumDepthofBinaryTree2();

    @Test
    void maxDepth() {
        assertEquals(0, maximumDepthofBinaryTree.maxDepth(null));
    }

    @Test
    void maxDepth2() {
        TreeNode node = new TreeNode(1,new TreeNode(2, new TreeNode(3), null), null);
        assertEquals(3, maximumDepthofBinaryTree.maxDepth(node));
    }

    @Test
    void maxDepth3() {
        TreeNode node = new TreeNode(3,new TreeNode(9), new TreeNode(20, new TreeNode(15), new TreeNode(7)));
        assertEquals(3, maximumDepthofBinaryTree.maxDepth(node));
    }
}