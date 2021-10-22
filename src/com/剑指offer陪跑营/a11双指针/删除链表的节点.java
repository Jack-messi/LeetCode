package com.剑指offer陪跑营.a11双指针;

public class 删除链表的节点 {
}

class ListNode {
    int val;
    ListNode next;
    ListNode(int x) {
        val = x;
    }
}

class Solution {
    public ListNode deleteNode(ListNode head, int val) {
        ListNode listNode = new ListNode(-1);
        ListNode temp;
        listNode.next = head;
        temp = listNode;
        while (temp.next != null) {
            if (temp.next.val == val) {
                temp.next = temp.next.next;
            } else {
                temp = temp.next;
            }
        }
        return listNode.next;
    }
}