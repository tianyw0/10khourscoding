package com.tianyongwei.algorithm.leetcode;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class L0292NimGameTest {

    @Test
    void canWinNim() {
        assertEquals(false, new L0292NimGame().canWinNim(4));
    }

    @Test
    void canWinNim2() {
        assertEquals(true, new L0292NimGame().canWinNim(5));
    }


}