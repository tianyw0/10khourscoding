package com.tianyongwei.algorithm.leetcode;

import com.tianyongwei.algorithm.leetcode.common.Node;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

class LeetCode0117PopulatingNextRightPointersinEachNodeIITest {

    LeetCode0117PopulatingNextRightPointersinEachNodeII l117
            = new LeetCode0117PopulatingNextRightPointersinEachNodeII();

    @Test
    void connect() {
        assertEquals(null, l117.connect(null));
    }

    @Test
    void connect2() {
        Node node = new Node(1
                , new Node(2, new Node(4), new Node(5), null)
                , new Node(3, null, new Node(7), null)
                , null);

        Node node7 = new Node(7);
        Node node3 = new Node(3, null, node7, null);
        Node node5 = new Node(5, null, null, node7);
        Node node4 = new Node(4, null, null, node5);
        Node node2 = new Node(2, node4, node5, node3);
        Node node1 = new Node(1, node2, node3, null);

        assertEquals(node1.toString(), l117.connect(node).toString());
    }

    @Test
    void connect3() {
        Node node = new Node(1
                , new Node(2, new Node(4, new Node(7), null, null), new Node(5), null)
                , new Node(3, null, new Node(6, null, new Node(8), null), null)
                , null);

        Node node8 = new Node(8, null, null, null);
        Node node7 = new Node(7, null, null, node8);
        Node node6 = new Node(6, null, node8, null);
        Node node3 = new Node(3, null, node6, null);
        Node node5 = new Node(5, null, null, node6);
        Node node4 = new Node(4, node7, null, node5);
        Node node2 = new Node(2, node4, node5, node3);
        Node node1 = new Node(1, node2, node3, null);

        assertEquals(node1.toString(), l117.connect(node).toString());
    }
}