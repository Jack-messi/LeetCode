package com.程序员面试金典;

import java.util.HashSet;
import java.util.List;
import java.util.Set;

class ListNode {
    int val;
    ListNode next;

    ListNode(int x) {
        val = x;
    }
}

class Solution1232 {
    public static void main(String[] args) {
        // 去除字符串左侧的0值
        String str = "0000001230";
        String str1 = str.replaceAll("^(0+)", "");
        System.out.println(str1);  // 1230

        // 去除字符串右侧的0值
        String str2 = "1234500000";
        String str3 = str2.replaceAll("0*$", "");
        System.out.println(str3);  // 12345
    }



    public ListNode removeDuplicateNodes(ListNode head) {
        ListNode res = new ListNode(-1);
        res.next = head;
        ListNode temp = res;

        Set<Integer> set = new HashSet<>();
        while (temp.next != null) {
            if (set.add(temp.next.val)) {
                temp = temp.next;
            }else {
                temp.next = temp.next.next;
            }
        }
        return res.next;
    }

}
    public class 面试题0201移除重复节点 {


    }
