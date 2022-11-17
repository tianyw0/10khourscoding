package com.tianyongwei.algorithm.leetcode;


import com.tianyongwei.algorithm.leetcode.common.ListNode;

public class L0206ReverseLinkedList1 {
    public ListNode reverseList(ListNode head) {
        if(head == null) return null;

        // 双指针：想象在结尾巴
        ListNode tail = null;
        ListNode curr = head;
        while(curr != null) {
            ListNode temp = curr.next;
            // 结尾
            curr.next = tail;
            // 新尾巴
            tail = curr;
            // 下一个节点
            curr = temp;
        }
        return tail;
    }
}
