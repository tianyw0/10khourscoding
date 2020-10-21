package com.tianyongwei.algorithm.leetcode;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class LeetCode0287FindtheDuplicateNumberTest {

  @Test
  void findDuplicate() {
    assertEquals(1, new LeetCode0287FindtheDuplicateNumber().findDuplicate(new int[]{1,2,3,4,5,1}));
  }

  @Test
  void findDuplicate2() {
    assertEquals(1, new LeetCode0287FindtheDuplicateNumber().findDuplicate(new int[]{1,1}));
  }
}