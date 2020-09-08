package leetcode;

import leetcode.common.TreeNode;

import java.util.HashMap;
import java.util.Map;

public class LeetCode0106ConstructBinaryTreefromInorderandPostorderTraversal1 {

    public TreeNode buildTree(int[] inorder, int[] postorder) {
        if(inorder == null || inorder.length == 0) {
            return null;
        }
        Map<Integer, Integer> inMap = new HashMap<Integer, Integer>(){{
            for (int i = 0; i < inorder.length; i++) {
                put(inorder[i], i);
            }
        }};
        Map<Integer, Integer> postMap = new HashMap<Integer, Integer>(){{
            for (int i = 0; i < postorder.length; i++) {
                put(postorder[i], i);
            }
        }};
        // 重点是理解：根是处理一棵树的最小单位，因为根是一棵树的最小必要元素
        return build(inMap, postMap, inorder, 0, inorder.length-1, postorder, 0, postorder.length-1);
    }

    private TreeNode build(Map<Integer, Integer> inMap, Map<Integer, Integer> postMap, int[] inorder, int inLo, int inHi, int[] postorder, int postLo, int postHi) {
        int rootVal = postorder[postHi];
        int rootInx = inMap.get(rootVal);
        TreeNode root = new TreeNode(rootVal);

        // 只有一个元素的时候直接返回

        // 没有左子树也没有右子树，只有一个根元素。
        if(inLo == inHi) {
            return root;
        }

        // 只有左子树
        if(inHi == rootInx) {
            int in_ltree_lo = inLo;
            int in_ltree_hi = rootInx-1;

            int post_ltree_lo = postLo;
            int post_ltree_hi = getMinIndex(inorder, postorder, postMap, rootInx, rootInx)-1;
            root.left = build(inMap, postMap, inorder, in_ltree_lo, in_ltree_hi, postorder, post_ltree_lo, post_ltree_hi);
        }

        // 只有右子树
        if(inLo == rootInx) {
            int in_rtree_lo = rootInx+1;
            int in_rtree_hi = inHi;

            int post_rtree_lo = getMinIndex(inorder, postorder, postMap, rootInx, rootInx)+1;
            int post_rtree_hi = postHi-1;
            root.right = build(inMap, postMap, inorder, in_rtree_lo, in_rtree_hi, postorder, post_rtree_lo, post_rtree_hi);
        }

        // 同时有左子树和右子树
        if(inLo < rootInx && rootInx < inHi) {
            int in_ltree_lo = inLo;
            int in_ltree_hi = rootInx-1;
            int in_rtree_lo = rootInx+1;
            int in_rtree_hi = inHi;

            int post_ltree_lo = postLo;
            int post_ltree_hi = getMinIndex(inorder, postorder, postMap, rootInx, in_rtree_hi)-1;
            int post_rtree_lo = getMinIndex(inorder, postorder, postMap, in_ltree_lo, in_ltree_hi)+1;
            int post_rtree_hi = postHi-1;
            root.right = build(inMap, postMap, inorder, in_rtree_lo, in_rtree_hi, postorder, post_rtree_lo, post_rtree_hi);
            root.left = build(inMap, postMap, inorder, in_ltree_lo, in_ltree_hi, postorder, post_ltree_lo, post_ltree_hi);
        }
        return root;
    }

    private int getMinIndex(int[] inorder, int[] postorder, Map<Integer, Integer> postMap, int rootInx, int in_rtree_hi) {
        int min = Integer.MAX_VALUE;
        for (int i = rootInx; i <= in_rtree_hi ; i++) {
            min = Math.min(postMap.get(inorder[i]), min);
        }
        return min;
    }
}
