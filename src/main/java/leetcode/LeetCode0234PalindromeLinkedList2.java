package leetcode;

import leetcode.common.ListNode;

import java.util.ArrayList;
import java.util.List;

public class LeetCode0234PalindromeLinkedList2 {
    public boolean isPalindrome(ListNode head) {

        if (head == null) {
            return true;
        }

        //数组
        ListNode curr = head;
        List<Integer> list = new ArrayList<>();
        while (curr != null) {
            list.add(curr.val);
            curr = curr.next;
        }

        int i = 0, j = list.size() - 1;
        while (i < j) {
            if(list.get(i).intValue() != list.get(j).intValue()) {
                return false;
            }
            i++;
            j--;
        }
        return true;

    }
}
