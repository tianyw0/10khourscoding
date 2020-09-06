package leetcode;

import leetcode.common.TreeNode;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class LeetCode0297SerializeandDeserializeBinaryTreeTest {

    LeetCode0297SerializeandDeserializeBinaryTree l297
            = new LeetCode0297SerializeandDeserializeBinaryTree();

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
    void deserialize2() {
        assertEquals(null, l297.deserialize("[]"));
    }

    @Test
    void deserialize() {
        TreeNode node = new TreeNode(1
                , new TreeNode(2)
                , new TreeNode(3, new TreeNode(4), new TreeNode(5)));

        assertEquals(node, l297.deserialize("[1,2,3,null,null,4,5]"));
    }
}