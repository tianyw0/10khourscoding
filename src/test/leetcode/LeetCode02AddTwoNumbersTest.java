package leetcode;

import leetcode.common.ListNode;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class LeetCode02AddTwoNumbersTest {

    @Test
    void addTwoNumbers() {

        assertEquals(null, new LeetCode02AddTwoNumbers().addTwoNumbers(null, null));
    }

    @Test
    void addTwoNumbers1() {
        assertEquals(new ListNode(1).toString(), new LeetCode02AddTwoNumbers().addTwoNumbers(null, new ListNode(1)).toString());
    }

    @Test
    void addTwoNumbers2() {
        assertEquals(new ListNode(2).toString(), new LeetCode02AddTwoNumbers().addTwoNumbers(new ListNode(1), new ListNode(1)).toString());
    }

    @Test
    void addTwoNumbers3() {
        ListNode node = new ListNode(0);
        node.next = new ListNode(1);
        assertEquals(node.toString(), new LeetCode02AddTwoNumbers().addTwoNumbers(new ListNode(9), new ListNode(1)).toString());
    }

    @Test
    void addTwoNumbers4() {
        ListNode node1 = new ListNode(1);
        node1.next = new ListNode(8);

        ListNode node2 = new ListNode(0);

        assertEquals(node1.toString(), new LeetCode02AddTwoNumbers().addTwoNumbers(node1, node2).toString());
    }
}