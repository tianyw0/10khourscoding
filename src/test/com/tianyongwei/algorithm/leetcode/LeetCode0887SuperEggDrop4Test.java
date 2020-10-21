package com.tianyongwei.algorithm.leetcode;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

class LeetCode0887SuperEggDrop4Test {

    LeetCode0887SuperEggDrop4 superEggDrop
            = new LeetCode0887SuperEggDrop4();

    @Test
    void testSuperEggDrop() {
//        assertEquals(3, superEggDrop.superEggDrop(2, 6));
//        assertEquals(4, superEggDrop.superEggDrop(3, 14));
//        assertEquals(1, superEggDrop.superEggDrop(2, 1));
        assertEquals(5, superEggDrop.superEggDrop(3, 25));
//        assertEquals(19, superEggDrop.superEggDrop(4, 5000));
//        assertEquals(14, superEggDrop.superEggDrop(8, 10000));
    }
}