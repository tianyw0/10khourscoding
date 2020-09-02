package leetcode;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class LeetCode0238ProductofArrayExceptSelfTest {

  LeetCode0238ProductofArrayExceptSelf productofArrayExceptSelf
          = new LeetCode0238ProductofArrayExceptSelf();
  @Test
  void productExceptSelf() {
    assertArrayEquals(new int[]{6,3,2}, productofArrayExceptSelf.productExceptSelf(new int[]{1,2,3}));
  }
}