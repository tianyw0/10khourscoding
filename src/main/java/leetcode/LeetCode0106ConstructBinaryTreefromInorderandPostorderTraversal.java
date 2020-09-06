package leetcode;

import leetcode.common.TreeNode;

import java.util.HashMap;
import java.util.LinkedList;
import java.util.Map;
import java.util.Queue;

public class LeetCode0106ConstructBinaryTreefromInorderandPostorderTraversal {

    /**
     * TreeNode node = new TreeNode(1
     *                 , new TreeNode(2, new TreeNode(4), new TreeNode(5))
     *                 , new TreeNode(3, new TreeNode(6), new TreeNode(7)));
     *         assertEquals(node, traversal.buildTree(new int[]{4,2,5,1,6,3,7}, new int[]{4,5,2,6,7,3,1}));
     * @param inorder
     * @param postorder
     * @return
     */
    public TreeNode buildTree(int[] inorder, int[] postorder) {

        Map<Integer, Integer> map = new HashMap<Integer, Integer>(){{
            for (int i = 0; i < inorder.length; i++) {
                put(inorder[i], i);
            }
        }};


        int root = postorder[postorder.length - 1];
        TreeNode rootNode = new TreeNode(root);
        // 初始化队列
        Queue<Integer> queue = new LinkedList<>();
        queue.add(root);
        ;
        return rootNode;
    }

    private void build(TreeNode rootNode, int root, Map<Integer, Integer> map, int lo, int hi) {
        // 构建左子树
        // 构建右子树
//        build(lo, map.get(root))

    }
}
