package leetcode;

import leetcode.common.ListNode;

public class LeetCode0707DesignLinkedList {
    /** Initialize your data structure here. */
    // 看看暴露的接口，使用双节点实现和单节点实现都是可以的，跟节点元素无关。
    // 先设计单向链表方式
    // 初始化构造方法
    int size;
    ListNode head;

    // todo 待实现
    public LeetCode0707DesignLinkedList() {
        head = new ListNode(0);
        size = 1;
    }

    /** Get the value of the index-th node in the linked list. If the index is invalid, return -1. */
    // 获取第几个元素
    public int get(int index) {
        if(index >= size || index < 0) return -1;

        for (int i = 0; i < 10; i++) {
            
        }
        return 0;
    }

    /** Add a node of value val before the first element of the linked list. After the insertion, the new node will be the first node of the linked list. */
    // 将元素插入头节点
    public void addAtHead(int val) {

    }

    /** Append a node of value val to the last element of the linked list. */
    // 将元素插入尾节点
    public void addAtTail(int val) {

    }

    /** Add a node of value val before the index-th node in the linked list. If index equals to the length of linked list, the node will be appended to the end of linked list. If index is greater than the length, the node will not be inserted. */
    // 向第几个元素插值
    public void addAtIndex(int index, int val) {

    }

    /** Delete the index-th node in the linked list, if the index is valid. */
    // 删除第几个元素
    public void deleteAtIndex(int index) {

    }
}
