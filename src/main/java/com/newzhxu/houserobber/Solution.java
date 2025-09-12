package com.newzhxu.houserobber;

/**
 * 198. 打家劫舍
 * <a href="https://leetcode.cn/problems/house-robber/">...</a>
 * 数组
 * 动态规划
 */
class Solution {
    public int rob(int[] nums) {
        int len = nums.length;
        if (len == 1) {
            return nums[0];
        }
        int a = nums[0], b = Math.max(nums[0], nums[1]);
        for (int i = 2; i < len; i++) {
            int temp = Math.max(a + nums[i], b);
            a = b;
            b = temp;
        }
        return Math.max(a, b);
    }
}