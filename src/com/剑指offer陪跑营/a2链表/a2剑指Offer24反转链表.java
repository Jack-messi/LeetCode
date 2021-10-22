package com.剑指offer陪跑营.a2链表;

public class a2剑指Offer24反转链表 {
}

class Solution {
    public ListNode reverseList(ListNode head) {
        ListNode header = new ListNode(-1);
        header.next = null;
        ListNode cur = head;
        ListNode move = head;
        while (cur != null) {
            move = cur;
            cur = cur.next;
            move.next = header.next;
            header.next = move;
        }
        return header.next;
    }
}

