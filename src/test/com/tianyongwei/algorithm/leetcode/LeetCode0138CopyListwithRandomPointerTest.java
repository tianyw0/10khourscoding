package com.tianyongwei.algorithm.leetcode;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

class LeetCode0138CopyListwithRandomPointerTest {

    @Test
    void copyRandomList() {

        LeetCode0138CopyListwithRandomPointer.Node n1 = new LeetCode0138CopyListwithRandomPointer.Node(1);
        LeetCode0138CopyListwithRandomPointer.Node n2 = new LeetCode0138CopyListwithRandomPointer.Node(2);
        LeetCode0138CopyListwithRandomPointer.Node n3 = new LeetCode0138CopyListwithRandomPointer.Node(3);
        n1.next = n2;
        n2.next = n3;

        n1.random = n3;
        n2.random = n3;

        LeetCode0138CopyListwithRandomPointer.Node node1 = new LeetCode0138CopyListwithRandomPointer.Node(1);
        LeetCode0138CopyListwithRandomPointer.Node node2 = new LeetCode0138CopyListwithRandomPointer.Node(2);
        LeetCode0138CopyListwithRandomPointer.Node node3 = new LeetCode0138CopyListwithRandomPointer.Node(3);
        node1.next = node2;
        node2.next = node3;

        node1.random = node3;
        node2.random = node3;

        assertEquals(node1.toString(), new LeetCode0138CopyListwithRandomPointer().copyRandomList(n1).toString());
    }
}