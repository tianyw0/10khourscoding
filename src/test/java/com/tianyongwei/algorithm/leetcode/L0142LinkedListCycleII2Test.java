package com.tianyongwei.algorithm.leetcode;

import com.tianyongwei.algorithm.leetcode.common.ListNode;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

class L0142LinkedListCycleII2Test {

    @Test
    void hasCycle4() {
        assertEquals(null, new L0142LinkedListCycleII2().detectCycle(null));
    }

    @Test
    void hasCycle() {
        ListNode n1 = new ListNode(3);
        ListNode n2 = new ListNode(2);
        ListNode n3 = new ListNode(0);
        ListNode n4 = new ListNode(-4);
        n1.next = n2;
        n2.next = n3;
        n3.next = n4;
        n4.next = n2;
        // todo 双指针解法还没有通过，思考中。。。。
        assertEquals(n2, new L0142LinkedListCycleII2().detectCycle(n1));
    }

    @Test
    void hasCycle2() {
        ListNode n1 = new ListNode(3);
        ListNode n2 = new ListNode(2);
        ListNode n3 = new ListNode(0);
        ListNode n4 = new ListNode(-4);
        n1.next = n2;
        n2.next = n3;
        n3.next = n4;
        n4.next = null;
        assertEquals(null, new L0142LinkedListCycleII2().detectCycle(n1));
    }

    @Test
    void hasCycle3() {
        ListNode n1 = new ListNode(3);
        ListNode n2 = new ListNode(2);
        ListNode n3 = new ListNode(0);
        ListNode n4 = new ListNode(-4);
        n1.next = n2;
        n2.next = n3;
        n3.next = n4;
        n4.next = n4;
        assertEquals(n4, new L0142LinkedListCycleII2().detectCycle(n1));
    }
}