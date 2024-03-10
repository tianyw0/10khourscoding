package com.tianyongwei.algorithm.leetcode;

import lombok.ToString;

import java.util.Stack;

public class L0430FlattenaMultilevelDoublyLinkedList {
    public Node flatten(Node head) {
        if(head ==null) return null;

        // 模拟计算机堆栈行为
        Stack<Node> stack = new Stack<>();
        stack.add(head);

        Node dummy = new Node(-1);
        Node prev = dummy;
        while (!stack.isEmpty()) {
            Node node = stack.pop();
            Node toadd = new Node(node.val);
            if(prev == dummy) {
                toadd.prev = null;
            } else {
                toadd.prev = prev;
            }
            prev.next = toadd;
            prev = prev.next;

            if(node.next != null)
                stack.add(node.next);
            if(node.child != null)
                stack.add(node.child);
        }

        return dummy.next;
    }

    @ToString
    static class Node {
        public int val;
        @ToString.Exclude
        public Node prev;
        public Node next;
        public Node child;

        public Node() {}

        public Node(int _val) {
            val = _val;
        }

        public Node(int val, Node prev, Node next, Node child) {
            this.val = val;
            this.prev = prev;
            this.next = next;
            this.child = child;
        }
    }
}
