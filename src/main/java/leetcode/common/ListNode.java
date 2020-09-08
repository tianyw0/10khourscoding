package leetcode.common;

import lombok.Data;

@Data
public class ListNode {
  public int val;
  public ListNode next;
  ListNode(int x) { val = x; }
}