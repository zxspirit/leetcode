package com.newzhxu.intersectionoftwolinkedlists;

/**
 * 160. 相交链表
 * <a href="https://leetcode.cn/problems/intersection-of-two-linked-lists/">...</a>
 * 哈希表
 * 链表
 * 双指针
 */
public class Solution {


    ListNode getIntersectionNode(ListNode headA, ListNode headB) {
        if (headA == null || headB == null) {
            return null;
        }
        ListNode slow = headA;
        ListNode fast = headB;
        while (slow != fast) {
            slow = slow == null ? headB : slow.next;

            fast = fast == null ? headA : fast.next;
        }

        return slow;
    }


}

