package com.tianyongwei.algorithm.leetcode;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

class LeetCode0217ContainsDuplicateTest {

    LeetCode0217ContainsDuplicate containsDuplicate
            = new LeetCode0217ContainsDuplicate();
    @Test
    void containsDuplicate() {
        assertEquals(true, containsDuplicate.containsDuplicate(new int[]{1, 2, 3, 3}));
    }
}