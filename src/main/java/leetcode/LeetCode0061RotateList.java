package leetcode;

import leetcode.common.ListNode;

public class LeetCode0061RotateList {
    public ListNode rotateRight(ListNode head, int k) {
        if(head == null) return null;

        int size = 0;
        ListNode curr = head;
        while (curr != null){
            curr = curr.next;
            size ++;
        }
        k = k % size;

        for (int i = 0; i < k; i++) {
            head = rotate(head);
        }

        return head;
    }

    private ListNode rotate(ListNode head) {
        ListNode prev = new ListNode(-1);
        prev.next = head;
        while (true) {
            if(prev.next.next == null) {
                // 找到最后一个元素了
                ListNode newhead = prev.next;
                prev.next = null;
                if(newhead != head) {
                    newhead.next = head;
                }
                return newhead;
            }

            prev = prev.next;
        }
    }
}
