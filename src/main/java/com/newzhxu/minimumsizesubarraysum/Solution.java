package com.newzhxu.minimumsizesubarraysum;

/**
 * 209. 长度最小的子数组
 * <a href="https://leetcode.cn/problems/minimum-size-subarray-sum/">...</a>
 * 数组
 * 二分查找
 * 前缀和
 * 滑动窗口
 */
class Solution {
    public int minSubArrayLen(int target, int[] nums) {
        int left = 0;
        int sum = 0;
        int result = Integer.MAX_VALUE;
        for (int right = 0; right < nums.length; right++) {
            sum += nums[right];
            while (sum >= target) {
                result = Math.min(result, right - left + 1);
                sum -= nums[left++];
            }
        }
        return result == Integer.MAX_VALUE ? 0 : result;
    }
}