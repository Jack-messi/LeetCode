package com.Tencent2021年4月18日;

class ListNode {
    int val;
    ListNode next = null;
}

public class Demo1 {
    public static void main(String[] args) {

    }

    public ListNode solve(ListNode S) {
        // write code here
//        ListNode ha = new ListNode();
//        ListNode hb = new ListNode();
//
//        ha.next = S;
//        hb.next = S;
//
//        ListNode h1 = S;
//        ListNode h2 = S;
//        ListNode minh = null;
//        while (h1.next != null) {
//            h1 = h1.next;
//        }
//        while (h2.next != null) {
//            h2 = h2.next;
//        }

        ListNode h1 = S;
        int sum = 0, i = 0;
        int k=0;


        while (h1 != null) {
            sum++;
            h1 = h1.next;
        }
        int[] nums = new int[sum + 1];

        h1 = S;

        while (h1 != null) {
            nums[i++] = h1.val;
            h1 = h1.next;
        }

        for (i = 0; i < sum; i++) {
            for (int j = 0; j < sum; j++) {
                if (nums[j]<1)
                    continue;
            }
        }

        return h1;
    }
}

