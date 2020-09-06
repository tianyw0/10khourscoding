package leetcode;

import leetcode.common.TreeNode;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class LeetCode0106ConstructBinaryTreefromInorderandPostorderTraversalTest {

    LeetCode0106ConstructBinaryTreefromInorderandPostorderTraversal traversal
            = new LeetCode0106ConstructBinaryTreefromInorderandPostorderTraversal();

    @Test
    void buildTree() {
        TreeNode node = new TreeNode(3
                , new TreeNode(9)
                , new TreeNode(20, new TreeNode(15), new TreeNode(7)));
        assertEquals(node, traversal.buildTree(new int[]{9,3,15,20,7}, new int[]{9,15,7,20,3}));
    }

    @Test
    void buildTree2() {
        TreeNode node = new TreeNode(1
                , new TreeNode(2, new TreeNode(4), new TreeNode(5))
                , new TreeNode(3, new TreeNode(6), new TreeNode(7)));
        assertEquals(node, traversal.buildTree(new int[]{4,2,5,1,6,3,7}, new int[]{4,5,2,6,7,3,1}));
    }
}