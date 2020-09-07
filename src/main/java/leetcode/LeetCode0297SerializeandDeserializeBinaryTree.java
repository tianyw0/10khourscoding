package leetcode;

import leetcode.common.TreeNode;

import java.util.Arrays;
import java.util.LinkedList;
import java.util.List;
import java.util.Queue;

public class LeetCode0297SerializeandDeserializeBinaryTree {
    // Encodes a tree to a single string.
    public String serialize(TreeNode root) {
        if(root == null) return "[]";

        StringBuilder sb = new StringBuilder("[");
        StringBuilder nullsb = new StringBuilder("");

        // 按层遍历
        Queue<TreeNode> queue = new LinkedList<>();
        queue.add(root);

        while (!queue.isEmpty()) {
            int size = queue.size();
            for (int i = 0; i < size; i++) {
                TreeNode node = queue.poll();
                if(node == null) {
                    nullsb.append("null,");
                } else {
                    sb.append(nullsb);
                    nullsb.delete(0, nullsb.length());
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

        if("[]".equalsIgnoreCase(data)) return null;

        // "[1,2,3,null,null,4,5]"
        String[] eles = data.substring(1, data.length()-1).split(",");
        Queue<TreeNode> nodeQueue = new LinkedList<>();
        Queue<String> strQueue = new LinkedList<>(Arrays.asList(eles));
        TreeNode root = new TreeNode(Integer.valueOf(eles[0]));
        nodeQueue.add(root);
        strQueue.poll();
        while (!strQueue.isEmpty() && !nodeQueue.isEmpty()) {
            int nodeQueueSize = nodeQueue.size();
            for (int i = 0; i < nodeQueueSize; i++) {
                TreeNode node = nodeQueue.poll();
                // left
                String strleft = strQueue.poll();
                if(strleft == null) {
                    node.left = null;
                } else {
                    if("null".equalsIgnoreCase(strleft)) {
                        node.left = null;
                    } else {
                        node.left = new TreeNode(Integer.valueOf(strleft));
                        nodeQueue.add(node.left);
                    }
                }

                // right
                String strright = strQueue.poll();
                if(strright == null) {
                    node.right = null;
                } else {
                    if("null".equalsIgnoreCase(strright)) {
                        node.right = null;
                    } else {
                        node.right = new TreeNode(Integer.valueOf(strright));
                        nodeQueue.add(node.right);
                    }
                }
            }
        }
        return root;
    }
}
