package com.tianyongwei.algorithm.leetcode;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertArrayEquals;

class L0238ProductofArrayExceptSelfTest {

  L0238ProductofArrayExceptSelf productofArrayExceptSelf
          = new L0238ProductofArrayExceptSelf();
  @Test
  void productExceptSelf() {
    assertArrayEquals(new int[]{6,3,2}, productofArrayExceptSelf.productExceptSelf(new int[]{1,2,3}));
  }
}