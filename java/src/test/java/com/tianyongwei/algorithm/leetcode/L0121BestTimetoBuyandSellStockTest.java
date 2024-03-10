package com.tianyongwei.algorithm.leetcode;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class L0121BestTimetoBuyandSellStockTest {

    @Test
    void maxProfit() {
        assertEquals(5, new L0121BestTimetoBuyandSellStock().maxProfit(new int[]{7,1,5,3,6,4}));
    }

    @Test
    void maxProfit2() {
        assertEquals(0, new L0121BestTimetoBuyandSellStock().maxProfit(new int[]{7,6,4,3,1}));
    }
}