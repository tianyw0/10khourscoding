package com.tianyongwei.algorithm.leetcode;

import static org.junit.jupiter.api.Assertions.assertEquals;
import org.junit.jupiter.api.Test;

public class L0003LengthOfLongestSubstringTest {

  @Test
  void testLengthOfLongestSubstring() {
    var o = new L0003LengthOfLongestSubstring();

    assertEquals(0, o.lengthOfLongestSubstring(null));
    assertEquals(0, o.lengthOfLongestSubstring(""));
    assertEquals(3, o.lengthOfLongestSubstring("abcabcbb"));
    assertEquals(1, o.lengthOfLongestSubstring("bbbbb"));
    assertEquals(3, o.lengthOfLongestSubstring("pwwkew"));
    assertEquals(2, o.lengthOfLongestSubstring("abababab"));
    assertEquals(1, o.lengthOfLongestSubstring(" "));
    assertEquals(2, o.lengthOfLongestSubstring("au"));
    assertEquals(4, o.lengthOfLongestSubstring("jbpnbwwd"));
  }
}
