package com.newzhxu.链表.反转链表_206;

import java.util.Stack;

public class Solution {
    public ListNode reverseList(ListNode head) {
        Stack<ListNode> listNodes = new Stack<>();
        while (head != null) {
            listNodes.push(head);
            head = head.next;
        }
        ListNode dummy = new ListNode(0);
        ListNode cur = dummy;
        while (!listNodes.isEmpty()) {
            ListNode pop = listNodes.pop();
            pop.next = null;
            cur.next = pop;
            cur = cur.next;
        }

        return dummy.next;
    }
}
