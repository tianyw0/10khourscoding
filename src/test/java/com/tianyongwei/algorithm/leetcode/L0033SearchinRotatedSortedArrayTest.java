package com.tianyongwei.algorithm.leetcode;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

class L0033SearchinRotatedSortedArrayTest {

  @Test
  void search() {
    assertEquals(4, new L0033SearchinRotatedSortedArray().search(new int[]{4,5,6,7,0,1,2}, 0));
  }

  @Test
  void search1() {
    assertEquals(5, new L0033SearchinRotatedSortedArray().search(new int[]{4,5,6,7,0,1,2}, 1));
  }

  @Test
  void search2() {
    assertEquals(-1, new L0033SearchinRotatedSortedArray().search(new int[]{4,5,6,7,0,1,2}, 3));
  }

  @Test
  void search3() {
    assertEquals(-1, new L0033SearchinRotatedSortedArray().search(new int[]{1}, 0));
  }
}