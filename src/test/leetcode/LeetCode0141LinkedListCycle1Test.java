package leetcode;

import leetcode.common.ListNode;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

class LeetCode0141LinkedListCycle1Test {

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
        assertEquals(true, new LeetCode0141LinkedListCycle1().hasCycle(n1));
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
        assertEquals(false, new LeetCode0141LinkedListCycle1().hasCycle(n1));
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
        assertEquals(true, new LeetCode0141LinkedListCycle1().hasCycle(n1));
    }
}