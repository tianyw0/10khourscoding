package leetcode;


import leetcode.common.ListNode;

public class LeetCode0206ReverseLinkedList {
    public ListNode reverseList(ListNode head) {
        if(head == null) return null;

        // 哨兵机制
        ListNode sentinel = new ListNode(-1);
        sentinel.next = head;

        ListNode p = sentinel;
        while(p.next != null) {
            // p.next 不等于空的时候，将p.next往前插


        }
        return sentinel.next;
    }
}
