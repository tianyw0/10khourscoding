package com.tianyongwei.algorithm.leetcode;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

class LeetCode0069SqrtXTest {

  @Test
  void mySqrt() {
    assertEquals(2, new LeetCode0069SqrtX().mySqrt(8));
  }

  @Test
  void mySqrt2() {
    assertEquals(2, new LeetCode0069SqrtX().mySqrt(7));
  }

  @Test
  void mySqrt3() {
    assertEquals(0, new LeetCode0069SqrtX().mySqrt(0));
  }

  @Test
  void mySqrt4() {
    assertEquals(4, new LeetCode0069SqrtX().mySqrt(16));
  }

  @Test
  void mySqrt5() {
    assertEquals(46339, new LeetCode0069SqrtX().mySqrt(2147395599));
  }
}