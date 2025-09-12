package com.newzhxu.reverselinkedlist;

/**
 * 206. 反转链表
 * <a href="https://leetcode.cn/problems/reverse-linked-list/">...</a>
 * 递归
 * 链表
 */
class Solution {
    public ListNode reverseList(ListNode head) {
        ListNode pre = null;
        ListNode cur = head;
        while (cur != null) {
            ListNode next = cur.next;
            cur.next = pre;
            pre = cur;
            cur = next;
        }
        return pre;
    }
}