package com.tianyongwei.algorithm.leetcode;

import com.tianyongwei.algorithm.leetcode.common.Node;

import java.util.LinkedList;
import java.util.Queue;

public class LeetCode0117PopulatingNextRightPointersinEachNodeII {
    public Node connect(Node root) {

        if(root == null) return null;

        Queue<Node> queue = new LinkedList<>();
        queue.add(root);

        while (!queue.isEmpty()) {
            Node node = queue.poll();
            // 处理左子树
            if(node.left != null) {
                Node lNext = null;
                if(node.right != null) {
                    lNext = node.right;
                } else {
                    Node nextNode = node.next;
                    while (nextNode != null) {
                        if(nextNode.left != null) {
                            lNext = nextNode.left;
                            break;
                        } else if(nextNode.right != null) {
                            lNext = nextNode.right;
                            break;
                        }
                        nextNode = nextNode.next;
                    }
                }
                node.left.next = lNext;
                queue.add(node.left);
            }

            // 处理右子树
            if(node.right != null) {
                Node rNext = null;
                Node nextNode = node.next;
                while (nextNode != null) {
                    if(nextNode.left != null) {
                        rNext = nextNode.left;
                        break;
                    } else if(nextNode.right != null) {
                        rNext = nextNode.right;
                        break;
                    }
                    nextNode = nextNode.next;
                }
                node.right.next = rNext;
                queue.add(node.right);
            }
        }

        return root;
    }
}
