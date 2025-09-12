package com.newzhxu.twosum;

import java.util.HashMap;
import java.util.Map;

/**
 * 1. 两数之和
 * <a href="https://leetcode.cn/problems/two-sum/">...</a>
 * 数组
 * 哈希表
 */
class Solution {
    public int[] twoSum(int[] nums, int target) {
        Map<Integer, Integer> map = new HashMap<>();
        for (int i = 0; i < nums.length; i++) {
            if (map.containsKey(target - nums[i])) {
                return new int[]{map.get(target - nums[i]), i};
            }
            map.put(nums[i], i);
        }
        return new int[]{};

    }
}