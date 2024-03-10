package com.tianyongwei.algorithm.leetcode;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertArrayEquals;

class L0283MoveZeroesTest {

    L0283MoveZeroes moveZeroes
            = new L0283MoveZeroes();

    @Test
    void moveZeroes() {
        int[] ints = {0, 1, 0, 2, 3, 0};
        moveZeroes.moveZeroes(ints);
        assertArrayEquals(new int[]{1,2,3,0,0,0}, ints);
    }
}