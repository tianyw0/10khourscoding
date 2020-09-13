package leetcode;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class LeetCode0430FlattenaMultilevelDoublyLinkedListTest {

    @Test
    void flatten() {
        LeetCode0430FlattenaMultilevelDoublyLinkedList.Node node
                = new LeetCode0430FlattenaMultilevelDoublyLinkedList.Node(1, null, null, null);

        LeetCode0430FlattenaMultilevelDoublyLinkedList.Node n
                = new LeetCode0430FlattenaMultilevelDoublyLinkedList.Node(1, null, null, null);

        assertEquals(n.toString(), new LeetCode0430FlattenaMultilevelDoublyLinkedList().flatten(node).toString());
    }

    @Test
    void flatten2() {
        LeetCode0430FlattenaMultilevelDoublyLinkedList.Node node
                = new LeetCode0430FlattenaMultilevelDoublyLinkedList.Node(1, null,null,new LeetCode0430FlattenaMultilevelDoublyLinkedList.Node(2));

        LeetCode0430FlattenaMultilevelDoublyLinkedList.Node n
                = new LeetCode0430FlattenaMultilevelDoublyLinkedList.Node(1, null, new LeetCode0430FlattenaMultilevelDoublyLinkedList.Node(2), null);

        assertEquals(n.toString(), new LeetCode0430FlattenaMultilevelDoublyLinkedList().flatten(node).toString());
    }
}