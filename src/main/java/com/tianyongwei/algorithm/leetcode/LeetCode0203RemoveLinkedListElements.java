package com.tianyongwei.algorithm.leetcode;

import com.tianyongwei.algorithm.leetcode.common.ListNode;

public class LeetCode0203RemoveLinkedListElements {
    public ListNode removeElements(ListNode head, int val) {
        ListNode node = new ListNode(0);
        node.next = head;
        head = node;

        ListNode prev = head;
        while (prev.next != null) {
            ListNode curr = prev.next;
            if(val == curr.val) {
                prev.next = curr.next;
                if(prev.next == null)
                    break;
            } else {
                prev = prev.next;
            }
        }

        return head.next;
    }
}
