package com.tianyongwei.algorithm.leetcode;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class L0190ReverseBitsTest {

    // 测试通不过，但是提交正确，Java没有无符号整型
    @Test
    void reverseBits() {
        assertEquals((int) Math.pow(2, 31), new L0190ReverseBits().reverseBits(2));
    }

    @Test
    void reverseBits2() {
        assertEquals((int) Math.pow(2, 32), new L0190ReverseBits().reverseBits(1));
    }
}