package leetcode;

import leetcode.common.ListNode;
import org.junit.jupiter.api.Test;

import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

class LeetCode0206ReverseLinkedListTest {

    @Test
    void reverseList() {

        assertEquals(null, new LeetCode0206ReverseLinkedList().reverseList(null));
    }

    @Test
    void reverseList1() {

        ListNode n1 = new ListNode(1);
        ListNode n2 = new ListNode(2);
        ListNode n3 = new ListNode(3);

        n1.next = n2;
        n2.next = n3;

        ListNode node1 = new ListNode(1);
        ListNode node2 = new ListNode(2);
        ListNode node3 = new ListNode(3);

        node3.next = node2;
        node2.next = node1;


        assertEquals(node3.toString(), new LeetCode0206ReverseLinkedList().reverseList(n1).toString());
    }
}