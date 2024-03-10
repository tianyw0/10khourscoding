package com.tianyongwei.algorithm.leetcode;

import com.tianyongwei.algorithm.leetcode.common.TreeNode;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

class L0297SerializeandDeserializeBinaryTreeTest {

    L0297SerializeandDeserializeBinaryTree l297
            = new L0297SerializeandDeserializeBinaryTree();

    @Test
    void serialize() {
        assertEquals("[]", l297.serialize(null));
    }

    @Test
    void serialize2() {
        TreeNode node = new TreeNode(1
                , new TreeNode(2)
                , new TreeNode(3, new TreeNode(4), new TreeNode(5)));

        assertEquals("[1,2,3,null,null,4,5]", l297.serialize(node));
    }

    @Test
    void serialize3() {
        TreeNode node = new TreeNode(1
                , new TreeNode(2, new TreeNode(6), null)
                , new TreeNode(3, new TreeNode(4), new TreeNode(5, new TreeNode(6), null)));

        assertEquals("[1,2,3,6,null,4,5,null,null,null,null,6]", l297.serialize(node));
    }

    @Test
    void deserialize2() {
        assertEquals(null, l297.deserialize("[]"));
    }

    @Test
    void deserialize() {
        TreeNode node = new TreeNode(1
                , new TreeNode(2)
                , new TreeNode(3, new TreeNode(4), new TreeNode(5)));

        assertEquals(node.toString(), l297.deserialize("[1,2,3,null,null,4,5]").toString());
    }

    @Test
    void deserialize3() {
        TreeNode node = new TreeNode(1);

        assertEquals(node.toString(), l297.deserialize("[1]").toString());
    }
}