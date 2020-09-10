package leetcode;

import leetcode.common.ListNode;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class LeetCode0707DesignLinkedListTest {

    LeetCode0707DesignLinkedList l707
            = new LeetCode0707DesignLinkedList();

    @Test
    void init() {
        assertEquals(1, l707.size);
        assertEquals(new ListNode(0), l707.head);
    }

    @Test
    void get() {
        assertEquals(0, l707.get(0));
        assertEquals(-1, l707.get(1));
    }

    @Test
    void addAtHead() {
    }

    @Test
    void addAtTail() {
    }

    @Test
    void addAtIndex() {
    }

    @Test
    void deleteAtIndex() {
    }
}