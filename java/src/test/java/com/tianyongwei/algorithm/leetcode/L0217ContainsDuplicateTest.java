package com.tianyongwei.algorithm.leetcode;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

class L0217ContainsDuplicateTest {

    L0217ContainsDuplicate containsDuplicate
            = new L0217ContainsDuplicate();
    @Test
    void containsDuplicate() {
        assertEquals(true, containsDuplicate.containsDuplicate(new int[]{1, 2, 3, 3}));
    }
}