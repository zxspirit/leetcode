package com.newzhxu.mergestringsalternately;

/**
 * 1768. 交替合并字符串
 * <a href="https://leetcode.cn/problems/merge-strings-alternately/">...</a>
 * 双指针
 * 字符串
 * 第 229 场周赛
 */
class Solution {
    public String mergeAlternately(String word1, String word2) {
        int m = word1.length(), n = word2.length();
        int i = 0, j = 0;
        StringBuilder builder = new StringBuilder();
        while (i < m || j < n) {
            if (i < m) {
                builder.append(word1.charAt(i));
                i++;
            }
            if (j < n) {
                builder.append(word2.charAt(j++));
            }
        }
        return builder.toString();
    }
}