package com.程序员面试金典;

public class 面试题0206回文链表 {
}

/*
思路：
1、利用快慢指针，找到中点
2、然后，判断如果fast不为空，说明链表的长度是奇数个，则slow = slow.next;
3、原地反转后面的链表
4、最后一个一个比较即可
 */

class Solution0206 {

    public static void main(String[] args) {

    }

    public boolean isPalindrome(ListNode head) {
        ListNode fast = head, slow = head;
        //通过快慢指针找到中点
        while (fast != null && fast.next != null) {
            fast = fast.next.next;
            slow = slow.next;
        }
        //如果fast不为空，说明链表的长度是奇数个
        if (fast != null) {
            slow = slow.next;
        }
        //反转后半部分链表
        slow = reverse(slow);

        fast = head;
        while (slow != null) {
            //然后比较，判断节点值是否相等
            if (fast.val != slow.val) {
                return false;
            }
            fast = fast.next;
            slow = slow.next;
        }
        return true;
    }

    //原地反转链表
    public ListNode reverse(ListNode head) {
        ListNode prev = null;
        while (head != null) {
            ListNode temp = head.next;
            head.next = prev;
            prev = head;
            head = temp;
        }
        return prev;
    }
}


