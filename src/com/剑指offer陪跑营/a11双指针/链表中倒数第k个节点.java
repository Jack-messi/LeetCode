package com.剑指offer陪跑营.a11双指针;

public class 链表中倒数第k个节点 {
}

class Solution1 {
    public ListNode getKthFromEnd(ListNode head, int k) {
        ListNode node = new ListNode(-1);
        node.next = head;
        ListNode temp = node;
        int num = 0;
        while (temp.next != null) {
            temp = temp.next;
            num++;
        }
        num = num - k + 1;
        temp = node;
        int i = 0;
        while (i < num) {
            temp = temp.next;
            i++;
        }
        return temp.next;
    }
}


