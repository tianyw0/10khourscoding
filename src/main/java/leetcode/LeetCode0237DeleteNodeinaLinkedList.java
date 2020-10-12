package leetcode;

import leetcode.common.ListNode;

public class LeetCode0237DeleteNodeinaLinkedList {
    // 摆脱固定思维
    public void deleteNode(ListNode node) {
        node.val = node.next.val;
        node.next = node.next.next;
    }
}
