package com.LC简单题;

public class a206反转链表 {
}


//class ListNode{
//    int val;
//    ListNode next;
//
//    public ListNode() {
//    }
//
//    public ListNode(int val) {
//        this.val = val;
//    }
//
//    public ListNode(int val, ListNode next) {
//        this.val = val;
//        this.next = next;
//    }
//}


class Solution4 {
    public ListNode reverseList(ListNode head) {
        ListNode cur = head;
        int len = 0;
        while (cur != null) {
            cur = cur.next;
            len++;
        }
        int[] arr = new int[len + 1];
        len=0;
        cur = head;
        while (cur != null) {
            arr[len++] = cur.val;
            cur = cur.next;
        }
        cur = head;
        len=len-1;
        while (cur != null) {
            cur.val = arr[len--];
            cur = cur.next;
        }
        return head;
    }
}