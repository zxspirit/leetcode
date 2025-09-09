package com.newzhxu.链表.反转链表_206;

public class Solution {
    //    public ListNode reverseList(ListNode head) {
//        Stack<ListNode> listNodes = new Stack<>();
//        while (head != null) {
//            listNodes.push(head);
//            head = head.next;
//        }
//        ListNode dummy = new ListNode(0);
//        ListNode cur = dummy;
//        while (!listNodes.isEmpty()) {
//            ListNode pop = listNodes.pop();
//            pop.next = null;
//            cur.next = pop;
//            cur = cur.next;
//        }
//
//        return dummy.next;
//    }
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
