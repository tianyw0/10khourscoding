package leetcode;


import leetcode.common.ListNode;

public class LeetCode0206ReverseLinkedList {
    public ListNode reverseList(ListNode head) {
        if(head == null) return null;

        // todo 不对
        ListNode p = head;
        while(p.next != null) {
            ListNode temp = p.next;
            p.next = p.next.next;

            temp.next.next = head;
            head = temp;
        }
        return head;
    }
}
