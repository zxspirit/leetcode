package com.newzhxu.mincostclimbingstairs;

/**
 * 746. 使用最小花费爬楼梯
 * <a href="https://leetcode.cn/problems/min-cost-climbing-stairs/">...</a>
 * 数组
 * 动态规划
 */
public class Solution {
    public int minCostClimbingStairs(int[] cost) {
        int length = cost.length;
        if (length == 1) {
            return cost[0];
        }
        int p1 = cost[0], p2 = cost[1];
        for (int i = 2; i < length; i++) {
            int sum = Math.min(p1, p2) + cost[i];
            p1 = p2;
            p2 = sum;
        }
        return Math.min(p1, p2);
    }
}
