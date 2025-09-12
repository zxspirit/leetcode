package com.newzhxu.besttimetobuyandsellstockii;

/**
 * 122. 买卖股票的最佳时机 II
 * <a href="https://leetcode.cn/problems/best-time-to-buy-and-sell-stock-ii/">...</a>
 * 贪心
 * 数组
 * 动态规划
 */
class Solution {
    public int maxProfit(int[] prices) {
        int result = 0;
        for (int i = 1; i < prices.length; i++) {
            result += Math.max(0, prices[i] - prices[i - 1]);
        }
        return result;
    }
}