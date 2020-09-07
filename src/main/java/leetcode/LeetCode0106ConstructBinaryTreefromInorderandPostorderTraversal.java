package leetcode;

import leetcode.common.TreeNode;

import java.util.HashMap;
import java.util.Map;

public class LeetCode0106ConstructBinaryTreefromInorderandPostorderTraversal {

    public TreeNode buildTree(int[] inorder, int[] postorder) {
        if(inorder == null || inorder.length == 0) {
            return null;
        }
        // 重点是理解：根是处理一棵树的最小单位，因为根是一棵树的最小必要元素
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
        return build(inMap, postMap, inorder, 0, inorder.length-1, postorder, 0, postorder.length-1);
    }

    private TreeNode build(Map<Integer, Integer> inMap, Map<Integer, Integer> postMap, int[] inorder, int inLo, int inHi, int[] postorder, int postLo, int postHi) {
        int rootVal = postorder[postHi];
        int rootInx = inMap.get(rootVal);
        TreeNode root = new TreeNode(rootVal);

        // 只有一个元素的时候直接返回
        if(inLo == inHi) {
            return root;
        }

        if(inLo < rootInx) {
            // 有左子树
            // 确定边界
            int inLeft = inLo;
            int inRight = rootInx-1;
            int postLeft = postLo;
//            int postRight = postMap.get(inorder[rootInx+1>inHi ? rootInx : rootInx+1]) - 1;
            int postRight = getPostRihgt(inorder, postorder, inMap, postMap, rootInx, inLo, inHi);
            root.left = build(inMap, postMap, inorder, inLeft, inRight, postorder, postLeft, postRight);
        }

        if(rootInx < inHi) {
            // 有右子树
            // 确定边界
            int inLeft = rootInx+1;
            int inRight = inHi;
            int postLeft = postMap.get(inorder[rootInx+1]);
            int postRight = postHi-1;
            root.right = build(inMap, postMap, inorder, inLeft, inRight, postorder, postLeft, postRight);
        }
        return root;
    }

    private int getPostRihgt(int[] inorder, int[] postorder, Map<Integer, Integer> inMap, Map<Integer, Integer> postMap, int rootInx, int inLo, int inHi) {
        if(rootInx + 1 > inHi) return rootInx-1;

        int min = Integer.MAX_VALUE;
        for (int i = rootInx+1; i <= inHi; i++) {
            min = Math.min(postMap.get(inorder[i]), min);
        }
        return min-1;
    }
}
