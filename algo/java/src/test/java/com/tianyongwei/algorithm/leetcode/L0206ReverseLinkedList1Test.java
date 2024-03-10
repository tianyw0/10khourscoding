package com.tianyongwei.algorithm.leetcode;

import com.tianyongwei.algorithm.leetcode.common.ListNode;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

class L0206ReverseLinkedList1Test {

    @Test
    void reverseList() {

        assertEquals(null, new L0206ReverseLinkedList1().reverseList(null));
    }

    @Test
    void reverseList1() {

        ListNode n1 = new ListNode(1);
        ListNode n2 = new ListNode(2);
        ListNode n3 = new ListNode(3);

        n1.next = n2;
        n2.next = n3;

        ListNode node1 = new ListNode(1);
        ListNode node2 = new ListNode(2);
        ListNode node3 = new ListNode(3);

        node3.next = node2;
        node2.next = node1;


        assertEquals(node3.toString(), new L0206ReverseLinkedList1().reverseList(n1).toString());
    }
}