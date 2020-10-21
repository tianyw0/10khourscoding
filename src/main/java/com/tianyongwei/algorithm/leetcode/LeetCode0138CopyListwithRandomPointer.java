package com.tianyongwei.algorithm.leetcode;

import lombok.ToString;

import java.util.HashMap;
import java.util.Map;

public class LeetCode0138CopyListwithRandomPointer {
    public Node copyRandomList(Node head) {
        if (head == null) {
            return null;
        }
        // 先拷贝节点，再拷贝随机指针
        Map<Node, Node> randommap = new HashMap<>();
        Map<Node, Node> nodemap = new HashMap<>();
        Node curr = head;
        Node newhead = new Node(-1);
        Node prev = newhead;
        while (curr != null) {
            Node toadd = new Node(curr.val);
            randommap.put(curr, curr.random);
            nodemap.put(curr, toadd);
            prev.next = toadd;

            prev = prev.next;
            curr = curr.next;
        }
        curr = head;
        prev = newhead;
        while (curr != null) {
            prev.next.random = nodemap.get(randommap.get(curr));
            prev = prev.next;
            curr = curr.next;
        }

        return newhead.next;
    }

    @ToString
    static class Node {
        int val;
        Node next;
        @ToString.Exclude
        Node random;

        public Node(int val) {
            this.val = val;
            this.next = null;
            this.random = null;
        }
    }
}
