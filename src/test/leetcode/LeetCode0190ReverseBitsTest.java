package leetcode;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class LeetCode0190ReverseBitsTest {

    @Test
    void reverseBits() {
        assertEquals(10, new LeetCode0190ReverseBits().reverseBits(2));
    }

    @Test
    void reverseBits2() {
        assertEquals("", new LeetCode0190ReverseBits().reverseBits(1));
    }
}