package com.tianyongwei.algorithm.leetcode;

import com.tianyongwei.algorithm.leetcode.common.ListNode;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class L0237DeleteNodeinaLinkedListTest {

    @Test
    void deleteNode() {
        ListNode head = new ListNode(4);
        ListNode head1 = new ListNode(5);
        ListNode head2 = new ListNode(1);
        ListNode head3 = new ListNode(9);

        head.next = head1;
        head1.next = head2;
        head2.next = head3;

        new L0237DeleteNodeinaLinkedList().deleteNode(head1);

        ListNode root = new ListNode(4);
        ListNode root2 = new ListNode(1);
        ListNode root3 = new ListNode(9);
        root.next = root2;
        root2.next = root3;

        assertEquals(root, head);
    }
}