package leetcode;

import leetcode.common.ListNode;

public class LeetCode0019RemoveNthNodeFromEndofList {
    public ListNode removeNthFromEnd(ListNode head, int n) {
        if (head == null) {
            return null;
        }
        //使用哨兵节点
        ListNode sentinel = new ListNode(-1);
        sentinel.next = head;

        ListNode fast = sentinel;
        ListNode slow = sentinel;

        for (int i = 1; i <= n ; i++) {
            // fast 指针先前进n次
            fast = fast.next;
        }

        while (fast.next != null) {
            fast = fast.next;
            slow = slow.next;
        }

        slow.next = slow.next.next;

        return sentinel.next;
    }
}
