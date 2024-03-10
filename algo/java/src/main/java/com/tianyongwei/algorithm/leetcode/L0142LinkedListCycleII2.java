package com.tianyongwei.algorithm.leetcode;

import com.tianyongwei.algorithm.leetcode.common.ListNode;

public class L0142LinkedListCycleII2 {
    public ListNode detectCycle(ListNode head) {
        if(head == null) return null;

        ListNode slow = head;
        ListNode fast = head;

        while (slow.next != null && fast.next.next != null) {
            slow = slow.next;
            fast = fast.next.next;

            // 防止空指针
            if(fast.next == null) return null;

            if(fast == slow) return slow;
        }
        return null;
    }
}
