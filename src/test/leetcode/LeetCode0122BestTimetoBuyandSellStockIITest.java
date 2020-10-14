package leetcode;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class LeetCode0122BestTimetoBuyandSellStockIITest {

    @Test
    void maxProfit() {
        assertEquals(7, new LeetCode0122BestTimetoBuyandSellStockII().maxProfit(new int[]{7,1,5,3,6,4}));
    }

    @Test
    void maxProfit2() {
        assertEquals(4, new LeetCode0122BestTimetoBuyandSellStockII().maxProfit(new int[]{1,2,3,4,5}));
    }
}