package leetcode;

import leetcode.common.Node;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

class LeetCode0116PopulatingNextRightPointersinEachNodeTest {

    LeetCode0116PopulatingNextRightPointersinEachNode l116
            = new LeetCode0116PopulatingNextRightPointersinEachNode();


    @Test
    void connect() {
        assertEquals(null, l116.connect(null));
    }

    @Test
    void connect2() {
        Node node = new Node(1
                , new Node(2, new Node(4), new Node(5), null)
                , new Node(3, new Node(6), new Node(7), null)
                , null);

        Node node7 = new Node(7);
        Node node6 = new Node(6, null, null, node7);
        Node node3 = new Node(3, node6, node7, null);
        Node node5 = new Node(5, null, null, node6);
        Node node4 = new Node(4, null, null, node5);
        Node node2 = new Node(2, node4, node5, node3);
        Node node1 = new Node(1, node2, node3, null);

        assertEquals(node1.toString(), l116.connect(node).toString());
    }
}