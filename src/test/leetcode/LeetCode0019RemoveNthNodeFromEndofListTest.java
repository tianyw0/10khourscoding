package leetcode;

import leetcode.common.ListNode;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class LeetCode0019RemoveNthNodeFromEndofListTest {

  @Test
  void removeNthFromEnd() {
    assertEquals(null, new LeetCode0019RemoveNthNodeFromEndofList().removeNthFromEnd(null, 9));
  }

  @Test
  void removeNthFromEnd1() {
    ListNode n5 = new ListNode(5);
    ListNode n4 = new ListNode(4);
    ListNode n3 = new ListNode(3);
    ListNode n2 = new ListNode(2);
    ListNode n1 = new ListNode(1);
    n1.next = n2;
    n2.next = n3;
    n3.next = n4;
    n4.next = n5;

    ListNode node5 = new ListNode(5);
    ListNode node4 = new ListNode(4);
    ListNode node3 = new ListNode(3);
    ListNode node2 = new ListNode(2);
    ListNode node1 = new ListNode(1);
    node1.next = node2;
    node2.next = node3;
    node3.next = node4;
    assertEquals(node1, new LeetCode0019RemoveNthNodeFromEndofList().removeNthFromEnd(n1, 1));
  }
}