package com.tianyongwei.algorithm.leetcode;

import java.util.HashSet;

public class L0003LengthOfLongestSubstring {
  /**
   * 思路：最长不重复子串的长度
   * 方法一O(N**2)：笨方法，找出所有不重复子串，找出最长的子串
   * 方法二O(N)：滑动窗口
   */
  public int lengthOfLongestSubstring(String s) {
    if (s == null || s.length() == 0)
      return 0;
    // find all substrings without repeating characters
    var maxLen = 0;
    for (int headIndex = 0; headIndex < s.length(); headIndex++) {
      maxLen = Math.max(maxLen, genMaxLengthSubStr(headIndex, s));
    }
    return maxLen;
  }

  // 找出不重复子串，并算出长度
  private int genMaxLengthSubStr(int headIndex, String s) {
    // 越界
    if (headIndex > s.length() - 1)
      return 0;

    var set = new HashSet<Character>();
    for (int i = headIndex; i < s.length(); i++) {
      if (set.contains(s.charAt(i))) {
        return set.size();
      } else {
        set.add(s.charAt(i));
      }
    }
    return set.size();
  }

}