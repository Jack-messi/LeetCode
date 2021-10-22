package com.程序员面试金典;

 class 试题0207链表相交 {

    public ListNode getIntersectionNode(ListNode headA, ListNode headB) {

        ListNode tempa = headA;
        ListNode tempb = headB;
        while (tempa != null) {
            while (tempb != null) {
                if (tempa == tempb) {
                    return tempa;
                }
                tempb = tempb.next;
            }
            tempa = tempa.next;
        }
        return null;
    }
}

/*

思路：
1、先分别求headA和headB的链表长度，
2、两个指针分别指向A和B，哪个链表长，哪个先走，直到他们的要走的路径相等
3、然后，两个指针一起走，必然会走到一个相等的节点
4、该节点可能为相交节点，或者是最后不相交的null节点

 */

class Solution0207 {
    public ListNode getIntersectionNode(ListNode headA, ListNode headB) {
        int lenA = length(headA);
        int lenB = length(headB);
        while (lenA != lenB) {
            if (lenA > lenB) {
                headA = headA.next;
                lenA--;
            } else {
                headB = headB.next;
                lenB--;
            }
        }
        while (headA!= headB)
        {
            headA = headA.next;
            headB = headB.next;
        }
        return headA;
    }
    int length(ListNode head) {
        int length = 0;
        while (head != null) {
            head = head.next;
            length++;
        }
        return length;
    }
}

