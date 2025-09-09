package com.newzhxu.链表.相交链表_160;

// https://leetcode.cn/problems/intersection-of-two-linked-lists/?envType=study-plan-v2&envId=top-100-liked
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

