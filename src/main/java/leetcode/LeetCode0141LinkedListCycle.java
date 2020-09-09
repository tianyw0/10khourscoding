package leetcode;

import leetcode.common.ListNode;

import java.util.HashSet;
import java.util.Set;

public class LeetCode0141LinkedListCycle {
    public boolean hasCycle(ListNode head) {
        if(head == null) return false;

        ListNode curr = head;
        Set<ListNode> set = new HashSet<>();
        while (curr.next != null) {
            set.add(curr);
            if(set.contains(curr.next)) {
                return true;
            }
            curr = curr.next;
        }
        return false;
    }
}
