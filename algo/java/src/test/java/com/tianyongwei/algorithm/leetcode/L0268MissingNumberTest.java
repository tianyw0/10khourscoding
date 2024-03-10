package com.tianyongwei.algorithm.leetcode;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class L0268MissingNumberTest {

    @Test
    void missingNumber() {
        assertEquals(0, new L0268MissingNumber().missingNumber(new int[]{1,2,3}));
    }

    @Test
    void missingNumber2() {
        assertEquals(1, new L0268MissingNumber().missingNumber(new int[]{0,2,3}));
    }
}