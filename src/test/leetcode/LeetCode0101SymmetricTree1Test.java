package leetcode;

import leetcode.common.TreeNode;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class LeetCode0101SymmetricTree1Test {

    LeetCode0101SymmetricTree1 symmetricTree
            = new LeetCode0101SymmetricTree1();

    @Test
    void isSymmetric() {
        assertEquals(true, symmetricTree.isSymmetric(null));
    }


    @Test
    void isSymmetric2() {
        TreeNode node = new TreeNode(1,
                new TreeNode(2, new TreeNode(3), new TreeNode(4)),
                new TreeNode(2, new TreeNode(4), new TreeNode(3))
        );

        assertEquals(true, symmetricTree.isSymmetric(node));
    }

    @Test
    void isSymmetric3() {
        TreeNode node = new TreeNode(1,
                new TreeNode(2, new TreeNode(3), new TreeNode(4)),
                new TreeNode(2, new TreeNode(3), new TreeNode(4))
        );
        assertEquals(false, symmetricTree.isSymmetric(node));
    }
}