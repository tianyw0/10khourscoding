package leetcode;

import leetcode.common.ListNode;

public class LeetCode0707DesignLinkedList1 {
    /** Initialize your data structure here. */
    int size;
    ListNode head;

    // 构造一个带哨兵节点的单向链表
    public LeetCode0707DesignLinkedList1() {
        head = new ListNode(0);
        size = 0;
    }

    /** Add a node of value val before the first element of the linked list.
     * After the insertion, the new node will be the first node of the linked list. */
    // 将元素插入头节点
    public void addAtHead(int val) {
        addAtIndex(0, val);
    }

    /** Append a node of value val to the last element of the linked list. */
    // 将元素插入尾节点
    public void addAtTail(int val) {
        addAtIndex(size, val);
    }

    /** Add a node of value val before the index-th node in the linked list.
     * If index equals to the length of linked list,
     * the node will be appended to the end of linked list.
     * If index is greater than the length, the node will not be inserted. */
    // 向第几个元素插值
    public void addAtIndex(int index, int val) {
        if(0 <= index && index <= size) {
            ListNode prev = head;
            for (int i = 0; i < index; i++) {
                prev = prev.next;
            }
            ListNode toadd = new ListNode(val);
            if(prev.next == null) {
                prev.next = toadd;
            } else {
                toadd.next = prev.next;
                prev.next = toadd;
            }
            size++;
        }
    }

    /** Delete the index-th node in the linked list, if the index is valid. */
    public void deleteAtIndex(int index) {
        if(0 <= index && index < size) {
            ListNode prev = head;
            for (int i = 0; i < index ; i++) {
                prev = prev.next;
            }

            prev.next = prev.next.next;
            size--;
        }
    }

    /** Get the value of the index-th node in the linked list.
     * If the index is invalid, return -1. */
    public int get(int index) {
        if(0 <= index && index < size) {
            ListNode prev = head;
            for (int i = 0; i < index; i++) {
                prev = prev.next;
            }
            return prev.next.val;
        } else {
            return -1;
        }
    }
}
