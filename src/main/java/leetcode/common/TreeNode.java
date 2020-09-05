package leetcode.common;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@Builder
@NoArgsConstructor
@AllArgsConstructor
public class TreeNode {
  public int val;
  public TreeNode left;
  public TreeNode right;
  public TreeNode(int x) { val = x; }
}
