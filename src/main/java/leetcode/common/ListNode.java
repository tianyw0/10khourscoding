package leetcode.common;

import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.ToString;

@Data
public class ListNode {
  public int val;
  @ToString.Exclude
  @EqualsAndHashCode.Exclude
  public ListNode next;
  public ListNode(int x) { val = x; }
}