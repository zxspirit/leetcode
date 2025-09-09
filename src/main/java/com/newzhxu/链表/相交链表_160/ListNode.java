package com.newzhxu.链表.相交链表_160;

import lombok.Data;

@Data
class ListNode {
    int val;
    ListNode next;

    ListNode(int x) {
        val = x;
        next = null;
    }

    public static ListNode build(int... vals) {
        ListNode dummy = new ListNode(0);
        ListNode cur = dummy;
        for (int v : vals) {
            cur.next = new ListNode(v);
            cur = cur.next;
        }
        return dummy.next;
    }

    static void connectTail(ListNode head, ListNode tail) {
        if (head == null) return;
        ListNode cur = head;
        while (cur.next != null) {
            cur = cur.next;
        }
        cur.next = tail;
    }
}
