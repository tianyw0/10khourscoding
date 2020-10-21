package com.tianyongwei.algorithm.leetcode;

import com.tianyongwei.algorithm.leetcode.common.ListNode;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

class LeetCode0061RotateListTest {

    @Test
    void rotateRight() {

        ListNode n1 = new ListNode(1);
        ListNode n2 = new ListNode(2);
        ListNode n3 = new ListNode(3);
        n1.next = n2;
        n2.next = n3;

        ListNode node1 = new ListNode(1);
        ListNode node2 = new ListNode(2);
        ListNode node3 = new ListNode(3);
        node3.next = node1;
        node1.next = node2;

        assertEquals(node3.toString(), new LeetCode0061RotateList().rotateRight(n1, 1).toString());
    }

    @Test
    void rotateRight2() {

        ListNode n1 = new ListNode(1);
        ListNode n2 = new ListNode(2);
        ListNode n3 = new ListNode(3);
        n1.next = n2;
        n2.next = n3;

        ListNode node1 = new ListNode(1);
        ListNode node2 = new ListNode(2);
        ListNode node3 = new ListNode(3);
        node2.next = node3;
        node3.next = node1;

        assertEquals(node2.toString(), new LeetCode0061RotateList().rotateRight(n1, 2).toString());
    }

    @Test
    void rotateRight3() {

        ListNode n1 = new ListNode(1);

        ListNode node1 = new ListNode(1);

        assertEquals(node1.toString(), new LeetCode0061RotateList().rotateRight(n1, 1).toString());
    }

    // [1,2,3]
    // 2000000000
    @Test
    void rotateRight4() {

        ListNode n1 = new ListNode(1);
        ListNode n2 = new ListNode(2);
        ListNode n3 = new ListNode(3);
        n1.next = n2;
        n2.next = n3;

        ListNode node1 = new ListNode(1);
        ListNode node2 = new ListNode(2);
        ListNode node3 = new ListNode(3);
        node2.next = node3;
        node3.next = node1;

        assertEquals(node2.toString(), new LeetCode0061RotateList().rotateRight(n1, 20000).toString());
    }
}