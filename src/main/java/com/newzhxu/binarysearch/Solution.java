package com.newzhxu.binarysearch;

/**
 * 704. 二分查找
 * <a href="https://leetcode.cn/problems/binary-search/">...</a>
 * 数组
 * 二分查找
 */
class Solution {
    public int search(int[] nums, int target) {
        int left = 0, right = nums.length - 1;

        while (left <= right) {
            int mid = (left + right) >> 1;
            if (nums[mid] > target) {
                right = mid - 1;
            } else if (nums[mid] < target) {
                left = mid + 1;
            } else {
                return mid;
            }
        }
        return -1;
    }
}