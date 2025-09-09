package com.newzhxu.feibonaqishulielocf;

/**
 * LCR 126. 斐波那契数
 * <a href="https://leetcode.cn/problems/fei-bo-na-qi-shu-lie-lcof/"></a>
 * 记忆化搜索
 * 数学
 * 动态规划
 */
public class Solution {
    // 1.递归 时间复杂度O（N）, 空间复杂度O(N)
//    Map<Integer, Integer> map = new HashMap<>();
//
//    public int fib(int n) {
//        if (map.containsKey(n)) {
//            return map.get(n);
//        }
//        if (n == 0 || n == 1) {
//            return n;
//        }
//        int i = (fib(n - 1) + fib(n - 2)) % 1000000007;
//        map.put(n, i);
//        return i;
//    }
    // 表格法1
//    public int fib(int n) {
//        if (n == 0 || n == 1) return n;
//        int[] dp = new int[n + 1];
//        dp[0] = 0;
//        dp[1] = 1;
//        for (int i = 2; i <= n; i++) {
//            dp[i] = (dp[i - 1] + dp[i - 2]) % 1000000007;
//        }
//        return dp[n];
//
//    }
    // 表格法2 存前两个数字，减少内存开销
    public int fib(int n) {
        if (n == 0 || n == 1) {
            return n;
        }
        int a = 0, b = 1;
        for (int i = 2; i <= n; i++) {
            int sum = (a + b) % 1000000007;
            a = b;
            b = sum;
        }
        return b;

    }
}
