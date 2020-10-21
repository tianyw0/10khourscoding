package com.tianyongwei.algorithm.leetcode;

import com.tianyongwei.algorithm.leetcode.common.TreeNode;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

class LeetCode0236LowestCommonAncestorofaBinaryTreeTest {


    LeetCode0236LowestCommonAncestorofaBinaryTree l236
            = new LeetCode0236LowestCommonAncestorofaBinaryTree();
    @Test
    void lowestCommonAncestor() {
        assertEquals(null, l236.lowestCommonAncestor(null, null, null));
    }

    @Test
    void lowestCommonAncestor2() {
        TreeNode node = new TreeNode(3
                , new TreeNode(5, new TreeNode(6), new TreeNode(2, new TreeNode(7), new TreeNode(4)))
                , new TreeNode(1, new TreeNode(0), new TreeNode(8)));
        assertEquals(node.toString(), l236.lowestCommonAncestor(node, new TreeNode(5), new TreeNode(1)).toString());
    }

    @Test
    void lowestCommonAncestor3() {
        TreeNode node5 = new TreeNode(5, new TreeNode(6), new TreeNode(2, new TreeNode(7), new TreeNode(4)));
        TreeNode node = new TreeNode(3
                , node5
                , new TreeNode(1, new TreeNode(0), new TreeNode(8)));
        assertEquals(node5, l236.lowestCommonAncestor(node, new TreeNode(5), new TreeNode(4)));
    }
}