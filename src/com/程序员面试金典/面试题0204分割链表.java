package com.程序员面试金典;

public class 面试题0204分割链表 {
}

/*
思路：
1、新建一个节点，header
2、然后找到小于x的节点，放到header后面
3、最后将剩下的节点全部插入到header的屁股
注意：这个题目没有相后顺序的
 */

class Solution43 {
    public ListNode partition(ListNode head, int x) {
        ListNode header = new ListNode(-1);
        ListNode header1 = new ListNode(-1);
        header.next = head;
        ListNode temp = header;
        ListNode t2 = header1;

        while (temp.next != null) {
            if (temp.next.val < x) {
                t2.next = temp.next;
                temp.next = temp.next.next;
                t2 = t2.next;

            } else {
                temp = temp.next;
            }
        }
        t2.next = header.next;
        return header1.next;
    }
}




