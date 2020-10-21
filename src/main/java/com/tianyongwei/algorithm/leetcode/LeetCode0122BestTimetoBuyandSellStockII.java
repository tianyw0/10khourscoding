package com.tianyongwei.algorithm.leetcode;

public class LeetCode0122BestTimetoBuyandSellStockII {
    // O(N)
    public int maxProfit(int[] prices) {
        if(prices.length == 0) return 0;
        int profit = 0;
        int minPrice = prices[0];
        for (int i = 1; i < prices.length; i++) {
            int curr = prices[i];
            int last = prices[i-1];
            if(curr < last) {
                // 开始下降
                profit += (last - minPrice);
                minPrice = curr;
            }
        }
        profit += (prices[prices.length-1]-minPrice);
        return profit;
    }
}
