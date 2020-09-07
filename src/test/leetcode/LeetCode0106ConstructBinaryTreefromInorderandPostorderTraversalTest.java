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
    void buildTree1() {
        TreeNode node = new TreeNode(3);
        assertEquals(node, traversal.buildTree(new int[]{3}, new int[]{3}));
    }

    @Test
    void buildTree2() {
        TreeNode node = new TreeNode(1
                , new TreeNode(2, new TreeNode(4), new TreeNode(5))
                , new TreeNode(3, new TreeNode(6), new TreeNode(7)));
        assertEquals(node, traversal.buildTree(new int[]{4,2,5,1,6,3,7}, new int[]{4,5,2,6,7,3,1}));
    }

    @Test
    void buildTree5() {
        TreeNode node = new TreeNode(2
                , new TreeNode(1)
                , new TreeNode(3, null, new TreeNode(4)));
        assertEquals(node, traversal.buildTree(new int[]{1,2,3,4}, new int[]{1,4,3,2}));
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
    void buildTree6() {
        TreeNode node = new TreeNode(1
                , new TreeNode(2), null);
        assertEquals(node, traversal.buildTree(new int[]{2,1}, new int[]{2,1}));
    }

    @Test
    void buildTree3() {
        assertEquals(null, traversal.buildTree(new int[]{}, new int[]{}));
    }

    @Test
    void buildTree4() {
        assertEquals(null, traversal.buildTree(null, null));
    }
}