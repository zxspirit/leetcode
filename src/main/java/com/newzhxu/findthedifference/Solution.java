package com.newzhxu.findthedifference;

/**
 * 389. 找不同
 * <a href="https://leetcode.cn/problems/find-the-difference/">...</a>
 * 位运算
 * 哈希表
 * 字符串
 * 排序
 */
class Solution {
//    public char findTheDifference(String s, String t) {
//        int a = 0;
//        for (int i = 0; i < s.length(); i++) {
//            a ^= s.charAt(i);
//        }
//        for (int i = 0; i < t.length(); i++) {
//            a ^= t.charAt(i);
//        }
//        return ((char) a);
//
//    }


    public char findTheDifference(String s, String t) {
        int s1 = 0, t1 = 0;
        for (int i = 0; i < s.length(); i++) {
            s1 += s.charAt(i);
        }
        for (int i = 0; i < t.length(); i++) {
            t1 += t.charAt(i);
        }
        return ((char) Math.abs(s1 - t1));

    }
}