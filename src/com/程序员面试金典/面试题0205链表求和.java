package com.程序员面试金典;

public class 面试题0205链表求和 {
}


/*
思路；
1、判断l1不为空或l2不为空或进位不等于0
2、若成立，则用sum去加上l1.val+l2.val+进位，然后，将sum%10保存在新建节点上面，取整的值加入下一轮计算
3、若不成立的话，就返回新建的头节点的下一个节点

 */

class Solution0205 {

    public ListNode addTwoNumbers(ListNode l1, ListNode l2) {
        int carray = 0;//carray表示进位；
        ListNode head = new ListNode(-1);
        ListNode pre = head;
        while(l1 != null || l2 != null || carray != 0) {
            int sum = carray;
            if(l1 != null) {
                sum += l1.val;
                l1 = l1.next;
            }
            if(l2 != null) {
                sum += l2.val;
                l2 = l2.next;
            }
            //新建一个节点保存值
            pre.next = new ListNode(sum%10);
            pre = pre.next;
            carray = sum/10;

        }
        return head.next;
    }
}










