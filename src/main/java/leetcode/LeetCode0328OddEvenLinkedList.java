package leetcode;

import leetcode.common.ListNode;

public class LeetCode0328OddEvenLinkedList {
    public ListNode oddEvenList(ListNode head) {
        if(head == null) return null;

        ListNode node = new ListNode(1);
        node.next = head;
        head = node;

        boolean odd = true;
        ListNode prev = head;
        ListNode oddHead = new ListNode(1);
        ListNode evenHead = new ListNode(1);
        ListNode currOdd = oddHead;
        ListNode currEven = evenHead;
        while (prev.next != null) {
            if(odd) {
                // 奇数
                currOdd.next = new ListNode(prev.next.val);
                currOdd = currOdd.next;
            } else {
                currEven.next = new ListNode(prev.next.val);
                currEven = currEven.next;
            }
            odd = !odd;
            prev = prev.next;
        }

        currOdd.next = evenHead.next;
        return oddHead.next;
    }
}
