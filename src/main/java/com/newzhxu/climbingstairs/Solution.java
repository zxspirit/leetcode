package com.newzhxu.climbingstairs;

/**
 * 70. 爬楼梯
 * <a href="https://leetcode.cn/problems/climbing-stairs/">...</a>
 * 记忆化搜索
 * 数学
 * 动态规划
 */
public class Solution {
    public int climbStairs(int n) {
        if (n == 1) return 1;
        int a = 1, b = 1;
        for (int i = 2; i <= n; i++) {
            int temp = a + b;
            a = b;
            b = temp;
        }
        return b;
    }
}
