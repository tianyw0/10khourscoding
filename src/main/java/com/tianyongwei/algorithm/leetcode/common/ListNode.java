package com.tianyongwei.algorithm.leetcode.common;

import lombok.EqualsAndHashCode;
import lombok.ToString;

@ToString
// 单向链表节点
@EqualsAndHashCode
public class ListNode {
  public int val;
  public ListNode next;
  public ListNode(int x) { val = x; }
}