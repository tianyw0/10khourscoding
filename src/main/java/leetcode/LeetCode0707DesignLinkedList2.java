package leetcode;


import lombok.Data;
import lombok.ToString;

@Data
public class LeetCode0707DesignLinkedList2 {
    /** Initialize your data structure here. */
    int size;
    ListNode head;
    ListNode tail;

    // 构造一个带哨兵节点的单向链表
    public LeetCode0707DesignLinkedList2() {
        head = new ListNode(0);
        tail = new ListNode(0);
        tail.prev = head;
        head.next = tail;
        size = 0;
    }

    /** Add a node of value val before the first element of the linked list.
     * After the insertion, the new node will be the first node of the linked list. */
    public void addAtHead(int val) {
        addAtIndex(0, val);
    }

    /** Append a node of value val to the last element of the linked list. */
    public void addAtTail(int val) {
        addAtIndex(size, val);
    }

    /** Add a node of value val before the index-th node in the linked list.
     * If index equals to the length of linked list,
     * the node will be appended to the end of linked list.
     * If index is greater than the length, the node will not be inserted. */
    public void addAtIndex(int index, int val) {
        if(0 <= index && index <= size) {
            ListNode tempPrev = head;
            for (int i = 0; i < index; i++) {
                tempPrev = tempPrev.next;
            }
            ListNode toadd = new ListNode(val);
            ListNode tempNext = tempPrev.next;

            toadd.prev = tempNext.prev;
            toadd.next = tempPrev.next;

            tempNext.prev = toadd;
            tempPrev.next = toadd;
            size++;
        }
    }

    /** Delete the index-th node in the linked list, if the index is valid. */
    public void deleteAtIndex(int index) {
        if(0 <= index && index < size) {
            ListNode tempPrev = head;
            for (int i = 0; i < index ; i++) {
                tempPrev = tempPrev.next;
            }

            ListNode toDel = tempPrev.next;
            tempPrev.next = toDel.next;
            tempPrev.next.prev = toDel.prev;

            size--;
        }
    }

    /** Get the value of the index-th node in the linked list.
     * If the index is invalid, return -1. */
    public int get(int index) {
        if(0 <= index && index < size) {
            ListNode tempPrev = head;
            for (int i = 0; i < index; i++) {
                tempPrev = tempPrev.next;
            }
            return tempPrev.next.val;
        } else {
            return -1;
        }
    }

    // 双向链表节点
    @Data
    static class ListNode {
        public int val;
        @ToString.Exclude
        public ListNode next;
        @ToString.Exclude
        public ListNode prev;
        public ListNode(int x) { val = x; }
    }

}
