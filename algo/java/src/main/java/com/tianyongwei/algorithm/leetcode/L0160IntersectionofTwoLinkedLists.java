package com.tianyongwei.algorithm.leetcode;

import com.tianyongwei.algorithm.leetcode.common.ListNode;

public class L0160IntersectionofTwoLinkedLists {
    public ListNode getIntersectionNode(ListNode headA, ListNode headB) {
        if(headA == null || headB == null) return null;

        ListNode pointA = headA;
        ListNode pointB = headB;
        // 指针A遍历链表A+链表B
        // 指针B遍历链表B+链表A
        // 12345 645
        // 12345645
        // 64512345
        // 如果两个链表有相交，必然在交点上返回

        boolean switchFlagA = true;
        boolean switchFlagB = true;

        while (pointA != pointB) {
            if(pointA.next == null && switchFlagA) {
                pointA = headB;
                switchFlagA = false;
            } else {
                pointA = pointA.next;
            }
            if(pointB.next == null && switchFlagB) {
                pointB = headA;
                switchFlagB = false;
            } else {
                pointB = pointB.next;
            }
        }
        return pointA;
    }
}
