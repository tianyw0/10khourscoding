package leetcode;

import leetcode.common.ListNode;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class LeetCode0328OddEvenLinkedListTest {


    @Test
    void oddEvenList1() {
        assertEquals(null, new LeetCode0328OddEvenLinkedList().oddEvenList(null));
    }

    @Test
    void oddEvenList() {
        ListNode n1 = new ListNode(1);
        ListNode n2 = new ListNode(2);
        ListNode n3 = new ListNode(3);
        n1.next = n2;
        n2.next = n3;

        ListNode node1 = new ListNode(1);
        ListNode node2 = new ListNode(2);
        ListNode node3 = new ListNode(3);
        node1.next = node3;
        node3.next = node2;
        System.out.println(node1.toString());
        assertEquals(node1.toString(), new LeetCode0328OddEvenLinkedList().oddEvenList(n1).toString());
    }

    @Test
    void oddEvenList2() {
        ListNode n1 = new ListNode(1);

        ListNode node1 = new ListNode(1);
        assertEquals(node1.toString(), new LeetCode0328OddEvenLinkedList().oddEvenList(n1).toString());
    }
}