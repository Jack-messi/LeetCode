package com.剑指offer陪跑营.a2链表;

public class a2剑指Offer06从尾到头打印链表 {
}

class ListNode {
    int val;
    ListNode next;

    public ListNode() {
    }
    ListNode(int x) {
        val = x;
    }
    public ListNode(int val, ListNode next) {
        this.val = val;
        this.next = next;
    }
}

class Solutiona2 {
    public int[] reversePrint(ListNode head) {
        ListNode node = head;
        int count = 0;
        while (node != null) {
            count++;
            node = node.next;
        }
        int[] arr = new int[count];
        node = head;
        for (int i = 0; i < count - 1; i++) {
            arr[i] = node.val;
            node = node.next;
        }
        return arr;
    }
}
