package leetcode;

import leetcode.common.TreeNode;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

class LeetCode0112PathSum2Test {

    LeetCode0112PathSum2 pathSum
            = new LeetCode0112PathSum2();

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