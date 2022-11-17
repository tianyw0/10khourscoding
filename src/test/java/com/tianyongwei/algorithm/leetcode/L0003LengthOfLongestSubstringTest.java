package com.tianyongwei.algorithm.leetcode;

import static org.junit.jupiter.api.Assertions.assertEquals;
import org.junit.jupiter.api.Test;

public class L0003LengthOfLongestSubstringTest {

  @Test
  void testLengthOfLongestSubstring() {
    var o = new L0003LengthOfLongestSubstring();
    assertEquals(2, o.lengthOfLongestSubstring("sss"));
  }
}
