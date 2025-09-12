package com.newzhxu.houserobberii;

/**
 * 213. 打家劫舍 II
 * <a href="https://leetcode.cn/problems/house-robber-ii/">...</a>
 * 数组
 * 动态规划
 */
class Solution {
    public int rob(int[] nums) {

        int l = nums.length;
        if (l == 1) return nums[0];
        return Math.max(robRange(nums, 0, l - 2), robRange(nums, 1, l - 1));
    }

    private int robRange(int[] nums, int start, int end) {
        int pre = 0, cur = 0;
        for (int i = start; i <= end; i++) {
            int temp = Math.max(pre + nums[i], cur);
            pre = cur;
            cur = temp;

        }
        return Math.max(pre, cur);
    }
}