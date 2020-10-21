package com.tianyongwei.algorithm.leetcode;

import com.tianyongwei.algorithm.leetcode.common.ListNode;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

class LeetCode0203RemoveLinkedListElementsTest {

    @Test
    void removeElements() {
        ListNode n1 = new ListNode(0);
        assertEquals(n1.toString(), new LeetCode0203RemoveLinkedListElements().removeElements(n1, 1).toString());
    }

    @Test
    void removeElements2() {
        ListNode n1 = new ListNode(0);
        n1.next = new ListNode(1);
        assertEquals(new ListNode(0).toString(), new LeetCode0203RemoveLinkedListElements().removeElements(n1, 1).toString());
    }

    @Test
    void removeElements3() {
        ListNode n1 = new ListNode(1);
        n1.next = new ListNode(1);
        assertEquals(null, new LeetCode0203RemoveLinkedListElements().removeElements(n1, 1));
    }
}