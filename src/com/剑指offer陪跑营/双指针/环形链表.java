package com.剑指offer陪跑营.双指针;

public class 环形链表 {
}


class ListNode {
    int val;
    ListNode next;

    ListNode(int x) {
        val = x;
        next = null;
    }
}


//使用快慢指针
class Solution {
    public boolean hasCycle(ListNode head) {
        //防止出现空链表的情况
        if (head == null) {
            return false;
        }
        //定义一个慢指针，一个快指针
        ListNode s = head, f = head;
        boolean flag = true;
        while (s != null || f != null) {

            if (s.next == null || f.next == null || f.next.next == null) {
                flag = false;
                break;
            }
            s = s.next;
            f = f.next.next;
            if (f == s) {
                flag = true;
                break;
            }
        }
        if (flag == false) {
            return false;
        } else {
            return true;
        }

    }
}
