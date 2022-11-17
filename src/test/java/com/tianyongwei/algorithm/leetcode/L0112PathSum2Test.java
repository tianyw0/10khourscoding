package com.tianyongwei.algorithm.leetcode;

import com.tianyongwei.algorithm.leetcode.common.TreeNode;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

class L0112PathSum2Test {

    L0112PathSum2 pathSum
            = new L0112PathSum2();

    @Test
    void hasPathSum() {
        TreeNode node = new TreeNode(5,
                new TreeNode(4, new TreeNode(11, new TreeNode(7), new TreeNode(2)), null),
                new TreeNode(8, new TreeNode(13), new TreeNode(4, null, new TreeNode(1))));

        assertEquals(true, pathSum.hasPathSum(node, 22));
    }

    @Test
    void hasPathSum2() {
        TreeNode node = new TreeNode(5,
                new TreeNode(4, new TreeNode(11, new TreeNode(7), new TreeNode(2)), null),
                new TreeNode(8, new TreeNode(13), new TreeNode(4, null, new TreeNode(1))));

        assertEquals(true, pathSum.hasPathSum(node, 26));
    }
}