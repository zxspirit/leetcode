package com.newzhxu.removeelement;

/**
 * 27. 移除元素
 * <a href="https://leetcode.cn/problems/remove-element/"></a>
 * 数组
 * 双指针
 */
class Solution {
    public int removeElement(int[] nums, int val) {
        int slow = 0;
        int length = nums.length;
        for (int i = 0; i < length; i++) {
            if (nums[i] != val) {
                nums[slow++] = nums[i];
            }
        }
        return slow;
    }
}