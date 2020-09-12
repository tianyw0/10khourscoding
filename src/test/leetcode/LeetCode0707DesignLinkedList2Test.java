package leetcode;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

class LeetCode0707DesignLinkedList2Test {

    @Test
    void init() {
        LeetCode0707DesignLinkedList2 l707 = new LeetCode0707DesignLinkedList2();
        assertEquals(0, l707.size);
        assertEquals(new LeetCode0707DesignLinkedList2.ListNode(0).toString(), l707.head.toString());
    }

    @Test
    void size() {
        LeetCode0707DesignLinkedList2 l707 = new LeetCode0707DesignLinkedList2();
        assertEquals(0, l707.size);
        l707.addAtHead(0);
        assertEquals(1, l707.size);
    }

    @Test
    void get() {
        LeetCode0707DesignLinkedList2 l707 = new LeetCode0707DesignLinkedList2();
        assertEquals(-1, l707.get(0));
        assertEquals(-1, l707.get(1));
    }

    @Test
    void get2() {
        LeetCode0707DesignLinkedList2 l707 = new LeetCode0707DesignLinkedList2();
        l707.addAtHead(7);
        l707.addAtHead(2);
        assertEquals(2, l707.get(0));
        assertEquals(7, l707.get(1));

        assertEquals(-1, l707.get(100));
    }
    @Test
    void addAtHead() {
        LeetCode0707DesignLinkedList2.ListNode node1 = new LeetCode0707DesignLinkedList2.ListNode(0);

        LeetCode0707DesignLinkedList2 l707 = new LeetCode0707DesignLinkedList2();
        l707.addAtHead(0);
        assertEquals(node1.toString(), l707.head.next.toString());
    }

    @Test
    void addAtHead2() {
        LeetCode0707DesignLinkedList2.ListNode node1 = new LeetCode0707DesignLinkedList2.ListNode(0);
        LeetCode0707DesignLinkedList2.ListNode node2 = new LeetCode0707DesignLinkedList2.ListNode(1);
        node1.next = node2;

        LeetCode0707DesignLinkedList2 l707 = new LeetCode0707DesignLinkedList2();
        l707.addAtHead(1);
        l707.addAtHead(0);
        assertEquals(node1.toString(), l707.head.next.toString());
    }

    @Test
    void addAtTail() {
        LeetCode0707DesignLinkedList2.ListNode node1 = new LeetCode0707DesignLinkedList2.ListNode(0);

        LeetCode0707DesignLinkedList2 l707 = new LeetCode0707DesignLinkedList2();
        l707.addAtTail(0);
        assertEquals(node1.toString(), l707.head.next.toString());
    }

    @Test
    void addAtTail2() {
        LeetCode0707DesignLinkedList2.ListNode node1 = new LeetCode0707DesignLinkedList2.ListNode(0);
        LeetCode0707DesignLinkedList2.ListNode node2 = new LeetCode0707DesignLinkedList2.ListNode(1);
        node1.next = node2;

        LeetCode0707DesignLinkedList2 l707 = new LeetCode0707DesignLinkedList2();
        l707.addAtTail(0);
        l707.addAtTail(1);
        assertEquals(node1.toString(), l707.head.next.toString());
    }

    @Test
    void addAtIndex() {

        LeetCode0707DesignLinkedList2.ListNode node1 = new LeetCode0707DesignLinkedList2.ListNode(0);
        LeetCode0707DesignLinkedList2.ListNode node2 = new LeetCode0707DesignLinkedList2.ListNode(1);
        LeetCode0707DesignLinkedList2.ListNode node3 = new LeetCode0707DesignLinkedList2.ListNode(2);
        node1.next = node2;
        node2.next = node3;

        LeetCode0707DesignLinkedList2 l707 = new LeetCode0707DesignLinkedList2();
        l707.addAtTail(0);
        l707.addAtTail(1);
        l707.addAtIndex(2, 2);
        assertEquals(node1.toString(), l707.head.next.toString());
    }

    @Test
    void addAtIndex2() {
        LeetCode0707DesignLinkedList2.ListNode node1 = new LeetCode0707DesignLinkedList2.ListNode(0);

        LeetCode0707DesignLinkedList2 l707 = new LeetCode0707DesignLinkedList2();
        l707.addAtTail(0);
        assertEquals(node1.toString(), l707.head.next.toString());
    }

    @Test
    void addAtIndex3() {
        LeetCode0707DesignLinkedList2.ListNode node1 = new LeetCode0707DesignLinkedList2.ListNode(0);
        LeetCode0707DesignLinkedList2.ListNode node2 = new LeetCode0707DesignLinkedList2.ListNode(1);
        node1.next = node2;

        LeetCode0707DesignLinkedList2 l707 = new LeetCode0707DesignLinkedList2();
        l707.addAtIndex(0, 0);
        l707.addAtIndex(1, 1);
        assertEquals(node1.toString(), l707.head.next.toString());
    }

    @Test
    void addAtIndex4() {
        LeetCode0707DesignLinkedList2 l707 = new LeetCode0707DesignLinkedList2();
        l707.addAtIndex(0, 0);
        l707.addAtIndex(1, 1);
        l707.addAtIndex(2, 2);
        assertEquals(3, l707.size);
    }

    @Test
    void deleteAtIndex() {
        LeetCode0707DesignLinkedList2.ListNode node1 = new LeetCode0707DesignLinkedList2.ListNode(0);
        LeetCode0707DesignLinkedList2.ListNode node2 = new LeetCode0707DesignLinkedList2.ListNode(2);
        node1.next = node2;

        LeetCode0707DesignLinkedList2 l707 = new LeetCode0707DesignLinkedList2();
        l707.addAtTail(0);
        l707.addAtTail(1);
        l707.addAtTail(2);
        l707.deleteAtIndex(1);
        assertEquals(node1.toString(), l707.head.next.toString());
    }

    //["MyLinkedList","addAtHead","addAtHead","addAtHead","addAtIndex","deleteAtIndex","addAtHead","addAtTail","get","addAtHead","addAtIndex","addAtHead"]
    //[[],               [7],            [2],       [1],        [3,0],      [2],           [6],         [4],     [4],     [4],      [5,0],        [6]]

    @Test
    void test() {
        LeetCode0707DesignLinkedList2 l707 = new LeetCode0707DesignLinkedList2();
        l707.addAtHead(7);
        l707.addAtHead(2);
        l707.addAtHead(1);
        l707.addAtIndex(3,0);
        l707.deleteAtIndex(2);
        l707.addAtHead(6);
        l707.addAtTail(4);
        l707.get(4);
        l707.addAtHead(4);
        l707.addAtIndex(5,0);
        l707.addAtHead(6);
    }

    //["MyLinkedList","addAtHead","deleteAtIndex","addAtHead","addAtHead","addAtHead","addAtHead","addAtHead","addAtTail","get","deleteAtIndex","deleteAtIndex"]
    //[   [],             [2],             [1],         [2],         [7],      [3],          [2],        [5],       [5],   [5],      [6],            [4]]

    @Test
    void test2() {
        LeetCode0707DesignLinkedList2 l707 = new LeetCode0707DesignLinkedList2();
        l707.addAtHead(2);
        System.out.println(l707.head.next);
        System.out.println(l707.size);
        l707.deleteAtIndex(1);
        System.out.println(l707.head.next);
        System.out.println(l707.size);
        l707.addAtHead(2);
        System.out.println(l707.head.next);
        System.out.println(l707.size);
        l707.addAtHead(7);
        System.out.println(l707.head.next);
        System.out.println(l707.size);
        l707.addAtHead(3);
        System.out.println(l707.head.next);
        System.out.println(l707.size);
        l707.addAtHead(2);
        System.out.println(l707.head.next);
        System.out.println(l707.size);
        l707.addAtHead(5);
        System.out.println(l707.head.next);
        System.out.println(l707.size);
        l707.addAtTail(5);
        System.out.println(l707.head.next);
        l707.get(5);
        System.out.println(l707.head.next);
        l707.deleteAtIndex(6);
        System.out.println(l707.head.next);
        l707.deleteAtIndex(4);
        System.out.println(l707.head.next);
    }
}