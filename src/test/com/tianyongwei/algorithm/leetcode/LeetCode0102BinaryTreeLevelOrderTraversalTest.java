package com.tianyongwei.algorithm.leetcode;

import com.tianyongwei.algorithm.leetcode.common.TreeNode;
import org.junit.jupiter.api.Test;

import java.util.LinkedList;

import static org.junit.jupiter.api.Assertions.assertIterableEquals;

class LeetCode0102BinaryTreeLevelOrderTraversalTest {

    LeetCode0102BinaryTreeLevelOrderTraversal binaryTreeLevelOrderTraversal
            = new LeetCode0102BinaryTreeLevelOrderTraversal();

    @Test
    void levelOrder() {


        TreeNode node =
                new TreeNode(3,new TreeNode(9),
                        new TreeNode(20, new TreeNode(15), new TreeNode(7)));

        assertIterableEquals(new LinkedList<LinkedList<Integer>>(){{
            add(new LinkedList<Integer>(){{
                add(3);
            }});
            add(new LinkedList<Integer>(){{
                add(9);
                add(20);
            }});
            add(new LinkedList<Integer>(){{
                add(15);
                add(7);
            }});
        }}, binaryTreeLevelOrderTraversal.levelOrder(node));
    }
}