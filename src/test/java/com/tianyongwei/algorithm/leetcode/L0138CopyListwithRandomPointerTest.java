package com.tianyongwei.algorithm.leetcode;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

class L0138CopyListwithRandomPointerTest {

    @Test
    void copyRandomList() {

        L0138CopyListwithRandomPointer.Node n1 = new L0138CopyListwithRandomPointer.Node(1);
        L0138CopyListwithRandomPointer.Node n2 = new L0138CopyListwithRandomPointer.Node(2);
        L0138CopyListwithRandomPointer.Node n3 = new L0138CopyListwithRandomPointer.Node(3);
        n1.next = n2;
        n2.next = n3;

        n1.random = n3;
        n2.random = n3;

        L0138CopyListwithRandomPointer.Node node1 = new L0138CopyListwithRandomPointer.Node(1);
        L0138CopyListwithRandomPointer.Node node2 = new L0138CopyListwithRandomPointer.Node(2);
        L0138CopyListwithRandomPointer.Node node3 = new L0138CopyListwithRandomPointer.Node(3);
        node1.next = node2;
        node2.next = node3;

        node1.random = node3;
        node2.random = node3;

        assertEquals(node1.toString(), new L0138CopyListwithRandomPointer().copyRandomList(n1).toString());
    }
}