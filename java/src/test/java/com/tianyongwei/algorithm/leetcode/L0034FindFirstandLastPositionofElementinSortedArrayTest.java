package com.tianyongwei.algorithm.leetcode;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class L0034FindFirstandLastPositionofElementinSortedArrayTest {

  @Test
  void searchRange() {
    assertArrayEquals(new int[] {3,4}, new L0034FindFirstandLastPositionofElementinSortedArray().searchRange(new int[]{5,7,7,8,8,10}, 8));
  }

  @Test
  void searchRange2() {
    assertArrayEquals(new int[] {-1,-1}, new L0034FindFirstandLastPositionofElementinSortedArray().searchRange(new int[]{5,7,7,8,8,10}, 6));
  }

  @Test
  void searchRange3() {
    assertArrayEquals(new int[] {3,3}, new L0034FindFirstandLastPositionofElementinSortedArray().searchRange(new int[]{5,7,7,8,9,10}, 8));
  }
}