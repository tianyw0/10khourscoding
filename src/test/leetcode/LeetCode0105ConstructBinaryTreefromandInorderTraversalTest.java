package leetcode;

import leetcode.common.TreeNode;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class LeetCode0105ConstructBinaryTreefromandInorderTraversalTest {

    LeetCode0105ConstructBinaryTreefromandInorderTraversal l105
            = new LeetCode0105ConstructBinaryTreefromandInorderTraversal();

    @Test
    void buildTree() {
        TreeNode node = new TreeNode(3
                , new TreeNode(9)
                , new TreeNode(20, new TreeNode(15), new TreeNode(7)));
        assertEquals(node, l105.buildTree(new int[]{3,9,20,15,7}, new int[]{9,3,15,20,7}));
    }

    @Test
    void buildTree1() {
        TreeNode node = new TreeNode(1, new TreeNode(2), null);
        assertEquals(node, l105.buildTree(new int[]{1,2}, new int[]{2,1}));
    }

    @Test
    void buildTree3() {
        TreeNode node = new TreeNode(3, new TreeNode(1, null, new TreeNode(2)), new TreeNode(4));
        assertEquals(node, l105.buildTree(new int[]{3,1,2,4}, new int[]{1,2,3,4}));
    }
}