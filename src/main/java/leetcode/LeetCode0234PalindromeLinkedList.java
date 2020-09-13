package leetcode;

import leetcode.common.ListNode;

import java.util.Stack;

public class LeetCode0234PalindromeLinkedList {
    public boolean isPalindrome(ListNode head) {

        if (head == null) {
            return false;
        }

        ListNode node = new ListNode(1);
        node.next = head;
        head = node;

        //快慢指针
        ListNode fast = head;
        ListNode slow = head;
        Stack<ListNode> stack = new Stack<>();

        while (fast != null && fast.next != null) {
            stack.add(slow);
            slow = slow.next;
            fast = fast.next;

            if(fast.next == null) {
                break;
            } else {
                fast = fast.next;
            }
        }

        while (slow != null) {
            if(slow.val != stack.pop().val) {
                return false;
            }

            slow = slow.next;
        }

        return true;
    }
}
