package com.程序员面试金典;

public class 面试题0208环路检测 {
}


/*
思路：
使用快慢指针，判断是否成环。
1、如果没有，返回 no cycle
2、如果有，则计算出环的大小为n，
n的求法：当快慢指针第一次相遇的时候，确定是否有环
当快慢指针第二次相遇的时候，确定n的大小
3、两个慢指针A、B再从头开始，其中A先走N个，B起点走，再次相遇的时候就是环起点了，

 */
class Solution12 {
    public ListNode detectCycle(ListNode head) {

        if (head == null) {
            return null;
        }
        ListNode fast = head.next; //快指针
        ListNode slow = head;      //慢指针

        int flag = 0;
        //先找第一次相交节点判断成环
        while (fast != slow) {
            if (slow.next == null || fast.next == null || fast.next.next == null) {
                return null;
            }
            fast = fast.next.next;
            slow = slow.next;
        }
        fast = fast.next.next;
        slow = slow.next;
        int count = 1;
        //环中第二次相遇，即可求出环的大小；
        while (fast != slow) {
            count++;
            fast = fast.next.next;
            slow = slow.next;
        }
        fast = head;
        slow = head;
        //让fast指针先走k步
        while ((count--) > 0) {
            fast = fast.next;
        }
        //再次相遇就为环节点
        while (slow != fast) {
            fast = fast.next;
            slow = slow.next;
        }
        return slow;
    }
}





















