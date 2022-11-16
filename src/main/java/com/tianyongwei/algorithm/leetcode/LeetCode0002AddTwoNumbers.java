package com.tianyongwei.algorithm.leetcode;

import com.tianyongwei.algorithm.leetcode.common.ListNode;

public class LeetCode0002AddTwoNumbers {
    public ListNode addTwoNumbers(ListNode l1, ListNode l2) {

        if (l1 == null)
            return l2;
        if (l2 == null)
            return l1;

        ListNode curr1 = l1;
        ListNode curr2 = l2;
        ListNode dummy = new ListNode(-1);
        int carry = 0;
        ListNode curr_dummy = dummy;

        while (curr1 != null || curr2 != null) {
            if (curr1 == null) {
                curr1 = new ListNode(0);
            }
            if (curr2 == null) {
                curr2 = new ListNode(0);
            }

            int sum = curr1.val + curr2.val + carry;
            carry = sum / 10;
            curr_dummy.next = new ListNode(sum % 10);
            curr_dummy = curr_dummy.next;

            curr1 = curr1.next;
            curr2 = curr2.next;
        }
        // 处理最后一个进位
        if (carry > 0)
            curr_dummy.next = new ListNode(carry);

        return dummy.next;
    }
}
