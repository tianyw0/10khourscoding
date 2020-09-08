package leetcode;

import leetcode.common.TreeNode;

import java.util.HashMap;
import java.util.Map;

public class LeetCode0105ConstructBinaryTreefromandInorderTraversal {
    public TreeNode buildTree(int[] preorder, int[] inorder) {
        if(inorder == null || inorder.length == 0) {
            return null;
        }
        Map<Integer, Integer> inMap = new HashMap<Integer, Integer>(){{
            for (int i = 0; i < inorder.length; i++) {
                put(inorder[i], i);
            }
        }};
        Map<Integer, Integer> preMap = new HashMap<Integer, Integer>(){{
            for (int i = 0; i < preorder.length; i++) {
                put(preorder[i], i);
            }
        }};
        // 重点是理解：根是处理一棵树的最小单位，因为根是一棵树的最小必要元素
        return build(inMap, preMap, inorder, 0, inorder.length-1, preorder, 0, preorder.length-1);
    }

    private TreeNode build(Map<Integer, Integer> inMap, Map<Integer, Integer> preMap, int[] inorder, int inLo, int inHi, int[] preorder, int preLo, int preHi) {
        int rootVal = preorder[preLo];
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

            int pre_ltree_lo = preLo+1;
            int pre_ltree_hi = getMinIndex(inorder, preorder, preMap, rootInx, rootInx)-1;
            root.left = build(inMap, preMap, inorder, in_ltree_lo, in_ltree_hi, preorder, pre_ltree_lo, pre_ltree_hi);
        }

        // 只有右子树
        if(inLo == rootInx) {
            int in_rtree_lo = rootInx+1;
            int in_rtree_hi = inHi;

            int pre_rtree_lo = getMinIndex(inorder, preorder, preMap, rootInx, rootInx)+1;
            int pre_rtree_hi = preHi;
            root.right = build(inMap, preMap, inorder, in_rtree_lo, in_rtree_hi, preorder, pre_rtree_lo, pre_rtree_hi);
        }

        // 同时有左子树和右子树
        if(inLo < rootInx && rootInx < inHi) {
            int in_ltree_lo = inLo;
            int in_ltree_hi = rootInx-1;
            int in_rtree_lo = rootInx+1;
            int in_rtree_hi = inHi;

            int pre_ltree_lo = preLo+1;
            int pre_ltree_hi = getMinIndex(inorder, preorder, preMap, in_rtree_lo, in_rtree_hi)-1;
            int pre_rtree_lo = getMaxIndex(inorder, preorder, preMap, in_ltree_lo, in_ltree_hi)+1;
            int pre_rtree_hi = preHi;
            root.right = build(inMap, preMap, inorder, in_rtree_lo, in_rtree_hi, preorder, pre_rtree_lo, pre_rtree_hi);
            root.left = build(inMap, preMap, inorder, in_ltree_lo, in_ltree_hi, preorder, pre_ltree_lo, pre_ltree_hi);
        }
        return root;
    }

    private int getMaxIndex(int[] inorder, int[] preorder, Map<Integer, Integer> preMap, int in_ltree_lo, int in_ltree_hi) {
        int max = Integer.MIN_VALUE;
        for (int i = in_ltree_lo; i <= in_ltree_hi ; i++) {
            max = Math.max(preMap.get(inorder[i]), max);
        }
        return max;
    }

    private int getMinIndex(int[] inorder, int[] preorder, Map<Integer, Integer> preMap, int in_rtree_lo, int in_rtree_hi) {
        int min = Integer.MAX_VALUE;
        for (int i = in_rtree_lo; i <= in_rtree_hi ; i++) {
            min = Math.min(preMap.get(inorder[i]), min);
        }
        return min;
    }
}
