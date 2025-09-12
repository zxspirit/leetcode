package com.newzhxu.squaresofasortedarray;

/**
 * 977. 有序数组的平方
 * <a href="https://leetcode.cn/problems/squares-of-a-sorted-array/">...</a>
 * 数组
 * 双指针
 * 排序
 * 第 120 场周赛
 */
class Solution {
    public int[] sortedSquares(int[] nums) {
        int n = nums.length;
        int[] ans = new int[n];
        for (int i = 0, j = n - 1, pos = n - 1; i <= j; ) {
            if (nums[i] * nums[i] > nums[j] * nums[j]) {
                ans[pos] = nums[i] * nums[i];
                ++i;
            } else {
                ans[pos] = nums[j] * nums[j];
                --j;
            }
            --pos;
        }
        return ans;

    }
}