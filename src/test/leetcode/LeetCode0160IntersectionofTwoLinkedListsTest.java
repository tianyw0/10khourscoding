package leetcode;

import leetcode.common.ListNode;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

class LeetCode0160IntersectionofTwoLinkedListsTest {

    @Test
    void getIntersectionNode() {
        assertEquals(null, new LeetCode0160IntersectionofTwoLinkedLists().getIntersectionNode(null, null));
    }

    @Test
    void getIntersectionNode2() {
        ListNode n6 = new ListNode(6);
        ListNode n5 = new ListNode(5);
        ListNode n4 = new ListNode(4);
        ListNode n3 = new ListNode(3);
        ListNode n2 = new ListNode(2);
        ListNode n1 = new ListNode(1);

        n1.next = n2;
        n2.next = n5;

        n3.next = n4;
        n4.next = n5;

        n5.next = n6;
        assertEquals(n5, new LeetCode0160IntersectionofTwoLinkedLists().getIntersectionNode(n3, n1));
    }

    @Test
    void getIntersectionNode3() {
        ListNode n6 = new ListNode(6);
        ListNode n5 = new ListNode(5);
        ListNode n4 = new ListNode(4);
//        ListNode n3 = new ListNode(3);
        ListNode n2 = new ListNode(2);
        ListNode n1 = new ListNode(1);

        n1.next = n2;
        n2.next = n5;

//        n3.next = n4;
        n4.next = n5;

        n5.next = n6;
        assertEquals(n5, new LeetCode0160IntersectionofTwoLinkedLists().getIntersectionNode(n4, n1));
    }

    @Test
    void getIntersectionNode4() {
        ListNode n6 = new ListNode(6);
        ListNode n5 = new ListNode(5);
        ListNode n4 = new ListNode(4);

        n4.next = n5;
        n5.next = n6;
        assertEquals(n6, new LeetCode0160IntersectionofTwoLinkedLists().getIntersectionNode(n4, new ListNode(6)));
    }

    @Test
    void getIntersectionNode5() {
        ListNode n6 = new ListNode(4);
        ListNode n5 = new ListNode(6);
        ListNode n4 = new ListNode(2);

        n4.next = n5;
        n5.next = n6;
        assertEquals(null, new LeetCode0160IntersectionofTwoLinkedLists().getIntersectionNode(new ListNode(0), n4));
    }
}