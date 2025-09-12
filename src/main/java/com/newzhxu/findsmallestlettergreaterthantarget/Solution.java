package com.newzhxu.findsmallestlettergreaterthantarget;

/**
 * 744. 寻找比目标字母大的最小字母
 * <a href="https://leetcode.cn/problems/find-smallest-letter-greater-than-target/">...</a>
 * 数组
 * 二分查找
 */
class Solution {
    public char nextGreatestLetter(char[] letters, char target) {
        int l = 0, r = letters.length - 1;
        while (l <= r) {
            int mid = (l + r) >> 1;

            if (letters[mid] > target) {
                r = mid - 1;
            } else {
                l = mid + 1;
            }

        }
        return letters[l % letters.length];
    }
}