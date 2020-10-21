package com.tianyongwei.algorithm.leetcode;

public class LeetCode0121BestTimetoBuyandSellStock {
    // O(N)
    public int maxProfit(int[] prices) {
        int maxProfit = 0;
        if(prices.length == 0) return 0;

        int maxPrice = prices[prices.length - 1];
        for (int i = prices.length - 2; i >= 0; i--) {
            int curr = prices[i];
            maxProfit = Math.max(maxProfit, maxPrice - curr);
            maxPrice = Math.max(maxPrice, curr);
        }
        return maxProfit;
    }
}
