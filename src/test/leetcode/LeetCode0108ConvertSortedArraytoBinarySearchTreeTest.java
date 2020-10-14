package leetcode;

import leetcode.common.TreeNode;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class LeetCode0108ConvertSortedArraytoBinarySearchTreeTest {

    @Test
    void sortedArrayToBST() {
        assertEquals(TreeNode.builder().val(1)
                        .build()
                , new LeetCode0108ConvertSortedArraytoBinarySearchTree().sortedArrayToBST(new int[]{1}));
    }
    @Test
    void sortedArrayToBST2() {
        assertEquals(TreeNode.builder().val(2)
                        .left(new TreeNode(1))
                        .right(new TreeNode(3))
                        .build()
                , new LeetCode0108ConvertSortedArraytoBinarySearchTree().sortedArrayToBST(new int[]{1,2,3}));
    }

    @Test
    void sortedArrayToBST3() {
        assertEquals(TreeNode.builder().val(1)
                        .right(new TreeNode(2))
                        .build()
                , new LeetCode0108ConvertSortedArraytoBinarySearchTree().sortedArrayToBST(new int[]{1,2}));
    }

}