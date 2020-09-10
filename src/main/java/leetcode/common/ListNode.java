package leetcode.common;

import lombok.ToString;
import lombok.EqualsAndHashCode;
import lombok.ToString;

@ToString
// 单向链表节点
public class ListNode {
  public int val;
  @ToString.Exclude
  @EqualsAndHashCode.Exclude
  public ListNode next;
  public ListNode(int x) { val = x; }
}