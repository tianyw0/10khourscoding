package leetcode;

import leetcode.common.TreeNode;

import java.util.LinkedList;
import java.util.Queue;

public class LeetCode0297SerializeandDeserializeBinaryTree {
    // Encodes a tree to a single string.
    public String serialize(TreeNode root) {
        if(root == null) return "[]";

        StringBuilder sb = new StringBuilder("[");

        // 按层遍历
        Queue<TreeNode> queue = new LinkedList<>();
        queue.add(root);

        while (!queue.isEmpty()) {
            int size = queue.size();
            for (int i = 0; i < size; i++) {
                TreeNode node = queue.poll();
                if(node == null) {
                    sb.append("null,");
                } else {
                    sb.append(node.val + ",");
                    queue.add(node.left);
                    queue.add(node.right);
                }
            }
        }

        sb.append("]");
        return sb.toString().replaceAll(",]", "]");
    }

    // Decodes your encoded data to tree.
    public TreeNode deserialize(String data) {
        return null;
    }
}
