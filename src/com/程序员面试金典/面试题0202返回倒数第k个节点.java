package com.程序员面试金典;

public class 面试题0202返回倒数第k个节点 {
}


//class ListNode {
//  int val;
//  ListNode next;
//  ListNode(int x) { val = x; }
//}

class Solution22 {
    public int kthToLast(ListNode head, int k) {
        ListNode temp = head;
        int count = 0;
        while (temp != null) {
            count++;
            temp = temp.next;
        }
        count = count - k + 1;
        int i = 1;
        temp = head;
        while (i < count) {
            temp = temp.next;
            i++;
        }
        return temp.val;
    }
}

class Solution3 {

    public static void main(String[] args) {
        String str = "abcabc";
        System.out.println(str.chars().distinct().count());
        boolean solution = solution(str);
        System.out.println(solution);
    }


    public static boolean solution(String str) {
        if (str == null || str.length() == 0){
            return false;
        }
        char c;
        for (int i = 0; i < str.length()-1; i++) {
            c = str.charAt(i);
            for (int j = i+1; j < str.length(); j++) {
                if (c == str.charAt(j)){
                    return false;
                }
            }
        }
        return true;
    }
}
