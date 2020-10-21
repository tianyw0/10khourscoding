package com.tianyongwei.algorithm.leetcode;

import com.tianyongwei.algorithm.leetcode.common.TreeNode;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

class LeetCode0106ConstructBinaryTreefromInorderandPostorderTraversalTest {

    LeetCode0106ConstructBinaryTreefromInorderandPostorderTraversal l106
            = new LeetCode0106ConstructBinaryTreefromInorderandPostorderTraversal();

    @Test
    void buildTree() {
        TreeNode node = new TreeNode(3
                , new TreeNode(9)
                , new TreeNode(20, new TreeNode(15), new TreeNode(7)));
        assertEquals(node, l106.buildTree(new int[]{9,3,15,20,7}, new int[]{9,15,7,20,3}));
    }

    @Test
    void buildTree1() {
        TreeNode node = new TreeNode(3);
        assertEquals(node, l106.buildTree(new int[]{3}, new int[]{3}));
    }

    @Test
    void buildTree2() {
        TreeNode node = new TreeNode(1
                , new TreeNode(2, new TreeNode(4), new TreeNode(5))
                , new TreeNode(3, new TreeNode(6), new TreeNode(7)));
        assertEquals(node, l106.buildTree(new int[]{4,2,5,1,6,3,7}, new int[]{4,5,2,6,7,3,1}));
    }

    @Test
    void buildTree5() {
        TreeNode node = new TreeNode(2
                , new TreeNode(1)
                , new TreeNode(3, null, new TreeNode(4)));
        assertEquals(node, l106.buildTree(new int[]{1,2,3,4}, new int[]{1,4,3,2}));
    }

    @Test
    void buildTree6() {
        TreeNode node = new TreeNode(1
                , new TreeNode(2), null);
        assertEquals(node, l106.buildTree(new int[]{2,1}, new int[]{2,1}));
    }

    /**
     *输入：
     * [1,3,2]
     * [3,2,1]
     * 输出：
     * [1,null,2,2]
     * 预期结果：
     * [1,null,2,3]
     */
    @Test
    void buildTree7() {
        TreeNode node = new TreeNode(1
                , null
                , new TreeNode(2, new TreeNode(3), null));
        assertEquals(node, l106.buildTree(new int[]{1,3,2}, new int[]{3,2,1}));
    }

    @Test
    void buildTree3() {
        assertEquals(null, l106.buildTree(new int[]{}, new int[]{}));
    }

    @Test
    void buildTree4() {
        assertEquals(null, l106.buildTree(null, null));
    }
}