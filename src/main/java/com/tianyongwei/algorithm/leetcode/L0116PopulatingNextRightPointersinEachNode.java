package com.tianyongwei.algorithm.leetcode;

import com.tianyongwei.algorithm.leetcode.common.Node;

import java.util.LinkedList;
import java.util.Queue;

public class L0116PopulatingNextRightPointersinEachNode {
    public Node connect(Node root) {

        if(root == null) return null;

        Queue<Node> queue = new LinkedList<>();
        queue.add(root);

        while (!queue.isEmpty()) {
            Node node = queue.poll();
            if(node.left == null && node.right == null) {
                continue;
            }
            node.left.next = node.right;
            if(node.next != null) {
                node.right.next = node.next.left;
            } else {
                node.right.next = null;
            }
            queue.add(node.left);
            queue.add(node.right);
        }

        return root;
    }
}
