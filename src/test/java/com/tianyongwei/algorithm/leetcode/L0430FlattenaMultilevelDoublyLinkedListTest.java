package com.tianyongwei.algorithm.leetcode;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

class L0430FlattenaMultilevelDoublyLinkedListTest {

    @Test
    void flatten() {
        L0430FlattenaMultilevelDoublyLinkedList.Node node
                = new L0430FlattenaMultilevelDoublyLinkedList.Node(1, null, null, null);

        L0430FlattenaMultilevelDoublyLinkedList.Node n
                = new L0430FlattenaMultilevelDoublyLinkedList.Node(1, null, null, null);

        assertEquals(n.toString(), new L0430FlattenaMultilevelDoublyLinkedList().flatten(node).toString());
    }

    @Test
    void flatten2() {
        L0430FlattenaMultilevelDoublyLinkedList.Node node
                = new L0430FlattenaMultilevelDoublyLinkedList.Node(1, null,null,new L0430FlattenaMultilevelDoublyLinkedList.Node(2));

        L0430FlattenaMultilevelDoublyLinkedList.Node n
                = new L0430FlattenaMultilevelDoublyLinkedList.Node(1, null, new L0430FlattenaMultilevelDoublyLinkedList.Node(2), null);

        assertEquals(n.toString(), new L0430FlattenaMultilevelDoublyLinkedList().flatten(node).toString());
    }
}