package com.tianyongwei.algorithm.leetcode;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class LeetCode0367ValidPerfectSquareTest {

  @Test
  void isPerfectSquare() {
    assertEquals(false, new LeetCode0367ValidPerfectSquare().isPerfectSquare(0));
  }

  @Test
  void isPerfectSquare1() {
    assertEquals(true, new LeetCode0367ValidPerfectSquare().isPerfectSquare(1));
  }

  @Test
  void isPerfectSquare2() {
    assertEquals(false, new LeetCode0367ValidPerfectSquare().isPerfectSquare(-1));
  }

  @Test
  void isPerfectSquare3() {
    assertEquals(true, new LeetCode0367ValidPerfectSquare().isPerfectSquare(100));
  }

  @Test
  void isPerfectSquare4() {
    assertEquals(false, new LeetCode0367ValidPerfectSquare().isPerfectSquare(101));
  }

  @Test
  void isPerfectSquare5() {
    assertEquals(false, new LeetCode0367ValidPerfectSquare().isPerfectSquare(2147483647));
  }
}